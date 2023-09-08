package p377qu;

import com.tencent.p014mm.modelstat.C81016b;
import com.tencent.p014mm.modelstat.C81023c;
import com.tencent.p014mm.modelstat.C81027f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import kj2.C117407d;
import p680ru.C77570i;
import qe3.C89625d;

@C86522b
/* renamed from: qu.c */
public class C89852c extends C86301e implements C77570i {
    public void Ge0(String str, long j, long j2) {
        if (C89625d.f257845k || C89625d.f257844j) {
            Log.m105925i("MicroMsg.ClickFlowStatSender", "kvCheck :%s [%s,%s,%s]", str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j2 - j));
            C117407d dVar = C117407d.INSTANCE;
            dVar.kvStat(13393, "99999,0,0," + j + "," + j2 + "," + str);
        }
    }

    /* renamed from: bH */
    public void mo107724bH() {
        C81016b i = C81016b.m98929i();
        i.getClass();
        Log.m105929w("MicroMsg.ClickFlowStatReceiver", "commitNow return:%s time:%d", (Boolean) new C81023c(i, 3000, Boolean.FALSE).exec(i.f237961a), Long.valueOf(Util.milliSecondsToNow(Util.nowMilliSecond())));
    }

    /* renamed from: zI */
    public void mo107725zI(int i, String str, int i2) {
        C81027f.m98942b(i, str, i2);
    }
}
