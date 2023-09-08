package pu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import gy3.C87412m;

/* renamed from: pu2.a */
public abstract class C62508a extends C100954s {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62508a(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: G */
    public abstract View mo87535G(int i);
}
