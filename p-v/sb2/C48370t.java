package sb2;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import kotlin.ResultKt;
import pb0.C47445a;
import rx3.C13598b0;
import te3.C50902q13;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerDataUIC$syncBeatTrack$1", mo125469f = "MusicMvMakerDataUIC.kt", mo125470l = {133}, mo125471m = "invokeSuspend")
/* renamed from: sb2.t */
public final class C48370t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f129492d;

    /* renamed from: e */
    public final /* synthetic */ C45252f<C47445a<C50902q13>> f129493e;

    /* renamed from: f */
    public final /* synthetic */ C63844s f129494f;

    /* renamed from: sb2.t$a */
    public static final class C48371a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C63844s f129495d;

        public C48371a(C63844s sVar) {
            this.f129495d = sVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
            r0 = r0.f140090e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r3, wx3.C15601d r4) {
            /*
                r2 = this;
                pb0.a r3 = (pb0.C47445a) r3
                qb0.b r4 = r3.f128348a
                qb0.b r0 = qb0.C47798b.OnEnd
                if (r4 != r0) goto L_0x0076
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "syncBeatTrack sceneEnd errType:"
                r4.append(r0)
                int r0 = r3.f128349b
                r4.append(r0)
                java.lang.String r0 = " errCode:"
                r4.append(r0)
                int r0 = r3.f128350c
                r4.append(r0)
                java.lang.String r0 = " errMsg:"
                r4.append(r0)
                java.lang.String r0 = r3.f128351d
                r4.append(r0)
                java.lang.String r0 = " flexSize:"
                r4.append(r0)
                T r0 = r3.f128353f
                te3.q13 r0 = (te3.C50902q13) r0
                if (r0 == 0) goto L_0x0045
                java.util.LinkedList<java.lang.Integer> r0 = r0.f140090e
                if (r0 == 0) goto L_0x0045
                int r0 = r0.size()
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                goto L_0x0046
            L_0x0045:
                r1 = 0
            L_0x0046:
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "MicroMsg.Mv.MusicMvMakerDataUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                int r4 = r3.f128350c
                if (r4 != 0) goto L_0x0076
                sb2.s r4 = r2.f129495d
                androidx.lifecycle.z<te3.p23> r4 = r4.f180976f
                java.lang.Object r4 = r4.getValue()
                te3.p23 r4 = (te3.C64621p23) r4
                if (r4 != 0) goto L_0x0063
                goto L_0x0076
            L_0x0063:
                T r3 = r3.f128353f
                te3.q13 r3 = (te3.C50902q13) r3
                if (r3 == 0) goto L_0x0072
                java.util.LinkedList<java.lang.Integer> r3 = r3.f140090e
                if (r3 == 0) goto L_0x0072
                int r3 = r3.size()
                goto L_0x0074
            L_0x0072:
                r3 = 20
            L_0x0074:
                r4.f184745j = r3
            L_0x0076:
                rx3.b0 r3 = rx3.C13598b0.f38549a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: sb2.C48370t.C48371a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48370t(C45252f<C47445a<C50902q13>> fVar, C63844s sVar, C15601d<? super C48370t> dVar) {
        super(2, dVar);
        this.f129493e = fVar;
        this.f129494f = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C48370t(this.f129493e, this.f129494f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C48370t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f129492d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<C47445a<C50902q13>> fVar = this.f129493e;
            C48371a aVar2 = new C48371a(this.f129494f);
            this.f129492d = 1;
            if (fVar.mo31880a(aVar2, this) == aVar) {
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
