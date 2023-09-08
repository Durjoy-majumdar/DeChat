package ix1;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import ax1.C39639c;
import ax1.C39641d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.RoleIcon;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TagInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.UserRole;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import p629ny.C76979h;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: ix1.b0 */
public class C46306b0 implements C39639c.C39640a {

    /* renamed from: a */
    public final /* synthetic */ C46337n f124767a;

    /* renamed from: ix1.b0$a */
    public class C46307a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39641d f124768d;

        /* renamed from: ix1.b0$a$a */
        public class C46308a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ UserRole f124770d;

            public C46308a(UserRole userRole) {
                this.f124770d = userRole;
            }

            public void onClick(View view) {
                RoleIcon roleIcon;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                UserRole userRole = this.f124770d;
                if (!(userRole == null || (roleIcon = userRole.role_icon) == null)) {
                    C53601h.m60129h(C46306b0.this.f124767a.f124838D, roleIcon.jump_info);
                    if (C46306b0.this.f124767a.f124841G != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("role", this.f124770d.role);
                        } catch (JSONException unused) {
                        }
                        C40308d.C40309a aVar = C40308d.f108375a;
                        C46337n nVar = C46306b0.this.f124767a;
                        long j = nVar.f124840F;
                        long j2 = nVar.f124839E;
                        ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
                        long j3 = chatroomMsgPack.seq;
                        String str = chatroomMsgPack.from_username;
                        aVar.mo62998h(21, 2, j, j2, j3, str, 0, nVar.f124874e1, jSONObject.toString());
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C46307a(C39641d dVar) {
            this.f124768d = dVar;
        }

        public void run() {
            boolean z;
            Integer m;
            GradientDrawable gradientDrawable;
            Integer m2;
            Class cls = C76979h.class;
            C46306b0.this.f124767a.f124844J.setContentDescription(this.f124768d.getNickName());
            C46306b0.this.f124767a.f124847M.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(C46306b0.this.f124767a.f124838D, this.f124768d.getNickName()));
            TagInfo x1 = this.f124768d.mo62208x1();
            boolean z2 = true;
            int i = 8;
            if (x1 == null || Util.isNullOrNil(x1.desc)) {
                C46306b0.this.f124767a.f124848N.setVisibility(8);
            } else {
                C46306b0.this.f124767a.f124848N.setVisibility(0);
                C46306b0.this.f124767a.f124848N.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(C46306b0.this.f124767a.f124838D, C46306b0.this.f124767a.f124838D.getString(C0966R.string.fc_, new Object[]{x1.desc})));
                Color color = x1.color;
                if (!(color == null || (m2 = C53601h.m60134m(Util.nullAsNil(color.dark_color))) == null)) {
                    C46306b0.this.f124767a.f124848N.setTextColor(m2.intValue());
                }
            }
            UserRole E0 = this.f124768d.mo62196E0();
            if (E0 == null || E0.role_icon == null) {
                C46306b0.this.f124767a.f124850Q.setVisibility(8);
                z = false;
            } else {
                C46306b0.this.f124767a.f124850Q.setVisibility(0);
                C52645f.m59023a().mo73595e(C46306b0.this.f124767a.f124850Q, E0.role_icon.icon_url, (C52645f.C52650d) null, (C52645f.C52652e) null);
                z = true;
            }
            if (E0 == null || Util.isNullOrNil(E0.desc)) {
                C46306b0.this.f124767a.f124852R.setVisibility(8);
                z2 = z;
            } else {
                C46306b0.this.f124767a.f124852R.setVisibility(0);
                C46306b0.this.f124767a.f124852R.setText(E0.desc);
                Integer m3 = C53601h.m60134m(Util.nullAsNil(E0.word_color));
                if (m3 != null) {
                    C46306b0.this.f124767a.f124852R.setTextColor(m3.intValue());
                }
            }
            if (!(!z2 || (m = C53601h.m60134m(Util.nullAsNil(E0.background_color))) == null || (gradientDrawable = (GradientDrawable) C46306b0.this.f124767a.f124849P.getBackground()) == null)) {
                gradientDrawable.setColor(m.intValue());
            }
            View view = C46306b0.this.f124767a.f124849P;
            if (z2) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C46306b0.this.f124767a.f124849P.setOnClickListener(new C46308a(E0));
        }
    }

    public C46306b0(C46337n nVar) {
        this.f124767a = nVar;
    }

    /* renamed from: a */
    public void mo62195a(Map<String, C39641d> map) {
        if (map != null && map.containsKey(this.f124767a.f124841G.from_username)) {
            C39641d dVar = map.get(this.f124767a.f124841G.from_username);
            C46337n nVar = this.f124767a;
            nVar.f124859U0 = dVar;
            nVar.f124847M.post(new C46307a(dVar));
        }
    }
}
