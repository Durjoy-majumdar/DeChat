package k10;

import java.util.Map;
import k10.C88053e;
import p172io.flutter.plugin.common.BasicMessageChannel;

/* renamed from: k10.g */
public class C88058g implements C88053e.C88056c<Double> {

    /* renamed from: a */
    public final /* synthetic */ Map f254707a;

    /* renamed from: b */
    public final /* synthetic */ BasicMessageChannel.Reply f254708b;

    public C88058g(Map map, BasicMessageChannel.Reply reply) {
        this.f254707a = map;
        this.f254708b = reply;
    }

    public void success(Object obj) {
        this.f254707a.put("result", (Double) obj);
        this.f254708b.reply(this.f254707a);
    }
}
