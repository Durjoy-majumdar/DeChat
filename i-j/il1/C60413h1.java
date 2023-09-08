package il1;

import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import android.animation.Animator;
import android.os.Vibrator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b50.C54405b;
import b50.C54412f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.seekbar.BothSidesSeekBar;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o40.C61926c;
import p849e3.C58521d;
import rx3.C13598b0;
import s50.C110747k;
import s50.C63699b;
import s50.C63711n;
import sn0.C90259e;
import sx3.C110818d0;
import w50.C65929d;
import wx3.C15601d;

/* renamed from: il1.h1 */
public final class C60413h1 {

    /* renamed from: a */
    public final RelativeLayout f172243a;

    /* renamed from: b */
    public final String f172244b = "Finder.FinderLiveCameraOptFilterWidget";

    /* renamed from: c */
    public final TextView f172245c;

    /* renamed from: d */
    public final BothSidesSeekBar f172246d;

    /* renamed from: e */
    public final ImageView f172247e;

    /* renamed from: f */
    public final RecyclerView f172248f;

    /* renamed from: g */
    public C60420g f172249g;

    /* renamed from: h */
    public final Object f172250h;

    /* renamed from: i */
    public final ArrayList<C65929d.C65930a> f172251i;

    /* renamed from: j */
    public C65929d.C65930a f172252j;

    /* renamed from: k */
    public C60421h f172253k;

    /* renamed from: l */
    public C32226l<? super C65929d.C65930a, C13598b0> f172254l;

    /* renamed from: m */
    public int f172255m;

    /* renamed from: n */
    public C32224a<C13598b0> f172256n;

    /* renamed from: o */
    public final C58521d f172257o;

    /* renamed from: p */
    public C53973z1 f172258p;

    /* renamed from: q */
    public final float f172259q;

    /* renamed from: r */
    public final int f172260r;

    /* renamed from: il1.h1$a */
    public static final class C46257a implements View.OnClickListener {

        /* renamed from: d */
        public static final C46257a f124700d = new C46257a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.h1$b */
    public static final class C46258b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60413h1 f124701d;

        public C46258b(C60413h1 h1Var) {
            this.f124701d = h1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f124701d.f172256n;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.h1$f */
    public static final class C46259f implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C60413h1 f124702d;

        public C46259f(C60413h1 h1Var) {
            this.f124702d = h1Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f124702d.f172257o.mo83434a(motionEvent);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: il1.h1$c */
    public static final class C60414c implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C60413h1 f172261d;

        public C60414c(C60413h1 h1Var) {
            this.f172261d = h1Var;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            RecyclerView.C16631z I0;
            String str = this.f172261d.f172244b;
            StringBuilder sb = new StringBuilder();
            sb.append("curSelectedFilter:");
            C65929d.C65930a aVar = this.f172261d.f172252j;
            View view = null;
            sb.append(aVar != null ? Integer.valueOf(aVar.f189538a) : null);
            sb.append(", onProgressChanged:");
            sb.append(i);
            sb.append(", fromUser:");
            sb.append(z);
            sb.append(", maxTranslationX:");
            sb.append(this.f172261d.f172255m);
            Log.m105924i(str, sb.toString());
            C60413h1 h1Var = this.f172261d;
            C65929d.C65930a aVar2 = h1Var.f172252j;
            if (aVar2 != null && seekBar != null) {
                C60413h1.m70666c(h1Var, i);
                FinderLiveService.f159376d.getClass();
                HashMap<Integer, C65929d.C65930a> hashMap = FinderLiveService.f159394x;
                C65929d.C65930a aVar3 = h1Var.f172252j;
                C65929d.C65930a aVar4 = hashMap.get(aVar3 != null ? Integer.valueOf(aVar3.f189538a) : null);
                if (aVar4 != null) {
                    aVar4.f189541d = i;
                }
                C63699b bVar = FinderLiveService.f159393w;
                if (bVar != null) {
                    bVar.f180568c = i;
                }
                C54412f a = C60413h1.m70664a(h1Var);
                C63699b bVar2 = FinderLiveService.f159393w;
                C110747k kVar = a.f152607b;
                kVar.getClass();
                kVar.mo148312q(new C63711n(kVar, bVar2));
                int i2 = FinderLiveService.f159389s;
                C63699b bVar3 = FinderLiveService.f159393w;
                boolean z2 = true;
                boolean z3 = i2 == (bVar3 != null ? bVar3.f180568c : 0);
                if (z && h1Var.f172247e.getVisibility() == 0 && z3) {
                    Object obj = h1Var.f172250h;
                    if (obj instanceof Vibrator) {
                        ((Vibrator) obj).vibrate(10);
                    }
                }
                Integer valueOf = Integer.valueOf(h1Var.f172251i.indexOf(aVar2));
                if (valueOf.intValue() == -1) {
                    z2 = false;
                }
                if (!z2) {
                    valueOf = null;
                }
                if (valueOf != null && (I0 = h1Var.f172248f.mo17023I0(valueOf.intValue())) != null) {
                    C60421h hVar = I0 instanceof C60421h ? (C60421h) I0 : null;
                    if (hVar != null) {
                        view = hVar.f172271C;
                    }
                    if (view != null) {
                        int i3 = !z3 ? 0 : 8;
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar5.mo10233c(Integer.valueOf(i3));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$3", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$3", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r9v23, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStartTrackingTouch(android.widget.SeekBar r9) {
            /*
                r8 = this;
                il1.h1 r9 = r8.f172261d
                java.lang.String r9 = r9.f172244b
                java.lang.String r0 = "#onStartTrackingTouch"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                il1.h1 r9 = r8.f172261d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r9.f172246d
                android.widget.RelativeLayout r9 = r9.f172243a
                android.content.Context r9 = r9.getContext()
                r1 = 12
                int r9 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r9, r1)
                r0.mo154682a(r9)
                il1.h1 r9 = r8.f172261d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r9.f172246d
                android.widget.RelativeLayout r9 = r9.f172243a
                android.content.Context r9 = r9.getContext()
                r2 = 2131232515(0x7f080703, float:1.8081141E38)
                android.graphics.drawable.Drawable r9 = r9.getDrawable(r2)
                r0.setThumb(r9)
                il1.h1 r9 = r8.f172261d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r9 = r9.f172246d
                r9.invalidate()
                il1.h1 r9 = r8.f172261d
                android.widget.TextView r9 = r9.f172245c
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                boolean r0 = r9 instanceof android.widget.RelativeLayout.LayoutParams
                r2 = 0
                if (r0 == 0) goto L_0x0047
                android.widget.RelativeLayout$LayoutParams r9 = (android.widget.RelativeLayout.LayoutParams) r9
                goto L_0x0048
            L_0x0047:
                r9 = r2
            L_0x0048:
                if (r9 == 0) goto L_0x0066
                il1.h1 r0 = r8.f172261d
                int r3 = r9.leftMargin
                int r4 = r9.topMargin
                int r5 = r9.rightMargin
                android.widget.RelativeLayout r6 = r0.f172243a
                android.content.Context r6 = r6.getContext()
                r7 = 16
                int r6 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r6, r7)
                r9.setMargins(r3, r4, r5, r6)
                android.widget.TextView r0 = r0.f172245c
                r0.setLayoutParams(r9)
            L_0x0066:
                il1.h1 r9 = r8.f172261d
                a14.z1 r9 = r9.f172258p
                if (r9 == 0) goto L_0x0070
                r0 = 1
                a14.C53973z1.C53974a.m60623a(r9, r2, r0, r2)
            L_0x0070:
                il1.h1 r9 = r8.f172261d
                android.widget.TextView r9 = r9.f172245c
                r0 = 0
                r9.setVisibility(r0)
                il1.h1 r9 = r8.f172261d
                android.widget.ImageView r9 = r9.f172247e
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                boolean r0 = r9 instanceof android.widget.RelativeLayout.LayoutParams
                if (r0 == 0) goto L_0x0087
                r2 = r9
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            L_0x0087:
                if (r2 == 0) goto L_0x009c
                il1.h1 r9 = r8.f172261d
                android.widget.RelativeLayout r0 = r9.f172243a
                android.content.Context r0 = r0.getContext()
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r1)
                r2.width = r0
                android.widget.ImageView r9 = r9.f172247e
                r9.setLayoutParams(r2)
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60413h1.C60414c.onStartTrackingTouch(android.widget.SeekBar):void");
        }

        /* JADX WARNING: type inference failed for: r7v18, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStopTrackingTouch(android.widget.SeekBar r7) {
            /*
                r6 = this;
                il1.h1 r7 = r6.f172261d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r7.f172246d
                android.widget.RelativeLayout r7 = r7.f172243a
                android.content.Context r7 = r7.getContext()
                r1 = 4
                int r7 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r7, r1)
                r0.mo154682a(r7)
                il1.h1 r7 = r6.f172261d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r7.f172246d
                android.widget.RelativeLayout r7 = r7.f172243a
                android.content.Context r7 = r7.getContext()
                r1 = 2131232514(0x7f080702, float:1.808114E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r1)
                r0.setThumb(r7)
                il1.h1 r7 = r6.f172261d
                com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r7 = r7.f172246d
                r7.invalidate()
                il1.h1 r7 = r6.f172261d
                android.widget.TextView r7 = r7.f172245c
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                boolean r0 = r7 instanceof android.widget.RelativeLayout.LayoutParams
                r1 = 0
                if (r0 == 0) goto L_0x003d
                android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
                goto L_0x003e
            L_0x003d:
                r7 = r1
            L_0x003e:
                if (r7 == 0) goto L_0x0051
                il1.h1 r0 = r6.f172261d
                int r2 = r7.leftMargin
                int r3 = r7.topMargin
                int r4 = r7.rightMargin
                r5 = 0
                r7.setMargins(r2, r3, r4, r5)
                android.widget.TextView r0 = r0.f172245c
                r0.setLayoutParams(r7)
            L_0x0051:
                il1.h1 r7 = r6.f172261d
                il1.C60413h1.m70665b(r7)
                il1.h1 r7 = r6.f172261d
                android.widget.ImageView r7 = r7.f172247e
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                boolean r0 = r7 instanceof android.widget.RelativeLayout.LayoutParams
                if (r0 == 0) goto L_0x0065
                r1 = r7
                android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            L_0x0065:
                if (r1 == 0) goto L_0x007c
                il1.h1 r7 = r6.f172261d
                android.widget.RelativeLayout r0 = r7.f172243a
                android.content.Context r0 = r0.getContext()
                r2 = 8
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r2)
                r1.width = r0
                android.widget.ImageView r7 = r7.f172247e
                r7.setLayoutParams(r1)
            L_0x007c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60413h1.C60414c.onStopTrackingTouch(android.widget.SeekBar):void");
        }
    }

    /* renamed from: il1.h1$d */
    public static final class C60415d extends C87413o implements C32226l<C65929d.C65930a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60413h1 f172262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60415d(C60413h1 h1Var) {
            super(1);
            this.f172262d = h1Var;
        }

        public Object invoke(Object obj) {
            C65929d.C65930a aVar = (C65929d.C65930a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            this.f172262d.f172252j = aVar;
            FinderLiveService.f159376d.getClass();
            C63699b bVar = FinderLiveService.f159393w;
            if (bVar != null) {
                bVar.f180566a = aVar.f189538a;
            }
            if (bVar != null) {
                bVar.f180567b = aVar.f189539b;
            }
            if (bVar != null) {
                bVar.f180568c = aVar.f189541d;
            }
            this.f172262d.mo85380d();
            if (aVar.f189538a == -1) {
                C60413h1.m70664a(this.f172262d).mo75188b(C60413h1.m70664a(this.f172262d).f152610e, false, false);
            } else {
                C54405b.C54406a.m61097a(C60413h1.m70664a(this.f172262d), 0, true, false, 4, (Object) null);
            }
            C54412f a = C60413h1.m70664a(this.f172262d);
            C63699b bVar2 = FinderLiveService.f159393w;
            C110747k kVar = a.f152607b;
            kVar.getClass();
            kVar.mo148312q(new C63711n(kVar, bVar2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.h1$e */
    public static final class C60416e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C60413h1 f172263d;

        /* renamed from: il1.h1$e$a */
        public static final class C60417a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60413h1 f172264d;

            /* renamed from: il1.h1$e$a$a */
            public static final class C60418a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C60413h1 f172265d;

                /* renamed from: e */
                public final /* synthetic */ int f172266e;

                public C60418a(C60413h1 h1Var, int i) {
                    this.f172265d = h1Var;
                    this.f172266e = i;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
                    r0 = r0.f44854d;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r3 = this;
                        il1.h1 r0 = r3.f172265d
                        androidx.recyclerview.widget.RecyclerView r0 = r0.f172248f
                        int r1 = r3.f172266e
                        androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17023I0(r1)
                        r1 = 0
                        if (r0 == 0) goto L_0x0018
                        android.view.View r0 = r0.f44854d
                        if (r0 == 0) goto L_0x0018
                        int[] r0 = o40.C61926c.m72690o(r0)
                        r0 = r0[r1]
                        goto L_0x0019
                    L_0x0018:
                        r0 = 0
                    L_0x0019:
                        il1.h1 r2 = r3.f172265d
                        androidx.recyclerview.widget.RecyclerView r2 = r2.f172248f
                        r2.scrollBy(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: il1.C60413h1.C60416e.C60417a.C60418a.run():void");
                }
            }

            public C60417a(C60413h1 h1Var) {
                this.f172264d = h1Var;
            }

            public final void run() {
                RecyclerView.LayoutManager layoutManager = this.f172264d.f172248f.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int z = linearLayoutManager.mo17004z();
                int D = linearLayoutManager.mo16958D();
                C60413h1 h1Var = this.f172264d;
                int P = C110818d0.m150918P(h1Var.f172251i, h1Var.f172252j);
                if (P < z || P > D) {
                    C60413h1 h1Var2 = this.f172264d;
                    RecyclerView recyclerView = h1Var2.f172248f;
                    int size = h1Var2.f172251i.size() - 1;
                    if (P <= size) {
                        size = P;
                    }
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(size));
                    RecyclerView recyclerView2 = recyclerView;
                    C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5$onFling$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5$onFling$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    C60413h1 h1Var3 = this.f172264d;
                    h1Var3.f172248f.post(new C60418a(h1Var3, P));
                }
            }
        }

        /* renamed from: il1.h1$e$b */
        public static final class C60419b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60413h1 f172267d;

            public C60419b(C60413h1 h1Var) {
                this.f172267d = h1Var;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
                r0 = r0.f44854d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    il1.h1 r0 = r4.f172267d
                    java.util.ArrayList<w50.d$a> r1 = r0.f172251i
                    w50.d$a r0 = r0.f172252j
                    int r0 = sx3.C110818d0.m150918P(r1, r0)
                    il1.h1 r1 = r4.f172267d
                    androidx.recyclerview.widget.RecyclerView r1 = r1.f172248f
                    androidx.recyclerview.widget.RecyclerView$z r0 = r1.mo17023I0(r0)
                    r1 = 0
                    if (r0 == 0) goto L_0x0020
                    android.view.View r0 = r0.f44854d
                    if (r0 == 0) goto L_0x0020
                    int[] r0 = o40.C61926c.m72690o(r0)
                    r0 = r0[r1]
                    goto L_0x0021
                L_0x0020:
                    r0 = 0
                L_0x0021:
                    il1.h1 r2 = r4.f172267d
                    androidx.recyclerview.widget.RecyclerView r3 = r2.f172248f
                    int r2 = r2.f172260r
                    int r0 = r0 - r2
                    r3.smoothScrollBy(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: il1.C60413h1.C60416e.C60419b.run():void");
            }
        }

        public C60416e(C60413h1 h1Var) {
            this.f172263d = h1Var;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
            r4 = r2.f172263d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
            r4 = r2.f172263d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onFling(android.view.MotionEvent r3, android.view.MotionEvent r4, float r5, float r6) {
            /*
                r2 = this;
                java.lang.String r6 = "e1"
                gy3.C87412m.m108594g(r3, r6)
                java.lang.String r6 = "e2"
                gy3.C87412m.m108594g(r4, r6)
                float r6 = r3.getX()
                float r0 = r4.getX()
                float r6 = r6 - r0
                float r4 = r4.getX()
                float r3 = r3.getX()
                float r4 = r4 - r3
                float r3 = java.lang.Math.abs(r5)
                r5 = 0
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L_0x00ab
                r3 = 1112014848(0x42480000, float:50.0)
                r0 = 1
                int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r6 <= 0) goto L_0x005a
                il1.h1 r3 = r2.f172263d
                java.util.ArrayList<w50.d$a> r4 = r3.f172251i
                w50.d$a r3 = r3.f172252j
                int r3 = sx3.C110818d0.m150918P(r4, r3)
                il1.h1 r4 = r2.f172263d
                java.util.ArrayList<w50.d$a> r4 = r4.f172251i
                int r4 = r4.size()
                int r4 = r4 - r0
                if (r3 >= r4) goto L_0x0083
                il1.h1 r4 = r2.f172263d
                fy3.l<? super w50.d$a, rx3.b0> r6 = r4.f172254l
                if (r6 == 0) goto L_0x0083
                java.util.ArrayList<w50.d$a> r4 = r4.f172251i
                int r3 = r3 + r0
                java.lang.Object r3 = r4.get(r3)
                java.lang.String r4 = "filterList[currentIndex + 1]"
                gy3.C87412m.m108593f(r3, r4)
                il1.h1$d r6 = (il1.C60413h1.C60415d) r6
                r6.invoke(r3)
                goto L_0x0083
            L_0x005a:
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x0082
                il1.h1 r3 = r2.f172263d
                java.util.ArrayList<w50.d$a> r4 = r3.f172251i
                w50.d$a r3 = r3.f172252j
                int r3 = sx3.C110818d0.m150918P(r4, r3)
                if (r3 <= 0) goto L_0x0083
                il1.h1 r4 = r2.f172263d
                fy3.l<? super w50.d$a, rx3.b0> r6 = r4.f172254l
                if (r6 == 0) goto L_0x0083
                java.util.ArrayList<w50.d$a> r4 = r4.f172251i
                int r3 = r3 - r0
                java.lang.Object r3 = r4.get(r3)
                java.lang.String r4 = "filterList[currentIndex - 1]"
                gy3.C87412m.m108593f(r3, r4)
                il1.h1$d r6 = (il1.C60413h1.C60415d) r6
                r6.invoke(r3)
                goto L_0x0083
            L_0x0082:
                r0 = 0
            L_0x0083:
                if (r0 == 0) goto L_0x00ab
                il1.h1 r3 = r2.f172263d
                il1.h1$g r3 = r3.f172249g
                r3.notifyDataSetChanged()
                il1.h1 r3 = r2.f172263d
                r3.mo85380d()
                il1.h1 r3 = r2.f172263d
                androidx.recyclerview.widget.RecyclerView r4 = r3.f172248f
                il1.h1$e$a r6 = new il1.h1$e$a
                r6.<init>(r3)
                r4.post(r6)
                il1.h1 r3 = r2.f172263d
                androidx.recyclerview.widget.RecyclerView r4 = r3.f172248f
                il1.h1$e$b r6 = new il1.h1$e$b
                r6.<init>(r3)
                r0 = 100
                r4.postDelayed(r6, r0)
            L_0x00ab:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60413h1.C60416e.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(motionEvent, "e");
            float y = motionEvent.getY();
            BothSidesSeekBar bothSidesSeekBar = this.f172263d.f172246d;
            C87412m.m108593f(bothSidesSeekBar, "seekBar");
            if (y < ((float) C61926c.m72690o(bothSidesSeekBar)[1])) {
                C60413h1 h1Var = this.f172263d;
                h1Var.getClass();
                C61926c.m72668M(new C46267l1(h1Var, (C32224a<C13598b0>) null));
                C32224a<C13598b0> aVar = this.f172263d.f172256n;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$5", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: il1.h1$g */
    public final class C60420g extends RecyclerView.C16613e<C60421h> {
        public C60420g() {
        }

        public int getItemCount() {
            return C60413h1.this.f172251i.size();
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0165  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x01dc  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x020a  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0221  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0238  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r21, int r22) {
            /*
                r20 = this;
                r0 = r20
                r1 = r22
                r2 = r21
                il1.h1$h r2 = (il1.C60413h1.C60421h) r2
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r2, r3)
                android.view.View r3 = r2.f172272D
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof android.widget.RelativeLayout.LayoutParams
                if (r4 == 0) goto L_0x001a
                android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                r4 = 0
                if (r3 == 0) goto L_0x0032
                android.view.View r6 = r2.f44854d
                android.content.Context r6 = r6.getContext()
                if (r1 != 0) goto L_0x0029
                r7 = 32
                goto L_0x002b
            L_0x0029:
                r7 = 24
            L_0x002b:
                int r6 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r6, r7)
                r3.setMargins(r6, r4, r4, r4)
            L_0x0032:
                il1.h1 r3 = il1.C60413h1.this
                java.util.ArrayList<w50.d$a> r3 = r3.f172251i
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r6 = "filterList[position]"
                gy3.C87412m.m108593f(r3, r6)
                w50.d$a r3 = (w50.C65929d.C65930a) r3
                il1.h1 r7 = il1.C60413h1.this
                w50.d$a r8 = r7.f172252j
                if (r8 == 0) goto L_0x0057
                int r8 = r8.f189538a
                java.util.ArrayList<w50.d$a> r7 = r7.f172251i
                java.lang.Object r7 = r7.get(r1)
                w50.d$a r7 = (w50.C65929d.C65930a) r7
                int r7 = r7.f189538a
                if (r8 != r7) goto L_0x0057
                r7 = 1
                goto L_0x0058
            L_0x0057:
                r7 = 0
            L_0x0058:
                android.view.View r8 = r2.f172270B
                r15 = 4
                if (r7 == 0) goto L_0x005f
                r10 = 0
                goto L_0x0060
            L_0x005f:
                r10 = 4
            L_0x0060:
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r14.mo10233c(r10)
                java.lang.Object[] r11 = r14.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter"
                java.lang.String r13 = "onBindViewHolder"
                java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterViewHolder;I)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r10 = r8
                r5 = r14
                r14 = r16
                r9 = 4
                r15 = r17
                r16 = r18
                r17 = r19
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r5 = r5.mo10231a(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r8.setVisibility(r5)
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter"
                java.lang.String r12 = "onBindViewHolder"
                java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterViewHolder;I)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                if (r7 == 0) goto L_0x00c2
                il1.h1 r5 = il1.C60413h1.this
                r5.f172253k = r2
                if (r1 != 0) goto L_0x00c2
                android.widget.TextView r5 = r5.f172245c
                r5.setVisibility(r9)
                il1.h1 r5 = il1.C60413h1.this
                a14.z1 r5 = r5.f172258p
                if (r5 == 0) goto L_0x00c2
                r8 = 1
                r9 = 0
                a14.C53973z1.C53974a.m60623a(r5, r9, r8, r9)
            L_0x00c2:
                android.view.View r5 = r2.f44854d
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                if (r7 == 0) goto L_0x00d2
                r7 = 2131099707(0x7f06003b, float:1.7811775E38)
                goto L_0x00d5
            L_0x00d2:
                r7 = 2131099702(0x7f060036, float:1.7811765E38)
            L_0x00d5:
                int r5 = r5.getColor(r7)
                android.widget.TextView r7 = r2.f172273z
                r7.setTextColor(r5)
                android.view.View r7 = r2.f172271C
                r7.setBackgroundColor(r5)
                android.view.View r5 = r2.f172271C
                if (r1 == 0) goto L_0x00f5
                int r7 = r3.f189541d
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r8.getClass()
                int r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159389s
                if (r7 != r8) goto L_0x00f3
                goto L_0x00f5
            L_0x00f3:
                r7 = 0
                goto L_0x00f7
            L_0x00f5:
                r7 = 8
            L_0x00f7:
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r15.mo10233c(r7)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter"
                java.lang.String r11 = "onBindViewHolder"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterViewHolder;I)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r8 = r5
                r21 = r3
                r3 = r15
                r15 = r7
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r3 = r3.mo10231a(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r5.setVisibility(r3)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter"
                java.lang.String r10 = "onBindViewHolder"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterViewHolder;I)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                il1.h1 r3 = il1.C60413h1.this
                java.util.ArrayList<w50.d$a> r3 = r3.f172251i
                java.lang.Object r3 = r3.get(r1)
                gy3.C87412m.m108593f(r3, r6)
                w50.d$a r3 = (w50.C65929d.C65930a) r3
                int r3 = r3.f189538a
                switch(r3) {
                    case 0: goto L_0x0221;
                    case 1: goto L_0x020a;
                    case 2: goto L_0x01f3;
                    case 3: goto L_0x01dc;
                    case 4: goto L_0x01c5;
                    case 5: goto L_0x01ad;
                    case 6: goto L_0x0195;
                    case 7: goto L_0x017d;
                    case 8: goto L_0x0165;
                    case 9: goto L_0x014d;
                    default: goto L_0x014b;
                }
            L_0x014b:
                goto L_0x0238
            L_0x014d:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232614(0x7f080766, float:1.8081342E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x0165:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232616(0x7f080768, float:1.8081346E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x017d:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232618(0x7f08076a, float:1.808135E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x0195:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232620(0x7f08076c, float:1.8081354E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x01ad:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232615(0x7f080767, float:1.8081344E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x01c5:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232617(0x7f080769, float:1.8081348E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x01dc:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232613(0x7f080765, float:1.808134E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x01f3:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232621(0x7f08076d, float:1.8081356E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x020a:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232612(0x7f080764, float:1.8081338E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x0221:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232622(0x7f08076e, float:1.8081358E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
                goto L_0x024e
            L_0x0238:
                android.view.View r3 = r2.f172269A
                android.widget.TextView r4 = r2.f172273z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232619(0x7f08076b, float:1.8081352E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setBackground(r4)
            L_0x024e:
                android.widget.TextView r3 = r2.f172273z
                r4 = r21
                java.lang.String r4 = r4.f189540c
                r3.setText(r4)
                android.view.View r3 = r2.f44854d
                il1.i1 r4 = new il1.i1
                il1.h1 r5 = il1.C60413h1.this
                r4.<init>(r5, r1, r2, r0)
                r3.setOnClickListener(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60413h1.C60420g.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            C60413h1 h1Var = C60413h1.this;
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.afh, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(parent.context, …ra_opt_filter_item, null)");
            return new C60421h(h1Var, inflate);
        }
    }

    /* renamed from: il1.h1$h */
    public final class C60421h extends RecyclerView.C16631z {

        /* renamed from: A */
        public final View f172269A;

        /* renamed from: B */
        public final View f172270B;

        /* renamed from: C */
        public final View f172271C;

        /* renamed from: D */
        public final View f172272D;

        /* renamed from: z */
        public final TextView f172273z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60421h(C60413h1 h1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.m06);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…ra_opt_filter_item_title)");
            this.f172273z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.nu8);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_opt_filter_item_root_bg)");
            this.f172269A = findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.m05);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…_filter_item_select_mark)");
            this.f172270B = findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.nu6);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.…_filter_item_changed_tag)");
            this.f172271C = findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.nu7);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.…era_opt_filter_item_root)");
            this.f172272D = findViewById5;
        }
    }

    /* renamed from: il1.h1$i */
    public static final class C60422i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60413h1 f172274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60422i(C60413h1 h1Var) {
            super(0);
            this.f172274d = h1Var;
        }

        public Object invoke() {
            this.f172274d.f172243a.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
            C60413h1 h1Var = this.f172274d;
            if (h1Var.f172255m == 0) {
                h1Var.f172243a.post(new C60461n1(h1Var));
            }
            C60413h1 h1Var2 = this.f172274d;
            if (C110818d0.m150918P(h1Var2.f172251i, h1Var2.f172252j) > 0) {
                this.f172274d.f172245c.setVisibility(0);
                C53973z1 z1Var = this.f172274d.f172258p;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                C60413h1.m70665b(this.f172274d);
            } else {
                this.f172274d.f172245c.setVisibility(4);
            }
            return C13598b0.f38549a;
        }
    }

    public C60413h1(RelativeLayout relativeLayout) {
        C87412m.m108594g(relativeLayout, "filterPanelRoot");
        this.f172243a = relativeLayout;
        this.f172245c = (TextView) relativeLayout.findViewById(C0966R.C0970id.f358118di1);
        BothSidesSeekBar bothSidesSeekBar = (BothSidesSeekBar) relativeLayout.findViewById(C0966R.C0970id.dhy);
        this.f172246d = bothSidesSeekBar;
        this.f172247e = (ImageView) relativeLayout.findViewById(C0966R.C0970id.dhz);
        RecyclerView recyclerView = (RecyclerView) relativeLayout.findViewById(C0966R.C0970id.dhx);
        this.f172248f = recyclerView;
        this.f172249g = new C60420g();
        this.f172250h = relativeLayout.getContext().getSystemService("vibrator");
        this.f172251i = new ArrayList<>();
        this.f172259q = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3750d1);
        this.f172260r = (C76577a.m92145A(MMApplicationContext.getContext()) / 2) - C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3745cw);
        relativeLayout.setOnClickListener(C46257a.f124700d);
        relativeLayout.setTranslationY((float) C75044y4.m89990b(relativeLayout.getContext()).y);
        ((RelativeLayout) relativeLayout.findViewById(C0966R.C0970id.dhw)).setOnClickListener(new C46258b(this));
        bothSidesSeekBar.setOnSeekBarChangeListener(new C60414c(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(relativeLayout.getContext(), 0, false));
        this.f172254l = new C60415d(this);
        mo85380d();
        this.f172257o = new C58521d(relativeLayout.getContext(), new C60416e(this));
        relativeLayout.setLongClickable(true);
        relativeLayout.setOnTouchListener(new C46259f(this));
    }

    /* renamed from: a */
    public static final C54412f m70664a(C60413h1 h1Var) {
        h1Var.getClass();
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C54405b bVar = aVar != null ? aVar.f173032r : null;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.live.core.core.LiveCameraOptManager");
        return (C54412f) bVar;
    }

    /* renamed from: b */
    public static final void m70665b(C60413h1 h1Var) {
        C55908a aVar;
        h1Var.getClass();
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        C53973z1 z1Var = null;
        if (!(bVar == null || (aVar = bVar.f123702i) == null)) {
            C53896h0 h0Var = C53872d1.f151117a;
            z1Var = C53895h.m60466d(aVar, C58901s.f168555a, (C53934p0) null, new C46269m1(h1Var, (C15601d<? super C46269m1>) null), 2, (Object) null);
        }
        h1Var.f172258p = z1Var;
    }

    /* renamed from: c */
    public static final void m70666c(C60413h1 h1Var, int i) {
        String str;
        float max = (((((float) i) / ((float) h1Var.f172246d.getMax())) * ((float) ((h1Var.f172246d.getMeasuredWidth() - h1Var.f172246d.getPaddingStart()) - h1Var.f172246d.getPaddingEnd()))) - ((float) (h1Var.f172245c.getMeasuredWidth() / 2))) + h1Var.f172259q + ((float) (Math.abs(h1Var.f172245c.getMeasuredWidth() - h1Var.f172246d.getThumb().getIntrinsicWidth()) / 2));
        TextView textView = h1Var.f172245c;
        if (i <= 0) {
            str = "0";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(i);
            str = sb.toString();
        }
        textView.setText(str);
        TextView textView2 = h1Var.f172245c;
        float f = h1Var.f172259q;
        if (max < f) {
            max = f;
        }
        textView2.setTranslationX(max);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85380d() {
        /*
            r5 = this;
            w50.d$a r0 = r5.f172252j
            r1 = 4
            if (r0 == 0) goto L_0x0040
            r2 = 0
            if (r0 == 0) goto L_0x000f
            int r0 = r0.f189538a
            r3 = -1
            if (r0 != r3) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0013
            goto L_0x0040
        L_0x0013:
            com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r5.f172246d
            r0.setVisibility(r2)
            com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r5.f172246d
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.getClass()
            s50.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159393w
            if (r4 == 0) goto L_0x0026
            int r4 = r4.f180568c
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            r0.setProgress(r4)
            r3.getClass()
            int r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159389s
            if (r0 <= 0) goto L_0x003a
            android.widget.ImageView r0 = r5.f172247e
            r0.setVisibility(r2)
            r5.mo85381e()
            goto L_0x004a
        L_0x003a:
            android.widget.ImageView r0 = r5.f172247e
            r0.setVisibility(r1)
            goto L_0x004a
        L_0x0040:
            com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar r0 = r5.f172246d
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r5.f172247e
            r0.setVisibility(r1)
        L_0x004a:
            java.lang.String r0 = r5.f172244b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkSeekBar curSelectedBeauty:"
            r1.append(r2)
            w50.d$a r2 = r5.f172252j
            if (r2 == 0) goto L_0x0061
            int r2 = r2.f189538a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60413h1.mo85380d():void");
    }

    /* renamed from: e */
    public final void mo85381e() {
        FinderLiveService.f159376d.getClass();
        int i = FinderLiveService.f159389s;
        float max = (((float) i) / ((float) this.f172246d.getMax())) * ((float) ((this.f172246d.getMeasuredWidth() - this.f172246d.getPaddingStart()) - this.f172246d.getPaddingEnd()));
        String str = this.f172244b;
        Log.m105924i(str, "moveProgressIndicator progress:" + i + " translationX:" + max);
        ImageView imageView = this.f172247e;
        float f = (float) this.f172255m;
        if (max > f) {
            max = f;
        }
        imageView.setTranslationX(max);
    }

    /* renamed from: f */
    public final void mo85382f() {
        T t;
        boolean z;
        ArrayList<C65929d.C65930a> arrayList = this.f172251i;
        String string = this.f172243a.getContext().getResources().getString(C0966R.string.dml);
        C87412m.m108593f(string, "filterPanelRoot.context.….finder_live_filter_none)");
        arrayList.add(new C65929d.C65930a(-1, "", string, 0));
        FinderLiveService.f159376d.getClass();
        for (Map.Entry<Integer, C65929d.C65930a> value : FinderLiveService.f159394x.entrySet()) {
            this.f172251i.add(value.getValue());
        }
        Iterator<T> it = this.f172251i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C65929d.C65930a aVar = (C65929d.C65930a) t;
            FinderLiveService.f159376d.getClass();
            C63699b bVar = FinderLiveService.f159393w;
            if (bVar == null || aVar.f189538a != bVar.f180566a) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        this.f172252j = (C65929d.C65930a) t;
        this.f172248f.setAdapter(this.f172249g);
    }

    /* renamed from: g */
    public final void mo85383g() {
        T t;
        boolean z;
        Iterator<T> it = this.f172251i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C65929d.C65930a aVar = (C65929d.C65930a) t;
            FinderLiveService.f159376d.getClass();
            C63699b bVar = FinderLiveService.f159393w;
            if (bVar == null || aVar.f189538a != bVar.f180566a) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        this.f172252j = (C65929d.C65930a) t;
        this.f172249g.notifyDataSetChanged();
        mo85380d();
        this.f172243a.setVisibility(0);
        C61926c.m72668M(new C60422i(this));
    }
}
