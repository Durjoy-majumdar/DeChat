package p738wg;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: wg.i */
public class C102437i implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C102438j f301684d;

    public C102437i(C102438j jVar) {
        this.f301684d = jVar;
    }

    public boolean onTimerExpired() {
        Log.m105924i("MicroMsg.ExtSimpleRecord", "Voice record timeout.");
        C102438j jVar = this.f301684d;
        jVar.f301690i = true;
        jVar.mo142010d();
        return false;
    }
}
