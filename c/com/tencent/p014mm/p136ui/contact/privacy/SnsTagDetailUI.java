package com.tencent.p014mm.p136ui.contact.privacy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.privacy.ContactMgrUIBase;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.sns.model.C43039l0;
import com.tencent.p014mm.plugin.sns.model.C43040m0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import gl3.C75922b;
import gl3.C75939h;
import hl3.C8606e;
import hl3.C8610g;
import hl3.C8611h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C117747y;
import os2.C11765l0;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.contact.privacy.SnsTagDetailUI */
public class SnsTagDetailUI extends ContactMgrUIBase {

    /* renamed from: K */
    public static final /* synthetic */ int f24595K = 0;

    /* renamed from: F */
    public List<String> f24596F = new ArrayList();

    /* renamed from: G */
    public long f24597G;

    /* renamed from: H */
    public String f24598H = "";

    /* renamed from: I */
    public String f24599I = "";

    /* renamed from: J */
    public int f24600J = 0;

    /* renamed from: com.tencent.mm.ui.contact.privacy.SnsTagDetailUI$a */
    public class C6920a implements MenuItem.OnMenuItemClickListener {
        public C6920a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsTagDetailUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SnsTagDetailUI$b */
    public class C6921b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C43040m0 f24602d;

        public C6921b(C43040m0 m0Var) {
            this.f24602d = m0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f24602d);
            SnsTagDetailUI snsTagDetailUI = SnsTagDetailUI.this;
            int i = SnsTagDetailUI.f24595K;
            snsTagDetailUI.mo7942b8();
            SnsTagDetailUI.this.mo7913Q7();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SnsTagDetailUI$c */
    public class C6922c extends ContactMgrUIBase.C6915k {
        public C6922c(C74493g1 g1Var) {
            super(SnsTagDetailUI.this, g1Var);
        }

        /* renamed from: v */
        public String mo7911v() {
            long j = SnsTagDetailUI.this.f24597G;
            if (j == 4) {
                return "@sns.black.android";
            }
            if (j == 5) {
                return "@sns.unlike.android";
            }
            return null;
        }
    }

    /* renamed from: H7 */
    public ContactMgrUIBase.C6915k mo7900H7(C74493g1 g1Var) {
        return new C6922c(g1Var);
    }

    /* renamed from: J7 */
    public void mo7902J7() {
        String listToString = Util.listToString(this.f24544d, ",");
        Intent intent = new Intent();
        intent.putExtra("titile", getString(C0966R.string.hm6));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219161b);
        intent.putExtra("always_select_contact", listToString);
        intent.putExtra("without_openim", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    /* renamed from: K7 */
    public void mo7903K7() {
        Intent intent = new Intent(this, SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        long j = this.f24597G;
        if (j == 4) {
            intent.putExtra("filter_type", "@sns.black.android");
        } else if (j == 5) {
            intent.putExtra("filter_type", "@sns.unlike.android");
        }
        mo7912P7(intent);
        intent.putExtra("titile", getResources().getString(C0966R.string.hm_));
        startActivityForResult(intent, 2);
    }

    /* renamed from: L7 */
    public void mo7904L7(Intent intent, Context context) {
        long j = this.f24597G;
        if (j == 4) {
            mo7941a8(true, intent);
        } else if (j == 5) {
            mo7940Z7(true, intent);
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
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/contact/privacy/SnsTagDetailUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/contact/privacy/SnsTagDetailUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                Intent intent2 = new Intent();
                long j3 = this.f24597G;
                if (j3 == 4) {
                    intent2.putExtra("CONTACT_INFO_UI_SOURCE", 18);
                } else if (j3 == 5) {
                    intent2.putExtra("CONTACT_INFO_UI_SOURCE", 19);
                }
                intent2.putExtra("Contact_User", str);
                if (str != null && str.length() > 0) {
                    C88144b.m109791i(getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                }
            }
        }
    }

    /* renamed from: O7 */
    public void mo7907O7(Intent intent, Context context) {
        long j = this.f24597G;
        if (j == 4) {
            mo7941a8(false, intent);
        } else if (j == 5) {
            mo7940Z7(false, intent);
        }
    }

    /* renamed from: V7 */
    public void mo7918V7() {
        if (this.f24597G == 4) {
            this.f24543D.mo9468c();
            mo7914R7();
        }
    }

    /* renamed from: W7 */
    public void mo7908W7() {
        ContactMgrUIBase.C6915k kVar = this.f24547g;
        if (kVar == null || kVar.mo7934u() <= 0) {
            setMMTitle(this.f24598H);
            return;
        }
        setMMTitle(this.f24598H + "(" + this.f24547g.mo7934u() + ")");
    }

    /* renamed from: X7 */
    public List<String> mo7938X7() {
        LinkedList linkedList = new LinkedList();
        if (this.f24597G == 4) {
            new LinkedList();
            return ContactBlackListHelper.m6943b();
        }
        C11765l0 qq = C94866e1.ey0().mo11657qq(this.f24597G);
        String str = qq.field_memberList;
        return (str == null || str.equals("")) ? linkedList : Util.stringsToList(qq.field_memberList.split(","));
    }

    /* renamed from: Y7 */
    public final void mo7939Y7() {
        if (this.f24597G == 5) {
            ((ArrayList) this.f24596F).clear();
            C86709a0.m107528h();
            String nullAs = Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), "");
            Cursor b4 = C97625j3.m125812b().mo105907v().mo69687b4("@sns.unlike.android", "", (List<String>) null);
            while (b4.moveToNext()) {
                ((ArrayList) this.f24596F).add(b4.getString(b4.getColumnIndex("username")));
            }
            b4.close();
            Log.m105925i("MicroMsg.SnsTagDetailUI", "initTagList before localContactTagList: %s, tagList : %s.", this.f24596F, this.f24544d);
            for (int i = 0; i < ((ArrayList) this.f24596F).size(); i++) {
                String str = (String) ((ArrayList) this.f24596F).get(i);
                if (!this.f24544d.contains(str) && !Util.isNullOrNil(str)) {
                    C45628s0.m50801t0(C97625j3.m125812b().mo105907v().get(str));
                    Log.m105925i("MicroMsg.SnsTagDetailUI", "initTagList tag no container db tagName: %s", str);
                }
            }
            for (int i2 = 0; i2 < this.f24544d.size(); i2++) {
                String str2 = this.f24544d.get(i2);
                if (!Util.isNullOrNil(str2) && !((ArrayList) this.f24596F).contains(str2)) {
                    C45628s0.m50785l0(C97625j3.m125812b().mo105907v().get(str2));
                    Log.m105925i("MicroMsg.SnsTagDetailUI", "initTagList db no container tag tagName: %s", str2);
                }
            }
            if (this.f24544d.contains(nullAs)) {
                this.f24544d.remove(nullAs);
                C45628s0.m50801t0(C97625j3.m125812b().mo105907v().get(nullAs));
            }
            ((ArrayList) this.f24545e).clear();
            ((ArrayList) this.f24545e).addAll(this.f24544d);
        }
        Log.m105925i("MicroMsg.SnsTagDetailUI", "initTagList after localContactTagList: %s, tagList : %s, orginTagList: %s.", this.f24596F, this.f24544d, this.f24545e);
    }

    /* renamed from: Z7 */
    public final boolean mo7940Z7(boolean z, Intent intent) {
        ArrayList<String> stringsToList = Util.stringsToList(intent.getStringExtra("Select_Contact").split(","));
        if (stringsToList == null) {
            return false;
        }
        C44668u3 Jx0 = C94866e1.Jx0();
        String s = C75592q0.m90789s();
        Log.m105925i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp , before memBerList: %s, tagList : %s, md5: %s.", stringsToList, this.f24544d, this.f24599I);
        if (z) {
            for (String next : stringsToList) {
                if (!Util.isNullOrNil(next) && Jx0.get(next).mo62927s3() && !s.equals(next) && !this.f24544d.contains(next)) {
                    this.f24544d.add(next);
                }
            }
        } else {
            for (String next2 : stringsToList) {
                if (!Util.isNullOrNil(next2) && Jx0.get(next2).mo62927s3() && !s.equals(next2) && this.f24544d.contains(next2)) {
                    this.f24544d.remove(next2);
                }
            }
        }
        if ((this.f24598H + " " + Util.listToString(this.f24544d, ",")).equals(this.f24599I) && this.f24597G != 0) {
            return false;
        }
        this.f24599I = this.f24598H + " " + Util.listToString(this.f24544d, ",");
        if (z) {
            this.f24563z = true;
        } else {
            this.f24540A = true;
        }
        C43040m0 m0Var = new C43040m0(3, this.f24597G, this.f24598H, this.f24544d.size(), this.f24544d, this.f24600J);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(m0Var);
        this.f24558u = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(z ? C0966R.string.f7435g7 : C0966R.string.f7439ga), true, false, new C6921b(m0Var));
        return true;
    }

    /* renamed from: a8 */
    public final boolean mo7941a8(boolean z, Intent intent) {
        ArrayList<String> stringsToList = Util.stringsToList(intent.getStringExtra("Select_Contact").split(","));
        if (stringsToList == null) {
            return false;
        }
        String s = C75592q0.m90789s();
        C44668u3 Jx0 = C94866e1.Jx0();
        if (z) {
            for (String next : stringsToList) {
                if (!Util.isNullOrNil(next) && Jx0.get(next).mo62927s3() && !s.equals(next) && !this.f24544d.contains(next)) {
                    this.f24544d.add(next);
                }
            }
        } else {
            for (String next2 : stringsToList) {
                if (!Util.isNullOrNil(next2) && Jx0.get(next2).mo62927s3() && !s.equals(next2) && this.f24544d.contains(next2)) {
                    this.f24544d.remove(next2);
                }
            }
        }
        String str = this.f24598H + " " + Util.listToString(this.f24544d, ",");
        if (str.equals(this.f24599I) && this.f24597G != 0) {
            return false;
        }
        String str2 = this.f24598H + " " + Util.listToString(this.f24544d, ",");
        this.f24599I = str2;
        Log.m105925i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp , md5: %s, tagList : %s, newMd5: %s, add : %s, memBerList: %s..", str2, this.f24544d, str, Boolean.valueOf(z), stringsToList);
        List<String> X7 = mo7938X7();
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> linkedList2 = new LinkedList<>();
        for (String next3 : X7) {
            if (!this.f24544d.contains(next3)) {
                linkedList.add(next3);
            }
        }
        for (String next4 : this.f24544d) {
            if (!X7.contains(next4)) {
                linkedList2.add(next4);
            }
        }
        if (z) {
            this.f24563z = true;
            C8606e eVar = this.f24543D;
            Context context = eVar.f27709a;
            eVar.f27710b = C76879j.m92723Q(context, context.getResources().getString(C0966R.string.a3h), eVar.f27709a.getResources().getString(C0966R.string.f7435g7), true, false, new C8610g(eVar));
        } else {
            this.f24540A = true;
            C8606e eVar2 = this.f24543D;
            Context context2 = eVar2.f27709a;
            eVar2.f27710b = C76879j.m92723Q(context2, context2.getResources().getString(C0966R.string.a3h), eVar2.f27709a.getResources().getString(C0966R.string.f7439ga), true, false, new C8611h(eVar2));
        }
        for (String e0 : linkedList) {
            C45628s0.m50771e0(e0, false);
        }
        for (String e05 : linkedList2) {
            C45628s0.m50771e0(e05, true);
        }
        mo7917U7();
        Log.m105925i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp  memBerList: %s, tagList : %s, md5: %s， delContact： %s, addContact: %s.", stringsToList, this.f24544d, this.f24599I, linkedList, linkedList2);
        return true;
    }

    /* renamed from: b8 */
    public final void mo7942b8() {
        Log.m105925i("MicroMsg.SnsTagDetailUI", "revertFailData , 1, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.f24599I, this.f24544d, Boolean.valueOf(this.f24540A), Boolean.valueOf(this.f24563z));
        if (this.f24540A && this.f24563z) {
            Log.m105924i("MicroMsg.SnsTagDetailUI", "revertFailData , error happen.");
        }
        C44668u3 Jx0 = C94866e1.Jx0();
        String s = C75592q0.m90789s();
        if (this.f24597G == 5) {
            if (this.f24540A) {
                this.f24540A = false;
                Iterator it = ((ArrayList) this.f24545e).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!Util.isNullOrNil(str) && Jx0.get(str).mo62927s3() && !s.equals(str) && !this.f24544d.contains(str)) {
                        this.f24544d.add(str);
                    }
                }
            }
            if (this.f24563z) {
                this.f24563z = false;
                ArrayList arrayList = new ArrayList();
                for (String next : this.f24544d) {
                    if (!Util.isNullOrNil(next) && Jx0.get(next).mo62927s3() && !s.equals(next) && !((ArrayList) this.f24545e).contains(next)) {
                        arrayList.add(next);
                    }
                }
                this.f24544d.removeAll(arrayList);
            }
            ((ArrayList) this.f24545e).clear();
            ((ArrayList) this.f24545e).addAll(this.f24544d);
            this.f24599I = this.f24598H + " " + Util.listToString(this.f24544d, ",");
        }
        Log.m105925i("MicroMsg.SnsTagDetailUI", "revertFailData , 2, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.f24599I, this.f24544d, Boolean.valueOf(this.f24540A), Boolean.valueOf(this.f24563z));
        mo7916T7();
    }

    public void onCreate(Bundle bundle) {
        this.f24597G = getIntent().getLongExtra("k_sns_tag_id", 0);
        this.f24600J = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.SnsTagDetailUI", "Base __onCreate");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C82086j.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C82088k.CTRL_INDEX, this);
        if (((ArrayList) C94866e1.ey0().mo11650Lo()).size() == 0) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C43039l0(1));
        }
        Log.m105925i("MicroMsg.SnsTagDetailUI", "onCreate snsTagId: %s, scene : %s.", Long.valueOf(this.f24597G), Integer.valueOf(this.f24600J));
        long j = this.f24597G;
        if (j == 4) {
            this.f24598H = getString(C0966R.string.hms);
        } else if (j == 5) {
            this.f24598H = getString(C0966R.string.hmr);
        } else {
            this.f24598H = C94866e1.ey0().mo11657qq(this.f24597G).field_tagName;
        }
        long j2 = this.f24597G;
        if (j2 == 4) {
            this.f24556s = getString(C0966R.string.hmh);
        } else if (j2 == 5) {
            this.f24556s = getString(C0966R.string.hmi);
        }
        if (this.f24597G == 0) {
            String stringExtra = getIntent().getStringExtra("k_sns_tag_list");
            this.f24598H = Util.nullAs(getIntent().getStringExtra("k_sns_tag_name"), "");
            C44668u3 Jx0 = C94866e1.Jx0();
            String s = C75592q0.m90789s();
            ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
            if (stringsToList != null) {
                for (String next : stringsToList) {
                    if (!Util.isNullOrNil(next) && !this.f24544d.contains(next) && Jx0.get(next).mo62927s3() && !s.equals(next)) {
                        this.f24544d.add(next);
                    }
                }
            }
        } else {
            this.f24544d = mo7938X7();
        }
        mo7939Y7();
        String str = this.f24598H;
        if (str == null || str.equals("")) {
            this.f24598H = getString(C0966R.string.ji8);
            this.f24598H = C94897n1.m120369g(getString(C0966R.string.ji8));
        }
        setBackBtn(new C6920a());
        if (this.f24597G == 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        this.f24599I = this.f24598H + " " + Util.listToString(this.f24544d, ",");
        mo7916T7();
    }

    public void onDestroy() {
        C89779i0 i0Var = this.f24558u;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f24543D.mo9468c();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82086j.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82088k.CTRL_INDEX, this);
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105924i("MicroMsg.SnsTagDetailUI", "onNotifyChange: event = " + i + " stg = " + mStorageEx + " obj = " + obj);
        if (this.f24597G == 4 && i == 4) {
            mo7917U7();
        }
        if (this.f24597G == 5 && i == 4) {
            mo7917U7();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        switch (yVar.getType()) {
            case C82086j.CTRL_INDEX /*290*/:
                finish();
                return;
            case 291:
                C89779i0 i0Var = this.f24558u;
                if (i0Var != null) {
                    i0Var.dismiss();
                    this.f24558u = null;
                }
                this.f24543D.mo9468c();
                if (yVar instanceof C43040m0) {
                    Log.m105925i("MicroMsg.SnsTagDetailUI", "onSceneEnd 1, md5: %s, tagList : %s.", this.f24599I, this.f24544d);
                    if (i == 0 && i2 == 0) {
                        String str2 = this.f24598H + " " + Util.listToString(this.f24544d, ",");
                        this.f24599I = str2;
                        Log.m105925i("MicroMsg.SnsTagDetailUI", "updateSuccessData , 1, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", str2, this.f24544d, Boolean.valueOf(this.f24540A), Boolean.valueOf(this.f24563z));
                        if (this.f24540A && this.f24563z) {
                            Log.m105924i("MicroMsg.SnsTagDetailUI", "updateSuccessData , error happen.");
                        }
                        C44668u3 Jx0 = C94866e1.Jx0();
                        String s = C75592q0.m90789s();
                        if (this.f24597G == 5) {
                            if (this.f24540A) {
                                this.f24540A = false;
                                Iterator it = ((ArrayList) this.f24545e).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    if (!Util.isNullOrNil(str3) && Jx0.get(str3).mo62927s3() && !s.equals(str3) && !this.f24544d.contains(str3)) {
                                        C45628s0.m50801t0(C97625j3.m125812b().mo105907v().get(str3));
                                    }
                                }
                            }
                            if (this.f24563z) {
                                this.f24563z = false;
                                ArrayList arrayList = new ArrayList();
                                for (String next : this.f24544d) {
                                    if (!Util.isNullOrNil(next) && Jx0.get(next).mo62927s3() && !s.equals(next) && !((ArrayList) this.f24545e).contains(next)) {
                                        arrayList.add(next);
                                        C45628s0.m50785l0(C97625j3.m125812b().mo105907v().get(next));
                                    }
                                }
                            }
                            ((ArrayList) this.f24545e).clear();
                            ((ArrayList) this.f24545e).addAll(this.f24544d);
                            this.f24599I = this.f24598H + " " + Util.listToString(this.f24544d, ",");
                        }
                        Log.m105925i("MicroMsg.SnsTagDetailUI", "updateSuccessData , 2, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.f24599I, this.f24544d, Boolean.valueOf(this.f24540A), Boolean.valueOf(this.f24563z));
                        mo7917U7();
                        mo7914R7();
                    } else {
                        mo7942b8();
                        mo7913Q7();
                    }
                    Log.m105925i("MicroMsg.SnsTagDetailUI", "onSceneEnd 2, md5: %s, tagList : %s.", this.f24599I, this.f24544d);
                    return;
                }
                return;
            case JsApiSetAudioState.CTRL_INDEX /*292*/:
                C89779i0 i0Var2 = this.f24558u;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                    this.f24558u = null;
                }
                this.f24543D.mo9468c();
                Log.m105925i("MicroMsg.SnsTagDetailUI", "onSceneEnd update form net 1, md5: %s, tagList : %s.", this.f24599I, this.f24544d);
                C43039l0 l0Var = (C43039l0) yVar;
                ArrayList arrayList2 = new ArrayList();
                if (!Util.isNullOrNil((List) l0Var.mo67231j1(this.f24597G))) {
                    for (int i3 = 0; i3 < ((LinkedList) l0Var.mo67231j1(this.f24597G)).size(); i3++) {
                        String str4 = (String) ((LinkedList) l0Var.mo67231j1(this.f24597G)).get(i3);
                        if (str4 != null) {
                            arrayList2.add(str4);
                        }
                    }
                }
                new LinkedList();
                List<String> list = this.f24544d;
                this.f24544d = mo7938X7();
                if (list != null) {
                    for (String next2 : list) {
                        if (!this.f24544d.contains(next2)) {
                            this.f24544d.add(next2);
                        }
                    }
                }
                mo7939Y7();
                this.f24599I = this.f24598H + " " + Util.listToString(this.f24544d, ",");
                mo7917U7();
                Log.m105925i("MicroMsg.SnsTagDetailUI", "onSceneEnd update form net 2, md5: %s, tagList : %s.", this.f24599I, this.f24544d);
                return;
            default:
                return;
        }
    }
}
