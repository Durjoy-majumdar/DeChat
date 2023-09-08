package uy1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.autogen.events.GameMsgDownloadImgEvent;
import ic0.C98661k;

public class c$$c implements C98661k {

    /* renamed from: a */
    public final /* synthetic */ GameMsgDownloadImgEvent f146989a;

    public c$$c(GameMsgDownloadImgEvent gameMsgDownloadImgEvent) {
        this.f146989a = gameMsgDownloadImgEvent;
    }

    /* renamed from: a */
    public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
        GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f146989a;
        GameMsgDownloadImgEvent.C40107a aVar = gameMsgDownloadImgEvent.f107555d;
        aVar.f107557a = 2;
        aVar.f107558b = str;
        gameMsgDownloadImgEvent.publish();
    }
}
