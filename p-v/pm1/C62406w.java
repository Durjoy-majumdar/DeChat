package pm1;

import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import ph1.C62291f;
import ph1.C62293i;
import ph1.C62297m;

/* renamed from: pm1.w */
public final class C62406w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePreviewView f177370d;

    public C62406w(NearbyLivePreviewView nearbyLivePreviewView) {
        this.f177370d = nearbyLivePreviewView;
    }

    public final void run() {
        C62297m e = C62293i.f177081a.mo87360e(this.f177370d.f160241y);
        if (e instanceof C62291f) {
            ((C62291f) e).mo84316a();
        }
        this.f177370d.mo78386e();
    }
}
