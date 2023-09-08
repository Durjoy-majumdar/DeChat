package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.text.SpannableString;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$d */
public class RealNameVerifyProcess$$d extends C75282g {
    public RealNameVerifyProcess$$d(RealNameVerifyProcess realNameVerifyProcess, MMActivity mMActivity, C75296i iVar) {
        super(mMActivity, iVar);
    }

    /* renamed from: a */
    public CharSequence mo91282a(int i) {
        if (i != 0) {
            return null;
        }
        String string = this.f221418a.getString(C0966R.string.l65);
        String string2 = this.f221418a.getString(C0966R.string.f361605l61);
        String string3 = this.f221418a.getString(C0966R.string.l6a, new Object[]{string, string2});
        C72478z zVar = new C72478z(this.f221418a);
        SpannableString spannableString = new SpannableString(string3);
        spannableString.setSpan(zVar, string3.length() - string2.length(), string3.length(), 33);
        return spannableString.subSequence(0, spannableString.length());
    }

    /* renamed from: d */
    public boolean mo91271d(Object... objArr) {
        return false;
    }

    /* renamed from: e */
    public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
