package my1;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.C6048m1;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ol0.C117812i0;
import p500dy.C97560f;
import w10.C15032a;

/* renamed from: my1.a */
public class C100022a {

    /* renamed from: a */
    public HashMap<String, C100025c> f293041a = new HashMap<>();

    /* renamed from: my1.a$b */
    public static class C100024b {

        /* renamed from: a */
        public static final C100022a f293042a = new C100022a((C100023a) null);
    }

    /* renamed from: my1.a$c */
    public static class C100025c {

        /* renamed from: a */
        public int f293043a = 0;

        /* renamed from: b */
        public int f293044b = 0;

        /* renamed from: c */
        public int f293045c = 0;

        /* renamed from: d */
        public int f293046d = 0;
    }

    public C100022a(C100023a aVar) {
    }

    /* renamed from: a */
    public static String m130687a(CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        WebViewJSSDKVideoItem c = m130689c(captureVideoNormalModel.f272894e);
        if (c == null) {
            return null;
        }
        String b = m130688b(captureVideoNormalModel.f272895f, captureVideoNormalModel.f272894e);
        WebViewJSSDKFileItem b2 = C6048m1.f22342b.mo7010b(b);
        if (b2 != null) {
            c.f283023f = b2.f283024g;
        }
        c.f283036v.putInt("mark_edit_flag", m130691e(captureVideoNormalModel.mo129798a()));
        return C43702g2.m47536i(c.f283022e, b, c.f22269w, c.f283031q, c.f283030p, c.f283029o);
    }

    /* renamed from: b */
    public static String m130688b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C86009m1 m1Var = new C86009m1(str2);
            String name = m1Var.getName();
            String substring = (TextUtils.isEmpty(name) || !name.contains(".")) ? null : name.substring(0, name.lastIndexOf("."));
            if (!TextUtils.isEmpty(substring)) {
                str = m1Var.mo119973k() + "/" + substring + ".jpeg";
            } else {
                str = m1Var.mo119973k() + "microMsg_" + System.currentTimeMillis() + ".jpeg";
            }
        }
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            Log.m105925i("MicroMsg.Haowan.ActionAfterVideoEdited", "create new thumb path:%s!", str);
            Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str2, 1);
            if (createVideoThumbnail == null) {
                Log.m105921e("MicroMsg.Haowan.ActionAfterVideoEdited", "createVideoThumbnail bitmap fail for path:%s!", str);
                return "";
            }
            try {
                BitmapUtil.saveBitmapToImage(ThumbnailUtils.extractThumbnail(createVideoThumbnail, C117812i0.CTRL_INDEX, 400, 2), 30, Bitmap.CompressFormat.JPEG, str, true);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.Haowan.ActionAfterVideoEdited", "saveBitmapToImage exist IOException:" + e.getMessage());
            }
        } else {
            Log.m105925i("MicroMsg.Haowan.ActionAfterVideoEdited", "file is exist for path:%s!", str);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        WebViewJSSDKFileItem c = C6049n1.m5934c(str, str);
        c.f283034t = true;
        c.f283028n = 1;
        C6080m.Ax0().mo7009a(c);
        return c.f283022e;
    }

    /* renamed from: c */
    public static WebViewJSSDKVideoItem m130689c(String str) {
        C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(str);
        if (Z40 == null) {
            Log.m105920e("MicroMsg.Haowan.ActionAfterVideoEdited", "video after edited is error");
            return null;
        }
        WebViewJSSDKVideoItem a = C6049n1.m5932a(str);
        a.f22269w = Z40.mo130041a();
        int i = Z40.f273456n;
        if (i == 90 || i == 270) {
            a.f283030p = Z40.f273446d;
            a.f283031q = Z40.f273445c;
        } else {
            a.f283030p = Z40.f273445c;
            a.f283031q = Z40.f273446d;
        }
        a.f283029o = (int) C86013q1.m106451l(str);
        C6080m.Ax0().mo7009a(a);
        return a;
    }

    /* renamed from: d */
    public static void m130690d(String str) {
        String exportVideoPath = AndroidMediaUtil.getExportVideoPath("mp4");
        Log.m105925i("MicroMsg.Haowan.ActionAfterVideoEdited", "auto save video :%s", exportVideoPath);
        C86013q1.m106442c(str, exportVideoPath);
        AndroidMediaUtil.refreshMediaScanner(exportVideoPath, MMApplicationContext.getContext());
    }

    /* renamed from: e */
    public static int m130691e(RecordMediaReportInfo recordMediaReportInfo) {
        if (recordMediaReportInfo == null) {
            return 0;
        }
        boolean z = ((Integer) recordMediaReportInfo.mo129811b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue() != 0;
        boolean z2 = ((Integer) recordMediaReportInfo.mo129811b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue() != 0;
        boolean z3 = ((Integer) recordMediaReportInfo.mo129811b("KEY_SELECT_MUSIC_INT", 0)).intValue() != 0;
        long intValue = (long) ((Integer) recordMediaReportInfo.mo129811b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0)).intValue();
        long intValue2 = (long) ((Integer) recordMediaReportInfo.mo129811b("KEY_VIDEO_CROP_DURATION_MS_INT", 0)).intValue();
        boolean z4 = (intValue == 0 || intValue2 == 0 || intValue == intValue2) ? false : true;
        boolean z5 = z2 ? z | true : z;
        if (z3) {
            z5 |= true;
        }
        if (z4) {
            z5 |= true;
        }
        Log.m105925i("MicroMsg.Haowan.ActionAfterVideoEdited", "hasEmoji:%b, hasText:%b, hasMusic:%b, hasCut:%b, editFlag:%d", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Integer.valueOf(z5 ? 1 : 0));
        return z5;
    }

    /* renamed from: f */
    public static void m130692f(CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        int i = bundle.getInt("key_video_from", 0);
        RecordMediaReportInfo a = captureVideoNormalModel.mo129798a();
        HashMap hashMap = new HashMap();
        hashMap.put("videoid", C86013q1.m106456q(captureVideoNormalModel.f272894e));
        hashMap.put("costtime", a.mo129811b("KEY_REMUX_VIDEO_COST_MS_INT", 0));
        hashMap.put("origtime", Integer.valueOf(bundle.getInt("key_raw_video_duration", 0)));
        hashMap.put("cliptime", Integer.valueOf(Util.videoMsToSec(captureVideoNormalModel.f272896g.longValue())));
        int i2 = bundle.getInt("key_raw_video_size", 0);
        hashMap.put("origsize", Integer.valueOf(i2));
        hashMap.put("remuxsize", Integer.valueOf((int) C86013q1.m106451l(captureVideoNormalModel.f272894e)));
        int intValue = ((Integer) a.mo129811b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue();
        hashMap.put("hasexpre", Integer.valueOf(intValue));
        int intValue2 = ((Integer) a.mo129811b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue();
        hashMap.put("hasword", a.mo129811b("KEY_ADD_TEXT_COUNT_INT", 0));
        hashMap.put("hasmusic", 1);
        if (((Integer) a.mo129811b("KEY_MUSIC_ID_INT", -1)).intValue() == -1) {
            hashMap.put("hasmusic", 0);
        }
        C100025c cVar = new C100025c();
        cVar.f293046d = i2;
        cVar.f293043a = intValue2;
        cVar.f293044b = intValue;
        if (((Integer) a.mo129811b("KEY_MUSIC_ID_INT", -1)).intValue() != -1) {
            cVar.f293045c = 1;
        }
        C100024b.f293042a.f293041a.put(captureVideoNormalModel.f272894e, cVar);
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : hashMap.entrySet()) {
            stringBuffer.append((String) entry.getKey());
            stringBuffer.append(XVFSFile.PATH_SEPARATOR);
            stringBuffer.append(entry.getValue());
            stringBuffer.append(", ");
        }
        Log.m105925i("MicroMsg.Haowan.ActionAfterVideoEdited", "remuxResult:%b, statistic:[%s]", captureVideoNormalModel.f272893d, stringBuffer.toString());
        int i3 = bundle.getInt("game_haowan_source_scene_id", 0);
        if (!captureVideoNormalModel.f272893d.booleanValue()) {
            Log.m105920e("MicroMsg.Haowan.ActionAfterVideoEdited", "video remux error");
            C40314g.m43484c(MMApplicationContext.getContext(), 87, 8763, 2, 56, i3, C15032a.m14200a(i, hashMap));
            return;
        }
        C40314g.m43484c(MMApplicationContext.getContext(), 87, 8763, 2, 48, i3, C15032a.m14200a(i, hashMap));
    }

    /* renamed from: g */
    public static void m130693g(String str, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        if (!str.equals(captureVideoNormalModel.f272895f)) {
            C86013q1.m106461v(C86013q1.m106458s(str));
            if (C86013q1.m106443d(captureVideoNormalModel.f272895f, str, false) > 0) {
                captureVideoNormalModel.f272895f = str;
            }
        }
    }

    /* renamed from: h */
    public static void m130694h(String str, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        if (!str.equals(captureVideoNormalModel.f272894e)) {
            C86013q1.m106461v(C86013q1.m106458s(str));
            if (C86013q1.m106443d(captureVideoNormalModel.f272894e, str, false) > 0) {
                captureVideoNormalModel.f272894e = str;
            }
        }
    }
}
