package k33;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voiceprint.p118ui.VoiceCreateUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: k33.l */
public class C117375l implements C11385n {

    /* renamed from: d */
    public int f351399d = 71;

    /* renamed from: e */
    public String f351400e = null;

    /* renamed from: f */
    public int f351401f = 0;

    /* renamed from: g */
    public int f351402g = 0;

    /* renamed from: h */
    public C117376a f351403h = null;

    /* renamed from: k33.l$a */
    public interface C117376a {
    }

    public C117375l(C117376a aVar) {
        C97625j3.m125815e().mo123455a(611, this);
        C97625j3.m125815e().mo123455a(612, this);
        this.f351403h = aVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117376a aVar;
        Log.m105919d("MicroMsg.VoicePrintCreateService", "onSceneEnd, errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 || i2 == 0) {
            if (yVar.getType() == 611) {
                C46644e eVar = (C46644e) yVar;
                int i3 = eVar.f125581g;
                this.f351401f = i3;
                this.f351400e = eVar.f125580f;
                Log.m105919d("MicroMsg.VoicePrintCreateService", "onFinishGetText, resId:%d, voiceText==null:%b", Integer.valueOf(i3), Boolean.valueOf(Util.isNullOrNil(this.f351400e)));
                C117376a aVar2 = this.f351403h;
                if (aVar2 != null) {
                    int i4 = this.f351399d;
                    if (i4 == 71) {
                        String str2 = this.f351400e;
                        VoiceCreateUI voiceCreateUI = (VoiceCreateUI) aVar2;
                        Log.m105918d("MicroMsg.VoiceCreateUI", "onGetFirstText");
                        voiceCreateUI.mo176327M7();
                        voiceCreateUI.f347494o = str2;
                        voiceCreateUI.mo176322H7();
                        voiceCreateUI.f347490h.mo176352d();
                        voiceCreateUI.f347490h.setTipText(str2);
                        voiceCreateUI.f347487e.setEnabled(true);
                    } else if (i4 == 72) {
                        ((VoiceCreateUI) aVar2).mo176335O7(this.f351400e);
                    }
                }
            }
            if (yVar.getType() == 612) {
                C60966g gVar = (C60966g) yVar;
                int i5 = gVar.f173642n;
                boolean z = (i5 == 72 && gVar.f173643o == 0) || i5 == 71;
                if (z) {
                    Log.m105919d("MicroMsg.VoicePrintCreateService", "onRegister, ok, step:%d", Integer.valueOf(i5));
                    this.f351402g = gVar.f173641j;
                    C117376a aVar3 = this.f351403h;
                    if (aVar3 != null) {
                        ((VoiceCreateUI) aVar3).mo176334N7(true, gVar.f173642n);
                    }
                } else {
                    Log.m105919d("MicroMsg.VoicePrintCreateService", "onRegister, not ok, step:%d", Integer.valueOf(i5));
                    C117376a aVar4 = this.f351403h;
                    if (aVar4 != null) {
                        ((VoiceCreateUI) aVar4).mo176334N7(false, gVar.f173642n);
                    }
                }
                if (z && gVar.f173642n == 71 && (aVar = this.f351403h) != null) {
                    ((VoiceCreateUI) aVar).mo176335O7(this.f351400e);
                }
            }
        } else if (i2 == -34) {
            Log.m105918d("MicroMsg.VoicePrintCreateService", "blocked by limit");
            C117376a aVar5 = this.f351403h;
            if (aVar5 != null) {
                VoiceCreateUI voiceCreateUI2 = (VoiceCreateUI) aVar5;
                if (Util.isNullOrNil(str)) {
                    str = voiceCreateUI2.getString(C0966R.string.kd5);
                }
                voiceCreateUI2.f347490h.setErr(str);
                voiceCreateUI2.f347490h.mo176351c();
                voiceCreateUI2.mo176336P7();
            }
        } else {
            C117376a aVar6 = this.f351403h;
            if (aVar6 != null) {
                VoiceCreateUI voiceCreateUI3 = (VoiceCreateUI) aVar6;
                voiceCreateUI3.f347490h.setErr((int) C0966R.string.kd7);
                voiceCreateUI3.f347490h.mo176351c();
                voiceCreateUI3.mo176336P7();
            }
        }
    }
}
