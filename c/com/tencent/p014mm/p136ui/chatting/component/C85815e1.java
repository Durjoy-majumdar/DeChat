package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.booter.StayTimeReport;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.ui.chatting.component.e1 */
public class C85815e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f249935d;

    /* renamed from: e */
    public final /* synthetic */ String f249936e;

    /* renamed from: f */
    public final /* synthetic */ int f249937f;

    public C85815e1(C73456d1 d1Var, int i, String str, int i2) {
        this.f249935d = i;
        this.f249936e = str;
        this.f249937f = i2;
    }

    public void run() {
        int p1 = this.f249935d == 2 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(this.f249936e) : 0;
        C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f249936e);
        int G2 = j == null ? 0 : j.mo108786G2();
        StayTimeReport stayTimeReport = StayTimeReport.f237543q;
        String str = this.f249936e;
        int i = this.f249935d;
        int i2 = this.f249937f;
        if (stayTimeReport.f237554k == null) {
            stayTimeReport.f237554k = C75592q0.m90789s();
        }
        if (!stayTimeReport.f237554k.equals(str)) {
            StayTimeReport.C80808b bVar = stayTimeReport.f237548e;
            if (bVar != null) {
                Log.m105925i("MicroMsg.StayTimeReport", "enterChattingUI, not close:%s", bVar.f237561a);
                stayTimeReport.mo112561a(stayTimeReport.f237548e.f237561a);
            }
            if (stayTimeReport.f237544a.mo119662c(6, 0) == 0) {
                stayTimeReport.f237544a.mo119667h(4, Util.nowSecond());
            }
            stayTimeReport.f237545b.alive();
            stayTimeReport.f237546c.alive();
            stayTimeReport.f237547d.alive();
            StayTimeReport.C80808b bVar2 = new StayTimeReport.C80808b(stayTimeReport);
            stayTimeReport.f237548e = bVar2;
            bVar2.f237569i = stayTimeReport.f237549f;
            stayTimeReport.f237549f = 0;
            bVar2.f237561a = str;
            stayTimeReport.f237552i = Util.currentTicks();
            StayTimeReport.C80808b bVar3 = stayTimeReport.f237548e;
            bVar3.f237562b = i;
            bVar3.f237564d = i2;
            bVar3.f237565e = G2;
            bVar3.f237566f = p1;
            bVar3.f237567g = Util.nowSecond();
            Log.m105925i("MicroMsg.StayTimeReport", "enter chattingUI: chatUser:%s----type:%d, notifyOpen:%d, unreadCount:%d, membercount:%d", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(G2), Integer.valueOf(p1));
        }
    }
}
