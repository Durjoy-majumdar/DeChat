package ve1;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import kg3.C76577a;
import l60.C99342a;
import l60.C99344b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C62344b0;
import pl1.C62345f;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: ve1.w3 */
public final class C14676w3 extends C14657v3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14676w3(FinderFoldedScrollLayout.C3953a aVar) {
        super(aVar, C0966R.C0971layout.ac5);
        C87412m.m108594g(aVar, "controller");
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        super.mo13849j(oVar, baseFinderFeed, i, i2, z, list);
        ((TextView) oVar.mo85812D(C0966R.C0970id.hg4)).setText(baseFinderFeed.mo3513o().getNickNameSpan());
        C58969q l = baseFinderFeed.mo3507l();
        String avatarUrl = l != null ? l.getAvatarUrl() : null;
        if (avatarUrl == null || avatarUrl.length() == 0) {
            FinderContact finderContact = baseFinderFeed.mo3513o().getFeedObject().contact;
            avatarUrl = finderContact != null ? finderContact.headUrl : null;
        }
        C11978e0 e0Var = C11978e0.f34938a;
        C60979d<C100810g0> a = e0Var.mo11849a();
        C62345f fVar = new C62345f(avatarUrl, (C27696y) null, 2, (C8480h) null);
        View D = oVar.mo85812D(C0966R.C0970id.a27);
        C87412m.m108593f(D, "holder.getView(R.id.avatar_iv)");
        a.mo85957c(fVar, (ImageView) D, e0Var.mo11851c(C11978e0.C11979a.AVATAR));
        C60979d<C100810g0> b = e0Var.mo11850b();
        C64689rq2 first = baseFinderFeed.mo3513o().getMediaList().getFirst();
        C87412m.m108593f(first, "item.feedObject.mediaList.first");
        C99344b<C100810g0, Bitmap> a2 = b.mo85955a(new C62344b0(first, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null));
        a2.mo138758f(e0Var.mo11851c(C11978e0.C11979a.DARK_TIMELINE));
        View D2 = oVar.mo85812D(C0966R.C0970id.kk6);
        C87412m.m108593f(D2, "holder.getView(R.id.thumb_iv)");
        ((C99342a) a2).mo85954d((ImageView) D2);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        oVar.f44854d.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) (((float) C76577a.m92150a(MMApplicationContext.getContext(), 164.0f)) * 2.0f)));
    }
}
