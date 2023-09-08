package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0011\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/ContentDescProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Lrx3/b0;", "dealNodeInfo", "", "getContentDesc", "", "outRootView", "", "findDescList", "(Landroid/view/View;[Landroid/view/View;)Ljava/lang/Object;", "", "getAuthority", "TAG", "Ljava/lang/String;", "curConfigName", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider */
public final class ContentDescProvider extends Provider {
    public static final ContentDescProvider INSTANCE;
    public static final String TAG = "MicroMsg.Acc.ContentDescProvider";
    /* access modifiers changed from: private */
    public static String curConfigName = "";

    static {
        ContentDescProvider contentDescProvider = new ContentDescProvider();
        INSTANCE = contentDescProvider;
        contentDescProvider.addRootIdMapper$plugin_autoaccessibility_release(C1045801.INSTANCE);
    }

    private ContentDescProvider() {
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        String contentDesc = getContentDesc(view);
        if (contentDesc != null) {
            accessibilityNodeInfo.setContentDescription(contentDesc);
        }
    }

    public final Object findDescList(View view, View[] viewArr) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(viewArr, "outRootView");
        C8479f0 f0Var = new C8479f0();
        getConfig(view, new ContentDescProvider$findDescList$1(view, viewArr, f0Var));
        return f0Var.f27484d;
    }

    public int getAuthority() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0256, code lost:
        if (r0 != null) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        if (r3 != null) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getContentDesc(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r2, r0)
            r3 = 1
            android.view.View[] r0 = new android.view.View[r3]
            r4 = 0
            r5 = 0
        L_0x000e:
            r6 = 0
            if (r5 >= r3) goto L_0x0016
            r0[r5] = r6
            int r5 = r5 + 1
            goto L_0x000e
        L_0x0016:
            java.lang.Object r5 = r1.findDescList(r2, r0)
            r0 = r0[r4]
            boolean r7 = r5 instanceof java.util.List
            java.lang.String r8 = "id_resource_type"
            java.lang.String r9 = "string_resource_type"
            java.lang.String r10 = "param_method_type"
            java.lang.String r11 = "normal_string_type"
            java.lang.String r12 = ""
            if (r7 == 0) goto L_0x01bd
            r13 = r5
            java.util.List r13 = (java.util.List) r13
            int r14 = r13.size()
            r15 = 2
            if (r14 <= r15) goto L_0x01bd
            gy3.d0 r5 = new gy3.d0
            r5.<init>()
            r5.f27483d = r3
            int r7 = r13.size()
            int r7 = r7 / r15
            java.lang.String[] r14 = new java.lang.String[r7]
            r6 = 0
        L_0x0043:
            if (r6 >= r7) goto L_0x004a
            r14[r6] = r12
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004a:
            r6 = 0
        L_0x004b:
            int r3 = r5.f27483d
            int r4 = r13.size()
            if (r3 >= r4) goto L_0x0178
            java.lang.Object r3 = r13.get(r6)
            int r4 = r5.f27483d
            java.lang.Object r4 = r13.get(r4)
            boolean r16 = gy3.C87412m.m108589b(r3, r11)
            if (r16 == 0) goto L_0x0074
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L_0x006e
            int r3 = r5.f27483d
            int r3 = r3 / r15
            java.lang.String r4 = (java.lang.String) r4
            r14[r3] = r4
        L_0x006e:
            r17 = r0
            r16 = r13
            goto L_0x0168
        L_0x0074:
            boolean r16 = gy3.C87412m.m108589b(r3, r10)
            if (r16 == 0) goto L_0x008c
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L_0x006e
            int r3 = r5.f27483d
            int r3 = r3 / r15
            r14[r3] = r12
            com.tencent.mm.accessibility.core.provider.ContentDescProvider$getContentDesc$1 r3 = new com.tencent.mm.accessibility.core.provider.ContentDescProvider$getContentDesc$1
            r3.<init>(r14, r5, r4)
            r1.getConfig(r2, r3)
            goto L_0x006e
        L_0x008c:
            boolean r16 = gy3.C87412m.m108589b(r3, r9)
            if (r16 == 0) goto L_0x00b3
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x006e
            int r3 = r5.f27483d
            int r3 = r3 / r15
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r15 = r16.getResources()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r4 = r15.getString(r4)
            java.lang.String r15 = "getContext().resources.getString(content)"
            gy3.C87412m.m108593f(r4, r15)
            r14[r3] = r4
            goto L_0x006e
        L_0x00b3:
            boolean r3 = gy3.C87412m.m108589b(r3, r8)
            if (r3 == 0) goto L_0x0176
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x006e
            java.lang.Number r4 = (java.lang.Number) r4
            int r15 = r4.intValue()
            android.view.View r15 = r0.findViewById(r15)
            if (r15 == 0) goto L_0x006e
            r16 = r13
            int r13 = r19.getId()
            r17 = r0
            if (r3 != 0) goto L_0x00d6
            goto L_0x011a
        L_0x00d6:
            int r0 = r4.intValue()
            if (r13 != r0) goto L_0x011a
            boolean r0 = r2 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x00e4
            boolean r0 = r2 instanceof com.tencent.neattextview.textview.view.NeatTextView
            if (r0 == 0) goto L_0x011a
        L_0x00e4:
            int r0 = r5.f27483d
            r3 = 2
            int r0 = r0 / r3
            java.lang.CharSequence r3 = r15.getContentDescription()
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0117
        L_0x00f4:
            boolean r3 = r15 instanceof android.widget.TextView
            if (r3 == 0) goto L_0x0107
            android.widget.TextView r15 = (android.widget.TextView) r15
            java.lang.CharSequence r3 = r15.getText()
            if (r3 == 0) goto L_0x0116
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0117
            goto L_0x0116
        L_0x0107:
            boolean r3 = r15 instanceof com.tencent.neattextview.textview.view.NeatTextView
            if (r3 == 0) goto L_0x0116
            com.tencent.neattextview.textview.view.NeatTextView r15 = (com.tencent.neattextview.textview.view.NeatTextView) r15
            java.lang.CharSequence r3 = r15.mo154968a()
            java.lang.String r3 = r3.toString()
            goto L_0x0117
        L_0x0116:
            r3 = r12
        L_0x0117:
            r14[r0] = r3
            goto L_0x0168
        L_0x011a:
            int r0 = r19.getId()
            if (r3 != 0) goto L_0x0121
            goto L_0x013b
        L_0x0121:
            int r3 = r4.intValue()
            if (r0 != r3) goto L_0x013b
            int r0 = r5.f27483d
            r3 = 2
            int r0 = r0 / r3
            java.lang.CharSequence r3 = r15.getContentDescription()
            if (r3 == 0) goto L_0x0137
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0138
        L_0x0137:
            r3 = r12
        L_0x0138:
            r14[r0] = r3
            goto L_0x0168
        L_0x013b:
            int r0 = r5.f27483d
            r3 = 2
            int r0 = r0 / r3
            com.tencent.mm.accessibility.core.provider.ContentDescProvider r3 = INSTANCE
            java.lang.String r3 = r3.getContentDesc(r15)
            if (r3 != 0) goto L_0x0166
            android.view.accessibility.AccessibilityNodeInfo r3 = r15.createAccessibilityNodeInfo()
            java.lang.CharSequence r4 = r3.getContentDescription()
            if (r4 == 0) goto L_0x015a
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r3 = r4
            goto L_0x0166
        L_0x015a:
            java.lang.CharSequence r3 = r3.getText()
            if (r3 == 0) goto L_0x0165
            java.lang.String r3 = r3.toString()
            goto L_0x0166
        L_0x0165:
            r3 = r12
        L_0x0166:
            r14[r0] = r3
        L_0x0168:
            int r6 = r6 + 2
            int r0 = r6 + 1
            r5.f27483d = r0
            r13 = r16
            r0 = r17
            r4 = 0
            r15 = 2
            goto L_0x004b
        L_0x0176:
            r0 = 1
            goto L_0x0179
        L_0x0178:
            r0 = 0
        L_0x0179:
            if (r0 != 0) goto L_0x02c9
            r3 = 0
            r0 = r14[r3]     // Catch:{ all -> 0x019a }
            r3 = 1
            java.lang.Object[] r4 = sx3.C110821n.m150967n(r14, r3, r7)     // Catch:{ all -> 0x019a }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x019a }
            int r3 = r4.length     // Catch:{ all -> 0x019a }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)     // Catch:{ all -> 0x019a }
            int r4 = r3.length     // Catch:{ all -> 0x019a }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "format(format, *args)"
            gy3.C87412m.m108593f(r0, r3)     // Catch:{ all -> 0x019a }
            r12 = r0
            goto L_0x01bc
        L_0x019a:
            r0 = move-exception
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r5 = r14[r4]
            r3[r4] = r5
            com.tencent.mm.accessibility.uitl.IdUtil r4 = com.tencent.p014mm.accessibility.uitl.IdUtil.INSTANCE
            int r2 = r19.getId()
            java.lang.String r2 = r4.getName(r2)
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = curConfigName
            r4 = 2
            r3[r4] = r2
            java.lang.String r2 = "MicroMsg.Acc.ContentDescProvider"
            java.lang.String r4 = "String Format Error in [%s] in for view(%s) in config(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x01bc:
            return r12
        L_0x01bd:
            r17 = r0
            if (r7 == 0) goto L_0x02c9
            java.util.List r5 = (java.util.List) r5
            r3 = 0
            java.lang.Object r0 = r5.get(r3)
            r3 = 1
            java.lang.Object r3 = r5.get(r3)
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            boolean r5 = gy3.C87412m.m108589b(r0, r11)
            if (r5 == 0) goto L_0x01e0
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x02c2
            r4.f27484d = r3
            goto L_0x02c2
        L_0x01e0:
            boolean r5 = gy3.C87412m.m108589b(r0, r10)
            if (r5 == 0) goto L_0x01f6
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x02c2
            r4.f27484d = r12
            com.tencent.mm.accessibility.core.provider.ContentDescProvider$getContentDesc$3 r0 = new com.tencent.mm.accessibility.core.provider.ContentDescProvider$getContentDesc$3
            r0.<init>(r4, r3)
            r1.getConfig(r2, r0)
            goto L_0x02c2
        L_0x01f6:
            boolean r5 = gy3.C87412m.m108589b(r0, r9)
            if (r5 == 0) goto L_0x0216
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x02c2
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            java.lang.String r0 = r0.getString(r2)
            r4.f27484d = r0
            goto L_0x02c2
        L_0x0216:
            boolean r0 = gy3.C87412m.m108589b(r0, r8)
            if (r0 == 0) goto L_0x02c2
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x02c2
            int r5 = r19.getId()
            if (r0 != 0) goto L_0x0227
            goto L_0x026b
        L_0x0227:
            r6 = r3
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r5 != r6) goto L_0x026b
            boolean r5 = r2 instanceof android.widget.TextView
            if (r5 != 0) goto L_0x0238
            boolean r6 = r2 instanceof com.tencent.neattextview.textview.view.NeatTextView
            if (r6 == 0) goto L_0x026b
        L_0x0238:
            java.lang.CharSequence r0 = r19.getContentDescription()
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r12 = r0
            goto L_0x0268
        L_0x0247:
            if (r5 == 0) goto L_0x0259
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0245
            goto L_0x0268
        L_0x0259:
            boolean r0 = r2 instanceof com.tencent.neattextview.textview.view.NeatTextView
            if (r0 == 0) goto L_0x0268
            r0 = r2
            com.tencent.neattextview.textview.view.NeatTextView r0 = (com.tencent.neattextview.textview.view.NeatTextView) r0
            java.lang.CharSequence r0 = r0.mo154968a()
            java.lang.String r12 = r0.toString()
        L_0x0268:
            r4.f27484d = r12
            goto L_0x02c2
        L_0x026b:
            int r5 = r19.getId()
            if (r0 != 0) goto L_0x0272
            goto L_0x028a
        L_0x0272:
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r5 != r0) goto L_0x028a
            java.lang.CharSequence r0 = r19.getContentDescription()
            if (r0 == 0) goto L_0x0286
            java.lang.String r0 = r0.toString()
            goto L_0x0287
        L_0x0286:
            r0 = 0
        L_0x0287:
            r4.f27484d = r0
            goto L_0x02c2
        L_0x028a:
            if (r17 == 0) goto L_0x02c2
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r17
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x02c2
            com.tencent.mm.accessibility.core.provider.ContentDescProvider r2 = INSTANCE
            java.lang.String r2 = r2.getContentDesc(r0)
            if (r2 != 0) goto L_0x02c0
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.createAccessibilityNodeInfo()
            java.lang.CharSequence r2 = r0.getContentDescription()
            if (r2 == 0) goto L_0x02b5
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            r12 = r2
            goto L_0x02bf
        L_0x02b5:
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x02bf
            java.lang.String r12 = r0.toString()
        L_0x02bf:
            r2 = r12
        L_0x02c0:
            r4.f27484d = r2
        L_0x02c2:
            T r0 = r4.f27484d
            if (r0 == 0) goto L_0x02c9
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x02c9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.provider.ContentDescProvider.getContentDesc(android.view.View):java.lang.String");
    }
}
