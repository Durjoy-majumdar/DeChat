package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p329d3.C86165a;
import rx3.C13598b0;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\u0013\b\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, mo182094d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", "activity", "", "isActivityRegistered", "Lrx3/b0;", "callbackRemovedForActivity", "Ljava/util/concurrent/Executor;", "executor", "Ld3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/layout/ExtensionInterfaceCompat;", "windowExtension", "Landroidx/window/layout/ExtensionInterfaceCompat;", "getWindowExtension", "()Landroidx/window/layout/ExtensionInterfaceCompat;", "setWindowExtension", "(Landroidx/window/layout/ExtensionInterfaceCompat;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "windowLayoutChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "<init>", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class SidecarWindowBackend implements WindowBackend {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final boolean DEBUG = false;
    private static final String TAG = "WindowServer";
    /* access modifiers changed from: private */
    public static volatile SidecarWindowBackend globalInstance;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo182094d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/SidecarWindowBackend;", "getInstance", "Landroidx/window/layout/ExtensionInterfaceCompat;", "initAndVerifyExtension", "Landroidx/window/core/Version;", "sidecarVersion", "", "isSidecarVersionSupported", "Lrx3/b0;", "resetInstance", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final SidecarWindowBackend getInstance(Context context) {
            C87412m.m108594g(context, "context");
            if (SidecarWindowBackend.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = SidecarWindowBackend.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (SidecarWindowBackend.globalInstance == null) {
                        SidecarWindowBackend.globalInstance = new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension(context));
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            SidecarWindowBackend access$getGlobalInstance$cp = SidecarWindowBackend.globalInstance;
            C87412m.m108591d(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        public final ExtensionInterfaceCompat initAndVerifyExtension(Context context) {
            C87412m.m108594g(context, "context");
            try {
                if (!isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.validateExtensionInterface()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean isSidecarVersionSupported(Version version) {
            return version != null && version.compareTo(Version.Companion.getVERSION_0_1()) >= 0;
        }

        public final void resetInstance() {
            SidecarWindowBackend.globalInstance = null;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, mo182094d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "Lrx3/b0;", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarWindowBackend;)V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        public final /* synthetic */ SidecarWindowBackend this$0;

        public ExtensionListenerImpl(SidecarWindowBackend sidecarWindowBackend) {
            C87412m.m108594g(sidecarWindowBackend, "this$0");
            this.this$0 = sidecarWindowBackend;
        }

        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(windowLayoutInfo, "newLayout");
            Iterator<WindowLayoutChangeCallbackWrapper> it = this.this$0.getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (C87412m.m108589b(next.getActivity(), activity)) {
                    next.accept(windowLayoutInfo);
                }
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo182094d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "Landroidx/window/layout/WindowLayoutInfo;", "newLayoutInfo", "Lrx3/b0;", "accept", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Ld3/a;", "callback", "Ld3/a;", "getCallback", "()Ld3/a;", "lastInfo", "Landroidx/window/layout/WindowLayoutInfo;", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo", "(Landroidx/window/layout/WindowLayoutInfo;)V", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ld3/a;)V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class WindowLayoutChangeCallbackWrapper {
        private final Activity activity;
        private final C86165a<WindowLayoutInfo> callback;
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(Activity activity2, Executor executor2, C86165a<WindowLayoutInfo> aVar) {
            C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(executor2, "executor");
            C87412m.m108594g(aVar, "callback");
            this.activity = activity2;
            this.executor = executor2;
            this.callback = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: accept$lambda-0  reason: not valid java name */
        public static final void m168903accept$lambda0(WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
            C87412m.m108594g(windowLayoutChangeCallbackWrapper, "this$0");
            C87412m.m108594g(windowLayoutInfo, "$newLayoutInfo");
            windowLayoutChangeCallbackWrapper.getCallback().accept(windowLayoutInfo);
        }

        public final void accept(WindowLayoutInfo windowLayoutInfo) {
            C87412m.m108594g(windowLayoutInfo, "newLayoutInfo");
            this.lastInfo = windowLayoutInfo;
            this.executor.execute(new SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$a(this, windowLayoutInfo));
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final C86165a<WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    public SidecarWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 != null) {
            extensionInterfaceCompat2.setExtensionCallback(new ExtensionListenerImpl(this));
        }
    }

    private final void callbackRemovedForActivity(Activity activity) {
        ExtensionInterfaceCompat extensionInterfaceCompat;
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        boolean z = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C87412m.m108589b(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z && (extensionInterfaceCompat = this.windowExtension) != null) {
            extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
        }
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (WindowLayoutChangeCallbackWrapper activity2 : copyOnWriteArrayList) {
            if (C87412m.m108589b(activity2.getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    public void registerLayoutChangeCallback(Activity activity, Executor executor, C86165a<WindowLayoutInfo> aVar) {
        WindowLayoutInfo windowLayoutInfo;
        T t;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(executor, "executor");
        C87412m.m108594g(aVar, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension2 = getWindowExtension();
            if (windowExtension2 == null) {
                aVar.accept(new WindowLayoutInfo(C64186f0.f181907d));
                return;
            }
            boolean isActivityRegistered = isActivityRegistered(activity);
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, aVar);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (!isActivityRegistered) {
                windowExtension2.onWindowLayoutChangeListenerAdded(activity);
            } else {
                Iterator<T> it = getWindowLayoutChangeCallbacks().iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(activity, ((WindowLayoutChangeCallbackWrapper) t).getActivity())) {
                        break;
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) t;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    public void unregisterLayoutChangeCallback(C86165a<WindowLayoutInfo> aVar) {
        C87412m.m108594g(aVar, "callback");
        synchronized (globalLock) {
            if (getWindowExtension() != null) {
                ArrayList<WindowLayoutChangeCallbackWrapper> arrayList = new ArrayList<>();
                Iterator<WindowLayoutChangeCallbackWrapper> it = getWindowLayoutChangeCallbacks().iterator();
                while (it.hasNext()) {
                    WindowLayoutChangeCallbackWrapper next = it.next();
                    if (next.getCallback() == aVar) {
                        arrayList.add(next);
                    }
                }
                getWindowLayoutChangeCallbacks().removeAll(arrayList);
                for (WindowLayoutChangeCallbackWrapper activity : arrayList) {
                    callbackRemovedForActivity(activity.getActivity());
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
