package ps2;

import bo2.C92277a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import os2.C100400e0;
import p749xh.C102646h;
import rq2.C101429o;
import sf0.C48374j0;
import te3.C48952c4;
import te3.C51163rv3;
import te3.h64;
import vr2.C102236a0;
import zt3.C119157j;

/* renamed from: ps2.v */
public class C100897v {

    /* renamed from: ps2.v$a */
    public class C100898a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C48952c4 f295473d;

        /* renamed from: e */
        public final /* synthetic */ String f295474e;

        /* renamed from: f */
        public final /* synthetic */ boolean f295475f;

        public C100898a(C48952c4 c4Var, String str, boolean z) {
            this.f295473d = c4Var;
            this.f295474e = str;
            this.f295475f = z;
        }

        public void run() {
            String str;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$1");
            try {
                str = C102236a0.m134765q0(this.f295473d.f131489d.f134464d.f283891Id);
            } catch (Throwable unused) {
                str = "";
            }
            C92277a aVar = null;
            try {
                aVar = new ADInfo(C48374j0.m53718g(this.f295473d.f131490e)).getAdPreloadConfig();
            } catch (Throwable th) {
                Log.m105920e("AdLandingPagesPreDownloadResHelper", "parse adInfo exp=" + th.toString());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("preDownloadAdLandingPages, preloadConfig=");
            sb.append(aVar == null ? "null" : aVar.toString());
            Log.m105924i("AdLandingPagesPreDownloadResHelper", sb.toString());
            try {
                if (new ADXml(this.f295474e).isLandingPagesAd() && C100894u.m132239s(this.f295474e)) {
                    int i = 0;
                    if (this.f295475f) {
                        i = 6;
                    }
                    Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages, scene=" + i + ", snsId=" + str);
                    C100884n.m132183e().mo140357l(this.f295474e, C102646h.COL_ADXML, aVar, i);
                }
            } catch (Throwable th4) {
                Log.m105920e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages, exp=" + th4.toString() + ", snsId=" + str);
            }
            try {
                String gestureCanvasInfo = ADXml.getGestureCanvasInfo(this.f295474e);
                if (C100894u.m132239s(gestureCanvasInfo)) {
                    int i2 = 1;
                    if (this.f295475f) {
                        i2 = 7;
                    }
                    Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages for gestureAdXml, scene=" + i2 + ", snsId=" + str);
                    C100884n.m132183e().mo140357l(gestureCanvasInfo, C102646h.COL_ADXML, aVar, i2);
                }
            } catch (Throwable th5) {
                Log.m105920e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages for gestureAdXml, exp=" + th5.toString() + ", snsId=" + str);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$1");
        }
    }

    /* renamed from: ps2.v$b */
    public class C100899b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f295476d;

        /* renamed from: e */
        public final /* synthetic */ String f295477e;

        public C100899b(String str, String str2) {
            this.f295476d = str;
            this.f295477e = str2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$2");
            if (C100894u.m132239s(this.f295476d) || C101429o.m133108a(this.f295476d, C102646h.COL_ADXML)) {
                Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForSnsObject, snsId=" + this.f295477e);
                C100884n.m132183e().mo140357l(this.f295476d, C102646h.COL_ADXML, (C92277a) null, 4);
            } else {
                Log.m105928w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForSnsObject, invalid canvas, snsId=" + this.f295477e);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$2");
        }
    }

    /* renamed from: a */
    public static void m132252a(LinkedList<C48952c4> linkedList, boolean z) {
        SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (linkedList == null) {
            SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        for (int i = 0; i < linkedList.size(); i++) {
            m132253b(linkedList.get(i), z);
        }
        SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }

    /* renamed from: b */
    public static void m132253b(C48952c4 c4Var, boolean z) {
        h64 h64;
        C51163rv3 rv32;
        SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (c4Var == null || (h64 = c4Var.f131489d) == null || (rv32 = h64.f134465e) == null) {
            SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        String g = C48374j0.m53718g(rv32);
        if (!Util.isNullOrNil(g)) {
            ((C119157j) C119157j.f356862d).mo183875f(new C100898a(c4Var, g, z));
        }
        SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }

    /* renamed from: c */
    public static void m132254c(LinkedList<SnsObject> linkedList) {
        SnsInfo SE;
        SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (linkedList == null) {
            SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        C100400e0 Yx0 = C94866e1.Yx0();
        for (int i = 0; i < linkedList.size(); i++) {
            SnsObject snsObject = linkedList.get(i);
            if (!(snsObject == null || (SE = Yx0.mo139806SE(snsObject.f283891Id)) == null)) {
                TimeLineObject timeLine = SE.getTimeLine();
                String str = timeLine == null ? "" : timeLine.canvasInfo;
                if (!Util.isNullOrNil(str)) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C100899b(str, SE.getSnsId()));
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }
}
