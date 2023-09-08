package yz2;

import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: yz2.b1 */
public final class C79222b1 extends C87413o implements C32227p<String, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232594d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79222b1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(2);
        this.f232594d = textStatusDoWhatActivityV2;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        C87412m.m108594g(str, "customIconId");
        C87412m.m108594g(str2, "customStatusWord");
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232594d;
        textStatusDoWhatActivityV2.getClass();
        textStatusDoWhatActivityV2.f206829h = str2;
        TextStatusDoWhatActivityV2.m83898H7(this.f232594d, str);
        return C13598b0.f38549a;
    }
}
