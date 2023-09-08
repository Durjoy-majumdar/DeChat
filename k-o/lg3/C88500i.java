package lg3;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hi3.C87515a;
import ii3.C87739b;
import p996kj.C88155a;

/* renamed from: lg3.i */
public class C88500i {

    /* renamed from: a */
    public C87515a f255638a = new C87515a();

    /* renamed from: lg3.i$a */
    public static class C88501a implements C88155a.C88156a {

        /* renamed from: a */
        public C87515a f255639a = new C87515a();
    }

    static {
        C88155a.f254941a = new C88501a();
        C87739b.f254035d = MMApplicationContext.getContext().getSharedPreferences("wechat_svg_debug", 4).getBoolean("open_tag", false);
    }

    /* renamed from: a */
    public static void m110373a(boolean z) {
        MMApplicationContext.getContext().getSharedPreferences("wechat_svg_debug", 4).edit().putBoolean("open_tag", z).commit();
        C87739b.f254035d = z;
    }
}
