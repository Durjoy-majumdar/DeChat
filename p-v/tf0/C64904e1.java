package tf0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.pigeon.FlutterAccountPigeon;
import di3.C86312j;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p196ln.C61311l;
import p196ln.C76706g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.FlutterAccountPlugin$getAvatarPath$1", mo125469f = "FlutterAccountPlugin.kt", mo125470l = {47}, mo125471m = "invokeSuspend")
/* renamed from: tf0.e1 */
public final class C64904e1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f186920d;

    /* renamed from: e */
    public int f186921e;

    /* renamed from: f */
    public final /* synthetic */ String f186922f;

    /* renamed from: g */
    public final /* synthetic */ boolean f186923g;

    /* renamed from: h */
    public final /* synthetic */ FlutterAccountPigeon.Result<String> f186924h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.FlutterAccountPlugin$getAvatarPath$1$avatarPath$1", mo125469f = "FlutterAccountPlugin.kt", mo125470l = {49}, mo125471m = "invokeSuspend")
    /* renamed from: tf0.e1$a */
    public static final class C64905a extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

        /* renamed from: d */
        public int f186925d;

        /* renamed from: e */
        public final /* synthetic */ C61311l f186926e;

        /* renamed from: f */
        public final /* synthetic */ String f186927f;

        /* renamed from: g */
        public final /* synthetic */ boolean f186928g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.FlutterAccountPlugin$getAvatarPath$1$avatarPath$1$1", mo125469f = "FlutterAccountPlugin.kt", mo125470l = {108}, mo125471m = "invokeSuspend")
        /* renamed from: tf0.e1$a$a */
        public static final class C64906a extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

            /* renamed from: d */
            public Object f186929d;

            /* renamed from: e */
            public Object f186930e;

            /* renamed from: f */
            public Object f186931f;

            /* renamed from: g */
            public int f186932g;

            /* renamed from: h */
            public final /* synthetic */ C61311l f186933h;

            /* renamed from: i */
            public final /* synthetic */ String f186934i;

            /* renamed from: j */
            public final /* synthetic */ C8477a0 f186935j;

            /* renamed from: n */
            public final /* synthetic */ boolean f186936n;

            /* renamed from: tf0.e1$a$a$a */
            public static final class C64907a implements C61311l.C61312a {

                /* renamed from: a */
                public final /* synthetic */ C8477a0 f186937a;

                /* renamed from: b */
                public final /* synthetic */ String f186938b;

                /* renamed from: c */
                public final /* synthetic */ boolean f186939c;

                /* renamed from: d */
                public final /* synthetic */ C53916l<String> f186940d;

                public C64907a(C8477a0 a0Var, String str, boolean z, C53916l<? super String> lVar) {
                    this.f186937a = a0Var;
                    this.f186938b = str;
                    this.f186939c = z;
                    this.f186940d = lVar;
                }

                /* renamed from: a */
                public final int mo1218a(int i, int i2) {
                    if (this.f186937a.f27482d) {
                        return 0;
                    }
                    String h = ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93559h(this.f186938b, this.f186939c);
                    if (!(i == 0 && i2 == 0)) {
                        this.f186937a.f27482d = true;
                        C53916l<String> lVar = this.f186940d;
                        Object V = lVar.mo74595V(new Exception("Unable to get avatar type:" + i + ", code:" + i2 + " for " + this.f186938b));
                        if (V != null) {
                            this.f186940d.mo74592K(V);
                        }
                    }
                    if (!C86013q1.m106450k(h)) {
                        return 0;
                    }
                    this.f186937a.f27482d = true;
                    C53916l<String> lVar2 = this.f186940d;
                    C87412m.m108593f(h, "avatarPath");
                    Object Q = lVar2.mo74593Q(h, (Object) null);
                    if (Q == null) {
                        return 0;
                    }
                    this.f186940d.mo74592K(Q);
                    return 0;
                }
            }

            /* renamed from: tf0.e1$a$a$b */
            public static final class C64908b extends C87413o implements C32226l<Throwable, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C8477a0 f186941d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C64908b(C8477a0 a0Var) {
                    super(1);
                    this.f186941d = a0Var;
                }

                public Object invoke(Object obj) {
                    this.f186941d.f27482d = true;
                    Log.m105924i("MicroMsg.FlutterAccountPlugin", "Canceled because of " + ((Throwable) obj));
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C64906a(C61311l lVar, String str, C8477a0 a0Var, boolean z, C15601d<? super C64906a> dVar) {
                super(2, dVar);
                this.f186933h = lVar;
                this.f186934i = str;
                this.f186935j = a0Var;
                this.f186936n = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C64906a(this.f186933h, this.f186934i, this.f186935j, this.f186936n, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C64906a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f186932g;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C61311l lVar = this.f186933h;
                    String str = this.f186934i;
                    C8477a0 a0Var = this.f186935j;
                    boolean z = this.f186936n;
                    this.f186929d = lVar;
                    this.f186930e = str;
                    this.f186931f = a0Var;
                    this.f186932g = 1;
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    lVar.mo86279b(str, new C64907a(a0Var, str, z, mVar));
                    mVar.mo74599v(new C64908b(a0Var));
                    obj = mVar.mo74608o();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C8477a0 a0Var2 = (C8477a0) this.f186931f;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64905a(C61311l lVar, String str, boolean z, C15601d<? super C64905a> dVar) {
            super(2, dVar);
            this.f186926e = lVar;
            this.f186927f = str;
            this.f186928g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64905a(this.f186926e, this.f186927f, this.f186928g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64905a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f186925d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8477a0 a0Var = new C8477a0();
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C64906a aVar2 = new C64906a(this.f186926e, this.f186927f, a0Var, this.f186928g, (C15601d<? super C64906a>) null);
                this.f186925d = 1;
                obj = C53895h.m60469g(k2Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64904e1(String str, boolean z, FlutterAccountPigeon.Result<String> result, C15601d<? super C64904e1> dVar) {
        super(2, dVar);
        this.f186922f = str;
        this.f186923g = z;
        this.f186924h = result;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64904e1(this.f186922f, this.f186923g, this.f186924h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64904e1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00fa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Class<ln.g> r0 = p196ln.C76706g.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r10.f186921e
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.FlutterAccountPlugin"
            if (r2 == 0) goto L_0x0025
            if (r2 != r3) goto L_0x001d
            java.lang.Object r0 = r10.f186920d
            ln.l r0 = (p196ln.C61311l) r0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            goto L_0x00c0
        L_0x0017:
            r11 = move-exception
            goto L_0x0122
        L_0x001a:
            r11 = move-exception
            goto L_0x00ef
        L_0x001d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r11)
            di3.d r11 = di3.C86312j.m106911c(r0)
            ln.g r11 = (p196ln.C76706g) r11
            ln.k r11 = r11.mo106826RE()
            java.lang.String r2 = r10.f186922f
            boolean r6 = r10.f186923g
            com.tencent.mm.modelavatar.AvatarStorage r11 = (com.tencent.p014mm.modelavatar.AvatarStorage) r11
            java.lang.String r11 = r11.mo93559h(r2, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "getAvatarPath:"
            r2.append(r6)
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r11, r4)
            r2.append(r6)
            java.lang.String r6 = " for "
            r2.append(r6)
            java.lang.String r6 = r10.f186922f
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r11 == 0) goto L_0x0069
            int r2 = r11.length()
            if (r2 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = 0
            goto L_0x006a
        L_0x0069:
            r2 = 1
        L_0x006a:
            if (r2 != 0) goto L_0x007e
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r2 == 0) goto L_0x007e
            com.tencent.pigeon.FlutterAccountPigeon$Result<java.lang.String> r0 = r10.f186924h
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106448i(r11, r4)
            r0.success(r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x007e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "start get head image username:"
            r11.append(r2)
            java.lang.String r2 = r10.f186922f
            r11.append(r2)
            java.lang.String r2 = ", hd:"
            r11.append(r2)
            boolean r2 = r10.f186923g
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            di3.d r11 = di3.C86312j.m106911c(r0)
            ln.g r11 = (p196ln.C76706g) r11
            ln.l r0 = r11.hl0()
            r6 = 30000(0x7530, double:1.4822E-319)
            tf0.e1$a r11 = new tf0.e1$a     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            java.lang.String r2 = r10.f186922f     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            boolean r8 = r10.f186923g     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            r9 = 0
            r11.<init>(r0, r2, r8, r9)     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            r10.f186920d = r0     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            r10.f186921e = r3     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            java.lang.Object r11 = a14.C53860b3.m60374b(r6, r11, r10)     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            if (r11 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ z2 -> 0x00fa, Exception -> 0x001a }
            r0.mo86278a()
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106448i(r11, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GetHDHeadImg path:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = "  for "
            r0.append(r1)
            java.lang.String r1 = r10.f186922f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.pigeon.FlutterAccountPigeon$Result<java.lang.String> r0 = r10.f186924h
            r0.success(r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x00ef:
            com.tencent.pigeon.FlutterAccountPigeon$Result<java.lang.String> r1 = r10.f186924h     // Catch:{ all -> 0x0017 }
            r1.error(r11)     // Catch:{ all -> 0x0017 }
            rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0017 }
            r0.mo86278a()
            return r11
        L_0x00fa:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r11.<init>()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = "Timeout for "
            r11.append(r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r10.f186922f     // Catch:{ all -> 0x0017 }
            r11.append(r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0017 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)     // Catch:{ all -> 0x0017 }
            com.tencent.pigeon.FlutterAccountPigeon$Result<java.lang.String> r11 = r10.f186924h     // Catch:{ all -> 0x0017 }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "Timeout to download avatar"
            r1.<init>(r2)     // Catch:{ all -> 0x0017 }
            r11.error(r1)     // Catch:{ all -> 0x0017 }
            rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0017 }
            r0.mo86278a()
            return r11
        L_0x0122:
            r0.mo86278a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C64904e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
