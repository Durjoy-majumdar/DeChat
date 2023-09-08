package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.page.C83762b1;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import java.io.IOException;
import lp3.C88631d;
import mi0.C34574b;
import mp3.C88819d;
import p1044ub.C90630c;
import p1044ub.C90634e;
import p547hb.C87464c;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.h0 */
public class C82967h0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.h0$a */
    public class C82968a implements C88631d.C88632b<Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ C90630c f242598a;

        /* renamed from: b */
        public final /* synthetic */ String f242599b;

        public C82968a(C90630c cVar, String str) {
            this.f242598a = cVar;
            this.f242599b = str;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C82967h0.m101764c(this.f242598a, this.f242599b, (Bitmap) obj);
        }
    }

    /* renamed from: a */
    public static StringBuilder m101762a(String str, int i) {
        int LU = ((C34574b) C86312j.m106911c(C34574b.class)).mo56629LU(str);
        StringBuilder sb = new StringBuilder("1_");
        sb.append(str);
        sb.append("_");
        sb.append(MD5Util.getMD5String(C77710q.m93738a(LU)));
        sb.append("_");
        sb.append(Util.nowSecond());
        sb.append("_");
        sb.append(i);
        return sb;
    }

    /* renamed from: b */
    public static String m101763b(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("file://") ? str.replace("file://", "") : str.startsWith("delayLoadFile://") ? str.replace("delayLoadFile://", "") : str;
    }

    /* renamed from: c */
    public static void m101764c(C83780d1 d1Var, String str, Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, str, true);
                    Log.m105925i("MicroMsg.ShareHelper", "saveFile(appId : %s, pageView : %s, saveFileCost : %sms)", d1Var.getAppId(), Integer.valueOf(d1Var.hashCode()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    Bundle bundle = new Bundle();
                    bundle.putString("delay_load_img_path", "file://" + str);
                    Log.m105925i("MicroMsg.ShareHelper", "notifyToRefreshImg(cost : %s)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    bundle.putInt("action", 2);
                    C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C29537b.class, (C1256g) null);
                }
            } catch (Exception e) {
                Log.m105929w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", e);
                if (!bitmap.isRecycled()) {
                    Log.m105925i("MicroMsg.ShareHelper", "bitmap recycle %s", bitmap);
                } else {
                    return;
                }
            } catch (Throwable th) {
                if (!bitmap.isRecycled()) {
                    Log.m105925i("MicroMsg.ShareHelper", "bitmap recycle %s", bitmap);
                    bitmap.recycle();
                }
                throw th;
            }
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.ShareHelper", "bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m101765d(java.lang.String r32, int r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, java.lang.String r42, java.lang.String r43, int r44, java.lang.String r45, int r46, int r47, java.lang.String r48) {
        /*
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = ""
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r32)
            java.lang.String r3 = "MicroMsg.ShareHelper"
            if (r2 == 0) goto L_0x0012
            java.lang.String r0 = "appId is Null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return
        L_0x0012:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r38)     // Catch:{ UnsupportedEncodingException -> 0x001b }
            java.lang.String r2 = p206nj.C117627q.m165909b(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x001b }
            goto L_0x0021
        L_0x001b:
            java.lang.String r2 = "encode share page path error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            r2 = r1
        L_0x0021:
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r39)     // Catch:{ UnsupportedEncodingException -> 0x002a }
            java.lang.String r4 = p206nj.C117627q.m165909b(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x002a }
            goto L_0x0030
        L_0x002a:
            java.lang.String r4 = "encode current page path error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            r4 = r1
        L_0x0030:
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r43)     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            java.lang.String r5 = p206nj.C117627q.m165909b(r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            java.lang.String r5 = "encode current html url error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
            r5 = r1
        L_0x003f:
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r45)     // Catch:{ UnsupportedEncodingException -> 0x0048 }
            java.lang.String r6 = p206nj.C117627q.m165909b(r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x0048 }
            goto L_0x004e
        L_0x0048:
            java.lang.String r6 = "encode thumb Icon url error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r6 = r1
        L_0x004e:
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r37)     // Catch:{ UnsupportedEncodingException -> 0x0057 }
            java.lang.String r7 = p206nj.C117627q.m165909b(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            java.lang.String r7 = "encode shareTitle error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            r7 = r37
        L_0x005e:
            r8 = r44
            int r8 = r8 + 1000
            r9 = 0
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r48)     // Catch:{ UnsupportedEncodingException -> 0x0078 }
            java.lang.String r0 = p206nj.C117627q.m165909b(r10, r0)     // Catch:{ UnsupportedEncodingException -> 0x0078 }
            int r10 = r0.length()     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            r11 = 1024(0x400, float:1.435E-42)
            if (r10 < r11) goto L_0x007e
            java.lang.String r0 = r0.substring(r9, r11)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            goto L_0x007e
        L_0x0078:
            r0 = r1
        L_0x0079:
            java.lang.String r10 = "encode messageExtraData error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r10)
        L_0x007e:
            com.tencent.mm.plugin.appbrand.jsapi.share.i0 r10 = com.tencent.p014mm.plugin.appbrand.jsapi.share.C82972j0.m101771a(r42)
            if (r10 != 0) goto L_0x0086
            r11 = 0
            goto L_0x0088
        L_0x0086:
            int r11 = r10.f242601b
        L_0x0088:
            if (r10 != 0) goto L_0x008c
            r10 = 0
            goto L_0x008e
        L_0x008c:
            int r10 = r10.f242605f
        L_0x008e:
            r12 = 20
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r14 = 14077(0x36fd, float:1.9726E-41)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r13[r9] = r15
            r15 = 1
            r13[r15] = r32
            java.lang.Integer r16 = java.lang.Integer.valueOf(r33)
            r17 = 2
            r13[r17] = r16
            r16 = 3
            r13[r16] = r34
            r18 = 4
            r13[r18] = r35
            r19 = 5
            r13[r19] = r39
            r20 = 6
            r13[r20] = r40
            r21 = 7
            r13[r21] = r7
            r22 = 8
            r13[r22] = r38
            r23 = 9
            r13[r23] = r42
            java.lang.Integer r24 = java.lang.Integer.valueOf(r41)
            r25 = 10
            r13[r25] = r24
            r24 = 11
            r13[r24] = r36
            r26 = 12
            r13[r26] = r5
            java.lang.Integer r27 = java.lang.Integer.valueOf(r8)
            r28 = 13
            r13[r28] = r27
            r27 = 14
            r13[r27] = r6
            java.lang.Integer r29 = java.lang.Integer.valueOf(r46)
            r30 = 15
            r13[r30] = r29
            r29 = 16
            java.lang.Integer r31 = java.lang.Integer.valueOf(r47)
            r13[r29] = r31
            r29 = 17
            r13[r29] = r48
            r29 = 18
            java.lang.Integer r31 = java.lang.Integer.valueOf(r11)
            r13[r29] = r31
            r29 = 19
            java.lang.Integer r31 = java.lang.Integer.valueOf(r10)
            r13[r29] = r31
            java.lang.String r14 = "stev report(%s), appId %s, scene %s, sceneNote %s, sessionId %s, currentPath %s, currentTitle %s,shareTitle %s, sharePath %s, shareActionId %s, destinationUserCount %s, toUsername %s, htmlUrl %s, appServiceType %s, thumbIconUrl %s, appVersion %d , destinationType %d, messageExtraData %s,shareActionType:%d, shareSourceType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r14, r13)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r9] = r32
            java.lang.Integer r9 = java.lang.Integer.valueOf(r33)
            r12[r15] = r9
            r12[r17] = r34
            r12[r16] = r35
            r12[r18] = r4
            r12[r19] = r40
            r12[r20] = r7
            r12[r21] = r2
            r12[r22] = r42
            r12[r23] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
            r12[r25] = r1
            r12[r24] = r36
            r12[r26] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r12[r28] = r1
            r12[r27] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r46)
            r12[r30] = r1
            r1 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r47)
            r12[r1] = r2
            r1 = 17
            r12[r1] = r0
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r12[r0] = r1
            r0 = 19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r12[r0] = r1
            r0 = 14077(0x36fd, float:1.9726E-41)
            r3.mo160131h(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.share.C82967h0.m101765d(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, int, int, java.lang.String):void");
    }

    /* renamed from: e */
    public static String m101766e(C90630c cVar, String str, boolean z) {
        if (cVar == null) {
            return null;
        }
        String appId = cVar.getAppId();
        if (Util.isNullOrNil(str)) {
            if (!z) {
                return null;
            }
            cVar.mo109673t(new C90634e(cVar));
            if (cVar.getFileSystem() == null) {
                Log.m105921e("MicroMsg.ShareHelper", "tryToGetLocalFilePath NULL fs with appId(%s)", cVar.getAppId());
                return null;
            }
            C81415h0 fileSystem = cVar.getFileSystem();
            C86009m1 allocTempFile = fileSystem.allocTempFile("share_" + System.nanoTime());
            if (allocTempFile == null) {
                return null;
            }
            String i = allocTempFile.mo119971i();
            if (cVar.mo116150E0(C87464c.class) != null) {
                m101764c(cVar, i, cVar.mo116159N0());
                return i;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("action", 1);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C29537b.class, (C1256g) null);
            cVar.mo124766C1().mo114039c(C88819d.HEAVY_WORK, new C82968a(cVar, i));
            return "delayLoadFile://" + i;
        } else if (str.startsWith("wxfile://")) {
            C86009m1 absoluteFile = cVar.getFileSystem().getAbsoluteFile(str);
            if (absoluteFile == null || !absoluteFile.mo119967g()) {
                return null;
            }
            return "file://" + absoluteFile.mo119971i();
        } else {
            if (!str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                String genMediaFilePath = AppBrandLocalMediaObjectManager.genMediaFilePath(appId, "share_" + System.nanoTime());
                Bitmap b = C83762b1.m102898b(cVar.getRuntime(), str);
                if (b != null && !b.isRecycled()) {
                    try {
                        BitmapUtil.saveBitmapToImage(b, 100, Bitmap.CompressFormat.PNG, genMediaFilePath, true);
                        if (!b.isRecycled()) {
                            Log.m105925i("MicroMsg.ShareHelper", "bitmap recycle %s", b);
                            b.recycle();
                        }
                    } catch (IOException e) {
                        Log.m105929w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", e);
                        if (!b.isRecycled()) {
                            Log.m105925i("MicroMsg.ShareHelper", "bitmap recycle %s", b);
                        }
                    } catch (Throwable th) {
                        if (!b.isRecycled()) {
                            Log.m105925i("MicroMsg.ShareHelper", "bitmap recycle %s", b);
                            b.recycle();
                        }
                        throw th;
                    }
                    return "file://" + genMediaFilePath;
                }
            }
            return null;
        }
    }
}
