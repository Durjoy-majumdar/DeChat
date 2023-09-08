package f13;

import com.tencent.p014mm.autogen.events.TranslateMessageEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import d13.C97403b;
import di3.C86312j;
import g13.C98071g;
import java.util.LinkedList;

/* renamed from: f13.c */
public class C75669c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TranslateMessageEvent f222268d;

    public C75669c(C31871d dVar, TranslateMessageEvent translateMessageEvent) {
        this.f222268d = translateMessageEvent;
    }

    public void run() {
        C97403b bVar = (C97403b) C86312j.m106911c(C97403b.class);
        bVar.requireAccountInitialized();
        C98071g gVar = bVar.f285906d;
        TranslateMessageEvent.C67800a aVar = this.f222268d.f193961d;
        String str = aVar.f193962a;
        String str2 = aVar.f193963b;
        int i = aVar.f193964c;
        String str3 = aVar.f193965d;
        byte[] bArr = aVar.f193966e;
        gVar.getClass();
        Log.m105919d("MicroMsg.TranslateServiceManager", "doTranslate msgId : %s, type: %d", str2, Integer.valueOf(i));
        if (gVar.f287524e.containsKey(str2)) {
            Log.m105919d("MicroMsg.TranslateServiceManager", "doTranslate msgId %s is inQueue", str2);
            return;
        }
        C98071g.C98075d dVar = new C98071g.C98075d(str, str2, i, str3, bArr);
        ((LinkedList) gVar.f287523d).add(dVar);
        gVar.f287524e.put(dVar.f287529c, Integer.valueOf(dVar.f287535i));
        Log.m105919d("MicroMsg.TranslateServiceManager", "requestCount : %s", Integer.valueOf(gVar.f287520a));
        gVar.mo137367a();
    }
}
