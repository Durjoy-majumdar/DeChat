package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C71169z;
import gy3.C87412m;
import java.util.ArrayList;
import p645pj.C77094g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.y */
public final class C71166y extends RecyclerView.C16613e<C71169z> {

    /* renamed from: d */
    public final ArrayList<C77094g> f205967d;

    /* renamed from: e */
    public final C71169z.C71170a f205968e;

    public C71166y(ArrayList<C77094g> arrayList, C71169z.C71170a aVar) {
        C87412m.m108594g(arrayList, "compositionList");
        C87412m.m108594g(aVar, "iRingtoneChooseCallback");
        this.f205967d = arrayList;
        this.f205968e = aVar;
    }

    public int getItemCount() {
        return this.f205967d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C71169z zVar2 = (C71169z) zVar;
        C87412m.m108594g(zVar2, "viewHolderLongClick");
        C77094g gVar = this.f205967d.get(i);
        C87412m.m108593f(gVar, "compositionList[position]");
        C77094g gVar2 = gVar;
        zVar2.f205973C = gVar2;
        zVar2.f205971A.setText(gVar2.f225190b);
        zVar2.f205972B.setVisibility(zVar2.f205974z.mo97708Y0(gVar2) ? 0 : 8);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.bxh, viewGroup, false);
        C87412m.m108593f(inflate, "getInflater(viewGroup.co…e_item, viewGroup, false)");
        return new C71169z(inflate, this.f205968e);
    }
}
