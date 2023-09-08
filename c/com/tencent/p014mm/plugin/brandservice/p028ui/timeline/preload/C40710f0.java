package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.ipcinvoker.C80883e;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/content/Intent;", "kotlin.jvm.PlatformType", "intent", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/content/Intent;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.f0 */
final class C40710f0<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C40710f0<InputType, ResultType> f109356d = new C40710f0<>();

    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[Catch:{ Exception -> 0x0074, all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[SYNTHETIC, Splitter:B:16:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a A[Catch:{ Exception -> 0x0074, all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c A[Catch:{ Exception -> 0x0074, all -> 0x00f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(java.lang.Object r8, com.tencent.p014mm.ipcinvoker.C1256g r9) {
        /*
            r7 = this;
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r9 = "intent"
            gy3.C87412m.m108593f(r8, r9)
            ay0.k r9 = ay0.C39656k.f106417a
            java.lang.Class<ay0.k> r9 = ay0.C39656k.class
            monitor-enter(r9)
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "float_ball_key"
            java.lang.String r3 = r8.getStringExtra(r3)     // Catch:{ Exception -> 0x0074 }
            if (r3 == 0) goto L_0x0020
            boolean r4 = z04.C112551y.m153811k(r3)     // Catch:{ Exception -> 0x0074 }
            if (r4 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r4 = 0
            goto L_0x0021
        L_0x0020:
            r4 = 1
        L_0x0021:
            if (r4 != 0) goto L_0x0036
            com.tencent.mm.plugin.webview.ui.tools.floatball.d r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d.f118783a     // Catch:{ Exception -> 0x0074 }
            com.tencent.mm.plugin.webview.core.y r3 = r4.mo68421c(r3)     // Catch:{ Exception -> 0x0074 }
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.String r4 = "updateTmplWebview use cache controller"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x0074 }
            monitor-exit(r9)
            goto L_0x015b
        L_0x0036:
            java.lang.String r3 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122310b     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "KTmplParams"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x0074 }
            byte[] r3 = r8.getByteArrayExtra(r3)     // Catch:{ Exception -> 0x0074 }
            if (r3 == 0) goto L_0x0065
            int r4 = r3.length     // Catch:{ Exception -> 0x0074 }
            if (r4 != 0) goto L_0x0048
            r4 = 1
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x0065
            java.lang.Class<te3.ah4> r4 = te3.ah4.class
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x005b }
            r5 = r4
            pe3.a r5 = (pe3.C47465a) r5     // Catch:{ Exception -> 0x005b }
            r5.parseFrom(r3)     // Catch:{ Exception -> 0x005b }
            pe3.a r4 = (pe3.C47465a) r4     // Catch:{ Exception -> 0x005b }
            goto L_0x0066
        L_0x005b:
            r3 = move-exception
            java.lang.String r4 = "Intent.decodeProtoBuffer"
            java.lang.String r5 = "decode ProtoBuffer"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0074 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r5, r6)     // Catch:{ Exception -> 0x0074 }
        L_0x0065:
            r4 = r2
        L_0x0066:
            te3.ah4 r4 = (te3.ah4) r4     // Catch:{ Exception -> 0x0074 }
            if (r4 == 0) goto L_0x006c
            r2 = r4
            goto L_0x00b7
        L_0x006c:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "TmplParams"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0074 }
            throw r3     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            r3 = move-exception
            java.lang.String r4 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r5.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = "tmplParam is null, "
            r5.append(r6)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00f2 }
            r5.append(r3)     // Catch:{ all -> 0x00f2 }
            r3 = 32
            r5.append(r3)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44018d(r8)     // Catch:{ all -> 0x00f2 }
            r5.append(r3)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)     // Catch:{ all -> 0x00f2 }
            r3 = 152(0x98, float:2.13E-43)
            g93.C32355a.m39691c(r3)     // Catch:{ all -> 0x00f2 }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00f2 }
            r4 = 17260(0x436c, float:2.4186E-41)
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00f2 }
            r6[r1] = r5     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44018d(r8)     // Catch:{ all -> 0x00f2 }
            r6[r0] = r1     // Catch:{ all -> 0x00f2 }
            r3.mo160131h(r4, r6)     // Catch:{ all -> 0x00f2 }
        L_0x00b7:
            if (r2 == 0) goto L_0x015a
            int r0 = r2.f130536d     // Catch:{ all -> 0x00f2 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController> r1 = ay0.C39656k.f106418b     // Catch:{ all -> 0x00f2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x00f2 }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController) r2     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x0143
            r3 = -102(0xffffffffffffff9a, float:NaN)
            boolean r3 = r2.mo67748s0(r3)     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x0120
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            r1.remove(r3)     // Catch:{ all -> 0x00f2 }
            r2.mo67677I(r8)     // Catch:{ all -> 0x00f2 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController> r8 = ay0.C39656k.f106419c     // Catch:{ all -> 0x00f2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r8.remove(r1)     // Catch:{ all -> 0x00f2 }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController) r1     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00f4
            com.tencent.mm.plugin.webview.core.a r3 = new com.tencent.mm.plugin.webview.core.a     // Catch:{ all -> 0x00f2 }
            r3.<init>(r1)     // Catch:{ all -> 0x00f2 }
            o40.C61926c.m72668M(r3)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f4
        L_0x00f2:
            r8 = move-exception
            goto L_0x015c
        L_0x00f4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            r8.put(r1, r2)     // Catch:{ all -> 0x00f2 }
            java.lang.String r8 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = "updateTmplWebview:"
            r1.append(r3)     // Catch:{ all -> 0x00f2 }
            r1.append(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ all -> 0x00f2 }
            int r0 = r2.mo67719g()     // Catch:{ all -> 0x00f2 }
            r1.append(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r9)
            goto L_0x015b
        L_0x0120:
            java.lang.String r8 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = "updateTmplWebview fail when tmpl not ready: "
            r1.append(r3)     // Catch:{ all -> 0x00f2 }
            r1.append(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = ", "
            r1.append(r3)     // Catch:{ all -> 0x00f2 }
            int r2 = r2.mo67719g()     // Catch:{ all -> 0x00f2 }
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)     // Catch:{ all -> 0x00f2 }
        L_0x0143:
            java.lang.String r8 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "updateTmplWebview fail when available not found: "
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            r1.append(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ all -> 0x00f2 }
        L_0x015a:
            monitor-exit(r9)
        L_0x015b:
            return
        L_0x015c:
            monitor-exit(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40710f0.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
    }
}
