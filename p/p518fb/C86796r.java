package p518fb;

import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p912nb.C88909b;

/* renamed from: fb.r */
public class C86796r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f251936d;

    /* renamed from: e */
    public final /* synthetic */ String f251937e;

    /* renamed from: f */
    public final /* synthetic */ int f251938f;

    /* renamed from: g */
    public final /* synthetic */ C86797s f251939g;

    public C86796r(C86797s sVar, C81925i2 i2Var, String str, int i) {
        this.f251939g = sVar;
        this.f251936d = i2Var;
        this.f251937e = str;
        this.f251938f = i;
    }

    public void run() {
        C83780d1 l0;
        if (this.f251936d.isRunning() && (l0 = this.f251936d.mo114341l0()) != null) {
            C88909b O = C88909b.m110989O(l0.f244552D);
            if (O != null) {
                WAGamePanelInputEditText attachedEditText = O.getAttachedEditText();
                int maxLength = attachedEditText.getMaxLength();
                Log.m105927v("MicroMsg.WAGameJsApiUpdateKeyboard", "maxLength(%d).", Integer.valueOf(maxLength));
                if (!Util.isNullOrNil(this.f251937e)) {
                    if (maxLength > 0) {
                        attachedEditText.setText(this.f251937e.length() > maxLength ? this.f251937e.substring(0, maxLength) : this.f251937e);
                    } else {
                        attachedEditText.setText(this.f251937e);
                    }
                    attachedEditText.setSelection(attachedEditText.getText().length());
                } else {
                    attachedEditText.setText("");
                }
                this.f251936d.mo109647a(this.f251938f, this.f251939g.mo115109j("ok"));
                return;
            }
            this.f251936d.mo109647a(this.f251938f, this.f251939g.mo115109j("fail"));
        }
    }
}
