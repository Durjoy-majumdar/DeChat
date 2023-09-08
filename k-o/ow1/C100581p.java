package ow1;

import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.C94061h;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;

/* renamed from: ow1.p */
public class C100581p {

    /* renamed from: a */
    public int f294691a = -1;

    /* renamed from: b */
    public C94061h f294692b;

    public C100581p(C94061h hVar) {
        this.f294692b = hVar;
    }

    /* renamed from: a */
    public final void mo140045a(int i) {
        C94061h hVar = this.f294692b;
        ArrayList<GalleryItem$MediaItem> arrayList = hVar.f271577i;
        if (arrayList != null && arrayList.size() > i && i >= 0) {
            long j = hVar.f271577i.get(i).f162751h;
            String str = hVar.f271577i.get(i).f162750g;
            String str2 = hVar.f271577i.get(i).f162747d;
            C93958f.m118747g().mo128876d(Util.isNullOrNil(str) ? str2 : str, hVar.f271577i.get(i).getType(), str2, j, (C93974o.C93980f) null, -1, hVar.f271577i.get(i).f162752i);
        }
    }
}
