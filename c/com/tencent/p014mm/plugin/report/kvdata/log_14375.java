package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.log_14375 */
public class log_14375 extends C47465a {
    public int clientVersion_;
    public BDStatusInfo dbStatusInfo_;
    public int device_;
    public int ds_;
    public HeavyDetailInfo heavyDetailInfo_;
    public int import_ds_;
    public SDStatusInfo sdStatusInfo_;
    public long time_stamp_;
    public int type_;
    public long uin_;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof log_14375)) {
            return false;
        }
        log_14375 log_14375 = (log_14375) aVar;
        return C46238a.m51546a(Integer.valueOf(this.import_ds_), Integer.valueOf(log_14375.import_ds_)) && C46238a.m51546a(Integer.valueOf(this.ds_), Integer.valueOf(log_14375.ds_)) && C46238a.m51546a(Long.valueOf(this.uin_), Long.valueOf(log_14375.uin_)) && C46238a.m51546a(Integer.valueOf(this.device_), Integer.valueOf(log_14375.device_)) && C46238a.m51546a(Integer.valueOf(this.clientVersion_), Integer.valueOf(log_14375.clientVersion_)) && C46238a.m51546a(Long.valueOf(this.time_stamp_), Long.valueOf(log_14375.time_stamp_)) && C46238a.m51546a(Integer.valueOf(this.type_), Integer.valueOf(log_14375.type_)) && C46238a.m51546a(this.dbStatusInfo_, log_14375.dbStatusInfo_) && C46238a.m51546a(this.sdStatusInfo_, log_14375.sdStatusInfo_) && C46238a.m51546a(this.heavyDetailInfo_, log_14375.heavyDetailInfo_);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.import_ds_);
            aVar.mo74318e(2, this.ds_);
            aVar.mo74321h(3, this.uin_);
            aVar.mo74318e(4, this.device_);
            aVar.mo74318e(5, this.clientVersion_);
            aVar.mo74321h(6, this.time_stamp_);
            aVar.mo74318e(7, this.type_);
            BDStatusInfo bDStatusInfo = this.dbStatusInfo_;
            if (bDStatusInfo != null) {
                aVar.mo74322i(8, bDStatusInfo.computeSize());
                this.dbStatusInfo_.writeFields(aVar);
            }
            SDStatusInfo sDStatusInfo = this.sdStatusInfo_;
            if (sDStatusInfo != null) {
                aVar.mo74322i(9, sDStatusInfo.computeSize());
                this.sdStatusInfo_.writeFields(aVar);
            }
            HeavyDetailInfo heavyDetailInfo = this.heavyDetailInfo_;
            if (heavyDetailInfo != null) {
                aVar.mo74322i(10, heavyDetailInfo.computeSize());
                this.heavyDetailInfo_.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.import_ds_) + 0 + C52418a.m58678e(2, this.ds_) + C52418a.m58681h(3, this.uin_) + C52418a.m58678e(4, this.device_) + C52418a.m58678e(5, this.clientVersion_) + C52418a.m58681h(6, this.time_stamp_) + C52418a.m58678e(7, this.type_);
            BDStatusInfo bDStatusInfo2 = this.dbStatusInfo_;
            if (bDStatusInfo2 != null) {
                e += C52418a.m58682i(8, bDStatusInfo2.computeSize());
            }
            SDStatusInfo sDStatusInfo2 = this.sdStatusInfo_;
            if (sDStatusInfo2 != null) {
                e += C52418a.m58682i(9, sDStatusInfo2.computeSize());
            }
            HeavyDetailInfo heavyDetailInfo2 = this.heavyDetailInfo_;
            return heavyDetailInfo2 != null ? e + C52418a.m58682i(10, heavyDetailInfo2.computeSize()) : e;
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
            log_14375 log_14375 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    log_14375.import_ds_ = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    log_14375.ds_ = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    log_14375.uin_ = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    log_14375.device_ = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    log_14375.clientVersion_ = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    log_14375.time_stamp_ = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    log_14375.type_ = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        BDStatusInfo bDStatusInfo3 = new BDStatusInfo();
                        if (bArr != null && bArr.length > 0) {
                            bDStatusInfo3.parseFrom(bArr);
                        }
                        log_14375.dbStatusInfo_ = bDStatusInfo3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        SDStatusInfo sDStatusInfo3 = new SDStatusInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            sDStatusInfo3.parseFrom(bArr2);
                        }
                        log_14375.sdStatusInfo_ = sDStatusInfo3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        HeavyDetailInfo heavyDetailInfo3 = new HeavyDetailInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            heavyDetailInfo3.parseFrom(bArr3);
                        }
                        log_14375.heavyDetailInfo_ = heavyDetailInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
