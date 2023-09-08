package qj1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gi1.C59464c;
import o40.C61926c;

/* renamed from: qj1.l3 */
public final class C62867l3<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62815i3 f178401d;

    public C62867l3(C62815i3 i3Var) {
        this.f178401d = i3Var;
    }

    public void onChanged(Object obj) {
        C59464c cVar = (C59464c) obj;
        Log.m105924i("MicroMsg.LiveCoreAnchor", "micCoverDataChangeEvent: " + cVar.f169896a);
        C61926c.m72668M(new C62840k3(this.f178401d, cVar));
    }
}
