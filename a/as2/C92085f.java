package as2;

import ad0.C91999u;
import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C94833a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86497v5;
import java.math.BigInteger;
import java.util.LinkedList;
import jq2.C98993j;
import jq2.C98995n;
import jq2.C99001u;
import lo2.C99569s;
import ob0.C35136m;
import os2.C100400e0;
import p749xh.C102646h;
import p749xh.C102661q8;
import ps2.C100897v;
import sf0.C48374j0;
import te3.C101804kv2;
import te3.C48952c4;
import te3.C51163rv3;
import te3.C51573un3;
import te3.C77949j3;
import te3.g84;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: as2.f */
public class C92085f implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
        SnsMethodCalculate.markStartTimeMs("onDeleteMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        SnsMethodCalculate.markEndTimeMs("onDeleteMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        C77949j3 j3Var;
        C51163rv3 rv32;
        String str;
        String str2;
        TimeLineObject timeLineObject;
        String str3;
        String str4;
        int i;
        C35136m.C35137a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        if (aVar2 == null || (j3Var = aVar2.f94242a) == null || (rv32 = j3Var.f227631h) == null) {
            Log.m105924i("MicroMsg.SimpleExperimentLsn", "recv null msg");
            SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        String g = C48374j0.m53718g(rv32);
        Log.m105918d("MicroMsg.SimpleExperimentLsn", "recv addMsg " + g);
        String d = mo126068d(g, "<TimelineObject", "</TimelineObject>");
        if (Util.isNullOrNil(d)) {
            Log.m105924i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  timelineObj tag");
            SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        String d2 = mo126068d(g, "<RecXml", "</RecXml>");
        if (Util.isNullOrNil(d2)) {
            Log.m105924i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  RecXml tag");
            SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        String d3 = mo126068d(g, "<ADInfo", "</ADInfo>");
        if (Util.isNullOrNil(d3)) {
            Log.m105924i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  ADInfo tag");
            SnsMethodCalculate.markEndTimeMs("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        TimeLineObject q = C91999u.m115571q(d);
        C51573un3 un32 = new C51573un3();
        un32.f142967e = C48374j0.m53720i(d3);
        g84 g84 = new g84();
        un32.f142966d = g84;
        g84.f133931e = C48374j0.m53720i(d2);
        SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        SnsObject snsObject = new SnsObject();
        snsObject.f283891Id = new BigInteger(q.f283893Id).longValue();
        snsObject.CreateTime = q.CreateTime;
        snsObject.Username = q.UserName;
        snsObject.ObjectDesc = C48374j0.m53712a(d.getBytes());
        SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        g84.f133930d = snsObject;
        Object obj = C94833a.f274740a;
        SnsMethodCalculate.markStartTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        C48952c4 c = C94833a.m120150c(un32);
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            str4 = "onRecieveMsg";
            str3 = "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn";
            str2 = "MicroMsg.SimpleExperimentLsn";
            str = d3;
            timeLineObject = q;
        } else {
            ADInfo aDInfo = new ADInfo(C48374j0.m53718g(c.f131490e));
            C99569s.m129965g(aDInfo.adIPv4Url);
            int i2 = aDInfo.ad_sns_pos;
            int i3 = i2 <= 0 ? 1 : i2 + 1;
            int CZ = C94866e1.Yx0().mo139797CZ("");
            Log.m105925i("MicroMsg.AdSnsInfoStorageLogic", "ad.pos = %d, dbLimit = %d, createTime.limit = %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(CZ));
            C100400e0 Yx0 = C94866e1.Yx0();
            Yx0.getClass();
            str4 = "onRecieveMsg";
            SnsMethodCalculate.markStartTimeMs("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            str3 = "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn";
            StringBuilder sb = new StringBuilder();
            timeLineObject = q;
            sb.append(C100400e0.f294095n);
            sb.append(" from ");
            str2 = "MicroMsg.SimpleExperimentLsn";
            sb.append(C102661q8.TABLE_NAME);
            sb.append(" where ");
            String sb4 = sb.toString();
            str = d3;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            C100400e0.m131327CP();
            sb5.append(" (sourceType & 2 != 0 ) ");
            String sb6 = sb5.toString();
            if (Yx0.zs0("")) {
                sb6 = sb6 + " AND " + Yx0.mo139827nP("");
            }
            String str5 = ((((sb6 + " AND createTime >= " + CZ) + " UNION ") + C100400e0.f294095n + " from " + C102646h.TABLE_NAME + " where " + "createTime" + " > " + CZ + " and " + C100400e0.f294107z) + C100400e0.f294096o) + " limit " + i3;
            Log.m105918d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + str5 + " limtiSeq: " + "");
            Cursor rawQuery = Yx0.f294108d.rawQuery(str5, (String[]) null);
            SnsMethodCalculate.markEndTimeMs("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            if (rawQuery == null || rawQuery.getCount() <= 0) {
                Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "db return nothing");
                i = (int) Util.nowSecond();
            } else {
                Log.m105925i("MicroMsg.AdSnsInfoStorageLogic", "db return %d feeds", Integer.valueOf(rawQuery.getCount()));
                SnsInfo snsInfo = new SnsInfo();
                if (i2 < 0) {
                    i2 = 0;
                }
                if (rawQuery.moveToPosition(i2)) {
                    snsInfo.convertFrom(rawQuery);
                } else {
                    rawQuery.moveToLast();
                    snsInfo.convertFrom(rawQuery);
                }
                i = snsInfo.getCreateTime() + 1;
            }
            rawQuery.close();
            Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "inserting snsid  " + c.f131489d.f134464d.f283891Id + " ,createTime " + i);
            C94833a.m120162o(c, i, (int) Util.nowSecond());
            C94833a.m120168u(c.f131489d.f134464d.f283891Id, aDInfo);
            try {
                String q0 = C102236a0.m134765q0(c.f131489d.f134464d.f283891Id);
                if (!C98995n.m128906b(aDInfo, q0)) {
                    C98995n.m128907c(1, q0, aDInfo, c.f131489d.f134464d);
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", th.toString());
            }
            C100897v.m132253b(c, true);
            try {
                SnsInfo convertToSnsInfo = C94866e1.zx0().mo139864jo(c.f131489d.f134464d.f283891Id).convertToSnsInfo();
                if (C98993j.m128899a(convertToSnsInfo)) {
                    Log.m105924i("MicroMsg.AdSnsInfoStorageLogic", "adVideoPreload, preload test timeline online video, snsId=" + C102236a0.m134765q0(c.f131489d.f134464d.f283891Id));
                    C94866e1.hy0().mo131026l(convertToSnsInfo);
                    C94866e1.hy0().mo131035u();
                }
            } catch (Throwable th4) {
                Log.m105920e("MicroMsg.AdSnsInfoStorageLogic", "adVideoPreload, preload test timeline online video,  exp=" + th4.toString());
            }
            SnsMethodCalculate.markEndTimeMs("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        }
        boolean J = C102260r.m134841J(d2);
        ADXml aDXml = new ADXml(d2);
        ADInfo aDInfo2 = new ADInfo(str);
        String str6 = str2;
        Log.m105924i(str6, "isUsePreferedInfo=" + J + ", adXml.usePreferedInfo" + aDXml.usePreferedInfo);
        TimeLineObject timeLineObject2 = timeLineObject;
        try {
            LinkedList<C101804kv2> linkedList = timeLineObject2.ContentObj.f298427h;
            if (linkedList != null && linkedList.size() > 0) {
                timeLineObject2.ContentObj.f298427h.get(0).f298681N = true;
            }
        } catch (Exception e) {
            Log.m105924i(str6, "onRecieveMsg, exp=" + e.toString());
        }
        C99001u.m128917c(timeLineObject2, aDXml, aDInfo2, 2);
        SnsMethodCalculate.markEndTimeMs(str4, str3);
    }

    /* renamed from: d */
    public final String mo126068d(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
            SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return "";
        }
        int indexOf = str.indexOf(str2);
        int indexOf2 = indexOf >= 0 ? str.indexOf(str3) : -1;
        if (indexOf < 0 || indexOf2 <= indexOf) {
            SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return "";
        }
        String substring = str.substring(indexOf, indexOf2 + str3.length());
        SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        return substring;
    }
}
