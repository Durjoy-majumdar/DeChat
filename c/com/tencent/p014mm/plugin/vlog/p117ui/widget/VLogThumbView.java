package com.tencent.p014mm.plugin.vlog.p117ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l23.C109202j;
import p385u2.C111105a;
import r23.C110499e;
import rx3.C13598b0;
import u23.C111119f;
import u23.C111127k;
import u23.C65003a;
import u23.C65005i;
import w13.C111710d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002=>B\u001d\b\u0007\u0012\u0006\u00108\u001a\u000207\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00106\u001a\u0004\u0018\u0001012\b\u0010)\u001a\u0004\u0018\u0001018F@FX\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006?"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "d", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "D", "I", "getScrollCount", "()I", "setScrollCount", "(I)V", "scrollCount", "Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$f;", "E", "Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$f;", "getSortCallback", "()Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$f;", "setSortCallback", "(Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$f;)V", "sortCallback", "Ll23/j$e;", "G", "Ll23/j$e;", "getAudioSeekable", "()Ll23/j$e;", "setAudioSeekable", "(Ll23/j$e;)V", "audioSeekable", "Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$e;", "T", "Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$e;", "getOnSelectCallback", "()Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$e;", "setOnSelectCallback", "(Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$e;)V", "onSelectCallback", "", "value", "U", "J", "getProgress", "()J", "setProgress", "(J)V", "progress", "Lu23/i;", "getThumbFetcherFactory", "()Lu23/i;", "setThumbFetcherFactory", "(Lu23/i;)V", "thumbFetcherFactory", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "e", "f", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView */
public final class VLogThumbView extends FrameLayout {

    /* renamed from: A */
    public int f317000A;

    /* renamed from: B */
    public int f317001B;

    /* renamed from: C */
    public long f317002C;

    /* renamed from: D */
    public int f317003D;

    /* renamed from: E */
    public C106305f f317004E;

    /* renamed from: F */
    public C109202j.C99301e f317005F;

    /* renamed from: G */
    public C109202j.C99301e f317006G;

    /* renamed from: H */
    public boolean f317007H;

    /* renamed from: I */
    public boolean f317008I;

    /* renamed from: J */
    public final LinkedList<C65003a> f317009J;

    /* renamed from: K */
    public boolean f317010K;

    /* renamed from: L */
    public long f317011L;

    /* renamed from: M */
    public long f317012M;

    /* renamed from: N */
    public long f317013N;

    /* renamed from: P */
    public int f317014P;

    /* renamed from: Q */
    public boolean f317015Q;

    /* renamed from: R */
    public int f317016R;

    /* renamed from: S */
    public int f317017S;

    /* renamed from: T */
    public C106304e f317018T;

    /* renamed from: U */
    public long f317019U;

    /* renamed from: d */
    public final RecyclerView f317020d;

    /* renamed from: e */
    public final ImageView f317021e;

    /* renamed from: f */
    public final LinearLayoutManager f317022f;

    /* renamed from: g */
    public final C111119f f317023g;

    /* renamed from: h */
    public final C110499e f317024h;

    /* renamed from: i */
    public int f317025i = 1;

    /* renamed from: j */
    public long f317026j;

    /* renamed from: n */
    public long f317027n;

    /* renamed from: o */
    public boolean f317028o = true;

    /* renamed from: p */
    public int f317029p;

    /* renamed from: q */
    public int f317030q;

    /* renamed from: r */
    public float f317031r = 1.0f;

    /* renamed from: s */
    public Runnable f317032s;

    /* renamed from: t */
    public final C111127k f317033t;

    /* renamed from: u */
    public final C111127k f317034u;

    /* renamed from: v */
    public boolean f317035v;

    /* renamed from: w */
    public float f317036w;

    /* renamed from: x */
    public float f317037x;

    /* renamed from: y */
    public float f317038y;

    /* renamed from: z */
    public float f317039z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$a */
    public static final class C106298a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ VLogThumbView f317041d;

        public C106298a(VLogThumbView vLogThumbView) {
            this.f317041d = vLogThumbView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            Log.m105924i("MicroMsg.VLogThumbView", "onScrollStateChanged: " + i);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                VLogThumbView vLogThumbView = this.f317041d;
                if (vLogThumbView.f317007H) {
                    vLogThumbView.f317028o = true;
                    C109202j.C99301e eVar = vLogThumbView.f317005F;
                    if (eVar != null) {
                        eVar.resume();
                    }
                    this.f317041d.f317007H = false;
                }
                this.f317041d.f317015Q = false;
            } else if (i == 1) {
                VLogThumbView vLogThumbView2 = this.f317041d;
                if (!vLogThumbView2.f317015Q) {
                    vLogThumbView2.setScrollCount(vLogThumbView2.getScrollCount() + 1);
                }
                this.f317041d.f317015Q = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            C109202j.C99301e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            VLogThumbView vLogThumbView = this.f317041d;
            if (vLogThumbView.f317008I) {
                vLogThumbView.f317030q += i;
            }
            Log.m105918d("MicroMsg.VLogThumbView", "onScrolled, scrolledX:" + this.f317041d.f317030q + ", dx:" + i + ", isThumbViewReady:" + this.f317041d.f317008I);
            VLogThumbView vLogThumbView2 = this.f317041d;
            if (!vLogThumbView2.f317028o && vLogThumbView2.f317008I && (i3 = vLogThumbView2.f317025i) > 0 && i != 0 && (eVar = vLogThumbView2.f317005F) != null) {
                long j = vLogThumbView2.f317027n;
                long j2 = vLogThumbView2.f317026j;
                C109202j.C99301e.C99302a.m129467a(eVar, (((j - j2) * ((long) vLogThumbView2.f317030q)) / ((long) i3)) + j2, (Object) null, 2, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$b */
    public static final class C106299b implements RecyclerView.C16622o {

        /* renamed from: d */
        public final /* synthetic */ VLogThumbView f317042d;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$b$a */
        public static final class C106300a extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ VLogThumbView f317043d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f317044e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106300a(VLogThumbView vLogThumbView, C8477a0 a0Var) {
                super(1);
                this.f317043d = vLogThumbView;
                this.f317044e = a0Var;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                if (intValue != -1) {
                    C106304e onSelectCallback = this.f317043d.getOnSelectCallback();
                    if (onSelectCallback != null) {
                        onSelectCallback.mo152413a(intValue);
                    }
                    this.f317044e.f27482d = true;
                }
                return C13598b0.f38549a;
            }
        }

        public C106299b(VLogThumbView vLogThumbView) {
            this.f317042d = vLogThumbView;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(motionEvent, "event");
            Log.m105924i("MicroMsg.VLogThumbView", "onTouchEvent: " + motionEvent.getX());
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(motionEvent, "event");
            Log.m105924i("MicroMsg.VLogThumbView", "onInterceptTouchEvent: " + motionEvent.getX() + ", " + motionEvent.getAction());
            this.f317042d.f317036w = motionEvent.getX();
            this.f317042d.f317037x = motionEvent.getY();
            C8477a0 a0Var = new C8477a0();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f317042d.f317007H = false;
                recyclerView.mo17155w1();
                VLogThumbView vLogThumbView = this.f317042d;
                vLogThumbView.f317028o = false;
                C109202j.C99301e eVar = vLogThumbView.f317005F;
                if (eVar != null) {
                    eVar.pause();
                }
                C109202j.C99301e audioSeekable = this.f317042d.getAudioSeekable();
                if (audioSeekable != null) {
                    audioSeekable.pause();
                }
                this.f317042d.f317002C = System.currentTimeMillis();
                VLogThumbView vLogThumbView2 = this.f317042d;
                vLogThumbView2.f317038y = vLogThumbView2.f317036w;
                vLogThumbView2.f317039z = vLogThumbView2.f317037x;
            } else if (action == 1 || action == 3) {
                this.f317042d.getClass();
                if (recyclerView.getScrollState() == 0) {
                    VLogThumbView vLogThumbView3 = this.f317042d;
                    vLogThumbView3.f317028o = true;
                    C109202j.C99301e eVar2 = vLogThumbView3.f317005F;
                    if (eVar2 != null) {
                        eVar2.resume();
                    }
                    this.f317042d.f317007H = false;
                } else {
                    this.f317042d.f317007H = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                VLogThumbView vLogThumbView4 = this.f317042d;
                if (currentTimeMillis - vLogThumbView4.f317002C < ((long) vLogThumbView4.f317001B)) {
                    float abs = Math.abs(vLogThumbView4.f317036w - vLogThumbView4.f317038y);
                    VLogThumbView vLogThumbView5 = this.f317042d;
                    if (abs < ((float) vLogThumbView5.f317000A)) {
                        float abs2 = Math.abs(vLogThumbView5.f317037x - vLogThumbView5.f317039z);
                        VLogThumbView vLogThumbView6 = this.f317042d;
                        if (abs2 < ((float) vLogThumbView6.f317000A) && vLogThumbView6.f317035v) {
                            C110499e eVar3 = vLogThumbView6.f317024h;
                            float f = vLogThumbView6.f317036w;
                            C106300a aVar = new C106300a(vLogThumbView6, a0Var);
                            eVar3.getClass();
                            int i = eVar3.f330413f;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= i) {
                                    aVar.invoke(-1);
                                    break;
                                }
                                C110499e.C110500a aVar2 = (C110499e.C110500a) ((ArrayList) eVar3.f330416i).get(i2);
                                if (f <= aVar2.f330422c && aVar2.f330421b <= f) {
                                    aVar.invoke(Integer.valueOf(((C110499e.C110500a) ((ArrayList) eVar3.f330416i).get(i2)).f330420a));
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
                this.f317042d.f317002C = currentTimeMillis;
            }
            return a0Var.f27482d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$c */
    public static final class C106301c extends C16665p.C16673d {

        /* renamed from: d */
        public final /* synthetic */ VLogThumbView f317045d;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$c$a */
        public static final class C106302a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ VLogThumbView f317046d;

            public C106302a(VLogThumbView vLogThumbView) {
                this.f317046d = vLogThumbView;
            }

            public final void run() {
                C111119f fVar = this.f317046d.f317023g;
                fVar.notifyItemRangeChanged(0, fVar.getItemCount());
            }
        }

        public C106301c(VLogThumbView vLogThumbView) {
            this.f317045d = vLogThumbView;
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            if (!this.f317045d.f317010K) {
                return 0;
            }
            return C16665p.C16673d.m16132g(15, 0);
        }

        /* renamed from: i */
        public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            C87412m.m108594g(zVar2, "target");
            if (!this.f317045d.f317010K || zVar.f44859i != zVar2.f44859i) {
                return false;
            }
            int j = zVar.mo17363j();
            int j2 = zVar2.mo17363j();
            this.f317045d.f317009J.get(j).f187129i = j2;
            this.f317045d.f317009J.get(j2).f187129i = j;
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemMoved(j, j2);
            }
            Collections.swap(this.f317045d.f317009J, j, j2);
            C106305f sortCallback = this.f317045d.getSortCallback();
            if (sortCallback != null) {
                sortCallback.onMove(j - 1, j2 - 1);
            }
            return true;
        }

        /* renamed from: j */
        public void mo17555j(RecyclerView.C16631z zVar, int i) {
            if (this.f317045d.f317010K) {
                Log.m105918d("MicroMsg.VLogThumbView", "onSelectedChanged, viewHolder:" + zVar + ", actionState:" + i);
                if (zVar != null) {
                    RecyclerView.LayoutManager layoutManager = this.f317045d.getRecyclerView().getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int j = zVar.mo17363j();
                    VLogThumbView vLogThumbView = this.f317045d;
                    int b = ((int) vLogThumbView.f317036w) - (C76577a.m92151b(vLogThumbView.getRecyclerView().getContext(), 56) / 2);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(b));
                    aVar.mo10233c(Integer.valueOf(j));
                    C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$4", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$4", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    for (C65003a aVar2 : this.f317045d.f317009J) {
                        aVar2.f187128h = true;
                    }
                    C111119f fVar = this.f317045d.f317023g;
                    fVar.notifyItemRangeChanged(0, fVar.getItemCount());
                }
                if (zVar == null && i == 0) {
                    C106305f sortCallback = this.f317045d.getSortCallback();
                    if (sortCallback != null) {
                        sortCallback.mo152194a();
                    }
                    VLogThumbView vLogThumbView2 = this.f317045d;
                    vLogThumbView2.f317028o = true;
                    for (C65003a aVar3 : vLogThumbView2.f317009J) {
                        aVar3.f187128h = false;
                    }
                    VLogThumbView vLogThumbView3 = this.f317045d;
                    vLogThumbView3.post(new C106302a(vLogThumbView3));
                }
            }
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "viewHolder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$d */
    public static final class C106303d extends C87413o implements C32227p<Integer, C65003a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VLogThumbView f317047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106303d(VLogThumbView vLogThumbView) {
            super(2);
            this.f317047d = vLogThumbView;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            C65003a aVar = (C65003a) obj2;
            C87412m.m108594g(aVar, "info");
            if (!aVar.mo88222e() && aVar.f187129i >= 0) {
                C106304e onSelectCallback = this.f317047d.getOnSelectCallback();
                if (onSelectCallback != null) {
                    onSelectCallback.mo152414b(aVar.f187129i);
                }
                VLogThumbView vLogThumbView = this.f317047d;
                C110499e eVar = vLogThumbView.f317024h;
                int i = aVar.f187129i;
                eVar.f330419o = i;
                vLogThumbView.f317014P = i;
                vLogThumbView.f317012M = aVar.mo88220c();
                this.f317047d.f317013N = aVar.mo88218a();
                this.f317047d.f317023g.mo162858G4(aVar.f187129i);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$e */
    public interface C106304e {
        /* renamed from: a */
        void mo152413a(int i);

        /* renamed from: b */
        void mo152414b(int i);
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView$f */
    public interface C106305f {
        /* renamed from: a */
        void mo152194a();

        void onMove(int i, int i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VLogThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C111127k.C111128a aVar = C111127k.f332730o;
        this.f317033t = aVar.mo162866a(0);
        this.f317034u = aVar.mo162866a(0);
        this.f317000A = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f317001B = 200;
        this.f317009J = new LinkedList<>();
        this.f317014P = -1;
        C1062971 r3 = new LinearLayoutManager(context) {
            public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
                VLogThumbView vLogThumbView = this;
                int i2 = vLogThumbView.f317030q + i;
                if (vLogThumbView.f317014P < 0 || !vLogThumbView.f317015Q) {
                    return super.scrollHorizontallyBy(i, rVar, wVar);
                }
                float f = (float) vLogThumbView.f317011L;
                float f2 = (float) vLogThumbView.f317025i;
                float f3 = (float) (vLogThumbView.f317024h.f330414g / 2);
                float f4 = (((((float) vLogThumbView.f317012M) * 1.0f) / f) * f2) - f3;
                float f5 = (((((float) vLogThumbView.f317013N) * 1.0f) / f) * f2) + f3;
                Log.m105918d("MicroMsg.VLogThumbView", "startOffset:" + f4 + ", endOffset:" + f5 + ", totalWith:" + vLogThumbView.f317025i + ", scrollX:" + vLogThumbView.f317030q);
                float f6 = (float) i2;
                if (f6 <= Float.valueOf(f5).floatValue() && f6 >= Float.valueOf(f4).floatValue()) {
                    return super.scrollHorizontallyBy(i, rVar, wVar);
                }
                return 0;
            }
        };
        this.f317022f = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C111710d.f334386a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr….styleable.VLogThumbView)");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            Object obj = C111105a.f332697a;
            drawable = C111105a.C111110c.m151511b(context, C0966R.C0969drawable.azp);
        }
        this.f317017S = obtainStyledAttributes.getDimensionPixelSize(2, 63);
        this.f317016R = obtainStyledAttributes.getDimensionPixelSize(1, 112);
        obtainStyledAttributes.recycle();
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        this.f317020d = recyclerView;
        recyclerView.setLayoutManager(r3);
        C111119f fVar = new C111119f();
        this.f317023g = fVar;
        recyclerView.setAdapter(fVar);
        recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        recyclerView.setHorizontalFadingEdgeEnabled(true);
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setFadingEdgeLength(getResources().getDimensionPixelSize(C0966R.dimen.f3766df));
        addView(recyclerView, new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C0966R.dimen.f3755d6), 16));
        ImageView imageView = new ImageView(context);
        this.f317021e = imageView;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(4);
        addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        setFocusableInTouchMode(false);
        setFocusable(false);
        this.f317024h = new C110499e(context, fVar);
        recyclerView.mo17043c(new C106298a(this));
        recyclerView.mo17092j0(new C106299b(this));
        new C16665p(new C106301c(this)).mo17527j(recyclerView);
        fVar.f332716h = new C106303d(this);
        mo152397b(true);
    }

    /* renamed from: a */
    public final void mo152396a(int i, long j, long j2) {
        Log.m105924i("MicroMsg.VLogThumbView", "selectTrack:" + i);
        this.f317014P = i;
        this.f317012M = j;
        this.f317013N = j2;
        if (i == -1) {
            clearFocus();
        } else {
            this.f317023g.mo162858G4(i);
        }
    }

    /* renamed from: b */
    public final void mo152397b(boolean z) {
        this.f317035v = z;
        if (z) {
            if (this.f317020d.getItemDecorationCount() == 1) {
                this.f317020d.mo17085h0(this.f317024h);
            }
        } else if (this.f317020d.getItemDecorationCount() == 2) {
            this.f317020d.mo17093j1(this.f317024h);
        }
    }

    public void clearFocus() {
        super.clearFocus();
        this.f317023g.mo162858G4(-1);
        this.f317024h.f330419o = -1;
    }

    public final C109202j.C99301e getAudioSeekable() {
        return this.f317006G;
    }

    public final C106304e getOnSelectCallback() {
        return this.f317018T;
    }

    public final long getProgress() {
        return this.f317019U;
    }

    public final RecyclerView getRecyclerView() {
        return this.f317020d;
    }

    public final int getScrollCount() {
        return this.f317003D;
    }

    public final C106305f getSortCallback() {
        return this.f317004E;
    }

    public final C65005i getThumbFetcherFactory() {
        return this.f317023g.f332717i;
    }

    public final void setAudioSeekable(C109202j.C99301e eVar) {
        this.f317006G = eVar;
    }

    public final void setOnSelectCallback(C106304e eVar) {
        this.f317018T = eVar;
    }

    public final void setProgress(long j) {
        this.f317019U = j;
        if (this.f317028o) {
            long j2 = this.f317026j;
            if (j == j2) {
                LinearLayoutManager linearLayoutManager = this.f317022f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(0);
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                this.f317030q = 0;
                return;
            }
            this.f317020d.mo17122s1(((int) ((((float) ((j - j2) * ((long) this.f317025i))) * 1.0f) / ((float) this.f317011L))) - this.f317030q, 0, (Interpolator) null);
        }
    }

    public final void setScrollCount(int i) {
        this.f317003D = i;
    }

    public final void setSortCallback(C106305f fVar) {
        this.f317004E = fVar;
    }

    public final void setThumbFetcherFactory(C65005i iVar) {
        this.f317023g.f332717i = iVar;
    }
}
