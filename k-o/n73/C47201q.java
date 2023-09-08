package n73;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import m73.C46951c;

/* renamed from: n73.q */
public class C47201q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f126745d;

    /* renamed from: e */
    public final /* synthetic */ C47202r f126746e;

    public C47201q(C47202r rVar, String str) {
        this.f126746e = rVar;
        this.f126745d = str;
    }

    public void run() {
        C47202r rVar = this.f126746e;
        rVar.f126748d = new C46951c(C47202r.f126747o, 0, this.f126745d, rVar.f126753i);
        C97625j3.m125815e().mo123455a(349, this.f126746e);
        Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "Create NetSceneVoiceInput");
    }
}
