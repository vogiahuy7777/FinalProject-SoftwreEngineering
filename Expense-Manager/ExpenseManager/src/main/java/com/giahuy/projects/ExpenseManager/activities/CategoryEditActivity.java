package com.giahuy.projects.ExpenseManager.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.giahuy.projects.ExpenseManager.fragments.CategoryEditFragment;

public class CategoryEditActivity extends com.giahuy.projects.ExpenseManager.activities.BaseFragmentActivity {

    /* Important: use onCreate(Bundle savedInstanceState)
     * instead of onCreate(Bundle savedInstanceState, PersistableBundle persistentState) */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        insertFragment(new CategoryEditFragment());
        setupActionBar();
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar (toolbar).
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
