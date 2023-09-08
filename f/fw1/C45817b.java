package fw1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import kg3.C76577a;

/* renamed from: fw1.b */
public final class C45817b {
    /* renamed from: a */
    public static final String m51100a(List<? extends GalleryItem$MediaItem> list) {
        int i;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        if (list != null) {
            int i3 = 0;
            for (GalleryItem$MediaItem galleryItem$MediaItem : list) {
                if (galleryItem$MediaItem.getType() == 2) {
                    i2++;
                }
                if (galleryItem$MediaItem.getType() == 1) {
                    i3++;
                }
                hashSet.add(Integer.valueOf(galleryItem$MediaItem.getType()));
                if (hashSet.size() >= 2) {
                    String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.m0y);
                    C87412m.m108593f(q, "getString(\n             …t_video_pic\n            )");
                    return q;
                }
            }
            i = i2;
            i2 = i3;
        } else {
            i = 0;
        }
        if (i2 > 9) {
            String q2 = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.m0w);
            C87412m.m108593f(q2, "getString(\n            M…ct_many_picture\n        )");
            return q2;
        } else if (i < 2) {
            return "";
        } else {
            String q3 = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.m0x);
            C87412m.m108593f(q3, "getString(\n            M…lect_many_video\n        )");
            return q3;
        }
    }
}
