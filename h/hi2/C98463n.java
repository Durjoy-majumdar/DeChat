package hi2;

import com.tencent.p014mm.sdk.platformtools.Log;
import h90.C98324b;

/* renamed from: hi2.n */
public final class C98463n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98324b f288796d;

    public C98463n(C98324b bVar) {
        this.f288796d = bVar;
    }

    public final void run() {
        for (String str : this.f288796d.f288191l) {
            Log.m105924i("MicroMsg.MediaFileUtil", "delete file:" + str);
            C98453h.f288774a.mo137810h(str);
        }
    }
}
