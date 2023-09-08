package androidx.window.layout;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import p329d3.C86165a;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, mo182094d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Ld3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "Lrx3/b0;", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "activityToListeners", "Ljava/util/Map;", "listenerToActivity", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "MulticastConsumer", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    private final Map<Activity, MulticastConsumer> activityToListeners = new LinkedHashMap();
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock = new ReentrantLock();
    private final Map<C86165a<WindowLayoutInfo>, Activity> listenerToActivity = new LinkedHashMap();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo182094d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lrx3/b0;", "accept", "Ld3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "listener", "addListener", "removeListener", "", "isEmpty", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Ljava/util/concurrent/locks/ReentrantLock;", "multicastConsumerLock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastKnownValue", "Landroidx/window/layout/WindowLayoutInfo;", "", "registeredListeners", "Ljava/util/Set;", "<init>", "(Landroid/app/Activity;)V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class MulticastConsumer implements Consumer<WindowLayoutInfo> {
        private final Activity activity;
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock = new ReentrantLock();
        private final Set<C86165a<WindowLayoutInfo>> registeredListeners = new LinkedHashSet();

        public MulticastConsumer(Activity activity2) {
            C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.activity = activity2;
        }

        public final void addListener(C86165a<WindowLayoutInfo> aVar) {
            C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    aVar.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }

        public final void removeListener(C86165a<WindowLayoutInfo> aVar) {
            C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public void accept(WindowLayoutInfo windowLayoutInfo) {
            C87412m.m108594g(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                for (C86165a accept : this.registeredListeners) {
                    accept.accept(this.lastKnownValue);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent) {
        C87412m.m108594g(windowLayoutComponent, "component");
        this.component = windowLayoutComponent;
    }

    public void registerLayoutChangeCallback(Activity activity, Executor executor, C86165a<WindowLayoutInfo> aVar) {
        C13598b0 b0Var;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(executor, "executor");
        C87412m.m108594g(aVar, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                b0Var = null;
            } else {
                multicastConsumer.addListener(aVar);
                this.listenerToActivity.put(aVar, activity);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(aVar, activity);
                multicastConsumer2.addListener(aVar);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterLayoutChangeCallback(C86165a<WindowLayoutInfo> aVar) {
        C87412m.m108594g(aVar, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(aVar);
            if (activity != null) {
                MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
                if (multicastConsumer == null) {
                    reentrantLock.unlock();
                    return;
                }
                multicastConsumer.removeListener(aVar);
                if (multicastConsumer.isEmpty()) {
                    this.component.removeWindowLayoutInfoListener(multicastConsumer);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
