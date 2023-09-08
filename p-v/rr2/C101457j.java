package rr2;

import android.os.Bundle;
import b62.C92177a;
import b62.C92178b;
import b62.C92179c;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mediabasic.data.MediaDurationInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;
import lh2.C99417a;
import qh2.C101198e;
import sx3.C64197v;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: rr2.j */
public final class C101457j extends C99417a {

    /* renamed from: f */
    public C92178b f297126f;

    /* renamed from: g */
    public C92179c f297127g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin", mo125469f = "SnsExportPlugin.kt", mo125470l = {49}, mo125471m = "exportVideo")
    /* renamed from: rr2.j$a */
    public static final class C101458a extends C66704d {

        /* renamed from: d */
        public Object f297128d;

        /* renamed from: e */
        public Object f297129e;

        /* renamed from: f */
        public /* synthetic */ Object f297130f;

        /* renamed from: g */
        public final /* synthetic */ C101457j f297131g;

        /* renamed from: h */
        public int f297132h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101458a(C101457j jVar, C15601d<? super C101458a> dVar) {
            super(dVar);
            this.f297131g = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin$exportVideo$1");
            this.f297130f = obj;
            this.f297132h |= Integer.MIN_VALUE;
            Object x = this.f297131g.mo140959x(this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin$exportVideo$1");
            return x;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101457j(C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(eVar, "status");
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
        SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
        C87412m.m108594g(recordConfigProvider2, "configProvider");
        C92177a aVar = C92177a.VIDEO;
        String str = recordConfigProvider2.f272900A;
        C87412m.m108593f(str, "configProvider.inputVideoPath");
        this.f297126f = new C92178b(C64197v.m75534c(new MediaSingleInfo(aVar, str, (MediaDurationInfo) null, 4, (C8480h) null)), (Bundle) null);
        String str2 = recordConfigProvider2.f272901B;
        C87412m.m108593f(str2, "configProvider.outputVideoPath");
        MediaSingleInfo mediaSingleInfo = new MediaSingleInfo(aVar, str2, (MediaDurationInfo) null, 4, (C8480h) null);
        C92177a aVar2 = C92177a.THUMB;
        String str3 = recordConfigProvider2.f272902C;
        C87412m.m108593f(str3, "configProvider.thumbPath");
        MediaSingleInfo mediaSingleInfo2 = new MediaSingleInfo(aVar2, str3, (MediaDurationInfo) null, 4, (C8480h) null);
        VideoTransPara videoTransPara = recordConfigProvider2.f272926n;
        C87412m.m108593f(videoTransPara, "configProvider.videoParam");
        VideoTransPara videoTransPara2 = videoTransPara;
        this.f297127g = new C92179c(videoTransPara2, C64197v.m75534c(mediaSingleInfo, mediaSingleInfo2), (Bundle) null, 4, (C8480h) null);
        SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo140959x(wx3.C15601d<? super com.tencent.p014mm.plugin.mediabasic.data.MediaResultInfo> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            b62.a r2 = b62.C92177a.VIDEO
            java.lang.String r3 = "exportVideo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = r1 instanceof rr2.C101457j.C101458a
            if (r5 == 0) goto L_0x0020
            r5 = r1
            rr2.j$a r5 = (rr2.C101457j.C101458a) r5
            int r6 = r5.f297132h
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0020
            int r6 = r6 - r7
            r5.f297132h = r6
            goto L_0x0025
        L_0x0020:
            rr2.j$a r5 = new rr2.j$a
            r5.<init>(r0, r1)
        L_0x0025:
            java.lang.Object r1 = r5.f297130f
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f297132h
            r8 = 1
            if (r7 == 0) goto L_0x0047
            if (r7 != r8) goto L_0x003c
            java.lang.Object r6 = r5.f297129e
            b62.c r6 = (b62.C92179c) r6
            java.lang.Object r5 = r5.f297128d
            rr2.j r5 = (rr2.C101457j) r5
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x007b
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            throw r1
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r1)
            b62.c r1 = r0.f297127g
            if (r1 == 0) goto L_0x013a
            gf3.e r7 = new gf3.e
            r7.<init>()
            gf3.f r10 = new gf3.f
            r10.<init>()
            r7.mo137401b(r10)
            gf3.d r10 = new gf3.d
            r10.<init>()
            r7.mo137401b(r10)
            b62.b r10 = r0.f297126f
            gy3.C87412m.m108591d(r10)
            r5.f297128d = r0
            r5.f297129e = r1
            r5.f297132h = r8
            java.lang.Object r5 = r7.mo137400a(r10, r1, r5)
            if (r5 != r6) goto L_0x0078
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r6
        L_0x0078:
            r6 = r1
            r1 = r5
            r5 = r0
        L_0x007b:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r1 = (com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r10 = r6.mo126140b()
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r10 == 0) goto L_0x0127
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r10 = new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo
            java.lang.String r11 = r6.mo126140b()
            gy3.C87412m.m108591d(r11)
            com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo r12 = new com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo
            java.util.ArrayList<com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo> r13 = r6.f263832b
            java.util.Iterator r13 = r13.iterator()
        L_0x009d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00b6
            java.lang.Object r14 = r13.next()
            r8 = r14
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r8 = (com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo) r8
            b62.a r8 = r8.f272123d
            if (r8 != r2) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r8 = 1
            goto L_0x009d
        L_0x00b6:
            r14 = 0
        L_0x00b7:
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r14 = (com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo) r14
            if (r14 != 0) goto L_0x00be
            r8 = 0
            goto L_0x00c5
        L_0x00be:
            com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo r14 = r14.f272125f
            long r8 = r14.f272115e
            long r13 = r14.f272114d
            long r8 = r8 - r13
        L_0x00c5:
            r13 = 0
            r12.<init>(r13, r8)
            r10.<init>(r2, r11, r12)
            r7.add(r10)
            java.lang.String r2 = r6.mo126140b()
            android.graphics.Bitmap r2 = f72.C97842b.m126300q(r2)
            if (r2 == 0) goto L_0x0127
            hi2.h r8 = hi2.C98453h.f288774a
            b62.c r5 = r5.f297127g
            if (r5 == 0) goto L_0x00e7
            com.tencent.mm.modelcontrol.VideoTransPara r5 = r5.f263831a
            if (r5 == 0) goto L_0x00e7
            int r5 = r5.f267179t
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            android.graphics.Bitmap r2 = r8.mo137807e(r2, r5)
            r5 = 100
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG
            java.lang.String r9 = r6.mo126139a()
            r10 = 0
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, r5, r8, r9, r10)
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r5 = new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo
            b62.a r12 = b62.C92177a.THUMB
            java.lang.String r13 = r6.mo126139a()
            gy3.C87412m.m108591d(r13)
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r7.add(r5)
            sr2.a r5 = sr2.C101699a.f297754a
            r6 = 2
            r9 = 0
            java.lang.String r16 = sr2.C101699a.m133598a(r5, r2, r9, r6, r9)
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r2 = new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo
            b62.a r15 = b62.C92177a.IMAGE
            r17 = 0
            r18 = 4
            r19 = 0
            r14 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r7.add(r2)
        L_0x0127:
            com.tencent.mm.plugin.mediabasic.data.MediaResultInfo r2 = new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo
            b62.d r1 = r1.f272116d
            b62.d r5 = b62.C92180d.MediaRemuxSuccess
            if (r1 != r5) goto L_0x0131
            r8 = 1
            goto L_0x0132
        L_0x0131:
            r8 = 0
        L_0x0132:
            r1 = 0
            r2.<init>(r8, r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r2
        L_0x013a:
            r1 = 0
            com.tencent.mm.plugin.mediabasic.data.MediaResultInfo r2 = new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r2.<init>(r6, r5, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rr2.C101457j.mo140959x(wx3.d):java.lang.Object");
    }
}
