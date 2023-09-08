package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderCreateButtonClickStruct;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import er1.C7907w1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import je1.C46531q4;
import nj3.C76879j;
import rx3.C13598b0;
import rx3.C36570n;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.ui.h0 */
public final class C3832h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17366d;

    /* renamed from: com.tencent.mm.plugin.finder.ui.h0$a */
    public static final class C3833a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f17367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3833a(FinderCreateContactUI finderCreateContactUI) {
            super(0);
            this.f17367d = finderCreateContactUI;
        }

        public Object invoke() {
            this.f17367d.f16836X = null;
            return C13598b0.f38549a;
        }
    }

    public C3832h0(FinderCreateContactUI finderCreateContactUI) {
        this.f17366d = finderCreateContactUI;
    }

    public final void onClick(View view) {
        C13598b0 b0Var;
        String obj;
        String obj2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i(this.f17366d.f16839o, "doClick create contact btn");
        FinderCreateContactUI finderCreateContactUI = this.f17366d;
        if (finderCreateContactUI.f16836X != null) {
            C7907w1 w1Var = C7907w1.f26566d;
            AppCompatActivity context = finderCreateContactUI.getContext();
            C87412m.m108593f(context, "context");
            if (!w1Var.mo9029b(context, Integer.valueOf(C7907w1.f26568f), new C3833a(finderCreateContactUI))) {
                Log.m105924i(finderCreateContactUI.f16839o, "doClick create contact btn,bind phone return");
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i(this.f17366d.f16839o, "doClick create contact btn,prepareResp = null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        FinderCreateButtonClickStruct finderCreateButtonClickStruct = new FinderCreateButtonClickStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String str = "";
        if (Wb == null) {
            Wb = str;
        }
        finderCreateButtonClickStruct.f9779d = finderCreateButtonClickStruct.mo86045b("SessionId", Wb, true);
        FinderCreateContactUI finderCreateContactUI2 = this.f17366d;
        finderCreateButtonClickStruct.f9787l = (long) finderCreateContactUI2.f16833U;
        String string = finderCreateContactUI2.getString(C0966R.string.a_r);
        C87412m.m108593f(string, "getString(com.tencent.mm…mui.R.string.avatar_desc)");
        String string2 = this.f17366d.getString(C0966R.string.eeo);
        C87412m.m108593f(string2, "getString(R.string.finder_nickname)");
        String string3 = this.f17366d.getString(C0966R.string.iyk);
        C87412m.m108593f(string3, "getString(com.tencent.mm…ui.R.string.settings_sex)");
        String string4 = this.f17366d.getString(C0966R.string.irg);
        C87412m.m108593f(string4, "getString(com.tencent.mm…string.settings_district)");
        FinderCreateContactUI.C3648a aVar = FinderCreateContactUI.f16795U0;
        FinderCreateContactUI finderCreateContactUI3 = this.f17366d;
        String str2 = finderCreateContactUI3.f16811B;
        if (str2 == null) {
            str2 = str;
        }
        FinderCreateContactUI.f16796V0 = str2;
        EditText editText = finderCreateContactUI3.f16844s;
        if (editText != null) {
            Editable text = editText.getText();
            if (!(text == null || (obj = text.toString()) == null || (obj2 = C112550d0.m153799i0(obj).toString()) == null)) {
                str = obj2;
            }
            FinderCreateContactUI.f16797W0 = str;
            FinderCreateContactUI.f16805e1 = ((MMSwitchBtn) ((C36570n) this.f17366d.f16826Q0).getValue()).f220433y;
            ArrayList arrayList2 = new ArrayList();
            if (C45078p0.m49927f(FinderCreateContactUI.f16797W0) > this.f17366d.f16837Y) {
                arrayList2.add(string2);
            }
            ArrayList arrayList3 = new ArrayList();
            String str3 = "(Landroid/view/View;)V";
            if (FinderCreateContactUI.f16796V0.length() == 0) {
                arrayList3.add(string);
            } else {
                finderCreateButtonClickStruct.f9783h = 1;
            }
            if (FinderCreateContactUI.f16797W0.length() == 0) {
                arrayList3.add(string2);
            } else {
                finderCreateButtonClickStruct.f9784i = 1;
            }
            if (FinderCreateContactUI.f16798X0.length() == 0) {
                arrayList3.add(string3);
            } else {
                finderCreateButtonClickStruct.f9785j = 1;
            }
            if (Util.isNullOrNil(FinderCreateContactUI.f16802b1)) {
                arrayList3.add(string4);
            } else {
                finderCreateButtonClickStruct.f9786k = 1;
            }
            if (!arrayList2.isEmpty()) {
                String listToString = Util.listToString(arrayList2, this.f17366d.getString(C0966R.string.d7j));
                FinderCreateContactUI finderCreateContactUI4 = this.f17366d;
                String string5 = finderCreateContactUI4.getString(C0966R.string.dcw, new Object[]{listToString});
                C87412m.m108593f(string5, "getString(R.string.finde…o_long_tip, errorTypeStr)");
                FinderCreateContactUI.m3834W7(finderCreateContactUI4, string5, (String) null, (String) null, 6, (Object) null);
                finderCreateButtonClickStruct.f9780e = 2;
                finderCreateButtonClickStruct.f9781f = 1;
                finderCreateButtonClickStruct.f9782g = finderCreateButtonClickStruct.mo86045b("FailReasonWording", this.f17366d.getString(C0966R.string.dcw, new Object[]{listToString}), true);
            } else if (arrayList3.isEmpty()) {
                CheckBox checkBox = this.f17366d.f16822M;
                if (checkBox == null) {
                    C87412m.m108603p("tipsCheckCB");
                    throw null;
                } else if (checkBox.isChecked()) {
                    FinderCreateContactUI finderCreateContactUI5 = this.f17366d;
                    finderCreateContactUI5.getClass();
                    C115669n.INSTANCE.mo175913w(1279, 31, 1);
                    String str4 = finderCreateContactUI5.f16839o;
                    Log.m105925i(str4, "createContact avatarPath " + finderCreateContactUI5.f16811B + " length=" + (C86013q1.m106451l(FinderCreateContactUI.f16796V0) / ((long) 1024)), FinderCreateContactUI.f16796V0);
                    String q = C86013q1.m106456q(FinderCreateContactUI.f16796V0);
                    int l = (int) C86013q1.m106451l(FinderCreateContactUI.f16796V0);
                    String a = aVar.mo4033a(q, l);
                    String str5 = FinderCreateContactUI.f16807g1.get(a);
                    if ((a.length() == 0) || str5 == null) {
                        C86709a0.m107524d().mo123460f(new C46531q4(FinderCreateContactUI.f16796V0, 1, q, l));
                    } else {
                        finderCreateContactUI5.mo4022Q7(str5);
                    }
                    finderCreateContactUI5.f16831T = C76879j.m92723Q(finderCreateContactUI5, "", finderCreateContactUI5.getString(C0966R.string.a2w), false, true, (DialogInterface.OnCancelListener) null);
                    finderCreateButtonClickStruct.f9780e = 1;
                } else {
                    Log.m105924i(this.f17366d.f16839o, "not check agreement");
                    FinderCreateContactUI finderCreateContactUI6 = this.f17366d;
                    String string6 = finderCreateContactUI6.getString(C0966R.string.d0e);
                    C87412m.m108593f(string6, "getString(R.string.finder_agreement_not_check_tip)");
                    FinderCreateContactUI.m3834W7(finderCreateContactUI6, string6, (String) null, (String) null, 6, (Object) null);
                    FinderCreateContactUI finderCreateContactUI7 = this.f17366d;
                    finderCreateContactUI7.getClass();
                    Animation loadAnimation = AnimationUtils.loadAnimation(finderCreateContactUI7, C0966R.C0968anim.f2342a7);
                    View view2 = finderCreateContactUI7.f16821L;
                    if (view2 != null) {
                        view2.startAnimation(loadAnimation);
                        finderCreateButtonClickStruct.f9780e = 2;
                        finderCreateButtonClickStruct.f9781f = 3;
                        finderCreateButtonClickStruct.f9782g = finderCreateButtonClickStruct.mo86045b("FailReasonWording", this.f17366d.getString(C0966R.string.d0e), true);
                    } else {
                        C87412m.m108603p("tipsContainer");
                        throw null;
                    }
                }
            } else {
                String str6 = this.f17366d.f16839o;
                Log.m105924i(str6, "empty attr " + arrayList3);
                String listToString2 = Util.listToString(arrayList3, this.f17366d.getString(C0966R.string.d7j));
                FinderCreateContactUI finderCreateContactUI8 = this.f17366d;
                String string7 = finderCreateContactUI8.getString(C0966R.string.dcv, new Object[]{listToString2});
                C87412m.m108593f(string7, "getString(R.string.finde…_empty_tip, errorTypeStr)");
                FinderCreateContactUI.m3834W7(finderCreateContactUI8, string7, (String) null, (String) null, 6, (Object) null);
                finderCreateButtonClickStruct.f9780e = 2;
                finderCreateButtonClickStruct.f9781f = 2;
                finderCreateButtonClickStruct.f9782g = finderCreateButtonClickStruct.mo86045b("FailReasonWording", this.f17366d.getString(C0966R.string.dcv, new Object[]{listToString2}), true);
            }
            finderCreateButtonClickStruct.mo86054n();
            String str7 = this.f17366d.f16839o;
            StringBuilder sb = new StringBuilder();
            sb.append("report19815 ");
            String q2 = finderCreateButtonClickStruct.mo1006q();
            C87412m.m108593f(q2, "struct.toShowString()");
            sb.append(C112551y.m153814n(q2, APLogFileUtil.SEPARATOR_LINE, " ", false));
            Log.m105924i(str7, sb.toString());
            FinderCreateContactUI.m3833N7(this.f17366d, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$3", "android/view/View$OnClickListener", "onClick", str3);
            return;
        }
        C87412m.m108603p("nickEdt");
        throw null;
    }
}
