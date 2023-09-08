package com.tencent.p014mm.pluginsdk.p133ui.preference;

import a22.C67001a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.LabelPreference */
public class LabelPreference extends Preference {

    /* renamed from: J */
    public C72996z1 f212406J;

    /* renamed from: K */
    public TextView f212407K;

    /* renamed from: L */
    public TextView f212408L;

    /* renamed from: M */
    public View f212409M;

    /* renamed from: N */
    public C44673z4 f212410N;

    public LabelPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Class cls = C76979h.class;
        super.mo1086w(view);
        if (this.f212406J == null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/LabelPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/preference/LabelPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/LabelPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/preference/LabelPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f212407K == null) {
            this.f212407K = (TextView) view.findViewById(C0966R.C0970id.bny);
        }
        if (this.f212408L == null) {
            this.f212408L = (TextView) view.findViewById(C0966R.C0970id.bnz);
        }
        TextView textView = this.f212408L;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(this.f121274d, C0966R.dimen.f3815f9);
            this.f212408L.setLayoutParams(layoutParams);
        }
        this.f212407K.setVisibility(0);
        if (this.f212406J.mo62927s3()) {
            String r2 = this.f212406J.mo73974r2();
            ArrayList arrayList = (ArrayList) ((C67001a) C28250a.m38138a()).mo90972j(r2);
            if (!Util.isNullOrNil(r2) && arrayList != null && arrayList.size() > 0) {
                TextView textView2 = this.f212407K;
                Context context = this.f121274d;
                textView2.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, Util.listToString(arrayList, context.getResources().getString(C0966R.string.bid))));
                return;
            }
            return;
        }
        C44673z4 z4Var = this.f212410N;
        if (z4Var != null) {
            String str = z4Var.field_contactLabels;
            ArrayList arrayList2 = (ArrayList) ((C67001a) C28250a.m38138a()).mo90969g(str);
            if (!Util.isNullOrNil(str) && arrayList2 != null && arrayList2.size() > 0) {
                TextView textView3 = this.f212407K;
                Context context2 = this.f121274d;
                textView3.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context2, Util.listToString(arrayList2, context2.getResources().getString(C0966R.string.bid))));
            }
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f212409M == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            LayoutInflater.from(this.f121274d).inflate(C0966R.C0971layout.boj, viewGroup2);
            this.f212409M = x;
        }
        return this.f212409M;
    }

    public LabelPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LabelPreference(Context context) {
        super(context);
    }
}
