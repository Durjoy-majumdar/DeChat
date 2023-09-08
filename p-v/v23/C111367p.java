package v23;

import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import gy3.C87412m;
import java.util.LinkedList;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import sp3.C110807k;
import wp3.C111823a;

/* renamed from: v23.p */
public final class C111367p extends C99417a implements C111823a {

    /* renamed from: f */
    public VideoCompositionPlayView f333403f;

    /* renamed from: g */
    public final LinkedList<C109202j.C99300b> f333404g = new LinkedList<>();

    /* renamed from: h */
    public final C111368a f333405h;

    /* renamed from: i */
    public C109202j.C99301e f333406i;

    /* renamed from: j */
    public C110807k f333407j;

    /* renamed from: v23.p$a */
    public static final class C111368a implements C109202j.C99301e {

        /* renamed from: d */
        public final /* synthetic */ C111367p f333408d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f333409e;

        public C111368a(C111367p pVar, C101198e eVar) {
            this.f333408d = pVar;
            this.f333409e = eVar;
        }

        /* renamed from: k */
        public void mo138704k(long j, Object obj) {
            C115669n.INSTANCE.mo175912v(1468, 0);
            this.f333408d.f333403f.mo154762i(j);
        }

        public void pause() {
            C101198e.C62622a.m73576a(this.f333409e, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
        }

        public void resume() {
            C101198e.C62622a.m73576a(this.f333409e, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111367p(VideoCompositionPlayView videoCompositionPlayView, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(videoCompositionPlayView, "playView");
        C87412m.m108594g(eVar, "status");
        this.f333403f = videoCompositionPlayView;
        this.f333405h = new C111368a(this, eVar);
        this.f333403f.setPlayerCallback(this);
    }

    /* renamed from: A */
    public static void m151846A(C111367p pVar, C110807k kVar, boolean z, boolean z2, long j, int i, Object obj) {
        boolean z3 = (i & 2) != 0 ? true : z;
        boolean z4 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            j = -1;
        }
        long j2 = j;
        if (kVar != null) {
            pVar.f333407j = kVar;
            pVar.f333403f.mo154765l(kVar, z3, z4, j2);
            return;
        }
        pVar.getClass();
    }

    /* renamed from: b */
    public void mo79528b(long j) {
        for (C109202j.C99300b bVar : this.f333404g) {
            if (bVar instanceof C109202j.C109204c) {
                ((C109202j.C109204c) bVar).mo138712c(j);
            }
        }
    }

    /* renamed from: h */
    public void mo79529h() {
    }

    /* renamed from: i */
    public void mo79530i() {
        for (C109202j.C99300b bVar : this.f333404g) {
            if (bVar instanceof C109202j.C109204c) {
                ((C109202j.C109204c) bVar).onFinish();
            }
        }
    }

    /* renamed from: o */
    public void mo79531o() {
        for (C109202j.C99300b bVar : this.f333404g) {
            if (bVar instanceof C109202j.C109204c) {
                ((C109202j.C109204c) bVar).mo138713d(this.f333405h);
            }
        }
        long position = this.f333403f.getPosition();
        C110807k kVar = this.f333407j;
        long k = position - ((kVar != null ? kVar.mo162388k() : 0) / ((long) 1000));
        C109202j.C99301e eVar = this.f333406i;
        if (eVar != null) {
            C109202j.C99301e.C99302a.m129467a(eVar, k, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: r */
    public void mo79532r() {
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.FIRST_FRAME_RENDER, (Bundle) null, 2, (Object) null);
    }

    public void release() {
        this.f333404g.clear();
    }

    /* renamed from: u */
    public void mo79533u() {
    }

    /* renamed from: x */
    public final void mo163038x(C109202j.C99300b bVar) {
        C87412m.m108594g(bVar, "callback");
        if (!this.f333404g.contains(bVar)) {
            this.f333404g.add(bVar);
        }
    }

    /* renamed from: y */
    public final void mo163039y(long j) {
        Log.m105924i("MicroMsg.TimelineEditorPreviewPlugin", "seek to " + j);
        this.f333403f.mo154762i(j);
    }

    /* renamed from: z */
    public final void mo163040z(long j, long j2) {
        this.f333403f.mo154764j(j, j2);
    }
}
