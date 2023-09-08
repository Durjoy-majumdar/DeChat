package ob2;

import android.view.View;
import hb2.C8503a;
import j20.C117292a;
import java.util.ArrayList;
import ob2.C110028h;

/* renamed from: ob2.i */
public final class C110036i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C110028h f329292d;

    /* renamed from: e */
    public final /* synthetic */ C8503a f329293e;

    /* renamed from: f */
    public final /* synthetic */ C110028h.C110030b f329294f;

    public C110036i(C110028h hVar, C8503a aVar, C110028h.C110030b bVar) {
        this.f329292d = hVar;
        this.f329293e = aVar;
        this.f329294f = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f329292d.mo161372F(false);
        C110028h hVar = this.f329292d;
        C8503a aVar = this.f329293e;
        hVar.f329281r = aVar != null ? aVar.f27531a : null;
        C110028h.C110030b bVar = this.f329294f;
        bVar.notifyItemRangeChanged(0, bVar.getItemCount());
        this.f329292d.f329279p.invoke(this.f329293e, Boolean.FALSE);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
