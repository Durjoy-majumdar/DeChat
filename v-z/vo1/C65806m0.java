package vo1;

import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;

/* renamed from: vo1.m0 */
public final class C65806m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveThumbPlayerProxy f189254d;

    /* renamed from: e */
    public final /* synthetic */ String f189255e;

    public C65806m0(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, String str) {
        this.f189254d = finderLiveThumbPlayerProxy;
        this.f189255e = str;
    }

    public final void run() {
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f189254d;
        if (finderLiveThumbPlayerProxy.f160755J) {
            finderLiveThumbPlayerProxy.f160773s = true;
            C96814a.C57541b videoViewCallback = finderLiveThumbPlayerProxy.getVideoViewCallback();
            if (videoViewCallback != null) {
                videoViewCallback.mo22957I3("", this.f189255e, Boolean.FALSE);
            }
        }
    }
}
