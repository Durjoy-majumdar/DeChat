package p990k;

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
import java.util.List;

/* renamed from: k.h */
public class C108791h implements Window.Callback {

    /* renamed from: d */
    public final Window.Callback f325779d;

    public C108791h(Window.Callback callback) {
        if (callback != null) {
            this.f325779d = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f325779d.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f325779d.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f325779d.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f325779d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f325779d.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f325779d.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f325779d.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f325779d.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f325779d.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f325779d.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f325779d.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f325779d.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f325779d.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f325779d.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f325779d.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f325779d.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f325779d.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f325779d.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f325779d.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f325779d.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f325779d.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f325779d.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f325779d.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f325779d.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f325779d.onWindowStartingActionMode(callback, i);
    }
}
