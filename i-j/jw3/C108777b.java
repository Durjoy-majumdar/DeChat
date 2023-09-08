package jw3;

import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import iw3.C117281a;
import java.util.List;
import rv3.C118245h;

/* renamed from: jw3.b */
public abstract class C108777b implements Window.Callback {

    /* renamed from: d */
    public final Window.Callback f325716d;

    public C108777b(Window.Callback callback) {
        if (callback != null) {
            this.f325716d = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f325716d.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f325716d.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f325716d.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f325716d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C108779d dVar = (C108779d) this;
        C108778c cVar = dVar.f325717e;
        String str = dVar.f325718f;
        C117281a.C108488b bVar = (C117281a.C108488b) cVar;
        bVar.getClass();
        if (!TextUtils.isEmpty(str) && motionEvent != null) {
            C118245h.m166799a("TuringTouch", "[method: onTouch sMyTouchCallback] " + motionEvent.getActionMasked());
            C117281a.m165348a(C117281a.this, str, motionEvent);
        }
        return this.f325716d.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f325716d.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f325716d.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f325716d.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f325716d.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f325716d.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f325716d.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f325716d.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f325716d.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f325716d.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f325716d.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f325716d.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f325716d.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f325716d.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f325716d.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f325716d.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f325716d.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f325716d.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f325716d.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f325716d.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f325716d.onWindowStartingActionMode(callback, i);
    }
}
