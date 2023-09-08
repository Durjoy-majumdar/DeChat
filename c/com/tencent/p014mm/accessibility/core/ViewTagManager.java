package com.tencent.p014mm.accessibility.core;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010%\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u000f0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/ViewTagManager;", "", "Landroidx/lifecycle/s;", "owner", "Lrx3/b0;", "addObserver", "Landroid/view/View;", "view", "Lcom/tencent/mm/accessibility/base/ViewTag;", "getTagData", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "tagMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.ViewTagManager */
public final class ViewTagManager {
    public static final int $stable = 8;
    public static final ViewTagManager INSTANCE = new ViewTagManager();
    private static final String TAG = "MicroMsg.Acc.ViewTagManager";
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<Integer, Map<Integer, ViewTag>> tagMap = new ConcurrentHashMap<>();

    private ViewTagManager() {
    }

    private final void addObserver(C0125s sVar) {
        Log.m105924i(TAG, "wait synchronized " + sVar);
        synchronized (this) {
            ConcurrentHashMap<Integer, Map<Integer, ViewTag>> concurrentHashMap = tagMap;
            if (!concurrentHashMap.containsKey(Integer.valueOf(sVar.hashCode()))) {
                Log.m105924i(TAG, "addObserver init " + sVar);
                ViewTagManager$addObserver$1$observer$1 viewTagManager$addObserver$1$observer$1 = new ViewTagManager$addObserver$1$observer$1(sVar);
                ((C119157j) C119157j.f356862d).mo183868B(new ViewTagManager$addObserver$1$1(sVar, viewTagManager$addObserver$1$observer$1));
                Map put = concurrentHashMap.put(Integer.valueOf(sVar.hashCode()), new LinkedHashMap());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r2 = new java.util.LinkedHashMap();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.accessibility.base.ViewTag getTagData(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r4, r0)
            r0 = 2131314856(0x7f0948a8, float:1.8248149E38)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof com.tencent.p014mm.accessibility.base.ViewTag
            r2 = 0
            if (r1 == 0) goto L_0x0014
            com.tencent.mm.accessibility.base.ViewTag r0 = (com.tencent.p014mm.accessibility.base.ViewTag) r0
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return r0
        L_0x0018:
            android.content.Context r0 = r4.getContext()
            boolean r1 = r0 instanceof androidx.lifecycle.C0125s
            if (r1 == 0) goto L_0x0023
            androidx.lifecycle.s r0 = (androidx.lifecycle.C0125s) r0
            goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            if (r0 != 0) goto L_0x0027
            return r2
        L_0x0027:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.base.ViewTag>> r1 = tagMap
            int r2 = r0.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L_0x003a
            r3.addObserver(r0)
        L_0x003a:
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r1.get(r0)
            if (r2 != 0) goto L_0x0055
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.Object r0 = r1.putIfAbsent(r0, r2)
            if (r0 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r0
        L_0x0055:
            java.util.Map r2 = (java.util.Map) r2
            int r4 = r4.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r2.get(r4)
            if (r0 != 0) goto L_0x006d
            com.tencent.mm.accessibility.base.ViewTag r0 = new com.tencent.mm.accessibility.base.ViewTag
            r0.<init>()
            r2.put(r4, r0)
        L_0x006d:
            com.tencent.mm.accessibility.base.ViewTag r0 = (com.tencent.p014mm.accessibility.base.ViewTag) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.ViewTagManager.getTagData(android.view.View):com.tencent.mm.accessibility.base.ViewTag");
    }
}
