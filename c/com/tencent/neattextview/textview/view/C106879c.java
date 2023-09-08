package com.tencent.neattextview.textview.view;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import xr3.C112173c;
import yr3.C79150a;

/* renamed from: com.tencent.neattextview.textview.view.c */
public class C106879c implements View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: d */
    public GestureDetector f320036d;

    /* renamed from: e */
    public C106877a f320037e;

    /* renamed from: f */
    public C79150a f320038f;

    /* renamed from: g */
    public C112173c f320039g;

    /* renamed from: h */
    public View f320040h;

    public C106879c(Context context, C106877a aVar, Handler handler) {
        this.f320037e = aVar;
        GestureDetector gestureDetector = new GestureDetector(context, this, handler);
        this.f320036d = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
    }

    /* renamed from: a */
    public void mo155026a(int i) {
        C112173c cVar = this.f320039g;
        if (cVar != null) {
            cVar.f335875h = false;
            this.f320040h.invalidate();
            this.f320039g = null;
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f320037e.getOnDoubleClickListener() == null) {
            return false;
        }
        this.f320037e.getOnDoubleClickListener().mo103047b(this.f320040h, motionEvent);
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        boolean z;
        if (((NeatTextView) this.f320037e).f320006e || this.f320038f.mo109130n0() == null) {
            return false;
        }
        for (C112173c next : this.f320038f.mo109130n0()) {
            float x = motionEvent.getX() - this.f320037e.getHorizontalOffset();
            float y = motionEvent.getY() - this.f320037e.getVerticalOffset();
            LinkedList<RectF> linkedList = next.f335871d;
            if (linkedList != null) {
                Iterator<RectF> it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().contains(x, y)) {
                            z = true;
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            continue;
            if (z) {
                this.f320039g = next;
                next.f335875h = true;
                this.f320040h.postInvalidate();
                return true;
            }
        }
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        mo155026a(3);
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        mo155026a(1);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C112173c cVar;
        if (((NeatTextView) this.f320037e).f320006e || (cVar = this.f320039g) == null) {
            return false;
        }
        cVar.onClick(this.f320040h);
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f320037e.getLayout() == null) {
            return false;
        }
        this.f320038f = this.f320037e.getLayout();
        this.f320040h = view;
        GestureDetector gestureDetector = this.f320036d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/neattextview/textview/view/NeatViewTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/neattextview/textview/view/NeatViewTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            mo155026a(2);
        }
        return onTouchEvent;
    }
}
