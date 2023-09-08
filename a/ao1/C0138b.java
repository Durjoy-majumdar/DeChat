package ao1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import o40.C61926c;
import rd3.C48020a;
import rx3.C13598b0;

/* renamed from: ao1.b */
public final class C0138b extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0141c f566d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0138b(C0141c cVar) {
        super(2);
        this.f566d = cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        Log.m105924i("FinderMusicCheckUIC", "success:" + booleanValue + " , filePath:" + str + ", fileExist:" + C48020a.m53385b(this.f566d.f569d));
        C61926c.m72668M(new C0136a(this.f566d, str, booleanValue));
        return C13598b0.f38549a;
    }
}
