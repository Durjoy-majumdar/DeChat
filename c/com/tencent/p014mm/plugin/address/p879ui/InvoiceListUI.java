package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import ch0.C67364e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import dh0.C75409b;
import eb0.C97625j3;
import i12.C76255b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p1070zf.C91675a;
import xg0.C78803b;
import zg0.C53780c;
import zg0.C79328d;

/* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI */
public class InvoiceListUI extends MMActivity implements C11385n {

    /* renamed from: o */
    public static final /* synthetic */ int f196862o = 0;

    /* renamed from: d */
    public C76255b f196863d;

    /* renamed from: e */
    public C68529f f196864e;

    /* renamed from: f */
    public ListView f196865f;

    /* renamed from: g */
    public Object f196866g = new Object();

    /* renamed from: h */
    public TextView f196867h = null;

    /* renamed from: i */
    public LinkedList<C76255b> f196868i = new LinkedList<>();

    /* renamed from: j */
    public boolean f196869j = false;

    /* renamed from: n */
    public boolean f196870n = false;

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$a */
    public class C68523a implements View.OnClickListener {
        public C68523a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/InvoiceListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            InvoiceListUI invoiceListUI = InvoiceListUI.this;
            int i = InvoiceListUI.f196862o;
            invoiceListUI.getClass();
            C115669n.INSTANCE.mo160131h(14199, 2);
            invoiceListUI.mo94123H7(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$b */
    public class C68524b implements AdapterView.OnItemClickListener {
        public C68524b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C76255b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/InvoiceListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Log.m105918d("MicroMsg.InvoiceListUI", "select pos " + i);
            synchronized (InvoiceListUI.this.f196866g) {
                if (i < InvoiceListUI.this.f196868i.size()) {
                    InvoiceListUI invoiceListUI = InvoiceListUI.this;
                    invoiceListUI.f196863d = invoiceListUI.f196868i.get(i);
                    InvoiceListUI invoiceListUI2 = InvoiceListUI.this;
                    if (invoiceListUI2.f196869j || (bVar = invoiceListUI2.f196863d) == null) {
                        C76255b bVar2 = invoiceListUI2.f196863d;
                        if (!(bVar2 == null || bVar2.f223378d == 0)) {
                            Intent intent = new Intent();
                            intent.putExtra("choose_invoice_title_info", C75409b.m90442a(InvoiceListUI.this.f196863d));
                            InvoiceListUI.this.setResult(-1, intent);
                            InvoiceListUI.this.finish();
                        }
                    } else {
                        invoiceListUI2.mo94123H7(bVar.f223378d);
                    }
                }
            }
            InvoiceListUI.this.f196864e.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$c */
    public class C68525c implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$c$a */
        public class C68526a implements C76879j.C11180n {

            /* renamed from: a */
            public final /* synthetic */ int f196874a;

            public C68526a(int i) {
                this.f196874a = i;
            }

            /* renamed from: j */
            public void mo782j(int i) {
                C76255b bVar;
                synchronized (InvoiceListUI.this.f196866g) {
                    bVar = this.f196874a < InvoiceListUI.this.f196868i.size() ? InvoiceListUI.this.f196868i.get(this.f196874a) : null;
                }
                if (bVar != null) {
                    if (i == 0) {
                        InvoiceListUI.this.mo94123H7(bVar.f223378d);
                    } else if (i == 1) {
                        C53780c cVar = new C53780c(bVar.f223378d);
                        InvoiceListUI.this.f196863d = null;
                        C97625j3.m125815e().mo123460f(cVar);
                    } else if (i == 2) {
                        InvoiceListUI invoiceListUI = InvoiceListUI.this;
                        invoiceListUI.getClass();
                        StringBuilder sb = new StringBuilder();
                        String str = bVar.f223379e;
                        if (str == null || !str.equals("0")) {
                            String str2 = bVar.f223379e;
                            if (str2 != null && str2.equals("1") && !TextUtils.isEmpty(bVar.f223381g)) {
                                sb.append(invoiceListUI.getString(C0966R.string.fta));
                                sb.append("：");
                                sb.append(bVar.f223381g);
                                sb.append(" \n");
                            }
                        } else {
                            if (!TextUtils.isEmpty(bVar.f223380f)) {
                                sb.append(invoiceListUI.getString(C0966R.string.fta));
                                sb.append("：");
                                sb.append(bVar.f223380f);
                                sb.append(" \n");
                            }
                            if (!TextUtils.isEmpty(bVar.f223382h)) {
                                sb.append(invoiceListUI.getString(C0966R.string.ft6));
                                sb.append("：");
                                sb.append(bVar.f223382h);
                                sb.append(" \n");
                            }
                            if (!TextUtils.isEmpty(bVar.f223389r)) {
                                sb.append(invoiceListUI.getString(C0966R.string.fsq));
                                sb.append("：");
                                sb.append(bVar.f223389r);
                                sb.append(" \n");
                            }
                            if (!TextUtils.isEmpty(bVar.f223386o)) {
                                sb.append(invoiceListUI.getString(C0966R.string.f360904ft1));
                                sb.append("：");
                                sb.append(bVar.f223386o);
                                sb.append(" \n");
                            }
                            if (!TextUtils.isEmpty(bVar.f223384j)) {
                                sb.append(invoiceListUI.getString(C0966R.string.fsj));
                                sb.append("：");
                                sb.append(bVar.f223384j);
                                sb.append(" \n");
                            }
                            if (!TextUtils.isEmpty(bVar.f223383i)) {
                                sb.append(invoiceListUI.getString(C0966R.string.fsl));
                                sb.append("：");
                                sb.append(bVar.f223383i);
                                sb.append(" \n");
                            }
                        }
                        try {
                            ClipboardHelper.setText(invoiceListUI.getContext(), sb.toString());
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.InvoiceListUI", e, "", new Object[0]);
                        }
                    }
                }
            }
        }

        public C68525c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C76879j.m92736g(InvoiceListUI.this.getContext(), (String) null, InvoiceListUI.this.getResources().getStringArray(C0966R.array.f2580n), (String) null, new C68526a(i));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$d */
    public class C68527d implements MenuItem.OnMenuItemClickListener {
        public C68527d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            InvoiceListUI.this.setResult(0);
            InvoiceListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$e */
    public class C68528e implements MenuItem.OnMenuItemClickListener {
        public C68528e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            InvoiceListUI invoiceListUI = InvoiceListUI.this;
            int i = InvoiceListUI.f196862o;
            invoiceListUI.getClass();
            C115669n.INSTANCE.mo160131h(14199, 2);
            invoiceListUI.mo94123H7(0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$f */
    public class C68529f extends BaseAdapter {

        /* renamed from: d */
        public final Context f196878d;

        /* renamed from: e */
        public List<C76255b> f196879e = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI$f$a */
        public class C68530a {

            /* renamed from: a */
            public TextView f196881a;

            /* renamed from: b */
            public ImageView f196882b;

            /* renamed from: c */
            public TextView f196883c;

            public C68530a(C68529f fVar) {
            }
        }

        public C68529f(Context context) {
            this.f196878d = context;
        }

        public int getCount() {
            return this.f196879e.size();
        }

        public Object getItem(int i) {
            return this.f196879e.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C68530a aVar = new C68530a(this);
            if (view == null) {
                view = View.inflate(this.f196878d, C0966R.C0971layout.cdc, (ViewGroup) null);
                aVar.f196882b = (ImageView) view.findViewById(C0966R.C0970id.f357694ba2);
                aVar.f196881a = (TextView) view.findViewById(C0966R.C0970id.f5612jt);
                aVar.f196883c = (TextView) view.findViewById(C0966R.C0970id.f5626k7);
                view.setTag(aVar);
            } else {
                aVar = (C68530a) view.getTag();
            }
            C76255b bVar = this.f196879e.get(i);
            String str = bVar.f223379e;
            if (str == null || !str.equals("0")) {
                String str2 = bVar.f223379e;
                if (str2 != null && str2.equals("1")) {
                    aVar.f196881a.setText(C0966R.string.fsy);
                    aVar.f196883c.setText(bVar.f223381g);
                }
            } else {
                aVar.f196881a.setText(C0966R.string.fss);
                aVar.f196883c.setText(bVar.f223380f);
            }
            InvoiceListUI invoiceListUI = InvoiceListUI.this;
            if (!invoiceListUI.f196869j) {
                aVar.f196882b.setImageBitmap((Bitmap) null);
            } else {
                C76255b bVar2 = invoiceListUI.f196863d;
                if (bVar2 == null || bVar2.f223378d != bVar.f223378d) {
                    aVar.f196882b.setImageBitmap((Bitmap) null);
                } else {
                    aVar.f196882b.setImageResource(C0966R.raw.radio_on);
                }
            }
            return view;
        }
    }

    /* renamed from: H7 */
    public final void mo94123H7(int i) {
        Intent intent = new Intent();
        if (i != 0) {
            intent.setClass(this, QrcodeInvoiceUI.class);
            intent.putExtra("invoice_id", i);
        } else {
            intent.setClass(this, AddInvoiceUI.class);
            intent.putExtra("launch_from_invoicelist_webview", this.f196869j);
            intent.putExtra("invoice_id", i);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/InvoiceListUI", "editInvoiceUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI", "editInvoiceUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: I7 */
    public final void mo94124I7() {
        synchronized (this.f196866g) {
            C78803b.vx0();
            LinkedList<C76255b> linkedList = C78803b.wx0().f232271a.f223377d;
            this.f196868i = linkedList;
            this.f196864e.f196879e = linkedList;
            linkedList.size();
            this.f196864e.notifyDataSetChanged();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b1z;
    }

    public void initView() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.f6f);
        this.f196867h = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.f196869j) {
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.fef);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            TextView textView3 = (TextView) findViewById(C0966R.C0970id.fef);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        this.f196867h.setOnClickListener(new C68523a());
        this.f196865f = (ListView) findViewById(C0966R.C0970id.jer);
        C68529f fVar = new C68529f(this);
        this.f196864e = fVar;
        this.f196865f.setAdapter(fVar);
        this.f196865f.setOnItemClickListener(new C68524b());
        this.f196865f.setOnItemLongClickListener(new C68525c());
        this.f196864e.notifyDataSetChanged();
        setBackBtn(new C68527d());
        addIconOptionMenu(0, (int) C0966R.string.ipz, (int) C0966R.raw.actionbar_icon_dark_add, (MenuItem.OnMenuItemClickListener) new C68528e());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C76255b bVar;
        if (i == 1) {
            if (-1 == i2) {
                if (intent == null) {
                    Log.m105920e("MicroMsg.InvoiceUtil", "intent is null");
                    bVar = null;
                } else {
                    bVar = new C76255b();
                    String stringExtra = intent.getStringExtra("type");
                    bVar.f223379e = stringExtra;
                    if (stringExtra == null || !stringExtra.equals("1")) {
                        bVar.f223380f = intent.getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        bVar.f223382h = intent.getStringExtra("tax_number");
                        bVar.f223389r = intent.getStringExtra("company_address");
                        bVar.f223386o = intent.getStringExtra("telephone");
                        bVar.f223384j = intent.getStringExtra("bank_name");
                        bVar.f223383i = intent.getStringExtra("bank_account");
                    } else {
                        bVar.f223381g = intent.getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    }
                }
                Intent intent2 = new Intent();
                intent2.putExtra("choose_invoice_title_info", C75409b.m90442a(bVar));
                setResult(-1, intent2);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f196869j = intent.getBooleanExtra("launch_from_webview", false);
        boolean booleanExtra = intent.getBooleanExtra("launch_from_appbrand", false);
        if (this.f196869j || booleanExtra) {
            this.f196869j = true;
        }
        if (this.f196869j) {
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_INVOICE_HAS_SHOW_DISCLAIMER_DIALOG_BOOLEAN_SYNC;
            boolean booleanValue = ((Boolean) u.mo119685f(aVar, Boolean.TRUE)).booleanValue();
            Log.m105924i("MicroMsg.InvoiceListUI", "showDisclaimerDailog..isShowDisclaimerDialog " + booleanValue);
            if (booleanValue) {
                Log.m105924i("MicroMsg.InvoiceListUI", "showDisclaimerDialog");
                C76879j.m92711E(this, getString(C0966R.string.ft9), getString(C0966R.string.ft_), getString(C0966R.string.f7263q), false, new C67364e(this));
                C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
            }
        }
        setMMTitle((int) C0966R.string.f361309iv0);
        C97625j3.m125815e().mo123455a(C91675a.CTRL_INDEX, this);
        C97625j3.m125815e().mo123455a(C40475h.CTRL_INDEX, this);
        initView();
        mo94124I7();
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(C91675a.CTRL_INDEX, this);
        C97625j3.m125815e().mo123470p(C40475h.CTRL_INDEX, this);
        super.onDestroy();
    }

    public void onResume() {
        C97625j3.m125815e().mo123460f(new C79328d());
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            return;
        }
        if (yVar.getType() == 1191) {
            mo94124I7();
            if (this.f196869j) {
                C78803b.vx0();
                if (C78803b.wx0().f232271a.f223377d.size() == 0 && !this.f196870n) {
                    Intent intent = new Intent();
                    intent.setClass(this, AddInvoiceUI.class);
                    intent.putExtra("launch_from_webview", true);
                    startActivityForResult(intent, 1);
                }
            }
        } else if (yVar.getType() == 1194) {
            C97625j3.m125815e().mo123460f(new C79328d());
            this.f196870n = true;
        }
    }
}
