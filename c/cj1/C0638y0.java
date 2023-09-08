package cj1;

import androidx.fragment.app.FragmentActivity;
import f40.C86709a0;
import fy3.C32226l;
import m53.C10754b;
import m53.C10756c;
import m53.C10762h;
import rx3.C13598b0;

/* renamed from: cj1.y0 */
public final class C0638y0 implements C10762h<Void> {

    /* renamed from: a */
    public final /* synthetic */ FragmentActivity f1508a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f1509b;

    public C0638y0(FragmentActivity fragmentActivity, C32226l<? super Boolean, C13598b0> lVar) {
        this.f1508a = fragmentActivity;
        this.f1509b = lVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        this.f1509b.invoke(Boolean.FALSE);
    }

    public void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        C10754b Ed0 = ((C10756c) C86709a0.m107533q(C10756c.class)).Ed0(this.f1508a, true);
        if (Ed0 != null) {
            Ed0.mo10988a(new C0634x0(this.f1509b));
        } else {
            this.f1509b.invoke(Boolean.TRUE);
        }
    }
}
