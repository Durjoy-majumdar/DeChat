package androidx.window.layout;

import android.content.Context;
import androidx.window.layout.WindowInfoTracker;

/* renamed from: androidx.window.layout.a */
public final /* synthetic */ class C113027a {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.Companion;
    }

    /* renamed from: a */
    public static WindowInfoTracker m154645a(Context context) {
        return WindowInfoTracker.Companion.getOrCreate(context);
    }

    /* renamed from: b */
    public static void m154646b(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    /* renamed from: c */
    public static void m154647c() {
        WindowInfoTracker.Companion.reset();
    }
}
