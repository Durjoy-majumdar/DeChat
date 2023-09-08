package qj1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import bl3.C39818r;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dh1.C7329b;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ke3.C88144b;
import kotlin.ResultKt;
import nj3.C76912y0;
import nk1.C61780j;
import o40.C61926c;
import o40.C61937h;
import ob0.C89132b;
import ok1.C62042e;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qg1.C62615o;
import qj1.C62966ri;
import qo3.C89779i0;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63962r;
import sx3.C110818d0;
import te3.C49494g01;
import te3.C64224a61;
import te3.C64424hi3;
import te3.C64795w51;
import te3.C64822x51;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.td */
public final class C62996td implements C62966ri {

    /* renamed from: d */
    public final Context f178745d;

    /* renamed from: e */
    public final C45795b f178746e;

    /* renamed from: f */
    public final C58124b f178747f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f178748g;

    /* renamed from: h */
    public C63956k f178749h;

    /* renamed from: i */
    public final String f178750i = "FinderLiveRedPacketBubble";

    /* renamed from: j */
    public ViewGroup f178751j;

    /* renamed from: n */
    public C89779i0 f178752n;

    /* renamed from: o */
    public C53973z1 f178753o;

    /* renamed from: p */
    public C63962r f178754p;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveRedPacketBubble$goRedPacketCoverPage$1", mo125469f = "FinderLiveRedPacketBubble.kt", mo125470l = {247}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.td$a */
    public static final class C62997a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f178755d;

        /* renamed from: e */
        public final /* synthetic */ C62996td f178756e;

        /* renamed from: qj1.td$a$a */
        public static final class C62998a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62996td f178757d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62998a(C62996td tdVar) {
                super(0);
                this.f178757d = tdVar;
            }

            public Object invoke() {
                C62996td tdVar = this.f178757d;
                Context context = tdVar.f178745d;
                tdVar.f178752n = C89779i0.m112248e(context, context.getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62997a(C62996td tdVar, C15601d<? super C62997a> dVar) {
            super(2, dVar);
            this.f178756e = tdVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62997a(this.f178756e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62997a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f178755d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f178755d = 1;
                if (C53965x0.m60607b(1000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C61926c.m72668M(new C62998a(this.f178756e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.td$b */
    public static final class C62999b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C62996td f178758a;

        /* renamed from: b */
        public final /* synthetic */ C63962r f178759b;

        public C62999b(C62996td tdVar, C63962r rVar) {
            this.f178758a = tdVar;
            this.f178759b = rVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C53973z1 z1Var = this.f178758a.f178753o;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C89779i0 i0Var = this.f178758a.f178752n;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C89349b bVar = ((C49494g01) cVar.f256796d).f133757d;
                if (bVar == null) {
                    return null;
                }
                C63962r rVar = this.f178759b;
                C62996td tdVar = this.f178758a;
                C64795w51 w512 = new C64795w51();
                w512.parseFrom(bVar.mo123703f());
                rVar.getClass();
                rVar.f181314s = w512;
                ((C54979h1) tdVar.f178746e.mo71262a(C54979h1.class)).mo75948o3(rVar);
                LinkedList<C64424hi3> linkedList = w512.f186059d;
                C87412m.m108593f(linkedList, "redpacketCover.infos");
                C64424hi3 hi32 = (C64424hi3) C110818d0.m150916N(linkedList);
                if (hi32 == null) {
                    return null;
                }
                tdVar.mo87935b(hi32.f183503h);
                return C13598b0.f38549a;
            }
            Context context = this.f178758a.f178745d;
            C76912y0.m92767f(context, context.getString(C0966R.string.lu5));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.td$c */
    public static final class C63000c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62996td f178760d;

        /* renamed from: e */
        public final /* synthetic */ C63962r f178761e;

        public C63000c(C62996td tdVar, C63962r rVar) {
            this.f178760d = tdVar;
            this.f178761e = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7329b.m7474c(C7329b.f25441a, this.f178760d.f178746e, 2, 7, (String) null, 0, (String) null, 0, 120, (Object) null);
            Log.m105924i(this.f178760d.f178750i, "close promote");
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63962r rVar = this.f178761e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = rVar.f181291d;
                x512.f186254d = 7;
                x512.f186256f = new C89349b(rVar.f181314s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar.statusChange(bVar2, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C62996td(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f178745d = context;
        this.f178746e = bVar;
        this.f178747f = bVar2;
        this.f178748g = lVar;
        this.f178749h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.clf, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f178751j = (ViewGroup) inflate;
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63962r) {
            mo87936c((C63962r) obj);
            C7329b.m7474c(C7329b.f25441a, this.f178746e, 1, 7, (String) null, 0, (String) null, 0, 120, (Object) null);
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f178749h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.f358111dh0;
    }

    /* renamed from: a */
    public final void mo87934a(C63962r rVar) {
        LinkedList<C64424hi3> linkedList;
        C64424hi3 hi32;
        C60085d dVar;
        C60090e eVar;
        C62712dd ddVar;
        C63962r rVar2 = rVar;
        boolean z = this.f178745d.getResources().getConfiguration().orientation == 2;
        String str = this.f178750i;
        Log.m105924i(str, "goRedPacketCoverPage isLandscape:" + z);
        String str2 = null;
        if (z) {
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null && (ddVar = (C62712dd) bVar.getPlugin(C62712dd.class)) != null) {
                C62660c.m73643W0(ddVar, "POST_PORTRAIT", (Object) null, 2, (Object) null);
                return;
            }
            return;
        }
        C7329b.m7474c(C7329b.f25441a, this.f178746e, 5, 7, (String) null, 0, (String) null, 0, 120, (Object) null);
        if (((C54991o) this.f178746e.mo71262a(C54991o.class)).mo75990Y3()) {
            C58124b bVar2 = this.f178747f;
            C56032b bVar3 = bVar2 instanceof C56032b ? (C56032b) bVar2 : null;
            if (!(bVar3 == null || (dVar = (C60085d) bVar3.getPlugin(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84956b();
            }
        }
        String str3 = this.f178750i;
        Log.m105924i(str3, "needJump:" + rVar2.f181294g);
        if (rVar2.f181294g) {
            this.f178753o = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C62997a(this, (C15601d<? super C62997a>) null), 3, (Object) null);
            C55001u uVar = (C55001u) this.f178746e.mo71262a(C55001u.class);
            new C62615o(uVar.f154416j, uVar.f154420q.f182392d, 7, rVar2.f181293f, new C89349b(rVar2.f181314s.toByteArray()), (String) null, (String) null, (String) null, 128, (C8480h) null).mo9225i().mo123420E(new C62999b(this, rVar2));
            return;
        }
        C64795w51 w512 = rVar2.f181314s;
        if (!(w512 == null || (linkedList = w512.f186059d) == null || (hi32 = (C64424hi3) C110818d0.m150916N(linkedList)) == null)) {
            str2 = hi32.f183503h;
        }
        mo87935b(str2);
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.fad;
    }

    /* renamed from: b */
    public final void mo87935b(String str) {
        String str2 = this.f178750i;
        Log.m105924i(str2, "url: " + str);
        Intent intent = new Intent();
        if (str == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109795m(this.f178745d, "webview", ".ui.tools.WebViewUI", intent, 1011);
    }

    /* renamed from: c */
    public final void mo87936c(C63962r rVar) {
        C63962r rVar2 = rVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        this.f178754p = rVar2;
        ViewGroup viewGroup = this.f178751j;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.m15);
            ViewGroup viewGroup2 = this.f178751j;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(C0966R.C0970id.fad);
                ViewGroup viewGroup3 = this.f178751j;
                if (viewGroup3 != null) {
                    View findViewById2 = viewGroup3.findViewById(C0966R.C0970id.f358111dh0);
                    ViewGroup viewGroup4 = this.f178751j;
                    if (viewGroup4 != null) {
                        TextView textView2 = (TextView) viewGroup4.findViewById(C0966R.C0970id.knx);
                        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                        C85875k4.m106189j0(textView.getPaint(), 0.8f);
                        ViewGroup viewGroup5 = this.f178751j;
                        if (viewGroup5 != null) {
                            ImageView imageView = (ImageView) viewGroup5.findViewById(C0966R.C0970id.f359370kk0);
                            LinkedList<C64424hi3> linkedList = rVar2.f181314s.f186059d;
                            C87412m.m108593f(linkedList, "data.data.infos");
                            C64424hi3 hi32 = (C64424hi3) C110818d0.m150916N(linkedList);
                            if (hi32 != null) {
                                C39818r rVar3 = C39818r.f106831a;
                                C60979d<C100810g0> f2 = ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                                C11984n0 n0Var = new C11984n0(hi32.f183500e, C27696y.THUMB_IMAGE);
                                C87412m.m108593f(imageView, "thumb");
                                f2.mo85957c(n0Var, imageView, ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.MP_ARTICE));
                                textView2.setText(hi32.f183499d);
                                String str = hi32.f183501f;
                                if (str != null) {
                                    C87412m.m108593f(findViewById, "itemView");
                                    C64224a61 a = C61780j.f175629a.mo86701a(str);
                                    String str2 = this.f178750i;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("[saveStatus] status:");
                                    sb.append(a != null ? C61937h.m72709h(a) : "null");
                                    sb.append(", url:");
                                    sb.append(str);
                                    Log.m105924i(str2, sb.toString());
                                    if (a == null) {
                                        textView.setText(this.f178745d.getString(C0966R.string.f360682lu2));
                                        textView.setTextColor(this.f178745d.getResources().getColor(C0966R.color.BW_0));
                                        textView.setBackground(this.f178745d.getResources().getDrawable(C0966R.C0969drawable.a0w));
                                    } else if (a.f182035d) {
                                        textView.setText(this.f178745d.getString(C0966R.string.f360683lu3));
                                        textView.setTextColor(this.f178745d.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
                                        textView.setBackground((Drawable) null);
                                        ViewGroup viewGroup6 = this.f178751j;
                                        if (viewGroup6 != null) {
                                            viewGroup6.postDelayed(new C63031ud(rVar2), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                                        } else {
                                            C87412m.m108603p("root");
                                            throw null;
                                        }
                                    } else if (a.f182036e == 0) {
                                        textView.setText(this.f178745d.getString(C0966R.string.f360682lu2));
                                        textView.setTextColor(this.f178745d.getResources().getColor(C0966R.color.BW_0));
                                        textView.setBackground(this.f178745d.getResources().getDrawable(C0966R.C0969drawable.a0w));
                                    } else {
                                        textView.setText(this.f178745d.getString(C0966R.string.lu4));
                                        textView.setTextColor(this.f178745d.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
                                        textView.setBackground((Drawable) null);
                                        ViewGroup viewGroup7 = this.f178751j;
                                        if (viewGroup7 != null) {
                                            viewGroup7.postDelayed(new C63031ud(rVar2), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                                        } else {
                                            C87412m.m108603p("root");
                                            throw null;
                                        }
                                    }
                                    if (C62042e.f176370a.mo87032P0(this.f178746e)) {
                                        findViewById.setOnClickListener(new C63060vd(this, rVar2));
                                    } else {
                                        findViewById.setOnClickListener(new C63090wd(this, rVar2));
                                    }
                                }
                            }
                            if (C62042e.f176370a.mo87032P0(this.f178746e)) {
                                textView.setVisibility(8);
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(4);
                                View view = findViewById2;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            textView.setVisibility(0);
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = findViewById2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setOnClickListener(new C63000c(this, rVar2));
                            return;
                        }
                        C87412m.m108603p("root");
                        throw null;
                    }
                    C87412m.m108603p("root");
                    throw null;
                }
                C87412m.m108603p("root");
                throw null;
            }
            C87412m.m108603p("root");
            throw null;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
        C63962r rVar;
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "POST_PORTRAIT") && (rVar = this.f178754p) != null) {
            mo87934a(rVar);
        }
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        ViewGroup viewGroup = this.f178751j;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63962r) {
            mo87936c((C63962r) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
    }
}
