package ix1;

import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.luggage.C41985r;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C117627q;
import yw1.C53601h;

/* renamed from: ix1.w */
public class C46349w implements C41985r.C41989d {

    /* renamed from: a */
    public final /* synthetic */ JumpInfo f124915a;

    /* renamed from: b */
    public final /* synthetic */ C46337n f124916b;

    public C46349w(C46337n nVar, JumpInfo jumpInfo) {
        this.f124916b = nVar;
        this.f124915a = jumpInfo;
    }

    /* renamed from: a */
    public void mo65429a(boolean z, boolean z2) {
        Log.m105925i("GameChatRoom.GameChatItemVH", "checkPreload,  hasPreload:[%b], result[%b]", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("user_name", this.f124916b.f124841G.from_username);
                jSONObject.put("user_data", this.f124916b.f124859U0.mo62201b2());
                jSONObject.put("raw_url", this.f124916b.f124859U0.mo62199a().jump_url);
                jSONObject.put("source_id", 1304);
                String str = this.f124916b.f124872c1;
                if (str != null) {
                    jSONObject.put("premade_info", str);
                }
            } catch (JSONException unused) {
            }
            C53601h.m60130i(this.f124916b.f124838D, this.f124915a, 12, C117627q.m165908a(jSONObject.toString()));
            Log.m105925i("GameChatRoom.GameChatItemVH", "use preload personal profile url: %s", this.f124915a.jump_url);
            return;
        }
        C46337n nVar = this.f124916b;
        C53601h.m60129h(nVar.f124838D, nVar.f124859U0.mo62199a());
        if (this.f124916b.f124859U0.mo62199a() != null) {
            Log.m105925i("GameChatRoom.GameChatItemVH", "user userdata url: %s", this.f124916b.f124859U0.mo62199a().jump_url);
        }
    }
}
