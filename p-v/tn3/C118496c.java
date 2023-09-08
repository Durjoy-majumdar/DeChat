package tn3;

import com.tencent.p014mm.sdk.platformtools.Log;
import g34.C116910a;
import g34.C116912c;
import g34.C116918i;
import g34.C87131j;
import h34.C117065a;
import h34.C117066b;
import tn3.C101905a;

/* renamed from: tn3.c */
public class C118496c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118493b f354653d;

    public C118496c(C118493b bVar) {
        this.f354653d = bVar;
    }

    public void run() {
        C101905a.C101908c cVar = C101905a.C101908c.Failed;
        C101905a.C101908c cVar2 = C101905a.C101908c.Finished;
        if (this.f354653d.f354643b != null) {
            C116912c cVar3 = new C116912c(C87131j.GET, "https://api.twitter.com/1.1/account/verify_credentials.json");
            C118493b bVar = this.f354653d;
            C117066b bVar2 = bVar.f354642a;
            C116918i iVar = bVar.f354643b;
            C117065a aVar = (C117065a) bVar2;
            C116910a aVar2 = aVar.f350749a;
            aVar2.mo180875a("signing request: " + cVar3.mo180883b());
            if (!("".equals(iVar.f350347d) && "".equals(iVar.f350348e))) {
                cVar3.mo180876d("oauth_token", iVar.f350347d);
            }
            C116910a aVar3 = aVar.f350749a;
            aVar3.mo180875a("setting token to: " + iVar);
            aVar.mo180992a(cVar3, iVar);
            aVar.mo180993b(cVar3);
            try {
                if (cVar3.mo180884c().f350342a == 200) {
                    cVar = cVar2;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Twitter", e, "request error.", new Object[0]);
            }
        }
        this.f354653d.f354650i.sendMessage(this.f354653d.f354650i.obtainMessage(1010, cVar));
    }
}
