package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import ht1.C46107h1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.a0 */
public final class C42701a0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizInfo f115638d;

    public C42701a0(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f115638d = contactWidgetTabBizInfo;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        AppBarLayout appBarLayout;
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115638d;
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = contactWidgetTabBizInfo.f115620v;
        if (!(contactWidgetTabBizHeaderController == null || (appBarLayout = contactWidgetTabBizHeaderController.f115543F) == null)) {
            appBarLayout.mo146163d(true, true, true);
        }
        Iterator it = ((ArrayList) contactWidgetTabBizInfo.f115621w).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            C46107h1 h1Var = fragment instanceof C46107h1 ? (C46107h1) fragment : null;
            if (h1Var != null) {
                h1Var.mo66873C();
            }
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$detector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
