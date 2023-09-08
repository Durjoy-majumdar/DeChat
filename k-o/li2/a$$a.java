package li2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import ni2.C47260d;
import p256vw.C15014e;
import p256vw.C15016h;

public final /* synthetic */ class a$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15016h f31801d;

    /* renamed from: e */
    public final /* synthetic */ C47260d f31802e;

    /* renamed from: f */
    public final /* synthetic */ int f31803f;

    public /* synthetic */ a$$a(C15016h hVar, C47260d dVar, int i) {
        this.f31801d = hVar;
        this.f31802e = dVar;
        this.f31803f = i;
    }

    public final void onClick(View view) {
        C15016h hVar = this.f31801d;
        C47260d dVar = this.f31802e;
        int i = this.f31803f;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(hVar);
        arrayList.add(dVar);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        C15014e eVar = hVar.f41142d;
        if (eVar != null) {
            eVar.mo5899a(hVar.f41143e);
            dVar.dismiss();
            ((ConcurrentHashMap) C10531a.f31800a).remove(Integer.valueOf(i));
        }
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
