package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import jq3.C60905o;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C50581nr0;
import up1.C27696y;

/* renamed from: com.tencent.mm.plugin.finder.ui.j3 */
public final class C3845j3 extends RecyclerView.C16613e<C60905o> {

    /* renamed from: d */
    public ArrayList<C50581nr0> f17383d;

    public int getItemCount() {
        ArrayList<C50581nr0> arrayList = this.f17383d;
        if (arrayList == null) {
            C87412m.m108603p("datalist");
            throw null;
        } else if (arrayList != null) {
            return arrayList.size();
        } else {
            C87412m.m108603p("datalist");
            throw null;
        }
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C60905o oVar = (C60905o) zVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "vh");
        ArrayList<C50581nr0> arrayList = this.f17383d;
        if (arrayList != null) {
            C50581nr0 nr02 = arrayList.get(i);
            C87412m.m108593f(nr02, "datalist[position]");
            C50581nr0 nr03 = nr02;
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
            C62345f fVar = new C62345f(nr03.f138725e, (C27696y) null, 2, (C8480h) null);
            View D = oVar.mo85812D(C0966R.C0970id.f358284e73);
            C87412m.m108593f(D, "vh.getView(R.id.finder_self_feed_liked_avatar_iv)");
            K1.mo85957c(fVar, (ImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
            ((TextView) oVar.mo85812D(C0966R.C0970id.e74)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar.f173499A, nr03.f138724d));
            return;
        }
        C87412m.m108603p("datalist");
        throw null;
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "p0");
        return new C60905o(C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.apa, viewGroup, false));
    }
}
