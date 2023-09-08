package eg1;

import al1.C54127h;
import al1.C54129i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.plugin.finder.view.C4202w6;
import com.tencent.p014mm.sdk.platformtools.Log;
import dk1.C58312g;
import er1.C58713e5;
import er1.C58730g5;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import o40.C61926c;
import pe3.C89349b;
import qt1.C63329b;
import rx3.C13598b0;
import te3.C49712hj1;
import tf1.C13914m;

/* renamed from: eg1.p */
public final class C58589p extends C4202w6<C58590a> {

    /* renamed from: d */
    public final Fragment f167741d;

    /* renamed from: e */
    public final C54129i f167742e;

    /* renamed from: f */
    public final FinderLiveViewCallback f167743f;

    /* renamed from: g */
    public final C49712hj1 f167744g;

    /* renamed from: h */
    public long f167745h;

    /* renamed from: i */
    public boolean f167746i;

    /* renamed from: j */
    public final String f167747j = "Finder.FinderLiveViewCallback.Adapter";

    /* renamed from: n */
    public final List<FinderLiveVisitorPluginLayout> f167748n = new ArrayList();

    /* renamed from: eg1.p$a */
    public static final class C58590a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58590a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    public C58589p(Fragment fragment, C54129i iVar, boolean z, FinderLiveViewCallback finderLiveViewCallback, C49712hj1 hj12, long j, boolean z2) {
        C87412m.m108594g(iVar, "datas");
        C87412m.m108594g(finderLiveViewCallback, "viewCallback");
        this.f167741d = fragment;
        this.f167742e = iVar;
        this.f167743f = finderLiveViewCallback;
        this.f167744g = hj12;
        this.f167745h = j;
        this.f167746i = z2;
    }

    /* renamed from: F4 */
    public final void mo83486F4(C58590a aVar, boolean z) {
        View view = aVar.f44854d;
        RoundedCornerFrameLayout roundedCornerFrameLayout = view instanceof RoundedCornerFrameLayout ? (RoundedCornerFrameLayout) view : null;
        if (roundedCornerFrameLayout == null) {
            return;
        }
        if (z) {
            roundedCornerFrameLayout.setRadius((float) roundedCornerFrameLayout.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df));
        } else {
            roundedCornerFrameLayout.setRadius(0.0f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.constraintlayout.widget.ConstraintLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83487G4(com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r4, boolean r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0066
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165351(0x7f0700a7, float:1.7944917E38)
            float r0 = r0.getDimension(r1)
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165281(0x7f070061, float:1.7944775E38)
            float r1 = r1.getDimension(r2)
            r2 = 2131304421(0x7f091fe5, float:1.8226984E38)
            android.view.View r4 = r4.findViewById(r2)
            if (r5 == 0) goto L_0x002b
            int r5 = (int) r1
            goto L_0x002c
        L_0x002b:
            int r5 = (int) r0
        L_0x002c:
            r0 = 0
            if (r4 == 0) goto L_0x0034
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            goto L_0x0035
        L_0x0034:
            r1 = r0
        L_0x0035:
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x004e
            if (r4 == 0) goto L_0x0040
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            goto L_0x0041
        L_0x0040:
            r4 = r0
        L_0x0041:
            boolean r1 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r1 == 0) goto L_0x0048
            r0 = r4
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
        L_0x0048:
            if (r0 != 0) goto L_0x004b
            goto L_0x0066
        L_0x004b:
            r0.topMargin = r5
            goto L_0x0066
        L_0x004e:
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L_0x0066
            if (r4 == 0) goto L_0x0059
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            goto L_0x005a
        L_0x0059:
            r4 = r0
        L_0x005a:
            boolean r1 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L_0x0061
            r0 = r4
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
        L_0x0061:
            if (r0 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0.f44466u = r5
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C58589p.mo83487G4(com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout, boolean):void");
    }

    /* renamed from: O4 */
    public final C54127h mo83488O4(int i) {
        if (i >= 0 && i < getItemCount()) {
            return this.f167742e.f151990e.get(i);
        }
        String str = this.f167747j;
        Log.m105924i(str, "getData invalid pos:" + i + '!');
        return null;
    }

    /* renamed from: g5 */
    public final void mo83489g5(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    childAt.animate().cancel();
                    if (childAt.hasTransientState()) {
                        Log.m105924i("RecyclerViewAdapterEx", "[protectViewItemRecycleHealthy] child=" + childAt);
                    }
                    mo83489g5(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    public List<C13914m> getData() {
        return this.f167742e.f151990e;
    }

    public int getItemCount() {
        return this.f167742e.f151990e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        Integer num;
        Object obj;
        C45795b bVar;
        int i2 = i;
        C58590a aVar = (C58590a) zVar;
        C87412m.m108594g(aVar, "vh");
        Log.m105924i(this.f167747j, "onBindViewHolder start");
        C54127h O4 = mo83488O4(i2);
        C45795b Y = FinderLiveService.f159376d.mo77622Y(O4);
        if (O4 != null) {
            C58730g5 g5Var = C58730g5.f168158a;
            C58730g5.m68220e(g5Var, "RV_VISITOR_" + O4.f151977d.f157064e, C58713e5.f168075c.f168101b, (C89349b) null, false, false, false, 60, (Object) null);
        }
        View view = aVar.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        synchronized (this.f167748n) {
            num = null;
            if (((ArrayList) this.f167748n).isEmpty()) {
                Log.m105924i(this.f167747j, "consumeView: item view list is empty, inflate visitor view");
                Context context = viewGroup.getContext();
                C87412m.m108593f(context, "parent.context");
                obj = new FinderLiveVisitorPluginLayout(context, this.f167741d, (AttributeSet) null, this.f167744g);
            } else {
                List<FinderLiveVisitorPluginLayout> list = this.f167748n;
                obj = ((ArrayList) list).remove(((ArrayList) list).size() - 1);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        View view2 = (View) obj;
        view2.setId(C0966R.C0970id.e1m);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.e1m);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        viewGroup.addView(view2, layoutParams);
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = (FinderLiveVisitorPluginLayout) aVar.f44854d.findViewById(C0966R.C0970id.e1m);
        StringBuilder sb = new StringBuilder();
        sb.append("bind view pos:");
        sb.append(i2);
        sb.append(", viewHolder:");
        sb.append(aVar.hashCode());
        sb.append(",pluginLayout:");
        sb.append(finderLiveVisitorPluginLayout.hashCode());
        sb.append(',');
        sb.append(O4 != null ? O4.mo74919c() : null);
        sb.append(", clickLiveId:");
        sb.append(this.f167745h);
        sb.append(", launchWithAnim:");
        sb.append(this.f167746i);
        sb.append(", buContext:");
        if (!(O4 == null || (bVar = O4.f151978e) == null)) {
            num = Integer.valueOf(bVar.hashCode());
        }
        sb.append(num);
        String sb4 = sb.toString();
        Log.m105924i(this.f167747j, sb4);
        C63329b.f179694a.mo88233d(this.f167747j, sb4);
        if (O4 == null || Y == null) {
            Log.m105928w(this.f167747j, "bind view err: data is null!!!");
        } else {
            finderLiveVisitorPluginLayout.bindData(O4);
            View findViewById2 = aVar.f44854d.findViewById(C0966R.C0970id.dqi);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new C58594s(this, i2));
            }
            View findViewById3 = aVar.f44854d.findViewById(C0966R.C0970id.dy6);
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new C58595t(this, i2));
            }
            if (this.f167745h == O4.f151977d.f157064e) {
                if (this.f167746i) {
                    finderLiveVisitorPluginLayout.setAlpha(0.0f);
                } else {
                    finderLiveVisitorPluginLayout.setAlpha(1.0f);
                }
                C45795b bVar2 = C45795b.f123698n;
                if (bVar2 == null || (!((C54991o) bVar2.mo71262a(C54991o.class)).mo75999e4())) {
                    LiveConfig liveConfig = O4.f151977d;
                    FinderLiveVisitorPluginLayout.preloadLive$default(finderLiveVisitorPluginLayout, liveConfig.f157064e, liveConfig.f157072p, Integer.valueOf(liveConfig.f157073q), false, this.f167746i, 8, (Object) null);
                    this.f167745h = 0;
                }
                this.f167746i = false;
            }
            mo83486F4(aVar, true);
            C39818r rVar = C39818r.f106831a;
            Context context2 = finderLiveVisitorPluginLayout.getContext();
            C87412m.m108593f(context2, "pluginLayout.context");
            mo83487G4(finderLiveVisitorPluginLayout, ((C58312g) rVar.mo62443b(context2).mo75002a(C58312g.class)).f166967e);
            C58730g5 g5Var2 = C58730g5.f168158a;
            C58730g5.m68220e(g5Var2, "RV_VISITOR_" + O4.f151977d.f157064e, C58713e5.f168076d.f168101b, (C89349b) null, false, false, false, 60, (Object) null);
        }
        Log.m105924i(this.f167747j, "onBindViewHolder end");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "vg");
        String str = this.f167747j;
        Log.m105924i(str, "onCreateViewHolder type:" + i);
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "vg.context");
        C61926c.m72668M(new C58593r(this, false, context));
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(viewGroup.getContext());
        roundedCornerFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return new C58590a(roundedCornerFrameLayout);
    }

    public void onViewDetachedFromWindow(RecyclerView.C16631z zVar) {
        C58590a aVar = (C58590a) zVar;
        C87412m.m108594g(aVar, "holder");
        String str = this.f167747j;
        Log.m105924i(str, "onViewDetachedFromWindow, " + aVar.hashCode());
        super.onViewDetachedFromWindow(aVar);
        View view = aVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        mo83489g5(view);
    }

    /* renamed from: u5 */
    public final void mo83490u5(boolean z, String str) {
        C87412m.m108594g(str, "from");
        RecyclerView.LayoutManager layoutManager = this.f167743f.f159220q.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int C = linearLayoutManager.mo16957C();
            int E = linearLayoutManager.mo16959E();
            String str2 = this.f167747j;
            Log.m105924i(str2, "sidebar updateCorner " + z + ", from:" + str + ", first:" + C + ", last:" + E);
            if (C >= 0 && E >= 0) {
                notifyItemRangeChanged(C, (E - C) + 1, z ? "PayLoadCorner" : "PayLoadHideCorner");
            }
        }
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C58590a aVar = (C58590a) zVar;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(list, "payloads");
        boolean z = true;
        boolean z2 = false;
        if (list.contains("PayLoadCorner")) {
            String str = this.f167747j;
            Log.m105924i(str, "sidebar updateCorner show, position:" + i);
            mo83486F4(aVar, true);
            z = false;
        }
        if (list.contains("PayLoadHideCorner")) {
            String str2 = this.f167747j;
            Log.m105924i(str2, "sidebar updateCorner hide, position:" + i);
            mo83486F4(aVar, false);
        } else {
            z2 = z;
        }
        if (z2) {
            super.onBindViewHolder(aVar, i, list);
        }
    }
}
