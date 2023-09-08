package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.p136ui.C44701a2;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.NormalIconPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ke3.C88144b;
import p196ln.C76705f;
import p629ny.C76979h;
import pj3.C47511g;

/* renamed from: com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI */
public class SeeRoomOwnerManagerUI extends MMPreference {

    /* renamed from: d */
    public C44661m1 f108198d;

    /* renamed from: e */
    public String f108199e;

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI$a */
    public class C40233a extends C44701a2 {
        public C40233a() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            SeeRoomOwnerManagerUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI$b */
    public class C40234b extends NormalIconPreference {

        /* renamed from: l1 */
        public final /* synthetic */ C72996z1 f108201l1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40234b(SeeRoomOwnerManagerUI seeRoomOwnerManagerUI, Context context, C72996z1 z1Var) {
            super(context);
            this.f108201l1 = z1Var;
        }

        /* renamed from: w */
        public void mo1086w(View view) {
            super.mo1086w(view);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f215074Z0, this.f108201l1.getUsername(), 0.15f);
            this.f215074Z0.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI$c */
    public class C40235c extends NormalIconPreference {

        /* renamed from: l1 */
        public final /* synthetic */ C72996z1 f108202l1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40235c(SeeRoomOwnerManagerUI seeRoomOwnerManagerUI, Context context, C72996z1 z1Var) {
            super(context);
            this.f108202l1 = z1Var;
        }

        /* renamed from: w */
        public void mo1086w(View view) {
            super.mo1086w(view);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f215074Z0, this.f108202l1.getUsername(), 0.15f);
            this.f215074Z0.setVisibility(0);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8938bu;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C76979h.class;
        Class cls2 = C75700k0.class;
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.i79);
        setBackBtn(new C40233a());
        this.f108199e = getIntent().getStringExtra("RoomInfo_Id");
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(Util.nullAsNil(this.f108199e));
        this.f108198d = Lo;
        if (Lo != null) {
            PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(getContext(), (AttributeSet) null);
            preferenceTitleCategory.mo69923G(C0966R.string.i_2);
            getPreferenceScreen().mo72527k(preferenceTitleCategory);
            Log.m105925i("MicroMsg.SeeRoomOwnerManagerUI", "[onCreate] owner:%s", this.f108198d.field_roomowner);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(this.f108198d.field_roomowner);
            C40234b bVar = new C40234b(this, getContext(), z1Var);
            bVar.mo26273A(z1Var.getUsername());
            bVar.mo69925c().putString("username", z1Var.getUsername());
            bVar.mo69924H(((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), z1Var.mo62898f()));
            getPreferenceScreen().mo72527k(bVar);
            PreferenceTitleCategory preferenceTitleCategory2 = new PreferenceTitleCategory(getContext(), (AttributeSet) null);
            preferenceTitleCategory2.mo69923G(C0966R.string.i7d);
            boolean z = false;
            for (String next : this.f108198d.mo69790r2()) {
                if (this.f108198d.mo69793u2(next)) {
                    Log.m105925i("MicroMsg.SeeRoomOwnerManagerUI", "[resetData] Room Manager:%s", next);
                    if (!z) {
                        getPreferenceScreen().mo72527k(preferenceTitleCategory2);
                        z = true;
                    }
                    C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(next);
                    C40235c cVar = new C40235c(this, getContext(), z1Var2);
                    cVar.mo26273A(next);
                    cVar.mo69925c().putString("username", z1Var2.getUsername());
                    cVar.mo69924H(((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), z1Var2.mo62898f()));
                    getPreferenceScreen().mo72527k(cVar);
                }
            }
            getPreferenceScreen().notifyDataSetChanged();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C44673z4 Lo;
        Class cls = C75700k0.class;
        if (!(preference instanceof NormalIconPreference)) {
            return false;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(preference.mo69925c().getString("username"));
        String username = z1Var.getUsername();
        String f = z1Var.mo62898f();
        String nickname = z1Var.getNickname();
        if (Util.isNullOrNil(f) && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(username)) != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
            f = Lo.field_conRemark;
        }
        if (Util.isNullOrNil(username)) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_RemarkName", f);
        C44661m1 m1Var = this.f108198d;
        if (m1Var != null) {
            intent.putExtra("Contact_RoomNickname", m1Var.mo69789q2(username));
        }
        intent.putExtra("Contact_Nick", nickname);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", this.f108199e);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(username);
        if (z1Var2 != null && ((int) z1Var2.f108320R1) > 0 && z1Var2.mo62927s3()) {
            SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
            SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
            aVar.f9503a = intent;
            aVar.f9504b = username;
            setLocalQQMobileEvent.publish();
        }
        if (z1Var2 != null && z1Var2.mo62916m3()) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.kvStat(10298, z1Var2.getUsername() + "," + 14);
        }
        intent.putExtra("Contact_Scene", 96);
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", this.f108199e);
        C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        return false;
    }
}
