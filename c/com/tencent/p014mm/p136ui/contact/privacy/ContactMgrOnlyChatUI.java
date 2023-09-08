package com.tencent.p014mm.p136ui.contact.privacy;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.privacy.ContactMgrUIBase;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C117747y;
import p910lj.C76701a;
import pc0.C11884l;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI */
public class ContactMgrOnlyChatUI extends ContactMgrUIBase {

    /* renamed from: F */
    public String f24534F;

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI$a */
    public class C6897a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C11884l f24535d;

        public C6897a(ContactMgrOnlyChatUI contactMgrOnlyChatUI, C11884l lVar) {
            this.f24535d = lVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107529k().f251779b.mo123458d(this.f24535d);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI$b */
    public class C6898b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C11884l f24536d;

        public C6898b(ContactMgrOnlyChatUI contactMgrOnlyChatUI, C11884l lVar) {
            this.f24536d = lVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107529k().f251779b.mo123458d(this.f24536d);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI$c */
    public class C6899c implements C47883u {
        public C6899c() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            ContactMgrOnlyChatUI.this.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(ContactMgrOnlyChatUI.this.getContext()));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(ContactMgrOnlyChatUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI$d */
    public class C6900d implements C47883u {
        public C6900d(ContactMgrOnlyChatUI contactMgrOnlyChatUI) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI$e */
    public class C6901e extends ContactMgrUIBase.C6915k {
        public C6901e(C74493g1 g1Var) {
            super(ContactMgrOnlyChatUI.this, g1Var);
        }

        /* renamed from: r */
        public void mo7853r() {
            super.mo7853r();
            C86709a0.m107528h();
            Cursor S3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, this.f24582q, "@social.black.android", "", this.f219096j);
            ContactMgrOnlyChatUI.this.f24544d.clear();
            if (S3 != null) {
                for (int i = 0; S3.moveToPosition(i); i++) {
                    Log.m105919d("MicroMsg.ContactMgrOnlyChatUI", "create contact item index=%d", Integer.valueOf(i));
                    C72996z1 z1Var = new C72996z1();
                    z1Var.convertFrom(S3);
                    ContactMgrOnlyChatUI.this.f24544d.add(z1Var.getUsername());
                }
            }
            S3.close();
        }

        /* renamed from: v */
        public String mo7911v() {
            return "@social.black.android";
        }
    }

    /* renamed from: H7 */
    public ContactMgrUIBase.C6915k mo7900H7(C74493g1 g1Var) {
        return new C6901e(g1Var);
    }

    /* renamed from: I7 */
    public CharSequence mo7901I7() {
        return getResources().getString(C0966R.string.f7430g2);
    }

    /* renamed from: J7 */
    public void mo7902J7() {
        Intent intent = new Intent();
        intent.putExtra("titile", getString(C0966R.string.hm6));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("show_too_many_member", false);
        C74560s1.m89276e();
        int g = C74560s1.m89278g(C74560s1.m89278g(C74560s1.f219161b, 536870912), 131072);
        intent.putExtra("max_limit_num", this.f24560w);
        String listToString = Util.listToString(this.f24544d, ",");
        intent.putExtra("list_attr", g);
        intent.putExtra("always_select_contact", listToString);
        C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    /* renamed from: K7 */
    public void mo7903K7() {
        Intent intent = new Intent(this, SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@social.black.android");
        intent.putExtra("titile", getResources().getString(C0966R.string.hm_));
        mo7912P7(intent);
        startActivityForResult(intent, 2);
    }

    /* renamed from: L7 */
    public void mo7904L7(Intent intent, Context context) {
        ArrayList<String> stringsToList = Util.stringsToList(intent.getStringExtra("Select_Contact").split(","));
        if (stringsToList != null && !stringsToList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            String s = C75592q0.m90789s();
            if (this.f24544d != null) {
                for (String next : stringsToList) {
                    if (!this.f24544d.contains(next) && !s.equals(next) && !Util.isNullOrNil(next)) {
                        arrayList.add(next);
                    }
                }
            } else {
                for (String next2 : stringsToList) {
                    if (!s.equals(next2) && !Util.isNullOrNil(next2)) {
                        arrayList.add(next2);
                    }
                }
            }
            Log.m105925i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList: %s, tagList : %s, memBerListTmp = %s.", stringsToList, this.f24544d, arrayList);
            if (arrayList.size() == 0) {
                Log.m105924i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList.isEmpty.");
                return;
            }
            C11884l lVar = new C11884l(arrayList, 8388608, 1, this.f24559v);
            C86709a0.m107529k().f251779b.mo123460f(lVar);
            this.f24558u = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f7435g7), true, true, new C6897a(this, lVar));
        }
    }

    /* renamed from: M7 */
    public boolean mo7905M7(AdapterView<?> adapterView, View view, int i, long j) {
        return false;
    }

    /* renamed from: N7 */
    public void mo7906N7(AdapterView<?> adapterView, View view, int i, long j) {
        C75922b j2 = this.f24547g.getItem(i);
        if (j2 != null && (j2 instanceof C75939h)) {
            String str = ((C75939h) j2).f222602y;
            ContactMgrUIBase.C6915k kVar = this.f24547g;
            if (kVar.f219057f) {
                kVar.mo7933t(str);
                if (((LinkedList) this.f24547g.f24583r).size() > 0) {
                    Button button = this.f24555r;
                    button.setText(getString(C0966R.string.f7438g_) + "(" + ((LinkedList) this.f24547g.f24583r).size() + ")");
                    this.f24555r.setEnabled(true);
                    return;
                }
                this.f24555r.setText(getString(C0966R.string.f7438g_));
                this.f24555r.setEnabled(false);
            } else if (C72996z1.m85841l5(str)) {
                Intent intent = new Intent(getContext(), AddressUI.class);
                intent.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/contact/privacy/ContactMgrOnlyChatUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/contact/privacy/ContactMgrOnlyChatUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", str);
                intent2.putExtra("Contact_Scene", 3);
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                if (str != null && str.length() > 0) {
                    C88144b.m109791i(getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                }
            }
        }
    }

    /* renamed from: O7 */
    public void mo7907O7(Intent intent, Context context) {
        ArrayList<String> stringsToList = Util.stringsToList(intent.getStringExtra("Select_Contact").split(","));
        if (stringsToList != null && !stringsToList.isEmpty()) {
            Log.m105925i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList: %s, tagList : %s.", stringsToList, this.f24544d);
            C11884l lVar = new C11884l(stringsToList, 8388608, 2, this.f24559v);
            C86709a0.m107529k().f251779b.mo123460f(lVar);
            this.f24558u = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f7439ga), true, true, new C6898b(this, lVar));
        }
    }

    /* renamed from: W7 */
    public void mo7908W7() {
        ContactMgrUIBase.C6915k kVar = this.f24547g;
        if (kVar == null || kVar.mo7934u() <= 0) {
            setMMTitle(this.f24534F);
            return;
        }
        setMMTitle(this.f24534F + "(" + this.f24547g.mo7934u() + ")");
    }

    /* renamed from: f6 */
    public ListView mo7831f6() {
        return null;
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bno;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(mo7901I7());
        this.f24547g.mo7853r();
        mo7915S7();
        this.f24556s = getString(C0966R.string.f7437g9);
        this.f24534F = getResources().getString(C0966R.string.f7430g2);
        mo7908W7();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105924i("MicroMsg.ContactMgrOnlyChatUI", "onNotifyChange: event = " + i + " stg = " + mStorageEx + " obj = " + obj);
        if (i == 4) {
            mo7917U7();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar instanceof C11884l) {
            C89779i0 i0Var = this.f24558u;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f24558u = null;
            }
            C11884l lVar = (C11884l) yVar;
            if (i == 0 && i2 == 0) {
                C76701a.makeText((Context) this, (CharSequence) getString(lVar.f34724g == 1 ? C0966R.string.f7445gg : C0966R.string.f7448gj), 0).show();
                return;
            }
            int i3 = C0966R.string.f7443ge;
            if (i2 == -3503) {
                C77426q qVar = new C77426q(this);
                qVar.mo107595g(Util.nullAs(yVar.getReqResp().getRespObj().getErrMsg(), getString(C0966R.string.f7443ge)));
                qVar.mo107589a(true);
                qVar.mo107598j(getString(C0966R.string.hn8));
                qVar.mo107601m(C0966R.string.hn9);
                qVar.mo107590b(new C6899c());
                qVar.mo107603o();
                return;
            }
            C77426q qVar2 = new C77426q(this);
            if (i2 == -3500) {
                str2 = getString(lVar.f34724g == 1 ? C0966R.string.f7444gf : C0966R.string.f7447gi, new Object[]{Integer.valueOf(lVar.f34728n - ((LinkedList) lVar.f34722e).size())});
            } else {
                str2 = yVar.getReqResp().getRespObj().getErrMsg();
                if (Util.isNullOrNil(str2)) {
                    if (lVar.f34724g != 1) {
                        i3 = C0966R.string.f7446gh;
                    }
                    str2 = getString(i3);
                }
            }
            qVar2.mo107595g(str2);
            qVar2.mo107601m(C0966R.string.a18);
            qVar2.mo107600l(new C6900d(this));
            qVar2.mo107603o();
        }
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        return false;
    }
}
