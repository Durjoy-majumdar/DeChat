package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import p329d3.C86165a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\f"}, mo182094d2 = {"Landroidx/window/layout/WindowBackend;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Ld3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "Lrx3/b0;", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, C86165a<WindowLayoutInfo> aVar);

    void unregisterLayoutChangeCallback(C86165a<WindowLayoutInfo> aVar);
}
