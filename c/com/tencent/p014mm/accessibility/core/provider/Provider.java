package com.tencent.p014mm.accessibility.core.provider;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b'\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J\"\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\"\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0005H\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010!\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001eJ\b\u0010\"\u001a\u00020\u0012H&J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010$J1\u0010+\u001a\u00020\u000b2 \u0010(\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'0&H\u0000¢\u0006\u0004\b)\u0010*R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050-0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R4\u00101\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'0&008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/Provider;", "", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "", "configCallback", "getConfig", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Lrx3/b0;", "dealNodeInfo", "dealOnViewInflateAsync", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dealAccEvent", "host", "", "action", "Landroid/os/Bundle;", "args", "dealOnAction", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "unbindConfig", "config", "bindConfig", "getLayoutId", "(Landroid/view/View;)Ljava/lang/Integer;", "", "tag", "msg", "logMsg", "getAuthority", "preFindRoot$plugin_autoaccessibility_release", "(Landroid/view/View;)V", "preFindRoot", "Lkotlin/Function2;", "", "f", "addRootIdMapper$plugin_autoaccessibility_release", "(Lfy3/p;)V", "addRootIdMapper", "Ljava/util/concurrent/ConcurrentHashMap;", "", "activityViewRootDescMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "mappers", "Ljava/util/List;", "<init>", "()V", "Companion", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.Provider */
public abstract class Provider {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Acc.Provider";
    private final ConcurrentHashMap<AppCompatActivity, Set<MMBaseAccessibilityConfig>> activityViewRootDescMap = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */
    public final List<C32227p<View, MMBaseAccessibilityConfig, List<Integer>>> mappers = new ArrayList();

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/Provider$Companion;", "", "()V", "TAG", "", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.Provider$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public final void addRootIdMapper$plugin_autoaccessibility_release(C32227p<? super View, ? super MMBaseAccessibilityConfig, ? extends List<Integer>> pVar) {
        C87412m.m108594g(pVar, "f");
        this.mappers.add(pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindConfig(androidx.appcompat.app.AppCompatActivity r3, com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "config"
            gy3.C87412m.m108594g(r4, r0)
            java.util.concurrent.ConcurrentHashMap<androidx.appcompat.app.AppCompatActivity, java.util.Set<com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig>> r0 = r2.activityViewRootDescMap
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L_0x0023
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Set r1 = java.util.Collections.synchronizedSet(r1)
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            if (r3 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r3
        L_0x0023:
            java.util.Set r1 = (java.util.Set) r1
            r1.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.provider.Provider.bindConfig(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig):void");
    }

    public void dealAccEvent(View view, AccessibilityEvent accessibilityEvent) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityEvent, "event");
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
    }

    public void dealOnAction(View view, int i, Bundle bundle) {
        C87412m.m108594g(view, "host");
    }

    public void dealOnViewInflateAsync(View view) {
        C87412m.m108594g(view, "view");
    }

    public abstract int getAuthority();

    public final boolean getConfig(View view, C32226l<? super MMBaseAccessibilityConfig, Boolean> lVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(lVar, "configCallback");
        Context context = view.getContext();
        LinkedHashSet<MMBaseAccessibilityConfig> linkedHashSet = null;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null) {
            return false;
        }
        Set set = this.activityViewRootDescMap.get(appCompatActivity);
        if (set != null) {
            linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.addAll(set);
        }
        if (linkedHashSet == null) {
            return false;
        }
        for (MMBaseAccessibilityConfig invoke : linkedHashSet) {
            if (lVar.invoke(invoke).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final Integer getLayoutId(View view) {
        Object tag = view != null ? view.getTag(C0966R.C0970id.kdq) : null;
        if (tag instanceof Integer) {
            return (Integer) tag;
        }
        return null;
    }

    public final void logMsg(String str, View view, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str2, "msg");
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        IdUtil idUtil = IdUtil.INSTANCE;
        sb.append(idUtil.getName(view.getId()));
        sb.append('@');
        sb.append(view.hashCode());
        sb.append(":parent:");
        Integer layoutId = getLayoutId(view);
        sb.append(idUtil.getName(layoutId != null ? layoutId.intValue() : 0));
        sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        sb.append(str2);
        Log.m105918d(str, sb.toString());
    }

    public final void preFindRoot$plugin_autoaccessibility_release(View view) {
        C87412m.m108594g(view, "view");
        getConfig(view, new Provider$preFindRoot$1(this, view));
    }

    public void unbindConfig(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.activityViewRootDescMap.remove(appCompatActivity);
    }
}
