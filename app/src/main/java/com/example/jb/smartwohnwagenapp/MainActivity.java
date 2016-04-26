//package com.example.jb.smartwohnwagenapp;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.support.design.widget.NavigationView;
//import android.support.v4.view.GravityCompat;
//import android.support.v4.widget.DrawerLayout;
//import android.support.v7.app.ActionBarDrawerToggle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.util.SparseArray;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.ExpandableListView;
//
////implements NavigationView.OnNavigationItemSelectedListener
//
//
//    public class MainActivity extends Activity {
//        // more efficient than HashMap for mapping integers to objects
//        SparseArray<Group> groups = new SparseArray<Group>();
//        NavigationView navigationView;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//            createData();
//            ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
//            MyExpandableListAdapter adapter = new MyExpandableListAdapter(this, groups);
//            listView.setAdapter(adapter);
//
//            navigationView = (NavigationView) findViewById(R.id.nav_view);
//            navigationView.inflateMenu(R.menu.activity_main_drawer);
//
//            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//            drawer.setDrawerListener(toggle);
//            toggle.syncState();
//
//            //NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//            //navigationView.setNavigationItemSelectedListener(this);
//        }
//
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @SuppressWarnings("StatementWithEmptyBody")
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_share) {
//            // Handle the camera action
//        } else if (id == R.id.nav_share) {
//
//            navigationView.inflateMenu(R.menu.);
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
//    public void createData() {
//
//            Group group = new Group("Heizung");
//            Group group2 = new Group("Test2");
//            Group group3 = new Group("Test3");
//            Group group4 = new Group("Test4");
//            Group group5 = new Group("Test5");
//
//            for (int i = 0; i < 5; i++) {
//                group.children.add("Sub Item" + i);
//            }
//
//            group.children.add("Übersicht");
//            group.children.add("Übersicht");
//            group2.children.add("heizun1g");
//            groups.append(0, group);
//            groups.append(1, group2);
//    }
//}
