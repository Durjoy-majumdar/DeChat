package b12;

import a70.C112760b;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import p271xn.C91295i;
import p271xn.C91298n;
import te3.C51247si;
import te3.C64828xf2;
import te3.rg4;
import z41.C53736a;
import z41.C53737b;

/* renamed from: b12.d */
public class C79645d {

    /* renamed from: a */
    public static final Map<String, String> f233530a = new ConcurrentHashMap();

    /* renamed from: b */
    public static String f233531b = "tinker-boots-install-info";

    /* renamed from: c */
    public static String f233532c = "tinker-boots-last-show";

    /* renamed from: d */
    public static String f233533d = "tinker-boots-show-time";

    /* renamed from: e */
    public static String f233534e = "hdiff-boots-install-info";

    /* renamed from: f */
    public static int f233535f = -1;

    /* renamed from: g */
    public static String f233536g = "boots-install-kv";

    /* renamed from: h */
    public static String f233537h = "";

    /* renamed from: a */
    public static void m96725a(rg4 rg4, TinkerSyncResponse tinkerSyncResponse) {
        if (rg4 != null && tinkerSyncResponse != null) {
            Log.m105925i("MicroMsg.UpdateUtil", "addDialogInfoFromTinkerRespone, response = %s", tinkerSyncResponse);
            if (tinkerSyncResponse.mo118353j() == 4 || tinkerSyncResponse.mo118353j() == 3) {
                rg4.f259810u = tinkerSyncResponse.f248355x ? 1 : 0;
                rg4.f259811v = tinkerSyncResponse.f248356y ? 1 : 0;
                rg4.f259812w = tinkerSyncResponse.f248357z ? 1 : 0;
                rg4.f259814y = tinkerSyncResponse.f248336B;
                rg4.f259813x = tinkerSyncResponse.f248337C;
            }
        }
    }

    /* renamed from: b */
    public static void m96726b(TinkerSyncResponse tinkerSyncResponse) {
        Class cls = C91298n.class;
        try {
            C51247si h = m96732h();
            if (h == null) {
                h = new C51247si();
            }
            h.f141526d++;
            h.f141535p = System.currentTimeMillis();
            m96742r(h);
            if (tinkerSyncResponse != null) {
                ((C91298n) C86312j.m106911c(cls)).Ka0(2, tinkerSyncResponse.f248340f.intValue(), 0, (int) (h.f141535p - h.f141534o), tinkerSyncResponse.f248345n);
            } else {
                ((C91298n) C86312j.m106911c(cls)).Ka0(21, -1, 0, (int) (h.f141535p - h.f141534o), -1);
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.UpdateUtil", "HdiffApk, addDownloadCount, e  = " + e);
        }
    }

    /* renamed from: c */
    public static void m96727c(int i, int i2) {
        try {
            f233535f = i2;
            C51247si h = m96732h();
            if (h == null) {
                h = new C51247si();
            }
            h.f141527e++;
            h.f141530h = "" + i;
            h.f141534o = System.currentTimeMillis();
            h.f141533n = System.currentTimeMillis();
            m96742r(h);
        } catch (Exception e) {
            Log.m105924i("MicroMsg.UpdateUtil", "HdiffApk, addNoticeCount, e  = " + e);
        }
    }

    /* renamed from: d */
    public static void m96728d(TinkerSyncResponse tinkerSyncResponse, int i) {
        Class cls = C91298n.class;
        ((C91298n) C86312j.m106911c(cls)).Uj0(32, tinkerSyncResponse.f248340f.intValue(), i, 0, tinkerSyncResponse.f248345n, 0);
        C51247si h = m96732h();
        if (h != null) {
            try {
                ((C91298n) C86312j.m106911c(cls)).Uj0(3, tinkerSyncResponse.f248340f.intValue(), i, (int) (h.f141535p - h.f141534o), tinkerSyncResponse.f248345n, (int) (System.currentTimeMillis() - h.f141535p));
            } catch (Exception e) {
                Log.m105924i("MicroMsg.UpdateUtil", "HdiffApk, addPatchMergeCount, e  = " + e);
            }
        } else {
            Log.m105924i("MicroMsg.UpdateUtil", "HdiffApk, addPatchMergeCount, info  = " + h + ", response = " + tinkerSyncResponse);
            try {
                ((C91298n) C86312j.m106911c(cls)).Uj0(31, tinkerSyncResponse.f248340f.intValue(), i, -1, -1, -1);
            } catch (Exception e2) {
                Log.m105924i("MicroMsg.UpdateUtil", "HdiffApk, addPatchMergeCount, e  = " + e2);
            }
        }
    }

    /* renamed from: e */
    public static void m96729e() {
        Log.m105924i("MicroMsg.UpdateUtil", "clearHdiffInstallStatus.");
        try {
            MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f233534e, "").apply();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
        }
    }

    /* renamed from: f */
    public static void m96730f(Context context) {
        Log.m105924i("MicroMsg.UpdateUtil", "clearInstallUpdateInfo.");
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4);
        sharedPreferences.edit().putString(f233531b, "").apply();
        sharedPreferences.edit().putLong(f233532c, 0).apply();
        sharedPreferences.edit().putInt(f233533d, 0).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m96731g(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x004f
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r1 != 0) goto L_0x000a
            goto L_0x004f
        L_0x000a:
            java.util.Map<java.lang.String, java.lang.String> r1 = f233530a
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x001e
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L_0x001e:
            monitor-enter(r1)
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x004d }
            boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0033
            r0 = r1
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x004d }
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r3
        L_0x0033:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x003d
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r3)     // Catch:{ all -> 0x004d }
        L_0x003d:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x0049
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x004d }
            r2.put(r3, r0)     // Catch:{ all -> 0x004d }
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r0
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r3
        L_0x004d:
            r3 = move-exception
            goto L_0x004b
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b12.C79645d.m96731g(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static te3.C51247si m96732h() {
        /*
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "tinker_patch_share_config"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = f233536g
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "MicroMsg.UpdateUtil"
            r3 = 0
            if (r1 != 0) goto L_0x003c
            r1 = 0
            te3.si r4 = new te3.si     // Catch:{ Exception -> 0x0030 }
            r4.<init>()     // Catch:{ Exception -> 0x0030 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ Exception -> 0x002e }
            pe3.a r0 = r4.parseFrom(r0)     // Catch:{ Exception -> 0x002e }
            te3.si r0 = (te3.C51247si) r0     // Catch:{ Exception -> 0x002e }
            goto L_0x003d
        L_0x002e:
            r0 = move-exception
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            r4 = r3
        L_0x0032:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "parse tinker install failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r1)
            r0 = r4
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return r0
        L_0x0040:
            java.lang.String r0 = "HdiffApk, update info is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b12.C79645d.m96732h():te3.si");
    }

    /* renamed from: i */
    public static String m96733i(Context context) {
        if (((C91295i) C86312j.m106911c(C91295i.class)).mc0() && ((C91298n) C86312j.m106911c(C91298n.class)).Tg0()) {
            Log.m105924i("MicroMsg.UpdateUtil", "getCurrentApkPath user adb old.apk");
            File file = new File("/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/tmp/old.apk");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: j */
    public static String m96734j() {
        if (Util.isNullOrNil(f233537h)) {
            f233537h = C112760b.m154247s() + "diff/";
        }
        return f233537h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static te3.C64828xf2 m96735k() {
        /*
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "tinker_patch_share_config"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = f233534e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "MicroMsg.UpdateUtil"
            r3 = 0
            if (r1 != 0) goto L_0x003c
            r1 = 0
            te3.xf2 r4 = new te3.xf2     // Catch:{ Exception -> 0x0030 }
            r4.<init>()     // Catch:{ Exception -> 0x0030 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ Exception -> 0x002e }
            pe3.a r0 = r4.parseFrom(r0)     // Catch:{ Exception -> 0x002e }
            te3.xf2 r0 = (te3.C64828xf2) r0     // Catch:{ Exception -> 0x002e }
            goto L_0x003d
        L_0x002e:
            r0 = move-exception
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            r4 = r3
        L_0x0032:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "parse tinker install failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r1)
            r0 = r4
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return r0
        L_0x0040:
            java.lang.String r0 = "update info is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b12.C79645d.m96735k():te3.xf2");
    }

    /* renamed from: l */
    public static String m96736l(String str) {
        return m96734j() + str + ".apk";
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static te3.rg4 m96737m() {
        /*
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "tinker_patch_share_config"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = f233531b
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "MicroMsg.UpdateUtil"
            r3 = 0
            if (r1 != 0) goto L_0x003c
            r1 = 0
            te3.rg4 r4 = new te3.rg4     // Catch:{ Exception -> 0x0030 }
            r4.<init>()     // Catch:{ Exception -> 0x0030 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ Exception -> 0x002e }
            pe3.a r0 = r4.parseFrom(r0)     // Catch:{ Exception -> 0x002e }
            te3.rg4 r0 = (te3.rg4) r0     // Catch:{ Exception -> 0x002e }
            goto L_0x003d
        L_0x002e:
            r0 = move-exception
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            r4 = r3
        L_0x0032:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "parse tinker install failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r1)
            r0 = r4
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return r0
        L_0x0040:
            java.lang.String r0 = "update info is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b12.C79645d.m96737m():te3.rg4");
    }

    /* renamed from: n */
    public static boolean m96738n(String str) {
        boolean z = false;
        if (!C86013q1.m106450k(str)) {
            Log.m105924i("MicroMsg.UpdateUtil", "isApkZipCanBeUsed, no exist, zipPath = " + str);
            return false;
        }
        try {
            new ZipFile(new File(str));
            z = true;
        } catch (ZipException e) {
            Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.UpdateUtil", e2, "", new Object[0]);
        }
        Log.m105924i("MicroMsg.UpdateUtil", "isApkZipCanBeUsed = " + z + ", zipPath = " + str);
        return z;
    }

    /* renamed from: o */
    public static boolean m96739o() {
        C64828xf2 k = m96735k();
        if (k == null) {
            return false;
        }
        try {
            long parseLong = Long.parseLong(k.f186294d);
            Log.m105920e("MicroMsg.UpdateUtil", "Hdiffapk, downloadId downloadId = " + parseLong);
            C53737b f = C40933j.m44317f();
            C53736a Yt = f == null ? null : f.mo74326Yt(parseLong);
            return Yt != null && Yt.field_status == 1;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.UpdateUtil", "Hdiffapk, isNeedShowTinkerDialog e = " + e);
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m96740p() {
        C64828xf2 k = m96735k();
        if (k == null) {
            return false;
        }
        boolean equals = "3".equals(k.f186297g);
        Log.m105920e("MicroMsg.UpdateUtil", "Hdiffapk, isPatchMergeing = " + equals);
        return equals;
    }

    /* renamed from: q */
    public static int m96741q(String str) {
        int i;
        if (!Util.isNullOrNil(str)) {
            try {
                i = Integer.decode(str).intValue();
            } catch (Exception unused) {
            }
            Log.m105925i("MicroMsg.UpdateUtil", "parseClientVersion %s %s", str, Integer.valueOf(i));
            return i;
        }
        i = 0;
        Log.m105925i("MicroMsg.UpdateUtil", "parseClientVersion %s %s", str, Integer.valueOf(i));
        return i;
    }

    /* renamed from: r */
    public static void m96742r(C51247si siVar) {
        if (siVar != null) {
            try {
                MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f233536g, Base64.encodeToString(siVar.toByteArray(), 0)).apply();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
            }
        }
        Log.m105918d("MicroMsg.UpdateUtil", "saveBootInstallKVStatus update info.");
    }

    /* renamed from: s */
    public static void m96743s(C64828xf2 xf22) {
        if (xf22 != null) {
            try {
                MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f233534e, Base64.encodeToString(xf22.toByteArray(), 0)).apply();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
            }
        }
        Log.m105918d("MicroMsg.UpdateUtil", "save tinker install update info.");
    }

    /* renamed from: t */
    public static void m96744t(rg4 rg4) {
        if (rg4 != null) {
            try {
                MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f233531b, Base64.encodeToString(rg4.toByteArray(), 0)).apply();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
            }
            Log.m105918d("MicroMsg.UpdateUtil", "save tinker install update info.");
        }
    }

    /* renamed from: u */
    public static void m96745u() {
        Log.m105924i("MicroMsg.UpdateUtil", "HdiffApk, clearBootInstallKVInfo.");
        try {
            MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f233536g, "").apply();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
        }
    }
}
