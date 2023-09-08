package g61;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagement;
import com.tencent.p014mm.plugin.emoji.magicemoji.pkg.MagicEmojiMBPkgManagementCocos;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1})
/* renamed from: g61.b */
public final class C32318b extends C86301e {

    /* renamed from: g61.b$a */
    public static final class C32319a extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C32319a f85800d = new C32319a();

        public C32319a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicEmojiMBPkgManagement(str);
        }
    }

    /* renamed from: g61.b$b */
    public static final class C32320b extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C32320b f85801d = new C32320b();

        public C32320b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicEmojiMBPkgManagementCocos(str);
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        C30211n0 n0Var = (C30211n0) C86312j.m106911c(C30211n0.class);
        n0Var.mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_EMOJI, C32319a.f85800d);
        n0Var.mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_EMOJI_COCOS, C32320b.f85801d);
    }
}
