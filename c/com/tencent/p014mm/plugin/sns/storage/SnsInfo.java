package com.tencent.p014mm.plugin.sns.storage;

import ad0.C91999u;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import os2.C100417r0;
import p749xh.C102661q8;
import p823sg.C90193h;
import te3.C101808lv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.storage.SnsInfo */
public class SnsInfo extends C102661q8 {
    public static final String COL_ID = "rowid";
    public static final long SECONDS_OF_DAY = 86400;
    public static final long SECONDS_OF_HOUR = 3600;
    public static final long SECONDS_OF_MINUTE = 60;
    public static final String TABLEINDEXHEAD = "serverSnsTimeHeadIndex";
    public static final String TABLEINDEXLOCALFLAG = "snsLocalflagIndex";
    public static final String TABLEINDEXMULTI1 = "snsMultiIndex1";
    public static final String TABLEINDEXMULTI2 = "snsMultiIndex2";
    public static final String TABLEINDEXMULTI3 = "snsMultiIndex3";
    public static final String TABLEINDEXSOURCE = "serverSnsTimeSourceTypeIndex";
    public static final String TABLEINDEXTIME = "serverSnsTimeIndex";
    public static final String TABLEINDEXUSERNAME = "serverSnsNameIndex";
    private static final String TAG = "MicroMsg.SnsInfo";
    public static Map<String, C101808lv2> cacheMediaPost = new ConcurrentHashMap();
    public static Map<String, TimeLineObject> cacheTimeLine = new ConcurrentHashMap();
    public static IAutoDBItem.MAutoDBInfo info = C102661q8.initAutoDBInfo(SnsInfo.class);
    public int ExtFlag = 0;
    private AdSnsInfo adsnsinfo;
    public String contentByteMd5 = null;
    private boolean isAd = false;
    public int localid;
    private C101808lv2 postInfo = null;
    public String postinfoMd5 = null;
    public CharSequence withTaUsername = "";

    public SnsInfo() {
    }

    public static int formatUnixTime(long j) {
        int i;
        SnsMethodCalculate.markStartTimeMs("formatUnixTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date(1000 * j));
        try {
            i = Integer.valueOf(format).intValue();
        } catch (Exception unused) {
            Log.m105920e(TAG, "error valueOf  " + format);
            i = (int) (j / 86400);
        }
        SnsMethodCalculate.markEndTimeMs("formatUnixTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public static SnsInfo getNewSnsInfo(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getNewSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        SnsInfo snsInfo2 = new SnsInfo();
        snsInfo2.localid = snsInfo.localid;
        snsInfo2.field_snsId = snsInfo.field_snsId;
        snsInfo2.field_userName = snsInfo.field_userName;
        snsInfo2.field_localFlag = snsInfo.field_localFlag;
        snsInfo2.field_createTime = snsInfo.field_createTime;
        snsInfo2.field_head = snsInfo.field_head;
        snsInfo2.field_localPrivate = snsInfo.field_localPrivate;
        snsInfo2.field_type = snsInfo.field_type;
        snsInfo2.field_sourceType = snsInfo.field_sourceType;
        snsInfo2.field_likeFlag = snsInfo.field_likeFlag;
        snsInfo2.field_pravited = snsInfo.field_pravited;
        snsInfo2.field_stringSeq = snsInfo.field_stringSeq;
        snsInfo2.field_content = snsInfo.field_content;
        snsInfo2.field_attrBuf = snsInfo.field_attrBuf;
        SnsMethodCalculate.markEndTimeMs("getNewSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return snsInfo2;
    }

    public static synchronized void release() {
        synchronized (SnsInfo.class) {
            SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            cacheTimeLine.clear();
            cacheMediaPost.clear();
            SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        }
    }

    public void addSourceFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_sourceType = i | this.field_sourceType;
        SnsMethodCalculate.markEndTimeMs("addSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public boolean canDeal() {
        SnsMethodCalculate.markStartTimeMs("canDeal", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = this.field_snsId != 0;
        SnsMethodCalculate.markEndTimeMs("canDeal", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public void cleanPostHolding() {
        SnsMethodCalculate.markStartTimeMs("cleanPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -513;
        SnsMethodCalculate.markEndTimeMs("cleanPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void cleanWsFoldFlag() {
        SnsMethodCalculate.markStartTimeMs("cleanWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -1025;
        SnsMethodCalculate.markEndTimeMs("cleanWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void clearItemDie() {
        SnsMethodCalculate.markStartTimeMs("clearItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -33;
        SnsMethodCalculate.markEndTimeMs("clearItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void clearWsFeedTypeFlag() {
        SnsMethodCalculate.markStartTimeMs("clearWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -4097;
        SnsMethodCalculate.markEndTimeMs("clearWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void convertFrom(Cursor cursor) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        super.convertFrom(cursor);
        this.localid = (int) this.systemRowid;
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public String dumpAd() {
        SnsMethodCalculate.markStartTimeMs("dumpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        AdSnsInfo adSnsInfo = getAdSnsInfo();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.field_stringSeq);
        stringBuffer.append(adSnsInfo.field_adxml);
        stringBuffer.append(" <createtime " + this.field_createTime + ">");
        stringBuffer.append(" <exposuretime " + adSnsInfo.field_exposureTime + ">");
        stringBuffer.append(" <adcreatetime " + adSnsInfo.field_createAdTime + "> ");
        stringBuffer.append(adSnsInfo.getTimeLine().ContentDesc);
        String stringBuffer2 = stringBuffer.toString();
        SnsMethodCalculate.markEndTimeMs("dumpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return stringBuffer2;
    }

    public ADInfo getAdInfo() {
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (this.adsnsinfo == null) {
            this.adsnsinfo = C94866e1.zx0().mo139864jo(this.field_snsId);
        }
        AdSnsInfo adSnsInfo = this.adsnsinfo;
        ADInfo aDInfo = adSnsInfo == null ? new ADInfo((String) null) : adSnsInfo.getAdInfo();
        SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return aDInfo;
    }

    public String getAdInfoLink() {
        SnsMethodCalculate.markStartTimeMs("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADInfo adInfo = getAdInfo();
        if (adInfo != null) {
            String str = adInfo.adActionLink;
            SnsMethodCalculate.markEndTimeMs("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return "";
    }

    public String getAdLink() {
        SnsMethodCalculate.markStartTimeMs("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        if (adXml != null) {
            String str = adXml.adActionLink;
            SnsMethodCalculate.markEndTimeMs("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return "";
    }

    public int getAdRecSrc() {
        SnsMethodCalculate.markStartTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        if (adXml != null) {
            int i = adXml.recSrc;
            SnsMethodCalculate.markEndTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return 0;
    }

    public AdSnsInfo getAdSnsInfo() {
        SnsMethodCalculate.markStartTimeMs("getAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (this.adsnsinfo == null) {
            this.adsnsinfo = C94866e1.zx0().mo139864jo(this.field_snsId);
        }
        AdSnsInfo adSnsInfo = this.adsnsinfo;
        if (adSnsInfo != null) {
            adSnsInfo.field_createTime = this.field_createTime;
            adSnsInfo.field_userName = this.field_userName;
            adSnsInfo.field_likeFlag = this.field_likeFlag;
            adSnsInfo.field_attrBuf = this.field_attrBuf;
        }
        SnsMethodCalculate.markEndTimeMs("getAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return adSnsInfo;
    }

    public String getAdTitle() {
        SnsMethodCalculate.markStartTimeMs("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        if (adXml != null) {
            String str = adXml.adActionTitle;
            SnsMethodCalculate.markEndTimeMs("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return "";
    }

    public int getAdType() {
        SnsMethodCalculate.markStartTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isAd()) {
            ADXml adXml = getAdXml();
            TimeLineObject timeLine = getTimeLine();
            if (adXml.isLinkAd()) {
                SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return 3;
            } else if (timeLine == null || timeLine.ContentObj.f298424e != 27) {
                int i = 1;
                if (adXml.isCardAd() || adXml.isFullCardAd()) {
                    if (timeLine == null || timeLine.ContentObj.f298424e != 15 || timeLine.sightFolded == 1) {
                        SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                        return 4;
                    }
                    SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                    return 5;
                } else if (adXml.isFinderTopicCard()) {
                    SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                    return 9;
                } else if (adXml.isSlideFullCard()) {
                    SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                    return 10;
                } else {
                    if (this.field_type != 1) {
                        i = 2;
                    }
                    SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                    return i;
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return 6;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return -1;
        }
    }

    public synchronized ADXml getAdXml() {
        ADXml aDXml;
        SnsMethodCalculate.markStartTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (this.adsnsinfo == null) {
            this.adsnsinfo = C94866e1.zx0().mo139864jo(this.field_snsId);
        }
        AdSnsInfo adSnsInfo = this.adsnsinfo;
        aDXml = adSnsInfo == null ? new ADXml((String) null) : adSnsInfo.getAdXml();
        SnsMethodCalculate.markEndTimeMs("getAdXml", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return aDXml;
    }

    public String getAid() {
        SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADInfo adInfo = getAdInfo();
        String str = adInfo == null ? "" : adInfo.aid;
        SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public ADInfo getAtAdInfo() {
        SnsMethodCalculate.markStartTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (this.adsnsinfo == null) {
            this.adsnsinfo = C94866e1.zx0().mo139864jo(this.field_snsId);
        }
        AdSnsInfo adSnsInfo = this.adsnsinfo;
        ADInfo aDInfo = adSnsInfo == null ? new ADInfo((String) null) : adSnsInfo.getAtAdInfo();
        SnsMethodCalculate.markEndTimeMs("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return aDInfo;
    }

    public int getCreateTime() {
        SnsMethodCalculate.markStartTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_createTime;
        SnsMethodCalculate.markEndTimeMs("getCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = info;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return mAutoDBInfo;
    }

    public int getHead() {
        SnsMethodCalculate.markStartTimeMs("getHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_head;
        SnsMethodCalculate.markEndTimeMs("getHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public int getLikeFlag() {
        SnsMethodCalculate.markStartTimeMs("getLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_likeFlag;
        SnsMethodCalculate.markEndTimeMs("getLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public int getLocalFlag() {
        SnsMethodCalculate.markStartTimeMs("getLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_localFlag;
        SnsMethodCalculate.markEndTimeMs("getLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public int getLocalPrivate() {
        SnsMethodCalculate.markStartTimeMs("getLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_localPrivate;
        SnsMethodCalculate.markEndTimeMs("getLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public String getLocalid() {
        SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isAd()) {
            String j = C100417r0.m131421j("ad_table_", (long) this.localid);
            SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return j;
        }
        String j2 = C100417r0.m131421j("sns_table_", (long) this.localid);
        SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return j2;
    }

    public byte[] getPostBuf() {
        SnsMethodCalculate.markStartTimeMs("getPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        byte[] bArr = this.field_postBuf;
        SnsMethodCalculate.markEndTimeMs("getPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return bArr;
    }

    public C101808lv2 getPostInfo() {
        SnsMethodCalculate.markStartTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        byte[] bArr = this.field_postBuf;
        if (bArr == null) {
            C101808lv2 lv22 = new C101808lv2();
            SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return lv22;
        }
        if (this.postinfoMd5 == null) {
            this.postinfoMd5 = C90193h.m112878f(bArr);
        }
        if (cacheMediaPost.containsKey(this.postinfoMd5)) {
            C101808lv2 lv23 = cacheMediaPost.get(this.postinfoMd5);
            this.postInfo = lv23;
            if (lv23 != null) {
                SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return lv23;
            }
        }
        try {
            C101808lv2 lv24 = (C101808lv2) new C101808lv2().parseFrom(this.field_postBuf);
            this.postInfo = lv24;
            cacheMediaPost.put(this.postinfoMd5, lv24);
            C101808lv2 lv25 = this.postInfo;
            SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return lv25;
        } catch (Exception unused) {
            Log.m105920e(TAG, "error get snsinfo timeline!");
            C101808lv2 lv26 = new C101808lv2();
            SnsMethodCalculate.markEndTimeMs("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return lv26;
        }
    }

    public int getPravited() {
        SnsMethodCalculate.markStartTimeMs("getPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_pravited;
        SnsMethodCalculate.markEndTimeMs("getPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public String getSnsId() {
        SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        String snsId = getSnsId(isAd(), this.field_snsId);
        SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return snsId;
    }

    public String getSnsInfo() {
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        String str = "snsId: " + this.field_stringSeq + " \n  localFlag: " + this.field_localFlag + " #　 \n  type: " + this.field_type + " lp: " + this.field_localPrivate + " \n  isPr: " + this.field_pravited + " head: " + this.field_head + " \n  time: " + this.field_createTime + " \n ";
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public int getSourceType() {
        SnsMethodCalculate.markStartTimeMs("getSourceType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_sourceType;
        SnsMethodCalculate.markEndTimeMs("getSourceType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public String getStringSeq() {
        SnsMethodCalculate.markStartTimeMs("getStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        String str = this.field_stringSeq;
        SnsMethodCalculate.markEndTimeMs("getStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public TimeLineObject getTimeLine() {
        TimeLineObject timeLineObject;
        SnsMethodCalculate.markStartTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (this.field_content == null) {
            TimeLineObject i = C91999u.m115563i();
            SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i;
        }
        if (this.contentByteMd5 == null) {
            this.contentByteMd5 = C90193h.m112878f(this.field_content) + C90193h.m112878f(this.field_attrBuf);
        }
        if (!cacheTimeLine.containsKey(this.contentByteMd5) || (timeLineObject = cacheTimeLine.get(this.contentByteMd5)) == null || timeLineObject.ContentObj == null) {
            try {
                TimeLineObject timeLineObject2 = (TimeLineObject) new TimeLineObject().parseFrom(this.field_content);
                if (timeLineObject2 == null) {
                    Log.m105920e(TAG, "error timeLineObj is null!");
                    TimeLineObject i2 = C91999u.m115563i();
                    SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                    return i2;
                } else if (timeLineObject2.ContentObj == null) {
                    Log.m105920e(TAG, "error timeLineObj.ContentObj is null!");
                    TimeLineObject i3 = C91999u.m115563i();
                    SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                    return i3;
                } else {
                    cacheTimeLine.put(this.contentByteMd5, timeLineObject2);
                    SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                    return timeLineObject2;
                }
            } catch (Exception unused) {
                Log.m105920e(TAG, "error get snsinfo timeline!");
                TimeLineObject i4 = C91999u.m115563i();
                SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return i4;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return timeLineObject;
        }
    }

    public String getTraceid() {
        SnsMethodCalculate.markStartTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADInfo adInfo = getAdInfo();
        String str = adInfo == null ? "" : adInfo.traceid;
        SnsMethodCalculate.markEndTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public int getTypeFlag() {
        SnsMethodCalculate.markStartTimeMs("getTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i = this.field_type;
        SnsMethodCalculate.markEndTimeMs("getTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i;
    }

    public String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        String str = this.field_userName;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    public String getUxinfo() {
        SnsMethodCalculate.markStartTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADInfo adInfo = getAdInfo();
        if (adInfo != null) {
            String str = adInfo.uxInfo;
            SnsMethodCalculate.markEndTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return "";
    }

    public boolean isAd() {
        SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean isSourceExist = isSourceExist(32);
        SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return isSourceExist;
    }

    public boolean isAdIpInteractVideo() {
        SnsMethodCalculate.markStartTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        boolean z = adXml != null && adXml.isAdIpInteractVideo();
        SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isBreakFrameAd() {
        SnsMethodCalculate.markStartTimeMs("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        boolean z = adXml != null && adXml.isAdBreakFrameVideo();
        SnsMethodCalculate.markEndTimeMs("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isCardAd() {
        SnsMethodCalculate.markStartTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = getAdXml() != null && getAdXml().isCardAd();
        SnsMethodCalculate.markEndTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isCombinedGridAD() {
        SnsMethodCalculate.markStartTimeMs("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = getAdXml() != null && getAdXml().isCombinedGridAD();
        SnsMethodCalculate.markEndTimeMs("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isCoverPostFailed() {
        SnsMethodCalculate.markStartTimeMs("isCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 2048) > 0;
        SnsMethodCalculate.markEndTimeMs("isCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isDeadSource() {
        SnsMethodCalculate.markStartTimeMs("isDeadSource", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_sourceType & 270) == 0;
        SnsMethodCalculate.markEndTimeMs("isDeadSource", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isDieItem() {
        SnsMethodCalculate.markStartTimeMs("isDieItem", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 32) > 0 && this.field_snsId == 0;
        SnsMethodCalculate.markEndTimeMs("isDieItem", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r2 = r2.adFullCardInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isDragAd() {
        /*
            r4 = this;
            java.lang.String r0 = "isDragAd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r4.getAdXml()
            boolean r3 = r4.isFullCardAd()
            if (r3 == 0) goto L_0x001e
            if (r2 == 0) goto L_0x001e
            com.tencent.mm.plugin.sns.storage.ADXml$g r2 = r2.adFullCardInfo
            if (r2 == 0) goto L_0x001e
            co2.f r2 = r2.f275697m
            if (r2 == 0) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.SnsInfo.isDragAd():boolean");
    }

    public boolean isExposures() {
        SnsMethodCalculate.markStartTimeMs("isExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 128) > 0;
        SnsMethodCalculate.markEndTimeMs("isExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isExtFlag() {
        SnsMethodCalculate.markStartTimeMs("isExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 2) > 0;
        SnsMethodCalculate.markEndTimeMs("isExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isFinderAd() {
        SnsMethodCalculate.markStartTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = false;
        if (!isAd()) {
            SnsMethodCalculate.markEndTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        ADXml adXml = getAdXml();
        ADInfo adInfo = getAdInfo();
        if (!(adXml == null || adXml.adFinderInfo == null || adInfo == null || adInfo.adActionType != 9)) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isFinderTopicCardAd() {
        SnsMethodCalculate.markStartTimeMs("isFinderTopicCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = getAdXml() != null && getAdXml().isFinderTopicCard();
        SnsMethodCalculate.markEndTimeMs("isFinderTopicCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isFullCardAd() {
        SnsMethodCalculate.markStartTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = getAdXml() != null && getAdXml().isFullCardAd();
        SnsMethodCalculate.markEndTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isGestureAd() {
        SnsMethodCalculate.markStartTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        boolean z = adXml != null && adXml.isGestureAd();
        SnsMethodCalculate.markEndTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isInValid() {
        SnsMethodCalculate.markStartTimeMs("isInValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = this.field_snsId == 0;
        SnsMethodCalculate.markEndTimeMs("isInValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isLocalInvisible() {
        SnsMethodCalculate.markStartTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 256) > 0;
        SnsMethodCalculate.markEndTimeMs("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isLongPressGestureAd() {
        SnsMethodCalculate.markStartTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        boolean z = adXml != null && adXml.isLongPressGestureAd();
        SnsMethodCalculate.markEndTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isNoCopy() {
        SnsMethodCalculate.markStartTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_serverExtFlag & 128) > 0;
        SnsMethodCalculate.markEndTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isOmittedFailResend() {
        SnsMethodCalculate.markStartTimeMs("isOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 64) > 0;
        SnsMethodCalculate.markEndTimeMs("isOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isRecExpAd() {
        SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        if (adXml != null) {
            boolean isRecExpAd = adXml.isRecExpAd();
            SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return isRecExpAd;
        }
        SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return false;
    }

    public boolean isShakeAd() {
        SnsMethodCalculate.markStartTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        boolean z = adXml != null && adXml.isShakeAd();
        SnsMethodCalculate.markEndTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isSlideFullCardAd() {
        SnsMethodCalculate.markStartTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = getAdXml() != null && getAdXml().isSlideFullCard();
        SnsMethodCalculate.markEndTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isSocialAttitudeAd() {
        SnsMethodCalculate.markStartTimeMs("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        boolean z = (!isFullCardAd() || adXml == null || adXml.adSocialInfo == null) ? false : true;
        SnsMethodCalculate.markEndTimeMs("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isSourceExist(int i) {
        SnsMethodCalculate.markStartTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (i & this.field_sourceType) > 0;
        SnsMethodCalculate.markEndTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isSphereCardAd() {
        SnsMethodCalculate.markStartTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = getAdXml() != null && getAdXml().isSphereCardAd();
        SnsMethodCalculate.markEndTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isTimeLimit(int i, long j) {
        SnsMethodCalculate.markStartTimeMs("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (Util.secondsToNow(j / 1000) > 7200) {
            SnsMethodCalculate.markEndTimeMs("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return false;
    }

    public boolean isTurnCardAd() {
        SnsMethodCalculate.markStartTimeMs("isTurnCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = getTimeLine() != null && getTimeLine().ContentObj.f298424e == 27;
        SnsMethodCalculate.markEndTimeMs("isTurnCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isTwistAd() {
        SnsMethodCalculate.markStartTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        ADXml adXml = getAdXml();
        boolean z = adXml != null && adXml.isTwistAd();
        SnsMethodCalculate.markEndTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isValid() {
        SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = this.field_snsId != 0;
        SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isWaitPost() {
        SnsMethodCalculate.markStartTimeMs("isWaitPost", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 16) > 0;
        SnsMethodCalculate.markEndTimeMs("isWaitPost", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isWithMe() {
        SnsMethodCalculate.markStartTimeMs("isWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = true;
        if ((this.field_localFlag & 1) <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isWsFeedType() {
        SnsMethodCalculate.markStartTimeMs("isWsFeedType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 4096) > 0;
        SnsMethodCalculate.markEndTimeMs("isWsFeedType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isWsFold() {
        SnsMethodCalculate.markStartTimeMs("isWsFold", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z = (this.field_localFlag & 1024) > 0;
        SnsMethodCalculate.markEndTimeMs("isWsFold", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public boolean isWxWork() {
        SnsMethodCalculate.markStartTimeMs("isWxWork", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        C86709a0.m107528h();
        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(this.field_userName);
        boolean z = C72996z1.m85843n5(this.field_userName) && "3552365301".equals(H3 == null ? null : H3.mo73980x2());
        SnsMethodCalculate.markEndTimeMs("isWxWork", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z;
    }

    public void printInfo() {
        SnsMethodCalculate.markStartTimeMs("printInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        SnsMethodCalculate.markEndTimeMs("printInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void readFromBundle(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (bundle == null) {
            SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return;
        }
        convertFrom((ContentValues) bundle.getParcelable("values"));
        this.localid = bundle.getInt("localid");
        Bundle bundle2 = bundle.getBundle("adValues");
        if (bundle2 != null) {
            AdSnsInfo adSnsInfo = new AdSnsInfo();
            adSnsInfo.readFromBundle(bundle2);
            this.adsnsinfo = adSnsInfo;
        }
        SnsMethodCalculate.markEndTimeMs("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void removeSourceFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_sourceType = (~i) & this.field_sourceType;
        SnsMethodCalculate.markEndTimeMs("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setAdSnsInfo(AdSnsInfo adSnsInfo) {
        SnsMethodCalculate.markStartTimeMs("setAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.adsnsinfo = adSnsInfo;
        SnsMethodCalculate.markEndTimeMs("setAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setAttrBuf(byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_attrBuf = bArr;
        this.contentByteMd5 = C90193h.m112878f(this.field_content) + C90193h.m112878f(this.field_attrBuf);
        SnsMethodCalculate.markEndTimeMs("setAttrBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public boolean setContent(String str) {
        SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            this.field_content = C91999u.m115571q(str).toByteArray();
            this.contentByteMd5 = C90193h.m112878f(this.field_content) + C90193h.m112878f(this.field_attrBuf);
            SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
    }

    public void setCoverPostFailed() {
        SnsMethodCalculate.markStartTimeMs("setCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 2048;
        SnsMethodCalculate.markEndTimeMs("setCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setCreateTime(int i) {
        SnsMethodCalculate.markStartTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        Log.m105925i(TAG, "setCreateTime >> lastCreateTime: %d, currentCreateTime: %d, localId: %d", Integer.valueOf(this.field_createTime), Integer.valueOf(i), Integer.valueOf(this.localid));
        int i2 = this.field_createTime;
        if (i - i2 >= 180 || i - i2 < 0) {
            this.field_createTime = i;
            setHead(formatUnixTime((long) i));
            SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return;
        }
        if (this.field_head == 0) {
            setHead(formatUnixTime((long) i2));
        }
        SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setExposures() {
        SnsMethodCalculate.markStartTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 128;
        SnsMethodCalculate.markEndTimeMs("setExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setExtFlag() {
        SnsMethodCalculate.markStartTimeMs("setExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 2;
        SnsMethodCalculate.markEndTimeMs("setExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setHead(int i) {
        SnsMethodCalculate.markStartTimeMs("setHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_head = i;
        SnsMethodCalculate.markEndTimeMs("setHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setItemDie() {
        SnsMethodCalculate.markStartTimeMs("setItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 32;
        SnsMethodCalculate.markEndTimeMs("setItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLikeFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("setLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_likeFlag = i;
        SnsMethodCalculate.markEndTimeMs("setLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag = i;
        SnsMethodCalculate.markEndTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalInvisible() {
        SnsMethodCalculate.markStartTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 256;
        SnsMethodCalculate.markEndTimeMs("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalPrivate() {
        SnsMethodCalculate.markStartTimeMs("setLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localPrivate |= 1;
        SnsMethodCalculate.markEndTimeMs("setLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalVisible() {
        SnsMethodCalculate.markStartTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -257;
        SnsMethodCalculate.markEndTimeMs("setLocalVisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setLocalid(int i) {
        SnsMethodCalculate.markStartTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.localid = i;
        SnsMethodCalculate.markEndTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setOmittedFailResend() {
        SnsMethodCalculate.markStartTimeMs("setOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 64;
        SnsMethodCalculate.markEndTimeMs("setOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostBuf(byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("setPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_postBuf = bArr;
        SnsMethodCalculate.markEndTimeMs("setPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostFinish() {
        SnsMethodCalculate.markStartTimeMs("setPostFinish", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -17;
        SnsMethodCalculate.markEndTimeMs("setPostFinish", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostHolding() {
        SnsMethodCalculate.markStartTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 512;
        SnsMethodCalculate.markEndTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostInfo() {
        SnsMethodCalculate.markStartTimeMs("setPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            setPostBuf(this.postInfo.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            Log.m105920e(TAG, "toByteArray error");
        }
        SnsMethodCalculate.markEndTimeMs("setPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPostWaiting() {
        SnsMethodCalculate.markStartTimeMs("setPostWaiting", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 16;
        SnsMethodCalculate.markEndTimeMs("setPostWaiting", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setPravited(int i) {
        SnsMethodCalculate.markStartTimeMs("setPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_pravited = i;
        SnsMethodCalculate.markEndTimeMs("setPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setSnsId(long j) {
        SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_snsId = j;
        if (j != 0) {
            setStringSeq(j);
        }
        SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setStringSeq(String str) {
        SnsMethodCalculate.markStartTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_stringSeq = str;
        SnsMethodCalculate.markEndTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setSubTypeFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("setSubTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_subType = i;
        SnsMethodCalculate.markEndTimeMs("setSubTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setTimeLine(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            this.field_content = timeLineObject.toByteArray();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        this.contentByteMd5 = C90193h.m112878f(this.field_content) + C90193h.m112878f(this.field_attrBuf);
        SnsMethodCalculate.markEndTimeMs("setTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setTypeFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("setTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_type = i;
        SnsMethodCalculate.markEndTimeMs("setTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setUserName(String str) {
        SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_userName = str;
        SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setWithMe() {
        SnsMethodCalculate.markStartTimeMs("setWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 1;
        SnsMethodCalculate.markEndTimeMs("setWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setWsFeedTypeFlag() {
        SnsMethodCalculate.markStartTimeMs("setWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 4096;
        SnsMethodCalculate.markEndTimeMs("setWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void setWsFoldFlag() {
        SnsMethodCalculate.markStartTimeMs("setWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag |= 1024;
        SnsMethodCalculate.markEndTimeMs("setWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unLocalPrivate() {
        SnsMethodCalculate.markStartTimeMs("unLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localPrivate = 0;
        SnsMethodCalculate.markEndTimeMs("unLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unSetExtFlag() {
        SnsMethodCalculate.markStartTimeMs("unSetExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -3;
        SnsMethodCalculate.markEndTimeMs("unSetExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unSetWithMe() {
        SnsMethodCalculate.markStartTimeMs("unSetWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_localFlag &= -2;
        SnsMethodCalculate.markEndTimeMs("unSetWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public void unsetOmittedFailResend() {
        SnsMethodCalculate.markStartTimeMs("unsetOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (isOmittedFailResend()) {
            this.field_localFlag &= -65;
        }
        SnsMethodCalculate.markEndTimeMs("unsetOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public Bundle writeToBundle() {
        SnsMethodCalculate.markStartTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        Bundle bundle = new Bundle();
        bundle.putParcelable("values", super.convertTo());
        bundle.putInt("localid", this.localid);
        if (getAdSnsInfo() != null) {
            bundle.putBundle("adValues", getAdSnsInfo().writeToBundle());
        }
        SnsMethodCalculate.markEndTimeMs("writeToBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return bundle;
    }

    public static String getSnsId(boolean z, long j) {
        SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (z) {
            String j2 = C100417r0.m131421j("ad_table_", j);
            SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return j2;
        }
        String j3 = C100417r0.m131421j("sns_table_", j);
        SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return j3;
    }

    public void setStringSeq(long j) {
        SnsMethodCalculate.markStartTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.field_stringSeq = C102236a0.m134763p0(j);
        Log.m105918d(TAG, j + " stringSeq " + this.field_stringSeq);
        SnsMethodCalculate.markEndTimeMs("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public ContentValues convertFrom(ContentValues contentValues) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
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
        this.field_subType = contentValues.getAsInteger("subType").intValue();
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return contentValues;
    }

    public ADInfo getAdInfo(int i) {
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (i == 2) {
            ADInfo atAdInfo = getAtAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return atAdInfo;
        }
        ADInfo adInfo = getAdInfo();
        SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return adInfo;
    }

    public SnsInfo(long j) {
        setSnsId(j);
    }
}
