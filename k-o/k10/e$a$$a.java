package k10;

import java.util.ArrayList;
import java.util.HashMap;
import k10.C88053e;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class e$a$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ C88053e.C88054a f254693a;

    public /* synthetic */ e$a$$a(C88053e.C88054a aVar) {
        this.f254693a = aVar;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C88053e.C88054a aVar = this.f254693a;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                String str2 = (String) arrayList.get(1);
                if (str2 != null) {
                    String str3 = (String) arrayList.get(2);
                    if (str3 != null) {
                        hashMap.put("result", aVar.mo121212m(str, str2, str3));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("queryArg unexpectedly null.");
                }
                throw new NullPointerException("pathArg unexpectedly null.");
            }
            throw new NullPointerException("bizNameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C88053e.m109622a(e));
        }
    }
}
