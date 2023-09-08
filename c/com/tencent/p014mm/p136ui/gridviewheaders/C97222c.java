package com.tencent.p014mm.p136ui.gridviewheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.tencent.mm.ui.gridviewheaders.c */
public class C97222c extends BaseAdapter {

    /* renamed from: o */
    public static boolean f285279o;

    /* renamed from: d */
    public final C97221b f285280d;

    /* renamed from: e */
    public final Context f285281e;

    /* renamed from: f */
    public int f285282f;

    /* renamed from: g */
    public DataSetObserver f285283g = new C97223a();

    /* renamed from: h */
    public GridHeadersGridView f285284h;

    /* renamed from: i */
    public final List<View> f285285i = new ArrayList();

    /* renamed from: j */
    public int f285286j = 1;

    /* renamed from: n */
    public View[] f285287n;

    /* renamed from: com.tencent.mm.ui.gridviewheaders.c$a */
    public class C97223a extends DataSetObserver {
        public C97223a() {
        }

        public void onChanged() {
            C97222c cVar = C97222c.this;
            cVar.f285282f = 0;
            int m = cVar.f285280d.mo136161m();
            if (m == 0) {
                cVar.f285282f = cVar.f285280d.getCount();
            } else {
                for (int i = 0; i < m; i++) {
                    cVar.f285282f += cVar.f285280d.mo136160e(i) + cVar.f285286j;
                }
            }
            C97222c.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            ((ArrayList) C97222c.this.f285285i).clear();
            C97222c.this.notifyDataSetInvalidated();
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.c$b */
    public class C97224b extends View {
        public C97224b(C97222c cVar, Context context) {
            super(context);
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.c$c */
    public class C97225c extends FrameLayout {

        /* renamed from: d */
        public int f285289d;

        /* renamed from: e */
        public int f285290e;

        public C97225c(C97222c cVar, Context context) {
            super(context);
        }

        public int getHeaderId() {
            return this.f285289d;
        }

        public void onMeasure(int i, int i2) {
            View view = (View) getTag();
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(generateDefaultLayoutParams());
            }
            if (view.getVisibility() != 8 && view.getMeasuredHeight() == 0) {
                view.measure(View.MeasureSpec.makeMeasureSpec(this.f285290e, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), view.getMeasuredHeight());
        }

        public void setHeaderId(int i) {
            this.f285289d = i;
        }

        public void setHeaderWidth(int i) {
            this.f285290e = i;
        }

        public FrameLayout.LayoutParams generateDefaultLayoutParams() {
            return new FrameLayout.LayoutParams(-1, -1);
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.c$d */
    public class C97226d {

        /* renamed from: a */
        public int f285291a;

        /* renamed from: b */
        public int f285292b;

        public C97226d(C97222c cVar, int i, int i2) {
            this.f285292b = i;
            this.f285291a = i2;
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.c$e */
    public class C97227e extends FrameLayout {

        /* renamed from: d */
        public boolean f285293d;

        /* renamed from: e */
        public int f285294e;

        /* renamed from: f */
        public int f285295f;

        /* renamed from: g */
        public View[] f285296g;

        public C97227e(Context context) {
            super(context);
        }

        public Object getTag() {
            View childAt = getChildAt(0);
            if (childAt == null) {
                return null;
            }
            return childAt.getTag();
        }

        public View getView() {
            return getChildAt(0);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.f285294e;
            if (i3 != 1 && C97222c.this.f285287n != null) {
                int i4 = this.f285295f % i3;
                if (i4 == 0 && !this.f285293d) {
                    this.f285293d = true;
                    for (View measure : this.f285296g) {
                        measure.measure(i, i2);
                    }
                    this.f285293d = false;
                }
                int measuredHeight = getMeasuredHeight();
                int i5 = measuredHeight;
                for (View view : this.f285296g) {
                    if (view != null) {
                        i5 = Math.max(i5, view.getMeasuredHeight());
                    }
                }
                if (i5 != measuredHeight) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                }
            }
        }

        public void setNumColumns(int i) {
            this.f285294e = i;
        }

        public void setPosition(int i) {
            this.f285295f = i;
        }

        public void setRowSiblings(View[] viewArr) {
            this.f285296g = viewArr;
        }

        public void setTag(int i, Object obj) {
            getChildAt(0).setTag(i, obj);
        }

        public FrameLayout.LayoutParams generateDefaultLayoutParams() {
            return new FrameLayout.LayoutParams(-1, -1);
        }

        public void setTag(Object obj) {
            getChildAt(0).setTag(obj);
        }

        public Object getTag(int i) {
            View childAt = getChildAt(0);
            if (childAt == null) {
                return null;
            }
            return childAt.getTag(i);
        }
    }

    public C97222c(Context context, GridHeadersGridView gridHeadersGridView, C97221b bVar) {
        this.f285281e = context;
        this.f285280d = bVar;
        this.f285284h = gridHeadersGridView;
        bVar.registerDataSetObserver(this.f285283g);
    }

    /* renamed from: a */
    public C97226d mo136162a(int i) {
        int m = this.f285280d.mo136161m();
        if (m == 0) {
            return i >= this.f285280d.getCount() ? new C97226d(this, -1, 0) : new C97226d(this, i, 0);
        }
        int i2 = i;
        int i3 = 0;
        while (i3 < m) {
            int e = this.f285280d.mo136160e(i3);
            if (i == 0) {
                return new C97226d(this, -2, i3);
            }
            int i4 = this.f285286j;
            int i5 = i - i4;
            if (i5 < 0) {
                return new C97226d(this, -1, i3);
            }
            int i6 = i2 - i4;
            if (i5 < e) {
                return new C97226d(this, i6, i3);
            }
            int e2 = this.f285280d.mo136160e(i3);
            int i7 = this.f285286j;
            int i8 = e2 % i7;
            int i9 = i8 == 0 ? 0 : i7 - i8;
            i2 = i6 - i9;
            i = i5 - (e + i9);
            i3++;
        }
        return new C97226d(this, -1, i3);
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getCount() {
        this.f285282f = 0;
        int m = this.f285280d.mo136161m();
        if (m == 0) {
            return this.f285280d.getCount();
        }
        for (int i = 0; i < m; i++) {
            int i2 = this.f285282f;
            int e = this.f285280d.mo136160e(i);
            int e2 = this.f285280d.mo136160e(i);
            int i3 = this.f285286j;
            int i4 = e2 % i3;
            this.f285282f = i2 + e + (i4 == 0 ? 0 : i3 - i4) + i3;
        }
        return this.f285282f;
    }

    public Object getItem(int i) {
        int i2 = mo136162a(i).f285292b;
        if (i2 == -1 || i2 == -2) {
            return null;
        }
        return this.f285280d.getItem(i2);
    }

    public long getItemId(int i) {
        int i2 = mo136162a(i).f285292b;
        if (i2 == -2) {
            return -1;
        }
        if (i2 == -1) {
            return -2;
        }
        return this.f285280d.getItemId(i2);
    }

    public int getItemViewType(int i) {
        int i2 = mo136162a(i).f285292b;
        if (i2 == -2) {
            return 1;
        }
        if (i2 == -1) {
            return 0;
        }
        int itemViewType = this.f285280d.getItemViewType(i2);
        return itemViewType == -1 ? itemViewType : itemViewType + 2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C97227e eVar;
        C97225c cVar;
        if (view instanceof C97227e) {
            C97227e eVar2 = (C97227e) view;
            eVar = eVar2;
            view = eVar2.getChildAt(0);
        } else {
            eVar = null;
        }
        C97226d a = mo136162a(i);
        int i2 = a.f285292b;
        if (i2 == -2) {
            C97225c cVar2 = (C97225c) view;
            C97225c cVar3 = new C97225c(this, this.f285281e);
            cVar3.setHeaderWidth(this.f285284h.getWidth());
            cVar3.setHeaderId(a.f285291a);
            cVar3.setTag(this.f285280d.mo136159c(a.f285291a, (View) cVar3.getTag(), viewGroup));
            cVar = cVar3;
        } else if (i2 == -1) {
            C97224b bVar = (C97224b) view;
            cVar = bVar;
            if (bVar == null) {
                cVar = new C97224b(this, this.f285281e);
            }
        } else {
            cVar = this.f285280d.getView(i2, view, viewGroup);
        }
        if (eVar == null) {
            eVar = new C97227e(this.f285281e);
        }
        eVar.removeAllViews();
        eVar.addView(cVar);
        eVar.setPosition(i);
        eVar.setNumColumns(this.f285286j);
        View[] viewArr = this.f285287n;
        int i3 = i % this.f285286j;
        viewArr[i3] = eVar;
        if (i3 == 0) {
            f285279o = true;
            int i4 = 1;
            while (true) {
                View[] viewArr2 = this.f285287n;
                if (i4 >= viewArr2.length) {
                    break;
                }
                viewArr2[i4] = getView(i + i4, (View) null, viewGroup);
                i4++;
            }
            f285279o = false;
        }
        eVar.setRowSiblings(this.f285287n);
        if (!f285279o) {
            int i5 = this.f285286j;
            if (i % i5 == i5 - 1 || i == getCount() - 1) {
                View[] viewArr3 = new View[this.f285286j];
                this.f285287n = viewArr3;
                Arrays.fill(viewArr3, (Object) null);
            }
        }
        return eVar;
    }

    public int getViewTypeCount() {
        return this.f285280d.getViewTypeCount() + 2;
    }

    public boolean hasStableIds() {
        return this.f285280d.hasStableIds();
    }

    public boolean isEmpty() {
        return this.f285280d.isEmpty();
    }

    public boolean isEnabled(int i) {
        int i2 = mo136162a(i).f285292b;
        if (i2 == -1 || i2 == -2) {
            return false;
        }
        return this.f285280d.isEnabled(i2);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f285280d.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f285280d.unregisterDataSetObserver(dataSetObserver);
    }

    /* renamed from: y */
    public long mo136175y(int i) {
        return (long) mo136162a(i).f285291a;
    }
}
