package jp2;

import ad0.C0033t;
import com.tencent.p014mm.modelstat.C92859v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.LinkedList;
import jr2.C99016j;
import te3.C101804kv2;
import te3.sc4;

/* renamed from: jp2.w */
public class C98977w {

    /* renamed from: jp2.w$a */
    public enum C98978a {
        PlayIcon(1),
        EnterFullScreen(2),
        EnterCompleteVideo(3),
        DetailInVideo(4),
        LeavelFullScreen(5),
        LeaveCompleteVideo(6),
        DetailTimeline(8);
        

        /* renamed from: d */
        public int f290210d;

        /* access modifiers changed from: public */
        C98978a(int i) {
            this.f290210d = i;
        }
    }

    /* renamed from: jp2.w$b */
    public enum C98979b {
        Sight(1),
        AdUrl(2);
        

        /* renamed from: d */
        public int f290214d;

        /* access modifiers changed from: public */
        C98979b(int i) {
            this.f290214d = i;
        }
    }

    /* renamed from: jp2.w$c */
    public enum C98980c {
        Fav(1),
        Chat(2),
        Chatroom(3),
        Sns(4);
        

        /* renamed from: d */
        public int f290220d;

        /* access modifiers changed from: public */
        C98980c(int i) {
            this.f290220d = i;
        }
    }

    /* renamed from: jp2.w$d */
    public enum C98981d {
        Sight(1),
        AdUrl(2);
        

        /* renamed from: d */
        public int f290224d;

        /* access modifiers changed from: public */
        C98981d(int i) {
            this.f290224d = i;
        }
    }

    /* renamed from: jp2.w$e */
    public enum C98982e {
        Samll(1),
        Full(2);
        

        /* renamed from: d */
        public int f290228d;

        /* access modifiers changed from: public */
        C98982e(int i) {
            this.f290228d = i;
        }
    }

    /* renamed from: a */
    public static void m128885a(C98979b bVar, C98978a aVar, SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        TimeLineObject timeLine = snsInfo.getTimeLine();
        LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
        if (linkedList != null && !linkedList.isEmpty() && ((timeLine.ContentObj.f298424e == 15 && snsInfo.isAd()) || timeLine.ContentObj.f298424e == 18)) {
            C101804kv2 kv22 = linkedList.get(0);
            int i2 = 2;
            if (snsInfo.isAd() && timeLine.ContentObj.f298424e == 15) {
                ADInfo atAdInfo = i == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
                if (atAdInfo != null) {
                    timeLine.streamvideo.f299431j = atAdInfo.uxInfo;
                }
                timeLine.streamvideo.f299432n = timeLine.f283893Id;
            }
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", timeLine.streamvideo.f299432n + ",");
            tVar.mo32a("21uxinfo", timeLine.streamvideo.f299431j + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            tVar.mo32a("23video_statu", ",");
            StringBuilder sb = new StringBuilder();
            if (timeLine.ContentObj.f298424e == 15) {
                i2 = 1;
            }
            sb.append(i2);
            sb.append(",");
            tVar.mo32a("24source_type", sb.toString());
            tVar.mo32a("25scene", bVar.f290214d + ",");
            StringBuilder sb4 = new StringBuilder();
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
            int i3 = aVar.f290210d;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
            sb4.append(i3);
            sb4.append(",");
            tVar.mo32a("26action_type", sb4.toString());
            tVar.mo32a("27scene_chatname", ",");
            tVar.mo32a("28scene_username", timeLine.UserName + ",");
            tVar.mo32a("29curr_publishid", timeLine.f283893Id + ",");
            tVar.mo32a("30curr_msgid", "0,");
            tVar.mo32a("31curr_favid", "0,");
            tVar.mo32a("32elapsed_time", "0,");
            tVar.mo32a("33load_time", "0,");
            tVar.mo32a("34is_load_complete", "0,");
            tVar.mo32a("35destination", "0,");
            tVar.mo32a("36chatroom_membercount", "0,");
            C92859v.m117123a(timeLine.statExtStr, tVar);
            Log.m105924i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + tVar.mo34c());
            ((C99016j) C86312j.m106911c(C99016j.class)).mo55731h(12990, tVar);
        }
        SnsMethodCalculate.markEndTimeMs("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    /* renamed from: b */
    public static void m128886b(C98978a aVar, String str, String str2, int i, int i2, String str3, String str4, String str5, long j, int i3, int i4) {
        String str6 = str5;
        SnsMethodCalculate.markStartTimeMs("actionReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        C0033t tVar = new C0033t();
        StringBuilder sb = new StringBuilder();
        String str7 = str;
        sb.append(str);
        sb.append(",");
        tVar.mo32a("20source_publishid", sb.toString());
        StringBuilder sb4 = new StringBuilder();
        String str8 = str2;
        sb4.append(str2);
        sb4.append(",");
        tVar.mo32a("21uxinfo", sb4.toString());
        tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
        tVar.mo32a("23video_statu", ",");
        StringBuilder sb5 = new StringBuilder();
        int i5 = i;
        sb5.append(i);
        sb5.append(",");
        tVar.mo32a("24source_type", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        int i6 = i2;
        sb6.append(i2);
        sb6.append(",");
        tVar.mo32a("25scene", sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        int i7 = aVar.f290210d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        sb7.append(i7);
        sb7.append(",");
        tVar.mo32a("26action_type", sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        String str9 = str4;
        sb8.append(str4);
        sb8.append(",");
        tVar.mo32a("27scene_chatname", sb8.toString());
        StringBuilder sb9 = new StringBuilder();
        String str10 = str3;
        sb9.append(str3);
        sb9.append(",");
        tVar.mo32a("28scene_username", sb9.toString());
        tVar.mo32a("29curr_publishid", str6 + ",");
        tVar.mo32a("30curr_msgid", j + ",");
        tVar.mo32a("31curr_favid", i3 + ",");
        tVar.mo32a("32elapsed_time", "0,");
        tVar.mo32a("33load_time", "0,");
        tVar.mo32a("34is_load_complete", "0,");
        tVar.mo32a("35destination", "0,");
        tVar.mo32a("36chatroom_membercount", i4 + ",");
        C98962n.m128838c(str6, tVar);
        Log.m105924i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + tVar.mo34c());
        C115669n.INSTANCE.mo160131h(12990, tVar);
        SnsMethodCalculate.markEndTimeMs("actionReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    /* renamed from: c */
    public static void m128887c(SnsInfo snsInfo, boolean z, boolean z2, int i) {
        SnsMethodCalculate.markStartTimeMs("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        TimeLineObject timeLine = snsInfo.getTimeLine();
        LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
        if (linkedList != null && !linkedList.isEmpty() && ((timeLine.ContentObj.f298424e == 15 && snsInfo.isAd()) || timeLine.ContentObj.f298424e == 18)) {
            C101804kv2 kv22 = linkedList.get(0);
            int i2 = 2;
            if (snsInfo.isAd() && timeLine.ContentObj.f298424e == 15) {
                ADInfo atAdInfo = i == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
                sc4 sc4 = timeLine.streamvideo;
                sc4.f299431j = atAdInfo.uxInfo;
                sc4.f299432n = timeLine.f283893Id;
            }
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", timeLine.streamvideo.f299432n + ",");
            tVar.mo32a("21uxinfo", timeLine.streamvideo.f299431j + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            StringBuilder sb = new StringBuilder();
            sb.append(timeLine.ContentObj.f298424e == 15 ? 1 : 2);
            sb.append(",");
            tVar.mo32a("23souce_type", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            if (z) {
                i2 = 6;
            } else if (timeLine.ContentObj.f298424e == 15) {
                i2 = 1;
            }
            sb4.append(i2);
            sb4.append(",");
            tVar.mo32a("24scene", sb4.toString());
            tVar.mo32a("25scene_chatname", ",");
            tVar.mo32a("26scene_username", timeLine.UserName + ",");
            tVar.mo32a("27curr_publishid", timeLine.f283893Id + ",");
            tVar.mo32a("28curr_msgid", ",");
            tVar.mo32a("29curr_favid", "0,");
            tVar.mo32a("30isdownload", (z2 ? 1 : 0) + ",");
            tVar.mo32a("31chatroom_membercount", "0,");
            C92859v.m117123a(timeLine.statExtStr, tVar);
            Log.m105924i("MicroMsg.SnsVideoStatistic", "report snsad_video_exposure: " + tVar.mo34c());
            C115669n.INSTANCE.mo160131h(12989, tVar);
        }
        SnsMethodCalculate.markEndTimeMs("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    /* renamed from: d */
    public static void m128888d(C98981d dVar, C98980c cVar, C98982e eVar, int i, SnsInfo snsInfo, int i2) {
        SnsMethodCalculate.markStartTimeMs("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        TimeLineObject timeLine = snsInfo.getTimeLine();
        LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
        if (linkedList != null && !linkedList.isEmpty() && ((timeLine.ContentObj.f298424e == 15 && snsInfo.isAd()) || timeLine.ContentObj.f298424e == 18)) {
            C101804kv2 kv22 = linkedList.get(0);
            int i3 = 2;
            if (snsInfo.isAd() && timeLine.ContentObj.f298424e == 15) {
                if ((i2 == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo()) != null) {
                    timeLine.streamvideo.f299431j = snsInfo.getAdInfo().uxInfo;
                }
                timeLine.streamvideo.f299432n = timeLine.f283893Id;
            }
            C0033t tVar = new C0033t();
            tVar.mo32a("20source_publishid", timeLine.streamvideo.f299432n + ",");
            tVar.mo32a("21uxinfo", timeLine.streamvideo.f299431j + ",");
            tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
            StringBuilder sb = new StringBuilder();
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
            int i4 = eVar.f290228d;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
            sb.append(i4);
            sb.append(",");
            tVar.mo32a("23video_statu", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            if (timeLine.ContentObj.f298424e == 15) {
                i3 = 1;
            }
            sb4.append(i3);
            sb4.append(",");
            tVar.mo32a("24source_type", sb4.toString());
            tVar.mo32a("25scene", dVar.f290224d + ",");
            tVar.mo32a("26action_type", cVar.f290220d + ",");
            tVar.mo32a("27scene_chatname", ",");
            tVar.mo32a("28scene_username", timeLine.UserName + ",");
            tVar.mo32a("29curr_publishid", timeLine.f283893Id + ",");
            tVar.mo32a("30curr_msgid", "0,");
            tVar.mo32a("31curr_favid", "0,");
            tVar.mo32a("32chatroom_membercount", "0,");
            tVar.mo32a("33chatroom_toMemberCount", i + ",");
            C92859v.m117123a(timeLine.statExtStr, tVar);
            Log.m105924i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + tVar.mo34c());
            C115669n.INSTANCE.mo160131h(12991, tVar);
        }
        SnsMethodCalculate.markEndTimeMs("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    /* renamed from: e */
    public static void m128889e(C98980c cVar, String str, String str2, int i, int i2, String str3, String str4, String str5, long j, int i3, int i4, int i5) {
        String str6 = str5;
        SnsMethodCalculate.markStartTimeMs("spreadReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        C0033t tVar = new C0033t();
        StringBuilder sb = new StringBuilder();
        String str7 = str;
        sb.append(str);
        sb.append(",");
        tVar.mo32a("20source_publishid", sb.toString());
        StringBuilder sb4 = new StringBuilder();
        String str8 = str2;
        sb4.append(str2);
        sb4.append(",");
        tVar.mo32a("21uxinfo", sb4.toString());
        tVar.mo32a("22clienttime", Util.nowMilliSecond() + ",");
        tVar.mo32a("23video_statu", "3,");
        StringBuilder sb5 = new StringBuilder();
        int i6 = i;
        sb5.append(i);
        sb5.append(",");
        tVar.mo32a("24source_type", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        int i7 = i2;
        sb6.append(i2);
        sb6.append(",");
        tVar.mo32a("25scene", sb6.toString());
        tVar.mo32a("26action_type", cVar.f290220d + ",");
        StringBuilder sb7 = new StringBuilder();
        String str9 = str4;
        sb7.append(str4);
        sb7.append(",");
        tVar.mo32a("27scene_chatname", sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        String str10 = str3;
        sb8.append(str3);
        sb8.append(",");
        tVar.mo32a("28scene_username", sb8.toString());
        tVar.mo32a("29curr_publishid", str5 + ",");
        tVar.mo32a("30curr_msgid", j + ",");
        tVar.mo32a("31curr_favid", i3 + ",");
        tVar.mo32a("32chatroom_membercount", i4 + ",");
        tVar.mo32a("33chatroom_toMemberCount", i5 + ",");
        Log.m105924i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + tVar.mo34c());
        C98962n.m128838c(str5, tVar);
        C115669n.INSTANCE.mo160131h(12991, tVar);
        SnsMethodCalculate.markEndTimeMs("spreadReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }
}
