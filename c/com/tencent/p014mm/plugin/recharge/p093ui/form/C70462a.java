package com.tencent.p014mm.plugin.recharge.p093ui.form;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recharge.p093ui.C70465j;
import com.tencent.p014mm.plugin.recharge.p093ui.C70467k;
import com.tencent.p014mm.plugin.recharge.p093ui.PhoneRechargeUI;
import com.tencent.p014mm.plugin.recharge.p093ui.form.MallFormView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import kg2.C76575b;

/* renamed from: com.tencent.mm.plugin.recharge.ui.form.a */
public class C70462a implements TextWatcher {

    /* renamed from: d */
    public boolean f203654d = false;

    /* renamed from: e */
    public final /* synthetic */ MallFormView f203655e;

    public C70462a(MallFormView mallFormView) {
        this.f203655e = mallFormView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f203655e.mo97095c() != this.f203654d) {
            MallFormView mallFormView = this.f203655e;
            MallFormView.C70461b bVar = mallFormView.f203638i;
            if (bVar != null) {
                C70467k kVar = (C70467k) bVar;
                if (mallFormView.mo97095c()) {
                    kVar.f203660a.hideVKB();
                    String a = C76575b.m92141a(kVar.f203660a.f203536g.getText());
                    if (a == null) {
                        Log.m105920e("MicroMsg.PhoneRechargeUI", "null phone, return");
                    } else {
                        ThreadPool.postAtFront(new C70465j(kVar, a), "search_matched_mobile");
                        PhoneRechargeUI phoneRechargeUI = kVar.f203660a;
                        if (!phoneRechargeUI.f203529L) {
                            Log.m105918d("MicroMsg.PhoneRechargeUI", "clear focus");
                            kVar.f203660a.f203529L = true;
                        } else {
                            phoneRechargeUI.f203529L = false;
                        }
                    }
                } else {
                    kVar.f203660a.f203536g.getTipsTv().setText("");
                    kVar.f203660a.f203536g.getTipsTv().setTextColor(kVar.f203660a.getResources().getColor(C0966R.color.a7f));
                    PhoneRechargeUI phoneRechargeUI2 = kVar.f203660a;
                    phoneRechargeUI2.f203551y = "";
                    phoneRechargeUI2.mo97037N7();
                    kVar.f203660a.mo97038O7(false, false);
                    if (Util.isNullOrNil(kVar.f203660a.f203536g.getText())) {
                        ((AutoCompleteTextView) kVar.f203660a.f203536g.getContentEditText()).showDropDown();
                    }
                }
            }
            this.f203654d = this.f203655e.mo97095c();
        }
        this.f203655e.mo97096d();
    }
}
