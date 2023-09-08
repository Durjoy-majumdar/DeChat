package p248ug;

import bw1.C28430a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.LinkedList;
import p749xh.C38540c4;
import te3.C50207l3;
import te3.C50694ok;
import te3.C77949j3;

/* renamed from: ug.u */
public class C37467u extends C38540c4 implements C28430a {

    /* renamed from: R0 */
    public static IAutoDBItem.MAutoDBInfo f99010R0 = C38540c4.initAutoDBInfo(C37467u.class);

    /* renamed from: M5 */
    public int mo55972M5() {
        return this.field_cmdid;
    }

    /* renamed from: N5 */
    public int mo55973N5() {
        return this.field_successkey;
    }

    /* renamed from: O5 */
    public String mo55974O5() {
        return this.field_custombuff;
    }

    /* renamed from: P5 */
    public String mo55975P5() {
        return this.field_cgi;
    }

    /* renamed from: Q5 */
    public C50694ok mo55976Q5() {
        return this.field_businessInfo;
    }

    /* renamed from: S5 */
    public String mo55977S5() {
        return this.field_functionmsgid;
    }

    /* renamed from: d */
    public void mo55978d(int i) {
        this.field_status = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C37467u)) {
            return false;
        }
        C37467u uVar = (C37467u) obj;
        return uVar.field_functionmsgid.equals(this.field_functionmsgid) && uVar.systemRowid == this.systemRowid;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f99010R0;
    }

    public int getReportId() {
        return this.field_reportid;
    }

    public int hashCode() {
        return this.field_functionmsgid.hashCode();
    }

    /* renamed from: l2 */
    public LinkedList<C77949j3> mo61112l2() {
        C50207l3 l3Var = this.field_addMsgs;
        return l3Var == null ? new LinkedList<>() : l3Var.f137141d;
    }

    public String toString() {
        String str;
        if (!Util.isNullOrNil(this.field_cgi)) {
            String[] split = this.field_cgi.split("/");
            if (split.length > 0) {
                str = split[split.length - 1];
                return "FunctionMsgItem{cgi='" + str + '\'' + ", cmdid=" + this.field_cmdid + ", functionmsgid='" + this.field_functionmsgid + '\'' + ", version=" + this.field_version + ", preVersion=" + this.field_preVersion + ", status=" + this.field_status + ", actionTime=" + this.field_actionTime + ", delayTime=" + this.field_delayTime + ", retryCount=" + this.field_retryCount + ", retryCountLimit=" + this.field_retryCountLimit + '}';
            }
        }
        str = "@null";
        return "FunctionMsgItem{cgi='" + str + '\'' + ", cmdid=" + this.field_cmdid + ", functionmsgid='" + this.field_functionmsgid + '\'' + ", version=" + this.field_version + ", preVersion=" + this.field_preVersion + ", status=" + this.field_status + ", actionTime=" + this.field_actionTime + ", delayTime=" + this.field_delayTime + ", retryCount=" + this.field_retryCount + ", retryCountLimit=" + this.field_retryCountLimit + '}';
    }
}
