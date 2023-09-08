package com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.FrameListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.CMTimeRange;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import p23.C110129a;
import sx3.C36907w;
import sx3.C64197v;
import u23.C111119f;
import u23.C111127k;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B!\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010.\u001a\u00020\u0012¢\u0006\u0004\b/\u00100B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b/\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003R(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u00063"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropViewGroup;", "Landroid/widget/FrameLayout;", "", "", "getScrollTime", "", "enable", "Lrx3/b0;", "setEnableLengthEdit", "timeMs", "setProgress", "Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar;", "<set-?>", "g", "Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar;", "getSeekSlider", "()Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar;", "seekSlider", "", "u", "I", "getDragCnt", "()I", "setDragCnt", "(I)V", "dragCnt", "v", "getCutCnt", "setCutCnt", "cutCnt", "Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropViewGroup$a;", "x", "Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropViewGroup$a;", "getCallback", "()Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropViewGroup$a;", "setCallback", "(Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropViewGroup$a;)V", "callback", "y", "getRealTimeCallback", "setRealTimeCallback", "realTimeCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup */
public final class TimeCropViewGroup extends FrameLayout implements C111847h {

    /* renamed from: d */
    public final String f316741d;

    /* renamed from: e */
    public RecyclerView f316742e;

    /* renamed from: f */
    public C111119f f316743f;

    /* renamed from: g */
    public TimeCropSliderSeekBar f316744g;

    /* renamed from: h */
    public int f316745h;

    /* renamed from: i */
    public int f316746i;

    /* renamed from: j */
    public long f316747j;

    /* renamed from: n */
    public long f316748n;

    /* renamed from: o */
    public long f316749o;

    /* renamed from: p */
    public long f316750p;

    /* renamed from: q */
    public float f316751q;

    /* renamed from: r */
    public int f316752r;

    /* renamed from: s */
    public final C111127k f316753s;

    /* renamed from: t */
    public final C111127k f316754t;

    /* renamed from: u */
    public int f316755u;

    /* renamed from: v */
    public int f316756v;

    /* renamed from: w */
    public Runnable f316757w;

    /* renamed from: x */
    public C106240a f316758x;

    /* renamed from: y */
    public C106240a f316759y;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup$a */
    public interface C106240a {
        /* renamed from: a */
        void mo138715a(long j, long j2, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup$b */
    public static final class C106241b implements TimeCropSliderSeekBar.C106238b {

        /* renamed from: a */
        public final /* synthetic */ TimeCropViewGroup f316760a;

        public C106241b(TimeCropViewGroup timeCropViewGroup) {
            this.f316760a = timeCropViewGroup;
        }

        /* renamed from: a */
        public void mo152229a(boolean z) {
        }

        /* renamed from: b */
        public void mo152230b(boolean z) {
            TimeCropViewGroup.m142976a(this.f316760a);
            C106240a callback = this.f316760a.getCallback();
            if (callback != null) {
                TimeCropViewGroup timeCropViewGroup = this.f316760a;
                callback.mo138715a(timeCropViewGroup.f316749o, timeCropViewGroup.f316750p, true);
            }
        }

        /* renamed from: c */
        public void mo152231c(boolean z) {
            TimeCropViewGroup.m142976a(this.f316760a);
            C106240a realTimeCallback = this.f316760a.getRealTimeCallback();
            if (realTimeCallback != null) {
                TimeCropViewGroup timeCropViewGroup = this.f316760a;
                realTimeCallback.mo138715a(timeCropViewGroup.f316749o, timeCropViewGroup.f316750p, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup$c */
    public static final class C106242c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TimeCropViewGroup f316761d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<C111127k> f316762e;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup$c$a */
        public static final class C106243a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TimeCropViewGroup f316763d;

            public C106243a(TimeCropViewGroup timeCropViewGroup) {
                this.f316763d = timeCropViewGroup;
            }

            public final void run() {
                TimeCropSliderSeekBar seekSlider = this.f316763d.getSeekSlider();
                if (seekSlider != null) {
                    TimeCropViewGroup timeCropViewGroup = this.f316763d;
                    seekSlider.mo152218f(true, ((float) timeCropViewGroup.f316752r) + (((float) timeCropViewGroup.f316749o) * timeCropViewGroup.f316751q));
                }
                TimeCropSliderSeekBar seekSlider2 = this.f316763d.getSeekSlider();
                if (seekSlider2 != null) {
                    TimeCropViewGroup timeCropViewGroup2 = this.f316763d;
                    seekSlider2.mo152218f(false, ((float) timeCropViewGroup2.f316752r) + (((float) timeCropViewGroup2.f316750p) * timeCropViewGroup2.f316751q));
                }
            }
        }

        public C106242c(TimeCropViewGroup timeCropViewGroup, LinkedList<C111127k> linkedList, long j) {
            this.f316761d = timeCropViewGroup;
            this.f316762e = linkedList;
        }

        public final void run() {
            TimeCropViewGroup timeCropViewGroup = this.f316761d;
            RecyclerView recyclerView = timeCropViewGroup.f316742e;
            if (recyclerView != null) {
                LinkedList<C111127k> linkedList = this.f316762e;
                if (recyclerView.getWidth() <= 0) {
                    recyclerView.post(timeCropViewGroup.f316757w);
                    return;
                }
                timeCropViewGroup.f316752r = C76577a.m92151b(timeCropViewGroup.getContext(), 40);
                float height = (((float) recyclerView.getHeight()) * 1.0f) / ((float) timeCropViewGroup.f316745h);
                float width = (((float) (recyclerView.getWidth() - (timeCropViewGroup.f316752r * 2))) * 1.0f) / ((float) timeCropViewGroup.f316748n);
                timeCropViewGroup.f316751q = width;
                float f = ((float) ((int) (width * ((float) timeCropViewGroup.f316747j)))) / (((float) timeCropViewGroup.f316746i) * height);
                for (C111127k kVar : linkedList) {
                    kVar.f187126f = ((f / ((float) timeCropViewGroup.f316747j)) * ((float) (kVar.f187125e - kVar.f187124d))) / kVar.f332732n.f316501l.f331468f;
                    kVar.mo89218f();
                }
                C111127k kVar2 = timeCropViewGroup.f316753s;
                int i = timeCropViewGroup.f316752r;
                kVar2.f187123c = i;
                timeCropViewGroup.f316754t.f187123c = i;
                linkedList.add(0, kVar2);
                linkedList.add(timeCropViewGroup.f316754t);
                C111119f fVar = timeCropViewGroup.f316743f;
                if (fVar != null) {
                    fVar.mo162859O4(linkedList);
                }
                C111119f fVar2 = timeCropViewGroup.f316743f;
                if (fVar2 != null) {
                    fVar2.notifyDataSetChanged();
                }
                TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
                if (seekSlider != null) {
                    int width2 = recyclerView.getWidth();
                    int i2 = timeCropViewGroup.f316752r;
                    seekSlider.post(new C110129a(seekSlider, width2 - (i2 * 2), i2, (int) (((float) 1000) * timeCropViewGroup.f316751q)));
                }
                TimeCropSliderSeekBar seekSlider2 = timeCropViewGroup.getSeekSlider();
                if (seekSlider2 != null) {
                    seekSlider2.setCursorPos(0.0f);
                }
                TimeCropSliderSeekBar seekSlider3 = timeCropViewGroup.getSeekSlider();
                if (seekSlider3 != null) {
                    seekSlider3.post(new C106243a(timeCropViewGroup));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeCropViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316741d = "MicroMsg.TrackCropView";
        this.f316745h = 112;
        this.f316746i = 63;
        this.f316750p = 1;
        this.f316751q = 1.0f;
        C111127k.C111128a aVar = C111127k.f332730o;
        this.f316753s = aVar.mo162866a(0);
        this.f316754t = aVar.mo162866a(0);
    }

    /* renamed from: a */
    public static final void m142976a(TimeCropViewGroup timeCropViewGroup) {
        View view;
        long j;
        TimeCropSliderSeekBar timeCropSliderSeekBar;
        RecyclerView recyclerView = timeCropViewGroup.f316742e;
        View view2 = null;
        if (recyclerView != null) {
            int i = 0;
            int childCount = recyclerView.getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                }
                view = recyclerView.getChildAt(i);
                if (view instanceof FrameListView) {
                    int N0 = recyclerView.mo17029N0(view);
                    if (N0 >= 0) {
                        C111119f fVar = timeCropViewGroup.f316743f;
                        C87412m.m108591d(fVar);
                        if (N0 < fVar.getItemCount()) {
                            C111119f fVar2 = timeCropViewGroup.f316743f;
                            C87412m.m108591d(fVar2);
                            j = ((C111127k) fVar2.mo162857F4(N0)).mo88220c();
                            break;
                        }
                    }
                    view2 = view;
                }
                i++;
            }
        }
        view = view2;
        j = 0;
        if (view == null || (timeCropSliderSeekBar = timeCropViewGroup.f316744g) == null) {
            timeCropViewGroup.f316749o = 0;
            timeCropViewGroup.f316750p = timeCropViewGroup.f316747j;
            return;
        }
        float f = (float) j;
        long leftSliderBound = (long) ((((float) (timeCropSliderSeekBar.getLeftSliderBound() - view.getLeft())) / timeCropViewGroup.f316751q) + f);
        timeCropViewGroup.f316749o = leftSliderBound;
        if (leftSliderBound < 0) {
            timeCropViewGroup.f316749o = 0;
        }
        TimeCropSliderSeekBar timeCropSliderSeekBar2 = timeCropViewGroup.f316744g;
        C87412m.m108591d(timeCropSliderSeekBar2);
        long rightSliderBound = (long) ((((float) (timeCropSliderSeekBar2.getRightSliderBound() - view.getLeft())) / timeCropViewGroup.f316751q) + f);
        timeCropViewGroup.f316750p = rightSliderBound;
        long j2 = timeCropViewGroup.f316747j;
        if (rightSliderBound > j2) {
            timeCropViewGroup.f316750p = j2;
        }
    }

    private final long getScrollTime() {
        long j;
        RecyclerView recyclerView = this.f316742e;
        View view = null;
        if (recyclerView != null) {
            int i = 0;
            int childCount = recyclerView.getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i);
                if (childAt instanceof FrameListView) {
                    int N0 = recyclerView.mo17029N0(childAt);
                    if (N0 >= 0) {
                        C111119f fVar = this.f316743f;
                        C87412m.m108591d(fVar);
                        if (N0 < fVar.getItemCount()) {
                            C111119f fVar2 = this.f316743f;
                            C87412m.m108591d(fVar2);
                            j = fVar2.mo162857F4(N0).mo88220c();
                            view = childAt;
                            break;
                        }
                    }
                    view = childAt;
                }
                i++;
            }
        }
        j = 0;
        if (view == null) {
            return 0;
        }
        return (long) ((((float) view.getLeft()) / this.f316751q) + ((float) j));
    }

    /* renamed from: b */
    public final void mo152236b(C96552p0 p0Var, long j, long j2) {
        C87412m.m108594g(p0Var, "composition");
        this.f316755u = 0;
        this.f316756v = 0;
        LinkedList linkedList = new LinkedList();
        this.f316747j = p0Var.getDurationMs();
        CMTimeRange k = p0Var.mo134614k();
        this.f316748n = p0Var.getDurationMs();
        this.f316749o = j;
        this.f316750p = j2;
        if (j < 0 || j2 < 0) {
            long j3 = (long) 1000;
            this.f316749o = k.getStartUs() / j3;
            this.f316750p = k.getEndUs() / j3;
        }
        List<C106205q0> o = p0Var.mo134618o();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(o, 10));
        int i = 0;
        for (T next : o) {
            int i2 = i + 1;
            if (i >= 0) {
                C111127k kVar = new C111127k((C106205q0) next);
                kVar.f187129i = i;
                kVar.f187122b = this.f316745h;
                kVar.f187121a = this.f316746i;
                arrayList.add(kVar);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        linkedList.addAll(arrayList);
        if (linkedList.size() == 1) {
            int i3 = ((C111127k) linkedList.get(0)).f332732n.f316491b;
        }
        C106242c cVar = new C106242c(this, linkedList, 1000);
        this.f316757w = cVar;
        cVar.run();
    }

    public final C106240a getCallback() {
        return this.f316758x;
    }

    public final int getCutCnt() {
        return this.f316756v;
    }

    public final int getDragCnt() {
        return this.f316755u;
    }

    public final C106240a getRealTimeCallback() {
        return this.f316759y;
    }

    public final TimeCropSliderSeekBar getSeekSlider() {
        return this.f316744g;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f316742e = (RecyclerView) findViewById(C0966R.C0970id.kt8);
        TimeCropSliderSeekBar timeCropSliderSeekBar = (TimeCropSliderSeekBar) findViewById(C0966R.C0970id.kt7);
        this.f316744g = timeCropSliderSeekBar;
        if (timeCropSliderSeekBar != null) {
            timeCropSliderSeekBar.setMaskColor(1999383596);
        }
        TimeCropSliderSeekBar timeCropSliderSeekBar2 = this.f316744g;
        if (timeCropSliderSeekBar2 != null) {
            timeCropSliderSeekBar2.setEnableHapticAtEdge(true);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        RecyclerView recyclerView = this.f316742e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        C111119f fVar = new C111119f();
        this.f316743f = fVar;
        fVar.f332718j = true;
        RecyclerView recyclerView2 = this.f316742e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(fVar);
        }
        RecyclerView recyclerView3 = this.f316742e;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator((RecyclerView.C16616j) null);
        }
        C106241b bVar = new C106241b(this);
        TimeCropSliderSeekBar timeCropSliderSeekBar3 = this.f316744g;
        if (timeCropSliderSeekBar3 != null) {
            timeCropSliderSeekBar3.setOnSliderTouchListener(bVar);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Log.m105924i(this.f316741d, "onLayout");
        TimeCropSliderSeekBar timeCropSliderSeekBar = this.f316744g;
        int i5 = 0;
        if (timeCropSliderSeekBar != null) {
            RecyclerView recyclerView = this.f316742e;
            timeCropSliderSeekBar.setContentTop(recyclerView != null ? recyclerView.getTop() : 0);
        }
        TimeCropSliderSeekBar timeCropSliderSeekBar2 = this.f316744g;
        if (timeCropSliderSeekBar2 != null) {
            RecyclerView recyclerView2 = this.f316742e;
            if (recyclerView2 != null) {
                i5 = recyclerView2.getMeasuredHeight();
            }
            timeCropSliderSeekBar2.setContentHeight(i5);
        }
    }

    public final void setCallback(C106240a aVar) {
        this.f316758x = aVar;
    }

    public final void setCutCnt(int i) {
        this.f316756v = i;
    }

    public final void setDragCnt(int i) {
        this.f316755u = i;
    }

    public final void setEnableLengthEdit(boolean z) {
        if (z) {
            TimeCropSliderSeekBar timeCropSliderSeekBar = this.f316744g;
            if (timeCropSliderSeekBar != null) {
                timeCropSliderSeekBar.f316712f = false;
                return;
            }
            return;
        }
        TimeCropSliderSeekBar timeCropSliderSeekBar2 = this.f316744g;
        if (timeCropSliderSeekBar2 != null) {
            timeCropSliderSeekBar2.f316712f = true;
        }
    }

    public final void setProgress(long j) {
        float f = ((float) this.f316752r) / this.f316751q;
        TimeCropSliderSeekBar timeCropSliderSeekBar = this.f316744g;
        if (timeCropSliderSeekBar != null) {
            timeCropSliderSeekBar.setCursorPos(((float) (j + getScrollTime())) / (((float) this.f316748n) + (f * ((float) 2))));
        }
    }

    public final void setRealTimeCallback(C106240a aVar) {
        this.f316759y = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeCropViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
