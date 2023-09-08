package de2;

import a70.C112760b;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import ce2.C28545b;
import ce2.C28546c;
import com.tencent.p014mm.app.C114663g0;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import iv3.C87824b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.xwalk.core.XWalkEnvironment;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: de2.g */
public class C86244g implements C28546c {

    /* renamed from: d */
    public static final String f250838d = C28545b.m38262a("³¸¦º¤·ÿ¶»¾£§¨®­©£¯¦« ");

    /* renamed from: e */
    public static final String f250839e;

    /* renamed from: f */
    public static final String f250840f;

    /* renamed from: g */
    public static final String f250841g;

    /* renamed from: h */
    public static final String f250842h;

    /* renamed from: i */
    public static final String f250843i = C28545b.m38262a("î±£¨");

    /* renamed from: j */
    public static final List<C86257k<C86254i>> f250844j;

    /* renamed from: de2.g$a */
    public class C86245a extends C86257k<C86254i> {
        /* renamed from: a */
        public boolean mo120662a(Object obj) {
            return C28545b.m38262a("î©¥¶£¡±©ç").equals(((C86254i) obj).f250856b);
        }

        /* renamed from: b */
        public void mo120663b(Object obj) {
            C86254i iVar = (C86254i) obj;
            try {
                C86244g.m106853a(iVar.f250855a, C86230b.m106832e().mo119971i(), false);
            } catch (Throwable th) {
                Log.printErrStackTrace(C86244g.f250838d, th, "explained by code.", new Object[0]);
            }
        }
    }

    /* renamed from: de2.g$b */
    public class C86246b extends C86257k<C86254i> {
        /* renamed from: a */
        public boolean mo120662a(Object obj) {
            return C28545b.m38262a("í¨ª· ¨¤¤ºç").equals(((C86254i) obj).f250856b);
        }

        /* renamed from: b */
        public void mo120663b(Object obj) {
            C86254i iVar = (C86254i) obj;
            try {
                C86009m1 g = C86230b.m106834g();
                C86009m1 e = C86244g.m106854e();
                C86230b.m106829b(g, e, (C86011o1) null, "" + C28545b.m38262a("ðì®¢¦­§¾½¡·µ®¯¯øã") + BuildInfo.CLIENT_VERSION + "\n" + C28545b.m38262a("ææµ¥·øã") + BuildInfo.REV + "\n");
                C86244g.m106853a(iVar.f250855a, e.mo119971i(), true);
            } catch (Throwable th) {
                Log.printErrStackTrace(C86244g.f250838d, th, "explained by code.", new Object[0]);
            }
        }
    }

    /* renamed from: de2.g$c */
    public class C86247c extends C86257k<C86254i> {
        /* renamed from: a */
        public boolean mo120662a(Object obj) {
            return C28545b.m38262a("í¨ª· ±¤¤ºç").equals(((C86254i) obj).f250856b);
        }

        /* renamed from: b */
        public void mo120663b(Object obj) {
            C86254i iVar = (C86254i) obj;
            try {
                C86009m1 h = C86230b.m106835h();
                C86009m1 e = C86244g.m106854e();
                C86230b.m106829b(h, e, (C86011o1) null, "" + C28545b.m38262a("ðì®¢¦­§¾½¡·µ®¯¯øã") + BuildInfo.CLIENT_VERSION + "\n" + C28545b.m38262a("ææµ¥·øã") + BuildInfo.REV + "\n");
                C86244g.m106853a(iVar.f250855a, e.mo119971i(), true);
            } catch (Throwable th) {
                Log.printErrStackTrace(C86244g.f250838d, th, "explained by code.", new Object[0]);
            }
        }
    }

    /* renamed from: de2.g$d */
    public class C86248d extends C86257k<C86254i> {
        /* renamed from: a */
        public boolean mo120662a(Object obj) {
            String str = ((C86254i) obj).f250856b;
            return str.startsWith(C28545b.m38262a("áµª¡±±")) && str.endsWith("$");
        }

        /* renamed from: b */
        public void mo120663b(Object obj) {
            C86254i iVar = (C86254i) obj;
            try {
                String[] f = C86244g.m106855f(iVar.f250856b);
                if (f != null) {
                    Context context = MMApplicationContext.getContext();
                    String str = iVar.f250855a;
                    String str2 = C86252h.f250845a;
                    Intent intent = new Intent(C86252h.f250845a);
                    intent.putExtra(C86252h.f250846b, C86252h.f250847c);
                    intent.putExtra(C86252h.f250850f, str);
                    intent.putExtra(C86252h.f250848d, f);
                    context.sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
                }
            } catch (Throwable th) {
                Log.printErrStackTrace(C86244g.f250838d, th, "explained by code.", new Object[0]);
            }
        }
    }

    /* renamed from: de2.g$e */
    public class C86249e extends C86257k<C86254i> {
        /* renamed from: a */
        public boolean mo120662a(Object obj) {
            return C28545b.m38262a("é­ºº»¯¥°¶¦´¢ªç").equals(((C86254i) obj).f250856b);
        }

        /* renamed from: b */
        public void mo120663b(Object obj) {
            C86254i iVar = (C86254i) obj;
            ApplicationLike applicationLike = C80589e.f235760a;
            if (!C87824b.m109281c(applicationLike)) {
                Log.m105920e(C86244g.f250838d, "No patch.");
                return;
            }
            try {
                File patchDirectory = SharePatchFileUtil.getPatchDirectory(applicationLike.getApplication());
                File file = new File(patchDirectory, SharePatchFileUtil.getPatchVersionDirectory(SharePatchInfo.readAndCheckPropertyWithLock(SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath()), SharePatchFileUtil.getPatchInfoLockFile(patchDirectory.getAbsolutePath())).newVersion));
                C86009m1 e = C86244g.m106854e();
                C86230b.m106829b(new C86009m1(file.getAbsolutePath()), e, (C86011o1) null, (String) null);
                C86244g.m106853a(iVar.f250855a, e.mo119971i(), true);
            } catch (Throwable th) {
                Log.printErrStackTrace(C86244g.f250838d, th, "Explained by code.", new Object[0]);
            }
        }
    }

    /* renamed from: de2.g$f */
    public class C86250f extends C86257k<C86254i> {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo120662a(Object obj) {
            C86254i iVar = (C86254i) obj;
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[Catch:{ all -> 0x0093 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x007e A[Catch:{ all -> 0x0093 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo120663b(java.lang.Object r9) {
            /*
                r8 = this;
                de2.g$i r9 = (de2.C86244g.C86254i) r9
                java.lang.String r0 = "\n"
                r1 = 0
                java.lang.String r2 = r9.f250856b     // Catch:{ all -> 0x0093 }
                java.lang.String r2 = de2.C86244g.m106856g(r2)     // Catch:{ all -> 0x0093 }
                com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x0093 }
                r3.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0093 }
                boolean r4 = r3.mo119967g()     // Catch:{ all -> 0x0093 }
                if (r4 == 0) goto L_0x008b
                boolean r4 = r3.mo119961a()     // Catch:{ all -> 0x0093 }
                if (r4 == 0) goto L_0x008b
                java.lang.String r4 = "/EnMicroMsg.db"
                boolean r4 = r2.endsWith(r4)     // Catch:{ all -> 0x0093 }
                r5 = 1
                if (r4 == 0) goto L_0x0026
                goto L_0x0037
            L_0x0026:
                java.lang.String r4 = "/EnMicroMsg2.db"
                boolean r4 = r2.endsWith(r4)     // Catch:{ all -> 0x0093 }
                if (r4 == 0) goto L_0x002f
                goto L_0x0037
            L_0x002f:
                java.lang.String r4 = "/EnMicroMsg_temp.db"
                boolean r4 = r2.endsWith(r4)     // Catch:{ all -> 0x0093 }
                if (r4 == 0) goto L_0x0039
            L_0x0037:
                r4 = 0
                goto L_0x003a
            L_0x0039:
                r4 = 1
            L_0x003a:
                if (r4 == 0) goto L_0x007e
                com.tencent.mm.vfs.m1 r4 = de2.C86244g.m106854e()     // Catch:{ all -> 0x0093 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
                r6.<init>()     // Catch:{ all -> 0x0093 }
                java.lang.String r7 = ""
                r6.append(r7)     // Catch:{ all -> 0x0093 }
                java.lang.String r7 = "ìè¦¸¢£è¶¦´©øã"
                java.lang.String r7 = ce2.C28545b.m38262a(r7)     // Catch:{ all -> 0x0093 }
                r6.append(r7)     // Catch:{ all -> 0x0093 }
                java.lang.String r7 = r9.f250856b     // Catch:{ all -> 0x0093 }
                r6.append(r7)     // Catch:{ all -> 0x0093 }
                r6.append(r0)     // Catch:{ all -> 0x0093 }
                java.lang.String r7 = "ìè»¯ª¨è¶¦´©øã"
                java.lang.String r7 = ce2.C28545b.m38262a(r7)     // Catch:{ all -> 0x0093 }
                r6.append(r7)     // Catch:{ all -> 0x0093 }
                r6.append(r2)     // Catch:{ all -> 0x0093 }
                r6.append(r0)     // Catch:{ all -> 0x0093 }
                java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0093 }
                r2 = 0
                de2.C86230b.m106829b(r3, r4, r2, r0)     // Catch:{ all -> 0x0093 }
                java.lang.String r9 = r9.f250855a     // Catch:{ all -> 0x0093 }
                java.lang.String r0 = r4.mo119971i()     // Catch:{ all -> 0x0093 }
                de2.C86244g.m106853a(r9, r0, r5)     // Catch:{ all -> 0x0093 }
                goto L_0x009d
            L_0x007e:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0093 }
                java.lang.String r0 = "¦¾ë¥©ª¨·¤¦í"
                java.lang.String r0 = ce2.C28545b.m38262a(r0)     // Catch:{ all -> 0x0093 }
                r9.<init>(r0)     // Catch:{ all -> 0x0093 }
                throw r9     // Catch:{ all -> 0x0093 }
            L_0x008b:
                java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0093 }
                java.lang.String r0 = "Target is not exist or cannot be read."
                r9.<init>(r0)     // Catch:{ all -> 0x0093 }
                throw r9     // Catch:{ all -> 0x0093 }
            L_0x0093:
                r9 = move-exception
                java.lang.String r0 = de2.C86244g.f250838d
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "Failure."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r2, r1)
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: de2.C86244g.C86250f.mo120663b(java.lang.Object):void");
        }
    }

    /* renamed from: de2.g$g */
    public class C86251g implements Runnable {
        public C86251g(C86244g gVar) {
        }

        public void run() {
            try {
                C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getExternalCacheDir(), C28545b.m38262a("¢´½¾¤¨£¤"));
                if (m1Var.mo119967g()) {
                    HashSet hashSet = new HashSet(16);
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
                    int myUid = Process.myUid();
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (next.uid == myUid) {
                            hashSet.add(Integer.valueOf(next.pid));
                        }
                    }
                    C86009m1[] v = m1Var.mo119985v(new C86255i());
                    if (v != null) {
                        for (C86009m1 m1Var2 : v) {
                            int safeParseInt = Util.safeParseInt(m1Var2.getName().split("\\.")[1]);
                            if (safeParseInt != 0) {
                                if (!hashSet.contains(Integer.valueOf(safeParseInt))) {
                                    m1Var2.mo119966f();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace(C86244g.f250838d, th, "Explained by code.", new Object[0]);
            }
        }
    }

    /* renamed from: de2.g$h */
    public static final class C86252h extends BroadcastReceiver {

        /* renamed from: a */
        public static final String f250845a = C28545b.m38262a("¯¬¼ ¥¥·£¶µ¤±·");

        /* renamed from: b */
        public static final String f250846b = C28545b.m38262a("¤´ ¢¯§");

        /* renamed from: c */
        public static final String f250847c = C28545b.m38262a("¯ ª½¹¦¤¥¡´­ ²°");

        /* renamed from: d */
        public static final String f250848d = C28545b.m38262a("­¿©¸»¥¨¡¶µ¬¨±·");

        /* renamed from: e */
        public static final String f250849e = C28545b.m38262a("®£«¼º§«¤¢¦¨®¦");

        /* renamed from: f */
        public static final String f250850f = C28545b.m38262a("©»­¶±¾® ¯¦");

        /* renamed from: g */
        public static final String f250851g = C28545b.m38262a("¥·¡° ¶«");

        /* renamed from: h */
        public static final String f250852h = C28545b.m38262a("·¥·¶¶ ¯©¼¬¸§ª«·¬¤¶¦");

        /* renamed from: de2.g$h$a */
        public class C86253a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f250853d;

            /* renamed from: e */
            public final /* synthetic */ Intent f250854e;

            public C86253a(C86252h hVar, String str, Intent intent) {
                this.f250853d = str;
                this.f250854e = intent;
            }

            public void run() {
                if (C86252h.f250847c.equals(this.f250853d)) {
                    Intent intent = this.f250854e;
                    String stringExtra = intent.getStringExtra(C86252h.f250850f);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        String[] stringArrayExtra = intent.getStringArrayExtra(C86252h.f250848d);
                        if (!Util.isNullOrNil(stringArrayExtra)) {
                            int length = stringArrayExtra.length;
                            int i = 0;
                            while (i < length) {
                                String str = stringArrayExtra[i];
                                if (!str.equals(MMApplicationContext.getProcessName())) {
                                    i++;
                                } else {
                                    try {
                                        C86009m1 e = C86244g.m106854e();
                                        C86009m1 m1Var = new C86009m1("/proc/self/smaps");
                                        C86230b.m106838k(m1Var);
                                        C86230b.m106829b(m1Var, e, (C86011o1) null, "" + C28545b.m38262a("êê»¶ª¥¢³²øã") + str + "\n");
                                        Context context = MMApplicationContext.getContext();
                                        String i2 = e.mo119971i();
                                        Intent intent2 = new Intent(C86252h.f250845a);
                                        intent2.putExtra(C86252h.f250846b, C86252h.f250849e);
                                        intent2.putExtra(C86252h.f250850f, stringExtra);
                                        intent2.putExtra(C86252h.f250851g, i2);
                                        intent2.putExtra(C86252h.f250852h, true);
                                        context.sendBroadcast(intent2, WeChatPermissions.PERMISSION_MM_MESSAGE());
                                        return;
                                    } catch (Throwable th) {
                                        Log.printErrStackTrace(C86244g.f250838d, th, "Explained by code.", new Object[0]);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } else if (C86252h.f250849e.equals(this.f250853d) && MMApplicationContext.isMainProcess()) {
                    Intent intent3 = this.f250854e;
                    C86244g.m106853a(intent3.getStringExtra(C86252h.f250850f), intent3.getStringExtra(C86252h.f250851g), intent3.getBooleanExtra(C86252h.f250852h, false));
                }
            }
        }

        public C86252h(C86245a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            if (!f250845a.equals(intent.getAction())) {
                Log.m105920e(C86244g.f250838d, "Explained by site 1.");
                return;
            }
            String stringExtra = intent.getStringExtra(f250846b);
            ((C119157j) C119157j.f356862d).mo183875f(new C86253a(this, stringExtra, intent));
        }
    }

    /* renamed from: de2.g$i */
    public static class C86254i {

        /* renamed from: a */
        public final String f250855a;

        /* renamed from: b */
        public final String f250856b;

        public C86254i(String str, String str2, int i) {
            this.f250855a = str;
            this.f250856b = str2;
        }
    }

    static {
        String a = C28545b.m38262a("ý¹½¢ ©­¢¨ µé¦¨®¦");
        f250839e = a;
        f250840f = a + C28545b.m38262a("é° ¶«");
        f250841g = a + C28545b.m38262a("ê·²¿® ¯¦");
        f250842h = a + C28545b.m38262a("è¢­ «¯");
        ArrayList arrayList = new ArrayList(16);
        f250844j = arrayList;
        arrayList.add(new C86245a());
        arrayList.add(new C86246b());
        arrayList.add(new C86247c());
        arrayList.add(new C86248d());
        arrayList.add(new C86249e());
        arrayList.add(new C86250f());
    }

    /* renamed from: a */
    public static void m106853a(String str, String str2, boolean z) {
        try {
            C114663g0.m161243c(str2, 12347, C86709a0.m107523b().mo121110g(), str, (String) null, new C75353h(z));
        } catch (Throwable th) {
            Log.printErrStackTrace(f250838d, th, "Failure.", new Object[0]);
        }
    }

    /* renamed from: e */
    public static C86009m1 m106854e() {
        return C86230b.m106830c(C28545b.m38262a("®°¹º") + System.currentTimeMillis() + "." + Process.myPid(), f250843i);
    }

    /* renamed from: f */
    public static String[] m106855f(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf < 0) {
            return null;
        }
        String[] split = str.substring(indexOf + 1, str.length() - 1).toLowerCase(Locale.ENGLISH).split("\\s*;\\s*");
        String applicationId = MMApplicationContext.getApplicationId();
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(XWalkEnvironment.MODULE_MM)) {
                split[i] = applicationId;
            } else {
                split[i] = applicationId + XVFSFile.PATH_SEPARATOR + split[i];
            }
        }
        return split;
    }

    /* renamed from: g */
    public static String m106856g(String str) {
        return new File(str.replaceAll(m106857h("app_base"), C86230b.m106832e().mo119973k()).replaceAll(m106857h("app_data"), C112760b.m154216X()).replaceAll(m106857h("ext_data"), C112760b.m154230f0()).replaceAll(m106857h("abi"), BuildInfo.IS_ARM64 ? XWalkEnvironment.RUNTIME_ABI_ARM64_STR : XWalkEnvironment.RUNTIME_ABI_ARM32_STR).replaceAll(m106857h("arch"), BuildInfo.IS_ARM64 ? "arm64" : "arm").replaceAll(m106857h("lib_arch"), BuildInfo.IS_ARM64 ? "lib64" : "lib")).getCanonicalPath();
    }

    /* renamed from: h */
    public static String m106857h(String str) {
        String replaceAll = str.replaceAll("\\$", "\\\\$").replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}").replaceAll("\\.", "\\\\.").replaceAll("\\?", "\\\\?").replaceAll("\\*", "\\\\*");
        return "(?<![$\\\\])\\$\\{" + replaceAll + "\\}";
    }

    /* renamed from: b */
    public String mo56049b() {
        return f250839e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051 A[SYNTHETIC, Splitter:B:29:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56050c(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r9 = this;
            java.lang.String r0 = f250840f
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x004d
        L_0x0012:
            char[] r1 = r0.toCharArray()
            int r4 = r1.length
            r4 = r4 & 3
            if (r4 == 0) goto L_0x001c
            goto L_0x0010
        L_0x001c:
            int r4 = r1.length
            r5 = 0
        L_0x001e:
            if (r5 >= r4) goto L_0x004c
            char r6 = r1[r5]
            r7 = 65
            if (r6 < r7) goto L_0x002b
            r7 = 90
            if (r6 > r7) goto L_0x002b
            goto L_0x0049
        L_0x002b:
            r7 = 97
            if (r6 < r7) goto L_0x0034
            r7 = 122(0x7a, float:1.71E-43)
            if (r6 > r7) goto L_0x0034
            goto L_0x0049
        L_0x0034:
            r7 = 48
            if (r6 < r7) goto L_0x003d
            r7 = 57
            if (r6 > r7) goto L_0x003d
            goto L_0x0049
        L_0x003d:
            r7 = 61
            if (r6 == r7) goto L_0x0049
            r7 = 47
            if (r6 == r7) goto L_0x0049
            r7 = 43
            if (r6 != r7) goto L_0x0010
        L_0x0049:
            int r5 = r5 + 1
            goto L_0x001e
        L_0x004c:
            r1 = 1
        L_0x004d:
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x005e }
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ all -> 0x005e }
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x005e }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x005e }
            r5 = r1
            goto L_0x005f
        L_0x005e:
        L_0x005f:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x006d
            java.lang.String r10 = f250838d
            java.lang.String r0 = "Explained by site 1."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            return
        L_0x006d:
            java.lang.String r0 = f250841g
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = f250842h
            java.lang.Object r10 = r10.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            r10.getClass()
            java.lang.String r1 = "any"
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x008d
            r4 = 1
        L_0x008d:
            zt3.t r10 = zt3.C119157j.f356862d
            de2.f r1 = new de2.f
            r1.<init>()
            zt3.j r10 = (zt3.C119157j) r10
            r10.getClass()
            r6 = 0
            lu3.c r10 = r10.mo183880k(r1, r6)
            r6 = 1500(0x5dc, double:7.41E-321)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r10.get(r6, r1)     // Catch:{ all -> 0x00ae }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00ae }
            boolean r2 = r1.booleanValue()     // Catch:{ all -> 0x00ae }
            goto L_0x00bb
        L_0x00ae:
            r1 = move-exception
            java.lang.String r6 = f250838d
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = "Explained by code."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r8, r7)
            r10.cancel(r3)
        L_0x00bb:
            if (r2 != 0) goto L_0x00c7
            if (r4 != r3) goto L_0x00c7
            java.lang.String r10 = f250838d
            java.lang.String r0 = "Explained by site 2."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            return
        L_0x00c7:
            de2.g$i r10 = new de2.g$i
            r10.<init>(r0, r5, r4)
            java.util.List<de2.k<de2.g$i>> r0 = f250844j
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00d4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f3
            java.lang.Object r1 = r0.next()
            de2.k r1 = (de2.C86257k) r1
            boolean r2 = r1.mo120662a(r10)
            if (r2 == 0) goto L_0x00d4
            zt3.t r0 = zt3.C119157j.f356862d
            de2.j r2 = new de2.j
            r2.<init>(r1, r10)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r2)
            return
        L_0x00f3:
            java.lang.String r10 = f250838d
            java.lang.String r0 = "Explained by site 3."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de2.C86244g.mo56050c(java.util.Map):void");
    }

    /* renamed from: d */
    public void mo56051d() {
        C86252h hVar = new C86252h((C86245a) null);
        try {
            MMApplicationContext.getContext().registerReceiver(hVar, new IntentFilter(C86252h.f250845a), WeChatPermissions.PERMISSION_MM_MESSAGE(), (Handler) null);
        } catch (Throwable th) {
            Log.printErrStackTrace(f250838d, th, "Explained by code.", new Object[0]);
        }
        C119179t tVar = C119157j.f356862d;
        C86251g gVar = new C86251g(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183886q(gVar, 10000, (String) null);
    }
}
