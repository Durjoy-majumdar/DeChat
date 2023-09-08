package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import al1.C54127h;
import al1.C54130j;
import android.database.Cursor;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c50.C54655b;
import cj1.C54733a1;
import cj1.C54773i5;
import cl1.C54946b0;
import cl1.C54963d0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C45379o0;
import er1.C58728f5;
import f40.C86709a0;
import fe1.C58969q;
import fj1.C45795b;
import fl1.C32067g2;
import fl1.C32072q2;
import fl1.C59149a;
import fl1.C59152b;
import fl1.C59158e;
import fl1.C59161f;
import fl1.C59192h2;
import fl1.C59195i2;
import fl1.C59214n2;
import fl1.C59216o2;
import fl1.C59219p2;
import fl1.C59244y2;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import ht1.C8777j5;
import ig1.C33318e;
import ii1.C60291e;
import ij1.C60299b;
import ik1.C33342f;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kk1.C46728a;
import n50.C61620c;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C62042e;
import org.json.JSONObject;
import p165hr.C60106t;
import qj1.C12238a0;
import qj1.C12256bd;
import qj1.C12322e5;
import qj1.C12377f1;
import qj1.C12389fa;
import qj1.C12399ff;
import qj1.C12482k1;
import qj1.C12490l0;
import qj1.C12503ld;
import qj1.C12522mf;
import qj1.C12611q7;
import qj1.C12632r2;
import qj1.C12657s2;
import qj1.C12690u1;
import qj1.C12693u2;
import qj1.C12707vb;
import qj1.C12765z2;
import qj1.C62627a3;
import qj1.C62632a6;
import qj1.C62638b0;
import qj1.C62643b4;
import qj1.C62696d3;
import qj1.C62712dd;
import qj1.C62758ea;
import qj1.C62799h2;
import qj1.C62804h6;
import qj1.C62815i3;
import qj1.C62833je;
import qj1.C62861l1;
import qj1.C62889n0;
import qj1.C62911o3;
import qj1.C62921p3;
import qj1.C62924pe;
import qj1.C62966ri;
import qj1.C62976sd;
import qj1.C62987t2;
import qj1.C63006u7;
import qj1.C63049v9;
import qj1.C63068w1;
import qj1.C63081w3;
import qj1.C63100x2;
import qj1.C63108xd;
import qj1.C63111xe;
import qj1.C63118y3;
import qj1.C63129yc;
import qj1.C63151z0;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sl1.C64039c;
import te3.C48779ay0;
import te3.C51349t61;
import te3.C51498u61;
import te3.C52312zv0;
import tf0.C64916p1;
import tl1.C13969d;
import vk1.C65760a;
import xs1.C15883o;
import xs1.C66420d;
import y50.C53496k;
import y50.C66505a;
import y50.C66512f;
import y50.C66521k0;
import yg1.C16004c;
import yg1.C66636e;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.live.view.i */
public class C56061i extends C65760a implements C11385n {

    /* renamed from: h */
    public String f159882h = "Finder.LiveAnchorPluginLayout";

    /* renamed from: i */
    public C32224a<C13598b0> f159883i = new C56063b(this);

    /* renamed from: j */
    public C32224a<C13598b0> f159884j = new C56064c(this);

    /* renamed from: com.tencent.mm.plugin.finder.live.view.i$a */
    public static final class C56062a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56061i f159885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56062a(C56061i iVar) {
            super(0);
            this.f159885d = iVar;
        }

        public Object invoke() {
            C61926c.m72668M(new C56060h(this.f159885d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.i$b */
    public static final class C56063b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56061i f159886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56063b(C56061i iVar) {
            super(0);
            this.f159886d = iVar;
        }

        public Object invoke() {
            C59161f liveStartUIC = this.f159886d.getLiveStartUIC();
            liveStartUIC.getClass();
            C61926c.m72668M(new C59214n2(liveStartUIC));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.i$c */
    public static final class C56064c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56061i f159887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56064c(C56061i iVar) {
            super(0);
            this.f159887d = iVar;
        }

        public Object invoke() {
            C59161f liveStartUIC = this.f159887d.getLiveStartUIC();
            liveStartUIC.getClass();
            C61926c.m72668M(new C59216o2(liveStartUIC));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.i$d */
    public static final class C56065d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56061i f159888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56065d(C56061i iVar) {
            super(0);
            this.f159888d = iVar;
        }

        public Object invoke() {
            this.f159888d.getLiveStartUIC().mo84380o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.i$e */
    public static final class C56066e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56061i f159889d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56066e(C56061i iVar) {
            super(0);
            this.f159889d = iVar;
        }

        public Object invoke() {
            this.f159889d.getLiveStartUIC().mo84380o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.i$f */
    public static final class C56067f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56061i f159890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56067f(C56061i iVar) {
            super(0);
            this.f159890d = iVar;
        }

        public Object invoke() {
            this.f159890d.getLiveStartUIC().mo84380o();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56061i(MMActivity mMActivity, Fragment fragment, AttributeSet attributeSet) {
        super(mMActivity, fragment, attributeSet);
        C87412m.m108594g(mMActivity, "context");
    }

    public void activate(C54127h hVar, boolean z, boolean z2) {
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(hVar, "data");
        super.activate(hVar, z, z2);
        String str = this.f159882h;
        Log.m105924i(str, "liveFinish:" + ((C54991o) business(cls)).f154266V + ",isFromFloat:" + z + ", restart:" + z2 + ",liveId:" + ((C55001u) business(cls2)).f154420q.f182392d + ",objectId:" + ((C55001u) business(cls2)).f154416j + ",nonceId:" + ((C55001u) business(cls2)).f154423t + ",username:" + ((C54991o) business(cls)).f154345o);
        C59244y2 livePrepareUIC = getLivePrepareUIC();
        Class cls3 = C54108o.class;
        if (((C55001u) livePrepareUIC.mo83051g(cls2)).f154420q.f182392d == 0) {
            ((C54108o) C86312j.m106911c(cls3)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            f0Var.f151444Z = false;
            ((C54108o) C86312j.m106911c(cls3)).getClass();
            f0Var.f151446a0 = false;
            C65760a aVar = livePrepareUIC.f166837f;
            if (aVar != null) {
                C58124b.C7172a.m7372a(aVar, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
            }
        } else if (!z) {
            FinderLiveService.f159376d.getClass();
            if (!FinderLiveService.f159357J) {
                ((C54991o) livePrepareUIC.mo83051g(cls)).mo76026x4(((C64916p1) C86312j.m106911c(C64916p1.class)).mo76701iy(((C55001u) livePrepareUIC.mo83051g(cls2)).f154416j).getFinderObject());
            }
            ((C54979h1) livePrepareUIC.mo83051g(C54979h1.class)).f154135g = true;
            C65760a aVar2 = livePrepareUIC.f166837f;
            if (aVar2 != null) {
                aVar2.prepareToStart(false);
            }
        } else if (((C54991o) livePrepareUIC.mo83051g(cls)).f154266V) {
            C65760a aVar3 = livePrepareUIC.f166837f;
            if (aVar3 != null) {
                C58124b.C7172a.m7372a(aVar3, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
            }
        } else {
            C65760a aVar4 = livePrepareUIC.f166837f;
            if (aVar4 != null) {
                aVar4.prepareToStart(true);
            }
        }
        C54773i5.f153520a.mo75678a(name(), new C56062a(this));
    }

    public void applyState(int i, boolean z, int i2, boolean z2, Bundle bundle) {
        C65760a aVar;
        C63108xd xdVar;
        ViewGroup viewGroup;
        Class cls = C54946b0.class;
        Class cls2 = C54991o.class;
        boolean z3 = true;
        LinkedList<C51349t61> linkedList = null;
        if (((C54991o) business(cls2)).mo75995c4()) {
            C56032b.hideLoadingLayer$default(this, false, 1, (Object) null);
            C62643b4 b4Var = getLivePrepareUIC().f169399j;
            if (b4Var != null) {
                b4Var.mo10792g(0);
            }
            C59161f liveStartUIC = getLiveStartUIC();
            C62815i3 i3Var = liveStartUIC.f169230n;
            if (i3Var != null) {
                i3Var.mo10792g(0);
            }
            C62833je jeVar = liveStartUIC.f169231o;
            if (jeVar != null) {
                jeVar.mo10792g(8);
            }
            C12399ff ffVar = liveStartUIC.f169232p;
            if (ffVar != null) {
                ffVar.mo10792g(8);
            }
            C62632a6 a6Var = liveStartUIC.f169234q;
            if (a6Var != null) {
                a6Var.mo10792g(8);
            }
            C12322e5 e5Var = liveStartUIC.f169237t;
            if (e5Var != null) {
                e5Var.mo10792g(8);
            }
            C63151z0 z0Var = liveStartUIC.f169239v;
            if (z0Var != null) {
                z0Var.mo10792g(8);
            }
            C12389fa faVar = liveStartUIC.f169240w;
            if (faVar != null) {
                faVar.mo10792g(8);
            }
            C12707vb vbVar = liveStartUIC.f169241x;
            if (vbVar != null) {
                vbVar.mo10792g(8);
            }
            C62712dd ddVar = liveStartUIC.f169245z;
            if (ddVar != null) {
                ddVar.mo10792g(8);
            }
            C62924pe peVar = liveStartUIC.f169186A;
            if (peVar != null) {
                peVar.mo10792g(8);
            }
            FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin = liveStartUIC.f169229j;
            if (finderLiveAnchorExceptionPlugin != null) {
                finderLiveAnchorExceptionPlugin.mo10792g(8);
            }
            C63049v9 v9Var = liveStartUIC.f169243y;
            if (v9Var != null) {
                v9Var.mo10792g(8);
            }
            C12690u1 u1Var = liveStartUIC.f169188C;
            if (u1Var != null) {
                u1Var.mo10792g(8);
            }
            C12611q7 q7Var = liveStartUIC.f169197L;
            if (q7Var != null) {
                q7Var.mo10792g(8);
            }
            C63006u7 u7Var = liveStartUIC.f169198M;
            if (u7Var != null) {
                u7Var.mo10792g(8);
            }
            C12522mf mfVar = liveStartUIC.f169187B;
            if (mfVar != null) {
                mfVar.mo10792g(8);
            }
            C62889n0 n0Var = liveStartUIC.f169189D;
            if (n0Var != null) {
                n0Var.mo10792g(8);
            }
            C64039c cVar = liveStartUIC.f169191F;
            if (cVar != null) {
                cVar.mo10792g(8);
            }
            C66420d dVar = liveStartUIC.f169193H;
            if (dVar != null) {
                dVar.mo10792g(8);
            }
            C15883o oVar = liveStartUIC.f169194I;
            if (oVar != null) {
                oVar.mo10792g(8);
            }
            C12238a0 a0Var = liveStartUIC.f169195J;
            if (a0Var != null) {
                a0Var.mo10792g(8);
            }
            C62638b0 b0Var = liveStartUIC.f169196K;
            if (b0Var != null) {
                b0Var.mo10792g(8);
            }
            C13969d dVar2 = liveStartUIC.f169192G;
            if (dVar2 != null) {
                dVar2.mo10792g(8);
            }
            C62799h2 h2Var = liveStartUIC.f169199N;
            if (h2Var != null) {
                h2Var.mo10792g(8);
            }
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = liveStartUIC.f169200P;
            if (finderLiveRandomMatchLinkMicStatePlugin != null) {
                finderLiveRandomMatchLinkMicStatePlugin.mo10792g(8);
            }
            C63068w1 w1Var = liveStartUIC.f169201Q;
            if (w1Var != null) {
                w1Var.mo10792g(8);
            }
            C60291e eVar = liveStartUIC.f169207T;
            if (eVar != null) {
                eVar.mo10792g(8);
            }
            C12490l0 l0Var = liveStartUIC.f169203R;
            if (l0Var != null) {
                l0Var.mo10792g(8);
            }
            C63129yc ycVar = liveStartUIC.f169222b1;
            if (ycVar != null) {
                ycVar.mo10792g(8);
            }
            C62758ea eaVar = liveStartUIC.f169205S;
            if (eaVar != null) {
                eaVar.mo10792g(8);
            }
            C63111xe xeVar = liveStartUIC.f169209U;
            if (xeVar != null) {
                xeVar.mo10792g(8);
            }
            C63118y3 y3Var = liveStartUIC.f169202Q0;
            if (y3Var != null) {
                y3Var.mo10792g(8);
            }
            C12256bd bdVar = liveStartUIC.f169204R0;
            if (bdVar != null) {
                bdVar.mo10792g(8);
            }
            C12632r2 r2Var = liveStartUIC.f169210U0;
            if (r2Var != null) {
                r2Var.mo10792g(8);
            }
            if (((C54991o) liveStartUIC.mo83051g(cls2)).mo75960G3()) {
                C63081w3 w3Var = liveStartUIC.f169211V;
                if (w3Var != null) {
                    w3Var.mo10792g(0);
                }
            } else {
                C63081w3 w3Var2 = liveStartUIC.f169211V;
                if (w3Var2 != null) {
                    w3Var2.mo10792g(8);
                }
            }
            C12377f1 f1Var = liveStartUIC.f169206S0;
            if (f1Var != null) {
                f1Var.mo10792g(8);
            }
            C12482k1 k1Var = liveStartUIC.f169208T0;
            if (k1Var != null) {
                k1Var.mo10792g(8);
            }
            C62804h6 h6Var = liveStartUIC.f169212V0;
            if (h6Var != null) {
                h6Var.mo10792g(8);
            }
            FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin = getLiveEndUIC().f169184j;
            if (finderLiveAnchorAfterPlugin != null) {
                finderLiveAnchorAfterPlugin.mo10792g(8);
            }
        } else {
            if (!(((C54991o) business(cls2)).f154295b1 == 1)) {
                if (((C54991o) business(cls2)).mo75997d4()) {
                    C56032b.hideLoadingLayer$default(this, false, 1, (Object) null);
                    C62643b4 b4Var2 = getLivePrepareUIC().f169399j;
                    if (b4Var2 != null) {
                        b4Var2.mo10792g(8);
                    }
                    C59161f liveStartUIC2 = getLiveStartUIC();
                    C62833je jeVar2 = liveStartUIC2.f169231o;
                    if (jeVar2 != null) {
                        jeVar2.mo10792g(8);
                    }
                    C12399ff ffVar2 = liveStartUIC2.f169232p;
                    if (ffVar2 != null) {
                        ffVar2.mo10792g(8);
                    }
                    C62632a6 a6Var2 = liveStartUIC2.f169234q;
                    if (a6Var2 != null) {
                        a6Var2.mo10792g(8);
                    }
                    C60085d dVar3 = liveStartUIC2.f169236s;
                    if (dVar3 != null) {
                        dVar3.mo10792g(8);
                    }
                    C12322e5 e5Var2 = liveStartUIC2.f169237t;
                    if (e5Var2 != null) {
                        e5Var2.mo10792g(8);
                    }
                    C62976sd sdVar = liveStartUIC2.f169238u;
                    if (sdVar != null) {
                        sdVar.mo10792g(8);
                    }
                    C63049v9 v9Var2 = liveStartUIC2.f169243y;
                    if (v9Var2 != null) {
                        v9Var2.mo10792g(8);
                    }
                    C12690u1 u1Var2 = liveStartUIC2.f169188C;
                    if (u1Var2 != null) {
                        u1Var2.mo10792g(8);
                    }
                    C62712dd ddVar2 = liveStartUIC2.f169245z;
                    if (ddVar2 != null) {
                        ddVar2.mo10792g(8);
                    }
                    C62924pe peVar2 = liveStartUIC2.f169186A;
                    if (peVar2 != null) {
                        peVar2.mo10792g(8);
                    }
                    if (((C54946b0) liveStartUIC2.mo83051g(cls)).f153987n) {
                        Log.m105924i(liveStartUIC2.f169228i, "onLiveEnd: isLiveEndByForceQuit = true");
                        C48779ay0 ay02 = ((C54946b0) liveStartUIC2.mo83051g(cls)).f153988o;
                        Integer num = ((C54946b0) liveStartUIC2.mo83051g(cls)).f153989p;
                        if (ay02 == null || num == null) {
                            Log.m105924i(liveStartUIC2.f169228i, "onLiveEnd: isLiveEndByForceQuit, but no cache errorPage");
                            FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin2 = liveStartUIC2.f169229j;
                            if (finderLiveAnchorExceptionPlugin2 != null) {
                                finderLiveAnchorExceptionPlugin2.mo10792g(8);
                            }
                        } else {
                            FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin3 = liveStartUIC2.f169229j;
                            if (finderLiveAnchorExceptionPlugin3 != null) {
                                finderLiveAnchorExceptionPlugin3.mo10792g(0);
                            }
                            FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin4 = liveStartUIC2.f169229j;
                            if (finderLiveAnchorExceptionPlugin4 != null) {
                                finderLiveAnchorExceptionPlugin4.mo77686a1(((C54991o) liveStartUIC2.mo83051g(cls2)).f154345o, ay02, num.intValue());
                            }
                        }
                    } else {
                        FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin5 = liveStartUIC2.f169229j;
                        if (finderLiveAnchorExceptionPlugin5 != null) {
                            finderLiveAnchorExceptionPlugin5.mo10792g(8);
                        }
                    }
                    C12707vb vbVar2 = liveStartUIC2.f169241x;
                    if (vbVar2 != null) {
                        vbVar2.mo10792g(8);
                    }
                    C12611q7 q7Var2 = liveStartUIC2.f169197L;
                    if (q7Var2 != null) {
                        q7Var2.mo10792g(8);
                    }
                    C63006u7 u7Var2 = liveStartUIC2.f169198M;
                    if (u7Var2 != null) {
                        u7Var2.mo10792g(8);
                    }
                    C12522mf mfVar2 = liveStartUIC2.f169187B;
                    if (mfVar2 != null) {
                        mfVar2.mo10792g(8);
                    }
                    C62889n0 n0Var2 = liveStartUIC2.f169189D;
                    if (n0Var2 != null) {
                        n0Var2.mo10792g(8);
                    }
                    C64039c cVar2 = liveStartUIC2.f169191F;
                    if (cVar2 != null) {
                        cVar2.mo10792g(8);
                    }
                    C13969d dVar4 = liveStartUIC2.f169192G;
                    if (dVar4 != null) {
                        dVar4.mo10792g(8);
                    }
                    C66420d dVar5 = liveStartUIC2.f169193H;
                    if (dVar5 != null) {
                        dVar5.mo10792g(8);
                    }
                    C15883o oVar2 = liveStartUIC2.f169194I;
                    if (oVar2 != null) {
                        oVar2.mo10792g(8);
                    }
                    C12238a0 a0Var2 = liveStartUIC2.f169195J;
                    if (a0Var2 != null) {
                        a0Var2.mo10792g(8);
                    }
                    C62638b0 b0Var2 = liveStartUIC2.f169196K;
                    if (b0Var2 != null) {
                        b0Var2.mo10792g(8);
                    }
                    C62799h2 h2Var2 = liveStartUIC2.f169199N;
                    if (h2Var2 != null) {
                        h2Var2.mo10792g(8);
                    }
                    FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin2 = liveStartUIC2.f169200P;
                    if (finderLiveRandomMatchLinkMicStatePlugin2 != null) {
                        finderLiveRandomMatchLinkMicStatePlugin2.mo10792g(8);
                    }
                    C63068w1 w1Var2 = liveStartUIC2.f169201Q;
                    if (w1Var2 != null) {
                        w1Var2.mo10792g(8);
                    }
                    C60291e eVar2 = liveStartUIC2.f169207T;
                    if (eVar2 != null) {
                        eVar2.mo10792g(8);
                    }
                    C62987t2 t2Var = liveStartUIC2.f169213W;
                    if (t2Var != null) {
                        t2Var.mo10792g(8);
                    }
                    C12693u2 u2Var = liveStartUIC2.f169216X0;
                    if (u2Var != null) {
                        u2Var.mo10792g(8);
                    }
                    C63100x2 x2Var = liveStartUIC2.f169218Y0;
                    if (x2Var != null) {
                        x2Var.mo10792g(8);
                    }
                    C62861l1 l1Var = liveStartUIC2.f169220Z0;
                    if (l1Var != null) {
                        l1Var.mo10792g(8);
                    }
                    C62911o3 o3Var = liveStartUIC2.f169215X;
                    if (o3Var != null) {
                        o3Var.mo10792g(8);
                    }
                    C62921p3 p3Var = liveStartUIC2.f169217Y;
                    if (p3Var != null) {
                        p3Var.mo10792g(8);
                    }
                    C12657s2 s2Var = liveStartUIC2.f169219Z;
                    if (s2Var != null) {
                        s2Var.mo10792g(8);
                    }
                    C12765z2 z2Var = liveStartUIC2.f169233p0;
                    if (z2Var != null) {
                        z2Var.mo10792g(8);
                    }
                    C62627a3 a3Var = liveStartUIC2.f169242x0;
                    if (a3Var != null) {
                        a3Var.mo10792g(8);
                    }
                    C62696d3 d3Var = liveStartUIC2.f169244y0;
                    if (d3Var != null) {
                        d3Var.mo10792g(8);
                    }
                    C12490l0 l0Var2 = liveStartUIC2.f169203R;
                    if (l0Var2 != null) {
                        l0Var2.mo10792g(8);
                    }
                    C63129yc ycVar2 = liveStartUIC2.f169222b1;
                    if (ycVar2 != null) {
                        ycVar2.mo10792g(8);
                    }
                    C12503ld ldVar = liveStartUIC2.f169223c1;
                    if (ldVar != null) {
                        ldVar.mo10792g(8);
                    }
                    C62758ea eaVar2 = liveStartUIC2.f169205S;
                    if (eaVar2 != null) {
                        eaVar2.mo10792g(8);
                    }
                    C63111xe xeVar2 = liveStartUIC2.f169209U;
                    if (xeVar2 != null) {
                        xeVar2.mo10792g(8);
                    }
                    C63081w3 w3Var3 = liveStartUIC2.f169211V;
                    if (w3Var3 != null) {
                        w3Var3.mo10792g(8);
                    }
                    C63118y3 y3Var2 = liveStartUIC2.f169202Q0;
                    if (y3Var2 != null) {
                        y3Var2.mo10792g(8);
                    }
                    C12256bd bdVar2 = liveStartUIC2.f169204R0;
                    if (bdVar2 != null) {
                        bdVar2.mo10792g(8);
                    }
                    C12377f1 f1Var2 = liveStartUIC2.f169206S0;
                    if (f1Var2 != null) {
                        f1Var2.mo10792g(8);
                    }
                    C12482k1 k1Var2 = liveStartUIC2.f169208T0;
                    if (k1Var2 != null) {
                        k1Var2.mo10792g(8);
                    }
                    C12632r2 r2Var2 = liveStartUIC2.f169210U0;
                    if (r2Var2 != null) {
                        r2Var2.mo10792g(8);
                    }
                    C62804h6 h6Var2 = liveStartUIC2.f169212V0;
                    if (h6Var2 != null) {
                        h6Var2.mo10792g(8);
                    }
                    C59158e liveEndUIC = getLiveEndUIC();
                    if (((C54946b0) liveEndUIC.mo83051g(cls)).f153987n) {
                        Log.m105924i(liveEndUIC.f169183i, "finish live by force quit, hide normal end page");
                        FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin2 = liveEndUIC.f169184j;
                        if (finderLiveAnchorAfterPlugin2 != null) {
                            finderLiveAnchorAfterPlugin2.mo10792g(8);
                        }
                    } else {
                        FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin3 = liveEndUIC.f169184j;
                        if (finderLiveAnchorAfterPlugin3 != null) {
                            finderLiveAnchorAfterPlugin3.mo3202c1(new C59149a(liveEndUIC));
                        }
                        ((C119157j) C119157j.f356862d).mo183884o(new C59152b(liveEndUIC));
                    }
                } else if (((C54991o) business(cls2)).mo75999e4()) {
                    if ((((C54991o) business(cls2)).f154303d1 != 2 && ((C54991o) business(cls2)).f154295b1 == 2) || (C61926c.m72696u(((C54991o) business(cls2)).f154299c1, 32) && !C61926c.m72696u(((C54991o) business(cls2)).f154291a1, 32) && !((C54946b0) business(cls)).f153983g)) {
                        C56032b.hideLoadingLayer$default(this, false, 1, (Object) null);
                    }
                    C62643b4 b4Var3 = getLivePrepareUIC().f169399j;
                    if (b4Var3 != null) {
                        b4Var3.mo10792g(8);
                    }
                    C59161f liveStartUIC3 = getLiveStartUIC();
                    Class cls3 = C55001u.class;
                    Class cls4 = C54963d0.class;
                    C12399ff ffVar3 = liveStartUIC3.f169232p;
                    if (ffVar3 != null) {
                        C12399ff.m11974v1(ffVar3, (String) null, false, 3, (Object) null);
                    }
                    C12399ff ffVar4 = liveStartUIC3.f169232p;
                    if (ffVar4 != null) {
                        ffVar4.mo12093s1();
                    }
                    C62815i3 i3Var2 = liveStartUIC3.f169230n;
                    if (i3Var2 != null) {
                        i3Var2.mo10792g(0);
                    }
                    C62833je jeVar3 = liveStartUIC3.f169231o;
                    if (jeVar3 != null) {
                        jeVar3.mo87800Z0();
                    }
                    C12399ff ffVar5 = liveStartUIC3.f169232p;
                    if (ffVar5 != null) {
                        ffVar5.mo10792g(0);
                    }
                    C62632a6 a6Var3 = liveStartUIC3.f169234q;
                    if (a6Var3 != null) {
                        a6Var3.mo10792g(0);
                    }
                    C12322e5 e5Var3 = liveStartUIC3.f169237t;
                    if (e5Var3 != null) {
                        e5Var3.mo10792g(0);
                    }
                    if (C61926c.m72696u(((C54991o) liveStartUIC3.mo83051g(cls2)).f154354q, 512)) {
                        C12690u1 u1Var3 = liveStartUIC3.f169188C;
                        if (u1Var3 != null) {
                            u1Var3.mo10792g(8);
                        }
                    } else {
                        C12690u1 u1Var4 = liveStartUIC3.f169188C;
                        if (u1Var4 != null) {
                            u1Var4.mo10792g(0);
                        }
                    }
                    C62799h2 h2Var3 = liveStartUIC3.f169199N;
                    if (h2Var3 != null) {
                        h2Var3.mo10792g(0);
                    }
                    FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin3 = liveStartUIC3.f169200P;
                    if (finderLiveRandomMatchLinkMicStatePlugin3 != null) {
                        finderLiveRandomMatchLinkMicStatePlugin3.mo10792g(0);
                    }
                    C62976sd sdVar2 = liveStartUIC3.f169238u;
                    if (sdVar2 != null) {
                        sdVar2.mo10792g(8);
                    }
                    C62889n0 n0Var3 = liveStartUIC3.f169189D;
                    if (n0Var3 != null) {
                        n0Var3.mo10792g(8);
                    }
                    FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin6 = liveStartUIC3.f169229j;
                    if (finderLiveAnchorExceptionPlugin6 != null) {
                        finderLiveAnchorExceptionPlugin6.mo10792g(8);
                    }
                    C63049v9 v9Var3 = liveStartUIC3.f169243y;
                    if (v9Var3 != null) {
                        v9Var3.mo10792g(0);
                    }
                    C63151z0 z0Var2 = liveStartUIC3.f169239v;
                    if (z0Var2 != null) {
                        z0Var2.mo10792g(0);
                    }
                    C62632a6 a6Var4 = liveStartUIC3.f169234q;
                    if (!(a6Var4 == null || (viewGroup = a6Var4.f166287d) == null)) {
                        viewGroup.post(new C59219p2(liveStartUIC3));
                    }
                    if (((C54963d0) liveStartUIC3.mo83051g(cls4)).f154051E != null) {
                        C63118y3 y3Var3 = liveStartUIC3.f169202Q0;
                        if (y3Var3 != null) {
                            y3Var3.mo10792g(0);
                        }
                    } else {
                        C63118y3 y3Var4 = liveStartUIC3.f169202Q0;
                        if (y3Var4 != null) {
                            y3Var4.mo10792g(8);
                        }
                    }
                    if (C62042e.f176370a.mo87090j1(liveStartUIC3.f166851d)) {
                        Set<Long> set = C63108xd.f179095r;
                        if (!C63108xd.f179095r.contains(Long.valueOf(((C55001u) liveStartUIC3.mo83051g(cls3)).f154420q.f182392d)) && (xdVar = liveStartUIC3.f169221a1) != null) {
                            xdVar.mo10792g(0);
                        }
                    }
                    C12490l0 l0Var3 = liveStartUIC3.f169203R;
                    if (l0Var3 != null) {
                        l0Var3.mo12142b1();
                    }
                    C12765z2 z2Var2 = liveStartUIC3.f169233p0;
                    if (z2Var2 != null) {
                        z2Var2.mo12305Z0();
                    }
                    C62627a3 a3Var2 = liveStartUIC3.f169242x0;
                    if (a3Var2 != null) {
                        a3Var2.mo87662Z0();
                    }
                    if (C61926c.m72696u(((C54991o) liveStartUIC3.mo83051g(cls2)).f154291a1, 32)) {
                        C65760a aVar2 = liveStartUIC3.f166837f;
                        if (aVar2 != null) {
                            String str = ((C54991o) liveStartUIC3.mo83051g(cls2)).f154345o;
                            String string = liveStartUIC3.f166836e.getResources().getString(C0966R.string.dsf);
                            C87412m.m108593f(string, "context.resources.getStr…ng_exception_tip_network)");
                            aVar2.showTipWithBlurBg(str, string);
                        }
                        C62627a3 a3Var3 = liveStartUIC3.f169242x0;
                        if (a3Var3 != null) {
                            Log.m105924i(a3Var3.f177840q, "hide!");
                            a3Var3.mo10792g(8);
                        }
                        C12690u1 u1Var5 = liveStartUIC3.f169188C;
                        if (u1Var5 != null) {
                            u1Var5.mo10792g(8);
                        }
                        C62924pe peVar3 = liveStartUIC3.f169186A;
                        if (peVar3 != null) {
                            peVar3.mo10792g(8);
                        }
                        C62712dd ddVar3 = liveStartUIC3.f169245z;
                        if (ddVar3 != null) {
                            ddVar3.mo10792g(8);
                        }
                        C63049v9 v9Var4 = liveStartUIC3.f169243y;
                        if (v9Var4 != null) {
                            v9Var4.mo10792g(8);
                        }
                        C12322e5 e5Var4 = liveStartUIC3.f169237t;
                        if (e5Var4 != null) {
                            e5Var4.mo10792g(8);
                        }
                        C12707vb vbVar3 = liveStartUIC3.f169241x;
                        if (vbVar3 != null) {
                            vbVar3.mo10792g(8);
                        }
                        C62889n0 n0Var4 = liveStartUIC3.f169189D;
                        if (n0Var4 != null) {
                            n0Var4.mo10792g(8);
                        }
                        C13969d dVar6 = liveStartUIC3.f169192G;
                        if (dVar6 != null) {
                            dVar6.mo10792g(8);
                        }
                        C15883o oVar3 = liveStartUIC3.f169194I;
                        if (oVar3 != null) {
                            oVar3.mo10792g(8);
                        }
                        C12490l0 l0Var4 = liveStartUIC3.f169203R;
                        if (l0Var4 != null) {
                            l0Var4.mo10792g(8);
                        }
                        C63129yc ycVar3 = liveStartUIC3.f169222b1;
                        if (ycVar3 != null) {
                            ycVar3.mo10792g(8);
                        }
                        C12503ld ldVar2 = liveStartUIC3.f169223c1;
                        if (ldVar2 != null) {
                            ldVar2.mo10792g(8);
                        }
                        C62799h2 h2Var4 = liveStartUIC3.f169199N;
                        if (h2Var4 != null) {
                            h2Var4.mo10792g(8);
                        }
                        FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin4 = liveStartUIC3.f169200P;
                        if (finderLiveRandomMatchLinkMicStatePlugin4 != null) {
                            finderLiveRandomMatchLinkMicStatePlugin4.mo10792g(8);
                        }
                        C63118y3 y3Var5 = liveStartUIC3.f169202Q0;
                        if (y3Var5 != null) {
                            y3Var5.mo10792g(8);
                        }
                        C12256bd bdVar3 = liveStartUIC3.f169204R0;
                        if (bdVar3 != null) {
                            bdVar3.mo10792g(8);
                        }
                        C12632r2 r2Var3 = liveStartUIC3.f169210U0;
                        if (r2Var3 != null) {
                            r2Var3.mo10792g(8);
                        }
                        C65760a aVar3 = liveStartUIC3.f166837f;
                        if (aVar3 != null) {
                            C58124b.C7172a.m7372a(aVar3, C58124b.C58125b.FINDER_LIVE_LINK_MIC_REMOVE_BOTTOM_BAR, (Bundle) null, 2, (Object) null);
                        }
                    }
                    if (C61926c.m72696u(((C54991o) liveStartUIC3.mo83051g(cls2)).f154299c1, 32) && !C61926c.m72696u(((C54991o) liveStartUIC3.mo83051g(cls2)).f154291a1, 32) && !((C54946b0) liveStartUIC3.mo83051g(cls)).f153983g && !((C54963d0) liveStartUIC3.mo83051g(cls4)).f154053G && (aVar = liveStartUIC3.f166837f) != null) {
                        C56032b.notifyAudienceMicUserChange$default(aVar, false, 1, (Object) null);
                    }
                    C33342f fVar = (C33342f) ((C36570n) ((C60106t) C86312j.m106911c(C60106t.class)).f171517q).getValue();
                    String valueOf = String.valueOf(((C55001u) liveStartUIC3.mo83051g(cls3)).f154420q.f182392d);
                    fVar.getClass();
                    C87412m.m108594g(valueOf, "liveId");
                    Cursor rawQuery = fVar.f90382e.rawQuery("select *, rowid from FinderLiveLastRewardInfo where liveId = '" + valueOf + '\'', (String[]) null);
                    C87412m.m108593f(rawQuery, "db.rawQuery(sql, null)");
                    C33318e eVar3 = new C33318e();
                    if (rawQuery.moveToFirst()) {
                        eVar3.convertFrom(rawQuery);
                    }
                    rawQuery.close();
                    if (eVar3.systemRowid == -1) {
                        z3 = false;
                    }
                    if (!z3) {
                        eVar3 = null;
                    }
                    if (eVar3 != null) {
                        C51498u61 u612 = new C51498u61();
                        u612.parseFrom(eVar3.field_lastRewardInfo);
                        LinkedList<C51349t61> linkedList2 = u612.f142616d;
                        if (linkedList2 != null) {
                            linkedList = linkedList2;
                        }
                    }
                    if (linkedList != null) {
                        ((C54991o) liveStartUIC3.mo83051g(cls2)).f154348o3.clear();
                        ((C54991o) liveStartUIC3.mo83051g(cls2)).f154348o3.addAll(linkedList);
                    }
                    FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin4 = getLiveEndUIC().f169184j;
                    if (finderLiveAnchorAfterPlugin4 != null) {
                        finderLiveAnchorAfterPlugin4.mo10792g(8);
                    }
                }
            }
        }
        super.applyState(i, z, i2, z2, bundle);
    }

    public void bindData(C54127h hVar) {
        Class cls = C54991o.class;
        C87412m.m108594g(hVar, "data");
        super.bindData(hVar);
        String str = this.f159882h;
        StringBuilder sb = new StringBuilder();
        sb.append("bindData liveData.isLiveStarted():");
        sb.append(((C54991o) business(cls)).mo75999e4());
        sb.append(" liveMicSetting:");
        C58969q qVar = ((C54991o) business(cls)).f154259T2;
        Long l = null;
        sb.append(qVar != null ? Long.valueOf(qVar.field_liveMicSetting) : null);
        sb.append(" liveMicSettingSwitch:");
        C58969q qVar2 = ((C54991o) business(cls)).f154259T2;
        if (qVar2 != null) {
            l = Long.valueOf(qVar2.field_liveMicSettingSwitch);
        }
        sb.append(l);
        Log.m105924i(str, sb.toString());
        if (C54655b.f153178f1 == null) {
            C54655b.f153178f1 = new C54655b();
        }
        C54655b bVar = C54655b.f153178f1;
        C87412m.m108591d(bVar);
        setLiveCore(bVar);
        C54655b liveCore = getLiveCore();
        if (liveCore != null) {
            liveCore.mo85698q0(1);
        }
        getLivePrepareUIC().mo83044m(this);
        getLiveStartUIC().mo83044m(this);
        getLiveEndUIC().mo83044m(this);
    }

    public int getLiveRole() {
        return 1;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.aew;
    }

    public final String getTAG() {
        return this.f159882h;
    }

    public void mount() {
        super.mount();
        C58728f5 f5Var = C58728f5.f168144a;
        C54655b liveCore = getLiveCore();
        C87412m.m108592e(liveCore, "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
        C58728f5.f168152i = liveCore;
        C53496k kVar = C53496k.f150436a;
        kVar.mo74171d(name(), this.f159883i);
        kVar.mo74172e(name(), this.f159884j);
        C86709a0.m107529k().f251779b.mo123455a(3582, this);
        C86709a0.m107529k().f251779b.mo123455a(3917, this);
        C86709a0.m107529k().f251779b.mo123455a(3861, this);
        C86709a0.m107529k().f251779b.mo123455a(3603, this);
        ((C16004c) business(C16004c.class)).mo14630d3();
    }

    public String name() {
        return C56061i.class.getSimpleName();
    }

    public void notifyAudienceMicUserChange(boolean z) {
        super.notifyAudienceMicUserChange(z);
        C61926c.m72668M(new C56065d(this));
    }

    public void notifyPKMicUserChange(boolean z) {
        super.notifyPKMicUserChange(z);
        C61926c.m72668M(new C56066e(this));
    }

    public boolean notifySEIMicUserChange(JSONObject jSONObject, boolean z, C13604l<Integer, Integer> lVar) {
        boolean notifySEIMicUserChange = super.notifySEIMicUserChange(jSONObject, z, lVar);
        if (notifySEIMicUserChange) {
            C61926c.m72668M(new C56067f(this));
        }
        return notifySEIMicUserChange;
    }

    public void onAcceptBattleTimeout() {
    }

    public void onAcceptLiveMic(C66505a aVar) {
        C87412m.m108594g(aVar, "info");
        getLiveStartUIC().getClass();
        if (aVar.f191322o) {
            ((C54108o) C86312j.m106911c(C54108o.class)).Kx0(13, aVar.f191309b);
        }
        String str = this.f159882h;
        Log.m105924i(str, "onAcceptLiveMic info:" + aVar);
    }

    public void onAcceptMicPkTimeout() {
        Class cls = C54963d0.class;
        String str = this.f159882h;
        Log.m105924i(str, "accept pk mic timeout, will auto cancel. curLinkUser:" + ((C54963d0) business(cls)).f154073p + ", curLinkState:" + ((C54963d0) business(cls)).f154078u);
        C59161f liveStartUIC = getLiveStartUIC();
        if (((C54963d0) liveStartUIC.mo83051g(cls)).f154078u == 2) {
            C62799h2 h2Var = liveStartUIC.f169199N;
            if (h2Var != null) {
                h2Var.mo87790Z0();
            }
            liveStartUIC.mo84372G((C32226l<? super Boolean, C13598b0>) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if ((r2 != null && r2.f152008l == 2) != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAcceptMicTimeout(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.String r1 = r7.f159882h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "accept mic timeout, will auto cancel. curLinkUser:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r7.business(r0)
            cl1.d0 r3 = (cl1.C54963d0) r3
            al1.j r3 = r3.f154073p
            r2.append(r3)
            java.lang.String r3 = " micId:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            fl1.f r1 = r7.getLiveStartUIC()
            androidx.lifecycle.i0 r2 = r1.mo83051g(r0)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            java.lang.String r3 = "audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r3)
            monitor-enter(r2)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r3.<init>()     // Catch:{ all -> 0x008e }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x008e }
        L_0x0043:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x008e }
            r6 = r5
            al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x008e }
            java.lang.String r6 = r6.f152002f     // Catch:{ all -> 0x008e }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0043
            r3.add(r5)     // Catch:{ all -> 0x008e }
            goto L_0x0043
        L_0x005c:
            monitor-exit(r2)
            java.lang.Object r2 = sx3.C110818d0.m150916N(r3)
            al1.j r2 = (al1.C54130j) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x006d
            int r5 = r2.f152008l
            if (r5 != r4) goto L_0x006d
            r5 = 1
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x0079
            int r2 = r2.f152008l
            r5 = 2
            if (r2 != r5) goto L_0x0079
            r2 = 1
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            if (r2 == 0) goto L_0x007d
        L_0x007c:
            r3 = 1
        L_0x007d:
            if (r3 == 0) goto L_0x008d
            androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r8 = r0.mo75931n3(r8)
            r0 = 0
            r1.mo84371E(r8, r0)
        L_0x008d:
            return
        L_0x008e:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56061i.onAcceptMicTimeout(java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            super.onActivityResult(r6, r7, r8)
            r1 = 1005(0x3ed, float:1.408E-42)
            r2 = 1
            r4 = -1
            if (r6 == r1) goto L_0x0080
            r1 = 1006(0x3ee, float:1.41E-42)
            if (r6 == r1) goto L_0x006b
            r0 = 1012(0x3f4, float:1.418E-42)
            r1 = 0
            if (r6 == r0) goto L_0x003a
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r6 == r0) goto L_0x001b
            goto L_0x00b9
        L_0x001b:
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r7 != r6) goto L_0x00b9
            if (r8 == 0) goto L_0x0027
            java.lang.String r6 = "ACTIVITY_RESULT_REMOVE_NOTICE_KEY"
            java.lang.String r1 = r8.getStringExtra(r6)
        L_0x0027:
            d60.b$b r6 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_PROMOTE_SHOW
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = "KEY_FINDER_NOTICE_DELED_ID"
            r7.putString(r8, r1)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            r5.statusChange(r6, r7)
            goto L_0x00b9
        L_0x003a:
            if (r7 != r4) goto L_0x00b9
            d60.b$b r6 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_PROMOTE_SHOW
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            if (r8 == 0) goto L_0x004b
            java.lang.String r0 = "KEY_FINDER_LIVE_NOTICE_INFO"
            byte[] r1 = r8.getByteArrayExtra(r0)
        L_0x004b:
            te3.s51 r8 = new te3.s51
            r8.<init>()
            r0 = 1
            r8.f185341d = r0
            r8.f185342e = r0
            pe3.b r0 = new pe3.b
            r0.<init>(r1)
            r8.f185343f = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            byte[] r8 = r8.toByteArray()
            java.lang.String r0 = "KEY_FINDER_NOTICE_ITEM"
            r7.putByteArray(r0, r8)
            r5.statusChange(r6, r7)
            goto L_0x00b9
        L_0x006b:
            if (r7 != r4) goto L_0x00b9
            di3.d r6 = di3.C86312j.m106911c(r0)
            ak1.o r6 = (ak1.C54108o) r6
            r6.getClass()
            ak1.f0 r6 = ak1.C54108o.f151869h
            ak1.m0 r6 = r6.f151443Y
            long r7 = r6.f151836m
            long r7 = r7 + r2
            r6.f151836m = r7
            goto L_0x00b9
        L_0x0080:
            if (r7 != r4) goto L_0x00b9
            di3.d r6 = di3.C86312j.m106911c(r0)
            ak1.o r6 = (ak1.C54108o) r6
            r6.getClass()
            ak1.f0 r6 = ak1.C54108o.f151869h
            ak1.m0 r6 = r6.f151443Y
            if (r8 != 0) goto L_0x0097
            long r7 = r6.f151837n
            long r7 = r7 + r2
            r6.f151837n = r7
            goto L_0x00b9
        L_0x0097:
            r6.getClass()
            java.lang.String r7 = "SendMsgUsernames"
            java.util.ArrayList r7 = r8.getStringArrayListExtra(r7)
            if (r7 == 0) goto L_0x00b4
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x00a9
            goto L_0x00b4
        L_0x00a9:
            long r0 = r6.f151837n
            int r7 = r7.size()
            long r7 = (long) r7
            long r0 = r0 + r7
            r6.f151837n = r0
            goto L_0x00b9
        L_0x00b4:
            long r7 = r6.f151837n
            long r7 = r7 + r2
            r6.f151837n = r7
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56061i.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onApplyBattleTimeout() {
        C59161f liveStartUIC = getLiveStartUIC();
        C65760a aVar = liveStartUIC.f166837f;
        String str = null;
        if (aVar != null) {
            C58124b.C7172a.m7372a(aVar, C58124b.C58125b.FINDER_LIVE_LINK_MIC_CANCEL_BATTLE, (Bundle) null, 2, (Object) null);
        }
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C0073g0 g0Var = C0073g0.ANCHOR_BATTLE;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", 6);
        C54733a1 a1Var = ((C54963d0) liveStartUIC.mo83051g(C54963d0.class)).f154051E;
        if (a1Var != null) {
            str = a1Var.f153388a;
        }
        jSONObject.putOpt("result", str);
        C13598b0 b0Var = C13598b0.f38549a;
        C8777j5.C8778a.m8605f(j5Var, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public void onApplyMicPkTimeout() {
        Class cls = C54963d0.class;
        String str = this.f159882h;
        Log.m105924i(str, "apply pk mic timeout, will auto cancel. curLinkUser:" + ((C54963d0) business(cls)).f154073p + ", curLinkState:" + ((C54963d0) business(cls)).f154078u);
        C59161f liveStartUIC = getLiveStartUIC();
        if (((C54963d0) liveStartUIC.mo83051g(cls)).f154078u == 2) {
            C62799h2 h2Var = liveStartUIC.f169199N;
            if (h2Var != null) {
                h2Var.mo87790Z0();
            }
            liveStartUIC.mo84372G(new C32067g2(liveStartUIC));
        }
    }

    public boolean onBackPress() {
        String str;
        Class cls = LiveAnchorSlice.class;
        Class cls2 = C54108o.class;
        boolean onBackPress = super.onBackPress();
        if (!onBackPress) {
            int i = ((LiveAnchorSlice) business(cls)).f160032h;
            long j = ((LiveAnchorSlice) business(cls)).f160033i;
            if (i == 0 || j == 0) {
                str = "";
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("entrance_type", i);
                jSONObject.put("entrance_id", j);
                str = jSONObject.toString();
            }
            String str2 = str;
            C87412m.m108593f(str2, "if (entranceType != 0 &&…         \"\"\n            }");
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 13, str2, (String) null, 4, (Object) null);
            ((C54108o) C86312j.m106911c(cls2)).getClass();
            ((C54108o) C86312j.m106911c(cls2)).Gx0(C54108o.f151869h.f151433O);
        }
        return onBackPress;
    }

    public void onBattleApply() {
        C65760a aVar = getLiveStartUIC().f166837f;
        if (aVar != null) {
            C58124b.C7172a.m7372a(aVar, C58124b.C58125b.FINDER_LIVE_BATTLE_RECEIVE_APPLY, (Bundle) null, 2, (Object) null);
        }
    }

    public void onBattleClose() {
        C65760a aVar = getLiveStartUIC().f166837f;
        if (aVar != null) {
            C58124b.C7172a.m7372a(aVar, C58124b.C58125b.FINDER_LIVE_BATTLE_CLOSE, (Bundle) null, 2, (Object) null);
        }
    }

    public void onBattleDismiss() {
        C63118y3 y3Var = getLiveStartUIC().f169202Q0;
        if (y3Var != null) {
            y3Var.mo88046c1();
        }
    }

    public void onBattleEnd() {
        C59161f liveStartUIC = getLiveStartUIC();
        C65760a aVar = liveStartUIC.f166837f;
        String str = null;
        if (aVar != null) {
            C58124b.C7172a.m7372a(aVar, C58124b.C58125b.FINDER_LIVE_BATTLE_END, (Bundle) null, 2, (Object) null);
        }
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C0073g0 g0Var = C0073g0.ANCHOR_BATTLE;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", 7);
        C54733a1 a1Var = ((C54963d0) liveStartUIC.mo83051g(C54963d0.class)).f154051E;
        if (a1Var != null) {
            str = a1Var.f153388a;
        }
        jSONObject.putOpt("result", str);
        C13598b0 b0Var = C13598b0.f38549a;
        C8777j5.C8778a.m8605f(j5Var, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public void onBattleStart() {
        C59161f liveStartUIC = getLiveStartUIC();
        liveStartUIC.getClass();
        C60299b bVar = C60299b.f171929a;
        Log.m105924i("Finder.LinkMicTimeoutTimer", "stopApplyBattleTimer");
        MMHandlerThread.removeRunnable(C60299b.f171934f);
        C65760a aVar = liveStartUIC.f166837f;
        if (aVar != null) {
            C58124b.C7172a.m7372a(aVar, C58124b.C58125b.FINDER_LIVE_BATTLE_START, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002c, code lost:
        r7 = r7.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.String r5 = "incomingNumber"
            r6 = r20
            gy3.C87412m.m108594g(r6, r5)
            java.lang.String r5 = r0.f159882h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onCallStateChanged state:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", isFloatMode:"
            r6.append(r7)
            c50.b r7 = r18.getLiveCore()
            r8 = 0
            if (r7 == 0) goto L_0x0039
            d50.i r7 = r7.f172989A
            if (r7 == 0) goto L_0x0039
            boolean r7 = r7.mo82881c()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003a
        L_0x0039:
            r7 = r8
        L_0x003a:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r5 = 0
            r6 = 1
            r7 = 2
            if (r1 == 0) goto L_0x00ff
            if (r1 == r7) goto L_0x004d
            goto L_0x01e7
        L_0x004d:
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            if (r1 == 0) goto L_0x01e7
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75997d4()
            if (r1 != 0) goto L_0x01e7
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x0086
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131756653(0x7f10066d, float:1.914422E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r10)
            java.lang.String r10 = "getContext().resources.g…ore.R.raw.mic_user_leave)"
            gy3.C87412m.m108593f(r9, r10)
            android.graphics.Bitmap r9 = o40.C61926c.m72686k(r9)
            b50.C54408d.C54409a.m61123c(r1, r9, r5, r7, r8)
        L_0x0086:
            androidx.lifecycle.i0 r1 = r0.business(r2)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154074q
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x009e
            androidx.lifecycle.i0 r1 = r0.business(r2)
            cl1.d0 r1 = (cl1.C54963d0) r1
            al1.j r1 = r1.f154073p
            if (r1 == 0) goto L_0x00b0
        L_0x009e:
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x00a7
            r1.mo85686c0(r6)
        L_0x00a7:
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x00b0
            r1.mo85684b0(r6)
        L_0x00b0:
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            androidx.lifecycle.i0 r2 = r0.business(r4)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154354q
            java.util.regex.Pattern r5 = o40.C61926c.f176038a
            r2 = r2 | r7
            r1.f154354q = r2
            nk1.o r1 = nk1.C61791o.f175673a
            androidx.lifecycle.i0 r2 = r0.business(r4)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154354q
            java.lang.String r5 = "CALL_STATE_OFFHOOK"
            r1.mo86722d(r5, r2)
            cj1.n5 r6 = r18.getFinderLiveAssistant()
            if (r6 == 0) goto L_0x01e7
            androidx.lifecycle.i0 r1 = r0.business(r3)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r7 = r1.f182392d
            androidx.lifecycle.i0 r1 = r0.business(r3)
            cl1.u r1 = (cl1.C55001u) r1
            long r9 = r1.f154416j
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            int r11 = r1.f154354q
            r12 = 2
            r14 = 0
            r15 = 0
            r16 = 48
            r17 = 0
            cj1.C54795n5.C54796a.m61727e(r6, r7, r9, r11, r12, r14, r15, r16, r17)
            goto L_0x01e7
        L_0x00ff:
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            if (r1 == 0) goto L_0x01e7
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75997d4()
            if (r1 != 0) goto L_0x01e7
            java.lang.String r1 = r0.f159882h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "recoveryLocalVideo enableAudioMode:"
            r2.append(r9)
            androidx.lifecycle.i0 r9 = r0.business(r4)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.mo75960G3()
            r2.append(r9)
            java.lang.String r9 = " audioModeHolderBm:"
            r2.append(r9)
            androidx.lifecycle.i0 r9 = r0.business(r4)
            cl1.o r9 = (cl1.C54991o) r9
            android.graphics.Bitmap r9 = r9.f154254S2
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75960G3()
            if (r1 == 0) goto L_0x0187
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x0174
            android.content.Context r2 = r18.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r9 = 2131233614(0x7f080b4e, float:1.808337E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r9)
            java.lang.String r9 = "context.resources.getDra…le.live_audio_mode_frame)"
            gy3.C87412m.m108593f(r2, r9)
            android.graphics.Bitmap r2 = o40.C61926c.m72686k(r2)
            b50.C54408d.C54409a.m61123c(r1, r2, r5, r7, r8)
        L_0x0174:
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x017d
            r1.mo85686c0(r6)
        L_0x017d:
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x0199
            r1.mo85684b0(r5)
            goto L_0x0199
        L_0x0187:
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x0190
            r1.mo85686c0(r5)
        L_0x0190:
            c50.b r1 = r18.getLiveCore()
            if (r1 == 0) goto L_0x0199
            r1.mo85684b0(r5)
        L_0x0199:
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            androidx.lifecycle.i0 r2 = r0.business(r4)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154354q
            java.util.regex.Pattern r5 = o40.C61926c.f176038a
            r2 = r2 & -3
            r1.f154354q = r2
            nk1.o r1 = nk1.C61791o.f175673a
            androidx.lifecycle.i0 r2 = r0.business(r4)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154354q
            java.lang.String r5 = "CALL_STATE_IDLE"
            r1.mo86722d(r5, r2)
            cj1.n5 r6 = r18.getFinderLiveAssistant()
            if (r6 == 0) goto L_0x01e7
            androidx.lifecycle.i0 r1 = r0.business(r3)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r7 = r1.f182392d
            androidx.lifecycle.i0 r1 = r0.business(r3)
            cl1.u r1 = (cl1.C55001u) r1
            long r9 = r1.f154416j
            androidx.lifecycle.i0 r1 = r0.business(r4)
            cl1.o r1 = (cl1.C54991o) r1
            int r11 = r1.f154354q
            r12 = 2
            r14 = 0
            r15 = 0
            r16 = 48
            r17 = 0
            cj1.C54795n5.C54796a.m61727e(r6, r7, r9, r11, r12, r14, r15, r16, r17)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56061i.onCallStateChanged(int, java.lang.String):void");
    }

    public void onCloseLiveMic(C66512f fVar) {
        C87412m.m108594g(fVar, "info");
        C59161f liveStartUIC = getLiveStartUIC();
        liveStartUIC.getClass();
        Class cls = C54108o.class;
        Class cls2 = C54963d0.class;
        C54130j jVar = ((C54963d0) liveStartUIC.mo83051g(cls2)).f154073p;
        JSONObject jSONObject = null;
        if (jVar == null || !Util.isEqual(jVar.f152002f, fVar.f191336c)) {
            String str = liveStartUIC.f169228i;
            Log.m105924i(str, "close mic. info:" + fVar + " linkState:" + ((C54963d0) liveStartUIC.mo83051g(cls2)).f154078u + " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:" + ((C54963d0) liveStartUIC.mo83051g(cls2)).f154074q);
            List<C54130j> list = ((C54963d0) liveStartUIC.mo83051g(cls2)).f154074q;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
            C61926c.m72700y(list, new C59192h2(fVar));
            List<C54130j> list2 = ((C54963d0) liveStartUIC.mo83051g(cls2)).f154076s;
            C87412m.m108593f(list2, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
            C61926c.m72700y(list2, new C59195i2(fVar));
            if (((C54963d0) liveStartUIC.mo83051g(cls2)).f154053G) {
                C65760a aVar = liveStartUIC.f166837f;
                if (aVar != null) {
                    C54655b bVar = liveStartUIC.f166839h;
                    if (bVar != null) {
                        jSONObject = bVar.mo85677T();
                    }
                    C56032b.notifySEIMicUserChange$default(aVar, jSONObject, false, (C13604l) null, 6, (Object) null);
                }
            } else {
                C65760a aVar2 = liveStartUIC.f166837f;
                if (aVar2 != null) {
                    C56032b.notifyAudienceMicUserChange$default(aVar2, false, 1, (Object) null);
                }
            }
            C12490l0 l0Var = liveStartUIC.f169203R;
            if (l0Var != null) {
                l0Var.mo12140Z0();
            }
        } else {
            String str2 = liveStartUIC.f169228i;
            Log.m105924i(str2, "close mic pk. curLinkUser:" + jVar + " linkState:" + ((C54963d0) liveStartUIC.mo83051g(cls2)).f154078u);
            if (jVar.f152004h) {
                ((C54963d0) liveStartUIC.mo83051g(cls2)).f154073p = null;
                C61620c.C61622b.f175234a.mo86556d((String) null);
                ((C54963d0) liveStartUIC.mo83051g(cls2)).mo75928k3();
                if (((C54963d0) liveStartUIC.mo83051g(cls2)).mo75913U3()) {
                    C62799h2 h2Var = liveStartUIC.f169199N;
                    if (h2Var != null) {
                        h2Var.mo87790Z0();
                    }
                    FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = liveStartUIC.f169200P;
                    if (finderLiveRandomMatchLinkMicStatePlugin != null) {
                        finderLiveRandomMatchLinkMicStatePlugin.mo3220a1();
                    }
                }
                liveStartUIC.mo84369C();
                C12490l0 l0Var2 = liveStartUIC.f169203R;
                if (l0Var2 != null) {
                    l0Var2.mo12140Z0();
                }
                ((C54108o) C86312j.m106911c(cls)).Xx0(C54067f0.C54087y.STOP_LINKMIC_WHEN_SHOW_CONNECTING, "", -1, -1);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C0073g0 g0Var = C0073g0.ANCHOR_BATTLE;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("type", 8);
                jSONObject2.putOpt("result", 0);
                C13598b0 b0Var = C13598b0.f38549a;
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject2.toString(), (String) null, 4, (Object) null);
            }
        }
        String str3 = this.f159882h;
        Log.m105924i(str3, "onCloseLiveMic info:" + fVar);
    }

    public void onCloseLiveMicNotify() {
        super.onCloseLiveMicNotify();
        C63118y3 y3Var = getLiveStartUIC().f169202Q0;
        if (y3Var != null) {
            y3Var.mo88045b1();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.lang.Boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x067c  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x067f  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x06e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLiveEventCallback(int r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r19
            r2 = r21
            java.lang.String r3 = r1.f159882h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sdk callback errorCode:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            fl1.f r3 = r19.getLiveStartUIC()
            java.lang.Class<cl1.t0> r4 = cl1.C39981t0.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r6 = cl1.C54963d0.class
            vk1.a r7 = r3.f166837f
            if (r7 == 0) goto L_0x0040
            al1.h r7 = r7.getData()
            if (r7 == 0) goto L_0x0040
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r7 = r7.f151979f
            if (r7 == 0) goto L_0x0040
            gh1.j r8 = gh1.C59447j.f169870a
            hh1.i r9 = new hh1.i
            r9.<init>(r7, r0, r2)
            r8.mo84557i(r7, r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0040:
            r7 = 4
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L_0x018b
            if (r2 == 0) goto L_0x0051
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x0053
        L_0x0051:
            java.lang.String r0 = ""
        L_0x0053:
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x0063
            boolean r2 = r2.f152004h
            if (r2 != r10) goto L_0x0063
            r2 = 1
            goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            if (r2 == 0) goto L_0x00c8
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = r2.f151997a
            goto L_0x0074
        L_0x0073:
            r2 = r9
        L_0x0074:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r0)
            if (r2 == 0) goto L_0x00c8
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.f154078u = r7
            qj1.h2 r2 = r3.f169199N
            if (r2 == 0) goto L_0x008b
            r2.mo87790Z0()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x008b:
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.f154053G
            if (r2 != 0) goto L_0x009e
            vk1.a r2 = r3.f166837f
            if (r2 == 0) goto L_0x009e
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyPKMicUserChange$default(r2, r11, r10, r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x009e:
            ij1.b r2 = ij1.C60299b.f171929a
            java.lang.String r2 = "Finder.LinkMicTimeoutTimer"
            java.lang.String r4 = "stopAcceptPkMicTimer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            ij1.b$a r2 = ij1.C60299b.f171933e
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r2)
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ak1.o r2 = (ak1.C54108o) r2
            ak1.f0$y r4 = ak1.C54067f0.C54087y.LINKMIC_CONNECT_SUCCESS
            androidx.lifecycle.i0 r7 = r3.mo83051g(r6)
            cl1.d0 r7 = (cl1.C54963d0) r7
            al1.j r7 = r7.f154073p
            if (r7 == 0) goto L_0x00c4
            java.lang.String r7 = r7.f151999c
            goto L_0x00c5
        L_0x00c4:
            r7 = r9
        L_0x00c5:
            r2.Xx0(r4, r7, r10, r10)
        L_0x00c8:
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.f154053G
            if (r2 != 0) goto L_0x0121
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154076s
            java.lang.String r4 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r2, r4)
            monitor-enter(r2)
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x011e }
        L_0x00e4:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x011e }
            if (r7 == 0) goto L_0x0113
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x011e }
            al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x011e }
            ok1.e r12 = ok1.C62042e.f176370a     // Catch:{ all -> 0x011e }
            r12.getClass()     // Catch:{ all -> 0x011e }
            if (r7 == 0) goto L_0x00fd
            int r12 = r7.f152008l     // Catch:{ all -> 0x011e }
            if (r12 != r8) goto L_0x00fd
            r12 = 1
            goto L_0x00fe
        L_0x00fd:
            r12 = 0
        L_0x00fe:
            if (r12 == 0) goto L_0x00e4
            java.lang.String r12 = r7.f151997a     // Catch:{ all -> 0x011e }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r12, (java.lang.String) r0)     // Catch:{ all -> 0x011e }
            if (r12 == 0) goto L_0x00e4
            r7.mo74948o()     // Catch:{ all -> 0x011e }
            ij1.b r12 = ij1.C60299b.f171929a     // Catch:{ all -> 0x011e }
            java.lang.String r7 = r7.f152002f     // Catch:{ all -> 0x011e }
            r12.mo85287c(r7)     // Catch:{ all -> 0x011e }
            goto L_0x00e4
        L_0x0113:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x011e }
            monitor-exit(r2)
            vk1.a r2 = r3.f166837f
            if (r2 == 0) goto L_0x0121
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r2, r11, r10, r9)
            goto L_0x0121
        L_0x011e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0121:
            java.lang.String r2 = r3.f169228i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "USER_VIDEO_AVAILABLE curLinkState:"
            r4.append(r7)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r6)
            cl1.d0 r7 = (cl1.C54963d0) r7
            int r7 = r7.f154078u
            r4.append(r7)
            java.lang.String r7 = ", curLinkUser:"
            r4.append(r7)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r6)
            cl1.d0 r7 = (cl1.C54963d0) r7
            al1.j r7 = r7.f154073p
            r4.append(r7)
            java.lang.String r7 = ", userId:"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = ", selfId:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r5)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.mo76015n4()
            r4.append(r0)
            java.lang.String r0 = ", audienceMicList:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            r4.append(r0)
            java.lang.String r0 = ", isRoomPk:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0869
        L_0x018b:
            r12 = 5
            if (r0 != r12) goto L_0x01f4
            if (r2 == 0) goto L_0x0198
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x019a
        L_0x0198:
            java.lang.String r0 = ""
        L_0x019a:
            java.lang.String r2 = r3.f169228i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "USER_VIDEO_DISABLE curLinkState:"
            r4.append(r7)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r6)
            cl1.d0 r7 = (cl1.C54963d0) r7
            int r7 = r7.f154078u
            r4.append(r7)
            java.lang.String r7 = ", curLinkUser:"
            r4.append(r7)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r6)
            cl1.d0 r7 = (cl1.C54963d0) r7
            al1.j r7 = r7.f154073p
            r4.append(r7)
            java.lang.String r7 = ", userId:"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = ", selfId:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r5)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.mo76015n4()
            r4.append(r0)
            java.lang.String r0 = " audienceMicList:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0869
        L_0x01f4:
            if (r0 != r10) goto L_0x0305
            if (r2 == 0) goto L_0x0200
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x0202
        L_0x0200:
            java.lang.String r0 = ""
        L_0x0202:
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x0211
            boolean r2 = r2.f152004h
            if (r2 != r10) goto L_0x0211
            r11 = 1
        L_0x0211:
            if (r11 == 0) goto L_0x022f
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x0220
            java.lang.String r2 = r2.f151997a
            goto L_0x0221
        L_0x0220:
            r2 = r9
        L_0x0221:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r0)
            if (r2 == 0) goto L_0x022f
            ij1.b r2 = ij1.C60299b.f171929a
            r2.mo85288d()
            r3.mo84372G(r9)
        L_0x022f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.lifecycle.i0 r5 = r3.mo83051g(r6)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List<al1.j> r5 = r5.f154074q
            java.lang.String r7 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r5, r7)
            monitor-enter(r5)
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x0302 }
        L_0x0246:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0302 }
            if (r8 == 0) goto L_0x025e
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0302 }
            al1.j r8 = (al1.C54130j) r8     // Catch:{ all -> 0x0302 }
            java.lang.String r11 = r8.f151997a     // Catch:{ all -> 0x0302 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r0)     // Catch:{ all -> 0x0302 }
            if (r11 == 0) goto L_0x0246
            r2.add(r8)     // Catch:{ all -> 0x0302 }
            goto L_0x0246
        L_0x025e:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0302 }
            monitor-exit(r5)
            boolean r5 = r2.isEmpty()
            r5 = r5 ^ r10
            if (r5 == 0) goto L_0x027c
            java.util.Iterator r2 = r2.iterator()
        L_0x026c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x027c
            java.lang.Object r5 = r2.next()
            al1.j r5 = (al1.C54130j) r5
            r3.mo84371E(r5, r9)
            goto L_0x026c
        L_0x027c:
            androidx.lifecycle.i0 r2 = r3.mo83051g(r4)
            cl1.t0 r2 = (cl1.C39981t0) r2
            cl1.t0$a r4 = cl1.C39981t0.C39982a.SEI
            java.util.List r4 = r2.mo62587d3(r4)
            cl1.u0 r5 = new cl1.u0
            r5.<init>(r0)
            o40.C61926c.m72700y(r4, r5)
            cl1.t0$a r4 = cl1.C39981t0.C39982a.LIST
            java.util.List r4 = r2.mo62587d3(r4)
            cl1.u0 r5 = new cl1.u0
            r5.<init>(r0)
            o40.C61926c.m72700y(r4, r5)
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.util.ArrayList<al1.s>> r4 = r2.f107197i
            java.util.ArrayList<al1.s> r2 = r2.f107196h
            r4.postValue(r2)
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154076s
            java.lang.String r4 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r2, r4)
            fl1.m2 r4 = new fl1.m2
            r4.<init>(r0)
            o40.C61926c.m72700y(r2, r4)
            java.lang.String r2 = r3.f169228i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "EVENT_ROOM_USER_EXIT userId:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " linkState:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            int r0 = r0.f154078u
            r4.append(r0)
            java.lang.String r0 = " curLinkMic:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            r4.append(r0)
            java.lang.String r0 = " audienceMicList:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0869
        L_0x0302:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0305:
            if (r0 != r8) goto L_0x0410
            if (r2 == 0) goto L_0x0311
            java.lang.String r0 = "live_user_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x0313
        L_0x0311:
            java.lang.String r0 = ""
        L_0x0313:
            if (r2 == 0) goto L_0x031c
            java.lang.String r4 = "live_media_enable"
            boolean r2 = r2.getBoolean(r4)
            goto L_0x031d
        L_0x031c:
            r2 = 0
        L_0x031d:
            if (r2 == 0) goto L_0x03c0
            androidx.lifecycle.i0 r4 = r3.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154076s
            java.lang.String r5 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r4, r5)
            monitor-enter(r4)
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x03bd }
        L_0x0331:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x03bd }
            if (r7 == 0) goto L_0x0361
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x03bd }
            al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x03bd }
            ok1.e r8 = ok1.C62042e.f176370a     // Catch:{ all -> 0x03bd }
            r8.getClass()     // Catch:{ all -> 0x03bd }
            if (r7 == 0) goto L_0x034a
            int r8 = r7.f152008l     // Catch:{ all -> 0x03bd }
            if (r8 != r10) goto L_0x034a
            r8 = 1
            goto L_0x034b
        L_0x034a:
            r8 = 0
        L_0x034b:
            if (r8 == 0) goto L_0x0331
            java.lang.String r7 = r7.f151997a     // Catch:{ all -> 0x03bd }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r0)     // Catch:{ all -> 0x03bd }
            if (r7 == 0) goto L_0x0331
            er1.c5 r7 = er1.C58704c5.f168044a     // Catch:{ all -> 0x03bd }
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x03bd }
            long r12 = er1.C58704c5.f168047d     // Catch:{ all -> 0x03bd }
            r14 = 61
            r7.mo175912v(r12, r14)     // Catch:{ all -> 0x03bd }
            goto L_0x0331
        L_0x0361:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03bd }
            monitor-exit(r4)
            androidx.lifecycle.i0 r4 = r3.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            boolean r4 = r4.f154053G
            if (r4 != 0) goto L_0x03c0
            androidx.lifecycle.i0 r4 = r3.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154076s
            java.lang.String r5 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r4, r5)
            monitor-enter(r4)
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x03ba }
        L_0x0380:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x03ba }
            if (r7 == 0) goto L_0x03af
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x03ba }
            al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x03ba }
            ok1.e r8 = ok1.C62042e.f176370a     // Catch:{ all -> 0x03ba }
            r8.getClass()     // Catch:{ all -> 0x03ba }
            if (r7 == 0) goto L_0x0399
            int r8 = r7.f152008l     // Catch:{ all -> 0x03ba }
            if (r8 != r10) goto L_0x0399
            r8 = 1
            goto L_0x039a
        L_0x0399:
            r8 = 0
        L_0x039a:
            if (r8 == 0) goto L_0x0380
            java.lang.String r8 = r7.f151997a     // Catch:{ all -> 0x03ba }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r0)     // Catch:{ all -> 0x03ba }
            if (r8 == 0) goto L_0x0380
            r7.mo74948o()     // Catch:{ all -> 0x03ba }
            ij1.b r8 = ij1.C60299b.f171929a     // Catch:{ all -> 0x03ba }
            java.lang.String r7 = r7.f152002f     // Catch:{ all -> 0x03ba }
            r8.mo85287c(r7)     // Catch:{ all -> 0x03ba }
            goto L_0x0380
        L_0x03af:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03ba }
            monitor-exit(r4)
            vk1.a r4 = r3.f166837f
            if (r4 == 0) goto L_0x03c0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r4, r11, r10, r9)
            goto L_0x03c0
        L_0x03ba:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x03bd:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x03c0:
            java.lang.String r4 = r3.f169228i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "EVENT_ROOM_USER_AUDIO_STATE linkState:"
            r5.append(r7)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r6)
            cl1.d0 r7 = (cl1.C54963d0) r7
            int r7 = r7.f154078u
            r5.append(r7)
            java.lang.String r7 = " curLinkMic:"
            r5.append(r7)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r6)
            cl1.d0 r7 = (cl1.C54963d0) r7
            al1.j r7 = r7.f154073p
            r5.append(r7)
            java.lang.String r7 = " audienceMicList:"
            r5.append(r7)
            androidx.lifecycle.i0 r3 = r3.mo83051g(r6)
            cl1.d0 r3 = (cl1.C54963d0) r3
            java.util.List<al1.j> r3 = r3.f154074q
            r5.append(r3)
            java.lang.String r3 = " userId:"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = " enable:"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0869
        L_0x0410:
            r12 = 6
            if (r0 != r12) goto L_0x0418
            r3.mo84367A()
            goto L_0x0869
        L_0x0418:
            r12 = 3
            if (r0 != r12) goto L_0x0498
            vk1.a r0 = r3.f166837f
            if (r0 == 0) goto L_0x0869
            int r2 = r0.getCurNetworkQuality()
            c50.b r4 = r3.f166839h
            if (r4 == 0) goto L_0x042d
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x042d
            int r10 = r4.f166265l
        L_0x042d:
            r0.setCurNetworkQuality(r10)
            if (r2 == r12) goto L_0x043e
            int r4 = r0.getCurNetworkQuality()
            if (r4 != r12) goto L_0x043e
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_DISCONNECT
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            goto L_0x045e
        L_0x043e:
            if (r2 != r12) goto L_0x045e
            int r2 = r0.getCurNetworkQuality()
            if (r2 == r12) goto L_0x045e
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            vk1.a r2 = r3.f166837f
            if (r2 == 0) goto L_0x045e
            al1.h r2 = r2.getData()
            if (r2 == 0) goto L_0x045e
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r2 = r2.f151979f
            if (r2 == 0) goto L_0x045e
            hh1.C59899h.m69793a(r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x045e:
            int r2 = r0.getCurNetworkType()
            c50.b r4 = r3.f166839h
            r5 = -1
            if (r4 == 0) goto L_0x046e
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x046e
            int r4 = r4.f166266m
            goto L_0x046f
        L_0x046e:
            r4 = -1
        L_0x046f:
            r0.setCurNetworkType(r4)
            if (r2 != 0) goto L_0x0494
            int r2 = r0.getCurNetworkType()
            if (r2 == 0) goto L_0x0494
            int r0 = r0.getCurNetworkType()
            if (r0 == r5) goto L_0x0494
            androidx.appcompat.app.AppCompatActivity r0 = r3.f166836e
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131827756(0x7f111c2c, float:1.9288434E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r11)
            r0.show()
        L_0x0494:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0869
        L_0x0498:
            r12 = 12
            if (r0 != r12) goto L_0x04b2
            vk1.a r0 = r3.f166837f
            if (r0 == 0) goto L_0x04a7
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_STATISTC_EVENT
            r0.statusChange(r4, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04a7:
            qj1.a6 r0 = r3.f169234q
            if (r0 == 0) goto L_0x0869
            r0.mo87666Z0(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0869
        L_0x04b2:
            r12 = 19
            if (r0 != r12) goto L_0x0537
            if (r2 == 0) goto L_0x04c0
            java.lang.String r0 = "live_user_volume_info"
            java.util.ArrayList r0 = r2.getParcelableArrayList(r0)
            r2 = r0
            goto L_0x04c1
        L_0x04c0:
            r2 = r9
        L_0x04c1:
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r4 = r0.f154074q
            if (r4 == 0) goto L_0x0523
            monitor-enter(r4)
            java.util.Iterator r0 = r4.iterator()     // Catch:{ all -> 0x0520 }
        L_0x04d0:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0520 }
            if (r5 == 0) goto L_0x051c
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0520 }
            al1.j r5 = (al1.C54130j) r5     // Catch:{ all -> 0x0520 }
            if (r2 == 0) goto L_0x0507
            monitor-enter(r2)     // Catch:{ all -> 0x0520 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x0504 }
        L_0x04e3:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0504 }
            if (r7 == 0) goto L_0x04fb
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0504 }
            r8 = r7
            com.tencent.mm.live.core.core.model.UserVolumeInfo r8 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r8     // Catch:{ all -> 0x0504 }
            java.lang.String r8 = r8.f157117d     // Catch:{ all -> 0x0504 }
            java.lang.String r12 = r5.f151997a     // Catch:{ all -> 0x0504 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r12)     // Catch:{ all -> 0x0504 }
            if (r8 == 0) goto L_0x04e3
            goto L_0x04fc
        L_0x04fb:
            r7 = r9
        L_0x04fc:
            monitor-exit(r2)     // Catch:{ all -> 0x0520 }
            com.tencent.mm.live.core.core.model.UserVolumeInfo r7 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r7     // Catch:{ all -> 0x0520 }
            if (r7 == 0) goto L_0x0507
            int r6 = r7.f157118e     // Catch:{ all -> 0x0520 }
            goto L_0x0508
        L_0x0504:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0520 }
            throw r0     // Catch:{ all -> 0x0520 }
        L_0x0507:
            r6 = 0
        L_0x0508:
            c50.b r7 = r3.f166839h     // Catch:{ all -> 0x0520 }
            if (r7 == 0) goto L_0x0513
            d50.c r7 = r7.f172999K     // Catch:{ all -> 0x0520 }
            if (r7 == 0) goto L_0x0513
            int r7 = r7.f83322a     // Catch:{ all -> 0x0520 }
            goto L_0x0514
        L_0x0513:
            r7 = 0
        L_0x0514:
            if (r6 > r7) goto L_0x0518
            r6 = 1
            goto L_0x0519
        L_0x0518:
            r6 = 0
        L_0x0519:
            r5.f152010n = r6     // Catch:{ all -> 0x0520 }
            goto L_0x04d0
        L_0x051c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0520 }
            monitor-exit(r4)
            goto L_0x0523
        L_0x0520:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0523:
            ii1.e r0 = r3.f169207T
            if (r0 == 0) goto L_0x052a
            r0.mo85279c1()
        L_0x052a:
            if (r2 == 0) goto L_0x052d
            goto L_0x0532
        L_0x052d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0532:
            r3.mo84368B(r2)
            goto L_0x0869
        L_0x0537:
            r12 = 20
            if (r0 != r12) goto L_0x05b9
            if (r2 == 0) goto L_0x0543
            java.lang.String r0 = "live_cdn_sei_msg"
            java.lang.String r9 = r2.getString(r0)
        L_0x0543:
            if (r9 == 0) goto L_0x0869
            c30.g r0 = new c30.g
            r0.<init>((java.lang.String) r9)
            java.lang.String r2 = "userId"
            java.lang.String r2 = r0.optString(r2)
            if (r2 != 0) goto L_0x0555
            java.lang.String r2 = ""
        L_0x0555:
            java.lang.String r4 = "userStatus"
            int r0 = r0.optInt(r4)
            androidx.lifecycle.i0 r4 = r3.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r4 = r4.f154073p
            if (r4 == 0) goto L_0x0869
            java.lang.String r5 = r4.f151997a
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r2)
            if (r5 == 0) goto L_0x05b5
            boolean r5 = o40.C61926c.m72696u(r0, r8)
            boolean r6 = r4.f152012p
            if (r6 == r5) goto L_0x05a2
            java.lang.String r6 = r4.f152011o
            if (r6 == 0) goto L_0x0580
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0581
        L_0x0580:
            r11 = 1
        L_0x0581:
            if (r11 != 0) goto L_0x05a2
            r4.f152012p = r5
            ii1.e r5 = r3.f169207T
            if (r5 == 0) goto L_0x058e
            r5.mo85280d1(r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x058e:
            qj1.o2 r2 = r3.f169235r
            if (r2 == 0) goto L_0x0597
            r2.mo87850a1()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0597:
            qj1.y3 r2 = r3.f169202Q0
            if (r2 == 0) goto L_0x05a2
            il1.c1 r2 = r2.f179113s
            r2.getClass()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x05a2:
            boolean r0 = o40.C61926c.m72696u(r0, r10)
            boolean r2 = r4.f152010n
            if (r2 == r0) goto L_0x05b5
            r4.f152010n = r0
            qj1.o2 r0 = r3.f169235r
            if (r0 == 0) goto L_0x05b5
            r0.mo87851b1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05b5:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0869
        L_0x05b9:
            r12 = 28
            if (r0 != r12) goto L_0x05ca
            androidx.lifecycle.i0 r0 = r3.mo83051g(r4)
            cl1.t0 r0 = (cl1.C39981t0) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<android.os.Bundle> r0 = r0.f107200o
            r0.postValue(r2)
            goto L_0x0869
        L_0x05ca:
            r4 = 24
            if (r0 != r4) goto L_0x0817
            qj1.i3 r0 = r3.f169230n
            if (r0 == 0) goto L_0x05dc
            com.tencent.mm.live.core.view.LivePreviewView r0 = r0.f178293r
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout r0 = r0.f157153e
            boolean r0 = r0.f157128p
            if (r0 != r10) goto L_0x05dc
            r0 = 1
            goto L_0x05dd
        L_0x05dc:
            r0 = 0
        L_0x05dd:
            if (r0 != 0) goto L_0x0605
            java.lang.String r0 = r3.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "EVENT_ANCHOR_NOTIFY_CLOUD_MIXTURE_FOR_FINDER: render layout not ready:"
            r2.append(r4)
            qj1.i3 r3 = r3.f169230n
            if (r3 == 0) goto L_0x05f9
            com.tencent.mm.live.core.view.LivePreviewView r3 = r3.f178293r
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout r3 = r3.f157153e
            boolean r3 = r3.f157128p
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
        L_0x05f9:
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0869
        L_0x0605:
            if (r2 == 0) goto L_0x060e
            java.lang.String r0 = "live_link_mic_info_in_anchor_sei_msg"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x060f
        L_0x060e:
            r0 = r9
        L_0x060f:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0641
            java.lang.String r2 = r3.f169228i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "EVENT_ANCHOR_NOTIFY_CLOUD_MIXTURE_FOR_FINDER: linkMicInfo empty, linkMicInfo:"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = ", roomPk:"
            r4.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x064d
        L_0x0641:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0648 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0648 }
            r13 = r2
            goto L_0x064e
        L_0x0648:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x064d:
            r13 = r0
        L_0x064e:
            r3.f169227g1 = r13
            java.lang.String r0 = r3.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "EVENT_ANCHOR_NOTIFY_CLOUD_MIXTURE_FOR_FINDER: micData:"
            r2.append(r4)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.String r0 = "list"
            org.json.JSONArray r0 = r13.optJSONArray(r0)
            java.lang.String r2 = "m"
            int r2 = r13.optInt(r2)
            r3.mo84384s(r2)
            if (r0 == 0) goto L_0x067c
            int r2 = r0.length()
            goto L_0x067d
        L_0x067c:
            r2 = 0
        L_0x067d:
            if (r2 != 0) goto L_0x06e9
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r0.f154053G = r11
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r0.mo75928k3()
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            java.lang.String r2 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x06da
            java.lang.String r0 = r3.f169228i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "EVENT_ANCHOR_NOTIFY_CLOUD_MIXTURE_FOR_FINDER: audienceLinkMicUserList:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r3.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154074q
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            vk1.a r0 = r3.f166837f
            if (r0 == 0) goto L_0x06cb
            r0.notifyAudienceMicUserChange(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06cb:
            vk1.a r12 = r3.f166837f
            if (r12 == 0) goto L_0x0869
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r12, r13, r14, r15, r16, r17)
            goto L_0x0869
        L_0x06da:
            vk1.a r12 = r3.f166837f
            if (r12 == 0) goto L_0x0869
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r12, r13, r14, r15, r16, r17)
            goto L_0x0869
        L_0x06e9:
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r2.f154053G = r10
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            if (r0 == 0) goto L_0x06fd
            int r4 = r0.length()
            goto L_0x06fe
        L_0x06fd:
            r4 = 0
        L_0x06fe:
            r7 = 0
            r12 = 1
        L_0x0700:
            if (r7 >= r4) goto L_0x079f
            if (r0 == 0) goto L_0x0709
            org.json.JSONObject r14 = r0.optJSONObject(r7)
            goto L_0x070a
        L_0x0709:
            r14 = r9
        L_0x070a:
            if (r14 == 0) goto L_0x0714
            java.lang.String r15 = "uId"
            java.lang.String r15 = r14.optString(r15)
            goto L_0x0715
        L_0x0714:
            r15 = r9
        L_0x0715:
            androidx.lifecycle.i0 r16 = r3.mo83051g(r6)
            r9 = r16
            cl1.d0 r9 = (cl1.C54963d0) r9
            java.util.List<al1.j> r9 = r9.f154076s
            java.lang.String r11 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r9, r11)
            monitor-enter(r9)
            java.util.Iterator r11 = r9.iterator()     // Catch:{ all -> 0x079c }
        L_0x0729:
            boolean r18 = r11.hasNext()     // Catch:{ all -> 0x079c }
            if (r18 == 0) goto L_0x0742
            java.lang.Object r18 = r11.next()     // Catch:{ all -> 0x079c }
            r10 = r18
            al1.j r10 = (al1.C54130j) r10     // Catch:{ all -> 0x079c }
            java.lang.String r10 = r10.f151997a     // Catch:{ all -> 0x079c }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r15)     // Catch:{ all -> 0x079c }
            if (r10 == 0) goto L_0x0740
            goto L_0x0744
        L_0x0740:
            r10 = 1
            goto L_0x0729
        L_0x0742:
            r18 = 0
        L_0x0744:
            monitor-exit(r9)
            r9 = r18
            al1.j r9 = (al1.C54130j) r9
            if (r9 != 0) goto L_0x0777
            androidx.lifecycle.i0 r9 = r3.mo83051g(r6)
            cl1.d0 r9 = (cl1.C54963d0) r9
            al1.j r9 = r9.f154073p
            if (r9 == 0) goto L_0x0758
            java.lang.String r9 = r9.f151997a
            goto L_0x0759
        L_0x0758:
            r9 = 0
        L_0x0759:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r15)
            if (r9 != 0) goto L_0x0795
            java.lang.String r9 = r3.f169228i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "EVENT_ANCHOR_NOTIFY_CLOUD_MIXTURE_FOR_FINDER: can't find user info, userId:"
            r10.append(r11)
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r12 = 0
            goto L_0x0795
        L_0x0777:
            boolean r10 = r9.f152004h
            if (r10 != 0) goto L_0x0795
            if (r14 == 0) goto L_0x0785
            java.lang.String r10 = "us"
            int r10 = r14.optInt(r10)
            goto L_0x0786
        L_0x0785:
            r10 = 0
        L_0x0786:
            r11 = 8
            boolean r10 = o40.C61926c.m72696u(r10, r11)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.f152016t = r10
            r2.add(r9)
        L_0x0795:
            int r7 = r7 + 1
            r9 = 0
            r10 = 1
            r11 = 0
            goto L_0x0700
        L_0x079c:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x079f:
            if (r12 == 0) goto L_0x0869
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            r0.clear()
            java.util.Iterator r0 = r2.iterator()
        L_0x07b0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0809
            java.lang.Object r2 = r0.next()
            al1.j r2 = (al1.C54130j) r2
            ok1.e r4 = ok1.C62042e.f176370a
            r4.getClass()
            if (r2 == 0) goto L_0x07c9
            int r4 = r2.f152008l
            if (r4 != r8) goto L_0x07c9
            r4 = 1
            goto L_0x07ca
        L_0x07c9:
            r4 = 0
        L_0x07ca:
            if (r4 == 0) goto L_0x07e0
            r2.mo74948o()
            ij1.b r4 = ij1.C60299b.f171929a
            java.lang.String r7 = r2.f152002f
            r4.mo85287c(r7)
            androidx.lifecycle.i0 r4 = r3.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            r4.mo75917Y3(r2)
            goto L_0x07ff
        L_0x07e0:
            if (r2 == 0) goto L_0x07e9
            int r4 = r2.f152008l
            r7 = 1
            if (r4 != r7) goto L_0x07e9
            r4 = 1
            goto L_0x07ea
        L_0x07e9:
            r4 = 0
        L_0x07ea:
            if (r4 == 0) goto L_0x07ff
            r2.mo74948o()
            ij1.b r4 = ij1.C60299b.f171929a
            java.lang.String r7 = r2.f152002f
            r4.mo85287c(r7)
            androidx.lifecycle.i0 r4 = r3.mo83051g(r6)
            cl1.d0 r4 = (cl1.C54963d0) r4
            r4.mo75917Y3(r2)
        L_0x07ff:
            androidx.lifecycle.i0 r4 = r3.mo83051g(r5)
            cl1.o r4 = (cl1.C54991o) r4
            r4.mo76009k4(r2)
            goto L_0x07b0
        L_0x0809:
            vk1.a r12 = r3.f166837f
            if (r12 == 0) goto L_0x0869
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r12, r13, r14, r15, r16, r17)
            goto L_0x0869
        L_0x0817:
            if (r0 != r7) goto L_0x0869
            if (r2 == 0) goto L_0x0824
            java.lang.String r0 = "live_err_code"
            r4 = 0
            int r0 = r2.getInt(r0, r4)
            r8 = r0
            goto L_0x0825
        L_0x0824:
            r8 = 0
        L_0x0825:
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86197t
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x083d
            fl1.l2 r0 = new fl1.l2
            r0.<init>(r3, r8)
            o40.C61926c.m72668M(r0)
            goto L_0x0869
        L_0x083d:
            er1.c5 r0 = er1.C58704c5.f168044a
            r0 = 0
            er1.C58704c5.C58705a.f168049b = r0
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r4 = er1.C58704c5.f168047d
            r6 = 1123(0x463, double:5.55E-321)
            r0.mo175912v(r4, r6)
            er1.f5 r5 = er1.C58728f5.f168144a
            fj1.b r6 = r3.f166851d
            r7 = 1123(0x463, float:1.574E-42)
            java.lang.String r9 = "anchorErrorReport"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "0-vBitrate:"
            r0.append(r2)
            long r2 = b50.C54424j.f152654c
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            r5.mo83645b(r6, r7, r8, r9, r10)
        L_0x0869:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56061i.onLiveEventCallback(int, android.os.Bundle):void");
    }

    public void onRandomMatchTimeout() {
        Class cls = C54963d0.class;
        String str = this.f159882h;
        Log.m105924i(str, "random match mic timeout, will auto cancel. curLinkState:" + ((C54963d0) business(cls)).f154078u);
        C59161f liveStartUIC = getLiveStartUIC();
        if (((C54963d0) liveStartUIC.mo83051g(cls)).f154078u == 5) {
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = liveStartUIC.f169200P;
            if (finderLiveRandomMatchLinkMicStatePlugin != null) {
                finderLiveRandomMatchLinkMicStatePlugin.mo3220a1();
            }
            liveStartUIC.mo84381p(new C32072q2(liveStartUIC));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003e, code lost:
        r8 = r14.f134919d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRandomMicAccept(te3.C52013xs0 r41, te3.C64429ht0 r42) {
        /*
            r40 = this;
            r0 = r41
            r1 = r42
            java.lang.String r2 = "appMsg"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "info"
            gy3.C87412m.m108594g(r1, r2)
            r2 = r40
            java.lang.String r3 = r2.f159882h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onRandomMicAccept info:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            fl1.f r3 = r40.getLiveStartUIC()
            r3.getClass()
            java.lang.Class<cl1.d0> r4 = cl1.C54963d0.class
            androidx.lifecycle.i0 r5 = r3.mo83051g(r4)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r15 = new al1.j
            java.lang.String r7 = r1.f183554g
            te3.hx0 r14 = r0.f144914s
            r6 = 0
            if (r14 == 0) goto L_0x0046
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r14.f134919d
            if (r8 == 0) goto L_0x0046
            java.lang.String r8 = r8.headUrl
            r13 = r8
            goto L_0x0047
        L_0x0046:
            r13 = r6
        L_0x0047:
            if (r14 == 0) goto L_0x0051
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r14.f134919d
            if (r8 == 0) goto L_0x0051
            java.lang.String r8 = r8.username
            r12 = r8
            goto L_0x0052
        L_0x0051:
            r12 = r6
        L_0x0052:
            if (r14 == 0) goto L_0x005c
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r14.f134919d
            if (r8 == 0) goto L_0x005c
            java.lang.String r8 = r8.nickname
            r11 = r8
            goto L_0x005d
        L_0x005c:
            r11 = r6
        L_0x005d:
            r16 = 2
            java.lang.String r0 = r0.f144909n
            r17 = 0
            r25 = 1
            int r10 = r1.f183555h
            if (r14 == 0) goto L_0x0072
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r14.f134919d
            if (r8 == 0) goto L_0x0072
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r8 = r8.authInfo
            r33 = r8
            goto L_0x0074
        L_0x0072:
            r33 = r6
        L_0x0074:
            if (r14 == 0) goto L_0x007c
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r14.f134919d
            if (r8 == 0) goto L_0x007c
            java.lang.String r6 = r8.signature
        L_0x007c:
            r34 = r6
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r6 = r1.f183551d
            r21 = r6
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            te3.up2 r6 = r1.f183552e
            r28 = r6
            r29 = 0
            r30 = 0
            r31 = 7190528(0x6db800, float:1.0076076E-38)
            r32 = 0
            r6 = r15
            r8 = r13
            r9 = r12
            r35 = r10
            r10 = r11
            r36 = r11
            r11 = r16
            r37 = r12
            r12 = r0
            r0 = r13
            r13 = r17
            r38 = r14
            r14 = r25
            r39 = r15
            r15 = r35
            r16 = r33
            r17 = r34
            r25 = r38
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.String r6 = r3.f169228i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onRandomMicAccept: accept anchor link mic pk. curPkUser:"
            r7.append(r8)
            r8 = r39
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            te3.hx0 r6 = new te3.hx0
            r6.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r7 = new com.tencent.mm.protocal.protobuf.FinderContact
            r7.<init>()
            r9 = r37
            r7.username = r9
            r9 = r36
            r7.nickname = r9
            r7.headUrl = r0
            r6.f134919d = r7
            java.lang.String r7 = r8.f152011o
            r6.f134927o = r7
            te3.up2 r7 = r8.f152017u
            r6.f134935w = r7
            androidx.lifecycle.i0 r4 = r3.mo83051g(r4)
            cl1.d0 r4 = (cl1.C54963d0) r4
            r7 = 2
            r4.f154078u = r7
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin r4 = r3.f169200P
            if (r4 == 0) goto L_0x0104
            r4.mo3222c1(r0)
        L_0x0104:
            ij1.b r0 = ij1.C60299b.f171929a
            r0.mo85290f()
            r9 = 4000(0xfa0, double:1.9763E-320)
            fl1.s2 r0 = new fl1.s2
            r0.<init>(r3, r6, r8, r1)
            o40.C61926c.m72666K(r9, r0)
            r5.f154073p = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56061i.onRandomMicAccept(te3.xs0, te3.ht0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003b, code lost:
        r8 = r13.f134919d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRandomMicApply(te3.C50593nu0 r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "info"
            gy3.C87412m.m108594g(r0, r1)
            r1 = r18
            java.lang.String r2 = r1.f159882h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onRandomMicApply info:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            fl1.f r2 = r18.getLiveStartUIC()
            r2.getClass()
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            te3.hx0 r13 = r0.f138776d
            java.lang.String r5 = r2.f169228i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onRandomMicApply: apply anchor link mic pk. toContact.username:"
            r6.append(r7)
            r7 = 0
            if (r13 == 0) goto L_0x0042
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r13.f134919d
            if (r8 == 0) goto L_0x0042
            java.lang.String r8 = r8.username
            goto L_0x0043
        L_0x0042:
            r8 = r7
        L_0x0043:
            r6.append(r8)
            java.lang.String r8 = ", toContact.nickname:"
            r6.append(r8)
            if (r13 == 0) goto L_0x0054
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r13.f134919d
            if (r8 == 0) goto L_0x0054
            java.lang.String r8 = r8.nickname
            goto L_0x0055
        L_0x0054:
            r8 = r7
        L_0x0055:
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r13 == 0) goto L_0x00c9
            java.lang.Class<cl1.d0> r5 = cl1.C54963d0.class
            androidx.lifecycle.i0 r5 = r2.mo83051g(r5)
            cl1.d0 r5 = (cl1.C54963d0) r5
            r6 = 2
            r5.f154078u = r6
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin r5 = r2.f169200P
            if (r5 == 0) goto L_0x0079
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r13.f134919d
            if (r6 == 0) goto L_0x0076
            java.lang.String r7 = r6.headUrl
        L_0x0076:
            r5.mo3222c1(r7)
        L_0x0079:
            ij1.b r5 = ij1.C60299b.f171929a
            r5.mo85290f()
            cj1.n5 r5 = r2.mo83042k()
            if (r5 == 0) goto L_0x00c9
            androidx.lifecycle.i0 r6 = r2.mo83051g(r4)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r6 = r6.f182392d
            androidx.lifecycle.i0 r8 = r2.mo83051g(r4)
            cl1.u r8 = (cl1.C55001u) r8
            long r8 = r8.f154416j
            androidx.lifecycle.i0 r10 = r2.mo83051g(r4)
            cl1.u r10 = (cl1.C55001u) r10
            java.lang.String r10 = r10.f154423t
            androidx.lifecycle.i0 r4 = r2.mo83051g(r4)
            cl1.u r4 = (cl1.C55001u) r4
            byte[] r11 = r4.f154417n
            r12 = 1
            androidx.lifecycle.i0 r4 = r2.mo83051g(r3)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r14 = r4.mo76015n4()
            androidx.lifecycle.i0 r3 = r2.mo83051g(r3)
            cl1.o r3 = (cl1.C54991o) r3
            int r15 = r3.mo76013m4()
            pe3.b r0 = r0.f138777e
            fl1.t2 r3 = new fl1.t2
            r3.<init>(r2, r13)
            r16 = r0
            r17 = r3
            r5.mo75707K(r6, r8, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56061i.onRandomMicApply(te3.nu0):void");
    }

    public void onRotationSwitchChange(boolean z) {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f159882h;
        Log.m105924i(str2, "onSceneEnd errType:" + i + ", errCode:" + i2 + ", scene:" + yVar);
    }

    public void release() {
        C58115i iVar;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        Log.m105924i(this.f159882h, "release");
        C59161f liveStartUIC = getLiveStartUIC();
        liveStartUIC.mo84383r();
        liveStartUIC.f169226f1.stopTimer();
        C53496k.f150436a.mo74173f();
        C54773i5.f153520a.mo75679b();
        C86709a0.m107529k().f251779b.mo123470p(3582, this);
        C86709a0.m107529k().f251779b.mo123470p(3917, this);
        C86709a0.m107529k().f251779b.mo123470p(3861, this);
        C86709a0.m107529k().f251779b.mo123470p(3603, this);
        C45795b bVar = C45795b.f123698n;
        boolean z = false;
        if (!(bVar != null && ((C54991o) bVar.mo71262a(cls2)).f154334k3)) {
            FinderLiveService.m63767I(FinderLiveService.f159376d, "anchorRelease", false, getMiniWinPermission(), (Boolean) null, getFinishActivityNotReleaseLive(), 10, (Object) null);
            C54655b liveCore = getLiveCore();
            if (!(liveCore == null || (iVar = liveCore.f172989A) == null || iVar.mo82881c())) {
                z = true;
            }
            if (z && !getMiniWinPermission() && !getFinishActivityNotReleaseLive()) {
                if (!((C54991o) getBuContext().mo71262a(cls2)).f154185B3) {
                    C45795b buContext = getBuContext();
                    if (buContext != null && C62042e.f176370a.mo86991B(buContext)) {
                        long j = ((C55001u) buContext.mo71262a(cls)).f154420q.f182392d;
                        byte[] bArr = ((C55001u) buContext.mo71262a(cls)).f154417n;
                        String O5 = C66785b.f191882e.mo90662O5();
                        long j2 = ((C55001u) buContext.mo71262a(cls)).f154416j;
                        long j3 = j;
                        byte[] bArr2 = bArr;
                        String str = O5;
                        long j4 = j2;
                        long j5 = j;
                        C52312zv0 e = ((C54991o) buContext.mo71262a(cls2)).f154232N2.mo75648e();
                        new C45379o0(j5, bArr2, str, j2, e, 0, new C46728a(j3, bArr2, str, j2, e)).mo9225i();
                    }
                    ((C54991o) getBuContext().mo71262a(cls2)).f154185B3 = true;
                }
                C60299b.f171936h = null;
                C66521k0.f191361a = null;
                C54655b liveCore2 = getLiveCore();
                if (liveCore2 != null) {
                    liveCore2.mo85693l0();
                }
                getLiveEndUIC().mo84366n();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.LiveCoreAnchor", "releaseInstance: onlyResetReference:true");
        C54655b.f153178f1 = null;
    }

    public void resume() {
        C62966ri riVar;
        super.resume();
        C59161f liveStartUIC = getLiveStartUIC();
        ((C66636e) liveStartUIC.mo83051g(C66636e.class)).mo90686c3();
        C62861l1 l1Var = liveStartUIC.f169220Z0;
        if (l1Var != null) {
            l1Var.onResume();
        }
        C62712dd ddVar = liveStartUIC.f169245z;
        if (ddVar != null && (riVar = ddVar.f178065u) != null) {
            riVar.onResume();
        }
    }

    public final void setTAG(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f159882h = str;
    }

    public void start() {
        super.start();
        C59161f liveStartUIC = getLiveStartUIC();
        liveStartUIC.mo84378N(false);
        if (((C54991o) liveStartUIC.mo83051g(C54991o.class)).mo75999e4()) {
            liveStartUIC.f169226f1.stopTimer();
            liveStartUIC.f169226f1.startTimer(1000);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.app.Activity] */
    /* JADX WARNING: type inference failed for: r5v8, types: [com.tencent.mm.plugin.finder.live.view.b] */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r4 != 117) goto L_0x0063;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void statusChange(d60.C58124b.C58125b r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.String r3 = "status"
            gy3.C87412m.m108594g(r0, r3)
            super.statusChange(r20, r21)
            fl1.y2 r3 = r19.getLivePrepareUIC()
            r3.getClass()
            int r4 = r20.ordinal()
            r5 = 6
            r6 = 117(0x75, float:1.64E-43)
            r7 = 132(0x84, float:1.85E-43)
            r8 = 8
            if (r4 == r5) goto L_0x005c
            r5 = 54
            if (r4 == r5) goto L_0x0040
            if (r4 == r7) goto L_0x0038
            r5 = 116(0x74, float:1.63E-43)
            if (r4 == r5) goto L_0x0030
            if (r4 == r6) goto L_0x0038
            goto L_0x0063
        L_0x0030:
            qj1.b4 r3 = r3.f169399j
            if (r3 == 0) goto L_0x0063
            r3.mo10792g(r8)
            goto L_0x0063
        L_0x0038:
            qj1.b4 r3 = r3.f169399j
            if (r3 == 0) goto L_0x0063
            r3.mo10792g(r8)
            goto L_0x0063
        L_0x0040:
            java.lang.String r4 = r3.f169398i
            java.lang.String r5 = "start live failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            androidx.lifecycle.i0 r4 = r3.mo83051g(r2)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.mo75997d4()
            if (r4 != 0) goto L_0x0063
            qj1.b4 r3 = r3.f169399j
            if (r3 == 0) goto L_0x0063
            r3.mo10792g(r8)
            goto L_0x0063
        L_0x005c:
            qj1.b4 r3 = r3.f169399j
            if (r3 == 0) goto L_0x0063
            r3.mo10792g(r8)
        L_0x0063:
            fl1.f r3 = r19.getLiveStartUIC()
            r3.mo84370D(r0, r1)
            fl1.e r3 = r19.getLiveEndUIC()
            r3.getClass()
            int r0 = r20.ordinal()
            r4 = 24
            r5 = 0
            r9 = 1
            r10 = 0
            if (r0 == r4) goto L_0x0167
            if (r0 == r6) goto L_0x015c
            if (r0 == r7) goto L_0x015c
            r4 = 26
            if (r0 == r4) goto L_0x0167
            r4 = 27
            if (r0 == r4) goto L_0x008a
            goto L_0x01ad
        L_0x008a:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin r0 = r3.f169184j
            if (r0 == 0) goto L_0x0091
            r0.mo3204e1()
        L_0x0091:
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL"
            boolean r0 = r1.getBoolean(r0)
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            cj1.n5 r1 = r3.mo83042k()
            if (r1 == 0) goto L_0x00c3
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin r4 = r3.f169184j
            if (r4 == 0) goto L_0x00a8
            d60.b r4 = r4.f177936g
            goto L_0x00a9
        L_0x00a8:
            r4 = r5
        L_0x00a9:
            boolean r6 = r4 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r6 == 0) goto L_0x00b0
            r5 = r4
            com.tencent.mm.plugin.finder.live.view.b r5 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r5
        L_0x00b0:
            if (r5 == 0) goto L_0x00b9
            com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r4 = r5.getActivityScope()
            if (r4 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            a14.s1 r4 = a14.C0001s1.f0d
        L_0x00bb:
            fl1.d r5 = new fl1.d
            r5.<init>(r3)
            r1.mo75751s(r4, r0, r5)
        L_0x00c3:
            if (r0 == 0) goto L_0x00fc
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r4 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r1, r4)
            r11 = r1
            ht1.j5 r11 = (ht1.C8777j5) r11
            ak1.g0 r12 = ak1.C0073g0.ANCHOR_BATTLE
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r4 = 9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "type"
            r1.putOpt(r5, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.String r5 = "result"
            r1.putOpt(r5, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            java.lang.String r13 = r1.toString()
            r14 = 0
            r15 = 4
            r16 = 0
            ht1.C8777j5.C8778a.m8605f(r11, r12, r13, r14, r15, r16)
        L_0x00fc:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r2)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75997d4()
            if (r1 == 0) goto L_0x0128
            ok1.e r11 = ok1.C62042e.f176370a
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r3.mo83051g(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r12 = r1.f182392d
            androidx.lifecycle.i0 r1 = r3.mo83051g(r2)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r14 = r1.f154345o
            r15 = 2
            r16 = 0
            r17 = 8
            r18 = 0
            ok1.C62042e.m72809u1(r11, r12, r14, r15, r16, r17, r18)
        L_0x0128:
            cj1.r0 r1 = cj1.C54804r0.f153631a
            androidx.appcompat.app.AppCompatActivity r2 = r3.f166836e
            fj1.b r4 = r3.f166851d
            r5 = 2
            r1.mo75762c(r2, r4, r5)
            ok1.e r1 = ok1.C62042e.f176370a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo87106p0()
            java.lang.String r2 = "live_status_flag"
            r1.putInt(r2, r10)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.mo77646t()
            r3.mo84366n()
            java.lang.String r1 = r3.f169183i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "finish live is manual finish:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x01ad
        L_0x015c:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin r0 = r3.f169184j
            if (r0 == 0) goto L_0x0163
            r0.mo10792g(r8)
        L_0x0163:
            r3.mo84366n()
            goto L_0x01ad
        L_0x0167:
            androidx.appcompat.app.AppCompatActivity r0 = r3.f166836e
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x0170
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x0171
        L_0x0170:
            r0 = r5
        L_0x0171:
            if (r0 == 0) goto L_0x017b
            boolean r0 = r0.isFinishing()
            if (r0 != r9) goto L_0x017b
            r0 = 1
            goto L_0x017c
        L_0x017b:
            r0 = 0
        L_0x017c:
            if (r0 != 0) goto L_0x0193
            androidx.appcompat.app.AppCompatActivity r0 = r3.f166836e
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x0187
            r5 = r0
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
        L_0x0187:
            if (r5 == 0) goto L_0x0190
            boolean r0 = r5.isDestroyed()
            if (r0 != r9) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r9 = 0
        L_0x0191:
            if (r9 == 0) goto L_0x01ad
        L_0x0193:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r12 = 0
            r13 = 0
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r15 = 0
            r16 = 22
            r17 = 0
            java.lang.String r11 = "anchorEnd"
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63767I(r10, r11, r12, r13, r14, r15, r16, r17)
            c50.b r0 = r3.f166839h
            if (r0 == 0) goto L_0x01aa
            r0.mo85693l0()
        L_0x01aa:
            r3.mo84366n()
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56061i.statusChange(d60.b$b, android.os.Bundle):void");
    }

    public void stop() {
        super.stop();
        getLiveStartUIC().mo84383r();
    }
}
