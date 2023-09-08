package nj3;

import android.content.Context;
import android.view.LayoutInflater;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: nj3.e */
public final class C88994e implements C88996h {

    /* renamed from: a */
    public static final C88994e f256583a = new C88994e();

    /* renamed from: a */
    public LayoutInflater mo113346a(Context context) {
        C87412m.m108594g(context, "context");
        LayoutInflater cloneInContext = LayoutInflater.from(MMApplicationContext.getContext()).cloneInContext(context);
        C87412m.m108593f(cloneInContext, "from(MMApplicationContex…).cloneInContext(context)");
        return cloneInContext;
    }
}
