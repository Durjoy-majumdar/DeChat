package d71;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import nj3.C76912y0;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: d71.h */
public final class C97440h extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C97434g f286016d;

    /* renamed from: e */
    public final /* synthetic */ String f286017e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97440h(C97434g gVar, String str) {
        super(1);
        this.f286016d = gVar;
        this.f286017e = str;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.EditorPresenter", "voice text block " + booleanValue);
        C97434g gVar = this.f286016d;
        gVar.f285995h = true;
        if (booleanValue) {
            C76912y0.makeText(gVar.f285988a, (int) C0966R.string.c_t, 0).show();
        } else {
            gVar.f285993f = this.f286017e;
        }
        C97434g gVar2 = this.f286016d;
        gVar2.getClass();
        C61926c.m72668M(new C97441i(gVar2));
        return C13598b0.f38549a;
    }
}
