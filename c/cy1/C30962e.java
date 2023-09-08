package cy1;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import ob0.C47350c;
import ob0.C89144l0;
import uw1.C52625c;
import uw1.C52626d;

/* renamed from: cy1.e */
public final class C30962e {

    /* renamed from: a */
    public static final C30962e f83094a = new C30962e();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcy1/e$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: cy1.e$a */
    public static final class C30963a implements C80883e<IPCString, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            Class cls = C30959c.class;
            if (iPCString != null) {
                String str = iPCString.f10315d;
                C87412m.m108593f(str, "hostPath");
                C30958b m = ((C30959c) C86312j.m106911c(cls)).mo57904m(str);
                if (m != null) {
                    if (Util.nowMilliSecond() - m.field_updateTime > ((long) m.field_refresh_duration)) {
                        C30962e.m39279a(C30962e.f83094a, str);
                    } else if (Util.nowMilliSecond() - m.field_updateTime > ((long) m.field_expire_duration)) {
                        ((C30959c) C86312j.m106911c(cls)).mo57903c(str);
                    }
                    if (m.field_hasLiteConf) {
                        if (gVar != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("appid", m.field_appid);
                            bundle.putString("path", m.field_path);
                            bundle.putString("wepkg_id", m.field_wepkg_id);
                            gVar.mo894a(bundle);
                        }
                    } else if (gVar != null) {
                        gVar.mo894a(null);
                    }
                } else {
                    C30962e.m39279a(C30962e.f83094a, str);
                    if (gVar != null) {
                        gVar.mo894a(null);
                    }
                }
            } else if (gVar != null) {
                gVar.mo894a(null);
            }
        }
    }

    /* renamed from: a */
    public static final void m39279a(C30962e eVar, String str) {
        eVar.getClass();
        C47350c.C47352b bVar = new C47350c.C47352b();
        C52625c cVar = new C52625c();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(str);
        cVar.f146936d = linkedList;
        bVar.f127066a = cVar;
        bVar.f127067b = new C52626d();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gameconfigappsvr/geturlliteconf";
        bVar.f127069d = 4830;
        C89144l0.m111429e(bVar.mo72403a(), new C30964f(str), false);
    }
}
