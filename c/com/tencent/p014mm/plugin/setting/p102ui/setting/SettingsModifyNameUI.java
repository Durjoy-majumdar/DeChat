package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75880o;
import g62.C8233m;
import lc3.C117474c;
import nj3.C76879j;
import p629ny.C76979h;
import p645pj.C77092c;
import qn3.C77382c;
import qo3.C89779i0;
import tc0.C48630l;
import tc0.C77885p;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI */
public class SettingsModifyNameUI extends MMSecDataActivity implements C77382c.C77383a {

    /* renamed from: i */
    public static final /* synthetic */ int f20868i = 0;

    /* renamed from: d */
    public MMEditText f20869d;

    /* renamed from: e */
    public C75880o f20870e;

    /* renamed from: f */
    public boolean f20871f = false;

    /* renamed from: g */
    public C89779i0 f20872g = null;

    /* renamed from: h */
    public C8233m.C8234a f20873h = new C5279a();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI$a */
    public class C5279a implements C8233m.C8234a {
        public C5279a() {
        }

        /* renamed from: a */
        public void mo6254a(int i, String str, String str2) {
            if (i != 0 && str2 != null) {
                C76879j.m92748s(SettingsModifyNameUI.this, str2, str);
                if (SettingsModifyNameUI.this.f20870e != null) {
                    ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107991Q(SettingsModifyNameUI.this.f20870e);
                }
            } else if (i == 0 && SettingsModifyNameUI.this.f20871f) {
                C86709a0.m107535s().mo121142i().mo119676J(4, SettingsModifyNameUI.this.f20869d.getText().toString());
                ((C117474c) C86312j.m106911c(C117474c.class)).yn0().mo182766j(7);
                SettingsModifyNameUI.this.finish();
                C5139t.m5183e(4, 1);
            }
            C89779i0 i0Var = SettingsModifyNameUI.this.f20872g;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI$b */
    public class C5280b implements TextWatcher {
        public C5280b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SettingsModifyNameUI.this.enableOptionMenu(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI$c */
    public class C5281c implements MenuItem.OnMenuItemClickListener {
        public C5281c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String obj = SettingsModifyNameUI.this.f20869d.getText().toString();
            String e = C77092c.m93043e();
            if (!Util.isNullOrNil(e)) {
                if (obj.matches(".*[" + e + "].*")) {
                    C76879j.m92748s(SettingsModifyNameUI.this.getContext(), SettingsModifyNameUI.this.getString(C0966R.string.frk, new Object[]{e}), SettingsModifyNameUI.this.getString(C0966R.string.a3h));
                    return false;
                }
            }
            C77382c b = C77382c.m93286b(SettingsModifyNameUI.this.f20869d);
            b.f225611e = 1;
            b.f225610d = 32;
            b.mo107499d(SettingsModifyNameUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI$d */
    public class C5282d implements MenuItem.OnMenuItemClickListener {
        public C5282d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsModifyNameUI.this.hideVKB();
            SettingsModifyNameUI.this.finish();
            return true;
        }
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        C76879j.m92738i(this, C0966R.string.iug, C0966R.string.iui);
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
        C76879j.m92738i(this, C0966R.string.iuf, C0966R.string.iui);
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        Log.m105924i("MiroMsg.SettingsModifyNameUI", "Set New NickName : " + str);
        this.f20871f = true;
        this.f20872g = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.blb), false, false, (DialogInterface.OnCancelListener) null);
        C48630l lVar = new C48630l(str, 1);
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(lVar);
        this.f20870e = lVar;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxm;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iue);
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.jex);
        this.f20869d = mMEditText;
        mMEditText.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null), this.f20869d.getTextSize()));
        MMEditText mMEditText2 = this.f20869d;
        mMEditText2.setSelection(mMEditText2.getText().length());
        this.f20869d.addTextChangedListener(new C5280b());
        C77382c b = C77382c.m93286b(this.f20869d);
        b.f225611e = 1;
        b.f225610d = 32;
        b.f225607a = false;
        b.mo107499d((C77382c.C77383a) null);
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C5281c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(false);
        setBackBtn(new C5282d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107992d(64, this.f20873h);
        initView();
    }

    public void onDestroy() {
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107990O(64, this.f20873h);
        super.onDestroy();
    }
}
