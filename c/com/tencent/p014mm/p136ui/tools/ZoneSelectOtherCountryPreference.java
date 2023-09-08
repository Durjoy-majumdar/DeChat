package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.MultiStageCitySelectUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference */
public class ZoneSelectOtherCountryPreference extends Preference {

    /* renamed from: J */
    public String f348596J;

    /* renamed from: K */
    public C116145b f348597K;

    /* renamed from: com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference$a */
    public class C116144a implements View.OnClickListener {
        public C116144a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/ZoneSelectOtherCountryPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C116145b bVar = ZoneSelectOtherCountryPreference.this.f348597K;
            if (bVar != null) {
                MultiStageCitySelectUI.C116134b bVar2 = (MultiStageCitySelectUI.C116134b) bVar;
                bVar2.getClass();
                Intent intent = new Intent(MultiStageCitySelectUI.this, MultiStageCitySelectUI.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("GetAddress", MultiStageCitySelectUI.this.f348560q);
                bundle.putBoolean("ShowSelectedLocation", MultiStageCitySelectUI.this.f348562s);
                bundle.putBoolean("IsSelectNonChinaCountry", true);
                bundle.putBoolean("IsAutoPosition", false);
                bundle.putBoolean("IsNeedShowSearchBar", true);
                intent.putExtras(bundle);
                if (!MultiStageCitySelectUI.this.f348547C.isEmpty()) {
                    intent.putStringArrayListExtra("BlockedCountries", MultiStageCitySelectUI.this.f348547C);
                }
                MultiStageCitySelectUI.this.startActivityForResult(intent, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/ZoneSelectOtherCountryPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference$b */
    public interface C116145b {
    }

    public ZoneSelectOtherCountryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.lvn);
        if (!Util.isNullOrNil(this.f348596J)) {
            textView.setText(this.f348596J);
        }
        view.setOnClickListener(new C116144a());
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f359890be3, viewGroup2);
        return x;
    }

    public ZoneSelectOtherCountryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
