package p921uv;

import android.content.Context;
import gy3.C87412m;
import je0.C60794u;
import p239sv.C77793t;
import z04.C112551y;

/* renamed from: uv.d */
public final class C78286d extends C78284c {

    /* renamed from: g */
    public final String f229317g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78286d(Context context, String str, int i, byte[] bArr, C77793t tVar) {
        super(context, i, bArr, tVar);
        C87412m.m108594g(context, "context");
        this.f229317g = str;
    }

    /* renamed from: a */
    public C60794u mo108305a() {
        String str = this.f229317g;
        if (!(str == null || C112551y.m153811k(str))) {
            return new C60794u(this.f229317g, this.f229310b, this.f229311c);
        }
        mo108306b(false, "url is nullOrBlank:" + this.f229317g, (String) null);
        return null;
    }
}
