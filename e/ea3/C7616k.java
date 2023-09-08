package ea3;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ea3.k */
public final class C7616k {

    /* renamed from: a */
    public static final C7616k f25897a = new C7616k();

    /* renamed from: b */
    public static final C13601g f25898b = C36568h.m40985a(C7617a.f25899d);

    /* renamed from: ea3.k$a */
    public static final class C7617a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C7617a f25899d = new C7617a();

        public C7617a() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = false;
            if ((hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_open_biz_thumb_player, 1) == 1) || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public final boolean mo8749a() {
        StringBuilder sb = new StringBuilder();
        sb.append("isUseThumbPlayer: ");
        C13601g gVar = f25898b;
        sb.append(((Boolean) ((C36570n) gVar).getValue()).booleanValue());
        Log.m105924i("MicroMsg.WebViewAbtestUtil", sb.toString());
        return ((Boolean) ((C36570n) gVar).getValue()).booleanValue();
    }
}
