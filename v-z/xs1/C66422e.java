package xs1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import d60.C58124b;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C51215sa1;
import te3.C52172yv;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: xs1.e */
public final class C66422e implements C66417a {

    /* renamed from: d */
    public final Context f191167d;

    /* renamed from: e */
    public final C45795b f191168e;

    /* renamed from: f */
    public final C58124b f191169f;

    /* renamed from: g */
    public final String f191170g = "FinderLiveVoteBubblePresenter";

    /* renamed from: h */
    public C66418b f191171h;

    /* renamed from: i */
    public final String f191172i = "vote_bubble_close_tag";

    /* renamed from: j */
    public final Runnable f191173j = new C66423a(this);

    /* renamed from: n */
    public boolean f191174n;

    /* renamed from: xs1.e$a */
    public static final class C66423a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66422e f191175d;

        public C66423a(C66422e eVar) {
            this.f191175d = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
            if (((cl1.C54991o) r2.f191168e.mo71262a(r0)).f154275W3 != null) goto L_0x0054;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                xs1.e r1 = r7.f191175d
                com.tencent.mm.plugin.finder.live.view.b r1 = r1.mo90517e()
                if (r1 == 0) goto L_0x006a
                xs1.e r2 = r7.f191175d
                boolean r1 = r1.isDestroyed()
                r3 = 0
                r4 = 0
                if (r1 != 0) goto L_0x0054
                fj1.b r1 = r2.f191168e
                androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                cl1.o r1 = (cl1.C54991o) r1
                te3.sa1 r1 = r1.f154275W3
                r5 = 1
                if (r1 == 0) goto L_0x0028
                int r1 = r1.f141392h
                r6 = 3
                if (r1 != r6) goto L_0x0028
                r1 = 1
                goto L_0x0029
            L_0x0028:
                r1 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x004c
                fj1.b r1 = r2.f191168e
                androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                cl1.o r1 = (cl1.C54991o) r1
                te3.sa1 r1 = r1.f154275W3
                if (r1 == 0) goto L_0x003d
                int r1 = r1.f141392h
                r6 = 4
                if (r1 != r6) goto L_0x003d
                goto L_0x003e
            L_0x003d:
                r5 = 0
            L_0x003e:
                if (r5 != 0) goto L_0x004c
                fj1.b r1 = r2.f191168e
                androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                cl1.o r1 = (cl1.C54991o) r1
                te3.sa1 r1 = r1.f154275W3
                if (r1 != 0) goto L_0x0054
            L_0x004c:
                d60.b r1 = r2.f191169f
                d60.b$b r5 = d60.C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_HIDE
                r6 = 2
                d60.C58124b.C7172a.m7372a(r1, r5, r3, r6, r3)
            L_0x0054:
                java.lang.String r1 = r2.f191170g
                java.lang.String r5 = "voteInfo clear"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
                fj1.b r1 = r2.f191168e
                androidx.lifecycle.i0 r0 = r1.mo71262a(r0)
                cl1.o r0 = (cl1.C54991o) r0
                r0.f154275W3 = r3
                r0.f154280X3 = r4
                r0.f154285Y3 = r4
            L_0x006a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xs1.C66422e.C66423a.run():void");
        }
    }

    /* renamed from: xs1.e$b */
    public static final class C66424b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C51215sa1 f191176d;

        /* renamed from: e */
        public final /* synthetic */ C66422e f191177e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66424b(C51215sa1 sa12, C66422e eVar) {
            super(0);
            this.f191176d = sa12;
            this.f191177e = eVar;
        }

        public Object invoke() {
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            Class cls = C54991o.class;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC;
            C51215sa1 sa12 = this.f191176d;
            if (sa12.f141391g <= 0 || (i = sa12.f141392h) == 3 || i == 4) {
                C66422e eVar = this.f191177e;
                eVar.getClass();
                boolean z4 = false;
                String str = "";
                if (C62042e.f176370a.mo87027N0() || ((C54991o) eVar.f191168e.mo71262a(cls)).f154190D) {
                    if (this.f191176d.f141397p > 0) {
                        C58124b.C7172a.m7372a(this.f191177e.f191169f, C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_SHOW, (Bundle) null, 2, (Object) null);
                        C66422e eVar2 = this.f191177e;
                        C66418b bVar = eVar2.f191171h;
                        if (bVar != null) {
                            bVar.mo90511N(new C66429f(eVar2));
                        }
                        if (!C87412m.m108589b(this.f191176d.f141393i, C86709a0.m107535s().mo121142i().mo119675I(aVar, str))) {
                            C56032b e = this.f191177e.mo90517e();
                            if (e != null) {
                                C11207i.m11070f(e, (C66212f) null, (C53934p0) null, new C66430g(this.f191177e, (C15601d<? super C66430g>) null), 3, (Object) null);
                            }
                            C85801v1 i2 = C86709a0.m107535s().mo121142i();
                            String str2 = this.f191176d.f141393i;
                            if (str2 != null) {
                                str = str2;
                            }
                            i2.mo119677K(aVar, str);
                        }
                        C51215sa1 sa13 = ((C54991o) this.f191177e.f191168e.mo71262a(cls)).f154275W3;
                        int intValue = sa13 != null ? sa13.f141397p : C32444a.f86053F0.mo60266n().intValue();
                        ((C119157j) C119157j.f356862d).mo183894y(this.f191177e.f191172i);
                        C119179t tVar = C119157j.f356862d;
                        C66422e eVar3 = this.f191177e;
                        ((C119157j) tVar).mo183879j(eVar3.f191173j, ((long) intValue) * 1000, eVar3.f191172i);
                    } else {
                        C66422e eVar4 = this.f191177e;
                        C58124b.C7172a.m7372a(eVar4.f191169f, C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_HIDE, (Bundle) null, 2, (Object) null);
                        C54991o oVar = (C54991o) eVar4.f191168e.mo71262a(cls);
                        oVar.f154275W3 = null;
                        oVar.f154280X3 = false;
                        oVar.f154285Y3 = false;
                    }
                    ((C54991o) this.f191177e.f191168e.mo71262a(cls)).f154280X3 = false;
                } else {
                    String str3 = this.f191177e.f191170g;
                    StringBuilder sb = new StringBuilder();
                    sb.append("visitor resume show vote, choiceListHaveChoice: ");
                    LinkedList<C52172yv> linkedList = this.f191176d.f141390f;
                    C87412m.m108593f(linkedList, "data.choice_list");
                    if (!linkedList.isEmpty()) {
                        Iterator<T> it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((C52172yv) it.next()).f145529f == 1) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    sb.append(z);
                    Log.m105924i(str3, sb.toString());
                    if (!C87412m.m108589b(this.f191176d.f141393i, C86709a0.m107535s().mo121142i().mo119675I(aVar, str))) {
                        LinkedList<C52172yv> linkedList2 = this.f191176d.f141390f;
                        C87412m.m108593f(linkedList2, "data.choice_list");
                        if (!linkedList2.isEmpty()) {
                            Iterator<T> it4 = linkedList2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((C52172yv) it4.next()).f145529f == 1) {
                                        z2 = true;
                                        continue;
                                    } else {
                                        z2 = false;
                                        continue;
                                    }
                                    if (z2) {
                                        z4 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (z4) {
                            C85801v1 i3 = C86709a0.m107535s().mo121142i();
                            String str4 = this.f191176d.f141393i;
                            if (str4 != null) {
                                str = str4;
                            }
                            i3.mo119677K(aVar, str);
                            C66422e eVar5 = this.f191177e;
                            eVar5.f191174n = true;
                            Log.m105924i(eVar5.f191170g, "visitor resume show card");
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xs1.e$c */
    public static final class C66425c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66422e f191178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66425c(C66422e eVar) {
            super(0);
            this.f191178d = eVar;
        }

        public Object invoke() {
            int i;
            Log.m105924i(this.f191178d.f191170g, "forceUpdateBubble");
            C51215sa1 sa12 = ((C54991o) this.f191178d.f191168e.mo71262a(C54991o.class)).f154275W3;
            if (sa12 == null) {
                Log.m105924i(this.f191178d.f191170g, "update wording votingInfo is null");
                C58124b.C7172a.m7372a(this.f191178d.f191169f, C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_HIDE, (Bundle) null, 2, (Object) null);
            } else if (sa12.f141391g < 0 || !((i = sa12.f141392h) == 1 || i == 1)) {
                C66422e eVar = this.f191178d;
                C66418b bVar = eVar.f191171h;
                if (bVar != null) {
                    bVar.mo90511N(new C66437l(eVar));
                }
            } else {
                C66422e eVar2 = this.f191178d;
                C66418b bVar2 = eVar2.f191171h;
                if (bVar2 != null) {
                    bVar2.mo90510A0(new C66436k(eVar2));
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.vote.plugin.FinderLiveVoteBubblePresenter$updateHelpShowBubble$1", mo125469f = "FinderLiveVoteBubblePresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: xs1.e$d */
    public static final class C66426d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C66422e f191179d;

        /* renamed from: xs1.e$d$a */
        public static final class C66427a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C66422e f191180d;

            public C66427a(C66422e eVar) {
                this.f191180d = eVar;
            }

            public final void run() {
                C58124b.C7172a.m7372a(this.f191180d.f191169f, C58124b.C58125b.FINDER_LIVE_VOTING_SHOW, (Bundle) null, 2, (Object) null);
                C54991o oVar = (C54991o) this.f191180d.f191168e.mo71262a(C54991o.class);
                oVar.f154275W3 = null;
                oVar.f154280X3 = false;
                oVar.f154285Y3 = false;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66426d(C66422e eVar, C15601d<? super C66426d> dVar) {
            super(2, dVar);
            this.f191179d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66426d(this.f191179d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66426d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15883o oVar;
            ViewGroup viewGroup;
            ResultKt.throwOnFailure(obj);
            C56032b e = this.f191179d.mo90517e();
            if (!(e == null || (oVar = (C15883o) e.getPlugin(C15883o.class)) == null || (viewGroup = oVar.f166287d) == null)) {
                viewGroup.postDelayed(new C66427a(this.f191179d), 2000);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xs1.e$e */
    public static final class C66428e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66422e f191181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66428e(C66422e eVar) {
            super(0);
            this.f191181d = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
            if (r8 != false) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
            r7 = (r7 = (xs1.C15883o) r7.getPlugin(r3)).f166287d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r17 = this;
                r0 = r17
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                xs1.e r2 = r0.f191181d
                java.lang.String r2 = r2.f191170g
                java.lang.String r3 = "updateStatus"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                xs1.e r2 = r0.f191181d
                fj1.b r2 = r2.f191168e
                androidx.lifecycle.i0 r2 = r2.mo71262a(r1)
                cl1.o r2 = (cl1.C54991o) r2
                boolean r2 = r2.f154280X3
                if (r2 == 0) goto L_0x0138
                xs1.e r2 = r0.f191181d
                java.lang.Class<xs1.o> r3 = xs1.C15883o.class
                fj1.b r4 = r2.f191168e
                androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
                cl1.o r4 = (cl1.C54991o) r4
                te3.sa1 r4 = r4.f154275W3
                r5 = 2
                r6 = 0
                if (r4 != 0) goto L_0x003f
                java.lang.String r1 = r2.f191170g
                java.lang.String r3 = "update votingInfo is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                d60.b r1 = r2.f191169f
                d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_HIDE
                d60.C58124b.C7172a.m7372a(r1, r2, r6, r5, r6)
                goto L_0x0138
            L_0x003f:
                com.tencent.mm.plugin.finder.live.view.b r7 = r2.mo90517e()
                r8 = 1
                r9 = 0
                if (r7 == 0) goto L_0x005b
                qj1.c r7 = r7.getPlugin(r3)
                xs1.o r7 = (xs1.C15883o) r7
                if (r7 == 0) goto L_0x005b
                android.view.ViewGroup r7 = r7.f166287d
                if (r7 == 0) goto L_0x005b
                int r7 = r7.getVisibility()
                if (r7 != 0) goto L_0x005b
                r7 = 1
                goto L_0x005c
            L_0x005b:
                r7 = 0
            L_0x005c:
                if (r7 == 0) goto L_0x006f
                com.tencent.mm.plugin.finder.live.view.b r7 = r2.mo90517e()
                if (r7 == 0) goto L_0x006f
                qj1.c r3 = r7.getPlugin(r3)
                xs1.o r3 = (xs1.C15883o) r3
                if (r3 == 0) goto L_0x006f
                r3.mo14533a1()
            L_0x006f:
                int r3 = r4.f141391g
                if (r3 < 0) goto L_0x0098
                int r3 = r4.f141392h
                if (r3 == r8) goto L_0x0079
                if (r3 != r8) goto L_0x0098
            L_0x0079:
                xs1.b r3 = r2.f191171h
                if (r3 == 0) goto L_0x0085
                xs1.h r4 = new xs1.h
                r4.<init>(r2)
                r3.mo90510A0(r4)
            L_0x0085:
                d60.b r3 = r2.f191169f
                d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_SHOW
                d60.C58124b.C7172a.m7372a(r3, r4, r6, r5, r6)
                fj1.b r2 = r2.f191168e
                androidx.lifecycle.i0 r1 = r2.mo71262a(r1)
                cl1.o r1 = (cl1.C54991o) r1
                r1.f154280X3 = r8
                goto L_0x0138
            L_0x0098:
                xs1.b r3 = r2.f191171h
                if (r3 == 0) goto L_0x00a4
                xs1.i r5 = new xs1.i
                r5.<init>(r2)
                r3.mo90511N(r5)
            L_0x00a4:
                java.lang.String r3 = r4.f141393i
                f40.o r5 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r5 = r5.mo121142i()
                com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC
                java.lang.String r10 = ""
                java.lang.String r5 = r5.mo119675I(r7, r10)
                boolean r3 = gy3.C87412m.m108589b(r3, r5)
                if (r3 != 0) goto L_0x00fd
                int r3 = r4.f141399r
                if (r3 == 0) goto L_0x00d8
                ok1.e r3 = ok1.C62042e.f176370a
                boolean r3 = r3.mo87027N0()
                if (r3 != 0) goto L_0x00d6
                fj1.b r3 = r2.f191168e
                androidx.lifecycle.i0 r3 = r3.mo71262a(r1)
                cl1.o r3 = (cl1.C54991o) r3
                boolean r3 = r3.f154190D
                if (r3 == 0) goto L_0x00d5
                goto L_0x00d6
            L_0x00d5:
                r8 = 0
            L_0x00d6:
                if (r8 == 0) goto L_0x00fd
            L_0x00d8:
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                java.lang.String r4 = r4.f141393i
                if (r4 != 0) goto L_0x00e5
                goto L_0x00e6
            L_0x00e5:
                r10 = r4
            L_0x00e6:
                r3.mo119677K(r7, r10)
                com.tencent.mm.plugin.finder.live.view.b r11 = r2.mo90517e()
                if (r11 == 0) goto L_0x012e
                r12 = 0
                r13 = 0
                xs1.j r14 = new xs1.j
                r14.<init>(r2, r6)
                r15 = 3
                r16 = 0
                nk1.C11207i.m11070f(r11, r12, r13, r14, r15, r16)
                goto L_0x012e
            L_0x00fd:
                fj1.b r3 = r2.f191168e
                androidx.lifecycle.i0 r3 = r3.mo71262a(r1)
                cl1.o r3 = (cl1.C54991o) r3
                te3.sa1 r3 = r3.f154275W3
                if (r3 == 0) goto L_0x010c
                int r3 = r3.f141397p
                goto L_0x010d
            L_0x010c:
                r3 = 0
            L_0x010d:
                zt3.t r4 = zt3.C119157j.f356862d
                java.lang.String r5 = r2.f191172i
                zt3.j r4 = (zt3.C119157j) r4
                r4.mo183894y(r5)
                zt3.t r4 = zt3.C119157j.f356862d
                java.lang.Runnable r5 = r2.f191173j
                long r6 = (long) r3
                r10 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 * r10
                java.lang.String r3 = r2.f191172i
                zt3.j r4 = (zt3.C119157j) r4
                r4.mo183879j(r5, r6, r3)
                java.lang.String r3 = r2.f191170g
                java.lang.String r4 = "voteInfo clear task execute"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            L_0x012e:
                fj1.b r2 = r2.f191168e
                androidx.lifecycle.i0 r1 = r2.mo71262a(r1)
                cl1.o r1 = (cl1.C54991o) r1
                r1.f154280X3 = r9
            L_0x0138:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: xs1.C66422e.C66428e.invoke():java.lang.Object");
        }
    }

    public C66422e(Context context, C45795b bVar, C58124b bVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f191167d = context;
        this.f191168e = bVar;
        this.f191169f = bVar2;
    }

    /* renamed from: Z0 */
    public void mo90505Z0() {
        C51215sa1 sa12 = ((C54991o) this.f191168e.mo71262a(C54991o.class)).f154275W3;
        if (sa12 == null) {
            Log.m105924i(this.f191170g, "resume votingInfo is null");
            C58124b.C7172a.m7372a(this.f191169f, C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_HIDE, (Bundle) null, 2, (Object) null);
            return;
        }
        C61926c.m72668M(new C66424b(sa12, this));
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [xs1.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90506b() {
        /*
            r17 = this;
            r0 = r17
            d60.b r1 = r0.f191169f
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_VOTING_SHOW
            r3 = 0
            r4 = 2
            d60.C58124b.C7172a.m7372a(r1, r2, r3, r4, r3)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "type"
            r1.put(r2, r4)
            fj1.b r2 = r0.f191168e
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r5)
            cl1.o r2 = (cl1.C54991o) r2
            te3.sa1 r2 = r2.f154275W3
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = r2.f141393i
            goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            java.lang.String r5 = "vote_id"
            r1.put(r5, r2)
            xs1.b r2 = r0.f191171h
            boolean r5 = r2 instanceof og1.C62008a
            if (r5 == 0) goto L_0x0037
            r3 = r2
            og1.a r3 = (og1.C62008a) r3
        L_0x0037:
            r2 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004a
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r3 = r3.f176277f
            if (r3 == 0) goto L_0x0045
            int r3 = r3.f159272i
            if (r3 != r4) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r3 != r5) goto L_0x004a
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r4 = 1
        L_0x004f:
            if (r4 == 0) goto L_0x0057
            java.lang.String r3 = "ui_type"
            r1.put(r3, r4)
        L_0x0057:
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "json.toString()"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            java.lang.String r7 = z04.C112551y.m153814n(r1, r3, r4, r2)
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r5 = r1
            ak1.w r5 = (ak1.C54116w) r5
            ak1.f0$o0 r6 = ak1.C54067f0.C54076o0.LIVE_VOTE
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 252(0xfc, float:3.53E-43)
            r16 = 0
            ak1.C54116w.Ex0(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xs1.C66422e.mo90506b():void");
    }

    /* renamed from: d */
    public void mo90507d() {
        C61926c.m72668M(new C66428e(this));
    }

    /* renamed from: e */
    public final C56032b mo90517e() {
        C58124b bVar = this.f191169f;
        if (bVar instanceof C56032b) {
            return (C56032b) bVar;
        }
        return null;
    }

    /* renamed from: h1 */
    public void mo90508h1() {
        if (this.f191174n && ((C54991o) this.f191168e.mo71262a(C54991o.class)).f154275W3 != null) {
            this.f191174n = false;
            Log.m105924i(this.f191170g, "updateHelpShowBubble");
            C56032b e = mo90517e();
            if (e != null) {
                C11207i.m11070f(e, (C66212f) null, (C53934p0) null, new C66426d(this, (C15601d<? super C66426d>) null), 3, (Object) null);
            }
        }
    }

    public void onAttach(Object obj) {
        C66418b bVar = (C66418b) obj;
        C87412m.m108594g(bVar, "callback");
        Log.m105924i(this.f191170g, "onAttach");
        this.f191171h = bVar;
        bVar.mo90512a();
    }

    public void onDetach() {
        Log.m105924i(this.f191170g, "onDetach");
        C66418b bVar = this.f191171h;
        if (bVar != null) {
            bVar.reset();
        }
        this.f191171h = null;
        ((C119157j) C119157j.f356862d).mo183894y(this.f191172i);
        Log.m105924i(this.f191170g, "voteInfo clear task remove");
    }

    /* renamed from: v1 */
    public void mo90509v1() {
        C61926c.m72668M(new C66425c(this));
    }
}
