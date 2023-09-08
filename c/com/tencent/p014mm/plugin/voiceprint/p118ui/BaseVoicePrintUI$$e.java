package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.os.Message;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import j20.C117292a;
import j33.C108550a;
import j33.C108551b;
import k20.C60958c;
import k20.C9556a;
import k33.C117381q;
import p206nj.C100115c;
import pu0.C110248b;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$e */
public class BaseVoicePrintUI$$e implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ BaseVoicePrintUI f347505d;

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$e$a */
    public class C115829a implements PlaySound.OnPlayCompletionListener {
        public C115829a(BaseVoicePrintUI$$e baseVoicePrintUI$$e) {
        }

        public void onCompletion() {
            Log.m105924i("MicroMsg.BaseVoicePrintUI", "play press sound end");
        }
    }

    public BaseVoicePrintUI$$e(BaseVoicePrintUI baseVoicePrintUI) {
        this.f347505d = baseVoicePrintUI;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        Log.m105918d("MicroMsg.BaseVoicePrintUI", "start record");
        PlaySound.play(MMApplicationContext.getContext(), (int) C0966R.string.jv9, (PlaySound.OnPlayCompletionListener) new C115829a(this));
        BaseVoicePrintUI baseVoicePrintUI = this.f347505d;
        baseVoicePrintUI.f347493n = "voice_pt_voice_print_record.rec";
        C117381q qVar = baseVoicePrintUI.f347491i;
        qVar.f351418c = "voice_pt_voice_print_record.rec";
        Log.m105919d("MicroMsg.VoicePrintRecoder", "start filename %s", "voice_pt_voice_print_record.rec");
        C108551b bVar = qVar.f351422g;
        bVar.getClass();
        C110248b.f329777h.mo161664i(bVar, "record");
        bVar.f324936m = new C100115c(baseVoicePrintUI);
        int U = bVar.mo161478U("record", 4);
        bVar.f324937n = false;
        if (U != 0) {
            bVar.mo18021R(100);
        } else {
            new C108550a(bVar).sendEmptyMessageDelayed(0, 50);
        }
        this.f347505d.f347498s.startTimer(100);
        BaseVoicePrintUI baseVoicePrintUI2 = this.f347505d;
        baseVoicePrintUI2.f347490h.mo176349a();
        VoiceTipInfoView voiceTipInfoView = baseVoicePrintUI2.f347490h;
        Log.m105919d("MicroMsg.VoiceTipInfoView", "hideTitle, titleTv.getVisibility:%d, mAnimingTitle:%b", Integer.valueOf(voiceTipInfoView.f347553d.getVisibility()), Boolean.valueOf(voiceTipInfoView.f347554e));
        if (voiceTipInfoView.f347553d.getVisibility() != 0 || voiceTipInfoView.f347554e) {
            Log.m105918d("MicroMsg.VoiceTipInfoView", "hideTitle, directly set to INVISIBLE");
            voiceTipInfoView.f347553d.clearAnimation();
            voiceTipInfoView.f347553d.setVisibility(4);
            voiceTipInfoView.f347553d.invalidate();
        } else {
            voiceTipInfoView.f347553d.clearAnimation();
            voiceTipInfoView.f347554e = true;
            C115843s.m162941a(voiceTipInfoView.f347553d, voiceTipInfoView.getContext(), new C115841q(voiceTipInfoView));
        }
        baseVoicePrintUI2.f347490h.setTipText(baseVoicePrintUI2.f347494o);
        baseVoicePrintUI2.f347499t.stopTimer();
        baseVoicePrintUI2.f347499t.startTimer(500);
        View view = baseVoicePrintUI2.f347488f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "pressMic", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "pressMic", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        VoicePrintVolumeMeter voicePrintVolumeMeter = baseVoicePrintUI2.f347489g;
        voicePrintVolumeMeter.f347550q = false;
        voicePrintVolumeMeter.f347549p = -1.0f;
        voicePrintVolumeMeter.f347551r = false;
        voicePrintVolumeMeter.f347548o = 0.0f;
        voicePrintVolumeMeter.postInvalidate();
        voicePrintVolumeMeter.f347551r = true;
        voicePrintVolumeMeter.f347545i.startTimer((long) VoicePrintVolumeMeter.f347536u);
        voicePrintVolumeMeter.mo176345b();
        return true;
    }
}
