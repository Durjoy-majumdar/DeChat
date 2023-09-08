package com.tencent.p014mm.plugin.gallery.picker.behavior;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.picker.view.TouchCoordinatorLayout;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import kw1.C76639a;

/* renamed from: com.tencent.mm.plugin.gallery.picker.behavior.AppBarLayoutBehavior */
public class AppBarLayoutBehavior extends AppBarLayout.Behavior implements View.OnTouchListener {

    /* renamed from: A */
    public int f198255A = ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3755d6));

    /* renamed from: B */
    public Rect f198256B = new Rect();

    /* renamed from: C */
    public boolean f198257C = true;

    /* renamed from: D */
    public boolean f198258D = false;

    /* renamed from: E */
    public boolean f198259E = false;

    /* renamed from: x */
    public boolean f198260x = false;

    /* renamed from: y */
    public AppBarLayout f198261y;

    /* renamed from: z */
    public View f198262z;

    public AppBarLayoutBehavior() {
        this.f309061w = new C76639a(this);
    }

    /* renamed from: H */
    public boolean mo94957H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.f198261y = appBarLayout;
        this.f198262z = appBarLayout.findViewById(C0966R.C0970id.ebz);
        if (coordinatorLayout instanceof TouchCoordinatorLayout) {
            ((TouchCoordinatorLayout) coordinatorLayout).setTouchListener(this);
        }
        super.mo94960f(coordinatorLayout, appBarLayout, i);
        return true;
    }

    /* renamed from: I */
    public void mo94961k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if ((i3 != 1 || !this.f198258D) && this.f198260x) {
            super.mo94961k(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
            if (this.f198257C) {
                if (iArr[1] == 0) {
                    super.mo78308m(coordinatorLayout, appBarLayout, view, 0, 0, 0, i2, i3);
                }
                iArr[1] = i2;
            }
        }
    }

    /* renamed from: J */
    public void mo94855J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 != 1 || !this.f198258D) && this.f198260x) {
            super.mo78308m(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }

    /* renamed from: K */
    public boolean mo94959K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        super.mo5059s(coordinatorLayout, appBarLayout, view, view2, i, i2);
        return true;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ boolean mo94960f(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo94957H(coordinatorLayout, (AppBarLayout) view, i);
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/picker/behavior/AppBarLayoutBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f198260x = false;
            this.f198259E = false;
            this.f198257C = Math.abs(mo146259w()) <= 0;
            this.f198258D = this.f198261y.getTotalScrollRange() == Math.abs(mo146259w());
            if (this.f198257C) {
                this.f198262z.getGlobalVisibleRect(this.f198256B);
                if (this.f198256B.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.f198260x = true;
                    this.f198259E = true;
                }
            }
        }
        if (this.f198258D) {
            this.f198260x = true;
        }
        if (!this.f198260x) {
            this.f198261y.getGlobalVisibleRect(this.f198256B);
            Rect rect = this.f198256B;
            rect.bottom -= this.f198255A;
            if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f198260x = true;
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/gallery/picker/behavior/AppBarLayoutBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* renamed from: s */
    public boolean mo5059s(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        super.mo5059s(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
        return true;
    }

    public AppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f309061w = new C76639a(this);
    }
}
