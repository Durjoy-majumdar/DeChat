package fm0;

import bu0.C79818b;
import bu0.C79819c;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83966x;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import js0.C88020k;

/* renamed from: fm0.x0 */
public class C86989x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f252449d;

    /* renamed from: e */
    public final /* synthetic */ int f252450e;

    /* renamed from: f */
    public final /* synthetic */ int f252451f;

    /* renamed from: g */
    public final /* synthetic */ String f252452g;

    /* renamed from: h */
    public final /* synthetic */ String f252453h;

    /* renamed from: i */
    public final /* synthetic */ String f252454i;

    /* renamed from: j */
    public final /* synthetic */ String f252455j;

    /* renamed from: n */
    public final /* synthetic */ C86991y0 f252456n;

    public C86989x0(C86991y0 y0Var, C81925i2 i2Var, int i, int i2, String str, String str2, String str3, String str4) {
        this.f252456n = y0Var;
        this.f252449d = i2Var;
        this.f252450e = i;
        this.f252451f = i2;
        this.f252452g = str;
        this.f252453h = str2;
        this.f252454i = str3;
        this.f252455j = str4;
    }

    public void run() {
        int i;
        int i2;
        C83820i0 currentPage = this.f252449d.getRuntime().mo113042Z().getCurrentPage();
        if (!(currentPage instanceof C83966x)) {
            this.f252449d.mo109647a(this.f252450e, this.f252456n.mo115109j("fail:not TabBar page"));
            return;
        }
        C79819c tabBar = ((C83966x) currentPage).getTabBar();
        int i3 = this.f252451f;
        String str = this.f252452g;
        String str2 = this.f252453h;
        String str3 = this.f252454i;
        String str4 = this.f252455j;
        tabBar.getClass();
        try {
            i = C88020k.m109562m(str3);
        } catch (Exception unused) {
            i = 0;
        }
        try {
            i2 = C88020k.m109562m(str4);
        } catch (Exception unused2) {
            i2 = -1;
        }
        for (int i4 = 0; i4 < tabBar.f233945i.size(); i4++) {
            if (i4 == i3) {
                C79819c.C79829i iVar = tabBar.f233945i.get(i4);
                iVar.f233974f = false;
                iVar.f233975g = "";
                iVar.f233976h = 0;
                iVar.f233977i = -1;
                if ("redDot".equals(str)) {
                    tabBar.f233945i.get(i4).f233974f = true;
                } else if (MimeTypes.BASE_TYPE_TEXT.equals(str)) {
                    tabBar.f233945i.get(i4).f233975g = str2;
                    tabBar.f233945i.get(i4).f233976h = i;
                    tabBar.f233945i.get(i4).f233977i = i2;
                } else if ("none".equals(str)) {
                    tabBar.f233945i.get(i4).f233974f = false;
                    tabBar.f233945i.get(i4).f233975g = "";
                }
            }
        }
        tabBar.mo110002e(new C79818b(tabBar));
        this.f252449d.mo109647a(this.f252450e, this.f252456n.mo115109j("ok"));
    }
}
