package ag1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.Arrays;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11986o0;
import pl1.C11990s0;
import pl1.C62344b0;
import sx3.C110818d0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: ag1.a */
public final class C0039a extends C60896i<BaseFinderFeed> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ach;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        BaseFinderFeed baseFinderFeed;
        C64689rq2 rq22;
        C64689rq2 rq23;
        C60905o oVar2 = oVar;
        BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) cVar;
        C27696y yVar = C27696y.THUMB_IMAGE;
        C11978e0.C11979a aVar = C11978e0.C11979a.DARK_TIMELINE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed2, "item");
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.cys);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.cyz);
        if (baseFinderFeed2.mo75c() == 4) {
            textView.setVisibility(0);
            C64689rq2 rq24 = (C64689rq2) C110818d0.m150916N(baseFinderFeed2.mo3513o().getMediaList());
            long j = (long) (rq24 != null ? rq24.f185269g : 0);
            String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setText(format);
            if (!z && (rq23 = (C64689rq2) C110818d0.m150916N(baseFinderFeed2.mo3513o().getMediaList())) != null) {
                if (Util.isNullOrNil(rq23.f185283w)) {
                    C62344b0 b0Var = r2;
                    C62344b0 b0Var2 = new C62344b0(rq23, yVar, (String) null, (String) null, 12, (C8480h) null);
                    C39818r rVar = C39818r.f106831a;
                    C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                    C87412m.m108593f(imageView, "thumbIv");
                    f2.mo85957c(b0Var, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                } else {
                    C11986o0 o0Var = new C11986o0(rq23, C27696y.RAW_IMAGE, (String) null, 4, (C8480h) null);
                    C39818r rVar2 = C39818r.f106831a;
                    C60979d<C100810g0> f25 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                    C87412m.m108593f(imageView, "thumbIv");
                    f25.mo85957c(o0Var, imageView, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                }
            }
        } else {
            textView.setVisibility(8);
            if (!z && (rq22 = (C64689rq2) C110818d0.m150916N(baseFinderFeed2.mo3513o().getMediaList())) != null) {
                C39818r rVar3 = C39818r.f106831a;
                C62344b0 b0Var3 = r2;
                baseFinderFeed = baseFinderFeed2;
                C62344b0 b0Var4 = new C62344b0(rq22, yVar, (String) null, (String) null, 12, (C8480h) null);
                C87412m.m108593f(imageView, "thumbIv");
                ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(b0Var3, imageView, ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                C0040b bVar = C0040b.f48a;
                View view = oVar2.f44854d;
                C87412m.m108593f(view, "holder.itemView");
                bVar.mo46a(view, baseFinderFeed, true, false);
            }
        }
        baseFinderFeed = baseFinderFeed2;
        C0040b bVar2 = C0040b.f48a;
        View view2 = oVar2.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        bVar2.mo46a(view2, baseFinderFeed, true, false);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
