package e11;

import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f11.C97792a;
import jp3.C9486a;
import jp3.C9487b;

/* renamed from: e11.c */
public abstract class C97573c implements Runnable, C9486a {

    /* renamed from: d */
    public C97792a f286288d;

    /* renamed from: e */
    public C97571a f286289e;

    /* renamed from: f */
    public int f286290f;

    /* renamed from: g */
    public int f286291g;

    /* renamed from: h */
    public boolean f286292h = false;

    /* renamed from: i */
    public Runnable f286293i = new C97574a();

    /* renamed from: e11.c$a */
    public class C97574a implements Runnable {
        public C97574a() {
        }

        public void run() {
            C97573c cVar = C97573c.this;
            cVar.f286292h = true;
            C97571a aVar = cVar.f286289e;
            if (aVar != null) {
                aVar.mo127395a(cVar.f286290f, cVar.f286291g);
            }
        }
    }

    public C97573c(C97792a aVar, C97571a aVar2, C9487b bVar) {
        this.f286288d = aVar;
        this.f286289e = aVar2;
        if (bVar != null) {
            bVar.keep(this);
        }
    }

    /* renamed from: a */
    public synchronized void mo136836a() {
        Log.m105924i("MicroMsg.MsgFileWorker_Base", "onDownloadFail");
        C97571a aVar = this.f286289e;
        if (aVar != null) {
            aVar.mo127399e();
            this.f286289e = null;
        }
    }

    /* renamed from: b */
    public synchronized void mo136837b(int i, int i2) {
        C97571a aVar;
        Log.m105927v("MicroMsg.MsgFileWorker_Base", "onDownloadProgress offset:%d totalLen:%d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f286290f = i;
        this.f286291g = i2;
        if (this.f286292h && (aVar = this.f286289e) != null) {
            aVar.mo127395a(i, i2);
        }
    }

    /* renamed from: c */
    public synchronized void mo136838c(MsgFile msgFile) {
        Log.m105925i("MicroMsg.MsgFileWorker_Base", "onDownloadSuccess msgFile:%s", msgFile);
        C97571a aVar = this.f286289e;
        if (aVar != null) {
            aVar.mo127397c(msgFile);
            this.f286289e = null;
        }
    }

    public void dead() {
    }

    /* renamed from: f */
    public abstract boolean mo136839f();

    /* renamed from: g */
    public abstract boolean mo136840g();

    /* renamed from: h */
    public abstract void mo136841h();

    public void run() {
        MMHandlerThread.postToMainThreadDelayed(this.f286293i, 2000);
        mo136841h();
    }

    public String toString() {
        return "MsgFileWorker_Base{mMsgItem=" + this.f286288d + '}';
    }
}
