package u23;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.EditSliderSeekBar;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.EditFrameListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import sp3.C36777d;
import sx3.C110818d0;

/* renamed from: u23.c */
public final class C111113c extends RecyclerView.C16613e<C111114a> {

    /* renamed from: d */
    public final String f332700d = "MicroMsg.EditFrameListAdapter";

    /* renamed from: e */
    public final LinkedList<C111127k> f332701e = new LinkedList<>();

    /* renamed from: f */
    public int f332702f = -1;

    /* renamed from: g */
    public C111118d f332703g;

    /* renamed from: u23.c$a */
    public static abstract class C111114a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111114a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: B */
        public abstract void mo162854B(C111127k kVar, boolean z);

        /* renamed from: y */
        public abstract void mo162855y(C111127k kVar);

        /* renamed from: z */
        public void mo162856z() {
        }
    }

    /* renamed from: u23.c$b */
    public final class C111115b extends C111114a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111115b(C111113c cVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            view.setOnClickListener((View.OnClickListener) null);
        }

        /* renamed from: B */
        public void mo162854B(C111127k kVar, boolean z) {
            C87412m.m108594g(kVar, "trackInfo");
        }

        /* renamed from: y */
        public void mo162855y(C111127k kVar) {
            C87412m.m108594g(kVar, "trackInfo");
            ViewGroup.LayoutParams layoutParams = this.f44854d.getLayoutParams();
            if (layoutParams == null) {
                this.f44854d.setLayoutParams(new ViewGroup.LayoutParams(kVar.f187123c, -1));
                return;
            }
            int i = layoutParams.width;
            int i2 = kVar.f187123c;
            if (i != i2) {
                layoutParams.width = i2;
                this.f44854d.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: u23.c$c */
    public final class C111116c extends C111114a {

        /* renamed from: A */
        public final int f332704A;

        /* renamed from: B */
        public final EditFrameListView f332705B;

        /* renamed from: C */
        public final EditSliderSeekBar f332706C;

        /* renamed from: D */
        public final /* synthetic */ C111113c f332707D;

        /* renamed from: z */
        public final int f332708z;

        /* renamed from: u23.c$c$a */
        public static final class C111117a implements EditSliderSeekBar.C105453b {

            /* renamed from: a */
            public final /* synthetic */ C111127k f332709a;

            /* renamed from: b */
            public final /* synthetic */ C111116c f332710b;

            /* renamed from: c */
            public final /* synthetic */ C111113c f332711c;

            public C111117a(C111127k kVar, C111116c cVar, boolean z, boolean z2, C111113c cVar2) {
                this.f332709a = kVar;
                this.f332710b = cVar;
                this.f332711c = cVar2;
            }

            /* renamed from: a */
            public void mo150216a(boolean z) {
                C111127k kVar = this.f332709a;
                kVar.f187133m = z;
                kVar.f187132l = !z;
                C111116c cVar = this.f332710b;
                cVar.f332705B.mo152307a(kVar, cVar.f332708z, true, true);
                C111116c cVar2 = this.f332710b;
                EditSliderSeekBar editSliderSeekBar = cVar2.f332706C;
                int showWidth = cVar2.f332705B.getShowWidth();
                C111116c cVar3 = this.f332710b;
                editSliderSeekBar.mo150205c(showWidth - (cVar3.f332704A * 2), cVar3.f332705B.getMinWidth(), this.f332710b.f332704A);
                if (z) {
                    C111127k kVar2 = this.f332709a;
                    int d = (int) ((((float) kVar2.f187124d) / ((float) kVar2.mo88221d())) * ((float) this.f332710b.f332705B.getTotalFrameWidth()));
                    C111116c cVar4 = this.f332710b;
                    cVar4.f332706C.mo150207e(true, (float) (cVar4.f332704A + d));
                    C111116c cVar5 = this.f332710b;
                    cVar5.f332706C.mo150207e(false, (float) (cVar5.f332704A + cVar5.f332705B.getFrameWidth()));
                } else {
                    C111127k kVar3 = this.f332709a;
                    int d2 = (int) ((((float) (kVar3.f187125e - kVar3.f187124d)) / ((float) kVar3.mo88221d())) * ((float) this.f332710b.f332705B.getTotalFrameWidth()));
                    C111116c cVar6 = this.f332710b;
                    cVar6.f332706C.mo150207e(true, (float) cVar6.f332704A);
                    C111116c cVar7 = this.f332710b;
                    cVar7.f332706C.mo150207e(false, (float) (cVar7.f332704A + d2));
                }
                EditSliderSeekBar editSliderSeekBar2 = this.f332710b.f332706C;
                ViewGroup.LayoutParams layoutParams = editSliderSeekBar2.getLayoutParams();
                layoutParams.width = this.f332710b.f332705B.getShowWidth();
                editSliderSeekBar2.setLayoutParams(layoutParams);
                View view = this.f332710b.f44854d;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = this.f332710b.f332705B.getValidWidth();
                view.setLayoutParams(layoutParams2);
                EditFrameListView editFrameListView = this.f332710b.f332705B;
                ViewGroup.LayoutParams layoutParams3 = editFrameListView.getLayoutParams();
                layoutParams3.width = this.f332710b.f332705B.getShowWidth();
                editFrameListView.setLayoutParams(layoutParams3);
                this.f332710b.f44854d.setLayoutDirection(z ? 1 : 0);
                C111127k kVar4 = this.f332709a;
                float d3 = ((float) kVar4.f187124d) / ((float) kVar4.mo88221d());
                int totalWidth = this.f332710b.f332705B.getTotalWidth();
                C111116c cVar8 = this.f332710b;
                int i = (int) (d3 * ((float) (totalWidth - (cVar8.f332704A * 2))));
                C111118d dVar = this.f332711c.f332703g;
                if (dVar != null) {
                    dVar.mo152345c(cVar8.mo17363j(), i, z);
                }
            }

            /* renamed from: b */
            public void mo150217b(boolean z) {
                C111127k kVar = this.f332709a;
                kVar.f187133m = false;
                kVar.f187132l = false;
                long leftSliderBound = z ? (long) ((((float) this.f332710b.f332706C.getLeftSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) this.f332709a.f187125e)) : kVar.f187124d + ((long) ((((float) this.f332710b.f332706C.getLeftSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) (this.f332709a.mo88221d() - this.f332709a.f187124d))));
                long rightSliderBound = z ? (long) ((((float) this.f332710b.f332706C.getRightSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) this.f332709a.f187125e)) : this.f332709a.f187124d + ((long) ((((float) this.f332710b.f332706C.getRightSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) (this.f332709a.mo88221d() - this.f332709a.f187124d))));
                C111127k kVar2 = this.f332709a;
                kVar2.f187124d = leftSliderBound;
                kVar2.f187125e = rightSliderBound;
                String str = this.f332711c.f332700d;
                Log.m105918d(str, "onUp, frameStartMs:" + leftSliderBound + ", frameEndMs:" + rightSliderBound);
                C111116c cVar = this.f332710b;
                cVar.f332705B.mo152307a(this.f332709a, cVar.f332708z, true, true);
                C111116c cVar2 = this.f332710b;
                EditSliderSeekBar editSliderSeekBar = cVar2.f332706C;
                int showWidth = cVar2.f332705B.getShowWidth();
                C111116c cVar3 = this.f332710b;
                editSliderSeekBar.mo150205c(showWidth - (cVar3.f332704A * 2), cVar3.f332705B.getMinWidth(), this.f332710b.f332704A);
                EditSliderSeekBar editSliderSeekBar2 = this.f332710b.f332706C;
                ViewGroup.LayoutParams layoutParams = editSliderSeekBar2.getLayoutParams();
                layoutParams.width = this.f332710b.f332705B.getValidWidth();
                editSliderSeekBar2.setLayoutParams(layoutParams);
                View view = this.f332710b.f44854d;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = this.f332710b.f332705B.getValidWidth();
                view.setLayoutParams(layoutParams2);
                EditFrameListView editFrameListView = this.f332710b.f332705B;
                ViewGroup.LayoutParams layoutParams3 = editFrameListView.getLayoutParams();
                layoutParams3.width = this.f332710b.f332705B.getValidWidth();
                editFrameListView.setLayoutParams(layoutParams3);
                this.f332710b.f44854d.setLayoutDirection(0);
                C111127k kVar3 = this.f332709a;
                int d = (int) ((((float) kVar3.f187124d) / ((float) kVar3.mo88221d())) * ((float) this.f332710b.f332705B.getTotalFrameWidth()));
                C111118d dVar = this.f332711c.f332703g;
                if (dVar != null) {
                    dVar.mo152343a(this.f332710b.mo17363j(), d, z);
                }
            }

            /* renamed from: c */
            public void mo150218c(boolean z, float f) {
                long leftSliderBound = z ? (long) ((((float) this.f332710b.f332706C.getLeftSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) this.f332709a.f187125e)) : this.f332709a.f187124d + ((long) ((((float) this.f332710b.f332706C.getLeftSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) (this.f332709a.mo88221d() - this.f332709a.f187124d))));
                long rightSliderBound = z ? (long) ((((float) this.f332710b.f332706C.getRightSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) this.f332709a.f187125e)) : this.f332709a.f187124d + ((long) ((((float) this.f332710b.f332706C.getRightSliderBound()) / ((float) this.f332710b.f332705B.getFrameWidth())) * ((float) (this.f332709a.mo88221d() - this.f332709a.f187124d))));
                C111127k kVar = this.f332709a;
                kVar.f187124d = leftSliderBound;
                kVar.f187125e = rightSliderBound;
                String str = this.f332711c.f332700d;
                Log.m105918d(str, "onMove, frameStartMs:" + leftSliderBound + ", frameEndMs:" + rightSliderBound + ", leftSliderBound:" + this.f332710b.f332706C.getLeftSliderBound() + ", rightSliderBound:" + this.f332710b.f332706C.getRightSliderBound() + ", frameWidth:" + this.f332710b.f332705B.getFrameWidth());
                View view = this.f332710b.f44854d;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C111116c cVar = this.f332710b;
                int validWidth = layoutParams.width - cVar.f332705B.getValidWidth();
                layoutParams.width = cVar.f332705B.getValidWidth();
                view.setLayoutParams(layoutParams);
                C111118d dVar = this.f332711c.f332703g;
                if (dVar != null) {
                    dVar.mo152344b(this.f332710b.mo17363j(), validWidth, z, f);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111116c(C111113c cVar, View view, int i) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f332707D = cVar;
            this.f332708z = i;
            this.f332704A = C76577a.m92151b(view.getContext(), 8);
            View findViewById = view.findViewById(C0966R.C0970id.eet);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.frame_list)");
            this.f332705B = (EditFrameListView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.kt7);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.track_crop_slider_seek)");
            this.f332706C = (EditSliderSeekBar) findViewById2;
        }

        /* renamed from: B */
        public void mo162854B(C111127k kVar, boolean z) {
            C87412m.m108594g(kVar, "trackInfo");
            if (kVar.f187129i == this.f332707D.f332702f) {
                int b = C76577a.m92151b(this.f44854d.getContext(), 8);
                if (this.f332705B.getShowWidth() > 0) {
                    this.f332706C.mo150205c(this.f332705B.getShowWidth() - (b * 2), this.f332705B.getMinWidth(), b);
                    return;
                }
                return;
            }
            EditSliderSeekBar editSliderSeekBar = this.f332706C;
            editSliderSeekBar.f313534e = false;
            editSliderSeekBar.f313535f = 0;
            editSliderSeekBar.f313536g = 0;
            editSliderSeekBar.f313539j.setBounds(0, 0, 0, 0);
            editSliderSeekBar.f313540n.setBounds(0, 0, 0, 0);
            editSliderSeekBar.invalidate();
        }

        /* renamed from: y */
        public void mo162855y(C111127k kVar) {
            C87412m.m108594g(kVar, "trackInfo");
            EditFrameListView editFrameListView = this.f332705B;
            editFrameListView.f316837n = true;
            editFrameListView.f316838o = true;
            editFrameListView.f316839p = false;
            editFrameListView.f316840q = false;
            this.f332706C.setMaskColor(1999383596);
            this.f332706C.setEnableHapticAtEdge(true);
            this.f332705B.mo152307a(kVar, this.f332708z, true, true);
            this.f332706C.setOnSliderTouchListener(new C111117a(kVar, this, true, true, this.f332707D));
            if (kVar.f187129i == this.f332707D.f332702f) {
                this.f332706C.mo150205c(this.f332705B.getShowWidth() - (this.f332704A * 2), this.f332705B.getMinWidth(), this.f332704A);
            } else {
                EditSliderSeekBar editSliderSeekBar = this.f332706C;
                editSliderSeekBar.f313534e = false;
                editSliderSeekBar.f313535f = 0;
                editSliderSeekBar.f313536g = 0;
                editSliderSeekBar.f313539j.setBounds(0, 0, 0, 0);
                editSliderSeekBar.f313540n.setBounds(0, 0, 0, 0);
                editSliderSeekBar.invalidate();
            }
            View view = this.f44854d;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.f332705B.getValidWidth();
            view.setLayoutParams(layoutParams);
            EditSliderSeekBar editSliderSeekBar2 = this.f332706C;
            ViewGroup.LayoutParams layoutParams2 = editSliderSeekBar2.getLayoutParams();
            layoutParams2.width = this.f332705B.getValidWidth();
            editSliderSeekBar2.setLayoutParams(layoutParams2);
            EditFrameListView editFrameListView2 = this.f332705B;
            ViewGroup.LayoutParams layoutParams3 = editFrameListView2.getLayoutParams();
            layoutParams3.width = this.f332705B.getValidWidth();
            editFrameListView2.setLayoutParams(layoutParams3);
        }

        /* renamed from: z */
        public void mo162856z() {
            EditFrameListView editFrameListView = this.f332705B;
            C36777d dVar = editFrameListView.f316845v;
            if (dVar != null) {
                dVar.destroy();
            }
            editFrameListView.f316845v = null;
        }
    }

    /* renamed from: u23.c$d */
    public interface C111118d {
        /* renamed from: a */
        void mo152343a(int i, int i2, boolean z);

        /* renamed from: b */
        void mo152344b(int i, int i2, boolean z, float f);

        /* renamed from: c */
        void mo152345c(int i, int i2, boolean z);
    }

    public C111113c() {
        setHasStableIds(true);
    }

    /* renamed from: F4 */
    public final void mo162852F4(int i) {
        int i2;
        if (i != this.f332702f) {
            Iterator<C111127k> it = this.f332701e.iterator();
            int i3 = 0;
            while (true) {
                i2 = -1;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (it.next().f187129i == this.f332702f) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                notifyItemChanged(i3, Boolean.FALSE);
            }
            Iterator<C111127k> it4 = this.f332701e.iterator();
            int i4 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (it4.next().f187129i == i) {
                    i2 = i4;
                    break;
                }
                i4++;
            }
            if (i2 >= 0) {
                notifyItemChanged(i2, Boolean.TRUE);
            }
            this.f332702f = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0015 A[LOOP:0: B:1:0x0015->B:4:0x0025, LOOP_START] */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162853G4(java.util.List<? extends u23.C111127k> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "tracks"
            gy3.C87412m.m108594g(r2, r0)
            java.util.LinkedList<u23.k> r0 = r1.f332701e
            r0.clear()
            java.util.LinkedList<u23.k> r0 = r1.f332701e
            r0.addAll(r2)
            java.util.LinkedList<u23.k> r2 = r1.f332701e
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r2.next()
            u23.k r0 = (u23.C111127k) r0
            boolean r0 = r0.mo88222e()
            if (r0 == 0) goto L_0x0015
        L_0x0027:
            java.util.LinkedList<u23.k> r2 = r1.f332701e
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L_0x0031:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r2.previous()
            u23.k r0 = (u23.C111127k) r0
            boolean r0 = r0.mo88222e()
            if (r0 == 0) goto L_0x0031
            r2.nextIndex()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u23.C111113c.mo162853G4(java.util.List):void");
    }

    public int getItemCount() {
        return this.f332701e.size();
    }

    public long getItemId(int i) {
        return (long) this.f332701e.get(i).f187129i;
    }

    public int getItemViewType(int i) {
        if (this.f332701e.get(i).mo88222e()) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C111114a aVar = (C111114a) zVar;
        C87412m.m108594g(aVar, "viewHolder");
        C111127k kVar = this.f332701e.get(i);
        C87412m.m108593f(kVar, "trackList[position]");
        aVar.mo162855y(kVar);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            return new C111115b(this, new View(viewGroup.getContext()));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cc9, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…rame_item, parent, false)");
        return new C111116c(this, inflate, viewGroup.getHeight());
    }

    public void onViewRecycled(RecyclerView.C16631z zVar) {
        C111114a aVar = (C111114a) zVar;
        C87412m.m108594g(aVar, "holder");
        super.onViewRecycled(aVar);
        aVar.mo162856z();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C111114a aVar = (C111114a) zVar;
        C87412m.m108594g(aVar, "viewHolder");
        C87412m.m108594g(list, "payloads");
        Object N = C110818d0.m150916N(list);
        Boolean bool = N instanceof Boolean ? (Boolean) N : null;
        if (bool == null) {
            C111127k kVar = this.f332701e.get(i);
            C87412m.m108593f(kVar, "trackList[position]");
            aVar.mo162855y(kVar);
            return;
        }
        C111127k kVar2 = this.f332701e.get(i);
        C87412m.m108593f(kVar2, "trackList[position]");
        aVar.mo162854B(kVar2, bool.booleanValue());
    }
}
