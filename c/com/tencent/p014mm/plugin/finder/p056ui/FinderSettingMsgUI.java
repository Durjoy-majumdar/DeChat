package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C46109j3;
import ht1.C8794p5;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C76912y0;
import pj3.C47511g;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C52098yc1;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingMsgUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI */
public final class FinderSettingMsgUI extends MMPreference {

    /* renamed from: e */
    public static final /* synthetic */ int f111815e = 0;

    /* renamed from: d */
    public Dialog f111816d;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI$a */
    public static final class C41522a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C41522a f111817d = new C41522a();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI$b */
    public static final class C41523b implements C8794p5<C52098yc1> {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingMsgUI f111818d;

        public C41523b(FinderSettingMsgUI finderSettingMsgUI) {
            this.f111818d = finderSettingMsgUI;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C52098yc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            Dialog dialog = this.f111818d.f111816d;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (nh02.f138603e != 0) {
                FinderSettingMsgUI finderSettingMsgUI = this.f111818d;
                C76912y0.makeText((Context) finderSettingMsgUI, (CharSequence) finderSettingMsgUI.getString(C0966R.string.fz9), 0).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI$c */
    public static final class C41524c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingMsgUI f111819d;

        public C41524c(FinderSettingMsgUI finderSettingMsgUI) {
            this.f111819d = finderSettingMsgUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderSettingMsgUI finderSettingMsgUI = this.f111819d;
            int i = FinderSettingMsgUI.f111815e;
            if (finderSettingMsgUI.isFinishing()) {
                return true;
            }
            finderSettingMsgUI.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo64605H7(long j, int i) {
        C13598b0 b0Var;
        Dialog dialog = this.f111816d;
        if (dialog != null) {
            dialog.show();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f111816d = C76879j.m92723Q(getContext(), getContext().getString(C0966R.string.a3h), getContext().getString(C0966R.string.a4d), true, false, C41522a.f111817d);
        }
        ((C46109j3) C86312j.m106911c(C46109j3.class)).mo71552cc(j, i, new C41523b(this));
    }

    /* renamed from: I7 */
    public final void mo64606I7(String str, boolean z) {
        Preference a = getPreferenceScreen().mo72519a(str);
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        ((CheckBoxPreference) a).mo6805K(z);
    }

    public int getResourceId() {
        return C0966R.xml.f8902b3;
    }

    public void onBackPressed() {
        super.onBackPressed();
        Dialog dialog = this.f111816d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.fyy);
        setBackBtn(new C41524c(this));
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C87412m.m108591d(preference);
        String str = preference.f121285r;
        Log.m105924i("Finder.OccupyFinderUI5", "click " + str);
        Preference a = getPreferenceScreen().mo72519a(str);
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        boolean J = ((CheckBoxPreference) a).mo6804J() ^ true;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1253701633) {
                if (hashCode != 786619639) {
                    if (hashCode == 1912347161 && str.equals("checkbox_preference_follow")) {
                        mo64605H7(4, J);
                    }
                } else if (str.equals("checkbox_preference_comment")) {
                    mo64605H7(2, J);
                }
            } else if (str.equals("checkbox_preference_like")) {
                mo64605H7(1, J ? 1 : 0);
            }
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        if (b != null) {
            boolean z = false;
            mo64606I7("checkbox_preference_like", (b.field_messageStatus & 1) != 1);
            mo64606I7("checkbox_preference_comment", (b.field_messageStatus & 2) != 2);
            if ((b.field_messageStatus & 4) != 4) {
                z = true;
            }
            mo64606I7("checkbox_preference_follow", z);
        }
        getPreferenceScreen().notifyDataSetChanged();
    }
}
