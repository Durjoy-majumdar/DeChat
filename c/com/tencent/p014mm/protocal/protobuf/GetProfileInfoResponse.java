package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.GetProfileInfoResponse */
public class GetProfileInfoResponse extends C49335eu3 {
    public AppCommentModule comment_info;
    public WxaEvaluateBasicInfo evaluate_basic_info;
    public WxaEvaluateWordingList evaluate_wording_list;
    public FeedBack feed_back;
    public WxaLikeList friend_like_list;
    public String guarant_url;
    public LinkedList<WxaRelateWeAppList> new_relate_weapp_list = new LinkedList<>();
    public String officical_url;
    public WxaRelateBrandList relate_brand_list;
    public WxaRelateWeAppList relate_weapp_list;
    public RelievedBuyInfo relieved_buy_info;
    public ServicePreInfo service_pre_info;
    public int use_kf;

    public static final GetProfileInfoResponse create() {
        return new GetProfileInfoResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetProfileInfoResponse)) {
            return false;
        }
        GetProfileInfoResponse getProfileInfoResponse = (GetProfileInfoResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getProfileInfoResponse.BaseResponse) && C46238a.m51546a(this.service_pre_info, getProfileInfoResponse.service_pre_info) && C46238a.m51546a(this.evaluate_basic_info, getProfileInfoResponse.evaluate_basic_info) && C46238a.m51546a(this.friend_like_list, getProfileInfoResponse.friend_like_list) && C46238a.m51546a(this.feed_back, getProfileInfoResponse.feed_back) && C46238a.m51546a(this.evaluate_wording_list, getProfileInfoResponse.evaluate_wording_list) && C46238a.m51546a(this.relate_brand_list, getProfileInfoResponse.relate_brand_list) && C46238a.m51546a(this.relate_weapp_list, getProfileInfoResponse.relate_weapp_list) && C46238a.m51546a(this.officical_url, getProfileInfoResponse.officical_url) && C46238a.m51546a(this.guarant_url, getProfileInfoResponse.guarant_url) && C46238a.m51546a(this.new_relate_weapp_list, getProfileInfoResponse.new_relate_weapp_list) && C46238a.m51546a(this.relieved_buy_info, getProfileInfoResponse.relieved_buy_info) && C46238a.m51546a(Integer.valueOf(this.use_kf), Integer.valueOf(getProfileInfoResponse.use_kf)) && C46238a.m51546a(this.comment_info, getProfileInfoResponse.comment_info);
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
                ServicePreInfo servicePreInfo = this.service_pre_info;
                if (servicePreInfo != null) {
                    aVar.mo74322i(2, servicePreInfo.computeSize());
                    this.service_pre_info.writeFields(aVar);
                }
                WxaEvaluateBasicInfo wxaEvaluateBasicInfo = this.evaluate_basic_info;
                if (wxaEvaluateBasicInfo != null) {
                    aVar.mo74322i(3, wxaEvaluateBasicInfo.computeSize());
                    this.evaluate_basic_info.writeFields(aVar);
                }
                WxaLikeList wxaLikeList = this.friend_like_list;
                if (wxaLikeList != null) {
                    aVar.mo74322i(4, wxaLikeList.computeSize());
                    this.friend_like_list.writeFields(aVar);
                }
                FeedBack feedBack = this.feed_back;
                if (feedBack != null) {
                    aVar.mo74322i(5, feedBack.computeSize());
                    this.feed_back.writeFields(aVar);
                }
                WxaEvaluateWordingList wxaEvaluateWordingList = this.evaluate_wording_list;
                if (wxaEvaluateWordingList != null) {
                    aVar.mo74322i(6, wxaEvaluateWordingList.computeSize());
                    this.evaluate_wording_list.writeFields(aVar);
                }
                WxaRelateBrandList wxaRelateBrandList = this.relate_brand_list;
                if (wxaRelateBrandList != null) {
                    aVar.mo74322i(7, wxaRelateBrandList.computeSize());
                    this.relate_brand_list.writeFields(aVar);
                }
                WxaRelateWeAppList wxaRelateWeAppList = this.relate_weapp_list;
                if (wxaRelateWeAppList != null) {
                    aVar.mo74322i(8, wxaRelateWeAppList.computeSize());
                    this.relate_weapp_list.writeFields(aVar);
                }
                String str = this.officical_url;
                if (str != null) {
                    aVar.mo74323j(10, str);
                }
                String str2 = this.guarant_url;
                if (str2 != null) {
                    aVar.mo74323j(11, str2);
                }
                aVar.mo74320g(12, 8, this.new_relate_weapp_list);
                RelievedBuyInfo relievedBuyInfo = this.relieved_buy_info;
                if (relievedBuyInfo != null) {
                    aVar.mo74322i(13, relievedBuyInfo.computeSize());
                    this.relieved_buy_info.writeFields(aVar);
                }
                aVar.mo74318e(14, this.use_kf);
                AppCommentModule appCommentModule = this.comment_info;
                if (appCommentModule != null) {
                    aVar.mo74322i(15, appCommentModule.computeSize());
                    this.comment_info.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            ServicePreInfo servicePreInfo2 = this.service_pre_info;
            if (servicePreInfo2 != null) {
                i3 += C52418a.m58682i(2, servicePreInfo2.computeSize());
            }
            WxaEvaluateBasicInfo wxaEvaluateBasicInfo2 = this.evaluate_basic_info;
            if (wxaEvaluateBasicInfo2 != null) {
                i3 += C52418a.m58682i(3, wxaEvaluateBasicInfo2.computeSize());
            }
            WxaLikeList wxaLikeList2 = this.friend_like_list;
            if (wxaLikeList2 != null) {
                i3 += C52418a.m58682i(4, wxaLikeList2.computeSize());
            }
            FeedBack feedBack2 = this.feed_back;
            if (feedBack2 != null) {
                i3 += C52418a.m58682i(5, feedBack2.computeSize());
            }
            WxaEvaluateWordingList wxaEvaluateWordingList2 = this.evaluate_wording_list;
            if (wxaEvaluateWordingList2 != null) {
                i3 += C52418a.m58682i(6, wxaEvaluateWordingList2.computeSize());
            }
            WxaRelateBrandList wxaRelateBrandList2 = this.relate_brand_list;
            if (wxaRelateBrandList2 != null) {
                i3 += C52418a.m58682i(7, wxaRelateBrandList2.computeSize());
            }
            WxaRelateWeAppList wxaRelateWeAppList2 = this.relate_weapp_list;
            if (wxaRelateWeAppList2 != null) {
                i3 += C52418a.m58682i(8, wxaRelateWeAppList2.computeSize());
            }
            String str3 = this.officical_url;
            if (str3 != null) {
                i3 += C52418a.m58683j(10, str3);
            }
            String str4 = this.guarant_url;
            if (str4 != null) {
                i3 += C52418a.m58683j(11, str4);
            }
            int g = i3 + C52418a.m58680g(12, 8, this.new_relate_weapp_list);
            RelievedBuyInfo relievedBuyInfo2 = this.relieved_buy_info;
            if (relievedBuyInfo2 != null) {
                g += C52418a.m58682i(13, relievedBuyInfo2.computeSize());
            }
            int e = g + C52418a.m58678e(14, this.use_kf);
            AppCommentModule appCommentModule2 = this.comment_info;
            return appCommentModule2 != null ? e + C52418a.m58682i(15, appCommentModule2.computeSize()) : e;
        } else if (i2 == 2) {
            this.new_relate_weapp_list.clear();
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
            GetProfileInfoResponse getProfileInfoResponse = objArr[1];
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
                        getProfileInfoResponse.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        ServicePreInfo servicePreInfo3 = new ServicePreInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            servicePreInfo3.parseFrom(bArr2);
                        }
                        getProfileInfoResponse.service_pre_info = servicePreInfo3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        WxaEvaluateBasicInfo wxaEvaluateBasicInfo3 = new WxaEvaluateBasicInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            wxaEvaluateBasicInfo3.parseFrom(bArr3);
                        }
                        getProfileInfoResponse.evaluate_basic_info = wxaEvaluateBasicInfo3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        WxaLikeList wxaLikeList3 = new WxaLikeList();
                        if (bArr4 != null && bArr4.length > 0) {
                            wxaLikeList3.parseFrom(bArr4);
                        }
                        getProfileInfoResponse.friend_like_list = wxaLikeList3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        FeedBack feedBack3 = new FeedBack();
                        if (bArr5 != null && bArr5.length > 0) {
                            feedBack3.parseFrom(bArr5);
                        }
                        getProfileInfoResponse.feed_back = feedBack3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        WxaEvaluateWordingList wxaEvaluateWordingList3 = new WxaEvaluateWordingList();
                        if (bArr6 != null && bArr6.length > 0) {
                            wxaEvaluateWordingList3.parseFrom(bArr6);
                        }
                        getProfileInfoResponse.evaluate_wording_list = wxaEvaluateWordingList3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        WxaRelateBrandList wxaRelateBrandList3 = new WxaRelateBrandList();
                        if (bArr7 != null && bArr7.length > 0) {
                            wxaRelateBrandList3.parseFrom(bArr7);
                        }
                        getProfileInfoResponse.relate_brand_list = wxaRelateBrandList3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        WxaRelateWeAppList wxaRelateWeAppList3 = new WxaRelateWeAppList();
                        if (bArr8 != null && bArr8.length > 0) {
                            wxaRelateWeAppList3.parseFrom(bArr8);
                        }
                        getProfileInfoResponse.relate_weapp_list = wxaRelateWeAppList3;
                    }
                    return 0;
                case 10:
                    getProfileInfoResponse.officical_url = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    getProfileInfoResponse.guarant_url = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        WxaRelateWeAppList wxaRelateWeAppList4 = new WxaRelateWeAppList();
                        if (bArr9 != null && bArr9.length > 0) {
                            wxaRelateWeAppList4.parseFrom(bArr9);
                        }
                        getProfileInfoResponse.new_relate_weapp_list.add(wxaRelateWeAppList4);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        RelievedBuyInfo relievedBuyInfo3 = new RelievedBuyInfo();
                        if (bArr10 != null && bArr10.length > 0) {
                            relievedBuyInfo3.parseFrom(bArr10);
                        }
                        getProfileInfoResponse.relieved_buy_info = relievedBuyInfo3;
                    }
                    return 0;
                case 14:
                    getProfileInfoResponse.use_kf = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        AppCommentModule appCommentModule3 = new AppCommentModule();
                        if (bArr11 != null && bArr11.length > 0) {
                            appCommentModule3.parseFrom(bArr11);
                        }
                        getProfileInfoResponse.comment_info = appCommentModule3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public GetProfileInfoResponse setComment_info(AppCommentModule appCommentModule) {
        this.comment_info = appCommentModule;
        return this;
    }

    public GetProfileInfoResponse setEvaluate_basic_info(WxaEvaluateBasicInfo wxaEvaluateBasicInfo) {
        this.evaluate_basic_info = wxaEvaluateBasicInfo;
        return this;
    }

    public GetProfileInfoResponse setEvaluate_wording_list(WxaEvaluateWordingList wxaEvaluateWordingList) {
        this.evaluate_wording_list = wxaEvaluateWordingList;
        return this;
    }

    public GetProfileInfoResponse setFeed_back(FeedBack feedBack) {
        this.feed_back = feedBack;
        return this;
    }

    public GetProfileInfoResponse setFriend_like_list(WxaLikeList wxaLikeList) {
        this.friend_like_list = wxaLikeList;
        return this;
    }

    public GetProfileInfoResponse setGuarant_url(String str) {
        this.guarant_url = str;
        return this;
    }

    public GetProfileInfoResponse setNew_relate_weapp_list(LinkedList<WxaRelateWeAppList> linkedList) {
        this.new_relate_weapp_list = linkedList;
        return this;
    }

    public GetProfileInfoResponse setOfficical_url(String str) {
        this.officical_url = str;
        return this;
    }

    public GetProfileInfoResponse setRelate_brand_list(WxaRelateBrandList wxaRelateBrandList) {
        this.relate_brand_list = wxaRelateBrandList;
        return this;
    }

    public GetProfileInfoResponse setRelate_weapp_list(WxaRelateWeAppList wxaRelateWeAppList) {
        this.relate_weapp_list = wxaRelateWeAppList;
        return this;
    }

    public GetProfileInfoResponse setRelieved_buy_info(RelievedBuyInfo relievedBuyInfo) {
        this.relieved_buy_info = relievedBuyInfo;
        return this;
    }

    public GetProfileInfoResponse setService_pre_info(ServicePreInfo servicePreInfo) {
        this.service_pre_info = servicePreInfo;
        return this;
    }

    public GetProfileInfoResponse setUse_kf(int i) {
        this.use_kf = i;
        return this;
    }
}
