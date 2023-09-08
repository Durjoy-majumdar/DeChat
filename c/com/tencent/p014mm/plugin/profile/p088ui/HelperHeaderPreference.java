package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C7018q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import junit.framework.Assert;
import p196ln.C76705f;

@Deprecated
/* renamed from: com.tencent.mm.plugin.profile.ui.HelperHeaderPreference */
public class HelperHeaderPreference extends Preference {

    /* renamed from: J */
    public TextView f115328J;

    /* renamed from: K */
    public ImageView f115329K;

    /* renamed from: L */
    public TextView f115330L;

    /* renamed from: M */
    public TextView f115331M;

    /* renamed from: N */
    public C72996z1 f115332N;

    /* renamed from: P */
    public C42607a f115333P;

    /* renamed from: Q */
    public boolean f115334Q = false;

    /* renamed from: com.tencent.mm.plugin.profile.ui.HelperHeaderPreference$a */
    public interface C42607a {
        /* renamed from: a */
        void mo66739a(HelperHeaderPreference helperHeaderPreference);

        CharSequence getHint();

        void onDetach();
    }

    public HelperHeaderPreference(Context context) {
        super(context);
    }

    /* renamed from: I */
    public final void mo66736I() {
        C72996z1 z1Var;
        if (!this.f115334Q || (z1Var = this.f115332N) == null) {
            Log.m105928w("MicroMsg.HelperHeaderPreference", "initView : bindView = " + this.f115334Q + "contact = " + this.f115332N);
            return;
        }
        String username = z1Var.getUsername();
        Log.m105918d("MicroMsg.HelperHeaderPreference", "updateAvatar : user = " + username);
        if (this.f115329K != null && this.f115332N.getUsername().equals(username)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f115329K, username);
        }
        TextView textView = this.f115328J;
        if (textView != null) {
            textView.setText(this.f115332N.mo62909j3());
        }
        C42607a aVar = this.f115333P;
        if (aVar != null) {
            aVar.mo66739a(this);
            CharSequence hint = this.f115333P.getHint();
            if (hint != null) {
                this.f115331M.setText(hint);
                this.f115331M.setVisibility(0);
                return;
            }
            this.f115331M.setVisibility(8);
        }
    }

    /* renamed from: J */
    public void mo66737J(C72996z1 z1Var, C42607a aVar) {
        C42607a aVar2 = this.f115333P;
        if (aVar2 != null) {
            aVar2.onDetach();
        }
        Assert.assertTrue(z1Var != null);
        this.f115332N = z1Var;
        this.f115333P = aVar;
        mo66736I();
    }

    /* renamed from: K */
    public void mo66738K(boolean z) {
        if (this.f115333P != null) {
            if (z) {
                this.f115330L.setTextColor(C7018q1.m7264b(this.f121274d));
                this.f115330L.setText(C0966R.string.iwu);
                this.f115330L.setCompoundDrawablesWithIntrinsicBounds(C0966R.C0969drawable.f357362bm1, 0, 0, 0);
                return;
            }
            this.f115330L.setTextColor(C7018q1.m7263a(this.f121274d));
            this.f115330L.setText(C0966R.string.f361322ix1);
            this.f115330L.setCompoundDrawablesWithIntrinsicBounds(C0966R.C0969drawable.f357361bm0, 0, 0, 0);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f115329K = (ImageView) view.findViewById(C0966R.C0970id.bmx);
        this.f115330L = (TextView) view.findViewById(C0966R.C0970id.boq);
        this.f115328J = (TextView) view.findViewById(C0966R.C0970id.bo9);
        this.f115331M = (TextView) view.findViewById(C0966R.C0970id.bnv);
        this.f115334Q = true;
        mo66736I();
        super.mo1086w(view);
    }

    public HelperHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HelperHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
