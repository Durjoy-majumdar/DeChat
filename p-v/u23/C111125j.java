package u23;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.mmsight.segment.C105485i;
import com.tencent.p014mm.plugin.mmsight.segment.SliderSeekBar;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.TrackCropView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: u23.j */
public final class C111125j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TrackCropView f332726d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C111127k> f332727e;

    /* renamed from: u23.j$a */
    public static final class C111126a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TrackCropView f332728d;

        /* renamed from: e */
        public final /* synthetic */ int f332729e;

        public C111126a(TrackCropView trackCropView, int i) {
            this.f332728d = trackCropView;
            this.f332729e = i;
        }

        public final void run() {
            SliderSeekBar seekSlider = this.f332728d.getSeekSlider();
            if (seekSlider != null) {
                TrackCropView trackCropView = this.f332728d;
                seekSlider.mo150254e(true, (((float) trackCropView.f316932s) + (((float) trackCropView.f316929p) * trackCropView.f316931r)) - ((float) this.f332729e));
            }
            SliderSeekBar seekSlider2 = this.f332728d.getSeekSlider();
            if (seekSlider2 != null) {
                TrackCropView trackCropView2 = this.f332728d;
                seekSlider2.mo150254e(false, (((float) trackCropView2.f316932s) + (((float) trackCropView2.f316930q) * trackCropView2.f316931r)) - ((float) this.f332729e));
            }
            this.f332728d.f316939z = true;
        }
    }

    public C111125j(TrackCropView trackCropView, LinkedList<C111127k> linkedList, long j) {
        this.f332726d = trackCropView;
        this.f332727e = linkedList;
    }

    public final void run() {
        RecyclerView recyclerView = this.f332726d.f316921e;
        if (recyclerView == null) {
            C87412m.m108603p("recyclerView");
            throw null;
        } else if (recyclerView.getWidth() <= 0) {
            TrackCropView trackCropView = this.f332726d;
            RecyclerView recyclerView2 = trackCropView.f316921e;
            if (recyclerView2 != null) {
                recyclerView2.post(trackCropView.f316938y);
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            TrackCropView trackCropView2 = this.f332726d;
            trackCropView2.f316932s = C76577a.m92151b(trackCropView2.getContext(), 40);
            RecyclerView recyclerView3 = this.f332726d.f316921e;
            if (recyclerView3 != null) {
                TrackCropView trackCropView3 = this.f332726d;
                float height = (((float) recyclerView3.getHeight()) * 1.0f) / ((float) trackCropView3.f316925i);
                RecyclerView recyclerView4 = trackCropView3.f316921e;
                if (recyclerView4 != null) {
                    int width = recyclerView4.getWidth();
                    TrackCropView trackCropView4 = this.f332726d;
                    trackCropView3.f316933t = width - (trackCropView4.f316932s * 2);
                    float f = (((float) trackCropView4.f316933t) * 1.0f) / ((float) trackCropView4.f316928o);
                    trackCropView4.f316931r = f;
                    trackCropView4.getClass();
                    float f2 = ((float) ((int) (f * ((float) trackCropView4.f316927n)))) / (((float) trackCropView4.f316926j) * height);
                    for (C111127k kVar : this.f332727e) {
                        kVar.f187126f = ((f2 / ((float) trackCropView4.f316927n)) * ((float) (kVar.f187125e - kVar.f187124d))) / kVar.f332732n.f316501l.f331468f;
                        kVar.mo89218f();
                        String str = trackCropView4.f316920d;
                        Log.m105918d(str, "build thumbInfo index:" + kVar.f187129i + ", frameCount:" + kVar.f187126f + ", frameDuration:" + (kVar.f187125e - kVar.f187124d) + ", frameWidth:" + (((float) (kVar.f187125e - kVar.f187124d)) * trackCropView4.f316931r));
                    }
                    TrackCropView trackCropView5 = this.f332726d;
                    C111127k kVar2 = trackCropView5.f316934u;
                    int i = trackCropView5.f316932s;
                    kVar2.f187123c = i;
                    trackCropView5.f316935v.f187123c = i;
                    float f3 = trackCropView5.f316931r;
                    int max = Math.max(0, Math.min((int) (((float) trackCropView5.f316929p) * f3), (int) ((((float) trackCropView5.f316930q) * f3) - ((float) trackCropView5.f316933t))));
                    LinearLayoutManager linearLayoutManager = this.f332726d.f316922f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(-max));
                    aVar.mo10233c(0);
                    C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    this.f332727e.add(0, this.f332726d.f316934u);
                    this.f332727e.add(this.f332726d.f316935v);
                    this.f332726d.f316923g.mo162859O4(this.f332727e);
                    this.f332726d.f316923g.notifyDataSetChanged();
                    SliderSeekBar seekSlider = this.f332726d.getSeekSlider();
                    if (seekSlider != null) {
                        RecyclerView recyclerView5 = this.f332726d.f316921e;
                        if (recyclerView5 != null) {
                            int width2 = recyclerView5.getWidth();
                            TrackCropView trackCropView6 = this.f332726d;
                            int i2 = trackCropView6.f316932s;
                            seekSlider.post(new C105485i(seekSlider, width2 - (i2 * 2), i2, (int) (((float) 3000) * trackCropView6.f316931r)));
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                    SliderSeekBar seekSlider2 = this.f332726d.getSeekSlider();
                    if (seekSlider2 != null) {
                        seekSlider2.setCursorPos(0.0f);
                    }
                    SliderSeekBar seekSlider3 = this.f332726d.getSeekSlider();
                    if (seekSlider3 != null) {
                        seekSlider3.post(new C111126a(this.f332726d, max));
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
