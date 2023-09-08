package ii1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gi1.C59464c;
import o40.C61926c;

/* renamed from: ii1.c */
public final class C60289c<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C60291e f171910d;

    public C60289c(C60291e eVar) {
        this.f171910d = eVar;
    }

    public void onChanged(Object obj) {
        C59464c cVar = (C59464c) obj;
        Log.m105924i("FinderLiveMicCoverPlugin", "micCoverDataChangeEvent: " + cVar.f169896a);
        C61926c.m72668M(new C60288b(this.f171910d, cVar));
    }
}
