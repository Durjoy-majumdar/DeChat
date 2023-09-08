package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.pluginsdk.model.app.C44549d1;
import com.tencent.p014mm.pluginsdk.model.app.C44583u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C30733e5;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import java.util.Iterator;
import java.util.Map;
import md2.C47000b;
import ob0.C47350c;
import ra1.C47958b;
import te3.C49120db2;
import te3.yo4;

/* renamed from: com.tencent.mm.pluginsdk.model.s0 */
public class C44596s0 implements C44583u0 {

    /* renamed from: e */
    public static boolean f120909e;

    /* renamed from: f */
    public static C44596s0 f120910f;

    /* renamed from: d */
    public C44597a f120911d;

    /* renamed from: com.tencent.mm.pluginsdk.model.s0$a */
    public interface C44597a {
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.s0$b */
    public static class C44598b {

        /* renamed from: a */
        public String f120912a;
    }

    /* renamed from: c3 */
    public void mo69343c3(int i, int i2, String str, C44549d1 d1Var) {
        C44598b bVar;
        Map<String, String> parseXml;
        if (C97625j3.m125811a()) {
            Log.m105919d("MicroMsg.GetUserInfoInAppLogic", "onSceneEnd errType=%s errCode=%s", Integer.valueOf(i), Integer.valueOf(i2));
            if (d1Var == null) {
                Log.m105920e("MicroMsg.GetUserInfoInAppLogic", "scene == null");
            } else if (i != 0 || i2 != 0 || d1Var.mo69338b() != 14) {
            } else {
                if (MMApplicationContext.getContext() == null || C47000b.C34548a.m40384a() == null) {
                    Log.m105920e("MicroMsg.GetUserInfoInAppLogic", "wrong environment");
                    return;
                }
                Log.m105921e("MicroMsg.GetUserInfoInAppLogic", "NetSceneGetUserInfoInApp come back", Integer.valueOf(i), Integer.valueOf(i2));
                C44599z0 z0Var = (C44599z0) d1Var;
                C44597a aVar = this.f120911d;
                if (aVar != null) {
                    C47958b.C47959a aVar2 = (C47958b.C47959a) aVar;
                    C47350c cVar = z0Var.f120809d;
                    Iterator<yo4> it = (cVar == null ? null : (C49120db2) cVar.f127056b.f127083a).f132218e.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        yo4 next = it.next();
                        Log.m105927v("MicroMsg.SubCoreExt", "AppId[%s], UserName[%s], Xml[%s]", z0Var.f120913e, next.f145441d, next.f145442e);
                        if (!Util.isNullOrNil(next.f145441d) && !Util.isNullOrNil(next.f145442e)) {
                            C72996z1 N2 = C97625j3.m125812b().mo105907v().mo69664N2(next.f145441d);
                            if (N2 == null || ((int) N2.f108320R1) <= 0) {
                                Log.m105920e("MicroMsg.SubCoreExt", "contact is null");
                            } else if (N2.mo62916m3()) {
                                Log.m105928w("MicroMsg.SubCoreExt", "isBizContact");
                            } else {
                                String str2 = next.f145442e;
                                if (!(str2 == null || (parseXml = XmlParser.parseXml(str2, "PersonalAppSetting", (String) null)) == null)) {
                                    String str3 = parseXml.get(".PersonalAppSetting.OpenID");
                                    if (!Util.isNullOrNil(str3)) {
                                        bVar = new C44598b();
                                        bVar.f120912a = str3;
                                        if (bVar != null && !Util.isNullOrNil(bVar.f120912a)) {
                                            Log.m105927v("MicroMsg.SubCoreExt", "AppId[%s], openId[%s]", z0Var.f120913e, bVar.f120912a);
                                            C47958b.Ax0().replace(new C30733e5(z0Var.f120913e, next.f145441d, bVar.f120912a));
                                            z = true;
                                        }
                                    }
                                }
                                bVar = null;
                                Log.m105927v("MicroMsg.SubCoreExt", "AppId[%s], openId[%s]", z0Var.f120913e, bVar.f120912a);
                                C47958b.Ax0().replace(new C30733e5(z0Var.f120913e, next.f145441d, bVar.f120912a));
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        C47958b bVar2 = C47958b.this;
                        bVar2.f128657j.removeMessages(0);
                        bVar2.f128657j.sendEmptyMessageDelayed(0, 1600);
                    }
                }
            }
        }
    }
}
