package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p329d3.C86165a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64187h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u001a\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo182094d2 = {"Landroidx/window/embedding/SplitController;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRules", "Lrx3/b0;", "setStaticSplitRules", "getSplitRules", "rule", "registerRule", "unregisterRule", "clearRegisteredRules", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Ld3/a;", "", "Landroidx/window/embedding/SplitInfo;", "consumer", "addSplitListener", "removeSplitListener", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "staticSplitRules", "Ljava/util/Set;", "<init>", "()V", "Companion", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class SplitController {
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public static volatile SplitController globalInstance;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo182094d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "Landroidx/window/embedding/SplitController;", "getInstance", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "Lrx3/b0;", "initialize", "globalInstance", "Landroidx/window/embedding/SplitController;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "<init>", "()V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = SplitController.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        SplitController.globalInstance = new SplitController((C8480h) null);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            SplitController access$getGlobalInstance$cp = SplitController.globalInstance;
            C87412m.m108591d(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        public final void initialize(Context context, int i) {
            C87412m.m108594g(context, "context");
            Set parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i);
            SplitController instance = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = C64187h0.f181908d;
            }
            instance.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = C64187h0.f181908d;
    }

    public /* synthetic */ SplitController(C8480h hVar) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i) {
        Companion.initialize(context, i);
    }

    /* access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, C86165a<List<SplitInfo>> aVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(executor, "executor");
        C87412m.m108594g(aVar, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, aVar);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return C110818d0.m150904D0(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule embeddingRule) {
        C87412m.m108594g(embeddingRule, "rule");
        this.embeddingBackend.registerRule(embeddingRule);
    }

    public final void removeSplitListener(C86165a<List<SplitInfo>> aVar) {
        C87412m.m108594g(aVar, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(aVar);
    }

    public final void unregisterRule(EmbeddingRule embeddingRule) {
        C87412m.m108594g(embeddingRule, "rule");
        this.embeddingBackend.unregisterRule(embeddingRule);
    }
}
