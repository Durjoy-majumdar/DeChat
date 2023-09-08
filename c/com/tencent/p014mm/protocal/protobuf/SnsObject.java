package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C64491kg3;
import te3.h84;
import te3.i74;
import te3.q64;
import te3.w64;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.SnsObject */
public class SnsObject extends C47465a {

    /* renamed from: d */
    public static final /* synthetic */ int f283890d = 0;
    public LinkedList<Integer> BlackContactTagIdList = new LinkedList<>();
    public int BlackContactTagIdListCount;
    public LinkedList<C51163rv3> BlackList = new LinkedList<>();
    public int BlackListCount;
    public int CommentCount;
    public LinkedList<w64> CommentUserList = new LinkedList<>();
    public int CommentUserListCount;
    public int CreateTime;
    public int DeleteFlag;
    public int ExtFlag;
    public int FlowerFlag;
    public LinkedList<w64> FlowerUserList = new LinkedList<>();
    public int FlowerUserListCount;
    public LinkedList<Integer> GroupContactTagIdList = new LinkedList<>();
    public int GroupContactTagIdListCount;
    public int GroupCount;
    public LinkedList<i74> GroupList = new LinkedList<>();
    public LinkedList<C51163rv3> GroupUser = new LinkedList<>();
    public int GroupUserCount;
    public int GuideFinder;

    /* renamed from: Id */
    public long f283891Id;
    public int IsNotRichText;
    public int LikeCount;
    public int LikeFlag;
    public LinkedList<w64> LikeUserList = new LinkedList<>();
    public int LikeUserListCount;
    public LinkedList<w64> NewWithTaList = new LinkedList<>();
    public int NewWithTaListCount;
    public String Nickname;
    public int NoChange;
    public C51018qv3 ObjectDesc;
    public C51018qv3 ObjectOperations;
    public int ObjectType;
    public C64491kg3 PreDownloadInfo;
    public long ReferId;
    public String ReferUsername;
    public h84 SnsRedEnvelops;
    public String Username;
    public q64 WeAppInfo;
    public int WeiShangFeedType;
    public int WeiShangSellerType;
    public int WeiShangVideoSourceType;
    public int WithChatroomListCount;
    public int WithTaHasOther;
    public LinkedList<C51163rv3> WithTaList = new LinkedList<>();
    public int WithTaListCount;
    public int WithUserCount;
    public LinkedList<w64> WithUserList = new LinkedList<>();
    public int WithUserListCount;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof SnsObject)) {
            return false;
        }
        SnsObject snsObject = (SnsObject) aVar;
        return C46238a.m51546a(Long.valueOf(this.f283891Id), Long.valueOf(snsObject.f283891Id)) && C46238a.m51546a(this.Username, snsObject.Username) && C46238a.m51546a(this.Nickname, snsObject.Nickname) && C46238a.m51546a(Integer.valueOf(this.CreateTime), Integer.valueOf(snsObject.CreateTime)) && C46238a.m51546a(this.ObjectDesc, snsObject.ObjectDesc) && C46238a.m51546a(Integer.valueOf(this.LikeFlag), Integer.valueOf(snsObject.LikeFlag)) && C46238a.m51546a(Integer.valueOf(this.LikeCount), Integer.valueOf(snsObject.LikeCount)) && C46238a.m51546a(Integer.valueOf(this.LikeUserListCount), Integer.valueOf(snsObject.LikeUserListCount)) && C46238a.m51546a(this.LikeUserList, snsObject.LikeUserList) && C46238a.m51546a(Integer.valueOf(this.CommentCount), Integer.valueOf(snsObject.CommentCount)) && C46238a.m51546a(Integer.valueOf(this.CommentUserListCount), Integer.valueOf(snsObject.CommentUserListCount)) && C46238a.m51546a(this.CommentUserList, snsObject.CommentUserList) && C46238a.m51546a(Integer.valueOf(this.WithUserCount), Integer.valueOf(snsObject.WithUserCount)) && C46238a.m51546a(Integer.valueOf(this.WithUserListCount), Integer.valueOf(snsObject.WithUserListCount)) && C46238a.m51546a(this.WithUserList, snsObject.WithUserList) && C46238a.m51546a(Integer.valueOf(this.ExtFlag), Integer.valueOf(snsObject.ExtFlag)) && C46238a.m51546a(Integer.valueOf(this.NoChange), Integer.valueOf(snsObject.NoChange)) && C46238a.m51546a(Integer.valueOf(this.GroupCount), Integer.valueOf(snsObject.GroupCount)) && C46238a.m51546a(this.GroupList, snsObject.GroupList) && C46238a.m51546a(Integer.valueOf(this.IsNotRichText), Integer.valueOf(snsObject.IsNotRichText)) && C46238a.m51546a(this.ReferUsername, snsObject.ReferUsername) && C46238a.m51546a(Long.valueOf(this.ReferId), Long.valueOf(snsObject.ReferId)) && C46238a.m51546a(Integer.valueOf(this.BlackListCount), Integer.valueOf(snsObject.BlackListCount)) && C46238a.m51546a(this.BlackList, snsObject.BlackList) && C46238a.m51546a(Integer.valueOf(this.DeleteFlag), Integer.valueOf(snsObject.DeleteFlag)) && C46238a.m51546a(Integer.valueOf(this.GroupUserCount), Integer.valueOf(snsObject.GroupUserCount)) && C46238a.m51546a(this.GroupUser, snsObject.GroupUser) && C46238a.m51546a(this.ObjectOperations, snsObject.ObjectOperations) && C46238a.m51546a(this.SnsRedEnvelops, snsObject.SnsRedEnvelops) && C46238a.m51546a(this.PreDownloadInfo, snsObject.PreDownloadInfo) && C46238a.m51546a(this.WeAppInfo, snsObject.WeAppInfo) && C46238a.m51546a(Integer.valueOf(this.WithChatroomListCount), Integer.valueOf(snsObject.WithChatroomListCount)) && C46238a.m51546a(Integer.valueOf(this.WithTaListCount), Integer.valueOf(snsObject.WithTaListCount)) && C46238a.m51546a(this.WithTaList, snsObject.WithTaList) && C46238a.m51546a(Integer.valueOf(this.WithTaHasOther), Integer.valueOf(snsObject.WithTaHasOther)) && C46238a.m51546a(Integer.valueOf(this.FlowerUserListCount), Integer.valueOf(snsObject.FlowerUserListCount)) && C46238a.m51546a(this.FlowerUserList, snsObject.FlowerUserList) && C46238a.m51546a(Integer.valueOf(this.FlowerFlag), Integer.valueOf(snsObject.FlowerFlag)) && C46238a.m51546a(this.NewWithTaList, snsObject.NewWithTaList) && C46238a.m51546a(Integer.valueOf(this.NewWithTaListCount), Integer.valueOf(snsObject.NewWithTaListCount)) && C46238a.m51546a(Integer.valueOf(this.BlackContactTagIdListCount), Integer.valueOf(snsObject.BlackContactTagIdListCount)) && C46238a.m51546a(this.BlackContactTagIdList, snsObject.BlackContactTagIdList) && C46238a.m51546a(Integer.valueOf(this.GroupContactTagIdListCount), Integer.valueOf(snsObject.GroupContactTagIdListCount)) && C46238a.m51546a(this.GroupContactTagIdList, snsObject.GroupContactTagIdList) && C46238a.m51546a(Integer.valueOf(this.WeiShangSellerType), Integer.valueOf(snsObject.WeiShangSellerType)) && C46238a.m51546a(Integer.valueOf(this.WeiShangFeedType), Integer.valueOf(snsObject.WeiShangFeedType)) && C46238a.m51546a(Integer.valueOf(this.WeiShangVideoSourceType), Integer.valueOf(snsObject.WeiShangVideoSourceType)) && C46238a.m51546a(Integer.valueOf(this.ObjectType), Integer.valueOf(snsObject.ObjectType)) && C46238a.m51546a(Integer.valueOf(this.GuideFinder), Integer.valueOf(snsObject.GuideFinder));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.ObjectDesc != null) {
                aVar.mo74321h(1, this.f283891Id);
                String str = this.Username;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.Nickname;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.CreateTime);
                C51018qv3 qv32 = this.ObjectDesc;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.ObjectDesc.writeFields(aVar);
                }
                aVar.mo74318e(6, this.LikeFlag);
                aVar.mo74318e(7, this.LikeCount);
                aVar.mo74318e(8, this.LikeUserListCount);
                aVar.mo74320g(9, 8, this.LikeUserList);
                aVar.mo74318e(10, this.CommentCount);
                aVar.mo74318e(11, this.CommentUserListCount);
                aVar.mo74320g(12, 8, this.CommentUserList);
                aVar.mo74318e(13, this.WithUserCount);
                aVar.mo74318e(14, this.WithUserListCount);
                aVar.mo74320g(15, 8, this.WithUserList);
                aVar.mo74318e(16, this.ExtFlag);
                aVar.mo74318e(17, this.NoChange);
                aVar.mo74318e(18, this.GroupCount);
                aVar.mo74320g(19, 8, this.GroupList);
                aVar.mo74318e(20, this.IsNotRichText);
                String str3 = this.ReferUsername;
                if (str3 != null) {
                    aVar.mo74323j(21, str3);
                }
                aVar.mo74321h(22, this.ReferId);
                aVar.mo74318e(23, this.BlackListCount);
                aVar.mo74320g(24, 8, this.BlackList);
                aVar.mo74318e(25, this.DeleteFlag);
                aVar.mo74318e(26, this.GroupUserCount);
                aVar.mo74320g(27, 8, this.GroupUser);
                C51018qv3 qv33 = this.ObjectOperations;
                if (qv33 != null) {
                    aVar.mo74322i(28, qv33.computeSize());
                    this.ObjectOperations.writeFields(aVar);
                }
                h84 h84 = this.SnsRedEnvelops;
                if (h84 != null) {
                    aVar.mo74322i(29, h84.computeSize());
                    this.SnsRedEnvelops.writeFields(aVar);
                }
                C64491kg3 kg32 = this.PreDownloadInfo;
                if (kg32 != null) {
                    aVar.mo74322i(30, kg32.computeSize());
                    this.PreDownloadInfo.writeFields(aVar);
                }
                q64 q64 = this.WeAppInfo;
                if (q64 != null) {
                    aVar.mo74322i(31, q64.computeSize());
                    this.WeAppInfo.writeFields(aVar);
                }
                aVar.mo74318e(32, this.WithChatroomListCount);
                aVar.mo74318e(34, this.WithTaListCount);
                aVar.mo74320g(35, 8, this.WithTaList);
                aVar.mo74318e(36, this.WithTaHasOther);
                aVar.mo74318e(37, this.FlowerUserListCount);
                aVar.mo74320g(38, 8, this.FlowerUserList);
                aVar.mo74318e(39, this.FlowerFlag);
                aVar.mo74320g(40, 8, this.NewWithTaList);
                aVar.mo74318e(41, this.NewWithTaListCount);
                aVar.mo74318e(42, this.BlackContactTagIdListCount);
                aVar.mo74324k(43, 2, this.BlackContactTagIdList);
                aVar.mo74318e(44, this.GroupContactTagIdListCount);
                aVar.mo74324k(45, 2, this.GroupContactTagIdList);
                aVar.mo74318e(46, this.WeiShangSellerType);
                aVar.mo74318e(47, this.WeiShangFeedType);
                aVar.mo74318e(48, this.WeiShangVideoSourceType);
                aVar.mo74318e(49, this.ObjectType);
                aVar.mo74318e(50, this.GuideFinder);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ObjectDesc");
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f283891Id) + 0;
            String str4 = this.Username;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            String str5 = this.Nickname;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            int e = h + C52418a.m58678e(4, this.CreateTime);
            C51018qv3 qv34 = this.ObjectDesc;
            if (qv34 != null) {
                e += C52418a.m58682i(5, qv34.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.LikeFlag) + C52418a.m58678e(7, this.LikeCount) + C52418a.m58678e(8, this.LikeUserListCount) + C52418a.m58680g(9, 8, this.LikeUserList) + C52418a.m58678e(10, this.CommentCount) + C52418a.m58678e(11, this.CommentUserListCount) + C52418a.m58680g(12, 8, this.CommentUserList) + C52418a.m58678e(13, this.WithUserCount) + C52418a.m58678e(14, this.WithUserListCount) + C52418a.m58680g(15, 8, this.WithUserList) + C52418a.m58678e(16, this.ExtFlag) + C52418a.m58678e(17, this.NoChange) + C52418a.m58678e(18, this.GroupCount) + C52418a.m58680g(19, 8, this.GroupList) + C52418a.m58678e(20, this.IsNotRichText);
            String str6 = this.ReferUsername;
            if (str6 != null) {
                e2 += C52418a.m58683j(21, str6);
            }
            int h2 = e2 + C52418a.m58681h(22, this.ReferId) + C52418a.m58678e(23, this.BlackListCount) + C52418a.m58680g(24, 8, this.BlackList) + C52418a.m58678e(25, this.DeleteFlag) + C52418a.m58678e(26, this.GroupUserCount) + C52418a.m58680g(27, 8, this.GroupUser);
            C51018qv3 qv35 = this.ObjectOperations;
            if (qv35 != null) {
                h2 += C52418a.m58682i(28, qv35.computeSize());
            }
            h84 h842 = this.SnsRedEnvelops;
            if (h842 != null) {
                h2 += C52418a.m58682i(29, h842.computeSize());
            }
            C64491kg3 kg33 = this.PreDownloadInfo;
            if (kg33 != null) {
                h2 += C52418a.m58682i(30, kg33.computeSize());
            }
            q64 q642 = this.WeAppInfo;
            if (q642 != null) {
                h2 += C52418a.m58682i(31, q642.computeSize());
            }
            return h2 + C52418a.m58678e(32, this.WithChatroomListCount) + C52418a.m58678e(34, this.WithTaListCount) + C52418a.m58680g(35, 8, this.WithTaList) + C52418a.m58678e(36, this.WithTaHasOther) + C52418a.m58678e(37, this.FlowerUserListCount) + C52418a.m58680g(38, 8, this.FlowerUserList) + C52418a.m58678e(39, this.FlowerFlag) + C52418a.m58680g(40, 8, this.NewWithTaList) + C52418a.m58678e(41, this.NewWithTaListCount) + C52418a.m58678e(42, this.BlackContactTagIdListCount) + C52418a.m58684k(43, 2, this.BlackContactTagIdList) + C52418a.m58678e(44, this.GroupContactTagIdListCount) + C52418a.m58684k(45, 2, this.GroupContactTagIdList) + C52418a.m58678e(46, this.WeiShangSellerType) + C52418a.m58678e(47, this.WeiShangFeedType) + C52418a.m58678e(48, this.WeiShangVideoSourceType) + C52418a.m58678e(49, this.ObjectType) + C52418a.m58678e(50, this.GuideFinder);
        } else if (i2 == 2) {
            this.LikeUserList.clear();
            this.CommentUserList.clear();
            this.WithUserList.clear();
            this.GroupList.clear();
            this.BlackList.clear();
            this.GroupUser.clear();
            this.WithTaList.clear();
            this.FlowerUserList.clear();
            this.NewWithTaList.clear();
            this.BlackContactTagIdList.clear();
            this.GroupContactTagIdList.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.ObjectDesc != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ObjectDesc");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            SnsObject snsObject = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    snsObject.f283891Id = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    snsObject.Username = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    snsObject.Nickname = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    snsObject.CreateTime = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv36.mo73348f(bArr);
                        }
                        snsObject.ObjectDesc = qv36;
                    }
                    return 0;
                case 6:
                    snsObject.LikeFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    snsObject.LikeCount = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    snsObject.LikeUserListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        w64 w64 = new w64();
                        if (bArr2 != null && bArr2.length > 0) {
                            w64.parseFrom(bArr2);
                        }
                        snsObject.LikeUserList.add(w64);
                    }
                    return 0;
                case 10:
                    snsObject.CommentCount = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    snsObject.CommentUserListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        w64 w642 = new w64();
                        if (bArr3 != null && bArr3.length > 0) {
                            w642.parseFrom(bArr3);
                        }
                        snsObject.CommentUserList.add(w642);
                    }
                    return 0;
                case 13:
                    snsObject.WithUserCount = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    snsObject.WithUserListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        w64 w643 = new w64();
                        if (bArr4 != null && bArr4.length > 0) {
                            w643.parseFrom(bArr4);
                        }
                        snsObject.WithUserList.add(w643);
                    }
                    return 0;
                case 16:
                    snsObject.ExtFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    snsObject.NoChange = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    snsObject.GroupCount = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        i74 i74 = new i74();
                        if (bArr5 != null && bArr5.length > 0) {
                            i74.parseFrom(bArr5);
                        }
                        snsObject.GroupList.add(i74);
                    }
                    return 0;
                case 20:
                    snsObject.IsNotRichText = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    snsObject.ReferUsername = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    snsObject.ReferId = aVar3.mo141631i(intValue);
                    return 0;
                case 23:
                    snsObject.BlackListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            rv32.mo73356d(bArr6);
                        }
                        snsObject.BlackList.add(rv32);
                    }
                    return 0;
                case 25:
                    snsObject.DeleteFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    snsObject.GroupUserCount = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C51163rv3 rv33 = new C51163rv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            rv33.mo73356d(bArr7);
                        }
                        snsObject.GroupUser.add(rv33);
                    }
                    return 0;
                case 28:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            qv37.mo73348f(bArr8);
                        }
                        snsObject.ObjectOperations = qv37;
                    }
                    return 0;
                case 29:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        h84 h843 = new h84();
                        if (bArr9 != null && bArr9.length > 0) {
                            h843.parseFrom(bArr9);
                        }
                        snsObject.SnsRedEnvelops = h843;
                    }
                    return 0;
                case 30:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        C64491kg3 kg34 = new C64491kg3();
                        if (bArr10 != null && bArr10.length > 0) {
                            kg34.parseFrom(bArr10);
                        }
                        snsObject.PreDownloadInfo = kg34;
                    }
                    return 0;
                case 31:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i18 = 0; i18 < size11; i18++) {
                        byte[] bArr11 = j16.get(i18);
                        q64 q643 = new q64();
                        if (bArr11 != null && bArr11.length > 0) {
                            q643.parseFrom(bArr11);
                        }
                        snsObject.WeAppInfo = q643;
                    }
                    return 0;
                case 32:
                    snsObject.WithChatroomListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 34:
                    snsObject.WithTaListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 35:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i19 = 0; i19 < size12; i19++) {
                        byte[] bArr12 = j17.get(i19);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr12 != null && bArr12.length > 0) {
                            rv34.mo73356d(bArr12);
                        }
                        snsObject.WithTaList.add(rv34);
                    }
                    return 0;
                case 36:
                    snsObject.WithTaHasOther = aVar3.mo141629g(intValue);
                    return 0;
                case 37:
                    snsObject.FlowerUserListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 38:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i25 = 0; i25 < size13; i25++) {
                        byte[] bArr13 = j18.get(i25);
                        w64 w644 = new w64();
                        if (bArr13 != null && bArr13.length > 0) {
                            w644.parseFrom(bArr13);
                        }
                        snsObject.FlowerUserList.add(w644);
                    }
                    return 0;
                case 39:
                    snsObject.FlowerFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 40:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i26 = 0; i26 < size14; i26++) {
                        byte[] bArr14 = j19.get(i26);
                        w64 w645 = new w64();
                        if (bArr14 != null && bArr14.length > 0) {
                            w645.parseFrom(bArr14);
                        }
                        snsObject.NewWithTaList.add(w645);
                    }
                    return 0;
                case 41:
                    snsObject.NewWithTaListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 42:
                    snsObject.BlackContactTagIdListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 43:
                    byte[] bArr15 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr15, 0, bArr15.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    snsObject.BlackContactTagIdList = linkedList;
                    return 0;
                case 44:
                    snsObject.GroupContactTagIdListCount = aVar3.mo141629g(intValue);
                    return 0;
                case 45:
                    byte[] bArr16 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar5 = new C102536a(bArr16, 0, bArr16.length);
                    LinkedList<Integer> linkedList2 = new LinkedList<>();
                    while (aVar5.f301908c < aVar5.f301907b) {
                        linkedList2.add(Integer.valueOf(aVar5.mo142153f()));
                    }
                    snsObject.GroupContactTagIdList = linkedList2;
                    return 0;
                case 46:
                    snsObject.WeiShangSellerType = aVar3.mo141629g(intValue);
                    return 0;
                case 47:
                    snsObject.WeiShangFeedType = aVar3.mo141629g(intValue);
                    return 0;
                case 48:
                    snsObject.WeiShangVideoSourceType = aVar3.mo141629g(intValue);
                    return 0;
                case 49:
                    snsObject.ObjectType = aVar3.mo141629g(intValue);
                    return 0;
                case 50:
                    snsObject.GuideFinder = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
