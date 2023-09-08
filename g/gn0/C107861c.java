package gn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import java.util.LinkedList;

/* renamed from: gn0.c */
public class C107861c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107865g f322997d;

    /* renamed from: e */
    public final /* synthetic */ DanmuView f322998e;

    public C107861c(DanmuView danmuView, C107865g gVar) {
        this.f322998e = danmuView;
        this.f322997d = gVar;
    }

    public void run() {
        synchronized (this.f322998e.f311206r) {
            int i = 0;
            while (true) {
                if (i >= ((LinkedList) this.f322998e.f311206r).size()) {
                    break;
                } else if (this.f322997d.mo158281g() <= ((C107865g) ((LinkedList) this.f322998e.f311206r).get(i)).mo158281g()) {
                    ((LinkedList) this.f322998e.f311206r).add(i, this.f322997d);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
