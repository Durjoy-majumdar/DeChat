package yj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C86468a;
import java.util.HashMap;
import yj0.C91465c;

public final /* synthetic */ class c$a$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91465c.C91466a f262242d;

    /* renamed from: e */
    public final /* synthetic */ C86468a.C86469a f262243e;

    /* renamed from: f */
    public final /* synthetic */ int f262244f;

    /* renamed from: g */
    public final /* synthetic */ int f262245g;

    /* renamed from: h */
    public final /* synthetic */ int f262246h;

    /* renamed from: i */
    public final /* synthetic */ float[] f262247i;

    public /* synthetic */ c$a$$d(C91465c.C91466a aVar, C86468a.C86469a aVar2, int i, int i2, int i3, float[] fArr) {
        this.f262242d = aVar;
        this.f262243e = aVar2;
        this.f262244f = i;
        this.f262245g = i2;
        this.f262246h = i3;
        this.f262247i = fArr;
    }

    public final void run() {
        C91465c.C91466a aVar = this.f262242d;
        C86468a.C86469a aVar2 = this.f262243e;
        int i = this.f262244f;
        int i2 = this.f262245g;
        int i3 = this.f262246h;
        float[] fArr = this.f262247i;
        C91464b bVar = (C91464b) ((HashMap) C91465c.this.f262214b).get(Short.valueOf(aVar2.f251260a));
        if (bVar == null) {
            Log.m105928w("MicroMsg.GameRecordAudioLogic", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + aVar2.f251260a + " audioType: " + aVar2.f251261b + " audioId: " + aVar2.f251262c + " format: " + i + " channel: " + i2 + " samplerate: " + i3 + " size: " + fArr.length);
            bVar = new C91464b(aVar2.f251260a, false);
            ((HashMap) C91465c.this.f262214b).put(Short.valueOf(aVar2.f251260a), bVar);
        }
        bVar.mo125401e((short) i2, i3, fArr);
    }
}
