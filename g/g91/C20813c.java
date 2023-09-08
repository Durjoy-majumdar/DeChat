package g91;

import android.os.Message;

/* renamed from: g91.c */
public final class C20813c {

    /* renamed from: b */
    public static C20813c f58816b;

    /* renamed from: a */
    public C20816f f58817a = new C20816f();

    /* renamed from: a */
    public static C20813c m22810a() {
        if (f58816b == null) {
            synchronized (C20813c.class) {
                if (f58816b == null) {
                    f58816b = new C20813c();
                }
            }
        }
        return f58816b;
    }

    /* renamed from: b */
    public void mo32507b(int i) {
        C20811a aVar = new C20811a();
        aVar.f58811a = i;
        C20816f fVar = this.f58817a;
        Message obtainMessage = fVar.f58818a.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = aVar;
        fVar.f58818a.sendMessage(obtainMessage);
    }

    /* renamed from: c */
    public void mo32508c(int i, Object obj) {
        C20811a aVar = new C20811a();
        aVar.f58811a = i;
        aVar.f58812b = obj;
        C20816f fVar = this.f58817a;
        Message obtainMessage = fVar.f58818a.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = aVar;
        fVar.f58818a.sendMessage(obtainMessage);
    }
}
