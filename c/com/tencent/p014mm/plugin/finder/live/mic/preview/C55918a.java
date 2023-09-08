package com.tencent.p014mm.plugin.finder.live.mic.preview;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.live.mic.preview.a */
public final class C55918a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f159342d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveMicSelectRecyclerAdapter.C55914a f159343e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveMicSelectRecyclerAdapter.C55915b f159344f;

    /* renamed from: g */
    public final /* synthetic */ int f159345g;

    public C55918a(C60905o oVar, FinderLiveMicSelectRecyclerAdapter.C55914a aVar, FinderLiveMicSelectRecyclerAdapter.C55915b bVar, int i) {
        this.f159342d = oVar;
        this.f159343e = aVar;
        this.f159344f = bVar;
        this.f159345g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View D = this.f159342d.mo85812D(C0966R.C0970id.n_j);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = D;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FinderLiveMicSelectRecyclerAdapter.C55914a aVar2 = this.f159343e;
        aVar2.f159336e = true;
        this.f159344f.f159340f.invoke(new FinderLiveMicSelectRecyclerAdapter.C55917d(aVar2.f159335d, this.f159345g));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/preview/FinderLiveMicSelectRecyclerAdapter$MicLayoutChangeItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
