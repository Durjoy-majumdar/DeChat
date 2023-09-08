package ob2;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C8503a;
import i03.C60241d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kg3.C76577a;
import kotlin.ResultKt;
import la2.C99364n;
import m03.C61426c;
import nj3.C76912y0;
import rx3.C13598b0;
import rx3.C13604l;
import sb2.C63830o0;
import sx3.C110818d0;
import sx3.C13801s0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C64550mb1;
import u23.C65003a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ob2.c */
public final class C61989c implements MvTracksEditView.C57140e {

    /* renamed from: a */
    public int f176216a = -1;

    /* renamed from: b */
    public long f176217b;

    /* renamed from: c */
    public boolean f176218c;

    /* renamed from: d */
    public int f176219d;

    /* renamed from: e */
    public long f176220e;

    /* renamed from: f */
    public C53973z1 f176221f;

    /* renamed from: g */
    public final /* synthetic */ C63830o0 f176222g;

    /* renamed from: h */
    public final /* synthetic */ C61999g f176223h;

    /* renamed from: i */
    public final /* synthetic */ C8477a0 f176224i;

    /* renamed from: j */
    public final /* synthetic */ TextView f176225j;

    /* renamed from: ob2.c$a */
    public static final class C61990a implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C61990a f176226a = new C61990a();

        /* renamed from: a */
        public final void mo596a(View view) {
            TextView textView;
            if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) != null) {
                textView.setTextSize(1, 14.0f);
            }
        }
    }

    /* renamed from: ob2.c$b */
    public static final class C61991b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f176227d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C110028h> f176228e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61991b(long j, C8479f0<C110028h> f0Var) {
            super(0);
            this.f176227d = j;
            this.f176228e = f0Var;
        }

        public Object invoke() {
            C99364n.m129616h().mo138822a().mo32203a((int) this.f176227d);
            C99364n.m129616h().mo138822a().pause();
            C110028h hVar = (C110028h) this.f176228e.f27484d;
            if (hVar != null) {
                hVar.mo161372F(true);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ob2.c$c */
    public static final class C61992c extends C87413o implements C32227p<C8503a, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63830o0 f176229d;

        /* renamed from: e */
        public final /* synthetic */ int f176230e;

        /* renamed from: f */
        public final /* synthetic */ C61426c f176231f;

        /* renamed from: g */
        public final /* synthetic */ long f176232g;

        /* renamed from: h */
        public final /* synthetic */ List<C8503a> f176233h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61992c(C63830o0 o0Var, int i, C61426c cVar, long j, List<C8503a> list) {
            super(2);
            this.f176229d = o0Var;
            this.f176230e = i;
            this.f176231f = cVar;
            this.f176232g = j;
            this.f176233h = list;
        }

        public Object invoke(Object obj, Object obj2) {
            C8503a aVar = (C8503a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "preview transition: " + aVar);
            this.f176229d.mo88626c3(this.f176230e, aVar);
            this.f176231f.seekTo(this.f176232g);
            this.f176231f.resume();
            C99364n.m129616h().mo138822a().mo32203a((int) this.f176232g);
            C99364n.m129616h().mo138822a().resume();
            Iterator<C8503a> it = this.f176233h.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (C87412m.m108589b(it.next().f27531a, aVar != null ? aVar.f27531a : null)) {
                    break;
                }
                i++;
            }
            int i2 = i + 1;
            if (i2 < 0) {
                i2 = 0;
            }
            if (booleanValue) {
                MvCreateActionStruct c = MvCreateReportHelper.f163005a.mo80352c();
                c.f156552k = 16;
                c.f156543G = 0;
                c.f156542F = i2;
                c.mo86054n();
            } else {
                MvCreateActionStruct c2 = MvCreateReportHelper.f163005a.mo80352c();
                c2.f156552k = 15;
                c2.f156543G = 0;
                c2.f156542F = i2;
                c2.mo86054n();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ob2.c$d */
    public static final class C61993d extends C87413o implements C32226l<C8503a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f176234d;

        /* renamed from: e */
        public final /* synthetic */ C61426c f176235e;

        /* renamed from: f */
        public final /* synthetic */ C63830o0 f176236f;

        /* renamed from: g */
        public final /* synthetic */ int f176237g;

        /* renamed from: h */
        public final /* synthetic */ C61999g f176238h;

        /* renamed from: i */
        public final /* synthetic */ C64550mb1 f176239i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61993d(long j, C61426c cVar, C63830o0 o0Var, int i, C61999g gVar, C64550mb1 mb12) {
            super(1);
            this.f176234d = j;
            this.f176235e = cVar;
            this.f176236f = o0Var;
            this.f176237g = i;
            this.f176238h = gVar;
            this.f176239i = mb12;
        }

        public Object invoke(Object obj) {
            C8503a aVar = (C8503a) obj;
            Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "on select pag: pag=" + aVar + ", resume progress to " + this.f176234d);
            boolean z = true;
            this.f176235e.setLoop(true);
            this.f176235e.mo86376d();
            this.f176236f.mo88626c3(this.f176237g, aVar);
            this.f176235e.seekTo(this.f176234d);
            C99364n.m129616h().mo138822a().mo32203a((int) this.f176234d);
            MvTracksEditView mvTracksEditView = this.f176238h.f176250d;
            String str = null;
            if (mvTracksEditView != null) {
                int i = this.f176237g;
                if (aVar == null) {
                    z = false;
                }
                mvTracksEditView.mo80657c(i, z);
                C64550mb1 mb12 = this.f176239i;
                if (mb12 != null) {
                    if (aVar != null) {
                        str = aVar.f27531a;
                    }
                    mb12.f184268q = str;
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("tracksEditView");
            throw null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.free.MusicMvFlexPreviewTrackUIC$initBgTrackView$3$previewFrame$1", mo125469f = "MusicMvFlexPreviewTrackUIC.kt", mo125470l = {207}, mo125471m = "invokeSuspend")
    /* renamed from: ob2.c$e */
    public static final class C61994e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f176240d;

        /* renamed from: e */
        public final /* synthetic */ C63830o0 f176241e;

        /* renamed from: f */
        public final /* synthetic */ C61989c f176242f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61994e(C63830o0 o0Var, C61989c cVar, C15601d<? super C61994e> dVar) {
            super(2, dVar);
            this.f176241e = o0Var;
            this.f176242f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61994e(this.f176241e, this.f176242f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61994e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f176240d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f176240d = 1;
                if (C53965x0.m60607b(100, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C61426c cVar = this.f176241e.f180949n;
            if (cVar != null) {
                C61989c cVar2 = this.f176242f;
                cVar.mo86383h(cVar2.f176219d, cVar2.f176220e);
            }
            this.f176242f.f176221f = null;
            return C13598b0.f38549a;
        }
    }

    public C61989c(C63830o0 o0Var, C61999g gVar, C8477a0 a0Var, TextView textView) {
        this.f176222g = o0Var;
        this.f176223h = gVar;
        this.f176224i = a0Var;
        this.f176225j = textView;
    }

    /* renamed from: a */
    public void mo80681a(int i, long j) {
        mo86875k(i, j);
    }

    /* renamed from: b */
    public void mo80682b(int i, long j, long j2) {
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onTrackSlidingStarted: index=" + i + ", startTime=" + j + ", endTime=" + j2);
        C61426c cVar = this.f176222g.f180949n;
        if (cVar != null) {
            cVar.pause();
        }
        C99364n.m129616h().mo138822a().pause();
    }

    /* renamed from: c */
    public void mo80683c(int i, long j) {
        mo86875k(i, j);
    }

    /* renamed from: d */
    public void mo80684d(long j) {
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onSeek: " + j);
        this.f176222g.mo88631i3(j);
        C99364n.m129616h().mo138822a().mo32203a((int) j);
    }

    /* renamed from: e */
    public void mo80685e(int i, long j, long j2) {
        int i2 = i;
        long j3 = j;
        long j4 = j2;
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onPlayRangeChanged: " + i2 + ", (" + j3 + ", " + j4 + ')');
        C53973z1 z1Var = this.f176221f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f176221f = null;
        C61999g gVar = this.f176223h;
        MvTracksEditView mvTracksEditView = gVar.f176250d;
        if (mvTracksEditView != null) {
            long fillingDuration = mvTracksEditView.getFillingDuration();
            gVar.getClass();
            Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "updateTrack: index=" + i2 + ", startTime=" + j3 + ", endTime=" + j4 + ", fillingDuration=" + fillingDuration);
            LinkedList<C64550mb1> linkedList = gVar.f176254h;
            if (linkedList != null) {
                C64550mb1 mb12 = linkedList.get(i2);
                C87412m.m108593f(mb12, "trackList[index]");
                C64550mb1 mb13 = mb12;
                long j5 = j4 - j3;
                String str = "tracksEditView";
                mb13.f184259e = (int) j5;
                mb13.f184262h = j3;
                gVar.mo86876d3(fillingDuration);
                C63830o0 o0Var = this.f176222g;
                MvTracksEditView mvTracksEditView2 = this.f176223h.f176250d;
                if (mvTracksEditView2 != null) {
                    long fillingDuration2 = mvTracksEditView2.getFillingDuration();
                    String str2 = o0Var.f180942d;
                    Log.m105924i(str2, "updateMediaInfo: index=" + i2 + ", startTime=" + j3 + ", endTime=" + j4 + ", fillingDuration=" + fillingDuration2);
                    C60241d dVar = o0Var.f180948j.get(i2);
                    C87412m.m108593f(dVar, "mediaInfoList[index]");
                    C60241d dVar2 = dVar;
                    dVar2.f165943o = j5;
                    dVar2.f165944p = j3;
                    o0Var.mo88630g3(fillingDuration2);
                    C61426c cVar = o0Var.f180949n;
                    if (cVar != null) {
                        LinkedList<C60241d> linkedList2 = o0Var.f180948j;
                        ArrayList arrayList = new ArrayList();
                        for (T next : linkedList2) {
                            if (((C60241d) next).f165943o > 0) {
                                arrayList.add(next);
                            }
                        }
                        cVar.setMediaList(arrayList);
                    }
                    C61426c cVar2 = o0Var.f180949n;
                    if (cVar2 != null) {
                        cVar2.start();
                    }
                    MvTracksEditView mvTracksEditView3 = this.f176223h.f176250d;
                    if (mvTracksEditView3 != null) {
                        long j6 = mvTracksEditView3.getTracks().get(i2).f187130j;
                        C61426c cVar3 = this.f176222g.f180949n;
                        if (cVar3 != null) {
                            cVar3.mo86373a(j6, j5 + j6);
                        }
                        C99364n.m129616h().mo138822a().resume();
                        this.f176223h.f176258o = i2;
                        return;
                    }
                    C87412m.m108603p(str);
                    throw null;
                }
                C87412m.m108603p(str);
                throw null;
            }
            C87412m.m108603p("trackList");
            throw null;
        }
        C87412m.m108603p("tracksEditView");
        throw null;
    }

    /* renamed from: f */
    public void mo80686f(int i) {
        int i2 = i;
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onChooseTransition: index=" + i2);
        C8503a.C8504a aVar = C8503a.f27529e;
        List<C13604l<String, C8503a>> o = C13801s0.m13103o(C8503a.f27530f);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(o, 10));
        for (C13604l lVar : o) {
            arrayList.add((C8503a) lVar.f38556e);
        }
        MvTracksEditView mvTracksEditView = this.f176223h.f176250d;
        if (mvTracksEditView != null) {
            long videoProgress = mvTracksEditView.getVideoProgress();
            MvTracksEditView mvTracksEditView2 = this.f176223h.f176250d;
            if (mvTracksEditView2 != null) {
                int i3 = 0;
                for (C65003a aVar2 : mvTracksEditView2.getTracks().subList(0, i2 + 1)) {
                    i3 += (int) (aVar2.f187125e - aVar2.f187124d);
                }
                C61426c cVar = ((C63830o0) C39818r.f106831a.mo62444c(this.f176223h.getActivity()).mo75002a(C63830o0.class)).f180949n;
                C87412m.m108591d(cVar);
                long j = (long) i3;
                long j2 = j - 1000;
                C8479f0 f0Var = new C8479f0();
                cVar.setLoop(false);
                cVar.mo86373a(j2, j + 1500);
                cVar.setOnPlayFinishListener(new C61991b(j2, f0Var));
                LinkedList<C64550mb1> linkedList = this.f176223h.f176254h;
                if (linkedList != null) {
                    C64550mb1 mb12 = (C64550mb1) C110818d0.m150917O(linkedList, i2);
                    C61426c cVar2 = cVar;
                    C110028h hVar = new C110028h(this.f176223h.getContext(), mb12 != null ? mb12.f184268q : null, arrayList, new C61992c(this.f176222g, i, cVar2, j2, arrayList), new C61993d(videoProgress, cVar2, this.f176222g, i, this.f176223h, mb12));
                    f0Var.f27484d = hVar;
                    C110028h hVar2 = hVar;
                    hVar.show();
                    return;
                }
                C87412m.m108603p("trackList");
                throw null;
            }
            C87412m.m108603p("tracksEditView");
            throw null;
        }
        C87412m.m108603p("tracksEditView");
        throw null;
    }

    /* renamed from: g */
    public void mo80687g(int i, long j, long j2) {
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onSelectStarted: " + i + ", startTime=" + j + ", endTime=" + j2);
        this.f176223h.f176260q.put(Integer.valueOf(i), new Range(Long.valueOf(j), Long.valueOf(j2)));
        MvTracksEditView mvTracksEditView = this.f176223h.f176250d;
        if (mvTracksEditView != null) {
            long j3 = mvTracksEditView.getTracks().get(i).f187130j;
            C61426c cVar = this.f176222g.f180949n;
            if (cVar != null) {
                cVar.mo86373a(j3, (j2 - j) + j3);
            }
            C94223g a = C99364n.m129616h().mo138822a();
            LinkedList<C64550mb1> linkedList = this.f176223h.f176254h;
            if (linkedList != null) {
                a.mo32203a((int) linkedList.get(i).f184258d);
                C61999g gVar = this.f176223h;
                gVar.getClass();
                Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "enterSelectMode");
                ViewGroup viewGroup = gVar.f176251e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    Button button = gVar.f176252f;
                    if (button != null) {
                        button.setVisibility(8);
                    } else {
                        C87412m.m108603p("completeButton");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("selectButtonsContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("trackList");
                throw null;
            }
        } else {
            C87412m.m108603p("tracksEditView");
            throw null;
        }
    }

    /* renamed from: h */
    public void mo80688h() {
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onDragEnded");
        if (this.f176218c) {
            this.f176222g.mo88631i3(this.f176217b);
            C99364n.m129616h().mo138822a().mo32203a((int) this.f176217b);
        }
        this.f176216a = -1;
        this.f176217b = 0;
    }

    /* renamed from: i */
    public boolean mo80689i(float f, MvTracksEditView.C57141f fVar, int i) {
        C87412m.m108594g(fVar, "type");
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            ViewGroup viewGroup = this.f176223h.f176253g;
            if (viewGroup == null) {
                C87412m.m108603p("deleteItemContainer");
                throw null;
            } else if (f >= ((float) viewGroup.getTop())) {
                this.f176224i.f27482d = true;
                this.f176225j.setText(C76577a.m92166q(this.f176223h.getActivity(), C0966R.string.h4u));
            } else {
                this.f176224i.f27482d = false;
                this.f176225j.setText(C76577a.m92166q(this.f176223h.getActivity(), C0966R.string.h4t));
            }
        } else if (ordinal == 1) {
            ViewGroup viewGroup2 = this.f176223h.f176253g;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                StringBuilder sb = new StringBuilder();
                sb.append("size：");
                MvTracksEditView mvTracksEditView = this.f176223h.f176250d;
                if (mvTracksEditView != null) {
                    sb.append(mvTracksEditView.getTracks().size());
                    sb.append("， index: ");
                    sb.append(i);
                    Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb.toString());
                    if (this.f176224i.f27482d) {
                        MvTracksEditView mvTracksEditView2 = this.f176223h.f176250d;
                        if (mvTracksEditView2 == null) {
                            C87412m.m108603p("tracksEditView");
                            throw null;
                        } else if (mvTracksEditView2.getTracks().size() == 1) {
                            C76912y0.m92766e(this.f176223h.getActivity(), C76577a.m92166q(this.f176223h.getActivity(), C0966R.string.h4p), C61990a.f176226a);
                        } else {
                            C63830o0 o0Var = this.f176222g;
                            if (i == -1) {
                                o0Var.getClass();
                            } else {
                                o0Var.f180948j.remove(i);
                                o0Var.mo88630g3(o0Var.f180948j.getLast().f165943o);
                                C61426c cVar = o0Var.f180949n;
                                if (cVar != null) {
                                    LinkedList<C60241d> linkedList = o0Var.f180948j;
                                    ArrayList arrayList = new ArrayList();
                                    for (T next : linkedList) {
                                        if (((C60241d) next).f165943o > 0) {
                                            arrayList.add(next);
                                        }
                                    }
                                    cVar.setMediaList(arrayList);
                                }
                                C61426c cVar2 = o0Var.f180949n;
                                if (cVar2 != null) {
                                    cVar2.start();
                                }
                            }
                            LinkedList<C64550mb1> linkedList2 = this.f176223h.f176254h;
                            if (linkedList2 != null) {
                                linkedList2.remove(i);
                                C61999g gVar = this.f176223h;
                                LinkedList<C64550mb1> linkedList3 = gVar.f176254h;
                                if (linkedList3 != null) {
                                    gVar.mo86876d3((long) linkedList3.getLast().f184259e);
                                    this.f176223h.f176256j = true;
                                    this.f176222g.mo88631i3(0);
                                    C99364n.m129616h().mo138822a().mo32203a(0);
                                    MvTracksEditView mvTracksEditView3 = this.f176223h.f176250d;
                                    if (mvTracksEditView3 != null) {
                                        mvTracksEditView3.mo80657c(i, false);
                                        return true;
                                    }
                                    C87412m.m108603p("tracksEditView");
                                    throw null;
                                }
                                C87412m.m108603p("trackList");
                                throw null;
                            }
                            C87412m.m108603p("trackList");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("tracksEditView");
                    throw null;
                }
            } else {
                C87412m.m108603p("deleteItemContainer");
                throw null;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("touchY: ");
        sb4.append(f);
        sb4.append(", deleteItemContainer.top: ");
        ViewGroup viewGroup3 = this.f176223h.f176253g;
        if (viewGroup3 != null) {
            sb4.append(viewGroup3.getTop());
            Log.m105918d("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb4.toString());
            return false;
        }
        C87412m.m108603p("deleteItemContainer");
        throw null;
    }

    /* renamed from: j */
    public void mo80690j(int i) {
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onDragStarted: " + i);
        this.f176216a = i;
        this.f176218c = false;
        ViewGroup viewGroup = this.f176223h.f176253g;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        } else {
            C87412m.m108603p("deleteItemContainer");
            throw null;
        }
    }

    /* renamed from: k */
    public final void mo86875k(int i, long j) {
        this.f176219d = i;
        this.f176220e = j;
        C53973z1 z1Var = this.f176221f;
        boolean z = true;
        if (z1Var == null || !z1Var.mo74466a()) {
            z = false;
        }
        if (!z) {
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            this.f176221f = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C61994e(this.f176222g, this, (C15601d<? super C61994e>) null), 2, (Object) null);
        }
    }

    public void onMove(int i, int i2) {
        if (i != -1 && i2 != -1 && i != i2) {
            C63830o0 o0Var = this.f176222g;
            C60241d remove = o0Var.f180948j.remove(i);
            C87412m.m108593f(remove, "mediaInfoList.removeAt(fromPosition)");
            o0Var.f180948j.add(i2, remove);
            o0Var.mo88630g3(o0Var.f180948j.getLast().f165943o);
            C61426c cVar = o0Var.f180949n;
            long j = 0;
            if (cVar != null) {
                LinkedList<C60241d> linkedList = o0Var.f180948j;
                ArrayList arrayList = new ArrayList();
                for (T next : linkedList) {
                    if (((C60241d) next).f165943o > 0) {
                        arrayList.add(next);
                    }
                }
                cVar.setMediaList(arrayList);
            }
            C61426c cVar2 = o0Var.f180949n;
            if (cVar2 != null) {
                cVar2.start();
            }
            LinkedList<C64550mb1> linkedList2 = this.f176223h.f176254h;
            if (linkedList2 != null) {
                C64550mb1 mb12 = (C64550mb1) C110818d0.m150917O(linkedList2, this.f176216a);
                LinkedList<C64550mb1> linkedList3 = this.f176223h.f176254h;
                if (linkedList3 != null) {
                    C64550mb1 remove2 = linkedList3.remove(i);
                    C87412m.m108593f(remove2, "trackList.removeAt(fromPosition)");
                    C64550mb1 mb13 = remove2;
                    LinkedList<C64550mb1> linkedList4 = this.f176223h.f176254h;
                    if (linkedList4 != null) {
                        linkedList4.add(i2, mb13);
                        C61999g gVar = this.f176223h;
                        LinkedList<C64550mb1> linkedList5 = gVar.f176254h;
                        if (linkedList5 != null) {
                            gVar.mo86876d3((long) linkedList5.getLast().f184259e);
                            if (mb12 != null) {
                                j = mb12.f184258d;
                            }
                            this.f176217b = j;
                            this.f176218c = true;
                            C61999g gVar2 = this.f176223h;
                            gVar2.f176257n = true;
                            LinkedList<C64550mb1> linkedList6 = gVar2.f176254h;
                            if (linkedList6 != null) {
                                int i3 = 0;
                                for (T next2 : linkedList6) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        C64550mb1 mb14 = (C64550mb1) next2;
                                        MvTracksEditView mvTracksEditView = gVar2.f176250d;
                                        if (mvTracksEditView != null) {
                                            String str = mb14.f184268q;
                                            mvTracksEditView.mo80657c(i3, !(str == null || str.length() == 0));
                                            i3 = i4;
                                        } else {
                                            C87412m.m108603p("tracksEditView");
                                            throw null;
                                        }
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
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
                C87412m.m108603p("trackList");
                throw null;
            }
            C87412m.m108603p("trackList");
            throw null;
        }
    }
}
