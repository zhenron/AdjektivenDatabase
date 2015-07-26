package com.xingke.adjektivendatabase;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.List;


public class SQLiteExampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_example);
        //Get Resources
        Resources res = getResources();
        String[] adjektiven = res.getStringArray(R.array.my_adjektiven);
        // Create our sqlite database object
        TodoItemDatabase db = new TodoItemDatabase(this);
        // Inserting todo items
        //db.addTodoItem(new TodoItem("blau"));
        //db.addTodoItem(new TodoItem("alt"));

        //Creating the database
/*
        for(int i=1; i<adjektiven.length; i++){
            db.addTodoItem(new TodoItem(adjektiven[i].toString()));
        }
*/
        int count = db.getItemCount();
//        Toast.makeText(getApplicationContext(),
//                Integer.toString(db.getItemCount()),Toast.LENGTH_SHORT).show();

//        int my_count = db.getTodoItemCount();
//        db.addTodoItem(new TodoItem(adjektiven[46].toString()));
        // Querying all todo items
        List<TodoItem> items = db.getAllTodoItems();

        // Print out properties
        for (TodoItem ti : items) {
            String log = "Id: " + ti.getId() +
                    "/" + Integer.toString(count) +
                    " , Adjektiv: " + ti.getAdjektiv();
            // Writing Todo Items to log
            //Log.d("Name: ", log);
            Toast.makeText(getApplicationContext(),
                    log, Toast.LENGTH_SHORT).show();
//            db.deleteTodoItem(ti);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sqlite_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}