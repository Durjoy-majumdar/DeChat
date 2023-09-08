package ix1;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import rx3.C13604l;

/* renamed from: ix1.h0 */
public final class C46324h0 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ String f124812d;

    /* renamed from: e */
    public final /* synthetic */ String f124813e;

    public C46324h0(String str, String str2) {
        this.f124812d = str;
        this.f124813e = str2;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            C46326i0.f124817a.put(new C13604l(this.f124812d, this.f124813e), Long.valueOf(System.currentTimeMillis()));
            return 0;
        }
        C76912y0.m92767f(MMApplicationContext.getContext(), str);
        return 0;
    }
}
