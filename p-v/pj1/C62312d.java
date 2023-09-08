package pj1;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import f50.C58916b;
import f50.C58924d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jq3.C9493c;
import k60.C60979d;
import o40.C61926c;
import oj1.C62033a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11985o;
import pl1.C11990s0;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C64175a0;
import te3.C64890zp2;
import up1.C27696y;

/* renamed from: pj1.d */
public final class C62312d {

    /* renamed from: a */
    public final Context f177128a;

    /* renamed from: b */
    public final int f177129b;

    /* renamed from: c */
    public final RecyclerView f177130c;

    /* renamed from: d */
    public final ArrayList<C62033a> f177131d;

    /* renamed from: e */
    public HashSet<C62313a> f177132e = new HashSet<>();

    /* renamed from: f */
    public final FinderStaggeredGridLayoutManager f177133f;

    /* renamed from: g */
    public final C35516c f177134g;

    /* renamed from: h */
    public MMHandler f177135h;

    /* renamed from: i */
    public final Runnable f177136i;

    /* renamed from: pj1.d$a */
    public static final class C62313a {

        /* renamed from: a */
        public final int f177137a;

        /* renamed from: b */
        public final MultiStreamPreviewView f177138b;

        /* renamed from: c */
        public final C9493c f177139c;

        public C62313a(int i, MultiStreamPreviewView multiStreamPreviewView, C9493c cVar) {
            C87412m.m108594g(multiStreamPreviewView, "view");
            C87412m.m108594g(cVar, "data");
            this.f177137a = i;
            this.f177138b = multiStreamPreviewView;
            this.f177139c = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62313a)) {
                return false;
            }
            C62313a aVar = (C62313a) obj;
            return this.f177137a == aVar.f177137a && C87412m.m108589b(this.f177138b, aVar.f177138b) && C87412m.m108589b(this.f177139c, aVar.f177139c);
        }

        public int hashCode() {
            return (((this.f177137a * 31) + this.f177138b.hashCode()) * 31) + this.f177139c.hashCode();
        }

        public String toString() {
            return "LivePreviewData(pos=" + this.f177137a + ", view=" + this.f177138b + ", data=" + this.f177139c + ')';
        }
    }

    /* renamed from: pj1.d$b */
    public static final class C62314b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62312d f177140d;

        public C62314b(C62312d dVar) {
            this.f177140d = dVar;
        }

        public final void run() {
            Log.m105924i("MultiStreamAutoPlay", "checkAutoPlay autoPlayRunnable doing");
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f177140d.f177133f.mo17394A(iArr);
            this.f177140d.f177133f.mo17395B(iArr2);
            C62312d dVar = this.f177140d;
            dVar.getClass();
            int[] iArr3 = new int[4];
            iArr3[0] = iArr[0];
            iArr3[1] = iArr[1];
            int i = iArr[0];
            Integer valueOf = Integer.valueOf(iArr2[0]);
            int intValue = valueOf.intValue();
            int i2 = iArr2[1];
            if (!(intValue > i2)) {
                valueOf = null;
            }
            if (valueOf != null) {
                i2 = valueOf.intValue();
            }
            Log.m105928w("MultiStreamAutoPlay", "findAutoPlayItem firstVisibleItemIndex: " + i + " lastVisibleItemIndex： " + i2);
            HashMap hashMap = new HashMap();
            if (i <= i2) {
                while (true) {
                    if (dVar.mo87394c(i) == null) {
                        Log.m105928w("MultiStreamAutoPlay", "findAutoPlayItem invalid data = null,  index:" + i);
                    } else {
                        View findViewByPosition = dVar.f177133f.findViewByPosition(i);
                        if (findViewByPosition != null) {
                            Rect rect = new Rect();
                            findViewByPosition.getHitRect(rect);
                            int i3 = rect.top;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            int i4 = rect.bottom;
                            int i5 = dVar.f177129b;
                            if (i4 > i5) {
                                i4 = i5;
                            }
                            hashMap.put(Integer.valueOf(i), Integer.valueOf(i4 - i3));
                            Log.m105928w("MultiStreamAutoPlay", "findAutoPlayItem viewSize index: " + i + " viewSize[index]: " + hashMap.get(Integer.valueOf(i)));
                        }
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            Set entrySet = hashMap.entrySet();
            C87412m.m108593f(entrySet, "viewSize.entries");
            int i6 = 0;
            for (Map.Entry entry : C110818d0.m150943o0(entrySet, new C11941e())) {
                if (i6 < 4) {
                    Object key = entry.getKey();
                    C87412m.m108593f(key, "it.key");
                    iArr3[i6] = ((Number) key).intValue();
                    i6++;
                }
            }
            HashSet<C62313a> hashSet = this.f177140d.f177132e;
            ArrayList<C62313a> arrayList = new ArrayList<>();
            for (T next : hashSet) {
                if (!C110823p.m151008x(iArr3, ((C62313a) next).f177137a)) {
                    arrayList.add(next);
                }
            }
            C62312d dVar2 = this.f177140d;
            for (C62313a aVar : arrayList) {
                dVar2.mo87396e(aVar);
                dVar2.f177132e.remove(aVar);
            }
            C62312d dVar3 = this.f177140d;
            for (int i7 = 0; i7 < 4; i7++) {
                dVar3.mo87392a(iArr3[i7]);
            }
        }
    }

    /* renamed from: pj1.d$c */
    public static final class C62315c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C62312d f177141d;

        /* renamed from: pj1.d$c$a */
        public static final class C62316a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ RecyclerView f177142d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62316a(RecyclerView recyclerView) {
                super(0);
                this.f177142d = recyclerView;
            }

            public Object invoke() {
                this.f177142d.mo17155w1();
                return C13598b0.f38549a;
            }
        }

        public C62315c(C62312d dVar) {
            this.f177141d = dVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            Log.m105924i("MultiStreamAutoPlay", "onScrollStateChanged newState:" + i);
            if (i == 0) {
                C62312d dVar = this.f177141d;
                dVar.getClass();
                Log.m105924i("MultiStreamAutoPlay", "checkAutoPlay");
                dVar.f177135h.removeCallbacks(dVar.f177136i);
                dVar.f177135h.postDelayed(dVar.f177136i, 0);
            } else if (i == 2) {
                C61926c.m72666K(100, new C62316a(recyclerView));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C62312d dVar = this.f177141d;
            RecyclerView.LayoutManager layoutManager = dVar.f177130c.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (FinderStaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            finderStaggeredGridLayoutManager.mo17394A(iArr);
            finderStaggeredGridLayoutManager.mo17395B(iArr2);
            for (int i3 = 0; i3 < 2; i3++) {
                dVar.mo87393b(iArr[i3]);
            }
            for (int i4 = 0; i4 < 2; i4++) {
                dVar.mo87393b(iArr2[i4]);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C62312d(Context context, int i, RecyclerView recyclerView, ArrayList<C62033a> arrayList) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(arrayList, "dataList");
        this.f177128a = context;
        this.f177129b = i;
        this.f177130c = recyclerView;
        this.f177131d = arrayList;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        this.f177133f = (FinderStaggeredGridLayoutManager) layoutManager;
        this.f177134g = new C35516c();
        this.f177135h = new MMHandler(Looper.getMainLooper());
        recyclerView.mo17043c(new C62315c(this));
        this.f177136i = new C62314b(this);
    }

    /* renamed from: a */
    public final void mo87392a(int i) {
        C13598b0 b0Var;
        int i2 = i;
        View findViewByPosition = this.f177133f.findViewByPosition(i2);
        if (findViewByPosition != null) {
            C62033a c = mo87394c(i);
            if (c == null) {
                Log.m105928w("MultiStreamAutoPlay", "checkAutoPlay pos:" + i2 + "  return for data = null");
            } else {
                FrameLayout frameLayout = (FrameLayout) findViewByPosition.findViewById(C0966R.C0970id.fwx);
                if (frameLayout == null) {
                    Log.m105928w("MultiStreamAutoPlay", "checkAutoPlay pos:" + i2 + " return for view:" + findViewByPosition);
                } else {
                    MultiStreamPreviewView multiStreamPreviewView = (MultiStreamPreviewView) frameLayout.findViewWithTag("nearby-live-preview-view-tag");
                    if (multiStreamPreviewView != null) {
                        Log.m105924i("MultiStreamAutoPlay", "getOrCreateLiveView get view:" + multiStreamPreviewView);
                    } else {
                        C35516c cVar = this.f177134g;
                        Context context = this.f177128a;
                        cVar.getClass();
                        C87412m.m108594g(context, "context");
                        MultiStreamPreviewView multiStreamPreviewView2 = (MultiStreamPreviewView) C61926c.m72672Q(cVar.f94974a, C35514a.f94972d);
                        if (multiStreamPreviewView2 != null) {
                            Log.m105924i("FinderLivePlayerViewRecycler", "getOrCreate: get view success, view.hashcode = " + multiStreamPreviewView2.hashCode() + " recycledViews.size = " + cVar.f94974a.size());
                        } else {
                            multiStreamPreviewView2 = new MultiStreamPreviewView(context);
                            cVar.f94975b.add(new WeakReference(multiStreamPreviewView2));
                            Log.m105924i("FinderLivePlayerViewRecycler", "createView view:" + multiStreamPreviewView2);
                        }
                        multiStreamPreviewView = multiStreamPreviewView2;
                        multiStreamPreviewView.setTag("nearby-live-preview-view-tag");
                        frameLayout.addView(multiStreamPreviewView);
                        Log.m105924i("MultiStreamAutoPlay", "getOrCreateLiveView create view:" + multiStreamPreviewView);
                    }
                    if (mo87395d(multiStreamPreviewView)) {
                        Log.m105920e("MultiStreamAutoPlay", "checkAutoPlay pos:" + i2 + " isCurPlayerView true , data: " + c + " set:" + this.f177132e.size());
                    } else {
                        this.f177132e.add(new C62313a(i2, multiStreamPreviewView, c));
                        Class cls = C11990s0.class;
                        Class<C60200t1> cls2 = C60200t1.class;
                        multiStreamPreviewView.f159480g = c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("startPlay: ");
                        sb.append(multiStreamPreviewView.f159477d);
                        sb.append(" hashCode: ");
                        C58924d dVar = multiStreamPreviewView.f159477d;
                        sb.append(dVar != null ? dVar.hashCode() : 0);
                        Log.m105924i("MultiStreamPreviewView", sb.toString());
                        ImageView imageView = multiStreamPreviewView.f159479f;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                            TXCloudVideoView tXCloudVideoView = multiStreamPreviewView.f159478e;
                            if (tXCloudVideoView != null) {
                                tXCloudVideoView.removeVideoView();
                                TXCloudVideoView tXCloudVideoView2 = multiStreamPreviewView.f159478e;
                                if (tXCloudVideoView2 != null) {
                                    tXCloudVideoView2.addVideoView(new TextureView(multiStreamPreviewView.getContext()));
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("start player: ");
                                    sb4.append(multiStreamPreviewView.f159477d);
                                    sb4.append(" hashCode: ");
                                    C58924d dVar2 = multiStreamPreviewView.f159477d;
                                    sb4.append(dVar2 != null ? dVar2.hashCode() : 0);
                                    Log.m105924i("MultiStreamPreviewView", sb4.toString());
                                    C64890zp2 zp22 = c.f176353f;
                                    if (zp22 != null && zp22.f186801V >= zp22.f186802W) {
                                        C58924d dVar3 = multiStreamPreviewView.f159477d;
                                        if (dVar3 != null) {
                                            ((C58916b) dVar3).setRenderMode(1);
                                        }
                                    } else {
                                        C58924d dVar4 = multiStreamPreviewView.f159477d;
                                        if (dVar4 != null) {
                                            ((C58916b) dVar4).setRenderMode(0);
                                        }
                                    }
                                    C58924d dVar5 = multiStreamPreviewView.f159477d;
                                    if (dVar5 != null) {
                                        TXCloudVideoView tXCloudVideoView3 = multiStreamPreviewView.f159478e;
                                        if (tXCloudVideoView3 != null) {
                                            ((C58916b) dVar5).setPlayerView(tXCloudVideoView3);
                                        } else {
                                            C87412m.m108603p("videoView");
                                            throw null;
                                        }
                                    }
                                    C58924d dVar6 = multiStreamPreviewView.f159477d;
                                    if (dVar6 != null) {
                                        ((C58916b) dVar6).setPlayListener(new MultiStreamPreviewView.C55949a());
                                    }
                                    C58924d dVar7 = multiStreamPreviewView.f159477d;
                                    if (dVar7 != null) {
                                        ((C58916b) dVar7).mo84115f(c.f176352e, 1, c.f176353f);
                                    }
                                    C39818r rVar = C39818r.f106831a;
                                    C60979d<C100810g0> j2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11873j2();
                                    C11985o oVar = new C11985o(c.f176351d, C27696y.THUMB_IMAGE);
                                    ImageView imageView2 = multiStreamPreviewView.f159479f;
                                    if (imageView2 != null) {
                                        j2.mo85957c(oVar, imageView2, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                                    } else {
                                        C87412m.m108603p("bgView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("videoView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("videoView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("bgView");
                            throw null;
                        }
                    }
                }
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w("MultiStreamAutoPlay", "checkAutoPlayInternal invalid pos:" + i2 + " view:" + findViewByPosition);
        }
    }

    /* renamed from: b */
    public final void mo87393b(int i) {
        View findViewByPosition = this.f177133f.findViewByPosition(i);
        if (findViewByPosition != null) {
            int i2 = this.f177133f.f44894h;
            Rect rect = new Rect();
            findViewByPosition.getGlobalVisibleRect(rect);
            if ((((float) (i2 == 0 ? rect.width() : rect.height())) * 1.0f) / ((float) (i2 == 0 ? findViewByPosition.getWidth() : findViewByPosition.getHeight())) < 0.5f) {
                MultiStreamPreviewView multiStreamPreviewView = (MultiStreamPreviewView) findViewByPosition.findViewWithTag("nearby-live-preview-view-tag");
                if (multiStreamPreviewView != null ? mo87395d(multiStreamPreviewView) : false) {
                    Log.m105924i("MultiStreamAutoPlay", "stopCurrentView: pos");
                    this.f177135h.removeCallbacks(this.f177136i);
                    HashSet<C62313a> hashSet = this.f177132e;
                    ArrayList arrayList = new ArrayList();
                    Iterator<C62313a> it = hashSet.iterator();
                    while (it.hasNext()) {
                        C62313a next = it.next();
                        if (next.f177137a == i) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        mo87396e((C62313a) it4.next());
                    }
                    C64175a0.m75511s(this.f177132e, new C62317f(i));
                }
            }
        }
    }

    /* renamed from: c */
    public final C62033a mo87394c(int i) {
        if (i >= 0 && i < this.f177131d.size()) {
            return this.f177131d.get(i);
        }
        Log.m105928w("MultiStreamAutoPlay", "getFeedByPos return for invalid pos:" + i);
        return null;
    }

    /* renamed from: d */
    public final boolean mo87395d(MultiStreamPreviewView multiStreamPreviewView) {
        T t;
        Iterator<T> it = this.f177132e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C62313a) t).f177138b, multiStreamPreviewView)) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: e */
    public final void mo87396e(C62313a aVar) {
        aVar.f177138b.mo77684b();
        ViewParent parent = aVar.f177138b.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(aVar.f177138b);
        }
        C35516c cVar = this.f177134g;
        MultiStreamPreviewView multiStreamPreviewView = aVar.f177138b;
        cVar.getClass();
        C87412m.m108594g(multiStreamPreviewView, "view");
        if (multiStreamPreviewView.getParent() != null) {
            ViewParent parent2 = multiStreamPreviewView.getParent();
            C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(multiStreamPreviewView);
        }
        C58924d dVar = multiStreamPreviewView.f159477d;
        boolean z = false;
        if (dVar != null && ((C58916b) dVar).isPlaying()) {
            multiStreamPreviewView.mo77684b();
        }
        cVar.f94974a.add(multiStreamPreviewView);
        StringBuilder sb = new StringBuilder();
        sb.append("recycleView view:");
        sb.append(multiStreamPreviewView);
        sb.append(" isPlaying:");
        C58924d dVar2 = multiStreamPreviewView.f159477d;
        if (dVar2 != null && ((C58916b) dVar2).isPlaying()) {
            z = true;
        }
        sb.append(z);
        sb.append(" size:");
        sb.append(cVar.f94974a.size());
        Log.m105924i("FinderLivePlayerViewRecycler", sb.toString());
    }
}
