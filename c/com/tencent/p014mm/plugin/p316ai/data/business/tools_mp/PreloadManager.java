package com.tencent.p014mm.plugin.p316ai.data.business.tools_mp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PreloadToolsProcessEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;
import qe3.C89625d;
import s00.C90110f;

/* renamed from: com.tencent.mm.plugin.ai.data.business.tools_mp.PreloadManager */
public class PreloadManager implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e */
    public static PreloadManager f79629e = new PreloadManager();

    /* renamed from: f */
    public static String f79630f = "";

    /* renamed from: d */
    public IListener<PreloadToolsProcessEvent> f79631d = new IListener<PreloadToolsProcessEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1050795507;
        }

        public boolean callback(IEvent iEvent) {
            PreloadToolsProcessEvent preloadToolsProcessEvent = (PreloadToolsProcessEvent) iEvent;
            if (!PreloadManager.this.mo56435a()) {
                return false;
            }
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
            return false;
        }
    };

    public PreloadManager() {
        if (MMApplicationContext.isMainProcess()) {
            ((Application) MMApplicationContext.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this);
            this.f79631d.alive();
        }
    }

    /* renamed from: a */
    public boolean mo56435a() {
        return C89625d.f257845k || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_tools_mp_pss_opt_rule, 0) == 1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        String[] split;
        if (f79629e.mo56435a() && (split = activity.getClass().getName().split("\\.")) != null && split.length != 0) {
            String str = ";" + split[split.length - 1] + ";";
            if (TextUtils.isEmpty(f79630f)) {
                f79630f = MultiProcessMMKV.getDefault().getString("ai_is_tools_or_mp_entry", ";BizTimeLineUI;BaseScanUI;ChattingUI;ReaderAppUI;FTSMainUI;MainUI;MallWalletUI;ImageGalleryUI;UIPageFragmentActivity;FavoriteIndexUI;AppAttachNewDownloadUI;MallIndexUIv2;SnsCommentDetailUI;FloatBall;WalletBalanceManagerUI;TopStoryHomeUI;ContactInfoUI;RecordMsgDetailUI;FindMoreFriendsUI;AppBrandUI;WalletLqtDetailUI;ExtDeviceWXLoginUI;SnsBrowseUI;WXBizEntryActivity;WalletBankcardManageUI;FavoriteTextDetailUI;FTSAddFriendUI;AddMoreFriendsUI;GameCenterUI;SoSoProxyUI;WebSearchImageLoadingUI;CardDetailUI;EnterpriseBizContactListUI;EnterpriseConversationUI;LoginPasswordUI;BrandServiceIndexUI;SingleChatInfoUI;AppBrandUI2;FTSBizDetailUI;WXCustomSchemeEntryActivity;RemittanceDetailUI;WalletPasswordSettingUI;AppBrandUI1;SnsGalleryUI;FavoriteImgDetailUI;PhoneRechargeUI;LoginUI;AppBrandLauncherUI;FavSearchUI;MobileInputUI;VideoActivity;AppBrandLaunchProxyUI;MediaHistoryListUI;AppBrandPluginUI;TextPreviewUI;MallIndexOSUI;AppBrandUI3;SnsUploadUI;FavImgGalleryUI;Settings$AppControlSettingsActivity;ProfileSettingUI;RegByMobileRegAIOUI;ChatroomInfoUI;FavoriteFileDetailUI;NetworkDiagnoseAllInOneUI;EmojiStoreV2UI;LuckyMoneyNotHookReceiveUI;RoomCardUI;RecordMsgFileUI;AppBrandServiceChattingUI;GameMsgCenterUI;RecordMsgImageUI;FavRecordDetailUI;SnsAdNativeLandingPagesPreviewUI;CreateOrJoinChatroomUI;LuckyMoneyPickEnvelopeUI;WebSearchSnsImageLoadingUI;UIEntryStub;AppBrandTaskProxyUI;SnsWsFoldDetailUI;LoginSmsUI;FavFilterUI;SnsSingleTextViewUI;AppAttachDownloadUI;FinderFollowTabFragment;SettingsAboutMicroMsgUI;AppBrandUI4;AppBrandPluginUI2;NewBizConversationUI;MusicMvMainUI;WalletSecuritySettingUI;i;BizTimeLineNewMsgUI;BizChatroomInfoUI;MultiTalkSelectContactUI;SDKOAuthUI;SelectConversationUI;RemittanceBusiResultUI;WebViewStubProxyUI;WXEntryActivity;WalletOfflineCoinPurseUI;GameChatTabUI;CustomSmileyPreviewUI;ShakeReportUI;AppBrandProfileUI;FinderProfileTimeLineUI;GestureGalleryUI;FavSelectUI;WalletLqtSaveFetchUI;FinderFinderSysMsgUI;LoginVoiceUI;WeCoinRechargeView;FinderShareFeedRelUI;WeChatSplashActivity;AddressUIFragment;SimpleLoginUI;AppBrandProcessProxyUI;FaceDetectConfirmUI;WalletBrandUI;FinderFriendTabFragment;MusicMainUI;PermissionActivity;DownloadMainUI;RemittanceUI;MoreTabUI;SettingsModifyAliasCheckUI;EmojiStoreDetailUI;AppBrandTaskProxyUI2;WalletOrderInfoNewUI;WalletBalanceFetchUI;FinderProfileUI;HoneyPayCardManagerUI;LuckyMoneyDetailUI;AppBrandPluginUI3;SettingsAccountInfoUI;WxaLiteAppLiteUI;ExdeviceRankInfoUI;SettingsMoreSafeUI;ShareImgUI;LuckyMoneyPrepareUI;TopStoryTabHomeUI;RequestFloatWindowPermissionDialog;FinderAccountManagent;FileSelectorUI;FinderLiveVisitorWithoutAffinityUI;TaskRedirectUI;HoneyPayMainUI;MainActivity;OrderHandlerUI;OccupyFinderUI8;FinderMachineTabFragment;WebviewScanImageActivity;BankRemitBankcardInputUI;FaceFlashUI;FMessageConversationUI;WalletPayUI;SettingsSwitchAccountUI;FaceAgreementUI;NoteEditorUI;MultiTalkMainUI;FTSEmojiDetailPageUI;LoginByMobileSendSmsUI;AppBrandPluginUI1;BizChatConversationUI;RemittanceOSUI;EmptyActivity;WalletMixOrderInfoUI;SelectContactUI;ContactMoreInfoUI;WebViewDownloadUI;MsgRetransmitUI;AccountExpiredUI;FavMediaGalleryUI;SettingsModifyAliasUI;AppBrandPreLoadingUI;ImagePreviewUI;AppBrandServiceConversationUI;FinderLikedFeedUI;SettingsChattingBackgroundUI;AppBrandTaskProxyUI3;AppBrandTaskProxyUI4;AppBrandTaskProxyUI1;SendAppMessageWrapperUI;MobileLoginOrForceReg;MediaHistoryGalleryUI;BackupChooseBackupModeUI;FingerprintWalletLockUI;MultiTalkAddMembersUI;WXPayEntryActivity;WelabMainUI;QQCallbackUI;FingerPrintAuthUI;FTSDetailUI;AlbumPreviewUI;WalletOpenViewProxyUI;RemittanceBusiUI;CardShopUI;SosSimilarUI;LuckyMoneyBusiDetailUI;WcPayRealnameVerifyIdInputUI;VoiceInputUI;FixToolsUI;BackupPcUI;OpenFileChooserUI;SDKOAuthOtherUI;WebViewStubTempUI;WebWXLogoutUI;FaceFlashActionUI;");
            }
            if (f79630f.contains(str)) {
                ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
