package oi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import te3.C51441ts3;
import te3.C64716sw;
import te3.C90406da0;
import te3.C90425kw;
import te3.C90440ss3;

/* renamed from: oi0.p */
public class C89228p extends C89132b<C51441ts3> {
    public C89228p(long j, LinkedList<C90406da0> linkedList, LinkedList<C90425kw> linkedList2, int i, int i2, int i3, C64716sw swVar) {
        Log.m105925i("MicroMsg.Recommend.CgiReportRecommendWxa", "sessionId:%d, action_scene:%d", Long.valueOf(j), Integer.valueOf(i));
        C47350c.C47352b bVar = new C47350c.C47352b();
        C90440ss3 ss32 = new C90440ss3();
        ss32.f259835d = j;
        ss32.f259836e = linkedList;
        ss32.f259840i = linkedList2;
        ss32.f259837f = i;
        ss32.f259838g = i2;
        ss32.f259841j = i3;
        ss32.f259839h = swVar;
        bVar.f127066a = ss32;
        bVar.f127067b = new C51441ts3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/reportrecommendwxa";
        bVar.f127069d = 2564;
        mo123453j(bVar.mo72403a());
    }
}
