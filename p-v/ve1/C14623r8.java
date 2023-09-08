package ve1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.animation.Animation;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import hi3.C87515a;
import ht1.C60200t1;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import l60.C99342a;
import l60.C99344b;
import p60.C11871e;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11986o0;
import pl1.C11990s0;
import pl1.C62344b0;
import r60.C101350i;
import sx3.C110818d0;
import te3.C64689rq2;
import up1.C27696y;
import up1.C37521f;

/* renamed from: ve1.r8 */
public final class C14623r8 extends C14657v3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14623r8(FinderFoldedScrollLayout.C3953a aVar) {
        super(aVar, C0966R.C0971layout.abo);
        C87412m.m108594g(aVar, "controller");
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        Object obj;
        C60905o oVar2 = oVar;
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) cVar;
        C11978e0.C11979a aVar = C11978e0.C11979a.TIMELINE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        super.mo13849j(oVar, baseFinderFeed, i, i2, z, list);
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList());
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.kk6);
        if (Util.isNullOrNil(rq22.f185283w)) {
            C62344b0 b0Var = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
            C39818r rVar = C39818r.f106831a;
            C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(b0Var, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            C37521f.f99374d.getClass();
            b.f291321e = C37521f.f99412h2.mo60266n().intValue() > 0 ? new C11871e((Animation) null, new C101350i(imageView), 1, (C8480h) null) : null;
            C87412m.m108593f(imageView, "thumbIv");
            ((C99342a) b).mo85954d(imageView);
            obj = null;
        } else {
            obj = null;
            C11986o0 o0Var = new C11986o0(rq22, C27696y.RAW_IMAGE, (String) null, 4, (C8480h) null);
            C39818r rVar2 = C39818r.f106831a;
            C99344b<C100810g0, Bitmap> b2 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(o0Var, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            C37521f.f99374d.getClass();
            b2.f291321e = C37521f.f99412h2.mo60266n().intValue() > 0 ? new C11871e((Animation) null, new C101350i(imageView), 1, (C8480h) null) : null;
            C87412m.m108593f(imageView, "thumbIv");
            ((C99342a) b2).mo85954d(imageView);
        }
        WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.fnu);
        Resources resources = oVar2.f173499A.getResources();
        Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 2, false, 2, obj);
        weImageView.setImageDrawable(C87515a.m108835e(resources, c0 != null ? c0.intValue() : C0966R.raw.icon_filled_awesome, 0.0f));
    }
}
