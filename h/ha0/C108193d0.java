package ha0;

import com.tencent.maas.instamovie.MJExportSettings;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import di3.C86312j;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C59741c0;
import gy3.C8477a0;
import gy3.C87412m;
import h81.C32735h;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasMovieSessionManager$export$1", mo125469f = "MaasMovieSessionManager.kt", mo125470l = {381, 387}, mo125471m = "invokeSuspend")
/* renamed from: ha0.d0 */
public final class C108193d0 extends C91594j implements C32227p<C45253g<? super Float>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f323969d;

    /* renamed from: e */
    public Object f323970e;

    /* renamed from: f */
    public int f323971f;

    /* renamed from: g */
    public /* synthetic */ Object f323972g;

    /* renamed from: h */
    public final /* synthetic */ C108183c0 f323973h;

    /* renamed from: i */
    public final /* synthetic */ String f323974i;

    /* renamed from: j */
    public final /* synthetic */ MJExportSettings f323975j;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasMovieSessionManager$export$1$1", mo125469f = "MaasMovieSessionManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ha0.d0$a */
    public static final class C108194a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f323976d;

        /* renamed from: e */
        public final /* synthetic */ MJExportSettings f323977e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f323978f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108194a(MJExportSettings mJExportSettings, C8477a0 a0Var, C15601d<? super C108194a> dVar) {
            super(3, dVar);
            this.f323977e = mJExportSettings;
            this.f323978f = a0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C108194a aVar = new C108194a(this.f323977e, this.f323978f, (C15601d) obj3);
            aVar.f323976d = (Throwable) obj2;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.f323976d;
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_maas_export_disable_export_retry, false);
            Log.m105924i("MicroMsg.MaasAlbumTemplateGlobalConfig", "disableExportRetry " + wf);
            if (!(!wf)) {
                Log.m105924i("MicroMsg.MaasMovieSessionManager", "export: disable retry");
                throw th;
            } else if (C87412m.m108589b(this.f323977e.getVideoEncoderName(), MJExportSettings.VIDEO_ENCODER_AMC_HARDWARE)) {
                this.f323978f.f27482d = true;
                this.f323977e.setVideoEncoderName(MJExportSettings.VIDEO_ENCODER_VCODEC);
                return C13598b0.f38549a;
            } else {
                throw th;
            }
        }
    }

    /* renamed from: ha0.d0$b */
    public static final class C108195b implements C45253g<Float> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f323979d;

        /* renamed from: e */
        public final /* synthetic */ C45253g<Float> f323980e;

        public C108195b(C59741c0 c0Var, C45253g<? super Float> gVar) {
            this.f323979d = c0Var;
            this.f323980e = gVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            float floatValue = ((Number) obj).floatValue();
            this.f323979d.f170634d = floatValue;
            Object emit = this.f323980e.emit(new Float(floatValue), dVar);
            return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
        }
    }

    /* renamed from: ha0.d0$c */
    public static final class C108196c implements C45253g<Float> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f323981d;

        /* renamed from: e */
        public final /* synthetic */ C45253g<Float> f323982e;

        public C108196c(C59741c0 c0Var, C45253g<? super Float> gVar) {
            this.f323981d = c0Var;
            this.f323982e = gVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            float floatValue = ((Number) obj).floatValue();
            if (floatValue <= this.f323981d.f170634d) {
                return C13598b0.f38549a;
            }
            Object emit = this.f323982e.emit(new Float(floatValue), dVar);
            return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108193d0(C108183c0 c0Var, String str, MJExportSettings mJExportSettings, C15601d<? super C108193d0> dVar) {
        super(2, dVar);
        this.f323973h = c0Var;
        this.f323974i = str;
        this.f323975j = mJExportSettings;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C108193d0 d0Var = new C108193d0(this.f323973h, this.f323974i, this.f323975j, dVar);
        d0Var.f323972g = obj;
        return d0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108193d0) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: d14.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f323971f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0092
        L_0x0012:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001a:
            java.lang.Object r1 = r10.f323970e
            gy3.c0 r1 = (gy3.C59741c0) r1
            java.lang.Object r5 = r10.f323969d
            gy3.a0 r5 = (gy3.C8477a0) r5
            java.lang.Object r6 = r10.f323972g
            d14.g r6 = (d14.C45253g) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0067
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f323972g
            r6 = r11
            d14.g r6 = (d14.C45253g) r6
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            gy3.c0 r1 = new gy3.c0
            r1.<init>()
            ha0.c0 r11 = r10.f323973h
            java.lang.String r7 = r10.f323974i
            com.tencent.maas.instamovie.MJExportSettings r8 = r10.f323975j
            r9 = 0
            d14.f r11 = ha0.C108183c0.m146536a(r11, r7, r8, r9)
            ha0.d0$a r7 = new ha0.d0$a
            com.tencent.maas.instamovie.MJExportSettings r8 = r10.f323975j
            r7.<init>(r8, r5, r4)
            d14.t r8 = new d14.t
            r8.<init>(r11, r7)
            ha0.d0$b r11 = new ha0.d0$b
            r11.<init>(r1, r6)
            r10.f323972g = r6
            r10.f323969d = r5
            r10.f323970e = r1
            r10.f323971f = r3
            java.lang.Object r11 = r8.mo31880a(r11, r10)
            if (r11 != r0) goto L_0x0067
            return r0
        L_0x0067:
            boolean r11 = r5.f27482d
            if (r11 == 0) goto L_0x0092
            java.lang.String r11 = "MicroMsg.MaasMovieSessionManager"
            java.lang.String r5 = "retry export"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r5)
            ha0.c0 r11 = r10.f323973h
            java.lang.String r5 = r10.f323974i
            com.tencent.maas.instamovie.MJExportSettings r7 = r10.f323975j
            d14.f r11 = ha0.C108183c0.m146536a(r11, r5, r7, r3)
            ha0.d0$c r3 = new ha0.d0$c
            r3.<init>(r1, r6)
            r10.f323972g = r4
            r10.f323969d = r4
            r10.f323970e = r4
            r10.f323971f = r2
            e14.g r11 = (e14.C58482g) r11
            java.lang.Object r11 = r11.mo31880a(r3, r10)
            if (r11 != r0) goto L_0x0092
            return r0
        L_0x0092:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108193d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
