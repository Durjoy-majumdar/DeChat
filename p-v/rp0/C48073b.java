package rp0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.JsApiGetAdPushMsg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.Locale;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.mz4;
import te3.nz4;

/* renamed from: rp0.b */
public class C48073b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f128918d;

    /* renamed from: e */
    public C11385n f128919e;

    /* renamed from: f */
    public nz4 f128920f;

    public C48073b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new mz4();
        bVar.f127067b = new nz4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchtitle";
        bVar.f127069d = JsApiGetAdPushMsg.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128918d = a;
        mz4 mz4 = (mz4) a.f127055a.f127080a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetWeAppSearchTitle", "doScene");
        this.f128919e = nVar;
        return dispatch(gVar, this.f128918d, this);
    }

    public int getType() {
        return JsApiGetAdPushMsg.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetWeAppSearchTitle", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f128920f = (nz4) this.f128918d.f127056b.f127083a;
        C11385n nVar = this.f128919e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        if (this.f128920f.f138864d != null) {
            C85801v1 i4 = C86709a0.m107535s().mo121142i();
            i4.mo119677K(C72994y1.C72995a.USERINFO_WXA_SEARCH_INPUT_HINT_LANG_STRING_SYNC, Locale.getDefault().getLanguage());
            i4.mo119677K(C72994y1.C72995a.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_STRING_SYNC, this.f128920f.f138864d.f139470d);
            i4.mo119677K(C72994y1.C72995a.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_ID_STRING_SYNC, this.f128920f.f138864d.f139471e);
            i4.mo119677K(C72994y1.C72995a.USERINFO_WXA_SEARCH_INPUT_HINT_UPDATE_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
            i4.mo119677K(C72994y1.C72995a.USERINFO_WXA_SEARCH_FROM_DESKTOP_INPUT_HINT_CONTENT_STRING_SYNC, this.f128920f.f138865e.f139470d);
            i4.mo119677K(C72994y1.C72995a.USERINFO_WXA_SEARCH_FROM_DESKTOP_MORE_INPUT_HINT_CONTENT_STRING_SYNC, this.f128920f.f138866f.f139470d);
        }
    }
}
