package p172io.flutter.embedding.android;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import go3.C76019y;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b4\u00105J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0014J\b\u0010\f\u001a\u00020\bH\u0014J\b\u0010\r\u001a\u00020\bH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0004J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0011J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020\bH\u0016R\u001a\u0010%\u001a\u00020$8\u0006XD¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00198\u0006XD¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, mo182094d2 = {"Lio/flutter/embedding/android/PatchedSwipeBackActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lgo3/y$a;", "Lcom/tencent/mm/ui/widget/SwipeBackLayout$c;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/os/PersistableBundle;", "persistentState", "Lrx3/b0;", "onCreate", "onStart", "onPause", "onResume", "onStop", "onDestroy", "Landroid/view/KeyEvent;", "event", "", "dispatchKeyEvent", "initSwipeBack", "Lcom/tencent/mm/ui/widget/SwipeBackLayout;", "getSwipeBackLayout", "isSwiping", "enable", "setEnableGesture", "", "scrollParent", "onSwipe", "open", "", "speed", "onSettle", "forceRemoveNoMatchOnPath", "onSwipeBack", "onDrag", "onCancel", "", "ANIMATION_DURATION", "J", "getANIMATION_DURATION", "()J", "WIDTH_SETTLE_FACT", "F", "getWIDTH_SETTLE_FACT", "()F", "mSwipeBackLayout", "Lcom/tencent/mm/ui/widget/SwipeBackLayout;", "Landroid/view/View;", "mContentViewForSwipeBack", "Landroid/view/View;", "mSwiping", "Z", "<init>", "()V", "plugin-flutter_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: io.flutter.embedding.android.PatchedSwipeBackActivity */
public class PatchedSwipeBackActivity extends AppCompatActivity implements C76019y.C76020a, SwipeBackLayout.C19847c {
    private final long ANIMATION_DURATION = 260;
    private final float WIDTH_SETTLE_FACT = 3.5f;
    private byte _hellAccFlag_;
    private View mContentViewForSwipeBack;
    private SwipeBackLayout mSwipeBackLayout;
    private boolean mSwiping;

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        if (keyEvent.getKeyCode() == 4 && swipeBackLayout != null) {
            swipeBackLayout.mo26379a();
            if (swipeBackLayout.f56498v) {
                Log.m105928w("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event");
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean forceRemoveNoMatchOnPath() {
        return false;
    }

    public final long getANIMATION_DURATION() {
        return this.ANIMATION_DURATION;
    }

    public final SwipeBackLayout getSwipeBackLayout() {
        return this.mSwipeBackLayout;
    }

    public final float getWIDTH_SETTLE_FACT() {
        return this.WIDTH_SETTLE_FACT;
    }

    public final void initSwipeBack() {
        View decorView = getWindow().getDecorView();
        C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        SwipeBackLayout swipeBackLayout = (SwipeBackLayout) LayoutInflater.from(this).inflate(C0966R.C0971layout.c7z, viewGroup, false);
        this.mSwipeBackLayout = swipeBackLayout;
        C87412m.m108591d(swipeBackLayout);
        swipeBackLayout.mo26380b();
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundDrawable((Drawable) null);
        View childAt = viewGroup.getChildAt(0);
        childAt.setBackgroundResource(C0966R.color.ahf);
        viewGroup.removeView(childAt);
        SwipeBackLayout swipeBackLayout2 = this.mSwipeBackLayout;
        C87412m.m108591d(swipeBackLayout2);
        swipeBackLayout2.addView(childAt);
        SwipeBackLayout swipeBackLayout3 = this.mSwipeBackLayout;
        C87412m.m108591d(swipeBackLayout3);
        swipeBackLayout3.setContentView(childAt);
        viewGroup.addView(this.mSwipeBackLayout);
        SwipeBackLayout swipeBackLayout4 = this.mSwipeBackLayout;
        C87412m.m108591d(swipeBackLayout4);
        swipeBackLayout4.setSwipeGestureDelegate(this);
    }

    public final boolean isSwiping() {
        return this.mSwiping;
    }

    public void onCancel() {
        this.mSwiping = false;
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDrag() {
        this.mSwiping = true;
    }

    public void onPause() {
        super.onPause();
        if (getSwipeBackLayout() != null) {
            SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            C87412m.m108591d(swipeBackLayout);
            swipeBackLayout.setEnableGesture(false);
        }
        if (!isFinishing()) {
            C76019y.m91316d(this);
        }
    }

    public void onResume() {
        super.onResume();
        C76019y.m91315c(this);
        onSwipe(1.0f);
        if (getSwipeBackLayout() != null) {
            SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            C87412m.m108591d(swipeBackLayout);
            swipeBackLayout.setEnableGesture(true);
            SwipeBackLayout swipeBackLayout2 = getSwipeBackLayout();
            C87412m.m108591d(swipeBackLayout2);
            swipeBackLayout2.f56498v = false;
        }
    }

    public void onSettle(boolean z, int i) {
        if (this.mContentViewForSwipeBack == null) {
            Window window = getWindow();
            ActionBar supportActionBar = getSupportActionBar();
            C87412m.m108591d(supportActionBar);
            this.mContentViewForSwipeBack = C85875k4.m106172b(window, supportActionBar.mo91099j());
        }
        View view = this.mContentViewForSwipeBack;
        if (z) {
            C74863w0.m89620a(view, i > 0 ? this.ANIMATION_DURATION / ((long) 2) : this.ANIMATION_DURATION, 0.0f, 0.0f, (C74863w0.C74865b) null);
            return;
        }
        long j = i > 0 ? this.ANIMATION_DURATION / ((long) 2) : this.ANIMATION_DURATION;
        C87412m.m108591d(view);
        C74863w0.m89620a(view, j, ((float) (view.getWidth() * -1)) / this.WIDTH_SETTLE_FACT, 0.0f, (C74863w0.C74865b) null);
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public void onSwipe(float f) {
        View view;
        if (this.mContentViewForSwipeBack == null) {
            Window window = getWindow();
            if (getSupportActionBar() != null) {
                ActionBar supportActionBar = getSupportActionBar();
                C87412m.m108591d(supportActionBar);
                view = supportActionBar.mo91099j();
            } else {
                view = null;
            }
            this.mContentViewForSwipeBack = C85875k4.m106172b(window, view);
        }
        View view2 = this.mContentViewForSwipeBack;
        if (Float.compare(1.0f, f) <= 0) {
            C74863w0.m89622c(view2, 0.0f, 0.0f);
            return;
        }
        C87412m.m108591d(view2);
        C74863w0.m89622c(view2, (((float) view2.getWidth()) / this.WIDTH_SETTLE_FACT) * (1.0f - f) * ((float) -1), 0.0f);
    }

    public void onSwipeBack() {
        if (!isFinishing()) {
            finish();
        }
        View decorView = getWindow().getDecorView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(decorView, aVar.mo10232b(), "io/flutter/embedding/android/PatchedSwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(decorView, "io/flutter/embedding/android/PatchedSwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        overridePendingTransition(0, 0);
        this.mSwiping = false;
    }

    public final void setEnableGesture(boolean z) {
        SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        C87412m.m108591d(swipeBackLayout);
        swipeBackLayout.setEnableGesture(z);
    }
}
