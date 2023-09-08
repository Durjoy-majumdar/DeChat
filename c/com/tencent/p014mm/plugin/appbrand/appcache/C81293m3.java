package com.tencent.p014mm.plugin.appbrand.appcache;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.C81282k1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di0.C86296l;
import di3.C86312j;
import ei0.C86516a;
import ei0.C86518b;
import f40.C86709a0;
import h81.C32735h;
import java.util.Collection;
import js0.C88021l;
import js0.C9514m;
import te3.C90422jy;
import u24.C90599h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.m3 */
public final class C81293m3 {

    /* renamed from: c */
    public static volatile C81293m3 f238704c;

    /* renamed from: a */
    public final C88021l<String, m3$$b> f238705a = new C88021l<>();

    /* renamed from: b */
    public final C81355t2 f238706b = new C81355t2();

    /* renamed from: a */
    public static void m99675a(String str, m3$$b m3__b) {
        C81293m3 d;
        if (!Util.isNullOrNil(str) && m3__b != null && (d = m99678d()) != null) {
            d.f238705a.mo122464e(str, m3__b);
        }
    }

    /* renamed from: b */
    public static void m99676b(String str, String str2, C86518b.C86519a aVar, m3$$c m3__c) {
        Collection<m3$$b> f = m99680f(str, false);
        if (f != null) {
            for (m3$$b next : f) {
                if (next != null) {
                    next.mo113493a(str2, aVar, m3__c);
                }
            }
            return;
        }
        Log.m105919d("MicroMsg.WxaPkgUpdater", "callback, null callback appId = %s", str2);
    }

    /* renamed from: c */
    public static boolean m99677c() {
        if (AppBrandRuntimeWC.f238264Q1 || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_BLUE) {
            return true;
        }
        C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
        return (hVar == null || hVar.mo58779Qe(C32735h.C32737c.clicfg_appbrand_pkg_integrity_check, 0) == 0) ? false : true;
    }

    /* renamed from: d */
    public static C81293m3 m99678d() {
        if (!C86709a0.m107523b().f251765p || !C86312j.m106916h(C86296l.class)) {
            f238704c = null;
            return null;
        }
        if (f238704c == null) {
            synchronized (C81293m3.class) {
                if (f238704c == null) {
                    f238704c = new C81293m3();
                }
            }
        }
        return f238704c;
    }

    /* renamed from: e */
    public static void m99679e(String str, String str2, String str3, int i, int i2, String str4, C81282k1.C81283a aVar) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        int i3 = i;
        int i4 = i2;
        String str8 = str4;
        C86518b.C86519a aVar2 = C86518b.C86519a.LOCAL_FILE_NOT_FOUND;
        if (m99678d() == null) {
            Log.m105920e("MicroMsg.WxaPkgUpdater", "onDownloadComplete, get instance null !!!");
        } else if (Util.isNullOrNil(str3)) {
            Log.m105920e("MicroMsg.WxaPkgUpdater", "onDownloadComplete, filePath is null or nil");
            m99676b(str5, str6, aVar2, (m3$$c) null);
            aVar.mo113480g();
        } else {
            Uri n = C116299g2.m163858n(str3);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                Log.m105920e("MicroMsg.WxaPkgUpdater", "onDownloadComplete, pkg file not exists");
                m99676b(str5, str6, aVar2, (m3$$c) null);
                aVar.mo113480g();
                return;
            }
            C81347q0<? extends C29222i> rq02 = ((C86296l) C86312j.m106911c(C86296l.class)).rq0(str6, i4, i3, str8);
            if (rq02 == null) {
                Log.m105920e("MicroMsg.WxaPkgUpdater", "onDownloadComplete, WxaPkgStorage is null");
                m99676b(str5, str6, C86518b.C86519a.ENV_ERR, (m3$$c) null);
                return;
            }
            int i5 = !C81289m.C81290a.m99663a(i2) ? i3 : 1;
            C29222i iVar = !TextUtils.isEmpty(str4) ? (C29222i) rq02.mo113536r3(str6, i4, str8, new String[0]) : (C29222i) rq02.mo113533pl(str6, i5, i4, new String[0]);
            if (iVar == null) {
                Log.m105921e("MicroMsg.WxaPkgUpdater", "onDownloadComplete, no manifest record!!! with given appId(%s) version(%d) debugType(%d)", str6, Integer.valueOf(i), Integer.valueOf(i2));
                m99676b(str5, str6, C86518b.C86519a.FAILED, (m3$$c) null);
                return;
            }
            aVar.mo113483j();
            C9514m mVar = new C9514m();
            boolean j = !Util.isNullOrNil(str2) ? m99684j(new C86009m1(str7), new String[]{iVar.field_versionMd5, iVar.field_NewMd5}, str6, "onDownloadComplete", mVar) : false;
            aVar.mo113477d(j, (String) mVar.f29691a);
            if (!j) {
                C86013q1.m106447h(str3);
                m99676b(str5, str6, C86518b.C86519a.PKG_INVALID, (m3$$c) null);
                return;
            }
            iVar.field_pkgPath = str7;
            ((C119157j) C119157j.f356862d).mo183885p(new m3$$a(iVar, rq02), "MicroMsg.WxaPkgUpdater");
            Log.m105925i("MicroMsg.WxaPkgUpdater", "onDownloadComplete, update ret = %b, appId = %s, debugType = %d, pkgVersion = %d, versionDesc = %s, filePath = %s", Boolean.valueOf(C81277j3.m99636b(rq02, iVar)), str6, Integer.valueOf(i2), Integer.valueOf(i5), str8, str7);
            m99676b(str5, str6, C86518b.C86519a.OK, new m3$$c(str6, str7, i3, i4));
            WxaPkgDownloadCompleteNotifyEvent wxaPkgDownloadCompleteNotifyEvent = new WxaPkgDownloadCompleteNotifyEvent();
            WxaPkgDownloadCompleteNotifyEvent.C28858a aVar3 = wxaPkgDownloadCompleteNotifyEvent.f79073d;
            aVar3.f79074a = str6;
            aVar3.f79075b = str7;
            aVar3.f79077d = i3;
            aVar3.f79078e = i4;
            aVar3.f79076c = iVar.field_versionMd5;
            wxaPkgDownloadCompleteNotifyEvent.publish();
        }
    }

    /* renamed from: f */
    public static Collection<m3$$b> m99680f(String str, boolean z) {
        C81293m3 d;
        if (Util.isNullOrNil(str) || (d = m99678d()) == null) {
            return null;
        }
        if (z) {
            Log.m105925i("MicroMsg.WxaPkgUpdater", "removeCallbacks, key[%s]", str);
        }
        return d.f238705a.mo122466g(str);
    }

    /* renamed from: g */
    public static boolean m99681g(C86516a aVar, m3$$b m3__b) {
        if (m99678d() == null) {
            Log.m105920e("MicroMsg.WxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
            return false;
        } else if (aVar == null) {
            return false;
        } else {
            m99675a(aVar.f249581a, m3__b);
            int a = m99678d().f238706b.mo113631a(aVar);
            if (a == 0 || a == 2) {
                return true;
            }
            m99676b(aVar.f249581a, aVar.f251357l, C86518b.C86519a.ENV_ERR, (m3$$c) null);
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m99682h(String str, int i, int i2, int i3, String str2, C90422jy jyVar, m3$$b m3__b) {
        if (m99678d() == null) {
            Log.m105920e("MicroMsg.WxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
            return false;
        }
        C86516a a = C81374v2.m99811a(str, i, i2, i3, str2);
        if (a == null) {
            Log.m105921e("MicroMsg.WxaPkgUpdater", "startDownloadPkg, create Null request, appId %s, pkgType %d, pkgVersion %d, url %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
            return false;
        }
        a.f251361p = jyVar;
        boolean g = m99681g(a, m3__b);
        Log.m105925i("MicroMsg.WxaPkgUpdater", "startDownloadPkg, request.urlKey[%s], ret[%b]", a.f249581a, Boolean.valueOf(g));
        return g;
    }

    /* renamed from: i */
    public static boolean m99683i(String str, int i, int i2, String str2, m3$$b m3__b) {
        return m99682h(str, i, i2, 0, str2, (C90422jy) null, m3__b);
    }

    /* renamed from: j */
    public static boolean m99684j(C86009m1 m1Var, String[] strArr, String str, String str2, C9514m<String> mVar) {
        String c = WxaPkgIntegrityChecker.m99520c(m1Var.mo119971i());
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            T t = strArr[i];
            if (TextUtils.isEmpty(t) || !t.equals(c)) {
                i++;
            } else {
                Log.m105925i("MicroMsg.WxaPkgUpdater", "[%s]verifyPkg, appId[%s] verify ok with checksumMd5[%s]", str2, str, t);
                if (mVar != null) {
                    mVar.f29691a = t;
                }
                return true;
            }
        }
        Log.m105921e("MicroMsg.WxaPkgUpdater", "[%s]verifyPkg, appId[%s] checksumMd5List[%s] != file.md5[%s]", str2, str, C90599h.m113515h(strArr, ","), c);
        return false;
    }
}
