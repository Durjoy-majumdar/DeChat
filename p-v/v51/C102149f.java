package v51;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.smiley.C96945j0;
import com.tencent.p014mm.smiley.C96965r;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import rx3.C13598b0;
import z51.C119061h;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: v51.f */
public final class C102149f extends C86301e implements C119061h {

    /* renamed from: d */
    public String f300803d = "";

    /* renamed from: e */
    public String f300804e = "";

    /* renamed from: f */
    public String f300805f = "";

    /* renamed from: g */
    public String f300806g = "";

    public String G70() {
        if (C87412m.m108589b(this.f300803d, "")) {
            boolean z = C96965r.f284067d;
            this.f300803d = C96965r.C44649c.f121057a.f284073c ? C96965r.f284070g : C96965r.f284069f;
        }
        return this.f300803d;
    }

    /* renamed from: MP */
    public String mo141689MP() {
        if (C87412m.m108589b(this.f300805f, "")) {
            if (C96945j0.f283998s == null) {
                synchronized (C96945j0.class) {
                    if (C96945j0.f283998s == null) {
                        Context context = MMApplicationContext.getContext();
                        C87412m.m108593f(context, "getContext()");
                        C96945j0.f283998s = new C96945j0(context, (C8480h) null);
                        if (MMApplicationContext.isMainProcess()) {
                            Log.m105924i("MicroMsg.QQSmileyManager", "checkNewEmoji");
                        }
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            C96945j0 j0Var = C96945j0.f283998s;
            C87412m.m108591d(j0Var);
            this.f300805f = j0Var.f284000a;
        }
        return this.f300805f;
    }

    public boolean Qe0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_flutter_emoji_init_isolate, true);
    }

    /* renamed from: fJ */
    public boolean mo141691fJ() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_flutter_emoji_enable, true);
    }

    /* renamed from: gU */
    public String mo141692gU() {
        if (C87412m.m108589b(this.f300804e, "")) {
            if (C96945j0.f283998s == null) {
                synchronized (C96945j0.class) {
                    if (C96945j0.f283998s == null) {
                        Context context = MMApplicationContext.getContext();
                        C87412m.m108593f(context, "getContext()");
                        C96945j0.f283998s = new C96945j0(context, (C8480h) null);
                        if (MMApplicationContext.isMainProcess()) {
                            Log.m105924i("MicroMsg.QQSmileyManager", "checkNewEmoji");
                        }
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            C96945j0 j0Var = C96945j0.f283998s;
            C87412m.m108591d(j0Var);
            this.f300804e = j0Var.f284001b;
        }
        return this.f300804e;
    }

    /* renamed from: jF */
    public String mo141693jF() {
        String str = "";
        if (C87412m.m108589b(this.f300806g, str)) {
            C96926b0 b = C96926b0.m124490b();
            if (!Util.isNullOrNil(b.f283935b)) {
                str = b.f283934a + b.f283935b;
            }
            C87412m.m108593f(str, "getInstance().emojiPanelConfigPath");
            this.f300806g = str;
        }
        return this.f300806g;
    }
}
