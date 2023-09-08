package ve1;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.FlowTextMixView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C4189u7;
import com.tencent.p014mm.plugin.finder.view.C4190v;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10008v1;
import nj3.C76874e0;
import o40.C61926c;
import qo3.C77407n;
import rs1.C63539a6;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: ve1.f4 */
public final class C14520f4 extends C14592p2 {

    /* renamed from: P */
    public final View f40257P;

    /* renamed from: ve1.f4$a */
    public static final class C14521a implements View.OnClickListener {

        /* renamed from: d */
        public static final C14521a f40258d = new C14521a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderImmersiveVideoConvert$onCreateViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderImmersiveVideoConvert$onCreateViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.f4$b */
    public static final class C14522b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14520f4 f40259d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40260e;

        public C14522b(C14520f4 f4Var, C60905o oVar) {
            this.f40259d = f4Var;
            this.f40260e = oVar;
        }

        public final void run() {
            FinderFeedFullConvert.StateListener stateListener = new FinderFeedFullConvert.StateListener(this.f40259d, this.f40260e);
            stateListener.alive();
            this.f40259d.f12571o.add(stateListener);
        }
    }

    /* renamed from: ve1.f4$c */
    public static final class C14523c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40261d;

        public C14523c(C60905o oVar) {
            this.f40261d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderImmersiveVideoConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f40261d.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C63539a6) rVar.mo62443b(context).mo75002a(C63539a6.class)).mo88402i3(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderImmersiveVideoConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14520f4(View view, FinderVideoCore finderVideoCore, C10008v1 v1Var) {
        super(finderVideoCore, v1Var, false, 0, true, 4, (C8480h) null);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(finderVideoCore, "videoCore");
        C87412m.m108594g(v1Var, "contract");
        this.f40257P = view;
    }

    /* renamed from: S */
    public void mo2282S(C60905o oVar, View view, BaseFinderFeed baseFinderFeed, MotionEvent motionEvent) {
        C55018j0 j0Var = (C55018j0) baseFinderFeed;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(j0Var, "item");
        Log.m105924i("FinderImmersiveVideoConvert", "[onMediaLongClick] feedId=" + C61926c.m72691p(j0Var.getItemId()));
        if (!mo2313q(j0Var)) {
            return;
        }
        if ((j0Var.mo75c() == 4 || j0Var.mo75c() == 2) && !j0Var.mo3479M()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99515s8.mo60266n().intValue() != 1 || this.f12564e.mo2497u0()) {
                view.performHapticFeedback(0, 2);
                mo2272M(oVar, j0Var, view, 3);
                return;
            }
            C77407n nVar = new C77407n(oVar.f173499A, 1, false);
            nVar.f225771i = this.f12564e.mo2570B5(j0Var, nVar);
            nVar.f225782p = this.f12564e.mo2573X2(j0Var, oVar);
            ((C58417y0) C86312j.m106911c(C58417y0.class)).wx0(oVar, j0Var.getItemId(), j0Var.mo3513o());
            C76874e0 e0Var = new C76874e0(oVar.f173499A);
            this.f12564e.mo2570B5(j0Var, nVar).onCreateMMMenu(e0Var);
            if (!Util.isNullOrNil((List) e0Var.f224704d)) {
                view.performHapticFeedback(0, 2);
                nVar.mo107573q();
            }
        }
    }

    /* renamed from: a */
    public View mo13760a(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        return this.f40257P;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C4189u7 u7Var = C4189u7.VIDEO;
        C4190v vVar = new C4190v();
        vVar.f18453a = recyclerView;
        C13598b0 b0Var = C13598b0.f38549a;
        ((FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_)).mo4636b(u7Var, vVar);
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.eah);
        if (weImageView != null) {
            weImageView.setFocusable(false);
            weImageView.setClickable(false);
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.setFloatPlayIcon(weImageView);
            }
        }
        View D = oVar.mo85812D(C0966R.C0970id.e6u);
        D.setPadding(0, 0, 0, (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3736cp));
        D.setBackgroundResource(C0966R.C0969drawable.f5000tl);
        C85875k4.m106189j0(((TextView) oVar.f44854d.findViewById(C0966R.C0970id.bh6)).getPaint(), 0.8f);
        Context context = oVar.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((FlowTextMixView) oVar.f44854d.findViewById(C0966R.C0970id.eam)).setMaxWidth((int) (((float) ((Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels) * 0.36f));
        C14522b bVar = new C14522b(this, oVar);
        if (!C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            oVar.f44854d.post(bVar);
        } else {
            bVar.run();
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.edb);
        if (D2 != null) {
            D2.setOnClickListener(C14521a.f40258d);
            TextView textView = (TextView) D2.findViewById(C0966R.C0970id.idd);
            if (textView != null) {
                textView.setTextSize(1, 12.0f);
            }
            TextView textView2 = (TextView) D2.findViewById(C0966R.C0970id.cut);
            if (textView2 != null) {
                textView2.setTextSize(1, 12.0f);
                textView2.setText(C58784w3.f168295a.mo83962s0());
            }
            TextView textView3 = (TextView) D2.findViewById(C0966R.C0970id.jhv);
            if (textView3 != null) {
                textView3.setTextSize(1, 12.0f);
            }
            TextView textView4 = (TextView) D2.findViewById(C0966R.C0970id.fnp);
            if (textView4 != null) {
                textView4.setTextSize(1, 12.0f);
            }
            TextView textView5 = (TextView) D2.findViewById(C0966R.C0970id.f359286k04);
            if (textView5 != null) {
                textView5.setTextSize(1, 12.0f);
            }
            TextView textView6 = (TextView) D2.findViewById(C0966R.C0970id.bje);
            if (textView6 != null) {
                textView6.setTextSize(1, 12.0f);
            }
        }
        TextView textView7 = (TextView) oVar.mo85812D(C0966R.C0970id.fpi);
        if (textView7 != null) {
            textView7.setTextSize(1, 10.0f);
        }
        View D3 = oVar.mo85812D(C0966R.C0970id.k07);
        if (D3 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D3;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderImmersiveVideoConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderImmersiveVideoConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo2301k(oVar);
    }

    /* renamed from: i0 */
    public void mo2299i0(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C55018j0) baseFinderFeed, "item");
    }

    /* renamed from: j */
    public void mo44e(C60905o oVar, C55018j0 j0Var, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(j0Var, "item");
        super.mo44e(oVar, j0Var, i, i2, z, list);
        oVar.mo85812D(C0966R.C0970id.bjq).setOnClickListener(new C14523c(oVar));
    }

    /* renamed from: n */
    public void mo2307n(C60905o oVar, BaseFinderFeed baseFinderFeed, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C55018j0) baseFinderFeed, "item");
    }
}
