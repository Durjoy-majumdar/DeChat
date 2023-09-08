package p172io.flutter.embedding.engine.dart;

import java.nio.ByteBuffer;
import p172io.flutter.embedding.engine.dart.DartMessenger;

/* renamed from: io.flutter.embedding.engine.dart.DartMessenger$$a */
public final /* synthetic */ class DartMessenger$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DartMessenger f351095d;

    /* renamed from: e */
    public final /* synthetic */ String f351096e;

    /* renamed from: f */
    public final /* synthetic */ DartMessenger.HandlerInfo f351097f;

    /* renamed from: g */
    public final /* synthetic */ ByteBuffer f351098g;

    /* renamed from: h */
    public final /* synthetic */ int f351099h;

    /* renamed from: i */
    public final /* synthetic */ long f351100i;

    public /* synthetic */ DartMessenger$$a(DartMessenger dartMessenger, String str, DartMessenger.HandlerInfo handlerInfo, ByteBuffer byteBuffer, int i, long j) {
        this.f351095d = dartMessenger;
        this.f351096e = str;
        this.f351097f = handlerInfo;
        this.f351098g = byteBuffer;
        this.f351099h = i;
        this.f351100i = j;
    }

    public final void run() {
        this.f351095d.lambda$dispatchMessageToQueue$0(this.f351096e, this.f351097f, this.f351098g, this.f351099h, this.f351100i);
    }
}
