package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import p206nj.C11171e;
import p206nj.C76866m;

/* renamed from: com.tencent.mm.ui.tools.KeyboardHeightProvider */
public class KeyboardHeightProvider extends C74851q0 {

    /* renamed from: p */
    public static int f220014p = 1;

    /* renamed from: b */
    public C7020t0 f220015b;

    /* renamed from: c */
    public View f220016c;

    /* renamed from: d */
    public Rect f220017d = new Rect();

    /* renamed from: e */
    public Rect f220018e = new Rect();

    /* renamed from: f */
    public View f220019f;

    /* renamed from: g */
    public Activity f220020g;

    /* renamed from: h */
    public ViewTreeObserver.OnGlobalLayoutListener f220021h;

    /* renamed from: i */
    public ViewTreeObserver.OnGlobalLayoutListener f220022i;

    /* renamed from: j */
    public boolean f220023j = false;

    /* renamed from: k */
    public boolean f220024k = true;

    /* renamed from: l */
    public int f220025l;

    /* renamed from: m */
    public int f220026m;

    /* renamed from: n */
    public int f220027n;

    /* renamed from: o */
    public int f220028o;

    /* renamed from: com.tencent.mm.ui.tools.KeyboardHeightProvider$a */
    public class C74837a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C74837a() {
        }

        public void onGlobalLayout() {
            KeyboardHeightProvider keyboardHeightProvider = KeyboardHeightProvider.this;
            if (keyboardHeightProvider.f220016c != null) {
                KeyboardHeightProvider.m89575c(keyboardHeightProvider);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.KeyboardHeightProvider$b */
    public class C74838b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C74838b() {
        }

        public void onGlobalLayout() {
            KeyboardHeightProvider keyboardHeightProvider = KeyboardHeightProvider.this;
            if (keyboardHeightProvider.f220016c != null) {
                Rect rect = keyboardHeightProvider.f220018e;
                int i = rect.bottom;
                keyboardHeightProvider.f220019f.getWindowVisibleDisplayFrame(rect);
                if (KeyboardHeightProvider.this.f220018e.bottom != i) {
                    Log.m105925i("MicroMsg.KeyboardHeightProvider", "onGlobalLayout: %s, %s", Integer.valueOf(i), KeyboardHeightProvider.this.f220018e.toShortString());
                    KeyboardHeightProvider.m89575c(KeyboardHeightProvider.this);
                }
            }
        }
    }

    public KeyboardHeightProvider(Activity activity) {
        this.f220020g = activity;
        this.f220081a = activity;
        Log.m105925i("MicroMsg.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        if (activity instanceof MMFragmentActivity) {
            ((MMFragmentActivity) activity).getLifecycle().addObserver(new C0124r() {
                @C112974b0(C39623j.C39625b.ON_DESTROY)
                public void onDestroy() {
                    Log.m105924i("MicroMsg.KeyboardHeightProvider", "onDestroy: addObserver ");
                    KeyboardHeightProvider.this.mo104021d();
                    KeyboardHeightProvider.this.f220020g = null;
                }
            });
        } else {
            Log.m105929w("MicroMsg.KeyboardHeightProvider", "KeyboardHeightProvider: activity is not MMFragmentActivity:%s", activity);
            if (BuildInfo.DEBUG) {
                throw new RuntimeException("KeyboardHeightProvider only support MMFragmentActivity");
            }
        }
        if ((activity.getWindow().getAttributes().softInputMode & 240) != 48) {
            Log.m105928w("MicroMsg.KeyboardHeightProvider", "activity soft input should be adjust nothing");
            this.f220024k = false;
        }
        this.f220019f = activity.findViewById(16908290);
        this.f220021h = new C74837a();
        this.f220022i = new C74838b();
        int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID);
        if (identifier > 0) {
            this.f220027n = Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f220028o = C76577a.m92151b(activity, 96);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m89575c(com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider r10) {
        /*
            android.view.View r0 = r10.f220016c
            android.graphics.Rect r1 = r10.f220017d
            r0.getWindowVisibleDisplayFrame(r1)
            android.view.View r0 = r10.f220019f
            android.graphics.Rect r1 = r10.f220018e
            r0.getWindowVisibleDisplayFrame(r1)
            android.graphics.Rect r0 = r10.f220017d
            int r0 = r0.bottom
            int r1 = r10.f220025l
            if (r0 <= r1) goto L_0x0018
            r10.f220025l = r0
        L_0x0018:
            android.graphics.Rect r1 = r10.f220018e
            int r1 = r1.bottom
            int r2 = r10.f220026m
            if (r1 <= r2) goto L_0x0022
            r10.f220026m = r1
        L_0x0022:
            int r2 = r10.f220026m
            int r3 = r10.f220025l
            int r2 = r2 - r3
            boolean r4 = r10.f220024k
            r5 = 2
            java.lang.String r6 = "MicroMsg.KeyboardHeightProvider"
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x00e1
            int r1 = r1 - r0
            r0 = 28
            boolean r0 = p206nj.C11171e.m11046c(r0)
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r10.f220019f
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r10.f220019f
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            if (r0 == 0) goto L_0x0061
            int r0 = r0.getSafeInsetBottom()
            if (r0 != r1) goto L_0x0061
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3[r7] = r4
            java.lang.String r4 = "handleOnGlobalLayout: has cutout bottom, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
            int r1 = r1 - r0
        L_0x0061:
            int r0 = r10.f220027n
            r3 = 3
            r4 = 1062(0x426, float:1.488E-42)
            if (r1 != r0) goto L_0x0092
            if (r0 == 0) goto L_0x0092
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r9 = r10.f220025l
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r7] = r9
            int r9 = r10.f220026m
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r8] = r9
            int r9 = r10.f220027n
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r5] = r9
            java.lang.String r9 = "handleOnGlobalLayout: navigationHeight %d, %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r0)
            int r0 = r10.f220027n
            int r1 = r1 - r0
            kj2.d r0 = kj2.C117407d.INSTANCE
            r9 = 5
            r0.mo182088q(r4, r9)
        L_0x0092:
            if (r1 != r2) goto L_0x00be
            if (r2 <= 0) goto L_0x00be
            int r0 = r10.f220028o
            if (r2 >= r0) goto L_0x00be
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r3 = r10.f220025l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r7] = r3
            int r3 = r10.f220026m
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r8] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0[r5] = r3
            java.lang.String r3 = "handleOnGlobalLayout: max bottom diff %d, %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r0)
            int r1 = r1 - r2
            kj2.d r0 = kj2.C117407d.INSTANCE
            r2 = 6
            r0.mo182088q(r4, r2)
        L_0x00be:
            if (r1 != 0) goto L_0x00df
            int r0 = r10.f220026m
            android.graphics.Rect r2 = r10.f220018e
            int r2 = r2.bottom
            int r0 = r0 - r2
            int r2 = r10.f220028o
            if (r0 <= r2) goto L_0x00df
            java.lang.String r0 = "handleOnGlobalLayout: adjust nothing not work!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            int r0 = r10.f220026m
            android.graphics.Rect r1 = r10.f220018e
            int r1 = r1.bottom
            int r0 = r0 - r1
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 7
            r1.mo182088q(r4, r2)
            r1 = r0
            goto L_0x00e3
        L_0x00df:
            r0 = 0
            goto L_0x00e4
        L_0x00e1:
            int r3 = r3 - r0
            r1 = r3
        L_0x00e3:
            r0 = 1
        L_0x00e4:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            android.graphics.Rect r3 = r10.f220017d
            java.lang.String r3 = r3.toShortString()
            r2[r7] = r3
            android.graphics.Rect r3 = r10.f220018e
            java.lang.String r3 = r3.toShortString()
            r2[r8] = r3
            java.lang.String r3 = "handleOnGlobalLayout: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r2)
            com.tencent.mm.ui.tools.t0 r10 = r10.f220015b
            if (r10 == 0) goto L_0x0102
            r10.mo531Q1(r1, r0)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider.m89575c(com.tencent.mm.ui.tools.KeyboardHeightProvider):void");
    }

    /* renamed from: b */
    public void mo104020b(int i, boolean z) {
        boolean z2 = !this.f220024k;
        C7020t0 t0Var = this.f220015b;
        if (t0Var != null) {
            t0Var.mo531Q1(i, z2);
        }
    }

    /* renamed from: d */
    public void mo104021d() {
        View view;
        Log.m105924i("MicroMsg.KeyboardHeightProvider", "close: ");
        if (this.f220020g == null) {
            Log.m105928w("MicroMsg.KeyboardHeightProvider", "close: activity is null");
            return;
        }
        int i = f220014p;
        int i2 = 31;
        if (i != 1 && i == 0) {
            i2 = 30;
        }
        Log.m105925i("MicroMsg.KeyboardHeightProvider", "close: version:%s", Integer.valueOf(i2));
        if (!C11171e.m11046c(i2)) {
            this.f220019f.getViewTreeObserver().removeOnGlobalLayoutListener(this.f220022i);
            if (this.f220023j && (view = this.f220016c) != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f220021h);
                try {
                    this.f220020g.getWindowManager().removeView(this.f220016c);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e, "", new Object[0]);
                }
                this.f220016c = null;
            }
            this.f220023j = false;
        } else if (C11171e.m11046c(30)) {
            C74854r0.f220091a.mo104081b(this);
        }
    }

    /* renamed from: e */
    public void mo104022e() {
        Activity activity = this.f220020g;
        if (activity == null) {
            Log.m105928w("MicroMsg.KeyboardHeightProvider", "start: activity is null");
            return;
        }
        if ((activity.getWindow().getAttributes().softInputMode & 240) != 48) {
            Log.m105928w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
            this.f220024k = false;
        } else {
            this.f220024k = true;
        }
        int i = f220014p;
        int i2 = 31;
        if (i != 1 && i == 0) {
            i2 = 30;
        }
        Log.m105925i("MicroMsg.KeyboardHeightProvider", "start: version:%s", Integer.valueOf(i2));
        if (C11171e.m11046c(i2)) {
            if (C11171e.m11046c(30)) {
                Boolean bool = Boolean.FALSE;
                if (C76866m.m92676e()) {
                    bool = Boolean.TRUE;
                }
                C74854r0.f220091a.mo104080a(this, this.f220020g, bool.booleanValue());
            }
        } else if (this.f220019f != null) {
            Log.m105925i("MicroMsg.KeyboardHeightProvider", "start: %s, %s", Boolean.valueOf(this.f220023j), this.f220019f.getWindowToken());
            if (!this.f220023j && this.f220019f.getWindowToken() != null && !this.f220020g.isFinishing()) {
                this.f220023j = true;
                LinearLayout linearLayout = new LinearLayout(this.f220020g);
                this.f220016c = linearLayout;
                linearLayout.setBackgroundColor(0);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1003, 131096, 1);
                layoutParams.width = 0;
                layoutParams.height = -1;
                layoutParams.gravity = 8388659;
                layoutParams.softInputMode = 16;
                layoutParams.setTitle("KeyboardWindow@" + hashCode());
                try {
                    this.f220020g.getWindowManager().addView(this.f220016c, layoutParams);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e, "", new Object[0]);
                    this.f220023j = false;
                    this.f220016c = null;
                }
                if (this.f220023j) {
                    this.f220016c.getViewTreeObserver().addOnGlobalLayoutListener(this.f220021h);
                    this.f220019f.getViewTreeObserver().addOnGlobalLayoutListener(this.f220022i);
                }
                this.f220025l = 0;
                this.f220026m = 0;
                if ((this.f220020g.getWindow().getAttributes().softInputMode & 240) != 48) {
                    Log.m105928w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
                    this.f220024k = false;
                    return;
                }
                this.f220024k = true;
            }
        }
    }
}
