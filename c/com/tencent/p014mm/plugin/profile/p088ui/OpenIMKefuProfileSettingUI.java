package com.tencent.p014mm.plugin.profile.p088ui;

import a14.C53934p0;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.stubs.logger.Log;
import df2.C75381g;
import eb0.C45628s0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ie0.C46220j;
import ie0.C46225p;
import j20.C117292a;
import java.util.ArrayList;
import je0.C46477j0;
import je0.C46488m0;
import kotlin.Metadata;
import pj3.C47511g;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wb2.C65946a;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/OpenIMKefuProfileSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI */
public final class OpenIMKefuProfileSettingUI extends MMPreference {

    /* renamed from: f */
    public static final /* synthetic */ int f115335f = 0;

    /* renamed from: d */
    public C75381g f115336d;

    /* renamed from: e */
    public final C13601g f115337e = C36568h.m40985a(new C42611d(this));

    /* renamed from: com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI$a */
    public static final class C42608a implements View.OnClickListener {

        /* renamed from: d */
        public static final C42608a f115338d = new C42608a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/OpenIMKefuProfileSettingUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/OpenIMKefuProfileSettingUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI$b */
    public static final class C42609b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ OpenIMKefuProfileSettingUI f115339d;

        public C42609b(OpenIMKefuProfileSettingUI openIMKefuProfileSettingUI) {
            this.f115339d = openIMKefuProfileSettingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f115339d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI$c */
    public static final class C42610c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f115340d;

        /* renamed from: e */
        public final /* synthetic */ CheckBoxPreference f115341e;

        /* renamed from: f */
        public final /* synthetic */ OpenIMKefuProfileSettingUI f115342f;

        /* renamed from: g */
        public final /* synthetic */ String f115343g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42610c(C89779i0 i0Var, CheckBoxPreference checkBoxPreference, OpenIMKefuProfileSettingUI openIMKefuProfileSettingUI, String str) {
            super(1);
            this.f115340d = i0Var;
            this.f115341e = checkBoxPreference;
            this.f115342f = openIMKefuProfileSettingUI;
            this.f115343g = str;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f115340d.hide();
            if (!booleanValue) {
                CheckBoxPreference checkBoxPreference = this.f115341e;
                checkBoxPreference.mo6808N(true ^ checkBoxPreference.mo6804J());
                AppCompatActivity context = this.f115342f.getContext();
                C77389a aVar = new C77389a();
                aVar.f225660q = this.f115342f.getContext().getString(C0966R.string.m8c);
                aVar.f225663t = this.f115342f.getContext().getString(C0966R.string.m8b);
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar);
                gVar.show();
            } else {
                C46220j b = C46225p.m51524b(this.f115343g);
                if (b != null) {
                    CheckBoxPreference checkBoxPreference2 = this.f115341e;
                    String str = this.f115343g;
                    b.field_needReport = checkBoxPreference2.mo6804J();
                    b.field_hasSetReport = true;
                    C46225p.m51525c(b);
                    if (b.mo71447r1().booleanValue()) {
                        C46477j0 j0Var = C46477j0.f125215a;
                        C87412m.m108593f(str, "username");
                        C46477j0.m51766c(j0Var, str, b.mo71443U(), 3, (C32226l) null, 8, (Object) null);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI$d */
    public static final class C42611d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ OpenIMKefuProfileSettingUI f115344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42611d(OpenIMKefuProfileSettingUI openIMKefuProfileSettingUI) {
            super(0);
            this.f115344d = openIMKefuProfileSettingUI;
        }

        public Object invoke() {
            return this.f115344d.getIntent().getStringExtra("kefu_username");
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8925i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Preference a = getPreferenceScreen().mo72519a("openim_kefu_setting_need_report");
        CheckBoxPreference checkBoxPreference = a instanceof CheckBoxPreference ? (CheckBoxPreference) a : null;
        if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(getIntent().getBooleanExtra("need_location_report", false));
            C42608a aVar = C42608a.f115338d;
            checkBoxPreference.f24221V = aVar;
            View view = checkBoxPreference.f24220U;
            if (view != null) {
                view.setOnClickListener(aVar);
            }
        }
        String str = (String) ((C36570n) this.f115337e).getValue();
        if (str != null) {
            C46220j b = C46225p.m51524b(str);
            if (!(b != null && Boolean.valueOf(b.field_hasSetReport).booleanValue())) {
                getPreferenceScreen().mo72529n("openim_kefu_setting_need_report", true);
                getPreferenceScreen().mo72529n("openim_kefu_setting_small_category", true);
            }
        }
        C72996z1 k = C45628s0.m50782k((String) ((C36570n) this.f115337e).getValue());
        if (k == null) {
            Log.m106498e(MMPreference.TAG, "ContactStorageLogic.getContactWithInit return null? username = %s", (String) ((C36570n) this.f115337e).getValue());
            finish();
        }
        C13598b0 b0Var = C13598b0.f38549a;
        this.f115336d = new C75381g(this, k);
        setTitle(getString(C0966R.string.m8j));
        setBackBtn(new C42609b(this));
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference == null) {
            return false;
        }
        if (C87412m.m108589b(preference.f121285r, "openim_kefu_setting_need_report")) {
            C89779i0 e = C89779i0.m112248e(getContext(), getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
            String str = (String) ((C36570n) this.f115337e).getValue();
            CheckBoxPreference checkBoxPreference = preference instanceof CheckBoxPreference ? (CheckBoxPreference) preference : null;
            if (!(str == null || checkBoxPreference == null)) {
                AppCompatActivity context = getContext();
                C87412m.m108593f(context, "context");
                boolean J = checkBoxPreference.mo6804J();
                C42610c cVar = new C42610c(e, checkBoxPreference, this, str);
                C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C65946a.class);
                C87412m.m108593f(a, "UICProvider.of(context).…ycleScopeUIC::class.java)");
                C65946a aVar = (C65946a) a;
                LifecycleScope.launchDefault$default(aVar.mo89983c3(), (C53934p0) null, new C46488m0(aVar, str, J, cVar, (C15601d<? super C46488m0>) null), 1, (Object) null);
            }
            return true;
        } else if (!C87412m.m108589b(preference.f121285r, "openim_kefu_setting_recommend")) {
            return false;
        } else {
            C75381g gVar2 = this.f115336d;
            if (gVar2 != null) {
                gVar2.mo105718b();
            }
            return true;
        }
    }
}
