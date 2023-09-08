package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.C105485i;
import com.tencent.p014mm.plugin.mmsight.segment.SliderSeekBar;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.CMTimeRange;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import sp3.C110801c;
import sp3.C110807k;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import u23.C111119f;
import u23.C111125j;
import u23.C111127k;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B!\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b.\u0010/B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/TrackCropView;", "Landroid/widget/FrameLayout;", "", "", "getScrollTime", "", "enable", "Lrx3/b0;", "setEnableLengthEdit", "Lsp3/k;", "composition", "setTrack", "timeMs", "setProgress", "Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "<set-?>", "h", "Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "getSeekSlider", "()Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "seekSlider", "", "w", "I", "getDragCnt", "()I", "setDragCnt", "(I)V", "dragCnt", "x", "getCutCnt", "setCutCnt", "cutCnt", "Lcom/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$a;", "A", "Lcom/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$a;", "getCallback", "()Lcom/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$a;", "setCallback", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$a;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView */
public final class TrackCropView extends FrameLayout implements C111847h {

    /* renamed from: A */
    public C106280a f316919A;

    /* renamed from: d */
    public final String f316920d;

    /* renamed from: e */
    public RecyclerView f316921e;

    /* renamed from: f */
    public LinearLayoutManager f316922f;

    /* renamed from: g */
    public C111119f f316923g;

    /* renamed from: h */
    public SliderSeekBar f316924h;

    /* renamed from: i */
    public int f316925i;

    /* renamed from: j */
    public int f316926j;

    /* renamed from: n */
    public long f316927n;

    /* renamed from: o */
    public long f316928o;

    /* renamed from: p */
    public long f316929p;

    /* renamed from: q */
    public long f316930q;

    /* renamed from: r */
    public float f316931r;

    /* renamed from: s */
    public int f316932s;

    /* renamed from: t */
    public int f316933t;

    /* renamed from: u */
    public final C111127k f316934u;

    /* renamed from: v */
    public final C111127k f316935v;

    /* renamed from: w */
    public int f316936w;

    /* renamed from: x */
    public int f316937x;

    /* renamed from: y */
    public Runnable f316938y;

    /* renamed from: z */
    public boolean f316939z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView$a */
    public interface C106280a {
        /* renamed from: b */
        void mo152361b(long j, long j2);

        /* renamed from: c */
        void mo152362c(long j, long j2);

        void pause();

        void seekTo(long j);
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView$b */
    public static final class C106281b extends RecyclerView.C0130p {

        /* renamed from: d */
        public boolean f316940d;

        /* renamed from: e */
        public final /* synthetic */ TrackCropView f316941e;

        public C106281b(TrackCropView trackCropView) {
            this.f316941e = trackCropView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            String str = this.f316941e.f316920d;
            Log.m105924i(str, "onScrollStateChanged: " + i);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                TrackCropView.m143017a(this.f316941e);
                String str2 = this.f316941e.f316920d;
                Log.m105924i(str2, "onScrollStateChanged: " + this.f316941e.f316929p + ", " + this.f316941e.f316930q);
                C106280a callback = this.f316941e.getCallback();
                if (callback != null) {
                    TrackCropView trackCropView = this.f316941e;
                    callback.mo152361b(trackCropView.f316929p, trackCropView.f316930q);
                }
                this.f316941e.getClass();
                this.f316940d = false;
            } else if (i == 1) {
                if (!this.f316940d) {
                    TrackCropView trackCropView2 = this.f316941e;
                    trackCropView2.setDragCnt(trackCropView2.getDragCnt() + 1);
                }
                this.f316940d = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            TrackCropView.m143017a(this.f316941e);
            String str = this.f316941e.f316920d;
            Log.m105924i(str, "onScroll: range: " + this.f316941e.f316929p + ", " + this.f316941e.f316930q);
            C106280a callback = this.f316941e.getCallback();
            if (callback != null) {
                callback.seekTo(this.f316941e.f316929p);
            }
            TrackCropView trackCropView = this.f316941e;
            trackCropView.setProgress(trackCropView.f316929p);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView$c */
    public static final class C106282c extends RecyclerView.C0131u {

        /* renamed from: d */
        public final /* synthetic */ TrackCropView f316942d;

        public C106282c(TrackCropView trackCropView) {
            this.f316942d = trackCropView;
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            int action = motionEvent.getAction();
            if (action == 0) {
                C106280a callback = this.f316942d.getCallback();
                if (callback == null) {
                    return false;
                }
                callback.pause();
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                RecyclerView recyclerView2 = this.f316942d.f316921e;
                if (recyclerView2 == null) {
                    C87412m.m108603p("recyclerView");
                    throw null;
                } else if (recyclerView2.getScrollState() == 0) {
                    TrackCropView.m143017a(this.f316942d);
                    String str = this.f316942d.f316920d;
                    Log.m105924i(str, "onInterceptTouchEvent crop: " + this.f316942d.f316929p + ", " + this.f316942d.f316930q);
                    C106280a callback2 = this.f316942d.getCallback();
                    if (callback2 != null) {
                        TrackCropView trackCropView = this.f316942d;
                        callback2.mo152361b(trackCropView.f316929p, trackCropView.f316930q);
                    }
                    this.f316942d.getClass();
                    return false;
                } else {
                    this.f316942d.getClass();
                    return false;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView$d */
    public static final class C106283d implements SliderSeekBar.C105469b {

        /* renamed from: a */
        public final /* synthetic */ TrackCropView f316943a;

        public C106283d(TrackCropView trackCropView) {
            this.f316943a = trackCropView;
        }

        /* renamed from: a */
        public void mo150247a(boolean z) {
            C106280a callback = this.f316943a.getCallback();
            if (callback != null) {
                callback.pause();
            }
        }

        /* renamed from: b */
        public void mo150248b(boolean z) {
            TrackCropView trackCropView = this.f316943a;
            trackCropView.setCutCnt(trackCropView.getCutCnt() + 1);
            TrackCropView.m143017a(this.f316943a);
            String str = this.f316943a.f316920d;
            Log.m105924i(str, "onScrollStateChanged: " + this.f316943a.f316929p + ", " + this.f316943a.f316930q);
            C106280a callback = this.f316943a.getCallback();
            if (callback != null) {
                TrackCropView trackCropView2 = this.f316943a;
                callback.mo152361b(trackCropView2.f316929p, trackCropView2.f316930q);
            }
        }

        /* renamed from: c */
        public void mo150249c(boolean z) {
            TrackCropView.m143017a(this.f316943a);
            String str = this.f316943a.f316920d;
            Log.m105924i(str, "onMove: " + z + ", " + this.f316943a.f316929p + ", " + this.f316943a.f316930q);
            C106280a callback = this.f316943a.getCallback();
            if (callback != null) {
                TrackCropView trackCropView = this.f316943a;
                callback.mo152362c(trackCropView.f316929p, trackCropView.f316930q);
            }
            if (z) {
                C106280a callback2 = this.f316943a.getCallback();
                if (callback2 != null) {
                    callback2.seekTo(this.f316943a.f316929p);
                }
                TrackCropView trackCropView2 = this.f316943a;
                trackCropView2.setProgress(trackCropView2.f316929p);
                return;
            }
            C106280a callback3 = this.f316943a.getCallback();
            if (callback3 != null) {
                callback3.seekTo(this.f316943a.f316930q);
            }
            TrackCropView trackCropView3 = this.f316943a;
            trackCropView3.setProgress(trackCropView3.f316930q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView$e */
    public static final class C106284e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TrackCropView f316944d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<C111127k> f316945e;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView$e$a */
        public static final class C106285a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TrackCropView f316946d;

            /* renamed from: e */
            public final /* synthetic */ int f316947e;

            public C106285a(TrackCropView trackCropView, int i) {
                this.f316946d = trackCropView;
                this.f316947e = i;
            }

            public final void run() {
                SliderSeekBar seekSlider = this.f316946d.getSeekSlider();
                if (seekSlider != null) {
                    TrackCropView trackCropView = this.f316946d;
                    seekSlider.mo150254e(true, (((float) trackCropView.f316932s) + (((float) trackCropView.f316929p) * trackCropView.f316931r)) - ((float) this.f316947e));
                }
                SliderSeekBar seekSlider2 = this.f316946d.getSeekSlider();
                if (seekSlider2 != null) {
                    TrackCropView trackCropView2 = this.f316946d;
                    seekSlider2.mo150254e(false, (((float) trackCropView2.f316932s) + (((float) trackCropView2.f316930q) * trackCropView2.f316931r)) - ((float) this.f316947e));
                }
                this.f316946d.f316939z = true;
            }
        }

        public C106284e(TrackCropView trackCropView, LinkedList<C111127k> linkedList, long j) {
            this.f316944d = trackCropView;
            this.f316945e = linkedList;
        }

        public final void run() {
            RecyclerView recyclerView = this.f316944d.f316921e;
            if (recyclerView == null) {
                C87412m.m108603p("recyclerView");
                throw null;
            } else if (recyclerView.getWidth() <= 0) {
                TrackCropView trackCropView = this.f316944d;
                RecyclerView recyclerView2 = trackCropView.f316921e;
                if (recyclerView2 != null) {
                    recyclerView2.post(trackCropView.f316938y);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                TrackCropView trackCropView2 = this.f316944d;
                trackCropView2.f316932s = C76577a.m92151b(trackCropView2.getContext(), 40);
                RecyclerView recyclerView3 = this.f316944d.f316921e;
                if (recyclerView3 != null) {
                    TrackCropView trackCropView3 = this.f316944d;
                    float height = (((float) recyclerView3.getHeight()) * 1.0f) / ((float) trackCropView3.f316925i);
                    RecyclerView recyclerView4 = trackCropView3.f316921e;
                    if (recyclerView4 != null) {
                        int width = recyclerView4.getWidth();
                        TrackCropView trackCropView4 = this.f316944d;
                        trackCropView3.f316933t = width - (trackCropView4.f316932s * 2);
                        float f = (((float) trackCropView4.f316933t) * 1.0f) / ((float) trackCropView4.f316928o);
                        trackCropView4.f316931r = f;
                        trackCropView4.getClass();
                        float f2 = ((float) ((int) (f * ((float) trackCropView4.f316927n)))) / (((float) trackCropView4.f316926j) * height);
                        for (C111127k kVar : this.f316945e) {
                            kVar.f187126f = ((f2 / ((float) trackCropView4.f316927n)) * ((float) (kVar.f187125e - kVar.f187124d))) / kVar.f332732n.f316501l.f331468f;
                            kVar.mo89218f();
                            String str = trackCropView4.f316920d;
                            Log.m105918d(str, "build thumbInfo index:" + kVar.f187129i + ", frameCount:" + kVar.f187126f + ", frameDuration:" + (kVar.f187125e - kVar.f187124d) + ", frameWidth:" + (((float) (kVar.f187125e - kVar.f187124d)) * trackCropView4.f316931r));
                        }
                        TrackCropView trackCropView5 = this.f316944d;
                        C111127k kVar2 = trackCropView5.f316934u;
                        int i = trackCropView5.f316932s;
                        kVar2.f187123c = i;
                        trackCropView5.f316935v.f187123c = i;
                        float f3 = trackCropView5.f316931r;
                        int max = Math.max(0, Math.min((int) (((float) trackCropView5.f316929p) * f3), (int) ((((float) trackCropView5.f316930q) * f3) - ((float) trackCropView5.f316933t))));
                        LinearLayoutManager linearLayoutManager = this.f316944d.f316922f;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(-max));
                        aVar.mo10233c(0);
                        C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                        C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        this.f316945e.add(0, this.f316944d.f316934u);
                        this.f316945e.add(this.f316944d.f316935v);
                        this.f316944d.f316923g.mo162859O4(this.f316945e);
                        this.f316944d.f316923g.notifyDataSetChanged();
                        SliderSeekBar seekSlider = this.f316944d.getSeekSlider();
                        if (seekSlider != null) {
                            RecyclerView recyclerView5 = this.f316944d.f316921e;
                            if (recyclerView5 != null) {
                                int width2 = recyclerView5.getWidth();
                                TrackCropView trackCropView6 = this.f316944d;
                                int i2 = trackCropView6.f316932s;
                                seekSlider.post(new C105485i(seekSlider, width2 - (i2 * 2), i2, (int) (((float) 1000) * trackCropView6.f316931r)));
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        }
                        SliderSeekBar seekSlider2 = this.f316944d.getSeekSlider();
                        if (seekSlider2 != null) {
                            seekSlider2.setCursorPos(0.0f);
                        }
                        SliderSeekBar seekSlider3 = this.f316944d.getSeekSlider();
                        if (seekSlider3 != null) {
                            seekSlider3.post(new C106285a(this.f316944d, max));
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316920d = "MicroMsg.TrackCropView";
        this.f316922f = new LinearLayoutManager(context, 0, false);
        this.f316923g = new C111119f();
        this.f316925i = 112;
        this.f316926j = 63;
        this.f316930q = 1;
        this.f316931r = 1.0f;
        C111127k.C111128a aVar = C111127k.f332730o;
        this.f316934u = aVar.mo162866a(0);
        this.f316935v = aVar.mo162866a(0);
    }

    /* renamed from: a */
    public static final void m143017a(TrackCropView trackCropView) {
        long j;
        SliderSeekBar sliderSeekBar;
        RecyclerView recyclerView = trackCropView.f316921e;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            int i = 0;
            View view = null;
            while (true) {
                if (i >= childCount) {
                    j = 0;
                    break;
                }
                RecyclerView recyclerView2 = trackCropView.f316921e;
                if (recyclerView2 != null) {
                    View childAt = recyclerView2.getChildAt(i);
                    if (childAt instanceof FrameListView) {
                        RecyclerView recyclerView3 = trackCropView.f316921e;
                        if (recyclerView3 != null) {
                            int N0 = recyclerView3.mo17029N0(childAt);
                            if (N0 >= 0 && N0 < trackCropView.f316923g.getItemCount()) {
                                j = trackCropView.f316923g.mo162857F4(N0).mo88220c();
                                view = childAt;
                                break;
                            }
                            view = childAt;
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                    i++;
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            if (view == null || (sliderSeekBar = trackCropView.f316924h) == null) {
                trackCropView.f316929p = 0;
                trackCropView.f316930q = trackCropView.f316927n;
            } else if (trackCropView.f316939z) {
                float f = (float) j;
                long leftSliderBound = (long) ((((float) (sliderSeekBar.getLeftSliderBound() - view.getLeft())) / trackCropView.f316931r) + f);
                trackCropView.f316929p = leftSliderBound;
                if (leftSliderBound < 0) {
                    trackCropView.f316929p = 0;
                }
                SliderSeekBar sliderSeekBar2 = trackCropView.f316924h;
                C87412m.m108591d(sliderSeekBar2);
                long rightSliderBound = (long) ((((float) (sliderSeekBar2.getRightSliderBound() - view.getLeft())) / trackCropView.f316931r) + f);
                trackCropView.f316930q = rightSliderBound;
                long j2 = trackCropView.f316927n;
                if (rightSliderBound > j2) {
                    trackCropView.f316930q = j2;
                }
            }
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: b */
    public static void m143018b(TrackCropView trackCropView, C96552p0 p0Var, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = -1;
        }
        if ((i & 4) != 0) {
            j2 = -1;
        }
        trackCropView.getClass();
        C87412m.m108594g(p0Var, "composition");
        trackCropView.f316936w = 0;
        trackCropView.f316937x = 0;
        LinkedList linkedList = new LinkedList();
        trackCropView.f316927n = p0Var.mo134616m();
        CMTimeRange k = p0Var.mo134614k();
        long j3 = trackCropView.f316927n;
        if (j3 > 60000) {
            j3 = 60000;
        }
        trackCropView.f316928o = j3;
        trackCropView.f316929p = j;
        trackCropView.f316930q = j2;
        if (j < 0 || j2 < 0) {
            long j4 = (long) 1000;
            trackCropView.f316929p = k.getStartUs() / j4;
            trackCropView.f316930q = k.getEndUs() / j4;
        }
        List<C106205q0> o = p0Var.mo134618o();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(o, 10));
        Iterator it = ((ArrayList) o).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C111127k kVar = new C111127k((C106205q0) next);
                kVar.f187129i = i2;
                kVar.f187122b = trackCropView.f316925i;
                kVar.f187121a = trackCropView.f316926j;
                arrayList.add(kVar);
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        linkedList.addAll(arrayList);
        trackCropView.f316939z = false;
        C111125j jVar = new C111125j(trackCropView, linkedList, 3000);
        trackCropView.f316938y = jVar;
        jVar.run();
    }

    private final long getScrollTime() {
        long j;
        RecyclerView recyclerView = this.f316921e;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            int i = 0;
            View view = null;
            while (true) {
                if (i >= childCount) {
                    j = 0;
                    break;
                }
                RecyclerView recyclerView2 = this.f316921e;
                if (recyclerView2 != null) {
                    View childAt = recyclerView2.getChildAt(i);
                    if (childAt instanceof FrameListView) {
                        RecyclerView recyclerView3 = this.f316921e;
                        if (recyclerView3 != null) {
                            int N0 = recyclerView3.mo17029N0(childAt);
                            if (N0 >= 0 && N0 < this.f316923g.getItemCount()) {
                                j = this.f316923g.mo162857F4(N0).mo88220c();
                                view = childAt;
                                break;
                            }
                            view = childAt;
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                    i++;
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            if (view == null) {
                return 0;
            }
            return (long) ((((float) (-view.getLeft())) / this.f316931r) + ((float) j));
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public final C106280a getCallback() {
        return this.f316919A;
    }

    public final int getCutCnt() {
        return this.f316937x;
    }

    public final int getDragCnt() {
        return this.f316936w;
    }

    public final SliderSeekBar getSeekSlider() {
        return this.f316924h;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.kt8);
        C87412m.m108593f(findViewById, "findViewById(R.id.track_crop_thumb_recycler)");
        this.f316921e = (RecyclerView) findViewById;
        SliderSeekBar sliderSeekBar = (SliderSeekBar) findViewById(C0966R.C0970id.kt7);
        this.f316924h = sliderSeekBar;
        if (sliderSeekBar != null) {
            sliderSeekBar.setMaskColor(1999383596);
        }
        SliderSeekBar sliderSeekBar2 = this.f316924h;
        if (sliderSeekBar2 != null) {
            sliderSeekBar2.setEnableHapticAtEdge(true);
        }
        RecyclerView recyclerView = this.f316921e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.f316922f);
            RecyclerView recyclerView2 = this.f316921e;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f316923g);
                RecyclerView recyclerView3 = this.f316921e;
                if (recyclerView3 != null) {
                    recyclerView3.setItemAnimator((RecyclerView.C16616j) null);
                    RecyclerView recyclerView4 = this.f316921e;
                    if (recyclerView4 != null) {
                        recyclerView4.mo17043c(new C106281b(this));
                        RecyclerView recyclerView5 = this.f316921e;
                        if (recyclerView5 != null) {
                            recyclerView5.mo17092j0(new C106282c(this));
                            C106283d dVar = new C106283d(this);
                            SliderSeekBar sliderSeekBar3 = this.f316924h;
                            if (sliderSeekBar3 != null) {
                                sliderSeekBar3.setOnSliderTouchListener(dVar);
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public final void setCallback(C106280a aVar) {
        this.f316919A = aVar;
    }

    public final void setCutCnt(int i) {
        this.f316937x = i;
    }

    public final void setDragCnt(int i) {
        this.f316936w = i;
    }

    public final void setEnableLengthEdit(boolean z) {
        if (z) {
            SliderSeekBar sliderSeekBar = this.f316924h;
            if (sliderSeekBar != null) {
                sliderSeekBar.f313629f = false;
                return;
            }
            return;
        }
        SliderSeekBar sliderSeekBar2 = this.f316924h;
        if (sliderSeekBar2 != null) {
            sliderSeekBar2.f313629f = true;
        }
    }

    public final void setProgress(long j) {
        float f = ((float) this.f316932s) / this.f316931r;
        SliderSeekBar sliderSeekBar = this.f316924h;
        if (sliderSeekBar != null) {
            sliderSeekBar.setCursorPos(((float) (j - getScrollTime())) / (((float) this.f316928o) + (f * ((float) 2))));
        }
    }

    public final void setTrack(C110807k kVar) {
        C87412m.m108594g(kVar, "composition");
        this.f316936w = 0;
        this.f316937x = 0;
        LinkedList linkedList = new LinkedList();
        long j = ((C110801c) C110818d0.m150914L(kVar.f331511l)).f331466d;
        long l = (kVar.mo162389l() - 0) + j;
        long l2 = (kVar.mo162389l() - 0) + j + (((C110801c) C110818d0.m150923U(kVar.f331511l)).f331470h - ((C110801c) C110818d0.m150923U(kVar.f331511l)).f331467e);
        this.f316927n = l2;
        if (l2 > 60000) {
            l2 = 60000;
        }
        this.f316928o = l2;
        this.f316929p = j;
        this.f316930q = l;
        ArrayList<C110801c> arrayList = kVar.f331511l;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator<C110801c> it = arrayList.iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                C110801c next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C110801c cVar = next;
                    boolean z2 = i == 0;
                    if (i != kVar.f331511l.size() - 1) {
                        z = false;
                    }
                    C111127k kVar2 = new C111127k(cVar, z2, z);
                    kVar2.f187129i = i;
                    kVar2.f187122b = this.f316925i;
                    kVar2.f187121a = this.f316926j;
                    arrayList2.add(kVar2);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            } else {
                linkedList.addAll(arrayList2);
                if (linkedList.size() == 1) {
                    int i3 = ((C111127k) linkedList.get(0)).f332732n.f316491b;
                }
                this.f316939z = false;
                C106284e eVar = new C106284e(this, linkedList, 1000);
                this.f316938y = eVar;
                eVar.run();
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrackCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
