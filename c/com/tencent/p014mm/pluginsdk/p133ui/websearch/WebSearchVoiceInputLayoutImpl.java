package com.tencent.p014mm.pluginsdk.p133ui.websearch;

import android.content.Context;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import vd3.C111511d0;

/* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl */
public class WebSearchVoiceInputLayoutImpl extends VoiceInputLayout {

    /* renamed from: x */
    public static final /* synthetic */ int f55392x = 0;

    /* renamed from: r */
    public View f55393r;

    /* renamed from: s */
    public C111511d0 f55394s;

    /* renamed from: t */
    public boolean f55395t = false;

    /* renamed from: u */
    public long f55396u;

    /* renamed from: v */
    public View.OnLongClickListener f55397v = new C19577a();

    /* renamed from: w */
    public View.OnTouchListener f55398w = new C19578b();

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl$a */
    public class C19577a implements View.OnLongClickListener {
        public C19577a() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl = WebSearchVoiceInputLayoutImpl.this;
            int i = WebSearchVoiceInputLayoutImpl.f55392x;
            Log.m105919d("MicroMsg.WebSearchVoiceInputLayoutImpl", "btn onLongClickListener currentState %s", Integer.valueOf(webSearchVoiceInputLayoutImpl.f55020g));
            WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl2 = WebSearchVoiceInputLayoutImpl.this;
            webSearchVoiceInputLayoutImpl2.f55395t = true;
            webSearchVoiceInputLayoutImpl2.f55394s.mo163196c();
            C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl$b */
    public class C19578b implements View.OnTouchListener {
        public C19578b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl = WebSearchVoiceInputLayoutImpl.this;
                webSearchVoiceInputLayoutImpl.f55395t = false;
                webSearchVoiceInputLayoutImpl.f55396u = Util.currentTicks();
                Log.m105919d("MicroMsg.WebSearchVoiceInputLayoutImpl", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", Integer.valueOf(WebSearchVoiceInputLayoutImpl.this.f55020g), Long.valueOf(WebSearchVoiceInputLayoutImpl.this.f55396u));
                WebSearchVoiceInputLayoutImpl.this.f55394s.mo163197d();
                WebSearchVoiceInputLayoutImpl.this.mo25385j(false, false);
            } else if (action == 1) {
                WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl2 = WebSearchVoiceInputLayoutImpl.this;
                int i = WebSearchVoiceInputLayoutImpl.f55392x;
                Log.m105919d("MicroMsg.WebSearchVoiceInputLayoutImpl", "btn onTouch ACTION_UP currentState %s longClickDown %s", Integer.valueOf(webSearchVoiceInputLayoutImpl2.f55020g), Boolean.valueOf(WebSearchVoiceInputLayoutImpl.this.f55395t));
                WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl3 = WebSearchVoiceInputLayoutImpl.this;
                if (webSearchVoiceInputLayoutImpl3.f55395t) {
                    webSearchVoiceInputLayoutImpl3.mo25385j(true, false);
                    WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl4 = WebSearchVoiceInputLayoutImpl.this;
                    webSearchVoiceInputLayoutImpl4.f55395t = false;
                    webSearchVoiceInputLayoutImpl4.f55396u = 0;
                } else {
                    webSearchVoiceInputLayoutImpl3.mo25385j(false, true);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl$c */
    public class C19579c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f55401d;

        public C19579c(boolean z) {
            this.f55401d = z;
        }

        public void run() {
            WebSearchVoiceInputLayoutImpl.this.f55394s.mo163201g(0, this.f55401d);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl$d */
    public class C19580d implements Runnable {
        public C19580d() {
        }

        public void run() {
            WebSearchVoiceInputLayoutImpl.this.f55394s.mo163200f();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl$e */
    public class C19581e implements Runnable {
        public C19581e() {
        }

        public void run() {
            WebSearchVoiceInputLayoutImpl.this.f55394s.mo163199e();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl$f */
    public class C19582f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f55405d;

        public C19582f(int i) {
            this.f55405d = i;
        }

        public void run() {
            WebSearchVoiceInputLayoutImpl.this.f55394s.mo163205h(this.f55405d);
        }
    }

    public WebSearchVoiceInputLayoutImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo25386k(context);
    }

    /* renamed from: e */
    public void mo25240e(boolean z) {
        mo25387l(new C19580d());
    }

    /* renamed from: f */
    public void mo25241f(int i) {
        mo25387l(new C19582f(i));
    }

    /* renamed from: g */
    public void mo25242g() {
        mo25387l(new C19581e());
    }

    /* renamed from: h */
    public void mo25244h(boolean z) {
        mo25387l(new C19579c(z));
    }

    /* renamed from: j */
    public void mo25385j(boolean z, boolean z2) {
        boolean z3 = false;
        Log.m105919d("MicroMsg.WebSearchVoiceInputLayoutImpl", "directStart currentState = %s longUp = %s clickUp = %s", Integer.valueOf(this.f55020g), Boolean.valueOf(z), Boolean.valueOf(z2));
        int i = this.f55020g;
        if (i == 1) {
            if (!z && !z2) {
                int m = C97625j3.m125815e().mo123467m();
                if (m == 4 || m == 6) {
                    z3 = true;
                }
                if (!z3) {
                    mo25387l(new C19588a(this));
                    mo25237b(12, -1, -1);
                    return;
                }
                mo25238c(true);
            } else if (z && !z2) {
                this.f55394s.mo163199e();
            }
        } else if (i == 2) {
            if (!z2) {
                mo25239d();
                return;
            }
            this.f55394s.mo163199e();
            mo25236a();
            VoiceInputLayout.C19472d dVar = this.f55024n;
            if (dVar != null) {
                dVar.mo25250a(true);
            }
        } else if (!z && !z2) {
            mo25236a();
        } else if (z && !z2) {
            this.f55394s.mo163199e();
        }
    }

    /* renamed from: k */
    public void mo25386k(Context context) {
        View findViewById = View.inflate(context, C0966R.C0971layout.cch, this).findViewById(C0966R.C0970id.lbl);
        this.f55393r = findViewById;
        boolean z = true;
        findViewById.setLayerType(1, (Paint) null);
        C111511d0 d0Var = new C111511d0(context);
        this.f55394s = d0Var;
        this.f55393r.setBackground(d0Var);
        this.f55393r.setEnabled(true);
        this.f55393r.setOnTouchListener(this.f55398w);
        this.f55393r.setOnLongClickListener(this.f55397v);
        mo25245i(true);
        if (!isInEditMode()) {
            int m = C97625j3.m125815e().mo123467m();
            if (!(m == 4 || m == 6)) {
                z = false;
            }
            if (!z) {
                mo25387l(new C19588a(this));
                mo25237b(12, -1, -1);
            }
        }
    }

    /* renamed from: l */
    public final void mo25387l(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            MMHandlerThread.postToMainThread(runnable);
        } else {
            runnable.run();
        }
    }

    public WebSearchVoiceInputLayoutImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo25386k(context);
    }
}
