package p264ww;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C51712vn;
import xc0.C53320a;
import xc0.C78789e;

/* renamed from: ww.d */
public final class C78729d implements C78789e.C78793b {

    /* renamed from: ww.d$a */
    public static final class C78730a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C51712vn> f230439d;

        public C78730a(LinkedList<C51712vn> linkedList) {
            this.f230439d = linkedList;
        }

        public final void run() {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.f230439d);
            C86709a0.m107524d().mo123460f(new C53320a(C78728a.f230437a, linkedList));
        }
    }

    /* renamed from: a */
    public void mo103578a(boolean z, LinkedList<C51712vn> linkedList) {
        C87412m.m108594g(linkedList, "imgInfoList");
        Log.m105925i("MicroMsg.ExtensionsForRemark", "upload cdn finish, succeed:%s", Boolean.valueOf(z));
        if (z) {
            MMHandlerThread.postToMainThread(new C78730a(linkedList));
        }
    }
}
