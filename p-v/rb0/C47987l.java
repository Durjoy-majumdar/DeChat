package rb0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38665t0;

/* renamed from: rb0.l */
public class C47987l extends C38665t0 {

    /* renamed from: x */
    public static IAutoDBItem.MAutoDBInfo f128701x = C38665t0.initAutoDBInfo(C47987l.class);

    public C47987l() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r4 = rb0.C48009v0.Hx0().mo72780Lo(r4.f230732P);
     */
    /* renamed from: l2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m53344l2(com.tencent.p014mm.storage.C72963f4 r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0038
            java.lang.String r1 = r4.mo108768t()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x000e
            goto L_0x0038
        L_0x000e:
            int r1 = r4.f230739W
            r2 = 1
            r3 = 2
            if (r1 != r3) goto L_0x0015
            return r2
        L_0x0015:
            java.lang.String r1 = r4.f230732P
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = r4.mo108768t()
            boolean r1 = rb0.C47984k.m53340n(r1)
            if (r1 == 0) goto L_0x0038
            rb0.n r1 = rb0.C48009v0.Hx0()
            java.lang.String r4 = r4.f230732P
            rb0.l r4 = r1.mo72780Lo(r4)
            if (r4 == 0) goto L_0x0038
            int r4 = r4.field_kfType
            if (r4 != r3) goto L_0x0038
            return r2
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rb0.C47987l.m53344l2(com.tencent.mm.storage.f4):boolean");
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f128701x;
    }

    public C47987l(String str, String str2, String str3, String str4, int i, long j) {
        this.field_openId = str;
        this.field_brandUsername = str2;
        this.field_headImgUrl = str3;
        this.field_nickname = str4;
        this.field_kfType = i;
        this.field_updateTime = j;
    }
}
