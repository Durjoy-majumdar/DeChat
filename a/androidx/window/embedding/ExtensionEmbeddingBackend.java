package androidx.window.embedding;

import android.app.Activity;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p329d3.C86165a;
import rx3.C13598b0;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0013\b\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0018\u0010(\u001a\u00060'R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, mo182094d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "rules", "Lrx3/b0;", "setSplitRules", "rule", "registerRule", "unregisterRule", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Ld3/a;", "", "Landroidx/window/embedding/SplitInfo;", "callback", "registerSplitListenerForActivity", "consumer", "unregisterSplitListenerForActivity", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "splitChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "splitInfoEmbeddingCallback", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", "Ljava/util/concurrent/CopyOnWriteArraySet;", "<init>", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "EmbeddingBackend";
    /* access modifiers changed from: private */
    public static volatile ExtensionEmbeddingBackend globalInstance;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    private EmbeddingInterfaceCompat embeddingExtension;
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks = new CopyOnWriteArrayList<>();
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    private final CopyOnWriteArraySet<EmbeddingRule> splitRules;

    @Metadata(mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo182094d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "()V", "TAG", "", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "initAndVerifyEmbeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "isExtensionVersionSupported", "", "extensionVersion", "", "(Ljava/lang/Integer;)Z", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                if (!isExtensionVersionSupported(companion.getExtensionApiLevel()) || !companion.isEmbeddingAvailable()) {
                    return null;
                }
                return new EmbeddingCompat();
            } catch (Throwable th) {
                C87412m.m108600m("Failed to load embedding extension: ", th);
                return null;
            }
        }

        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = ExtensionEmbeddingBackend.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension());
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            ExtensionEmbeddingBackend access$getGlobalInstance$cp = ExtensionEmbeddingBackend.globalInstance;
            C87412m.m108591d(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        public final boolean isExtensionVersionSupported(Integer num) {
            return num != null && num.intValue() >= 1;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo182094d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Lrx3/b0;", "onSplitInfoChanged", "lastInfo", "Ljava/util/List;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "(Ljava/util/List;)V", "<init>", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List<SplitInfo> lastInfo;
        public final /* synthetic */ ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(ExtensionEmbeddingBackend extensionEmbeddingBackend) {
            C87412m.m108594g(extensionEmbeddingBackend, "this$0");
            this.this$0 = extensionEmbeddingBackend;
        }

        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        public void onSplitInfoChanged(List<SplitInfo> list) {
            C87412m.m108594g(list, "splitInfo");
            this.lastInfo = list;
            Iterator<SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(list);
            }
        }

        public final void setLastInfo(List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo182094d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "Lrx3/b0;", "accept", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Ld3/a;", "callback", "Ld3/a;", "getCallback", "()Ld3/a;", "lastValue", "Ljava/util/List;", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ld3/a;)V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class SplitListenerWrapper {
        private final Activity activity;
        private final C86165a<List<SplitInfo>> callback;
        private final Executor executor;
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(Activity activity2, Executor executor2, C86165a<List<SplitInfo>> aVar) {
            C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(executor2, "executor");
            C87412m.m108594g(aVar, "callback");
            this.activity = activity2;
            this.executor = executor2;
            this.callback = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: accept$lambda-1  reason: not valid java name */
        public static final void m168130accept$lambda1(SplitListenerWrapper splitListenerWrapper, List list) {
            C87412m.m108594g(splitListenerWrapper, "this$0");
            C87412m.m108594g(list, "$splitsWithActivity");
            splitListenerWrapper.getCallback().accept(list);
        }

        public final void accept(List<SplitInfo> list) {
            C87412m.m108594g(list, "splitInfoList");
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((SplitInfo) next).contains(this.activity)) {
                    arrayList.add(next);
                }
            }
            if (!C87412m.m108589b(arrayList, this.lastValue)) {
                this.lastValue = arrayList;
                this.executor.execute(new ExtensionEmbeddingBackend$SplitListenerWrapper$$a(this, arrayList));
            }
        }

        public final C86165a<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    public ExtensionEmbeddingBackend(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }

    public void registerRule(EmbeddingRule embeddingRule) {
        C87412m.m108594g(embeddingRule, "rule");
        if (!this.splitRules.contains(embeddingRule)) {
            this.splitRules.add(embeddingRule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    public void registerSplitListenerForActivity(Activity activity, Executor executor, C86165a<List<SplitInfo>> aVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(executor, "executor");
        C87412m.m108594g(aVar, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                aVar.accept(C64186f0.f181907d);
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, aVar);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                C87412m.m108591d(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(C64186f0.f181907d);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    public void setSplitRules(Set<? extends EmbeddingRule> set) {
        C87412m.m108594g(set, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(set);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    public void unregisterRule(EmbeddingRule embeddingRule) {
        C87412m.m108594g(embeddingRule, "rule");
        if (this.splitRules.contains(embeddingRule)) {
            this.splitRules.remove(embeddingRule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    public void unregisterSplitListenerForActivity(C86165a<List<SplitInfo>> aVar) {
        C87412m.m108594g(aVar, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = getSplitChangeCallbacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (C87412m.m108589b(next.getCallback(), aVar)) {
                    getSplitChangeCallbacks().remove(next);
                    break;
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
