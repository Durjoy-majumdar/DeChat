package xl3;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.autogen.events.LbsroomLogicEvent;
import com.tencent.p014mm.p136ui.FindMoreFriendsUI;
import com.tencent.p014mm.p136ui.FinderIconViewTipPreference;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fd0.C75743h;
import fn3.C59263a;
import gt1.C20838b;
import gy3.C87412m;
import ht1.C60152b4;
import ht1.C60200t1;
import ht1.C76243a5;
import p147ea.C20556f;
import te3.C64586nn1;

/* renamed from: xl3.f */
public final class C23104f {

    /* renamed from: a */
    public final Context f66384a;

    /* renamed from: b */
    public final FindMoreFriendsUI f66385b;

    /* renamed from: c */
    public C0120a0<C2458a> f66386c;

    /* renamed from: d */
    public FinderIconViewTipPreference f66387d;

    /* renamed from: e */
    public boolean f66388e = ((C20838b) C86312j.m106911c(C20838b.class)).mo32540ag();

    public C23104f(Context context, FindMoreFriendsUI findMoreFriendsUI) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f66384a = context;
        this.f66385b = findMoreFriendsUI;
    }

    /* renamed from: a */
    public final void mo36509a(FinderIconViewTipPreference finderIconViewTipPreference, boolean z) {
        Class cls = C60200t1.class;
        int kD = C75743h.xx0().mo100937kD();
        int i = 0;
        if (!z) {
            kD = 0;
        }
        LbsroomLogicEvent lbsroomLogicEvent = new LbsroomLogicEvent();
        lbsroomLogicEvent.f193724d.f193726a = 7;
        lbsroomLogicEvent.publish();
        if (lbsroomLogicEvent.f193725e.f193727a || !z) {
            Log.m105924i("NearbyEntryPreferenceMgr", "observeNearbyFriendsRedDot: clear footprint red dot");
            C60152b4.C8759a.m8562b(((C60200t1) C86312j.m106911c(cls)).Nt0(), 1014, (String) null, 2, (Object) null);
        } else {
            Log.m105924i("NearbyEntryPreferenceMgr", "observeNearbyFriendsRedDot: add footprint red dot");
            ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77270j().mo2466c();
        }
        C64586nn1 R5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5("NearbyPeopleTab");
        if (R5 != null) {
            i = R5.f184503e;
        }
        if (kD > 0) {
            Log.m105924i("NearbyEntryPreferenceMgr", "observeNearbyFriendsRedDot: add unread red dot,insideRedDotUnRedCount = " + i + ", unRead = " + kD);
            if (kD > i) {
                ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77270j().mo2464a(kD);
            }
        } else {
            Log.m105924i("NearbyEntryPreferenceMgr", "observeNearbyFriendsRedDot: clear unread red dot");
            C60152b4.C8759a.m8562b(((C60200t1) C86312j.m106911c(cls)).Nt0(), 1013, (String) null, 2, (Object) null);
        }
        Class cls2 = C76243a5.class;
        Class cls3 = C20838b.class;
        this.f66387d = finderIconViewTipPreference;
        if (this.f66386c != null) {
            Log.m105928w("NearbyEntryPreferenceMgr", "observeNearbyEntrance lastIsEnableFindLiveState:" + this.f66388e + " isEnableFindLive:" + ((C20838b) C86312j.m106911c(cls3)).mo32540ag() + "  preference: " + finderIconViewTipPreference + ' ' + finderIconViewTipPreference.hashCode() + " return for observing.");
            if (this.f66388e != ((C20838b) C86312j.m106911c(cls3)).mo32540ag()) {
                if (!((C20838b) C86312j.m106911c(cls3)).mo32540ag()) {
                    ((C76243a5) C86312j.m106911c(cls2)).mo13235dN("removeFinderLiveEntranceShowInfo");
                    ((C76243a5) C86312j.m106911c(cls2)).Js0();
                } else {
                    ((C76243a5) C86312j.m106911c(cls2)).M10("removeNearbyEntryLiveShowInfo");
                    ((C76243a5) C86312j.m106911c(cls2)).mo13241je();
                }
                this.f66388e = ((C20838b) C86312j.m106911c(cls3)).mo32540ag();
                return;
            }
            return;
        }
        Log.m105924i("NearbyEntryPreferenceMgr", "observeNearbyEntrance preference:" + finderIconViewTipPreference + ' ' + finderIconViewTipPreference.hashCode());
        C23103e eVar = new C23103e(this);
        this.f66386c = eVar;
        ((C76243a5) C86312j.m106911c(cls2)).mo13237eU(this.f66385b, eVar);
        this.f66388e = ((C20838b) C86312j.m106911c(cls3)).mo32540ag();
    }

    /* renamed from: b */
    public final void mo36510b(boolean z) {
        if (z && this.f66385b.f55668C) {
            Intent intent = new Intent();
            intent.putExtra("key_context_id", C59263a.m69190b());
            ((C20556f) C86312j.m106911c(C20556f.class)).as0(intent);
        }
    }
}
