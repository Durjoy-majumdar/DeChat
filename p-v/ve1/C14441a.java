package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0767q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import p196ln.C76705f;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import up1.C27696y;

/* renamed from: ve1.a */
public final class C14441a extends C60896i<C0767q> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.a99;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0767q qVar = (C0767q) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(qVar, "item");
        boolean z2 = true;
        if (C72996z1.m85817T4(qVar.f1809d.username)) {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(qVar.f1809d.headUrl, (C27696y) null, 2, (C8480h) null);
            View D = oVar.mo85812D(C0966R.C0970id.d7c);
            C87412m.m108593f(D, "holder.getView<ImageView…finder_block_item_header)");
            i25.mo85957c(fVar, (ImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        } else {
            String str = qVar.f1809d.headUrl;
            if (!(str == null || str.length() == 0)) {
                C39818r rVar2 = C39818r.f106831a;
                C60979d<C100810g0> K1 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                C62345f fVar2 = new C62345f(qVar.f1809d.headUrl, (C27696y) null, 2, (C8480h) null);
                View D2 = oVar.mo85812D(C0966R.C0970id.d7c);
                C87412m.m108593f(D2, "holder.getView<ImageView…finder_block_item_header)");
                K1.mo85957c(fVar2, (ImageView) D2, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) oVar.mo85812D(C0966R.C0970id.d7c), qVar.f1809d.username);
            }
        }
        String str2 = qVar.f1809d.nickname;
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        ((TextView) oVar.mo85812D(C0966R.C0970id.d7d)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar.f173499A, z2 ? C58784w3.f168295a.mo83931g0(qVar.f1809d.username, (String) null) : qVar.f1809d.nickname));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
