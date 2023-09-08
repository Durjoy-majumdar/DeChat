package qh2;

import com.tencent.p014mm.sdk.platformtools.Log;
import f90.C107509b;
import fh2.C97884j;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qh2.h */
public final class C101200h extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107509b f296339d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101200h(C107509b bVar) {
        super(1);
        this.f296339d = bVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.RecordPluginLayout", "startPreview finish:" + booleanValue);
        if (C97884j.f287168e) {
            C97884j.m126370a(this.f296339d.f321642b.mo143173l(true));
        }
        return C13598b0.f38549a;
    }
}
