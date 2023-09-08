package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ModifyAliasLogStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.CheckBoxLicenseView;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import jg0.C9394f;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import qo3.C101218e0;
import qo3.C89779i0;
import xm2.C15860k;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI */
public class SettingsModifyAliasUI extends MMWizardActivity implements C11385n, C74965a.C74969d {

    /* renamed from: r */
    public static final /* synthetic */ int f20852r = 0;

    /* renamed from: e */
    public InputPanelLinearLayout f20853e;

    /* renamed from: f */
    public MMClearEditText f20854f;

    /* renamed from: g */
    public Button f20855g;

    /* renamed from: h */
    public TextView f20856h;

    /* renamed from: i */
    public ScrollView f20857i;

    /* renamed from: j */
    public C89779i0 f20858j;

    /* renamed from: n */
    public C9394f f20859n;

    /* renamed from: o */
    public C15860k f20860o;

    /* renamed from: p */
    public ArrayList<Integer> f20861p;

    /* renamed from: q */
    public ArrayList<String> f20862q;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI$a */
    public class C5275a implements View.OnClickListener {
        public C5275a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsModifyAliasUI settingsModifyAliasUI = SettingsModifyAliasUI.this;
            Editable text = settingsModifyAliasUI.f20854f.getText();
            settingsModifyAliasUI.getClass();
            boolean z = false;
            if (text.length() < 6 || text.length() > 20) {
                settingsModifyAliasUI.mo6247N7(settingsModifyAliasUI.getString(C0966R.string.k9r));
            } else if (Util.isAlpha(text.charAt(0)) || '_' == text.charAt(0)) {
                int length = text.length() - 1;
                while (true) {
                    if (length <= 0) {
                        settingsModifyAliasUI.mo6247N7("");
                        z = true;
                        break;
                    }
                    char charAt = text.charAt(length);
                    if (Util.isAlpha(charAt) || charAt == '-' || charAt == '_' || Util.isNum(charAt)) {
                        length--;
                    } else if (Character.isSpace(charAt)) {
                        settingsModifyAliasUI.mo6247N7(settingsModifyAliasUI.getString(C0966R.string.k9o));
                    } else if (Util.isChinese(charAt)) {
                        settingsModifyAliasUI.mo6247N7(settingsModifyAliasUI.getString(C0966R.string.k9m));
                    } else {
                        settingsModifyAliasUI.mo6247N7(settingsModifyAliasUI.getString(C0966R.string.k9r));
                    }
                }
            } else {
                settingsModifyAliasUI.mo6247N7(settingsModifyAliasUI.getString(C0966R.string.k9p));
            }
            if (z) {
                SettingsModifyAliasUI.this.hideVKB();
                SettingsModifyAliasUI.this.mo6247N7("");
                SettingsModifyAliasUI settingsModifyAliasUI2 = SettingsModifyAliasUI.this;
                String obj = settingsModifyAliasUI2.f20854f.getText().toString();
                settingsModifyAliasUI2.getClass();
                settingsModifyAliasUI2.f20859n = new C9394f(obj);
                settingsModifyAliasUI2.f20858j = C76879j.m92723Q(settingsModifyAliasUI2.getContext(), "", settingsModifyAliasUI2.getString(C0966R.string.a2w), false, true, new C5378n2(settingsModifyAliasUI2));
                C86709a0.m107524d().mo123460f(settingsModifyAliasUI2.f20859n);
            } else {
                ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
                modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
                modifyAliasLogStruct.f9998e = 4;
                modifyAliasLogStruct.f9999f = 5;
                modifyAliasLogStruct.mo86054n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI$b */
    public class C5276b implements TextWatcher {
        public C5276b() {
        }

        public void afterTextChanged(Editable editable) {
            boolean z = editable != null && !Util.isNullOrNil(editable.toString());
            SettingsModifyAliasUI.this.f20855g.setEnabled(z);
            if (!z) {
                SettingsModifyAliasUI.this.mo6247N7("");
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI$c */
    public class C5277c implements MenuItem.OnMenuItemClickListener {
        public C5277c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
            modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
            modifyAliasLogStruct.f9998e = 7;
            modifyAliasLogStruct.f10000g = 2;
            modifyAliasLogStruct.mo86054n();
            SettingsModifyAliasUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI$d */
    public class C5278d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f20866d;

        public C5278d(int i) {
            this.f20866d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.SettingsModifyAliasUI", "inputContainer.height: %d, screenHeight: %d", Integer.valueOf(SettingsModifyAliasUI.this.f20853e.getHeight()), Integer.valueOf(this.f20866d));
            if (SettingsModifyAliasUI.this.f20853e.getHeight() > this.f20866d) {
                SettingsModifyAliasUI settingsModifyAliasUI = SettingsModifyAliasUI.this;
                settingsModifyAliasUI.f20857i.scrollBy(0, settingsModifyAliasUI.f20853e.getHeight() - this.f20866d);
            }
        }
    }

    /* renamed from: N7 */
    public final void mo6247N7(String str) {
        if (Util.isNullOrNil(str)) {
            this.f20856h.setVisibility(8);
            return;
        }
        this.f20856h.setVisibility(0);
        this.f20856h.setText(str);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxj;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105925i("MicroMsg.SettingsModifyAliasUI", "keyboard show %s, keyboardHeight %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20855g.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            layoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            this.f20855g.setLayoutParams(layoutParams);
            InputPanelLinearLayout inputPanelLinearLayout = this.f20853e;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f20853e.getPaddingTop(), this.f20853e.getPaddingRight(), i);
            int height = this.f20857i.getHeight();
            this.f20853e.requestLayout();
            this.f20853e.post(new C5278d(height));
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f20855g.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
        layoutParams2.topMargin = 0;
        this.f20855g.setLayoutParams(layoutParams2);
        InputPanelLinearLayout inputPanelLinearLayout2 = this.f20853e;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f20853e.getPaddingTop(), this.f20853e.getPaddingRight(), 0);
        this.f20857i.scrollBy(0, 0);
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.f7j);
        this.f20853e = inputPanelLinearLayout;
        inputPanelLinearLayout.mo104200a(this);
        this.f20855g = (Button) findViewById(C0966R.C0970id.hfe);
        this.f20854f = (MMClearEditText) findViewById(C0966R.C0970id.f5783oi);
        this.f20856h = (TextView) findViewById(C0966R.C0970id.ckx);
        this.f20857i = (ScrollView) findViewById(C0966R.C0970id.j48);
        this.f20855g.setOnClickListener(new C5275a());
        this.f20854f.requestFocus();
        this.f20854f.addTextChangedListener(new C5276b());
        setBackBtn(new C5277c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20861p = getIntent().getIntegerArrayListExtra("key_ticket_type");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_ticket");
        this.f20862q = stringArrayListExtra;
        Log.m105925i("MicroMsg.SettingsModifyAliasUI", "ticketTypes %s, tickets %s", this.f20861p, stringArrayListExtra);
        initView();
        C86709a0.m107524d().mo123455a(3516, this);
        C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL, this);
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableModAlias", 0) == 0) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3516, this);
        C86709a0.m107524d().mo123470p(WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.SettingsModifyAliasUI", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C89779i0 i0Var = this.f20858j;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (yVar.getType() == 3516) {
            ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
            modifyAliasLogStruct.f9998e = 4;
            modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
            if (yVar != this.f20859n) {
                Log.m105928w("MicroMsg.SettingsModifyAliasUI", "check alias, not my scene, ignore!");
                return;
            }
            if (i == 0 && i2 == 0) {
                String str2 = ((C9394f) yVar).f29332f;
                C101218e0 e0Var = new C101218e0(this);
                e0Var.mo140662i(C0966R.C0971layout.bx_);
                ((TextView) e0Var.f296384g.findViewById(C0966R.C0970id.jdq)).setText(str2);
                Button button = (Button) e0Var.f296384g.findViewById(C0966R.C0970id.hfe);
                button.setOnClickListener(new C5388o2(this, str2));
                CheckBoxLicenseView checkBoxLicenseView = (CheckBoxLicenseView) e0Var.f296384g.findViewById(C0966R.C0970id.f358765gy2);
                checkBoxLicenseView.setTermText(getString(C0966R.string.gvb));
                checkBoxLicenseView.setCheckStateChangeListener(new C5392p2(this, button));
                checkBoxLicenseView.setLicenseClickListener(new C5394q2(this));
                ImageView imageView = (ImageView) e0Var.f296384g.findViewById(C0966R.C0970id.f358766gy3);
                if (C85875k4.m106211z()) {
                    imageView.setImageResource(C0966R.C0969drawable.f4390b8);
                }
                imageView.setOnClickListener(new C5398r2(this, e0Var));
                e0Var.mo140655A();
            } else {
                modifyAliasLogStruct.f9999f = 6;
                if (!Util.isNullOrNil(str)) {
                    C7660a a = C7660a.m7782a(str);
                    if (a != null) {
                        mo6247N7(a.f26001b);
                    } else {
                        mo6247N7(str);
                    }
                } else {
                    mo6247N7(getString(C0966R.string.f7966xq));
                }
            }
            modifyAliasLogStruct.mo86054n();
        } else if (yVar.getType() != 177) {
        } else {
            if (yVar != this.f20860o) {
                Log.m105928w("MicroMsg.SettingsModifyAliasUI", "general set, not my scene, ignore!");
            } else if (i == 0 && i2 == 0) {
                C76879j.m92726T(this, getString(C0966R.string.a0g));
                String str3 = this.f20860o.f42710f;
                String str4 = (String) C86709a0.m107535s().mo121142i().mo119684e(42, (Object) null);
                C85801v1 i3 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING;
                String str5 = (String) i3.mo119685f(aVar, (Object) null);
                Log.m105925i("MicroMsg.SettingsModifyAliasUI", "newAlias %s, oldAlias %s, lastLogin %s", str3, str4, str5);
                C86709a0.m107535s().mo121142i().mo119676J(42, str3);
                if (Util.isNullOrNil(str4) || str4.equals(str5)) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, str3);
                    C75593t5.f222075c.mo105946i(C75592q0.m90789s(), "login_user_name", str3);
                    C7624i3.f25910c.mo8756d("login_user_name", str3);
                }
                mo7681K7(-1);
                setResult(-1);
            } else if (i2 == -7 || i2 == -10) {
                C76879j.m92738i(getContext(), C0966R.string.hvp, C0966R.string.gvl);
            } else if (!Util.isNullOrNil(str)) {
                C7660a a2 = C7660a.m7782a(str);
                if (a2 != null) {
                    a2.mo8793c(this, (DialogInterface.OnDismissListener) null);
                } else {
                    C76879j.m92748s(this, str, getString(C0966R.string.gvl));
                }
            } else {
                C76879j.m92738i(getContext(), C0966R.string.f7966xq, C0966R.string.gvl);
            }
        }
    }
}
