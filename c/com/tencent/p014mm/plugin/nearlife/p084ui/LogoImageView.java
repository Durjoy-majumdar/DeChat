package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.LogoImageView */
public class LogoImageView extends ImageView {

    /* renamed from: d */
    public String f346781d;

    /* renamed from: e */
    public String f346782e = null;

    /* renamed from: f */
    public int f346783f;

    /* renamed from: g */
    public int f346784g;

    /* renamed from: h */
    public MMHandler f346785h = new C115608a();

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.LogoImageView$b */
    public static class C94286b implements Runnable {

        /* renamed from: d */
        public String f272406d;

        /* renamed from: e */
        public MMHandler f272407e;

        public C94286b(String str, MMHandler mMHandler) {
            this.f272406d = str;
            this.f272407e = mMHandler;
        }

        public void run() {
            byte[] httpGet = Util.httpGet(this.f272406d);
            Message obtain = Message.obtain();
            obtain.obj = httpGet;
            this.f272407e.sendMessage(obtain);
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.LogoImageView$a */
    public class C115608a extends MMHandler {
        public C115608a() {
        }

        public void handleMessage(Message message) {
            LogoImageView logoImageView;
            int i;
            int i2;
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null || bArr.length == 0) {
                Log.m105920e("MicroMsg.LogoImageView", "handleMsg fail, data is null");
                return;
            }
            Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
            String str = LogoImageView.this.f346781d + C90193h.m112878f(LogoImageView.this.f346782e.getBytes());
            Log.m105919d("MicroMsg.LogoImageView", "filePath  %s", str);
            C86013q1.m106438T(str, bArr, 0, bArr.length);
            if (decodeByteArray != null && (i = (logoImageView = LogoImageView.this).f346783f) > 0 && (i2 = logoImageView.f346784g) > 0) {
                decodeByteArray = BitmapUtil.extractThumbNail(decodeByteArray, i2, i, true, false);
            }
            LogoImageView.this.setImageBitmap(decodeByteArray);
        }
    }

    public LogoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
