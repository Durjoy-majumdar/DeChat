package ow2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import iw2.C98862q;

/* renamed from: ow2.v */
public final class C100603v implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f294752d;

    public C100603v(StoryGalleryView storyGalleryView) {
        this.f294752d = storyGalleryView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StoryGalleryView storyGalleryView = this.f294752d;
        C98862q qVar = storyGalleryView.f282057A;
        if (qVar != null) {
            int i2 = storyGalleryView.f282094u;
            int i3 = storyGalleryView.f282095v;
            C77044c cVar = storyGalleryView.f282069M;
            qVar.mo138198m(i2, i3, cVar != null ? cVar.f225055C : false);
        }
    }
}
