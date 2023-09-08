package ii1;

import al1.C54130j;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveShadeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.ratio.RatioLayout;
import d60.C58124b;
import fh1.C8070p;
import fy3.C32224a;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C87412m;
import gy3.C87413o;
import iq3.C60601c;
import j50.C60735a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import li1.C61289a;
import li1.C61291b;
import li1.C61292c;
import li1.C61293d;
import li1.C61294e;
import li1.C61295f;
import ni1.C61753b;
import o40.C61926c;
import ok1.C62042e;
import pi1.C62304g;
import pi1.C62305h;
import pi1.C62311l;
import qj1.C62660c;
import rx3.C13598b0;
import si1.C63902g;
import si1.C63903h;
import sx3.C36907w;
import sx3.C90363p0;
import te3.C49712hj1;

/* renamed from: ii1.e */
public final class C60291e extends C62660c implements C61753b {

    /* renamed from: A */
    public int f171913A = 1;

    /* renamed from: p */
    public final C58124b f171914p;

    /* renamed from: q */
    public final ViewGroup f171915q;

    /* renamed from: r */
    public final RatioLayout f171916r;

    /* renamed from: s */
    public final C61294e f171917s;

    /* renamed from: t */
    public final C61291b f171918t;

    /* renamed from: u */
    public final C61292c f171919u;

    /* renamed from: v */
    public final C61293d f171920v;

    /* renamed from: w */
    public boolean f171921w;

    /* renamed from: x */
    public boolean f171922x;

    /* renamed from: y */
    public LivePreviewView f171923y;

    /* renamed from: z */
    public final C61295f f171924z;

    /* renamed from: ii1.e$a */
    public static final class C60292a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f171925d;

        /* renamed from: e */
        public final /* synthetic */ C60291e f171926e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60292a(String str, C60291e eVar) {
            super(0);
            this.f171925d = str;
            this.f171926e = eVar;
        }

        public Object invoke() {
            Log.m105924i("FinderLiveMicCoverPlugin", "updateVideoWidgetCover userId:" + this.f171925d);
            int childCount = this.f171926e.f171916r.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f171926e.f171916r.getChildAt(i);
                if (childAt != null && (childAt instanceof C63903h)) {
                    ((C63903h) childAt).mo88689x();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60291e(ViewGroup viewGroup, C58124b bVar, FinderLiveShadeView finderLiveShadeView, ViewGroup viewGroup2) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(finderLiveShadeView, "shadeView");
        this.f171914p = bVar;
        this.f171915q = viewGroup2;
        RatioLayout ratioLayout = (RatioLayout) viewGroup;
        this.f171916r = ratioLayout;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        C61294e eVar = new C61294e(context, this, this);
        this.f171917s = eVar;
        Context context2 = viewGroup.getContext();
        C87412m.m108593f(context2, "root.context");
        this.f171918t = new C61291b(context2, this, this);
        Context context3 = viewGroup.getContext();
        C87412m.m108593f(context3, "root.context");
        this.f171919u = new C61292c(context3, this, this);
        Context context4 = viewGroup.getContext();
        C87412m.m108593f(context4, "root.context");
        this.f171920v = new C61293d(context4, this, this);
        C61295f fVar = new C61295f();
        this.f171924z = fVar;
        ratioLayout.setAdapter(eVar);
        ratioLayout.setLayoutManager(new C60601c());
        ratioLayout.setItemDecoration(fVar);
        this.f171923y = (LivePreviewView) viewGroup.getRootView().findViewById(C0966R.C0970id.f358581fx0);
        mo10792g(8);
    }

    /* renamed from: Y */
    public void mo85275Y() {
        C58124b.C7172a.m7372a(this.f171914p, C58124b.C58125b.LIVE_STATUS_VIDEO_MIC, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: Z0 */
    public final C61289a mo85276Z0() {
        C59464c value = ((C54963d0) mo87696x0(C54963d0.class)).f154077t.getValue();
        int i = value != null ? value.f169898c : 0;
        C61289a aVar = i != 1 ? i != 2 ? i != 3 ? this.f171917s : this.f171919u : this.f171920v : this.f171918t;
        boolean z = this.f171921w;
        boolean z2 = this.f171922x;
        aVar.f174403h = z;
        aVar.f174404i = z2;
        this.f171916r.setAdapter(aVar);
        return aVar;
    }

    /* renamed from: a1 */
    public final C62311l mo85277a1(String str) {
        String str2;
        C87412m.m108594g(str, "sdkUserId");
        C61289a Z0 = mo85276Z0();
        if (!Z0.mo85558f()) {
            return null;
        }
        Log.m105924i("FinderLiveMicBaseRatioAdapter", "getFocusGiftCallback " + str);
        int childCount = Z0.mo85556d().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = Z0.mo85556d().getChildAt(i);
            C63902g gVar = childAt instanceof C63902g ? (C63902g) childAt : null;
            if (gVar != null) {
                C54130j curBindLinkMicUser = gVar.getCurBindLinkMicUser();
                if (curBindLinkMicUser == null || (str2 = curBindLinkMicUser.f151997a) == null) {
                    str2 = "";
                }
                if (C87412m.m108589b(str, str2)) {
                    return gVar.getMicGiftCallback();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo85278b1(boolean z) {
        C61291b bVar = this.f171918t;
        if (bVar.mo85558f()) {
            int i = 0;
            int childCount = bVar.mo85556d().getChildCount();
            while (i < childCount) {
                View childAt = bVar.mo85556d().getChildAt(i);
                C62305h hVar = childAt instanceof C62305h ? (C62305h) childAt : null;
                if (hVar == null) {
                    i++;
                } else if (hVar.f177115v.f175490i.getVisibility() != 8 && !C87412m.m108589b(hVar.f177116w, Boolean.valueOf(z))) {
                    C61926c.m72668M(new C62304g(hVar, z));
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c1 */
    public final void mo85279c1() {
        T t;
        boolean z;
        Class cls = C54963d0.class;
        int childCount = this.f171916r.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f171916r.getChildAt(i);
            if (childAt instanceof C63902g) {
                List<C54130j> list = ((C54963d0) mo87696x0(cls)).f154074q;
                C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
                synchronized (list) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        t = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        String str = ((C54130j) next).f151997a;
                        C54130j curBindLinkMicUser = ((C63902g) childAt).getCurBindLinkMicUser();
                        if (curBindLinkMicUser != null) {
                            t = curBindLinkMicUser.f151997a;
                        }
                        if (Util.isEqual(str, (String) t)) {
                            t = next;
                            break;
                        }
                    }
                }
                C54130j jVar = (C54130j) t;
                if (jVar != null) {
                    boolean u = C61926c.m72696u(jVar.f152018v, 16);
                    if (((C54963d0) mo87696x0(cls)).f154067g != u) {
                        String str2 = jVar.f151997a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (C87412m.m108589b(((C54991o) mo87696x0(C54991o.class)).mo76015n4(), str2) && !C62042e.f176370a.mo87027N0()) {
                            ((C54963d0) mo87696x0(cls)).f154067g = u;
                            z = true;
                            ((C63902g) childAt).mo86941l(jVar.f152010n, jVar.f152018v, z);
                        }
                    }
                    z = false;
                    ((C63902g) childAt).mo86941l(jVar.f152010n, jVar.f152018v, z);
                }
            }
        }
    }

    /* renamed from: d1 */
    public final void mo85280d1(String str) {
        C61926c.m72668M(new C60292a(str, this));
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
        LinkedHashMap linkedHashMap2;
        LinkedList<C59463a> linkedList;
        String str;
        Class cls = C54991o.class;
        Class cls2 = C54963d0.class;
        C87412m.m108594g(linkedHashMap, "micUserMap");
        C8070p pVar = (C8070p) mo87685B0(C8070p.class);
        if (pVar != null) {
            pVar.mo9158J3(linkedHashMap);
        }
        C59464c value = ((C54963d0) mo87696x0(cls2)).f154077t.getValue();
        boolean z = true;
        boolean z2 = value != null && value.f169898c == 1;
        C59464c value2 = ((C54963d0) mo87696x0(cls2)).f154077t.getValue();
        int i = value2 != null ? value2.f169898c : 0;
        if (i == 2) {
            C61295f fVar = this.f171924z;
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(new C61295f.C61296a(new PointF(0.0f, 0.33333334f), new PointF(1.0f, 0.33333334f)));
            linkedList2.add(new C61295f.C61296a(new PointF(0.0f, 0.6666667f), new PointF(1.0f, 0.6666667f)));
            linkedList2.add(new C61295f.C61296a(new PointF(0.33333334f, 0.0f), new PointF(0.33333334f, 1.0f)));
            linkedList2.add(new C61295f.C61296a(new PointF(0.6666667f, 0.0f), new PointF(0.6666667f, 1.0f)));
            fVar.mo86274b(linkedList2);
        } else if (i != 3) {
            this.f171924z.mo86274b(new LinkedList());
        } else {
            C61295f fVar2 = this.f171924z;
            LinkedList linkedList3 = new LinkedList();
            linkedList3.add(new C61295f.C61296a(new PointF(0.5f, 0.25f), new PointF(1.0f, 0.25f)));
            linkedList3.add(new C61295f.C61296a(new PointF(0.5f, 0.5f), new PointF(1.0f, 0.5f)));
            linkedList3.add(new C61295f.C61296a(new PointF(0.5f, 0.75f), new PointF(1.0f, 0.75f)));
            linkedList3.add(new C61295f.C61296a(new PointF(0.75f, 0.0f), new PointF(0.75f, 1.0f)));
            fVar2.mo86274b(linkedList3);
        }
        Log.m105924i("FinderLiveMicCoverPlugin", "onMicUserChanged isMicForceMode: " + z2 + " size " + linkedHashMap.size());
        LivePreviewView livePreviewView = this.f171923y;
        if (livePreviewView != null) {
            if (!z2) {
                linkedHashMap2 = new LinkedHashMap();
            } else {
                C59464c value3 = ((C54963d0) mo87696x0(cls2)).f154077t.getValue();
                if (value3 == null || (linkedList = value3.f169896a) == null) {
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    int a = C90363p0.m113142a(C36907w.m41090l(linkedList, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(a);
                    for (C59463a aVar : linkedList) {
                        C54130j jVar = aVar.f169894a;
                        if (jVar == null || (str = jVar.f151997a) == null) {
                            str = "";
                        }
                        linkedHashMap3.put(str, Float.valueOf(aVar.f169895b.f169903g == 1 ? 0.0f : (float) C76577a.m92151b(this.f166287d.getContext(), 4)));
                    }
                    linkedHashMap2 = linkedHashMap3;
                }
                LinkedHashMap linkedHashMap4 = linkedHashMap2;
            }
            if (C62042e.f176370a.mo87027N0()) {
                String str2 = ((C55001u) mo87696x0(C55001u.class)).f154419p.f182319n;
            } else {
                FinderLiveService.f159376d.getClass();
                C60735a aVar2 = FinderLiveService.f159378f;
                if (aVar2 == null || !aVar2.mo85682Z()) {
                    z = false;
                }
                if (z) {
                    ((C54991o) mo87696x0(cls)).mo76015n4();
                }
            }
            livePreviewView.f157153e.setPreviewCornerRadius(linkedHashMap2);
        }
        if (linkedHashMap.keySet().size() != this.f171913A) {
            this.f171913A = linkedHashMap.keySet().size();
            mo87689H0(this.f166287d, "FinderLiveMicCoverPlugin");
        }
        if (linkedHashMap.get(((C54991o) mo87696x0(cls)).mo76015n4()) == null) {
            ((C54963d0) mo87696x0(cls2)).f154067g = false;
        }
    }

    /* renamed from: q */
    public void mo85281q(int i) {
        T t;
        Class cls = C54991o.class;
        List<C54130j> list = ((C54963d0) mo87696x0(C54963d0.class)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) mo87696x0(cls)).mo76015n4())) {
                break;
            }
        }
        if (!(t != null) && !C62042e.f176370a.mo87027N0() && !((C54991o) mo87696x0(cls)).f154190D) {
            C58124b bVar = this.f171914p;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_LINK_MIC_CHECKED;
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", i);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
        }
    }

    /* renamed from: r */
    public void mo85282r() {
        C58124b.C7172a.m7372a(this.f171914p, C58124b.C58125b.LIVE_STATUS_SWITCH_AUDIO_MIC, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        String str;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            ((C54963d0) mo87696x0(C54963d0.class)).f154077t.observe(this, new C60289c(this));
        } else if (ordinal == 164) {
            C61289a Z0 = mo85276Z0();
            String n4 = ((C54991o) mo87696x0(C54991o.class)).mo76015n4();
            if (n4 == null) {
                n4 = "";
            }
            if (Z0.mo85558f()) {
                Log.m105924i("FinderLiveMicBaseRatioAdapter", "openTrtcUserOptionPanel " + n4);
                int childCount = Z0.mo85556d().getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = Z0.mo85556d().getChildAt(i);
                    C63902g gVar = childAt instanceof C63902g ? (C63902g) childAt : null;
                    if (gVar != null) {
                        C54130j curBindLinkMicUser = gVar.getCurBindLinkMicUser();
                        if (curBindLinkMicUser == null || (str = curBindLinkMicUser.f151997a) == null) {
                            str = "";
                        }
                        if (C87412m.m108589b(n4, str)) {
                            gVar.mo88683r(2);
                            break;
                        }
                    }
                    i++;
                }
            }
        } else if (ordinal == 169) {
            this.f171921w = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            this.f171922x = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
        }
        C61289a Z02 = mo85276Z0();
        if (C61289a.C61290a.f174405a[bVar.ordinal()] == 1) {
            Z02.f174403h = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            Z02.f174404i = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
            if (!Z02.mo85558f()) {
                Log.m105924i("FinderLiveMicBaseRatioAdapter", "notifyAnchorModeSwitch layout isInitialized = false");
                return;
            }
            int childCount2 = Z02.mo85556d().getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                if (Z02.mo85556d().getChildAt(i2) instanceof C62305h) {
                    View childAt2 = Z02.mo85556d().getChildAt(i2);
                    C87412m.m108592e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.focus.FinderLiveMicFocusAnchorCoverWidget");
                    ((C62305h) childAt2).mo87377x(Z02.f174403h, Z02.f174404i);
                }
            }
        }
    }
}
