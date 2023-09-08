package p212oe;

import android.content.Context;
import p933be.C113159b;

/* renamed from: oe.j$$e$$c */
public final /* synthetic */ class j$$e$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ j$$e f352173d;

    /* renamed from: e */
    public final /* synthetic */ C113159b.C113163c f352174e;

    /* renamed from: f */
    public final /* synthetic */ String f352175f;

    /* renamed from: g */
    public final /* synthetic */ Context f352176g;

    public /* synthetic */ j$$e$$c(j$$e j__e, C113159b.C113163c cVar, String str, Context context) {
        this.f352173d = j__e;
        this.f352174e = cVar;
        this.f352175f = str;
        this.f352176g = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            oe.j$$e r0 = r9.f352173d
            be.b$c r1 = r9.f352174e
            java.lang.String r2 = r9.f352175f
            android.content.Context r3 = r9.f352176g
            r0.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "currStat, charging = "
            r4.append(r5)
            boolean r5 = r1.mo165678c()
            r4.append(r5)
            java.lang.String r5 = ", fg = "
            r4.append(r5)
            boolean r5 = r1.mo165679d()
            r4.append(r5)
            java.lang.String r5 = ", screenOn = "
            r4.append(r5)
            android.content.Context r5 = r1.f338598b
            java.lang.String r6 = "power"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ Exception -> 0x003e }
            android.os.PowerManager r5 = (android.os.PowerManager) r5     // Catch:{ Exception -> 0x003e }
            if (r5 == 0) goto L_0x003e
            boolean r5 = r5.isInteractive()     // Catch:{ Exception -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Matrix.battery.LifeCycle"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.lang.String r4 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x005b
            java.lang.String r4 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0083
        L_0x005b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "currStat, devIdle = "
            r4.append(r6)
            android.content.Context r6 = r1.f338598b
            boolean r6 = p981ie.C117159b.m165219t(r6)
            r4.append(r6)
            java.lang.String r6 = ", powerSave = "
            r4.append(r6)
            android.content.Context r1 = r1.f338598b
            boolean r1 = p981ie.C117159b.m165220u(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
        L_0x0083:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r4 = r1.equals(r2)
            if (r4 == 0) goto L_0x00a2
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f352180b
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a2
            long r4 = java.lang.System.currentTimeMillis()
            r0.f352180b = r4
            p212oe.C117750b.m166051i()
        L_0x00a2:
            java.lang.String r4 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r4.equals(r2)
            if (r5 == 0) goto L_0x00d2
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r5 >= r6) goto L_0x00d2
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "batt_last_charged"
            android.content.SharedPreferences$Editor r5 = r5.putLong(r8, r6)
            r5.apply()
            android.os.Handler r5 = p212oe.C117762j.f352166d
            java.lang.Runnable r6 = r0.f352181c
            r5.removeCallbacks(r6)
            android.os.Handler r5 = p212oe.C117762j.f352166d
            java.lang.Runnable r0 = r0.f352181c
            r6 = 300000(0x493e0, double:1.482197E-318)
            r5.postDelayed(r0, r6)
        L_0x00d2:
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x00de
            boolean r0 = r4.equals(r2)
            if (r0 == 0) goto L_0x00f1
        L_0x00de:
            be.i r0 = p212oe.C117750b.m166047e()
            if (r0 != 0) goto L_0x00e5
            goto L_0x00f1
        L_0x00e5:
            ce.g r0 = r0.f338613h
            android.os.Handler r0 = r0.f339059f
            wf.b$$c r1 = new wf.b$$c
            r1.<init>(r3)
            r0.post(r1)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.j$$e$$c.run():void");
    }
}
