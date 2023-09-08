package uy1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.autogen.events.GameMsgDownloadImgEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import ic0.C21070h;
import jc0.C21210b;

public class c$$d implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ float f146990a;

    /* renamed from: b */
    public final /* synthetic */ GameMsgDownloadImgEvent f146991b;

    public c$$d(float f, GameMsgDownloadImgEvent gameMsgDownloadImgEvent) {
        this.f146990a = f;
        this.f146991b = gameMsgDownloadImgEvent;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        C21210b bVar2 = bVar;
        GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f146991b;
        GameMsgDownloadImgEvent.C40107a aVar = gameMsgDownloadImgEvent.f107555d;
        aVar.f107557a = 2;
        aVar.f107558b = str;
        gameMsgDownloadImgEvent.publish();
        if (bVar2 != null) {
            int i = bVar2.f59986b;
            if (bVar2.f59985a != 0 || bVar2.f59988d == null) {
                if (i == 2) {
                    C115669n.INSTANCE.idkeyStat(858, 14, 1, false);
                }
            } else if (i == 2) {
                C115669n.INSTANCE.idkeyStat(858, 13, 1, false);
            }
        }
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        Bitmap bitmap = bVar.f59988d;
        if (bitmap == null || bitmap.isRecycled() || this.f146990a <= 0.0f) {
            return null;
        }
        Bitmap bitmap2 = bVar.f59988d;
        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(bitmap2, true, ((float) bitmap2.getWidth()) * this.f146990a);
        if (roundedCornerBitmap != null) {
            return roundedCornerBitmap;
        }
        return null;
    }
}
