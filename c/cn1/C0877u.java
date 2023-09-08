package cn1;

import an1.C0094g;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import sx3.C110818d0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: cn1.u */
public final class C0877u extends C60896i<C0094g> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d6q;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C0094g gVar = (C0094g) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(gVar, "item");
        C64689rq2 rq22 = gVar.mo3513o().isLiveFeed() ? (C64689rq2) C110818d0.m150916N(gVar.mo3513o().getLiveMediaList()) : (C64689rq2) C110818d0.m150916N(gVar.mo3513o().getMediaList());
        if (rq22 != null) {
            str = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
            if (Util.isNullOrNil(str)) {
                str = rq22.f185267e + Util.nullAsNil(rq22.f185288z);
            }
        } else {
            str = "";
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.l85);
        if (textView != null) {
            textView.setText(gVar.mo3513o().getNickName());
        }
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.m_1);
        if (imageView != null) {
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
