package hw1;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.gallery.model.C56791j;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;

@C86522b
/* renamed from: hw1.h */
public final class C60217h extends C86301e implements C56791j {
    public boolean Bd0() {
        return C93958f.m118742b();
    }

    /* renamed from: C5 */
    public void mo80176C5(C93964k.C93967c cVar) {
        C93958f.m118750j().mo128902C5(cVar);
    }

    /* renamed from: I */
    public void mo80177I(int i) {
        C93958f.m118750j().mo128903I(i);
    }

    /* renamed from: M2 */
    public void mo80178M2(int i) {
        C93958f.m118750j().f271196f = i;
    }

    /* renamed from: QB */
    public void mo80179QB(Runnable runnable) {
        C93958f.m118753m().mo128894b(runnable);
    }

    /* renamed from: cf */
    public HashSet<GalleryItem$MediaItem> mo80180cf() {
        HashSet<GalleryItem$MediaItem> h = C93958f.m118748h();
        C87412m.m108593f(h, "getEditedMediaItemSet()");
        return h;
    }

    /* renamed from: dV */
    public Bitmap mo80181dV(String str, String str2, long j, long j2) {
        Bitmap e = C93958f.m118747g().mo128877e(str, str2, j, (C93974o.C93980f) null, j2);
        C87412m.m108593f(e, "getCacheService().getGal…origId, null, modifyDate)");
        return e;
    }

    /* renamed from: i0 */
    public void mo80182i0(C93964k.C93967c cVar) {
        C93958f.m118750j().mo128910i0(cVar);
    }

    public void l70() {
        C93958f.m118747g().mo128874b();
    }

    /* renamed from: o1 */
    public void mo80184o1(String str, long j) {
        C93958f.m118750j().mo128911o1(str, j);
    }

    /* renamed from: ok */
    public void mo80185ok(Runnable runnable) {
        C93958f.m118753m().mo128895c(runnable);
    }

    public void w50() {
        C93958f.m118754n();
    }

    /* renamed from: wg */
    public void mo80187wg(List<String> list) {
        C93958f.m118747g().mo128875c(list);
    }
}
