package com.tencent.p014mm.plugin.vlog.model;

import a14.C0000n0;
import a14.C53869d;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import p213oh.C11412b;
import rx3.C13598b0;
import sp3.C110801c;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.model.SourceMaterial$Companion$asyncSourceToTrackList$2", mo125469f = "SourceMaterial.kt", mo125470l = {157}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.vlog.model.k0 */
public final class C96547k0 extends C91594j implements C32227p<C0000n0, C15601d<? super List<? extends C106205q0>>, Object> {

    /* renamed from: d */
    public int f282558d;

    /* renamed from: e */
    public /* synthetic */ Object f282559e;

    /* renamed from: f */
    public final /* synthetic */ List<C96549l0> f282560f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.model.SourceMaterial$Companion$asyncSourceToTrackList$2$requests$1$1", mo125469f = "SourceMaterial.kt", mo125470l = {156}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.model.k0$a */
    public static final class C96548a extends C91594j implements C32227p<C0000n0, C15601d<? super C106205q0>, Object> {

        /* renamed from: d */
        public int f282561d;

        /* renamed from: e */
        public final /* synthetic */ C96549l0 f282562e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96548a(C96549l0 l0Var, C15601d<? super C96548a> dVar) {
            super(2, dVar);
            this.f282562e = l0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C96548a(this.f282562e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C96548a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r4.f282561d
                r2 = 1
                if (r1 == 0) goto L_0x0015
                if (r1 != r2) goto L_0x000d
                kotlin.ResultKt.throwOnFailure(r5)
                goto L_0x004e
            L_0x000d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0015:
                kotlin.ResultKt.throwOnFailure(r5)
                com.tencent.mm.plugin.vlog.model.l0 r5 = r4.f282562e
                r4.f282561d = r2
                boolean r1 = r5 instanceof com.tencent.p014mm.plugin.vlog.model.C96560z0
                if (r1 == 0) goto L_0x0034
                com.tencent.mm.plugin.vlog.model.q0 r1 = new com.tencent.mm.plugin.vlog.model.q0
                r2 = r5
                com.tencent.mm.plugin.vlog.model.z0 r2 = (com.tencent.p014mm.plugin.vlog.model.C96560z0) r2
                java.lang.String r2 = r2.f282624e
                r3 = 2
                int r5 = r5.f282566c
                r1.<init>(r2, r3, r5)
                sp3.c r5 = r1.f316501l
                r5.mo162363a()
            L_0x0032:
                r5 = r1
                goto L_0x004b
            L_0x0034:
                boolean r1 = r5 instanceof com.tencent.p014mm.plugin.vlog.model.C96531b0
                if (r1 == 0) goto L_0x004a
                com.tencent.mm.plugin.vlog.model.q0 r1 = new com.tencent.mm.plugin.vlog.model.q0
                r3 = r5
                com.tencent.mm.plugin.vlog.model.b0 r3 = (com.tencent.p014mm.plugin.vlog.model.C96531b0) r3
                java.lang.String r3 = r3.f282487e
                int r5 = r5.f282566c
                r1.<init>(r3, r2, r5)
                sp3.c r5 = r1.f316501l
                r5.mo162363a()
                goto L_0x0032
            L_0x004a:
                r5 = 0
            L_0x004b:
                if (r5 != r0) goto L_0x004e
                return r0
            L_0x004e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C96547k0.C96548a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96547k0(List<? extends C96549l0> list, C15601d<? super C96547k0> dVar) {
        super(2, dVar);
        this.f282560f = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C96547k0 k0Var = new C96547k0(this.f282560f, dVar);
        k0Var.f282559e = obj;
        return k0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C96547k0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C96560z0 z0Var;
        long j;
        int i;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i2 = this.f282558d;
        Object[] objArr = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f282559e;
            List<C96549l0> list = this.f282560f;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C96549l0 aVar2 : list) {
                arrayList.add(C53895h.m60464b(n0Var, (C66212f) null, (C53934p0) null, new C96548a(aVar2, (C15601d<? super C96548a>) null), 3, (Object) null));
            }
            this.f282558d = 1;
            obj2 = C53869d.m60385a(arrayList, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<C106205q0> J = C110818d0.m150912J((Iterable) obj2);
        List<C96549l0> list2 = this.f282560f;
        int i3 = 0;
        for (Object next : J) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C106205q0 q0Var = (C106205q0) next;
                C96549l0 l0Var = list2.get(i3);
                int i5 = q0Var.f316491b;
                long j2 = 4000;
                if (i5 == 1) {
                    C87412m.m108592e(l0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ImageSource");
                    q0Var.f316500k.type = 1;
                    j = 4000;
                    z0Var = (C96531b0) l0Var;
                } else if (i5 != 2) {
                    int i6 = C11412b.f33577a;
                    Log.m105925i("MicroMsg.SourceMaterial", "unknown track type:" + q0Var.f316491b, objArr);
                    j = 0;
                    j2 = 0;
                    z0Var = l0Var;
                } else {
                    C87412m.m108592e(l0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoSource");
                    C96560z0 z0Var2 = (C96560z0) l0Var;
                    j = z0Var2.f282625f;
                    long j3 = 60000;
                    if (j <= 60000) {
                        j3 = j;
                    }
                    q0Var.f316500k.type = 2;
                    j2 = j3;
                    z0Var = z0Var2;
                }
                q0Var.mo81190d(0);
                q0Var.mo81188b(j2);
                MediaEditReportInfo.EditItem editItem = q0Var.f316500k;
                editItem.originDuration = j;
                editItem.targetDuration = j;
                int i7 = z0Var.f282564a;
                if (i7 > 1080 || (i = z0Var.f282565b) > 1280) {
                    float max = Math.max((((float) i7) * 1.0f) / ((float) 1080), (((float) z0Var.f282565b) * 1.0f) / ((float) 1280));
                    q0Var.f316495f = (int) (((float) z0Var.f282564a) / max);
                    q0Var.f316496g = (int) (((float) z0Var.f282565b) / max);
                    q0Var.f316497h = max;
                } else {
                    q0Var.f316495f = i7;
                    q0Var.f316496g = i;
                }
                i3 = i4;
                objArr = null;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C110801c.C101691a aVar3 = C110801c.f331462v;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(J, 10));
        for (C106205q0 q0Var2 : J) {
            arrayList2.add(q0Var2.f316501l);
        }
        aVar3.mo141145a(arrayList2);
        return J;
    }
}
