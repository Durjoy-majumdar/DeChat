package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import p140cw.C7138g;
import p159gw.C98250h;
import p227rn.C48053v;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.i0 */
public class C5361i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SelfQRCodeUI f21004d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.i0$a */
    public class C5362a implements C113177k.C113181e {
        public C5362a() {
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                SelfQRCodeUI selfQRCodeUI = C5361i0.this.f21004d;
                String str = SelfQRCodeUI.f20752D;
                selfQRCodeUI.getClass();
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(selfQRCodeUI, new C5361i0(selfQRCodeUI), new C5335a0(selfQRCodeUI));
            }
        }
    }

    public C5361i0(SelfQRCodeUI selfQRCodeUI) {
        this.f21004d = selfQRCodeUI;
    }

    public void run() {
        byte[] bArr;
        Class cls = C7138g.class;
        if (((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.STORAGE, C113177k.C113178a.SAVE_FILE, new C5362a())) {
            Log.m105924i("MicroMsg.SelfQRCodeNewUI", "business switch close ,return");
            return;
        }
        OutputStream outputStream = null;
        if (C72996z1.m85820U5(this.f21004d.f20761i) || ((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(this.f21004d.f20761i)) {
            C115669n.INSTANCE.idkeyStat(219, 10, 1, true);
            Bitmap bitmapFromView = BitmapUtil.getBitmapFromView(this.f21004d.findViewById(C0966R.C0970id.i_o));
            if (bitmapFromView != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapFromView.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } else {
                bArr = null;
            }
            if (bArr == null) {
                bArr = this.f21004d.f20763n;
            }
        } else {
            bArr = this.f21004d.f20763n;
        }
        if (bArr != null && bArr.length > 0) {
            String str = ((C7138g) C86312j.m106911c(cls)).mo8323lm() + "mmqrcode" + System.currentTimeMillis() + ".png";
            try {
                outputStream = ScopedStorageUtil.Exports.getImageOutputStream(this.f21004d.getContext(), str);
                outputStream.write(bArr);
                SelfQRCodeUI selfQRCodeUI = this.f21004d;
                C76701a.makeText((Context) selfQRCodeUI, (CharSequence) selfQRCodeUI.getString(C0966R.string.fn4, new Object[]{((C7138g) C86312j.m106911c(cls)).mo8327wx()}), 1).show();
                ((C7138g) C86312j.m106911c(cls)).mo8315Wr(str, this.f21004d);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SelfQRCodeNewUI", e, "", new Object[0]);
                if (outputStream == null) {
                    return;
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            try {
                outputStream.close();
            } catch (Exception unused2) {
            }
        }
    }
}
