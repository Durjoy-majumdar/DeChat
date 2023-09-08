package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e */
public class C95251e {

    /* renamed from: a */
    public RecyclerView f276441a;

    /* renamed from: b */
    public Map<Integer, C95253b> f276442b = new HashMap();

    /* renamed from: c */
    public LinearLayoutManager f276443c;

    /* renamed from: d */
    public C95254c f276444d;

    /* renamed from: e */
    public boolean f276445e = true;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e$b */
    public class C95253b {

        /* renamed from: a */
        public boolean f276446a;

        public C95253b(C95251e eVar, C95252a aVar) {
        }

        /* renamed from: a */
        public void mo131787a() {
            SnsMethodCalculate.markStartTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$ExposureInfo");
            if (this.f276446a) {
                SnsMethodCalculate.markEndTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$ExposureInfo");
                return;
            }
            this.f276446a = true;
            SnsMethodCalculate.markEndTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$ExposureInfo");
        }

        /* renamed from: b */
        public void mo131788b() {
            SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$ExposureInfo");
            if (this.f276446a) {
                this.f276446a = false;
            }
            SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$ExposureInfo");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e$c */
    public interface C95254c {
        /* renamed from: N */
        boolean mo131789N(int i);

        /* renamed from: f0 */
        void mo131790f0(int i, C95251e eVar);

        /* renamed from: f3 */
        void mo131791f3(int i);

        /* renamed from: l2 */
        void mo131792l2(int i);

        void onDestroy();

        /* renamed from: s0 */
        boolean mo131794s0(int i);
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e$d */
    public class C95255d extends RecyclerView.C0130p {

        /* renamed from: d */
        public RecyclerView f276447d;

        /* renamed from: e */
        public LinearLayoutManager f276448e;

        /* renamed from: f */
        public int f276449f = Integer.MAX_VALUE;

        /* renamed from: g */
        public int f276450g = -1;

        /* renamed from: h */
        public int f276451h = -1;

        /* renamed from: i */
        public Runnable f276452i = new C95256a();

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e$d$a */
        public class C95256a implements Runnable {
            public C95256a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener$1");
                C95255d dVar = C95255d.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                int i = dVar.f276449f;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                if (i == 1) {
                    C95255d dVar2 = C95255d.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    dVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("onDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    C95251e.this.mo131786e();
                    SnsMethodCalculate.markEndTimeMs("onDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    C95255d dVar3 = C95255d.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    RecyclerView recyclerView = dVar3.f276447d;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    C95255d dVar4 = C95255d.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    Runnable runnable = dVar4.f276452i;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    recyclerView.postDelayed(runnable, 100);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener$1");
            }
        }

        public C95255d(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
            this.f276447d = recyclerView;
            this.f276448e = linearLayoutManager;
        }

        /* renamed from: a */
        public final void mo131795a(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("flyingItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
            C95251e eVar = C95251e.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("flyingExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            if (i > i2) {
                Log.m105920e("RecyclerViewExposureMgr", "wtf start > end");
                SnsMethodCalculate.markEndTimeMs("flyingExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            } else if (!eVar.f276445e) {
                SnsMethodCalculate.markEndTimeMs("flyingExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            } else {
                eVar.mo131785d(i, i2);
                while (i <= i2) {
                    C95253b bVar = (C95253b) ((HashMap) eVar.f276442b).get(Integer.valueOf(i));
                    if (bVar != null && bVar.f276446a) {
                        eVar.f276444d.mo131792l2(i);
                        bVar.mo131788b();
                    }
                    i++;
                }
                SnsMethodCalculate.markEndTimeMs("flyingExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            }
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            SnsMethodCalculate.markEndTimeMs("flyingItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/RecyclerViewExposureMgr$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
            super.onScrollStateChanged(recyclerView, i);
            if (i != this.f276449f) {
                if (i != 1) {
                    SnsMethodCalculate.markStartTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    this.f276447d.getHandler().removeCallbacks(this.f276452i);
                    SnsMethodCalculate.markEndTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                }
                if (i == 0) {
                    C95251e.this.mo131786e();
                    if (this.f276449f == 2) {
                        int C = this.f276448e.mo16957C();
                        int E = this.f276448e.mo16959E();
                        int i2 = this.f276450g;
                        if (E < i2) {
                            mo131795a(E, i2);
                        } else {
                            int i3 = this.f276451h;
                            if (C > i3) {
                                mo131795a(i3, C);
                            }
                        }
                    }
                } else if (i == 1) {
                    SnsMethodCalculate.markStartTimeMs("startDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    SnsMethodCalculate.markStartTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    this.f276447d.getHandler().removeCallbacks(this.f276452i);
                    SnsMethodCalculate.markEndTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                    this.f276447d.postDelayed(this.f276452i, 100);
                    SnsMethodCalculate.markEndTimeMs("startDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
                } else if (i == 2) {
                    this.f276450g = this.f276448e.mo16957C();
                    this.f276451h = this.f276448e.mo16959E();
                    System.currentTimeMillis();
                }
            }
            this.f276449f = i;
            Log.m105918d("RecyclerViewExposureMgr", "state " + i);
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/RecyclerViewExposureMgr$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/RecyclerViewExposureMgr$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
            super.onScrolled(recyclerView, i, i2);
            SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr$MyScrollListener");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/RecyclerViewExposureMgr$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C95251e(RecyclerView recyclerView) {
        this.f276441a = recyclerView;
        if (recyclerView.getLayoutManager() == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("set LinearLayoutManger to RecyclerView first");
        } else if (recyclerView.getAdapter() == null || !(recyclerView.getAdapter() instanceof C95254c)) {
            throw new IllegalArgumentException("set Adapter which implemented ExposureListener to RecyclerView first");
        } else {
            this.f276444d = (C95254c) recyclerView.getAdapter();
            this.f276443c = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f276441a.mo17043c(new C95255d(recyclerView, (LinearLayoutManager) recyclerView.getLayoutManager()));
        }
    }

    /* renamed from: a */
    public void mo131782a() {
        SnsMethodCalculate.markStartTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        if (!this.f276445e) {
            SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f276443c;
        if (linearLayoutManager != null) {
            int C = linearLayoutManager.mo16957C();
            int E = this.f276443c.mo16959E();
            Log.m105919d("RecyclerViewExposureMgr", "appear [%d, %d]", Integer.valueOf(C), Integer.valueOf(E));
            if (C == E && C == -1) {
                Log.m105924i("RecyclerViewExposureMgr", "no exposuring child");
                SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                return;
            }
            mo131785d(C, E);
        }
        SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    /* renamed from: b */
    public void mo131783b() {
        SnsMethodCalculate.markStartTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        LinearLayoutManager linearLayoutManager = this.f276443c;
        if (linearLayoutManager != null) {
            int C = linearLayoutManager.mo16957C();
            int E = this.f276443c.mo16959E();
            Log.m105919d("RecyclerViewExposureMgr", "disappear [%d, %d]", Integer.valueOf(C), Integer.valueOf(E));
            if (C == E && C == -1) {
                Log.m105924i("RecyclerViewExposureMgr", "no exposuring child");
                SnsMethodCalculate.markEndTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                return;
            }
            while (C <= E) {
                C95253b bVar = (C95253b) ((HashMap) this.f276442b).get(Integer.valueOf(C));
                if (bVar != null && bVar.f276446a) {
                    this.f276444d.mo131792l2(C);
                    bVar.mo131788b();
                }
                C++;
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    /* renamed from: c */
    public void mo131784c(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setForeground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        this.f276445e = z;
        SnsMethodCalculate.markEndTimeMs("setForeground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    /* renamed from: d */
    public final void mo131785d(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        while (i <= i2) {
            C95253b bVar = (C95253b) ((HashMap) this.f276442b).get(Integer.valueOf(i));
            if (bVar == null) {
                bVar = new C95253b(this, (C95252a) null);
                ((HashMap) this.f276442b).put(Integer.valueOf(i), bVar);
            }
            if (this.f276444d.mo131789N(i)) {
                if (!bVar.f276446a) {
                    this.f276444d.mo131790f0(i, this);
                    bVar.mo131787a();
                } else if (this.f276444d.mo131794s0(i)) {
                    this.f276444d.mo131791f3(i);
                }
            }
            i++;
        }
        SnsMethodCalculate.markEndTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    /* renamed from: e */
    public void mo131786e() {
        SnsMethodCalculate.markStartTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        if (!this.f276445e) {
            SnsMethodCalculate.markEndTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            return;
        }
        mo131782a();
        int C = this.f276443c.mo16957C();
        int E = this.f276443c.mo16959E();
        for (Map.Entry entry : ((HashMap) this.f276442b).entrySet()) {
            if (((Integer) entry.getKey()).intValue() < C || ((Integer) entry.getKey()).intValue() > E) {
                if (((C95253b) entry.getValue()).f276446a) {
                    this.f276444d.mo131792l2(((Integer) entry.getKey()).intValue());
                    ((C95253b) entry.getValue()).mo131788b();
                }
            } else if (((C95253b) entry.getValue()).f276446a) {
                if (!this.f276444d.mo131789N(((Integer) entry.getKey()).intValue())) {
                    this.f276444d.mo131792l2(((Integer) entry.getKey()).intValue());
                    ((C95253b) entry.getValue()).mo131788b();
                } else if (this.f276444d.mo131794s0(((Integer) entry.getKey()).intValue())) {
                    this.f276444d.mo131791f3(((Integer) entry.getKey()).intValue());
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }
}
