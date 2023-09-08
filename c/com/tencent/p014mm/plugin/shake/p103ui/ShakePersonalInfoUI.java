package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C97625j3;
import f12.C7970a;
import f40.C86709a0;
import j20.C117292a;
import jn2.C21268a;
import k11.v$$e;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76912y0;
import p140cw.C7138g;
import p214om.C11502f;
import pj3.C47511g;
import qc0.C77328l;
import qo3.C101218e0;
import qo3.C77407n;
import sf0.C90188n0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI */
public class ShakePersonalInfoUI extends MMPreference {

    /* renamed from: e */
    public static final /* synthetic */ int f21103e = 0;

    /* renamed from: d */
    public C47511g f21104d;

    public int getResourceId() {
        return C0966R.xml.f8972ct;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.j4g);
        C47511g preferenceScreen = getPreferenceScreen();
        this.f21104d = preferenceScreen;
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceScreen.mo72519a("shake_item_sound");
        if (C97625j3.m125812b().mo105906u().mo119684e(4112, (Object) null) == null) {
            C97625j3.m125812b().mo105906u().mo119676J(4112, Boolean.TRUE);
        }
        checkBoxPreference.mo6805K(Util.nullAsTrue((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4112, (Object) null)));
        setBackBtn(new ShakePersonalInfoUI$$e(this));
        if (!C77328l.m93194c()) {
            this.f21104d.mo72531o("shake_item_shake_music_list");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 2 && intent != null) {
                String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                C97625j3.m125812b().mo105906u().mo119676J(4110, Boolean.FALSE);
                C97625j3.m125812b().mo105906u().mo119676J(4111, stringExtra);
                C76912y0.m92769h(this, C76577a.m92166q(getContext(), C0966R.string.j5k), C0966R.raw.icons_filled_done);
            }
        } else if (intent != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("CropImageMode", 4);
            intent2.putExtra("CropImage_Filter", true);
            intent2.putExtra("CropImage_DirectlyIntoFilter", true);
            StringBuilder sb = new StringBuilder();
            C97625j3.m125812b().getClass();
            sb.append(C7970a.m8127a());
            sb.append("custom_shake_img_filename.jpg");
            intent2.putExtra("CropImage_OutputPath", sb.toString());
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93180m(intent2, 2, this, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if ("shake_item_change_bgimg".equals(str)) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SHAKE_FIRST_CHANGE_BG_IMG_BOOLEAN_SYNC;
            if (!i.mo119686g(aVar, false)) {
                View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.byb, (ViewGroup) null);
                C101218e0 e0Var = new C101218e0(getContext(), 2, 0);
                e0Var.mo140677w(C76577a.m92166q(getContext(), C0966R.string.k35));
                e0Var.mo140676v(1);
                e0Var.f296375F = new v$$e(e0Var);
                e0Var.mo140663j(inflate);
                e0Var.mo140655A();
                C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.TRUE);
            } else if (!Util.nullAsTrue((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4110, (Object) null))) {
                C77407n nVar = new C77407n((Context) getContext(), 1, true);
                nVar.mo107569n(C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.byc, (ViewGroup) null), false);
                nVar.f225784p1 = true;
                nVar.f225771i = new ShakePersonalInfoUI$$a(this);
                nVar.f225782p = new ShakePersonalInfoUI$$b(this);
                nVar.mo107573q();
            } else {
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8329zT(this, 1, (Intent) null);
                overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                C119179t tVar = C119157j.f356862d;
                C21268a aVar2 = new C21268a((ShakeActionReportStruct) null, 53);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(aVar2, 100, (String) null);
            }
        }
        if ("shake_item_sound".equals(str)) {
            boolean nullAsTrue = Util.nullAsTrue((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4112, (Object) null));
            C97625j3.m125812b().mo105906u().mo119676J(4112, Boolean.valueOf(!nullAsTrue));
            int i2 = nullAsTrue ? 55 : 54;
            C119179t tVar2 = C119157j.f356862d;
            C21268a aVar3 = new C21268a((ShakeActionReportStruct) null, i2);
            C119157j jVar2 = (C119157j) tVar2;
            jVar2.getClass();
            jVar2.mo183889t(aVar3, 100, (String) null);
        }
        if ("say_hi_list_shake_title".equals(str)) {
            Intent intent = new Intent(this, ShakeSayHiListUI.class);
            intent.putExtra("IntentSayHiType", 1);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent);
            C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C119179t tVar3 = C119157j.f356862d;
            C21268a aVar5 = new C21268a((ShakeActionReportStruct) null, 56);
            C119157j jVar3 = (C119157j) tVar3;
            jVar3.getClass();
            jVar3.mo183889t(aVar5, 100, (String) null);
        }
        if ("shake_item_histoty_list".equals(str)) {
            Intent intent2 = new Intent(this, ShakeItemListUI.class);
            intent2.putExtra("_key_show_type_", 100);
            intent2.putExtra("_key_title_", getString(C0966R.string.j4f));
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(intent2);
            C117292a.m165358d(this, aVar6.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar6.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C119179t tVar4 = C119157j.f356862d;
            C21268a aVar7 = new C21268a((ShakeActionReportStruct) null, 57);
            C119157j jVar4 = (C119157j) tVar4;
            jVar4.getClass();
            jVar4.mo183889t(aVar7, 100, (String) null);
        }
        if ("shake_msg_list".equals(str)) {
            Intent intent3 = new Intent(this, ShakeMsgListUI.class);
            intent3.putExtra("shake_msg_from", 2);
            intent3.putExtra("shake_msg_list_title", getString(C0966R.string.j69));
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(intent3);
            C117292a.m165358d(this, aVar8.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar8.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C119179t tVar5 = C119157j.f356862d;
            C21268a aVar9 = new C21268a((ShakeActionReportStruct) null, 58);
            C119157j jVar5 = (C119157j) tVar5;
            jVar5.getClass();
            jVar5.mo183889t(aVar9, 100, (String) null);
        }
        return false;
    }

    public void onResume() {
        super.onResume();
        if (C97625j3.m125811a()) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        }
        if (this.f21104d.mo72519a("shake_item_shake_tv_list") == null) {
            Log.m105920e(MMPreference.TAG, "shake_tv_list preference is null");
            return;
        }
        boolean z = false;
        if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "ShowConfig", "showShakeTV"), 0) == 1) {
            z = true;
        }
        Log.m105918d("MicroMsg.ConfigListDecoder", "isShowShakeTV : " + z);
        if (!z && !C90188n0.f258943k) {
            this.f21104d.mo72529n("shake_item_shake_tv_list", true);
        }
    }
}
