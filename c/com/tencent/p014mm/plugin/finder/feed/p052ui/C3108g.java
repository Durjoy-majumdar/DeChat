package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI$checkShow$2$2", mo125469f = "FinderGameLiveAuthUI.kt", mo125470l = {143}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.g */
public final class C3108g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f14969d;

    /* renamed from: e */
    public final /* synthetic */ FinderGameLiveAuthUI f14970e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3108g(FinderGameLiveAuthUI finderGameLiveAuthUI, C15601d<? super C3108g> dVar) {
        super(2, dVar);
        this.f14970e = finderGameLiveAuthUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C3108g(this.f14970e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C3108g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f14969d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 != r3) goto L_0x000e
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0028
        L_0x000e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0016:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r6 = r5.f14970e
            mk1.h r6 = r6.f14403u
            if (r6 == 0) goto L_0x002b
            r5.f14969d = r3
            java.lang.Object r6 = r6.mo11118g(r2, r5)
            if (r6 != r0) goto L_0x0028
            return r0
        L_0x0028:
            r2 = r6
            mk1.h$c r2 = (mk1.C10906h.C10912c) r2
        L_0x002b:
            boolean r6 = r2 instanceof mk1.C10906h.C10912c.C10913a
            if (r6 == 0) goto L_0x004d
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r6 = r5.f14970e
            java.lang.String r6 = r6.f14398p
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startLiveCheck failed, errCode:"
            r0.append(r1)
            mk1.h$c$a r2 = (mk1.C10906h.C10912c.C10913a) r2
            int r1 = r2.f32546a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x00b4
        L_0x004d:
            boolean r6 = r2 instanceof mk1.C10906h.C10912c.C10915c
            if (r6 == 0) goto L_0x0069
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r6 = r5.f14970e
            java.lang.String r6 = r6.f14398p
            java.lang.String r0 = "startLiveCheck continueLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r6 = r5.f14970e
            mk1.h r6 = r6.f14403u
            if (r6 == 0) goto L_0x00b4
            mk1.h$c$c r2 = (mk1.C10906h.C10912c.C10915c) r2
            mk1.h$a r0 = r2.f32548a
            r6.mo11113b(r0)
            goto L_0x00b4
        L_0x0069:
            boolean r6 = r2 instanceof mk1.C10906h.C10912c.C10914b
            if (r6 == 0) goto L_0x00b4
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r6 = r5.f14970e
            java.lang.String r6 = r6.f14398p
            java.lang.String r0 = "startLiveCheck success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            bl3.r r6 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r0 = r5.f14970e
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            java.lang.String r1 = "context"
            gy3.C87412m.m108593f(r0, r1)
            bl3.r$a r6 = r6.mo62444c(r0)
            java.lang.Class<xk1.h> r0 = xk1.C15737h.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r0)
            xk1.h r6 = (xk1.C15737h) r6
            java.lang.String r0 = r6.f42453d
            java.lang.String r1 = "jumpGamePostUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = r6.f42455f     // Catch:{ all -> 0x00ab }
            r0.<init>(r2)     // Catch:{ all -> 0x00ab }
            er1.p3 r2 = er1.C58765p3.f168247a     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r6.f42454e     // Catch:{ all -> 0x00ab }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x00ab }
            r4.<init>()     // Catch:{ all -> 0x00ab }
            r2.mo83805d(r0, r3, r4)     // Catch:{ all -> 0x00ab }
            goto L_0x00b4
        L_0x00ab:
            r0 = move-exception
            java.lang.String r6 = r6.f42453d
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r1, r2)
        L_0x00b4:
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r6 = r5.f14970e
            r6.finish()
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.C3108g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
