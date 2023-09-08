package com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.WxaLuckyMoneyBaseUI;
import j20.C117292a;
import java.util.ArrayList;
import n32.C76817b;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyCompleteUI */
public class WxaLuckyMoneyCompleteUI extends WxaLuckyMoneyBaseUI implements C76817b {

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyCompleteUI$a */
    public class C4827a implements View.OnClickListener {
        public C4827a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyCompleteUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WxaLuckyMoneyCompleteUI.this.setResult(0, (Intent) null);
            WxaLuckyMoneyCompleteUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyCompleteUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360074cj0;
    }

    public void initView() {
        ((Button) findViewById(C0966R.C0970id.lu_)).setOnClickListener(new C4827a());
    }

    public void onBackPressed() {
        setResult(0, (Intent) null);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
