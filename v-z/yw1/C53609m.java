package yw1;

import android.app.ActivityOptions;
import android.content.Context;
import ax1.C39639c;
import ax1.C39641d;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ChatRoomAtFunctionEvent;
import com.tencent.p014mm.autogen.events.ChatRoomLocateInfoEvent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ex1.C45710c;
import ex1.C45711d;
import ex1.C45712e;
import f40.C86709a0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zh3.C91753f;
import zt3.C119157j;
import zt3.C119179t;
import zw1.C16408b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yw1.m */
public class C53609m extends C86301e implements C16408b {

    /* renamed from: d */
    public String f150642d;

    /* renamed from: e */
    public C91753f f150643e;

    /* renamed from: f */
    public String f150644f;

    /* renamed from: g */
    public C45710c f150645g;

    /* renamed from: h */
    public volatile boolean f150646h = false;

    /* renamed from: yw1.m$a */
    public class C53610a implements C39639c.C39640a {

        /* renamed from: a */
        public final /* synthetic */ String f150647a;

        /* renamed from: b */
        public final /* synthetic */ String f150648b;

        /* renamed from: yw1.m$a$a */
        public class C53611a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Map f150649d;

            /* renamed from: yw1.m$a$a$a */
            public class C53612a implements Runnable {
                public C53612a() {
                }

                public void run() {
                    C53611a aVar = C53611a.this;
                    C39641d dVar = (C39641d) aVar.f150649d.get(C53610a.this.f150647a);
                    boolean z = C53601h.m60126e(C53610a.this.f150648b).f150604a;
                    boolean z2 = C53601h.m60126e(C53610a.this.f150648b).f150605b;
                    if (dVar != null && !z && !z2) {
                        ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new ChatRoomAtFunctionEvent();
                        chatRoomAtFunctionEvent.f107397d.f107398a = dVar.getUserName();
                        chatRoomAtFunctionEvent.f107397d.f107399b = dVar.getNickName();
                        chatRoomAtFunctionEvent.publish();
                    }
                }
            }

            public C53611a(Map map) {
                this.f150649d = map;
            }

            public void run() {
                Map map = this.f150649d;
                if (map != null && map.containsKey(C53610a.this.f150647a)) {
                    ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new ChatRoomLocateInfoEvent();
                    ChatRoomLocateInfoEvent.C40051a aVar = chatRoomLocateInfoEvent.f107403d;
                    aVar.f107404a = 0;
                    aVar.f107406c = false;
                    chatRoomLocateInfoEvent.publish();
                    C119179t tVar = C119157j.f356862d;
                    C53612a aVar2 = new C53612a();
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(aVar2, 200, false);
                }
            }
        }

        public C53610a(C53609m mVar, String str, String str2) {
            this.f150647a = str;
            this.f150648b = str2;
        }

        /* renamed from: a */
        public void mo62195a(Map<String, C39641d> map) {
            ((C119157j) C119157j.f356862d).mo183895z(new C53611a(map));
        }
    }

    /* renamed from: GB */
    public void mo14868GB(Context context, C16408b.C16409a aVar) {
        C53591c.f150600b = true;
        aVar.f43822f = true;
        GameChatRoomUI.m45181P7(context, aVar, (Lbs) null, (ActivityOptions) null, true);
    }

    public void Vc0(String str, String str2, String str3) {
        ((C39639c) C86312j.m106911c(C39639c.class)).lx0(str2, new C53610a(this, str2, str));
    }

    public void W70(Context context, C16408b.C16409a aVar, Lbs lbs, ActivityOptions activityOptions, boolean z) {
        C53591c.f150600b = !z;
        GameChatRoomUI.m45181P7(context, aVar, lbs, activityOptions, false);
    }

    /* renamed from: ZR */
    public void mo14871ZR(String str, String str2) {
        Log.m105925i("GameChatRoom.PluginGameChatRoom", "deleteChatRoomMemberByUserName  chatroomName = %s  userName = %s", str, str2);
        ((C45712e) C86312j.m106911c(C45712e.class)).mo71205Sp(str, str2);
    }

    /* renamed from: aD */
    public boolean mo14872aD(Context context, C16408b.C16409a aVar) {
        C53591c.f150600b = true;
        return GameChatRoomUI.m45181P7(context, aVar, (Lbs) null, (ActivityOptions) null, true);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("GameChatRoom.PluginGameChatRoom", "onAccountRelease");
        C91753f fVar = this.f150643e;
        if (fVar != null) {
            fVar.mo124432b();
            this.f150643e = null;
        }
        this.f150645g = null;
    }

    public C45710c vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f150645g == null) {
            this.f150645g = new C45710c(wx0());
        }
        return this.f150645g;
    }

    public C91753f wx0() {
        if (!this.f150646h) {
            synchronized (this) {
                if (!this.f150646h) {
                    this.f150644f = C86709a0.m107535s().f251807e + "GameChatRoom.db";
                    C91753f fVar = new C91753f();
                    this.f150643e = fVar;
                    String str = this.f150644f;
                    HashMap hashMap = new HashMap();
                    hashMap.put(-1129824805, new C53607k(this));
                    hashMap.put(-1899647075, new C53608l(this));
                    if (!fVar.mo125626p(str, hashMap, true, true)) {
                        Log.m105924i("GameChatRoom.PluginGameChatRoom", "GameChatRoom db init failed");
                    } else {
                        this.f150646h = true;
                    }
                }
            }
        }
        return this.f150643e;
    }

    public String z90(String str, String str2) {
        List<C45711d> Mj0 = ((C45712e) C86312j.m106911c(C45712e.class)).Mj0(str2, str);
        if (Util.isNullOrNil((List) Mj0)) {
            Log.m105925i("GameChatRoom.PluginGameChatRoom", "searchChatRoomMemberByName  chatroomName = %s  keywords = %s   result null", str, str2);
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (C45711d next : Mj0) {
            if (next.field_role != 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("userName", next.field_userName);
                    jSONObject.put("nickName", next.field_nickName);
                    jSONObject.put("avatar", next.field_avatarURL);
                } catch (JSONException e) {
                    Log.printErrStackTrace("GameChatRoom.PluginGameChatRoom", e, "", new Object[0]);
                }
                jSONArray.put(jSONObject);
            }
        }
        String jSONArray2 = jSONArray.toString();
        Log.m105925i("GameChatRoom.PluginGameChatRoom", "searchChatRoomMemberByName  chatroomName = %s  keywords = %s   jsonArrayResultStr = %s", str, str2, jSONArray2);
        return jSONArray2;
    }
}
