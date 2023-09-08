package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p1133m8.C109534a;

public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: d */
    public int f309640d = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C104484a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ View f309641d;

        /* renamed from: e */
        public final /* synthetic */ int f309642e;

        /* renamed from: f */
        public final /* synthetic */ C109534a f309643f;

        public C104484a(View view, int i, C109534a aVar) {
            this.f309641d = view;
            this.f309642e = i;
            this.f309643f = aVar;
        }

        public boolean onPreDraw() {
            this.f309641d.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f309640d == this.f309642e) {
                C109534a aVar = this.f309643f;
                expandableBehavior.mo147065w((View) aVar, this.f309641d, aVar.mo146703a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: b */
    public abstract boolean mo842b(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r3.f309640d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo133275d(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6) {
        /*
            r3 = this;
            m8.a r6 = (p1133m8.C109534a) r6
            boolean r4 = r6.mo146703a()
            r0 = 2
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L_0x0016
            int r4 = r3.f309640d
            if (r4 == 0) goto L_0x0014
            if (r4 != r0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r4 = 0
            goto L_0x001b
        L_0x0014:
            r4 = 1
            goto L_0x001b
        L_0x0016:
            int r4 = r3.f309640d
            if (r4 != r2) goto L_0x0012
            goto L_0x0014
        L_0x001b:
            if (r4 == 0) goto L_0x0032
            boolean r4 = r6.mo146703a()
            if (r4 == 0) goto L_0x0024
            r0 = 1
        L_0x0024:
            r3.f309640d = r0
            r4 = r6
            android.view.View r4 = (android.view.View) r4
            boolean r6 = r6.mo146703a()
            boolean r4 = r3.mo147065w(r4, r5, r6, r2)
            return r4
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.mo133275d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r6 = r5.f309640d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo94960f(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
        /*
            r5 = this;
            java.util.WeakHashMap<android.view.View, e3.a0> r8 = p849e3.C107207u.f320808a
            boolean r8 = p849e3.C107207u.C107211e.m145208c(r7)
            r0 = 0
            if (r8 != 0) goto L_0x005a
            java.util.List r8 = r6.mo144889l(r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r1 = r8.size()
            r2 = 0
        L_0x0014:
            if (r2 >= r1) goto L_0x0028
            java.lang.Object r3 = r8.get(r2)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r5.mo842b(r6, r7, r3)
            if (r4 == 0) goto L_0x0025
            m8.a r3 = (p1133m8.C109534a) r3
            goto L_0x0029
        L_0x0025:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0028:
            r3 = 0
        L_0x0029:
            if (r3 == 0) goto L_0x005a
            boolean r6 = r3.mo146703a()
            r8 = 2
            r1 = 1
            if (r6 == 0) goto L_0x003e
            int r6 = r5.f309640d
            if (r6 == 0) goto L_0x003c
            if (r6 != r8) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r6 = 0
            goto L_0x0043
        L_0x003c:
            r6 = 1
            goto L_0x0043
        L_0x003e:
            int r6 = r5.f309640d
            if (r6 != r1) goto L_0x003a
            goto L_0x003c
        L_0x0043:
            if (r6 == 0) goto L_0x005a
            boolean r6 = r3.mo146703a()
            if (r6 == 0) goto L_0x004c
            r8 = 1
        L_0x004c:
            r5.f309640d = r8
            android.view.ViewTreeObserver r6 = r7.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$a r1 = new com.google.android.material.transformation.ExpandableBehavior$a
            r1.<init>(r7, r8, r3)
            r6.addOnPreDrawListener(r1)
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.mo94960f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: w */
    public abstract boolean mo147065w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
