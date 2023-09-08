package com.tencent.p014mm.plugin.multitalk.p078ui;

import android.app.KeyguardManager;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C54219z;
import aw0.C103928o;
import b82.C39741a;
import bd2.C79690d;
import bl3.C39818r;
import c82.C104323b;
import c92.C104331h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.MultiTalkActionEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105713v2;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105770a;
import com.tencent.p014mm.plugin.multitalk.model.C105783b0;
import com.tencent.p014mm.plugin.multitalk.model.C105798e1;
import com.tencent.p014mm.plugin.multitalk.model.C105799g0;
import com.tencent.p014mm.plugin.multitalk.model.C105804h0;
import com.tencent.p014mm.plugin.multitalk.model.C105805i;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105814l;
import com.tencent.p014mm.plugin.multitalk.model.C105817m0;
import com.tencent.p014mm.plugin.multitalk.model.C105825p;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultiTalkControlIconLayout;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view.MultiTalkAvatarLayout;
import com.tencent.p014mm.plugin.multitalk.service.MultiTalkingForegroundService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import d82.C107025a;
import dd0.C75346e;
import di3.C86312j;
import eb0.C75592q0;
import f82.C107496d;
import gy3.C87412m;
import i72.C98607d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj2.C61767o;
import nj3.C76879j;
import nj3.C88989a;
import o33.C109935a;
import o33.C109938b;
import org.json.JSONObject;
import p206nj.C11171e;
import p331dj.C107043a;
import p447aw.C103918d;
import p625nu.C61901d;
import p646pn.C110234e;
import p657pz.C89445b;
import p823sg.C90193h;
import pu0.C110248b;
import qo3.C77398g;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import uv0.C22663i;
import v82.C111415a1;
import v82.C111420c0;
import v82.C111424d;
import v82.C111425d1;
import v82.C111433e;
import v82.C111443e1;
import v82.C111452h1;
import v82.C111456j0;
import v82.C111467j1;
import v82.C111470k1;
import v82.C111473l1;
import v82.C111474m;
import vo3.C90852c;
import w82.C111759e;
import x82.C112092f;
import x82.C112101k;
import x82.C112112p;
import x82.C112113q;
import xv0.C112181e;
import z04.C119027c;
import z82.C112612a;
import zt3.C119157j;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI */
public class MultiTalkMainUI extends MMActivity implements C105805i, ServiceConnection, C61901d.C61902a {

    /* renamed from: A */
    public int f314883A = 0;

    /* renamed from: B */
    public BroadcastReceiver f314884B = new C105872g();

    /* renamed from: C */
    public MMHandler f314885C = new C42576b();

    /* renamed from: D */
    public C98607d f314886D;

    /* renamed from: d */
    public C111420c0 f314887d;

    /* renamed from: e */
    public C105895a f314888e;

    /* renamed from: f */
    public C111415a1 f314889f;

    /* renamed from: g */
    public C111456j0 f314890g;

    /* renamed from: h */
    public boolean f314891h;

    /* renamed from: i */
    public boolean f314892i = true;

    /* renamed from: j */
    public boolean f314893j = false;

    /* renamed from: n */
    public boolean f314894n = false;

    /* renamed from: o */
    public MMHandler f314895o;

    /* renamed from: p */
    public ScreenActionReceiver f314896p;

    /* renamed from: q */
    public C109938b f314897q;

    /* renamed from: r */
    public boolean f314898r = false;

    /* renamed from: s */
    public final boolean f314899s = C104331h.m139315h();

    /* renamed from: t */
    public ViewTreeObserver.OnGlobalLayoutListener f314900t = new C105868c();

    /* renamed from: u */
    public boolean f314901u = false;

    /* renamed from: v */
    public C105883g f314902v;

    /* renamed from: w */
    public Runnable f314903w = new C105869d();

    /* renamed from: x */
    public boolean f314904x = false;

    /* renamed from: y */
    public boolean f314905y = false;

    /* renamed from: z */
    public boolean f314906z = false;

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$b */
    public class C42576b extends MMHandler {
        public C42576b() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                MultiTalkMainUI multiTalkMainUI = MultiTalkMainUI.this;
                if (!multiTalkMainUI.f314894n) {
                    multiTalkMainUI.getClass();
                    Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "bindVoiceServiceIfNeed");
                    try {
                        if (C11171e.m11046c(26)) {
                            multiTalkMainUI.f314894n = true;
                            Intent intent = new Intent();
                            intent.setClass(MMApplicationContext.getContext(), MultiTalkingForegroundService.class);
                            MMApplicationContext.getContext().bindService(intent, multiTalkMainUI, 1);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.MT.MultiTalkMainUI", e, "bindVoiceServiceIfNeed error: %s", e.getMessage());
                    }
                }
            } else if (i == 1) {
                ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(43);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$ScreenActionReceiver */
    public class ScreenActionReceiver extends BroadcastReceiver {
        public ScreenActionReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.intent.action.SCREEN_OFF")) {
                Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "receive action screen off");
                MultiTalkMainUI multiTalkMainUI = MultiTalkMainUI.this;
                multiTalkMainUI.f314885C.removeCallbacksAndMessages((Object) null);
                multiTalkMainUI.f314885C.sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$a */
    public class C85294a implements DialogInterface.OnClickListener {
        public C85294a(MultiTalkMainUI multiTalkMainUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$h */
    public class C85295h implements DialogInterface.OnClickListener {
        public C85295h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(MultiTalkMainUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$i */
    public class C85296i implements DialogInterface.OnClickListener {
        public C85296i(MultiTalkMainUI multiTalkMainUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$j */
    public class C85297j implements DialogInterface.OnClickListener {
        public C85297j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(MultiTalkMainUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$c */
    public class C105868c implements ViewTreeObserver.OnGlobalLayoutListener {
        public C105868c() {
        }

        public void onGlobalLayout() {
            int c = C75044y4.m89992d(MultiTalkMainUI.this.getContext()) ? C75044y4.m89991c(MultiTalkMainUI.this.getContext()) : 0;
            C105895a aVar = MultiTalkMainUI.this.f314888e;
            CollapseView collapseView = aVar.f315030I;
            if (!(collapseView == null || collapseView.findViewById(C0966R.C0970id.iwe) == null)) {
                Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "applyBottomMarin %s", Integer.valueOf(c));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aVar.f315030I.findViewById(C0966R.C0970id.iwe).getLayoutParams();
                layoutParams.bottomMargin = c;
                aVar.f315030I.findViewById(C0966R.C0970id.iwe).setLayoutParams(layoutParams);
            }
            C111456j0 j0Var = MultiTalkMainUI.this.f314890g;
            if (j0Var.f333712v) {
                C111474m e = j0Var.mo163154e();
                e.getClass();
                Log.m105924i("MicroMsg.MT.ControlPanelLogic", "updateNavigationBarHeight() called with: height = " + c);
                e.f333762x = c;
                e.mo163183h(e.f333757s, false);
            } else {
                Log.m105928w("MicroMsg.MT.MultiTalkNewTalkingUILogic", "updateNavigationBarHeight: view not showing, do not update");
            }
            MultiTalkMainUI.this.mo150869H7().getViewTreeObserver().removeOnGlobalLayoutListener(MultiTalkMainUI.this.f314900t);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$d */
    public class C105869d implements Runnable {
        public C105869d() {
        }

        public void run() {
            MultiTalkManager zx02 = C105851w0.zx0();
            boolean z = false;
            if ((zx02.f314479S0 ? false : C105806i0.m142154g(zx02.f314496h)) && C105851w0.vx0().mo150808b() && !C105851w0.zx0().f314498j && !C105851w0.vx0().mo150809d()) {
                MultiTalkMainUI multiTalkMainUI = MultiTalkMainUI.this;
                if (multiTalkMainUI.f314899s) {
                    multiTalkMainUI.f314902v.mo150904d3(Boolean.TRUE);
                } else {
                    multiTalkMainUI.f314888e.mo150971u(true);
                }
            }
            if (C105851w0.zx0().f314507u != null) {
                C105817m0 m0Var = C105851w0.zx0().f314507u;
                if (m0Var.f314677c || m0Var.f314678d) {
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            C105851w0.zx0().mo150647X();
            C105851w0.zx0().mo150644U();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$e */
    public class C105870e implements Runnable {
        public C105870e() {
        }

        public void run() {
            MultiTalkMainUI multiTalkMainUI = MultiTalkMainUI.this;
            if (multiTalkMainUI.f314899s) {
                multiTalkMainUI.f314890g.mo163151b();
            } else {
                multiTalkMainUI.f314888e.mo150960k(false, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$f */
    public class C105871f implements Runnable {
        public C105871f(MultiTalkMainUI multiTalkMainUI) {
        }

        public void run() {
            C105851w0.vx0().mo150813i(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$g */
    public class C105872g extends BroadcastReceiver {
        public C105872g() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && C105851w0.zx0().f314505s == C111452h1.Inviting) {
                C105851w0.zx0().mo150648Y();
                MultiTalkMainUI.this.f314892i = false;
            }
        }
    }

    /* renamed from: B4 */
    public void mo150750B4() {
        setRequestedOrientation(1);
        Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickStopProject");
        C115669n.INSTANCE.mo175913w(1538, 5, 1);
        C105851w0.zx0().f314498j = false;
        C105851w0.zx0().f314499n = false;
        getIntent().removeExtra("enterMainUIScreenProjectOnline");
        getIntent().removeExtra("enterMainUIScreenProjectParams");
        this.f314889f.mo163075b();
        C105851w0.zx0().mo150655c0(1, false);
        if (this.f314899s) {
            this.f314890g.mo163163n();
            return;
        }
        this.f314888e.mo150962m();
        C105895a aVar = this.f314888e;
        if (aVar.f315034M) {
            aVar.f315030I.setVisibility(0);
        }
        View view = this.f314888e.f315048e;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f314888e.getClass();
        MultiTalkManager zx02 = C105851w0.zx0();
        zx02.getClass();
        HashSet<String> hashSet = new HashSet<>();
        Iterator<String> it = zx02.f314503q.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!C75592q0.m90789s().equals(next)) {
                hashSet.add(next);
            }
        }
        zx02.f314503q.clear();
        zx02.f314503q = hashSet;
        C105805i iVar = zx02.f314462D;
        if (iVar != null) {
            iVar.mo150759X6();
        }
        this.f314888e.mo150958i(C105851w0.zx0().f314506t);
        C105895a aVar3 = this.f314888e;
        View view2 = aVar3.f315058r;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(0);
        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = aVar3.f315054n;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f314888e.mo150959j();
        if (C105851w0.zx0().mo150683y() && this.f314895o != null) {
            C105895a aVar6 = this.f314888e;
            aVar6.f315050g.mo150709k(aVar6.f315049f, aVar6.f315038R, aVar6.f315047d, aVar6);
            C105851w0.zx0().getClass();
            ((C105798e1) C105851w0.zx0().mo150677r()).mo150747b(true);
        }
    }

    /* renamed from: E6 */
    public void mo150751E6() {
        Log.m105920e("MicroMsg.MT.MultiTalkMainUI", "onCameraError");
        C77398g b = C75346e.m90356b(this, C0966R.string.khw, new C105871f(this));
        if (!b.isShowing()) {
            b.show();
        }
        C105851w0.zx0().mo150655c0(1, C105851w0.zx0().f314498j);
    }

    /* renamed from: G3 */
    public void mo150752G3(String str) {
        C111415a1 a1Var = this.f314889f;
        if (a1Var != null) {
            a1Var.getClass();
            C87412m.m108594g(str, "imgPath");
            Intent intent = new Intent();
            intent.setClassName(a1Var.f333535a, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("Retr_Compress_Type", 1);
            MultiTalkMainUI multiTalkMainUI = a1Var.f333535a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MultiTalkMainUI multiTalkMainUI2 = multiTalkMainUI;
            C117292a.m165358d(multiTalkMainUI2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkScreenProjectUILogic", "doSendTOFriend", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            multiTalkMainUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(multiTalkMainUI2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkScreenProjectUILogic", "doSendTOFriend", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: H7 */
    public ViewGroup mo150869H7() {
        return (ViewGroup) findViewById(C0966R.C0970id.iws);
    }

    /* renamed from: I */
    public void mo150753I() {
        mo150872K7();
        this.f314887d.mo163083a();
        if (this.f314899s) {
            this.f314890g.mo163163n();
            return;
        }
        this.f314888e.mo150958i(C105851w0.zx0().f314506t);
        this.f314888e.mo150959j();
    }

    /* renamed from: I7 */
    public void mo150870I7() {
        if (!this.f314905y && C105851w0.zx0().f314506t != null) {
            this.f314905y = true;
            Intent intent = new Intent();
            intent.putExtra("kintent_talker", C105851w0.zx0().f314506t.f320044f);
            intent.putExtra("key_media_type", 2);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
            C88144b.m109802t(this, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 3);
        }
    }

    /* renamed from: J7 */
    public boolean mo150871J7() {
        C111415a1 a1Var = this.f314889f;
        if (a1Var != null) {
            return a1Var.mo163077d();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013b  */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo150872K7() {
        /*
            r22 = this;
            r0 = r22
            com.tencent.mm.plugin.multitalk.ui.g r1 = r0.f314902v
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r2 = r2.f314506t
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.util.List<as3.s0> r3 = r3.f314504r
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.util.List r4 = r4.mo150675p()
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r5 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.util.List r5 = r5.mo150678s()
            r1.getClass()
            java.lang.String r6 = "multiTalkGroup"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "videoUser"
            gy3.C87412m.m108594g(r3, r6)
            java.lang.String r6 = eb0.C75592q0.m90789s()
            java.util.List<com.tencent.pb.talkroom.sdk.MultiTalkGroupMember> r2 = r2.f320047i
            java.lang.String r7 = "multiTalkGroup.mMultiTalkGroupMemberList"
            gy3.C87412m.m108593f(r2, r7)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0046:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x005f
            java.lang.Object r9 = r2.next()
            r10 = r9
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r10 = (com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember) r10
            java.lang.String r10 = r10.f320048d
            boolean r10 = r7.add(r10)
            if (r10 == 0) goto L_0x0046
            r8.add(r9)
            goto L_0x0046
        L_0x005f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r8.iterator()
        L_0x0068:
            boolean r8 = r7.hasNext()
            r9 = 10
            r11 = 1
            if (r8 == 0) goto L_0x0088
            java.lang.Object r8 = r7.next()
            r12 = r8
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r12 = (com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember) r12
            int r12 = r12.f320050f
            if (r12 == r11) goto L_0x0081
            if (r12 != r9) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r10 = 0
            goto L_0x0082
        L_0x0081:
            r10 = 1
        L_0x0082:
            if (r10 == 0) goto L_0x0068
            r2.add(r8)
            goto L_0x0068
        L_0x0088:
            com.tencent.mm.plugin.multitalk.ui.h r7 = new com.tencent.mm.plugin.multitalk.ui.h
            r7.<init>(r1, r3, r6)
            java.util.List r2 = sx3.C110818d0.m150943o0(r2, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = sx3.C36907w.m41090l(r2, r9)
            r7.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x009e:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0148
            java.lang.Object r8 = r2.next()
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r8 = (com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember) r8
            r9 = r3
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x00b1:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00c9
            java.lang.Object r12 = r9.next()
            r13 = r12
            as3.s0 r13 = (as3.C103900s0) r13
            java.lang.String r13 = r13.f307156c
            java.lang.String r14 = r8.f320048d
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x00b1
            goto L_0x00ca
        L_0x00c9:
            r12 = 0
        L_0x00ca:
            as3.s0 r12 = (as3.C103900s0) r12
            com.tencent.mm.plugin.multitalk.ui.d r9 = new com.tencent.mm.plugin.multitalk.ui.d
            java.lang.String r13 = r8.f320048d
            int r14 = c92.C104331h.m139311c(r13)
            java.lang.String r15 = r8.f320048d
            java.lang.String r13 = "it.usrName"
            gy3.C87412m.m108593f(r15, r13)
            int r13 = r8.f320050f
            if (r13 != r11) goto L_0x00e2
            r16 = 1
            goto L_0x00e4
        L_0x00e2:
            r16 = 0
        L_0x00e4:
            if (r12 == 0) goto L_0x00ed
            int r13 = r12.f307158e
            r10 = 2
            if (r13 != r10) goto L_0x00ed
            r10 = 1
            goto L_0x00ee
        L_0x00ed:
            r10 = 0
        L_0x00ee:
            if (r10 != 0) goto L_0x0100
            if (r12 == 0) goto L_0x00f9
            int r10 = r12.f307158e
            r13 = 3
            if (r10 != r13) goto L_0x00f9
            r10 = 1
            goto L_0x00fa
        L_0x00f9:
            r10 = 0
        L_0x00fa:
            if (r10 == 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r17 = 0
            goto L_0x0102
        L_0x0100:
            r17 = 1
        L_0x0102:
            if (r4 == 0) goto L_0x010d
            java.lang.String r10 = r8.f320048d
            boolean r10 = r4.contains(r10)
            r18 = r10
            goto L_0x010f
        L_0x010d:
            r18 = 0
        L_0x010f:
            java.lang.String r10 = r8.f320048d
            boolean r19 = r5.contains(r10)
            java.lang.String r8 = r8.f320048d
            boolean r8 = gy3.C87412m.m108589b(r6, r8)
            if (r8 == 0) goto L_0x0132
            androidx.lifecycle.z<java.lang.Boolean> r8 = r1.f314934d
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 != 0) goto L_0x0129
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L_0x0129:
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0132
            r20 = 1
            goto L_0x0134
        L_0x0132:
            r20 = 0
        L_0x0134:
            if (r12 == 0) goto L_0x013b
            int r8 = r12.f307159f
            r21 = r8
            goto L_0x013f
        L_0x013b:
            r8 = 100
            r21 = 100
        L_0x013f:
            r13 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r7.add(r9)
            goto L_0x009e
        L_0x0148:
            androidx.lifecycle.z<java.util.List<com.tencent.mm.plugin.multitalk.ui.d>> r1 = r1.f314940j
            r1.postValue(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI.mo150872K7():void");
    }

    /* renamed from: L1 */
    public void mo150754L1() {
        if (!mo150871J7()) {
            Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "onMiniMultiTalk");
            MultiTalkActionEvent multiTalkActionEvent = new MultiTalkActionEvent();
            multiTalkActionEvent.f154837d.f107635a = 0;
            multiTalkActionEvent.publish();
            if (this.f314899s) {
                this.f314890g.mo163151b();
            } else {
                this.f314888e.mo150960k(true, false);
            }
            C105851w0.zx0().mo150648Y();
            finish();
        }
        C105851w0.zx0().f314462D = null;
        C105851w0.vx0().f314746h = null;
    }

    /* renamed from: M2 */
    public void mo150755M2() {
        C112113q qVar;
        C112112p pVar;
        C112113q qVar2;
        C112112p pVar2;
        C112113q qVar3;
        C112112p pVar3;
        CopyOnWriteArrayList<C107025a> copyOnWriteArrayList;
        CopyOnWriteArrayList<C107025a> copyOnWriteArrayList2;
        String str;
        MultitalkFrameView multitalkFrameView;
        if (!mo150871J7() && !this.f314899s) {
            C105895a aVar = this.f314888e;
            TextView textView = aVar.f315053j;
            long j = (long) C105851w0.zx0().f314512y;
            textView.setText(String.format("%02d:%02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}));
            TextView textView2 = aVar.f315053j;
            int i = C105851w0.zx0().f314512y;
            textView2.setContentDescription(String.format(aVar.f315047d.getString(C0966R.string.h4n), new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}));
            C105770a aVar2 = aVar.f315050g;
            aVar2.getClass();
            HashSet<String> hashSet = C105851w0.zx0().f314503q;
            List<String> p = C105851w0.zx0().mo150675p();
            C111424d dVar = aVar2.f314545i;
            if (!(dVar == null || (copyOnWriteArrayList2 = dVar.f333577e) == null)) {
                Iterator<C107025a> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    String str2 = it.next().f320414a.f320048d;
                    C87412m.m108593f(str2, "it.member.usrName");
                    C111433e f = aVar2.mo150704f(str2);
                    if (f != null) {
                        if (!(f.f333625z != null)) {
                            f = null;
                        }
                        if (f != null) {
                            MultitalkFrameView multitalkFrameView2 = f.f333625z;
                            if (multitalkFrameView2 == null || (str = multitalkFrameView2.getUsername()) == null) {
                                str = "";
                            }
                            if (C87412m.m108589b(C75592q0.m90789s(), str)) {
                                if (aVar2.f314543g != null && C105851w0.vx0().mo150809d()) {
                                    ImageView imageView = f.f333605B;
                                    if (imageView != null) {
                                        imageView.setVisibility(8);
                                    }
                                    multitalkFrameView = f.f333625z;
                                    if (multitalkFrameView != null && multitalkFrameView.f314990q) {
                                        ((C119157j) C119157j.f356862d).mo183895z(new C111473l1(multitalkFrameView));
                                    }
                                }
                            }
                            if (p != null && p.contains(str)) {
                                if (hashSet != null && !hashSet.contains(str)) {
                                    ImageView imageView2 = f.f333605B;
                                    if (imageView2 != null) {
                                        imageView2.setVisibility(0);
                                    }
                                    multitalkFrameView = f.f333625z;
                                    ((C119157j) C119157j.f356862d).mo183895z(new C111473l1(multitalkFrameView));
                                }
                            }
                            ImageView imageView3 = f.f333605B;
                            if (imageView3 != null) {
                                imageView3.setVisibility(8);
                            }
                            multitalkFrameView = f.f333625z;
                            ((C119157j) C119157j.f356862d).mo183895z(new C111473l1(multitalkFrameView));
                        }
                    }
                }
            }
            if (p != null) {
                int size = p.size();
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(220, 23, 1, false);
                nVar.idkeyStat(220, 24, (long) size, false);
            }
            C105770a aVar3 = aVar.f315050g;
            aVar3.getClass();
            List<String> s = C105851w0.zx0().mo150678s();
            C111424d dVar2 = aVar3.f314545i;
            if (!(dVar2 == null || (copyOnWriteArrayList = dVar2.f333577e) == null)) {
                Iterator<C107025a> it4 = copyOnWriteArrayList.iterator();
                while (it4.hasNext()) {
                    C107025a next = it4.next();
                    if (s.contains(next.f320414a.f320048d)) {
                        String str3 = next.f320414a.f320048d;
                        C87412m.m108593f(str3, "it.member.usrName");
                        C111433e f2 = aVar3.mo150704f(str3);
                        ImageView imageView4 = f2 != null ? f2.f333606C : null;
                        if (imageView4 != null) {
                            imageView4.setVisibility(0);
                        }
                        boolean b = C87412m.m108589b(C75592q0.m90789s(), next.f320414a.f320048d);
                        if (b) {
                            C115669n.INSTANCE.idkeyStat(220, 21, 1, false);
                        } else {
                            C115669n.INSTANCE.idkeyStat(220, 22, 1, false);
                        }
                        if (b) {
                            C111425d1 Cx0 = C105851w0.Cx0();
                            if (Cx0.f333586d != null && !Cx0.f333589g) {
                                ((C119157j) C119157j.f356862d).mo183894y("showIcon");
                                ((C119157j) C119157j.f356862d).mo183876g(new C111443e1(Cx0, true), "showIcon");
                            }
                        }
                    } else {
                        String str4 = next.f320414a.f320048d;
                        C87412m.m108593f(str4, "it.member.usrName");
                        C111433e f3 = aVar3.mo150704f(str4);
                        ImageView imageView5 = f3 != null ? f3.f333606C : null;
                        if (imageView5 != null) {
                            imageView5.setVisibility(8);
                        }
                    }
                }
            }
            C112612a aVar4 = aVar.f315040T;
            if (!(aVar4 == null || (qVar3 = aVar4.f337244f) == null || (pVar3 = qVar3.f335669h) == null)) {
                pVar3.mo163842d();
            }
        }
        mo150872K7();
        C105883g gVar = this.f314902v;
        int i2 = C105851w0.zx0().f314512y;
        C54219z<String> zVar = gVar.f314942o;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        zVar.setValue(format);
        C111415a1 a1Var = this.f314889f;
        C112101k kVar = a1Var.f333536b;
        if (!(kVar == null || (qVar2 = kVar.f335713t) == null || (pVar2 = qVar2.f335669h) == null)) {
            pVar2.mo163842d();
        }
        C112092f fVar = a1Var.f333537c;
        if (!(fVar == null || (qVar = fVar.f335713t) == null || (pVar = qVar.f335669h) == null)) {
            pVar.mo163842d();
        }
        C105825p vx02 = C105851w0.vx0();
        if (vx02.f314748j != null && vx02.mo150809d() && vx02.mo150808b() && vx02.f314753r) {
            vx02.mo150812g();
        }
    }

    /* renamed from: S1 */
    public void mo150756S1(String str) {
        C111415a1 a1Var = this.f314889f;
        if (a1Var != null) {
            a1Var.getClass();
            C87412m.m108594g(str, "path");
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.MultiTalkScreenProjectUILogic", "fill favorite event fail, event is null or image path is empty");
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            } else {
                Log.m105925i("MicroMsg.MultiTalkScreenProjectUILogic", "do fill event info(fav simple image), path %s sourceType %d", str, 2);
                C101801kd0 kd02 = new C101801kd0();
                C101835rd0 rd02 = new C101835rd0();
                C101834rc0 rc02 = new C101834rc0();
                rc02.mo141260p(2);
                rc02.f299284V = str;
                StringBuilder sb = new StringBuilder();
                sb.append(rc02);
                sb.append('2');
                sb.append(System.currentTimeMillis());
                byte[] bytes = sb.toString().getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                rc02.mo141257m(C90193h.m112878f(bytes));
                FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                aVar.f264835a = 27;
                aVar.f264840f = rc02;
                favoriteOperationEvent.publish();
                String str2 = favoriteOperationEvent.f264834e.f264858d;
                BitmapUtil.createThumbNail(str, 150, 150, Bitmap.CompressFormat.JPEG, 90, str2, true);
                rc02.f299286W = str2;
                rd02.mo141275k(C75592q0.m90789s());
                rd02.mo141279o(C75592q0.m90789s());
                rd02.mo141277m(2);
                rd02.mo141273f(Util.nowMilliSecond());
                kd02.mo141219q(rd02);
                kd02.f298618f.add(rc02);
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                aVar2.f264679d = rc02.f299297d;
                aVar2.f264676a = kd02;
                aVar2.f264678c = 2;
            }
            DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
            aVar3.f264684i = a1Var.f333535a;
            aVar3.f264688m = 6;
            doFavoriteEvent.publish();
        }
    }

    /* renamed from: T5 */
    public void mo150757T5() {
        Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "onExitMultiTalk");
        this.f314898r = true;
        C104323b bVar = C105851w0.zx0().f314469K;
        if (bVar != null) {
            bVar.mo146015g0(false, 1);
        }
        MultiTalkActionEvent multiTalkActionEvent = new MultiTalkActionEvent();
        multiTalkActionEvent.f154837d.f107635a = 0;
        multiTalkActionEvent.publish();
        this.f314895o.post(new C105870e());
        C111415a1 a1Var = this.f314889f;
        if (a1Var != null) {
            a1Var.mo163075b();
        }
        C105851w0.zx0().f314462D = null;
        C105851w0.vx0().f314746h = null;
        C105851w0.zx0().mo150648Y();
        C104323b bVar2 = C105851w0.zx0().f314469K;
        if (bVar2 != null) {
            bVar2.mo146011B();
        }
        if (C105851w0.zx0().f314469K != null) {
            C110248b.f329777h.mo161670o("multitalke");
        }
        C105851w0.vx0().mo150811f();
        finish();
    }

    /* renamed from: U4 */
    public void mo150758U4(C105806i0.C105807a aVar, C105806i0.C105807a aVar2) {
        if (aVar2 == C105806i0.C105807a._4G) {
            C105851w0.Dx0().mo150749a(this);
        } else if (aVar2 == C105806i0.C105807a._3GOr_2G) {
            C105804h0 Dx0 = C105851w0.Dx0();
            if (!Dx0.f314623a) {
                Dx0.f314623a = true;
                C75346e.m90356b(this, C0966R.string.h0d, (Runnable) null);
            }
        } else if (aVar2 == C105806i0.C105807a.None) {
            C75346e.m90356b(this, C0966R.string.f360087a11, (Runnable) null);
        }
    }

    /* renamed from: V */
    public void mo150873V(int i) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        startActivityForResult(intent, 1);
        this.f314906z = true;
        this.f314883A = i;
    }

    /* renamed from: X6 */
    public void mo150759X6() {
        mo150872K7();
        int ordinal = C105851w0.zx0().f314505s.ordinal();
        if (ordinal == 1) {
            this.f314887d.mo163084b(C105851w0.zx0().f314506t);
        } else if ((ordinal == 2 || ordinal == 3 || ordinal == 4) && !this.f314899s) {
            this.f314888e.mo150958i(C105851w0.zx0().f314506t);
        }
    }

    /* renamed from: d */
    public void mo150760d(int i) {
        Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "onError " + i);
        if (i != -1700) {
            return;
        }
        if (this.f314899s) {
            this.f314902v.mo150904d3(Boolean.FALSE);
            return;
        }
        C105895a aVar = this.f314888e;
        aVar.getClass();
        Log.m105924i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSwitchVideoDisabled");
        aVar.f315066z.setChecked(false);
        aVar.mo150972v(false);
        C105851w0.zx0().mo150655c0(1, C105851w0.zx0().f314498j);
        C105853x.m142230a(6);
        C105724z.INSTANCE.mo150612v();
        C105851w0.Cx0().getClass();
    }

    /* renamed from: f3 */
    public void mo150761f3() {
        this.f314888e.mo150976z(true);
    }

    public void finish() {
        C111456j0 j0Var;
        super.finish();
        C105895a aVar = this.f314888e;
        if (aVar != null) {
            aVar.f315046Z = false;
        }
        if (this.f314899s && (j0Var = this.f314890g) != null) {
            C111474m e = j0Var.mo163154e();
            e.getClass();
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "disableClick");
            e.f333759u = false;
        }
        C98607d dVar = this.f314886D;
        if (dVar != null) {
            dVar.disable();
            this.f314886D.f289116g = null;
            this.f314886D = null;
        }
    }

    public int getForceOrientation() {
        return !this.f314889f.mo163077d() ? 1 : 4;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bhj;
    }

    public final void init() {
        this.f314887d = new C111420c0(this);
        this.f314888e = new C105895a(this);
        this.f314889f = new C111415a1(this);
        this.f314890g = new C111456j0(this);
        if (C61767o.f175575a.mo86688i() || (C105851w0.zx0().mo150684z() && C105851w0.zx0().mo150624A())) {
            C105851w0.zx0().mo150642S(C105851w0.zx0().f314494f);
        }
    }

    /* renamed from: l */
    public void mo150762l(boolean z) {
        if (C105851w0.zx0().mo150683y() && !this.f314899s) {
            C105895a aVar = this.f314888e;
            aVar.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C111467j1(aVar, z));
        }
    }

    /* renamed from: l2 */
    public void mo150763l2(boolean z) {
        if (!C105851w0.zx0().mo150683y()) {
            return;
        }
        if (!this.f314899s) {
            C105895a aVar = this.f314888e;
            MultiTalkControlIconLayout multiTalkControlIconLayout = aVar.f315023B;
            if (multiTalkControlIconLayout != null) {
                multiTalkControlIconLayout.setEnabled(z);
                aVar.f315023B.setIconEnabled(z);
                return;
            }
            return;
        }
        C105883g gVar = this.f314902v;
        gVar.getClass();
        Log.m105924i("MicroMsg.MT.MultiTalkUIViewModel", "setHandsFreeEnable: " + z);
        gVar.f314948u.postValue(Boolean.valueOf(z));
        if (!z) {
            gVar.mo150905e3(Boolean.FALSE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onActivityResult "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " resultCode "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.MT.MultiTalkMainUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            super.onActivityResult(r17, r18, r19)
            r3 = 0
            r0.f314904x = r3
            r0.f314905y = r3
            r5 = 2
            r6 = 5
            r7 = 1
            r8 = -1
            if (r2 != r8) goto L_0x0215
            if (r1 != r7) goto L_0x0215
            java.lang.String r2 = "Select_Contact"
            r8 = r19
            java.lang.String r2 = r8.getStringExtra(r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "add member "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            java.lang.String r4 = ","
            java.lang.String[] r2 = r2.split(r4)
            java.util.ArrayList r2 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r2)
            if (r2 != 0) goto L_0x005d
            return
        L_0x005d:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r8 = r4.mo150682x()
            if (r8 == 0) goto L_0x0215
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r8 = r4.f314506t
            java.lang.String r8 = r8.f320042d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x0075
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r8 = r4.f314506t
            java.lang.String r8 = r8.f320043e
        L_0x0075:
            r10 = r8
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r8 = r4.f314506t
            java.lang.String r8 = r8.f320044f
            boolean r8 = r4.mo150681w(r8)
            r15 = 4
            java.lang.Object[] r9 = new java.lang.Object[r15]
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r11 = r4.f314506t
            java.lang.String r11 = com.tencent.p014mm.plugin.multitalk.model.C105806i0.m142149b(r11)
            r9[r3] = r11
            java.lang.String r11 = com.tencent.p014mm.plugin.voip.model.v2protocal.m143438u()
            r9[r7] = r11
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r4 = r4.f314506t
            java.lang.String r4 = r4.f320044f
            r9[r5] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            r14 = 3
            r9[r14] = r4
            java.lang.String r4 = "MicroMsg.MT.MultiTalkManager"
            java.lang.String r11 = "addMemberList: %s, wifigateway:%s, groupid:%s, isILink:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r9)
            if (r8 == 0) goto L_0x0144
            com.tencent.mm.plugin.multitalk.ilinkservice.z r4 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            r4.getClass()
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            com.tencent.mm.plugin.multitalk.ilinkservice.s r9 = r4.f314388f
            java.util.ArrayList r9 = r9.mo150549a()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b9:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00ef
            java.lang.Object r10 = r2.next()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Iterator r11 = r9.iterator()
        L_0x00c9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e7
            java.lang.Object r12 = r11.next()
            com.tencent.mm.plugin.multitalk.ilinkservice.r r12 = (com.tencent.p014mm.plugin.multitalk.ilinkservice.C105683r) r12
            java.lang.String r13 = r12.f314239c
            boolean r13 = r10.equals(r13)
            if (r13 == 0) goto L_0x00c9
            int r12 = r12.f314241e
            if (r12 == r7) goto L_0x00e5
            if (r12 == r5) goto L_0x00e5
            if (r12 != r14) goto L_0x00c9
        L_0x00e5:
            r11 = 1
            goto L_0x00e8
        L_0x00e7:
            r11 = 0
        L_0x00e8:
            if (r11 == 0) goto L_0x00eb
            goto L_0x00b9
        L_0x00eb:
            r8.add(r10)
            goto L_0x00b9
        L_0x00ef:
            int r2 = r8.size()
            if (r2 != 0) goto L_0x00f7
            goto L_0x0215
        L_0x00f7:
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r2 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.ipcinvoker.wx_extension.j r2 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r2
            com.tencent.mm.plugin.multitalk.ilinkservice.q r9 = r4.f314394i
            java.lang.String r10 = r4.f314366S0
            java.lang.String r11 = r4.f314368T0
            r9.getClass()
            ob0.c$b r9 = new ob0.c$b
            r9.<init>()
            te3.es4 r12 = new te3.es4
            r12.<init>()
            r9.f127066a = r12
            te3.fs4 r12 = new te3.fs4
            r12.<init>()
            r9.f127067b = r12
            r12 = 6970(0x1b3a, float:9.767E-42)
            r9.f127069d = r12
            java.lang.String r12 = "/cgi-bin/micromsg-bin/voipmtaddmember"
            r9.f127068c = r12
            r9.f127070e = r3
            r9.f127071f = r3
            ob0.c r9 = r9.mo72403a()
            r9.setIsUserCmd(r7)
            ob0.c$c r12 = r9.f127055a
            pe3.a r12 = r12.f127080a
            te3.es4 r12 = (te3.es4) r12
            r12.f133105d = r10
            r12.f133106e = r11
            r12.f133107f = r8
            com.tencent.mm.plugin.multitalk.ilinkservice.p1 r8 = new com.tencent.mm.plugin.multitalk.ilinkservice.p1
            r8.<init>(r4)
            r2.mo63014eH(r9, r8)
            goto L_0x0215
        L_0x0144:
            com.tencent.mm.plugin.multitalk.model.w r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r4 = r4.f314798d
            nw3.e r4 = (nw3.C109779e) r4
            r4.getClass()
            nw3.f r4 = nw3.C109770a.m149092a()
            java.lang.String r4 = r4.f328593p
            boolean r4 = bs3.C104166f.m139003c(r10, r4)
            java.lang.String r8 = "TalkRoomSdkApi"
            if (r4 != 0) goto L_0x0172
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r4 = "addMultiTalkMember groupid is not same; multiTalkGroupid: "
            r2[r3] = r4
            r2[r7] = r10
            nw3.f r4 = nw3.C109770a.m149092a()
            java.lang.String r4 = r4.f328593p
            r2[r5] = r4
            bs3.C104161b.m138997f(r8, r2)
            goto L_0x0215
        L_0x0172:
            nw3.f r4 = nw3.C109770a.m149092a()
            r4.getClass()
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r11 = "addrTalkRoomMember"
            r9[r3] = r11
            r9[r7] = r10
            int r11 = r4.f328597s
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r5] = r11
            long r11 = r4.f328598t
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r9[r14] = r11
            java.lang.String r11 = " users length: "
            r9[r15] = r11
            int r11 = r2.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r6] = r11
            java.lang.String r11 = "TalkRoomService"
            bs3.C104161b.m138997f(r11, r9)
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L_0x0202
            boolean r9 = zr3.C112683i.m154066a()
            if (r9 != 0) goto L_0x01bb
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r4 = "addTalkRoomMember isNetworkConnected is false"
            r2[r3] = r4
            bs3.C104161b.m138997f(r11, r2)
            goto L_0x0202
        L_0x01bb:
            java.lang.String[] r2 = nw3.C109782f.m149153X(r2)
            int r9 = r2.length
            if (r9 > 0) goto L_0x01cc
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r4 = "addTalkRoomMember users is null"
            r2[r3] = r4
            bs3.C104161b.m138997f(r11, r2)
            goto L_0x0202
        L_0x01cc:
            ow3.b r12 = new ow3.b
            int r11 = r4.f328597s
            long r5 = r4.f328598t
            r9 = r12
            r7 = r12
            r12 = r5
            r5 = 3
            r14 = r2
            r9.<init>(r10, r11, r12, r14)
            zr3.e r2 = zr3.C112675e.m154053e()
            boolean r2 = r2.mo164407c(r7)
            nw3.g0 r6 = r4.f328563J
            java.lang.String[] r7 = new java.lang.String[r15]
            java.lang.String r9 = "add"
            r7[r3] = r9
            java.lang.String r9 = "req"
            r10 = 1
            r7[r10] = r9
            java.lang.String r9 = java.lang.String.valueOf(r2)
            r10 = 2
            r7[r10] = r9
            int r4 = r4.f328587g
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r7[r5] = r4
            r6.mo161124a(r7)
            goto L_0x0204
        L_0x0202:
            r10 = 2
            r2 = 0
        L_0x0204:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r5 = "addMultiTalkMember ret: "
            r4[r3] = r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 1
            r4[r5] = r2
            bs3.C104161b.m138997f(r8, r4)
            goto L_0x0216
        L_0x0215:
            r5 = 1
        L_0x0216:
            if (r1 != r5) goto L_0x0247
            com.tencent.mm.plugin.multitalk.ui.widget.a r1 = r0.f314888e
            if (r1 == 0) goto L_0x0247
            boolean r2 = r0.f314906z
            if (r2 == 0) goto L_0x0247
            r0.f314906z = r3
            int r2 = r0.f314883A
            if (r2 != r5) goto L_0x0236
            boolean r2 = r0.f314899s
            if (r2 == 0) goto L_0x0231
            v82.j0 r1 = r0.f314890g
            r3 = 5
            r1.mo163164o(r3)
            goto L_0x0247
        L_0x0231:
            r3 = 5
            r1.mo150966p(r3)
            goto L_0x0247
        L_0x0236:
            r3 = 5
            r4 = 2
            if (r2 != r4) goto L_0x0247
            boolean r2 = r0.f314899s
            if (r2 == 0) goto L_0x0244
            v82.j0 r1 = r0.f314890g
            r1.mo163165p(r3)
            goto L_0x0247
        L_0x0244:
            r1.mo150967q(r3)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        ViewGroup H7;
        super.onConfigurationChanged(configuration);
        if (mo150871J7()) {
            this.f314889f.mo163078e();
            return;
        }
        getWindow().clearFlags(1024);
        getWindow().addFlags(134217728);
        if (this.f314899s) {
            C111456j0 j0Var = this.f314890g;
            j0Var.getClass();
            Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "refreshLayout: ");
            MultiTalkMainUI multiTalkMainUI = j0Var.f333691a;
            if (!(multiTalkMainUI == null || (H7 = multiTalkMainUI.mo150869H7()) == null)) {
                H7.requestLayout();
            }
            C111474m e = j0Var.mo163154e();
            e.getClass();
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "refreshLayout: ");
            e.mo163179d().requestLayout();
            e.mo163178c().requestLayout();
            return;
        }
        C105895a aVar = this.f314888e;
        aVar.getClass();
        if (C105851w0.zx0().mo150684z()) {
            aVar.f315049f.requestLayout();
            if (aVar.f315049f.getAdapter() != null) {
                aVar.f315049f.getAdapter().notifyDataSetChanged();
            }
            aVar.f315051h.requestLayout();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f314902v = (C105883g) C39818r.f106831a.mo62444c(this).mo75002a(C105883g.class);
        ((C89445b) C86312j.m106911c(C89445b.class)).mo123645Ca();
        C105851w0.zx0().mo150638O();
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        int intExtra = getIntent().getIntExtra("enterMainUiSource", 0);
        if (intExtra == 1 || intExtra == 2) {
            overridePendingTransition(C0966R.C0968anim.f2456di, C0966R.C0968anim.f2333y);
        } else {
            overridePendingTransition(C0966R.C0968anim.f2508ew, C0966R.C0968anim.f2509ex);
        }
        hideTitleView();
        getWindow().addFlags(6815872);
        getWindow().addFlags(67108864);
        C105851w0.zx0().mo150656d(false);
        if (!C105851w0.zx0().mo150682x()) {
            finish();
            if (intExtra == 2) {
                getIntent().getStringExtra("enterMainUiWxGroupId");
                return;
            }
            return;
        }
        init();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.f314884B, intentFilter);
        this.f314893j = true;
        this.f314895o = new MMHandler();
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.RECORD_AUDIO", 82, "", "")) {
            Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "has not audio record permission!");
        }
        if (C11171e.m11046c(26)) {
            Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "initScreenObserver");
            this.f314896p = new ScreenActionReceiver();
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            MMApplicationContext.getContext().registerReceiver(this.f314896p, intentFilter2);
        }
        Notification notification = (Notification) getIntent().getParcelableExtra("notification");
        C109938b bVar = new C109938b(new C22663i(this));
        this.f314897q = bVar;
        bVar.mo35648A(9, "VOIPFloatBall");
        C98607d dVar = new C98607d(this);
        this.f314886D = dVar;
        dVar.enable();
        this.f314886D.f289116g = this;
        this.f314901u = false;
    }

    public void onDestroy() {
        C111456j0 j0Var;
        if (this.f314899s && (j0Var = this.f314890g) != null) {
            j0Var.getClass();
            Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onDestroy");
            MultiTalkAvatarLayout c = j0Var.mo163152c();
            c.getClass();
            Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "close");
            for (Map.Entry<String, C111759e> value : c.f315084d.entrySet()) {
                ((C111759e) value.getValue()).f334676b.mo163505c();
            }
        }
        if (this.f314904x || this.f314905y || this.f314906z) {
            C105851w0.zx0().mo150626C(false);
        }
        if (this.f314893j) {
            unregisterReceiver(this.f314884B);
        }
        C111415a1 a1Var = this.f314889f;
        if (a1Var != null) {
            boolean z = C105851w0.zx0().f314477R0;
            C112101k kVar = a1Var.f333536b;
            if (kVar != null) {
                kVar.mo163883s(z);
            }
            C112092f fVar = a1Var.f333537c;
            if (fVar != null) {
                fVar.mo163883s(z);
            }
        }
        this.f314885C.removeCallbacksAndMessages((Object) null);
        this.f314885C.sendEmptyMessage(1);
        Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "unbindVoiceServiceIfNeed");
        try {
            if (C11171e.m11046c(26) && this.f314894n) {
                MMApplicationContext.getContext().unbindService(this);
                this.f314894n = false;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MT.MultiTalkMainUI", e, "unbindVoiceServiceIfNeed error: %s", e.getMessage());
        }
        if (C11171e.m11046c(26)) {
            Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "unInitScreenObserver");
            if (this.f314896p != null) {
                try {
                    MMApplicationContext.getContext().unregisterReceiver(this.f314896p);
                } catch (Exception e2) {
                    Log.m105925i("MicroMsg.MT.MultiTalkMainUI", "unregisterBatteryChange err:%s", e2.getMessage());
                }
                this.f314896p = null;
            }
        }
        mo150869H7().getViewTreeObserver().removeOnGlobalLayoutListener(this.f314900t);
        super.onDestroy();
        C109938b bVar = this.f314897q;
        if (bVar != null) {
            bVar.mo67996A0();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getKeyCode() == 4) {
            if (mo150871J7()) {
                C111415a1 a1Var = this.f314889f;
                C112101k kVar = a1Var.f333536b;
                if (kVar != null) {
                    kVar.mo163881n();
                }
                C112092f fVar = a1Var.f333537c;
                if (fVar != null) {
                    fVar.mo163881n();
                }
            } else {
                C105895a aVar = this.f314888e;
                C105770a aVar2 = aVar.f315050g;
                if (aVar2 != null && aVar2.mo150708j()) {
                    aVar.mo150962m();
                    aVar.f315030I.mo150911e();
                    aVar.f315050g.mo150703e();
                    z = true;
                }
                if (!z) {
                    C76879j.m92739j(this, C0966R.string.gza, C0966R.string.gyg, C0966R.string.f7570jz, C0966R.string.f7926wf, new C105881c(this), (DialogInterface.OnClickListener) null);
                }
            }
            return true;
        }
        if (C105851w0.zx0().f314505s == C111452h1.Inviting) {
            if (i == 25 || i == 24) {
                C105851w0.zx0().mo150648Y();
                this.f314892i = false;
                return true;
            }
        } else if (i == 25) {
            C104323b bVar = C105851w0.zx0().f314469K;
            if (bVar != null) {
                C107043a.m144903a(bVar.f329358h, bVar.mo146013e0(), -1, 5);
            }
            return true;
        } else if (i == 24) {
            C104323b bVar2 = C105851w0.zx0().f314469K;
            if (bVar2 != null) {
                C107043a.m144903a(bVar2.f329358h, bVar2.mo146013e0(), 1, 5);
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        MMHandler mMHandler;
        super.onNewIntent(intent);
        if (C105851w0.zx0().mo150683y() && (mMHandler = this.f314895o) != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
            this.f314895o.postDelayed(this.f314903w, 2000);
        }
        String stringExtra = intent.getStringExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (stringExtra != null) {
            Bundle bundle = new Bundle();
            int lastIndexOf = stringExtra.lastIndexOf(".") + 1;
            if (lastIndexOf >= stringExtra.length()) {
                Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "open file error : file path error");
                return;
            }
            String substring = stringExtra.substring(lastIndexOf);
            bundle.putString(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, stringExtra);
            bundle.putString(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT, substring);
            this.f314889f.mo163076c(2);
            C111415a1 a1Var = this.f314889f;
            a1Var.getClass();
            C105851w0.zx0().f314500o = bundle;
            C112101k kVar = a1Var.f333536b;
            if (kVar != null) {
                kVar.mo163814x(bundle, -1);
            }
            String str = C105851w0.zx0().f314506t.f320042d;
            if (this.f314889f.mo163077d()) {
                if (this.f314899s) {
                    this.f314890g.mo163150a();
                    this.f314890g.mo163151b();
                } else {
                    this.f314887d.mo163083a();
                    this.f314888e.f315030I.setVisibility(4);
                    this.f314888e.mo150952b();
                    this.f314888e.mo150955f(true);
                    View view = this.f314888e.f315048e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f314888e.mo150953d();
                    this.f314888e.mo150957h();
                    C105770a aVar2 = this.f314888e.f315050g;
                    aVar2.getClass();
                    C105851w0.zx0().mo150676q().mo150845i(aVar2);
                }
                this.f314905y = false;
                setRequestedOrientation(4);
            } else if (this.f314899s) {
                this.f314890g.mo163163n();
            } else {
                this.f314887d.mo163083a();
                this.f314888e.mo150958i(C105851w0.zx0().f314506t);
                this.f314888e.mo150959j();
            }
        }
    }

    public void onOrientationChange(int i) {
        if (mo150871J7()) {
            C111415a1 a1Var = this.f314889f;
            a1Var.getClass();
            C111415a1.C111416a aVar = C111415a1.f333534e;
            if (aVar.mo163079a(this) != a1Var.f333538d) {
                a1Var.mo163078e();
                if (aVar.mo163079a(this) == 90 || aVar.mo163079a(this) == 270) {
                    C105853x.f314830h++;
                    return;
                }
                return;
            }
            return;
        }
        this.f314888e.mo150951a(i);
    }

    public void onPause() {
        C109938b bVar;
        C105851w0.zx0().mo150647X();
        super.onPause();
        boolean z = (hasWindowFocus() || !((KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()) && ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).isScreenOn();
        this.f314891h = z;
        Log.m105925i("MicroMsg.MT.MultiTalkMainUI", "onPause, screenOn: %b", Boolean.valueOf(z));
        if (C105851w0.zx0().mo150683y() && !this.f314899s) {
            this.f314888e.mo150972v(true);
        }
        if (this.f314905y || this.f314904x || this.f314906z || mo150871J7()) {
            if (mo150871J7() && (bVar = this.f314897q) != null && !this.f314906z) {
                ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(true);
                BallInfo ballInfo = bVar.f311726d;
                ballInfo.f311683H.f311721j = 4;
                C112181e eVar = bVar.f311729g;
                if (eVar != null) {
                    eVar.mo149088F(ballInfo);
                }
            }
            C103928o.m138641a(true, true, true);
        } else {
            C109938b bVar2 = this.f314897q;
            if (bVar2 != null) {
                bVar2.mo64001C();
                C103928o.m138642b();
            }
        }
        if (mo150871J7()) {
            C109935a aVar = C109935a.C109937b.f328933a;
            aVar.getClass();
            Log.m105925i("MicroMsg.VoipFloatBallHelper", "updateHideWhenAppBackground %b", Boolean.TRUE);
            BallInfo ballInfo2 = aVar.f311726d;
            if (ballInfo2 != null) {
                ballInfo2.f311685J = true;
                aVar.mo68414O();
                return;
            }
            return;
        }
        C109935a aVar2 = C109935a.C109937b.f328933a;
        aVar2.getClass();
        Log.m105925i("MicroMsg.VoipFloatBallHelper", "updateHideWhenAppBackground %b", Boolean.FALSE);
        BallInfo ballInfo3 = aVar2.f311726d;
        if (ballInfo3 != null) {
            ballInfo3.f311685J = false;
            aVar2.mo68414O();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            Log.m105921e("MicroMsg.MT.MultiTalkMainUI", "[multitalk]onRequestPermissionsResult %d data is invalid", Integer.valueOf(i));
            return;
        }
        Log.m105919d("MicroMsg.MT.MultiTalkMainUI", "[multitalk] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 22) {
            if (i == 82) {
                if (iArr[0] == 0) {
                    Log.m105918d("MicroMsg.MT.MultiTalkMainUI", "granted record audio!");
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C85295h(), new C85296i(this));
            }
        } else if (iArr[0] == 0) {
            Log.m105918d("MicroMsg.MT.MultiTalkMainUI", "granted record camera!");
        } else {
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C85297j(), new C85294a(this));
        }
    }

    public void onResume() {
        Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "onResume");
        super.onResume();
        this.f314898r = false;
        C105851w0.zx0().f314477R0 = false;
        C105851w0.zx0().f314462D = this;
        C105851w0.vx0().f314746h = this;
        mo150869H7().getViewTreeObserver().addOnGlobalLayoutListener(this.f314900t);
        C105799g0 o = C105851w0.zx0().mo150672o();
        ArrayList<String> arrayList = o.f314613c;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C105814l lVar = o.f314611a;
                if (lVar != null) {
                    lVar.mo150714c(next);
                }
            }
        }
        mo150872K7();
        C109938b bVar = this.f314897q;
        if (bVar != null && !this.f314906z) {
            bVar.mo78184B0();
            C103928o.m138641a(true, false, true);
        }
        C81591s sVar = (C81591s) C86312j.m106911c(C81591s.class);
        if (sVar != null) {
            sVar.B20();
            sVar.Vd0();
        }
        C112181e pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        if (pY != null) {
            pY.mo149108Z(new BallInfo(6, "MusicFloatBall", (JSONObject) null));
        }
        if (C105851w0.zx0().mo150683y()) {
            this.f314895o.postDelayed(this.f314903w, 2000);
        }
        if (mo150871J7()) {
            C105851w0.zx0().mo150657d0(101);
            C105851w0.zx0().f314498j = true;
            C105851w0.zx0().f314499n = false;
        } else {
            boolean booleanExtra = getIntent().getBooleanExtra("enterMainUIScreenProjectOnline", false);
            Bundle bundleExtra = getIntent().getBundleExtra("enterMainUIScreenProjectParams");
            if (booleanExtra && bundleExtra != null) {
                this.f314889f.mo163076c(2);
                C111415a1 a1Var = this.f314889f;
                a1Var.getClass();
                C105851w0.zx0().f314500o = bundleExtra;
                C112101k kVar = a1Var.f333536b;
                if (kVar != null) {
                    kVar.mo163814x(bundleExtra, -1);
                }
                if (this.f314889f.mo163077d()) {
                    if (this.f314899s) {
                        this.f314890g.mo163150a();
                        this.f314890g.mo163151b();
                    } else {
                        this.f314888e.mo150952b();
                        this.f314887d.mo163083a();
                        this.f314888e.f315030I.setVisibility(4);
                        this.f314888e.mo150955f(true);
                        this.f314888e.mo150953d();
                        this.f314888e.mo150957h();
                    }
                    this.f314905y = false;
                    setRequestedOrientation(4);
                    return;
                }
                this.f314887d.mo163083a();
                if (this.f314899s) {
                    this.f314890g.mo163163n();
                    return;
                }
                this.f314888e.mo150958i(C105851w0.zx0().f314506t);
                this.f314888e.mo150959j();
                return;
            }
        }
        int ordinal = C105851w0.zx0().f314505s.ordinal();
        if (ordinal == 1) {
            this.f314888e.mo150953d();
            if (this.f314899s) {
                this.f314890g.mo163151b();
            }
            this.f314887d.mo163084b(C105851w0.zx0().f314506t);
            if (NetStatusUtil.is4G(this)) {
                C105851w0.Dx0().mo150749a(this);
            } else if (NetStatusUtil.is2G(this) || NetStatusUtil.is3G(this)) {
                C105804h0 Dx0 = C105851w0.Dx0();
                if (!Dx0.f314623a) {
                    Dx0.f314623a = true;
                    C75346e.m90356b(this, C0966R.string.h0d, (Runnable) null);
                }
            }
            if (this.f314892i) {
                C105851w0.zx0().mo150645V(false);
            }
        } else if (ordinal == 2 || ordinal == 3) {
            this.f314887d.mo163083a();
            if (this.f314899s) {
                this.f314890g.mo163163n();
            } else {
                this.f314888e.mo150958i(C105851w0.zx0().f314506t);
            }
            if (NetStatusUtil.is4G(this)) {
                C105851w0.Dx0().mo150749a(this);
            } else if (NetStatusUtil.is2G(this) || NetStatusUtil.is3G(this)) {
                C105804h0 Dx02 = C105851w0.Dx0();
                if (!Dx02.f314623a) {
                    Dx02.f314623a = true;
                    C75346e.m90356b(this, C0966R.string.h0d, (Runnable) null);
                }
            }
            C105851w0.zx0().mo150645V(true);
        } else if (ordinal == 4) {
            if (this.f314889f.mo163077d()) {
                this.f314887d.mo163083a();
                if (this.f314899s) {
                    this.f314890g.mo163151b();
                    return;
                }
                this.f314888e.mo150955f(true);
                this.f314888e.mo150953d();
                return;
            }
            this.f314887d.mo163083a();
            if (this.f314899s) {
                this.f314890g.mo163163n();
                return;
            }
            this.f314888e.mo150958i(C105851w0.zx0().f314506t);
            this.f314888e.mo150959j();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onStop() {
        if (mo150871J7() && this.f314891h) {
            C105851w0.zx0().mo150657d0(102);
            C105851w0.zx0().f314498j = false;
            C105851w0.zx0().f314499n = true;
            C105851w0.zx0().mo150655c0(1, true);
        }
        if (!this.f314904x && !this.f314905y && !this.f314906z && this.f314891h && !this.f314898r && !this.f314901u) {
            C105851w0.zx0().mo150626C(false);
        }
        super.onStop();
    }

    /* renamed from: p4 */
    public void mo150764p4(int i, int i2) {
        CopyOnWriteArrayList<C107025a> copyOnWriteArrayList;
        MultitalkFrameView multitalkFrameView;
        int i3 = i;
        int i4 = i2;
        if (C105851w0.zx0().mo150683y()) {
            if (!this.f314899s) {
                C105895a aVar = this.f314888e;
                aVar.getClass();
                if (!C105806i0.m142154g(i2)) {
                    if (C105806i0.m142154g(i)) {
                        aVar.f315066z.setChecked(false);
                        aVar.f315050g.mo150710l(C75592q0.m90789s(), 0);
                        View view = aVar.f315064x;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    aVar.mo150972v(false);
                } else if (C105806i0.m142154g(i2) && !C105806i0.m142154g(i)) {
                    aVar.f315066z.setChecked(true);
                    aVar.f315050g.mo150710l(C75592q0.m90789s(), 1);
                    View view3 = aVar.f315064x;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    aVar.mo150974x();
                }
                HashSet hashSet = new HashSet(C105851w0.zx0().f314503q);
                if (!(i4 == 1 || i4 == 3)) {
                    if (i3 == 1 || i3 == 3) {
                        C105770a aVar4 = aVar.f315050g;
                        aVar4.getClass();
                        C111424d dVar = aVar4.f314545i;
                        if (!(dVar == null || (copyOnWriteArrayList = dVar.f333577e) == null)) {
                            Iterator<C107025a> it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                String str = it.next().f320414a.f320048d;
                                C87412m.m108593f(str, "it.member.usrName");
                                C111433e f = aVar4.mo150704f(str);
                                if (!(f == null || (multitalkFrameView = f.f333625z) == null)) {
                                    if (!(multitalkFrameView.getUsername() != null && !C87412m.m108589b(C75592q0.m90789s(), multitalkFrameView.getUsername()))) {
                                        multitalkFrameView = null;
                                    }
                                    if (multitalkFrameView != null) {
                                        if (!hashSet.contains(multitalkFrameView.getUsername())) {
                                            aVar4.mo150710l(multitalkFrameView.getUsername(), 0);
                                        } else {
                                            if (multitalkFrameView.f314989p == MultitalkFrameView.C105888b.Avatar) {
                                                aVar4.mo150710l(multitalkFrameView.getUsername(), 1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i4 == 1 || i4 == 3) {
                        if (!(i3 == 1 || i3 == 3)) {
                            aVar.mo150961l(hashSet);
                        }
                    }
                }
            }
            mo150872K7();
        }
    }

    /* renamed from: r */
    public void mo150765r() {
        C105895a aVar = this.f314888e;
        if (aVar == null) {
            return;
        }
        if (this.f314899s) {
            this.f314890g.mo163165p(10);
        } else {
            aVar.mo150967q(10);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C39741a.class);
    }

    /* renamed from: u6 */
    public boolean mo150766u6() {
        if (this.f314899s) {
            return Boolean.TRUE.equals(this.f314902v.f314939i.getValue());
        }
        if (this.f314888e != null) {
            return C105851w0.vx0().mo150809d();
        }
        return false;
    }

    /* renamed from: v6 */
    public void mo150767v6() {
        Log.m105924i("MicroMsg.MT.MultiTalkMainUI", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + C105851w0.zx0().f314503q.size());
        if (C105851w0.zx0().mo150683y()) {
            HashSet<String> hashSet = C105851w0.zx0().f314503q;
            boolean z = false;
            if (hashSet.size() <= 0) {
                MultiTalkManager zx02 = C105851w0.zx0();
                zx02.getClass();
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkDataSource");
                C105817m0 m0Var = zx02.f314507u;
                if (m0Var != null) {
                    m0Var.mo150792e();
                }
                if (zx02.mo150671n() != null) {
                    C105783b0 n = zx02.mo150671n();
                    n.getClass();
                    Log.printInfoStack("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeVideo", new Object[0]);
                    C107496d dVar = n.f314574b;
                    if (dVar != null) {
                        Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
                        C105724z.INSTANCE.mo150586B((C105713v2) null);
                        dVar.f321616c = false;
                    }
                }
            } else if (hashSet.size() != 1 || !hashSet.contains(C75592q0.m90789s())) {
                C105851w0.zx0().mo150644U();
            } else {
                C105851w0.zx0().mo150647X();
            }
            if (!mo150871J7() && !this.f314899s) {
                C105895a aVar = this.f314888e;
                if (!aVar.f315050g.mo150708j()) {
                    HashSet hashSet2 = new HashSet(C105851w0.zx0().f314503q);
                    int i = C105851w0.zx0().f314496h;
                    if (i == 1 || i == 3) {
                        z = true;
                    }
                    if (z) {
                        aVar.mo150961l(hashSet2);
                    }
                    int size = hashSet2.size();
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(220, 19, 1, false);
                    nVar.idkeyStat(220, 20, (long) size, false);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo150768w() {
        C105895a aVar = this.f314888e;
        if (aVar == null) {
            return;
        }
        if (this.f314899s) {
            this.f314890g.mo163164o(10);
        } else {
            aVar.mo150966p(10);
        }
    }

    /* renamed from: x0 */
    public void mo150769x0(boolean z) {
        if (C105851w0.zx0().mo150683y() && !this.f314899s) {
            C105895a aVar = this.f314888e;
            aVar.getClass();
            Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSpeakerStateChange: %s", Boolean.valueOf(z));
            ((C119157j) C119157j.f356862d).mo183895z(new C111470k1(aVar, z));
        }
    }

    /* renamed from: y3 */
    public void mo150770y3(C111452h1 h1Var, C111452h1 h1Var2) {
        if (h1Var2 != C111452h1.Talking) {
            return;
        }
        if (this.f314899s) {
            boolean z = !C110248b.zx0() && !C110248b.Jh0();
            C105883g gVar = this.f314902v;
            gVar.getClass();
            Log.m105924i("MicroMsg.MT.MultiTalkUIViewModel", "updateIconState: cameraEnable " + true + ", speakerOn " + z);
            gVar.f314950w.postValue(Boolean.TRUE);
            gVar.f314936f.postValue(Boolean.valueOf(z));
            return;
        }
        C105895a aVar = this.f314888e;
        if (aVar.f315044X > 0) {
            aVar.f315044X = System.currentTimeMillis();
        }
    }
}
