package k10;

import java.util.ArrayList;
import java.util.HashMap;
import k10.C88053e;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class e$a$$j implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ C88053e.C88054a f254702a;

    public /* synthetic */ e$a$$j(C88053e.C88054a aVar) {
        this.f254702a = aVar;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C88053e.C88054a aVar = this.f254702a;
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                aVar.mo121204e(str);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("rootIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C88053e.m109622a(e));
        }
    }
}
