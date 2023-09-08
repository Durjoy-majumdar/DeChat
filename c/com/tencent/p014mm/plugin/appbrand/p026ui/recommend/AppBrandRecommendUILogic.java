package com.tencent.p014mm.plugin.appbrand.p026ui.recommend;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84657x;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84662z;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import es0.C7930y;
import es0.C86647a;
import es0.C86668l;
import es0.C86676v;
import es0.C86677w;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import js0.C88024r;
import kotlin.Metadata;
import oi0.C89217f;
import oi0.C89226k;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C90406da0;
import te3.C90419io3;
import te3.C90425kw;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onCreate", "onResume", "onPause", "onDestroy", "onDestroyView", "Landroidx/fragment/app/FragmentActivity;", "activity", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic */
public abstract class AppBrandRecommendUILogic implements C0124r {

    /* renamed from: d */
    public final FragmentActivity f246995d;

    /* renamed from: e */
    public final Context f246996e;

    /* renamed from: f */
    public final C13601g f246997f = C36568h.m40985a(new C84668e(this));

    /* renamed from: g */
    public final C13601g f246998g = C36568h.m40985a(C84665b.f247016d);

    /* renamed from: h */
    public final MMHandler f246999h = new MMHandler("AppBrandLauncherUI#AppBrandLauncherRecommendsList");

    /* renamed from: i */
    public final C86647a f247000i;

    /* renamed from: j */
    public final C84664a f247001j;

    /* renamed from: n */
    public final LinearLayoutManager f247002n;

    /* renamed from: o */
    public final C84662z f247003o;

    /* renamed from: p */
    public final C86668l f247004p;

    /* renamed from: q */
    public final C13601g f247005q;

    /* renamed from: r */
    public final MStorage.IOnStorageChange f247006r;

    /* renamed from: s */
    public final MStorage.IOnStorageChange f247007s;

    /* renamed from: t */
    public final ArrayList<Integer> f247008t;

    /* renamed from: u */
    public final ArrayList<Integer> f247009u;

    /* renamed from: v */
    public final HashMap<String, Long> f247010v;

    /* renamed from: w */
    public final HashMap<Integer, String> f247011w;

    /* renamed from: x */
    public final C84669f f247012x;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic$a */
    public final class C84664a {

        /* renamed from: a */
        public volatile int f247013a;

        /* renamed from: b */
        public volatile boolean f247014b;

        /* renamed from: c */
        public volatile boolean f247015c;

        public C84664a(AppBrandRecommendUILogic appBrandRecommendUILogic) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic$b */
    public static final class C84665b extends C87413o implements C32224a<C89217f> {

        /* renamed from: d */
        public static final C84665b f247016d = new C84665b();

        public C84665b() {
            super(0);
        }

        public Object invoke() {
            C89217f fVar;
            synchronized (C89217f.f257071o) {
                if (C89217f.f257072p == null) {
                    C89217f.f257072p = new C89217f();
                }
                fVar = C89217f.f257072p;
                C87412m.m108591d(fVar);
            }
            return fVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic$c */
    public static final class C84666c implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRecommendUILogic f247017d;

        public C84666c(AppBrandRecommendUILogic appBrandRecommendUILogic) {
            this.f247017d = appBrandRecommendUILogic;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            AppBrandRecommendUILogic appBrandRecommendUILogic = this.f247017d;
            appBrandRecommendUILogic.getClass();
            appBrandRecommendUILogic.f246995d.runOnUiThread(new C86677w(new C86676v(appBrandRecommendUILogic)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic$d */
    public static final class C84667d extends C87413o implements C32224a<C84657x> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRecommendUILogic f247018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84667d(AppBrandRecommendUILogic appBrandRecommendUILogic) {
            super(0);
            this.f247018d = appBrandRecommendUILogic;
        }

        public Object invoke() {
            AppBrandRecommendUILogic appBrandRecommendUILogic = this.f247018d;
            return new C84657x(appBrandRecommendUILogic.f246996e, appBrandRecommendUILogic.mo117377g());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic$e */
    public static final class C84668e extends C87413o implements C32224a<RecommendRecycleView> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRecommendUILogic f247019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84668e(AppBrandRecommendUILogic appBrandRecommendUILogic) {
            super(0);
            this.f247019d = appBrandRecommendUILogic;
        }

        public Object invoke() {
            return new RecommendRecycleView(this.f247019d.f246995d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic$f */
    public static final class C84669f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final ArrayList<Integer> f247020d = new ArrayList<>();

        /* renamed from: e */
        public final ArrayList<Integer> f247021e = new ArrayList<>();

        /* renamed from: f */
        public final /* synthetic */ AppBrandRecommendUILogic f247022f;

        public C84669f(AppBrandRecommendUILogic appBrandRecommendUILogic) {
            this.f247022f = appBrandRecommendUILogic;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            boolean z = i == 2;
            if (z) {
                this.f247022f.f247004p.f251656d = z;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                linearLayoutManager.mo16957C();
                int E = linearLayoutManager.mo16959E();
                if (E >= 3) {
                    E--;
                }
                this.f247022f.mo117375b().f257082j = E;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int C = linearLayoutManager.mo16957C();
                int E = linearLayoutManager.mo16959E();
                if (C == 0 && E == 1) {
                    AppBrandRecommendUILogic appBrandRecommendUILogic = this.f247022f;
                    C7930y.m8095a(appBrandRecommendUILogic.f246996e, appBrandRecommendUILogic.f247003o.f246981g);
                } else {
                    this.f247021e.clear();
                    if (C <= E) {
                        while (true) {
                            if (C != 0) {
                                RecyclerView.C16631z I0 = this.f247022f.mo117377g().mo17023I0(C);
                                if (I0 != null && (I0 instanceof C86647a.C86650c)) {
                                    this.f247021e.add(Integer.valueOf(C));
                                    if (!this.f247020d.contains(Integer.valueOf(C))) {
                                        int x1 = this.f247022f.mo117377g().mo63440x1(I0);
                                        Log.m105919d("MicroMsg.Recommend.AppBrandRecommendUILogic", "reportExposeData index:%d, holderPosition:%d", Integer.valueOf(C), Integer.valueOf(x1));
                                        if (x1 < this.f247022f.f247000i.getItemCount()) {
                                            C90419io3 io32 = this.f247022f.f247000i.mo121055G4().get(x1);
                                            C87412m.m108593f(io32, "wxaList[position]");
                                            C90419io3 io33 = io32;
                                            C86668l lVar = this.f247022f.f247004p;
                                            if (lVar.f251657e.containsKey(io33.f259594r)) {
                                                C90406da0 da02 = lVar.f251657e.get(io33.f259594r);
                                                da02.f259455e++;
                                                lVar.f251657e.put(io33.f259594r, da02);
                                            } else {
                                                C90406da0 da03 = new C90406da0();
                                                da03.f259454d = io33.f259585f;
                                                da03.f259455e = 1;
                                                da03.f259456f = io33.f259594r;
                                                da03.f259457g = io33.f259596t;
                                                da03.f259458h = 0;
                                                da03.f259460j = io33.f259586g;
                                                da03.f259461n = io33.f259587h;
                                                da03.f259462o = io33.f259583d;
                                                da03.f259463p = io33.f259599w;
                                                da03.f259464q = x1 + 1;
                                                WxaAttributes LL = C81161g2.Cx0().mo114000LL(io33.f259585f, new String[0]);
                                                if (LL != null) {
                                                    da03.f259459i = LL.field_appId;
                                                }
                                                lVar.f251657e.put(io33.f259594r, da03);
                                            }
                                            this.f247022f.f247010v.put(io33.f259594r, Long.valueOf(System.currentTimeMillis()));
                                            this.f247022f.f247011w.put(Integer.valueOf(C), io33.f259594r);
                                            this.f247022f.f247008t.add(Integer.valueOf(C));
                                        }
                                    }
                                }
                            } else {
                                AppBrandRecommendUILogic appBrandRecommendUILogic2 = this.f247022f;
                                C7930y.m8095a(appBrandRecommendUILogic2.f246996e, appBrandRecommendUILogic2.f247003o.f246981g);
                            }
                            if (C == E) {
                                break;
                            }
                            C++;
                        }
                    }
                    this.f247022f.f247009u.clear();
                    this.f247020d.removeAll(this.f247021e);
                    this.f247022f.f247009u.addAll(this.f247020d);
                    this.f247020d.clear();
                    this.f247020d.addAll(this.f247021e);
                    AppBrandRecommendUILogic appBrandRecommendUILogic3 = this.f247022f;
                    appBrandRecommendUILogic3.f247008t.removeAll(appBrandRecommendUILogic3.f247009u);
                    AppBrandRecommendUILogic appBrandRecommendUILogic4 = this.f247022f;
                    appBrandRecommendUILogic4.mo117374a(appBrandRecommendUILogic4.f247009u, true);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendUILogic$g */
    public static final class C84670g implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRecommendUILogic f247023d;

        public C84670g(AppBrandRecommendUILogic appBrandRecommendUILogic) {
            this.f247023d = appBrandRecommendUILogic;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            AppBrandRecommendUILogic appBrandRecommendUILogic = this.f247023d;
            appBrandRecommendUILogic.getClass();
            appBrandRecommendUILogic.f246995d.runOnUiThread(new C86677w(new C86676v(appBrandRecommendUILogic)));
        }
    }

    public AppBrandRecommendUILogic(FragmentActivity fragmentActivity) {
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f246995d = fragmentActivity;
        this.f246996e = fragmentActivity;
        this.f247000i = new C86647a(fragmentActivity);
        this.f247001j = new C84664a(this);
        this.f247002n = new SmoothScrollLinerLayoutManager(fragmentActivity);
        this.f247003o = new C84662z(fragmentActivity, mo117377g());
        this.f247004p = new C86668l();
        this.f247005q = C36568h.m40985a(new C84667d(this));
        this.f247006r = new C84666c(this);
        this.f247007s = new C84670g(this);
        this.f247008t = new ArrayList<>();
        this.f247009u = new ArrayList<>();
        this.f247010v = new HashMap<>();
        this.f247011w = new HashMap<>();
        this.f247012x = new C84669f(this);
    }

    /* renamed from: a */
    public final void mo117374a(ArrayList<Integer> arrayList, boolean z) {
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if ((next == null || next.intValue() != 0) && this.f247011w.containsKey(next)) {
                String str = this.f247011w.get(next);
                Long l = this.f247010v.get(str);
                if (!(str == null || l == null)) {
                    long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                    Log.m105919d("MicroMsg.Recommend.AppBrandRecommendUILogic", "exposure index: %d, exposureTime:%d", next, Long.valueOf(currentTimeMillis));
                    C86668l lVar = this.f247004p;
                    if (lVar.f251657e.containsKey(str)) {
                        C90406da0 da02 = lVar.f251657e.get(str);
                        da02.f259458h = (int) (((long) da02.f259458h) + currentTimeMillis);
                        lVar.f251657e.put(str, da02);
                    }
                }
            }
        }
        if (z) {
            arrayList.clear();
        }
    }

    /* renamed from: b */
    public final C89217f mo117375b() {
        return (C89217f) ((C36570n) this.f246998g).getValue();
    }

    /* renamed from: c */
    public abstract View mo117371c();

    /* renamed from: d */
    public abstract String mo117372d();

    /* renamed from: e */
    public final C84657x mo117376e() {
        return (C84657x) ((C36570n) this.f247005q).getValue();
    }

    /* renamed from: f */
    public abstract boolean mo117373f();

    /* renamed from: g */
    public final LoadMoreRecyclerView mo117377g() {
        return (LoadMoreRecyclerView) this.f246997f.getValue();
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public final void onCreate() {
        Log.m105924i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onCreate");
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105924i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onDestroy");
        ((C81500i0) C81161g2.Bx0(C81500i0.class)).remove(this.f247006r);
        C81161g2.Cx0().remove(this.f247007s);
        this.f247008t.clear();
        this.f247009u.clear();
        this.f247010v.clear();
        this.f247011w.clear();
        C86668l lVar = this.f247004p;
        long j = mo117375b().f257077e;
        if (lVar.f251658f.size() == 0) {
            if (!(lVar.f251657e.size() > 0)) {
                Log.m105920e("MicroMsg.Recommend.AppBrandRecommendReport", "none data report");
                mo117375b().f257081i = !mo117375b().mo123547c().isEmpty();
                mo117375b().f257083k = 0;
                C89217f b = mo117375b();
                b.f257074b.f257070b = null;
                b.f257086n = null;
            }
        }
        Log.m105924i("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData");
        long nowSecond = Util.nowSecond() - lVar.f251654b;
        long j2 = 86400;
        if (nowSecond < 86400) {
            j2 = lVar.f251655c + nowSecond;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(lVar.f251658f);
        LinkedList linkedList2 = new LinkedList();
        for (String str : lVar.f251657e.keySet()) {
            linkedList2.add(lVar.f251657e.get(str));
        }
        Log.m105919d("MicroMsg.Recommend.AppBrandRecommendReport", "exposureNodeMap size:%d", Integer.valueOf(lVar.f251657e.size()));
        boolean z = lVar.f251656d;
        Log.m105925i("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData sessionId:%d, click_node_list size :%d, exposureNodeList size:%d, exposureSceneType:%d, stayTime:%d, startRecordTime:%d", Long.valueOf(j), Integer.valueOf(lVar.f251658f.size()), Integer.valueOf(linkedList2.size()), Integer.valueOf(z ? 1 : 0), Long.valueOf(j2), Long.valueOf(lVar.f251653a));
        LinkedList<C90425kw> linkedList3 = lVar.f251658f;
        boolean z2 = z;
        LinkedList linkedList4 = linkedList;
        long j3 = j;
        C86668l lVar2 = lVar;
        String str2 = "{";
        long j4 = j2;
        if (linkedList3.size() > 0) {
            for (Iterator<C90425kw> it = linkedList3.iterator(); it.hasNext(); it = it) {
                C90425kw next = it.next();
                Log.m105925i("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData clickData:%s", str2 + "username:" + next.f259658d + "," + "recommend_id:" + next.f259659e + "," + "item_count:" + next.f259660f + "," + "footnote_count:" + next.f259661g + "," + "strategy_info:" + next.f259662h + "," + "appid:" + next.f259663i + "," + "page_path:" + next.f259664j + "," + "page_param:" + next.f259665n + "," + "card_type:" + next.f259666o + "," + "pass_str:" + next.f259667p + "," + "},");
            }
        }
        if (linkedList2.size() > 0) {
            Iterator it4 = linkedList2.iterator();
            while (it4.hasNext()) {
                C90406da0 da02 = (C90406da0) it4.next();
                Log.m105919d("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData exposureData:%s", str2 + "username:" + da02.f259454d + "," + "recommend_id:" + da02.f259456f + "," + "count:" + da02.f259455e + "," + "strategy_info:" + da02.f259457g + "," + "expose_millisecond:" + da02.f259458h + "," + "appid:" + da02.f259459i + "," + "page_path:" + da02.f259460j + "," + "page_param:" + da02.f259461n + "," + "card_type:" + da02.f259462o + "," + "pass_str:" + da02.f259463p + "," + "},");
                str2 = str2;
            }
        }
        C86668l lVar3 = lVar2;
        int i = (int) lVar3.f251653a;
        Log.m105918d("MicroMsg.Recommend.AppBrandReportRecommendLogic", "reportReportRecommendWxa");
        Set<Object> set = C84737f0.f247137a;
        C88024r.m109571a().postToWorker(new C89226k(j3, linkedList2, linkedList4, z2 ? 1 : 0, (int) j4, i));
        lVar3.mo121063b();
        mo117375b().f257081i = !mo117375b().mo123547c().isEmpty();
        mo117375b().f257083k = 0;
        C89217f b2 = mo117375b();
        b2.f257074b.f257070b = null;
        b2.f257086n = null;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroyView() {
        this.f246999h.quit();
        this.f247003o.mo117313f();
        C84657x e = mo117376e();
        e.f246976b = null;
        e.f246978d = null;
        mo117377g().mo17098m1(this.f247012x);
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        Log.m105924i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onPause");
        mo117374a(this.f247008t, false);
        C86668l lVar = this.f247004p;
        lVar.getClass();
        lVar.f251655c = (Util.nowSecond() - lVar.f251654b) + lVar.f251655c;
        lVar.f251654b = Util.nowSecond();
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        Log.m105924i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onResume");
        C86668l lVar = this.f247004p;
        lVar.getClass();
        lVar.f251654b = Util.nowSecond();
        Iterator<Integer> it = this.f247008t.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if ((next == null || next.intValue() != 0) && this.f247011w.containsKey(next)) {
                String str = this.f247011w.get(next);
                Long l = this.f247010v.get(str);
                if (!(str == null || l == null)) {
                    this.f247010v.put(str, Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }
}
