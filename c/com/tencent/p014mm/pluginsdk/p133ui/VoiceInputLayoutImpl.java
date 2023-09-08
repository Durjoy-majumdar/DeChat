package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.p014mm.plugin.report.kvdata.log_13905;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import vd3.C111511d0;
import vd3.C22748k0;

/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl */
public class VoiceInputLayoutImpl extends VoiceInputLayout {

    /* renamed from: r */
    public View f55031r;

    /* renamed from: s */
    public C111511d0 f55032s;

    /* renamed from: t */
    public boolean f55033t = false;

    /* renamed from: u */
    public long f55034u;

    /* renamed from: v */
    public View.OnLongClickListener f55035v = new C19474a();

    /* renamed from: w */
    public View.OnTouchListener f55036w = new C19475b();

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl$a */
    public class C19474a implements View.OnLongClickListener {
        public C19474a() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105919d("MicroMsg.VoiceInputLayoutImp", "btn onLongClickListener currentState %s", Integer.valueOf(VoiceInputLayoutImpl.this.f55020g));
            VoiceInputLayoutImpl voiceInputLayoutImpl = VoiceInputLayoutImpl.this;
            voiceInputLayoutImpl.f55033t = true;
            voiceInputLayoutImpl.f55032s.mo163196c();
            C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl$b */
    public class C19475b implements View.OnTouchListener {
        public C19475b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                VoiceInputLayoutImpl voiceInputLayoutImpl = VoiceInputLayoutImpl.this;
                voiceInputLayoutImpl.f55033t = false;
                voiceInputLayoutImpl.f55034u = Util.currentTicks();
                Log.m105919d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", Integer.valueOf(VoiceInputLayoutImpl.this.f55020g), Long.valueOf(VoiceInputLayoutImpl.this.f55034u));
                VoiceInputLayoutImpl.this.f55032s.mo163197d();
                VoiceInputLayoutImpl.this.mo25258j(false, false);
            } else if (action == 1) {
                Log.m105919d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_UP currentState %s longClickDown %s", Integer.valueOf(VoiceInputLayoutImpl.this.f55020g), Boolean.valueOf(VoiceInputLayoutImpl.this.f55033t));
                VoiceInputLayoutImpl voiceInputLayoutImpl2 = VoiceInputLayoutImpl.this;
                if (voiceInputLayoutImpl2.f55033t) {
                    voiceInputLayoutImpl2.mo25258j(true, false);
                    VoiceInputLayoutImpl voiceInputLayoutImpl3 = VoiceInputLayoutImpl.this;
                    voiceInputLayoutImpl3.f55033t = false;
                    voiceInputLayoutImpl3.f55034u = 0;
                } else {
                    voiceInputLayoutImpl2.mo25258j(false, true);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl$c */
    public class C19476c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f55039d;

        public C19476c(boolean z) {
            this.f55039d = z;
        }

        public void run() {
            VoiceInputLayoutImpl.this.f55032s.mo163201g(0, this.f55039d);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl$d */
    public class C19477d implements Runnable {
        public C19477d() {
        }

        public void run() {
            VoiceInputLayoutImpl.this.f55032s.mo163200f();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl$e */
    public class C19478e implements Runnable {
        public C19478e() {
        }

        public void run() {
            VoiceInputLayoutImpl.this.f55032s.mo163199e();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl$f */
    public class C19479f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f55043d;

        public C19479f(int i) {
            this.f55043d = i;
        }

        public void run() {
            VoiceInputLayoutImpl.this.f55032s.mo163205h(this.f55043d);
        }
    }

    public VoiceInputLayoutImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo25259k(context);
    }

    /* renamed from: e */
    public void mo25240e(boolean z) {
        if (!z) {
            mo25260l(17, false);
        }
        mo25261m(new C19477d());
    }

    /* renamed from: f */
    public void mo25241f(int i) {
        mo25261m(new C19479f(i));
    }

    /* renamed from: g */
    public void mo25242g() {
        mo25261m(new C19478e());
    }

    /* renamed from: h */
    public void mo25244h(boolean z) {
        mo25261m(new C19476c(z));
    }

    /* renamed from: j */
    public void mo25258j(boolean z, boolean z2) {
        boolean z3 = false;
        Log.m105919d("MicroMsg.VoiceInputLayoutImp", "directStart currentState = %s longUp = %s clickUp = %s", Integer.valueOf(this.f55020g), Boolean.valueOf(z), Boolean.valueOf(z2));
        int i = this.f55020g;
        if (i == 1) {
            if (!z && !z2) {
                int m = C97625j3.m125815e().mo123467m();
                if (m == 4 || m == 6) {
                    z3 = true;
                }
                if (!z3) {
                    mo25261m(new C22748k0(this));
                    mo25237b(12, -1, -1);
                    return;
                }
                mo25238c(true);
            } else if (z && !z2) {
                mo25260l(4, this.f55033t);
                mo25260l(this.f55020g, this.f55033t);
                this.f55032s.mo163199e();
            }
        } else if (i == 2) {
            if (!z2) {
                if (z) {
                    mo25260l(4, this.f55033t);
                }
                mo25260l(this.f55020g, this.f55033t);
                mo25239d();
                return;
            }
            this.f55032s.mo163199e();
            mo25236a();
            VoiceInputLayout.C19472d dVar = this.f55024n;
            if (dVar != null) {
                dVar.mo25250a(true);
            }
            mo25260l(5, this.f55033t);
        } else if (!z && !z2) {
            mo25260l(i, this.f55033t);
            mo25236a();
        } else if (z && !z2) {
            mo25260l(4, this.f55033t);
            mo25260l(this.f55020g, this.f55033t);
            this.f55032s.mo163199e();
        }
    }

    /* renamed from: k */
    public void mo25259k(Context context) {
        View findViewById = View.inflate(context, C0966R.C0971layout.cch, this).findViewById(C0966R.C0970id.lbl);
        this.f55031r = findViewById;
        boolean z = true;
        findViewById.setLayerType(1, (Paint) null);
        C111511d0 d0Var = new C111511d0(context);
        this.f55032s = d0Var;
        this.f55031r.setBackground(d0Var);
        this.f55031r.setEnabled(true);
        this.f55031r.setOnTouchListener(this.f55036w);
        this.f55031r.setOnLongClickListener(this.f55035v);
        mo25245i(true);
        if (!isInEditMode()) {
            int m = C97625j3.m125815e().mo123467m();
            if (!(m == 4 || m == 6)) {
                z = false;
            }
            if (!z) {
                mo25261m(new C22748k0(this));
                mo25237b(12, -1, -1);
            }
        }
    }

    /* renamed from: l */
    public final void mo25260l(int i, boolean z) {
        log_13905 log_13905 = new log_13905();
        VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
        if (!z) {
            voiceInputBehavior.click = i;
        } else if (this.f55019f) {
            voiceInputBehavior.fullScreenVoiceLongClick = i;
            if (i != 4 && this.f55033t) {
                long j = this.f55034u;
                if (j != 0) {
                    voiceInputBehavior.fullScreenVoiceLongClickTime = Util.ticksToNow(j);
                }
            }
        } else {
            voiceInputBehavior.longClick = i;
            if (i != 4 && this.f55033t) {
                long j2 = this.f55034u;
                if (j2 != 0) {
                    voiceInputBehavior.longClickTime = Util.ticksToNow(j2);
                }
            }
        }
        log_13905.viOp_ = voiceInputBehavior;
        C115669n.INSTANCE.mo175916z(13905, log_13905, false, false);
        Log.m105925i("MicroMsg.VoiceInputLayoutImp", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", Integer.valueOf(voiceInputBehavior.cancel), Integer.valueOf(voiceInputBehavior.send), Integer.valueOf(voiceInputBehavior.click), Integer.valueOf(voiceInputBehavior.longClick), Long.valueOf(voiceInputBehavior.longClickTime), Integer.valueOf(voiceInputBehavior.textClick), Integer.valueOf(voiceInputBehavior.textChangeCount), Long.valueOf(voiceInputBehavior.textChangeTime), Integer.valueOf(voiceInputBehavior.textChangeReturn), Long.valueOf(voiceInputBehavior.voiceInputTime), Integer.valueOf(voiceInputBehavior.fail), Integer.valueOf(voiceInputBehavior.clear), Integer.valueOf(voiceInputBehavior.smileIconClick), Integer.valueOf(voiceInputBehavior.voiceIconClick), Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
    }

    /* renamed from: m */
    public final void mo25261m(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            MMHandlerThread.postToMainThread(runnable);
        } else {
            runnable.run();
        }
    }

    public VoiceInputLayoutImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo25259k(context);
    }
}
