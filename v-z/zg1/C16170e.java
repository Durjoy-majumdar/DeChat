package zg1;

import cj1.C0581o5;
import cj1.C0584p5;
import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.e */
public final class C16170e extends C16006g {

    /* renamed from: c */
    public final String f43360c = "LiveAppMsgLikeUpdateInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16170e(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[Catch:{ Exception -> 0x002e, all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x000a A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r14) {
        /*
            r13 = this;
            java.lang.String r0 = "msgList"
            gy3.C87412m.m108594g(r14, r0)
            r0 = 0
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x000a:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x00b3 }
            te3.xs0 r1 = (te3.C52013xs0) r1     // Catch:{ all -> 0x00b3 }
            te3.iu0 r2 = new te3.iu0     // Catch:{ all -> 0x00b3 }
            r2.<init>()     // Catch:{ all -> 0x00b3 }
            pe3.b r1 = r1.f144906h     // Catch:{ all -> 0x00b3 }
            r3 = 0
            if (r1 == 0) goto L_0x0025
            byte[] r1 = r1.mo123703f()     // Catch:{ all -> 0x00b3 }
            goto L_0x0026
        L_0x0025:
            r1 = r3
        L_0x0026:
            if (r1 != 0) goto L_0x002a
        L_0x0028:
            r2 = r3
            goto L_0x003d
        L_0x002a:
            r2.parseFrom(r1)     // Catch:{ Exception -> 0x002e }
            goto L_0x003d
        L_0x002e:
            r1 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.String r4 = ""
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00b3 }
            r5[r0] = r1     // Catch:{ all -> 0x00b3 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r4, r5)     // Catch:{ all -> 0x00b3 }
            goto L_0x0028
        L_0x003d:
            if (r2 == 0) goto L_0x000a
            long r9 = r2.f135665d     // Catch:{ all -> 0x00b3 }
            int r1 = r2.f135668g     // Catch:{ all -> 0x00b3 }
            boolean r2 = r2.f135670i     // Catch:{ all -> 0x00b3 }
            fj1.b r3 = r13.f43066a     // Catch:{ all -> 0x00b3 }
            java.lang.Class<cl1.z0> r4 = cl1.C0702z0.class
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)     // Catch:{ all -> 0x00b3 }
            cl1.z0 r3 = (cl1.C0702z0) r3     // Catch:{ all -> 0x00b3 }
            java.util.List<cj1.o5> r11 = r3.f1672f     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "liveContext.business(Liv…lice::class.java).msgList"
            gy3.C87412m.m108593f(r11, r3)     // Catch:{ all -> 0x00b3 }
            monitor-enter(r11)     // Catch:{ all -> 0x00b3 }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x005b:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x00b0 }
            r4 = r3
            cj1.o5 r4 = (cj1.C0581o5) r4     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "it"
            gy3.C87412m.m108593f(r4, r3)     // Catch:{ all -> 0x00b0 }
            r3 = r13
            r5 = r9
            r7 = r1
            r8 = r2
            boolean r3 = r3.mo14722h(r4, r5, r7, r8)     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x005b
            monitor-exit(r11)     // Catch:{ all -> 0x00b3 }
            goto L_0x000a
        L_0x0079:
            monitor-exit(r11)     // Catch:{ all -> 0x00b3 }
            fj1.b r3 = r13.f43066a     // Catch:{ all -> 0x00b3 }
            java.lang.Class<cl1.a1> r4 = cl1.C54943a1.class
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)     // Catch:{ all -> 0x00b3 }
            r11 = r3
            cl1.a1 r11 = (cl1.C54943a1) r11     // Catch:{ all -> 0x00b3 }
            monitor-enter(r11)     // Catch:{ all -> 0x00b3 }
            cl1.a1$a r3 = r11.f153979j     // Catch:{ all -> 0x00ad }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x00ad }
        L_0x008c:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r4 = r12.next()     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "it"
            gy3.C87412m.m108593f(r4, r3)     // Catch:{ all -> 0x00ad }
            r3 = r13
            r5 = r9
            r7 = r1
            r8 = r2
            boolean r3 = r3.mo14722h(r4, r5, r7, r8)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x008c
            monitor-exit(r11)     // Catch:{ all -> 0x00b3 }
            goto L_0x000a
        L_0x00a8:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ad }
            monitor-exit(r11)     // Catch:{ all -> 0x00b3 }
            goto L_0x000a
        L_0x00ad:
            r14 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00b3 }
            throw r14     // Catch:{ all -> 0x00b3 }
        L_0x00b0:
            r14 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00b3 }
            throw r14     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r14 = move-exception
            ft1.a r1 = ft1.C59319a.f169618b
            java.lang.String r2 = "LiveMsgSliceMsgList"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            o40.C11348f.C11349a.m11178b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = r13.f43360c
            java.lang.String r2 = "dealWithMsgList exception"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r14, r2, r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C16170e.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: e */
    public boolean mo14633e() {
        return false;
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20062};
    }

    /* renamed from: h */
    public final boolean mo14722h(Object obj, long j, int i, boolean z) {
        if (!(obj instanceof C0581o5) || !(obj instanceof C0584p5)) {
            return false;
        }
        C0581o5 o5Var = (C0581o5) obj;
        if (o5Var.getSeq() != j) {
            return false;
        }
        C0584p5 p5Var = (C0584p5) obj;
        if (!p5Var.mo567a() || p5Var.mo583m() == z) {
            p5Var.mo568b(i);
            p5Var.mo582l(z);
            p5Var.mo570d(true);
            ((C0702z0) this.f43066a.mo71262a(C0702z0.class)).mo674i3("appMsg", o5Var);
            String str = this.f43360c;
            Log.m105924i(str, "updateMsg, updateSeq:" + j + ", likeCount:" + i + ", selfLike:" + z + ", msg:" + o5Var.getContent());
        } else {
            String str2 = this.f43360c;
            Log.m105924i(str2, "updateMsg, ignore because it.selfOp:" + p5Var.mo567a() + ", it.selfLike:" + p5Var.mo583m() + ", selfLike:" + z + ", msg:" + o5Var.getContent());
        }
        return true;
    }
}
