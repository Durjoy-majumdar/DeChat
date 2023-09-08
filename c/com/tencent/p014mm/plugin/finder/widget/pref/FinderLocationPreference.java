package com.tencent.p014mm.plugin.finder.widget.pref;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import d62.C75339i;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/widget/pref/FinderLocationPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference */
public final class FinderLocationPreference extends Preference {

    /* renamed from: J */
    public View f18830J;

    /* renamed from: K */
    public boolean f18831K;

    /* renamed from: L */
    public boolean f18832L;

    /* renamed from: M */
    public String f18833M = "";

    /* renamed from: N */
    public String f18834N = "";

    /* renamed from: P */
    public String f18835P = "";

    public FinderLocationPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }

    /* renamed from: I */
    public final void mo5205I() {
        if (!C87412m.m108589b(this.f18833M, "unshow")) {
            if (!(this.f18833M.length() == 0)) {
                String l = RegionCodeDecoder.m124563k().mo135576l(this.f18833M);
                String m = RegionCodeDecoder.m124563k().mo135577m(this.f18833M, this.f18834N);
                String f = RegionCodeDecoder.m124563k().mo135571f(this.f18833M, this.f18834N, this.f18835P);
                if (!Util.isNullOrNil(f)) {
                    mo69924H(((C75339i) C86312j.m106911c(C75339i.class)).K90(m) + ' ' + f);
                    return;
                } else if (!Util.isNullOrNil(m)) {
                    mo69924H(l + ' ' + m);
                    return;
                } else if (!Util.isNullOrNil(l)) {
                    mo69924H(l);
                    return;
                } else {
                    return;
                }
            }
        }
        mo69924H(this.f121274d.getString(C0966R.string.eov));
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        C87412m.m108594g(view, "view");
        super.mo1086w(view);
        int i = 8;
        mo69921C(8);
        View findViewById = view.findViewById(C0966R.C0970id.k0t);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((WeImageView) findViewById).setVisibility(this.f18831K ? 0 : 8);
        View findViewById2 = view.findViewById(C0966R.C0970id.g47);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        WeImageView weImageView = (WeImageView) findViewById2;
        if (this.f18832L) {
            i = 0;
        }
        weImageView.setVisibility(i);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "parent");
        View x = super.mo1087x(viewGroup);
        View findViewById = x.findViewById(C0966R.C0970id.br8);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.alb, viewGroup2);
        this.f18830J = x;
        return x;
    }

    public FinderLocationPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FinderLocationPreference(Context context) {
        super(context);
    }
}
