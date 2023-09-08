package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import a70.C112760b;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import bi3.C0289a;
import bj2.C54468j;
import bj2.C54470o;
import bj2.C54471p;
import bj2.C54472r;
import bj2.C54473v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ColumnOrder;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C60247c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import ky3.C88334c;
import o40.C61926c;
import p278yh.C66646o;
import p749xh.C53339k1;
import p749xh.C66275u5;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C64197v;
import zb2.C103009m;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI */
public final class RepairerMvvmDBDemoUI extends BaseRepairerUI {

    /* renamed from: i */
    public static final /* synthetic */ int f163934i = 0;

    /* renamed from: d */
    public final String f163935d = "DemoThread";

    /* renamed from: e */
    public WxRecyclerView f163936e;

    /* renamed from: f */
    public final C13601g f163937f = C36568h.m40985a(new C57212b(this));

    /* renamed from: g */
    public final C13601g f163938g = C36568h.m40985a(new C57211a(this));

    /* renamed from: h */
    public final C13601g f163939h = C36568h.m40985a(new C57221h(this));

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$a */
    public static final class C57211a extends C87413o implements C32224a<C103009m<C54471p>> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57211a(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            super(0);
            this.f163940d = repairerMvvmDBDemoUI;
        }

        public Object invoke() {
            this.f163940d.getClass();
            return new C103009m((MvvmList) ((C36570n) this.f163940d.f163937f).getValue(), new RepairerMvvmDBDemoUI$buildItemConvertFactory$1(), false, 4, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$b */
    public static final class C57212b extends C87413o implements C32224a<MvvmList<C54471p>> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57212b(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            super(0);
            this.f163941d = repairerMvvmDBDemoUI;
        }

        public Object invoke() {
            return new MvvmList(new C54470o(), new C53769h(), this.f163941d, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$c */
    public static final class C57213c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163942d;

        public C57213c(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            this.f163942d = repairerMvvmDBDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163942d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$d */
    public static final class C57214d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57214d(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            super(0);
            this.f163943d = repairerMvvmDBDemoUI;
        }

        public Object invoke() {
            Class cls = C54468j.class;
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            C86009m1 m1Var = new C86009m1(C112760b.m154236i0("dbdemo"), "demo.db");
            C60247c.C60248a aVar = C60247c.f171775g;
            String i = m1Var.mo119971i();
            C87412m.m108593f(i, "dbFile.absolutePath");
            ((C54468j) aVar.mo85234a(cls)).mo85232c3(i);
            Log.m105924i("MicroMsg.RepairerMvvmDBDemoUI", "create db done");
            RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f163943d;
            ((C54472r) ((C54468j) aVar.mo85234a(cls)).mo85233d3(C54472r.class)).observe((C0125s) repairerMvvmDBDemoUI, new C57230i(repairerMvvmDBDemoUI));
            C61926c.m72668M(new C57231j(this.f163943d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$e */
    public static final class C57215e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163944d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$e$a */
        public static final class C57216a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C57216a f163945d = new C57216a();

            public C57216a() {
                super(0);
            }

            public Object invoke() {
                C39622i0 a;
                C54473v vVar = new C54473v();
                vVar.mo90397p2("test_" + C31543z5.m39453c());
                vVar.mo90398q2("这是一条测试消息");
                vVar.mo90402u2(C31543z5.m39453c());
                C88334c.C88335a aVar = C88334c.f255322d;
                vVar.mo90399r2(aVar.mo122717f());
                vVar.mo90401t2(1);
                vVar.mo90400s2(aVar.mo122719i());
                vVar.mo90396o2(aVar.mo122715d());
                Class cls = C54468j.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                MvvmStorage.insert$default(((C54468j) a).mo85233d3(C54472r.class), vVar, false, false, false, 14, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C57215e(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            this.f163944d = repairerMvvmDBDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61926c.m72661F(this.f163944d.f163935d, C57216a.f163945d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$f */
    public static final class C57217f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163946d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$f$a */
        public static final class C57218a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C57218a f163947d = new C57218a();

            public C57218a() {
                super(0);
            }

            public Object invoke() {
                Class cls = C54468j.class;
                SingleTable singleTable = C66275u5.f190679p;
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                LinkedList linkedList3 = new LinkedList();
                Column column = C66275u5.f190680q;
                linkedList.add(column);
                SingleTable singleTable2 = C66275u5.f190679p;
                SelectSql build = singleTable2.select((List<? extends ISqlColumn>) linkedList).where((ISqlCondition) null).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build();
                C60247c.C60248a aVar = C60247c.f171775g;
                build.multiString(((C54468j) aVar.mo85234a(cls)).getDB());
                LinkedList linkedList4 = new LinkedList();
                LinkedList linkedList5 = new LinkedList();
                LinkedList linkedList6 = new LinkedList();
                Column column2 = C66275u5.f190682s;
                linkedList4.add(column2);
                singleTable2.select((List<? extends ISqlColumn>) linkedList4).where((ISqlCondition) null).orderBy((List<? extends ISqlOrder>) linkedList5).groupBy((List<? extends Column>) linkedList6).build().multiInt(((C54468j) aVar.mo85234a(cls)).getDB());
                LinkedList linkedList7 = new LinkedList();
                LinkedList linkedList8 = new LinkedList();
                LinkedList linkedList9 = new LinkedList();
                Column column3 = C66275u5.f190683t;
                linkedList7.add(column3);
                singleTable2.select((List<? extends ISqlColumn>) linkedList7).where((ISqlCondition) null).orderBy((List<? extends ISqlOrder>) linkedList8).groupBy((List<? extends Column>) linkedList9).build().multiLong(((C54468j) aVar.mo85234a(cls)).getDB());
                LinkedList linkedList10 = new LinkedList();
                LinkedList linkedList11 = new LinkedList();
                LinkedList linkedList12 = new LinkedList();
                linkedList10.add(column);
                singleTable2.select((List<? extends ISqlColumn>) linkedList10).where((ISqlCondition) null).orderBy((List<? extends ISqlOrder>) linkedList11).groupBy((List<? extends Column>) linkedList12).build().singleString(((C54468j) aVar.mo85234a(cls)).getDB());
                LinkedList linkedList13 = new LinkedList();
                LinkedList linkedList14 = new LinkedList();
                LinkedList linkedList15 = new LinkedList();
                linkedList13.add(column2);
                singleTable2.select((List<? extends ISqlColumn>) linkedList13).where((ISqlCondition) null).orderBy((List<? extends ISqlOrder>) linkedList14).groupBy((List<? extends Column>) linkedList15).build().singleInt(((C54468j) aVar.mo85234a(cls)).getDB());
                LinkedList linkedList16 = new LinkedList();
                LinkedList linkedList17 = new LinkedList();
                LinkedList linkedList18 = new LinkedList();
                linkedList16.add(column3);
                singleTable2.select((List<? extends ISqlColumn>) linkedList16).where((ISqlCondition) null).orderBy((List<? extends ISqlOrder>) linkedList17).groupBy((List<? extends Column>) linkedList18).build().singleLong(((C54468j) aVar.mo85234a(cls)).getDB());
                return C13598b0.f38549a;
            }
        }

        public C57217f(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            this.f163946d = repairerMvvmDBDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61926c.m72661F(this.f163946d.f163935d, C57218a.f163947d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$g */
    public static final class C57219g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163948d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$g$a */
        public static final class C57220a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C57220a f163949d = new C57220a();

            public C57220a() {
                super(0);
            }

            public Object invoke() {
                ArrayList arrayList = new ArrayList();
                C44665r4 jo = ((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo("@t.qq.com");
                if (jo != null) {
                    arrayList.add(jo.f121095b);
                }
                arrayList.add("blogapp");
                arrayList.add("tmessage");
                arrayList.add("officialaccounts");
                arrayList.add("helper_entry");
                arrayList.add(C75592q0.m90789s());
                boolean a = ContactUpgradeHelper.f10280h.mo1134a();
                C0289a.C0290a aVar = C0289a.f857a;
                ISqlCondition and = aVar.mo339d().and(a ? C53339k1.f149479m1.inString(C26236u.m33719b("0")) : C53339k1.f149475i1.notLike("'%@%'"));
                Column column = C53339k1.f149475i1;
                ISqlCondition or = and.and(column.notInString(arrayList)).mo81855or(column.equal("weixin"));
                SingleTable singleTable = C53339k1.f149474h1;
                SelectSql build = singleTable.select((List<? extends ISqlColumn>) C26236u.m33719b(column)).log("MicroMsg.RepairerMvvmDBDemoUI").where(or).orderBy((List<? extends ISqlOrder>) aVar.mo340e()).timeout(5).explainQueryPlan(true).build();
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                LinkedList linkedList3 = new LinkedList();
                linkedList.add(column);
                SelectSql build2 = singleTable.select((List<? extends ISqlColumn>) linkedList).where(column.equal("weixin")).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build();
                C87412m.m108593f(build2, "select().selectUsername(….equal(\"weixin\")).build()");
                SelectSql build3 = build.union(build2).build();
                try {
                    build3.singleQuery(C86709a0.m107535s().f251811i, C72996z1.class);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e, "timeoutBtn", new Object[0]);
                }
                try {
                    build3.multiQuery(C86709a0.m107535s().f251811i, C72996z1.class);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e2, "timeoutBtn", new Object[0]);
                }
                try {
                    build3.singleString(C86709a0.m107535s().f251811i);
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e3, "timeoutBtn", new Object[0]);
                }
                try {
                    build3.multiString(C86709a0.m107535s().f251811i);
                } catch (Exception e4) {
                    Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e4, "timeoutBtn", new Object[0]);
                }
                SelectSql build4 = C53339k1.f149474h1.select((List<? extends ISqlColumn>) C26236u.m33719b(C53339k1.f149476j1)).log("MicroMsg.RepairerMvvmDBDemoUI").where(or).orderBy((List<? extends ISqlOrder>) C64197v.m75537f(new ColumnOrder("showHead", false, 2, (C8480h) null), new C0289a.C0290a.C0291a())).explainQueryPlan(true).build();
                build4.singleQuery(C86709a0.m107535s().f251811i, C72996z1.class);
                build4.multiQuery(C86709a0.m107535s().f251811i, C72996z1.class);
                build4.singleInt(C86709a0.m107535s().f251811i);
                build4.multiInt(C86709a0.m107535s().f251811i);
                build4.singleLong(C86709a0.m107535s().f251811i);
                build4.multiLong(C86709a0.m107535s().f251811i);
                return C13598b0.f38549a;
            }
        }

        public C57219g(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            this.f163948d = repairerMvvmDBDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61926c.m72661F(this.f163948d.f163935d, C57220a.f163949d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmDBDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI$h */
    public static final class C57221h extends C87413o implements C32224a<C66646o> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmDBDemoUI f163950d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57221h(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
            super(0);
            this.f163950d = repairerMvvmDBDemoUI;
        }

        public Object invoke() {
            RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f163950d;
            int i = RepairerMvvmDBDemoUI.f163934i;
            return new C66646o(repairerMvvmDBDemoUI.getContentView());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.coe;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("LiveDBDemo");
        setBackBtn(new C57213c(this));
        C61926c.m72661F(this.f163935d, new C57214d(this));
        C66646o oVar = (C66646o) ((C36570n) this.f163939h).getValue();
        if (oVar.f191644c == null) {
            oVar.f191644c = (Button) oVar.f191642a.findViewById(C0966R.C0970id.f358458f80);
        }
        oVar.f191644c.setOnClickListener(new C57215e(this));
        C66646o oVar2 = (C66646o) ((C36570n) this.f163939h).getValue();
        if (oVar2.f191643b == null) {
            oVar2.f191643b = (Button) oVar2.f191642a.findViewById(C0966R.C0970id.mkw);
        }
        oVar2.f191643b.setOnClickListener(new C57217f(this));
        C66646o oVar3 = (C66646o) ((C36570n) this.f163939h).getValue();
        if (oVar3.f191645d == null) {
            oVar3.f191645d = (Button) oVar3.f191642a.findViewById(C0966R.C0970id.mwt);
        }
        oVar3.f191645d.setOnClickListener(new C57219g(this));
    }
}
