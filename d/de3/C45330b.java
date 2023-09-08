package de3;

import android.content.Context;
import java.util.ArrayList;
import java.util.regex.Matcher;
import wd3.C53155r0;

/* renamed from: de3.b */
public class C45330b {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        r1 = r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static wd3.C53155r0 m50240a(android.content.Context r7, java.lang.String r8, int r9, int r10, int r11, int r12) {
        /*
            if (r7 != 0) goto L_0x0006
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x0006:
            java.lang.Class<ny.d> r0 = p629ny.C35042d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.d r0 = (p629ny.C35042d) r0
            de3.f r0 = r0.ru0()
            com.tencent.mm.app.plugin.i r0 = (com.tencent.p014mm.app.plugin.C40034i) r0
            r0.getClass()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r3 = r0.f107348h
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r1[r4] = r3
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r3 = r0.f107349i
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r1[r5] = r3
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r3 = r0.f107350j
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 3
            r1[r5] = r3
            java.lang.String r3 = "MicroMsg.URISpanHandler"
            java.lang.String r5 = "matchHrefInfoFromUrl, url:%s, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size：%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r1)
            r1 = 0
            if (r7 != 0) goto L_0x0059
            java.lang.String r7 = "matchHrefInfoFromUrl error, context is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            com.tencent.mm.app.plugin.URISpanHandlerSet r7 = r0.f107346f
            r7.f107260a = r1
            goto L_0x0104
        L_0x0059:
            r0.f107347g = r7
            com.tencent.mm.app.plugin.URISpanHandlerSet r5 = r0.f107346f
            r5.f107260a = r7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r7 == 0) goto L_0x0072
            java.lang.String r7 = "matchHrefInfoFromUrl, url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r7)
            r0.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r7 = r0.f107346f
            r7.f107260a = r1
            goto L_0x0104
        L_0x0072:
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r7 = r0.f107348h
            java.util.Iterator r7 = r7.iterator()
        L_0x0078:
            boolean r5 = r7.hasNext()
            java.lang.String r6 = "matchHrefInfoFromUrl, result.type:%d"
            if (r5 == 0) goto L_0x00a1
            java.lang.Object r5 = r7.next()
            com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler r5 = (com.tencent.p014mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) r5
            wd3.r0 r5 = r5.mo62701b(r8)
            if (r5 == 0) goto L_0x0078
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r8 = r5.f148313d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r7)
            r0.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r7 = r0.f107346f
            r7.f107260a = r1
        L_0x009f:
            r1 = r5
            goto L_0x0104
        L_0x00a1:
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r7 = r0.f107349i
            java.util.Iterator r7 = r7.iterator()
        L_0x00a7:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r7.next()
            com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler r5 = (com.tencent.p014mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) r5
            wd3.r0 r5 = r5.mo62701b(r8)
            if (r5 == 0) goto L_0x00a7
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r8 = r5.f148313d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r7)
            r0.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r7 = r0.f107346f
            r7.f107260a = r1
            goto L_0x009f
        L_0x00cd:
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r7 = r0.f107350j
            java.util.Iterator r7 = r7.iterator()
        L_0x00d3:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x00f9
            java.lang.Object r5 = r7.next()
            com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler r5 = (com.tencent.p014mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) r5
            wd3.r0 r5 = r5.mo62701b(r8)
            if (r5 == 0) goto L_0x00d3
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r8 = r5.f148313d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r7)
            r0.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r7 = r0.f107346f
            r7.f107260a = r1
            goto L_0x009f
        L_0x00f9:
            r0.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r7 = r0.f107346f
            r7.f107260a = r1
            java.lang.String r7 = "matchHrefInfoFromUrl, nothing match"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r7)
        L_0x0104:
            if (r1 == 0) goto L_0x010e
            r1.f148310a = r9
            r1.f148311b = r10
            r1.f148320k = r11
            r1.f148321l = r12
        L_0x010e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: de3.C45330b.m50240a(android.content.Context, java.lang.String, int, int, int, int):wd3.r0");
    }

    /* renamed from: b */
    public static ArrayList<C53155r0> m50241b(Context context, String str) {
        ArrayList<C53155r0> arrayList = new ArrayList<>();
        Matcher matcher = C75369r.f221594j.matcher(str);
        while (matcher.find()) {
            Context context2 = context;
            C53155r0 a = m50240a(context2, matcher.group(), matcher.start(), matcher.end(), 0, 0);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
