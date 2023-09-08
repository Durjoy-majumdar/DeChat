package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.localSearchComfirmActionStruct */
public final class localSearchComfirmActionStruct extends C61103a {

    /* renamed from: d */
    public long f156975d = 0;

    /* renamed from: e */
    public long f156976e = 0;

    /* renamed from: f */
    public String f156977f = "";

    /* renamed from: j */
    public int mo1004j() {
        return 15776;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156975d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156976e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156977f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("actionScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156975d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156976e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(SearchIntents.EXTRA_QUERY);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156977f);
        return stringBuffer.toString();
    }
}
