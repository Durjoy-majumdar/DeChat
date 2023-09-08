package aa2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import ba2.C39748b;
import ba2.C39749d;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NotifyMulitTaskIconShowEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105050r;
import com.tencent.p014mm.plugin.multitask.C105918j;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.MinusScreenGridLayoutConfig$getItemConvertFactory$1;
import com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.MinusScreenGridLayoutManager;
import com.tencent.p014mm.plugin.multitask.p079ui.panel.MinusScreenPanel;
import com.tencent.p014mm.plugin.multitask.p079ui.panel.MultiTaskCoordinatorLayout;
import com.tencent.p014mm.plugin.multitask.p079ui.panel.OverScrollMultiTaskRecyclerView;
import com.tencent.p014mm.plugin.multitask.p079ui.panel.OverScrollMultiTaskVerticalBehavior;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import m92.C61444a;
import m92.C99797b;
import n92.C117617a;
import o40.C61926c;
import p640ox.C77049b;
import p646pn.C110234e;
import p92.C117994a;
import p92.C117997g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import t92.C64212a;
import t92.C64214c;
import t92.C64215d;
import te3.C101828pe0;
import te3.C110964i13;
import te3.C64357f43;
import te3.C64459j13;
import te3.C90416i5;
import te3.i25;
import u92.C65238a;
import v92.C65558a;
import w92.C65943a;
import xv0.C112184g;
import z04.C112550d0;

/* renamed from: aa2.c */
public final class C112765c extends C117997g implements C112184g {

    /* renamed from: d */
    public final int f337653d = 100;

    /* renamed from: e */
    public final long f337654e = 1000;

    /* renamed from: f */
    public long f337655f;

    /* renamed from: g */
    public volatile boolean f337656g;

    /* renamed from: h */
    public final ArrayList<C65558a> f337657h;

    /* renamed from: i */
    public final Rect f337658i;

    /* renamed from: j */
    public WxRecyclerView f337659j;

    /* renamed from: n */
    public MultiTaskCoordinatorLayout f337660n;

    /* renamed from: o */
    public TextView f337661o;

    /* renamed from: p */
    public ImageView f337662p;

    /* renamed from: q */
    public View f337663q;

    /* renamed from: r */
    public C112766a f337664r;

    /* renamed from: s */
    public final C13601g f337665s;

    /* renamed from: t */
    public C64212a f337666t;

    /* renamed from: u */
    public WxRecyclerAdapter<C65558a> f337667u;

    /* renamed from: v */
    public int f337668v;

    /* renamed from: w */
    public Point f337669w;

    /* renamed from: x */
    public final Handler f337670x;

    /* renamed from: y */
    public final C112767b f337671y;

    /* renamed from: z */
    public final C112770c f337672z;

    /* renamed from: aa2.c$d */
    public static final class C53993d extends C87413o implements C32224a<RecyclerView.LayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ C112765c f151260d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f151261e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53993d(C112765c cVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f151260d = cVar;
            this.f151261e = appCompatActivity;
        }

        public Object invoke() {
            C64212a aVar = this.f151260d.f337666t;
            AppCompatActivity appCompatActivity = this.f151261e;
            C64215d dVar = (C64215d) aVar;
            dVar.getClass();
            C87412m.m108594g(appCompatActivity, "context");
            MinusScreenGridLayoutManager minusScreenGridLayoutManager = new MinusScreenGridLayoutManager(appCompatActivity, dVar.f181995c);
            minusScreenGridLayoutManager.f44666B = new C64214c();
            minusScreenGridLayoutManager.setItemPrefetchEnabled(true);
            return minusScreenGridLayoutManager;
        }
    }

    /* renamed from: aa2.c$a */
    public interface C112766a {
        /* renamed from: a */
        void mo164525a(MultiTaskInfo multiTaskInfo, int i);

        /* renamed from: b */
        void mo164526b(View view, View view2, int i, MultiTaskInfo multiTaskInfo, boolean z);

        /* renamed from: c */
        void mo164527c(MultiTaskInfo multiTaskInfo, int i);
    }

    /* renamed from: aa2.c$b */
    public static final class C112767b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C112765c f337673a;

        /* renamed from: aa2.c$b$a */
        public static final class C112768a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112765c f337674d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView.C16616j f337675e;

            public C112768a(C112765c cVar, RecyclerView.C16616j jVar) {
                this.f337674d = cVar;
                this.f337675e = jVar;
            }

            public final void run() {
                WxRecyclerView wxRecyclerView = this.f337674d.f337659j;
                if (wxRecyclerView != null) {
                    wxRecyclerView.setItemAnimator(this.f337675e);
                }
            }
        }

        /* renamed from: aa2.c$b$b */
        public static final class C112769b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112765c f337676d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView.C16616j f337677e;

            public C112769b(C112765c cVar, RecyclerView.C16616j jVar) {
                this.f337676d = cVar;
                this.f337677e = jVar;
            }

            public final void run() {
                WxRecyclerView wxRecyclerView = this.f337676d.f337659j;
                if (wxRecyclerView != null) {
                    wxRecyclerView.setItemAnimator(this.f337677e);
                }
            }
        }

        public C112767b(C112765c cVar) {
            this.f337673a = cVar;
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            WxRecyclerView wxRecyclerView = this.f337673a.f337659j;
            RecyclerView.C16616j itemAnimator = wxRecyclerView != null ? wxRecyclerView.getItemAnimator() : null;
            if (itemAnimator != null) {
                C112765c cVar = this.f337673a;
                Log.m105928w("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "originItemAnimator=" + itemAnimator);
                WxRecyclerView wxRecyclerView2 = cVar.f337659j;
                if (wxRecyclerView2 != null) {
                    wxRecyclerView2.setItemAnimator((RecyclerView.C16616j) null);
                }
                cVar.f337670x.removeCallbacksAndMessages((Object) null);
                cVar.f337670x.postDelayed(new C112768a(cVar, itemAnimator), itemAnimator.f44810f + ((long) 60));
            }
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            WxRecyclerView wxRecyclerView = this.f337673a.f337659j;
            RecyclerView.C16616j itemAnimator = wxRecyclerView != null ? wxRecyclerView.getItemAnimator() : null;
            if (itemAnimator != null) {
                C112765c cVar = this.f337673a;
                Log.m105928w("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "originItemAnimator=" + itemAnimator);
                WxRecyclerView wxRecyclerView2 = cVar.f337659j;
                if (wxRecyclerView2 != null) {
                    wxRecyclerView2.setItemAnimator((RecyclerView.C16616j) null);
                }
                cVar.f337670x.removeCallbacksAndMessages((Object) null);
                cVar.f337670x.postDelayed(new C112769b(cVar, itemAnimator), itemAnimator.f44810f + ((long) 60));
            }
            mo2557c(i, i2);
        }
    }

    /* renamed from: aa2.c$c */
    public static final class C112770c implements C65943a {

        /* renamed from: a */
        public final /* synthetic */ C112765c f337678a;

        public C112770c(C112765c cVar) {
            this.f337678a = cVar;
        }

        /* JADX WARNING: type inference failed for: r10v2, types: [android.view.View] */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r1 = r1.getAdapter();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo89980a(androidx.recyclerview.widget.RecyclerView.C16631z r10) {
            /*
                r9 = this;
                java.lang.String r0 = "viewHolder"
                gy3.C87412m.m108594g(r10, r0)
                aa2.c r0 = r9.f337678a
                r0.getClass()
                com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f337659j
                r2 = 0
                if (r1 == 0) goto L_0x001b
                androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
                if (r1 == 0) goto L_0x001b
                int r1 = r1.getItemCount()
                goto L_0x001c
            L_0x001b:
                r1 = 0
            L_0x001c:
                r3 = 3
                r4 = 2131309657(0x7f093459, float:1.8237604E38)
                r5 = 2131309662(0x7f09345e, float:1.8237614E38)
                r6 = 0
                if (r1 > r3) goto L_0x004c
                android.view.View r0 = r10.f44854d
                android.view.View r0 = r0.findViewById(r5)
                android.view.View r10 = r10.f44854d
                android.view.View r10 = r10.findViewById(r4)
                if (r0 == 0) goto L_0x00b6
                if (r10 == 0) goto L_0x00b6
                r1 = 0
                r0.setTranslationY(r1)
                boolean r0 = r10 instanceof com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout
                if (r0 == 0) goto L_0x0041
                r6 = r10
                com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout r6 = (com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout) r6
            L_0x0041:
                if (r6 == 0) goto L_0x00b6
                com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout r10 = (com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout) r10
                r10.f162965h = r2
                r10.invalidate()
                goto L_0x00b6
            L_0x004c:
                com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f337659j
                if (r1 == 0) goto L_0x0055
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
                goto L_0x0056
            L_0x0055:
                r1 = r6
            L_0x0056:
                boolean r3 = r1 instanceof com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.MinusScreenGridLayoutManager
                if (r3 == 0) goto L_0x005d
                com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager r1 = (com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.MinusScreenGridLayoutManager) r1
                goto L_0x005e
            L_0x005d:
                r1 = r6
            L_0x005e:
                if (r1 == 0) goto L_0x00b6
                int r1 = r1.mo16957C()
                android.view.View r3 = r10.f44854d
                android.view.View r3 = r3.findViewById(r5)
                android.view.View r5 = r10.f44854d
                r7 = 2131309660(0x7f09345c, float:1.823761E38)
                android.view.View r5 = r5.findViewById(r7)
                if (r3 == 0) goto L_0x00b6
                if (r5 == 0) goto L_0x00b6
                android.graphics.Rect r7 = r0.f337658i
                r5.getLocalVisibleRect(r7)
                int r5 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346682S
                android.graphics.Rect r0 = r0.f337658i
                int r0 = r0.height()
                int r5 = r5 - r0
                float r0 = (float) r5
                int r7 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346682S
                float r7 = (float) r7
                r8 = 1061997773(0x3f4ccccd, float:0.8)
                float r7 = r7 * r8
                int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r0 > 0) goto L_0x009c
                int r0 = r10.mo17363j()
                int r1 = r1 + 1
                if (r0 <= r1) goto L_0x009b
                goto L_0x009c
            L_0x009b:
                r2 = r5
            L_0x009c:
                float r0 = (float) r2
                r3.setTranslationY(r0)
                android.view.View r10 = r10.f44854d
                android.view.View r10 = r10.findViewById(r4)
                boolean r0 = r10 instanceof com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout
                if (r0 == 0) goto L_0x00ad
                r6 = r10
                com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout r6 = (com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout) r6
            L_0x00ad:
                if (r6 == 0) goto L_0x00b6
                com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout r10 = (com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout) r10
                r10.f162965h = r2
                r10.invalidate()
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aa2.C112765c.C112770c.mo89980a(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* renamed from: b */
        public void mo89981b(C65558a aVar, C60905o oVar) {
            MultiTaskInfo multiTaskInfo;
            String str;
            C87412m.m108594g(oVar, "holder");
            if (aVar != null && (multiTaskInfo = aVar.f188631d) != null) {
                C112765c cVar = this.f337678a;
                ((C105923s) C86312j.m106911c(C105923s.class)).mo151020Ub(multiTaskInfo.field_id);
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).mo72346DT(context, 5);
                if (i132 != null) {
                    long G3 = (long) cVar.mo164517G3(aVar.f188631d.field_id);
                    Log.m105919d("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "Item deleted!, itemId: %s, pos: %s", aVar.f188631d.field_id, Long.valueOf(G3));
                    String str2 = i132.f332061h;
                    if (aVar.f188631d.field_type == 2) {
                        i25 i25 = new i25();
                        try {
                            i25.parseFrom(aVar.f188631d.field_data);
                        } catch (Exception unused) {
                        }
                        str = i25.f135051e;
                    } else {
                        str = str2;
                    }
                    C117617a.f351848a.mo182341c(aVar.f188631d, i132.f332057d, G3, 3, str);
                }
            }
        }

        /* renamed from: c */
        public void mo89982c() {
            WxRecyclerView wxRecyclerView;
            C112765c cVar = this.f337678a;
            WxRecyclerView wxRecyclerView2 = cVar.f337659j;
            MinusScreenGridLayoutManager minusScreenGridLayoutManager = null;
            RecyclerView.LayoutManager layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
            if (layoutManager instanceof MinusScreenGridLayoutManager) {
                minusScreenGridLayoutManager = (MinusScreenGridLayoutManager) layoutManager;
            }
            if (minusScreenGridLayoutManager != null && (wxRecyclerView = cVar.f337659j) != null) {
                cVar.mo164516F3(wxRecyclerView, minusScreenGridLayoutManager);
            }
        }
    }

    /* renamed from: aa2.c$e */
    public static final class C112771e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskInfo f337679d;

        /* renamed from: e */
        public final /* synthetic */ C112765c f337680e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112771e(MultiTaskInfo multiTaskInfo, C112765c cVar) {
            super(0);
            this.f337679d = multiTaskInfo;
            this.f337680e = cVar;
        }

        public Object invoke() {
            MultiTaskInfo multiTaskInfo = this.f337679d;
            if (multiTaskInfo != null) {
                C112765c cVar = this.f337680e;
                cVar.f337657h.add(0, new C65558a(multiTaskInfo));
                WxRecyclerAdapter<C65558a> wxRecyclerAdapter = cVar.f337667u;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemInserted(wxRecyclerAdapter.mo85796c6());
                }
                if (cVar.f337657h.size() == 1) {
                    cVar.mo164520K3(cVar.f337657h.get(0).f188631d, false, true);
                } else {
                    cVar.mo164520K3((MultiTaskInfo) null, true, false);
                }
                WxRecyclerView wxRecyclerView = cVar.f337659j;
                if (wxRecyclerView != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$onMultiTaskChange$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                    wxRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$onMultiTaskChange$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
                cVar.mo164522m3();
                try {
                    int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitask_max_item_num, cVar.f337653d);
                    if (cVar.f337657h.size() > Qe) {
                        int size = cVar.f337657h.size();
                        for (int i = Qe; i < size; i++) {
                            C65558a aVar2 = cVar.f337657h.get(i);
                            C87412m.m108593f(aVar2, "multiTaskInfoList[i]");
                            ((C105923s) C86312j.m106911c(C105923s.class)).mo151020Ub(aVar2.f188631d.field_id);
                        }
                    }
                    Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "maxNum: " + Qe + ", curSize: " + cVar.f337657h.size());
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "remove last multitask info error: %s", e.getMessage());
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: aa2.c$f */
    public static final class C112772f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskInfo f337681d;

        /* renamed from: e */
        public final /* synthetic */ C112765c f337682e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112772f(MultiTaskInfo multiTaskInfo, C112765c cVar) {
            super(0);
            this.f337681d = multiTaskInfo;
            this.f337682e = cVar;
        }

        public Object invoke() {
            C112765c cVar;
            int G3;
            MultiTaskInfo multiTaskInfo = this.f337681d;
            if (multiTaskInfo != null && (G3 = cVar.mo164517G3(multiTaskInfo.field_id)) >= 0) {
                (cVar = this.f337682e).f337657h.remove(G3);
                WxRecyclerAdapter<C65558a> wxRecyclerAdapter = cVar.f337667u;
                int c6 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.mo85796c6() : 1) + G3;
                WxRecyclerAdapter<C65558a> wxRecyclerAdapter2 = cVar.f337667u;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemRemoved(c6);
                }
                if (cVar.f337657h.size() == 1) {
                    cVar.mo164520K3(cVar.f337657h.get(0).f188631d, false, false);
                } else {
                    cVar.mo164520K3((MultiTaskInfo) null, true, false);
                }
                cVar.mo164522m3();
                C112766a aVar = cVar.f337664r;
                if (aVar != null) {
                    aVar.mo164527c(multiTaskInfo, G3);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: aa2.c$g */
    public static final class C112773g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskInfo f337683d;

        /* renamed from: e */
        public final /* synthetic */ C112765c f337684e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112773g(MultiTaskInfo multiTaskInfo, C112765c cVar) {
            super(0);
            this.f337683d = multiTaskInfo;
            this.f337684e = cVar;
        }

        public Object invoke() {
            C112765c cVar;
            int G3;
            MultiTaskInfo multiTaskInfo = this.f337683d;
            if (multiTaskInfo != null && (G3 = cVar.mo164517G3(multiTaskInfo.field_id)) >= 0) {
                (cVar = this.f337684e).f337657h.set(G3, new C65558a(multiTaskInfo));
                WxRecyclerAdapter<C65558a> wxRecyclerAdapter = cVar.f337667u;
                int c6 = G3 + (wxRecyclerAdapter != null ? wxRecyclerAdapter.mo85796c6() : 1);
                WxRecyclerAdapter<C65558a> wxRecyclerAdapter2 = cVar.f337667u;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemChanged(c6);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112765c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ArrayList<C65558a> arrayList = new ArrayList<>();
        this.f337657h = arrayList;
        this.f337658i = new Rect();
        this.f337665s = C36568h.m40985a(new C53993d(this, appCompatActivity));
        this.f337666t = new C64215d(arrayList, 0, 2, (C8480h) null);
        this.f337668v = -1;
        this.f337669w = new Point();
        this.f337670x = new Handler(Looper.getMainLooper());
        this.f337671y = new C112767b(this);
        this.f337672z = new C112770c(this);
    }

    /* renamed from: B */
    public void mo145544B(List<BallInfo> list, BallInfo ballInfo) {
        C87412m.m108594g(list, "ballInfoList");
        Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "dataChanged");
        mo164524o3();
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164516F3(androidx.recyclerview.widget.RecyclerView r12, com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.MinusScreenGridLayoutManager r13) {
        /*
            r11 = this;
            java.lang.String r0 = "recyclerView"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "layoutManager"
            gy3.C87412m.m108594g(r13, r0)
            int r0 = r13.getItemCount()
            r1 = 3
            if (r0 > r1) goto L_0x0012
            return
        L_0x0012:
            int r0 = r13.mo16957C()
            int r1 = r13.mo16959E()
            if (r0 > r1) goto L_0x008f
            r2 = r0
        L_0x001d:
            r3 = 0
            androidx.recyclerview.widget.RecyclerView$z r4 = r12.mo17024J0(r2, r3)
            boolean r5 = r4 instanceof jq3.C60905o
            r6 = 0
            if (r5 == 0) goto L_0x002a
            jq3.o r4 = (jq3.C60905o) r4
            goto L_0x002b
        L_0x002a:
            r4 = r6
        L_0x002b:
            if (r4 == 0) goto L_0x008a
            android.view.View r5 = r4.f44854d
            r7 = 2131309662(0x7f09345e, float:1.8237614E38)
            android.view.View r5 = r5.findViewById(r7)
            android.view.View r7 = r4.f44854d
            r8 = 2131309660(0x7f09345c, float:1.823761E38)
            android.view.View r7 = r7.findViewById(r8)
            if (r5 == 0) goto L_0x008a
            if (r7 == 0) goto L_0x008a
            android.graphics.Rect r8 = r11.f337658i
            r7.getLocalVisibleRect(r8)
            int r7 = r13.getItemCount()
            r8 = 2
            if (r7 != r8) goto L_0x0052
            int r7 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346685U
            goto L_0x0054
        L_0x0052:
            int r7 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346682S
        L_0x0054:
            android.graphics.Rect r8 = r11.f337658i
            int r8 = r8.height()
            int r8 = r7 - r8
            float r9 = (float) r8
            float r7 = (float) r7
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            float r7 = r7 * r10
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x006d
            int r7 = r0 + 1
            if (r2 <= r7) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r3 = r8
        L_0x006d:
            float r7 = (float) r3
            r5.setTranslationY(r7)
            android.view.View r4 = r4.f44854d
            r5 = 2131309657(0x7f093459, float:1.8237604E38)
            android.view.View r4 = r4.findViewById(r5)
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout
            if (r5 == 0) goto L_0x0081
            r6 = r4
            com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout r6 = (com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout) r6
        L_0x0081:
            if (r6 == 0) goto L_0x008a
            com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout r4 = (com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout) r4
            r4.f162965h = r3
            r4.invalidate()
        L_0x008a:
            if (r2 == r1) goto L_0x008f
            int r2 = r2 + 1
            goto L_0x001d
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa2.C112765c.mo164516F3(androidx.recyclerview.widget.RecyclerView, com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager):void");
    }

    /* renamed from: G3 */
    public final int mo164517G3(String str) {
        if (str == null) {
            return -1;
        }
        int i = 0;
        for (T next : this.f337657h) {
            int i2 = i + 1;
            if (i < 0) {
                C64197v.m75542k();
                throw null;
            } else if (C87412m.m108589b(((C65558a) next).f188631d.field_id, str)) {
                return i;
            } else {
                i = i2;
            }
        }
        return -1;
    }

    /* renamed from: I3 */
    public final void mo164518I3(View view, float f, float f2) {
        float f3 = 0.0f;
        if (f >= 0.5f) {
            float f4 = (f - 0.5f) / 0.5f;
            if (f4 >= 0.0f) {
                f3 = f4 > 1.0f ? 1.0f : f4;
            }
            ImageView imageView = this.f337662p;
            if (imageView != null) {
                imageView.setAlpha(f3);
            }
            TextView textView = this.f337661o;
            if (textView != null) {
                textView.setAlpha(f3);
            }
        } else {
            ImageView imageView2 = this.f337662p;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
            }
            TextView textView2 = this.f337661o;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
        }
        MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = this.f337660n;
        if (multiTaskCoordinatorLayout != null) {
            MultiTaskUIC.C115597a aVar = MultiTaskUIC.f346667E;
            int i = MultiTaskUIC.f346692x0;
            multiTaskCoordinatorLayout.setTranslationX(((float) (-i)) + (((float) i) * f2));
        }
    }

    /* renamed from: J3 */
    public final void mo164519J3() {
        int C;
        int E;
        View findViewById;
        RecyclerView.C16613e adapter;
        WxRecyclerView wxRecyclerView = this.f337659j;
        RecyclerView.LayoutManager layoutManager = wxRecyclerView != null ? wxRecyclerView.getLayoutManager() : null;
        MinusScreenGridLayoutManager minusScreenGridLayoutManager = layoutManager instanceof MinusScreenGridLayoutManager ? (MinusScreenGridLayoutManager) layoutManager : null;
        if (minusScreenGridLayoutManager != null && (C = minusScreenGridLayoutManager.mo16957C()) <= (E = minusScreenGridLayoutManager.mo16959E())) {
            while (true) {
                WxRecyclerView wxRecyclerView2 = this.f337659j;
                int i = 0;
                RecyclerView.C16631z J0 = wxRecyclerView2 != null ? wxRecyclerView2.mo17024J0(C, false) : null;
                C60905o oVar = J0 instanceof C60905o ? (C60905o) J0 : null;
                if (oVar != null) {
                    WxRecyclerView wxRecyclerView3 = this.f337659j;
                    if (!(wxRecyclerView3 == null || (adapter = wxRecyclerView3.getAdapter()) == null)) {
                        i = adapter.getItemCount();
                    }
                    Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "refreshLayout itemCount:" + i + ", pos:" + C);
                    if (i == 2) {
                        View findViewById2 = oVar.f44854d.findViewById(C0966R.C0970id.fa8);
                        if (findViewById2 != null) {
                            MultiTaskUIC.C115597a aVar = MultiTaskUIC.f346667E;
                            findViewById2.setTranslationX((float) MultiTaskUIC.f346687W);
                            findViewById2.setTranslationY((float) MultiTaskUIC.f346686V);
                            findViewById2.getLayoutParams().height = MultiTaskUIC.f346678Q;
                            findViewById2.getLayoutParams().width = MultiTaskUIC.f346677P;
                            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) oVar.f44854d.findViewById(C0966R.C0970id.h3h);
                            if (roundedCornerFrameLayout != null) {
                                roundedCornerFrameLayout.getLayoutParams().height = MultiTaskUIC.f346685U;
                            }
                            findViewById2.requestLayout();
                        }
                    } else if (i == 3) {
                        View findViewById3 = oVar.f44854d.findViewById(C0966R.C0970id.fa8);
                        if (findViewById3 != null) {
                            MultiTaskUIC.C115597a aVar2 = MultiTaskUIC.f346667E;
                            findViewById3.setTranslationY((float) MultiTaskUIC.f346688X);
                            findViewById3.getLayoutParams().height = MultiTaskUIC.f346676N;
                            findViewById3.getLayoutParams().width = MultiTaskUIC.f346675M;
                            RoundedCornerFrameLayout roundedCornerFrameLayout2 = (RoundedCornerFrameLayout) oVar.f44854d.findViewById(C0966R.C0970id.h3h);
                            if (roundedCornerFrameLayout2 != null) {
                                roundedCornerFrameLayout2.getLayoutParams().height = MultiTaskUIC.f346682S;
                            }
                            findViewById3.requestLayout();
                        }
                    } else if (i >= 4 && (findViewById = oVar.f44854d.findViewById(C0966R.C0970id.fa8)) != null) {
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        MultiTaskUIC.C115597a aVar3 = MultiTaskUIC.f346667E;
                        layoutParams.height = MultiTaskUIC.f346676N;
                        findViewById.getLayoutParams().width = MultiTaskUIC.f346675M;
                        RoundedCornerFrameLayout roundedCornerFrameLayout3 = (RoundedCornerFrameLayout) oVar.f44854d.findViewById(C0966R.C0970id.h3h);
                        if (roundedCornerFrameLayout3 != null) {
                            roundedCornerFrameLayout3.getLayoutParams().height = MultiTaskUIC.f346682S;
                        }
                        findViewById.requestLayout();
                    }
                }
                if (C != E) {
                    C++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: K3 */
    public final boolean mo164520K3(MultiTaskInfo multiTaskInfo, boolean z, boolean z2) {
        C117997g e;
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        Class cls = MultiTaskUIC.class;
        int size = this.f337657h.size();
        int i = -1;
        if (size <= 0) {
            MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = this.f337660n;
            if (multiTaskCoordinatorLayout != null) {
                int i2 = MultiTaskCoordinatorLayout.f315160I;
                multiTaskCoordinatorLayout.setMode(-1);
            }
        } else if (size == 1) {
            MultiTaskCoordinatorLayout multiTaskCoordinatorLayout2 = this.f337660n;
            if (multiTaskCoordinatorLayout2 != null) {
                int i3 = MultiTaskCoordinatorLayout.f315160I;
                multiTaskCoordinatorLayout2.setMode(0);
            }
        } else {
            MultiTaskCoordinatorLayout multiTaskCoordinatorLayout3 = this.f337660n;
            if (multiTaskCoordinatorLayout3 != null) {
                int i4 = MultiTaskCoordinatorLayout.f315160I;
                multiTaskCoordinatorLayout3.setMode(1);
            }
        }
        C39818r rVar = C39818r.f106831a;
        MinusScreenPanel minusScreenPanel = ((MultiTaskUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).f346700f;
        if (minusScreenPanel == null || (e = minusScreenPanel.mo183762e(1048576, "MultiTaskForSnapshotMinusScreen")) == null || !(e instanceof C103343n)) {
            return false;
        }
        C103343n nVar = (C103343n) e;
        Class cls2 = C32735h.class;
        nVar.f304739e = multiTaskInfo2;
        MultiTaskUIC multiTaskUIC = (MultiTaskUIC) rVar.mo62444c(nVar.getActivity()).mo75002a(cls);
        if (multiTaskInfo2 != null) {
            i = multiTaskInfo2.field_type;
        }
        if (multiTaskUIC.mo175707c3(i)) {
            Log.m105925i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, teenmode!, forceShow:%b", Boolean.valueOf(z2));
            return false;
        }
        boolean z3 = MultiProcessMMKV.getMMKV("multitask_tips_config").getBoolean("multitask_first_enter", false);
        Log.m105924i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskFirstEnter, flag: " + z3);
        if (!z3 && size == 1) {
            return false;
        }
        if (size == 1) {
            if (BuildInfo.IS_FLAVOR_RED ? true : ((C32735h) C86312j.m106911c(cls2)).mo58784wf(C32735h.C32737c.clicfg_multitask_fullscreen_mode, true)) {
                if (z2) {
                    nVar.mo143205F3(multiTaskInfo2);
                }
                Log.m105925i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, only one size!, forceShow:%b", Boolean.valueOf(z2));
                return true;
            }
        }
        if (z) {
            ((MultiTaskUIC) rVar.mo62444c(nVar.getActivity()).mo75002a(cls)).mo175709e3(true);
            Log.m105924i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, force hide!");
            return false;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_multitask_show_timeout, 15);
        String obj = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MULTITASK_LAST_SHOW_ID_AND_TIME_STRING_SYNC, "").toString();
        List U = C112550d0.m153785U(obj, new String[]{"|"}, false, 0, 6, (Object) null);
        if (U.size() == 2) {
            String str = (String) U.get(0);
            long parseLong = Long.parseLong((String) U.get(1));
            MultiTaskInfo multiTaskInfo3 = nVar.f304739e;
            if (str != null && multiTaskInfo3 != null && C31543z5.m39453c() - parseLong <= ((long) (Qe * 60 * 1000)) && TextUtils.equals(str, multiTaskInfo3.field_id)) {
                Log.m105924i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, in timeout!: " + Qe);
                return true;
            }
        }
        String str2 = null;
        if (!nVar.mo143211o3()) {
            Object[] objArr = new Object[3];
            objArr[0] = obj;
            MultiTaskInfo multiTaskInfo4 = nVar.f304739e;
            if (multiTaskInfo4 != null) {
                str2 = multiTaskInfo4.field_id;
            }
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(Qe);
            Log.m105925i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, is hide!, lastShowInfo:%s, currentShowId:%s, timeout: %d", objArr);
            return false;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = obj;
        MultiTaskInfo multiTaskInfo5 = nVar.f304739e;
        if (multiTaskInfo5 != null) {
            str2 = multiTaskInfo5.field_id;
        }
        objArr2[1] = str2;
        objArr2[2] = Integer.valueOf(Qe);
        Log.m105925i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, return false, lastShowInfo:%s, currentShowId:%s, timeout: %d", objArr2);
        return false;
    }

    /* renamed from: c3 */
    public void mo125822c3(StorageObserverEvent<MultiTaskInfo> storageObserverEvent) {
        HashMap<String, StorageObserverEvent<MultiTaskInfo>> objEventMap;
        boolean z;
        C87412m.m108594g(storageObserverEvent, "event");
        MultiTaskInfo obj = storageObserverEvent.getObj();
        StringBuilder sb = new StringBuilder();
        sb.append("onMultiTaskChange ");
        sb.append(storageObserverEvent.getEventId());
        sb.append(' ');
        List<MultiTaskInfo> list = null;
        sb.append(obj != null ? obj.field_id : null);
        Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", sb.toString());
        StorageEventId eventId = storageObserverEvent.getEventId();
        StorageEventId.Companion companion = StorageEventId.Companion;
        if (C87412m.m108589b(eventId, companion.getINSERT())) {
            C61926c.m72668M(new C112771e(obj, this));
        } else if (C87412m.m108589b(eventId, companion.getDELETE())) {
            C61926c.m72668M(new C112772f(obj, this));
        } else if (C87412m.m108589b(eventId, companion.getUPDATE())) {
            C61926c.m72668M(new C112773g(obj, this));
        } else if (C87412m.m108589b(eventId, C99797b.f292476a)) {
            C61444a vx02 = ((C105923s) C86312j.m106911c(C105923s.class)).vx0();
            if (vx02 != null) {
                list = vx02.mo86418d3();
            }
            List<MultiTaskInfo> list2 = list;
            if (!(list2 != null && list2.size() == 2)) {
                if (!(list2 != null && list2.size() == 3)) {
                    z = false;
                    C61926c.m72668M(new C112777i(this, list2, z, false, true));
                }
            }
            z = true;
            C61926c.m72668M(new C112777i(this, list2, z, false, true));
        } else if (C87412m.m108589b(eventId, companion.getBATCH_EVENT()) && (objEventMap = storageObserverEvent.getObjEventMap()) != null) {
            for (Map.Entry<String, StorageObserverEvent<MultiTaskInfo>> value : objEventMap.entrySet()) {
                mo125822c3((StorageObserverEvent) value.getValue());
            }
        }
    }

    /* renamed from: d3 */
    public void mo62143d3(Object obj) {
        WxRecyclerAdapter<C65558a> wxRecyclerAdapter;
        OverScrollMultiTaskVerticalBehavior behavior;
        ViewTreeObserver viewTreeObserver;
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149092J(this);
        RelativeLayout relativeLayout = (RelativeLayout) getRootView().findViewById(C0966R.C0970id.h5m);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = C75044y4.m89995g(getActivity(), -1);
        relativeLayout.setLayoutParams(layoutParams2);
        ImageView imageView = (ImageView) getRootView().findViewById(C0966R.C0970id.h5l);
        this.f337662p = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new C112778j(this));
        }
        this.f337661o = (TextView) getRootView().findViewById(C0966R.C0970id.gu7);
        ((C64215d) this.f337666t).f181996d = this.f337672z;
        this.f337659j = (WxRecyclerView) getRootView().findViewById(C0966R.C0970id.h5i);
        MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = (MultiTaskCoordinatorLayout) getRootView().findViewById(C0966R.C0970id.h5j);
        this.f337660n = multiTaskCoordinatorLayout;
        if (!(multiTaskCoordinatorLayout == null || (viewTreeObserver = multiTaskCoordinatorLayout.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new C112779k(this));
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        MultiTaskUIC.C115597a aVar = MultiTaskUIC.f346667E;
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, 0));
        this.f337663q = frameLayout;
        RecyclerView.LayoutManager layoutManager = (RecyclerView.LayoutManager) ((C36570n) this.f337665s).getValue();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager");
        WxRecyclerView wxRecyclerView = this.f337659j;
        ((MinusScreenGridLayoutManager) layoutManager).f162959D = wxRecyclerView;
        OverScrollMultiTaskRecyclerView overScrollMultiTaskRecyclerView = wxRecyclerView instanceof OverScrollMultiTaskRecyclerView ? (OverScrollMultiTaskRecyclerView) wxRecyclerView : null;
        if (!(overScrollMultiTaskRecyclerView == null || (behavior = overScrollMultiTaskRecyclerView.getBehavior()) == null)) {
            behavior.f315167d = this.f337672z;
        }
        C64215d dVar = (C64215d) this.f337666t;
        dVar.getClass();
        C53994d dVar2 = new C53994d(this, new MinusScreenGridLayoutConfig$getItemConvertFactory$1(dVar, (C32226l<? super Integer, ? extends C60896i<?>>) null), this.f337657h);
        this.f337667u = dVar2;
        dVar2.registerAdapterDataObserver(this.f337671y);
        WxRecyclerView wxRecyclerView2 = this.f337659j;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager((RecyclerView.LayoutManager) ((C36570n) this.f337665s).getValue());
            wxRecyclerView2.setItemAnimator(new C65238a(wxRecyclerView2, this.f337672z));
            wxRecyclerView2.setAdapter(this.f337667u);
        }
        this.f337666t.getClass();
        View view = this.f337663q;
        if (!(view == null || (wxRecyclerAdapter = this.f337667u) == null)) {
            C60898l.m71329W5(wxRecyclerAdapter, view, 0, false, 4, (Object) null);
        }
        WxRecyclerAdapter<C65558a> wxRecyclerAdapter2 = this.f337667u;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f173488o = new C112774e(this);
        }
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f165737C = new C112775f(this);
        }
        WxRecyclerView wxRecyclerView3 = this.f337659j;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.mo17043c(new C53995g(this));
        }
        C61926c.m72661F("MultiTask_Thread", new C112776h(this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bi9;
    }

    /* renamed from: k3 */
    public boolean mo62147k3(int i) {
        return i == 0;
    }

    /* renamed from: l3 */
    public final void mo164521l3() {
        Class cls = MultiTaskUIC.class;
        C39818r rVar = C39818r.f106831a;
        boolean z = false;
        if (!((MultiTaskUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).mo90994b0()) {
            if (this.f337657h.size() == 0) {
                z = true;
            }
            if (z) {
                ((MultiTaskUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).mo175706G3(1);
            } else if (!((MultiTaskUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).mo175712i3()) {
                ((MultiTaskUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).mo175706G3(2);
            }
        } else {
            ((MultiTaskUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).mo175706G3(0);
        }
    }

    /* renamed from: m3 */
    public final void mo164522m3() {
        Class cls = MultiTaskUIC.class;
        C39818r rVar = C39818r.f106831a;
        boolean b0 = ((MultiTaskUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).mo90994b0();
        boolean z = true;
        if (b0) {
            if (this.f337657h.size() == 0) {
                C39622i0 a = rVar.mo62444c(getActivity()).mo75002a(cls);
                C87412m.m108593f(a, "of(activity).get(MultiTaskUIC::class.java)");
                MultiTaskUIC.m162482m3((MultiTaskUIC) a, true, false, false, false, false, false, true, false, 128, (Object) null);
            }
        }
        mo164521l3();
        if (!b0) {
            NotifyMulitTaskIconShowEvent notifyMulitTaskIconShowEvent = new NotifyMulitTaskIconShowEvent();
            NotifyMulitTaskIconShowEvent.C67741a aVar = notifyMulitTaskIconShowEvent.f193766d;
            if (this.f337657h.size() == 0) {
                z = false;
            }
            aVar.f193767a = z;
            notifyMulitTaskIconShowEvent.publish();
        }
    }

    /* renamed from: n3 */
    public final void mo164523n3(boolean z, boolean z2) {
        if (z2) {
            Log.m105924i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskPaneExitDragFlag, flag: true");
            MultiProcessMMKV.getMMKV("multitask_tips_config").putBoolean("multitask_panel_exit_drag_flag", true);
            return;
        }
        boolean z3 = MultiProcessMMKV.getMMKV("multitask_tips_config").getBoolean("multitask_panel_exit_drag_flag", false);
        Log.m105924i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskPanelExitDrag, flag: " + z3);
        if (z3 || !z) {
            TextView textView = this.f337661o;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f337661o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f337661o;
        if (textView3 != null) {
            textView3.setAlpha(1.0f);
        }
        ((MultiTaskUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(MultiTaskUIC.class)).mo175710f3(2);
    }

    /* renamed from: o3 */
    public final void mo164524o3() {
        if (this.f337656g) {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "convertFloatBallInfo, is Already done!");
            return;
        }
        List<BallInfo> I = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149091I();
        Log.m105925i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "convertFloatBallInfo,size:%d", Integer.valueOf(I.size()));
        boolean z = false;
        for (T t : C110818d0.m150936h0(I)) {
            C39748b bVar = C39748b.f106642a;
            int i = t.f311686d;
            if (i == 2 || i == 22 || i == 4 || i == 1 || i == 5 || i == 3 || i == 8) {
                this.f337656g = true;
                MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
                multiTaskInfo.field_type = t.f311686d;
                multiTaskInfo.field_id = t.f311688f;
                C64459j13 j132 = new C64459j13();
                multiTaskInfo.field_showData = j132;
                j132.f183751d = t.f311699t;
                j132.f183752e = t.f311700u;
                j132.f183756i = t.f311695p;
                Bundle bundle = t.f311678C;
                C87412m.m108593f(bundle, "ballInfo.extra");
                try {
                    int i2 = t.f311686d;
                    if (i2 == 1) {
                        C90416i5 i5Var = new C90416i5();
                        i5Var.f259566d = t.f311678C.getString("appId");
                        i5Var.f259567e = t.f311678C.getString("username");
                        i5Var.f259568f = t.f311678C.getInt("versionType");
                        multiTaskInfo.field_data = i5Var.toByteArray();
                        C64459j13 j133 = multiTaskInfo.field_showData;
                        if (j133 != null) {
                            j133.f183756i = t.f311695p;
                        }
                        if (j133 != null) {
                            j133.f183751d = t.f311699t;
                        }
                    } else if (i2 == 2) {
                        i25 i25 = new i25();
                        ((C105919k) C86312j.m106911c(C105919k.class)).mo151034IA(bundle, i25);
                        multiTaskInfo.field_data = i25.toByteArray();
                    } else if (i2 == 3) {
                        String string = bundle.getString("eventData");
                        int i3 = bundle.getInt("eventType");
                        C64357f43 f432 = new C64357f43();
                        f432.f183079e = string;
                        f432.f183078d = i3;
                        multiTaskInfo.field_data = f432.toByteArray();
                    } else if (i2 == 4) {
                        C101828pe0 pe02 = new C101828pe0();
                        C39749d.m42536c(bundle, pe02);
                        C64459j13 j134 = multiTaskInfo.field_showData;
                        j134.f183755h = pe02.f299162f;
                        j134.f183752e = t.f311699t;
                        multiTaskInfo.field_data = pe02.toByteArray();
                    } else if (i2 == 5) {
                        i25 i252 = new i25();
                        C39749d.m42537d(bundle, i252);
                        multiTaskInfo.field_data = i252.toByteArray();
                    } else if (i2 == 8) {
                        multiTaskInfo.field_data = bundle.getByteArray("key_context");
                    } else if (i2 == 22) {
                        multiTaskInfo.field_data = t.mo149043f("KEY_FLOAT_BALL_INFO");
                        multiTaskInfo.mo80305m2().f183752e = t.f311699t;
                        multiTaskInfo.mo80305m2().f183756i = t.f311695p;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MultiTaskManager", th, "convertBallInfo2MultiTaskInfo", new Object[0]);
                }
                String str = multiTaskInfo.field_id;
                C87412m.m108593f(str, "multiTaskInfo.field_id");
                int i4 = multiTaskInfo.field_type;
                C64459j13 m2 = multiTaskInfo.mo80305m2();
                C87412m.m108593f(m2, "multiTaskInfo.showData");
                ((C105918j) C86312j.m106911c(C105918j.class)).mo151023l0(str, i4, m2, (Bitmap) null, multiTaskInfo.field_data, (C110964i13) null);
                Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "convertFloatBallInfo, type:" + t.f311686d + ", id:" + t.f311688f + ", nickname:" + t.f311699t);
                z = true;
            }
        }
        if (I.size() > 0 && z) {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "convertFloatBallInfo, clearData");
            C105050r d = C105050r.m140969d();
            synchronized (d) {
                MultiProcessMMKV.getMMKV(d.mo149194c()).clear();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Point point = this.f337669w;
        this.f337669w = C85875k4.m106184h(getContext());
        if (C85875k4.m106197n0() && C85875k4.m106156M(getContext())) {
            this.f337669w.x = C85875k4.m106182g();
        }
        if (C85875k4.m106208w()) {
            this.f337669w.x = C85875k4.m106180f();
        }
        Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "onConfigurationChanged lastOrientation:" + this.f337668v + ",orientation:" + Integer.valueOf(configuration.orientation) + ", screenResolution:" + this.f337669w.x + ", lastScreenResolution:" + point.x);
        int i = this.f337668v;
        int i2 = configuration.orientation;
        if (i == i2) {
            int i3 = point.x;
            Point point2 = this.f337669w;
            if (i3 == point2.x && point.y == point2.y) {
                return;
            }
        }
        this.f337668v = i2;
        mo164519J3();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        WxRecyclerAdapter<C65558a> wxRecyclerAdapter = this.f337667u;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.unregisterAdapterDataObserver(this.f337671y);
        }
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149102U(this);
    }

    /* renamed from: z */
    public C117994a.C117996b mo36002z() {
        return C117994a.C117996b.MODE_SHOW_SINGLE_SCENE;
    }
}
