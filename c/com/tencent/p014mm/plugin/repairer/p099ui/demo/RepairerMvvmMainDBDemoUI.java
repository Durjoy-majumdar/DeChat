package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bj2.C54474w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import p749xh.C66275u5;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmMainDBDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI */
public final class RepairerMvvmMainDBDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public final String f163951d = "MicroMsg.RepairerMvvmMainDBDemoUI";

    /* renamed from: e */
    public final String f163952e = "DemoThread";

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI$a */
    public static final class C57222a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmMainDBDemoUI f163953d;

        public C57222a(RepairerMvvmMainDBDemoUI repairerMvvmMainDBDemoUI) {
            this.f163953d = repairerMvvmMainDBDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163953d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI$b */
    public static final class C57223b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmMainDBDemoUI f163954d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57223b(RepairerMvvmMainDBDemoUI repairerMvvmMainDBDemoUI) {
            super(0);
            this.f163954d = repairerMvvmMainDBDemoUI;
        }

        public Object invoke() {
            C66275u5.createTable(C86709a0.m107535s().f251811i);
            Log.m105924i(this.f163954d.f163951d, "create table done");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI$c */
    public static final class C57224c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmMainDBDemoUI f163955d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI$c$a */
        public static final class C57225a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C57225a f163956d = new C57225a();

            public C57225a() {
                super(0);
            }

            public Object invoke() {
                C54474w wVar = new C54474w();
                wVar.mo90397p2("test_" + C31543z5.m39453c());
                wVar.mo90398q2("这是一条测试消息");
                C66275u5.m78194n2(wVar, true);
                return C13598b0.f38549a;
            }
        }

        public C57224c(RepairerMvvmMainDBDemoUI repairerMvvmMainDBDemoUI) {
            this.f163955d = repairerMvvmMainDBDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmMainDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61926c.m72661F(this.f163955d.f163952e, C57225a.f163956d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmMainDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI$d */
    public static final class C57226d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C57226d f163957d = new C57226d();

        public C57226d() {
            super(0);
        }

        public Object invoke() {
            C86709a0.m107535s().f251811i.mo125614d("LiveDemoDBInfo");
            return C13598b0.f38549a;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.coe;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("LiveDBDemo");
        setBackBtn(new C57222a(this));
        C61926c.m72661F(this.f163952e, new C57223b(this));
        View findViewById = findViewById(C0966R.C0970id.f358458f80);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C57224c(this));
        }
    }

    public void onDestroy() {
        C61926c.m72661F(this.f163952e, C57226d.f163957d);
        super.onDestroy();
    }
}
