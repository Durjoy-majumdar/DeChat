package xg2;

import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import gy3.C87412m;
import java.util.Map;

/* renamed from: xg2.d */
public final class C102640d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102635b f302244d;

    public C102640d(C102635b bVar) {
        this.f302244d = bVar;
    }

    public final void run() {
        Map<Integer, BasePluginLayout> map = this.f302244d.f302233e;
        C87412m.m108593f(map, "viewMap");
        for (Map.Entry<Integer, BasePluginLayout> value : map.entrySet()) {
            ((BasePluginLayout) value.getValue()).release();
        }
    }
}
