package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.ModRemarkNameUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.sns.model.C43039l0;
import com.tencent.p014mm.plugin.sns.model.C43040m0;
import com.tencent.p014mm.plugin.sns.model.C43041n0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44668u3;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11765l0;
import p214om.C11502f;
import p609mp.C76802a;
import p609mp.C76803c;
import pj3.C47511g;
import qo3.C89779i0;
import qy2.C77448f0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI */
public class SnsTagDetailUI extends MMPreference implements C11385n, MStorageEx.IOnStorageChange {

    /* renamed from: q */
    public static final /* synthetic */ int f21197q = 0;

    /* renamed from: d */
    public C89779i0 f21198d = null;

    /* renamed from: e */
    public C47511g f21199e;

    /* renamed from: f */
    public ContactListExpandPreference f21200f;

    /* renamed from: g */
    public List<String> f21201g = new ArrayList();

    /* renamed from: h */
    public long f21202h;

    /* renamed from: i */
    public String f21203i = "";

    /* renamed from: j */
    public String f21204j = "";

    /* renamed from: n */
    public boolean f21205n = false;

    /* renamed from: o */
    public int f21206o = 0;

    /* renamed from: p */
    public ContactListExpandPreference.C72740a f21207p = new C5459h();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$a */
    public class C5451a implements DialogInterface.OnClickListener {
        public C5451a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$1");
            SnsTagDetailUI.this.mo6448M7();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$b */
    public class C5452b implements DialogInterface.OnClickListener {
        public C5452b(SnsTagDetailUI snsTagDetailUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$2");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$c */
    public class C5453c implements DialogInterface.OnCancelListener {
        public C5453c(SnsTagDetailUI snsTagDetailUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$3");
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$d */
    public class C5454d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$d$a */
        public class C5455a implements DialogInterface.OnClickListener {
            public C5455a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5$1");
                SnsTagDetailUI.this.finish();
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5$1");
            }
        }

        public C5454d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
            if ((SnsTagDetailUI.this.f21203i + " " + Util.listToString(SnsTagDetailUI.this.f21201g, ",")).equals(SnsTagDetailUI.this.f21204j)) {
                SnsTagDetailUI snsTagDetailUI = SnsTagDetailUI.this;
                if (snsTagDetailUI.f21202h != 0) {
                    snsTagDetailUI.finish();
                    SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
                    return true;
                }
            }
            C76879j.m92743n(SnsTagDetailUI.this, C0966R.string.jhr, C0966R.string.a3h, new C5455a(), (DialogInterface.OnClickListener) null);
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$e */
    public class C5456e implements MenuItem.OnMenuItemClickListener {
        public C5456e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$6");
            SnsTagDetailUI.this.mo6445J7();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$6");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$f */
    public class C5457f implements DialogInterface.OnClickListener {
        public C5457f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$7");
            SnsTagDetailUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$g */
    public class C5458g implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C43040m0 f21213d;

        public C5458g(SnsTagDetailUI snsTagDetailUI, C43040m0 m0Var) {
            this.f21213d = m0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$8");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f21213d);
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$h */
    public class C5459h implements ContactListExpandPreference.C72740a {
        public C5459h() {
        }

        /* renamed from: a */
        public void mo5953a(ViewGroup viewGroup, View view, int i) {
            SnsMethodCalculate.markStartTimeMs("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
            String c = C76802a.m92581c(SnsTagDetailUI.this.f21200f, i);
            Log.m105918d("MicroMsg.SnsTagDetailUI", "roomPref del " + i + " userName : " + c);
            C86709a0.m107528h();
            if (Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), "").equals(c)) {
                C76879j.m92738i(SnsTagDetailUI.this.getContext(), C0966R.string.i6o, C0966R.string.a3h);
                SnsMethodCalculate.markEndTimeMs("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
                return;
            }
            SnsTagDetailUI.this.mo6446K7(c);
            if ((SnsTagDetailUI.this.f21203i + " " + Util.listToString(SnsTagDetailUI.this.f21201g, ",")).equals(SnsTagDetailUI.this.f21204j)) {
                SnsTagDetailUI snsTagDetailUI = SnsTagDetailUI.this;
                if (snsTagDetailUI.f21202h != 0) {
                    snsTagDetailUI.enableOptionMenu(false);
                    SnsMethodCalculate.markEndTimeMs("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
                }
            }
            SnsTagDetailUI.this.enableOptionMenu(true);
            SnsMethodCalculate.markEndTimeMs("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        }

        /* renamed from: b */
        public void mo5954b(ViewGroup viewGroup, View view, int i) {
            SnsMethodCalculate.markStartTimeMs("onItemMoreClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
            SnsMethodCalculate.markEndTimeMs("onItemMoreClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        }

        /* renamed from: c */
        public void mo5955c(ViewGroup viewGroup, View view, int i) {
            SnsMethodCalculate.markStartTimeMs("onItemAddClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
            Log.m105918d("MicroMsg.SnsTagDetailUI", "roomPref add " + i);
            SnsTagDetailUI snsTagDetailUI = SnsTagDetailUI.this;
            int i2 = SnsTagDetailUI.f21197q;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            snsTagDetailUI.getClass();
            SnsMethodCalculate.markStartTimeMs("dealAddMemberBtn", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            String listToString = Util.listToString(snsTagDetailUI.f21201g, ",");
            Intent intent = new Intent();
            intent.putExtra("titile", snsTagDetailUI.getString(C0966R.string.f7496hv));
            intent.putExtra("list_type", 1);
            intent.putExtra("KBlockOpenImFav", true);
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219162c, 1024) & -16777217);
            intent.putExtra("always_select_contact", listToString);
            C88144b.m109802t(snsTagDetailUI, ".ui.contact.SelectContactUI", intent, 1);
            SnsMethodCalculate.markEndTimeMs("dealAddMemberBtn", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            SnsMethodCalculate.markEndTimeMs("onItemAddClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        }

        /* renamed from: d */
        public void mo5956d(ViewGroup viewGroup, View view, int i) {
            SnsMethodCalculate.markStartTimeMs("onItemCancelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
            ContactListExpandPreference contactListExpandPreference = SnsTagDetailUI.this.f21200f;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.mo100300J();
            }
            SnsMethodCalculate.markEndTimeMs("onItemCancelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        }

        /* renamed from: e */
        public void mo5957e(ViewGroup viewGroup, View view, int i) {
            SnsMethodCalculate.markStartTimeMs("onItemNormalClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
            String c = C76802a.m92581c(SnsTagDetailUI.this.f21200f, i);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", c);
            long j = SnsTagDetailUI.this.f21202h;
            if (j == 4) {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 18);
            } else if (j == 5) {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 19);
            }
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, SnsTagDetailUI.this);
            SnsMethodCalculate.markEndTimeMs("onItemNormalClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        }
    }

    /* renamed from: H7 */
    public void mo6443H7(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        Log.m105918d("MicroMsg.SnsTagDetailUI", "Base __onCreate");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C82086j.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C82088k.CTRL_INDEX, this);
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        if (((ArrayList) C94866e1.ey0().mo11650Lo()).size() == 0) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C43039l0(1));
            this.f21205n = true;
        }
        SnsMethodCalculate.markEndTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    /* renamed from: I7 */
    public void mo6444I7() {
        SnsMethodCalculate.markStartTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        Log.m105918d("MicroMsg.SnsTagDetailUI", "Base __onDestroy");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82086j.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82088k.CTRL_INDEX, this);
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107528h();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        }
        SnsMethodCalculate.markEndTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    /* renamed from: J7 */
    public void mo6445J7() {
        SnsMethodCalculate.markStartTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if ((this.f21203i + " " + Util.listToString(this.f21201g, ",")).equals(this.f21204j) && this.f21202h != 0) {
            finish();
            SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        } else if (C94866e1.ey0().mo11656kD(this.f21202h, this.f21203i)) {
            C76879j.m92748s(this, getString(C0966R.string.jhw, new Object[]{this.f21203i}), getString(C0966R.string.a3h));
            SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        } else {
            C43040m0 m0Var = new C43040m0(3, this.f21202h, this.f21203i, this.f21201g.size(), this.f21201g, this.f21206o);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(m0Var);
            this.f21198d = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.jig), true, true, new C5458g(this, m0Var));
            SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        }
    }

    /* renamed from: K7 */
    public void mo6446K7(String str) {
        ContactListExpandPreference contactListExpandPreference;
        SnsMethodCalculate.markStartTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (str == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return;
        }
        this.f21201g.remove(str);
        ContactListExpandPreference contactListExpandPreference2 = this.f21200f;
        if (contactListExpandPreference2 != null) {
            contactListExpandPreference2.mo100303M(this.f21201g);
            this.f21200f.mo69931v();
        }
        if (this.f21201g.size() != 0 || (contactListExpandPreference = this.f21200f) == null) {
            ContactListExpandPreference contactListExpandPreference3 = this.f21200f;
            if (contactListExpandPreference3 != null) {
                contactListExpandPreference3.mo100304N(true);
                contactListExpandPreference3.mo100305P(true);
            }
        } else {
            contactListExpandPreference.mo100300J();
            ContactListExpandPreference contactListExpandPreference4 = this.f21200f;
            contactListExpandPreference4.mo100304N(true);
            contactListExpandPreference4.mo100305P(false);
            this.f21199e.notifyDataSetChanged();
        }
        mo6455P7();
        SnsMethodCalculate.markEndTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    /* renamed from: L7 */
    public void mo6447L7(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        C44668u3 Jx0 = C94866e1.Jx0();
        String s = C75592q0.m90789s();
        for (String next : list) {
            if (!this.f21201g.contains(next) && Jx0.get(next) != null && Jx0.get(next).mo62927s3() && !s.equals(next)) {
                this.f21201g.add(next);
            }
        }
        ContactListExpandPreference contactListExpandPreference = this.f21200f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.mo100303M(this.f21201g);
            this.f21200f.mo69931v();
        }
        if (this.f21201g.size() > 0) {
            ContactListExpandPreference contactListExpandPreference2 = this.f21200f;
            contactListExpandPreference2.mo100304N(true);
            contactListExpandPreference2.mo100305P(true);
        } else {
            ContactListExpandPreference contactListExpandPreference3 = this.f21200f;
            contactListExpandPreference3.mo100304N(true);
            contactListExpandPreference3.mo100305P(false);
        }
        mo6455P7();
        SnsMethodCalculate.markEndTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    /* renamed from: M7 */
    public void mo6448M7() {
        SnsMethodCalculate.markStartTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (this.f21202h != 0) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C43041n0(3, this.f21202h, this.f21203i));
        }
        this.f21198d = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.jig), true, true, new C5453c(this));
        SnsMethodCalculate.markEndTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    /* renamed from: N7 */
    public List<String> mo6449N7() {
        SnsMethodCalculate.markStartTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        List<String> linkedList = new LinkedList<>();
        C11765l0 qq = C94866e1.ey0().mo11657qq(this.f21202h);
        String str = qq.field_memberList;
        if (str != null && !str.equals("")) {
            linkedList = Util.stringsToList(qq.field_memberList.split(","));
        }
        SnsMethodCalculate.markEndTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return linkedList;
    }

    /* renamed from: O7 */
    public final void mo6454O7() {
        SnsMethodCalculate.markStartTimeMs("updateTagName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        Preference a = this.f21199e.mo72519a("settings_tag_name");
        if (a != null) {
            if (this.f21203i.length() > 20) {
                this.f21203i = this.f21203i.substring(0, 20);
            }
            a.mo7741E(this.f21203i);
            this.f21199e.notifyDataSetChanged();
        }
        SnsMethodCalculate.markEndTimeMs("updateTagName", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    /* renamed from: P7 */
    public void mo6455P7() {
        SnsMethodCalculate.markStartTimeMs("updateTitle", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        setMMTitle(this.f21203i + "(" + this.f21201g.size() + ")");
        SnsMethodCalculate.markEndTimeMs("updateTitle", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            if (!(this.f21203i + " " + Util.listToString(this.f21201g, ",")).equals(this.f21204j) || this.f21202h == 0) {
                C76879j.m92743n(this, C0966R.string.jhr, C0966R.string.a3h, new C5457f(), (DialogInterface.OnClickListener) null);
            } else {
                finish();
            }
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return dispatchKeyEvent;
    }

    public int getResourceId() {
        SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return C0966R.xml.f8978d1;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        this.f21199e = getPreferenceScreen();
        SnsMethodCalculate.markStartTimeMs("__initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        ContactListExpandPreference contactListExpandPreference = (ContactListExpandPreference) this.f21199e.mo72519a("roominfo_contact_anchor");
        this.f21200f = contactListExpandPreference;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.mo100302L(this.f21199e, contactListExpandPreference.f121285r);
            ContactListExpandPreference contactListExpandPreference2 = this.f21200f;
            contactListExpandPreference2.mo100304N(true);
            contactListExpandPreference2.mo100305P(true);
            this.f21200f.mo100301K((String) null, this.f21201g);
            ContactListExpandPreference contactListExpandPreference3 = this.f21200f;
            C5478h6 h6Var = new C5478h6(this);
            C76803c cVar = contactListExpandPreference3.f211662K;
            if (cVar != null) {
                ((C72741a) cVar).f211671h = h6Var;
            }
            contactListExpandPreference3.mo100307S(this.f21207p);
        }
        if (C77448f0.m93394f()) {
            PreferenceTitleCategory preferenceTitleCategory = (PreferenceTitleCategory) this.f21199e.mo72519a("outside");
            if (preferenceTitleCategory != null) {
                preferenceTitleCategory.mo69923G(C0966R.string.ji7);
            }
            PreferenceTitleCategory preferenceTitleCategory2 = (PreferenceTitleCategory) this.f21199e.mo72519a("black");
            if (preferenceTitleCategory2 != null) {
                preferenceTitleCategory2.mo69923G(C0966R.string.ji5);
            }
        }
        SnsMethodCalculate.markEndTimeMs("__initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        setBackBtn(new C5454d());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C5456e(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return;
        }
        if (i != 1) {
            if (i != 2) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            String stringExtra = intent.getStringExtra("k_sns_tag_name");
            if (stringExtra != null) {
                this.f21203i = stringExtra;
            }
            mo6455P7();
            Log.m105918d("MicroMsg.SnsTagDetailUI", "updateName " + this.f21203i);
        } else if (intent == null) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            return;
        } else {
            String stringExtra2 = intent.getStringExtra("Select_Contact");
            SnsMethodCalculate.markStartTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
            if (Util.nullAsNil(C75592q0.m90789s()).equals(stringExtra2)) {
                SnsMethodCalculate.markEndTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                z = true;
            } else {
                List<String> list = this.f21201g;
                if (list == null) {
                    SnsMethodCalculate.markEndTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                    z = false;
                } else {
                    z = false;
                    for (String equals : list) {
                        if (equals.equals(stringExtra2)) {
                            z = true;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("isContactExit", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                }
            }
            if (z) {
                C76879j.m92748s(this, getString(C0966R.string.f7396f3, new Object[]{0, 0}), getString(C0966R.string.a3h));
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            ArrayList<String> stringsToList = Util.stringsToList(stringExtra2.split(","));
            if (stringsToList == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
                return;
            }
            mo6447L7(stringsToList);
        }
        if (!(this.f21203i + " " + Util.listToString(this.f21201g, ",")).equals(this.f21204j) || this.f21202h == 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onCreate(bundle);
        mo6443H7(bundle);
        this.f21206o = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
        long longExtra = getIntent().getLongExtra("k_sns_tag_id", 0);
        this.f21202h = longExtra;
        if (longExtra == 4) {
            this.f21203i = getString(C0966R.string.ji9);
        } else if (longExtra == 5) {
            this.f21203i = getString(C0966R.string.jik);
        } else {
            this.f21203i = C94866e1.ey0().mo11657qq(this.f21202h).field_tagName;
        }
        if (this.f21202h == 0) {
            String stringExtra = getIntent().getStringExtra("k_sns_tag_list");
            this.f21203i = Util.nullAs(getIntent().getStringExtra("k_sns_tag_name"), "");
            C44668u3 Jx0 = C94866e1.Jx0();
            String s = C75592q0.m90789s();
            ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
            if (stringsToList != null) {
                for (String next : stringsToList) {
                    if (!this.f21201g.contains(next) && Jx0.get(next).mo62927s3() && !s.equals(next)) {
                        this.f21201g.add(next);
                    }
                }
            }
        } else {
            this.f21201g = mo6449N7();
        }
        String str = this.f21203i;
        if (str == null || str.equals("")) {
            this.f21203i = getString(C0966R.string.ji8);
            this.f21203i = C94897n1.m120369g(getString(C0966R.string.ji8));
        }
        initView();
        mo6454O7();
        mo6455P7();
        if (this.f21202h < 6) {
            this.f21199e.mo72531o("delete_tag_name");
            this.f21199e.mo72531o("delete_tag_name_category");
            if (this.f21202h > 0) {
                this.f21199e.mo72531o("settings_tag_name");
                this.f21199e.mo72531o("settings_tag_name_category");
            }
        }
        long j = this.f21202h;
        if (j == 4) {
            this.f21199e.mo72531o("black");
            this.f21199e.mo72531o("group");
        } else if (j == 5) {
            this.f21199e.mo72531o("outside");
            this.f21199e.mo72531o("group");
        } else {
            this.f21199e.mo72531o("black");
            this.f21199e.mo72531o("outside");
        }
        if (this.f21202h == 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        this.f21204j = this.f21203i + " " + Util.listToString(this.f21201g, ",");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        ContactListExpandPreference contactListExpandPreference = this.f21200f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        C89779i0 i0Var = this.f21198d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        mo6444I7();
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        String str = preference.f121285r;
        if (str.equals("settings_tag_name")) {
            long j = this.f21202h;
            if (j >= 6 || j == 0) {
                Intent intent = new Intent();
                intent.putExtra("Contact_mode_name_type", 3);
                intent.putExtra("Contact_Nick", Util.nullAs(this.f21203i, " "));
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).getClass();
                intent.setClass(this, ModRemarkNameUI.class);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(2);
                aVar.mo10233c(intent);
                C117292a.m165364j(this, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startRemarkUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
        if (str.equals("delete_tag_name")) {
            C76879j.m92743n(this, C0966R.string.imf, C0966R.string.a3h, new C5451a(), new C5452b(this));
        }
        SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        return false;
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        super.onResume();
        mo6454O7();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        Log.m105924i("MicroMsg.SnsTagDetailUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C89779i0 i0Var = this.f21198d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        switch (yVar.getType()) {
            case C82086j.CTRL_INDEX /*290*/:
                finish();
                break;
            case 291:
                finish();
                break;
            case JsApiSetAudioState.CTRL_INDEX /*292*/:
                if (this.f21200f != null && this.f21205n && !(this instanceof SnsBlackDetailUI)) {
                    Log.m105918d("MicroMsg.SnsTagDetailUI", "update form net");
                    C43039l0 l0Var = (C43039l0) yVar;
                    ArrayList arrayList = new ArrayList();
                    if (!Util.isNullOrNil((List) l0Var.mo67231j1(this.f21202h))) {
                        for (int i3 = 0; i3 < ((LinkedList) l0Var.mo67231j1(this.f21202h)).size(); i3++) {
                            String str2 = (String) ((LinkedList) l0Var.mo67231j1(this.f21202h)).get(i3);
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                    }
                    this.f21204j = this.f21203i + " " + Util.listToString(arrayList, ",");
                    new LinkedList();
                    List<String> list = this.f21201g;
                    this.f21201g = mo6449N7();
                    if (list != null) {
                        for (String next : list) {
                            if (!this.f21201g.contains(next)) {
                                this.f21201g.add(next);
                            }
                        }
                    }
                    this.f21200f.mo100303M(this.f21201g);
                    this.f21200f.mo69931v();
                    break;
                }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
    }
}
