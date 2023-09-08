package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.C57067h;
import j20.C117292a;
import java.util.ArrayList;
import sb2.C63772i1;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.i */
public final class C57072i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57067h.C57069b f163426d;

    /* renamed from: e */
    public final /* synthetic */ int f163427e;

    public C57072i(C57067h.C57069b bVar, int i) {
        this.f163426d = bVar;
        this.f163427e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63772i1 i1Var = this.f163426d.f163422e;
        if (i1Var != null) {
            i1Var.select(this.f163427e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
