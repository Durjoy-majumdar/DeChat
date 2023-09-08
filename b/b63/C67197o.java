package b63;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75283h;
import nj3.C76879j;
import ob0.C117747y;
import p910lj.C76701a;

/* renamed from: b63.o */
public class C67197o {

    /* renamed from: a */
    public int f192923a;

    /* renamed from: b */
    public String f192924b;

    /* renamed from: c */
    public boolean f192925c;

    /* renamed from: b */
    public static C67197o m79487b(int i, int i2) {
        C67197o oVar = new C67197o();
        oVar.f192925c = false;
        oVar.f192923a = i;
        oVar.f192924b = "";
        return oVar;
    }

    /* renamed from: c */
    public static C67197o m79488c(int i, String str) {
        C67197o oVar = new C67197o();
        oVar.f192925c = true;
        oVar.f192923a = i;
        oVar.f192924b = str;
        return oVar;
    }

    /* renamed from: a */
    public void mo91297a(Context context, boolean z) {
        if (this.f192925c) {
            if (!(context instanceof WalletBaseUI ? C75283h.m90311a((WalletBaseUI) context, (C117747y) null, 1000, this.f192923a, this.f192924b) : false) && !Util.isNullOrNil(this.f192924b)) {
                if (z) {
                    C76701a.makeText(context, (CharSequence) this.f192924b, 1).show();
                } else {
                    C76879j.m92712F(context, this.f192924b, "", false);
                }
            }
        } else {
            C76879j.m92712F(context, context.getString(C0966R.string.kxh), "", false);
        }
    }
}
