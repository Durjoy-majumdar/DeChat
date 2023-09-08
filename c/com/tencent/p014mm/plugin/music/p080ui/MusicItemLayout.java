package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.music.p080ui.C94243l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import qa2.C101083d;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.music.ui.MusicItemLayout */
public class MusicItemLayout extends LinearLayout {

    /* renamed from: d */
    public GestureDetector f201589d = new GestureDetector(getContext(), new C69868b((C69867a) null));

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicItemLayout$b */
    public class C69868b extends GestureDetector.SimpleOnGestureListener {
        public C69868b(C69867a aVar) {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (Math.abs(f2) <= Math.abs(f)) {
                return false;
            }
            C94243l.C94245b bVar = (C94243l.C94245b) MusicItemLayout.this.getTag();
            if (f2 > 0.0f) {
                bVar.mo129570a();
                return false;
            }
            bVar.mo129571b();
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C94243l.C94245b bVar = (C94243l.C94245b) MusicItemLayout.this.getTag();
            if (bVar.f272296j == 2) {
                if (motionEvent.getY() <= ((float) bVar.f272292f.getMeasuredHeight()) && motionEvent.getY() > 100.0f) {
                    C101083d.f295909b = true;
                    C115669n.INSTANCE.idkeyStat(285, 4, 1, false);
                    if (bVar.f272296j == 1) {
                        bVar.mo129570a();
                    } else {
                        bVar.mo129571b();
                    }
                }
            } else if (motionEvent.getY() >= bVar.f272295i.getY() - 100.0f && motionEvent.getY() < ((float) bVar.f272295i.getMeasuredHeight()) + bVar.f272295i.getY()) {
                C101083d.f295909b = true;
                C115669n.INSTANCE.idkeyStat(285, 4, 1, false);
                if (bVar.f272296j == 1) {
                    bVar.mo129570a();
                } else {
                    bVar.mo129571b();
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/music/ui/MusicItemLayout$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public MusicItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C94243l.C94245b bVar = (C94243l.C94245b) getTag();
        if (!(bVar.f272296j == 2)) {
            return !((bVar.f272293g.getX() > motionEvent.getX() ? 1 : (bVar.f272293g.getX() == motionEvent.getX() ? 0 : -1)) <= 0 && (motionEvent.getX() > (bVar.f272293g.getX() + ((float) bVar.f272293g.getMeasuredWidth())) ? 1 : (motionEvent.getX() == (bVar.f272293g.getX() + ((float) bVar.f272293g.getMeasuredWidth())) ? 0 : -1)) <= 0 && (bVar.f272293g.getY() > motionEvent.getY() ? 1 : (bVar.f272293g.getY() == motionEvent.getY() ? 0 : -1)) <= 0 && (motionEvent.getY() > (bVar.f272293g.getY() + ((float) bVar.f272293g.getMeasuredHeight())) ? 1 : (motionEvent.getY() == (bVar.f272293g.getY() + ((float) bVar.f272293g.getMeasuredHeight())) ? 0 : -1)) <= 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f201589d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/music/ui/MusicItemLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/music/ui/MusicItemLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public MusicItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
