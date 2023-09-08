package y63;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import yq3.C79143a;

/* renamed from: y63.a */
public class C79057a extends C75282g {

    /* renamed from: c */
    public Bundle f232155c;

    public C79057a(MMActivity mMActivity, C75296i iVar, Bundle bundle) {
        super(mMActivity, iVar);
        this.f232155c = bundle;
    }

    /* renamed from: c */
    public boolean mo91280c(Object... objArr) {
        this.f221419b.mo95362b(new C79059c(this.f232155c.getString("payu_reference")), true);
        return true;
    }

    /* renamed from: d */
    public boolean mo91271d(Object... objArr) {
        String string = this.f232155c.getString("key_question_answer");
        this.f221419b.mo95362b(new C79058b(this.f232155c.getString("payu_reference"), ((PayUSecurityQuestion) this.f232155c.getParcelable("key_security_question")).f211175d, string), true);
        return false;
    }

    /* renamed from: e */
    public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
        if ((yVar instanceof C79059c) && i == 0 && i2 == 0) {
            C79059c cVar = (C79059c) yVar;
            this.f232155c.putParcelable("key_security_question", new PayUSecurityQuestion(cVar.f232158d, cVar.f232159e));
            return false;
        }
        if (yVar instanceof C79058b) {
            C79058b bVar = (C79058b) yVar;
            if (i == 0 && i2 == 0 && bVar.f232156d) {
                this.f232155c.putString("payu_reference", bVar.f232157e);
                C79143a.m95765d(this.f221418a, this.f232155c);
                return true;
            }
        }
        return false;
    }
}
