package ux0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: ux0.b */
public final class C37603b<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C32226l<String, C13598b0> f99716a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<String> f99717b;

    public C37603b(C32226l<? super String, C13598b0> lVar, C15601d<? super String> dVar) {
        this.f99716a = lVar;
        this.f99717b = dVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        C32226l<String, C13598b0> lVar = this.f99716a;
        C87412m.m108593f(str, LocaleUtil.ITALIAN);
        lVar.invoke(str);
        this.f99717b.resumeWith(Result.m168114constructorimpl(str));
    }
}
