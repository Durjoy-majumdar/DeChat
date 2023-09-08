package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.Map;
import p285zh.c$$f;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$i */
public final /* synthetic */ class e$b$a$$i implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ Map f355677a;

    public /* synthetic */ e$b$a$$i(Map map) {
        this.f355677a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f355677a;
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        map.put("notify-push-count", ((c$$f) aVar.f343207c).f356711d.f343211a);
        map.put("notify-push-during", ((c$$f) aVar.f343207c).f356712e.f343211a);
        map.put("notify-net-count", ((c$$f) aVar.f343207c).f356713f.f343211a);
        map.put("notify-net-during", ((c$$f) aVar.f343207c).f356714g.f343211a);
        map.put("notify-msg-count", ((c$$f) aVar.f343207c).f356715h.f343211a);
        map.put("notify-msg-during", ((c$$f) aVar.f343207c).f356716i.f343211a);
        map.put("notify-lightPush-during", ((c$$f) aVar.f343207c).f356717j.f343211a);
    }
}
