package xg2;

import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import gy3.C87412m;
import java.util.Map;

/* renamed from: xg2.c */
public final class C102639c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102635b f302243d;

    public C102639c(C102635b bVar) {
        this.f302243d = bVar;
    }

    public final void run() {
        Map<Integer, BasePluginLayout> map = this.f302243d.f302233e;
        C87412m.m108593f(map, "viewMap");
        for (Map.Entry<Integer, BasePluginLayout> value : map.entrySet()) {
            ((BasePluginLayout) value.getValue()).onDetach();
        }
    }
}
