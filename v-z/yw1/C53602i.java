package yw1;

import android.content.Context;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import p244tt.C14088e;

/* renamed from: yw1.i */
public class C53602i implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ Context f150634a;

    /* renamed from: b */
    public final /* synthetic */ JumpInfo f150635b;

    /* renamed from: c */
    public final /* synthetic */ int f150636c;

    /* renamed from: d */
    public final /* synthetic */ String f150637d;

    public C53602i(Context context, JumpInfo jumpInfo, int i, String str) {
        this.f150634a = context;
        this.f150635b = jumpInfo;
        this.f150636c = i;
        this.f150637d = str;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("GameChatRoom.GameChatUtils", "gamelog.chatroom, jumpToPage, openLiteApp success ");
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105920e("GameChatRoom.GameChatUtils", "gamelog.chatroom, jumpToPage, openLiteApp failed ");
        C53601h.m60131j(this.f150634a, this.f150635b, this.f150636c, this.f150637d);
    }
}
