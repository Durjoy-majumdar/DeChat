package kd0;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p206nj.C100115c;
import p375qh.C22086d;

/* renamed from: kd0.q */
public class C21328q implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C21329r f60274a;

    public C21328q(C21329r rVar) {
        this.f60274a = rVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105918d("MicroMsg.SpeexPlayer", "onError");
        C21329r rVar = this.f60274a;
        C100115c cVar = rVar.f60286l;
        if (cVar != null && rVar.f60288n) {
            cVar.mo139414a();
        }
        C22086d.C22088b bVar = this.f60274a.f60278d;
        if (bVar != null) {
            bVar.mo35072a();
        }
        try {
            this.f60274a.f60279e = -1;
            this.f60274a.mo33363n();
            try {
                C21329r.m23931j(this.f60274a);
            } catch (InterruptedException e) {
                Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e));
            }
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.SpeexPlayer", "setErrorListener File[" + this.f60274a.f60276b + "] ErrMsg[" + e2.getStackTrace() + "]");
        }
        return false;
    }
}
