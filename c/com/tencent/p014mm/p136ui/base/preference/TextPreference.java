package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.profile.NewContactWidgetNormal;
import di3.C86312j;
import java.util.ArrayList;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.ui.base.preference.TextPreference */
public class TextPreference extends Preference {

    /* renamed from: J */
    public int f215115J;

    /* renamed from: K */
    public CharSequence f215116K;

    /* renamed from: L */
    public TextView f215117L;

    /* renamed from: M */
    public Context f215118M;

    /* renamed from: N */
    public C73243a f215119N;

    /* renamed from: com.tencent.mm.ui.base.preference.TextPreference$a */
    public interface C73243a {
    }

    public TextPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(16908310);
        this.f215117L = textView;
        if (textView != null) {
            textView.setText(this.f215116K);
            this.f215117L.setGravity(this.f215115J);
        }
        C73243a aVar = this.f215119N;
        if (aVar != null) {
            TextView textView2 = this.f215117L;
            NewContactWidgetNormal.C70136n nVar = (NewContactWidgetNormal.C70136n) aVar;
            TextPreference textPreference = nVar.f202463a;
            String str = nVar.f202464b;
            NewContactWidgetNormal.this.f202419d.getResources().getDimension(C0966R.dimen.f3703bv);
            TextView textView3 = textPreference.f215117L;
            if (textView3 != null) {
                textPreference.f215116K = str;
                textPreference.f215115J = 17;
                textView3.setGravity(17);
            }
            MMActivity mMActivity = NewContactWidgetNormal.this.f202419d;
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://www.wechat.com/tpl/oversea/new/page/difference_of_users/index");
            ((C76979h) C86312j.m106911c(C76979h.class)).mo107047GG(mMActivity, arrayList, nVar.f202464b, nVar.f202465c, textView2);
        }
        view.setImportantForAccessibility(TextUtils.isEmpty(this.f215117L.getText()) ? 4 : 0);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        return super.mo1087x(viewGroup);
    }

    public TextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f215118M = context;
        this.f121271G = C0966R.C0971layout.bef;
    }
}
