package pj1;

import com.tencent.p014mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import sx3.C36907w;

/* renamed from: pj1.b */
public final class C35515b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C35516c f94973d;

    public C35515b(C35516c cVar) {
        this.f94973d = cVar;
    }

    public final void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("onFinish createdViews ");
        ConcurrentLinkedQueue<WeakReference<MultiStreamPreviewView>> concurrentLinkedQueue = this.f94973d.f94975b;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(concurrentLinkedQueue, 10));
        for (WeakReference hashCode : concurrentLinkedQueue) {
            arrayList.add(Integer.valueOf(hashCode.hashCode()));
        }
        sb.append(arrayList);
        Log.m105924i("FinderLivePlayerViewRecycler", sb.toString());
        for (WeakReference weakReference : this.f94973d.f94975b) {
            MultiStreamPreviewView multiStreamPreviewView = (MultiStreamPreviewView) weakReference.get();
            if (multiStreamPreviewView != null) {
                multiStreamPreviewView.mo77684b();
            }
        }
        this.f94973d.f94975b.clear();
        this.f94973d.f94974a.clear();
        this.f94973d.f94976c.removeCallbacksAndMessages((Object) null);
    }
}
