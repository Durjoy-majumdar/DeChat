package k33;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import kd0.C99125s;

/* renamed from: k33.p */
public class C117380p {

    /* renamed from: a */
    public C99125s f351411a;

    /* renamed from: b */
    public MTimerHandler f351412b;

    /* renamed from: c */
    public int f351413c;

    /* renamed from: d */
    public int f351414d;

    public C117380p() {
        this.f351411a = null;
        this.f351412b = null;
        this.f351413c = 0;
        this.f351414d = 0;
        this.f351411a = new C99125s();
        this.f351412b = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C117379o(this), true);
    }

    /* renamed from: a */
    public void mo182070a() {
        this.f351411a.stopRecord();
        Log.m105918d("MicroMsg.VoicePrintNoiseDetector", "stop record");
        this.f351412b.stopTimer();
        this.f351413c = 0;
        this.f351414d = 0;
    }
}
