package p279yl;

import ap3.C27996a;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: yl.f */
public class C39035f extends C27996a {
    public C39035f(C39030c cVar) {
    }

    /* renamed from: a */
    public boolean mo55746a() {
        return MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1) >= 25000000000L;
    }
}
