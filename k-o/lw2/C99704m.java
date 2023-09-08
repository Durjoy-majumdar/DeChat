package lw2;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryItemView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryPostTip;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import fw2.C98059c;
import gw2.C98266k;
import gw2.C98268m;
import gy3.C87412m;
import k60.C99101e;
import l60.C99342a;

/* renamed from: lw2.m */
public final class C99704m extends RecyclerView.C16631z {

    /* renamed from: A */
    public final StoryCommentView f292222A;

    /* renamed from: B */
    public final StoryMsgView f292223B;

    /* renamed from: C */
    public final ImageView f292224C;

    /* renamed from: D */
    public final StoryGalleryPostTip f292225D;

    /* renamed from: E */
    public C98266k f292226E;

    /* renamed from: z */
    public final StoryGalleryItemView f292227z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99704m(StoryGalleryItemView storyGalleryItemView) {
        super(storyGalleryItemView);
        C87412m.m108594g(storyGalleryItemView, "itemView");
        this.f292227z = storyGalleryItemView;
        this.f292222A = storyGalleryItemView.getCommentView();
        this.f292223B = storyGalleryItemView.getMsgView();
        this.f292224C = storyGalleryItemView.getThumbView();
        this.f292225D = storyGalleryItemView.getPostTipView();
    }

    /* renamed from: y */
    public final void mo139067y() {
        C98266k kVar = this.f292226E;
        if (kVar != null) {
            C96983o3 o3Var = new C96983o3("storysight");
            C98268m mVar = kVar.f288082e;
            o3Var.f284145b = mVar.f288090c;
            if (mVar.mo137567a()) {
                Log.m105924i("MicroMsg.StoryGalleryAdapter", "reBindBitmap FakeVideo");
                kVar.f288082e.getClass();
                ((C99342a) C99101e.f290571b.mo138474i("")).mo85954d(this.f292224C);
                return;
            }
            C98059c cVar = new C98059c(kVar.f288082e.f288093f, kVar.f288084g, o3Var);
            Log.m105924i("MicroMsg.StoryGalleryAdapter", "reBindBitmap NormalVideo " + cVar.mo11841b());
            ((C99342a) StoryCore.f281736t.mo134195m().mo85955a(cVar)).mo85954d(this.f292224C);
        }
    }
}
