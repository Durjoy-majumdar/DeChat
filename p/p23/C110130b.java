package p23;

import ai2.C92007a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ci2.C104379c;
import ci2.C104380d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropViewGroup;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: p23.b */
public final class C110130b extends C99417a implements C109202j.C109204c {

    /* renamed from: f */
    public final EditorPanelHolder f329482f;

    /* renamed from: g */
    public final C13601g f329483g = C36568h.m40985a(new C110135e(this));

    /* renamed from: h */
    public final C13601g f329484h = C36568h.m40985a(new C110136f(this));

    /* renamed from: i */
    public final C13601g f329485i = C36568h.m40985a(new C110131a(this));

    /* renamed from: j */
    public final C13601g f329486j = C36568h.m40985a(new C110133c(this));

    /* renamed from: n */
    public boolean f329487n;

    /* renamed from: o */
    public long f329488o;

    /* renamed from: p */
    public long f329489p;

    /* renamed from: q */
    public long f329490q;

    /* renamed from: r */
    public long f329491r;

    /* renamed from: s */
    public long f329492s;

    /* renamed from: t */
    public C92007a f329493t;

    /* renamed from: u */
    public final C110134d f329494u;

    /* renamed from: p23.b$a */
    public static final class C110131a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C110130b f329495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110131a(C110130b bVar) {
            super(0);
            this.f329495d = bVar;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f329495d.f329483g).getValue()).findViewById(C0966R.C0970id.cbe);
        }
    }

    /* renamed from: p23.b$b */
    public static final class C110132b extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public final /* synthetic */ C110130b f329496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110132b(C110130b bVar) {
            super(0);
            this.f329496d = bVar;
        }

        public Object invoke() {
            return this.f329496d.f329482f.getContext();
        }
    }

    /* renamed from: p23.b$c */
    public static final class C110133c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C110130b f329497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110133c(C110130b bVar) {
            super(0);
            this.f329497d = bVar;
        }

        public Object invoke() {
            return (ImageView) ((ViewGroup) ((C36570n) this.f329497d.f329483g).getValue()).findViewById(C0966R.C0970id.cbf);
        }
    }

    /* renamed from: p23.b$d */
    public static final class C110134d implements TimeCropViewGroup.C106240a {

        /* renamed from: a */
        public final /* synthetic */ C110130b f329498a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f329499b;

        public C110134d(C110130b bVar, C101198e eVar) {
            this.f329498a = bVar;
            this.f329499b = eVar;
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
                p23.b r1 = r5.f329498a
                ai2.a r1 = r1.f329493t
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
                p23.b r1 = r5.f329498a
                ai2.a r1 = r1.f329493t
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
                p23.b r0 = r5.f329498a
                long r1 = r0.f329489p
                int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x006a
                r0.f329489p = r6
                r0.f329490q = r8
                goto L_0x006f
            L_0x006a:
                r0.f329489p = r6
                r0.f329490q = r8
                r6 = r8
            L_0x006f:
                ai2.a r8 = r0.f329493t
                if (r8 == 0) goto L_0x007e
                ci2.d r8 = r8.f263403b
                if (r8 == 0) goto L_0x007e
                long r1 = r0.f329489p
                long r3 = r0.f329490q
                r8.mo146050d(r1, r3)
            L_0x007e:
                qh2.e r8 = r5.f329499b
                qh2.e$b r9 = qh2.C101198e.C101199b.EDIT_VLOG_CHANGE_PLAY_RANGE
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                p23.b r1 = r5.f329498a
                long r2 = r1.f329489p
                java.lang.String r4 = "EDIT_CROP_VLOG_LENGTH_START_TIME_LONG"
                r0.putLong(r4, r2)
                long r1 = r1.f329490q
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
            throw new UnsupportedOperationException("Method not decompiled: p23.C110130b.C110134d.mo138715a(long, long, boolean):void");
        }
    }

    /* renamed from: p23.b$e */
    public static final class C110135e extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C110130b f329500d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110135e(C110130b bVar) {
            super(0);
            this.f329500d = bVar;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f329500d.f329482f.getContext()).inflate(C0966R.C0971layout.ccd, this.f329500d.f329482f, false);
            EditorPanelHolder editorPanelHolder = this.f329500d.f329482f;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            inflate.setOnClickListener(C11802f.f34526d);
            return (ViewGroup) inflate;
        }
    }

    /* renamed from: p23.b$f */
    public static final class C110136f extends C87413o implements C32224a<TimeCropViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C110130b f329501d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110136f(C110130b bVar) {
            super(0);
            this.f329501d = bVar;
        }

        public Object invoke() {
            TimeCropViewGroup timeCropViewGroup = (TimeCropViewGroup) ((ViewGroup) ((C36570n) this.f329501d.f329483g).getValue()).findViewById(C0966R.C0970id.kt_);
            TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
            if (seekSlider != null) {
                seekSlider.mo152216d();
            }
            return timeCropViewGroup;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110130b(EditorPanelHolder editorPanelHolder, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(editorPanelHolder, "holder");
        C87412m.m108594g(eVar, "status");
        this.f329482f = editorPanelHolder;
        C36568h.m40985a(new C110132b(this));
        this.f329494u = new C110134d(this, eVar);
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        mo161542x().setProgress(j);
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f329482f.mo151464b()) {
            return false;
        }
        this.f329482f.setShow(false);
        return true;
    }

    public void onFinish() {
    }

    public void setVisibility(int i) {
        if (i == 8) {
            this.f329482f.setShow(false);
        }
    }

    /* renamed from: x */
    public final TimeCropViewGroup mo161542x() {
        return (TimeCropViewGroup) ((C36570n) this.f329484h).getValue();
    }

    /* renamed from: y */
    public final void mo161543y(C92007a aVar) {
        this.f329493t = aVar;
    }

    /* renamed from: z */
    public final void mo161544z(C96552p0 p0Var) {
        C87412m.m108594g(p0Var, "composition");
        C92007a aVar = this.f329493t;
        if (aVar != null) {
            if (!this.f329487n) {
                this.f329487n = true;
                this.f329482f.setCloseTouchOutside(true);
                mo161542x().setCallback(this.f329494u);
                mo161542x().setRealTimeCallback(this.f329494u);
                this.f329482f.setOnVisibleChangeCallback(new C110137c(this));
                ((ImageView) ((C36570n) this.f329485i).getValue()).setOnClickListener(new C110138d(this));
                ((ImageView) ((C36570n) this.f329486j).getValue()).setOnClickListener(new C110139e(this));
            }
            long j = (long) 1000;
            long startUs = p0Var.mo134614k().getStartUs() / j;
            this.f329488o = p0Var.mo134614k().getEndUs() / j;
            long b = aVar.f263404c.mo146048b();
            long j2 = this.f329488o;
            if (b > j2) {
                C104379c cVar = aVar.f263404c.f309019b;
                cVar.mo146046c(cVar.f309015c + (j2 - cVar.mo146044a()));
            }
            this.f329489p = aVar.f263404c.mo146049c();
            long b2 = aVar.f263404c.mo146048b();
            this.f329490q = b2;
            this.f329491r = this.f329489p;
            this.f329492s = b2;
            C104380d dVar = new C104380d(0, false, 3, (C8480h) null);
            dVar.mo146050d(this.f329491r, this.f329492s);
            aVar.f263403b = dVar;
            Log.m105924i("MicroMsg.VLogTimeEditPlugin", "time range:" + aVar.f263404c);
            TimeCropViewGroup x = mo161542x();
            C92007a aVar2 = this.f329493t;
            C87412m.m108591d(aVar2);
            long c = aVar2.f263404c.mo146049c();
            C92007a aVar3 = this.f329493t;
            C87412m.m108591d(aVar3);
            x.mo152236b(p0Var, c, aVar3.f263404c.mo146048b());
            this.f329482f.setShow(true);
        }
    }
}
