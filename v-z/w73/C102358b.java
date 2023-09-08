package w73;

import android.content.Context;
import android.view.Window;
import androidx.appcompat.app.C103422m;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.HashMap;
import kv1.C99251g;
import oa1.C117731d;
import p662ql.C101204b;
import p662ql.C101205c;
import te3.C101823o70;
import x73.C102570e;
import yf3.C39005a;

@C86522b
/* renamed from: w73.b */
public final class C102358b extends C86301e implements C101205c {
    /* renamed from: C8 */
    public String mo140643C8() {
        String k = C99251g.m129290k(78);
        C87412m.m108593f(k, "getUnsignedMd5UInt(Const…ARCH_SCENE_CHAT_EMO_MORE)");
        return k;
    }

    /* renamed from: CC */
    public C103422m mo140644CC(Context context, String str, String str2, int i, C101204b bVar, String str3, boolean z, boolean z2) {
        int i2;
        Context context2 = context;
        String str4 = str;
        int i3 = i;
        String str5 = str3;
        boolean z3 = z;
        boolean z4 = z2;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str4, "talker");
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87412m.m108594g(str5, "sessionId");
        C15050d dVar = C15050d.f41189a;
        String str6 = str2 == null ? "" : str2;
        C101823o70 o702 = new C101823o70();
        HashMap hashMap = new HashMap();
        int i4 = ChatFooterPanel.f211589f;
        Integer num = 18;
        if (num.equals(Integer.valueOf(i))) {
            i2 = 94;
        } else {
            Integer num2 = 3;
            i2 = num2.equals(Integer.valueOf(i)) ? 128 : 71;
        }
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(i2));
        hashMap.put("sessionId", str5);
        hashMap.put("subSessionId", str5);
        hashMap.put("toSendText", str6);
        String str7 = "1";
        hashMap.put("isHomePage", str7);
        hashMap.put("talker", str4);
        if (!Util.isOverseasUser(context)) {
            str7 = "0";
        }
        hashMap.put("isOverseaApp", str7);
        dVar.mo14071b(hashMap);
        o702.f298979g = dVar.mo14070a(hashMap);
        o702.f298984o = str4;
        o702.f298985p = str6;
        o702.f298977e = str5;
        o702.f298978f = i2;
        o702.f298981i = "";
        o702.f298976d = "";
        o702.f298980h = "";
        o702.f298986q = i3;
        o702.f298988s = z3 ? 1 : 0;
        o702.f298989t = z4 ? 1 : 0;
        if (i3 != 1) {
            o702.f298987r = 1;
        } else if (C117731d.m166007c().mo182440a(new C39005a()) == 1) {
            o702.f298987r = 0;
        } else {
            o702.f298987r = 1;
        }
        C102570e eVar = new C102570e(z3 ? new C85978w1(context2, C0966R.style.a8f) : new C85978w1(context2, C0966R.style.a8g), o702, bVar);
        eVar.show();
        Window window = eVar.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        C115669n.INSTANCE.mo160131h(21160, Long.valueOf(System.currentTimeMillis()), str5, 0, 0, 0, 1);
        Log.m105924i("MicroMsg.WebSearch.EmojiSearchUILogic", "startEmojiSearchDialog scene:" + o702.f298978f + ", url:" + o702.f298979g + ", forceDarkMode:" + z3 + ", hideJumpMoreEntrance:" + z4);
        return eVar;
    }

    /* renamed from: sR */
    public String mo140645sR() {
        String k = C99251g.m129290k(78);
        C87412m.m108593f(k, "getUnsignedMd5UInt(Const…ARCH_SCENE_CHAT_EMO_MORE)");
        return k;
    }
}
