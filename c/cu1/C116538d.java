package cu1;

import android.os.Bundle;
import com.tencent.p014mm.network.C114770g;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: cu1.d */
public class C116538d implements C116537a {

    /* renamed from: cu1.d$a */
    public static class C116539a extends C117747y {

        /* renamed from: d */
        public Bundle f349508d;

        public int doScene(C114770g gVar, C11385n nVar) {
            return 0;
        }

        public int getType() {
            return 0;
        }
    }

    /* renamed from: a */
    public String mo70688a() {
        return "faceverify_ticket";
    }

    /* renamed from: b */
    public void mo70689b(int i, long j, String str, String str2, String str3, String str4, int i2, float f, int i3, C11385n nVar) {
        Bundle bundle = new Bundle();
        bundle.putString("err_msg", "ok");
        bundle.putString("key_pic_cdn_id", str);
        bundle.putString("key_cdn_aes_key", str2);
        bundle.putString("k_bio_id", j + "");
        bundle.putInt("check_alive_type", i2);
        bundle.putBoolean("selfHandle", true);
        C116539a aVar = new C116539a();
        aVar.f349508d = bundle;
        nVar.onSceneEnd(0, 0, "ok", aVar);
    }

    public int getType() {
        return 0;
    }
}
