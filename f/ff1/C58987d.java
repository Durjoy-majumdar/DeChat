package ff1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ff1.d */
public final class C58987d extends RecyclerView.C0130p {

    /* renamed from: d */
    public final RecyclerView f168770d;

    /* renamed from: e */
    public FinderRecyclerView.C55692a f168771e;

    /* renamed from: f */
    public final LinearLayoutManager f168772f;

    /* renamed from: g */
    public int f168773g;

    /* renamed from: h */
    public int f168774h;

    /* renamed from: i */
    public final C58988a f168775i = new C58988a();

    /* renamed from: j */
    public int f168776j;

    /* renamed from: n */
    public int f168777n;

    /* renamed from: o */
    public boolean f168778o;

    /* renamed from: p */
    public boolean f168779p;

    /* renamed from: ff1.d$a */
    public static final class C58988a {

        /* renamed from: a */
        public int f168780a;

        /* renamed from: b */
        public float f168781b;

        /* renamed from: c */
        public int f168782c;
    }

    public C58987d(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "mRecyclerView");
        this.f168770d = recyclerView;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        C87412m.m108591d(linearLayoutManager);
        this.f168772f = linearLayoutManager;
        mo84220b();
    }

    /* renamed from: a */
    public final void mo84219a(int i) {
        if ((this.f168773g != 3 || this.f168774h != 0) && this.f168774h != i) {
            this.f168774h = i;
            FinderRecyclerView.C55692a aVar = this.f168771e;
            if (aVar != null) {
                C87412m.m108591d(aVar);
                aVar.mo77206e(this.f168770d, i);
            }
        }
    }

    /* renamed from: b */
    public final void mo84220b() {
        this.f168773g = 0;
        this.f168774h = 0;
        C58988a aVar = this.f168775i;
        aVar.f168780a = -1;
        aVar.f168781b = 0.0f;
        aVar.f168782c = 0;
        this.f168776j = -1;
        this.f168777n = -1;
        this.f168778o = false;
        this.f168779p = false;
    }

    /* renamed from: c */
    public final void mo84221c(boolean z) {
        this.f168773g = z ? 4 : 1;
        int i = this.f168777n;
        if (i != -1) {
            this.f168776j = i;
            this.f168777n = -1;
        } else if (this.f168776j == -1) {
            this.f168776j = this.f168772f.mo16957C();
        }
        mo84219a(1);
    }

    /* renamed from: d */
    public final void mo84222d() {
        int i;
        C58988a aVar = this.f168775i;
        int C = this.f168772f.mo16957C();
        aVar.f168780a = C;
        float f = 0.0f;
        if (C == -1) {
            aVar.f168780a = -1;
            aVar.f168781b = 0.0f;
            aVar.f168782c = 0;
            return;
        }
        View findViewByPosition = this.f168772f.findViewByPosition(C);
        if (findViewByPosition == null) {
            aVar.f168780a = -1;
            aVar.f168781b = 0.0f;
            aVar.f168782c = 0;
            return;
        }
        int leftDecorationWidth = this.f168772f.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f168772f.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f168772f.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f168772f.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f168772f.mo16967N() == 0) {
            i = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f168770d.getPaddingLeft();
            height = width;
        } else {
            i = (findViewByPosition.getTop() - topDecorationHeight) - this.f168770d.getPaddingTop();
        }
        int i2 = -i;
        aVar.f168782c = i2;
        if (i2 < 0) {
            String format = String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            C87412m.m108593f(format, "format(locale, format, *args)");
            Log.m105920e("FinderScrollEventAdapter", format);
        }
        if (height != 0) {
            f = ((float) aVar.f168782c) / ((float) height);
        }
        aVar.f168781b = f;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        FinderRecyclerView.C55692a aVar;
        FinderRecyclerView.C55692a aVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        int i2 = this.f168773g;
        boolean z = true;
        if (!(i2 == 1 && this.f168774h == 1) && i == 1) {
            mo84221c(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (!(i2 == 1 || i2 == 4) || i != 2) {
            if ((i2 == 1 || i2 == 4) && i == 0) {
                mo84222d();
                if (!this.f168779p) {
                    int i3 = this.f168775i.f168780a;
                    if (!(i3 == -1 || (aVar2 = this.f168771e) == null)) {
                        aVar2.mo77208g(this.f168770d, i3, 0.0f, 0);
                    }
                } else {
                    C58988a aVar3 = this.f168775i;
                    if (aVar3.f168782c == 0) {
                        int i4 = this.f168776j;
                        int i5 = aVar3.f168780a;
                        if (!(i4 == i5 || (aVar = this.f168771e) == null)) {
                            aVar.mo77207f(this.f168770d, i5);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    mo84219a(0);
                    mo84220b();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (this.f168779p) {
            mo84219a(2);
            this.f168778o = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if ((r10 < 0) == false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0.add(r1)
            java.lang.Object[] r7 = r0.toArray()
            r0.clear()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter"
            java.lang.String r3 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r4 = "onScrolled"
            java.lang.String r5 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            r6 = r8
            j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "recyclerView"
            gy3.C87412m.m108594g(r9, r0)
            r9 = 1
            r8.f168779p = r9
            r8.mo84222d()
            boolean r0 = r8.f168778o
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L_0x006b
            r8.f168778o = r1
            if (r11 > 0) goto L_0x004a
            if (r11 != 0) goto L_0x0048
            if (r10 >= 0) goto L_0x0044
            r10 = 1
            goto L_0x0045
        L_0x0044:
            r10 = 0
        L_0x0045:
            if (r10 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r10 = 0
            goto L_0x004b
        L_0x004a:
            r10 = 1
        L_0x004b:
            if (r10 == 0) goto L_0x0057
            ff1.d$a r10 = r8.f168775i
            int r11 = r10.f168782c
            if (r11 == 0) goto L_0x0057
            int r10 = r10.f168780a
            int r10 = r10 + r9
            goto L_0x005b
        L_0x0057:
            ff1.d$a r10 = r8.f168775i
            int r10 = r10.f168780a
        L_0x005b:
            r8.f168777n = r10
            int r11 = r8.f168776j
            if (r11 == r10) goto L_0x007f
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView$a r11 = r8.f168771e
            if (r11 == 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView r0 = r8.f168770d
            r11.mo77207f(r0, r10)
            goto L_0x007f
        L_0x006b:
            int r10 = r8.f168773g
            if (r10 != 0) goto L_0x007f
            ff1.d$a r10 = r8.f168775i
            int r10 = r10.f168780a
            if (r10 != r2) goto L_0x0076
            r10 = 0
        L_0x0076:
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView$a r11 = r8.f168771e
            if (r11 == 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView r0 = r8.f168770d
            r11.mo77207f(r0, r10)
        L_0x007f:
            ff1.d$a r10 = r8.f168775i
            int r11 = r10.f168780a
            if (r11 != r2) goto L_0x0086
            r11 = 0
        L_0x0086:
            float r0 = r10.f168781b
            int r10 = r10.f168782c
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView$a r3 = r8.f168771e
            if (r3 == 0) goto L_0x0093
            androidx.recyclerview.widget.RecyclerView r4 = r8.f168770d
            r3.mo77208g(r4, r11, r0, r10)
        L_0x0093:
            ff1.d$a r10 = r8.f168775i
            int r11 = r10.f168780a
            int r0 = r8.f168777n
            if (r11 == r0) goto L_0x009d
            if (r0 != r2) goto L_0x00ab
        L_0x009d:
            int r10 = r10.f168782c
            if (r10 != 0) goto L_0x00ab
            int r10 = r8.f168774h
            if (r10 == r9) goto L_0x00ab
            r8.mo84219a(r1)
            r8.mo84220b()
        L_0x00ab:
            java.lang.String r9 = "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter"
            java.lang.String r10 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r11 = "onScrolled"
            java.lang.String r0 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            j20.C117292a.m165361g(r8, r9, r10, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ff1.C58987d.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
