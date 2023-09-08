package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMSingelLinePanel;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactLabelPreference */
public class ContactLabelPreference extends Preference {

    /* renamed from: J */
    public MMSingelLinePanel f202564J;

    /* renamed from: K */
    public TextView f202565K;

    /* renamed from: L */
    public ArrayList<String> f202566L;

    public ContactLabelPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        ArrayList<String> arrayList;
        this.f202565K = (TextView) view.findViewById(C0966R.C0970id.knx);
        MMSingelLinePanel mMSingelLinePanel = (MMSingelLinePanel) view.findViewById(C0966R.C0970id.bp_);
        this.f202564J = mMSingelLinePanel;
        mMSingelLinePanel.setSingleLine(true);
        MMSingelLinePanel mMSingelLinePanel2 = this.f202564J;
        mMSingelLinePanel2.f214925i = false;
        mMSingelLinePanel2.mo101809k(false);
        TextView textView = this.f202565K;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (!(this.f202564J == null || (arrayList = this.f202566L) == null || arrayList.size() <= 0)) {
            MMSingelLinePanel mMSingelLinePanel3 = this.f202564J;
            ArrayList<String> arrayList2 = this.f202566L;
            mMSingelLinePanel3.mo95190q(arrayList2, arrayList2);
        }
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdo, viewGroup2);
        return x;
    }

    public ContactLabelPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f202566L = new ArrayList<>();
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
