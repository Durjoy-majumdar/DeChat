package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct */
public final class MomentsTogetherHistoryBrowsingStruct extends C61103a {

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct$a */
    public enum C1171a {
        ;
        

        /* renamed from: d */
        public final int f10002d;

        /* access modifiers changed from: public */
        C1171a(int i) {
            this.f10002d = i;
        }

        public String toString() {
            return String.valueOf(this.f10002d);
        }
    }

    public MomentsTogetherHistoryBrowsingStruct() {
        mo86052l("IfRedDot", 0);
        mo86052l("Source", 0);
        mo86052l("OwnerSetting", 0);
        mo86052l("WithFriendFeedCount", 0);
        mo86052l("WithFriendExtraFeedCount", 0);
        mo86052l("WithFriendFeedTime", 0);
        mo86052l("WithFriendGalleryCount", 0);
        mo86052l("WithFriendDetailCount", 0);
        mo86052l("WithFriendDetailTime", 0);
        mo86052l("WithFriendDetailAction", "");
        mo86052l("IsClickFriendList", 0);
        mo86052l("PageOwnerUsername", "");
    }

    /* renamed from: j */
    public int mo1004j() {
        return 24777;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo86050i("IfRedDot"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("Source"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("OwnerSetting"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("WithFriendFeedCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("WithFriendExtraFeedCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("WithFriendFeedTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("WithFriendGalleryCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("WithFriendDetailCount"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("WithFriendDetailTime"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("WithFriendDetailAction"));
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("IsClickFriendList") != null ? mo86050i("IsClickFriendList").toString() : -1);
        stringBuffer.append(",");
        stringBuffer.append(mo86050i("PageOwnerUsername"));
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IfRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("IfRedDot"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("Source"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OwnerSetting");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("OwnerSetting"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WithFriendFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("WithFriendFeedCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WithFriendExtraFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("WithFriendExtraFeedCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WithFriendFeedTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("WithFriendFeedTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WithFriendGalleryCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("WithFriendGalleryCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WithFriendDetailCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("WithFriendDetailCount"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WithFriendDetailTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("WithFriendDetailTime"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WithFriendDetailAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("WithFriendDetailAction"));
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsClickFriendList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("IsClickFriendList") != null ? mo86050i("IsClickFriendList").toString() : -1);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageOwnerUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(mo86050i("PageOwnerUsername"));
        return stringBuffer.toString();
    }

    public MomentsTogetherHistoryBrowsingStruct setIfRedDot(long j) {
        mo86052l("IfRedDot", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setIsClickFriendList(C1171a aVar) {
        mo86052l("IsClickFriendList", aVar);
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setOwnerSetting(int i) {
        mo86052l("OwnerSetting", Integer.valueOf(i));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setPageOwnerUsername(String str) {
        mo86052l("PageOwnerUsername", mo86045b("PageOwnerUsername", str, true));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setSource(long j) {
        mo86052l("Source", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setWithFriendDetailAction(String str) {
        mo86052l("WithFriendDetailAction", mo86045b("WithFriendDetailAction", str, true));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setWithFriendDetailCount(long j) {
        mo86052l("WithFriendDetailCount", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setWithFriendDetailTime(long j) {
        mo86052l("WithFriendDetailTime", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setWithFriendExtraFeedCount(long j) {
        mo86052l("WithFriendExtraFeedCount", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setWithFriendFeedCount(long j) {
        mo86052l("WithFriendFeedCount", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setWithFriendFeedTime(long j) {
        mo86052l("WithFriendFeedTime", Long.valueOf(j));
        return this;
    }

    public MomentsTogetherHistoryBrowsingStruct setWithFriendGalleryCount(long j) {
        mo86052l("WithFriendGalleryCount", Long.valueOf(j));
        return this;
    }
}
