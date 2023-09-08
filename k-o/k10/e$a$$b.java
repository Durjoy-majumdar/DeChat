package k10;

import java.util.ArrayList;
import java.util.HashMap;
import k10.C88053e;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class e$a$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ C88053e.C88054a f254694a;

    public /* synthetic */ e$a$$b(C88053e.C88054a aVar) {
        this.f254694a = aVar;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C88053e.C88054a aVar = this.f254694a;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                String str2 = (String) arrayList.get(1);
                if (str2 != null) {
                    String str3 = (String) arrayList.get(2);
                    if (str3 != null) {
                        String str4 = (String) arrayList.get(3);
                        if (str4 != null) {
                            aVar.mo121207h(str, str2, str3, str4, new C88058g(hashMap, reply));
                            return;
                        }
                        throw new NullPointerException("extInfoArg unexpectedly null.");
                    }
                    throw new NullPointerException("dataArg unexpectedly null.");
                }
                throw new NullPointerException("nameArg unexpectedly null.");
            }
            throw new NullPointerException("rootIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C88053e.m109622a(e));
            reply.reply(hashMap);
        }
    }
}
