package com.tencent.p014mm.modelimage;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.HashMap;
import p158gt.C8451i;
import p520fi.C75766h;

/* renamed from: com.tencent.mm.modelimage.d */
public class C92819d {

    /* renamed from: a */
    public HashMap<String, C8451i.C8452a> f267307a = new HashMap<>();

    /* renamed from: com.tencent.mm.modelimage.d$a */
    public static class C92820a implements Runnable {

        /* renamed from: d */
        public String f267308d;

        /* renamed from: e */
        public Bitmap f267309e;

        /* renamed from: f */
        public HashMap<String, C8451i.C8452a> f267310f;

        /* renamed from: g */
        public byte[] f267311g;

        public C92820a(String str, Bitmap bitmap, HashMap<String, C8451i.C8452a> hashMap, byte[] bArr) {
            this.f267308d = str;
            this.f267309e = bitmap;
            this.f267310f = hashMap;
            this.f267311g = bArr;
        }

        public void run() {
            C8451i.C8452a remove;
            C92837k0.wx0().mo127095c(this.f267308d, this.f267309e);
            HashMap<String, C8451i.C8452a> hashMap = this.f267310f;
            if (!(hashMap == null || (remove = hashMap.remove(this.f267308d)) == null)) {
                remove.mo24a(this.f267309e, this.f267311g);
            }
            Object[] objArr = new Object[1];
            String str = this.f267308d;
            if (str == null) {
                str = "null";
            }
            objArr[0] = str;
            Log.m105925i("MicroMsg.CdnImageService", "finish download post job, url[%s]", objArr);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.d$b */
    public static class C92821b implements Runnable {

        /* renamed from: d */
        public String f267312d;

        /* renamed from: e */
        public HashMap<String, C8451i.C8452a> f267313e;

        /* renamed from: f */
        public boolean f267314f;

        public C92821b(String str, HashMap<String, C8451i.C8452a> hashMap, boolean z) {
            this.f267312d = str;
            this.f267313e = hashMap;
            this.f267314f = z;
        }

        public void run() {
            C8451i.C8452a remove;
            byte[] httpGet = Util.httpGet(this.f267312d);
            Bitmap bitmap = null;
            if (httpGet == null) {
                Log.m105929w("MicroMsg.CdnImageService", "download fail: url[%s] data is null", this.f267312d);
                MMHandlerThread.postToMainThread(new C92820a(this.f267312d, (Bitmap) null, this.f267313e, httpGet));
                return;
            }
            try {
                bitmap = BitmapUtil.decodeByteArray(httpGet);
            } catch (Exception e) {
                Log.m105929w("MicroMsg.CdnImageService", "download fail: url[%s] decode bitmap error[%s]", this.f267312d, e.getLocalizedMessage());
            }
            Log.m105925i("MicroMsg.CdnImageService", "download finish, url[%s], do post job", this.f267312d);
            if (this.f267314f) {
                MMHandlerThread.postToMainThread(new C92820a(this.f267312d, bitmap, this.f267313e, httpGet));
                return;
            }
            String str = this.f267312d;
            HashMap<String, C8451i.C8452a> hashMap = this.f267313e;
            C92837k0.wx0().mo127095c(str, bitmap);
            if (!(hashMap == null || (remove = hashMap.remove(str)) == null)) {
                remove.mo24a(bitmap, httpGet);
            }
            Object[] objArr = new Object[1];
            if (str == null) {
                str = "null";
            }
            objArr[0] = str;
            Log.m105925i("MicroMsg.CdnImageService", "finish download post job, url[%s]", objArr);
        }
    }

    /* renamed from: a */
    public void mo127093a(String str, boolean z, C8451i.C8452a aVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.CdnImageService", "do load fail, url is empty");
            return;
        }
        Bitmap b = mo127094b(str);
        if (b == null || b.isRecycled()) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(b == null);
            Log.m105929w("MicroMsg.CdnImageService", "try to download: url[%s], src bitmap is null[%B]", objArr);
            if (this.f267307a.containsKey(str)) {
                Log.m105929w("MicroMsg.CdnImageService", "contains url[%s]", str);
                return;
            }
            this.f267307a.put(str, aVar);
            ThreadPool.post(new C92821b(str, this.f267307a, z), "CdnImageService_download");
            return;
        }
        Log.m105925i("MicroMsg.CdnImageService", "do load ok, url[%s], bitmap exists", str);
        if (aVar != null) {
            aVar.mo24a(b, (byte[]) null);
        }
    }

    /* renamed from: b */
    public Bitmap mo127094b(String str) {
        if (str != null && str.length() != 0) {
            return (Bitmap) C75766h.C75767a.m91020a("local_cdn_img_cache", str, null);
        }
        Log.m105920e("MicroMsg.CdnImageService", "get fail, key is null");
        return null;
    }

    /* renamed from: c */
    public void mo127095c(String str, Bitmap bitmap) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.CdnImageService", "push fail, key is null");
        } else {
            C75766h.C75767a.m91022c("local_cdn_img_cache", str, bitmap);
        }
    }

    public void finalize() {
        super.finalize();
    }
}
