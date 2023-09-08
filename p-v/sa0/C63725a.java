package sa0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.view.Surface;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.MJRecommendOptions;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.MaasApi;
import d14.C45252f;
import d14.C45253g;
import d14.C58078q;
import d14.C58083t;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C87412m;
import ha0.C108183c0;
import ha0.C108215o0;
import ha0.C108221t;
import ha0.C108238y0;
import ha0.C59782i0;
import ha0.C59785k0;
import ha0.C59791q0;
import ja0.C60781a;
import java.util.List;
import kotlin.ResultKt;
import la0.C61242a;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.view.TextureRegistry;
import rx3.C13598b0;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: sa0.a */
public final class C63725a extends MaasApi.MaasFlutterApi implements FlutterPlugin {

    /* renamed from: d */
    public C61242a.C61245c f180641d = new C61242a.C61245c(MJRecommendOptions.SCENE_FINDER, false, true, -1, false, C64186f0.f181907d, 0, false, (List<String>) null, false);

    /* renamed from: e */
    public TextureRegistry f180642e;

    /* renamed from: f */
    public final C0000n0 f180643f = C53930o0.m60555b();

    /* renamed from: g */
    public C108183c0 f180644g;

    /* renamed from: h */
    public TextureRegistry.SurfaceTextureEntry f180645h;

    /* renamed from: i */
    public Surface f180646i;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$recreateCreation$1", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {196}, mo125471m = "invokeSuspend")
    /* renamed from: sa0.a$a */
    public static final class C63726a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f180647d;

        /* renamed from: e */
        public /* synthetic */ Object f180648e;

        /* renamed from: f */
        public final /* synthetic */ C63725a f180649f;

        /* renamed from: g */
        public final /* synthetic */ String f180650g;

        /* renamed from: h */
        public final /* synthetic */ String f180651h;

        /* renamed from: i */
        public final /* synthetic */ MaasApi.Result<Boolean> f180652i;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$recreateCreation$1$3", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sa0.a$a$a */
        public static final class C63727a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f180653d;

            /* renamed from: e */
            public final /* synthetic */ MaasApi.Result<Boolean> f180654e;

            /* renamed from: f */
            public final /* synthetic */ C8477a0 f180655f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63727a(MaasApi.Result<Boolean> result, C8477a0 a0Var, C15601d<? super C63727a> dVar) {
                super(3, dVar);
                this.f180654e = result;
                this.f180655f = a0Var;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C63727a aVar = new C63727a(this.f180654e, this.f180655f, (C15601d) obj3);
                aVar.f180653d = (Throwable) obj2;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105921e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: err", (Throwable) this.f180653d);
                this.f180654e.success(Boolean.FALSE);
                this.f180655f.f27482d = true;
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$recreateCreation$1$4", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sa0.a$a$b */
        public static final class C63728b extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f180656d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f180657e;

            /* renamed from: f */
            public final /* synthetic */ MaasApi.Result<Boolean> f180658f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63728b(C8477a0 a0Var, MaasApi.Result<Boolean> result, C15601d<? super C63728b> dVar) {
                super(3, dVar);
                this.f180657e = a0Var;
                this.f180658f = result;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C63728b bVar = new C63728b(this.f180657e, this.f180658f, (C15601d) obj3);
                bVar.f180656d = (Throwable) obj2;
                return bVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.f180656d;
                StringBuilder sb = new StringBuilder();
                sb.append("recreateCreation: ");
                sb.append(th == null);
                Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", sb.toString());
                if (th == null && !this.f180657e.f27482d) {
                    this.f180658f.success(Boolean.TRUE);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: sa0.a$a$c */
        public static final class C63729c implements C45253g<Float> {

            /* renamed from: d */
            public static final C63729c f180659d = new C63729c();

            public Object emit(Object obj, C15601d dVar) {
                float floatValue = ((Number) obj).floatValue();
                Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: onProgress " + floatValue);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63726a(C63725a aVar, String str, String str2, MaasApi.Result<Boolean> result, C15601d<? super C63726a> dVar) {
            super(2, dVar);
            this.f180649f = aVar;
            this.f180650g = str;
            this.f180651h = str2;
            this.f180652i = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63726a aVar = new C63726a(this.f180649f, this.f180650g, this.f180651h, this.f180652i, dVar);
            aVar.f180648e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63726a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C45252f<Float> fVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f180647d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f180648e;
                C8477a0 a0Var = new C8477a0();
                C108183c0 c0Var = this.f180649f.f180644g;
                if (c0Var == null) {
                    MaasApi.Result<Boolean> result = this.f180652i;
                    Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: movieSessionManager is null");
                    result.success(Boolean.FALSE);
                    return C13598b0.f38549a;
                }
                boolean z = false;
                if (this.f180650g.length() == 0) {
                    String str = this.f180651h;
                    if (str.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        str = null;
                    }
                    fVar = C108238y0.m146562a("222", new C59782i0(c0Var, str), new C59785k0(c0Var));
                } else {
                    String str2 = this.f180650g;
                    String str3 = this.f180651h;
                    if (str3.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        str3 = null;
                    }
                    C87412m.m108594g(str2, "templateId");
                    fVar = C108238y0.m146562a("221", new C108215o0(str2, c0Var, str3), new C59791q0(c0Var));
                }
                C58078q qVar = new C58078q(new C58083t(fVar, new C63727a(this.f180652i, a0Var, (C15601d<? super C63727a>) null)), new C63728b(a0Var, this.f180652i, (C15601d<? super C63728b>) null));
                C63729c cVar = C63729c.f180659d;
                this.f180647d = 1;
                if (qVar.mo31880a(cVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$startMovieCreation$1", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {118, 164}, mo125471m = "invokeSuspend")
    /* renamed from: sa0.a$b */
    public static final class C63730b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f180660d;

        /* renamed from: e */
        public Object f180661e;

        /* renamed from: f */
        public int f180662f;

        /* renamed from: g */
        public /* synthetic */ Object f180663g;

        /* renamed from: h */
        public final /* synthetic */ C63725a f180664h;

        /* renamed from: i */
        public final /* synthetic */ byte[] f180665i;

        /* renamed from: j */
        public final /* synthetic */ String f180666j;

        /* renamed from: n */
        public final /* synthetic */ String f180667n;

        /* renamed from: o */
        public final /* synthetic */ MaasApi.Result<Boolean> f180668o;

        /* renamed from: sa0.a$b$a */
        public static final class C63731a implements MJMovieSession.OnComplete {

            /* renamed from: a */
            public static final C63731a f180669a = new C63731a();

            public final void onComplete(MJError mJError) {
            }
        }

        /* renamed from: sa0.a$b$b */
        public static final class C63732b implements MJMovieSession.OnComplete {

            /* renamed from: a */
            public static final C63732b f180670a = new C63732b();

            public final void onComplete(MJError mJError) {
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$startMovieCreation$1$3", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sa0.a$b$c */
        public static final class C63733c extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f180671d;

            /* renamed from: e */
            public final /* synthetic */ MaasApi.Result<Boolean> f180672e;

            /* renamed from: f */
            public final /* synthetic */ C8477a0 f180673f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63733c(MaasApi.Result<Boolean> result, C8477a0 a0Var, C15601d<? super C63733c> dVar) {
                super(3, dVar);
                this.f180672e = result;
                this.f180673f = a0Var;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C63733c cVar = new C63733c(this.f180672e, this.f180673f, (C15601d) obj3);
                cVar.f180671d = (Throwable) obj2;
                return cVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105921e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startMovieCreation: err", (Throwable) this.f180671d);
                this.f180672e.success(Boolean.FALSE);
                this.f180673f.f27482d = true;
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$startMovieCreation$1$4", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sa0.a$b$d */
        public static final class C63734d extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f180674d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f180675e;

            /* renamed from: f */
            public final /* synthetic */ MaasApi.Result<Boolean> f180676f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63734d(C8477a0 a0Var, MaasApi.Result<Boolean> result, C15601d<? super C63734d> dVar) {
                super(3, dVar);
                this.f180675e = a0Var;
                this.f180676f = result;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C63734d dVar = new C63734d(this.f180675e, this.f180676f, (C15601d) obj3);
                dVar.f180674d = (Throwable) obj2;
                return dVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.f180674d;
                StringBuilder sb = new StringBuilder();
                sb.append("startMovieCreation: ");
                sb.append(th == null);
                Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", sb.toString());
                if (th == null && !this.f180675e.f27482d) {
                    this.f180676f.success(Boolean.TRUE);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: sa0.a$b$e */
        public static final class C63735e implements C45253g<Float> {

            /* renamed from: d */
            public static final C63735e f180677d = new C63735e();

            public Object emit(Object obj, C15601d dVar) {
                float floatValue = ((Number) obj).floatValue();
                Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startMovieCreation: onProgress " + floatValue);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63730b(C63725a aVar, byte[] bArr, String str, String str2, MaasApi.Result<Boolean> result, C15601d<? super C63730b> dVar) {
            super(2, dVar);
            this.f180664h = aVar;
            this.f180665i = bArr;
            this.f180666j = str;
            this.f180667n = str2;
            this.f180668o = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63730b bVar = new C63730b(this.f180664h, this.f180665i, this.f180666j, this.f180667n, this.f180668o, dVar);
            bVar.f180663g = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63730b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r1 = r20
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r1.f180662f
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L_0x002e
                if (r0 == r4) goto L_0x001b
                if (r0 != r3) goto L_0x0013
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x0161
            L_0x0013:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x001b:
                java.lang.Object r0 = r1.f180661e
                sa0.a r0 = (sa0.C63725a) r0
                java.lang.Object r5 = r1.f180660d
                gy3.a0 r5 = (gy3.C8477a0) r5
                java.lang.Object r6 = r1.f180663g
                a14.n0 r6 = (a14.C0000n0) r6
                kotlin.ResultKt.throwOnFailure(r21)
                r6 = r0
                r0 = r21
                goto L_0x004f
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r21)
                java.lang.Object r0 = r1.f180663g
                a14.n0 r0 = (a14.C0000n0) r0
                gy3.a0 r5 = new gy3.a0
                r5.<init>()
                sa0.a r6 = r1.f180664h
                ha0.t r7 = ha0.C108221t.f324032a
                la0.a$c r8 = r6.f180641d
                r1.f180663g = r0
                r1.f180660d = r5
                r1.f180661e = r6
                r1.f180662f = r4
                java.lang.Object r0 = r7.mo158627g(r8, r1)
                if (r0 != r2) goto L_0x004f
                return r2
            L_0x004f:
                ha0.c0 r0 = (ha0.C108183c0) r0
                r6.f180644g = r0
                sa0.a r0 = r1.f180664h
                android.view.Surface r0 = r0.f180646i
                java.lang.String r6 = "MicroMsg.Maas.MaasSdkApiFlutterPlugin"
                if (r0 == 0) goto L_0x006c
                java.lang.String r7 = "startMovieCreation: setSurface"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                sa0.a r7 = r1.f180664h
                ha0.c0 r7 = r7.f180644g
                if (r7 == 0) goto L_0x006c
                com.tencent.maas.instamovie.MJMovieSession r7 = r7.f323934a
                r7.setSurface(r0)
            L_0x006c:
                sa0.a r0 = r1.f180664h
                ha0.c0 r7 = r0.f180644g
                if (r7 != 0) goto L_0x0082
                com.tencent.pigeon.MaasApi$Result<java.lang.Boolean> r0 = r1.f180668o
                java.lang.String r2 = "startMovieCreation: movieSessionManager is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.success(r2)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0082:
                te3.rf4 r0 = new te3.rf4
                r0.<init>()
                byte[] r8 = r1.f180665i
                r13 = 0
                r9 = 0
                if (r8 != 0) goto L_0x008e
                goto L_0x009f
            L_0x008e:
                r0.parseFrom(r8)     // Catch:{ Exception -> 0x0092 }
                goto L_0x00a0
            L_0x0092:
                r0 = move-exception
                r8 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r9] = r8
                java.lang.String r8 = "safeParser"
                java.lang.String r10 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r10, r0)
            L_0x009f:
                r0 = r13
            L_0x00a0:
                if (r0 != 0) goto L_0x00b2
                com.tencent.pigeon.MaasApi$Result<java.lang.Boolean> r0 = r1.f180668o
                java.lang.String r2 = "startMovieCreation: mediaInfo parse error"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.success(r2)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x00b2:
                java.util.LinkedList<te3.qf4> r0 = r0.f140886d
                java.lang.String r8 = "mediaInfoList.media_resource"
                gy3.C87412m.m108593f(r0, r8)
                java.util.ArrayList r10 = new java.util.ArrayList
                r8 = 10
                int r8 = sx3.C36907w.m41090l(r0, r8)
                r10.<init>(r8)
                java.util.Iterator r0 = r0.iterator()
            L_0x00c8:
                boolean r8 = r0.hasNext()
                if (r8 == 0) goto L_0x00fb
                java.lang.Object r8 = r0.next()
                te3.qf4 r8 = (te3.qf4) r8
                int r11 = r8.f140285d
                if (r11 != r4) goto L_0x00e8
                r14 = 1
                r15 = 0
                java.lang.String r8 = r8.f140286e
                java.lang.String r19 = ""
                r17 = r8
                r18 = r8
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r14, r15, r17, r18, r19)
                goto L_0x00f7
            L_0x00e8:
                r14 = 2
                r15 = 0
                java.lang.String r8 = r8.f140286e
                java.lang.String r19 = ""
                r17 = r8
                r18 = r8
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r14, r15, r17, r18, r19)
            L_0x00f7:
                r10.add(r8)
                goto L_0x00c8
            L_0x00fb:
                java.lang.String r0 = r1.f180666j
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0104
                goto L_0x0105
            L_0x0104:
                r4 = 0
            L_0x0105:
                if (r4 == 0) goto L_0x0116
                java.lang.String r0 = "startMovieCreation: use blank template"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                java.lang.String r0 = r1.f180667n
                sa0.a$b$a r4 = sa0.C63725a.C63730b.C63731a.f180669a
                d14.f r0 = r7.mo158619h(r10, r0, r9, r4)
                goto L_0x0138
            L_0x0116:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "startMovieCreation: tmpl id "
                r0.append(r4)
                java.lang.String r4 = r1.f180666j
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                java.lang.String r8 = r1.f180666j
                java.lang.String r9 = r1.f180667n
                r11 = 0
                sa0.a$b$b r12 = sa0.C63725a.C63730b.C63732b.f180670a
                d14.f r0 = r7.mo158618g(r8, r9, r10, r11, r12)
            L_0x0138:
                sa0.a$b$c r4 = new sa0.a$b$c
                com.tencent.pigeon.MaasApi$Result<java.lang.Boolean> r6 = r1.f180668o
                r4.<init>(r6, r5, r13)
                d14.t r6 = new d14.t
                r6.<init>(r0, r4)
                sa0.a$b$d r0 = new sa0.a$b$d
                com.tencent.pigeon.MaasApi$Result<java.lang.Boolean> r4 = r1.f180668o
                r0.<init>(r5, r4, r13)
                d14.q r4 = new d14.q
                r4.<init>(r6, r0)
                sa0.a$b$e r0 = sa0.C63725a.C63730b.C63735e.f180677d
                r1.f180663g = r13
                r1.f180660d = r13
                r1.f180661e = r13
                r1.f180662f = r3
                java.lang.Object r0 = r4.mo31880a(r0, r1)
                if (r0 != r2) goto L_0x0161
                return r2
            L_0x0161:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sa0.C63725a.C63730b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$stopPlay$1", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {224}, mo125471m = "invokeSuspend")
    /* renamed from: sa0.a$c */
    public static final class C63736c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f180678d;

        /* renamed from: e */
        public /* synthetic */ Object f180679e;

        /* renamed from: f */
        public final /* synthetic */ C63725a f180680f;

        /* renamed from: g */
        public final /* synthetic */ MaasApi.Result<Boolean> f180681g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63736c(C63725a aVar, MaasApi.Result<Boolean> result, C15601d<? super C63736c> dVar) {
            super(2, dVar);
            this.f180680f = aVar;
            this.f180681g = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63736c cVar = new C63736c(this.f180680f, this.f180681g, dVar);
            cVar.f180679e = obj;
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63736c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f180678d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f180679e;
                C108183c0 c0Var = this.f180680f.f180644g;
                if (c0Var == null) {
                    MaasApi.Result<Boolean> result = this.f180681g;
                    Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "stopPlay: movieSessionManager is null");
                    result.success(Boolean.FALSE);
                    return C13598b0.f38549a;
                }
                this.f180678d = 1;
                obj = c0Var.mo158621k(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "stopPlay: " + booleanValue);
            this.f180681g.success(Boolean.valueOf(booleanValue));
            return C13598b0.f38549a;
        }
    }

    public void initRenderSurface(Long l, Long l2, MaasApi.Result result) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        C87412m.m108594g(result, "result");
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: width " + longValue + ", height " + longValue2);
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setReportScene: " + 6 + ", field: " + C60781a.f173119b);
        C60781a.f173119b = 6;
        if (this.f180646i != null) {
            Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: renderSurface is not null");
            return;
        }
        TextureRegistry textureRegistry = this.f180642e;
        if (textureRegistry == null) {
            Log.m105920e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "textureRegistry is null");
            result.success(-1L);
            return;
        }
        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
        if (createSurfaceTexture == null) {
            Log.m105920e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "createTexture error");
            result.success(-1L);
            return;
        }
        Surface surface = this.f180646i;
        if (surface != null) {
            surface.release();
        }
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.f180645h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        Surface surface2 = new Surface(createSurfaceTexture.surfaceTexture());
        createSurfaceTexture.surfaceTexture().setDefaultBufferSize((int) longValue, (int) longValue2);
        this.f180645h = createSurfaceTexture;
        this.f180646i = surface2;
        C108221t.f324032a.mo158631k(false);
        result.success(Long.valueOf(createSurfaceTexture.mo159349id()));
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface id " + createSurfaceTexture.mo159349id());
        if (this.f180644g != null) {
            Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: setSurface");
            C108183c0 c0Var = this.f180644g;
            if (c0Var != null) {
                c0Var.f323934a.setSurface(surface2);
            }
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "p0");
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "onAttachedToEngine");
        this.f180642e = flutterPluginBinding.getTextureRegistry();
        MaasApi.MaasFlutterApi.setup(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "p0");
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "onDetachedFromEngine");
        this.f180642e = null;
    }

    public void recreateCreation(String str, String str2, MaasApi.Result<Boolean> result) {
        C87412m.m108594g(str, "templateId");
        C87412m.m108594g(str2, "musicId");
        C87412m.m108594g(result, "result");
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: " + str + ' ' + str2);
        C53895h.m60466d(this.f180643f, (C66212f) null, (C53934p0) null, new C63726a(this, str, str2, result, (C15601d<? super C63726a>) null), 3, (Object) null);
    }

    public void release() {
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "release");
        C108183c0 c0Var = this.f180644g;
        if (c0Var != null) {
            c0Var.f323934a.setSurface((Surface) null);
        }
        C108183c0 c0Var2 = this.f180644g;
        if (c0Var2 != null) {
            c0Var2.mo158617f();
        }
        this.f180644g = null;
        Surface surface = this.f180646i;
        if (surface != null) {
            surface.release();
        }
        this.f180646i = null;
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.f180645h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        this.f180645h = null;
    }

    public void startMovieCreation(String str, String str2, byte[] bArr, MaasApi.Result<Boolean> result) {
        C87412m.m108594g(str, "templateId");
        C87412m.m108594g(str2, "musicId");
        C87412m.m108594g(bArr, "mediaInfo");
        C87412m.m108594g(result, "result");
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startMovieCreation() called with: templateId = " + str + ", musicId = " + str2 + ", mediaInfo = " + bArr);
        C53895h.m60466d(this.f180643f, (C66212f) null, (C53934p0) null, new C63730b(this, bArr, str, str2, result, (C15601d<? super C63730b>) null), 3, (Object) null);
    }

    public void startPlay(Long l, MaasApi.Result result) {
        long longValue = l.longValue();
        C87412m.m108594g(result, "result");
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: " + longValue);
        C53895h.m60466d(this.f180643f, (C66212f) null, (C53934p0) null, new C63737b(this, longValue, result, (C15601d<? super C63737b>) null), 3, (Object) null);
    }

    public void stopPlay(MaasApi.Result<Boolean> result) {
        C87412m.m108594g(result, "result");
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "stopPlay");
        C53895h.m60466d(this.f180643f, (C66212f) null, (C53934p0) null, new C63736c(this, result, (C15601d<? super C63736c>) null), 3, (Object) null);
    }
}
