package p1173b9;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.firebase.FirebaseApp;

/* renamed from: b9.b */
public final class C113149b implements BackgroundDetector.BackgroundStateChangeListener {
    public final void onBackgroundStateChanged(boolean z) {
        FirebaseApp.onBackgroundStateChanged(z);
    }
}
