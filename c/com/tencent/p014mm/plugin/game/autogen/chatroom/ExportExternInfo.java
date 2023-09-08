package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo */
public class ExportExternInfo extends C47465a {
    public long sourceid;
    public long ssid;

    public static final ExportExternInfo create() {
        return new ExportExternInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ExportExternInfo)) {
            return false;
        }
        ExportExternInfo exportExternInfo = (ExportExternInfo) aVar;
        return C46238a.m51546a(Long.valueOf(this.sourceid), Long.valueOf(exportExternInfo.sourceid)) && C46238a.m51546a(Long.valueOf(this.ssid), Long.valueOf(exportExternInfo.ssid));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.sourceid);
            aVar.mo74321h(2, this.ssid);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.sourceid) + 0 + C52418a.m58681h(2, this.ssid);
        } else {
            if (i == 2) {
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
                ExportExternInfo exportExternInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    exportExternInfo.sourceid = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    exportExternInfo.ssid = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public ExportExternInfo setSourceid(long j) {
        this.sourceid = j;
        return this;
    }

    public ExportExternInfo setSsid(long j) {
        this.ssid = j;
        return this;
    }
}
