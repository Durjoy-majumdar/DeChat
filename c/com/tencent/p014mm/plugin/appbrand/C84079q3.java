package com.tencent.p014mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29182a4;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C68579f0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81295n0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81355t2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81396z3;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.page.C83864o3;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84871v;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.BuildConfig;
import com.tencent.xweb.file.XVFSFile;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gs0.C87324b;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import hi0.C87507t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kr0.C33987b1;
import sx3.C36907w;
import u24.C90595a;
import u24.C90599h;
import vq0.C90865l;
import wi0.C90975b0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.q3 */
public final class C84079q3 {

    /* renamed from: a */
    public final AtomicBoolean f245491a = new AtomicBoolean();

    /* renamed from: a */
    public final void mo116739a() {
        if (this.f245491a.get()) {
            throw new InterruptedException();
        }
    }

    /* renamed from: b */
    public final void mo116740b(List<String> list) {
        C86009m1 m1Var = new C86009m1(C83864o3.f244851c.mo116423c());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119966f();
            return;
        }
        C86009m1[] u = m1Var.mo119984u();
        if (u != null) {
            if (!(u.length == 0)) {
                HashMap hashMap = new HashMap();
                Iterator a = C32617c.m39769a(u);
                while (true) {
                    C32616b bVar = (C32616b) a;
                    if (bVar.hasNext()) {
                        C86009m1 m1Var2 = (C86009m1) bVar.next();
                        String name = m1Var2.getName();
                        C87412m.m108593f(name, "file.name");
                        String quote = Pattern.quote("-");
                        C87412m.m108593f(quote, "quote(MPPageScriptProvid…eCacheImpl.SPLITTER + \"\")");
                        Object[] array = C112550d0.m153785U(name, new String[]{quote}, false, 0, 6, (Object) null).toArray(new String[0]);
                        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        String[] strArr = (String[]) array;
                        if (strArr.length < 2) {
                            C86013q1.m106447h(m1Var2.mo119971i());
                            C86013q1.m106446g(m1Var2.mo119971i(), true);
                        } else {
                            String str = strArr[0];
                            if (!list.contains(str)) {
                                Log.m105924i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, appId not include");
                            } else {
                                if (C87412m.m108589b(BuildConfig.INSTALL_TYPE, str)) {
                                    str = "@LibraryAppId";
                                }
                                int i = Util.getInt(C90599h.m113521n(strArr[1], 1), 0);
                                int[] iArr = (int[]) hashMap.get(str);
                                if (iArr == null) {
                                    C81161g2.requireAccountInitializedOnDemand();
                                    iArr = C81161g2.f238471g.mo113543y(str);
                                    if (iArr == null) {
                                        iArr = new int[]{0};
                                    }
                                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, C90595a.m113499c(iArr, "-1"));
                                    hashMap.put(str, iArr);
                                }
                                if (!C90595a.m113497a(iArr, i)) {
                                    C86013q1.m106447h(m1Var2.mo119971i());
                                    C86013q1.m106446g(m1Var2.mo119971i(), true);
                                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, file(%s) deleted", m1Var2.mo119971i());
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        m1Var.mo119966f();
    }

    /* renamed from: c */
    public final void mo116741c(List<String> list) {
        mo116739a();
        C81396z3 z3Var = (C81396z3) C86312j.m106911c(C81396z3.class);
        for (String Lr0 : list) {
            mo116739a();
            z3Var.Lr0(Lr0);
        }
    }

    /* renamed from: d */
    public final void mo116742d(List<String> list) {
        mo116739a();
        LinkedList linkedList = new LinkedList();
        C81161g2.requireAccountInitializedOnDemand();
        C81258h3 h3Var = C81161g2.f238471g;
        C84080a aVar = new C84080a();
        for (String next : list) {
            if (!C87412m.m108589b("@LibraryAppId", next)) {
                WxaAttributes mL = C81161g2.Cx0().mo114011mL(next, "versionInfo");
                if (mL == null || Util.isNullOrNil(mL.field_versionInfo)) {
                    linkedList.add(next);
                } else {
                    mo116739a();
                    if (aVar.containsKey(next)) {
                        C81331p.C29266b bVar = (C81331p.C29266b) aVar.get(next);
                        if (bVar == null) {
                            Log.m105920e("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, pkg is null!");
                        } else {
                            Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d", bVar.f79951d, Integer.valueOf(bVar.f79953f), Integer.valueOf(h3Var.mo113523g(bVar.f79951d, bVar.f79952e, bVar.f79953f)), Integer.valueOf(h3Var.mo113522f(bVar.f79951d, bVar.f79952e, bVar.f79953f)));
                        }
                    } else {
                        int i = mL.mo113942o2() == null ? 0 : mL.mo113942o2().f239452d;
                        int i2 = i + 1;
                        if (i > 0) {
                            int[] y = h3Var.mo113543y(next);
                            int g = h3Var.mo113523g(next, 0, i2);
                            if (g > 0) {
                                Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanRelease, delete record(%s) < %d, count(%d)", next, Integer.valueOf(i), Integer.valueOf(g));
                                if (y != null) {
                                    if (!(y.length == 0)) {
                                        for (int a : y) {
                                            C86013q1.m106446g(C83864o3.f244851c.mo116421a(next, a), true);
                                        }
                                    }
                                }
                            }
                            h3Var.mo113522f(next, 0, i2);
                            C87324b bVar2 = (C87324b) C81161g2.Bx0(C87324b.class);
                            if (bVar2 != null) {
                                bVar2.mo121719jo(next, 0, new C87324b.C32518b.C32521c(i2));
                            }
                            C29182a4 a4Var = (C29182a4) C81161g2.Bx0(C29182a4.class);
                            if (a4Var != null) {
                                a4Var.mo56499jo(next, i2);
                            }
                            C90975b0 b0Var = (C90975b0) C81161g2.Bx0(C90975b0.class);
                            if (b0Var != null) {
                                b0Var.mo125054uP(next, i2);
                            }
                        }
                    }
                }
            }
        }
        if (!Util.isNullOrNil((List) linkedList)) {
            HashSet hashSet = new HashSet(linkedList);
            C81161g2.requireAccountInitializedOnDemand();
            C81258h3 h3Var2 = C81161g2.f238471g;
            C7335d c = C86312j.m106911c(C33987b1.class);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
            List<C81331p.C29266b> vx02 = ((C81331p) c).vx0();
            if (!vx02.isEmpty()) {
                for (C81331p.C29266b next2 : vx02) {
                    String str = next2.f79951d;
                    int i3 = next2.f79952e;
                    int i4 = next2.f79953f;
                    hashSet.remove(str);
                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d", str, Integer.valueOf(i4), Integer.valueOf(h3Var2.mo113523g(str, i3, i4)), Integer.valueOf(h3Var2.mo113522f(str, i3, i4)));
                }
            }
            long millis = TimeUnit.SECONDS.toMillis(Util.nowSecond() - AppBrandGlobalSystemConfig.m100099b().f239288K.f239338e);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!Util.isNullOrNil(str2)) {
                    C87412m.m108591d(str2);
                    if (C112551y.m153808h(str2, ModulePkgInfo.PLUGIN_CODE, false, 2, (Object) null)) {
                    }
                }
                if (C87507t.m108819a().mo121959a(str2)) {
                    Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact appID(%s) is pre-download-ing, skip", str2);
                } else {
                    List<C29315z2> t = h3Var2.mo113538t(str2, 0);
                    C87412m.m108593f(t, "wxaPkgStorage.selectAllI…EBUG_PKG_TYPE_AS_RELEASE)");
                    for (C29315z2 next3 : t) {
                        if (TextUtils.isEmpty(next3.field_pkgPath)) {
                            Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, empty path, delete record(%s, %d)", next3.field_appId, Integer.valueOf(next3.field_version));
                            h3Var2.mo113517a(next3);
                        } else {
                            long m = C86013q1.m106452m(next3.field_pkgPath);
                            if (m <= 0) {
                                Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, path not found, delete record(%s, %d)", next3.field_appId, Integer.valueOf(next3.field_version));
                                h3Var2.mo113517a(next3);
                            } else if (m <= millis) {
                                Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, file expired(mtime:%d, expired_time:%d), delete record(%s, %d)", Long.valueOf(m), Long.valueOf(millis), next3.field_appId, Integer.valueOf(next3.field_version));
                                C86013q1.m106447h(next3.field_pkgPath);
                                h3Var2.mo113517a(next3);
                            } else {
                                Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, file valid(mtime:%d, expired_time:%d), keep it(%s, %d).", Long.valueOf(m), Long.valueOf(millis), next3.field_appId, Integer.valueOf(next3.field_version));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo116743e() {
        String str = C86709a0.m107535s().f251807e;
        C87412m.m108593f(str, "accPath");
        if (!C112551y.m153808h(str, "/", false, 2, (Object) null)) {
            str = str + XVFSFile.SEPARATOR_CHAR;
        }
        String str2 = str + "appbrand/pkg/";
        FilePathGenerator.checkMkdir(str2);
        mo116744f(str2);
        String b = C81355t2.m99776b();
        FilePathGenerator.checkMkdir(b);
        C87412m.m108593f(b, "ret");
        mo116744f(b);
    }

    /* renamed from: f */
    public final void mo116744f(String str) {
        C86009m1[] u;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (u = m1Var.mo119984u()) != null) {
            C81295n0 n0Var = (C81295n0) C86312j.m106911c(C81295n0.class);
            for (C86009m1 m1Var2 : u) {
                if (m1Var2.mo119978p()) {
                    String i = m1Var2.mo119971i();
                    C87412m.m108593f(i, "file.absolutePath");
                    C81161g2.requireAccountInitializedOnDemand();
                    if (!C81161g2.f238471g.mo113524h(i)) {
                        C84871v vVar = (C84871v) C86312j.m106911c(C84871v.class);
                        if (!(vVar != null ? vVar.mo117589zk(m1Var2) : false)) {
                            n0Var.mo56504vC(i);
                            C68579f0.m80843a(i);
                        }
                    }
                } else if (m1Var2.mo119977o()) {
                    String i2 = m1Var2.mo119971i();
                    C87412m.m108593f(i2, "file.absolutePath");
                    mo116744f(i2);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo116745g(List<String> list) {
        mo116739a();
        for (String a : list) {
            mo116739a();
            C86013q1.m106445f(C90865l.m113956a(a));
        }
    }

    /* renamed from: h */
    public final void mo116746h(List<String> list) {
        List<C80264l> a = AppBrandProcessesManager.f246131g.mo116962a().mo111386a();
        ArrayList<String> arrayList = new ArrayList<>(C36907w.m41090l(a, 10));
        for (C80264l lVar : a) {
            arrayList.add(lVar.f234965a);
        }
        for (String str : arrayList) {
            if (list.contains(str)) {
                C80254f.m97662v(AppBrandProcessesManager.f246131g.mo116962a(), str, 0, false, 6, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q3$a */
    public static final class C84080a extends HashMap<String, C81331p.C29266b> {
        public C84080a() {
            C7335d c = C86312j.m106911c(C33987b1.class);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
            for (C81331p.C29266b next : ((C81331p) c).vx0()) {
                if (next != null) {
                    put(next.f79951d, next);
                }
            }
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj == null ? true : obj instanceof String)) {
                return false;
            }
            return super.containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj == null ? true : obj instanceof C81331p.C29266b)) {
                return false;
            }
            return super.containsValue((C81331p.C29266b) obj);
        }

        public final /* bridge */ Set<Map.Entry<String, C81331p.C29266b>> entrySet() {
            return super.entrySet();
        }

        public final /* bridge */ Object get(Object obj) {
            if (!(obj == null ? true : obj instanceof String)) {
                return null;
            }
            return (C81331p.C29266b) super.get((String) obj);
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj == null ? true : obj instanceof String) ? obj2 : (C81331p.C29266b) super.getOrDefault((String) obj, (C81331p.C29266b) obj2);
        }

        public final /* bridge */ Set<String> keySet() {
            return super.keySet();
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj == null ? true : obj instanceof String)) {
                return null;
            }
            return (C81331p.C29266b) super.remove((String) obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<C81331p.C29266b> values() {
            return super.values();
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            boolean z = true;
            if (!(obj == null ? true : obj instanceof String)) {
                return false;
            }
            if (obj2 != null) {
                z = obj2 instanceof C81331p.C29266b;
            }
            if (!z) {
                return false;
            }
            return super.remove((String) obj, (C81331p.C29266b) obj2);
        }
    }
}
