package ob2;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.util.Range;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import c14.C54612b0;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d03.C58010a;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import m03.C61426c;
import my3.C61594j;
import my3.C61595o;
import p707tz.C65000f;
import rb2.C63380a;
import sb2.C63830o0;
import sp3.C36777d;
import sx3.C36904l0;
import sx3.C36907w;
import te3.C64550mb1;
import u23.C65003a;
import u23.C65005i;
import vb2.C65567d;

/* renamed from: ob2.g */
public final class C61999g extends UIComponent {

    /* renamed from: d */
    public MvTracksEditView f176250d;

    /* renamed from: e */
    public ViewGroup f176251e;

    /* renamed from: f */
    public Button f176252f;

    /* renamed from: g */
    public ViewGroup f176253g;

    /* renamed from: h */
    public LinkedList<C64550mb1> f176254h;

    /* renamed from: i */
    public final C0000n0 f176255i = C53930o0.m60561h(C53930o0.m60555b(), C53959v2.m60598a((C53973z1) null, 1, (Object) null));

    /* renamed from: j */
    public boolean f176256j;

    /* renamed from: n */
    public boolean f176257n;

    /* renamed from: o */
    public int f176258o = -1;

    /* renamed from: p */
    public boolean f176259p;

    /* renamed from: q */
    public final HashMap<Integer, Range<Long>> f176260q = new HashMap<>();

    /* renamed from: r */
    public final C63380a f176261r;

    /* renamed from: ob2.g$a */
    public static final class C62000a implements C65005i {

        /* renamed from: a */
        public final C65005i f176262a;

        /* renamed from: b */
        public final C65005i f176263b;

        /* renamed from: c */
        public final /* synthetic */ AppCompatActivity f176264c;

        public C62000a(AppCompatActivity appCompatActivity) {
            Class cls = C65000f.class;
            this.f176264c = appCompatActivity;
            this.f176262a = ((C65000f) C86312j.m106911c(cls)).mo89197mk();
            this.f176263b = ((C65000f) C86312j.m106911c(cls)).mo89201rK();
        }

        /* renamed from: a */
        public C36777d mo86877a(C65003a aVar, Object obj) {
            Class cls = C65000f.class;
            C87412m.m108594g(aVar, "trackInfo");
            if (!((C65000f) C86312j.m106911c(cls)).mo89180Wk(aVar)) {
                return this.f176263b.mo86877a(aVar, obj);
            }
            C58010a Ue = ((C65000f) C86312j.m106911c(cls)).mo89179Ue(aVar);
            C87412m.m108591d(Ue);
            AppCompatActivity appCompatActivity = this.f176264c;
            C65005i iVar = this.f176262a;
            C61426c cVar = ((C63830o0) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C63830o0.class)).f180949n;
            C87412m.m108591d(cVar);
            return iVar.mo86877a(aVar, cVar.mo86379g(Ue));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61999g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f176261r = new C63380a(new C62000a(appCompatActivity));
    }

    /* renamed from: c3 */
    public static final void m72743c3(C61999g gVar) {
        gVar.getClass();
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "exitSelectMode");
        ViewGroup viewGroup = gVar.f176251e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            Button button = gVar.f176252f;
            if (button != null) {
                button.setVisibility(0);
                MvTracksEditView mvTracksEditView = gVar.f176250d;
                if (mvTracksEditView != null) {
                    Log.m105924i("MicroMsg.MvTracksEditView", "stopSelecting: " + mvTracksEditView.getSelectedIndex());
                    if (mvTracksEditView.getSelectedIndex() >= 0) {
                        C65567d dVar = mvTracksEditView.f163705g;
                        int selectedIndex = mvTracksEditView.getSelectedIndex();
                        dVar.getClass();
                        dVar.notifyItemChanged(selectedIndex + 1);
                        mvTracksEditView.setSelectedIndex(-1);
                    }
                    mvTracksEditView.f163705g.f188665f = null;
                    mvTracksEditView.f163703e.setVisibility(0);
                    mvTracksEditView.f163718w.f188695r = true;
                    mvTracksEditView.f163702d.mo17035V0();
                    C39622i0 a = C39818r.f106831a.mo62444c(gVar.getActivity()).mo75002a(C63830o0.class);
                    C87412m.m108593f(a, "UICProvider.of(activity)…PreviewBgUIC::class.java)");
                    C61426c cVar = ((C63830o0) a).f180949n;
                    if (cVar != null) {
                        cVar.mo86376d();
                    }
                    gVar.f176260q.clear();
                    return;
                }
                C87412m.m108603p("tracksEditView");
                throw null;
            }
            C87412m.m108603p("completeButton");
            throw null;
        }
        C87412m.m108603p("selectButtonsContainer");
        throw null;
    }

    /* renamed from: d3 */
    public final void mo86876d3(long j) {
        LinkedList<C64550mb1> linkedList = this.f176254h;
        if (linkedList != null) {
            C61594j i = C61595o.m72301i(0, linkedList.size() - 1);
            LinkedList<C64550mb1> linkedList2 = this.f176254h;
            if (linkedList2 != null) {
                ArrayList<C64550mb1> arrayList = new ArrayList<>(C36907w.m41090l(i, 10));
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    arrayList.add(linkedList2.get(((C36904l0) it).mo59695a()));
                }
                long j2 = 0;
                for (C64550mb1 mb12 : arrayList) {
                    mb12.f184258d = j2;
                    j2 += (long) mb12.f184259e;
                }
                LinkedList<C64550mb1> linkedList3 = this.f176254h;
                if (linkedList3 != null) {
                    C64550mb1 last = linkedList3.getLast();
                    last.f184258d = j2;
                    last.f184259e = (int) j;
                    return;
                }
                C87412m.m108603p("trackList");
                throw null;
            }
            C87412m.m108603p("trackList");
            throw null;
        }
        C87412m.m108603p("trackList");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C63380a aVar = this.f176261r;
        aVar.getClass();
        Log.m105924i("MicroMsg.ThumbCachedLoader", "release");
        Collection<C63380a.C63381a> values = aVar.f179781b.values();
        C87412m.m108593f(values, "entries.values");
        for (C63380a.C63381a aVar2 : values) {
            C54612b0.C54613a.m61404a(aVar2.f179788e, (Throwable) null, 1, (Object) null);
            C36777d dVar = aVar2.f179784a;
            if (dVar != null) {
                dVar.destroy();
            }
            aVar2.f179784a = null;
        }
        C53930o0.m60558e(aVar.f179782c, (CancellationException) null, 1, (Object) null);
        C53930o0.m60558e(this.f176255i, (CancellationException) null, 1, (Object) null);
    }
}
