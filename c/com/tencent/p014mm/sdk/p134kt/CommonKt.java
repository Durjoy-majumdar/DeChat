package com.tencent.p014mm.sdk.p134kt;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import ey3.C116796a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import fy3.C32230s;
import gy3.C87412m;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ny3.C25235d;
import rx3.C13598b0;
import wx3.C15601d;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0014\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001ac\u0010\u000b\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0004\"\b\b\u0002\u0010\u0007*\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\nH\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a}\u0010\u000b\u001a\u0004\u0018\u00018\u0003\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0004\"\b\b\u0002\u0010\r*\u00020\u0004\"\b\b\u0003\u0010\u0007*\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u00012\b\u0010\u000e\u001a\u0004\u0018\u00018\u00022 \u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00030\u000fH\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0010\u001a\u0001\u0010\u000b\u001a\u0004\u0018\u00018\u0004\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0004\"\b\b\u0002\u0010\r*\u00020\u0004\"\b\b\u0003\u0010\u0011*\u00020\u0004\"\b\b\u0004\u0010\u0007*\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u00012\b\u0010\u000e\u001a\u0004\u0018\u00018\u00022\b\u0010\u0012\u001a\u0004\u0018\u00018\u00032&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00040\u0013H\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0014\u001a±\u0001\u0010\u000b\u001a\u0004\u0018\u00018\u0005\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0004\"\b\b\u0002\u0010\r*\u00020\u0004\"\b\b\u0003\u0010\u0011*\u00020\u0004\"\b\b\u0004\u0010\u0015*\u00020\u0004\"\b\b\u0005\u0010\u0007*\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u00012\b\u0010\u000e\u001a\u0004\u0018\u00018\u00022\b\u0010\u0012\u001a\u0004\u0018\u00018\u00032\b\u0010\u0016\u001a\u0004\u0018\u00018\u00042,\u0010\u0002\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00050\u0017H\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0018\u001a\u0018\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019\u001a \u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001e\u001a\u00020\u001d\u001a\u001e\u0010#\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001d\u001a\"\u0010&\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\u0006\u0010%\u001a\u00020$\u001a\u0010\u0010(\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\u001f\u001a\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010\u001f\u001a.\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-0-\"\u0004\b\u0000\u0010,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010/\u001a\u00020\u001d\u001a\u0016\u00104\u001a\u000203*\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000101\u001a\u0016\u00107\u001a\u0002032\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d\u001a<\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u0010,*\b\u0012\u0004\u0012\u00028\u00010-2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000009\u001a\u0012\u0010>\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010=\u001a\u00020\u001d\u001a\u0016\u0010@\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\u001f2\u0006\u0010?\u001a\u00020\u001f\u001a\u0016\u0010A\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\u001f2\u0006\u0010?\u001a\u00020\u001f\u001a%\u0010C\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010,*\b\u0012\u0004\u0012\u00028\u00000BH@ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a7\u0010C\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010,*\b\u0012\u0004\u0012\u00028\u00000B2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020GH@ø\u0001\u0001¢\u0006\u0004\bC\u0010I\"\u0014\u0010J\u001a\u00020\u001f8\u0006XT¢\u0006\u0006\n\u0004\bJ\u0010K\u0002\u000b\n\u0005\b20\u0001\n\u0002\b\u0019¨\u0006L"}, mo182094d2 = {"Lkotlin/Function0;", "Lrx3/b0;", "block", "uiThread", "", "T1", "T2", "R", "p1", "p2", "Lkotlin/Function2;", "multiLet", "(Ljava/lang/Object;Ljava/lang/Object;Lfy3/p;)Ljava/lang/Object;", "T3", "p3", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfy3/q;)Ljava/lang/Object;", "T4", "p4", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfy3/r;)Ljava/lang/Object;", "T5", "p5", "Lkotlin/Function5;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfy3/s;)Ljava/lang/Object;", "Lny3/d;", "clazz", "Ljava/lang/Class;", "getParameterizedTypeClass", "", "index", "", "tag", "msg", "pid", "getOomAdj", "Landroid/content/Context;", "context", "printRunningAppProcessInfo", "processName", "getProcessSuffix", "xml", "appId", "removeAppIdFromMsgXml", "T", "", "originList", "splitSize", "splitList", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "other", "", "compareContentExt", "types", "attr", "hasAttr", "K", "Lkotlin/Function1;", "keyMethod", "", "toMap", "maxCharSize", "toLimitString", "tagName", "extractSubXmlTag", "wrapWithXmlTag", "Ld14/f;", "syncFlow", "(Ld14/f;Lwx3/d;)Ljava/lang/Object;", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "scope", "", "timeout", "(Ld14/f;Lcom/tencent/mm/sdk/coroutines/LifecycleScope;JLwx3/d;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "wechat-sdk_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.kt.CommonKt */
public final class CommonKt {
    public static final String TAG = "MicroMsg.Common";

    public static final boolean compareContentExt(IAutoDBItem iAutoDBItem, IAutoDBItem iAutoDBItem2) {
        return (iAutoDBItem == null && iAutoDBItem2 == null) || (iAutoDBItem != null && iAutoDBItem.compareContent(iAutoDBItem2));
    }

    public static final String extractSubXmlTag(String str, String str2) {
        C87412m.m108594g(str2, "tagName");
        if (str == null) {
            return null;
        }
        int E = C112550d0.m153769E(str, '<' + str2, 0, false, 6, (Object) null);
        int H = C112550d0.m153772H(str, "</" + str2 + '>', 0, false, 6, (Object) null);
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(E, H);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("</");
        sb.append(str2);
        sb.append('>');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        cy3.C58003b.m67160a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int getOomAdj(java.lang.String r4, java.lang.String r5, int r6) {
        /*
            java.lang.String r0 = "tag"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r5, r0)
            boolean r0 = z04.C112551y.m153811k(r4)
            if (r0 == 0) goto L_0x0014
            java.lang.String r4 = "MicroMsg.Common"
        L_0x0014:
            boolean r0 = z04.C112551y.m153811k(r5)
            if (r0 == 0) goto L_0x001c
            java.lang.String r5 = ""
        L_0x001c:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r1.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "/proc/"
            r1.append(r2)     // Catch:{ all -> 0x006c }
            r1.append(r6)     // Catch:{ all -> 0x006c }
            java.lang.String r6 = "/oom_adj"
            r1.append(r6)     // Catch:{ all -> 0x006c }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x006c }
            r0.<init>(r6)     // Catch:{ all -> 0x006c }
            java.nio.charset.Charset r6 = z04.C119027c.f356488a     // Catch:{ all -> 0x006c }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x006c }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x006c }
            r3.<init>(r0)     // Catch:{ all -> 0x006c }
            r2.<init>(r3, r6)     // Catch:{ all -> 0x006c }
            boolean r6 = r2 instanceof java.io.BufferedReader     // Catch:{ all -> 0x006c }
            if (r6 == 0) goto L_0x004c
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ all -> 0x006c }
            goto L_0x0052
        L_0x004c:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x006c }
            r6.<init>(r2, r1)     // Catch:{ all -> 0x006c }
            r2 = r6
        L_0x0052:
            r6 = 0
            y04.h r0 = cy3.C86157m.m106666b(r2)     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = y04.C112354s.m153287j(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0065 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0065 }
            cy3.C58003b.m67160a(r2, r6)     // Catch:{ all -> 0x006c }
            return r0
        L_0x0065:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            cy3.C58003b.m67160a(r2, r6)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r6 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r6, r5, r0)
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.p134kt.CommonKt.getOomAdj(java.lang.String, java.lang.String, int):int");
    }

    public static final Class<?> getParameterizedTypeClass(C25235d<?> dVar) {
        C87412m.m108594g(dVar, "clazz");
        return getParameterizedTypeClass(C116796a.m164750b(dVar), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0011 A[Catch:{ Exception -> 0x000c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0015 A[Catch:{ Exception -> 0x000c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getProcessSuffix(java.lang.String r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x000e
            boolean r1 = z04.C112551y.m153811k(r8)     // Catch:{ Exception -> 0x000c }
            if (r1 == 0) goto L_0x000a
            goto L_0x000e
        L_0x000a:
            r1 = 0
            goto L_0x000f
        L_0x000c:
            r8 = move-exception
            goto L_0x0039
        L_0x000e:
            r1 = 1
        L_0x000f:
            if (r1 == 0) goto L_0x0015
            java.lang.String r8 = "null"
            return r8
        L_0x0015:
            java.lang.String r1 = "com.tencent.mm"
            boolean r1 = z04.C112551y.m153819s(r8, r1, r0)     // Catch:{ Exception -> 0x000c }
            if (r1 == 0) goto L_0x0038
            r3 = 58
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            int r1 = z04.C112550d0.m153768D(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x000c }
            if (r1 < 0) goto L_0x0035
            java.lang.String r8 = r8.substring(r1)     // Catch:{ Exception -> 0x000c }
            java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r8, r1)     // Catch:{ Exception -> 0x000c }
            goto L_0x0038
        L_0x0035:
            java.lang.String r8 = "main"
        L_0x0038:
            return r8
        L_0x0039:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MicroMsg.Common"
            java.lang.String r2 = "getProcessSuffix"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r2, r0)
            java.lang.String r8 = "err"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.p134kt.CommonKt.getProcessSuffix(java.lang.String):java.lang.String");
    }

    public static final boolean hasAttr(int i, int i2) {
        return (i & i2) > 0;
    }

    public static final <T1, T2, R> R multiLet(T1 t1, T2 t2, C32227p<? super T1, ? super T2, ? extends R> pVar) {
        C87412m.m108594g(pVar, "block");
        if (t1 == null || t2 == null) {
            return null;
        }
        return pVar.invoke(t1, t2);
    }

    public static final String printRunningAppProcessInfo(String str, String str2, Context context) {
        C87412m.m108594g(context, "context");
        boolean z = true;
        if (str == null || C112551y.m153811k(str)) {
            str = TAG;
        }
        if (str2 != null && !C112551y.m153811k(str2)) {
            z = false;
        }
        if (z) {
            str2 = "";
        }
        try {
            Object systemService = context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.m105920e(str, "printRunningAppProcessInfo  appProcesses == null");
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                String processSuffix = getProcessSuffix(next.processName);
                int oomAdj = getOomAdj(str, str2, next.pid);
                sb.append(next.pid);
                sb.append("-");
                sb.append(processSuffix);
                sb.append("-");
                sb.append(next.importance);
                sb.append("-");
                sb.append(oomAdj);
                sb.append(";");
                Log.m105924i(str, "printRunningAppProcessInfo  " + next.processName + ", pid:" + next.pid + ", importance:" + next.importance + "  oomAdj:" + oomAdj);
            }
            Log.m105918d(TAG, "printRunningAppProcessInfo : " + sb);
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "sb.toString()");
            return sb4;
        } catch (Throwable th) {
            Log.printErrStackTrace(str, th, str2, new Object[0]);
            return "";
        }
    }

    public static final String removeAppIdFromMsgXml(String str, String str2) {
        C87412m.m108594g(str, "xml");
        return C112551y.m153814n(str, "appid=\"" + str2 + '\"', "appid=\"\"", false);
    }

    public static final <T> List<List<T>> splitList(List<? extends T> list, int i) {
        int i2;
        C87412m.m108594g(list, "originList");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        do {
            int i4 = i * i3;
            i3++;
            i2 = i * i3;
            if (list.size() <= i2) {
                i2 = list.size();
            }
            arrayList.add(list.subList(i4, i2));
        } while (i2 != list.size());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object syncFlow(d14.C45252f<? extends T> r5, wx3.C15601d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof com.tencent.p014mm.sdk.p134kt.CommonKt$syncFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.sdk.kt.CommonKt$syncFlow$1 r0 = (com.tencent.p014mm.sdk.p134kt.CommonKt$syncFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.sdk.kt.CommonKt$syncFlow$1 r0 = new com.tencent.mm.sdk.kt.CommonKt$syncFlow$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            gy3.f0 r5 = (gy3.C8479f0) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            com.tencent.mm.sdk.kt.CommonKt$syncFlow$2 r2 = new com.tencent.mm.sdk.kt.CommonKt$syncFlow$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = d14.C58042h.m67194c(r5, r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r5 = r6
        L_0x004d:
            T r5 = r5.f27484d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.p134kt.CommonKt.syncFlow(d14.f, wx3.d):java.lang.Object");
    }

    public static /* synthetic */ Object syncFlow$default(C45252f fVar, LifecycleScope lifecycleScope, long j, C15601d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 300000;
        }
        return syncFlow(fVar, lifecycleScope, j, dVar);
    }

    public static final String toLimitString(String str, int i) {
        C87412m.m108594g(str, "<this>");
        if (str.length() <= i) {
            return str;
        }
        String substring = str.substring(0, i);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final <K, T> Map<K, T> toMap(List<? extends T> list, C32226l<? super T, ? extends K> lVar) {
        C87412m.m108594g(list, "<this>");
        C87412m.m108594g(lVar, "keyMethod");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : list) {
            linkedHashMap.put(lVar.invoke(next), next);
        }
        return linkedHashMap;
    }

    public static final void uiThread(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new CommonKt$uiThread$1(aVar));
    }

    public static final String wrapWithXmlTag(String str, String str2) {
        C87412m.m108594g(str2, "tagName");
        if (str == null) {
            return null;
        }
        return '<' + str2 + '>' + str + "</" + str2 + '>';
    }

    public static final Class<?> getParameterizedTypeClass(Class<?> cls, int i) {
        C87412m.m108594g(cls, "clazz");
        Type genericSuperclass = cls.getGenericSuperclass();
        C87412m.m108593f(genericSuperclass, "clazz.genericSuperclass");
        while (!(genericSuperclass instanceof ParameterizedType)) {
            genericSuperclass = cls.getSuperclass().getGenericSuperclass();
            C87412m.m108593f(genericSuperclass, "clazz.superclass.genericSuperclass");
        }
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[i];
        if (type instanceof Class) {
            return (Class) type;
        }
        return null;
    }

    public static final <T1, T2, T3, R> R multiLet(T1 t1, T2 t2, T3 t3, C32228q<? super T1, ? super T2, ? super T3, ? extends R> qVar) {
        C87412m.m108594g(qVar, "block");
        if (t1 == null || t2 == null || t3 == null) {
            return null;
        }
        return qVar.invoke(t1, t2, t3);
    }

    public static final <T1, T2, T3, T4, R> R multiLet(T1 t1, T2 t2, T3 t3, T4 t4, C32229r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
        C87412m.m108594g(rVar, "block");
        if (t1 == null || t2 == null || t3 == null || t4 == null) {
            return null;
        }
        return rVar.mo162I(t1, t2, t3, t4);
    }

    public static final <T1, T2, T3, T4, T5, R> R multiLet(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, C32230s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar) {
        C87412m.m108594g(sVar, "block");
        if (t1 == null || t2 == null || t3 == null || t4 == null || t5 == null) {
            return null;
        }
        return sVar.mo237D(t1, t2, t3, t4, t5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object syncFlow(d14.C45252f<? extends T> r6, com.tencent.p014mm.sdk.coroutines.LifecycleScope r7, long r8, wx3.C15601d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof com.tencent.p014mm.sdk.p134kt.CommonKt$syncFlow$3
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.tencent.mm.sdk.kt.CommonKt$syncFlow$3 r0 = (com.tencent.p014mm.sdk.p134kt.CommonKt$syncFlow$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.sdk.kt.CommonKt$syncFlow$3 r0 = new com.tencent.mm.sdk.kt.CommonKt$syncFlow$3
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.L$1
            gy3.f0 r6 = (gy3.C8479f0) r6
            java.lang.Object r7 = r0.L$0
            d14.f r7 = (d14.C45252f) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0055
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r10)
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            com.tencent.mm.sdk.kt.CommonKt$syncFlow$4 r2 = new com.tencent.mm.sdk.kt.CommonKt$syncFlow$4
            r2.<init>(r10, r7, r6, r4)
            r0.L$0 = r6
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r6 = a14.C53860b3.m60375c(r8, r2, r0)
            if (r6 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r5 = r10
            r10 = r6
            r6 = r5
        L_0x0055:
            if (r10 != 0) goto L_0x0061
            T r6 = r6.f27484d
            a14.z1 r6 = (a14.C53973z1) r6
            if (r6 == 0) goto L_0x0062
            a14.C53973z1.C53974a.m60623a(r6, r4, r3, r4)
            goto L_0x0062
        L_0x0061:
            r4 = r10
        L_0x0062:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.p134kt.CommonKt.syncFlow(d14.f, com.tencent.mm.sdk.coroutines.LifecycleScope, long, wx3.d):java.lang.Object");
    }
}
