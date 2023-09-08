package ow2;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.story.p108ui.layout.GalleryLayoutManager;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.GalleryHorizontalControlView;
import gy3.C87412m;
import lw2.C99703l;

/* renamed from: ow2.y */
public final class C100615y extends RecyclerView.C16631z {

    /* renamed from: A */
    public final C99703l f294792A;

    /* renamed from: B */
    public final GalleryHorizontalControlView f294793B;

    /* renamed from: z */
    public final RecyclerView f294794z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100615y(View view, int i, int i2) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.k77);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…lery_horizontal_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f294794z = recyclerView;
        C99703l lVar = new C99703l(i, i2);
        this.f294792A = lVar;
        Context context = view.getContext();
        C87412m.m108593f(context, "itemView.context");
        GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager(context, 0);
        View findViewById2 = view.findViewById(C0966R.C0970id.k7a);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.…ory_gallery_page_control)");
        this.f294793B = (GalleryHorizontalControlView) findViewById2;
        recyclerView.setAdapter(lVar);
        recyclerView.setLayoutManager(galleryLayoutManager);
        recyclerView.setFocusable(false);
        recyclerView.mo17085h0(new C11777d(0));
        RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
        C67092e0 e0Var = itemAnimator instanceof C67092e0 ? (C67092e0) itemAnimator : null;
        if (e0Var != null) {
            e0Var.f192682g = false;
        }
        recyclerView.setItemViewCacheSize(0);
    }
}
