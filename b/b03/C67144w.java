package b03;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: b03.w */
public final class C67144w extends C87413o implements C32226l<CharSequence, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C67133s f192793d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67144w(C67133s sVar) {
        super(1);
        this.f192793d = sVar;
    }

    public Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C67133s sVar = this.f192793d;
        sVar.f192759m = charSequence;
        sVar.f192747a.getLayout();
        return C13598b0.f38549a;
    }
}
