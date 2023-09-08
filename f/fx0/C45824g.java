package fx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.LinkedHashSet;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p243tn.C14050a;
import pe3.C47465a;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C90363p0;
import te3.C49004ci;
import te3.C49148di;
import te3.cr4;
import te3.gr4;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: fx0.g */
public final class C45824g implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ int f123725d;

    /* renamed from: e */
    public final /* synthetic */ C49004ci f123726e;

    public C45824g(int i, C49004ci ciVar) {
        this.f123725d = i;
        this.f123726e = ciVar;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        gr4 gr4;
        gr4 gr42;
        gr4 gr43;
        Log.m105925i("MicroMsg.BizVideoChannelStrategy", "fetchBizVideoChannelStrategy callback %d/%d %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        int i3 = this.f123725d;
        if (i3 == 2 || i3 == 1) {
            C45825h.f123727a.mo71291b().putLong("biz_video_channel_strategy_fetch_last_time", System.currentTimeMillis());
        } else {
            C45825h.f123727a.mo71291b().putLong("biz_video_channel_strategy_tl_fetch_last_time", System.currentTimeMillis());
        }
        if (i == 0 && i2 == 0) {
            C47465a aVar = cVar.f127056b.f127083a;
            C49148di diVar = aVar instanceof C49148di ? (C49148di) aVar : null;
            if (diVar == null) {
                return 0;
            }
            cr4 cr4 = diVar.f132338h;
            if (cr4 == null || (gr43 = cr4.f131923e) == null || gr43.f134224n != 0) {
                C45825h hVar = C45825h.f123727a;
                hVar.mo71297j(1);
                if ((this.f123726e.f131731d & 8) != 0) {
                    C45825h.m51117k(diVar);
                    int i4 = this.f123725d;
                    cr4 cr42 = diVar.f132338h;
                    if (!(cr42 == null || (gr42 = cr42.f131923e) == null)) {
                        if (i4 == 1 || i4 == 2) {
                            int i5 = gr42.f134226p;
                            if (i5 > 0) {
                                Log.m105925i("MicroMsg.BizVideoChannelStrategy", "fetchBizVideoChannelStrategy expose interval = %d", Integer.valueOf(i5));
                                hVar.mo71291b().putLong("biz_video_channel_strategy_fetch_interval", (long) gr42.f134226p);
                            }
                        } else {
                            int i6 = gr42.f134226p;
                            if (i6 > 0) {
                                Log.m105925i("MicroMsg.BizVideoChannelStrategy", "fetchBizVideoChannelStrategy tl interval = %d", Integer.valueOf(i6));
                                hVar.mo71291b().putLong("biz_video_channel_strategy_tl_fetch_interval", (long) gr42.f134226p);
                            }
                        }
                    }
                    cr4 cr43 = diVar.f132338h;
                    if (!(cr43 == null || (gr4 = cr43.f131923e) == null)) {
                        String[] strArr = {gr4.f134220g, gr4.f134222i, gr4.f134234x};
                        LinkedHashSet linkedHashSet = new LinkedHashSet(C90363p0.m113142a(3));
                        C110823p.m150997W(strArr, linkedHashSet);
                        for (String str2 : C110818d0.m150953y0(linkedHashSet)) {
                            if (!(str2 == null || C112551y.m153811k(str2))) {
                                String b = C14050a.m13405b(str2);
                                if (!C86013q1.m106450k(b)) {
                                    C45825h.f123727a.mo71297j(10);
                                    ((C119157j) C119157j.f356862d).mo183895z(new C45827i(str2, b));
                                }
                            }
                        }
                    }
                }
                return 0;
            }
            Log.m105924i("MicroMsg.BizVideoChannelStrategy", "sync_flag is 0, just return!");
            return 0;
        }
        C45825h.f123727a.mo71297j(2);
        return 0;
    }
}
