package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import com.tenpay.android.wechat.TenpaySecureEditText;
import g63.C45895k;
import hr3.C76241b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nc0.C76850a;
import nj3.C76879j;
import tb3.C77881d;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView */
public class WalletPhoneInputView extends LinearLayout {

    /* renamed from: d */
    public WalletFormView f210727d;

    /* renamed from: e */
    public WalletFormView f210728e;

    /* renamed from: f */
    public TenpaySecureEditText f210729f;

    /* renamed from: g */
    public TextView f210730g;

    /* renamed from: h */
    public int f210731h = 0;

    /* renamed from: i */
    public Map<String, C76850a.C76851a> f210732i;

    /* renamed from: j */
    public String f210733j = "";

    /* renamed from: n */
    public String f210734n = "";

    /* renamed from: o */
    public boolean f210735o = true;

    /* renamed from: p */
    public String f210736p;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView$a */
    public class C43412a implements View.OnClickListener {
        public C43412a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.WalletPhoneInputView", "click area");
            Intent intent = new Intent();
            intent.setClassName(WalletPhoneInputView.this.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
            ((MMActivity) WalletPhoneInputView.this.getContext()).startActivityForResult(intent, (int) ShareElfFile.SectionHeader.SHN_ABS);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView$b */
    public class C43413b implements View.OnClickListener {
        public C43413b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletPhoneInputView walletPhoneInputView = WalletPhoneInputView.this;
            String str = walletPhoneInputView.f210736p;
            String string = walletPhoneInputView.getContext().getString(C0966R.string.kpr);
            if (Util.isNullOrNil(str)) {
                str = walletPhoneInputView.getContext().getString(C0966R.string.kps);
            }
            C76879j.m92754y(walletPhoneInputView.getContext(), str, string, walletPhoneInputView.getContext().getString(C0966R.string.ktq), new C45895k(walletPhoneInputView));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView$c */
    public class C72445c implements C76241b {
        public C72445c() {
        }

        /* renamed from: a */
        public boolean mo99317a(WalletFormView walletFormView, String str) {
            return false;
        }

        /* renamed from: b */
        public boolean mo99318b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo99319c(WalletFormView walletFormView, String str) {
            return false;
        }

        /* renamed from: d */
        public boolean mo99320d(WalletFormView walletFormView) {
            WalletPhoneInputView walletPhoneInputView = WalletPhoneInputView.this;
            if (!(walletPhoneInputView.f210731h == 0)) {
                return !Util.isNullOrNil(walletPhoneInputView.f210734n) && !Util.isNullOrNil(WalletPhoneInputView.this.f210733j) && !Util.isNullOrNil(WalletPhoneInputView.this.f210728e.getText());
            }
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText == null) {
                return false;
            }
            return tenpaySecureEditText.isPhoneNum();
        }

        /* renamed from: e */
        public String mo99321e(WalletFormView walletFormView, String str) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView$d */
    public class C72446d implements TextWatcher {
        public C72446d() {
        }

        public void afterTextChanged(Editable editable) {
            if (Util.isNullOrNil(editable.toString())) {
                WalletPhoneInputView.this.f210727d.setText("");
                WalletPhoneInputView.this.f210727d.setContentTextColorRes(C0966R.color.a7f);
                WalletPhoneInputView walletPhoneInputView = WalletPhoneInputView.this;
                walletPhoneInputView.f210729f.setTextColor(walletPhoneInputView.getResources().getColor(C0966R.color.a7f));
                return;
            }
            WalletPhoneInputView walletPhoneInputView2 = WalletPhoneInputView.this;
            if (!walletPhoneInputView2.f210735o) {
                Log.m105924i("MicroMsg.WalletPhoneInputView", "manual pick don't search");
                WalletPhoneInputView.this.f210727d.setContentTextColorRes(C0966R.color.a7f);
                WalletPhoneInputView walletPhoneInputView3 = WalletPhoneInputView.this;
                walletPhoneInputView3.f210729f.setTextColor(walletPhoneInputView3.getResources().getColor(C0966R.color.a7f));
                WalletPhoneInputView.this.f210735o = true;
                return;
            }
            C76850a.C76851a aVar = (C76850a.C76851a) ((HashMap) walletPhoneInputView2.f210732i).get(editable.toString());
            Log.m105919d("MicroMsg.WalletPhoneInputView", "cCode: %s, s: %s", aVar, editable.toString());
            if (aVar != null) {
                WalletPhoneInputView walletPhoneInputView4 = WalletPhoneInputView.this;
                walletPhoneInputView4.f210734n = aVar.f224676b;
                String str = aVar.f224677c;
                walletPhoneInputView4.f210733j = str;
                walletPhoneInputView4.f210727d.setText(str);
                WalletPhoneInputView.this.f210727d.setContentTextColorRes(C0966R.color.a7f);
                WalletPhoneInputView walletPhoneInputView5 = WalletPhoneInputView.this;
                walletPhoneInputView5.f210729f.setTextColor(walletPhoneInputView5.getResources().getColor(C0966R.color.a7f));
            } else {
                WalletPhoneInputView walletPhoneInputView6 = WalletPhoneInputView.this;
                walletPhoneInputView6.f210734n = "";
                walletPhoneInputView6.f210733j = "";
                walletPhoneInputView6.f210727d.setText(walletPhoneInputView6.getContext().getString(C0966R.string.l5l));
            }
            WalletPhoneInputView.this.f210728e.getInputValidChangeListener().onInputValidChange(WalletPhoneInputView.this.f210728e.mo105094l());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView$e */
    public class C72447e implements View.OnFocusChangeListener {
        public C72447e() {
        }

        public void onFocusChange(View view, boolean z) {
            if (!z) {
                WalletPhoneInputView walletPhoneInputView = WalletPhoneInputView.this;
                if (((C76850a.C76851a) ((HashMap) walletPhoneInputView.f210732i).get(walletPhoneInputView.f210729f.getText().toString())) == null) {
                    WalletPhoneInputView.this.f210727d.setContentTextColorRes(C0966R.color.a_3);
                    WalletPhoneInputView walletPhoneInputView2 = WalletPhoneInputView.this;
                    walletPhoneInputView2.f210729f.setTextColor(walletPhoneInputView2.getResources().getColor(C0966R.color.a_3));
                    return;
                }
                WalletPhoneInputView.this.f210727d.setContentTextColorRes(C0966R.color.a7f);
                WalletPhoneInputView walletPhoneInputView3 = WalletPhoneInputView.this;
                walletPhoneInputView3.f210729f.setTextColor(walletPhoneInputView3.getResources().getColor(C0966R.color.a7f));
            }
        }
    }

    public WalletPhoneInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo99813a(context);
        mo99814b(context, attributeSet, -1);
    }

    /* renamed from: a */
    public final void mo99813a(Context context) {
        View.inflate(context, C0966R.C0971layout.f360063cg2, this);
        this.f210727d = (WalletFormView) findViewById(C0966R.C0970id.hur);
        this.f210728e = (WalletFormView) findViewById(C0966R.C0970id.hv6);
        this.f210730g = (TextView) findViewById(C0966R.C0970id.hy_);
        this.f210727d.setOnClickListener(new C43412a());
        this.f210729f = (TenpaySecureEditText) this.f210728e.findViewById(C0966R.C0970id.i1k);
        if (getContext() instanceof MMActivity) {
            this.f210728e.setOnInfoIvClickListener(new C43413b());
            this.f210728e.setLogicDelegate(new C72445c());
        }
        List<C76850a.C76851a> b = C76850a.m92630b(getContext(), getContext().getString(C0966R.string.bvs));
        this.f210732i = new HashMap();
        Iterator it = ((ArrayList) b).iterator();
        while (it.hasNext()) {
            C76850a.C76851a aVar = (C76850a.C76851a) it.next();
            this.f210732i.put(aVar.f224676b, aVar);
        }
    }

    /* renamed from: b */
    public final void mo99814b(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226915i, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f210728e.setHint(context.getString(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.f210728e.setTitleText(context.getString(resourceId2));
        }
    }

    /* renamed from: c */
    public void mo99815c() {
        this.f210731h = 1;
        C76850a.C76851a aVar = (C76850a.C76851a) ((HashMap) this.f210732i).get("86");
        this.f210734n = aVar.f224676b;
        String str = aVar.f224677c;
        this.f210733j = str;
        this.f210727d.setText(str);
        this.f210729f.setText(this.f210734n);
        this.f210727d.setVisibility(0);
        this.f210729f.setVisibility(0);
        this.f210730g.setVisibility(0);
        this.f210729f.addTextChangedListener(new C72446d());
        this.f210729f.setOnFocusChangeListener(new C72447e());
    }

    /* renamed from: d */
    public boolean mo99816d(int i, int i2, Intent intent) {
        if (i != 65521) {
            return false;
        }
        if (i2 == 100) {
            String stringExtra = intent.getStringExtra("country_name");
            String stringExtra2 = intent.getStringExtra("couttry_code");
            Log.m105925i("MicroMsg.WalletPhoneInputView", "countryName: %s, countryCode: %s", this.f210733j, this.f210734n);
            if (Util.isNullOrNil(stringExtra) || Util.isNullOrNil(stringExtra2)) {
                Log.m105924i("MicroMsg.WalletPhoneInputView", "cancel pick");
            } else {
                this.f210733j = stringExtra;
                this.f210734n = stringExtra2;
                this.f210735o = false;
                this.f210727d.setText(stringExtra);
                this.f210729f.setText(this.f210734n);
                this.f210729f.clearFocus();
            }
        }
        return true;
    }

    public String getCountryCode() {
        return this.f210731h == 0 ? "86" : this.f210729f.getText().toString();
    }

    public WalletFormView getPhoneNumberEt() {
        return this.f210728e;
    }

    public WalletPhoneInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo99813a(context);
        mo99814b(context, attributeSet, i);
    }
}
