package m23;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.caption.EditorCaptionLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fm0.C86971p1;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C64368fm;

/* renamed from: m23.o */
public final class C10718o extends LinearLayout {

    /* renamed from: J */
    public static final /* synthetic */ int f32149J = 0;

    /* renamed from: A */
    public final List<C10730i> f32150A;

    /* renamed from: B */
    public C32224a<C13598b0> f32151B;

    /* renamed from: C */
    public C32226l<? super Long, C13598b0> f32152C;

    /* renamed from: D */
    public C32226l<? super Integer, C13598b0> f32153D;

    /* renamed from: E */
    public C32227p<? super Integer, ? super Boolean, C13598b0> f32154E;

    /* renamed from: F */
    public C32227p<? super Integer, ? super C64368fm, C13598b0> f32155F;

    /* renamed from: G */
    public C32224a<C13598b0> f32156G;

    /* renamed from: H */
    public List<Integer> f32157H;

    /* renamed from: I */
    public boolean f32158I;

    /* renamed from: d */
    public final C13601g f32159d = C36568h.m40985a(new C10734k(this));

    /* renamed from: e */
    public final C13601g f32160e = C36568h.m40985a(new C10737n(this));

    /* renamed from: f */
    public final C13601g f32161f = C36568h.m40985a(new C10735l(this));

    /* renamed from: g */
    public final C13601g f32162g = C36568h.m40985a(new C10745v(this));

    /* renamed from: h */
    public final C13601g f32163h = C36568h.m40985a(new C10747x(this));

    /* renamed from: i */
    public final C13601g f32164i = C36568h.m40985a(new C10746w(this));

    /* renamed from: j */
    public final C13601g f32165j = C36568h.m40985a(new C10736m(this));

    /* renamed from: n */
    public final C13601g f32166n = C36568h.m40985a(new C10733j(this));

    /* renamed from: o */
    public final C13601g f32167o = C36568h.m40985a(new C10744u(this));

    /* renamed from: p */
    public final C13601g f32168p = C36568h.m40985a(new C10724c0(this));

    /* renamed from: q */
    public final C13601g f32169q = C36568h.m40985a(new C10722b0(this));

    /* renamed from: r */
    public final C13601g f32170r = C36568h.m40985a(new C10748y(this));

    /* renamed from: s */
    public final C13601g f32171s = C36568h.m40985a(new C10720a0(this));

    /* renamed from: t */
    public final C13601g f32172t = C36568h.m40985a(new C10749z(this));

    /* renamed from: u */
    public final C13601g f32173u = C36568h.m40985a(new C10739p(this));

    /* renamed from: v */
    public final C13601g f32174v = C36568h.m40985a(new C10738o(this));

    /* renamed from: w */
    public final C13601g f32175w = C36568h.m40985a(new C10741r(this));

    /* renamed from: x */
    public final C13601g f32176x = C36568h.m40985a(new C10742s(this));

    /* renamed from: y */
    public final C13601g f32177y = C36568h.m40985a(new C10740q(this));

    /* renamed from: z */
    public final C13601g f32178z = C36568h.m40985a(new C10743t(this));

    /* renamed from: m23.o$a */
    public static final class C10719a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32179d;

        public C10719a(C10718o oVar) {
            this.f32179d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10718o.m10715h(this.f32179d, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.o$a0 */
    public static final class C10720a0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10720a0(C10718o oVar) {
            super(0);
            this.f32180d = oVar;
        }

        public Object invoke() {
            return this.f32180d.findViewById(C0966R.C0970id.ihc);
        }
    }

    /* renamed from: m23.o$b */
    public static final class C10721b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32181d;

        public C10721b(C10718o oVar) {
            this.f32181d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10718o.m10715h(this.f32181d, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.o$b0 */
    public static final class C10722b0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10722b0(C10718o oVar) {
            super(0);
            this.f32182d = oVar;
        }

        public Object invoke() {
            return (TextView) this.f32182d.findViewById(C0966R.C0970id.iib);
        }
    }

    /* renamed from: m23.o$c */
    public static final class C10723c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32183d;

        public C10723c(C10718o oVar) {
            this.f32183d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> dismissListener = this.f32183d.getDismissListener();
            if (dismissListener != null) {
                dismissListener.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.o$c0 */
    public static final class C10724c0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10724c0(C10718o oVar) {
            super(0);
            this.f32184d = oVar;
        }

        public Object invoke() {
            return (TextView) this.f32184d.findViewById(C0966R.C0970id.kth);
        }
    }

    /* renamed from: m23.o$d */
    public static final class C10725d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32185d;

        public C10725d(C10718o oVar) {
            this.f32185d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f32185d.getContentLayout().setVisibility(0);
            this.f32185d.getEmptyLayout().setVisibility(4);
            C32226l<Integer, C13598b0> startTransListener = this.f32185d.getStartTransListener();
            if (startTransListener != null) {
                startTransListener.invoke(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.o$e */
    public static final class C10726e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32186d;

        public C10726e(C10718o oVar) {
            this.f32186d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10718o oVar = this.f32186d;
            int i = C10718o.f32149J;
            oVar.mo10965i(0, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.o$f */
    public static final class C10727f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32187d;

        public C10727f(C10718o oVar) {
            this.f32187d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f32187d.getRecordContentLayout().setVisibility(0);
            this.f32187d.getRecordEmptyLayout().setVisibility(4);
            C32226l<Integer, C13598b0> startTransListener = this.f32187d.getStartTransListener();
            if (startTransListener != null) {
                startTransListener.invoke(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.o$g */
    public static final class C10728g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32188d;

        public C10728g(C10718o oVar) {
            this.f32188d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10718o oVar = this.f32188d;
            int i = C10718o.f32149J;
            oVar.mo10965i(1, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.o$h */
    public final class C10729h extends RecyclerView.C0130p {

        /* renamed from: d */
        public final int f32189d;

        public C10729h(int i) {
            this.f32189d = i;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C10718o oVar = C10718o.this;
                if (oVar.f32158I) {
                    long j = oVar.f32150A.get(this.f32189d).f32193f.get(C10718o.this.f32157H.get(this.f32189d).intValue()).f183149e;
                    C32226l<Long, C13598b0> videoSeekListener = C10718o.this.getVideoSeekListener();
                    if (videoSeekListener != null) {
                        if (j >= 2147483637) {
                            j = 0;
                        }
                        videoSeekListener.invoke(Long.valueOf(j));
                    }
                    C10718o oVar2 = C10718o.this;
                    oVar2.f32158I = false;
                    C10718o.m10714g(oVar2, this.f32189d);
                }
            } else if (i == 1) {
                Log.m105918d("MicroMsg.EditorTextCaptionView", "SCROLL_STATE_DRAGGING");
                C10718o oVar3 = C10718o.this;
                oVar3.f32158I = true;
                C32224a<C13598b0> videoPauseListener = oVar3.getVideoPauseListener();
                if (videoPauseListener != null) {
                    videoPauseListener.invoke();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C10718o oVar = C10718o.this;
            if (!oVar.f32158I) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            int intValue = oVar.f32157H.get(this.f32189d).intValue();
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) C10718o.this.getCaptionViews().get(this.f32189d)).getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int C = (linearLayoutManager.mo16957C() + linearLayoutManager.mo16959E()) / 2;
            if (C == C10718o.this.f32150A.get(this.f32189d).f32194g) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            int i3 = C - 1;
            int i4 = C + 1;
            if (i3 <= i4) {
                while (true) {
                    if (!C10718o.m10713f(C10718o.this, this.f32189d, linearLayoutManager.findViewByPosition(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3++;
                    } else {
                        C10718o.this.f32157H.set(this.f32189d, Integer.valueOf(i3));
                        C10718o.this.f32150A.get(this.f32189d).f32194g = C10718o.this.f32157H.get(this.f32189d).intValue();
                        C10718o.this.f32150A.get(this.f32189d).mo10984G4(linearLayoutManager.findViewByPosition(intValue));
                        C10718o.this.f32150A.get(this.f32189d).mo10983F4(linearLayoutManager.findViewByPosition(C10718o.this.f32157H.get(this.f32189d).intValue()), (C64368fm) null);
                        Log.m105918d("MicroMsg.EditorTextCaptionView", "onScrolled currentPos  " + C10718o.this.f32157H + ' ' + intValue);
                        break;
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: m23.o$i */
    public final class C10730i extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final int f32191d;

        /* renamed from: e */
        public Context f32192e;

        /* renamed from: f */
        public ArrayList<C64368fm> f32193f = new ArrayList<>();

        /* renamed from: g */
        public int f32194g;

        /* renamed from: h */
        public final /* synthetic */ C10718o f32195h;

        /* renamed from: m23.o$i$a */
        public static final class C10731a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C10730i f32196d;

            /* renamed from: e */
            public final /* synthetic */ int f32197e;

            /* renamed from: f */
            public final /* synthetic */ C10718o f32198f;

            public C10731a(C10730i iVar, int i, C10718o oVar) {
                this.f32196d = iVar;
                this.f32197e = i;
                this.f32198f = oVar;
            }

            public final void onClick(View view) {
                C32227p<Integer, C64368fm, C13598b0> itemClickListener;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!this.f32196d.f32193f.get(this.f32197e).f183151g && (itemClickListener = this.f32198f.getItemClickListener()) != null) {
                    Integer valueOf = Integer.valueOf(this.f32196d.f32191d);
                    C64368fm fmVar = this.f32196d.f32193f.get(this.f32197e);
                    C87412m.m108593f(fmVar, "captionItems[position]");
                    itemClickListener.invoke(valueOf, fmVar);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: m23.o$i$b */
        public static final class C10732b extends RecyclerView.C16631z {
            public C10732b(ViewGroup viewGroup) {
                super(viewGroup);
            }
        }

        public C10730i(C10718o oVar, int i, Context context) {
            C87412m.m108594g(context, "context");
            this.f32195h = oVar;
            this.f32191d = i;
            this.f32192e = context;
        }

        /* renamed from: F4 */
        public final void mo10983F4(View view, C64368fm fmVar) {
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "selectView", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "selectView", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.aqj);
                boolean z = true;
                if (fmVar == null || !fmVar.f183151g) {
                    z = false;
                }
                if (z) {
                    imageView.setVisibility(4);
                    return;
                }
                imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_pencil, -1));
                imageView.setVisibility(0);
            }
        }

        /* renamed from: G4 */
        public final void mo10984G4(View view) {
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.5f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "unSelectView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "unSelectView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ((ImageView) view.findViewById(C0966R.C0970id.aqj)).setVisibility(4);
            }
        }

        public int getItemCount() {
            return this.f32193f.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "viewHolder");
            View view = zVar.f44854d;
            C87412m.m108593f(view, "viewHolder.itemView");
            C89349b bVar = this.f32193f.get(i).f183148d;
            String str = "";
            if (TextUtils.isEmpty(bVar == null ? str : bVar.mo123704g("UTF-8")) || this.f32193f.get(i).f183151g) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f32194g == i) {
                    mo10983F4(view, this.f32193f.get(i));
                } else {
                    mo10984G4(view);
                }
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.aqh);
                C89349b bVar2 = this.f32193f.get(i).f183148d;
                if (bVar2 != null) {
                    str = bVar2.mo123704g("UTF-8");
                }
                textView.setText(str);
            }
            zVar.f44854d.setOnClickListener(new C10731a(this, i, this.f32195h));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f32192e).inflate(C0966R.C0971layout.a0v, viewGroup, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return new C10732b((ViewGroup) inflate);
        }
    }

    /* renamed from: m23.o$j */
    public static final class C10733j extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10733j(C10718o oVar) {
            super(0);
            this.f32199d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f32199d.findViewById(C0966R.C0970id.aqs);
        }
    }

    /* renamed from: m23.o$k */
    public static final class C10734k extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10734k(C10718o oVar) {
            super(0);
            this.f32200d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f32200d.findViewById(C0966R.C0970id.aqv);
        }
    }

    /* renamed from: m23.o$l */
    public static final class C10735l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10735l(C10718o oVar) {
            super(0);
            this.f32201d = oVar;
        }

        public Object invoke() {
            return this.f32201d.findViewById(C0966R.C0970id.aqw);
        }
    }

    /* renamed from: m23.o$m */
    public static final class C10736m extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10736m(C10718o oVar) {
            super(0);
            this.f32202d = oVar;
        }

        public Object invoke() {
            return this.f32202d.findViewById(C0966R.C0970id.aqx);
        }
    }

    /* renamed from: m23.o$n */
    public static final class C10737n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10737n(C10718o oVar) {
            super(0);
            this.f32203d = oVar;
        }

        public Object invoke() {
            return (TextView) this.f32203d.findViewById(C0966R.C0970id.aqy);
        }
    }

    /* renamed from: m23.o$o */
    public static final class C10738o extends C87413o implements C32224a<List<? extends RecyclerView>> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10738o(C10718o oVar) {
            super(0);
            this.f32204d = oVar;
        }

        public Object invoke() {
            return C64197v.m75537f((RecyclerView) this.f32204d.findViewById(C0966R.C0970id.aqm), (RecyclerView) this.f32204d.findViewById(C0966R.C0970id.iha));
        }
    }

    /* renamed from: m23.o$p */
    public static final class C10739p extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10739p(C10718o oVar) {
            super(0);
            this.f32205d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f32205d.findViewById(C0966R.C0970id.bdi);
        }
    }

    /* renamed from: m23.o$q */
    public static final class C10740q extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10740q(C10718o oVar) {
            super(0);
            this.f32206d = oVar;
        }

        public Object invoke() {
            return (LinearLayout) this.f32206d.findViewById(C0966R.C0970id.aqn);
        }
    }

    /* renamed from: m23.o$r */
    public static final class C10741r extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10741r(C10718o oVar) {
            super(0);
            this.f32207d = oVar;
        }

        public Object invoke() {
            LinearLayout linearLayout = (LinearLayout) this.f32207d.findViewById(C0966R.C0970id.f357934cj3);
            this.f32207d.setOnClickListener(C10750p.f32216d);
            return linearLayout;
        }
    }

    /* renamed from: m23.o$s */
    public static final class C10742s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10742s(C10718o oVar) {
            super(0);
            this.f32208d = oVar;
        }

        public Object invoke() {
            return (TextView) this.f32208d.findViewById(C0966R.C0970id.aqz);
        }
    }

    /* renamed from: m23.o$t */
    public static final class C10743t extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10743t(C10718o oVar) {
            super(0);
            this.f32209d = oVar;
        }

        public Object invoke() {
            return this.f32209d.findViewById(C0966R.C0970id.aqr);
        }
    }

    /* renamed from: m23.o$u */
    public static final class C10744u extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10744u(C10718o oVar) {
            super(0);
            this.f32210d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f32210d.findViewById(C0966R.C0970id.ihd);
        }
    }

    /* renamed from: m23.o$v */
    public static final class C10745v extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10745v(C10718o oVar) {
            super(0);
            this.f32211d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f32211d.findViewById(C0966R.C0970id.ihe);
        }
    }

    /* renamed from: m23.o$w */
    public static final class C10746w extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10746w(C10718o oVar) {
            super(0);
            this.f32212d = oVar;
        }

        public Object invoke() {
            return this.f32212d.findViewById(C0966R.C0970id.ihf);
        }
    }

    /* renamed from: m23.o$x */
    public static final class C10747x extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10747x(C10718o oVar) {
            super(0);
            this.f32213d = oVar;
        }

        public Object invoke() {
            return (TextView) this.f32213d.findViewById(C0966R.C0970id.ihg);
        }
    }

    /* renamed from: m23.o$y */
    public static final class C10748y extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10748y(C10718o oVar) {
            super(0);
            this.f32214d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f32214d.findViewById(C0966R.C0970id.ihb);
        }
    }

    /* renamed from: m23.o$z */
    public static final class C10749z extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C10718o f32215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10749z(C10718o oVar) {
            super(0);
            this.f32215d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f32215d.findViewById(C0966R.C0970id.ihk);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10718o(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f32150A = C64197v.m75537f(new C10730i(this, 0, context), new C10730i(this, 1, context));
        this.f32157H = C64197v.m75539h(0, 0);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.a0w, this, true);
        setBackgroundResource(C0966R.C0969drawable.f4522ez);
        setOrientation(1);
        getContentLayout().setVisibility(4);
        getEmptyLayout().setVisibility(0);
        getCaptionTab().setOnClickListener(new C10719a(this));
        getRecordCaptionTab().setOnClickListener(new C10721b(this));
        findViewById(C0966R.C0970id.aqg).setOnClickListener(new C10723c(this));
        findViewById(C0966R.C0970id.kth).setOnClickListener(new C10725d(this));
        findViewById(C0966R.C0970id.bdf).setOnClickListener(new C10726e(this));
        getRecordTransBtn().setOnClickListener(new C10727f(this));
        getClearRecordBtn().setOnClickListener(new C10728g(this));
        for (int i = 0; i < 2; i++) {
            getCaptionViews().get(i).setLayoutManager(new EditorCaptionLayoutManager(context, 1));
            getCaptionViews().get(i).setAdapter(this.f32150A.get(i));
            getCaptionViews().get(i).mo17043c(new C10729h(i));
        }
    }

    /* renamed from: f */
    public static final boolean m10713f(C10718o oVar, int i, View view) {
        if (view == null) {
            oVar.getClass();
            return false;
        }
        int top = (oVar.getCaptionViews().get(i).getTop() + oVar.getCaptionViews().get(i).getBottom()) / 2;
        return top < view.getBottom() && view.getTop() <= top;
    }

    /* renamed from: g */
    public static final void m10714g(C10718o oVar, int i) {
        RecyclerView.LayoutManager layoutManager = oVar.getCaptionViews().get(i).getLayoutManager();
        if (layoutManager != null) {
            layoutManager.smoothScrollToPosition(oVar.getCaptionViews().get(i), new RecyclerView.C16628w(), oVar.f32157H.get(i).intValue());
        }
    }

    private final ViewGroup getCaptionPanel() {
        return (ViewGroup) ((C36570n) this.f32166n).getValue();
    }

    private final ViewGroup getCaptionTab() {
        return (ViewGroup) ((C36570n) this.f32159d).getValue();
    }

    private final View getCaptionTabIndicator() {
        return (View) ((C36570n) this.f32161f).getValue();
    }

    private final View getCaptionTabSpace() {
        return (View) ((C36570n) this.f32165j).getValue();
    }

    private final TextView getCaptionTabText() {
        return (TextView) ((C36570n) this.f32160e).getValue();
    }

    /* access modifiers changed from: private */
    public final List<RecyclerView> getCaptionViews() {
        return (List) ((C36570n) this.f32174v).getValue();
    }

    private final ViewGroup getClearRecordBtn() {
        return (ViewGroup) ((C36570n) this.f32173u).getValue();
    }

    /* access modifiers changed from: private */
    public final LinearLayout getContentLayout() {
        return (LinearLayout) ((C36570n) this.f32177y).getValue();
    }

    /* access modifiers changed from: private */
    public final LinearLayout getEmptyLayout() {
        return (LinearLayout) ((C36570n) this.f32175w).getValue();
    }

    private final TextView getEmptyTipTxt() {
        return (TextView) ((C36570n) this.f32176x).getValue();
    }

    private final View getLoadingView() {
        return (View) ((C36570n) this.f32178z).getValue();
    }

    private final ViewGroup getRecordCaptionPanel() {
        return (ViewGroup) ((C36570n) this.f32167o).getValue();
    }

    private final ViewGroup getRecordCaptionTab() {
        return (ViewGroup) ((C36570n) this.f32162g).getValue();
    }

    private final View getRecordCaptionTabIndicator() {
        return (View) ((C36570n) this.f32164i).getValue();
    }

    private final TextView getRecordCaptionTabText() {
        return (TextView) ((C36570n) this.f32163h).getValue();
    }

    /* access modifiers changed from: private */
    public final ViewGroup getRecordContentLayout() {
        return (ViewGroup) ((C36570n) this.f32170r).getValue();
    }

    /* access modifiers changed from: private */
    public final ViewGroup getRecordEmptyLayout() {
        return (ViewGroup) ((C36570n) this.f32172t).getValue();
    }

    private final View getRecordLoadingView() {
        return (View) ((C36570n) this.f32171s).getValue();
    }

    private final TextView getRecordTransBtn() {
        return (TextView) ((C36570n) this.f32169q).getValue();
    }

    private final TextView getTransBtn() {
        return (TextView) ((C36570n) this.f32168p).getValue();
    }

    /* renamed from: h */
    public static final void m10715h(C10718o oVar, int i) {
        oVar.getClass();
        if (i == 0) {
            View captionTabIndicator = oVar.getCaptionTabIndicator();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = captionTabIndicator;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            captionTabIndicator.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View recordCaptionTabIndicator = oVar.getRecordCaptionTabIndicator();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view2 = recordCaptionTabIndicator;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recordCaptionTabIndicator.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.getCaptionTabText().setTextColor(oVar.getContext().getResources().getColor(C0966R.color.al_));
            oVar.getRecordCaptionTabText().setTextColor(oVar.getContext().getResources().getColor(C0966R.color.ala));
            oVar.getCaptionPanel().setVisibility(0);
            oVar.getRecordCaptionPanel().setVisibility(8);
            return;
        }
        View captionTabIndicator2 = oVar.getCaptionTabIndicator();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(4);
        View view3 = captionTabIndicator2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        captionTabIndicator2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View recordCaptionTabIndicator2 = oVar.getRecordCaptionTabIndicator();
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view4 = recordCaptionTabIndicator2;
        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recordCaptionTabIndicator2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", C86971p1.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar.getCaptionTabText().setTextColor(oVar.getContext().getResources().getColor(C0966R.color.ala));
        oVar.getRecordCaptionTabText().setTextColor(oVar.getContext().getResources().getColor(C0966R.color.al_));
        oVar.getCaptionPanel().setVisibility(8);
        oVar.getRecordCaptionPanel().setVisibility(0);
    }

    public final C32227p<Integer, Boolean, C13598b0> getClearTransListener() {
        return this.f32154E;
    }

    public final C32224a<C13598b0> getDismissListener() {
        return this.f32156G;
    }

    public final C32227p<Integer, C64368fm, C13598b0> getItemClickListener() {
        return this.f32155F;
    }

    public final C32226l<Integer, C13598b0> getStartTransListener() {
        return this.f32153D;
    }

    public final C32224a<C13598b0> getVideoPauseListener() {
        return this.f32151B;
    }

    public final C32226l<Long, C13598b0> getVideoSeekListener() {
        return this.f32152C;
    }

    /* renamed from: i */
    public final void mo10965i(int i, String str) {
        this.f32150A.get(i).f32193f.clear();
        this.f32150A.get(i).notifyDataSetChanged();
        boolean z = false;
        if (i == 0) {
            View loadingView = getLoadingView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = loadingView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getContentLayout().setVisibility(4);
            getEmptyLayout().setVisibility(0);
        } else {
            View recordLoadingView = getRecordLoadingView();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view2 = recordLoadingView;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recordLoadingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getRecordContentLayout().setVisibility(4);
            getRecordEmptyLayout().setVisibility(0);
        }
        if (str != null) {
            getEmptyTipTxt().setText(str);
        }
        C32227p<? super Integer, ? super Boolean, C13598b0> pVar = this.f32154E;
        if (pVar != null) {
            Integer valueOf = Integer.valueOf(i);
            if (getEmptyLayout().getVisibility() == 4 || getRecordEmptyLayout().getVisibility() == 4) {
                z = true;
            }
            pVar.invoke(valueOf, Boolean.valueOf(z));
        }
    }

    /* renamed from: j */
    public final void mo10966j(int i, long j) {
        boolean z;
        int i2 = i;
        if (!this.f32158I && !this.f32150A.get(i2).f32193f.isEmpty()) {
            int intValue = this.f32157H.get(i2).intValue();
            if (this.f32157H.get(i2).intValue() >= this.f32150A.get(i2).f32193f.size()) {
                Log.m105924i("MicroMsg.EditorTextCaptionView", "maybe clear captionItems");
                this.f32157H.set(i2, Integer.valueOf(this.f32150A.get(i2).f32193f.size() - 1));
            }
            if (this.f32150A.get(i2).f32193f.get(this.f32157H.get(i2).intValue()).f183149e > j) {
                this.f32157H.set(i2, 0);
                z = true;
            } else {
                z = false;
            }
            while (this.f32150A.get(i2).f32193f.get(this.f32157H.get(i2).intValue()).f183150f < j) {
                List<Integer> list = this.f32157H;
                list.set(i2, Integer.valueOf(list.get(i2).intValue() + 1));
            }
            this.f32150A.get(i2).f32194g = this.f32157H.get(i2).intValue();
            if (z) {
                RecyclerView recyclerView = getCaptionViews().get(i2);
                int intValue2 = this.f32157H.get(i2).intValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(intValue2));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "time2Pos", "(IJ)I", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "time2Pos", "(IJ)I", "Undefined", "scrollToPosition", "(I)V");
            }
            this.f32157H.get(i2).intValue();
            RecyclerView.LayoutManager layoutManager = getCaptionViews().get(i2).getLayoutManager();
            if (layoutManager != null) {
                layoutManager.smoothScrollToPosition(getCaptionViews().get(i2), new RecyclerView.C16628w(), this.f32157H.get(i2).intValue());
                this.f32150A.get(i2).mo10984G4(layoutManager.findViewByPosition(intValue));
                this.f32150A.get(i2).mo10983F4(layoutManager.findViewByPosition(this.f32157H.get(i2).intValue()), (C64368fm) null);
            }
        }
    }

    /* renamed from: k */
    public final void mo10967k(int i) {
        if (i == 0) {
            View loadingView = getLoadingView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = loadingView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getEmptyLayout().setVisibility(4);
            getContentLayout().setVisibility(0);
            return;
        }
        View recordLoadingView = getRecordLoadingView();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(4);
        C117292a.m165358d(recordLoadingView, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recordLoadingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(recordLoadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getRecordEmptyLayout().setVisibility(4);
        getRecordContentLayout().setVisibility(0);
    }

    /* renamed from: l */
    public final void mo10968l(int i) {
        if (i == 0) {
            View loadingView = getLoadingView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = loadingView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getContentLayout().setVisibility(4);
            getEmptyLayout().setVisibility(4);
            return;
        }
        View recordLoadingView = getRecordLoadingView();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(recordLoadingView, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recordLoadingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(recordLoadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getRecordContentLayout().setVisibility(4);
        getRecordEmptyLayout().setVisibility(4);
    }

    /* renamed from: m */
    public final void mo10969m(int i, C64368fm fmVar) {
        C87412m.m108594g(fmVar, "transResult");
        int i2 = 0;
        for (T next : this.f32150A.get(i).f32193f) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C64368fm fmVar2 = (C64368fm) next;
                if (fmVar2.f183152h == fmVar.f183152h) {
                    fmVar2.f183148d = fmVar.f183148d;
                    this.f32150A.get(i).notifyItemChanged(i2);
                    return;
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public final void setClearTransListener(C32227p<? super Integer, ? super Boolean, C13598b0> pVar) {
        this.f32154E = pVar;
    }

    public final void setDismissListener(C32224a<C13598b0> aVar) {
        this.f32156G = aVar;
    }

    public final void setItemClickListener(C32227p<? super Integer, ? super C64368fm, C13598b0> pVar) {
        this.f32155F = pVar;
    }

    public final void setStartTransListener(C32226l<? super Integer, C13598b0> lVar) {
        this.f32153D = lVar;
    }

    public final void setVideoPauseListener(C32224a<C13598b0> aVar) {
        this.f32151B = aVar;
    }

    public final void setVideoSeekListener(C32226l<? super Long, C13598b0> lVar) {
        this.f32152C = lVar;
    }
}
