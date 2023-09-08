package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k33.C117381q;
import kd0.C99125s;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$f */
public class BaseVoicePrintUI$$f implements View.OnTouchListener {

    /* renamed from: d */
    public long f347506d = 0;

    /* renamed from: e */
    public boolean f347507e = false;

    /* renamed from: f */
    public final /* synthetic */ BaseVoicePrintUI f347508f;

    public BaseVoicePrintUI$$f(BaseVoicePrintUI baseVoicePrintUI) {
        this.f347508f = baseVoicePrintUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this.f347508f.getContext(), "android.permission.RECORD_AUDIO", 80, "", this.f347508f.getString(C0966R.string.j1x));
            this.f347507e = z1;
            if (!z1) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            BaseVoicePrintUI baseVoicePrintUI = this.f347508f;
            baseVoicePrintUI.f347492j = false;
            if (!Util.isNullOrNil(baseVoicePrintUI.f347494o)) {
                this.f347506d = System.currentTimeMillis();
                this.f347508f.f347486d.setPressed(true);
                this.f347508f.mo176323I7();
                this.f347508f.f347500u.sendEmptyMessageDelayed(1, 300);
                Log.m105924i("MicroMsg.BaseVoicePrintUI", "mic press down");
            }
        } else if (action == 1 || action == 3) {
            if (!this.f347507e) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            this.f347508f.f347486d.setPressed(false);
            this.f347508f.f347500u.removeMessages(1);
            if (System.currentTimeMillis() - this.f347506d < 300) {
                Log.m105918d("MicroMsg.BaseVoicePrintUI", "just little touch the button, set touchDown to false");
                this.f347508f.f347492j = false;
            } else {
                this.f347508f.f347492j = true;
            }
            Log.m105925i("MicroMsg.BaseVoicePrintUI", "mic press up %d, hasTouchDown:%b", Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(this.f347508f.f347492j));
            VoicePrintVolumeMeter voicePrintVolumeMeter = this.f347508f.f347489g;
            voicePrintVolumeMeter.f347550q = false;
            voicePrintVolumeMeter.f347549p = -1.0f;
            voicePrintVolumeMeter.f347551r = false;
            voicePrintVolumeMeter.f347548o = 0.0f;
            voicePrintVolumeMeter.postInvalidate();
            voicePrintVolumeMeter.f347551r = false;
            voicePrintVolumeMeter.f347545i.stopTimer();
            voicePrintVolumeMeter.postInvalidate();
            this.f347508f.f347498s.stopTimer();
            C117381q qVar = this.f347508f.f347491i;
            qVar.f351422g.mo159435d0(false);
            qVar.f351421f = false;
            Log.m105918d("MicroMsg.VoicePrintRecoder", "stop Record :" + qVar.f351418c);
            synchronized (qVar) {
                Log.m105918d("MicroMsg.VoicePrintRecoder", "stop synchronized Record :" + qVar.f351418c);
                C99125s sVar = qVar.f351416a;
                if (sVar != null) {
                    sVar.stopRecord();
                }
            }
            if (qVar.f351420e != 2) {
                qVar.f351418c = null;
                qVar.f351421f = false;
                Log.m105918d("MicroMsg.VoicePrintRecoder", "Stop " + qVar.f351418c);
            } else {
                long j = qVar.f351419d;
                int ticksToNow = (int) (j <= 0 ? 0 : Util.ticksToNow(j));
                qVar.f351417b = ticksToNow;
                if (ticksToNow < 1000) {
                    Log.m105918d("MicroMsg.VoicePrintRecoder", "Stop " + qVar.f351418c + " by voiceLen: " + qVar.f351417b);
                    qVar.f351418c = "";
                    qVar.f351421f = false;
                } else {
                    qVar.f351421f = true;
                    Log.m105918d("MicroMsg.VoicePrintRecoder", "Stop file success: " + qVar.f351418c);
                }
                qVar.f351418c = "";
            }
            qVar.f351420e = -1;
            Log.m105918d("MicroMsg.VoicePrintRecoder", "bLongEnough " + qVar.f351421f);
            BaseVoicePrintUI baseVoicePrintUI2 = this.f347508f;
            if (!baseVoicePrintUI2.f347492j) {
                baseVoicePrintUI2.f347490h.setErr((int) C0966R.string.kd6);
                this.f347508f.f347490h.mo176351c();
            } else {
                Log.m105918d("MicroMsg.BaseVoicePrintUI", "releaseMic");
                if (!baseVoicePrintUI2.f347491i.f351421f) {
                    baseVoicePrintUI2.f347499t.stopTimer();
                    baseVoicePrintUI2.f347490h.setErr((int) C0966R.string.kd6);
                    baseVoicePrintUI2.f347490h.mo176351c();
                    baseVoicePrintUI2.f347493n = null;
                }
                View view2 = baseVoicePrintUI2.f347488f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "releaseMic", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "releaseMic", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                baseVoicePrintUI2.f347490h.mo176352d();
                baseVoicePrintUI2.f347490h.setTipText(baseVoicePrintUI2.f347494o);
                Log.m105919d("MicroMsg.BaseVoicePrintUI", "localMsgFileName %s", this.f347508f.f347493n);
                if (!Util.isNullOrNil(this.f347508f.f347493n)) {
                    this.f347508f.mo176325K7();
                }
                this.f347506d = 0;
                this.f347508f.f347492j = false;
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
