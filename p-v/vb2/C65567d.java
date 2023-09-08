package vb2;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvFrameListView;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import rb2.C63380a;
import rx3.C13598b0;
import sp3.C36777d;
import u23.C65003a;
import wx3.C15601d;

/* renamed from: vb2.d */
public final class C65567d extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final C65568a f188663d;

    /* renamed from: e */
    public final C65570c f188664e;

    /* renamed from: f */
    public C32226l<? super Long, C13598b0> f188665f;

    /* renamed from: vb2.d$a */
    public interface C65568a {
        /* renamed from: a */
        void mo80675a(int i, long j);

        /* renamed from: b */
        void mo80676b(int i, long j, long j2);

        /* renamed from: c */
        void mo80677c(int i, long j);

        /* renamed from: d */
        void mo80678d(int i);

        /* renamed from: e */
        void mo80679e(int i, long j, long j2);
    }

    /* renamed from: vb2.d$b */
    public static final class C65569b extends RecyclerView.C16631z {

        /* renamed from: z */
        public final ViewGroup f188666z;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C65569b(android.view.ViewGroup r3) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r3, r0)
                android.view.View r0 = new android.view.View
                android.content.Context r1 = r3.getContext()
                r0.<init>(r1)
                r2.<init>(r0)
                r2.f188666z = r3
                android.content.Context r3 = r0.getContext()
                java.lang.Object r1 = p385u2.C111105a.f332697a
                r1 = 2131234200(0x7f080d98, float:1.808456E38)
                android.graphics.drawable.Drawable r3 = p385u2.C111105a.C111110c.m151511b(r3, r1)
                gy3.C87412m.m108591d(r3)
                r0.setBackground(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vb2.C65567d.C65569b.<init>(android.view.ViewGroup):void");
        }
    }

    /* renamed from: vb2.d$c */
    public interface C65570c {
        int getDraggingIndex();

        int getFillingWidth();

        int getSelectedIndex();

        int getSpaceSize();

        C63380a getThumbLoader();

        List<C65003a> getTracks();

        float getWidthPerMills();
    }

    /* renamed from: vb2.d$d */
    public static final class C65571d extends RecyclerView.C16631z {

        /* renamed from: z */
        public final ViewGroup f188667z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65571d(ViewGroup viewGroup) {
            super(new View(viewGroup.getContext()));
            C87412m.m108594g(viewGroup, "parent");
            this.f188667z = viewGroup;
        }
    }

    /* renamed from: vb2.d$e */
    public final class C65572e extends RecyclerView.C16631z {

        /* renamed from: A */
        public final RangeSliderView f188668A;

        /* renamed from: B */
        public final View f188669B;

        /* renamed from: C */
        public final /* synthetic */ C65567d f188670C;

        /* renamed from: z */
        public final MvFrameListView f188671z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65572e(C65567d dVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f188670C = dVar;
            View findViewById = view.findViewById(C0966R.C0970id.eet);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.frame_list)");
            this.f188671z = (MvFrameListView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.jmz);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.slider_layout)");
            this.f188668A = (RangeSliderView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f357552ag0);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.border)");
            this.f188669B = findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.bzd);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.debug)");
            TextView textView = (TextView) findViewById4;
        }

        /* renamed from: y */
        public final int mo89649y() {
            C65567d dVar = this.f188670C;
            int j = mo17363j();
            dVar.getClass();
            return j - 1;
        }
    }

    public C65567d(C65568a aVar, C65570c cVar) {
        C87412m.m108594g(aVar, "callback");
        C87412m.m108594g(cVar, "provider");
        this.f188663d = aVar;
        this.f188664e = cVar;
    }

    public int getItemCount() {
        return this.f188664e.getTracks().size() + 3;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == this.f188664e.getTracks().size() + 1) {
            return 4;
        }
        return i == this.f188664e.getTracks().size() + 2 ? 3 : 2;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        RecyclerView.C16631z zVar2 = zVar;
        C87412m.m108594g(zVar2, "holder");
        int i2 = 0;
        if (zVar2 instanceof C65572e) {
            C65572e eVar = (C65572e) zVar2;
            C65003a aVar = this.f188664e.getTracks().get(i - 1);
            C87412m.m108594g(aVar, "trackInfo");
            int y = eVar.mo89649y();
            eVar.f44854d.setOnClickListener(new C65573e(aVar, eVar.f188670C, y, eVar));
            C63380a thumbLoader = eVar.f188670C.f188664e.getThumbLoader();
            boolean z = true;
            if (thumbLoader != null) {
                MvFrameListView mvFrameListView = eVar.f188671z;
                mvFrameListView.getClass();
                mvFrameListView.f163690e = aVar;
                mvFrameListView.f163691f = thumbLoader;
                Rect rect = mvFrameListView.f163693h;
                int i3 = aVar.f187121a;
                rect.right = i3;
                rect.bottom = aVar.f187122b;
                float d = (((float) i3) * aVar.f187126f) / ((float) aVar.mo88221d());
                mvFrameListView.setDrawStart((int) (((float) aVar.f187124d) * d));
                mvFrameListView.setDrawEnd((int) (d * ((float) aVar.f187125e)));
                C53973z1 z1Var = mvFrameListView.f163692g;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                C0001s1 s1Var = C0001s1.f0d;
                C53896h0 h0Var = C53872d1.f151117a;
                mvFrameListView.f163692g = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C65562a(thumbLoader, aVar, mvFrameListView, (C15601d<? super C65562a>) null), 2, (Object) null);
            }
            boolean z2 = eVar.mo89649y() == eVar.f188670C.f188664e.getTracks().size() - 1;
            C8478d0 d0Var = new C8478d0();
            if (!z2 || eVar.f188670C.f188664e.getFillingWidth() > 0) {
                d0Var.f27483d += eVar.f188670C.f188664e.getSpaceSize();
            }
            eVar.f188668A.setActive(y == eVar.f188670C.f188664e.getSelectedIndex());
            eVar.f188668A.setMaxEnd(((int) (((float) aVar.mo88221d()) * eVar.f188670C.f188664e.getWidthPerMills())) - d0Var.f27483d);
            eVar.f188668A.setMinWidth(((int) (((float) 2000) * eVar.f188670C.f188664e.getWidthPerMills())) - d0Var.f27483d);
            eVar.f188668A.setStart((int) (((float) aVar.f187124d) * eVar.f188670C.f188664e.getWidthPerMills()));
            if (eVar.f188670C.f188664e.getDraggingIndex() != -1) {
                eVar.f188668A.setEnd(aVar.f187121a);
            } else {
                eVar.f188668A.setEnd(((int) (((float) aVar.f187125e) * eVar.f188670C.f188664e.getWidthPerMills())) - d0Var.f27483d);
            }
            RangeSliderView rangeSliderView = eVar.f188668A;
            if (y != 0) {
                z = false;
            }
            rangeSliderView.setKeepSizeOnStartChanged(z);
            eVar.f188668A.setCallback(new C65575f(eVar.f188670C, y, d0Var, eVar));
            if (y == eVar.f188670C.f188664e.getDraggingIndex()) {
                View view = eVar.f188669B;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = eVar.f188669B;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Log.m105924i("MicroMsg.MvTracksAdapter", "bind[" + eVar.mo89649y() + "]: time=" + aVar.f187130j + ", duration=" + (aVar.f187125e - aVar.f187124d) + ", width=" + (eVar.f188668A.getEnd() - eVar.f188668A.getStart()) + ", clipWidth=" + d0Var.f27483d);
            eVar.f44854d.requestLayout();
        } else if (zVar2 instanceof C65569b) {
            C65569b bVar = (C65569b) zVar2;
            if (this.f188664e.getDraggingIndex() == -1) {
                i2 = this.f188664e.getFillingWidth();
            }
            Log.m105924i("MicroMsg.MvTracksAdapter", "filling " + i2);
            bVar.f44854d.setLayoutParams(new ViewGroup.LayoutParams(i2, (bVar.f188666z.getHeight() - bVar.f188666z.getPaddingTop()) - bVar.f188666z.getPaddingBottom()));
        } else if (zVar2 instanceof C65571d) {
            C65571d dVar = (C65571d) zVar2;
            dVar.f44854d.setLayoutParams(new ViewGroup.LayoutParams(dVar.f188667z.getWidth() / 2, (dVar.f188667z.getHeight() - dVar.f188667z.getPaddingTop()) - dVar.f188667z.getPaddingBottom()));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1 || i == 3) {
            return new C65571d(viewGroup);
        }
        if (i == 4) {
            return new C65569b(viewGroup);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359907bj2, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C65572e(this, inflate);
    }

    public void onViewRecycled(RecyclerView.C16631z zVar) {
        C63380a aVar;
        C87412m.m108594g(zVar, "holder");
        super.onViewRecycled(zVar);
        if (zVar instanceof C65572e) {
            MvFrameListView mvFrameListView = ((C65572e) zVar).f188671z;
            C65003a aVar2 = mvFrameListView.f163690e;
            Log.m105924i("MicroMsg.MvFrameListView", aVar2 + " stop");
            if (!(aVar2 == null || (aVar = mvFrameListView.f163691f) == null)) {
                Log.m105924i("MicroMsg.ThumbCachedLoader", "stop " + aVar2);
                C63380a.C63381a a = aVar.mo88287a(aVar2);
                a.f179785b.clear();
                a.f179786c.clear();
                C53973z1 z1Var = a.f179789f;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                a.f179789f = null;
                C36777d dVar = a.f179784a;
                if (dVar != null) {
                    dVar.destroy();
                }
                a.f179784a = null;
            }
            C53973z1 z1Var2 = mvFrameListView.f163692g;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            mvFrameListView.f163692g = null;
        }
    }
}
