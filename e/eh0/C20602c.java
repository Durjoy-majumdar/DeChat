package eh0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53921m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wechat.aff.common.AffCgiManager;
import com.tencent.wechat.aff.common.CommonProto;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.ResultKt;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C101820nt3;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C90417ia;
import u14.C52418a;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z14.C53733a;

/* renamed from: eh0.c */
public final class C20602c implements AffCgiManager.Callback {

    /* renamed from: a */
    public final String f58001a = "AffBizCgiProxy";

    /* renamed from: eh0.c$a */
    public static final class C20603a extends C89132b<C49335eu3> {
        public C20603a(CommonProto.AffCgiRequest affCgiRequest) {
            C87412m.m108594g(affCgiRequest, "request");
            C47350c.C47352b bVar = new C47350c.C47352b();
            byte[] s = affCgiRequest.getData().mo18748s();
            C87412m.m108593f(s, "request.data.toByteArray()");
            bVar.f127066a = new C20607b(s);
            bVar.f127067b = new C20608c();
            bVar.f127069d = affCgiRequest.getMmnet().getCmdid();
            bVar.f127068c = affCgiRequest.getMmnet().getUrl();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            bVar.f127075j = affCgiRequest.getLongPolling();
            bVar.f127076k = affCgiRequest.getLongPollingTimeout();
            mo123453j(bVar.mo72403a());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.aff_biz.AffBizCgiProxy$onRequestCgiEvent$1", mo125469f = "AffBizCgiProxy.kt", mo125470l = {36, 38, 48}, mo125471m = "invokeSuspend")
    /* renamed from: eh0.c$d */
    public static final class C20604d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f58002d;

        /* renamed from: e */
        public final /* synthetic */ CommonProto.AffCgiRequest f58003e;

        /* renamed from: f */
        public final /* synthetic */ long f58004f;

        /* renamed from: g */
        public final /* synthetic */ C20602c f58005g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.aff_biz.AffBizCgiProxy$onRequestCgiEvent$1$1", mo125469f = "AffBizCgiProxy.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: eh0.c$d$a */
        public static final class C20605a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C20602c f58006d;

            /* renamed from: e */
            public final /* synthetic */ CommonProto.AffCgiRequest f58007e;

            /* renamed from: f */
            public final /* synthetic */ CommonProto.AffCgiResponse f58008f;

            /* renamed from: g */
            public final /* synthetic */ long f58009g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20605a(C20602c cVar, CommonProto.AffCgiRequest affCgiRequest, CommonProto.AffCgiResponse affCgiResponse, long j, C15601d<? super C20605a> dVar) {
                super(2, dVar);
                this.f58006d = cVar;
                this.f58007e = affCgiRequest;
                this.f58008f = affCgiResponse;
                this.f58009g = j;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C20605a(this.f58006d, this.f58007e, this.f58008f, this.f58009g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C20605a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                String str = this.f58006d.f58001a;
                StringBuilder sb = new StringBuilder();
                sb.append("onRequestCgiEvent cmdid: ");
                CommonProto.AffCgiRequest.AffCgiInfo mmnet = this.f58007e.getMmnet();
                String str2 = null;
                sb.append(mmnet != null ? new Integer(mmnet.getCmdid()) : null);
                sb.append(", ");
                CommonProto.AffCgiRequest.AffCgiInfo mmnet2 = this.f58007e.getMmnet();
                if (mmnet2 != null) {
                    str2 = mmnet2.getUrl();
                }
                sb.append(str2);
                sb.append(", ret: ");
                sb.append(this.f58008f.getErrorCode());
                Log.m105918d(str, sb.toString());
                AffCgiManager.getInstance().notifyResponseAsync(0, this.f58009g, this.f58008f);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.aff_biz.AffBizCgiProxy$onRequestCgiEvent$1$response$1", mo125469f = "AffBizCgiProxy.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: eh0.c$d$b */
        public static final class C20606b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ long f58010d;

            /* renamed from: e */
            public final /* synthetic */ Exception f58011e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20606b(long j, Exception exc, C15601d<? super C20606b> dVar) {
                super(2, dVar);
                this.f58010d = j;
                this.f58011e = exc;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C20606b(this.f58010d, this.f58011e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C20606b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                AffCgiManager.getInstance().notifyResponseAsync(0, this.f58010d, (CommonProto.AffCgiResponse) CommonProto.AffCgiResponse.newBuilder().setErrorCode(-1).setErrorMessage(this.f58011e.getMessage()).build());
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20604d(CommonProto.AffCgiRequest affCgiRequest, long j, C20602c cVar, C15601d<? super C20604d> dVar) {
            super(2, dVar);
            this.f58003e = affCgiRequest;
            this.f58004f = j;
            this.f58005g = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C20604d(this.f58003e, this.f58004f, this.f58005g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C20604d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f58002d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CommonProto.AffCgiRequest affCgiRequest = this.f58003e;
                C87412m.m108591d(affCgiRequest);
                C20603a aVar2 = new C20603a(affCgiRequest);
                this.f58002d = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                C89059e i2 = aVar2.mo9225i();
                i2.mo123420E(new C20601b(mVar));
                mVar.mo74599v(new C45658a(i2));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C20606b bVar = new C20606b(this.f58004f, e, (C15601d<? super C20606b>) null);
                    this.f58002d = 2;
                    if (C53895h.m60469g(k2Var, bVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommonProto.AffCgiResponse affCgiResponse = (CommonProto.AffCgiResponse) obj;
            C53896h0 h0Var2 = C53872d1.f151117a;
            C53915k2 k2Var2 = C58901s.f168555a;
            C20605a aVar3 = new C20605a(this.f58005g, this.f58003e, affCgiResponse, this.f58004f, (C15601d<? super C20605a>) null);
            this.f58002d = 3;
            if (C53895h.m60469g(k2Var2, aVar3, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eh0.c$b */
    public static final class C20607b extends C101820nt3 {

        /* renamed from: d */
        public final byte[] f58012d;

        public C20607b(byte[] bArr) {
            C87412m.m108594g(bArr, "rawData");
            this.f58012d = bArr;
        }

        /* renamed from: op */
        public int mo24180op(int i, Object... objArr) {
            C87412m.m108594g(objArr, "objs");
            if (i != 1) {
                return super.mo24180op(i, Arrays.copyOf(objArr, objArr.length));
            }
            int i2 = 0;
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar.computeSize());
            }
            return i2 + this.f58012d.length;
        }

        public byte[] toByteArray() {
            int i;
            validate();
            byte[] bArr = new byte[computeSize()];
            C53733a aVar = new C53733a(bArr);
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
                i = C52418a.m58682i(1, this.BaseRequest.computeSize());
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f58012d;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return bArr;
        }
    }

    /* renamed from: eh0.c$c */
    public static final class C20608c extends C49335eu3 {

        /* renamed from: d */
        public byte[] f58013d = new byte[0];

        public C20608c() {
            this.BaseResponse = new C49966ja();
        }

        /* renamed from: op */
        public int mo24180op(int i, Object... objArr) {
            C87412m.m108594g(objArr, "objs");
            if (i != 1) {
                return super.mo24180op(i, Arrays.copyOf(objArr, objArr.length));
            }
            int i2 = 0;
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar.computeSize());
            }
            return i2 + this.f58013d.length;
        }

        public C47465a parseFrom(byte[] bArr) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            this.f58013d = bArr;
            return this;
        }

        public byte[] toByteArray() {
            int i;
            validate();
            byte[] bArr = new byte[computeSize()];
            C53733a aVar = new C53733a(bArr);
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
                i = C52418a.m58682i(1, this.BaseResponse.computeSize());
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f58013d;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return bArr;
        }
    }

    public C20602c() {
        AffCgiManager.getInstance().setCallback(this);
    }

    public void onGetProxyIlinkComplete(long j, boolean z) {
    }

    public void onNotifyResponseComplete(long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r3 = r14.getMmnet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestCgiEvent(long r12, com.tencent.wechat.aff.common.CommonProto.AffCgiRequest r14) {
        /*
            r11 = this;
            java.lang.String r0 = r11.f58001a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onRequestCgiEvent cmdid: "
            r1.append(r2)
            r2 = 0
            if (r14 == 0) goto L_0x001e
            com.tencent.wechat.aff.common.CommonProto$AffCgiRequest$AffCgiInfo r3 = r14.getMmnet()
            if (r3 == 0) goto L_0x001e
            int r3 = r3.getCmdid()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x001f
        L_0x001e:
            r3 = r2
        L_0x001f:
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            if (r14 == 0) goto L_0x0033
            com.tencent.wechat.aff.common.CommonProto$AffCgiRequest$AffCgiInfo r3 = r14.getMmnet()
            if (r3 == 0) goto L_0x0033
            java.lang.String r2 = r3.getUrl()
        L_0x0033:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            a14.n0 r2 = a14.C53930o0.m60555b()
            a14.h0 r3 = a14.C53872d1.f151119c
            r4 = 0
            eh0.c$d r0 = new eh0.c$d
            r10 = 0
            r5 = r0
            r6 = r14
            r7 = r12
            r9 = r11
            r5.<init>(r6, r7, r9, r10)
            r6 = 2
            r7 = 0
            a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eh0.C20602c.onRequestCgiEvent(long, com.tencent.wechat.aff.common.CommonProto$AffCgiRequest):void");
    }

    public void onRequestComplete(long j) {
    }

    public void onSetProxyIlinkComplete(long j) {
    }
}
