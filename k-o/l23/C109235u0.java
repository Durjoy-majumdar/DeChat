package l23;

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
import java.util.List;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C110801c;
import sx3.C26236u;

/* renamed from: l23.u0 */
public final class C109235u0 extends C99417a implements C109202j.C109204c {

    /* renamed from: f */
    public final EditorPanelHolder f327042f;

    /* renamed from: g */
    public final String f327043g = "MicroMsg.VLogTrackEditPlugin";

    /* renamed from: h */
    public final C13601g f327044h = C36568h.m40985a(new C109240e(this));

    /* renamed from: i */
    public final C13601g f327045i = C36568h.m40985a(new C109241f(this));

    /* renamed from: j */
    public final C13601g f327046j = C36568h.m40985a(new C109237b(this));

    /* renamed from: n */
    public final C13601g f327047n = C36568h.m40985a(new C109236a(this));

    /* renamed from: o */
    public final C13601g f327048o = C36568h.m40985a(new C109238c(this));

    /* renamed from: p */
    public boolean f327049p;

    /* renamed from: q */
    public boolean f327050q;

    /* renamed from: r */
    public long f327051r;

    /* renamed from: s */
    public long f327052s;

    /* renamed from: t */
    public float f327053t = 1.0f;

    /* renamed from: u */
    public long f327054u;

    /* renamed from: v */
    public long f327055v;

    /* renamed from: w */
    public long f327056w;

    /* renamed from: x */
    public C109202j.C99301e f327057x;

    /* renamed from: y */
    public C109202j.C99301e f327058y;

    /* renamed from: z */
    public final C109239d f327059z;

    /* renamed from: l23.u0$a */
    public static final class C109236a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109235u0 f327060d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109236a(C109235u0 u0Var) {
            super(0);
            this.f327060d = u0Var;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f327060d.f327044h).getValue()).findViewById(C0966R.C0970id.l_f);
        }
    }

    /* renamed from: l23.u0$b */
    public static final class C109237b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C109235u0 f327061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109237b(C109235u0 u0Var) {
            super(0);
            this.f327061d = u0Var;
        }

        public Object invoke() {
            return (TextView) ((ViewGroup) ((C36570n) this.f327061d.f327044h).getValue()).findViewById(C0966R.C0970id.l_j);
        }
    }

    /* renamed from: l23.u0$c */
    public static final class C109238c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109235u0 f327062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109238c(C109235u0 u0Var) {
            super(0);
            this.f327062d = u0Var;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f327062d.f327044h).getValue()).findViewById(C0966R.C0970id.l_g);
        }
    }

    /* renamed from: l23.u0$d */
    public static final class C109239d implements TrackCropView.C106280a {

        /* renamed from: a */
        public final /* synthetic */ C109235u0 f327063a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f327064b;

        public C109239d(C109235u0 u0Var, C101198e eVar) {
            this.f327063a = u0Var;
            this.f327064b = eVar;
        }

        /* renamed from: b */
        public void mo152361b(long j, long j2) {
            String str = this.f327063a.f327043g;
            Log.m105924i(str, "onScrollStateChanged: " + j + ", " + j2);
            Bundle bundle = new Bundle();
            C109235u0 u0Var = this.f327063a;
            u0Var.f327054u = j;
            u0Var.f327055v = j2;
            u0Var.mo160477z();
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j2);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", true);
            this.f327064b.mo14585p(C101198e.C101199b.EDIT_VLOG_TRACK_CROP, bundle);
            C109202j.C99301e eVar = this.f327063a.f327057x;
            if (eVar != null) {
                eVar.resume();
            }
        }

        /* renamed from: c */
        public void mo152362c(long j, long j2) {
            C109235u0 u0Var = this.f327063a;
            u0Var.f327054u = j;
            u0Var.f327055v = j2;
            u0Var.mo160477z();
        }

        public void pause() {
            C109202j.C99301e eVar = this.f327063a.f327057x;
            if (eVar != null) {
                eVar.pause();
            }
            C109202j.C99301e eVar2 = this.f327063a.f327058y;
            if (eVar2 != null) {
                eVar2.pause();
            }
        }

        public void seekTo(long j) {
            C109202j.C99301e eVar = this.f327063a.f327057x;
            if (eVar != null) {
                C109202j.C99301e.C99302a.m129467a(eVar, j, (Object) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: l23.u0$e */
    public static final class C109240e extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C109235u0 f327065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109240e(C109235u0 u0Var) {
            super(0);
            this.f327065d = u0Var;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f327065d.f327042f.getContext()).inflate(C0966R.C0971layout.cce, this.f327065d.f327042f, false);
            EditorPanelHolder editorPanelHolder = this.f327065d.f327042f;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            return (ViewGroup) inflate;
        }
    }

    /* renamed from: l23.u0$f */
    public static final class C109241f extends C87413o implements C32224a<TrackCropView> {

        /* renamed from: d */
        public final /* synthetic */ C109235u0 f327066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109241f(C109235u0 u0Var) {
            super(0);
            this.f327066d = u0Var;
        }

        public Object invoke() {
            return (TrackCropView) ((ViewGroup) ((C36570n) this.f327066d.f327044h).getValue()).findViewById(C0966R.C0970id.kt_);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109235u0(EditorPanelHolder editorPanelHolder, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(editorPanelHolder, "holder");
        C87412m.m108594g(eVar, "status");
        this.f327042f = editorPanelHolder;
        this.f327059z = new C109239d(this, eVar);
    }

    /* renamed from: y */
    public static void m148334y(C109235u0 u0Var, C106205q0 q0Var, boolean z, long j, int i, Object obj) {
        C109235u0 u0Var2 = u0Var;
        C106205q0 q0Var2 = q0Var;
        boolean z2 = (i & 2) != 0 ? false : z;
        long j2 = (i & 4) != 0 ? MAlarmHandler.NEXT_FIRE_INTERVAL : j;
        u0Var.getClass();
        C87412m.m108594g(q0Var2, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        if (z2) {
            long j3 = u0Var2.f327055v;
            if (j3 != 0) {
                u0Var2.f327059z.mo152361b(u0Var2.f327054u, j3);
                return;
            }
        }
        u0Var2.f327050q = false;
        if (!u0Var2.f327049p) {
            u0Var2.f327049p = true;
            u0Var2.f327042f.setCloseTouchOutside(false);
            u0Var.mo160476x().setCallback(u0Var2.f327059z);
            ImageView imageView = (ImageView) ((C36570n) u0Var2.f327047n).getValue();
            if (imageView != null) {
                imageView.setOnClickListener(new C109242v0(u0Var2));
            }
            ImageView imageView2 = (ImageView) ((C36570n) u0Var2.f327048o).getValue();
            if (imageView2 != null) {
                imageView2.setOnClickListener(new C109243w0(u0Var2));
            }
            u0Var2.f327042f.setOnVisibleChangeCallback(new C109244x0(u0Var2));
        }
        C106205q0 q0Var3 = new C106205q0(q0Var2.f316490a, q0Var2.f316491b, 0, 4, (C8480h) null);
        q0Var3.mo81188b(q0Var2.f316501l.f331470h);
        C110801c cVar = q0Var2.f316501l;
        q0Var3.mo81187a((long) (((float) cVar.f331470h) / cVar.f331468f));
        q0Var3.mo152162m(q0Var2.f316501l.f331468f);
        C110801c cVar2 = q0Var3.f316501l;
        cVar2.f331478p = 0;
        cVar2.f331479q = cVar2.f331465c;
        cVar2.mo162370h();
        C110801c cVar3 = q0Var2.f316501l;
        long j4 = cVar3.f331464b;
        u0Var2.f327051r = cVar3.f331466d;
        long min = Math.min(cVar3.f331467e, j2);
        u0Var2.f327052s = min;
        C110801c cVar4 = q0Var2.f316501l;
        float f = cVar4.f331468f;
        u0Var2.f327053t = f;
        u0Var2.f327054u = (long) (((float) u0Var2.f327051r) / f);
        u0Var2.f327055v = (long) (((float) min) / f);
        u0Var2.f327056w = cVar4.f331470h;
        C96552p0 p0Var = new C96552p0((List<C106205q0>) C26236u.m33719b(q0Var3));
        float f2 = q0Var2.f316501l.f331468f;
        p0Var.mo81182a((long) (((float) u0Var2.f327051r) / f2), (long) (((float) u0Var2.f327052s) / f2));
        TrackCropView x = u0Var.mo160476x();
        C87412m.m108593f(x, "trackCropView");
        TrackCropView.m143018b(x, p0Var, 0, 0, 6, (Object) null);
        u0Var2.f327042f.setShow(true);
        u0Var.mo160477z();
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        if (this.f327042f.mo151464b()) {
            mo160476x().setProgress(j);
        }
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f327042f.mo151464b()) {
            return false;
        }
        this.f327050q = false;
        this.f327042f.setShow(false);
        return true;
    }

    public void onFinish() {
    }

    public void setVisibility(int i) {
        if (i == 8) {
            this.f327050q = false;
            this.f327042f.setShow(false);
        }
    }

    /* renamed from: x */
    public final TrackCropView mo160476x() {
        return (TrackCropView) ((C36570n) this.f327045i).getValue();
    }

    /* renamed from: z */
    public final void mo160477z() {
        Math.round((((float) this.f327056w) / this.f327053t) / 1000.0f);
        int round = Math.round(((float) (this.f327055v - this.f327054u)) / 1000.0f);
        ((TextView) ((C36570n) this.f327046j).getValue()).setText(this.f327042f.getContext().getString(C0966R.string.kbp, new Object[]{Integer.valueOf(round)}));
    }
}
