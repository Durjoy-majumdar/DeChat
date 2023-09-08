package si1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54130j;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import cj1.C0556j5;
import cl1.C0702z0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dl1.C58321a;
import fy3.C32226l;
import gi1.C59463a;
import gy3.C87412m;
import java.util.regex.Pattern;
import ni1.C61751a;
import ni1.C61753b;
import nj3.C11184p0;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import pi1.C62308k;
import pi1.C62311l;
import qj1.C62660c;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C64674r41;

/* renamed from: si1.g */
public abstract class C63902g extends C61751a implements C11184p0, C62311l {

    /* renamed from: h */
    public final C62660c f181128h;

    /* renamed from: i */
    public final C61753b f181129i;

    /* renamed from: j */
    public final int f181130j;

    /* renamed from: n */
    public C77407n f181131n;

    /* renamed from: o */
    public C77407n f181132o;

    /* renamed from: p */
    public C32226l<? super Integer, C13598b0> f181133p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63902g(Context context, C62660c cVar, C61753b bVar, int i) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
        this.f181128h = cVar;
        this.f181129i = bVar;
        this.f181130j = i;
    }

    /* renamed from: c */
    public void mo86637c(C58321a aVar, C59463a aVar2) {
        C87412m.m108594g(aVar, "widgetMode");
        C87412m.m108594g(aVar2, "data");
        super.mo86637c(aVar, aVar2);
        mo88670h();
        mo86914q();
    }

    public final C62660c getBasePlugin() {
        return this.f181128h;
    }

    public final C54130j getCurBindLinkMicUser() {
        return getBindLinkMicUser();
    }

    public abstract /* synthetic */ ViewGroup getGiftRootView();

    public ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    public abstract /* synthetic */ ViewGroup getLuckyMoneyRootView();

    public C62311l getMicGiftCallback() {
        return this;
    }

    public final Integer getMicType() {
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            return Integer.valueOf(bindLinkMicUser.f152001e);
        }
        return null;
    }

    public final C61753b getService() {
        return this.f181129i;
    }

    public final String getTAG() {
        return getTagString() + '_' + getCurWidgetMode();
    }

    public abstract String getTagString();

    public ViewGroup getVoteBubbleRootView() {
        return null;
    }

    public final int getWidgetType() {
        return this.f181130j;
    }

    /* renamed from: h */
    public void mo88670h() {
    }

    /* renamed from: i */
    public final boolean mo88678i() {
        C54130j bindLinkMicUser = getBindLinkMicUser();
        return C61926c.m72696u(bindLinkMicUser != null ? bindLinkMicUser.f152018v : 0, 16);
    }

    /* renamed from: j */
    public boolean mo86966j() {
        return this instanceof C62308k;
    }

    /* renamed from: k */
    public final boolean mo88679k() {
        String n4 = ((C54991o) this.f181128h.mo87696x0(C54991o.class)).mo76015n4();
        C54130j bindLinkMicUser = getBindLinkMicUser();
        return C87412m.m108589b(n4, bindLinkMicUser != null ? bindLinkMicUser.f151997a : null);
    }

    /* renamed from: l */
    public void mo86941l(boolean z, int i, boolean z2) {
        if (z2 && mo88679k() && !C62042e.f176370a.mo87027N0()) {
            boolean i2 = mo88678i();
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", i2 || ((C54991o) this.f181128h.mo87696x0(C54991o.class)).f154274W2);
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_SET_MUTE_MIC", false);
            this.f181128h.f177936g.statusChange(C58124b.C58125b.FINDER_LIVE_MUTE_MIC, bundle);
            if (i2) {
                C76912y0.m92769h(getContext(), getContext().getResources().getString(C0966R.string.hz_), C0966R.raw.icons_filled_mic_off);
            } else {
                C76912y0.m92769h(getContext(), getContext().getResources().getString(C0966R.string.mo4), C0966R.raw.icons_filled_mike);
            }
            C64674r41 r412 = new C64674r41();
            r412.f185127g = 10001;
            r412.f185126f = i2 ? getContext().getResources().getString(C0966R.string.hz_) : getContext().getResources().getString(C0966R.string.mo4);
            ((C0702z0) this.f181128h.mo87696x0(C0702z0.class)).f1672f.add(new C0556j5(r412));
        }
    }

    /* renamed from: m */
    public final void mo88680m() {
        if (((C54991o) this.f181128h.mo87696x0(C54991o.class)).f154287Z0 == 2) {
            Log.m105924i(getTAG(), "onAvatarClick cur mode couldn't click!");
        } else if (mo88679k()) {
            mo88683r(1);
        } else {
            mo88684s();
        }
    }

    /* renamed from: n */
    public void mo86942n() {
        Class cls = C54116w.class;
        Class cls2 = C54991o.class;
        ((C54991o) this.f181128h.mo87696x0(cls2)).f154274W2 = !((C54991o) this.f181128h.mo87696x0(cls2)).f154274W2;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", ((C54991o) this.f181128h.mo87696x0(cls2)).f154274W2);
        this.f181128h.f177936g.statusChange(C58124b.C58125b.FINDER_LIVE_MUTE_MIC, bundle);
        if (((C54991o) this.f181128h.mo87696x0(cls2)).f154274W2) {
            C76912y0.m92769h(getContext(), getContext().getResources().getString(C0966R.string.dg5), C0966R.raw.icons_filled_mic_off);
            C54067f0.C54085u0 u0Var = C54067f0.C54085u0.TRTC_OPTION_PANEL_MUTE_CLICK;
            Log.m105924i("FinderLiveMicReportUtil", "reportLink21084 action: " + 18);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.oy0((C54116w) c, u0Var, (C54067f0.C54068a0) null, 0, 6, (Object) null);
        } else {
            C76912y0.m92769h(getContext(), getContext().getResources().getString(C0966R.string.dff), C0966R.raw.icons_filled_mike);
            C54067f0.C54085u0 u0Var2 = C54067f0.C54085u0.TRTC_OPTION_PANEL_CANCEL_MUTE;
            Log.m105924i("FinderLiveMicReportUtil", "reportLink21084 action: " + 21);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.oy0((C54116w) c2, u0Var2, (C54067f0.C54068a0) null, 0, 6, (Object) null);
        }
        C77407n nVar = this.f181132o;
        if (nVar != null) {
            nVar.mo107572p();
        }
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            mo86941l(bindLinkMicUser.f152010n, bindLinkMicUser.f152018v, false);
        }
    }

    /* renamed from: o */
    public final void mo88681o() {
        if (C62042e.f176370a.mo87027N0()) {
            mo88682p();
        } else if (mo88678i() && mo88679k()) {
            C76912y0.m92769h(getContext(), getContext().getResources().getString(C0966R.string.hz_), C0966R.raw.icons_filled_mic_off);
        }
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C54116w.class;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            C32226l<? super Integer, C13598b0> lVar = this.f181133p;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(menuItem != null ? menuItem.getItemId() : -1));
            }
            C77407n nVar = this.f181131n;
            if (nVar != null) {
                nVar.mo107572p();
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            mo86942n();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            C58124b.C7172a.m7372a(this.f181128h.f177936g, C58124b.C58125b.SWITCH_CAMERA, (Bundle) null, 2, (Object) null);
            C77407n nVar2 = this.f181132o;
            if (nVar2 != null) {
                nVar2.mo107572p();
            }
            C54067f0.C54085u0 u0Var = C54067f0.C54085u0.TRTC_OPTION_PANEL_ROTATE;
            Log.m105924i("FinderLiveMicReportUtil", "reportLink21084 action: 19");
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.oy0((C54116w) c, u0Var, (C54067f0.C54068a0) null, 0, 6, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == 4) {
            C77407n nVar3 = this.f181132o;
            if (nVar3 != null) {
                nVar3.mo107572p();
            }
            C63901f fVar = new C63901f(this);
            if (this.f181131n == null) {
                C77407n nVar4 = new C77407n(getContext(), 1, true);
                this.f181131n = nVar4;
                nVar4.f225775k1 = true;
            }
            C77407n nVar5 = this.f181131n;
            if (nVar5 != null) {
                nVar5.f225792t1 = true;
            }
            if (nVar5 != null) {
                nVar5.f225771i = new C63898c(this);
            }
            if (nVar5 != null) {
                nVar5.f225782p = this;
            }
            if (nVar5 != null) {
                nVar5.f225761d = new C63899d(this);
            }
            this.f181133p = fVar;
            if (nVar5 != null) {
                nVar5.mo107573q();
            }
            C54067f0.C54085u0 u0Var2 = C54067f0.C54085u0.TRTC_OPTION_PANEL_LINK_CLOSE;
            Log.m105924i("FinderLiveMicReportUtil", "reportLink21084 action: 20");
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.oy0((C54116w) c2, u0Var2, (C54067f0.C54068a0) null, 0, 6, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == 5) {
            C77407n nVar6 = this.f181132o;
            if (nVar6 != null) {
                nVar6.mo107572p();
            }
            if (!C62042e.f176370a.mo87027N0()) {
                this.f181128h.f177936g.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_CAMERA_OPT_SHEET, (Bundle) null);
            }
        } else if (valueOf != null && valueOf.intValue() == 6) {
            this.f181129i.mo85282r();
            C77407n nVar7 = this.f181132o;
            if (nVar7 != null) {
                nVar7.mo107572p();
            }
        } else if (valueOf != null && valueOf.intValue() == 7) {
            this.f181129i.mo85275Y();
            C77407n nVar8 = this.f181132o;
            if (nVar8 != null) {
                nVar8.mo107572p();
            }
        }
    }

    /* renamed from: p */
    public final void mo88682p() {
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            C54130j bindLinkMicUser2 = getBindLinkMicUser();
            int i = bindLinkMicUser2 != null ? bindLinkMicUser2.f152018v : 0;
            Pattern pattern = C61926c.f176038a;
            bindLinkMicUser.f152018v = i & -17;
        }
        C76912y0.m92769h(getContext(), getContext().getResources().getString(C0966R.string.dff), C0966R.raw.icons_filled_mike);
        C54067f0.C54087y yVar = C54067f0.C54087y.LINKMIC_CANCEL_AUDIENCE_MUTE;
        Log.m105924i("FinderLiveMicReportUtil", "report21054 op: 22 ");
        ((C54108o) C86312j.m106911c(C54108o.class)).Xx0(yVar, "", -1, -1);
    }

    /* renamed from: q */
    public void mo86914q() {
    }

    /* renamed from: r */
    public void mo88683r(int i) {
        if (this.f181132o == null) {
            C77407n nVar = new C77407n(getContext(), 0, true);
            nVar.f225775k1 = true;
            nVar.f225776l1 = true;
            this.f181132o = nVar;
        }
        C77407n nVar2 = this.f181132o;
        if (nVar2 != null) {
            nVar2.f225771i = new C63900e(this);
        }
        if (nVar2 != null) {
            nVar2.f225782p = this;
        }
        if (nVar2 != null) {
            nVar2.mo107573q();
        }
        C54067f0.C54085u0 u0Var = i == 1 ? C54067f0.C54085u0.TRTC_OPTION_PANEL_WINDOW_EXPOSE : C54067f0.C54085u0.TRTC_OPTION_PANEL_EXPOSE;
        Log.m105924i("FinderLiveMicReportUtil", "reportLink21084 action: " + u0Var.f151719d);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.oy0((C54116w) c, u0Var, (C54067f0.C54068a0) null, 0, 6, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (((r1 == null || (r1 = r1.f152016t) == null) ? false : r1.booleanValue()) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0057, code lost:
        r1 = r1.f152014r;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88684s() {
        /*
            r5 = this;
            java.lang.Class<dk1.g> r0 = dk1.C58312g.class
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r5.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r2, r3)
            bl3.r$a r2 = r1.mo62443b(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r0)
            dk1.g r2 = (dk1.C58312g) r2
            boolean r2 = r2.f166967e
            r4 = 3
            if (r2 == 0) goto L_0x004b
            android.content.Context r2 = r5.getContext()
            gy3.C87412m.m108593f(r2, r3)
            bl3.r$a r2 = r1.mo62443b(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r0)
            dk1.g r2 = (dk1.C58312g) r2
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r2 = r2.f166968f
            if (r2 == 0) goto L_0x0034
            r2.mo77737d()
        L_0x0034:
            android.content.Context r2 = r5.getContext()
            gy3.C87412m.m108593f(r2, r3)
            bl3.r$a r1 = r1.mo62443b(r2)
            androidx.lifecycle.i0 r0 = r1.mo75002a(r0)
            dk1.g r0 = (dk1.C58312g) r0
            dk1.g$a r0 = r0.f166971i
            r0.f166979h = r4
            goto L_0x00bc
        L_0x004b:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            al1.j r1 = r5.getBindLinkMicUser()
            r2 = 0
            if (r1 == 0) goto L_0x0060
            te3.hx0 r1 = r1.f152014r
            if (r1 == 0) goto L_0x0060
            byte[] r1 = r1.toByteArray()
            goto L_0x0061
        L_0x0060:
            r1 = r2
        L_0x0061:
            java.lang.String r3 = "PARAM_MEMBERS_PROFILE_CONTACT"
            r0.putByteArray(r3, r1)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE"
            r3 = 0
            r0.putBoolean(r1, r3)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_SOURCE_TYPE"
            r0.putInt(r1, r4)
            al1.j r1 = r5.getBindLinkMicUser()
            if (r1 == 0) goto L_0x0079
            java.lang.String r2 = r1.f151999c
        L_0x0079:
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_USERNAME"
            r0.putString(r1, r2)
            al1.j r1 = r5.getBindLinkMicUser()
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r1.f151997a
            if (r1 != 0) goto L_0x008a
        L_0x0088:
            java.lang.String r1 = ""
        L_0x008a:
            java.lang.String r2 = "PARAM_MEMBERS_PROFILE_USER_MIC_ID"
            r0.putString(r2, r1)
            al1.j r1 = r5.getBindLinkMicUser()
            if (r1 == 0) goto L_0x0098
            boolean r1 = r1.f152004h
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            if (r1 != 0) goto L_0x00ad
            al1.j r1 = r5.getBindLinkMicUser()
            if (r1 == 0) goto L_0x00aa
            java.lang.Boolean r1 = r1.f152016t
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.booleanValue()
            goto L_0x00ab
        L_0x00aa:
            r1 = 0
        L_0x00ab:
            if (r1 == 0) goto L_0x00ae
        L_0x00ad:
            r3 = 1
        L_0x00ae:
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_IS_OTHER_ROOM_USER"
            r0.putBoolean(r1, r3)
            qj1.c r1 = r5.f181128h
            d60.b r1 = r1.f177936g
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_OPEN_MEMBER_PROFILE
            r1.statusChange(r2, r0)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: si1.C63902g.mo88684s():void");
    }

    public final void setTAG(String str) {
        C87412m.m108594g(str, "<set-?>");
    }
}
