package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C64426ho2;
import te3.uc4;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderJumpInfo */
public class FinderJumpInfo extends C47465a {
    public int banner_type;
    public int business_type;
    public String click_button_name;
    public int delay_preload_time;
    public int dislike;
    public int effective_duration;
    public int expired_ts;
    public C89349b ext_buff;
    public String ext_info;
    public int ext_type;
    public String group_key;
    public Html5Info html5_info;
    public String icon_name;
    public String icon_url;
    public String icon_url_bg;
    public String icon_url_dark;
    public String jump_id;
    public int jumpinfo_type;
    public C64426ho2 lite_app_info;
    public MiniAppInfo mini_app_info;
    public NativeInfo native_info;
    public boolean need_auto_show;
    public boolean need_preload;
    public int position;
    public String recommend_reason;
    public FinderJumpInfoRedDot red_dot;
    public int red_packet_type;
    public String report_info;
    public SchemaInfo schema_info;
    public int source;
    public LinkedList<uc4> style = new LinkedList<>();
    public int support_share;
    public String wording;

    public static final FinderJumpInfo create() {
        return new FinderJumpInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderJumpInfo)) {
            return false;
        }
        FinderJumpInfo finderJumpInfo = (FinderJumpInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.jumpinfo_type), Integer.valueOf(finderJumpInfo.jumpinfo_type)) && C46238a.m51546a(Integer.valueOf(this.business_type), Integer.valueOf(finderJumpInfo.business_type)) && C46238a.m51546a(this.icon_url, finderJumpInfo.icon_url) && C46238a.m51546a(this.wording, finderJumpInfo.wording) && C46238a.m51546a(this.recommend_reason, finderJumpInfo.recommend_reason) && C46238a.m51546a(this.ext_info, finderJumpInfo.ext_info) && C46238a.m51546a(this.report_info, finderJumpInfo.report_info) && C46238a.m51546a(this.mini_app_info, finderJumpInfo.mini_app_info) && C46238a.m51546a(this.html5_info, finderJumpInfo.html5_info) && C46238a.m51546a(this.native_info, finderJumpInfo.native_info) && C46238a.m51546a(this.schema_info, finderJumpInfo.schema_info) && C46238a.m51546a(Integer.valueOf(this.source), Integer.valueOf(finderJumpInfo.source)) && C46238a.m51546a(Integer.valueOf(this.expired_ts), Integer.valueOf(finderJumpInfo.expired_ts)) && C46238a.m51546a(Integer.valueOf(this.dislike), Integer.valueOf(finderJumpInfo.dislike)) && C46238a.m51546a(this.icon_url_dark, finderJumpInfo.icon_url_dark) && C46238a.m51546a(this.icon_url_bg, finderJumpInfo.icon_url_bg) && C46238a.m51546a(this.ext_buff, finderJumpInfo.ext_buff) && C46238a.m51546a(this.red_dot, finderJumpInfo.red_dot) && C46238a.m51546a(this.jump_id, finderJumpInfo.jump_id) && C46238a.m51546a(Integer.valueOf(this.banner_type), Integer.valueOf(finderJumpInfo.banner_type)) && C46238a.m51546a(Integer.valueOf(this.position), Integer.valueOf(finderJumpInfo.position)) && C46238a.m51546a(this.icon_name, finderJumpInfo.icon_name) && C46238a.m51546a(Integer.valueOf(this.support_share), Integer.valueOf(finderJumpInfo.support_share)) && C46238a.m51546a(Boolean.valueOf(this.need_preload), Boolean.valueOf(finderJumpInfo.need_preload)) && C46238a.m51546a(this.lite_app_info, finderJumpInfo.lite_app_info) && C46238a.m51546a(this.style, finderJumpInfo.style) && C46238a.m51546a(Integer.valueOf(this.ext_type), Integer.valueOf(finderJumpInfo.ext_type)) && C46238a.m51546a(Integer.valueOf(this.effective_duration), Integer.valueOf(finderJumpInfo.effective_duration)) && C46238a.m51546a(Integer.valueOf(this.delay_preload_time), Integer.valueOf(finderJumpInfo.delay_preload_time)) && C46238a.m51546a(Integer.valueOf(this.red_packet_type), Integer.valueOf(finderJumpInfo.red_packet_type)) && C46238a.m51546a(this.group_key, finderJumpInfo.group_key) && C46238a.m51546a(Boolean.valueOf(this.need_auto_show), Boolean.valueOf(finderJumpInfo.need_auto_show)) && C46238a.m51546a(this.click_button_name, finderJumpInfo.click_button_name);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.jumpinfo_type);
            aVar.mo74318e(2, this.business_type);
            String str = this.icon_url;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.wording;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.recommend_reason;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.ext_info;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.report_info;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            MiniAppInfo miniAppInfo = this.mini_app_info;
            if (miniAppInfo != null) {
                aVar.mo74322i(8, miniAppInfo.computeSize());
                this.mini_app_info.writeFields(aVar);
            }
            Html5Info html5Info = this.html5_info;
            if (html5Info != null) {
                aVar.mo74322i(9, html5Info.computeSize());
                this.html5_info.writeFields(aVar);
            }
            NativeInfo nativeInfo = this.native_info;
            if (nativeInfo != null) {
                aVar.mo74322i(10, nativeInfo.computeSize());
                this.native_info.writeFields(aVar);
            }
            SchemaInfo schemaInfo = this.schema_info;
            if (schemaInfo != null) {
                aVar.mo74322i(11, schemaInfo.computeSize());
                this.schema_info.writeFields(aVar);
            }
            aVar.mo74318e(12, this.source);
            aVar.mo74318e(13, this.expired_ts);
            aVar.mo74318e(14, this.dislike);
            String str6 = this.icon_url_dark;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            String str7 = this.icon_url_bg;
            if (str7 != null) {
                aVar.mo74323j(16, str7);
            }
            C89349b bVar = this.ext_buff;
            if (bVar != null) {
                aVar.mo74315b(17, bVar);
            }
            FinderJumpInfoRedDot finderJumpInfoRedDot = this.red_dot;
            if (finderJumpInfoRedDot != null) {
                aVar.mo74322i(18, finderJumpInfoRedDot.computeSize());
                this.red_dot.writeFields(aVar);
            }
            String str8 = this.jump_id;
            if (str8 != null) {
                aVar.mo74323j(19, str8);
            }
            aVar.mo74318e(20, this.banner_type);
            aVar.mo74318e(21, this.position);
            String str9 = this.icon_name;
            if (str9 != null) {
                aVar.mo74323j(22, str9);
            }
            aVar.mo74318e(23, this.support_share);
            aVar.mo74314a(24, this.need_preload);
            C64426ho2 ho22 = this.lite_app_info;
            if (ho22 != null) {
                aVar.mo74322i(25, ho22.computeSize());
                this.lite_app_info.writeFields(aVar);
            }
            aVar.mo74320g(26, 8, this.style);
            aVar.mo74318e(27, this.ext_type);
            aVar.mo74318e(28, this.effective_duration);
            aVar.mo74318e(29, this.delay_preload_time);
            aVar.mo74318e(30, this.red_packet_type);
            String str10 = this.group_key;
            if (str10 != null) {
                aVar.mo74323j(31, str10);
            }
            aVar.mo74314a(37, this.need_auto_show);
            String str11 = this.click_button_name;
            if (str11 != null) {
                aVar.mo74323j(39, str11);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.jumpinfo_type) + 0 + C52418a.m58678e(2, this.business_type);
            String str12 = this.icon_url;
            if (str12 != null) {
                e += C52418a.m58683j(3, str12);
            }
            String str13 = this.wording;
            if (str13 != null) {
                e += C52418a.m58683j(4, str13);
            }
            String str14 = this.recommend_reason;
            if (str14 != null) {
                e += C52418a.m58683j(5, str14);
            }
            String str15 = this.ext_info;
            if (str15 != null) {
                e += C52418a.m58683j(6, str15);
            }
            String str16 = this.report_info;
            if (str16 != null) {
                e += C52418a.m58683j(7, str16);
            }
            MiniAppInfo miniAppInfo2 = this.mini_app_info;
            if (miniAppInfo2 != null) {
                e += C52418a.m58682i(8, miniAppInfo2.computeSize());
            }
            Html5Info html5Info2 = this.html5_info;
            if (html5Info2 != null) {
                e += C52418a.m58682i(9, html5Info2.computeSize());
            }
            NativeInfo nativeInfo2 = this.native_info;
            if (nativeInfo2 != null) {
                e += C52418a.m58682i(10, nativeInfo2.computeSize());
            }
            SchemaInfo schemaInfo2 = this.schema_info;
            if (schemaInfo2 != null) {
                e += C52418a.m58682i(11, schemaInfo2.computeSize());
            }
            int e2 = e + C52418a.m58678e(12, this.source) + C52418a.m58678e(13, this.expired_ts) + C52418a.m58678e(14, this.dislike);
            String str17 = this.icon_url_dark;
            if (str17 != null) {
                e2 += C52418a.m58683j(15, str17);
            }
            String str18 = this.icon_url_bg;
            if (str18 != null) {
                e2 += C52418a.m58683j(16, str18);
            }
            C89349b bVar2 = this.ext_buff;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(17, bVar2);
            }
            FinderJumpInfoRedDot finderJumpInfoRedDot2 = this.red_dot;
            if (finderJumpInfoRedDot2 != null) {
                e2 += C52418a.m58682i(18, finderJumpInfoRedDot2.computeSize());
            }
            String str19 = this.jump_id;
            if (str19 != null) {
                e2 += C52418a.m58683j(19, str19);
            }
            int e3 = e2 + C52418a.m58678e(20, this.banner_type) + C52418a.m58678e(21, this.position);
            String str20 = this.icon_name;
            if (str20 != null) {
                e3 += C52418a.m58683j(22, str20);
            }
            int e4 = e3 + C52418a.m58678e(23, this.support_share) + C52418a.m58674a(24, this.need_preload);
            C64426ho2 ho23 = this.lite_app_info;
            if (ho23 != null) {
                e4 += C52418a.m58682i(25, ho23.computeSize());
            }
            int g = e4 + C52418a.m58680g(26, 8, this.style) + C52418a.m58678e(27, this.ext_type) + C52418a.m58678e(28, this.effective_duration) + C52418a.m58678e(29, this.delay_preload_time) + C52418a.m58678e(30, this.red_packet_type);
            String str21 = this.group_key;
            if (str21 != null) {
                g += C52418a.m58683j(31, str21);
            }
            int a = g + C52418a.m58674a(37, this.need_auto_show);
            String str22 = this.click_button_name;
            return str22 != null ? a + C52418a.m58683j(39, str22) : a;
        } else if (i2 == 2) {
            this.style.clear();
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
            FinderJumpInfo finderJumpInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 37) {
                finderJumpInfo.need_auto_show = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 39) {
                switch (intValue) {
                    case 1:
                        finderJumpInfo.jumpinfo_type = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        finderJumpInfo.business_type = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        finderJumpInfo.icon_url = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        finderJumpInfo.wording = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        finderJumpInfo.recommend_reason = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        finderJumpInfo.ext_info = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        finderJumpInfo.report_info = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            MiniAppInfo miniAppInfo3 = new MiniAppInfo();
                            if (bArr != null && bArr.length > 0) {
                                miniAppInfo3.parseFrom(bArr);
                            }
                            finderJumpInfo.mini_app_info = miniAppInfo3;
                        }
                        return 0;
                    case 9:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            Html5Info html5Info3 = new Html5Info();
                            if (bArr2 != null && bArr2.length > 0) {
                                html5Info3.parseFrom(bArr2);
                            }
                            finderJumpInfo.html5_info = html5Info3;
                        }
                        return 0;
                    case 10:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            NativeInfo nativeInfo3 = new NativeInfo();
                            if (bArr3 != null && bArr3.length > 0) {
                                nativeInfo3.parseFrom(bArr3);
                            }
                            finderJumpInfo.native_info = nativeInfo3;
                        }
                        return 0;
                    case 11:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            byte[] bArr4 = j4.get(i6);
                            SchemaInfo schemaInfo3 = new SchemaInfo();
                            if (bArr4 != null && bArr4.length > 0) {
                                schemaInfo3.parseFrom(bArr4);
                            }
                            finderJumpInfo.schema_info = schemaInfo3;
                        }
                        return 0;
                    case 12:
                        finderJumpInfo.source = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        finderJumpInfo.expired_ts = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        finderJumpInfo.dislike = aVar3.mo141629g(intValue);
                        return 0;
                    case 15:
                        finderJumpInfo.icon_url_dark = aVar3.mo141633k(intValue);
                        return 0;
                    case 16:
                        finderJumpInfo.icon_url_bg = aVar3.mo141633k(intValue);
                        return 0;
                    case 17:
                        finderJumpInfo.ext_buff = aVar3.mo141626d(intValue);
                        return 0;
                    case 18:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            byte[] bArr5 = j5.get(i7);
                            FinderJumpInfoRedDot finderJumpInfoRedDot3 = new FinderJumpInfoRedDot();
                            if (bArr5 != null && bArr5.length > 0) {
                                finderJumpInfoRedDot3.parseFrom(bArr5);
                            }
                            finderJumpInfo.red_dot = finderJumpInfoRedDot3;
                        }
                        return 0;
                    case 19:
                        finderJumpInfo.jump_id = aVar3.mo141633k(intValue);
                        return 0;
                    case 20:
                        finderJumpInfo.banner_type = aVar3.mo141629g(intValue);
                        return 0;
                    case 21:
                        finderJumpInfo.position = aVar3.mo141629g(intValue);
                        return 0;
                    case 22:
                        finderJumpInfo.icon_name = aVar3.mo141633k(intValue);
                        return 0;
                    case 23:
                        finderJumpInfo.support_share = aVar3.mo141629g(intValue);
                        return 0;
                    case 24:
                        finderJumpInfo.need_preload = aVar3.mo141625c(intValue);
                        return 0;
                    case 25:
                        LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                        int size6 = j6.size();
                        for (int i8 = 0; i8 < size6; i8++) {
                            byte[] bArr6 = j6.get(i8);
                            C64426ho2 ho24 = new C64426ho2();
                            if (bArr6 != null && bArr6.length > 0) {
                                ho24.parseFrom(bArr6);
                            }
                            finderJumpInfo.lite_app_info = ho24;
                        }
                        return 0;
                    case 26:
                        LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                        int size7 = j7.size();
                        for (int i9 = 0; i9 < size7; i9++) {
                            byte[] bArr7 = j7.get(i9);
                            uc4 uc4 = new uc4();
                            if (bArr7 != null && bArr7.length > 0) {
                                uc4.parseFrom(bArr7);
                            }
                            finderJumpInfo.style.add(uc4);
                        }
                        return 0;
                    case 27:
                        finderJumpInfo.ext_type = aVar3.mo141629g(intValue);
                        return 0;
                    case 28:
                        finderJumpInfo.effective_duration = aVar3.mo141629g(intValue);
                        return 0;
                    case 29:
                        finderJumpInfo.delay_preload_time = aVar3.mo141629g(intValue);
                        return 0;
                    case 30:
                        finderJumpInfo.red_packet_type = aVar3.mo141629g(intValue);
                        return 0;
                    case 31:
                        finderJumpInfo.group_key = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                finderJumpInfo.click_button_name = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public FinderJumpInfo setBanner_type(int i) {
        this.banner_type = i;
        return this;
    }

    public FinderJumpInfo setBusiness_type(int i) {
        this.business_type = i;
        return this;
    }

    public FinderJumpInfo setClick_button_name(String str) {
        this.click_button_name = str;
        return this;
    }

    public FinderJumpInfo setDelay_preload_time(int i) {
        this.delay_preload_time = i;
        return this;
    }

    public FinderJumpInfo setDislike(int i) {
        this.dislike = i;
        return this;
    }

    public FinderJumpInfo setEffective_duration(int i) {
        this.effective_duration = i;
        return this;
    }

    public FinderJumpInfo setExpired_ts(int i) {
        this.expired_ts = i;
        return this;
    }

    public FinderJumpInfo setExt_buff(C89349b bVar) {
        this.ext_buff = bVar;
        return this;
    }

    public FinderJumpInfo setExt_info(String str) {
        this.ext_info = str;
        return this;
    }

    public FinderJumpInfo setExt_type(int i) {
        this.ext_type = i;
        return this;
    }

    public FinderJumpInfo setGroup_key(String str) {
        this.group_key = str;
        return this;
    }

    public FinderJumpInfo setHtml5_info(Html5Info html5Info) {
        this.html5_info = html5Info;
        return this;
    }

    public FinderJumpInfo setIcon_name(String str) {
        this.icon_name = str;
        return this;
    }

    public FinderJumpInfo setIcon_url(String str) {
        this.icon_url = str;
        return this;
    }

    public FinderJumpInfo setIcon_url_bg(String str) {
        this.icon_url_bg = str;
        return this;
    }

    public FinderJumpInfo setIcon_url_dark(String str) {
        this.icon_url_dark = str;
        return this;
    }

    public FinderJumpInfo setJump_id(String str) {
        this.jump_id = str;
        return this;
    }

    public FinderJumpInfo setJumpinfo_type(int i) {
        this.jumpinfo_type = i;
        return this;
    }

    public FinderJumpInfo setLite_app_info(C64426ho2 ho22) {
        this.lite_app_info = ho22;
        return this;
    }

    public FinderJumpInfo setMini_app_info(MiniAppInfo miniAppInfo) {
        this.mini_app_info = miniAppInfo;
        return this;
    }

    public FinderJumpInfo setNative_info(NativeInfo nativeInfo) {
        this.native_info = nativeInfo;
        return this;
    }

    public FinderJumpInfo setNeed_auto_show(boolean z) {
        this.need_auto_show = z;
        return this;
    }

    public FinderJumpInfo setNeed_preload(boolean z) {
        this.need_preload = z;
        return this;
    }

    public FinderJumpInfo setPosition(int i) {
        this.position = i;
        return this;
    }

    public FinderJumpInfo setRecommend_reason(String str) {
        this.recommend_reason = str;
        return this;
    }

    public FinderJumpInfo setRed_dot(FinderJumpInfoRedDot finderJumpInfoRedDot) {
        this.red_dot = finderJumpInfoRedDot;
        return this;
    }

    public FinderJumpInfo setRed_packet_type(int i) {
        this.red_packet_type = i;
        return this;
    }

    public FinderJumpInfo setReport_info(String str) {
        this.report_info = str;
        return this;
    }

    public FinderJumpInfo setSchema_info(SchemaInfo schemaInfo) {
        this.schema_info = schemaInfo;
        return this;
    }

    public FinderJumpInfo setSource(int i) {
        this.source = i;
        return this;
    }

    public FinderJumpInfo setStyle(LinkedList<uc4> linkedList) {
        this.style = linkedList;
        return this;
    }

    public FinderJumpInfo setSupport_share(int i) {
        this.support_share = i;
        return this;
    }

    public FinderJumpInfo setWording(String str) {
        this.wording = str;
        return this;
    }
}
