package qj1;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import i70.C87667c;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import p671qy.C63344h;
import pe3.C89349b;
import qj1.C62966ri;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63957l;
import te3.C51728vr1;
import te3.C64822x51;

/* renamed from: qj1.y6 */
public final class C63122y6 implements C62966ri {

    /* renamed from: d */
    public final Context f179117d;

    /* renamed from: e */
    public final C45795b f179118e;

    /* renamed from: f */
    public final C58124b f179119f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f179120g;

    /* renamed from: h */
    public C63956k f179121h;

    /* renamed from: i */
    public final String f179122i = "FinderLiveGamePromoteBubble";

    /* renamed from: j */
    public final String f179123j = "PORTRAIT_ACTIONFinderLiveGamePromoteBubble";

    /* renamed from: n */
    public final String f179124n = "PORTRAIT_ACTION_BUNDLE_OPEN_GAME_PROMOTION";

    /* renamed from: o */
    public ViewGroup f179125o;

    /* renamed from: p */
    public C87667c<?, ?>.a f179126p;

    /* renamed from: q */
    public final ConstraintLayout f179127q;

    /* renamed from: qj1.y6$a */
    public static final class C63123a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63122y6 f179128d;

        /* renamed from: e */
        public final /* synthetic */ C63957l f179129e;

        public C63123a(C63122y6 y6Var, C63957l lVar) {
            this.f179128d = y6Var;
            this.f179129e = lVar;
        }

        public final void onClick(View view) {
            C62712dd ddVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGamePromoteBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f179128d.f179117d.getResources().getConfiguration().orientation == 2) {
                C58124b bVar = this.f179128d.f179119f;
                C56032b bVar2 = bVar instanceof C56032b ? (C56032b) bVar : null;
                if (!(bVar2 == null || (ddVar = (C62712dd) bVar2.getPlugin(C62712dd.class)) == null)) {
                    String str = this.f179128d.f179123j;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray(this.f179128d.f179124n, this.f179129e.f181303s.toByteArray());
                    C13598b0 b0Var = C13598b0.f38549a;
                    ddVar.mo87694V0(str, bundle);
                }
            } else {
                C63122y6 y6Var = this.f179128d;
                C51728vr1 vr12 = this.f179129e.f181303s;
                y6Var.getClass();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGamePromoteBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.y6$b */
    public static final class C63124b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63957l f179130d;

        public C63124b(C63957l lVar) {
            this.f179130d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGamePromoteBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63957l lVar = this.f179130d;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = lVar.f181291d;
                x512.f186254d = 8;
                x512.f186256f = new C89349b(lVar.f181303s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar.statusChange(bVar2, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGamePromoteBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C63122y6(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f179117d = context;
        this.f179118e = bVar;
        this.f179119f = bVar2;
        this.f179120g = lVar;
        this.f179121h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.d1t, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f179125o = viewGroup;
        this.f179127q = (ConstraintLayout) viewGroup.findViewById(C0966R.C0970id.nk8);
        Log.m105924i("FinderLiveGamePromoteBubble", "initGameBubble");
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        String str;
        C87412m.m108594g(obj, "data");
        Log.m105924i(this.f179122i, "initView");
        Class cls = C63344h.class;
        Log.m105924i(this.f179122i, "setupDynamicCardEnv");
        C63956k kVar = this.f179121h;
        C87412m.m108592e(kVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.PromoteGameItem");
        C51728vr1 vr12 = ((C63957l) kVar).f181303s;
        String str2 = vr12.f143630d;
        String str3 = this.f179122i;
        Log.m105918d(str3, "promoteItem frameSetName:" + str2 + " bubbleContent:" + vr12);
        ((C63344h) C86312j.m106911c(cls)).mo88250zf("wxe208ce76dfa39515");
        ((C63344h) C86312j.m106911c(cls)).mo88243Ji(new C63156z6(this));
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
        if (oVar == null || (str = oVar.f154345o) == null) {
            str = "";
        }
        C55001u uVar = (C55001u) finderLiveService.mo77630e(C55001u.class);
        long j = uVar != null ? uVar.f154416j : 0;
        C62042e eVar = C62042e.f176370a;
        Context context = this.f179125o.getContext();
        C87412m.m108593f(context, "root.context");
        C63344h.C63345a aVar = new C63344h.C63345a(str, j, eVar.mo87042T(context));
        Object obj2 = new Object();
        Context context2 = this.f179125o.getContext();
        C87412m.m108593f(context2, "root.context");
        C87667c<?, ?>.a qf02 = ((C63344h) C86312j.m106911c(cls)).qf0(obj2, context2, aVar);
        this.f179126p = qf02;
        if (qf02 != null) {
            ConstraintLayout constraintLayout = this.f179127q;
            C87412m.m108593f(constraintLayout, "container");
            Log.m105924i(this.f179122i, "createFrameSetView");
            Context context3 = constraintLayout.getContext();
            C87412m.m108593f(context3, "container.context");
            MagicSclViewContainer magicSclViewContainer = new MagicSclViewContainer(context3, (AttributeSet) null, 0, 6, (C8480h) null);
            String str4 = vr12.f143630d;
            if (str4 != null) {
                magicSclViewContainer.f157377h = str4;
            }
            magicSclViewContainer.setId(View.generateViewId());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
            constraintLayout.addView(magicSclViewContainer);
            magicSclViewContainer.setLayoutParams(layoutParams);
            magicSclViewContainer.mo76544a(qf02);
            magicSclViewContainer.bringToFront();
            String str5 = this.f179122i;
            Log.m105918d(str5, "frameSetView:" + Integer.valueOf(magicSclViewContainer.getId()));
            mo88051b(vr12);
        }
        if (obj instanceof C63957l) {
            mo88050a((C63957l) obj);
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f179121h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.f358111dh0;
    }

    /* renamed from: a */
    public final void mo88050a(C63957l lVar) {
        Log.m105918d(this.f179122i, "refreshView");
        WeImageView weImageView = (WeImageView) this.f179125o.findViewById(C0966R.C0970id.f358111dh0);
        ((ConstraintLayout) this.f179125o.findViewById(C0966R.C0970id.nk8)).setOnClickListener(new C63123a(this, lVar));
        if (C62042e.f176370a.mo87032P0(this.f179118e)) {
            weImageView.setVisibility(4);
            return;
        }
        weImageView.setVisibility(0);
        weImageView.setOnClickListener(new C63124b(lVar));
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.nk8;
    }

    /* renamed from: b */
    public final void mo88051b(C51728vr1 vr12) {
        C87667c<?, ?>.a aVar;
        Log.m105924i(this.f179122i, "updateDynamicBubbleData");
        String str = vr12.f143630d;
        C89349b bVar = vr12.f143631e;
        String h = bVar != null ? bVar.mo123705h() : null;
        String str2 = this.f179122i;
        Log.m105918d(str2, "bubbleData data:" + h + ", id:" + vr12.f143632f);
        if (str != null && h != null) {
            boolean z = true;
            if (str.length() > 0) {
                if (h.length() <= 0) {
                    z = false;
                }
                if (z && (aVar = this.f179126p) != null) {
                    C87667c.C87668a.m109055b(aVar, h, str, (String) null, 4, (Object) null);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
        byte[] bArr = null;
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (C87412m.m108589b(string, this.f179123j)) {
            C51728vr1 vr12 = new C51728vr1();
            Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle2 != null) {
                bArr = bundle2.getByteArray(this.f179124n);
            }
            if (bArr != null) {
                try {
                    vr12.parseFrom(bArr);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
        }
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        return this.f179125o;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
        C87667c<?, ?>.a aVar = this.f179126p;
        if (aVar != null) {
            aVar.mo122102e();
        }
    }

    public void onResume() {
        Log.m105924i(this.f179122i, "onResume");
        C87667c<?, ?>.a aVar = this.f179126p;
        if (aVar != null) {
            aVar.mo122105h();
        }
        C87667c<?, ?>.a aVar2 = this.f179126p;
        if (aVar2 != null) {
            aVar2.mo122103f();
        }
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63957l) {
            C63957l lVar = (C63957l) obj;
            mo88050a(lVar);
            mo88051b(lVar.f181303s);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
        Log.m105924i(this.f179122i, "onBubbleDel");
        Class cls = C63344h.class;
        Log.m105924i(this.f179122i, "releaseDynamicCardEnv");
        this.f179127q.removeAllViews();
        C87667c<?, ?>.a aVar = this.f179126p;
        if (aVar != null) {
            ((C63344h) C86312j.m106911c(cls)).mo88242Eu(aVar.f253930e);
        }
        this.f179126p = null;
        ((C63344h) C86312j.m106911c(cls)).mo88243Ji((C63344h.C63346b) null);
        ((C63344h) C86312j.m106911c(cls)).mo88248t();
    }
}
