package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaRelateWeAppList */
public class WxaRelateWeAppList extends C47465a {
    public LinkedList<WxaRelateWeAppInfo> weapp_info_list = new LinkedList<>();
    public String weapp_register_title;

    public static final WxaRelateWeAppList create() {
        return new WxaRelateWeAppList();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof WxaRelateWeAppList)) {
            return false;
        }
        WxaRelateWeAppList wxaRelateWeAppList = (WxaRelateWeAppList) aVar;
        return C46238a.m51546a(this.weapp_register_title, wxaRelateWeAppList.weapp_register_title) && C46238a.m51546a(this.weapp_info_list, wxaRelateWeAppList.weapp_info_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.weapp_register_title;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.weapp_info_list);
            return 0;
        } else if (i == 1) {
            String str2 = this.weapp_register_title;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.weapp_info_list);
        } else if (i == 2) {
            this.weapp_info_list.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            WxaRelateWeAppList wxaRelateWeAppList = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wxaRelateWeAppList.weapp_register_title = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    WxaRelateWeAppInfo wxaRelateWeAppInfo = new WxaRelateWeAppInfo();
                    if (bArr != null && bArr.length > 0) {
                        wxaRelateWeAppInfo.parseFrom(bArr);
                    }
                    wxaRelateWeAppList.weapp_info_list.add(wxaRelateWeAppInfo);
                }
                return 0;
            }
        }
    }

    public WxaRelateWeAppList setWeapp_info_list(LinkedList<WxaRelateWeAppInfo> linkedList) {
        this.weapp_info_list = linkedList;
        return this;
    }

    public WxaRelateWeAppList setWeapp_register_title(String str) {
        this.weapp_register_title = str;
        return this;
    }
}
