package com.tencent.p014mm.plugin.sport.model;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C85796t4;
import eb0.C31543z5;
import f40.C86709a0;
import tv2.C78112d;

/* renamed from: com.tencent.mm.plugin.sport.model.a */
public class C115758a {

    /* renamed from: a */
    public C115765d f347311a;

    /* renamed from: b */
    public IMvvmObserver<Integer> f347312b = new C115759a();

    /* renamed from: c */
    public C43165f f347313c;

    /* renamed from: d */
    public long f347314d;

    /* renamed from: e */
    public long f347315e;

    /* renamed from: com.tencent.mm.plugin.sport.model.a$a */
    public class C115759a implements IMvvmObserver<Integer> {
        public C115759a() {
        }

        public void onChanged(Object obj) {
            boolean d;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2 || intValue == 3) {
                C115769k.m162825d();
                C115758a.this.getClass();
                if (C115778q.m162832a(MMApplicationContext.getContext()) && C115778q.m162836e()) {
                    C115758a.this.mo176115b();
                    long a = C115758a.this.mo176114a();
                    if (num.intValue() == 1) {
                        d = C115758a.this.mo176117d(a);
                    } else {
                        C115758a aVar = C115758a.this;
                        if (aVar.f347314d == 0) {
                            aVar.f347314d = C115775n.f347342a.mo176128a("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", 0);
                        }
                        d = C115778q.m162834c(aVar.f347314d, a) ? C115758a.this.mo176117d(a) : false;
                    }
                    Log.m105925i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d %b", num, Long.valueOf(a), Boolean.valueOf(d));
                }
            } else if (intValue == 4 || intValue == 5) {
                C115769k.m162825d();
                C115758a.this.getClass();
                if (C115778q.m162832a(MMApplicationContext.getContext()) && C115778q.m162836e()) {
                    C115758a.this.mo176115b();
                    long a2 = C115758a.this.mo176114a();
                    C115758a aVar2 = C115758a.this;
                    if (aVar2.f347315e == 0) {
                        aVar2.f347315e = C115775n.f347342a.mo176128a("KEY_LAST_UPLOAD_DEVICE_STEP_TIME_LONG", 0);
                    }
                    boolean d2 = C115778q.m162835d(aVar2.f347315e, C31543z5.m39453c());
                    C115758a aVar3 = C115758a.this;
                    if (aVar3.f347314d == 0) {
                        aVar3.f347314d = C115775n.f347342a.mo176128a("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", 0);
                    }
                    boolean c = C115778q.m162834c(aVar3.f347314d, a2);
                    Log.m105925i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d result %b timeCondition %b stepCountCondition %b", num, Long.valueOf(a2), Boolean.valueOf((c || d2) ? C115758a.this.mo176117d(a2) : false), Boolean.valueOf(d2), Boolean.valueOf(c));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.model.a$b */
    public class C115760b implements C1256g<Bundle> {
        public C115760b(C115758a aVar) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            Log.m105924i("MicroMsg.Sport.DeviceStepManager", "MMUpdateConfigTask callback");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.model.a$c */
    public class C115761c implements C1256g<Bundle> {
        public C115761c(C115758a aVar) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            Log.m105924i("MicroMsg.Sport.DeviceStepManager", "MMRefreshStepTask callback");
        }
    }

    public C115758a() {
        ((C78112d) MvvmEventCenter.getEvent(C78112d.class)).observe(C86709a0.m107523b().f251755f, "UploadSportStepEventHandle", this.f347312b);
        this.f347311a = new C115765d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        if (r8 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dd, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Sport.SportUtil", "getMIUIStep %d", java.lang.Integer.valueOf(r9));
        r8 = (long) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ed, code lost:
        if (r8 <= r1) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ef, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Sport.DeviceStepManager", "getTodayStep MIUI Step %d %d", java.lang.Long.valueOf(r8), java.lang.Long.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        return r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo176114a() {
        /*
            r19 = this;
            long r0 = com.tencent.p014mm.plugin.sport.model.C115778q.m162838g()
            com.tencent.mm.plugin.sport.model.n r2 = com.tencent.p014mm.plugin.sport.model.C115775n.f347342a
            com.tencent.mm.plugin.sport.model.n$a r2 = r2.mo176129b()
            long r3 = r2.f347344a
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0015
            long r0 = r2.f347349f
            java.lang.String r2 = "mmkv"
            goto L_0x0019
        L_0x0015:
            r0 = -1
            java.lang.String r2 = "unknown"
        L_0x0019:
            r17 = r0
            r0 = r2
            r1 = r17
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r6 = 1
            r4[r6] = r0
            java.lang.String r7 = "MicroMsg.Sport.DeviceStepManager"
            java.lang.String r0 = "get today step from %s todayStep %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)
            boolean r0 = com.tencent.p014mm.sdk.vendor.MIUI.ifMIUI()
            if (r0 == 0) goto L_0x0109
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0047 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0047 }
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_weixin_sport_brand_api_flag     // Catch:{ Exception -> 0x0047 }
            boolean r0 = r0.mo58784wf(r4, r6)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            r0 = 1
        L_0x0049:
            if (r0 == 0) goto L_0x0109
            java.lang.String r4 = "MicroMsg.Sport.SportUtil"
            r8 = 0
            boolean r0 = com.tencent.p014mm.sdk.vendor.MIUI.ifMIUI()     // Catch:{ Exception -> 0x00cf }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "support_steps_provider"
            java.lang.String r9 = "miui.util.FeatureParser"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ Exception -> 0x00cf }
            java.lang.Object r10 = r9.newInstance()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r11 = "getBoolean"
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00cf }
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r12[r5] = r13     // Catch:{ Exception -> 0x00cf }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x00cf }
            r12[r6] = r13     // Catch:{ Exception -> 0x00cf }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x00cf }
            r9.setAccessible(r6)     // Catch:{ Exception -> 0x00cf }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00cf }
            r11[r5] = r0     // Catch:{ Exception -> 0x00cf }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00cf }
            r11[r6] = r0     // Catch:{ Exception -> 0x00cf }
            java.lang.Object r0 = r9.invoke(r10, r11)     // Catch:{ Exception -> 0x00cf }
            boolean r9 = r0 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x00cf }
            if (r9 == 0) goto L_0x00c9
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x00cf }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x00cf }
            if (r0 == 0) goto L_0x00c9
            long r9 = com.tencent.p014mm.plugin.sport.model.C115778q.m162838g()     // Catch:{ Exception -> 0x00cf }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00cf }
            android.content.ContentResolver r11 = r0.getContentResolver()     // Catch:{ Exception -> 0x00cf }
            if (r11 == 0) goto L_0x00c9
            java.lang.String[] r15 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00cf }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00cf }
            r15[r5] = r0     // Catch:{ Exception -> 0x00cf }
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 + r12
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00cf }
            r15[r6] = r0     // Catch:{ Exception -> 0x00cf }
            android.net.Uri r12 = com.tencent.p014mm.plugin.sport.model.C115778q.f347353c     // Catch:{ Exception -> 0x00cf }
            java.lang.String[] r13 = com.tencent.p014mm.plugin.sport.model.C115778q.f347352b     // Catch:{ Exception -> 0x00cf }
            java.lang.String r14 = "_begin_time >= ? AND _end_time <= ? AND (_mode = 2 OR _mode = 3)"
            java.lang.String r16 = "_id asc"
            android.database.Cursor r8 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00cf }
            if (r8 == 0) goto L_0x00c9
            r9 = 0
        L_0x00ba:
            boolean r0 = r8.moveToNext()     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00ca
            r0 = 4
            int r0 = r8.getInt(r0)     // Catch:{ Exception -> 0x00c7 }
            int r9 = r9 + r0
            goto L_0x00ba
        L_0x00c7:
            r0 = move-exception
            goto L_0x00d1
        L_0x00c9:
            r9 = 0
        L_0x00ca:
            if (r8 == 0) goto L_0x00dd
            goto L_0x00da
        L_0x00cd:
            r0 = move-exception
            goto L_0x0103
        L_0x00cf:
            r0 = move-exception
            r9 = 0
        L_0x00d1:
            java.lang.String r10 = "getMIUIStep"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x00cd }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r10, r11)     // Catch:{ all -> 0x00cd }
            if (r8 == 0) goto L_0x00dd
        L_0x00da:
            r8.close()
        L_0x00dd:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r0[r5] = r8
            java.lang.String r8 = "getMIUIStep %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r0)
            long r8 = (long) r9
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r0[r5] = r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "getTodayStep MIUI Step %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            return r8
        L_0x0103:
            if (r8 == 0) goto L_0x0108
            r8.close()
        L_0x0108:
            throw r0
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sport.model.C115758a.mo176114a():long");
    }

    /* renamed from: b */
    public void mo176115b() {
        C115765d dVar = this.f347311a;
        if (dVar != null) {
            dVar.getClass();
            boolean z = C115778q.m162832a(MMApplicationContext.getContext()) && C115778q.m162836e();
            dVar.f347327i = z;
            if (z) {
                dVar.mo176122b();
                dVar.mo176121a();
            } else {
                dVar.mo176122b();
            }
        }
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, new Bundle(), C85478g.class, new C115761c(this));
    }

    /* renamed from: c */
    public void mo176116c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("config", str);
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, bundle, C85479j.class, new C115760b(this));
    }

    /* renamed from: d */
    public final boolean mo176117d(long j) {
        long j2 = j;
        if (j2 <= 0) {
            Log.m105925i("MicroMsg.Sport.DeviceStepManager", "invalid step %d", Long.valueOf(j));
            return false;
        }
        if (this.f347313c != null) {
            C86709a0.m107524d().mo123458d(this.f347313c);
        }
        long g = C115778q.m162838g();
        long c = C31543z5.m39453c();
        Log.m105925i("MicroMsg.Sport.DeviceStepManager", "update device Step time: %s stepCount: %s", C115778q.m162837f(c), Long.valueOf(j));
        this.f347313c = new C43165f("", "gh_43f2581f6fd6", (int) (g / 1000), (int) (c / 1000), (int) j2, C85796t4.m105983jo(), 1);
        C86709a0.m107524d().mo123460f(this.f347313c);
        this.f347315e = c;
        C115775n nVar = C115775n.f347342a;
        nVar.mo176131d("KEY_LAST_UPLOAD_DEVICE_STEP_TIME_LONG", c);
        this.f347314d = j2;
        nVar.mo176131d("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", j2);
        return true;
    }
}
