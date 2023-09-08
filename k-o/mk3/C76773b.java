package mk3;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import p640ox.C77049b;
import te3.ze4;

/* renamed from: mk3.b */
public final class C76773b {

    /* renamed from: a */
    public static final C76774a f224572a = new C76774a((C8480h) null);

    /* renamed from: mk3.b$a */
    public static final class C76774a {
        public C76774a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo107028a(View view, C72963f4 f4Var, boolean z, String str) {
            C87412m.m108594g(f4Var, "msg");
            Log.m105924i("MicroMsg.Chatting.ChatTagSearchSpanClickReportFlow", "bindDataToWidget widget:" + view);
            if (view != null) {
                ze4 ze4 = new ze4();
                ze4.f228684d = f4Var.mo108774y2();
                ze4.f228685e = z ? 2 : 1;
                if (z) {
                    str = f4Var.mo108768t();
                }
                ze4.f228686f = str;
                ze4.f228687g = f4Var.getCreateTime();
                ze4.f228688h = 0;
                ((C77049b) C86312j.m106911c(C77049b.class)).mo72345AH(1, view, ze4);
            }
        }
    }
}
