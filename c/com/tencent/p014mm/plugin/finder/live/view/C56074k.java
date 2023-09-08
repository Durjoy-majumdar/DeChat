package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C54108o;
import al1.C54127h;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import cl1.C54946b0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import gl1.C59529a;
import gl1.C59542e2;
import gl1.C59546f2;
import gl1.C59547g;
import gl1.C59549g2;
import gl1.C59559k;
import gl1.C59568l2;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import ht1.C8777j5;
import i50.C60251a;
import j50.C60735a;
import java.util.Set;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C62042e;
import qj1.C12238a0;
import qj1.C12256bd;
import qj1.C12322e5;
import qj1.C12377f1;
import qj1.C12389fa;
import qj1.C12399ff;
import qj1.C12475jc;
import qj1.C12482k1;
import qj1.C12490l0;
import qj1.C12503ld;
import qj1.C12522mf;
import qj1.C12611q7;
import qj1.C12632r2;
import qj1.C12690u1;
import qj1.C12693u2;
import qj1.C12707vb;
import qj1.C47844c7;
import qj1.C62632a6;
import qj1.C62638b0;
import qj1.C62647ba;
import qj1.C62705da;
import qj1.C62712dd;
import qj1.C62758ea;
import qj1.C62804h6;
import qj1.C62833je;
import qj1.C62861l1;
import qj1.C62911o3;
import qj1.C62921p3;
import qj1.C62924pe;
import qj1.C62976sd;
import qj1.C62987t2;
import qj1.C63006u7;
import qj1.C63049v9;
import qj1.C63081w3;
import qj1.C63100x2;
import qj1.C63108xd;
import qj1.C63118y3;
import qj1.C63129yc;
import qj1.C63151z0;
import rx3.C13598b0;
import sl1.C64039c;
import te3.C48779ay0;
import tl1.C13969d;
import vk1.C65761b;
import xs1.C15883o;
import xs1.C66420d;
import y50.C53496k;
import y50.C66505a;
import y50.C66512f;
import yg1.C16004c;

/* renamed from: com.tencent.mm.plugin.finder.live.view.k */
public final class C56074k extends C65761b implements C11385n {

    /* renamed from: h */
    public String f159906h = "FinderLiveAnchorSecondaryPluginLayout";

    /* renamed from: i */
    public C32224a<C13598b0> f159907i = new C56076b(this);

    /* renamed from: j */
    public C32224a<C13598b0> f159908j = new C56077c(this);

    /* renamed from: com.tencent.mm.plugin.finder.live.view.k$a */
    public static final class C56075a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56074k f159909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56075a(C56074k kVar) {
            super(0);
            this.f159909d = kVar;
        }

        public Object invoke() {
            C61926c.m72668M(new C56070j(this.f159909d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.k$b */
    public static final class C56076b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56074k f159910d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56076b(C56074k kVar) {
            super(0);
            this.f159910d = kVar;
        }

        public Object invoke() {
            C59559k liveStartUIC = this.f159910d.getLiveStartUIC();
            liveStartUIC.getClass();
            C61926c.m72668M(new C59542e2(liveStartUIC));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.k$c */
    public static final class C56077c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56074k f159911d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56077c(C56074k kVar) {
            super(0);
            this.f159911d = kVar;
        }

        public Object invoke() {
            C59559k liveStartUIC = this.f159911d.getLiveStartUIC();
            liveStartUIC.getClass();
            C61926c.m72668M(new C59546f2(liveStartUIC));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56074k(MMActivity mMActivity, Fragment fragment, AttributeSet attributeSet) {
        super(mMActivity, fragment, attributeSet);
        C87412m.m108594g(mMActivity, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        if ((r9 != null && r9.f164794id == 0) != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void activate(al1.C54127h r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.String r2 = "data"
            gy3.C87412m.m108594g(r8, r2)
            super.activate(r8, r9, r10)
            java.lang.String r8 = r7.f159906h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "liveFinish:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r7.business(r0)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.f154266V
            r2.append(r3)
            java.lang.String r3 = ",isFromFloat:"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", restart:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r10 = ",liveId:"
            r2.append(r10)
            androidx.lifecycle.i0 r10 = r7.business(r1)
            cl1.u r10 = (cl1.C55001u) r10
            te3.c21 r10 = r10.f154420q
            long r3 = r10.f182392d
            r2.append(r3)
            java.lang.String r10 = ",objectId:"
            r2.append(r10)
            androidx.lifecycle.i0 r10 = r7.business(r1)
            cl1.u r10 = (cl1.C55001u) r10
            long r3 = r10.f154416j
            r2.append(r3)
            java.lang.String r10 = ",nonceId:"
            r2.append(r10)
            androidx.lifecycle.i0 r10 = r7.business(r1)
            cl1.u r10 = (cl1.C55001u) r10
            java.lang.String r10 = r10.f154423t
            r2.append(r10)
            java.lang.String r10 = ",username:"
            r2.append(r10)
            androidx.lifecycle.i0 r10 = r7.business(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154345o
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            gl1.m2 r8 = r7.getLivePrepareUIC()
            r10 = 1
            if (r9 == 0) goto L_0x00a1
            androidx.lifecycle.i0 r9 = r8.mo83051g(r0)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.f154266V
            if (r9 == 0) goto L_0x0099
            vk1.b r8 = r8.f166842f
            if (r8 == 0) goto L_0x00f5
            d60.b$b r9 = d60.C58124b.C58125b.LIVE_HAS_FINISHED
            r10 = 2
            r0 = 0
            d60.C58124b.C7172a.m7372a(r8, r9, r0, r10, r0)
            goto L_0x00f5
        L_0x0099:
            vk1.b r8 = r8.f166842f
            if (r8 == 0) goto L_0x00f5
            r8.prepareToStart(r10)
            goto L_0x00f5
        L_0x00a1:
            androidx.lifecycle.i0 r9 = r8.mo83051g(r0)
            cl1.o r9 = (cl1.C54991o) r9
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f154341n
            r2 = 0
            if (r9 == 0) goto L_0x00c3
            androidx.lifecycle.i0 r9 = r8.mo83051g(r0)
            cl1.o r9 = (cl1.C54991o) r9
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f154341n
            if (r9 == 0) goto L_0x00c0
            long r3 = r9.f164794id
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00c0
            r9 = 1
            goto L_0x00c1
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            if (r9 == 0) goto L_0x00e4
        L_0x00c3:
            androidx.lifecycle.i0 r9 = r8.mo83051g(r0)
            cl1.o r9 = (cl1.C54991o) r9
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.p1 r0 = (tf0.C64916p1) r0
            androidx.lifecycle.i0 r1 = r8.mo83051g(r1)
            cl1.u r1 = (cl1.C55001u) r1
            long r3 = r1.f154416j
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo76701iy(r3)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFinderObject()
            r9.mo76026x4(r0)
        L_0x00e4:
            java.lang.Class<cl1.h1> r9 = cl1.C54979h1.class
            androidx.lifecycle.i0 r9 = r8.mo83051g(r9)
            cl1.h1 r9 = (cl1.C54979h1) r9
            r9.f154135g = r10
            vk1.b r8 = r8.f166842f
            if (r8 == 0) goto L_0x00f5
            r8.prepareToStart(r2)
        L_0x00f5:
            cj1.i5 r8 = cj1.C54773i5.f153520a
            java.lang.String r9 = r7.name()
            com.tencent.mm.plugin.finder.live.view.k$a r10 = new com.tencent.mm.plugin.finder.live.view.k$a
            r10.<init>(r7)
            r8.mo75678a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56074k.activate(al1.h, boolean, boolean):void");
    }

    public void applyState(int i, boolean z, int i2, boolean z2, Bundle bundle) {
        C63108xd xdVar;
        C12475jc jcVar;
        ViewGroup viewGroup;
        FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        boolean z3 = true;
        if (((C54991o) business(cls2)).mo75997d4()) {
            C56032b.hideLoadingLayer$default(this, false, 1, (Object) null);
            getLivePrepareUIC().getClass();
            C59559k liveStartUIC = getLiveStartUIC();
            Class cls3 = C54946b0.class;
            C62833je jeVar = liveStartUIC.f170246p;
            if (jeVar != null) {
                jeVar.mo10792g(8);
            }
            C12399ff ffVar = liveStartUIC.f170248q;
            if (ffVar != null) {
                ffVar.mo10792g(8);
            }
            C62632a6 a6Var = liveStartUIC.f170249r;
            if (a6Var != null) {
                a6Var.mo10792g(8);
            }
            C60085d dVar = liveStartUIC.f170251t;
            if (dVar != null) {
                dVar.mo10792g(8);
            }
            C12322e5 e5Var = liveStartUIC.f170252u;
            if (e5Var != null) {
                e5Var.mo10792g(8);
            }
            C62976sd sdVar = liveStartUIC.f170253v;
            if (sdVar != null) {
                sdVar.mo10792g(8);
            }
            C63049v9 v9Var = liveStartUIC.f170259z;
            if (v9Var != null) {
                v9Var.mo10792g(8);
            }
            C12690u1 u1Var = liveStartUIC.f170202D;
            if (u1Var != null) {
                u1Var.mo10792g(8);
            }
            C62712dd ddVar = liveStartUIC.f170199A;
            if (ddVar != null) {
                ddVar.mo10792g(8);
            }
            C62924pe peVar = liveStartUIC.f170200B;
            if (peVar != null) {
                peVar.mo10792g(8);
            }
            if (((C54946b0) liveStartUIC.mo83051g(cls3)).f153987n) {
                Log.m105924i(liveStartUIC.f170243j, "onLiveEnd: isLiveEndByForceQuit = true");
                C48779ay0 ay02 = ((C54946b0) liveStartUIC.mo83051g(cls3)).f153988o;
                Integer num = ((C54946b0) liveStartUIC.mo83051g(cls3)).f153989p;
                if (ay02 == null || num == null) {
                    Log.m105924i(liveStartUIC.f170243j, "onLiveEnd: isLiveEndByForceQuit, but no cache errorPage");
                    FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin = liveStartUIC.f170245o;
                    if (finderLiveAnchorExceptionPlugin != null) {
                        finderLiveAnchorExceptionPlugin.mo10792g(8);
                    }
                } else {
                    FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin2 = liveStartUIC.f170245o;
                    if (finderLiveAnchorExceptionPlugin2 != null) {
                        finderLiveAnchorExceptionPlugin2.mo10792g(0);
                    }
                    FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin3 = liveStartUIC.f170245o;
                    if (finderLiveAnchorExceptionPlugin3 != null) {
                        finderLiveAnchorExceptionPlugin3.mo77686a1(((C54991o) liveStartUIC.mo83051g(cls2)).f154345o, ay02, num.intValue());
                    }
                }
            } else {
                FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin4 = liveStartUIC.f170245o;
                if (finderLiveAnchorExceptionPlugin4 != null) {
                    finderLiveAnchorExceptionPlugin4.mo10792g(8);
                }
            }
            C12707vb vbVar = liveStartUIC.f170257y;
            if (vbVar != null) {
                vbVar.mo10792g(8);
            }
            C12522mf mfVar = liveStartUIC.f170201C;
            if (mfVar != null) {
                mfVar.mo10792g(8);
            }
            C62705da daVar = liveStartUIC.f170208J;
            if (daVar != null) {
                daVar.mo10792g(8);
            }
            C62647ba baVar = liveStartUIC.f170209K;
            if (baVar != null) {
                baVar.mo10792g(8);
            }
            C62647ba baVar2 = liveStartUIC.f170210L;
            if (baVar2 != null) {
                baVar2.mo10792g(8);
            }
            C64039c cVar = liveStartUIC.f170211M;
            if (cVar != null) {
                cVar.mo10792g(8);
            }
            C13969d dVar2 = liveStartUIC.f170212N;
            if (dVar2 != null) {
                dVar2.mo10792g(8);
            }
            C66420d dVar3 = liveStartUIC.f170213P;
            if (dVar3 != null) {
                dVar3.mo10792g(8);
            }
            C15883o oVar = liveStartUIC.f170214Q;
            if (oVar != null) {
                oVar.mo10792g(8);
            }
            C12238a0 a0Var = liveStartUIC.f170216R;
            if (a0Var != null) {
                a0Var.mo10792g(8);
            }
            C62638b0 b0Var = liveStartUIC.f170218S;
            if (b0Var != null) {
                b0Var.mo10792g(8);
            }
            C47844c7 c7Var = liveStartUIC.f170232Z;
            if (c7Var != null) {
                c7Var.mo10792g(8);
            }
            C12611q7 q7Var = liveStartUIC.f170222U;
            if (q7Var != null) {
                q7Var.mo10792g(8);
            }
            C63006u7 u7Var = liveStartUIC.f170230Y;
            if (u7Var != null) {
                u7Var.mo10792g(8);
            }
            C12490l0 l0Var = liveStartUIC.f170247p0;
            if (l0Var != null) {
                l0Var.mo10792g(8);
            }
            C63129yc ycVar = liveStartUIC.f170256x0;
            if (ycVar != null) {
                ycVar.mo10792g(8);
            }
            C63081w3 w3Var = liveStartUIC.f170215Q0;
            if (w3Var != null) {
                w3Var.mo10792g(8);
            }
            C12256bd bdVar = liveStartUIC.f170217R0;
            if (bdVar != null) {
                bdVar.mo10792g(8);
            }
            C12632r2 r2Var = liveStartUIC.f170221T0;
            if (r2Var != null) {
                r2Var.mo10792g(8);
            }
            C62911o3 o3Var = liveStartUIC.f170231Y0;
            if (o3Var != null) {
                o3Var.mo10792g(8);
            }
            C12503ld ldVar = liveStartUIC.f170238e1;
            if (ldVar != null) {
                ldVar.mo10792g(8);
            }
            C62758ea eaVar = liveStartUIC.f170258y0;
            if (eaVar != null) {
                eaVar.mo10792g(8);
            }
            C12377f1 f1Var = liveStartUIC.f170219S0;
            if (f1Var != null) {
                f1Var.mo10792g(8);
            }
            C12482k1 k1Var = liveStartUIC.f170223U0;
            if (k1Var != null) {
                k1Var.mo10792g(8);
            }
            C62804h6 h6Var = liveStartUIC.f170225V0;
            if (h6Var != null) {
                h6Var.mo10792g(8);
            }
            C62987t2 t2Var = liveStartUIC.f170235b1;
            if (t2Var != null) {
                t2Var.mo10792g(8);
            }
            C62921p3 p3Var = liveStartUIC.f170236c1;
            if (p3Var != null) {
                p3Var.mo10792g(8);
            }
            C12693u2 u2Var = liveStartUIC.f170224V;
            if (u2Var != null) {
                u2Var.mo10792g(8);
            }
            C63100x2 x2Var = liveStartUIC.f170226W;
            if (x2Var != null) {
                x2Var.mo10792g(8);
            }
            C62861l1 l1Var = liveStartUIC.f170228X;
            if (l1Var != null) {
                l1Var.mo10792g(8);
            }
            C59547g liveEndUIC = getLiveEndUIC();
            if ((bundle == null || ((C54991o) liveEndUIC.mo83051g(cls2)).f154301c3 || bundle.getBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE")) && (finderLiveAnchorAfterPlugin = liveEndUIC.f170181n) != null) {
                finderLiveAnchorAfterPlugin.mo3202c1(new C59529a(liveEndUIC));
            }
        } else if (((C54991o) business(cls2)).mo75999e4()) {
            C62042e eVar = C62042e.f176370a;
            if (eVar.mo87116s1()) {
                C56032b.hideLoadingLayer$default(this, false, 1, (Object) null);
            }
            getLivePrepareUIC().getClass();
            C59559k liveStartUIC2 = getLiveStartUIC();
            C12399ff ffVar2 = liveStartUIC2.f170248q;
            if (ffVar2 != null) {
                C12399ff.m11974v1(ffVar2, (String) null, false, 3, (Object) null);
            }
            C12399ff ffVar3 = liveStartUIC2.f170248q;
            if (ffVar3 != null) {
                ffVar3.mo12093s1();
            }
            C62833je jeVar2 = liveStartUIC2.f170246p;
            if (jeVar2 != null) {
                jeVar2.mo87800Z0();
            }
            C12399ff ffVar4 = liveStartUIC2.f170248q;
            if (ffVar4 != null) {
                ffVar4.mo10792g(0);
            }
            C62632a6 a6Var2 = liveStartUIC2.f170249r;
            if (a6Var2 != null) {
                a6Var2.mo10792g(0);
            }
            if (((C54963d0) liveStartUIC2.mo83051g(C54963d0.class)).f154051E != null) {
                C63118y3 y3Var = liveStartUIC2.f170234a1;
                if (y3Var != null) {
                    y3Var.mo10792g(0);
                }
            } else {
                C63118y3 y3Var2 = liveStartUIC2.f170234a1;
                if (y3Var2 != null) {
                    y3Var2.mo10792g(8);
                }
            }
            C12322e5 e5Var2 = liveStartUIC2.f170252u;
            if (e5Var2 != null) {
                e5Var2.mo10792g(0);
            }
            if (C61926c.m72696u(((C54991o) liveStartUIC2.mo83051g(cls2)).f154354q, 512)) {
                C12690u1 u1Var2 = liveStartUIC2.f170202D;
                if (u1Var2 != null) {
                    u1Var2.mo10792g(8);
                }
            } else {
                C12690u1 u1Var3 = liveStartUIC2.f170202D;
                if (u1Var3 != null) {
                    u1Var3.mo10792g(0);
                }
            }
            C62976sd sdVar2 = liveStartUIC2.f170253v;
            if (sdVar2 != null) {
                sdVar2.mo10792g(8);
            }
            FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin5 = liveStartUIC2.f170245o;
            if (finderLiveAnchorExceptionPlugin5 != null) {
                finderLiveAnchorExceptionPlugin5.mo10792g(8);
            }
            C63049v9 v9Var2 = liveStartUIC2.f170259z;
            if (v9Var2 != null) {
                v9Var2.mo10792g(0);
            }
            C62632a6 a6Var3 = liveStartUIC2.f170249r;
            if (!(a6Var3 == null || (viewGroup = a6Var3.f166287d) == null)) {
                viewGroup.post(new C59549g2(liveStartUIC2));
            }
            C12490l0 l0Var2 = liveStartUIC2.f170247p0;
            if (l0Var2 != null) {
                l0Var2.mo12142b1();
            }
            C45795b bVar = liveStartUIC2.f166851d;
            C87412m.m108594g(bVar, "liveData");
            if (((C55001u) bVar.mo71262a(cls)).f154420q.f182405s != 5) {
                z3 = false;
            }
            if (!z3 && (jcVar = liveStartUIC2.f170204F) != null) {
                jcVar.mo10792g(0);
            }
            if (eVar.mo87090j1(liveStartUIC2.f166851d)) {
                Set<Long> set = C63108xd.f179095r;
                if (!C63108xd.f179095r.contains(Long.valueOf(((C55001u) liveStartUIC2.mo83051g(cls)).f154420q.f182392d)) && (xdVar = liveStartUIC2.f170237d1) != null) {
                    xdVar.mo10792g(0);
                }
            }
            if (C61926c.m72696u(((C54991o) liveStartUIC2.mo83051g(cls2)).f154291a1, 524288)) {
                C65761b bVar2 = liveStartUIC2.f166842f;
                if (bVar2 != null) {
                    bVar2.forceScreenToPortrait();
                }
                if (((C54991o) liveStartUIC2.mo83051g(cls2)).f154301c3) {
                    C65761b bVar3 = liveStartUIC2.f166842f;
                    if (bVar3 != null) {
                        String str = ((C54991o) liveStartUIC2.mo83051g(cls2)).f154345o;
                        String string = liveStartUIC2.f166841e.getResources().getString(C0966R.string.e1y);
                        C87412m.m108593f(string, "context.resources.getStr…inder_live_pauseing_tips)");
                        String string2 = liveStartUIC2.f166841e.getResources().getString(C0966R.string.e1o);
                        C87412m.m108593f(string2, "context.resources.getStr…e_pause_mini_game_action)");
                        bVar3.showTipWithBlurBgAction(str, string, string2, new C59568l2(liveStartUIC2));
                    }
                } else {
                    C65761b bVar4 = liveStartUIC2.f166842f;
                    if (bVar4 != null) {
                        String str2 = ((C54991o) liveStartUIC2.mo83051g(cls2)).f154345o;
                        String string3 = liveStartUIC2.f166841e.getResources().getString(C0966R.string.dfi);
                        C87412m.m108593f(string3, "context.resources.getStr…er_live_anchor_exception)");
                        bVar4.showBlurBgWithTimeCount(str2, string3);
                    }
                }
            } else if (C61926c.m72696u(((C54991o) liveStartUIC2.mo83051g(cls2)).f154291a1, 32)) {
                C65761b bVar5 = liveStartUIC2.f166842f;
                if (bVar5 != null) {
                    String str3 = ((C54991o) liveStartUIC2.mo83051g(cls2)).f154345o;
                    String string4 = liveStartUIC2.f166841e.getResources().getString(C0966R.string.dsf);
                    C87412m.m108593f(string4, "context.resources.getStr…ng_exception_tip_network)");
                    bVar5.showTipWithBlurBg(str3, string4);
                }
                C12690u1 u1Var4 = liveStartUIC2.f170202D;
                if (u1Var4 != null) {
                    u1Var4.mo10792g(8);
                }
                C62924pe peVar2 = liveStartUIC2.f170200B;
                if (peVar2 != null) {
                    peVar2.mo10792g(8);
                }
                C62712dd ddVar2 = liveStartUIC2.f170199A;
                if (ddVar2 != null) {
                    ddVar2.mo10792g(8);
                }
                C63049v9 v9Var3 = liveStartUIC2.f170259z;
                if (v9Var3 != null) {
                    v9Var3.mo10792g(8);
                }
                C12322e5 e5Var3 = liveStartUIC2.f170252u;
                if (e5Var3 != null) {
                    e5Var3.mo10792g(8);
                }
                C12707vb vbVar2 = liveStartUIC2.f170257y;
                if (vbVar2 != null) {
                    vbVar2.mo10792g(8);
                }
                C13969d dVar4 = liveStartUIC2.f170212N;
                if (dVar4 != null) {
                    dVar4.mo10792g(8);
                }
                C15883o oVar2 = liveStartUIC2.f170214Q;
                if (oVar2 != null) {
                    oVar2.mo10792g(8);
                }
                C12490l0 l0Var3 = liveStartUIC2.f170247p0;
                if (l0Var3 != null) {
                    l0Var3.mo10792g(8);
                }
                C63129yc ycVar2 = liveStartUIC2.f170256x0;
                if (ycVar2 != null) {
                    ycVar2.mo10792g(8);
                }
                C63081w3 w3Var2 = liveStartUIC2.f170215Q0;
                if (w3Var2 != null) {
                    w3Var2.mo10792g(8);
                }
                C12256bd bdVar2 = liveStartUIC2.f170217R0;
                if (bdVar2 != null) {
                    bdVar2.mo10792g(8);
                }
                C12377f1 f1Var2 = liveStartUIC2.f170219S0;
                if (f1Var2 != null) {
                    f1Var2.mo10792g(8);
                }
                C12482k1 k1Var2 = liveStartUIC2.f170223U0;
                if (k1Var2 != null) {
                    k1Var2.mo10792g(8);
                }
                C12632r2 r2Var2 = liveStartUIC2.f170221T0;
                if (r2Var2 != null) {
                    r2Var2.mo10792g(8);
                }
                C63118y3 y3Var3 = liveStartUIC2.f170234a1;
                if (y3Var3 != null) {
                    y3Var3.mo10792g(8);
                }
            }
            FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin2 = getLiveEndUIC().f170181n;
            if (finderLiveAnchorAfterPlugin2 != null) {
                finderLiveAnchorAfterPlugin2.mo10792g(8);
            }
        } else {
            if (((C54991o) business(cls2)).f154295b1 == 1) {
                C56032b.hideLoadingLayer$default(this, false, 1, (Object) null);
                getLivePrepareUIC().getClass();
                C59559k liveStartUIC3 = getLiveStartUIC();
                C62833je jeVar3 = liveStartUIC3.f170246p;
                if (jeVar3 != null) {
                    jeVar3.mo10792g(8);
                }
                C12399ff ffVar5 = liveStartUIC3.f170248q;
                if (ffVar5 != null) {
                    ffVar5.mo10792g(8);
                }
                C62632a6 a6Var4 = liveStartUIC3.f170249r;
                if (a6Var4 != null) {
                    a6Var4.mo10792g(8);
                }
                C12322e5 e5Var4 = liveStartUIC3.f170252u;
                if (e5Var4 != null) {
                    e5Var4.mo10792g(8);
                }
                C63151z0 z0Var = liveStartUIC3.f170254w;
                if (z0Var != null) {
                    z0Var.mo10792g(8);
                }
                C62976sd sdVar3 = liveStartUIC3.f170253v;
                if (sdVar3 != null) {
                    sdVar3.mo10792g(8);
                }
                C12389fa faVar = liveStartUIC3.f170255x;
                if (faVar != null) {
                    faVar.mo10792g(8);
                }
                C12707vb vbVar3 = liveStartUIC3.f170257y;
                if (vbVar3 != null) {
                    vbVar3.mo10792g(8);
                }
                C62712dd ddVar3 = liveStartUIC3.f170199A;
                if (ddVar3 != null) {
                    ddVar3.mo10792g(8);
                }
                C62924pe peVar3 = liveStartUIC3.f170200B;
                if (peVar3 != null) {
                    peVar3.mo10792g(8);
                }
                FinderLiveAnchorExceptionPlugin finderLiveAnchorExceptionPlugin6 = liveStartUIC3.f170245o;
                if (finderLiveAnchorExceptionPlugin6 != null) {
                    finderLiveAnchorExceptionPlugin6.mo10792g(8);
                }
                C63049v9 v9Var4 = liveStartUIC3.f170259z;
                if (v9Var4 != null) {
                    v9Var4.mo10792g(8);
                }
                C12690u1 u1Var5 = liveStartUIC3.f170202D;
                if (u1Var5 != null) {
                    u1Var5.mo10792g(8);
                }
                C12522mf mfVar2 = liveStartUIC3.f170201C;
                if (mfVar2 != null) {
                    mfVar2.mo10792g(8);
                }
                C62705da daVar2 = liveStartUIC3.f170208J;
                if (daVar2 != null) {
                    daVar2.mo10792g(8);
                }
                C62647ba baVar3 = liveStartUIC3.f170209K;
                if (baVar3 != null) {
                    baVar3.mo10792g(8);
                }
                C62647ba baVar4 = liveStartUIC3.f170210L;
                if (baVar4 != null) {
                    baVar4.mo10792g(8);
                }
                C64039c cVar2 = liveStartUIC3.f170211M;
                if (cVar2 != null) {
                    cVar2.mo10792g(8);
                }
                C13969d dVar5 = liveStartUIC3.f170212N;
                if (dVar5 != null) {
                    dVar5.mo10792g(8);
                }
                C66420d dVar6 = liveStartUIC3.f170213P;
                if (dVar6 != null) {
                    dVar6.mo10792g(8);
                }
                C15883o oVar3 = liveStartUIC3.f170214Q;
                if (oVar3 != null) {
                    oVar3.mo10792g(8);
                }
                C12238a0 a0Var2 = liveStartUIC3.f170216R;
                if (a0Var2 != null) {
                    a0Var2.mo10792g(8);
                }
                C62638b0 b0Var2 = liveStartUIC3.f170218S;
                if (b0Var2 != null) {
                    b0Var2.mo10792g(8);
                }
                C47844c7 c7Var2 = liveStartUIC3.f170232Z;
                if (c7Var2 != null) {
                    c7Var2.mo10792g(8);
                }
                C12611q7 q7Var2 = liveStartUIC3.f170222U;
                if (q7Var2 != null) {
                    q7Var2.mo10792g(8);
                }
                C63006u7 u7Var2 = liveStartUIC3.f170230Y;
                if (u7Var2 != null) {
                    u7Var2.mo10792g(8);
                }
                C12490l0 l0Var4 = liveStartUIC3.f170247p0;
                if (l0Var4 != null) {
                    l0Var4.mo10792g(8);
                }
                C63129yc ycVar3 = liveStartUIC3.f170256x0;
                if (ycVar3 != null) {
                    ycVar3.mo10792g(8);
                }
                C63081w3 w3Var3 = liveStartUIC3.f170215Q0;
                if (w3Var3 != null) {
                    w3Var3.mo10792g(8);
                }
                C12256bd bdVar3 = liveStartUIC3.f170217R0;
                if (bdVar3 != null) {
                    bdVar3.mo10792g(8);
                }
                C12632r2 r2Var3 = liveStartUIC3.f170221T0;
                if (r2Var3 != null) {
                    r2Var3.mo10792g(8);
                }
                C62911o3 o3Var2 = liveStartUIC3.f170231Y0;
                if (o3Var2 != null) {
                    o3Var2.mo10792g(8);
                }
                C12503ld ldVar2 = liveStartUIC3.f170238e1;
                if (ldVar2 != null) {
                    ldVar2.mo10792g(8);
                }
                C62758ea eaVar2 = liveStartUIC3.f170258y0;
                if (eaVar2 != null) {
                    eaVar2.mo10792g(8);
                }
                C12377f1 f1Var3 = liveStartUIC3.f170219S0;
                if (f1Var3 != null) {
                    f1Var3.mo10792g(8);
                }
                C12482k1 k1Var3 = liveStartUIC3.f170223U0;
                if (k1Var3 != null) {
                    k1Var3.mo10792g(8);
                }
                C62804h6 h6Var2 = liveStartUIC3.f170225V0;
                if (h6Var2 != null) {
                    h6Var2.mo10792g(8);
                }
                FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin3 = getLiveEndUIC().f170181n;
                if (finderLiveAnchorAfterPlugin3 != null) {
                    finderLiveAnchorAfterPlugin3.mo10792g(8);
                }
            }
        }
        super.applyState(i, z, i2, z2, bundle);
    }

    public void bindData(C54127h hVar) {
        C87412m.m108594g(hVar, "data");
        super.bindData(hVar);
        if (C60251a.f171781k1 == null) {
            Log.printInfoStack("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new Object[0]);
            C60251a.f171781k1 = new C60251a();
        }
        C60251a aVar = C60251a.f171781k1;
        C87412m.m108591d(aVar);
        setLiveCore(aVar);
        C60735a liveCore = getLiveCore();
        if (liveCore != null) {
            liveCore.mo85698q0(1);
        }
        getLivePrepareUIC().mo83045i(this);
        getLiveStartUIC().mo83045i(this);
        getLiveEndUIC().mo83045i(this);
    }

    public final C32224a<C13598b0> getLiveMessageCallback() {
        return this.f159907i;
    }

    public int getLiveRole() {
        return 1;
    }

    public final C32224a<C13598b0> getLiveSlowMessageCallback() {
        return this.f159908j;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.aeu;
    }

    public final String getTAG() {
        return this.f159906h;
    }

    public void mount() {
        super.mount();
        C53496k kVar = C53496k.f150436a;
        kVar.mo74171d(name(), this.f159907i);
        kVar.mo74172e(name(), this.f159908j);
        C86709a0.m107529k().f251779b.mo123455a(3861, this);
        C86709a0.m107529k().f251779b.mo123455a(3603, this);
        ((C16004c) business(C16004c.class)).mo14630d3();
    }

    public String name() {
        return C56074k.class.getSimpleName();
    }

    public void onAcceptLiveMic(C66505a aVar) {
        C87412m.m108594g(aVar, "info");
        String str = this.f159906h;
        Log.m105924i(str, "onAcceptLiveMic acceptInfo:" + aVar);
        getLiveStartUIC().mo84609o(aVar.f191318k);
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
            if (r6 == r1) goto L_0x007f
            r1 = 1006(0x3ee, float:1.41E-42)
            if (r6 == r1) goto L_0x006a
            r0 = 1012(0x3f4, float:1.418E-42)
            r1 = 0
            if (r6 == r0) goto L_0x0039
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r6 == r0) goto L_0x001b
            goto L_0x0093
        L_0x001b:
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r7 != r6) goto L_0x0093
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
            goto L_0x0093
        L_0x0039:
            if (r7 != r4) goto L_0x0093
            d60.b$b r6 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_PROMOTE_SHOW
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            if (r8 == 0) goto L_0x004a
            java.lang.String r0 = "KEY_FINDER_LIVE_NOTICE_INFO"
            byte[] r1 = r8.getByteArrayExtra(r0)
        L_0x004a:
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
            goto L_0x0093
        L_0x006a:
            if (r7 != r4) goto L_0x0093
            di3.d r6 = di3.C86312j.m106911c(r0)
            ak1.o r6 = (ak1.C54108o) r6
            r6.getClass()
            ak1.f0 r6 = ak1.C54108o.f151869h
            ak1.m0 r6 = r6.f151443Y
            long r7 = r6.f151836m
            long r7 = r7 + r2
            r6.f151836m = r7
            goto L_0x0093
        L_0x007f:
            if (r7 != r4) goto L_0x0093
            di3.d r6 = di3.C86312j.m106911c(r0)
            ak1.o r6 = (ak1.C54108o) r6
            r6.getClass()
            ak1.f0 r6 = ak1.C54108o.f151869h
            ak1.m0 r6 = r6.f151443Y
            long r7 = r6.f151837n
            long r7 = r7 + r2
            r6.f151837n = r7
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56074k.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onBackPress() {
        Class cls = C54108o.class;
        boolean onBackPress = super.onBackPress();
        if (!onBackPress) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 13, "", (String) null, 4, (Object) null);
            ((C54108o) C86312j.m106911c(cls)).getClass();
            ((C54108o) C86312j.m106911c(cls)).Gx0(C54108o.f151869h.f151433O);
        }
        return onBackPress;
    }

    public void onBattleApply() {
    }

    public void onBattleClose() {
    }

    public void onBattleDismiss() {
        C63118y3 y3Var = getLiveStartUIC().f170234a1;
        if (y3Var != null) {
            y3Var.mo88046c1();
        }
    }

    public void onBattleEnd() {
        C65761b bVar = getLiveStartUIC().f166842f;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_BATTLE_END, (Bundle) null, 2, (Object) null);
        }
    }

    public void onBattleStart() {
        C65761b bVar = getLiveStartUIC().f166842f;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_BATTLE_START, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r1 = r1.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "incomingNumber"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r5 = r3.f159906h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCallStateChanged state:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", isFloatMode:"
            r0.append(r1)
            j50.a r1 = r3.getLiveCore()
            r2 = 0
            if (r1 == 0) goto L_0x002d
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.mo82881c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r5 = 2
            if (r4 == r5) goto L_0x003c
            goto L_0x0045
        L_0x003c:
            r4 = 1
            r3.setManualClosed(r4)
            d60.b$b r4 = d60.C58124b.C58125b.CLOSE_LIVE
            d60.C58124b.C7172a.m7372a(r3, r4, r2, r5, r2)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56074k.onCallStateChanged(int, java.lang.String):void");
    }

    public void onCloseLiveMic(C66512f fVar) {
        Class cls = C54963d0.class;
        C87412m.m108594g(fVar, "info");
        String str = this.f159906h;
        Log.m105924i(str, "onCloseLiveMic closeInfo:" + fVar + " curLinkMicUser:" + ((C54963d0) business(cls)).f154073p + " audienceLinkMicUserList:" + ((C54963d0) business(cls)).f154074q);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: al1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: al1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: al1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: al1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: al1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: org.json.JSONObject} */
    /* JADX WARNING: type inference failed for: r11v10, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x07cf  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x07d5  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x07d7  */
    /* JADX WARNING: Removed duplicated region for block: B:473:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLiveEventCallback(int r24, android.os.Bundle r25) {
        /*
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = r25
            java.lang.String r3 = r1.f159906h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sdk callback errorCode:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            gl1.k r3 = r23.getLiveStartUIC()
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r6 = cl1.C54963d0.class
            vk1.b r7 = r3.f166842f
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
            r7 = 6
            if (r0 != r7) goto L_0x0048
            r3.mo84608n()
            goto L_0x0875
        L_0x0048:
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r0 != r7) goto L_0x0129
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x005c
            int r0 = r0.getCurNetworkQuality()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x005d
        L_0x005c:
            r0 = r9
        L_0x005d:
            vk1.b r2 = r3.f166842f
            if (r2 != 0) goto L_0x0062
            goto L_0x0071
        L_0x0062:
            j50.a r4 = r3.f166844h
            if (r4 == 0) goto L_0x006d
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x006d
            int r4 = r4.f166265l
            goto L_0x006e
        L_0x006d:
            r4 = 1
        L_0x006e:
            r2.setCurNetworkQuality(r4)
        L_0x0071:
            if (r0 != 0) goto L_0x0074
            goto L_0x007a
        L_0x0074:
            int r2 = r0.intValue()
            if (r2 == r7) goto L_0x0095
        L_0x007a:
            vk1.b r2 = r3.f166842f
            if (r2 == 0) goto L_0x0086
            int r2 = r2.getCurNetworkQuality()
            if (r2 != r7) goto L_0x0086
            r2 = 1
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            if (r2 == 0) goto L_0x0095
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x00cb
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_DISCONNECT
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x00cb
        L_0x0095:
            if (r0 != 0) goto L_0x0098
            goto L_0x00cb
        L_0x0098:
            int r0 = r0.intValue()
            if (r0 != r7) goto L_0x00cb
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x00aa
            int r0 = r0.getCurNetworkQuality()
            if (r0 != r7) goto L_0x00aa
            r0 = 1
            goto L_0x00ab
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            if (r0 != 0) goto L_0x00cb
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x00b8
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x00b8:
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x00cb
            al1.h r0 = r0.getData()
            if (r0 == 0) goto L_0x00cb
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.f151979f
            if (r0 == 0) goto L_0x00cb
            hh1.C59899h.m69793a(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x00cb:
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x00d7
            int r0 = r0.getCurNetworkType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x00d7:
            vk1.b r0 = r3.f166842f
            r2 = -1
            if (r0 != 0) goto L_0x00dd
            goto L_0x00ec
        L_0x00dd:
            j50.a r4 = r3.f166844h
            if (r4 == 0) goto L_0x00e8
            d50.i r4 = r4.f172989A
            if (r4 == 0) goto L_0x00e8
            int r4 = r4.f166266m
            goto L_0x00e9
        L_0x00e8:
            r4 = -1
        L_0x00e9:
            r0.setCurNetworkType(r4)
        L_0x00ec:
            if (r9 != 0) goto L_0x00f0
            goto L_0x0875
        L_0x00f0:
            int r0 = r9.intValue()
            if (r0 != 0) goto L_0x0875
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x0102
            int r0 = r0.getCurNetworkType()
            if (r0 != 0) goto L_0x0102
            r0 = 1
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            if (r0 != 0) goto L_0x0875
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x0110
            int r0 = r0.getCurNetworkType()
            if (r0 != r2) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r10 = 0
        L_0x0111:
            if (r10 != 0) goto L_0x0875
            androidx.appcompat.app.AppCompatActivity r0 = r3.f166841e
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131827756(0x7f111c2c, float:1.9288434E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r11)
            r0.show()
            goto L_0x0875
        L_0x0129:
            r7 = 16
            if (r0 != r7) goto L_0x013a
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x0875
            d60.b$b r3 = d60.C58124b.C58125b.LIVE_STATUS_RESOLUTION
            r0.statusChange(r3, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0875
        L_0x013a:
            r7 = 18
            if (r0 != r7) goto L_0x0246
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = r3.f170243j
            java.lang.String r2 = "EVENT_CDN_SEI_MESSAGE_LINK_MIC: roomPk = true, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0875
        L_0x0151:
            if (r2 == 0) goto L_0x015a
            java.lang.String r0 = "live_cdn_sei_msg"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x015b
        L_0x015a:
            r0 = r9
        L_0x015b:
            if (r0 == 0) goto L_0x0875
            te3.kt2 r2 = new te3.kt2
            r2.<init>()
            java.nio.charset.Charset r4 = z04.C119027c.f356488a
            byte[] r0 = r0.getBytes(r4)
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r4)
            r2.parseFrom(r0)     // Catch:{ Exception -> 0x0172 }
            goto L_0x017f
        L_0x0172:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r5 = ""
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r11] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r5, r7)
        L_0x017f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.String r0 = r3.f170243j
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "EVENT_CDN_SEI_MESSAGE_LINK_MIC micSEIMsg.infos:"
            r4.append(r5)
            java.util.LinkedList<te3.lt2> r5 = r2.f183982d
            r4.append(r5)
            java.lang.String r5 = " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r3.mo83051g(r6)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List<al1.j> r5 = r5.f154074q
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            java.util.LinkedList<te3.lt2> r0 = r2.f183982d
            if (r0 == 0) goto L_0x01b6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r0 = 0
            goto L_0x01b7
        L_0x01b6:
            r0 = 1
        L_0x01b7:
            if (r0 == 0) goto L_0x01c4
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x0875
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_REMOVE_BOTTOM_BAR
            d60.C58124b.C7172a.m7372a(r0, r2, r9, r8, r9)
            goto L_0x0875
        L_0x01c4:
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x01cd
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_ADD_BOTTOM_BAR
            d60.C58124b.C7172a.m7372a(r0, r4, r9, r8, r9)
        L_0x01cd:
            gl1.h2 r0 = new gl1.h2
            r0.<init>(r3)
            o40.C61926c.m72668M(r0)
            gy3.a0 r0 = new gy3.a0
            r0.<init>()
            r0.f27482d = r10
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.LinkedList<te3.lt2> r5 = r2.f183982d
            java.lang.String r7 = "micSEIMsg.infos"
            gy3.C87412m.m108593f(r5, r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x01ec:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x023a
            java.lang.Object r7 = r5.next()
            te3.lt2 r7 = (te3.C64535lt2) r7
            androidx.lifecycle.i0 r8 = r3.mo83051g(r6)
            cl1.d0 r8 = (cl1.C54963d0) r8
            java.util.List<al1.j> r8 = r8.f154076s
            java.lang.String r12 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r8, r12)
            monitor-enter(r8)
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x0237 }
        L_0x020a:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0237 }
            if (r13 == 0) goto L_0x0222
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0237 }
            r14 = r13
            al1.j r14 = (al1.C54130j) r14     // Catch:{ all -> 0x0237 }
            java.lang.String r14 = r14.f151997a     // Catch:{ all -> 0x0237 }
            java.lang.String r15 = r7.f184154d     // Catch:{ all -> 0x0237 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x0237 }
            if (r14 == 0) goto L_0x020a
            goto L_0x0223
        L_0x0222:
            r13 = r9
        L_0x0223:
            monitor-exit(r8)
            al1.j r13 = (al1.C54130j) r13
            if (r13 != 0) goto L_0x022b
            r0.f27482d = r11
            goto L_0x01ec
        L_0x022b:
            int r7 = r7.f184156f
            boolean r7 = o40.C61926c.m72696u(r7, r10)
            r13.f152010n = r7
            r4.add(r13)
            goto L_0x01ec
        L_0x0237:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x023a:
            gl1.a2 r5 = new gl1.a2
            r5.<init>(r0, r2, r3, r4)
            o40.C61926c.m72668M(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0875
        L_0x0246:
            r7 = 20
            if (r0 != r7) goto L_0x076e
            if (r2 == 0) goto L_0x0253
            java.lang.String r0 = "live_cdn_sei_msg"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0254
        L_0x0253:
            r0 = r9
        L_0x0254:
            if (r0 == 0) goto L_0x0875
            c30.g r7 = new c30.g
            r7.<init>((java.lang.String) r0)
            java.lang.String r0 = "userId"
            java.lang.String r0 = r7.optString(r0)
            if (r0 != 0) goto L_0x0266
            java.lang.String r0 = ""
        L_0x0266:
            java.lang.String r13 = "userStatus"
            int r13 = r7.optInt(r13)
            java.lang.String r14 = "songId"
            int r14 = r7.optInt(r14)
            java.lang.String r15 = "playStatus"
            int r15 = r7.optInt(r15)
            java.lang.String r9 = "st"
            long r8 = r7.optLong(r9)
            androidx.lifecycle.i0 r16 = r3.mo83051g(r4)
            r11 = r16
            cl1.u r11 = (cl1.C55001u) r11
            te3.bq2 r11 = r11.f154419p
            java.lang.String r11 = r11.f182319n
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r11)
            if (r11 == 0) goto L_0x02cd
            long r10 = eb0.C31543z5.m39453c()
            androidx.lifecycle.i0 r17 = r3.mo83051g(r6)
            r12 = r17
            cl1.d0 r12 = (cl1.C54963d0) r12
            long r19 = r10 - r8
            r21 = 0
            int r17 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r17 >= 0) goto L_0x02aa
            r1 = r21
            goto L_0x02ac
        L_0x02aa:
            r1 = r19
        L_0x02ac:
            r12.f154049C = r1
            java.lang.String r1 = r3.f170243j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "anchorServerTime:"
            r2.append(r12)
            r2.append(r8)
            java.lang.String r8 = " myServerTime:"
            r2.append(r8)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            goto L_0x02e3
        L_0x02cd:
            java.lang.String r1 = r3.f170243j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "anchorId is invalid, maybe is in pk link mic. "
            r2.append(r8)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
        L_0x02e3:
            java.lang.String r1 = r3.f170243j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "notityAnchorInfoBySei anchorUserId:"
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = " lastAudioMode:"
            r2.append(r8)
            boolean r8 = r3.f170239f1
            r2.append(r8)
            java.lang.String r8 = " lastScreenShareMode:"
            r2.append(r8)
            boolean r8 = r3.f170240g1
            r2.append(r8)
            java.lang.String r8 = "userStatus:"
            r2.append(r8)
            r2.append(r13)
            java.lang.String r8 = " songId:"
            r2.append(r8)
            r2.append(r14)
            java.lang.String r8 = ", playStatus:"
            r2.append(r8)
            r2.append(r15)
            java.lang.String r8 = " coverUrl:"
            r2.append(r8)
            androidx.lifecycle.i0 r8 = r3.mo83051g(r5)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
            if (r8 == 0) goto L_0x0339
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r8.objectDesc
            if (r8 == 0) goto L_0x0339
            te3.px0 r8 = r8.liveDesc
            if (r8 == 0) goto L_0x0339
            java.lang.String r8 = r8.f184911d
            goto L_0x033a
        L_0x0339:
            r8 = 0
        L_0x033a:
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            androidx.lifecycle.i0 r1 = r3.mo83051g(r4)
            cl1.u r1 = (cl1.C55001u) r1
            te3.bq2 r1 = r1.f154419p
            if (r1 == 0) goto L_0x0351
            java.lang.String r1 = r1.f182319n
            goto L_0x0352
        L_0x0351:
            r1 = 0
        L_0x0352:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r1)
            if (r1 == 0) goto L_0x046d
            r1 = 4
            boolean r2 = o40.C61926c.m72696u(r13, r1)
            boolean r1 = r3.f170240g1
            if (r1 == r2) goto L_0x03ba
            r3.f170240g1 = r2
            if (r2 == 0) goto L_0x038b
            j50.a r1 = r3.f166844h
            if (r1 == 0) goto L_0x0371
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0371
            r2 = 1
            r1.f166264k = r2
            goto L_0x0372
        L_0x0371:
            r2 = 1
        L_0x0372:
            qj1.ze r1 = r3.f170244n
            if (r1 == 0) goto L_0x037f
            f50.d r1 = r1.mo88091c1()
            if (r1 == 0) goto L_0x037f
            r1.setRenderMode(r2)
        L_0x037f:
            r1 = 0
            r3.f170239f1 = r1
            qj1.w3 r2 = r3.f170215Q0
            if (r2 == 0) goto L_0x03ba
            r8 = 4
            r2.mo10792g(r8)
            goto L_0x03ba
        L_0x038b:
            r1 = 0
            j50.a r2 = r3.f166844h
            if (r2 == 0) goto L_0x0396
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0396
            r2.f166264k = r1
        L_0x0396:
            qj1.ze r1 = r3.f170244n
            if (r1 == 0) goto L_0x03b7
            f50.d r1 = r1.mo88091c1()
            if (r1 == 0) goto L_0x03b7
            ok1.e r2 = ok1.C62042e.f176370a
            fj1.b r8 = r3.f166851d
            vk1.b r9 = r3.f166842f
            if (r9 == 0) goto L_0x03ad
            boolean r9 = r9.isLandscape()
            goto L_0x03ae
        L_0x03ad:
            r9 = 0
        L_0x03ae:
            boolean r10 = r3.f170240g1
            int r2 = r2.mo87123v0(r8, r9, r10)
            r1.setRenderMode(r2)
        L_0x03b7:
            r1 = 0
            r3.f170239f1 = r1
        L_0x03ba:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r5)
            cl1.o r1 = (cl1.C54991o) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
            if (r1 == 0) goto L_0x03cf
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x03cf
            te3.px0 r1 = r1.liveDesc
            if (r1 == 0) goto L_0x03cf
            java.lang.String r1 = r1.f184911d
            goto L_0x03d0
        L_0x03cf:
            r1 = 0
        L_0x03d0:
            if (r1 == 0) goto L_0x03db
            int r2 = r1.length()
            if (r2 != 0) goto L_0x03d9
            goto L_0x03db
        L_0x03d9:
            r2 = 0
            goto L_0x03dc
        L_0x03db:
            r2 = 1
        L_0x03dc:
            if (r2 == 0) goto L_0x03fe
            androidx.lifecycle.i0 r1 = r3.mo83051g(r5)
            cl1.o r1 = (cl1.C54991o) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
            if (r1 == 0) goto L_0x03fc
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x03fc
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r1.media
            if (r1 == 0) goto L_0x03fc
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
            if (r1 == 0) goto L_0x03fc
            java.lang.String r1 = r1.url
            if (r1 != 0) goto L_0x03fe
        L_0x03fc:
            java.lang.String r1 = ""
        L_0x03fe:
            r2 = 2
            boolean r8 = o40.C61926c.m72696u(r13, r2)
            boolean r2 = r3.f170239f1
            if (r2 == r8) goto L_0x044f
            if (r1 == 0) goto L_0x0412
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0410
            goto L_0x0412
        L_0x0410:
            r1 = 0
            goto L_0x0413
        L_0x0412:
            r1 = 1
        L_0x0413:
            if (r1 != 0) goto L_0x044f
            r3.f170239f1 = r8
            r1 = 2
            boolean r2 = o40.C61926c.m72696u(r13, r1)
            if (r2 == 0) goto L_0x042a
            j50.a r1 = r3.f166844h
            if (r1 == 0) goto L_0x0435
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0435
            r1.mo82889k()
            goto L_0x0435
        L_0x042a:
            j50.a r1 = r3.f166844h
            if (r1 == 0) goto L_0x0435
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0435
            r1.mo82890l()
        L_0x0435:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r8 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            r1.putBoolean(r8, r2)
            boolean r2 = r3.f170240g1
            java.lang.String r8 = "PARAM_FINDER_LIVE_IS_SHARE_MODE"
            r1.putBoolean(r8, r2)
            vk1.b r2 = r3.f166842f
            if (r2 == 0) goto L_0x044f
            d60.b$b r8 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH
            r2.statusChange(r8, r1)
        L_0x044f:
            ii1.e r1 = r3.f170233Z0
            r2 = 1
            if (r1 == 0) goto L_0x045c
            boolean r8 = o40.C61926c.m72696u(r13, r2)
            r8 = r8 ^ r2
            r1.mo85278b1(r8)
        L_0x045c:
            qj1.o2 r1 = r3.f170250s
            if (r1 == 0) goto L_0x046d
            boolean r8 = o40.C61926c.m72696u(r13, r2)
            r8 = r8 ^ r2
            qj1.p2 r2 = new qj1.p2
            r2.<init>(r1, r8)
            o40.C61926c.m72668M(r2)
        L_0x046d:
            ok1.e r1 = ok1.C62042e.f176370a
            fj1.b r2 = r3.f166851d
            boolean r1 = r1.mo87024M0(r2)
            if (r1 != 0) goto L_0x0479
            goto L_0x04fc
        L_0x0479:
            java.lang.String r1 = "songId"
            int r18 = r7.optInt(r1)
            java.lang.String r1 = "playStatus"
            int r19 = r7.optInt(r1)
            java.lang.String r1 = "songVolume"
            int r20 = r7.optInt(r1)
            java.lang.String r1 = "songOptVersion"
            long r21 = r7.optLong(r1)
            java.lang.String r1 = "songOptSource"
            int r1 = r7.optInt(r1)
            java.lang.String r2 = r3.f170243j
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[notifyToChangeBgmPanel] seiJson:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            qj1.t2$a r2 = new qj1.t2$a
            r17 = r2
            r17.<init>(r18, r19, r20, r21)
            qj1.t2 r7 = r3.f170235b1
            if (r7 == 0) goto L_0x04fc
            int r7 = r7.mo14483f0()
            if (r7 != 0) goto L_0x04c4
            r7 = 1
            goto L_0x04c5
        L_0x04c4:
            r7 = 0
        L_0x04c5:
            if (r7 == 0) goto L_0x04fc
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r7.getClass()
            com.tencent.mm.plugin.finder.live.view.b r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r7 == 0) goto L_0x04e9
            java.lang.Class<qj1.t2> r8 = qj1.C62987t2.class
            qj1.c r7 = r7.getPlugin(r8)
            qj1.t2 r7 = (qj1.C62987t2) r7
            if (r7 == 0) goto L_0x04e9
            wg1.v r7 = r7.f178716q
            if (r7 == 0) goto L_0x04e9
            wg1.a0 r7 = (wg1.C65954a0) r7
            boolean r7 = r7.mo90005t()
            r8 = 1
            if (r7 != r8) goto L_0x04ea
            r7 = 1
            goto L_0x04eb
        L_0x04e9:
            r8 = 1
        L_0x04ea:
            r7 = 0
        L_0x04eb:
            if (r7 != 0) goto L_0x04ef
            if (r1 == r8) goto L_0x04fc
        L_0x04ef:
            qj1.t2 r1 = r3.f170235b1
            if (r1 == 0) goto L_0x04fc
            wg1.v r1 = r1.f178716q
            if (r1 == 0) goto L_0x04fc
            wg1.a0 r1 = (wg1.C65954a0) r1
            r1.mo90003n0(r2)
        L_0x04fc:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r6)
            cl1.d0 r1 = (cl1.C54963d0) r1
            al1.j r1 = r1.f154073p
            if (r1 == 0) goto L_0x0553
            java.lang.String r2 = r1.f151997a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r0)
            if (r2 == 0) goto L_0x0551
            r2 = 2
            boolean r7 = o40.C61926c.m72696u(r13, r2)
            boolean r2 = r1.f152012p
            if (r2 == r7) goto L_0x053d
            java.lang.String r2 = r1.f152011o
            if (r2 == 0) goto L_0x0524
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0522
            goto L_0x0524
        L_0x0522:
            r2 = 0
            goto L_0x0525
        L_0x0524:
            r2 = 1
        L_0x0525:
            if (r2 != 0) goto L_0x053d
            r1.f152012p = r7
            ii1.e r2 = r3.f170233Z0
            if (r2 == 0) goto L_0x0534
            java.lang.String r7 = r1.f151997a
            r2.mo85280d1(r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0534:
            qj1.o2 r2 = r3.f170250s
            if (r2 == 0) goto L_0x053d
            r2.mo87850a1()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x053d:
            r2 = 1
            boolean r7 = o40.C61926c.m72696u(r13, r2)
            boolean r2 = r1.f152010n
            if (r2 == r7) goto L_0x0551
            r1.f152010n = r7
            qj1.o2 r1 = r3.f170250s
            if (r1 == 0) goto L_0x0551
            r1.mo87851b1()
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0551:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0553:
            androidx.lifecycle.i0 r1 = r3.mo83051g(r4)
            cl1.u r1 = (cl1.C55001u) r1
            te3.bq2 r1 = r1.f154419p
            java.lang.String r1 = r1.f182319n
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x076a
            java.lang.String r0 = "live_link_mic_info_in_anchor_sei_msg"
            r1 = r25
            java.lang.String r0 = r1.getString(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x059d
            java.lang.String r1 = r3.f170243j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: linkMicInfo empty, linkMicInfo:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = ", roomPk:"
            r2.append(r0)
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x05a9
        L_0x059d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x05a4 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x05a4 }
            r0 = r1
            goto L_0x05a9
        L_0x05a4:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x05a9:
            java.lang.String r1 = r3.f170243j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: micData:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            vk1.b r1 = r3.f166842f
            if (r1 != 0) goto L_0x05c4
            goto L_0x05c7
        L_0x05c4:
            r1.setCurrentMicData(r0)
        L_0x05c7:
            java.lang.String r1 = "list"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            if (r1 == 0) goto L_0x05d4
            int r2 = r1.length()
            goto L_0x05d5
        L_0x05d4:
            r2 = 0
        L_0x05d5:
            if (r2 != 0) goto L_0x0669
            androidx.lifecycle.i0 r1 = r3.mo83051g(r6)
            cl1.d0 r1 = (cl1.C54963d0) r1
            r2 = 0
            r1.f154053G = r2
            androidx.lifecycle.i0 r1 = r3.mo83051g(r6)
            cl1.d0 r1 = (cl1.C54963d0) r1
            r2 = 0
            r1.f154073p = r2
            androidx.lifecycle.i0 r1 = r3.mo83051g(r6)
            cl1.d0 r1 = (cl1.C54963d0) r1
            r1.mo75928k3()
            androidx.lifecycle.i0 r1 = r3.mo83051g(r6)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154074q
            java.lang.String r2 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r1, r2)
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0644
            java.lang.String r0 = r3.f170243j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: audienceLinkMicUserList:"
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            vk1.b r0 = r3.f166842f
            if (r0 != 0) goto L_0x062a
            goto L_0x062e
        L_0x062a:
            r1 = 0
            r0.setLastRoomPkMicUserList(r1)
        L_0x062e:
            vk1.b r0 = r3.f166842f
            if (r0 == 0) goto L_0x0638
            r1 = 0
            r0.notifyAudienceMicUserChange(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0638:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r1, r2, r3, r4, r5, r6)
            goto L_0x076a
        L_0x0644:
            vk1.b r1 = r3.f166842f
            if (r1 == 0) goto L_0x0651
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_REMOVE_BOTTOM_BAR
            r4 = 2
            r5 = 0
            d60.C58124b.C7172a.m7372a(r1, r2, r5, r4, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0651:
            vk1.b r7 = r3.f166842f
            if (r7 == 0) goto L_0x065d
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r8 = r0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r7, r8, r9, r10, r11, r12)
        L_0x065d:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8 = 3
            r10 = 0
            r11 = 4
            r12 = 0
            r9 = r0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r7, r8, r9, r10, r11, r12)
            goto L_0x076a
        L_0x0669:
            androidx.lifecycle.i0 r2 = r3.mo83051g(r6)
            cl1.d0 r2 = (cl1.C54963d0) r2
            r4 = 1
            r2.f154053G = r4
            vk1.b r2 = r3.f166842f
            if (r2 == 0) goto L_0x0680
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_ADD_BOTTOM_BAR
            r7 = 0
            r8 = 2
            d60.C58124b.C7172a.m7372a(r2, r4, r7, r8, r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0681
        L_0x0680:
            r7 = 0
        L_0x0681:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            if (r1 == 0) goto L_0x068d
            int r4 = r1.length()
            goto L_0x068e
        L_0x068d:
            r4 = 0
        L_0x068e:
            r8 = r7
            r9 = 0
            r10 = 1
        L_0x0691:
            if (r9 >= r4) goto L_0x071d
            if (r1 == 0) goto L_0x069a
            org.json.JSONObject r11 = r1.optJSONObject(r9)
            goto L_0x069b
        L_0x069a:
            r11 = r7
        L_0x069b:
            if (r11 == 0) goto L_0x06a5
            java.lang.String r12 = "uId"
            java.lang.String r12 = r11.optString(r12)
            goto L_0x06a6
        L_0x06a5:
            r12 = r7
        L_0x06a6:
            androidx.lifecycle.i0 r13 = r3.mo83051g(r6)
            cl1.d0 r13 = (cl1.C54963d0) r13
            java.util.List<al1.j> r13 = r13.f154076s
            java.lang.String r14 = "business(LiveLinkMicSlic…java).linkMicUserInfoList"
            gy3.C87412m.m108593f(r13, r14)
            monitor-enter(r13)
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x071a }
        L_0x06b8:
            boolean r15 = r14.hasNext()     // Catch:{ all -> 0x071a }
            if (r15 == 0) goto L_0x06d0
            java.lang.Object r15 = r14.next()     // Catch:{ all -> 0x071a }
            r7 = r15
            al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x071a }
            java.lang.String r7 = r7.f151997a     // Catch:{ all -> 0x071a }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r12)     // Catch:{ all -> 0x071a }
            if (r7 == 0) goto L_0x06ce
            goto L_0x06d1
        L_0x06ce:
            r7 = 0
            goto L_0x06b8
        L_0x06d0:
            r15 = 0
        L_0x06d1:
            monitor-exit(r13)
            al1.j r15 = (al1.C54130j) r15
            if (r15 != 0) goto L_0x06ee
            java.lang.String r7 = r3.f170243j
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: can't find user info, userId:"
            r10.append(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r10 = 0
            goto L_0x0715
        L_0x06ee:
            if (r11 == 0) goto L_0x06f8
            java.lang.String r7 = "us"
            int r7 = r11.optInt(r7)
            goto L_0x06f9
        L_0x06f8:
            r7 = 0
        L_0x06f9:
            r11 = 1
            boolean r12 = o40.C61926c.m72696u(r7, r11)
            r15.f152010n = r12
            boolean r11 = r15.f152004h
            if (r11 == 0) goto L_0x0706
            r8 = r15
            goto L_0x0715
        L_0x0706:
            r11 = 8
            boolean r7 = o40.C61926c.m72696u(r7, r11)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r15.f152016t = r7
            r2.add(r15)
        L_0x0715:
            int r9 = r9 + 1
            r7 = 0
            goto L_0x0691
        L_0x071a:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x071d:
            gl1.h2 r1 = new gl1.h2
            r1.<init>(r3)
            o40.C61926c.m72668M(r1)
            if (r10 == 0) goto L_0x076a
            androidx.lifecycle.i0 r1 = r3.mo83051g(r6)
            cl1.d0 r1 = (cl1.C54963d0) r1
            r1.f154073p = r8
            androidx.lifecycle.i0 r1 = r3.mo83051g(r6)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154074q
            r1.clear()
            java.util.Iterator r1 = r2.iterator()
        L_0x073e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0754
            java.lang.Object r2 = r1.next()
            al1.j r2 = (al1.C54130j) r2
            androidx.lifecycle.i0 r4 = r3.mo83051g(r5)
            cl1.o r4 = (cl1.C54991o) r4
            r4.mo76009k4(r2)
            goto L_0x073e
        L_0x0754:
            vk1.b r7 = r3.f166842f
            if (r7 == 0) goto L_0x0760
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r8 = r0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r7, r8, r9, r10, r11, r12)
        L_0x0760:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8 = 3
            r10 = 0
            r11 = 4
            r12 = 0
            r9 = r0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r7, r8, r9, r10, r11, r12)
        L_0x076a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0875
        L_0x076e:
            r1 = r2
            r2 = 19
            if (r0 != r2) goto L_0x07eb
            if (r1 == 0) goto L_0x077c
            java.lang.String r0 = "live_user_volume_info"
            java.util.ArrayList r2 = r1.getParcelableArrayList(r0)
            goto L_0x077d
        L_0x077c:
            r2 = 0
        L_0x077d:
            androidx.lifecycle.i0 r0 = r3.mo83051g(r6)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r1 = r0.f154074q
            java.lang.String r0 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r1, r0)
            monitor-enter(r1)
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x07e8 }
        L_0x078f:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x07e8 }
            if (r4 == 0) goto L_0x07db
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x07e8 }
            al1.j r4 = (al1.C54130j) r4     // Catch:{ all -> 0x07e8 }
            if (r2 == 0) goto L_0x07c6
            monitor-enter(r2)     // Catch:{ all -> 0x07e8 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x07c3 }
        L_0x07a2:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x07c3 }
            if (r6 == 0) goto L_0x07ba
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x07c3 }
            r7 = r6
            com.tencent.mm.live.core.core.model.UserVolumeInfo r7 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r7     // Catch:{ all -> 0x07c3 }
            java.lang.String r7 = r7.f157117d     // Catch:{ all -> 0x07c3 }
            java.lang.String r8 = r4.f151997a     // Catch:{ all -> 0x07c3 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x07c3 }
            if (r7 == 0) goto L_0x07a2
            goto L_0x07bb
        L_0x07ba:
            r6 = 0
        L_0x07bb:
            monitor-exit(r2)     // Catch:{ all -> 0x07e8 }
            com.tencent.mm.live.core.core.model.UserVolumeInfo r6 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r6     // Catch:{ all -> 0x07e8 }
            if (r6 == 0) goto L_0x07c6
            int r5 = r6.f157118e     // Catch:{ all -> 0x07e8 }
            goto L_0x07c7
        L_0x07c3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07e8 }
            throw r0     // Catch:{ all -> 0x07e8 }
        L_0x07c6:
            r5 = 0
        L_0x07c7:
            j50.a r6 = r3.f166844h     // Catch:{ all -> 0x07e8 }
            if (r6 == 0) goto L_0x07d2
            d50.c r6 = r6.f172999K     // Catch:{ all -> 0x07e8 }
            if (r6 == 0) goto L_0x07d2
            int r6 = r6.f83322a     // Catch:{ all -> 0x07e8 }
            goto L_0x07d3
        L_0x07d2:
            r6 = 0
        L_0x07d3:
            if (r5 > r6) goto L_0x07d7
            r5 = 1
            goto L_0x07d8
        L_0x07d7:
            r5 = 0
        L_0x07d8:
            r4.f152010n = r5     // Catch:{ all -> 0x07e8 }
            goto L_0x078f
        L_0x07db:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x07e8 }
            monitor-exit(r1)
            gl1.h2 r0 = new gl1.h2
            r0.<init>(r3)
            o40.C61926c.m72668M(r0)
            goto L_0x0875
        L_0x07e8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x07eb:
            r2 = 4
            if (r0 != r2) goto L_0x0875
            if (r1 == 0) goto L_0x07f9
            java.lang.String r0 = "live_err_code"
            r2 = 0
            int r0 = r1.getInt(r0, r2)
            r9 = r0
            goto L_0x07fa
        L_0x07f9:
            r9 = 0
        L_0x07fa:
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86197t
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x0812
            gl1.d2 r0 = new gl1.d2
            r0.<init>(r3, r9)
            o40.C61926c.m72668M(r0)
            goto L_0x0875
        L_0x0812:
            androidx.lifecycle.i0 r0 = r3.mo83051g(r5)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154301c3
            if (r0 == 0) goto L_0x0849
            er1.c5 r0 = er1.C58704c5.f168044a
            r1 = 0
            er1.C58704c5.C58705a.f168049b = r1
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r1 = er1.C58704c5.f168047d
            r4 = 1143(0x477, double:5.647E-321)
            r0.mo175912v(r1, r4)
            er1.f5 r6 = er1.C58728f5.f168144a
            fj1.b r7 = r3.f166851d
            r8 = 1143(0x477, float:1.602E-42)
            java.lang.String r10 = "externalErrorReport"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0-vBitrate:"
            r0.append(r1)
            long r1 = b50.C54424j.f152654c
            r0.append(r1)
            java.lang.String r11 = r0.toString()
            r6.mo83645b(r7, r8, r9, r10, r11)
            goto L_0x0875
        L_0x0849:
            er1.c5 r0 = er1.C58704c5.f168044a
            r1 = 0
            er1.C58704c5.C58705a.f168049b = r1
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r1 = er1.C58704c5.f168047d
            r4 = 1133(0x46d, double:5.6E-321)
            r0.mo175912v(r1, r4)
            er1.f5 r6 = er1.C58728f5.f168144a
            fj1.b r7 = r3.f166851d
            r8 = 1133(0x46d, float:1.588E-42)
            java.lang.String r10 = "secondaryErrorReport"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0-vBitrate:"
            r0.append(r1)
            long r1 = b50.C54424j.f152654c
            r0.append(r1)
            java.lang.String r11 = r0.toString()
            r6.mo83645b(r7, r8, r9, r10, r11)
        L_0x0875:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56074k.onLiveEventCallback(int, android.os.Bundle):void");
    }

    public void onRotationSwitchChange(boolean z) {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f159906h;
        Log.m105924i(str2, "onSceneEnd errType:" + i + ", errCode:" + i2 + ", scene:" + yVar);
    }

    public void pause() {
        super.pause();
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [j50.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r22 = this;
            r0 = r22
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.String r3 = r0.f159906h
            java.lang.String r4 = "release"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r3 = 0
            ij1.C60299b.f171936h = r3
            gl1.k r4 = r22.getLiveStartUIC()
            r4.mo84605k()
            com.tencent.mm.sdk.platformtools.MTimerHandler r5 = r4.f170242i1
            r5.stopTimer()
            r5 = 0
            r4.f170239f1 = r5
            r4.f170240g1 = r5
            y50.k r4 = y50.C53496k.f150436a
            r4.mo74173f()
            cj1.i5 r4 = cj1.C54773i5.f153520a
            r4.mo75679b()
            f40.g r4 = f40.C86709a0.m107529k()
            ob0.b0 r4 = r4.f251779b
            r6 = 3861(0xf15, float:5.41E-42)
            r4.mo123470p(r6, r0)
            f40.g r4 = f40.C86709a0.m107529k()
            ob0.b0 r4 = r4.f251779b
            r6 = 3603(0xe13, float:5.049E-42)
            r4.mo123470p(r6, r0)
            androidx.lifecycle.i0 r4 = r0.business(r2)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154301c3
            r6 = 1
            if (r4 == 0) goto L_0x00f5
            androidx.lifecycle.i0 r4 = r0.business(r2)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154266V
            if (r4 == 0) goto L_0x00e4
            androidx.lifecycle.i0 r4 = r0.business(r2)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154331j3
            if (r4 == 0) goto L_0x00a2
            java.lang.Class<kz1.m> r4 = kz1.C46828m.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r7 = r4
            kz1.m r7 = (kz1.C46828m) r7
            android.content.Context r8 = r22.getContext()
            androidx.lifecycle.i0 r4 = r0.business(r2)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154309e3
            if (r4 != 0) goto L_0x0085
            androidx.lifecycle.i0 r4 = r0.business(r1)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            java.lang.String r4 = r4.f182357C
            if (r4 != 0) goto L_0x0085
            java.lang.String r4 = ""
        L_0x0085:
            r9 = r4
            androidx.lifecycle.i0 r2 = r0.business(r2)
            cl1.o r2 = (cl1.C54991o) r2
            int r10 = r2.f154314f3
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            androidx.lifecycle.i0 r1 = r0.business(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r1 = r1.f182392d
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            r11 = r12
            r7.mo72034dg(r8, r9, r10, r11, r12, r13)
        L_0x00a2:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r14 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r16 = 0
            boolean r17 = r22.getMiniWinPermission()
            r18 = 0
            boolean r19 = r22.getFinishActivityNotReleaseLive()
            r20 = 10
            r21 = 0
            java.lang.String r15 = "secRelease_1"
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63767I(r14, r15, r16, r17, r18, r19, r20, r21)
            j50.a r1 = r22.getLiveCore()
            if (r1 == 0) goto L_0x00ca
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r1.mo82881c()
            if (r1 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r6 = 0
        L_0x00cb:
            if (r6 == 0) goto L_0x00e4
            boolean r1 = r22.getMiniWinPermission()
            if (r1 != 0) goto L_0x00e4
            boolean r1 = r22.getFinishActivityNotReleaseLive()
            if (r1 != 0) goto L_0x00e4
            y50.C66521k0.f191361a = r3
            j50.a r1 = r22.getLiveCore()
            if (r1 == 0) goto L_0x00e4
            r1.mo85693l0()
        L_0x00e4:
            j50.a r1 = r22.getLiveCore()
            boolean r2 = r1 instanceof p50.C62197e
            if (r2 == 0) goto L_0x00ef
            r3 = r1
            p50.e r3 = (p50.C62197e) r3
        L_0x00ef:
            if (r3 == 0) goto L_0x013b
            r3.mo87256C0(r5)
            goto L_0x013b
        L_0x00f5:
            j50.a r1 = r22.getLiveCore()
            if (r1 == 0) goto L_0x0106
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0106
            boolean r1 = r1.mo82881c()
            if (r1 != 0) goto L_0x0106
            r5 = 1
        L_0x0106:
            if (r5 == 0) goto L_0x013b
            boolean r1 = r22.getMiniWinPermission()
            if (r1 != 0) goto L_0x013b
            boolean r1 = r22.getFinishActivityNotReleaseLive()
            if (r1 != 0) goto L_0x013b
            androidx.lifecycle.i0 r1 = r0.business(r2)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154355q1
            if (r1 != 0) goto L_0x0132
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4 = 0
            boolean r5 = r22.getMiniWinPermission()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r22.getFinishActivityNotReleaseLive()
            r8 = 2
            r9 = 0
            java.lang.String r3 = "secRelease_2"
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63767I(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0132:
            j50.a r1 = r22.getLiveCore()
            if (r1 == 0) goto L_0x013b
            r1.mo85693l0()
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56074k.release():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = r1.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resume() {
        /*
            r4 = this;
            super.resume()
            gl1.k r0 = r4.getLiveStartUIC()
            j50.a r1 = r0.f166844h
            r2 = 0
            if (r1 == 0) goto L_0x0016
            d50.i r3 = r1.f172989A
            if (r3 == 0) goto L_0x0016
            boolean r3 = r3.f166254a
            if (r3 != 0) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            if (r3 == 0) goto L_0x003f
            zt3.t r1 = zt3.C119157j.f356862d
            cj1.w5 r2 = cj1.C28594w5.f78482d
            zt3.j r1 = (zt3.C119157j) r1
            java.lang.String r3 = "Finder.LiveExceptionMonitor"
            r1.mo183876g(r2, r3)
            j50.a r1 = r0.f166844h
            if (r1 == 0) goto L_0x002b
            r1.mo75580f0()
        L_0x002b:
            vk1.b r1 = r0.f166842f
            if (r1 == 0) goto L_0x0047
            al1.h r1 = r1.getData()
            if (r1 == 0) goto L_0x0047
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r1.f151979f
            if (r1 == 0) goto L_0x0047
            gh1.j r2 = gh1.C59447j.f169870a
            r2.mo84553e(r1)
            goto L_0x0047
        L_0x003f:
            if (r1 == 0) goto L_0x0047
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0047
            r1.f166254a = r2
        L_0x0047:
            qj1.c7 r1 = r0.f170232Z
            if (r1 == 0) goto L_0x004e
            r1.onResume()
        L_0x004e:
            qj1.l1 r1 = r0.f170228X
            if (r1 == 0) goto L_0x0055
            r1.onResume()
        L_0x0055:
            qj1.ba r1 = r0.f170209K
            if (r1 == 0) goto L_0x005c
            r1.onResume()
        L_0x005c:
            qj1.ba r1 = r0.f170210L
            if (r1 == 0) goto L_0x0063
            r1.onResume()
        L_0x0063:
            java.lang.Class<yg1.e> r1 = yg1.C66636e.class
            androidx.lifecycle.i0 r1 = r0.mo83051g(r1)
            yg1.e r1 = (yg1.C66636e) r1
            r1.mo90686c3()
            qj1.dd r0 = r0.f170199A
            if (r0 == 0) goto L_0x0079
            qj1.ri r0 = r0.f178065u
            if (r0 == 0) goto L_0x0079
            r0.onResume()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56074k.resume():void");
    }

    public final void setLiveMessageCallback(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f159907i = aVar;
    }

    public final void setLiveSlowMessageCallback(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f159908j = aVar;
    }

    public final void setTAG(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f159906h = str;
    }

    public void start() {
        super.start();
        C59559k liveStartUIC = getLiveStartUIC();
        C62632a6 a6Var = liveStartUIC.f170249r;
        boolean z = false;
        if (a6Var != null && a6Var.mo14483f0() == 0) {
            z = true;
        }
        if (z) {
            liveStartUIC.f170242i1.stopTimer();
            liveStartUIC.f170242i1.startTimer(1000);
        }
    }

    /* JADX WARNING: type inference failed for: r3v27, types: [d60.b] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x068b, code lost:
        if (r8 != false) goto L_0x068d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void statusChange(d60.C58124b.C58125b r43, android.os.Bundle r44) {
        /*
            r42 = this;
            r1 = r43
            r2 = r44
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.String r0 = "status"
            gy3.C87412m.m108594g(r1, r0)
            super.statusChange(r43, r44)
            gl1.m2 r0 = r42.getLivePrepareUIC()
            r0.getClass()
            gl1.k r4 = r42.getLiveStartUIC()
            r4.getClass()
            java.lang.Class<cl1.b0> r5 = cl1.C54946b0.class
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.Class<cl1.u> r6 = cl1.C55001u.class
            java.lang.Class<ak1.o> r7 = ak1.C54108o.class
            int r8 = r43.ordinal()
            r9 = 8
            r10 = 2
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 1
            switch(r8) {
                case 7: goto L_0x062a;
                case 9: goto L_0x05ac;
                case 21: goto L_0x04ad;
                case 24: goto L_0x049e;
                case 26: goto L_0x049e;
                case 39: goto L_0x048c;
                case 54: goto L_0x040b;
                case 67: goto L_0x02af;
                case 116: goto L_0x0265;
                case 117: goto L_0x00b2;
                case 124: goto L_0x009d;
                case 129: goto L_0x0064;
                case 132: goto L_0x00b2;
                case 174: goto L_0x004c;
                case 175: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0865
        L_0x0036:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r4 = r0 instanceof p50.C62197e
            if (r4 == 0) goto L_0x0044
            p50.e r0 = (p50.C62197e) r0
            goto L_0x0045
        L_0x0044:
            r0 = r12
        L_0x0045:
            if (r0 == 0) goto L_0x0867
            r0.mo87273O0(r13)
            goto L_0x0865
        L_0x004c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r4 = r0 instanceof p50.C62197e
            if (r4 == 0) goto L_0x005a
            p50.e r0 = (p50.C62197e) r0
            goto L_0x005b
        L_0x005a:
            r0 = r12
        L_0x005b:
            if (r0 == 0) goto L_0x0867
            r0.mo87273O0(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x0064:
            if (r2 == 0) goto L_0x0867
            java.lang.String r0 = "PARAM_FINDER_LIVE_TOP_COMMENT"
            byte[] r0 = r2.getByteArray(r0)
            if (r0 == 0) goto L_0x0867
            te3.r41 r5 = new te3.r41
            r5.<init>()
            r5.parseFrom(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
            qj1.mf r4 = r4.f170201C
            if (r4 == 0) goto L_0x0087
            r4.mo12155e1(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0087:
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            ak1.m0 r0 = r0.f151443Y
            long r4 = r0.f151846w
            long r4 = r4 + r14
            r0.f151846w = r4
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x009d:
            if (r2 == 0) goto L_0x00a6
            java.lang.String r0 = "PARAM_FINDER_LIVE_SCREEN_CLEAR"
            boolean r0 = r2.getBoolean(r0)
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            vk1.b r4 = r4.f166842f
            if (r4 == 0) goto L_0x0867
            r4.onScreenClear(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x00b2:
            if (r2 == 0) goto L_0x00d3
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_PAGE"
            byte[] r0 = r2.getByteArray(r0)
            if (r0 == 0) goto L_0x00d3
            te3.ay0 r6 = new te3.ay0
            r6.<init>()
            r6.parseFrom(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00d4
        L_0x00c5:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = r4.f170243j
            java.lang.String r7 = "statusChange:"
            java.lang.Object[] r8 = new java.lang.Object[r11]
            r8[r13] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)
        L_0x00d3:
            r6 = r12
        L_0x00d4:
            if (r2 == 0) goto L_0x00dd
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_CODE"
            int r0 = r2.getInt(r0)
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            vk1.b r7 = r4.f166842f
            if (r7 == 0) goto L_0x0101
            al1.h r7 = r7.getData()
            if (r7 == 0) goto L_0x0101
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r7 = r7.f151979f
            if (r7 == 0) goto L_0x0101
            java.lang.Class<fh1.t2> r8 = fh1.C8083t2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r7.controller(r8)
            fh1.t2 r7 = (fh1.C8083t2) r7
            if (r7 == 0) goto L_0x00ff
            gh1.p r7 = r7.f26903j
            if (r7 == 0) goto L_0x00ff
            r7.mo84560c(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x00ff:
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0101:
            vk1.b r7 = r4.f166842f
            if (r7 == 0) goto L_0x010a
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r7, r13, r11, r12)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x010a:
            qj1.je r7 = r4.f170246p
            if (r7 == 0) goto L_0x0113
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0113:
            qj1.ff r7 = r4.f170248q
            if (r7 == 0) goto L_0x011c
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x011c:
            qj1.a6 r7 = r4.f170249r
            if (r7 == 0) goto L_0x0125
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0125:
            qj1.sd r7 = r4.f170253v
            if (r7 == 0) goto L_0x012e
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x012e:
            qj1.e5 r7 = r4.f170252u
            if (r7 == 0) goto L_0x0137
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0137:
            qj1.z0 r7 = r4.f170254w
            if (r7 == 0) goto L_0x0140
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0140:
            qj1.fa r7 = r4.f170255x
            if (r7 == 0) goto L_0x0149
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0149:
            qj1.vb r7 = r4.f170257y
            if (r7 == 0) goto L_0x0152
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0152:
            qj1.v9 r7 = r4.f170259z
            if (r7 == 0) goto L_0x015b
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x015b:
            qj1.mf r7 = r4.f170201C
            if (r7 == 0) goto L_0x0164
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0164:
            qj1.u1 r7 = r4.f170202D
            if (r7 == 0) goto L_0x016d
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x016d:
            qj1.dd r7 = r4.f170199A
            if (r7 == 0) goto L_0x0176
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0176:
            qj1.pe r7 = r4.f170200B
            if (r7 == 0) goto L_0x017f
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x017f:
            ii1.e r7 = r4.f170233Z0
            if (r7 == 0) goto L_0x0188
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0188:
            qj1.q7 r7 = r4.f170222U
            if (r7 == 0) goto L_0x0191
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0191:
            qj1.u7 r7 = r4.f170230Y
            if (r7 == 0) goto L_0x019a
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x019a:
            qj1.l0 r7 = r4.f170247p0
            if (r7 == 0) goto L_0x01a3
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01a3:
            qj1.yc r7 = r4.f170256x0
            if (r7 == 0) goto L_0x01ac
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01ac:
            qj1.bd r7 = r4.f170217R0
            if (r7 == 0) goto L_0x01b5
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01b5:
            qj1.f1 r7 = r4.f170219S0
            if (r7 == 0) goto L_0x01be
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01be:
            qj1.k1 r7 = r4.f170223U0
            if (r7 == 0) goto L_0x01c7
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01c7:
            qj1.r2 r7 = r4.f170221T0
            if (r7 == 0) goto L_0x01d0
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01d0:
            qj1.o3 r7 = r4.f170231Y0
            if (r7 == 0) goto L_0x01d9
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01d9:
            qj1.ld r7 = r4.f170238e1
            if (r7 == 0) goto L_0x01e2
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01e2:
            qj1.h6 r7 = r4.f170225V0
            if (r7 == 0) goto L_0x01eb
            r7.mo10792g(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x01eb:
            d60.b$b r7 = d60.C58124b.C58125b.FINDER_LIVE_FORCE_QUIT
            if (r1 != r7) goto L_0x022a
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r7 = r4.f170245o
            if (r7 == 0) goto L_0x0200
            androidx.lifecycle.i0 r8 = r4.mo83051g(r3)
            cl1.o r8 = (cl1.C54991o) r8
            java.lang.String r8 = r8.f154345o
            r7.mo77686a1(r8, r6, r0)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0200:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r7 = r4.f170245o
            if (r7 == 0) goto L_0x023b
            java.lang.String r7 = r4.f170243j
            java.lang.String r8 = "live end by force quit!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            androidx.lifecycle.i0 r7 = r4.mo83051g(r5)
            cl1.b0 r7 = (cl1.C54946b0) r7
            r7.f153987n = r11
            androidx.lifecycle.i0 r7 = r4.mo83051g(r5)
            cl1.b0 r7 = (cl1.C54946b0) r7
            r7.f153988o = r6
            androidx.lifecycle.i0 r5 = r4.mo83051g(r5)
            cl1.b0 r5 = (cl1.C54946b0) r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.f153989p = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x023b
        L_0x022a:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r5 = r4.f170245o
            if (r5 == 0) goto L_0x023b
            androidx.lifecycle.i0 r7 = r4.mo83051g(r3)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.f154345o
            r5.mo77687b1(r7, r6, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x023b:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r0 = r4.f170245o
            if (r0 == 0) goto L_0x0244
            r0.mo10792g(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0244:
            j50.a r0 = r4.f166844h
            if (r0 == 0) goto L_0x024e
            r5 = 4
            r0.mo85674O(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x024e:
            cj1.r0 r0 = cj1.C54804r0.f153631a
            androidx.appcompat.app.AppCompatActivity r5 = r4.f166841e
            fj1.b r4 = r4.f166851d
            r0.mo75762c(r5, r4, r10)
            cj1.i5 r0 = cj1.C54773i5.f153520a
            r0.mo75679b()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.mo77646t()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x0265:
            if (r2 == 0) goto L_0x0286
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_PAGE"
            byte[] r0 = r2.getByteArray(r0)
            if (r0 == 0) goto L_0x0286
            te3.ay0 r5 = new te3.ay0
            r5.<init>()
            r5.parseFrom(r0)     // Catch:{ all -> 0x0278 }
            goto L_0x0287
        L_0x0278:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = r4.f170243j
            java.lang.String r6 = "statusChange:"
            java.lang.Object[] r7 = new java.lang.Object[r11]
            r7[r13] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r7)
        L_0x0286:
            r5 = r12
        L_0x0287:
            if (r2 == 0) goto L_0x0290
            java.lang.String r0 = "PARAM_FINDER_LIVE_FACE_VERIFY_URL"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0291
        L_0x0290:
            r0 = r12
        L_0x0291:
            if (r2 == 0) goto L_0x029a
            java.lang.String r6 = "PARAM_FINDER_LIVE_USERNAME"
            java.lang.String r6 = r2.getString(r6)
            goto L_0x029b
        L_0x029a:
            r6 = r12
        L_0x029b:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r7 = r4.f170245o
            if (r7 == 0) goto L_0x02a4
            r7.mo77688c1(r0, r6, r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02a4:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin r0 = r4.f170245o
            if (r0 == 0) goto L_0x0867
            r0.mo10792g(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x02af:
            java.lang.String r5 = r4.f170243j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "param:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            androidx.lifecycle.i0 r5 = r4.mo83051g(r3)
            cl1.o r5 = (cl1.C54991o) r5
            if (r2 == 0) goto L_0x02d4
            java.lang.String r6 = "EVT_PARAM1"
            int r6 = r2.getInt(r6)
            goto L_0x02d5
        L_0x02d4:
            r6 = 0
        L_0x02d5:
            r5.f154335l1 = r6
            androidx.lifecycle.i0 r5 = r4.mo83051g(r3)
            cl1.o r5 = (cl1.C54991o) r5
            if (r2 == 0) goto L_0x02e6
            java.lang.String r6 = "EVT_PARAM2"
            int r6 = r2.getInt(r6)
            goto L_0x02e7
        L_0x02e6:
            r6 = 0
        L_0x02e7:
            r5.f154338m1 = r6
            qj1.ze r5 = r4.f170244n
            if (r5 == 0) goto L_0x030c
            f50.d r5 = r5.mo88091c1()
            if (r5 == 0) goto L_0x030c
            ok1.e r6 = ok1.C62042e.f176370a
            fj1.b r7 = r4.f166851d
            vk1.b r8 = r4.f166842f
            if (r8 == 0) goto L_0x0300
            boolean r8 = r8.isLandscape()
            goto L_0x0301
        L_0x0300:
            r8 = 0
        L_0x0301:
            boolean r14 = r4.f170240g1
            int r6 = r6.mo87123v0(r7, r8, r14)
            r5.setRenderMode(r6)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x030c:
            java.lang.String r5 = r4.f170243j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "videoWidth:"
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r4.mo83051g(r3)
            cl1.o r7 = (cl1.C54991o) r7
            int r7 = r7.f154335l1
            r6.append(r7)
            java.lang.String r7 = ",videoHeight:"
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r4.mo83051g(r3)
            cl1.o r7 = (cl1.C54991o) r7
            int r7 = r7.f154338m1
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            androidx.lifecycle.i0 r5 = r4.mo83051g(r3)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo75993b4()
            if (r5 != 0) goto L_0x0387
            androidx.lifecycle.i0 r5 = r4.mo83051g(r0)
            cl1.d0 r5 = (cl1.C54963d0) r5
            r5.f154073p = r12
            androidx.lifecycle.i0 r5 = r4.mo83051g(r0)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List<al1.j> r5 = r5.f154074q
            r5.clear()
            androidx.lifecycle.i0 r5 = r4.mo83051g(r0)
            cl1.d0 r5 = (cl1.C54963d0) r5
            r5.f154053G = r13
            vk1.b r5 = r4.f166842f
            if (r5 == 0) goto L_0x036d
            d60.b$b r6 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_REMOVE_BOTTOM_BAR
            d60.C58124b.C7172a.m7372a(r5, r6, r12, r10, r12)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x036d:
            qj1.l0 r5 = r4.f170247p0
            if (r5 == 0) goto L_0x0376
            r5.mo12140Z0()
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0376:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r14 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r15 = 3
            org.json.JSONObject r16 = new org.json.JSONObject
            r16.<init>()
            r17 = 0
            r18 = 4
            r19 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r14, r15, r16, r17, r18, r19)
        L_0x0387:
            androidx.lifecycle.i0 r5 = r4.mo83051g(r0)
            cl1.d0 r5 = (cl1.C54963d0) r5
            boolean r5 = r5.f154053G
            if (r5 != 0) goto L_0x03cb
            vk1.b r5 = r4.f166842f
            if (r5 == 0) goto L_0x039a
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r5, r13, r11, r12)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x039a:
            vk1.b r5 = r4.f166842f
            if (r5 == 0) goto L_0x03a3
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyPKMicUserChange$default(r5, r13, r11, r12)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x03a3:
            androidx.lifecycle.i0 r0 = r4.mo83051g(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 == 0) goto L_0x03bc
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r14 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r14, r15, r16, r17, r18, r19)
            goto L_0x03cb
        L_0x03bc:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r20 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r21 = 2
            r22 = 0
            r23 = 0
            r24 = 6
            r25 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r20, r21, r22, r23, r24, r25)
        L_0x03cb:
            androidx.lifecycle.i0 r0 = r4.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75996d3()
            if (r0 == 0) goto L_0x0407
            androidx.lifecycle.i0 r0 = r4.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75996d3()
            if (r0 != r11) goto L_0x03e7
            gl1.C59559k.m69435j(r4, r12, r11, r12)
            goto L_0x0407
        L_0x03e7:
            java.lang.String r0 = r4.f170243j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "invalid audience mode:"
            r5.append(r6)
            androidx.lifecycle.i0 r4 = r4.mo83051g(r3)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.mo75996d3()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
        L_0x0407:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x040b:
            java.lang.String r0 = r4.f170243j
            java.lang.String r5 = "start live failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            androidx.lifecycle.i0 r0 = r4.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75997d4()
            if (r0 != 0) goto L_0x044b
            qj1.sd r0 = r4.f170253v
            if (r0 == 0) goto L_0x0428
            r0.mo10792g(r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0428:
            vk1.b r0 = r4.f166842f
            if (r0 == 0) goto L_0x044b
            androidx.lifecycle.i0 r5 = r4.mo83051g(r3)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.f154345o
            androidx.appcompat.app.AppCompatActivity r4 = r4.f166841e
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131832052(0x7f112cf4, float:1.9297147E38)
            java.lang.String r4 = r4.getString(r6)
            java.lang.String r6 = "context.resources.getStr…_local_network_error_tip)"
            gy3.C87412m.m108593f(r4, r6)
            r0.showTipWithBlurBg(r5, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x044b:
            di3.d r0 = di3.C86312j.m106911c(r7)
            java.lang.String r4 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r4)
            r14 = r0
            ht1.j5 r14 = (ht1.C8777j5) r14
            r15 = 4
            java.lang.String r17 = java.lang.String.valueOf(r11)
            r18 = 0
            r19 = 4
            r20 = 0
            ht1.C8777j5.C8778a.m8600a(r14, r15, r17, r18, r19, r20)
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            if (r2 == 0) goto L_0x0475
            java.lang.String r4 = "live_user_exit_reason"
            int r4 = r2.getInt(r4, r13)
            goto L_0x0476
        L_0x0475:
            r4 = 0
        L_0x0476:
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            r0.f151437S = r4
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            ak1.f0$p r4 = ak1.C54067f0.C54077p.LIVE_EXIT_ERROR
            r0.ay0(r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x048c:
            qj1.e5 r0 = r4.f170252u
            if (r0 == 0) goto L_0x049a
            android.view.ViewGroup r5 = r0.f166287d
            gl1.i2 r6 = new gl1.i2
            r6.<init>(r2, r4, r0)
            r5.post(r6)
        L_0x049a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x049e:
            j50.a r0 = r4.f166844h
            if (r0 == 0) goto L_0x0867
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0867
            r0.mo82879a()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x04ad:
            if (r2 == 0) goto L_0x04ba
            java.lang.String r0 = "PARAM_FINDER_LIVE_FORCE_TASK"
            boolean r0 = r2.getBoolean(r0, r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x04bb
        L_0x04ba:
            r0 = r12
        L_0x04bb:
            if (r2 == 0) goto L_0x04c6
            java.lang.String r5 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            int r5 = r2.getInt(r5, r13)
            r20 = r5
            goto L_0x04c8
        L_0x04c6:
            r20 = 0
        L_0x04c8:
            if (r2 == 0) goto L_0x04cf
            java.lang.String r5 = "PARAM_LIVE_MINI_WINDOW_OP_TYPE"
            r2.getInt(r5, r13)
        L_0x04cf:
            j50.a r5 = r4.f166844h
            if (r5 == 0) goto L_0x04df
            d50.i r5 = r5.f172989A
            if (r5 == 0) goto L_0x04df
            boolean r5 = r5.mo82881c()
            if (r5 != 0) goto L_0x04df
            r5 = 1
            goto L_0x04e0
        L_0x04df:
            r5 = 0
        L_0x04e0:
            if (r5 == 0) goto L_0x058b
            zt3.t r5 = zt3.C119157j.f356862d
            cj1.v5 r6 = cj1.C28593v5.f78481d
            zt3.j r5 = (zt3.C119157j) r5
            java.lang.String r8 = "Finder.LiveExceptionMonitor"
            r5.mo183876g(r6, r8)
            j50.a r5 = r4.f166844h
            if (r5 == 0) goto L_0x0513
            androidx.appcompat.app.AppCompatActivity r6 = r4.f166841e
            if (r0 == 0) goto L_0x04fc
            boolean r0 = r0.booleanValue()
            r18 = r0
            goto L_0x04fe
        L_0x04fc:
            r18 = 1
        L_0x04fe:
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 240(0xf0, float:3.36E-43)
            r26 = 0
            r16 = r5
            r17 = r6
            b50.C54408d.C54409a.m61121a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0513:
            vk1.b r0 = r4.f166842f
            if (r0 == 0) goto L_0x0528
            al1.h r0 = r0.getData()
            if (r0 == 0) goto L_0x0528
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.f151979f
            if (r0 == 0) goto L_0x0528
            gh1.j r5 = gh1.C59447j.f169870a
            r5.mo84550b(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0528:
            androidx.lifecycle.i0 r0 = r4.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r5 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 == 0) goto L_0x053d
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.mo77611N()
        L_0x053d:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            cj1.r1 r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159382j
            androidx.lifecycle.i0 r6 = r0.mo77630e(r3)
            cl1.o r6 = (cl1.C54991o) r6
            if (r6 == 0) goto L_0x054c
            java.lang.String r6 = r6.f154309e3
            goto L_0x054d
        L_0x054c:
            r6 = r12
        L_0x054d:
            androidx.lifecycle.i0 r0 = r0.mo77630e(r3)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x055c
            int r0 = r0.f154314f3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x055d
        L_0x055c:
            r0 = r12
        L_0x055d:
            java.util.List<is3.a> r5 = r5.f153636a
            java.lang.String r8 = "externalLiveCallbacks"
            gy3.C87412m.m108593f(r5, r8)
            monitor-enter(r5)
            java.util.Iterator r8 = r5.iterator()     // Catch:{ all -> 0x0588 }
        L_0x0569:
            boolean r16 = r8.hasNext()     // Catch:{ all -> 0x0588 }
            if (r16 == 0) goto L_0x0586
            java.lang.Object r16 = r8.next()     // Catch:{ all -> 0x0588 }
            r9 = r16
            is3.a r9 = (is3.C60622a) r9     // Catch:{ all -> 0x0588 }
            java.lang.String r12 = "FinderLiveExternalHelper"
            java.lang.String r10 = "notifyMiniWindowStatusToExternal isShown:true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)     // Catch:{ all -> 0x0588 }
            r9.mo85579f(r11, r6, r0)     // Catch:{ all -> 0x0588 }
            r9 = 8
            r10 = 2
            r12 = 0
            goto L_0x0569
        L_0x0586:
            monitor-exit(r5)
            goto L_0x058b
        L_0x0588:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x058b:
            di3.d r0 = di3.C86312j.m106911c(r7)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            ak1.m0 r0 = r0.f151443Y
            long r5 = r0.f151835l
            long r5 = r5 + r14
            r0.f151835l = r5
            java.lang.Class<cl1.a1> r0 = cl1.C54943a1.class
            androidx.lifecycle.i0 r0 = r4.mo83051g(r0)
            cl1.a1 r0 = (cl1.C54943a1) r0
            r0.mo75855c3()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x05ac:
            androidx.lifecycle.i0 r0 = r4.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154295b1
            if (r0 != 0) goto L_0x05b8
            r0 = 1
            goto L_0x05b9
        L_0x05b8:
            r0 = 0
        L_0x05b9:
            if (r0 != 0) goto L_0x060e
            ok1.e r0 = ok1.C62042e.f176370a
            fj1.b r5 = r4.f166851d
            boolean r0 = r0.mo86991B(r5)
            if (r0 == 0) goto L_0x060e
            androidx.lifecycle.i0 r0 = r4.mo83051g(r6)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r7 = r0.f182392d
            androidx.lifecycle.i0 r0 = r4.mo83051g(r6)
            cl1.u r0 = (cl1.C55001u) r0
            byte[] r0 = r0.f154417n
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            androidx.lifecycle.i0 r6 = r4.mo83051g(r6)
            cl1.u r6 = (cl1.C55001u) r6
            long r9 = r6.f154416j
            androidx.lifecycle.i0 r6 = r4.mo83051g(r3)
            cl1.o r6 = (cl1.C54991o) r6
            cj1.f r6 = r6.f154232N2
            te3.zv0 r6 = r6.mo75648e()
            r27 = 0
            dj1.o0 r12 = new dj1.o0
            kk1.a r28 = new kk1.a
            r19 = r28
            r20 = r7
            r22 = r0
            r23 = r5
            r24 = r9
            r26 = r6
            r19.<init>(r20, r22, r23, r24, r26)
            r19 = r12
            r19.<init>(r20, r22, r23, r24, r26, r27, r28)
            r12.mo9225i()
        L_0x060e:
            vk1.b r0 = r4.f166842f
            if (r0 != 0) goto L_0x0613
            goto L_0x0616
        L_0x0613:
            r0.setMiniWinPermission(r13)
        L_0x0616:
            j50.a r0 = r4.f166844h
            if (r0 == 0) goto L_0x061f
            r0.mo85693l0()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x061f:
            vk1.b r0 = r4.f166842f
            if (r0 == 0) goto L_0x0867
            r0.finish()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x062a:
            if (r2 == 0) goto L_0x0633
            java.lang.String r5 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            boolean r5 = r2.getBoolean(r5)
            goto L_0x0634
        L_0x0633:
            r5 = 0
        L_0x0634:
            java.lang.String r8 = r4.f170243j
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "checkFinderObject id:"
            r9.append(r10)
            androidx.lifecycle.i0 r10 = r4.mo83051g(r3)
            cl1.o r10 = (cl1.C54991o) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f154341n
            if (r10 == 0) goto L_0x0651
            long r14 = r10.f164794id
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            goto L_0x0652
        L_0x0651:
            r10 = 0
        L_0x0652:
            r9.append(r10)
            java.lang.String r10 = ", nonceId:"
            r9.append(r10)
            androidx.lifecycle.i0 r10 = r4.mo83051g(r6)
            cl1.u r10 = (cl1.C55001u) r10
            java.lang.String r10 = r10.f154423t
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            androidx.lifecycle.i0 r8 = r4.mo83051g(r3)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
            r9 = 0
            if (r8 == 0) goto L_0x068d
            androidx.lifecycle.i0 r8 = r4.mo83051g(r3)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
            if (r8 == 0) goto L_0x068a
            long r14 = r8.f164794id
            int r8 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x068a
            r8 = 1
            goto L_0x068b
        L_0x068a:
            r8 = 0
        L_0x068b:
            if (r8 == 0) goto L_0x0718
        L_0x068d:
            androidx.lifecycle.i0 r8 = r4.mo83051g(r6)
            cl1.u r8 = (cl1.C55001u) r8
            java.lang.String r8 = r8.f154423t
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0718
            te3.hj1 r8 = new te3.hj1
            r8.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r12.getClass()
            al1.i r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r12 == 0) goto L_0x06b0
            al1.l r14 = r12.f151988c
            if (r14 == 0) goto L_0x06b0
            int r14 = r14.f152031k
            goto L_0x06b1
        L_0x06b0:
            r14 = 0
        L_0x06b1:
            r8.f134677n = r14
            if (r12 == 0) goto L_0x06bc
            al1.l r12 = r12.f151988c
            if (r12 == 0) goto L_0x06bc
            int r12 = r12.f152031k
            goto L_0x06bd
        L_0x06bc:
            r12 = 0
        L_0x06bd:
            r8.f134675i = r12
            java.lang.Class<tf0.p1> r12 = tf0.C64916p1.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            java.lang.String r14 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r12, r14)
            r19 = r12
            tf0.p1 r19 = (tf0.C64916p1) r19
            androidx.appcompat.app.AppCompatActivity r12 = r4.f166841e
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r12, r14)
            r20 = r12
            com.tencent.mm.ui.MMActivity r20 = (com.tencent.p014mm.p136ui.MMActivity) r20
            androidx.lifecycle.i0 r12 = r4.mo83051g(r6)
            cl1.u r12 = (cl1.C55001u) r12
            long r14 = r12.f154416j
            r21 = r14
            androidx.lifecycle.i0 r12 = r4.mo83051g(r6)
            cl1.u r12 = (cl1.C55001u) r12
            java.lang.String r12 = r12.f154423t
            r23 = r12
            r24 = 0
            r25 = 2
            r27 = 1
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            gl1.j r12 = new gl1.j
            r39 = r12
            r12.<init>(r4)
            r40 = 114560(0x1bf80, float:1.60533E-40)
            r41 = 0
            java.lang.String r26 = ""
            r36 = r8
            tf0.C64916p1.C64917a.m76436c(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x0718:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8.mo77647u()
            androidx.lifecycle.i0 r12 = r4.mo83051g(r6)
            cl1.u r12 = (cl1.C55001u) r12
            te3.c21 r12 = r12.f154420q
            long r14 = r12.f182392d
            r8.mo77639m(r9, r14)
            j50.a r9 = r4.f166844h
            if (r9 == 0) goto L_0x0731
            r9.mo75212E()
        L_0x0731:
            qj1.a6 r9 = r4.f170249r
            if (r9 == 0) goto L_0x073d
            int r9 = r9.mo14483f0()
            if (r9 != 0) goto L_0x073d
            r9 = 1
            goto L_0x073e
        L_0x073d:
            r9 = 0
        L_0x073e:
            if (r9 == 0) goto L_0x074c
            com.tencent.mm.sdk.platformtools.MTimerHandler r9 = r4.f170242i1
            r9.stopTimer()
            com.tencent.mm.sdk.platformtools.MTimerHandler r9 = r4.f170242i1
            r14 = 1000(0x3e8, double:4.94E-321)
            r9.startTimer(r14)
        L_0x074c:
            sl1.c r9 = r4.f170211M
            if (r9 == 0) goto L_0x075a
            sl1.d r10 = new sl1.d
            r10.<init>(r9)
            o40.C61926c.m72668M(r10)
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x075a:
            xs1.d r9 = r4.f170213P
            if (r9 == 0) goto L_0x076f
            boolean r10 = r9.mo90514a1()
            if (r10 == 0) goto L_0x0765
            goto L_0x076d
        L_0x0765:
            xs1.c r10 = new xs1.c
            r10.<init>(r9)
            o40.C61926c.m72668M(r10)
        L_0x076d:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x076f:
            qj1.ea r9 = r4.f170258y0
            if (r9 == 0) goto L_0x0778
            r9.mo87760d1()
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x0778:
            java.lang.Class<cl1.h1> r9 = cl1.C54979h1.class
            androidx.lifecycle.i0 r9 = r4.mo83051g(r9)
            cl1.h1 r9 = (cl1.C54979h1) r9
            boolean r9 = r9.f154134f
            if (r9 == 0) goto L_0x07df
            qj1.l0 r9 = r4.f170247p0
            if (r9 == 0) goto L_0x078b
            r9.mo12142b1()
        L_0x078b:
            r8.getClass()
            cj1.n5 r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
            if (r8 == 0) goto L_0x07df
            androidx.appcompat.app.AppCompatActivity r9 = r4.f166841e
            java.lang.String r10 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r9, r10)
            r20 = r9
            com.tencent.mm.ui.MMActivity r20 = (com.tencent.p014mm.p136ui.MMActivity) r20
            androidx.lifecycle.i0 r9 = r4.mo83051g(r6)
            cl1.u r9 = (cl1.C55001u) r9
            te3.c21 r9 = r9.f154420q
            long r9 = r9.f182392d
            androidx.lifecycle.i0 r12 = r4.mo83051g(r6)
            cl1.u r12 = (cl1.C55001u) r12
            long r14 = r12.f154416j
            zc1.b r12 = zc1.C66785b.f191882e
            java.lang.String r25 = r12.mo90662O5()
            androidx.lifecycle.i0 r6 = r4.mo83051g(r6)
            cl1.u r6 = (cl1.C55001u) r6
            byte[] r6 = r6.f154417n
            r27 = 0
            r28 = 1
            androidx.lifecycle.i0 r12 = r4.mo83051g(r3)
            cl1.o r12 = (cl1.C54991o) r12
            java.lang.String r12 = r12.f154357q3
            gl1.j2 r11 = new gl1.j2
            r11.<init>(r4)
            r19 = r8
            cj1.t r19 = (cj1.C54820t) r19
            r21 = r9
            r23 = r14
            r26 = r6
            r29 = r12
            r30 = r11
            r19.mo75746n(r20, r21, r23, r25, r26, r27, r28, r29, r30)
        L_0x07df:
            di3.d r6 = di3.C86312j.m106911c(r7)
            ak1.o r6 = (ak1.C54108o) r6
            r6.getClass()
            ak1.f0 r6 = ak1.C54108o.f151869h
            boolean r6 = r6.f151446a0
            if (r6 != 0) goto L_0x0825
            di3.d r6 = di3.C86312j.m106911c(r7)
            java.lang.String r8 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r6, r8)
            r19 = r6
            ht1.j5 r19 = (ht1.C8777j5) r19
            r20 = 4
            r6 = 2
            java.lang.String r22 = java.lang.String.valueOf(r6)
            r23 = 0
            r24 = 4
            r25 = 0
            ht1.C8777j5.C8778a.m8600a(r19, r20, r22, r23, r24, r25)
            di3.d r6 = di3.C86312j.m106911c(r7)
            java.lang.String r7 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r6, r7)
            r19 = r6
            ht1.j5 r19 = (ht1.C8777j5) r19
            ak1.g0 r20 = ak1.C0073g0.LIVE_ANCHOR_ACTION_BEGIN
            java.lang.String r21 = ""
            r22 = 0
            r23 = 4
            r24 = 0
            ht1.C8777j5.C8778a.m8605f(r19, r20, r21, r22, r23, r24)
        L_0x0825:
            androidx.lifecycle.i0 r0 = r4.mo83051g(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 == 0) goto L_0x084c
            ii1.e r6 = r4.f170233Z0
            if (r6 == 0) goto L_0x083a
            java.lang.String r0 = r0.f151997a
            r6.mo85280d1(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x083a:
            qj1.o2 r0 = r4.f170250s
            if (r0 == 0) goto L_0x0843
            r0.mo87850a1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0843:
            qj1.o2 r0 = r4.f170250s
            if (r0 == 0) goto L_0x084c
            r0.mo87851b1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x084c:
            java.lang.String r0 = r4.f170243j
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "START_LIVE byMiniWin:"
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0867
        L_0x0865:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0867:
            gl1.g r0 = r42.getLiveEndUIC()
            r0.getClass()
            int r1 = r43.ordinal()
            r4 = 24
            if (r1 == r4) goto L_0x09b0
            r4 = 117(0x75, float:1.64E-43)
            if (r1 == r4) goto L_0x099a
            r4 = 132(0x84, float:1.85E-43)
            if (r1 == r4) goto L_0x099a
            r4 = 26
            if (r1 == r4) goto L_0x09b0
            r4 = 27
            if (r1 == r4) goto L_0x0888
            goto L_0x0a04
        L_0x0888:
            vk1.b r1 = r0.f166842f
            if (r1 != 0) goto L_0x088d
            goto L_0x0890
        L_0x088d:
            r1.setMiniWinPermission(r13)
        L_0x0890:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin r1 = r0.f170181n
            if (r1 == 0) goto L_0x0897
            r1.mo3204e1()
        L_0x0897:
            if (r2 == 0) goto L_0x08a0
            java.lang.String r1 = "PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL"
            boolean r1 = r2.getBoolean(r1)
            goto L_0x08a1
        L_0x08a0:
            r1 = 0
        L_0x08a1:
            java.lang.String r4 = r0.f170180j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "finish live is manual finish:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", liveData.business(LiveCommonSlice::class.java).externalPost:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r0.mo83051g(r3)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.f154301c3
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            androidx.lifecycle.i0 r3 = r0.mo83051g(r3)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.f154301c3
            if (r3 == 0) goto L_0x092a
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            cj1.n5 r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
            if (r2 == 0) goto L_0x0901
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin r3 = r0.f170181n
            if (r3 == 0) goto L_0x08e1
            d60.b r3 = r3.f177936g
            goto L_0x08e2
        L_0x08e1:
            r3 = 0
        L_0x08e2:
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r4 == 0) goto L_0x08ea
            r12 = r3
            com.tencent.mm.plugin.finder.live.view.b r12 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r12
            goto L_0x08eb
        L_0x08ea:
            r12 = 0
        L_0x08eb:
            if (r12 == 0) goto L_0x08f4
            com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r3 = r12.getActivityScope()
            if (r3 == 0) goto L_0x08f4
            goto L_0x08f6
        L_0x08f4:
            a14.s1 r3 = a14.C0001s1.f0d
        L_0x08f6:
            gl1.c r4 = new gl1.c
            r4.<init>(r0)
            cj1.t r2 = (cj1.C54820t) r2
            r5 = 1
            r2.mo75751s(r3, r5, r4)
        L_0x0901:
            r0.mo84601j()
            cj1.r0 r2 = cj1.C54804r0.f153631a
            androidx.appcompat.app.AppCompatActivity r3 = r0.f166841e
            fj1.b r4 = r0.f166851d
            r5 = 2
            r2.mo75762c(r3, r4, r5)
            ok1.e r2 = ok1.C62042e.f176370a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.mo87106p0()
            java.lang.String r3 = "live_status_flag"
            r2.putInt(r3, r13)
            r1.mo77646t()
            j50.a r0 = r0.f166844h
            if (r0 == 0) goto L_0x0a04
            gl1.f r1 = new gl1.f
            r1.<init>()
            r0.mo85676R(r1)
            goto L_0x0a04
        L_0x092a:
            if (r2 == 0) goto L_0x0932
            java.lang.String r3 = "PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE"
            boolean r13 = r2.getBoolean(r3, r13)
        L_0x0932:
            if (r13 == 0) goto L_0x0962
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            cj1.n5 r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
            if (r2 == 0) goto L_0x0962
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin r3 = r0.f170181n
            if (r3 == 0) goto L_0x0944
            d60.b r3 = r3.f177936g
            goto L_0x0945
        L_0x0944:
            r3 = 0
        L_0x0945:
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r4 == 0) goto L_0x094c
            com.tencent.mm.plugin.finder.live.view.b r3 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r3
            goto L_0x094d
        L_0x094c:
            r3 = 0
        L_0x094d:
            if (r3 == 0) goto L_0x0956
            com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r3 = r3.getActivityScope()
            if (r3 == 0) goto L_0x0956
            goto L_0x0958
        L_0x0956:
            a14.s1 r3 = a14.C0001s1.f0d
        L_0x0958:
            gl1.e r4 = new gl1.e
            r4.<init>(r0)
            cj1.t r2 = (cj1.C54820t) r2
            r2.mo75751s(r3, r1, r4)
        L_0x0962:
            if (r13 == 0) goto L_0x0967
            r0.mo84601j()
        L_0x0967:
            cj1.r0 r1 = cj1.C54804r0.f153631a
            androidx.appcompat.app.AppCompatActivity r2 = r0.f166841e
            fj1.b r3 = r0.f166851d
            r4 = 2
            r1.mo75762c(r2, r3, r4)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.mo77646t()
            if (r13 != 0) goto L_0x0982
            vk1.b r1 = r0.f166842f
            if (r1 == 0) goto L_0x0982
            d60.b$b r2 = d60.C58124b.C58125b.QUIT_LIVE
            r3 = 0
            d60.C58124b.C7172a.m7372a(r1, r2, r3, r4, r3)
        L_0x0982:
            java.lang.String r0 = r0.f170180j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "close secondary live,realCloseLive = "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0a04
        L_0x099a:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin r1 = r0.f170181n
            if (r1 == 0) goto L_0x09a3
            r2 = 8
            r1.mo10792g(r2)
        L_0x09a3:
            j50.a r0 = r0.f166844h
            if (r0 == 0) goto L_0x0a04
            gl1.f r1 = new gl1.f
            r1.<init>()
            r0.mo85676R(r1)
            goto L_0x0a04
        L_0x09b0:
            r3 = 0
            androidx.appcompat.app.AppCompatActivity r1 = r0.f166841e
            boolean r2 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x09ba
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            goto L_0x09bb
        L_0x09ba:
            r1 = r3
        L_0x09bb:
            if (r1 == 0) goto L_0x09c6
            boolean r1 = r1.isFinishing()
            r2 = 1
            if (r1 != r2) goto L_0x09c6
            r5 = 1
            goto L_0x09c7
        L_0x09c6:
            r5 = 0
        L_0x09c7:
            if (r5 != 0) goto L_0x09e2
            androidx.appcompat.app.AppCompatActivity r1 = r0.f166841e
            boolean r2 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x09d3
            r12 = r1
            com.tencent.mm.ui.MMActivity r12 = (com.tencent.p014mm.p136ui.MMActivity) r12
            goto L_0x09d4
        L_0x09d3:
            r12 = r3
        L_0x09d4:
            if (r12 == 0) goto L_0x09df
            boolean r1 = r12.isDestroyed()
            r2 = 1
            if (r1 != r2) goto L_0x09df
            r11 = 1
            goto L_0x09e0
        L_0x09df:
            r11 = 0
        L_0x09e0:
            if (r11 == 0) goto L_0x0a04
        L_0x09e2:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3 = 0
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = 0
            r7 = 22
            r8 = 0
            java.lang.String r2 = "secEnd"
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63767I(r1, r2, r3, r4, r5, r6, r7, r8)
            j50.a r1 = r0.f166844h
            if (r1 == 0) goto L_0x09f8
            r1.mo85693l0()
        L_0x09f8:
            j50.a r0 = r0.f166844h
            if (r0 == 0) goto L_0x0a04
            gl1.f r1 = new gl1.f
            r1.<init>()
            r0.mo85676R(r1)
        L_0x0a04:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56074k.statusChange(d60.b$b, android.os.Bundle):void");
    }

    public void stop() {
        super.stop();
        getLiveStartUIC().mo84605k();
    }
}
