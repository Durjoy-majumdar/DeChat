package zr3;

import bs3.C104161b;
import java.lang.ref.WeakReference;

/* renamed from: zr3.j */
public class C112684j implements C112671c {

    /* renamed from: a */
    public WeakReference<C112671c> f337402a;

    public C112684j(C112671c cVar) {
        this.f337402a = new WeakReference<>(cVar);
    }

    /* renamed from: a */
    public void mo164402a(int i, byte[] bArr) {
        WeakReference<C112671c> weakReference = this.f337402a;
        if (weakReference == null || weakReference.get() == null) {
            C104161b.m138997f("OnRespForLongAIDLImpl fail", "callback is null, errCode=" + i);
            return;
        }
        this.f337402a.get().mo164402a(i, bArr);
    }
}
