package m23;

import android.os.Bundle;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: m23.e */
public final class C109481e extends C87413o implements C32226l<Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109475c f327706d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109481e(C109475c cVar) {
        super(1);
        this.f327706d = cVar;
    }

    public Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Bundle bundle = new Bundle();
        bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) longValue);
        this.f327706d.f291492d.mo14585p(C101198e.C101199b.EDIT_VIDEO_SEEK, bundle);
        C101198e.C62622a.m73576a(this.f327706d.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
        return C13598b0.f38549a;
    }
}
