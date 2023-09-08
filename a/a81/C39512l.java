package a81;

import com.tencent.p014mm.plugin.exdevice.service.C41194g;
import com.tencent.p014mm.plugin.exdevice.service.C41200j;
import f40.C86709a0;
import junit.framework.Assert;

/* renamed from: a81.l */
public class C39512l extends C41194g.C41195a {

    /* renamed from: e */
    public C39503c f106085e = null;

    /* renamed from: f */
    public boolean f106086f = false;

    /* renamed from: g */
    public Runnable f106087g = new C39513a();

    /* renamed from: a81.l$a */
    public class C39513a implements Runnable {
        public C39513a() {
        }

        public void run() {
            C39512l lVar = C39512l.this;
            lVar.f106086f = true;
            lVar.getClass();
            ((C39501a) C39512l.this.f106085e).mo62111c(-1, -1, -2, "TimeOut", (C41200j) null);
        }

        public String toString() {
            return super.toString() + "|mAsyncTimeOut";
        }
    }

    /* renamed from: a81.l$b */
    public class C39514b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f106089d;

        /* renamed from: e */
        public final /* synthetic */ int f106090e;

        /* renamed from: f */
        public final /* synthetic */ int f106091f;

        /* renamed from: g */
        public final /* synthetic */ String f106092g;

        /* renamed from: h */
        public final /* synthetic */ C41200j f106093h;

        public C39514b(long j, int i, int i2, String str, C41200j jVar) {
            this.f106089d = j;
            this.f106090e = i;
            this.f106091f = i2;
            this.f106092g = str;
            this.f106093h = jVar;
        }

        public void run() {
            ((C39501a) C39512l.this.f106085e).mo62111c(this.f106089d, this.f106090e, this.f106091f, this.f106092g, this.f106093h);
        }

        public String toString() {
            return super.toString() + "|onTaskEnd";
        }
    }

    public C39512l(C39503c cVar) {
        Assert.assertNotNull(cVar);
        this.f106085e = cVar;
    }

    public void Jt0(long j, int i, int i2, String str, C41200j jVar) {
        if (!this.f106086f) {
            C86709a0.m107525e().getWorkerHandler().removeCallbacks(this.f106087g);
            C86709a0.m107525e().getWorkerHandler().post(new C39514b(j, i, i2, str, jVar));
        }
    }
}
