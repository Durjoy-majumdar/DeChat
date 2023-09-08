package k33;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voiceprint.p118ui.VoiceUnLockUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: k33.r */
public class C117386r implements C11385n {

    /* renamed from: d */
    public C117387a f351428d = null;

    /* renamed from: e */
    public int f351429e = -1;

    /* renamed from: f */
    public String f351430f = null;

    /* renamed from: g */
    public String f351431g = null;

    /* renamed from: k33.r$a */
    public interface C117387a {
    }

    public C117386r(C117387a aVar) {
        C97625j3.m125815e().mo123455a(611, this);
        C97625j3.m125815e().mo123455a(613, this);
        this.f351428d = aVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.VoicePrintUnLockService", "onSceneEnd, errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 || i2 == 0) {
            if (yVar.getType() == 611) {
                C46644e eVar = (C46644e) yVar;
                int i3 = eVar.f125581g;
                this.f351429e = i3;
                this.f351430f = eVar.f125580f;
                this.f351431g = eVar.f125582h;
                Log.m105919d("MicroMsg.VoicePrintUnLockService", "onGetVoiceText, resId:%d, verifyKey:%s, voiceText==null:%b", Integer.valueOf(i3), this.f351431g, Boolean.valueOf(Util.isNullOrNil(this.f351430f)));
                C117387a aVar = this.f351428d;
                if (aVar != null) {
                    String str2 = this.f351430f;
                    VoiceUnLockUI voiceUnLockUI = (VoiceUnLockUI) aVar;
                    voiceUnLockUI.f347494o = str2;
                    voiceUnLockUI.f347490h.mo176352d();
                    voiceUnLockUI.f347490h.setTipText(str2);
                    voiceUnLockUI.mo176322H7();
                    voiceUnLockUI.f347487e.setEnabled(true);
                }
            }
            if (yVar.getType() != 613) {
                return;
            }
            if (((C60970k) yVar).f173663n == 0) {
                Log.m105918d("MicroMsg.VoicePrintUnLockService", "onVerify, success");
                C117387a aVar2 = this.f351428d;
                if (aVar2 != null) {
                    ((VoiceUnLockUI) aVar2).mo176360N7(true);
                    return;
                }
                return;
            }
            Log.m105918d("MicroMsg.VoicePrintUnLockService", "onVerify, failed");
            C117387a aVar3 = this.f351428d;
            if (aVar3 != null) {
                ((VoiceUnLockUI) aVar3).mo176360N7(false);
            }
        } else if (i2 == -34) {
            Log.m105918d("MicroMsg.VoicePrintUnLockService", "blocked by limit");
            C117387a aVar4 = this.f351428d;
            if (aVar4 != null) {
                VoiceUnLockUI voiceUnLockUI2 = (VoiceUnLockUI) aVar4;
                voiceUnLockUI2.f347490h.setErr((int) C0966R.string.kd5);
                voiceUnLockUI2.f347490h.mo176351c();
            }
        } else {
            C117387a aVar5 = this.f351428d;
            if (aVar5 != null) {
                VoiceUnLockUI voiceUnLockUI3 = (VoiceUnLockUI) aVar5;
                voiceUnLockUI3.f347490h.setErr((int) C0966R.string.kd7);
                voiceUnLockUI3.f347490h.mo176351c();
            }
        }
    }
}
