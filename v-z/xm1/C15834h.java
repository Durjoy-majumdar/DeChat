package xm1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hn1.C8614b;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import ln1.C10584f;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p147ea.C7606d;
import pe3.C47465a;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rm1.C13087a;
import rs1.C13442s8;
import rx3.C13598b0;
import sm1.C13731a;
import sx3.C110818d0;
import sx3.C64186f0;
import te3.C49712hj1;
import te3.C50989qo0;
import te3.C51942x91;
import up1.C27696y;
import wm1.C15548j;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: xm1.h */
public final class C15834h extends UIComponent implements C11385n {

    /* renamed from: g */
    public static C50989qo0 f42638g = null;

    /* renamed from: h */
    public static boolean f42639h = false;

    /* renamed from: i */
    public static int f42640i = 1;

    /* renamed from: d */
    public C15548j f42641d;

    /* renamed from: e */
    public final C0000n0 f42642e = C53930o0.m60555b();

    /* renamed from: f */
    public C53973z1 f42643f;

    /* renamed from: xm1.h$a */
    public static final class C15835a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15834h f42644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15835a(C15834h hVar) {
            super(0);
            this.f42644d = hVar;
        }

        public Object invoke() {
            this.f42644d.mo14508d3(C15834h.f42638g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm1.h$b */
    public static final class C15836b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15834h f42645d;

        /* renamed from: e */
        public final /* synthetic */ int f42646e;

        /* renamed from: f */
        public final /* synthetic */ C51942x91 f42647f;

        public C15836b(C15834h hVar, int i, C51942x91 x912) {
            this.f42645d = hVar;
            this.f42646e = i;
            this.f42647f = x912;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$render$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C15834h hVar = this.f42645d;
            hVar.mo14507c3(this.f42646e, hVar.getContext(), this.f42647f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$render$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xm1.h$c */
    public static final class C15837c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15834h f42648d;

        public C15837c(C15834h hVar) {
            this.f42648d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$showSearchEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C15834h hVar = this.f42648d;
            hVar.getClass();
            String str = ((C13442s8) C39818r.f106831a.mo62444c(hVar.getActivity()).mo75002a(C13442s8.class)).f38098n;
            if (str == null) {
                str = "";
            }
            Intent intent = new Intent();
            intent.putExtra("key_context_id", str);
            intent.putExtra("key_click_tab_context_id", C13087a.f37256c);
            new C13731a(hVar.getActivity()).mo13108a(intent);
            this.f42648d.mo14509f3(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$showSearchEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15834h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: e3 */
    public static final void m14773e3(C15834h hVar, int i, C51942x91 x912, ViewGroup viewGroup, TextView textView, ImageView imageView) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        viewGroup.setOnClickListener(new C15836b(hVar, i, x912));
        ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C62345f(x912.f144540p, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
        textView.setText(C0966R.string.f360975ge2);
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
    }

    /* renamed from: c3 */
    public final void mo14507c3(int i, Context context, C51942x91 x912) {
        Class cls = C13442s8.class;
        C87412m.m108594g(context, "ctx");
        C39818r rVar = C39818r.f106831a;
        String str = ((C13442s8) rVar.mo62443b(context).mo75002a(cls)).mo12861q3().f134671e;
        if (str == null) {
            str = "";
        }
        C13087a.f37262i = 2;
        C7606d dVar = (C7606d) C86312j.m106911c(C7606d.class);
        Intent intent = new Intent();
        intent.putExtra("key_request_scene", 9);
        if (x912 != null) {
            intent.putExtra("nearby_live_target_square_page_params_key", x912.toByteArray());
            C8614b bVar = C8614b.f27717a;
            Intent intent2 = getIntent();
            if (intent2 == null) {
                intent2 = new Intent();
            }
            int i2 = x912.f144531d;
            String str2 = x912.f144532e;
            if (str2 == null) {
                str2 = "";
            }
            bVar.mo9487l(intent2, i2, i, str2);
        }
        intent.putExtra("key_context_id", str);
        intent.putExtra("enter_from_type", 1);
        C13598b0 b0Var = C13598b0.f38549a;
        dVar.mo8742gH(context, intent);
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            C49712hj1 q3 = ((C13442s8) rVar.mo62443b(activity).mo75002a(cls)).mo12861q3();
            C39622i0 a = rVar.mo62443b(activity).mo75002a(C10584f.class);
            C87412m.m108593f(a, "UICProvider.of(it).get(N…eReporterUIC::class.java)");
            ((C10584f) a).mo10842d3(q3.f134671e, "main_page_recmd_more", "");
        }
    }

    /* renamed from: d3 */
    public final void mo14508d3(C50989qo0 qo02) {
        C50989qo0 qo03 = qo02;
        LinkedList<C51942x91> linkedList = qo03 != null ? qo03.f140431o : null;
        int i = linkedList == null || linkedList.isEmpty() ? 18 : qo03 != null ? qo03.f140426g : 0;
        List list = qo03 != null ? qo03.f140431o : null;
        if (list == null) {
            list = C64186f0.f181907d;
        }
        List list2 = list;
        C53973z1 z1Var = this.f42643f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C8479f0 f0Var = new C8479f0();
        T findViewById = findViewById(C0966R.C0970id.l8q);
        C87412m.m108593f(findViewById, "findViewById(R.id.btn_more_live_1)");
        f0Var.f27484d = findViewById;
        C8479f0 f0Var2 = new C8479f0();
        T findViewById2 = findViewById(C0966R.C0970id.lmz);
        C87412m.m108593f(findViewById2, "findViewById(R.id.btn_more_live_icon_1)");
        f0Var2.f27484d = findViewById2;
        C8479f0 f0Var3 = new C8479f0();
        T findViewById3 = findViewById(C0966R.C0970id.f357586ln1);
        C87412m.m108593f(findViewById3, "findViewById(R.id.btn_more_live_text_1)");
        f0Var3.f27484d = findViewById3;
        C8479f0 f0Var4 = new C8479f0();
        T findViewById4 = findViewById(C0966R.C0970id.lmy);
        C87412m.m108593f(findViewById4, "findViewById(R.id.btn_more_live_2)");
        f0Var4.f27484d = findViewById4;
        C8479f0 f0Var5 = new C8479f0();
        T findViewById5 = findViewById(C0966R.C0970id.f357585ln0);
        C87412m.m108593f(findViewById5, "findViewById(R.id.btn_more_live_icon_2)");
        f0Var5.f27484d = findViewById5;
        C8479f0 f0Var6 = new C8479f0();
        T findViewById6 = findViewById(C0966R.C0970id.f357587ln2);
        C87412m.m108593f(findViewById6, "findViewById(R.id.btn_more_live_text_2)");
        f0Var6.f27484d = findViewById6;
        ((ViewGroup) f0Var.f27484d).setVisibility(8);
        ((ViewGroup) f0Var4.f27484d).setVisibility(8);
        if (list2.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) f0Var.f27484d;
            viewGroup.setOnClickListener(new C15841l(this, i));
            ((ImageView) f0Var2.f27484d).setImageResource(C0966R.raw.finder_live_icon);
            ((TextView) f0Var3.f27484d).setText(C0966R.string.f360975ge2);
            viewGroup.setVisibility(0);
            viewGroup.setAlpha(1.0f);
        } else if (list2.size() == 1) {
            m14773e3(this, i, (C51942x91) C110818d0.m150914L(list2), (ViewGroup) f0Var.f27484d, (TextView) f0Var3.f27484d, (ImageView) f0Var2.f27484d);
        } else {
            this.f42643f = C53895h.m60466d(this.f42642e, (C66212f) null, (C53934p0) null, new C15838i(list2, f0Var, f0Var3, f0Var2, f0Var4, f0Var5, f0Var6, this, i, (C15601d<? super C15838i>) null), 3, (Object) null);
        }
    }

    /* renamed from: f3 */
    public final void mo14509f3(boolean z) {
        AppCompatActivity activity = getActivity();
        if (activity != null) {
            C39818r rVar = C39818r.f106831a;
            C49712hj1 q3 = ((C13442s8) rVar.mo62444c(getActivity()).mo75002a(C13442s8.class)).mo12861q3();
            C39622i0 a = rVar.mo62444c(activity).mo75002a(C10584f.class);
            C87412m.m108593f(a, "UICProvider.of(it).get(N…eReporterUIC::class.java)");
            C10584f fVar = (C10584f) a;
            Log.m105924i("LiveEntranceFragmentUICMoreIcon", "searchIconReport: " + z);
            if (z) {
                fVar.mo10841c3("", q3.f134671e, "main_page_search", "");
            } else {
                fVar.mo10842d3(q3.f134671e, "main_page_search", "");
            }
        }
    }

    /* renamed from: g3 */
    public final void mo14510g3() {
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.l8q);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C0966R.C0970id.lmy);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.f357591ln3);
        if (weImageView != null) {
            if (weImageView.getVisibility() == 8) {
                mo14509f3(true);
            }
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new C15837c(this));
            weImageView.setContentDescription(weImageView.getContext().getString(C0966R.string.k3j));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(4210, this);
        C15548j jVar = this.f42641d;
        if (jVar != null) {
            if (!(!jVar.isCanceled())) {
                jVar = null;
            }
            if (jVar != null) {
                C86709a0.m107524d().mo123458d(jVar);
            }
        }
        C53930o0.m60558e(this.f42642e, (CancellationException) null, 1, (Object) null);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C86709a0.m107524d().mo123470p(4210, this);
        if (i == 0 && i2 == 0) {
            C47350c cVar = ((C15548j) yVar).f42139h;
            C87412m.m108591d(cVar);
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveTabsResponse");
            f42638g = (C50989qo0) aVar;
            C61926c.m72668M(new C15835a(this));
        }
    }

    public void onViewCreated(View view) {
        C87412m.m108594g(view, "contentView");
        super.onViewCreated(view);
        if (!f42639h) {
            return;
        }
        if (f42640i == 2) {
            mo14510g3();
        } else {
            mo14508d3(f42638g);
        }
    }
}
