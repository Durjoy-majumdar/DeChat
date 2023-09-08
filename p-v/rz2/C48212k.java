package rz2;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import uz2.C52718u;
import wz2.C53275g;
import z04.C112551y;

/* renamed from: rz2.k */
public final class C48212k extends C53275g {

    /* renamed from: Q */
    public static final IAutoDBItem.MAutoDBInfo f129194Q = C53275g.initAutoDBInfo(C53275g.class);

    /* renamed from: P */
    public C52718u f129195P;

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f129194Q;
        C87412m.m108593f(mAutoDBInfo, "_dbInfo");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public final C52718u mo72977l2() {
        String str = this.field_textStatusExtInfo;
        boolean z = true;
        if (str != null && str.hashCode() == 0) {
            return this.f129195P;
        }
        String str2 = this.field_textStatusExtInfo;
        if (str2 != null && !C112551y.m153811k(str2)) {
            z = false;
        }
        if (z) {
            return null;
        }
        C52718u uVar = new C52718u();
        try {
            uVar.parseFrom(Base64.decode(str2, 0));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusStrangerContact", th, "getStatus err", new Object[0]);
        }
        this.f129195P = uVar;
        return uVar;
    }
}
