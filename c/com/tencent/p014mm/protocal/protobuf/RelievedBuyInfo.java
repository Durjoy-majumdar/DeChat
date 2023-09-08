package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.RelievedBuyInfo */
public class RelievedBuyInfo extends C47465a {
    public String bottom_sheet_icon_desc;
    public String bottom_sheet_icon_desc_color;
    public int bottom_sheet_icon_height;
    public String bottom_sheet_icon_url;
    public int bottom_sheet_icon_width;
    public String click_url;
    public String click_wording;
    public String icon_desc;
    public String icon_desc_color;
    public int icon_height;
    public String icon_url;
    public int icon_width;
    public int show_flag;
    public LinkedList<RelievedBuySubInfo> sub_info = new LinkedList<>();
    public String subtitle;

    public static final RelievedBuyInfo create() {
        return new RelievedBuyInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof RelievedBuyInfo)) {
            return false;
        }
        RelievedBuyInfo relievedBuyInfo = (RelievedBuyInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.show_flag), Integer.valueOf(relievedBuyInfo.show_flag)) && C46238a.m51546a(this.sub_info, relievedBuyInfo.sub_info) && C46238a.m51546a(this.subtitle, relievedBuyInfo.subtitle) && C46238a.m51546a(this.click_wording, relievedBuyInfo.click_wording) && C46238a.m51546a(this.click_url, relievedBuyInfo.click_url) && C46238a.m51546a(this.icon_url, relievedBuyInfo.icon_url) && C46238a.m51546a(Integer.valueOf(this.icon_width), Integer.valueOf(relievedBuyInfo.icon_width)) && C46238a.m51546a(Integer.valueOf(this.icon_height), Integer.valueOf(relievedBuyInfo.icon_height)) && C46238a.m51546a(this.icon_desc, relievedBuyInfo.icon_desc) && C46238a.m51546a(this.icon_desc_color, relievedBuyInfo.icon_desc_color) && C46238a.m51546a(this.bottom_sheet_icon_url, relievedBuyInfo.bottom_sheet_icon_url) && C46238a.m51546a(Integer.valueOf(this.bottom_sheet_icon_width), Integer.valueOf(relievedBuyInfo.bottom_sheet_icon_width)) && C46238a.m51546a(Integer.valueOf(this.bottom_sheet_icon_height), Integer.valueOf(relievedBuyInfo.bottom_sheet_icon_height)) && C46238a.m51546a(this.bottom_sheet_icon_desc, relievedBuyInfo.bottom_sheet_icon_desc) && C46238a.m51546a(this.bottom_sheet_icon_desc_color, relievedBuyInfo.bottom_sheet_icon_desc_color);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.show_flag);
            aVar.mo74320g(2, 8, this.sub_info);
            String str = this.subtitle;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.click_wording;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.click_url;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.icon_url;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.icon_width);
            aVar.mo74318e(8, this.icon_height);
            String str5 = this.icon_desc;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.icon_desc_color;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.bottom_sheet_icon_url;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            aVar.mo74318e(12, this.bottom_sheet_icon_width);
            aVar.mo74318e(13, this.bottom_sheet_icon_height);
            String str8 = this.bottom_sheet_icon_desc;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            String str9 = this.bottom_sheet_icon_desc_color;
            if (str9 != null) {
                aVar.mo74323j(15, str9);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.show_flag) + 0 + C52418a.m58680g(2, 8, this.sub_info);
            String str10 = this.subtitle;
            if (str10 != null) {
                e += C52418a.m58683j(3, str10);
            }
            String str11 = this.click_wording;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.click_url;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.icon_url;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            int e2 = e + C52418a.m58678e(7, this.icon_width) + C52418a.m58678e(8, this.icon_height);
            String str14 = this.icon_desc;
            if (str14 != null) {
                e2 += C52418a.m58683j(9, str14);
            }
            String str15 = this.icon_desc_color;
            if (str15 != null) {
                e2 += C52418a.m58683j(10, str15);
            }
            String str16 = this.bottom_sheet_icon_url;
            if (str16 != null) {
                e2 += C52418a.m58683j(11, str16);
            }
            int e3 = e2 + C52418a.m58678e(12, this.bottom_sheet_icon_width) + C52418a.m58678e(13, this.bottom_sheet_icon_height);
            String str17 = this.bottom_sheet_icon_desc;
            if (str17 != null) {
                e3 += C52418a.m58683j(14, str17);
            }
            String str18 = this.bottom_sheet_icon_desc_color;
            return str18 != null ? e3 + C52418a.m58683j(15, str18) : e3;
        } else if (i2 == 2) {
            this.sub_info.clear();
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
            RelievedBuyInfo relievedBuyInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    relievedBuyInfo.show_flag = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        RelievedBuySubInfo relievedBuySubInfo = new RelievedBuySubInfo();
                        if (bArr != null && bArr.length > 0) {
                            relievedBuySubInfo.parseFrom(bArr);
                        }
                        relievedBuyInfo.sub_info.add(relievedBuySubInfo);
                    }
                    return 0;
                case 3:
                    relievedBuyInfo.subtitle = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    relievedBuyInfo.click_wording = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    relievedBuyInfo.click_url = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    relievedBuyInfo.icon_url = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    relievedBuyInfo.icon_width = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    relievedBuyInfo.icon_height = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    relievedBuyInfo.icon_desc = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    relievedBuyInfo.icon_desc_color = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    relievedBuyInfo.bottom_sheet_icon_url = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    relievedBuyInfo.bottom_sheet_icon_width = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    relievedBuyInfo.bottom_sheet_icon_height = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    relievedBuyInfo.bottom_sheet_icon_desc = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    relievedBuyInfo.bottom_sheet_icon_desc_color = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public RelievedBuyInfo setBottom_sheet_icon_desc(String str) {
        this.bottom_sheet_icon_desc = str;
        return this;
    }

    public RelievedBuyInfo setBottom_sheet_icon_desc_color(String str) {
        this.bottom_sheet_icon_desc_color = str;
        return this;
    }

    public RelievedBuyInfo setBottom_sheet_icon_height(int i) {
        this.bottom_sheet_icon_height = i;
        return this;
    }

    public RelievedBuyInfo setBottom_sheet_icon_url(String str) {
        this.bottom_sheet_icon_url = str;
        return this;
    }

    public RelievedBuyInfo setBottom_sheet_icon_width(int i) {
        this.bottom_sheet_icon_width = i;
        return this;
    }

    public RelievedBuyInfo setClick_url(String str) {
        this.click_url = str;
        return this;
    }

    public RelievedBuyInfo setClick_wording(String str) {
        this.click_wording = str;
        return this;
    }

    public RelievedBuyInfo setIcon_desc(String str) {
        this.icon_desc = str;
        return this;
    }

    public RelievedBuyInfo setIcon_desc_color(String str) {
        this.icon_desc_color = str;
        return this;
    }

    public RelievedBuyInfo setIcon_height(int i) {
        this.icon_height = i;
        return this;
    }

    public RelievedBuyInfo setIcon_url(String str) {
        this.icon_url = str;
        return this;
    }

    public RelievedBuyInfo setIcon_width(int i) {
        this.icon_width = i;
        return this;
    }

    public RelievedBuyInfo setShow_flag(int i) {
        this.show_flag = i;
        return this;
    }

    public RelievedBuyInfo setSub_info(LinkedList<RelievedBuySubInfo> linkedList) {
        this.sub_info = linkedList;
        return this;
    }

    public RelievedBuyInfo setSubtitle(String str) {
        this.subtitle = str;
        return this;
    }
}
