package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONObject;
import p224ra.C12964b;
import s24.C90124b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m */
public abstract class C115249m extends C82268c<C82381f> {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m$c */
    public interface C1742c extends C12964b {
        /* renamed from: Ed */
        void mo1729Ed(Context context, C82381f fVar, Runnable runnable, Runnable runnable2);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m$a */
    public class C115250a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f345361d;

        /* renamed from: e */
        public final /* synthetic */ String f345362e;

        /* renamed from: f */
        public final /* synthetic */ int f345363f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m$a$a */
        public class C115251a extends ScopedStorageUtil.MediaStoreOps.Callback {

            /* renamed from: a */
            public final /* synthetic */ ScopedStorageUtil.MediaStoreOps.Controller[] f345365a;

            public C115251a(C115250a aVar, ScopedStorageUtil.MediaStoreOps.Controller[] controllerArr) {
                this.f345365a = controllerArr;
            }

            public void onSuccess(ScopedStorageUtil.MediaStoreOps.Controller controller) {
                this.f345365a[0] = controller;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m$a$b */
        public class C115252b extends ScopedStorageUtil.MediaStoreOps.Callback {

            /* renamed from: a */
            public final /* synthetic */ ScopedStorageUtil.MediaStoreOps.Controller[] f345366a;

            public C115252b(C115250a aVar, ScopedStorageUtil.MediaStoreOps.Controller[] controllerArr) {
                this.f345366a = controllerArr;
            }

            public void onSuccess(ScopedStorageUtil.MediaStoreOps.Controller controller) {
                this.f345366a[0] = controller;
            }
        }

        public C115250a(C82381f fVar, String str, int i) {
            this.f345361d = fVar;
            this.f345362e = str;
            this.f345363f = i;
        }

        public void run() {
            if (this.f345361d.isRunning()) {
                if (C2039g2.m1987a()) {
                    ((C119157j) C119157j.f356862d).mo183884o(this);
                    return;
                }
                InputStream readStream = this.f345361d.getFileSystem().readStream(this.f345362e);
                OutputStream outputStream = null;
                if (readStream == null) {
                    try {
                        this.f345361d.mo109647a(this.f345363f, C115249m.this.mo115109j("fail file not exists"));
                    } catch (IOException e) {
                        this.f345361d.mo109647a(this.f345363f, C115249m.this.mo115109j("fail"));
                        Log.printErrStackTrace("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", e, "", new Object[0]);
                    } catch (Exception e2) {
                        this.f345361d.mo109647a(this.f345363f, C115249m.this.mo115109j("fail"));
                        Log.printErrStackTrace("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", e2, "", new Object[0]);
                    } catch (Throwable th) {
                        Util.qualityClose(readStream);
                        Util.qualityClose((Closeable) null);
                        throw th;
                    }
                } else {
                    String c = C90124b.m112768c(this.f345362e);
                    String mimeTypeByFileExt = MimeTypeUtil.getMimeTypeByFileExt(c);
                    if (!C115249m.this.mo127298x(mimeTypeByFileExt)) {
                        this.f345361d.mo109647a(this.f345363f, C115249m.this.mo115109j("fail invalid file type"));
                        Util.qualityClose(readStream);
                        Util.qualityClose((Closeable) null);
                        return;
                    }
                    String y = C115249m.this.mo127299y(c);
                    String str = "ok";
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (!BitmapUtil.isDisableMediaApi()) {
                            ScopedStorageUtil.MediaStoreOps.Controller[] controllerArr = {null};
                            if (mimeTypeByFileExt.contains("video")) {
                                ScopedStorageUtil.Exports.getVideoOutputStream(MMApplicationContext.getContext(), y, new C115251a(this, controllerArr));
                            } else if (mimeTypeByFileExt.contains("image")) {
                                ScopedStorageUtil.Exports.getImageOutputStream(MMApplicationContext.getContext(), y, new C115252b(this, controllerArr));
                            }
                            ScopedStorageUtil.MediaStoreOps.Controller controller = controllerArr[0];
                            if (controller != null) {
                                outputStream = controller.getOutputStream();
                            }
                            if (outputStream != null) {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = readStream.read(bArr);
                                    if (-1 == read) {
                                        break;
                                    }
                                    outputStream.write(bArr, 0, read);
                                }
                                outputStream.flush();
                                controllerArr[0].removePendingStats();
                                this.f345361d.mo109647a(this.f345363f, C115249m.this.mo115109j(str));
                            } else {
                                throw new IOException("Open OutputStream with MediaStore fail!");
                            }
                        }
                    }
                    boolean w = C115249m.m161998w(C115249m.this, y, readStream);
                    if (w) {
                        C115249m.this.mo127300z(y);
                        AndroidMediaUtil.refreshMediaScanner(y, this.f345361d.getContext());
                    }
                    C82381f fVar = this.f345361d;
                    int i = this.f345363f;
                    C115249m mVar = C115249m.this;
                    if (!w) {
                        str = "fail";
                    }
                    fVar.mo109647a(i, mVar.mo115109j(str));
                }
                Util.qualityClose(readStream);
                Util.qualityClose(outputStream);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m$b */
    public class C115253b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f345367d;

        /* renamed from: e */
        public final /* synthetic */ int f345368e;

        public C115253b(C82381f fVar, int i) {
            this.f345367d = fVar;
            this.f345368e = i;
        }

        public void run() {
            this.f345367d.mo109647a(this.f345368e, C115249m.this.mo115109j("fail:system permission denied"));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: w */
    public static boolean m161998w(C115249m mVar, String str, InputStream inputStream) {
        mVar.getClass();
        try {
            C86009m1 m1Var = new C86009m1(str);
            m1Var.mo119974l().mo119987x();
            OutputStream H = C86013q1.m106426H(m1Var);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read != -1) {
                    H.write(bArr, 0, read);
                } else {
                    H.flush();
                    Util.qualityClose(H);
                    Util.qualityClose(inputStream);
                    return true;
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", "writeFile exp %s", e);
            Util.qualityClose((Closeable) null);
            Util.qualityClose(inputStream);
            return false;
        } catch (Throwable th) {
            Util.qualityClose((Closeable) null);
            Util.qualityClose(inputStream);
            throw th;
        }
    }

    /* renamed from: u */
    public final void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String optString = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        if (Util.isNullOrNil(optString)) {
            fVar.mo109647a(i, mo115109j("fail filePath invalid"));
            return;
        }
        C115250a aVar = new C115250a(fVar, optString, i);
        C1742c cVar = (C1742c) fVar.mo109668l(C1742c.class);
        if (cVar == null || Build.VERSION.SDK_INT >= 29) {
            Log.m105929w("MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum", "NULL permissionInterface with appId:%s, run directly", fVar.getAppId());
            aVar.run();
            return;
        }
        cVar.mo1729Ed(fVar.getContext(), fVar, aVar, new C115253b(fVar, i));
    }

    /* renamed from: x */
    public abstract boolean mo127298x(String str);

    /* renamed from: y */
    public abstract String mo127299y(String str);

    /* renamed from: z */
    public abstract void mo127300z(String str);
}
