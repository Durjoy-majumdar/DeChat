package rn3;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ic0.C21070h;
import jc0.C21210b;

/* renamed from: rn3.j0 */
public class C90057j0 implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ WXMediaMessage f258713a;

    /* renamed from: b */
    public final /* synthetic */ String f258714b;

    /* renamed from: c */
    public final /* synthetic */ SendAppMessageWrapperUI f258715c;

    public C90057j0(SendAppMessageWrapperUI sendAppMessageWrapperUI, WXMediaMessage wXMediaMessage, String str) {
        this.f258715c = sendAppMessageWrapperUI;
        this.f258713a = wXMediaMessage;
        this.f258714b = str;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        Bitmap bitmap;
        if (bVar.f59985a != 0 || (bitmap = bVar.f59988d) == null || bitmap.isRecycled()) {
            Log.m105929w("MicroMsg.SendAppMessageWrapperUI", "onImageLoadFinish: load img fail ,status:", Integer.valueOf(bVar.f59985a));
        } else {
            this.f258713a.thumbData = Util.bmpToByteArray(bVar.f59988d, true);
        }
        SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f258715c;
        String str2 = this.f258714b;
        WXMediaMessage wXMediaMessage = this.f258713a;
        int i = SendAppMessageWrapperUI.f250361A;
        sendAppMessageWrapperUI.mo119874R7(str2, wXMediaMessage);
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
