package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49098d51;
import te3.C49236e51;
import te3.C49335eu3;
import te3.C49742hr0;
import te3.C49965j93;
import te3.C49966ja;
import te3.C50019jp1;
import te3.C50251le1;
import te3.C50428mo1;
import te3.C51243sh0;
import te3.C51270sn1;
import te3.C51583uq0;
import te3.C51691vg0;
import te3.C51810wb1;
import te3.C51869ws0;
import te3.C51974xh1;
import te3.C52271zj0;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderUserPageResponse */
public class FinderUserPageResponse extends C49335eu3 {
    public String acct_detail_entrance;
    public C51869ws0 anchor_stat;
    public C51583uq0 attr_region_info;
    public C51691vg0 biz_info;
    public C51243sh0 collection_list_info;
    public FinderContact contact;
    public int continueFlag;
    public C49965j93 entranceInfo;
    public LinkedList<C52271zj0> eventInfoList = new LinkedList<>();
    public int fansCount;
    public int feedsCount;
    public String firstPageMD5;
    public int friendFollowCount;
    public boolean has_acct_recommend;
    public C51583uq0 ip_region_info;
    public LinkedList<FinderJumpInfo> jump_info = new LinkedList<>();
    public C49742hr0 just_watch;
    public C89349b lastBuffer;
    public C49098d51 liveNoticeInfo;
    public LinkedList<FinderObject> liveObjects = new LinkedList<>();
    public C49236e51 live_notice_list_info;
    public String loggingout_wording;
    public int logout_lock;
    public String logout_url;
    public C51810wb1 mcn_info;
    public int mv_object_move_flag;
    public LinkedList<FinderObject> object = new LinkedList<>();
    public int originalEntranceFlag;
    public C50428mo1 poi_info;
    public C51974xh1 preloadInfo;
    public String preload_buffer;
    public int preload_expire_time;
    public int privateLock;
    public LinkedList<String> userTags = new LinkedList<>();
    public LinkedList<C51270sn1> usualTopics = new LinkedList<>();
    public C50251le1 verifyInfo;
    public C50019jp1 wxaShopInfo;

    public static final FinderUserPageResponse create() {
        return new FinderUserPageResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderUserPageResponse)) {
            return false;
        }
        FinderUserPageResponse finderUserPageResponse = (FinderUserPageResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, finderUserPageResponse.BaseResponse) && C46238a.m51546a(this.object, finderUserPageResponse.object) && C46238a.m51546a(this.firstPageMD5, finderUserPageResponse.firstPageMD5) && C46238a.m51546a(this.contact, finderUserPageResponse.contact) && C46238a.m51546a(Integer.valueOf(this.feedsCount), Integer.valueOf(finderUserPageResponse.feedsCount)) && C46238a.m51546a(Integer.valueOf(this.continueFlag), Integer.valueOf(finderUserPageResponse.continueFlag)) && C46238a.m51546a(this.verifyInfo, finderUserPageResponse.verifyInfo) && C46238a.m51546a(Integer.valueOf(this.fansCount), Integer.valueOf(finderUserPageResponse.fansCount)) && C46238a.m51546a(this.lastBuffer, finderUserPageResponse.lastBuffer) && C46238a.m51546a(Integer.valueOf(this.friendFollowCount), Integer.valueOf(finderUserPageResponse.friendFollowCount)) && C46238a.m51546a(this.userTags, finderUserPageResponse.userTags) && C46238a.m51546a(Integer.valueOf(this.originalEntranceFlag), Integer.valueOf(finderUserPageResponse.originalEntranceFlag)) && C46238a.m51546a(this.entranceInfo, finderUserPageResponse.entranceInfo) && C46238a.m51546a(this.preloadInfo, finderUserPageResponse.preloadInfo) && C46238a.m51546a(this.liveObjects, finderUserPageResponse.liveObjects) && C46238a.m51546a(Integer.valueOf(this.privateLock), Integer.valueOf(finderUserPageResponse.privateLock)) && C46238a.m51546a(this.wxaShopInfo, finderUserPageResponse.wxaShopInfo) && C46238a.m51546a(this.liveNoticeInfo, finderUserPageResponse.liveNoticeInfo) && C46238a.m51546a(this.usualTopics, finderUserPageResponse.usualTopics) && C46238a.m51546a(Integer.valueOf(this.logout_lock), Integer.valueOf(finderUserPageResponse.logout_lock)) && C46238a.m51546a(this.acct_detail_entrance, finderUserPageResponse.acct_detail_entrance) && C46238a.m51546a(this.loggingout_wording, finderUserPageResponse.loggingout_wording) && C46238a.m51546a(this.poi_info, finderUserPageResponse.poi_info) && C46238a.m51546a(this.logout_url, finderUserPageResponse.logout_url) && C46238a.m51546a(this.biz_info, finderUserPageResponse.biz_info) && C46238a.m51546a(this.eventInfoList, finderUserPageResponse.eventInfoList) && C46238a.m51546a(this.just_watch, finderUserPageResponse.just_watch) && C46238a.m51546a(this.live_notice_list_info, finderUserPageResponse.live_notice_list_info) && C46238a.m51546a(this.jump_info, finderUserPageResponse.jump_info) && C46238a.m51546a(Boolean.valueOf(this.has_acct_recommend), Boolean.valueOf(finderUserPageResponse.has_acct_recommend)) && C46238a.m51546a(this.anchor_stat, finderUserPageResponse.anchor_stat) && C46238a.m51546a(this.ip_region_info, finderUserPageResponse.ip_region_info) && C46238a.m51546a(this.mcn_info, finderUserPageResponse.mcn_info) && C46238a.m51546a(Integer.valueOf(this.preload_expire_time), Integer.valueOf(finderUserPageResponse.preload_expire_time)) && C46238a.m51546a(Integer.valueOf(this.mv_object_move_flag), Integer.valueOf(finderUserPageResponse.mv_object_move_flag)) && C46238a.m51546a(this.preload_buffer, finderUserPageResponse.preload_buffer) && C46238a.m51546a(this.collection_list_info, finderUserPageResponse.collection_list_info) && C46238a.m51546a(this.attr_region_info, finderUserPageResponse.attr_region_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.object);
                String str = this.firstPageMD5;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                FinderContact finderContact = this.contact;
                if (finderContact != null) {
                    aVar.mo74322i(5, finderContact.computeSize());
                    this.contact.writeFields(aVar);
                }
                aVar.mo74318e(6, this.feedsCount);
                aVar.mo74318e(7, this.continueFlag);
                C50251le1 le12 = this.verifyInfo;
                if (le12 != null) {
                    aVar.mo74322i(8, le12.computeSize());
                    this.verifyInfo.writeFields(aVar);
                }
                aVar.mo74318e(9, this.fansCount);
                C89349b bVar = this.lastBuffer;
                if (bVar != null) {
                    aVar.mo74315b(10, bVar);
                }
                aVar.mo74318e(11, this.friendFollowCount);
                aVar.mo74320g(12, 1, this.userTags);
                aVar.mo74318e(13, this.originalEntranceFlag);
                C49965j93 j932 = this.entranceInfo;
                if (j932 != null) {
                    aVar.mo74322i(14, j932.computeSize());
                    this.entranceInfo.writeFields(aVar);
                }
                C51974xh1 xh12 = this.preloadInfo;
                if (xh12 != null) {
                    aVar.mo74322i(15, xh12.computeSize());
                    this.preloadInfo.writeFields(aVar);
                }
                aVar.mo74320g(16, 8, this.liveObjects);
                aVar.mo74318e(17, this.privateLock);
                C50019jp1 jp12 = this.wxaShopInfo;
                if (jp12 != null) {
                    aVar.mo74322i(18, jp12.computeSize());
                    this.wxaShopInfo.writeFields(aVar);
                }
                C49098d51 d512 = this.liveNoticeInfo;
                if (d512 != null) {
                    aVar.mo74322i(19, d512.computeSize());
                    this.liveNoticeInfo.writeFields(aVar);
                }
                aVar.mo74320g(20, 8, this.usualTopics);
                aVar.mo74318e(22, this.logout_lock);
                String str2 = this.acct_detail_entrance;
                if (str2 != null) {
                    aVar.mo74323j(23, str2);
                }
                String str3 = this.loggingout_wording;
                if (str3 != null) {
                    aVar.mo74323j(24, str3);
                }
                C50428mo1 mo12 = this.poi_info;
                if (mo12 != null) {
                    aVar.mo74322i(25, mo12.computeSize());
                    this.poi_info.writeFields(aVar);
                }
                String str4 = this.logout_url;
                if (str4 != null) {
                    aVar.mo74323j(26, str4);
                }
                C51691vg0 vg02 = this.biz_info;
                if (vg02 != null) {
                    aVar.mo74322i(27, vg02.computeSize());
                    this.biz_info.writeFields(aVar);
                }
                aVar.mo74320g(28, 8, this.eventInfoList);
                C49742hr0 hr02 = this.just_watch;
                if (hr02 != null) {
                    aVar.mo74322i(29, hr02.computeSize());
                    this.just_watch.writeFields(aVar);
                }
                C49236e51 e512 = this.live_notice_list_info;
                if (e512 != null) {
                    aVar.mo74322i(30, e512.computeSize());
                    this.live_notice_list_info.writeFields(aVar);
                }
                aVar.mo74320g(31, 8, this.jump_info);
                aVar.mo74314a(33, this.has_acct_recommend);
                C51869ws0 ws02 = this.anchor_stat;
                if (ws02 != null) {
                    aVar.mo74322i(34, ws02.computeSize());
                    this.anchor_stat.writeFields(aVar);
                }
                C51583uq0 uq02 = this.ip_region_info;
                if (uq02 != null) {
                    aVar.mo74322i(35, uq02.computeSize());
                    this.ip_region_info.writeFields(aVar);
                }
                C51810wb1 wb12 = this.mcn_info;
                if (wb12 != null) {
                    aVar.mo74322i(36, wb12.computeSize());
                    this.mcn_info.writeFields(aVar);
                }
                aVar.mo74318e(37, this.preload_expire_time);
                aVar.mo74318e(38, this.mv_object_move_flag);
                String str5 = this.preload_buffer;
                if (str5 != null) {
                    aVar.mo74323j(39, str5);
                }
                C51243sh0 sh02 = this.collection_list_info;
                if (sh02 != null) {
                    aVar.mo74322i(40, sh02.computeSize());
                    this.collection_list_info.writeFields(aVar);
                }
                C51583uq0 uq03 = this.attr_region_info;
                if (uq03 != null) {
                    aVar.mo74322i(41, uq03.computeSize());
                    this.attr_region_info.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.object);
            String str6 = this.firstPageMD5;
            if (str6 != null) {
                g += C52418a.m58683j(3, str6);
            }
            FinderContact finderContact2 = this.contact;
            if (finderContact2 != null) {
                g += C52418a.m58682i(5, finderContact2.computeSize());
            }
            int e = g + C52418a.m58678e(6, this.feedsCount) + C52418a.m58678e(7, this.continueFlag);
            C50251le1 le13 = this.verifyInfo;
            if (le13 != null) {
                e += C52418a.m58682i(8, le13.computeSize());
            }
            int e2 = e + C52418a.m58678e(9, this.fansCount);
            C89349b bVar2 = this.lastBuffer;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(10, bVar2);
            }
            int e3 = e2 + C52418a.m58678e(11, this.friendFollowCount) + C52418a.m58680g(12, 1, this.userTags) + C52418a.m58678e(13, this.originalEntranceFlag);
            C49965j93 j933 = this.entranceInfo;
            if (j933 != null) {
                e3 += C52418a.m58682i(14, j933.computeSize());
            }
            C51974xh1 xh13 = this.preloadInfo;
            if (xh13 != null) {
                e3 += C52418a.m58682i(15, xh13.computeSize());
            }
            int g2 = e3 + C52418a.m58680g(16, 8, this.liveObjects) + C52418a.m58678e(17, this.privateLock);
            C50019jp1 jp13 = this.wxaShopInfo;
            if (jp13 != null) {
                g2 += C52418a.m58682i(18, jp13.computeSize());
            }
            C49098d51 d513 = this.liveNoticeInfo;
            if (d513 != null) {
                g2 += C52418a.m58682i(19, d513.computeSize());
            }
            int g3 = g2 + C52418a.m58680g(20, 8, this.usualTopics) + C52418a.m58678e(22, this.logout_lock);
            String str7 = this.acct_detail_entrance;
            if (str7 != null) {
                g3 += C52418a.m58683j(23, str7);
            }
            String str8 = this.loggingout_wording;
            if (str8 != null) {
                g3 += C52418a.m58683j(24, str8);
            }
            C50428mo1 mo13 = this.poi_info;
            if (mo13 != null) {
                g3 += C52418a.m58682i(25, mo13.computeSize());
            }
            String str9 = this.logout_url;
            if (str9 != null) {
                g3 += C52418a.m58683j(26, str9);
            }
            C51691vg0 vg03 = this.biz_info;
            if (vg03 != null) {
                g3 += C52418a.m58682i(27, vg03.computeSize());
            }
            int g4 = g3 + C52418a.m58680g(28, 8, this.eventInfoList);
            C49742hr0 hr03 = this.just_watch;
            if (hr03 != null) {
                g4 += C52418a.m58682i(29, hr03.computeSize());
            }
            C49236e51 e513 = this.live_notice_list_info;
            if (e513 != null) {
                g4 += C52418a.m58682i(30, e513.computeSize());
            }
            int g5 = g4 + C52418a.m58680g(31, 8, this.jump_info) + C52418a.m58674a(33, this.has_acct_recommend);
            C51869ws0 ws03 = this.anchor_stat;
            if (ws03 != null) {
                g5 += C52418a.m58682i(34, ws03.computeSize());
            }
            C51583uq0 uq04 = this.ip_region_info;
            if (uq04 != null) {
                g5 += C52418a.m58682i(35, uq04.computeSize());
            }
            C51810wb1 wb13 = this.mcn_info;
            if (wb13 != null) {
                g5 += C52418a.m58682i(36, wb13.computeSize());
            }
            int e4 = g5 + C52418a.m58678e(37, this.preload_expire_time) + C52418a.m58678e(38, this.mv_object_move_flag);
            String str10 = this.preload_buffer;
            if (str10 != null) {
                e4 += C52418a.m58683j(39, str10);
            }
            C51243sh0 sh03 = this.collection_list_info;
            if (sh03 != null) {
                e4 += C52418a.m58682i(40, sh03.computeSize());
            }
            C51583uq0 uq05 = this.attr_region_info;
            return uq05 != null ? e4 + C52418a.m58682i(41, uq05.computeSize()) : e4;
        } else if (i2 == 2) {
            this.object.clear();
            this.userTags.clear();
            this.liveObjects.clear();
            this.usualTopics.clear();
            this.eventInfoList.clear();
            this.jump_info.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            FinderUserPageResponse finderUserPageResponse = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        finderUserPageResponse.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        finderUserPageResponse.object.add(finderObject);
                    }
                    return 0;
                case 3:
                    finderUserPageResponse.firstPageMD5 = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderContact3.parseFrom(bArr3);
                        }
                        finderUserPageResponse.contact = finderContact3;
                    }
                    return 0;
                case 6:
                    finderUserPageResponse.feedsCount = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    finderUserPageResponse.continueFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50251le1 le14 = new C50251le1();
                        if (bArr4 != null && bArr4.length > 0) {
                            le14.parseFrom(bArr4);
                        }
                        finderUserPageResponse.verifyInfo = le14;
                    }
                    return 0;
                case 9:
                    finderUserPageResponse.fansCount = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    finderUserPageResponse.lastBuffer = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    finderUserPageResponse.friendFollowCount = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    finderUserPageResponse.userTags.add(aVar3.mo141633k(intValue));
                    return 0;
                case 13:
                    finderUserPageResponse.originalEntranceFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49965j93 j934 = new C49965j93();
                        if (bArr5 != null && bArr5.length > 0) {
                            j934.parseFrom(bArr5);
                        }
                        finderUserPageResponse.entranceInfo = j934;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr6 != null && bArr6.length > 0) {
                            xh14.parseFrom(bArr6);
                        }
                        finderUserPageResponse.preloadInfo = xh14;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        FinderObject finderObject2 = new FinderObject();
                        if (bArr7 != null && bArr7.length > 0) {
                            finderObject2.parseFrom(bArr7);
                        }
                        finderUserPageResponse.liveObjects.add(finderObject2);
                    }
                    return 0;
                case 17:
                    finderUserPageResponse.privateLock = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C50019jp1 jp14 = new C50019jp1();
                        if (bArr8 != null && bArr8.length > 0) {
                            jp14.parseFrom(bArr8);
                        }
                        finderUserPageResponse.wxaShopInfo = jp14;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C49098d51 d514 = new C49098d51();
                        if (bArr9 != null && bArr9.length > 0) {
                            d514.parseFrom(bArr9);
                        }
                        finderUserPageResponse.liveNoticeInfo = d514;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51270sn1 sn12 = new C51270sn1();
                        if (bArr10 != null && bArr10.length > 0) {
                            sn12.parseFrom(bArr10);
                        }
                        finderUserPageResponse.usualTopics.add(sn12);
                    }
                    return 0;
                case 22:
                    finderUserPageResponse.logout_lock = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    finderUserPageResponse.acct_detail_entrance = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    finderUserPageResponse.loggingout_wording = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C50428mo1 mo14 = new C50428mo1();
                        if (bArr11 != null && bArr11.length > 0) {
                            mo14.parseFrom(bArr11);
                        }
                        finderUserPageResponse.poi_info = mo14;
                    }
                    return 0;
                case 26:
                    finderUserPageResponse.logout_url = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C51691vg0 vg04 = new C51691vg0();
                        if (bArr12 != null && bArr12.length > 0) {
                            vg04.parseFrom(bArr12);
                        }
                        finderUserPageResponse.biz_info = vg04;
                    }
                    return 0;
                case 28:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C52271zj0 zj02 = new C52271zj0();
                        if (bArr13 != null && bArr13.length > 0) {
                            zj02.parseFrom(bArr13);
                        }
                        finderUserPageResponse.eventInfoList.add(zj02);
                    }
                    return 0;
                case 29:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C49742hr0 hr04 = new C49742hr0();
                        if (bArr14 != null && bArr14.length > 0) {
                            hr04.parseFrom(bArr14);
                        }
                        finderUserPageResponse.just_watch = hr04;
                    }
                    return 0;
                case 30:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C49236e51 e514 = new C49236e51();
                        if (bArr15 != null && bArr15.length > 0) {
                            e514.parseFrom(bArr15);
                        }
                        finderUserPageResponse.live_notice_list_info = e514;
                    }
                    return 0;
                case 31:
                    LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i29 = 0; i29 < size16; i29++) {
                        byte[] bArr16 = j26.get(i29);
                        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                        if (bArr16 != null && bArr16.length > 0) {
                            finderJumpInfo.parseFrom(bArr16);
                        }
                        finderUserPageResponse.jump_info.add(finderJumpInfo);
                    }
                    return 0;
                case 33:
                    finderUserPageResponse.has_acct_recommend = aVar3.mo141625c(intValue);
                    return 0;
                case 34:
                    LinkedList<byte[]> j27 = aVar3.mo141632j(intValue);
                    int size17 = j27.size();
                    for (int i35 = 0; i35 < size17; i35++) {
                        byte[] bArr17 = j27.get(i35);
                        C51869ws0 ws04 = new C51869ws0();
                        if (bArr17 != null && bArr17.length > 0) {
                            ws04.parseFrom(bArr17);
                        }
                        finderUserPageResponse.anchor_stat = ws04;
                    }
                    return 0;
                case 35:
                    LinkedList<byte[]> j28 = aVar3.mo141632j(intValue);
                    int size18 = j28.size();
                    for (int i36 = 0; i36 < size18; i36++) {
                        byte[] bArr18 = j28.get(i36);
                        C51583uq0 uq06 = new C51583uq0();
                        if (bArr18 != null && bArr18.length > 0) {
                            uq06.parseFrom(bArr18);
                        }
                        finderUserPageResponse.ip_region_info = uq06;
                    }
                    return 0;
                case 36:
                    LinkedList<byte[]> j29 = aVar3.mo141632j(intValue);
                    int size19 = j29.size();
                    for (int i37 = 0; i37 < size19; i37++) {
                        byte[] bArr19 = j29.get(i37);
                        C51810wb1 wb14 = new C51810wb1();
                        if (bArr19 != null && bArr19.length > 0) {
                            wb14.parseFrom(bArr19);
                        }
                        finderUserPageResponse.mcn_info = wb14;
                    }
                    return 0;
                case 37:
                    finderUserPageResponse.preload_expire_time = aVar3.mo141629g(intValue);
                    return 0;
                case 38:
                    finderUserPageResponse.mv_object_move_flag = aVar3.mo141629g(intValue);
                    return 0;
                case 39:
                    finderUserPageResponse.preload_buffer = aVar3.mo141633k(intValue);
                    return 0;
                case 40:
                    LinkedList<byte[]> j35 = aVar3.mo141632j(intValue);
                    int size20 = j35.size();
                    for (int i38 = 0; i38 < size20; i38++) {
                        byte[] bArr20 = j35.get(i38);
                        C51243sh0 sh04 = new C51243sh0();
                        if (bArr20 != null && bArr20.length > 0) {
                            sh04.parseFrom(bArr20);
                        }
                        finderUserPageResponse.collection_list_info = sh04;
                    }
                    return 0;
                case 41:
                    LinkedList<byte[]> j36 = aVar3.mo141632j(intValue);
                    int size21 = j36.size();
                    for (int i39 = 0; i39 < size21; i39++) {
                        byte[] bArr21 = j36.get(i39);
                        C51583uq0 uq07 = new C51583uq0();
                        if (bArr21 != null && bArr21.length > 0) {
                            uq07.parseFrom(bArr21);
                        }
                        finderUserPageResponse.attr_region_info = uq07;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderUserPageResponse setAcct_detail_entrance(String str) {
        this.acct_detail_entrance = str;
        return this;
    }

    public FinderUserPageResponse setAnchor_stat(C51869ws0 ws02) {
        this.anchor_stat = ws02;
        return this;
    }

    public FinderUserPageResponse setAttr_region_info(C51583uq0 uq02) {
        this.attr_region_info = uq02;
        return this;
    }

    public FinderUserPageResponse setBiz_info(C51691vg0 vg02) {
        this.biz_info = vg02;
        return this;
    }

    public FinderUserPageResponse setCollection_list_info(C51243sh0 sh02) {
        this.collection_list_info = sh02;
        return this;
    }

    public FinderUserPageResponse setContact(FinderContact finderContact) {
        this.contact = finderContact;
        return this;
    }

    public FinderUserPageResponse setContinueFlag(int i) {
        this.continueFlag = i;
        return this;
    }

    public FinderUserPageResponse setEntranceInfo(C49965j93 j932) {
        this.entranceInfo = j932;
        return this;
    }

    public FinderUserPageResponse setEventInfoList(LinkedList<C52271zj0> linkedList) {
        this.eventInfoList = linkedList;
        return this;
    }

    public FinderUserPageResponse setFansCount(int i) {
        this.fansCount = i;
        return this;
    }

    public FinderUserPageResponse setFeedsCount(int i) {
        this.feedsCount = i;
        return this;
    }

    public FinderUserPageResponse setFirstPageMD5(String str) {
        this.firstPageMD5 = str;
        return this;
    }

    public FinderUserPageResponse setFriendFollowCount(int i) {
        this.friendFollowCount = i;
        return this;
    }

    public FinderUserPageResponse setHas_acct_recommend(boolean z) {
        this.has_acct_recommend = z;
        return this;
    }

    public FinderUserPageResponse setIp_region_info(C51583uq0 uq02) {
        this.ip_region_info = uq02;
        return this;
    }

    public FinderUserPageResponse setJump_info(LinkedList<FinderJumpInfo> linkedList) {
        this.jump_info = linkedList;
        return this;
    }

    public FinderUserPageResponse setJust_watch(C49742hr0 hr02) {
        this.just_watch = hr02;
        return this;
    }

    public FinderUserPageResponse setLastBuffer(C89349b bVar) {
        this.lastBuffer = bVar;
        return this;
    }

    public FinderUserPageResponse setLiveNoticeInfo(C49098d51 d512) {
        this.liveNoticeInfo = d512;
        return this;
    }

    public FinderUserPageResponse setLiveObjects(LinkedList<FinderObject> linkedList) {
        this.liveObjects = linkedList;
        return this;
    }

    public FinderUserPageResponse setLive_notice_list_info(C49236e51 e512) {
        this.live_notice_list_info = e512;
        return this;
    }

    public FinderUserPageResponse setLoggingout_wording(String str) {
        this.loggingout_wording = str;
        return this;
    }

    public FinderUserPageResponse setLogout_lock(int i) {
        this.logout_lock = i;
        return this;
    }

    public FinderUserPageResponse setLogout_url(String str) {
        this.logout_url = str;
        return this;
    }

    public FinderUserPageResponse setMcn_info(C51810wb1 wb12) {
        this.mcn_info = wb12;
        return this;
    }

    public FinderUserPageResponse setMv_object_move_flag(int i) {
        this.mv_object_move_flag = i;
        return this;
    }

    public FinderUserPageResponse setObject(LinkedList<FinderObject> linkedList) {
        this.object = linkedList;
        return this;
    }

    public FinderUserPageResponse setOriginalEntranceFlag(int i) {
        this.originalEntranceFlag = i;
        return this;
    }

    public FinderUserPageResponse setPoi_info(C50428mo1 mo12) {
        this.poi_info = mo12;
        return this;
    }

    public FinderUserPageResponse setPreloadInfo(C51974xh1 xh12) {
        this.preloadInfo = xh12;
        return this;
    }

    public FinderUserPageResponse setPreload_buffer(String str) {
        this.preload_buffer = str;
        return this;
    }

    public FinderUserPageResponse setPreload_expire_time(int i) {
        this.preload_expire_time = i;
        return this;
    }

    public FinderUserPageResponse setPrivateLock(int i) {
        this.privateLock = i;
        return this;
    }

    public FinderUserPageResponse setUserTags(LinkedList<String> linkedList) {
        this.userTags = linkedList;
        return this;
    }

    public FinderUserPageResponse setUsualTopics(LinkedList<C51270sn1> linkedList) {
        this.usualTopics = linkedList;
        return this;
    }

    public FinderUserPageResponse setVerifyInfo(C50251le1 le12) {
        this.verifyInfo = le12;
        return this;
    }

    public FinderUserPageResponse setWxaShopInfo(C50019jp1 jp12) {
        this.wxaShopInfo = jp12;
        return this;
    }
}
