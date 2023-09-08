package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p220pr.C100835h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWCDBDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWCDBDemoUI */
public final class RepairerFlutterWCDBDemoUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWCDBDemoUI$a */
    public static final class C57205a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFlutterWCDBDemoUI f163923d;

        public C57205a(RepairerFlutterWCDBDemoUI repairerFlutterWCDBDemoUI) {
            this.f163923d = repairerFlutterWCDBDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWCDBDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C100835h) C86312j.m106911c(C100835h.class)).mo140310TL(this.f163923d, "wcdb_test", (Map<String, Object>) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWCDBDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.czb;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Button) findViewById(C0966R.C0970id.anq)).setOnClickListener(new C57205a(this));
    }
}
