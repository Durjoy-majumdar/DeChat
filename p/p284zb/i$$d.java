package p284zb;

import li0.C88508b;
import li0.C88509c;

/* renamed from: zb.i$$d */
public final /* synthetic */ class i$$d implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C91640i f262603d;

    public /* synthetic */ i$$d(C91640i iVar) {
        this.f262603d = iVar;
    }

    /* renamed from: b */
    public final void mo113102b(String str, C88508b bVar) {
        C91640i iVar = this.f262603d;
        iVar.getClass();
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            iVar.f262601g.enterForeground();
        } else if (ordinal == 1) {
            iVar.f262601g.enterBackground();
        } else if (ordinal == 2) {
            iVar.f262601g.enterSuspend();
        }
    }
}
