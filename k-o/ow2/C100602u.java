package ow2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import iw2.C98862q;
import kw2.C99268i;

/* renamed from: ow2.u */
public final class C100602u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f294751d;

    public C100602u(StoryGalleryView storyGalleryView) {
        this.f294751d = storyGalleryView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StoryGalleryView storyGalleryView = this.f294751d;
        C98862q qVar = storyGalleryView.f282057A;
        if (qVar != null) {
            int i2 = storyGalleryView.f282094u;
            int i3 = storyGalleryView.f282095v;
            C77044c cVar = storyGalleryView.f282069M;
            qVar.mo138197l(i2, i3, cVar != null ? cVar.f225057E : false, (C99268i) null);
        }
    }
}
