package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import org.json.JSONArray;
import org.json.JSONObject;
import p206nj.C88955f;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$l */
public class s0$$l extends AsyncTask<String, Integer, String> {

    /* renamed from: c */
    public static final String f19895c = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fle) + "/tencentMapTouch/app/download/wx_android_download_ico.png");

    /* renamed from: a */
    public final WeakReference<Context> f19896a;

    /* renamed from: b */
    public final WeakReference<View> f19897b;

    public s0$$l(Context context, View view) {
        this.f19896a = new WeakReference<>(context);
        this.f19897b = new WeakReference<>(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[SYNTHETIC, Splitter:B:28:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.f19896a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            goto L_0x00bb
        L_0x0010:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r0)
            java.lang.String r3 = "MicroMsg.TrackMapUI"
            if (r2 != 0) goto L_0x0027
            com.tencent.mm.plugin.location.ui.impl.x0 r9 = new com.tencent.mm.plugin.location.ui.impl.x0
            r9.<init>(r8, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r9)
            java.lang.String r9 = "fail, network not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            goto L_0x00bb
        L_0x0027:
            boolean r2 = p206nj.C88955f.m111058b()
            if (r2 != 0) goto L_0x003c
            com.tencent.mm.plugin.location.ui.impl.y0 r9 = new com.tencent.mm.plugin.location.ui.impl.y0
            r9.<init>(r8, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r9)
            java.lang.String r9 = "fail, sdcard not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            goto L_0x00bb
        L_0x003c:
            int r0 = r9.length
            r2 = 1
            if (r0 != r2) goto L_0x00bb
            r0 = 0
            r9 = r9[r0]
            java.lang.String r4 = "download json, close input stream failure, msg: %s."
            r5 = 0
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x0087 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x0087 }
            java.io.InputStream r5 = r6.openStream()     // Catch:{ Exception -> 0x0087 }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x0087 }
            int r6 = r5.read(r9)     // Catch:{ Exception -> 0x0087 }
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x0087 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x0087 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            r9.<init>()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r1 = "json length: "
            r9.append(r1)     // Catch:{ Exception -> 0x0082 }
            r9.append(r6)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0082 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r9)     // Catch:{ Exception -> 0x0082 }
            r5.close()     // Catch:{ Exception -> 0x0074 }
            goto L_0x0080
        L_0x0074:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r9 = r9.getMessage()
            r1[r0] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r1)
        L_0x0080:
            r1 = r7
            goto L_0x00bb
        L_0x0082:
            r9 = move-exception
            r1 = r7
            goto L_0x0088
        L_0x0085:
            r9 = move-exception
            goto L_0x00a8
        L_0x0087:
            r9 = move-exception
        L_0x0088:
            java.lang.String r6 = "download failure, msg: %s."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0085 }
            r7[r0] = r9     // Catch:{ all -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r7)     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x00bb
            r5.close()     // Catch:{ Exception -> 0x009b }
            goto L_0x00bb
        L_0x009b:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r9 = r9.getMessage()
            r2[r0] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r2)
            goto L_0x00bb
        L_0x00a8:
            if (r5 == 0) goto L_0x00ba
            r5.close()     // Catch:{ Exception -> 0x00ae }
            goto L_0x00ba
        L_0x00ae:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getMessage()
            r2[r0] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r2)
        L_0x00ba:
            throw r9
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.s0$$l.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(Object obj) {
        String str = (String) obj;
        View view = this.f19897b.get();
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPostExecute", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPostExecute", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Context context = this.f19896a.get();
        if (context != null) {
            Log.m105918d("MicroMsg.TrackMapUI", "json string: " + str);
            try {
                if (!Util.isNullOrNil(str)) {
                    JSONArray optJSONArray = new JSONObject(str).optJSONArray("apkInfos");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        Intent intent = new Intent();
                        for (int i = 0; i < length; i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject == null) {
                                Log.m105918d("MicroMsg.TrackMapUI", "get json item failure, index: " + i);
                            } else if (optJSONObject.optString("cid").equals("00008")) {
                                String optString = optJSONObject.optString("apkPath");
                                String optString2 = optJSONObject.optString("size");
                                long longValue = TextUtils.isDigitsOnly(optString2) ? Long.valueOf(optString2).longValue() : 0;
                                String optString3 = optJSONObject.optString("md5");
                                Log.m105919d("MicroMsg.TrackMapUI", "url: %s, md5: %s, size: %s", optString, optString3, Long.valueOf(longValue));
                                if (longValue > 0 && !C88955f.m111059c(longValue)) {
                                    C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jyw), 0).show();
                                    Log.m105920e("MicroMsg.TrackMapUI", "fail, not enough space, require size = " + longValue);
                                    return;
                                } else if (Util.isNullOrNil(optString)) {
                                    Log.m105920e("MicroMsg.TrackMapUI", "doAddDownloadTask fail, url is null");
                                    return;
                                } else {
                                    intent.putExtra("task_name", "TencentMap");
                                    intent.putExtra("task_url", optString);
                                    intent.putExtra("task_size", longValue);
                                    intent.putExtra("file_md5", optString3);
                                    intent.putExtra("thumb_url", f19895c);
                                    intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "腾讯地图");
                                    intent.addFlags(268435456);
                                    C88144b.m109791i(context, "webview", ".ui.tools.WebViewDownloadUI", intent, (Bundle) null);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    Log.m105919d("MicroMsg.TrackMapUI", "get json array failure, key=%s.", "apkInfos");
                    C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jyu), 0).show();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.TrackMapUI", "deal json string failure, msg: %s.", e.getMessage());
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jyu), 0).show();
            }
        }
    }

    public void onPreExecute() {
        View view = this.f19897b.get();
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPreExecute", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPreExecute", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
