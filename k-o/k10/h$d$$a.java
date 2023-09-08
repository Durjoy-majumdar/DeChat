package k10;

import java.util.ArrayList;
import java.util.HashMap;
import k10.C88059h;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class h$d$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ C88059h.C88063d f254716a;

    public /* synthetic */ h$d$$a(C88059h.C88063d dVar) {
        this.f254716a = dVar;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C88059h.C88063d dVar = this.f254716a;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                String str2 = (String) arrayList.get(1);
                if (str2 != null) {
                    dVar.mo121213n(str, str2, (byte[]) arrayList.get(2), new C88066i(hashMap, reply));
                    return;
                }
                throw new NullPointerException("apiNameArg unexpectedly null.");
            }
            throw new NullPointerException("bizNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C88059h.m109638a(e));
            reply.reply(hashMap);
        }
    }
}
