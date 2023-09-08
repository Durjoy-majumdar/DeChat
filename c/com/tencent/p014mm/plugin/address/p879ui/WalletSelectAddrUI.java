package com.tencent.p014mm.plugin.address.p879ui;

import ah0.C112786a;
import ah0.C112787b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import bh0.C113174b;
import bh0.C54460a;
import ch0.C113342o;
import ch0.C113343p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NeedVerifyQQEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.wxmm.v2helper;
import dh0.C7328a;
import di3.C86312j;
import eb0.C97625j3;
import fm0.C86982t0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88990b;
import p287zz.C79442f;
import p823sg.C77710q;
import qo3.C77398g;
import uc0.C52522u;
import xg0.C78803b;
import z04.C119027c;
import zg0.C119113p;
import zg0.C66802f;
import zg0.C66803g;
import zg0.C66804h;
import zg0.C66805i;

/* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI */
public class WalletSelectAddrUI extends MMActivity implements C112786a {

    /* renamed from: w */
    public static final /* synthetic */ int f345287w = 0;

    /* renamed from: d */
    public List<C113174b> f345288d = new LinkedList();

    /* renamed from: e */
    public C113174b f345289e;

    /* renamed from: f */
    public C115235g f345290f;

    /* renamed from: g */
    public ListView f345291g;

    /* renamed from: h */
    public C112787b f345292h = null;

    /* renamed from: i */
    public View f345293i;

    /* renamed from: j */
    public TextView f345294j = null;

    /* renamed from: n */
    public Object f345295n = new Object();

    /* renamed from: o */
    public C77710q f345296o;

    /* renamed from: p */
    public boolean f345297p = false;

    /* renamed from: q */
    public boolean f345298q = false;

    /* renamed from: r */
    public boolean f345299r = false;

    /* renamed from: s */
    public boolean f345300s = false;

    /* renamed from: t */
    public C77398g f345301t = null;

    /* renamed from: u */
    public boolean f345302u;

    /* renamed from: v */
    public boolean f345303v;

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$a */
    public class C115227a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$a$a */
        public class C115228a implements DialogInterface.OnClickListener {
            public C115228a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                WalletSelectAddrUI walletSelectAddrUI = WalletSelectAddrUI.this;
                int i2 = WalletSelectAddrUI.f345287w;
                walletSelectAddrUI.getClass();
                String nullAsNil = Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(46, (Object) null));
                String nullAsNil2 = Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(72, (Object) null));
                if (!Util.isNullOrNil(nullAsNil) || !Util.isNullOrNil(nullAsNil2)) {
                    walletSelectAddrUI.f345292h.mo164546b(new C66802f(nullAsNil, nullAsNil2, walletSelectAddrUI.f345296o), true);
                    return;
                }
                NeedVerifyQQEvent needVerifyQQEvent = new NeedVerifyQQEvent();
                NeedVerifyQQEvent.C80730a aVar = needVerifyQQEvent.f236243d;
                aVar.f236245a = walletSelectAddrUI;
                aVar.f236246b = new C113343p(walletSelectAddrUI, needVerifyQQEvent);
                needVerifyQQEvent.asyncPublish(Looper.myLooper());
            }
        }

        public C115227a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletSelectAddrUI walletSelectAddrUI = WalletSelectAddrUI.this;
            C76879j.m92717K(walletSelectAddrUI, true, walletSelectAddrUI.getString(C0966R.string.f7498hy, new Object[]{walletSelectAddrUI.f345296o.toString()}), "", WalletSelectAddrUI.this.getString(C0966R.string.f7499hz), WalletSelectAddrUI.this.getString(C0966R.string.f7926wf), new C115228a(), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$b */
    public class C115229b implements AdapterView.OnItemClickListener {
        public C115229b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            C113174b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Log.m105918d("MicroMsg.WalletSelectAddrUI", "select pos " + i);
            synchronized (WalletSelectAddrUI.this.f345295n) {
                if (i < ((LinkedList) WalletSelectAddrUI.this.f345288d).size()) {
                    WalletSelectAddrUI walletSelectAddrUI = WalletSelectAddrUI.this;
                    walletSelectAddrUI.f345289e = (C113174b) ((LinkedList) walletSelectAddrUI.f345288d).get(i);
                    WalletSelectAddrUI walletSelectAddrUI2 = WalletSelectAddrUI.this;
                    if (walletSelectAddrUI2.f345300s) {
                        Intent intent = new Intent();
                        C113174b bVar2 = WalletSelectAddrUI.this.f345289e;
                        if (bVar2 != null) {
                            try {
                                intent.putExtra("launch_from_select_addr", bVar2.toByteArray());
                            } catch (IOException e) {
                                Log.m105920e("MicroMsg.WalletSelectAddrUI", "isLaunchFromSelectAddr error:" + e.getMessage());
                            }
                        }
                        WalletSelectAddrUI.this.setResult(-1, intent);
                        WalletSelectAddrUI.this.finish();
                    } else if (walletSelectAddrUI2.f345297p || walletSelectAddrUI2.f345299r || (bVar = walletSelectAddrUI2.f345289e) == null) {
                        C113174b bVar3 = walletSelectAddrUI2.f345289e;
                        if (!(bVar3 == null || (i2 = bVar3.f338614d) == 0)) {
                            WalletSelectAddrUI.this.f345292h.mo164546b(new C66805i(i2), true);
                        }
                    } else {
                        walletSelectAddrUI2.mo174981H7(bVar.f338614d);
                    }
                }
            }
            WalletSelectAddrUI.this.f345290f.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$c */
    public class C115230c implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$c$a */
        public class C115231a implements C76879j.C11180n {

            /* renamed from: a */
            public final /* synthetic */ int f345308a;

            public C115231a(int i) {
                this.f345308a = i;
            }

            /* renamed from: j */
            public void mo782j(int i) {
                C113174b bVar;
                synchronized (WalletSelectAddrUI.this.f345295n) {
                    if (this.f345308a < ((LinkedList) WalletSelectAddrUI.this.f345288d).size()) {
                        bVar = (C113174b) ((LinkedList) WalletSelectAddrUI.this.f345288d).get(this.f345308a);
                    } else {
                        bVar = null;
                    }
                }
                if (bVar != null) {
                    if (i == 0) {
                        WalletSelectAddrUI.this.mo174981H7(bVar.f338614d);
                    } else if (i == 1) {
                        C66804h hVar = new C66804h(bVar.f338614d);
                        WalletSelectAddrUI walletSelectAddrUI = WalletSelectAddrUI.this;
                        walletSelectAddrUI.f345289e = null;
                        walletSelectAddrUI.f345292h.mo164546b(hVar, true);
                    } else if (i == 2) {
                        WalletSelectAddrUI walletSelectAddrUI2 = WalletSelectAddrUI.this;
                        walletSelectAddrUI2.getClass();
                        StringBuilder sb = new StringBuilder();
                        if (!TextUtils.isEmpty(bVar.f338621n)) {
                            sb.append(walletSelectAddrUI2.getString(C0966R.string.f7478hb));
                            sb.append("：");
                            sb.append(bVar.f338621n);
                            sb.append(" \n");
                        }
                        if (!TextUtils.isEmpty(bVar.f338622o)) {
                            sb.append(walletSelectAddrUI2.getString(C0966R.string.f7483hg));
                            sb.append("：");
                            sb.append(bVar.f338622o);
                            sb.append(" \n");
                        }
                        sb.append(walletSelectAddrUI2.getString(C0966R.string.f7453go));
                        sb.append("：");
                        if (!TextUtils.isEmpty(bVar.f338616f)) {
                            sb.append(bVar.f338616f);
                        }
                        if (!TextUtils.isEmpty(bVar.f338617g)) {
                            sb.append(bVar.f338617g);
                        }
                        if (!TextUtils.isEmpty(bVar.f338618h)) {
                            sb.append(bVar.f338618h);
                        }
                        if (!TextUtils.isEmpty(bVar.f338624q)) {
                            sb.append(bVar.f338624q);
                        }
                        if (!TextUtils.isEmpty(bVar.f338620j)) {
                            sb.append(bVar.f338620j);
                        }
                        if (!TextUtils.isEmpty(bVar.f338619i)) {
                            sb.append(" \n");
                            sb.append(walletSelectAddrUI2.getString(C0966R.string.f7484hi));
                            sb.append("：");
                            sb.append(bVar.f338619i);
                        }
                        try {
                            ClipboardHelper.setText(walletSelectAddrUI2.getContext(), sb.toString());
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.WalletSelectAddrUI", e, "", new Object[0]);
                        }
                    }
                }
            }
        }

        public C115230c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C76879j.m92736g(WalletSelectAddrUI.this.getContext(), (String) null, WalletSelectAddrUI.this.getResources().getStringArray(C0966R.array.f2609at), (String) null, new C115231a(i));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$d */
    public class C115232d implements View.OnClickListener {
        public C115232d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletSelectAddrUI walletSelectAddrUI = WalletSelectAddrUI.this;
            int i = WalletSelectAddrUI.f345287w;
            walletSelectAddrUI.mo174981H7(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$e */
    public class C115233e implements MenuItem.OnMenuItemClickListener {
        public C115233e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletSelectAddrUI.this.setResult(0);
            WalletSelectAddrUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$f */
    public class C115234f implements MenuItem.OnMenuItemClickListener {
        public C115234f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletSelectAddrUI walletSelectAddrUI = WalletSelectAddrUI.this;
            int i = WalletSelectAddrUI.f345287w;
            walletSelectAddrUI.mo174981H7(0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$g */
    public class C115235g extends BaseAdapter {

        /* renamed from: d */
        public final Context f345313d;

        /* renamed from: e */
        public List<C113174b> f345314e = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$g$a */
        public class C115236a {

            /* renamed from: a */
            public ImageView f345316a;

            /* renamed from: b */
            public TextView f345317b;

            /* renamed from: c */
            public TextView f345318c;

            public C115236a(C115235g gVar) {
            }
        }

        public C115235g(Context context) {
            this.f345313d = context;
        }

        public int getCount() {
            return this.f345314e.size();
        }

        public Object getItem(int i) {
            return this.f345314e.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C115236a aVar = new C115236a(this);
            if (view == null) {
                view = View.inflate(this.f345313d, C0966R.C0971layout.cdc, (ViewGroup) null);
                aVar.f345316a = (ImageView) view.findViewById(C0966R.C0970id.f357694ba2);
                aVar.f345318c = (TextView) view.findViewById(C0966R.C0970id.f5612jt);
                aVar.f345317b = (TextView) view.findViewById(C0966R.C0970id.f5626k7);
                if (WalletSelectAddrUI.this.f345303v) {
                    view.setBackgroundResource(C0966R.C0969drawable.f4858pd);
                    aVar.f345317b.setTextColor(WalletSelectAddrUI.this.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                    aVar.f345318c.setTextColor(WalletSelectAddrUI.this.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
                }
                view.setTag(aVar);
            } else {
                aVar = (C115236a) view.getTag();
            }
            C113174b bVar = this.f345314e.get(i);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(bVar.f338616f)) {
                sb.append(bVar.f338616f);
            }
            if (!TextUtils.isEmpty(bVar.f338617g)) {
                sb.append(" ");
                sb.append(bVar.f338617g);
            }
            if (!TextUtils.isEmpty(bVar.f338618h)) {
                sb.append(" ");
                sb.append(bVar.f338618h);
            }
            if (!TextUtils.isEmpty(bVar.f338624q)) {
                sb.append(" ");
                sb.append(bVar.f338624q);
            }
            if (!TextUtils.isEmpty(bVar.f338620j)) {
                sb.append(" ");
                sb.append(bVar.f338620j);
            }
            aVar.f345318c.setText(sb.toString());
            TextView textView = aVar.f345317b;
            textView.setText(bVar.f338621n + "，" + bVar.f338622o);
            WalletSelectAddrUI walletSelectAddrUI = WalletSelectAddrUI.this;
            if (!walletSelectAddrUI.f345297p) {
                aVar.f345316a.setImageBitmap((Bitmap) null);
            } else {
                C113174b bVar2 = walletSelectAddrUI.f345289e;
                if (bVar2 == null || bVar2.f338614d != bVar.f338614d) {
                    aVar.f345316a.setImageBitmap((Bitmap) null);
                } else {
                    aVar.f345316a.setImageResource(C0966R.raw.radio_on);
                }
            }
            return view;
        }
    }

    /* renamed from: H7 */
    public final void mo174981H7(int i) {
        Intent intent = new Intent();
        intent.setClass(this, WalletAddAddressUI.class);
        intent.putExtra("address_id", i);
        intent.putExtra("force_light_mode", this.f345303v);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "editAddressUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "editAddressUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: I7 */
    public final void mo174982I7() {
        synchronized (this.f345295n) {
            C78803b.vx0();
            LinkedList<C113174b> linkedList = C78803b.xx0().f356680a.f152728d;
            this.f345288d = linkedList;
            this.f345290f.f345314e = linkedList;
            linkedList.size();
            View view = this.f345293i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f345290f.notifyDataSetChanged();
        }
    }

    public boolean convertActivityFromTranslucent() {
        return !this.f345302u;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdd;
    }

    public void initView() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.f6e);
        this.f345294j = textView;
        textView.setVisibility(8);
        this.f345294j.setOnClickListener(new C115227a());
        this.f345291g = (ListView) findViewById(C0966R.C0970id.jeo);
        this.f345290f = new C115235g(this);
        View findViewById = findViewById(C0966R.C0970id.f5579ix);
        this.f345293i = findViewById;
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.f5612jt);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById2;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) this.f345293i.findViewById(C0966R.C0970id.f5626k7)).setText(C0966R.string.f7414fm);
        this.f345291g.setAdapter(this.f345290f);
        this.f345291g.setOnItemClickListener(new C115229b());
        this.f345291g.setOnItemLongClickListener(new C115230c());
        mo174982I7();
        this.f345293i.setOnClickListener(new C115232d());
        this.f345290f.notifyDataSetChanged();
        setBackBtn(new C115233e());
        addIconOptionMenu(0, (int) C0966R.string.f7416fo, (int) C0966R.raw.actionbar_icon_dark_add, (MenuItem.OnMenuItemClickListener) new C115234f());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C113174b bVar;
        if (i == 1) {
            if (-1 == i2) {
                if (intent == null) {
                    Log.m105920e("MicroMsg.AddrUtil", "intent == null");
                    bVar = null;
                } else {
                    bVar = new C113174b();
                    bVar.f338623p = intent.getStringExtra("nationalCode");
                    bVar.f338621n = intent.getStringExtra("userName");
                    bVar.f338622o = intent.getStringExtra("telNumber");
                    bVar.f338619i = intent.getStringExtra("addressPostalCode");
                    bVar.f338616f = intent.getStringExtra("proviceFirstStageName");
                    bVar.f338617g = intent.getStringExtra("addressCitySecondStageName");
                    bVar.f338618h = intent.getStringExtra("addressCountiesThirdStageName");
                    bVar.f338624q = intent.getStringExtra("addressCountiesFourStageName");
                    bVar.f338620j = intent.getStringExtra("addressDetailInfo");
                }
                setResult(-1, C7328a.m7472a(bVar));
            } else {
                setResult(0);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f345298q = intent.getBooleanExtra("launch_from_appbrand", false);
        this.f345299r = intent.getBooleanExtra("launch_from_remittance", false);
        this.f345300s = intent.getBooleanExtra("launch_from_select_addr", false);
        boolean booleanExtra = intent.getBooleanExtra("launch_from_webview", false);
        if (booleanExtra || this.f345298q) {
            this.f345297p = true;
            View findViewById = getContentView().findViewById(C0966R.C0970id.f5609jq);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f345298q && !this.f345302u) {
                getWindow().setBackgroundDrawableResource(C0966R.color.f356961a70);
            }
            if (booleanExtra) {
                Log.m105924i("MicroMsg.WalletSelectAddrUI", "showDisclaimerDailog()");
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_DISCLAIMER_DIALOG_BOOLEAN_SYNC;
                if (((Boolean) u.mo119685f(aVar2, Boolean.TRUE)).booleanValue()) {
                    Log.m105924i("MicroMsg.WalletSelectAddrUI", "isShowDisclaimerDialog");
                    C76879j.m92754y(this, getString(C0966R.string.f7490ho), getString(C0966R.string.f7491hp), getString(C0966R.string.f7263q), new C113342o(this));
                    C97625j3.m125812b().mo105906u().mo119677K(aVar2, Boolean.FALSE);
                }
            }
        }
        this.f345292h = new C112787b(this, this);
        setMMTitle((int) C0966R.string.f7489hn);
        this.f345292h.mo164545a(417);
        this.f345292h.mo164545a(v2helper.EMethodEhanceHeadsetEC);
        this.f345292h.mo164545a(419);
        this.f345292h.mo164545a(C86982t0.CTRL_INDEX);
        this.f345292h.mo164546b(new C66803g(0, intent.getStringExtra("req_url"), intent.getStringExtra("req_app_id"), 2), false);
        this.f345296o = new C77710q(Util.nullAs((Integer) C97625j3.m125812b().mo105906u().mo119684e(9, (Object) null), 0));
        C119113p xx02 = C78803b.xx0();
        xx02.getClass();
        try {
            String str = (String) ((C79442f) C86312j.m106911c(C79442f.class)).Ev0(C72994y1.C72995a.USERINFO_WALLET_ADDRESS_INFO_STRING_SYNC);
            if (!Util.isNullOrNil(str)) {
                C54460a aVar3 = (C54460a) new C54460a().parseFrom(str.getBytes(C119027c.f356489b));
                xx02.f356680a = aVar3;
                xx02.mo183776a(aVar3);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletAddrMgr", e, "", new Object[0]);
        }
        initView();
        boolean booleanExtra2 = intent.getBooleanExtra("force_light_mode", false);
        this.f345303v = booleanExtra2;
        if (booleanExtra2) {
            getContentView().findViewById(C0966R.C0970id.br8).setBackgroundColor(getContext().getResources().getColor(C0966R.color.BW_BG_100));
            getContentView().findViewById(C0966R.C0970id.f5609jq).setBackgroundColor(getContext().getResources().getColor(C0966R.color.BW_BG_100));
            setActionbarColor(getContext().getResources().getColor(C0966R.color.UN_BW_93));
            setNavigationbarColor(getContext().getResources().getColor(C0966R.color.UN_BW_93));
        }
        if (C97625j3.m125812b().mo105883I()) {
            C97625j3.m125815e().mo123460f(new C52522u(12));
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("content_view_height", -1);
        boolean z = intExtra != -1;
        this.f345302u = z;
        if (z) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.height = intExtra;
            attributes.width = -1;
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setFinishOnTouchOutside(intent.getBooleanExtra("click_empty_close", false));
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            C88990b.m111194c(this, (C88990b.C61771c) null);
        }
        Log.m105924i("MicroMsg.WalletSelectAddrUI", "forceTransparent = " + this.f345302u);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f345292h.mo164547c(417);
        this.f345292h.mo164547c(v2helper.EMethodEhanceHeadsetEC);
        this.f345292h.mo164547c(419);
        this.f345292h.mo164547c(C86982t0.CTRL_INDEX);
    }

    public void onResume() {
        super.onResume();
        mo174982I7();
    }
}
