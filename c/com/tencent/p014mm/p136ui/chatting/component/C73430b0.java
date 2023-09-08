package com.tencent.p014mm.p136ui.chatting.component;

import android.graphics.Bitmap;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import p158gt.C8451i;
import p763ym.C79140q;

/* renamed from: com.tencent.mm.ui.chatting.component.b0 */
public class C73430b0 implements C8451i.C8452a {

    /* renamed from: a */
    public final /* synthetic */ String f215803a;

    /* renamed from: b */
    public final /* synthetic */ long f215804b;

    public C73430b0(C73413a0 a0Var, String str, long j) {
        this.f215803a = str;
        this.f215804b = j;
    }

    /* renamed from: a */
    public void mo24a(Bitmap bitmap, byte[] bArr) {
        Object[] objArr = new Object[2];
        objArr[0] = this.f215803a;
        Object obj = "null";
        objArr[1] = bitmap == null ? obj : Integer.valueOf(bitmap.getByteCount());
        Log.m105925i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg callBack cover:%s, result:%s", objArr);
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105924i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg result is not null");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Object[] objArr2 = new Object[1];
                if (byteArray != null) {
                    obj = Integer.valueOf(byteArray.length);
                }
                objArr2[0] = obj;
                Log.m105925i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg bytes：%s", objArr2);
                if (byteArray != null && byteArray.length > 0) {
                    String x = C72695v.m85082x(byteArray, false, Bitmap.CompressFormat.PNG, false);
                    Log.m105924i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg thumbData path:" + x);
                    if (!Util.isNullOrNil(x)) {
                        ((C79140q) C86312j.m106911c(C79140q.class)).mo108882tR(String.valueOf(this.f215804b), x);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e, "", new Object[0]);
            }
        }
    }
}
