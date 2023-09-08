package zp3;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$e;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p585kl.C99147e;
import p813fl.C97906h;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13598b0;
import vd3.C78405p;

/* renamed from: zp3.g */
public final class C103055g implements C78405p {

    /* renamed from: a */
    public final Context f304046a;

    /* renamed from: b */
    public final C97906h f304047b;

    /* renamed from: c */
    public View f304048c;

    /* renamed from: d */
    public float f304049d;

    /* renamed from: e */
    public C78405p.C78406a f304050e;

    /* renamed from: f */
    public VelocityTracker f304051f;

    /* renamed from: g */
    public final int f304052g;

    /* renamed from: h */
    public int f304053h = -1;

    /* renamed from: i */
    public final int f304054i;

    /* renamed from: j */
    public final OverScroller f304055j;

    /* renamed from: k */
    public boolean f304056k = true;

    /* renamed from: l */
    public final int f304057l;

    /* renamed from: m */
    public C32224a<C13598b0> f304058m;

    /* renamed from: n */
    public boolean f304059n;

    /* renamed from: o */
    public boolean f304060o;

    /* renamed from: p */
    public int f304061p;

    /* renamed from: q */
    public final Set<C103057b> f304062q;

    /* renamed from: r */
    public boolean f304063r;

    /* renamed from: s */
    public int f304064s;

    /* renamed from: t */
    public C99147e f304065t;

    /* renamed from: zp3.g$a */
    public static final class C103056a implements Interpolator {

        /* renamed from: a */
        public static final C103056a f304066a = new C103056a();

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: zp3.g$b */
    public interface C103057b {
        /* renamed from: a */
        void mo136406a();

        /* renamed from: b */
        void mo136407b();
    }

    /* renamed from: zp3.g$c */
    public /* synthetic */ class C103058c implements Runnable {
        public C103058c() {
        }

        public final void run() {
            C103055g.this.mo142756a();
        }
    }

    /* renamed from: zp3.g$d */
    public /* synthetic */ class C103059d implements Runnable {
        public C103059d() {
        }

        public final void run() {
            C103055g.this.mo142756a();
        }
    }

    public C103055g(Context context, C97906h hVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hVar, "config");
        this.f304046a = context;
        this.f304047b = hVar;
        this.f304057l = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3705bx);
        this.f304062q = new LinkedHashSet();
        this.f304063r = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f304052g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f304054i = viewConfiguration.getScaledTouchSlop();
        this.f304055j = new OverScroller(context, C103056a.f304066a);
    }

    /* renamed from: a */
    public final void mo142756a() {
        if (this.f304055j.computeScrollOffset()) {
            mo142758c(this.f304055j.getCurrY());
            C78405p.C78406a aVar = this.f304050e;
            if (aVar != null) {
                ((ChatFooter$$e) aVar).mo100518b(this.f304064s);
            }
            if (this.f304055j.isFinished()) {
                C97906h hVar = this.f304047b;
                int i = this.f304064s;
                int i2 = this.f304061p;
                boolean z = true;
                hVar.f287217n = i == i2;
                C78405p.C78406a aVar2 = this.f304050e;
                if (aVar2 != null) {
                    if (i != i2) {
                        z = false;
                    }
                    ((ChatFooter$$e) aVar2).mo100517a(z);
                }
                C32224a<C13598b0> aVar3 = this.f304058m;
                if (aVar3 != null) {
                    aVar3.invoke();
                    return;
                }
                return;
            }
            View view = this.f304048c;
            if (view != null) {
                C103058c cVar = new C103058c();
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(view, cVar);
            }
        }
    }

    /* renamed from: b */
    public void mo142757b(int i, int i2, int i3) {
        int i4 = this.f304057l;
        this.f304061p = (i - i4) + i3 > i2 ? ((i - i2) - i4) - i3 : 0;
        Log.m105924i("MicroMsg.EmojiPanelDragIndicator", "determineExtent: parentHeight=" + i + ", collapsedHeight=" + i2 + ", inputHeight=" + i3 + ", maxExtendedHeight=" + this.f304061p);
    }

    /* renamed from: c */
    public void mo142758c(int i) {
        this.f304064s = i;
        boolean z = i == 0;
        if (this.f304063r != z) {
            if (z) {
                for (C103057b b : this.f304062q) {
                    b.mo136407b();
                }
            } else {
                for (C103057b a : this.f304062q) {
                    a.mo136406a();
                }
            }
        }
        this.f304063r = z;
    }

    /* renamed from: d */
    public final void mo142759d(int i, int i2) {
        int i3 = i - this.f304064s;
        Log.m105924i("MicroMsg.EmojiPanelDragIndicator", "settle, target: " + i + ", duration: " + i2 + ", dy: " + i3);
        this.f304055j.forceFinished(true);
        this.f304055j.startScroll(0, this.f304064s, 0, i3, i2);
        View view = this.f304048c;
        if (view != null) {
            C103059d dVar = new C103059d();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(view, dVar);
        }
    }
}
