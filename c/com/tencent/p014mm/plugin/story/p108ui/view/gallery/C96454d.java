package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import iw2.C98862q;
import nj3.C76879j;
import ow2.C100603v;
import ow2.C77044c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.d */
public final class C96454d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f282201d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96454d(StoryGalleryView storyGalleryView) {
        super(0);
        this.f282201d = storyGalleryView;
    }

    public Object invoke() {
        StoryGalleryView storyGalleryView = this.f282201d;
        C77044c cVar = storyGalleryView.f282069M;
        boolean z = false;
        if (!(cVar != null ? cVar.f225055C : false)) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_STORY_EDITOR_SHOW_PRIVACY_TIP_BOOLEAN_SYNC;
            if (i.mo119686g(aVar, true)) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                C76879j.m92749t(storyGalleryView.getContext(), "", storyGalleryView.getContext().getString(C0966R.string.jqg), new C100603v(storyGalleryView));
                return C13598b0.f38549a;
            }
        }
        C98862q qVar = storyGalleryView.f282057A;
        if (qVar != null) {
            int i2 = storyGalleryView.f282094u;
            int i3 = storyGalleryView.f282095v;
            C77044c cVar2 = storyGalleryView.f282069M;
            if (cVar2 != null) {
                z = cVar2.f225055C;
            }
            qVar.mo138198m(i2, i3, z);
        }
        return C13598b0.f38549a;
    }
}
