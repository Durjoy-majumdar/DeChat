package hx2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.MagicLiveCardMBPkgManagement;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1})
/* renamed from: hx2.b */
public final class C33115b extends C86301e {

    /* renamed from: hx2.b$a */
    public static final class C33116a extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C33116a f89910d = new C33116a();

        public C33116a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicLiveCardMBPkgManagement(str);
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD, C33116a.f89910d);
    }
}
