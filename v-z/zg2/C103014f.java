package zg2;

import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C102652h9;
import te3.C101765cp3;
import te3.C101773e70;
import te3.C101781gb0;

/* renamed from: zg2.f */
public final class C103014f extends C102652h9 implements C53790e {

    /* renamed from: Q0 */
    public static final String f303966Q0 = "VideoEditInfo";

    /* renamed from: R0 */
    public static final String[] f303967R0 = C102652h9.f302471C;

    /* renamed from: y0 */
    public static final IAutoDBItem.MAutoDBInfo f303968y0 = C102652h9.initAutoDBInfo(C103014f.class);

    public C103014f() {
        new C101765cp3();
        new C101773e70();
    }

    /* renamed from: X */
    public C101773e70 mo74362X() {
        C101773e70 e702 = new C101773e70();
        byte[] bArr = this.field_baseItemData;
        if (bArr != null) {
            try {
                e702.parseFrom(bArr);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        return e702;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f303968y0;
        C87412m.m108593f(mAutoDBInfo, "INFO");
        return mAutoDBInfo;
    }

    public RecordMediaReportInfo getReportInfo() {
        RecordMediaReportInfo recordMediaReportInfo = new RecordMediaReportInfo();
        recordMediaReportInfo.mo129810a(this.field_reportInfo);
        return recordMediaReportInfo;
    }

    public int getStatus() {
        return this.field_status;
    }

    /* renamed from: p0 */
    public C101781gb0 mo74365p0() {
        C101781gb0 gb02 = new C101781gb0();
        byte[] bArr = this.field_extraConfig;
        if (bArr != null) {
            try {
                gb02.parseFrom(bArr);
                return gb02;
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        return null;
    }
}
