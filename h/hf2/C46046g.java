package hf2;

import a14.C0000n0;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sf0.C77702q0;
import te3.C50273lj2;
import te3.C50554nj2;
import te3.C51933x7;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingJsApiUIC$onCreate$1$2$emit$2", mo125469f = "NewBizInfoSettingJsApiUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: hf2.g */
public final class C46046g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C50554nj2 f124165d;

    /* renamed from: e */
    public final /* synthetic */ C50273lj2 f124166e;

    /* renamed from: f */
    public final /* synthetic */ C46035f f124167f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46046g(C50554nj2 nj22, C50273lj2 lj22, C46035f fVar, C15601d<? super C46046g> dVar) {
        super(2, dVar);
        this.f124165d = nj22;
        this.f124166e = lj22;
        this.f124167f = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46046g(this.f124165d, this.f124166e, this.f124167f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46046g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (this.f124165d == null && this.f124166e == null && !this.f124167f.mo71467c3().f115447e.mo62927s3()) {
            Log.m105924i("NewBizInfoSettingJsApiUIC", "show empty view!");
            C46035f fVar = this.f124167f;
            fVar.mo71468d3(true, fVar.mo71467c3().f115446d);
        } else {
            C46035f fVar2 = this.f124167f;
            C50273lj2 lj22 = this.f124166e;
            if (C77702q0.m93719b(fVar2.f124144g)) {
                fVar2.f124144g = lj22 != null ? lj22.f137457d : null;
            }
            fVar2.mo71467c3().f115457r.add(fVar2);
            C46035f.f124140j = lj22;
            if (lj22 == null) {
                Log.m105924i("NewBizInfoSettingJsApiUIC", "resp == null");
            } else {
                LinkedList<C51933x7> linkedList = lj22.f137458e;
                Log.m105924i("NewBizInfoSettingJsApiUIC", "scopeList.size = " + linkedList.size());
                Iterator<C51933x7> it = linkedList.iterator();
                while (it.hasNext()) {
                    if (it.next().f144500f != 0) {
                        fVar2.f124141d++;
                    }
                }
                Log.m105924i("NewBizInfoSettingJsApiUIC", "effectiveAuthScopeItemNum = " + fVar2.f124141d);
                int i = fVar2.f124141d;
                if (i > 0) {
                    for (int i2 = 0; i2 < 4; i2++) {
                        fVar2.mo71467c3().f115446d.mo72527k(new PreferenceSmallCategory(fVar2.getContext(), (AttributeSet) null));
                    }
                    Preference preference = new Preference(fVar2.getContext());
                    preference.f121271G = C0966R.C0971layout.f7073xd;
                    String string = fVar2.getResources().getString(C0966R.string.bki);
                    C87412m.m108593f(string, "resources.getString(R.st…o_biz_jsapi_bizinfo_desc)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{fVar2.f124142e}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    preference.mo69924H(format);
                    fVar2.mo71467c3().f115446d.mo72527k(preference);
                    for (C51933x7 x7Var : linkedList) {
                        if (x7Var.f144500f != 0) {
                            CheckBoxPreference checkBoxPreference = new CheckBoxPreference(fVar2.getContext());
                            checkBoxPreference.mo69924H(x7Var.f144499e);
                            checkBoxPreference.f24210J = x7Var.f144500f == 1;
                            checkBoxPreference.mo26273A(x7Var.f144498d);
                            checkBoxPreference.f121290w = false;
                            fVar2.mo71467c3().f115446d.mo72527k(checkBoxPreference);
                            Log.m105925i("NewBizInfoSettingJsApiUIC", "add preference: %s", x7Var.f144499e);
                        }
                    }
                    fVar2.mo71468d3(false, fVar2.mo71467c3().f115446d);
                } else if (i == 0 && lj22.f137459f.size() == 0) {
                    fVar2.mo71467c3().f115447e.mo62927s3();
                }
            }
            if (lj22 == null) {
                Log.m105924i("NewBizInfoSettingJsApiUIC", "resp == null");
            } else if (lj22.f137459f.size() == 0) {
                Log.m105924i("NewBizInfoSettingJsApiUIC", "privacy_scope_item_list.size == 0");
            } else {
                fVar2.mo71467c3().f115446d.mo72527k(new PreferenceSmallCategory(fVar2.getContext(), (AttributeSet) null));
                Preference preference2 = new Preference(fVar2.getContext());
                preference2.f121271G = C0966R.C0971layout.bcy;
                preference2.mo69924H(fVar2.getResources().getString(C0966R.string.bkk));
                preference2.mo26273A("NewBizInfoAuthMainUI");
                fVar2.mo71467c3().f115446d.mo72527k(preference2);
            }
            C46035f fVar3 = this.f124167f;
            fVar3.getClass();
            fVar3.mo71467c3().f115446d.mo72527k(new PreferenceSmallCategory(fVar3.getContext(), (AttributeSet) null));
            Preference preference3 = new Preference(fVar3.getContext());
            preference3.f121271G = C0966R.C0971layout.bcy;
            preference3.mo69924H(fVar3.getResources().getString(C0966R.string.ech));
            preference3.mo26273A("NewBizInfoRecordUI");
            fVar3.mo71467c3().f115446d.mo72527k(preference3);
            C46035f fVar4 = this.f124167f;
            fVar4.getClass();
            fVar4.mo71468d3(false, this.f124167f.mo71467c3().f115446d);
        }
        return C13598b0.f38549a;
    }
}
