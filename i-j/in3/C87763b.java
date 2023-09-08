package in3;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import in3.C87771d;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: in3.b */
public class C87763b extends FrameLayout implements C87771d.C46280b {

    /* renamed from: v */
    public static final boolean f254093v = C87771d.f254121g;

    /* renamed from: d */
    public final Runnable f254094d;

    /* renamed from: e */
    public C87771d f254095e;

    /* renamed from: f */
    public Activity f254096f;

    /* renamed from: g */
    public Paint f254097g;

    /* renamed from: h */
    public volatile int f254098h;

    /* renamed from: i */
    public int f254099i;

    /* renamed from: j */
    public int f254100j;

    /* renamed from: n */
    public boolean f254101n;

    /* renamed from: o */
    public boolean f254102o;

    /* renamed from: p */
    public boolean f254103p;

    /* renamed from: q */
    public boolean f254104q;

    /* renamed from: r */
    public boolean f254105r;

    /* renamed from: s */
    public final int[] f254106s;

    /* renamed from: t */
    public int f254107t;

    /* renamed from: u */
    public C87769e f254108u;

    /* renamed from: in3.b$a */
    public class C87764a implements Runnable {
        public C87764a() {
        }

        public void run() {
            C87763b bVar = C87763b.this;
            if (bVar.f254102o) {
                C87771d dVar = bVar.f254095e;
                if (dVar != null) {
                    dVar.mo122182f(bVar);
                    C87763b.this.f254095e = null;
                }
                C87763b bVar2 = C87763b.this;
                bVar2.f254096f = null;
                bVar2.f254103p = true;
                return;
            }
            bVar.mo122167O();
        }
    }

    /* renamed from: in3.b$b */
    public class C87765b implements C87767d.C87768a {
        public C87765b() {
        }
    }

    /* renamed from: in3.b$c */
    public class C87766c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f254111d;

        public C87766c(boolean z) {
            this.f254111d = z;
        }

        public void run() {
            C87763b.this.setLayoutFrozen(this.f254111d);
        }
    }

    /* renamed from: in3.b$d */
    public static class C87767d extends MutableContextWrapper {

        /* renamed from: c */
        public static final /* synthetic */ int f254113c = 0;

        /* renamed from: a */
        public boolean f254114a = true;

        /* renamed from: b */
        public C87768a f254115b;

        /* renamed from: in3.b$d$a */
        public interface C87768a {
        }

        public C87767d(MutableContextWrapper mutableContextWrapper) {
            super(mutableContextWrapper);
        }

        public void setBaseContext(Context context) {
            if (!this.f254114a) {
                super.setBaseContext(context);
            } else if (context != getBaseContext()) {
                ((MutableContextWrapper) getBaseContext()).setBaseContext(context);
                C87768a aVar = this.f254115b;
                if (aVar != null) {
                    C87765b bVar = (C87765b) aVar;
                    bVar.getClass();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        C87763b bVar2 = C87763b.this;
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        if (C107207u.C107211e.m145207b(bVar2)) {
                            C87763b bVar3 = C87763b.this;
                            bVar3.post(bVar3.f254094d);
                            return;
                        }
                        MMHandlerThread.postToMainThread(C87763b.this.f254094d);
                        return;
                    }
                    ((C87764a) C87763b.this.f254094d).run();
                }
            }
        }
    }

    /* renamed from: in3.b$e */
    public static final class C87769e {

        /* renamed from: a */
        public final int f254116a;

        /* renamed from: b */
        public final boolean f254117b;

        /* renamed from: c */
        public final boolean f254118c;

        public C87769e(int i, boolean z, boolean z2) {
            this.f254116a = i;
            this.f254117b = z;
            this.f254118c = z2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87763b(Context context) {
        super(context instanceof MutableContextWrapper ? new C87767d((MutableContextWrapper) context) : context);
        int i = C87767d.f254113c;
        this.f254094d = new C87764a();
        this.f254099i = 0;
        this.f254100j = 0;
        this.f254101n = false;
        this.f254102o = false;
        this.f254103p = false;
        this.f254104q = false;
        this.f254105r = false;
        this.f254106s = new int[2];
        this.f254107t = 0;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo122167O();
            if (getContext() instanceof C87767d) {
                ((C87767d) getContext()).f254115b = new C87765b();
                return;
            }
            return;
        }
        throw new RuntimeException("Should be called on main-thread");
    }

    /* renamed from: G */
    public final void mo122165G(int i) {
        getLocationInWindow(this.f254106s);
        boolean z = true;
        this.f254107t = this.f254106s[1];
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.DrawStatusBarFrameLayout", "applyStatusBarHeight height[%d] mFrozen[%b] mLocationInWindow[%d.%d]", Integer.valueOf(i), Boolean.valueOf(this.f254102o), Integer.valueOf(this.f254106s[0]), Integer.valueOf(this.f254106s[1]));
        }
        this.f254098h = Math.max(0, i - this.f254106s[1]);
        if (this.f254102o) {
            this.f254104q = true;
            return;
        }
        try {
            setPadding(0, this.f254101n ? 0 : this.f254098h, 0, 0);
        } catch (IllegalStateException e) {
            Log.m105929w("MicroMsg.DrawStatusBarFrameLayout", "applyStatusBarHeight setPadding e=%s", e.getMessage());
        }
        if (isLayoutRequested()) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                z = false;
            }
            if (z) {
                invalidate();
            } else {
                postInvalidate();
            }
        }
    }

    /* renamed from: H */
    public void mo122166H(boolean z) {
        this.f254101n = z;
        mo122165G(this.f254098h);
    }

    /* renamed from: O */
    public void mo122167O() {
        this.f254108u = null;
        if (!f254093v) {
            this.f254096f = null;
            this.f254097g = null;
            return;
        }
        setPadding(0, 0, 0, 0);
        this.f254098h = 0;
        C87771d dVar = this.f254095e;
        if (dVar != null) {
            dVar.mo122182f(this);
        }
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(getContext());
        this.f254096f = castActivityOrNull;
        if (castActivityOrNull == null) {
            this.f254097g = null;
            super.setWillNotDraw(true);
            return;
        }
        C87771d b = C87771d.m109203b(castActivityOrNull);
        this.f254095e = b;
        b.mo122180d(this);
        Paint paint = new Paint(0);
        this.f254097g = paint;
        paint.setStyle(Paint.Style.FILL);
        super.setWillNotDraw(false);
    }

    /* renamed from: P */
    public void mo109971P(int i, boolean z) {
        mo122168R(i, z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 23 && !com.tencent.p014mm.sdk.vendor.MIUI.isMIUIV8()) != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c A[Catch:{ all -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085 A[ADDED_TO_REGION, Catch:{ all -> 0x00b1 }] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122168R(int r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            in3.b$e r0 = r6.f254108u
            if (r0 == 0) goto L_0x0011
            int r1 = r0.f254116a
            if (r7 != r1) goto L_0x0011
            boolean r1 = r0.f254117b
            if (r8 != r1) goto L_0x0011
            boolean r0 = r0.f254118c
            if (r9 != r0) goto L_0x0011
            return
        L_0x0011:
            int r0 = r6.f254099i     // Catch:{ all -> 0x00b1 }
            int r1 = r6.f254100j     // Catch:{ all -> 0x00b1 }
            r6.f254099i = r7     // Catch:{ all -> 0x00b1 }
            boolean r2 = f254093v     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00ab
            android.app.Activity r2 = r6.f254096f     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x0021
            goto L_0x00ab
        L_0x0021:
            android.view.Window r2 = r2.getWindow()     // Catch:{ all -> 0x00b1 }
            in3.C87773e.m109211d(r2)     // Catch:{ all -> 0x00b1 }
            r3 = 1
            r4 = 0
            if (r9 == 0) goto L_0x0033
            boolean r2 = com.tencent.p014mm.p136ui.C85864g1.m106127b(r2, r8)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0049
            goto L_0x0044
        L_0x0033:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b1 }
            r5 = 23
            if (r2 < r5) goto L_0x0041
            boolean r2 = com.tencent.p014mm.sdk.vendor.MIUI.isMIUIV8()     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x0049
        L_0x0044:
            r6.f254099i = r7     // Catch:{ all -> 0x00b1 }
            r6.f254100j = r4     // Catch:{ all -> 0x00b1 }
            goto L_0x0064
        L_0x0049:
            if (r8 == 0) goto L_0x0055
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 1061662228(0x3f47ae14, float:0.78)
            int r2 = com.tencent.p014mm.p136ui.C85864g1.m106130e(r7, r2, r5)     // Catch:{ all -> 0x00b1 }
            goto L_0x0056
        L_0x0055:
            r2 = r7
        L_0x0056:
            r6.f254099i = r2     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x0061
            r2 = 51
            int r2 = android.graphics.Color.argb(r2, r4, r4, r4)     // Catch:{ all -> 0x00b1 }
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            r6.f254100j = r2     // Catch:{ all -> 0x00b1 }
        L_0x0064:
            int r2 = r6.f254099i     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x0085
            int r5 = r6.f254100j     // Catch:{ all -> 0x00b1 }
            if (r5 != 0) goto L_0x0085
            super.setWillNotDraw(r3)     // Catch:{ all -> 0x00b1 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00b1 }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x00b1 }
            if (r0 != r1) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r3 == 0) goto L_0x0081
            r6.invalidate()     // Catch:{ all -> 0x00b1 }
            goto L_0x00a3
        L_0x0081:
            r6.postInvalidate()     // Catch:{ all -> 0x00b1 }
            goto L_0x00a3
        L_0x0085:
            if (r0 != r2) goto L_0x008b
            int r0 = r6.f254100j     // Catch:{ all -> 0x00b1 }
            if (r1 == r0) goto L_0x00a3
        L_0x008b:
            super.setWillNotDraw(r4)     // Catch:{ all -> 0x00b1 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00b1 }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x00b1 }
            if (r0 != r1) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            if (r3 == 0) goto L_0x00a0
            r6.invalidate()     // Catch:{ all -> 0x00b1 }
            goto L_0x00a3
        L_0x00a0:
            r6.postInvalidate()     // Catch:{ all -> 0x00b1 }
        L_0x00a3:
            in3.b$e r0 = new in3.b$e
            r0.<init>(r7, r8, r9)
        L_0x00a8:
            r6.f254108u = r0
            return
        L_0x00ab:
            in3.b$e r0 = new in3.b$e
            r0.<init>(r7, r8, r9)
            goto L_0x00a8
        L_0x00b1:
            r0 = move-exception
            in3.b$e r1 = new in3.b$e
            r1.<init>(r7, r8, r9)
            r6.f254108u = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in3.C87763b.mo122168R(int, boolean, boolean):void");
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        mo122165G(i);
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f254098h > 0 && f254093v && !this.f254101n && !willNotDraw()) {
            Paint paint = this.f254097g;
            if (paint == null) {
                Log.m105920e("MicroMsg.DrawStatusBarFrameLayout", "drawStatusBarBackground NULL paint");
            } else {
                paint.setColor(this.f254099i);
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) this.f254098h, this.f254097g);
            }
        }
        super.dispatchDraw(canvas);
        if (this.f254098h > 0 && f254093v && this.f254101n && !willNotDraw()) {
            Paint paint2 = this.f254097g;
            if (paint2 == null) {
                Log.m105920e("MicroMsg.DrawStatusBarFrameLayout", "drawStatusBarForeground NULL paint");
                return;
            }
            paint2.setColor(this.f254100j);
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) this.f254098h, this.f254097g);
        }
    }

    public void dispatchSystemUiVisibilityChanged(int i) {
        super.dispatchSystemUiVisibilityChanged(i);
        C87771d dVar = this.f254095e;
        if (dVar != null) {
            mo6344U3(dVar.f254129e);
        }
    }

    public int getDrawnStatusBarHeight() {
        return Math.max(0, this.f254098h);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C87771d dVar = this.f254095e;
        if (dVar != null) {
            mo6344U3(dVar.f254129e);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f254095e != null && !this.f254102o) {
            getLocationInWindow(this.f254106s);
            if (this.f254107t != this.f254106s[1]) {
                this.f254095e.mo122181e();
            }
            this.f254107t = this.f254106s[1];
        }
    }

    public void requestLayout() {
        if (this.f254102o) {
            this.f254105r = true;
        } else {
            super.requestLayout();
        }
    }

    public final void setLayoutFrozen(boolean z) {
        boolean z2 = true;
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            post(new C87766c(z));
            return;
        }
        Log.m105919d("MicroMsg.DrawStatusBarFrameLayout", "setLayoutFrozen frozen[%b], mFrozen[%b], mDeferLayout[%b], mDeferInvalidate[%b], mReInitializeDeferred[%b]", Boolean.valueOf(z), Boolean.valueOf(this.f254102o), Boolean.valueOf(this.f254105r), Boolean.valueOf(this.f254104q), Boolean.valueOf(this.f254103p));
        if (z == this.f254102o) {
            z2 = false;
        }
        this.f254102o = z;
        if (z2 && !z) {
            if (this.f254103p) {
                mo122167O();
                this.f254103p = false;
            }
            if (this.f254105r || this.f254104q) {
                mo122165G(this.f254098h);
                this.f254105r = false;
                this.f254104q = false;
            }
        }
    }

    public void setStatusBarColor(int i) {
        if (f254093v) {
            Activity activity = this.f254096f;
            mo109971P(i, activity == null ? false : C87773e.m109213g(activity.getWindow()));
        }
    }

    public final void setWillNotDraw(boolean z) {
    }

    public final boolean willNotDraw() {
        return super.willNotDraw();
    }
}
