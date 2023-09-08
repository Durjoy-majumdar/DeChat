package com.tencent.p014mm.plugin.appbrand.widget.recent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C68587i1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.page.t1$$k;
import com.tencent.p014mm.plugin.appbrand.widget.recent.AppBrandRecentView;
import com.tencent.p014mm.plugin.appbrand.widget.recent.C85030c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import k20.C60958c;
import k20.C9556a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import lu3.C88654b;
import xt0.C91343g;
import xt0.C91344q;
import xt0.C91345r;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView */
public abstract class BaseAppBrandRecentView extends AppBrandRecentView implements MStorage.IOnStorageChange {

    /* renamed from: A1 */
    public Context f247748A1;

    /* renamed from: B1 */
    public AppBrandRecentView.C85013a f247749B1;

    /* renamed from: C1 */
    public List<C91343g> f247750C1 = new ArrayList();

    /* renamed from: D1 */
    public C85020c f247751D1;

    /* renamed from: E1 */
    public C85030c f247752E1 = null;

    /* renamed from: F1 */
    public boolean f247753F1 = false;

    /* renamed from: G1 */
    public List<C91343g> f247754G1 = new ArrayList();

    /* renamed from: H1 */
    public AppBrandRecentView.C85017e f247755H1;

    /* renamed from: I1 */
    public final Object f247756I1 = new Object();

    /* renamed from: J1 */
    public boolean f247757J1 = false;

    /* renamed from: K1 */
    public MMHandler f247758K1 = null;

    /* renamed from: L1 */
    public ConcurrentLinkedQueue<C85024e> f247759L1 = new ConcurrentLinkedQueue<>();

    /* renamed from: M1 */
    public AppBrandRecentView.C85014b f247760M1 = new C85018a(this);

    /* renamed from: N1 */
    public float f247761N1;

    /* renamed from: O1 */
    public float f247762O1;

    /* renamed from: P1 */
    public boolean f247763P1 = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$a */
    public class C85018a implements AppBrandRecentView.C85014b<LocalUsageInfo> {
        public C85018a(BaseAppBrandRecentView baseAppBrandRecentView) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$b */
    public class C85019b extends LinearLayoutManager {
        public C85019b(BaseAppBrandRecentView baseAppBrandRecentView, Context context) {
            super(context);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$c */
    public class C85020c extends RecyclerView.C16613e<C85021d> {
        public C85020c(C85018a aVar) {
        }

        public int getItemCount() {
            int size = BaseAppBrandRecentView.this.f247750C1.size();
            int completelyCountPerPage = BaseAppBrandRecentView.this.getCompletelyCountPerPage();
            if (BaseAppBrandRecentView.this.getCustomItemCount() == 1) {
                size--;
            }
            if (size > BaseAppBrandRecentView.this.getShowCount()) {
                size = BaseAppBrandRecentView.this.getShowCount();
            }
            if (BaseAppBrandRecentView.this.getCustomItemCount() == 1) {
                int i = size % completelyCountPerPage;
                return (i == 0 ? size + 1 : size + ((completelyCountPerPage + 1) - i)) + BaseAppBrandRecentView.this.getCustomItemCount();
            }
            int i2 = size % completelyCountPerPage;
            return i2 != 0 ? size + (completelyCountPerPage - i2) : size;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            LocalUsageInfo localUsageInfo;
            C85021d dVar = (C85021d) zVar;
            dVar.f247768D.setVisibility(8);
            ImageView imageView = dVar.f247769E;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i >= ((ArrayList) BaseAppBrandRecentView.this.f247750C1).size() || i - BaseAppBrandRecentView.this.getCustomItemCount() > BaseAppBrandRecentView.this.getShowCount()) {
                View view = dVar.f247767C;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                BaseAppBrandRecentView.this.mo117966B1(dVar, (C91343g) null, i);
                return;
            }
            View view3 = dVar.f247767C;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C91343g gVar = (C91343g) ((ArrayList) BaseAppBrandRecentView.this.f247750C1).get(i);
            if (gVar != null) {
                dVar.f247767C.setTag(gVar);
            }
            LocalUsageInfo localUsageInfo2 = gVar.f261985a;
            if (localUsageInfo2 == null || Util.isNullOrNil(C81243g.m99551a(localUsageInfo2.f239042f))) {
                ImageView imageView2 = dVar.f247769E;
                if (!(imageView2 == null || (localUsageInfo = gVar.f261985a) == null || !localUsageInfo.f239050q)) {
                    imageView2.setVisibility(0);
                    dVar.f247769E.setImageResource(C0966R.raw.ok_icon);
                }
            } else {
                dVar.f247768D.setVisibility(0);
                dVar.f247768D.setText(C81243g.m99551a(gVar.f261985a.f239042f));
            }
            BaseAppBrandRecentView.this.mo117966B1(dVar, gVar, i);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            BaseAppBrandRecentView baseAppBrandRecentView = BaseAppBrandRecentView.this;
            return new C85021d(C85868k2.m106137b(baseAppBrandRecentView.f247748A1).inflate(BaseAppBrandRecentView.this.getLayoutId(), viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$d */
    public class C85021d extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f247765A;

        /* renamed from: B */
        public TextView f247766B;

        /* renamed from: C */
        public View f247767C;

        /* renamed from: D */
        public TextView f247768D;

        /* renamed from: E */
        public ImageView f247769E;

        /* renamed from: z */
        public ImageView f247771z;

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$d$a */
        public class C85022a implements View.OnClickListener {
            public C85022a(BaseAppBrandRecentView baseAppBrandRecentView) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C91343g gVar = (C91343g) view.getTag();
                C85021d.this.mo17363j();
                gVar.getClass();
                if (BaseAppBrandRecentView.this.getOnItemClickListener() != null) {
                    AppBrandRecentView.C85013a onItemClickListener = BaseAppBrandRecentView.this.getOnItemClickListener();
                    BaseAppBrandRecentView baseAppBrandRecentView = BaseAppBrandRecentView.this;
                    onItemClickListener.mo116540b(view, gVar, baseAppBrandRecentView.f247761N1, baseAppBrandRecentView.f247762O1);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$d$b */
        public class C85023b implements View.OnLongClickListener {
            public C85023b(BaseAppBrandRecentView baseAppBrandRecentView) {
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C91343g gVar = (C91343g) view.getTag();
                C85021d.this.mo17363j();
                gVar.getClass();
                if (BaseAppBrandRecentView.this.getOnItemClickListener() != null) {
                    AppBrandRecentView.C85013a onItemClickListener = BaseAppBrandRecentView.this.getOnItemClickListener();
                    BaseAppBrandRecentView baseAppBrandRecentView = BaseAppBrandRecentView.this;
                    onItemClickListener.mo116539a(view, gVar, baseAppBrandRecentView.f247761N1, baseAppBrandRecentView.f247762O1);
                }
                BaseAppBrandRecentView.this.f247763P1 = true;
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        public C85021d(View view) {
            super(view);
            this.f247767C = view;
            view.setOnClickListener(new C85022a(BaseAppBrandRecentView.this));
            view.setOnLongClickListener(new C85023b(BaseAppBrandRecentView.this));
            view.getLayoutParams().width = BaseAppBrandRecentView.this.getResources().getDisplayMetrics().widthPixels / 4;
            this.f247771z = (ImageView) view.findViewById(C0966R.C0970id.f15);
            this.f247765A = (ImageView) view.findViewById(C0966R.C0970id.f1j);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0966R.C0970id.f2b);
            this.f247766B = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f247768D = (TextView) view.findViewById(C0966R.C0970id.khf);
            this.f247769E = (ImageView) view.findViewById(C0966R.C0970id.f4x);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$e */
    public class C85024e extends C88654b {

        /* renamed from: e */
        public List<C91343g> f247774e = new ArrayList();

        /* renamed from: f */
        public List<C91343g> f247775f = new ArrayList();

        /* renamed from: g */
        public boolean f247776g;

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView$e$a */
        public class C85025a implements Runnable {
            public C85025a() {
            }

            public void run() {
                BaseAppBrandRecentView baseAppBrandRecentView;
                C85024e poll;
                ((ArrayList) BaseAppBrandRecentView.this.f247750C1).clear();
                ((ArrayList) BaseAppBrandRecentView.this.f247754G1).clear();
                C85024e eVar = C85024e.this;
                ((ArrayList) BaseAppBrandRecentView.this.f247750C1).addAll(eVar.f247774e);
                C85024e eVar2 = C85024e.this;
                ((ArrayList) BaseAppBrandRecentView.this.f247754G1).addAll(eVar2.f247775f);
                ((ArrayList) C85024e.this.f247774e).clear();
                ((ArrayList) C85024e.this.f247775f).clear();
                if (BaseAppBrandRecentView.this.getRefreshListener() != null) {
                    C85024e eVar3 = C85024e.this;
                    if (eVar3.f247776g) {
                        BaseAppBrandRecentView.this.getRefreshListener().mo103709b(((ArrayList) BaseAppBrandRecentView.this.f247750C1).size());
                    }
                }
                C85024e eVar4 = C85024e.this;
                if (eVar4.f247776g) {
                    Log.m105925i("MicroMsg.BaseAppBrandRecentView", "alvinluo refresh done dispatch diffResult, mType: %s", BaseAppBrandRecentView.this.f247755H1);
                    BaseAppBrandRecentView baseAppBrandRecentView2 = BaseAppBrandRecentView.this;
                    if (baseAppBrandRecentView2.f247755H1 == AppBrandRecentView.C85017e.RECENT_APP_BRAND) {
                        baseAppBrandRecentView2.getAdapter().notifyDataSetChanged();
                    } else {
                        baseAppBrandRecentView2.getAdapter().notifyDataSetChanged();
                    }
                }
                synchronized (BaseAppBrandRecentView.this.f247756I1) {
                    baseAppBrandRecentView = BaseAppBrandRecentView.this;
                    baseAppBrandRecentView.f247757J1 = false;
                }
                synchronized (baseAppBrandRecentView.f247756I1) {
                    if (baseAppBrandRecentView.f247759L1.size() > 0 && (poll = baseAppBrandRecentView.f247759L1.poll()) != null) {
                        baseAppBrandRecentView.f247758K1.postToWorker(poll);
                    }
                }
            }
        }

        public C85024e(boolean z) {
            this.f247776g = z;
        }

        public String getKey() {
            return "MicroMsg.BaseAppBrandRecentView";
        }

        public void run() {
            BaseAppBrandRecentView baseAppBrandRecentView;
            List<LocalUsageInfo> list;
            synchronized (BaseAppBrandRecentView.this.f247756I1) {
                baseAppBrandRecentView = BaseAppBrandRecentView.this;
                baseAppBrandRecentView.f247757J1 = true;
            }
            AppBrandRecentView.C85014b bVar = baseAppBrandRecentView.f247760M1;
            LocalUsageInfo localUsageInfo = null;
            if (bVar != null) {
                int loadCount = baseAppBrandRecentView.getLoadCount();
                ((C85018a) bVar).getClass();
                list = ((C68587i1) C86312j.m106911c(C68587i1.class)).Oe0(loadCount);
            } else {
                list = null;
            }
            ((ArrayList) this.f247774e).clear();
            ((ArrayList) this.f247775f).clear();
            if (list != null) {
                if (BaseAppBrandRecentView.this.getSceneFactory() != null) {
                    t1$$k t1__k = (t1$$k) BaseAppBrandRecentView.this.getSceneFactory();
                    if (t1__k.f245042a.isRunning()) {
                        localUsageInfo = new LocalUsageInfo(t1__k.f245042a.getRuntime().mo113210l1().f234839s, t1__k.f245042a.getRuntime().mo113213o1().f261062e, t1__k.f245042a.getRuntime().mo113213o1().f261072r.f238585d, t1__k.f245042a.getRuntime().mo113213o1().f261072r.pkgVersion, t1__k.f245042a.getRuntime().mo113213o1().f261061d, t1__k.f245042a.getRuntime().mo113213o1().f234888v, t1__k.f245042a.getRuntime().mo113213o1().f261063f, false, t1__k.f245042a.getRuntime().mo113213o1().f234880U0, 0);
                    }
                }
                for (LocalUsageInfo next : list) {
                    if (localUsageInfo == null || !next.f239040d.equals(localUsageInfo.f239040d) || next.f239042f != localUsageInfo.f239042f) {
                        if (((ArrayList) this.f247774e).size() < BaseAppBrandRecentView.this.getShowCount()) {
                            ((ArrayList) this.f247774e).add(new C91343g(next));
                        }
                        if (BaseAppBrandRecentView.this.f247753F1) {
                            ((ArrayList) this.f247775f).add(new C91343g(next));
                        }
                        Log.m105919d("MicroMsg.BaseAppBrandRecentView", "alvinluo info %s, %s, %s, %s, %s, %d, mType: %s", next.f239040d, next.f239044h, next.f239045i, next.f239046j, next.f239041e, Integer.valueOf(next.f239042f), BaseAppBrandRecentView.this.f247755H1);
                    }
                }
            }
            BaseAppBrandRecentView.this.getClass();
            Log.m105925i("MicroMsg.BaseAppBrandRecentView", "[UpdateAppBrandRecentDataTask] type:%s preview size:%s, data size: %d, mType: %s", BaseAppBrandRecentView.this.getType(), Integer.valueOf(((ArrayList) BaseAppBrandRecentView.this.f247750C1).size()), Integer.valueOf(((ArrayList) BaseAppBrandRecentView.this.f247754G1).size()), BaseAppBrandRecentView.this.f247755H1);
            MMHandlerThread.postToMainThread(new C85025a());
        }
    }

    public BaseAppBrandRecentView(Context context) {
        super(context);
        mo117965A1(context);
    }

    /* renamed from: A1 */
    public void mo117965A1(Context context) {
        this.f247748A1 = context;
        context.getResources().getDimension(C0966R.dimen.f3685be);
        C85019b bVar = new C85019b(this, this.f247748A1);
        bVar.mo16974W(0);
        setLayoutManager(bVar);
        setHasFixedSize(true);
        C85020c cVar = new C85020c((C85018a) null);
        this.f247751D1 = cVar;
        setAdapter(cVar);
        C85030c cVar2 = new C85030c(getCustomItemCount());
        this.f247752E1 = cVar2;
        Context context2 = getContext();
        int completelyCountPerPage = getCompletelyCountPerPage();
        cVar2.f247783d = context2;
        cVar2.f247784e = this;
        cVar2.f247791o = completelyCountPerPage;
        mo17098m1(cVar2);
        cVar2.f247784e.mo17043c(cVar2);
        cVar2.f247795s = (LinearLayoutManager) cVar2.f247784e.getLayoutManager();
        cVar2.f247788i = new C91344q(cVar2, cVar2.f247784e.getContext());
        cVar2.f247789j = new C91345r(cVar2, cVar2.f247784e.getContext());
    }

    /* renamed from: B1 */
    public void mo117966B1(C85021d dVar, C91343g gVar, int i) {
        LocalUsageInfo localUsageInfo;
        C85021d dVar2 = dVar;
        C91343g gVar2 = gVar;
        int itemWidth = getItemWidth();
        float showCountPerPage = getShowCountPerPage();
        if (itemWidth <= 0) {
            itemWidth = (int) (((float) getWidth()) / showCountPerPage);
        }
        if (itemWidth <= 0) {
            itemWidth = (int) (((float) getResources().getDisplayMetrics().widthPixels) / showCountPerPage);
        }
        if (i == this.f247751D1.getItemCount() - 1) {
            double d = (double) itemWidth;
            double d2 = (double) showCountPerPage;
            itemWidth = (int) (d * (1.0d - (Math.ceil(d2) - d2)));
            Log.m105925i("MicroMsg.BaseAppBrandRecentView", "alvinluo lastPosition %d set width %d", Integer.valueOf(i), Integer.valueOf(itemWidth));
        }
        dVar2.f247767C.getLayoutParams().width = itemWidth;
        dVar2.f247767C.setScaleX(1.0f);
        dVar2.f247767C.setScaleY(1.0f);
        Log.m105919d("MicroMsg.BaseAppBrandRecentView", "alvinluo onBindCustomViewHolder postion: %d, width: %d", Integer.valueOf(i), Integer.valueOf(itemWidth));
        if (gVar2 != null && (localUsageInfo = gVar2.f261985a) != null) {
            if (!Util.isNullOrNil(localUsageInfo.f239045i)) {
                dVar2.f247766B.setText(mo117985z1(gVar2.f261985a.f239045i));
                dVar2.f247766B.setVisibility(0);
            } else if (!Util.isNullOrNil(gVar2.f261985a.f239044h)) {
                dVar2.f247766B.setText(mo117985z1(gVar2.f261985a.f239044h));
                dVar2.f247766B.setVisibility(0);
            } else if (!Util.isNullOrNil(gVar2.f261985a.f239040d)) {
                dVar2.f247766B.setText(gVar2.f261985a.f239040d);
                dVar2.f247766B.setVisibility(0);
            } else {
                LocalUsageInfo localUsageInfo2 = gVar2.f261985a;
                Log.m105929w("MicroMsg.BaseAppBrandRecentView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", localUsageInfo2.f239040d, localUsageInfo2.f239041e);
                dVar2.f247766B.setText("");
                dVar2.f247766B.setVisibility(4);
            }
            dVar2.f247765A.setVisibility(0);
            if (!Util.isNullOrNil(gVar2.f261985a.f239046j)) {
                String str = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(dVar2.f247771z, gVar2.f261985a.f239046j, C88393a.m110230a(), C88431k.f255437d);
                return;
            }
            dVar2.f247771z.setImageDrawable(C88393a.m110230a());
        }
    }

    /* renamed from: K0 */
    public boolean mo17025K0(int i, int i2) {
        C85030c cVar = this.f247752E1;
        int a = cVar.mo117993a(cVar.f247785f + i);
        BaseAppBrandRecentView baseAppBrandRecentView = cVar.f247784e;
        if (baseAppBrandRecentView != null && cVar.f247800x) {
            cVar.f247789j.f44872a = a;
            cVar.f247801y = true;
            baseAppBrandRecentView.getLayoutManager().startSmoothScroll(cVar.f247789j);
        }
        return super.mo17025K0(i, i2);
    }

    public boolean canScrollHorizontally(int i) {
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f247761N1 = motionEvent.getRawX();
            this.f247762O1 = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 2 && this.f247763P1) {
            return true;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f247763P1 = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public RecyclerView.C16613e getAdapter() {
        return this.f247751D1;
    }

    public int getCompletelyCountPerPage() {
        return 4;
    }

    public int getCount() {
        return this.f247750C1.size();
    }

    public int getCurrentPage() {
        C85030c cVar = this.f247752E1;
        if (cVar != null) {
            return cVar.f247790n;
        }
        return 0;
    }

    public int getCustomItemCount() {
        return 0;
    }

    public int getDataCount() {
        List<C91343g> list = this.f247750C1;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getItemWidth() {
        return 0;
    }

    public abstract int getLayoutId();

    public abstract int getLoadCount();

    public AppBrandRecentView.C85015c getOnDataChangedListener() {
        return null;
    }

    public AppBrandRecentView.C85013a getOnItemClickListener() {
        return this.f247749B1;
    }

    public List<C91343g> getPreviewItemList() {
        if (this.f247750C1 == null) {
            this.f247750C1 = new ArrayList();
        }
        return this.f247750C1;
    }

    public abstract int getShowCount();

    public float getShowCountPerPage() {
        return 4.0f;
    }

    public abstract String getType();

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Log.m105919d("MicroMsg.BaseAppBrandRecentView", "alvinluo onMeasure mViewWidth %d", Integer.valueOf(getMeasuredWidth()));
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105925i("MicroMsg.BaseAppBrandRecentView", "[onNotifyChange] process:%s eventId:%s, mType: %s", C86709a0.m107531m().mo58407a().toString(), Integer.valueOf(mStorageEventData.eventId), this.f247755H1);
        int i = mStorageEventData.eventId;
        mo117963x1();
    }

    public void setDataQuery(AppBrandRecentView.C85014b bVar) {
        this.f247760M1 = bVar;
    }

    public void setEnableDataCache(boolean z) {
        this.f247753F1 = z;
    }

    public void setOnDataChangedListener(AppBrandRecentView.C85015c cVar) {
    }

    public void setOnItemClickListener(AppBrandRecentView.C85013a aVar) {
        this.f247749B1 = aVar;
    }

    public void setOnScrollPageListener(C85030c.C85031a aVar) {
        C85030c cVar = this.f247752E1;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setType(AppBrandRecentView.C85017e eVar) {
        Class cls = C68587i1.class;
        Class cls2 = C68585h1.class;
        this.f247755H1 = eVar;
        if (eVar == AppBrandRecentView.C85017e.MY_APP_BRAND) {
            if (C86312j.m106911c(cls2) != null) {
                ((C68585h1) C86312j.m106911c(cls2)).add(this);
            }
        } else if (eVar == AppBrandRecentView.C85017e.RECENT_APP_BRAND && C86312j.m106911c(cls) != null) {
            ((C68587i1) C86312j.m106911c(cls)).add(this);
        }
    }

    /* renamed from: x1 */
    public void mo117963x1() {
        if (this.f247758K1 == null) {
            this.f247758K1 = new MMHandler("UpdateAppBrandList_" + this.f247755H1);
        }
        synchronized (this.f247756I1) {
            if (this.f247757J1) {
                Log.m105925i("MicroMsg.BaseAppBrandRecentView", "alvinluo refresh is running and delay mType: %s", this.f247755H1);
                if (this.f247759L1.size() <= 0) {
                    Log.m105924i("MicroMsg.BaseAppBrandRecentView", "alvinluo refresh add updateTask");
                    this.f247759L1.add(new C85024e(true));
                }
            } else {
                this.f247757J1 = true;
                this.f247758K1.postToWorker(new C85024e(true));
            }
        }
    }

    /* renamed from: y1 */
    public void mo117964y1() {
        Class cls = C68587i1.class;
        Class cls2 = C68585h1.class;
        AppBrandRecentView.C85017e eVar = this.f247755H1;
        if (eVar == AppBrandRecentView.C85017e.MY_APP_BRAND) {
            if (C86312j.m106911c(cls2) != null) {
                ((C68585h1) C86312j.m106911c(cls2)).remove(this);
            }
        } else if (eVar == AppBrandRecentView.C85017e.RECENT_APP_BRAND && C86312j.m106911c(cls) != null) {
            ((C68587i1) C86312j.m106911c(cls)).remove(this);
        }
        ((ArrayList) this.f247750C1).clear();
        MMHandler mMHandler = this.f247758K1;
        if (mMHandler != null) {
            mMHandler.quit();
        }
    }

    /* renamed from: z1 */
    public final String mo117985z1(String str) {
        if (str != null) {
            try {
                if (C45078p0.m49927f(str) <= 11) {
                    return str;
                }
                int i = 0;
                int i2 = 0;
                for (char c : str.toCharArray()) {
                    i += C45078p0.m49927f(c + "");
                    if (i >= 11) {
                        return str.substring(0, i2) + 8230;
                    }
                    i2++;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public BaseAppBrandRecentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo117965A1(context);
    }
}
