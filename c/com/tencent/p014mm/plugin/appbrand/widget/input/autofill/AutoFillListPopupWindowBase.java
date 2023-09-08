package com.tencent.p014mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase */
class AutoFillListPopupWindowBase {

    /* renamed from: a */
    public Context f197356a;

    /* renamed from: b */
    public PopupWindow f197357b;

    /* renamed from: c */
    public ListAdapter f197358c;

    /* renamed from: d */
    public C68700a f197359d;

    /* renamed from: e */
    public int f197360e;

    /* renamed from: f */
    public int f197361f;

    /* renamed from: g */
    public int f197362g;

    /* renamed from: h */
    public boolean f197363h;

    /* renamed from: i */
    public boolean f197364i;

    /* renamed from: j */
    public boolean f197365j;

    /* renamed from: k */
    public int f197366k;

    /* renamed from: l */
    public DataSetObserver f197367l;

    /* renamed from: m */
    public View f197368m;

    /* renamed from: n */
    public final C68705f f197369n;

    /* renamed from: o */
    public final C68704e f197370o;

    /* renamed from: p */
    public final C68703d f197371p;

    /* renamed from: q */
    public final C68701b f197372q;

    /* renamed from: r */
    public MMHandler f197373r;

    /* renamed from: s */
    public Rect f197374s;

    /* renamed from: t */
    public boolean f197375t;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase$a */
    public static class C68700a extends ListView {

        /* renamed from: d */
        public boolean f197376d;

        /* renamed from: e */
        public boolean f197377e;

        public C68700a(Context context, boolean z) {
            super(context, (AttributeSet) null, C0966R.attr.f2789ke);
            this.f197377e = z;
            setCacheColorHint(0);
        }

        public boolean hasFocus() {
            return this.f197377e || super.hasFocus();
        }

        public boolean hasWindowFocus() {
            return this.f197377e || super.hasWindowFocus();
        }

        public boolean isFocused() {
            return this.f197377e || super.isFocused();
        }

        public boolean isInTouchMode() {
            return (this.f197377e && this.f197376d) || super.isInTouchMode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase$b */
    public class C68701b implements Runnable {
        public C68701b(C68707g gVar) {
        }

        public void run() {
            C68700a aVar = AutoFillListPopupWindowBase.this.f197359d;
            if (aVar != null) {
                aVar.f197376d = true;
                aVar.requestLayout();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase$c */
    public class C68702c extends DataSetObserver {
        public C68702c(C68707g gVar) {
        }

        public void onChanged() {
            if (AutoFillListPopupWindowBase.this.mo94496b()) {
                AutoFillListPopupWindowBase.this.mo94497c();
            }
        }

        public void onInvalidated() {
            AutoFillListPopupWindowBase.this.mo94495a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase$d */
    public class C68703d implements AbsListView.OnScrollListener {
        public C68703d(C68707g gVar) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            AutoFillListPopupWindowBase autoFillListPopupWindowBase = AutoFillListPopupWindowBase.this;
            if (autoFillListPopupWindowBase.f197359d != null) {
                autoFillListPopupWindowBase.getClass();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            boolean z = true;
            if (i == 1) {
                if (AutoFillListPopupWindowBase.this.f197357b.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && AutoFillListPopupWindowBase.this.f197357b.getContentView() != null) {
                    AutoFillListPopupWindowBase autoFillListPopupWindowBase = AutoFillListPopupWindowBase.this;
                    autoFillListPopupWindowBase.f197373r.removeCallbacks(autoFillListPopupWindowBase.f197369n);
                    AutoFillListPopupWindowBase.this.f197369n.run();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase$e */
    public class C68704e implements View.OnTouchListener {
        public C68704e(C68707g gVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupTouchInterceptor", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = AutoFillListPopupWindowBase.this.f197357b) != null && popupWindow.isShowing() && x >= 0 && x < AutoFillListPopupWindowBase.this.f197357b.getWidth() && y >= 0 && y < AutoFillListPopupWindowBase.this.f197357b.getHeight()) {
                AutoFillListPopupWindowBase autoFillListPopupWindowBase = AutoFillListPopupWindowBase.this;
                autoFillListPopupWindowBase.f197373r.postDelayed(autoFillListPopupWindowBase.f197369n, 250);
            } else if (action == 1) {
                AutoFillListPopupWindowBase autoFillListPopupWindowBase2 = AutoFillListPopupWindowBase.this;
                autoFillListPopupWindowBase2.f197373r.removeCallbacks(autoFillListPopupWindowBase2.f197369n);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupTouchInterceptor", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase$f */
    public class C68705f implements Runnable {
        public C68705f(C68707g gVar) {
        }

        public void run() {
            C68700a aVar = AutoFillListPopupWindowBase.this.f197359d;
            if (aVar != null && aVar.getCount() > AutoFillListPopupWindowBase.this.f197359d.getChildCount()) {
                int childCount = AutoFillListPopupWindowBase.this.f197359d.getChildCount();
                AutoFillListPopupWindowBase autoFillListPopupWindowBase = AutoFillListPopupWindowBase.this;
                if (childCount <= autoFillListPopupWindowBase.f197366k) {
                    autoFillListPopupWindowBase.f197357b.setInputMethodMode(2);
                    AutoFillListPopupWindowBase.this.mo94497c();
                }
            }
        }
    }

    public AutoFillListPopupWindowBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2862tz);
    }

    /* renamed from: a */
    public void mo94495a() {
        this.f197357b.dismiss();
        this.f197357b.setContentView((View) null);
        this.f197359d = null;
        this.f197373r.removeCallbacks(this.f197369n);
    }

    /* renamed from: b */
    public boolean mo94496b() {
        return this.f197357b.isShowing();
    }

    /* renamed from: c */
    public void mo94497c() {
        int i;
        int i2;
        int i3;
        int i4;
        C68700a aVar;
        int i5;
        View view;
        if (this.f197359d == null) {
            C68700a aVar2 = new C68700a(this.f197356a, !this.f197375t);
            this.f197359d = aVar2;
            aVar2.setAdapter(this.f197358c);
            this.f197359d.setOnItemClickListener((AdapterView.OnItemClickListener) null);
            this.f197359d.setFocusable(true);
            this.f197359d.setFocusableInTouchMode(true);
            this.f197359d.setDivider((Drawable) null);
            this.f197359d.setDividerHeight(0);
            this.f197359d.setOnItemSelectedListener(new C68708h(this));
            this.f197359d.setOnScrollListener(this.f197371p);
            this.f197357b.setContentView(this.f197359d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f197357b.getContentView();
        }
        Drawable background = this.f197357b.getBackground();
        if (background != null) {
            background.getPadding(this.f197374s);
            Rect rect = this.f197374s;
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.f197363h) {
                this.f197362g = -i6;
            }
        } else {
            this.f197374s.setEmpty();
            i = 0;
        }
        boolean z = this.f197357b.getInputMethodMode() == 2;
        View view2 = this.f197368m;
        int i7 = this.f197362g;
        Rect rect2 = new Rect();
        view2.getWindowVisibleDisplayFrame(rect2);
        view2.getLocationOnScreen(new int[2]);
        int i8 = rect2.bottom;
        if (z) {
            i8 = view2.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        int i9 = i8 - i7;
        if (this.f197357b.getBackground() != null) {
            this.f197357b.getBackground().getPadding(this.f197374s);
            Rect rect3 = this.f197374s;
            i9 -= rect3.top + rect3.bottom;
        }
        if (!this.f197364i && this.f197360e != -1) {
            int i15 = this.f197361f;
            if (i15 == -2) {
                int i16 = this.f197356a.getResources().getDisplayMetrics().widthPixels;
                Rect rect4 = this.f197374s;
                i5 = View.MeasureSpec.makeMeasureSpec(i16 - (rect4.left + rect4.right), Integer.MIN_VALUE);
            } else if (i15 != -1) {
                i5 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                int i17 = this.f197356a.getResources().getDisplayMetrics().widthPixels;
                Rect rect5 = this.f197374s;
                i5 = View.MeasureSpec.makeMeasureSpec(i17 - (rect5.left + rect5.right), 1073741824);
            }
            C68700a aVar3 = this.f197359d;
            i2 += 0;
            int listPaddingTop = aVar3.getListPaddingTop();
            int listPaddingBottom = aVar3.getListPaddingBottom();
            aVar3.getListPaddingLeft();
            aVar3.getListPaddingRight();
            int dividerHeight = aVar3.getDividerHeight();
            Drawable divider = aVar3.getDivider();
            ListAdapter adapter = aVar3.getAdapter();
            int i18 = listPaddingTop + listPaddingBottom;
            if (adapter != null) {
                if (dividerHeight <= 0 || divider == null) {
                    dividerHeight = 0;
                }
                int count = adapter.getCount();
                int i19 = 0;
                int i25 = 0;
                View view3 = null;
                while (true) {
                    if (i25 >= count) {
                        break;
                    }
                    int itemViewType = adapter.getItemViewType(i25);
                    if (itemViewType != i19) {
                        i19 = itemViewType;
                        view = null;
                    } else {
                        view = view3;
                    }
                    View view4 = adapter.getView(i25, view, aVar3);
                    int i26 = view4.getLayoutParams().height;
                    view4.measure(i5, i26 > 0 ? View.MeasureSpec.makeMeasureSpec(i26, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (i25 > 0) {
                        i18 += dividerHeight;
                    }
                    i18 += view4.getMeasuredHeight();
                    if (i18 >= i2) {
                        break;
                    }
                    i25++;
                    view3 = view4;
                }
            }
            i2 = i18;
            i = i2 > 0 ? i + 0 : 0;
        }
        int i27 = i2 + i;
        boolean z2 = this.f197357b.getInputMethodMode() == 2;
        if (this.f197357b.isShowing()) {
            int i28 = this.f197361f;
            if (i28 == -1) {
                i28 = -1;
            } else if (i28 == -2) {
                i28 = this.f197368m.getWidth();
            }
            int i29 = this.f197360e;
            if (i29 == -1) {
                int i35 = z2 ? i27 : -1;
                if (z2) {
                    this.f197357b.setWindowLayoutMode(this.f197361f == -1 ? -1 : 0, 0);
                } else {
                    this.f197357b.setWindowLayoutMode(this.f197361f == -1 ? -1 : 0, -1);
                }
                i27 = i35;
            } else if (i29 != -2) {
                i27 = i29;
            }
            this.f197357b.update(i28, i27);
            this.f197357b.setOutsideTouchable(!this.f197365j && !this.f197364i);
            PopupWindow popupWindow = this.f197357b;
            popupWindow.update(this.f197368m, 0, this.f197362g, popupWindow.getWidth(), this.f197357b.getHeight());
            return;
        }
        int i36 = this.f197361f;
        if (i36 == -1) {
            i3 = -1;
        } else {
            if (i36 == -2) {
                this.f197357b.setWidth(this.f197368m.getWidth());
            } else {
                this.f197357b.setWidth(i36);
            }
            i3 = 0;
        }
        int i37 = this.f197360e;
        if (i37 == -1) {
            i4 = -1;
        } else {
            if (i37 == -2) {
                this.f197357b.setHeight(i27);
            } else {
                this.f197357b.setHeight(i37);
            }
            i4 = 0;
        }
        this.f197357b.setWindowLayoutMode(i3, i4);
        this.f197357b.setOutsideTouchable(!this.f197365j && !this.f197364i);
        this.f197357b.setTouchInterceptor(this.f197370o);
        this.f197357b.showAsDropDown(this.f197368m, 0, this.f197362g, 53);
        this.f197359d.setSelection(-1);
        if ((!this.f197375t || this.f197359d.isInTouchMode()) && (aVar = this.f197359d) != null) {
            aVar.f197376d = true;
            aVar.requestLayout();
        }
        if (!this.f197375t) {
            this.f197373r.post(this.f197372q);
        }
    }

    public AutoFillListPopupWindowBase(Context context, AttributeSet attributeSet, int i) {
        this.f197360e = -2;
        this.f197361f = -2;
        this.f197364i = false;
        this.f197365j = false;
        this.f197366k = Integer.MAX_VALUE;
        this.f197369n = new C68705f((C68707g) null);
        this.f197370o = new C68704e((C68707g) null);
        this.f197371p = new C68703d((C68707g) null);
        this.f197372q = new C68701b((C68707g) null);
        this.f197373r = new MMHandler();
        this.f197374s = new Rect();
        this.f197356a = context;
        PopupWindow popupWindow = new PopupWindow(context);
        this.f197357b = popupWindow;
        popupWindow.setInputMethodMode(1);
        Locale locale = this.f197356a.getResources().getConfiguration().locale;
    }
}
