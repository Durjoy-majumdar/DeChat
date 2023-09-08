package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rn3.w0 */
public final class C48060w0 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WXEmojiObject f128905d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Integer, C13598b0> f128906e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48060w0(WXEmojiObject wXEmojiObject, C32226l<? super Integer, C13598b0> lVar) {
        super(2);
        this.f128905d = wXEmojiObject;
        this.f128906e = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        if (intValue == 2) {
            this.f128905d.emojiPath = str;
        }
        this.f128906e.invoke(Integer.valueOf(intValue));
        return C13598b0.f38549a;
    }
}
