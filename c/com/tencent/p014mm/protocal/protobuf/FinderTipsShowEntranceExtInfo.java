package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo */
public class FinderTipsShowEntranceExtInfo extends C47465a {
    public LinkedList<String> multi_username = new LinkedList<>();
    public long object_id;
    public String object_nonce_id;
    public String report_ext_info;
    public C89349b tabTipsByPassInfo;
    public int tab_type;
    public String username;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderTipsShowEntranceExtInfo)) {
            return false;
        }
        FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = (FinderTipsShowEntranceExtInfo) aVar;
        return C46238a.m51546a(Long.valueOf(this.object_id), Long.valueOf(finderTipsShowEntranceExtInfo.object_id)) && C46238a.m51546a(this.object_nonce_id, finderTipsShowEntranceExtInfo.object_nonce_id) && C46238a.m51546a(Integer.valueOf(this.tab_type), Integer.valueOf(finderTipsShowEntranceExtInfo.tab_type)) && C46238a.m51546a(this.username, finderTipsShowEntranceExtInfo.username) && C46238a.m51546a(this.multi_username, finderTipsShowEntranceExtInfo.multi_username) && C46238a.m51546a(this.report_ext_info, finderTipsShowEntranceExtInfo.report_ext_info) && C46238a.m51546a(this.tabTipsByPassInfo, finderTipsShowEntranceExtInfo.tabTipsByPassInfo);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.object_id);
            String str = this.object_nonce_id;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.tab_type);
            String str2 = this.username;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74320g(5, 1, this.multi_username);
            String str3 = this.report_ext_info;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            C89349b bVar = this.tabTipsByPassInfo;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.object_id) + 0;
            String str4 = this.object_nonce_id;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int e = h + C52418a.m58678e(3, this.tab_type);
            String str5 = this.username;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int g = e + C52418a.m58680g(5, 1, this.multi_username);
            String str6 = this.report_ext_info;
            if (str6 != null) {
                g += C52418a.m58683j(6, str6);
            }
            C89349b bVar2 = this.tabTipsByPassInfo;
            return bVar2 != null ? g + C52418a.m58675b(7, bVar2) : g;
        } else if (i == 2) {
            this.multi_username.clear();
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
            FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderTipsShowEntranceExtInfo.object_id = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    finderTipsShowEntranceExtInfo.object_nonce_id = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    finderTipsShowEntranceExtInfo.tab_type = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    finderTipsShowEntranceExtInfo.username = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    finderTipsShowEntranceExtInfo.multi_username.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    finderTipsShowEntranceExtInfo.report_ext_info = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    finderTipsShowEntranceExtInfo.tabTipsByPassInfo = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
