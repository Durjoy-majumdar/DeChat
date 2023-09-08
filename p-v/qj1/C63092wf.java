package qj1;

import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qj1.wf */
public final class C63092wf<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62979sf f179045d;

    public C63092wf(C62979sf sfVar) {
        this.f179045d = sfVar;
    }

    public void onChanged(Object obj) {
        String str = this.f179045d.f178702s;
        Log.m105924i(str, "onVideoPlayStateChange: " + ((C54951d.C54952a) obj));
        this.f179045d.mo87912Z0();
    }
}
