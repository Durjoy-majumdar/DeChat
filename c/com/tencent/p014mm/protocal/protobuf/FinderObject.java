package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C48872bl0;
import te3.C49150di1;
import te3.C49296ek1;
import te3.C49426fi1;
import te3.C50005jl1;
import te3.C50124kf1;
import te3.C50425mn1;
import te3.C50534nf1;
import te3.C50673of1;
import te3.C51231se1;
import te3.C51388tf0;
import te3.C51389tf1;
import te3.C51542ug1;
import te3.C51583uq0;
import te3.C51682vd1;
import te3.C64273c21;
import te3.C64827xe1;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderObject */
public class FinderObject extends C47465a {
    public int adFlag;
    public C51231se1 adInfo;
    public C51388tf0 attachmentList;
    public long block_cgi_flag;
    public C64827xe1 client_local_buffer;
    public int commentClose;
    public int commentCount;
    public LinkedList<FinderCommentInfo> commentList = new LinkedList<>();
    public FinderContact contact;
    public C89349b cookie;
    public int createtime;
    public String debugMessage;
    public int deletetime;
    public long displayId;
    public String displayidDiscarded;
    public int event_status_flag;
    public int favCount;
    public int favFlag;
    public C49150di1 finder_promotion_jumpinfo;
    public C49296ek1 flow_card_recommand_reason;
    public int foldedFlag;
    public C48872bl0 foldedLayout;
    public int followCount;
    public int follow_feed_count;
    public int forwardCount;
    public int forward_style;
    public LinkedList<FinderCommentInfo> friendCommentList = new LinkedList<>();
    public int friendLikeCount;
    public int friend_fav_count;
    public int func_flag;
    public C50534nf1 hotTopics;
    public C50673of1 hotWordInfo;

    /* renamed from: id */
    public long f164794id;
    public int incFriendLikeCount;
    public String inner_recommend_reason;
    public String internal_feedback_url;
    public C51583uq0 ip_region_info;
    public int is_poi_same_city;
    public C89349b likeBuffer;
    public int likeCount;
    public int likeFlag;
    public LinkedList<FinderCommentInfo> likeList = new LinkedList<>();
    public C64273c21 liveInfo;
    public C89349b live_related_last_buffer;
    public int mentionedListSelected;
    public LinkedList<FinderContact> mentionedUserContact = new LinkedList<>();
    public int msgEventFlag;
    public String msgId;
    public C51682vd1 music_realtime_info;
    public String nickname;
    public FinderObjectDesc objectDesc;
    public String objectNonceId;
    public int objectStatus;
    public int objectType;
    public C50124kf1 object_extend;
    public int orgRecommendType;
    public FinderContact originalContact;
    public int originalFlag;
    public int permissionFlag;
    public C51389tf1 place_holder_info;
    public C51542ug1 playhistory_info;
    public String posTriggerConfig;
    public int preview_flag;
    public int privateFlag;
    public C49426fi1 publisher_info;
    public int readCount;
    public String recommendReason;
    public int recommendReasonType;
    public int recommendType;
    public LinkedList<String> recommenderList = new LinkedList<>();
    public FinderContact refObjectContact;
    public long refObjectFlag;
    public long refObjectId;
    public String refObjectNonceId;
    public int ringtone_count;
    public int secondaryShowFlag;
    public String sendShareFavWording;
    public String sessionBuffer;
    public boolean showOriginal;
    public C50005jl1 snsShareInfo;
    public int stickyTime;
    public String tipsWording;
    public C50425mn1 tips_info;
    public int urlValidDuration;
    public String username;
    public String verify_info_buf;
    public int warnFlag;
    public String warnWording;
    public int wxStatusPermissionFlag;
    public String wx_status_icon_id;
    public int wx_status_ref_count;
    public String wxa_game_export_id;

    public static final FinderObject create() {
        return new FinderObject();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderObject)) {
            return false;
        }
        FinderObject finderObject = (FinderObject) aVar;
        return C46238a.m51546a(Long.valueOf(this.f164794id), Long.valueOf(finderObject.f164794id)) && C46238a.m51546a(this.nickname, finderObject.nickname) && C46238a.m51546a(this.username, finderObject.username) && C46238a.m51546a(this.objectDesc, finderObject.objectDesc) && C46238a.m51546a(Integer.valueOf(this.createtime), Integer.valueOf(finderObject.createtime)) && C46238a.m51546a(Integer.valueOf(this.likeFlag), Integer.valueOf(finderObject.likeFlag)) && C46238a.m51546a(this.likeList, finderObject.likeList) && C46238a.m51546a(this.commentList, finderObject.commentList) && C46238a.m51546a(Integer.valueOf(this.forwardCount), Integer.valueOf(finderObject.forwardCount)) && C46238a.m51546a(this.contact, finderObject.contact) && C46238a.m51546a(this.displayidDiscarded, finderObject.displayidDiscarded) && C46238a.m51546a(this.recommenderList, finderObject.recommenderList) && C46238a.m51546a(Long.valueOf(this.displayId), Long.valueOf(finderObject.displayId)) && C46238a.m51546a(Integer.valueOf(this.likeCount), Integer.valueOf(finderObject.likeCount)) && C46238a.m51546a(Integer.valueOf(this.commentCount), Integer.valueOf(finderObject.commentCount)) && C46238a.m51546a(this.recommendReason, finderObject.recommendReason) && C46238a.m51546a(Integer.valueOf(this.readCount), Integer.valueOf(finderObject.readCount)) && C46238a.m51546a(Integer.valueOf(this.deletetime), Integer.valueOf(finderObject.deletetime)) && C46238a.m51546a(Integer.valueOf(this.commentClose), Integer.valueOf(finderObject.commentClose)) && C46238a.m51546a(Long.valueOf(this.refObjectFlag), Long.valueOf(finderObject.refObjectFlag)) && C46238a.m51546a(Long.valueOf(this.refObjectId), Long.valueOf(finderObject.refObjectId)) && C46238a.m51546a(this.refObjectContact, finderObject.refObjectContact) && C46238a.m51546a(Integer.valueOf(this.recommendType), Integer.valueOf(finderObject.recommendType)) && C46238a.m51546a(Integer.valueOf(this.friendLikeCount), Integer.valueOf(finderObject.friendLikeCount)) && C46238a.m51546a(this.objectNonceId, finderObject.objectNonceId) && C46238a.m51546a(this.refObjectNonceId, finderObject.refObjectNonceId) && C46238a.m51546a(Integer.valueOf(this.objectStatus), Integer.valueOf(finderObject.objectStatus)) && C46238a.m51546a(this.sendShareFavWording, finderObject.sendShareFavWording) && C46238a.m51546a(Integer.valueOf(this.originalFlag), Integer.valueOf(finderObject.originalFlag)) && C46238a.m51546a(Integer.valueOf(this.secondaryShowFlag), Integer.valueOf(finderObject.secondaryShowFlag)) && C46238a.m51546a(this.tipsWording, finderObject.tipsWording) && C46238a.m51546a(Integer.valueOf(this.orgRecommendType), Integer.valueOf(finderObject.orgRecommendType)) && C46238a.m51546a(this.mentionedUserContact, finderObject.mentionedUserContact) && C46238a.m51546a(this.sessionBuffer, finderObject.sessionBuffer) && C46238a.m51546a(Integer.valueOf(this.warnFlag), Integer.valueOf(finderObject.warnFlag)) && C46238a.m51546a(this.warnWording, finderObject.warnWording) && C46238a.m51546a(this.liveInfo, finderObject.liveInfo) && C46238a.m51546a(Integer.valueOf(this.favCount), Integer.valueOf(finderObject.favCount)) && C46238a.m51546a(Integer.valueOf(this.favFlag), Integer.valueOf(finderObject.favFlag)) && C46238a.m51546a(Integer.valueOf(this.foldedFlag), Integer.valueOf(finderObject.foldedFlag)) && C46238a.m51546a(this.foldedLayout, finderObject.foldedLayout) && C46238a.m51546a(Integer.valueOf(this.recommendReasonType), Integer.valueOf(finderObject.recommendReasonType)) && C46238a.m51546a(Integer.valueOf(this.urlValidDuration), Integer.valueOf(finderObject.urlValidDuration)) && C46238a.m51546a(Integer.valueOf(this.forward_style), Integer.valueOf(finderObject.forward_style)) && C46238a.m51546a(this.posTriggerConfig, finderObject.posTriggerConfig) && C46238a.m51546a(Integer.valueOf(this.privateFlag), Integer.valueOf(finderObject.privateFlag)) && C46238a.m51546a(Integer.valueOf(this.msgEventFlag), Integer.valueOf(finderObject.msgEventFlag)) && C46238a.m51546a(this.msgId, finderObject.msgId) && C46238a.m51546a(Integer.valueOf(this.incFriendLikeCount), Integer.valueOf(finderObject.incFriendLikeCount)) && C46238a.m51546a(this.debugMessage, finderObject.debugMessage) && C46238a.m51546a(this.likeBuffer, finderObject.likeBuffer) && C46238a.m51546a(Integer.valueOf(this.permissionFlag), Integer.valueOf(finderObject.permissionFlag)) && C46238a.m51546a(Integer.valueOf(this.stickyTime), Integer.valueOf(finderObject.stickyTime)) && C46238a.m51546a(this.hotTopics, finderObject.hotTopics) && C46238a.m51546a(this.attachmentList, finderObject.attachmentList) && C46238a.m51546a(Integer.valueOf(this.objectType), Integer.valueOf(finderObject.objectType)) && C46238a.m51546a(this.snsShareInfo, finderObject.snsShareInfo) && C46238a.m51546a(Integer.valueOf(this.follow_feed_count), Integer.valueOf(finderObject.follow_feed_count)) && C46238a.m51546a(Integer.valueOf(this.event_status_flag), Integer.valueOf(finderObject.event_status_flag)) && C46238a.m51546a(Integer.valueOf(this.is_poi_same_city), Integer.valueOf(finderObject.is_poi_same_city)) && C46238a.m51546a(Integer.valueOf(this.mentionedListSelected), Integer.valueOf(finderObject.mentionedListSelected)) && C46238a.m51546a(this.verify_info_buf, finderObject.verify_info_buf) && C46238a.m51546a(Integer.valueOf(this.wx_status_ref_count), Integer.valueOf(finderObject.wx_status_ref_count)) && C46238a.m51546a(Integer.valueOf(this.wxStatusPermissionFlag), Integer.valueOf(finderObject.wxStatusPermissionFlag)) && C46238a.m51546a(this.adInfo, finderObject.adInfo) && C46238a.m51546a(this.friendCommentList, finderObject.friendCommentList) && C46238a.m51546a(this.hotWordInfo, finderObject.hotWordInfo) && C46238a.m51546a(Integer.valueOf(this.adFlag), Integer.valueOf(finderObject.adFlag)) && C46238a.m51546a(this.tips_info, finderObject.tips_info) && C46238a.m51546a(this.client_local_buffer, finderObject.client_local_buffer) && C46238a.m51546a(this.publisher_info, finderObject.publisher_info) && C46238a.m51546a(this.live_related_last_buffer, finderObject.live_related_last_buffer) && C46238a.m51546a(Integer.valueOf(this.followCount), Integer.valueOf(finderObject.followCount)) && C46238a.m51546a(this.cookie, finderObject.cookie) && C46238a.m51546a(Integer.valueOf(this.preview_flag), Integer.valueOf(finderObject.preview_flag)) && C46238a.m51546a(this.internal_feedback_url, finderObject.internal_feedback_url) && C46238a.m51546a(this.wxa_game_export_id, finderObject.wxa_game_export_id) && C46238a.m51546a(Integer.valueOf(this.ringtone_count), Integer.valueOf(finderObject.ringtone_count)) && C46238a.m51546a(this.wx_status_icon_id, finderObject.wx_status_icon_id) && C46238a.m51546a(Integer.valueOf(this.friend_fav_count), Integer.valueOf(finderObject.friend_fav_count)) && C46238a.m51546a(Integer.valueOf(this.func_flag), Integer.valueOf(finderObject.func_flag)) && C46238a.m51546a(this.place_holder_info, finderObject.place_holder_info) && C46238a.m51546a(this.originalContact, finderObject.originalContact) && C46238a.m51546a(this.inner_recommend_reason, finderObject.inner_recommend_reason) && C46238a.m51546a(Long.valueOf(this.block_cgi_flag), Long.valueOf(finderObject.block_cgi_flag)) && C46238a.m51546a(this.music_realtime_info, finderObject.music_realtime_info) && C46238a.m51546a(Boolean.valueOf(this.showOriginal), Boolean.valueOf(finderObject.showOriginal)) && C46238a.m51546a(this.playhistory_info, finderObject.playhistory_info) && C46238a.m51546a(this.finder_promotion_jumpinfo, finderObject.finder_promotion_jumpinfo) && C46238a.m51546a(this.flow_card_recommand_reason, finderObject.flow_card_recommand_reason) && C46238a.m51546a(this.ip_region_info, finderObject.ip_region_info) && C46238a.m51546a(this.object_extend, finderObject.object_extend);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f164794id);
            String str = this.nickname;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.username;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            FinderObjectDesc finderObjectDesc = this.objectDesc;
            if (finderObjectDesc != null) {
                aVar.mo74322i(4, finderObjectDesc.computeSize());
                this.objectDesc.writeFields(aVar);
            }
            aVar.mo74319f(5, this.createtime);
            aVar.mo74319f(6, this.likeFlag);
            aVar.mo74320g(7, 8, this.likeList);
            aVar.mo74320g(8, 8, this.commentList);
            aVar.mo74319f(9, this.forwardCount);
            FinderContact finderContact = this.contact;
            if (finderContact != null) {
                aVar.mo74322i(10, finderContact.computeSize());
                this.contact.writeFields(aVar);
            }
            String str3 = this.displayidDiscarded;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            aVar.mo74320g(12, 1, this.recommenderList);
            aVar.mo74321h(13, this.displayId);
            aVar.mo74319f(14, this.likeCount);
            aVar.mo74319f(15, this.commentCount);
            String str4 = this.recommendReason;
            if (str4 != null) {
                aVar.mo74323j(16, str4);
            }
            aVar.mo74319f(17, this.readCount);
            aVar.mo74319f(18, this.deletetime);
            aVar.mo74319f(19, this.commentClose);
            aVar.mo74321h(20, this.refObjectFlag);
            aVar.mo74321h(21, this.refObjectId);
            FinderContact finderContact2 = this.refObjectContact;
            if (finderContact2 != null) {
                aVar.mo74322i(22, finderContact2.computeSize());
                this.refObjectContact.writeFields(aVar);
            }
            aVar.mo74319f(23, this.recommendType);
            aVar.mo74319f(24, this.friendLikeCount);
            String str5 = this.objectNonceId;
            if (str5 != null) {
                aVar.mo74323j(25, str5);
            }
            String str6 = this.refObjectNonceId;
            if (str6 != null) {
                aVar.mo74323j(26, str6);
            }
            aVar.mo74319f(27, this.objectStatus);
            String str7 = this.sendShareFavWording;
            if (str7 != null) {
                aVar.mo74323j(28, str7);
            }
            aVar.mo74319f(29, this.originalFlag);
            aVar.mo74319f(30, this.secondaryShowFlag);
            String str8 = this.tipsWording;
            if (str8 != null) {
                aVar.mo74323j(31, str8);
            }
            aVar.mo74319f(32, this.orgRecommendType);
            aVar.mo74320g(33, 8, this.mentionedUserContact);
            String str9 = this.sessionBuffer;
            if (str9 != null) {
                aVar.mo74323j(34, str9);
            }
            aVar.mo74319f(35, this.warnFlag);
            String str10 = this.warnWording;
            if (str10 != null) {
                aVar.mo74323j(36, str10);
            }
            C64273c21 c212 = this.liveInfo;
            if (c212 != null) {
                aVar.mo74322i(37, c212.computeSize());
                this.liveInfo.writeFields(aVar);
            }
            aVar.mo74319f(38, this.favCount);
            aVar.mo74319f(39, this.favFlag);
            aVar.mo74319f(40, this.foldedFlag);
            C48872bl0 bl02 = this.foldedLayout;
            if (bl02 != null) {
                aVar.mo74322i(41, bl02.computeSize());
                this.foldedLayout.writeFields(aVar);
            }
            aVar.mo74319f(42, this.recommendReasonType);
            aVar.mo74319f(43, this.urlValidDuration);
            aVar.mo74319f(44, this.forward_style);
            String str11 = this.posTriggerConfig;
            if (str11 != null) {
                aVar.mo74323j(45, str11);
            }
            aVar.mo74319f(46, this.privateFlag);
            aVar.mo74319f(47, this.msgEventFlag);
            String str12 = this.msgId;
            if (str12 != null) {
                aVar.mo74323j(48, str12);
            }
            aVar.mo74319f(49, this.incFriendLikeCount);
            String str13 = this.debugMessage;
            if (str13 != null) {
                aVar.mo74323j(50, str13);
            }
            C89349b bVar = this.likeBuffer;
            if (bVar != null) {
                aVar.mo74315b(51, bVar);
            }
            aVar.mo74319f(52, this.permissionFlag);
            aVar.mo74319f(54, this.stickyTime);
            C50534nf1 nf12 = this.hotTopics;
            if (nf12 != null) {
                aVar.mo74322i(55, nf12.computeSize());
                this.hotTopics.writeFields(aVar);
            }
            C51388tf0 tf02 = this.attachmentList;
            if (tf02 != null) {
                aVar.mo74322i(56, tf02.computeSize());
                this.attachmentList.writeFields(aVar);
            }
            aVar.mo74319f(57, this.objectType);
            C50005jl1 jl12 = this.snsShareInfo;
            if (jl12 != null) {
                aVar.mo74322i(58, jl12.computeSize());
                this.snsShareInfo.writeFields(aVar);
            }
            aVar.mo74319f(60, this.follow_feed_count);
            aVar.mo74319f(61, this.event_status_flag);
            aVar.mo74319f(62, this.is_poi_same_city);
            aVar.mo74319f(63, this.mentionedListSelected);
            String str14 = this.verify_info_buf;
            if (str14 != null) {
                aVar.mo74323j(64, str14);
            }
            aVar.mo74319f(65, this.wx_status_ref_count);
            aVar.mo74319f(66, this.wxStatusPermissionFlag);
            C51231se1 se12 = this.adInfo;
            if (se12 != null) {
                aVar.mo74322i(67, se12.computeSize());
                this.adInfo.writeFields(aVar);
            }
            aVar.mo74320g(68, 8, this.friendCommentList);
            C50673of1 of12 = this.hotWordInfo;
            if (of12 != null) {
                aVar.mo74322i(69, of12.computeSize());
                this.hotWordInfo.writeFields(aVar);
            }
            aVar.mo74319f(70, this.adFlag);
            C50425mn1 mn12 = this.tips_info;
            if (mn12 != null) {
                aVar.mo74322i(71, mn12.computeSize());
                this.tips_info.writeFields(aVar);
            }
            C64827xe1 xe12 = this.client_local_buffer;
            if (xe12 != null) {
                aVar.mo74322i(72, xe12.computeSize());
                this.client_local_buffer.writeFields(aVar);
            }
            C49426fi1 fi12 = this.publisher_info;
            if (fi12 != null) {
                aVar.mo74322i(73, fi12.computeSize());
                this.publisher_info.writeFields(aVar);
            }
            C89349b bVar2 = this.live_related_last_buffer;
            if (bVar2 != null) {
                aVar.mo74315b(74, bVar2);
            }
            aVar.mo74319f(75, this.followCount);
            C89349b bVar3 = this.cookie;
            if (bVar3 != null) {
                aVar.mo74315b(76, bVar3);
            }
            aVar.mo74319f(77, this.preview_flag);
            String str15 = this.internal_feedback_url;
            if (str15 != null) {
                aVar.mo74323j(78, str15);
            }
            String str16 = this.wxa_game_export_id;
            if (str16 != null) {
                aVar.mo74323j(79, str16);
            }
            aVar.mo74319f(80, this.ringtone_count);
            String str17 = this.wx_status_icon_id;
            if (str17 != null) {
                aVar.mo74323j(81, str17);
            }
            aVar.mo74319f(82, this.friend_fav_count);
            aVar.mo74319f(83, this.func_flag);
            C51389tf1 tf12 = this.place_holder_info;
            if (tf12 != null) {
                aVar.mo74322i(85, tf12.computeSize());
                this.place_holder_info.writeFields(aVar);
            }
            FinderContact finderContact3 = this.originalContact;
            if (finderContact3 != null) {
                aVar.mo74322i(87, finderContact3.computeSize());
                this.originalContact.writeFields(aVar);
            }
            String str18 = this.inner_recommend_reason;
            if (str18 != null) {
                aVar.mo74323j(90, str18);
            }
            aVar.mo74321h(91, this.block_cgi_flag);
            C51682vd1 vd12 = this.music_realtime_info;
            if (vd12 != null) {
                aVar.mo74322i(92, vd12.computeSize());
                this.music_realtime_info.writeFields(aVar);
            }
            aVar.mo74314a(93, this.showOriginal);
            C51542ug1 ug12 = this.playhistory_info;
            if (ug12 != null) {
                aVar.mo74322i(94, ug12.computeSize());
                this.playhistory_info.writeFields(aVar);
            }
            C49150di1 di12 = this.finder_promotion_jumpinfo;
            if (di12 != null) {
                aVar.mo74322i(95, di12.computeSize());
                this.finder_promotion_jumpinfo.writeFields(aVar);
            }
            C49296ek1 ek12 = this.flow_card_recommand_reason;
            if (ek12 != null) {
                aVar.mo74322i(96, ek12.computeSize());
                this.flow_card_recommand_reason.writeFields(aVar);
            }
            C51583uq0 uq02 = this.ip_region_info;
            if (uq02 != null) {
                aVar.mo74322i(97, uq02.computeSize());
                this.ip_region_info.writeFields(aVar);
            }
            C50124kf1 kf12 = this.object_extend;
            if (kf12 != null) {
                aVar.mo74322i(98, kf12.computeSize());
                this.object_extend.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f164794id) + 0;
            String str19 = this.nickname;
            if (str19 != null) {
                h += C52418a.m58683j(2, str19);
            }
            String str20 = this.username;
            if (str20 != null) {
                h += C52418a.m58683j(3, str20);
            }
            FinderObjectDesc finderObjectDesc2 = this.objectDesc;
            if (finderObjectDesc2 != null) {
                h += C52418a.m58682i(4, finderObjectDesc2.computeSize());
            }
            int f = h + C52418a.m58679f(5, this.createtime) + C52418a.m58679f(6, this.likeFlag) + C52418a.m58680g(7, 8, this.likeList) + C52418a.m58680g(8, 8, this.commentList) + C52418a.m58679f(9, this.forwardCount);
            FinderContact finderContact4 = this.contact;
            if (finderContact4 != null) {
                f += C52418a.m58682i(10, finderContact4.computeSize());
            }
            String str21 = this.displayidDiscarded;
            if (str21 != null) {
                f += C52418a.m58683j(11, str21);
            }
            int g = f + C52418a.m58680g(12, 1, this.recommenderList) + C52418a.m58681h(13, this.displayId) + C52418a.m58679f(14, this.likeCount) + C52418a.m58679f(15, this.commentCount);
            String str22 = this.recommendReason;
            if (str22 != null) {
                g += C52418a.m58683j(16, str22);
            }
            int f2 = g + C52418a.m58679f(17, this.readCount) + C52418a.m58679f(18, this.deletetime) + C52418a.m58679f(19, this.commentClose) + C52418a.m58681h(20, this.refObjectFlag) + C52418a.m58681h(21, this.refObjectId);
            FinderContact finderContact5 = this.refObjectContact;
            if (finderContact5 != null) {
                f2 += C52418a.m58682i(22, finderContact5.computeSize());
            }
            int f3 = f2 + C52418a.m58679f(23, this.recommendType) + C52418a.m58679f(24, this.friendLikeCount);
            String str23 = this.objectNonceId;
            if (str23 != null) {
                f3 += C52418a.m58683j(25, str23);
            }
            String str24 = this.refObjectNonceId;
            if (str24 != null) {
                f3 += C52418a.m58683j(26, str24);
            }
            int f4 = f3 + C52418a.m58679f(27, this.objectStatus);
            String str25 = this.sendShareFavWording;
            if (str25 != null) {
                f4 += C52418a.m58683j(28, str25);
            }
            int f5 = f4 + C52418a.m58679f(29, this.originalFlag) + C52418a.m58679f(30, this.secondaryShowFlag);
            String str26 = this.tipsWording;
            if (str26 != null) {
                f5 += C52418a.m58683j(31, str26);
            }
            int f6 = f5 + C52418a.m58679f(32, this.orgRecommendType) + C52418a.m58680g(33, 8, this.mentionedUserContact);
            String str27 = this.sessionBuffer;
            if (str27 != null) {
                f6 += C52418a.m58683j(34, str27);
            }
            int f7 = f6 + C52418a.m58679f(35, this.warnFlag);
            String str28 = this.warnWording;
            if (str28 != null) {
                f7 += C52418a.m58683j(36, str28);
            }
            C64273c21 c213 = this.liveInfo;
            if (c213 != null) {
                f7 += C52418a.m58682i(37, c213.computeSize());
            }
            int f8 = f7 + C52418a.m58679f(38, this.favCount) + C52418a.m58679f(39, this.favFlag) + C52418a.m58679f(40, this.foldedFlag);
            C48872bl0 bl03 = this.foldedLayout;
            if (bl03 != null) {
                f8 += C52418a.m58682i(41, bl03.computeSize());
            }
            int f9 = f8 + C52418a.m58679f(42, this.recommendReasonType) + C52418a.m58679f(43, this.urlValidDuration) + C52418a.m58679f(44, this.forward_style);
            String str29 = this.posTriggerConfig;
            if (str29 != null) {
                f9 += C52418a.m58683j(45, str29);
            }
            int f15 = f9 + C52418a.m58679f(46, this.privateFlag) + C52418a.m58679f(47, this.msgEventFlag);
            String str30 = this.msgId;
            if (str30 != null) {
                f15 += C52418a.m58683j(48, str30);
            }
            int f16 = f15 + C52418a.m58679f(49, this.incFriendLikeCount);
            String str31 = this.debugMessage;
            if (str31 != null) {
                f16 += C52418a.m58683j(50, str31);
            }
            C89349b bVar4 = this.likeBuffer;
            if (bVar4 != null) {
                f16 += C52418a.m58675b(51, bVar4);
            }
            int f17 = f16 + C52418a.m58679f(52, this.permissionFlag) + C52418a.m58679f(54, this.stickyTime);
            C50534nf1 nf13 = this.hotTopics;
            if (nf13 != null) {
                f17 += C52418a.m58682i(55, nf13.computeSize());
            }
            C51388tf0 tf03 = this.attachmentList;
            if (tf03 != null) {
                f17 += C52418a.m58682i(56, tf03.computeSize());
            }
            int f18 = f17 + C52418a.m58679f(57, this.objectType);
            C50005jl1 jl13 = this.snsShareInfo;
            if (jl13 != null) {
                f18 += C52418a.m58682i(58, jl13.computeSize());
            }
            int f19 = f18 + C52418a.m58679f(60, this.follow_feed_count) + C52418a.m58679f(61, this.event_status_flag) + C52418a.m58679f(62, this.is_poi_same_city) + C52418a.m58679f(63, this.mentionedListSelected);
            String str32 = this.verify_info_buf;
            if (str32 != null) {
                f19 += C52418a.m58683j(64, str32);
            }
            int f25 = f19 + C52418a.m58679f(65, this.wx_status_ref_count) + C52418a.m58679f(66, this.wxStatusPermissionFlag);
            C51231se1 se13 = this.adInfo;
            if (se13 != null) {
                f25 += C52418a.m58682i(67, se13.computeSize());
            }
            int g2 = f25 + C52418a.m58680g(68, 8, this.friendCommentList);
            C50673of1 of13 = this.hotWordInfo;
            if (of13 != null) {
                g2 += C52418a.m58682i(69, of13.computeSize());
            }
            int f26 = g2 + C52418a.m58679f(70, this.adFlag);
            C50425mn1 mn13 = this.tips_info;
            if (mn13 != null) {
                f26 += C52418a.m58682i(71, mn13.computeSize());
            }
            C64827xe1 xe13 = this.client_local_buffer;
            if (xe13 != null) {
                f26 += C52418a.m58682i(72, xe13.computeSize());
            }
            C49426fi1 fi13 = this.publisher_info;
            if (fi13 != null) {
                f26 += C52418a.m58682i(73, fi13.computeSize());
            }
            C89349b bVar5 = this.live_related_last_buffer;
            if (bVar5 != null) {
                f26 += C52418a.m58675b(74, bVar5);
            }
            int f27 = f26 + C52418a.m58679f(75, this.followCount);
            C89349b bVar6 = this.cookie;
            if (bVar6 != null) {
                f27 += C52418a.m58675b(76, bVar6);
            }
            int f28 = f27 + C52418a.m58679f(77, this.preview_flag);
            String str33 = this.internal_feedback_url;
            if (str33 != null) {
                f28 += C52418a.m58683j(78, str33);
            }
            String str34 = this.wxa_game_export_id;
            if (str34 != null) {
                f28 += C52418a.m58683j(79, str34);
            }
            int f29 = f28 + C52418a.m58679f(80, this.ringtone_count);
            String str35 = this.wx_status_icon_id;
            if (str35 != null) {
                f29 += C52418a.m58683j(81, str35);
            }
            int f35 = f29 + C52418a.m58679f(82, this.friend_fav_count) + C52418a.m58679f(83, this.func_flag);
            C51389tf1 tf13 = this.place_holder_info;
            if (tf13 != null) {
                f35 += C52418a.m58682i(85, tf13.computeSize());
            }
            FinderContact finderContact6 = this.originalContact;
            if (finderContact6 != null) {
                f35 += C52418a.m58682i(87, finderContact6.computeSize());
            }
            String str36 = this.inner_recommend_reason;
            if (str36 != null) {
                f35 += C52418a.m58683j(90, str36);
            }
            int h2 = f35 + C52418a.m58681h(91, this.block_cgi_flag);
            C51682vd1 vd13 = this.music_realtime_info;
            if (vd13 != null) {
                h2 += C52418a.m58682i(92, vd13.computeSize());
            }
            int a = h2 + C52418a.m58674a(93, this.showOriginal);
            C51542ug1 ug13 = this.playhistory_info;
            if (ug13 != null) {
                a += C52418a.m58682i(94, ug13.computeSize());
            }
            C49150di1 di13 = this.finder_promotion_jumpinfo;
            if (di13 != null) {
                a += C52418a.m58682i(95, di13.computeSize());
            }
            C49296ek1 ek13 = this.flow_card_recommand_reason;
            if (ek13 != null) {
                a += C52418a.m58682i(96, ek13.computeSize());
            }
            C51583uq0 uq03 = this.ip_region_info;
            if (uq03 != null) {
                a += C52418a.m58682i(97, uq03.computeSize());
            }
            C50124kf1 kf13 = this.object_extend;
            return kf13 != null ? a + C52418a.m58682i(98, kf13.computeSize()) : a;
        } else if (i2 == 2) {
            this.likeList.clear();
            this.commentList.clear();
            this.recommenderList.clear();
            this.mentionedUserContact.clear();
            this.friendCommentList.clear();
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
            FinderObject finderObject = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderObject.f164794id = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    finderObject.nickname = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    finderObject.username = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObjectDesc finderObjectDesc3 = new FinderObjectDesc();
                        if (bArr != null && bArr.length > 0) {
                            finderObjectDesc3.parseFrom(bArr);
                        }
                        finderObject.objectDesc = finderObjectDesc3;
                    }
                    return 0;
                case 5:
                    finderObject.createtime = aVar3.mo141630h(intValue);
                    return 0;
                case 6:
                    finderObject.likeFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderCommentInfo finderCommentInfo = new FinderCommentInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderCommentInfo.parseFrom(bArr2);
                        }
                        finderObject.likeList.add(finderCommentInfo);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderCommentInfo finderCommentInfo2 = new FinderCommentInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderCommentInfo2.parseFrom(bArr3);
                        }
                        finderObject.commentList.add(finderCommentInfo2);
                    }
                    return 0;
                case 9:
                    finderObject.forwardCount = aVar3.mo141630h(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        FinderContact finderContact7 = new FinderContact();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderContact7.parseFrom(bArr4);
                        }
                        finderObject.contact = finderContact7;
                    }
                    return 0;
                case 11:
                    finderObject.displayidDiscarded = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    finderObject.recommenderList.add(aVar3.mo141633k(intValue));
                    return 0;
                case 13:
                    finderObject.displayId = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    finderObject.likeCount = aVar3.mo141630h(intValue);
                    return 0;
                case 15:
                    finderObject.commentCount = aVar3.mo141630h(intValue);
                    return 0;
                case 16:
                    finderObject.recommendReason = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    finderObject.readCount = aVar3.mo141630h(intValue);
                    return 0;
                case 18:
                    finderObject.deletetime = aVar3.mo141630h(intValue);
                    return 0;
                case 19:
                    finderObject.commentClose = aVar3.mo141630h(intValue);
                    return 0;
                case 20:
                    finderObject.refObjectFlag = aVar3.mo141631i(intValue);
                    return 0;
                case 21:
                    finderObject.refObjectId = aVar3.mo141631i(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        FinderContact finderContact8 = new FinderContact();
                        if (bArr5 != null && bArr5.length > 0) {
                            finderContact8.parseFrom(bArr5);
                        }
                        finderObject.refObjectContact = finderContact8;
                    }
                    return 0;
                case 23:
                    finderObject.recommendType = aVar3.mo141630h(intValue);
                    return 0;
                case 24:
                    finderObject.friendLikeCount = aVar3.mo141630h(intValue);
                    return 0;
                case 25:
                    finderObject.objectNonceId = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    finderObject.refObjectNonceId = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    finderObject.objectStatus = aVar3.mo141630h(intValue);
                    return 0;
                case 28:
                    finderObject.sendShareFavWording = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    finderObject.originalFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 30:
                    finderObject.secondaryShowFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 31:
                    finderObject.tipsWording = aVar3.mo141633k(intValue);
                    return 0;
                case 32:
                    finderObject.orgRecommendType = aVar3.mo141630h(intValue);
                    return 0;
                case 33:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        FinderContact finderContact9 = new FinderContact();
                        if (bArr6 != null && bArr6.length > 0) {
                            finderContact9.parseFrom(bArr6);
                        }
                        finderObject.mentionedUserContact.add(finderContact9);
                    }
                    return 0;
                case 34:
                    finderObject.sessionBuffer = aVar3.mo141633k(intValue);
                    return 0;
                case 35:
                    finderObject.warnFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 36:
                    finderObject.warnWording = aVar3.mo141633k(intValue);
                    return 0;
                case 37:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C64273c21 c214 = new C64273c21();
                        if (bArr7 != null && bArr7.length > 0) {
                            c214.parseFrom(bArr7);
                        }
                        finderObject.liveInfo = c214;
                    }
                    return 0;
                case 38:
                    finderObject.favCount = aVar3.mo141630h(intValue);
                    return 0;
                case 39:
                    finderObject.favFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 40:
                    finderObject.foldedFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 41:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C48872bl0 bl04 = new C48872bl0();
                        if (bArr8 != null && bArr8.length > 0) {
                            bl04.parseFrom(bArr8);
                        }
                        finderObject.foldedLayout = bl04;
                    }
                    return 0;
                case 42:
                    finderObject.recommendReasonType = aVar3.mo141630h(intValue);
                    return 0;
                case 43:
                    finderObject.urlValidDuration = aVar3.mo141630h(intValue);
                    return 0;
                case 44:
                    finderObject.forward_style = aVar3.mo141630h(intValue);
                    return 0;
                case 45:
                    finderObject.posTriggerConfig = aVar3.mo141633k(intValue);
                    return 0;
                case 46:
                    finderObject.privateFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 47:
                    finderObject.msgEventFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 48:
                    finderObject.msgId = aVar3.mo141633k(intValue);
                    return 0;
                case 49:
                    finderObject.incFriendLikeCount = aVar3.mo141630h(intValue);
                    return 0;
                case 50:
                    finderObject.debugMessage = aVar3.mo141633k(intValue);
                    return 0;
                case 51:
                    finderObject.likeBuffer = aVar3.mo141626d(intValue);
                    return 0;
                case 52:
                    finderObject.permissionFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 54:
                    finderObject.stickyTime = aVar3.mo141630h(intValue);
                    return 0;
                case 55:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C50534nf1 nf14 = new C50534nf1();
                        if (bArr9 != null && bArr9.length > 0) {
                            nf14.parseFrom(bArr9);
                        }
                        finderObject.hotTopics = nf14;
                    }
                    return 0;
                case 56:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        C51388tf0 tf04 = new C51388tf0();
                        if (bArr10 != null && bArr10.length > 0) {
                            tf04.parseFrom(bArr10);
                        }
                        finderObject.attachmentList = tf04;
                    }
                    return 0;
                case 57:
                    finderObject.objectType = aVar3.mo141630h(intValue);
                    return 0;
                case 58:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i18 = 0; i18 < size11; i18++) {
                        byte[] bArr11 = j16.get(i18);
                        C50005jl1 jl14 = new C50005jl1();
                        if (bArr11 != null && bArr11.length > 0) {
                            jl14.parseFrom(bArr11);
                        }
                        finderObject.snsShareInfo = jl14;
                    }
                    return 0;
                case 60:
                    finderObject.follow_feed_count = aVar3.mo141630h(intValue);
                    return 0;
                case 61:
                    finderObject.event_status_flag = aVar3.mo141630h(intValue);
                    return 0;
                case 62:
                    finderObject.is_poi_same_city = aVar3.mo141630h(intValue);
                    return 0;
                case 63:
                    finderObject.mentionedListSelected = aVar3.mo141630h(intValue);
                    return 0;
                case 64:
                    finderObject.verify_info_buf = aVar3.mo141633k(intValue);
                    return 0;
                case 65:
                    finderObject.wx_status_ref_count = aVar3.mo141630h(intValue);
                    return 0;
                case 66:
                    finderObject.wxStatusPermissionFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 67:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i19 = 0; i19 < size12; i19++) {
                        byte[] bArr12 = j17.get(i19);
                        C51231se1 se14 = new C51231se1();
                        if (bArr12 != null && bArr12.length > 0) {
                            se14.parseFrom(bArr12);
                        }
                        finderObject.adInfo = se14;
                    }
                    return 0;
                case 68:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i25 = 0; i25 < size13; i25++) {
                        byte[] bArr13 = j18.get(i25);
                        FinderCommentInfo finderCommentInfo3 = new FinderCommentInfo();
                        if (bArr13 != null && bArr13.length > 0) {
                            finderCommentInfo3.parseFrom(bArr13);
                        }
                        finderObject.friendCommentList.add(finderCommentInfo3);
                    }
                    return 0;
                case 69:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i26 = 0; i26 < size14; i26++) {
                        byte[] bArr14 = j19.get(i26);
                        C50673of1 of14 = new C50673of1();
                        if (bArr14 != null && bArr14.length > 0) {
                            of14.parseFrom(bArr14);
                        }
                        finderObject.hotWordInfo = of14;
                    }
                    return 0;
                case 70:
                    finderObject.adFlag = aVar3.mo141630h(intValue);
                    return 0;
                case 71:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i27 = 0; i27 < size15; i27++) {
                        byte[] bArr15 = j25.get(i27);
                        C50425mn1 mn14 = new C50425mn1();
                        if (bArr15 != null && bArr15.length > 0) {
                            mn14.parseFrom(bArr15);
                        }
                        finderObject.tips_info = mn14;
                    }
                    return 0;
                case 72:
                    LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i28 = 0; i28 < size16; i28++) {
                        byte[] bArr16 = j26.get(i28);
                        C64827xe1 xe14 = new C64827xe1();
                        if (bArr16 != null && bArr16.length > 0) {
                            xe14.parseFrom(bArr16);
                        }
                        finderObject.client_local_buffer = xe14;
                    }
                    return 0;
                case 73:
                    LinkedList<byte[]> j27 = aVar3.mo141632j(intValue);
                    int size17 = j27.size();
                    for (int i29 = 0; i29 < size17; i29++) {
                        byte[] bArr17 = j27.get(i29);
                        C49426fi1 fi14 = new C49426fi1();
                        if (bArr17 != null && bArr17.length > 0) {
                            fi14.parseFrom(bArr17);
                        }
                        finderObject.publisher_info = fi14;
                    }
                    return 0;
                case 74:
                    finderObject.live_related_last_buffer = aVar3.mo141626d(intValue);
                    return 0;
                case 75:
                    finderObject.followCount = aVar3.mo141630h(intValue);
                    return 0;
                case 76:
                    finderObject.cookie = aVar3.mo141626d(intValue);
                    return 0;
                case 77:
                    finderObject.preview_flag = aVar3.mo141630h(intValue);
                    return 0;
                case 78:
                    finderObject.internal_feedback_url = aVar3.mo141633k(intValue);
                    return 0;
                case 79:
                    finderObject.wxa_game_export_id = aVar3.mo141633k(intValue);
                    return 0;
                case 80:
                    finderObject.ringtone_count = aVar3.mo141630h(intValue);
                    return 0;
                case 81:
                    finderObject.wx_status_icon_id = aVar3.mo141633k(intValue);
                    return 0;
                case 82:
                    finderObject.friend_fav_count = aVar3.mo141630h(intValue);
                    return 0;
                case 83:
                    finderObject.func_flag = aVar3.mo141630h(intValue);
                    return 0;
                case 85:
                    LinkedList<byte[]> j28 = aVar3.mo141632j(intValue);
                    int size18 = j28.size();
                    for (int i35 = 0; i35 < size18; i35++) {
                        byte[] bArr18 = j28.get(i35);
                        C51389tf1 tf14 = new C51389tf1();
                        if (bArr18 != null && bArr18.length > 0) {
                            tf14.parseFrom(bArr18);
                        }
                        finderObject.place_holder_info = tf14;
                    }
                    return 0;
                case 87:
                    LinkedList<byte[]> j29 = aVar3.mo141632j(intValue);
                    int size19 = j29.size();
                    for (int i36 = 0; i36 < size19; i36++) {
                        byte[] bArr19 = j29.get(i36);
                        FinderContact finderContact10 = new FinderContact();
                        if (bArr19 != null && bArr19.length > 0) {
                            finderContact10.parseFrom(bArr19);
                        }
                        finderObject.originalContact = finderContact10;
                    }
                    return 0;
                case 90:
                    finderObject.inner_recommend_reason = aVar3.mo141633k(intValue);
                    return 0;
                case 91:
                    finderObject.block_cgi_flag = aVar3.mo141631i(intValue);
                    return 0;
                case 92:
                    LinkedList<byte[]> j35 = aVar3.mo141632j(intValue);
                    int size20 = j35.size();
                    for (int i37 = 0; i37 < size20; i37++) {
                        byte[] bArr20 = j35.get(i37);
                        C51682vd1 vd14 = new C51682vd1();
                        if (bArr20 != null && bArr20.length > 0) {
                            vd14.parseFrom(bArr20);
                        }
                        finderObject.music_realtime_info = vd14;
                    }
                    return 0;
                case 93:
                    finderObject.showOriginal = aVar3.mo141625c(intValue);
                    return 0;
                case 94:
                    LinkedList<byte[]> j36 = aVar3.mo141632j(intValue);
                    int size21 = j36.size();
                    for (int i38 = 0; i38 < size21; i38++) {
                        byte[] bArr21 = j36.get(i38);
                        C51542ug1 ug14 = new C51542ug1();
                        if (bArr21 != null && bArr21.length > 0) {
                            ug14.parseFrom(bArr21);
                        }
                        finderObject.playhistory_info = ug14;
                    }
                    return 0;
                case 95:
                    LinkedList<byte[]> j37 = aVar3.mo141632j(intValue);
                    int size22 = j37.size();
                    for (int i39 = 0; i39 < size22; i39++) {
                        byte[] bArr22 = j37.get(i39);
                        C49150di1 di14 = new C49150di1();
                        if (bArr22 != null && bArr22.length > 0) {
                            di14.parseFrom(bArr22);
                        }
                        finderObject.finder_promotion_jumpinfo = di14;
                    }
                    return 0;
                case 96:
                    LinkedList<byte[]> j38 = aVar3.mo141632j(intValue);
                    int size23 = j38.size();
                    for (int i44 = 0; i44 < size23; i44++) {
                        byte[] bArr23 = j38.get(i44);
                        C49296ek1 ek14 = new C49296ek1();
                        if (bArr23 != null && bArr23.length > 0) {
                            ek14.parseFrom(bArr23);
                        }
                        finderObject.flow_card_recommand_reason = ek14;
                    }
                    return 0;
                case 97:
                    LinkedList<byte[]> j39 = aVar3.mo141632j(intValue);
                    int size24 = j39.size();
                    for (int i45 = 0; i45 < size24; i45++) {
                        byte[] bArr24 = j39.get(i45);
                        C51583uq0 uq04 = new C51583uq0();
                        if (bArr24 != null && bArr24.length > 0) {
                            uq04.parseFrom(bArr24);
                        }
                        finderObject.ip_region_info = uq04;
                    }
                    return 0;
                case 98:
                    LinkedList<byte[]> j44 = aVar3.mo141632j(intValue);
                    int size25 = j44.size();
                    for (int i46 = 0; i46 < size25; i46++) {
                        byte[] bArr25 = j44.get(i46);
                        C50124kf1 kf14 = new C50124kf1();
                        if (bArr25 != null && bArr25.length > 0) {
                            kf14.parseFrom(bArr25);
                        }
                        finderObject.object_extend = kf14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderObject setAdFlag(int i) {
        this.adFlag = i;
        return this;
    }

    public FinderObject setAdInfo(C51231se1 se12) {
        this.adInfo = se12;
        return this;
    }

    public FinderObject setAttachmentList(C51388tf0 tf02) {
        this.attachmentList = tf02;
        return this;
    }

    public FinderObject setBlock_cgi_flag(long j) {
        this.block_cgi_flag = j;
        return this;
    }

    public FinderObject setClient_local_buffer(C64827xe1 xe12) {
        this.client_local_buffer = xe12;
        return this;
    }

    public FinderObject setCommentClose(int i) {
        this.commentClose = i;
        return this;
    }

    public FinderObject setCommentCount(int i) {
        this.commentCount = i;
        return this;
    }

    public FinderObject setCommentList(LinkedList<FinderCommentInfo> linkedList) {
        this.commentList = linkedList;
        return this;
    }

    public FinderObject setContact(FinderContact finderContact) {
        this.contact = finderContact;
        return this;
    }

    public FinderObject setCookie(C89349b bVar) {
        this.cookie = bVar;
        return this;
    }

    public FinderObject setCreatetime(int i) {
        this.createtime = i;
        return this;
    }

    public FinderObject setDebugMessage(String str) {
        this.debugMessage = str;
        return this;
    }

    public FinderObject setDeletetime(int i) {
        this.deletetime = i;
        return this;
    }

    public FinderObject setDisplayId(long j) {
        this.displayId = j;
        return this;
    }

    public FinderObject setDisplayidDiscarded(String str) {
        this.displayidDiscarded = str;
        return this;
    }

    public FinderObject setEvent_status_flag(int i) {
        this.event_status_flag = i;
        return this;
    }

    public FinderObject setFavCount(int i) {
        this.favCount = i;
        return this;
    }

    public FinderObject setFavFlag(int i) {
        this.favFlag = i;
        return this;
    }

    public FinderObject setFinder_promotion_jumpinfo(C49150di1 di12) {
        this.finder_promotion_jumpinfo = di12;
        return this;
    }

    public FinderObject setFlow_card_recommand_reason(C49296ek1 ek12) {
        this.flow_card_recommand_reason = ek12;
        return this;
    }

    public FinderObject setFoldedFlag(int i) {
        this.foldedFlag = i;
        return this;
    }

    public FinderObject setFoldedLayout(C48872bl0 bl02) {
        this.foldedLayout = bl02;
        return this;
    }

    public FinderObject setFollowCount(int i) {
        this.followCount = i;
        return this;
    }

    public FinderObject setFollow_feed_count(int i) {
        this.follow_feed_count = i;
        return this;
    }

    public FinderObject setForwardCount(int i) {
        this.forwardCount = i;
        return this;
    }

    public FinderObject setForward_style(int i) {
        this.forward_style = i;
        return this;
    }

    public FinderObject setFriendCommentList(LinkedList<FinderCommentInfo> linkedList) {
        this.friendCommentList = linkedList;
        return this;
    }

    public FinderObject setFriendLikeCount(int i) {
        this.friendLikeCount = i;
        return this;
    }

    public FinderObject setFriend_fav_count(int i) {
        this.friend_fav_count = i;
        return this;
    }

    public FinderObject setFunc_flag(int i) {
        this.func_flag = i;
        return this;
    }

    public FinderObject setHotTopics(C50534nf1 nf12) {
        this.hotTopics = nf12;
        return this;
    }

    public FinderObject setHotWordInfo(C50673of1 of12) {
        this.hotWordInfo = of12;
        return this;
    }

    public FinderObject setId(long j) {
        this.f164794id = j;
        return this;
    }

    public FinderObject setIncFriendLikeCount(int i) {
        this.incFriendLikeCount = i;
        return this;
    }

    public FinderObject setInner_recommend_reason(String str) {
        this.inner_recommend_reason = str;
        return this;
    }

    public FinderObject setInternal_feedback_url(String str) {
        this.internal_feedback_url = str;
        return this;
    }

    public FinderObject setIp_region_info(C51583uq0 uq02) {
        this.ip_region_info = uq02;
        return this;
    }

    public FinderObject setIs_poi_same_city(int i) {
        this.is_poi_same_city = i;
        return this;
    }

    public FinderObject setLikeBuffer(C89349b bVar) {
        this.likeBuffer = bVar;
        return this;
    }

    public FinderObject setLikeCount(int i) {
        this.likeCount = i;
        return this;
    }

    public FinderObject setLikeFlag(int i) {
        this.likeFlag = i;
        return this;
    }

    public FinderObject setLikeList(LinkedList<FinderCommentInfo> linkedList) {
        this.likeList = linkedList;
        return this;
    }

    public FinderObject setLiveInfo(C64273c21 c212) {
        this.liveInfo = c212;
        return this;
    }

    public FinderObject setLive_related_last_buffer(C89349b bVar) {
        this.live_related_last_buffer = bVar;
        return this;
    }

    public FinderObject setMentionedListSelected(int i) {
        this.mentionedListSelected = i;
        return this;
    }

    public FinderObject setMentionedUserContact(LinkedList<FinderContact> linkedList) {
        this.mentionedUserContact = linkedList;
        return this;
    }

    public FinderObject setMsgEventFlag(int i) {
        this.msgEventFlag = i;
        return this;
    }

    public FinderObject setMsgId(String str) {
        this.msgId = str;
        return this;
    }

    public FinderObject setMusic_realtime_info(C51682vd1 vd12) {
        this.music_realtime_info = vd12;
        return this;
    }

    public FinderObject setNickname(String str) {
        this.nickname = str;
        return this;
    }

    public FinderObject setObjectDesc(FinderObjectDesc finderObjectDesc) {
        this.objectDesc = finderObjectDesc;
        return this;
    }

    public FinderObject setObjectNonceId(String str) {
        this.objectNonceId = str;
        return this;
    }

    public FinderObject setObjectStatus(int i) {
        this.objectStatus = i;
        return this;
    }

    public FinderObject setObjectType(int i) {
        this.objectType = i;
        return this;
    }

    public FinderObject setObject_extend(C50124kf1 kf12) {
        this.object_extend = kf12;
        return this;
    }

    public FinderObject setOrgRecommendType(int i) {
        this.orgRecommendType = i;
        return this;
    }

    public FinderObject setOriginalContact(FinderContact finderContact) {
        this.originalContact = finderContact;
        return this;
    }

    public FinderObject setOriginalFlag(int i) {
        this.originalFlag = i;
        return this;
    }

    public FinderObject setPermissionFlag(int i) {
        this.permissionFlag = i;
        return this;
    }

    public FinderObject setPlace_holder_info(C51389tf1 tf12) {
        this.place_holder_info = tf12;
        return this;
    }

    public FinderObject setPlayhistory_info(C51542ug1 ug12) {
        this.playhistory_info = ug12;
        return this;
    }

    public FinderObject setPosTriggerConfig(String str) {
        this.posTriggerConfig = str;
        return this;
    }

    public FinderObject setPreview_flag(int i) {
        this.preview_flag = i;
        return this;
    }

    public FinderObject setPrivateFlag(int i) {
        this.privateFlag = i;
        return this;
    }

    public FinderObject setPublisher_info(C49426fi1 fi12) {
        this.publisher_info = fi12;
        return this;
    }

    public FinderObject setReadCount(int i) {
        this.readCount = i;
        return this;
    }

    public FinderObject setRecommendReason(String str) {
        this.recommendReason = str;
        return this;
    }

    public FinderObject setRecommendReasonType(int i) {
        this.recommendReasonType = i;
        return this;
    }

    public FinderObject setRecommendType(int i) {
        this.recommendType = i;
        return this;
    }

    public FinderObject setRecommenderList(LinkedList<String> linkedList) {
        this.recommenderList = linkedList;
        return this;
    }

    public FinderObject setRefObjectContact(FinderContact finderContact) {
        this.refObjectContact = finderContact;
        return this;
    }

    public FinderObject setRefObjectFlag(long j) {
        this.refObjectFlag = j;
        return this;
    }

    public FinderObject setRefObjectId(long j) {
        this.refObjectId = j;
        return this;
    }

    public FinderObject setRefObjectNonceId(String str) {
        this.refObjectNonceId = str;
        return this;
    }

    public FinderObject setRingtone_count(int i) {
        this.ringtone_count = i;
        return this;
    }

    public FinderObject setSecondaryShowFlag(int i) {
        this.secondaryShowFlag = i;
        return this;
    }

    public FinderObject setSendShareFavWording(String str) {
        this.sendShareFavWording = str;
        return this;
    }

    public FinderObject setSessionBuffer(String str) {
        this.sessionBuffer = str;
        return this;
    }

    public FinderObject setShowOriginal(boolean z) {
        this.showOriginal = z;
        return this;
    }

    public FinderObject setSnsShareInfo(C50005jl1 jl12) {
        this.snsShareInfo = jl12;
        return this;
    }

    public FinderObject setStickyTime(int i) {
        this.stickyTime = i;
        return this;
    }

    public FinderObject setTipsWording(String str) {
        this.tipsWording = str;
        return this;
    }

    public FinderObject setTips_info(C50425mn1 mn12) {
        this.tips_info = mn12;
        return this;
    }

    public FinderObject setUrlValidDuration(int i) {
        this.urlValidDuration = i;
        return this;
    }

    public FinderObject setUsername(String str) {
        this.username = str;
        return this;
    }

    public FinderObject setVerify_info_buf(String str) {
        this.verify_info_buf = str;
        return this;
    }

    public FinderObject setWarnFlag(int i) {
        this.warnFlag = i;
        return this;
    }

    public FinderObject setWarnWording(String str) {
        this.warnWording = str;
        return this;
    }

    public FinderObject setWxStatusPermissionFlag(int i) {
        this.wxStatusPermissionFlag = i;
        return this;
    }

    public FinderObject setWx_status_icon_id(String str) {
        this.wx_status_icon_id = str;
        return this;
    }

    public FinderObject setWx_status_ref_count(int i) {
        this.wx_status_ref_count = i;
        return this;
    }

    public FinderObject setWxa_game_export_id(String str) {
        this.wxa_game_export_id = str;
        return this;
    }
}
