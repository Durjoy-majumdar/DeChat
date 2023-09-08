package ew3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import rv3.C118245h;
import uv3.C118612b;
import uv3.C118616f;
import uv3.C118617g;
import vv3.C118702d;
import yv3.C118997b;

/* renamed from: ew3.d */
public class C116795d implements C116792b {

    /* renamed from: a */
    public C118702d f350120a;

    /* renamed from: b */
    public C118997b f350121b;

    public C116795d(C118702d dVar) {
        this.f350120a = dVar;
    }

    /* renamed from: a */
    public boolean mo180768a(C118616f fVar, C116791a aVar) {
        C118997b bVar = this.f350121b;
        if (bVar != null) {
            HandlerThread handlerThread = bVar.f355202a;
            if (!(handlerThread != null ? handlerThread.isAlive() : false)) {
                C118245h.m166799a("sensor_MasterManager", "[method: start ] mEngine is not Alive : ");
                this.f350121b = null;
            }
        }
        C118997b bVar2 = this.f350121b;
        if (bVar2 == null) {
            this.f350121b = new C116793c("master_engine", this.f350120a);
        } else if (fVar.f354956d != bVar2.f356433d.f354956d) {
            C116793c cVar = (C116793c) bVar2;
            Handler handler = cVar.f355203b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 8;
                obtainMessage.arg1 = -1;
                obtainMessage.arg2 = -1;
                obtainMessage.obj = null;
                cVar.f355203b.sendMessageAtFrontOfQueue(obtainMessage);
            }
            this.f350121b = new C116793c("master_engine", this.f350120a);
        }
        C116793c cVar2 = (C116793c) this.f350121b;
        cVar2.getClass();
        if (aVar instanceof C116791a) {
            cVar2.f356435f = aVar;
        }
        if (cVar2.f355203b != null) {
            cVar2.mo183458e(1, -1, fVar);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo180769b(C118617g gVar) {
        C118997b bVar = this.f350121b;
        if (bVar == null) {
            return false;
        }
        C118616f fVar = bVar.f356433d;
        long j = 0;
        if (fVar != null && fVar.f354956d == C118612b.GESTURETYPE_SINGLE) {
            j = 30;
        }
        C116793c cVar = (C116793c) bVar;
        cVar.getClass();
        C118997b.C118998a aVar = new C118997b.C118998a(cVar, gVar);
        Handler handler = cVar.f355203b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 4;
            obtainMessage.arg1 = 6;
            obtainMessage.obj = aVar;
            cVar.f355203b.sendMessageDelayed(obtainMessage, j);
        }
        return true;
    }
}
