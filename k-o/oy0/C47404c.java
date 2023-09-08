package oy0;

import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import iy0.C46353a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kj2.C117407d;
import ly0.C46908b;
import org.json.JSONObject;
import q73.C35796c0;
import q73.C35801d0;
import sx3.C110818d0;
import sx3.C36907w;
import t73.C48555a;
import t73.C48556b;
import t73.C48558d;
import te3.C49168dn;
import te3.o25;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: oy0.c */
public final class C47404c {

    /* renamed from: oy0.c$a */
    public static final class C35339a {

        /* renamed from: a */
        public final String f94646a;

        public C35339a(String str) {
            C87412m.m108594g(str, "url");
            this.f94646a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35339a) && C87412m.m108589b(this.f94646a, ((C35339a) obj).f94646a);
        }

        public int hashCode() {
            return this.f94646a.hashCode();
        }

        public String toString() {
            return "PrefetchRes(url=" + this.f94646a + ')';
        }
    }

    /* renamed from: oy0.c$b */
    public static final class C47405b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C35339a f127181d;

        /* renamed from: e */
        public final /* synthetic */ String f127182e;

        /* renamed from: f */
        public final /* synthetic */ String f127183f;

        /* renamed from: g */
        public final /* synthetic */ String f127184g;

        public C47405b(C35339a aVar, String str, String str2, String str3) {
            this.f127181d = aVar;
            this.f127182e = str;
            this.f127183f = str2;
            this.f127184g = str3;
        }

        public final void run() {
            C35339a aVar = this.f127181d;
            String str = this.f127182e;
            String str2 = this.f127183f;
            String str3 = this.f127184g;
            Log.m105927v("MicroMsg.WebPrefetcherResManager", "fetchRes url: %s, id: %s, host: %s, documentUrl: %s", aVar.f94646a, str, str2, str3);
            String str4 = aVar.f94646a;
            C48556b bVar = C48558d.f129902N;
            C40717k0 k0Var = C40717k0.f109363a;
            k0Var.getClass();
            C46353a aVar2 = r2;
            C46353a aVar3 = new C46353a(str4, str, bVar, C40717k0.f109366d, (String) null, (String) null, (Boolean) null, (C48555a) null, false, (String) null, (String) null, 2032, (C8480h) null);
            C46353a aVar4 = aVar2;
            C46908b.f126125a.mo72113a(k0Var.mo63615c(aVar.f94646a, aVar4), new C47406d(str2, str3, aVar4));
        }
    }

    /* renamed from: a */
    public static final void m52734a(List<String> list, String str, String str2) {
        C87412m.m108594g(list, "resUrlList");
        C87412m.m108594g(str, "host");
        C87412m.m108594g(str2, "documentUrl");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (String aVar : list) {
            arrayList.add(new C35339a(aVar));
        }
        m52735b(arrayList, str, str2);
    }

    /* renamed from: b */
    public static final void m52735b(List<C35339a> list, String str, String str2) {
        for (C35339a aVar : list) {
            String o = C40714i.m43966o(str, aVar.f94646a);
            C48558d.C48560b bVar = C48558d.f129896H;
            if (!C48558d.f129902N.mo73171A(o)) {
                ((C119157j) C119157j.f356862d).mo183875f(new C47405b(aVar, o, str, str2));
            }
        }
    }

    /* renamed from: c */
    public static final boolean m52736c(boolean z, boolean z2, C86009m1 m1Var, C46353a aVar, C46353a aVar2, String str, HashMap<String, List<String>> hashMap) {
        String str2;
        int i;
        byte[] bArr;
        String str3;
        String str4;
        int i2;
        int i3;
        String str5;
        C86009m1 m1Var2 = m1Var;
        C46353a aVar3 = aVar;
        C46353a aVar4 = aVar2;
        String str6 = str;
        HashMap<String, List<String>> hashMap2 = hashMap;
        C40717k0.C40719b bVar = C40717k0.C40719b.WX_PREFETCH_CONFIG_FILE;
        C87412m.m108594g(aVar3, "target");
        C87412m.m108594g(aVar4, "contentTarget");
        C87412m.m108594g(str6, "documentUrl");
        C87412m.m108594g(hashMap2, "resHeaders");
        String str7 = aVar3.f124924f;
        String str8 = "";
        if (str7 == null) {
            str7 = str8;
        }
        C40717k0.C40719b f = C40717k0.m43988f(hashMap);
        int i4 = 3;
        if (!z2 || m1Var2 == null || !m1Var.mo119967g()) {
            C115669n.INSTANCE.mo160131h(20780, str7, 0, 0, 3, 1, Integer.valueOf(f == bVar ? 2 : f == C40717k0.C40719b.WXA_PKG ? 1 : -1));
            return false;
        } else if (f == bVar) {
            if (!z && !aVar.mo71781w()) {
                if (aVar3.f124921c == null) {
                    Log.m105920e("MicroMsg.WebPrefetcherResManager", "handleResDownloadResult handleConfigFile error");
                    return false;
                }
                C117407d.INSTANCE.mo182089r(1454, 244, 1);
                C86009m1 B = aVar3.f124921c.mo73172B(aVar.mo71762d());
                boolean y = m1Var2.mo119988y(B);
                Log.m105925i("MicroMsg.WebPrefetcherResManager", "handleResDownloadResult type: %s, bizId: %s, rename: %s", f, aVar.mo71762d(), Boolean.valueOf(y));
                if (y) {
                    m1Var2 = B;
                } else {
                    Log.m105920e("MicroMsg.WebPrefetcherResManager", "handleResDownloadResult rename config file failed");
                    return false;
                }
            }
            String N = C86013q1.m106432N(m1Var2.mo119971i());
            Object[] objArr = new Object[3];
            objArr[0] = N;
            List list = aVar.mo71770l().get("x-wx-client-prefetch-host");
            if (list == null || (str5 = (String) C110818d0.m150914L(list)) == null) {
                str5 = str8;
            }
            objArr[1] = str5;
            objArr[2] = str6;
            Log.m105925i("MicroMsg.WebPrefetcherResManager", "handleResConfigFile config: %s, host: %s, documentUrl: %s", objArr);
            try {
                String optString = new JSONObject(N).optString("res_url_list");
                C87412m.m108593f(optString, "urlListString");
                List<String> U = C112550d0.m153785U(optString, new String[]{";"}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(C36907w.m41090l(U, 10));
                for (String aVar5 : U) {
                    arrayList.add(new C35339a(aVar5));
                }
                List list2 = aVar.mo71770l().get("x-wx-client-prefetch-host");
                if (list2 != null) {
                    String str9 = (String) C110818d0.m150914L(list2);
                    if (str9 != null) {
                        str8 = str9;
                    }
                }
                m52735b(arrayList, str8, str6);
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebPrefetcherResManager", e, "handleResConfigFile exception", new Object[0]);
                C117407d.INSTANCE.mo182089r(1454, 243, 1);
                return false;
            }
        } else {
            C35337b bVar2 = C35337b.f94642a;
            List list3 = hashMap2.get("x-wx-prefetch-baseversion");
            if (list3 == null || (str2 = (String) C110818d0.m150916N(list3)) == null) {
                str2 = str8;
            }
            if (!(str2.length() == 0)) {
                long currentTimeMillis = System.currentTimeMillis();
                o25 b = C35337b.m40643b(aVar2.mo71774p(), str2);
                List list4 = aVar2.mo71770l().get("x-wx-prefetch-pkg-md5");
                if (list4 == null || (str3 = (String) C110818d0.m150916N(list4)) == null) {
                    str3 = str8;
                }
                List list5 = hashMap2.get("x-wx-prefetch-patch-md5");
                if (list5 == null || (str4 = (String) C110818d0.m150916N(list5)) == null) {
                    str4 = str8;
                }
                if (b != null) {
                    String str10 = b.f138917e;
                    if (str10 == null) {
                        str10 = str8;
                    }
                    if (!m1Var.mo119967g()) {
                        i2 = 10;
                    } else {
                        if (str10.length() == 0) {
                            i2 = 11;
                        } else if (!C86013q1.m106450k(str10)) {
                            i2 = 12;
                        } else {
                            if (str3.length() == 0) {
                                i2 = 14;
                            } else {
                                if (str4.length() > 0) {
                                    String q = C86013q1.m106456q(m1Var.mo119976n());
                                    if (!C87412m.m108589b(q, str4)) {
                                        Log.m105920e("MicroMsg.WebPrefetcherPkgManager", "mergeDiff patchFile MD5 not match, downloaded: " + q + ", target: " + str4);
                                        i2 = 16;
                                    }
                                }
                                String str11 = str10 + ".patch";
                                if (((IBSPatchJNIService) C86312j.m106911c(IBSPatchJNIService.class)).bspatch(str10, str11, m1Var.mo119971i()) == 0) {
                                    Log.m105924i("MicroMsg.WebPrefetcherPkgManager", "mergeDiff patch download success");
                                    Uri n = C116299g2.m163858n(str11);
                                    String path = n.getPath();
                                    if (path != null) {
                                        String k = C116299g2.m163855k(path, false, false);
                                        if (!n.getPath().equals(k)) {
                                            n = n.buildUpon().path(k).build();
                                        }
                                    }
                                    String q2 = C86013q1.m106456q(C116299g2.m163865u(n));
                                    if (Util.isNullOrNil(q2) || !C87412m.m108589b(q2, str3)) {
                                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                                        if (l.mo177810a()) {
                                            l.f348991a.mo119933c(l.f348992b);
                                        }
                                        Log.m105921e("MicroMsg.WebPrefetcherPkgManager", "mergeDiff MD5 not match after patch, base: %s, patch: %s, computeMd5: %s, targetMd5: %s", str10, m1Var.mo119969h(), q2, str3);
                                        i2 = 15;
                                    } else {
                                        Log.m105924i("MicroMsg.WebPrefetcherPkgManager", "mergeDiff patch MD5 verify success");
                                        C86013q1.m106463x(C116299g2.m163865u(n), m1Var.mo119976n());
                                        i2 = 0;
                                    }
                                } else {
                                    Log.m105920e("MicroMsg.WebPrefetcherPkgManager", "mergeDiff patch fail");
                                    i2 = 13;
                                }
                            }
                        }
                    }
                } else {
                    i2 = 17;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m105924i("MicroMsg.WebPrefetcherPkgManager", "processMergeDiffPkg basePkg: " + b + ", result: " + i2 + ", fullPkgMd5: " + str3 + ", patchFileMd5: " + str4 + ", cost: " + (currentTimeMillis2 - currentTimeMillis) + LocaleUtil.MALAY);
                switch (i2) {
                    case 10:
                        i3 = 204;
                        break;
                    case 11:
                        i3 = 205;
                        break;
                    case 12:
                        i3 = 206;
                        break;
                    case 13:
                        i3 = 207;
                        break;
                    case 14:
                        i3 = 208;
                        break;
                    case 15:
                        i3 = 209;
                        break;
                    case 16:
                        i3 = 210;
                        break;
                    case 17:
                        i3 = 211;
                        break;
                    default:
                        i3 = -1;
                        break;
                }
                if (i3 != -1) {
                    C117407d.INSTANCE.mo182089r(1454, (long) i3, 1);
                }
                i = 2;
                i4 = i2 == 0 ? 5 : 4;
            } else if (m1Var.mo119967g()) {
                Log.m105924i("MicroMsg.WebPrefetcherPkgManager", "checkUpdateResult updateByFullPkg success, file size: " + C86013q1.m106451l(m1Var.mo119976n()));
                i = 2;
            } else {
                Log.m105920e("MicroMsg.WebPrefetcherPkgManager", "checkUpdateResult updateByFullPkg but pkg file not exist");
                i = 2;
                i4 = 2;
            }
            if (i4 == i) {
                C117407d.INSTANCE.mo182089r(1454, 201, 1);
            } else if (i4 == 3) {
                C117407d.INSTANCE.mo182089r(1454, 200, 1);
            } else if (i4 == 4) {
                C117407d.INSTANCE.mo182089r(1454, 203, 1);
            } else if (i4 == 5) {
                C117407d.INSTANCE.mo182089r(1454, 202, 1);
            }
            if (i4 == 3 || i4 == 5) {
                String p = aVar2.mo71774p();
                Log.m105925i("MicroMsg.WebPrefetcherResManager", "handleResPkg checkUpdateDiffResult success: %s, pkgKey: %s, appId: %s", Integer.valueOf(i4), p, aVar4.f124924f);
                C49168dn dnVar = new C49168dn();
                dnVar.f132423d = p;
                dnVar.f132424e = m1Var.mo119971i();
                dnVar.f132428i = aVar2.mo71775q();
                C35796c0.f95588a.mo60412n(p, dnVar);
                String str12 = dnVar.f132424e;
                C87412m.m108593f(str12, "pkgInfo.path");
                String q3 = aVar2.mo71775q();
                String k2 = aVar2.mo71769k();
                Set<String> decodeStringSet = C35337b.f94642a.mo60211d().decodeStringSet(p, new LinkedHashSet());
                Log.m105924i("MicroMsg.WebPrefetcherPkgManager", "alvinluo savePkgInfo appId: " + p + ", pkgVersion: " + q3 + ", pkgPath: " + str12);
                C87412m.m108593f(decodeStringSet, "set");
                for (String str13 : decodeStringSet) {
                    Log.m105926v("MicroMsg.WebPrefetcherPkgManager", "alvinluo savePkgInfo pkgVersion: " + str13);
                }
                o25 o25 = new o25();
                o25.f138916d = p;
                o25.f138917e = str12;
                o25.f138918f = q3;
                if (q3.length() > 0) {
                    decodeStringSet.add(q3);
                    C35337b bVar3 = C35337b.f94642a;
                    bVar3.mo60211d().encode(p, decodeStringSet);
                    String c = bVar3.mo60210c(p, q3);
                    bArr = o25.toByteArray();
                    bVar3.mo60211d().encode(c, bArr);
                    Log.m105926v("MicroMsg.WebPrefetcherPkgManager", "savePkgInfo pkgKey: " + c + ", pkgVersion: " + q3);
                } else {
                    bArr = null;
                }
                if (!(k2.length() == 0)) {
                    C35337b bVar4 = C35337b.f94642a;
                    String str14 = p + '_' + k2.hashCode();
                    if (bArr == null) {
                        bArr = o25.toByteArray();
                    }
                    Log.m105926v("MicroMsg.WebPrefetcherPkgManager", "savePkgInfoByUrl urlKey: " + str14 + ", pkgVersion: " + q3);
                    bVar4.mo60211d().encode(str14, bArr);
                }
                String str15 = aVar4.f124924f;
                if (str15 != null) {
                    str8 = str15;
                }
                String str16 = dnVar.f132424e;
                C87412m.m108593f(str16, "pkgInfo.path");
                ((C119157j) C119157j.f356862d).mo183875f(new C35801d0(str16, str8, 1));
                C117407d.INSTANCE.mo182089r(1454, 241, 1);
                return true;
            }
            Log.m105921e("MicroMsg.WebPrefetcherResManager", "handleResPkg checkUpdateDiffResult failed: %s", Integer.valueOf(i4));
            return false;
        }
    }
}
