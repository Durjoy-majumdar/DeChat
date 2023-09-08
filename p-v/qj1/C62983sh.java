package qj1;

import al1.C54130j;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import b50.C54405b;
import b50.C54410e;
import b50.C54412f;
import cj1.C54763g6;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C58115i;
import d60.C58124b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k50.C60974c;
import p204mr.C61567i;
import p204mr.C61570q;
import p50.C62193a;
import p50.C62197e;
import s50.C110747k;
import s50.C63713p;
import te3.C49712hj1;
import u50.C65212a;
import w50.C65933h;

/* renamed from: qj1.sh */
public final class C62983sh extends C62660c implements C65212a {

    /* renamed from: p */
    public final C58124b f178709p;

    /* renamed from: q */
    public Context f178710q;

    /* renamed from: r */
    public final LivePreviewView f178711r;

    /* renamed from: s */
    public boolean f178712s;

    /* renamed from: qj1.sh$a */
    public static final class C62984a implements C54410e {
        public void callback(int i, Bundle bundle) {
            Log.m105924i("Finder.FinderLiveVisitorPreviewPlugin", "on exit room finish");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62983sh(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178709p = bVar;
        this.f178710q = viewGroup.getContext();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358581fx0);
        ((LivePreviewView) findViewById).setPluginCallback(this);
        C87412m.m108593f(findViewById, "root.findViewById<LivePr…sitorPreviewPlugin)\n    }");
        this.f178711r = (LivePreviewView) findViewById;
    }

    /* renamed from: P */
    public String mo87795P() {
        String n4 = ((C54991o) mo87696x0(C54991o.class)).mo76015n4();
        return n4 == null ? "" : n4;
    }

    /* renamed from: Z0 */
    public final void mo87919Z0() {
        C62197e a1 = mo87920a1();
        if (a1 != null) {
            a1.mo85676R(new C62984a());
        }
    }

    /* renamed from: a1 */
    public final C62197e mo87920a1() {
        return C62193a.f176816k1.mo87262c(mo87686C0().f151977d.f157064e);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87921b1(boolean z) {
        Class cls = C61567i.class;
        C61570q qVar = C61570q.LIVE_TRTC;
        if (this.f178712s != z) {
            String str = "";
            if (z) {
                if (!true || !true) {
                    str = null;
                }
                ((C61567i) C86312j.m106911c(cls)).mo86500Tw(qVar, str, (C32224a<String>) null);
            } else {
                if (!true || !true) {
                    str = null;
                }
                ((C61567i) C86312j.m106911c(cls)).Dh0(qVar, str, (C32224a<String>) null);
            }
        }
        this.f178712s = z;
    }

    /* renamed from: c1 */
    public final void mo87922c1() {
        C54405b bVar;
        C54405b bVar2;
        C54405b bVar3;
        C54405b bVar4;
        C54405b bVar5;
        Log.m105924i("Finder.FinderLiveVisitorPreviewPlugin", "visitor startPreview");
        Iterator it = ((ArrayList) C65933h.f189544a.mo89975f()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C65933h.C65935b bVar6 = (C65933h.C65935b) it.next();
            int i = bVar6.f189556a;
            C54763g6 g6Var = C54763g6.f153485a;
            if (i == g6Var.mo75665b()) {
                C62197e a1 = mo87920a1();
                if (!(a1 == null || (bVar5 = a1.f173032r) == null)) {
                    ((C54412f) bVar5).mo75225h(bVar6.f189559d, bVar6.f189560e);
                }
                C62197e a15 = mo87920a1();
                if (!(a15 == null || (bVar4 = a15.f173032r) == null)) {
                    ((C54412f) bVar4).mo75224g(g6Var.mo75666c(bVar6.f189556a, 1));
                }
                C62197e a16 = mo87920a1();
                if (a16 != null && (bVar3 = a16.f173032r) != null) {
                    C54405b.C54406a.m61097a(bVar3, g6Var.mo75666c(bVar6.f189556a, 2), false, false, 4, (Object) null);
                }
            }
        }
        C62197e a17 = mo87920a1();
        if (!(a17 == null || (bVar2 = a17.f173032r) == null)) {
            int w = FinderLiveService.f159376d.mo77649w();
            C110747k kVar = ((C54412f) bVar2).f152607b;
            kVar.getClass();
            kVar.mo148312q(new C63713p(kVar, w));
        }
        C62197e a18 = mo87920a1();
        if (!(a18 == null || (bVar = a18.f173032r) == null)) {
            ((C54412f) bVar).mo75189c(FinderLiveService.f159376d.mo77650x());
        }
        C62197e a19 = mo87920a1();
        if (a19 != null) {
            LivePreviewView livePreviewView = this.f178711r;
            FinderLiveService.f159376d.getClass();
            a19.mo85700s0(livePreviewView, FinderLiveService.f159390t, FinderLiveService.f159393w);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r1 = r1.f172989A;
     */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87923d1() {
        /*
            r2 = this;
            p50.e r0 = r2.mo87920a1()
            if (r0 == 0) goto L_0x000a
            com.tencent.mm.live.core.view.LivePreviewView r1 = r2.f178711r
            r0.f173033s = r1
        L_0x000a:
            p50.e r0 = r2.mo87920a1()
            if (r0 == 0) goto L_0x0021
            p50.e r1 = r2.mo87920a1()
            if (r1 == 0) goto L_0x001d
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = r1.f166260g
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r0.mo85706z0(r1)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62983sh.mo87923d1():void");
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        Log.printInfoStack("Finder.FinderLiveVisitorPreviewPlugin", "setVisible " + i, new Object[0]);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        T t;
        C87412m.m108594g(linkedHashMap, "micUserMap");
        List<C54130j> list = ((C54963d0) mo87696x0(C54963d0.class)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) mo87696x0(C54991o.class)).mo76015n4())) {
                    break;
                }
            }
        }
        mo87921b1(t != null);
    }

    /* renamed from: r0 */
    public void mo8358r0() {
    }

    /* renamed from: s0 */
    public void mo3209s0() {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal != 7) {
            if (ordinal != 8) {
                if (ordinal == 10) {
                    Log.m105924i("Finder.FinderLiveVisitorPreviewPlugin", "switchCamera");
                    C62197e a1 = mo87920a1();
                    if (a1 != null) {
                        a1.mo85703v0();
                        return;
                    }
                    return;
                } else if (ordinal == 16) {
                    if (bundle != null) {
                        bundle.getBoolean("PARAM_HANGUP_SELF", false);
                    }
                    C62197e a15 = mo87920a1();
                    if (a15 != null) {
                        a15.mo87278U0();
                    }
                    FinderLiveService.f159376d.mo77609L();
                    return;
                } else if (!(ordinal == 27 || ordinal == 28)) {
                    if (ordinal == 43) {
                        C62197e a16 = mo87920a1();
                        if (a16 != null) {
                            a16.mo87278U0();
                            return;
                        }
                        return;
                    } else if (ordinal == 44) {
                        mo10792g(0);
                        mo87922c1();
                        this.f178711r.mo76420c();
                        C62197e a17 = mo87920a1();
                        if (a17 != null) {
                            a17.f172989A.f166256c = C58115i.C58116a.VIDEO_LINK_MIC;
                            C60974c cVar = a17.f173025i;
                            if (cVar != null) {
                                cVar.mo85949b(false);
                            }
                            a17.mo85686c0(false);
                            a17.mo85684b0(false);
                            a17.mo75212E();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            mo87919Z0();
            mo10792g(8);
            return;
        }
        ((C54963d0) mo87696x0(C54963d0.class)).f154077t.observe(this, new C63040uh(this));
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo87921b1(false);
    }
}
