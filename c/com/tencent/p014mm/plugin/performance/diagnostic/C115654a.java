package com.tencent.p014mm.plugin.performance.diagnostic;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Process;
import com.tencent.matrix.backtrace.C114405e;
import com.tencent.matrix.backtrace.C114412g;
import com.tencent.matrix.backtrace.C114413h;
import com.tencent.matrix.backtrace.C114417j;
import com.tencent.matrix.backtrace.C114419k;
import com.tencent.matrix.backtrace.WeChatBacktraceNative;
import com.tencent.matrix.xlog.XLogNative;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.io.File;
import p1069zd.C119095c;
import p1069zd.C91662a;
import p723vf.C118672d;

/* renamed from: com.tencent.mm.plugin.performance.diagnostic.a */
public class C115654a implements C85311d.C85314c {

    /* renamed from: a */
    public static final C115654a f346916a = new C115654a();

    /* renamed from: b */
    public static volatile boolean[] f346917b = {false};

    /* renamed from: c */
    public static boolean f346918c = true;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m162677a(com.tencent.matrix.backtrace.C114419k.C114420a r13) {
        /*
            com.tencent.mm.plugin.performance.diagnostic.c r0 = new com.tencent.mm.plugin.performance.diagnostic.c
            r0.<init>()
            com.tencent.matrix.backtrace.C114405e.f342949h = r0
            f40.a0 r0 = f40.C86709a0.m107528h()
            com.tencent.mm.plugin.performance.diagnostic.b r1 = new com.tencent.mm.plugin.performance.diagnostic.b
            r1.<init>()
            r0.mo121097c(r1)
            boolean r0 = r13.f343017n
            if (r0 == 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            java.util.HashSet<java.lang.String> r0 = r13.f343005b
            r0.clear()
        L_0x001d:
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            boolean r1 = r0.mo71804b()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0085
            java.util.concurrent.Future<eb0.f6>[] r1 = eb0.C86487f6.f251311d     // Catch:{ all -> 0x0061 }
            monitor-enter(r1)     // Catch:{ all -> 0x0061 }
            r5 = r1[r3]     // Catch:{ all -> 0x005e }
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x003d
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x0061 }
            eb0.f6 r1 = (eb0.C86487f6) r1     // Catch:{ all -> 0x0061 }
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            if (r1 == 0) goto L_0x005b
            java.util.ArrayList<java.lang.String> r5 = r1.f251312a     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x005b
            int r5 = r5.size()     // Catch:{ all -> 0x0061 }
            if (r5 <= 0) goto L_0x005b
            java.util.ArrayList<java.lang.String> r1 = r1.f251312a     // Catch:{ all -> 0x0061 }
            int r5 = r1.size()     // Catch:{ all -> 0x0061 }
            int r5 = r5 + -1
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x005b
            goto L_0x006d
        L_0x005b:
            java.lang.String r1 = ""
            goto L_0x006d
        L_0x005e:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            java.lang.String r5 = "MicroMsg.VersionHistory"
            java.lang.String r6 = "[-] Failure in getGlobalLatestHistoryVer()"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r6, r7)
            java.lang.String r1 = ""
        L_0x006d:
            java.lang.String r5 = "%x"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r7 = qe3.C89625d.f257841g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.String r5 = java.lang.String.format(r5, r6)
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 != 0) goto L_0x0085
            r1 = 1
            goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            java.lang.String r5 = "MicroMsg.BacktraceLogic"
            java.lang.String r6 = "WeChat backtrace setup client version updated %s"
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)
            boolean r5 = r0.mo71804b()
            if (r5 != 0) goto L_0x009c
            goto L_0x00c0
        L_0x009c:
            r5 = r0
            j40.b r5 = (j40.C87829b) r5
            com.tencent.tinker.entry.ApplicationLike r5 = r5.f254267f
            android.content.Intent r5 = r5.getTinkerResultIntent()
            if (r5 != 0) goto L_0x00a8
            goto L_0x00c0
        L_0x00a8:
            int r6 = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getIntentReturnCode(r5)
            if (r6 == 0) goto L_0x00af
            goto L_0x00c0
        L_0x00af:
            java.lang.String r6 = "intent_patch_new_version"
            java.lang.String r5 = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(r5, r6)
            if (r5 != 0) goto L_0x00b8
            goto L_0x00c0
        L_0x00b8:
            android.app.Application r6 = r0.f124990c
            java.io.File r6 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(r6)
            if (r6 != 0) goto L_0x00c2
        L_0x00c0:
            r7 = r2
            goto L_0x00cf
        L_0x00c2:
            java.io.File r7 = new java.io.File
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r5 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(r5)
            r7.<init>(r6, r5)
        L_0x00cf:
            if (r7 == 0) goto L_0x00ec
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r7.getAbsolutePath()
            r2.append(r5)
            java.lang.String r5 = "/"
            r2.append(r5)
            java.lang.String r5 = "lib"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x00ec:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            if (r7 == 0) goto L_0x012b
            java.io.File r6 = new java.io.File
            java.lang.String r8 = "dex"
            r6.<init>(r7, r8)
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0134
            java.io.File[] r8 = r6.listFiles()
            if (r8 == 0) goto L_0x0134
            java.io.File[] r6 = r6.listFiles()
            int r8 = r6.length
            r9 = 0
        L_0x010c:
            if (r9 >= r8) goto L_0x0134
            r10 = r6[r9]
            java.io.File r11 = new java.io.File
            java.lang.String r12 = "odex"
            r11.<init>(r7, r12)
            java.io.File r12 = new java.io.File
            java.lang.String r10 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.optimizedPathFor(r10, r11)
            r12.<init>(r10)
            java.lang.String r10 = r12.getAbsolutePath()
            r5.add(r10)
            int r9 = r9 + 1
            goto L_0x010c
        L_0x012b:
            android.app.Application r6 = r0.f124990c
            java.lang.String r6 = com.tencent.matrix.backtrace.C114419k.m160960a(r6)
            r5.add(r6)
        L_0x0134:
            java.lang.String r6 = "MicroMsg.BacktraceLogic"
            java.lang.String r8 = "WeChat backtrace setup odex path %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)
            android.app.Application r0 = r0.f124990c
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            java.lang.String r0 = r0.nativeLibraryDir
            java.lang.String r6 = "MicroMsg.BacktraceLogic"
            java.lang.String r8 = "WeChat backtrace setup native library path %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)
            if (r2 == 0) goto L_0x015f
            java.lang.String r6 = "MicroMsg.BacktraceLogic"
            java.lang.String r8 = "WeChat backtrace setup tinker native library path %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)
        L_0x015f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0163:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x017a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = r13.f343017n
            if (r8 == 0) goto L_0x0174
            goto L_0x0163
        L_0x0174:
            java.util.HashSet<java.lang.String> r8 = r13.f343005b
            r8.add(r6)
            goto L_0x0163
        L_0x017a:
            if (r7 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r2 = r0
        L_0x017e:
            boolean r0 = r13.f343017n
            if (r0 == 0) goto L_0x0183
            goto L_0x0188
        L_0x0183:
            java.util.HashSet<java.lang.String> r0 = r13.f343005b
            r0.add(r2)
        L_0x0188:
            java.lang.String r0 = com.tencent.matrix.backtrace.C114419k.m160961b()
            boolean r5 = r13.f343017n
            if (r5 == 0) goto L_0x0191
            goto L_0x0196
        L_0x0191:
            java.util.HashSet<java.lang.String> r5 = r13.f343005b
            r5.add(r0)
        L_0x0196:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/libwechatxlog.so"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r2 = r13.f343017n
            if (r2 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r13.f343016m = r0
        L_0x01ae:
            if (r2 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r13.f343015l = r4
        L_0x01b3:
            if (r2 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r13.f343014k = r3
        L_0x01b8:
            if (r2 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            r13.f343007d = r1
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.diagnostic.C115654a.m162677a(com.tencent.matrix.backtrace.k$a):void");
    }

    /* renamed from: b */
    public static boolean m162678b(boolean z) {
        Log.m105924i("MicroMsg.BacktraceLogic", "setup WeChatBacktrace");
        if (f346917b[0]) {
            return true;
        }
        synchronized (f346917b) {
            if (f346917b[0]) {
                return true;
            }
            f346917b[0] = m162679c(z);
            return f346917b[0];
        }
    }

    /* renamed from: c */
    public static boolean m162679c(boolean z) {
        C114419k.C114420a aVar;
        String str;
        C114419k.C114421b bVar = C114419k.C114421b.Fp;
        C114419k.C114421b bVar2 = C114419k.C114421b.Quicken;
        Class cls = C32735h.class;
        if (!(z || (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_wechat_backtrace_enable, false))) {
            Log.m105924i("MicroMsg.BacktraceLogic", "WeChat backtrace not enabled");
            return false;
        }
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_pthread_hook_with_quikcen, false);
        f346918c = wf;
        Log.m105925i("MicroMsg.BacktraceLogic", "WeChat backtrace enabled, pthread quicken %s.", Boolean.valueOf(wf));
        C114419k kVar = C114419k.C114422c.f343026a;
        Application application = C86709a0.m107531m().mo58407a().f124990c;
        synchronized (kVar) {
            if (kVar.f343000c != null) {
                aVar = kVar.f343000c;
            } else {
                kVar.f343000c = new C114419k.C114420a(application, kVar);
                kVar.f342998a = true;
                aVar = kVar.f343000c;
            }
        }
        if (BuildInfo.IS_ARM64) {
            if (!aVar.f343017n) {
                aVar.f343006c = bVar;
            }
            if (f346918c) {
                m162677a(aVar);
                if (!aVar.f343017n) {
                    aVar.f343008e = true;
                }
            }
        } else {
            m162677a(aVar);
            if (!aVar.f343017n) {
                aVar.f343006c = bVar2;
            }
        }
        if (!aVar.f343017n) {
            aVar.f343017n = true;
            C114419k kVar2 = aVar.f343018o;
            kVar2.getClass();
            C114419k.C114421b bVar3 = C114419k.C114421b.DwarfUntilQuickenWarmedUp;
            C114419k.C114421b bVar4 = C114419k.C114421b.FpUntilQuickenWarmedUp;
            C114419k.C114421b bVar5 = C114419k.C114421b.Dwarf;
            Context context = aVar.f343004a;
            synchronized (C91662a.class) {
                if (C91662a.f262639a == null) {
                    C91662a.f262639a = C91662a.m115197a(context, Process.myPid());
                }
                str = C91662a.f262639a;
            }
            if (str != null && str.endsWith(":backtrace__")) {
                C118672d.m167353c("Matrix.Backtrace", "Isolate process does not need any configuration.", new Object[0]);
            } else {
                if (!C114419k.f342997g) {
                    C114419k.m160963d();
                    C114419k.f342997g = true;
                }
                XLogNative.m161209a(aVar.f343016m);
                WeChatBacktraceNative.enableLogger(aVar.f343014k);
                C118672d.m167353c("Matrix.Backtrace", aVar.toString(), new Object[0]);
                C114419k.C114421b bVar6 = aVar.f343006c;
                if (bVar6 == bVar || bVar6 == bVar5) {
                    WeChatBacktraceNative.setBacktraceMode(bVar6.f343025d);
                }
                C114419k.C114421b bVar7 = aVar.f343006c;
                if (bVar7 == bVar2 || bVar7 == bVar4 || bVar7 == bVar3 || aVar.f343008e) {
                    String b = C114417j.m160947b(aVar);
                    C118672d.m167353c("Matrix.Backtrace", "Set saving path: %s", b);
                    new File(b).mkdirs();
                    String str2 = File.separator;
                    if (!b.endsWith(str2)) {
                        b = b + str2;
                    }
                    kVar2.f343001d.f342951b = b;
                    WeChatBacktraceNative.setSavingPath(b);
                    if (aVar.f343010g) {
                        File l = C114417j.m160957l(aVar.f343004a);
                        if (aVar.f343009f && l.exists()) {
                            String h = C114417j.m160953h(l, 4096);
                            if (h == null) {
                                aVar.f343007d = true;
                            } else if (!h.split("\n")[0].equalsIgnoreCase(aVar.f343004a.getApplicationInfo().nativeLibraryDir)) {
                                C118672d.m167353c("Matrix.Backtrace", "Apk updated, remove warmed-up file.", new Object[0]);
                                aVar.f343007d = true;
                            }
                        }
                        if (aVar.f343007d) {
                            l.delete();
                            C114417j.m160955j(aVar.f343004a).delete();
                        }
                    }
                    C114405e eVar = kVar2.f343001d;
                    synchronized (eVar.f342956g) {
                        boolean[] zArr = eVar.f342956g;
                        if (!zArr[0]) {
                            zArr[0] = true;
                            eVar.f342955f = aVar;
                            eVar.f342950a = aVar.f343011h;
                            eVar.f342953d = new C114405e.C114408c("WeChatBacktraceTask");
                            C114413h hVar = r10;
                            C114413h hVar2 = new C114413h(eVar, aVar.f343004a, aVar.f343012i, aVar.f343013j);
                            eVar.f342954e = hVar;
                            if (aVar.f343010g) {
                                Context context2 = aVar.f343004a;
                                if (!C114417j.m160957l(context2).exists()) {
                                    C118672d.m167353c("Matrix.WarmUpDelegate", "Has not been warmed up", new Object[0]);
                                    C114413h hVar3 = eVar.f342954e;
                                    hVar3.f342980f.post(new C114412g(hVar3, C114413h.C114415b.WarmUp));
                                }
                                if (C114417j.m160952g(context2)) {
                                    C118672d.m167353c("Matrix.WarmUpDelegate", "Need clean up", new Object[0]);
                                    C114413h hVar4 = eVar.f342954e;
                                    hVar4.f342980f.post(new C114412g(hVar4, C114413h.C114415b.CleanUp));
                                }
                                if (C114417j.m160954i(context2)) {
                                    C118672d.m167353c("Matrix.WarmUpDelegate", "Should schedule disk usage task.", new Object[0]);
                                    C114413h hVar5 = eVar.f342954e;
                                    hVar5.f342980f.post(new C114412g(hVar5, C114413h.C114415b.DiskUsage));
                                }
                            }
                        }
                    }
                    boolean exists = C114417j.m160957l(aVar.f343004a).exists();
                    C114419k.C114421b bVar8 = aVar.f343006c;
                    if (bVar8 == bVar2 || !aVar.f343008e) {
                        if (!exists) {
                            if (bVar8 != bVar4) {
                                if (bVar8 == bVar3) {
                                    bVar = bVar5;
                                }
                            }
                            WeChatBacktraceNative.setBacktraceMode(bVar.f343025d);
                        }
                        bVar = bVar2;
                        WeChatBacktraceNative.setBacktraceMode(bVar.f343025d);
                    }
                    C118672d.m167353c("Matrix.Backtrace", "Has warmed up: %s", Boolean.valueOf(exists));
                    WeChatBacktraceNative.setWarmedUp(exists);
                    if (!kVar2.f343003f) {
                        kVar2.f343003f = false;
                        kVar2.f343002e.postDelayed(new C119095c(kVar2), 21600000);
                    }
                    if (!aVar.f343010g) {
                        C114405e eVar2 = kVar2.f343001d;
                        C114419k.C114421b bVar9 = aVar.f343006c;
                        synchronized (eVar2) {
                            if (!C114417j.m160957l(aVar.f343004a).exists()) {
                                if (eVar2.f342952c == null) {
                                    eVar2.f342952c = new C114405e.C114409d(bVar9);
                                    C118672d.m167353c("Matrix.WarmUpDelegate", "Register warm-up receiver.", new Object[0]);
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("action.backtrace.warmed-up");
                                    aVar.f343004a.registerReceiver(eVar2.f342952c, intentFilter, aVar.f343004a.getPackageName() + ".backtrace.warmed_up", (Handler) null);
                                }
                            }
                        }
                    }
                }
                kVar2.f342999b = true;
                return true;
            }
        }
        return true;
    }
}
