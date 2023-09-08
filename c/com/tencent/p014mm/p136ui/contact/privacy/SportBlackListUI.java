package com.tencent.p014mm.p136ui.contact.privacy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.privacy.ContactMgrUIBase;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import gl3.C75922b;
import gl3.C75939h;
import hl3.C8612i;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import p910lj.C76701a;
import qo3.C89779i0;
import tv2.C14096e;

/* renamed from: com.tencent.mm.ui.contact.privacy.SportBlackListUI */
public class SportBlackListUI extends ContactMgrUIBase {

    /* renamed from: F */
    public String f24605F;

    /* renamed from: com.tencent.mm.ui.contact.privacy.SportBlackListUI$a */
    public class C6923a implements DialogInterface.OnCancelListener {
        public C6923a(SportBlackListUI sportBlackListUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SportBlackListUI$b */
    public class C6924b implements DialogInterface.OnCancelListener {
        public C6924b(SportBlackListUI sportBlackListUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SportBlackListUI$c */
    public class C6925c extends ContactMgrUIBase.C6915k {
        public C6925c(SportBlackListUI sportBlackListUI, C74493g1 g1Var) {
            super(sportBlackListUI, g1Var);
        }

        /* renamed from: v */
        public String mo7911v() {
            return "@werun.black.android";
        }
    }

    /* renamed from: H7 */
    public ContactMgrUIBase.C6915k mo7900H7(C74493g1 g1Var) {
        return new C6925c(this, g1Var);
    }

    /* renamed from: J7 */
    public void mo7902J7() {
        String listToString = Util.listToString(this.f24544d, ",");
        Intent intent = new Intent();
        intent.putExtra("titile", getString(C0966R.string.hm6));
        intent.putExtra("list_type", 1);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219161b);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("always_select_contact", listToString);
        C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    /* renamed from: K7 */
    public void mo7903K7() {
        Intent intent = new Intent(this, SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@werun.black.android");
        intent.putExtra("titile", getResources().getString(C0966R.string.hm_));
        mo7912P7(intent);
        startActivityForResult(intent, 2);
    }

    /* renamed from: L7 */
    public void mo7904L7(Intent intent, Context context) {
        ArrayList<String> stringsToList;
        String stringExtra = intent.getStringExtra("Select_Contact");
        Log.m105925i("MicroMsg.SportBlackListUI", "onAddContact before userNameStr: %s, tagList : %s.", stringExtra, this.f24544d);
        if (!Util.isNullOrNil(stringExtra) && (stringsToList = Util.stringsToList(stringExtra.split(","))) != null) {
            String s = C75592q0.m90789s();
            for (String next : stringsToList) {
                if (!this.f24544d.contains(next) && !s.equals(next)) {
                    this.f24544d.add(next);
                    C45628s0.m50793p0(C97625j3.m125812b().mo105907v().get(next));
                }
            }
            this.f24563z = true;
            Log.m105925i("MicroMsg.SportBlackListUI", "onAddContact after userNameStr: %s, tagList : %s.", stringExtra, this.f24544d);
            this.f24558u = C76879j.m92723Q(this, getResources().getString(C0966R.string.a3h), getResources().getString(C0966R.string.f7435g7), true, false, new C6923a(this));
            mo7917U7();
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
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: O7 */
    public void mo7907O7(Intent intent, Context context) {
        ArrayList<String> stringsToList;
        String stringExtra = intent.getStringExtra("Select_Contact");
        Log.m105925i("MicroMsg.SportBlackListUI", "onRemoveContact before userNameStr: %s, tagList : %s.", stringExtra, this.f24544d);
        if (!Util.isNullOrNil(stringExtra) && (stringsToList = Util.stringsToList(stringExtra.split(","))) != null) {
            for (String next : stringsToList) {
                if (!Util.isNullOrNil(next)) {
                    this.f24544d.remove(next);
                    C45628s0.m50811y0(C97625j3.m125812b().mo105907v().get(next));
                    C14096e.m13447a(40);
                }
            }
            this.f24540A = true;
            mo7917U7();
            this.f24558u = C76879j.m92723Q(this, getResources().getString(C0966R.string.a3h), getResources().getString(C0966R.string.f7439ga), true, false, new C6924b(this));
            Log.m105925i("MicroMsg.SportBlackListUI", "onRemoveContact after userNameStr: %s, tagList : %s.", stringExtra, this.f24544d);
        }
    }

    /* renamed from: V7 */
    public void mo7918V7() {
        C89779i0 i0Var = this.f24558u;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f24558u = null;
        }
        if (this.f24540A) {
            this.f24540A = false;
            C76701a.makeText((Context) this, (CharSequence) getResources().getString(C0966R.string.f7448gj), 0).show();
        }
        if (this.f24563z) {
            this.f24563z = false;
            C76701a.makeText((Context) this, (CharSequence) getResources().getString(C0966R.string.f7445gg), 0).show();
        }
    }

    /* renamed from: W7 */
    public void mo7908W7() {
        ContactMgrUIBase.C6915k kVar = this.f24547g;
        if (kVar == null || kVar.mo7934u() <= 0) {
            setMMTitle(this.f24605F);
            return;
        }
        setMMTitle(this.f24605F + "(" + this.f24547g.mo7934u() + ")");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14096e.m13447a(39);
        if (this.f24544d == null) {
            this.f24544d = new ArrayList();
        }
        C86709a0.m107528h();
        String nullAs = Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), "");
        Cursor b4 = C97625j3.m125812b().mo105907v().mo69687b4("@werun.black.android", "", (List<String>) null);
        while (b4.moveToNext()) {
            String string = b4.getString(b4.getColumnIndex("username"));
            if (nullAs.equals(string)) {
                C45628s0.m50811y0(C97625j3.m125812b().mo105907v().get(string));
            } else {
                this.f24544d.add(string);
            }
        }
        b4.close();
        String string2 = getString(C0966R.string.hmn);
        this.f24605F = string2;
        setMMTitle(string2);
        setBackBtn(new C8612i(this));
        this.f24556s = getString(C0966R.string.hmm);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1805j.CTRL_INDEX, this);
        mo7916T7();
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f24558u;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f24558u = null;
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1805j.CTRL_INDEX, this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105925i("MicroMsg.SportBlackListUI", "onNotifyChange, event: %s, stg: %s, obj: %s.", Integer.valueOf(i), mStorageEx, obj);
        if (i == 4) {
            mo7917U7();
        }
    }
}
