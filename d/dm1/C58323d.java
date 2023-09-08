package dm1;

import com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag;
import com.tencent.p014mm.sdk.platformtools.Log;
import em1.C58636b;
import mt1.C61580b;

/* renamed from: dm1.d */
public final class C58323d implements C61580b {

    /* renamed from: d */
    public final /* synthetic */ FinderImgFeedMusicTag f167006d;

    public C58323d(FinderImgFeedMusicTag finderImgFeedMusicTag) {
        this.f167006d = finderImgFeedMusicTag;
    }

    /* renamed from: g5 */
    public void mo80088g5(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("onHeadsetStateChange on:");
        sb.append(z);
        sb.append(" isPlaying:");
        C58636b bVar = this.f167006d.f160193e;
        boolean z2 = false;
        sb.append(bVar != null ? bVar.isPlaying() : false);
        Log.m105924i("FinderImgFeedMusicTag", sb.toString());
        if (!z) {
            C58636b bVar2 = this.f167006d.f160193e;
            if (bVar2 != null) {
                z2 = bVar2.isPlaying();
            }
            if (z2) {
                this.f167006d.getOnHeadsetStateChangePauseMusicTag().invoke();
            }
        }
    }
}
