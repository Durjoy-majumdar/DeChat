package com.tencent.p014mm.plugin.finder.gallery;

import ag1.C0039a;
import er1.C58784w3;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14590p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGallerySnsCoverConfig$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGallerySnsCoverConfig$buildItemCoverts$1 */
public final class FinderGallerySnsCoverConfig$buildItemCoverts$1 implements C9500j {
    public C60896i<?> getItemConvert(int i) {
        if (i == 2) {
            return new C0039a();
        }
        if (i == 4 || i == 9) {
            return new C0039a();
        }
        C58784w3.f168295a.mo83916b("FinderStaggeredConfig", i);
        return new C14590p();
    }
}
