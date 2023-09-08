package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.d */
public final class C57134d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvTabFragment.C57117c f163685d;

    /* renamed from: e */
    public final /* synthetic */ int f163686e;

    /* renamed from: f */
    public final /* synthetic */ MusicMvTabFragment f163687f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f163688g;

    public C57134d(MusicMvTabFragment.C57117c cVar, int i, MusicMvTabFragment musicMvTabFragment, CheckBox checkBox) {
        this.f163685d = cVar;
        this.f163686e = i;
        this.f163687f = musicMvTabFragment;
        this.f163688g = checkBox;
    }

    public final void onClick(View view) {
        Boolean bool;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMvTabFragment.C57119e eVar = this.f163685d.f163646d;
        eVar.f163650c = !eVar.f163650c;
        MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
        MvCreateReportHelper.f163008d = this.f163686e;
        MvCreateReportHelper.f163007c = this.f163687f.getFeedFrom();
        MusicMvTabFragment.C57115a listener = this.f163687f.getListener();
        if (listener != null) {
            MusicMvTabFragment.C57119e eVar2 = this.f163685d.f163646d;
            bool = Boolean.valueOf(listener.mo80634b(eVar2.f163650c, eVar2, this.f163687f.getType()));
        } else {
            bool = null;
        }
        if (bool != null && !bool.booleanValue()) {
            this.f163685d.f163646d.f163650c = false;
        }
        this.f163688g.setChecked(this.f163685d.f163646d.f163650c);
        this.f163687f.getAdapter().notifyItemChanged(this.f163686e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
