package nj3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: nj3.s0 */
public class C76901s0 extends PopupWindow {

    /* renamed from: d */
    public View.OnTouchListener f224751d;

    /* renamed from: e */
    public Context f224752e;

    /* renamed from: nj3.s0$a */
    public class C76902a extends FrameLayout {
        public C76902a(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (keyEvent.getKeyCode() != 4) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
                return super.dispatchKeyEvent(keyEvent);
            } else {
                C76901s0.this.dismiss();
                return true;
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            View.OnTouchListener onTouchListener = C76901s0.this.f224751d;
            if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        }

        public int[] onCreateDrawableState(int i) {
            return super.onCreateDrawableState(i);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0 && (x < 0 || x >= getWidth() || y < 0 || y >= getHeight())) {
                C76901s0.this.dismiss();
                return true;
            } else if (motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            } else {
                C76901s0.this.dismiss();
                return true;
            }
        }

        public void sendAccessibilityEvent(int i) {
            if (getChildCount() == 1) {
                getChildAt(0).sendAccessibilityEvent(i);
            } else {
                super.sendAccessibilityEvent(i);
            }
            super.sendAccessibilityEvent(i);
        }
    }

    public C76901s0(Context context) {
        super(context);
        this.f224752e = context;
        super.setBackgroundDrawable((Drawable) null);
        setContentView(new C76902a(this.f224752e));
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            C85975v4.m106305b("MicroMsg.MMPopupWindow", "dismiss exception, e = " + e.getMessage(), new Object[0]);
        }
    }

    public Drawable getBackground() {
        View contentView = getContentView();
        if (contentView != null && (contentView instanceof C76902a)) {
            return contentView.getBackground();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        View contentView = getContentView();
        if (contentView != null) {
            Context context = contentView.getContext();
            if (contentView instanceof C76902a) {
                contentView.setBackgroundDrawable(drawable);
                return;
            }
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            int i = -2;
            if (layoutParams == null || layoutParams.height != -2) {
                i = -1;
            }
            C76902a aVar = new C76902a(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i);
            aVar.setBackgroundDrawable(drawable);
            aVar.addView(contentView, layoutParams2);
            super.setContentView(aVar);
        }
    }

    public void setContentView(View view) {
        View contentView = getContentView();
        if (contentView == null) {
            super.setContentView(view);
        } else if (contentView instanceof C76902a) {
            C76902a aVar = (C76902a) contentView;
            aVar.removeAllViews();
            if (view == null) {
                super.setContentView(aVar);
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = -2;
            if (layoutParams == null || layoutParams.height != -2) {
                i = -1;
            }
            aVar.addView(view, new FrameLayout.LayoutParams(-1, i));
            super.setContentView(aVar);
            return;
        }
        super.setContentView(view);
    }

    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f224751d = onTouchListener;
    }

    public C76901s0(View view) {
        super(view);
        this.f224752e = null;
        super.setBackgroundDrawable((Drawable) null);
    }

    public C76901s0(View view, int i, int i2) {
        super(view, i, i2);
        this.f224752e = null;
        super.setBackgroundDrawable((Drawable) null);
    }

    public C76901s0(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        this.f224752e = null;
        super.setBackgroundDrawable((Drawable) null);
    }
}
