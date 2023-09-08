package com.tencent.p014mm.storage;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.xweb.file.XVFSFile;
import java.util.Iterator;
import p749xh.C78807f1;
import p788aj.C67053c;

/* renamed from: com.tencent.mm.storage.o1 */
public class C72988o1 extends C78807f1 {

    /* renamed from: x */
    public static IAutoDBItem.MAutoDBInfo f212817x = C78807f1.initAutoDBInfo(C72988o1.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f212817x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("username:");
        sb.append(this.field_username);
        sb.append(" ");
        sb.append("lastLocalSeq:");
        sb.append(this.field_lastLocalSeq);
        sb.append(" ");
        sb.append("lastPushSeq:");
        sb.append(this.field_lastPushSeq);
        sb.append(" ");
        if (this.field_seqBlockInfo != null) {
            sb.append("block:");
            Iterator<C67053c> it = this.field_seqBlockInfo.f192605d.iterator();
            while (it.hasNext()) {
                C67053c next = it.next();
                sb.append("[");
                sb.append(next.f192601d);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(next.f192602e);
                sb.append("]");
                sb.append("[");
                sb.append(next.f192603f);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(next.f192604g);
                sb.append("]");
                sb.append(APLogFileUtil.SEPARATOR_LOG);
            }
        }
        return sb.toString();
    }
}
