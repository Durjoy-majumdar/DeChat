package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$initContentView$2", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$initContentView$2 */
public final class MusicMvTabFragment$initContentView$2 implements C9500j {
    public final /* synthetic */ MusicMvTabFragment this$0;

    public MusicMvTabFragment$initContentView$2(MusicMvTabFragment musicMvTabFragment) {
        this.this$0 = musicMvTabFragment;
    }

    public C60896i<?> getItemConvert(int i) {
        Log.m105924i("Music.MusicMvTabFragment", "getItemConvert, type:" + i);
        return new MusicMvTabFragment.C57118d();
    }
}
