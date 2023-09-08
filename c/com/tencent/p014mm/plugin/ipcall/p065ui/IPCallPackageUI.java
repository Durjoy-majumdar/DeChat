package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.C1650c;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p12.C11798e;
import p12.C11801j;
import p910lj.C76701a;
import q12.C12030e;
import te3.C48694ac2;
import te3.qx4;
import te3.sx4;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI */
public class IPCallPackageUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ListView f19490d = null;

    /* renamed from: e */
    public TextView f19491e = null;

    /* renamed from: f */
    public ProgressDialog f19492f = null;

    /* renamed from: g */
    public ProgressDialog f19493g = null;

    /* renamed from: h */
    public C4644d f19494h = null;

    /* renamed from: i */
    public C11798e f19495i = null;

    /* renamed from: j */
    public C11801j f19496j = null;

    /* renamed from: n */
    public C12030e f19497n = new C12030e();

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$a */
    public class C4641a implements MenuItem.OnMenuItemClickListener {
        public C4641a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallPackageUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$b */
    public class C4642b implements DialogInterface.OnClickListener {
        public C4642b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C12030e eVar = IPCallPackageUI.this.f19497n;
            eVar.f35033h++;
            eVar.mo11891b();
            Intent intent = new Intent();
            intent.setClass(IPCallPackageUI.this.getContext(), IPCallRechargeUI.class);
            IPCallPackageUI iPCallPackageUI = IPCallPackageUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            IPCallPackageUI iPCallPackageUI2 = iPCallPackageUI;
            C117292a.m165358d(iPCallPackageUI2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallPackageUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(iPCallPackageUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            IPCallPackageUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$c */
    public class C4643c implements DialogInterface.OnClickListener {
        public C4643c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C12030e eVar = IPCallPackageUI.this.f19497n;
            eVar.f35034i++;
            eVar.mo11891b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$d */
    public static class C4644d extends BaseAdapter {

        /* renamed from: d */
        public List<qx4> f19501d = null;

        /* renamed from: e */
        public IPCallPackageUI f19502e;

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$d$a */
        public class C4645a implements View.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$d$a$a */
            public class C4646a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ qx4 f19504d;

                public C4646a(qx4 qx4) {
                    this.f19504d = qx4;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    IPCallPackageUI iPCallPackageUI = C4644d.this.f19502e;
                    iPCallPackageUI.f19497n.f35029d++;
                    String str = this.f19504d.f140608j;
                    iPCallPackageUI.getClass();
                    Log.m105925i("MicroMsg.IPCallPackageUI", "startPurchasePackage productID:%s", str);
                    ProgressDialog progressDialog = iPCallPackageUI.f19493g;
                    if (progressDialog == null) {
                        iPCallPackageUI.f19493g = C76879j.m92723Q(iPCallPackageUI.getContext(), iPCallPackageUI.getString(C0966R.string.a3h), iPCallPackageUI.getString(C0966R.string.fwr), true, false, new C4706q0(iPCallPackageUI));
                    } else {
                        progressDialog.show();
                    }
                    iPCallPackageUI.f19496j = new C11801j(str);
                    C97625j3.m125815e().mo123460f(iPCallPackageUI.f19496j);
                }
            }

            /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$d$a$b */
            public class C4647b implements DialogInterface.OnClickListener {
                public C4647b() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C12030e eVar = C4644d.this.f19502e.f19497n;
                    eVar.f35030e++;
                    eVar.mo11891b();
                }
            }

            public C4645a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                qx4 qx4 = (qx4) C4644d.this.getItem(((Integer) view.getTag()).intValue());
                if (qx4 == null || Util.isNullOrNil(qx4.f140608j)) {
                    Log.m105920e("MicroMsg.IPCallPackageUI", "buyBtnClick: proToBuy is null");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C4644d.this.f19502e.f19497n.mo11893d();
                IPCallPackageUI iPCallPackageUI = C4644d.this.f19502e;
                C12030e eVar = iPCallPackageUI.f19497n;
                eVar.f35028c++;
                eVar.f35032g = qx4.f140608j;
                C76879j.m92709C(iPCallPackageUI, iPCallPackageUI.getString(C0966R.string.fwk, new Object[]{qx4.f140603e, qx4.f140602d}), C4644d.this.f19502e.getString(C0966R.string.fwl), C4644d.this.f19502e.getString(C0966R.string.fwi), C4644d.this.f19502e.getString(C0966R.string.fwj), false, new C4646a(qx4), new C4647b());
                C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI$d$b */
        public class C4648b {

            /* renamed from: a */
            public CdnImageView f19507a;

            /* renamed from: b */
            public TextView f19508b;

            /* renamed from: c */
            public TextView f19509c;

            /* renamed from: d */
            public TextView f19510d;

            /* renamed from: e */
            public TextView f19511e;

            /* renamed from: f */
            public Button f19512f;

            public C4648b(C4644d dVar, C4641a aVar) {
            }
        }

        public C4644d(IPCallPackageUI iPCallPackageUI) {
            this.f19502e = iPCallPackageUI;
        }

        public int getCount() {
            List<qx4> list = this.f19501d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            List<qx4> list = this.f19501d;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C4648b bVar;
            if (view == null) {
                view = ((LayoutInflater) this.f19502e.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.b2m, viewGroup, false);
                bVar = new C4648b(this, (C4641a) null);
                bVar.f19507a = (CdnImageView) view.findViewById(C0966R.C0970id.hqe);
                bVar.f19508b = (TextView) view.findViewById(C0966R.C0970id.hqi);
                bVar.f19509c = (TextView) view.findViewById(C0966R.C0970id.hqj);
                bVar.f19510d = (TextView) view.findViewById(C0966R.C0970id.hq_);
                bVar.f19511e = (TextView) view.findViewById(C0966R.C0970id.hqa);
                bVar.f19512f = (Button) view.findViewById(C0966R.C0970id.hq9);
                view.setTag(bVar);
            } else {
                bVar = (C4648b) view.getTag();
            }
            qx4 qx4 = (qx4) getItem(i);
            if (qx4 == null) {
                return view;
            }
            bVar.f19508b.setText(qx4.f140602d);
            bVar.f19509c.setText(qx4.f140603e);
            bVar.f19511e.setText(qx4.f140605g);
            bVar.f19510d.setText(qx4.f140604f);
            bVar.f19507a.setVisibility(0);
            bVar.f19507a.setUrl(qx4.f140606h);
            if (qx4.f140607i == 0) {
                bVar.f19512f.setEnabled(true);
            } else {
                bVar.f19512f.setEnabled(false);
            }
            bVar.f19512f.setTag(Integer.valueOf(i));
            bVar.f19512f.setOnClickListener(new C4645a());
            return view;
        }
    }

    /* renamed from: H7 */
    public final void mo5522H7() {
        Log.m105924i("MicroMsg.IPCallPackageUI", "startGetPackageProductList");
        C4644d dVar = this.f19494h;
        if (dVar != null) {
            dVar.f19501d = null;
            dVar.notifyDataSetChanged();
        }
        ListView listView = this.f19490d;
        if (listView != null) {
            listView.setVisibility(8);
        }
        TextView textView = this.f19491e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ProgressDialog progressDialog = this.f19492f;
        if (progressDialog == null) {
            this.f19492f = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.fug), true, true, new C4703p0(this));
        } else {
            progressDialog.show();
        }
        this.f19495i = new C11798e();
        C97625j3.m125815e().mo123460f(this.f19495i);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2n;
    }

    public final void init() {
        setMMTitle((int) C0966R.string.fwq);
        setBackBtn(new C4641a());
        this.f19490d = (ListView) findViewById(C0966R.C0970id.hqh);
        C4644d dVar = new C4644d(this);
        this.f19494h = dVar;
        this.f19490d.setAdapter(dVar);
        this.f19491e = (TextView) findViewById(C0966R.C0970id.hgk);
        mo5522H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(831, this);
        C97625j3.m125815e().mo123455a(C1650c.CTRL_INDEX, this);
        this.f19497n.mo11893d();
        C12030e eVar = this.f19497n;
        eVar.f35027b++;
        eVar.mo11891b();
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(831, this);
        C97625j3.m125815e().mo123470p(C1650c.CTRL_INDEX, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        List<qx4> list;
        LinkedList<qx4> linkedList;
        ProgressDialog progressDialog = this.f19492f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f19492f.dismiss();
        }
        ProgressDialog progressDialog2 = this.f19493g;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.f19493g.dismiss();
        }
        qx4 qx4 = null;
        if (yVar instanceof C11798e) {
            Log.m105925i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallGetPackageProductList errCode:%d, errMsg:%s", Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C48694ac2 ac22 = ((C11798e) yVar).f34513e;
                if (ac22 == null || (linkedList = ac22.f130430e) == null || linkedList.size() <= 0) {
                    C4644d dVar = this.f19494h;
                    dVar.f19501d = null;
                    dVar.notifyDataSetChanged();
                    this.f19491e.setVisibility(0);
                    return;
                }
                C4644d dVar2 = this.f19494h;
                dVar2.f19501d = ac22.f130430e;
                dVar2.notifyDataSetChanged();
                this.f19490d.setVisibility(0);
                return;
            }
            C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.fud), 0).show();
            finish();
        } else if (yVar instanceof C11801j) {
            Log.m105925i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallPurchasePackage errCode:%d, errMsg:%s", Integer.valueOf(i2), str);
            C12030e eVar = this.f19497n;
            eVar.f35031f = i2;
            if (i == 0 && i2 == 0) {
                eVar.mo11891b();
                C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.fws), 0).show();
                mo5522H7();
            } else if (i2 == 101) {
                C4644d dVar3 = this.f19494h;
                sx4 sx4 = ((C11801j) yVar).f34524e;
                String str2 = sx4 != null ? sx4.f141819d : "";
                dVar3.getClass();
                if (!Util.isNullOrNil(str2) && (list = dVar3.f19501d) != null) {
                    Iterator<qx4> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            qx4 next = it.next();
                            if (next != null && next.f140608j.equals(str2)) {
                                qx4 = next;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (qx4 == null) {
                    Log.m105920e("MicroMsg.IPCallPackageUI", "onSceneEnd: proToBuy is null");
                    this.f19497n.mo11891b();
                    C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.fwm), 0).show();
                    return;
                }
                C76879j.m92709C(getContext(), getContext().getString(C0966R.string.fwo, new Object[]{qx4.f140603e, qx4.f140602d}), getContext().getString(C0966R.string.fwp), getContext().getString(C0966R.string.fuy), getContext().getString(C0966R.string.fwj), false, new C4642b(), new C4643c());
            } else {
                eVar.mo11891b();
                C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.fwm), 0).show();
                mo5522H7();
            }
        } else {
            Log.m105925i("MicroMsg.IPCallPackageUI", "onSceneEnd errCode:%d, errMsg:%s", Integer.valueOf(i2), str);
        }
    }
}
