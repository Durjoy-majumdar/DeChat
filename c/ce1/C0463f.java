package ce1;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import j20.C117292a;
import java.util.ArrayList;
import te3.C51270sn1;
import te3.C52271zj0;

/* renamed from: ce1.f */
public final class C0463f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0465g f1110d;

    public C0463f(C0465g gVar) {
        this.f1110d = gVar;
    }

    public final void onClick(View view) {
        String str;
        C52271zj0 zj02;
        FinderContact finderContact;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0465g gVar = this.f1110d;
        C51270sn1 sn12 = (C51270sn1) gVar.f33564d;
        if (sn12 == null || (zj02 = sn12.f141633w) == null || (finderContact = zj02.f146006e) == null || (str = finderContact.username) == null) {
            str = "";
        }
        C0465g.m404m3(gVar, str, (String) null, (C52271zj0) null, (String) null, 0, 0, 0, 126, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
