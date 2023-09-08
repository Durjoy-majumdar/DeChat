package ty1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.plugin.game.autogen.chatroom.HalfScreen;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.WeappJumpInfo;
import com.tencent.p014mm.plugin.game.model.LocalHalfScreen;
import com.tencent.p014mm.plugin.game.model.LocalJumpInfo;
import com.tencent.p014mm.plugin.game.model.LocalTabCornerSetting;
import com.tencent.p014mm.plugin.game.model.WeAppJumpInfo;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.ChatRoomTabUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import yw1.C53601h;

/* renamed from: ty1.g */
public final class C52398g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52393c f146474d;

    /* renamed from: e */
    public final /* synthetic */ LocalTabCornerSetting f146475e;

    public C52398g(C52393c cVar, LocalTabCornerSetting localTabCornerSetting) {
        this.f146474d = cVar;
        this.f146475e = localTabCornerSetting;
    }

    public final void onClick(View view) {
        HalfScreen halfScreen;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C52393c cVar = this.f146474d;
        LocalJumpInfo localJumpInfo = this.f146475e.f113217g;
        int i = C52393c.f146452a1;
        cVar.getClass();
        if (localJumpInfo != null) {
            if (localJumpInfo.f113210d == 4) {
                Uri parse = Uri.parse(localJumpInfo.f113211e);
                if (C87412m.m108589b(parse.getPath(), "chat")) {
                    long p = cVar.mo73393p(parse, "sourceid");
                    long p2 = cVar.mo73393p(parse, TPDownloadProxyEnum.USER_SSID);
                    long p3 = cVar.mo73393p(parse, "chatVcSelectTab");
                    Intent intent = new Intent(cVar.getContext(), ChatRoomTabUI.class);
                    if (p3 != 0) {
                        intent.putExtra("game_msg_center_tab_type", (int) p3);
                    }
                    intent.putExtra("game_report_sourceid", p);
                    intent.putExtra("game_report_ssid", p2);
                    intent.putExtra("game_need_bottom_tab", false);
                    Context context = cVar.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    cVar.mo73394q(true, cVar.f146462Y0);
                } else {
                    Log.m105920e("GameWebSettingActionBar", "gamelog handleJumpInfo HOST IS unSupport");
                }
            } else {
                Context context3 = cVar.getContext();
                JumpInfo jumpInfo = new JumpInfo();
                jumpInfo.jump_type = localJumpInfo.f113210d;
                jumpInfo.jump_url = localJumpInfo.f113211e;
                LocalHalfScreen localHalfScreen = localJumpInfo.f113213g;
                WeappJumpInfo weappJumpInfo = null;
                if (localHalfScreen != null) {
                    halfScreen = new HalfScreen();
                    halfScreen.type = localHalfScreen.f113207d;
                    halfScreen.screen_height_dp = localHalfScreen.f113208e;
                    halfScreen.screen_height_percent = localHalfScreen.f113209f;
                } else {
                    halfScreen = null;
                }
                jumpInfo.half_screen = halfScreen;
                WeAppJumpInfo weAppJumpInfo = localJumpInfo.f113212f;
                if (weAppJumpInfo != null) {
                    weappJumpInfo = new WeappJumpInfo();
                    weappJumpInfo.appid = weAppJumpInfo.f113233d;
                    weappJumpInfo.path = weAppJumpInfo.f113234e;
                }
                jumpInfo.weapp_jump_info = weappJumpInfo;
                C53601h.m60129h(context3, jumpInfo);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
