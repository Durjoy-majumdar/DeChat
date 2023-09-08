package vn3;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.InputQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: vn3.l */
public final class C118692l extends Window {

    /* renamed from: a */
    public final Activity f355164a;

    /* renamed from: b */
    public final Fragment f355165b;

    /* renamed from: c */
    public final C13601g f355166c = C36568h.m40985a(new C118693a(this));

    /* renamed from: vn3.l$a */
    public static final class C118693a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C118692l f355167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118693a(C118692l lVar) {
            super(0);
            this.f355167d = lVar;
        }

        public Object invoke() {
            return new View(this.f355167d.f355164a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118692l(Activity activity, Fragment fragment) {
        super(activity);
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(fragment, "fragment");
        this.f355164a = activity;
        this.f355165b = fragment;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public void closeAllPanels() {
    }

    public void closePanel(int i) {
    }

    public View getCurrentFocus() {
        return this.f355164a.getWindow().getCurrentFocus();
    }

    public View getDecorView() {
        View view = this.f355165b.getView();
        return view == null ? (View) ((C36570n) this.f355166c).getValue() : view;
    }

    public LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.f355164a.getWindow().getLayoutInflater();
        C87412m.m108593f(layoutInflater, "activity.window.layoutInflater");
        return layoutInflater;
    }

    public int getNavigationBarColor() {
        return 0;
    }

    public int getStatusBarColor() {
        return 0;
    }

    public int getVolumeControlStream() {
        return 0;
    }

    public WindowManager getWindowManager() {
        WindowManager windowManager = this.f355164a.getWindowManager();
        C87412m.m108593f(windowManager, "activity.windowManager");
        return windowManager;
    }

    public void invalidatePanelMenu(int i) {
    }

    public boolean isFloating() {
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    public void onActive() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void openPanel(int i, KeyEvent keyEvent) {
    }

    public View peekDecorView() {
        return (View) ((C36570n) this.f355166c).getValue();
    }

    public boolean performContextMenuIdentifierAction(int i, int i2) {
        return false;
    }

    public boolean performPanelIdentifierAction(int i, int i2, int i3) {
        return false;
    }

    public boolean performPanelShortcut(int i, int i2, KeyEvent keyEvent, int i3) {
        return false;
    }

    public void restoreHierarchyState(Bundle bundle) {
    }

    public Bundle saveHierarchyState() {
        return new Bundle();
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setChildDrawable(int i, Drawable drawable) {
    }

    public void setChildInt(int i, int i2) {
    }

    public void setContentView(int i) {
    }

    public void setContentView(View view) {
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public void setDecorCaptionShade(int i) {
    }

    public void setFeatureDrawable(int i, Drawable drawable) {
    }

    public void setFeatureDrawableAlpha(int i, int i2) {
    }

    public void setFeatureDrawableResource(int i, int i2) {
    }

    public void setFeatureDrawableUri(int i, Uri uri) {
    }

    public void setFeatureInt(int i, int i2) {
    }

    public void setNavigationBarColor(int i) {
    }

    public void setResizingCaptionDrawable(Drawable drawable) {
    }

    public void setStatusBarColor(int i) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setTitleColor(int i) {
    }

    public void setVolumeControlStream(int i) {
    }

    public boolean superDispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean superDispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean superDispatchTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    public void takeInputQueue(InputQueue.Callback callback) {
    }

    public void takeKeyEvents(boolean z) {
    }

    public void takeSurface(SurfaceHolder.Callback2 callback2) {
    }

    public void togglePanel(int i, KeyEvent keyEvent) {
    }
}
