package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import ch0.C67370h;
import ch0.C67371i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import i12.C76255b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import nj3.C76901s0;
import p200lx.C76736w;
import xg0.C78803b;
import yg0.C79110a;

/* renamed from: com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI */
public class QrcodeInvoiceUI extends MMActivity {

    /* renamed from: x */
    public static final /* synthetic */ int f196902x = 0;

    /* renamed from: d */
    public int f196903d = 0;

    /* renamed from: e */
    public TextView f196904e;

    /* renamed from: f */
    public InvoiceQrcodeTextView f196905f;

    /* renamed from: g */
    public InvoiceQrcodeTextView f196906g;

    /* renamed from: h */
    public InvoiceQrcodeTextView f196907h;

    /* renamed from: i */
    public InvoiceQrcodeTextView f196908i;

    /* renamed from: j */
    public InvoiceQrcodeTextView f196909j;

    /* renamed from: n */
    public InvoiceQrcodeTextView f196910n;

    /* renamed from: o */
    public InvoiceQrcodeTextView f196911o;

    /* renamed from: p */
    public C76255b f196912p = null;

    /* renamed from: q */
    public Bitmap f196913q;

    /* renamed from: r */
    public C76901s0 f196914r = null;

    /* renamed from: s */
    public ImageView f196915s;

    /* renamed from: t */
    public View f196916t;

    /* renamed from: u */
    public float f196917u = 0.0f;

    /* renamed from: v */
    public View.OnClickListener f196918v = new C68539c();

    /* renamed from: w */
    public View.OnClickListener f196919w = new C68540d();

    /* renamed from: com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI$a */
    public class C68537a implements MenuItem.OnMenuItemClickListener {
        public C68537a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            QrcodeInvoiceUI.this.setResult(0);
            QrcodeInvoiceUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI$b */
    public class C68538b implements MenuItem.OnMenuItemClickListener {
        public C68538b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.setClass(QrcodeInvoiceUI.this, AddInvoiceUI.class);
            intent.putExtra("invoice_id", QrcodeInvoiceUI.this.f196903d);
            QrcodeInvoiceUI qrcodeInvoiceUI = QrcodeInvoiceUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            QrcodeInvoiceUI qrcodeInvoiceUI2 = qrcodeInvoiceUI;
            C117292a.m165358d(qrcodeInvoiceUI2, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            qrcodeInvoiceUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(qrcodeInvoiceUI2, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI$c */
    public class C68539c implements View.OnClickListener {
        public C68539c() {
        }

        public void onClick(View view) {
            C76901s0 s0Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.f9u && (s0Var = QrcodeInvoiceUI.this.f196914r) != null && s0Var.isShowing()) {
                QrcodeInvoiceUI.this.f196914r.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI$d */
    public class C68540d implements View.OnClickListener {
        public C68540d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.f9w) {
                QrcodeInvoiceUI qrcodeInvoiceUI = QrcodeInvoiceUI.this;
                if (qrcodeInvoiceUI.f196914r != null) {
                    qrcodeInvoiceUI.showPopupWindow(view);
                    QrcodeInvoiceUI qrcodeInvoiceUI2 = QrcodeInvoiceUI.this;
                    WindowManager.LayoutParams attributes = qrcodeInvoiceUI2.getWindow().getAttributes();
                    float f = attributes.screenBrightness;
                    if (f < 0.85f) {
                        qrcodeInvoiceUI2.f196917u = f;
                        attributes.screenBrightness = 0.85f;
                        qrcodeInvoiceUI2.getWindow().setAttributes(attributes);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bff;
    }

    public void initView() {
        String str;
        C76255b bVar;
        String str2;
        String str3;
        ScrollView scrollView = (ScrollView) findViewById(C0966R.C0970id.i_u);
        InvoiceQrcodeTextView invoiceQrcodeTextView = (InvoiceQrcodeTextView) findViewById(C0966R.C0970id.i_w);
        this.f196905f = invoiceQrcodeTextView;
        if (invoiceQrcodeTextView != null) {
            invoiceQrcodeTextView.mo94135b();
        }
        InvoiceQrcodeTextView invoiceQrcodeTextView2 = (InvoiceQrcodeTextView) findViewById(C0966R.C0970id.i_s);
        this.f196906g = invoiceQrcodeTextView2;
        if (invoiceQrcodeTextView2 != null) {
            invoiceQrcodeTextView2.mo94135b();
        }
        InvoiceQrcodeTextView invoiceQrcodeTextView3 = (InvoiceQrcodeTextView) findViewById(C0966R.C0970id.i_v);
        this.f196907h = invoiceQrcodeTextView3;
        if (invoiceQrcodeTextView3 != null) {
            invoiceQrcodeTextView3.mo94135b();
        }
        InvoiceQrcodeTextView invoiceQrcodeTextView4 = (InvoiceQrcodeTextView) findViewById(C0966R.C0970id.i_r);
        this.f196908i = invoiceQrcodeTextView4;
        if (invoiceQrcodeTextView4 != null) {
            invoiceQrcodeTextView4.mo94135b();
        }
        InvoiceQrcodeTextView invoiceQrcodeTextView5 = (InvoiceQrcodeTextView) findViewById(C0966R.C0970id.i_t);
        this.f196909j = invoiceQrcodeTextView5;
        if (invoiceQrcodeTextView5 != null) {
            invoiceQrcodeTextView5.mo94135b();
        }
        InvoiceQrcodeTextView invoiceQrcodeTextView6 = (InvoiceQrcodeTextView) findViewById(C0966R.C0970id.i_p);
        this.f196910n = invoiceQrcodeTextView6;
        if (invoiceQrcodeTextView6 != null) {
            invoiceQrcodeTextView6.mo94135b();
        }
        InvoiceQrcodeTextView invoiceQrcodeTextView7 = (InvoiceQrcodeTextView) findViewById(C0966R.C0970id.i_q);
        this.f196911o = invoiceQrcodeTextView7;
        if (invoiceQrcodeTextView7 != null) {
            invoiceQrcodeTextView7.mo94135b();
        }
        this.f196907h.getClass();
        this.f196907h.f196894q = true;
        if (this.f196903d != 0) {
            this.f196904e = (TextView) findViewById(C0966R.C0970id.i_z);
            C79110a wx02 = C78803b.wx0();
            int i = this.f196903d;
            Iterator<C76255b> it = wx02.f232271a.f223377d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.f223378d == i) {
                    break;
                }
            }
            this.f196912p = bVar;
            if (bVar == null) {
                Log.m105924i("MicroMsg.QrcodeInvoiceUI", "invoiceSvrObj is null ,now finish..");
                finish();
            }
            C76255b bVar2 = this.f196912p;
            if (bVar2 == null || (str3 = bVar2.f223379e) == null || !str3.equals("0")) {
                C76255b bVar3 = this.f196912p;
                if (!(bVar3 == null || (str2 = bVar3.f223379e) == null || !str2.equals("1"))) {
                    this.f196904e.setText(getString(C0966R.string.fsz));
                    this.f196905f.setVisibility(8);
                    this.f196907h.setVisibility(8);
                    this.f196908i.setVisibility(8);
                    this.f196909j.setVisibility(8);
                    this.f196910n.setVisibility(8);
                    this.f196911o.setVisibility(8);
                }
            } else {
                this.f196904e.setText(getString(C0966R.string.fst));
                this.f196906g.setVisibility(8);
                String str4 = this.f196912p.f223382h;
                if (str4 == null || str4.equals("")) {
                    this.f196907h.setVisibility(8);
                } else {
                    this.f196907h.setVisibility(0);
                    this.f196907h.setValStr(this.f196912p.f223382h);
                }
                String str5 = this.f196912p.f223389r;
                if (str5 == null || str5.equals("")) {
                    this.f196908i.setVisibility(8);
                } else {
                    this.f196908i.setVisibility(0);
                    this.f196908i.setValStr(this.f196912p.f223389r);
                }
                String str6 = this.f196912p.f223386o;
                if (str6 == null || str6.equals("")) {
                    this.f196909j.setVisibility(8);
                } else {
                    this.f196909j.setVisibility(0);
                    this.f196909j.setValStr(this.f196912p.f223386o);
                }
                String str7 = this.f196912p.f223384j;
                if (str7 == null || str7.equals("")) {
                    this.f196910n.setVisibility(8);
                } else {
                    this.f196910n.setVisibility(0);
                    this.f196910n.setValStr(this.f196912p.f223384j);
                }
                String str8 = this.f196912p.f223383i;
                if (str8 == null || str8.equals("")) {
                    this.f196911o.setVisibility(8);
                } else {
                    this.f196911o.setVisibility(0);
                    this.f196911o.setValStr(this.f196912p.f223383i);
                }
            }
            this.f196904e.setVisibility(0);
            C76255b bVar4 = this.f196912p;
            if (bVar4 != null) {
                this.f196905f.setValStr(bVar4.f223380f);
                this.f196906g.setValStr(this.f196912p.f223381g);
            }
            if (this.f196914r == null) {
                View inflate = View.inflate(this, C0966R.C0971layout.f359833b20, (ViewGroup) null);
                inflate.setOnClickListener(new C67370h(this));
                this.f196916t = inflate.findViewById(C0966R.C0970id.f9v);
                this.f196915s = (ImageView) inflate.findViewById(C0966R.C0970id.f9u);
                C76901s0 s0Var = new C76901s0(inflate, -1, -1, true);
                this.f196914r = s0Var;
                s0Var.setClippingEnabled(false);
                this.f196914r.update();
                this.f196914r.setBackgroundDrawable(new ColorDrawable(16777215));
                this.f196914r.setOnDismissListener(new C67371i(this));
            }
        } else {
            Log.m105924i("MicroMsg.QrcodeInvoiceUI", "serverId is 0,now finish...");
            finish();
        }
        setBackBtn(new C68537a());
        addTextOptionMenu(0, getString(C0966R.string.f7956xe), new C68538b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        C76255b bVar5 = this.f196912p;
        if (bVar5 == null || (str = bVar5.f223390s) == null || str.equals("")) {
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f9w);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View findViewById = findViewById(C0966R.C0970id.f9x);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = (TextView) findViewById(C0966R.C0970id.i_m);
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.f9w);
        if (imageView2 != null) {
            imageView2.setVisibility(0);
            Bitmap qj = ((C76736w) C86312j.m106911c(C76736w.class)).mo106913qj(this, this.f196912p.f223390s, 12, 3);
            this.f196913q = qj;
            imageView2.setImageBitmap(qj);
            imageView2.setOnClickListener(this.f196919w);
        }
        View findViewById2 = findViewById(C0966R.C0970id.f9x);
        if (findViewById2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.i_m);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 3 && i2 != -1) {
                Log.m105924i("MicroMsg.QrcodeInvoiceUI", "MallRecharge pay result : cancel");
            }
        } else if (i2 == -1) {
            String stringExtra = intent.getStringExtra("karea_result");
            if (!Util.isNullOrNil(stringExtra)) {
                Log.m105918d("MicroMsg.QrcodeInvoiceUI", "AREA_RESULT:" + stringExtra);
                this.f196909j.setValStr(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("kpost_code");
            if (!Util.isNullOrNil(stringExtra2)) {
                Log.m105918d("MicroMsg.QrcodeInvoiceUI", "post:" + stringExtra2);
                this.f196909j.setValStr(stringExtra2);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.QrcodeInvoiceUI", "index Oncreate");
        this.f196903d = getIntent().getIntExtra("invoice_id", 0);
        setMMTitle((int) C0966R.string.ft4);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        setResult(0);
        finish();
        return true;
    }

    public void onResume() {
        getWindow().setSoftInputMode(3);
        super.onResume();
        initView();
    }

    public void showPopupWindow(View view) {
        C76901s0 s0Var = this.f196914r;
        if (s0Var != null && !s0Var.isShowing()) {
            this.f196914r.showAtLocation(view.getRootView(), 17, 0, 0);
            this.f196914r.setFocusable(true);
            this.f196914r.setTouchable(true);
            this.f196914r.setBackgroundDrawable(new ColorDrawable(16777215));
            this.f196914r.setOutsideTouchable(true);
            View view2 = this.f196916t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "showPopupWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI", "showPopupWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f196915s.setOnClickListener(this.f196918v);
            this.f196915s.setImageBitmap(this.f196913q);
            if (this.f196913q != null) {
                Log.m105920e("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp != null");
            } else {
                Log.m105924i("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp == null");
            }
            this.f196914r.update();
        }
    }
}
