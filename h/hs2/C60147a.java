package hs2;

import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.vfs.C86013q1;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C108455d;
import java.util.LinkedList;

/* renamed from: hs2.a */
public final class C60147a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderObject f171689d;

    /* renamed from: e */
    public final /* synthetic */ String f171690e;

    /* renamed from: hs2.a$a */
    public static final class C60148a implements C108455d {

        /* renamed from: a */
        public final /* synthetic */ String f171691a;

        /* renamed from: b */
        public final /* synthetic */ String f171692b;

        /* renamed from: c */
        public final /* synthetic */ FinderObject f171693c;

        /* renamed from: d */
        public final /* synthetic */ String f171694d;

        public C60148a(String str, String str2, FinderObject finderObject, String str3) {
            this.f171691a = str;
            this.f171692b = str2;
            this.f171693c = finderObject;
            this.f171694d = str3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00c8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo26263a(boolean r11, java.lang.Object[] r12) {
            /*
                r10 = this;
                java.lang.String r12 = ""
                java.lang.String r0 = "onImageDownload"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper$uploadFinderVideoCover$1$1$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                if (r11 == 0) goto L_0x0103
                java.lang.String r11 = "height"
                java.lang.String r2 = "width"
                java.lang.String r3 = "MicroMsg.SnsCoverConfig"
                java.lang.String r4 = "getCoverImageParam"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                com.tencent.mm.modelcontrol.VideoTransPara r6 = new com.tencent.mm.modelcontrol.VideoTransPara
                r6.<init>()
                r7 = 960(0x3c0, float:1.345E-42)
                r6.f267166d = r7
                r6.f267167e = r7
                java.lang.Class<h81.h> r7 = h81.C32735h.class
                di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0069 }
                h81.h r7 = (h81.C32735h) r7     // Catch:{ Exception -> 0x0069 }
                h81.h$c r8 = h81.C32735h.C32737c.clicfg_sns_cover_finder_image_config     // Catch:{ Exception -> 0x0069 }
                java.lang.String r7 = r7.Y60(r8, r12)     // Catch:{ Exception -> 0x0069 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0069 }
                r8.<init>()     // Catch:{ Exception -> 0x0069 }
                java.lang.String r9 = "getCoverImageParam:"
                r8.append(r9)     // Catch:{ Exception -> 0x0069 }
                r8.append(r7)     // Catch:{ Exception -> 0x0069 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0069 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)     // Catch:{ Exception -> 0x0069 }
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0069 }
                r8.<init>(r7)     // Catch:{ Exception -> 0x0069 }
                r7 = 0
                int r9 = r8.optInt(r2, r7)     // Catch:{ Exception -> 0x0069 }
                if (r9 <= 0) goto L_0x006e
                int r9 = r8.optInt(r11, r7)     // Catch:{ Exception -> 0x0069 }
                if (r9 <= 0) goto L_0x006e
                int r2 = r8.optInt(r2, r7)     // Catch:{ Exception -> 0x0069 }
                r6.f267166d = r2     // Catch:{ Exception -> 0x0069 }
                int r11 = r8.optInt(r11, r7)     // Catch:{ Exception -> 0x0069 }
                r6.f267167e = r11     // Catch:{ Exception -> 0x0069 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ Exception -> 0x0069 }
                goto L_0x0071
            L_0x0069:
                java.lang.String r11 = "getCoverImageParam get config error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)
            L_0x006e:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            L_0x0071:
                java.lang.String r11 = r10.f171691a
                int r2 = r6.f267166d
                int r3 = r6.f267167e
                r4 = 1
                android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r11, r2, r3, r4)
                sr2.a r2 = sr2.C101699a.f297754a
                java.lang.String r3 = "bitmap"
                gy3.C87412m.m108593f(r11, r3)
                r3 = 2
                r5 = 0
                java.lang.String r11 = sr2.C101699a.m133598a(r2, r11, r5, r3, r5)
                os2.z r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ux0()
                java.lang.String r3 = r10.f171692b
                r6 = -1
                java.lang.String r8 = r10.f171691a
                java.lang.String r9 = "localPath"
                gy3.C87412m.m108593f(r8, r9)
                r2.mo139912qq(r3, r6, r8)
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r10.f171693c
                java.lang.String r3 = "access$postFinderWithThumb"
                java.lang.String r6 = "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
                java.lang.String r7 = "postFinderWithThumb"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                com.tencent.mm.plugin.sns.model.s2 r8 = new com.tencent.mm.plugin.sns.model.s2
                r9 = 7
                r8.<init>(r9, r5)
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
                if (r5 == 0) goto L_0x00ba
                r8.mo131244a(r11, r12)
            L_0x00ba:
                java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                ht1.t1 r11 = (ht1.C60200t1) r11
                te3.rk1 r11 = r11.mo76765IQ(r2, r4)
                if (r11 == 0) goto L_0x00fc
                te3.rk1 r12 = new te3.rk1
                r12.<init>()
                java.lang.String r12 = "setShareFinderObject"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadPackHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r2)
                com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r8.f275199f
                te3.j00 r5 = r5.ContentObj
                r5.f298431o = r11
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r2)
                r8.mo131227A(r4)
                int r11 = r8.mo131252i()
                com.tencent.mm.plugin.sns.statistics.SnsReportHelper r12 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
                r12.f275531Y = r11
                java.lang.String r12 = "setLocalId"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r2)
                ur2.C102075b.f300589c = r11
                long r4 = java.lang.System.currentTimeMillis()
                ur2.C102075b.f300588b = r4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r2)
            L_0x00fc:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
                goto L_0x011b
            L_0x0103:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "downloadImage error:"
                r11.append(r12)
                java.lang.String r12 = r10.f171694d
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.String r12 = "MicroMsg.SnsCoverUploadHelper"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            L_0x011b:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hs2.C60147a.C60148a.mo26263a(boolean, java.lang.Object[]):void");
        }
    }

    public C60147a(FinderObject finderObject, String str) {
        this.f171689d = finderObject;
        this.f171690e = str;
    }

    public final void run() {
        LinkedList<FinderMedia> linkedList;
        FinderMedia first;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper$uploadFinderVideoCover$1");
        FinderObjectDesc finderObjectDesc = this.f171689d.objectDesc;
        if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (first = linkedList.getFirst()) == null)) {
            String str = this.f171690e;
            FinderObject finderObject = this.f171689d;
            String str2 = first.thumbUrl + first.thumb_url_token;
            String d = C94938q1.m120517d(str);
            C86013q1.m106447h(d);
            C20828a b = C20828a.m22825b();
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59350f = d;
            bVar.f59346b = true;
            b.mo32515d(str2, bVar.mo32666a(), new C60148a(d, str, finderObject, str2));
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper$uploadFinderVideoCover$1");
    }
}
