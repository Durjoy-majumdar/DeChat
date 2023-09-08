package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C50405mi0;
import te3.C51583uq0;
import te3.C51833wh0;
import te3.C64503ky;
import te3.C64772vh0;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderCommentInfo */
public class FinderCommentInfo extends C47465a {
    public C64772vh0 advertisement_info;
    public FinderContact author_contact;
    public int blacklist_flag;
    public String client_id;
    public long commentId;
    public int comment_type;
    public String content;
    public C64503ky content_info;
    public int content_type;
    public int continueFlag;
    public long createtime;
    public int deleteFlag;
    public int displayFlag;
    public long displayid;
    public String displayidDiscarded;
    public int expandCommentCount;
    public int extFlag;
    public String headUrl;
    public C51583uq0 ip_region_info;
    public C89349b lastBuffer;
    public LinkedList<FinderCommentInfo> levelTwoComment = new LinkedList<>();
    public int likeCount;
    public int likeFlag;
    public C50405mi0 msgInfo;
    public String nickname;
    public String replaced_content;
    public int replyBlacklistFlag;
    public long replyCommentId;
    public String replyNickname;
    public FinderContact reply_contact;
    public String reply_content;
    public String reply_username;
    public String report_json;
    public LinkedList<C51833wh0> search_keyword_info = new LinkedList<>();
    public int unreadFlag;
    public int upContinueFlag;
    public String username;

    public static final FinderCommentInfo create() {
        return new FinderCommentInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderCommentInfo)) {
            return false;
        }
        FinderCommentInfo finderCommentInfo = (FinderCommentInfo) aVar;
        return C46238a.m51546a(this.username, finderCommentInfo.username) && C46238a.m51546a(this.nickname, finderCommentInfo.nickname) && C46238a.m51546a(this.content, finderCommentInfo.content) && C46238a.m51546a(Long.valueOf(this.commentId), Long.valueOf(finderCommentInfo.commentId)) && C46238a.m51546a(Long.valueOf(this.replyCommentId), Long.valueOf(finderCommentInfo.replyCommentId)) && C46238a.m51546a(Integer.valueOf(this.deleteFlag), Integer.valueOf(finderCommentInfo.deleteFlag)) && C46238a.m51546a(this.headUrl, finderCommentInfo.headUrl) && C46238a.m51546a(this.levelTwoComment, finderCommentInfo.levelTwoComment) && C46238a.m51546a(Long.valueOf(this.createtime), Long.valueOf(finderCommentInfo.createtime)) && C46238a.m51546a(this.replyNickname, finderCommentInfo.replyNickname) && C46238a.m51546a(this.displayidDiscarded, finderCommentInfo.displayidDiscarded) && C46238a.m51546a(Integer.valueOf(this.likeFlag), Integer.valueOf(finderCommentInfo.likeFlag)) && C46238a.m51546a(Integer.valueOf(this.likeCount), Integer.valueOf(finderCommentInfo.likeCount)) && C46238a.m51546a(Long.valueOf(this.displayid), Long.valueOf(finderCommentInfo.displayid)) && C46238a.m51546a(Integer.valueOf(this.expandCommentCount), Integer.valueOf(finderCommentInfo.expandCommentCount)) && C46238a.m51546a(this.lastBuffer, finderCommentInfo.lastBuffer) && C46238a.m51546a(Integer.valueOf(this.continueFlag), Integer.valueOf(finderCommentInfo.continueFlag)) && C46238a.m51546a(Integer.valueOf(this.displayFlag), Integer.valueOf(finderCommentInfo.displayFlag)) && C46238a.m51546a(Integer.valueOf(this.blacklist_flag), Integer.valueOf(finderCommentInfo.blacklist_flag)) && C46238a.m51546a(this.reply_content, finderCommentInfo.reply_content) && C46238a.m51546a(this.reply_username, finderCommentInfo.reply_username) && C46238a.m51546a(this.client_id, finderCommentInfo.client_id) && C46238a.m51546a(Integer.valueOf(this.upContinueFlag), Integer.valueOf(finderCommentInfo.upContinueFlag)) && C46238a.m51546a(Integer.valueOf(this.replyBlacklistFlag), Integer.valueOf(finderCommentInfo.replyBlacklistFlag)) && C46238a.m51546a(Integer.valueOf(this.extFlag), Integer.valueOf(finderCommentInfo.extFlag)) && C46238a.m51546a(Integer.valueOf(this.unreadFlag), Integer.valueOf(finderCommentInfo.unreadFlag)) && C46238a.m51546a(this.msgInfo, finderCommentInfo.msgInfo) && C46238a.m51546a(this.author_contact, finderCommentInfo.author_contact) && C46238a.m51546a(this.reply_contact, finderCommentInfo.reply_contact) && C46238a.m51546a(Integer.valueOf(this.content_type), Integer.valueOf(finderCommentInfo.content_type)) && C46238a.m51546a(this.content_info, finderCommentInfo.content_info) && C46238a.m51546a(this.report_json, finderCommentInfo.report_json) && C46238a.m51546a(this.ip_region_info, finderCommentInfo.ip_region_info) && C46238a.m51546a(this.search_keyword_info, finderCommentInfo.search_keyword_info) && C46238a.m51546a(this.replaced_content, finderCommentInfo.replaced_content) && C46238a.m51546a(this.advertisement_info, finderCommentInfo.advertisement_info) && C46238a.m51546a(Integer.valueOf(this.comment_type), Integer.valueOf(finderCommentInfo.comment_type));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.username;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.nickname;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.content;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.commentId);
            aVar.mo74321h(5, this.replyCommentId);
            aVar.mo74318e(6, this.deleteFlag);
            String str4 = this.headUrl;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74320g(8, 8, this.levelTwoComment);
            aVar.mo74321h(9, this.createtime);
            String str5 = this.replyNickname;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.displayidDiscarded;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74318e(12, this.likeFlag);
            aVar.mo74318e(13, this.likeCount);
            aVar.mo74321h(14, this.displayid);
            aVar.mo74318e(15, this.expandCommentCount);
            C89349b bVar = this.lastBuffer;
            if (bVar != null) {
                aVar.mo74315b(16, bVar);
            }
            aVar.mo74318e(17, this.continueFlag);
            aVar.mo74318e(18, this.displayFlag);
            aVar.mo74318e(19, this.blacklist_flag);
            String str7 = this.reply_content;
            if (str7 != null) {
                aVar.mo74323j(20, str7);
            }
            String str8 = this.reply_username;
            if (str8 != null) {
                aVar.mo74323j(21, str8);
            }
            String str9 = this.client_id;
            if (str9 != null) {
                aVar.mo74323j(22, str9);
            }
            aVar.mo74318e(23, this.upContinueFlag);
            aVar.mo74318e(24, this.replyBlacklistFlag);
            aVar.mo74318e(25, this.extFlag);
            aVar.mo74318e(26, this.unreadFlag);
            C50405mi0 mi02 = this.msgInfo;
            if (mi02 != null) {
                aVar.mo74322i(27, mi02.computeSize());
                this.msgInfo.writeFields(aVar);
            }
            FinderContact finderContact = this.author_contact;
            if (finderContact != null) {
                aVar.mo74322i(28, finderContact.computeSize());
                this.author_contact.writeFields(aVar);
            }
            FinderContact finderContact2 = this.reply_contact;
            if (finderContact2 != null) {
                aVar.mo74322i(29, finderContact2.computeSize());
                this.reply_contact.writeFields(aVar);
            }
            aVar.mo74318e(30, this.content_type);
            C64503ky kyVar = this.content_info;
            if (kyVar != null) {
                aVar.mo74322i(31, kyVar.computeSize());
                this.content_info.writeFields(aVar);
            }
            String str10 = this.report_json;
            if (str10 != null) {
                aVar.mo74323j(32, str10);
            }
            C51583uq0 uq02 = this.ip_region_info;
            if (uq02 != null) {
                aVar.mo74322i(35, uq02.computeSize());
                this.ip_region_info.writeFields(aVar);
            }
            aVar.mo74320g(36, 8, this.search_keyword_info);
            String str11 = this.replaced_content;
            if (str11 != null) {
                aVar.mo74323j(37, str11);
            }
            C64772vh0 vh02 = this.advertisement_info;
            if (vh02 != null) {
                aVar.mo74322i(38, vh02.computeSize());
                this.advertisement_info.writeFields(aVar);
            }
            aVar.mo74318e(39, this.comment_type);
            return 0;
        } else if (i2 == 1) {
            String str12 = this.username;
            if (str12 != null) {
                i3 = C52418a.m58683j(1, str12) + 0;
            }
            String str13 = this.nickname;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.content;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            int h = i3 + C52418a.m58681h(4, this.commentId) + C52418a.m58681h(5, this.replyCommentId) + C52418a.m58678e(6, this.deleteFlag);
            String str15 = this.headUrl;
            if (str15 != null) {
                h += C52418a.m58683j(7, str15);
            }
            int g = h + C52418a.m58680g(8, 8, this.levelTwoComment) + C52418a.m58681h(9, this.createtime);
            String str16 = this.replyNickname;
            if (str16 != null) {
                g += C52418a.m58683j(10, str16);
            }
            String str17 = this.displayidDiscarded;
            if (str17 != null) {
                g += C52418a.m58683j(11, str17);
            }
            int e = g + C52418a.m58678e(12, this.likeFlag) + C52418a.m58678e(13, this.likeCount) + C52418a.m58681h(14, this.displayid) + C52418a.m58678e(15, this.expandCommentCount);
            C89349b bVar2 = this.lastBuffer;
            if (bVar2 != null) {
                e += C52418a.m58675b(16, bVar2);
            }
            int e2 = e + C52418a.m58678e(17, this.continueFlag) + C52418a.m58678e(18, this.displayFlag) + C52418a.m58678e(19, this.blacklist_flag);
            String str18 = this.reply_content;
            if (str18 != null) {
                e2 += C52418a.m58683j(20, str18);
            }
            String str19 = this.reply_username;
            if (str19 != null) {
                e2 += C52418a.m58683j(21, str19);
            }
            String str20 = this.client_id;
            if (str20 != null) {
                e2 += C52418a.m58683j(22, str20);
            }
            int e3 = e2 + C52418a.m58678e(23, this.upContinueFlag) + C52418a.m58678e(24, this.replyBlacklistFlag) + C52418a.m58678e(25, this.extFlag) + C52418a.m58678e(26, this.unreadFlag);
            C50405mi0 mi03 = this.msgInfo;
            if (mi03 != null) {
                e3 += C52418a.m58682i(27, mi03.computeSize());
            }
            FinderContact finderContact3 = this.author_contact;
            if (finderContact3 != null) {
                e3 += C52418a.m58682i(28, finderContact3.computeSize());
            }
            FinderContact finderContact4 = this.reply_contact;
            if (finderContact4 != null) {
                e3 += C52418a.m58682i(29, finderContact4.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(30, this.content_type);
            C64503ky kyVar2 = this.content_info;
            if (kyVar2 != null) {
                e4 += C52418a.m58682i(31, kyVar2.computeSize());
            }
            String str21 = this.report_json;
            if (str21 != null) {
                e4 += C52418a.m58683j(32, str21);
            }
            C51583uq0 uq03 = this.ip_region_info;
            if (uq03 != null) {
                e4 += C52418a.m58682i(35, uq03.computeSize());
            }
            int g2 = e4 + C52418a.m58680g(36, 8, this.search_keyword_info);
            String str22 = this.replaced_content;
            if (str22 != null) {
                g2 += C52418a.m58683j(37, str22);
            }
            C64772vh0 vh03 = this.advertisement_info;
            if (vh03 != null) {
                g2 += C52418a.m58682i(38, vh03.computeSize());
            }
            return g2 + C52418a.m58678e(39, this.comment_type);
        } else if (i2 == 2) {
            this.levelTwoComment.clear();
            this.search_keyword_info.clear();
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
            FinderCommentInfo finderCommentInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderCommentInfo.username = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    finderCommentInfo.nickname = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    finderCommentInfo.content = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    finderCommentInfo.commentId = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    finderCommentInfo.replyCommentId = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    finderCommentInfo.deleteFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    finderCommentInfo.headUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        FinderCommentInfo finderCommentInfo2 = new FinderCommentInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderCommentInfo2.parseFrom(bArr);
                        }
                        finderCommentInfo.levelTwoComment.add(finderCommentInfo2);
                    }
                    return 0;
                case 9:
                    finderCommentInfo.createtime = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    finderCommentInfo.replyNickname = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    finderCommentInfo.displayidDiscarded = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    finderCommentInfo.likeFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    finderCommentInfo.likeCount = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    finderCommentInfo.displayid = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    finderCommentInfo.expandCommentCount = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    finderCommentInfo.lastBuffer = aVar3.mo141626d(intValue);
                    return 0;
                case 17:
                    finderCommentInfo.continueFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    finderCommentInfo.displayFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    finderCommentInfo.blacklist_flag = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    finderCommentInfo.reply_content = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    finderCommentInfo.reply_username = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    finderCommentInfo.client_id = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    finderCommentInfo.upContinueFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    finderCommentInfo.replyBlacklistFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    finderCommentInfo.extFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    finderCommentInfo.unreadFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50405mi0 mi04 = new C50405mi0();
                        if (bArr2 != null && bArr2.length > 0) {
                            mi04.parseFrom(bArr2);
                        }
                        finderCommentInfo.msgInfo = mi04;
                    }
                    return 0;
                case 28:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        FinderContact finderContact5 = new FinderContact();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderContact5.parseFrom(bArr3);
                        }
                        finderCommentInfo.author_contact = finderContact5;
                    }
                    return 0;
                case 29:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        FinderContact finderContact6 = new FinderContact();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderContact6.parseFrom(bArr4);
                        }
                        finderCommentInfo.reply_contact = finderContact6;
                    }
                    return 0;
                case 30:
                    finderCommentInfo.content_type = aVar3.mo141629g(intValue);
                    return 0;
                case 31:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64503ky kyVar3 = new C64503ky();
                        if (bArr5 != null && bArr5.length > 0) {
                            kyVar3.parseFrom(bArr5);
                        }
                        finderCommentInfo.content_info = kyVar3;
                    }
                    return 0;
                case 32:
                    finderCommentInfo.report_json = aVar3.mo141633k(intValue);
                    return 0;
                case 35:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51583uq0 uq04 = new C51583uq0();
                        if (bArr6 != null && bArr6.length > 0) {
                            uq04.parseFrom(bArr6);
                        }
                        finderCommentInfo.ip_region_info = uq04;
                    }
                    return 0;
                case 36:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51833wh0 wh02 = new C51833wh0();
                        if (bArr7 != null && bArr7.length > 0) {
                            wh02.parseFrom(bArr7);
                        }
                        finderCommentInfo.search_keyword_info.add(wh02);
                    }
                    return 0;
                case 37:
                    finderCommentInfo.replaced_content = aVar3.mo141633k(intValue);
                    return 0;
                case 38:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C64772vh0 vh04 = new C64772vh0();
                        if (bArr8 != null && bArr8.length > 0) {
                            vh04.parseFrom(bArr8);
                        }
                        finderCommentInfo.advertisement_info = vh04;
                    }
                    return 0;
                case 39:
                    finderCommentInfo.comment_type = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderCommentInfo setAdvertisement_info(C64772vh0 vh02) {
        this.advertisement_info = vh02;
        return this;
    }

    public FinderCommentInfo setAuthor_contact(FinderContact finderContact) {
        this.author_contact = finderContact;
        return this;
    }

    public FinderCommentInfo setBlacklist_flag(int i) {
        this.blacklist_flag = i;
        return this;
    }

    public FinderCommentInfo setClient_id(String str) {
        this.client_id = str;
        return this;
    }

    public FinderCommentInfo setCommentId(long j) {
        this.commentId = j;
        return this;
    }

    public FinderCommentInfo setComment_type(int i) {
        this.comment_type = i;
        return this;
    }

    public FinderCommentInfo setContent(String str) {
        this.content = str;
        return this;
    }

    public FinderCommentInfo setContent_info(C64503ky kyVar) {
        this.content_info = kyVar;
        return this;
    }

    public FinderCommentInfo setContent_type(int i) {
        this.content_type = i;
        return this;
    }

    public FinderCommentInfo setContinueFlag(int i) {
        this.continueFlag = i;
        return this;
    }

    public FinderCommentInfo setCreatetime(long j) {
        this.createtime = j;
        return this;
    }

    public FinderCommentInfo setDeleteFlag(int i) {
        this.deleteFlag = i;
        return this;
    }

    public FinderCommentInfo setDisplayFlag(int i) {
        this.displayFlag = i;
        return this;
    }

    public FinderCommentInfo setDisplayid(long j) {
        this.displayid = j;
        return this;
    }

    public FinderCommentInfo setDisplayidDiscarded(String str) {
        this.displayidDiscarded = str;
        return this;
    }

    public FinderCommentInfo setExpandCommentCount(int i) {
        this.expandCommentCount = i;
        return this;
    }

    public FinderCommentInfo setExtFlag(int i) {
        this.extFlag = i;
        return this;
    }

    public FinderCommentInfo setHeadUrl(String str) {
        this.headUrl = str;
        return this;
    }

    public FinderCommentInfo setIp_region_info(C51583uq0 uq02) {
        this.ip_region_info = uq02;
        return this;
    }

    public FinderCommentInfo setLastBuffer(C89349b bVar) {
        this.lastBuffer = bVar;
        return this;
    }

    public FinderCommentInfo setLevelTwoComment(LinkedList<FinderCommentInfo> linkedList) {
        this.levelTwoComment = linkedList;
        return this;
    }

    public FinderCommentInfo setLikeCount(int i) {
        this.likeCount = i;
        return this;
    }

    public FinderCommentInfo setLikeFlag(int i) {
        this.likeFlag = i;
        return this;
    }

    public FinderCommentInfo setMsgInfo(C50405mi0 mi02) {
        this.msgInfo = mi02;
        return this;
    }

    public FinderCommentInfo setNickname(String str) {
        this.nickname = str;
        return this;
    }

    public FinderCommentInfo setReplaced_content(String str) {
        this.replaced_content = str;
        return this;
    }

    public FinderCommentInfo setReplyBlacklistFlag(int i) {
        this.replyBlacklistFlag = i;
        return this;
    }

    public FinderCommentInfo setReplyCommentId(long j) {
        this.replyCommentId = j;
        return this;
    }

    public FinderCommentInfo setReplyNickname(String str) {
        this.replyNickname = str;
        return this;
    }

    public FinderCommentInfo setReply_contact(FinderContact finderContact) {
        this.reply_contact = finderContact;
        return this;
    }

    public FinderCommentInfo setReply_content(String str) {
        this.reply_content = str;
        return this;
    }

    public FinderCommentInfo setReply_username(String str) {
        this.reply_username = str;
        return this;
    }

    public FinderCommentInfo setReport_json(String str) {
        this.report_json = str;
        return this;
    }

    public FinderCommentInfo setSearch_keyword_info(LinkedList<C51833wh0> linkedList) {
        this.search_keyword_info = linkedList;
        return this;
    }

    public FinderCommentInfo setUnreadFlag(int i) {
        this.unreadFlag = i;
        return this;
    }

    public FinderCommentInfo setUpContinueFlag(int i) {
        this.upContinueFlag = i;
        return this;
    }

    public FinderCommentInfo setUsername(String str) {
        this.username = str;
        return this;
    }
}
