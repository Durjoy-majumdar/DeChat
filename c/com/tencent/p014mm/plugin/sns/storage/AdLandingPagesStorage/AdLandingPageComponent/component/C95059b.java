package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C102646h;
import qs2.C101255a0;
import qs2.C101290s;
import qs2.C101294u;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b */
public class C95059b extends C95295z {

    /* renamed from: s */
    public int f275911s;

    /* renamed from: t */
    public RecyclerView f275912t;

    /* renamed from: u */
    public Map<Integer, C95061b> f275913u = new HashMap();

    /* renamed from: v */
    public LinearLayoutManager f275914v;

    /* renamed from: w */
    public Set<Integer> f275915w = new HashSet();

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b$b */
    public class C95061b {

        /* renamed from: a */
        public int f275916a;

        /* renamed from: b */
        public long f275917b;

        /* renamed from: c */
        public long f275918c;

        /* renamed from: d */
        public boolean f275919d;

        public C95061b(C95059b bVar, C95060a aVar) {
        }

        /* renamed from: a */
        public void mo131572a() {
            SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            if (this.f275919d) {
                this.f275919d = false;
                if (this.f275918c > 0) {
                    this.f275917b += System.currentTimeMillis() - this.f275918c;
                    this.f275918c = 0;
                }
            }
            SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b$c */
    public class C95062c extends RecyclerView.C16613e<C95063a> {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b$c$a */
        public class C95063a extends RecyclerView.C16631z {

            /* renamed from: A */
            public static final /* synthetic */ int f275921A = 0;

            /* renamed from: z */
            public C95126j f275922z;

            public C95063a(C95062c cVar, View view, C95126j jVar) {
                super(view);
                this.f275922z = jVar;
            }
        }

        public C95062c(C95060a aVar) {
        }

        public int getItemCount() {
            SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            C95059b bVar = C95059b.this;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            C101290s G = bVar.mo131570G();
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            int size = G.f296728z.size();
            SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            return size;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            C95063a aVar = (C95063a) zVar;
            SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            C95059b bVar = C95059b.this;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            C101290s G = bVar.mo131570G();
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            C101255a0 a0Var = G.f296728z.get(i);
            if (a0Var instanceof C101294u) {
                int i2 = C95063a.f275921A;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter$MyViewHolder");
                C95126j jVar = aVar.f275922z;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter$MyViewHolder");
                jVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setViewInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
                jVar.mo130213z((C101294u) a0Var);
                SnsMethodCalculate.markEndTimeMs("setViewInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter$MyViewHolder");
                C95126j jVar2 = aVar.f275922z;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter$MyViewHolder");
                if (!jVar2.f276076u) {
                    C95059b bVar2 = C95059b.this;
                    SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    Set<Integer> set = bVar2.f275915w;
                    SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    ((HashSet) set).add(Integer.valueOf(i));
                }
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter$MyViewHolder");
                C95126j jVar3 = aVar.f275922z;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter$MyViewHolder");
                View view = jVar3.f276586n;
                int paddingRight = view.getPaddingRight();
                C95059b bVar3 = C95059b.this;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                C101290s G2 = bVar3.mo131570G();
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                if (i != G2.f296728z.size() - 1) {
                    C95059b bVar4 = C95059b.this;
                    SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    int i3 = bVar4.f275911s;
                    SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    paddingRight += i3;
                }
                int paddingLeft = view.getPaddingLeft();
                int paddingTop = view.getPaddingTop();
                C95059b bVar5 = C95059b.this;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                int i4 = bVar5.f275911s;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                int i5 = paddingTop + i4;
                int paddingBottom = view.getPaddingBottom();
                C95059b bVar6 = C95059b.this;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                int i6 = bVar6.f275911s;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                view.setPadding(paddingLeft, i5, paddingRight, paddingBottom + i6);
            }
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            C95126j jVar = new C95126j(viewGroup.getContext(), viewGroup);
            C95063a aVar = new C95063a(this, jVar.mo131855p(), jVar);
            SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyAdapter");
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b$d */
    public class C95064d extends RecyclerView.C0130p {

        /* renamed from: d */
        public RecyclerView f275923d;

        /* renamed from: e */
        public LinearLayoutManager f275924e;

        /* renamed from: f */
        public int f275925f = Integer.MAX_VALUE;

        /* renamed from: g */
        public int f275926g = -1;

        /* renamed from: h */
        public int f275927h = -1;

        /* renamed from: i */
        public long f275928i = 0;

        /* renamed from: j */
        public Runnable f275929j = new C95065a();

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b$d$a */
        public class C95065a implements Runnable {
            public C95065a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener$1");
                C95064d dVar = C95064d.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                int i = dVar.f275925f;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                if (i == 1) {
                    C95064d dVar2 = C95064d.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    dVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("onDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    StringBuilder sb = new StringBuilder();
                    sb.append("onDraggin first visible ");
                    C95059b bVar = C95059b.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    LinearLayoutManager linearLayoutManager = bVar.f275914v;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    sb.append(linearLayoutManager.mo16957C());
                    sb.append(", last visible ");
                    C95059b bVar2 = C95059b.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    LinearLayoutManager linearLayoutManager2 = bVar2.f275914v;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
                    sb.append(linearLayoutManager2.mo16959E());
                    Log.m105918d("AdLandingCarouselComp", sb.toString());
                    C95059b.m120863E(C95059b.this);
                    SnsMethodCalculate.markEndTimeMs("onDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    C95064d dVar3 = C95064d.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    RecyclerView recyclerView = dVar3.f275923d;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    C95064d dVar4 = C95064d.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    Runnable runnable = dVar4.f275929j;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    recyclerView.postDelayed(runnable, 100);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener$1");
            }
        }

        public C95064d(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
            this.f275923d = recyclerView;
            this.f275924e = linearLayoutManager;
        }

        /* renamed from: a */
        public final void mo131573a(int i, int i2, long j) {
            String str;
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("flyingItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
            boolean z = false;
            int i5 = 1;
            Log.m105919d("AdLandingCarouselComp", "flyingItems start %d, end %d, timeExposure %d", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j));
            C95059b bVar = C95059b.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("flyingExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            if (i3 > i4) {
                Log.m105920e("AdLandingCarouselComp", "wtf start > end");
                SnsMethodCalculate.markEndTimeMs("flyingExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            } else {
                bVar.mo131571H(i3, i4);
                if (i4 != i3) {
                    i5 = 1 + (i4 - i3);
                }
                long j2 = j / ((long) i5);
                while (i3 <= i4) {
                    C95061b bVar2 = bVar.f275913u.get(Integer.valueOf(i3));
                    if (bVar2 != null) {
                        SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
                        if (bVar2.f275919d) {
                            bVar2.f275919d = z;
                            bVar2.f275918c = 0;
                            bVar2.f275917b += j2;
                            str = "endExposure";
                        } else {
                            str = "endExposure";
                        }
                        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
                    }
                    i3++;
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("flyingExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            }
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            SnsMethodCalculate.markEndTimeMs("flyingItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingCarouselComp$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
            super.onScrollStateChanged(recyclerView, i);
            if (i != this.f275925f) {
                if (i != 1) {
                    SnsMethodCalculate.markStartTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    this.f275923d.getHandler().removeCallbacks(this.f275929j);
                    SnsMethodCalculate.markEndTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                }
                if (i == 0) {
                    C95059b.m120863E(C95059b.this);
                    if (this.f275925f == 2) {
                        int C = this.f275924e.mo16957C();
                        int E = this.f275924e.mo16959E();
                        int i2 = this.f275926g;
                        if (E < i2) {
                            mo131573a(E, i2, System.currentTimeMillis() - this.f275928i);
                        } else {
                            int i3 = this.f275927h;
                            if (C > i3) {
                                mo131573a(i3, C, System.currentTimeMillis() - this.f275928i);
                            }
                        }
                    }
                } else if (i == 1) {
                    SnsMethodCalculate.markStartTimeMs("startDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    SnsMethodCalculate.markStartTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    this.f275923d.getHandler().removeCallbacks(this.f275929j);
                    SnsMethodCalculate.markEndTimeMs("stopDraggin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                    this.f275923d.postDelayed(this.f275929j, 100);
                    SnsMethodCalculate.markEndTimeMs("startDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
                } else if (i == 2) {
                    this.f275926g = this.f275924e.mo16957C();
                    this.f275927h = this.f275924e.mo16959E();
                    this.f275928i = System.currentTimeMillis();
                }
            }
            this.f275925f = i;
            Log.m105918d("AdLandingCarouselComp", "state " + i);
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingCarouselComp$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingCarouselComp$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
            super.onScrolled(recyclerView, i, i2);
            SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$MyScrollListener");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingCarouselComp$MyScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C95059b(Context context, C101290s sVar, ViewGroup viewGroup) {
        super(context, sVar, viewGroup);
        this.f275911s = C76577a.m92151b(context, 12);
    }

    /* renamed from: E */
    public static void m120863E(C95059b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        SnsMethodCalculate.markStartTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        LinearLayoutManager linearLayoutManager = bVar.f275914v;
        if (linearLayoutManager != null) {
            bVar.mo131571H(linearLayoutManager.mo16957C(), bVar.f275914v.mo16959E());
        }
        SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        int C = bVar.f275914v.mo16957C();
        int E = bVar.f275914v.mo16959E();
        for (Map.Entry entry : ((HashMap) bVar.f275913u).entrySet()) {
            if (((Integer) entry.getKey()).intValue() < C || ((Integer) entry.getKey()).intValue() > E) {
                ((C95061b) entry.getValue()).mo131572a();
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        super.mo124360B();
        SnsMethodCalculate.markStartTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        LinearLayoutManager linearLayoutManager = this.f275914v;
        if (linearLayoutManager != null) {
            mo131571H(linearLayoutManager.mo16957C(), this.f275914v.mo16959E());
        }
        SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        super.mo124361D();
        SnsMethodCalculate.markStartTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        LinearLayoutManager linearLayoutManager = this.f275914v;
        if (linearLayoutManager != null) {
            int E = this.f275914v.mo16959E();
            for (int C = linearLayoutManager.mo16957C(); C <= E; C++) {
                C95061b bVar = (C95061b) ((HashMap) this.f275913u).get(Integer.valueOf(C));
                if (bVar != null) {
                    bVar.mo131572a();
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    /* renamed from: G */
    public final C101290s mo131570G() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        C101290s sVar = (C101290s) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        return sVar;
    }

    /* renamed from: H */
    public final void mo131571H(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        while (i <= i2) {
            C95061b bVar = this.f275913u.get(Integer.valueOf(i));
            if (bVar == null) {
                bVar = new C95061b(this, (C95060a) null);
                this.f275913u.put(Integer.valueOf(i), bVar);
            }
            SnsMethodCalculate.markStartTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            if (bVar.f275919d) {
                SnsMethodCalculate.markEndTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            } else {
                bVar.f275919d = true;
                bVar.f275918c = System.currentTimeMillis();
                bVar.f275916a++;
                SnsMethodCalculate.markEndTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            }
            i++;
        }
        SnsMethodCalculate.markEndTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        int i;
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        RecyclerView recyclerView = (RecyclerView) this.f276586n.findViewById(C0966R.C0970id.iio);
        this.f275912t = recyclerView;
        recyclerView.setBackgroundColor(mo131570G().f296727A);
        Iterator<C101255a0> it = mo131570G().f296728z.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C101255a0 next = it.next();
            if ((next instanceof C101294u) && i2 <= (i = ((int) (next.f296498d + next.f296497c + ((C101294u) next).f296508n)) + (this.f275911s << 1))) {
                i2 = i;
            }
        }
        ViewGroup.LayoutParams layoutParams = this.f275912t.getLayoutParams();
        layoutParams.height = i2;
        this.f275912t.setLayoutParams(layoutParams);
        this.f275912t.setAdapter(new C95062c((C95060a) null));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f276579d);
        this.f275914v = linearLayoutManager;
        linearLayoutManager.mo16974W(0);
        this.f275912t.setLayoutManager(this.f275914v);
        RecyclerView recyclerView2 = this.f275912t;
        recyclerView2.mo17043c(new C95064d(recyclerView2, this.f275914v));
        this.f275912t.setNestedScrollingEnabled(false);
        this.f275912t.setHasFixedSize(true);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        return C0966R.C0971layout.f359992c13;
    }

    /* renamed from: u */
    public boolean mo124366u(JSONArray jSONArray) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        if (jSONArray == null) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        if (mo118822v(jSONObject)) {
            jSONArray.put(jSONObject);
        }
        try {
            Map<Integer, C95061b> map = this.f275913u;
            Set<Integer> set = this.f275915w;
            this.f275915w = new HashSet();
            this.f275913u = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                C101255a0 a0Var = mo131570G().f296728z.get(((Integer) next.getKey()).intValue());
                if (!a0Var.f296512r) {
                    if (a0Var instanceof C101294u) {
                        C101294u uVar = (C101294u) a0Var;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("cid", mo131570G().f296728z.get(((Integer) next.getKey()).intValue()).f296495a);
                        jSONObject2.put(C102646h.COL_EXPOSURECOUNT, ((C95061b) next.getValue()).f275916a);
                        jSONObject2.put("stayTime", ((C95061b) next.getValue()).f275917b);
                        if (set.contains(next.getKey())) {
                            String mD5String = MD5Util.getMD5String(uVar.f296747z);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("urlMd5", mD5String);
                            jSONObject3.put("needDownload", 1);
                            jSONObject2.put("imgUrlInfo", jSONObject3);
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return true;
        } catch (JSONException e) {
            Log.m105920e("AdLandingCarouselComp", Util.stackTraceToString(e));
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return false;
        }
    }
}
