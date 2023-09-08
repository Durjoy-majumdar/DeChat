package v23;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.thumb.TrackCropView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.List;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C110801c;
import sx3.C26236u;

/* renamed from: v23.t */
public final class C111369t extends C99417a implements C109202j.C109204c {

    /* renamed from: f */
    public final EditorPanelHolder f333410f;

    /* renamed from: g */
    public final String f333411g = "MicroMsg.VLogTrackEditPlugin";

    /* renamed from: h */
    public final C13601g f333412h = C36568h.m40985a(new C111374e(this));

    /* renamed from: i */
    public final C13601g f333413i = C36568h.m40985a(new C111375f(this));

    /* renamed from: j */
    public final C13601g f333414j = C36568h.m40985a(new C111371b(this));

    /* renamed from: n */
    public final C13601g f333415n = C36568h.m40985a(new C111370a(this));

    /* renamed from: o */
    public final C13601g f333416o = C36568h.m40985a(new C111372c(this));

    /* renamed from: p */
    public boolean f333417p;

    /* renamed from: q */
    public long f333418q;

    /* renamed from: r */
    public long f333419r;

    /* renamed from: s */
    public long f333420s;

    /* renamed from: t */
    public long f333421t;

    /* renamed from: u */
    public long f333422u;

    /* renamed from: v */
    public final C111373d f333423v;

    /* renamed from: v23.t$a */
    public static final class C111370a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111369t f333424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111370a(C111369t tVar) {
            super(0);
            this.f333424d = tVar;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f333424d.f333412h).getValue()).findViewById(C0966R.C0970id.l_f);
        }
    }

    /* renamed from: v23.t$b */
    public static final class C111371b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C111369t f333425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111371b(C111369t tVar) {
            super(0);
            this.f333425d = tVar;
        }

        public Object invoke() {
            return (TextView) ((ViewGroup) ((C36570n) this.f333425d.f333412h).getValue()).findViewById(C0966R.C0970id.l_j);
        }
    }

    /* renamed from: v23.t$c */
    public static final class C111372c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111369t f333426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111372c(C111369t tVar) {
            super(0);
            this.f333426d = tVar;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f333426d.f333412h).getValue()).findViewById(C0966R.C0970id.l_g);
        }
    }

    /* renamed from: v23.t$d */
    public static final class C111373d implements TrackCropView.C106280a {

        /* renamed from: a */
        public final /* synthetic */ C111369t f333427a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f333428b;

        public C111373d(C111369t tVar, C101198e eVar) {
            this.f333427a = tVar;
            this.f333428b = eVar;
        }

        /* renamed from: b */
        public void mo152361b(long j, long j2) {
            String str = this.f333427a.f333411g;
            Log.m105924i(str, "onScrollStateChanged: " + j + ", " + j2);
            Bundle bundle = new Bundle();
            C111369t tVar = this.f333427a;
            tVar.f333420s = j;
            tVar.f333421t = j2;
            tVar.mo163041y();
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j2);
            this.f333428b.mo14585p(C101198e.C101199b.EDIT_VLOG_TRACK_CROP, bundle);
        }

        /* renamed from: c */
        public void mo152362c(long j, long j2) {
            C111369t tVar = this.f333427a;
            tVar.f333420s = j;
            tVar.f333421t = j2;
            tVar.mo163041y();
        }

        public void pause() {
            C101198e.C62622a.m73576a(this.f333428b, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
        }

        public void seekTo(long j) {
            long currentTimeMillis = System.currentTimeMillis();
            C111369t tVar = this.f333427a;
            if (currentTimeMillis - tVar.f333422u > 15) {
                tVar.f333422u = System.currentTimeMillis();
                Bundle bundle = new Bundle();
                bundle.putLong("PARAM_1_LONG", j);
                this.f333428b.mo14585p(C101198e.C101199b.EDIT_VIDEO_SEEK, bundle);
            }
        }
    }

    /* renamed from: v23.t$e */
    public static final class C111374e extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C111369t f333429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111374e(C111369t tVar) {
            super(0);
            this.f333429d = tVar;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f333429d.f333410f.getContext()).inflate(C0966R.C0971layout.cce, this.f333429d.f333410f, false);
            EditorPanelHolder editorPanelHolder = this.f333429d.f333410f;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            return (ViewGroup) inflate;
        }
    }

    /* renamed from: v23.t$f */
    public static final class C111375f extends C87413o implements C32224a<TrackCropView> {

        /* renamed from: d */
        public final /* synthetic */ C111369t f333430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111375f(C111369t tVar) {
            super(0);
            this.f333430d = tVar;
        }

        public Object invoke() {
            return (TrackCropView) ((ViewGroup) ((C36570n) this.f333430d.f333412h).getValue()).findViewById(C0966R.C0970id.kt_);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111369t(EditorPanelHolder editorPanelHolder, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(editorPanelHolder, "holder");
        C87412m.m108594g(eVar, "status");
        this.f333410f = editorPanelHolder;
        this.f333423v = new C111373d(this, eVar);
    }

    /* renamed from: x */
    public static void m151857x(C111369t tVar, C110801c cVar, boolean z, long j, int i, Object obj) {
        C111369t tVar2 = tVar;
        C110801c cVar2 = cVar;
        boolean z2 = (i & 2) != 0 ? false : z;
        long j2 = (i & 4) != 0 ? MAlarmHandler.NEXT_FIRE_INTERVAL : j;
        tVar.getClass();
        C87412m.m108594g(cVar2, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        if (z2) {
            long j3 = tVar2.f333421t;
            if (j3 != 0) {
                tVar2.f333423v.mo152361b(tVar2.f333420s, j3);
                return;
            }
        }
        if (!tVar2.f333417p) {
            tVar2.f333417p = true;
            tVar2.f333410f.setCloseTouchOutside(false);
            ((TrackCropView) ((C36570n) tVar2.f333413i).getValue()).setCallback(tVar2.f333423v);
            ImageView imageView = (ImageView) ((C36570n) tVar2.f333415n).getValue();
            if (imageView != null) {
                imageView.setOnClickListener(new C111376u(tVar2));
            }
            ImageView imageView2 = (ImageView) ((C36570n) tVar2.f333416o).getValue();
            if (imageView2 != null) {
                imageView2.setOnClickListener(new C111377v(tVar2));
            }
            tVar2.f333410f.setOnVisibleChangeCallback(new C111378w(tVar2));
        }
        C106205q0 q0Var = new C106205q0(cVar2.f331482t, cVar2.f331483u, 0, 4, (C8480h) null);
        q0Var.mo81188b(cVar2.f331470h);
        q0Var.mo81187a((long) (((float) cVar2.f331470h) / cVar2.f331468f));
        q0Var.mo152162m(cVar2.f331468f);
        C110801c cVar3 = q0Var.f316501l;
        cVar3.f331478p = 0;
        cVar3.f331479q = cVar3.f331465c;
        cVar3.mo162370h();
        tVar2.f333418q = cVar2.f331466d;
        long min = Math.min(cVar2.f331467e, j2);
        tVar2.f333419r = min;
        float f = cVar2.f331468f;
        tVar2.f333420s = (long) (((float) tVar2.f333418q) / f);
        tVar2.f333421t = (long) (((float) min) / f);
        C96552p0 p0Var = new C96552p0((List<C106205q0>) C26236u.m33719b(q0Var));
        float f2 = cVar2.f331468f;
        p0Var.mo81182a((long) (((float) tVar2.f333418q) / f2), (long) (((float) tVar2.f333419r) / f2));
        TrackCropView trackCropView = (TrackCropView) ((C36570n) tVar2.f333413i).getValue();
        C87412m.m108593f(trackCropView, "trackCropView");
        TrackCropView.m143018b(trackCropView, p0Var, 0, 0, 6, (Object) null);
        tVar2.f333410f.setShow(true);
        tVar.mo163041y();
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        if (this.f333410f.mo151464b()) {
            ((TrackCropView) ((C36570n) this.f333413i).getValue()).setProgress(j);
        }
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f333410f.mo151464b()) {
            return false;
        }
        this.f333410f.setShow(false);
        return true;
    }

    public void onFinish() {
    }

    public void setVisibility(int i) {
        if (i == 8) {
            this.f333410f.setShow(false);
        }
    }

    /* renamed from: y */
    public final void mo163041y() {
        int b = C60641c.m70921b(((float) (this.f333421t - this.f333420s)) / 1000.0f);
        ((TextView) ((C36570n) this.f333414j).getValue()).setText(this.f333410f.getContext().getString(C0966R.string.kbp, new Object[]{Integer.valueOf(b)}));
    }
}
