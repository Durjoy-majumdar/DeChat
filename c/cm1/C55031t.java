package cm1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderClickStruct;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import df1.C7322a;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58771q3;
import gy3.C87412m;
import ht1.C60172g4;
import p749xh.C66261f3;
import rs1.C13442s8;
import te3.C49712hj1;
import vq1.C65854g;
import vq1.C65866w;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: cm1.t */
public final class C55031t {

    /* renamed from: a */
    public static final C55031t f154490a = new C55031t();

    /* renamed from: a */
    public final void mo76085a(AppCompatActivity appCompatActivity, FinderItem finderItem, boolean z, int i, int i2) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        Class cls = C13442s8.class;
        C87412m.m108594g(appCompatActivity2, "context");
        C87412m.m108594g(finderItem, C66261f3.COL_FINDEROBJECT);
        Log.m105924i("Finder.FinderFavLogic", "favFeed, id:" + finderItem.getId() + ", pf:" + finderItem.getFeedObject().permissionFlag);
        C39818r rVar = C39818r.f106831a;
        C49712hj1 q3 = ((C13442s8) rVar.mo62444c(appCompatActivity2).mo75002a(cls)).mo12861q3();
        int i3 = 1;
        if (z) {
            C39622i0 a = rVar.mo62444c(appCompatActivity2).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
            C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
            if (b != null) {
                b.mo8766a(new C7322a.C7323a(10, finderItem.getId()));
            }
        } else {
            C39622i0 a2 = rVar.mo62444c(appCompatActivity2).mo75002a(cls);
            C87412m.m108593f(a2, "UICProvider.of(context).…rReporterUIC::class.java)");
            C7322a b2 = C60172g4.C60173a.m70190b((C60172g4) a2, 0, 1, (Object) null);
            if (b2 != null) {
                b2.mo8766a(new C7322a.C7323a(11, finderItem.getId()));
            }
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        long id = finderItem.getId();
        int i4 = z ? 2 : 1;
        y0Var.getClass();
        FinderItem Br0 = y0Var.Br0(id);
        if (Br0 != null) {
            FinderClickStruct finderClickStruct = new FinderClickStruct();
            finderClickStruct.f155144d = finderClickStruct.mo86045b("SessionId", q3.f134670d, true);
            String str = "";
            finderClickStruct.f155145e = finderClickStruct.mo86045b("ClickUI", str, true);
            finderClickStruct.f155146f = finderClickStruct.mo86045b("FeedId", y0Var.xx0(id), true);
            finderClickStruct.f155147g = finderClickStruct.mo86045b("FeedUsr", Br0.getUserName(), true);
            finderClickStruct.f155148h = 5;
            finderClickStruct.f155149i = (long) i4;
            finderClickStruct.f155150j = 0;
            finderClickStruct.f155151k = finderClickStruct.mo86045b("ReplyUsr", str, true);
            finderClickStruct.f155152l = 2;
            finderClickStruct.f155153m = (long) Br0.getLikeCount();
            finderClickStruct.f155154n = (long) Br0.getCommentCount();
            finderClickStruct.f155155o = (long) Br0.getFriendLikeCount();
            finderClickStruct.f155156p = (long) Br0.getMediaType();
            finderClickStruct.f155157q = finderClickStruct.mo86045b("Tag", C112551y.m153814n(C58771q3.f168268a.mo83810a(Br0), ",", ";", false), true);
            finderClickStruct.f155158r = finderClickStruct.mo86045b("TagId", str, true);
            finderClickStruct.f155159s = (long) q3.f134675i;
            finderClickStruct.f155160t = C87412m.m108589b(Br0.getUserName(), C66785b.f191882e.mo90662O5()) ? 1 : 0;
            String str2 = q3.f134671e;
            if (str2 == null) {
                str2 = str;
            }
            finderClickStruct.f155162v = finderClickStruct.mo86045b("ContextId", str2, true);
            String str3 = q3.f134672f;
            if (str3 == null) {
                str3 = str;
            }
            finderClickStruct.f155163w = finderClickStruct.mo86045b("ClickTabContextId", str3, true);
            finderClickStruct.f155164x = finderClickStruct.mo86045b("SessionBuffer", y0Var.mo83281Cu(id, q3.f134675i), true);
            String str4 = q3.f134681r;
            finderClickStruct.f155166z = finderClickStruct.mo86045b("ExtraInfo", str4 != null ? C112551y.m153814n(str4, ",", ";", false) : str, true);
            String str5 = q3.f134682s;
            if (str5 != null) {
                str = C112551y.m153814n(str5, ",", ";", false);
            }
            finderClickStruct.f155142A = finderClickStruct.mo86045b("enterSourceInfo", str, true);
            finderClickStruct.mo86054n();
            y0Var.Ec0(finderClickStruct);
        }
        C65854g.m77575a(C65854g.f189373e, finderItem, z, i, (C65866w.C14969b) null, q3, i2, 8, (Object) null);
        FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
        feedUpdateEvent.f9173d.f9174a = finderItem.getId();
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        if (!z) {
            i3 = 2;
        }
        aVar.f9176c = i3;
        aVar.f9175b = 5;
        feedUpdateEvent.publish();
    }
}
