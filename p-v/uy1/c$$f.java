package uy1;

import android.content.Context;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import p244tt.C14088e;

public class c$$f implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ Context f146992a;

    /* renamed from: b */
    public final /* synthetic */ JumpInfo f146993b;

    /* renamed from: c */
    public final /* synthetic */ int f146994c;

    /* renamed from: d */
    public final /* synthetic */ String f146995d;

    public c$$f(Context context, JumpInfo jumpInfo, int i, String str) {
        this.f146992a = context;
        this.f146993b = jumpInfo;
        this.f146994c = i;
        this.f146995d = str;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, openLiteApp success ");
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105920e("MicroMsg.GameCenterUtil", "gamelog.chatroom, jumpToPage, openLiteApp failed ");
        C52642c.m59003u(this.f146992a, this.f146993b, this.f146994c, this.f146995d);
    }
}
