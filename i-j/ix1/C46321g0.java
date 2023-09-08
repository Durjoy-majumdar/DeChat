package ix1;

import com.tencent.p014mm.autogen.events.CancelTickleMsgEvent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import rx3.C13604l;

/* renamed from: ix1.g0 */
public final class C46321g0 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ String f124805d;

    /* renamed from: e */
    public final /* synthetic */ String f124806e;

    /* renamed from: f */
    public final /* synthetic */ long f124807f;

    public C46321g0(String str, String str2, long j) {
        this.f124805d = str;
        this.f124806e = str2;
        this.f124807f = j;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            C46326i0.f124818b.remove(new C13604l(this.f124805d, this.f124806e));
            CancelTickleMsgEvent cancelTickleMsgEvent = new CancelTickleMsgEvent();
            cancelTickleMsgEvent.f107393d.f107394a = this.f124807f;
            cancelTickleMsgEvent.publish();
            return 0;
        }
        C76912y0.m92767f(MMApplicationContext.getContext(), str);
        return 0;
    }
}
