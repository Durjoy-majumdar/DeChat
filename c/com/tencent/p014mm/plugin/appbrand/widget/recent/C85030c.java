package com.tencent.p014mm.plugin.appbrand.widget.recent;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import xt0.C78981f;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.c */
public class C85030c extends RecyclerView.C0130p {

    /* renamed from: d */
    public Context f247783d;

    /* renamed from: e */
    public BaseAppBrandRecentView f247784e;

    /* renamed from: f */
    public int f247785f;

    /* renamed from: g */
    public int f247786g;

    /* renamed from: h */
    public int f247787h = 0;

    /* renamed from: i */
    public RecyclerView.C16634v f247788i;

    /* renamed from: j */
    public RecyclerView.C16634v f247789j;

    /* renamed from: n */
    public int f247790n = 0;

    /* renamed from: o */
    public int f247791o;

    /* renamed from: p */
    public float f247792p = ((float) ViewConfiguration.get(MMApplicationContext.getContext()).getScaledTouchSlop());

    /* renamed from: q */
    public int f247793q = -1;

    /* renamed from: r */
    public boolean f247794r = false;

    /* renamed from: s */
    public LinearLayoutManager f247795s;

    /* renamed from: t */
    public boolean f247796t = false;

    /* renamed from: u */
    public int f247797u;

    /* renamed from: v */
    public int f247798v = 0;

    /* renamed from: w */
    public boolean f247799w = false;

    /* renamed from: x */
    public boolean f247800x = false;

    /* renamed from: y */
    public boolean f247801y = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.c$a */
    public interface C85031a {
        /* renamed from: a */
        void mo117996a(RecyclerView recyclerView, int i, int i2);

        /* renamed from: b */
        void mo117997b(int i, boolean z);

        /* renamed from: c */
        void mo117998c(RecyclerView recyclerView, int i);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.c$b */
    public interface C85032b {
        /* renamed from: a */
        void mo117999a();

        /* renamed from: b */
        void mo118000b();
    }

    public C85030c(int i) {
        this.f247797u = i;
    }

    /* renamed from: a */
    public final int mo117993a(int i) {
        int i2 = this.f247790n;
        float width = (float) this.f247784e.getWidth();
        int i3 = this.f247790n;
        Log.m105919d("ViewPagerHelper", "alvinluo getOffsetToPosition offset: %d, mTmpOffset: %d, diff: %d, width: %s, mTouchSlop: %s, curPage: %d", Integer.valueOf(i), Integer.valueOf(this.f247786g), Integer.valueOf(i - this.f247786g), Float.valueOf(width), Float.valueOf(this.f247792p), Integer.valueOf(this.f247790n));
        int i4 = i - this.f247786g;
        float f = (float) i4;
        if (f >= width / 2.0f) {
            i2 = mo117994b(this.f247795s.mo16959E());
        } else if (i4 >= 0 && f < this.f247792p) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(i2 == 0 ? 0 : (this.f247791o * i2) + this.f247797u);
            Log.m105925i("ViewPagerHelper", "alvinluo [getOffsetToPosition] targetPage: %s targetPos: %s", objArr);
            if (i2 == 0) {
                return 0;
            }
            return (i2 * this.f247791o) + this.f247797u;
        } else if (f <= (-width) / 2.0f) {
            i2 = mo117994b(this.f247795s.mo16957C());
        }
        int itemCount = this.f247784e.getAdapter().getItemCount();
        int i5 = this.f247791o;
        int i6 = itemCount / i5;
        if (itemCount % i5 != 0) {
            i6++;
        }
        int max = Math.max(Math.min(i2, i6 - 1), -1);
        if (max - i3 > 1) {
            max = i3 + 1;
        } else if (i3 - max > 1) {
            max = i3 - 1;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = Integer.valueOf(i3);
        objArr2[1] = Integer.valueOf(max);
        objArr2[2] = Integer.valueOf(max == 0 ? 0 : (C78981f.f231930g * max) + 1);
        Log.m105925i("ViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", objArr2);
        if (max == 0) {
            return 0;
        }
        return (max * this.f247791o) + this.f247797u;
    }

    /* renamed from: b */
    public int mo117994b(int i) {
        if (this.f247797u == 0) {
            return i / this.f247791o;
        }
        int i2 = this.f247791o;
        int i3 = i / i2;
        return (i % i2 != 0 || i == 0) ? i3 : i3 - 1;
    }

    /* renamed from: c */
    public final void mo117995c() {
        if (this.f247794r) {
            Log.m105924i("ViewPagerHelper", "alvinluo onScrollAnimationEnd");
            this.f247794r = false;
            this.f247796t = false;
            this.f247793q = -1;
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        Log.m105925i("ViewPagerHelper", "alvinluo onScrollStateChanged newState: %d", Integer.valueOf(i));
        if (i == 0 && this.f247798v != 2) {
            int a = mo117993a(this.f247785f);
            BaseAppBrandRecentView baseAppBrandRecentView = this.f247784e;
            if (baseAppBrandRecentView != null && this.f247800x) {
                this.f247788i.f44872a = a;
                this.f247801y = true;
                baseAppBrandRecentView.getLayoutManager().startSmoothScroll(this.f247788i);
            }
            this.f247799w = true;
        } else if (!this.f247799w && i == 2) {
            this.f247799w = true;
        } else if (i == 0) {
            this.f247786g = this.f247785f;
            this.f247799w = false;
            int i2 = this.f247790n;
            int C = this.f247795s.mo16957C();
            Log.m105925i("ViewPagerHelper", "alvinluo onScrollStateChanged firstPos: %d", Integer.valueOf(C));
            if (C != -1) {
                int i3 = C / this.f247791o;
                this.f247790n = i3;
                Log.m105925i("ViewPagerHelper", "alvinluo onScrollStateChanged mCurPage: %d, firstVisible: %d", Integer.valueOf(i3), Integer.valueOf(C));
                int i4 = this.f247790n;
            } else {
                Log.m105921e("ViewPagerHelper", "alvinluo onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", Integer.valueOf(this.f247790n));
            }
            this.f247800x = false;
            this.f247787h = 0;
            if (this.f247796t) {
                Log.m105918d("ViewPagerHelper", "alvinluo scrollMore");
                float f = C78981f.f231924a;
                this.f247796t = false;
                this.f247794r = true;
                int b = mo117994b(0);
                this.f247793q = b == 0 ? 0 : (C78981f.f231930g * b) + 1;
                int b2 = mo117994b(this.f247795s.mo17004z());
                this.f247790n = b2;
                Log.m105925i("ViewPagerHelper", "alvinluo fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", Integer.valueOf(b2), 0, Integer.valueOf(b), Integer.valueOf(this.f247793q));
                int i5 = this.f247793q;
                BaseAppBrandRecentView baseAppBrandRecentView2 = this.f247784e;
                if (baseAppBrandRecentView2 != null) {
                    this.f247789j.f44872a = i5;
                    this.f247801y = true;
                    baseAppBrandRecentView2.getLayoutManager().startSmoothScroll(this.f247789j);
                }
                mo117995c();
            } else {
                mo117995c();
            }
            if (this.f247801y) {
                Log.m105924i("ViewPagerHelper", "alvinluo scrollBy x: -1, y: 0");
                this.f247801y = false;
                this.f247784e.scrollBy(-1, 0);
            }
        } else if (i == 1) {
            Log.m105924i("ViewPagerHelper", "SCROLL_STATE_DRAGGING");
            this.f247800x = true;
        }
        this.f247798v = i;
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        this.f247787h += i;
        this.f247785f += i;
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
