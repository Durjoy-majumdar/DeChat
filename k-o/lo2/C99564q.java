package lo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import d14.C45252f;
import d14.C45253g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: lo2.q */
public final class C99564q implements C45252f<SnsInfo> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f291856d;

    /* renamed from: e */
    public final /* synthetic */ String f291857e;

    /* renamed from: lo2.q$a */
    public static final class C99565a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C45253g f291858d;

        /* renamed from: e */
        public final /* synthetic */ String f291859e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1$2", mo125469f = "AdInteractHelper.kt", mo125470l = {224}, mo125471m = "emit")
        /* renamed from: lo2.q$a$a */
        public static final class C99566a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f291860d;

            /* renamed from: e */
            public int f291861e;

            /* renamed from: f */
            public final /* synthetic */ C99565a f291862f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99566a(C99565a aVar, C15601d dVar) {
                super(dVar);
                this.f291862f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1$2$1");
                this.f291860d = obj;
                this.f291861e |= Integer.MIN_VALUE;
                Object emit = this.f291862f.emit((Object) null, this);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1$2$1");
                return emit;
            }
        }

        public C99565a(C45253g gVar, String str) {
            this.f291858d = gVar;
            this.f291859e = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r8, wx3.C15601d r9) {
            /*
                r7 = this;
                java.lang.String r0 = "emit"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                boolean r2 = r9 instanceof lo2.C99564q.C99565a.C99566a
                if (r2 == 0) goto L_0x001a
                r2 = r9
                lo2.q$a$a r2 = (lo2.C99564q.C99565a.C99566a) r2
                int r3 = r2.f291861e
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x001a
                int r3 = r3 - r4
                r2.f291861e = r3
                goto L_0x001f
            L_0x001a:
                lo2.q$a$a r2 = new lo2.q$a$a
                r2.<init>(r7, r9)
            L_0x001f:
                java.lang.Object r9 = r2.f291860d
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r2.f291861e
                r5 = 1
                if (r4 == 0) goto L_0x0039
                if (r4 != r5) goto L_0x002e
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x005d
            L_0x002e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r8
            L_0x0039:
                kotlin.ResultKt.throwOnFailure(r9)
                d14.g r9 = r7.f291858d
                r4 = r8
                com.tencent.mm.plugin.sns.storage.SnsInfo r4 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r4
                if (r4 == 0) goto L_0x0048
                java.lang.String r4 = r4.getSnsId()
                goto L_0x0049
            L_0x0048:
                r4 = 0
            L_0x0049:
                java.lang.String r6 = r7.f291859e
                boolean r4 = gy3.C87412m.m108589b(r4, r6)
                if (r4 == 0) goto L_0x005d
                r2.f291861e = r5
                java.lang.Object r8 = r9.emit(r8, r2)
                if (r8 != r3) goto L_0x005d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r3
            L_0x005d:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: lo2.C99564q.C99565a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C99564q(C45252f fVar, String str) {
        this.f291856d = fVar;
        this.f291857e = str;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1");
        Object a = this.f291856d.mo31880a(new C99565a(gVar, this.f291857e), dVar);
        if (a == C15911a.COROUTINE_SUSPENDED) {
            SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1");
            return a;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1");
        return b0Var;
    }
}
