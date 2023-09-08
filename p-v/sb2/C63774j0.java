package sb2;

import a14.C0000n0;
import a14.C53930o0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.FrameListView2;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvSliderSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d03.C58010a;
import db2.C58254c;
import fy3.C32224a;
import fy3.C32226l;
import g03.C59338a;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59811e;
import j03.C60695a;
import j03.C60699c;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import la2.C99364n;
import m03.C61431n;
import o40.C61926c;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C110794b;
import sp3.C36777d;
import u23.C65003a;
import u23.C65005i;

/* renamed from: sb2.j0 */
public final class C63774j0 extends UIComponent {

    /* renamed from: A */
    public Bitmap f180804A;

    /* renamed from: B */
    public boolean f180805B;

    /* renamed from: C */
    public final int f180806C;

    /* renamed from: D */
    public long f180807D;

    /* renamed from: E */
    public final C0000n0 f180808E;

    /* renamed from: F */
    public final C63787m f180809F;

    /* renamed from: G */
    public final C63789n f180810G;

    /* renamed from: H */
    public C63775a f180811H;

    /* renamed from: d */
    public final C13601g f180812d = C36568h.m40985a(new C63794s(this));

    /* renamed from: e */
    public final C13601g f180813e = C36568h.m40985a(new C63781g(this));

    /* renamed from: f */
    public final C13601g f180814f = C36568h.m40985a(new C63786l(this));

    /* renamed from: g */
    public final C13601g f180815g = C36568h.m40985a(new C63795t(this));

    /* renamed from: h */
    public final C13601g f180816h = C36568h.m40985a(new C63793r(this));

    /* renamed from: i */
    public final C13601g f180817i = C36568h.m40985a(new C63780f(this));

    /* renamed from: j */
    public final C13601g f180818j = C36568h.m40985a(new C63779e(this));

    /* renamed from: n */
    public final C13601g f180819n;

    /* renamed from: o */
    public final C13601g f180820o;

    /* renamed from: p */
    public final C13601g f180821p;

    /* renamed from: q */
    public final C13601g f180822q;

    /* renamed from: r */
    public C60699c f180823r;

    /* renamed from: s */
    public long f180824s;

    /* renamed from: t */
    public long f180825t;

    /* renamed from: u */
    public long f180826u;

    /* renamed from: v */
    public float f180827v;

    /* renamed from: w */
    public C59811e f180828w;

    /* renamed from: x */
    public int f180829x;

    /* renamed from: y */
    public Bitmap f180830y;

    /* renamed from: z */
    public int f180831z;

    /* renamed from: sb2.j0$a */
    public interface C63775a {
        /* renamed from: a */
        void mo80377a(boolean z);

        /* renamed from: b */
        void mo80378b(boolean z);
    }

    /* renamed from: sb2.j0$b */
    public final class C63776b extends RecyclerView.C16613e<C63777c> {

        /* renamed from: d */
        public final ArrayList<C65003a> f180832d = new ArrayList<>();

        /* renamed from: e */
        public C65005i f180833e;

        public C63776b() {
        }

        public int getItemCount() {
            return this.f180832d.size();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            r1 = r1.getPlayer();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r4, int r5) {
            /*
                r3 = this;
                sb2.j0$c r4 = (sb2.C63774j0.C63777c) r4
                java.lang.String r0 = "viewHolder"
                gy3.C87412m.m108594g(r4, r0)
                u23.i r0 = r3.f180833e
                if (r0 == 0) goto L_0x0028
                sb2.j0 r1 = sb2.C63774j0.this
                com.tencent.mm.plugin.mv.ui.view.FrameListView2 r2 = r4.f180835z
                r2.setThumbFetcherFactory(r0)
                com.tencent.mm.plugin.mv.ui.view.FrameListView2 r0 = r4.f180835z
                j03.c r1 = r1.f180823r
                if (r1 == 0) goto L_0x0024
                j03.a r1 = r1.getPlayer()
                if (r1 == 0) goto L_0x0024
                k34.a r1 = r1.mo85616j()
                goto L_0x0025
            L_0x0024:
                r1 = 0
            L_0x0025:
                r0.setThumbFetcherExtraData(r1)
            L_0x0028:
                com.tencent.mm.plugin.mv.ui.view.FrameListView2 r4 = r4.f180835z
                java.util.ArrayList<u23.a> r0 = r3.f180832d
                java.lang.Object r5 = r0.get(r5)
                java.lang.String r0 = "trackInfoList[position]"
                gy3.C87412m.m108593f(r5, r0)
                u23.a r5 = (u23.C65003a) r5
                r4.setTrackInfo(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sb2.C63774j0.C63776b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            return new C63777c(viewGroup);
        }

        public void onViewDetachedFromWindow(RecyclerView.C16631z zVar) {
            C63777c cVar = (C63777c) zVar;
            C87412m.m108594g(cVar, "holder");
            super.onViewDetachedFromWindow(cVar);
            Log.m105924i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "release frameListView");
            FrameListView2 frameListView2 = cVar.f180835z;
            C36777d dVar = frameListView2.f163445t;
            if (dVar != null) {
                dVar.destroy();
            }
            frameListView2.f163445t = null;
            frameListView2.f163434f = null;
            Log.m105924i(frameListView2.f163432d, "clearThumb");
            frameListView2.f163435g.clear();
            frameListView2.f163436h = null;
            frameListView2.postInvalidate();
        }

        public void onViewRecycled(RecyclerView.C16631z zVar) {
            C63777c cVar = (C63777c) zVar;
            C87412m.m108594g(cVar, "holder");
            super.onViewRecycled(cVar);
            Log.m105924i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "release frameListView");
            FrameListView2 frameListView2 = cVar.f180835z;
            C36777d dVar = frameListView2.f163445t;
            if (dVar != null) {
                dVar.destroy();
            }
            frameListView2.f163445t = null;
            frameListView2.f163434f = null;
            Log.m105924i(frameListView2.f163432d, "clearThumb");
            frameListView2.f163435g.clear();
            frameListView2.f163436h = null;
            frameListView2.postInvalidate();
        }
    }

    /* renamed from: sb2.j0$c */
    public static final class C63777c extends RecyclerView.C16631z {

        /* renamed from: z */
        public final FrameListView2 f180835z;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C63777c(android.view.ViewGroup r3) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r3, r0)
                com.tencent.mm.plugin.mv.ui.view.FrameListView2 r0 = new com.tencent.mm.plugin.mv.ui.view.FrameListView2
                android.content.Context r3 = r3.getContext()
                java.lang.String r1 = "parent.context"
                gy3.C87412m.m108593f(r3, r1)
                r1 = 0
                r0.<init>(r3, r1)
                r2.<init>(r0)
                r3 = r0
                com.tencent.mm.plugin.mv.ui.view.FrameListView2 r3 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.FrameListView2) r3
                r2.f180835z = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sb2.C63774j0.C63777c.<init>(android.view.ViewGroup):void");
        }
    }

    /* renamed from: sb2.j0$d */
    public static final class C63778d extends C87413o implements C32224a<C63776b> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63778d(C63774j0 j0Var) {
            super(0);
            this.f180836d = j0Var;
        }

        public Object invoke() {
            return new C63776b();
        }
    }

    /* renamed from: sb2.j0$e */
    public static final class C63779e extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180837d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63779e(C63774j0 j0Var) {
            super(0);
            this.f180837d = j0Var;
        }

        public Object invoke() {
            return this.f180837d.mo88582j3().f166803d;
        }
    }

    /* renamed from: sb2.j0$f */
    public static final class C63780f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63780f(C63774j0 j0Var) {
            super(0);
            this.f180838d = j0Var;
        }

        public Object invoke() {
            return this.f180838d.mo88582j3().f166805f;
        }
    }

    /* renamed from: sb2.j0$g */
    public static final class C63781g extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63781g(C63774j0 j0Var) {
            super(0);
            this.f180839d = j0Var;
        }

        public Object invoke() {
            return this.f180839d.mo88582j3().f166806g;
        }
    }

    /* renamed from: sb2.j0$h */
    public static final class C63782h extends C87413o implements C32224a<LinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63782h(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180840d = appCompatActivity;
        }

        public Object invoke() {
            return new LinearLayoutManager(this.f180840d, 0, false);
        }
    }

    /* renamed from: sb2.j0$i */
    public static final class C63783i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63783i(C63774j0 j0Var) {
            super(0);
            this.f180841d = j0Var;
        }

        public Object invoke() {
            return this.f180841d.mo88582j3().f166808i;
        }
    }

    /* renamed from: sb2.j0$j */
    public static final class C63784j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180842d;

        public C63784j(C63774j0 j0Var) {
            this.f180842d = j0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "onCancel, firstRenderTime:" + this.f180842d.f180829x + ", firstRenderFrame:" + this.f180842d.f180830y + ", backFirstRenderTime:" + this.f180842d.f180831z + ", backFirstFrame:" + this.f180842d.f180804A);
            C63774j0 j0Var = this.f180842d;
            j0Var.f180830y = j0Var.f180804A;
            j0Var.f180829x = j0Var.f180831z;
            C63775a aVar = j0Var.f180811H;
            if (aVar != null) {
                aVar.mo80377a(j0Var.f180805B);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sb2.j0$k */
    public static final class C63785k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180843d;

        public C63785k(C63774j0 j0Var) {
            this.f180843d = j0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63774j0 j0Var = this.f180843d;
            long j = j0Var.f180807D;
            if (j >= 0 && j0Var.f180826u + j <= j0Var.f180825t) {
                C59811e eVar = j0Var.f180828w;
                C59811e.C59820h hVar = eVar != null ? eVar.f170731n : null;
                if (hVar != null) {
                    hVar.mo84768a(j);
                }
            }
            C63774j0 j0Var2 = this.f180843d;
            C63775a aVar = j0Var2.f180811H;
            if (aVar != null) {
                aVar.mo80378b(j0Var2.f180805B);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sb2.j0$l */
    public static final class C63786l extends C87413o implements C32224a<RoundedCornerFrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63786l(C63774j0 j0Var) {
            super(0);
            this.f180844d = j0Var;
        }

        public Object invoke() {
            return this.f180844d.mo88582j3().f166809j;
        }
    }

    /* renamed from: sb2.j0$m */
    public static final class C63787m implements C61431n {

        /* renamed from: a */
        public long f180845a;

        /* renamed from: b */
        public final /* synthetic */ C63774j0 f180846b;

        /* renamed from: sb2.j0$m$a */
        public static final class C63788a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63774j0 f180847d;

            /* renamed from: e */
            public final /* synthetic */ long f180848e;

            /* renamed from: f */
            public final /* synthetic */ C63787m f180849f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63788a(C63774j0 j0Var, long j, C63787m mVar) {
                super(0);
                this.f180847d = j0Var;
                this.f180848e = j;
                this.f180849f = mVar;
            }

            public Object invoke() {
                if (this.f180847d.mo88578e3().getChildCount() > 0) {
                    View childAt = this.f180847d.mo88578e3().getChildAt(0);
                    C63774j0 j0Var = this.f180847d;
                    float f = ((float) (-childAt.getLeft())) / j0Var.f180827v;
                    float width = (float) (j0Var.mo88578e3().getWidth() - childAt.getLeft());
                    C63774j0 j0Var2 = this.f180847d;
                    j0Var2.mo88580g3().setCursorPos(((((float) this.f180848e) - f) * 1.0f) / ((width / j0Var2.f180827v) - f));
                    C63774j0 j0Var3 = this.f180847d;
                    C59811e eVar = j0Var3.f180828w;
                    if (eVar != null) {
                        ((TextView) ((C36570n) j0Var3.f180822q).getValue()).setText(eVar.mo84762d(((int) this.f180848e) + eVar.f170725e + 33));
                    }
                    if (this.f180849f.f180845a > this.f180848e) {
                        Log.m105918d("MicroMsg.Mv.MusicMvMakerItemEditUIC", "lastPlayPosition:" + this.f180849f.f180845a + ", timeMs:" + this.f180848e + ", loop");
                        C59811e eVar2 = this.f180847d.f180828w;
                        if (eVar2 != null) {
                            C99364n.m129616h().mo138822a().mo32203a(eVar2.f170725e);
                        }
                    }
                    this.f180849f.f180845a = this.f180848e;
                }
                return C13598b0.f38549a;
            }
        }

        public C63787m(C63774j0 j0Var) {
            this.f180846b = j0Var;
        }

        /* renamed from: a */
        public void mo79982a(C58010a aVar, long j) {
            C61926c.m72668M(new C63788a(this.f180846b, j, this));
        }
    }

    /* renamed from: sb2.j0$n */
    public static final class C63789n extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180850d;

        public C63789n(C63774j0 j0Var) {
            this.f180850d = j0Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C60695a player;
            C60695a player2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                if (this.f180850d.mo88578e3().getChildCount() <= 0) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                    return;
                }
                float paddingStart = (float) (this.f180850d.mo88578e3().getPaddingStart() - this.f180850d.mo88578e3().getChildAt(0).getLeft());
                C63774j0 j0Var = this.f180850d;
                long j = (long) (paddingStart / j0Var.f180827v);
                C60699c cVar = j0Var.f180823r;
                if (!(cVar == null || (player2 = cVar.getPlayer()) == null)) {
                    player2.mo85603a(j, this.f180850d.f180826u + j);
                }
                C60699c cVar2 = this.f180850d.f180823r;
                if (!(cVar2 == null || (player = cVar2.getPlayer()) == null)) {
                    C60695a.C60696a.m70999b(player, (int) j, true, (C32226l) null, 4, (Object) null);
                }
                C63774j0.m75027c3(this.f180850d);
                C63774j0 j0Var2 = this.f180850d;
                C59811e eVar = j0Var2.f180828w;
                if (eVar != null) {
                    j0Var2.f180809F.f180845a = 0;
                    C99364n.m129616h().mo138822a().mo32203a(eVar.f170725e);
                }
                this.f180850d.f180805B = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (this.f180850d.mo88578e3().getChildCount() <= 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            float paddingStart = (float) (this.f180850d.mo88578e3().getPaddingStart() - this.f180850d.mo88578e3().getChildAt(0).getLeft());
            C63774j0 j0Var = this.f180850d;
            j0Var.f180807D = (long) (paddingStart / j0Var.f180827v);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: sb2.j0$o */
    public static final class C63790o extends C87413o implements C32224a<MusicMvSliderSeekBar> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63790o(C63774j0 j0Var) {
            super(0);
            this.f180851d = j0Var;
        }

        public Object invoke() {
            return this.f180851d.mo88582j3().f166804e;
        }
    }

    /* renamed from: sb2.j0$p */
    public static final class C63791p extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180852d;

        public C63791p(C63774j0 j0Var) {
            this.f180852d = j0Var;
        }

        public void onAnimationEnd(Animator animator) {
            ((RoundedCornerFrameLayout) ((C36570n) this.f180852d.f180814f).getValue()).setAlpha(1.0f);
        }

        public void onAnimationStart(Animator animator) {
            ((RoundedCornerFrameLayout) ((C36570n) this.f180852d.f180814f).getValue()).setAlpha(0.0f);
        }
    }

    /* renamed from: sb2.j0$q */
    public static final class C63792q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180853d;

        public C63792q(C63774j0 j0Var) {
            this.f180853d = j0Var;
        }

        public final void run() {
            this.f180853d.mo88579f3().setVisibility(8);
            this.f180853d.mo88583k3();
        }
    }

    /* renamed from: sb2.j0$r */
    public static final class C63793r extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63793r(C63774j0 j0Var) {
            super(0);
            this.f180854d = j0Var;
        }

        public Object invoke() {
            return this.f180854d.mo88582j3().f166802c;
        }
    }

    /* renamed from: sb2.j0$s */
    public static final class C63794s extends C87413o implements C32224a<C58254c> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63794s(C63774j0 j0Var) {
            super(0);
            this.f180855d = j0Var;
        }

        public Object invoke() {
            View findViewById = this.f180855d.findViewById(C0966R.C0970id.h8d);
            int i = C0966R.C0970id.f358816h80;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f358816h80);
            if (linearLayout != null) {
                i = C0966R.C0970id.f358817h81;
                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f358817h81);
                if (linearLayout2 != null) {
                    i = C0966R.C0970id.f358818h82;
                    ImageView imageView = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f358818h82);
                    if (imageView != null) {
                        i = C0966R.C0970id.f358819h83;
                        RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.f358819h83);
                        if (recyclerView != null) {
                            i = C0966R.C0970id.h84;
                            MusicMvSliderSeekBar musicMvSliderSeekBar = (MusicMvSliderSeekBar) C10462b.m10395a(findViewById, C0966R.C0970id.h84);
                            if (musicMvSliderSeekBar != null) {
                                i = C0966R.C0970id.h8c;
                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.h8c);
                                if (textView != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) findViewById;
                                    i = C0966R.C0970id.h8e;
                                    FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.h8e);
                                    if (frameLayout != null) {
                                        i = C0966R.C0970id.h8f;
                                        TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.h8f);
                                        if (textView2 != null) {
                                            i = C0966R.C0970id.h8g;
                                            LinearLayout linearLayout4 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.h8g);
                                            if (linearLayout4 != null) {
                                                i = C0966R.C0970id.h8h;
                                                RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.h8h);
                                                if (roundedCornerFrameLayout != null) {
                                                    return new C58254c(linearLayout3, linearLayout, linearLayout2, imageView, recyclerView, musicMvSliderSeekBar, textView, linearLayout3, frameLayout, textView2, linearLayout4, roundedCornerFrameLayout);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: sb2.j0$t */
    public static final class C63795t extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63795t(C63774j0 j0Var) {
            super(0);
            this.f180856d = j0Var;
        }

        public Object invoke() {
            return this.f180856d.mo88582j3().f166807h;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63774j0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f180819n = C36568h.m40985a(new C63782h(appCompatActivity));
        this.f180820o = C36568h.m40985a(new C63778d(this));
        this.f180821p = C36568h.m40985a(new C63790o(this));
        this.f180822q = C36568h.m40985a(new C63783i(this));
        this.f180829x = Integer.MAX_VALUE;
        this.f180831z = Integer.MAX_VALUE;
        this.f180806C = C76577a.m92151b(appCompatActivity, 48);
        this.f180807D = -1;
        this.f180808E = C53930o0.m60555b();
        this.f180809F = new C63787m(this);
        this.f180810G = new C63789n(this);
    }

    /* renamed from: c3 */
    public static final void m75027c3(C63774j0 j0Var) {
        C59338a effector;
        C59811e eVar = j0Var.f180828w;
        if (eVar != null) {
            int i = eVar.f170725e;
            if (eVar.f170732o != null && i <= j0Var.f180829x) {
                Log.m105924i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "tryCatchFirstFrame, timeInMv:" + i + ", firstRenderTime:" + j0Var.f180829x);
                C60699c cVar = j0Var.f180823r;
                if (cVar != null && (effector = cVar.getEffector()) != null) {
                    effector.mo84440b(new C63815n0(i, j0Var));
                }
            }
        }
    }

    /* renamed from: d3 */
    public final C63776b mo88577d3() {
        return (C63776b) ((C36570n) this.f180820o).getValue();
    }

    /* renamed from: e3 */
    public final RecyclerView mo88578e3() {
        return (RecyclerView) ((C36570n) this.f180818j).getValue();
    }

    /* renamed from: f3 */
    public final LinearLayout mo88579f3() {
        return (LinearLayout) ((C36570n) this.f180813e).getValue();
    }

    /* renamed from: g3 */
    public final MusicMvSliderSeekBar mo88580g3() {
        return (MusicMvSliderSeekBar) ((C36570n) this.f180821p).getValue();
    }

    /* renamed from: i3 */
    public final ImageView mo88581i3() {
        return (ImageView) ((C36570n) this.f180816h).getValue();
    }

    /* renamed from: j3 */
    public final C58254c mo88582j3() {
        return (C58254c) ((C36570n) this.f180812d).getValue();
    }

    /* renamed from: k3 */
    public final void mo88583k3() {
        FrameListView2 frameListView2;
        int itemCount = mo88577d3().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.C16631z I0 = mo88578e3().mo17023I0(i);
            C63777c cVar = I0 instanceof C63777c ? (C63777c) I0 : null;
            if (!(cVar == null || (frameListView2 = cVar.f180835z) == null)) {
                C36777d dVar = frameListView2.f163445t;
                if (dVar != null) {
                    dVar.destroy();
                }
                frameListView2.f163445t = null;
                frameListView2.f163434f = null;
                Log.m105924i(frameListView2.f163432d, "clearThumb");
                frameListView2.f163435g.clear();
                frameListView2.f163436h = null;
                frameListView2.postInvalidate();
            }
        }
        mo88577d3().f180833e = null;
        mo88578e3().postInvalidate();
    }

    /* renamed from: l3 */
    public final void mo88584l3(boolean z) {
        C60695a player;
        Class cls = MusicMvMakerFixEditUIC.class;
        Log.m105924i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "setShow:" + z);
        if (z) {
            mo88581i3().setImageDrawable((Drawable) null);
            ((MusicMvMakerFixEditUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo80478j3();
            mo88579f3().setVisibility(0);
            mo88579f3().animate().alpha(1.0f).setDuration(250).setListener(new C63791p(this)).start();
            return;
        }
        mo88581i3().setImageDrawable((Drawable) null);
        C60699c cVar = this.f180823r;
        if (!(cVar == null || (player = cVar.getPlayer()) == null)) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
        mo88583k3();
        MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = (MusicMvMakerFixEditUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls);
        musicMvMakerFixEditUIC.getClass();
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "resumeVideo");
        musicMvMakerFixEditUIC.mo80475f3().notifyItemChanged(musicMvMakerFixEditUIC.f163339n.f187878m);
        mo88579f3().animate().alpha(0.0f).withEndAction(new C63792q(this)).start();
    }

    public boolean onBackPressed() {
        if (mo88579f3().getVisibility() != 0) {
            return super.onBackPressed();
        }
        C63775a aVar = this.f180811H;
        if (aVar == null) {
            return true;
        }
        aVar.mo80377a(this.f180805B);
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [j03.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar r4 = r3.mo88580g3()
            r0 = -1
            r4.setCursorColor(r0)
            com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar r4 = r3.mo88580g3()
            androidx.appcompat.app.AppCompatActivity r1 = r3.getActivity()
            r2 = 2
            int r1 = kg3.C76577a.m92151b(r1, r2)
            r4.setCursorWidth(r1)
            db2.c r4 = r3.mo88582j3()
            android.widget.LinearLayout r4 = r4.f166800a
            sb2.j0$j r1 = new sb2.j0$j
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            db2.c r4 = r3.mo88582j3()
            android.widget.LinearLayout r4 = r4.f166801b
            sb2.j0$k r1 = new sb2.j0$k
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            android.widget.LinearLayout r4 = r3.mo88579f3()
            r1 = 0
            r4.setAlpha(r1)
            androidx.recyclerview.widget.RecyclerView r4 = r3.mo88578e3()
            sb2.j0$b r1 = r3.mo88577d3()
            r4.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r4 = r3.mo88578e3()
            rx3.g r1 = r3.f180819n
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r4.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r4 = r3.mo88578e3()
            sb2.j0$n r1 = r3.f180810G
            r4.mo17043c(r1)
            java.lang.Class<dz.f> r4 = p501dz.C58464f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            dz.f r4 = (p501dz.C58464f) r4
            androidx.appcompat.app.AppCompatActivity r1 = r3.getActivity()
            r2 = 0
            j03.c r4 = r4.mo82803ux(r1, r2)
            r3.f180823r = r4
            if (r4 == 0) goto L_0x007c
            r4.mo81116a()
        L_0x007c:
            j03.c r4 = r3.f180823r
            boolean r1 = r4 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L_0x0086
            android.view.View r4 = (android.view.View) r4
            goto L_0x0087
        L_0x0086:
            r4 = r2
        L_0x0087:
            if (r4 != 0) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            r1 = 1
            r4.setKeepScreenOn(r1)
        L_0x008e:
            j03.c r4 = r3.f180823r
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x0097
            r2 = r4
            android.view.View r2 = (android.view.View) r2
        L_0x0097:
            if (r2 != 0) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            r4 = 2131309855(0x7f09351f, float:1.8238006E38)
            r2.setId(r4)
        L_0x00a0:
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r0, r0)
            r0 = 17
            r4.gravity = r0
            rx3.g r0 = r3.f180815g
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            j03.c r1 = r3.f180823r
            java.lang.String r2 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r1, r2)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63774j0.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C59338a effector;
        C60695a player;
        super.onDestroy();
        C60699c cVar = this.f180823r;
        if (!(cVar == null || (player = cVar.getPlayer()) == null)) {
            player.recycle();
        }
        C60699c cVar2 = this.f180823r;
        if (!(cVar2 == null || (effector = cVar2.getEffector()) == null)) {
            effector.release();
        }
        C110794b.f331445i.getClass();
        C110794b.f331444h.evictAll();
    }
}
