package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75054z4;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76873d0;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.ui.base.MMListPopupWindow */
public class MMListPopupWindow {

    /* renamed from: a */
    public final C73173f f214817a;

    /* renamed from: b */
    public final C73172e f214818b;

    /* renamed from: c */
    public final C73171d f214819c;

    /* renamed from: d */
    public final C73169b f214820d;

    /* renamed from: e */
    public int f214821e;

    /* renamed from: f */
    public Context f214822f;

    /* renamed from: g */
    public C76901s0 f214823g;

    /* renamed from: h */
    public ListAdapter f214824h;

    /* renamed from: i */
    public C73168a f214825i;

    /* renamed from: j */
    public int f214826j;

    /* renamed from: k */
    public int f214827k;

    /* renamed from: l */
    public int f214828l;

    /* renamed from: m */
    public int f214829m;

    /* renamed from: n */
    public boolean f214830n;

    /* renamed from: o */
    public boolean f214831o;

    /* renamed from: p */
    public DataSetObserver f214832p;

    /* renamed from: q */
    public View f214833q;

    /* renamed from: r */
    public AdapterView.OnItemClickListener f214834r;

    /* renamed from: s */
    public Handler f214835s;

    /* renamed from: t */
    public Rect f214836t;

    /* renamed from: u */
    public boolean f214837u;

    /* renamed from: v */
    public boolean f214838v;

    /* renamed from: com.tencent.mm.ui.base.MMListPopupWindow$a */
    public static class C73168a extends ListView {

        /* renamed from: d */
        public boolean f214839d;

        /* renamed from: e */
        public boolean f214840e;

        public C73168a(Context context, boolean z, C76873d0 d0Var) {
            super(context, (AttributeSet) null, C0966R.attr.f2789ke);
            this.f214840e = z;
            setCacheColorHint(0);
        }

        public boolean hasFocus() {
            return this.f214840e || super.hasFocus();
        }

        public boolean hasWindowFocus() {
            return this.f214840e || super.hasWindowFocus();
        }

        public boolean isFocused() {
            return this.f214840e || super.isFocused();
        }

        public boolean isInTouchMode() {
            return (this.f214840e && this.f214839d) || super.isInTouchMode();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMListPopupWindow$b */
    public class C73169b implements Runnable {
        public C73169b(C76873d0 d0Var) {
        }

        public void run() {
            C73168a aVar = MMListPopupWindow.this.f214825i;
            if (aVar != null) {
                aVar.f214839d = true;
                aVar.requestLayout();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMListPopupWindow$c */
    public class C73170c extends DataSetObserver {
        public C73170c(C76873d0 d0Var) {
        }

        public void onChanged() {
            if (MMListPopupWindow.this.f214823g.isShowing()) {
                MMListPopupWindow.this.mo101715d();
            }
        }

        public void onInvalidated() {
            MMListPopupWindow.this.mo101712a();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMListPopupWindow$d */
    public class C73171d implements AbsListView.OnScrollListener {
        public C73171d(C76873d0 d0Var) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C73168a aVar = MMListPopupWindow.this.f214825i;
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            boolean z = true;
            if (i == 1) {
                if (MMListPopupWindow.this.f214823g.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && MMListPopupWindow.this.f214823g.getContentView() != null) {
                    MMListPopupWindow mMListPopupWindow = MMListPopupWindow.this;
                    mMListPopupWindow.f214835s.removeCallbacks(mMListPopupWindow.f214817a);
                    MMListPopupWindow.this.f214817a.run();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMListPopupWindow$e */
    public class C73172e implements View.OnTouchListener {
        public C73172e(C76873d0 d0Var) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C76901s0 s0Var;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (s0Var = MMListPopupWindow.this.f214823g) != null && s0Var.isShowing() && x >= 0 && x < MMListPopupWindow.this.f214823g.getWidth() && y >= 0 && y < MMListPopupWindow.this.f214823g.getHeight()) {
                MMListPopupWindow mMListPopupWindow = MMListPopupWindow.this;
                mMListPopupWindow.f214835s.postDelayed(mMListPopupWindow.f214817a, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                MMListPopupWindow mMListPopupWindow2 = MMListPopupWindow.this;
                mMListPopupWindow2.f214835s.removeCallbacks(mMListPopupWindow2.f214817a);
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMListPopupWindow$f */
    public class C73173f implements Runnable {
        public C73173f(C76873d0 d0Var) {
        }

        public void run() {
            C73168a aVar = MMListPopupWindow.this.f214825i;
            if (aVar != null && aVar.getCount() > MMListPopupWindow.this.f214825i.getChildCount()) {
                int childCount = MMListPopupWindow.this.f214825i.getChildCount();
                MMListPopupWindow mMListPopupWindow = MMListPopupWindow.this;
                if (childCount <= mMListPopupWindow.f214821e) {
                    mMListPopupWindow.f214823g.setInputMethodMode(2);
                    MMListPopupWindow.this.mo101715d();
                }
            }
        }
    }

    public MMListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2862tz);
    }

    /* renamed from: a */
    public void mo101712a() {
        this.f214823g.dismiss();
        this.f214823g.setContentView((View) null);
        this.f214825i = null;
        this.f214835s.removeCallbacks(this.f214817a);
    }

    /* renamed from: b */
    public void mo101713b(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f214832p;
        if (dataSetObserver == null) {
            this.f214832p = new C73170c((C76873d0) null);
        } else {
            ListAdapter listAdapter2 = this.f214824h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f214824h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f214832p);
        }
        C73168a aVar = this.f214825i;
        if (aVar != null) {
            aVar.setAdapter(this.f214824h);
        }
    }

    /* renamed from: c */
    public void mo101714c(int i) {
        Drawable background = this.f214823g.getBackground();
        if (background != null) {
            background.getPadding(this.f214836t);
            Rect rect = this.f214836t;
            this.f214827k = rect.left + rect.right + i;
            return;
        }
        this.f214827k = i;
    }

    /* renamed from: d */
    public void mo101715d() {
        int i;
        int i2;
        int i3;
        View view;
        int i4;
        int i5;
        C73168a aVar;
        if (this.f214825i == null) {
            C73168a aVar2 = new C73168a(this.f214822f, !this.f214837u, (C76873d0) null);
            this.f214825i = aVar2;
            aVar2.setAdapter(this.f214824h);
            this.f214825i.setOnItemClickListener(this.f214834r);
            this.f214825i.setFocusable(true);
            this.f214825i.setFocusableInTouchMode(true);
            this.f214825i.setDivider((Drawable) null);
            this.f214825i.setDividerHeight(0);
            this.f214825i.setOnItemSelectedListener(new C73224e(this));
            this.f214825i.setOnScrollListener(this.f214819c);
            this.f214823g.setContentView(this.f214825i);
        }
        Drawable background = this.f214823g.getBackground();
        if (background != null) {
            background.getPadding(this.f214836t);
            Rect rect = this.f214836t;
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.f214830n) {
                this.f214829m = -i6;
            }
        } else {
            this.f214836t.setEmpty();
            i = 0;
        }
        boolean z = this.f214823g.getInputMethodMode() == 2;
        View view2 = this.f214833q;
        int i7 = this.f214829m;
        Rect rect2 = new Rect();
        view2.getWindowVisibleDisplayFrame(rect2);
        view2.getLocationOnScreen(new int[2]);
        int i8 = rect2.bottom;
        if (z) {
            view2.getContext().getResources();
            i8 = C75054z4.m90003a(view2.getContext()).y;
        }
        int i9 = i8 - i7;
        if (this.f214823g.getBackground() != null) {
            this.f214823g.getBackground().getPadding(this.f214836t);
            Rect rect3 = this.f214836t;
            i9 -= rect3.top + rect3.bottom;
        }
        if (this.f214826j != -1) {
            int i15 = this.f214827k;
            if (i15 == -2) {
                int i16 = this.f214822f.getResources().getDisplayMetrics().widthPixels;
                Rect rect4 = this.f214836t;
                i3 = View.MeasureSpec.makeMeasureSpec(i16 - (rect4.left + rect4.right), Integer.MIN_VALUE);
            } else if (i15 != -1) {
                i3 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                int i17 = this.f214822f.getResources().getDisplayMetrics().widthPixels;
                Rect rect5 = this.f214836t;
                i3 = View.MeasureSpec.makeMeasureSpec(i17 - (rect5.left + rect5.right), 1073741824);
            }
            C73168a aVar3 = this.f214825i;
            i2 -= 0;
            int listPaddingTop = aVar3.getListPaddingTop();
            int listPaddingBottom = aVar3.getListPaddingBottom();
            int dividerHeight = aVar3.getDividerHeight();
            Drawable divider = aVar3.getDivider();
            ListAdapter adapter = aVar3.getAdapter();
            if (adapter == null) {
                i2 = listPaddingTop + listPaddingBottom;
            } else {
                int i18 = listPaddingTop + listPaddingBottom;
                if (dividerHeight <= 0 || divider == null) {
                    dividerHeight = 0;
                }
                int count = adapter.getCount();
                int i19 = 0;
                int i25 = 0;
                View view3 = null;
                while (true) {
                    if (i25 >= count) {
                        i2 = i18;
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
                    int i26 = view4 == null ? 0 : view4.getLayoutParams().height;
                    int makeMeasureSpec = i26 > 0 ? View.MeasureSpec.makeMeasureSpec(i26, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0);
                    if (view4 != null) {
                        view4.measure(i3, makeMeasureSpec);
                    }
                    if (i25 > 0) {
                        i18 += dividerHeight;
                    }
                    if (view4 != null) {
                        i18 += view4.getMeasuredHeight();
                    }
                    if (i18 >= i2) {
                        break;
                    }
                    i25++;
                    view3 = view4;
                }
            }
            i = i2 > 0 ? i + 0 : 0;
        }
        int i27 = i2 + i;
        boolean z2 = this.f214823g.getInputMethodMode() == 2;
        if (this.f214823g.isShowing()) {
            int i28 = this.f214827k;
            if (i28 == -1) {
                i28 = -1;
            } else if (i28 == -2) {
                i28 = this.f214833q.getWidth();
            }
            int i29 = this.f214826j;
            if (i29 == -1) {
                int i35 = z2 ? i27 : -1;
                if (z2) {
                    this.f214823g.setWindowLayoutMode(this.f214827k == -1 ? -1 : 0, 0);
                } else {
                    this.f214823g.setWindowLayoutMode(this.f214827k == -1 ? -1 : 0, -1);
                }
                i27 = i35;
            } else if (i29 != -2) {
                i27 = i29;
            }
            this.f214823g.update(i28, i27);
            this.f214823g.setOutsideTouchable(!this.f214831o);
            if (this.f214838v) {
                this.f214823g.showAtLocation(this.f214833q, 17, 0, 0);
            } else {
                this.f214823g.showAtLocation(this.f214833q, 53, this.f214828l, this.f214829m);
            }
        } else {
            int i36 = this.f214827k;
            if (i36 == -1) {
                i4 = -1;
            } else {
                if (i36 == -2) {
                    this.f214823g.setWidth(this.f214833q.getWidth());
                } else {
                    this.f214823g.setWidth(i36);
                }
                i4 = 0;
            }
            int i37 = this.f214826j;
            if (i37 == -1) {
                i5 = -1;
            } else {
                if (i37 == -2) {
                    this.f214823g.setHeight(i27);
                } else {
                    this.f214823g.setHeight(i37);
                }
                i5 = 0;
            }
            this.f214823g.setWindowLayoutMode(i4, i5);
            this.f214823g.setOutsideTouchable(!this.f214831o);
            C76901s0 s0Var = this.f214823g;
            s0Var.f224751d = this.f214818b;
            if (this.f214838v) {
                s0Var.showAtLocation(this.f214833q, 17, 0, 0);
            } else {
                s0Var.showAtLocation(this.f214833q, 53, this.f214828l, this.f214829m);
            }
            this.f214825i.setSelection(-1);
            if ((!this.f214837u || this.f214825i.isInTouchMode()) && (aVar = this.f214825i) != null) {
                aVar.f214839d = true;
                aVar.requestLayout();
            }
            if (!this.f214837u) {
                this.f214835s.post(this.f214820d);
            }
        }
    }

    public MMListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this.f214817a = new C73173f((C76873d0) null);
        this.f214818b = new C73172e((C76873d0) null);
        this.f214819c = new C73171d((C76873d0) null);
        this.f214820d = new C73169b((C76873d0) null);
        this.f214821e = Integer.MAX_VALUE;
        this.f214826j = -2;
        this.f214827k = -2;
        this.f214831o = false;
        this.f214835s = new Handler();
        this.f214836t = new Rect();
        this.f214838v = false;
        this.f214822f = context;
        C76901s0 s0Var = new C76901s0(context);
        this.f214823g = s0Var;
        s0Var.setInputMethodMode(1);
    }
}
