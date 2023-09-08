package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import by0.C16825a;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.pluginsdk.model.C19465u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C19641z0;
import f40.C86709a0;
import fx0.C20733t;
import iy3.C60641c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C47350c;
import ob0.C89137b0;
import ob0.C89144l0;
import rb0.C48009v0;
import te3.C51132rn3;
import te3.C51272sn3;
import te3.C51421tn3;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.j3 */
public class C18407j3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C18412m3 f51054d;

    public C18407j3(C18412m3 m3Var) {
        this.f51054d = m3Var;
    }

    public void run() {
        C19465u uVar;
        String str;
        LinkedList linkedList = new LinkedList();
        for (Map.Entry next : this.f51054d.f51081o.entrySet()) {
            C18412m3.C18414b bVar = (C18412m3.C18414b) next.getValue();
            if (!Util.isNullOrNil(bVar.f51091f1)) {
                C16825a aVar = C16825a.f45444a;
                bVar.f63880x0 = aVar.mo17867e(bVar.f51091f1);
                bVar.f63882y0 = (int) aVar.mo17866d(bVar.f51091f1);
            }
            linkedList.add(bVar);
            if (!(bVar.f63822B != 0 || (uVar = bVar.f51094i1) == null || (str = bVar.f51092g1) == null)) {
                C19641z0 z0Var = C19641z0.f55645a;
                if (!uVar.f54997b) {
                    String str2 = "exposeTimes-" + str;
                    String str3 = "exposeRatio-" + str;
                    int decodeInt = z0Var.mo25860c().decodeInt(str2, 0);
                    int decodeInt2 = z0Var.mo25860c().decodeInt(str2, 0);
                    MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) z0Var.mo25860c().getSlotForWrite();
                    multiProcessMMKV.encode(str2, decodeInt + 1);
                    int b = C60641c.m70921b(uVar.f54996a * ((float) 100));
                    if (b >= decodeInt2) {
                        decodeInt2 = b;
                    }
                    multiProcessMMKV.encode(str3, decodeInt2);
                }
            }
            Log.m105919d("MicroMsg.BizTimeLineReport", "reportExpose key=%s, pos=%d, isValidExposed=%d, exposeTimes=%d", next.getKey(), Integer.valueOf(bVar.f63863f), Integer.valueOf(bVar.f63851X0), Integer.valueOf(bVar.f63865h));
        }
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        C18412m3 m3Var = this.f51054d;
        C20733t tVar = r1;
        C20733t tVar2 = new C20733t(linkedList, m3Var.f51067a, m3Var.f51068b, m3Var.f51069c, m3Var.f51070d, 0, 0, m3Var.f51071e);
        b0Var.mo123460f(tVar);
        int i = this.f51054d.f51069c;
        C19641z0 z0Var2 = C19641z0.f55645a;
        if (!z0Var2.mo25861d().decodeBool("ReSortBizMsgRecMsgReportSample", false)) {
            Log.m105918d("MicroMsg.BizTimeLineReportKt", "reportFirstGroupRecMsg not open");
            return;
        }
        int decodeInt3 = z0Var2.mo25861d().decodeInt("ReSortBizMsgRecMsgReportMaxCount", 5);
        C19625p0 Jx0 = C48009v0.Jx0();
        List<C19623o0> bD = Jx0.mo25797bD(Jx0.f55550d.query("BizTimeLineInfo", (String[]) null, "type=?", new String[]{"620757041"}, (String) null, (String) null, "orderFlag DESC limit " + decodeInt3));
        Log.m105924i("MicroMsg.BizTimeLineReportKt", "reportFirstGroupRecMsg maxCount=" + decodeInt3 + ", list size = " + ((LinkedList) bD).size());
        if (!bD.isEmpty()) {
            long TO = C48009v0.Jx0().mo25791TO();
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            C51272sn3 sn32 = new C51272sn3();
            sn32.f141638e = i;
            for (C19623o0 o0Var : bD) {
                re4 x2 = o0Var.mo25774x2();
                if (x2 != null) {
                    LinkedList<C51132rn3> linkedList2 = sn32.f141637d;
                    C51132rn3 rn32 = new C51132rn3();
                    rn32.f141051d = x2.f64527s;
                    rn32.f141052e = (int) o0Var.mo25776z2();
                    rn32.f141054g = o0Var.field_isValidExposed ? 2 : o0Var.field_isRead == 1 ? 1 : 0;
                    rn32.f141053f = o0Var.field_rankSessionId;
                    rn32.f141055h = o0Var.mo25767q2() == TO ? 0 : 1;
                    linkedList2.add(rn32);
                }
            }
            bVar2.f127066a = sn32;
            bVar2.f127067b = new C51421tn3();
            bVar2.f127068c = "/cgi-bin/mmbiz-bin/recmsg_report";
            bVar2.f127069d = 4361;
            C89144l0.m111429e(bVar2.mo72403a(), C2124n3.f12090d, false);
        }
    }
}
