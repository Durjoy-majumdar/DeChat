package sk3;

import android.view.View;
import bl3.C39818r;
import j20.C117292a;
import java.util.ArrayList;
import rk3.C63462a;

/* renamed from: sk3.c */
public final class C13698c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13703i f38769d;

    public C13698c(C13703i iVar) {
        this.f38769d = iVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showOpenItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C64004q0) C39818r.f106831a.mo62444c(this.f38769d.getActivity()).mo75002a(C64004q0.class)).mo88771c3();
        C63462a.f180011a.mo88330e(100);
        C13703i.m13006c3(this.f38769d);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showOpenItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
