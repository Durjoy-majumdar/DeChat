package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct */
public final class MomentsTogetherTailActionStruct extends C61103a {

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct$a */
    public enum C1172a {
        feed(2);
        

        /* renamed from: d */
        public final int f10005d;

        /* access modifiers changed from: public */
        C1172a(int i) {
            this.f10005d = i;
        }

        public String toString() {
            return String.valueOf(this.f10005d);
        }
    }

    public MomentsTogetherTailActionStruct() {
        mo86052l("Scene", 0);
        mo86052l("ExpoCount", 0);
        mo86052l("ClickCount", 0);
        mo86052l("PublishId", "");
        mo86052l("CCUserList", "");
    }

    /* renamed from: j */
    public int mo1004j() {
        return 24784;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i("Scene") != null ? mo86050i("Scene").toString() : -1);
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("ExpoCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("ClickCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("PublishId"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("CCUserList"));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Scene") != null ? mo86050i("Scene").toString() : -1);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExpoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("ExpoCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("ClickCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PublishId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("PublishId"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CCUserList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("CCUserList"));
        return stringBuffer.toString();
    }

    public MomentsTogetherTailActionStruct setCCUserList(String str) {
        mo86052l("CCUserList", mo86045b("CCUserList", str, true));
        return this;
    }

    public MomentsTogetherTailActionStruct setClickCount(long j) {
        mo86052l("ClickCount", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherTailActionStruct setExpoCount(long j) {
        mo86052l("ExpoCount", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherTailActionStruct setPublishId(String str) {
        mo86052l("PublishId", mo86045b("PublishId", str, true));
        return this;
    }

    public MomentsTogetherTailActionStruct setScene(C1172a aVar) {
        mo86052l("Scene", aVar);
        return this;
    }
}
