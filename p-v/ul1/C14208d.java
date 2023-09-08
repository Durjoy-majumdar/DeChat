package ul1;

import bd1.C39759i;
import bd1.C54447c;
import com.tencent.p014mm.sdk.platformtools.Log;
import qg1.C47826f;
import te3.C49882ip2;
import te3.C50266li0;
import te3.C50415mk1;
import zc1.C66785b;

/* renamed from: ul1.d */
public final class C14208d implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ C49882ip2 f39678a;

    public C14208d(C49882ip2 ip22) {
        this.f39678a = ip22;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        C66785b bVar = C66785b.f191882e;
        C54447c cVar = new C54447c(bVar.mo90662O5());
        C49882ip2 ip22 = this.f39678a;
        C50266li0 li02 = cVar.field_liveInfo;
        if (li02 != null) {
            li02.f137434h = ip22;
        }
        bVar.mo90672m1(cVar, C39759i.LIVE_LOTTERY_CREATE);
        Log.m105924i("FinderLiveLotteryCreateConfig", "setLiveLotterySetting success:" + this.f39678a.f135571d + ", " + this.f39678a.f135572e + '!');
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        Log.m105920e("FinderLiveLotteryCreateConfig", "setLiveLotterySetting fail!");
    }
}
