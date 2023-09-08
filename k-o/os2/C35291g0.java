package os2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38653r8;

/* renamed from: os2.g0 */
public class C35291g0 extends C38653r8 {

    /* renamed from: w */
    public static IAutoDBItem.MAutoDBInfo f94549w = C38653r8.initAutoDBInfo(C35291g0.class);

    /* renamed from: v */
    public int f94550v;

    public void convertFrom(Cursor cursor) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        try {
            super.convertFrom(cursor);
            this.f94550v = (int) this.systemRowid;
        } catch (Exception e) {
            String message = e.getMessage();
            Log.m105920e("MicroMsg.SnsKvReport", "error " + message);
            if (message != null && message.contains("Unable to convert")) {
                C100421x Tx0 = C94866e1.Tx0();
                Tx0.getClass();
                SnsMethodCalculate.markStartTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                Tx0.f294191d.mo125614d("SnsComment");
                SnsMethodCalculate.markEndTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            }
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
            throw e;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.SnsKvReport", e2, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f94549w;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        return mAutoDBInfo;
    }
}
