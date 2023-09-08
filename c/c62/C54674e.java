package c62;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d62.C7240a;
import di3.C86312j;
import h81.C59774i;
import ht1.C60200t1;
import java.util.HashMap;
import l31.C61212e;
import ls3.C10649f;
import o40.C61926c;
import te3.C64238ap2;
import te3.C64279c90;
import te3.C64686ro2;
import wd3.C53155r0;

/* renamed from: c62.e */
public class C54674e extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ Long f153228e;

    /* renamed from: f */
    public final /* synthetic */ Long f153229f;

    /* renamed from: g */
    public final /* synthetic */ String f153230g;

    /* renamed from: h */
    public final /* synthetic */ String f153231h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54674e(int i, C53155r0 r0Var, Long l, Long l2, String str, String str2) {
        super(i, r0Var);
        this.f153228e = l;
        this.f153229f = l2;
        this.f153230g = str;
        this.f153231h = str2;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        Class cls = C60200t1.class;
        Class cls2 = C59774i.class;
        ((C60200t1) C86312j.m106911c(cls)).jm0(this.f153228e.longValue(), this.f153229f.longValue(), "", -1, -1, -1, "temp_17", -1, -1, "", "", System.currentTimeMillis(), -1);
        C64238ap2 ap22 = new C64238ap2();
        ap22.f182124d = this.f153228e.longValue();
        ap22.f182125e = this.f153229f.longValue();
        ap22.f182126f = this.f153230g;
        ap22.f182127g = "";
        ap22.f182128h = "";
        ap22.f182129i = "";
        ap22.f182130j = null;
        C64279c90 c902 = new C64279c90();
        c902.f182444d = "";
        c902.f182445e = "";
        c902.f182447g = -1;
        c902.f182448h = -1;
        c902.f182449i = 1;
        C64686ro2 ro22 = new C64686ro2();
        c902.f182450j = ro22;
        ro22.f185221o = this.f153231h;
        ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(MMApplicationContext.getContext(), (Intent) null, ap22, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
        HashMap hashMap = new HashMap();
        hashMap.put("view_id", "chat_room_live_red_packet");
        hashMap.put("liveId", C61926c.m72691p(this.f153229f.longValue()));
        hashMap.put("feedId", C61926c.m72691p(this.f153228e.longValue()));
        hashMap.put("comment_scene", "temp_17");
        hashMap.put("finder_username", "");
        hashMap.put("session_buffer", "");
        hashMap.put("behaviour_session_id", ((C59774i) C86312j.m106911c(cls2)).mo84751Wb());
        hashMap.put("finder_context_id", ((C59774i) C86312j.m106911c(cls2)).mo84747E());
        hashMap.put("finder_tab_context_id", ((C59774i) C86312j.m106911c(cls2)).mo84749S0());
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", hashMap, 26236);
    }
}
