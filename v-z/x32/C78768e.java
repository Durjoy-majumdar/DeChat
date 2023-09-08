package x32;

import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: x32.e */
public class C78768e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditText f230504d;

    /* renamed from: e */
    public final /* synthetic */ EditText f230505e;

    /* renamed from: f */
    public final /* synthetic */ SnsLuckyMoneyPrepareUI f230506f;

    public C78768e(SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI, EditText editText, EditText editText2) {
        this.f230506f = snsLuckyMoneyPrepareUI;
        this.f230504d = editText;
        this.f230505e = editText2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f230504d.setOnClickListener((View.OnClickListener) null);
        this.f230505e.setOnClickListener((View.OnClickListener) null);
        SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f230506f;
        snsLuckyMoneyPrepareUI.setEditFocusListener(snsLuckyMoneyPrepareUI.f199420h, 2, false);
        SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = this.f230506f;
        snsLuckyMoneyPrepareUI2.setEditFocusListener(snsLuckyMoneyPrepareUI2.f199419g, 0, false);
        this.f230506f.f199425p.setXMode(0);
        this.f230506f.f199425p.setInputEditText((EditText) view);
        SnsLuckyMoneyPrepareUI.m81661J7(this.f230506f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
