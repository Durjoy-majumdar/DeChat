package os2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C102655l8;

/* renamed from: os2.w */
public class C100420w extends C102655l8 implements Cloneable {

    /* renamed from: M */
    public static IAutoDBItem.MAutoDBInfo f294188M = C102655l8.initAutoDBInfo(C100420w.class);

    /* renamed from: L */
    public int f294189L;

    public /* bridge */ /* synthetic */ Object clone() {
        SnsMethodCalculate.markStartTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        C100420w l2 = mo139886l2();
        SnsMethodCalculate.markEndTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return l2;
    }

    public void convertFrom(Cursor cursor) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
        try {
            super.convertFrom(cursor);
            this.f294189L = (int) this.systemRowid;
        } catch (Exception e) {
            String message = e.getMessage();
            Log.m105920e("MicroMsg.SnsComment", "error " + message);
            if (message != null && message.contains("Unable to convert")) {
                C100421x Tx0 = C94866e1.Tx0();
                Tx0.getClass();
                SnsMethodCalculate.markStartTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                Tx0.f294191d.mo125614d("SnsComment");
                SnsMethodCalculate.markEndTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            }
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
            throw e;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.SnsComment", e2, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsComment");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f294188M;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public C100420w mo139886l2() {
        C100420w wVar;
        SnsMethodCalculate.markStartTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        try {
            wVar = (C100420w) super.clone();
        } catch (CloneNotSupportedException unused) {
            Log.m105920e("MicroMsg.SnsComment", "snscomment clone error");
            wVar = null;
        }
        SnsMethodCalculate.markEndTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return wVar;
    }

    /* renamed from: m2 */
    public void mo139887m2() {
        SnsMethodCalculate.markStartTimeMs("setCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        this.field_commentflag |= 1;
        SnsMethodCalculate.markEndTimeMs("setCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
    }
}
