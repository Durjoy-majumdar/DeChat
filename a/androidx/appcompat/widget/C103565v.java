package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C103447d;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.v */
public class C103565v extends ListPopupWindow implements C103564u {

    /* renamed from: J */
    public static Method f305850J;

    /* renamed from: I */
    public C103564u f305851I;

    /* renamed from: androidx.appcompat.widget.v$a */
    public static class C103566a extends C103557q {

        /* renamed from: t */
        public final int f305852t;

        /* renamed from: u */
        public final int f305853u;

        /* renamed from: v */
        public C103564u f305854v;

        /* renamed from: w */
        public MenuItem f305855w;

        public C103566a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f305852t = 21;
                this.f305853u = 22;
                return;
            }
            this.f305852t = 22;
            this.f305853u = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C103447d dVar;
            int pointToPosition;
            int i2;
            if (this.f305854v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (C103447d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    dVar = (C103447d) adapter;
                }
                C103452g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < dVar.getCount()) {
                    gVar = dVar.getItem(i2);
                }
                MenuItem menuItem = this.f305855w;
                if (menuItem != gVar) {
                    C103448e eVar = dVar.f305224d;
                    if (menuItem != null) {
                        this.f305854v.mo143562b(eVar, menuItem);
                    }
                    this.f305855w = gVar;
                    if (gVar != null) {
                        this.f305854v.mo143561a(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f305852t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f305853u) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C103447d) getAdapter()).f305224d.mo143591c(false);
                return true;
            }
        }

        public void setHoverListener(C103564u uVar) {
            this.f305854v = uVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f305850J = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
        }
    }

    public C103565v(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public void mo143561a(C103448e eVar, MenuItem menuItem) {
        C103564u uVar = this.f305851I;
        if (uVar != null) {
            uVar.mo143561a(eVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo143562b(C103448e eVar, MenuItem menuItem) {
        C103564u uVar = this.f305851I;
        if (uVar != null) {
            uVar.mo143562b(eVar, menuItem);
        }
    }

    /* renamed from: c */
    public C103557q mo144090c(Context context, boolean z) {
        C103566a aVar = new C103566a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: f */
    public void mo144442f(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f305514E.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: g */
    public void mo144443g(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f305514E.setExitTransition((Transition) obj);
        }
    }
}
