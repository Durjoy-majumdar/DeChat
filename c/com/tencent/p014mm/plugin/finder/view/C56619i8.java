package com.tencent.p014mm.plugin.finder.view;

import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import co1.C55048e;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.view.TestPreloadPreview;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.sdk.platformtools.TrafficStats;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C25026b;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.i8 */
public final class C56619i8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f162320d;

    /* renamed from: com.tencent.mm.plugin.finder.view.i8$a */
    public static final class C56620a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TestPreloadPreview f162321d;

        /* renamed from: e */
        public final /* synthetic */ String f162322e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56620a(TestPreloadPreview testPreloadPreview, String str) {
            super(0);
            this.f162321d = testPreloadPreview;
            this.f162322e = str;
        }

        public Object invoke() {
            this.f162321d.getGlobalPreloadTv().setText(this.f162322e);
            RecyclerView.C16613e adapter = this.f162321d.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            this.f162321d.getGlobalPreloadTv().setOnClickListener(new C4069h8(this.f162321d));
            return C13598b0.f38549a;
        }
    }

    public C56619i8(TestPreloadPreview testPreloadPreview) {
        this.f162320d = testPreloadPreview;
    }

    public final void run() {
        String str;
        String str2;
        Class cls = FinderVideoRecycler.class;
        Class cls2 = FinderCommonFeatureService.class;
        TestPreloadPreview testPreloadPreview = this.f162320d;
        if (testPreloadPreview.f162161g) {
            testPreloadPreview.getClass();
            CdnLogic.DownloadInfo recentDownloadInfo = CdnLogic.getRecentDownloadInfo(0, 0, 5);
            long j = recentDownloadInfo.transforMS;
            float f = j > 0 ? ((((float) recentDownloadInfo.recvedBytes) * 1.0f) / ((float) 1024)) / ((float) (j / ((long) 1000))) : 0.0f;
            CdnLogic.DownloadInfo recentDownloadInfo2 = CdnLogic.getRecentDownloadInfo(251, CdnLogic.kMediaTypeAppVideo, 5);
            long j2 = recentDownloadInfo2.transforMS;
            float f2 = j2 > 0 ? ((((float) recentDownloadInfo2.recvedBytes) * 1.0f) / ((float) 1024)) / ((float) (j2 / ((long) 1000))) : 0.0f;
            C39622i0 a = C39818r.f106831a.mo62446e(cls2).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…ideoRecycler::class.java)");
            FinderVideoRecycler finderVideoRecycler = (FinderVideoRecycler) a;
            int g3 = finderVideoRecycler.mo80078g3(FinderThumbPlayerProxy.class);
            C55048e Hx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Hx0();
            C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Fx0();
            Fx0.getClass();
            long j3 = TrafficStats.totalWxRx;
            long e = Fx0.mo52128e();
            long j4 = Fx0.f71363d;
            int i = Hx0.f154567v;
            int i2 = Hx0.f154568w;
            int i3 = Hx0.f154569x;
            TestPreloadPreview testPreloadPreview2 = testPreloadPreview;
            boolean z = Hx0.f154570y;
            int i4 = Hx0.f154548c;
            int i5 = Hx0.f154571z;
            int i6 = Hx0.f154549d;
            int i7 = Hx0.f154537C;
            int i8 = Hx0.f154538D;
            int i9 = Hx0.f154539E;
            StringBuffer stringBuffer = new StringBuffer();
            int i15 = i8;
            StringBuilder sb = new StringBuilder();
            int i16 = i3;
            sb.append("微信:");
            sb.append(f);
            sb.append("KBps  ");
            stringBuffer.append(sb.toString());
            stringBuffer.append("视频号:" + f2 + "KBps  ");
            stringBuffer.append("tp=" + g3 + " ?=" + (finderVideoRecycler.mo80078g3((Class<? extends C59670o2>) null) - g3));
            stringBuffer.append("\n");
            stringBuffer.append("globalRx:" + Util.getSizeKB(j3) + "  ");
            stringBuffer.append("cdnRx:" + Util.getSizeKB(e) + " gap:" + Util.getSizeKB(j3 - e));
            stringBuffer.append("\n");
            stringBuffer.append("finderRx:" + Util.getSizeKB(j4) + " gap:" + Util.getSizeKB(e - j4) + "  ");
            stringBuffer.append("reportRx:" + Util.getSizeKB(j4) + " gap:" + Util.getSizeKB(j4 - j4) + "  ");
            stringBuffer.append("\n");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minBuffer:");
            sb4.append(i);
            sb4.append(" maxBuffer:");
            sb4.append(i2);
            sb4.append(" minCurrentBuffer:");
            int i17 = i16;
            sb4.append(i17);
            sb4.append(" fileTimeMs:");
            sb4.append(i5);
            sb4.append(' ');
            stringBuffer.append(sb4.toString());
            stringBuffer.append("\n");
            stringBuffer.append("preCreate:" + z + " nextCount:" + i4 + " minCurrentBuffer:" + i17 + " fileSizePercent:" + i6 + "  ");
            stringBuffer.append("\n");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("lsBuf:");
            sb5.append(i7);
            sb5.append(" lsSendBuf:");
            sb5.append(i15);
            sb5.append(" playerRecvBuf:");
            sb5.append(i9);
            sb5.append("  ");
            stringBuffer.append(sb5.toString());
            stringBuffer.append("\n");
            TestPreloadPreview testPreloadPreview3 = testPreloadPreview2;
            TestPreloadPreview.C56579a g = testPreloadPreview3.mo79909g(testPreloadPreview3.f162167p);
            if (g.f162179b > 0) {
                long a2 = C31543z5.m39451a();
                long j5 = g.f162179b;
                long j6 = a2 - j5;
                if (j5 < g.f162180c) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("加载完成 耗时:");
                    sb6.append(g.f162180c - g.f162179b);
                    sb6.append(" itemSize:");
                    sb6.append(g.f162181d);
                    sb6.append("  ");
                    sb6.append(testPreloadPreview3.f162165n);
                    sb6.append(XVFSFile.SEPARATOR_CHAR);
                    DataBuffer<C0740i2> dataBuffer = testPreloadPreview3.f162162h;
                    if (dataBuffer != null) {
                        sb6.append(dataBuffer.size());
                        sb6.append("  离上次：");
                        sb6.append(j6);
                        sb6.append("MS");
                        str2 = sb6.toString();
                    } else {
                        C87412m.m108603p("data");
                        throw null;
                    }
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("加载中 ");
                    sb7.append(testPreloadPreview3.f162165n);
                    sb7.append(XVFSFile.SEPARATOR_CHAR);
                    DataBuffer<C0740i2> dataBuffer2 = testPreloadPreview3.f162162h;
                    if (dataBuffer2 != null) {
                        sb7.append(dataBuffer2.size());
                        sb7.append(" 离上次：");
                        sb7.append(j6);
                        sb7.append("MS");
                        str2 = sb7.toString();
                    } else {
                        C87412m.m108603p("data");
                        throw null;
                    }
                }
                stringBuffer.append("FinderStream:" + str2);
            }
            str = stringBuffer.toString();
            C87412m.m108593f(str, "globalInfo.toString()");
        } else {
            TestPreloadPreview testPreloadPreview4 = testPreloadPreview;
            testPreloadPreview4.getClass();
            int recentAverageSpeed = CdnLogic.getRecentAverageSpeed(2);
            C55048e Hx02 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Hx0();
            C39622i0 a3 = C39818r.f106831a.mo62446e(cls2).mo75002a(cls);
            C87412m.m108593f(a3, "UICProvider.of(FinderCom…ideoRecycler::class.java)");
            FinderVideoRecycler finderVideoRecycler2 = (FinderVideoRecycler) a3;
            int g35 = finderVideoRecycler2.mo80078g3(FinderThumbPlayerProxy.class);
            int j7 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, 3);
            StringBuilder sb8 = new StringBuilder();
            sb8.append(recentAverageSpeed);
            sb8.append("kb/s | ");
            sb8.append(Hx02.f154547b);
            sb8.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb8.append(Hx02.f154548c);
            sb8.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb8.append(Hx02.f154551f);
            sb8.append(" | tp=");
            sb8.append(g35);
            sb8.append(" ?=");
            sb8.append(finderVideoRecycler2.mo80078g3((Class<? extends C59670o2>) null) - g35);
            sb8.append(" | autoPage=");
            sb8.append(j7);
            sb8.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb8.append(testPreloadPreview4.f162176y);
            sb8.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb8.append(testPreloadPreview4.f162175x);
            sb8.append(testPreloadPreview4.f162177z == 1 ? "..." : "");
            str = sb8.toString();
        }
        C61926c.m72668M(new C56620a(this.f162320d, str));
    }
}
