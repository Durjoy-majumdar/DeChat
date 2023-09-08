package com.tencent.p014mm.plugin.appbrand.app;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81271j;
import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81278k;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.launching.C83344j1;
import com.tencent.p014mm.plugin.appbrand.launching.C83356k1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedList;
import nr3.C89059e;
import ob0.C89132b;
import te3.C48698ad2;
import te3.C52246zc2;
import te3.C64294cr2;
import te3.C90404cb;
import te3.C90413gz1;
import te3.C90422jy;
import wi0.C38163u;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.app.h2 */
public class C29122h2 extends C86301e {

    /* renamed from: com.tencent.mm.plugin.appbrand.app.h2$a */
    public class C29123a implements C81278k.C81280b {
        public C29123a(C29122h2 h2Var) {
        }

        /* renamed from: a */
        public C89059e<C89132b.C89134c<C48698ad2>> mo56472a(C81278k kVar) {
            String str;
            String str2;
            C83344j1 j1Var = C83344j1.f243546a;
            C87412m.m108594g(kVar, "cgi");
            int i = C83344j1.C29580a.f80507a;
            StringBuilder sb = new StringBuilder();
            sb.append("wormholeForLegacyReleaseCode with ");
            C52246zc2 r = kVar.mo113564r();
            C87412m.m108593f(r, "cgi.request");
            sb.append(C83344j1.m102297f(r));
            sb.append(" intercepted");
            Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb.toString());
            C90404cb cbVar = new C90404cb();
            cbVar.f259441d.add(C83344j1.m102298g(kVar));
            LinkedList<C90413gz1> linkedList = cbVar.f259441d;
            C90413gz1 g = C83344j1.m102298g(kVar);
            g.f259537i = true;
            linkedList.add(g);
            int i2 = kVar.mo113564r().f145821w;
            cbVar.f259442e = i2;
            Log.m105925i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "CgiBatchGetPkgDownloadInfo scene:%d", Integer.valueOf(i2));
            if (kVar.mo113564r().f145810i > 0) {
                C81161g2.requireAccountInitializedOnDemand();
                C81258h3 h3Var = C81161g2.f238471g;
                String str3 = kVar.mo113564r().f145806e;
                String str4 = kVar.mo113564r().f145811j;
                int i3 = kVar.mo113564r().f145809h;
                String str5 = "";
                if (i3 == 0) {
                    str = str5;
                } else if (i3 != 6) {
                    str = ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
                    if (i3 != 12) {
                        if (i3 != 13) {
                            str = ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
                            if (i3 != 22) {
                                if (i3 != 23) {
                                    str = C81273j1.m99631a(str4);
                                } else {
                                    str = C81273j1.m99631a(str4) + '$' + str;
                                }
                            }
                        } else {
                            str = C81273j1.m99631a(str4) + '$' + str;
                        }
                    }
                } else {
                    str = ModulePkgInfo.PLUGIN_CODE;
                }
                String str6 = null;
                if (Util.isNullOrNil((String) null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    if (!Util.isNullOrNil(str)) {
                        str5 = '$' + str;
                    }
                    sb4.append(str5);
                    str2 = sb4.toString();
                } else {
                    str2 = null;
                }
                C29315z2 m = h3Var.mo113533pl(str2, kVar.mo113564r().f145810i, 0, "pkgPath");
                if (m != null) {
                    str6 = m.field_pkgPath;
                }
                int d = C86013q1.m106450k(str6) ? WxaPkg.m99509d(str6) : -1;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("wormholeForLegacyReleaseCode with ");
                C52246zc2 r2 = kVar.mo113564r();
                C87412m.m108593f(r2, "cgi.request");
                sb5.append(C83344j1.m102297f(r2));
                sb5.append(", intercepted, oldPkg.innerVersion=");
                sb5.append(d);
                Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb5.toString());
                if (d == 0) {
                    LinkedList<C90413gz1> linkedList2 = cbVar.f259441d;
                    C90413gz1 g2 = C83344j1.m102298g(kVar);
                    C64294cr2 cr22 = new C64294cr2();
                    g2.f259533e = cr22;
                    cr22.f182558d = kVar.mo113564r().f145810i;
                    linkedList2.add(g2);
                } else {
                    C115669n.INSTANCE.mo175911u(697, 20);
                }
            }
            C90422jy jyVar = new C90422jy();
            jyVar.f259641f = 1;
            cbVar.f259443f = jyVar;
            return new C81271j(cbVar).mo9225i().mo123062e(new C83356k1(kVar));
        }
    }

    public void onCreate(Context context) {
        C38163u uVar = C38163u.f100827a;
        uVar.mo61557a("gh_fa3775177794@app", "wx1975249228c5cea8", 1205);
        uVar.mo61557a("gh_15a734ca91f5@app", "wx6509e7dc7bdc968d", 1189);
        C81278k.f238684q = new C29123a(this);
    }
}
