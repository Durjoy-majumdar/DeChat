package p595ll;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ll.j */
public final class C46878j {

    /* renamed from: a */
    public static final C46878j f126071a = new C46878j();

    /* renamed from: b */
    public static final C0000n0 f126072b = C53930o0.m60555b();

    /* renamed from: c */
    public static C53973z1 f126073c;

    @C91590f(mo125468c = "com.tencent.mm.emoji.sync.EmojiStoreListFetcher$getList$1", mo125469f = "EmojiStoreListFetcher.kt", mo125470l = {43}, mo125471m = "invokeSuspend")
    /* renamed from: ll.j$a */
    public static final class C46879a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f126074d;

        /* renamed from: e */
        public Object f126075e;

        /* renamed from: f */
        public Object f126076f;

        /* renamed from: g */
        public int f126077g;

        /* renamed from: h */
        public int f126078h;

        /* renamed from: i */
        public int f126079i;

        public C46879a(C15601d<? super C46879a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46879a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C46879a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.util.LinkedList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0048 A[SYNTHETIC, Splitter:B:13:0x0048] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0107  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r1.f126079i
                r4 = 0
                r5 = 1
                java.lang.String r6 = "MicroMsg.EmojiStoreListFetcher"
                if (r0 == 0) goto L_0x0033
                if (r0 != r5) goto L_0x002b
                int r7 = r1.f126078h
                int r8 = r1.f126077g
                java.lang.Object r0 = r1.f126076f
                r9 = r0
                java.util.LinkedList r9 = (java.util.LinkedList) r9
                java.lang.Object r0 = r1.f126075e
                r10 = r0
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                java.lang.Object r0 = r1.f126074d
                r11 = r0
                byte[] r11 = (byte[]) r11
                kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ d -> 0x0028 }
                r0 = r17
                r12 = r1
                goto L_0x0084
            L_0x0028:
                r0 = move-exception
                r12 = r1
                goto L_0x0094
            L_0x002b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r17)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
                r10 = r0
                r12 = r1
                r9 = r7
                r7 = 0
                r8 = 0
                r11 = 0
            L_0x0046:
                if (r8 != 0) goto L_0x0105
                ll.j r0 = p595ll.C46878j.f126071a     // Catch:{ d -> 0x0093 }
                java.lang.String r0 = "getList: start"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ d -> 0x0093 }
                te3.sz1 r0 = new te3.sz1     // Catch:{ d -> 0x0093 }
                r0.<init>()     // Catch:{ d -> 0x0093 }
                r13 = 8
                r0.f141846e = r13     // Catch:{ d -> 0x0093 }
                r13 = 15
                r0.f141847f = r13     // Catch:{ d -> 0x0093 }
                if (r11 == 0) goto L_0x0065
                te3.qv3 r13 = sf0.C48374j0.m53712a(r11)     // Catch:{ d -> 0x0093 }
                r0.f141845d = r13     // Catch:{ d -> 0x0093 }
                goto L_0x006c
            L_0x0065:
                te3.qv3 r13 = new te3.qv3     // Catch:{ d -> 0x0093 }
                r13.<init>()     // Catch:{ d -> 0x0093 }
                r0.f141845d = r13     // Catch:{ d -> 0x0093 }
            L_0x006c:
                el.c r13 = new el.c     // Catch:{ d -> 0x0093 }
                r13.<init>(r0)     // Catch:{ d -> 0x0093 }
                r12.f126074d = r11     // Catch:{ d -> 0x0093 }
                r12.f126075e = r10     // Catch:{ d -> 0x0093 }
                r12.f126076f = r9     // Catch:{ d -> 0x0093 }
                r12.f126077g = r8     // Catch:{ d -> 0x0093 }
                r12.f126078h = r7     // Catch:{ d -> 0x0093 }
                r12.f126079i = r5     // Catch:{ d -> 0x0093 }
                java.lang.Object r0 = r13.mo63012d(r12)     // Catch:{ d -> 0x0093 }
                if (r0 != r2) goto L_0x0084
                return r2
            L_0x0084:
                r13 = r0
                te3.tz1 r13 = (te3.C51468tz1) r13     // Catch:{ d -> 0x0093 }
                ll.j r0 = p595ll.C46878j.f126071a     // Catch:{ d -> 0x008f }
                java.lang.String r0 = "getList: no error"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ d -> 0x008f }
                goto L_0x00ee
            L_0x008f:
                r0 = move-exception
                r7 = 1
                r8 = 1
                goto L_0x0095
            L_0x0093:
                r0 = move-exception
            L_0x0094:
                r13 = 0
            L_0x0095:
                ll.j r14 = p595ll.C46878j.f126071a
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "getList: "
                r14.append(r15)
                int r15 = r0.f108400d
                r14.append(r15)
                java.lang.String r15 = ", "
                r14.append(r15)
                int r15 = r0.f108401e
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r14)
                int r14 = r0.f108400d
                if (r14 == 0) goto L_0x00c2
                r15 = 4
                if (r14 != r15) goto L_0x00bf
                goto L_0x00c2
            L_0x00bf:
                r0 = 0
            L_0x00c0:
                r8 = 1
                goto L_0x00f1
            L_0x00c2:
                int r14 = r0.f108401e
                r15 = 2
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.emoji.model.cgi.CgiGetEmotionList"
                if (r14 != r15) goto L_0x00e0
                com.tencent.mm.ipcinvoker.wx_extension.c<?, ?> r0 = r0.f108402f
                gy3.C87412m.m108592e(r0, r3)
                el.c r0 = (p812el.C45678c) r0
                RESPONSE r0 = r0.f108399b
                te3.tz1 r0 = (te3.C51468tz1) r0
                te3.qv3 r3 = r0.f142489d
                if (r3 == 0) goto L_0x00dd
                pe3.b r3 = r3.f140574f
                byte[] r3 = r3.f257327a
                goto L_0x00de
            L_0x00dd:
                r3 = 0
            L_0x00de:
                r11 = r3
                goto L_0x00f1
            L_0x00e0:
                if (r14 != 0) goto L_0x00ef
                com.tencent.mm.ipcinvoker.wx_extension.c<?, ?> r0 = r0.f108402f
                gy3.C87412m.m108592e(r0, r3)
                el.c r0 = (p812el.C45678c) r0
                RESPONSE r0 = r0.f108399b
                r13 = r0
                te3.tz1 r13 = (te3.C51468tz1) r13
            L_0x00ee:
                r7 = 1
            L_0x00ef:
                r0 = r13
                goto L_0x00c0
            L_0x00f1:
                if (r0 == 0) goto L_0x00fa
                java.util.LinkedList<te3.o80> r3 = r0.f142491f
                if (r3 == 0) goto L_0x00fa
                r10.addAll(r3)
            L_0x00fa:
                if (r0 == 0) goto L_0x0046
                java.util.LinkedList<te3.m80> r0 = r0.f142504v
                if (r0 == 0) goto L_0x0046
                r9.addAll(r0)
                goto L_0x0046
            L_0x0105:
                if (r7 == 0) goto L_0x021b
                ll.j r0 = p595ll.C46878j.f126071a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "getList: packSize:"
                r0.append(r2)
                int r2 = r10.size()
                r0.append(r2)
                java.lang.String r2 = ", setSize:"
                r0.append(r2)
                int r2 = r9.size()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                java.util.Iterator r0 = r10.iterator()
            L_0x0131:
                boolean r2 = r0.hasNext()
                r3 = 32
                if (r2 == 0) goto L_0x017a
                java.lang.Object r2 = r0.next()
                te3.o80 r2 = (te3.C101824o80) r2
                java.lang.String r7 = r2.f298992C
                if (r7 == 0) goto L_0x014c
                int r7 = r7.length()
                if (r7 != 0) goto L_0x014a
                goto L_0x014c
            L_0x014a:
                r7 = 0
                goto L_0x014d
            L_0x014c:
                r7 = 1
            L_0x014d:
                if (r7 != 0) goto L_0x0131
                ll.j r7 = p595ll.C46878j.f126071a
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "getList: group:"
                r7.append(r8)
                java.lang.String r8 = r2.f298994d
                r7.append(r8)
                r7.append(r3)
                java.lang.String r3 = r2.f298996f
                r7.append(r3)
                java.lang.String r3 = " ip:"
                r7.append(r3)
                java.lang.String r2 = r2.f298992C
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                goto L_0x0131
            L_0x017a:
                java.util.Iterator r0 = r9.iterator()
            L_0x017e:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x01ba
                java.lang.Object r2 = r0.next()
                te3.m80 r2 = (te3.C50367m80) r2
                ll.j r7 = p595ll.C46878j.f126071a
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "getList: IpList:"
                r7.append(r8)
                java.lang.String r8 = r2.f137902g
                r7.append(r8)
                r7.append(r3)
                java.lang.String r8 = r2.f137899d
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                com.tencent.mm.storage.emotion.EmojiIPSetInfo$b r7 = com.tencent.p014mm.storage.emotion.EmojiIPSetInfo.f82658v
                com.tencent.mm.storage.emotion.EmojiIPSetInfo r2 = r7.mo57636a(r2)
                com.tencent.mm.storage.w2 r7 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.d r7 = r7.f82786r
                r7.mo61529Lo(r2)
                goto L_0x017e
            L_0x01ba:
                ll.j r0 = p595ll.C46878j.f126071a
                java.lang.Object[] r0 = new java.lang.Object[r5]
                int r2 = r10.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r4] = r2
                java.lang.String r2 = "preparedDownloadStoreEmojiList: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.c r0 = r0.mo57715b()
                java.lang.String r2 = "getInstance().getEmojiGroupInfoStorage()"
                gy3.C87412m.m108593f(r0, r2)
                r0.mo142018DN(r10)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.mo119677K(r2, r3)
                java.lang.Class<z51.g> r0 = z51.C39315g.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                z51.g r0 = (z51.C39315g) r0
                zc3.a r0 = r0.mo58035cm()
                i61.h r0 = (i61.C98602h) r0
                r0.getClass()
                java.lang.Class<aq.g> r0 = p441aq.C92054g.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                aq.g r0 = (p441aq.C92054g) r0
                com.tencent.mm.plugin.emoji.sync.b r0 = r0.wx0()
                zt3.t r2 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.emoji.sync.a r3 = new com.tencent.mm.plugin.emoji.sync.a
                r3.<init>(r0)
                zt3.j r2 = (zt3.C119157j) r2
                r2.mo183875f(r3)
            L_0x021b:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p595ll.C46878j.C46879a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo72084a() {
        C53973z1 z1Var = f126073c;
        boolean z = true;
        if (z1Var == null || !z1Var.mo74466a()) {
            z = false;
        }
        if (!z) {
            f126073c = C53895h.m60466d(f126072b, C53872d1.f151119c, (C53934p0) null, new C46879a((C15601d<? super C46879a>) null), 2, (Object) null);
        }
    }
}
