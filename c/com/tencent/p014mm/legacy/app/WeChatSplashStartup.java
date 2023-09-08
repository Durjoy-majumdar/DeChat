package com.tencent.p014mm.legacy.app;

import a70.C112760b;
import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import bp3.C79755l;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80590e1;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.legacy.app.C80952a;
import com.tencent.p014mm.p136ui.C75048z0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.sdcard_migrate.C85729e;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.PeriodRecorder;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.splash.C6706a;
import com.tencent.p014mm.splash.C6707h;
import com.tencent.p014mm.splash.C85779d;
import com.tencent.p014mm.splash.C85781g;
import com.tencent.p014mm.splash.C85788m;
import com.tencent.p014mm.splash.C85791o;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86003d2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import f40.C86718e;
import f40.C86732g0;
import g40.C87134f;
import j40.C87829b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import kk0.C88191m;
import lp3.C88633e;
import lp3.C88643g;
import p787ai.C79546a;
import sx3.C64175a0;
import tc3.C13869c;
import tc3.C13870d;
import tc3.C13871e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup */
public class WeChatSplashStartup implements C85788m.C85789a {

    /* renamed from: a */
    public Application f237801a;

    /* renamed from: b */
    public String f237802b;

    /* renamed from: c */
    public C87829b f237803c;

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$d */
    public class C1267d implements C87134f {

        /* renamed from: d */
        public final /* synthetic */ boolean f10320d;

        /* renamed from: e */
        public final /* synthetic */ C85791o.C85792a f10321e;

        public C1267d(WeChatSplashStartup weChatSplashStartup, boolean z, C85791o.C85792a aVar) {
            this.f10320d = z;
            this.f10321e = aVar;
        }

        /* renamed from: e */
        public void mo1180e() {
            C86709a0.m107528h().mo121101p(this);
            if (!this.f10320d) {
                ((C6707h) this.f10321e).getClass();
                C85781g.m105955c("WxSplash.Splash", "told me done.", new Object[0]);
                C85781g.m105953a();
                return;
            }
            C85781g.m105955c("MicroMsg.FigLeaf", "deleteRequest ", new Object[0]);
            Uri n = C116299g2.m163858n(C6706a.f24116a);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C85781g.m105955c("MicroMsg.FigLeaf", "deleteRequest dex opt dir not exists.", new Object[0]);
                return;
            }
            C86009m1 m1Var = new C86009m1(C6706a.f24116a + "/" + "main-process-blocking");
            if (m1Var.mo119967g()) {
                C85781g.m105955c("MicroMsg.FigLeaf", "deleteRequest result %s.", Boolean.valueOf(m1Var.mo119966f()));
            }
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$j */
    public class C1268j implements C87134f {

        /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$j$a */
        public class C1269a implements Runnable {
            public C1269a(C1268j jVar) {
            }

            public void run() {
                Log.m105924i("MicroMsg.WeChatSplashStartup", "MMKernel onStartupDone");
                C13871e.f39039d = true;
                C64175a0.m75512t(C13871e.f39037b, C13869c.f39034d);
                C64175a0.m75512t(C13871e.f39038c, C13870d.f39035d);
            }
        }

        public C1268j(WeChatSplashStartup weChatSplashStartup) {
        }

        /* renamed from: e */
        public void mo1180e() {
            ((C119157j) C119157j.f356862d).mo183875f(new C1269a(this));
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$i */
    public class C28958i implements C87134f {

        /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$i$a */
        public class C28959a implements Runnable {
            public C28959a(C28958i iVar) {
            }

            public void run() {
                try {
                    long j = MultiProcessMMKV.getMMKV("SnsMMKV").getLong("SnsMMKVCleanDbCount", -1);
                    if (j < 0) {
                        j = C94866e1.Yx0().h30();
                        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVCleanDbCount", j);
                    }
                    Log.m105925i("MicroMsg.WeChatSplashStartup", "cleanSnsTablesByTimeLimit snsDbCount:%s", Long.valueOf(j));
                } catch (Exception unused) {
                }
            }
        }

        public C28958i(WeChatSplashStartup weChatSplashStartup) {
        }

        /* renamed from: e */
        public void mo1180e() {
            if (MMApplicationContext.isMainProcess()) {
                ((C119157j) C119157j.f356862d).mo183876g(new C28959a(this), "SnsCleanDb");
            }
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$a */
    public class C80943a implements C87134f {

        /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$a$a */
        public class C80944a implements Runnable {
            public C80944a(C80943a aVar) {
            }

            public void run() {
                PeriodRecorder periodRecorder = C79755l.f233752a;
                if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                    C79755l.m96892b(ErrorCode.ERROR_OUTOF_MEMORY, MMApplicationContext.getProcessName(), "MissingMessageListenerReporter-TestMessage");
                }
            }
        }

        public C80943a(WeChatSplashStartup weChatSplashStartup) {
        }

        /* renamed from: e */
        public void mo1180e() {
            if (MMApplicationContext.isMainProcess()) {
                ((C119157j) C119157j.f356862d).mo183875f(new C80944a(this));
            }
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$b */
    public class C80945b implements C86732g0.C86733a {

        /* renamed from: a */
        public final /* synthetic */ C85791o.C85792a f237804a;

        public C80945b(WeChatSplashStartup weChatSplashStartup, C85791o.C85792a aVar) {
            this.f237804a = aVar;
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$c */
    public class C80946c implements C85779d {

        /* renamed from: a */
        public C75048z0 f237805a = new C75048z0();

        public C80946c(WeChatSplashStartup weChatSplashStartup) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$e */
    public class C80947e implements C87134f {
        public C80947e() {
        }

        /* renamed from: e */
        public void mo1180e() {
            C86709a0.m107528h().mo121101p(this);
            C79546a.m96577a(512);
            WeChatSplashStartup weChatSplashStartup = WeChatSplashStartup.this;
            weChatSplashStartup.getClass();
            ((C88633e) C88643g.m110546d()).mo123071k(500).mo123064p(new C80971q(weChatSplashStartup));
            ((C119157j) C119157j.f356862d).mo183876g(new C86003d2(), "VFSSwitch_Rpt");
            String str = ExtStorageMigrateMonitor.f249771a;
            if (C80589e.f235762c.equals(C80589e.f235760a.getApplication().getPackageName())) {
                ((C88633e) C88643g.m110546d()).mo123071k(500).mo123064p(new C85729e());
            }
            ExtStorageMigrateRoutine.triggerMediaRescanOnDemand();
            if (WeChatSplashStartup.this.f237803c.mo71804b()) {
                try {
                    MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).edit().putInt("launch_last_status", 2).commit();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WeChatSplashStartup", e, "%s", e.getMessage());
                }
            }
            if (WeChatSplashStartup.this.f237803c.mo71804b()) {
                C86718e b = C86709a0.m107523b();
                Log.m105925i("MMKernel.CoreAccount", "summerhardcoder hasInitialized[%b] mHardCoderStartPerformance[%d] stack[%s]", Boolean.valueOf(b.mo121114l()), Integer.valueOf(b.f251756g), Util.getStack());
                if (b.mo121114l() && b.f251756g != 0) {
                    C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcBootEnable(), b.f251756g);
                    Log.m105925i("MMKernel.CoreAccount", "summerhardcoder stopPerformance[%s] stack[%s]", Integer.valueOf(b.f251756g), Util.getStack());
                    b.f251756g = 0;
                }
            }
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$f */
    public class C80948f implements C87134f {
        public C80948f(WeChatSplashStartup weChatSplashStartup) {
        }

        /* renamed from: e */
        public void mo1180e() {
            if (!MMApplicationContext.isToolsIsolatedProcess()) {
                C80590e1 e1Var = C80590e1.C28678b.f78659a;
                synchronized (e1Var) {
                    e1Var.f235765c = true;
                }
            }
            synchronized (C80611s0.f235835b) {
                List<C80611s0.C80613b> list = C80611s0.f235834a;
                synchronized (list) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        ((C80611s0.C80613b) it.next()).mo112356a();
                    }
                }
                C80611s0.f235835b[0] = true;
            }
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$g */
    public class C80949g implements C87134f {
        public C80949g() {
        }

        /* renamed from: e */
        public void mo1180e() {
            boolean z;
            Application application = WeChatSplashStartup.this.f237801a;
            String str = C80952a.f237810a;
            String processName = MMApplicationContext.getProcessName();
            Iterator it = ((ArrayList) C80952a.f237815f).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C80952a.C80957e) it.next()).mo112732a()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                Log.m105929w("MicroMsg.AccidentallyQuitMonitor", "[!] Process [%s] is not targeted, skip rest logic.", processName);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("MMKV_AccidentiallyQuitMarks_");
            int indexOf = processName.indexOf(58);
            sb.append(indexOf != -1 ? processName.substring(indexOf) : "");
            C80952a.f237810a = sb.toString();
            ((C119157j) C119157j.f356862d).mo183895z(new C80958b(application));
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$h */
    public class C80950h implements C87134f {

        /* renamed from: d */
        public final PeriodRecorder f237808d = new PeriodRecorder("FixMigrate", TimeUnit.DAYS.toMillis(1), true, true);

        /* renamed from: com.tencent.mm.legacy.app.WeChatSplashStartup$h$a */
        public class C80951a implements Runnable {
            public C80951a() {
            }

            public void run() {
                File file = new File(C112760b.m154228e0(), "/MicroMsg/WeiXin/");
                File file2 = new File(C112760b.m154228e0(), "/MicroMsg/WeChat/");
                File file3 = new File(C112760b.m154220a0());
                if (file.exists()) {
                    C80950h.m98830a(C80950h.this, file, file3);
                    if (!file3.exists()) {
                        C80950h.m98831b(C80950h.this, 1315, 170, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE, 1);
                    } else if (!file.exists()) {
                        C80950h.m98831b(C80950h.this, 1315, 170, 172, 1);
                    } else {
                        C80950h.m98831b(C80950h.this, 1315, 170, C88191m.CTRL_INDEX, 1);
                    }
                }
                if (file2.exists()) {
                    C80950h.m98830a(C80950h.this, file2, file3);
                    if (!file3.exists()) {
                        C80950h.m98831b(C80950h.this, 1315, 171, WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL, 1);
                    } else if (!file2.exists()) {
                        C80950h.m98831b(C80950h.this, 1315, 171, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO, 1);
                    } else {
                        C80950h.m98831b(C80950h.this, 1315, 171, WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED, 1);
                    }
                }
            }
        }

        public C80950h(WeChatSplashStartup weChatSplashStartup) {
        }

        /* renamed from: a */
        public static void m98830a(C80950h hVar, File file, File file2) {
            File file3;
            ArrayList arrayList;
            hVar.getClass();
            if (!file.exists()) {
                Log.m105928w("MicroMsg.WeChatSplashStartup", "[!] moveDir, srcDir is not exists, skip moving.");
            } else if (file.equals(file2)) {
                Log.m105928w("MicroMsg.WeChatSplashStartup", "[!] moveDir, srcDir points to the same place with destDir, skip moving.");
            } else {
                ArrayList arrayList2 = new ArrayList();
                Stack stack = new Stack();
                arrayList2.add(file);
                while (true) {
                    char c = 0;
                    int i = 1;
                    if (arrayList2.isEmpty()) {
                        break;
                    }
                    File file4 = (File) arrayList2.remove(0);
                    String substring = file4.getAbsolutePath().substring(file.getAbsolutePath().length());
                    if (TextUtils.isEmpty(substring)) {
                        file3 = file2;
                        File file5 = file3;
                    } else {
                        file3 = new File(file2, substring);
                    }
                    if (file4.renameTo(file3)) {
                        Log.m105925i("MicroMsg.WeChatSplashStartup", "[+] moveDir, move %s to %s.", file4.getAbsolutePath(), file3.getAbsolutePath());
                    } else {
                        File[] listFiles = file4.listFiles();
                        if (listFiles == null) {
                            Log.m105925i("MicroMsg.WeChatSplashStartup", "[+] moveDir, delete empty dir: %s", file4.getAbsolutePath());
                            if (!file4.delete()) {
                                Log.m105929w("MicroMsg.WeChatSplashStartup", "[!] moveDir, fail to delete empty dir: %s", file4.getAbsolutePath());
                            }
                        } else {
                            int length = listFiles.length;
                            int i2 = 0;
                            while (i2 < length) {
                                File file6 = listFiles[i2];
                                if (file6.isDirectory()) {
                                    arrayList2.add(file6);
                                } else {
                                    File file7 = new File(file3, file6.getName());
                                    if (file7.exists()) {
                                        Object[] objArr = new Object[i];
                                        objArr[c] = file7.getAbsolutePath();
                                        Log.m105929w("MicroMsg.WeChatSplashStartup", "[!] moveDir, dest file: %s exists, skip moving it.", objArr);
                                    } else if (file6.renameTo(file7)) {
                                        Object[] objArr2 = new Object[2];
                                        objArr2[c] = file6.getAbsolutePath();
                                        objArr2[1] = file7.getAbsolutePath();
                                        Log.m105925i("MicroMsg.WeChatSplashStartup", "[+] moveDir, move %s to %s.", objArr2);
                                    } else {
                                        try {
                                            hVar.mo112730c(file6, file7);
                                            if (!file6.delete()) {
                                                arrayList = arrayList2;
                                                try {
                                                    Log.m105929w("MicroMsg.WeChatSplashStartup", "[!] moveDir, fail to delete %s after copy.", file6.getAbsolutePath());
                                                } catch (IOException e) {
                                                    e = e;
                                                }
                                                i2++;
                                                arrayList2 = arrayList;
                                                c = 0;
                                                i = 1;
                                            }
                                            arrayList = arrayList2;
                                        } catch (IOException e2) {
                                            e = e2;
                                            arrayList = arrayList2;
                                            Log.printErrStackTrace("MicroMsg.WeChatSplashStartup", e, "[-] moveDir, fail to copy %s to %s.", file6.getAbsolutePath(), file7.getAbsolutePath());
                                            i2++;
                                            arrayList2 = arrayList;
                                            c = 0;
                                            i = 1;
                                        }
                                        i2++;
                                        arrayList2 = arrayList;
                                        c = 0;
                                        i = 1;
                                    }
                                }
                                C80950h hVar2 = hVar;
                                arrayList = arrayList2;
                                i2++;
                                arrayList2 = arrayList;
                                c = 0;
                                i = 1;
                            }
                            C80950h hVar3 = hVar;
                            ArrayList arrayList3 = arrayList2;
                            stack.push(file4);
                        }
                    }
                }
                while (!stack.isEmpty()) {
                    File file8 = (File) stack.pop();
                    file8.delete();
                    Log.m105925i("MicroMsg.WeChatSplashStartup", "[+] moveDir, remove dir: %s after copy.", file8.getAbsolutePath());
                }
            }
        }

        /* renamed from: b */
        public static void m98831b(C80950h hVar, int i, int i2, int i3, int i4) {
            PeriodRecorder periodRecorder = hVar.f237808d;
            if (periodRecorder.isExpired("idkey_" + i + "_" + i2 + "_" + i3)) {
                C115669n.INSTANCE.mo160138m(i, i2, i3, i4, true);
            }
        }

        /* renamed from: c */
        public final void mo112730c(File file, File file2) {
            BufferedInputStream bufferedInputStream;
            if (!file2.exists()) {
                file2.getParentFile().mkdirs();
            }
            BufferedOutputStream bufferedOutputStream = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read > 0) {
                                bufferedOutputStream2.write(bArr, 0, read);
                            } else {
                                Log.m105925i("MicroMsg.WeChatSplashStartup", "[+] moveDir, copy %s to %s.", file.getAbsolutePath(), file2.getAbsolutePath());
                                C116299g2.m163847c(bufferedOutputStream2);
                                C116299g2.m163847c(bufferedInputStream);
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        C116299g2.m163847c(bufferedOutputStream);
                        C116299g2.m163847c(bufferedInputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    C116299g2.m163847c(bufferedOutputStream);
                    C116299g2.m163847c(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
                C116299g2.m163847c(bufferedOutputStream);
                C116299g2.m163847c(bufferedInputStream);
                throw th;
            }
        }

        /* renamed from: e */
        public void mo1180e() {
            if (MMApplicationContext.isMainProcess()) {
                ((C119157j) C119157j.f356862d).mo183876g(new C80951a(), "FixMigrate");
            }
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112728a(com.tencent.p014mm.splash.C85791o.C85792a r15) {
        /*
            r14 = this;
            r0 = 2
            p787ai.C79546a.m96581e(r0)
            r1 = 1
            r2 = 0
            if (r15 != 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            j40.b r4 = r14.f237803c
            r4.mo122284f()
            j40.b r4 = r14.f237803c
            java.lang.String r5 = ":tools"
            boolean r4 = r4.mo71805c(r5)
            if (r4 == 0) goto L_0x0020
            com.tencent.mm.legacy.app.l r4 = new com.tencent.mm.legacy.app.l
            r4.<init>()
            goto L_0x0051
        L_0x0020:
            j40.b r4 = r14.f237803c
            java.lang.String r5 = ":appbrand"
            java.lang.String r4 = r4.f124988a
            if (r4 == 0) goto L_0x0043
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 == 0) goto L_0x004c
            com.tencent.mm.legacy.app.c r4 = new com.tencent.mm.legacy.app.c
            r4.<init>()
            goto L_0x0051
        L_0x004c:
            com.tencent.mm.legacy.app.f r4 = new com.tencent.mm.legacy.app.f
            r4.<init>()
        L_0x0051:
            j40.b r5 = r14.f237803c
            h40.a r5 = r5.f124989b
            h40.b[] r6 = new h40.C87423b[r2]
            r5.mo121844g(r4, r6)
            if (r3 != 0) goto L_0x006b
            java.util.ArrayList<com.tencent.mm.splash.SplashHackActivity> r4 = com.tencent.p014mm.splash.C85781g.f249823a
            f40.a0 r4 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$b r5 = new com.tencent.mm.legacy.app.WeChatSplashStartup$b
            r5.<init>(r14, r15)
            f40.g0<j40.b> r4 = r4.f251724a
            r4.f251794f = r5
        L_0x006b:
            f40.a0 r4 = f40.C86709a0.m107528h()
            if (r3 != 0) goto L_0x00ea
            com.tencent.mm.legacy.app.h r5 = com.tencent.p014mm.legacy.app.C80963h.f237818d
            if (r5 != 0) goto L_0x0080
            com.tencent.mm.legacy.app.h r5 = new com.tencent.mm.legacy.app.h
            r6 = 10
            java.lang.String r7 = "initThread"
            r5.<init>(r7, r6)
            com.tencent.p014mm.legacy.app.C80963h.f237818d = r5
        L_0x0080:
            com.tencent.mm.legacy.app.h r5 = com.tencent.p014mm.legacy.app.C80963h.f237818d
            android.os.HandlerThread r6 = r5.f237819a
            java.lang.String r7 = "MicroMsg.InitThreadController"
            if (r6 == 0) goto L_0x00d5
            boolean r6 = r6.isAlive()
            if (r6 != 0) goto L_0x008f
            goto L_0x00d5
        L_0x008f:
            android.os.HandlerThread r6 = r5.f237819a
            int r6 = r6.getThreadId()
            int r8 = android.os.Process.getThreadPriority(r6)     // Catch:{ Exception -> 0x00be }
            r9 = -8
            if (r9 != r8) goto L_0x00a3
            java.lang.String r0 = "setHighPriority No Need."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)     // Catch:{ Exception -> 0x00be }
            goto L_0x00db
        L_0x00a3:
            android.os.Process.setThreadPriority(r6, r9)     // Catch:{ Exception -> 0x00be }
            java.lang.String r8 = "InitThreadController:%d setHighPriority to %d"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00be }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00be }
            r0[r2] = r9     // Catch:{ Exception -> 0x00be }
            int r9 = android.os.Process.getThreadPriority(r6)     // Catch:{ Exception -> 0x00be }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00be }
            r0[r1] = r9     // Catch:{ Exception -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r0)     // Catch:{ Exception -> 0x00be }
            goto L_0x00db
        L_0x00be:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r2] = r6
            java.lang.String r6 = "thread:%d setHighPriority failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r6, r8)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r6)
            goto L_0x00db
        L_0x00d5:
            java.lang.String r0 = "setHighPriority failed thread is dead"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x00db:
            f40.a0 r0 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.p r6 = new com.tencent.mm.legacy.app.p
            r6.<init>(r14, r5)
            r0.mo121097c(r6)
            mp3.d r0 = r5.f237821c
            goto L_0x00eb
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            f40.g0<j40.b> r4 = r4.f251724a
            r4.getClass()
            java.lang.String r5 = "startup"
            f40.C86739i0.m107600b(r5)
            byte[] r5 = r4.f251791c
            monitor-enter(r5)
            boolean r6 = r4.f251792d     // Catch:{ all -> 0x027a }
            if (r6 == 0) goto L_0x0108
            java.lang.String r0 = "warning, mmskeleton has started up already."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x027a }
            h40.C87422a.m108608a(r0, r1)     // Catch:{ all -> 0x027a }
            monitor-exit(r5)     // Catch:{ all -> 0x027a }
            goto L_0x01ff
        L_0x0108:
            monitor-exit(r5)     // Catch:{ all -> 0x027a }
            com.tencent.mm.app.z0 r5 = com.tencent.p014mm.app.C80637z0.INSTANCE
            com.tencent.mm.app.z0$h r6 = com.tencent.p014mm.app.C80637z0.C80646h.UNTIL_KERNEL_STARTUP_BEGIN
            r5.mo112374e(r6)
            f40.j r5 = r4.mo121134b()
            j40.a r5 = r5.mo58407a()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "mmskeleton boot startup for process [%s]..."
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = r5.f124988a
            r9[r2] = r10
            h40.C87422a.m108608a(r8, r9)
            h40.a r8 = r5.f124989b
            r8.mo121840b()
            lp3.c r9 = lp3.C88643g.m110546d()
            lp3.e r9 = (lp3.C88633e) r9
            lp3.c r9 = r9.mo123063m(r1)
            j40.a$a r10 = r5.f124992e
            long r11 = java.lang.System.currentTimeMillis()
            r10.f124994b = r11
            java.lang.String r10 = "boot.helloWeChat()"
            bp3.C79760s.m96908a(r10)     // Catch:{ all -> 0x0275 }
            r8.mo121843f()     // Catch:{ all -> 0x0275 }
            bp3.C79760s.m96909b()
            j40.a$a r10 = r5.f124992e
            long r11 = java.lang.System.currentTimeMillis()
            r10.f124995c = r11
            java.lang.String r10 = "boot.installPlugins()"
            bp3.C79760s.m96908a(r10)     // Catch:{ all -> 0x0270 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0270 }
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x0270 }
            java.lang.String r13 = "boot install plugins..."
            h40.C87422a.m108608a(r13, r12)     // Catch:{ all -> 0x0270 }
            h40.b r12 = r8.f253333a     // Catch:{ all -> 0x0270 }
            r12.mo63021a()     // Catch:{ all -> 0x0270 }
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ all -> 0x0270 }
            java.lang.String r10 = h40.C87422a.m108609d(r10)     // Catch:{ all -> 0x0270 }
            r12[r2] = r10     // Catch:{ all -> 0x0270 }
            java.lang.String r10 = "boot install plugins done in [%s]."
            h40.C87422a.m108608a(r10, r12)     // Catch:{ all -> 0x0270 }
            bp3.C79760s.m96909b()
            java.lang.String r10 = "installPlugins"
            f40.C86739i0.m107600b(r10)
            j40.a$a r10 = r5.f124992e
            long r11 = java.lang.System.currentTimeMillis()
            r10.f124996d = r11
            java.lang.String r10 = "boot.makeDependency()"
            bp3.C79760s.m96908a(r10)     // Catch:{ all -> 0x026b }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026b }
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x026b }
            java.lang.String r13 = "boot make dependency of plugins..."
            h40.C87422a.m108608a(r13, r12)     // Catch:{ all -> 0x026b }
            h40.b r12 = r8.f253333a     // Catch:{ all -> 0x026b }
            r12.getClass()     // Catch:{ all -> 0x026b }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x026b }
            java.lang.String r10 = h40.C87422a.m108609d(r10)     // Catch:{ all -> 0x026b }
            r1[r2] = r10     // Catch:{ all -> 0x026b }
            java.lang.String r2 = "boot make dependency of done in [%s]."
            h40.C87422a.m108608a(r2, r1)     // Catch:{ all -> 0x026b }
            bp3.C79760s.m96909b()
            if (r0 == 0) goto L_0x01ad
            r9.mo123057H(r0)
        L_0x01ad:
            j40.a$a r0 = r5.f124992e
            java.lang.System.currentTimeMillis()
            r0.getClass()
            f40.b0 r0 = new f40.b0
            r0.<init>(r4)
            r9.mo123061d(r0)
            j40.a$a r0 = r5.f124992e
            long r1 = java.lang.System.currentTimeMillis()
            r0.f124997e = r1
            f40.c0 r0 = new f40.c0
            r0.<init>(r4, r8, r5)
            r9.mo123061d(r0)
            j40.a$a r0 = r5.f124992e
            java.lang.System.currentTimeMillis()
            r0.getClass()
            f40.d0 r0 = new f40.d0
            r0.<init>(r4)
            r9.mo123061d(r0)
            j40.a$a r0 = r5.f124992e
            long r1 = java.lang.System.currentTimeMillis()
            r0.f124998f = r1
            f40.e0 r0 = new f40.e0
            r0.<init>(r4, r8, r5)
            r9.mo123061d(r0)
            j40.a$a r0 = r5.f124992e
            long r1 = java.lang.System.currentTimeMillis()
            r0.f124999g = r1
            mp3.i r0 = mp3.C88819d.f256219UI
            f40.f0 r1 = new f40.f0
            r1.<init>(r4, r6, r5)
            r9.mo114039c(r0, r1)
        L_0x01ff:
            com.tencent.mm.legacy.app.WeChatSplashStartup$c r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$c
            r0.<init>(r14)
            com.tencent.p014mm.splash.C85781g.f249827e = r0
            com.tencent.mm.splash.c r0 = com.tencent.p014mm.legacy.app.C80965k.f237822a
            com.tencent.p014mm.splash.C85781g.f249828f = r0
            f40.a0 r0 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$d r1 = new com.tencent.mm.legacy.app.WeChatSplashStartup$d
            r1.<init>(r14, r3, r15)
            r0.mo121097c(r1)
            f40.a0 r15 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$e r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$e
            r0.<init>()
            r15.mo121097c(r0)
            f40.a0 r15 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$f r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$f
            r0.<init>(r14)
            r15.mo121097c(r0)
            f40.a0 r15 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$g r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$g
            r0.<init>()
            r15.mo121097c(r0)
            f40.a0 r15 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$h r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$h
            r0.<init>(r14)
            r15.mo121097c(r0)
            f40.a0 r15 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$i r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$i
            r0.<init>(r14)
            r15.mo121097c(r0)
            f40.a0 r15 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$j r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$j
            r0.<init>(r14)
            r15.mo121097c(r0)
            f40.a0 r15 = f40.C86709a0.m107528h()
            com.tencent.mm.legacy.app.WeChatSplashStartup$a r0 = new com.tencent.mm.legacy.app.WeChatSplashStartup$a
            r0.<init>(r14)
            r15.mo121097c(r0)
            return
        L_0x026b:
            r15 = move-exception
            bp3.C79760s.m96909b()
            throw r15
        L_0x0270:
            r15 = move-exception
            bp3.C79760s.m96909b()
            throw r15
        L_0x0275:
            r15 = move-exception
            bp3.C79760s.m96909b()
            throw r15
        L_0x027a:
            r15 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x027a }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.legacy.app.WeChatSplashStartup.mo112728a(com.tencent.mm.splash.o$a):void");
    }
}
