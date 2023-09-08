package l23;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.FrameListView;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.VLogThumbView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.CMTimeRange;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h33.C108056e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import l23.C109202j;
import lh2.C99417a;
import my3.C34690i;
import my3.C61594j;
import my3.C61595o;
import o40.C61926c;
import qh2.C101198e;
import r23.C110499e;
import rx3.C13598b0;
import sp3.C110794b;
import sp3.C110801c;
import sp3.C36777d;
import sx3.C13798c0;
import sx3.C36904l0;
import sx3.C36907w;
import sx3.C64197v;
import u23.C111127k;

/* renamed from: l23.t0 */
public final class C109232t0 extends C99417a implements C109202j.C109204c, C109202j.C109205d {

    /* renamed from: f */
    public final View f327033f;

    /* renamed from: g */
    public final View f327034g;

    /* renamed from: h */
    public final VLogThumbView f327035h;

    /* renamed from: i */
    public final int f327036i = 112;

    /* renamed from: j */
    public final int f327037j = 63;

    /* renamed from: n */
    public long f327038n;

    /* renamed from: l23.t0$a */
    public static final class C109233a implements VLogThumbView.C106304e {

        /* renamed from: a */
        public final /* synthetic */ C101198e f327039a;

        public C109233a(C101198e eVar) {
            this.f327039a = eVar;
        }

        /* renamed from: a */
        public void mo152413a(int i) {
            C101198e eVar = this.f327039a;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_SELECT_TRANSITION;
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_SELECT_TRANSITION_INDEX", i);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar.mo14585p(bVar, bundle);
        }

        /* renamed from: b */
        public void mo152414b(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_VLOG_SELECT_TRACK", i);
            this.f327039a.mo14585p(C101198e.C101199b.EDIT_VLOG_SELECT_TRACK, bundle);
        }
    }

    /* renamed from: l23.t0$b */
    public static final class C109234b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109232t0 f327040d;

        /* renamed from: e */
        public final /* synthetic */ long f327041e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109234b(C109232t0 t0Var, long j) {
            super(0);
            this.f327040d = t0Var;
            this.f327041e = j;
        }

        public Object invoke() {
            this.f327040d.f327035h.setProgress(this.f327041e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109232t0(View view, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(view, "layout");
        C87412m.m108594g(eVar, "status");
        this.f327033f = view;
        View findViewById = view.findViewById(C0966R.C0970id.l_8);
        C87412m.m108593f(findViewById, "layout.findViewById(R.id.vlog_editor_thumb_view)");
        this.f327034g = findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.l_e);
        C87412m.m108593f(findViewById2, "layout.findViewById(R.id.vlog_thumb_recycler)");
        VLogThumbView vLogThumbView = (VLogThumbView) findViewById2;
        this.f327035h = vLogThumbView;
        vLogThumbView.setOnSelectCallback(new C109233a(eVar));
        this.f327038n = -1;
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        long j2 = this.f327038n;
        if (j2 <= 0 || Util.ticksToNow(j2) >= 1000) {
            Log.m105918d("MicroMsg.VLogThumbViewPlugin", "onProgress: " + j + ", enableAutoScroll:" + this.f327035h + ".enableAutoScroll");
            this.f327038n = Util.currentTicks();
        }
        if (!this.f327034g.isShown()) {
            Log.m105918d("MicroMsg.VLogThumbViewPlugin", "onProgress thumbViewRoot not visible ignore");
        } else {
            C61926c.m72668M(new C109234b(this, j));
        }
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
        VLogThumbView vLogThumbView = this.f327035h;
        vLogThumbView.f317005F = eVar;
        Log.m105924i("MicroMsg.VLogThumbView", "onStart: ");
        if (!vLogThumbView.isShown()) {
            Log.m105924i("MicroMsg.VLogThumbView", "onStart thumbViewRoot not visible ignore");
        } else {
            vLogThumbView.f317028o = true;
        }
    }

    public void onFinish() {
    }

    public void release() {
        VLogThumbView vLogThumbView = this.f327035h;
        C61594j i = C61595o.m72301i(0, vLogThumbView.f317020d.getChildCount());
        RecyclerView recyclerView = vLogThumbView.f317020d;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(i, 10));
        C36904l0 i2 = i.iterator();
        while (((C34690i) i2).f93287f) {
            arrayList.add(recyclerView.getChildAt(i2.mo59695a()));
        }
        Iterator it = ((ArrayList) C13798c0.m13102z(arrayList, FrameListView.class)).iterator();
        while (it.hasNext()) {
            FrameListView frameListView = (FrameListView) it.next();
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
        C110794b.f331445i.getClass();
        C110794b.f331444h.evictAll();
    }

    public void reset() {
        VLogThumbView vLogThumbView = this.f327035h;
        ((ArrayList) vLogThumbView.f317024h.f330417j).clear();
        vLogThumbView.mo152396a(-1, 0, 0);
    }

    /* renamed from: s */
    public void mo159389s(C96552p0 p0Var, long j, boolean z) {
        long j2;
        C111127k kVar;
        if (this.f327034g.getVisibility() != 0) {
            Log.m105924i("MicroMsg.VLogThumbViewPlugin", "thumbViewRoot not visible ignore update");
        } else if (p0Var != null) {
            CMTimeRange k = p0Var.mo134614k();
            long j3 = (long) 1000;
            long startUs = k.getStartUs() / j3;
            long endUs = k.getEndUs() / j3;
            VLogThumbView vLogThumbView = this.f327035h;
            long durationMs = p0Var.getDurationMs();
            List<C106205q0> o = p0Var.mo134618o();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (T next : o) {
                int i2 = i + 1;
                if (i >= 0) {
                    C106205q0 q0Var = (C106205q0) next;
                    C110801c cVar = q0Var.f316501l;
                    long j4 = j3;
                    if (cVar.f331465c < startUs || cVar.f331464b > endUs) {
                        j2 = durationMs;
                        kVar = null;
                    } else {
                        kVar = new C111127k(q0Var);
                        kVar.f187129i = i;
                        C110801c cVar2 = kVar.f332732n.f316501l;
                        long j5 = cVar2.f331464b;
                        j2 = durationMs;
                        if (j5 < startUs) {
                            kVar.f187124d = cVar2.f331466d + ((long) (((float) (startUs - j5)) * cVar2.f331468f));
                        }
                        long j6 = cVar2.f331465c;
                        if (j6 > endUs) {
                            kVar.f187125e = cVar2.f331467e - ((long) (((float) (j6 - endUs)) * cVar2.f331468f));
                        }
                        kVar.f187122b = this.f327036i;
                        kVar.f187121a = this.f327037j;
                    }
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                    i = i2;
                    j3 = j4;
                    durationMs = j2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            long j7 = j3;
            vLogThumbView.getClass();
            vLogThumbView.f317021e.setVisibility(0);
            vLogThumbView.f317009J.clear();
            vLogThumbView.f317009J.addAll(arrayList);
            vLogThumbView.f317025i = 0;
            vLogThumbView.f317011L = durationMs;
            vLogThumbView.f317026j = k.getStartUs() / j7;
            long endUs2 = k.getEndUs() / j7;
            vLogThumbView.f317027n = endUs2;
            long j8 = endUs2 - vLogThumbView.f317026j;
            Log.m105924i("MicroMsg.VLogThumbView", "onUpdate, duration:" + (vLogThumbView.f317027n - vLogThumbView.f317026j) + ", visibility:" + vLogThumbView.isShown() + " seekTo:" + j + " seekToOrigin:" + z);
            vLogThumbView.f317020d.removeCallbacks(vLogThumbView.f317032s);
            vLogThumbView.f317032s = new C108056e(vLogThumbView, j8, j, z);
            vLogThumbView.f317008I = false;
            vLogThumbView.f317028o = false;
            vLogThumbView.f317029p = vLogThumbView.f317030q;
            vLogThumbView.f317030q = 0;
            LinearLayoutManager linearLayoutManager = vLogThumbView.f317022f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(0);
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "updateTracks", "(JLcom/tencent/tav/coremedia/CMTimeRange;JZLjava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "updateTracks", "(JLcom/tencent/tav/coremedia/CMTimeRange;JZLjava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            Runnable runnable = vLogThumbView.f317032s;
            if (runnable != null) {
                ((C108056e) runnable).run();
            }
        }
    }

    public void setVisibility(int i) {
        View view = this.f327034g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/VLogThumbViewPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z = false;
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/VLogThumbViewPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        VLogThumbView vLogThumbView = this.f327035h;
        if (i == 0) {
            z = true;
        }
        vLogThumbView.f317010K = z;
        vLogThumbView.f317021e.setVisibility(i);
    }

    /* renamed from: x */
    public final void mo160474x(int i, long j, long j2) {
        Log.m105924i("MicroMsg.VLogThumbViewPlugin", "selectTrack:" + i);
        this.f327035h.mo152396a(i, j, j2);
    }

    /* renamed from: y */
    public final void mo160475y(List<Boolean> list) {
        C87412m.m108594g(list, "list");
        VLogThumbView vLogThumbView = this.f327035h;
        vLogThumbView.getClass();
        C110499e eVar = vLogThumbView.f317024h;
        eVar.getClass();
        ((ArrayList) eVar.f330417j).clear();
        ((ArrayList) eVar.f330417j).addAll(list);
        vLogThumbView.f317020d.mo17035V0();
    }
}
