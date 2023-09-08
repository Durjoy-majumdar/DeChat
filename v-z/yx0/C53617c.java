package yx0;

import a14.C0000n0;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45699g;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C52278zk2;
import wx3.C15601d;
import yx0.C53613a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.transfer.TransferRequestServiceImpl$RequestInMMTask$Companion$transferRequestInMM$1", mo125469f = "TransferRequestServiceImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: yx0.c */
public final class C53617c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ TransferRequestInfo f150656d;

    /* renamed from: e */
    public final /* synthetic */ C45699g f150657e;

    /* renamed from: yx0.c$a */
    public static final class C53618a implements C53613a.C53614a {

        /* renamed from: a */
        public final /* synthetic */ TransferRequestInfo f150658a;

        /* renamed from: b */
        public final /* synthetic */ C45699g f150659b;

        /* renamed from: c */
        public final /* synthetic */ long f150660c;

        /* renamed from: yx0.c$a$a */
        public static final class C53619a implements C45699g {

            /* renamed from: a */
            public final /* synthetic */ C45699g f150661a;

            /* renamed from: b */
            public final /* synthetic */ long f150662b;

            public C53619a(C45699g gVar, long j) {
                this.f150661a = gVar;
                this.f150662b = j;
            }

            /* renamed from: a */
            public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
                C45699g gVar = this.f150661a;
                if (gVar != null) {
                    return gVar.mo66580a(transferRequestInfo);
                }
                return false;
            }

            /* renamed from: b */
            public void mo66581b(int i, String str, C52278zk2 zk22) {
                Log.m105926v("MicroMsg.TransferRequestServiceImpl", "[transferRequestInMM] onResult cost: " + (System.currentTimeMillis() - this.f150662b));
                C45699g gVar = this.f150661a;
                if (gVar != null) {
                    gVar.mo66581b(i, str, zk22);
                }
            }
        }

        public C53618a(TransferRequestInfo transferRequestInfo, C45699g gVar, long j) {
            this.f150658a = transferRequestInfo;
            this.f150659b = gVar;
            this.f150660c = j;
        }

        /* JADX WARNING: type inference failed for: r2v6, types: [zx0.h] */
        /* JADX WARNING: type inference failed for: r2v7, types: [zx0.i] */
        /* JADX WARNING: type inference failed for: r2v8, types: [zx0.a] */
        /* JADX WARNING: type inference failed for: r2v9, types: [zx0.b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo74239a(yx0.C53613a.C53615b r17) {
            /*
                r16 = this;
                r0 = r16
                com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r0.f150658a
                r2 = r17
                boolean r1 = yx0.C53625f.m60159d(r2, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "[transferRequestInMM] getToken onResult tokenValid: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.TransferRequestServiceImpl"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                r4 = 2
                if (r1 == 0) goto L_0x00c5
                com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r0.f150658a
                yx0.c$a$a r5 = new yx0.c$a$a
                ex0.g r6 = r0.f150659b
                long r7 = r0.f150660c
                r5.<init>(r6, r7)
                a14.n0 r6 = yx0.C53620d.f150663d
                int r6 = r1.f109024d
                java.lang.String r7 = r1.f109026f
                yx0.f r8 = yx0.C53625f.f150666a
                te3.hu2 r9 = r8.mo74240c(r7)
                r10 = 4
                r11 = 3
                r12 = 1
                if (r9 != 0) goto L_0x0041
                r14 = 0
                goto L_0x005a
            L_0x0041:
                r13 = 0
                if (r6 == r12) goto L_0x004c
                if (r6 == r4) goto L_0x004c
                if (r6 == r11) goto L_0x004b
                if (r6 == r10) goto L_0x004b
                goto L_0x004c
            L_0x004b:
                r13 = 1
            L_0x004c:
                zx0.g r14 = new zx0.g
                int r15 = r9.f134890e
                java.lang.String r9 = r9.f134891f
                java.lang.String r2 = "cgiInfo.cgiUrl"
                gy3.C87412m.m108593f(r9, r2)
                r14.<init>(r15, r9, r13, r8)
            L_0x005a:
                if (r14 == 0) goto L_0x0085
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "createTransferRequester scope:"
                r2.append(r4)
                r2.append(r7)
                java.lang.String r4 = " use dynamicRoutingRequester, cgiId:"
                r2.append(r4)
                int r4 = r14.f151073b
                r2.append(r4)
                java.lang.String r4 = ", cgiUrl:"
                r2.append(r4)
                java.lang.String r4 = r14.f151074c
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                goto L_0x00a7
            L_0x0085:
                if (r6 == r12) goto L_0x00a1
                if (r6 == r4) goto L_0x009b
                if (r6 == r11) goto L_0x0095
                if (r6 == r10) goto L_0x008f
                r2 = 0
                goto L_0x00a6
            L_0x008f:
                zx0.b r2 = new zx0.b
                r2.<init>(r8)
                goto L_0x00a6
            L_0x0095:
                zx0.a r2 = new zx0.a
                r2.<init>(r8)
                goto L_0x00a6
            L_0x009b:
                zx0.i r2 = new zx0.i
                r2.<init>(r8)
                goto L_0x00a6
            L_0x00a1:
                zx0.h r2 = new zx0.h
                r2.<init>(r8)
            L_0x00a6:
                r14 = r2
            L_0x00a7:
                if (r14 != 0) goto L_0x00b0
                java.lang.String r1 = "transferRequest invalid transfer type"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
                goto L_0x00d5
            L_0x00b0:
                yx0.b r2 = new yx0.b
                r2.<init>(r5)
                a14.s1 r6 = a14.C0001s1.f0d
                zx0.d r9 = new zx0.d
                r3 = 0
                r9.<init>(r14, r1, r2, r3)
                r7 = 0
                r8 = 0
                r10 = 3
                r11 = 0
                a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
                goto L_0x00d5
            L_0x00c5:
                java.lang.String r1 = "[transferRequestInMM] onResult getToken failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
                ex0.g r1 = r0.f150659b
                if (r1 == 0) goto L_0x00d5
                java.lang.String r2 = "transfer get token failed"
                r3 = 0
                r1.mo66581b(r4, r2, r3)
            L_0x00d5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yx0.C53617c.C53618a.mo74239a(yx0.a$b):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53617c(TransferRequestInfo transferRequestInfo, C45699g gVar, C15601d<? super C53617c> dVar) {
        super(2, dVar);
        this.f150656d = transferRequestInfo;
        this.f150657e = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C53617c(this.f150656d, this.f150657e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C53617c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MicroMsg.TransferRequestServiceImpl", "[transferRequestInMM] type: " + this.f150656d.f109024d);
        C53625f fVar = C53625f.f150666a;
        TransferRequestInfo transferRequestInfo = this.f150656d;
        fVar.mo74238b(transferRequestInfo, new C53618a(transferRequestInfo, this.f150657e, currentTimeMillis));
        return C13598b0.f38549a;
    }
}
