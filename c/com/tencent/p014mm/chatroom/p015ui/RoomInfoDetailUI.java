package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.preference.SignaturePreference;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import ke3.C88144b;
import nj3.C76879j;
import p154fy.C87121j;
import p629ny.C76979h;
import p818oi.C47380a;
import pj3.C47511g;
import tc0.C77885p;
import te3.C49351ey2;
import te3.C49487fy2;

@Deprecated
/* renamed from: com.tencent.mm.chatroom.ui.RoomInfoDetailUI */
public class RoomInfoDetailUI extends MMPreference implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public boolean f108138d;

    /* renamed from: e */
    public C47511g f108139e;

    /* renamed from: f */
    public String f108140f;

    /* renamed from: g */
    public int f108141g;

    /* renamed from: h */
    public C72996z1 f108142h;

    /* renamed from: i */
    public SignaturePreference f108143i;

    /* renamed from: j */
    public CheckBoxPreference f108144j;

    /* renamed from: n */
    public CheckBoxPreference f108145n;

    /* renamed from: o */
    public CheckBoxPreference f108146o;

    /* renamed from: p */
    public String f108147p;

    /* renamed from: q */
    public boolean f108148q = false;

    /* renamed from: r */
    public boolean f108149r = false;

    /* renamed from: com.tencent.mm.chatroom.ui.RoomInfoDetailUI$a */
    public class C40213a implements MenuItem.OnMenuItemClickListener {
        public C40213a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RoomInfoDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m43250H7(RoomInfoDetailUI roomInfoDetailUI, ProgressDialog progressDialog) {
        C75604z3.m90836h(roomInfoDetailUI.f108142h.getUsername(), new C40272v1(roomInfoDetailUI, progressDialog));
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(roomInfoDetailUI.f108142h.getUsername(), 15);
    }

    /* renamed from: I7 */
    public final boolean mo62754I7() {
        return (((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f108147p).field_chatroomdataflag & 2) == 0;
    }

    /* renamed from: J7 */
    public final void mo62755J7() {
        if (this.f108138d) {
            boolean z = false;
            SharedPreferences sharedPreferences = getSharedPreferences(this.f108140f, 0);
            int i = this.f108141g;
            if (i == 0) {
                setTitleMuteIconVisibility(0);
                CheckBoxPreference checkBoxPreference = this.f108144j;
                if (checkBoxPreference != null) {
                    checkBoxPreference.mo6805K(true);
                    sharedPreferences.edit().putBoolean("room_msg_notify", true).commit();
                }
                CheckBoxPreference checkBoxPreference2 = this.f108146o;
                if (checkBoxPreference2 != null) {
                    checkBoxPreference2.mo6805K(mo62754I7());
                }
            } else if (i == 1) {
                setTitleMuteIconVisibility(8);
                CheckBoxPreference checkBoxPreference3 = this.f108144j;
                if (checkBoxPreference3 != null) {
                    checkBoxPreference3.mo6805K(false);
                    sharedPreferences.edit().putBoolean("room_msg_notify", false).commit();
                }
            }
            C47511g gVar = this.f108139e;
            if (this.f108141g == 1) {
                z = true;
            }
            gVar.mo72529n("room_show_msg_count", z);
        }
    }

    /* renamed from: K7 */
    public final void mo62756K7() {
        if (this.f108142h != null && this.f108143i != null) {
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f108147p);
            String str = Lo == null ? "" : Lo.field_selfDisplayName;
            if (Util.isNullOrNil(str)) {
                str = C75592q0.m90783m();
            }
            if (!Util.isNullOrNil(str)) {
                SignaturePreference signaturePreference = this.f108143i;
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                if (str.length() <= 0) {
                    str = getString(C0966R.string.iyt);
                }
                signaturePreference.mo7741E(hVar.mo107057T1(this, str));
                return;
            }
            this.f108143i.mo7741E("");
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8932bp;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.i_7);
        this.f108139e = getPreferenceScreen();
        this.f108140f = getPackageName() + "_preferences";
        this.f108138d = getIntent().getBooleanExtra("Is_Chatroom", true);
        String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f108147p = stringExtra;
        if (stringExtra == null) {
            this.f108147p = getIntent().getStringExtra("Single_Chat_Talker");
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f108147p);
        this.f108142h = z1Var;
        if (this.f108138d) {
            this.f108141g = z1Var.f149512S;
            this.f108143i = (SignaturePreference) this.f108139e.mo72519a("room_name");
            this.f108144j = (CheckBoxPreference) this.f108139e.mo72519a("room_msg_notify");
            this.f108146o = (CheckBoxPreference) this.f108139e.mo72519a("room_show_msg_count");
            this.f108145n = (CheckBoxPreference) this.f108139e.mo72519a("room_msg_show_username");
            this.f108146o.f121290w = false;
        } else {
            this.f108141g = 1;
        }
        setBackBtn(new C40213a());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i != 1) {
                if (i == 2 && intent != null) {
                    String nullAs = Util.nullAs(intent.getStringExtra("Contact_Nick"), "");
                    Class cls = C39479c.class;
                    if (!Util.isNullOrNil(nullAs)) {
                        String s = C75592q0.m90789s();
                        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108147p);
                        if (Lo == null) {
                            Lo = new C44661m1();
                        }
                        Lo.field_chatroomname = this.f108147p;
                        Lo.field_selfDisplayName = nullAs;
                        ((C39479c) C86709a0.m107533q(cls)).mo62084mr().update(Lo, new String[0]);
                        C49351ey2 ey22 = new C49351ey2();
                        ey22.f133171d = this.f108147p;
                        ey22.f133172e = s;
                        ey22.f133173f = Util.nullAsNil(nullAs);
                        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(48, ey22));
                        mo62756K7();
                    }
                }
            } else if (i2 == -1) {
                setResult(-1);
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
    }

    public void onPause() {
        Class cls = C39479c.class;
        super.onPause();
        if (this.f108149r) {
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108147p);
            int i = 0;
            ((C39479c) C86709a0.m107533q(cls)).mo62084mr().update(Lo, new String[0]);
            String s = C75592q0.m90789s();
            if (Lo.field_isShowname > 0) {
                i = 1;
            }
            C49487fy2 fy22 = new C49487fy2();
            fy22.f133742d = this.f108147p;
            fy22.f133743e = s;
            fy22.f133744f = 1;
            fy22.f133745g = i;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(49, fy22));
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class cls = C39479c.class;
        Class cls2 = C75700k0.class;
        String str = preference.f121285r;
        int i = 1;
        Log.m105919d("MicroMsg.RoomInfoDetailUI", "click key : %s", str);
        if (str.equals("room_name")) {
            Intent intent = new Intent();
            intent.setClass(this, C74928u.C30868f.class);
            intent.putExtra("Contact_mode_name_type", 4);
            String s = C75592q0.m90789s();
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108147p);
            intent.putExtra("Contact_Nick", Lo == null ? "" : Lo.field_selfDisplayName);
            intent.putExtra("Contact_User", s);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            getContext().startActivityForResult(intent, 2);
        }
        if (str.equals("room_msg_show_username")) {
            C44661m1 Lo2 = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108147p);
            Lo2.field_isShowname = (Lo2.field_isShowname > 0 ? 1 : 0) ^ 1;
            this.f108149r = true;
        }
        if (str.equals("room_msg_notify")) {
            this.f108141g = this.f108141g == 0 ? 1 : 0;
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls2)).mo96100XW()).mo107993q(new C47380a(this.f108147p, this.f108141g));
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(this.f108147p);
            this.f108142h = z1Var;
            z1Var.mo62861K3(this.f108141g);
            ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69719p3(this.f108147p, this.f108142h);
            mo62755J7();
            this.f108142h = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(this.f108147p);
            this.f108139e.notifyDataSetChanged();
        }
        if (str.equals("room_set_chatting_background")) {
            Intent intent2 = new Intent();
            intent2.putExtra("isApplyToAll", false);
            intent2.putExtra("username", this.f108142h.getUsername());
            C88144b.m109795m(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", intent2, 1);
        }
        if (str.equals("room_clear_chatting_history")) {
            C76879j.m92736g(this, this.f108138d ? getString(C0966R.string.eyn) : getString(C0966R.string.eym, new Object[]{this.f108142h.mo62898f()}), new String[]{getString(C0966R.string.f361210i60)}, (String) null, new C40268u1(this));
        }
        if (str.equals("room_placed_to_the_top")) {
            SharedPreferences sharedPreferences = getSharedPreferences(this.f108140f, 0);
            if (this.f108142h != null) {
                if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69755a0(this.f108142h.getUsername())) {
                    C45628s0.m50803u0(this.f108142h.getUsername(), true);
                } else {
                    C45628s0.m50787m0(this.f108142h.getUsername(), true, true);
                }
                sharedPreferences.edit().putBoolean("room_placed_to_the_top", ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69755a0(this.f108142h.getUsername())).commit();
            }
        }
        if ("room_show_msg_count".equals(str)) {
            boolean I7 = mo62754I7();
            Log.m105919d("MicroMsg.RoomInfoDetailUI", "old value undeliver[%B], now set show msg count[%B]", Boolean.valueOf(I7), Boolean.valueOf(I7));
            boolean z = !I7;
            C44661m1 Lo3 = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108147p);
            if (z) {
                if (Lo3.mo69794v2(Lo3.f121084u1)) {
                    Lo3.mo69784l2();
                }
                Lo3.field_chatroomdataflag = (Lo3.f121084u1.f106336e & -3) | 0;
            } else {
                if (Lo3.mo69794v2(Lo3.f121084u1)) {
                    Lo3.mo69784l2();
                }
                Lo3.field_chatroomdataflag = (Lo3.f121084u1.f106336e & -3) | 2;
            }
            Log.m105919d("MicroMsg.RoomInfoDetailUI", "update show msg count[%B]", Boolean.valueOf(z));
            ((C39479c) C86709a0.m107533q(cls)).mo62084mr().update(Lo3, new String[0]);
            String s2 = C75592q0.m90789s();
            C49487fy2 fy22 = new C49487fy2();
            fy22.f133742d = this.f108147p;
            fy22.f133743e = s2;
            fy22.f133744f = 2;
            if (z) {
                i = 2;
            }
            fy22.f133745g = i;
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls2)).mo96100XW()).mo107993q(new C32330n(49, fy22));
            CheckBoxPreference checkBoxPreference = this.f108146o;
            if (checkBoxPreference != null) {
                checkBoxPreference.mo6805K(z);
            }
            this.f108139e.notifyDataSetChanged();
        }
        return false;
    }

    public void onResume() {
        super.onResume();
        mo62755J7();
        mo62756K7();
        if (!(this.f108142h == null || this.f108145n == null)) {
            C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f108147p);
            SharedPreferences sharedPreferences = getSharedPreferences(this.f108140f, 0);
            if (SE.field_isShowname > 0) {
                this.f108145n.mo6805K(true);
                sharedPreferences.edit().putBoolean("room_msg_show_username", true).commit();
            } else {
                this.f108145n.mo6805K(false);
                sharedPreferences.edit().putBoolean("room_msg_show_username", false).commit();
            }
        }
        this.f108139e.notifyDataSetChanged();
    }
}
