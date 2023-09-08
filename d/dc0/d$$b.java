package dc0;

import eb0.C75597w2;

public final /* synthetic */ class d$$b implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ Object f83424a;

    public /* synthetic */ d$$b(Object obj) {
        this.f83424a = obj;
    }

    /* renamed from: a */
    public final void mo1109a(String str, boolean z) {
        Object obj = this.f83424a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
