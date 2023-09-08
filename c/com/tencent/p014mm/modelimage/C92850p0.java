package com.tencent.p014mm.modelimage;

import a70.C112760b;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import p158gt.C76057w;
import p158gt.C8451i;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.modelimage.p0 */
public class C92850p0 implements C8451i.C8452a {

    /* renamed from: a */
    public List<C92854d> f267451a = new LinkedList();

    /* renamed from: b */
    public C92854d f267452b = null;

    /* renamed from: c */
    public boolean f267453c = false;

    /* renamed from: com.tencent.mm.modelimage.p0$a */
    public class C92851a extends AsyncTask<String, Integer, Bitmap> {
        public C92851a() {
        }

        public Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            if (strArr.length <= 0) {
                return null;
            }
            String c = C92850p0.m117108c(strArr[0]);
            if (!new C86009m1(c).mo119967g()) {
                return null;
            }
            return BitmapUtil.getBitmapNative(c);
        }

        public void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                Log.m105918d("MicroMsg.UrlImageCacheService", "load from sdcard");
                C92850p0 p0Var = C92850p0.this;
                if (!p0Var.f267453c) {
                    if (p0Var.f267452b != null) {
                        C92837k0.wx0().mo127095c(C92850p0.this.f267452b.f267457a, bitmap);
                        C92854d dVar = C92850p0.this.f267452b;
                        C76057w.C76058a aVar = dVar.f267459c;
                        String str = dVar.f267457a;
                        aVar.mo25933a(str, bitmap, C92850p0.m117108c(str));
                    } else {
                        Log.m105920e("MicroMsg.UrlImageCacheService", "onPostExecute mCurTaskItem is null");
                    }
                }
                C92850p0 p0Var2 = C92850p0.this;
                p0Var2.f267452b = null;
                p0Var2.mo127219e();
                return;
            }
            Log.m105924i("MicroMsg.UrlImageCacheService", "try load from " + C92850p0.this.f267452b.f267457a);
            C92819d wx02 = C92837k0.wx0();
            C92850p0 p0Var3 = C92850p0.this;
            wx02.mo127093a(p0Var3.f267452b.f267457a, true, p0Var3);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.p0$b */
    public class C92852b extends AsyncTask<C92853c, Integer, Integer> {
        public C92852b(C92850p0 p0Var) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r6 = r6[0];
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r6) {
            /*
                r5 = this;
                com.tencent.mm.modelimage.p0$c[] r6 = (com.tencent.p014mm.modelimage.C92850p0.C92853c[]) r6
                int r0 = r6.length
                java.lang.String r1 = "MicroMsg.UrlImageCacheService"
                if (r0 == 0) goto L_0x003e
                r0 = 0
                r2 = r6[r0]
                java.lang.String r2 = r2.f267455a
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x003e
                r6 = r6[r0]
                android.graphics.Bitmap r2 = r6.f267456b
                if (r2 != 0) goto L_0x0019
                goto L_0x003e
            L_0x0019:
                r3 = 100
                android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0023 }
                java.lang.String r6 = r6.f267455a     // Catch:{ IOException -> 0x0023 }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, r3, r4, r6, r0)     // Catch:{ IOException -> 0x0023 }
                goto L_0x0044
            L_0x0023:
                r6 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "save bitmap to image failed: "
                r0.append(r2)
                java.lang.String r6 = r6.toString()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
                goto L_0x0044
            L_0x003e:
                java.lang.String r6 = "nothing to save"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            L_0x0044:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92850p0.C92852b.doInBackground(java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.modelimage.p0$c */
    public static class C92853c {

        /* renamed from: a */
        public String f267455a;

        /* renamed from: b */
        public Bitmap f267456b;

        public C92853c(String str, Bitmap bitmap) {
            this.f267455a = str;
            this.f267456b = bitmap;
        }
    }

    /* renamed from: com.tencent.mm.modelimage.p0$d */
    public static class C92854d {

        /* renamed from: a */
        public String f267457a;

        /* renamed from: b */
        public String f267458b;

        /* renamed from: c */
        public C76057w.C76058a f267459c;

        public C92854d(String str, String str2, C76057w.C76058a aVar) {
            this.f267457a = str;
            this.f267458b = str2;
            this.f267459c = aVar;
        }
    }

    /* renamed from: c */
    public static String m117108c(String str) {
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            if (Util.isNullOrNil(encode)) {
                Log.m105920e("MicroMsg.UrlImageCacheService", "encode result is null: " + str);
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C112760b.m154239k());
            int length = encode.length();
            int i = 0;
            while (i < length) {
                sb.append(XVFSFile.SEPARATOR_CHAR);
                int i2 = i + 20;
                if (i2 < length) {
                    sb.append(encode.substring(i, i2));
                    i = i2;
                } else {
                    sb.append(encode.substring(i, length));
                    i = length;
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            Log.m105920e("MicroMsg.UrlImageCacheService", "try encode unsupport character: " + str);
            return null;
        }
    }

    /* renamed from: a */
    public void mo24a(Bitmap bitmap, byte[] bArr) {
        boolean z;
        if (bitmap == null) {
            Log.m105920e("MicroMsg.UrlImageCacheService", "load from url failed: " + this.f267452b.f267457a);
            if (!this.f267453c) {
                C92854d dVar = this.f267452b;
                dVar.f267459c.mo25933a(dVar.f267457a, bitmap, (String) null);
            }
            this.f267452b = null;
            mo127219e();
            return;
        }
        Log.m105925i("MicroMsg.UrlImageCacheService", "load from %s successed", this.f267452b.f267457a);
        if (Util.isNullOrNil(this.f267452b.f267458b) || bArr == null) {
            z = true;
        } else {
            String f = C90193h.m112878f(bArr);
            z = Util.isEqual(f, this.f267452b.f267458b);
            Log.m105925i("MicroMsg.UrlImageCacheService", "orgmd5:%s newmd5:%s checkReuslt:%s", this.f267452b.f267458b, f, Boolean.valueOf(z));
        }
        if (z) {
            String c = m117108c(this.f267452b.f267457a);
            new C92852b(this).execute(new C92853c[]{new C92853c(c, bitmap)});
            if (!this.f267453c) {
                C92837k0.wx0().mo127095c(this.f267452b.f267457a, bitmap);
                C92854d dVar2 = this.f267452b;
                dVar2.f267459c.mo25933a(dVar2.f267457a, bitmap, c);
            }
        } else if (!this.f267453c) {
            C92854d dVar3 = this.f267452b;
            dVar3.f267459c.mo25933a(dVar3.f267457a, (Bitmap) null, "");
        }
        this.f267452b = null;
        mo127219e();
    }

    /* renamed from: b */
    public final void mo127217b(String str, C76057w.C76058a aVar) {
        if (Util.isNullOrNil(str) || aVar == null) {
            Log.m105920e("MicroMsg.UrlImageCacheService", "url is null or nil, or callback is null");
            return;
        }
        C92854d dVar = this.f267452b;
        if (dVar == null || !dVar.f267457a.equals(str) || this.f267452b.f267459c != aVar) {
            for (C92854d next : this.f267451a) {
                if (next.f267457a.equals(str) && next.f267459c == aVar) {
                    Log.m105925i("MicroMsg.UrlImageCacheService", "cancel task, url:%s", str);
                    ((LinkedList) this.f267451a).remove(next);
                    return;
                }
            }
            return;
        }
        this.f267453c = true;
        Log.m105925i("MicroMsg.UrlImageCacheService", "cancel task that is loading, url:%s", str);
    }

    /* renamed from: d */
    public final void mo127218d(String str, String str2, C76057w.C76058a aVar) {
        if (Util.isNullOrNil(str) || aVar == null) {
            Log.m105920e("MicroMsg.UrlImageCacheService", "url is null or nil, or callback is null");
            return;
        }
        C92854d dVar = this.f267452b;
        if (dVar == null || !dVar.f267457a.equals(str) || this.f267452b.f267459c != aVar) {
            for (C92854d next : this.f267451a) {
                if (next.f267457a.equals(str) && next.f267459c == aVar) {
                    Log.m105920e("MicroMsg.UrlImageCacheService", "url and callback is loading");
                    return;
                }
            }
            ((LinkedList) this.f267451a).add(new C92854d(str, str2, aVar));
            mo127219e();
            return;
        }
        Log.m105920e("MicroMsg.UrlImageCacheService", "url and callback is loading");
    }

    /* renamed from: e */
    public final void mo127219e() {
        if (!MMHandlerThread.isMainThread()) {
            Log.m105921e("MicroMsg.UrlImageCacheService", "err call tryLoadImage:%s", Util.getStack());
        }
        if (this.f267452b != null || ((LinkedList) this.f267451a).size() == 0) {
            Log.m105918d("MicroMsg.UrlImageCacheService", "task is downing or no more task");
            return;
        }
        this.f267452b = (C92854d) ((LinkedList) this.f267451a).get(0);
        ((LinkedList) this.f267451a).remove(0);
        this.f267453c = false;
        Bitmap b = C92837k0.wx0().mo127094b(this.f267452b.f267457a);
        if (b != null) {
            Log.m105918d("MicroMsg.UrlImageCacheService", "find bitmap in cache of " + this.f267452b.f267457a);
            if (!this.f267453c) {
                C92854d dVar = this.f267452b;
                C76057w.C76058a aVar = dVar.f267459c;
                String str = dVar.f267457a;
                aVar.mo25933a(str, b, m117108c(str));
            }
            this.f267452b = null;
            mo127219e();
            return;
        }
        new C92851a().execute(new String[]{this.f267452b.f267457a});
    }
}
