package n32;

import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: n32.d */
public class C76819d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditText f224625d;

    /* renamed from: e */
    public final /* synthetic */ EditText f224626e;

    /* renamed from: f */
    public final /* synthetic */ WxaLuckyMoneyPrepareUI f224627f;

    public C76819d(WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, EditText editText, EditText editText2) {
        this.f224627f = wxaLuckyMoneyPrepareUI;
        this.f224625d = editText;
        this.f224626e = editText2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f224625d.setOnClickListener((View.OnClickListener) null);
        this.f224626e.setOnClickListener((View.OnClickListener) null);
        WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f224627f;
        wxaLuckyMoneyPrepareUI.setEditFocusListener(wxaLuckyMoneyPrepareUI.f198815n, 2, false);
        WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI2 = this.f224627f;
        wxaLuckyMoneyPrepareUI2.setEditFocusListener(wxaLuckyMoneyPrepareUI2.f198814j, 0, false);
        this.f224627f.f198819r.setXMode(2);
        this.f224627f.f198819r.setInputEditText((EditText) view);
        View view2 = this.f224627f.f198821t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
