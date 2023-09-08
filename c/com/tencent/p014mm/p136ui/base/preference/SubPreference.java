package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.base.preference.SubPreference */
public class SubPreference extends Preference {

    /* renamed from: J */
    public View f121294J;

    /* renamed from: com.tencent.mm.ui.base.preference.SubPreference$a */
    public class C44717a implements View.OnClickListener {
        public C44717a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/SubPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SubPreference subPreference = SubPreference.this;
            subPreference.f121276f.mo24588a(subPreference);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/preference/SubPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.SubPreference$b */
    public class C44718b implements View.OnLongClickListener {
        public C44718b() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/SubPreference$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SubPreference subPreference = SubPreference.this;
            ((NewBizInfoMoreInofUI.C42647a) subPreference.f121277g).mo66781a(subPreference);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/base/preference/SubPreference$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public SubPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        View findViewById = view.findViewById(C0966R.C0970id.iwg);
        this.f121294J = findViewById;
        if (this.f121276f != null) {
            findViewById.setOnClickListener(new C44717a());
        }
        if (this.f121277g != null) {
            view.setOnLongClickListener(new C44718b());
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bfk, viewGroup2);
        return x;
    }

    public SubPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
