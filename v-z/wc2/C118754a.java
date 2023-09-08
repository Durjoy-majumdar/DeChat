package wc2;

import android.hardware.Sensor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.p014mm.normsg.C114829e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ft3.C116896h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jm2.C117361f;
import wc2.C118756b;
import xc2.C118870a;
import xc2.C118871b;

/* renamed from: wc2.a */
public class C118754a implements C118756b.C118757a {

    /* renamed from: d */
    public static final C116896h<C118754a> f355286d = new C118755a();

    /* renamed from: a */
    public final MMHandler f355287a = new C111797b("NormsgSensorEngineWorker");

    /* renamed from: b */
    public final C118756b f355288b = new C118756b(this);

    /* renamed from: c */
    public C118760e f355289c = new C118760e();

    /* renamed from: wc2.a$b */
    public class C111797b extends MMHandler {
        public C111797b(String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            try {
                C118754a.this.mo183479b(message);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.NormsgSensorEngine", "NormsgSensorEngineWorker handle msg error:" + th.getMessage());
            }
        }
    }

    /* renamed from: wc2.a$a */
    public class C118755a extends C116896h<C118754a> {
        /* renamed from: a */
        public Object mo165606a() {
            return new C118754a();
        }
    }

    /* renamed from: a */
    public final void mo183478a(String str) {
        this.f355289c.getClass();
        C114829e.C114831b.m161759l(str);
        this.f355289c.getClass();
        if (!C114829e.C114831b.m161752e()) {
            mo183481d(6, 0, (Object) null, 0);
        }
    }

    /* renamed from: b */
    public void mo183479b(Message message) {
        int i = 0;
        switch (message.what) {
            case 1:
                Log.m105918d("MicroMsg.NormsgSensorEngine", "Start record sensor");
                C118871b bVar = (C118871b) message.obj;
                int i2 = message.arg1;
                this.f355287a.removeMessages(6);
                C118760e eVar = this.f355289c;
                String str = bVar.f355595c;
                int i3 = bVar.f355593a;
                eVar.getClass();
                C114829e.C114831b.m161758k(str, i2, i3);
                if (eVar.f355303a) {
                    C114829e.C114831b.m161755h();
                }
                Iterator it = ((ArrayList) eVar.f355304b).iterator();
                while (it.hasNext()) {
                    C114829e.C114831b.m161749b(((Integer) it.next()).intValue());
                }
                Iterator it4 = ((ArrayList) eVar.f355305c).iterator();
                while (it4.hasNext()) {
                    C114829e.C114831b.m161748a(((Integer) it4.next()).intValue());
                }
                if (this.f355288b.f355290d.get()) {
                    Log.m105924i("MicroMsg.NormsgSensorEngine", "SensorListener is already started");
                    return;
                }
                C118756b bVar2 = this.f355288b;
                ((HashMap) bVar2.f355292f).clear();
                HandlerThread handlerThread = new HandlerThread("NSL");
                bVar2.f355294h = handlerThread;
                handlerThread.start();
                bVar2.f355295i = new Handler(bVar2.f355294h.getLooper());
                int[] iArr = C118871b.f355592d;
                for (int i4 = 0; i4 < 5; i4++) {
                    int i5 = iArr[i4];
                    if (C118870a.m167603a(i5) == 0) {
                        Log.m105920e("MicroMsg.NormsgSensorListener", "Unknown sensor type " + i5);
                    } else {
                        Sensor defaultSensor = bVar2.f355293g.getDefaultSensor(i5);
                        int a = C118870a.m167603a(i5);
                        if (defaultSensor == null) {
                            Log.m105924i("MicroMsg.NormsgSensorListener", "Device has no sensor " + a);
                            ((C118754a) bVar2.f355291e).mo183480c(1, a);
                        } else {
                            ((HashMap) bVar2.f355292f).put(Integer.valueOf(a), new C118758c(defaultSensor));
                            if (!bVar2.f355293g.registerListener(bVar2, defaultSensor, 0, bVar2.f355295i)) {
                                ((C118754a) bVar2.f355291e).mo183480c(2, a);
                            }
                        }
                    }
                }
                if (((HashMap) bVar2.f355292f).isEmpty()) {
                    ((C118754a) bVar2.f355291e).mo183480c(3, 0);
                    bVar2.f355290d.set(false);
                    HandlerThread handlerThread2 = bVar2.f355294h;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        return;
                    }
                    return;
                }
                bVar2.f355290d.set(true);
                return;
            case 2:
                int i6 = message.arg1;
                List list = (List) message.obj;
                if (list == null || list.isEmpty()) {
                    Log.m105920e("MicroMsg.NormsgSensorEngine", "Sensor buffer is empty");
                    return;
                }
                this.f355289c.getClass();
                if (!list.isEmpty()) {
                    C114829e.C114831b.m161753f(i6, list);
                    return;
                }
                return;
            case 3:
                Log.m105918d("MicroMsg.NormsgSensorEngine", "Try stop record sensor");
                String str2 = (String) message.obj;
                this.f355289c.getClass();
                if (C114829e.C114831b.m161757j(str2)) {
                    mo183482e(str2);
                    return;
                }
                this.f355289c.getClass();
                int d = C114829e.C114831b.m161751d(str2);
                if (d >= 0) {
                    this.f355289c.getClass();
                    C114829e.C114831b.m161756i(str2);
                    if (d > 0) {
                        i = (d * 20) + 2000;
                    }
                    mo183481d(4, 0, str2, (long) i);
                    return;
                }
                return;
            case 4:
                Log.m105918d("MicroMsg.NormsgSensorEngine", "Stop record sensor immediate");
                mo183482e((String) message.obj);
                return;
            case 5:
                Log.m105918d("MicroMsg.NormsgSensorEngine", "Cancel record sensor");
                mo183478a((String) message.obj);
                return;
            case 6:
                Log.m105918d("MicroMsg.NormsgSensorEngine", "Stop sensor listener");
                if (this.f355288b.f355290d.get()) {
                    C118756b bVar3 = this.f355288b;
                    for (C118758c cVar : ((HashMap) bVar3.f355292f).values()) {
                        bVar3.f355293g.unregisterListener(bVar3, cVar.f355296a);
                    }
                    bVar3.f355290d.set(false);
                    ((HashMap) bVar3.f355292f).clear();
                    HandlerThread handlerThread3 = bVar3.f355294h;
                    if (handlerThread3 != null) {
                        handlerThread3.quit();
                    }
                }
                C118760e eVar2 = this.f355289c;
                eVar2.f355303a = false;
                ((ArrayList) eVar2.f355304b).clear();
                ((ArrayList) eVar2.f355305c).clear();
                C114829e.C114831b.m161754g();
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public void mo183480c(int i, int i2) {
        if (i == 1) {
            ((ArrayList) this.f355289c.f355305c).add(Integer.valueOf(i2));
            C114829e.C114831b.m161748a(i2);
        } else if (i == 2) {
            ((ArrayList) this.f355289c.f355304b).add(Integer.valueOf(i2));
            C114829e.C114831b.m161749b(i2);
        } else if (i == 3) {
            this.f355289c.f355303a = true;
            C114829e.C114831b.m161755h();
        }
    }

    /* renamed from: d */
    public final void mo183481d(int i, int i2, Object obj, long j) {
        try {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.obj = obj;
            this.f355287a.sendMessageDelayed(obtain, j);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.NormsgSensorEngine", "Send msg error: %s" + th.getMessage());
        }
    }

    /* renamed from: e */
    public final void mo183482e(String str) {
        this.f355289c.getClass();
        byte[] c = C114829e.C114831b.m161750c(str);
        if (c != null) {
            C117361f.INSTANCE.mo182038uB(str, c);
        } else {
            Log.m105928w("MicroMsg.NormsgSensorEngine", "Can't get encrypted sensor data: " + str);
        }
        mo183478a(str);
    }
}
