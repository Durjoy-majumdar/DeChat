package cr0;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.util.SparseArray;
import br0.C79778e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cr0.C86113i;
import java.lang.ref.WeakReference;
import java.util.List;
import zt3.C119157j;

/* renamed from: cr0.f */
public class C86105f implements C86097c {

    /* renamed from: j */
    public static final SparseArray<C86105f> f250601j = new SparseArray<>();

    /* renamed from: a */
    public C86119n f250602a;

    /* renamed from: b */
    public C86109d f250603b;

    /* renamed from: c */
    public C86109d f250604c;

    /* renamed from: d */
    public boolean f250605d = false;

    /* renamed from: e */
    public WeakReference<Activity> f250606e;

    /* renamed from: f */
    public ContentObserver f250607f = null;

    /* renamed from: g */
    public C79778e.C79780b f250608g = null;

    /* renamed from: h */
    public int f250609h;

    /* renamed from: i */
    public C86113i f250610i = null;

    /* renamed from: cr0.f$a */
    public class C86106a extends ContentObserver {
        public C86106a(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0042=Splitter:B:19:0x0042, B:24:0x004b=Splitter:B:24:0x004b} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChange(boolean r3) {
            /*
                r2 = this;
                super.onChange(r3)
                java.lang.String r3 = "MicroMsg.AppBrandDeviceOrientationHandler"
                java.lang.String r0 = "hy: lock orientation settings changed! request now"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                monitor-enter(r2)
                r3 = 0
                cr0.f r0 = cr0.C86105f.this     // Catch:{ all -> 0x003e }
                br0.e$b r1 = r0.f250608g     // Catch:{ all -> 0x003e }
                if (r1 == 0) goto L_0x004b
                java.lang.ref.WeakReference<android.app.Activity> r0 = r0.f250606e     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x004b
                java.lang.String r0 = "MicroMsg.AppBrandDeviceOrientationHandler"
                java.lang.String r1 = "hy: need change"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x003e }
                cr0.f r0 = cr0.C86105f.this     // Catch:{ all -> 0x003e }
                br0.e$b r1 = r0.f250608g     // Catch:{ all -> 0x003e }
                r0.getClass()     // Catch:{ all -> 0x003e }
                br0.e$b r0 = br0.C79778e.C79780b.UNSPECIFIED     // Catch:{ all -> 0x003e }
                if (r1 != r0) goto L_0x002d
                goto L_0x0042
            L_0x002d:
                br0.e$b r0 = br0.C79778e.C79780b.LANDSCAPE_SENSOR     // Catch:{ all -> 0x003e }
                boolean r1 = r1.mo109920a(r0)     // Catch:{ all -> 0x003e }
                if (r1 == 0) goto L_0x0040
                boolean r1 = cr0.C86105f.m106606f()     // Catch:{ all -> 0x003e }
                if (r1 == 0) goto L_0x0042
                br0.e$b r0 = br0.C79778e.C79780b.LANDSCAPE_LOCKED     // Catch:{ all -> 0x003e }
                goto L_0x0042
            L_0x003e:
                r0 = move-exception
                goto L_0x0051
            L_0x0040:
                br0.e$b r0 = br0.C79778e.C79780b.PORTRAIT     // Catch:{ all -> 0x003e }
            L_0x0042:
                cr0.f r1 = cr0.C86105f.this     // Catch:{ all -> 0x0056 }
                r1.f250604c = r3     // Catch:{ all -> 0x0056 }
                monitor-exit(r2)     // Catch:{ all -> 0x0056 }
                r1.mo109918b(r0, r3)
                return
            L_0x004b:
                cr0.f r0 = cr0.C86105f.this     // Catch:{ all -> 0x0056 }
                r0.f250604c = r3     // Catch:{ all -> 0x0056 }
                monitor-exit(r2)     // Catch:{ all -> 0x0056 }
                return
            L_0x0051:
                cr0.f r1 = cr0.C86105f.this     // Catch:{ all -> 0x0056 }
                r1.f250604c = r3     // Catch:{ all -> 0x0056 }
                throw r0     // Catch:{ all -> 0x0056 }
            L_0x0056:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0056 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: cr0.C86105f.C86106a.onChange(boolean):void");
        }
    }

    /* renamed from: cr0.f$b */
    public class C86107b implements C86113i.C86114a {

        /* renamed from: a */
        public final /* synthetic */ C86109d f250612a;

        /* renamed from: b */
        public final /* synthetic */ Activity f250613b;

        public C86107b(C86109d dVar, Activity activity) {
            this.f250612a = dVar;
            this.f250613b = activity;
        }
    }

    /* renamed from: cr0.f$c */
    public static class C86108c {

        /* renamed from: a */
        public C79778e.C79779a f250615a;

        /* renamed from: b */
        public C79778e.C79780b f250616b;

        /* renamed from: c */
        public boolean f250617c;

        /* renamed from: d */
        public String f250618d;

        public C86108c(C79778e.C79779a aVar, C79778e.C79780b bVar, boolean z, String str, C86106a aVar2) {
            this.f250615a = aVar;
            this.f250616b = bVar;
            this.f250617c = z;
            this.f250618d = str;
        }
    }

    /* renamed from: cr0.f$d */
    public static class C86109d {

        /* renamed from: a */
        public C79778e.C79780b f250619a;

        /* renamed from: b */
        public C79778e.C79779a f250620b;

        public C86109d(C79778e.C79780b bVar, C79778e.C79779a aVar, C86106a aVar2) {
            this.f250619a = bVar;
            this.f250620b = aVar;
        }

        public String toString() {
            return "Req{" + this.f250619a + ", " + this.f250620b + "}";
        }
    }

    public C86105f(Activity activity) {
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationHandler construct");
        this.f250609h = activity.getResources().getConfiguration().orientation;
        this.f250606e = new WeakReference<>(activity);
        boolean f = m106606f();
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        activity.setRequestedOrientation(mo120532h(this.f250609h, f).f233805d);
    }

    /* renamed from: c */
    public static C86105f m106605c(Activity activity) {
        C86105f fVar;
        SparseArray<C86105f> sparseArray = f250601j;
        synchronized (sparseArray) {
            fVar = sparseArray.get(activity.hashCode());
            if (fVar == null) {
                fVar = new C86105f(activity);
                sparseArray.put(activity.hashCode(), fVar);
            }
        }
        return fVar;
    }

    /* renamed from: f */
    public static boolean m106606f() {
        int i = Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "accelerometer_rotation", 0);
        Log.m105925i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: systenm orientation %d", Integer.valueOf(i));
        return i != 1;
    }

    /* renamed from: a */
    public C79778e.C79780b mo109917a() {
        boolean f = m106606f();
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        return mo120532h(this.f250609h, f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f5, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "dismissRequest not null");
        r11 = r2.f250620b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0100, code lost:
        if (r11 != null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0103, code lost:
        r11.mo109919g(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo109918b(br0.C79778e.C79780b r11, br0.C79778e.C79779a r12) {
        /*
            r10 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r10.f250606e
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = m106606f()
            java.lang.String r2 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r3 = "getCurrentOrientation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            int r2 = r10.f250609h
            br0.e$b r1 = r10.mo120532h(r2, r1)
            java.lang.String r2 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r3 = "requestDeviceOrientation reqOrientation = [%s], listener = [%s] currentOrientation = [%s], latestOrientation = [%s]"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r11
            r6 = 1
            r4[r6] = r12
            r7 = 2
            r4[r7] = r1
            br0.e$b r8 = r10.f250608g
            r9 = 3
            r4[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>()
            java.lang.String r3 = "No Activity found when request device orientation"
            java.lang.Object[] r4 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r4)
            if (r12 != 0) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            r12.mo109919g(r1, r5)
        L_0x0048:
            monitor-enter(r10)
            r10.f250608g = r11     // Catch:{ all -> 0x004d }
            monitor-exit(r10)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x004d }
            throw r11
        L_0x0050:
            r2 = 0
            if (r11 != 0) goto L_0x0069
            java.lang.String r11 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r0 = "requestDeviceOrientation null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            if (r12 != 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r12.mo109919g(r1, r5)
        L_0x0061:
            monitor-enter(r10)
            r10.f250608g = r2     // Catch:{ all -> 0x0066 }
            monitor-exit(r10)     // Catch:{ all -> 0x0066 }
            return
        L_0x0066:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0066 }
            throw r11
        L_0x0069:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0098
            boolean r3 = r0.isInMultiWindowMode()
            if (r3 == 0) goto L_0x0098
            java.lang.String r2 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r3 = "requestDeviceOrientation, activity[%s] isInMultiWindowMode, req[%s], callback fail"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r7 = r0.getLocalClassName()
            r4[r5] = r7
            r4[r6] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            r10.mo120529d()
            int r2 = r11.f233805d
            r0.setRequestedOrientation(r2)
            if (r12 == 0) goto L_0x0097
            if (r1 != r11) goto L_0x0094
            r5 = 1
        L_0x0094:
            r12.mo109919g(r1, r5)
        L_0x0097:
            return
        L_0x0098:
            if (r11 != r1) goto L_0x00c4
            br0.e$b r3 = r10.f250608g
            br0.e$b r4 = br0.C79778e.C79780b.UNSPECIFIED
            if (r3 == r4) goto L_0x00c4
            java.lang.String r1 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r3 = "requestDeviceOrientation currentOrientation hit. [%s]"
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r5] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)
            monitor-enter(r10)
            r10.f250603b = r2     // Catch:{ all -> 0x00c1 }
            monitor-exit(r10)     // Catch:{ all -> 0x00c1 }
            if (r12 != 0) goto L_0x00b3
            goto L_0x00b6
        L_0x00b3:
            r12.mo109919g(r11, r6)
        L_0x00b6:
            r10.f250608g = r11
            r10.mo120529d()
            int r11 = r11.f233805d
            r0.setRequestedOrientation(r11)
            return
        L_0x00c1:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00c1 }
            throw r11
        L_0x00c4:
            monitor-enter(r10)
            boolean r0 = r10.f250605d     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00d5
            java.lang.String r12 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r0 = "requestDeviceOrientation mFinished = true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x0107 }
            r10.f250608g = r11     // Catch:{ all -> 0x0107 }
            monitor-exit(r10)     // Catch:{ all -> 0x0107 }
            return
        L_0x00d5:
            cr0.f$d r0 = r10.f250603b     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x00e4
            cr0.f$d r0 = new cr0.f$d     // Catch:{ all -> 0x0107 }
            r0.<init>(r11, r12, r2)     // Catch:{ all -> 0x0107 }
            r10.f250603b = r0     // Catch:{ all -> 0x0107 }
            r10.mo120533i(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x00f2
        L_0x00e4:
            cr0.f$d r0 = r10.f250604c     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r0 = r2
        L_0x00ea:
            cr0.f$d r3 = new cr0.f$d     // Catch:{ all -> 0x0107 }
            r3.<init>(r11, r12, r2)     // Catch:{ all -> 0x0107 }
            r10.f250604c = r3     // Catch:{ all -> 0x0107 }
            r2 = r0
        L_0x00f2:
            r10.f250608g = r11     // Catch:{ all -> 0x0107 }
            monitor-exit(r10)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x0106
            java.lang.String r11 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r12 = "dismissRequest not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            br0.e$a r11 = r2.f250620b
            if (r11 != 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r11.mo109919g(r1, r5)
        L_0x0106:
            return
        L_0x0107:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0107 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.C86105f.mo109918b(br0.e$b, br0.e$a):void");
    }

    /* renamed from: d */
    public final void mo120529d() {
        C86113i iVar = this.f250610i;
        if (iVar != null) {
            iVar.getClass();
            Log.m105924i("MicroMsg.AppBrandDeviceOrientationRetrier", "cancelTickTok");
            ((C119157j) C119157j.f356862d).mo183895z(new C86112h(iVar));
            this.f250610i = null;
        }
    }

    /* renamed from: e */
    public final void mo120530e(C79778e.C79780b bVar, List<C86108c> list) {
        C86109d dVar = this.f250604c;
        if (bVar == dVar.f250619a) {
            C79778e.C79779a aVar = dVar.f250620b;
            if (aVar != null) {
                list.add(new C86108c(aVar, bVar, true, "PendingRequest.Listener orientation equal direct", (C86106a) null));
            }
            this.f250604c = null;
        } else if (this.f250606e.get() == null) {
            Log.m105920e("MicroMsg.AppBrandDeviceOrientationHandler", "No Activity when handle pending request");
            C79778e.C79779a aVar2 = this.f250604c.f250620b;
            if (aVar2 != null) {
                list.add(new C86108c(aVar2, bVar, false, "PendingRequest.Listener activity == null", (C86106a) null));
            }
        } else {
            C86109d dVar2 = this.f250604c;
            this.f250603b = dVar2;
            this.f250604c = null;
            mo120533i(dVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        r12 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        if (r12.hasNext() == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009c, code lost:
        r0 = (cr0.C86105f.C86108c) r12.next();
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandDeviceOrientationHandler", "Notify Listener[%s]", r0.f250618d);
        r3 = r0.f250615a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        if (r3 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "PendingNotify: Listener is null when execute.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r3.mo109919g(r0.f250616b, r0.f250617c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c1, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120531g(br0.C79778e.C79780b r12) {
        /*
            r11 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r11.f250606e
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            if (r12 != 0) goto L_0x0033
        L_0x000e:
            java.lang.String r3 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>()
            java.lang.String r5 = "onConfigurationChanged activity[isNull ? %b] newConfig[isNull ? %b]"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            if (r0 != 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6[r2] = r0
            if (r12 != 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6[r1] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r5, r6)
        L_0x0033:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            monitor-enter(r11)
            boolean r3 = r11.f250605d     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x0046
            java.lang.String r12 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r0 = "onConfigurationChanged Finished = true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r11)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0046:
            cr0.f$d r3 = r11.f250603b     // Catch:{ all -> 0x00c2 }
            if (r3 != 0) goto L_0x0053
            java.lang.String r12 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r0 = "No current request..., dismiss"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r11)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0053:
            java.lang.String r3 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r4 = "AppBrandDeviceOrientationConfig.onConfigurationChanged [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c2 }
            if (r12 != 0) goto L_0x005e
            java.lang.String r6 = "null"
            goto L_0x0062
        L_0x005e:
            java.lang.String r6 = r12.name()     // Catch:{ all -> 0x00c2 }
        L_0x0062:
            r5[r2] = r6     // Catch:{ all -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ all -> 0x00c2 }
            cr0.f$d r3 = r11.f250603b     // Catch:{ all -> 0x00c2 }
            br0.e$a r5 = r3.f250620b     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x0087
            cr0.f$c r10 = new cr0.f$c     // Catch:{ all -> 0x00c2 }
            if (r12 == 0) goto L_0x007b
            br0.e$b r3 = r3.f250619a     // Catch:{ all -> 0x00c2 }
            boolean r3 = r12.mo109920a(r3)     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x007b
            r7 = 1
            goto L_0x007c
        L_0x007b:
            r7 = 0
        L_0x007c:
            java.lang.String r8 = "CurrentRequest.listener result received"
            r9 = 0
            r4 = r10
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c2 }
            r0.add(r10)     // Catch:{ all -> 0x00c2 }
        L_0x0087:
            r3 = 0
            r11.f250603b = r3     // Catch:{ all -> 0x00c2 }
            cr0.f$d r3 = r11.f250604c     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x0091
            r11.mo120530e(r12, r0)     // Catch:{ all -> 0x00c2 }
        L_0x0091:
            monitor-exit(r11)     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r12 = r0.iterator()
        L_0x0096:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r12.next()
            cr0.f$c r0 = (cr0.C86105f.C86108c) r0
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = r0.f250618d
            r3[r2] = r4
            java.lang.String r4 = "MicroMsg.AppBrandDeviceOrientationHandler"
            java.lang.String r5 = "Notify Listener[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            br0.e$a r3 = r0.f250615a
            if (r3 != 0) goto L_0x00b9
            java.lang.String r0 = "PendingNotify: Listener is null when execute."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0096
        L_0x00b9:
            br0.e$b r4 = r0.f250616b
            boolean r0 = r0.f250617c
            r3.mo109919g(r4, r0)
            goto L_0x0096
        L_0x00c1:
            return
        L_0x00c2:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00c2 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.C86105f.mo120531g(br0.e$b):void");
    }

    /* renamed from: h */
    public final C79778e.C79780b mo120532h(int i, boolean z) {
        C79778e.C79780b bVar;
        if (i == 2) {
            Log.m105918d("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == landscape ");
            if (z) {
                Log.m105918d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: parseConfiguration configuration == landscape but screen locked");
                return C79778e.C79780b.LANDSCAPE_LOCKED;
            }
            synchronized (this) {
                bVar = this.f250608g;
            }
            if (bVar != null) {
                int ordinal = bVar.ordinal();
                if (ordinal == 4) {
                    return C79778e.C79780b.LANDSCAPE_LEFT;
                }
                if (ordinal == 5) {
                    return C79778e.C79780b.LANDSCAPE_RIGHT;
                }
            }
            return C79778e.C79780b.LANDSCAPE_SENSOR;
        } else if (i == 1) {
            Log.m105918d("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == portrait ");
            return C79778e.C79780b.PORTRAIT;
        } else {
            Log.m105925i("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == %d", Integer.valueOf(i));
            return null;
        }
    }

    /* renamed from: i */
    public final void mo120533i(C86109d dVar) {
        boolean z = true;
        Log.m105925i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.requestDeviceOrientationImpl setRequestOrientation [%s]", dVar);
        Activity activity = this.f250606e.get();
        if (activity == null) {
            Log.m105928w("MicroMsg.AppBrandDeviceOrientationHandler", "hy: ui already released!");
            C79778e.C79779a aVar = dVar.f250620b;
            if (aVar != null) {
                aVar.mo109919g(dVar.f250619a, false);
                return;
            }
            return;
        }
        activity.setRequestedOrientation(dVar.f250619a.f233805d);
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "current orientation=" + this.f250609h + "  request orientation=" + dVar.f250619a);
        if (this.f250609h == 2 && (dVar.f250619a.mo109920a(C79778e.C79780b.LANDSCAPE_SENSOR) || dVar.f250619a.mo109920a(C79778e.C79780b.LANDSCAPE_LEFT) || dVar.f250619a.mo109920a(C79778e.C79780b.LANDSCAPE_RIGHT))) {
            Log.m105918d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: same landscape");
        } else if (this.f250609h == 1 && dVar.f250619a.mo109920a(C79778e.C79780b.PORTRAIT)) {
            Log.m105918d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: same portrait");
        } else if (this.f250609h == 0) {
            Log.m105918d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: former is undefined, always return immediately");
        } else if (dVar.f250619a == C79778e.C79780b.UNSPECIFIED) {
            Log.m105918d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: request is UNSPECIFIED, return true");
        } else {
            z = false;
        }
        if (z) {
            mo120531g(dVar.f250619a);
            return;
        }
        if (this.f250610i == null) {
            this.f250610i = new C86113i();
        }
        C86113i iVar = this.f250610i;
        C86107b bVar = new C86107b(dVar, activity);
        iVar.getClass();
        ((C119157j) C119157j.f356862d).mo183895z(new C86110g(iVar, bVar));
    }

    public void onConfigurationChanged(Configuration configuration) {
        mo120529d();
        this.f250609h = configuration.orientation;
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged  " + this.f250609h);
        mo120531g(mo120532h(this.f250609h, m106606f()));
    }

    public void onPause() {
        if (this.f250607f != null) {
            try {
                MMApplicationContext.getContext().getContentResolver().unregisterContentObserver(this.f250607f);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", th, "unregisterContentObserver", new Object[0]);
            }
        }
    }

    public void onResume() {
        C79778e.C79780b bVar;
        synchronized (this) {
            bVar = this.f250608g;
        }
        mo109918b(bVar, (C79778e.C79779a) null);
        ContentResolver contentResolver = MMApplicationContext.getContext().getApplicationContext().getContentResolver();
        Uri uriFor = Settings.System.getUriFor("accelerometer_rotation");
        C86106a aVar = new C86106a(new Handler());
        this.f250607f = aVar;
        try {
            contentResolver.registerContentObserver(uriFor, false, aVar);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", th, "registerContentObserver [Settings.System.ACCELEROMETER_ROTATION] ", new Object[0]);
        }
    }

    public void release() {
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "release");
        SparseArray<C86105f> sparseArray = f250601j;
        synchronized (sparseArray) {
            int indexOfValue = sparseArray.indexOfValue(this);
            if (indexOfValue >= 0) {
                sparseArray.removeAt(indexOfValue);
            }
        }
        synchronized (this) {
            C86109d dVar = this.f250603b;
            if (dVar == null && this.f250604c == null) {
                Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", "Every request is executed well");
                return;
            }
            Log.m105925i("MicroMsg.AppBrandDeviceOrientationHandler", "Still has request not executed current[%s] pending[%s]", dVar, this.f250604c);
            this.f250603b = null;
            this.f250604c = null;
            this.f250605d = true;
        }
    }
}
