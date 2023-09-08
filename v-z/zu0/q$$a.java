package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMConditionVariable;
import gv0.C20852h;
import ob0.C11385n;
import ob0.C117747y;
import yu0.C102910f;
import yu0.C102911g;

public final /* synthetic */ class q$$a implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C23587q f67666d;

    /* renamed from: e */
    public final /* synthetic */ int f67667e;

    /* renamed from: f */
    public final /* synthetic */ boolean f67668f;

    /* renamed from: g */
    public final /* synthetic */ MMConditionVariable f67669g;

    public /* synthetic */ q$$a(C23587q qVar, int i, boolean z, MMConditionVariable mMConditionVariable) {
        this.f67666d = qVar;
        this.f67667e = i;
        this.f67668f = z;
        this.f67669g = mMConditionVariable;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        C23587q qVar = this.f67666d;
        int i4 = this.f67667e;
        boolean z = this.f67668f;
        MMConditionVariable mMConditionVariable = this.f67669g;
        qVar.getClass();
        int i5 = C102910f.f303738g;
        if ((i5 == 1 || i5 == 21 || i5 == 22) && qVar.f67663j.f67615d.mo142622e().f303748b < (i3 = i4 + 1)) {
            int i6 = qVar.f67663j.f67615d.mo142622e().f303749c;
            C102911g e = qVar.f67663j.f67615d.mo142622e();
            if (i3 > i6) {
                i3 = i6;
            }
            e.f303748b = i3;
            C23584k kVar = qVar.f67663j;
            kVar.f67614c.mo17705K(kVar.f67615d.mo142622e().mo142623a());
        }
        String str2 = ((C20852h) yVar).f58923v.f353141g;
        Log.m105925i(qVar.f67665o, "Send Tag finish last:%b  cv:%s [%d,%d,%s] tag[%s,%s]", Boolean.valueOf(z), mMConditionVariable, Integer.valueOf(i), Integer.valueOf(i2), str, qVar.f67657d, str2);
        if (z && qVar.f67657d.equals(str2)) {
            mMConditionVariable.open();
        }
        C23588r rVar = qVar.f67658e;
        if (rVar != null) {
            t$$a t__a = (t$$a) rVar;
            C23590t tVar = t__a.f67689a;
            long j = t__a.f67690b;
            tVar.getClass();
            Log.m105919d("MicroMsg.BackupPackAndSend.TagQueueSucker", "setTagEnd taskIndex:%d", Long.valueOf(j));
            tVar.f67688d.addAndGet(-1);
        }
    }
}
