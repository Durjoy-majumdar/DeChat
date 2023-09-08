package kl1;

import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kl1.C10289a;
import kotlin.Result;
import org.libpag.PAGComposition;
import org.libpag.PAGFile;
import org.libpag.PAGImage;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;

/* renamed from: kl1.d */
public final class C10305d {

    /* renamed from: a */
    public final C10333o f31408a;

    /* renamed from: b */
    public final C10306a f31409b;

    /* renamed from: c */
    public final String f31410c = ("Finder.LiveCommentPlugin_BulletNew_Animation" + hashCode());

    /* renamed from: d */
    public C53973z1 f31411d;

    /* renamed from: e */
    public C10289a f31412e;

    /* renamed from: f */
    public long f31413f;

    /* renamed from: g */
    public final C13601g f31414g = C36568h.m40985a(C10315j.f31431d);

    /* renamed from: h */
    public final C13601g f31415h = C36568h.m40985a(new C10313h(this));

    /* renamed from: i */
    public final C13601g f31416i = C36568h.m40985a(new C10314i(this));

    /* renamed from: j */
    public final C13601g f31417j = C36568h.m40985a(new C10309d(this));

    /* renamed from: k */
    public final C13601g f31418k = C36568h.m40985a(new C10308c(this));

    /* renamed from: l */
    public final C13601g f31419l = C36568h.m40985a(new C10311f(this));

    /* renamed from: m */
    public final C13601g f31420m = C36568h.m40985a(new C10312g(this));

    /* renamed from: n */
    public final C13601g f31421n = C36568h.m40985a(new C10310e(this));

    /* renamed from: o */
    public final C13601g f31422o = C36568h.m40985a(new C10307b(this));

    /* renamed from: kl1.d$a */
    public interface C10306a {
        /* renamed from: a */
        void mo10614a(C10289a.C10291b bVar, boolean z);
    }

    /* renamed from: kl1.d$b */
    public static final class C10307b extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10307b(C10305d dVar) {
            super(0);
            this.f31423d = dVar;
        }

        public Object invoke() {
            return ObjectAnimator.ofFloat(this.f31423d.f31408a.f31488e, "alpha", new float[]{1.0f, 0.0f});
        }
    }

    /* renamed from: kl1.d$c */
    public static final class C10308c extends C87413o implements C32224a<ValueAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10308c(C10305d dVar) {
            super(0);
            this.f31424d = dVar;
        }

        public Object invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f31424d.f31408a.mo10633e().getMeasuredWidth() > 0 ? ((float) this.f31424d.f31408a.mo10633e().getMeasuredWidth()) * -1.0f : -500.0f, 0.0f});
            ofFloat.addUpdateListener(new C10317f(this.f31424d));
            return ofFloat;
        }
    }

    /* renamed from: kl1.d$d */
    public static final class C10309d extends C87413o implements C32224a<AnimatorSet> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10309d(C10305d dVar) {
            super(0);
            this.f31425d = dVar;
        }

        public Object invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            C10305d dVar = this.f31425d;
            dVar.f31408a.f31488e.setPivotX(0.0f);
            dVar.f31408a.f31488e.setPivotY(0.0f);
            animatorSet.setDuration(150);
            animatorSet.playTogether(new Animator[]{(ObjectAnimator) ((C36570n) dVar.f31415h).getValue(), (ObjectAnimator) ((C36570n) dVar.f31416i).getValue()});
            return animatorSet;
        }
    }

    /* renamed from: kl1.d$e */
    public static final class C10310e extends C87413o implements C32224a<AnimatorSet> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10310e(C10305d dVar) {
            super(0);
            this.f31426d = dVar;
        }

        public Object invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            C10305d dVar = this.f31426d;
            dVar.f31408a.f31488e.setPivotX(0.0f);
            dVar.f31408a.f31488e.setPivotY(0.0f);
            animatorSet.setDuration(250);
            animatorSet.playTogether(new Animator[]{(ObjectAnimator) ((C36570n) dVar.f31419l).getValue(), (ObjectAnimator) ((C36570n) dVar.f31420m).getValue()});
            return animatorSet;
        }
    }

    /* renamed from: kl1.d$f */
    public static final class C10311f extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10311f(C10305d dVar) {
            super(0);
            this.f31427d = dVar;
        }

        public Object invoke() {
            return ObjectAnimator.ofFloat(this.f31427d.f31408a.f31488e, "scaleX", new float[]{1.16f, 1.0f});
        }
    }

    /* renamed from: kl1.d$g */
    public static final class C10312g extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10312g(C10305d dVar) {
            super(0);
            this.f31428d = dVar;
        }

        public Object invoke() {
            return ObjectAnimator.ofFloat(this.f31428d.f31408a.f31488e, "scaleY", new float[]{1.16f, 1.0f});
        }
    }

    /* renamed from: kl1.d$h */
    public static final class C10313h extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10313h(C10305d dVar) {
            super(0);
            this.f31429d = dVar;
        }

        public Object invoke() {
            return ObjectAnimator.ofFloat(this.f31429d.f31408a.f31488e, "scaleX", new float[]{1.0f, 1.16f});
        }
    }

    /* renamed from: kl1.d$i */
    public static final class C10314i extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10305d f31430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10314i(C10305d dVar) {
            super(0);
            this.f31430d = dVar;
        }

        public Object invoke() {
            return ObjectAnimator.ofFloat(this.f31430d.f31408a.f31488e, "scaleY", new float[]{1.0f, 1.16f});
        }
    }

    /* renamed from: kl1.d$j */
    public static final class C10315j extends C87413o implements C32224a<ValueAnimator> {

        /* renamed from: d */
        public static final C10315j f31431d = new C10315j();

        public C10315j() {
            super(0);
        }

        public Object invoke() {
            return ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        }
    }

    public C10305d(C10333o oVar, C10306a aVar) {
        C87412m.m108594g(oVar, "widget");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f31408a = oVar;
        this.f31409b = aVar;
    }

    /* renamed from: a */
    public static final Object m10254a(C10305d dVar, long j, C15601d dVar2) {
        dVar.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar2));
        C8477a0 a0Var = new C8477a0();
        if (dVar.f31408a.f31488e.getAlpha() <= 0.0f) {
            m10260g(a0Var, hVar, false);
        } else {
            ((ObjectAnimator) ((C36570n) dVar.f31422o).getValue()).setDuration(j);
            ((ObjectAnimator) ((C36570n) dVar.f31422o).getValue()).addListener(new C10316e(dVar, a0Var, hVar));
            ((ObjectAnimator) ((C36570n) dVar.f31422o).getValue()).start();
        }
        return hVar.mo90314b();
    }

    /* renamed from: b */
    public static final void m10255b(C10305d dVar) {
        if (dVar.f31408a.mo10633e().getVisibility() == 0) {
            dVar.f31408a.mo10633e().stop();
            dVar.f31408a.mo10633e().setVisibility(4);
        }
    }

    /* renamed from: c */
    public static final void m10256c(C10305d dVar, Bitmap bitmap, long j, float f) {
        FlashFlightConstraintLayout flashFlightConstraintLayout = dVar.f31408a.f31488e;
        flashFlightConstraintLayout.getClass();
        C87412m.m108594g(bitmap, "bitmap");
        C10301b0 b0Var = flashFlightConstraintLayout.f15431w;
        if (b0Var == null) {
            b0Var = new C10301b0(flashFlightConstraintLayout);
        }
        flashFlightConstraintLayout.f15431w = b0Var;
        Log.m105924i(b0Var.f31395b, "play!");
        b0Var.f31399f = bitmap;
        b0Var.f31403j = f;
        if (b0Var.mo10610a().isRunning()) {
            b0Var.mo10610a().cancel();
        }
        b0Var.mo10610a().setDuration(j);
        b0Var.mo10610a().start();
    }

    /* renamed from: d */
    public static final void m10257d(C10305d dVar, PAGImage pAGImage, long j, long j2) {
        dVar.getClass();
        pAGImage.setScaleMode(1);
        if (C58739j4.f168176a.mo83692U()) {
            String str = dVar.f31410c;
            Log.m105924i(str, "floatCover composition origin size:" + dVar.f31408a.mo10633e().getComposition().width() + '-' + dVar.f31408a.mo10633e().getComposition().height() + ",cover size:" + dVar.f31408a.mo10633e().getWidth() + '-' + dVar.f31408a.mo10633e().getHeight() + ", bulletContent size:" + dVar.f31408a.f31488e.getWidth() + '-' + dVar.f31408a.f31488e.getHeight());
        }
        PAGComposition composition = dVar.f31408a.mo10633e().getComposition();
        C87412m.m108592e(composition, "null cannot be cast to non-null type org.libpag.PAGFile");
        PAGFile pAGFile = (PAGFile) composition;
        int numImages = pAGFile.numImages();
        for (int i = 0; i < numImages; i++) {
            pAGFile.replaceImage(i, pAGImage);
        }
        dVar.f31408a.mo10633e().setProgress(0.0d);
        dVar.f31408a.mo10633e().setRepeatCount(1);
        dVar.f31408a.mo10633e().play();
        dVar.f31408a.mo10633e().setVisibility(0);
        ((ValueAnimator) ((C36570n) dVar.f31418k).getValue()).setDuration(j);
        ((ValueAnimator) ((C36570n) dVar.f31418k).getValue()).setStartDelay(j2);
        ((ValueAnimator) ((C36570n) dVar.f31418k).getValue()).start();
    }

    /* renamed from: e */
    public static final void m10258e(C10305d dVar, String str) {
        dVar.getClass();
        if (C58739j4.f168176a.mo83692U()) {
            String str2 = dVar.f31410c;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  (");
            boolean z = false;
            sb.append(dVar.f31408a.f31484a.getVisibility() == 0);
            sb.append('-');
            sb.append(dVar.f31408a.f31484a.getAlpha());
            sb.append(")(");
            if (dVar.f31408a.f31488e.getVisibility() == 0) {
                z = true;
            }
            sb.append(z);
            sb.append('-');
            sb.append(dVar.f31408a.f31488e.getAlpha());
            sb.append(')');
            Log.m105924i(str2, sb.toString());
            return;
        }
        Log.m105924i(dVar.f31410c, String.valueOf(str));
    }

    /* renamed from: f */
    public static final Object m10259f(C10305d dVar, long j, int i, boolean z, C15601d dVar2) {
        dVar.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar2));
        if (dVar.mo10612h().isRunning()) {
            Log.m105924i(dVar.f31410c, "startAnim but it's runing now!");
            dVar.mo10612h().cancel();
        }
        dVar.mo10612h().setDuration(j);
        dVar.mo10612h().addUpdateListener(new C10325j(dVar, i, z, new C8477a0(), hVar));
        if (!z) {
            dVar.f31408a.f31488e.setAlpha(1.0f);
        }
        dVar.mo10612h().start();
        return hVar.mo90314b();
    }

    /* renamed from: g */
    public static final void m10260g(C8477a0 a0Var, C15601d<? super Boolean> dVar, boolean z) {
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
        }
    }

    /* renamed from: j */
    public static final void m10261j(C8477a0 a0Var, C15601d<? super Boolean> dVar, boolean z) {
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
        }
    }

    /* renamed from: h */
    public final ValueAnimator mo10612h() {
        Object value = ((C36570n) this.f31414g).getValue();
        C87412m.m108593f(value, "<get-start>(...)");
        return (ValueAnimator) value;
    }

    /* renamed from: i */
    public final void mo10613i(int i) {
        String str = this.f31410c;
        Log.m105924i(str, "hideAnim source:" + i);
        C53973z1 z1Var = this.f31411d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f31411d = null;
    }
}
