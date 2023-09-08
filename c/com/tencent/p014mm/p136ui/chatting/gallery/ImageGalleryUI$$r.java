package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import gj3.C59469a;
import gj3.C59470c;
import gj3.C59474h;
import gy3.C87412m;
import ij3.C60331a;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$r */
public class ImageGalleryUI$$r extends C59469a {

    /* renamed from: b */
    public final /* synthetic */ ImageGalleryUI f165091b;

    public ImageGalleryUI$$r(ImageGalleryUI imageGalleryUI) {
        this.f165091b = imageGalleryUI;
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        if (view instanceof C60331a) {
            ((C60331a) view).mo82001j();
        }
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    public void onMapSharedElements(List<String> list, Map<String, View> map) {
        List<Pair<View, String>> a;
        if (!(list == null || map == null)) {
            C59474h hVar = (C59474h) this.f165091b.component(C59474h.class);
            View selectedView = this.f165091b.f284450n.getSelectedView();
            MMTransitionHelper mMTransitionHelper = MMTransitionHelper.f165034a;
            map.clear();
            if (!(selectedView == null || (a = C59470c.m69393a(selectedView)) == null)) {
                for (Pair pair : a) {
                    if (list.contains(pair.second)) {
                        Object obj = pair.second;
                        C87412m.m108593f(obj, "it.second");
                        Object obj2 = pair.first;
                        C87412m.m108593f(obj2, "it.first");
                        map.put(obj, obj2);
                    }
                }
            }
        }
        super.onMapSharedElements(list, map);
    }
}
