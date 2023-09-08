package x63;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import yq3.C79143a;

/* renamed from: x63.a */
public class C78771a extends C75282g {

    /* renamed from: c */
    public Bundle f230508c;

    public C78771a(MMActivity mMActivity, C75296i iVar, Bundle bundle) {
        super(mMActivity, iVar);
        this.f230508c = bundle;
    }

    /* renamed from: d */
    public boolean mo91271d(Object... objArr) {
        this.f230508c.putString("key_pwd1", objArr[0]);
        this.f221419b.mo95362b(new C78772c(this.f230508c.getString("key_pwd1")), true);
        return true;
    }

    /* renamed from: e */
    public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C78772c)) {
            return false;
        }
        C78772c cVar = (C78772c) yVar;
        if (!Util.isNullOrNil(cVar.f230509d)) {
            Log.m105918d("MicroMsg.CommonCheckPwdController", "hy: check pwd pass");
            this.f230508c.putString("payu_reference", cVar.f230509d);
            C79143a.m95765d(this.f221418a, this.f230508c);
            return false;
        }
        Log.m105928w("MicroMsg.CommonCheckPwdController", "hy: check pwd failed");
        return false;
    }
}
