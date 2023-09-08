package com.tencent.kinda.framework.widget.tools;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

public class KindaTouchDelegate extends TouchDelegate {
    private boolean delegateTargeted;
    private ArrayList<DelegateInfo> delegates;
    private int slop;
    private DelegateInfo targetInfo = null;

    public class DelegateInfo {
        public Rect bounds;
        public Rect slopBounds;
        public View view;

        public DelegateInfo() {
        }
    }

    public KindaTouchDelegate(Rect rect, View view) {
        super(rect, view);
        ArrayList<DelegateInfo> arrayList = new ArrayList<>();
        this.delegates = arrayList;
        arrayList.clear();
        this.slop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        addDelegate(rect, view);
    }

    public void addDelegate(Rect rect, View view) {
        DelegateInfo delegateInfo = new DelegateInfo();
        delegateInfo.view = view;
        delegateInfo.bounds = rect;
        Rect rect2 = new Rect(rect);
        delegateInfo.slopBounds = rect2;
        int i = this.slop;
        rect2.inset(-i, -i);
        for (int i2 = 0; i2 < this.delegates.size(); i2++) {
            if (this.delegates.get(i2).view == delegateInfo.view) {
                this.delegates.set(i2, delegateInfo);
                return;
            }
        }
        this.delegates.add(0, delegateInfo);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        DelegateInfo delegateInfo;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 0) {
            if (!(actionMasked == 1 || actionMasked == 2)) {
                if (actionMasked == 3) {
                    z = this.delegateTargeted;
                    this.delegateTargeted = false;
                    this.targetInfo = null;
                } else if (!(actionMasked == 5 || actionMasked == 6)) {
                    z = false;
                }
            }
            boolean z3 = this.delegateTargeted;
            if (z3) {
                DelegateInfo delegateInfo2 = this.targetInfo;
                if (delegateInfo2 == null) {
                    return false;
                }
                z2 = delegateInfo2.slopBounds.contains(x, y);
            }
            z = z3;
        } else {
            this.delegateTargeted = false;
            this.targetInfo = null;
            Iterator<DelegateInfo> it = this.delegates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DelegateInfo next = it.next();
                if (next.bounds.contains(x, y)) {
                    this.targetInfo = next;
                    this.delegateTargeted = true;
                    break;
                }
            }
            z = this.delegateTargeted;
        }
        if (!z || (delegateInfo = this.targetInfo) == null) {
            return false;
        }
        if (z2) {
            motionEvent.setLocation((float) (delegateInfo.view.getWidth() / 2), (float) (this.targetInfo.view.getHeight() / 2));
        } else {
            int i = this.slop;
            motionEvent.setLocation((float) (-(i * 2)), (float) (-(i * 2)));
        }
        return this.targetInfo.view.dispatchTouchEvent(motionEvent);
    }
}
