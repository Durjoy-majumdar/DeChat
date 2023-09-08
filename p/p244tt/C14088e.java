package p244tt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import di3.C7335d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: tt.e */
public interface C14088e extends C7335d {

    /* renamed from: tt.e$a */
    public interface C14089a {
        void onStoreSendResult(String str, int i, String str2, String str3);

        /* renamed from: v3 */
        void mo7500v3(String str, List<C56832d.C56834b> list);
    }

    /* renamed from: tt.e$b */
    public interface C14090b {
        /* renamed from: a */
        void mo1717a();

        /* renamed from: b */
        void mo1718b();
    }

    void Ei0(String str, String str2);

    void Ff0(int i, long j, Intent intent);

    /* renamed from: Jb */
    Class<? extends C80916r<IPCString, IPCString>> mo13503Jb();

    /* renamed from: K8 */
    String mo13504K8(String str, String str2, String str3);

    /* renamed from: KY */
    void mo13505KY();

    void Mk0();

    /* renamed from: Mu */
    int mo13507Mu(String str, String str2, String str3);

    /* renamed from: Mv */
    void mo13508Mv();

    /* renamed from: NR */
    WxaLiteAppInfo mo13509NR(String str);

    /* renamed from: OP */
    void mo13510OP(Context context, Bundle bundle, boolean z, boolean z2, C14090b bVar);

    void Od0(C14089a aVar);

    /* renamed from: Tg */
    WxaLiteAppBaselibInfo mo13512Tg();

    /* renamed from: Wx */
    WxaLiteAppStartReport mo13513Wx(int i, WxaLiteAppStartReport wxaLiteAppStartReport);

    /* renamed from: aF */
    void mo13514aF(Boolean bool);

    /* renamed from: b7 */
    boolean mo13515b7();

    /* renamed from: bG */
    void mo13516bG(Context context);

    boolean e00(String str);

    void f20(C14089a aVar);

    /* renamed from: f6 */
    int mo13519f6(JSONObject jSONObject);

    void fh0(String str, String str2, String str3);

    int g00(JSONObject jSONObject);

    void gc0(Context context, Bundle bundle, boolean z, boolean z2, C56832d dVar, C14090b bVar);

    boolean isInitialized();

    void j00(String str, String str2);

    /* renamed from: ke */
    void mo13525ke(Context context, Bundle bundle, boolean z, JSONObject jSONObject, JSONArray jSONArray, C14090b bVar);

    void onStoreSendResult(String str, int i, String str2, String str3);

    void sd0(C4770c cVar, Intent intent, int i);

    void t70(WxaLiteAppInfo wxaLiteAppInfo);

    void u50(String str, C115477b bVar);

    /* renamed from: uu */
    boolean mo13530uu(String str);

    /* renamed from: v3 */
    void mo13531v3(String str, List<C56832d.C56834b> list);

    /* renamed from: yV */
    void mo13532yV(Context context, String str, C14090b bVar);
}
