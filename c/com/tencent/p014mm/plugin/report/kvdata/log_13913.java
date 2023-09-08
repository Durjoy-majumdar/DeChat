package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.log_13913 */
public class log_13913 extends C47465a {
    public int clientVersion_;
    public int device_;
    public int ds_;
    public String error_;
    public int import_ds_;
    public int scene_;
    public long time_stamp_;
    public long uin_;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof log_13913)) {
            return false;
        }
        log_13913 log_13913 = (log_13913) aVar;
        return C46238a.m51546a(Integer.valueOf(this.import_ds_), Integer.valueOf(log_13913.import_ds_)) && C46238a.m51546a(Integer.valueOf(this.ds_), Integer.valueOf(log_13913.ds_)) && C46238a.m51546a(Long.valueOf(this.uin_), Long.valueOf(log_13913.uin_)) && C46238a.m51546a(Integer.valueOf(this.device_), Integer.valueOf(log_13913.device_)) && C46238a.m51546a(Integer.valueOf(this.clientVersion_), Integer.valueOf(log_13913.clientVersion_)) && C46238a.m51546a(Long.valueOf(this.time_stamp_), Long.valueOf(log_13913.time_stamp_)) && C46238a.m51546a(Integer.valueOf(this.scene_), Integer.valueOf(log_13913.scene_)) && C46238a.m51546a(this.error_, log_13913.error_);
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
            aVar.mo74318e(7, this.scene_);
            String str = this.error_;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.import_ds_) + 0 + C52418a.m58678e(2, this.ds_) + C52418a.m58681h(3, this.uin_) + C52418a.m58678e(4, this.device_) + C52418a.m58678e(5, this.clientVersion_) + C52418a.m58681h(6, this.time_stamp_) + C52418a.m58678e(7, this.scene_);
            String str2 = this.error_;
            return str2 != null ? e + C52418a.m58683j(8, str2) : e;
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
            log_13913 log_13913 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    log_13913.import_ds_ = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    log_13913.ds_ = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    log_13913.uin_ = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    log_13913.device_ = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    log_13913.clientVersion_ = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    log_13913.time_stamp_ = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    log_13913.scene_ = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    log_13913.error_ = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
