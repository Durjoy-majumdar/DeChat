package hi2;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import f72.C97842b;
import gy3.C87412m;
import h90.C98324b;
import hd0.C98398h0;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import p159gw.C98250h;
import p232rw.C101475j;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: hi2.h */
public final class C98453h {

    /* renamed from: a */
    public static final C98453h f288774a = new C98453h();

    /* renamed from: b */
    public static final String f288775b;

    /* renamed from: c */
    public static final String f288776c;

    /* renamed from: d */
    public static final MultiProcessMMKV f288777d = MultiProcessMMKV.getMMKV("media_file_key");

    /* renamed from: e */
    public static final HashSet<String> f288778e = new HashSet<>();

    /* renamed from: hi2.h$b */
    public static final class C32930b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f89505d;

        public C32930b(String str) {
            this.f89505d = str;
        }

        public final void run() {
            Log.m105924i("MicroMsg.MediaFileUtil", "exec delete filePath:" + this.f89505d);
            C86013q1.m106447h(this.f89505d);
        }
    }

    /* renamed from: hi2.h$a */
    public static final class C98454a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98324b f288779d;

        public C98454a(C98324b bVar) {
            this.f288779d = bVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.MediaFileUtil", "deleteDaemonMediaFile");
            C98453h hVar = C98453h.f288774a;
            hVar.mo137810h(this.f288779d.f288185f);
            hVar.mo137810h(this.f288779d.f288186g);
        }
    }

    /* renamed from: hi2.h$c */
    public static final class C98455c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecordConfigProvider f288780d;

        public C98455c(RecordConfigProvider recordConfigProvider) {
            this.f288780d = recordConfigProvider;
        }

        public final void run() {
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
            Log.m105924i("MicroMsg.MediaFileUtil", "handleDaemonNoNeedRemuxCaptureVideo videoState : " + g + ' ');
            if (g) {
                String i = C97842b.m126292i("mp4");
                ((C98250h) C86312j.m106911c(C98250h.class)).O00(MMApplicationContext.getContext(), this.f288780d.f272901B, i);
                AndroidMediaUtil.refreshMediaScanner(i, MMApplicationContext.getContext());
            }
            C98453h.f288774a.mo137810h(this.f288780d.f272900A);
        }
    }

    /* renamed from: hi2.h$d */
    public static final class C98456d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f288781d;

        public C98456d(String str) {
            this.f288781d = str;
        }

        public final void run() {
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
            Log.m105924i("MicroMsg.MediaFileUtil", "remuxComposition videoState : " + g + " videoPath:" + this.f288781d);
            if (g) {
                String exportVideoPath = AndroidMediaUtil.getExportVideoPath("mp4");
                Context context = MMApplicationContext.getContext();
                String str = this.f288781d;
                C87412m.m108591d(str);
                ((C98250h) C86312j.m106911c(C98250h.class)).O00(context, str, exportVideoPath);
                AndroidMediaUtil.refreshMediaScanner(exportVideoPath, MMApplicationContext.getContext());
            }
            ((C101475j) C86312j.m106911c(C101475j.class)).P10(this.f288781d);
        }
    }

    /* renamed from: hi2.h$e */
    public static final class C98457e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecordConfigProvider f288782d;

        public C98457e(RecordConfigProvider recordConfigProvider) {
            this.f288782d = recordConfigProvider;
        }

        public final void run() {
            Log.m105924i("MicroMsg.MediaFileUtil", "handleNoNeedRemuxCaptureVideo");
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
            Log.m105924i("MicroMsg.MediaFileUtil", "handleNoNeedRemuxCaptureVideo videoState : " + g + ' ');
            if (g) {
                String i = C97842b.m126292i("mp4");
                ((C98250h) C86312j.m106911c(C98250h.class)).O00(MMApplicationContext.getContext(), this.f288782d.f272901B, i);
                AndroidMediaUtil.refreshMediaScanner(i, MMApplicationContext.getContext());
            }
            ((C101475j) C86312j.m106911c(C101475j.class)).P10(this.f288782d.f272901B);
            C98453h.f288774a.mo137810h(this.f288782d.f272900A);
        }
    }

    /* renamed from: hi2.h$f */
    public static final class C98458f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f288783d;

        /* renamed from: e */
        public final /* synthetic */ String f288784e;

        /* renamed from: f */
        public final /* synthetic */ boolean f288785f;

        /* renamed from: g */
        public final /* synthetic */ boolean f288786g;

        /* renamed from: h */
        public final /* synthetic */ boolean f288787h;

        /* renamed from: i */
        public final /* synthetic */ String f288788i;

        public C98458f(boolean z, String str, boolean z2, boolean z3, boolean z4, String str2) {
            this.f288783d = z;
            this.f288784e = str;
            this.f288785f = z2;
            this.f288786g = z3;
            this.f288787h = z4;
            this.f288788i = str2;
        }

        public final void run() {
            if (!this.f288783d) {
                C98453h.f288774a.mo137810h(this.f288784e);
            }
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
            Log.m105924i("MicroMsg.MediaFileUtil", "videoState : " + g + ' ');
            if (g) {
                boolean z = this.f288785f;
                if (z || (!z && this.f288786g && this.f288787h)) {
                    String i = C97842b.m126292i("mp4");
                    if (!this.f288785f) {
                        i = AndroidMediaUtil.getExportVideoPath("mp4");
                    }
                    Log.m105924i("MicroMsg.MediaFileUtil", "auto save video :" + i);
                    ((C98250h) C86312j.m106911c(C98250h.class)).O00(MMApplicationContext.getContext(), this.f288788i, i);
                    AndroidMediaUtil.refreshMediaScanner(i, MMApplicationContext.getContext());
                    ((C101475j) C86312j.m106911c(C101475j.class)).P10(this.f288788i);
                }
            }
        }
    }

    static {
        String str = C86709a0.m107535s().f251806d + "recordPlugin/";
        f288775b = str + "temp/";
        f288776c = str + "mix/";
    }

    /* renamed from: t */
    public static boolean m127895t(C98453h hVar, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        hVar.getClass();
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(str2, "thumbPath");
        if (C86013q1.m106450k(str2)) {
            Log.m105924i("MicroMsg.MediaFileUtil", str2 + " is exit");
            C86013q1.m106447h(str2);
        }
        Bitmap q = C97842b.m126300q(str);
        if (q != null && i > 0) {
            try {
                BitmapUtil.saveBitmapToImage(hVar.mo137807e(q, i), 60, Bitmap.CompressFormat.JPEG, str2, true);
                return true;
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.MediaFileUtil", "thumbSize > 0 and save error");
            }
        } else if (q != null) {
            try {
                BitmapUtil.saveBitmapToImage(q, 60, Bitmap.CompressFormat.JPEG, str2, true);
                return true;
            } catch (IOException unused2) {
                Log.m105920e("MicroMsg.MediaFileUtil", "save error");
            }
        } else {
            Log.m105920e("MicroMsg.MediaFileUtil", "saveThumb error");
        }
        return false;
    }

    /* renamed from: a */
    public final void mo137803a(String str, String str2) {
        Log.m105924i("MicroMsg.MediaFileUtil", "checkAndMarkDeletePhotoFile key:" + str + " filePath:" + str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C87412m.m108591d(str2);
            if (C112550d0.m153801u(str2, "photoEdited_", false)) {
                mo137819q(str, str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo137804b(RecordConfigProvider recordConfigProvider) {
        String str;
        String str2;
        C87412m.m108594g(recordConfigProvider, "configProvider");
        if (TextUtils.isEmpty(recordConfigProvider.f272904E)) {
            recordConfigProvider.f272904E = mo137813k();
        }
        if (TextUtils.isEmpty(recordConfigProvider.f272903D)) {
            String str3 = "photoCapture_" + System.currentTimeMillis();
            C32925e eVar = C32925e.f89499a;
            if (eVar.mo58865f()) {
                str2 = eVar.mo58863c("capture", str3);
            } else {
                String i = C86013q1.m106448i("wcf://temp/" + str3, true);
                if (i == null) {
                    str2 = MMApplicationContext.getContext().getCacheDir().getAbsolutePath() + XVFSFile.SEPARATOR_CHAR + str3;
                } else {
                    str2 = i;
                }
            }
            recordConfigProvider.f272903D = str2;
        }
        if (TextUtils.isEmpty(recordConfigProvider.f272900A)) {
            C32925e eVar2 = C32925e.f89499a;
            if (eVar2.mo58865f()) {
                str = C97842b.m126295l(eVar2.mo58862b("capture"));
                C87412m.m108593f(str, "getTempFileName(MediaFil…mpFileDir(MEDIA_CAPTURE))");
            } else {
                str = C97842b.m126295l(C98398h0.wx0().ca0());
                C87412m.m108593f(str, "getTempFileName(SubCoreV…o.getCore().accVideoPath)");
            }
            recordConfigProvider.f272900A = str;
        }
        mo137806d(recordConfigProvider);
    }

    /* renamed from: c */
    public final void mo137805c(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
        if (TextUtils.isEmpty(recordConfigProvider.f272904E)) {
            recordConfigProvider.f272904E = C98398h0.wx0().ca0() + "/vsg_output_" + System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public final void mo137806d(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
        C32925e eVar = C32925e.f89499a;
        if (eVar.mo58865f()) {
            String b = eVar.mo58862b("edit");
            long currentTimeMillis = System.currentTimeMillis();
            if (TextUtils.isEmpty(recordConfigProvider.f272902C)) {
                recordConfigProvider.f272902C = b + "/vsg_thumb_" + currentTimeMillis;
            }
            if (TextUtils.isEmpty(recordConfigProvider.f272901B)) {
                recordConfigProvider.f272901B = b + "/vsg_output_" + currentTimeMillis;
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(recordConfigProvider.f272902C)) {
            recordConfigProvider.f272902C = C98398h0.wx0().ca0() + "/vsg_thumb_" + System.currentTimeMillis();
        }
        if (TextUtils.isEmpty(recordConfigProvider.f272901B)) {
            recordConfigProvider.f272901B = C98398h0.wx0().ca0() + "/vsg_output_" + System.currentTimeMillis();
        }
    }

    /* renamed from: e */
    public final Bitmap mo137807e(Bitmap bitmap, int i) {
        int i2;
        C87412m.m108594g(bitmap, "bitmap");
        if (i <= 0 || Math.min(bitmap.getWidth(), bitmap.getHeight()) <= i) {
            return bitmap;
        }
        if (bitmap.getWidth() < bitmap.getHeight()) {
            i2 = (int) ((((float) (bitmap.getHeight() * i)) * 1.0f) / ((float) bitmap.getWidth()));
        } else {
            i2 = i;
            i = (int) ((((float) (bitmap.getWidth() * i)) * 1.0f) / ((float) bitmap.getHeight()));
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        C87412m.m108593f(createScaledBitmap, "createScaledBitmap(bitma…idth, outputHeight, true)");
        return createScaledBitmap;
    }

    /* renamed from: f */
    public final void mo137808f(String str, boolean z) {
        C87412m.m108594g(str, "newVideoPath");
        if (!(str.length() == 0)) {
            String s = C86013q1.m106458s(str);
            C86013q1.m106461v(s);
            if (z) {
                C86013q1.m106460u(s);
            }
        }
    }

    /* renamed from: g */
    public final void mo137809g(C98324b bVar) {
        if (bVar != null) {
            ((C119157j) C119157j.f356862d).mo183876g(new C98454a(bVar), "deleteDaemonMediaFile");
        }
    }

    /* renamed from: h */
    public final void mo137810h(String str) {
        boolean k = C86013q1.m106450k(str);
        boolean z = false;
        Log.printInfoStack("MicroMsg.MediaFileUtil", "path:" + str + "  fileExist:" + k, new Object[0]);
        if (str != null && C112550d0.m153801u(str, "DCIM", true)) {
            z = true;
        }
        if (!z && k) {
            ((C119157j) C119157j.f356862d).mo183876g(new C32930b(str), "MediaFileUtil_deleteMediaFile");
        }
    }

    /* renamed from: i */
    public final void mo137811i(String str) {
        Log.m105924i("MicroMsg.MediaFileUtil", "deleteMarkFilePath " + str);
        MultiProcessMMKV multiProcessMMKV = f288777d;
        Set<String> decodeStringSet = multiProcessMMKV.decodeStringSet("media_file_delete_set", new HashSet());
        if (decodeStringSet.contains(str)) {
            decodeStringSet.remove(str);
            mo137810h(str);
        }
        multiProcessMMKV.encode("media_file_delete_set", decodeStringSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (z04.C112550d0.m153801u(r5, r2, false) == true) goto L_0x0035;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137812j(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "deleteVideoFileWithCheckPath "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MediaFileUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x003a
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0034
            hd0.h0 r2 = hd0.C98398h0.wx0()
            java.lang.String r2 = r2.ca0()
            java.lang.String r3 = "getCore().accVideoPath"
            gy3.C87412m.m108593f(r2, r3)
            boolean r2 = z04.C112550d0.m153801u(r5, r2, r1)
            if (r2 != r0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r4.mo137810h(r5)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hi2.C98453h.mo137812j(java.lang.String):void");
    }

    /* renamed from: k */
    public final String mo137813k() {
        String str = "photoEdited_" + System.currentTimeMillis();
        C32925e eVar = C32925e.f89499a;
        if (eVar.mo58865f()) {
            return eVar.mo58863c("edit", str);
        }
        String i = C86013q1.m106448i("wcf://temp/" + str, true);
        if (i != null) {
            return i;
        }
        return MMApplicationContext.getContext().getCacheDir().getAbsolutePath() + XVFSFile.SEPARATOR_CHAR + str;
    }

    /* renamed from: l */
    public final boolean mo137814l(RecordConfigProvider recordConfigProvider, boolean z) {
        Log.m105924i("MicroMsg.MediaFileUtil", "configProvider : " + recordConfigProvider + "  isCaptureMedia:" + z + "  ");
        if (!z) {
            return false;
        }
        if (recordConfigProvider == null) {
            return true;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C98455c(recordConfigProvider), "mux_save_work_daemon");
        return true;
    }

    /* renamed from: m */
    public final void mo137815m(String str) {
        if (!TextUtils.isEmpty(str) && C86013q1.m106450k(str)) {
            ((C119157j) C119157j.f356862d).mo183875f(new C98456d(str));
        }
    }

    /* renamed from: n */
    public final boolean mo137816n(RecordConfigProvider recordConfigProvider, boolean z) {
        Log.m105924i("MicroMsg.MediaFileUtil", "configProvider : " + recordConfigProvider + "  isCaptureMedia:" + z + "  ");
        if (!z) {
            return false;
        }
        if (recordConfigProvider == null) {
            return true;
        }
        if (C86013q1.m106450k(recordConfigProvider.f272900A)) {
            ((C98250h) C86312j.m106911c(C98250h.class)).O00(MMApplicationContext.getContext(), recordConfigProvider.f272900A, recordConfigProvider.f272901B);
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C98457e(recordConfigProvider), "handleNoNeedRemuxCaptureVideo");
        return true;
    }

    /* renamed from: o */
    public final void mo137817o(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4) {
        C87412m.m108594g(str, "inputVideoPath");
        C87412m.m108594g(str2, "outputVideoPath");
        Log.m105924i("MicroMsg.MediaFileUtil", "handleRemuxVideo >> saveSourceMedia: " + z + ", savaToSysAlbumIfMediaEdited: " + z2 + ", isCaptureMedia: " + z3 + ". change: " + z4);
        ((C119157j) C119157j.f356862d).mo183876g(new C98458f(z, str, z3, z2, z4, str2), "mux_save_work");
    }

    /* renamed from: p */
    public final void mo137818p(String str) {
        if (!TextUtils.isEmpty(str)) {
            Log.m105924i("MicroMsg.MediaFileUtil", "cache delete file " + str);
            MultiProcessMMKV multiProcessMMKV = f288777d;
            Set<String> decodeStringSet = multiProcessMMKV.decodeStringSet("media_file_delete_set", new HashSet());
            decodeStringSet.add(str);
            multiProcessMMKV.encode("media_file_delete_set", decodeStringSet);
        }
    }

    /* renamed from: q */
    public final void mo137819q(String str, String str2) {
        Log.m105924i("MicroMsg.MediaFileUtil", "cache delete key: " + str + " , file " + str2);
        if (str != null && str2 != null) {
            f288777d.encode(str, str2);
        }
    }

    /* renamed from: r */
    public final void mo137820r(String str) {
        boolean z = true;
        if (str == null || !C112550d0.m153801u(str, "photoEdited_", false)) {
            z = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.MediaFileUtil", "markDeletePhotoEditFile: " + str);
            mo137818p(str);
        }
    }

    /* renamed from: s */
    public final void mo137821s(String str) {
        Log.m105924i("MicroMsg.MediaFileUtil", "markTimingDeleteFile file " + str);
        if (!TextUtils.isEmpty(str)) {
            MultiProcessMMKV multiProcessMMKV = f288777d;
            Set<String> decodeStringSet = multiProcessMMKV.decodeStringSet("media_timing_delete_set", new HashSet());
            decodeStringSet.add(str);
            multiProcessMMKV.encode("media_timing_delete_set", decodeStringSet);
        }
    }
}
