package d00;

import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import e00.C31379w;
import ea3.C45586c;
import ei3.C86522b;

@C86522b
/* renamed from: d00.w */
public final class C31028w extends C86301e implements C31379w {
    /* renamed from: lF */
    public String mo57932lF(String str, int i) {
        C45586c cVar = C45586c.f123303a;
        cVar.getClass();
        if (Util.isNullOrNil(str)) {
            return "";
        }
        if (-1 == i) {
            return C45586c.m50628b(cVar, String.valueOf(str), false, 2, (Object) null);
        }
        return C45586c.m50628b(cVar, String.valueOf(str), false, 2, (Object) null) + "|itemShowType=" + i;
    }
}
