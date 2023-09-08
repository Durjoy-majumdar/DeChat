package rb0;

import android.graphics.Bitmap;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31519v2;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p823sg.C90193h;

/* renamed from: rb0.x */
public final class C48011x {

    /* renamed from: rb0.x$a */
    public static final class C48012a {

        /* renamed from: a */
        public List<C48013a> f128790a = new ArrayList();

        /* renamed from: b */
        public Map<String, Integer> f128791b = new HashMap();

        /* renamed from: c */
        public Map<String, WeakReference<Bitmap>> f128792c = new HashMap();

        /* renamed from: d */
        public QueueWorkerThread f128793d = null;

        /* renamed from: rb0.x$a$a */
        public interface C48013a {
            /* renamed from: a */
            void mo72799a(String str);
        }

        /* renamed from: a */
        public String mo72797a(String str) {
            if (!C86709a0.m107523b().mo121114l()) {
                return "";
            }
            return ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72738M3() + "/brand_" + C90193h.m112878f(str.getBytes());
        }

        /* renamed from: b */
        public final void mo72798b(String str, Bitmap bitmap) {
            Bitmap bitmap2;
            Bitmap bitmap3 = ((HashMap) this.f128792c).containsKey(str) ? (Bitmap) ((WeakReference) ((HashMap) this.f128792c).get(str)).get() : null;
            if (bitmap3 == null || bitmap3.isRecycled()) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
                    bitmap2 = BitmapUtil.getRoundedCornerBitmap(createScaledBitmap, true, (float) (createScaledBitmap.getWidth() >> 1));
                } catch (OutOfMemoryError unused) {
                    bitmap2 = bitmap;
                }
                ((HashMap) this.f128792c).remove(str);
                ((HashMap) this.f128792c).put(str, new WeakReference(bitmap3));
            }
            if (bitmap3 != bitmap) {
                Log.m105925i("MicroMsg.BrandLogic", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
        }
    }

    /* renamed from: rb0.x$b */
    public static class C48014b implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public byte[] f128794d = null;

        /* renamed from: e */
        public final String f128795e;

        /* renamed from: f */
        public final String f128796f;

        public C48014b(String str, String str2) {
            this.f128795e = str;
            this.f128796f = str2;
        }

        public boolean doInBackground() {
            if (!Util.isNullOrNil(this.f128795e) && !Util.isNullOrNil(this.f128796f)) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    InputStream b = C81035d.m98961b(this.f128796f, 3000, 5000);
                    if (b == null) {
                        return false;
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = b.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    b.close();
                    this.f128794d = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    if (Util.isNullOrNil(this.f128794d)) {
                        Log.m105920e("MicroMsg.BrandLogic", "imgBuff null brand:" + this.f128795e);
                        return false;
                    }
                    if (C86709a0.m107523b().mo121114l()) {
                        ((C29048w.C29055f) C31519v2.f84271a).mo56422a(this.f128794d.length, 0, 0);
                        C48012a Lx0 = C48009v0.Lx0();
                        String str = this.f128795e;
                        String str2 = this.f128796f;
                        byte[] bArr2 = this.f128794d;
                        Lx0.getClass();
                        try {
                            Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr2);
                            BitmapUtil.saveBitmapToImage(decodeByteArray, 100, Bitmap.CompressFormat.PNG, Lx0.mo72797a(str + str2), false);
                            Lx0.mo72798b(str, decodeByteArray);
                            Log.m105924i("MicroMsg.BrandLogic", "update brand icon for  " + str + ", done");
                            ((HashMap) Lx0.f128791b).remove(str);
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.BrandLogic", "exception:%s", Util.stackTraceToString(e));
                        }
                    }
                    return true;
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.BrandLogic", "exception:%s", Util.stackTraceToString(e2));
                    Log.m105920e("MicroMsg.BrandLogic", "get url:" + this.f128796f + " failed.");
                    this.f128794d = null;
                }
            }
            return false;
        }

        public boolean onPostExecute() {
            C48012a Lx0 = C48009v0.Lx0();
            String str = this.f128795e;
            Lx0.getClass();
            int i = 0;
            while (i < ((ArrayList) Lx0.f128790a).size()) {
                try {
                    ((C48012a.C48013a) ((ArrayList) Lx0.f128790a).get(i)).mo72799a(str);
                    i++;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.BrandLogic", "exception:%s", Util.stackTraceToString(e));
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public static String m53371a(String str, String str2) {
        if (str == null || !C86709a0.m107523b().mo121114l()) {
            return null;
        }
        String str3 = C48009v0.Fx0().mo72757SE(str).field_brandIconURL;
        return str3 != null ? str3 : str2;
    }
}
