package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvoiceaddr.C17800a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.fts.p059ui.widget.C18874c;
import com.tencent.p014mm.plugin.fts.p059ui.widget.VoiceInputLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import p182kk.C61104a;
import p447aw.C103918d;
import p716uu.C102111c;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl */
public class FTSVoiceInputLayoutImpl extends VoiceInputLayout {

    /* renamed from: y */
    public static final /* synthetic */ int f52872y = 0;

    /* renamed from: q */
    public View f52873q;

    /* renamed from: r */
    public TextView f52874r;

    /* renamed from: s */
    public C68992b f52875s;

    /* renamed from: t */
    public boolean f52876t = false;

    /* renamed from: u */
    public boolean f52877u = false;

    /* renamed from: v */
    public long f52878v;

    /* renamed from: w */
    public View.OnLongClickListener f52879w = new FTSVoiceInputLayoutImpl$$b(this);

    /* renamed from: x */
    public View.OnTouchListener f52880x = new FTSVoiceInputLayoutImpl$$c(this);

    public FTSVoiceInputLayoutImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo23847m(context);
    }

    /* renamed from: e */
    public void mo23842e(boolean z) {
        mo23849o(new FTSVoiceInputLayoutImpl$$e(this));
    }

    public C68992b getVoiceInputDrawable() {
        return this.f52875s;
    }

    /* renamed from: i */
    public void mo23844i(int i) {
        mo23849o(new FTSVoiceInputLayoutImpl$$g(this, i));
    }

    /* renamed from: j */
    public void mo23845j() {
        mo23849o(new FTSVoiceInputLayoutImpl$$f(this));
    }

    /* renamed from: l */
    public void mo23846l(boolean z, boolean z2) {
        Log.m105919d("MicroMsg.FTSVoiceInputLayoutImpl", "directStart currentState = %s longUp = %s clickUp = %s", Integer.valueOf(this.f52892f), Boolean.valueOf(z), Boolean.valueOf(z2));
        int i = this.f52892f;
        if (i == 1) {
            if (!z && !z2) {
                Class cls = C103918d.class;
                if (C61104a.m71669y(getContext()) || C61104a.m71665u(getContext()) || C61104a.m71649e(getContext())) {
                    Log.m105918d("MicroMsg.VoiceInputLayout", "voip is running, cann't record voice");
                    mo23845j();
                    return;
                }
                boolean Lb0 = ((C103918d) C86312j.m106911c(cls)).Lb0(getContext(), "android.permission.RECORD_AUDIO");
                Log.m105919d("MicroMsg.VoiceInputLayout", "summerper checkPermission checkMicrophone[%s]", Boolean.valueOf(Lb0));
                if (Lb0) {
                    Log.m105919d("MicroMsg.VoiceInputLayout", "doStart currentState = %s", Integer.valueOf(this.f52892f));
                    if (this.f52892f == 1) {
                        this.f52892f = 2;
                        VoiceInputLayout.C18864e eVar = this.f52890d;
                        if (eVar != null) {
                            eVar.mo23869b();
                        }
                        this.f52899p.startTimer(50);
                        mo23848n(true);
                        Class cls2 = C102111c.class;
                        if (MMApplicationContext.isMMProcess()) {
                            this.f52891e = ((C102111c) C86312j.m106911c(cls2)).Kh0();
                        } else {
                            this.f52891e = ((C102111c) C86312j.m106911c(cls2)).mo141423tS();
                        }
                        this.f52891e.init(1, 8, new C18883h(this));
                        this.f52891e.start();
                        return;
                    }
                    return;
                }
                Activity activity = !(getContext() instanceof Activity) ? this.f52893g : (Activity) getContext();
                if (activity != null) {
                    ((C103918d) C86312j.m106911c(cls)).Uu0(activity, new String[]{"android.permission.RECORD_AUDIO"}, 80, (String) null, (String) null);
                }
                Log.m105924i("MicroMsg.VoiceInputLayout", "context = " + activity);
            } else if (z && !z2) {
                this.f52875s.mo94950c();
            }
        } else if (i == 2) {
            if (!z2) {
                Log.m105919d("MicroMsg.VoiceInputLayout", "do Stop. currentState = %s", Integer.valueOf(i));
                int i2 = this.f52892f;
                if (i2 != 1 && i2 == 2) {
                    this.f52892f = 3;
                    VoiceInputLayout.C18864e eVar2 = this.f52890d;
                    if (eVar2 != null) {
                        eVar2.mo23868a();
                    }
                    MTimerHandler mTimerHandler = this.f52899p;
                    if (mTimerHandler != null) {
                        mTimerHandler.stopTimer();
                    }
                    this.f52897n.removeMessages(0);
                    this.f52897n.sendEmptyMessageDelayed(0, (long) this.f52894h);
                    this.f52897n.sendEmptyMessageDelayed(1, (long) this.f52895i);
                    mo23842e(true);
                    C17800a aVar = this.f52891e;
                    if (aVar != null) {
                        aVar.stop(true);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f52875s.mo94950c();
            mo23860a();
            VoiceInputLayout.C18863d dVar = this.f52896j;
            if (dVar != null) {
                C18874c.C18876b bVar = (C18874c.C18876b) dVar;
                C18874c cVar = C18874c.this;
                Toast toast = cVar.f52929k;
                if (toast != null) {
                    toast.cancel();
                }
                MMActivity mMActivity = cVar.f52919a;
                Toast makeText = C76701a.makeText((Context) mMActivity, (CharSequence) mMActivity.getResources().getString(C0966R.string.f3z), 0);
                cVar.f52929k = makeText;
                makeText.setGravity(17, 0, 0);
                cVar.f52929k.show();
                C18874c.this.f52920b.mo23774b(true, false, "");
            }
        } else if (!z && !z2) {
            mo23860a();
        } else if (z && !z2) {
            this.f52875s.mo94950c();
        }
    }

    /* renamed from: m */
    public void mo23847m(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.atu, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.lbl);
        this.f52873q = findViewById;
        findViewById.setLayerType(1, (Paint) null);
        C68992b bVar = new C68992b(context);
        this.f52875s = bVar;
        this.f52873q.setBackground(bVar);
        this.f52873q.setEnabled(true);
        this.f52873q.setOnTouchListener(this.f52880x);
        this.f52873q.setOnLongClickListener(this.f52879w);
        this.f52874r = (TextView) inflate.findViewById(C0966R.C0970id.egc);
        mo23863k(true);
        if (!isInEditMode() && !NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            mo23849o(new FTSVoiceInputLayoutImpl$$a(this));
            mo23861b(12, -1, -1);
        }
    }

    /* renamed from: n */
    public void mo23848n(boolean z) {
        mo23849o(new FTSVoiceInputLayoutImpl$$d(this, z));
    }

    /* renamed from: o */
    public final void mo23849o(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            MMHandlerThread.postToMainThread(runnable);
        } else {
            runnable.run();
        }
    }

    public void setFTSVoiceDetectListener(FTSVoiceInputLayoutImpl$$h fTSVoiceInputLayoutImpl$$h) {
        super.setVoiceDetectListener(fTSVoiceInputLayoutImpl$$h);
    }

    public FTSVoiceInputLayoutImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo23847m(context);
    }
}
