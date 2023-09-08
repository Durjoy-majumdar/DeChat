package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.q1 */
public class C72820q1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMHandler f212215d;

    /* renamed from: e */
    public final /* synthetic */ C72826s1 f212216e;

    public C72820q1(C72826s1 s1Var, MMHandler mMHandler) {
        this.f212216e = s1Var;
        this.f212215d = mMHandler;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            com.tencent.mm.pluginsdk.ui.chat.s1 r0 = r11.f212216e
            monitor-enter(r0)
            com.tencent.mm.pluginsdk.ui.chat.m1 r1 = r0.mo100666b()     // Catch:{ all -> 0x0090 }
            r0.f212226c = r1     // Catch:{ all -> 0x0090 }
            r2 = 0
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)
            r1 = r2
            goto L_0x0012
        L_0x000f:
            java.lang.String r1 = r1.f212204b     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)
        L_0x0012:
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0017
            goto L_0x007f
        L_0x0017:
            r5 = 4
            float r5 = r0.mo100665a(r5)
            int r5 = (int) r5
            r6 = 70
            float r6 = r0.mo100665a(r6)
            int r6 = (int) r6
            r7 = 120(0x78, float:1.68E-43)
            float r7 = r0.mo100665a(r7)
            int r7 = (int) r7
            android.content.Context r8 = r0.f212224a     // Catch:{ Exception -> 0x003e }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x003e }
            com.tencent.mm.pluginsdk.ui.chat.m1 r9 = r0.f212226c     // Catch:{ Exception -> 0x003e }
            long r9 = r9.f212203a     // Catch:{ Exception -> 0x003e }
            android.graphics.Bitmap r8 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r8, r9, r3, r2)     // Catch:{ Exception -> 0x003e }
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r8, r7, r6, r3, r3)     // Catch:{ Exception -> 0x003e }
            goto L_0x0046
        L_0x003e:
            r8 = move-exception
            java.lang.String r9 = "MicroMsg.RecentImageBubble"
            java.lang.Object[] r10 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r8, r2, r10)
        L_0x0046:
            if (r2 != 0) goto L_0x004f
            com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r1)
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r1, r7, r6, r3)
        L_0x004f:
            if (r2 == 0) goto L_0x0078
            float r1 = (float) r4
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r2, r1)
            float r2 = (float) r5
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r1, r3, r2)
            r0.f212230g = r1
            android.content.SharedPreferences r1 = r0.f212227d
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "chattingui_recent_shown_image_path"
            com.tencent.mm.pluginsdk.ui.chat.m1 r0 = r0.f212226c
            java.lang.String r0 = r0.f212204b
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            r0.commit()
            java.lang.String r0 = "MicroMsg.RecentImageBubble"
            java.lang.String r1 = "check ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            goto L_0x0080
        L_0x0078:
            java.lang.String r0 = "MicroMsg.RecentImageBubble"
            java.lang.String r1 = "image hits hole."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0088
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r11.f212215d
            r0.sendEmptyMessage(r4)
            goto L_0x008f
        L_0x0088:
            java.lang.String r0 = "MicroMsg.RecentImageBubble"
            java.lang.String r1 = "check false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
        L_0x008f:
            return
        L_0x0090:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72820q1.run():void");
    }

    public String toString() {
        return super.toString() + "|checkIfShow";
    }
}
