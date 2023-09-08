package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C103448e;
import com.tencent.p014mm.C0966R;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.widget.a */
public abstract class C103516a extends ViewGroup {

    /* renamed from: d */
    public final C103517a f305684d;

    /* renamed from: e */
    public final Context f305685e;

    /* renamed from: f */
    public ActionMenuView f305686f;

    /* renamed from: g */
    public ActionMenuPresenter f305687g;

    /* renamed from: h */
    public int f305688h;

    /* renamed from: i */
    public C107168a0 f305689i;

    /* renamed from: j */
    public boolean f305690j;

    /* renamed from: n */
    public boolean f305691n;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class C103517a implements C107173b0 {

        /* renamed from: a */
        public boolean f305692a = false;

        /* renamed from: b */
        public int f305693b;

        public C103517a() {
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            if (!this.f305692a) {
                C103516a aVar = C103516a.this;
                aVar.f305689i = null;
                C103516a.super.setVisibility(this.f305693b);
            }
        }

        /* renamed from: b */
        public void mo143457b(View view) {
            C103516a.super.setVisibility(0);
            this.f305692a = false;
        }

        /* renamed from: c */
        public void mo144304c(View view) {
            this.f305692a = true;
        }
    }

    public C103516a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public int mo144298c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: d */
    public int mo144299d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: e */
    public C107168a0 mo144300e(int i, long j) {
        C107168a0 a0Var = this.f305689i;
        if (a0Var != null) {
            a0Var.mo157606b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C107168a0 a = C107207u.m145160a(this);
            a.mo157605a(1.0f);
            a.mo157607c(j);
            C103517a aVar = this.f305684d;
            C103516a.this.f305689i = a;
            aVar.f305693b = i;
            a.mo157608d(aVar);
            return a;
        }
        C107168a0 a2 = C107207u.m145160a(this);
        a2.mo157605a(0.0f);
        a2.mo157607c(j);
        C103517a aVar2 = this.f305684d;
        C103516a.this.f305689i = a2;
        aVar2.f305693b = i;
        a2.mo157608d(aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f305689i != null ? this.f305684d.f305693b : getVisibility();
    }

    public int getContentHeight() {
        return this.f305688h;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C107593a.f321901a, C0966R.attr.f2627a2, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f305687g;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f305172e.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            actionMenuPresenter.f305391w = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            C103448e eVar = actionMenuPresenter.f305173f;
            if (eVar != null) {
                eVar.mo143611p(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f305691n = false;
        }
        if (!this.f305691n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f305691n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f305691n = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f305690j = false;
        }
        if (!this.f305690j) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f305690j = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f305690j = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f305688h = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C107168a0 a0Var = this.f305689i;
            if (a0Var != null) {
                a0Var.mo157606b();
            }
            super.setVisibility(i);
        }
    }

    public C103516a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f305684d = new C103517a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0966R.attr.f2624z, typedValue, true) || typedValue.resourceId == 0) {
            this.f305685e = context;
        } else {
            this.f305685e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
