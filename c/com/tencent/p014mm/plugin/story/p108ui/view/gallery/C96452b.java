package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gw2.C98266k;
import gy3.C87412m;
import gy3.C87413o;
import kw2.C99268i;
import ow2.C100597p;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.b */
public final class C96452b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f282198d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96452b(StoryGalleryView storyGalleryView) {
        super(0);
        this.f282198d = storyGalleryView;
    }

    public Object invoke() {
        StoryGalleryView storyGalleryView = this.f282198d;
        Object obj = storyGalleryView.f282101z.get(storyGalleryView.f282094u).get(storyGalleryView.f282095v);
        C87412m.m108593f(obj, "galleryGroups[selectedRow][selectedColumn]");
        C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt(((C98266k) obj).f288082e.f288088a);
        boolean z = false;
        if (Yt != null && Yt.mo138654m2()) {
            z = true;
        }
        String string = z ? storyGalleryView.getContext().getString(C0966R.string.jqb) : storyGalleryView.getContext().getString(C0966R.string.jpf);
        C87412m.m108593f(string, "if (storyInfo?.checkFavo…elete_positive)\n        }");
        C77426q qVar = new C77426q(storyGalleryView.getContext());
        qVar.mo107595g(string);
        qVar.mo107602n(storyGalleryView.getContext().getString(C0966R.string.jpf));
        qVar.mo107599k(-65536);
        qVar.mo107589a(true);
        qVar.mo107590b(new C100597p(storyGalleryView, Yt));
        qVar.mo107603o();
        Log.m105924i("MicroMsg.StoryGalleryView", "delete click");
        return C13598b0.f38549a;
    }
}
