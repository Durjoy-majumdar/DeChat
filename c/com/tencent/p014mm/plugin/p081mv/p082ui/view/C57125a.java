package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import j20.C117292a;
import java.util.ArrayList;
import tb2.C64216a;
import te3.C64482k23;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.a */
public final class C57125a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentView.C57091a f163663d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvCommentView f163664e;

    public C57125a(MusicMvCommentView.C57091a aVar, MusicMvCommentView musicMvCommentView) {
        this.f163663d = aVar;
        this.f163664e = musicMvCommentView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64482k23 k232 = this.f163663d.f163546d.f163548a;
        long j = k232.f183882o;
        String str = k232.f183883p;
        if (str == null) {
            str = "";
        }
        C64216a aVar = this.f163664e.f163544g;
        if (aVar != null) {
            aVar.mo80465b(j, str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
