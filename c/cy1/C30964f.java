package cy1;

import com.tencent.p014mm.plugin.wepkg.version.WepkgVersionUpdater;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import sx3.C64197v;
import uw1.C52626d;
import uw1.C52627e;
import uw1.C52629g;
import zt3.C119157j;

/* renamed from: cy1.f */
public final class C30964f implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ String f83095d;

    /* renamed from: cy1.f$a */
    public static final class C30965a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C52626d f83096d;

        /* renamed from: e */
        public final /* synthetic */ String f83097e;

        public C30965a(C52626d dVar, String str) {
            this.f83096d = dVar;
            this.f83097e = str;
        }

        public final void run() {
            LinkedList<C52629g> linkedList = this.f83096d.f146937d;
            C87412m.m108593f(linkedList, "response.url_lite_conf_list");
            String str = this.f83097e;
            for (C52629g gVar : linkedList) {
                C30958b bVar = new C30958b();
                bVar.field_url = str;
                C52627e eVar = gVar.f146949f;
                String str2 = null;
                bVar.field_appid = eVar != null ? eVar.f146938d : null;
                bVar.field_path = eVar != null ? eVar.f146939e : null;
                bVar.field_expire_duration = eVar != null ? eVar.f146940f : 0;
                bVar.field_refresh_duration = eVar != null ? eVar.f146941g : 0;
                bVar.field_wepkg_id = eVar != null ? eVar.f146942h : null;
                bVar.field_updateTime = System.currentTimeMillis();
                bVar.field_hasLiteConf = gVar.f146948e;
                C52627e eVar2 = gVar.f146949f;
                String str3 = eVar2 != null ? eVar2.f146942h : null;
                if (!(str3 == null || str3.length() == 0)) {
                    String[] strArr = new String[1];
                    C52627e eVar3 = gVar.f146949f;
                    if (eVar3 != null) {
                        str2 = eVar3.f146942h;
                    }
                    strArr[0] = str2;
                    WepkgVersionUpdater.m48921a(C64197v.m75534c(strArr), 4);
                }
                ((C30959c) C86312j.m106911c(C30959c.class)).mo57902Cf(bVar);
            }
        }
    }

    public C30964f(String str) {
        this.f83095d = str;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C47465a aVar;
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.luggage.game.GetUrlLiteConfResponse");
            C52626d dVar = (C52626d) aVar;
            LinkedList<C52629g> linkedList = dVar.f146937d;
            if (!(linkedList == null || linkedList.isEmpty())) {
                ((C119157j) C119157j.f356862d).mo183875f(new C30965a(dVar, this.f83095d));
            }
        }
        return 0;
    }
}
