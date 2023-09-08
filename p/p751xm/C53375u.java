package p751xm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44621a1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44623b1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6694z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import p763ym.C39072t;
import qo3.C77426q;

@C86522b
/* renamed from: xm.u */
public class C53375u extends C86301e implements C39072t {
    public void Fj0(Bundle bundle, BaseResp baseResp, String str) {
        C44621a1.m49068a(bundle, baseResp, str);
    }

    /* renamed from: Vp */
    public void mo61913Vp(String str, String str2, String str3, boolean z) {
        String str4 = str3;
        if (!z) {
            Log.m105929w("MicroMsg.OpenBusinessViewUtil", "launchUpdateRoomToOpenImChatroom businessType:%s appid:%s extInfo:%s isSameAccount:%s", str, str2, str4, Boolean.valueOf(z));
            Context context = MMApplicationContext.getContext();
            C77426q qVar = new C77426q(context);
            qVar.mo107595g(context.getString(C0966R.string.hfo));
            qVar.mo107601m(C0966R.string.a18);
            qVar.mo107600l(new C6694z0(context));
            qVar.mo107603o();
            return;
        }
        try {
            String string = new JSONObject(str4).getString("ticket");
            Intent intent = new Intent();
            intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI");
            intent.addFlags(268435456);
            intent.putExtra("upgrade_openim_room_from_scene", 3);
            intent.putExtra("ticket", Util.nullAs(string, ""));
            Context context2 = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/OpenBusinessViewUtil", "launchUpdateRoomToOpenImChatroom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/pluginsdk/ui/tools/OpenBusinessViewUtil", "launchUpdateRoomToOpenImChatroom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Log.m105925i("MicroMsg.OpenBusinessViewUtil", "launchUpdateRoomToOpenImChatroom ticket:%s", Util.nullAs(string, ""));
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.OpenBusinessViewUtil", "launchUpdateRoomToOpenImChatroom Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    public boolean bi0(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.OpenBusinessViewUtil", "isSameAccount appid is null");
            return true;
        }
        C44561j g = C44565l.m48987g(str);
        if (g == null) {
            Log.m105924i("MicroMsg.OpenBusinessViewUtil", "isSameAccount appInfo is null");
            return true;
        } else if (Util.isNullOrNil(str2)) {
            Log.m105924i("MicroMsg.OpenBusinessViewUtil", "isSameAccount openId is null");
            return true;
        } else {
            Log.m105925i("MicroMsg.OpenBusinessViewUtil", "isSameAccount %s/%s", str2, g.field_openId);
            return str2.equalsIgnoreCase(g.field_openId);
        }
    }

    public boolean r10(String str, String str2, String str3, int i, String str4) {
        C44561j g = C44565l.m48987g(str3);
        if (g == null) {
            Log.m105920e("MicroMsg.OpenBusinessViewUtil", "launchBackApp info is null");
            return false;
        }
        Bundle bundle = new Bundle();
        WXOpenBusinessView.Resp resp = new WXOpenBusinessView.Resp(bundle);
        resp.extMsg = str2;
        resp.errStr = str4;
        resp.openId = g.field_openId;
        resp.errCode = i;
        resp.businessType = str;
        resp.transaction = C44623b1.f121003a;
        C44621a1.m49068a(bundle, resp, g.field_packageName);
        return true;
    }
}
