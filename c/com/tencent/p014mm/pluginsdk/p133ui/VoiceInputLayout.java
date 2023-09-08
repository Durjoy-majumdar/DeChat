package com.tencent.p014mm.pluginsdk.p133ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.modelvoiceaddr.C92866b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import java.util.List;
import p182kk.C61104a;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayout */
public abstract class VoiceInputLayout extends LinearLayout {

    /* renamed from: d */
    public C19473e f55017d = null;

    /* renamed from: e */
    public C92866b f55018e;

    /* renamed from: f */
    public boolean f55019f = false;

    /* renamed from: g */
    public int f55020g = 1;

    /* renamed from: h */
    public int f55021h = 1;

    /* renamed from: i */
    public int f55022i = 3000;

    /* renamed from: j */
    public int f55023j = 10000;

    /* renamed from: n */
    public C19472d f55024n;

    /* renamed from: o */
    public MMHandler f55025o = new C19469a();

    /* renamed from: p */
    public MMHandler f55026p = new C19470b();

    /* renamed from: q */
    public final MTimerHandler f55027q = new MTimerHandler(new C19471c(), true);

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayout$a */
    public class C19469a extends MMHandler {
        public C19469a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    Log.m105929w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", Integer.valueOf(VoiceInputLayout.this.f55020g));
                } else {
                    return;
                }
            }
            Log.m105919d("MicroMsg.VoiceInputLayout", "Recognized force finished %s", Integer.valueOf(VoiceInputLayout.this.f55020g));
            VoiceInputLayout voiceInputLayout = VoiceInputLayout.this;
            if (voiceInputLayout.f55020g == 3) {
                voiceInputLayout.f55025o.removeMessages(0);
                VoiceInputLayout.this.f55025o.removeMessages(1);
                C92866b bVar = VoiceInputLayout.this.f55018e;
                if (bVar != null) {
                    bVar.cancel(true);
                }
                VoiceInputLayout.this.mo25245i(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayout$b */
    public class C19470b extends MMHandler {
        public C19470b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                VoiceInputLayout voiceInputLayout = VoiceInputLayout.this;
                Log.m105919d("MicroMsg.VoiceInputLayout", "doWaiting currentState = %s", Integer.valueOf(voiceInputLayout.f55020g));
                if (voiceInputLayout.f55020g == 2) {
                    voiceInputLayout.f55020g = 3;
                    voiceInputLayout.f55025o.removeMessages(0);
                    voiceInputLayout.f55025o.sendEmptyMessageDelayed(0, (long) voiceInputLayout.f55022i);
                    voiceInputLayout.f55025o.sendEmptyMessageDelayed(1, (long) voiceInputLayout.f55023j);
                    voiceInputLayout.mo25240e(false);
                }
            } else if (i == 1) {
                Bundle data = message.getData();
                VoiceInputLayout.this.mo25237b(data.getInt("localCode"), data.getInt("errType"), data.getInt("errCode"));
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayout$c */
    public class C19471c implements MTimerHandler.CallBack {
        public C19471c() {
        }

        public boolean onTimerExpired() {
            C92866b bVar = VoiceInputLayout.this.f55018e;
            if (bVar == null) {
                return true;
            }
            int maxAmplitudeRate = bVar.getMaxAmplitudeRate();
            VoiceInputLayout voiceInputLayout = VoiceInputLayout.this;
            if (voiceInputLayout.f55020g == 2) {
                voiceInputLayout.mo25241f(maxAmplitudeRate);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayout$d */
    public interface C19472d {
        /* renamed from: a */
        void mo25250a(boolean z);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayout$e */
    public interface C19473e {
        /* renamed from: a */
        void mo25251a();

        /* renamed from: b */
        void mo25252b();

        /* renamed from: c */
        void mo25253c(int i, int i2, int i3);

        /* renamed from: d */
        void mo25254d(String[] strArr, List<String> list);

        /* renamed from: e */
        void mo25255e();

        /* renamed from: f */
        void mo25256f();

        /* renamed from: g */
        void mo25257g();
    }

    public VoiceInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo25236a() {
        Log.m105919d("MicroMsg.VoiceInputLayout", "doCancel. state = %s", Integer.valueOf(this.f55020g));
        if (this.f55020g != 1) {
            this.f55020g = 1;
            C19473e eVar = this.f55017d;
            if (eVar != null) {
                eVar.mo25257g();
            }
            C92866b bVar = this.f55018e;
            if (bVar != null) {
                bVar.cancel(true);
            }
            mo25242g();
        }
    }

    /* renamed from: b */
    public void mo25237b(int i, int i2, int i3) {
        Log.m105919d("MicroMsg.VoiceInputLayout", "doNetworkError localerrorType:%s,errorType:%s,errCode:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.f55020g = 1;
        mo25242g();
        C19473e eVar = this.f55017d;
        if (eVar != null) {
            eVar.mo25253c(i, i2, i3);
        }
    }

    /* renamed from: c */
    public void mo25238c(boolean z) {
        Class cls = C103918d.class;
        if (C61104a.m71669y(getContext()) || C61104a.m71665u(getContext()) || C61104a.m71649e(getContext())) {
            Log.m105918d("MicroMsg.VoiceInputLayout", "voip is running, cann't record voice");
            mo25242g();
            return;
        }
        boolean Lb0 = ((C103918d) C86312j.m106911c(cls)).Lb0(getContext(), "android.permission.RECORD_AUDIO");
        Log.m105919d("MicroMsg.VoiceInputLayout", "summerper checkPermission checkMicrophone[%s]", Boolean.valueOf(Lb0));
        if (Lb0) {
            Log.m105919d("MicroMsg.VoiceInputLayout", "doStart currentState = %s", Integer.valueOf(this.f55020g));
            if (this.f55020g == 1) {
                this.f55020g = 2;
                C19473e eVar = this.f55017d;
                if (eVar != null) {
                    eVar.mo25252b();
                }
                this.f55027q.startTimer(50);
                mo25244h(z);
                C92866b bVar = new C92866b(this.f55021h, 0, new C19495e(this));
                this.f55018e = bVar;
                bVar.start();
            }
        } else if (getContext() instanceof Activity) {
            ((C103918d) C86312j.m106911c(cls)).mo125790zt((Activity) getContext(), "android.permission.RECORD_AUDIO", 80);
        }
    }

    /* renamed from: d */
    public void mo25239d() {
        Log.m105919d("MicroMsg.VoiceInputLayout", "do Stop. currentState = %s", Integer.valueOf(this.f55020g));
        int i = this.f55020g;
        if (i != 1 && i == 2) {
            this.f55020g = 3;
            C19473e eVar = this.f55017d;
            if (eVar != null) {
                eVar.mo25251a();
            }
            MTimerHandler mTimerHandler = this.f55027q;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f55025o.removeMessages(0);
            this.f55025o.sendEmptyMessageDelayed(0, (long) this.f55022i);
            this.f55025o.sendEmptyMessageDelayed(1, (long) this.f55023j);
            mo25240e(true);
            C92866b bVar = this.f55018e;
            if (bVar != null) {
                bVar.stop(true);
            }
        }
    }

    /* renamed from: e */
    public abstract void mo25240e(boolean z);

    /* renamed from: f */
    public abstract void mo25241f(int i);

    /* renamed from: g */
    public abstract void mo25242g();

    public int getCurrentState() {
        return this.f55020g;
    }

    /* renamed from: h */
    public abstract void mo25244h(boolean z);

    /* renamed from: i */
    public void mo25245i(boolean z) {
        C19473e eVar;
        Log.m105919d("MicroMsg.VoiceInputLayout", "reset currentState %s", Integer.valueOf(this.f55020g));
        if (this.f55020g != 1) {
            this.f55020g = 1;
            mo25242g();
            if (z && (eVar = this.f55017d) != null) {
                eVar.mo25255e();
            }
        }
    }

    public void setFromFullScreen(boolean z) {
        this.f55019f = z;
    }

    public void setLangType(int i) {
        this.f55021h = i;
    }

    public void setLongClickLisnter(C19472d dVar) {
        this.f55024n = dVar;
    }

    public void setVoiceDetectListener(C19473e eVar) {
        this.f55017d = eVar;
    }

    public VoiceInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
