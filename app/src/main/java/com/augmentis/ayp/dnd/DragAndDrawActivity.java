package com.augmentis.ayp.dnd;

import android.support.v4.app.Fragment;

/**
 * Created by Rawin on 30-Aug-16.
 */
public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    Fragment onCreateFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
