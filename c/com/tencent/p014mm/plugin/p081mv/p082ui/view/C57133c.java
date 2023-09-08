package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import sb2.C63816o;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.c */
public final class C57133c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvLyricView f163684d;

    public C57133c(MusicMvLyricView musicMvLyricView) {
        this.f163684d = musicMvLyricView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$MusicMvLyricConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39818r rVar = C39818r.f106831a;
        Context context = this.f163684d.getContext();
        C87412m.m108593f(context, "context");
        ((C63816o) rVar.mo62443b(context).mo75002a(C63816o.class)).mo88609g3();
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$MusicMvLyricConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
