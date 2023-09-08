package sb2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricPreludeView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvWxRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59822f;
import hb2.C59833q;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import la2.C99364n;
import m03.C61426c;
import ma2.C61453s;
import ma2.C99819r;
import mb2.C61457a;
import o40.C61926c;
import p640ox.C77049b;
import qc0.C101093a;
import qc0.C101106m;
import rr3.C110622b;
import rr3.C110632i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sn0.C90259e;
import sx3.C64197v;
import te3.C64488kb1;
import te3.C64793w23;
import ub2.C65304p0;
import vp3.C65849b;

/* renamed from: sb2.o */
public final class C63816o extends UIComponent {

    /* renamed from: A */
    public boolean f180899A;

    /* renamed from: B */
    public boolean f180900B;

    /* renamed from: C */
    public final MMHandler f180901C;

    /* renamed from: D */
    public final C63820d f180902D;

    /* renamed from: E */
    public final C63821e f180903E;

    /* renamed from: F */
    public final C63817a f180904F;

    /* renamed from: G */
    public final C63823g f180905G;

    /* renamed from: H */
    public final GestureDetector f180906H;

    /* renamed from: I */
    public int f180907I;

    /* renamed from: d */
    public final String f180908d = "MicroMsg.MusicMvLyricUIC";

    /* renamed from: e */
    public View f180909e;

    /* renamed from: f */
    public final C13601g f180910f;

    /* renamed from: g */
    public final C13601g f180911g;

    /* renamed from: h */
    public RecyclerView f180912h;

    /* renamed from: i */
    public ArrayList<RecyclerView> f180913i;

    /* renamed from: j */
    public final ArrayList<String> f180914j;

    /* renamed from: n */
    public C61453s f180915n;

    /* renamed from: o */
    public int f180916o;

    /* renamed from: p */
    public int f180917p;

    /* renamed from: q */
    public C110622b f180918q;

    /* renamed from: r */
    public boolean f180919r;

    /* renamed from: s */
    public long f180920s;

    /* renamed from: t */
    public boolean f180921t;

    /* renamed from: u */
    public C59822f f180922u;

    /* renamed from: v */
    public long f180923v;

    /* renamed from: w */
    public MusicMvLyricPreludeView f180924w;

    /* renamed from: x */
    public long f180925x;

    /* renamed from: y */
    public boolean f180926y;

    /* renamed from: z */
    public boolean f180927z;

    /* renamed from: sb2.o$a */
    public static final class C63817a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C63816o f180928d;

        public C63817a(C63816o oVar) {
            this.f180928d = oVar;
        }

        public void onChildViewAdded(View view, View view2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
            Log.m105924i(this.f180928d.f180908d, "onChildViewAdded");
            C63816o.m75050c3(this.f180928d, view2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
        }

        public void onChildViewRemoved(View view, View view2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
            Log.m105924i(this.f180928d.f180908d, "onChildViewRemoved");
            C63816o.m75051d3(this.f180928d, view2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
        }
    }

    /* renamed from: sb2.o$b */
    public static final class C63818b extends C87413o implements C32224a<MusicMvLyricView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63818b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180929d = appCompatActivity;
        }

        public Object invoke() {
            return (MusicMvLyricView) this.f180929d.findViewById(C0966R.C0970id.egq);
        }
    }

    /* renamed from: sb2.o$c */
    public static final class C63819c implements GestureDetector.OnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C63816o f180930d;

        public C63819c(C63816o oVar) {
            this.f180930d = oVar;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return false;
            }
            boolean z = ((int) motionEvent.getRawY()) > this.f180930d.mo88608f3().getLastVisibleItemPos()[1] + C76577a.m92151b(this.f180930d.getContext(), 20);
            boolean z2 = ((int) motionEvent.getRawY()) < this.f180930d.mo88608f3().getFirstVisibleItemPos()[1] - C76577a.m92151b(this.f180930d.getContext(), 20);
            boolean z3 = ((int) motionEvent.getRawY()) >= this.f180930d.mo88608f3().getFirstVisibleItemPos()[1] - C76577a.m92151b(this.f180930d.getContext(), 40) && ((int) motionEvent.getRawY()) <= this.f180930d.mo88608f3().getFirstVisibleItemPos()[1] - C76577a.m92151b(this.f180930d.getContext(), 8);
            if (z || z2 || z3) {
                if (!this.f180930d.mo88608f3().f163585C || !z3) {
                    Log.m105924i(this.f180930d.f180908d, "onSingleTapUp hideFullLyric");
                    this.f180930d.mo88609g3();
                } else {
                    Log.m105924i(this.f180930d.f180908d, "onSingleTapUp restartMusic");
                    this.f180930d.getClass();
                    C101093a.m132487i(0);
                    if (C101093a.m132481c()) {
                        C101093a.m132486h();
                    } else {
                        C101106m b = C101093a.m132480b();
                        if (b != null) {
                            b.f295943D = 0;
                        }
                        C99364n.m129616h().mo138826e(b);
                    }
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: sb2.o$d */
    public static final class C63820d implements C61457a.C61460b {

        /* renamed from: a */
        public final /* synthetic */ C63816o f180931a;

        public C63820d(C63816o oVar) {
            this.f180931a = oVar;
        }

        /* renamed from: j */
        public void mo86435j(int i) {
            this.f180931a.mo88610i3();
        }
    }

    /* renamed from: sb2.o$e */
    public static final class C63821e implements MusicMvLyricView.C57108h {

        /* renamed from: a */
        public final /* synthetic */ C63816o f180932a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f180933b;

        public C63821e(C63816o oVar, AppCompatActivity appCompatActivity) {
            this.f180932a = oVar;
            this.f180933b = appCompatActivity;
        }

        /* renamed from: a */
        public void mo80588a(int i, long j) {
            int i2 = (int) j;
            C101093a.m132487i(i2);
            if (C101093a.m132481c()) {
                C101093a.m132486h();
            } else {
                C101106m b = C101093a.m132480b();
                if (b != null) {
                    b.f295943D = i2;
                }
                C99364n.m129616h().mo138826e(b);
            }
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f180933b, 7, C64793w23.class);
            if (w232 != null) {
                w232.f186047u = 1;
            }
            C63816o.m75052e3(this.f180932a, 51);
        }

        /* renamed from: b */
        public void mo80589b(boolean z) {
            Class cls = C63756e.class;
            if (z) {
                ((C63756e) C39818r.f106831a.mo62444c(this.f180933b).mo75002a(cls)).f180736H = 2;
            } else {
                ((C63756e) C39818r.f106831a.mo62444c(this.f180933b).mo75002a(cls)).f180736H = 1;
            }
        }

        /* renamed from: c */
        public void mo80590c(int i) {
            C63816o.m75052e3(this.f180932a, i);
        }

        /* renamed from: d */
        public void mo80591d() {
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f180933b, 7, C64793w23.class);
            if (w232 != null) {
                w232.f186047u = 1;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C63816o oVar = this.f180932a;
            if (currentTimeMillis - oVar.f180923v > 2000) {
                oVar.f180923v = currentTimeMillis;
                C63816o.m75052e3(oVar, 54);
            }
        }

        /* renamed from: e */
        public void mo80592e() {
            this.f180932a.mo88609g3();
        }
    }

    /* renamed from: sb2.o$f */
    public static final class C63822f extends C87413o implements C32224a<MusicMvWxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63822f(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180934d = appCompatActivity;
        }

        public Object invoke() {
            return (MusicMvWxRecyclerView) this.f180934d.findViewById(C0966R.C0970id.iiq);
        }
    }

    /* renamed from: sb2.o$g */
    public static final class C63823g implements MusicMvWxRecyclerView.C57122a {

        /* renamed from: a */
        public final /* synthetic */ C63816o f180935a;

        public C63823g(C63816o oVar) {
            this.f180935a = oVar;
        }

        /* renamed from: a */
        public void mo80640a(View view) {
            Log.m105924i(this.f180935a.f180908d, "onViewRemoved");
            C63816o.m75051d3(this.f180935a, view);
        }

        /* renamed from: b */
        public void mo80641b(View view) {
            Log.m105924i(this.f180935a.f180908d, "onViewAdded");
            C63816o.m75050c3(this.f180935a, view);
        }
    }

    /* renamed from: sb2.o$h */
    public static final class C63824h implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C63816o f180936d;

        public C63824h(C63816o oVar) {
            this.f180936d = oVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$onCreateAfter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector gestureDetector = this.f180936d.f180906H;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$onCreateAfter$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$onCreateAfter$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$onCreateAfter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: sb2.o$i */
    public static final class C63825i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63816o f180937d;

        public C63825i(C63816o oVar) {
            this.f180937d = oVar;
        }

        public final void run() {
            Class cls = C64793w23.class;
            Class cls2 = C77049b.class;
            MusicMvLyricView f3 = this.f180937d.mo88608f3();
            if (f3 != null) {
                C61926c.m72668M(new C65304p0(f3, (long) this.f180937d.f180916o, false));
            }
            MusicMvLyricView f35 = this.f180937d.mo88608f3();
            if (f35 != null) {
                f35.setVisibility(0);
            }
            MusicMvLyricView f36 = this.f180937d.mo88608f3();
            if (f36 != null) {
                f36.animate().cancel();
                f36.animate().alpha(1.0f).start();
            }
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(this.f180937d.getActivity(), 7, cls);
            Integer valueOf = w232 != null ? Integer.valueOf(w232.f186046t + 1) : null;
            C64793w23 w233 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(this.f180937d.getActivity(), 7, cls);
            if (w233 != null) {
                w233.f186046t = valueOf.intValue();
            }
            this.f180937d.f180920s = Util.currentTicks();
        }
    }

    /* renamed from: sb2.o$j */
    public static final class C63826j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63816o f180938d;

        /* renamed from: sb2.o$j$a */
        public static final class C63827a extends C87413o implements C32226l<Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ ImageView f180939d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63827a(ImageView imageView) {
                super(1);
                this.f180939d = imageView;
            }

            public Object invoke(Object obj) {
                this.f180939d.setImageBitmap((Bitmap) obj);
                return C13598b0.f38549a;
            }
        }

        public C63826j(C63816o oVar) {
            this.f180938d = oVar;
        }

        public final void run() {
            Drawable drawable;
            View view = this.f180938d.f180909e;
            C87412m.m108591d(view);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.bv8);
            Bitmap bitmap = null;
            if (!(imageView == null || (drawable = imageView.getDrawable()) == null)) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
            if (bitmap != null) {
                C65849b bVar = new C65849b();
                bVar.mo89891b(bitmap);
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                bVar.f189363b = width;
                bVar.f189364c = height;
                C110622b bVar2 = (C110622b) bVar.f189366e.f334033b.mo154927g(C110632i.BlurEffect);
                if (bVar2 != null) {
                    bVar2.mo162186d(20.0f);
                }
                bVar.f189366e.f334033b.mo154923c(bVar2);
                bVar.mo89890a(new C63827a(imageView));
            }
        }
    }

    /* renamed from: sb2.o$k */
    public static final class C63828k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63816o f180940d;

        public C63828k(C63816o oVar) {
            this.f180940d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$selectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f180940d.mo88610i3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$selectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sb2.o$l */
    public static final class C63829l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63816o f180941d;

        public C63829l(C63816o oVar) {
            this.f180941d = oVar;
        }

        public final void run() {
            RecyclerView recyclerView;
            Log.m105924i(this.f180941d.f180908d, "3s timeout");
            C63816o oVar = this.f180941d;
            oVar.f180899A = true;
            if (!oVar.f180900B) {
                RecyclerView recyclerView2 = oVar.f180912h;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
            } else if (!oVar.f180926y && (recyclerView = oVar.f180912h) != null) {
                recyclerView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63816o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f180910f = C36568h.m40985a(new C63818b(appCompatActivity));
        this.f180911g = C36568h.m40985a(new C63822f(appCompatActivity));
        this.f180913i = new ArrayList<>();
        this.f180914j = new ArrayList<>();
        this.f180917p = -1;
        new HashMap();
        this.f180901C = new MMHandler(Looper.getMainLooper());
        this.f180902D = new C63820d(this);
        this.f180903E = new C63821e(this, appCompatActivity);
        this.f180904F = new C63817a(this);
        this.f180905G = new C63823g(this);
        this.f180906H = new GestureDetector(getContext(), new C63819c(this));
    }

    /* renamed from: c3 */
    public static final void m75050c3(C63816o oVar, View view) {
        Log.m105924i(oVar.f180908d, "_onViewAdded");
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(C0966R.C0970id.gju) : null;
        if (recyclerView != null && !oVar.f180913i.contains(recyclerView)) {
            oVar.f180913i.add(recyclerView);
            Log.m105925i(oVar.f180908d, "lyricList size:%d", Integer.valueOf(oVar.f180913i.size()));
            if (((C61457a) recyclerView.getAdapter()) == null) {
                Log.m105924i(oVar.f180908d, "new MusicLyricAdapter");
                C61457a aVar = new C61457a(oVar.f180902D);
                aVar.mo86433F4(oVar.f180914j);
                recyclerView.setAdapter(aVar);
            }
            if (((LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
                int i = oVar.f180917p;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "_onViewAdded", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "_onViewAdded", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    /* renamed from: d3 */
    public static final void m75051d3(C63816o oVar, View view) {
        Log.m105924i(oVar.f180908d, "_onViewRemoved");
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(C0966R.C0970id.gju) : null;
        if (recyclerView != null) {
            oVar.f180913i.remove(recyclerView);
        }
    }

    /* renamed from: e3 */
    public static final void m75052e3(C63816o oVar, int i) {
        C63816o oVar2 = oVar;
        Class cls = C63756e.class;
        Log.m105925i(oVar2.f180908d, "reportLyricsClickAction:%d", Integer.valueOf(i));
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62443b(oVar.getContext()).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(context).…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        C64488kb1 kb12 = ((C63756e) rVar.mo62443b(oVar.getContext()).mo75002a(cls)).f180744i;
        if (oVar2.f180922u != null) {
            C59833q qVar = C59833q.f170832a;
            Activity context = oVar.getContext();
            C59822f fVar = oVar2.f180922u;
            C87412m.m108591d(fVar);
            C59833q.m69726g(qVar, context, kb12, fVar, i, 1, 2, 0, eVar.mo88571e3(), eVar.mo88569c3(), eVar.mo88570d3(), eVar.f180736H, 64, (Object) null);
        }
    }

    /* renamed from: f3 */
    public final MusicMvLyricView mo88608f3() {
        return (MusicMvLyricView) ((C36570n) this.f180910f).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if ((r7 != null && r7.getVisibility() == 0) != false) goto L_0x007a;
     */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88609g3() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<te3.w23> r1 = te3.C64793w23.class
            java.lang.Class<ox.b> r2 = p640ox.C77049b.class
            java.lang.String r3 = r0.f180908d
            java.lang.String r4 = "hideFullLyric"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r3 = 3
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r5 = 2131308811(0x7f09310b, float:1.8235888E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            r7 = 2131305107(0x7f092293, float:1.8228376E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r3[r8] = r7
            r7 = 2131305921(0x7f0925c1, float:1.8230026E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 2
            r3[r9] = r7
            java.util.List r3 = sx3.C64197v.m75539h(r3)
            hb2.f r7 = r0.f180922u
            if (r7 == 0) goto L_0x003c
            boolean r7 = r7.f170778z
            if (r7 != r8) goto L_0x003c
            r7 = 1
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            r9 = 2131315921(0x7f094cd1, float:1.8250309E38)
            r10 = 2131309903(0x7f09354f, float:1.8238103E38)
            if (r7 == 0) goto L_0x0054
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r3.add(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3.add(r7)
            goto L_0x0067
        L_0x0054:
            boolean r7 = r0.f180921t
            if (r7 == 0) goto L_0x0060
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r3.add(r7)
            goto L_0x0067
        L_0x0060:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3.add(r7)
        L_0x0067:
            boolean r7 = r0.f180926y
            if (r7 != 0) goto L_0x007a
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView r7 = r0.f180924w
            if (r7 == 0) goto L_0x0077
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            if (r7 == 0) goto L_0x007d
        L_0x007a:
            r3.remove(r5)
        L_0x007d:
            sb2.k1$a r5 = sb2.C13643k1.f38655c
            android.view.View r7 = r0.f180909e
            r5.mo13038a(r7, r3, r6)
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView r3 = r0.f180924w
            if (r3 == 0) goto L_0x0090
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0090
            r3 = 1
            goto L_0x0091
        L_0x0090:
            r3 = 0
        L_0x0091:
            if (r3 != 0) goto L_0x009f
            boolean r3 = r0.f180926y
            if (r3 != 0) goto L_0x009f
            androidx.recyclerview.widget.RecyclerView r3 = r0.f180912h
            if (r3 != 0) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            r3.setVisibility(r6)
        L_0x009f:
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView r3 = r17.mo88608f3()
            if (r3 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            r5 = 8
            r3.setVisibility(r5)
        L_0x00ab:
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView r3 = r17.mo88608f3()
            boolean r5 = r3.f163610y
            if (r5 == 0) goto L_0x00b4
            goto L_0x00bc
        L_0x00b4:
            r3.f163610y = r8
            r3.mo80567e()
            r3.mo80564b()
        L_0x00bc:
            androidx.recyclerview.widget.RecyclerView r3 = r0.f180912h
            if (r3 == 0) goto L_0x0102
            int r5 = r0.f180917p
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r5)
            java.lang.Object[] r10 = r7.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC"
            java.lang.String r12 = "hideFullLyric"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "scrollToPosition"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r7.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.mo17115r1(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC"
            java.lang.String r11 = "hideFullLyric"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "scrollToPosition"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0102:
            androidx.appcompat.app.AppCompatActivity r3 = r17.getActivity()
            boolean r5 = r3 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            r7 = 0
            if (r5 == 0) goto L_0x010e
            com.tencent.mm.ui.MMFragmentActivity r3 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r3
            goto L_0x010f
        L_0x010e:
            r3 = r7
        L_0x010f:
            if (r3 == 0) goto L_0x011a
            com.tencent.mm.ui.widget.SwipeBackLayout r3 = r3.getSwipeBackLayout()
            if (r3 == 0) goto L_0x011a
            r3.setEnableGesture(r8)
        L_0x011a:
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r5 = r17.getActivity()
            bl3.r$a r3 = r3.mo62444c(r5)
            java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC> r5 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r5)
            java.lang.String r5 = "UICProvider.of(activity)…sicMvMainUIC::class.java)"
            gy3.C87412m.m108593f(r3, r5)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r3 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC) r3
            m03.c r5 = r3.f163276p
            if (r5 == 0) goto L_0x013a
            com.tencent.mm.xeffect.effect.EffectManager r5 = r5.getEffectManager()
            goto L_0x013b
        L_0x013a:
            r5 = r7
        L_0x013b:
            if (r5 == 0) goto L_0x014b
            rr3.b r9 = r0.f180918q
            if (r9 == 0) goto L_0x0144
            long r9 = r9.f330967a
            goto L_0x0146
        L_0x0144:
            r9 = -1
        L_0x0146:
            r5.mo154934n(r9)
            r0.f180918q = r7
        L_0x014b:
            m03.c r5 = r3.f163276p
            if (r5 == 0) goto L_0x0152
            r5.mo86375c()
        L_0x0152:
            r0.f180919r = r6
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = r3.mo80454j3()
            ub2.a r3 = r3.f163274n
            int r3 = r3.f187878m
            r5.notifyItemRangeChanged(r3, r8, r4)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r5 = r0.f180920s
            long r3 = r3 - r5
            di3.d r5 = di3.C86312j.m106911c(r2)
            ox.b r5 = (p640ox.C77049b) r5
            androidx.appcompat.app.AppCompatActivity r6 = r17.getActivity()
            r8 = 7
            pe3.a r5 = r5.Wi0(r6, r8, r1)
            te3.w23 r5 = (te3.C64793w23) r5
            if (r5 == 0) goto L_0x0180
            long r5 = r5.f186048v
            long r5 = r5 + r3
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
        L_0x0180:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ox.b r2 = (p640ox.C77049b) r2
            androidx.appcompat.app.AppCompatActivity r3 = r17.getActivity()
            pe3.a r1 = r2.Wi0(r3, r8, r1)
            te3.w23 r1 = (te3.C64793w23) r1
            if (r1 != 0) goto L_0x0193
            goto L_0x0199
        L_0x0193:
            long r2 = r7.longValue()
            r1.f186048v = r2
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63816o.mo88609g3():void");
    }

    /* renamed from: i3 */
    public final void mo88610i3() {
        SwipeBackLayout swipeBackLayout;
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(getActivity()).mo75002a(MusicMvMainUIC.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvMainUIC::class.java)");
        MusicMvMainUIC musicMvMainUIC = (MusicMvMainUIC) a;
        View view = this.f180909e;
        if (view != null) {
            C13643k1.f38655c.mo13038a(view, C64197v.m75539h(Integer.valueOf(C0966R.C0970id.gju), Integer.valueOf(C0966R.C0970id.h8n), Integer.valueOf(C0966R.C0970id.f358312ed0), Integer.valueOf(C0966R.C0970id.f358390ev0), Integer.valueOf(C0966R.C0970id.m8k)), 8);
        }
        RecyclerView recyclerView = this.f180912h;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        MusicMvLyricView f3 = mo88608f3();
        if (f3 != null) {
            f3.setVisibility(4);
        }
        MusicMvLyricView f35 = mo88608f3();
        if (f35 != null) {
            f35.setAlpha(0.0f);
        }
        ((C63807m) rVar.mo62444c(getActivity()).mo75002a(C63807m.class)).f180881g.mo89414a();
        View view2 = this.f180909e;
        if (view2 != null) {
            view2.post(new C63825i(this));
        }
        AppCompatActivity activity = getActivity();
        EffectManager effectManager = null;
        MMFragmentActivity mMFragmentActivity = activity instanceof MMFragmentActivity ? (MMFragmentActivity) activity : null;
        if (!(mMFragmentActivity == null || (swipeBackLayout = mMFragmentActivity.getSwipeBackLayout()) == null)) {
            swipeBackLayout.setEnableGesture(false);
        }
        C61426c cVar = musicMvMainUIC.f163276p;
        if (cVar != null) {
            effectManager = cVar.getEffectManager();
        }
        if (effectManager != null) {
            C110622b bVar = (C110622b) effectManager.mo154927g(C110632i.BlurEffect);
            this.f180918q = bVar;
            if (bVar != null) {
                bVar.mo162186d(20.0f);
            }
            effectManager.mo154923c(this.f180918q);
        }
        C61426c cVar2 = musicMvMainUIC.f163276p;
        if (cVar2 != null) {
            cVar2.mo86375c();
        }
        View view3 = this.f180909e;
        if (view3 != null) {
            view3.post(new C63826j(this));
        }
        this.f180919r = true;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88611j3(android.view.View r4, hb2.C59822f r5) {
        /*
            r3 = this;
            java.lang.String r0 = "musicMv"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = r3.f180908d
            java.lang.String r1 = "selectView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r3.f180909e = r4
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView r0 = r3.mo88608f3()
            r1 = 0
            if (r0 != 0) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r0.setEventListener(r1)
        L_0x001b:
            if (r4 == 0) goto L_0x0027
            r0 = 2131308811(0x7f09310b, float:1.8235888E38)
            android.view.View r0 = r4.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r3.f180912h = r0
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView r0 = r3.mo88608f3()
            if (r0 != 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            sb2.o$e r2 = r3.f180903E
            r0.setEventListener(r2)
        L_0x0036:
            r3.f180922u = r5
            if (r4 == 0) goto L_0x0044
            r5 = 2131308810(0x7f09310a, float:1.8235886E38)
            android.view.View r4 = r4.findViewById(r5)
            r1 = r4
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView r1 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricPreludeView) r1
        L_0x0044:
            r3.f180924w = r1
            if (r1 == 0) goto L_0x0050
            sb2.o$k r4 = new sb2.o$k
            r4.<init>(r3)
            r1.setOnClickListener(r4)
        L_0x0050:
            boolean r4 = r3.f180926y
            r5 = 4
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = r3.f180908d
            java.lang.String r0 = "show prelude lyric, hide lyricRV"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            androidx.recyclerview.widget.RecyclerView r4 = r3.f180912h
            if (r4 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r4.setVisibility(r5)
        L_0x0065:
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView r4 = r3.f180924w
            if (r4 == 0) goto L_0x0085
            r5 = 0
            r4.setVisibility(r5)
            goto L_0x0085
        L_0x006e:
            boolean r4 = r3.f180927z
            if (r4 == 0) goto L_0x0085
            boolean r4 = r3.f180899A
            if (r4 != 0) goto L_0x0085
            java.lang.String r4 = r3.f180908d
            java.lang.String r0 = "in 3 second, hide lyricRV"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            androidx.recyclerview.widget.RecyclerView r4 = r3.f180912h
            if (r4 != 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r4.setVisibility(r5)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63816o.mo88611j3(android.view.View, hb2.f):void");
    }

    /* renamed from: k3 */
    public final void mo88612k3(C64488kb1 kb12, C61453s sVar, boolean z) {
        C99819r.C61452a a;
        String str;
        String str2 = this.f180908d;
        StringBuilder sb = new StringBuilder();
        sb.append("setSongInfo lyricObj.sentenceSize :");
        Long l = null;
        sb.append(sVar != null ? Integer.valueOf(sVar.mo86427b()) : null);
        sb.append(", lyricList size:");
        sb.append(this.f180913i.size());
        sb.append(", isFromFilterLyric:");
        sb.append(z);
        Log.m105924i(str2, sb.toString());
        if (!(kb12 == null || (str = kb12.f183904d) == null)) {
            MusicMvLyricView f3 = mo88608f3();
            String str3 = kb12.f183905e;
            String str4 = kb12.f183912o;
            f3.getClass();
            MusicMvLyricView.C57109i iVar = f3.f163609x;
            iVar.getClass();
            iVar.f163620a = str;
            MusicMvLyricView.C57109i iVar2 = f3.f163609x;
            if (str3 == null) {
                str3 = "";
            }
            iVar2.getClass();
            iVar2.f163621b = str3;
            MusicMvLyricView.C57109i iVar3 = f3.f163609x;
            if (str4 == null) {
                str4 = "";
            }
            iVar3.getClass();
            iVar3.f163622c = str4;
            f3.mo80564b();
        }
        if (!this.f180900B || this.f180914j.size() < 0) {
            this.f180900B = z;
            this.f180914j.clear();
            this.f180915n = sVar;
            if (sVar != null) {
                int b = sVar.mo86427b();
                for (int i = 0; i < b; i++) {
                    ArrayList<String> arrayList = this.f180914j;
                    String str5 = sVar.mo86426a(i).f174761c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    arrayList.add(str5);
                }
            }
            mo88608f3().setLyricObj(sVar);
            this.f180925x = 0;
            if (this.f180914j.size() > 0) {
                C61453s sVar2 = this.f180915n;
                if (!(sVar2 == null || (a = sVar2.mo86426a(0)) == null)) {
                    l = Long.valueOf(a.f174760b);
                }
                C87412m.m108592e(l, "null cannot be cast to non-null type kotlin.Long");
                this.f180925x = l.longValue();
                String str6 = this.f180908d;
                Log.m105924i(str6, "setSongInfo preludeLen:" + this.f180925x + " ms");
                if (this.f180925x >= 3000) {
                    RecyclerView recyclerView = this.f180912h;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(4);
                    }
                    this.f180926y = true;
                    MusicMvLyricPreludeView musicMvLyricPreludeView = this.f180924w;
                    if (musicMvLyricPreludeView != null) {
                        musicMvLyricPreludeView.setVisibility(0);
                        musicMvLyricPreludeView.mo80553f(0);
                        String str7 = this.f180908d;
                        Log.m105924i(str7, "setSongInfo startAnim:" + this.f180925x + " ms");
                    }
                }
            }
            if (!this.f180900B && !this.f180927z) {
                Log.m105924i(this.f180908d, "set timeout");
                this.f180927z = true;
                RecyclerView recyclerView2 = this.f180912h;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(4);
                }
                this.f180901C.postDelayed(new C63829l(this), 3000);
            }
            for (RecyclerView adapter : this.f180913i) {
                Log.m105925i(this.f180908d, "update lyricLines:%d", Integer.valueOf(this.f180914j.size()));
                C61457a aVar = (C61457a) adapter.getAdapter();
                if (aVar != null) {
                    aVar.mo86433F4(this.f180914j);
                }
            }
            return;
        }
        Log.m105924i(this.f180908d, "current lyrics is filter lyric, not to update");
    }

    public boolean onBackPressed() {
        MusicMvLyricView f3 = mo88608f3();
        boolean z = false;
        if (f3 != null && f3.getVisibility() == 0) {
            z = true;
        }
        if (!z) {
            return super.onBackPressed();
        }
        mo88609g3();
        return true;
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        Log.m105924i(this.f180908d, "onCreateAfter");
        WxRecyclerView lyricRv = mo88608f3().getLyricRv();
        if (lyricRv != null) {
            lyricRv.setOnTouchListener(new C63824h(this));
        }
        MusicMvWxRecyclerView musicMvWxRecyclerView = (MusicMvWxRecyclerView) ((C36570n) this.f180911g).getValue();
        if (musicMvWxRecyclerView != null) {
            musicMvWxRecyclerView.setOnHierarchyChangeListener(this.f180904F);
        }
        MusicMvWxRecyclerView musicMvWxRecyclerView2 = (MusicMvWxRecyclerView) ((C36570n) this.f180911g).getValue();
        if (musicMvWxRecyclerView2 != null) {
            musicMvWxRecyclerView2.setChangeListener(this.f180905G);
        }
    }
}
