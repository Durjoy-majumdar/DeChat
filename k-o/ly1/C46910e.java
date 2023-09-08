package ly1;

import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C47350c;
import vw1.C53017h;

/* renamed from: ly1.e */
public class C46910e implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ int f126133a;

    /* renamed from: b */
    public final /* synthetic */ IPCString f126134b;

    /* renamed from: c */
    public final /* synthetic */ C99723d f126135c;

    public C46910e(C99723d dVar, int i, IPCString iPCString) {
        this.f126135c = dVar;
        this.f126133a = i;
        this.f126134b = iPCString;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105925i("MicroMsg.GameHaowanDataCenter", "checkNewVideo errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            C53017h hVar = (C53017h) cVar.f127056b.f127083a;
            String nullAsNil = Util.nullAsNil(hVar.f147986i);
            if (nullAsNil.contains("[count]")) {
                int i3 = this.f126133a + hVar.f147985h;
                if (i3 > 0) {
                    this.f126134b.f10315d = nullAsNil.replace("[count]", String.valueOf(i3));
                }
            } else {
                this.f126134b.f10315d = nullAsNil;
            }
        }
        synchronized (this.f126135c.f292268a) {
            this.f126135c.f292268a.notifyAll();
        }
    }
}
