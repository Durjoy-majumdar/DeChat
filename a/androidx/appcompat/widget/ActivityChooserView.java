package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import p1130l.C109068h;
import p433g.C107593a;
import p849e3.C107170b;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: d */
    public final C103486f f305423d;

    /* renamed from: e */
    public final C103487g f305424e;

    /* renamed from: f */
    public final View f305425f;

    /* renamed from: g */
    public final Drawable f305426g;

    /* renamed from: h */
    public final FrameLayout f305427h;

    /* renamed from: i */
    public final ImageView f305428i;

    /* renamed from: j */
    public final FrameLayout f305429j;

    /* renamed from: n */
    public C107170b f305430n;

    /* renamed from: o */
    public final ViewTreeObserver.OnGlobalLayoutListener f305431o;

    /* renamed from: p */
    public ListPopupWindow f305432p;

    /* renamed from: q */
    public PopupWindow.OnDismissListener f305433q;

    /* renamed from: r */
    public boolean f305434r;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: d */
        public static final int[] f305435d = {16842964};

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r1 = r4.getResourceId(0, 0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InnerLayout(android.content.Context r3, android.util.AttributeSet r4) {
            /*
                r2 = this;
                r2.<init>(r3, r4)
                int[] r0 = f305435d
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
                r0 = 0
                boolean r1 = r4.hasValue(r0)
                if (r1 == 0) goto L_0x001b
                int r1 = r4.getResourceId(r0, r0)
                if (r1 == 0) goto L_0x001b
                android.graphics.drawable.Drawable r3 = p1115h.C107922a.m146228b(r3, r1)
                goto L_0x001f
            L_0x001b:
                android.graphics.drawable.Drawable r3 = r4.getDrawable(r0)
            L_0x001f:
                r2.setBackgroundDrawable(r3)
                r4.recycle()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.InnerLayout.<init>(android.content.Context, android.util.AttributeSet):void");
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C103481a extends DataSetObserver {
        public C103481a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f305423d.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f305423d.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class C103482b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C103482b() {
        }

        public void onGlobalLayout() {
            C107170b.C107171a aVar;
            if (!ActivityChooserView.this.mo143843b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().show();
            C107170b bVar = ActivityChooserView.this.f305430n;
            if (bVar != null && (aVar = bVar.f320759b) != null) {
                ((ActionMenuPresenter) aVar).mo143808n(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C103483c extends View.AccessibilityDelegate {
        public C103483c(ActivityChooserView activityChooserView) {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C103484d extends C103560s {
        public C103484d(View view) {
            super(view);
        }

        /* renamed from: b */
        public C109068h mo143517b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* renamed from: c */
        public boolean mo143518c() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.mo143843b() || !activityChooserView.f305434r) {
                return true;
            }
            activityChooserView.f305423d.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }

        /* renamed from: d */
        public boolean mo143817d() {
            ActivityChooserView.this.mo143842a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C103485e extends DataSetObserver {
        public C103485e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f305423d.getClass();
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C103486f extends BaseAdapter {
        public C103486f() {
        }

        public int getCount() {
            throw null;
        }

        public Object getItem(int i) {
            getItemViewType(i);
            throw null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            getItemViewType(i);
            if (view == null || view.getId() != C0966R.C0970id.fp8) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0966R.C0971layout.f6276ae, viewGroup, false);
            }
            ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f15);
            getItem(i);
            throw null;
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class C103487g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public C103487g() {
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f305429j) {
                activityChooserView.mo143842a();
                ActivityChooserView.this.f305423d.getClass();
                throw null;
            } else if (view == activityChooserView.f305427h) {
                activityChooserView.f305423d.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            C107170b.C107171a aVar;
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f305433q;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            C107170b bVar = ActivityChooserView.this.f305430n;
            if (bVar != null && (aVar = bVar.f320759b) != null) {
                ((ActionMenuPresenter) aVar).mo143808n(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((C103486f) adapterView.getAdapter()).getItemViewType(i);
            ActivityChooserView.this.mo143842a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.getClass();
            activityChooserView.f305423d.getClass();
            throw null;
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f305429j) {
                activityChooserView.f305423d.getClass();
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean mo143842a() {
        if (!mo143843b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f305431o);
        return true;
    }

    /* renamed from: b */
    public boolean mo143843b() {
        return getListPopupWindow().isShowing();
    }

    public C103521c getDataModel() {
        this.f305423d.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f305432p == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext(), (AttributeSet) null, C0966R.attr.f2862tz);
            this.f305432p = listPopupWindow;
            listPopupWindow.mo144018d(this.f305423d);
            ListPopupWindow listPopupWindow2 = this.f305432p;
            listPopupWindow2.f305529u = this;
            listPopupWindow2.f305513D = true;
            listPopupWindow2.f305514E.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f305432p;
            C103487g gVar = this.f305424e;
            listPopupWindow3.f305530v = gVar;
            listPopupWindow3.f305514E.setOnDismissListener(gVar);
        }
        return this.f305432p;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f305423d.getClass();
        this.f305434r = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f305423d.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f305431o);
        }
        if (mo143843b()) {
            mo143842a();
        }
        this.f305434r = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f305425f.layout(0, 0, i3 - i, i4 - i2);
        if (!mo143843b()) {
            mo143842a();
        }
    }

    public void onMeasure(int i, int i2) {
        View view = this.f305425f;
        if (this.f305429j.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C103521c cVar) {
        C103486f fVar = this.f305423d;
        ActivityChooserView.this.f305423d.getClass();
        fVar.notifyDataSetChanged();
        if (mo143843b()) {
            mo143842a();
            if (!mo143843b() && this.f305434r) {
                this.f305423d.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            }
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f305428i.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f305428i.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f305433q = onDismissListener;
    }

    public void setProvider(C107170b bVar) {
        this.f305430n = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C103481a();
        this.f305431o = new C103482b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321905e, i, 0);
        obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6275ad, this, true);
        C103487g gVar = new C103487g();
        this.f305424e = gVar;
        View findViewById = findViewById(C0966R.C0970id.f5477g8);
        this.f305425f = findViewById;
        this.f305426g = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.bzw);
        this.f305429j = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        ImageView imageView = (ImageView) frameLayout.findViewById(C0966R.C0970id.f39);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C0966R.C0970id.cmx);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C103483c(this));
        frameLayout2.setOnTouchListener(new C103484d(frameLayout2));
        this.f305427h = frameLayout2;
        ImageView imageView2 = (ImageView) frameLayout2.findViewById(C0966R.C0970id.f39);
        this.f305428i = imageView2;
        imageView2.setImageDrawable(drawable);
        C103486f fVar = new C103486f();
        this.f305423d = fVar;
        fVar.registerDataSetObserver(new C103485e());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0966R.dimen.f4012nr));
    }
}
