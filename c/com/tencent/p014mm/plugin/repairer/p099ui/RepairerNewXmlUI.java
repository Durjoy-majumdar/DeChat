package com.tencent.p014mm.plugin.repairer.p099ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import di3.C86312j;
import f62.C75707s0;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C76912y0;
import ob0.C35136m;
import te3.C51163rv3;
import te3.C77949j3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerNewXmlUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI */
public final class RepairerNewXmlUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI$a */
    public static final class C42877a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerNewXmlUI f116102d;

        public C42877a(RepairerNewXmlUI repairerNewXmlUI) {
            this.f116102d = repairerNewXmlUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116102d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI$b */
    public static final class C42878b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerNewXmlUI f116103d;

        public C42878b(RepairerNewXmlUI repairerNewXmlUI) {
            this.f116103d = repairerNewXmlUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerNewXmlUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77949j3 j3Var = new C77949j3();
            j3Var.f227630g = 10002;
            String obj = ((MMEditText) this.f116103d.findViewById(C0966R.C0970id.lv7)).getText().toString();
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = obj;
            rv32.f141176e = true;
            j3Var.f227631h = rv32;
            ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo56403Fg(new C35136m.C35137a(j3Var, false, false, false));
            C76912y0.m92774m(this.f116103d.getContext(), "推送成功！");
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerNewXmlUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsy;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("微信推送NewXML");
        setBackBtn(new C42877a(this));
        findViewById(C0966R.C0970id.hll).setOnClickListener(new C42878b(this));
    }
}
