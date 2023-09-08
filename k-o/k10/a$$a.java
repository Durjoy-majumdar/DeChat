package k10;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class a$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ C88049a f254685a;

    public /* synthetic */ a$$a(C88049a aVar) {
        this.f254685a = aVar;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C88049a aVar = this.f254685a;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                List list = (List) arrayList.get(1);
                if (list != null) {
                    hashMap.put("result", aVar.mo121184a(str, list));
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("eventArg unexpectedly null.");
            }
            throw new NullPointerException("viewIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(StateEvent.Name.MESSAGE, e.toString());
            hashMap2.put("code", e.getClass().getSimpleName());
            hashMap2.put("details", "Cause: " + e.getCause() + ", Stacktrace: " + Log.getStackTraceString(e));
            hashMap.put("error", hashMap2);
        }
    }
}
