package yw1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p244tt.C14088e;
import sw1.C48478n;

public final /* synthetic */ class h$$a implements C48478n.C13791d {

    /* renamed from: a */
    public final /* synthetic */ Context f150630a;

    /* renamed from: b */
    public final /* synthetic */ JumpInfo f150631b;

    /* renamed from: c */
    public final /* synthetic */ int f150632c;

    /* renamed from: d */
    public final /* synthetic */ String f150633d;

    public /* synthetic */ h$$a(Context context, JumpInfo jumpInfo, int i, String str) {
        this.f150630a = context;
        this.f150631b = jumpInfo;
        this.f150632c = i;
        this.f150633d = str;
    }

    /* renamed from: a */
    public final void mo5391a(C48478n.C13790c cVar) {
        Context context = this.f150630a;
        JumpInfo jumpInfo = this.f150631b;
        int i = this.f150632c;
        String str = this.f150633d;
        Log.m105918d("GameChatRoom.GameChatUtils", "liteAppConfig = " + cVar);
        if (cVar == null || Util.isNullOrNil(cVar.f38905a) || Util.isNullOrNil(cVar.f38906b)) {
            C53601h.m60131j(context, jumpInfo, i, str);
            return;
        }
        String query = Uri.parse(jumpInfo.jump_url).getQuery();
        if (!Util.isNullOrNil(str)) {
            query = query + "&__game_center_present_custom_data__=" + str;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", cVar.f38905a);
        bundle.putString("path", cVar.f38906b);
        bundle.putString(SearchIntents.EXTRA_QUERY, query);
        if (jumpInfo.half_screen != null) {
            bundle.putBoolean("isHalfScreen", true);
            bundle.putBoolean("transparent", true);
            bundle.putDouble("heightPercent", (double) jumpInfo.half_screen.screen_height_percent);
        }
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(context, bundle, true, false, new C53602i(context, jumpInfo, i, str));
    }
}
