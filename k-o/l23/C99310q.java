package l23;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropViewGroup;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import l23.C109202j;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: l23.q */
public final class C99310q implements C109344g0, C109202j.C109204c {

    /* renamed from: d */
    public final EditorPanelHolder f291213d;

    /* renamed from: e */
    public final C101198e f291214e;

    /* renamed from: f */
    public C109202j.C99301e f291215f;

    /* renamed from: g */
    public final C13601g f291216g = C36568h.m40985a(new C99315e(this));

    /* renamed from: h */
    public final C13601g f291217h = C36568h.m40985a(new C99316f(this));

    /* renamed from: i */
    public final C13601g f291218i = C36568h.m40985a(new C99312b(this));

    /* renamed from: j */
    public final C13601g f291219j = C36568h.m40985a(new C99313c(this));

    /* renamed from: n */
    public boolean f291220n;

    /* renamed from: o */
    public long f291221o;

    /* renamed from: p */
    public long f291222p;

    /* renamed from: q */
    public long f291223q;

    /* renamed from: r */
    public long f291224r;

    /* renamed from: s */
    public C99311a f291225s;

    /* renamed from: t */
    public final C99314d f291226t = new C99314d(this);

    /* renamed from: l23.q$a */
    public interface C99311a {
        /* renamed from: a */
        void mo138697a();

        /* renamed from: b */
        void mo138698b(long j, long j2);

        /* renamed from: c */
        void mo138699c();

        void onFinish();
    }

    /* renamed from: l23.q$b */
    public static final class C99312b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C99310q f291227d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99312b(C99310q qVar) {
            super(0);
            this.f291227d = qVar;
        }

        public Object invoke() {
            return this.f291227d.mo138711a().findViewById(C0966R.C0970id.gk6);
        }
    }

    /* renamed from: l23.q$c */
    public static final class C99313c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C99310q f291228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99313c(C99310q qVar) {
            super(0);
            this.f291228d = qVar;
        }

        public Object invoke() {
            return this.f291228d.mo138711a().findViewById(C0966R.C0970id.gk7);
        }
    }

    /* renamed from: l23.q$d */
    public static final class C99314d implements TimeCropViewGroup.C106240a {

        /* renamed from: a */
        public final /* synthetic */ C99310q f291229a;

        public C99314d(C99310q qVar) {
            this.f291229a = qVar;
        }

        /* renamed from: a */
        public void mo138715a(long j, long j2, boolean z) {
            long j3;
            C99310q qVar = this.f291229a;
            if (qVar.f291223q != j) {
                qVar.f291223q = j;
                qVar.f291224r = j2;
                j3 = j;
            } else {
                qVar.f291223q = j;
                qVar.f291224r = j2;
                j3 = j2;
            }
            C101198e eVar = qVar.f291214e;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_VLOG_CHANGE_PLAY_RANGE;
            Bundle bundle = new Bundle();
            C99310q qVar2 = this.f291229a;
            bundle.putLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG", qVar2.f291223q);
            bundle.putLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG", qVar2.f291224r);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar.mo14585p(bVar, bundle);
            if (z) {
                C99311a aVar = this.f291229a.f291225s;
                if (aVar != null) {
                    aVar.mo138698b(j, j2);
                }
                C99310q qVar3 = this.f291229a;
                C109202j.C99301e eVar2 = qVar3.f291215f;
                if (eVar2 != null) {
                    C109202j.C99301e.C99302a.m129467a(eVar2, qVar3.f291223q, (Object) null, 2, (Object) null);
                }
                C109202j.C99301e eVar3 = this.f291229a.f291215f;
                if (eVar3 != null) {
                    eVar3.resume();
                    return;
                }
                return;
            }
            C99311a aVar2 = this.f291229a.f291225s;
            if (aVar2 != null) {
                aVar2.mo138699c();
            }
            C109202j.C99301e eVar4 = this.f291229a.f291215f;
            if (eVar4 != null) {
                eVar4.pause();
            }
            C109202j.C99301e eVar5 = this.f291229a.f291215f;
            if (eVar5 != null) {
                C109202j.C99301e.C99302a.m129467a(eVar5, j3, (Object) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: l23.q$e */
    public static final class C99315e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C99310q f291230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99315e(C99310q qVar) {
            super(0);
            this.f291230d = qVar;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f291230d.f291213d.getContext()).inflate(C0966R.C0971layout.a0n, this.f291230d.f291213d, false);
            EditorPanelHolder editorPanelHolder = this.f291230d.f291213d;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            return inflate;
        }
    }

    /* renamed from: l23.q$f */
    public static final class C99316f extends C87413o implements C32224a<TimeCropViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C99310q f291231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99316f(C99310q qVar) {
            super(0);
            this.f291231d = qVar;
        }

        public Object invoke() {
            TimeCropViewGroup timeCropViewGroup = (TimeCropViewGroup) this.f291231d.mo138711a().findViewById(C0966R.C0970id.kt_);
            TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
            if (seekSlider != null) {
                seekSlider.mo152216d();
            }
            return timeCropViewGroup;
        }
    }

    public C99310q(EditorPanelHolder editorPanelHolder, C101198e eVar) {
        C87412m.m108594g(editorPanelHolder, "holder");
        C87412m.m108594g(eVar, "status");
        this.f291213d = editorPanelHolder;
        this.f291214e = eVar;
    }

    /* renamed from: a */
    public final View mo138711a() {
        return (View) ((C36570n) this.f291216g).getValue();
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        ((TimeCropViewGroup) ((C36570n) this.f291217h).getValue()).setProgress(j);
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
        this.f291215f = eVar;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f291213d.mo151464b()) {
            return false;
        }
        C99311a aVar = this.f291225s;
        if (aVar != null) {
            aVar.onFinish();
        }
        this.f291213d.setShow(false);
        return true;
    }

    public String name() {
        return C99310q.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onFinish() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (i == 8) {
            C99311a aVar = this.f291225s;
            if (aVar != null) {
                aVar.onFinish();
            }
            this.f291213d.setShow(false);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
