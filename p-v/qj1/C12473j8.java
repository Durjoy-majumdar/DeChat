package qj1;

import ak1.C0076j0;
import ak1.C54116w;
import android.os.Bundle;
import cj1.C0548h5;
import cj1.C0639y1;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import dj1.C58291w0;
import gy3.C87412m;
import ig1.C8916d;
import java.util.LinkedList;
import l31.C61212e;
import o40.C61926c;
import ob0.C47350c;
import pe3.C47465a;
import qj1.C12360e8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C51354t71;
import te3.C51548uh3;

/* renamed from: qj1.j8 */
public final class C12473j8 implements C12360e8.C12371d {

    /* renamed from: a */
    public final /* synthetic */ C12360e8 f35880a;

    /* renamed from: b */
    public final /* synthetic */ String f35881b;

    /* renamed from: c */
    public final /* synthetic */ boolean f35882c;

    /* renamed from: d */
    public final /* synthetic */ boolean f35883d;

    public C12473j8(C12360e8 e8Var, String str, boolean z, boolean z2) {
        this.f35880a = e8Var;
        this.f35881b = str;
        this.f35882c = z;
        this.f35883d = z2;
    }

    /* renamed from: a */
    public void mo9974a(boolean z, int i, C12360e8.C12371d.C12373b bVar, String str, Long l, int i2, String str2, String str3, C58291w0 w0Var) {
        LinkedList<C51548uh3> linkedList;
        C12360e8 e8Var;
        C12666si siVar;
        C47350c cVar;
        boolean z2 = z;
        int i3 = i;
        C12360e8.C12371d.C12373b bVar2 = bVar;
        String str4 = str;
        Long l2 = l;
        int i4 = i2;
        String str5 = str2;
        C58291w0 w0Var2 = w0Var;
        C87412m.m108594g(bVar2, "errType");
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "sendGiftCallback, success:" + z2 + " errCode:" + i3 + " errType:" + bVar2 + ",rewardGiftId:" + str4 + ",balance:" + l2 + ",cnt:" + i4 + ",comboId:" + str5);
        C51354t71 t712 = null;
        boolean z3 = true;
        if (z2) {
            C12360e8 e8Var2 = this.f35880a;
            if (l2 != null) {
                C58124b bVar3 = e8Var2.f35606p;
                C58124b.C58125b bVar4 = C58124b.C58125b.LIVE_EVENT_GIFT_UPDATE_WECOIN;
                Bundle bundle = new Bundle();
                bundle.putLong("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN", l.longValue());
                C13598b0 b0Var = C13598b0.f38549a;
                bVar3.statusChange(bVar4, bundle);
            } else {
                C58124b.C7172a.m7372a(e8Var2.f35606p, C58124b.C58125b.LIVE_EVENT_GIFT_UPDATE_WECOIN, (Bundle) null, 2, (Object) null);
            }
            if (this.f35880a.f35606p.getLiveRole() == 0) {
                C0548h5 h5Var = C0548h5.f1327a;
                C12360e8 e8Var3 = this.f35880a;
                C0548h5.m491b(h5Var, e8Var3.f35606p, ((C55001u) e8Var3.mo87696x0(C55001u.class)).f154420q.f182392d, C0548h5.C0550b.SendGift, false, 8, (Object) null);
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_gift_real_send", this.f35880a.f166287d, C90364q0.m113147f(new C13604l("live_gift_id", str4), new C13604l("live_gift_count", Integer.valueOf(i2))), 25561);
                ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.SINGLE_OR_CONTINUE_CLICK_SELECT_GITF_SEND, str4, i4);
            }
            C58124b.C7172a.m7372a(this.f35880a.f35606p, C58124b.C58125b.REWARD, (Bundle) null, 2, (Object) null);
            C8916d d = C0639y1.f1510a.mo612d(str4 == null ? this.f35881b : str4);
            if (d == null || !d.mo9724o2()) {
                z3 = false;
            }
            if (z3 && (siVar = e8Var.f35605S) != null) {
                String str6 = str4 == null ? this.f35881b : str4;
                C12360e8.C12365c.C12366a c1 = e8Var.mo12051c1((e8Var = this.f35880a).f35595H, str4 == null ? this.f35881b : str4, this.f35882c);
                C87412m.m108594g(str6, "giftId");
                C47465a aVar = (w0Var2 == null || (cVar = w0Var2.f256789f) == null) ? null : cVar.f127056b.f127083a;
                if (aVar instanceof C51354t71) {
                    t712 = (C51354t71) aVar;
                }
                if (t712 == null) {
                    Log.m105920e(siVar.f36268b, "resp null");
                } else {
                    C61926c.m72668M(new C12702ui(t712, siVar, str6, str2, c1));
                }
            }
            C12360e8 e8Var4 = this.f35880a;
            C61926c.m72668M(new C12599p8(str4 == null ? this.f35881b : str4, str2, i2, e8Var4, e8Var4.f35609s));
            return;
        }
        C12360e8 e8Var5 = this.f35880a;
        if (e8Var5.f35614x) {
            if (e8Var5.mo14483f0() == 0) {
                C12360e8 e8Var6 = this.f35880a;
                e8Var6.getClass();
                if (!(w0Var2 == null || w0Var2.f166910v != 8 || (linkedList = e8Var6.f35615y) == null)) {
                    C61926c.m72661F("resumePkgGiftPatchInfoOnFail", new C12449i8(linkedList, w0Var2, e8Var6));
                }
            } else {
                LinkedList<C51548uh3> linkedList2 = this.f35880a.f35615y;
                if (linkedList2 != null) {
                    linkedList2.clear();
                }
                this.f35880a.f35616z.clear();
            }
        }
        this.f35880a.mo12053f1();
        int ordinal = bVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 || i3 == 10000) {
                return;
            }
            if (i3 != 10003) {
                C12360e8 e8Var7 = this.f35880a;
                e8Var7.getClass();
                C61926c.m72668M(new C12500l8((String) null, e8Var7));
            } else if (this.f35883d) {
                C12360e8.m11919Z0(this.f35880a, str5);
            }
        } else if (i3 != -200046) {
            C12360e8 e8Var8 = this.f35880a;
            e8Var8.getClass();
            C61926c.m72668M(new C12500l8(str3, e8Var8));
        }
    }
}
