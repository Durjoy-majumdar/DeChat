package fl1;

import al1.C54127h;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.appcompat.app.AppCompatActivity;
import b50.C54410e;
import c50.C54655b;
import cj1.C54795n5;
import cj1.C54843w3;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedLiveLifeEvent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import eb0.C31543z5;
import er1.C58704c5;
import er1.C58713e5;
import er1.C58728f5;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32230s;
import gh1.C59447j;
import gy3.C87412m;
import gy3.C87413o;
import k50.C60971a;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import pe3.C89349b;
import qg1.C47826f;
import qj1.C62815i3;
import rx3.C13598b0;
import te3.C50262lh0;
import te3.C50415mk1;
import te3.C52005xq0;
import te3.C64273c21;
import vk1.C65760a;

/* renamed from: fl1.m */
public final class C59206m implements C54410e {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169345d;

    /* renamed from: e */
    public final /* synthetic */ C52005xq0 f169346e;

    /* renamed from: fl1.m$b */
    public static final class C32070b extends C87413o implements C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59161f f85319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32070b(C59161f fVar) {
            super(5);
            this.f85319d = fVar;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            C50262lh0 lh02 = (C50262lh0) obj5;
            C87412m.m108594g((String) obj4, "errMsg");
            String str = this.f85319d.f169228i;
            Log.m105924i(str, "close live result:" + booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fl1.m$a */
    public static final class C59207a implements C47826f.C47827a {

        /* renamed from: a */
        public final /* synthetic */ C59161f f169347a;

        /* renamed from: b */
        public final /* synthetic */ C52005xq0 f169348b;

        /* renamed from: fl1.m$a$a */
        public static final class C59208a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59161f f169349d;

            /* renamed from: e */
            public final /* synthetic */ String f169350e;

            /* renamed from: f */
            public final /* synthetic */ int f169351f;

            /* renamed from: g */
            public final /* synthetic */ int f169352g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59208a(C59161f fVar, String str, int i, int i2) {
                super(0);
                this.f169349d = fVar;
                this.f169350e = str;
                this.f169351f = i;
                this.f169352g = i2;
            }

            public Object invoke() {
                AppCompatActivity appCompatActivity = this.f169349d.f166836e;
                String str = this.f169350e;
                if (str == null) {
                    str = appCompatActivity.getResources().getString(C0966R.string.d0q);
                    C87412m.m108593f(str, "context.resources.getStr…er_anchor_join_live_fail)");
                }
                C76912y0.makeText((Context) appCompatActivity, (CharSequence) str, 0).show();
                C54795n5 k = this.f169349d.mo83042k();
                if (k != null) {
                    C54795n5.C54796a.m61723a(k, 0, new C32069l(this.f169349d), 1, (Object) null);
                }
                C65760a aVar = this.f169349d.f166837f;
                if (aVar != null) {
                    C58124b.C7172a.m7372a(aVar, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
                }
                C58704c5.m68184a(C58704c5.f168044a, C58713e5.f168070B.f168101b, (C89349b) null, false, true, 6, (Object) null);
                C58728f5 f5Var = C58728f5.f168144a;
                int i = this.f169351f;
                int i2 = this.f169352g;
                String str2 = this.f169350e;
                if (str2 == null) {
                    str2 = "";
                }
                C58728f5.m68215a(f5Var, "shareLive", i, i2, str2, this.f169349d.f166851d, (String) null, 32, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: fl1.m$a$b */
        public static final class C59209b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59161f f169353d;

            /* renamed from: e */
            public final /* synthetic */ C52005xq0 f169354e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59209b(C59161f fVar, C52005xq0 xq02) {
                super(0);
                this.f169353d = fVar;
                this.f169354e = xq02;
            }

            public Object invoke() {
                C54127h data;
                LiveRoomControllerStore liveRoomControllerStore;
                Class cls = C54991o.class;
                Class cls2 = C55001u.class;
                Class cls3 = C54963d0.class;
                C54843w3 w3Var = C54843w3.f153747a;
                w3Var.mo75792g(this.f169353d.f166851d);
                w3Var.mo75793h(this.f169353d.f166851d, this.f169354e.f144823S);
                C64273c21 c212 = this.f169354e.f144846f;
                boolean u = C61926c.m72696u(c212 != null ? c212.f182374S : 0, 64);
                String str = this.f169353d.f169228i;
                Log.m105924i(str, "#handleJoinResp.setAnchorStatus isBizMode=" + u);
                if (!u) {
                    w3Var.mo75791f(this.f169353d.f166851d, this.f169354e.f144807D);
                }
                w3Var.mo75788c(this.f169353d.f166851d);
                C62042e eVar = C62042e.f176370a;
                long j = ((C54963d0) this.f169353d.mo83051g(cls3)).f154048B.f144323d;
                eVar.getClass();
                boolean z = true;
                if (C61926c.m72696u((int) j, 2) || C61926c.m72696u((int) ((C54963d0) this.f169353d.mo83051g(cls3)).f154048B.f144323d, 1) || C61926c.m72696u((int) ((C54963d0) this.f169353d.mo83051g(cls3)).f154048B.f144323d, 4)) {
                    w3Var.mo75790e(this.f169353d.f166851d);
                }
                if (!((C54991o) this.f169353d.mo83051g(cls)).mo75960G3()) {
                    C54655b bVar = this.f169353d.f166839h;
                    if (bVar == null || bVar.f172997I != C60971a.C60973b.f173670a.mo85947d().f174712e) {
                        z = false;
                    }
                    if (!z && FinderLiveService.f159376d.mo77632f()) {
                        String str2 = this.f169353d.f169228i;
                        StringBuilder sb = new StringBuilder();
                        sb.append("fps Change, oldFps:");
                        C54655b bVar2 = this.f169353d.f166839h;
                        sb.append(bVar2 != null ? Integer.valueOf(bVar2.f172997I) : null);
                        sb.append(" newFps:");
                        sb.append(C60971a.C60973b.f173670a.mo85947d().f174712e);
                        Log.m105924i(str2, sb.toString());
                        C62815i3 i3Var = this.f169353d.f169230n;
                        if (i3Var != null) {
                            C62815i3.m73903e1(i3Var, false, false, 3, (Object) null);
                        }
                    }
                }
                C54795n5 k = this.f169353d.mo83042k();
                if (k != null) {
                    C54795n5.C54796a.m61724b(k, ((C55001u) this.f169353d.mo83051g(cls2)).f154420q.f182392d, ((C55001u) this.f169353d.mo83051g(cls2)).f154416j, ((C55001u) this.f169353d.mo83051g(cls2)).f154423t, 2, (C32227p) null, 16, (Object) null);
                }
                ((C54991o) this.f169353d.mo83051g(cls)).f154325i1 = SystemClock.elapsedRealtimeNanos();
                C65760a aVar = this.f169353d.f166837f;
                if (aVar != null) {
                    C58124b.C7172a.m7372a(aVar, C58124b.C58125b.START_LIVE, (Bundle) null, 2, (Object) null);
                }
                C65760a aVar2 = this.f169353d.f166837f;
                if (!(aVar2 == null || (data = aVar2.getData()) == null || (liveRoomControllerStore = data.f151979f) == null)) {
                    C59447j.f169870a.mo84556h(liveRoomControllerStore, this.f169354e);
                }
                new FeedLiveLifeEvent().publish();
                C58704c5.m68184a(C58704c5.f168044a, C58713e5.f168072D.f168101b, (C89349b) null, false, true, 6, (Object) null);
                C58728f5 f5Var = C58728f5.f168144a;
                C58728f5.f168146c = C31543z5.m39451a();
                C58728f5.m68216c(f5Var, this.f169353d.f166851d, 17, 0, "anchorSuccLive", (String) null, 16, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C59207a(C59161f fVar, C52005xq0 xq02) {
            this.f169347a = fVar;
            this.f169348b = xq02;
        }

        /* renamed from: a */
        public void mo9151a(int i, long j, C50415mk1 mk12) {
        }

        /* renamed from: b */
        public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
        }

        /* renamed from: c */
        public void mo9153c(int i, long j) {
            Log.m105924i(this.f169347a.f169228i, "share live success!");
            C61926c.m72668M(new C59209b(this.f169347a, this.f169348b));
        }

        /* renamed from: d */
        public void mo9154d(int i, int i2, String str, int i3) {
            Log.m105924i(this.f169347a.f169228i, "share live fail!");
            C61926c.m72668M(new C59208a(this.f169347a, str, i2, i));
        }
    }

    public C59206m(C59161f fVar, C52005xq0 xq02) {
        this.f169345d = fVar;
        this.f169346e = xq02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0047, code lost:
        r3 = r3.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callback(int r44, android.os.Bundle r45) {
        /*
            r43 = this;
            r0 = r43
            r3 = r44
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "on enterRoom finish, liveData.business(LiveCommonSlice::class.java).enableAudioMode():"
            r4.append(r5)
            fl1.f r5 = r0.f169345d
            androidx.lifecycle.i0 r5 = r5.mo83051g(r2)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo75960G3()
            r4.append(r5)
            java.lang.String r5 = " audioModeHolderBm:"
            r4.append(r5)
            fl1.f r5 = r0.f169345d
            androidx.lifecycle.i0 r5 = r5.mo83051g(r2)
            cl1.o r5 = (cl1.C54991o) r5
            android.graphics.Bitmap r5 = r5.f154254S2
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.LiveCoreAnchor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r4 = 2
            r6 = 0
            r7 = 1
            if (r3 <= 0) goto L_0x0316
            fl1.f r3 = r0.f169345d
            c50.b r3 = r3.f166839h
            if (r3 == 0) goto L_0x0053
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x0053
            boolean r3 = r3.mo82880b()
            if (r3 != r7) goto L_0x0053
            r3 = 1
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x0075
            fl1.f r3 = r0.f169345d
            c50.b r5 = r3.f166839h
            if (r5 == 0) goto L_0x0075
            androidx.appcompat.app.AppCompatActivity r3 = r3.f166836e
            android.content.res.Resources r3 = r3.getResources()
            r9 = 2131233614(0x7f080b4e, float:1.808337E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r9)
            java.lang.String r9 = "context.resources.getDra…le.live_audio_mode_frame)"
            gy3.C87412m.m108593f(r3, r9)
            android.graphics.Bitmap r3 = o40.C61926c.m72686k(r3)
            r5.mo75215a(r3)
        L_0x0075:
            fl1.f r3 = r0.f169345d
            te3.xq0 r5 = r0.f169346e
            te3.m31 r5 = r5.f144848g
            r3.getClass()
            java.lang.Class<cl1.d0> r9 = cl1.C54963d0.class
            if (r5 == 0) goto L_0x0085
            java.util.LinkedList<te3.l31> r10 = r5.f137806j
            goto L_0x0086
        L_0x0085:
            r10 = r6
        L_0x0086:
            if (r10 != 0) goto L_0x008d
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
        L_0x008d:
            if (r5 == 0) goto L_0x0092
            te3.o31 r5 = r5.f137807n
            goto L_0x0093
        L_0x0092:
            r5 = r6
        L_0x0093:
            java.util.Iterator r11 = r10.iterator()
        L_0x0097:
            boolean r12 = r11.hasNext()
            r13 = 4
            if (r12 == 0) goto L_0x01d6
            java.lang.Object r12 = r11.next()
            te3.l31 r12 = (te3.C50209l31) r12
            java.lang.String r14 = r3.f169228i
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r8 = "checkLinkMicStateWhenJoin micUserList.size:"
            r15.append(r8)
            int r8 = r10.size()
            r15.append(r8)
            java.lang.String r8 = " micInfo:[sessionId:"
            r15.append(r8)
            if (r12 == 0) goto L_0x00c1
            java.lang.String r8 = r12.f137148g
            goto L_0x00c2
        L_0x00c1:
            r8 = r6
        L_0x00c2:
            r15.append(r8)
            java.lang.String r8 = ", micSeq:"
            r15.append(r8)
            if (r12 == 0) goto L_0x00d3
            long r7 = r12.f137149h
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x00d4
        L_0x00d3:
            r7 = r6
        L_0x00d4:
            r15.append(r7)
            java.lang.String r7 = ", micNickname:"
            r15.append(r7)
            if (r12 == 0) goto L_0x00e9
            te3.hx0 r7 = r12.f137145d
            if (r7 == 0) goto L_0x00e9
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f134919d
            if (r7 == 0) goto L_0x00e9
            java.lang.String r7 = r7.nickname
            goto L_0x00ea
        L_0x00e9:
            r7 = r6
        L_0x00ea:
            r15.append(r7)
            java.lang.String r7 = "], micPkInfo:[sessionId:"
            r15.append(r7)
            if (r5 == 0) goto L_0x00f7
            java.lang.String r7 = r5.f138922d
            goto L_0x00f8
        L_0x00f7:
            r7 = r6
        L_0x00f8:
            r15.append(r7)
            java.lang.String r7 = ", micPkseq:"
            r15.append(r7)
            if (r5 == 0) goto L_0x0109
            long r7 = r5.f138923e
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x010a
        L_0x0109:
            r7 = r6
        L_0x010a:
            r15.append(r7)
            java.lang.String r7 = ", micPkNickname:"
            r15.append(r7)
            if (r5 == 0) goto L_0x011f
            te3.hx0 r7 = r5.f138925g
            if (r7 == 0) goto L_0x011f
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f134919d
            if (r7 == 0) goto L_0x011f
            java.lang.String r7 = r7.nickname
            goto L_0x0120
        L_0x011f:
            r7 = r6
        L_0x0120:
            r15.append(r7)
            r7 = 93
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r7)
            if (r12 == 0) goto L_0x01d3
            java.lang.String r7 = r12.f137148g
            if (r7 == 0) goto L_0x013e
            int r7 = r7.length()
            if (r7 != 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r7 = 0
            goto L_0x013f
        L_0x013e:
            r7 = 1
        L_0x013f:
            if (r7 != 0) goto L_0x01d3
            al1.j r7 = new al1.j
            java.lang.String r8 = r12.f137147f
            te3.hx0 r14 = r12.f137145d
            if (r14 == 0) goto L_0x0152
            com.tencent.mm.protocal.protobuf.FinderContact r15 = r14.f134919d
            if (r15 == 0) goto L_0x0152
            java.lang.String r15 = r15.headUrl
            r18 = r15
            goto L_0x0154
        L_0x0152:
            r18 = r6
        L_0x0154:
            if (r14 == 0) goto L_0x015f
            com.tencent.mm.protocal.protobuf.FinderContact r15 = r14.f134919d
            if (r15 == 0) goto L_0x015f
            java.lang.String r15 = r15.username
            r19 = r15
            goto L_0x0161
        L_0x015f:
            r19 = r6
        L_0x0161:
            if (r14 == 0) goto L_0x016c
            com.tencent.mm.protocal.protobuf.FinderContact r15 = r14.f134919d
            if (r15 == 0) goto L_0x016c
            java.lang.String r15 = r15.nickname
            r20 = r15
            goto L_0x016e
        L_0x016c:
            r20 = r6
        L_0x016e:
            int r15 = r12.f137146e
            java.lang.String r12 = r12.f137148g
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            if (r15 != r4) goto L_0x0181
            r28 = 4
            goto L_0x0184
        L_0x0181:
            r13 = 3
            r28 = 3
        L_0x0184:
            if (r14 == 0) goto L_0x018b
            int r13 = r14.f134923h
            r29 = r13
            goto L_0x018d
        L_0x018b:
            r29 = 0
        L_0x018d:
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 8251328(0x7de7c0, float:1.1562573E-38)
            r42 = 0
            r16 = r7
            r17 = r8
            r21 = r15
            r22 = r12
            r35 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42)
            androidx.lifecycle.i0 r8 = r3.mo83051g(r2)
            cl1.o r8 = (cl1.C54991o) r8
            r8.mo76009k4(r7)
            java.lang.String r8 = r3.f169228i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "checkLinkMicStateWhenJoin has unfinished mic, will close. curLinkUser:"
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            r3.mo84371E(r7, r6)
        L_0x01d3:
            r7 = 1
            goto L_0x0097
        L_0x01d6:
            if (r5 == 0) goto L_0x0282
            java.lang.String r4 = r5.f138922d
            if (r4 == 0) goto L_0x01e5
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r8 = 0
            goto L_0x01e6
        L_0x01e5:
            r8 = 1
        L_0x01e6:
            if (r8 != 0) goto L_0x0282
            androidx.lifecycle.i0 r4 = r3.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r7 = new al1.j
            java.lang.String r8 = r5.f138924f
            te3.hx0 r10 = r5.f138925g
            if (r10 == 0) goto L_0x01ff
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r10.f134919d
            if (r11 == 0) goto L_0x01ff
            java.lang.String r11 = r11.headUrl
            r18 = r11
            goto L_0x0201
        L_0x01ff:
            r18 = r6
        L_0x0201:
            if (r10 == 0) goto L_0x020c
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r10.f134919d
            if (r11 == 0) goto L_0x020c
            java.lang.String r11 = r11.username
            r19 = r11
            goto L_0x020e
        L_0x020c:
            r19 = r6
        L_0x020e:
            if (r10 == 0) goto L_0x0219
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r10.f134919d
            if (r11 == 0) goto L_0x0219
            java.lang.String r11 = r11.nickname
            r20 = r11
            goto L_0x021b
        L_0x0219:
            r20 = r6
        L_0x021b:
            r21 = 2
            java.lang.String r5 = r5.f138922d
            r22 = r5
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 8257280(0x7dff00, float:1.1570914E-38)
            r42 = 0
            r16 = r7
            r17 = r8
            r35 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42)
            r4.f154073p = r7
            androidx.lifecycle.i0 r4 = r3.mo83051g(r9)
            cl1.d0 r4 = (cl1.C54963d0) r4
            r4.f154078u = r13
            java.lang.String r4 = r3.f169228i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "checkLinkMicStateWhenJoin has unfinished mic pk, will close. curPkUser:"
            r5.append(r7)
            androidx.lifecycle.i0 r7 = r3.mo83051g(r9)
            cl1.d0 r7 = (cl1.C54963d0) r7
            al1.j r7 = r7.f154073p
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            ij1.b r4 = ij1.C60299b.f171929a
            r4.mo85288d()
            r4.mo85290f()
            r3.mo84372G(r6)
        L_0x0282:
            c50.b r3 = r3.f166839h
            if (r3 == 0) goto L_0x02c7
            n50.c r4 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r4 = r4.f175229a
            if (r4 == 0) goto L_0x028f
            r4.clear()
        L_0x028f:
            n50.d r4 = r3.mo85680X()
            java.util.ArrayList<n50.d$c> r4 = r4.f175238d
            r4.clear()
            int r4 = r3.f173000L
            if (r4 != 0) goto L_0x02a4
            n50.d r3 = r3.mo85680X()
            r3.mo86571n()
            goto L_0x02c7
        L_0x02a4:
            r5 = 1
            if (r4 != r5) goto L_0x02af
            n50.d r3 = r3.mo85680X()
            r3.mo86572o(r5)
            goto L_0x02c7
        L_0x02af:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "resetMixtureParams invalid live scene: "
            r4.append(r5)
            int r3 = r3.f173000L
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "MicroMsg.LiveCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r3)
        L_0x02c7:
            er1.f5 r3 = er1.C58728f5.f168144a
            long r3 = eb0.C31543z5.m39451a()
            er1.C58728f5.f168148e = r3
            er1.c5 r5 = er1.C58704c5.f168044a
            er1.e5$b r3 = er1.C58713e5.f168073a
            er1.e5$c r3 = er1.C58713e5.f168069A
            java.lang.String r6 = r3.f168101b
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            er1.C58704c5.m68184a(r5, r6, r7, r8, r9, r10, r11)
            fl1.f r3 = r0.f169345d
            cj1.n5 r4 = r3.mo83042k()
            if (r4 == 0) goto L_0x0388
            fl1.f r3 = r0.f169345d
            androidx.lifecycle.i0 r3 = r3.mo83051g(r1)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r5 = r3.f182392d
            fl1.f r3 = r0.f169345d
            androidx.lifecycle.i0 r1 = r3.mo83051g(r1)
            cl1.u r1 = (cl1.C55001u) r1
            long r7 = r1.f154416j
            fl1.f r1 = r0.f169345d
            androidx.lifecycle.i0 r1 = r1.mo83051g(r2)
            cl1.o r1 = (cl1.C54991o) r1
            int r9 = r1.f154354q
            r10 = 1
            fl1.m$a r11 = new fl1.m$a
            fl1.f r1 = r0.f169345d
            te3.xq0 r2 = r0.f169346e
            r11.<init>(r1, r2)
            r4.mo75706J(r5, r7, r9, r10, r11)
            goto L_0x0388
        L_0x0316:
            er1.c5 r16 = er1.C58704c5.f168044a
            er1.e5$b r1 = er1.C58713e5.f168073a
            er1.e5$c r1 = er1.C58713e5.f168098z
            java.lang.String r1 = r1.f168101b
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 6
            r22 = 0
            r17 = r1
            er1.C58704c5.m68184a(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = "enter room fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            fl1.f r2 = r0.f169345d
            androidx.appcompat.app.AppCompatActivity r2 = r2.f166836e
            r5 = 0
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r1, (int) r5)
            r1.show()
            fl1.f r1 = r0.f169345d
            vk1.a r1 = r1.f166837f
            if (r1 == 0) goto L_0x0349
            d60.b$b r2 = d60.C58124b.C58125b.BEFORE_LIVE
            d60.C58124b.C7172a.m7372a(r1, r2, r6, r4, r6)
        L_0x0349:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "live_user_exit_reason"
            r1.putInt(r2, r3)
            fl1.f r2 = r0.f169345d
            vk1.a r2 = r2.f166837f
            if (r2 == 0) goto L_0x035e
            d60.b$b r4 = d60.C58124b.C58125b.LIVE_START_LIVE_FAILED
            r2.statusChange(r4, r1)
        L_0x035e:
            fl1.f r1 = r0.f169345d
            cj1.n5 r1 = r1.mo83042k()
            if (r1 == 0) goto L_0x0372
            fl1.m$b r2 = new fl1.m$b
            fl1.f r4 = r0.f169345d
            r2.<init>(r4)
            r4 = 1
            r5 = 0
            cj1.C54795n5.C54796a.m61723a(r1, r5, r2, r4, r6)
        L_0x0372:
            er1.f5 r1 = er1.C58728f5.f168144a
            r4 = 0
            java.lang.String r5 = java.lang.String.valueOf(r45)
            fl1.f r2 = r0.f169345d
            fj1.b r6 = r2.f166851d
            r7 = 0
            r8 = 32
            r9 = 0
            java.lang.String r2 = "enterRoom"
            r3 = r44
            er1.C58728f5.m68215a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.C59206m.callback(int, android.os.Bundle):void");
    }
}
