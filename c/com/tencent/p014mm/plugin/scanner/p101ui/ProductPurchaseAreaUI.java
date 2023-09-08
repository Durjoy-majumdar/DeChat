package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.scanner.model.C115673w;
import com.tencent.p014mm.plugin.scanner.model.C94474a;
import com.tencent.p014mm.plugin.scanner.model.C94481y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import pj3.C47511g;
import vl2.C102216y;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI */
public class ProductPurchaseAreaUI extends MMPreference {

    /* renamed from: d */
    public C47511g f273209d;

    /* renamed from: e */
    public List<C94474a.C94475a> f273210e;

    /* renamed from: f */
    public int f273211f;

    /* renamed from: g */
    public String f273212g;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI$a */
    public class C94487a implements MenuItem.OnMenuItemClickListener {
        public C94487a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ProductPurchaseAreaUI.this.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo129956H7(Context context, String str, int i) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("jsapi_args_appid", C94481y.m119504a(i));
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("pay_channel", 3);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    public int getResourceId() {
        return C0966R.xml.f8928bl;
    }

    public void initView() {
        setBackBtn(new C94487a());
        this.f273209d = getPreferenceScreen();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C102216y.C102217a b = C94481y.m119505b(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
        if (b == null || b.f300996a == null) {
            Log.m105928w("MicroMsg.ProductPurchaseAreaUI", "Data product null");
            return;
        }
        this.f273212g = b.field_productid;
        this.f273211f = b.field_functionType;
        String stringExtra = getIntent().getStringExtra("referkey");
        Log.m105924i("MicroMsg.ProductPurchaseAreaUI", "referkey:" + stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            for (int i = 0; i < b.f300996a.size(); i++) {
                if (stringExtra.equals(b.f300996a.get(i).f273156d)) {
                    this.f273210e = b.f300996a.get(i).f273158f;
                    setMMTitle(b.f300996a.get(i).f273154b);
                    if (this.f273210e != null) {
                        for (int i2 = 0; i2 < this.f273210e.size(); i2++) {
                            C94474a.C94475a aVar = this.f273210e.get(i2);
                            String str = "" + i2;
                            if (aVar != null) {
                                C71013a aVar2 = new C71013a(this);
                                aVar2.mo26273A(str);
                                aVar2.mo69924H(aVar.f273160b);
                                aVar2.mo7741E(aVar.f273161c);
                                aVar2.f205511N = aVar.f273165g;
                                this.f273209d.mo72527k(aVar2);
                                if (i2 != this.f273210e.size() - 1) {
                                    this.f273209d.mo72527k(new C71019f(getContext()));
                                }
                            }
                        }
                        this.f273209d.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str;
        if (this.f273210e == null) {
            return false;
        }
        try {
            int intValue = Integer.valueOf(preference.f121285r).intValue();
            if (intValue >= 0) {
                if (intValue < ((LinkedList) this.f273210e).size()) {
                    C94474a.C94475a aVar = (C94474a.C94475a) ((LinkedList) this.f273210e).get(intValue);
                    if (aVar == null) {
                        return false;
                    }
                    int i = aVar.f273159a;
                    String str2 = null;
                    if (i == 1) {
                        str2 = aVar.f273162d;
                        if (!Util.isNullOrNil(str2)) {
                            mo129956H7(getContext(), aVar.f273162d, this.f273211f);
                        } else {
                            Log.m105928w("MicroMsg.ProductPurchaseAreaUI", "action link empty");
                        }
                    } else if (i != 9) {
                        Log.m105924i("MicroMsg.ProductPurchaseAreaUI", "Default go url:" + aVar.f273162d);
                        if (!Util.isNullOrNil(aVar.f273162d)) {
                            mo129956H7(getContext(), aVar.f273162d, this.f273211f);
                        }
                    } else {
                        String str3 = aVar.f273173o;
                        if (!Util.isNullOrNil(str3)) {
                            Intent intent = new Intent();
                            intent.putExtra("key_product_id", aVar.f273173o);
                            intent.putExtra("key_product_scene", 12);
                            C88144b.m109791i(this, "product", ".ui.MallProductUI", intent, (Bundle) null);
                        }
                        str = str3;
                        C86709a0.m107524d().mo123460f(new C115673w(this.f273212g, aVar.f273172n, aVar.f273159a, str, ((LinkedList) this.f273210e).size(), 11294, aVar.f273166h, (String) null));
                        return true;
                    }
                    str = str2;
                    C86709a0.m107524d().mo123460f(new C115673w(this.f273212g, aVar.f273172n, aVar.f273159a, str, ((LinkedList) this.f273210e).size(), 11294, aVar.f273166h, (String) null));
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ProductPurchaseAreaUI", "onPreferenceTreeClick, [%s]", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ProductPurchaseAreaUI", e, "", new Object[0]);
            return false;
        }
    }
}
