package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import di3.C86312j;
import java.util.ArrayList;
import nj3.C76879j;
import p773yy.C66708h;
import p773yy.C79168k;
import qy2.C77459z;
import uz2.C65488a0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l6 */
public class C57783l6 implements C79168k.C53638a {

    /* renamed from: a */
    public final /* synthetic */ String f165363a;

    /* renamed from: b */
    public final /* synthetic */ int f165364b;

    /* renamed from: c */
    public final /* synthetic */ String f165365c;

    /* renamed from: d */
    public final /* synthetic */ C74085k6 f165366d;

    public C57783l6(C74085k6 k6Var, String str, int i, String str2) {
        this.f165366d = k6Var;
        this.f165363a = str;
        this.f165364b = i;
        this.f165365c = str2;
    }

    /* renamed from: a */
    public void mo82221a(boolean z, String str) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            C65488a0 a0Var = new C65488a0();
            a0Var.f188439d = "11";
            arrayList.add(a0Var);
            C65488a0 a0Var2 = new C65488a0();
            a0Var2.f188439d = "3";
            a0Var2.f188441f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
            arrayList.add(a0Var2);
            C77459z.C63350a aVar = new C77459z.C63350a();
            aVar.mo88254a(this.f165363a);
            aVar.f179715a.f229399d.f147231J = this.f165365c;
            aVar.mo88260g(str);
            aVar.mo88258e("wx7fa037cc7dfabad5@jsticket");
            aVar.mo88259f(this.f165366d.f217409v.mo91565f().getString(C0966R.string.cfz));
            aVar.f179715a.f229416x = "werun_daily_push_list;" + this.f165363a + ";" + this.f165364b;
            aVar.mo88255b(arrayList);
            ((C66708h) C86312j.m106911c(C66708h.class)).L20(this.f165366d.f217409v.mo91565f(), aVar.f179715a);
            return;
        }
        C76879j.m92748s(this.f165366d.f217409v.mo91565f(), this.f165366d.f217409v.mo91565f().getString(C0966R.string.msg_net_error), "");
    }
}
