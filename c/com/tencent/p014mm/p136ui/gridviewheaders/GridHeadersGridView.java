package com.tencent.p014mm.p136ui.gridviewheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.p014mm.p136ui.gridviewheaders.C97222c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k11.C99085s;
import k11.s$$b;
import k11.s$$g;

/* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView */
public class GridHeadersGridView extends GridView implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener, AdapterView.OnItemLongClickListener {

    /* renamed from: L */
    public static final /* synthetic */ int f285239L = 0;

    /* renamed from: A */
    public C97218f f285240A;

    /* renamed from: B */
    public AbsListView.OnScrollListener f285241B;

    /* renamed from: C */
    public int f285242C;

    /* renamed from: D */
    public View f285243D;

    /* renamed from: E */
    public Runnable f285244E;

    /* renamed from: F */
    public int f285245F;

    /* renamed from: G */
    public int f285246G;

    /* renamed from: H */
    public C97222c f285247H;

    /* renamed from: I */
    public int f285248I;

    /* renamed from: J */
    public int f285249J;

    /* renamed from: K */
    public boolean f285250K;

    /* renamed from: d */
    public C97214b f285251d;

    /* renamed from: e */
    public C97215c f285252e;

    /* renamed from: f */
    public MMHandler f285253f;

    /* renamed from: g */
    public boolean f285254g;

    /* renamed from: h */
    public final Rect f285255h;

    /* renamed from: i */
    public boolean f285256i;

    /* renamed from: j */
    public boolean f285257j;

    /* renamed from: n */
    public int f285258n;

    /* renamed from: o */
    public long f285259o;

    /* renamed from: p */
    public DataSetObserver f285260p;

    /* renamed from: q */
    public int f285261q;

    /* renamed from: r */
    public int f285262r;

    /* renamed from: s */
    public float f285263s;

    /* renamed from: t */
    public int f285264t;

    /* renamed from: u */
    public boolean f285265u;

    /* renamed from: v */
    public int f285266v;

    /* renamed from: w */
    public C97216d f285267w;

    /* renamed from: x */
    public AdapterView.OnItemClickListener f285268x;

    /* renamed from: y */
    public AdapterView.OnItemLongClickListener f285269y;

    /* renamed from: z */
    public AdapterView.OnItemSelectedListener f285270z;

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$a */
    public class C97213a extends DataSetObserver {
        public C97213a() {
        }

        public void onChanged() {
            GridHeadersGridView gridHeadersGridView = GridHeadersGridView.this;
            int i = GridHeadersGridView.f285239L;
            gridHeadersGridView.f285261q = 0;
            gridHeadersGridView.f285243D = null;
            gridHeadersGridView.f285259o = Long.MIN_VALUE;
        }

        public void onInvalidated() {
            GridHeadersGridView gridHeadersGridView = GridHeadersGridView.this;
            int i = GridHeadersGridView.f285239L;
            gridHeadersGridView.f285261q = 0;
            gridHeadersGridView.f285243D = null;
            gridHeadersGridView.f285259o = Long.MIN_VALUE;
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$b */
    public class C97214b extends C97219g implements Runnable {
        public C97214b(C97213a aVar) {
            super((C97213a) null);
        }

        public void run() {
            GridHeadersGridView gridHeadersGridView = GridHeadersGridView.this;
            View e = gridHeadersGridView.mo136121e(gridHeadersGridView.f285248I);
            if (e != null) {
                GridHeadersGridView gridHeadersGridView2 = GridHeadersGridView.this;
                int i = gridHeadersGridView2.f285248I;
                if (i == -2) {
                    long j = gridHeadersGridView2.f285259o;
                } else {
                    gridHeadersGridView2.f285247H.mo136175y(gridHeadersGridView2.getFirstVisiblePosition() + i);
                }
                if (GridHeadersGridView.this.hasWindowFocus() && GridHeadersGridView.this.getWindowAttachCount() == this.f285276d) {
                    GridHeadersGridView.this.getClass();
                    GridHeadersGridView.this.getClass();
                }
                if (0 != 0) {
                    GridHeadersGridView gridHeadersGridView3 = GridHeadersGridView.this;
                    gridHeadersGridView3.f285249J = -2;
                    gridHeadersGridView3.setPressed(false);
                    e.setPressed(false);
                    return;
                }
                GridHeadersGridView.this.f285249J = 2;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$c */
    public final class C97215c implements Runnable {
        public C97215c() {
        }

        public void run() {
            GridHeadersGridView gridHeadersGridView = GridHeadersGridView.this;
            if (gridHeadersGridView.f285249J == 0) {
                gridHeadersGridView.f285249J = 1;
                View e = gridHeadersGridView.mo136121e(gridHeadersGridView.f285248I);
                if (e != null && !e.hasFocusable()) {
                    GridHeadersGridView.this.getClass();
                    e.setPressed(true);
                    GridHeadersGridView.this.setPressed(true);
                    GridHeadersGridView.this.refreshDrawableState();
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    if (GridHeadersGridView.this.isLongClickable()) {
                        GridHeadersGridView gridHeadersGridView2 = GridHeadersGridView.this;
                        if (gridHeadersGridView2.f285251d == null) {
                            gridHeadersGridView2.f285251d = new C97214b((C97213a) null);
                        }
                        C97214b bVar = gridHeadersGridView2.f285251d;
                        bVar.f285276d = GridHeadersGridView.this.getWindowAttachCount();
                        GridHeadersGridView gridHeadersGridView3 = GridHeadersGridView.this;
                        gridHeadersGridView3.f285253f.postDelayed(gridHeadersGridView3.f285251d, (long) longPressTimeout);
                        return;
                    }
                    GridHeadersGridView.this.f285249J = 2;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$d */
    public interface C97216d {
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$e */
    public interface C97217e {
        /* renamed from: a */
        boolean mo136153a(AdapterView<?> adapterView, View view, long j);
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$f */
    public class C97218f extends C97219g implements Runnable {

        /* renamed from: f */
        public int f285274f;

        public C97218f(C97213a aVar) {
            super((C97213a) null);
        }

        public void run() {
            int i;
            View e;
            GridHeadersGridView.this.getClass();
            C97222c cVar = GridHeadersGridView.this.f285247H;
            if (cVar != null && cVar.getCount() > 0 && (i = this.f285274f) != -1 && i < GridHeadersGridView.this.f285247H.getCount()) {
                boolean z = true;
                if ((GridHeadersGridView.this.hasWindowFocus() && GridHeadersGridView.this.getWindowAttachCount() == this.f285276d) && (e = GridHeadersGridView.this.mo136121e(this.f285274f)) != null) {
                    GridHeadersGridView gridHeadersGridView = GridHeadersGridView.this;
                    int i2 = this.f285274f;
                    if (i2 == -2) {
                        long j = gridHeadersGridView.f285259o;
                    } else {
                        gridHeadersGridView.f285247H.mo136175y(gridHeadersGridView.getFirstVisiblePosition() + i2);
                    }
                    if (gridHeadersGridView.f285267w != null) {
                        gridHeadersGridView.playSoundEffect(0);
                        e.sendAccessibilityEvent(1);
                        C99085s sVar = ((s$$b) gridHeadersGridView.f285267w).f290468a;
                        sVar.getClass();
                        s$$g s__g = (s$$g) e.getTag();
                        long y = sVar.mo138431y(s__g.f290472a);
                        Log.m105925i("MicroMsg.CleanChattingDetailAdapter", "select header position=%d | headerId=%d", Integer.valueOf(s__g.f290472a), Long.valueOf(y));
                        HashSet hashSet = new HashSet();
                        for (int i3 = 0; i3 < sVar.f290456f.size(); i3++) {
                            if (sVar.f290456f.get(i3).mo138237a() == y) {
                                hashSet.add(Integer.valueOf(i3));
                            }
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            if (!sVar.f290454d.remove(Integer.valueOf(((Integer) it.next()).intValue()))) {
                                z = false;
                            }
                        }
                        if (!z) {
                            sVar.f290454d.addAll(hashSet);
                        }
                        sVar.mo138425a();
                        sVar.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$g */
    public class C97219g {

        /* renamed from: d */
        public int f285276d;

        public C97219g(C97213a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C97220a();

        /* renamed from: d */
        public boolean f285278d;

        /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$SavedState$a */
        public class C97220a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C97213a) null);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "StickyGridHeadersGridView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " areHeadersSticky=" + this.f285278d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f285278d ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel, C97213a aVar) {
            super(parcel);
            this.f285278d = parcel.readByte() != 0;
        }
    }

    public GridHeadersGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842865);
    }

    private int getHeaderHeight() {
        View view = this.f285243D;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        View view = this.f285243D;
        boolean z = view != null && this.f285254g && view.getVisibility() == 0;
        int headerHeight = getHeaderHeight();
        int i = this.f285261q - headerHeight;
        if (z && this.f285250K) {
            this.f285255h.left = getPaddingLeft();
            this.f285255h.right = getWidth() - getPaddingRight();
            Rect rect = this.f285255h;
            rect.top = this.f285261q;
            rect.bottom = getHeight();
            canvas.save();
            canvas2.clipRect(this.f285255h);
        }
        super.dispatchDraw(canvas);
        ArrayList arrayList = new ArrayList();
        int firstVisiblePosition = getFirstVisiblePosition();
        int i2 = 0;
        while (firstVisiblePosition <= getLastVisiblePosition()) {
            if (getItemIdAtPosition(firstVisiblePosition) == -1) {
                arrayList.add(Integer.valueOf(i2));
            }
            int i3 = this.f285266v;
            firstVisiblePosition += i3;
            i2 += i3;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            C97222c.C97227e eVar = (C97222c.C97227e) getChildAt(((Integer) arrayList.get(i4)).intValue());
            try {
                View view2 = (View) eVar.getTag();
                boolean z2 = ((long) ((C97222c.C97225c) eVar.getChildAt(0)).getHeaderId()) == this.f285259o && eVar.getTop() < 0 && this.f285254g;
                if (view2.getVisibility() == 0 && !z2) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), (1073741824 - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.makeMeasureSpec(0, 0));
                    view2.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), eVar.getHeight());
                    this.f285255h.left = getPaddingLeft();
                    this.f285255h.right = getWidth() - getPaddingRight();
                    this.f285255h.bottom = eVar.getBottom();
                    this.f285255h.top = eVar.getTop();
                    canvas.save();
                    canvas2.clipRect(this.f285255h);
                    canvas2.translate((float) getPaddingLeft(), (float) eVar.getTop());
                    view2.draw(canvas2);
                    canvas.restore();
                }
                i4++;
            } catch (Exception unused) {
                return;
            }
        }
        if (z && this.f285250K) {
            canvas.restore();
        } else if (!z) {
            return;
        }
        if (this.f285243D.getWidth() != (getWidth() - getPaddingLeft()) - getPaddingRight()) {
            this.f285243D.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), (1073741824 - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f285243D.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.f285243D.getHeight());
        }
        this.f285255h.left = getPaddingLeft();
        this.f285255h.right = getWidth() - getPaddingRight();
        Rect rect2 = this.f285255h;
        rect2.bottom = i + headerHeight;
        if (this.f285256i) {
            rect2.top = getPaddingTop();
        } else {
            rect2.top = 0;
        }
        canvas.save();
        canvas2.clipRect(this.f285255h);
        canvas2.translate((float) getPaddingLeft(), (float) i);
        canvas.saveLayerAlpha(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (int) ((((float) this.f285261q) * 255.0f) / ((float) headerHeight)), 31);
        this.f285243D.draw(canvas2);
        canvas.restore();
        canvas.restore();
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x012a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1
            r2 = 0
            r3 = -2
            r4 = 2
            if (r0 == 0) goto L_0x00bc
            r5 = 1
            if (r0 == r5) goto L_0x0043
            if (r0 == r4) goto L_0x0013
            goto L_0x0127
        L_0x0013:
            int r0 = r11.f285248I
            if (r0 == r1) goto L_0x0127
            float r0 = r12.getY()
            float r3 = r11.f285263s
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r3 = r11.f285245F
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0127
            r11.f285249J = r1
            int r0 = r11.f285248I
            android.view.View r0 = r11.mo136121e(r0)
            if (r0 == 0) goto L_0x0036
            r0.setPressed(r2)
        L_0x0036:
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$b r0 = r11.f285251d
            if (r0 == 0) goto L_0x003f
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r11.f285253f
            r3.removeCallbacks(r0)
        L_0x003f:
            r11.f285248I = r1
            goto L_0x0127
        L_0x0043:
            int r0 = r11.f285249J
            if (r0 != r3) goto L_0x0049
            goto L_0x0127
        L_0x0049:
            if (r0 == r1) goto L_0x0127
            int r0 = r11.f285248I
            if (r0 != r1) goto L_0x0051
            goto L_0x0127
        L_0x0051:
            android.view.View r0 = r11.mo136121e(r0)
            if (r0 == 0) goto L_0x00b8
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00b8
            int r1 = r11.f285249J
            if (r1 == 0) goto L_0x0064
            r0.setPressed(r2)
        L_0x0064:
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$f r1 = r11.f285240A
            if (r1 != 0) goto L_0x0070
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$f r1 = new com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$f
            r3 = 0
            r1.<init>(r3)
            r11.f285240A = r1
        L_0x0070:
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$f r1 = r11.f285240A
            int r3 = r11.f285248I
            r1.f285274f = r3
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView r3 = com.tencent.p014mm.p136ui.gridviewheaders.GridHeadersGridView.this
            int r3 = r3.getWindowAttachCount()
            r1.f285276d = r3
            int r3 = r11.f285249J
            if (r3 != 0) goto L_0x008a
            if (r3 == r5) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            r1.run()
            goto L_0x0128
        L_0x008a:
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r11.f285253f
            if (r3 != 0) goto L_0x0091
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$c r3 = r11.f285252e
            goto L_0x0093
        L_0x0091:
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$b r3 = r11.f285251d
        L_0x0093:
            r4.removeCallbacks(r3)
            r11.f285249J = r5
            r0.setPressed(r5)
            r11.setPressed(r5)
            java.lang.Runnable r3 = r11.f285244E
            if (r3 == 0) goto L_0x00a5
            r11.removeCallbacks(r3)
        L_0x00a5:
            com.tencent.mm.ui.gridviewheaders.d r3 = new com.tencent.mm.ui.gridviewheaders.d
            r3.<init>(r11, r0, r1)
            r11.f285244E = r3
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r11.f285253f
            int r1 = android.view.ViewConfiguration.getPressedStateDuration()
            long r6 = (long) r1
            r0.postDelayed(r3, r6)
            goto L_0x0128
        L_0x00b8:
            r11.f285249J = r1
            goto L_0x0127
        L_0x00bc:
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$c r0 = r11.f285252e
            if (r0 != 0) goto L_0x00c7
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$c r0 = new com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$c
            r0.<init>()
            r11.f285252e = r0
        L_0x00c7:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r11.f285253f
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$b r5 = r11.f285251d
            int r6 = android.view.ViewConfiguration.getTapTimeout()
            long r6 = (long) r6
            r0.postDelayed(r5, r6)
            float r0 = r12.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r11.f285263s = r0
            android.view.View r5 = r11.f285243D
            if (r5 == 0) goto L_0x00e9
            int r5 = r5.getBottom()
            float r5 = (float) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00e9
            goto L_0x011c
        L_0x00e9:
            int r3 = r11.getFirstVisiblePosition()
            r5 = 0
        L_0x00ee:
            int r6 = r11.getLastVisiblePosition()
            if (r3 > r6) goto L_0x011b
            long r6 = r11.getItemIdAtPosition(r3)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0116
            android.view.View r6 = r11.getChildAt(r5)
            int r7 = r6.getBottom()
            int r6 = r6.getTop()
            float r7 = (float) r7
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0116
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0116
            r3 = r5
            goto L_0x011c
        L_0x0116:
            int r6 = r11.f285266v
            int r3 = r3 + r6
            int r5 = r5 + r6
            goto L_0x00ee
        L_0x011b:
            r3 = -1
        L_0x011c:
            r11.f285248I = r3
            if (r3 == r1) goto L_0x0127
            int r0 = r11.f285242C
            if (r0 != r4) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r11.f285249J = r2
        L_0x0127:
            r5 = 0
        L_0x0128:
            if (r5 == 0) goto L_0x012b
            return r2
        L_0x012b:
            boolean r12 = super.dispatchTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.gridviewheaders.GridHeadersGridView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public View mo136121e(int i) {
        if (i == -2) {
            return this.f285243D;
        }
        try {
            return (View) getChildAt(i).getTag();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = r2.height;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136122f() {
        /*
            r5 = this;
            android.view.View r0 = r5.f285243D
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r5.getWidth()
            int r1 = r5.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r5.getPaddingRight()
            int r0 = r0 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            android.view.View r2 = r5.f285243D
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r3 = 0
            if (r2 == 0) goto L_0x002b
            int r2 = r2.height
            if (r2 <= 0) goto L_0x002b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x002f
        L_0x002b:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
        L_0x002f:
            android.view.View r2 = r5.f285243D
            r2.measure(r0, r1)
            android.view.View r0 = r5.f285243D
            int r1 = r5.getLeft()
            int r2 = r5.getPaddingLeft()
            int r1 = r1 + r2
            int r2 = r5.getRight()
            int r4 = r5.getPaddingRight()
            int r2 = r2 - r4
            android.view.View r4 = r5.f285243D
            int r4 = r4.getMeasuredHeight()
            r0.layout(r1, r3, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.gridviewheaders.GridHeadersGridView.mo136122f():void");
    }

    public View getStickiedHeader() {
        return this.f285243D;
    }

    public boolean getStickyHeaderIsTranscluent() {
        return !this.f285250K;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        AdapterView<?> adapterView2 = adapterView;
        arrayList.add(adapterView);
        View view2 = view;
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f285268x.onItemClick(adapterView, view, this.f285247H.mo136162a(i).f285292b, j);
        C117292a.m165361g(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        return this.f285269y.onItemLongClick(adapterView, view, this.f285247H.mo136162a(i).f285292b, j);
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        AdapterView<?> adapterView2 = adapterView;
        arrayList.add(adapterView);
        View view2 = view;
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f285270z.onItemSelected(adapterView, view, this.f285247H.mo136162a(i).f285292b, j);
        C117292a.m165361g(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.f285264t;
        if (i4 == -1) {
            if (this.f285258n > 0) {
                int max = Math.max((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0);
                int i5 = max / this.f285258n;
                i3 = 1;
                if (i5 > 0) {
                    while (i5 != 1) {
                        int i6 = i5 - 1;
                        if ((this.f285258n * i5) + (this.f285262r * i6) <= max) {
                            break;
                        }
                        i5 = i6;
                    }
                    i3 = i5;
                }
            } else {
                i3 = 2;
            }
            this.f285266v = i3;
        } else {
            this.f285266v = i4;
        }
        C97222c cVar = this.f285247H;
        if (cVar != null) {
            int i7 = this.f285266v;
            cVar.f285286j = i7;
            View[] viewArr = new View[i7];
            cVar.f285287n = viewArr;
            Arrays.fill(viewArr, (Object) null);
        }
        mo136122f();
        super.onMeasure(i, i2);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        this.f285270z.onNothingSelected(adapterView);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f285254g = savedState.f285278d;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f285278d = this.f285254g;
        return savedState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0.add(r1)
            java.lang.Object[] r7 = r0.toArray()
            r0.clear()
            java.lang.String r2 = "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView"
            java.lang.String r3 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r4 = "onScroll"
            java.lang.String r5 = "(Landroid/widget/AbsListView;III)V"
            r6 = r8
            j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
            android.widget.AbsListView$OnScrollListener r0 = r8.f285241B
            if (r0 == 0) goto L_0x0038
            r0.onScroll(r9, r10, r11, r12)
        L_0x0038:
            com.tencent.mm.ui.gridviewheaders.c r9 = r8.f285247H
            if (r9 == 0) goto L_0x0168
            int r9 = r9.getCount()
            if (r9 == 0) goto L_0x0168
            boolean r9 = r8.f285254g
            if (r9 != 0) goto L_0x0048
            goto L_0x0168
        L_0x0048:
            r9 = 0
            android.view.View r11 = r8.getChildAt(r9)
            com.tencent.mm.ui.gridviewheaders.c$e r11 = (com.tencent.p014mm.p136ui.gridviewheaders.C97222c.C97227e) r11
            if (r11 != 0) goto L_0x0053
            goto L_0x0168
        L_0x0053:
            int r11 = r8.f285266v
            int r12 = r10 - r11
            if (r12 >= 0) goto L_0x005a
            r12 = r10
        L_0x005a:
            int r11 = r11 + r10
            com.tencent.mm.ui.gridviewheaders.c r0 = r8.f285247H
            int r0 = r0.getCount()
            if (r11 < r0) goto L_0x0064
            r11 = r10
        L_0x0064:
            int r0 = r8.f285246G
            if (r0 != 0) goto L_0x006f
            com.tencent.mm.ui.gridviewheaders.c r11 = r8.f285247H
            long r11 = r11.mo136175y(r10)
            goto L_0x00ac
        L_0x006f:
            if (r0 >= 0) goto L_0x0091
            com.tencent.mm.ui.gridviewheaders.c r12 = r8.f285247H
            r12.mo136175y(r10)
            int r12 = r8.f285266v
            android.view.View r12 = r8.getChildAt(r12)
            int r12 = r12.getTop()
            if (r12 > 0) goto L_0x008a
            com.tencent.mm.ui.gridviewheaders.c r12 = r8.f285247H
            long r0 = r12.mo136175y(r11)
            r12 = r11
            goto L_0x00ae
        L_0x008a:
            com.tencent.mm.ui.gridviewheaders.c r11 = r8.f285247H
            long r11 = r11.mo136175y(r10)
            goto L_0x00ac
        L_0x0091:
            android.view.View r11 = r8.getChildAt(r9)
            int r11 = r11.getTop()
            if (r11 <= 0) goto L_0x00a6
            int r0 = r8.f285246G
            if (r11 >= r0) goto L_0x00a6
            com.tencent.mm.ui.gridviewheaders.c r11 = r8.f285247H
            long r0 = r11.mo136175y(r12)
            goto L_0x00ae
        L_0x00a6:
            com.tencent.mm.ui.gridviewheaders.c r11 = r8.f285247H
            long r11 = r11.mo136175y(r10)
        L_0x00ac:
            r0 = r11
            r12 = r10
        L_0x00ae:
            long r2 = r8.f285259o
            r11 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x00d6
            com.tencent.mm.ui.gridviewheaders.c r2 = r8.f285247H
            android.view.View r3 = r8.f285243D
            com.tencent.mm.ui.gridviewheaders.b r4 = r2.f285280d
            int r4 = r4.mo136161m()
            if (r4 != 0) goto L_0x00c3
            r12 = r11
            goto L_0x00cf
        L_0x00c3:
            com.tencent.mm.ui.gridviewheaders.b r4 = r2.f285280d
            com.tencent.mm.ui.gridviewheaders.c$d r12 = r2.mo136162a(r12)
            int r12 = r12.f285291a
            android.view.View r12 = r4.mo136159c(r12, r3, r8)
        L_0x00cf:
            r8.f285243D = r12
            r8.mo136122f()
            r8.f285259o = r0
        L_0x00d6:
            int r12 = r8.getChildCount()
            if (r12 == 0) goto L_0x0168
            r0 = 99999(0x1869f, float:1.40128E-40)
            r1 = 0
        L_0x00e0:
            if (r1 >= r12) goto L_0x010d
            android.view.View r2 = super.getChildAt(r1)
            com.tencent.mm.ui.gridviewheaders.c$e r2 = (com.tencent.p014mm.p136ui.gridviewheaders.C97222c.C97227e) r2
            boolean r3 = r8.f285256i
            if (r3 == 0) goto L_0x00f6
            int r3 = r2.getTop()
            int r4 = r8.getPaddingTop()
            int r3 = r3 - r4
            goto L_0x00fa
        L_0x00f6:
            int r3 = r2.getTop()
        L_0x00fa:
            if (r3 >= 0) goto L_0x00fd
            goto L_0x0109
        L_0x00fd:
            android.view.View r4 = r2.getView()
            boolean r4 = r4 instanceof com.tencent.p014mm.p136ui.gridviewheaders.C97222c.C97225c
            if (r4 == 0) goto L_0x0109
            if (r3 >= r0) goto L_0x0109
            r11 = r2
            r0 = r3
        L_0x0109:
            int r2 = r8.f285266v
            int r1 = r1 + r2
            goto L_0x00e0
        L_0x010d:
            int r12 = r8.getHeaderHeight()
            if (r11 == 0) goto L_0x015b
            if (r10 != 0) goto L_0x0126
            android.view.View r10 = super.getChildAt(r9)
            int r10 = r10.getTop()
            if (r10 <= 0) goto L_0x0126
            boolean r10 = r8.f285256i
            if (r10 != 0) goto L_0x0126
            r8.f285261q = r9
            goto L_0x0168
        L_0x0126:
            boolean r9 = r8.f285256i
            if (r9 == 0) goto L_0x014a
            int r9 = r11.getTop()
            int r10 = r8.getPaddingTop()
            int r10 = r10 + r12
            int r9 = java.lang.Math.min(r9, r10)
            r8.f285261q = r9
            int r10 = r8.getPaddingTop()
            if (r9 >= r10) goto L_0x0145
            int r9 = r8.getPaddingTop()
            int r12 = r12 + r9
            goto L_0x0147
        L_0x0145:
            int r12 = r8.f285261q
        L_0x0147:
            r8.f285261q = r12
            goto L_0x0168
        L_0x014a:
            int r9 = r11.getTop()
            int r9 = java.lang.Math.min(r9, r12)
            r8.f285261q = r9
            if (r9 >= 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r12 = r9
        L_0x0158:
            r8.f285261q = r12
            goto L_0x0168
        L_0x015b:
            r8.f285261q = r12
            boolean r9 = r8.f285256i
            if (r9 == 0) goto L_0x0168
            int r9 = r8.getPaddingTop()
            int r12 = r12 + r9
            r8.f285261q = r12
        L_0x0168:
            java.lang.String r9 = "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView"
            java.lang.String r10 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r11 = "onScroll"
            java.lang.String r12 = "(Landroid/widget/AbsListView;III)V"
            j20.C117292a.m165361g(r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.gridviewheaders.GridHeadersGridView.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        AbsListView.OnScrollListener onScrollListener = this.f285241B;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
        this.f285242C = i;
        C117292a.m165361g(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void setAreHeadersSticky(boolean z) {
        if (z != this.f285254g) {
            this.f285254g = z;
            requestLayout();
        }
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.f285256i = z;
        this.f285257j = true;
    }

    public void setColumnWidth(int i) {
        super.setColumnWidth(i);
        this.f285258n = i;
    }

    public void setHorizontalSpacing(int i) {
        super.setHorizontalSpacing(i);
        this.f285262r = i;
    }

    public void setNumColumns(int i) {
        C97222c cVar;
        super.setNumColumns(i);
        this.f285265u = true;
        this.f285264t = i;
        if (i != -1 && (cVar = this.f285247H) != null) {
            cVar.f285286j = i;
            View[] viewArr = new View[i];
            cVar.f285287n = viewArr;
            Arrays.fill(viewArr, (Object) null);
        }
    }

    public void setOnHeaderClickListener(C97216d dVar) {
        this.f285267w = dVar;
    }

    public void setOnHeaderLongClickListener(C97217e eVar) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f285268x = onItemClickListener;
        super.setOnItemClickListener(this);
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f285269y = onItemLongClickListener;
        super.setOnItemLongClickListener(this);
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f285270z = onItemSelectedListener;
        super.setOnItemSelectedListener(this);
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f285241B = onScrollListener;
    }

    public void setStickyHeaderIsTranscluent(boolean z) {
        this.f285250K = !z;
    }

    public void setVerticalSpacing(int i) {
        super.setVerticalSpacing(i);
        this.f285246G = i;
    }

    public GridHeadersGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f285253f = new MMHandler();
        this.f285254g = true;
        this.f285255h = new Rect();
        this.f285259o = -1;
        this.f285260p = new C97213a();
        this.f285266v = 1;
        this.f285242C = 0;
        this.f285250K = true;
        super.setOnScrollListener(this);
        setVerticalFadingEdgeEnabled(false);
        if (!this.f285265u) {
            this.f285264t = -1;
        }
        this.f285245F = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void setAdapter(ListAdapter listAdapter) {
        C97221b bVar;
        C97221b bVar2;
        DataSetObserver dataSetObserver;
        C97222c cVar = this.f285247H;
        if (!(cVar == null || (dataSetObserver = this.f285260p) == null)) {
            cVar.unregisterDataSetObserver(dataSetObserver);
        }
        if (!this.f285257j) {
            this.f285256i = true;
        }
        if (listAdapter instanceof C97221b) {
            bVar = (C97221b) listAdapter;
        } else {
            if (listAdapter instanceof C106705f) {
                bVar2 = new C106706g((C106705f) listAdapter);
            } else {
                bVar2 = new C97229e(listAdapter);
            }
            bVar = bVar2;
        }
        C97222c cVar2 = new C97222c(getContext(), this, bVar);
        this.f285247H = cVar2;
        cVar2.registerDataSetObserver(this.f285260p);
        this.f285261q = 0;
        this.f285243D = null;
        this.f285259o = Long.MIN_VALUE;
        super.setAdapter(this.f285247H);
    }
}
