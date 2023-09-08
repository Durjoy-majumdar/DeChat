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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI */
public final class RepairerConversationDemoUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI$a */
    public static final class C5080a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerConversationDemoUI f20437d;

        public C5080a(RepairerConversationDemoUI repairerConversationDemoUI) {
            this.f20437d = repairerConversationDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20437d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI$b */
    public static final class C5081b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerConversationDemoUI f20438d;

        public C5081b(RepairerConversationDemoUI repairerConversationDemoUI) {
            this.f20438d = repairerConversationDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerConversationDemoUI repairerConversationDemoUI = this.f20438d;
            Intent className = new Intent().setClassName(this.f20438d, "com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(className);
            RepairerConversationDemoUI repairerConversationDemoUI2 = repairerConversationDemoUI;
            C117292a.m165358d(repairerConversationDemoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            repairerConversationDemoUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(repairerConversationDemoUI2, "com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI$c */
    public static final class C5082c implements View.OnClickListener {

        /* renamed from: d */
        public static final C5082c f20439d = new C5082c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerConversationDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("ConversationDemo");
        setBackBtn(new C5080a(this));
        ((Button) findViewById(C0966R.C0970id.f358432f30)).setOnClickListener(new C5081b(this));
        ((Button) findViewById(C0966R.C0970id.krp)).setOnClickListener(C5082c.f20439d);
    }
}
