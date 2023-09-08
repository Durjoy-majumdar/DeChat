package s52;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.ArrayList;
import s52.C48235m;
import te3.C51264sl3;

/* renamed from: s52.k */
public class C48233k implements C87581a<Object, C51264sl3> {

    /* renamed from: a */
    public final /* synthetic */ int f129228a;

    /* renamed from: b */
    public final /* synthetic */ long f129229b;

    public C48233k(int i, long j) {
        this.f129228a = i;
        this.f129229b = j;
    }

    public Object call(Object obj) {
        C51264sl3 sl32 = (C51264sl3) obj;
        Log.m105924i("MicroMsg.QueryWeChatWalletManager", "callback ui");
        int i = this.f129228a - 1;
        if (sl32 != null || i < 0) {
            C48235m.f129230a = false;
            int size = ((ArrayList) C48235m.f129231b).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C48235m.C48236a aVar = (C48235m.C48236a) ((ArrayList) C48235m.f129231b).get(size);
                aVar.mo66646a(sl32);
                ((ArrayList) C48235m.f129231b).remove(aVar);
            }
        } else if (i >= 0) {
            long j = this.f129229b;
            new C48229c(j, (C51264sl3) null).mo9225i().mo123064p(new C48234l()).mo123062e(new C48233k(i, j));
        }
        return null;
    }
}
