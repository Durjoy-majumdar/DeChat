package com.tencent.p014mm.plugin.finder.live.plugin;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveFloatContainer;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ky3.C88334c;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qj1.C12521md;
import qj1.C12556nd;
import qj1.C12581od;
import qj1.C12602pd;
import qj1.C12624qd;
import qj1.C12648rd;
import qj1.C62660c;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C49765hx0;
import up1.C27696y;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin */
public final class FinderLiveRandomMatchLinkMicStatePlugin extends C62660c {

    /* renamed from: G */
    public static final float f15139G = MMApplicationContext.getResources().getDimension(C0966R.dimen.f3755d6);

    /* renamed from: A */
    public final C3175f f15140A = new C3175f(this);

    /* renamed from: B */
    public final AnimatorSet f15141B = new AnimatorSet();

    /* renamed from: C */
    public final ObjectAnimator f15142C;

    /* renamed from: D */
    public final ObjectAnimator f15143D;

    /* renamed from: E */
    public final ObjectAnimator f15144E;

    /* renamed from: F */
    public List<? extends C49765hx0> f15145F;

    /* renamed from: p */
    public final C58124b f15146p;

    /* renamed from: q */
    public final FinderLiveFloatContainer f15147q;

    /* renamed from: r */
    public final RecyclerView f15148r;

    /* renamed from: s */
    public final TextView f15149s;

    /* renamed from: t */
    public final View f15150t;

    /* renamed from: u */
    public C77407n f15151u;

    /* renamed from: v */
    public final C3171b f15152v;

    /* renamed from: w */
    public final LinearLayoutManager f15153w;

    /* renamed from: x */
    public MTimerHandler f15154x;

    /* renamed from: y */
    public final List<C3172c> f15155y = new ArrayList();

    /* renamed from: z */
    public final List<C3172c> f15156z = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$a */
    public static final class C3170a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f15157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3170a(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
            super(1);
            this.f15157d = finderLiveRandomMatchLinkMicStatePlugin;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = this.f15157d;
            if (((C54963d0) finderLiveRandomMatchLinkMicStatePlugin.mo87696x0(C54963d0.class)).mo75913U3()) {
                if (finderLiveRandomMatchLinkMicStatePlugin.f15151u == null) {
                    C77407n nVar = new C77407n(finderLiveRandomMatchLinkMicStatePlugin.f166287d.getContext(), 1, true);
                    finderLiveRandomMatchLinkMicStatePlugin.f15151u = nVar;
                    nVar.f225775k1 = true;
                }
                C77407n nVar2 = finderLiveRandomMatchLinkMicStatePlugin.f15151u;
                if (nVar2 != null) {
                    nVar2.f225792t1 = false;
                }
                if (nVar2 != null) {
                    nVar2.f225771i = new C12521md(finderLiveRandomMatchLinkMicStatePlugin);
                }
                if (nVar2 != null) {
                    nVar2.f225782p = new C12556nd(finderLiveRandomMatchLinkMicStatePlugin);
                }
                if (nVar2 != null) {
                    nVar2.f225761d = new C12581od(finderLiveRandomMatchLinkMicStatePlugin);
                }
                if (nVar2 != null) {
                    nVar2.mo107573q();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$b */
    public static final class C3171b extends RecyclerView.C16613e<C3173d> {

        /* renamed from: d */
        public final List<C3172c> f15158d = new ArrayList();

        public int getItemCount() {
            return Integer.MAX_VALUE;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C3173d dVar = (C3173d) zVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(dVar, "holder");
            ArrayList arrayList = (ArrayList) this.f15158d;
            C3172c cVar = (C3172c) arrayList.get(i % arrayList.size());
            String str = cVar.f15160b;
            C13598b0 b0Var = null;
            if (str != null) {
                C39818r rVar = C39818r.f106831a;
                C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
                C62345f fVar = new C62345f(str, (C27696y) null, 2, (C8480h) null);
                View view = dVar.f44854d;
                C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.ImageView");
                i2.mo85957c(fVar, (ImageView) view, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                b0Var = C13598b0.f38549a;
            } else {
                Bitmap bitmap = cVar.f15159a;
                if (bitmap != null) {
                    View view2 = dVar.f44854d;
                    C87412m.m108592e(view2, "null cannot be cast to non-null type android.widget.ImageView");
                    ((ImageView) view2).setImageBitmap(bitmap);
                    b0Var = C13598b0.f38549a;
                }
            }
            if (b0Var == null) {
                Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onBindViewHolder: empty data:" + cVar + " for position:" + (i % ((ArrayList) this.f15158d).size()));
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            ImageView imageView = new ImageView(viewGroup.getContext());
            int i2 = (int) FinderLiveRandomMatchLinkMicStatePlugin.f15139G;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, i2);
            marginLayoutParams.setMarginStart((int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3736cp));
            marginLayoutParams.setMarginEnd((int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3736cp));
            imageView.setLayoutParams(marginLayoutParams);
            return new C3173d(imageView);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$c */
    public static final class C3172c {

        /* renamed from: a */
        public Bitmap f15159a;

        /* renamed from: b */
        public String f15160b;

        public C3172c() {
            this((Bitmap) null, (String) null, 3, (C8480h) null);
        }

        public C3172c(Bitmap bitmap, String str, int i, C8480h hVar) {
            bitmap = (i & 1) != 0 ? null : bitmap;
            str = (i & 2) != 0 ? null : str;
            this.f15159a = bitmap;
            this.f15160b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3172c)) {
                return false;
            }
            C3172c cVar = (C3172c) obj;
            return C87412m.m108589b(this.f15159a, cVar.f15159a) && C87412m.m108589b(this.f15160b, cVar.f15160b);
        }

        public int hashCode() {
            Bitmap bitmap = this.f15159a;
            int i = 0;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            String str = this.f15160b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ItemData(bitmap=" + this.f15159a + ", url=" + this.f15160b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$d */
    public static final class C3173d extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3173d(ImageView imageView) {
            super(imageView);
            C87412m.m108594g(imageView, "itemView");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$e */
    public static final class C3174e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f15161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3174e(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
            super(0);
            this.f15161d = finderLiveRandomMatchLinkMicStatePlugin;
        }

        public Object invoke() {
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = this.f15161d;
            finderLiveRandomMatchLinkMicStatePlugin.f15147q.mo77918b(new C3186g(finderLiveRandomMatchLinkMicStatePlugin));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$f */
    public static final class C3175f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f15162d;

        public C3175f(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
            this.f15162d = finderLiveRandomMatchLinkMicStatePlugin;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            recyclerView.mo17098m1(this);
            if (i == 0) {
                int z = this.f15162d.f15153w.mo17004z();
                recyclerView.mo17023I0(z);
                Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onScrollStateChanged: SCROLL_STATE_IDLE, position:" + z + ", realPosition:" + (z % ((ArrayList) this.f15162d.f15156z).size()));
                this.f15162d.f15141B.start();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$g */
    public static final class C3176g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f15163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3176g(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
            super(0);
            this.f15163d = finderLiveRandomMatchLinkMicStatePlugin;
        }

        public Object invoke() {
            this.f15163d.mo10792g(0);
            FinderLiveFloatContainer finderLiveFloatContainer = this.f15163d.f15147q;
            C87412m.m108593f(finderLiveFloatContainer, "rootView");
            int i = FinderLiveFloatContainer.f159731G;
            finderLiveFloatContainer.mo77919c((C32224a<C13598b0>) null);
            RecyclerView recyclerView = this.f15163d.f15148r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = this.f15163d;
            finderLiveRandomMatchLinkMicStatePlugin.getClass();
            Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "startMatch");
            finderLiveRandomMatchLinkMicStatePlugin.f15149s.setVisibility(0);
            View view = finderLiveRandomMatchLinkMicStatePlugin.f15150t;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLiveRandomMatchLinkMicStatePlugin.mo3219Z0();
            C8478d0 d0Var = new C8478d0();
            if (finderLiveRandomMatchLinkMicStatePlugin.f15154x == null) {
                finderLiveRandomMatchLinkMicStatePlugin.f15154x = new MTimerHandler(new C12648rd(finderLiveRandomMatchLinkMicStatePlugin, d0Var), true);
            }
            MTimerHandler mTimerHandler = finderLiveRandomMatchLinkMicStatePlugin.f15154x;
            if (mTimerHandler != null) {
                mTimerHandler.startTimer(400);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveRandomMatchLinkMicStatePlugin(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f15146p = bVar;
        FinderLiveFloatContainer finderLiveFloatContainer = (FinderLiveFloatContainer) viewGroup.findViewById(C0966R.C0970id.f358226dy1);
        this.f15147q = finderLiveFloatContainer;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0966R.C0970id.dxz);
        this.f15148r = recyclerView;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.f358225dy0);
        this.f15149s = textView;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358227dy2);
        this.f15150t = findViewById;
        C3171b bVar2 = new C3171b();
        this.f15152v = bVar2;
        FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1 finderLiveRandomMatchLinkMicStatePlugin$layoutManager$1 = new FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1(viewGroup, viewGroup.getContext());
        this.f15153w = finderLiveRandomMatchLinkMicStatePlugin$layoutManager$1;
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{1.0f, 0.0f}).setDuration(300);
        C87412m.m108593f(duration, "ofFloat(stateTv, View.AL…ration(FADE_OUT_DURATION)");
        this.f15142C = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(findViewById, View.SCALE_X, new float[]{0.11f, 1.0f}).setDuration(400);
        C87412m.m108593f(duration2, "ofFloat(stateIv, View.SC…Duration(SPRING_DURATION)");
        this.f15143D = duration2;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(findViewById, View.SCALE_Y, new float[]{0.11f, 1.0f}).setDuration(400);
        C87412m.m108593f(duration3, "ofFloat(stateIv, View.SC…Duration(SPRING_DURATION)");
        this.f15144E = duration3;
        finderLiveFloatContainer.setOnClick(new C3170a(this));
        finderLiveFloatContainer.setDefaultTranslationY(C74942w4.m89784a(viewGroup.getContext(), 124));
        ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.f159734C;
        recyclerView.setAdapter(bVar2);
        recyclerView.setLayoutManager(finderLiveRandomMatchLinkMicStatePlugin$layoutManager$1);
        recyclerView.requestDisallowInterceptTouchEvent(false);
        finderLiveFloatContainer.setNeedInterceptTouchEvent(true);
        for (Number intValue : C64197v.m75537f(Integer.valueOf(C0966R.C0969drawable.ch9), Integer.valueOf(C0966R.C0969drawable.chh), Integer.valueOf(C0966R.C0969drawable.chi), Integer.valueOf(C0966R.C0969drawable.chj), Integer.valueOf(C0966R.C0969drawable.chk), Integer.valueOf(C0966R.C0969drawable.chl), Integer.valueOf(C0966R.C0969drawable.chm), Integer.valueOf(C0966R.C0969drawable.chn), Integer.valueOf(C0966R.C0969drawable.ch_), Integer.valueOf(C0966R.C0969drawable.cha), Integer.valueOf(C0966R.C0969drawable.chb), Integer.valueOf(C0966R.C0969drawable.chc), Integer.valueOf(C0966R.C0969drawable.chd), Integer.valueOf(C0966R.C0969drawable.che), Integer.valueOf(C0966R.C0969drawable.chf), Integer.valueOf(C0966R.C0969drawable.chg))) {
            int intValue2 = intValue.intValue();
            List<C3172c> list = this.f15155y;
            C3172c cVar = new C3172c((Bitmap) null, (String) null, 3, (C8480h) null);
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), intValue2);
            float f = f15139G;
            int i = (int) f;
            Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(Bitmap.createScaledBitmap(decodeResource, i, i, true), false, f * 0.5f);
            C87412m.m108593f(roundedCornerBitmap, "getRoundedCornerBitmap(b…alse, AVATAR_SIZE * 0.5f)");
            cVar.f15159a = roundedCornerBitmap;
            ((ArrayList) list).add(cVar);
        }
        mo3219Z0();
        this.f15143D.setInterpolator(new OvershootInterpolator());
        this.f15144E.setInterpolator(new OvershootInterpolator());
        this.f15141B.play(this.f15143D).with(this.f15144E).after(this.f15142C);
        this.f15141B.addListener(new C12602pd(this));
        this.f15143D.addListener(new C12624qd(this));
    }

    /* renamed from: Z0 */
    public final void mo3219Z0() {
        List<String> list;
        this.f15156z.clear();
        List<? extends C49765hx0> list2 = this.f15145F;
        Integer num = null;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
            for (C49765hx0 hx02 : list2) {
                FinderContact finderContact = hx02.f134919d;
                arrayList.add(finderContact != null ? finderContact.headUrl : null);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (!Util.isNullOrNil((String) next)) {
                    arrayList2.add(next);
                }
            }
            list = C110818d0.m150947s0(arrayList2, 10);
        } else {
            list = null;
        }
        if (list != null) {
            for (String str : list) {
                List<C3172c> list3 = this.f15156z;
                C3172c cVar = new C3172c((Bitmap) null, (String) null, 3, (C8480h) null);
                cVar.f15160b = str;
                list3.add(cVar);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("genCurrentDataList: realAvatarList size:");
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        sb.append(num);
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", sb.toString());
        if (this.f15156z.size() < 10) {
            int i = 0;
            int h = C88334c.f255322d.mo122723h(0, this.f15155y.size());
            int size = 10 - this.f15156z.size();
            while (i < size) {
                List<C3172c> list4 = this.f15156z;
                List<C3172c> list5 = this.f15155y;
                list4.add(list5.get(h % list5.size()));
                i++;
                h++;
            }
            C3171b bVar = this.f15152v;
            List<C3172c> list6 = this.f15156z;
            bVar.getClass();
            C87412m.m108594g(list6, "list");
            ((ArrayList) bVar.f15158d).clear();
            ((ArrayList) bVar.f15158d).addAll(list6);
        }
    }

    /* renamed from: a1 */
    public final void mo3220a1() {
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "hideStatePanel");
        C61926c.m72668M(new C3174e(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo3221b1(List<? extends C49765hx0> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("showStatePanel: contactList size:");
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", sb.toString());
        this.f15145F = list;
        C61926c.m72668M(new C3176g(this));
    }

    /* renamed from: c1 */
    public final void mo3222c1(String str) {
        String str2 = str;
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch: headUrl:" + str2);
        MTimerHandler mTimerHandler = this.f15154x;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        int size = this.f15156z.size();
        int C = this.f15153w.mo16957C();
        int C2 = this.f15153w.mo16957C() % size;
        int i = C2 == 0 ? size - 1 : C2 - 1;
        C3171b bVar = this.f15152v;
        C3172c cVar = new C3172c((Bitmap) null, (String) null, 3, (C8480h) null);
        cVar.f15160b = str2;
        bVar.getClass();
        ((ArrayList) bVar.f15158d).set(i, cVar);
        int i2 = (C + size) - 1;
        RecyclerView recyclerView = this.f15148r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "firstPosition:" + C + ", targetPosition:" + i2);
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "realFirstPosition:" + C2 + ", realInsertPosition:" + i + ", realTargetPosition:" + (i2 % size));
        this.f15148r.mo17043c(this.f15140A);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        MTimerHandler mTimerHandler = this.f15154x;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f15154x = null;
        this.f15148r.mo17098m1(this.f15140A);
        this.f15141B.cancel();
    }
}
