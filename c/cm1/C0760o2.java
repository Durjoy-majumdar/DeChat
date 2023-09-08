package cm1;

import a14.C0000n0;
import a14.C53921m;
import android.graphics.Bitmap;
import cm1.C0742j2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p391w3.C22857b;
import p599lr.C61381b;
import qo1.C12899g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SetProfileCoverViewModel$setProfileCover$1", mo125469f = "SetProfileCoverViewModel.kt", mo125470l = {45, 47}, mo125471m = "invokeSuspend")
/* renamed from: cm1.o2 */
public final class C0760o2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f1791d;

    /* renamed from: e */
    public /* synthetic */ Object f1792e;

    /* renamed from: f */
    public final /* synthetic */ String f1793f;

    /* renamed from: g */
    public final /* synthetic */ C0742j2 f1794g;

    /* renamed from: h */
    public final /* synthetic */ C0742j2.C0743a f1795h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SetProfileCoverViewModel$setProfileCover$1$extractColorTask$1", mo125469f = "SetProfileCoverViewModel.kt", mo125470l = {42}, mo125471m = "invokeSuspend")
    /* renamed from: cm1.o2$a */
    public static final class C0761a extends C91594j implements C32227p<C0000n0, C15601d<? super Integer>, Object> {

        /* renamed from: d */
        public int f1796d;

        /* renamed from: e */
        public final /* synthetic */ C0742j2 f1797e;

        /* renamed from: f */
        public final /* synthetic */ String f1798f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0761a(C0742j2 j2Var, String str, C15601d<? super C0761a> dVar) {
            super(2, dVar);
            this.f1797e = j2Var;
            this.f1798f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0761a(this.f1797e, this.f1798f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0761a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Integer num;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1796d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0742j2 j2Var = this.f1797e;
                String str = this.f1798f;
                this.f1796d = 1;
                j2Var.getClass();
                Bitmap createThumbBitmap = BitmapUtil.createThumbBitmap(str, 4, 4, false, false);
                if (createThumbBitmap == null || createThumbBitmap.isRecycled()) {
                    num = new Integer(-1);
                } else {
                    C22857b.C22862e eVar = new C22857b.C22859b(createThumbBitmap).mo36019b().f65701e;
                    Integer num2 = eVar != null ? new Integer(eVar.f65714d) : null;
                    int i2 = C85875k4.m106174c(createThumbBitmap, 4, 4)[0];
                    int intValue = num2 != null ? num2.intValue() : i2;
                    Log.m105924i("Finder.SetProfileCoverViewModel", "rgbColor domainRgb:" + num2 + "  bgRgb:" + i2);
                    num = new Integer(C58784w3.f168295a.mo83888N(0.0f, intValue));
                }
                obj = num;
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SetProfileCoverViewModel$setProfileCover$1$uploadTask$1", mo125469f = "SetProfileCoverViewModel.kt", mo125470l = {38}, mo125471m = "invokeSuspend")
    /* renamed from: cm1.o2$b */
    public static final class C0762b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

        /* renamed from: d */
        public int f1799d;

        /* renamed from: e */
        public final /* synthetic */ C0742j2 f1800e;

        /* renamed from: f */
        public final /* synthetic */ String f1801f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0762b(C0742j2 j2Var, String str, C15601d<? super C0762b> dVar) {
            super(2, dVar);
            this.f1800e = j2Var;
            this.f1801f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0762b(this.f1800e, this.f1801f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0762b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1799d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0742j2 j2Var = this.f1800e;
                String str = this.f1801f;
                this.f1799d = 1;
                j2Var.getClass();
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                Log.m105925i("Finder.SetProfileCoverViewModel", "cover file length %d KB", new Long(C86013q1.m106451l(str) / ((long) 1024)));
                mVar.mo74599v(new C0769q2(mVar));
                C12899g UQ = ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ();
                C87412m.m108591d(str);
                UQ.mo12408a(str, new C0771r2(mVar));
                obj = mVar.mo74608o();
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
    public C0760o2(String str, C0742j2 j2Var, C0742j2.C0743a aVar, C15601d<? super C0760o2> dVar) {
        super(2, dVar);
        this.f1793f = str;
        this.f1794g = j2Var;
        this.f1795h = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C0760o2 o2Var = new C0760o2(this.f1793f, this.f1794g, this.f1795h, dVar);
        o2Var.f1792e = obj;
        return o2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0760o2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f1791d
            r2 = 2
            r3 = 1
            java.lang.String r4 = "Finder.SetProfileCoverViewModel"
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r13.f1792e
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0092
        L_0x0017:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001f:
            java.lang.Object r1 = r13.f1792e
            a14.u0 r1 = (a14.C53953u0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x007d
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f1792e
            a14.n0 r14 = (a14.C0000n0) r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "setProfileCover :"
            r1.append(r5)
            java.lang.String r5 = r13.f1793f
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r6 = 0
            r7 = 0
            cm1.o2$b r8 = new cm1.o2$b
            cm1.j2 r1 = r13.f1794g
            java.lang.String r5 = r13.f1793f
            r11 = 0
            r8.<init>(r1, r5, r11)
            r9 = 3
            r10 = 0
            r5 = r14
            a14.u0 r1 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
            cm1.o2$a r8 = new cm1.o2$a
            cm1.j2 r5 = r13.f1794g
            java.lang.String r9 = r13.f1793f
            r8.<init>(r5, r9, r11)
            r9 = 3
            r5 = r14
            a14.u0 r14 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
            java.lang.String r5 = "setProfileCover await begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r13.f1792e = r14
            r13.f1791d = r3
            a14.v0 r1 = (a14.C53957v0) r1
            java.lang.Object r1 = r1.mo74549z(r13)
            if (r1 != r0) goto L_0x007a
            return r0
        L_0x007a:
            r12 = r1
            r1 = r14
            r14 = r12
        L_0x007d:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r3 = "setProfileCover await 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r13.f1792e = r14
            r13.f1791d = r2
            java.lang.Object r1 = r1.mo74634A(r13)
            if (r1 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r0 = r14
            r14 = r1
        L_0x0092:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.String r1 = java.lang.Integer.toHexString(r14)
            java.lang.String r2 = "setProfileCover await 2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "uploadedUrl :"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " extractColor :"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " hexColor:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x00e2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&bgColor="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x00e4
        L_0x00e2:
            java.lang.String r0 = ""
        L_0x00e4:
            cm1.j2 r1 = r13.f1794g
            cm1.j2$a r2 = r13.f1795h
            r1.getClass()
            cm1.n2 r3 = new cm1.n2
            r3.<init>(r1, r2, r0, r14)
            r1.f1763d = r3
            java.lang.Class<com.tencent.mm.plugin.finder.service.p1> r14 = com.tencent.p014mm.plugin.finder.service.C3605p1.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            com.tencent.mm.plugin.finder.service.p1 r14 = (com.tencent.p014mm.plugin.finder.service.C3605p1) r14
            ht1.p5<te3.md1> r1 = r1.f1763d
            r14.mo3986l9(r0, r1)
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0760o2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
