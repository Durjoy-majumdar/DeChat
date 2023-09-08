package kd0;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p206nj.C100115c;

/* renamed from: kd0.p */
public class C21327p implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C21329r f60273a;

    public C21327p(C21329r rVar) {
        this.f60273a = rVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C21329r rVar = this.f60273a;
        C100115c cVar = rVar.f60286l;
        if (cVar != null && rVar.f60288n) {
            cVar.mo139414a();
        }
        try {
            this.f60273a.f60279e = 0;
            this.f60273a.mo33363n();
            try {
                C21329r.m23931j(this.f60273a);
            } catch (InterruptedException e) {
                Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e));
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e2));
            Log.m105920e("MicroMsg.SpeexPlayer", "setCompletion File[" + this.f60273a.f60276b + "] ErrMsg[" + e2.getStackTrace() + "]");
        }
    }
}
