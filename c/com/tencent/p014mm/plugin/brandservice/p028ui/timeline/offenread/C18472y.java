package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19636w0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import kw0.C46746a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.y */
public class C18472y extends RecyclerView.C0130p {

    /* renamed from: d */
    public Context f51273d;

    /* renamed from: e */
    public BizTimeLineHotListView f51274e;

    /* renamed from: f */
    public int f51275f;

    /* renamed from: g */
    public int f51276g;

    /* renamed from: h */
    public int f51277h = 0;

    /* renamed from: i */
    public RecyclerView.C16634v f51278i;

    /* renamed from: j */
    public RecyclerView.C16634v f51279j;

    /* renamed from: n */
    public int f51280n = 0;

    /* renamed from: o */
    public int f51281o;

    /* renamed from: p */
    public float f51282p = ((float) ViewConfiguration.get(MMApplicationContext.getContext()).getScaledTouchSlop());

    /* renamed from: q */
    public int f51283q = -1;

    /* renamed from: r */
    public boolean f51284r = false;

    /* renamed from: s */
    public LinearLayoutManager f51285s;

    /* renamed from: t */
    public boolean f51286t = false;

    /* renamed from: u */
    public int f51287u;

    /* renamed from: v */
    public C18473a f51288v = null;

    /* renamed from: w */
    public int f51289w = 0;

    /* renamed from: x */
    public boolean f51290x = false;

    /* renamed from: y */
    public boolean f51291y = false;

    /* renamed from: z */
    public boolean f51292z = false;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.y$a */
    public interface C18473a {
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.y$b */
    public interface C18474b {
        /* renamed from: a */
        void mo23084a();

        /* renamed from: b */
        void mo23085b();
    }

    public C18472y(int i) {
        this.f51287u = i;
    }

    /* renamed from: a */
    public static int m19113a(int i) {
        if (i == 0) {
            return 0;
        }
        return (i * C18466p.f51248c) + 1;
    }

    /* renamed from: b */
    public final int mo23081b(int i) {
        int i2 = this.f51280n;
        float width = (float) this.f51274e.getWidth();
        int i3 = this.f51280n;
        Log.m105919d("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo getOffsetToPosition offset: %d, mTmpOffset: %d, diff: %d, width: %s, mTouchSlop: %s, curPage: %d", Integer.valueOf(i), Integer.valueOf(this.f51276g), Integer.valueOf(i - this.f51276g), Float.valueOf(width), Float.valueOf(this.f51282p), Integer.valueOf(this.f51280n));
        int i4 = i - this.f51276g;
        float f = (float) i4;
        if (f >= width / 2.0f) {
            i2 = mo23082c(this.f51285s.mo16959E());
        } else if (i4 >= 0 && f < this.f51282p) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(i2 == 0 ? 0 : (this.f51281o * i2) + this.f51287u);
            Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo [getOffsetToPosition] targetPage: %s targetPos: %s", objArr);
            if (i2 == 0) {
                return 0;
            }
            return (i2 * this.f51281o) + this.f51287u;
        } else if (f <= (-width) / 2.0f) {
            i2 = mo23082c(this.f51285s.mo16957C());
        }
        int itemCount = this.f51274e.getAdapter().getItemCount();
        int i5 = this.f51281o;
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
        Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", Integer.valueOf(i3), Integer.valueOf(max), Integer.valueOf(m19113a(max)));
        if (max == 0) {
            return 0;
        }
        return (max * this.f51281o) + this.f51287u;
    }

    /* renamed from: c */
    public int mo23082c(int i) {
        if (this.f51287u == 0) {
            return i / this.f51281o;
        }
        int i2 = this.f51281o;
        int i3 = i / i2;
        return (i % i2 != 0 || i == 0) ? i3 : i3 - 1;
    }

    /* renamed from: d */
    public final void mo23083d() {
        if (this.f51284r) {
            Log.m105924i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollAnimationEnd");
            this.f51284r = false;
            this.f51286t = false;
            this.f51283q = -1;
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C18473a aVar;
        C18440a0 a0Var;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged newState: %d", Integer.valueOf(i));
        if (i2 == 0 && this.f51289w != 2) {
            int b = mo23081b(this.f51275f);
            BizTimeLineHotListView bizTimeLineHotListView = this.f51274e;
            if (bizTimeLineHotListView != null && this.f51291y) {
                this.f51278i.f44872a = b;
                this.f51292z = true;
                bizTimeLineHotListView.getLayoutManager().startSmoothScroll(this.f51278i);
            }
            this.f51290x = true;
        } else if (!this.f51290x && i2 == 2) {
            this.f51290x = true;
        } else if (i2 == 0) {
            this.f51276g = this.f51275f;
            this.f51290x = false;
            int i3 = this.f51280n;
            int C = this.f51285s.mo16957C();
            Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged firstPos: %d", Integer.valueOf(C));
            if (C != -1) {
                int i4 = C / this.f51281o;
                this.f51280n = i4;
                Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged mCurPage: %d, firstVisible: %d", Integer.valueOf(i4), Integer.valueOf(C));
                int i5 = this.f51280n;
                if (!(i3 == i5 || (aVar = this.f51288v) == null)) {
                    C18459h hVar = (C18459h) aVar;
                    if (!(!this.f51291y)) {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        C115669n.INSTANCE.mo160131h(15721, "", 0, 10, Integer.valueOf(currentTimeMillis), Integer.valueOf(C19636w0.f55626c));
                    }
                    BizTimeLineHotListView bizTimeLineHotListView2 = hVar.f51236a;
                    if (!bizTimeLineHotListView2.f51123J1 || (a0Var = bizTimeLineHotListView2.f51125L1) == null) {
                        C18440a0 a0Var2 = bizTimeLineHotListView2.f51125L1;
                        if (a0Var2 != null) {
                            a0Var2.setOftenReadTitlePaddingLeft((float) BizTimeLineHotListView.f51108T1);
                            bizTimeLineHotListView2.f51125L1.mo23046x0();
                        }
                    } else if (i5 == 0) {
                        a0Var.setOftenReadTitlePaddingLeft(bizTimeLineHotListView2.f51127N1);
                        bizTimeLineHotListView2.f51125L1.setVideoTitlePaddingLeft((float) BizTimeLineHotListView.f51108T1);
                    } else {
                        a0Var.setOftenReadTitlePaddingLeft((float) BizTimeLineHotListView.f51108T1);
                    }
                    hVar.f51236a.mo23005L1();
                }
            } else {
                Log.m105921e("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", Integer.valueOf(this.f51280n));
            }
            this.f51291y = false;
            this.f51277h = 0;
            if (this.f51286t) {
                Log.m105918d("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo scrollMore");
                this.f51274e.getAdapter().notifyItemRangeChanged(this.f51274e.getDataCount(), 5);
                this.f51286t = false;
                int dataCount = this.f51274e.getDataCount();
                int i6 = this.f51281o;
                int i7 = dataCount / i6;
                if (dataCount % i6 == 0) {
                    i7++;
                }
                int i8 = i7 + 1;
                int i9 = i6 * i8;
                if (i9 <= 0) {
                    i9 = 0;
                }
                Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo smoothScrollToLastPage allCount: %d, lastPage: %d, targetPos: %d", Integer.valueOf(dataCount), Integer.valueOf(i8), Integer.valueOf(i9));
                this.f51284r = true;
                int c = mo23082c(i9);
                this.f51283q = m19113a(c);
                int c2 = mo23082c(this.f51285s.mo17004z());
                this.f51280n = c2;
                Log.m105925i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", Integer.valueOf(c2), Integer.valueOf(i9), Integer.valueOf(c), Integer.valueOf(this.f51283q));
                if (c == this.f51280n) {
                    mo23083d();
                } else {
                    int i15 = this.f51283q;
                    BizTimeLineHotListView bizTimeLineHotListView3 = this.f51274e;
                    if (bizTimeLineHotListView3 != null) {
                        this.f51279j.f44872a = i15;
                        this.f51292z = true;
                        bizTimeLineHotListView3.getLayoutManager().startSmoothScroll(this.f51279j);
                    }
                }
            } else {
                mo23083d();
            }
            if (this.f51292z) {
                Log.m105924i("MicroMsg.BizTimeLineViewPagerHelper", "alvinluo scrollBy x: -1, y: 0");
                this.f51292z = false;
                this.f51274e.scrollBy(-1, 0);
            }
        } else if (i2 == 1) {
            Log.m105924i("MicroMsg.BizTimeLineViewPagerHelper", "SCROLL_STATE_DRAGGING");
            this.f51291y = true;
        }
        this.f51289w = i2;
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        float f;
        C18440a0 a0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        int i5 = this.f51277h + i;
        this.f51277h = i5;
        C18473a aVar = this.f51288v;
        if (!(aVar == null || (i == 0 && i2 == 0))) {
            C18459h hVar = (C18459h) aVar;
            int currentPage = hVar.f51236a.getCurrentPage();
            Log.m105919d("MicroMsg.BizTimeLineHotListView", "alvinluo ScrollPageListener onScrolled offsetOfCurPage: %d, , currentPage: %d", Integer.valueOf(i5), Integer.valueOf(currentPage));
            BizTimeLineHotListView bizTimeLineHotListView = hVar.f51236a;
            if (!bizTimeLineHotListView.f51126M1) {
                if (!bizTimeLineHotListView.f51123J1 || (a0Var = bizTimeLineHotListView.f51125L1) == null) {
                    C18440a0 a0Var2 = bizTimeLineHotListView.f51125L1;
                    if (a0Var2 != null) {
                        a0Var2.setOftenReadTitlePaddingLeft((float) BizTimeLineHotListView.f51108T1);
                        bizTimeLineHotListView.f51125L1.mo23046x0();
                    }
                } else if (currentPage == 0 || (currentPage == 1 && i5 < 0)) {
                    float f2 = (float) i5;
                    if (f2 > bizTimeLineHotListView.f51129P1) {
                        bizTimeLineHotListView.f51129P1 = f2;
                    }
                    float f3 = bizTimeLineHotListView.f51127N1;
                    float f4 = f3 - (i5 >= 0 ? f2 : bizTimeLineHotListView.f51129P1 + f2);
                    if (f4 >= f3) {
                        Log.m105919d("MicroMsg.BizTimeLineHotListView", "updateTitlePaddingOnScroll maxPageOffset = %s, offsetOfCurPage= %d, originalPaddingLeft=%s， paddingLeft=%s", Float.valueOf(bizTimeLineHotListView.f51129P1), Integer.valueOf(i5), Integer.valueOf(currentPage), Float.valueOf(bizTimeLineHotListView.f51127N1), Float.valueOf(f4));
                        bizTimeLineHotListView.f51125L1.setOftenReadTitlePaddingLeft(bizTimeLineHotListView.f51127N1);
                    } else {
                        float f5 = (float) BizTimeLineHotListView.f51108T1;
                        if (f4 >= f5) {
                            a0Var.setOftenReadTitlePaddingLeft(f4);
                        } else {
                            a0Var.setOftenReadTitlePaddingLeft(f5);
                        }
                    }
                    float f6 = bizTimeLineHotListView.f51128O1;
                    if (f2 > f6 || (i5 < 0 && bizTimeLineHotListView.f51129P1 + f2 > f6)) {
                        float f7 = (float) BizTimeLineHotListView.f51108T1;
                        if (i5 < 0) {
                            f2 += bizTimeLineHotListView.f51129P1;
                        }
                        bizTimeLineHotListView.f51125L1.setVideoTitlePaddingLeft((f7 - f2) + f6);
                    } else {
                        bizTimeLineHotListView.f51125L1.setVideoTitlePaddingLeft((float) BizTimeLineHotListView.f51108T1);
                    }
                }
            }
            BizTimeLineHotListView bizTimeLineHotListView2 = hVar.f51236a;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) bizTimeLineHotListView2.getLayoutManager();
            if (linearLayoutManager != null) {
                bizTimeLineHotListView2.f51121H1 = C46746a.f125826a.mo71973f(bizTimeLineHotListView2.getContext());
                bizTimeLineHotListView2.f51122I1 = bizTimeLineHotListView2.getItemPadding() + C76577a.m92151b(bizTimeLineHotListView2.getContext(), 50);
                bizTimeLineHotListView2.f51120G1 = (float) ((bizTimeLineHotListView2.f51121H1 - (bizTimeLineHotListView2.getItemWidth() / 2)) - bizTimeLineHotListView2.f51122I1);
                int E = linearLayoutManager.mo16959E();
                int D = linearLayoutManager.mo16958D();
                Log.m105919d("MicroMsg.BizTimeLineHotListView", "alvinluo onScroll mAlphaChangeOffset: %s, ALPHA_DISTANCE: %d", Float.valueOf(bizTimeLineHotListView2.f51120G1), Integer.valueOf(bizTimeLineHotListView2.f51122I1));
                RecyclerView.C16631z I0 = bizTimeLineHotListView2.mo17023I0(E);
                RecyclerView.C16631z I02 = bizTimeLineHotListView2.mo17023I0(D);
                bizTimeLineHotListView2.mo23010Q1(I0, E);
                bizTimeLineHotListView2.mo23010Q1(I02, D);
                if (!Util.isNullOrNil((List) bizTimeLineHotListView2.f51118E1)) {
                    int size = ((ArrayList) bizTimeLineHotListView2.f51118E1).size() / C18466p.f51248c;
                    for (int i6 = 0; i6 <= size; i6++) {
                        int a = m19113a(i6);
                        if (a != bizTimeLineHotListView2.f51117D1.getItemCount() - 1) {
                            if (i6 == 0) {
                                a = bizTimeLineHotListView2.getCustomItemCount();
                            }
                            RecyclerView.C16631z I03 = bizTimeLineHotListView2.mo17023I0(a);
                            if (I03 != null && (I03 instanceof BizTimeLineHotListView.C18434e)) {
                                BizTimeLineHotListView.C18434e eVar = (BizTimeLineHotListView.C18434e) I03;
                                float x = eVar.f51153I.getX();
                                float f8 = 0.0f;
                                if (x >= 0.0f) {
                                    int a2 = C18466p.m19102a(bizTimeLineHotListView2.getContext());
                                    int i7 = BizTimeLineHotListView.f51109U1;
                                    int i8 = BizTimeLineHotListView.f51110V1;
                                    float f9 = (float) (i7 - i8);
                                    float f15 = (float) i7;
                                    if (x <= f15) {
                                        f8 = x < ((float) i8) ? 1.0f : (f15 - x) / f9;
                                    }
                                    C18468r rVar = (C18468r) ((ArrayList) bizTimeLineHotListView2.f51118E1).get(a);
                                    if (!bizTimeLineHotListView2.f51126M1 || rVar == null || !rVar.f51258v) {
                                        f = f8 * ((float) BizTimeLineHotListView.f51114Z1);
                                    } else if (!rVar.f51257u) {
                                        i4 = BizTimeLineHotListView.f51113Y1;
                                        i3 = (int) (f8 * ((float) BizTimeLineHotListView.f51114Z1));
                                        eVar.f51153I.setPadding(i3, 0, 0, 0);
                                        C46746a.f125826a.mo71980n(eVar.f51153I, a2 + i3 + i4);
                                    } else {
                                        float f16 = (float) BizTimeLineHotListView.f51112X1;
                                        f = (f8 * f16) + f16;
                                    }
                                    i3 = (int) f;
                                    i4 = 0;
                                    eVar.f51153I.setPadding(i3, 0, 0, 0);
                                    C46746a.f125826a.mo71980n(eVar.f51153I, a2 + i3 + i4);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f51275f += i;
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
