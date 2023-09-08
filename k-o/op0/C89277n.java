package op0;

import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import gy3.C87412m;
import z04.C112550d0;

/* renamed from: op0.n */
public final class C89277n {

    /* renamed from: a */
    public static final C89277n f257198a = new C89277n();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r10 = f257198a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x006e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m111584a(java.util.List r17, java.lang.String r18, java.lang.String r19, boolean r20, int r21, java.lang.Object r22) {
        /*
            r0 = r17
            r1 = r18
            r2 = r21 & 2
            if (r2 == 0) goto L_0x000b
            java.lang.String r2 = ""
            goto L_0x000d
        L_0x000b:
            r2 = r19
        L_0x000d:
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "pathOrModule"
            gy3.C87412m.m108594g(r1, r3)
            op0.n r3 = f257198a
            java.lang.String[] r3 = r3.mo123590d(r1)
            op0.m r4 = new op0.m
            r4.<init>()
            java.util.List r0 = sx3.C110818d0.m150943o0(r0, r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x002b:
            boolean r4 = r0.hasNext()
            r5 = 0
            java.lang.String r6 = " ]"
            java.lang.String r7 = ", message[ "
            java.lang.String r8 = "Luggage.FULL.WxaRuntimeModularizingUtils"
            if (r4 == 0) goto L_0x0122
            java.lang.Object r4 = r0.next()
            r9 = 0
            if (r4 == 0) goto L_0x004c
            op0.n r10 = f257198a
            java.lang.String r11 = r10.mo123589c(r4)
            if (r11 == 0) goto L_0x004c
            java.lang.String[] r10 = r10.mo123590d(r11)
            goto L_0x004e
        L_0x004c:
            java.lang.String[] r10 = new java.lang.String[r9]
        L_0x004e:
            int r11 = r3.length
            int r12 = r10.length
            r13 = 1
            if (r11 >= r12) goto L_0x0054
            goto L_0x0062
        L_0x0054:
            int r11 = r10.length
            r12 = 0
        L_0x0056:
            if (r12 >= r11) goto L_0x0067
            r14 = r3[r12]
            r15 = r10[r12]
            boolean r14 = gy3.C87412m.m108589b(r14, r15)
            if (r14 != 0) goto L_0x0064
        L_0x0062:
            r10 = 0
            goto L_0x0068
        L_0x0064:
            int r12 = r12 + 1
            goto L_0x0056
        L_0x0067:
            r10 = 1
        L_0x0068:
            java.lang.String r11 = ", path:"
            java.lang.String r12 = "findModule, hit module(independent:"
            if (r10 == 0) goto L_0x00b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            if (r4 == 0) goto L_0x0081
            op0.n r3 = f257198a
            boolean r3 = r3.mo123588b(r4)
            if (r3 != r13) goto L_0x0081
            r9 = 1
        L_0x0081:
            r0.append(r9)
            java.lang.String r3 = ") by name:"
            r0.append(r3)
            if (r4 == 0) goto L_0x0091
            op0.n r3 = f257198a
            java.lang.String r5 = r3.mo123589c(r4)
        L_0x0091:
            r0.append(r5)
            r0.append(r11)
            r0.append(r1)
            r0.append(r7)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            gy3.C87412m.m108591d(r4)
        L_0x00ad:
            r5 = r4
            goto L_0x013f
        L_0x00b0:
            if (r4 == 0) goto L_0x002b
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo
            if (r5 == 0) goto L_0x00bc
            r5 = r4
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r5 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r5
            java.lang.String[] r5 = r5.f239476h
            goto L_0x00c5
        L_0x00bc:
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo
            if (r5 == 0) goto L_0x0116
            r5 = r4
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r5 = (com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo) r5
            java.lang.String[] r5 = r5.aliases
        L_0x00c5:
            if (r5 == 0) goto L_0x002b
            int r10 = r5.length
            r14 = 0
        L_0x00c9:
            if (r14 >= r10) goto L_0x002b
            r15 = r5[r14]
            if (r15 == 0) goto L_0x00d9
            int r16 = r15.length()
            if (r16 != 0) goto L_0x00d6
            goto L_0x00d9
        L_0x00d6:
            r16 = 0
            goto L_0x00db
        L_0x00d9:
            r16 = 1
        L_0x00db:
            if (r16 != 0) goto L_0x0113
            boolean r16 = z04.C112551y.m153819s(r1, r15, r9)
            if (r16 == 0) goto L_0x0113
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            op0.n r3 = f257198a
            boolean r3 = r3.mo123588b(r4)
            r0.append(r3)
            java.lang.String r3 = ") by alias:"
            r0.append(r3)
            r0.append(r15)
            r0.append(r11)
            r0.append(r1)
            r0.append(r7)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x00ad
        L_0x0113:
            int r14 = r14 + 1
            goto L_0x00c9
        L_0x0116:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0122:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "findModule, return null with path:"
            r0.append(r3)
            r0.append(r1)
            r0.append(r7)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x013f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: op0.C89277n.m111584a(java.util.List, java.lang.String, java.lang.String, boolean, int, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean mo123588b(Object obj) {
        if (obj instanceof WxaAttributes.WxaVersionModuleInfo) {
            return ((WxaAttributes.WxaVersionModuleInfo) obj).f239474f;
        }
        if (obj instanceof ModulePkgInfo) {
            return ((ModulePkgInfo) obj).independent;
        }
        throw new IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
    }

    /* renamed from: c */
    public final String mo123589c(Object obj) {
        if (obj instanceof WxaAttributes.WxaVersionModuleInfo) {
            return ((WxaAttributes.WxaVersionModuleInfo) obj).f239472d;
        }
        if (obj instanceof ModulePkgInfo) {
            return ((ModulePkgInfo) obj).name;
        }
        throw new IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
    }

    /* renamed from: d */
    public final String[] mo123590d(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = 0;
                break;
            } else if (str.charAt(i) != '/') {
                break;
            } else {
                i++;
            }
        }
        int length2 = str.length();
        int length3 = str.length();
        while (true) {
            length3--;
            if (-1 >= length3 || str.charAt(length3) != '/') {
                String substring = str.substring(i, length2);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Object[] array = C112550d0.m153785U(substring, new String[]{"/"}, false, 0, 6, (Object) null).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } else {
                length2--;
            }
        }
        String substring2 = str.substring(i, length2);
        C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        Object[] array2 = C112550d0.m153785U(substring2, new String[]{"/"}, false, 0, 6, (Object) null).toArray(new String[0]);
        C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array2;
    }
}
