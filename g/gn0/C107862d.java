package gn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import java.util.LinkedList;
import java.util.List;

/* renamed from: gn0.d */
public class C107862d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f322999d;

    /* renamed from: e */
    public final /* synthetic */ DanmuView f323000e;

    public C107862d(DanmuView danmuView, List list) {
        this.f323000e = danmuView;
        this.f322999d = list;
    }

    public void run() {
        synchronized (this.f323000e.f311205q) {
            ((LinkedList) this.f323000e.f311205q).addAll(this.f322999d);
        }
        synchronized (this.f323000e.f311206r) {
            ((LinkedList) this.f323000e.f311206r).addAll(this.f322999d);
        }
        this.f323000e.postInvalidate();
    }
}
