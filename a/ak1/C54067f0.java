package ak1;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import c30.C26827e;
import cl1.C54979h1;
import cl1.C55001u;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import er1.C58739j4;
import fe1.C58961d;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import op3.C117878c;
import org.json.JSONObject;
import p185kq.C10383h;
import p206nj.C117627q;
import rx3.C13604l;
import sx3.C90364q0;
import zc1.C66785b;

/* renamed from: ak1.f0 */
public final class C54067f0 {

    /* renamed from: A */
    public int f151419A;

    /* renamed from: B */
    public String f151420B = "";

    /* renamed from: C */
    public String f151421C = "";

    /* renamed from: D */
    public C0063l0 f151422D;

    /* renamed from: E */
    public String f151423E;

    /* renamed from: F */
    public C0067n0 f151424F;

    /* renamed from: G */
    public long f151425G;

    /* renamed from: H */
    public String f151426H;

    /* renamed from: I */
    public String f151427I;

    /* renamed from: J */
    public String f151428J;

    /* renamed from: K */
    public String f151429K;

    /* renamed from: L */
    public final HashMap<String, String> f151430L;

    /* renamed from: M */
    public final HashMap<String, String> f151431M;

    /* renamed from: N */
    public C54083s0 f151432N;

    /* renamed from: O */
    public C54077p f151433O;

    /* renamed from: P */
    public long f151434P;

    /* renamed from: Q */
    public long f151435Q;

    /* renamed from: R */
    public JSONObject f151436R;

    /* renamed from: S */
    public int f151437S;

    /* renamed from: T */
    public String f151438T;

    /* renamed from: U */
    public int f151439U;

    /* renamed from: V */
    public long f151440V;

    /* renamed from: W */
    public long f151441W;

    /* renamed from: X */
    public long f151442X;

    /* renamed from: Y */
    public C54099m0 f151443Y;

    /* renamed from: Z */
    public boolean f151444Z;

    /* renamed from: a */
    public String f151445a = "";

    /* renamed from: a0 */
    public boolean f151446a0;

    /* renamed from: b */
    public long f151447b;

    /* renamed from: b0 */
    public boolean f151448b0;

    /* renamed from: c */
    public boolean f151449c;

    /* renamed from: c0 */
    public boolean f151450c0;

    /* renamed from: d */
    public String f151451d = "";

    /* renamed from: d0 */
    public boolean f151452d0;

    /* renamed from: e */
    public long f151453e;

    /* renamed from: e0 */
    public LinkedList<Long> f151454e0;

    /* renamed from: f */
    public boolean f151455f;

    /* renamed from: f0 */
    public WeakReference<RecyclerView> f151456f0;

    /* renamed from: g */
    public boolean f151457g;

    /* renamed from: g0 */
    public C0056f0 f151458g0;

    /* renamed from: h */
    public int f151459h;

    /* renamed from: h0 */
    public C0063l0 f151460h0;

    /* renamed from: i */
    public int f151461i;

    /* renamed from: i0 */
    public final ConcurrentHashMap<String, String> f151462i0;

    /* renamed from: j */
    public int f151463j;

    /* renamed from: j0 */
    public C0053e f151464j0;

    /* renamed from: k */
    public int f151465k;

    /* renamed from: k0 */
    public long f151466k0;

    /* renamed from: l */
    public int f151467l;

    /* renamed from: l0 */
    public C26827e f151468l0;

    /* renamed from: m */
    public int f151469m;

    /* renamed from: n */
    public int f151470n;

    /* renamed from: o */
    public int f151471o;

    /* renamed from: p */
    public final ArrayList<C117878c<C54068a0, Long, Boolean>> f151472p = new ArrayList<>();

    /* renamed from: q */
    public boolean f151473q;

    /* renamed from: r */
    public final ArrayList<C117878c<String, Long, Boolean>> f151474r = new ArrayList<>();

    /* renamed from: s */
    public String f151475s = "";

    /* renamed from: t */
    public boolean f151476t;

    /* renamed from: u */
    public C54088z f151477u = C54088z.OPEN;

    /* renamed from: v */
    public boolean f151478v;

    /* renamed from: w */
    public C54086x f151479w = C54086x.NO;

    /* renamed from: x */
    public long f151480x;

    /* renamed from: y */
    public boolean f151481y;

    /* renamed from: z */
    public int f151482z;

    /* renamed from: ak1.f0$a */
    public enum C0048a {
        LIVE_BTN_CLICK(4);
        

        /* renamed from: d */
        public final long f61d;

        /* access modifiers changed from: public */
        C0048a(long j) {
            this.f61d = j;
        }

        /* renamed from: a */
        public final long mo56a() {
            return this.f61d;
        }
    }

    /* renamed from: ak1.f0$b */
    public enum C0049b {
        ENTER_LIVE_CLOSE_UI(1),
        SEE_GIFT_LIST(2),
        CLICK_FINISH(3),
        ANCHOR_TIP(4);
        

        /* renamed from: d */
        public final int f67d;

        /* access modifiers changed from: public */
        C0049b(int i) {
            this.f67d = i;
        }
    }

    /* renamed from: ak1.f0$b0 */
    public enum C0050b0 {
        LIVE_SELF_PAGE_CLICK_BOOK_ITEM(1),
        LIVE_ENTER_CRAETE_BOOK_PAGE(2),
        LIVE_CREATE_BOOK_SUCC(3),
        LIVE_JUMP_PROFILE_PAGE(4),
        LIVE_CANCEL_BOOK(5),
        LIVE_CREATE_QRCODE(6),
        LIVE_CHECK_NOTICE(7),
        LIVE_SHARE(8),
        LIVE_IMG_DELETE(10),
        LIVE_GO_IN_NOTICE_ACTIVITY(11);
        

        /* renamed from: d */
        public final long f79d;

        /* access modifiers changed from: public */
        C0050b0(long j) {
            this.f79d = j;
        }
    }

    /* renamed from: ak1.f0$c */
    public enum C0051c {
        CLICK_LOTTERY_ICON(1),
        CLICK_JOIN_CONDITION(2),
        CLICK_ANY_COMMENT(3),
        CLICK_SPECIFY_COMMENT_CONTENT(4),
        CLICK_LIKE(5),
        WRITE_SPECIFY_COMMENT_CONTENT_SUCC(6),
        START_LOTTERY_SUCCESS(7),
        CLICK_ENTER_LOTTERY_RECORD_BY_RIGHT(8),
        CLICK_LOTTERY_RECORD_LIST_ENTER_WINNER_LIST_UI(9),
        CLICK_WINNER_AVATAR_ENTER_PRIVATE_MSG_UI(10),
        CLICK_LUCKY_BAG(11),
        CANCEL_LOTTERY(12),
        CLICK_FANS_MEMBER(13),
        LOTTERY_PANEL_HISTORY_EXPOSE(14),
        CLICK_LOTTERY_PANEL_HISTORY(15),
        LOTTERY_DETAIL_CLAIM_INFO_EXPOSE(16),
        CLICK_LOTTERY_DETAIL_CLAIM_INFO(17);
        

        /* renamed from: d */
        public int f98d;

        /* access modifiers changed from: public */
        C0051c(int i) {
            this.f98d = i;
        }
    }

    /* renamed from: ak1.f0$d */
    public enum C0052d {
        BATTLE_ACTION_PK_END_MIC_BREAK(8);
        

        /* renamed from: d */
        public final int f101d;

        /* access modifiers changed from: public */
        C0052d(int i) {
            this.f101d = i;
        }

        public final int getType() {
            return this.f101d;
        }
    }

    /* renamed from: ak1.f0$e */
    public enum C0053e {
        PROFILE(1),
        PROFILE_RIGHT_CORNER(2);
        

        /* renamed from: d */
        public final int f105d;

        /* access modifiers changed from: public */
        C0053e(int i) {
            this.f105d = i;
        }
    }

    /* renamed from: ak1.f0$e0 */
    public enum C0054e0 {
        ENTER_PAGE_EXPLORE(1),
        CLICK_CANCEL_RETURN(2),
        CLICK_START_LIVE(3);
        

        /* renamed from: d */
        public final int f110d;

        /* access modifiers changed from: public */
        C0054e0(int i) {
            this.f110d = i;
        }
    }

    /* renamed from: ak1.f0$f */
    public enum C0055f {
        CAST_SCREEN_EXPOSE(1),
        CAST_SCREEN_CLICK_MENU(2),
        CAST_SCREEN_DEVICE_EXPOSE(3),
        CAST_SCREEN_CLICK_DEVICE(4),
        CAST_SCREEN_SUCCESS(5),
        CAST_SCREEN_BREAK(6),
        CAST_SCREEN_TIMEOUT(7);
        

        /* renamed from: d */
        public final int f119d;

        /* access modifiers changed from: public */
        C0055f(int i) {
            this.f119d = i;
        }
    }

    /* renamed from: ak1.f0$f0 */
    public enum C0056f0 {
        START_LIVE_BY_FINDER_IDENTITY(1),
        CREATE_FINDER(2);
        

        /* renamed from: d */
        public final int f123d;

        /* access modifiers changed from: public */
        C0056f0(int i) {
            this.f123d = i;
        }
    }

    /* renamed from: ak1.f0$g */
    public enum C0057g {
        CLICK_CLEAR_SCREEN(1),
        CLICK_CLEAR_SCREEN_CANCEL(2),
        CLICK_CLEAR_SCREEN_MENU(3);
        

        /* renamed from: d */
        public final int f128d;

        /* access modifiers changed from: public */
        C0057g(int i) {
            this.f128d = i;
        }
    }

    /* renamed from: ak1.f0$h */
    public enum C0058h {
        UNDEFINE(-1),
        CLICK_LIST_ITEM_USER(4),
        EXPOSE_USER_FINDER_HALF_BOARD(5),
        CLICK_PRIVATE_MSG_USER(6),
        CLICK_FOLLOW_USER(7),
        CLICK_ENTER_USER_PROFILE(8);
        

        /* renamed from: d */
        public final int f136d;

        /* access modifiers changed from: public */
        C0058h(int i) {
            this.f136d = i;
        }
    }

    /* renamed from: ak1.f0$h0 */
    public enum C0059h0 {
        CLICK_LIST_ITEM_USER(4),
        EXPOSE_USER_FINDER_HALF_BOARD(5),
        CLICK_PRIVATE_MSG_USER(6),
        CLICK_FOLLOW_USER(7),
        CLICK_COMPLAIN_USER(8),
        CLICK_FORBITTEN_USER(9),
        CLICK_BLACK_USER(10),
        CLICK_ENTER_USER_PROFILE(11);
        

        /* renamed from: d */
        public final int f146d;

        /* access modifiers changed from: public */
        C0059h0(int i) {
            this.f146d = i;
        }
    }

    /* renamed from: ak1.f0$i0 */
    public enum C0060i0 {
        FROM_ONPLUGIN(2);

        /* access modifiers changed from: public */
        C0060i0(int i) {
        }
    }

    /* renamed from: ak1.f0$j */
    public enum C0061j {
        COMMENT_ZONE(1);
        

        /* renamed from: d */
        public final int f151d;

        /* access modifiers changed from: public */
        C0061j(int i) {
            this.f151d = i;
        }
    }

    /* renamed from: ak1.f0$l */
    public enum C0062l {
        BEFORE(1),
        LIVING(2);
        

        /* renamed from: d */
        public final int f155d;

        /* access modifiers changed from: public */
        C0062l(int i) {
            this.f155d = i;
        }
    }

    /* renamed from: ak1.f0$l0 */
    public enum C0063l0 {
        FINDER_PROFILE(1),
        NEARBY_LIVE(2),
        FINDER_PROFILE_RIGHT_CORNER(3),
        NEW_NEARBY_LIVE(4),
        CHAT_ROOM_LIVE(5);
        

        /* renamed from: d */
        public final int f162d;

        /* access modifiers changed from: public */
        C0063l0(int i) {
            this.f162d = i;
        }
    }

    /* renamed from: ak1.f0$m */
    public enum C0064m {
        MORE("more"),
        FOLLOW_ICON("follow_icon"),
        FOLLOW_GUIDE_LEAVE_ICON("follow_guide_leave_icon"),
        FOLLOW_GUIDE_LEAVE_FOLLOW("follow_guide_leave_follow"),
        SEND_TO_FRIEND("send_to_friend"),
        SEND_TO_MOMENT("share_to_moment"),
        SET_AS_MY_STATUS("set_as_my_status"),
        MINIMIZE("minimize"),
        RECENTLY_FORWARD("recently_forward"),
        SHARE_SEND_RECENT("share_send_recent"),
        MINIMIZE_LIVE("minimize_button"),
        LIVE_PLAY_SETTING_SWITCH("pic_set_button_switch"),
        LIVE_GIFT("live_gift"),
        FLOATING_BUTTON("floating_button"),
        ROTATING_BUTTON("rotating_button"),
        LIVE_CALL("live_call"),
        LIVE_ENTER_BIZ("live_enter_mmbiz"),
        MUTE_OPEN("mute_open"),
        MUTE_CLOSE("mute_close"),
        PAUSE_OPEN("pause_open"),
        COMMENT_OPEN("comment_open"),
        COMMENT_CLOSE("comment_close"),
        QUICK_REPLY_BUTTON("quick_reply_button"),
        QUICK_REPLY("quick_reply"),
        WHEAT_OPEN("wheat_open"),
        WHEAT_CLOSE("wheat_close"),
        GIFT_OPEN("gift_open"),
        GIFT_CLOSE("gift_close"),
        LIKE_OPEN("like_open"),
        LIKE_CLOSE("like_close"),
        ANNOUNCEMENT("announcement"),
        FAN_GROUP("fan_group"),
        SHOP("shop"),
        WHEAT("wheat"),
        MUSIC("music"),
        LUCKDRAW("luckdraw"),
        REDPACKET("redpacket"),
        LOTTERY("lottery"),
        FRAME("frame"),
        BEAUTY(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY),
        MAKEUP("makeup"),
        FILTER("filter"),
        IMAGE("image"),
        FLIP("flip"),
        HIDE_AUDIENCE_NICKNAME("hide_audience_nickname"),
        SHOW_AUDIENCE_NICKNAME("show_audience_nickname"),
        SWITCH(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH),
        MOREFUNCTION("morefunction"),
        DOCUMENT("document"),
        TIMELINE_BTN_SHOW("timeline_button_show"),
        SIDEBAR_BANNER("active_banner_icon"),
        SIDEBAR_CARD("active_card_list"),
        LIVE_PAGE_BANNER("live_page_banner"),
        GROUP_CHAT_BUTTON("group_chat_button"),
        BOX_SWITCH("box_switch"),
        WISH_LIST_BANNER("wish_list_banner"),
        MORE_WISH_LIST_BANNER("more_wish_list_banner"),
        LIVE_END_FEED("end_page_feed"),
        LIVE_END_PROFILE("end_page_feed_page"),
        END_PAGE_LIVE_CARD("end_page_live_card"),
        END_PAGE_LIVE_ITEM("end_page_live_item"),
        LIVE_LOTTERY_PRIVATE_REDEMPTION("live_lottery_private_redemption"),
        LIVE_LOTTERY_PRIVATE_BUY("live_lottery_private_buy"),
        LIVE_CONCERT_PROFILE_RECIVE("concert_tickets_profile_receive"),
        LIVE_CONCERT_NEW_LIVE_SPACE_RECEIVE("concert_tickets_main_page_receive"),
        LIVE_CONCERT_TICKET_PAGE_SHARE_BUTTON("concert_tickets_page_share_button"),
        LIVE_CONCERT_TICKET_PAGE_SAVE_BUTTON("concert_tickets_page_save_button"),
        LIVE_CONCERT_TICKET_PAGE_CHANGE_BUTTON("concert_tickets_page_change"),
        LIVE_CONCERT_TICKET_PAGE_SHARE_SUCC("concert_tickets_page_share_succ"),
        CONCERT_TICKETS_FEED_ME("concert_tickets_feed_me"),
        PANEL_UNLIKE_BUTTON("panel_unlike_button"),
        MAIN_PAGE_LONG_CLICK("main_page_long_click"),
        SQUARE_PAGE_LONG_CLICK("square_page_long_click"),
        LIVE_SAFETY_HINT_GO("live_safety_hint_go"),
        LIVE_SAFETY_HINT_START("live_safety_hint_start"),
        LIVE_SAFETY_REVISE_GO("live_safety_revise_go"),
        LIVE_SAFETY_GUIDE_GO("live_safety_guide_go"),
        LIVE_SAFETY_PROHIBIT_KNOW("live_safety_prohibit_know"),
        LIVE_SAFETY_PROHIBIT_APPEAL("live_safety_prohibit_appeal"),
        LIVE_END_PAGE_LIVE_DETAIL("anchor_end_page_live_detail"),
        LIVE_END_PAGE_LIVE_PLAYBACK("anchor_end_page_live_playback"),
        LIVE_END_PAGE_DIAGNOSIS("anchor_end_page_live_playback_diagnosis"),
        LIVE_VISITOR_POSTER("anchor_teaser_poster_share"),
        LIVE_VISITOR_POSTER_SUCC("anchor_teaser_poster_share_succ");
        

        /* renamed from: d */
        public final String f248d;

        /* access modifiers changed from: public */
        C0064m(String str) {
            this.f248d = str;
        }
    }

    /* renamed from: ak1.f0$m0 */
    public enum C0065m0 {
        LIVE_START_NETWORK_ERROR(1);
        

        /* renamed from: d */
        public final int f251d;

        /* access modifiers changed from: public */
        C0065m0(int i) {
            this.f251d = i;
        }

        public final int getType() {
            return this.f251d;
        }
    }

    /* renamed from: ak1.f0$n */
    public enum C0066n {
        MORE("more"),
        FOLLOW_ICON("follow_icon"),
        FOLLOW_GUIDE_PAGE("follow_guide_page"),
        FOLLOW_GUIDE_LEAVE_ICON("follow_guide_leave_icon"),
        FOLLOW_GUIDE_LEAVE_FOLLOW("follow_guide_leave_follow"),
        SEND_TO_FRIEND("send_to_friend"),
        SEND_TO_MOMENT("share_to_moment"),
        SET_AS_MY_STATUS("set_as_my_status"),
        MINIMIZE("minimize"),
        RECENTLY_FORWARD("recently_forward"),
        SHARE_SEND_RECENT("share_send_recent"),
        LIVE_PLAY_SETTING_SWITCH("pic_set_button_switch"),
        MOMENT_POST("moment_post"),
        SELECT_CHAT_BAR("select_chat_bar"),
        FLOATING_BUTTON("floating_button"),
        ROTATING_BUTTON("rotating_button"),
        SHARE_SEND("share_send"),
        LIVE_GIFT("live_gift"),
        LIVE_CALL("live_call"),
        LIVE_ENTER_BIZ("live_enter_mmbiz"),
        MUTE_OPEN("mute_open"),
        MUTE_CLOSE("mute_close"),
        PAUSE_OPEN("pause_open"),
        COMMENT_OPEN("comment_open"),
        COMMENT_CLOSE("comment_close"),
        WHEAT_OPEN("wheat_open"),
        WHEAT_CLOSE("wheat_close"),
        GIFT_OPEN("gift_open"),
        GIFT_CLOSE("gift_close"),
        ANNOUNCEMENT("announcement"),
        QUICK_REPLY_BUTTON("quick_reply_button"),
        QUICK_REPLY("quick_reply"),
        FAN_GROUP("fan_group"),
        SHOP("shop"),
        WHEAT("wheat"),
        MUSIC("music"),
        LUCKDRAW("luckdraw"),
        REDPACKET("redpacket"),
        LOTTERY("lottery"),
        FRAME("frame"),
        BEAUTY(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY),
        FILTER("filter"),
        IMAGE("image"),
        FLIP("flip"),
        HIDE_AUDIENCE_NICKNAME("hide_audience_nickname"),
        SHOW_AUDIENCE_NICKNAME("show_audience_nickname"),
        SWITCH(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH),
        MOREFUNCTION("morefunction"),
        DOCUMENT("document"),
        TIMELINE_BTN_SHOW("timeline_button_show"),
        SIDEBAR_BANNER("active_banner_icon"),
        SIDEBAR_CARD("active_card_list"),
        LIVE_PAGE_BANNER("live_page_banner"),
        BOX_SWITCH("box_switch"),
        WISH_LIST_BANNER("wish_list_banner"),
        MORE_WISH_LIST_BANNER("more_wish_list_banner"),
        LIVE_END_FEED("end_page_feed"),
        LIVE_END_PROFILE("end_page_feed_page"),
        END_PAGE_LIVE_CARD("end_page_live_card"),
        END_PAGE_LIVE_ITEM("end_page_live_item"),
        LIVE_LOTTERY_PRIVATE_REDEMPTION("live_lottery_private_redemption"),
        LIVE_LOTTERY_PRIVATE_BUY("live_lottery_private_buy"),
        LIVE_CONCERT_PROFILE_RECIVE("concert_tickets_profile_receive"),
        LIVE_CONCERT_FEEDS_RECIVE("concert_tickets_feeds_receive"),
        LIVE_CONCERT_NEW_LIVE_SPACE_RECEIVE("concert_tickets_main_page_receive"),
        LIVE_CONCERT_TICKET_PAGE_SHARE_BUTTON("concert_tickets_page_share_button"),
        LIVE_CONCERT_TICKET_PAGE_SAVE_BUTTON("concert_tickets_page_save_button"),
        LIVE_CONCERT_TICKET_PAGE_CHANGE_BUTTON("concert_tickets_page_change"),
        PANEL_UNLIKE_BUTTON("panel_unlike_button"),
        LIVE_SAFETY_HINT_GO("live_safety_hint_go"),
        LIVE_SAFETY_HINT_START("live_safety_hint_start"),
        LIVE_SAFETY_REVISE_GO("live_safety_revise_go"),
        LIVE_SAFETY_GUIDE_GO("live_safety_guide_go"),
        LIVE_SAFETY_DETECT("live_safety_detect"),
        LIVE_SAFETY_PROHIBIT_KNOW("live_safety_prohibit_know"),
        LIVE_SAFETY_PROHIBIT_APPEAL("live_safety_prohibit_appeal"),
        LIVE_END_PAGE_LIVE("anchor_end_page_live"),
        LIVE_END_PAGE_LIVE_DETAIL("anchor_end_page_live_detail"),
        LIVE_END_PAGE_LIVE_PLAYBACK("anchor_end_page_live_playback"),
        LIVE_END_PAGE_DIAGNOSIS("anchor_end_page_live_playback_diagnosis"),
        LIVE_VISITOR_POSTER("anchor_teaser_poster_share");
        

        /* renamed from: d */
        public final String f334d;

        /* access modifiers changed from: public */
        C0066n(String str) {
            this.f334d = str;
        }
    }

    /* renamed from: ak1.f0$n0 */
    public enum C0067n0 {
        PUBLIC(0),
        NUMBER_TO_SEE(1);
        

        /* renamed from: d */
        public final int f338d;

        /* access modifiers changed from: public */
        C0067n0(int i) {
            this.f338d = i;
        }
    }

    /* renamed from: ak1.f0$p0 */
    public enum C0068p0 {
        AuthExposure(1),
        AuthEnter(2),
        AuthSucc(3),
        AuthFail(4);
        

        /* renamed from: d */
        public final int f344d;

        /* access modifiers changed from: public */
        C0068p0(int i) {
            this.f344d = i;
        }
    }

    /* renamed from: ak1.f0$t0 */
    public enum C0069t0 {
        JOIN_EXPOSE(1),
        JOIN_CLICK(2),
        FOLLOW_JOIN_EXP(3),
        FOLLOW_JOIN_CLICK(4),
        JOIN_PANEL_EXP(5),
        JOIN_PANEL_CLICK(6),
        JOIN_GIFT_EXP(7),
        JOIN_GIFT_CLICK(8),
        HELP_CLICK(9),
        FANS_ENTRANCE_CLICK(10),
        FANS_CLUB_CLICK(11),
        FANS_CLUB_RIGHT_TAB_EXPOSURE(12),
        FANS_CLUB_ANNOUNCEMENT_SHOW(13),
        FANS_CLUB_ANNOUNCEMENT_IMAGE_CLICK(14);
        

        /* renamed from: d */
        public final int f360d;

        /* access modifiers changed from: public */
        C0069t0(int i) {
            this.f360d = i;
        }
    }

    /* renamed from: ak1.f0$u */
    public enum C0070u {
        EXPOSE(1),
        CLICK_2_FOLLOW(2);
        

        /* renamed from: d */
        public final int f364d;

        /* access modifiers changed from: public */
        C0070u(int i) {
            this.f364d = i;
        }
    }

    /* renamed from: ak1.f0$v0 */
    public enum C0071v0 {
        EXPOSURE_BLESS_BAG(1),
        CLICK_LUCKY_BAG(2),
        CLICK_JOIN_LOTTERY(3),
        SEND_SUCC_COMMENT(4),
        POPUP_TOAST_JOINED(5),
        SHOW_WIN_RESULT_CARD(6),
        CLICK_WIN_LIST(7),
        ENTER_WIN_RECORD_BY_RIGHH_CORNER(8),
        CLICK_WIN_ITEM_ENTER_DETAIL(9),
        CLICK_WIN_DETAIL_ENTER_PRIVATE_UI(10),
        LOTTERY_ATTEND_BTN_EXPOSURE(11),
        FOLLOW_SUC(12),
        LOTTERY_CARD_CLAIM_BTN_EXPOSE(14),
        CLICK_LOTTERY_CARD_CLAIM_BTN(15);
        

        /* renamed from: d */
        public final int f380d;

        /* access modifiers changed from: public */
        C0071v0(int i) {
            this.f380d = i;
        }
    }

    /* renamed from: ak1.f0$w */
    public enum C0072w {
        ICON_EXPOSE(1),
        ICON_CLICK(2),
        GET_SUCCESS(3),
        GET_FAIL(4);
        

        /* renamed from: d */
        public final int f386d;

        /* access modifiers changed from: public */
        C0072w(int i) {
            this.f386d = i;
        }
    }

    /* renamed from: ak1.f0$d0 */
    public enum C39609d0 {
        CLOSE(1),
        OPEN(2),
        MODIFY(3),
        FAIL(4);
        

        /* renamed from: d */
        public final int f106352d;

        /* access modifiers changed from: public */
        C39609d0(int i) {
            this.f106352d = i;
        }
    }

    /* renamed from: ak1.f0$v */
    public enum C39610v {
        TASK_EXPOSURE(1),
        TASK_CLICK(3);
        

        /* renamed from: d */
        public final int f106356d;

        /* access modifiers changed from: public */
        C39610v(int i) {
            this.f106356d = i;
        }
    }

    /* renamed from: ak1.f0$a0 */
    public enum C54068a0 {
        INVALIDATE(0),
        AUDIO(1),
        VIDEO(2);
        

        /* renamed from: d */
        public final int f151487d;

        /* access modifiers changed from: public */
        C54068a0(int i) {
            this.f151487d = i;
        }
    }

    /* renamed from: ak1.f0$c0 */
    public enum C54069c0 {
        LIVE_VERIFIED_PAGE_EXPOSURE(1),
        LIVE_ENTER_VERIFIED_PAGE(2),
        LIVE_PASS_VERIFIED_SUCC(3),
        LIVE_PASS_VERIFIED_FAIL(4);
        

        /* renamed from: d */
        public final long f151493d;

        /* access modifiers changed from: public */
        C54069c0(long j) {
            this.f151493d = j;
        }
    }

    /* renamed from: ak1.f0$g0 */
    public enum C54070g0 {
        HORIZONTAL_BY_CLICK_BTN(1),
        HORIZONTAL_BY_ROTATE_PHONE(2),
        PORTRAIT_BY_CLICK_BTN(3),
        PORTRAIT_BY_ROTATE_PHONE(4);
        

        /* renamed from: d */
        public final int f151499d;

        /* access modifiers changed from: public */
        C54070g0(int i) {
            this.f151499d = i;
        }
    }

    /* renamed from: ak1.f0$i */
    public enum C54071i {
        COMMENT_SCENE_SEARCH_1_SEARCH("temp_11"),
        COMMENT_SCENE_APPBRAN("temp_13");

        /* access modifiers changed from: public */
        C54071i(String str) {
        }
    }

    /* renamed from: ak1.f0$j0 */
    public enum C54072j0 {
        LIVE_SCREEN_PORTRAIT(1),
        LIVE_SCREEN_HORIZONTAL(2);
        

        /* renamed from: d */
        public final int f151506d;

        /* access modifiers changed from: public */
        C54072j0(int i) {
            this.f151506d = i;
        }
    }

    /* renamed from: ak1.f0$k */
    public enum C54073k {
        LIVE_COVER_DEFAULT(0),
        LIVE_COVER_FRONT_CAMERA(6),
        LIVE_COVER_ALBUM(8);
        

        /* renamed from: d */
        public final int f151511d;

        /* access modifiers changed from: public */
        C54073k(int i) {
            this.f151511d = i;
        }
    }

    /* renamed from: ak1.f0$k0 */
    public enum C54074k0 {
        LIVE_NO_SHOP_PERMIT(1),
        LIVE_SHOP_PERMIT_NO_SMALL_STORE(2),
        LIVE_SHOP_PERMIT_SMALL_STORE(3);
        

        /* renamed from: d */
        public final int f151516d;

        /* access modifiers changed from: public */
        C54074k0(int i) {
            this.f151516d = i;
        }
    }

    /* renamed from: ak1.f0$o */
    public enum C54075o {
        LIVE_LIVING(1),
        LIVE_STOPPED(2),
        LIVE_IN_BLACK_LIST(5),
        LIVE_NO_ACCESS_PERMISSION(6),
        LIVE_OVERLOAD(7);
        

        /* renamed from: d */
        public final long f151523d;

        /* access modifiers changed from: public */
        C54075o(long j) {
            this.f151523d = j;
        }
    }

    /* renamed from: ak1.f0$o0 */
    public enum C54076o0 {
        EnterRoom(1),
        Message(2),
        Like(3),
        CommentExpose(4),
        ComplaintEntry(5),
        Float(6),
        Share(7),
        HideOpearation(8),
        EnterProfile(9),
        CopyComment(10),
        SlideEnter(11),
        Commerce(12),
        QuitRoom(13),
        Auth(14),
        EXPLORE_SCREEN_SWITCH_BTN(15),
        SWITCH_SCREEN(16),
        REPLY(17),
        LOTTERY(18),
        GIFT(19),
        LINKMIC(20),
        FOLLOW_LIVE(22),
        CLICK_LINKMIC_ANCHOR_AVATAR_TO_LIVING_ROOM(23),
        RED_PACKET(24),
        GAME_TEAM(25),
        CAST_SCREEN(26),
        VISITOR_MUSIC(27),
        ANCHOR_PAUSE_LIVE(28),
        JUMP_TO_OFFICIAL_ACCOUNT(29),
        OPEN_HANDOFF(30),
        JUMP_GAME(31),
        COMMENT_OPTION(32),
        PROMOTE_BANNER(33),
        PROFILE_HALF_SCREEN(34),
        MODIFY_VIDEO_DEFINITION(35),
        FANS_CLUB(36),
        LIVE_DESC(37),
        GIFT_ALLOWANCE(38),
        BIZ_NAME(39),
        GAME_WELFARE(46),
        BIZ_HEAD(40),
        SCROLL_GUIDE(45),
        SIDE_BAR(47),
        ASSISTANT_LOTTERY(53),
        ASSISTANT_SHOP(54),
        ASSISTANT_MORE(55),
        VR_MODE(41),
        PROMOTE_VISITOR(42),
        OUTER_FLOAT_MODE(60),
        INNER_FLOAT_MODE(61),
        GAME_RANK(62),
        CHARGE_LIVE(66),
        BOX_LIVE(67),
        LIVE_MIC_INTERCOM(68),
        LIVING_SING_SONG(69),
        LIVE_MULTI_STREAM(70),
        LIVE_MANAGER_ABILITY(71),
        LIVE_AD_VIDEO(72),
        LIVE_VOTE(73),
        LIVE_CONCERT(74),
        CHEER_ANIMATION(75),
        QUOTA_CONSUME(76),
        GIFT_PACK_OPT(77),
        REPLAY_TRANSITION(78),
        LIVE_SCROLL_SQUARE(79),
        HOT_COMMENT(80),
        FRAME_SCALE(81),
        LIVE_SCREEN_SHOT(82),
        GIFT_ALL_NOTIFY(83),
        MENU_OPTION(84),
        LIVE_RED_DOT(85),
        MILESTONE_LOTTERY(86),
        LIVE_DANMAKU(87),
        EXIT_BEFORE_JOIN_RESP(999),
        AT_WX_SOMEONE(1002),
        SOMEONE_AT_ME_CLICK(1003),
        AT_BTN_CLICK(1004),
        SEND_LOCATION_BTN_CLICK(1005),
        GET_CITY_INFO_FAIL(1006);
        

        /* renamed from: d */
        public final int f151603d;

        /* access modifiers changed from: public */
        C54076o0(int i) {
            this.f151603d = i;
        }
    }

    /* renamed from: ak1.f0$p */
    public enum C54077p {
        LIVE_EXIT_OK(1),
        LIVE_EXIT_ERROR(2),
        LIVE_EXIT_CANCEL_TIMER(3),
        LIVE_EXIT_NOTHING(4);
        

        /* renamed from: d */
        public final long f151609d;

        /* access modifiers changed from: public */
        C54077p(long j) {
            this.f151609d = j;
        }
    }

    /* renamed from: ak1.f0$q */
    public enum C54078q {
        LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR(1),
        LIVE_AUDIENCE_EXPLORE_FEED_CARD(2),
        LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR(3),
        LIVE_AUDIENCE_CLICK_SINGLE_AVATAR(4),
        LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR_LIVING(5),
        LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR(6),
        LIVE_AUDIENCE_ENTER_LIVE_ROOM(7),
        LIVE_AUDIENCE_ENTER_LIVE_ROOM_REAL(8),
        LIVE_AUDIENCE_CLICK_AVATAR_LIVING(9),
        LIVE_AUDIENCE_CLICK_LIVE_FEED_AVATAR_LIVING(10),
        LIVE_AUDIENCE_CLICK_FEED_AVATAR_LIVING(11),
        CLICK_ENTER_LINKMIC_ANCHOR_PROFILE(23),
        LIVE_EXPOSE_MORE_LIVE(12),
        LIVE_CLICK_MORE_LIVE(13);
        

        /* renamed from: d */
        public final long f151625d;

        /* access modifiers changed from: public */
        C54078q(long j) {
            this.f151625d = j;
        }
    }

    /* renamed from: ak1.f0$q0 */
    public enum C54079q0 {
        Unknown(0),
        CloseTypeFloat(1),
        CloseTypeFull(2),
        CloseTypeKickedOut(3),
        CloseTypeSlide(4),
        CloseTypeOtherRoom(5),
        CloseTypeLiveOver(6),
        CloseTypeLiveBreak(7);
        

        /* renamed from: d */
        public final int f151635d;

        /* access modifiers changed from: public */
        C54079q0(int i) {
            this.f151635d = i;
        }
    }

    /* renamed from: ak1.f0$r */
    public enum C54080r {
        ORIGINAL_FILM(1),
        DEFAULT(2),
        BAIXI(3),
        QIURI(5),
        MEISHI(6),
        FANCHALENG(7),
        YUANQI(10),
        FENNEN(11),
        QINGCHE(12),
        LUORI(13),
        SHENSUI(14);
        

        /* renamed from: d */
        public final int f151648d;

        /* access modifiers changed from: public */
        C54080r(int i) {
            this.f151648d = i;
        }
    }

    /* renamed from: ak1.f0$r0 */
    public enum C54081r0 {
        CommerceActionBubbleTipShow(1),
        CommerceActionBubbleTipClick(2),
        CommerceActionShoppingButtonClick(3),
        CommerceActionGoodsOrderButtonClick(4),
        CommerceActionGoodsItemClick(5),
        CommerceActionPurchaseButtonClick(6),
        CommerceActionGoodsItemShow(7),
        CommerceActionBubbleTipClose(8),
        CommerceActionAnchorCloseBubble(9),
        CommerceActionExitHalfPage(10),
        CommerceActionCouponBubbleShow(1003),
        CommerceActionCouponBubbleClick(1004),
        CommerceActionCouponHalfPageShow(1005),
        CommerceActionCouponHalfPageClick(1006),
        CommerceActionHotSellExpose(1001),
        CommerceActionEntranceExpose(1002),
        CommerceActionShopWindowExpose(1011),
        CommerceActionShopWindowClick(1012),
        CommerceActionCouponExpose(1016),
        CommerceActionCouponClick(1017),
        CommerceActionShoppingEntranceExposed(1018),
        CommerceActionRetentionBubbleExposure(TXLiveConstants.PUSH_EVT_ROOM_OUT),
        CommerceActionRetentionBubbleClick(1020),
        CommerceActionRetentionItemExposure(1021),
        CommerceActionRetentionItemClick(TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
        

        /* renamed from: d */
        public final int f151675d;

        /* access modifiers changed from: public */
        C54081r0(int i) {
            this.f151675d = i;
        }
    }

    /* renamed from: ak1.f0$s */
    public enum C54082s {
        AppendToHistory(1),
        ExposureEmpty(2),
        InHistory(3);
        

        /* renamed from: d */
        public final int f151680d;

        /* access modifiers changed from: public */
        C54082s(int i) {
            this.f151680d = i;
        }
    }

    /* renamed from: ak1.f0$s0 */
    public enum C54083s0 {
        CLICK_LIVE_DEFAULT(0),
        CLICK_LIVE_CARD(1),
        CLICK_LIVE_CARD_AVATAR_LIVING(2),
        CLICK_CARD_AVATAR_LIVING(3),
        CLICK_AVATAR_LIVING(4),
        CLICK_SNSAD_ENTER_LIVE_ROOM(5),
        CLICK_JSAPI_HEJI_ENTER_LIVE_ROOM(1001);
        

        /* renamed from: d */
        public final int f151689d;

        /* access modifiers changed from: public */
        C54083s0(int i) {
            this.f151689d = i;
        }
    }

    /* renamed from: ak1.f0$t */
    public enum C54084t {
        LIVE_FLOAT_ACTION_UNKNOWN(0),
        LIVE_FLOAT_ACTION_MAXIMIZE(1),
        LIVE_FLOAT_ACTION_COLLAPSE_ANIMATION(2),
        LIVE_FLOAT_ACTION_MINIMIZE_INTERACTIVE(3),
        LIVE_FLOAT_ACTION_MINIMIZE_FOR_WEAPP(4),
        LIVE_FLOAT_ACTION_MINIMIZE_FOR_BG(5),
        LIVE_FLOAT_ACTION_ENTER_PROFILE(6),
        VISITOR_CLICK_ENTER_LOTTERY_RECORD(7);
        

        /* renamed from: d */
        public final int f151699d;

        /* access modifiers changed from: public */
        C54084t(int i) {
            this.f151699d = i;
        }
    }

    /* renamed from: ak1.f0$u0 */
    public enum C54085u0 {
        INVALIDATE(0),
        APPLY_LINKMIC(1),
        APPLY_AUDIO_LINKMIC(2),
        APPLY_VIDEO_LINKMIC(3),
        ANCHOR_PASS_LINKMIC_REQUEST(4),
        TIMEOUT_NO_LINK_HUNG_UP(5),
        ACTIVE_STOP_AUDIO_LINKMIC(7),
        ACTIVE_STOP_VIDEO_LINKMIC(8),
        LINKMIC_ICON_EXPLORE(9),
        FAIL_BY_REWARD_SETTING(14),
        FAIL_BY_FOLLOW_SETTING(15),
        FAIL_BY_BUY_PRODUCT_SETTING(16),
        TRTC_OPTION_PANEL_EXPOSE(17),
        TRTC_OPTION_PANEL_MUTE_CLICK(18),
        TRTC_OPTION_PANEL_ROTATE(19),
        TRTC_OPTION_PANEL_LINK_CLOSE(20),
        TRTC_OPTION_PANEL_CANCEL_MUTE(21),
        TRTC_OPTION_PANEL_WINDOW_EXPOSE(22);
        

        /* renamed from: d */
        public final int f151719d;

        /* access modifiers changed from: public */
        C54085u0(int i) {
            this.f151719d = i;
        }
    }

    /* renamed from: ak1.f0$x */
    public enum C54086x {
        YES(1),
        NO(2);
        

        /* renamed from: d */
        public final int f151723d;

        /* access modifiers changed from: public */
        C54086x(int i) {
            this.f151723d = i;
        }
    }

    /* renamed from: ak1.f0$y */
    public enum C54087y {
        CLICK_LINKMIC_LOGO(1),
        CONNECT_VOICE_TO_LINKMIC(2),
        CONNECT_VIDEO_TO_LINKMIC(3),
        DISCONNECT_VOICE_TO_LINKMIC(4),
        DISCONNECT_VIDEO_TO_LINKMIC(5),
        LINKMIC_ICON_READDOT_EXPOSE(6),
        ENTER_VISITOR_LINKMIC_TAB(7),
        ENTER_ANCHOR_LINKMIC_TAB(8),
        ENTER_INVITE_ANCHOR_LINKMIC_TAB(9),
        INVITE_ANCHOR_LINKMIC(10),
        LINKMIC_CONNECT_SUCCESS(11),
        STOP_LINKMIC_WHEN_WAITING_CONNECT(12),
        STOP_LINKMIC_WHEN_SHOW_CONNECTING(13),
        LINKMIC_FAILURE_WHEN_EXCEPTION_TOAST_SHOW(14),
        LINKMIC_CANCEL_AUDIENCE_MUTE(22);
        

        /* renamed from: d */
        public final int f151740d;

        /* access modifiers changed from: public */
        C54087y(int i) {
            this.f151740d = i;
        }
    }

    /* renamed from: ak1.f0$z */
    public enum C54088z {
        OPEN(1),
        CLOSE(2);
        

        /* renamed from: d */
        public final int f151744d;

        /* access modifiers changed from: public */
        C54088z(int i) {
            this.f151744d = i;
        }
    }

    public C54067f0() {
        C0063l0 l0Var = C0063l0.FINDER_PROFILE;
        this.f151422D = l0Var;
        this.f151423E = "";
        this.f151424F = C0067n0.PUBLIC;
        this.f151426H = "";
        this.f151427I = "";
        this.f151428J = "";
        this.f151429K = "";
        this.f151430L = C90364q0.m113146e(new C13604l("com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI", "1"), new C13604l("FinderProfileTimeLineUI", "1"), new C13604l("com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI", "16"), new C13604l("FinderLbsStreamListUI", "16"), new C13604l("com.tencent.mm.plugin.finder.ui.FinderFollowListUI", "12"), new C13604l("FinderFollowListUI", "12"), new C13604l("com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI", "27"), new C13604l("FinderTopicTimelineUI", "27"), new C13604l("com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI", "25"), new C13604l("FinderShareFeedRelUI", "25"), new C13604l("com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI", "2"), new C13604l("FinderLikedFeedUI", "2"), new C13604l("com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI", "21"), new C13604l("FinderFavTimelineUI", "21"), new C13604l("com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI", "40"), new C13604l("FinderFeedRelatedTimelineUI", "40"), new C13604l("com.tencent.mm.plugin.finder.search.FinderMixSearchUI", "23"), new C13604l("FinderMixSearchUI", "23"), new C13604l("com.tencent.mm.plugin.finder.search.FinderContactSearchUI", "temp_3"), new C13604l("FinderContactSearchUI", "temp_3"), new C13604l("com.tencent.mm.plugin.finder.search.FinderFeedSearchUI", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN), new C13604l("FinderFeedSearchUI", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN));
        this.f151431M = C90364q0.m113146e(new C13604l("com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment", "17"), new C13604l("FinderFollowTabFragment", "17"), new C13604l("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment", "18"), new C13604l("FinderFriendTabFragment", "18"), new C13604l("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment", "20"), new C13604l("FinderMachineTabFragment", "20"));
        this.f151432N = C54083s0.CLICK_LIVE_CARD;
        this.f151433O = C54077p.LIVE_EXIT_NOTHING;
        this.f151435Q = 1;
        this.f151439U = 0;
        this.f151443Y = new C54099m0((String) null, (String) null, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (HashMap) null, 0, 0, (String) null, 33554431, (C8480h) null);
        this.f151454e0 = new LinkedList<>();
        this.f151458g0 = C0056f0.START_LIVE_BY_FINDER_IDENTITY;
        this.f151460h0 = l0Var;
        this.f151462i0 = new ConcurrentHashMap<>();
        this.f151464j0 = C0053e.PROFILE;
        this.f151468l0 = new C26827e();
    }

    /* renamed from: a */
    public final void mo74751a(String str, String str2) {
        C87412m.m108594g(str, "key");
        ConcurrentHashMap<String, String> concurrentHashMap = this.f151462i0;
        if (str2 == null) {
            str2 = "";
        }
        concurrentHashMap.put(str, str2);
    }

    /* renamed from: b */
    public final String mo74752b() {
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        long j = bVar != null ? ((C55001u) bVar.mo71262a(C55001u.class)).f154416j : 0;
        if (j == 0) {
            return this.f151443Y.f151825b;
        }
        String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(j);
        C87412m.m108593f(XQ, "{\n            ServiceMan…dString(feedId)\n        }");
        return XQ;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = ((cl1.C55001u) r0.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo74753c() {
        /*
            r5 = this;
            fj1.b$a r0 = fj1.C45795b.f123697j
            fj1.b r0 = fj1.C45795b.f123698n
            r1 = -1
            if (r0 == 0) goto L_0x0017
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            if (r0 == 0) goto L_0x0017
            long r3 = r0.f182392d
            goto L_0x0018
        L_0x0017:
            r3 = r1
        L_0x0018:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            ak1.m0 r0 = r5.f151443Y
            java.lang.String r0 = r0.f151824a
            goto L_0x0033
        L_0x0021:
            java.lang.Class<kq.h> r0 = p185kq.C10383h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kq.h r0 = (p185kq.C10383h) r0
            java.lang.String r0 = r0.mo10700XQ(r3)
            java.lang.String r1 = "{\n            ServiceMan…dString(liveId)\n        }"
            gy3.C87412m.m108593f(r0, r1)
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54067f0.mo74753c():java.lang.String");
    }

    /* renamed from: d */
    public final String mo74754d() {
        String str;
        FinderObjectDesc finderObjectDesc;
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (bVar == null || (finderObjectDesc = ((C55001u) bVar.mo71262a(C55001u.class)).f154422s) == null || (str = finderObjectDesc.description) == null) {
            str = "";
        }
        String b = C117627q.m165909b(str, "UTF-8");
        C87412m.m108593f(b, "encode(text, \"UTF-8\")");
        return b;
    }

    /* renamed from: e */
    public final long mo74755e(String str, long j) {
        boolean z = true;
        if (!(C87412m.m108589b(str, "temp_11") ? true : C87412m.m108589b(str, "temp_15") ? true : C87412m.m108589b(str, "temp_16") ? true : C87412m.m108589b(str, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY) ? true : C87412m.m108589b(str, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN) ? true : C87412m.m108589b(str, "15"))) {
            z = C87412m.m108589b(str, "7");
        }
        if (z) {
            return (long) 5;
        }
        C87412m.m108589b(str, "9");
        return j;
    }

    /* renamed from: f */
    public final String mo74756f() {
        String O5 = C66785b.f191882e.mo90662O5();
        return O5 == null ? "" : O5;
    }

    /* renamed from: g */
    public final C54099m0 mo74757g() {
        return this.f151443Y;
    }

    /* renamed from: h */
    public final String mo74758h() {
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        return Wb == null ? "" : Wb;
    }

    /* renamed from: i */
    public final String mo74759i() {
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        String str = bVar != null ? ((C54979h1) bVar.mo71262a(C54979h1.class)).f154151z : null;
        if (TextUtils.isEmpty(str)) {
            str = this.f151451d;
        }
        Log.m105924i("HABBYGE-MALI.LiveReportConfig", "get shopAppid=" + str);
        return str == null ? "" : str;
    }

    /* renamed from: j */
    public final boolean mo74760j() {
        return this.f151446a0;
    }

    /* renamed from: k */
    public final int mo74761k() {
        return C58739j4.f168176a.mo83688Q(C58961d.f168673a.mo84155b(mo74756f())) ? 1 : 0;
    }

    /* renamed from: l */
    public final int mo74762l(String str) {
        if (str == null) {
            return 0;
        }
        return C58739j4.f168176a.mo83688Q(C58961d.f168673a.mo84155b(str)) ? 1 : 0;
    }

    /* renamed from: m */
    public final void mo74763m(C54078q qVar, String str) {
        C87412m.m108594g(qVar, "clickType");
        C87412m.m108594g(str, "commenScene");
        switch (qVar.ordinal()) {
            case 3:
            case 4:
            case 6:
                if (C87412m.m108589b(str, "37") || C87412m.m108589b(str, String.valueOf(C54071i.COMMENT_SCENE_APPBRAN)) || C87412m.m108589b(str, String.valueOf(C54071i.COMMENT_SCENE_SEARCH_1_SEARCH))) {
                    this.f151432N = C54083s0.CLICK_SNSAD_ENTER_LIVE_ROOM;
                    return;
                } else {
                    this.f151432N = C54083s0.CLICK_LIVE_CARD;
                    return;
                }
            case 8:
                this.f151432N = C54083s0.CLICK_AVATAR_LIVING;
                return;
            case 9:
                this.f151432N = C54083s0.CLICK_LIVE_CARD_AVATAR_LIVING;
                return;
            case 10:
                this.f151432N = C54083s0.CLICK_CARD_AVATAR_LIVING;
                return;
            default:
                this.f151432N = C54083s0.CLICK_LIVE_DEFAULT;
                return;
        }
    }

    /* renamed from: n */
    public final void mo74764n() {
        HashMap<Long, LinkedList<C54118z>> hashMap = this.f151443Y.f151845v;
        if (!hashMap.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry<Long, LinkedList<C54118z>> value : hashMap.entrySet()) {
                Iterator it = ((LinkedList) value.getValue()).iterator();
                while (it.hasNext()) {
                    C54118z zVar = (C54118z) it.next();
                    if (!zVar.f151965b) {
                        zVar.f151965b = true;
                        long j = currentTimeMillis - zVar.f151964a;
                        if (j <= 0) {
                            j = 0;
                        }
                        zVar.f151964a = j;
                    }
                }
            }
        }
    }
}
