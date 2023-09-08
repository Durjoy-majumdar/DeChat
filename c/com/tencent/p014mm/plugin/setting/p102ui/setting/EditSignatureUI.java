package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import nj3.C76879j;
import p629ny.C76979h;
import p645pj.C77092c;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI */
public class EditSignatureUI extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f20721f = 0;

    /* renamed from: d */
    public MMEditText f20722d;

    /* renamed from: e */
    public TextView f20723e;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI$a */
    public class C5235a implements MenuItem.OnMenuItemClickListener {
        public C5235a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EditSignatureUI.this.hideVKB();
            EditSignatureUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI$b */
    public class C5236b implements MenuItem.OnMenuItemClickListener {
        public C5236b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String trim = EditSignatureUI.this.f20722d.getText().toString().trim();
            String e = C77092c.m93043e();
            if (!Util.isNullOrNil(e)) {
                if (trim.matches(".*[" + e + "].*")) {
                    C76879j.m92748s(EditSignatureUI.this.getContext(), EditSignatureUI.this.getString(C0966R.string.frk, new Object[]{e}), EditSignatureUI.this.getString(C0966R.string.a3h));
                    return false;
                }
            }
            C86709a0.m107535s().mo121142i().mo119676J(12291, trim);
            C5139t.m5183e(4, 6);
            EditSignatureUI.this.hideVKB();
            EditSignatureUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI$c */
    public class C5237c implements TextWatcher {

        /* renamed from: d */
        public int f20726d = 60;

        public C5237c(C5235a aVar) {
        }

        public void afterTextChanged(Editable editable) {
            int b = C45078p0.m49923b(60, editable.toString());
            this.f20726d = b;
            if (b < 0) {
                this.f20726d = 0;
            }
            TextView textView = EditSignatureUI.this.f20723e;
            if (textView != null) {
                textView.setText("" + (this.f20726d / 2));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditSignatureUI.this.enableOptionMenu(true);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a0c;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iys);
        this.f20722d = (MMEditText) findViewById(C0966R.C0970id.br8);
        this.f20723e = (TextView) findViewById(C0966R.C0970id.lr4);
        this.f20722d.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(12291, (Object) null)), this.f20722d.getTextSize()));
        MMEditText mMEditText = this.f20722d;
        mMEditText.setSelection(mMEditText.getText().length());
        TextView textView = this.f20723e;
        textView.setText("" + (C45078p0.m49923b(60, this.f20722d.getEditableText().toString()) / 2));
        C77382c b = C77382c.m93286b(this.f20722d);
        b.f225611e = 0;
        b.f225610d = 60;
        b.mo107499d((C77382c.C77383a) null);
        this.f20722d.addTextChangedListener(new C5237c((C5235a) null));
        setBackBtn(new C5235a());
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C5236b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
