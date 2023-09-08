package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.ui.i */
public class C74779i {

    /* renamed from: a */
    public Context f219895a;

    /* renamed from: b */
    public boolean f219896b;

    /* renamed from: c */
    public C74781b f219897c;

    /* renamed from: d */
    public View f219898d;

    /* renamed from: e */
    public int f219899e;

    /* renamed from: f */
    public ViewGroup.LayoutParams f219900f;

    /* renamed from: g */
    public int f219901g;

    /* renamed from: h */
    public int f219902h;

    /* renamed from: i */
    public ViewTreeObserver.OnGlobalLayoutListener f219903i = new C74780a();

    /* renamed from: com.tencent.mm.ui.i$a */
    public class C74780a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C74780a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onGlobalLayout() {
            /*
                r9 = this;
                com.tencent.mm.ui.i r0 = com.tencent.p014mm.p136ui.C74779i.this
                r0.getClass()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                android.view.View r2 = r0.f219898d
                r2.getWindowVisibleDisplayFrame(r1)
                boolean r2 = r0.f219896b
                if (r2 == 0) goto L_0x0019
                int r2 = r1.bottom
                int r1 = r1.top
                int r2 = r2 - r1
                goto L_0x001b
            L_0x0019:
                int r2 = r1.bottom
            L_0x001b:
                int r1 = r0.f219899e
                if (r2 == r1) goto L_0x00be
                android.view.View r1 = r0.f219898d
                android.view.View r1 = r1.getRootView()
                int r1 = r1.getHeight()
                int r3 = r1 - r2
                android.content.Context r4 = r0.f219895a
                boolean r4 = com.tencent.p014mm.p136ui.C75054z4.m90005c(r4)
                r5 = 0
                if (r4 == 0) goto L_0x003b
                android.content.Context r4 = r0.f219895a
                int r4 = com.tencent.p014mm.p136ui.C75054z4.m90004b(r4)
                goto L_0x003c
            L_0x003b:
                r4 = 0
            L_0x003c:
                java.lang.String r6 = android.os.Build.BRAND
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                r8 = 1
                if (r7 != 0) goto L_0x0061
                java.lang.String r6 = r6.toLowerCase()
                java.lang.String r7 = "huawei"
                boolean r7 = r6.contains(r7)
                if (r7 != 0) goto L_0x0059
                java.lang.String r7 = "honor"
                boolean r6 = r6.contains(r7)
                if (r6 == 0) goto L_0x0061
            L_0x0059:
                int r6 = android.os.Build.VERSION.SDK_INT
                r7 = 24
                if (r6 != r7) goto L_0x0061
                r6 = 1
                goto L_0x0062
            L_0x0061:
                r6 = 0
            L_0x0062:
                if (r6 == 0) goto L_0x0097
                int r6 = r1 / 4
                if (r3 <= r6) goto L_0x0083
                android.view.ViewGroup$LayoutParams r4 = r0.f219900f
                int r1 = r1 - r3
                float r3 = (float) r2
                int r5 = r0.f219902h
                float r5 = (float) r5
                float r3 = r3 / r5
                int r5 = r0.f219901g
                float r5 = (float) r5
                float r3 = r3 * r5
                int r3 = (int) r3
                int r1 = r1 + r3
                r4.height = r1
                com.tencent.mm.ui.i$b r1 = r0.f219897c
                if (r1 == 0) goto L_0x00b7
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$q r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.C95437q) r1
                r1.mo132562a(r8)
                goto L_0x00b7
            L_0x0083:
                android.view.ViewGroup$LayoutParams r3 = r0.f219900f
                int r1 = r1 - r4
                r3.height = r1
                r0.f219902h = r2
                int r1 = r1 - r2
                r0.f219901g = r1
                com.tencent.mm.ui.i$b r1 = r0.f219897c
                if (r1 == 0) goto L_0x00b7
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$q r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.C95437q) r1
                r1.mo132562a(r5)
                goto L_0x00b7
            L_0x0097:
                int r4 = r1 / 4
                if (r3 <= r4) goto L_0x00aa
                android.view.ViewGroup$LayoutParams r4 = r0.f219900f
                int r1 = r1 - r3
                r4.height = r1
                com.tencent.mm.ui.i$b r1 = r0.f219897c
                if (r1 == 0) goto L_0x00b7
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$q r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.C95437q) r1
                r1.mo132562a(r8)
                goto L_0x00b7
            L_0x00aa:
                android.view.ViewGroup$LayoutParams r1 = r0.f219900f
                r1.height = r2
                com.tencent.mm.ui.i$b r1 = r0.f219897c
                if (r1 == 0) goto L_0x00b7
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$q r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.C95437q) r1
                r1.mo132562a(r5)
            L_0x00b7:
                android.view.View r1 = r0.f219898d
                r1.requestLayout()
                r0.f219899e = r2
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C74779i.C74780a.onGlobalLayout():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.i$b */
    public interface C74781b {
    }

    public C74779i(Activity activity, boolean z) {
        this.f219895a = activity;
        this.f219896b = z;
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
        if (frameLayout != null) {
            View childAt = frameLayout.getChildAt(0);
            this.f219898d = childAt;
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(this.f219903i);
            this.f219900f = this.f219898d.getLayoutParams();
        }
    }

    /* renamed from: a */
    public static void m89536a(Activity activity, boolean z) {
        new C74779i(activity, z);
    }

    public C74779i(Activity activity, boolean z, View view, C74781b bVar) {
        this.f219895a = activity;
        this.f219896b = z;
        this.f219898d = view;
        this.f219897c = bVar;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f219903i);
        this.f219900f = this.f219898d.getLayoutParams();
    }
}
