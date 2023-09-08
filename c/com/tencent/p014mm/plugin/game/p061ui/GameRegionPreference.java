package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.game.model.C42046d;

/* renamed from: com.tencent.mm.plugin.game.ui.GameRegionPreference */
public class GameRegionPreference extends Preference {

    /* renamed from: J */
    public C42228a f114140J;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameRegionPreference$a */
    public static class C42228a {

        /* renamed from: a */
        public String f114141a;

        /* renamed from: b */
        public String f114142b;

        /* renamed from: c */
        public String f114143c;

        /* renamed from: d */
        public String f114144d;

        /* renamed from: e */
        public boolean f114145e;

        /* renamed from: f */
        public boolean f114146f;
    }

    public GameRegionPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        C42228a aVar;
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.ikk);
        CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.k0t);
        if (textView != null && checkBox != null && (aVar = this.f114140J) != null) {
            textView.setText(C42046d.m45750i(aVar));
            checkBox.setChecked(this.f114140J.f114145e);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.axm, viewGroup2);
        return x;
    }

    public GameRegionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
