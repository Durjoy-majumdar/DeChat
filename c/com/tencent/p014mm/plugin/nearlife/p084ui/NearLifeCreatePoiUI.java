package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import fc2.C45768e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;
import p910lj.C76701a;
import qn3.C77382c;
import qo3.C89779i0;
import te3.C51163rv3;
import te3.C64234an2;
import wm0.C91036c;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI */
public class NearLifeCreatePoiUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public static final /* synthetic */ int f346787A = 0;

    /* renamed from: d */
    public C64234an2 f346788d;

    /* renamed from: e */
    public String f346789e;

    /* renamed from: f */
    public String f346790f;

    /* renamed from: g */
    public Addr f346791g;

    /* renamed from: h */
    public String f346792h;

    /* renamed from: i */
    public EditText f346793i;

    /* renamed from: j */
    public EditText f346794j;

    /* renamed from: n */
    public TextView f346795n;

    /* renamed from: o */
    public TextView f346796o;

    /* renamed from: p */
    public C78083b f346797p;

    /* renamed from: q */
    public C89779i0 f346798q;

    /* renamed from: r */
    public C45768e f346799r;

    /* renamed from: s */
    public String f346800s;

    /* renamed from: t */
    public View.OnClickListener f346801t = new C69938a();

    /* renamed from: u */
    public View.OnClickListener f346802u = new C4923b();

    /* renamed from: v */
    public View.OnClickListener f346803v = new C4924c();

    /* renamed from: w */
    public MenuItem.OnMenuItemClickListener f346804w = new C115609d();

    /* renamed from: x */
    public C78083b.C78084a f346805x = new C115611e();

    /* renamed from: y */
    public MenuItem.OnMenuItemClickListener f346806y = new C115612f();

    /* renamed from: z */
    public TextWatcher f346807z = new C115613g();

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$b */
    public class C4923b implements View.OnClickListener {
        public C4923b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClass(NearLifeCreatePoiUI.this.getContext(), SelectPoiCategoryUI.class);
            NearLifeCreatePoiUI.this.startActivityForResult(intent, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$c */
    public class C4924c implements View.OnClickListener {
        public C4924c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View findViewById = NearLifeCreatePoiUI.this.findViewById(C0966R.C0970id.kx5);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = NearLifeCreatePoiUI.this.findViewById(C0966R.C0970id.g1b);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = NearLifeCreatePoiUI.this.findViewById(C0966R.C0970id.g1d);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$a */
    public class C69938a implements View.OnClickListener {
        public C69938a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("ui_title", C0966R.string.h9l);
            Addr addr = NearLifeCreatePoiUI.this.f346791g;
            if (addr != null) {
                intent.putExtra("extra_province", addr.f343958f);
                intent.putExtra("extra_city", NearLifeCreatePoiUI.this.f346791g.f343959g);
            }
            C88144b.m109795m(NearLifeCreatePoiUI.this.getContext(), "address", ".ui.WalletMultiRcptSelectUI", intent, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$d */
    public class C115609d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$d$a */
        public class C115610a implements DialogInterface.OnCancelListener {
            public C115610a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(NearLifeCreatePoiUI.this.f346799r);
            }
        }

        public C115609d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C115669n.INSTANCE.mo160131h(11138, "2", "0", NearLifeCreatePoiUI.this.f346800s);
            NearLifeCreatePoiUI nearLifeCreatePoiUI = NearLifeCreatePoiUI.this;
            nearLifeCreatePoiUI.f346798q = C76879j.m92723Q(nearLifeCreatePoiUI.getContext(), NearLifeCreatePoiUI.this.getString(C0966R.string.h9b), NearLifeCreatePoiUI.this.getString(C0966R.string.h9c), true, true, new C115610a());
            NearLifeCreatePoiUI nearLifeCreatePoiUI2 = NearLifeCreatePoiUI.this;
            nearLifeCreatePoiUI2.f346789e = nearLifeCreatePoiUI2.f346793i.getText().toString();
            NearLifeCreatePoiUI nearLifeCreatePoiUI3 = NearLifeCreatePoiUI.this;
            nearLifeCreatePoiUI3.f346790f = nearLifeCreatePoiUI3.f346795n.getText().toString();
            NearLifeCreatePoiUI nearLifeCreatePoiUI4 = NearLifeCreatePoiUI.this;
            nearLifeCreatePoiUI4.f346792h = nearLifeCreatePoiUI4.f346794j.getText().toString();
            String obj = ((EditText) NearLifeCreatePoiUI.this.findViewById(C0966R.C0970id.clb)).getText().toString();
            String charSequence = ((TextView) NearLifeCreatePoiUI.this.findViewById(C0966R.C0970id.kxp)).getText().toString();
            LinkedList linkedList = new LinkedList();
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = charSequence;
            rv32.f141176e = true;
            linkedList.add(rv32);
            NearLifeCreatePoiUI nearLifeCreatePoiUI5 = NearLifeCreatePoiUI.this;
            nearLifeCreatePoiUI5.f346799r = new C45768e(nearLifeCreatePoiUI5.f346789e, nearLifeCreatePoiUI5.f346790f, nearLifeCreatePoiUI5.f346792h, nearLifeCreatePoiUI5.f346788d, linkedList.size(), linkedList, obj, (String) null);
            C97625j3.m125815e().mo123460f(NearLifeCreatePoiUI.this.f346799r);
            Log.m105918d("MicroMsg.NearLifeCreatePoiUI", "do scene start");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$e */
    public class C115611e implements C78083b.C78084a {
        public C115611e() {
        }

        public void onLocationAddr(Addr addr) {
            String str = Util.nullAsNil(addr.f343959g) + Util.nullAsNil(addr.f343961i);
            String str2 = Util.nullAsNil(addr.f343962j) + Util.nullAsNil(addr.f343963n);
            Log.m105918d("MicroMsg.NearLifeCreatePoiUI", "get address:" + str);
            if (Util.isNullOrNil(NearLifeCreatePoiUI.this.f346795n.getText().toString())) {
                NearLifeCreatePoiUI.this.f346795n.setText(str);
            }
            if (Util.isNullOrNil(NearLifeCreatePoiUI.this.f346794j.getText().toString()) && !Util.isNullOrNil(str2)) {
                NearLifeCreatePoiUI.this.f346794j.setText(str2);
            }
            NearLifeCreatePoiUI.this.f346791g = addr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$f */
    public class C115612f implements MenuItem.OnMenuItemClickListener {
        public C115612f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NearLifeCreatePoiUI nearLifeCreatePoiUI = NearLifeCreatePoiUI.this;
            int i = NearLifeCreatePoiUI.f346787A;
            nearLifeCreatePoiUI.getClass();
            C76879j.m92743n(nearLifeCreatePoiUI, C0966R.string.h96, C0966R.string.h9b, new C115618d(nearLifeCreatePoiUI), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI$g */
    public class C115613g implements TextWatcher {
        public C115613g() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (NearLifeCreatePoiUI.this.f346793i.getText().toString().trim().length() == 0 || NearLifeCreatePoiUI.this.f346794j.getText().toString().trim().length() == 0 || NearLifeCreatePoiUI.this.f346795n.getText().toString().trim().length() == 0) {
                NearLifeCreatePoiUI.this.enableOptionMenu(0, false);
            } else {
                NearLifeCreatePoiUI.this.enableOptionMenu(0, true);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bjs;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.h9b);
        ((ViewGroup) findViewById(C0966R.C0970id.g1c)).setOnClickListener(this.f346801t);
        ((ViewGroup) findViewById(C0966R.C0970id.g1b)).setOnClickListener(this.f346802u);
        ((TextView) findViewById(C0966R.C0970id.kx5)).setOnClickListener(this.f346803v);
        View findViewById = findViewById(C0966R.C0970id.kx5);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.g1b);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById3 = findViewById(C0966R.C0970id.g1d);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346793i = (EditText) findViewById(C0966R.C0970id.cla);
        this.f346794j = (EditText) findViewById(C0966R.C0970id.cl6);
        this.f346795n = (TextView) findViewById(C0966R.C0970id.kxq);
        this.f346796o = (TextView) findViewById(C0966R.C0970id.kxp);
        this.f346793i.addTextChangedListener(this.f346807z);
        this.f346794j.addTextChangedListener(this.f346807z);
        this.f346795n.addTextChangedListener(this.f346807z);
        String nullAs = Util.nullAs(getIntent().getStringExtra("get_poi_name"), "");
        if (nullAs.length() != 0) {
            this.f346793i.setText(nullAs);
            this.f346793i.setSelection(nullAs.length());
        }
        C77382c b = C77382c.m93286b(this.f346793i);
        b.f225611e = 0;
        b.f225610d = 100;
        b.mo107499d((C77382c.C77383a) null);
        C77382c b2 = C77382c.m93286b(this.f346794j);
        b2.f225611e = 0;
        b2.f225610d = 400;
        b2.mo107499d((C77382c.C77383a) null);
        C77382c b3 = C77382c.m93286b((EditText) findViewById(C0966R.C0970id.clb));
        b3.f225611e = 0;
        b3.f225610d = 100;
        b3.mo107499d((C77382c.C77383a) null);
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), this.f346804w, (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(0, false);
        setBackBtn(this.f346806y);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            String stringExtra = intent.getStringExtra("karea_result");
            if (!Util.isNullOrNil(stringExtra)) {
                ((TextView) findViewById(C0966R.C0970id.kxq)).setText(stringExtra.replace(" ", ""));
            }
        } else if (i == 2 && -1 == i2 && intent != null) {
            this.f346796o.setText(Util.nullAsNil(intent.getStringExtra("poi_category")));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(C91036c.CTRL_INDEX, this);
        C64234an2 an22 = new C64234an2();
        this.f346788d = an22;
        an22.f182095e = getIntent().getFloatExtra("get_lat", -85.0f);
        this.f346788d.f182094d = getIntent().getFloatExtra("get_lng", -1000.0f);
        this.f346788d.f182096f = getIntent().getIntExtra("get_preci", 0);
        C64234an2 an23 = this.f346788d;
        an23.f182098h = "";
        an23.f182099i = 0;
        an23.f182097g = "";
        C78083b oe02 = ((C78085c) C86312j.m106911c(C78085c.class)).oe0();
        this.f346797p = oe02;
        if (oe02 != null) {
            C64234an2 an24 = this.f346788d;
            oe02.mo108054a(new C118505d((double) an24.f182095e, (double) an24.f182094d), this.f346805x);
        }
        String stringExtra = getIntent().getStringExtra("search_id");
        this.f346800s = stringExtra;
        Log.m105919d("MicroMsg.NearLifeCreatePoiUI", "tofuliutest searchid: %s", stringExtra);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(C91036c.CTRL_INDEX, this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode()) {
            return super.onKeyDown(i, keyEvent);
        }
        C76879j.m92743n(this, C0966R.string.h96, C0966R.string.h9b, new C115618d(this), (DialogInterface.OnClickListener) null);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.NearLifeCreatePoiUI", "errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            this.f346798q.dismiss();
            C45768e eVar = (C45768e) yVar;
            eVar.getClass();
            Intent intent = new Intent();
            C64234an2 an22 = this.f346788d;
            if (an22 != null) {
                intent.putExtra("get_lat", an22.f182095e);
                intent.putExtra("get_lng", this.f346788d.f182094d);
            }
            Addr addr = this.f346791g;
            if (addr != null) {
                intent.putExtra("get_city", addr.f343959g);
            }
            intent.putExtra("get_poi_address", this.f346790f);
            intent.putExtra("get_poi_classify_id", eVar.f123656f);
            intent.putExtra("get_poi_name", this.f346789e);
            intent.putExtra("get_poi_classify_type", 1);
            setResult(-1, intent);
            finish();
            return;
        }
        this.f346798q.dismiss();
        C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.h9_), 1).show();
        this.f346799r = null;
    }
}
