package com.tencent.p014mm.kara.feature.feature.business;

import com.tencent.p014mm.kara.feature.feature.comm.DeviceFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.comm.DiscoverSettingsFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.comm.MySelfFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.ContactsThatCommentedFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.ContactsThatLikedFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.GroupWithSenderFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.SenderMessageHistories;
import com.tencent.p014mm.kara.feature.feature.sns.SenderMomentsFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.SenderRelationshipFeatureGroup;
import com.tencent.p014mm.kara.feature.feature.sns.SenderSnsHistories;
import com.tencent.p014mm.kara.feature.feature.sns.SenderTagsFeatureGroup;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import d40.C31062a;
import f30.C86704a;
import o30.C89112b;
import os2.C100417r0;

/* renamed from: com.tencent.mm.kara.feature.feature.business.SnsVideoClickFeatureGroup */
public class SnsVideoClickFeatureGroup extends C89112b {
    @C86704a
    public GroupWithSenderFeatureGroup commendGroup;
    @C86704a
    public ContactsThatCommentedFeatureGroup contactsThatCommented;
    @C86704a
    public ContactsThatLikedFeatureGroup contactsThatLiked;
    @C86704a
    public DeviceFeatureGroup device = new DeviceFeatureGroup();
    @C86704a
    public DiscoverSettingsFeatureGroup discover = new DiscoverSettingsFeatureGroup();
    @C86704a
    public long feedId;
    @C86704a
    public MyHistoriesOfPreviewClassificationFeatureGroup historiesOfPreviewClassification = new MyHistoriesOfPreviewClassificationFeatureGroup();
    @C86704a
    public HistoriesOfSameCityFeatureGroup historiesOfSameCity = new HistoriesOfSameCityFeatureGroup(this.snsInfo);
    @C86704a
    public HistoriesOfWeishangFeatureGroup historiesOfWeishang = new HistoriesOfWeishangFeatureGroup();
    @C86704a
    public int isAtMe;
    @C86704a
    public int isWeishang;
    @C86704a
    public MySelfFeatureGroup mySelf = new MySelfFeatureGroup();
    @C86704a
    public SenderRelationshipFeatureGroup sender;
    @C86704a
    public SenderMessageHistories senderMessageHistories;
    @C86704a
    public SenderMomentsFeatureGroup senderMoment;
    @C86704a
    public SenderSnsHistories senderSnsHistories;
    @C86704a
    public SenderTagsFeatureGroup senderTags;
    private SnsInfo snsInfo;
    @C86704a
    public int timeIntervalSincePostedInHours;

    public SnsVideoClickFeatureGroup(SnsInfo snsInfo2) {
        this.snsInfo = snsInfo2;
        this.contactsThatCommented = new ContactsThatCommentedFeatureGroup(snsInfo2);
        this.contactsThatLiked = new ContactsThatLikedFeatureGroup(snsInfo2);
        this.sender = new SenderRelationshipFeatureGroup(snsInfo2.getUserName());
        this.senderMoment = new SenderMomentsFeatureGroup(snsInfo2.getUserName());
        this.commendGroup = new GroupWithSenderFeatureGroup(snsInfo2.getUserName());
        this.senderTags = new SenderTagsFeatureGroup(snsInfo2.getUserName());
        this.senderSnsHistories = new SenderSnsHistories(snsInfo2.getUserName());
        this.senderMessageHistories = new SenderMessageHistories(snsInfo2.getUserName());
        mo123443f(this.snsInfo);
        mo123444g(snsInfo2.getSnsId());
    }

    public void build() {
        C31062a.m39295b("MomentVideo", 301);
        try {
            super.build();
            long currentTimeMillis = System.currentTimeMillis();
            int i = 1;
            this.isAtMe = this.snsInfo.isWithMe() ? 1 : 0;
            this.timeIntervalSincePostedInHours = (int) ((((currentTimeMillis - (((long) this.snsInfo.getCreateTime()) * 1000)) / 1000) / 60) / 60);
            if (!this.snsInfo.isWsFold()) {
                i = 0;
            }
            this.isWeishang = i;
            this.feedId = C100417r0.m131425n(this.snsInfo.getSnsId());
        } catch (Exception unused) {
            C31062a.m39295b("MomentVideo", 302);
        }
    }

    public String getName() {
        return "snsvedio";
    }
}
