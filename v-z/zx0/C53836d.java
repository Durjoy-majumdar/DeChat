package zx0;

import a14.C0000n0;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45699g;
import fy3.C32227p;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C52109yf2;
import te3.C52278zk2;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.transfer.request.BaseTransferRequester$request$1", mo125469f = "BaseTransferRequester.kt", mo125470l = {34}, mo125471m = "invokeSuspend")
/* renamed from: zx0.d */
public final class C53836d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f151063d;

    /* renamed from: e */
    public final /* synthetic */ C53839f f151064e;

    /* renamed from: f */
    public final /* synthetic */ TransferRequestInfo f151065f;

    /* renamed from: g */
    public final /* synthetic */ C45699g f151066g;

    /* renamed from: zx0.d$a */
    public static final class C53837a implements C45699g {

        /* renamed from: a */
        public final /* synthetic */ C53839f f151067a;

        /* renamed from: b */
        public final /* synthetic */ C45699g f151068b;

        public C53837a(C53839f fVar, C45699g gVar) {
            this.f151067a = fVar;
            this.f151068b = gVar;
        }

        /* renamed from: a */
        public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
            return false;
        }

        /* renamed from: b */
        public void mo66581b(int i, String str, C52278zk2 zk22) {
            LinkedList<C52109yf2> linkedList;
            StringBuilder sb = new StringBuilder();
            sb.append("[transferRequest-");
            sb.append(this.f151067a.mo74456f());
            sb.append("] errCode: ");
            sb.append(i);
            sb.append(", errMsg: ");
            sb.append(str);
            sb.append(", result: ");
            String str2 = null;
            sb.append(zk22 != null ? Integer.valueOf(zk22.f146051d) : null);
            sb.append(", header.size: ");
            sb.append((zk22 == null || (linkedList = zk22.f146054g) == null) ? null : Integer.valueOf(linkedList.size()));
            sb.append(", resp_json: ");
            sb.append(zk22 != null ? zk22.f146053f : null);
            sb.append(", errMsg: ");
            if (zk22 != null) {
                str2 = zk22.f146052e;
            }
            sb.append(str2);
            Log.m105924i("MicroMsg.BaseTransferRequest", sb.toString());
            C45699g gVar = this.f151068b;
            if (gVar != null) {
                gVar.mo66581b(i, str, zk22);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53836d(C53839f fVar, TransferRequestInfo transferRequestInfo, C45699g gVar, C15601d<? super C53836d> dVar) {
        super(2, dVar);
        this.f151064e = fVar;
        this.f151065f = transferRequestInfo;
        this.f151066g = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C53836d(this.f151064e, this.f151065f, this.f151066g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C53836d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r2 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f151063d
            r2 = 1
            r3 = 0
            java.lang.String r4 = "[transferRequest-"
            java.lang.String r5 = "MicroMsg.BaseTransferRequest"
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0043
        L_0x0012:
            r8 = move-exception
            goto L_0x010d
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r8)
            zx0.f r8 = r7.f151064e     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            r7.f151063d = r2     // Catch:{ Exception -> 0x0012 }
            r8.getClass()     // Catch:{ Exception -> 0x0012 }
            wx3.h r2 = new wx3.h     // Catch:{ Exception -> 0x0012 }
            wx3.d r6 = xx3.C66447b.m78392b(r7)     // Catch:{ Exception -> 0x0012 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0012 }
            yx0.a r8 = r8.f151072a     // Catch:{ Exception -> 0x0012 }
            zx0.c r6 = new zx0.c     // Catch:{ Exception -> 0x0012 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0012 }
            r8.mo74238b(r1, r6)     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r8 = r2.mo90314b()     // Catch:{ Exception -> 0x0012 }
            if (r8 != r0) goto L_0x0043
            return r0
        L_0x0043:
            yx0.a$b r8 = (yx0.C53613a.C53615b) r8     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r0 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = ""
            if (r8 == 0) goto L_0x004f
            java.lang.String r2 = r8.f150652a     // Catch:{ Exception -> 0x0012 }
            if (r2 != 0) goto L_0x0050
        L_0x004f:
            r2 = r1
        L_0x0050:
            r0.f109027g = r2     // Catch:{ Exception -> 0x0012 }
            boolean r2 = r0.f109031n     // Catch:{ Exception -> 0x0012 }
            if (r2 == 0) goto L_0x0060
            if (r8 == 0) goto L_0x005e
            java.lang.String r2 = r8.f150653b     // Catch:{ Exception -> 0x0012 }
            if (r2 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            r0.f109033p = r1     // Catch:{ Exception -> 0x0012 }
        L_0x0060:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0012 }
            r0.<init>()     // Catch:{ Exception -> 0x0012 }
            r0.append(r4)     // Catch:{ Exception -> 0x0012 }
            zx0.f r1 = r7.f151064e     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = r1.mo74456f()     // Catch:{ Exception -> 0x0012 }
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = "] scope: "
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = r1.f109026f     // Catch:{ Exception -> 0x0012 }
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = ", token: "
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = r1.f109027g     // Catch:{ Exception -> 0x0012 }
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = ", pubKeyToken: "
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = r1.f109033p     // Catch:{ Exception -> 0x0012 }
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = ", isRetry: "
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            boolean r1 = r1.f109034q     // Catch:{ Exception -> 0x0012 }
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = ", url: "
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = r1.f109025e     // Catch:{ Exception -> 0x0012 }
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = ", reqUrl: "
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r1 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            te3.yk2 r1 = r1.f109028h     // Catch:{ Exception -> 0x0012 }
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = r1.f145341d     // Catch:{ Exception -> 0x0012 }
            goto L_0x00bc
        L_0x00bb:
            r1 = r3
        L_0x00bc:
            r0.append(r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0012 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r0 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            boolean r8 = yx0.C53625f.m60159d(r8, r0)     // Catch:{ Exception -> 0x0012 }
            if (r8 == 0) goto L_0x00e4
            zx0.f r8 = r7.f151064e     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r0 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            zx0.C53839f.m60330a(r8, r0)     // Catch:{ Exception -> 0x0012 }
            zx0.f r8 = r7.f151064e     // Catch:{ Exception -> 0x0012 }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r0 = r7.f151065f     // Catch:{ Exception -> 0x0012 }
            zx0.d$a r1 = new zx0.d$a     // Catch:{ Exception -> 0x0012 }
            ex0.g r2 = r7.f151066g     // Catch:{ Exception -> 0x0012 }
            r1.<init>(r8, r2)     // Catch:{ Exception -> 0x0012 }
            zx0.C53839f.m60331b(r8, r0, r1)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0139
        L_0x00e4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0012 }
            r8.<init>()     // Catch:{ Exception -> 0x0012 }
            r8.append(r4)     // Catch:{ Exception -> 0x0012 }
            zx0.f r0 = r7.f151064e     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = r0.mo74456f()     // Catch:{ Exception -> 0x0012 }
            r8.append(r0)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "] getToken failed"
            r8.append(r0)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0012 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)     // Catch:{ Exception -> 0x0012 }
            ex0.g r8 = r7.f151066g     // Catch:{ Exception -> 0x0012 }
            if (r8 == 0) goto L_0x0139
            r0 = 2
            java.lang.String r1 = "transfer failed invalid token"
            r8.mo66581b(r0, r1, r3)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0139
        L_0x010d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            zx0.f r1 = r7.f151064e
            java.lang.String r1 = r1.mo74456f()
            r0.append(r1)
            java.lang.String r1 = "] exception"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r8, r0, r1)
            ex0.g r8 = r7.f151066g
            if (r8 == 0) goto L_0x0139
            r0 = 99
            java.lang.String r1 = "unknown error"
            r8.mo66581b(r0, r1, r3)
        L_0x0139:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zx0.C53836d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
