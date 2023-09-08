package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import ck3.C67391b;
import com.tencent.p014mm.autogen.events.OPPOFloatWindowModeChangedEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C74860u1;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.vendor.OnePlus;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86737h0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p206nj.C76866m;
import p504em.C75626b;
import p873bx.C67323a;
import s00.C90110f;
import xi3.C15692e;
import xi3.C15699h;
import xi3.C26539c;
import zj3.C79348e;
import zj3.C79362h1;
import zj3.C79365j;
import zj3.C79368l;
import zj3.C79376p0;

@C86737h0
/* renamed from: com.tencent.mm.ui.chatting.ChattingUI */
public class ChattingUI extends MMSecDataFragmentActivity {

    /* renamed from: r */
    public static final /* synthetic */ int f215276r = 0;

    /* renamed from: j */
    public ChattingUIFragment f215277j;

    /* renamed from: n */
    public MMHandler f215278n = new MMHandler();

    /* renamed from: o */
    public String f215279o = "";

    /* renamed from: p */
    public C73849t3 f215280p = null;

    /* renamed from: q */
    public boolean f215281q = false;

    /* renamed from: N7 */
    public static int m86391N7(C72996z1 z1Var, C67391b bVar) {
        Class cls = C79365j.class;
        if (z1Var == null || bVar == null) {
            return -1;
        }
        String username = z1Var.getUsername();
        if ("notification_messages".equals(username) || "notifymessage".equals(username)) {
            return 0;
        }
        if (z1Var.mo62916m3()) {
            C79348e eVar = (C79348e) bVar.f193278b.mo102812a(C79348e.class);
            if (eVar != null) {
                return eVar.mo70071q1() ? eVar.mo70075s4() ? 2 : 1 : z1Var.mo62918n3() ? 4 : 5;
            }
            return -1;
        } else if (bVar.f193278b.mo102812a(cls) == null || !((C79365j) bVar.f193278b.mo102812a(cls)).mo70105e4()) {
            return bVar.mo91582w() ? C45628s0.m50748M(username) ? 10 : 7 : C72996z1.m85843n5(username) ? 9 : 6;
        } else {
            return 8;
        }
    }

    /* renamed from: O7 */
    public static int m86392O7(int i, C67391b bVar) {
        if (bVar == null) {
            return 0;
        }
        boolean b = ((C79362h1) bVar.f193278b.mo102812a(C79362h1.class)).mo102332b();
        if (i == 1 || i == 2 || i == 4 || i == 5 || i == 6 || i == 7) {
            return b ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: M7 */
    public ChattingUIFragment mo101990M7() {
        return new ChattingUIFragment(true);
    }

    /* renamed from: P7 */
    public final void mo102073P7() {
        if (!this.f215281q) {
            for (UIComponent next : activeUIComponents(true)) {
                if (next instanceof C73849t3) {
                    this.f215280p = (C73849t3) next;
                }
            }
            this.f215281q = true;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Log.m105919d("MicroMsg.ChattingUI", "chatting ui dispatch key event %s", keyEvent);
        ChattingUIFragment chattingUIFragment = this.f215277j;
        if (chattingUIFragment == null || !chattingUIFragment.onKeyDown(keyEvent.getKeyCode(), keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void finish() {
        Class cls = C79376p0.class;
        ChattingUIFragment chattingUIFragment = this.f215277j;
        if (chattingUIFragment != null && ((C79376p0) chattingUIFragment.f215220f.f193278b.mo102812a(cls)).mo102698q2() && !((C79376p0) this.f215277j.f215220f.f193278b.mo102812a(cls)).mo102697q0()) {
            int B5 = ((C79376p0) this.f215277j.f215220f.f193278b.mo102812a(cls)).mo102688B5();
            getIntent().putExtra("select_record_msg_num", B5);
            Set<Long> p3 = ((C79368l) this.f215277j.f215220f.f193278b.mo102812a(C79368l.class)).mo108206p3();
            if (p3 != null) {
                long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
                for (Long next : p3) {
                    if (next.longValue() < j) {
                        j = next.longValue();
                    }
                }
                getIntent().putExtra("select_record_min_msg_id", j);
            }
            CopyOnWriteArraySet<Long> x0 = ((C79376p0) this.f215277j.f215220f.f193278b.mo102812a(cls)).mo102699x0();
            if (x0 != null) {
                ArrayList arrayList = new ArrayList();
                for (Long longValue : x0) {
                    long longValue2 = longValue.longValue();
                    arrayList.add(longValue2 + "");
                }
                getIntent().putStringArrayListExtra("key_select_record_msg_black_list", arrayList);
            }
            Log.m105925i("MicroMsg.ChattingUI", "select record msg %s", Integer.valueOf(B5));
            setResult(-1, getIntent());
        }
        super.finish();
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet();
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            hashSet.addAll(importUIComponents);
        }
        hashSet.add(C15699h.class);
        hashSet.add(C26539c.class);
        hashSet.add(C15692e.class);
        hashSet.add(C67323a.class);
        return hashSet;
    }

    public boolean isCallSuperOnSaveInstanceState() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_media_opt_saveinstance, true) && (C85875k4.m106157N() || C85875k4.m106210y());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f215277j.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C76866m.m92674c() || OnePlus.isOnePlus() || C76866m.m92675d()) {
            OPPOFloatWindowModeChangedEvent oPPOFloatWindowModeChangedEvent = new OPPOFloatWindowModeChangedEvent();
            oPPOFloatWindowModeChangedEvent.f193773d.f193774a = configuration.toString().contains("mWindowingMode=100");
            Log.m105925i("MicroMsg.ChattingUI", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", Boolean.valueOf(oPPOFloatWindowModeChangedEvent.f193773d.f193774a));
            oPPOFloatWindowModeChangedEvent.publish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            android.view.Window r0 = r10.getWindow()
            r1 = -2
            r0.setFormat(r1)
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r0 != 0) goto L_0x0011
            com.tencent.p014mm.p136ui.C85875k4.m106160Q()
        L_0x0011:
            r0 = 0
            super.onCreate(r0)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r2 = "Chat_User"
            java.lang.String r3 = r1.getStringExtra(r2)
            java.lang.String r4 = "key_is_biz_chat"
            r5 = 0
            boolean r4 = r1.getBooleanExtra(r4, r5)
            java.lang.String r6 = "MicroMsg.ChattingUI.BizComponent"
            r7 = 1
            if (r4 != 0) goto L_0x0035
            if (r3 != 0) goto L_0x0035
            java.lang.String r1 = "talker is null !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
        L_0x0033:
            r1 = 1
            goto L_0x004a
        L_0x0035:
            if (r4 == 0) goto L_0x0049
            r3 = -1
            java.lang.String r8 = "key_biz_chat_id"
            long r8 = r1.getLongExtra(r8, r3)
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "bizChatId is null !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x0033
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r10.finish()
            return
        L_0x0050:
            r1 = 2131493806(0x7f0c03ae, float:1.8611103E38)
            r10.setContentView((int) r1)
            com.tencent.mm.ui.chatting.ChattingUIFragment r1 = r10.mo101990M7()
            r10.f215277j = r1
            r10.mo102073P7()
            com.tencent.mm.ui.chatting.t3 r1 = r10.f215280p
            if (r1 == 0) goto L_0x0067
            com.tencent.mm.ui.chatting.ChattingUIFragment r3 = r10.f215277j
            r1.f216725f = r3
        L_0x0067:
            android.content.Intent r1 = r10.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r3 = "FROM_CHATTING_ACTIVITY"
            r1.putBoolean(r3, r7)
            com.tencent.mm.ui.chatting.ChattingUIFragment r3 = r10.f215277j
            r3.setArguments(r1)
            androidx.fragment.app.FragmentManager r3 = r10.getSupportFragmentManager()
            androidx.fragment.app.c0 r3 = r3.beginTransaction()
            r4 = 2131309335(0x7f093317, float:1.823695E38)
            com.tencent.mm.ui.chatting.ChattingUIFragment r6 = r10.f215277j
            r3.mo165167i(r4, r6, r0, r7)
            r3.mo165162d()
            androidx.appcompat.app.ActionBar r0 = r10.getSupportActionBar()
            r0.mo91094L()
            if (r11 == 0) goto L_0x00a5
            java.lang.Class<rw.l> r0 = p232rw.C77572l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rw.l r0 = (p232rw.C77572l) r0
            com.tencent.mm.ui.chatting.ChattingUI$$a r3 = new com.tencent.mm.ui.chatting.ChattingUI$$a
            r3.<init>(r10)
            r0.mo107611FI(r10, r11, r3)
        L_0x00a5:
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r0 = "resend_fail_messages"
            boolean r11 = r11.getBooleanExtra(r0, r5)
            if (r11 == 0) goto L_0x00c4
            com.tencent.mm.ui.chatting.ChattingUI$$b r11 = new com.tencent.mm.ui.chatting.ChattingUI$$b
            r11.<init>(r10)
            r3 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r11, r3)
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r0 = "is_need_resend_sns"
            r11.putExtra(r0, r5)
        L_0x00c4:
            boolean r11 = r10.supportNavigationSwipeBack()
            if (r11 == 0) goto L_0x00cd
            r10.initNavigationSwipeBack()
        L_0x00cd:
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f215278n
            com.tencent.mm.ui.chatting.ChattingUI$$c r0 = new com.tencent.mm.ui.chatting.ChattingUI$$c
            r0.<init>(r10)
            r11.post(r0)
            com.tencent.p014mm.plugin.account.bind.p021ui.BindMobilePolicyUI.m161789S7()
            com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.m7005a()
            java.lang.String r11 = r1.getString(r2)
            r10.f215279o = r11
            java.lang.Class<l31.e> r11 = l31.C61212e.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            l31.e r11 = (l31.C61212e) r11
            java.lang.String r0 = r1.getString(r2)
            java.lang.String r2 = "wx_username"
            l31.e r11 = r11.y50(r10, r2, r0)
            com.tencent.mm.ui.chatting.ChattingUI$$d r0 = new com.tencent.mm.ui.chatting.ChattingUI$$d
            r0.<init>(r10, r1)
            r11.E60(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.ChattingUI.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Log.m105919d("MicroMsg.ChattingUI", "chatting ui on key down, %d, %s", Integer.valueOf(i), keyEvent);
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Log.m105918d("MicroMsg.ChattingUI", "chatting ui on key up");
        return super.onKeyUp(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (C85875k4.m106208w()) {
            ((MMNotification) C97625j3.m125816f()).f194725l = false;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105924i("MicroMsg.ChattingUI", "chatting onRequestPermissionsResult");
        this.f215277j.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        Class cls = C61212e.class;
        super.onResume();
        if (((C75626b) C86312j.m106911c(C75626b.class)).mo58021Xy()) {
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        }
        if (C85875k4.m106208w()) {
            ((MMNotification) C97625j3.m125816f()).f194725l = true;
        }
        int N7 = m86391N7(C97625j3.m125812b().mo105907v().get(this.f215279o), this.f215277j.f215220f);
        if (N7 == 6) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_Single).mo86179qs(this, C76986a.SingleChat).mo86136FZ(this, "ChattingUI_Single");
        } else if (N7 == 7) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_Group).mo86179qs(this, C76986a.GroupChat).mo86136FZ(this, "ChattingUI_Group");
        } else if (N7 == 9) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_EnterpriseSingle).mo86179qs(this, C76986a.EnterpriseSingle).mo86136FZ(this, "ChattingUI_EnterpriseSingle");
        } else if (N7 == 10) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_EnterpriseGroup).mo86179qs(this, C76986a.EnterpriseGroup).mo86136FZ(this, "ChattingUI_EnterpriseGroup");
        } else if (N7 == 4 || N7 == 5) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_Service).mo86179qs(this, C76986a.ServiceChat).mo86136FZ(this, "ChattingUI_Service");
        } else if (N7 == 0) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_NotifyMessages).mo86179qs(this, C76986a.ServiceNotification).mo86136FZ(this, "ChattingUI_NotifyMessages");
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(intent == null || intent.getComponent() == null)) {
            C74860u1.f220100a.mo104087a(intent.getComponent().getClassName());
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public boolean supportNavigationSwipeBack() {
        mo102073P7();
        if (this.f215280p != null) {
            return false;
        }
        return super.supportNavigationSwipeBack();
    }
}
