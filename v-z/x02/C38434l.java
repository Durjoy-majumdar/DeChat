package x02;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.p064hp.model.TinkerBootsActivateListener;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: x02.l */
public class C38434l extends C86301e {

    /* renamed from: d */
    public boolean f101387d = true;

    /* renamed from: e */
    public final TinkerBootsActivateListener f101388e = new TinkerBootsActivateListener();

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccountInitialized(android.content.Context r15) {
        /*
            r14 = this;
            com.tencent.mm.plugin.hp.model.TinkerBootsActivateListener r15 = r14.f101388e
            r15.alive()
            java.lang.String r15 = "Tinker.SubCoreHotpatch"
            java.lang.String r0 = "onAccountPostReset"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            a12.C27734k.m37985d(r15)
            r15 = 4
            r0 = 0
            r1 = 1
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00f5 }
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ Exception -> 0x00f5 }
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG     // Catch:{ Exception -> 0x00f5 }
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r2 = r2.mo119685f(r3, r4)     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x00f5 }
            long r4 = r2.longValue()     // Catch:{ Exception -> 0x00f5 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f5 }
            long r8 = r6 - r4
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x00dd
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x00f5 }
            r8 = 11
            int r2 = r2.get(r8)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r8 = "Tinker.SubCoreHotpatch"
            java.lang.String r9 = "try to fetch patch update hour %d "
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f5 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00f5 }
            r12[r0] = r13     // Catch:{ Exception -> 0x00f5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r12)     // Catch:{ Exception -> 0x00f5 }
            r8 = 2
            if (r2 != 0) goto L_0x00ad
            java.util.Random r2 = new java.util.Random     // Catch:{ Exception -> 0x00f5 }
            r2.<init>()     // Catch:{ Exception -> 0x00f5 }
            r9 = 60
            int r2 = r2.nextInt(r9)     // Catch:{ Exception -> 0x00f5 }
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r12 = "tinker_patch_share_config"
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r12, r15)     // Catch:{ Exception -> 0x00f5 }
            r12 = 12
            java.lang.String r13 = "check_tinker_update_interval"
            int r9 = r9.getInt(r13, r12)     // Catch:{ Exception -> 0x00f5 }
            long r12 = (long) r9     // Catch:{ Exception -> 0x00f5 }
            long r12 = r12 * r10
            long r6 = r6 - r12
            long r9 = (long) r2     // Catch:{ Exception -> 0x00f5 }
            r11 = 60000(0xea60, double:2.9644E-319)
            long r9 = r9 * r11
            long r6 = r6 + r9
            f40.o r9 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00f5 }
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r10 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00f5 }
            r9.mo119677K(r3, r10)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r3 = "Tinker.SubCoreHotpatch"
            java.lang.String r9 = "try to fetch patch update after %d minute currentTime %s lastUpdate %s"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00f5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00f5 }
            r10[r0] = r2     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00f5 }
            r10[r1] = r2     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00f5 }
            r10[r8] = r2     // Catch:{ Exception -> 0x00f5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r10)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00ed
        L_0x00ad:
            zw3.a r2 = zw3.C91941a.m115469d()     // Catch:{ Exception -> 0x00f5 }
            r2.mo125791a(r1)     // Catch:{ Exception -> 0x00f5 }
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00f5 }
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00f5 }
            r2.mo119677K(r3, r9)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r2 = "Tinker.SubCoreHotpatch"
            java.lang.String r3 = "try to fetch patch update true when onAccountPostReset. current:%d lastUpdate:%d"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00f5 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x00f5 }
            r8[r0] = r9     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00f5 }
            r8[r1] = r4     // Catch:{ Exception -> 0x00f5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r8)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00ed
        L_0x00dd:
            zw3.a r2 = zw3.C91941a.m115469d()     // Catch:{ Exception -> 0x00f5 }
            boolean r3 = r14.f101387d     // Catch:{ Exception -> 0x00f5 }
            r2.mo125791a(r3)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r2 = "Tinker.SubCoreHotpatch"
            java.lang.String r3 = "try to fetch patch update false when onAccountPostReset."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x00f5 }
        L_0x00ed:
            com.tencent.mm.plugin.hp.model.TinkerBootsActivateListener r2 = r14.f101388e     // Catch:{ Exception -> 0x00f5 }
            r2.getClass()     // Catch:{ Exception -> 0x00f5 }
            com.tencent.p014mm.plugin.p064hp.model.TinkerBootsActivateListener.f81463d = r6     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00ff
        L_0x00f5:
            r2 = move-exception
            java.lang.String r3 = "Tinker.SubCoreHotpatch"
            java.lang.String r4 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r0)
        L_0x00ff:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsIsolatedProcess()
            if (r0 != 0) goto L_0x0193
            com.tencent.mm.app.e1 r0 = com.tencent.p014mm.app.C80590e1.C28678b.f78659a
            monitor-enter(r0)
            boolean r2 = r0.f235764b     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x0116
            java.lang.String r15 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r1 = "[!] Uninitialized or install failed, reportStats will be ignored."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r1)     // Catch:{ all -> 0x0190 }
            monitor-exit(r0)
            goto L_0x0193
        L_0x0116:
            com.tencent.tinker.entry.ApplicationLike r2 = r0.f235763a     // Catch:{ all -> 0x0190 }
            android.app.Application r2 = r2.getApplication()     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "tinker_ensurance_info"
            android.content.SharedPreferences r15 = r2.getSharedPreferences(r3, r15)     // Catch:{ all -> 0x0190 }
            boolean r2 = r0.mo112300d()     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x0158
            boolean r2 = r0.mo112301e()     // Catch:{ all -> 0x0190 }
            if (r2 == 0) goto L_0x0158
            kj2.d r3 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0190 }
            r4 = 338(0x152, double:1.67E-321)
            r6 = 231(0xe7, double:1.14E-321)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)     // Catch:{ all -> 0x0190 }
            android.content.SharedPreferences$Editor r2 = r15.edit()     // Catch:{ all -> 0x0190 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0190 }
            r3.<init>()     // Catch:{ all -> 0x0190 }
            java.lang.String r4 = a70.C79471a.f233015c     // Catch:{ all -> 0x0190 }
            r3.append(r4)     // Catch:{ all -> 0x0190 }
            java.lang.String r4 = "_clean_patch_reported"
            r3.append(r4)     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0190 }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r3, r1)     // Catch:{ all -> 0x0190 }
            r2.apply()     // Catch:{ all -> 0x0190 }
        L_0x0158:
            boolean r2 = r0.mo112299c()     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x018e
            boolean r2 = r0.mo112297a()     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x018e
            kj2.d r3 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0190 }
            r4 = 338(0x152, double:1.67E-321)
            r6 = 232(0xe8, double:1.146E-321)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)     // Catch:{ all -> 0x0190 }
            android.content.SharedPreferences$Editor r15 = r15.edit()     // Catch:{ all -> 0x0190 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0190 }
            r2.<init>()     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = a70.C79471a.f233015c     // Catch:{ all -> 0x0190 }
            r2.append(r3)     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "_block_apply_patch_reported"
            r2.append(r3)     // Catch:{ all -> 0x0190 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0190 }
            android.content.SharedPreferences$Editor r15 = r15.putInt(r2, r1)     // Catch:{ all -> 0x0190 }
            r15.apply()     // Catch:{ all -> 0x0190 }
        L_0x018e:
            monitor-exit(r0)
            goto L_0x0193
        L_0x0190:
            r15 = move-exception
            monitor-exit(r0)
            throw r15
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x02.C38434l.onAccountInitialized(android.content.Context):void");
    }

    public void onAccountReleased(Context context) {
        this.f101388e.dead();
        Log.m105918d("Tinker.SubCoreHotpatch", "onAccountRelease");
    }

    public void onCreate(Context context) {
        C30650a.m39147b(new C91133u(), "//tinker");
    }
}
