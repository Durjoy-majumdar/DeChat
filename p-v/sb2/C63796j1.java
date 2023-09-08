package sb2;

import android.content.Context;
import di3.C86312j;
import gy3.C87412m;
import od3.C62001a;
import p640ox.C77049b;
import te3.C64291co3;

/* renamed from: sb2.j1 */
public final class C63796j1 {

    /* renamed from: a */
    public final Context f180857a;

    /* renamed from: b */
    public long f180858b;

    public C63796j1(Context context, long j) {
        C87412m.m108594g(context, "context");
        this.f180857a = context;
        this.f180858b = j;
    }

    /* renamed from: a */
    public final void mo88590a(long j, int i, String str, int i2, String str2) {
        C87412m.m108594g(str, "msgType");
        C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(this.f180857a, 14, C64291co3.class);
        if (co32 != null) {
            co32.f182547o = (int) (j - this.f180858b);
        }
        if (co32 != null) {
            co32.f182539d = i;
        }
        if (co32 != null) {
            co32.f182545j = str;
        }
        if (co32 != null) {
            co32.f182544i = i2;
        }
        if (!(str2 == null || co32 == null)) {
            co32.f182549q = str2;
        }
        C62001a.f176265a.mo86878a(this.f180857a);
    }
}
