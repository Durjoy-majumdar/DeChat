package o32;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import l32.C76668c;
import m32.C76741b;
import te3.C64725t83;

/* renamed from: o32.f */
public class C76990f implements C76987a {

    /* renamed from: a */
    public C47327b f224978a = null;

    /* renamed from: b */
    public String f224979b = null;

    /* renamed from: c */
    public String f224980c = null;

    /* renamed from: d */
    public byte[] f224981d;

    /* renamed from: e */
    public C64725t83 f224982e;

    /* renamed from: f */
    public RealnameGuideHelper f224983f;

    /* renamed from: g */
    public int f224984g = -1;

    /* renamed from: o32.f$a */
    public class C76991a implements C76668c {
        public C76991a() {
        }

        /* renamed from: a */
        public void mo106933a(int i, Intent intent) {
            if (i == -1) {
                C76990f fVar = C76990f.this;
                C47327b bVar = fVar.f224978a;
                if (bVar == null) {
                    Log.m105920e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.succeed ui == null");
                    return;
                }
                bVar.mo95258s1();
                fVar.f224978a.mo106931T1(-1, new Intent());
                return;
            }
            C76990f.this.mo107309a(intent);
        }
    }

    /* renamed from: a */
    public final void mo107309a(Intent intent) {
        C47327b bVar = this.f224978a;
        if (bVar == null) {
            Log.m105920e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.fail ui == null");
            return;
        }
        bVar.mo95258s1();
        this.f224978a.mo106931T1(0, intent);
    }

    /* renamed from: b */
    public final void mo107310b() {
        Intent intent = new Intent();
        intent.putExtra("key_sendid", this.f224980c);
        intent.putExtra("key_appid", this.f224979b);
        if (this.f224982e != null) {
            Bundle bundle = new Bundle();
            try {
                bundle.putByteArray("key_data", this.f224982e.toByteArray());
                intent.putExtras(bundle);
                intent.putExtra("key_from", "value_open");
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WxaReceiveLuckyMoneyLogic", e, "goLuckyMoneyDetailUI WxaDetailResponse putByteArray error", new Object[0]);
                mo107309a(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{byte detail response fail}}"));
                return;
            }
        } else {
            intent.putExtra("key_from", "value_query");
        }
        this.f224978a.mo106932Z4(C76741b.class, intent, new C76991a());
    }
}
