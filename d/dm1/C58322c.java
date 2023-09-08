package dm1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import em1.C58636b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dm1.c */
public final class C58322c extends UIComponent {

    /* renamed from: d */
    public HashMap<FinderImgFeedMusicTag, C58636b> f167005d = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58322c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo83074c3() {
        for (Map.Entry<FinderImgFeedMusicTag, C58636b> value : this.f167005d.entrySet()) {
            ((C58636b) value.getValue()).release();
        }
        this.f167005d.clear();
    }

    /* renamed from: d3 */
    public final void mo83075d3(FinderImgFeedMusicTag finderImgFeedMusicTag) {
        C87412m.m108594g(finderImgFeedMusicTag, "view");
        C58636b bVar = this.f167005d.get(finderImgFeedMusicTag);
        if (bVar != null) {
            bVar.release();
        }
        this.f167005d.remove(finderImgFeedMusicTag);
        Log.m105924i("FinderImgFeedMusicPlayer", finderImgFeedMusicTag.getId() + " dettach, player size:" + this.f167005d.size());
    }

    /* renamed from: e3 */
    public final void mo83076e3(C32226l<? super View, Boolean> lVar) {
        C58636b bVar;
        for (Map.Entry next : this.f167005d.entrySet()) {
            if (!(lVar != null ? lVar.invoke(next.getKey()).booleanValue() : false)) {
                FinderImgFeedMusicTag finderImgFeedMusicTag = (FinderImgFeedMusicTag) next.getKey();
                if (finderImgFeedMusicTag.f160192d == null || (bVar = finderImgFeedMusicTag.f160193e) == null) {
                    Log.m105924i("FinderImgFeedMusicTag", "[pauseMusicAuto] musicInfo = " + finderImgFeedMusicTag.f160192d + ",player = " + finderImgFeedMusicTag.f160193e);
                } else {
                    if (!bVar.isPlaying()) {
                        Log.m105924i("FinderImgFeedMusicTag", "[pauseMusicAuto] music paused");
                    } else {
                        finderImgFeedMusicTag.f160194f = false;
                        finderImgFeedMusicTag.f160195g = false;
                        finderImgFeedMusicTag.f160196h = false;
                        if (finderImgFeedMusicTag.f160192d != null) {
                            C58636b bVar2 = finderImgFeedMusicTag.f160193e;
                            if (bVar2 != null) {
                                bVar2.pause();
                            }
                            finderImgFeedMusicTag.f160200o.invoke(Boolean.FALSE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f3 */
    public final void mo83077f3() {
        for (Map.Entry next : this.f167005d.entrySet()) {
            if (((FinderImgFeedMusicTag) next.getKey()).f160194f) {
                ((FinderImgFeedMusicTag) next.getKey()).setShouldMusicResume(((C58636b) next.getValue()).isPlaying());
                ((FinderImgFeedMusicTag) next.getKey()).mo78356d();
            }
        }
    }

    /* renamed from: g3 */
    public final void mo83078g3() {
        for (Map.Entry next : this.f167005d.entrySet()) {
            if (((FinderImgFeedMusicTag) next.getKey()).f160194f && ((FinderImgFeedMusicTag) next.getKey()).getShouldMusicResume()) {
                ((C58636b) next.getValue()).play();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        mo83074c3();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58322c(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
