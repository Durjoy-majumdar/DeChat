package kr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import kr1.C109039b;
import rx3.C13598b0;

/* renamed from: kr1.h */
public final class C109050h extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109039b f326589d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109050h(C109039b bVar) {
        super(2);
        this.f326589d = bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C109039b.C109042c cVar = C109039b.f326557v;
        Log.m105924i("MicroMsg.FinderRecordBeautifyPlugin", "onSeekChanging key=" + intValue + " seek=" + intValue2);
        C109039b bVar = this.f326589d;
        bVar.mo160169h(intValue, intValue2);
        bVar.mo160168g();
        C109039b bVar2 = this.f326589d;
        bVar2.mo160164b().putInt(bVar2.mo160166d(bVar2.f326572q, intValue), intValue2);
        C109039b bVar3 = this.f326589d;
        if (intValue2 == bVar3.mo160165c(bVar3.f326572q, intValue)) {
            this.f326589d.f326576u.vibrate(10);
        }
        return C13598b0.f38549a;
    }
}
