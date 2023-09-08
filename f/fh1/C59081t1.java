package fh1;

import cj1.C54741c;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: fh1.t1 */
public final class C59081t1 extends C87413o implements C32226l<C54741c, Boolean> {

    /* renamed from: d */
    public static final C59081t1 f169036d = new C59081t1();

    public C59081t1() {
        super(1);
    }

    public Object invoke(Object obj) {
        C54741c cVar = (C54741c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        NativeInfo nativeInfo = cVar.f153440d.native_info;
        boolean z = false;
        if (nativeInfo != null && nativeInfo.native_type == 9) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
