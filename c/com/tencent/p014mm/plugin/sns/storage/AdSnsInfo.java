package com.tencent.p014mm.plugin.sns.storage;

import ad0.C91999u;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import os2.C100417r0;
import p749xh.C102646h;
import p823sg.C90193h;
import pe3.C89349b;
import te3.C101789j00;
import te3.C50903q2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdSnsInfo */
public class AdSnsInfo extends C102646h {
    public static final String COL_ID = "rowid";
    public static final String TABLEINDEXHEAD = "serverAdSnsTimeHeadIndex";
    public static final String TABLEINDEXLOCALFLAG = "AdsnsLocalflagIndex";
    public static final String TABLEINDEXMULTI1 = "adsnsMultiIndex1";
    public static final String TABLEINDEXMULTI2 = "adsnsMultiIndex2";
    public static final String TABLEINDEXSOURCE = "serverAdSnsTimeSourceTypeIndex";
    public static final String TABLEINDEXTIME = "serverAdSnsTimeIndex";
    public static final String TABLEINDEXUSERNAME = "serverAdSnsNameIndex";
    public static final String TAG = "MicroMsg.AdSnsInfo";
    public static Map<String, ADInfo> cacheAdInfo = new ConcurrentHashMap();
    public static Map<String, ADXml> cacheAdXml = new ConcurrentHashMap();
    public static IAutoDBItem.MAutoDBInfo info = C102646h.initAutoDBInfo(AdSnsInfo.class);
    public String contentByteMd5 = null;
    public int localid;

    public static ADXml getADXmlCache(String str) {
        SnsMethodCalculate.markStartTimeMs("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (Util.isNullOrNil(str) || !cacheAdXml.containsKey(str)) {
            SnsMethodCalculate.markEndTimeMs("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        ADXml aDXml = cacheAdXml.get(str);
        SnsMethodCalculate.markEndTimeMs("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDXml;
    }

    public void addSourceFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_sourceType = i | this.field_sourceType;
        SnsMethodCalculate.markEndTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void convertFrom(Cursor cursor) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        super.convertFrom(cursor);
        this.localid = (int) this.systemRowid;
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public SnsInfo convertToSnsInfo() {
        SnsMethodCalculate.markStartTimeMs("convertToSnsInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        SnsInfo snsInfo = new SnsInfo();
        snsInfo.setTimeLine(getTimeLine());
        Log.m105919d(TAG, "from server xml ok %d", Long.valueOf(this.field_snsId));
        snsInfo.setLocalid(this.localid);
        snsInfo.setUserName(this.field_userName);
        snsInfo.setCreateTime(this.field_createTime);
        snsInfo.setLikeFlag(this.field_likeFlag);
        snsInfo.setSnsId(this.field_snsId);
        snsInfo.field_sourceType = this.field_sourceType;
        snsInfo.field_content = this.field_content;
        snsInfo.addSourceFlag(2);
        snsInfo.addSourceFlag(32);
        snsInfo.field_attrBuf = this.field_attrBuf;
        TimeLineObject timeLine = snsInfo.getTimeLine();
        timeLine.UserName = this.field_userName;
        snsInfo.setPravited(timeLine.Privated);
        snsInfo.setExtFlag();
        snsInfo.setTimeLine(timeLine);
        C101789j00 j002 = timeLine.ContentObj;
        if (j002 != null) {
            snsInfo.setTypeFlag(j002.f298424e);
            snsInfo.setSubTypeFlag(timeLine.ContentObj.f298428i);
        }
        snsInfo.setAdSnsInfo(this);
        SnsMethodCalculate.markEndTimeMs("convertToSnsInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return snsInfo;
    }

    public ADInfo getAdInfo() {
        ADInfo aDInfo;
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        String str = this.field_adinfo;
        if (str == null) {
            aDInfo = null;
        } else if (cacheAdInfo.containsKey(str)) {
            ADInfo aDInfo2 = cacheAdInfo.get(this.field_adinfo);
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return aDInfo2;
        } else {
            aDInfo = new ADInfo(this.field_adinfo);
            cacheAdInfo.put(this.field_adinfo, aDInfo);
        }
        if (aDInfo == null) {
            aDInfo = new ADInfo((String) null);
        }
        SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDInfo;
    }

    public ADXml getAdXml() {
        ADXml aDXml;
        SnsMethodCalculate.markStartTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        String str = this.field_adxml;
        if (str == null) {
            aDXml = null;
        } else if (cacheAdXml.containsKey(str)) {
            ADXml aDXml2 = cacheAdXml.get(this.field_adxml);
            SnsMethodCalculate.markEndTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return aDXml2;
        } else {
            aDXml = new ADXml(this.field_adxml);
            cacheAdXml.put(this.field_adxml, aDXml);
        }
        if (aDXml == null) {
            aDXml = new ADXml((String) null);
        }
        SnsMethodCalculate.markEndTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDXml;
    }

    public ADInfo getAtAdInfo() {
        ADInfo aDInfo;
        SnsMethodCalculate.markStartTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        String str = this.field_atAdinfo;
        if (str == null) {
            aDInfo = null;
        } else if (cacheAdInfo.containsKey(str)) {
            ADInfo aDInfo2 = cacheAdInfo.get(this.field_atAdinfo);
            SnsMethodCalculate.markEndTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return aDInfo2;
        } else {
            aDInfo = new ADInfo(this.field_atAdinfo);
            cacheAdInfo.put(this.field_atAdinfo, aDInfo);
        }
        if (aDInfo == null) {
            aDInfo = new ADInfo((String) null);
        }
        SnsMethodCalculate.markEndTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDInfo;
    }

    public C89349b getAtFriendRemindInfoSelfInfo() {
        SnsMethodCalculate.markStartTimeMs("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f140096e == null || getRemindInfoGroup().f140096e.f145467f == null) {
            SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        C89349b bVar = getRemindInfoGroup().f140096e.f145467f.f140574f;
        SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return bVar;
    }

    public C89349b getAtFriendRemindInfoSourceInfo() {
        SnsMethodCalculate.markStartTimeMs("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f140096e == null || getRemindInfoGroup().f140096e.f145466e == null) {
            SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        C89349b bVar = getRemindInfoGroup().f140096e.f145466e.f140574f;
        SnsMethodCalculate.markEndTimeMs("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return bVar;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = info;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return mAutoDBInfo;
    }

    public int getExpId() {
        SnsMethodCalculate.markStartTimeMs("getExpId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        ADXml recXml = getRecXml();
        int i = recXml == null ? 0 : recXml.recExpId;
        SnsMethodCalculate.markEndTimeMs("getExpId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i;
    }

    public String getLocalid() {
        SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        String i = C100417r0.m131420i("ad_table_", (long) this.localid);
        SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i;
    }

    public int getRecSrc() {
        SnsMethodCalculate.markStartTimeMs("getRecSrc", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        ADXml recXml = getRecXml();
        int i = recXml == null ? 0 : recXml.recSrc;
        SnsMethodCalculate.markEndTimeMs("getRecSrc", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i;
    }

    public ADXml getRecXml() {
        ADXml aDXml;
        SnsMethodCalculate.markStartTimeMs("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        String str = this.field_recxml;
        if (str == null) {
            aDXml = null;
        } else if (cacheAdXml.containsKey(str)) {
            ADXml aDXml2 = cacheAdXml.get(this.field_recxml);
            SnsMethodCalculate.markEndTimeMs("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return aDXml2;
        } else {
            aDXml = new ADXml(this.field_recxml);
            cacheAdXml.put(this.field_recxml, aDXml);
        }
        if (aDXml == null) {
            aDXml = new ADXml((String) null);
        }
        SnsMethodCalculate.markEndTimeMs("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return aDXml;
    }

    public C50903q2 getRemindInfoGroup() {
        C50903q2 q2Var;
        Exception e;
        SnsMethodCalculate.markStartTimeMs("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        C50903q2 q2Var2 = null;
        try {
            if (this.field_remindInfoGroup != null) {
                q2Var = new C50903q2();
                try {
                    q2Var.parseFrom(this.field_remindInfoGroup);
                } catch (Exception e2) {
                    e = e2;
                }
                q2Var2 = q2Var;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            q2Var = null;
            e = exc;
            Log.m105920e(TAG, "parse remindInfo error! " + e.getMessage());
            q2Var2 = q2Var;
            SnsMethodCalculate.markEndTimeMs("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return q2Var2;
        }
        SnsMethodCalculate.markEndTimeMs("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return q2Var2;
    }

    public String getSnsId() {
        SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        String j = C100417r0.m131421j("ad_table_", this.field_snsId);
        SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return j;
    }

    public int getSource() {
        SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        ADXml recXml = getRecXml();
        int i = recXml == null ? 0 : recXml.recSrc;
        SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i;
    }

    public TimeLineObject getTimeLine() {
        TimeLineObject timeLineObject;
        SnsMethodCalculate.markStartTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (this.field_content == null) {
            TimeLineObject i = C91999u.m115563i();
            SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return i;
        }
        if (this.contentByteMd5 == null) {
            this.contentByteMd5 = C90193h.m112878f(this.field_content) + C90193h.m112878f(this.field_attrBuf);
        }
        if (!SnsInfo.cacheTimeLine.containsKey(this.contentByteMd5) || (timeLineObject = SnsInfo.cacheTimeLine.get(this.contentByteMd5)) == null || timeLineObject.ContentObj == null) {
            try {
                TimeLineObject timeLineObject2 = (TimeLineObject) new TimeLineObject().parseFrom(this.field_content);
                if (timeLineObject2 == null) {
                    Log.m105920e(TAG, "error timeLineObj is null! snsid = " + getSnsId());
                    TimeLineObject i2 = C91999u.m115563i();
                    SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                    return i2;
                } else if (timeLineObject2.ContentObj == null) {
                    Log.m105920e(TAG, "error timeLineObj.ContentObj is null!  snsid = " + getSnsId());
                    TimeLineObject i3 = C91999u.m115563i();
                    SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                    return i3;
                } else {
                    SnsInfo.cacheTimeLine.put(this.contentByteMd5, timeLineObject2);
                    SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                    return timeLineObject2;
                }
            } catch (Exception unused) {
                Log.m105920e(TAG, "error get snsinfo timeline!");
                TimeLineObject i4 = C91999u.m115563i();
                SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return i4;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return timeLineObject;
        }
    }

    public C89349b getTimelineRemindInfoSelfInfo() {
        SnsMethodCalculate.markStartTimeMs("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f140095d == null || getRemindInfoGroup().f140095d.f145467f == null) {
            SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        C89349b bVar = getRemindInfoGroup().f140095d.f145467f.f140574f;
        SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return bVar;
    }

    public C89349b getTimelineRemindInfoSourceInfo() {
        SnsMethodCalculate.markStartTimeMs("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (getRemindInfoGroup() == null || getRemindInfoGroup().f140095d == null || getRemindInfoGroup().f140095d.f145466e == null) {
            SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        C89349b bVar = getRemindInfoGroup().f140095d.f145466e.f140574f;
        SnsMethodCalculate.markEndTimeMs("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return bVar;
    }

    public boolean isExposured() {
        SnsMethodCalculate.markStartTimeMs("isExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z = (this.field_localFlag & 128) > 0;
        SnsMethodCalculate.markEndTimeMs("isExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z;
    }

    public boolean isLocalInvisible() {
        SnsMethodCalculate.markStartTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z = (this.field_localFlag & 256) > 0;
        SnsMethodCalculate.markEndTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z;
    }

    public boolean isRecExpAd() {
        SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        ADXml adXml = getAdXml();
        if (adXml != null) {
            boolean isRecExpAd = adXml.isRecExpAd();
            SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return isRecExpAd;
        }
        SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return false;
    }

    public boolean isSourceExist(int i) {
        SnsMethodCalculate.markStartTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z = (i & this.field_sourceType) > 0;
        SnsMethodCalculate.markEndTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z;
    }

    public void readFromBundle(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (bundle == null) {
            SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return;
        }
        convertFrom((ContentValues) bundle.getParcelable("values"));
        this.localid = bundle.getInt("localid");
        SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void removeSourceFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_sourceType = (~i) & this.field_sourceType;
        SnsMethodCalculate.markEndTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setAttrBuf(byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_attrBuf = bArr;
        this.contentByteMd5 = C90193h.m112878f(this.field_content) + C90193h.m112878f(this.field_attrBuf);
        SnsMethodCalculate.markEndTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public boolean setContent(String str) {
        SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.field_content = C91999u.m115571q(str).toByteArray();
            this.contentByteMd5 = C90193h.m112878f(this.field_content) + C90193h.m112878f(this.field_attrBuf);
            SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return false;
        }
    }

    public void setExposures() {
        SnsMethodCalculate.markStartTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag |= 128;
        SnsMethodCalculate.markEndTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setLocalInvisible() {
        SnsMethodCalculate.markStartTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag |= 256;
        SnsMethodCalculate.markEndTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setLocalVisible() {
        SnsMethodCalculate.markStartTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag &= -257;
        SnsMethodCalculate.markEndTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setNotExposured() {
        SnsMethodCalculate.markStartTimeMs("setNotExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_localFlag &= -129;
        SnsMethodCalculate.markEndTimeMs("setNotExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setRemindInfoGroup(C50903q2 q2Var) {
        SnsMethodCalculate.markStartTimeMs("setRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.field_remindInfoGroup = q2Var.toByteArray();
        } catch (Exception e) {
            Log.m105920e(TAG, "remindInfo toBytes error! " + e.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("setRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setSnsId(long j) {
        SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_snsId = j;
        if (j != 0) {
            setStringSeq(j);
        }
        SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setStringSeq(long j) {
        SnsMethodCalculate.markStartTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        String q0 = C102236a0.m134765q0(j);
        this.field_stringSeq = q0;
        this.field_stringSeq = C102236a0.m134705B(q0);
        Log.m105918d(TAG, j + " stringSeq " + this.field_stringSeq);
        SnsMethodCalculate.markEndTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public void setTimeLine(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.field_content = timeLineObject.toByteArray();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    public Bundle writeToBundle() {
        SnsMethodCalculate.markStartTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        Bundle bundle = new Bundle();
        bundle.putParcelable("values", super.convertTo());
        bundle.putInt("localid", this.localid);
        SnsMethodCalculate.markEndTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return bundle;
    }

    public ContentValues convertFrom(ContentValues contentValues) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.field_snsId = contentValues.getAsLong("snsId").longValue();
        this.field_userName = contentValues.getAsString("userName");
        this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
        this.field_createTime = contentValues.getAsInteger("createTime").intValue();
        this.field_head = contentValues.getAsInteger("head").intValue();
        this.field_localPrivate = contentValues.getAsInteger("localPrivate").intValue();
        this.field_type = contentValues.getAsInteger("type").intValue();
        this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
        this.field_likeFlag = contentValues.getAsInteger("likeFlag").intValue();
        this.field_pravited = contentValues.getAsInteger("pravited").intValue();
        this.field_stringSeq = contentValues.getAsString("stringSeq");
        this.field_content = contentValues.getAsByteArray("content");
        this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
        this.field_postBuf = contentValues.getAsByteArray("postBuf");
        this.field_adinfo = contentValues.getAsString(C102646h.COL_ADINFO);
        this.field_adxml = contentValues.getAsString(C102646h.COL_ADXML);
        this.field_createAdTime = contentValues.getAsInteger(C102646h.COL_CREATEADTIME).intValue();
        this.field_exposureTime = contentValues.getAsInteger(C102646h.COL_EXPOSURETIME).intValue();
        this.field_firstControlTime = contentValues.getAsInteger(C102646h.COL_FIRSTCONTROLTIME).intValue();
        this.field_recxml = contentValues.getAsString(C102646h.COL_RECXML);
        this.field_subType = contentValues.getAsInteger("subType").intValue();
        this.systemRowid = contentValues.getAsLong("rowid").longValue();
        this.field_atAdinfo = contentValues.getAsString(C102646h.COL_ATADINFO);
        this.field_remindInfoGroup = contentValues.getAsByteArray(C102646h.COL_REMINDINFOGROUP);
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return contentValues;
    }
}
