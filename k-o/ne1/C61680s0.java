package ne1;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.autogen.events.FinderExposeInfoChangeEvent;
import com.tencent.p014mm.plugin.finder.service.C3604o1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C8794p5;
import jp3.C9487b;
import kj2.C117407d;
import nr3.C89059e;
import o40.C61926c;
import pe3.C89349b;
import sx3.C26236u;
import te3.C50401mh0;
import te3.C51954xc1;
import vp1.C65834e;
import zc1.C66785b;

@C86522b
/* renamed from: ne1.s0 */
public final class C61680s0 extends C61685z0<C51954xc1> implements C3604o1 {

    /* renamed from: e */
    public final String f175374e = "Finder.FinderModifyFeedSettingService";

    /* renamed from: KD */
    public void mo3973KD(C9487b<?> bVar, long j, String str, boolean z, C8794p5<C51954xc1> p5Var) {
        C87412m.m108594g(bVar, "keeper");
        C87412m.m108594g(str, "objectNonceId");
        C51954xc1 xc12 = new C51954xc1();
        xc12.f144586d = j;
        xc12.f144587e = 5;
        xc12.f144588f = z ? 1 : 0;
        xc12.f144589g = str;
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = xx0();
        mh02.f138029e = vx0(xc12);
        C89059e i = new C61677a(C66785b.f191882e.mo90662O5(), C26236u.m33719b(mh02), false, 0, (String) null, 24, (C8480h) null).mo9225i();
        i.mo11397F(bVar);
        i.mo123420E(new C61684y0(this, p5Var, xc12));
    }

    /* renamed from: NA */
    public void mo3974NA(long j, String str, boolean z, C8794p5<C51954xc1> p5Var) {
        C87412m.m108594g(str, "objectNonceId");
        C51954xc1 xc12 = new C51954xc1();
        xc12.f144586d = j;
        xc12.f144587e = 4;
        xc12.f144588f = z ? 1 : 0;
        xc12.f144589g = str;
        C61685z0.Ax0(this, xc12, p5Var, false, false, 12, (Object) null);
    }

    public void Z70(long j, FinderObject finderObject, String str, boolean z, C8794p5<C51954xc1> p5Var) {
        C87412m.m108594g(str, "objectNonceId");
        C51954xc1 xc12 = new C51954xc1();
        xc12.f144586d = j;
        xc12.f144587e = 2;
        xc12.f144588f = z ? 1 : 0;
        xc12.f144589g = str;
        C61685z0.Ax0(this, xc12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C51954xc1 xc12 = (C51954xc1) obj;
        C87412m.m108594g(xc12, "modUserInfo");
        return C89349b.m111674a(xc12.toByteArray());
    }

    /* renamed from: wm */
    public void mo3976wm(long j, FinderObject finderObject, String str, boolean z, C8794p5<C51954xc1> p5Var) {
        FinderObject finderObject2 = finderObject;
        String str2 = str;
        C87412m.m108594g(finderObject, "feedObj");
        C87412m.m108594g(str2, "objectNonceId");
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        int i = z ? 2 : 1;
        y0Var.getClass();
        String str3 = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + i + ',' + y0Var.xx0(finderObject2.f164794id) + ',' + finderObject2.username + ',' + finderObject2.likeCount + ',' + finderObject2.commentCount + ',' + finderObject2.friendLikeCount;
        Log.m105924i(y0Var.f167350d, "18952 " + str3);
        C117407d.INSTANCE.kvStat(18952, str3);
        C51954xc1 xc12 = new C51954xc1();
        xc12.f144586d = j;
        xc12.f144587e = 1;
        xc12.f144588f = z ^ true ? 1 : 0;
        xc12.f144589g = str2;
        C61685z0.Ax0(this, xc12, p5Var, false, false, 12, (Object) null);
    }

    public int xx0() {
        return 4;
    }

    public String yx0() {
        return this.f175374e;
    }

    public void zx0(Object obj, int i) {
        C51954xc1 xc12 = (C51954xc1) obj;
        C87412m.m108594g(xc12, "cmdBufItem");
        C65834e eVar = C65834e.f189316a;
        FinderItem e = eVar.mo89871e(xc12.f144586d);
        if (e != null) {
            if (i == 0) {
                int i2 = xc12.f144587e;
                if (i2 == 1) {
                    e.setComment_close(xc12.f144588f);
                } else if (i2 == 2) {
                    e.setPrivate_flag(xc12.f144588f);
                } else if (i2 == 4) {
                    C61926c.m72668M(new C11154r0(xc12, e));
                }
            }
            FinderExposeInfoChangeEvent finderExposeInfoChangeEvent = new FinderExposeInfoChangeEvent();
            finderExposeInfoChangeEvent.f154769d.f154770a = e.getId();
            finderExposeInfoChangeEvent.publish();
            String str = this.f175374e;
            Log.m105924i(str, "FinderExposeInfoChangeEvent " + finderExposeInfoChangeEvent.f154769d.f154770a + ' ' + e.getComment_close());
            eVar.mo89878l(e, C65834e.C65836b.f189327g);
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            feedUpdateEvent.f9173d.f9174a = e.field_id;
            feedUpdateEvent.publish();
        }
    }
}
