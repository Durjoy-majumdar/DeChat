package qj1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gi1.C59464c;
import o40.C61926c;

/* renamed from: qj1.uh */
public final class C63040uh<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62983sh f178901d;

    public C63040uh(C62983sh shVar) {
        this.f178901d = shVar;
    }

    public void onChanged(Object obj) {
        C59464c cVar = (C59464c) obj;
        Log.m105924i("Finder.FinderLiveVisitorPreviewPlugin", "micCoverDataChangeEvent: " + cVar.f169896a);
        C61926c.m72668M(new C63001th(this.f178901d, cVar));
    }
}
