package p172io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import p329d3.C86165a;

/* renamed from: io.flutter.embedding.android.WindowInfoRepositoryCallbackAdapterWrapper */
public class WindowInfoRepositoryCallbackAdapterWrapper {
    public final WindowInfoTrackerCallbackAdapter adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.adapter = windowInfoTrackerCallbackAdapter;
    }

    public void addWindowLayoutInfoListener(Activity activity, Executor executor, C86165a<WindowLayoutInfo> aVar) {
        this.adapter.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void removeWindowLayoutInfoListener(C86165a<WindowLayoutInfo> aVar) {
        this.adapter.removeWindowLayoutInfoListener(aVar);
    }
}
