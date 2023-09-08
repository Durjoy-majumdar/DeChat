package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import bd1.C39758f;
import bd1.C39759i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import ht1.C8788n3;
import kotlin.Metadata;
import nj3.C76879j;
import org.json.JSONObject;
import pj3.C47511g;
import rs1.C13442s8;
import te3.C50295lp1;
import z04.C112551y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI */
public final class FinderSettingPersonalizedUI extends MMPreference {

    /* renamed from: f */
    public static final /* synthetic */ int f52528f = 0;

    /* renamed from: d */
    public CheckBoxPreference f52529d;

    /* renamed from: e */
    public CheckBoxPreference f52530e;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI$a */
    public static final class C18766a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingPersonalizedUI f52531d;

        public C18766a(FinderSettingPersonalizedUI finderSettingPersonalizedUI) {
            this.f52531d = finderSettingPersonalizedUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52531d.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo23647H7(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", str);
        jSONObject.put("rec_type", str2);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this);
        y0Var.Cx0(1, "individual_privacy", n, f != null ? f.mo12861q3() : null);
    }

    /* renamed from: I7 */
    public final void mo23648I7() {
        C66785b bVar = C66785b.f191882e;
        C50295lp1 lp12 = bVar.mo90673n0().mo62397b().f140479w;
        boolean z = true;
        boolean z2 = lp12 != null ? lp12.f137574d : true;
        C50295lp1 lp13 = bVar.mo90673n0().mo62397b().f140479w;
        if (lp13 != null) {
            z = lp13.f137575e;
        }
        CheckBoxPreference checkBoxPreference = this.f52529d;
        if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(z2);
            checkBoxPreference.f121290w = false;
        }
        CheckBoxPreference checkBoxPreference2 = this.f52530e;
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.mo6805K(z);
            checkBoxPreference2.f121290w = false;
        }
        getPreferenceScreen().notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8903ax;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.egu);
        setBackBtn(new C18766a(this));
        this.f52529d = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_allow_recommend_video");
        this.f52530e = (CheckBoxPreference) getPreferenceScreen().mo72519a("settings_allow_recommend_live");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        CheckBoxPreference checkBoxPreference;
        Preference preference2 = preference;
        Class cls = C8788n3.class;
        String str = null;
        String str2 = preference2 != null ? preference2.f121285r : null;
        Log.m105924i("FinderSettingPersonalizedUI", "click " + str2);
        if (C87412m.m108589b(str2, "settings_allow_recommend_video")) {
            CheckBoxPreference checkBoxPreference2 = this.f52529d;
            if (checkBoxPreference2 != null) {
                if (!checkBoxPreference2.mo6804J()) {
                    Context context = checkBoxPreference2.f121274d;
                    String string = context != null ? context.getString(C0966R.string.d0n) : null;
                    Context context2 = checkBoxPreference2.f121274d;
                    String string2 = context2 != null ? context2.getString(C0966R.string.d0k) : null;
                    Context context3 = checkBoxPreference2.f121274d;
                    if (context3 != null) {
                        str = context3.getString(C0966R.string.f7926wf);
                    }
                    C76879j.m92718L(context, false, string, "", string2, str, new C18769r3(this), new C18770s3(this), C0966R.color.f356997ai1, 0);
                } else {
                    ((C8788n3) C86312j.m106911c(cls)).Xu0(true, 1);
                    C66785b bVar = C66785b.f191882e;
                    C39758f fVar = new C39758f();
                    if (fVar.mo62397b().f140479w == null) {
                        fVar.mo62397b().f140479w = new C50295lp1();
                    }
                    C50295lp1 lp12 = fVar.mo62397b().f140479w;
                    if (lp12 != null) {
                        lp12.f137574d = true;
                    }
                    bVar.mo90665S0(fVar, C39759i.FINDER_SETTING_PERSONALIZED);
                    mo23647H7("1", "channel");
                }
            }
        } else if (C87412m.m108589b(str2, "settings_allow_recommend_live") && (checkBoxPreference = this.f52530e) != null) {
            if (!checkBoxPreference.mo6804J()) {
                Context context4 = checkBoxPreference.f121274d;
                String string3 = context4 != null ? context4.getString(C0966R.string.d0l) : null;
                Context context5 = checkBoxPreference.f121274d;
                String string4 = context5 != null ? context5.getString(C0966R.string.d0k) : null;
                Context context6 = checkBoxPreference.f121274d;
                if (context6 != null) {
                    str = context6.getString(C0966R.string.f7926wf);
                }
                C76879j.m92718L(context4, false, string3, "", string4, str, new C18767p3(this), new C18768q3(this), C0966R.color.f356997ai1, 0);
            } else {
                ((C8788n3) C86312j.m106911c(cls)).Xu0(true, 2);
                C66785b bVar2 = C66785b.f191882e;
                C39758f fVar2 = new C39758f();
                if (fVar2.mo62397b().f140479w == null) {
                    fVar2.mo62397b().f140479w = new C50295lp1();
                }
                C50295lp1 lp13 = fVar2.mo62397b().f140479w;
                if (lp13 != null) {
                    lp13.f137575e = true;
                }
                bVar2.mo90665S0(fVar2, C39759i.FINDER_SETTING_PERSONALIZED);
                mo23647H7("1", WeChatBrands.Business.GROUP_LIVE);
            }
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        mo23648I7();
    }
}
