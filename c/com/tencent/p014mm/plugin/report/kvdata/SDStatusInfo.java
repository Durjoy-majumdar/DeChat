package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.SDStatusInfo */
public class SDStatusInfo extends C47465a {
    public long eAvailableBlockCount_;
    public int eAvailablePer_;
    public long eAvailableSize_;
    public long eBlockCount_;
    public long eBlockSize_;
    public String ePath_;
    public long eTotalSize_;
    public String fSystem_;
    public int hasUnRemovable_;
    public int ratioHeavy_;
    public String root_;
    public long sAvailableBlockCount_;
    public int sAvailablePer_;
    public long sAvailableSize_;
    public long sBlockCount_;
    public long sBlockSize_;
    public long sTotalSize_;
    public int sizeHeavy_;
    public int useExternal_;
    public int weChatPer_;
    public WeChatSDInfo weChatSDInfo_;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof SDStatusInfo)) {
            return false;
        }
        SDStatusInfo sDStatusInfo = (SDStatusInfo) aVar;
        return C46238a.m51546a(this.weChatSDInfo_, sDStatusInfo.weChatSDInfo_) && C46238a.m51546a(Integer.valueOf(this.weChatPer_), Integer.valueOf(sDStatusInfo.weChatPer_)) && C46238a.m51546a(Integer.valueOf(this.sizeHeavy_), Integer.valueOf(sDStatusInfo.sizeHeavy_)) && C46238a.m51546a(Integer.valueOf(this.ratioHeavy_), Integer.valueOf(sDStatusInfo.ratioHeavy_)) && C46238a.m51546a(Integer.valueOf(this.useExternal_), Integer.valueOf(sDStatusInfo.useExternal_)) && C46238a.m51546a(Integer.valueOf(this.hasUnRemovable_), Integer.valueOf(sDStatusInfo.hasUnRemovable_)) && C46238a.m51546a(Long.valueOf(this.sBlockSize_), Long.valueOf(sDStatusInfo.sBlockSize_)) && C46238a.m51546a(Long.valueOf(this.sBlockCount_), Long.valueOf(sDStatusInfo.sBlockCount_)) && C46238a.m51546a(Long.valueOf(this.sTotalSize_), Long.valueOf(sDStatusInfo.sTotalSize_)) && C46238a.m51546a(Long.valueOf(this.sAvailableBlockCount_), Long.valueOf(sDStatusInfo.sAvailableBlockCount_)) && C46238a.m51546a(Long.valueOf(this.sAvailableSize_), Long.valueOf(sDStatusInfo.sAvailableSize_)) && C46238a.m51546a(Integer.valueOf(this.sAvailablePer_), Integer.valueOf(sDStatusInfo.sAvailablePer_)) && C46238a.m51546a(Long.valueOf(this.eBlockSize_), Long.valueOf(sDStatusInfo.eBlockSize_)) && C46238a.m51546a(Long.valueOf(this.eBlockCount_), Long.valueOf(sDStatusInfo.eBlockCount_)) && C46238a.m51546a(Long.valueOf(this.eTotalSize_), Long.valueOf(sDStatusInfo.eTotalSize_)) && C46238a.m51546a(Long.valueOf(this.eAvailableBlockCount_), Long.valueOf(sDStatusInfo.eAvailableBlockCount_)) && C46238a.m51546a(Long.valueOf(this.eAvailableSize_), Long.valueOf(sDStatusInfo.eAvailableSize_)) && C46238a.m51546a(Integer.valueOf(this.eAvailablePer_), Integer.valueOf(sDStatusInfo.eAvailablePer_)) && C46238a.m51546a(this.ePath_, sDStatusInfo.ePath_) && C46238a.m51546a(this.root_, sDStatusInfo.root_) && C46238a.m51546a(this.fSystem_, sDStatusInfo.fSystem_);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            WeChatSDInfo weChatSDInfo = this.weChatSDInfo_;
            if (weChatSDInfo != null) {
                if (weChatSDInfo != null) {
                    aVar.mo74322i(1, weChatSDInfo.computeSize());
                    this.weChatSDInfo_.writeFields(aVar);
                }
                aVar.mo74318e(2, this.weChatPer_);
                aVar.mo74318e(3, this.sizeHeavy_);
                aVar.mo74318e(4, this.ratioHeavy_);
                aVar.mo74318e(5, this.useExternal_);
                aVar.mo74318e(6, this.hasUnRemovable_);
                aVar.mo74321h(7, this.sBlockSize_);
                aVar.mo74321h(8, this.sBlockCount_);
                aVar.mo74321h(9, this.sTotalSize_);
                aVar.mo74321h(10, this.sAvailableBlockCount_);
                aVar.mo74321h(11, this.sAvailableSize_);
                aVar.mo74318e(12, this.sAvailablePer_);
                aVar.mo74321h(13, this.eBlockSize_);
                aVar.mo74321h(14, this.eBlockCount_);
                aVar.mo74321h(15, this.eTotalSize_);
                aVar.mo74321h(16, this.eAvailableBlockCount_);
                aVar.mo74321h(17, this.eAvailableSize_);
                aVar.mo74318e(18, this.eAvailablePer_);
                String str = this.ePath_;
                if (str != null) {
                    aVar.mo74323j(19, str);
                }
                String str2 = this.root_;
                if (str2 != null) {
                    aVar.mo74323j(20, str2);
                }
                String str3 = this.fSystem_;
                if (str3 != null) {
                    aVar.mo74323j(21, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: weChatSDInfo_");
        } else if (i2 == 1) {
            WeChatSDInfo weChatSDInfo2 = this.weChatSDInfo_;
            if (weChatSDInfo2 != null) {
                i3 = C52418a.m58682i(1, weChatSDInfo2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.weChatPer_) + C52418a.m58678e(3, this.sizeHeavy_) + C52418a.m58678e(4, this.ratioHeavy_) + C52418a.m58678e(5, this.useExternal_) + C52418a.m58678e(6, this.hasUnRemovable_) + C52418a.m58681h(7, this.sBlockSize_) + C52418a.m58681h(8, this.sBlockCount_) + C52418a.m58681h(9, this.sTotalSize_) + C52418a.m58681h(10, this.sAvailableBlockCount_) + C52418a.m58681h(11, this.sAvailableSize_) + C52418a.m58678e(12, this.sAvailablePer_) + C52418a.m58681h(13, this.eBlockSize_) + C52418a.m58681h(14, this.eBlockCount_) + C52418a.m58681h(15, this.eTotalSize_) + C52418a.m58681h(16, this.eAvailableBlockCount_) + C52418a.m58681h(17, this.eAvailableSize_) + C52418a.m58678e(18, this.eAvailablePer_);
            String str4 = this.ePath_;
            if (str4 != null) {
                e += C52418a.m58683j(19, str4);
            }
            String str5 = this.root_;
            if (str5 != null) {
                e += C52418a.m58683j(20, str5);
            }
            String str6 = this.fSystem_;
            return str6 != null ? e + C52418a.m58683j(21, str6) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.weChatSDInfo_ != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: weChatSDInfo_");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            SDStatusInfo sDStatusInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        WeChatSDInfo weChatSDInfo3 = new WeChatSDInfo();
                        if (bArr != null && bArr.length > 0) {
                            weChatSDInfo3.parseFrom(bArr);
                        }
                        sDStatusInfo.weChatSDInfo_ = weChatSDInfo3;
                    }
                    return 0;
                case 2:
                    sDStatusInfo.weChatPer_ = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sDStatusInfo.sizeHeavy_ = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sDStatusInfo.ratioHeavy_ = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sDStatusInfo.useExternal_ = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    sDStatusInfo.hasUnRemovable_ = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    sDStatusInfo.sBlockSize_ = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    sDStatusInfo.sBlockCount_ = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    sDStatusInfo.sTotalSize_ = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    sDStatusInfo.sAvailableBlockCount_ = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    sDStatusInfo.sAvailableSize_ = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    sDStatusInfo.sAvailablePer_ = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    sDStatusInfo.eBlockSize_ = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    sDStatusInfo.eBlockCount_ = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    sDStatusInfo.eTotalSize_ = aVar3.mo141631i(intValue);
                    return 0;
                case 16:
                    sDStatusInfo.eAvailableBlockCount_ = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    sDStatusInfo.eAvailableSize_ = aVar3.mo141631i(intValue);
                    return 0;
                case 18:
                    sDStatusInfo.eAvailablePer_ = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    sDStatusInfo.ePath_ = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    sDStatusInfo.root_ = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    sDStatusInfo.fSystem_ = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
