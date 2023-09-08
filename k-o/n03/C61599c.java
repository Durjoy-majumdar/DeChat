package n03;

import com.tencent.p014mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import j03.C60700d;
import m03.C61432o;

/* renamed from: n03.c */
public final class C61599c implements C61432o {

    /* renamed from: a */
    public final /* synthetic */ C61600d f175178a;

    /* renamed from: b */
    public final /* synthetic */ C61597a f175179b;

    public C61599c(C61600d dVar, C61597a aVar) {
        this.f175178a = dVar;
        this.f175179b = aVar;
    }

    /* renamed from: a */
    public void mo86403a() {
        this.f175178a.f175185f.remove(this.f175179b);
        this.f175178a.f175184e.add(this.f175179b);
        C60700d player$plugin_thumbplayer_release = ((MMRecyclerVideoLayout) this.f175179b).getPlayer$plugin_thumbplayer_release();
        if (player$plugin_thumbplayer_release != null) {
            player$plugin_thumbplayer_release.f172879j = null;
        }
        String str = this.f175178a.f175183d;
        Log.m105924i(str, "recycle videoView " + this.f175179b.hashCode() + " idleViews:" + this.f175178a.f175184e.size() + " busyVideoViewMap:" + this.f175178a.f175185f.size());
    }
}
