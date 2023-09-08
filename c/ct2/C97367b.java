package ct2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53921m;
import a14.C53934p0;
import androidx.lifecycle.C54219z;
import bl3.C0317e;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import d14.C45252f;
import d14.C45253g;
import d14.C58042h;
import d14.C58078q;
import d14.C58083t;
import d14.C58095x0;
import dt2.C45449a;
import dt2.C45450b;
import dt2.C45452c;
import dt2.C45453d;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.ResultKt;
import nr3.C89059e;
import os2.C100422y;
import rx3.C13598b0;
import sf0.C48374j0;
import te3.r74;
import vr2.C102236a0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: ct2.b */
public final class C97367b extends C0317e {

    /* renamed from: d */
    public final String f285848d = "MicroMsg.SnsCoverViewModel";

    /* renamed from: e */
    public final C54219z<C100422y> f285849e = new C54219z<>();

    /* renamed from: f */
    public final HashSet<Long> f285850f = new HashSet<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1", mo125469f = "SnsCoverViewModel.kt", mo125470l = {66}, mo125471m = "invokeSuspend")
    /* renamed from: ct2.b$a */
    public static final class C97368a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285851d;

        /* renamed from: e */
        public final /* synthetic */ C97367b f285852e;

        /* renamed from: f */
        public final /* synthetic */ long f285853f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1", mo125469f = "SnsCoverViewModel.kt", mo125470l = {43, 45}, mo125471m = "invokeSuspend")
        /* renamed from: ct2.b$a$a */
        public static final class C45203a extends C91594j implements C32227p<C45253g<? super SnsObject>, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f122523d;

            /* renamed from: e */
            public /* synthetic */ Object f122524e;

            /* renamed from: f */
            public final /* synthetic */ long f122525f;

            /* renamed from: g */
            public final /* synthetic */ C97367b f122526g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45203a(long j, C97367b bVar, C15601d<? super C45203a> dVar) {
                super(2, dVar);
                this.f122525f = j;
                this.f122526g = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                C45203a aVar = new C45203a(this.f122525f, this.f122526g, dVar);
                aVar.f122524e = obj;
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                Object invokeSuspend = ((C45203a) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                C45253g gVar;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f122523d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    gVar = (C45253g) this.f122524e;
                    C45449a aVar2 = new C45449a(this.f122525f);
                    this.f122524e = gVar;
                    this.f122523d = 1;
                    SnsMethodCalculate.markStartTimeMs("await", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    C89059e i2 = aVar2.mo9225i();
                    i2.mo123420E(new C45453d(aVar2, mVar));
                    mVar.mo74599v(new C45452c(i2));
                    obj2 = mVar.mo74608o();
                    SnsMethodCalculate.markEndTimeMs("await", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
                    if (obj2 == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                        return aVar;
                    }
                } else if (i == 1) {
                    gVar = (C45253g) this.f122524e;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    Log.m105924i(C97367b.m125394c3(this.f122526g), "updateUserCoverFromDetail emit resp");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                    return b0Var;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                    throw illegalStateException;
                }
                r74 r74 = (r74) obj2;
                SnsObject snsObject = r74.f140749d;
                SnsMethodCalculate.markStartTimeMs("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                if (snsObject == null) {
                    SnsMethodCalculate.markEndTimeMs("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                } else {
                    SnsCoverReportStruct snsCoverReportStruct = new SnsCoverReportStruct();
                    String f = C48374j0.m53717f(snsObject.ObjectDesc);
                    snsCoverReportStruct.f265987d = 6;
                    snsCoverReportStruct.f265989f = snsCoverReportStruct.mo86045b("UserName", snsObject.Username, true);
                    snsCoverReportStruct.mo126629s(C112551y.m153816p("xmlString:" + f, ",", ";", false, 4, (Object) null));
                    snsCoverReportStruct.f265997n = 0;
                    snsCoverReportStruct.mo86054n();
                    SnsMethodCalculate.markEndTimeMs("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                }
                SnsObject snsObject2 = r74.f140749d;
                C87412m.m108593f(snsObject2, "resp.Object");
                this.f122524e = null;
                this.f122523d = 2;
                if (gVar.emit(snsObject2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                    return aVar;
                }
                Log.m105924i(C97367b.m125394c3(this.f122526g), "updateUserCoverFromDetail emit resp");
                C13598b0 b0Var2 = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                return b0Var2;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2", mo125469f = "SnsCoverViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ct2.b$a$b */
        public static final class C45204b extends C91594j implements C32228q<C45253g<? super SnsObject>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f122527d;

            /* renamed from: e */
            public final /* synthetic */ long f122528e;

            /* renamed from: f */
            public final /* synthetic */ C97367b f122529f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45204b(long j, C97367b bVar, C15601d<? super C45204b> dVar) {
                super(3, dVar);
                this.f122528e = j;
                this.f122529f = bVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
                C45253g gVar = (C45253g) obj;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
                C45204b bVar = new C45204b(this.f122528e, this.f122529f, (C15601d) obj3);
                bVar.f122527d = (Throwable) obj2;
                Object invokeSuspend = bVar.invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.f122527d;
                if (th instanceof C45450b.C45451a) {
                    long j = this.f122528e;
                    C45450b.C45451a aVar = (C45450b.C45451a) th;
                    aVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("getErrorCode", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$CgiException");
                    int i = aVar.f123022d;
                    SnsMethodCalculate.markEndTimeMs("getErrorCode", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$CgiException");
                    String message = th.getMessage();
                    SnsMethodCalculate.markStartTimeMs("reportGetFeedDetailError", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                    SnsCoverReportStruct snsCoverReportStruct = new SnsCoverReportStruct();
                    snsCoverReportStruct.f265987d = 6;
                    snsCoverReportStruct.mo126629s(C112551y.m153816p("snsObjId:" + C102236a0.m134765q0(j) + ";errorMsg:" + message, ",", ";", false, 4, (Object) null));
                    snsCoverReportStruct.f265997n = i;
                    snsCoverReportStruct.mo86054n();
                    SnsMethodCalculate.markEndTimeMs("reportGetFeedDetailError", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                }
                String c3 = C97367b.m125394c3(this.f122529f);
                Log.printErrStackTrace(c3, th, "GetSnsObjectDetailCgi error id:" + this.f122528e, new Object[0]);
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
                return b0Var;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5", mo125469f = "SnsCoverViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ct2.b$a$c */
        public static final class C45205c extends C91594j implements C32228q<C45253g<? super C100422y>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C97367b f122530d;

            /* renamed from: e */
            public final /* synthetic */ long f122531e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45205c(C97367b bVar, long j, C15601d<? super C45205c> dVar) {
                super(3, dVar);
                this.f122530d = bVar;
                this.f122531e = j;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
                C45253g gVar = (C45253g) obj;
                Throwable th = (Throwable) obj2;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
                Object invokeSuspend = new C45205c(this.f122530d, this.f122531e, (C15601d) obj3).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
                ResultKt.throwOnFailure(obj);
                String c3 = C97367b.m125394c3(this.f122530d);
                Log.m105924i(c3, "onCompletion:" + C102236a0.m134765q0(this.f122531e));
                C97367b bVar = this.f122530d;
                SnsMethodCalculate.markStartTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                HashSet<Long> hashSet = bVar.f285850f;
                SnsMethodCalculate.markEndTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                hashSet.remove(new Long(this.f122531e));
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
                return b0Var;
            }
        }

        /* renamed from: ct2.b$a$d */
        public static final class C97369d<T> implements C45253g {

            /* renamed from: d */
            public static final C97369d<T> f285854d = new C97369d<>();

            public Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$6");
                C100422y yVar = (C100422y) obj;
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$6");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$6");
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$6");
                return b0Var;
            }
        }

        /* renamed from: ct2.b$a$e */
        public static final class C97370e implements C45252f<SnsObject> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f285855d;

            /* renamed from: e */
            public final /* synthetic */ C97367b f285856e;

            /* renamed from: ct2.b$a$e$a */
            public static final class C97371a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f285857d;

                /* renamed from: e */
                public final /* synthetic */ C97367b f285858e;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1$2", mo125469f = "SnsCoverViewModel.kt", mo125470l = {225}, mo125471m = "emit")
                /* renamed from: ct2.b$a$e$a$a */
                public static final class C97372a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f285859d;

                    /* renamed from: e */
                    public int f285860e;

                    /* renamed from: f */
                    public final /* synthetic */ C97371a f285861f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C97372a(C97371a aVar, C15601d dVar) {
                        super(dVar);
                        this.f285861f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1$2$1");
                        this.f285859d = obj;
                        this.f285860e |= Integer.MIN_VALUE;
                        Object emit = this.f285861f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1$2$1");
                        return emit;
                    }
                }

                public C97371a(C45253g gVar, C97367b bVar) {
                    this.f285857d = gVar;
                    this.f285858e = bVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r10, wx3.C15601d r11) {
                    /*
                        r9 = this;
                        java.lang.String r0 = "emit"
                        java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                        boolean r2 = r11 instanceof ct2.C97367b.C97368a.C97370e.C97371a.C97372a
                        if (r2 == 0) goto L_0x001a
                        r2 = r11
                        ct2.b$a$e$a$a r2 = (ct2.C97367b.C97368a.C97370e.C97371a.C97372a) r2
                        int r3 = r2.f285860e
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L_0x001a
                        int r3 = r3 - r4
                        r2.f285860e = r3
                        goto L_0x001f
                    L_0x001a:
                        ct2.b$a$e$a$a r2 = new ct2.b$a$e$a$a
                        r2.<init>(r9, r11)
                    L_0x001f:
                        java.lang.Object r11 = r2.f285859d
                        xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r4 = r2.f285860e
                        r5 = 1
                        if (r4 == 0) goto L_0x0039
                        if (r4 != r5) goto L_0x002e
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L_0x0073
                    L_0x002e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        throw r10
                    L_0x0039:
                        kotlin.ResultKt.throwOnFailure(r11)
                        d14.g r11 = r9.f285857d
                        r4 = r10
                        com.tencent.mm.protocal.protobuf.SnsObject r4 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r4
                        ct2.b r6 = r9.f285858e
                        java.lang.String r6 = ct2.C97367b.m125394c3(r6)
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "updateUserCoverFromDetail userName:"
                        r7.append(r8)
                        java.lang.String r8 = r4.Username
                        r7.append(r8)
                        java.lang.String r7 = r7.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                        java.lang.String r4 = r4.Username
                        boolean r4 = android.text.TextUtils.isEmpty(r4)
                        r4 = r4 ^ r5
                        if (r4 == 0) goto L_0x0073
                        r2.f285860e = r5
                        java.lang.Object r10 = r11.emit(r10, r2)
                        if (r10 != r3) goto L_0x0073
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r3
                    L_0x0073:
                        rx3.b0 r10 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ct2.C97367b.C97368a.C97370e.C97371a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C97370e(C45252f fVar, C97367b bVar) {
                this.f285855d = fVar;
                this.f285856e = bVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1");
                Object a = this.f285855d.mo31880a(new C97371a(gVar, this.f285856e), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1");
                return b0Var;
            }
        }

        /* renamed from: ct2.b$a$f */
        public static final class C97373f implements C45252f<C100422y> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f285862d;

            /* renamed from: e */
            public final /* synthetic */ C97367b f285863e;

            /* renamed from: ct2.b$a$f$a */
            public static final class C97374a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f285864d;

                /* renamed from: e */
                public final /* synthetic */ C97367b f285865e;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1$2", mo125469f = "SnsCoverViewModel.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ct2.b$a$f$a$a */
                public static final class C97375a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f285866d;

                    /* renamed from: e */
                    public int f285867e;

                    /* renamed from: f */
                    public final /* synthetic */ C97374a f285868f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C97375a(C97374a aVar, C15601d dVar) {
                        super(dVar);
                        this.f285868f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1$2$1");
                        this.f285866d = obj;
                        this.f285867e |= Integer.MIN_VALUE;
                        Object emit = this.f285868f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1$2$1");
                        return emit;
                    }
                }

                public C97374a(C45253g gVar, C97367b bVar) {
                    this.f285864d = gVar;
                    this.f285865e = bVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r18, wx3.C15601d r19) {
                    /*
                        r17 = this;
                        r1 = r17
                        r0 = r19
                        java.lang.String r2 = "emit"
                        java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                        boolean r4 = r0 instanceof ct2.C97367b.C97368a.C97373f.C97374a.C97375a
                        if (r4 == 0) goto L_0x001e
                        r4 = r0
                        ct2.b$a$f$a$a r4 = (ct2.C97367b.C97368a.C97373f.C97374a.C97375a) r4
                        int r5 = r4.f285867e
                        r6 = -2147483648(0xffffffff80000000, float:-0.0)
                        r7 = r5 & r6
                        if (r7 == 0) goto L_0x001e
                        int r5 = r5 - r6
                        r4.f285867e = r5
                        goto L_0x0023
                    L_0x001e:
                        ct2.b$a$f$a$a r4 = new ct2.b$a$f$a$a
                        r4.<init>(r1, r0)
                    L_0x0023:
                        java.lang.Object r0 = r4.f285866d
                        xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r6 = r4.f285867e
                        r7 = 1
                        if (r6 == 0) goto L_0x003f
                        if (r6 != r7) goto L_0x0034
                        kotlin.ResultKt.throwOnFailure(r0)
                        r7 = r2
                        goto L_0x021b
                    L_0x0034:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r4)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                        throw r0
                    L_0x003f:
                        kotlin.ResultKt.throwOnFailure(r0)
                        d14.g r6 = r1.f285864d
                        r8 = r18
                        com.tencent.mm.protocal.protobuf.SnsObject r8 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r8
                        ct2.b r9 = r1.f285865e
                        java.lang.String r10 = "access$updateSnsCoverInfo"
                        java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
                        r9.getClass()
                        java.lang.String r12 = "updateSnsCoverInfo"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
                        java.lang.String r0 = r9.f285848d
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder
                        r13.<init>()
                        java.lang.String r14 = "snsdetail xml "
                        r13.append(r14)
                        te3.qv3 r14 = r8.ObjectDesc
                        java.lang.String r14 = sf0.C48374j0.m53717f(r14)
                        r13.append(r14)
                        java.lang.String r13 = r13.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
                        com.tencent.mm.protocal.protobuf.SnsObject r13 = new com.tencent.mm.protocal.protobuf.SnsObject
                        r13.<init>()
                        r14 = 0
                        byte[] r0 = r8.toByteArray()     // Catch:{ IOException -> 0x0085 }
                        r13.parseFrom(r0)     // Catch:{ IOException -> 0x0085 }
                        goto L_0x008f
                    L_0x0085:
                        r0 = move-exception
                        java.lang.String r15 = r9.f285848d
                        java.lang.Object[] r7 = new java.lang.Object[r14]
                        java.lang.String r14 = "SnsObject parseFrom error"
                        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r14, r7)
                    L_0x008f:
                        com.tencent.p014mm.plugin.sns.model.C94897n1.m120377o(r13)
                        os2.z r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ux0()
                        java.lang.String r7 = r8.Username
                        java.lang.String r13 = "snsObject.Username"
                        gy3.C87412m.m108593f(r7, r13)
                        os2.y r0 = r0.mo139909Yt(r7)
                        java.lang.String r7 = r8.Username
                        r0.field_userName = r7
                        long r13 = r0.field_snsBgId
                        r7 = r2
                        long r1 = r8.f283891Id
                        int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                        if (r15 == 0) goto L_0x00b1
                        r1 = 1
                        goto L_0x00b2
                    L_0x00b1:
                        r1 = 0
                    L_0x00b2:
                        java.lang.String r2 = r9.f285848d
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder
                        r13.<init>()
                        java.lang.String r14 = "differentId:"
                        r13.append(r14)
                        r13.append(r1)
                        java.lang.String r14 = " cover.field_success:"
                        r13.append(r14)
                        boolean r14 = r0.field_success
                        r13.append(r14)
                        java.lang.String r13 = r13.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
                        if (r1 != 0) goto L_0x00dc
                        boolean r2 = r0.field_success
                        if (r2 != 0) goto L_0x00d9
                        goto L_0x00dc
                    L_0x00d9:
                        r2 = 1
                        goto L_0x0209
                    L_0x00dc:
                        te3.qv3 r2 = r8.ObjectDesc
                        java.lang.String r2 = sf0.C48374j0.m53717f(r2)
                        com.tencent.mm.protocal.protobuf.TimeLineObject r2 = ad0.C91999u.m115571q(r2)
                        long r13 = r8.f283891Id
                        r0.field_snsBgId = r13
                        r8 = 0
                        r0.field_isLike = r8
                        r13 = 1
                        r0.field_success = r13
                        te3.j00 r14 = r2.ContentObj
                        te3.rk1 r15 = r14.f298431o
                        if (r15 == 0) goto L_0x015c
                        java.lang.String r14 = r9.f285848d
                        java.lang.Object[] r8 = new java.lang.Object[r13]
                        int r13 = r15.f185188i
                        java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                        r15 = 0
                        r8[r15] = r13
                        java.lang.String r13 = "update cover info to finder,type:%d"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r8)
                        te3.j00 r8 = r2.ContentObj
                        te3.rk1 r8 = r8.f298431o
                        int r8 = r8.f185188i
                        r13 = 4
                        if (r8 != r13) goto L_0x0116
                        r8 = 3
                        r0.field_type = r8
                        goto L_0x011b
                    L_0x0116:
                        r14 = 2
                        if (r8 != r14) goto L_0x011b
                        r0.field_type = r13
                    L_0x011b:
                        r8 = 1
                        r1 = r1 ^ r8
                        r9.mo136641d3(r0, r1)
                        te3.j00 r1 = r2.ContentObj     // Catch:{ IOException -> 0x0159 }
                        te3.rk1 r1 = r1.f298431o     // Catch:{ IOException -> 0x0159 }
                        java.util.LinkedList<te3.pk1> r1 = r1.f185190n     // Catch:{ IOException -> 0x0159 }
                        java.lang.Object r1 = r1.getFirst()     // Catch:{ IOException -> 0x0159 }
                        te3.pk1 r1 = (te3.C64628pk1) r1     // Catch:{ IOException -> 0x0159 }
                        java.lang.String r1 = r1.f184828f     // Catch:{ IOException -> 0x0159 }
                        r0.field_thumbUrl = r1     // Catch:{ IOException -> 0x0159 }
                        te3.j00 r1 = r2.ContentObj     // Catch:{ IOException -> 0x0159 }
                        te3.rk1 r1 = r1.f298431o     // Catch:{ IOException -> 0x0159 }
                        java.lang.String r2 = "timeLineObj.ContentObj.finderShareObject"
                        gy3.C87412m.m108593f(r1, r2)     // Catch:{ IOException -> 0x0159 }
                        java.lang.String r2 = "finderShareObject2FinderObject"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r11)     // Catch:{ IOException -> 0x0159 }
                        com.tencent.mm.protocal.protobuf.FinderObject r8 = new com.tencent.mm.protocal.protobuf.FinderObject     // Catch:{ IOException -> 0x0159 }
                        r8.<init>()     // Catch:{ IOException -> 0x0159 }
                        java.lang.String r9 = r1.f185183d     // Catch:{ IOException -> 0x0159 }
                        long r13 = vr2.C102236a0.m134706B0(r9)     // Catch:{ IOException -> 0x0159 }
                        r8.f164794id = r13     // Catch:{ IOException -> 0x0159 }
                        java.lang.String r1 = r1.f185191o     // Catch:{ IOException -> 0x0159 }
                        r8.objectNonceId = r1     // Catch:{ IOException -> 0x0159 }
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)     // Catch:{ IOException -> 0x0159 }
                        byte[] r1 = r8.toByteArray()     // Catch:{ IOException -> 0x0159 }
                        r0.field_finderObject = r1     // Catch:{ IOException -> 0x0159 }
                    L_0x0159:
                        r2 = 1
                        goto L_0x0201
                    L_0x015c:
                        java.util.LinkedList<te3.kv2> r8 = r14.f298427h
                        java.lang.String r13 = "timeLineObj.ContentObj.MediaObjList"
                        gy3.C87412m.m108593f(r8, r13)
                        int r14 = r8.size()
                        r15 = 1
                        if (r14 <= r15) goto L_0x0173
                        ct2.a r14 = new ct2.a
                        r14.<init>()
                        sx3.C77813z.m93909o(r8, r14)
                    L_0x0173:
                        te3.j00 r8 = r2.ContentObj
                        java.util.LinkedList<te3.kv2> r8 = r8.f298427h
                        gy3.C87412m.m108593f(r8, r13)
                        int r14 = r8.size()
                        java.util.ListIterator r8 = r8.listIterator(r14)
                    L_0x0182:
                        boolean r14 = r8.hasPrevious()
                        if (r14 == 0) goto L_0x019f
                        java.lang.Object r14 = r8.previous()
                        r15 = r14
                        te3.kv2 r15 = (te3.C101804kv2) r15
                        int r15 = r15.f298690e
                        r16 = r8
                        r8 = 2
                        if (r15 != r8) goto L_0x0198
                        r8 = 1
                        goto L_0x0199
                    L_0x0198:
                        r8 = 0
                    L_0x0199:
                        if (r8 == 0) goto L_0x019c
                        goto L_0x01a0
                    L_0x019c:
                        r8 = r16
                        goto L_0x0182
                    L_0x019f:
                        r14 = 0
                    L_0x01a0:
                        te3.kv2 r14 = (te3.C101804kv2) r14
                        if (r14 == 0) goto L_0x01bc
                        java.lang.String r8 = r9.f285848d
                        java.lang.String r15 = "update cover info to MMSNS_DATA_PHOTO"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r15)
                        r8 = 1
                        r0.field_type = r8
                        java.lang.String r8 = r14.f298692g
                        r0.field_imageBgUrl = r8
                        java.lang.String r8 = r14.f298694i
                        r0.field_thumbUrl = r8
                        r8 = r1 ^ 1
                        r9.mo136641d3(r0, r8)
                    L_0x01bc:
                        te3.j00 r2 = r2.ContentObj
                        java.util.LinkedList<te3.kv2> r2 = r2.f298427h
                        gy3.C87412m.m108593f(r2, r13)
                        int r8 = r2.size()
                        java.util.ListIterator r2 = r2.listIterator(r8)
                    L_0x01cb:
                        boolean r8 = r2.hasPrevious()
                        if (r8 == 0) goto L_0x01e4
                        java.lang.Object r8 = r2.previous()
                        r13 = r8
                        te3.kv2 r13 = (te3.C101804kv2) r13
                        int r13 = r13.f298690e
                        r14 = 6
                        if (r13 != r14) goto L_0x01df
                        r13 = 1
                        goto L_0x01e0
                    L_0x01df:
                        r13 = 0
                    L_0x01e0:
                        if (r13 == 0) goto L_0x01cb
                        r15 = r8
                        goto L_0x01e5
                    L_0x01e4:
                        r15 = 0
                    L_0x01e5:
                        te3.kv2 r15 = (te3.C101804kv2) r15
                        if (r15 == 0) goto L_0x0159
                        java.lang.String r2 = r9.f285848d
                        java.lang.String r8 = "update cover info to MMSNS_DATA_SIGHT"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
                        r2 = 2
                        r0.field_type = r2
                        java.lang.String r2 = r15.f298692g
                        r0.field_videoBgUrl = r2
                        java.lang.String r2 = r15.f298694i
                        r0.field_thumbUrl = r2
                        r2 = 1
                        r1 = r1 ^ r2
                        r9.mo136641d3(r0, r1)
                    L_0x0201:
                        os2.z r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ux0()
                        r8 = 0
                        r1.mo139910bD(r0, r8)
                    L_0x0209:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
                        r4.f285867e = r2
                        java.lang.Object r0 = r6.emit(r0, r4)
                        if (r0 != r5) goto L_0x021b
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
                        return r5
                    L_0x021b:
                        rx3.b0 r0 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ct2.C97367b.C97368a.C97373f.C97374a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C97373f(C45252f fVar, C97367b bVar) {
                this.f285862d = fVar;
                this.f285863e = bVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1");
                Object a = this.f285862d.mo31880a(new C97374a(gVar, this.f285863e), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97368a(C97367b bVar, long j, C15601d<? super C97368a> dVar) {
            super(2, dVar);
            this.f285852e = bVar;
            this.f285853f = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            C97368a aVar = new C97368a(this.f285852e, this.f285853f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            Object invokeSuspend = ((C97368a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285851d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String c3 = C97367b.m125394c3(this.f285852e);
                Log.m105924i(c3, "updateUserCoverFromDetail " + C102236a0.m134765q0(this.f285853f));
                C97367b bVar = this.f285852e;
                SnsMethodCalculate.markStartTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                HashSet<Long> hashSet = bVar.f285850f;
                SnsMethodCalculate.markEndTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                if (hashSet.contains(new Long(this.f285853f)) || this.f285853f == 0) {
                    Log.m105924i(C97367b.m125394c3(this.f285852e), "request is doing!");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                    return b0Var;
                }
                C97367b bVar2 = this.f285852e;
                SnsMethodCalculate.markStartTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                HashSet<Long> hashSet2 = bVar2.f285850f;
                SnsMethodCalculate.markEndTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                hashSet2.add(new Long(this.f285853f));
                C58083t tVar = new C58083t(new C58095x0(new C45203a(this.f285853f, this.f285852e, (C15601d<? super C45203a>) null)), new C45204b(this.f285853f, this.f285852e, (C15601d<? super C45204b>) null));
                C97367b bVar3 = this.f285852e;
                C45252f j = C58042h.m67201j(new C58078q(new C97373f(new C97370e(tVar, bVar3), bVar3), new C45205c(bVar3, this.f285853f, (C15601d<? super C45205c>) null)), C53872d1.f151119c);
                C97369d<T> dVar = C97369d.f285854d;
                this.f285851d = 1;
                if (j.mo31880a(dVar, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                throw illegalStateException;
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
            return b0Var2;
        }
    }

    /* renamed from: c3 */
    public static final /* synthetic */ String m125394c3(C97367b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        String str = bVar.f285848d;
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        return str;
    }

    /* renamed from: d3 */
    public final void mo136641d3(C100422y yVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("clearCoverData", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        if (!z) {
            C86013q1.m106447h(yVar.field_localThumb);
            yVar.field_localThumb = "";
        }
        C86013q1.m106447h(yVar.field_localImage);
        C86013q1.m106447h(yVar.field_cacheVideo);
        yVar.field_cacheVideo = yVar.field_localVideo;
        yVar.field_localImage = "";
        yVar.field_localVideo = "";
        SnsMethodCalculate.markEndTimeMs("clearCoverData", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
    }

    /* renamed from: e3 */
    public final void mo136642e3(long j) {
        SnsMethodCalculate.markStartTimeMs("updateUserCoverFromDetail", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C97368a(this, j, (C15601d<? super C97368a>) null), 3, (Object) null);
        SnsMethodCalculate.markEndTimeMs("updateUserCoverFromDetail", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
    }
}
