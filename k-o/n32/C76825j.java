package n32;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: n32.j */
public class C76825j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f224641d;

    /* renamed from: e */
    public final /* synthetic */ WxaLuckyMoneyPrepareUI f224642e;

    /* renamed from: n32.j$a */
    public class C76826a implements C7045j.C7056k {

        /* renamed from: a */
        public final /* synthetic */ C7045j f224643a;

        public C76826a(C7045j jVar) {
            this.f224643a = jVar;
        }

        public void onResult(boolean z, Object obj, Object obj2) {
            this.f224643a.mo8101d();
            if (z) {
                C76825j.this.f224642e.f198823v.setText((CharSequence) obj);
            }
            C76825j.this.f224642e.f198825x = this.f224643a.mo8099b();
        }
    }

    public C76825j(WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, ArrayList arrayList) {
        this.f224642e = wxaLuckyMoneyPrepareUI;
        this.f224641d = arrayList;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7045j jVar = new C7045j((Context) this.f224642e.getContext(), (ArrayList<String>) this.f224641d);
        jVar.mo8106i(this.f224642e.f198825x);
        jVar.f24869t = new C76826a(jVar);
        jVar.mo8109l();
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
