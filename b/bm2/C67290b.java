package bm2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.Scopes;
import di3.C86312j;
import h81.C32735h;
import ht1.C60200t1;
import ke3.C88144b;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: bm2.b */
public class C67290b {

    /* renamed from: a */
    public static final SparseArray<C67291a> f193125a;

    /* renamed from: bm2.b$a */
    public static class C67291a {

        /* renamed from: a */
        public int f193126a;

        /* renamed from: b */
        public String f193127b;

        /* renamed from: c */
        public String f193128c;

        /* renamed from: d */
        public String f193129d;

        public C67291a(int i, int i2, String str, String str2, String str3) {
            this(i, i2, str, str2, str3, false);
        }

        public C67291a(int i, int i2, String str, String str2, String str3, boolean z) {
            this.f193126a = i2;
            this.f193127b = str;
            this.f193128c = str2;
            this.f193129d = str3;
        }
    }

    static {
        SparseArray<C67291a> sparseArray = new SparseArray<>();
        f193125a = sparseArray;
        sparseArray.put(19, new C67291a(19, -1, ".ui.SnsTimeLineUI", "sns", ""));
        sparseArray.put(30, new C67291a(19, -1, ".ui.BaseScanUI", "scanner", "", true));
        sparseArray.put(18, new C67291a(18, -1, ".ui.ShakeReportUI", "shake", ""));
        sparseArray.put(17, new C67291a(17, -1, ".ui.NearbyFriendsIntroUI", "nearby", ""));
        sparseArray.put(16, new C67291a(16, -1, ".ui.BottleBeachUI", "bottle", ""));
        sparseArray.put(31, new C67291a(31, -1, ".ui.GameCenterUI", "game", ""));
        sparseArray.put(20, new C67291a(20, -1, ".plugin.profile.ui.ContactInfoUI", "", "voiceinputapp"));
        sparseArray.put(21, new C67291a(21, -1, ".plugin.profile.ui.ContactInfoUI", "", "linkedinplugin"));
        sparseArray.put(26, new C67291a(26, -1, ".plugin.profile.ui.ContactInfoUI", "", "qqfriend"));
        sparseArray.put(29, new C67291a(29, -1, ".plugin.profile.ui.ContactInfoUI", "", "voipapp"));
        sparseArray.put(23, new C67291a(23, 1, ".ui.chatting.ChattingUI", "", "qqmail"));
        sparseArray.put(1, new C67291a(1, -1, ".ui.MallIndexUIv2", "mall", ""));
        sparseArray.put(24, new C67291a(24, 8, ".ui.chatting.ChattingUI", "", "weibo"));
        sparseArray.put(27, new C67291a(27, 65536, ".ui.MassSendHistoryUI", "masssend", "masssendapp"));
        sparseArray.put(28, new C67291a(28, 524288, ".ui.ReaderAppUI", "readerapp", "newsapp"));
        sparseArray.put(32, new C67291a(32, -1, ".ui.v2.EmojiStoreV2UI", "emoji", ""));
        sparseArray.put(33, new C67291a(33, -1, ".ui.FavoriteIndexUI", "favorite", ""));
        sparseArray.put(34, new C67291a(34, -1, ".ui.MallIndexUIv2", "mall", ""));
        sparseArray.put(35, new C67291a(35, -1, ".backupmoveui.BackupUI", "backup", ""));
        sparseArray.put(38, new C67291a(38, 16, ".ui.chatting.ChattingUI", "", "medianote"));
        sparseArray.put(39, new C67291a(39, -1, ".ui.chatting.ChattingUI", "", "filehelper"));
        sparseArray.put(6, new C67291a(6, -1, ".ui.LuckyMoneyIndexUI", "luckymoney", ""));
        sparseArray.put(41, new C67291a(41, -1, ".ui.WalletOfflineEntranceUI", "offline", ""));
        sparseArray.put(42, new C67291a(42, -1, ".ui.CollectAdapterUI", "collect", ""));
        sparseArray.put(40, new C67291a(40, -1, ".balance.ui.WalletBalanceManagerUI", "wallet", ""));
        sparseArray.put(43, new C67291a(43, -1, ".ui.chatting.ChattingUI", "", "gh_43f2581f6fd6"));
        sparseArray.put(50, new C67291a(50, -1, ".ui.conversation.BizConversationUI", "app", ""));
        sparseArray.put(51, new C67291a(51, -1, ".ui.setting.SettingsPrivacyUI", "setting", ""));
        sparseArray.put(66, new C67291a(66, -1, ".ui.AppBrandLauncherUI", XWalkEnvironment.MODULE_APPBRAND, ""));
        sparseArray.put(63, new C67291a(63, -1, ".ui.conversation.BizConversationUI", "app", ""));
        sparseArray.put(64, new C67291a(64, -1, ".plugin.setting.ui.fixtools.FixToolsUI", "app", ""));
        sparseArray.put(65, new C67291a(65, -1, "", "", ""));
        sparseArray.put(67, new C67291a(67, -1, ".plugin.brandservice.ui.timeline.BizTimeLineUI", "app", ""));
        sparseArray.put(68, new C67291a(68, -1, ".ui.chatting.ChattingUI", "", "gh_3dfda90e39d6"));
        sparseArray.put(69, new C67291a(69, -1, ".ui.conversation.AppBrandServiceConversationUI", "app", ""));
        sparseArray.put(70, new C67291a(70, -1, ".ui.chatting.ChattingUI", "", "gh_f0a92aa7146c"));
        sparseArray.put(71, new C67291a(71, -1, ".ui.chatting.ChattingUI", "", "appbrand_notify_message"));
        if (1 == ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_minishop_plugin_enabled, 1)) {
            sparseArray.put(72, new C67291a(72, -1, ".ui.chatting.ChattingUI", "", "gh_579db1f2cf89"));
        }
        sparseArray.put(73, new C67291a(73, -1, ".ui.chatting.ChattingUI", "", "gh_b4af18eac3d5"));
        sparseArray.put(75, new C67291a(75, -1, ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83766M5(), "finder", ""));
        sparseArray.put(74, new C67291a(74, -1, ".ui.conversation.OpenImKefuServiceConversationUI", "app", ""));
        sparseArray.put(76, new C67291a(76, -1, ".ui.chatting.ChattingUI", "", "gh_e087bb5b95e6"));
        sparseArray.put(77, new C67291a(77, -1, ".ui.conversation.ConvBoxServiceConversationUI", "app", "conversationboxservice"));
    }

    /* renamed from: a */
    public static boolean m79634a(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("Contact_User", str);
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        return true;
    }
}
