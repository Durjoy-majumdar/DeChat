package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import jq3.C60896i;
import jq3.C9500j;
import kb2.C60987a;
import kb2.C60991e;
import kb2.C60994h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$buildItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$buildItemConvertFactory$1 */
public final class MusicMvAlbumPreviewRecyclerUIC$buildItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC this$0;

    public MusicMvAlbumPreviewRecyclerUIC$buildItemConvertFactory$1(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC) {
        this.this$0 = musicMvAlbumPreviewRecyclerUIC;
    }

    public C60896i<?> getItemConvert(int i) {
        return i != 1 ? i != 3 ? new C60991e(this.this$0.mo80439e3()) : new C60994h(this.this$0.mo80439e3()) : new C60987a();
    }
}
