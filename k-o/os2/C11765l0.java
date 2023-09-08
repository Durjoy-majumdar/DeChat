package os2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.List;
import p749xh.C38661s8;
import te3.C51163rv3;

/* renamed from: os2.l0 */
public class C11765l0 extends C38661s8 {

    /* renamed from: t */
    public static IAutoDBItem.MAutoDBInfo f34450t = C38661s8.initAutoDBInfo(C11765l0.class);

    public void convertFrom(Cursor cursor) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        super.convertFrom(cursor);
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f34450t;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public void mo11649l2(List<C51163rv3> list) {
        SnsMethodCalculate.markStartTimeMs("setMemberList", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        this.field_memberList = "";
        for (C51163rv3 rv32 : list) {
            this.field_memberList += rv32.f141175d + ",";
        }
        SnsMethodCalculate.markEndTimeMs("setMemberList", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
    }
}
