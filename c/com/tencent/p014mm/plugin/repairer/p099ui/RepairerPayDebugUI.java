package com.tencent.p014mm.plugin.repairer.p099ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KCacheService;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import m00.C76739c;
import p533ga.C75894f;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI */
public final class RepairerPayDebugUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI$a */
    public static final class C70979a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPayDebugUI f205444d;

        public C70979a(RepairerPayDebugUI repairerPayDebugUI) {
            this.f205444d = repairerPayDebugUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205444d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI$b */
    public static final class C70980b implements View.OnClickListener {

        /* renamed from: d */
        public static final C70980b f205445d = new C70980b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KCacheService Qu0 = ((C75894f) C86312j.m106911c(C75894f.class)).Qu0();
            byte[] bytes = "0".getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            Qu0.set("TOUCH_ID_OPEN_TIPS_SHOW_TIMES_KEY", bytes, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI$c */
    public static final class C70981c implements View.OnClickListener {

        /* renamed from: d */
        public static final C70981c f205446d = new C70981c();

        /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI$c$a */
        public static final class C70982a extends VoidITransmitKvDataCallback {
            public void call(ITransmitKvData iTransmitKvData) {
            }
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C75894f) C86312j.m106911c(C75894f.class)).cs0().startDcepPayImpl("1234", "dcep://uniwallet/unipay", ITransmitKvData.create(), new C70982a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI$d */
    public static final class C70983d implements View.OnClickListener {

        /* renamed from: d */
        public static final C70983d f205447d = new C70983d();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C76739c) C86312j.m106911c(C76739c.class)).fw0();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.crd;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C70979a(this));
        ((Button) findViewById(C0966R.C0970id.f357713g34)).setOnClickListener(C70980b.f205445d);
        ((Button) findViewById(C0966R.C0970id.mwq)).setOnClickListener(C70981c.f205446d);
        ((Button) findViewById(C0966R.C0970id.mxo)).setOnClickListener(C70983d.f205447d);
    }

    public void onResume() {
        Log.m105918d("MicroMsg.RepairerPayDebugUI", "onResume");
        super.onResume();
    }
}
