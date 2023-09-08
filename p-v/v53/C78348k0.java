package v53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import cr3.C75296i;
import f40.C86709a0;
import fr3.C75790l;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: v53.k0 */
public class C78348k0 extends C75790l {

    /* renamed from: d */
    public String f229585d;

    /* renamed from: e */
    public String f229586e;

    /* renamed from: f */
    public String f229587f;

    /* renamed from: g */
    public String f229588g;

    /* renamed from: h */
    public String f229589h;

    /* renamed from: i */
    public String f229590i;

    /* renamed from: j */
    public int f229591j;

    /* renamed from: n */
    public int f229592n;

    /* renamed from: o */
    public long f229593o;

    /* renamed from: p */
    public C78349a f229594p = null;

    /* renamed from: v53.k0$a */
    public interface C78349a {
        /* renamed from: a */
        void mo97595a();
    }

    public C78348k0() {
        setRequestData((Map<String, String>) null);
    }

    /* renamed from: j1 */
    public static boolean m94629j1(boolean z, C75296i iVar, C78349a aVar) {
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_EXPIRE_TIME_LONG, 0L)).longValue();
        if (z || longValue < System.currentTimeMillis()) {
            Log.m105925i("MicroMsg.NetSceneTransferWording", "do scene: %d, force: %B", Long.valueOf(longValue), Boolean.valueOf(z));
            C78348k0 k0Var = new C78348k0();
            k0Var.f229594p = aVar;
            if (iVar != null) {
                iVar.mo105625d(k0Var, false);
            } else {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(k0Var);
            }
            return true;
        }
        Log.m105918d("MicroMsg.NetSceneTransferWording", "not time");
        return false;
    }

    public int getFuncId() {
        return 1992;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/gettransferwording";
    }

    public boolean isBlock() {
        return false;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTransferWording", "errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        Log.m105919d("MicroMsg.NetSceneTransferWording", "json: %s", jSONObject);
        this.f229585d = jSONObject.optString("delay_confirm_wording");
        this.f229586e = jSONObject.optString("delay_confirm_switch_wording");
        this.f229587f = jSONObject.optString("delay_confirm_switch_remind_wording");
        this.f229588g = jSONObject.optString("delay_confirm_switch_remind_half_page_wording");
        this.f229589h = jSONObject.optString("delay_confirm_desc_url");
        this.f229591j = jSONObject.optInt("delay_confirm_desc_url_flag", 0);
        this.f229593o = jSONObject.optLong("expire_time", 0) * 1000;
        this.f229592n = jSONObject.optInt("delay_confirm_switch_flag", 0);
        C86709a0.m107528h();
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        if (!Util.isNullOrNil(this.f229585d)) {
            i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_CONFIRM_WORDING_STRING, this.f229585d);
        }
        if (!Util.isNullOrNil(this.f229586e)) {
            i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, this.f229586e);
        }
        if (!Util.isNullOrNil(this.f229587f)) {
            i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_REMIND_WORDING_STRING, this.f229587f);
        }
        if (!Util.isNullOrNil(this.f229588g)) {
            i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_HALF_PAGE_WORDING_STRING, this.f229588g);
        }
        if (!Util.isNullOrNil(this.f229589h)) {
            try {
                String decode = URLDecoder.decode(this.f229589h, "UTF-8");
                this.f229590i = decode;
                if (!Util.isNullOrNil(decode)) {
                    i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, this.f229590i);
                }
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneTransferWording", e, "", new Object[0]);
            }
        }
        i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, Integer.valueOf(this.f229591j));
        i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_EXPIRE_TIME_LONG, Long.valueOf(this.f229593o));
        i2.mo119677K(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_SHOW_SWITCH_FLAG_INT, Integer.valueOf(this.f229592n));
        C78349a aVar = this.f229594p;
        if (aVar != null) {
            aVar.mo97595a();
        }
    }
}
