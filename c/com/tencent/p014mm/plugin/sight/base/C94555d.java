package com.tencent.p014mm.plugin.sight.base;

import a70.C112760b;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.util.StringBuilderPrinter;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import hd0.C98403m0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import p156gj.C87200o;
import qe3.C89625d;

/* renamed from: com.tencent.mm.plugin.sight.base.d */
public class C94555d {
    /* renamed from: a */
    public static String m119565a(String str) {
        return Util.nullAs(str, "") + ".soundmp4";
    }

    /* renamed from: b */
    public static String m119566b() {
        String str;
        StringBuilder sb = new StringBuilder(512);
        StringBuilderPrinter stringBuilderPrinter = new StringBuilderPrinter(sb);
        Context context = MMApplicationContext.getContext();
        stringBuilderPrinter.println("#accinfo.revision=" + BuildInfo.REV);
        stringBuilderPrinter.println("#accinfo.build=" + BuildInfo.TIME + XVFSFile.PATH_SEPARATOR + BuildInfo.HOSTNAME + XVFSFile.PATH_SEPARATOR + ChannelUtil.channelId);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("#accinfo.env=");
        sb4.append(CrashReportFactory.foreground ? "f" : "b");
        sb4.append(XVFSFile.PATH_SEPARATOR);
        sb4.append(Thread.currentThread().getName());
        sb4.append(XVFSFile.PATH_SEPARATOR);
        sb4.append(CrashReportFactory.currentActivity);
        stringBuilderPrinter.println(sb4.toString());
        stringBuilderPrinter.println("#aacinfo.device_brand=" + C89625d.f257836b);
        stringBuilderPrinter.println("#aacinfo.device_model=" + C89625d.f257837c);
        stringBuilderPrinter.println("#aacinfo.os_type=" + C87200o.f252872e);
        stringBuilderPrinter.println("#aacinfo.os_name=" + C89625d.f257839e);
        stringBuilderPrinter.println("#aacinfo.os_version=" + C87200o.f252873f);
        stringBuilderPrinter.println("#aacinfo.device_name=" + C89625d.f257838d);
        try {
            String absolutePath = Environment.getDataDirectory().getAbsolutePath();
            StatFs statFs = new StatFs(absolutePath);
            StatFs statFs2 = new StatFs(C112760b.m154230f0());
            str = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[]{Integer.valueOf(((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryClass()), absolutePath, Integer.valueOf(statFs.getBlockSize()), Integer.valueOf(statFs.getBlockCount()), Integer.valueOf(statFs.getAvailableBlocks()), C112760b.m154230f0(), Integer.valueOf(statFs2.getBlockSize()), Integer.valueOf(statFs2.getBlockCount()), Integer.valueOf(statFs2.getAvailableBlocks())});
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SightUtil", "check data size failed :%s", e.getMessage());
            str = "";
        }
        stringBuilderPrinter.println("#accinfo.data=" + str);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        stringBuilderPrinter.println("#accinfo.crashTime=" + simpleDateFormat.format(date));
        stringBuilderPrinter.println("#crashContent=");
        return sb.toString();
    }

    /* renamed from: c */
    public static C94554a m119567c(String str, boolean z) {
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            return null;
        }
        C94554a aVar = new C94554a();
        try {
            String simpleMp4InfoVFS = SightVideoJNI.getSimpleMp4InfoVFS(str, z);
            Log.m105919d("MicroMsg.SightUtil", "get simple mp4 info %s", simpleMp4InfoVFS);
            JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
            aVar.f273443a = (int) jSONObject.getDouble("videoDuration");
            aVar.f273445c = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            aVar.f273446d = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            aVar.f273447e = (int) jSONObject.getDouble("videoFPS");
            aVar.f273444b = jSONObject.getInt("videoBitrate");
            aVar.f273449g = jSONObject.getInt("audioBitrate");
            aVar.f273448f = jSONObject.getInt("audioChannel");
            aVar.f273451i = jSONObject.getInt("useABA");
            aVar.f273452j = jSONObject.getInt("useMinMaxQP");
            aVar.f273453k = jSONObject.getInt("bitrateAdaptiveUp");
            aVar.f273450h = jSONObject.getInt("aacSampleRate");
            aVar.f273454l = jSONObject.optInt("pixelFormat", -1);
            aVar.f273455m = jSONObject.getInt("hasH264") == 1;
            aVar.f273456n = jSONObject.optInt(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, -1);
            aVar.f273457o = jSONObject.optString("format_name", "");
            aVar.f273458p = jSONObject.optString("format_long_name", "");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SightUtil", "get media info error %s", e.toString());
        }
        Log.m105925i("MicroMsg.SightUtil", "get media %s", aVar);
        return aVar;
    }

    /* renamed from: d */
    public static String m119568d(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        String e = m119569e(str, new PInt(), new PInt(), new PInt(), new PInt(), new PInt());
        stringBuffer.append("extInfo: \n" + e);
        stringBuffer.append("size: " + Util.getSizeKB(C86013q1.m106451l(str)) + XVFSFile.PATH_SEPARATOR + str + "\n");
        String mp4RecordInfo = SightVideoJNI.getMp4RecordInfo(str);
        if (!Util.isNullOrNil(mp4RecordInfo)) {
            stringBuffer.append(mp4RecordInfo);
        }
        stringBuffer.append("isH265:");
        stringBuffer.append(C98403m0.m127702b(str));
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m119569e(String str, PInt pInt, PInt pInt2, PInt pInt3, PInt pInt4, PInt pInt5) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String simpleMp4InfoVFS = SightVideoJNI.getSimpleMp4InfoVFS(str);
            Log.m105925i("MicroMsg.SightUtil", "get simple mp4 info %s", simpleMp4InfoVFS);
            JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
            if (pInt != null) {
                pInt.value = (int) jSONObject.getDouble("videoDuration");
            }
            if (pInt2 != null) {
                pInt2.value = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            }
            if (pInt3 != null) {
                pInt3.value = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            }
            if (pInt4 != null) {
                pInt4.value = (int) jSONObject.getDouble("videoFPS");
            }
            if (pInt5 != null) {
                pInt5.value = jSONObject.getInt("videoBitrate");
            }
            if (!(pInt5 == null || pInt == null || pInt2 == null || pInt3 == null || pInt4 == null)) {
                stringBuffer.append("videoBitrate: ");
                stringBuffer.append(pInt5.value);
                stringBuffer.append("\n");
                stringBuffer.append("videoWidth,videoHeight: ");
                stringBuffer.append(pInt2.value);
                stringBuffer.append("*");
                stringBuffer.append(pInt3.value);
                stringBuffer.append(" ");
                stringBuffer.append(String.format("%.4f", new Object[]{Double.valueOf((((double) pInt2.value) * 1.0d) / ((double) pInt3.value))}));
                stringBuffer.append("\n");
                stringBuffer.append("videoDuration: ");
                stringBuffer.append(pInt.value);
                stringBuffer.append("\n");
                stringBuffer.append("videoFPS: ");
                stringBuffer.append(pInt4.value);
                stringBuffer.append("\n");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SightUtil", e, "get media info error", new Object[0]);
        }
        return stringBuffer.toString();
    }
}
