package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pointers.PInt;
import java.util.ArrayList;
import java.util.List;
import kr3.C88285a;
import p206nj.C76862i;
import p210o.C11323a;
import p329d3.C86165a;
import p910lj.C76701a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands */
public class WeChatBrands {
    public static final String TAG = "MicroMsg.WeChatBrands";

    /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$UserInfo */
    public static class UserInfo {
        public static final int kMMXAgreementId_MainlandOnWeixin = 1;
        public static final int kMMXAgreementId_Oversea = 2;
        public static final int kMMXAgreementId_UnSet = 0;
        public static final int kMMXAgreementId_WechatUS = 3;
        public static int xagreementId;
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$AppInfo */
    public static class AppInfo {
        public static final String LANG_CN = "zh_CN";
        public static final String LANG_EN = "en";
        public static final String LANG_HK = "zh_HK";
        public static final String LANG_TW = "zh_TW";
        public static String lang = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());

        /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$AppInfo$WhichApp */
        public static final class WhichApp {
            private final int mDefaultXAgreementId;
            private final String mPackageName;
            private final String mUA;

            public WhichApp(String str, String str2, int i) {
                this.mPackageName = str;
                this.mUA = str2;
                this.mDefaultXAgreementId = i;
            }

            public int getDefaultXAgreementId() {
                return this.mDefaultXAgreementId;
            }

            public String getPackageName() {
                return this.mPackageName;
            }

            public String getUserAgent() {
                return this.mUA;
            }

            public boolean isMainland() {
                return this.mDefaultXAgreementId == 0;
            }

            public boolean isUS() {
                return this.mDefaultXAgreementId == 3;
            }
        }

        public static WhichApp current() {
            return C88285a.f255196a;
        }

        public static boolean isSimplifiedChinese() {
            return lang.equals("zh_CN");
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$Business */
    public static class Business {
        public static final String GROUP_ADS = "ads";
        public static final String GROUP_CHANNELS = "channels";
        public static final String GROUP_CROSS_DATA = "cross_data";
        public static final String GROUP_LIVE = "live";
        public static final String GROUP_MP = "mp";
        public static final String GROUP_OA = "oa";
        public static final String GROUP_OPEN = "open";
        public static final String GROUP_PAY = "pay";
        public static final String GROUP_SEARCH = "search";
        public static final String GROUP_SECONDARY = "secondary";
        public static final String GROUP_THIRD_PARTY = "third_party";
        public static final String GROUP_WECHAT_OUT = "wechat_out";
        public static final String GROUP_WECOM = "wecom";
        public static final int STATUS_O = 0;
        public static final int STATUS_R = 2;
        public static final int STATUS_X = 1;
        public static C11323a<Entries, Boolean> sAlertHandler = new C11323a<Entries, Boolean>() {
            public Boolean apply(Entries entries) {
                return Boolean.valueOf(entries.signRequsted());
            }
        };
        public static AvailabilityAlertSupplier sAlertSupplier = new AvailabilityAlertSupplier();
        public static C11323a<Entries, Boolean> sRestrictHanlder = new C11323a<Entries, Boolean>() {
            public Boolean apply(Entries entries) {
                return Boolean.valueOf(entries.restricted());
            }
        };

        /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$Business$AvailabilityAlertSupplier */
        public static class AvailabilityAlertSupplier {
            public static final int ON_DISMISS = -1;
            public static final int ON_NO = 0;
            public static final int ON_YES = 1;
            public String mBody;
            public C86165a<Integer> mCallback;
            public String mNegativeBtnText;
            public DialogInterface.OnClickListener mOnDismissListener;
            public DialogInterface.OnClickListener mOnNegativeClickListener;
            public DialogInterface.OnClickListener mOnPositiveClickListener;
            public String mPositiveBtnText;
            public String mTilte;

            public AvailabilityAlertSupplier attach(C86165a<Integer> aVar) {
                this.mCallback = aVar;
                return this;
            }

            public String getBody() {
                return this.mBody;
            }

            public C86165a<Integer> getCallback() {
                return this.mCallback;
            }

            public String getNegativeBtnText() {
                return this.mNegativeBtnText;
            }

            public DialogInterface.OnClickListener getOnDismissListener() {
                return this.mOnDismissListener;
            }

            public DialogInterface.OnClickListener getOnNegativeClickListener() {
                return this.mOnNegativeClickListener;
            }

            public DialogInterface.OnClickListener getOnPositiveClickListener() {
                return this.mOnPositiveClickListener;
            }

            public String getPositiveBtnText() {
                return this.mPositiveBtnText;
            }

            public String getTilte() {
                return this.mTilte;
            }

            public AvailabilityAlertSupplier setBody(String str) {
                this.mBody = str;
                return this;
            }

            public AvailabilityAlertSupplier setNegativeBtnText(String str) {
                this.mNegativeBtnText = str;
                return this;
            }

            public AvailabilityAlertSupplier setOnDismissListener(DialogInterface.OnClickListener onClickListener) {
                this.mOnDismissListener = onClickListener;
                return this;
            }

            public AvailabilityAlertSupplier setOnNegativeClickListener(DialogInterface.OnClickListener onClickListener) {
                this.mOnNegativeClickListener = onClickListener;
                return this;
            }

            public AvailabilityAlertSupplier setOnPositiveClickListener(DialogInterface.OnClickListener onClickListener) {
                this.mOnPositiveClickListener = onClickListener;
                return this;
            }

            public AvailabilityAlertSupplier setPositiveBtnText(String str) {
                this.mPositiveBtnText = str;
                return this;
            }

            public AvailabilityAlertSupplier setTilte(String str) {
                this.mTilte = str;
                return this;
            }

            public void showDialog(Context context) {
            }
        }

        /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries */
        public enum Entries {
            GlobalScan(Business.GROUP_PAY, 0),
            GlobalAppbrand(Business.GROUP_MP, 1),
            GlobalWeCom(Business.GROUP_WECOM, 1),
            Global3rdSrv(2),
            HomeMorePayment(Business.GROUP_PAY, 1),
            HomeMoreFeedback(2),
            HomeAppbrandDrawer(Business.GROUP_MP, 1),
            HomeNotifyMessage(Business.GROUP_OA, 1),
            HomeServiceOa(Business.GROUP_OA, 1),
            HomeServiceMp(Business.GROUP_OA, 1),
            HomePluginQQMail(Business.GROUP_THIRD_PARTY, 2),
            HomePluginSports(Business.GROUP_CROSS_DATA, 1),
            HomePluginWePay(Business.GROUP_PAY, 1),
            ContactNewFriendOa(Business.GROUP_OA, 1),
            ContactNewFriendWeWeCom(Business.GROUP_WECOM, 1),
            ContactOa(Business.GROUP_OA, 1),
            ContactWeCom(Business.GROUP_WECOM, 1),
            DiscoveryScanPayCode(Business.GROUP_PAY, 1),
            DiscoveryScanPayReward(Business.GROUP_PAY, 1),
            DiscoveryScanAppbrand(Business.GROUP_MP, 1),
            DiscoveryScanFace2Face(Business.GROUP_PAY, 1),
            DiscoveryScanRecognize(Business.GROUP_CROSS_DATA, 1),
            DiscoveryScanTranslate(Business.GROUP_CROSS_DATA, 1),
            DiscoveryScanSecondary(Business.GROUP_SECONDARY, 1),
            DiscoveryScanExtDevice(2),
            DiscoveryChannels(Business.GROUP_CHANNELS, 2),
            DiscoveryChannelsLive(Business.GROUP_CHANNELS, 2),
            DiscoveryShake(Business.GROUP_CROSS_DATA, 1),
            DiscoveryLooks("search", 1),
            DiscoverySearch("search", 1),
            DiscoveryNearby(Business.GROUP_CROSS_DATA, 1),
            DiscoveryNearbyLiveFriends(Business.GROUP_CROSS_DATA, 1),
            DiscoveryShop(Business.GROUP_THIRD_PARTY, 1),
            DiscoveryGame(Business.GROUP_THIRD_PARTY, 1),
            DiscoveryAppbrand(Business.GROUP_MP, 1),
            DiscoveryWeChatOut(Business.GROUP_WECHAT_OUT, 1),
            MePayment(Business.GROUP_PAY, 1),
            MeCouponCard(Business.GROUP_PAY, 1),
            MeAvatarAddress(Business.GROUP_PAY, 1),
            MeAvatarInvoiceTitle(Business.GROUP_PAY, 1),
            MeAvatarWeChatId(2),
            MeStickerDeclare(2),
            MeSetSecurityVoicePrint(2),
            MeSetSecurityQQ(2),
            MeSetSecurityFacebook(2),
            MeSetSecurityApple(2),
            MeSetNewMsgChannels(Business.GROUP_CHANNELS, 2),
            MeSetPrivacyAddByQQ(2),
            MeSetPrivacyPermissions(Business.GROUP_OPEN, 1),
            MeSetAboutIntros(2),
            MeSetPlugin(2),
            MeSetDiscoveryChannels(0),
            MeSetDiscoveryFinderLive(0),
            MeSetDiscoveryShake(0),
            MeSetDiscoveryLooks(0),
            MeSetDiscoverySearch(0),
            MeSetDiscoveryNearby(0),
            MeSetDiscoveryNearbyLiveFriends(0),
            MeSetDiscoveryNearbyLiveFriendsPerson(0),
            MeSetDiscoveryShop(0),
            MeSetDiscoveryGame(0),
            MeSetDiscoveryAppbrand(0),
            MeSetDiscoveryWeChatOut(0),
            LoginRegistFacebook(2),
            LoginRegistApple(2),
            LoginFacebook(2),
            LoginApple(2),
            LoginQQ(2),
            LoginPasswordReset(0),
            ContextTranslate(Business.GROUP_CROSS_DATA, 1),
            ContextSearch("search", 1),
            SessionSpeech2TextSnd(Business.GROUP_CROSS_DATA, 1),
            SessionSpeech2TextRcv(Business.GROUP_CROSS_DATA, 1),
            SessionMusic(Business.GROUP_CROSS_DATA, 1),
            SessionLocation(Business.GROUP_CROSS_DATA, 1),
            SessionAppbrand(Business.GROUP_MP, 1),
            SessionOa(Business.GROUP_OA, 1),
            SessionLuckyMoney(Business.GROUP_PAY, 1),
            SessionPayment(Business.GROUP_PAY, 1),
            SessionCouponCard(Business.GROUP_PAY, 1),
            SessionGroupTools(Business.GROUP_MP, 1),
            SessionGroupSolitaire(Business.GROUP_MP, 0),
            SessionGroupLive(Business.GROUP_LIVE, 1),
            SessionChannels(Business.GROUP_CHANNELS, 2),
            SessionVoiceMsg(Business.GROUP_CROSS_DATA, 1),
            PaymentH5Jsb(Business.GROUP_PAY, 1),
            PaymentAppbrandJsb(Business.GROUP_PAY, 1),
            PaymentOpenSdk(Business.GROUP_PAY, 1),
            MomentChannels(Business.GROUP_CHANNELS, 2),
            MomentAds(Business.GROUP_ADS, 1),
            MomentApprand(Business.GROUP_MP, 1),
            Unknown("unknownKey", "unknownGroup", 2);
            
            public final String group;
            public final String identifier;
            public final int status;

            private Entries(int i) {
                this.identifier = "";
                this.group = "";
                this.status = i;
            }

            private static boolean checkExpansionsInstalled(Entries entries) {
                if (entries == SessionLocation) {
                    return C76862i.m92661a("xmap");
                }
                if (entries == MomentAds) {
                    return C76862i.m92661a("pag");
                }
                if (entries.group.equals(Business.GROUP_CHANNELS) || entries.group.equals(Business.GROUP_LIVE)) {
                    return C76862i.m92661a("live_sdk");
                }
                return true;
            }

            public static void showAlert(final Context context, final C86165a<Integer> aVar) {
                C1159911 r0 = new Runnable() {
                    public void run() {
                        if (!C76862i.m92661a((String) null)) {
                            C76701a.makeText(context, (int) C0966R.string.f7966xq, 1).show();
                            return;
                        }
                        Context context = context;
                        if ((context instanceof Activity) || ((context instanceof ContextWrapper) && (((ContextWrapper) context).getBaseContext() instanceof Activity))) {
                            Business.sAlertSupplier.attach(aVar).showDialog(context);
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Business.Entry#showAlert error: the given context is not activty, context = ");
                        Context context2 = context;
                        sb.append(context2 == null ? "null" : context2.getClass());
                        Log.m105924i(WeChatBrands.TAG, sb.toString());
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    r0.run();
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(r0);
                }
            }

            public boolean banned() {
                return !checkExpansionsInstalled(this) || banned(this.status);
            }

            public boolean checkAvailable(Context context) {
                return checkAvailable(context, (C86165a<Integer>) null);
            }

            public boolean checkAvailableSlient(Context context, C86165a<AvailabilityAlertSupplier> aVar) {
                if (!checkExpansionsInstalled(this)) {
                    return false;
                }
                if (AppInfo.current().isMainland() || !Business.sRestrictHanlder.apply(this).booleanValue()) {
                    return true;
                }
                if (!(context instanceof Activity) || !Business.sAlertHandler.apply(this).booleanValue() || aVar == null) {
                    return false;
                }
                aVar.accept(Business.sAlertSupplier);
                return false;
            }

            public boolean restricted() {
                return !checkExpansionsInstalled(this) || restricted(this.status);
            }

            public boolean signRequsted() {
                return !checkExpansionsInstalled(this) || signRequsted(this.status);
            }

            public static boolean banned(int i) {
                boolean z = false;
                if (AppInfo.current().isMainland()) {
                    return false;
                }
                if (i == 2) {
                    z = true;
                }
                Log.m105924i(WeChatBrands.TAG, "Business.Entry#isBanned = " + z);
                return z;
            }

            public static boolean restricted(int i) {
                boolean z = false;
                if (AppInfo.current().isMainland()) {
                    return false;
                }
                if (i != 0) {
                    z = true;
                }
                Log.m105924i(WeChatBrands.TAG, "Business.Entry#isRestricted = " + z);
                return z;
            }

            public static boolean signRequsted(int i) {
                boolean z = false;
                if (AppInfo.current().isMainland()) {
                    return false;
                }
                if (i == 1) {
                    z = true;
                }
                Log.m105924i(WeChatBrands.TAG, "Business.Entry#signRequsted = " + z);
                return z;
            }

            public boolean checkAvailable(Context context, C86165a<Integer> aVar) {
                if (checkExpansionsInstalled(this)) {
                    if (AppInfo.current().isMainland() || !Business.sRestrictHanlder.apply(this).booleanValue()) {
                        return true;
                    }
                    if (!Business.sAlertHandler.apply(this).booleanValue()) {
                        return false;
                    }
                }
                showAlert(context, aVar);
                return false;
            }

            private Entries(String str, int i) {
                this.identifier = "";
                this.group = str;
                this.status = i;
            }

            private Entries(String str, String str2, int i) {
                this.identifier = str;
                this.group = str2;
                this.status = i;
            }
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$IReplaceApply */
    public interface IReplaceApply<I, O> {
        O apply(I i, PInt pInt);

        void reload();
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$PlaceHolderHandler */
    public static class PlaceHolderHandler {
        private static final String SYMBOL_END = "}";
        private static final int SYMBOL_END_LEN = 1;
        private static final String SYMBOL_STR = "${";
        private static final int SYMBOL_STR_LEN = 2;
        public C11323a<List, String> mJoiner = new C11323a<List, String>() {
            public String apply(List list) {
                StringBuilder sb = new StringBuilder();
                for (Object obj : list) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };
        public IReplaceApply<String, String> mReplacer = new IReplaceApply<String, String>() {
            public String apply(String str, PInt pInt) {
                return str;
            }

            public void reload() {
            }
        };

        /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$PlaceHolderHandler$PlaceHolderSpan */
        public static class PlaceHolderSpan extends StringSpan {
            public static final int BrandReplacement = 0;
            public static final int DomainReplacement = 1;
            public boolean mIsDomainReplace;
            public IReplaceApply<String, String> mReplacer;

            public PlaceHolderSpan(String str) {
                super(str);
            }

            public PlaceHolderSpan attach(IReplaceApply<String, String> iReplaceApply) {
                this.mReplacer = iReplaceApply;
                return this;
            }

            public boolean isReplaceable() {
                return true;
            }

            public String toString() {
                if (this.mReplacer == null) {
                    return String.valueOf(this.mText);
                }
                PInt pInt = new PInt();
                String apply = this.mReplacer.apply(this.mText, pInt);
                boolean z = true;
                if (pInt.value != 1) {
                    z = false;
                }
                this.mIsDomainReplace = z;
                return apply;
            }
        }

        /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$PlaceHolderHandler$StringSpan */
        public static class StringSpan {
            public final String mText;

            public StringSpan(String str) {
                this.mText = str;
            }

            public boolean isReplaceable() {
                return false;
            }

            public String toString() {
                return String.valueOf(this.mText);
            }
        }

        private static Object computePlaceHolders(String str, IReplaceApply<String, String> iReplaceApply) {
            try {
                return iterateComputingPlaceHolders(str, iReplaceApply);
            } catch (Throwable th) {
                Log.printErrStackTrace(WeChatBrands.TAG, th, "compute place holders error: " + th.getMessage() + ", input = " + str, new Object[0]);
                return str;
            }
        }

        private static Object iterateComputingPlaceHolders(String str, IReplaceApply<String, String> iReplaceApply) {
            int indexOf = str.indexOf(SYMBOL_STR);
            if (indexOf < 0) {
                return str;
            }
            ArrayList arrayList = new ArrayList(5);
            while (true) {
                if (indexOf <= 0) {
                    if (indexOf >= 0) {
                        int indexOf2 = str.indexOf(SYMBOL_END);
                        if (indexOf2 < 0) {
                            break;
                        }
                        int i = SYMBOL_STR_LEN;
                        if (indexOf + i >= str.length() - 1) {
                            break;
                        } else if (indexOf + i == indexOf2) {
                            int i2 = indexOf2 + 1;
                            arrayList.add(str.substring(indexOf, i2));
                            str = str.substring(i2);
                            indexOf = str.indexOf(SYMBOL_STR);
                        } else {
                            PlaceHolderSpan placeHolderSpan = new PlaceHolderSpan(str.substring(indexOf + i, indexOf2));
                            placeHolderSpan.attach(iReplaceApply);
                            arrayList.add(placeHolderSpan);
                            int length = str.length();
                            int i3 = SYMBOL_END_LEN;
                            if (indexOf2 == length - i3) {
                                return arrayList;
                            }
                            str = str.substring(indexOf2 + i3);
                            indexOf = str.indexOf(SYMBOL_STR);
                        }
                    } else {
                        arrayList.add(str);
                        return arrayList;
                    }
                } else {
                    arrayList.add(str.substring(0, indexOf));
                    str = str.substring(indexOf);
                    indexOf = str.indexOf(SYMBOL_STR);
                }
            }
            arrayList.add(str);
            return arrayList;
        }

        public PlaceHolderHandler attachJoiner(C11323a<List, String> aVar) {
            this.mJoiner = aVar;
            return this;
        }

        public PlaceHolderHandler attachReplacer(IReplaceApply<String, String> iReplaceApply) {
            this.mReplacer = iReplaceApply;
            return this;
        }

        public String replace(String str) {
            if (str == null) {
                return null;
            }
            if (str.length() == 0) {
                return "";
            }
            Object computePlaceHolders = computePlaceHolders(str, this.mReplacer);
            return computePlaceHolders instanceof String ? (String) computePlaceHolders : this.mJoiner.apply((List) computePlaceHolders);
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.WeChatBrands$Wordings */
    public static class Wordings {
        private static final char SYMBOL_LINEFEED = '\n';
        private static final char SYMBOL_SEPARATOR = ' ';
        /* access modifiers changed from: private */
        public static final PlaceHolderHandler handler;
        /* access modifiers changed from: private */
        public static boolean sEnableAutoSeparate = false;

        static {
            PlaceHolderHandler placeHolderHandler = new PlaceHolderHandler();
            handler = placeHolderHandler;
            placeHolderHandler.attachJoiner(new C11323a<List, String>() {
                public String apply(List list) {
                    StringBuilder sb = new StringBuilder();
                    String str = null;
                    for (int i = 0; i < list.size(); i++) {
                        Object obj = list.get(i);
                        String obj2 = obj.toString();
                        if (!TextUtils.isEmpty(obj2)) {
                            if (!(obj instanceof PlaceHolderHandler.PlaceHolderSpan) || !Wordings.sEnableAutoSeparate || ((PlaceHolderHandler.PlaceHolderSpan) obj).mIsDomainReplace) {
                                sb.append(obj2);
                                str = obj2;
                            } else {
                                if (!TextUtils.isEmpty(str) && Wordings.shouldSeparate(str, obj2)) {
                                    sb.append(Wordings.SYMBOL_SEPARATOR);
                                }
                                sb.append(obj2);
                                if (i < list.size() - 1 && Wordings.shouldSeparate(obj2, list.get(i + 1).toString())) {
                                    sb.append(Wordings.SYMBOL_SEPARATOR);
                                }
                                str = null;
                            }
                        }
                    }
                    return sb.toString();
                }
            });
        }

        private static boolean isAlphabet(char c) {
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        }

        private static boolean isChineseMarks(char c) {
            return c == 65292 || c == 12290 || c == 65281 || c == 65311 || c == 65306 || c == 65307 || c == 12289 || c == 12300 || c == 12301;
        }

        private static boolean isEnMarks(char c) {
            return c == '.' || c == ',' || c == '?' || c == '!' || c == ';' || c == ':';
        }

        private static boolean isLeftLinefeed(String str) {
            return str.charAt(str.length() - 1) == 'n' && str.length() > 1 && str.charAt(str.length() + -2) == '\\';
        }

        private static boolean isLeftXmlFormat(String str) {
            return str.charAt(str.length() - 1) == 's' && str.length() > 1 && str.charAt(str.length() + -2) == '%';
        }

        private static boolean notSeparateChar(char c) {
            return c == '-' || c == '/' || c == '\\';
        }

        /* access modifiers changed from: private */
        public static boolean shouldSeparate(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                char charAt = str.charAt(str.length() - 1);
                char charAt2 = str2.charAt(0);
                if (charAt == ' ' || charAt2 == ' ' || charAt == 10 || charAt2 == 10 || isChineseMarks(charAt) || isChineseMarks(charAt2) || notSeparateChar(charAt) || notSeparateChar(charAt2) || isEnMarks(charAt2)) {
                    return false;
                }
                if (isEnMarks(charAt)) {
                    return true;
                }
                if (!isAlphabet(charAt) && !Character.isDigit(charAt)) {
                    return isAlphabet(charAt2) || Character.isDigit(charAt2);
                }
                if (isLeftLinefeed(str)) {
                    return false;
                }
                return !isLeftXmlFormat(str) || isAlphabet(charAt2);
            }
            return false;
        }

        public static String translate(String str) {
            return handler.replace(str);
        }
    }

    public static void update(int i) {
        if (i == 0) {
            i = AppInfo.current().getDefaultXAgreementId();
        }
        UserInfo.xagreementId = i;
        updateEnableAutoSeparate();
    }

    public static void updateBizRestrictAlertHandler(C11323a<Business.Entries, Boolean> aVar) {
        Business.sAlertHandler = aVar;
    }

    public static void updateBizRestrictAlertSupplier(Business.AvailabilityAlertSupplier availabilityAlertSupplier) {
        Business.sAlertSupplier = availabilityAlertSupplier;
    }

    public static void updateBizRestrictHandler(C11323a<Business.Entries, Boolean> aVar) {
        Business.sRestrictHanlder = aVar;
    }

    private static void updateEnableAutoSeparate() {
        if ("zh_HK".equals(AppInfo.lang) || "zh_TW".equals(AppInfo.lang)) {
            boolean unused = Wordings.sEnableAutoSeparate = true;
        } else {
            boolean unused2 = Wordings.sEnableAutoSeparate = false;
        }
    }

    public static void updateLang(String str) {
        AppInfo.lang = str;
        updateEnableAutoSeparate();
        if (Wordings.handler.mReplacer != null) {
            Wordings.handler.mReplacer.reload();
        }
    }

    public static void updateReplacer(IReplaceApply<String, String> iReplaceApply) {
        Wordings.handler.attachReplacer(iReplaceApply);
    }
}
