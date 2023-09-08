package p281yz;

import android.content.Context;
import b63.C67192l0;
import b63.C67195n;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C30644o;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tenpay.ndk.CertUtil;
import com.tenpay.ndk.WxSmCertUtil;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import p206nj.C88957l;
import yc3.C38992a;

@C86522b(dependencies = {C30644o.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: yz.t */
public class C79171t extends C86301e {

    /* renamed from: d */
    public volatile C67192l0 f232471d;

    /* renamed from: yz.t$a */
    public static class C79172a implements C38992a {
        /* renamed from: a */
        public boolean mo38a(Context context, String[] strArr, String str) {
            String str2 = strArr[0];
            str2.getClass();
            if (!str2.equals("//cleanpaycn")) {
                return false;
            }
            C75108e.m90085b().getClass();
            Log.m105919d("MicroMsg.CertUtilWx", "clean allcrt stack %s", Util.getStack().toString());
            CertUtil.getInstance().clearAllCert();
            WxSmCertUtil.getInstance().clearAllCert();
            return true;
        }
    }

    public C79171t() {
        if (C67192l0.f192913a == null) {
            C67192l0.f192913a = new C67192l0();
        }
        this.f232471d = C67192l0.f192913a;
    }

    public void onAccountReleased(Context context) {
        this.f232471d.getClass();
        ArrayList<C67195n> arrayList = C67192l0.f192914b;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void onCreate(Context context) {
        C88957l.m111078n("tenpay_utils");
        C75108e.m90085b().mo104814e(MMApplicationContext.getContext());
        C30650a.m39147b(new C79172a(), "//cleanpaycn");
    }
}
