package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C64311db1;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderFeedReportObject */
public class FinderFeedReportObject extends C47465a {
    public String actionTrace;
    public String activeInfo;
    public String beforeCutMediaPath;
    public long cdnEndTime;
    public int cgiErrorCode;
    public int cgiErrorType;
    public String clickId;
    public int clickMentionCount;
    public int clickRepostCount;
    public int clickSucMentionCount;
    public String clientKvReportInfo;
    public int descCount;
    public int descEmojiCount;
    public int draft;
    public int draftId;
    public int draftType;
    public int dumpCgiErrorCode;
    public int dumpCgiErrorType;
    public String editId;
    public int enterScene;
    public long enterTakePhotoTime;
    public long enterVideoEditTime;
    public int existDesc;
    public int existLocation;
    public int exitPageId;
    public String flowId;
    public String followSoundTrackId;
    public String forwardingAppId;
    public int fromDraft;
    public int isBeauty;
    public int isDurationCut;
    public int isMultiShot;
    public int is_change_product_title;
    public int lbsFlag;
    public String link;
    public int longVideoSizeInvalid;
    public LinkedList<FinderMediaReportObject> mediaList = new LinkedList<>();
    public int mediaProcessCost;
    public int megaCgiErrorCode;
    public int megaCgiErrorType;
    public int mentionCount;
    public int mentionRepeatCount;
    public int mpError;
    public int multiShotChangeCnt;
    public int multiShotClickCnt;
    public int multiShotSuccessCnt;
    public int multiShotVideoCnt;
    public String musicFeedId;
    public int musicType;
    public String originColorSpace;
    public String postId;
    public int postStage;
    public int postTaskCost;
    public int recommend_lbs_position;
    public long remuxEndTime;
    public int remuxType;
    public int retryCount;
    public int sdkShareType;
    public C64311db1 selectLocation;
    public long sendOrExitButtonTime;
    public String sessionId;
    public int soundTrackType;
    public String tempateInfo;
    public String topicActivityId;
    public int topicActivityType;
    public int uploadCost;
    public int uploadLogicError;
    public long uploadMediaTotalSize;
    public int videoEmojiCount;
    public String videoMediaInfo;
    public String videoMusicId;
    public int videoMusicIndex;
    public int videoMusicSearch;
    public int videoPostType;
    public long videoRecordTime;
    public int videoSource;
    public int videoSubType;
    public int videoWordingCount;
    public int waitingPostCount;

    public static final FinderFeedReportObject create() {
        return new FinderFeedReportObject();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderFeedReportObject)) {
            return false;
        }
        FinderFeedReportObject finderFeedReportObject = (FinderFeedReportObject) aVar;
        return C46238a.m51546a(this.sessionId, finderFeedReportObject.sessionId) && C46238a.m51546a(Integer.valueOf(this.enterScene), Integer.valueOf(finderFeedReportObject.enterScene)) && C46238a.m51546a(Integer.valueOf(this.exitPageId), Integer.valueOf(finderFeedReportObject.exitPageId)) && C46238a.m51546a(Long.valueOf(this.enterTakePhotoTime), Long.valueOf(finderFeedReportObject.enterTakePhotoTime)) && C46238a.m51546a(Long.valueOf(this.enterVideoEditTime), Long.valueOf(finderFeedReportObject.enterVideoEditTime)) && C46238a.m51546a(Long.valueOf(this.sendOrExitButtonTime), Long.valueOf(finderFeedReportObject.sendOrExitButtonTime)) && C46238a.m51546a(Long.valueOf(this.videoRecordTime), Long.valueOf(finderFeedReportObject.videoRecordTime)) && C46238a.m51546a(Integer.valueOf(this.videoSource), Integer.valueOf(finderFeedReportObject.videoSource)) && C46238a.m51546a(Integer.valueOf(this.videoEmojiCount), Integer.valueOf(finderFeedReportObject.videoEmojiCount)) && C46238a.m51546a(Integer.valueOf(this.videoWordingCount), Integer.valueOf(finderFeedReportObject.videoWordingCount)) && C46238a.m51546a(this.videoMusicId, finderFeedReportObject.videoMusicId) && C46238a.m51546a(Integer.valueOf(this.videoMusicIndex), Integer.valueOf(finderFeedReportObject.videoMusicIndex)) && C46238a.m51546a(Integer.valueOf(this.videoMusicSearch), Integer.valueOf(finderFeedReportObject.videoMusicSearch)) && C46238a.m51546a(Integer.valueOf(this.videoPostType), Integer.valueOf(finderFeedReportObject.videoPostType)) && C46238a.m51546a(this.videoMediaInfo, finderFeedReportObject.videoMediaInfo) && C46238a.m51546a(Integer.valueOf(this.existDesc), Integer.valueOf(finderFeedReportObject.existDesc)) && C46238a.m51546a(Integer.valueOf(this.descCount), Integer.valueOf(finderFeedReportObject.descCount)) && C46238a.m51546a(Integer.valueOf(this.descEmojiCount), Integer.valueOf(finderFeedReportObject.descEmojiCount)) && C46238a.m51546a(this.actionTrace, finderFeedReportObject.actionTrace) && C46238a.m51546a(Integer.valueOf(this.existLocation), Integer.valueOf(finderFeedReportObject.existLocation)) && C46238a.m51546a(this.link, finderFeedReportObject.link) && C46238a.m51546a(Integer.valueOf(this.draft), Integer.valueOf(finderFeedReportObject.draft)) && C46238a.m51546a(Long.valueOf(this.cdnEndTime), Long.valueOf(finderFeedReportObject.cdnEndTime)) && C46238a.m51546a(Long.valueOf(this.remuxEndTime), Long.valueOf(finderFeedReportObject.remuxEndTime)) && C46238a.m51546a(this.mediaList, finderFeedReportObject.mediaList) && C46238a.m51546a(Integer.valueOf(this.retryCount), Integer.valueOf(finderFeedReportObject.retryCount)) && C46238a.m51546a(Integer.valueOf(this.isBeauty), Integer.valueOf(finderFeedReportObject.isBeauty)) && C46238a.m51546a(Integer.valueOf(this.isDurationCut), Integer.valueOf(finderFeedReportObject.isDurationCut)) && C46238a.m51546a(this.beforeCutMediaPath, finderFeedReportObject.beforeCutMediaPath) && C46238a.m51546a(Integer.valueOf(this.isMultiShot), Integer.valueOf(finderFeedReportObject.isMultiShot)) && C46238a.m51546a(Integer.valueOf(this.multiShotChangeCnt), Integer.valueOf(finderFeedReportObject.multiShotChangeCnt)) && C46238a.m51546a(Integer.valueOf(this.multiShotClickCnt), Integer.valueOf(finderFeedReportObject.multiShotClickCnt)) && C46238a.m51546a(Integer.valueOf(this.multiShotSuccessCnt), Integer.valueOf(finderFeedReportObject.multiShotSuccessCnt)) && C46238a.m51546a(Integer.valueOf(this.multiShotVideoCnt), Integer.valueOf(finderFeedReportObject.multiShotVideoCnt)) && C46238a.m51546a(Integer.valueOf(this.videoSubType), Integer.valueOf(finderFeedReportObject.videoSubType)) && C46238a.m51546a(this.postId, finderFeedReportObject.postId) && C46238a.m51546a(this.editId, finderFeedReportObject.editId) && C46238a.m51546a(Integer.valueOf(this.mentionCount), Integer.valueOf(finderFeedReportObject.mentionCount)) && C46238a.m51546a(Integer.valueOf(this.clickMentionCount), Integer.valueOf(finderFeedReportObject.clickMentionCount)) && C46238a.m51546a(Integer.valueOf(this.clickSucMentionCount), Integer.valueOf(finderFeedReportObject.clickSucMentionCount)) && C46238a.m51546a(Integer.valueOf(this.mentionRepeatCount), Integer.valueOf(finderFeedReportObject.mentionRepeatCount)) && C46238a.m51546a(Integer.valueOf(this.lbsFlag), Integer.valueOf(finderFeedReportObject.lbsFlag)) && C46238a.m51546a(this.selectLocation, finderFeedReportObject.selectLocation) && C46238a.m51546a(Integer.valueOf(this.remuxType), Integer.valueOf(finderFeedReportObject.remuxType)) && C46238a.m51546a(Integer.valueOf(this.uploadLogicError), Integer.valueOf(finderFeedReportObject.uploadLogicError)) && C46238a.m51546a(Integer.valueOf(this.postStage), Integer.valueOf(finderFeedReportObject.postStage)) && C46238a.m51546a(Integer.valueOf(this.cgiErrorCode), Integer.valueOf(finderFeedReportObject.cgiErrorCode)) && C46238a.m51546a(Integer.valueOf(this.cgiErrorType), Integer.valueOf(finderFeedReportObject.cgiErrorType)) && C46238a.m51546a(this.clickId, finderFeedReportObject.clickId) && C46238a.m51546a(Integer.valueOf(this.soundTrackType), Integer.valueOf(finderFeedReportObject.soundTrackType)) && C46238a.m51546a(this.followSoundTrackId, finderFeedReportObject.followSoundTrackId) && C46238a.m51546a(Integer.valueOf(this.megaCgiErrorCode), Integer.valueOf(finderFeedReportObject.megaCgiErrorCode)) && C46238a.m51546a(Integer.valueOf(this.megaCgiErrorType), Integer.valueOf(finderFeedReportObject.megaCgiErrorType)) && C46238a.m51546a(Integer.valueOf(this.musicType), Integer.valueOf(finderFeedReportObject.musicType)) && C46238a.m51546a(Integer.valueOf(this.longVideoSizeInvalid), Integer.valueOf(finderFeedReportObject.longVideoSizeInvalid)) && C46238a.m51546a(Integer.valueOf(this.mediaProcessCost), Integer.valueOf(finderFeedReportObject.mediaProcessCost)) && C46238a.m51546a(Integer.valueOf(this.uploadCost), Integer.valueOf(finderFeedReportObject.uploadCost)) && C46238a.m51546a(Long.valueOf(this.uploadMediaTotalSize), Long.valueOf(finderFeedReportObject.uploadMediaTotalSize)) && C46238a.m51546a(Integer.valueOf(this.postTaskCost), Integer.valueOf(finderFeedReportObject.postTaskCost)) && C46238a.m51546a(Integer.valueOf(this.clickRepostCount), Integer.valueOf(finderFeedReportObject.clickRepostCount)) && C46238a.m51546a(Integer.valueOf(this.dumpCgiErrorCode), Integer.valueOf(finderFeedReportObject.dumpCgiErrorCode)) && C46238a.m51546a(Integer.valueOf(this.dumpCgiErrorType), Integer.valueOf(finderFeedReportObject.dumpCgiErrorType)) && C46238a.m51546a(Integer.valueOf(this.sdkShareType), Integer.valueOf(finderFeedReportObject.sdkShareType)) && C46238a.m51546a(this.forwardingAppId, finderFeedReportObject.forwardingAppId) && C46238a.m51546a(this.topicActivityId, finderFeedReportObject.topicActivityId) && C46238a.m51546a(Integer.valueOf(this.topicActivityType), Integer.valueOf(finderFeedReportObject.topicActivityType)) && C46238a.m51546a(Integer.valueOf(this.draftType), Integer.valueOf(finderFeedReportObject.draftType)) && C46238a.m51546a(this.musicFeedId, finderFeedReportObject.musicFeedId) && C46238a.m51546a(Integer.valueOf(this.draftId), Integer.valueOf(finderFeedReportObject.draftId)) && C46238a.m51546a(Integer.valueOf(this.fromDraft), Integer.valueOf(finderFeedReportObject.fromDraft)) && C46238a.m51546a(this.flowId, finderFeedReportObject.flowId) && C46238a.m51546a(Integer.valueOf(this.mpError), Integer.valueOf(finderFeedReportObject.mpError)) && C46238a.m51546a(Integer.valueOf(this.waitingPostCount), Integer.valueOf(finderFeedReportObject.waitingPostCount)) && C46238a.m51546a(this.originColorSpace, finderFeedReportObject.originColorSpace) && C46238a.m51546a(this.activeInfo, finderFeedReportObject.activeInfo) && C46238a.m51546a(this.tempateInfo, finderFeedReportObject.tempateInfo) && C46238a.m51546a(Integer.valueOf(this.is_change_product_title), Integer.valueOf(finderFeedReportObject.is_change_product_title)) && C46238a.m51546a(Integer.valueOf(this.recommend_lbs_position), Integer.valueOf(finderFeedReportObject.recommend_lbs_position)) && C46238a.m51546a(this.clientKvReportInfo, finderFeedReportObject.clientKvReportInfo);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.sessionId;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.enterScene);
            aVar.mo74318e(3, this.exitPageId);
            aVar.mo74321h(4, this.enterTakePhotoTime);
            aVar.mo74321h(5, this.enterVideoEditTime);
            aVar.mo74321h(6, this.sendOrExitButtonTime);
            aVar.mo74321h(7, this.videoRecordTime);
            aVar.mo74318e(8, this.videoSource);
            aVar.mo74318e(9, this.videoEmojiCount);
            aVar.mo74318e(10, this.videoWordingCount);
            String str2 = this.videoMusicId;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            aVar.mo74318e(12, this.videoMusicIndex);
            aVar.mo74318e(13, this.videoMusicSearch);
            aVar.mo74318e(14, this.videoPostType);
            String str3 = this.videoMediaInfo;
            if (str3 != null) {
                aVar.mo74323j(15, str3);
            }
            aVar.mo74318e(16, this.existDesc);
            aVar.mo74318e(17, this.descCount);
            aVar.mo74318e(18, this.descEmojiCount);
            String str4 = this.actionTrace;
            if (str4 != null) {
                aVar.mo74323j(19, str4);
            }
            aVar.mo74318e(20, this.existLocation);
            String str5 = this.link;
            if (str5 != null) {
                aVar.mo74323j(21, str5);
            }
            aVar.mo74318e(22, this.draft);
            aVar.mo74321h(23, this.cdnEndTime);
            aVar.mo74321h(24, this.remuxEndTime);
            aVar.mo74320g(25, 8, this.mediaList);
            aVar.mo74318e(26, this.retryCount);
            aVar.mo74318e(27, this.isBeauty);
            aVar.mo74318e(28, this.isDurationCut);
            String str6 = this.beforeCutMediaPath;
            if (str6 != null) {
                aVar.mo74323j(29, str6);
            }
            aVar.mo74318e(30, this.isMultiShot);
            aVar.mo74318e(31, this.multiShotChangeCnt);
            aVar.mo74318e(32, this.multiShotClickCnt);
            aVar.mo74318e(33, this.multiShotSuccessCnt);
            aVar.mo74318e(35, this.multiShotVideoCnt);
            aVar.mo74318e(36, this.videoSubType);
            String str7 = this.postId;
            if (str7 != null) {
                aVar.mo74323j(37, str7);
            }
            String str8 = this.editId;
            if (str8 != null) {
                aVar.mo74323j(38, str8);
            }
            aVar.mo74318e(39, this.mentionCount);
            aVar.mo74318e(40, this.clickMentionCount);
            aVar.mo74318e(41, this.clickSucMentionCount);
            aVar.mo74318e(42, this.mentionRepeatCount);
            aVar.mo74318e(43, this.lbsFlag);
            C64311db1 db12 = this.selectLocation;
            if (db12 != null) {
                aVar.mo74322i(44, db12.computeSize());
                this.selectLocation.writeFields(aVar);
            }
            aVar.mo74318e(45, this.remuxType);
            aVar.mo74318e(46, this.uploadLogicError);
            aVar.mo74318e(47, this.postStage);
            aVar.mo74318e(48, this.cgiErrorCode);
            aVar.mo74318e(49, this.cgiErrorType);
            String str9 = this.clickId;
            if (str9 != null) {
                aVar.mo74323j(50, str9);
            }
            aVar.mo74318e(51, this.soundTrackType);
            String str10 = this.followSoundTrackId;
            if (str10 != null) {
                aVar.mo74323j(52, str10);
            }
            aVar.mo74318e(53, this.megaCgiErrorCode);
            aVar.mo74318e(54, this.megaCgiErrorType);
            aVar.mo74318e(55, this.musicType);
            aVar.mo74318e(56, this.longVideoSizeInvalid);
            aVar.mo74318e(57, this.mediaProcessCost);
            aVar.mo74318e(58, this.uploadCost);
            aVar.mo74321h(59, this.uploadMediaTotalSize);
            aVar.mo74318e(60, this.postTaskCost);
            aVar.mo74318e(61, this.clickRepostCount);
            aVar.mo74318e(62, this.dumpCgiErrorCode);
            aVar.mo74318e(63, this.dumpCgiErrorType);
            aVar.mo74318e(64, this.sdkShareType);
            String str11 = this.forwardingAppId;
            if (str11 != null) {
                aVar.mo74323j(65, str11);
            }
            String str12 = this.topicActivityId;
            if (str12 != null) {
                aVar.mo74323j(66, str12);
            }
            aVar.mo74318e(67, this.topicActivityType);
            aVar.mo74318e(68, this.draftType);
            String str13 = this.musicFeedId;
            if (str13 != null) {
                aVar.mo74323j(69, str13);
            }
            aVar.mo74318e(70, this.draftId);
            aVar.mo74318e(71, this.fromDraft);
            String str14 = this.flowId;
            if (str14 != null) {
                aVar.mo74323j(72, str14);
            }
            aVar.mo74318e(73, this.mpError);
            aVar.mo74318e(74, this.waitingPostCount);
            String str15 = this.originColorSpace;
            if (str15 != null) {
                aVar.mo74323j(75, str15);
            }
            String str16 = this.activeInfo;
            if (str16 != null) {
                aVar.mo74323j(76, str16);
            }
            String str17 = this.tempateInfo;
            if (str17 != null) {
                aVar.mo74323j(77, str17);
            }
            aVar.mo74318e(78, this.is_change_product_title);
            aVar.mo74318e(79, this.recommend_lbs_position);
            String str18 = this.clientKvReportInfo;
            if (str18 != null) {
                aVar.mo74323j(80, str18);
            }
            return 0;
        } else if (i2 == 1) {
            String str19 = this.sessionId;
            if (str19 != null) {
                i3 = C52418a.m58683j(1, str19) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.enterScene) + C52418a.m58678e(3, this.exitPageId) + C52418a.m58681h(4, this.enterTakePhotoTime) + C52418a.m58681h(5, this.enterVideoEditTime) + C52418a.m58681h(6, this.sendOrExitButtonTime) + C52418a.m58681h(7, this.videoRecordTime) + C52418a.m58678e(8, this.videoSource) + C52418a.m58678e(9, this.videoEmojiCount) + C52418a.m58678e(10, this.videoWordingCount);
            String str20 = this.videoMusicId;
            if (str20 != null) {
                e += C52418a.m58683j(11, str20);
            }
            int e2 = e + C52418a.m58678e(12, this.videoMusicIndex) + C52418a.m58678e(13, this.videoMusicSearch) + C52418a.m58678e(14, this.videoPostType);
            String str21 = this.videoMediaInfo;
            if (str21 != null) {
                e2 += C52418a.m58683j(15, str21);
            }
            int e3 = e2 + C52418a.m58678e(16, this.existDesc) + C52418a.m58678e(17, this.descCount) + C52418a.m58678e(18, this.descEmojiCount);
            String str22 = this.actionTrace;
            if (str22 != null) {
                e3 += C52418a.m58683j(19, str22);
            }
            int e4 = e3 + C52418a.m58678e(20, this.existLocation);
            String str23 = this.link;
            if (str23 != null) {
                e4 += C52418a.m58683j(21, str23);
            }
            int e5 = e4 + C52418a.m58678e(22, this.draft) + C52418a.m58681h(23, this.cdnEndTime) + C52418a.m58681h(24, this.remuxEndTime) + C52418a.m58680g(25, 8, this.mediaList) + C52418a.m58678e(26, this.retryCount) + C52418a.m58678e(27, this.isBeauty) + C52418a.m58678e(28, this.isDurationCut);
            String str24 = this.beforeCutMediaPath;
            if (str24 != null) {
                e5 += C52418a.m58683j(29, str24);
            }
            int e6 = e5 + C52418a.m58678e(30, this.isMultiShot) + C52418a.m58678e(31, this.multiShotChangeCnt) + C52418a.m58678e(32, this.multiShotClickCnt) + C52418a.m58678e(33, this.multiShotSuccessCnt) + C52418a.m58678e(35, this.multiShotVideoCnt) + C52418a.m58678e(36, this.videoSubType);
            String str25 = this.postId;
            if (str25 != null) {
                e6 += C52418a.m58683j(37, str25);
            }
            String str26 = this.editId;
            if (str26 != null) {
                e6 += C52418a.m58683j(38, str26);
            }
            int e7 = e6 + C52418a.m58678e(39, this.mentionCount) + C52418a.m58678e(40, this.clickMentionCount) + C52418a.m58678e(41, this.clickSucMentionCount) + C52418a.m58678e(42, this.mentionRepeatCount) + C52418a.m58678e(43, this.lbsFlag);
            C64311db1 db13 = this.selectLocation;
            if (db13 != null) {
                e7 += C52418a.m58682i(44, db13.computeSize());
            }
            int e8 = e7 + C52418a.m58678e(45, this.remuxType) + C52418a.m58678e(46, this.uploadLogicError) + C52418a.m58678e(47, this.postStage) + C52418a.m58678e(48, this.cgiErrorCode) + C52418a.m58678e(49, this.cgiErrorType);
            String str27 = this.clickId;
            if (str27 != null) {
                e8 += C52418a.m58683j(50, str27);
            }
            int e9 = e8 + C52418a.m58678e(51, this.soundTrackType);
            String str28 = this.followSoundTrackId;
            if (str28 != null) {
                e9 += C52418a.m58683j(52, str28);
            }
            int e15 = e9 + C52418a.m58678e(53, this.megaCgiErrorCode) + C52418a.m58678e(54, this.megaCgiErrorType) + C52418a.m58678e(55, this.musicType) + C52418a.m58678e(56, this.longVideoSizeInvalid) + C52418a.m58678e(57, this.mediaProcessCost) + C52418a.m58678e(58, this.uploadCost) + C52418a.m58681h(59, this.uploadMediaTotalSize) + C52418a.m58678e(60, this.postTaskCost) + C52418a.m58678e(61, this.clickRepostCount) + C52418a.m58678e(62, this.dumpCgiErrorCode) + C52418a.m58678e(63, this.dumpCgiErrorType) + C52418a.m58678e(64, this.sdkShareType);
            String str29 = this.forwardingAppId;
            if (str29 != null) {
                e15 += C52418a.m58683j(65, str29);
            }
            String str30 = this.topicActivityId;
            if (str30 != null) {
                e15 += C52418a.m58683j(66, str30);
            }
            int e16 = e15 + C52418a.m58678e(67, this.topicActivityType) + C52418a.m58678e(68, this.draftType);
            String str31 = this.musicFeedId;
            if (str31 != null) {
                e16 += C52418a.m58683j(69, str31);
            }
            int e17 = e16 + C52418a.m58678e(70, this.draftId) + C52418a.m58678e(71, this.fromDraft);
            String str32 = this.flowId;
            if (str32 != null) {
                e17 += C52418a.m58683j(72, str32);
            }
            int e18 = e17 + C52418a.m58678e(73, this.mpError) + C52418a.m58678e(74, this.waitingPostCount);
            String str33 = this.originColorSpace;
            if (str33 != null) {
                e18 += C52418a.m58683j(75, str33);
            }
            String str34 = this.activeInfo;
            if (str34 != null) {
                e18 += C52418a.m58683j(76, str34);
            }
            String str35 = this.tempateInfo;
            if (str35 != null) {
                e18 += C52418a.m58683j(77, str35);
            }
            int e19 = e18 + C52418a.m58678e(78, this.is_change_product_title) + C52418a.m58678e(79, this.recommend_lbs_position);
            String str36 = this.clientKvReportInfo;
            return str36 != null ? e19 + C52418a.m58683j(80, str36) : e19;
        } else if (i2 == 2) {
            this.mediaList.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            FinderFeedReportObject finderFeedReportObject = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderFeedReportObject.sessionId = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    finderFeedReportObject.enterScene = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    finderFeedReportObject.exitPageId = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    finderFeedReportObject.enterTakePhotoTime = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    finderFeedReportObject.enterVideoEditTime = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    finderFeedReportObject.sendOrExitButtonTime = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    finderFeedReportObject.videoRecordTime = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    finderFeedReportObject.videoSource = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    finderFeedReportObject.videoEmojiCount = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    finderFeedReportObject.videoWordingCount = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    finderFeedReportObject.videoMusicId = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    finderFeedReportObject.videoMusicIndex = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    finderFeedReportObject.videoMusicSearch = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    finderFeedReportObject.videoPostType = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    finderFeedReportObject.videoMediaInfo = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    finderFeedReportObject.existDesc = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    finderFeedReportObject.descCount = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    finderFeedReportObject.descEmojiCount = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    finderFeedReportObject.actionTrace = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    finderFeedReportObject.existLocation = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    finderFeedReportObject.link = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    finderFeedReportObject.draft = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    finderFeedReportObject.cdnEndTime = aVar3.mo141631i(intValue);
                    return 0;
                case 24:
                    finderFeedReportObject.remuxEndTime = aVar3.mo141631i(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        FinderMediaReportObject finderMediaReportObject = new FinderMediaReportObject();
                        if (bArr != null && bArr.length > 0) {
                            finderMediaReportObject.parseFrom(bArr);
                        }
                        finderFeedReportObject.mediaList.add(finderMediaReportObject);
                    }
                    return 0;
                case 26:
                    finderFeedReportObject.retryCount = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    finderFeedReportObject.isBeauty = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    finderFeedReportObject.isDurationCut = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    finderFeedReportObject.beforeCutMediaPath = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    finderFeedReportObject.isMultiShot = aVar3.mo141629g(intValue);
                    return 0;
                case 31:
                    finderFeedReportObject.multiShotChangeCnt = aVar3.mo141629g(intValue);
                    return 0;
                case 32:
                    finderFeedReportObject.multiShotClickCnt = aVar3.mo141629g(intValue);
                    return 0;
                case 33:
                    finderFeedReportObject.multiShotSuccessCnt = aVar3.mo141629g(intValue);
                    return 0;
                case 35:
                    finderFeedReportObject.multiShotVideoCnt = aVar3.mo141629g(intValue);
                    return 0;
                case 36:
                    finderFeedReportObject.videoSubType = aVar3.mo141629g(intValue);
                    return 0;
                case 37:
                    finderFeedReportObject.postId = aVar3.mo141633k(intValue);
                    return 0;
                case 38:
                    finderFeedReportObject.editId = aVar3.mo141633k(intValue);
                    return 0;
                case 39:
                    finderFeedReportObject.mentionCount = aVar3.mo141629g(intValue);
                    return 0;
                case 40:
                    finderFeedReportObject.clickMentionCount = aVar3.mo141629g(intValue);
                    return 0;
                case 41:
                    finderFeedReportObject.clickSucMentionCount = aVar3.mo141629g(intValue);
                    return 0;
                case 42:
                    finderFeedReportObject.mentionRepeatCount = aVar3.mo141629g(intValue);
                    return 0;
                case 43:
                    finderFeedReportObject.lbsFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 44:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64311db1 db14 = new C64311db1();
                        if (bArr2 != null && bArr2.length > 0) {
                            db14.parseFrom(bArr2);
                        }
                        finderFeedReportObject.selectLocation = db14;
                    }
                    return 0;
                case 45:
                    finderFeedReportObject.remuxType = aVar3.mo141629g(intValue);
                    return 0;
                case 46:
                    finderFeedReportObject.uploadLogicError = aVar3.mo141629g(intValue);
                    return 0;
                case 47:
                    finderFeedReportObject.postStage = aVar3.mo141629g(intValue);
                    return 0;
                case 48:
                    finderFeedReportObject.cgiErrorCode = aVar3.mo141629g(intValue);
                    return 0;
                case 49:
                    finderFeedReportObject.cgiErrorType = aVar3.mo141629g(intValue);
                    return 0;
                case 50:
                    finderFeedReportObject.clickId = aVar3.mo141633k(intValue);
                    return 0;
                case 51:
                    finderFeedReportObject.soundTrackType = aVar3.mo141629g(intValue);
                    return 0;
                case 52:
                    finderFeedReportObject.followSoundTrackId = aVar3.mo141633k(intValue);
                    return 0;
                case 53:
                    finderFeedReportObject.megaCgiErrorCode = aVar3.mo141629g(intValue);
                    return 0;
                case 54:
                    finderFeedReportObject.megaCgiErrorType = aVar3.mo141629g(intValue);
                    return 0;
                case 55:
                    finderFeedReportObject.musicType = aVar3.mo141629g(intValue);
                    return 0;
                case 56:
                    finderFeedReportObject.longVideoSizeInvalid = aVar3.mo141629g(intValue);
                    return 0;
                case 57:
                    finderFeedReportObject.mediaProcessCost = aVar3.mo141629g(intValue);
                    return 0;
                case 58:
                    finderFeedReportObject.uploadCost = aVar3.mo141629g(intValue);
                    return 0;
                case 59:
                    finderFeedReportObject.uploadMediaTotalSize = aVar3.mo141631i(intValue);
                    return 0;
                case 60:
                    finderFeedReportObject.postTaskCost = aVar3.mo141629g(intValue);
                    return 0;
                case 61:
                    finderFeedReportObject.clickRepostCount = aVar3.mo141629g(intValue);
                    return 0;
                case 62:
                    finderFeedReportObject.dumpCgiErrorCode = aVar3.mo141629g(intValue);
                    return 0;
                case 63:
                    finderFeedReportObject.dumpCgiErrorType = aVar3.mo141629g(intValue);
                    return 0;
                case 64:
                    finderFeedReportObject.sdkShareType = aVar3.mo141629g(intValue);
                    return 0;
                case 65:
                    finderFeedReportObject.forwardingAppId = aVar3.mo141633k(intValue);
                    return 0;
                case 66:
                    finderFeedReportObject.topicActivityId = aVar3.mo141633k(intValue);
                    return 0;
                case 67:
                    finderFeedReportObject.topicActivityType = aVar3.mo141629g(intValue);
                    return 0;
                case 68:
                    finderFeedReportObject.draftType = aVar3.mo141629g(intValue);
                    return 0;
                case 69:
                    finderFeedReportObject.musicFeedId = aVar3.mo141633k(intValue);
                    return 0;
                case 70:
                    finderFeedReportObject.draftId = aVar3.mo141629g(intValue);
                    return 0;
                case 71:
                    finderFeedReportObject.fromDraft = aVar3.mo141629g(intValue);
                    return 0;
                case 72:
                    finderFeedReportObject.flowId = aVar3.mo141633k(intValue);
                    return 0;
                case 73:
                    finderFeedReportObject.mpError = aVar3.mo141629g(intValue);
                    return 0;
                case 74:
                    finderFeedReportObject.waitingPostCount = aVar3.mo141629g(intValue);
                    return 0;
                case 75:
                    finderFeedReportObject.originColorSpace = aVar3.mo141633k(intValue);
                    return 0;
                case 76:
                    finderFeedReportObject.activeInfo = aVar3.mo141633k(intValue);
                    return 0;
                case 77:
                    finderFeedReportObject.tempateInfo = aVar3.mo141633k(intValue);
                    return 0;
                case 78:
                    finderFeedReportObject.is_change_product_title = aVar3.mo141629g(intValue);
                    return 0;
                case 79:
                    finderFeedReportObject.recommend_lbs_position = aVar3.mo141629g(intValue);
                    return 0;
                case 80:
                    finderFeedReportObject.clientKvReportInfo = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderFeedReportObject setActionTrace(String str) {
        this.actionTrace = str;
        return this;
    }

    public FinderFeedReportObject setActiveInfo(String str) {
        this.activeInfo = str;
        return this;
    }

    public FinderFeedReportObject setBeforeCutMediaPath(String str) {
        this.beforeCutMediaPath = str;
        return this;
    }

    public FinderFeedReportObject setCdnEndTime(long j) {
        this.cdnEndTime = j;
        return this;
    }

    public FinderFeedReportObject setCgiErrorCode(int i) {
        this.cgiErrorCode = i;
        return this;
    }

    public FinderFeedReportObject setCgiErrorType(int i) {
        this.cgiErrorType = i;
        return this;
    }

    public FinderFeedReportObject setClickId(String str) {
        this.clickId = str;
        return this;
    }

    public FinderFeedReportObject setClickMentionCount(int i) {
        this.clickMentionCount = i;
        return this;
    }

    public FinderFeedReportObject setClickRepostCount(int i) {
        this.clickRepostCount = i;
        return this;
    }

    public FinderFeedReportObject setClickSucMentionCount(int i) {
        this.clickSucMentionCount = i;
        return this;
    }

    public FinderFeedReportObject setClientKvReportInfo(String str) {
        this.clientKvReportInfo = str;
        return this;
    }

    public FinderFeedReportObject setDescCount(int i) {
        this.descCount = i;
        return this;
    }

    public FinderFeedReportObject setDescEmojiCount(int i) {
        this.descEmojiCount = i;
        return this;
    }

    public FinderFeedReportObject setDraft(int i) {
        this.draft = i;
        return this;
    }

    public FinderFeedReportObject setDraftId(int i) {
        this.draftId = i;
        return this;
    }

    public FinderFeedReportObject setDraftType(int i) {
        this.draftType = i;
        return this;
    }

    public FinderFeedReportObject setDumpCgiErrorCode(int i) {
        this.dumpCgiErrorCode = i;
        return this;
    }

    public FinderFeedReportObject setDumpCgiErrorType(int i) {
        this.dumpCgiErrorType = i;
        return this;
    }

    public FinderFeedReportObject setEditId(String str) {
        this.editId = str;
        return this;
    }

    public FinderFeedReportObject setEnterScene(int i) {
        this.enterScene = i;
        return this;
    }

    public FinderFeedReportObject setEnterTakePhotoTime(long j) {
        this.enterTakePhotoTime = j;
        return this;
    }

    public FinderFeedReportObject setEnterVideoEditTime(long j) {
        this.enterVideoEditTime = j;
        return this;
    }

    public FinderFeedReportObject setExistDesc(int i) {
        this.existDesc = i;
        return this;
    }

    public FinderFeedReportObject setExistLocation(int i) {
        this.existLocation = i;
        return this;
    }

    public FinderFeedReportObject setExitPageId(int i) {
        this.exitPageId = i;
        return this;
    }

    public FinderFeedReportObject setFlowId(String str) {
        this.flowId = str;
        return this;
    }

    public FinderFeedReportObject setFollowSoundTrackId(String str) {
        this.followSoundTrackId = str;
        return this;
    }

    public FinderFeedReportObject setForwardingAppId(String str) {
        this.forwardingAppId = str;
        return this;
    }

    public FinderFeedReportObject setFromDraft(int i) {
        this.fromDraft = i;
        return this;
    }

    public FinderFeedReportObject setIsBeauty(int i) {
        this.isBeauty = i;
        return this;
    }

    public FinderFeedReportObject setIsDurationCut(int i) {
        this.isDurationCut = i;
        return this;
    }

    public FinderFeedReportObject setIsMultiShot(int i) {
        this.isMultiShot = i;
        return this;
    }

    public FinderFeedReportObject setIs_change_product_title(int i) {
        this.is_change_product_title = i;
        return this;
    }

    public FinderFeedReportObject setLbsFlag(int i) {
        this.lbsFlag = i;
        return this;
    }

    public FinderFeedReportObject setLink(String str) {
        this.link = str;
        return this;
    }

    public FinderFeedReportObject setLongVideoSizeInvalid(int i) {
        this.longVideoSizeInvalid = i;
        return this;
    }

    public FinderFeedReportObject setMediaList(LinkedList<FinderMediaReportObject> linkedList) {
        this.mediaList = linkedList;
        return this;
    }

    public FinderFeedReportObject setMediaProcessCost(int i) {
        this.mediaProcessCost = i;
        return this;
    }

    public FinderFeedReportObject setMegaCgiErrorCode(int i) {
        this.megaCgiErrorCode = i;
        return this;
    }

    public FinderFeedReportObject setMegaCgiErrorType(int i) {
        this.megaCgiErrorType = i;
        return this;
    }

    public FinderFeedReportObject setMentionCount(int i) {
        this.mentionCount = i;
        return this;
    }

    public FinderFeedReportObject setMentionRepeatCount(int i) {
        this.mentionRepeatCount = i;
        return this;
    }

    public FinderFeedReportObject setMpError(int i) {
        this.mpError = i;
        return this;
    }

    public FinderFeedReportObject setMultiShotChangeCnt(int i) {
        this.multiShotChangeCnt = i;
        return this;
    }

    public FinderFeedReportObject setMultiShotClickCnt(int i) {
        this.multiShotClickCnt = i;
        return this;
    }

    public FinderFeedReportObject setMultiShotSuccessCnt(int i) {
        this.multiShotSuccessCnt = i;
        return this;
    }

    public FinderFeedReportObject setMultiShotVideoCnt(int i) {
        this.multiShotVideoCnt = i;
        return this;
    }

    public FinderFeedReportObject setMusicFeedId(String str) {
        this.musicFeedId = str;
        return this;
    }

    public FinderFeedReportObject setMusicType(int i) {
        this.musicType = i;
        return this;
    }

    public FinderFeedReportObject setOriginColorSpace(String str) {
        this.originColorSpace = str;
        return this;
    }

    public FinderFeedReportObject setPostId(String str) {
        this.postId = str;
        return this;
    }

    public FinderFeedReportObject setPostStage(int i) {
        this.postStage = i;
        return this;
    }

    public FinderFeedReportObject setPostTaskCost(int i) {
        this.postTaskCost = i;
        return this;
    }

    public FinderFeedReportObject setRecommend_lbs_position(int i) {
        this.recommend_lbs_position = i;
        return this;
    }

    public FinderFeedReportObject setRemuxEndTime(long j) {
        this.remuxEndTime = j;
        return this;
    }

    public FinderFeedReportObject setRemuxType(int i) {
        this.remuxType = i;
        return this;
    }

    public FinderFeedReportObject setRetryCount(int i) {
        this.retryCount = i;
        return this;
    }

    public FinderFeedReportObject setSdkShareType(int i) {
        this.sdkShareType = i;
        return this;
    }

    public FinderFeedReportObject setSelectLocation(C64311db1 db12) {
        this.selectLocation = db12;
        return this;
    }

    public FinderFeedReportObject setSendOrExitButtonTime(long j) {
        this.sendOrExitButtonTime = j;
        return this;
    }

    public FinderFeedReportObject setSessionId(String str) {
        this.sessionId = str;
        return this;
    }

    public FinderFeedReportObject setSoundTrackType(int i) {
        this.soundTrackType = i;
        return this;
    }

    public FinderFeedReportObject setTempateInfo(String str) {
        this.tempateInfo = str;
        return this;
    }

    public FinderFeedReportObject setTopicActivityId(String str) {
        this.topicActivityId = str;
        return this;
    }

    public FinderFeedReportObject setTopicActivityType(int i) {
        this.topicActivityType = i;
        return this;
    }

    public FinderFeedReportObject setUploadCost(int i) {
        this.uploadCost = i;
        return this;
    }

    public FinderFeedReportObject setUploadLogicError(int i) {
        this.uploadLogicError = i;
        return this;
    }

    public FinderFeedReportObject setUploadMediaTotalSize(long j) {
        this.uploadMediaTotalSize = j;
        return this;
    }

    public FinderFeedReportObject setVideoEmojiCount(int i) {
        this.videoEmojiCount = i;
        return this;
    }

    public FinderFeedReportObject setVideoMediaInfo(String str) {
        this.videoMediaInfo = str;
        return this;
    }

    public FinderFeedReportObject setVideoMusicId(String str) {
        this.videoMusicId = str;
        return this;
    }

    public FinderFeedReportObject setVideoMusicIndex(int i) {
        this.videoMusicIndex = i;
        return this;
    }

    public FinderFeedReportObject setVideoMusicSearch(int i) {
        this.videoMusicSearch = i;
        return this;
    }

    public FinderFeedReportObject setVideoPostType(int i) {
        this.videoPostType = i;
        return this;
    }

    public FinderFeedReportObject setVideoRecordTime(long j) {
        this.videoRecordTime = j;
        return this;
    }

    public FinderFeedReportObject setVideoSource(int i) {
        this.videoSource = i;
        return this;
    }

    public FinderFeedReportObject setVideoSubType(int i) {
        this.videoSubType = i;
        return this;
    }

    public FinderFeedReportObject setVideoWordingCount(int i) {
        this.videoWordingCount = i;
        return this;
    }

    public FinderFeedReportObject setWaitingPostCount(int i) {
        this.waitingPostCount = i;
        return this;
    }
}
