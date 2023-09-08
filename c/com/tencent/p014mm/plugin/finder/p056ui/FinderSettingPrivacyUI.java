package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSettingCheckStruct;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C87412m;
import h81.C32735h;
import ht1.C8774i3;
import ht1.C8790o3;
import ht1.C8793p3;
import ht1.C8794p5;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C76879j;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import pj3.C47511g;
import rx3.C13598b0;
import te3.C48718ai1;
import te3.C50542nh0;
import te3.C64553md1;
import up1.C37521f;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingPrivacyUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingPrivacyUI */
public final class FinderSettingPrivacyUI extends MMPreference {

    /* renamed from: g */
    public static final /* synthetic */ int f17095g = 0;

    /* renamed from: d */
    public Dialog f17096d;

    /* renamed from: e */
    public C48718ai1 f17097e;

    /* renamed from: f */
    public final C8794p5<C64553md1> f17098f = new C3731a(this);

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingPrivacyUI$a */
    public static final class C3731a implements C8794p5<C64553md1> {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingPrivacyUI f17099d;

        public C3731a(FinderSettingPrivacyUI finderSettingPrivacyUI) {
            this.f17099d = finderSettingPrivacyUI;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C64553md1 md12 = (C64553md1) obj;
            C87412m.m108594g(md12, "req");
            C87412m.m108594g(nh02, "ret");
            Dialog dialog = this.f17099d.f17096d;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i = 0;
            if (nh02.f138603e == 0) {
                C66785b bVar = C66785b.f191882e;
                C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
                if (a != null) {
                    i = a.field_extFlag;
                }
                int i2 = md12.f184310v == 1 ? i | 1024 : i & -1025;
                C54447c cVar = new C54447c(bVar.mo90662O5());
                cVar.field_extFlag = i2;
                bVar.mo90672m1(cVar, C39759i.MODIFY_USER);
                this.f17099d.finish();
                return;
            }
            FinderSettingPrivacyUI finderSettingPrivacyUI = this.f17099d;
            C76912y0.makeText((Context) finderSettingPrivacyUI, (CharSequence) finderSettingPrivacyUI.getString(C0966R.string.et6), 0).show();
            this.f17099d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingPrivacyUI$b */
    public static final class C3732b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C3732b f17100d = new C3732b();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingPrivacyUI$c */
    public static final class C3733c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingPrivacyUI f17101d;

        public C3733c(FinderSettingPrivacyUI finderSettingPrivacyUI) {
            this.f17101d = finderSettingPrivacyUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderSettingPrivacyUI finderSettingPrivacyUI = this.f17101d;
            int i = FinderSettingPrivacyUI.f17095g;
            finderSettingPrivacyUI.mo4120H7();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo4120H7() {
        C13598b0 b0Var;
        Preference a = getPreferenceScreen().mo72519a("checkbox_preference_one");
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        boolean J = ((CheckBoxPreference) a).mo6804J();
        if (J != C58739j4.f168176a.mo83687P()) {
            Dialog dialog = this.f17096d;
            if (dialog != null) {
                dialog.show();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f17096d = C76879j.m92723Q(getContext(), getContext().getString(C0966R.string.a3h), getContext().getString(C0966R.string.a4d), true, false, C3732b.f17100d);
            }
            ((C3605p1) C86312j.m106911c(C3605p1.class)).mo3981QJ(J ? 1 : 2, this.f17098f);
            return;
        }
        finish();
    }

    public int getResourceId() {
        return C0966R.xml.f8904ay;
    }

    public void onBackPressed() {
        mo4120H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ej4);
        setBackBtn(new C3733c(this));
        C48718ai1 ai12 = new C48718ai1();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("privacy_settings");
        if (byteArrayExtra != null) {
            try {
                ai12.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            this.f17097e = ai12;
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderSettingPrivacyUI).mo86179qs(this, C76986a.Finder);
        }
        ai12 = null;
        this.f17097e = ai12;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderSettingPrivacyUI).mo86179qs(this, C76986a.Finder);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        long j;
        int i;
        int i2;
        long j2;
        Class cls = C3605p1.class;
        C87412m.m108591d(preference);
        String str = preference.f121285r;
        Log.m105924i("Finder.FinderSettingPrivacyUI", "click " + str);
        if (str != null) {
            long j3 = 0;
            int i3 = 0;
            C13598b0 b0Var = null;
            int i4 = 2;
            switch (str.hashCode()) {
                case -1738608258:
                    if (str.equals("finder_mini_app_reference")) {
                        Preference a = getPreferenceScreen().mo72519a("finder_mini_app_reference");
                        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) a;
                        boolean J = checkBoxPreference.mo6804J();
                        Log.m105924i("Finder.FinderSettingPrivacyUI", "onMiniAppReferenceClick: isEnableMiniAppReference=" + J);
                        C58961d.C58963b bVar = C58961d.f168673a;
                        C58969q b = bVar.mo84155b(C66785b.f191882e.mo90662O5());
                        if (b != null) {
                            j3 = b.field_additionalFlag;
                        }
                        if (checkBoxPreference.mo6804J()) {
                            j = j3 & -17;
                            checkBoxPreference.mo7741E(getContext().getResources().getString(C0966R.string.naw));
                        } else {
                            j = j3 | 16;
                            checkBoxPreference.mo7741E(getContext().getResources().getString(C0966R.string.nax));
                        }
                        if (b != null) {
                            b.field_additionalFlag = j;
                            bVar.mo84166o(b);
                        }
                        ((C3605p1) C86312j.m106911c(cls)).no0(J, (C8794p5<C64553md1>) null);
                        break;
                    }
                    break;
                case -1462242975:
                    if (str.equals("feed_mv_reproduction")) {
                        Preference a2 = getPreferenceScreen().mo72519a("feed_mv_reproduction");
                        C87412m.m108592e(a2, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) a2;
                        boolean J2 = checkBoxPreference2.mo6804J();
                        C66785b bVar2 = C66785b.f191882e;
                        C54446b a3 = C66783a.C66784a.m78798a(bVar2, bVar2.mo90662O5(), false, 2, (Object) null);
                        if (a3 != null) {
                            i3 = a3.field_extFlag;
                        }
                        if (J2) {
                            i = -524289 & i3;
                            checkBoxPreference2.mo7741E(getContext().getResources().getString(C0966R.string.d_3));
                        } else {
                            i = 524288 | i3;
                            checkBoxPreference2.mo7741E(getContext().getResources().getString(C0966R.string.d_5));
                        }
                        C54447c cVar = new C54447c(bVar2.mo90662O5());
                        cVar.field_extFlag = i;
                        bVar2.mo90672m1(cVar, C39759i.MODIFY_USER);
                        ((C3605p1) C86312j.m106911c(cls)).Mu0(J2, (C8794p5<C64553md1>) null);
                        break;
                    }
                    break;
                case -421449683:
                    if (str.equals("feed_reproduction")) {
                        Preference a4 = getPreferenceScreen().mo72519a("feed_reproduction");
                        C87412m.m108592e(a4, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) a4;
                        boolean J3 = checkBoxPreference3.mo6804J();
                        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                        int i5 = J3 ? 1 : 2;
                        y0Var.getClass();
                        FinderSettingCheckStruct finderSettingCheckStruct = new FinderSettingCheckStruct();
                        finderSettingCheckStruct.f9897d = (long) 3;
                        finderSettingCheckStruct.f9898e = (long) i5;
                        finderSettingCheckStruct.mo86054n();
                        y0Var.Ec0(finderSettingCheckStruct);
                        C66785b bVar3 = C66785b.f191882e;
                        C54446b a5 = C66783a.C66784a.m78798a(bVar3, bVar3.mo90662O5(), false, 2, (Object) null);
                        if (a5 != null) {
                            i3 = a5.field_extFlag;
                        }
                        if (J3) {
                            i2 = i3 & -257;
                            checkBoxPreference3.mo7741E(getContext().getResources().getString(C0966R.string.csl));
                        } else {
                            i2 = i3 | 256;
                            checkBoxPreference3.mo7741E(getContext().getResources().getString(C0966R.string.d_4));
                        }
                        C54447c cVar2 = new C54447c(bVar3.mo90662O5());
                        cVar2.field_extFlag = i2;
                        bVar3.mo90672m1(cVar2, C39759i.MODIFY_USER);
                        ((C8790o3) C86312j.m106911c(C8790o3.class)).zu0(J3);
                        break;
                    }
                    break;
                case -211780962:
                    if (str.equals("checkbox_preference_interact")) {
                        Preference a6 = getPreferenceScreen().mo72519a("checkbox_preference_interact");
                        C87412m.m108592e(a6, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) a6;
                        boolean J4 = checkBoxPreference4.mo6804J();
                        Log.m105918d("Finder.FinderSettingPrivacyUI", "handleInteract:" + J4);
                        C58961d.C58963b bVar4 = C58961d.f168673a;
                        C58969q b2 = bVar4.mo84155b(C66785b.f191882e.mo90662O5());
                        if (b2 != null) {
                            j3 = b2.field_additionalFlag;
                        }
                        if (checkBoxPreference4.mo6804J()) {
                            j2 = j3 & -5;
                            checkBoxPreference4.mo7741E(getContext().getResources().getString(C0966R.string.f360759mh3));
                        } else {
                            j2 = j3 | 4;
                            checkBoxPreference4.mo7741E(getContext().getResources().getString(C0966R.string.f360758mh2));
                        }
                        if (b2 != null) {
                            b2.field_additionalFlag = j2;
                            bVar4.mo84166o(b2);
                        }
                        ((C3605p1) C86312j.m106911c(cls)).N90(J4, (C8794p5<C64553md1>) null);
                        break;
                    }
                    break;
                case 197211010:
                    if (str.equals("settings_personal_info_export")) {
                        Intent intent = new Intent();
                        C48718ai1 ai12 = this.f17097e;
                        intent.putExtra("rawUrl", ai12 != null ? ai12.f130550d : null);
                        C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        break;
                    }
                    break;
                case 541151233:
                    if (str.equals("settings_blacklist")) {
                        Intent intent2 = new Intent();
                        intent2.setClass(this, FinderBlackListUI.class);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent2);
                        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSettingPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/finder/ui/FinderSettingPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    }
                    break;
                case 622179821:
                    if (str.equals("settings_message_mute")) {
                        Preference a7 = getPreferenceScreen().mo72519a("settings_message_mute");
                        C87412m.m108592e(a7, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                        boolean J5 = ((CheckBoxPreference) a7).mo6804J();
                        C66785b bVar5 = C66785b.f191882e;
                        C54446b a8 = C66783a.C66784a.m78798a(bVar5, bVar5.mo90662O5(), false, 2, (Object) null);
                        if (a8 != null) {
                            i3 = a8.field_extFlag;
                        }
                        int i6 = J5 ? i3 | 64 : i3 & -65;
                        C54447c cVar3 = new C54447c(bVar5.mo90662O5());
                        cVar3.field_extFlag = i6;
                        bVar5.mo90672m1(cVar3, C39759i.MODIFY_USER);
                        ((C8774i3) C86312j.m106911c(C8774i3.class)).mo9596h8(J5);
                        break;
                    }
                    break;
                case 1478826890:
                    if (str.equals("settings_not_recommend_friends")) {
                        Preference a9 = getPreferenceScreen().mo72519a("settings_not_recommend_friends");
                        C87412m.m108592e(a9, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                        boolean J6 = ((CheckBoxPreference) a9).mo6804J();
                        C66785b bVar6 = C66785b.f191882e;
                        C54446b a15 = C66783a.C66784a.m78798a(bVar6, bVar6.mo90662O5(), false, 2, (Object) null);
                        if (a15 != null) {
                            i3 = a15.field_extFlag;
                        }
                        int i7 = J6 ? 1073741824 | i3 : -1073741825 & i3;
                        C54447c cVar4 = new C54447c(bVar6.mo90662O5());
                        cVar4.field_extFlag = i7;
                        bVar6.mo90672m1(cVar4, C39759i.MODIFY_USER);
                        ((C8793p3) C86312j.m106911c(C8793p3.class)).mo9626sA(J6);
                        break;
                    }
                    break;
                case 1697865235:
                    if (str.equals("setting_no_see_at_tab_tips")) {
                        Preference a16 = getPreferenceScreen().mo72519a("setting_no_see_at_tab_tips");
                        C87412m.m108592e(a16, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
                        boolean J7 = ((CheckBoxPreference) a16).mo6804J();
                        Dialog dialog = this.f17096d;
                        if (dialog != null) {
                            dialog.show();
                            b0Var = C13598b0.f38549a;
                        }
                        if (b0Var == null) {
                            this.f17096d = C76879j.m92723Q(getContext(), getContext().getString(C0966R.string.a3h), getContext().getString(C0966R.string.a4d), true, false, C3874t3.f17427d);
                        }
                        C3605p1 p1Var = (C3605p1) C86312j.m106911c(cls);
                        if (J7) {
                            i4 = 1;
                        }
                        p1Var.of0(i4, new C3877u3(this));
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        C66785b bVar = C66785b.f191882e;
        String str = null;
        boolean z = false;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        boolean z2 = ((a != null ? a.field_extFlag : 0) & 64) != 0;
        Log.m105918d("Finder.FinderSettingPrivacyUI", "initNotRecommendBtn:" + z2);
        Preference a2 = getPreferenceScreen().mo72519a("settings_message_mute");
        C87412m.m108592e(a2, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) a2;
        checkBoxPreference.mo6805K(z2);
        checkBoxPreference.f121290w = false;
        Preference a3 = getPreferenceScreen().mo72519a("checkbox_preference_one");
        C87412m.m108592e(a3, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) a3;
        checkBoxPreference2.f121290w = false;
        checkBoxPreference2.mo6805K(C58739j4.f168176a.mo83687P());
        C54446b a4 = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        boolean z3 = ((a4 != null ? a4.field_extFlag : 0) & 256) == 0;
        Preference a5 = getPreferenceScreen().mo72519a("feed_reproduction");
        C87412m.m108592e(a5, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) a5;
        checkBoxPreference3.mo6805K(z3);
        checkBoxPreference3.f121290w = false;
        if (checkBoxPreference3.mo6804J()) {
            checkBoxPreference3.mo7741E(getContext().getResources().getString(C0966R.string.csl));
        } else {
            checkBoxPreference3.mo7741E(getContext().getResources().getString(C0966R.string.d_4));
        }
        C47511g preferenceScreen = getPreferenceScreen();
        C37521f.f99374d.getClass();
        preferenceScreen.mo72529n("finder_mini_app_reference", C37521f.f99544w1.mo60266n().intValue() == 0);
        C58969q b = C58961d.f168673a.mo84155b(bVar.mo90662O5());
        boolean z4 = ((b != null ? b.field_additionalFlag : 0) & 16) == 0;
        Preference a6 = getPreferenceScreen().mo72519a("finder_mini_app_reference");
        C87412m.m108592e(a6, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) a6;
        checkBoxPreference4.mo6805K(z4);
        checkBoxPreference4.f121290w = false;
        if (checkBoxPreference4.mo6804J()) {
            checkBoxPreference4.mo7741E(getContext().getResources().getString(C0966R.string.naw));
        } else {
            checkBoxPreference4.mo7741E(getContext().getResources().getString(C0966R.string.nax));
        }
        C54446b a7 = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        boolean z5 = ((a7 != null ? a7.field_extFlag : 0) & 524288) == 0;
        Preference a8 = getPreferenceScreen().mo72519a("feed_mv_reproduction");
        C87412m.m108592e(a8, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) a8;
        checkBoxPreference5.mo6805K(z5);
        checkBoxPreference5.f121290w = false;
        if (checkBoxPreference5.mo6804J()) {
            checkBoxPreference5.mo7741E(getContext().getResources().getString(C0966R.string.d_3));
        } else {
            checkBoxPreference5.mo7741E(getContext().getResources().getString(C0966R.string.d_5));
        }
        getPreferenceScreen().mo72529n("feed_mv_reproduction", C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_PROFILE_MOVE_MV_TAB_FLAG_BOOLEAN_SYNC, false));
        getPreferenceScreen().mo72529n("settings_not_recommend_friends", true);
        Preference a9 = getPreferenceScreen().mo72519a("settings_not_recommend_friends");
        C87412m.m108592e(a9, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) a9;
        C58784w3 w3Var = C58784w3.f168295a;
        w3Var.getClass();
        C54446b a15 = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        checkBoxPreference6.mo6805K(((a15 != null ? a15.field_extFlag : 0) & 1073741824) != 0);
        checkBoxPreference6.f121290w = false;
        getPreferenceScreen().notifyDataSetChanged();
        boolean z6 = !(C37521f.f99376d2.mo60266n().intValue() == 1 && C37521f.f99543w.mo60266n().intValue() == 1);
        getPreferenceScreen().mo72529n("settings_message_mute", z6);
        getPreferenceScreen().mo72529n("settings_message_mute_desc", z6);
        getPreferenceScreen().mo72529n("feed_reproduction", !(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_reproduction, 0) == 1));
        C47511g preferenceScreen2 = getPreferenceScreen();
        C48718ai1 ai12 = this.f17097e;
        if (ai12 != null) {
            str = ai12.f130550d;
        }
        if (str == null || str.length() == 0) {
            z = true;
        }
        preferenceScreen2.mo72529n("settings_personal_info_export", z);
        Preference a16 = getPreferenceScreen().mo72519a("checkbox_preference_interact");
        C87412m.m108592e(a16, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) a16;
        checkBoxPreference7.mo6805K(w3Var.mo83889N0());
        checkBoxPreference7.mo7741E(checkBoxPreference7.mo6804J() ? getContext().getResources().getString(C0966R.string.f360759mh3) : getContext().getResources().getString(C0966R.string.f360758mh2));
    }
}
