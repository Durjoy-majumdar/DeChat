package wb1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import java.util.Iterator;
import java.util.LinkedList;
import kj2.C117407d;
import p1081gi.C98121d;
import p749xh.C66261f3;
import pb1.C100697a1;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100755z;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101801kd0;
import te3.C101834rc0;
import xb1.C102614d;

/* renamed from: wb1.a */
public class C102384a extends C98597b {

    /* renamed from: f */
    public final C13601g f301545f;

    /* renamed from: wb1.a$a */
    public static final class C102385a extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ C98598e f301546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102385a(C98598e eVar) {
            super(0);
            this.f301546d = eVar;
        }

        public Object invoke() {
            return new LifecycleScope("FavCdnService", this.f301546d, 0, 4, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102384a(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
        this.f301545f = C36568h.m40985a(new C102385a(eVar));
    }

    /* renamed from: g3 */
    public final void mo141968g3(C100746u uVar) {
        C87412m.m108594g(uVar, "cdnInfo");
        int i = uVar.field_type;
        if (i == 0) {
            C100734q.m131810A0(uVar);
        } else if (i == 1) {
            C100734q.m131883x0(uVar);
        }
    }

    /* renamed from: i3 */
    public final boolean mo141969i3(C101801kd0 kd02, C100746u uVar) {
        LinkedList<C101834rc0> linkedList;
        if (!(kd02 == null || (linkedList = kd02.f298618f) == null)) {
            for (C101834rc0 rc02 : linkedList) {
                if (C87412m.m108589b(uVar.field_dataId, rc02.f299280T)) {
                    rc02.mo141253f(uVar.field_cdnKey);
                    rc02.mo141254j(uVar.field_cdnUrl);
                    Log.m105925i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish nest data key and url updated, md5:%s, cdnUrl:%s", uVar.field_dataId, uVar.field_cdnUrl);
                    return true;
                } else if (C87412m.m108589b(uVar.field_dataId, C100734q.m131825P(rc02.f299280T))) {
                    rc02.mo141255k(uVar.field_cdnKey);
                    rc02.mo141256l(uVar.field_cdnUrl);
                    Log.m105925i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish nest thumb key and url updated, md5:%s, cdnUrl:%s", uVar.field_dataId, uVar.field_cdnUrl);
                    return true;
                } else if (C100734q.m131833X(rc02.f299258I) && mo141969i3(rc02.f299275Q1, uVar)) {
                    C100697a1 a1Var = (C100697a1) C86312j.m106911c(C100697a1.class);
                    C101801kd0 kd03 = rc02.f299275Q1;
                    String str = null;
                    String str2 = kd03 != null ? kd03.f298626q : null;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    if (kd03 != null) {
                        str = kd03.f298628s;
                    }
                    if (str != null) {
                        str3 = str;
                    }
                    C87412m.m108593f(kd03, "dataItem.protoItem");
                    rc02.mo141234H(a1Var.tn0(str2, str3, kd03, rc02.f299258I));
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j3 */
    public final int mo141970j3(C100746u uVar, int i) {
        C87412m.m108594g(uVar, "info");
        if (uVar.field_totalLen > 26214400) {
            return CdnLogic.kMediaTypeFavoriteBigFile;
        }
        if ((uVar.field_extFlag & 1) == 0) {
            return i;
        }
        Log.m105929w("MicroMsg.Fav.BaseFavCdnServiceFSC", "NEED To Exchange Type, defType %d", Integer.valueOf(i));
        return 10002 == i ? 10001 : 10002;
    }

    /* renamed from: k3 */
    public final LifecycleScope mo141971k3() {
        return (LifecycleScope) ((C36570n) this.f301545f).getValue();
    }

    /* renamed from: l3 */
    public final void mo141972l3(C100746u uVar, C98121d dVar) {
        Class cls = C100718j1.class;
        C87412m.m108594g(uVar, "cdnInfo");
        C87412m.m108594g(dVar, "completeResult");
        if (((C100718j1) C86312j.m106911c(cls)).mo128199Jq() == null) {
            Log.m105920e("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish getFavItemInfoStorage null!");
            return;
        }
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(uVar.field_favLocalId);
        if (Yt == null) {
            Log.m105920e("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish item info null!");
            return;
        }
        Iterator<C101834rc0> it = Yt.field_favProto.f298618f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C101834rc0 next = it.next();
            if (C87412m.m108589b(uVar.field_dataId, next.f299280T)) {
                next.mo141253f(uVar.field_cdnKey);
                next.mo141254j(uVar.field_cdnUrl);
                if (uVar.field_type == 0) {
                    if (uVar.field_dataType == 4) {
                        Log.m105925i("MicroMsg.Fav.BaseFavCdnServiceFSC", "video stream, id:%s", dVar.field_videoFileId);
                        next.mo141250Y(dVar.field_videoFileId);
                    }
                }
                Yt.field_xml = C100755z.m131907w2(Yt);
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(Yt, C66261f3.COL_LOCALID);
                Log.m105925i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish data key and url updated, md5:%s, cdnUrl:%s", uVar.field_dataId, uVar.field_cdnUrl);
            } else if (C87412m.m108589b(uVar.field_dataId, C100734q.m131825P(next.f299280T))) {
                next.mo141255k(uVar.field_cdnKey);
                next.mo141256l(uVar.field_cdnUrl);
                Yt.field_xml = C100755z.m131907w2(Yt);
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(Yt, C66261f3.COL_LOCALID);
                Log.m105925i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish thumb key and url updated, md5:%s, cdnUrl:%s", uVar.field_dataId, uVar.field_cdnUrl);
                break;
            } else if (C100734q.m131833X(next.f299258I) && mo141969i3(next.f299275Q1, uVar)) {
                C100697a1 a1Var = (C100697a1) C86312j.m106911c(C100697a1.class);
                C101801kd0 kd02 = next.f299275Q1;
                String str = null;
                String str2 = kd02 != null ? kd02.f298626q : null;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                if (kd02 != null) {
                    str = kd02.f298628s;
                }
                if (str != null) {
                    str3 = str;
                }
                C87412m.m108593f(kd02, "dataItem.protoItem");
                next.mo141234H(a1Var.tn0(str2, str3, kd02, next.f299258I));
                Yt.field_xml = C100755z.m131907w2(Yt);
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(Yt, C66261f3.COL_LOCALID);
            }
        }
        mo141968g3(uVar);
    }

    /* renamed from: m3 */
    public final void mo141973m3(long j) {
        C117407d.INSTANCE.idkeyStat(1926, j, 1, false);
    }

    /* renamed from: n3 */
    public final void mo141974n3(long j) {
        C117407d.INSTANCE.idkeyStat(1927, j, 1, false);
    }
}
