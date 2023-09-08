package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI */
public final class RepairerDBDemoUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI$a */
    public static final class C5083a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDBDemoUI f20440d;

        public C5083a(RepairerDBDemoUI repairerDBDemoUI) {
            this.f20440d = repairerDBDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20440d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI$b */
    public static final class C5084b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDBDemoUI f20441d;

        public C5084b(RepairerDBDemoUI repairerDBDemoUI) {
            this.f20441d = repairerDBDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerDBDemoUI repairerDBDemoUI = this.f20441d;
            Intent className = new Intent().setClassName(this.f20441d, "com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(className);
            RepairerDBDemoUI repairerDBDemoUI2 = repairerDBDemoUI;
            C117292a.m165358d(repairerDBDemoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            repairerDBDemoUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(repairerDBDemoUI2, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI$c */
    public static final class C5085c implements View.OnClickListener {

        /* renamed from: d */
        public static final C5085c f20442d = new C5085c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7205n;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("DB组件Demo");
        setBackBtn(new C5083a(this));
        ((Button) findViewById(C0966R.C0970id.bzb)).setOnClickListener(new C5084b(this));
        ((Button) findViewById(C0966R.C0970id.bzc)).setOnClickListener(C5085c.f20442d);
    }
}
