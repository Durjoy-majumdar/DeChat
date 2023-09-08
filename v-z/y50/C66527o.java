package y50;

import a60.C53979a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Pair;
import b60.C28260e;
import b60.C54427b;
import b60.C54428c;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.LiveUIA;
import com.tencent.p014mm.live.p016ui.LiveUID;
import com.tencent.p014mm.live.p016ui.LiveUIF;
import com.tencent.p014mm.p136ui.C57833e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import p50.C62197e;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C64587no2;
import x40.C66234a;

/* renamed from: y50.o */
public final class C66527o implements C66234a {

    /* renamed from: a */
    public static final C66527o f191369a = new C66527o();

    /* renamed from: y50.o$a */
    public static final class C66528a {

        /* renamed from: a */
        public static final C66528a f191370a = new C66528a();

        /* renamed from: y50.o$a$a */
        public static final class C66529a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191371d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191372e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66529a(Context context, C8479f0<String> f0Var) {
                super(0);
                this.f191371d = context;
                this.f191372e = f0Var;
            }

            public Object invoke() {
                C77426q qVar = new C77426q(this.f191371d);
                qVar.mo107595g(this.f191371d.getResources().getString(C0966R.string.g97));
                qVar.mo107602n((String) this.f191372e.f27484d);
                qVar.mo107600l(C66526n.f191368a);
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$b */
        public static final class C66530b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191373d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191374e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66530b(Context context, C8479f0<String> f0Var) {
                super(0);
                this.f191373d = context;
                this.f191374e = f0Var;
            }

            public Object invoke() {
                C77426q qVar = new C77426q(this.f191373d);
                qVar.mo107595g(this.f191373d.getResources().getString(C0966R.string.g95));
                qVar.mo107602n((String) this.f191374e.f27484d);
                qVar.mo107600l(C66538p.f191392a);
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$c */
        public static final class C66531c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191375d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191376e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66531c(Context context, C8479f0<String> f0Var) {
                super(0);
                this.f191375d = context;
                this.f191376e = f0Var;
            }

            public Object invoke() {
                C77426q qVar = new C77426q(this.f191375d);
                qVar.mo107595g(this.f191375d.getResources().getString(C0966R.string.g98));
                qVar.mo107602n((String) this.f191376e.f27484d);
                qVar.mo107600l(C66540q.f191393a);
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$d */
        public static final class C66532d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191377d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191378e;

            /* renamed from: f */
            public final /* synthetic */ LiveConfig f191379f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66532d(Context context, C8479f0<String> f0Var, LiveConfig liveConfig) {
                super(0);
                this.f191377d = context;
                this.f191378e = f0Var;
                this.f191379f = liveConfig;
            }

            public Object invoke() {
                String str;
                if (Util.isEqual(RoomLiveService.f157199j, C75592q0.m90789s())) {
                    C77426q qVar = new C77426q(this.f191377d);
                    qVar.mo107595g(this.f191377d.getResources().getString(C0966R.string.g94));
                    qVar.mo107602n((String) this.f191378e.f27484d);
                    qVar.mo107600l(C66542r.f191397a);
                    qVar.mo107603o();
                } else {
                    LiveConfig liveConfig = this.f191379f;
                    if (liveConfig != null && liveConfig.f157070n == 2) {
                        C77426q qVar2 = new C77426q(this.f191377d);
                        qVar2.mo107595g(this.f191377d.getResources().getString(C0966R.string.g94));
                        qVar2.mo107602n((String) this.f191378e.f27484d);
                        qVar2.mo107600l(C66543s.f191398a);
                        qVar2.mo107603o();
                    } else {
                        C53979a.C53980a aVar = RoomLiveService.f157185Q.f151234i;
                        String str2 = null;
                        if (Util.isEqual(aVar != null ? aVar.f151238c : null, C75592q0.m90789s())) {
                            C77426q qVar3 = new C77426q(this.f191377d);
                            qVar3.mo107595g(this.f191377d.getResources().getString(C0966R.string.g94));
                            qVar3.mo107602n((String) this.f191378e.f27484d);
                            qVar3.mo107600l(C66544t.f191399a);
                            qVar3.mo107603o();
                        } else {
                            C54655b bVar = C54655b.f153178f1;
                            if (bVar != null) {
                                if (bVar == null) {
                                    C54655b.f153178f1 = new C54655b();
                                }
                                C87412m.m108591d(C54655b.f153178f1);
                            } else {
                                C62197e eVar = C62197e.f176819i1;
                                if (eVar != null) {
                                    if (eVar == null) {
                                        C62197e.f176819i1 = new C62197e();
                                    }
                                    C87412m.m108591d(C62197e.f176819i1);
                                }
                            }
                            C77426q qVar4 = new C77426q(this.f191377d);
                            Resources resources = this.f191377d.getResources();
                            if (resources != null) {
                                Object[] objArr = new Object[1];
                                LiveConfig liveConfig2 = this.f191379f;
                                objArr[0] = liveConfig2 != null ? liveConfig2.f157066g : null;
                                str = resources.getString(C0966R.string.g96, objArr);
                            } else {
                                str = null;
                            }
                            qVar4.mo107595g(str);
                            Resources resources2 = this.f191377d.getResources();
                            qVar4.mo107602n(resources2 != null ? resources2.getString(C0966R.string.g7s) : null);
                            Resources resources3 = this.f191377d.getResources();
                            if (resources3 != null) {
                                str2 = resources3.getString(C0966R.string.f7926wf);
                            }
                            qVar4.mo107598j(str2);
                            qVar4.mo107600l(new C66545u(this.f191377d, this.f191379f));
                            qVar4.mo107597i(C66546v.f191402a);
                            qVar4.mo107603o();
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$e */
        public static final class C66533e extends C87413o implements C32226l<C64587no2, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191380d;

            /* renamed from: e */
            public final /* synthetic */ LiveConfig f191381e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66533e(Context context, LiveConfig liveConfig) {
                super(1);
                this.f191380d = context;
                this.f191381e = liveConfig;
            }

            public Object invoke(Object obj) {
                C64587no2 no22 = (C64587no2) obj;
                C87412m.m108594g(no22, "liveAnchorInfo");
                C77426q qVar = new C77426q(this.f191380d);
                qVar.mo107595g(this.f191380d.getResources().getString(C0966R.string.f360960g93));
                Resources resources = this.f191380d.getResources();
                String str = null;
                qVar.mo107602n(resources != null ? resources.getString(C0966R.string.a18) : null);
                Resources resources2 = this.f191380d.getResources();
                if (resources2 != null) {
                    str = resources2.getString(C0966R.string.f7926wf);
                }
                qVar.mo107598j(str);
                qVar.mo107600l(new C66547w(no22, this.f191381e, this.f191380d));
                qVar.mo107597i(C66548x.f191406a);
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$f */
        public static final class C66534f extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191382d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191383e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66534f(Context context, C8479f0<String> f0Var) {
                super(0);
                this.f191382d = context;
                this.f191383e = f0Var;
            }

            public Object invoke() {
                C77426q qVar = new C77426q(this.f191382d);
                qVar.mo107595g(this.f191382d.getResources().getString(C0966R.string.g97));
                qVar.mo107602n((String) this.f191383e.f27484d);
                qVar.mo107600l(C66549y.f191407a);
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$g */
        public static final class C66535g extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191384d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191385e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66535g(Context context, C8479f0<String> f0Var) {
                super(0);
                this.f191384d = context;
                this.f191385e = f0Var;
            }

            public Object invoke() {
                C77426q qVar = new C77426q(this.f191384d);
                qVar.mo107595g(this.f191384d.getResources().getString(C0966R.string.g95));
                qVar.mo107602n((String) this.f191385e.f27484d);
                qVar.mo107600l(C66550z.f191408a);
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$h */
        public static final class C66536h extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191386d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191387e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66536h(Context context, C8479f0<String> f0Var) {
                super(0);
                this.f191386d = context;
                this.f191387e = f0Var;
            }

            public Object invoke() {
                C77426q qVar = new C77426q(this.f191386d);
                qVar.mo107595g(this.f191386d.getResources().getString(C0966R.string.g98));
                qVar.mo107602n((String) this.f191387e.f27484d);
                qVar.mo107600l(C66506a0.f191323a);
                qVar.mo107603o();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y50.o$a$i */
        public static final class C66537i extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f191388d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<String> f191389e;

            /* renamed from: f */
            public final /* synthetic */ LiveConfig f191390f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<String> f191391g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66537i(Context context, C8479f0<String> f0Var, LiveConfig liveConfig, C8479f0<String> f0Var2) {
                super(0);
                this.f191388d = context;
                this.f191389e = f0Var;
                this.f191390f = liveConfig;
                this.f191391g = f0Var2;
            }

            public Object invoke() {
                String str;
                if (Util.isEqual(RoomLiveService.f157199j, C75592q0.m90789s())) {
                    C77426q qVar = new C77426q(this.f191388d);
                    qVar.mo107595g(this.f191388d.getResources().getString(C0966R.string.g94));
                    qVar.mo107602n((String) this.f191389e.f27484d);
                    qVar.mo107600l(C66508b0.f191329a);
                    qVar.mo107603o();
                } else {
                    LiveConfig liveConfig = this.f191390f;
                    if (liveConfig != null && liveConfig.f157070n == 2) {
                        C77426q qVar2 = new C77426q(this.f191388d);
                        qVar2.mo107595g((String) this.f191391g.f27484d);
                        qVar2.mo107602n((String) this.f191389e.f27484d);
                        qVar2.mo107600l(C66509c0.f191330a);
                        qVar2.mo107603o();
                    } else {
                        C53979a.C53980a aVar = RoomLiveService.f157185Q.f151234i;
                        String str2 = null;
                        if (Util.isEqual(aVar != null ? aVar.f151238c : null, C75592q0.m90789s())) {
                            C77426q qVar3 = new C77426q(this.f191388d);
                            qVar3.mo107595g(this.f191388d.getResources().getString(C0966R.string.g94));
                            qVar3.mo107602n((String) this.f191389e.f27484d);
                            qVar3.mo107600l(C66510d0.f191331a);
                            qVar3.mo107603o();
                        } else {
                            C54655b bVar = C54655b.f153178f1;
                            if (bVar != null) {
                                if (bVar == null) {
                                    C54655b.f153178f1 = new C54655b();
                                }
                                C87412m.m108591d(C54655b.f153178f1);
                            } else {
                                C62197e eVar = C62197e.f176819i1;
                                if (eVar != null) {
                                    if (eVar == null) {
                                        C62197e.f176819i1 = new C62197e();
                                    }
                                    C87412m.m108591d(C62197e.f176819i1);
                                }
                            }
                            C77426q qVar4 = new C77426q(this.f191388d);
                            Resources resources = this.f191388d.getResources();
                            if (resources != null) {
                                Object[] objArr = new Object[1];
                                LiveConfig liveConfig2 = this.f191390f;
                                objArr[0] = liveConfig2 != null ? liveConfig2.f157066g : null;
                                str = resources.getString(C0966R.string.g96, objArr);
                            } else {
                                str = null;
                            }
                            qVar4.mo107595g(str);
                            Resources resources2 = this.f191388d.getResources();
                            qVar4.mo107602n(resources2 != null ? resources2.getString(C0966R.string.g7s) : null);
                            Resources resources3 = this.f191388d.getResources();
                            if (resources3 != null) {
                                str2 = resources3.getString(C0966R.string.f7926wf);
                            }
                            qVar4.mo107598j(str2);
                            qVar4.mo107600l(new C66511e0(this.f191388d, this.f191390f));
                            qVar4.mo107597i(C66513f0.f191339a);
                            qVar4.mo107603o();
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final y50.C66527o.C66528a mo90611a(fy3.C32224a<rx3.C13598b0> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "MicroMsg.LiveEntranceJumper"
                r1 = 1
                r2 = 0
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x002f }
                java.lang.String r4 = "phone"
                java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x002f }
                java.lang.String r4 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
                gy3.C87412m.m108592e(r3, r4)     // Catch:{ Exception -> 0x002f }
                android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x002f }
                int r3 = r3.getCallState()     // Catch:{ Exception -> 0x002f }
                r4 = 2
                if (r3 == r4) goto L_0x001e
                r4 = 0
                goto L_0x001f
            L_0x001e:
                r4 = 1
            L_0x001f:
                java.lang.String r5 = "TelephoneManager.callState is %d"
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x002d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x002d }
                r6[r2] = r3     // Catch:{ Exception -> 0x002d }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ Exception -> 0x002d }
                goto L_0x003e
            L_0x002d:
                r3 = move-exception
                goto L_0x0031
            L_0x002f:
                r3 = move-exception
                r4 = 0
            L_0x0031:
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = r3.getLocalizedMessage()
                r1[r2] = r3
                java.lang.String r2 = "get callState error , errMsg is %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
            L_0x003e:
                if (r4 == 0) goto L_0x0047
                if (r8 == 0) goto L_0x0045
                r8.invoke()
            L_0x0045:
                r8 = 0
                return r8
            L_0x0047:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: y50.C66527o.C66528a.mo90611a(fy3.a):y50.o$a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(com.tencent.p014mm.live.model.RoomLiveService.f157192c, r10.f157065f) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
            if (r10.f157070n == 2) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
            if (com.tencent.p014mm.live.model.RoomLiveService.f157197h.f133050d == r10.f157064e) goto L_0x007f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0088 A[RETURN] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final y50.C66527o.C66528a mo90612b(com.tencent.p014mm.live.api.LiveConfig r10, fy3.C32224a<rx3.C13598b0> r11) {
            /*
                r9 = this;
                com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
                te3.ep2 r0 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
                long r0 = r0.f133050d
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 1
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L_0x007f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "curLiveId:"
                r0.append(r1)
                te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
                long r7 = r1.f133050d
                r0.append(r7)
                java.lang.String r1 = " newLiveId:"
                r0.append(r1)
                if (r10 == 0) goto L_0x002e
                long r7 = r10.f157064e
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                goto L_0x002f
            L_0x002e:
                r1 = r2
            L_0x002f:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.LiveEntranceJumper"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
                boolean r1 = r0.f157226c
                if (r1 != 0) goto L_0x007f
                boolean r0 = r0.f157224a
                if (r0 == 0) goto L_0x0046
                goto L_0x007f
            L_0x0046:
                if (r10 == 0) goto L_0x0050
                long r0 = r10.f157064e
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 != 0) goto L_0x0050
                r0 = 1
                goto L_0x0051
            L_0x0050:
                r0 = 0
            L_0x0051:
                if (r0 == 0) goto L_0x0073
                java.lang.String r0 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
                if (r0 == 0) goto L_0x0060
                int r0 = r0.length()
                if (r0 != 0) goto L_0x005e
                goto L_0x0060
            L_0x005e:
                r0 = 0
                goto L_0x0061
            L_0x0060:
                r0 = 1
            L_0x0061:
                if (r0 != 0) goto L_0x006d
                java.lang.String r0 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
                java.lang.String r1 = r10.f157065f
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r1)
                if (r0 == 0) goto L_0x0080
            L_0x006d:
                int r10 = r10.f157070n
                r0 = 2
                if (r10 == r0) goto L_0x0080
                goto L_0x007f
            L_0x0073:
                if (r10 == 0) goto L_0x0080
                te3.ep2 r0 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
                long r0 = r0.f133050d
                long r3 = r10.f157064e
                int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r10 != 0) goto L_0x0080
            L_0x007f:
                r5 = 1
            L_0x0080:
                if (r5 != 0) goto L_0x0088
                if (r11 == 0) goto L_0x0087
                r11.invoke()
            L_0x0087:
                return r2
            L_0x0088:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: y50.C66527o.C66528a.mo90612b(com.tencent.mm.live.api.LiveConfig, fy3.a):y50.o$a");
        }

        /* renamed from: c */
        public final C66528a mo90613c(C32224a<C13598b0> aVar) {
            TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
            talkRoomServerEvent.f154883d.f154885a = true;
            talkRoomServerEvent.publish();
            if (Util.isNullOrNil(talkRoomServerEvent.f154884e.f154887a)) {
                return this;
            }
            if (aVar == null) {
                return null;
            }
            aVar.invoke();
            return null;
        }

        /* renamed from: d */
        public final void mo90614d(Context context, LiveConfig liveConfig) {
            C66528a a;
            C66528a c;
            C66528a b;
            C87412m.m108594g(context, "context");
            C8479f0 f0Var = new C8479f0();
            T string = context.getResources().getString(C0966R.string.f8028zq);
            C87412m.m108593f(string, "context.resources.getStr…mmui.R.string.app_i_know)");
            f0Var.f27484d = string;
            C66528a aVar = null;
            C66528a aVar2 = WeChatBrands.Business.Entries.SessionGroupLive.checkAvailable(context) ? this : null;
            if (aVar2 != null) {
                C66529a aVar3 = new C66529a(context, f0Var);
                if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                    aVar3.invoke();
                    aVar2 = null;
                }
                if (aVar2 != null && (a = aVar2.mo90611a(new C66530b(context, f0Var))) != null && (c = a.mo90613c(new C66531c(context, f0Var))) != null && (b = c.mo90612b(liveConfig, new C66532d(context, f0Var, liveConfig))) != null) {
                    C66533e eVar = new C66533e(context, liveConfig);
                    C64587no2 a2 = C54428c.f152656a.mo75240a();
                    boolean z = false;
                    if (!(liveConfig != null && liveConfig.f157070n == 2) || a2.f184522d == 0) {
                        aVar = b;
                    } else {
                        eVar.invoke(a2);
                    }
                    if (aVar != null) {
                        C54655b bVar = C54655b.f153178f1;
                        if (bVar != null) {
                            if (bVar == null) {
                                C54655b.f153178f1 = new C54655b();
                            }
                            C87412m.m108591d(C54655b.f153178f1);
                        } else {
                            C62197e eVar2 = C62197e.f176819i1;
                            if (eVar2 != null) {
                                if (eVar2 == null) {
                                    C62197e.f176819i1 = new C62197e();
                                }
                                C87412m.m108591d(C62197e.f176819i1);
                            }
                        }
                        if (liveConfig != null && liveConfig.f157064e == RoomLiveService.f157197h.f133050d) {
                            z = true;
                        }
                        if (!z) {
                            RoomLiveService.f157190a.mo76447e();
                        }
                        C66527o.m78485e(C66527o.f191369a, context, liveConfig);
                    }
                }
            }
        }

        /* renamed from: e */
        public final void mo90615e(Context context, LiveConfig liveConfig) {
            C66528a a;
            C66528a c;
            C87412m.m108594g(context, "context");
            C8479f0 f0Var = new C8479f0();
            Resources resources = context.getResources();
            C66528a aVar = null;
            f0Var.f27484d = resources != null ? resources.getString(C0966R.string.g94) : null;
            C8479f0 f0Var2 = new C8479f0();
            T string = context.getResources().getString(C0966R.string.f8028zq);
            C87412m.m108593f(string, "context.resources.getStr…mmui.R.string.app_i_know)");
            f0Var2.f27484d = string;
            C66528a aVar2 = WeChatBrands.Business.Entries.SessionGroupLive.checkAvailable(context) ? this : null;
            if (aVar2 != null) {
                C66534f fVar = new C66534f(context, f0Var2);
                if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                    fVar.invoke();
                } else {
                    aVar = aVar2;
                }
                if (aVar != null && (a = aVar.mo90611a(new C66535g(context, f0Var2))) != null && (c = a.mo90613c(new C66536h(context, f0Var2))) != null && c.mo90612b(liveConfig, new C66537i(context, f0Var2, liveConfig, f0Var)) != null) {
                    C54655b bVar = C54655b.f153178f1;
                    boolean z = false;
                    if (bVar != null) {
                        if (bVar == null) {
                            C54655b.f153178f1 = new C54655b();
                        }
                        C87412m.m108591d(C54655b.f153178f1);
                    } else {
                        C62197e eVar = C62197e.f176819i1;
                        if (eVar != null) {
                            if (eVar == null) {
                                C62197e.f176819i1 = new C62197e();
                            }
                            C87412m.m108591d(C62197e.f176819i1);
                        }
                    }
                    if (liveConfig != null && liveConfig.f157064e == RoomLiveService.f157197h.f133050d) {
                        z = true;
                    }
                    if (!z) {
                        RoomLiveService.f157190a.mo76447e();
                    }
                    C66527o.m78486f(C66527o.f191369a, context, liveConfig);
                }
            }
        }
    }

    /* renamed from: e */
    public static final void m78485e(C66527o oVar, Context context, LiveConfig liveConfig) {
        oVar.getClass();
        int i = LiveUIA.f157228g;
        Intent intent = new Intent(context, LiveUIA.class);
        intent.putExtra("KEY_PARAMS_CONFIG", liveConfig);
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/live/model/LiveEntranceJumperImpl", "gotoAnchorLive", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/live/model/LiveEntranceJumperImpl", "gotoAnchorLive", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if ((r3.length() == 0) != false) goto L_0x004c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m78486f(y50.C66527o r6, android.content.Context r7, com.tencent.p014mm.live.api.LiveConfig r8) {
        /*
            r6.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "tag_live_core"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r0)
            java.lang.String r3 = "test_mmkv_live_skip_mobile_verify"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r4 = 6
            r5 = 0
            java.lang.Object r3 = r3.mo119684e(r4, r5)
            if (r3 != 0) goto L_0x0030
            r3 = r5
            goto L_0x0032
        L_0x0030:
            java.lang.String r3 = (java.lang.String) r3
        L_0x0032:
            if (r0 == 0) goto L_0x0039
            if (r8 == 0) goto L_0x0055
            com.tencent.p014mm.live.api.LiveConfig.f157042V = r2
            goto L_0x0055
        L_0x0039:
            com.tencent.mm.live.model.RoomLiveService$a r0 = com.tencent.p014mm.live.model.RoomLiveService.f157211v
            boolean r0 = r0.f157217b
            if (r0 == 0) goto L_0x0051
            if (r3 == 0) goto L_0x004c
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x0051
        L_0x004c:
            if (r8 == 0) goto L_0x0055
            com.tencent.p014mm.live.api.LiveConfig.f157042V = r1
            goto L_0x0055
        L_0x0051:
            if (r8 == 0) goto L_0x0055
            com.tencent.p014mm.live.api.LiveConfig.f157042V = r2
        L_0x0055:
            com.tencent.mm.live.model.RoomLiveService$a r0 = com.tencent.p014mm.live.model.RoomLiveService.f157211v
            boolean r0 = r0.f157218c
            if (r0 == 0) goto L_0x00a1
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LIVE_FIRST_VISITOR_INT_SYNC
            int r0 = r0.mo119689j(r3, r1)
            if (r0 != r1) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 == 0) goto L_0x009d
            qo3.e0 r6 = new qo3.e0
            r6.<init>(r7, r2, r2)
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r7)
            int r0 = r0.y
            int r0 = r0 * 3
            int r0 = r0 / 4
            r6.mo140674t(r0)
            com.tencent.mm.live.ui.dialog.LiveVisitorGuideView r0 = new com.tencent.mm.live.ui.dialog.LiveVisitorGuideView
            r0.<init>(r7, r5, r2)
            y50.g0 r1 = new y50.g0
            r1.<init>(r6)
            r0.setOnHideListener(r1)
            y50.h0 r1 = new y50.h0
            r1.<init>(r6, r7, r8)
            r0.setOnOkListener(r1)
            r6.mo140663j(r0)
            r6.mo140655A()
            goto L_0x00a4
        L_0x009d:
            r6.mo90610g(r7, r8)
            goto L_0x00a4
        L_0x00a1:
            r6.mo90610g(r7, r8)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y50.C66527o.m78486f(y50.o, android.content.Context, com.tencent.mm.live.api.LiveConfig):void");
    }

    /* renamed from: a */
    public boolean mo90321a(Context context, LiveConfig liveConfig) {
        C87412m.m108594g(context, "context");
        try {
            int i = LiveUIF.f157233d;
            Intent intent = new Intent(context, LiveUIF.class);
            intent.putExtra("KEY_PARAMS_CONFIG", liveConfig);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/live/model/LiveEntranceJumperImpl", "jumpToEntranceUI", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/live/model/LiveEntranceJumperImpl", "jumpToEntranceUI", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.LiveEntranceJumper", e, "jumpToEntranceUI failed!", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo90322b(Context context, LiveConfig liveConfig) {
        C87412m.m108594g(context, "context");
        try {
            C66528a.f191370a.mo90615e(context, liveConfig);
            return true;
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.LiveEntranceJumper", e, "jumpToEntranceUI failed!", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo90323c(Context context, LiveConfig liveConfig) {
        C87412m.m108594g(context, "context");
        try {
            C66528a.f191370a.mo90614d(context, liveConfig);
            return true;
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.LiveEntranceJumper", e, "jumpToAnchorUI failed!", new Object[0]);
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo90324d(Context context, LiveConfig liveConfig) {
        C87412m.m108594g(context, "context");
        try {
            int i = LiveUID.f10334E;
            Intent intent = new Intent(context, LiveUID.class);
            intent.putExtra("KEY_PARAMS_CONFIG", liveConfig);
            intent.addFlags(268435456);
            intent.putExtra("FROM_SENCE", 1);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/live/model/LiveEntranceJumperImpl", "jumpToReplayUI", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/live/model/LiveEntranceJumperImpl", "jumpToReplayUI", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiveEntranceJumper", e, "jumpToReplayUI failed!", new Object[0]);
            return false;
        }
    }

    /* renamed from: g */
    public final void mo90610g(Context context, LiveConfig liveConfig) {
        if (liveConfig != null) {
            C28260e jo = C28260e.m38144jo();
            String str = liveConfig.f157065f;
            long j = liveConfig.f157064e;
            jo.getClass();
            Log.m105925i("MicroMsg.LiveTipsBarStorage", "setVisitingLive, liveId:%d", Long.valueOf(j));
            C28260e.f77818g = new Pair<>(str, Long.valueOf(j));
            C54427b.C28258a aVar = jo.f77821e;
            if (aVar != null) {
                ((C57833e1.C57834a) aVar).mo82259a(str);
            }
        }
        int i = LiveUIA.f157228g;
        Intent intent = new Intent(context, LiveUIA.class);
        intent.putExtra("KEY_PARAMS_CONFIG", liveConfig);
        intent.addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/live/model/LiveEntranceJumperImpl", "jumpToLiveUIA", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/live/model/LiveEntranceJumperImpl", "jumpToLiveUIA", "(Landroid/content/Context;Lcom/tencent/mm/live/api/LiveConfig;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
