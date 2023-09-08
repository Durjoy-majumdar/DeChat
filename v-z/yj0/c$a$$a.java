package yj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C86468a;
import java.util.HashMap;
import yj0.C91465c;

public final /* synthetic */ class c$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91465c.C91466a f262231d;

    /* renamed from: e */
    public final /* synthetic */ C86468a.C86469a f262232e;

    /* renamed from: f */
    public final /* synthetic */ int f262233f;

    /* renamed from: g */
    public final /* synthetic */ int f262234g;

    /* renamed from: h */
    public final /* synthetic */ int f262235h;

    /* renamed from: i */
    public final /* synthetic */ byte[] f262236i;

    /* renamed from: j */
    public final /* synthetic */ long f262237j;

    public /* synthetic */ c$a$$a(C91465c.C91466a aVar, C86468a.C86469a aVar2, int i, int i2, int i3, byte[] bArr, long j) {
        this.f262231d = aVar;
        this.f262232e = aVar2;
        this.f262233f = i;
        this.f262234g = i2;
        this.f262235h = i3;
        this.f262236i = bArr;
        this.f262237j = j;
    }

    public final void run() {
        C91465c.C91466a aVar = this.f262231d;
        C86468a.C86469a aVar2 = this.f262232e;
        int i = this.f262233f;
        int i2 = this.f262234g;
        int i3 = this.f262235h;
        byte[] bArr = this.f262236i;
        long j = this.f262237j;
        C91464b bVar = (C91464b) ((HashMap) C91465c.this.f262214b).get(Short.valueOf(aVar2.f251260a));
        if (bVar == null) {
            Log.m105928w("MicroMsg.GameRecordAudioLogic", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + aVar2.f251260a + " audioType: " + aVar2.f251261b + " audioId: " + aVar2.f251262c + " format: " + i + " channel: " + i2 + " samplerate: " + i3 + " size: " + bArr.length);
            C91464b bVar2 = new C91464b(aVar2.f251260a, false);
            ((HashMap) C91465c.this.f262214b).put(Short.valueOf(aVar2.f251260a), bVar2);
            bVar = bVar2;
        }
        bVar.mo125400d((short) i2, i3, bArr, j);
    }
}
