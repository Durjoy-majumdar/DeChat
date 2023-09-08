package p965fe;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.concurrent.atomic.AtomicReference;
import p961ee.C116766a;
import p961ee.C86507b;
import p981ie.C87705i;

/* renamed from: fe.f */
public class C116862f implements C87705i<C86507b> {

    /* renamed from: a */
    public final /* synthetic */ int f350264a;

    /* renamed from: b */
    public final /* synthetic */ int f350265b;

    /* renamed from: c */
    public final /* synthetic */ C86853a f350266c;

    public C116862f(C86853a aVar, int i, int i2) {
        this.f350266c = aVar;
        this.f350264a = i;
        this.f350265b = i2;
    }

    public void accept(Object obj) {
        C86507b bVar = (C86507b) obj;
        int i = this.f350264a;
        C116860d dVar = new C116860d(this);
        C116861e eVar = new C116861e(this);
        if (((JiffiesMonitorFeature) bVar.f349668a.mo165880e(JiffiesMonitorFeature.class)) != null) {
            long j = 1000 * ((long) i);
            AtomicReference atomicReference = new AtomicReference((Object) null);
            HandlerThread handlerThread = new HandlerThread("matrix_top");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            handler.postDelayed(new C116766a(bVar, atomicReference, eVar, j, handler, dVar), j);
        }
    }
}
