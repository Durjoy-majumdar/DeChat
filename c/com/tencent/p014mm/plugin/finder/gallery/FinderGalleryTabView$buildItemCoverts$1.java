package com.tencent.p014mm.plugin.finder.gallery;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14590p;
import zf1.C16149g;
import zf1.C66795c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGalleryTabView$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView$buildItemCoverts$1 */
public final class FinderGalleryTabView$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderGalleryTabView this$0;

    public FinderGalleryTabView$buildItemCoverts$1(FinderGalleryTabView finderGalleryTabView) {
        this.this$0 = finderGalleryTabView;
    }

    public C60896i<?> getItemConvert(int i) {
        boolean z = false;
        if (i == 1) {
            C66795c presenter = this.this$0.getPresenter();
            if (presenter != null) {
                z = presenter.f191899c.mo77478c();
            }
            return new C16149g(z);
        } else if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            throw new RuntimeException("type invalid");
        } else {
            Log.printInfoStack(this.this$0.f14998d, "type invalid", new Object[0]);
            return new C14590p();
        }
    }
}
