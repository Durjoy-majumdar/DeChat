package com.tencent.xweb.extension.video;

import android.content.Context;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.XWebLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XWebFullscreenVideoUtil {
    public static final String TAG = "XWebFullscreenVideoUtil";
    public static final String XWEB_FULLSCREEN_VIDEO_JAVASCRIPT_INTERFACE = "xwebToNative";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FILENAME = "xweb_fullscreen_video.js";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_EXITFULLSCREEN = "xwebVideoBridge.xwebToJS_Video_ExitFullscreen();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_MUTE = "xwebVideoBridge.xwebToJS_Video_MuteChange(%b);";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_MUTE_KEYWORD = "xwebVideoBridge.xwebToJS_Video_MuteChange";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_NEW_PAUSE = "xwebVideoBridge.xwebToJS_Video_NewPause();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_NEW_PLAY = "xwebVideoBridge.xwebToJS_Video_NewPlay();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_PLAY = "xwebVideoBridge.xwebToJS_Video_Play();";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_RATE_CHANGE = "xwebVideoBridge.xwebToJS_Video_RateChange(%f);";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_RATE_CHANGE_KEYWORD = "xwebVideoBridge.xwebToJS_Video_RateChange";
    public static final String XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_SEEK = "xwebVideoBridge.xwebToJS_Video_Seek(%f);";

    public static String addDOMLoadedEventJS(String str) {
        return "window.addEventListener('DOMContentLoaded', function() {" + str + "});this.xwebReturn = function (){return \"1\";};this.xwebReturn()";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String initJs() {
        /*
            java.lang.String r0 = "FullScreenVideo"
            com.tencent.xweb.xwalk.plugin.XWalkPlugin r0 = com.tencent.xweb.xwalk.plugin.XWalkPluginManager.getPlugin(r0)
            java.lang.String r1 = "initJs, open jsFile error"
            r2 = -1
            java.lang.String r3 = "XWebFullscreenVideoUtil"
            r4 = 0
            if (r0 == 0) goto L_0x0044
            int r5 = r0.getAvailableVersion()
            if (r5 == r2) goto L_0x0044
            int r5 = r0.getAvailableVersion()
            java.io.File r6 = new java.io.File
            int r7 = r0.getAvailableVersion()
            r8 = 0
            java.lang.String r7 = r0.getDownloadFullPath(r7, r8)
            r6.<init>(r7)
            boolean r7 = r6.isFile()
            if (r7 == 0) goto L_0x003d
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x003d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0038 }
            r0.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0038 }
            goto L_0x0042
        L_0x0038:
            r0 = move-exception
            com.tencent.xweb.util.XWebLog.m21910e(r3, r1, r0)
            goto L_0x0041
        L_0x003d:
            r6 = 1
            r0.setAvailableVersion(r2, r6)
        L_0x0041:
            r0 = r4
        L_0x0042:
            r2 = r5
            goto L_0x0045
        L_0x0044:
            r0 = r4
        L_0x0045:
            if (r0 == 0) goto L_0x0094
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r5.<init>(r0, r6)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0072, all -> 0x006e }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0072, all -> 0x006e }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x006c }
            r7.<init>()     // Catch:{ IOException -> 0x006c }
        L_0x0058:
            java.lang.String r8 = r6.readLine()     // Catch:{ IOException -> 0x006c }
            if (r8 == 0) goto L_0x0067
            r7.append(r8)     // Catch:{ IOException -> 0x006c }
            java.lang.String r8 = "\n"
            r7.append(r8)     // Catch:{ IOException -> 0x006c }
            goto L_0x0058
        L_0x0067:
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x006c }
            goto L_0x007e
        L_0x006c:
            r7 = move-exception
            goto L_0x007b
        L_0x006e:
            r1 = move-exception
            r6 = r4
        L_0x0070:
            r4 = r5
            goto L_0x008a
        L_0x0072:
            r7 = move-exception
            r6 = r4
            goto L_0x007b
        L_0x0075:
            r1 = move-exception
            r6 = r4
            goto L_0x008a
        L_0x0078:
            r7 = move-exception
            r5 = r4
            r6 = r5
        L_0x007b:
            com.tencent.xweb.util.XWebLog.m21910e(r3, r1, r7)     // Catch:{ all -> 0x0088 }
        L_0x007e:
            com.tencent.xweb.util.FileUtils.tryClose(r5)
            com.tencent.xweb.util.FileUtils.tryClose(r6)
            com.tencent.xweb.util.FileUtils.tryClose(r0)
            goto L_0x0094
        L_0x0088:
            r1 = move-exception
            goto L_0x0070
        L_0x008a:
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            com.tencent.xweb.util.FileUtils.tryClose(r6)
            com.tencent.xweb.util.FileUtils.tryClose(r0)
            throw r1
        L_0x0094:
            if (r4 == 0) goto L_0x00b5
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initJs, use video js version:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r3, r0)
            com.tencent.xweb.util.WXWebReporter.onFullScreenJSUseDownload()
            goto L_0x00c7
        L_0x00b5:
            java.lang.String r0 = "initJs, use video js default"
            com.tencent.xweb.util.XWebLog.m21911i(r3, r0)
            android.content.Context r0 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            java.lang.String r1 = "xweb_fullscreen_video.js"
            java.lang.String r4 = loadAssetTextAsString(r0, r1)
            com.tencent.xweb.util.WXWebReporter.onFullScreenJSUseDefault()
        L_0x00c7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.extension.video.XWebFullscreenVideoUtil.initJs():java.lang.String");
    }

    private static String loadAssetTextAsString(Context context, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            boolean z = true;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(10);
                        }
                        sb.append(readLine);
                    } else {
                        String sb4 = sb.toString();
                        FileUtils.tryClose(bufferedReader);
                        return sb4;
                    }
                } catch (IOException e) {
                    e = e;
                    try {
                        XWebLog.m21910e(TAG, "loadAssetTextAsString, error:", e);
                        FileUtils.tryClose(bufferedReader);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        FileUtils.tryClose(bufferedReader2);
                        throw th;
                    }
                }
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
            XWebLog.m21910e(TAG, "loadAssetTextAsString, error:", e);
            FileUtils.tryClose(bufferedReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            FileUtils.tryClose(bufferedReader2);
            throw th;
        }
    }
}
