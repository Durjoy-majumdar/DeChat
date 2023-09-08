package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsPublishProcessStruct */
public final class SnsPublishProcessStruct extends C61103a {
    public SnsPublishProcessStruct() {
        mo86052l("sessionid_", "");
        mo86052l("source_", 0);
        mo86052l("opresult_", 0);
        mo86052l("editPageStaytime_", 0);
        mo86052l("poiPageStaytime_", 0);
        mo86052l("atPageStaytime_", 0);
        mo86052l("privacyPageStaytime_", 0);
        mo86052l("mediaEditPageStaytime_", 0);
        mo86052l("mediaPreviewPageStaytime_", 0);
        mo86052l("selectionPageStaytime_", 0);
        mo86052l("cameraPageStaytime_", 0);
        mo86052l("mediaSource_", "");
        mo86052l("mediaMD5_", "");
        mo86052l("actionTrace_", "");
        mo86052l("publishid_", "");
        mo86052l("firstEditPageShotMedia", 0);
        mo86052l("firstEditPageMedia", 0);
        mo86052l("endSessionShotMedia", 0);
        mo86052l("endSessionMedia", 0);
        mo86052l("endSessionShot", 0);
        mo86052l("editPageTimes", 0);
        mo86052l("ifMiaojian", 0);
        mo86052l("ifShowActionSheet", 0);
        mo86052l("fromPage", 0);
        mo86052l("upload_time", 0);
        mo86052l("send_type", 0);
        mo86052l("cgiReconnectCnt", 0);
        mo86052l("cgiresult", "");
        mo86052l("returnDuration", 0);
        mo86052l("clickretrycnt", 0);
        mo86052l("egID", "");
        mo86052l("egLocation", "");
        mo86052l("selectPagetimes", 0);
        mo86052l("mediaPreviewPagetimes", 0);
        mo86052l("egsessionCnt", 0);
        mo86052l("egEditTime", 0);
        mo86052l("musicID", "");
        mo86052l("ifVoice", 0);
        mo86052l("ifEgExit", 0);
        mo86052l("Maaskey", "");
        mo86052l("permissionSheetCnt", 0);
        mo86052l("refuseCnt", 0);
        mo86052l("agreeCnt", 0);
        mo86052l("blankCnt", 0);
        mo86052l("withFriendInfo", "");
    }

    /* renamed from: j */
    public int mo1004j() {
        return 23750;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i("sessionid_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("source_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("opresult_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("editPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("poiPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("atPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("privacyPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediaEditPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediaPreviewPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("selectionPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("cameraPageStaytime_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediaSource_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediaMD5_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("actionTrace_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("publishid_"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("firstEditPageShotMedia"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("firstEditPageMedia"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("endSessionShotMedia"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("endSessionMedia"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("endSessionShot"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("editPageTimes"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("ifMiaojian"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("ifShowActionSheet"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("fromPage"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("upload_time"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("send_type"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("cgiReconnectCnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("cgiresult"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("returnDuration"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("clickretrycnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egID"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egLocation"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("selectPagetimes"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("mediaPreviewPagetimes"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egsessionCnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("egEditTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("musicID"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("ifVoice"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("ifEgExit"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Maaskey"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("permissionSheetCnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("refuseCnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("agreeCnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("blankCnt"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("withFriendInfo"));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("sessionid_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("source_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("source_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opresult_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("opresult_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("editPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("editPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("poiPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("poiPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("atPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("atPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("privacyPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("privacyPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaEditPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediaEditPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaPreviewPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediaPreviewPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("selectionPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("selectionPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cameraPageStaytime_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("cameraPageStaytime_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaSource_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediaSource_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaMD5_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediaMD5_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionTrace_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("actionTrace_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("publishid_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("publishid_"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("firstEditPageShotMedia");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("firstEditPageShotMedia"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("firstEditPageMedia");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("firstEditPageMedia"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("endSessionShotMedia");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("endSessionShotMedia"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("endSessionMedia");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("endSessionMedia"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("endSessionShot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("endSessionShot"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("editPageTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("editPageTimes"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifMiaojian");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("ifMiaojian"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifShowActionSheet");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("ifShowActionSheet"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fromPage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("fromPage"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("upload_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("upload_time"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("send_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("send_type"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cgiReconnectCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("cgiReconnectCnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cgiresult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("cgiresult"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("returnDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("returnDuration"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickretrycnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("clickretrycnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egID"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egLocation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egLocation"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("selectPagetimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("selectPagetimes"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaPreviewPagetimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("mediaPreviewPagetimes"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egsessionCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egsessionCnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("egEditTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("egEditTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("musicID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("musicID"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifVoice");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("ifVoice"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifEgExit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("ifEgExit"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Maaskey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Maaskey"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("permissionSheetCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("permissionSheetCnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("refuseCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("refuseCnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("agreeCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("agreeCnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("blankCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("blankCnt"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("withFriendInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("withFriendInfo"));
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public long mo76272s() {
        if (mo86050i("editPageStaytime_") != null) {
            return Long.valueOf(mo86050i("editPageStaytime_").toString()).longValue();
        }
        return 0;
    }

    public SnsPublishProcessStruct setActionTrace_(String str) {
        mo86052l("actionTrace_", mo86045b("actionTrace_", str, true));
        return this;
    }

    public SnsPublishProcessStruct setAgreeCnt(long j) {
        mo86052l("agreeCnt", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setAtPageStaytime_(long j) {
        mo86052l("atPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setBlankCnt(long j) {
        mo86052l("blankCnt", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setCameraPageStaytime_(long j) {
        mo86052l("cameraPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setCgiReconnectCnt(long j) {
        mo86052l("cgiReconnectCnt", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setCgiresult(String str) {
        mo86052l("cgiresult", mo86045b("cgiresult", str, true));
        return this;
    }

    public SnsPublishProcessStruct setClickretrycnt(long j) {
        mo86052l("clickretrycnt", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setEditPageStaytime_(long j) {
        mo86052l("editPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setEditPageTimes(long j) {
        mo86052l("editPageTimes", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setEgEditTime(long j) {
        mo86052l("egEditTime", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setEgID(String str) {
        mo86052l("egID", mo86045b("egID", str, true));
        return this;
    }

    public SnsPublishProcessStruct setEgLocation(String str) {
        mo86052l("egLocation", mo86045b("egLocation", str, true));
        return this;
    }

    public SnsPublishProcessStruct setEgsessionCnt(long j) {
        mo86052l("egsessionCnt", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setEndSessionMedia(long j) {
        mo86052l("endSessionMedia", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setEndSessionShot(long j) {
        mo86052l("endSessionShot", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setEndSessionShotMedia(long j) {
        mo86052l("endSessionShotMedia", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setFirstEditPageMedia(long j) {
        mo86052l("firstEditPageMedia", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setFirstEditPageShotMedia(long j) {
        mo86052l("firstEditPageShotMedia", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setFromPage(long j) {
        mo86052l("fromPage", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setIfEgExit(long j) {
        mo86052l("ifEgExit", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setIfMiaojian(long j) {
        mo86052l("ifMiaojian", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setIfShowActionSheet(long j) {
        mo86052l("ifShowActionSheet", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setIfVoice(long j) {
        mo86052l("ifVoice", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setMaaskey(String str) {
        mo86052l("Maaskey", mo86045b("Maaskey", str, true));
        return this;
    }

    public SnsPublishProcessStruct setMediaEditPageStaytime_(long j) {
        mo86052l("mediaEditPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setMediaMD5_(String str) {
        mo86052l("mediaMD5_", mo86045b("mediaMD5_", str, true));
        return this;
    }

    public SnsPublishProcessStruct setMediaPreviewPageStaytime_(long j) {
        mo86052l("mediaPreviewPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setMediaPreviewPagetimes(long j) {
        mo86052l("mediaPreviewPagetimes", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setMediaSource_(String str) {
        mo86052l("mediaSource_", mo86045b("mediaSource_", str, true));
        return this;
    }

    public SnsPublishProcessStruct setMusicID(String str) {
        mo86052l("musicID", mo86045b("musicID", str, true));
        return this;
    }

    public SnsPublishProcessStruct setOpresult_(long j) {
        mo86052l("opresult_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setPermissionSheetCnt(long j) {
        mo86052l("permissionSheetCnt", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setPoiPageStaytime_(long j) {
        mo86052l("poiPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setPrivacyPageStaytime_(long j) {
        mo86052l("privacyPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setPublishid_(String str) {
        mo86052l("publishid_", mo86045b("publishid_", str, true));
        return this;
    }

    public SnsPublishProcessStruct setRefuseCnt(long j) {
        mo86052l("refuseCnt", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setReturnDuration(long j) {
        mo86052l("returnDuration", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setSelectPagetimes(long j) {
        mo86052l("selectPagetimes", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setSelectionPageStaytime_(long j) {
        mo86052l("selectionPageStaytime_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setSend_type(long j) {
        mo86052l("send_type", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setSessionid_(String str) {
        mo86052l("sessionid_", mo86045b("sessionid_", str, true));
        return this;
    }

    public SnsPublishProcessStruct setSource_(long j) {
        mo86052l("source_", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setUpload_time(long j) {
        mo86052l("upload_time", Long.valueOf(j));
        return this;
    }

    public SnsPublishProcessStruct setWithFriendInfo(String str) {
        mo86052l("withFriendInfo", mo86045b("withFriendInfo", str, true));
        return this;
    }

    /* renamed from: t */
    public String mo76318t() {
        return mo86050i("mediaMD5_") != null ? mo86050i("mediaMD5_").toString() : "";
    }

    /* renamed from: u */
    public String mo76319u() {
        return mo86050i("mediaSource_") != null ? mo86050i("mediaSource_").toString() : "";
    }

    /* renamed from: v */
    public long mo76320v() {
        if (mo86050i("privacyPageStaytime_") != null) {
            return Long.valueOf(mo86050i("privacyPageStaytime_").toString()).longValue();
        }
        return 0;
    }

    /* renamed from: w */
    public String mo76321w() {
        return mo86050i("sessionid_") != null ? mo86050i("sessionid_").toString() : "";
    }
}
