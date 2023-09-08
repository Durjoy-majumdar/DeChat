package el1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveWhiteListUI;
import gy3.C87412m;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import sx3.C36907w;
import te3.C51745vv0;
import te3.C51946xa1;

/* renamed from: el1.k */
public final class C7750k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7741d f26246d;

    public C7750k(C7741d dVar) {
        this.f26246d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList;
        LinkedList<C51745vv0> linkedList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(view);
        Object[] array = arrayList2.toArray();
        arrayList2.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f26246d.f26237z.size() > 0) {
            C7741d dVar = this.f26246d;
            dVar.getClass();
            Intent intent = new Intent(dVar.getActivity(), FinderLiveWhiteListUI.class);
            LinkedList<C51745vv0> linkedList2 = dVar.f26237z;
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList2, 10));
            for (C51745vv0 byteArray : linkedList2) {
                arrayList3.add(byteArray.toByteArray());
            }
            intent.putExtra("KEY_PARAMS_WHITE_LIST", arrayList3);
            C51946xa1 xa12 = dVar.f26214A.f140582f;
            ArrayList arrayList4 = null;
            if (xa12 == null || (linkedList = xa12.f144560g) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C51745vv0 byteArray2 : linkedList) {
                    arrayList.add(byteArray2.toByteArray());
                }
            }
            if (arrayList instanceof Serializable) {
                arrayList4 = arrayList;
            }
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList4);
            AppCompatActivity activity = dVar.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity).startActivityForResult(intent).mo7677b(new C7745f(dVar));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
