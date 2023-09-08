package u23;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.FrameListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13598b0;
import sp3.C36777d;

/* renamed from: u23.f */
public final class C111119f extends RecyclerView.C16613e<C111120a> {

    /* renamed from: d */
    public final LinkedList<C65003a> f332712d = new LinkedList<>();

    /* renamed from: e */
    public int f332713e = -1;

    /* renamed from: f */
    public int f332714f = -1;

    /* renamed from: g */
    public int f332715g = -1;

    /* renamed from: h */
    public C32227p<? super Integer, ? super C65003a, C13598b0> f332716h;

    /* renamed from: i */
    public C65005i f332717i;

    /* renamed from: j */
    public boolean f332718j;

    /* renamed from: u23.f$a */
    public abstract class C111120a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111120a(C111119f fVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public abstract void mo162860y(C65003a aVar);

        /* renamed from: z */
        public void mo162861z() {
        }
    }

    /* renamed from: u23.f$b */
    public final class C111121b extends C111120a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111121b(C111119f fVar, View view) {
            super(fVar, view);
            C87412m.m108594g(view, "itemView");
            view.setOnClickListener((View.OnClickListener) null);
        }

        /* renamed from: y */
        public void mo162860y(C65003a aVar) {
            C87412m.m108594g(aVar, "trackInfo");
            ViewGroup.LayoutParams layoutParams = this.f44854d.getLayoutParams();
            if (layoutParams == null) {
                this.f44854d.setLayoutParams(new ViewGroup.LayoutParams(aVar.f187123c, -1));
                return;
            }
            int i = layoutParams.width;
            int i2 = aVar.f187123c;
            if (i != i2) {
                layoutParams.width = i2;
                this.f44854d.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: u23.f$c */
    public final class C111122c extends C111120a {

        /* renamed from: A */
        public final /* synthetic */ C111119f f332719A;

        /* renamed from: z */
        public final FrameListView f332720z;

        /* renamed from: u23.f$c$a */
        public static final class C111123a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C111119f f332721d;

            /* renamed from: e */
            public final /* synthetic */ C111122c f332722e;

            public C111123a(C111119f fVar, C111122c cVar) {
                this.f332721d = fVar;
                this.f332722e = cVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C32227p<? super Integer, ? super C65003a, C13598b0> pVar = this.f332721d.f332716h;
                if (pVar != null) {
                    Integer valueOf = Integer.valueOf(this.f332722e.mo17363j());
                    C65003a aVar = this.f332721d.f332712d.get(this.f332722e.mo17363j());
                    C87412m.m108593f(aVar, "trackList[adapterPosition]");
                    pVar.invoke(valueOf, aVar);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111122c(C111119f fVar, View view) {
            super(fVar, view);
            C87412m.m108594g(view, "itemView");
            this.f332719A = fVar;
            View findViewById = view.findViewById(C0966R.C0970id.eet);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.frame_list)");
            this.f332720z = (FrameListView) findViewById;
        }

        /* renamed from: y */
        public void mo162860y(C65003a aVar) {
            C87412m.m108594g(aVar, "trackInfo");
            boolean z = true;
            if (this.f332719A.f332718j) {
                boolean z2 = mo17363j() != this.f332719A.f332713e;
                boolean z3 = mo17363j() != this.f332719A.f332714f;
                FrameListView frameListView = this.f332720z;
                frameListView.f316864p = true;
                frameListView.f316865q = true;
                frameListView.f316866r = z2;
                frameListView.f316867s = z3;
            } else {
                FrameListView frameListView2 = this.f332720z;
                boolean z4 = mo17363j() == this.f332719A.f332713e;
                if (mo17363j() != this.f332719A.f332714f) {
                    z = false;
                }
                frameListView2.f316864p = z4;
                frameListView2.f316865q = z;
                FrameListView frameListView3 = this.f332720z;
                frameListView3.f316866r = false;
                frameListView3.f316867s = false;
            }
            C65005i iVar = this.f332719A.f332717i;
            if (iVar != null) {
                this.f332720z.setThumbFetcherFactory(iVar);
            }
            this.f332720z.setTrackInfo(aVar);
            this.f44854d.setBackground((Drawable) null);
            View view = this.f44854d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i = this.f332719A.f332715g;
            if (i >= 0) {
                if (aVar.f187129i == i) {
                    View view3 = this.f44854d;
                    view3.setBackground(C76577a.m92158i(view3.getContext(), C0966R.C0969drawable.azo));
                } else {
                    View view4 = this.f44854d;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(4);
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f44854d.setOnClickListener(new C111123a(this.f332719A, this));
        }

        /* renamed from: z */
        public void mo162861z() {
            FrameListView frameListView = this.f332720z;
            C36777d dVar = frameListView.f316872x;
            if (dVar != null) {
                dVar.destroy();
            }
            frameListView.f316872x = null;
            frameListView.f316857f = null;
            Log.m105924i(frameListView.f316855d, "clearThumb");
            frameListView.f316858g.clear();
            frameListView.f316859h = null;
            frameListView.postInvalidate();
        }
    }

    /* renamed from: F4 */
    public final C65003a mo162857F4(int i) {
        C65003a aVar = this.f332712d.get(i);
        C87412m.m108593f(aVar, "trackList[position]");
        return aVar;
    }

    /* renamed from: G4 */
    public final void mo162858G4(int i) {
        boolean z;
        boolean z2;
        if (i != this.f332715g) {
            for (C65003a aVar : this.f332712d) {
                if (aVar.f187129i == this.f332715g) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            for (C65003a aVar2 : this.f332712d) {
                if (aVar2.f187129i == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            this.f332715g = i;
            notifyDataSetChanged();
        }
    }

    /* renamed from: O4 */
    public final void mo162859O4(List<? extends C65003a> list) {
        int i;
        C87412m.m108594g(list, "tracks");
        this.f332712d.clear();
        this.f332712d.addAll(list);
        Iterator<C65003a> it = this.f332712d.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().mo88222e()) {
                break;
            } else {
                i2++;
            }
        }
        this.f332713e = i2 + 1;
        LinkedList<C65003a> linkedList = this.f332712d;
        ListIterator<C65003a> listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().mo88222e()) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                break;
            }
        }
        this.f332714f = i - 1;
    }

    public int getItemCount() {
        return this.f332712d.size();
    }

    public int getItemViewType(int i) {
        if (this.f332712d.get(i).mo88222e()) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C111120a aVar = (C111120a) zVar;
        C87412m.m108594g(aVar, "viewHolder");
        C65003a aVar2 = this.f332712d.get(i);
        C87412m.m108593f(aVar2, "trackList[position]");
        aVar.mo162860y(aVar2);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            return new C111121b(this, new View(viewGroup.getContext()));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cc_, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…rame_item, parent, false)");
        return new C111122c(this, inflate);
    }

    public void onViewRecycled(RecyclerView.C16631z zVar) {
        C111120a aVar = (C111120a) zVar;
        C87412m.m108594g(aVar, "holder");
        super.onViewRecycled(aVar);
        aVar.mo162861z();
    }
}
