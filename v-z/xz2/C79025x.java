package xz2;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import eb0.C31543z5;
import go3.C59600d;
import gy3.C87412m;
import kr0.C76630x0;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import qy2.C36206l;
import qy2.C77455o;
import uz2.C65488a0;
import uz2.C65490m;

/* renamed from: xz2.x */
public final class C79025x implements C36206l {

    /* renamed from: d */
    public static long f232031d;

    /* renamed from: xz2.x$a */
    public static final class C79026a extends C77455o {

        /* renamed from: d */
        public final /* synthetic */ C79025x f232032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79026a(String str, C79025x xVar) {
            super(str);
            this.f232032d = xVar;
        }

        /* renamed from: d */
        public boolean mo84142d(Context context, Bundle bundle) {
            String str;
            String string;
            C65488a0 a0Var = this.f225886b;
            int i = 0;
            if (a0Var != null) {
                C79025x xVar = this.f232032d;
                if (C87412m.m108589b(a0Var.f188439d, "12")) {
                    String str2 = "";
                    if (bundle == null || (str = bundle.getString("textStatusModelInfoStr")) == null) {
                        str = str2;
                    }
                    if (!(bundle == null || (string = bundle.getString("clickTagName")) == null)) {
                        str2 = string;
                    }
                    xVar.getClass();
                    C86299o oVar = new C86299o();
                    oVar.f250929a = "gh_390359b3fd13@app";
                    oVar.f250939k = 1190;
                    if (C87412m.m108589b(C79758p.f233760a.mo109878a(C104160f.RepairerConfig_TextStatus_UsePreviewMiniApp_Int, 0), 1)) {
                        i = 2;
                    }
                    oVar.f250931c = i;
                    oVar.f250937i = new C15920y(str, str2);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return false;
        }

        /* renamed from: m */
        public void mo84147m(String str, C65488a0 a0Var) {
            this.f225886b = a0Var;
            this.f225887c = str;
            this.f232032d.getClass();
            ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113299AC(C88273g1.TEXT_STATUS);
            long c = C31543z5.m39453c();
            if (Math.abs(c - C79025x.f232031d) > 3600000) {
                Log.m105918d("MicroMsg.TextStatus.TopicSquareStatusService", "preloadMiniProgram() called");
                ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113580Dm("gh_390359b3fd13@app", 0);
                C79025x.f232031d = c;
            }
        }

        /* renamed from: n */
        public void mo84148n() {
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(mVar, "pullDownParam");
        return null;
    }

    public C77455o l30(String str) {
        return new C79026a(str, this);
    }

    public void release() {
    }
}
