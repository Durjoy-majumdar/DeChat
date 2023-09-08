package v23;

import ai2.C92007a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropViewGroup;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: v23.i */
public final class C111353i extends C99417a implements C109202j.C109204c {

    /* renamed from: f */
    public final EditorPanelHolder f333372f;

    /* renamed from: g */
    public final C13601g f333373g = C36568h.m40985a(new C111358e(this));

    /* renamed from: h */
    public final C13601g f333374h = C36568h.m40985a(new C111359f(this));

    /* renamed from: i */
    public final C13601g f333375i = C36568h.m40985a(new C111354a(this));

    /* renamed from: j */
    public final C13601g f333376j = C36568h.m40985a(new C111356c(this));

    /* renamed from: n */
    public boolean f333377n;

    /* renamed from: o */
    public long f333378o;

    /* renamed from: p */
    public long f333379p;

    /* renamed from: q */
    public long f333380q;

    /* renamed from: r */
    public long f333381r;

    /* renamed from: s */
    public long f333382s;

    /* renamed from: t */
    public C92007a f333383t;

    /* renamed from: u */
    public final C111357d f333384u;

    /* renamed from: v23.i$a */
    public static final class C111354a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111353i f333385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111354a(C111353i iVar) {
            super(0);
            this.f333385d = iVar;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f333385d.f333373g).getValue()).findViewById(C0966R.C0970id.cbe);
        }
    }

    /* renamed from: v23.i$b */
    public static final class C111355b extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public final /* synthetic */ C111353i f333386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111355b(C111353i iVar) {
            super(0);
            this.f333386d = iVar;
        }

        public Object invoke() {
            return this.f333386d.f333372f.getContext();
        }
    }

    /* renamed from: v23.i$c */
    public static final class C111356c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111353i f333387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111356c(C111353i iVar) {
            super(0);
            this.f333387d = iVar;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f333387d.f333373g).getValue()).findViewById(C0966R.C0970id.cbf);
        }
    }

    /* renamed from: v23.i$d */
    public static final class C111357d implements TimeCropViewGroup.C106240a {

        /* renamed from: a */
        public final /* synthetic */ C111353i f333388a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f333389b;

        public C111357d(C111353i iVar, C101198e eVar) {
            this.f333388a = iVar;
            this.f333389b = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
            r1 = r1.f263404c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo138715a(long r6, long r8, boolean r10) {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onCropCallback: ["
                r0.append(r1)
                r0.append(r6)
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r1 = "], onUp:"
                r0.append(r1)
                r0.append(r10)
                java.lang.String r1 = ", showTime start:"
                r0.append(r1)
                v23.i r1 = r5.f333388a
                ai2.a r1 = r1.f333383t
                r2 = 0
                if (r1 == 0) goto L_0x0036
                ci2.d r1 = r1.f263404c
                if (r1 == 0) goto L_0x0036
                long r3 = r1.mo146049c()
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                goto L_0x0037
            L_0x0036:
                r1 = r2
            L_0x0037:
                r0.append(r1)
                java.lang.String r1 = " end:"
                r0.append(r1)
                v23.i r1 = r5.f333388a
                ai2.a r1 = r1.f333383t
                if (r1 == 0) goto L_0x0051
                ci2.d r1 = r1.f263404c
                if (r1 == 0) goto L_0x0051
                long r1 = r1.mo146048b()
                java.lang.Long r2 = java.lang.Long.valueOf(r1)
            L_0x0051:
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.VLogTimeEditPlugin"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                v23.i r0 = r5.f333388a
                long r1 = r0.f333379p
                int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x006a
                r0.f333379p = r6
                r0.f333380q = r8
                goto L_0x006f
            L_0x006a:
                r0.f333379p = r6
                r0.f333380q = r8
                r6 = r8
            L_0x006f:
                ai2.a r8 = r0.f333383t
                if (r8 == 0) goto L_0x007e
                ci2.d r8 = r8.f263403b
                if (r8 == 0) goto L_0x007e
                long r1 = r0.f333379p
                long r3 = r0.f333380q
                r8.mo146050d(r1, r3)
            L_0x007e:
                qh2.e r8 = r5.f333389b
                qh2.e$b r9 = qh2.C101198e.C101199b.EDIT_VLOG_CHANGE_PLAY_RANGE
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                v23.i r1 = r5.f333388a
                long r2 = r1.f333379p
                java.lang.String r4 = "EDIT_CROP_VLOG_LENGTH_START_TIME_LONG"
                r0.putLong(r4, r2)
                long r1 = r1.f333380q
                java.lang.String r3 = "EDIT_CROP_VLOG_LENGTH_END_TIME_LONG"
                r0.putLong(r3, r1)
                java.lang.String r1 = "EDIT_CROP_VLOG_SEEKTIME_LONG"
                r0.putLong(r1, r6)
                java.lang.String r6 = "EDIT_CROP_VLOG_ON_UP_BOOLEAN"
                r0.putBoolean(r6, r10)
                rx3.b0 r6 = rx3.C13598b0.f38549a
                r8.mo14585p(r9, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v23.C111353i.C111357d.mo138715a(long, long, boolean):void");
        }
    }

    /* renamed from: v23.i$e */
    public static final class C111358e extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C111353i f333390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111358e(C111353i iVar) {
            super(0);
            this.f333390d = iVar;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f333390d.f333372f.getContext()).inflate(C0966R.C0971layout.ccd, this.f333390d.f333372f, false);
            EditorPanelHolder editorPanelHolder = this.f333390d.f333372f;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            inflate.setOnClickListener(C14407m.f39995d);
            return (ViewGroup) inflate;
        }
    }

    /* renamed from: v23.i$f */
    public static final class C111359f extends C87413o implements C32224a<TimeCropViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C111353i f333391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111359f(C111353i iVar) {
            super(0);
            this.f333391d = iVar;
        }

        public Object invoke() {
            TimeCropViewGroup timeCropViewGroup = (TimeCropViewGroup) ((ViewGroup) ((C36570n) this.f333391d.f333373g).getValue()).findViewById(C0966R.C0970id.kt_);
            TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
            if (seekSlider != null) {
                seekSlider.mo152216d();
            }
            return timeCropViewGroup;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111353i(EditorPanelHolder editorPanelHolder, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(editorPanelHolder, "holder");
        C87412m.m108594g(eVar, "status");
        this.f333372f = editorPanelHolder;
        C36568h.m40985a(new C111355b(this));
        this.f333384u = new C111357d(this, eVar);
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        mo163032x().getVisibility();
        mo163032x().setProgress(j);
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f333372f.mo151464b()) {
            return false;
        }
        this.f333372f.setShow(false);
        return true;
    }

    public void onFinish() {
    }

    public void setVisibility(int i) {
        if (i == 8) {
            this.f333372f.setShow(false);
        }
    }

    /* renamed from: x */
    public final TimeCropViewGroup mo163032x() {
        return (TimeCropViewGroup) ((C36570n) this.f333374h).getValue();
    }
}
