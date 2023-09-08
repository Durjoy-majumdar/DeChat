package a13;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import nj3.C76879j;
import pj3.C47511g;
import t03.C22426h;
import t83.C13841a;
import tc0.C77885p;
import te3.C48993ce3;
import te3.C64266br1;

/* renamed from: a13.a */
public class C66988a implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public Context f192449d;

    /* renamed from: e */
    public C72996z1 f192450e;

    /* renamed from: f */
    public C47511g f192451f;

    /* renamed from: g */
    public CheckBoxPreference f192452g;

    /* renamed from: a13.a$a */
    public class C66989a implements DialogInterface.OnClickListener {
        public C66989a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C66988a.this.mo90952a(false);
        }
    }

    public C66988a(Context context) {
        this.f192449d = context;
    }

    /* renamed from: a */
    public final void mo90952a(boolean z) {
        Class cls = C75700k0.class;
        int o = C75592q0.m90785o();
        C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(z ? o & -67108865 : o | 67108864));
        C48993ce3 ce32 = new C48993ce3();
        ce32.f131680d = 67108864;
        ce32.f131681e = z ^ true ? 1 : 0;
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(39, ce32));
        mo90953b();
        if (!z) {
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f("topstoryapp");
        } else if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("topstoryapp") == null) {
            C72976h2 h2Var = new C72976h2();
            h2Var.setUsername("topstoryapp");
            h2Var.mo108792M2(this.f192449d.getString(C0966R.string.bsr));
            h2Var.mo108793N2(Util.nowMilliSecond());
            h2Var.mo108803Y2(0);
            h2Var.mo108812g3(0);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var);
        }
    }

    /* renamed from: b */
    public final void mo90953b() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f192451f.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f192450e.getUsername(), this.f192450e.mo62898f(), this.f192449d.getString(C0966R.string.bsr));
        if ((C75592q0.m90785o() & 67108864) == 0) {
            helperHeaderPreference.mo7601J(1);
            this.f192451f.mo72529n("contact_info_top_story_install", true);
            this.f192451f.mo72529n("contact_info_top_story_uninstall", false);
            this.f192451f.mo72529n("contact_info_go_to_top_story", false);
            this.f192451f.mo72529n("contact_info_top_story_not_disturb", false);
        } else {
            helperHeaderPreference.mo7601J(0);
            this.f192451f.mo72529n("contact_info_top_story_install", false);
            this.f192451f.mo72529n("contact_info_top_story_uninstall", true);
            this.f192451f.mo72529n("contact_info_go_to_top_story", true);
            this.f192451f.mo72529n("contact_info_top_story_not_disturb", true);
        }
        if ((C75592q0.m90786p() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0) {
            this.f192452g.mo6805K(true);
        } else {
            this.f192452g.mo6805K(false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C86709a0.m107535s().mo121142i().remove(this);
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        if (mStorageEx == C86709a0.m107535s().mo121142i() && nullAsInt > 0) {
            if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 7) {
                mo90953b();
            }
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        this.f192451f = gVar;
        this.f192450e = z1Var;
        gVar.mo72520b(C0966R.xml.f8880a9);
        C86709a0.m107535s().mo121142i().add(this);
        this.f192452g = (CheckBoxPreference) gVar.mo72519a("contact_info_top_story_not_disturb");
        mo90953b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        if ("contact_info_go_to_top_story".equals(str)) {
            C22426h.m26109k(this.f192449d, 0, (Bundle) null, "", (C13841a) null);
        } else {
            int i = 1;
            if ("contact_info_top_story_install".equals(str)) {
                mo90952a(true);
            } else if ("contact_info_top_story_uninstall".equals(str)) {
                Context context = this.f192449d;
                C76879j.m92707A(context, context.getString(C0966R.string.iwz), "", this.f192449d.getString(C0966R.string.f7930wk), this.f192449d.getString(C0966R.string.f7926wf), new C66989a(), (DialogInterface.OnClickListener) null);
            } else if ("contact_info_top_story_not_disturb".equals(str)) {
                int p = C75592q0.m90786p();
                C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(this.f192452g.mo6804J() ? p & -16777217 : p | TPMediaCodecProfileLevel.HEVCMainTierLevel62));
                C64266br1 br12 = new C64266br1();
                br12.f182324d = 55;
                if (this.f192452g.mo6804J()) {
                    i = 2;
                }
                br12.f182325e = i;
                ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(55, br12));
            }
        }
        return false;
    }
}
