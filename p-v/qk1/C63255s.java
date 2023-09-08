package qk1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import te3.C50636o51;

/* renamed from: qk1.s */
public final class C63255s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C50636o51 f179500d;

    /* renamed from: e */
    public final /* synthetic */ Context f179501e;

    public C63255s(C50636o51 o512, Context context) {
        this.f179500d = o512;
        this.f179501e = context;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderJumpInfo finderJumpInfo = this.f179500d.f138965i;
        if (finderJumpInfo != null) {
            Context context = this.f179501e;
            C87412m.m108593f(context, "context");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(context, finderJumpInfo, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
