package sn2;

import android.content.Context;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: sn2.r */
public class C48446r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C36746a0 f129639d;

    /* renamed from: e */
    public final /* synthetic */ Context f129640e;

    public C48446r(C36746a0 a0Var, Context context) {
        this.f129639d = a0Var;
        this.f129640e = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C48447s.m53799a(this.f129639d, this.f129640e, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
