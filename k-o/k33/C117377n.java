package k33;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import com.tencent.p014mm.plugin.voiceprint.p118ui.VoiceLoginUI;
import com.tencent.p014mm.plugin.voiceprint.p118ui.VoicePrintCreateFinishUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: k33.n */
public class C117377n implements C11385n {

    /* renamed from: d */
    public String f351404d = null;

    /* renamed from: e */
    public C117378a f351405e = null;

    /* renamed from: f */
    public int f351406f = -1;

    /* renamed from: g */
    public String f351407g = null;

    /* renamed from: h */
    public String f351408h = null;

    /* renamed from: i */
    public String f351409i = null;

    /* renamed from: k33.n$a */
    public interface C117378a {
    }

    public C117377n() {
        C97625j3.m125815e().mo123455a(C1884v4.CTRL_INDEX, this);
        C97625j3.m125815e().mo123455a(616, this);
        C97625j3.m125815e().mo123455a(617, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        Class<VoicePrintCreateFinishUI> cls = VoicePrintCreateFinishUI.class;
        Log.m105919d("MicroMsg.VoicePrintLoginService", "onSceneEnd, errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 || i3 == 0) {
            if (yVar.getType() == 618) {
                String str2 = ((C46645f) yVar).f125585f;
                this.f351404d = str2;
                Log.m105919d("MicroMsg.VoicePrintLoginService", "onGetTicket, loginTicket==null:%b", Boolean.valueOf(Util.isNullOrNil(str2)));
                if (!Util.isNullOrNil(this.f351404d)) {
                    C97625j3.m125815e().mo123460f(new C46648h(73, this.f351404d));
                }
            }
            if (yVar.getType() == 616) {
                C46648h hVar = (C46648h) yVar;
                int i4 = hVar.f125593g;
                this.f351406f = i4;
                this.f351407g = hVar.f125592f;
                Log.m105919d("MicroMsg.VoicePrintLoginService", "onFinishGetText, resId:%d, voiceText==null:%b", Integer.valueOf(i4), Boolean.valueOf(Util.isNullOrNil(this.f351407g)));
                C117378a aVar = this.f351405e;
                if (aVar != null) {
                    String str3 = this.f351407g;
                    VoiceLoginUI voiceLoginUI = (VoiceLoginUI) aVar;
                    Log.m105918d("MicroMsg.VoiceLoginUI", "onGetText");
                    voiceLoginUI.f347494o = str3;
                    voiceLoginUI.f347490h.mo176352d();
                    voiceLoginUI.f347490h.setTipText(str3);
                    voiceLoginUI.mo176322H7();
                    voiceLoginUI.f347487e.setEnabled(true);
                }
            }
            if (yVar.getType() == 617) {
                C60967i iVar = (C60967i) yVar;
                if (iVar.f173651n == 0) {
                    Log.m105918d("MicroMsg.VoicePrintLoginService", "onFinishVerify, success");
                    this.f351408h = iVar.f173652o;
                    C117378a aVar2 = this.f351405e;
                    if (aVar2 != null) {
                        ((VoiceLoginUI) aVar2).mo176342N7(true);
                        return;
                    }
                    return;
                }
                Log.m105918d("MicroMsg.VoicePrintLoginService", "onFinishVerify, failed");
                C117378a aVar3 = this.f351405e;
                if (aVar3 != null) {
                    ((VoiceLoginUI) aVar3).mo176342N7(false);
                }
            }
        } else if (i3 == -34 && yVar.getType() == 617) {
            Log.m105918d("MicroMsg.VoicePrintLoginService", "blocked by limit");
            C117378a aVar4 = this.f351405e;
            if (aVar4 != null) {
                VoiceLoginUI voiceLoginUI2 = (VoiceLoginUI) aVar4;
                Intent intent = new Intent(voiceLoginUI2, cls);
                intent.putExtra("kscene_type", 76);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(intent);
                VoiceLoginUI voiceLoginUI3 = voiceLoginUI2;
                C117292a.m165358d(voiceLoginUI3, aVar5.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onBlockedByLimit", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                voiceLoginUI2.startActivity((Intent) aVar5.mo10231a(0));
                C117292a.m165359e(voiceLoginUI3, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onBlockedByLimit", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                voiceLoginUI2.finish();
            }
        } else {
            C117378a aVar6 = this.f351405e;
            if (aVar6 != null) {
                VoiceLoginUI voiceLoginUI4 = (VoiceLoginUI) aVar6;
                Intent intent2 = new Intent(voiceLoginUI4, cls);
                intent2.putExtra("kscene_type", 77);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(intent2);
                VoiceLoginUI voiceLoginUI5 = voiceLoginUI4;
                C117292a.m165358d(voiceLoginUI5, aVar7.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onNetworkError", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                voiceLoginUI4.startActivity((Intent) aVar7.mo10231a(0));
                C117292a.m165359e(voiceLoginUI5, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onNetworkError", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                voiceLoginUI4.finish();
            }
        }
    }
}
