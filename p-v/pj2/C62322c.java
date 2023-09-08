package pj2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import pj2.C62319b;

/* renamed from: pj2.c */
public final class C62322c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62319b f177151d;

    /* renamed from: e */
    public final /* synthetic */ C62318a f177152e;

    /* renamed from: f */
    public final /* synthetic */ C62319b.C62321b f177153f;

    public C62322c(C62319b bVar, C62318a aVar, C62319b.C62321b bVar2) {
        this.f177151d = bVar;
        this.f177152e = aVar;
        this.f177153f = bVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/data/ExclusiveConverter$initUserLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C62319b.C62320a aVar = this.f177151d.f177146e;
        if (aVar != null) {
            aVar.mo80838a(this.f177152e, this.f177153f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/data/ExclusiveConverter$initUserLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
