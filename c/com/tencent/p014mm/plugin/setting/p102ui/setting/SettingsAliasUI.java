package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ModifyAliasLogStruct;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.p024ui.VerifyPwdUI;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jg0.C9395g;
import lc3.C10485b;
import nj3.C11184p0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;
import qg0.C12215a;
import te3.C49606gt;
import te3.C49750ht;
import tm2.C78046e;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI */
public class SettingsAliasUI extends MMWizardActivity implements C11385n {

    /* renamed from: q */
    public static String f20811q;

    /* renamed from: e */
    public TextView f20812e;

    /* renamed from: f */
    public List<C49750ht> f20813f = null;

    /* renamed from: g */
    public ProgressDialog f20814g;

    /* renamed from: h */
    public boolean f20815h;

    /* renamed from: i */
    public boolean f20816i;

    /* renamed from: j */
    public int f20817j;

    /* renamed from: n */
    public String f20818n;

    /* renamed from: o */
    public String f20819o;

    /* renamed from: p */
    public ModifyAliasLogStruct f20820p = new ModifyAliasLogStruct();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI$a */
    public class C5261a implements View.OnLongClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI$a$a */
        public class C5262a implements View.OnCreateContextMenuListener {
            public C5262a() {
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(SettingsAliasUI.this.getString(C0966R.string.f7936wt));
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI$a$b */
        public class C5263b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f20823d;

            public C5263b(String str) {
                this.f20823d = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (i == 0) {
                    ClipboardHelper.setText(this.f20823d);
                    SettingsAliasUI settingsAliasUI = SettingsAliasUI.this;
                    C76879j.m92729W(settingsAliasUI, settingsAliasUI.getString(C0966R.string.f7938wv));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI$a$c */
        public class C5264c implements PopupWindow.OnDismissListener {
            public C5264c() {
            }

            public void onDismiss() {
                String c = C75592q0.m90773c();
                if (Util.isNullOrNil(c)) {
                    c = C75592q0.m90789s();
                }
                TextView textView = SettingsAliasUI.this.f20812e;
                textView.setText(SettingsAliasUI.this.getString(C0966R.string.f7993yn) + c);
            }
        }

        public C5261a() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (SettingsAliasUI.this.f20812e.getText() != null) {
                String charSequence = SettingsAliasUI.this.f20812e.getText().toString();
                int indexOf = charSequence.indexOf(58);
                if (indexOf >= 0 && indexOf < charSequence.length()) {
                    charSequence = charSequence.substring(indexOf + 1).trim();
                }
                SpannableString spannableString = new SpannableString(SettingsAliasUI.this.f20812e.getText());
                spannableString.setSpan(new BackgroundColorSpan(SettingsAliasUI.this.getResources().getColor(C0966R.color.a16)), indexOf + 1, SettingsAliasUI.this.f20812e.getText().length(), 33);
                SettingsAliasUI.this.f20812e.setText(spannableString);
                SettingsAliasUI settingsAliasUI = SettingsAliasUI.this;
                C78253a aVar = new C78253a(settingsAliasUI, settingsAliasUI.f20812e);
                aVar.f229249r = new C5262a();
                aVar.f229251t = new C5263b(charSequence);
                aVar.f229227C = new C5264c();
                aVar.mo70679m();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI$b */
    public class C5265b implements View.OnClickListener {
        public C5265b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = 0;
            Log.m105925i("MicroMsg.SettingsAliasUI", "click next, allPass %s", Boolean.valueOf(SettingsAliasUI.this.f20815h));
            SettingsAliasUI settingsAliasUI = SettingsAliasUI.this;
            ModifyAliasLogStruct modifyAliasLogStruct = settingsAliasUI.f20820p;
            modifyAliasLogStruct.f9998e = 1;
            if (settingsAliasUI.f20815h) {
                modifyAliasLogStruct.mo86054n();
                SettingsAliasUI.this.mo6231O7();
            } else {
                List<C49750ht> list = settingsAliasUI.f20813f;
                if (list == null || list.isEmpty()) {
                    SettingsAliasUI settingsAliasUI2 = SettingsAliasUI.this;
                    settingsAliasUI2.f20816i = true;
                    settingsAliasUI2.mo6230N7(true);
                } else {
                    int i2 = 0;
                    while (i < ((LinkedList) SettingsAliasUI.this.f20813f).size()) {
                        if (!((C49750ht) ((LinkedList) SettingsAliasUI.this.f20813f).get(i)).f134870g) {
                            i2 = i == 0 ? i2 | 1 : i2 | 2;
                        }
                        i++;
                    }
                    ModifyAliasLogStruct modifyAliasLogStruct2 = SettingsAliasUI.this.f20820p;
                    modifyAliasLogStruct2.f9999f = (long) i2;
                    modifyAliasLogStruct2.mo86054n();
                    SettingsAliasUI settingsAliasUI3 = SettingsAliasUI.this;
                    settingsAliasUI3.getClass();
                    MMWizardActivity.m7017L7(settingsAliasUI3, new Intent(settingsAliasUI3, SettingsModifyAliasCheckUI.class));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI$c */
    public class C5266c implements MenuItem.OnMenuItemClickListener {
        public C5266c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ModifyAliasLogStruct modifyAliasLogStruct = SettingsAliasUI.this.f20820p;
            modifyAliasLogStruct.f9998e = 7;
            modifyAliasLogStruct.mo86054n();
            SettingsAliasUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: N7 */
    public final void mo6230N7(boolean z) {
        C86709a0.m107524d().mo123460f(new C9395g());
        if (z) {
            this.f20814g = C76879j.m92723Q(this, "", getString(C0966R.string.f360085a04), false, false, (DialogInterface.OnCancelListener) null);
        }
    }

    /* renamed from: O7 */
    public final void mo6231O7() {
        int i = this.f20817j;
        if (i == 1) {
            Intent intent = new Intent(this, VerifyPwdUI.class);
            intent.putExtra("key_scenen", 2);
            startActivityForResult(intent, 10001);
        } else if (i != 2) {
            if (!Util.isNullOrNil(this.f20819o)) {
                C12215a.m11778c(this, this.f20819o, 0, true);
            }
        } else if (!Util.isNullOrNil(this.f20819o)) {
            C12215a.m11778c(this, this.f20819o, 10002, true);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359972bx3;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f20812e = (TextView) findViewById(C0966R.C0970id.jdr);
        String c = C75592q0.m90773c();
        if (Util.isNullOrNil(c)) {
            c = C75592q0.m90789s();
        }
        Log.m105925i("MicroMsg.SettingsAliasUI", "curAlias %s", c);
        TextView textView = this.f20812e;
        textView.setText(getString(C0966R.string.f7993yn) + c);
        this.f20812e.setOnLongClickListener(new C5261a());
        ((Button) findViewById(C0966R.C0970id.jes)).setOnClickListener(new C5265b());
        setBackBtn(new C5266c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class<SettingsModifyAliasUI> cls = SettingsModifyAliasUI.class;
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(i2 == -1);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105925i("MicroMsg.SettingsAliasUI", "requestCode %d, resultCode OK %s, data == null %s", objArr);
        if (intent != null) {
            if (i == 10001) {
                if (i2 == -1) {
                    Intent intent2 = new Intent(this, cls);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(1);
                    arrayList.add(2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(this.f20818n);
                    arrayList2.add(intent.getStringExtra("key_ticket"));
                    intent2.putIntegerArrayListExtra("key_ticket_type", arrayList);
                    intent2.putStringArrayListExtra("key_ticket", arrayList2);
                    MMWizardActivity.m7017L7(this, intent2);
                }
            } else if (i == 10002 && i2 == -1) {
                Bundle bundleExtra = intent.getBundleExtra("result_data");
                String string = bundleExtra == null ? "" : bundleExtra.getString("result_json");
                Log.m105925i("MicroMsg.SettingsAliasUI", "face recog, result: %s", string);
                if (!Util.isNullOrNil(string)) {
                    try {
                        String string2 = new C104289g(string).getString("ticket");
                        Intent intent3 = new Intent(this, cls);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(1);
                        arrayList3.add(3);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(this.f20818n);
                        arrayList4.add(string2);
                        intent3.putIntegerArrayListExtra("key_ticket_type", arrayList3);
                        intent3.putStringArrayListExtra("key_ticket", arrayList4);
                        MMWizardActivity.m7017L7(this, intent3);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.SettingsAliasUI", "jump face recog error, %s", e.getMessage());
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78046e.f228784e = null;
        String str = "set_alias_" + System.currentTimeMillis();
        f20811q = str;
        this.f20820p.mo1043s(str);
        initView();
        Log.m105925i("MicroMsg.SettingsAliasUI", "root class %s", getIntent().getStringExtra("WizardRootClass"));
        C86709a0.m107524d().mo123455a(926, this);
        mo6230N7(false);
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableModAlias", 0) == 0) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(926, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.SettingsAliasUI", "errType %d, errCode %d, errMsg %s, doubleCheck %s", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(this.f20816i));
        ProgressDialog progressDialog = this.f20814g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i == 0 && i2 == 0) {
            C9395g gVar = (C9395g) yVar;
            LinkedList<C49750ht> linkedList = ((C49606gt) gVar.f29333d.f127056b.f127083a).f134251d;
            this.f20813f = linkedList;
            Log.m105925i("MicroMsg.SettingsAliasUI", "conditions %d", Integer.valueOf(linkedList.size()));
            C49606gt gtVar = (C49606gt) gVar.f29333d.f127056b.f127083a;
            this.f20817j = gtVar.f134253f;
            this.f20819o = gtVar.f134254g;
            this.f20818n = gtVar.f134252e;
            List<C49750ht> list = this.f20813f;
            if (list == null || list.isEmpty()) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f7965xp), 0).show();
                return;
            }
            this.f20815h = true;
            List<C49750ht> list2 = this.f20813f;
            C78046e.f228784e = list2;
            for (C49750ht htVar : list2) {
                this.f20815h = this.f20815h && htVar.f134870g;
            }
            Log.m105925i("MicroMsg.SettingsAliasUI", "onSceneEnd, allPass %s", Boolean.valueOf(this.f20815h));
            if (!this.f20816i) {
                return;
            }
            if (!this.f20815h) {
                MMWizardActivity.m7017L7(this, new Intent(this, SettingsModifyAliasCheckUI.class));
            } else {
                mo6231O7();
            }
        } else {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f7966xq), 0).show();
        }
    }
}
