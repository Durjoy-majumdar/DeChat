package gb1;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import gb1.C116929b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gb1.c */
public class C116932c implements C116929b {

    /* renamed from: a */
    public boolean f350382a = false;

    /* renamed from: b */
    public boolean f350383b = false;

    /* renamed from: c */
    public View f350384c = null;

    /* renamed from: d */
    public View f350385d = null;

    /* renamed from: e */
    public String f350386e;

    /* renamed from: f */
    public long f350387f;

    /* renamed from: g */
    public volatile boolean f350388g = false;

    /* renamed from: h */
    public Animation f350389h;

    /* renamed from: i */
    public volatile boolean f350390i = false;

    /* renamed from: j */
    public volatile boolean f350391j = false;

    /* renamed from: k */
    public final MTimerHandler.CallBack f350392k;

    /* renamed from: l */
    public final MTimerHandler f350393l;

    /* renamed from: gb1.c$a */
    public class C116933a implements MTimerHandler.CallBack {
        public C116933a() {
        }

        public boolean onTimerExpired() {
            if (!C116932c.this.f350388g) {
                Log.m105928w("MicroMsg.NormalFaceMotion", "hy: already stopped");
                return false;
            } else if (C116932c.this.mo180913j() == null) {
                return true;
            } else {
                C116932c.this.mo180913j().startAnimation(C116932c.this.f350389h);
                return true;
            }
        }
    }

    public C116932c(String str, long j) {
        C116933a aVar = new C116933a();
        this.f350392k = aVar;
        this.f350393l = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) aVar, true);
        this.f350386e = str;
        this.f350387f = j;
        this.f350389h = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2503er);
    }

    /* renamed from: a */
    public void mo180904a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getHintMsgTv() == null : ");
        sb.append(mo180913j() == null);
        Log.m105918d("MicroMsg.NormalFaceMotion", sb.toString());
        if (mo180913j() != null) {
            mo180913j().setText(str);
        }
    }

    /* renamed from: b */
    public C116929b.C116930a mo180905b() {
        if (!this.f350382a || this.f350391j) {
            return null;
        }
        this.f350391j = true;
        return new C116929b.C116930a(1);
    }

    /* renamed from: c */
    public boolean mo180906c(int i, CharSequence charSequence) {
        return false;
    }

    /* renamed from: d */
    public boolean mo180907d() {
        return this.f350382a && this.f350383b;
    }

    /* renamed from: e */
    public C116929b.C116931b mo180908e() {
        return this.f350382a ? new C116929b.C116931b(90025, "user cancelled in intermediate page") : new C116929b.C116931b(90004, "user cancelled in processing");
    }

    /* renamed from: f */
    public boolean mo180909f(FaceCharacteristicsResult faceCharacteristicsResult) {
        if (!this.f350382a || faceCharacteristicsResult == null || faceCharacteristicsResult.f345935e != 18) {
            return false;
        }
        Log.m105918d("MicroMsg.NormalFaceMotion", "hy: ignore too active");
        return true;
    }

    /* renamed from: g */
    public void mo180910g(Context context, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f350384c = LayoutInflater.from(context).inflate(C0966R.C0971layout.a5s, viewGroup);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.a5t, viewGroup2);
        this.f350385d = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "initMotion", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "initMotion", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (mo180913j() != null) {
            mo180913j().setText(this.f350386e);
        }
        long j = this.f350387f;
        Log.m105925i("MicroMsg.NormalFaceMotion", "hy: starting tween timer: tween: %d", Long.valueOf(j));
        this.f350393l.stopTimer();
        this.f350388g = true;
        this.f350393l.startTimer(0, j);
    }

    /* renamed from: h */
    public boolean mo180911h(FaceCharacteristicsResult faceCharacteristicsResult) {
        if (faceCharacteristicsResult.f345935e == -1) {
            this.f350382a = true;
            if (!this.f350390i) {
                PlaySound.play(MMApplicationContext.getContext(), C0966R.string.hq5);
                TextView textView = (TextView) this.f350384c.findViewById(C0966R.C0970id.ewa);
                Animation loadAnimation = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2388bp);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2393bw);
                loadAnimation.setDuration(500);
                loadAnimation2.setDuration(500);
                textView.startAnimation(loadAnimation);
                textView.setVisibility(4);
                View view = this.f350385d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "startTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "startTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f350385d.startAnimation(loadAnimation2);
                this.f350385d.findViewById(C0966R.C0970id.cqg).setOnClickListener(new C45903d(this));
                this.f350390i = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo180912i() {
        this.f350388g = false;
        this.f350393l.stopTimer();
        this.f350382a = false;
        this.f350390i = false;
        this.f350391j = false;
        this.f350383b = false;
    }

    /* renamed from: j */
    public TextView mo180913j() {
        View view;
        View view2;
        boolean z = this.f350382a;
        if (!z && (view2 = this.f350384c) != null) {
            return (TextView) view2.findViewById(C0966R.C0970id.ewa);
        }
        if (!z || (view = this.f350385d) == null) {
            return null;
        }
        return (TextView) view.findViewById(C0966R.C0970id.ewa);
    }
}
