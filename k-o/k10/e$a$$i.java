package k10;

import java.util.ArrayList;
import java.util.HashMap;
import k10.C88053e;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class e$a$$i implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ C88053e.C88054a f254701a;

    public /* synthetic */ e$a$$i(C88053e.C88054a aVar) {
        this.f254701a = aVar;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C88053e.C88054a aVar = this.f254701a;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                String str2 = (String) arrayList.get(1);
                if (str2 != null) {
                    Double d = (Double) arrayList.get(2);
                    if (d != null) {
                        Double d2 = (Double) arrayList.get(3);
                        if (d2 != null) {
                            aVar.mo121202c(str, str2, d, d2);
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("itemOffsetArg unexpectedly null.");
                    }
                    throw new NullPointerException("listViewPortHeightArg unexpectedly null.");
                }
                throw new NullPointerException("frameSetIdArg unexpectedly null.");
            }
            throw new NullPointerException("rootIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C88053e.m109622a(e));
        }
    }
}
