package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a70.C112760b;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54208j0;
import androidx.lifecycle.C54209k0;
import androidx.lifecycle.C54219z;
import ax1.C39638b;
import ax1.C39639c;
import ax1.C39641d;
import bx1.C0390n;
import bx1.C0391o;
import bx1.C39848c;
import bx1.C39851f;
import bx1.C39859l;
import bx1.C39861m;
import bx1.C39865r;
import bx1.C39869u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChatRoomAtFunctionEvent;
import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.autogen.events.ChatRoomLocateInfoEvent;
import com.tencent.p014mm.autogen.events.JumpTargetEvent;
import com.tencent.p014mm.autogen.events.NewUserNoticeEvent;
import com.tencent.p014mm.autogen.events.PreSendImgDataEvent;
import com.tencent.p014mm.autogen.events.UploadImgResultEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AdminInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Background;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BackgroundInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BanAction;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BgImgInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BgPagInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomBanAction;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomButton;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomEnterInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomExternInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgImage;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomPanel;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ContentBlock;
import com.tencent.p014mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ExportExternInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.FirstEnterNotify;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JoinChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.KickOutCardInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgBaseInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.autogen.chatroom.PremadeCardInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.RealtimeControlInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.RestrictRule;
import com.tencent.p014mm.plugin.game.autogen.chatroom.RobotInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SendChatroomMsgResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.UserBanAction;
import com.tencent.p014mm.plugin.game.autogen.chatroom.UserEnterOption;
import com.tencent.p014mm.plugin.game.chatroom.channel.C41684a;
import com.tencent.p014mm.plugin.game.chatroom.channel.C41687d;
import com.tencent.p014mm.plugin.game.chatroom.channel.ChatChannelFragment;
import com.tencent.p014mm.plugin.game.chatroom.channel.ChatChannelPage;
import com.tencent.p014mm.plugin.game.chatroom.view.C41832q0;
import com.tencent.p014mm.plugin.game.chatroom.view.C41834r0;
import com.tencent.p014mm.plugin.game.chatroom.view.C41837s0;
import com.tencent.p014mm.plugin.game.chatroom.view.C41852z;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomPanelController;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomStateView;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatCommentFooter;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import com.tencent.p014mm.plugin.game.chatroom.view.JoinChatRoomConfirmView;
import com.tencent.p014mm.plugin.game.chatroom.view.JoinConfirmView;
import com.tencent.p014mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView;
import com.tencent.p014mm.plugin.game.luggage.C41985r;
import com.tencent.p014mm.plugin.game.luggage.C41993t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72806l1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72843y1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import hx1.C46128a;
import hx1.C46132c;
import in3.C87771d;
import in3.C87773e;
import j20.C117292a;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jx1.C46577a;
import k20.C60958c;
import k20.C9556a;
import kx1.C46793e;
import kx1.e$$a;
import lu3.C34379c;
import mx1.C100020p;
import mx1.C47119a;
import mx1.C47125e;
import mx1.C47127f;
import mx1.C47132h;
import mx1.C47133i;
import mx1.C47135k;
import mx1.C47136l;
import mx1.C61584n;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import org.libpag.PAGView;
import p578js.C108769b;
import p629ny.C76979h;
import p663qo.C101213l;
import pe3.C47465a;
import pe3.C89349b;
import q90.C101070j;
import qo3.C47883u;
import qo3.C77426q;
import rd3.C48020a;
import rx3.C13604l;
import sw1.C48485r;
import tl3.C78039a;
import uy1.C52645f;
import vo3.C90852c;
import wx3.C15601d;
import wx3.C66212f;
import yw1.C53591c;
import yw1.C53601h;
import yw1.C53603j;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;
import zw1.C16408b;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI */
public class GameChatRoomUI extends ChatRoomBaseUI implements C11385n, C39638b {

    /* renamed from: i1 */
    public static final /* synthetic */ int f112171i1 = 0;

    /* renamed from: A */
    public ChatRoomStateView f112172A;

    /* renamed from: B */
    public ChatChannelPage f112173B;

    /* renamed from: C */
    public TextView f112174C;

    /* renamed from: D */
    public WeImageView f112175D;

    /* renamed from: E */
    public View f112176E;

    /* renamed from: F */
    public View f112177F;

    /* renamed from: G */
    public GameChatCommentFooter f112178G;

    /* renamed from: H */
    public JoinConfirmView f112179H;

    /* renamed from: I */
    public View f112180I;

    /* renamed from: J */
    public TextView f112181J;

    /* renamed from: K */
    public View f112182K;

    /* renamed from: L */
    public ImageView f112183L;

    /* renamed from: M */
    public TextView f112184M;

    /* renamed from: N */
    public C46132c f112185N;

    /* renamed from: P */
    public C46128a f112186P;

    /* renamed from: Q */
    public boolean f112187Q = false;

    /* renamed from: Q0 */
    public String f112188Q0;

    /* renamed from: R */
    public JumpInfo f112189R;

    /* renamed from: R0 */
    public boolean f112190R0 = false;

    /* renamed from: S */
    public JumpInfo f112191S;

    /* renamed from: S0 */
    public ExportExternInfo f112192S0;

    /* renamed from: T */
    public JumpInfo f112193T;

    /* renamed from: T0 */
    public ChatroomEnterInfo f112194T0;

    /* renamed from: U */
    public ChatroomExternInfo f112195U;

    /* renamed from: U0 */
    public ChatroomPanel f112196U0;

    /* renamed from: V */
    public String f112197V;

    /* renamed from: V0 */
    public boolean f112198V0 = false;

    /* renamed from: W */
    public JumpInfo f112199W;

    /* renamed from: W0 */
    public boolean f112200W0 = false;

    /* renamed from: X */
    public String f112201X;

    /* renamed from: X0 */
    public PAGView f112202X0;

    /* renamed from: Y */
    public ChatroomButton f112203Y;

    /* renamed from: Y0 */
    public C47127f f112204Y0;

    /* renamed from: Z */
    public boolean f112205Z = false;

    /* renamed from: Z0 */
    public C41721a f112206Z0;

    /* renamed from: a1 */
    public boolean f112207a1 = false;

    /* renamed from: b1 */
    public View f112208b1;

    /* renamed from: c1 */
    public IListener f112209c1;

    /* renamed from: d1 */
    public IListener f112210d1;

    /* renamed from: e1 */
    public BroadcastReceiver f112211e1;

    /* renamed from: f1 */
    public IListener f112212f1;

    /* renamed from: g */
    public Context f112213g;

    /* renamed from: g1 */
    public IListener f112214g1;

    /* renamed from: h */
    public String f112215h;

    /* renamed from: h1 */
    public IListener f112216h1;

    /* renamed from: i */
    public String f112217i;

    /* renamed from: j */
    public boolean f112218j;
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: n */
    public ChatroomData f112219n;

    /* renamed from: o */
    public ChatroomUserData f112220o;

    /* renamed from: p */
    public String f112221p;

    /* renamed from: p0 */
    public int f112222p0 = 0;

    /* renamed from: q */
    public Lbs f112223q;

    /* renamed from: r */
    public long f112224r;

    /* renamed from: s */
    public long f112225s;

    /* renamed from: t */
    public int f112226t = -1;

    /* renamed from: u */
    public long f112227u = -1;

    /* renamed from: v */
    public View f112228v;

    /* renamed from: w */
    public ImageView f112229w;

    /* renamed from: x */
    public ImageView f112230x;

    /* renamed from: x0 */
    public boolean f112231x0 = false;

    /* renamed from: y */
    public TextView f112232y;

    /* renamed from: y0 */
    public boolean f112233y0 = true;

    /* renamed from: z */
    public TextView f112234z;

    public GameChatRoomUI() {
        C40008f fVar = C40008f.f107254d;
        this.f112209c1 = new IListener<ChatRoomAtFunctionEvent>(fVar) {
            {
                this.__eventId = 1578674988;
            }

            public boolean callback(IEvent iEvent) {
                final ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = (ChatRoomAtFunctionEvent) iEvent;
                C39641d X3 = ((C39639c) C86312j.m106911c(C39639c.class)).mo62193X3(chatRoomAtFunctionEvent.f107397d.f107398a);
                if (X3 == null || !X3.mo62198Q1()) {
                    Log.m105924i("GameChatRoom.GameChatRoomUI", "canBeAt = false");
                    return false;
                }
                GameChatRoomUI.this.f112178G.postDelayed(new Runnable() {
                    public void run() {
                        GameChatRoomUI.this.f112178G.setVisibility(0);
                        GameChatCommentFooter gameChatCommentFooter = GameChatRoomUI.this.f112178G;
                        ChatRoomAtFunctionEvent.C40049a aVar = chatRoomAtFunctionEvent.f107397d;
                        gameChatCommentFooter.mo65490d(aVar.f107398a, aVar.f107399b, true);
                    }
                }, 200);
                return false;
            }
        };
        this.f112210d1 = new IListener<NewUserNoticeEvent>(fVar) {
            {
                this.__eventId = 86036039;
            }

            public boolean callback(IEvent iEvent) {
                NewUserNoticeEvent newUserNoticeEvent = (NewUserNoticeEvent) iEvent;
                if (newUserNoticeEvent.f107660d.f107661a == 3 && !C53601h.m60126e(GameChatRoomUI.this.f112215h).f150605b) {
                    GameChatRoomUI.this.f112178G.setVisibility(0);
                    GameChatRoomUI gameChatRoomUI = GameChatRoomUI.this;
                    gameChatRoomUI.f112178G.mo65491e(newUserNoticeEvent.f107660d.f107663c, gameChatRoomUI.f112173B.getRookieChannel());
                }
                return false;
            }
        };
        this.f112211e1 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                GameChatRoomUI gameChatRoomUI;
                if (intent != null && "com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM".equals(intent.getAction()) && (gameChatRoomUI = GameChatRoomUI.this) != null && !gameChatRoomUI.isFinishing()) {
                    if (Util.nullAsNil(GameChatRoomUI.this.f112215h).equals(intent.getStringExtra("chatroom_name"))) {
                        Log.m105924i("GameChatRoom.GameChatRoomUI", "GameChatRoomUI exit!");
                        GameChatRoomUI.this.mo65408Q7(true);
                    }
                }
            }
        };
        this.f112212f1 = new IListener<JumpTargetEvent>(fVar) {
            {
                this.__eventId = 366754379;
            }

            public boolean callback(IEvent iEvent) {
                if (!((JumpTargetEvent) iEvent).f107621d.f107622a) {
                    return false;
                }
                ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new ChatRoomLocateInfoEvent();
                ChatRoomLocateInfoEvent.C40051a aVar = chatRoomLocateInfoEvent.f107403d;
                GameChatRoomUI gameChatRoomUI = GameChatRoomUI.this;
                aVar.f107404a = gameChatRoomUI.f112226t;
                aVar.f107405b = gameChatRoomUI.f112227u;
                aVar.f107406c = true;
                chatRoomLocateInfoEvent.publish();
                return false;
            }
        };
        this.f112214g1 = new IListener<PreSendImgDataEvent>(fVar) {
            {
                this.__eventId = 322587848;
            }

            public boolean callback(IEvent iEvent) {
                final PreSendImgDataEvent preSendImgDataEvent = (PreSendImgDataEvent) iEvent;
                ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
                    public void run() {
                        GameChatRoomUI gameChatRoomUI = GameChatRoomUI.this;
                        PreSendImgDataEvent.C40154a aVar = preSendImgDataEvent.f107697d;
                        String str = aVar.f107698a;
                        String str2 = aVar.f107699b;
                        int i = aVar.f107701d;
                        int i2 = aVar.f107702e;
                        int i3 = GameChatRoomUI.f112171i1;
                        gameChatRoomUI.getClass();
                        if (!Util.isNullOrNil(str)) {
                            ChatroomMsgImage chatroomMsgImage = new ChatroomMsgImage();
                            chatroomMsgImage.url = "ChatRoomImgPath://" + str + "/" + URLEncoder.encode(str2);
                            chatroomMsgImage.thumb_width = i;
                            chatroomMsgImage.thumb_height = i2;
                            MsgContent msgContent = new MsgContent();
                            msgContent.chatroom_image = chatroomMsgImage;
                            ((HashMap) C46793e.f125916b).put(str, gameChatRoomUI.mo65415X7(3, 0, (MsgOptions) null, msgContent, false, true, str));
                        }
                    }
                });
                return false;
            }
        };
        this.f112216h1 = new IListener<UploadImgResultEvent>(fVar) {
            {
                this.__eventId = -1588746421;
            }

            public boolean callback(IEvent iEvent) {
                UploadImgResultEvent uploadImgResultEvent = (UploadImgResultEvent) iEvent;
                if (!uploadImgResultEvent.f107796d.f107798b) {
                    return false;
                }
                ChatroomMsgImage chatroomMsgImage = new ChatroomMsgImage();
                UploadImgResultEvent.C40179a aVar = uploadImgResultEvent.f107796d;
                chatroomMsgImage.aeskey = aVar.f107799c;
                chatroomMsgImage.url = aVar.f107800d;
                chatroomMsgImage.thumb_width = aVar.f107801e;
                chatroomMsgImage.thumb_height = aVar.f107802f;
                GameChatRoomUI gameChatRoomUI = GameChatRoomUI.this;
                String str = aVar.f107797a;
                int i = GameChatRoomUI.f112171i1;
                gameChatRoomUI.getClass();
                MsgContent msgContent = new MsgContent();
                msgContent.chatroom_image = chatroomMsgImage;
                gameChatRoomUI.mo65415X7(3, 0, (MsgOptions) null, msgContent, true, false, str);
                return false;
            }
        };
    }

    /* renamed from: L7 */
    public static void m45180L7(GameChatRoomUI gameChatRoomUI, int i) {
        long j;
        GameChatRoomUI gameChatRoomUI2 = gameChatRoomUI;
        int i2 = i;
        if (i2 == 1) {
            j = 6;
        } else if (i2 == 2) {
            j = 7;
        } else if (i2 != 3) {
            gameChatRoomUI.getClass();
            return;
        } else {
            j = 28;
        }
        long j2 = j;
        C40308d.C40309a aVar = C40308d.f108375a;
        long j3 = gameChatRoomUI2.f112225s;
        long j4 = gameChatRoomUI2.f112224r;
        int i3 = gameChatRoomUI2.f112222p0;
        String str = C40308d.f108377c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("teams", i3);
        C40308d.C40309a.m43461i(aVar, 1305, 2, j2, 0, j3, j4, str, 0, "", jSONObject.toString(), 0, 1024, (Object) null);
    }

    /* renamed from: P7 */
    public static boolean m45181P7(Context context, C16408b.C16409a aVar, Lbs lbs, ActivityOptions activityOptions, boolean z) {
        if (!(context instanceof Activity)) {
            Log.m105924i("GameChatRoom.GameChatRoomUI", "context is not activity");
            return false;
        }
        boolean c = C53601h.m60124c(false);
        if (!C53591c.f150603e || c) {
            Intent intent = new Intent();
            if (aVar.f43827k || !C53601h.m60128g() || (((Activity) context).isInMultiWindowMode() && !(context instanceof GameChatRoomAffinityUI))) {
                intent.setClass(context, GameChatRoomUI.class);
            } else {
                intent.setClass(context, GameChatRoomAffinityUI.class);
                intent.addFlags(268435456);
            }
            Bundle bundle = aVar.f43823g;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("chat_room_name", aVar.f43817a);
            intent.putExtra("chat_room_icon", aVar.f43818b);
            if (lbs != null) {
                try {
                    intent.putExtra("chat_room_lbs", lbs.toByteArray());
                } catch (IOException unused) {
                }
            }
            intent.putExtra("chat_room_auto_join", aVar.f43819c);
            intent.putExtra("game_report_sourceid", aVar.f43821e);
            intent.putExtra("game_report_ssid", aVar.f43820d);
            intent.putExtra("back_to_room_list", aVar.f43822f);
            intent.putExtra("disable_game_page_swipe", z);
            intent.putExtra("target_channel_id", aVar.f43824h);
            intent.putExtra("target_seq", aVar.f43825i);
            intent.putExtra("is_real_time_room", aVar.f43827k);
            intent.putExtra("chatroom_report_extinfo", aVar.f43828l);
            if (activityOptions != null) {
                intent.putExtra("need_exit_anim", true);
                ((Activity) context).startActivityForResult(intent, aVar.f43826j, activityOptions.toBundle());
            } else {
                Activity activity = (Activity) context;
                int i = aVar.f43826j;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                aVar2.mo10233c(intent);
                C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "enterGameChatRoom", "(Landroid/content/Context;Lcom/tencent/mm/plugin/game/chatroom/api/IPluginGameChatRoom$PluginGameRoomParam;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;Landroid/app/ActivityOptions;Z)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                activity.overridePendingTransition(MMFragmentActivity$$c.f318648e, MMFragmentActivity$$c.f318649f);
            }
            return true;
        }
        Log.m105924i("GameChatRoom.GameChatRoomUI", "We are only allowed one chatroom at a time");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02a5 A[SYNTHETIC] */
    /* renamed from: F2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62190F2(yw1.C53591c.C53594c r18, pe3.C47465a r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            int r2 = r18.ordinal()
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0210
            if (r2 == r5) goto L_0x0011
            goto L_0x0331
        L_0x0011:
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse
            if (r2 == 0) goto L_0x0331
            com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse r0 = (com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse) r0
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView r2 = r1.f112172A
            r2.getClass()
            com.tencent.mm.plugin.game.autogen.chatroom.SlotList r6 = r0.slot_list
            if (r6 == 0) goto L_0x0039
            java.lang.String r6 = r6.head_desc
            r2.f112447r = r6
            android.widget.TextView r6 = r2.f112443n
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0036
            android.widget.TextView r6 = r2.f112443n
            java.lang.Object r6 = r6.getTag()
            if (r6 == 0) goto L_0x0039
        L_0x0036:
            r2.mo65481a()
        L_0x0039:
            com.tencent.mm.plugin.game.autogen.chatroom.Broadcast r6 = r0.broadcast
            r7 = 0
            r9 = 2
            if (r6 == 0) goto L_0x009e
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage> r10 = r6.message_list
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r10)
            if (r10 == 0) goto L_0x0049
            goto L_0x009e
        L_0x0049:
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage> r10 = r6.message_list
            java.lang.Object r10 = r10.get(r4)
            com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage r10 = (com.tencent.p014mm.plugin.game.autogen.chatroom.BroadcastMessage) r10
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage> r6 = r6.message_list
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11[r4] = r6
            java.lang.String r6 = r10.wording
            r11[r5] = r6
            java.lang.String r6 = "GameChatRoom.ChatRoomStateView"
            java.lang.String r12 = "parseBroadcast, broadcast list size:%d, firstContent:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r12, r11)
            com.tencent.mm.plugin.game.autogen.chatroom.Color r6 = r10.color
            if (r6 == 0) goto L_0x0083
            java.lang.String r6 = r6.dark_color
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.Integer r6 = yw1.C53601h.m60134m(r6)
            if (r6 == 0) goto L_0x0083
            android.widget.TextView r11 = r2.f112443n
            int r6 = r6.intValue()
            r11.setTextColor(r6)
        L_0x0083:
            android.widget.TextView r6 = r2.f112443n
            r6.setVisibility(r4)
            android.widget.TextView r6 = r2.f112443n
            java.lang.String r11 = r10.wording
            r6.setText(r11)
            android.widget.TextView r6 = r2.f112443n
            r6.setTag(r3)
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r2.f112448s
            int r6 = r10.disappear_second
            int r6 = r6 * 1000
            long r10 = (long) r6
            r3.startTimer(r10, r7)
        L_0x009e:
            com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar r3 = r0.notification_bar
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0125
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Notification> r6 = r3.notification_list     // Catch:{ all -> 0x0122 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)     // Catch:{ all -> 0x0122 }
            if (r6 == 0) goto L_0x00ad
            goto L_0x0125
        L_0x00ad:
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Notification> r3 = r3.notification_list     // Catch:{ all -> 0x0122 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0122 }
            com.tencent.mm.plugin.game.autogen.chatroom.Notification r3 = (com.tencent.p014mm.plugin.game.autogen.chatroom.Notification) r3     // Catch:{ all -> 0x0122 }
            java.util.List<java.lang.Integer> r6 = r2.f112445p     // Catch:{ all -> 0x0122 }
            int r10 = r3.f112124id     // Catch:{ all -> 0x0122 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0122 }
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x0122 }
            boolean r6 = r6.contains(r10)     // Catch:{ all -> 0x0122 }
            if (r6 == 0) goto L_0x00d8
            java.lang.String r6 = "GameChatRoom.ChatRoomStateView"
            java.lang.String r7 = "duplicate notification id:%d"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0122 }
            int r3 = r3.f112124id     // Catch:{ all -> 0x0122 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0122 }
            r8[r4] = r3     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)     // Catch:{ all -> 0x0122 }
            monitor-exit(r2)
            goto L_0x0126
        L_0x00d8:
            com.tencent.mm.plugin.game.autogen.chatroom.Notification r6 = r2.f112446q     // Catch:{ all -> 0x0122 }
            if (r6 == 0) goto L_0x0113
            int r6 = r6.priority     // Catch:{ all -> 0x0122 }
            int r10 = r3.priority     // Catch:{ all -> 0x0122 }
            if (r6 <= r10) goto L_0x0113
            java.lang.String r6 = "GameChatRoom.ChatRoomStateView"
            java.lang.String r7 = "new noticationId[%d] priority[%d] < showing notificationId[%d] priority[%d]"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0122 }
            int r10 = r3.f112124id     // Catch:{ all -> 0x0122 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0122 }
            r8[r4] = r10     // Catch:{ all -> 0x0122 }
            int r3 = r3.priority     // Catch:{ all -> 0x0122 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0122 }
            r8[r5] = r3     // Catch:{ all -> 0x0122 }
            com.tencent.mm.plugin.game.autogen.chatroom.Notification r3 = r2.f112446q     // Catch:{ all -> 0x0122 }
            int r3 = r3.f112124id     // Catch:{ all -> 0x0122 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0122 }
            r8[r9] = r3     // Catch:{ all -> 0x0122 }
            r3 = 3
            com.tencent.mm.plugin.game.autogen.chatroom.Notification r9 = r2.f112446q     // Catch:{ all -> 0x0122 }
            int r9 = r9.priority     // Catch:{ all -> 0x0122 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0122 }
            r8[r3] = r9     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)     // Catch:{ all -> 0x0122 }
            monitor-exit(r2)
            goto L_0x0126
        L_0x0113:
            r2.mo65482b(r3)     // Catch:{ all -> 0x0122 }
            com.tencent.mm.sdk.platformtools.MTimerHandler r6 = r2.f112449t     // Catch:{ all -> 0x0122 }
            int r3 = r3.disappear_second     // Catch:{ all -> 0x0122 }
            int r3 = r3 * 1000
            long r9 = (long) r3     // Catch:{ all -> 0x0122 }
            r6.startTimer(r9, r7)     // Catch:{ all -> 0x0122 }
            monitor-exit(r2)
            goto L_0x0126
        L_0x0122:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0125:
            monitor-exit(r2)
        L_0x0126:
            com.tencent.mm.plugin.game.autogen.chatroom.SlotList r3 = r0.slot_list
            if (r3 == 0) goto L_0x01ca
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView r2 = r2.f112438f
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Slot> r3 = r3.slot_list
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$c r2 = r2.f112329F1
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0136
            monitor-exit(r2)
            goto L_0x01ca
        L_0x0136:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x01c7 }
            r6.<init>()     // Catch:{ all -> 0x01c7 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x01c7 }
        L_0x013f:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x0186
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.autogen.chatroom.Slot r8 = (com.tencent.p014mm.plugin.game.autogen.chatroom.Slot) r8     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser r8 = r8.online_user_status     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x013f
            long r9 = r8.status     // Catch:{ all -> 0x01c7 }
            r11 = 2
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x013f
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> r9 = r8.chat_user_data     // Catch:{ all -> 0x01c7 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)     // Catch:{ all -> 0x01c7 }
            if (r9 != 0) goto L_0x013f
            int r4 = r4 + 1
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> r9 = r8.chat_user_data     // Catch:{ all -> 0x01c7 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01c7 }
        L_0x0167:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x01c7 }
            if (r10 == 0) goto L_0x013f
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData r10 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData) r10     // Catch:{ all -> 0x01c7 }
            yw1.c$g r11 = new yw1.c$g     // Catch:{ all -> 0x01c7 }
            r11.<init>()     // Catch:{ all -> 0x01c7 }
            java.lang.String r12 = r8.status_icon     // Catch:{ all -> 0x01c7 }
            r11.f150626a = r12     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.autogen.chatroom.Color r12 = r8.icon_color     // Catch:{ all -> 0x01c7 }
            r11.f150627b = r12     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = r10.username     // Catch:{ all -> 0x01c7 }
            r6.put(r10, r11)     // Catch:{ all -> 0x01c7 }
            goto L_0x0167
        L_0x0186:
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView r7 = com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView.this     // Catch:{ all -> 0x01c7 }
            ax1.h r7 = r7.f112337N1     // Catch:{ all -> 0x01c7 }
            if (r7 == 0) goto L_0x0196
            r7.mo62213J(r6)     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView r6 = com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView.this     // Catch:{ all -> 0x01c7 }
            ax1.h r6 = r6.f112337N1     // Catch:{ all -> 0x01c7 }
            r6.mo62214W(r4)     // Catch:{ all -> 0x01c7 }
        L_0x0196:
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView r4 = com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView.this     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.autogen.chatroom.Slot r4 = r4.f112336M1     // Catch:{ all -> 0x01c7 }
            r3.add(r4)     // Catch:{ all -> 0x01c7 }
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ all -> 0x01c7 }
            r4.<init>()     // Catch:{ all -> 0x01c7 }
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Slot> r6 = r2.f112340d     // Catch:{ all -> 0x01c7 }
            r4.addAll(r6)     // Catch:{ all -> 0x01c7 }
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Slot> r6 = r2.f112340d     // Catch:{ all -> 0x01c7 }
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch:{ all -> 0x01c7 }
            r6.clear()     // Catch:{ all -> 0x01c7 }
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Slot> r6 = r2.f112340d     // Catch:{ all -> 0x01c7 }
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch:{ all -> 0x01c7 }
            r6.addAll(r3)     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$b r3 = new com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$b     // Catch:{ all -> 0x01c7 }
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView r6 = com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView.this     // Catch:{ all -> 0x01c7 }
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Slot> r7 = r2.f112340d     // Catch:{ all -> 0x01c7 }
            r3.<init>(r6, r4, r7)     // Catch:{ all -> 0x01c7 }
            androidx.recyclerview.widget.l$c r3 = androidx.recyclerview.widget.C54248l.m60949a(r3, r5)     // Catch:{ all -> 0x01c7 }
            r3.mo75046b(r2)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r2)
            goto L_0x01ca
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01ca:
            com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo r2 = r0.control_info
            r1.mo65412U7(r2)
            com.tencent.mm.plugin.game.autogen.chatroom.Popup r0 = r0.popup
            if (r0 == 0) goto L_0x0331
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r2 = r0.jump_info
            if (r2 != 0) goto L_0x01d9
            goto L_0x0331
        L_0x01d9:
            com.tencent.mm.plugin.game.chatroom.ui.a r2 = r1.f112206Z0
            if (r2 != 0) goto L_0x01e6
            com.tencent.mm.plugin.game.chatroom.ui.a r2 = new com.tencent.mm.plugin.game.chatroom.ui.a
            android.content.Context r3 = r1.f112213g
            r2.<init>(r3)
            r1.f112206Z0 = r2
        L_0x01e6:
            com.tencent.mm.plugin.game.chatroom.ui.a r2 = r1.f112206Z0
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r0 = r0.jump_info
            r2.getClass()
            java.lang.String r3 = "jumpInfo"
            gy3.C87412m.m108594g(r0, r3)
            java.util.Queue<com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo> r3 = r2.f112295e
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            r3.offer(r0)
            lu3.c<?> r0 = r2.f112296f
            if (r0 != 0) goto L_0x0331
            zt3.t r0 = zt3.C119157j.f356862d
            java.util.TimerTask r4 = r2.f112297g
            r5 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            r3 = r0
            zt3.j r3 = (zt3.C119157j) r3
            lu3.c r0 = r3.mo183872c(r4, r5, r7)
            r2.f112296f = r0
            goto L_0x0331
        L_0x0210:
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse
            if (r2 == 0) goto L_0x0331
            com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse r0 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse) r0
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage r2 = r1.f112173B
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r12 = r0.msg_pack_list
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg> r13 = r0.notice_msg_list
            long r14 = r0.last_received_seq
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r11 = r0.refresh_msg_pack_list
            com.tencent.mm.plugin.game.chatroom.channel.a r2 = r2.f112148j
            if (r2 == 0) goto L_0x0280
            java.util.List<com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment> r2 = r2.f112164j
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x022c:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0280
            java.lang.Object r6 = r2.next()
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment r6 = (com.tencent.p014mm.plugin.game.chatroom.channel.ChatChannelFragment) r6
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r7 = r6.f112126e
            if (r7 == 0) goto L_0x022c
            int r8 = r6.f112131j
            if (r8 != 0) goto L_0x0242
            r8 = 1
            goto L_0x0243
        L_0x0242:
            r8 = 0
        L_0x0243:
            if (r8 == 0) goto L_0x024f
            r6 = r7
            r7 = r12
            r8 = r13
            r9 = r14
            r16 = r11
            r6.mo65530F1(r7, r8, r9, r11)
            goto L_0x022c
        L_0x024f:
            r16 = r11
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            if (r12 == 0) goto L_0x0272
            java.util.Iterator r8 = r12.iterator()
        L_0x025c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0272
            java.lang.Object r9 = r8.next()
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r9 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r9
            int r10 = r9.channel_id
            int r11 = r6.f112131j
            if (r10 != r11) goto L_0x025c
            r7.add(r9)
            goto L_0x025c
        L_0x0272:
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r6 = r6.f112126e
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r9 = r14
            r11 = r16
            r6.mo65530F1(r7, r8, r9, r11)
            goto L_0x022c
        L_0x0280:
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r2 = r0.msg_pack_list
            java.lang.String r6 = r1.f112215h
            java.lang.String r7 = r1.f112221p
            long r8 = r0.last_received_seq
            java.util.HashMap<rx3.l<java.lang.String, java.lang.String>, java.lang.Long> r0 = ix1.C46326i0.f124817a
            if (r6 == 0) goto L_0x0331
            if (r2 == 0) goto L_0x0297
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0295
            goto L_0x0297
        L_0x0295:
            r0 = 0
            goto L_0x0298
        L_0x0297:
            r0 = 1
        L_0x0298:
            if (r0 == 0) goto L_0x029c
            goto L_0x0331
        L_0x029c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02a5:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x02e3
            java.lang.Object r10 = r2.next()
            r11 = r10
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r11 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r11
            long r12 = r11.seq
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x02dc
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r11 = r11.msg_options
            if (r11 == 0) goto L_0x02c6
            com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo r12 = r11.tickle_info
            if (r12 == 0) goto L_0x02c6
            boolean r12 = r12.is_tickle
            if (r12 != r5) goto L_0x02c6
            r12 = 1
            goto L_0x02c7
        L_0x02c6:
            r12 = 0
        L_0x02c7:
            if (r12 == 0) goto L_0x02dc
            if (r11 == 0) goto L_0x02d2
            com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo r11 = r11.tickle_info
            if (r11 == 0) goto L_0x02d2
            java.lang.String r11 = r11.to_username
            goto L_0x02d3
        L_0x02d2:
            r11 = r3
        L_0x02d3:
            if (r11 == 0) goto L_0x02d7
            r11 = 1
            goto L_0x02d8
        L_0x02d7:
            r11 = 0
        L_0x02d8:
            if (r11 == 0) goto L_0x02dc
            r11 = 1
            goto L_0x02dd
        L_0x02dc:
            r11 = 0
        L_0x02dd:
            if (r11 == 0) goto L_0x02a5
            r0.add(r10)
            goto L_0x02a5
        L_0x02e3:
            java.util.Iterator r0 = r0.iterator()
        L_0x02e7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0331
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r2 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r2
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r4 = r2.msg_options
            if (r4 == 0) goto L_0x02fe
            com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo r4 = r4.tickle_info
            if (r4 == 0) goto L_0x02fe
            java.lang.String r4 = r4.to_username
            goto L_0x02ff
        L_0x02fe:
            r4 = r3
        L_0x02ff:
            java.util.HashMap<rx3.l<java.lang.String, java.lang.String>, java.lang.Long> r5 = ix1.C46326i0.f124818b
            rx3.l r8 = new rx3.l
            gy3.C87412m.m108591d(r4)
            r8.<init>(r6, r4)
            long r9 = r2.seq
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r5.put(r8, r9)
            java.lang.String r5 = r2.from_username
            boolean r5 = gy3.C87412m.m108589b(r7, r5)
            if (r5 != 0) goto L_0x02e7
            boolean r5 = gy3.C87412m.m108589b(r7, r4)
            if (r5 == 0) goto L_0x02e7
            com.tencent.mm.autogen.events.TickleSomeoneMsgEvent r5 = new com.tencent.mm.autogen.events.TickleSomeoneMsgEvent
            r5.<init>()
            com.tencent.mm.autogen.events.TickleSomeoneMsgEvent$a r8 = r5.f107788d
            long r9 = r2.seq
            r8.f107790b = r9
            r8.f107789a = r4
            r5.publish()
            goto L_0x02e7
        L_0x0331:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.mo62190F2(yw1.c$c, pe3.a):void");
    }

    /* renamed from: H7 */
    public long mo65401H7() {
        return 13;
    }

    /* renamed from: I7 */
    public long mo65402I7() {
        return this.f112224r;
    }

    /* renamed from: J7 */
    public long mo65403J7() {
        return this.f112225s;
    }

    /* renamed from: K7 */
    public long mo65404K7() {
        return 1399;
    }

    /* renamed from: M7 */
    public void mo65405M7() {
        if (!this.f112190R0) {
            Log.m105924i("GameChatRoom.GameChatRoomUI", "destroy()");
            this.f112190R0 = true;
            C41721a aVar = this.f112206Z0;
            if (aVar != null) {
                C34379c<?> cVar = aVar.f112296f;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                aVar.f112296f = null;
            }
            C53591c.f150600b = false;
            C53601h.f150629a.clear();
            for (String gn02 : ((HashMap) C46793e.f125915a).keySet()) {
                ((C101213l) C86312j.m106911c(C101213l.class)).gn0(gn02);
            }
            ((HashMap) C46793e.f125915a).clear();
            ((HashMap) C46793e.f125916b).clear();
            C86709a0.m107524d().mo123460f(new C0391o(this.f112215h));
            C87771d.m109203b(this).mo122182f(this.mStatusBarHeightCallback);
            GameChatCommentFooter gameChatCommentFooter = this.f112178G;
            if (gameChatCommentFooter != null) {
                if (gameChatCommentFooter.f112478r != null) {
                    Log.m105924i("GameChatRoom.GameChatCommentFooter", "commentfooter release");
                    gameChatCommentFooter.f112478r.mo100200l();
                    gameChatCommentFooter.f112478r.mo100189b();
                }
                MMEditText mMEditText = gameChatCommentFooter.f112473j;
                if (mMEditText != null) {
                    mMEditText.destroy();
                }
                C72806l1 l1Var = gameChatCommentFooter.f112479s;
                if (l1Var != null) {
                    C72843y1 y1Var = (C72843y1) l1Var;
                    y1Var.f212284h = null;
                    y1Var.f212283g = null;
                    y1Var.mo100683b();
                }
            }
            C86709a0.m107524d().mo123470p(4391, this);
            C86709a0.m107524d().mo123470p(4993, this);
            C86709a0.m107524d().mo123470p(4897, this);
            C86709a0.m107524d().mo123470p(4596, this);
            C86709a0.m107524d().mo123470p(5072, this);
            C53603j jVar = C53603j.C53606c.f150641a;
            jVar.getClass();
            C86709a0.m107529k().f251779b.mo123470p(697, jVar.f150639b);
            ((HashMap) jVar.f150638a).clear();
            this.f112209c1.dead();
            this.f112210d1.dead();
            this.f112212f1.dead();
            this.f112214g1.dead();
            this.f112216h1.dead();
            unregisterReceiver(this.f112211e1);
            C46132c cVar2 = this.f112185N;
            if (cVar2 != null) {
                synchronized (cVar2) {
                    Log.m105924i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "stopKeepAlive");
                    cVar2.f124312f = false;
                    cVar2.f124310d = null;
                    C86709a0.m107524d().mo123470p(4302, cVar2);
                    if (cVar2.f124311e != null) {
                        C86709a0.m107524d().mo123458d(cVar2.f124311e);
                    }
                }
            }
            C46128a aVar2 = this.f112186P;
            if (aVar2 != null) {
                synchronized (aVar2) {
                    Log.m105924i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "stopKeepAlive");
                    aVar2.f124294f = false;
                    aVar2.f124292d = null;
                    C86709a0.m107524d().mo123470p(4316, aVar2);
                    if (aVar2.f124293e != null) {
                        C86709a0.m107524d().mo123458d(aVar2.f124293e);
                    }
                }
            }
            C41985r.m45634b();
            ((HashMap) C53591c.f150599a).remove(this.f112215h);
            C53591c.f150603e = false;
            if (!C53601h.m60128g()) {
                C53601h.m60124c(true);
            }
        }
    }

    /* renamed from: N7 */
    public final void mo65406N7(String str) {
        this.f112174C.setClickable(false);
        TextView textView = this.f112174C;
        if (Util.isNullOrNil(str)) {
            str = this.f112213g.getString(C0966R.string.bxn);
        }
        textView.setHint(str);
        this.f112174C.setHintTextColor(this.f112213g.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        this.f112175D.setClickable(false);
        this.f112175D.setIconColor(this.f112213g.getResources().getColor(C0966R.color.BW_100_Alpha_0_2));
        mo65410S7();
        mo65409R7();
        String str2 = this.f112215h;
        C53591c.C53592a e = C53601h.m60126e(str2);
        e.f150605b = true;
        ((HashMap) C53591c.f150599a).put(str2, e);
    }

    /* renamed from: O7 */
    public final void mo65407O7() {
        if (this.f112231x0 && this.f112233y0) {
            this.f112174C.setClickable(true);
            this.f112174C.setHint(Util.isNullOrNil(this.f112188Q0) ? this.f112213g.getString(C0966R.string.f87) : this.f112188Q0);
            this.f112174C.setHintTextColor(this.f112213g.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            this.f112175D.setClickable(true);
            this.f112175D.setIconColor(this.f112213g.getResources().getColor(C0966R.color.f2975b6));
            if (this.f112199W != null) {
                mo65414W7();
            } else {
                mo65410S7();
            }
            if (this.f112196U0 != null) {
                mo65413V7();
            } else {
                mo65409R7();
            }
            String str = this.f112215h;
            C53591c.C53592a e = C53601h.m60126e(str);
            e.f150605b = false;
            ((HashMap) C53591c.f150599a).put(str, e);
        } else if (this.f112233y0) {
            this.f112174C.setHint(Util.isNullOrNil(this.f112188Q0) ? this.f112213g.getString(C0966R.string.f87) : this.f112188Q0);
        }
        if (!this.f112174C.isClickable()) {
            mo65410S7();
            mo65409R7();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011d  */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo65408Q7(boolean r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter r0 = r11.f112178G
            if (r0 == 0) goto L_0x0009
            r1 = 8
            r0.setVisibility(r1)
        L_0x0009:
            boolean r0 = yw1.C53601h.m60128g()
            if (r0 == 0) goto L_0x0018
            if (r12 == 0) goto L_0x0018
            boolean r0 = yw1.C53601h.m60127f(r11)
            if (r0 == 0) goto L_0x0018
            goto L_0x0028
        L_0x0018:
            boolean r0 = yw1.C53601h.m60128g()
            if (r0 == 0) goto L_0x0025
            if (r12 == 0) goto L_0x0025
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomAffinityUI
            if (r12 == 0) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            yw1.C53601h.m60128g()
        L_0x0028:
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "back_to_room_list"
            r1 = 0
            boolean r12 = r12.getBooleanExtra(r0, r1)
            r0 = 1
            if (r12 == 0) goto L_0x0046
            android.content.Context r12 = r11.f112213g
            boolean r12 = com.tencent.p014mm.plugin.game.luggage.C41901e.m45449b(r12)
            if (r12 != 0) goto L_0x0046
            boolean r12 = yw1.C53601h.m60127f(r11)
            if (r12 != 0) goto L_0x0046
            r12 = 1
            goto L_0x0047
        L_0x0046:
            r12 = 0
        L_0x0047:
            if (r12 != 0) goto L_0x00be
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r2 = "need_exit_anim"
            boolean r12 = r12.getBooleanExtra(r2, r1)
            if (r12 == 0) goto L_0x0069
            boolean r12 = yw1.C53601h.m60127f(r11)
            if (r12 != 0) goto L_0x0069
            r11.finish()
            r12 = 2130772173(0x7f0100cd, float:1.7147457E38)
            r2 = 2130772092(0x7f01007c, float:1.7147293E38)
            r11.overridePendingTransition(r12, r2)
            goto L_0x012c
        L_0x0069:
            boolean r12 = yw1.C53601h.m60127f(r11)
            if (r12 == 0) goto L_0x00ba
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r12.<init>(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r12.setFlags(r2)
            java.lang.String r2 = "android.intent.category.HOME"
            r12.addCategory(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r12)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI"
            java.lang.String r6 = "finishPage"
            java.lang.String r7 = "(Z)Z"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r3 = r11
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = r2.mo10231a(r1)
            android.content.Intent r12 = (android.content.Intent) r12
            r11.startActivity(r12)
            java.lang.String r3 = "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI"
            java.lang.String r4 = "finishPage"
            java.lang.String r5 = "(Z)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r2 = r11
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            r11.finish()
            goto L_0x012c
        L_0x00ba:
            r11.finish()
            goto L_0x012c
        L_0x00be:
            r11.finish()
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r2 = "from_find_more_friend"
            r12.putExtra(r2, r1)
            long r2 = r11.f112224r
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            long r2 = r11.f112225s
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00dc
        L_0x00da:
            int r3 = (int) r2
            goto L_0x00dd
        L_0x00dc:
            r3 = 0
        L_0x00dd:
            java.lang.String r2 = "game_report_from_scene"
            r12.putExtra(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "start_time"
            r12.putExtra(r4, r2)
            java.lang.String r2 = "disable_game_page_swipe"
            r12.putExtra(r2, r0)
            java.lang.String r2 = "game_from_detail_back"
            r12.putExtra(r2, r0)
            long r2 = r11.f112224r
            java.lang.String r4 = "game_report_sourceid"
            r12.putExtra(r4, r2)
            long r2 = r11.f112225s
            java.lang.String r4 = "game_report_ssid"
            r12.putExtra(r4, r2)
            java.lang.String r2 = "default_game_tab_chat_type"
            r12.putExtra(r2, r0)
            boolean r2 = r11 instanceof com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomAffinityUI
            if (r2 == 0) goto L_0x011a
            boolean r2 = yw1.C53601h.m60127f(r11)
            if (r2 != 0) goto L_0x011a
            boolean r2 = yw1.C53601h.m60128g()
            if (r2 == 0) goto L_0x011a
            r2 = 1
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            if (r2 == 0) goto L_0x0122
            java.lang.String r2 = "game_from_chatroom_detail"
            r12.putExtra(r2, r0)
        L_0x0122:
            android.content.Context r2 = r11.f112213g
            r3 = 0
            java.lang.String r4 = "game"
            java.lang.String r5 = ".ui.GameCenterUI"
            ke3.C88144b.m109791i(r2, r4, r5, r12, r3)
        L_0x012c:
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomAffinityUI
            if (r12 == 0) goto L_0x013d
            boolean r12 = yw1.C53601h.m60127f(r11)
            if (r12 != 0) goto L_0x013d
            boolean r12 = yw1.C53601h.m60128g()
            if (r12 == 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r0 = 0
        L_0x013e:
            if (r0 == 0) goto L_0x0148
            com.tencent.mm.autogen.events.ShowMultiTaskEvent r12 = new com.tencent.mm.autogen.events.ShowMultiTaskEvent
            r12.<init>()
            r12.publish()
        L_0x0148:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.mo65408Q7(boolean):boolean");
    }

    /* renamed from: R7 */
    public final void mo65409R7() {
        View view = this.f112182K;
        int i = this.f112200W0 ? 4 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hidePanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hidePanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: S7 */
    public final void mo65410S7() {
        View view = this.f112180I;
        int i = this.f112198V0 ? 4 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hideRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "hideRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: T7 */
    public final void mo65411T7(String str, final boolean z) {
        if (!Util.isNullOrNil(str) && this.f112229w.getTag() == null) {
            this.f112229w.setTag(str);
            C52645f.m59023a().mo73595e((ImageView) null, str, (C52645f.C52650d) null, new C52645f.C52652e() {
                /* renamed from: a */
                public void mo65432a(View view, final Bitmap bitmap) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
                            public void run() {
                                float f;
                                float f2;
                                Bitmap bitmap = bitmap;
                                int height = GameChatRoomUI.this.f112229w.getHeight();
                                int width = GameChatRoomUI.this.f112229w.getWidth();
                                boolean z = z;
                                C101070j<String, Bitmap> jVar = C53601h.f150629a;
                                final Bitmap bitmap2 = null;
                                if (!(bitmap == null || height == 0 || width == 0)) {
                                    long currentTicks = Util.currentTicks();
                                    try {
                                        int height2 = bitmap.getHeight();
                                        int width2 = bitmap.getWidth();
                                        float f3 = 0.0f;
                                        if (width2 * height > width * height2) {
                                            f = ((float) height) / ((float) height2);
                                            f3 = (((float) width) - (((float) width2) * f)) * 0.5f;
                                            f2 = 0.0f;
                                        } else {
                                            f = ((float) width) / ((float) width2);
                                            f2 = (((float) height) - (((float) height2) * f)) * 0.5f;
                                        }
                                        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
                                        Matrix matrix = new Matrix();
                                        matrix.setScale(f, f);
                                        matrix.postTranslate((float) Math.round(f3), (float) Math.round(f2));
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.drawBitmap(bitmap, matrix, (Paint) null);
                                        canvas.setBitmap((Bitmap) null);
                                        if (z) {
                                            Bitmap fastblur = BitmapUtil.fastblur(createBitmap, 150);
                                            C53601h.m60122a(fastblur);
                                            Log.m105924i("GameChatRoom.GameChatUtils", String.format("getGameChatRoomBg, cost:%d", new Object[]{Long.valueOf(Util.ticksToNow(currentTicks))}));
                                            bitmap2 = fastblur;
                                        } else {
                                            C53601h.m60122a(createBitmap);
                                            bitmap2 = createBitmap;
                                        }
                                    } catch (Exception e) {
                                        Log.printErrStackTrace("GameChatRoom.GameChatUtils", e, "getGameChatRoomBg", new Object[0]);
                                    }
                                }
                                if (bitmap2 != null) {
                                    Log.m105925i("GameChatRoom.GameChatRoomUI", "resultBitmap height:%d, width:%d", Integer.valueOf(bitmap2.getHeight()), Integer.valueOf(bitmap2.getWidth()));
                                    ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
                                        public void run() {
                                            GameChatRoomUI.this.f112229w.setImageBitmap(bitmap2);
                                        }
                                    });
                                }
                            }
                        });
                    }
                }

                /* renamed from: b */
                public void mo65433b(String str, View view) {
                }
            });
        }
    }

    /* renamed from: U7 */
    public final void mo65412U7(RealtimeControlInfo realtimeControlInfo) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        LinkedList<BanAction> linkedList;
        BanAction banAction;
        ChatroomUserData chatroomUserData;
        C47127f fVar;
        String str3;
        final RealtimeControlInfo realtimeControlInfo2 = realtimeControlInfo;
        Class cls = C39639c.class;
        if (realtimeControlInfo2 != null && !Util.nullAsNil(this.f112201X).equals(realtimeControlInfo2.version)) {
            this.f112201X = realtimeControlInfo2.version;
            if (this.f112207a1) {
                this.f112230x.setVisibility(8);
            } else {
                this.f112230x.setVisibility(0);
            }
            String str4 = this.f112215h;
            C53591c.C53592a e = C53601h.m60126e(str4);
            e.f150604a = false;
            ((HashMap) C53591c.f150599a).put(str4, e);
            this.f112205Z = realtimeControlInfo2.disable_emoji;
            if (!Util.isNullOrNil((List) realtimeControlInfo2.update_user_data_list)) {
                Iterator<ChatroomUserData> it = realtimeControlInfo2.update_user_data_list.iterator();
                while (it.hasNext()) {
                    ((C39639c) C86312j.m106911c(cls)).mo62192LM(it.next());
                }
                if (!this.f112207a1) {
                    C47127f fVar2 = this.f112204Y0;
                    LinkedList<ChatroomUserData> linkedList2 = realtimeControlInfo2.update_user_data_list;
                    AdminInfo adminInfo = this.f112219n.admin_info;
                    fVar2.getClass();
                    C87412m.m108594g(linkedList2, "updateUserList");
                    String str5 = fVar2.f126629f;
                    if (str5 != null) {
                        C53895h.m60466d(C54208j0.m60899a(fVar2), (C66212f) fVar2.f126634n.getValue(), (C53934p0) null, new C47133i(linkedList2, fVar2, str5, adminInfo, (C15601d<? super C47133i>) null), 2, (Object) null);
                    }
                }
                C39641d X3 = ((C39639c) C86312j.m106911c(cls)).mo62193X3(this.f112221p);
                if (X3 != null) {
                    this.f112173B.setHostContact(X3);
                    this.f112178G.setCanAtAll(X3.mo62207u1());
                }
            }
            Log.m105919d("GameChatRoom.GameChatRoomUI", "user_chatroom_relation:%d", Integer.valueOf(realtimeControlInfo2.user_chatroom_relation));
            int i = realtimeControlInfo2.user_chatroom_relation;
            String str6 = null;
            if (i == 3) {
                if (!this.f112207a1 && (str3 = fVar.f126629f) != null) {
                    C53895h.m60466d(C54208j0.m60899a((fVar = this.f112204Y0)), (C66212f) fVar.f126634n.getValue(), (C53934p0) null, new C47132h(fVar, str3, (C15601d<? super C47132h>) null), 2, (Object) null);
                }
                if (!this.f112187Q) {
                    this.f112187Q = true;
                    C86709a0.m107524d().mo123460f(new C39869u(this.f112215h, 1, 0));
                    String string = Util.isNullOrNil(realtimeControlInfo2.kick_out_wording) ? this.f112213g.getString(C0966R.string.b3w) : realtimeControlInfo2.kick_out_wording;
                    KickOutCardInfo kickOutCardInfo = realtimeControlInfo2.kick_out_card_info;
                    final boolean z3 = kickOutCardInfo == null || Util.isNullOrNil(kickOutCardInfo.right_button_wording);
                    C77426q qVar = new C77426q(this.f112213g);
                    qVar.mo107595g(string);
                    qVar.mo107589a(false);
                    qVar.mo107602n(z3 ? this.f112213g.getString(C0966R.string.f8029zr) : realtimeControlInfo2.kick_out_card_info.right_button_wording);
                    qVar.mo107600l(new C47883u() {
                        /* renamed from: a */
                        public void mo353a(boolean z, String str) {
                            KickOutCardInfo kickOutCardInfo;
                            GameChatRoomUI.this.hideVKB();
                            GameChatRoomUI gameChatRoomUI = GameChatRoomUI.this;
                            int i = GameChatRoomUI.f112171i1;
                            gameChatRoomUI.mo65408Q7(true);
                            GameChatRoomUI gameChatRoomUI2 = GameChatRoomUI.this;
                            gameChatRoomUI2.f112187Q = false;
                            if (!z3 && (kickOutCardInfo = realtimeControlInfo2.kick_out_card_info) != null) {
                                C53601h.m60129h(gameChatRoomUI2.f112213g, kickOutCardInfo.right_button_jump_info);
                            }
                        }
                    });
                    if (!z3) {
                        qVar.mo107598j(this.f112213g.getString(C0966R.string.f8029zr));
                        qVar.mo107597i(new C47883u() {
                            /* renamed from: a */
                            public void mo353a(boolean z, String str) {
                                GameChatRoomUI.this.hideVKB();
                                GameChatRoomUI gameChatRoomUI = GameChatRoomUI.this;
                                int i = GameChatRoomUI.f112171i1;
                                gameChatRoomUI.mo65408Q7(true);
                                GameChatRoomUI.this.f112187Q = false;
                            }
                        });
                    }
                    qVar.mo107604p(true);
                    qVar.mo107603o();
                }
            } else if (i == 1) {
                JoinConfirmView joinConfirmView = this.f112179H;
                if (joinConfirmView != null) {
                    joinConfirmView.setVisibility(8);
                }
                ChatroomData chatroomData = this.f112219n;
                if (!(chatroomData == null || (chatroomUserData = this.f112220o) == null || this.f112207a1)) {
                    C47127f fVar3 = this.f112204Y0;
                    String str7 = chatroomData.chatroom_name;
                    AdminInfo adminInfo2 = chatroomData.admin_info;
                    boolean z4 = chatroomUserData.can_at_all;
                    String str8 = chatroomUserData.username;
                    fVar3.getClass();
                    C87412m.m108594g(str7, "chatroomName");
                    C87412m.m108594g(adminInfo2, "adminInfoOrg");
                    C87412m.m108594g(str8, "selfUserName");
                    fVar3.f126629f = str7;
                    LinkedList linkedList3 = new LinkedList(adminInfo2.admin_username_list);
                    linkedList3.add(adminInfo2.owner_username);
                    ArrayList arrayList = new ArrayList();
                    for (Object next : linkedList3) {
                        if (!C87412m.m108589b((String) next, str8)) {
                            arrayList.add(next);
                        }
                    }
                    AdminInfo adminInfo3 = new AdminInfo();
                    adminInfo3.admin_username_list = new LinkedList<>(arrayList);
                    adminInfo3.owner_username = adminInfo2.owner_username;
                    AdminInfo adminInfo4 = adminInfo3;
                    C53895h.m60466d(C54208j0.m60899a(fVar3), (C66212f) fVar3.f126634n.getValue(), (C53934p0) null, new C47135k(fVar3, adminInfo3, str8, z4, (C15601d<? super C47135k>) null), 2, (Object) null);
                    C47119a aVar = C47119a.f126606d;
                    aVar.mo72232c().put(str7, new C47136l(fVar3, str8, adminInfo2));
                    if (aVar.mo72231b().get(str7) == null) {
                        C86709a0.m107524d().mo123455a(5069, aVar);
                        C86709a0.m107524d().mo123455a(4713, aVar);
                        C86709a0.m107524d().mo123455a(4952, aVar);
                        aVar.mo72231b().put(str7, adminInfo4);
                        C86709a0.m107524d().mo123460f(new C39859l(str7));
                        C53895h.m60466d(C53930o0.m60554a(C53872d1.f151119c), (C66212f) null, (C53934p0) null, new C47125e(str7, adminInfo4, (C15601d<? super C47125e>) null), 3, (Object) null);
                    }
                }
            } else {
                GameChatCommentFooter gameChatCommentFooter = this.f112178G;
                if (!(gameChatCommentFooter == null || gameChatCommentFooter.getVisibility() == 8)) {
                    this.f112178G.setVisibility(8);
                }
                if (this.f112179H.getVisibility() != 0) {
                    this.f112179H.setVisibility(0);
                    ChatroomEnterInfo chatroomEnterInfo = this.f112194T0;
                    if (chatroomEnterInfo != null) {
                        JoinConfirmView joinConfirmView2 = this.f112179H;
                        ChatroomData chatroomData2 = this.f112219n;
                        ChatroomUserData chatroomUserData2 = this.f112220o;
                        Lbs lbs = this.f112223q;
                        JumpInfo jumpInfo = this.f112189R;
                        joinConfirmView2.getClass();
                        joinConfirmView2.removeAllViews();
                        JoinRoomExternalConfirmView joinRoomExternalConfirmView = new JoinRoomExternalConfirmView(joinConfirmView2.getContext(), (AttributeSet) null);
                        long j = joinConfirmView2.f19169e;
                        long j2 = joinConfirmView2.f19168d;
                        joinRoomExternalConfirmView.f112589e = j;
                        joinRoomExternalConfirmView.f112588d = j2;
                        joinConfirmView2.addView(joinRoomExternalConfirmView);
                        C40308d.f108375a.mo63004p(0, 1, 1, joinRoomExternalConfirmView.f112589e, joinRoomExternalConfirmView.f112588d, chatroomEnterInfo.report_str);
                        joinRoomExternalConfirmView.f112590f.f123138c.setText(chatroomEnterInfo.title);
                        TextView textView = joinRoomExternalConfirmView.f112590f.f123137b;
                        LinkedList<ContentBlock> linkedList4 = chatroomEnterInfo.content_list;
                        C87412m.m108593f(linkedList4, "it.content_list");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Iterator<ContentBlock> it4 = linkedList4.iterator();
                        int i2 = 0;
                        while (it4.hasNext()) {
                            ContentBlock next2 = it4.next();
                            if (!Util.isNullOrNil(next2.content)) {
                                Color color = next2.color;
                                Integer m = C53601h.m60134m(Util.nullAsNil(color != null ? color.dark_color : str6));
                                if (m == null) {
                                    m = Integer.valueOf(joinRoomExternalConfirmView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                                }
                                spannableStringBuilder.append(next2.content);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(m.intValue()), i2, next2.content.length() + i2, 33);
                                i2 = spannableStringBuilder.length();
                                str6 = null;
                            }
                        }
                        textView.setText(spannableStringBuilder);
                        UserEnterOption userEnterOption = chatroomEnterInfo.user_enter_option;
                        if (userEnterOption != null) {
                            C52645f.C52650d.C52651a aVar2 = new C52645f.C52650d.C52651a();
                            aVar2.f147024e = true;
                            C52645f.m59023a().mo73595e(joinRoomExternalConfirmView.f112590f.f123142g, userEnterOption.avatar, aVar2.mo73598a(), (C52645f.C52652e) null);
                            joinRoomExternalConfirmView.f112590f.f123141f.setText(userEnterOption.option_desc);
                        }
                        joinRoomExternalConfirmView.f112590f.f123140e.setText(chatroomEnterInfo.buttom_desc);
                        joinRoomExternalConfirmView.f112590f.f123140e.setOnClickListener(new C41834r0(chatroomData2, chatroomUserData2, joinRoomExternalConfirmView, chatroomEnterInfo, lbs, jumpInfo));
                        BackgroundInfo backgroundInfo = chatroomEnterInfo.background_info;
                        if (backgroundInfo != null) {
                            Drawable background = joinRoomExternalConfirmView.f112590f.f123139d.getBackground();
                            C87412m.m108592e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                            GradientDrawable gradientDrawable = (GradientDrawable) background;
                            Color color2 = backgroundInfo.color;
                            gradientDrawable.setColor(C53601h.m60133l(color2 != null ? color2.dark_color : null, C0966R.color.f2953a_));
                            joinRoomExternalConfirmView.postDelayed(new C41837s0(backgroundInfo, joinRoomExternalConfirmView), 200);
                        }
                    } else {
                        JoinConfirmView joinConfirmView3 = this.f112179H;
                        String str9 = this.f112221p;
                        ChatroomData chatroomData3 = this.f112219n;
                        ChatroomUserData chatroomUserData3 = this.f112220o;
                        Lbs lbs2 = this.f112223q;
                        JumpInfo jumpInfo2 = this.f112189R;
                        ChatroomExternInfo chatroomExternInfo = this.f112195U;
                        joinConfirmView3.removeAllViews();
                        JoinChatRoomConfirmView joinChatRoomConfirmView = new JoinChatRoomConfirmView(joinConfirmView3.getContext());
                        long j3 = joinConfirmView3.f19169e;
                        long j4 = joinConfirmView3.f19168d;
                        joinChatRoomConfirmView.f112579f = j3;
                        joinChatRoomConfirmView.f112578e = j4;
                        joinConfirmView3.addView(joinChatRoomConfirmView);
                        if (!(chatroomData3 == null || Util.isNullOrNil(str9) || chatroomUserData3 == null)) {
                            joinChatRoomConfirmView.setVisibility(0);
                            LinkedList<RestrictRule> linkedList5 = chatroomData3.rule_list;
                            if (!Util.isNullOrNil((List) linkedList5)) {
                                joinChatRoomConfirmView.f112580g.setVisibility(0);
                                joinChatRoomConfirmView.post(new JoinChatRoomConfirmView.C41777a(linkedList5.size() > 0 ? joinChatRoomConfirmView.mo65561b(linkedList5.get(0)) : null, linkedList5.size() > 1 ? joinChatRoomConfirmView.mo65561b(linkedList5.get(1)) : null));
                            } else {
                                joinChatRoomConfirmView.f112580g.setVisibility(8);
                            }
                            C78039a.m94189a(joinChatRoomConfirmView.f112583j, str9);
                            GradientDrawable gradientDrawable2 = (GradientDrawable) joinChatRoomConfirmView.f112582i.getBackground();
                            if (chatroomData3.can_join) {
                                if (!chatroomUserData3.is_authorized && jumpInfo2 != null && !Util.isNullOrNil(jumpInfo2.jump_url)) {
                                    C41985r.m45637e(C41993t.class, jumpInfo2.jump_url, (C108769b.C46571a) null);
                                }
                                C40308d.f108375a.mo63003o(0, 1, 1, joinChatRoomConfirmView.f112579f, joinChatRoomConfirmView.f112578e);
                                joinChatRoomConfirmView.f112584n.setText(C0966R.string.fxp);
                                gradientDrawable2.setColor(joinChatRoomConfirmView.f112577d.getResources().getColor(C0966R.color.f2968ay));
                                joinChatRoomConfirmView.f112582i.setTextColor(joinChatRoomConfirmView.f112577d.getResources().getColor(C0966R.color.BW_BG_100));
                                joinChatRoomConfirmView.f112582i.setClickable(true);
                                joinChatRoomConfirmView.f112582i.setOnClickListener(new C41832q0(joinChatRoomConfirmView, chatroomUserData3, chatroomData3, lbs2, jumpInfo2));
                            } else {
                                C40308d.f108375a.mo63003o(0, 1, 2, joinChatRoomConfirmView.f112579f, joinChatRoomConfirmView.f112578e);
                                if (chatroomExternInfo == null || Util.isNullOrNil(chatroomExternInfo.cannot_join_reason)) {
                                    joinChatRoomConfirmView.f112584n.setText(C0966R.string.fxq);
                                } else {
                                    joinChatRoomConfirmView.f112584n.setText(chatroomExternInfo.cannot_join_reason);
                                }
                                gradientDrawable2.setColor(joinChatRoomConfirmView.f112577d.getResources().getColor(C0966R.color.f3494v7));
                                joinChatRoomConfirmView.f112582i.setTextColor(joinChatRoomConfirmView.f112577d.getResources().getColor(C0966R.color.BW_100_Alpha_0_2));
                                joinChatRoomConfirmView.f112582i.setClickable(false);
                            }
                        }
                    }
                }
                this.f112230x.setVisibility(8);
                String str10 = this.f112215h;
                C53591c.C53592a e2 = C53601h.m60126e(str10);
                e2.f150604a = true;
                ((HashMap) C53591c.f150599a).put(str10, e2);
            }
            PremadeCardInfo premadeCardInfo = realtimeControlInfo2.premade_card_info;
            if (!(premadeCardInfo == null || premadeCardInfo.team_icon_info == null)) {
                mo65414W7();
                this.f112181J.setText(realtimeControlInfo2.premade_card_info.team_icon_info.desc);
                PremadeCardInfo premadeCardInfo2 = realtimeControlInfo2.premade_card_info;
                this.f112199W = premadeCardInfo2.team_icon_info.jump_info;
                String str11 = premadeCardInfo2.premade_info;
                this.f112197V = str11;
                ChatRoomStateView chatRoomStateView = this.f112172A;
                if (chatRoomStateView != null) {
                    chatRoomStateView.setPremadeCardInfo(str11);
                }
                ChatChannelPage chatChannelPage = this.f112173B;
                if (chatChannelPage != null) {
                    chatChannelPage.setPremadeCardInfo(this.f112197V);
                }
            }
            ChatroomBanAction chatroomBanAction = realtimeControlInfo2.chatroom_ban_action;
            if (chatroomBanAction == null || (banAction = chatroomBanAction.ban_action) == null || banAction.type != 1) {
                str = "";
                z = false;
            } else {
                str = banAction.desc;
                z = true;
            }
            UserBanAction userBanAction = realtimeControlInfo2.user_ban_action;
            if (userBanAction == null || (linkedList = userBanAction.ban_action_list) == null) {
                str2 = str;
                z2 = false;
            } else {
                Iterator<BanAction> it5 = linkedList.iterator();
                str2 = str;
                z2 = false;
                while (it5.hasNext()) {
                    BanAction next3 = it5.next();
                    if (next3.type == 3) {
                        if (!z) {
                            str2 = next3.desc;
                        }
                        z2 = true;
                    }
                }
            }
            if (z || z2) {
                this.f112231x0 = false;
                mo65406N7(str2);
            } else {
                this.f112231x0 = true;
                mo65407O7();
            }
            this.f112178G.setShowCustom(realtimeControlInfo2.enable_custom_emoji);
        }
    }

    /* renamed from: V7 */
    public final void mo65413V7() {
        View view = this.f112182K;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showPanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showPanelEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f112200W0 = true;
    }

    /* renamed from: W7 */
    public final void mo65414W7() {
        View view = this.f112180I;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "showRightBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f112198V0 = true;
    }

    /* renamed from: X7 */
    public final C53591c.C53595d mo65415X7(int i, int i2, MsgOptions msgOptions, MsgContent msgContent, boolean z, boolean z2, String str) {
        C41684a aVar;
        MsgOptions msgOptions2 = msgOptions;
        MsgContent msgContent2 = msgContent;
        String str2 = str;
        C53591c.C53595d dVar = str2 != null ? (C53591c.C53595d) ((HashMap) C46793e.f125916b).get(str2) : null;
        if (dVar == null) {
            dVar = new C53591c.C53595d();
        }
        dVar.f150614a = this.f112221p;
        dVar.f150615b = this.f112215h;
        dVar.f150616c = i;
        dVar.f150618e = i2;
        if (msgOptions2 != null) {
            dVar.f150619f = msgOptions2;
            if (!Util.isNullOrNil((List) msgOptions2.at_list) && dVar.f150619f.at_list.contains(getString(C0966R.string.a_f))) {
                String str3 = this.f112215h;
                C87412m.m108594g(str3, "chatroomName");
                long currentTimeMillis = System.currentTimeMillis();
                C48485r rVar = (C48485r) C86312j.m106911c(C48485r.class);
                String str4 = str3 + "atAllTime";
                byte[] bArr = new byte[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((int) ((currentTimeMillis >> (i3 * 8)) & 255));
                }
                rVar.vn0(str4, bArr);
            }
        }
        if (msgContent2 != null) {
            dVar.f150620g = msgContent2;
        }
        C39865r rVar2 = new C39865r(dVar);
        if (z) {
            C86709a0.m107524d().mo123460f(rVar2);
        }
        if (z2 && (aVar = this.f112173B.f112148j) != null) {
            Iterator it = ((ArrayList) aVar.f112164j).iterator();
            while (it.hasNext()) {
                ChatChannelFragment chatChannelFragment = (ChatChannelFragment) it.next();
                GameChatListView gameChatListView = chatChannelFragment.f112126e;
                if (gameChatListView != null && chatChannelFragment.f112132n) {
                    ((ConcurrentHashMap) gameChatListView.f112506C1.f112560h).put(dVar.f150617d, dVar);
                    ChatroomMsgPack chatroomMsgPack = new ChatroomMsgPack();
                    chatroomMsgPack.msg_type = dVar.f150616c;
                    chatroomMsgPack.from_username = dVar.f150614a;
                    chatroomMsgPack.cli_msg_id = dVar.f150617d;
                    chatroomMsgPack.send_time = System.currentTimeMillis() / 1000;
                    chatroomMsgPack.msg_content = dVar.f150620g;
                    MsgOptions msgOptions3 = dVar.f150619f;
                    if (msgOptions3 == null) {
                        msgOptions3 = new MsgOptions();
                    }
                    int i4 = gameChatListView.f112510G1;
                    C101070j<String, Bitmap> jVar = C53601h.f150629a;
                    long j = (long) ((i4 << 4) | 1);
                    byte[] bArr2 = new byte[8];
                    for (int i5 = 0; i5 < 8; i5++) {
                        bArr2[i5] = (byte) ((int) (j >> (i5 * 8)));
                    }
                    byte[] bArr3 = new byte[8];
                    for (int i6 = 0; i6 < 8; i6++) {
                        bArr3[i6] = bArr2[7 - i6];
                    }
                    msgOptions3.cli_local_data = new C89349b(bArr3, 0, 8);
                    chatroomMsgPack.msg_options = msgOptions3;
                    chatroomMsgPack.channel_id = dVar.f150618e;
                    gameChatListView.f112510G1++;
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(chatroomMsgPack);
                    gameChatListView.mo65529E1(linkedList, 5, (List<ChatroomMsgPack>) null);
                }
            }
        }
        return dVar;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        this.f112178G.mo65492f(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.avc;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 11) {
            C86709a0.m107524d().mo123460f(new C39848c(this.f112215h, this.f112223q, this.f112192S0));
        } else if (i == 12) {
            JumpInfo jumpInfo = this.f112191S;
            if (jumpInfo != null && !Util.isNullOrNil(jumpInfo.jump_url)) {
                C41985r.m45637e(C41993t.class, this.f112191S.jump_url, (C108769b.C46571a) null);
            }
        } else if (i == 13) {
            JumpInfo jumpInfo2 = this.f112193T;
            if (jumpInfo2 != null && !Util.isNullOrNil(jumpInfo2.jump_url)) {
                C41985r.m45637e(C41993t.class, this.f112193T.jump_url, (C108769b.C46571a) null);
            }
        } else if (i == 14) {
            Map<String, C53591c.C53596e> map = C46793e.f125915a;
            if (intent != null) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                    Log.m105920e("MicroMsg.SendImgUtil", "send image list is null or nil");
                } else if (stringArrayListExtra.size() == 0) {
                    Log.m105920e("MicroMsg.SendImgUtil", "filelist is empty!");
                } else {
                    if (!intent.getBooleanExtra("CropImage_Compress_Img", true)) {
                        C115669n.INSTANCE.mo160131h(11095, 0);
                    } else {
                        C115669n.INSTANCE.mo160131h(11095, 1);
                    }
                    int intExtra = intent.getIntExtra("CropImage_rotateCount", 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null || next.equals("") || !C86013q1.m106450k(next)) {
                            Log.m105918d("MicroMsg.SendImgUtil", " doSendImage : filePath is null or empty");
                        } else {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.size() > 0) {
                        ((C119157j) C119157j.f356862d).mo183875f(new e$$a(arrayList, intExtra));
                    }
                }
            }
        } else if (i == 15) {
            Log.m105918d("GameChatRoom.GameChatRoomUI", "RECEIVE OPEN_H5_FINISHED_REQUEST_CODE");
            C41721a aVar = this.f112206Z0;
            if (aVar != null) {
                aVar.f112294d = System.currentTimeMillis();
                aVar.f112292b = false;
            }
        }
    }

    public void onBackPressed() {
        boolean z;
        GameChatCommentFooter gameChatCommentFooter = this.f112178G;
        if (gameChatCommentFooter.getVisibility() == 0) {
            gameChatCommentFooter.setVisibility(8);
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo65408Q7(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x04d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = 1
            r15.customfixStatusbar(r1)
            super.onCreate(r16)
            r2 = 0
            androidx.lifecycle.k0 r3 = androidx.lifecycle.C39629l0.m42233a(r15, r2)
            java.lang.Class<mx1.f> r4 = mx1.C47127f.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            mx1.f r3 = (mx1.C47127f) r3
            r0.f112204Y0 = r3
            q90.j<java.lang.String, android.graphics.Bitmap> r3 = yw1.C53601h.f150629a
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomAffinityUI
            if (r3 != 0) goto L_0x0020
            yw1.C53601h.m60124c(r1)
        L_0x0020:
            boolean r3 = yw1.C53591c.f150600b
            r4 = -1
            java.lang.String r6 = "target_seq"
            java.lang.String r7 = "target_channel_id"
            java.lang.String r8 = "game_report_ssid"
            java.lang.String r9 = "game_report_sourceid"
            r10 = -1
            r11 = 0
            if (r3 != 0) goto L_0x0050
            yw1.C53591c.f150600b = r1
            android.content.Intent r3 = r15.getIntent()
            r3.putExtra(r9, r11)
            android.content.Intent r3 = r15.getIntent()
            r12 = 9999(0x270f, double:4.94E-320)
            r3.putExtra(r8, r12)
            android.content.Intent r3 = r15.getIntent()
            r3.putExtra(r7, r10)
            android.content.Intent r3 = r15.getIntent()
            r3.putExtra(r6, r4)
        L_0x0050:
            yw1.C53591c.f150603e = r1
            r3 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.view.View r3 = r15.findViewById(r3)
            r0.f112208b1 = r3
            if (r3 == 0) goto L_0x0082
            boolean r3 = in3.C87771d.f254121g
            if (r3 != 0) goto L_0x0062
            goto L_0x0082
        L_0x0062:
            in3.d r3 = in3.C87771d.m109203b(r15)
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$4 r12 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$4
            r12.<init>()
            r0.mStatusBarHeightCallback = r12
            r3.mo122180d(r12)
            android.view.Window r3 = r15.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.requestApplyInsets()
            android.view.Window r3 = r15.getWindow()
            in3.C87773e.m109211d(r3)
        L_0x0082:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            boolean r12 = yw1.C53601h.m60128g()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r3[r11] = r12
            java.lang.String r12 = "GameChatRoom.GameChatRoomUI"
            java.lang.String r13 = "onCreate, isMultiTaskOpened:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r3)
            android.view.Window r3 = r15.getWindow()
            android.view.View r3 = r3.getDecorView()
            r13 = 1280(0x500, float:1.794E-42)
            r3.setSystemUiVisibility(r13)
            androidx.appcompat.app.AppCompatActivity r3 = r15.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r13 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r3 = r3.getColor(r13)
            r15.setActionbarColor(r3)
            androidx.appcompat.app.ActionBar r3 = r15.getSupportActionBar()
            r3.mo91104o()
            android.content.res.Resources r3 = r15.getResources()
            r13 = 2131100166(0x7f060206, float:1.7812706E38)
            int r3 = r3.getColor(r13)
            r15.setNavigationbarColor(r3)
            r0.f112213g = r0
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r13 = "chat_room_name"
            java.lang.String r3 = r3.getStringExtra(r13)
            r0.f112215h = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00e6
            java.lang.String r1 = "chat room name is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            r15.mo65408Q7(r11)
            return
        L_0x00e6:
            r3 = 2131312646(0x7f094006, float:1.8243666E38)
            android.view.View r3 = r15.findViewById(r3)
            r0.f112228v = r3
            in3.b r3 = new in3.b
            r3.<init>(r15)
            android.view.View r13 = r0.f112228v
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            android.widget.RelativeLayout$LayoutParams r14 = new android.widget.RelativeLayout$LayoutParams
            r14.<init>(r10, r10)
            r13.addView(r3, r14)
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r15)
            r14 = 2131495794(0x7f0c0b72, float:1.8615135E38)
            android.view.View r13 = r13.inflate(r14, r3, r11)
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            r14.<init>(r10, r10)
            r3.addView(r13, r14)
            android.content.Intent r3 = r15.getIntent()
            r13 = 0
            long r2 = r3.getLongExtra(r9, r13)
            r0.f112224r = r2
            android.content.Intent r2 = r15.getIntent()
            long r2 = r2.getLongExtra(r8, r13)
            r0.f112225s = r2
            android.content.Context r2 = r0.f112213g
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            int r2 = r2.getIntExtra(r7, r10)
            r0.f112226t = r2
            android.content.Context r2 = r0.f112213g
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            long r2 = r2.getLongExtra(r6, r4)
            r0.f112227u = r2
            android.content.Context r2 = r0.f112213g
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "is_real_time_room"
            boolean r2 = r2.getBooleanExtra(r3, r11)
            r0.f112207a1 = r2
            android.content.Context r2 = r0.f112213g
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "chatroom_report_extinfo"
            java.lang.String r2 = r2.getStringExtra(r3)
            com.tencent.p014mm.game.report.C40308d.f108379e = r2
            com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo r2 = new com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo
            r2.<init>()
            r0.f112192S0 = r2
            long r3 = r0.f112224r
            r2.sourceid = r3
            long r3 = r0.f112225s
            r2.ssid = r3
            java.lang.String r2 = r0.f112215h
            com.tencent.p014mm.game.report.C40308d.f108376b = r2
            java.lang.String r3 = ""
            com.tencent.p014mm.game.report.C40308d.f108377c = r3
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r11] = r2
            java.lang.String r2 = "chat_room_name:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r3)
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r3 = "chat_room_icon"
            java.lang.String r2 = r2.getStringExtra(r3)
            r0.f112217i = r2
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r3 = "chat_room_auto_join"
            boolean r2 = r2.getBooleanExtra(r3, r11)
            r0.f112218j = r2
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r3 = "chat_room_lbs"
            byte[] r2 = r2.getByteArrayExtra(r3)
            if (r2 == 0) goto L_0x01b8
            int r3 = r2.length
            if (r3 <= 0) goto L_0x01b8
            com.tencent.mm.plugin.game.autogen.chatroom.Lbs r3 = new com.tencent.mm.plugin.game.autogen.chatroom.Lbs
            r3.<init>()
            r0.f112223q = r3
            r3.parseFrom(r2)     // Catch:{ IOException -> 0x01b7 }
            goto L_0x01b8
        L_0x01b7:
        L_0x01b8:
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 4391(0x1127, float:6.153E-42)
            r2.mo123455a(r3, r15)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 4993(0x1381, float:6.997E-42)
            r2.mo123455a(r3, r15)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 4897(0x1321, float:6.862E-42)
            r2.mo123455a(r3, r15)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 4596(0x11f4, float:6.44E-42)
            r2.mo123455a(r3, r15)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 5072(0x13d0, float:7.107E-42)
            r2.mo123455a(r3, r15)
            yw1.j r2 = yw1.C53603j.C53606c.f150641a
            r2.getClass()
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r4 = 697(0x2b9, float:9.77E-43)
            ob0.n r2 = r2.f150639b
            r3.mo123455a(r4, r2)
            com.tencent.mm.sdk.event.IListener r2 = r0.f112209c1
            r2.alive()
            com.tencent.mm.sdk.event.IListener r2 = r0.f112210d1
            r2.alive()
            com.tencent.mm.sdk.event.IListener r2 = r0.f112212f1
            r2.alive()
            com.tencent.mm.sdk.event.IListener r2 = r0.f112214g1
            r2.alive()
            com.tencent.mm.sdk.event.IListener r2 = r0.f112216h1
            r2.alive()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM"
            r2.addAction(r3)
            android.content.BroadcastReceiver r3 = r0.f112211e1
            java.lang.String r4 = com.tencent.p014mm.plugin.game.C4443h.f19181a
            r5 = 0
            r15.registerReceiver(r3, r2, r4, r5)
            r2 = 2131298173(0x7f09077d, float:1.8214312E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f112229w = r2
            q90.j<java.lang.String, android.graphics.Bitmap> r3 = yw1.C53601h.f150629a
            long r3 = java.lang.System.currentTimeMillis()
            r6 = 2131233195(0x7f0809ab, float:1.808252E38)
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r6)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r7[r11] = r3
            java.lang.String r3 = "GameChatRoom.GameChatUtils"
            java.lang.String r4 = "getDefaultChatRoomBg end, cost:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r7)
            if (r6 != 0) goto L_0x0251
            goto L_0x025c
        L_0x0251:
            android.graphics.Bitmap$Config r3 = r6.getConfig()
            android.graphics.Bitmap r6 = r6.copy(r3, r1)
            yw1.C53601h.m60122a(r6)
        L_0x025c:
            r2.setImageBitmap(r6)
            r2 = 2131299009(0x7f090ac1, float:1.8216007E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$6 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$6
            r3.<init>()
            r2.setOnClickListener(r3)
            r2 = 2131299010(0x7f090ac2, float:1.821601E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f112230x = r2
            boolean r3 = r0.f112207a1
            if (r3 == 0) goto L_0x0284
            r3 = 8
            r2.setVisibility(r3)
        L_0x0284:
            android.widget.ImageView r2 = r0.f112230x
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$7 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$7
            r3.<init>()
            r2.setOnClickListener(r3)
            r2 = 2131299025(0x7f090ad1, float:1.821604E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f112232y = r2
            r3 = 2131165203(0x7f070013, float:1.7944616E38)
            com.tencent.p014mm.p136ui.C44706b.m49451b(r2, r3)
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r3 = "chat_room_title"
            java.lang.String r2 = r2.getStringExtra(r3)
            android.widget.TextView r3 = r0.f112232y
            r3.setText(r2)
            r2 = 2131299024(0x7f090ad0, float:1.8216038E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f112234z = r2
            r3 = 2131165652(0x7f0701d4, float:1.7945527E38)
            com.tencent.p014mm.p136ui.C44706b.m49451b(r2, r3)
            r2 = 2131299023(0x7f090acf, float:1.8216036E38)
            android.view.View r2 = r15.findViewById(r2)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView r2 = (com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomStateView) r2
            r0.f112172A = r2
            android.view.View r3 = r0.f112228v
            r2.f112437e = r3
            r4 = 2131299007(0x7f090abf, float:1.8216003E38)
            android.view.View r4 = r3.findViewById(r4)
            r2.f112439g = r4
            r4 = 2131310435(0x7f093763, float:1.8239182E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.f112440h = r4
            r4 = 2131310432(0x7f093760, float:1.8239176E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f112441i = r4
            r4 = 2131310443(0x7f09376b, float:1.8239198E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.f112442j = r3
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView r2 = r0.f112172A
            java.lang.String r3 = r0.f112215h
            android.widget.TextView r4 = r0.f112234z
            r2.f112444o = r3
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView r6 = r2.f112438f
            r6.setChatRoomName(r3)
            r2.f112443n = r4
            r2 = 2131299999(0x7f090e9f, float:1.8218015E38)
            android.view.View r2 = r15.findViewById(r2)
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter r2 = (com.tencent.p014mm.plugin.game.chatroom.view.GameChatCommentFooter) r2
            r0.f112178G = r2
            r2 = 2131310721(0x7f093881, float:1.8239762E38)
            android.view.View r2 = r15.findViewById(r2)
            org.libpag.PAGView r2 = (org.libpag.PAGView) r2
            r0.f112202X0 = r2
            r2 = 2131298973(0x7f090a9d, float:1.8215934E38)
            android.view.View r2 = r15.findViewById(r2)
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage r2 = (com.tencent.p014mm.plugin.game.chatroom.channel.ChatChannelPage) r2
            r0.f112173B = r2
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$8 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$8
            r3.<init>()
            r2.setUICallback(r3)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView r2 = r0.f112172A
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$9 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$9
            r3.<init>()
            r2.setStateChangeListener(r3)
            r2 = 2131298221(0x7f0907ad, float:1.821441E38)
            android.view.View r2 = r15.findViewById(r2)
            r0.f112176E = r2
            r2 = 2131306894(0x7f09298e, float:1.8232E38)
            android.view.View r2 = r15.findViewById(r2)
            r0.f112177F = r2
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$10 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$10
            r3.<init>()
            r2.setOnClickListener(r3)
            r2 = 2131299981(0x7f090e8d, float:1.8217979E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f112174C = r2
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$11 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$11
            r3.<init>()
            r2.setOnClickListener(r3)
            android.widget.TextView r2 = r0.f112174C
            r2.setClickable(r11)
            r2 = 2131301410(0x7f091422, float:1.8220877E38)
            android.view.View r2 = r15.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r0.f112175D = r2
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$12 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$12
            r3.<init>()
            r2.setOnClickListener(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f112175D
            r2.setClickable(r11)
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter r2 = r0.f112178G
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$15 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$15
            r3.<init>()
            r2.setFooterActionListener(r3)
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter r2 = r0.f112178G
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$16 r3 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$16
            r3.<init>()
            com.tencent.mm.ui.widget.MMEditText r2 = r2.f112473j
            if (r2 == 0) goto L_0x039c
            r2.setBackListener(r3)
        L_0x039c:
            r2 = 2131306828(0x7f09294c, float:1.8231866E38)
            android.view.View r2 = r15.findViewById(r2)
            com.tencent.mm.plugin.game.chatroom.view.JoinConfirmView r2 = (com.tencent.p014mm.plugin.game.chatroom.view.JoinConfirmView) r2
            r0.f112179H = r2
            r2 = 2131312492(0x7f093f6c, float:1.8243354E38)
            android.view.View r2 = r15.findViewById(r2)
            r0.f112180I = r2
            r2 = 2131312493(0x7f093f6d, float:1.8243356E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f112181J = r2
            r2 = 2131310738(0x7f093892, float:1.8239797E38)
            android.view.View r2 = r15.findViewById(r2)
            r0.f112182K = r2
            r2 = 2131310739(0x7f093893, float:1.8239799E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f112183L = r2
            r2 = 2131310740(0x7f093894, float:1.82398E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f112184M = r2
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage r2 = r0.f112173B
            android.view.View r3 = r0.f112228v
            android.view.View r4 = r2.f112145g
            if (r4 != 0) goto L_0x03ef
            r2.f112145g = r3
            r4 = 2131314820(0x7f094884, float:1.8248076E38)
            android.view.View r3 = r3.findViewById(r4)
            com.google.android.material.tabs.TabLayout r3 = (com.google.android.material.tabs.TabLayout) r3
            r2.f112146h = r3
        L_0x03ef:
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage r2 = r0.f112173B
            java.lang.String r3 = r0.f112215h
            r2.f112152q = r3
            int r2 = r2.f112156u
            if (r2 == r10) goto L_0x03fb
            r2 = 1
            goto L_0x03fc
        L_0x03fb:
            r2 = 0
        L_0x03fc:
            if (r2 == 0) goto L_0x03ff
            goto L_0x0438
        L_0x03ff:
            com.tencent.mm.autogen.events.GamePBCacheEvent r2 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r2.<init>()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r4 = r2.f107561d
            r4.f107562a = r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "cache_game_chat_msg#"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = "#channel"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r4.f107563b = r3
            r2.publish()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r2 = r2.f107561d
            byte[] r2 = r2.f107564c
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r3 != 0) goto L_0x0438
            com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo r3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo     // Catch:{ IOException -> 0x0437 }
            r3.<init>()     // Catch:{ IOException -> 0x0437 }
            r3.parseFrom(r2)     // Catch:{ IOException -> 0x0437 }
            r2 = r3
            goto L_0x0439
        L_0x0437:
        L_0x0438:
            r2 = r5
        L_0x0439:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            if (r2 == 0) goto L_0x043f
            r4 = 1
            goto L_0x0440
        L_0x043f:
            r4 = 0
        L_0x0440:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r11] = r4
            java.lang.String r4 = "last cache channelInfo exist:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r3)
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage r3 = r0.f112173B
            java.lang.String r4 = r0.f112215h
            r3.mo65388g(r4, r2, r1)
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter r1 = r0.f112178G
            boolean r2 = r0.f112207a1
            r1.setIsRealTimeRoom(r2)
            hx1.c r1 = new hx1.c
            yw1.c$c r2 = yw1.C53591c.C53594c.KEEP_ALIVE_TYPE_RECEIVE_CHATROOM_MSG
            r1.<init>(r2, r15)
            r0.f112185N = r1
            hx1.a r1 = new hx1.a
            yw1.c$c r2 = yw1.C53591c.C53594c.KEEP_ALIVE_TYPE_GET_CHATROOM_REALTIME_INFO
            r1.<init>(r2, r15)
            r0.f112186P = r1
            boolean r1 = r0.f112218j
            if (r1 == 0) goto L_0x0486
            bx1.m r1 = new bx1.m
            java.lang.String r3 = r0.f112215h
            com.tencent.mm.plugin.game.autogen.chatroom.Lbs r4 = r0.f112223q
            r5 = 0
            long r6 = r0.f112225s
            long r8 = r0.f112224r
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r8)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
            goto L_0x0498
        L_0x0486:
            bx1.c r1 = new bx1.c
            java.lang.String r2 = r0.f112215h
            com.tencent.mm.plugin.game.autogen.chatroom.Lbs r3 = r0.f112223q
            com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo r4 = r0.f112192S0
            r1.<init>(r2, r3, r4)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
        L_0x0498:
            bx1.b r1 = new bx1.b
            java.lang.String r2 = r0.f112215h
            r1.<init>(r2)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
            bx1.f r1 = new bx1.f
            java.lang.String r2 = r0.f112215h
            r1.<init>(r2)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.Object r1 = r1.mo119685f(r2, r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            long r3 = r1.longValue()
            int r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x04eb
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.mo119677K(r2, r3)
        L_0x04eb:
            com.tencent.mm.game.report.d$a r1 = com.tencent.p014mm.game.report.C40308d.f108375a
            r2 = 0
            long r7 = r0.f112225s
            long r9 = r0.f112224r
            r5 = 0
            r4 = r1
            r4.mo62994d(r5, r7, r9)
            r7 = 1
            long r9 = r0.f112225s
            long r11 = r0.f112224r
            r5 = r2
            r4.mo62992b(r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("GameChatRoom.GameChatRoomUI", "onDestroy");
        mo65405M7();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105924i("GameChatRoom.GameChatRoomUI", "onNewIntent");
        C101070j<String, Bitmap> jVar = C53601h.f150629a;
        if (this instanceof GameChatRoomAffinityUI) {
            finish();
            mo65405M7();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105918d("GameChatRoom.GameChatRoomUI", "onPause");
        C46577a aVar = C46577a.f125473d;
        C46577a.f125474e.f124306o = 2;
        GameChatCommentFooter gameChatCommentFooter = this.f112178G;
        if (gameChatCommentFooter != null) {
            ChatFooterPanel chatFooterPanel = gameChatCommentFooter.f112478r;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100196h();
            }
            C72806l1 l1Var = gameChatCommentFooter.f112479s;
            if (l1Var != null) {
                ((C72843y1) l1Var).mo100683b();
            }
            gameChatCommentFooter.f112473j.onPause();
        }
        C41721a aVar2 = this.f112206Z0;
        if (aVar2 != null) {
            aVar2.f112293c = true;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("GameChatRoom.GameChatRoomUI", "onResume");
        C46577a aVar = C46577a.f125473d;
        C46577a.f125474e.f124306o = 1;
        GameChatCommentFooter gameChatCommentFooter = this.f112178G;
        if (gameChatCommentFooter != null) {
            ChatFooterPanel chatFooterPanel = gameChatCommentFooter.f112478r;
            if (chatFooterPanel != null && chatFooterPanel.getVisibility() == 0) {
                gameChatCommentFooter.f112478r.mo100197i();
            }
            if (gameChatCommentFooter.f112480t == 0) {
                gameChatCommentFooter.postDelayed(new C41852z(gameChatCommentFooter), 200);
            }
        }
        ChatChannelPage chatChannelPage = this.f112173B;
        if (!(chatChannelPage == null || chatChannelPage.f112147i == null)) {
            chatChannelPage.postDelayed(new C41687d(chatChannelPage), 1000);
        }
        C41721a aVar2 = this.f112206Z0;
        if (aVar2 != null) {
            aVar2.f112293c = false;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ChatroomData chatroomData;
        JumpInfo jumpInfo;
        JumpInfo jumpInfo2;
        RobotInfo robotInfo;
        String str2;
        Class cls = C39639c.class;
        int type = yVar.getType();
        if (type == 4391) {
            if (i == 0 && i2 == 0) {
                final GetChatroomBaseInfoResponse getChatroomBaseInfoResponse = (GetChatroomBaseInfoResponse) ((C39848c) yVar).f106870e.f127056b.f127083a;
                this.f112220o = getChatroomBaseInfoResponse.current_user_data;
                this.f112219n = getChatroomBaseInfoResponse.current_chatroom_data;
                this.f112195U = getChatroomBaseInfoResponse.extern_info;
                this.f112173B.setChatRoomJumpInfo(getChatroomBaseInfoResponse.jump_info);
                this.f112194T0 = getChatroomBaseInfoResponse.chatroom_enter_info;
                if (this.f112220o == null || (chatroomData = this.f112219n) == null) {
                    Log.m105924i("GameChatRoom.GameChatRoomUI", "chatroom data is null");
                    mo65408Q7(false);
                    return;
                }
                String str3 = chatroomData.chatroom_icon;
                this.f112217i = str3;
                Background background = getChatroomBaseInfoResponse.background;
                if (background == null) {
                    C40308d.m43460a(10, this.f112225s, this.f112224r);
                    mo65411T7(str3, true);
                } else {
                    int i3 = background.type;
                    if (i3 == 1) {
                        C40308d.m43460a(10, this.f112225s, this.f112224r);
                        mo65411T7(str3, true);
                    } else if (i3 == 2) {
                        BgPagInfo bgPagInfo = background.pag_info;
                        if (Util.isNullOrNil(bgPagInfo.pag_url)) {
                            mo65411T7(str3, true);
                        } else {
                            C61584n nVar = (C61584n) C39629l0.m42233a(this, (C54209k0.C54210b) null).mo75002a(C61584n.class);
                            String str4 = bgPagInfo.pag_url;
                            nVar.getClass();
                            C87412m.m108594g(str4, "pagUrl");
                            C54219z zVar = new C54219z();
                            if (str4.length() == 0) {
                                str2 = null;
                            } else {
                                String C = C112760b.m154195C();
                                C87412m.m108593f(C, "dirPath");
                                if (!C112551y.m153808h(C, "/", false, 2, (Object) null)) {
                                    C = C + XVFSFile.SEPARATOR_CHAR;
                                }
                                str2 = C + "chatroom/res/pag/" + MD5Util.getMD5String(str4) + ".pag";
                            }
                            if (C48020a.m53385b(str2)) {
                                zVar.setValue(new C13604l(Boolean.TRUE, str2));
                            } else {
                                C53895h.m60466d(C54208j0.m60899a(nVar), (C66212f) nVar.f175164e.getValue(), (C53934p0) null, new C100020p(str4, str2, zVar, (C15601d<? super C100020p>) null), 2, (Object) null);
                            }
                            zVar.observe(this, new GameChatRoomUI$$a(this, bgPagInfo));
                        }
                    } else if (i3 == 3) {
                        BgImgInfo bgImgInfo = background.img_info;
                        mo65411T7(bgImgInfo.img_url, bgImgInfo.need_gaussian_blur);
                        if (background.img_info.need_gaussian_blur) {
                            C40308d.m43460a(31, this.f112225s, this.f112224r);
                        } else {
                            C40308d.m43460a(30, this.f112225s, this.f112224r);
                        }
                    }
                }
                ChatChannelPage chatChannelPage = this.f112173B;
                if (chatChannelPage != null) {
                    chatChannelPage.mo65388g(this.f112215h, getChatroomBaseInfoResponse.channel_info, false);
                }
                MsgBaseInfo msgBaseInfo = getChatroomBaseInfoResponse.msg_base_info;
                if (msgBaseInfo != null) {
                    this.f112173B.setJumpFirstSeq(msgBaseInfo.chatroom_first_seq);
                    C119179t tVar = C119157j.f356862d;
                    C416881 r8 = new Runnable(this) {
                        public void run() {
                            if (getChatroomBaseInfoResponse.msg_base_info.enter_lead_speak_info != null) {
                                NewUserNoticeEvent newUserNoticeEvent = new NewUserNoticeEvent();
                                NewUserNoticeEvent.C40145a aVar = newUserNoticeEvent.f107660d;
                                aVar.f107661a = 1;
                                EnterLeadSpeakInfo enterLeadSpeakInfo = getChatroomBaseInfoResponse.msg_base_info.enter_lead_speak_info;
                                aVar.f107662b = enterLeadSpeakInfo.jump_wording;
                                aVar.f107663c = enterLeadSpeakInfo.lead_speak_wording;
                                aVar.f107664d = (long) enterLeadSpeakInfo.disappear_second;
                                newUserNoticeEvent.publish();
                            }
                        }
                    };
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(r8, 1000, false);
                }
                ChatroomPreloadInfo chatroomPreloadInfo = getChatroomBaseInfoResponse.preload_info;
                if (chatroomPreloadInfo != null) {
                    this.f112189R = chatroomPreloadInfo.preload_create_account_jump_info;
                    this.f112191S = chatroomPreloadInfo.preload_profile_jump_info;
                    this.f112193T = chatroomPreloadInfo.preload_premade_h5_jump_info;
                }
                if (!Util.isNullOrNil((List) getChatroomBaseInfoResponse.robot_info_list) && (robotInfo = getChatroomBaseInfoResponse.robot_info_list.get(0)) != null && !Util.isNullOrNil(robotInfo.username)) {
                    GameChatCommentFooter gameChatCommentFooter = this.f112178G;
                    if (gameChatCommentFooter != null) {
                        gameChatCommentFooter.setRobotUserName(robotInfo.username);
                    }
                    this.f112204Y0.f126630g = robotInfo.username;
                    ((C39639c) C86312j.m106911c(cls)).lx0(robotInfo.username, (C39639c.C39640a) null);
                }
                JumpInfo jumpInfo3 = this.f112219n.chatroom_member_jump_info;
                ChatRoomStateView chatRoomStateView = this.f112172A;
                if (chatRoomStateView != null) {
                    JumpInfo jumpInfo4 = this.f112191S;
                    ChatMemberListView chatMemberListView = chatRoomStateView.f112438f;
                    chatMemberListView.f112333J1 = jumpInfo4;
                    chatMemberListView.f112335L1 = jumpInfo3;
                }
                ChatChannelPage chatChannelPage2 = this.f112173B;
                if (chatChannelPage2 != null) {
                    chatChannelPage2.setPreloadInfo(this.f112191S);
                }
                JumpInfo jumpInfo5 = this.f112191S;
                if (jumpInfo5 != null && !Util.isNullOrNil(jumpInfo5.jump_url)) {
                    C41985r.m45637e(C41993t.class, this.f112191S.jump_url, (C108769b.C46571a) null);
                }
                JumpInfo jumpInfo6 = this.f112193T;
                if (jumpInfo6 != null && !Util.isNullOrNil(jumpInfo6.jump_url)) {
                    C41985r.m45637e(C41993t.class, this.f112193T.jump_url, (C108769b.C46571a) null);
                }
                C40308d.f108377c = this.f112219n.appid;
                this.f112203Y = getChatroomBaseInfoResponse.chatroom_button;
                this.f112180I.setOnClickListener(new View.OnClickListener() {
                    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
                        r8 = r7.f112251d;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onClick(android.view.View r8) {
                        /*
                            r7 = this;
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            r0.add(r8)
                            java.lang.Object[] r6 = r0.toArray()
                            r0.clear()
                            java.lang.String r1 = "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$2"
                            java.lang.String r2 = "android/view/View$OnClickListener"
                            java.lang.String r3 = "onClick"
                            java.lang.String r4 = "(Landroid/view/View;)V"
                            r5 = r7
                            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r8 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            java.lang.String r8 = r8.f112215h
                            yw1.c$a r8 = yw1.C53601h.m60126e(r8)
                            boolean r8 = r8.f150604a
                            if (r8 != 0) goto L_0x007e
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r8 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r0 = r8.f112199W
                            if (r0 == 0) goto L_0x007e
                            int r1 = r0.jump_type
                            r2 = 1
                            if (r1 == r2) goto L_0x003e
                            android.content.Context r8 = r8.f112213g
                            int r8 = yw1.C53601h.m60129h(r8, r0)
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r0 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.m45180L7(r0, r8)
                            goto L_0x007e
                        L_0x003e:
                            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r8 = r8.f112193T
                            if (r8 == 0) goto L_0x006f
                            java.lang.String r8 = r8.jump_url
                            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                            if (r8 != 0) goto L_0x006f
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r8 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r8 = r8.f112193T
                            java.lang.String r8 = r8.preload_id
                            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r0 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r0 = r0.f112199W
                            java.lang.String r0 = r0.preload_id
                            boolean r8 = r8.equals(r0)
                            if (r8 == 0) goto L_0x006f
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r8 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r8 = r8.f112193T
                            java.lang.String r8 = r8.jump_url
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$2$1 r0 = new com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$2$1
                            r0.<init>()
                            com.tencent.p014mm.plugin.game.luggage.C41985r.m45633a(r8, r0)
                            goto L_0x007e
                        L_0x006f:
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r8 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            android.content.Context r0 = r8.f112213g
                            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r8 = r8.f112199W
                            int r8 = yw1.C53601h.m60129h(r0, r8)
                            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI r0 = com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.this
                            com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.m45180L7(r0, r8)
                        L_0x007e:
                            java.lang.String r8 = "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$2"
                            java.lang.String r0 = "android/view/View$OnClickListener"
                            java.lang.String r1 = "onClick"
                            java.lang.String r2 = "(Landroid/view/View;)V"
                            j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomUI.C417012.onClick(android.view.View):void");
                    }
                });
                ChatroomButton chatroomButton = this.f112203Y;
                if (chatroomButton == null || (jumpInfo2 = chatroomButton.button_jump_info) == null) {
                    mo65410S7();
                } else {
                    this.f112199W = jumpInfo2;
                    mo65414W7();
                }
                String str5 = this.f112220o.username;
                this.f112221p = str5;
                GameChatCommentFooter gameChatCommentFooter2 = this.f112178G;
                if (gameChatCommentFooter2 != null) {
                    gameChatCommentFooter2.setHostUserName(str5);
                }
                ((C39639c) C86312j.m106911c(cls)).mo62192LM(this.f112220o);
                C39641d X3 = ((C39639c) C86312j.m106911c(cls)).mo62193X3(this.f112221p);
                if (X3 != null) {
                    this.f112173B.setHostContact(X3);
                    this.f112178G.setCanAtAll(X3.mo62207u1());
                }
                this.f112232y.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, this.f112219n.room_name));
                C46132c cVar = this.f112185N;
                if (!cVar.f124312f) {
                    String str6 = this.f112215h;
                    synchronized (cVar) {
                        cVar.f124312f = true;
                        Log.m105925i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "startKeepAlive chatroomName：%s, seq: %d", str6, 0L);
                        C86709a0.m107524d().mo123455a(4302, cVar);
                        cVar.mo71578a(str6, 0, "");
                    }
                }
                C46128a aVar = this.f112186P;
                if (!aVar.f124294f) {
                    String str7 = this.f112215h;
                    synchronized (aVar) {
                        aVar.f124294f = true;
                        Log.m105925i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "startKeepAlive chatroomName：%s, version: %s", str7, "");
                        C86709a0.m107524d().mo123455a(4316, aVar);
                        aVar.mo71574a(str7, "");
                    }
                }
                mo65412U7(getChatroomBaseInfoResponse.control_info);
                FirstEnterNotify firstEnterNotify = getChatroomBaseInfoResponse.first_enter_notify;
                if (firstEnterNotify != null && (jumpInfo = firstEnterNotify.jump_info) != null) {
                    C53601h.m60129h(this.f112213g, jumpInfo);
                }
            }
        } else if (type == 4993) {
            C39865r rVar = (C39865r) yVar;
            String str8 = "";
            ChatroomMsgPack chatroomMsgPack = ((SendChatroomMsgRequest) rVar.f106915e.f127055a.f127080a).msg_pack;
            if (chatroomMsgPack != null) {
                str8 = chatroomMsgPack.cli_msg_id;
            }
            if (i == 0 && i2 == 0) {
                C41684a aVar2 = this.f112173B.f112148j;
                if (aVar2 != null) {
                    Iterator it = ((ArrayList) aVar2.f112164j).iterator();
                    while (it.hasNext()) {
                        GameChatListView gameChatListView = ((ChatChannelFragment) it.next()).f112126e;
                        if (gameChatListView != null) {
                            GameChatListView.C41771f fVar = gameChatListView.f112506C1;
                            fVar.mo65549P5(str8, 0);
                            ((ConcurrentHashMap) fVar.f112560h).remove(str8);
                        }
                    }
                }
            } else {
                C41684a aVar3 = this.f112173B.f112148j;
                if (aVar3 != null) {
                    Iterator it4 = ((ArrayList) aVar3.f112164j).iterator();
                    while (it4.hasNext()) {
                        GameChatListView gameChatListView2 = ((ChatChannelFragment) it4.next()).f112126e;
                        if (gameChatListView2 != null) {
                            gameChatListView2.f112506C1.mo65549P5(str8, 2);
                        }
                    }
                }
            }
            SendChatroomMsgResponse sendChatroomMsgResponse = (SendChatroomMsgResponse) rVar.f106915e.f127056b.f127083a;
            if (!Util.isNullOrNil(sendChatroomMsgResponse.send_notice)) {
                C77426q qVar = new C77426q(this.f112213g);
                qVar.mo107595g(sendChatroomMsgResponse.send_notice);
                qVar.mo107589a(false);
                qVar.mo107602n(this.f112213g.getString(C0966R.string.f8028zq));
                qVar.mo107600l(new C47883u() {
                    /* renamed from: a */
                    public void mo353a(boolean z, String str) {
                        GameChatRoomUI.this.f112187Q = false;
                    }
                });
                qVar.mo107604p(true);
                qVar.mo107603o();
            }
        } else if (type == 4897) {
            JoinChatroomResponse joinChatroomResponse = (JoinChatroomResponse) ((C39861m) yVar).f106902e.f127056b.f127083a;
            if (i != 0 || i2 != 0) {
                String string = MMApplicationContext.getResources().getString(C0966R.string.b3s);
                if (joinChatroomResponse != null && !Util.isNullOrNil(joinChatroomResponse.errmsg)) {
                    string = joinChatroomResponse.errmsg;
                }
                C76912y0.m92767f(this.f112213g, string);
                if (this.f112179H.getVisibility() == 8) {
                    C86709a0.m107524d().mo123460f(new C39848c(this.f112215h, this.f112223q, this.f112192S0));
                }
                JumpInfo jumpInfo7 = joinChatroomResponse.chatroom_full_jump_info;
                if (jumpInfo7 != null) {
                    C53601h.m60129h(this.f112213g, jumpInfo7);
                }
            } else if (joinChatroomResponse.need_jump_create_account) {
                C53601h.m60130i(this.f112213g, joinChatroomResponse.create_account_jump_info, 11, (String) null);
                C86709a0.m107524d().mo123460f(new C39848c(this.f112215h, this.f112223q, this.f112192S0));
            } else {
                C76912y0.m92768g(this.f112213g, MMApplicationContext.getResources().getString(C0966R.string.b3t));
                this.f112179H.setVisibility(8);
                C86709a0.m107524d().mo123460f(new C39848c(this.f112215h, this.f112223q, this.f112192S0));
                ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = new ChatRoomJoinOrQuitEvent();
                ChatRoomJoinOrQuitEvent.C40050a aVar4 = chatRoomJoinOrQuitEvent.f107400d;
                aVar4.f107401a = 1;
                aVar4.f107402b = this.f112215h;
                chatRoomJoinOrQuitEvent.publish();
            }
        } else if (type == 4596) {
            C0390n nVar2 = (C0390n) yVar;
            throw null;
        } else if (type == 5072) {
            C47465a aVar5 = ((C39851f) yVar).f106876e.f127056b.f127083a;
            C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse");
            this.f112196U0 = ((GetChatroomPanelResponse) aVar5).chatroom_panel;
            this.f112182K.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    GameChatRoomUI gameChatRoomUI = GameChatRoomUI.this;
                    new ChatRoomPanelController(gameChatRoomUI.f112213g, gameChatRoomUI.f112225s, gameChatRoomUI.f112224r).mo65478b(GameChatRoomUI.this.f112196U0);
                    C40308d.C40309a aVar = C40308d.f108375a;
                    GameChatRoomUI gameChatRoomUI2 = GameChatRoomUI.this;
                    aVar.mo62992b(3, 2, gameChatRoomUI2.f112225s, gameChatRoomUI2.f112224r);
                    GameChatRoomUI gameChatRoomUI3 = GameChatRoomUI.this;
                    long j = gameChatRoomUI3.f112225s;
                    C40308d.C40309a.m43461i(aVar, 1324, 0, 1, 0, j, gameChatRoomUI3.f112224r, C40308d.f108377c, 0, "", "", 0, 1024, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            if (this.f112196U0 != null) {
                C52645f.m59023a().mo73595e(this.f112183L, this.f112196U0.panel_icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
                this.f112184M.setText(this.f112196U0.panel_text);
                if (this.f112174C.isClickable()) {
                    mo65413V7();
                    C40308d.f108375a.mo62992b(3, 1, this.f112225s, this.f112224r);
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        Log.m105918d("GameChatRoom.GameChatRoomUI", "onStart");
    }

    public void onStop() {
        super.onStop();
        Log.m105918d("GameChatRoom.GameChatRoomUI", "onStop");
    }

    public void setActionbarColor(int i) {
        super.setActionbarColor(i);
        View view = this.f112208b1;
        if (view != null) {
            view.setBackgroundColor(getWindow().getStatusBarColor());
            C87773e.m109211d(getWindow());
        }
    }

    public boolean supportNavigationSwipeBack() {
        return !getIntent().getBooleanExtra("disable_game_page_swipe", false);
    }
}
