package k23;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import h23.C108038q;
import k23.C99090a;
import rx3.C13598b0;

/* renamed from: k23.d */
public final class C99095d extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99090a f290565d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99095d(C99090a aVar) {
        super(2);
        this.f290565d = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        if (!((Boolean) obj).booleanValue()) {
            Log.m105924i("MicroMsg.VLogGenerateManager", "download music fail :" + str);
            ((C99090a.C99092b) this.f290565d.f290553h).mo162I("", "", Boolean.FALSE, 1);
        } else {
            C108038q qVar = this.f290565d.f290550e;
            qVar.getClass();
            Log.m105924i("MicroMsg.VLogRemuxer", "setMusicPath path");
            qVar.f323527j = str;
            C99090a aVar = this.f290565d;
            aVar.f290550e.mo126422a(aVar.f290553h);
        }
        return C13598b0.f38549a;
    }
}
