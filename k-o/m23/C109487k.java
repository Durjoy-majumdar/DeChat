package m23;

import android.os.Bundle;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import qh2.C101198e;
import rx3.C13598b0;
import te3.C64368fm;

/* renamed from: m23.k */
public final class C109487k extends C87413o implements C32227p<Integer, ArrayList<C64368fm>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109475c f327712d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109487k(C109475c cVar) {
        super(2);
        this.f327712d = cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        ArrayList arrayList = (ArrayList) obj2;
        C87412m.m108594g(arrayList, "result");
        this.f327712d.f327685h.setShow(false);
        this.f327712d.f327694t.get(intValue).clear();
        this.f327712d.f327694t.get(intValue).addAll(arrayList);
        this.f327712d.mo160713E(intValue);
        C101198e.C62622a.m73576a(this.f327712d.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
        return C13598b0.f38549a;
    }
}
