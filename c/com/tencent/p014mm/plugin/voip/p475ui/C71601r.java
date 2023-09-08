package com.tencent.p014mm.plugin.voip.p475ui;

import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.Collections;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.voip.ui.r */
public final class C71601r extends C16665p.C16673d {

    /* renamed from: d */
    public final /* synthetic */ RepairerVoipQoSUI f207501d;

    public C71601r(RepairerVoipQoSUI repairerVoipQoSUI) {
        this.f207501d = repairerVoipQoSUI;
    }

    /* renamed from: c */
    public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(zVar, "viewHolder");
        return C16665p.C16673d.m16132g(3, 0);
    }

    /* renamed from: i */
    public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(zVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(zVar2, "target");
        int j = zVar.mo17363j();
        int j2 = zVar2.mo17363j();
        RepairerVoipQoSUI repairerVoipQoSUI = this.f207501d;
        int i = RepairerVoipQoSUI.f207464j;
        Collections.swap(repairerVoipQoSUI.mo98755H7(), j, j2);
        ((WxRecyclerAdapter) ((C36570n) this.f207501d.f207469h).getValue()).notifyItemMoved(j, j2);
        return true;
    }

    /* renamed from: k */
    public void mo17556k(RecyclerView.C16631z zVar, int i) {
        C87412m.m108594g(zVar, "viewHolder");
    }
}
