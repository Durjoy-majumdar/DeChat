package k12;

import android.os.Looper;
import com.tencent.p014mm.plugin.ipcall.model.C105382f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import k12.C60939a;
import ob0.C117747y;

/* renamed from: k12.b */
public abstract class C108824b extends C60939a implements C60939a.C60940a {

    /* renamed from: f */
    public boolean f325878f = false;

    /* renamed from: g */
    public MMHandler f325879g = new MMHandler(Looper.getMainLooper());

    /* renamed from: h */
    public C108827c f325880h = null;

    /* renamed from: k12.b$a */
    public class C108825a implements Runnable {
        public C108825a() {
        }

        public void run() {
            C108824b bVar = C108824b.this;
            bVar.mo85902i(bVar.f173571e);
        }
    }

    /* renamed from: k12.b$b */
    public class C108826b implements Runnable {
        public C108826b() {
        }

        public void run() {
            C108824b bVar = C108824b.this;
            bVar.mo85902i(bVar.f173571e);
        }
    }

    /* renamed from: k12.b$c */
    public interface C108827c {
    }

    /* renamed from: a */
    public void mo85904a(int i, Object obj, int i2, int i3) {
        Log.m105925i("MicroMsg.BaseIPCallTimerService", "timer request failed, type: %d, isLoop: %b, interval: %d", Integer.valueOf(i), Boolean.valueOf(this.f325878f), Integer.valueOf(mo159929k()));
        C117747y yVar = (C117747y) obj;
        mo159931m(yVar);
        C108827c cVar = this.f325880h;
        if (cVar != null) {
            C105382f fVar = (C105382f) cVar;
            if (fVar.mo150094i(i, yVar, i2, i3)) {
                Log.m105924i("MicroMsg.IPCallSvrLogic", "onTimerFailed different room ignore");
            } else if (i == 2) {
                fVar.mo150095j(false);
            } else if (i == 5) {
                fVar.mo150090e(false);
            }
        }
        if (mo159930l()) {
            mo159934p();
        } else if (this.f325878f) {
            this.f325879g.postDelayed(new C108826b(), (long) mo159929k());
        }
    }

    /* renamed from: b */
    public void mo85905b(int i, Object obj, int i2, int i3) {
        Log.m105925i("MicroMsg.BaseIPCallTimerService", "timer request success!, type: %d, isLoop: %b, interval: %d", Integer.valueOf(i), Boolean.valueOf(this.f325878f), Integer.valueOf(mo159929k()));
        C117747y yVar = (C117747y) obj;
        mo159932n(yVar);
        C108827c cVar = this.f325880h;
        if (cVar != null) {
            C105382f fVar = (C105382f) cVar;
            if (fVar.mo150094i(i, yVar, i2, i3)) {
                Log.m105924i("MicroMsg.IPCallSvrLogic", "onTimerSuccess different room ignore");
            } else if (i == 2) {
                fVar.mo150095j(true);
            } else if (i == 5) {
                fVar.mo150090e(true);
            }
        }
        if (this.f325878f) {
            this.f325879g.postDelayed(new C108825a(), (long) mo159929k());
        }
    }

    /* renamed from: c */
    public void mo85896c() {
        super.mo85896c();
    }

    /* renamed from: f */
    public void mo85899f() {
        this.f173570d = this;
        super.mo85899f();
    }

    /* renamed from: j */
    public void mo85903j(C108828c cVar) {
        super.mo85903j(cVar);
        this.f325878f = true;
        Log.m105919d("MicroMsg.BaseIPCallTimerService", "start service, type: %d", Integer.valueOf(mo85898e()));
    }

    /* renamed from: k */
    public abstract int mo159929k();

    /* renamed from: l */
    public abstract boolean mo159930l();

    /* renamed from: m */
    public abstract void mo159931m(C117747y yVar);

    /* renamed from: n */
    public abstract void mo159932n(C117747y yVar);

    /* renamed from: o */
    public abstract void mo159933o();

    /* renamed from: p */
    public void mo159934p() {
        this.f325878f = false;
        mo159933o();
        Log.m105919d("MicroMsg.BaseIPCallTimerService", "stop service, type: %d", Integer.valueOf(mo85898e()));
    }
}
