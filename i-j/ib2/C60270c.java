package ib2;

import android.view.View;
import ib2.C60268b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ib2.c */
public final class C60270c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60268b f171829d;

    /* renamed from: e */
    public final /* synthetic */ int f171830e;

    /* renamed from: f */
    public final /* synthetic */ C60265a f171831f;

    public C60270c(C60268b bVar, int i, C60265a aVar) {
        this.f171829d = bVar;
        this.f171830e = i;
        this.f171831f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/model/flex/MusicMvFlexVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C60268b.C60269a aVar = this.f171829d.f171828e;
        if (aVar != null) {
            aVar.mo80384a(this.f171830e, this.f171831f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/model/flex/MusicMvFlexVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
