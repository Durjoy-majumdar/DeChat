package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import nc3.C34767b;
import ob0.C77002r;
import p182kk.C61104a;
import p331dj.C75411c;
import p375qh.C77339c;
import p447aw.C103918d;
import p492dn.C75415t;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyVoiceLayout */
public class LuckyMoneyVoiceLayout extends LinearLayout {

    /* renamed from: d */
    public View f200814d;

    /* renamed from: e */
    public C69599g5 f200815e;

    /* renamed from: f */
    public C77339c f200816f = null;

    /* renamed from: g */
    public C34767b.C34768c f200817g;

    /* renamed from: h */
    public String f200818h = "";

    /* renamed from: i */
    public long f200819i;

    /* renamed from: j */
    public long f200820j;

    /* renamed from: n */
    public boolean f200821n = false;

    /* renamed from: o */
    public int f200822o = 1;

    /* renamed from: p */
    public C69548f f200823p = null;

    /* renamed from: q */
    public View.OnLongClickListener f200824q = new C69543a();

    /* renamed from: r */
    public C77002r.C77003a f200825r = new C69544b();

    /* renamed from: s */
    public View.OnTouchListener f200826s = new C69545c();

    /* renamed from: t */
    public final MTimerHandler f200827t = new MTimerHandler(new C69546d(), true);

    /* renamed from: u */
    public final MTimerHandler f200828u = new MTimerHandler(new C69547e(), true);

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyVoiceLayout$a */
    public class C69543a implements View.OnLongClickListener {
        public C69543a() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyVoiceLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105919d("MicroMsg.LuckyMoneyVoiceLayout", "btn onLongClickListener currentState %s", Integer.valueOf(LuckyMoneyVoiceLayout.this.f200822o));
            LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = LuckyMoneyVoiceLayout.this;
            luckyMoneyVoiceLayout.f200821n = true;
            C69599g5 g5Var = luckyMoneyVoiceLayout.f200815e;
            Log.m105919d("MicroMsg.LuckyMoneyVoiceDrawable", "longClickState %s", Integer.valueOf(g5Var.f200945m));
            g5Var.f200945m = 7;
            g5Var.invalidateSelf();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyVoiceLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyVoiceLayout$b */
    public class C69544b implements C77002r.C77003a {
        public C69544b() {
        }

        /* renamed from: a */
        public void mo95814a() {
            Log.m105921e("MicroMsg.LuckyMoneyVoiceLayout", "onError state:%s errState:%s", Integer.valueOf(LuckyMoneyVoiceLayout.this.f200816f.getStatus()), Integer.valueOf(LuckyMoneyVoiceLayout.this.f200816f.mo107469a()));
            C69548f fVar = LuckyMoneyVoiceLayout.this.f200823p;
            if (fVar != null) {
                ((LuckyMoneyNewYearSendUIV2$$p) fVar).mo95692a(1, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyVoiceLayout$c */
    public class C69545c implements View.OnTouchListener {
        public C69545c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyVoiceLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = LuckyMoneyVoiceLayout.this;
                luckyMoneyVoiceLayout.f200821n = false;
                Log.m105919d("MicroMsg.LuckyMoneyVoiceLayout", "btn onTouch ACTION_DOWN currentState %s", Integer.valueOf(luckyMoneyVoiceLayout.f200822o));
                LuckyMoneyVoiceLayout luckyMoneyVoiceLayout2 = LuckyMoneyVoiceLayout.this;
                Class cls = C103918d.class;
                if (C61104a.m71669y(luckyMoneyVoiceLayout2.getContext()) || C61104a.m71665u(luckyMoneyVoiceLayout2.getContext()) || C61104a.m71649e(luckyMoneyVoiceLayout2.getContext())) {
                    Log.m105924i("MicroMsg.LuckyMoneyVoiceLayout", "voip is running, cann't record voice");
                    luckyMoneyVoiceLayout2.mo95811c(new C69605h5(luckyMoneyVoiceLayout2));
                } else {
                    boolean Lb0 = ((C103918d) C86312j.m106911c(cls)).Lb0(luckyMoneyVoiceLayout2.getContext(), "android.permission.RECORD_AUDIO");
                    Log.m105919d("MicroMsg.LuckyMoneyVoiceLayout", "checkPermission checkMicrophone[%s]", Boolean.valueOf(Lb0));
                    if (Lb0) {
                        String str = C69218g1.f199176a;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C69218g1.f199176a + "voice" + "/");
                        sb.append(C75592q0.m90789s() + "_" + System.currentTimeMillis());
                        sb.append(".amr");
                        luckyMoneyVoiceLayout2.f200818h = sb.toString();
                        Log.m105925i("MicroMsg.LuckyMoneyVoiceLayout", "doStart currentState:%s filePath:%s", Integer.valueOf(luckyMoneyVoiceLayout2.f200822o), luckyMoneyVoiceLayout2.f200818h);
                        if (luckyMoneyVoiceLayout2.f200822o == 1) {
                            luckyMoneyVoiceLayout2.f200822o = 2;
                            C69548f fVar = luckyMoneyVoiceLayout2.f200823p;
                            if (fVar != null) {
                                LuckyMoneyNewYearSendUIV2$$p luckyMoneyNewYearSendUIV2$$p = (LuckyMoneyNewYearSendUIV2$$p) fVar;
                                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectStart");
                                View view2 = luckyMoneyNewYearSendUIV2$$p.f200388a.f200330h;
                                if (view2 != null) {
                                    view2.post(new C69688t2(luckyMoneyNewYearSendUIV2$$p));
                                }
                            }
                            luckyMoneyVoiceLayout2.f200819i = Util.nowMilliSecond();
                            luckyMoneyVoiceLayout2.f200827t.startTimer(25);
                            luckyMoneyVoiceLayout2.f200828u.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                            luckyMoneyVoiceLayout2.f200817g = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34775p.f93458c, (C34767b.C21622a) null);
                            C77339c Xr0 = ((C75415t) C86312j.m106911c(C75415t.class)).Xr0(C75411c.SILK);
                            luckyMoneyVoiceLayout2.f200816f = Xr0;
                            Xr0.mo107470c(luckyMoneyVoiceLayout2.f200825r);
                            luckyMoneyVoiceLayout2.f200816f.startRecord(luckyMoneyVoiceLayout2.f200818h);
                            C69599g5 g5Var = luckyMoneyVoiceLayout2.f200815e;
                            Log.m105919d("MicroMsg.LuckyMoneyVoiceDrawable", "readyPressState %s", Integer.valueOf(g5Var.f200945m));
                            g5Var.f200945m = 6;
                            g5Var.invalidateSelf();
                            luckyMoneyVoiceLayout2.mo95811c(new C69613i5(luckyMoneyVoiceLayout2, true));
                        }
                    } else {
                        Activity activity = (Activity) luckyMoneyVoiceLayout2.getContext();
                        if (activity != null) {
                            ((C103918d) C86312j.m106911c(cls)).Uu0(activity, new String[]{"android.permission.RECORD_AUDIO"}, 80, (String) null, (String) null);
                        }
                        Log.m105924i("MicroMsg.LuckyMoneyVoiceLayout", "context = " + activity);
                    }
                }
            } else if (action == 1) {
                Log.m105919d("MicroMsg.LuckyMoneyVoiceLayout", "btn onTouch ACTION_UP currentState %s longClickDown %s", Integer.valueOf(LuckyMoneyVoiceLayout.this.f200822o), Boolean.valueOf(LuckyMoneyVoiceLayout.this.f200821n));
                LuckyMoneyVoiceLayout luckyMoneyVoiceLayout3 = LuckyMoneyVoiceLayout.this;
                luckyMoneyVoiceLayout3.f200821n = false;
                luckyMoneyVoiceLayout3.mo95809a();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyVoiceLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyVoiceLayout$d */
    public class C69546d implements MTimerHandler.CallBack {
        public C69546d() {
        }

        public boolean onTimerExpired() {
            C77339c cVar = LuckyMoneyVoiceLayout.this.f200816f;
            if (cVar == null) {
                return true;
            }
            int d = cVar.mo107471d();
            LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = LuckyMoneyVoiceLayout.this;
            if (luckyMoneyVoiceLayout.f200822o == 2) {
                luckyMoneyVoiceLayout.getClass();
                luckyMoneyVoiceLayout.mo95811c(new C69622j5(luckyMoneyVoiceLayout, d));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyVoiceLayout$e */
    public class C69547e implements MTimerHandler.CallBack {
        public C69547e() {
        }

        public boolean onTimerExpired() {
            View view;
            LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = LuckyMoneyVoiceLayout.this;
            luckyMoneyVoiceLayout.f200820j = Util.milliSecondsToNow(luckyMoneyVoiceLayout.f200819i);
            LuckyMoneyVoiceLayout luckyMoneyVoiceLayout2 = LuckyMoneyVoiceLayout.this;
            C69548f fVar = luckyMoneyVoiceLayout2.f200823p;
            if (fVar != null) {
                int i = (int) luckyMoneyVoiceLayout2.f200820j;
                LuckyMoneyNewYearSendUIV2$$p luckyMoneyNewYearSendUIV2$$p = (LuckyMoneyNewYearSendUIV2$$p) fVar;
                luckyMoneyNewYearSendUIV2$$p.getClass();
                Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectProcess useTime:%s", Integer.valueOf(i));
                if (i >= 50000 && luckyMoneyNewYearSendUIV2$$p.f200388a.f200294O1.stopped() && (view = luckyMoneyNewYearSendUIV2$$p.f200388a.f200330h) != null) {
                    view.post(new C69697u2(luckyMoneyNewYearSendUIV2$$p));
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyVoiceLayout$f */
    public interface C69548f {
    }

    public LuckyMoneyVoiceLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo95810b(context);
    }

    /* renamed from: a */
    public void mo95809a() {
        Log.m105919d("MicroMsg.LuckyMoneyVoiceLayout", "do Stop. currentState = %s", Integer.valueOf(this.f200822o));
        if (this.f200822o == 2) {
            MTimerHandler mTimerHandler = this.f200827t;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            MTimerHandler mTimerHandler2 = this.f200828u;
            if (mTimerHandler2 != null) {
                mTimerHandler2.stopTimer();
            }
            this.f200816f.stopRecord();
            Log.m105924i("MicroMsg.LuckyMoneyVoiceLayout", "abandonFocus: ");
            if (this.f200817g != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(this.f200817g);
                this.f200817g = null;
            }
            this.f200822o = 1;
            C69599g5 g5Var = this.f200815e;
            Log.m105919d("MicroMsg.LuckyMoneyVoiceDrawable", "readyState %s", Integer.valueOf(g5Var.f200945m));
            g5Var.f200945m = 2;
            g5Var.invalidateSelf();
            long milliSecondsToNow = Util.milliSecondsToNow(this.f200819i);
            this.f200820j = milliSecondsToNow;
            C69548f fVar = this.f200823p;
            if (fVar == null) {
                return;
            }
            if (milliSecondsToNow < 1000) {
                ((LuckyMoneyNewYearSendUIV2$$p) fVar).mo95692a(2, this.f200818h);
            } else if (C86013q1.m106450k(this.f200818h)) {
                ((LuckyMoneyNewYearSendUIV2$$p) this.f200823p).mo95692a(0, this.f200818h);
            } else {
                ((LuckyMoneyNewYearSendUIV2$$p) this.f200823p).mo95692a(3, this.f200818h);
            }
        }
    }

    /* renamed from: b */
    public void mo95810b(Context context) {
        View findViewById = View.inflate(context, C0966R.C0971layout.d_m, this).findViewById(C0966R.C0970id.oj7);
        this.f200814d = findViewById;
        findViewById.setLayerType(1, (Paint) null);
        C69599g5 g5Var = new C69599g5(context);
        this.f200815e = g5Var;
        this.f200814d.setBackground(g5Var);
        this.f200814d.setEnabled(true);
        this.f200814d.setOnTouchListener(this.f200826s);
        this.f200814d.setOnLongClickListener(this.f200824q);
    }

    /* renamed from: c */
    public final void mo95811c(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            MMHandlerThread.postToMainThread(runnable);
        } else {
            runnable.run();
        }
    }

    public long getUseTime() {
        return this.f200820j;
    }

    public LuckyMoneyVoiceLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo95810b(context);
    }
}
