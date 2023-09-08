package com.tencent.p014mm.plugin.webview.luggage;

import aw0.C0225d;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45298c;
import java.util.HashSet;
import java.util.Set;
import p829xa.C53311a;
import p829xa.C53314b;
import p829xa.C53315c;
import qe3.C25549c;
import uv0.C111237j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.y0 */
public class C43689y0 extends C105052s {

    /* renamed from: v */
    public static final Set<String> f118060v;

    /* renamed from: s */
    public C43658n f118061s;

    /* renamed from: t */
    public boolean f118062t;

    /* renamed from: u */
    public String f118063u;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.y0$a */
    public static class C43690a implements C53311a {

        /* renamed from: c */
        public C43658n f118064c;

        /* renamed from: d */
        public C45298c f118065d;

        /* renamed from: e */
        public Set<String> f118066e = new HashSet();

        public C43690a(C43658n nVar, C45298c cVar) {
            this.f118064c = nVar;
            this.f118065d = cVar;
        }

        /* renamed from: a */
        public void mo67999a(String str, C53315c cVar) {
            cVar.mo73817a(C53314b.PASS);
        }

        /* renamed from: b */
        public void mo68000b(String str, C53315c cVar) {
            C53314b bVar = C53314b.PASS;
            if (((HashSet) this.f118066e).contains(str)) {
                ((HashSet) this.f118066e).remove(str);
                cVar.mo73817a(bVar);
                return;
            }
            C45298c cVar2 = this.f118065d;
            String v = this.f118064c.mo67943v();
            cVar2.getClass();
            C25549c.C12172h b = C25549c.m33051b(str);
            int d = cVar2.mo70841g(v).mo69443d(b == null ? -1 : b.f35270c);
            boolean z = true;
            if (d != 1) {
                z = false;
            }
            if (!z) {
                bVar = C53314b.REJECT;
            }
            cVar.mo73817a(bVar);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f118060v = hashSet;
        hashSet.add(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
    }

    public C43689y0(C111237j jVar, C43658n nVar) {
        super(jVar);
        this.f118061s = nVar;
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        Log.m105925i("MicroMsg.LuggageWebViewFloatBallHelper", "onCreate, type:%s, key:%s", Integer.valueOf(i), str);
        super.mo35648A(i, str);
        getReportInfo().f311717f = 8;
        getReportInfo().f311716e = 32;
        mo68414O();
        if (!(this.f311808n.getIntent() == null || this.f311726d.f311678C == null)) {
            C0225d.m179c(this.f311808n.getIntent(), this.f311726d.f311678C, f118060v);
            mo68414O();
        }
        this.f118062t = true;
        if (!Util.isNullOrNil(this.f118063u)) {
            mo67997C0(this.f118063u);
        }
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        Log.m105925i("MicroMsg.LuggageWebViewFloatBallHelper", "onDestroy :%s", Integer.valueOf(this.f118061s.hashCode()));
        super.mo67996A0();
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105925i("MicroMsg.LuggageWebViewFloatBallHelper", "onExitPage :%s", Integer.valueOf(this.f118061s.hashCode()));
        super.mo64001C();
    }

    /* renamed from: C0 */
    public void mo67997C0(String str) {
        this.f118063u = str;
        if (this.f118062t) {
            getReportInfo().f311718g = str;
            mo68414O();
        }
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return this.f118061s.mo67930A();
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return this.f118061s.mo67930A() && this.f311808n.mo23516g();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.LuggageWebViewFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent:%s", Integer.valueOf(this.f118061s.hashCode()));
        this.f311808n.mo23513d(false);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105925i("MicroMsg.LuggageWebViewFloatBallHelper", "onEnterPage :%s", Integer.valueOf(this.f118061s.hashCode()));
        super.mo64003o();
    }

    /* renamed from: q0 */
    public void mo67998q0(String str) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo == null || Util.isNullOrNil(ballInfo.f311699t) || this.f311726d.f311699t.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || this.f311726d.f311699t.startsWith(HttpWrapperBase.PROTOCAL_HTTPS) || Util.isNullOrNil(str) || (!str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS))) {
            super.mo67998q0(str);
        }
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        Log.m105925i("MicroMsg.LuggageWebViewFloatBallHelper", "onClose :%s", Integer.valueOf(this.f118061s.hashCode()));
        return super.mo64004y0(i);
    }
}
