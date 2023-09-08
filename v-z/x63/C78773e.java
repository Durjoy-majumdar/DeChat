package x63;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import yq3.C79143a;

/* renamed from: x63.e */
public class C78773e extends C75282g {

    /* renamed from: c */
    public final /* synthetic */ C78774f f230510c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78773e(C78774f fVar, MMActivity mMActivity, C75296i iVar) {
        super(mMActivity, iVar);
        this.f230510c = fVar;
    }

    /* renamed from: d */
    public boolean mo91271d(Object... objArr) {
        this.f221419b.mo95362b(new C53293d(this.f230510c.f232423c.getString("payu_reference"), objArr[0].f192984b), true);
        return true;
    }

    /* renamed from: e */
    public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C53293d) {
            Log.m105918d("MicroMsg.PayUBaseChangePwdProcess", "hy: forget pwd user success");
            if (i == 0 && i2 == 0) {
                this.f230510c.f232423c.putInt("key_errcode_payu", 0);
                C79143a.m95764c(this.f221418a, this.f230510c.f232423c, 0);
                return true;
            }
        }
        return false;
    }
}
