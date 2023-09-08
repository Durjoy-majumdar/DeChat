package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49098d51;
import te3.C49212e1;
import te3.C49595gq0;
import te3.C49849ii0;
import te3.C49988jg1;
import te3.C50266li0;
import te3.C50405mi0;
import te3.C50955qg0;
import te3.C64756up2;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderContact */
public class FinderContact extends C47465a {
    public C49212e1 achievement_info;
    public long additionalFlag;
    public FinderAuthInfo authInfo;
    public LinkedList<C50955qg0> bind_info = new LinkedList<>();
    public int coverEntranceFlag;
    public String coverImgUrl;
    public String coverUrl;
    public int extFlag;
    public C49849ii0 extInfo;
    public int fans_count;
    public int feedCount;
    public int followFlag;
    public int followTime;
    public int foreign_user_flag;
    public int friend_follow_count;
    public C49595gq0 guest_info;
    public String headUrl;
    public String liveCoverImgUrl;
    public int liveStatus;
    public C50266li0 live_info;
    public C49098d51 live_notice_info;
    public C64756up2 live_room_img;
    public String loggingout_wording;
    public LinkedList<FinderJumpInfo> menu = new LinkedList<>();
    public C50405mi0 msgInfo;
    public String nickname;
    public int one_time_flag;
    public int originalEntranceFlag;
    public int originalFlag;
    public C49988jg1 originalInfo;
    public long seq;
    public String signature;
    public int spamStatus;
    public long status;
    public int user_flag;
    public int user_mode;
    public String username;
    public String vestNickname;
    public String wx_username_v5;

    public static final FinderContact create() {
        return new FinderContact();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderContact)) {
            return false;
        }
        FinderContact finderContact = (FinderContact) aVar;
        return C46238a.m51546a(this.username, finderContact.username) && C46238a.m51546a(this.nickname, finderContact.nickname) && C46238a.m51546a(this.headUrl, finderContact.headUrl) && C46238a.m51546a(Long.valueOf(this.seq), Long.valueOf(finderContact.seq)) && C46238a.m51546a(this.signature, finderContact.signature) && C46238a.m51546a(Integer.valueOf(this.followFlag), Integer.valueOf(finderContact.followFlag)) && C46238a.m51546a(Integer.valueOf(this.followTime), Integer.valueOf(finderContact.followTime)) && C46238a.m51546a(this.authInfo, finderContact.authInfo) && C46238a.m51546a(this.coverImgUrl, finderContact.coverImgUrl) && C46238a.m51546a(Integer.valueOf(this.spamStatus), Integer.valueOf(finderContact.spamStatus)) && C46238a.m51546a(Integer.valueOf(this.extFlag), Integer.valueOf(finderContact.extFlag)) && C46238a.m51546a(this.extInfo, finderContact.extInfo) && C46238a.m51546a(Integer.valueOf(this.originalFlag), Integer.valueOf(finderContact.originalFlag)) && C46238a.m51546a(this.originalInfo, finderContact.originalInfo) && C46238a.m51546a(Integer.valueOf(this.liveStatus), Integer.valueOf(finderContact.liveStatus)) && C46238a.m51546a(this.msgInfo, finderContact.msgInfo) && C46238a.m51546a(Integer.valueOf(this.originalEntranceFlag), Integer.valueOf(finderContact.originalEntranceFlag)) && C46238a.m51546a(this.liveCoverImgUrl, finderContact.liveCoverImgUrl) && C46238a.m51546a(Integer.valueOf(this.foreign_user_flag), Integer.valueOf(finderContact.foreign_user_flag)) && C46238a.m51546a(this.live_notice_info, finderContact.live_notice_info) && C46238a.m51546a(this.loggingout_wording, finderContact.loggingout_wording) && C46238a.m51546a(this.live_info, finderContact.live_info) && C46238a.m51546a(Integer.valueOf(this.friend_follow_count), Integer.valueOf(finderContact.friend_follow_count)) && C46238a.m51546a(Integer.valueOf(this.fans_count), Integer.valueOf(finderContact.fans_count)) && C46238a.m51546a(this.wx_username_v5, finderContact.wx_username_v5) && C46238a.m51546a(this.vestNickname, finderContact.vestNickname) && C46238a.m51546a(Integer.valueOf(this.feedCount), Integer.valueOf(finderContact.feedCount)) && C46238a.m51546a(Integer.valueOf(this.user_mode), Integer.valueOf(finderContact.user_mode)) && C46238a.m51546a(this.guest_info, finderContact.guest_info) && C46238a.m51546a(this.bind_info, finderContact.bind_info) && C46238a.m51546a(this.coverUrl, finderContact.coverUrl) && C46238a.m51546a(Integer.valueOf(this.coverEntranceFlag), Integer.valueOf(finderContact.coverEntranceFlag)) && C46238a.m51546a(this.achievement_info, finderContact.achievement_info) && C46238a.m51546a(this.menu, finderContact.menu) && C46238a.m51546a(Integer.valueOf(this.user_flag), Integer.valueOf(finderContact.user_flag)) && C46238a.m51546a(Integer.valueOf(this.one_time_flag), Integer.valueOf(finderContact.one_time_flag)) && C46238a.m51546a(Long.valueOf(this.status), Long.valueOf(finderContact.status)) && C46238a.m51546a(this.live_room_img, finderContact.live_room_img) && C46238a.m51546a(Long.valueOf(this.additionalFlag), Long.valueOf(finderContact.additionalFlag));
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
            String str3 = this.headUrl;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.seq);
            String str4 = this.signature;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.followFlag);
            aVar.mo74318e(7, this.followTime);
            FinderAuthInfo finderAuthInfo = this.authInfo;
            if (finderAuthInfo != null) {
                aVar.mo74322i(8, finderAuthInfo.computeSize());
                this.authInfo.writeFields(aVar);
            }
            String str5 = this.coverImgUrl;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.spamStatus);
            aVar.mo74318e(11, this.extFlag);
            C49849ii0 ii02 = this.extInfo;
            if (ii02 != null) {
                aVar.mo74322i(12, ii02.computeSize());
                this.extInfo.writeFields(aVar);
            }
            aVar.mo74318e(13, this.originalFlag);
            C49988jg1 jg12 = this.originalInfo;
            if (jg12 != null) {
                aVar.mo74322i(14, jg12.computeSize());
                this.originalInfo.writeFields(aVar);
            }
            aVar.mo74318e(15, this.liveStatus);
            C50405mi0 mi02 = this.msgInfo;
            if (mi02 != null) {
                aVar.mo74322i(16, mi02.computeSize());
                this.msgInfo.writeFields(aVar);
            }
            aVar.mo74318e(17, this.originalEntranceFlag);
            String str6 = this.liveCoverImgUrl;
            if (str6 != null) {
                aVar.mo74323j(18, str6);
            }
            aVar.mo74318e(19, this.foreign_user_flag);
            C49098d51 d512 = this.live_notice_info;
            if (d512 != null) {
                aVar.mo74322i(20, d512.computeSize());
                this.live_notice_info.writeFields(aVar);
            }
            String str7 = this.loggingout_wording;
            if (str7 != null) {
                aVar.mo74323j(21, str7);
            }
            C50266li0 li02 = this.live_info;
            if (li02 != null) {
                aVar.mo74322i(22, li02.computeSize());
                this.live_info.writeFields(aVar);
            }
            aVar.mo74318e(23, this.friend_follow_count);
            aVar.mo74318e(24, this.fans_count);
            String str8 = this.wx_username_v5;
            if (str8 != null) {
                aVar.mo74323j(25, str8);
            }
            String str9 = this.vestNickname;
            if (str9 != null) {
                aVar.mo74323j(26, str9);
            }
            aVar.mo74318e(27, this.feedCount);
            aVar.mo74318e(28, this.user_mode);
            C49595gq0 gq02 = this.guest_info;
            if (gq02 != null) {
                aVar.mo74322i(29, gq02.computeSize());
                this.guest_info.writeFields(aVar);
            }
            aVar.mo74320g(30, 8, this.bind_info);
            String str10 = this.coverUrl;
            if (str10 != null) {
                aVar.mo74323j(31, str10);
            }
            aVar.mo74318e(32, this.coverEntranceFlag);
            C49212e1 e1Var = this.achievement_info;
            if (e1Var != null) {
                aVar.mo74322i(33, e1Var.computeSize());
                this.achievement_info.writeFields(aVar);
            }
            aVar.mo74320g(34, 8, this.menu);
            aVar.mo74318e(35, this.user_flag);
            aVar.mo74318e(36, this.one_time_flag);
            aVar.mo74321h(38, this.status);
            C64756up2 up22 = this.live_room_img;
            if (up22 != null) {
                aVar.mo74322i(39, up22.computeSize());
                this.live_room_img.writeFields(aVar);
            }
            aVar.mo74321h(40, this.additionalFlag);
            return 0;
        } else if (i2 == 1) {
            String str11 = this.username;
            if (str11 != null) {
                i3 = C52418a.m58683j(1, str11) + 0;
            }
            String str12 = this.nickname;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            String str13 = this.headUrl;
            if (str13 != null) {
                i3 += C52418a.m58683j(3, str13);
            }
            int h = i3 + C52418a.m58681h(4, this.seq);
            String str14 = this.signature;
            if (str14 != null) {
                h += C52418a.m58683j(5, str14);
            }
            int e = h + C52418a.m58678e(6, this.followFlag) + C52418a.m58678e(7, this.followTime);
            FinderAuthInfo finderAuthInfo2 = this.authInfo;
            if (finderAuthInfo2 != null) {
                e += C52418a.m58682i(8, finderAuthInfo2.computeSize());
            }
            String str15 = this.coverImgUrl;
            if (str15 != null) {
                e += C52418a.m58683j(9, str15);
            }
            int e2 = e + C52418a.m58678e(10, this.spamStatus) + C52418a.m58678e(11, this.extFlag);
            C49849ii0 ii03 = this.extInfo;
            if (ii03 != null) {
                e2 += C52418a.m58682i(12, ii03.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(13, this.originalFlag);
            C49988jg1 jg13 = this.originalInfo;
            if (jg13 != null) {
                e3 += C52418a.m58682i(14, jg13.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(15, this.liveStatus);
            C50405mi0 mi03 = this.msgInfo;
            if (mi03 != null) {
                e4 += C52418a.m58682i(16, mi03.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(17, this.originalEntranceFlag);
            String str16 = this.liveCoverImgUrl;
            if (str16 != null) {
                e5 += C52418a.m58683j(18, str16);
            }
            int e6 = e5 + C52418a.m58678e(19, this.foreign_user_flag);
            C49098d51 d513 = this.live_notice_info;
            if (d513 != null) {
                e6 += C52418a.m58682i(20, d513.computeSize());
            }
            String str17 = this.loggingout_wording;
            if (str17 != null) {
                e6 += C52418a.m58683j(21, str17);
            }
            C50266li0 li03 = this.live_info;
            if (li03 != null) {
                e6 += C52418a.m58682i(22, li03.computeSize());
            }
            int e7 = e6 + C52418a.m58678e(23, this.friend_follow_count) + C52418a.m58678e(24, this.fans_count);
            String str18 = this.wx_username_v5;
            if (str18 != null) {
                e7 += C52418a.m58683j(25, str18);
            }
            String str19 = this.vestNickname;
            if (str19 != null) {
                e7 += C52418a.m58683j(26, str19);
            }
            int e8 = e7 + C52418a.m58678e(27, this.feedCount) + C52418a.m58678e(28, this.user_mode);
            C49595gq0 gq03 = this.guest_info;
            if (gq03 != null) {
                e8 += C52418a.m58682i(29, gq03.computeSize());
            }
            int g = e8 + C52418a.m58680g(30, 8, this.bind_info);
            String str20 = this.coverUrl;
            if (str20 != null) {
                g += C52418a.m58683j(31, str20);
            }
            int e9 = g + C52418a.m58678e(32, this.coverEntranceFlag);
            C49212e1 e1Var2 = this.achievement_info;
            if (e1Var2 != null) {
                e9 += C52418a.m58682i(33, e1Var2.computeSize());
            }
            int g2 = e9 + C52418a.m58680g(34, 8, this.menu) + C52418a.m58678e(35, this.user_flag) + C52418a.m58678e(36, this.one_time_flag) + C52418a.m58681h(38, this.status);
            C64756up2 up23 = this.live_room_img;
            if (up23 != null) {
                g2 += C52418a.m58682i(39, up23.computeSize());
            }
            return g2 + C52418a.m58681h(40, this.additionalFlag);
        } else if (i2 == 2) {
            this.bind_info.clear();
            this.menu.clear();
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
            FinderContact finderContact = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderContact.username = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    finderContact.nickname = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    finderContact.headUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    finderContact.seq = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    finderContact.signature = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    finderContact.followFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    finderContact.followTime = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        FinderAuthInfo finderAuthInfo3 = new FinderAuthInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderAuthInfo3.parseFrom(bArr);
                        }
                        finderContact.authInfo = finderAuthInfo3;
                    }
                    return 0;
                case 9:
                    finderContact.coverImgUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    finderContact.spamStatus = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    finderContact.extFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49849ii0 ii04 = new C49849ii0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ii04.parseFrom(bArr2);
                        }
                        finderContact.extInfo = ii04;
                    }
                    return 0;
                case 13:
                    finderContact.originalFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49988jg1 jg14 = new C49988jg1();
                        if (bArr3 != null && bArr3.length > 0) {
                            jg14.parseFrom(bArr3);
                        }
                        finderContact.originalInfo = jg14;
                    }
                    return 0;
                case 15:
                    finderContact.liveStatus = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50405mi0 mi04 = new C50405mi0();
                        if (bArr4 != null && bArr4.length > 0) {
                            mi04.parseFrom(bArr4);
                        }
                        finderContact.msgInfo = mi04;
                    }
                    return 0;
                case 17:
                    finderContact.originalEntranceFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    finderContact.liveCoverImgUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    finderContact.foreign_user_flag = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49098d51 d514 = new C49098d51();
                        if (bArr5 != null && bArr5.length > 0) {
                            d514.parseFrom(bArr5);
                        }
                        finderContact.live_notice_info = d514;
                    }
                    return 0;
                case 21:
                    finderContact.loggingout_wording = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50266li0 li04 = new C50266li0();
                        if (bArr6 != null && bArr6.length > 0) {
                            li04.parseFrom(bArr6);
                        }
                        finderContact.live_info = li04;
                    }
                    return 0;
                case 23:
                    finderContact.friend_follow_count = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    finderContact.fans_count = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    finderContact.wx_username_v5 = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    finderContact.vestNickname = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    finderContact.feedCount = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    finderContact.user_mode = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C49595gq0 gq04 = new C49595gq0();
                        if (bArr7 != null && bArr7.length > 0) {
                            gq04.parseFrom(bArr7);
                        }
                        finderContact.guest_info = gq04;
                    }
                    return 0;
                case 30:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C50955qg0 qg02 = new C50955qg0();
                        if (bArr8 != null && bArr8.length > 0) {
                            qg02.parseFrom(bArr8);
                        }
                        finderContact.bind_info.add(qg02);
                    }
                    return 0;
                case 31:
                    finderContact.coverUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 32:
                    finderContact.coverEntranceFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 33:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C49212e1 e1Var3 = new C49212e1();
                        if (bArr9 != null && bArr9.length > 0) {
                            e1Var3.parseFrom(bArr9);
                        }
                        finderContact.achievement_info = e1Var3;
                    }
                    return 0;
                case 34:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                        if (bArr10 != null && bArr10.length > 0) {
                            finderJumpInfo.parseFrom(bArr10);
                        }
                        finderContact.menu.add(finderJumpInfo);
                    }
                    return 0;
                case 35:
                    finderContact.user_flag = aVar3.mo141629g(intValue);
                    return 0;
                case 36:
                    finderContact.one_time_flag = aVar3.mo141629g(intValue);
                    return 0;
                case 38:
                    finderContact.status = aVar3.mo141631i(intValue);
                    return 0;
                case 39:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C64756up2 up24 = new C64756up2();
                        if (bArr11 != null && bArr11.length > 0) {
                            up24.parseFrom(bArr11);
                        }
                        finderContact.live_room_img = up24;
                    }
                    return 0;
                case 40:
                    finderContact.additionalFlag = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderContact setAchievement_info(C49212e1 e1Var) {
        this.achievement_info = e1Var;
        return this;
    }

    public FinderContact setAdditionalFlag(long j) {
        this.additionalFlag = j;
        return this;
    }

    public FinderContact setAuthInfo(FinderAuthInfo finderAuthInfo) {
        this.authInfo = finderAuthInfo;
        return this;
    }

    public FinderContact setBind_info(LinkedList<C50955qg0> linkedList) {
        this.bind_info = linkedList;
        return this;
    }

    public FinderContact setCoverEntranceFlag(int i) {
        this.coverEntranceFlag = i;
        return this;
    }

    public FinderContact setCoverImgUrl(String str) {
        this.coverImgUrl = str;
        return this;
    }

    public FinderContact setCoverUrl(String str) {
        this.coverUrl = str;
        return this;
    }

    public FinderContact setExtFlag(int i) {
        this.extFlag = i;
        return this;
    }

    public FinderContact setExtInfo(C49849ii0 ii02) {
        this.extInfo = ii02;
        return this;
    }

    public FinderContact setFans_count(int i) {
        this.fans_count = i;
        return this;
    }

    public FinderContact setFeedCount(int i) {
        this.feedCount = i;
        return this;
    }

    public FinderContact setFollowFlag(int i) {
        this.followFlag = i;
        return this;
    }

    public FinderContact setFollowTime(int i) {
        this.followTime = i;
        return this;
    }

    public FinderContact setForeign_user_flag(int i) {
        this.foreign_user_flag = i;
        return this;
    }

    public FinderContact setFriend_follow_count(int i) {
        this.friend_follow_count = i;
        return this;
    }

    public FinderContact setGuest_info(C49595gq0 gq02) {
        this.guest_info = gq02;
        return this;
    }

    public FinderContact setHeadUrl(String str) {
        this.headUrl = str;
        return this;
    }

    public FinderContact setLiveCoverImgUrl(String str) {
        this.liveCoverImgUrl = str;
        return this;
    }

    public FinderContact setLiveStatus(int i) {
        this.liveStatus = i;
        return this;
    }

    public FinderContact setLive_info(C50266li0 li02) {
        this.live_info = li02;
        return this;
    }

    public FinderContact setLive_notice_info(C49098d51 d512) {
        this.live_notice_info = d512;
        return this;
    }

    public FinderContact setLive_room_img(C64756up2 up22) {
        this.live_room_img = up22;
        return this;
    }

    public FinderContact setLoggingout_wording(String str) {
        this.loggingout_wording = str;
        return this;
    }

    public FinderContact setMenu(LinkedList<FinderJumpInfo> linkedList) {
        this.menu = linkedList;
        return this;
    }

    public FinderContact setMsgInfo(C50405mi0 mi02) {
        this.msgInfo = mi02;
        return this;
    }

    public FinderContact setNickname(String str) {
        this.nickname = str;
        return this;
    }

    public FinderContact setOne_time_flag(int i) {
        this.one_time_flag = i;
        return this;
    }

    public FinderContact setOriginalEntranceFlag(int i) {
        this.originalEntranceFlag = i;
        return this;
    }

    public FinderContact setOriginalFlag(int i) {
        this.originalFlag = i;
        return this;
    }

    public FinderContact setOriginalInfo(C49988jg1 jg12) {
        this.originalInfo = jg12;
        return this;
    }

    public FinderContact setSeq(long j) {
        this.seq = j;
        return this;
    }

    public FinderContact setSignature(String str) {
        this.signature = str;
        return this;
    }

    public FinderContact setSpamStatus(int i) {
        this.spamStatus = i;
        return this;
    }

    public FinderContact setStatus(long j) {
        this.status = j;
        return this;
    }

    public FinderContact setUser_flag(int i) {
        this.user_flag = i;
        return this;
    }

    public FinderContact setUser_mode(int i) {
        this.user_mode = i;
        return this;
    }

    public FinderContact setUsername(String str) {
        this.username = str;
        return this;
    }

    public FinderContact setVestNickname(String str) {
        this.vestNickname = str;
        return this;
    }

    public FinderContact setWx_username_v5(String str) {
        this.wx_username_v5 = str;
        return this;
    }
}
