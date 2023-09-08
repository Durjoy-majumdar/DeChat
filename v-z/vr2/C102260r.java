package vr2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gv2.C98242p;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ji3.C9457a;
import jp2.C98961m;
import jp2.C98963o;
import jr2.C33652w;
import js0.C9512b;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lg3.C88494d;
import lo2.C34318c;
import lo2.C88616u0;
import lo2.C99542h0;
import lo2.C99552l;
import nj3.C88990b;
import p749xh.C102646h;
import p763ym.C79138l;
import ps2.C100894u;
import rq2.C101425k;
import rq2.C63505q;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.w64;
import vo2.C65833d;
import vr2.C102240d;
import wr2.C91098a;
import ys2.C66696h;

/* renamed from: vr2.r */
public final class C102260r {

    /* renamed from: vr2.r$a */
    public class C102261a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f301165d;

        /* renamed from: e */
        public final /* synthetic */ C98961m f301166e;

        /* renamed from: f */
        public final /* synthetic */ String f301167f;

        /* renamed from: g */
        public final /* synthetic */ int f301168g;

        /* renamed from: h */
        public final /* synthetic */ int f301169h;

        /* renamed from: i */
        public final /* synthetic */ Context f301170i;

        /* renamed from: j */
        public final /* synthetic */ Intent f301171j;

        /* renamed from: n */
        public final /* synthetic */ String f301172n;

        /* renamed from: o */
        public final /* synthetic */ String f301173o;

        /* renamed from: p */
        public final /* synthetic */ String f301174p;

        /* renamed from: vr2.r$a$a */
        public class C102262a implements C44580q1 {

            /* renamed from: a */
            public final /* synthetic */ C102239c f301175a;

            public C102262a(C102239c cVar) {
                this.f301175a = cVar;
            }

            /* renamed from: a */
            public void mo1579a(boolean z, boolean z2) {
                boolean z3 = z;
                SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1$1");
                Log.m105924i("SnsAdUtil", "appPageUrl!=null, onLaunchApp=" + z3 + ", launchCancel=" + z2);
                if (z3) {
                    C102261a aVar = C102261a.this;
                    if (aVar.f301169h != 2) {
                        C102259p.m134831d(aVar.f301173o, aVar.f301174p, 1, 2, aVar.f301165d, aVar.f301167f, aVar.f301168g);
                        C102239c cVar = this.f301175a;
                        ArrayList<Integer> arrayList = C99552l.f291829a;
                        SnsMethodCalculate.markStartTimeMs("reportDeepLinkDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                        try {
                            C102240d.C102242b bVar = new C102240d.C102242b();
                            bVar.mo141803k(4002009);
                            bVar.mo141805m(cVar.f301049a);
                            bVar.mo141797e(cVar.f301050b);
                            bVar.mo141802j(cVar.f301051c);
                            bVar.mo141795c(cVar.f301052d);
                            bVar.mo141806n(cVar.f301053e);
                            bVar.mo141804l(cVar.f301054f);
                            bVar.mo141807o(cVar.f301055g);
                            bVar.mo141799g(cVar.f301057i);
                            bVar.mo141800h(1);
                            C63505q.m74843b(bVar.mo141793a());
                        } catch (Throwable th) {
                            Log.m105920e("AdConversionOnlineReportHelper", "reportDeepLinkDialogConfirm, exp is " + th.toString());
                        }
                        SnsMethodCalculate.markEndTimeMs("reportDeepLinkDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    }
                    C102239c cVar2 = this.f301175a;
                    ArrayList<Integer> arrayList2 = C99552l.f291829a;
                    SnsMethodCalculate.markStartTimeMs("reportDeepLinkComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    try {
                        C102240d.C102242b bVar2 = new C102240d.C102242b();
                        bVar2.mo141803k(4002011);
                        bVar2.mo141805m(cVar2.f301049a);
                        bVar2.mo141797e(cVar2.f301050b);
                        bVar2.mo141802j(cVar2.f301051c);
                        bVar2.mo141795c(cVar2.f301052d);
                        bVar2.mo141806n(cVar2.f301053e);
                        bVar2.mo141804l(cVar2.f301054f);
                        bVar2.mo141807o(cVar2.f301055g);
                        bVar2.mo141799g(cVar2.f301057i);
                        bVar2.mo141800h(1);
                        C63505q.m74843b(bVar2.mo141793a());
                    } catch (Throwable th4) {
                        Log.m105920e("AdConversionOnlineReportHelper", "reportDeepLinkComplete, exp is " + th4.toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("reportDeepLinkComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                }
                if (!z3) {
                    C95198o2.m121132d(C102261a.this.f301170i);
                }
                SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1$1");
            }
        }

        public C102261a(String str, C98961m mVar, String str2, int i, int i2, Context context, Intent intent, String str3, String str4, String str5) {
            this.f301165d = str;
            this.f301166e = mVar;
            this.f301167f = str2;
            this.f301168g = i;
            this.f301169h = i2;
            this.f301170i = context;
            this.f301171j = intent;
            this.f301172n = str3;
            this.f301173o = str4;
            this.f301174p = str5;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1");
            String str = this.f301165d;
            C98961m mVar = this.f301166e;
            C102239c cVar = new C102239c(str, mVar.f290116a, mVar.f290117b, this.f301167f, mVar.f290118c, mVar.f290119d, mVar.f290120e);
            if (this.f301168g == 1) {
                SnsMethodCalculate.markStartTimeMs("setDeeplinkScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                cVar.f301057i = 4;
                SnsMethodCalculate.markEndTimeMs("setDeeplinkScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            } else {
                SnsMethodCalculate.markStartTimeMs("setDeeplinkScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                cVar.f301057i = 1;
                SnsMethodCalculate.markEndTimeMs("setDeeplinkScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            }
            ArrayList<Integer> arrayList = C99552l.f291829a;
            SnsMethodCalculate.markStartTimeMs("reportDeepLinkStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                C102240d.C102242b bVar = new C102240d.C102242b();
                bVar.mo141803k(4002001);
                bVar.mo141805m(cVar.f301049a);
                bVar.mo141797e(cVar.f301050b);
                bVar.mo141802j(cVar.f301051c);
                bVar.mo141795c(cVar.f301052d);
                bVar.mo141806n(cVar.f301053e);
                bVar.mo141804l(cVar.f301054f);
                bVar.mo141807o(cVar.f301055g);
                bVar.mo141799g(cVar.f301057i);
                bVar.mo141800h(1);
                C63505q.m74843b(bVar.mo141793a());
            } catch (Throwable th) {
                Log.m105920e("AdConversionOnlineReportHelper", "reportDeepLinkStart, exp is " + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("reportDeepLinkStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            if (this.f301169h != 2) {
                SnsMethodCalculate.markStartTimeMs("reportDeepLinkDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar2 = new C102240d.C102242b();
                    bVar2.mo141803k(4002007);
                    bVar2.mo141805m(cVar.f301049a);
                    bVar2.mo141797e(cVar.f301050b);
                    bVar2.mo141802j(cVar.f301051c);
                    bVar2.mo141795c(cVar.f301052d);
                    bVar2.mo141806n(cVar.f301053e);
                    bVar2.mo141804l(cVar.f301054f);
                    bVar2.mo141807o(cVar.f301055g);
                    bVar2.mo141799g(cVar.f301057i);
                    bVar2.mo141800h(1);
                    C63505q.m74843b(bVar2.mo141793a());
                } catch (Throwable th4) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportDeepLinkDialogShow, exp is " + th4.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportDeepLinkDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
            ((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(this.f301170i, this.f301171j, this.f301172n, this.f301169h, new C102262a(cVar), (Bundle) null);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1");
        }
    }

    /* renamed from: vr2.r$b */
    public class C102263b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f301177d;

        /* renamed from: e */
        public final /* synthetic */ String f301178e;

        /* renamed from: f */
        public final /* synthetic */ String f301179f;

        /* renamed from: g */
        public final /* synthetic */ int f301180g;

        /* renamed from: h */
        public final /* synthetic */ String f301181h;

        /* renamed from: i */
        public final /* synthetic */ String f301182i;

        /* renamed from: j */
        public final /* synthetic */ String f301183j;

        /* renamed from: n */
        public final /* synthetic */ String f301184n;

        /* renamed from: o */
        public final /* synthetic */ int f301185o;

        /* renamed from: vr2.r$b$a */
        public class C102264a implements C44580q1 {
            public C102264a() {
            }

            /* renamed from: a */
            public void mo1579a(boolean z, boolean z2) {
                SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2$1");
                Log.m105924i("SnsAdUtil", "onLaunchApp=" + z + ", launchCancel=" + z2);
                if (z) {
                    C102263b bVar = C102263b.this;
                    if (bVar.f301180g != 2) {
                        C102259p.m134831d(bVar.f301181h, bVar.f301182i, 1, 2, bVar.f301183j, bVar.f301184n, bVar.f301185o);
                    }
                }
                if (!z) {
                    C95198o2.m121132d(C102263b.this.f301177d);
                }
                SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2$1");
            }
        }

        public C102263b(Context context, String str, String str2, int i, String str3, String str4, String str5, String str6, int i2) {
            this.f301177d = context;
            this.f301178e = str;
            this.f301179f = str2;
            this.f301180g = i;
            this.f301181h = str3;
            this.f301182i = str4;
            this.f301183j = str5;
            this.f301184n = str6;
            this.f301185o = i2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2");
            ((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(this.f301177d, this.f301177d.getPackageManager().getLaunchIntentForPackage(this.f301178e), this.f301179f, this.f301180g, new C102264a(), (Bundle) null);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2");
        }
    }

    /* renamed from: A */
    public static String m134832A(View view) {
        SnsMethodCalculate.markStartTimeMs("getPaddingStr", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        String str = "[" + view.getPaddingLeft() + "," + view.getPaddingTop() + "," + view.getPaddingRight() + "," + view.getPaddingBottom() + "]";
        SnsMethodCalculate.markEndTimeMs("getPaddingStr", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    /* renamed from: B */
    public static String m134833B(String str) {
        SnsMethodCalculate.markStartTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            String[] split = str.split("\\|");
            if (split.length >= 8) {
                String nullAsNil = Util.nullAsNil(split[7]);
                SnsMethodCalculate.markEndTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return nullAsNil;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getPid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    /* renamed from: C */
    public static String m134834C(String str) {
        SnsMethodCalculate.markStartTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            String[] split = str.split("\\|");
            if (split.length >= 2) {
                String nullAsNil = Util.nullAsNil(split[1]);
                SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return nullAsNil;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    /* renamed from: D */
    public static String m134835D(String str) {
        SnsMethodCalculate.markStartTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            Log.m105924i("SnsAdUtil", "getUxinfoFromAdInfoXml, xml=" + str);
            Map<String, String> parseXml = XmlParser.parseXml(str, "ADInfo", (String) null);
            if (parseXml != null) {
                String nullAs = Util.nullAs(parseXml.get(".ADInfo.uxInfo"), "");
                SnsMethodCalculate.markEndTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return nullAs;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "getUxinfoFromAdInfoXml, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getUxInfoFromAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    /* renamed from: E */
    public static boolean m134836E(Context context, SnsInfo snsInfo, ADInfo aDInfo, int i, C98963o oVar, int i2, int i3) {
        SnsInfo snsInfo2 = snsInfo;
        ADInfo aDInfo2 = aDInfo;
        int i4 = i;
        SnsMethodCalculate.markStartTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo2 == null || aDInfo2 == null) {
            SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        try {
            SnsAdClick snsAdClick = new SnsAdClick(i, i4 == 0 ? 1 : 2, snsInfo2.field_snsId, i2, 0);
            m134865e(snsAdClick, oVar, snsInfo2, i2, i3);
            if (m134868h(context, snsInfo, aDInfo, i, oVar)) {
                Log.m105924i("SnsAdUtil", "handleAdClickDownloadAction, checkOpenApp success");
                snsAdClick.f267473h = 34;
                C102236a0.m134773u0(snsAdClick);
                SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return true;
            } else if (m134861b0(context, snsInfo2, aDInfo2, i4, 2)) {
                Log.m105924i("SnsAdUtil", "handleAdClickDownloadAction, tryProcessAdAppMarket success");
                snsAdClick.f267473h = 36;
                C102236a0.m134773u0(snsAdClick);
                SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return true;
            } else {
                C99552l.m129933i(false, snsInfo2, i4);
                SnsMethodCalculate.markEndTimeMs("handleAdClickDownloadAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "handleAdClickDownloadAction, exp=" + th.toString());
        }
    }

    /* renamed from: F */
    public static boolean m134837F(Context context, SnsInfo snsInfo, ADInfo aDInfo, int i, C98963o oVar) {
        boolean z;
        ADXml.C85461b bVar;
        Context context2 = context;
        SnsInfo snsInfo2 = snsInfo;
        ADInfo aDInfo2 = aDInfo;
        int i2 = i;
        C98963o oVar2 = oVar;
        SnsMethodCalculate.markStartTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo2 == null || aDInfo2 == null) {
            SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        try {
            if (m134868h(context, snsInfo, aDInfo, i, oVar)) {
                Log.m105924i("SnsAdUtil", "handleAdClickAction, checkOpenApp succ");
                int i3 = i2 == 0 ? 1 : 2;
                SnsAdClick snsAdClick = r0;
                SnsAdClick snsAdClick2 = new SnsAdClick(i, i3, snsInfo2.field_snsId, 22, 34);
                m134864d(snsAdClick, oVar2, snsInfo2, 22);
                C102236a0.m134773u0(snsAdClick);
                SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return true;
            } else if (m134861b0(context2, snsInfo2, aDInfo2, i2, 2)) {
                Log.m105924i("SnsAdUtil", "handleAdClickAction, tryProcessAdAppMarket succ");
                int i4 = i2 == 0 ? 1 : 2;
                SnsAdClick snsAdClick3 = r0;
                SnsAdClick snsAdClick4 = new SnsAdClick(i, i4, snsInfo2.field_snsId, 22, 36);
                m134864d(snsAdClick3, oVar2, snsInfo2, 22);
                C102236a0.m134773u0(snsAdClick3);
                SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return true;
            } else {
                C99552l.m129933i(false, snsInfo2, i2);
                ADXml adXml = snsInfo.getAdXml();
                SnsMethodCalculate.markStartTimeMs("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
                if (adXml == null || (bVar = adXml.adScanJumpInfo) == null || aDInfo2.adActionType != 8) {
                    SnsMethodCalculate.markEndTimeMs("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
                    z = false;
                } else {
                    C88616u0.m110482a(context2, bVar, aDInfo2.uxInfo, 7);
                    SnsMethodCalculate.markEndTimeMs("checkJumpScan", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
                    z = true;
                }
                if (z) {
                    Log.m105924i("SnsAdUtil", "handleAdClickAction, checkJumpScan succ");
                    int i5 = i2 == 0 ? 1 : 2;
                    SnsAdClick snsAdClick5 = r0;
                    SnsAdClick snsAdClick6 = new SnsAdClick(i, i5, snsInfo2.field_snsId, 22, 35);
                    m134864d(snsAdClick5, oVar2, snsInfo2, 22);
                    C102236a0.m134773u0(snsAdClick5);
                    SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return true;
                }
                if (C99542h0.m129903a(context, snsInfo.getAdXml(), aDInfo, snsInfo2.field_snsId, 3)) {
                    int i6 = i2 == 0 ? 1 : 2;
                    SnsAdClick snsAdClick7 = r0;
                    SnsAdClick snsAdClick8 = new SnsAdClick(i, i6, snsInfo2.field_snsId, 22, 37);
                    m134864d(snsAdClick7, oVar2, snsInfo2, 22);
                    C102236a0.m134773u0(snsAdClick7);
                    SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return true;
                }
                SnsMethodCalculate.markEndTimeMs("handleCardAdClickAction", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "handleAdClickAction, exp=" + th.toString());
        }
    }

    /* renamed from: G */
    public static boolean m134838G(SnsInfo snsInfo, w64 w64) {
        SnsMethodCalculate.markStartTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = false;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        } else if (w64 == null) {
            SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        } else if (Util.isNullOrNil(w64.f299703d)) {
            SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        } else {
            if (snsInfo.isAd() && C98242p.m126942d(w64.f299716t, 128) && Util.isEqual(w64.f299703d, snsInfo.getUserName())) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isAdBossFirstLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z;
        }
    }

    /* renamed from: H */
    public static boolean m134839H(SnsObject snsObject, String str) {
        boolean z;
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z3 = false;
        try {
            Iterator<w64> it = snsObject.CommentUserList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                w64 next = it.next();
                if (next != null && !Util.isNullOrNil(next.f299703d) && next.f299703d.equals(str)) {
                    z = true;
                    break;
                }
            }
            Iterator<w64> it4 = snsObject.LikeUserList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z2 = false;
                    break;
                }
                w64 next2 = it4.next();
                if (next2 != null && !Util.isNullOrNil(next2.f299703d) && next2.f299703d.equals(str)) {
                    z2 = true;
                    break;
                }
            }
            Log.m105924i("SnsAdUtil", "isAdCommentOrLikedBySelf, snsId=" + C102236a0.m134765q0(snsObject.f283891Id) + ", hasComment=" + z + ", hasLiked=" + z2);
            if (z || z2) {
                z3 = true;
            }
            SnsMethodCalculate.markEndTimeMs("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z3;
        } catch (Exception e) {
            Log.m105920e("SnsAdUtil", "isAdCommentOrLikedBySelf, exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("isAdCommentOrLikedBySelf", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    /* renamed from: I */
    public static boolean m134840I(SnsInfo snsInfo, SnsInfo snsInfo2) {
        SnsMethodCalculate.markStartTimeMs("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = true;
        if (snsInfo == snsInfo2) {
            SnsMethodCalculate.markEndTimeMs("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
        long j = 0;
        long j2 = snsInfo != null ? snsInfo.field_snsId : 0;
        if (snsInfo2 != null) {
            j = snsInfo2.field_snsId;
        }
        if (j2 != j) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isAdEquals", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z;
    }

    /* renamed from: J */
    public static boolean m134841J(String str) {
        SnsMethodCalculate.markStartTimeMs("isAdUsePreferedInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = !TextUtils.isEmpty(str) && str.contains("<usePreferedInfo>1</usePreferedInfo>");
        SnsMethodCalculate.markEndTimeMs("isAdUsePreferedInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z;
    }

    /* renamed from: K */
    public static boolean m134842K(Context context) {
        SnsMethodCalculate.markStartTimeMs("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = false;
        if (context == null) {
            Log.m105928w("SnsAdUtil", "isAdapterElder() called with: context = [" + context + "]");
            SnsMethodCalculate.markEndTimeMs("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (C76577a.m92165p(context) > 1.1f) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isAdapterElder", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z;
    }

    /* renamed from: L */
    public static boolean m134843L(Context context) {
        SnsMethodCalculate.markStartTimeMs("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = false;
        if (context == null) {
            Log.m105928w("SnsAdUtil", "isAdapterElderSuper() called with: context = [" + context + "]");
            SnsMethodCalculate.markEndTimeMs("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (C76577a.m92165p(context) > 1.12f) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isAdapterElderSuper", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z;
    }

    /* renamed from: M */
    public static boolean m134844M() {
        SnsMethodCalculate.markStartTimeMs("isDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger();
        SnsMethodCalculate.markEndTimeMs("isDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return z;
    }

    /* renamed from: N */
    public static boolean m134845N() {
        SnsMethodCalculate.markStartTimeMs("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = true;
        try {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_report_app_install_status, 1) <= 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return z;
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "isReportAppInstallStatus, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReportAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
    }

    /* renamed from: O */
    public static boolean m134846O(TimeLineObject timeLineObject) {
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        C101804kv2 kv22;
        C101817mv2 mv22;
        SnsMethodCalculate.markStartTimeMs("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = false;
        if (!(timeLineObject == null || (j002 = timeLineObject.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.size() <= 0 || (kv22 = timeLineObject.ContentObj.f298427h.get(0)) == null || (mv22 = kv22.f298698p) == null)) {
            float f = mv22.f298875d;
            if (f > 0.0f) {
                float f2 = mv22.f298876e;
                if (f2 > 0.0f) {
                    if (((int) f2) > ((int) f)) {
                        z = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return z;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("isVerticalVideo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    /* renamed from: P */
    public static void m134847P(long j, String str, String str2, int i) {
        SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        C33652w wVar = new C33652w();
        wVar.f91064c = str2;
        wVar.f91063b = i;
        m134848Q((Context) null, j, str, wVar);
        SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: Q */
    public static void m134848Q(Context context, long j, String str, C33652w wVar) {
        SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context == null) {
            try {
                Log.m105924i("SnsAdUtil", "openAdCanvasById, use MMApplicationContext");
                context = MMApplicationContext.getContext();
            } catch (Throwable th) {
                Log.m105920e("SnsAdUtil", "openAdCanvasById, canvasId=" + j + ", exp=" + th.toString());
            }
        }
        Intent intent = new Intent();
        intent.putExtra("sns_landing_pages_pageid", j);
        intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
        intent.putExtra("sns_landing_pages_ad_info", str);
        if (wVar != null) {
            intent.putExtra("sns_landig_pages_from_source", wVar.f91063b);
            intent.putExtra("sns_landing_page_half_screen_mode", wVar.f91062a);
            if (wVar.f91062a) {
                C115669n.INSTANCE.mo175911u(1898, 6);
                C65833d.m77547b(true);
            }
            if (!TextUtils.isEmpty(wVar.f91064c)) {
                intent.putExtra("sns_landing_pages_extra_param", wVar.f91064c);
            }
            if (!TextUtils.isEmpty(wVar.f91065d)) {
                intent.putExtra("sns_landing_page_canvas_dynamicinfo", wVar.f91065d);
            }
            if (wVar.f91066e) {
                intent.putExtra("sns_landing_is_native_sight_ad", true);
            }
        }
        C88144b.m109791i(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: R */
    public static boolean m134849R(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, C98961m mVar) {
        String str8;
        String str9;
        String str10;
        Context context2 = context;
        String str11 = str;
        String str12 = str2;
        SnsMethodCalculate.markStartTimeMs("openApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        Log.m105924i("SnsAdUtil", "openApp, appId = " + str11 + ", uxInfo = " + str5 + ", adExtInfo = " + str6 + ", appPageUrl=" + str4 + ", pkgName=" + str12);
        if (context2 == null || TextUtils.isEmpty(str2)) {
            Log.m105920e("SnsAdUtil", "openApp, failed");
            SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        if (i2 != 2) {
            str8 = "SnsAdUtil";
            C102259p.m134831d(str7, str, 0, 2, str5, str6, i);
        } else {
            str8 = "SnsAdUtil";
        }
        if (!TextUtils.isEmpty(str4)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str4));
            intent.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(context2, intent);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                Log.m105920e(str8, "queryIntentActivities, empty");
                SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
            String str13 = (!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(C79138l.class)).mo74017uF(queryIntentActivities.get(0));
            String str14 = str8;
            Log.m105924i(str14, "queryIntentActivities, pkg=" + str13);
            if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals(str13)) {
                str9 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
                str10 = "openApp";
                C9457a.m9137a(new C102261a(str5, mVar, str6, i, i2, context, intent, str3, str7, str));
            } else {
                Log.m105920e(str14, "err queryIntent pkg equals mm");
                SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
        } else {
            str9 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
            str10 = "openApp";
            C9457a.m9137a(new C102263b(context, str2, str3, i2, str7, str, str5, str6, i));
        }
        AdLandingPagesProxy.getInstance().reportOpenAppInfo(9, str11, str12);
        SnsMethodCalculate.markEndTimeMs(str10, str9);
        return true;
    }

    /* renamed from: S */
    public static void m134850S(Context context, View view, SnsInfo snsInfo, int i) {
        Context context2 = context;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            Log.m105924i("SnsAdUtil", "openGestureLandingPage, source=" + i2 + ", snsId=" + snsInfo.field_snsId);
            int[] iArr = new int[2];
            View view2 = view;
            view.getLocationInWindow(iArr);
            Intent intent = new Intent();
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", view.getWidth());
            intent.putExtra("img_gallery_height", view.getHeight());
            intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            intent.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().f283893Id);
            intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            String gestureCanvasInfo = snsInfo.getAdXml().getGestureCanvasInfo();
            if (!C100894u.m132240t(gestureCanvasInfo, "adCanvasInfo")) {
                Log.m105920e("SnsAdUtil", "openEggLandingPage, invalid adFullCardGestureCanvasInfo");
                C115669n.INSTANCE.mo175911u(1612, 118);
                if (snsInfo.getAdXml().isLandingPagesAd()) {
                    gestureCanvasInfo = snsInfo.getAdXml().xml.replaceAll("(?s)<adFullCardGestureCanvasInfo[^>]*>.*?</adFullCardGestureCanvasInfo>", "");
                    if (!C100894u.m132240t(gestureCanvasInfo, "adCanvasInfo")) {
                        Log.m105920e("SnsAdUtil", "openEggLandingPage, invalid adCanvasInfo too");
                        SnsMethodCalculate.markEndTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                        return;
                    }
                } else {
                    Log.m105920e("SnsAdUtil", "openEggLandingPage, is not landingpageAd");
                    SnsMethodCalculate.markEndTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    return;
                }
            }
            intent.putExtra("sns_landing_page_is_interactive_canvas", true);
            intent.putExtra("sns_landing_pages_xml", gestureCanvasInfo);
            intent.setClass(context, SnsAdNativeLandingPagesUI.class);
            intent.putExtra("sns_landig_pages_from_source", i2);
            intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
            if (!snsInfo.getAdXml().forbiddenCustomAnimation) {
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            }
            intent.putExtra("sns_landing_is_native_sight_ad", true);
            intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
            if (snsInfo.isTwistAd()) {
                intent.putExtra("sns_landing_page_is_gesture_twist_ad", true);
            } else if (snsInfo.isShakeAd()) {
                intent.putExtra("sns_landing_page_is_gesture_shake_ad", true);
            } else if (snsInfo.isLongPressGestureAd()) {
                intent.putExtra("sns_landing_page_is_longpress_ad", true);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/data/SnsAdUtil", "openEggLandingPage", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/sns/data/SnsAdUtil", "openEggLandingPage", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (context2 instanceof Activity) {
                ((Activity) context2).overridePendingTransition(0, 0);
            }
        } catch (Exception e) {
            Log.m105920e("SnsAdUtil", "openGestureLandingPage, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: T */
    public static String m134851T(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        String nullAsNil = Util.nullAsNil(str);
        try {
            if (!TextUtils.isEmpty(nullAsNil) && !TextUtils.isEmpty(str2)) {
                nullAsNil = String.format("#%02x%s", new Object[]{Integer.valueOf((int) (Util.safeParseDouble(str2) * 255.0d)), nullAsNil.substring(1)});
            }
        } catch (Exception e) {
            Log.m105920e("SnsAdUtil", "parseColor exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return nullAsNil;
    }

    /* renamed from: U */
    public static void m134852U(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportAdFinderTopicImageDownload", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int i3 = 3;
        if (i == 1) {
            i3 = i2 == 0 ? 1 : 2;
        } else if (i != 2) {
            i3 = i == 3 ? i2 == 0 ? 5 : 6 : 0;
        } else if (i2 != 0) {
            i3 = 4;
        }
        try {
            Log.m105918d("SnsAdUtil", "reportAdFinderTopicImageDownload scene is " + i + ", result is " + i3);
            if (i3 != 0) {
                C115669n.INSTANCE.mo175911u(1606, i3);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("reportAdFinderTopicImageDownload", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: V */
    public static void m134853V(View view) {
        int i;
        SnsMethodCalculate.markStartTimeMs("setClickHapticFeedbackForClickLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (view == null) {
            Log.m105920e("SnsAdUtil", "setClickHapticFeedbackForClickLike but view is null");
            SnsMethodCalculate.markEndTimeMs("setClickHapticFeedbackForClickLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_social_like_haptic_feedback_level_android, 0);
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "setClickHapticFeedbackForClickLike, exp is " + th);
        }
        Log.m105924i("SnsAdUtil", "setClickHapticFeedbackForClickLike, gray is " + i);
        long j = i == 1 ? 50 : i == 2 ? 80 : i == 3 ? 100 : 0;
        if (j > 0) {
            C102236a0.m134708C0(new long[]{0, j});
        }
        SnsMethodCalculate.markEndTimeMs("setClickHapticFeedbackForClickLike", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: W */
    public static void m134854W() {
        int i;
        SnsMethodCalculate.markStartTimeMs("setClickHapticFeedbackForIpComment", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_ip_comment_haptic_feedback_level_android, 0);
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "setClickHapticFeedbackForIpComment, exp is " + th);
        }
        Log.m105924i("SnsAdUtil", "setClickHapticFeedbackForIpComment, gray is " + i);
        long j = i == 1 ? 50 : i == 2 ? 80 : i == 3 ? 100 : 0;
        if (j > 0) {
            C102236a0.m134708C0(new long[]{0, j});
        }
        SnsMethodCalculate.markEndTimeMs("setClickHapticFeedbackForIpComment", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: X */
    public static void m134855X(TextView textView, int i) {
        SnsMethodCalculate.markStartTimeMs("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            SnsMethodCalculate.markEndTimeMs("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            textView.setTextSize(0, (float) C76577a.m92155f(textView.getContext(), i));
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "setFixedFontSize, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setFixedFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: Y */
    public static void m134856Y(TextView textView, int i) {
        SnsMethodCalculate.markStartTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (textView == null) {
            SnsMethodCalculate.markEndTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return;
        }
        try {
            textView.setTextSize(0, m134886z(i));
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "setLimitedScaleFontSize, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: Z */
    public static void m134857Z() {
        SnsMethodCalculate.markStartTimeMs("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        Log.m105924i("SnsAdUtil", "startToolsProcess");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(C74928u.C74930g.f220310a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        MMApplicationContext.getContext().sendBroadcast(intent);
        SnsMethodCalculate.markEndTimeMs("startToolsProcess", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: a */
    public static void m134858a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("adChannelCgiReport", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (MMApplicationContext.isMainProcess()) {
                C66696h hVar = new C66696h(str, str2);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(hVar);
                Log.m105924i("SnsAdUtil", "adChannelCgiReport, main, channel=" + str + ", content=" + str2);
            } else if (MMApplicationContext.isToolsProcess()) {
                AdLandingPagesProxy.getInstance().onAdLandingPageClick(str, str2);
                Log.m105924i("SnsAdUtil", "adChannelCgiReport, tools, channel=" + str + ", content=" + str2);
            } else {
                AdLandingPagesProxy.getInstance().onAdLandingPageClick(str, str2);
                Log.m105924i("SnsAdUtil", "adChannelCgiReport, other process, channel=" + str + ", content=" + str2);
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "adChannelCgiReport, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("adChannelCgiReport", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: a0 */
    public static void m134859a0(String str, String str2, String str3, int i, String str4) {
        SnsMethodCalculate.markStartTimeMs("timelineReport19790", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("outSns", 1);
        C91098a.m114284h(str, str2, str3, i, str4, arrayMap);
        SnsMethodCalculate.markEndTimeMs("timelineReport19790", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: b */
    public static String m134860b(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("appendClickTimeToWeAppPath", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (!Util.isNullOrNil(str) && z) {
                str = C100894u.m132223c(str, String.format("gdt_clicktime=%s", new Object[]{Long.valueOf(System.currentTimeMillis())}));
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("appendClickTimeToWeAppPath", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str;
    }

    /* renamed from: b0 */
    public static boolean m134861b0(Context context, SnsInfo snsInfo, ADInfo aDInfo, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String valueOf;
        String str8;
        String str9;
        String str10;
        int i3;
        String str11;
        String str12;
        Context context2 = context;
        SnsInfo snsInfo2 = snsInfo;
        ADInfo aDInfo2 = aDInfo;
        int i4 = i;
        SnsMethodCalculate.markStartTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (context2 == null || snsInfo2 == null || aDInfo2 == null) {
            Log.m105920e("SnsAdUtil", "tryProcessAdAppMarket input param is wrong");
            SnsMethodCalculate.markEndTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        ADInfo.C95008a aVar = aDInfo2.actionExtAppJump;
        String str13 = "";
        if (aVar != null) {
            str3 = aVar.f275644d;
            str2 = aVar.f275641a;
            str = aVar.f275643c;
            str4 = aVar.f275642b;
        } else {
            str4 = str13;
            str3 = str4;
            str2 = str3;
            str = str2;
        }
        ADXml adXml = snsInfo.getAdXml();
        if (adXml == null || adXml.toAdMarket != 1) {
            SnsMethodCalculate.markEndTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        C115669n.INSTANCE.mo175911u(1958, 8);
        str5 = adXml.adExtInfo;
        Intent intent = adXml.appMarketIntent;
        if (TextUtils.isEmpty(str4) && intent != null) {
            str4 = IntentUtil.getStringExtra(adXml.appMarketIntent, "target_app_id");
        }
        String str14 = str4;
        if (str14 == null) {
            Log.m105920e("SnsAdUtil", "the target package is empty!");
            SnsMethodCalculate.markEndTimeMs("tryProcessAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        String str15 = "tryProcessAdAppMarket";
        int i5 = i2 == 1 ? 2 : 0;
        if (C9512b.m9207a(context2, str14) != null) {
            if (TextUtils.isEmpty(str3)) {
                SnsMethodCalculate.markStartTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                if (TextUtils.isEmpty(str14)) {
                    SnsMethodCalculate.markEndTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str14, 128));
                        if (applicationLabel != null) {
                            str13 = applicationLabel.toString();
                            SnsMethodCalculate.markEndTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                        }
                    } catch (Throwable unused) {
                    }
                    SnsMethodCalculate.markEndTimeMs("getApplicationName", "com.tencent.mm.plugin.sns.adutils.AdUtils$System");
                }
            } else {
                str13 = str3;
            }
            C99552l.m129933i(true, snsInfo2, i4);
            m134849R(context, str2, str14, str13, str, aDInfo2.uxInfo, str5, String.valueOf(snsInfo2.field_snsId), i2, i5, new C98961m(aDInfo2.aid, aDInfo2.traceid, aDInfo2.pId));
            C115669n.INSTANCE.mo175911u(1958, 10);
            str6 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
        } else {
            int i6 = i5;
            if (C91098a.m114281e(intent)) {
                str7 = str13;
                m134859a0(String.valueOf(snsInfo2.field_snsId), aDInfo2.uxInfo, str5, 4, "0");
            } else {
                str7 = str13;
                m134859a0(String.valueOf(snsInfo2.field_snsId), aDInfo2.uxInfo, str5, 4, "1");
            }
            if (C91098a.m114280d(intent)) {
                m134859a0(String.valueOf(snsInfo2.field_snsId), aDInfo2.uxInfo, str5, 1, "0");
                C99552l.m129933i(false, snsInfo2, i4);
                valueOf = String.valueOf(snsInfo2.field_snsId);
                str8 = aDInfo2.uxInfo;
                SnsMethodCalculate.markStartTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                if (intent == null) {
                    Log.m105920e("SnsAdUtil", "startMarketActivity input param is error");
                    SnsMethodCalculate.markEndTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    str6 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
                } else {
                    try {
                        if (!(context2 instanceof Activity)) {
                            try {
                                intent.addFlags(268435456);
                            } catch (Throwable unused2) {
                            }
                        }
                        String nullAs = Util.nullAs(IntentUtil.getStringExtra(intent, "market_app_name"), str7);
                        ADInfo adInfo = snsInfo2.getAdInfo(i4);
                        C102239c cVar = new C102239c(str8, str5, adInfo.aid, adInfo.traceid, adInfo.pId);
                        C99552l.m129930f(cVar, 1);
                        if (i6 != 2) {
                            try {
                                C99552l.m129927c(cVar);
                            } catch (Throwable unused3) {
                            }
                        }
                        String str16 = intent.getPackage();
                        str10 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
                        i3 = 2;
                        str9 = "startMarketActivity";
                        str12 = str8;
                        try {
                            C102265s sVar = new C102265s(i6, valueOf, str8, str5, cVar, str14, snsInfo);
                            C95198o2.m121131c(context, str16, "", intent, nullAs, sVar, i6);
                        } catch (Throwable unused4) {
                        }
                    } catch (Throwable unused5) {
                        str9 = "startMarketActivity";
                        str12 = str8;
                        str10 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
                        i3 = 2;
                        str11 = str12;
                        m134859a0(valueOf, str11, str5, i3, "1");
                        str6 = str10;
                        SnsMethodCalculate.markEndTimeMs(str9, str6);
                        C115669n.INSTANCE.mo175911u(1958, 9);
                        SnsMethodCalculate.markEndTimeMs(str15, str6);
                        return true;
                    }
                    str6 = str10;
                    SnsMethodCalculate.markEndTimeMs(str9, str6);
                }
                C115669n.INSTANCE.mo175911u(1958, 9);
            } else {
                m134859a0(String.valueOf(snsInfo2.field_snsId), aDInfo2.uxInfo, str5, 1, "1");
                SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            }
        }
        SnsMethodCalculate.markEndTimeMs(str15, str6);
        return true;
        str9 = "startMarketActivity";
        str11 = str8;
        str10 = "com.tencent.mm.plugin.sns.data.SnsAdUtil";
        i3 = 2;
        m134859a0(valueOf, str11, str5, i3, "1");
        str6 = str10;
        SnsMethodCalculate.markEndTimeMs(str9, str6);
        C115669n.INSTANCE.mo175911u(1958, 9);
        SnsMethodCalculate.markEndTimeMs(str15, str6);
        return true;
    }

    /* renamed from: c */
    public static String m134862c(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        } else if (Util.isNullOrNil(str2)) {
            SnsMethodCalculate.markEndTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        } else {
            String str3 = str2 + str;
            SnsMethodCalculate.markEndTimeMs("appendParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str3;
        }
    }

    /* renamed from: c0 */
    public static long m134863c0(String str) {
        SnsMethodCalculate.markStartTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            if (Util.isNullOrNil(str)) {
                SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return 0;
            } else if (str.startsWith("ad_table_")) {
                long safeParseLong = Util.safeParseLong(str.substring(9));
                SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return safeParseLong;
            } else if (str.startsWith("sns_table_")) {
                long safeParseLong2 = Util.safeParseLong(str.substring(10));
                SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return safeParseLong2;
            } else {
                long B0 = C102236a0.m134706B0(str);
                SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return B0;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", th.toString());
            SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 0;
        }
    }

    /* renamed from: d */
    public static void m134864d(SnsAdClick snsAdClick, C98963o oVar, SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        m134865e(snsAdClick, oVar, snsInfo, i, 0);
        SnsMethodCalculate.markEndTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: e */
    public static void m134865e(SnsAdClick snsAdClick, C98963o oVar, SnsInfo snsInfo, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("appendSnsAdClickParams, snsAdStatistic==null?");
            sb.append(oVar == null);
            sb.append(", clickPos=");
            sb.append(i);
            Log.m105918d("SnsAdUtil", sb.toString());
            long j = 0;
            snsAdClick.f267480r = oVar == null ? 0 : oVar.mo138306m(snsInfo.getLocalid(), i);
            if (oVar != null) {
                j = oVar.mo138305l(snsInfo.field_snsId);
            }
            snsAdClick.f267481s = j;
            snsAdClick.f267482t = i2;
        } catch (Exception e) {
            Log.m105920e("SnsAdUtil", "appendSnsAdClickParams exp=" + e.toString() + ", clockPos=" + i);
        }
        SnsMethodCalculate.markEndTimeMs("appendSnsAdClickParams", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* renamed from: f */
    public static boolean m134866f(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
        try {
            ADXml adXml = snsInfo.getAdXml();
            int i = adXml.isValidJumpCanvas;
            if (i == 1) {
                SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return true;
            } else if (i == 0) {
                SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return false;
            } else {
                boolean z = adXml.isLandingPagesAd() && C100894u.m132239s(snsInfo.getAdSnsInfo().field_adxml);
                if (z) {
                    adXml.isValidJumpCanvas = 1;
                } else {
                    adXml.isValidJumpCanvas = 0;
                }
                SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return z;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", th.toString());
            SnsMethodCalculate.markEndTimeMs("checkCanJumpCanvas", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m134867g(SnsInfo snsInfo, int i) {
        ADInfo.C95009b bVar;
        SnsMethodCalculate.markStartTimeMs("checkCanJumpWeApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        ADInfo atAdInfo = i == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
        if (atAdInfo == null || (bVar = atAdInfo.actionExtWeApp) == null) {
            SnsMethodCalculate.markEndTimeMs("checkCanJumpWeApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        } else if (atAdInfo.adActionType != 4) {
            SnsMethodCalculate.markEndTimeMs("checkCanJumpWeApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        } else if (Util.isNullOrNil(bVar.f275645a)) {
            SnsMethodCalculate.markEndTimeMs("checkCanJumpWeApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("checkCanJumpWeApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m134868h(Context context, SnsInfo snsInfo, ADInfo aDInfo, int i, C98963o oVar) {
        SnsInfo snsInfo2 = snsInfo;
        ADInfo aDInfo2 = aDInfo;
        SnsMethodCalculate.markStartTimeMs("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (!(snsInfo2 == null || aDInfo2 == null)) {
            try {
                ADInfo.C95008a aVar = aDInfo2.actionExtAppJump;
                if (aVar != null) {
                    if (C9512b.m9207a(context, aVar.f275642b) != null) {
                        Log.m105924i("SnsAdUtil", "checkOpenApp isInstalled=true, " + aDInfo2.actionExtAppJump.toString());
                        String str = "";
                        if (snsInfo.getAdXml() != null) {
                            str = snsInfo.getAdXml().adExtInfo;
                        }
                        String str2 = str;
                        C98961m mVar = new C98961m(aDInfo2.aid, aDInfo2.traceid, aDInfo2.pId);
                        ADInfo.C95008a aVar2 = aDInfo2.actionExtAppJump;
                        boolean R = m134849R(context, aVar2.f275641a, aVar2.f275642b, aVar2.f275644d, aVar2.f275643c, aDInfo2.uxInfo, str2, String.valueOf(snsInfo2.field_snsId), 2, 0, mVar);
                        C99552l.m129933i(true, snsInfo2, i);
                        if (R) {
                            SnsMethodCalculate.markEndTimeMs("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                            return true;
                        }
                        Log.m105920e("SnsAdUtil", "checkOpenApp failed, " + aDInfo2.actionExtAppJump.toString());
                        ADInfo.C95008a aVar3 = aDInfo2.actionExtAppJump;
                        C34318c.m40323b(aVar3.f275642b, aVar3.f275643c);
                    } else {
                        Log.m105920e("SnsAdUtil", "checkOpenApp isInstalled=false, " + aDInfo2.actionExtAppJump.toString());
                        ADInfo.C95008a aVar4 = aDInfo2.actionExtAppJump;
                        C34318c.m40323b(aVar4.f275642b, aVar4.f275643c);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAdUtil", "checkOpenApp exp=" + th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return false;
    }

    /* renamed from: i */
    public static String m134869i(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        Log.m105924i("ParamsToLocalId", "clearParamsToLocalId, localIdAppendParams = " + str);
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        } else if (Util.isNullOrNil(str2) || !str.contains(str2)) {
            SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        } else {
            int indexOf = str.indexOf(str2);
            if (indexOf <= -1) {
                SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return str;
            }
            try {
                str = str.substring(0, indexOf) + str.substring(indexOf + str2.length());
            } catch (Exception e) {
                Log.m105920e("ParamsToLocalId", "clearParamsToLocalId, " + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("clearParamsToLocalId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return str;
        }
    }

    /* renamed from: j */
    public static void m134870j(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("convertActivityToTranslucent", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            Log.m105924i("SnsAdUtil", "convertActivityToTranslucent:" + activity);
            if (activity != null) {
                C88990b.m111194c(activity, (C88990b.C61771c) null);
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "convertActivityToTranslucent, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("convertActivityToTranslucent", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m134871k() {
        /*
            java.lang.String r0 = "SnsAdUtil"
            java.lang.String r1 = "disableAllViewHeightInFloatWeb"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x002f }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x002f }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_ad_disable_landing_page_all_top_view_height_android     // Catch:{ all -> 0x002f }
            int r4 = r4.mo58779Qe(r5, r3)     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r5.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "disableAllViewHeightInFloatWeb called"
            r5.append(r6)     // Catch:{ all -> 0x002d }
            r5.append(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x0031
        L_0x002f:
            r5 = move-exception
            r4 = 0
        L_0x0031:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "disableAllViewHeightInFloatWeb, exp="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x0045:
            if (r4 <= 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102260r.m134871k():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m134872l() {
        /*
            java.lang.String r0 = "SnsAdUtil"
            java.lang.String r1 = "disableIpInteractHaptic"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x002f }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x002f }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_ad_ip_interact_comment_haptic_feedback_android     // Catch:{ all -> 0x002f }
            int r4 = r4.mo58779Qe(r5, r3)     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r5.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "disableIpInteractHaptic called"
            r5.append(r6)     // Catch:{ all -> 0x002d }
            r5.append(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x0031
        L_0x002f:
            r5 = move-exception
            r4 = 0
        L_0x0031:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "disableIpInteractHaptic, exp="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x0045:
            if (r4 <= 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102260r.m134872l():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m134873m() {
        /*
            java.lang.String r0 = "SnsAdUtil"
            java.lang.String r1 = "enablePreloadWebView"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x002f }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x002f }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_ad_enable_ad_preload_webview_android     // Catch:{ all -> 0x002f }
            int r4 = r4.mo58779Qe(r5, r3)     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r5.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "enablePreloadWebView called"
            r5.append(r6)     // Catch:{ all -> 0x002d }
            r5.append(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x0031
        L_0x002f:
            r5 = move-exception
            r4 = 0
        L_0x0031:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "enablePreloadWebView, exp="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x0045:
            if (r4 <= 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102260r.m134873m():boolean");
    }

    /* renamed from: n */
    public static int m134874n(int i) {
        SnsMethodCalculate.markStartTimeMs("fromDPToPixOrigin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int round = Math.round(C88494d.m110349f() * ((float) i));
        SnsMethodCalculate.markEndTimeMs("fromDPToPixOrigin", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return round;
    }

    /* renamed from: o */
    public static int m134875o(SnsInfo snsInfo) {
        ADXml adXml;
        SnsMethodCalculate.markStartTimeMs("getAdAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int i = 0;
        if (snsInfo != null) {
            try {
                if (snsInfo.isAd() && (adXml = snsInfo.getAdXml()) != null && !TextUtils.isEmpty(adXml.firstDownloadApkPkgName)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C9512b.m9207a(MMApplicationContext.getContext(), adXml.firstDownloadApkPkgName) != null) {
                        i = 1;
                    }
                    i = i != 0 ? 2 : 1;
                    C115669n.INSTANCE.mo175911u(1893, 12);
                    Log.m105924i("SnsAdUtil", "getAdAppInstallStatus, pkg=" + adXml.firstDownloadApkPkgName + ", installState=" + i + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAdUtil", "appInstalled exp=" + th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("getAdAppInstallStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i;
    }

    /* renamed from: p */
    public static C102238b m134876p(String str) {
        SnsMethodCalculate.markStartTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        C102238b bVar = new C102238b();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("SnsAdUtil", "getAdCommonData: uxInfo is null or nil");
            SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return bVar;
        }
        try {
            String[] split = str.split("\\|");
            if (split.length >= 1) {
                bVar.f301046d = Util.nullAsNil(split[0]);
            }
            if (split.length >= 2) {
                bVar.f301047e = Util.nullAsNil(split[1]);
            }
            if (split.length >= 8) {
                bVar.f301048f = Util.nullAsNil(split[7]);
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "getAdCommonData: exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("getAdCommonData", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return bVar;
    }

    /* renamed from: q */
    public static String m134877q(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getAdExtraInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        StringBuilder sb = new StringBuilder("isChatRoom=");
        if (str2 == null || (!str2.endsWith("@chatroom") && !str2.endsWith("@im.chatroom"))) {
            sb.append("0");
        } else {
            sb.append("1");
        }
        sb.append("&fromUsername=");
        sb.append(str);
        sb.append("&chatName=");
        sb.append(str2);
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("getAdExtraInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return sb4;
    }

    /* renamed from: r */
    public static String m134878r(String str) {
        SnsMethodCalculate.markStartTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("SnsAdUtil", "uxInfo is null");
            SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        String str2 = "<ADInfo>" + "<uxInfo>" + str + "</uxInfo>" + "</ADInfo>";
        SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str2;
    }

    /* renamed from: s */
    public static int m134879s(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getAdUserFollowStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        int i = 1;
        String str = "";
        try {
            String userName = snsInfo.getUserName();
            long currentTimeMillis = System.currentTimeMillis();
            if (snsInfo.isAd() && !TextUtils.isEmpty(userName)) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(userName);
                if (z1Var != null) {
                    if (((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                        i = 2;
                    }
                    str = z1Var.mo62909j3();
                }
            }
            Log.m105924i("SnsAdUtil", "getAdUserFollowStatus, userName=" + userName + ", followStatus=" + i + ", displayName=" + str + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "isContact exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getAdUserFollowStatus", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return i;
    }

    /* renamed from: t */
    public static String m134880t(String str) {
        SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        try {
            String[] split = str.split("\\|");
            if (split.length >= 1) {
                String nullAsNil = Util.nullAsNil(split[0]);
                SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                return nullAsNil;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return "";
    }

    /* renamed from: u */
    public static String m134881u(String str) {
        SnsMethodCalculate.markStartTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        String[] split = str.split("\\|");
        if (split == null || split.length <= 0) {
            SnsMethodCalculate.markEndTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return "";
        }
        String str2 = split[0];
        SnsMethodCalculate.markEndTimeMs("getAidFromUxInfo", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return str2;
    }

    /* renamed from: v */
    public static HashSet<String> m134882v(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        HashSet<String> hashSet = new HashSet<>();
        if (snsObject == null) {
            SnsMethodCalculate.markEndTimeMs("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return hashSet;
        }
        Iterator<w64> it = snsObject.CommentUserList.iterator();
        if (it != null) {
            while (it.hasNext()) {
                hashSet.add(Util.nullAsNil(it.next().f299703d));
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCommentUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet;
    }

    /* renamed from: w */
    public static int m134883w() {
        SnsMethodCalculate.markStartTimeMs("getFontScaleIndex", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        try {
            int i = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("current_text_size_index_key", 1);
            SnsMethodCalculate.markEndTimeMs("getFontScaleIndex", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return i;
        } catch (Throwable th) {
            Log.m105920e("SnsAdUtil", "getFontScaleIndex, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("getFontScaleIndex", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return 1;
        }
    }

    /* renamed from: x */
    public static HashSet<String> m134884x(HashSet<String> hashSet, HashSet<String> hashSet2) {
        SnsMethodCalculate.markStartTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        HashSet<String> hashSet3 = new HashSet<>();
        if (!C101425k.m133097a(hashSet)) {
            hashSet3.addAll(hashSet);
        }
        if (!C101425k.m133097a(hashSet2)) {
            hashSet3.addAll(hashSet2);
        }
        SnsMethodCalculate.markEndTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet3;
    }

    /* renamed from: y */
    public static HashSet<String> m134885y(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        HashSet<String> hashSet = new HashSet<>();
        if (snsObject == null) {
            SnsMethodCalculate.markEndTimeMs("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            return hashSet;
        }
        Iterator<w64> it = snsObject.LikeUserList.iterator();
        if (it != null) {
            while (it.hasNext()) {
                hashSet.add(Util.nullAsNil(it.next().f299703d));
            }
        }
        SnsMethodCalculate.markEndTimeMs("getLikeUsers", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return hashSet;
    }

    /* renamed from: z */
    public static float m134886z(int i) {
        SnsMethodCalculate.markStartTimeMs("getLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        Context context = MMApplicationContext.getContext();
        float f = (float) C76577a.m92155f(context, i);
        SnsMethodCalculate.markStartTimeMs("getLimitedScaleSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        float f2 = C76577a.m92148D(context) ? C76577a.m92160k(context) ? 1.12f : 1.1f : 1.0f;
        SnsMethodCalculate.markEndTimeMs("getLimitedScaleSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        float f3 = f * f2;
        SnsMethodCalculate.markEndTimeMs("getLimitedScaleFontSize", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        return f3;
    }
}
