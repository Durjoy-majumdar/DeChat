package com.tencent.p014mm.p136ui.chatting.component;

import ad0.C0033t;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import jr2.C76442r;
import lu3.C88656g;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.ui.chatting.component.c1 */
public class C73450c1 implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f215833d;

    /* renamed from: e */
    public final /* synthetic */ boolean f215834e;

    public C73450c1(C73456d1 d1Var, C72963f4 f4Var, boolean z) {
        this.f215833d = f4Var;
        this.f215834e = z;
    }

    public String getKey() {
        return "ChattingUI.adVideoExposeReport";
    }

    public void run() {
        Class cls = C76442r.class;
        ((C76442r) C86312j.m106911c(cls)).mo106654N9(this.f215833d);
        C72963f4 f4Var = this.f215833d;
        boolean z = this.f215834e;
        PString pString = new PString();
        PString pString2 = new PString();
        if (C73304a.m86446b(f4Var, pString, pString2)) {
            String str = pString.value;
            String str2 = pString2.value;
            String t = f4Var.mo108768t();
            boolean U5 = C72996z1.m85820U5(t);
            String s = f4Var.mo108769t2() == 1 ? C75592q0.m90789s() : U5 ? C75604z3.m90847s(f4Var.getContent()) : t;
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", str + ",");
            tVar.mo32a("21uxinfo", str2 + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            StringBuilder sb = new StringBuilder();
            sb.append(f4Var.getType() == 62 ? 1 : 2);
            sb.append(",");
            tVar.mo32a("23source_type", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(U5 ? 4 : 3);
            sb4.append(",");
            tVar.mo32a("24scene", sb4.toString());
            tVar.mo32a("25scene_chatname", t + ",");
            tVar.mo32a("26scene_username", s + ",");
            tVar.mo32a("27curr_publishid", ",");
            tVar.mo32a("28curr_msgid", f4Var.mo108774y2() + ",");
            tVar.mo32a("29curr_favid", "0,");
            tVar.mo32a("30isdownload", (z ? 1 : 0) + ",");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(U5 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(t) : 0);
            sb5.append(",");
            tVar.mo32a("31chatroom_membercount", sb5.toString());
            ((C76442r) C86312j.m106911c(cls)).mo106655nS(((C76442r) C86312j.m106911c(cls)).qv0(f4Var), tVar);
            Log.m105924i("MicroMsg.AdVideoStatistic", "report snsad_video_exposure: " + tVar.mo34c());
            C115669n.INSTANCE.mo160131h(12989, tVar);
        }
    }
}
