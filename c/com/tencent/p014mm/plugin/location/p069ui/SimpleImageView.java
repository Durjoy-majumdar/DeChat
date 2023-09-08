package com.tencent.p014mm.plugin.location.p069ui;

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

/* renamed from: com.tencent.mm.plugin.location.ui.SimpleImageView */
public class SimpleImageView extends ImageView {

    /* renamed from: d */
    public String f346395d;

    /* renamed from: e */
    public String f346396e = null;

    /* renamed from: f */
    public int f346397f;

    /* renamed from: g */
    public int f346398g;

    /* renamed from: h */
    public MMHandler f346399h = new C115523a();

    /* renamed from: com.tencent.mm.plugin.location.ui.SimpleImageView$b */
    public static class C94160b implements Runnable {

        /* renamed from: d */
        public String f271946d;

        /* renamed from: e */
        public MMHandler f271947e;

        public C94160b(String str, MMHandler mMHandler) {
            this.f271946d = str;
            this.f271947e = mMHandler;
        }

        public void run() {
            byte[] httpGet = Util.httpGet(this.f271946d);
            Message obtain = Message.obtain();
            obtain.obj = httpGet;
            this.f271947e.sendMessage(obtain);
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.SimpleImageView$a */
    public class C115523a extends MMHandler {
        public C115523a() {
        }

        public void handleMessage(Message message) {
            SimpleImageView simpleImageView;
            int i;
            int i2;
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null || bArr.length == 0) {
                Log.m105920e("MicroMsg.SimpleImageView", "handleMsg fail, data is null");
                return;
            }
            Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
            String str = SimpleImageView.this.f346395d + C90193h.m112878f(SimpleImageView.this.f346396e.getBytes());
            Log.m105919d("MicroMsg.SimpleImageView", "filePath  %s", str);
            C86013q1.m106438T(str, bArr, 0, bArr.length);
            if (decodeByteArray != null && (i = (simpleImageView = SimpleImageView.this).f346397f) > 0 && (i2 = simpleImageView.f346398g) > 0) {
                decodeByteArray = BitmapUtil.extractThumbNail(decodeByteArray, i2, i, true, false);
            }
            SimpleImageView.this.setImageBitmap(decodeByteArray);
        }
    }

    public SimpleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
