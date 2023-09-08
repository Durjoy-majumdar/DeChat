package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import com.tencent.p014mm.modelvoiceaddr.C17800a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout */
public abstract class VoiceInputLayout extends X2CLinearLayout {

    /* renamed from: d */
    public C18864e f52890d = null;

    /* renamed from: e */
    public C17800a f52891e;

    /* renamed from: f */
    public int f52892f = 1;

    /* renamed from: g */
    public Activity f52893g = null;

    /* renamed from: h */
    public int f52894h = 3000;

    /* renamed from: i */
    public int f52895i = 10000;

    /* renamed from: j */
    public C18863d f52896j;

    /* renamed from: n */
    public MMHandler f52897n = new C18860a();

    /* renamed from: o */
    public MMHandler f52898o = new C18861b();

    /* renamed from: p */
    public final MTimerHandler f52899p = new MTimerHandler(new C18862c(), true);

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout$a */
    public class C18860a extends MMHandler {
        public C18860a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    Log.m105929w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", Integer.valueOf(VoiceInputLayout.this.f52892f));
                } else {
                    return;
                }
            }
            Log.m105919d("MicroMsg.VoiceInputLayout", "Recognized force finished %s", Integer.valueOf(VoiceInputLayout.this.f52892f));
            VoiceInputLayout voiceInputLayout = VoiceInputLayout.this;
            if (voiceInputLayout.f52892f == 3) {
                voiceInputLayout.f52897n.removeMessages(0);
                VoiceInputLayout.this.f52897n.removeMessages(1);
                C17800a aVar = VoiceInputLayout.this.f52891e;
                if (aVar != null) {
                    aVar.cancel(true);
                }
                VoiceInputLayout.this.mo23863k(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout$b */
    public class C18861b extends MMHandler {
        public C18861b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                VoiceInputLayout voiceInputLayout = VoiceInputLayout.this;
                Log.m105919d("MicroMsg.VoiceInputLayout", "doWaiting currentState = %s", Integer.valueOf(voiceInputLayout.f52892f));
                if (voiceInputLayout.f52892f == 2) {
                    voiceInputLayout.f52892f = 3;
                    voiceInputLayout.f52897n.removeMessages(0);
                    voiceInputLayout.f52897n.sendEmptyMessageDelayed(0, (long) voiceInputLayout.f52894h);
                    voiceInputLayout.f52897n.sendEmptyMessageDelayed(1, (long) voiceInputLayout.f52895i);
                    voiceInputLayout.mo23842e(false);
                }
            } else if (i == 1) {
                Bundle data = message.getData();
                VoiceInputLayout.this.mo23861b(data.getInt("localCode"), data.getInt("errType"), data.getInt("errCode"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout$c */
    public class C18862c implements MTimerHandler.CallBack {
        public C18862c() {
        }

        public boolean onTimerExpired() {
            C17800a aVar = VoiceInputLayout.this.f52891e;
            if (aVar == null) {
                return true;
            }
            int maxAmplitudeRate = aVar.getMaxAmplitudeRate();
            VoiceInputLayout voiceInputLayout = VoiceInputLayout.this;
            if (voiceInputLayout.f52892f == 2) {
                voiceInputLayout.mo23844i(maxAmplitudeRate);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout$d */
    public interface C18863d {
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout$e */
    public interface C18864e {
        /* renamed from: a */
        void mo23868a();

        /* renamed from: b */
        void mo23869b();

        /* renamed from: c */
        void mo23870c(int i, int i2, int i3);

        /* renamed from: d */
        void mo23871d(String[] strArr, List<String> list);

        /* renamed from: e */
        void mo23872e();

        /* renamed from: f */
        void mo23873f();

        /* renamed from: g */
        void mo23874g();
    }

    public VoiceInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo23860a() {
        Log.m105919d("MicroMsg.VoiceInputLayout", "doCancel. state = %s", Integer.valueOf(this.f52892f));
        if (this.f52892f != 1) {
            this.f52892f = 1;
            C18864e eVar = this.f52890d;
            if (eVar != null) {
                eVar.mo23874g();
            }
            C17800a aVar = this.f52891e;
            if (aVar != null) {
                aVar.cancel(true);
            }
            mo23845j();
        }
    }

    /* renamed from: b */
    public void mo23861b(int i, int i2, int i3) {
        Log.m105919d("MicroMsg.VoiceInputLayout", "doNetworkError localerrorType:%s,errorType:%s,errCode:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.f52892f = 1;
        mo23845j();
        C18864e eVar = this.f52890d;
        if (eVar != null) {
            eVar.mo23870c(i, i2, i3);
        }
    }

    /* renamed from: e */
    public abstract void mo23842e(boolean z);

    public int getCurrentState() {
        return this.f52892f;
    }

    /* renamed from: i */
    public abstract void mo23844i(int i);

    /* renamed from: j */
    public abstract void mo23845j();

    /* renamed from: k */
    public void mo23863k(boolean z) {
        C18864e eVar;
        Log.m105919d("MicroMsg.VoiceInputLayout", "reset currentState %s", Integer.valueOf(this.f52892f));
        if (this.f52892f != 1) {
            this.f52892f = 1;
            mo23845j();
            if (z && (eVar = this.f52890d) != null) {
                eVar.mo23872e();
            }
        }
    }

    public void setActivity(Activity activity) {
        this.f52893g = activity;
    }

    public void setFromFullScreen(boolean z) {
    }

    public void setLongClickLisnter(C18863d dVar) {
        this.f52896j = dVar;
    }

    public void setVoiceDetectListener(C18864e eVar) {
        this.f52890d = eVar;
    }

    public VoiceInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
