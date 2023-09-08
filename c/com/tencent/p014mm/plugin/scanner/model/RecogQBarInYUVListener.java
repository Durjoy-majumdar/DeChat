package com.tencent.p014mm.plugin.scanner.model;

import android.graphics.Bitmap;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RequestRecogQBarInYuvEvent;
import com.tencent.p014mm.plugin.ext.qrcode.C93386e;
import com.tencent.p014mm.plugin.facedetect.model.C93391x;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19931a;
import rs3.C22248a;

@Deprecated
/* renamed from: com.tencent.mm.plugin.scanner.model.RecogQBarInYUVListener */
public class RecogQBarInYUVListener extends IListener<RequestRecogQBarInYuvEvent> {

    /* renamed from: d */
    public boolean f273151d = false;

    /* renamed from: e */
    public C93391x f273152e = null;

    public RecogQBarInYUVListener() {
        super(C40008f.f107254d);
        this.__eventId = 1252797776;
    }

    public boolean callback(IEvent iEvent) {
        RequestRecogQBarInYuvEvent.C92556a aVar = ((RequestRecogQBarInYuvEvent) iEvent).f265068d;
        C93391x xVar = aVar.f265074f;
        if (!this.f273151d || xVar == null) {
            this.f273152e = xVar;
            this.f273151d = true;
            int i = aVar.f265070b;
            int i2 = aVar.f265071c;
            byte[] bArr = aVar.f265069a;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Integer.valueOf(bArr != null ? bArr.length : 0);
            Log.m105925i("MicroMsg.RecogQBarInYUVListener", "hy: request scanning width: %d, height: %d, yuvLen: %d", objArr);
            Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr, i, i2);
            if (decodeByteArray != null) {
                C19931a.C19932a a = C22248a.m25803a(decodeByteArray, new int[2]);
                if (a != null) {
                    Log.m105924i("MicroMsg.RecogQBarInYUVListener", "decode success");
                    C93391x xVar2 = this.f273152e;
                    if (xVar2 != null) {
                        ((C93386e) xVar2).mo128189a(a.f56829f, C5177x.m5204a(a.f56828e), -1);
                    }
                } else {
                    Log.m105924i("MicroMsg.RecogQBarInYUVListener", "decode failed");
                    ((C93386e) this.f273152e).mo128189a("", -2, -1);
                }
            }
            this.f273151d = false;
        } else {
            Log.m105928w("MicroMsg.RecogQBarInYUVListener", "hy: is decoding. direct return");
            ((C93386e) xVar).mo128189a("", -1, -1);
        }
        return false;
    }
}
