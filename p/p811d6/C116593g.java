package p811d6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p957e6.C86444b;
import p957e6.C86451f;

/* renamed from: d6.g */
public final class C116593g {

    /* renamed from: a */
    public final AtomicInteger f349632a = new AtomicInteger(0);

    /* renamed from: b */
    public final String f349633b;

    /* renamed from: c */
    public volatile C116589e f349634c;

    /* renamed from: d */
    public final List<C116588b> f349635d;

    /* renamed from: e */
    public final C116588b f349636e;

    /* renamed from: f */
    public final C97423c f349637f;

    /* renamed from: d6.g$a */
    public static final class C116594a extends Handler implements C116588b {

        /* renamed from: d */
        public final String f349638d;

        /* renamed from: e */
        public final List<C116588b> f349639e;

        public C116594a(String str, List<C116588b> list) {
            super(Looper.getMainLooper());
            this.f349638d = str;
            this.f349639e = list;
        }

        /* renamed from: a */
        public void mo180565a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        public void handleMessage(Message message) {
            for (C116588b a : this.f349639e) {
                a.mo180565a((File) message.obj, this.f349638d, message.arg1);
            }
        }
    }

    public C116593g(String str, C97423c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f349635d = copyOnWriteArrayList;
        str.getClass();
        this.f349633b = str;
        cVar.getClass();
        this.f349637f = cVar;
        this.f349636e = new C116594a(str, copyOnWriteArrayList);
    }

    /* renamed from: a */
    public final synchronized void mo180573a() {
        if (this.f349632a.decrementAndGet() <= 0) {
            C116589e eVar = this.f349634c;
            synchronized (eVar.f349652d) {
                Objects.toString(eVar.f349649a);
                try {
                    eVar.f349655g = true;
                    if (eVar.f349654f != null) {
                        eVar.f349654f.interrupt();
                    }
                    eVar.f349650b.close();
                } catch (C86197l e) {
                    boolean z = e instanceof C116597j;
                }
            }
            this.f349634c = null;
        }
    }

    /* renamed from: b */
    public final C116589e mo180574b() {
        String str = this.f349633b;
        C97423c cVar = this.f349637f;
        C116595h hVar = new C116595h(str, cVar.f285962d, cVar.f285963e);
        C97423c cVar2 = this.f349637f;
        C116589e eVar = new C116589e(hVar, new C86444b(new File(cVar2.f285959a, ((C86451f) cVar2.f285960b).mo120872a(this.f349633b)), this.f349637f.f285961c));
        eVar.f349621k = this.f349636e;
        return eVar;
    }

    /* renamed from: c */
    public void mo180575c(C45267d dVar, Socket socket) {
        synchronized (this) {
            this.f349634c = this.f349634c == null ? mo180574b() : this.f349634c;
        }
        try {
            this.f349632a.incrementAndGet();
            this.f349634c.mo180567d(dVar, socket);
        } finally {
            mo180573a();
        }
    }
}
