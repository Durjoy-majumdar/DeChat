package com.tencent.p014mm.plugin.mmsight.segment;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import nj3.C76879j;
import p156gj.C107835h0;
import p914oj.C100361a;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.VideoCompressUI */
public class VideoCompressUI extends MMBaseActivity {

    /* renamed from: q */
    public static int f313658q;

    /* renamed from: e */
    public String f313659e;

    /* renamed from: f */
    public String f313660f;

    /* renamed from: g */
    public ProgressDialog f313661g;

    /* renamed from: h */
    public C96905d f313662h = new C96905d(this);

    /* renamed from: i */
    public VideoTransPara f313663i;

    /* renamed from: j */
    public ABAPrams f313664j = null;

    /* renamed from: n */
    public C105474c f313665n = new C105474c(this, (C105471a) null);

    /* renamed from: o */
    public boolean f313666o;

    /* renamed from: p */
    public Runnable f313667p = new C105472b();

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$a */
    public class C105471a implements Runnable {
        public C105471a() {
        }

        public void run() {
            VideoCompressUI.this.f313663i = CaptureMMProxy.getInstance().getSnsAlbumVideoTransPara();
            if (VideoCompressUI.this.f313663i == null) {
                Log.m105920e("MicroMsg.VideoCompressUI", "VideoSendPreprocessTask para is null");
                VideoCompressUI.this.setResult(0);
                VideoCompressUI.this.finish();
                return;
            }
            C107835h0.m146105b(CaptureMMProxy.getInstance().getDeviceInfoConfig());
            ThreadPool.post(VideoCompressUI.this.f313667p, "video_remuxing_if_needed");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b */
    public class C105472b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b$a */
        public class C105473a implements Runnable {
            public C105473a() {
            }

            public void run() {
                ProgressDialog progressDialog = VideoCompressUI.this.f313661g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }
        }

        public C105472b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[SYNTHETIC, Splitter:B:18:0x0068] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0155 A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0166 A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x01bf A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0244 A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x024b A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x027d A[ADDED_TO_REGION, Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x02ee A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0321 A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0334 A[Catch:{ Exception -> 0x0396, all -> 0x0393 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r35 = this;
                r1 = r35
                java.lang.String r2 = "MicroMsg.VideoCompressUI"
                r3 = 1
                r4 = 0
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r5 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r6 = r5.f313659e     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.m141656M7(r5, r6)     // Catch:{ Exception -> 0x0396 }
                android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0396 }
                r5.<init>()     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r6 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r7 = r6.f313665n     // Catch:{ Exception -> 0x0396 }
                int r8 = r7.f313675e     // Catch:{ Exception -> 0x0396 }
                int r7 = r7.f313674d     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r9 = r6.f313663i     // Catch:{ Exception -> 0x0396 }
                int r10 = r9.f267166d     // Catch:{ Exception -> 0x0396 }
                int r9 = r9.f267167e     // Catch:{ Exception -> 0x0396 }
                android.graphics.Point r6 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.m141658O7(r6, r8, r7, r10, r9)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r7 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r7 = r7.f313659e     // Catch:{ Exception -> 0x0396 }
                java.lang.String r7 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMP4CprtH(r7)     // Catch:{ Exception -> 0x0396 }
                if (r7 == 0) goto L_0x0053
                java.lang.String r8 = "ABA: the metadata flag of video is : %s"
                java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0396 }
                r9[r4] = r7     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)     // Catch:{ Exception -> 0x0396 }
                int r8 = r7.length()     // Catch:{ Exception -> 0x0396 }
                r9 = 17
                if (r8 < r9) goto L_0x0053
                java.lang.String r7 = r7.substring(r4, r9)     // Catch:{ Exception -> 0x0396 }
                java.lang.String r8 = "AdaptiveBitrateUP"
                boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x0396 }
                if (r7 == 0) goto L_0x0053
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r7 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                boolean r7 = r7.f313666o     // Catch:{ Exception -> 0x0396 }
                if (r7 != 0) goto L_0x0053
                r7 = 1
                goto L_0x0054
            L_0x0053:
                r7 = 0
            L_0x0054:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r8 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r9 = r8.f313663i     // Catch:{ Exception -> 0x0396 }
                boolean r8 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.m141660Q7(r8, r9)     // Catch:{ Exception -> 0x0396 }
                java.lang.String r9 = "KSEGMENTVIDEOTHUMBPATH"
                java.lang.String r10 = "K_SEGMENTVIDEOPATH"
                if (r8 != 0) goto L_0x0064
                if (r6 == 0) goto L_0x0364
            L_0x0064:
                if (r7 != 0) goto L_0x0364
                if (r6 != 0) goto L_0x0079
                android.graphics.Point r6 = new android.graphics.Point     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r7 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r8 = r7.f313665n     // Catch:{ Exception -> 0x0396 }
                int r8 = r8.f313675e     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r7 = r7.f313665n     // Catch:{ Exception -> 0x0396 }
                int r7 = r7.f313674d     // Catch:{ Exception -> 0x0396 }
                r6.<init>(r8, r7)     // Catch:{ Exception -> 0x0396 }
            L_0x0079:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r7 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r8 = r7.f313659e     // Catch:{ Exception -> 0x0396 }
                java.lang.String r7 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.m141661R7(r7, r8)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r8 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r11 = r8.f313663i     // Catch:{ Exception -> 0x0396 }
                int r11 = r11.f267180u     // Catch:{ Exception -> 0x0396 }
                r15 = 2
                if (r11 != r15) goto L_0x0155
                java.lang.String r16 = r8.f313659e     // Catch:{ Exception -> 0x0396 }
                int r11 = r6.y     // Catch:{ Exception -> 0x0396 }
                int r13 = r6.x     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r14 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r14 = r14.f313663i     // Catch:{ Exception -> 0x0396 }
                int r14 = r14.f267168f     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r15 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r15 = r15.f313663i     // Catch:{ Exception -> 0x0396 }
                int r15 = r15.f267169g     // Catch:{ Exception -> 0x0396 }
                r21 = 0
                r22 = 0
                r23 = 2
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                float r3 = r3.f267182w     // Catch:{ Exception -> 0x0396 }
                r25 = 0
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267184y     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r12 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r12 = r12.f313663i     // Catch:{ Exception -> 0x0396 }
                int r12 = r12.f267185z     // Catch:{ Exception -> 0x0396 }
                r32 = r9
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r9 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r9 = r9.f313663i     // Catch:{ Exception -> 0x0396 }
                int r9 = r9.f267154A     // Catch:{ Exception -> 0x0396 }
                r33 = r5
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r5 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r5 = r5.f313663i     // Catch:{ Exception -> 0x0396 }
                int r5 = r5.f267155B     // Catch:{ Exception -> 0x0396 }
                r34 = r10
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r10 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r10 = r10.f313663i     // Catch:{ Exception -> 0x0396 }
                int r10 = r10.f267156C     // Catch:{ Exception -> 0x0396 }
                r31 = 0
                r17 = r11
                r18 = r13
                r19 = r14
                r20 = r15
                r24 = r3
                r26 = r4
                r27 = r12
                r28 = r9
                r29 = r5
                r30 = r10
                com.tencent.mm.plugin.sight.base.ABAPrams r3 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119557b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.plugin.sight.base.ABAPrams unused = r8.f313664j = r3     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.sight.base.ABAPrams r3 = r3.f313664j     // Catch:{ Exception -> 0x0396 }
                if (r3 == 0) goto L_0x012b
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.sight.base.ABAPrams r4 = r4.f313664j     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.outputKbps     // Catch:{ Exception -> 0x0396 }
                int r4 = r4 * 1000
                r3.f267169g = r4     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.sight.base.ABAPrams r3 = r3.f313664j     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.outputWidth     // Catch:{ Exception -> 0x0396 }
                r6.x = r3     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.sight.base.ABAPrams r3 = r3.f313664j     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.outputHeight     // Catch:{ Exception -> 0x0396 }
                r6.y = r3     // Catch:{ Exception -> 0x0396 }
            L_0x012b:
                java.lang.String r3 = "ABA: VideoCompressUI Send directly: [%d], [%d], [%d] "
                r4 = 3
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267169g     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0396 }
                r8 = 0
                r5[r8] = r4     // Catch:{ Exception -> 0x0396 }
                int r4 = r6.x     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0396 }
                r8 = 1
                r5[r8] = r4     // Catch:{ Exception -> 0x0396 }
                int r4 = r6.y     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0396 }
                r8 = 2
                r5[r8] = r4     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ Exception -> 0x0396 }
                goto L_0x015b
            L_0x0155:
                r33 = r5
                r32 = r9
                r34 = r10
            L_0x015b:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f267181v     // Catch:{ Exception -> 0x0396 }
                r4 = 1
                if (r3 == r4) goto L_0x0179
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f267181v     // Catch:{ Exception -> 0x0396 }
                r4 = 2
                if (r3 != r4) goto L_0x0172
                goto L_0x0179
            L_0x0172:
                r3 = 51
                r24 = 0
                r25 = 51
                goto L_0x01b3
            L_0x0179:
                java.lang.String r3 = "ABA: Using Min Max QP Limitation: [%d], [%d] "
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267157D     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0396 }
                r8 = 0
                r5[r8] = r4     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267158E     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0396 }
                r8 = 1
                r5[r8] = r4     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f267157D     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267158E     // Catch:{ Exception -> 0x0396 }
                r24 = r3
                r25 = r4
            L_0x01b3:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r3 = r3.f313665n     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f313675e     // Catch:{ Exception -> 0x0396 }
                r4 = 2000(0x7d0, float:2.803E-42)
                if (r3 >= r4) goto L_0x01cc
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r3 = r3.f313665n     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f313674d     // Catch:{ Exception -> 0x0396 }
                if (r3 < r4) goto L_0x01ca
                goto L_0x01cc
            L_0x01ca:
                r3 = 0
                goto L_0x01cd
            L_0x01cc:
                r3 = 1
            L_0x01cd:
                java.lang.String r4 = "need remux, inputVideoSize: [%s %s], out: %s, videoPath: %s, tmpPath: %s, ish265: %s, videoSizeTooLarge:%s"
                r5 = 7
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r8 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r8 = r8.f313665n     // Catch:{ Exception -> 0x0396 }
                int r8 = r8.f313675e     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0396 }
                r9 = 0
                r5[r9] = r8     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r8 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r8 = r8.f313665n     // Catch:{ Exception -> 0x0396 }
                int r8 = r8.f313674d     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0396 }
                r9 = 1
                r5[r9] = r8     // Catch:{ Exception -> 0x0396 }
                r8 = 2
                r5[r8] = r6     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r9 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r9 = r9.f313659e     // Catch:{ Exception -> 0x0396 }
                r10 = 3
                r5[r10] = r9     // Catch:{ Exception -> 0x0396 }
                r9 = 4
                r5[r9] = r7     // Catch:{ Exception -> 0x0396 }
                r9 = 5
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r10 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                boolean r10 = r10.f313666o     // Catch:{ Exception -> 0x0396 }
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x0396 }
                r5[r9] = r10     // Catch:{ Exception -> 0x0396 }
                r9 = 6
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0396 }
                r5[r9] = r10     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.hardcoder.WXHardCoderJNI r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                boolean r12 = r4.getHcEncodeVideoEnable()     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                int r13 = r4.getHcEncodeVideoDelay()     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                int r14 = r4.getHcEncodeVideoCPU()     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                int r15 = r4.getHcEncodeVideoIO()     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                boolean r4 = r4.getHcEncodeVideoThr()     // Catch:{ Exception -> 0x0396 }
                if (r4 == 0) goto L_0x024b
                int r4 = android.os.Process.myTid()     // Catch:{ Exception -> 0x0396 }
                r16 = r4
                goto L_0x024d
            L_0x024b:
                r16 = 0
            L_0x024d:
                r17 = 30000(0x7530, float:4.2039E-41)
                r18 = 603(0x25b, float:8.45E-43)
                com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                long r19 = r4.getHcEncodeVideoAction()     // Catch:{ Exception -> 0x0396 }
                java.lang.String r21 = "MicroMsg.VideoCompressUI"
                int r4 = r11.startPerformance(r12, r13, r14, r15, r16, r17, r18, r19, r21)     // Catch:{ Exception -> 0x0396 }
                int unused = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.f313658q = r4     // Catch:{ Exception -> 0x0396 }
                java.lang.String r4 = "hardcoder summerPerformance startPerformance: %s"
                r5 = 1
                java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0396 }
                int r5 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.f313658q     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0396 }
                r10 = 0
                r9[r10] = r5     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r9)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                boolean r4 = r4.f313666o     // Catch:{ Exception -> 0x0396 }
                if (r4 != 0) goto L_0x02bf
                if (r3 != 0) goto L_0x02bf
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r11 = r3.f313659e     // Catch:{ Exception -> 0x0396 }
                int r13 = r6.x     // Catch:{ Exception -> 0x0396 }
                int r14 = r6.y     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r15 = r3.f267169g     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f267177r     // Catch:{ Exception -> 0x0396 }
                r17 = 8
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267176q     // Catch:{ Exception -> 0x0396 }
                r19 = 1103626240(0x41c80000, float:25.0)
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r5 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r5 = r5.f313663i     // Catch:{ Exception -> 0x0396 }
                int r5 = r5.f267168f     // Catch:{ Exception -> 0x0396 }
                float r5 = (float) r5     // Catch:{ Exception -> 0x0396 }
                r21 = 0
                r22 = 0
                r23 = 0
                r12 = r7
                r16 = r3
                r18 = r4
                r20 = r5
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.remuxingVFS(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0396 }
                goto L_0x02e8
            L_0x02bf:
                java.lang.String r3 = "ish265, transfer to h264"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r6.x     // Catch:{ Exception -> 0x0396 }
                r3.f267166d = r4     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r6.y     // Catch:{ Exception -> 0x0396 }
                r3.f267167e = r4     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r3 = r3.f313659e     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                r5 = 0
                com.tencent.p014mm.modelvideoh265toh264.C92862f.m117177j(r3, r7, r4, r5)     // Catch:{ Exception -> 0x0396 }
            L_0x02e8:
                int r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.f313658q     // Catch:{ Exception -> 0x0396 }
                if (r3 == 0) goto L_0x0317
                com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()     // Catch:{ Exception -> 0x0396 }
                boolean r4 = r4.getHcEncodeVideoEnable()     // Catch:{ Exception -> 0x0396 }
                int r5 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.f313658q     // Catch:{ Exception -> 0x0396 }
                r3.stopPerformance(r4, r5)     // Catch:{ Exception -> 0x0396 }
                java.lang.String r3 = "hardcoder summerPerformance stopPerformace %s"
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0396 }
                int r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.f313658q     // Catch:{ Exception -> 0x0396 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0396 }
                r6 = 0
                r5[r6] = r4     // Catch:{ Exception -> 0x0396 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ Exception -> 0x0396 }
                int unused = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.f313658q = r6     // Catch:{ Exception -> 0x0396 }
            L_0x0317:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f267181v     // Catch:{ Exception -> 0x0396 }
                if (r3 <= 0) goto L_0x0334
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.sight.base.ABAPrams r3 = r3.f313664j     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267181v     // Catch:{ Exception -> 0x0396 }
                r5 = 0
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r7, r3, r5, r4)     // Catch:{ Exception -> 0x0396 }
                goto L_0x0350
            L_0x0334:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f313663i     // Catch:{ Exception -> 0x0396 }
                int r3 = r3.f267180u     // Catch:{ Exception -> 0x0396 }
                if (r3 != r8) goto L_0x0350
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.sight.base.ABAPrams r3 = r3.f313664j     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f313663i     // Catch:{ Exception -> 0x0396 }
                int r4 = r4.f267180u     // Catch:{ Exception -> 0x0396 }
                r5 = 0
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r7, r3, r4, r5)     // Catch:{ Exception -> 0x0396 }
            L_0x0350:
                r3 = r33
                r4 = r34
                r3.putExtra(r4, r7)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                r5 = 0
                java.lang.String r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.m141653J7(r4, r7, r5)     // Catch:{ Exception -> 0x0396 }
                r5 = r32
                r3.putExtra(r5, r4)     // Catch:{ Exception -> 0x0396 }
                goto L_0x0382
            L_0x0364:
                r3 = r5
                r5 = r9
                r4 = r10
                java.lang.String r6 = "no need remux, directly set result"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r6 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r6 = r6.f313659e     // Catch:{ Exception -> 0x0396 }
                r3.putExtra(r4, r6)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                java.lang.String r6 = r4.f313659e     // Catch:{ Exception -> 0x0396 }
                java.lang.String r7 = r4.f313660f     // Catch:{ Exception -> 0x0396 }
                java.lang.String r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.m141653J7(r4, r6, r7)     // Catch:{ Exception -> 0x0396 }
                r3.putExtra(r5, r4)     // Catch:{ Exception -> 0x0396 }
            L_0x0382:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r4 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this     // Catch:{ Exception -> 0x0396 }
                r5 = -1
                r4.setResult(r5, r3)     // Catch:{ Exception -> 0x0396 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r2 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this
                r2.finish()
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b$a r2 = new com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b$a
                r2.<init>()
                goto L_0x03b1
            L_0x0393:
                r0 = move-exception
                r2 = r0
                goto L_0x03b5
            L_0x0396:
                r0 = move-exception
                r3 = r0
                java.lang.String r4 = "video compress failed e [%s]"
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0393 }
                java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x0393 }
                r7 = 0
                r5[r7] = r6     // Catch:{ all -> 0x0393 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r4, r5)     // Catch:{ all -> 0x0393 }
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r2 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this
                r2.finish()
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b$a r2 = new com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b$a
                r2.<init>()
            L_0x03b1:
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
                return
            L_0x03b5:
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r3 = com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.this
                r3.finish()
                com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b$a r3 = new com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$b$a
                r3.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.C105472b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c */
    public class C105474c {

        /* renamed from: a */
        public String f313671a;

        /* renamed from: b */
        public String f313672b;

        /* renamed from: c */
        public int f313673c = -1;

        /* renamed from: d */
        public int f313674d = -1;

        /* renamed from: e */
        public int f313675e = -1;

        /* renamed from: f */
        public int f313676f = -1;

        /* renamed from: g */
        public int f313677g = -1;

        /* renamed from: h */
        public int f313678h = -1;

        /* renamed from: i */
        public int f313679i = -1;

        public C105474c(VideoCompressUI videoCompressUI, C105471a aVar) {
        }

        public String toString() {
            return "VideoAnalysisStruct{videoTrackMime='" + this.f313671a + '\'' + ", audioTrackMime='" + this.f313672b + '\'' + ", durationMs=" + this.f313673c + ", videoHeight=" + this.f313674d + ", videoWidth=" + this.f313675e + ", videoBitRate=" + this.f313676f + ", videoIFrameInterval=" + this.f313677g + ", videoFrameRate=" + this.f313678h + ", audioBitRate=" + this.f313679i + '}';
        }
    }

    /* renamed from: J7 */
    public static String m141653J7(VideoCompressUI videoCompressUI, String str, String str2) {
        videoCompressUI.getClass();
        if (!Util.isNullOrNil(str2)) {
            return str2;
        }
        try {
            Intent intent = new Intent();
            intent.setData(Uri.parse("file://" + str));
            C100361a.C77012a b = C100361a.m131253b(videoCompressUI, intent, -1);
            if (b == null || b.f224998b == null) {
                return str2;
            }
            String S7 = videoCompressUI.mo150269S7(str);
            BitmapUtil.saveBitmapToImage(b.f224998b, 80, Bitmap.CompressFormat.JPEG, S7, true);
            return S7;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VideoCompressUI", e, "get thumb error: %s", e.getMessage());
            return str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0186, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0187, code lost:
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x018a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x018b, code lost:
        r11 = "MicroMsg.VideoCompressUI";
        r19 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0186 A[ExcHandler: all (th java.lang.Throwable), PHI: r8 
      PHI: (r8v1 oj.b) = (r8v0 oj.b), (r8v2 oj.b) binds: [B:1:0x0019, B:6:0x0027] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0019] */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m141656M7(com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI r22, java.lang.String r23) {
        /*
            r0 = r22
            r1 = r23
            r22.getClass()
            java.lang.String r2 = "frame-rate"
            java.lang.String r3 = "i-frame-interval"
            java.lang.String r4 = "width"
            java.lang.String r5 = "height"
            java.lang.String r6 = "durationUs"
            java.lang.String r7 = "MicroMsg.VideoCompressUI"
            oj.b r8 = new oj.b
            r8.<init>()
            r8.mo161392k(r1)     // Catch:{ Exception -> 0x018a, all -> 0x0186 }
            int r11 = r8.mo161385d()     // Catch:{ Exception -> 0x018a, all -> 0x0186 }
            r12 = 0
            r13 = r12
            r14 = 0
        L_0x0023:
            java.lang.String r15 = "mime"
            if (r14 >= r11) goto L_0x0078
            android.media.MediaFormat r10 = r8.mo161386e(r14)     // Catch:{ Exception -> 0x0073, all -> 0x0186 }
            boolean r16 = r10.containsKey(r15)     // Catch:{ Exception -> 0x0073, all -> 0x0186 }
            if (r16 != 0) goto L_0x0036
            r19 = r8
            r18 = r11
            goto L_0x006c
        L_0x0036:
            java.lang.String r9 = r10.getString(r15)     // Catch:{ Exception -> 0x0073, all -> 0x0186 }
            r17 = r10
            java.lang.String r10 = "find video mime : %s"
            r19 = r8
            r18 = r11
            r11 = 1
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0183 }
            r11 = 0
            r8[r11] = r9     // Catch:{ Exception -> 0x0183 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r8)     // Catch:{ Exception -> 0x0183 }
            if (r9 != 0) goto L_0x004e
            goto L_0x006c
        L_0x004e:
            java.lang.String r8 = "video/"
            boolean r8 = r9.startsWith(r8)     // Catch:{ Exception -> 0x0183 }
            if (r8 == 0) goto L_0x005b
            if (r12 != 0) goto L_0x0067
            r12 = r17
            goto L_0x0067
        L_0x005b:
            java.lang.String r8 = "audio/"
            boolean r8 = r9.startsWith(r8)     // Catch:{ Exception -> 0x0183 }
            if (r8 == 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            r13 = r17
        L_0x0067:
            if (r13 == 0) goto L_0x006c
            if (r12 == 0) goto L_0x006c
            goto L_0x007a
        L_0x006c:
            int r14 = r14 + 1
            r11 = r18
            r8 = r19
            goto L_0x0023
        L_0x0073:
            r0 = move-exception
            r19 = r8
            goto L_0x0184
        L_0x0078:
            r19 = r8
        L_0x007a:
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r8 = r0.f313665n     // Catch:{ Exception -> 0x0183 }
            if (r8 == 0) goto L_0x01a0
            int r9 = r8.f313673c     // Catch:{ Exception -> 0x0183 }
            r10 = -1
            if (r9 != r10) goto L_0x01a0
            java.lang.String r9 = ""
            java.lang.String r10 = "bitrate"
            if (r12 == 0) goto L_0x0118
            boolean r11 = r12.containsKey(r10)     // Catch:{ Exception -> 0x0183 }
            if (r11 != 0) goto L_0x0091
            r11 = 0
            goto L_0x0095
        L_0x0091:
            int r11 = r12.getInteger(r10)     // Catch:{ Exception -> 0x0183 }
        L_0x0095:
            r8.f313676f = r11     // Catch:{ Exception -> 0x0183 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r8 = r0.f313665n     // Catch:{ Exception -> 0x0183 }
            boolean r11 = r12.containsKey(r6)     // Catch:{ Exception -> 0x0183 }
            if (r11 != 0) goto L_0x00a2
            r11 = r7
            r7 = 0
            goto L_0x00ac
        L_0x00a2:
            long r17 = r12.getLong(r6)     // Catch:{ Exception -> 0x0183 }
            r20 = 1000(0x3e8, double:4.94E-321)
            r11 = r7
            long r6 = r17 / r20
            int r7 = (int) r6     // Catch:{ Exception -> 0x0181 }
        L_0x00ac:
            r8.f313673c = r7     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r6 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            boolean r7 = r12.containsKey(r5)     // Catch:{ Exception -> 0x0181 }
            if (r7 != 0) goto L_0x00b8
            r5 = 0
            goto L_0x00bc
        L_0x00b8:
            int r5 = r12.getInteger(r5)     // Catch:{ Exception -> 0x0181 }
        L_0x00bc:
            r6.f313674d = r5     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r5 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            boolean r6 = r12.containsKey(r4)     // Catch:{ Exception -> 0x0181 }
            if (r6 != 0) goto L_0x00c8
            r4 = 0
            goto L_0x00cc
        L_0x00c8:
            int r4 = r12.getInteger(r4)     // Catch:{ Exception -> 0x0181 }
        L_0x00cc:
            r5.f313675e = r4     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r4 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            boolean r5 = r12.containsKey(r15)     // Catch:{ Exception -> 0x0181 }
            if (r5 != 0) goto L_0x00d8
            r5 = r9
            goto L_0x00dc
        L_0x00d8:
            java.lang.String r5 = r12.getString(r15)     // Catch:{ Exception -> 0x0181 }
        L_0x00dc:
            r4.f313671a = r5     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r4 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            boolean r5 = r12.containsKey(r3)     // Catch:{ Exception -> 0x0181 }
            if (r5 != 0) goto L_0x00e8
            r3 = 0
            goto L_0x00ec
        L_0x00e8:
            int r3 = r12.getInteger(r3)     // Catch:{ Exception -> 0x0181 }
        L_0x00ec:
            r4.f313677g = r3     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r3 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            boolean r4 = r12.containsKey(r2)     // Catch:{ Exception -> 0x0181 }
            if (r4 != 0) goto L_0x00f8
            r2 = 0
            goto L_0x00fc
        L_0x00f8:
            int r2 = r12.getInteger(r2)     // Catch:{ Exception -> 0x0181 }
        L_0x00fc:
            r3.f313678h = r2     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r2 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            java.lang.String r2 = r2.f313671a     // Catch:{ Exception -> 0x0181 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0181 }
            if (r2 != 0) goto L_0x0119
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r2 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            java.lang.String r2 = r2.f313671a     // Catch:{ Exception -> 0x0181 }
            java.lang.String r3 = "video/hevc"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x0181 }
            if (r2 == 0) goto L_0x0119
            r2 = 1
            r0.f313666o = r2     // Catch:{ Exception -> 0x0181 }
            goto L_0x0119
        L_0x0118:
            r11 = r7
        L_0x0119:
            if (r13 == 0) goto L_0x013a
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r2 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            boolean r3 = r13.containsKey(r10)     // Catch:{ Exception -> 0x0181 }
            if (r3 != 0) goto L_0x0125
            r3 = 0
            goto L_0x0129
        L_0x0125:
            int r3 = r13.getInteger(r10)     // Catch:{ Exception -> 0x0181 }
        L_0x0129:
            r2.f313679i = r3     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r2 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            boolean r3 = r13.containsKey(r15)     // Catch:{ Exception -> 0x0181 }
            if (r3 != 0) goto L_0x0134
            goto L_0x0138
        L_0x0134:
            java.lang.String r9 = r13.getString(r15)     // Catch:{ Exception -> 0x0181 }
        L_0x0138:
            r2.f313672b = r9     // Catch:{ Exception -> 0x0181 }
        L_0x013a:
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r2 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            int r3 = r2.f313676f     // Catch:{ Exception -> 0x0181 }
            if (r3 <= 0) goto L_0x014c
            int r3 = r2.f313674d     // Catch:{ Exception -> 0x0181 }
            if (r3 <= 0) goto L_0x014c
            int r3 = r2.f313675e     // Catch:{ Exception -> 0x0181 }
            if (r3 <= 0) goto L_0x014c
            int r2 = r2.f313673c     // Catch:{ Exception -> 0x0181 }
            if (r2 > 0) goto L_0x0173
        L_0x014c:
            r2 = 1
            com.tencent.mm.plugin.sight.base.a r3 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r1, r2)     // Catch:{ Exception -> 0x0181 }
            if (r3 == 0) goto L_0x0173
            int r2 = r3.f273444b     // Catch:{ Exception -> 0x0181 }
            if (r2 <= 0) goto L_0x015b
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r4 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            r4.f313676f = r2     // Catch:{ Exception -> 0x0181 }
        L_0x015b:
            int r2 = r3.f273446d     // Catch:{ Exception -> 0x0181 }
            if (r2 <= 0) goto L_0x0163
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r4 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            r4.f313674d = r2     // Catch:{ Exception -> 0x0181 }
        L_0x0163:
            int r2 = r3.f273445c     // Catch:{ Exception -> 0x0181 }
            if (r2 <= 0) goto L_0x016b
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r4 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            r4.f313675e = r2     // Catch:{ Exception -> 0x0181 }
        L_0x016b:
            int r2 = r3.f273443a     // Catch:{ Exception -> 0x0181 }
            if (r2 <= 0) goto L_0x0173
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r3 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            r3.f313673c = r2     // Catch:{ Exception -> 0x0181 }
        L_0x0173:
            java.lang.String r2 = "videoAnalysis result: %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0181 }
            com.tencent.mm.plugin.mmsight.segment.VideoCompressUI$c r0 = r0.f313665n     // Catch:{ Exception -> 0x0181 }
            r3 = 0
            r4[r3] = r0     // Catch:{ Exception -> 0x0181 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r4)     // Catch:{ Exception -> 0x0181 }
            goto L_0x01a0
        L_0x0181:
            r0 = move-exception
            goto L_0x018e
        L_0x0183:
            r0 = move-exception
        L_0x0184:
            r11 = r7
            goto L_0x018e
        L_0x0186:
            r0 = move-exception
            r19 = r8
            goto L_0x01a5
        L_0x018a:
            r0 = move-exception
            r11 = r7
            r19 = r8
        L_0x018e:
            java.lang.String r2 = "Video extractor init failed. video path = [%s] e = [%s]"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x01a4 }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01a4 }
            r1 = 1
            r3[r1] = r0     // Catch:{ all -> 0x01a4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r3)     // Catch:{ all -> 0x01a4 }
        L_0x01a0:
            r19.mo161388g()
            return
        L_0x01a4:
            r0 = move-exception
        L_0x01a5:
            r19.mo161388g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.segment.VideoCompressUI.m141656M7(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI, java.lang.String):void");
    }

    /* renamed from: O7 */
    public static Point m141658O7(VideoCompressUI videoCompressUI, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        videoCompressUI.getClass();
        if (i > i2 && i3 < i4) {
            int max = Math.max(i3, i4);
            i4 = Math.min(i3, i4);
            i3 = max;
        }
        Log.m105924i("MicroMsg.VideoCompressUI", "scale() called with: decoderOutputWidth = [" + i + "], decoderOutputHeight = [" + i2 + "], specWidth = [" + i3 + "], specHeight = [" + i4 + "]");
        if (i > i3 || i2 > i4) {
            int max2 = Math.max(i, i2);
            int min = Math.min(i, i2);
            int max3 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            if (max2 % 16 != 0 || Math.abs(max2 - max3) >= 16 || min % 16 != 0 || Math.abs(min - min2) >= 16) {
                int i7 = max2 / 2;
                int i8 = min / 2;
                if (i7 % 16 != 0 || Math.abs(i7 - max3) >= 16 || i8 % 16 != 0 || Math.abs(i8 - min2) >= 16) {
                    Point point = new Point();
                    if (i < i2) {
                        i5 = Math.min(i3, i4);
                        i6 = (int) (((double) i2) / ((((double) i) * 1.0d) / ((double) i5)));
                    } else {
                        int min3 = Math.min(i3, i4);
                        int i9 = min3;
                        i5 = (int) (((double) i) / ((((double) i2) * 1.0d) / ((double) min3)));
                        i6 = i9;
                    }
                    if (i6 % 2 != 0) {
                        i6++;
                    }
                    if (i5 % 2 != 0) {
                        i5++;
                    }
                    Log.m105925i("MicroMsg.VideoCompressUI", "calc scale, outputsize: %s %s", Integer.valueOf(i5), Integer.valueOf(i6));
                    point.x = i5;
                    point.y = i6;
                    return point;
                }
                Log.m105924i("MicroMsg.VideoCompressUI", "calc scale, double ratio divide by 16");
                int i15 = i / 2;
                int i16 = i2 / 2;
                if (i15 % 2 != 0) {
                    i15++;
                }
                if (i16 % 2 != 0) {
                    i16++;
                }
                return new Point(i15, i16);
            }
            Log.m105924i("MicroMsg.VideoCompressUI", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        Log.m105924i("MicroMsg.VideoCompressUI", "calc scale, small or equal to spec size");
        return null;
    }

    /* renamed from: Q7 */
    public static boolean m141660Q7(VideoCompressUI videoCompressUI, VideoTransPara videoTransPara) {
        videoCompressUI.getClass();
        boolean z = false;
        if (videoTransPara == null) {
            Log.m105920e("MicroMsg.VideoCompressUI", "hy: given target trans param is null");
        } else if (videoTransPara.f267169g < videoCompressUI.f313665n.f313676f) {
            z = true;
        }
        if (videoCompressUI.f313666o) {
            return true;
        }
        return z;
    }

    /* renamed from: R7 */
    public static String m141661R7(VideoCompressUI videoCompressUI, String str) {
        videoCompressUI.getClass();
        String str2 = CaptureMMProxy.getInstance().getAccVideoPath() + "videoCompressTmp/";
        if (C86013q1.m106450k(str2)) {
            C86013q1.m106446g(str2, true);
        }
        C86013q1.m106461v(str2);
        String str3 = str2 + "video_send_preprocess_tmp_" + System.currentTimeMillis() + ".mp4";
        Log.m105925i("MicroMsg.VideoCompressUI", "initAndGetTmpPath: %s", str3);
        return str3;
    }

    /* renamed from: S7 */
    public final String mo150269S7(String str) {
        String str2 = CaptureMMProxy.getInstance().getAccVideoPath() + "videoCompressTmpThumb/";
        if (C86013q1.m106450k(str2)) {
            C86013q1.m106446g(str2, true);
        }
        C86013q1.m106461v(str2);
        String str3 = str2 + "video_send_preprocess_thumb_" + System.currentTimeMillis() + ".jpg";
        Log.m105925i("MicroMsg.VideoCompressUI", "thumbPath: %s", str3);
        return str3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.f6534hh);
        Intent intent = getIntent();
        if (intent == null || Util.isNullOrNil(intent.getStringExtra("K_SEGMENTVIDEOPATH"))) {
            setResult(0);
            finish();
            return;
        }
        this.f313661g = C76879j.m92723Q(this, "", getString(C0966R.string.a4d), true, false, (DialogInterface.OnCancelListener) null);
        this.f313659e = intent.getStringExtra("K_SEGMENTVIDEOPATH");
        this.f313660f = intent.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
        CaptureMMProxy.createProxy(new CaptureMMProxy(this.f313662h));
        this.f313662h.mo135257a(new C105471a());
    }

    public void onDestroy() {
        super.onDestroy();
        C96905d dVar = this.f313662h;
        if (dVar != null) {
            dVar.mo135260d();
        }
    }
}
