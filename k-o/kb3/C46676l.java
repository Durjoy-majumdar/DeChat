package kb3;

import android.content.SharedPreferences;
import android.net.Uri;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wepkg.model.C44500j;
import com.tencent.p014mm.plugin.wepkg.model.C44501k;
import com.tencent.p014mm.plugin.wepkg.model.C44502l;
import com.tencent.p014mm.plugin.wepkg.model.C44509m;
import com.tencent.p014mm.plugin.wepkg.model.WepkgPreloadFile;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.utils.C44532a;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import k00.C46633d;

/* renamed from: kb3.l */
public class C46676l {

    /* renamed from: a */
    public static Map<String, C44501k> f125644a = new HashMap();

    /* renamed from: b */
    public static boolean f125645b = true;

    /* renamed from: c */
    public static int f125646c = 0;

    /* renamed from: a */
    public static int m51981a(String str) {
        if (!f125645b) {
            return 12;
        }
        if (C41853c.m45367a()) {
            Log.m105924i("MicroMsg.WePkgLoader", "config wepkg disable");
            f125645b = false;
            return 12;
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("we_pkg_sp", 4);
        if (sharedPreferences == null || !sharedPreferences.getBoolean("disable_we_pkg", false)) {
            return 0;
        }
        Log.m105924i("MicroMsg.WePkgLoader", "white screen, disable wepkg");
        f125645b = false;
        return 11;
    }

    /* renamed from: b */
    public static C44501k m51982b(String str, boolean z) {
        boolean z2;
        Log.m105919d("MicroMsg.WePkgLoader", "load, url: %s", str);
        if (!C80907o.m98784g(MMApplicationContext.getMainProcessName())) {
            C44536d.m48915a("", new C46674j());
            C44532a.m48912c("EnterWeb", str, C46633d.m51936a(str), (String) null, 0, 0, C44532a.m48913d(10));
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            Log.m105920e("MicroMsg.WePkgLoader", "wepkg service is dead, start");
            C115669n.INSTANCE.mo175911u(859, 36);
            return new C44501k(10, false, "");
        }
        int a = m51981a(str);
        if (a != 0) {
            Log.m105920e("MicroMsg.WePkgLoader", "load enable false");
            return new C44501k(a, false, "");
        }
        Object obj = C44536d.f120770a;
        String a2 = C46633d.m51936a(str);
        if (z) {
            Log.m105919d("MicroMsg.WePkgLoader", "updateWePkg Bgn: %d", Long.valueOf(System.currentTimeMillis()));
            C44536d.m48918d().postToWorker(new C46675k(a2));
        }
        return Util.isNullOrNil(a2) ? new C44501k(9, false, "") : m51983c(str);
    }

    /* renamed from: c */
    public static C44501k m51983c(String str) {
        C44501k kVar;
        C44501k kVar2;
        WepkgVersion wepkgVersion;
        Object obj = C44536d.f120770a;
        String a = C46633d.m51936a(str);
        boolean z = false;
        if (((HashMap) f125644a).containsKey(a)) {
            C44501k kVar3 = (C44501k) ((HashMap) f125644a).get(a);
            String host = Util.isNullOrNil(str) ? "" : Uri.parse(str).getHost();
            if (!(kVar3 == null || (wepkgVersion = kVar3.f120697d) == null || !host.equalsIgnoreCase(wepkgVersion.f120659o))) {
                WepkgVersion wepkgVersion2 = kVar3.f120697d;
                Log.m105925i("MicroMsg.WePkgLoader", "memory has pkgid:%s record, version:%s", wepkgVersion2.f120651d, wepkgVersion2.f120653f);
                return kVar3;
            }
        }
        synchronized (C44502l.class) {
            Log.m105918d("MicroMsg.Wepkg.WepkgManager", "loadWepkg");
            String a2 = C46633d.m51936a(str);
            String host2 = Util.isNullOrNil(str) ? "" : Uri.parse(str).getHost();
            long currentTimeMillis = System.currentTimeMillis();
            if (!Util.isNullOrNil(a2)) {
                if (!Util.isNullOrNil(host2)) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(859, 6, 1, false);
                    WepkgVersion e = C44509m.m48884e(a2);
                    if (e == null) {
                        Log.m105925i("MicroMsg.Wepkg.WepkgManager", "DB dont have valid record, pkgid:%s, domain:%s, version:%s:", a2, "", "");
                        C44532a.m48912c("EnterWeb", str, a2, (String) null, 0, 0, C44532a.m48913d(14));
                        nVar.idkeyStat(859, 7, 1, false);
                        kVar = new C44501k(14, false, "");
                    } else {
                        boolean z2 = e.f120667w;
                        if (z2) {
                            if (e.f120668x || !e.f120669y) {
                                if (!host2.equalsIgnoreCase(e.f120659o)) {
                                    Log.m105925i("MicroMsg.Wepkg.WepkgManager", "the domain not match, pkgid:%s, version:%s, UrlDomain[%s] != DBDomain[%s]", a2, e.f120653f, host2, e.f120659o);
                                    C44532a.m48912c("EnterWeb", str, a2, (String) null, 0, 0, C44532a.m48913d(13));
                                    nVar.idkeyStat(859, 8, 1, false);
                                    kVar = new C44501k(13, true, e.f120653f);
                                } else {
                                    WepkgVersion wepkgVersion3 = e;
                                    if (Util.isNullOrNil(wepkgVersion3.f120653f)) {
                                        Log.m105925i("MicroMsg.Wepkg.WepkgManager", "this pkgid(%s) is disable form server", a2);
                                        C44532a.m48912c("EnterWeb", str, a2, (String) null, 0, 0, C44532a.m48913d(15));
                                        nVar.idkeyStat(859, 9, 1, false);
                                        kVar2 = new C44501k(15, true, wepkgVersion3.f120653f);
                                    } else {
                                        C44500j c = C44502l.m48873c(a2, wepkgVersion3.f120653f, wepkgVersion3.f120654g, wepkgVersion3.f120660p, wepkgVersion3.f120662r);
                                        if (c != null || Util.isNullOrNil(wepkgVersion3.f120654g)) {
                                            Map<String, WepkgPreloadFile> d = C44502l.m48874d(a2, wepkgVersion3.f120669y);
                                            if (d == null) {
                                                C44532a.m48912c("EnterWeb", str, a2, wepkgVersion3.f120653f, 0, 0, C44532a.m48913d(18));
                                                nVar.idkeyStat(859, 11, 1, false);
                                                kVar2 = new C44501k(18, true, wepkgVersion3.f120653f);
                                            } else {
                                                C44501k kVar4 = new C44501k(wepkgVersion3, c, d);
                                                Log.m105925i("MicroMsg.Wepkg.WepkgManager", "loadWepkg time:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                                nVar.idkeyStat(859, 12, 1, false);
                                                kVar = kVar4;
                                            }
                                        } else {
                                            C44532a.m48912c("EnterWeb", str, a2, wepkgVersion3.f120653f, 0, 0, C44532a.m48913d(17));
                                            nVar.idkeyStat(859, 11, 1, false);
                                            kVar2 = new C44501k(17, true, wepkgVersion3.f120653f);
                                        }
                                    }
                                    kVar = kVar2;
                                }
                            }
                        }
                        WepkgVersion wepkgVersion4 = e;
                        Log.m105925i("MicroMsg.Wepkg.WepkgManager", "local cache disable, pkgid:%s, version:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s", wepkgVersion4.f120651d, wepkgVersion4.f120653f, Boolean.valueOf(z2), Boolean.valueOf(wepkgVersion4.f120668x), Boolean.valueOf(wepkgVersion4.f120669y));
                        C44532a.m48912c("EnterWeb", str, a2, wepkgVersion4.f120653f, 0, 0, C44532a.m48913d(16));
                        nVar.idkeyStat(859, 10, 1, false);
                        kVar2 = new C44501k(16, false, wepkgVersion4.f120653f);
                        kVar = kVar2;
                    }
                }
            }
            Log.m105921e("MicroMsg.Wepkg.WepkgManager", "pkgId = %s, domain = %s", a2, host2);
            kVar = new C44501k(8, false, "");
        }
        if (kVar.f120672a == 0) {
            z = true;
        }
        if (z) {
            ((HashMap) f125644a).put(a, kVar);
        }
        return kVar;
    }
}
