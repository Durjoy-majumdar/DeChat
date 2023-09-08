package bz2;

import android.content.Context;
import android.view.View;
import bz2.C39873b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import mz2.C47150c;

/* renamed from: bz2.c */
public final class C39875c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C39873b f106932d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f106933e;

    /* renamed from: f */
    public final /* synthetic */ C47150c f106934f;

    public C39875c(C39873b bVar, C60905o oVar, C47150c cVar) {
        this.f106932d = bVar;
        this.f106933e = oVar;
        this.f106934f = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/album/HistoryCalendarItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39873b.C39874a aVar = this.f106932d.f106931e;
        Context context = this.f106933e.f173499A;
        C87412m.m108593f(context, "holder.context");
        aVar.mo62497a(context, this.f106934f.f126673i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/album/HistoryCalendarItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
