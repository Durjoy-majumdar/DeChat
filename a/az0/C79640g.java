package az0;

import te3.C49259eb2;
import te3.C90410fb2;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: az0.g */
public final class C79640g extends C39663c<C49259eb2, C90410fb2> {

    /* renamed from: c */
    public final String f233514c;

    /* renamed from: d */
    public final C79641a f233515d;

    /* renamed from: e */
    public final String f233516e = "MicroMsg.CgiGetAllPlateNo";

    /* renamed from: f */
    public final String f233517f = "/cgi-bin/mmbiz-bin/wxabusiness/getuserplateinfo";

    /* renamed from: g */
    public final int f233518g = 5976;

    /* renamed from: az0.g$a */
    public enum C79641a {
        ReqScene_HalfPage(1),
        ReqScene_MyPlateInfo(2);
        

        /* renamed from: d */
        public final int f233522d;

        /* access modifiers changed from: public */
        C79641a(int i) {
            this.f233522d = i;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.car_license_plate.cgi.CgiGetAllPlateNo", mo125469f = "CgiGetAllPlateNo.kt", mo125470l = {24}, mo125471m = "send")
    /* renamed from: az0.g$b */
    public static final class C79642b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f233523d;

        /* renamed from: e */
        public final /* synthetic */ C79640g f233524e;

        /* renamed from: f */
        public int f233525f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79642b(C79640g gVar, C15601d<? super C79642b> dVar) {
            super(dVar);
            this.f233524e = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f233523d = obj;
            this.f233525f |= Integer.MIN_VALUE;
            return this.f233524e.mo62235e(this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79640g(java.lang.String r3, az0.C79640g.C79641a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "scene"
            gy3.C87412m.m108594g(r4, r0)
            te3.eb2 r0 = new te3.eb2
            r0.<init>()
            r0.f132837d = r3
            int r1 = r4.f233522d
            r0.f132838e = r1
            te3.fb2 r1 = new te3.fb2
            r1.<init>()
            r2.<init>(r0, r1)
            r2.f233514c = r3
            r2.f233515d = r4
            java.lang.String r3 = "MicroMsg.CgiGetAllPlateNo"
            r2.f233516e = r3
            java.lang.String r3 = "/cgi-bin/mmbiz-bin/wxabusiness/getuserplateinfo"
            r2.f233517f = r3
            r3 = 5976(0x1758, float:8.374E-42)
            r2.f233518g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.C79640g.<init>(java.lang.String, az0.g$a):void");
    }

    /* renamed from: a */
    public int mo62231a() {
        return this.f233518g;
    }

    /* renamed from: b */
    public String mo62232b() {
        return this.f233516e;
    }

    /* renamed from: c */
    public String mo62233c() {
        return this.f233517f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo62235e(wx3.C15601d<? super te3.C90410fb2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof az0.C79640g.C79642b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            az0.g$b r0 = (az0.C79640g.C79642b) r0
            int r1 = r0.f233525f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f233525f = r1
            goto L_0x0018
        L_0x0013:
            az0.g$b r0 = new az0.g$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f233523d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f233525f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005c
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "send with appId:"
            r8.append(r2)
            java.lang.String r2 = r7.f233514c
            r8.append(r2)
            java.lang.String r2 = ", scene:"
            r8.append(r2)
            az0.g$a r2 = r7.f233515d
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.mo62234d(r8)
            r0.f233525f = r3
            java.lang.Object r8 = super.mo62235e(r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r0 = r8
            te3.fb2 r0 = (te3.C90410fb2) r0
            java.lang.String r1 = r0.f259510e
            r2 = 0
            if (r1 == 0) goto L_0x007d
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x006c
            r4 = 1
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            if (r4 == 0) goto L_0x007d
            zy0.a r4 = zy0.C91946a.f263217a
            r4.getClass()
            rc.i r5 = zy0.C91946a.f263219c
            ny3.m<java.lang.Object>[] r6 = zy0.C91946a.f263218b
            r6 = r6[r2]
            r5.mo124239c(r4, r6, r1)
        L_0x007d:
            java.lang.String r1 = r0.f259511f
            if (r1 == 0) goto L_0x0099
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0088
            r2 = 1
        L_0x0088:
            if (r2 == 0) goto L_0x0099
            zy0.a r2 = zy0.C91946a.f263217a
            r2.getClass()
            rc.i r4 = zy0.C91946a.f263221e
            ny3.m<java.lang.Object>[] r5 = zy0.C91946a.f263218b
            r6 = 2
            r5 = r5[r6]
            r4.mo124239c(r2, r5, r1)
        L_0x0099:
            te3.p4 r1 = r0.f259512g
            if (r1 == 0) goto L_0x00ab
            zy0.a r2 = zy0.C91946a.f263217a
            r2.getClass()
            rc.i r4 = zy0.C91946a.f263220d
            ny3.m<java.lang.Object>[] r5 = zy0.C91946a.f263218b
            r3 = r5[r3]
            r4.mo124239c(r2, r3, r1)
        L_0x00ab:
            te3.gp4 r0 = r0.f259513h
            if (r0 == 0) goto L_0x00b6
            zy0.a r1 = zy0.C91946a.f263217a
            r1.getClass()
            zy0.C91946a.f263222f = r0
        L_0x00b6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.C79640g.mo62235e(wx3.d):java.lang.Object");
    }
}
