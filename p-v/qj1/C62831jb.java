package qj1;

import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qj1.jb */
public final class C62831jb<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62772fb f178323d;

    public C62831jb(C62772fb fbVar) {
        this.f178323d = fbVar;
    }

    public void onChanged(Object obj) {
        Log.m105924i("MultiStreamIndicatorPlugin", "onVideoPlayStateChange: " + ((C54951d.C54952a) obj));
        this.f178323d.mo87771Z0();
    }
}
