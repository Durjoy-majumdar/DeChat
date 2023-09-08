package k10;

import java.util.ArrayList;
import java.util.HashMap;
import k10.C88053e;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class e$a$$c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ C88053e.C88054a f254695a;

    public /* synthetic */ e$a$$c(C88053e.C88054a aVar) {
        this.f254695a = aVar;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C88053e.C88054a aVar = this.f254695a;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                String str2 = (String) arrayList.get(1);
                if (str2 != null) {
                    Number number = (Number) arrayList.get(2);
                    if (number != null) {
                        hashMap.put("result", aVar.mo121211l(str, str2, Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("viewIdArg unexpectedly null.");
                }
                throw new NullPointerException("nameArg unexpectedly null.");
            }
            throw new NullPointerException("rootIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C88053e.m109622a(e));
        }
    }
}
