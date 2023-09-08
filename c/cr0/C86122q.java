package cr0;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import java.util.HashSet;
import java.util.List;
import p225rc.C89923l;

/* renamed from: cr0.q */
public class C86122q implements C86121p {

    /* renamed from: a */
    public final Activity f250637a;

    /* renamed from: b */
    public final Object f250638b = this;

    /* renamed from: c */
    public Configuration f250639c;

    /* renamed from: d */
    public boolean f250640d = false;

    /* renamed from: e */
    public final SparseArray<WindowInsets> f250641e = new SparseArray<>(4);

    /* renamed from: cr0.q$a */
    public class C86123a extends SyncTask<WindowInsets> {

        /* renamed from: a */
        public final /* synthetic */ View f250642a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86123a(C86122q qVar, long j, WindowInsets windowInsets, View view) {
            super(j, windowInsets);
            this.f250642a = view;
        }

        public Object run() {
            return this.f250642a.getRootWindowInsets();
        }
    }

    /* renamed from: cr0.q$b */
    public class C86124b implements View.OnApplyWindowInsetsListener {

        /* renamed from: d */
        public final /* synthetic */ int f250643d;

        /* renamed from: e */
        public final /* synthetic */ View f250644e;

        /* renamed from: f */
        public final /* synthetic */ C85924r4 f250645f;

        public C86124b(int i, View view, C85924r4 r4Var) {
            this.f250643d = i;
            this.f250644e = view;
            this.f250645f = r4Var;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DisplayCutout displayCutout;
            List<Rect> boundingRects;
            synchronized (C86122q.this.f250638b) {
                C86122q.this.f250641e.put(this.f250643d, this.f250644e.getRootWindowInsets());
                if (!(this.f250644e.getRootWindowInsets() == null || (displayCutout = this.f250644e.getRootWindowInsets().getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.size() <= 0)) {
                    C86122q.this.f250640d = true;
                }
            }
            C85924r4 r4Var = this.f250645f;
            synchronized (r4Var.f250288b) {
                ((HashSet) r4Var.f250288b).remove(this);
            }
            return windowInsets;
        }
    }

    public C86122q(Activity activity) {
        this.f250637a = activity;
        this.f250639c = new Configuration(activity.getResources().getConfiguration());
        Log.m105925i("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", "<init> hasCutOut[%b] activity[%s]", Boolean.valueOf(mo120543c()), activity.getLocalClassName());
    }

    /* renamed from: a */
    public void mo120541a(WindowManager.LayoutParams layoutParams) {
    }

    /* renamed from: b */
    public void mo120542b(Configuration configuration) {
        Configuration configuration2 = this.f250639c;
        boolean z = true;
        if (configuration2 != null && configuration != null && configuration2.screenWidthDp == configuration.screenWidthDp && configuration2.screenHeightDp == configuration.screenHeightDp && configuration2.smallestScreenWidthDp == configuration.smallestScreenWidthDp) {
            z = false;
        }
        if (z) {
            synchronized (this.f250638b) {
                this.f250641e.clear();
            }
        }
        this.f250639c = new Configuration(configuration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        return r10.f250640d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo120543c() {
        /*
            r10 = this;
            android.app.Activity r0 = r10.f250637a
            android.view.Window r0 = r0.getWindow()
            android.view.View r6 = r0.getDecorView()
            android.app.Activity r0 = r10.f250637a
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            java.lang.Object r7 = r10.f250638b
            monitor-enter(r7)
            android.util.SparseArray<android.view.WindowInsets> r1 = r10.f250641e     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0097 }
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1     // Catch:{ all -> 0x0097 }
            r8 = 1
            if (r1 != 0) goto L_0x007d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0040
            boolean r1 = r6.isAttachedToWindow()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0040
            android.view.WindowInsets r1 = r6.getRootWindowInsets()     // Catch:{ all -> 0x0097 }
            android.util.SparseArray<android.view.WindowInsets> r2 = r10.f250641e     // Catch:{ all -> 0x0097 }
            android.view.WindowInsets r3 = r6.getRootWindowInsets()     // Catch:{ all -> 0x0097 }
            r2.put(r0, r3)     // Catch:{ all -> 0x0097 }
            goto L_0x007d
        L_0x0040:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x006b
            boolean r1 = r6.isAttachedToWindow()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x006b
            cr0.q$a r9 = new cr0.q$a     // Catch:{ all -> 0x0097 }
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 0
            r1 = r9
            r2 = r10
            r1.<init>(r2, r3, r5, r6)     // Catch:{ all -> 0x0097 }
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler     // Catch:{ all -> 0x0097 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0097 }
            r1.<init>((android.os.Looper) r2)     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r9.exec(r1)     // Catch:{ all -> 0x0097 }
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1     // Catch:{ all -> 0x0097 }
            android.util.SparseArray<android.view.WindowInsets> r2 = r10.f250641e     // Catch:{ all -> 0x0097 }
            r2.put(r0, r1)     // Catch:{ all -> 0x0097 }
            goto L_0x007d
        L_0x006b:
            android.app.Activity r1 = r10.f250637a     // Catch:{ all -> 0x0097 }
            com.tencent.mm.ui.r4 r1 = com.tencent.p014mm.p136ui.C85924r4.m106238c(r1, r8)     // Catch:{ all -> 0x0097 }
            cr0.q$b r2 = new cr0.q$b     // Catch:{ all -> 0x0097 }
            r2.<init>(r0, r6, r1)     // Catch:{ all -> 0x0097 }
            r1.mo119830a(r2)     // Catch:{ all -> 0x0097 }
            boolean r0 = r10.f250640d     // Catch:{ all -> 0x0097 }
            monitor-exit(r7)     // Catch:{ all -> 0x0097 }
            return r0
        L_0x007d:
            if (r1 == 0) goto L_0x0093
            android.view.DisplayCutout r0 = r1.getDisplayCutout()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = r0.getBoundingRects()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0093
            int r0 = r0.size()     // Catch:{ all -> 0x0097 }
            if (r0 <= 0) goto L_0x0093
            r10.f250640d = r8     // Catch:{ all -> 0x0097 }
        L_0x0093:
            monitor-exit(r7)     // Catch:{ all -> 0x0097 }
            boolean r0 = r10.f250640d
            return r0
        L_0x0097:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0097 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.C86122q.mo120543c():boolean");
    }

    /* renamed from: d */
    public int mo120544d() {
        return C89923l.f258408a.mo117501g(this.f250637a);
    }
}
