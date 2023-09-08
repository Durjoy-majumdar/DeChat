package com.tencent.p014mm.kara.feature.feature.comm;

import f30.C86704a;
import o30.C89112b;
import q30.C100981a0;
import q30.C100983b0;
import q30.C100984c0;
import q30.C100985d0;
import q30.C100986e0;
import q30.C100987f0;
import q30.C100988g0;
import q30.C100989h0;
import q30.C100990i0;
import q30.C100991j0;
import q30.C101021t;
import q30.C101022u;
import q30.C101023v;
import q30.C101024w;
import q30.C101025x;
import q30.C101026y;
import q30.C101027z;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.MySelfFeatureGroup */
public class MySelfFeatureGroup extends C89112b {
    @C86704a
    public int addMeByContactCard;
    @C86704a
    public int addMeByGroupChat;
    @C86704a
    public int addMeByMyQRCode;
    @C86704a
    public int appLaunchedDueToNotification;
    @C86704a
    public int autoDownloadMediasViewedOnOtherDevice;
    @C86704a
    public int autoplayMomentVideosOnMobileData;
    @C86704a
    private AvatarFeatureGroup avatar = new AvatarFeatureGroup();
    @C86704a
    public int findMeByMobileNumber;
    @C86704a
    public int findMeByQQID;
    @C86704a
    public int findMeByWeChatID;
    @C86704a
    public int findMobileContacts;
    @C86704a
    public int finderUpdateAlerts;
    @C86704a
    public int fontLevel;
    @C86704a
    public int makeLast10MomentPostsPublic;
    @C86704a
    public int messagePushNotifications;
    @C86704a
    public int momentsUpdateAlerts;
    @C86704a
    public int requireFriendRequest;
    @C86704a
    public int sex;
    @C86704a
    public int showPushNotificationPreviewText;
    @C86704a
    public int soundForInAppNotifications;
    @C86704a
    public int turnOffSpeaker;
    @C86704a
    public int vibrateForInAppNotifications;
    @C86704a
    public int[] visibleMomentToFriends;
    @C86704a
    public int voiceAndVideoCallPushNotifications;

    public void build() {
        super.build();
        C100991j0 j0Var = C100991j0.f295709e;
        this.addMeByContactCard = ((Boolean) j0Var.mo138469a("addMeByContactCard", new C100981a0(j0Var))).booleanValue() ? 1 : 0;
        this.addMeByGroupChat = ((Boolean) j0Var.mo138469a("addMeByGroupChart", new C100983b0(j0Var))).booleanValue() ? 1 : 0;
        this.addMeByMyQRCode = ((Boolean) j0Var.mo138469a("addMeByMyQRCode", new C100984c0(j0Var))).booleanValue() ? 1 : 0;
        this.findMeByMobileNumber = ((Boolean) j0Var.mo138469a("findMeByMobileNumber", new C100985d0(j0Var))).booleanValue() ? 1 : 0;
        this.findMeByQQID = ((Boolean) j0Var.mo138469a("findMeByQQID", new C100986e0(j0Var))).booleanValue() ? 1 : 0;
        this.findMeByWeChatID = ((Boolean) j0Var.mo138469a("findMeByWeChatID", new C100987f0(j0Var))).booleanValue() ? 1 : 0;
        this.findMobileContacts = ((Boolean) j0Var.mo138469a("findMobileContacts", new C101022u(j0Var))).booleanValue() ? 1 : 0;
        this.fontLevel = ((Integer) j0Var.mo138469a("fontLevel", new C100988g0(j0Var))).intValue();
        this.finderUpdateAlerts = ((Boolean) j0Var.mo138469a("finderUpdateAlerts", new C101021t(j0Var))).booleanValue() ? 1 : 0;
        this.autoplayMomentVideosOnMobileData = ((Boolean) j0Var.mo138469a("autoplayMomentVideosOnMobileData", new C100990i0(j0Var))).booleanValue() ? 1 : 0;
        this.autoDownloadMediasViewedOnOtherDevice = ((Boolean) j0Var.mo138469a("autoDownloadMediasViewedOnOtherDevice", new C100989h0(j0Var))).booleanValue() ? 1 : 0;
        this.makeLast10MomentPostsPublic = ((Boolean) j0Var.mo138469a("makeLast10MomentPostsPublic", new C101023v(j0Var))).booleanValue() ? 1 : 0;
        this.momentsUpdateAlerts = ((Boolean) j0Var.mo138469a("momentsUpdateAlerts", new C101024w(j0Var))).booleanValue() ? 1 : 0;
        this.showPushNotificationPreviewText = ((Boolean) j0Var.mo138469a("showPushNotificationPreviewText", new C101025x(j0Var))).booleanValue() ? 1 : 0;
        this.turnOffSpeaker = ((Boolean) j0Var.mo138469a("turnOffSpeaker", new C101026y(j0Var))).booleanValue() ? 1 : 0;
        this.visibleMomentToFriends = (int[]) j0Var.mo138469a("visibleMomentToFriends", new C101027z(j0Var));
    }

    public String getName() {
        return "myself";
    }
}
