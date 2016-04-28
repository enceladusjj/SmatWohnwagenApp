package com.example.jb.smartwohnwagenapp;

/**
 * Created by bicker on 26.04.2016.
 */

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

import java.util.ArrayList;

public class expandableListViewAdapter extends BaseExpandableListAdapter
{
    private LayoutInflater mInflater;
    private String[] mainNavItems, campaignNavItems, myAccountNavItems;

    private LayoutInflater layoutInflater;
    private ArrayList<Group> groupName=new ArrayList<Group>();
    ArrayList<ArrayList<SubGroup>> subGroupName = new ArrayList<ArrayList<SubGroup>>();
    ArrayList<Integer> subGroupCount = new ArrayList<Integer>();
    int count;
    private LayoutInflater vi;
    SubGroup singleChild = new SubGroup();


    public expandableListViewAdapter(Context context, ArrayList<Group> groupName, ArrayList<ArrayList<SubGroup>> subGroupName, ArrayList<Integer> subCategoryCount)
    {

        layoutInflater = LayoutInflater.from(context);
        this.groupName= groupName;
        this.subGroupName = subGroupName;
        this.subGroupCount = subCategoryCount;
        this.count= groupName.size();
        //vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public void onGroupCollapsed(int groupPosition)
    {
        super.onGroupCollapsed(groupPosition);
    }

    @Override
    public void onGroupExpanded(int groupPosition)
    {
        super.onGroupExpanded(groupPosition);
    }

    @Override
    public int getGroupCount()
    {
        return groupName.size();
    }

    @Override
    public int getChildrenCount(int i)
    {
        return (subGroupCount.get(i));
    }

    @Override
    public Object getGroup(int i)
    {
        return groupName.get(i).getCatName();
    }

    @Override
    public SubGroup getChild(int i, int i1)
    {
        ArrayList<SubGroup> tempList = new ArrayList<SubGroup>();
        tempList =  subGroupName.get(i);
        return tempList.get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean isExpanded, View view, ViewGroup viewGroup)
    {
        if (view == null)
        {
            Log.d("Tag315", viewGroup.toString());
            view = layoutInflater.inflate(R.layout.expandablelistcategory, viewGroup, false);
        }

        TextView textView = (TextView) view.findViewById(R.id.cat_desc_1);
        textView.setText(getGroup(i).toString());

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean isExpanded, View view, ViewGroup viewGroup)
    {
        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.expandablelistviewsubcat, viewGroup, false);

        }

        singleChild = getChild(i,i1);

        TextView childSubCategoryName = (TextView) view.findViewById(R.id.subcat_name);
        childSubCategoryName.setText(singleChild.getSubCatName());

        return view;

    }

    @Override
    public boolean isChildSelectable(int i, int i1)
    {
        return true;
    }

    @Override
    public boolean areAllItemsEnabled()
    {
        return true;
    }

}

//_______________________________________________________----------------------------------------------------------------


//public class MyExpandableListAdapter extends BaseExpandableListAdapter {
//
//    private final SparseArray<Group> groups;
//    public LayoutInflater inflater;
//    public Activity activity;
//
//    public MyExpandableListAdapter(Activity act, SparseArray<Group> groups) {
//        activity = act;
//        this.groups = groups;
//        inflater = act.getLayoutInflater();
//    }
//
//    @Override
//    public Object getChild(int groupPosition, int childPosition) {
//        return groups.get(groupPosition).children.get(childPosition);
//    }
//
//    @Override
//    public long getChildId(int groupPosition, int childPosition) {
//        return 0;
//    }
//
//    @Override
//    public View getChildView(int groupPosition, final int childPosition,
//                             boolean isLastChild, View convertView, ViewGroup parent) {
//        final String children = (String) getChild(groupPosition, childPosition);
//        TextView text = null;
//        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.content_main, null);
//        }
//        text = (TextView) convertView.findViewById(R.id.textView1);
//        text.setText(children);
//        convertView.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(activity, children,
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
//        return convertView;
//    }
//
//    @Override
//    public int getChildrenCount(int groupPosition) {
//        return groups.get(groupPosition).children.size();
//    }
//
//    @Override
//    public Object getGroup(int groupPosition) {
//        return groups.get(groupPosition);
//    }
//
//    @Override
//    public int getGroupCount() {
//        return groups.size();
//    }
//
//    @Override
//    public void onGroupCollapsed(int groupPosition) {
//        super.onGroupCollapsed(groupPosition);
//    }
//
//    @Override
//    public void onGroupExpanded(int groupPosition) {
//        super.onGroupExpanded(groupPosition);
//    }
//
//    @Override
//    public long getGroupId(int groupPosition) {
//        return 0;
//    }
//
//    @Override
//    public View getGroupView(int groupPosition, boolean isExpanded,
//                             View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.listrow_group, null);
//        }
//        Group group = (Group) getGroup(groupPosition);
//        ((CheckedTextView) convertView).setText(group.string);
//        ((CheckedTextView) convertView).setChecked(isExpanded);
//        return convertView;
//    }
//
//    @Override
//    public boolean hasStableIds() {
//        return false;
//    }
//
//    @Override
//    public boolean isChildSelectable(int groupPosition, int childPosition) {
//        return false;
//    }
//}
