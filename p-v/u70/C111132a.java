package u70;

import a90.C103332d;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import y80.C112399d;
import y80.C112404e;
import y80.C112405g;
import y80.C66558h;

@C86522b
/* renamed from: u70.a */
public final class C111132a extends C86301e implements C66558h {
    /* renamed from: Up */
    public C112405g mo90623Up(boolean z, boolean z2, boolean z3) {
        if (z3) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            return new C103332d(context);
        } else if (z2) {
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            return new C112404e(context2);
        } else {
            Context context3 = MMApplicationContext.getContext();
            C87412m.m108593f(context3, "getContext()");
            return new C112399d(context3);
        }
    }
}
