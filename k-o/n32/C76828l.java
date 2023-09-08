package n32;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ie3.C76331i;
import k32.C46641f;
import ob0.C89132b;
import te3.C51013qt3;
import te3.C51156rt3;

/* renamed from: n32.l */
public class C76828l implements C76816a, MMActivity.C6739d {

    /* renamed from: d */
    public C76818c f224645d;

    /* renamed from: e */
    public String f224646e = null;

    /* renamed from: f */
    public C51156rt3 f224647f;

    /* renamed from: g */
    public boolean f224648g;

    /* renamed from: h */
    public final int f224649h = (hashCode() & 65535);

    /* renamed from: n32.l$a */
    public class C76829a implements C87581a<Void, C89132b.C89134c<C51156rt3>> {
        public C76829a() {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C76828l lVar = C76828l.this;
                C51156rt3 rt32 = (C51156rt3) cVar.f256796d;
                lVar.f224647f = rt32;
                if (rt32 == null) {
                    lVar.mo107096a(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Request resp is nil}}"));
                } else if (rt32.f141144h != 0 || rt32.f141140d.equalsIgnoreCase("")) {
                    C51156rt3 rt33 = C76828l.this.f224647f;
                    Log.m105925i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB fail.  sendid = [%s] reqkey = [%s] wxahb_status = [%d]", rt33.f141141e, rt33.f141140d, Integer.valueOf(rt33.f141144h));
                    C76828l lVar2 = C76828l.this;
                    Intent putExtra = new Intent().putExtra("result_error_code", -1);
                    lVar2.mo107096a(putExtra.putExtra("result_error_msg", "fail:system error {{service error Request errStatus = " + C76828l.this.f224647f.f141144h + ",errMsg" + C76828l.this.f224647f.f141145i + "}}"));
                    return null;
                } else {
                    C51156rt3 rt34 = (C51156rt3) cVar.f256796d;
                    Log.m105925i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB succeed sendid = [%s] reqkey = [%s]", rt34.f141141e, rt34.f141140d);
                    C76828l lVar3 = C76828l.this;
                    String str = lVar3.f224647f.f141140d;
                    C76818c cVar2 = lVar3.f224645d;
                    if (cVar2 == null) {
                        Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "doWalletPay() called with: ui == null");
                        return null;
                    }
                    MMActivity t = cVar2.mo95266t();
                    t.mmSetOnActivityResultCallback(lVar3);
                    PayInfo payInfo = new PayInfo();
                    payInfo.f212592j = str;
                    payInfo.f212587e = 37;
                    payInfo.f212589g = 50;
                    C76331i.m91761e(t, payInfo, lVar3.f224649h);
                    return null;
                }
            }
            Log.m105925i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB fail. [%d, %d, %s]", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            C76828l lVar4 = C76828l.this;
            Intent putExtra2 = new Intent().putExtra("result_error_code", -1);
            lVar4.mo107096a(putExtra2.putExtra("result_error_msg", "fail:system error {{service error Request errType = " + cVar.f256793a + ",errCode" + cVar.f256794b + "}}"));
            return null;
        }
    }

    /* renamed from: a */
    public final void mo107096a(Intent intent) {
        this.f224648g = false;
        C76818c cVar = this.f224645d;
        if (cVar != null) {
            cVar.mo106931T1(0, intent);
        }
    }

    /* renamed from: b */
    public final void mo107097b(C51013qt3 qt32) {
        Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl ");
        if (this.f224648g) {
            Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl isRequesting");
            return;
        }
        this.f224648g = true;
        new C46641f(qt32).mo71901a(new C76829a());
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() called with: requestCode = [" + i + "], resultCode = [" + i2 + "], data = [" + intent + "]");
        if (i != this.f224649h) {
            return;
        }
        if (i2 == -1) {
            this.f224645d.mo106932Z4(C76817b.class, new Intent(), new C76830m(this));
            return;
        }
        Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() REQUEST_CODE_WALLET called cancel ");
        mo107096a(new Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:pay fail"));
    }
}
