package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import di3.C86312j;
import e00.C31380z;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSearchUrlDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSearchUrlDemoUI */
public final class RepairerSearchUrlDemoUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSearchUrlDemoUI$b */
    public static final class C30357b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSearchUrlDemoUI f81920d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<EditText> f81921e;

        public C30357b(RepairerSearchUrlDemoUI repairerSearchUrlDemoUI, C8479f0<EditText> f0Var) {
            this.f81920d = repairerSearchUrlDemoUI;
            this.f81921e = f0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerSearchUrlDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f81920d.hideVKB();
            ((C31380z) C86312j.m106911c(C31380z.class)).mo57914DU(((EditText) this.f81921e.f27484d).getText().toString(), true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerSearchUrlDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSearchUrlDemoUI$c */
    public static final class C30358c implements View.OnClickListener {

        /* renamed from: d */
        public static final C30358c f81922d = new C30358c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerSearchUrlDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerSearchUrlDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSearchUrlDemoUI$a */
    public static final class C57227a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSearchUrlDemoUI f163958d;

        public C57227a(RepairerSearchUrlDemoUI repairerSearchUrlDemoUI) {
            this.f163958d = repairerSearchUrlDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163958d.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsr;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("搜索页面跳转");
        setBackBtn(new C57227a(this));
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = findViewById(C0966R.C0970id.iwt);
        ((Button) findViewById(C0966R.C0970id.hll)).setOnClickListener(new C30357b(this, f0Var));
        ((Button) findViewById(C0966R.C0970id.iqw)).setOnClickListener(C30358c.f81922d);
    }
}
