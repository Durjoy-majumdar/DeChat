package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import di3.C86312j;
import h81.C32735h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSeparationControllerUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSeparationControllerUI */
public final class RepairerSeparationControllerUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSeparationControllerUI$a */
    public static final class C5125a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSeparationControllerUI f20507d;

        public C5125a(RepairerSeparationControllerUI repairerSeparationControllerUI) {
            this.f20507d = repairerSeparationControllerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20507d.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bss;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C32735h.class;
        super.onCreate(bundle);
        setBackBtn(new C5125a(this));
        ((TextView) findViewById(C0966R.C0970id.obk)).setText("clicfg_colorful_qrcode_disable_locally_generated:" + ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_colorful_qrcode_disable_locally_generated, -1));
        ((TextView) findViewById(C0966R.C0970id.obl)).setText("clicfg_colorful_qrcode_chatroom_newui_disable:" + ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_colorful_qrcode_chatroom_newui_disable, -1));
    }
}
