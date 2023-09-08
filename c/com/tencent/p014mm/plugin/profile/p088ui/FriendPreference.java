package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import p196ln.C10579k;
import p196ln.C76708i;

/* renamed from: com.tencent.mm.plugin.profile.ui.FriendPreference */
public class FriendPreference extends Preference implements C10579k.C10580a {

    /* renamed from: J */
    public TextView f20200J;

    /* renamed from: K */
    public boolean f20201K;

    /* renamed from: L */
    public MMActivity f20202L;

    public FriendPreference(Context context) {
        super(context);
        this.f20202L = (MMActivity) context;
        mo5911I();
    }

    /* renamed from: I */
    public final void mo5911I() {
        this.f20201K = false;
    }

    /* renamed from: J */
    public final void mo5912J() {
        Log.m105918d("MicroMsg.FriendPreference", "initView : contact = " + null + " bindView = " + this.f20201K);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        Class cls = C76708i.class;
        long kw02 = ((C76708i) C86312j.m106911c(cls)).kw0(str);
        if (kw02 > 0 && 0 == kw02 && ((C76708i) C86312j.m106911c(cls)).N50(str) != null) {
            mo5912J();
        }
        int i = C72996z1.f214113Y1;
        long j = -1;
        if (str != null && str.endsWith("@fb")) {
            try {
                j = Util.getLong(str.split("@")[0], -1);
            } catch (Exception unused) {
            }
        }
        if (j == 0 && ((C76708i) C86312j.m106911c(cls)).N50(str) != null) {
            mo5912J();
        }
    }

    /* renamed from: r */
    public CharSequence mo5913r() {
        return this.f20200J.getText().toString();
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
        this.f20200J = (TextView) view.findViewById(C0966R.C0970id.k_z);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.gwc);
        this.f20201K = true;
        mo5912J();
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdi, viewGroup2);
        return x;
    }

    public FriendPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20202L = (MMActivity) context;
        mo5911I();
    }

    public FriendPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
        this.f121272H = C0966R.C0971layout.f359893bf2;
        mo5911I();
    }
}
