package com.tencent.p014mm.album.p836ui.preview.uic;

import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import p226rg.C63432r;
import p226rg.C63433s;
import p862qg.C62610a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$buildItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-album_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.album.ui.preview.uic.AlbumPreviewUIC$buildItemConvertFactory$1 */
public final class AlbumPreviewUIC$buildItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ int $column;

    public AlbumPreviewUIC$buildItemConvertFactory$1(int i) {
        this.$column = i;
    }

    public C60896i<?> getItemConvert(int i) {
        return i != -2 ? i != -1 ? (i == 2 || i == 4) ? new C62610a(this.$column) : new C62610a(this.$column) : new C63433s() : new C63432r();
    }
}
