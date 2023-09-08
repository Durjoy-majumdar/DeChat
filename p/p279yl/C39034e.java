package p279yl;

import ap3.C27996a;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: yl.e */
public class C39034e extends C27996a {
    public C39034e(C39030c cVar) {
    }

    /* renamed from: a */
    public boolean mo55746a() {
        return MultiProcessMMKV.getDefault().getInt("heavy_user_session_cnt", -1) >= 520;
    }
}
