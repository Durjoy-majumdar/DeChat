package com.tencent.p014mm.accessibility.core.provider;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.core.area.AreaProvider;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J \u0010\u001d\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0016\u0010 \u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eR\u0014\u0010\"\u001a\u00020!8\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010&\u001a\u00020%8\u0002XT¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/AccProviderFactory;", "", "", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "providers", "Landroid/view/View;", "root", "Lrx3/b0;", "dealTagSync", "view", "Lkotlin/Function0;", "runnable", "runInProtect", "onInflateRootAsync", "onMockInflate", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "config", "bindConfig", "unbindConfig", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dispatchNodeInfo", "dispatchViewInflate", "", "action", "Landroid/os/Bundle;", "args", "dispatchOnAction", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dispatchAccEvent", "", "TAG", "Ljava/lang/String;", "Ljava/util/List;", "", "MOCK_INFLATE_DELAY", "J", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.AccProviderFactory */
public final class AccProviderFactory {
    public static final int $stable = 8;
    public static final AccProviderFactory INSTANCE = new AccProviderFactory();
    private static final long MOCK_INFLATE_DELAY = 200;
    private static final String TAG = "MicroMsg.Acc.AccProviderFactory";
    /* access modifiers changed from: private */
    public static final List<Provider> providers;

    static {
        ArrayList arrayList = new ArrayList();
        providers = arrayList;
        arrayList.add(EventRecorder.INSTANCE);
        arrayList.add(PreFocusModifier.INSTANCE);
        arrayList.add(ContentDescProvider.INSTANCE);
        arrayList.add(CallbackCaller.INSTANCE);
        arrayList.add(DisableFocusModifier.INSTANCE);
        arrayList.add(OrderProvider.INSTANCE);
        arrayList.add(TypeModifier.INSTANCE);
        arrayList.add(TalkController.INSTANCE);
        arrayList.add(DisableChildModifier.INSTANCE);
        arrayList.add(ClickConductionProvider.INSTANCE);
        arrayList.add(TextViewSpannedModifier.INSTANCE);
        arrayList.add(CheckableModifier.INSTANCE);
        arrayList.add(SeekbarCaller.INSTANCE);
    }

    private AccProviderFactory() {
    }

    private final void dealTagSync(View view) {
        MapExpandKt.visitChild(view, AccProviderFactory$dealTagSync$1.INSTANCE);
    }

    private final List<Provider> providers() {
        return providers;
    }

    private final void runInProtect(View view, C32224a<C13598b0> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "throw in view(%s)", IdUtil.INSTANCE.getName(view.getId()));
        }
    }

    public final void bindConfig(AppCompatActivity appCompatActivity, MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(mMBaseAccessibilityConfig, "config");
        for (Provider bindConfig : providers) {
            bindConfig.bindConfig(appCompatActivity, mMBaseAccessibilityConfig);
        }
        AreaProvider.INSTANCE.bindConfig(appCompatActivity, mMBaseAccessibilityConfig);
    }

    public final void dispatchAccEvent(View view, AccessibilityEvent accessibilityEvent) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityEvent, "event");
        runInProtect(view, new AccProviderFactory$dispatchAccEvent$1(view, accessibilityEvent));
    }

    public final void dispatchNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        runInProtect(view, new AccProviderFactory$dispatchNodeInfo$1(view, accessibilityNodeInfo));
    }

    public final void dispatchOnAction(View view, int i, Bundle bundle) {
        C87412m.m108594g(view, "view");
        runInProtect(view, new AccProviderFactory$dispatchOnAction$1(view, i, bundle));
    }

    public final void dispatchViewInflate(View view) {
        C87412m.m108594g(view, "view");
        runInProtect(view, new AccProviderFactory$dispatchViewInflate$1(view));
    }

    public final void onInflateRootAsync(View view) {
        C87412m.m108594g(view, "root");
        dealTagSync(view);
        if (AccUtil.INSTANCE.canPreDeal()) {
            ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
            if (!(tagData != null ? C87412m.m108589b(tagData.getHavenInflate(), Boolean.TRUE) : false)) {
                MapExpandKt.postIfNeed(view, new AccProviderFactory$onInflateRootAsync$1(new WeakReference(view)));
            }
        }
    }

    public final void onMockInflate(View view) {
        ViewTag tagData;
        C87412m.m108594g(view, "view");
        AccUtil accUtil = AccUtil.INSTANCE;
        if (accUtil.isAccessibilityEnabled() || accUtil.isEnableAccEnableForced()) {
            dispatchViewInflate(view);
        }
        if (accUtil.canExpand() && MMHandlerThread.isMainThread() && (tagData = ViewTagManager.INSTANCE.getTagData(view)) != null) {
            Boolean havenExpand = tagData.getHavenExpand();
            Boolean bool = Boolean.TRUE;
            if (!C87412m.m108589b(havenExpand, bool)) {
                tagData.setHavenExpand(bool);
                AreaProvider.INSTANCE.dealOnViewInflateAsync(view);
            }
        }
    }

    public final void unbindConfig(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        for (Provider unbindConfig : providers) {
            unbindConfig.unbindConfig(appCompatActivity);
        }
        AreaProvider.INSTANCE.unbindConfig(appCompatActivity);
    }
}
