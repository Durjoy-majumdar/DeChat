package g41;

import k31.C117373a;
import s31.C118264c;
import u24.C90599h;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f350356d;

    public /* synthetic */ a$$a(String str) {
        this.f350356d = str;
    }

    public final void run() {
        String str = this.f350356d;
        C118264c cVar = C117373a.xx0().f351384j;
        if (cVar == null) {
            return;
        }
        if (!C90599h.m113511d(str)) {
            cVar.f353464h = str;
        } else {
            cVar.f353464h = "";
        }
    }
}
