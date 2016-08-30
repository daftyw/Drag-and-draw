package com.augmentis.ayp.dnd;

import android.graphics.PointF;

/**
 * Created by Rawin on 30-Aug-16.
 */
public class Box {
    PointF mStart;
    PointF mEnd;

    public PointF getStart() {
        return mStart;
    }

    public void setStart(PointF start) {
        mStart = start;
    }

    public PointF getEnd() {
        return mEnd;
    }

    public void setEnd(PointF end) {
        mEnd = end;
    }
}
