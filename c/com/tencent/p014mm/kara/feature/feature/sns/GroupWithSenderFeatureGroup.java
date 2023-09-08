package com.tencent.p014mm.kara.feature.feature.sns;

import com.tencent.p014mm.kara.feature.feature.comm.GroupWithSomeoneFeatureGroup;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.GroupWithSenderFeatureGroup */
public class GroupWithSenderFeatureGroup extends GroupWithSomeoneFeatureGroup {
    public GroupWithSenderFeatureGroup(String str) {
        super(str);
    }

    public String getName() {
        return "sender_commonGroupChats";
    }
}
