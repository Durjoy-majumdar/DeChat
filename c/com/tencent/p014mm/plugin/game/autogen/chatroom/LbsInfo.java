package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo */
public class LbsInfo extends C47465a {
    public String location_desc;
    public GCLocationInfo location_info;

    public static final LbsInfo create() {
        return new LbsInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof LbsInfo)) {
            return false;
        }
        LbsInfo lbsInfo = (LbsInfo) aVar;
        return C46238a.m51546a(this.location_info, lbsInfo.location_info) && C46238a.m51546a(this.location_desc, lbsInfo.location_desc);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            GCLocationInfo gCLocationInfo = this.location_info;
            if (gCLocationInfo != null) {
                aVar.mo74322i(1, gCLocationInfo.computeSize());
                this.location_info.writeFields(aVar);
            }
            String str = this.location_desc;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            GCLocationInfo gCLocationInfo2 = this.location_info;
            if (gCLocationInfo2 != null) {
                i2 = 0 + C52418a.m58682i(1, gCLocationInfo2.computeSize());
            }
            String str2 = this.location_desc;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
        } else if (i == 2) {
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
            LbsInfo lbsInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    GCLocationInfo gCLocationInfo3 = new GCLocationInfo();
                    if (bArr != null && bArr.length > 0) {
                        gCLocationInfo3.parseFrom(bArr);
                    }
                    lbsInfo.location_info = gCLocationInfo3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                lbsInfo.location_desc = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public LbsInfo setLocation_desc(String str) {
        this.location_desc = str;
        return this;
    }

    public LbsInfo setLocation_info(GCLocationInfo gCLocationInfo) {
        this.location_info = gCLocationInfo;
        return this;
    }
}
