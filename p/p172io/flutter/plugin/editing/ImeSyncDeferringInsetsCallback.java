package p172io.flutter.plugin.editing;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback */
class ImeSyncDeferringInsetsCallback {
    /* access modifiers changed from: private */
    public boolean animating = false;
    private AnimationCallback animationCallback;
    /* access modifiers changed from: private */
    public int deferredInsetTypes;
    private InsetsListener insetsListener;
    /* access modifiers changed from: private */
    public WindowInsets lastWindowInsets;
    /* access modifiers changed from: private */
    public boolean needsSave = false;
    /* access modifiers changed from: private */
    public int overlayInsetTypes;
    /* access modifiers changed from: private */
    public View view;

    /* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback$AnimationCallback */
    public class AnimationCallback extends WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.this.animating && (windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused = ImeSyncDeferringInsetsCallback.this.animating = false;
                if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            if ((windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused = ImeSyncDeferringInsetsCallback.this.animating = true;
                boolean unused2 = ImeSyncDeferringInsetsCallback.this.needsSave = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                boolean z = false;
                for (WindowInsetsAnimation typeMask : list) {
                    if ((typeMask.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z = true;
                    }
                }
                if (!z) {
                    return windowInsets;
                }
                WindowInsets.Builder builder = new WindowInsets.Builder(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                builder.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.overlayInsetTypes).bottom, 0)));
                ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(builder.build());
            }
            return windowInsets;
        }
    }

    /* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback$InsetsListener */
    public class InsetsListener implements View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            View unused = ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                WindowInsets unused2 = ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                boolean unused3 = ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            return ImeSyncDeferringInsetsCallback.this.animating ? WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
        }
    }

    public ImeSyncDeferringInsetsCallback(View view2, int i, int i2) {
        this.overlayInsetTypes = i;
        this.deferredInsetTypes = i2;
        this.view = view2;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new InsetsListener();
    }

    public WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback((WindowInsetsAnimation.Callback) null);
        this.view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
    }
}
