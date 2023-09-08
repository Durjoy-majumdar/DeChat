package m23;

import android.os.Bundle;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;
import te3.C64368fm;

/* renamed from: m23.i */
public final class C109485i extends C87413o implements C32227p<Integer, C64368fm, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109475c f327710d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109485i(C109475c cVar) {
        super(2);
        this.f327710d = cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C64368fm fmVar = (C64368fm) obj2;
        C87412m.m108594g(fmVar, "result");
        C109475c cVar = this.f327710d;
        cVar.f327700z++;
        cVar.f327684g.setShow(false);
        C101198e.C62622a.m73576a(this.f327710d.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
        C101198e.C62622a.m73576a(this.f327710d.f291492d, C101198e.C101199b.EDIT_PHOTO_DOODLE_MOVE_START, (Bundle) null, 2, (Object) null);
        this.f327710d.mo160715G(intValue, fmVar);
        return C13598b0.f38549a;
    }
}
