package gn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import lu3.C88656g;

/* renamed from: gn0.e */
public class C107863e implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ int f323001d;

    /* renamed from: e */
    public final /* synthetic */ DanmuView f323002e;

    public C107863e(DanmuView danmuView, int i) {
        this.f323002e = danmuView;
        this.f323001d = i;
    }

    public String getKey() {
        return "DanmuView-seekToPlayTime";
    }

    public void run() {
        synchronized (this.f323002e.f311205q) {
            for (int size = ((LinkedList) this.f323002e.f311206r).size() - 1; size >= 0; size--) {
                C107865g gVar = (C107865g) ((LinkedList) this.f323002e.f311206r).get(size);
                if (gVar.mo158281g() < this.f323001d) {
                    break;
                }
                Log.m105927v("MicroMsg.DanmuView", "seekToPlayTime addBack i=%d showTime=%d", Integer.valueOf(size), Integer.valueOf(gVar.mo158281g()));
                ((LinkedList) this.f323002e.f311205q).addFirst(gVar);
            }
        }
        this.f323002e.mo148620g();
    }
}
