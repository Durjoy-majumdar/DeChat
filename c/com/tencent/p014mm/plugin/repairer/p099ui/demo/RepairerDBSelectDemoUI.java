package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bj2.C39772y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import p606mm.C47080g;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI */
public final class RepairerDBSelectDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public final String f20443d = "MicroMsg.RepairerDBSelectDemoUI";

    /* renamed from: e */
    public TextView f20444e;

    /* renamed from: f */
    public TextView f20445f;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI$a */
    public static final class C5086a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDBSelectDemoUI f20446d;

        public C5086a(RepairerDBSelectDemoUI repairerDBSelectDemoUI) {
            this.f20446d = repairerDBSelectDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20446d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI$b */
    public static final class C5087b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDBSelectDemoUI f20447d;

        public C5087b(RepairerDBSelectDemoUI repairerDBSelectDemoUI) {
            this.f20447d = repairerDBSelectDemoUI;
        }

        public final void onClick(View view) {
            String obj;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerDBSelectDemoUI repairerDBSelectDemoUI = this.f20447d;
            repairerDBSelectDemoUI.getClass();
            if (MMApplicationContext.isMMProcess() && (obj = ((MMEditText) repairerDBSelectDemoUI.findViewById(C0966R.C0970id.f2z)).getText().toString()) != null && obj.length() > 0) {
                C86709a0.m107525e().postToWorker(new C39772y(obj, repairerDBSelectDemoUI));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI$c */
    public static final class C5088c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDBSelectDemoUI f20448d;

        public C5088c(RepairerDBSelectDemoUI repairerDBSelectDemoUI) {
            this.f20448d = repairerDBSelectDemoUI;
        }

        public final void onClick(View view) {
            byte[] bArr;
            CharSequence text;
            String obj;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerDBSelectDemoUI repairerDBSelectDemoUI = this.f20448d;
            repairerDBSelectDemoUI.getClass();
            String str = "db_exec_info_" + C72715f.m85111d("yyyy-MM-dd_HH_mm_ss", System.currentTimeMillis() / ((long) 1000)) + ".json";
            C47080g gVar = (C47080g) C86312j.m106911c(C47080g.class);
            TextView textView = repairerDBSelectDemoUI.f20444e;
            if (textView == null || (text = textView.getText()) == null || (obj = text.toString()) == null) {
                bArr = null;
            } else {
                bArr = obj.getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            }
            gVar.Kt0(str, bArr, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359947bs3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("DB查询工具Demo");
        setBackBtn(new C5086a(this));
        this.f20444e = (TextView) findViewById(C0966R.C0970id.f359089is1);
        this.f20445f = (TextView) findViewById(C0966R.C0970id.btw);
        ((Button) findViewById(C0966R.C0970id.hll)).setOnClickListener(new C5087b(this));
        ((Button) findViewById(C0966R.C0970id.cn6)).setOnClickListener(new C5088c(this));
    }
}
