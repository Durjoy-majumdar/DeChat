package com.tencent.p014mm.plugin.voip.model;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import b43.C104031a;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.autogen.events.WearVoipControllerEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipButtonStatusStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106359m0;
import com.tencent.p014mm.plugin.voip.p475ui.C106447f;
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderTextureView;
import com.tencent.p014mm.plugin.voip.widget.C106510c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import e43.C107225c;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import h43.C108060a0;
import h43.C108065b0;
import h43.C108071e;
import h43.C108077f0;
import h43.C108086g0;
import h43.C108088h0;
import h43.C108089i;
import h43.C108091j;
import h43.C108099m0;
import h43.C108113t;
import h43.C108115u;
import h43.C108117v;
import h43.C108121v0;
import h43.C108125x;
import h43.C108126x0;
import h43.C108127y;
import h43.C108128y0;
import h43.C108133z;
import h81.C32735h;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import k20.C60958c;
import k20.C9556a;
import l33.C109246a;
import l33.C109247e;
import lc3.C10485b;
import lu3.C34379c;
import nj2.C109749c;
import nj3.C76879j;
import p003ay.C0235b;
import p212oe.C117770m;
import p33.C110140b;
import p33.C110152e;
import p492dn.C107054l;
import p910lj.C76701a;
import qo3.C77398g;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110823p;
import t33.C110901b;
import v33.C111384c;
import w33.C111717b;
import w33.C111720c0;
import w33.C111725u;
import w33.C111730z;
import x33.C38447a;
import z33.C112581a;
import z33.C112584c;
import z33.C112586d;
import z33.C112592e;
import z33.C112595h;
import z33.C112597j;
import z33.C112598k;
import z33.C112604l;
import z33.C112605m;
import z33.C91617n;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr */
public class NewVoipMgr extends C109246a implements C108071e {

    /* renamed from: d1 */
    public static int f317049d1;

    /* renamed from: e1 */
    public static int[] f317050e1 = new int[2];

    /* renamed from: A */
    public C107054l.C107055a f317051A;

    /* renamed from: B */
    public long f317052B = -1;

    /* renamed from: C */
    public boolean f317053C = false;

    /* renamed from: D */
    public boolean f317054D = false;

    /* renamed from: E */
    public int f317055E;

    /* renamed from: F */
    public int f317056F = 0;

    /* renamed from: G */
    public long f317057G = -1;

    /* renamed from: H */
    public boolean f317058H = false;

    /* renamed from: I */
    public C106510c f317059I;

    /* renamed from: J */
    public boolean f317060J = false;

    /* renamed from: K */
    public boolean f317061K = false;

    /* renamed from: L */
    public String f317062L = null;

    /* renamed from: M */
    public long f317063M = 0;

    /* renamed from: N */
    public long f317064N = 0;

    /* renamed from: P */
    public int f317065P = 0;

    /* renamed from: Q */
    public boolean f317066Q = false;

    /* renamed from: Q0 */
    public boolean f317067Q0 = false;

    /* renamed from: R */
    public boolean f317068R = false;

    /* renamed from: R0 */
    public C112584c f317069R0 = new C112584c();

    /* renamed from: S */
    public int f317070S = 0;

    /* renamed from: S0 */
    public C34379c f317071S0 = null;

    /* renamed from: T */
    public int f317072T = 0;

    /* renamed from: T0 */
    public boolean f317073T0 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_cancel_fullscreen_notification_when_init_voip_mgr, true);

    /* renamed from: U */
    public int f317074U = 0;

    /* renamed from: U0 */
    public C117770m f317075U0;

    /* renamed from: V */
    public int f317076V = 0;

    /* renamed from: V0 */
    public BroadcastReceiver f317077V0 = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            PowerManager powerManager = (PowerManager) MMApplicationContext.getContext().getSystemService("power");
            boolean z = true;
            if ("android.intent.action.USER_PRESENT".equals(action) && powerManager.isScreenOn()) {
                C108077f0 f0Var = NewVoipMgr.this.f317092g;
                if (f0Var != null) {
                    f0Var.mo158499n(false);
                    NewVoipMgr.this.f317092g.f323643c = false;
                    if (!C109247e.vx0().f333451k) {
                        C109247e.xx0().f317332a.mo152670o(false);
                    }
                    NewVoipMgr.this.f317092g.mo158494i(false);
                }
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                C108077f0 f0Var2 = NewVoipMgr.this.f317092g;
                if (f0Var2 != null) {
                    f0Var2.mo158499n(false);
                    NewVoipMgr.this.f317092g.f323643c = false;
                    if (!C109247e.vx0().f333451k) {
                        C109247e.xx0().f317332a.mo152670o(false);
                    }
                    NewVoipMgr.this.f317092g.mo158494i(false);
                }
                NewVoipMgr.this.f317089d.onSensorEvent(true);
            } else {
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C108077f0 f0Var3 = NewVoipMgr.this.f317092g;
                    if (f0Var3 != null) {
                        f0Var3.f323643c = true;
                        f0Var3.mo158494i(true);
                        NewVoipMgr.this.f317092g.mo158499n(true);
                        C109247e.xx0().f317332a.mo152670o(true);
                    }
                    NewVoipMgr newVoipMgr = NewVoipMgr.this;
                    if (!newVoipMgr.f317094i) {
                        newVoipMgr.f317089d.onSensorEvent(true);
                    }
                    NewVoipMgr.this.mo152463c1();
                }
                z = false;
            }
            NewVoipMgr.this.mo149989X0(z);
        }
    };

    /* renamed from: W */
    public boolean f317078W = false;

    /* renamed from: W0 */
    public IListener f317079W0;

    /* renamed from: X */
    public NetChangedBroadcastReceiver f317080X;

    /* renamed from: X0 */
    public int f317081X0;

    /* renamed from: Y */
    public PhoneStateListener f317082Y;

    /* renamed from: Y0 */
    public long f317083Y0;

    /* renamed from: Z */
    public MMHandler f317084Z = new MMHandler("getSignalStrength");

    /* renamed from: Z0 */
    public boolean f317085Z0;

    /* renamed from: a1 */
    public long f317086a1;

    /* renamed from: b1 */
    public PhoneStateListener f317087b1;

    /* renamed from: c1 */
    public IListener f317088c1;

    /* renamed from: d */
    public C112592e f317089d;

    /* renamed from: e */
    public C112605m f317090e;

    /* renamed from: f */
    public TelephonyManager f317091f;

    /* renamed from: g */
    public C108077f0 f317092g;

    /* renamed from: h */
    public volatile C106447f f317093h;

    /* renamed from: i */
    public boolean f317094i = true;

    /* renamed from: j */
    public boolean f317095j = false;

    /* renamed from: n */
    public boolean f317096n = false;

    /* renamed from: o */
    public Object f317097o = new Object();

    /* renamed from: p */
    public String f317098p;

    /* renamed from: p0 */
    public TelephonyManager f317099p0 = null;

    /* renamed from: q */
    public C72996z1 f317100q;

    /* renamed from: r */
    public boolean f317101r;

    /* renamed from: s */
    public boolean f317102s;

    /* renamed from: t */
    public int f317103t;

    /* renamed from: u */
    public long f317104u;

    /* renamed from: v */
    public long f317105v;

    /* renamed from: w */
    public boolean f317106w = false;

    /* renamed from: x */
    public int f317107x = 4096;

    /* renamed from: x0 */
    public long f317108x0 = 0;

    /* renamed from: y */
    public boolean f317109y = false;

    /* renamed from: y0 */
    public long f317110y0 = 0;

    /* renamed from: z */
    public boolean f317111z = false;

    /* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$CleanRunnable */
    public class CleanRunnable implements Runnable {
        public CleanRunnable() {
        }

        public void run() {
            NewVoipMgr.this.mo152431J0();
            NewVoipMgr.this.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$NetChangedBroadcastReceiver */
    public class NetChangedBroadcastReceiver extends BroadcastReceiver {
        public NetChangedBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                int e = C112597j.m153940e(context);
                if (e == 4) {
                    NewVoipMgr newVoipMgr = NewVoipMgr.this;
                    if (newVoipMgr.f317076V != 4) {
                        int[] iArr = NewVoipMgr.f317050e1;
                        int i = iArr[0];
                        if (newVoipMgr.f317081X0 == 0) {
                            newVoipMgr.mo152446S0(5);
                        }
                        NewVoipMgr newVoipMgr2 = NewVoipMgr.this;
                        int i2 = newVoipMgr2.f317081X0;
                        if (i2 != 0) {
                            int i3 = NewVoipMgr.f317049d1 / i2;
                            newVoipMgr2.mo152446S0(4);
                            int i4 = iArr[1];
                            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "befor change to wifi and cost " + NewVoipMgr.this.f317108x0);
                            boolean z = NewVoipMgr.this.f317101r ^ true;
                            C112597j.m153946k(z ? 1 : 0, System.currentTimeMillis(), NewVoipMgr.this.f317076V, 4, i, i4, i3);
                            NewVoipMgr newVoipMgr3 = NewVoipMgr.this;
                            newVoipMgr3.f317078W = true;
                            newVoipMgr3.f317076V = 4;
                            NewVoipMgr.f317049d1 = 0;
                            newVoipMgr3.f317081X0 = 0;
                        }
                    }
                } else if (e == 5 || e == 6) {
                    NewVoipMgr newVoipMgr4 = NewVoipMgr.this;
                    if (newVoipMgr4.f317076V != 5) {
                        int[] iArr2 = NewVoipMgr.f317050e1;
                        int i5 = iArr2[1];
                        if (newVoipMgr4.f317081X0 == 0) {
                            newVoipMgr4.mo152446S0(4);
                        }
                        NewVoipMgr newVoipMgr5 = NewVoipMgr.this;
                        int i6 = newVoipMgr5.f317081X0;
                        if (i6 != 0) {
                            int i7 = NewVoipMgr.f317049d1 / i6;
                            newVoipMgr5.mo152446S0(5);
                            int i8 = iArr2[0];
                            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "befor change to 4G and cost " + NewVoipMgr.this.f317108x0);
                            boolean z2 = NewVoipMgr.this.f317101r ^ true;
                            C112597j.m153946k(z2 ? 1 : 0, System.currentTimeMillis(), NewVoipMgr.this.f317076V, 5, i5, i8, i7);
                            NewVoipMgr newVoipMgr6 = NewVoipMgr.this;
                            newVoipMgr6.f317078W = true;
                            newVoipMgr6.f317076V = 5;
                            NewVoipMgr.f317049d1 = 0;
                            newVoipMgr6.f317081X0 = 0;
                        }
                    }
                }
            } else {
                if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
                    NewVoipMgr newVoipMgr7 = NewVoipMgr.this;
                    if (newVoipMgr7.f317110y0 == 0) {
                        newVoipMgr7.f317110y0 = System.currentTimeMillis();
                        return;
                    }
                }
                if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                    NewVoipMgr newVoipMgr8 = NewVoipMgr.this;
                    if (newVoipMgr8.f317110y0 != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        NewVoipMgr newVoipMgr9 = NewVoipMgr.this;
                        newVoipMgr8.f317108x0 = currentTimeMillis - newVoipMgr9.f317110y0;
                        newVoipMgr9.f317110y0 = 0;
                    }
                }
            }
        }
    }

    public NewVoipMgr() {
        C40008f fVar = C40008f.f107254d;
        this.f317079W0 = new IListener<VoipCheckIsDeviceUsingEvent>(fVar) {
            {
                this.__eventId = 1403859438;
            }

            public boolean callback(IEvent iEvent) {
                VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = (VoipCheckIsDeviceUsingEvent) iEvent;
                if (voipCheckIsDeviceUsingEvent instanceof VoipCheckIsDeviceUsingEvent) {
                    voipCheckIsDeviceUsingEvent.f194014d.f194015a = C112604l.m153983f(NewVoipMgr.this.f317090e.f337213a);
                    VoipCheckIsDeviceUsingEvent.C67817a aVar = voipCheckIsDeviceUsingEvent.f194014d;
                    NewVoipMgr newVoipMgr = NewVoipMgr.this;
                    C108077f0 f0Var = newVoipMgr.f317092g;
                    aVar.f194016b = (f0Var == null || f0Var.f323642b == null) ? false : true;
                    aVar.f194017c = true;
                    aVar.f194018d = newVoipMgr.f317098p;
                }
                return false;
            }
        };
        this.f317081X0 = 0;
        this.f317083Y0 = 0;
        this.f317085Z0 = false;
        this.f317086a1 = 0;
        this.f317087b1 = new PhoneStateListener() {
            public void onCallStateChanged(int i, String str) {
                String string;
                String str2;
                int i2 = i;
                C111730z.C111731a aVar = C111730z.C111731a.PHONE_INTERRUPTER;
                Class cls = C107054l.class;
                super.onCallStateChanged(i, str);
                Log.m105925i("MicroMsg.Voip.NewVoipMgr", "onCallStateChanged :%d, isStartVoip: %b,oldState:%d", Integer.valueOf(i), Boolean.valueOf(NewVoipMgr.this.f317058H), Integer.valueOf(NewVoipMgr.this.f317070S));
                NewVoipMgr newVoipMgr = NewVoipMgr.this;
                if (newVoipMgr.f317058H) {
                    int i3 = newVoipMgr.f317070S;
                    if ((i3 == 0 && i2 == 1) || (i3 == 0 && i2 == 2)) {
                        newVoipMgr.f317065P++;
                    }
                    if (i2 == 1) {
                        newVoipMgr.f317060J = true;
                        if (i3 == 0) {
                            newVoipMgr.f317063M = System.currentTimeMillis();
                        }
                        NewVoipMgr.this.f317070S = 1;
                        C109247e.xx0().mo152625x(1, 1);
                        NewVoipMgr.this.f317067Q0 = true;
                    } else if (i2 == 2) {
                        newVoipMgr.f317060J = false;
                        if (i3 == 1) {
                            newVoipMgr.f317064N = System.currentTimeMillis();
                        }
                        NewVoipMgr.this.f317070S = 2;
                        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "phone call coming now!");
                        if (C112604l.m153984g(NewVoipMgr.this.f317090e.f337213a)) {
                            Context context = MMApplicationContext.getContext();
                            NewVoipMgr newVoipMgr2 = NewVoipMgr.this;
                            string = context.getString(C0966R.string.f361514kf3, new Object[]{newVoipMgr2.mo152442Q0(Util.secondsToNow(newVoipMgr2.f317052B))});
                        } else {
                            string = MMApplicationContext.getContext().getString(NewVoipMgr.this.f317101r ? C0966R.string.kex : C0966R.string.mze);
                        }
                        String str3 = string;
                        String username = NewVoipMgr.this.f317100q.getUsername();
                        NewVoipMgr newVoipMgr3 = NewVoipMgr.this;
                        if (newVoipMgr3.f317102s) {
                            int i4 = C72963f4.f212661I1;
                            str2 = "voip_content_video";
                        } else {
                            int i5 = C72963f4.f212661I1;
                            str2 = "voip_content_voice";
                        }
                        C106348g0.m143244e(username, str2, newVoipMgr3.f317101r ? 1 : 0, 6, str3, false, new C32226l<Long, Void>() {
                            public Object invoke(Object obj) {
                                Long l = (Long) obj;
                                NewVoipMgr.this.mo152456Y0(1);
                                return null;
                            }
                        });
                        NewVoipMgr newVoipMgr4 = NewVoipMgr.this;
                        if (newVoipMgr4.f317101r && !C112604l.m153984g(newVoipMgr4.f317090e.f337213a)) {
                            C106350h0 xx02 = C109247e.xx0();
                            xx02.getClass();
                            C111730z zVar = C111730z.f334576a;
                            C111730z.f334579d = aVar;
                            C106359m0 m0Var = xx02.f317332a;
                            m0Var.getClass();
                            Log.m105924i("MicroMsg.Voip.VoipServiceEx", "cancelCallByPhoneInter, roomId:" + m0Var.f317396a.f317500x.f317656n);
                            v2protocal v2protocal = m0Var.f317396a.f317500x;
                            if (v2protocal.f317656n != 0) {
                                C106401z zVar2 = v2protocal.f317568G1;
                                zVar2.f317772a = 102;
                                zVar2.f317784m = 6;
                                if (C109247e.xx0().f317333b != null) {
                                    m0Var.f317396a.f317500x.f317568G1.f317770Y = C109247e.xx0().f317333b.mo152449U();
                                    m0Var.f317396a.f317500x.f317568G1.f317768W = C109247e.xx0().f317333b.mo152454X() / 1000;
                                    m0Var.f317396a.f317500x.f317568G1.f317769X = C109247e.xx0().f317333b.mo152453W() / 1000;
                                }
                                C115669n.INSTANCE.mo160140o(11521, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 3, Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()));
                                m0Var.mo152656b(3);
                            }
                        }
                        C106350h0 xx03 = C109247e.xx0();
                        xx03.getClass();
                        C111730z zVar3 = C111730z.f334576a;
                        C111730z.f334579d = aVar;
                        C106359m0 m0Var2 = xx03.f317332a;
                        m0Var2.getClass();
                        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "hangUpByPhoneInter");
                        C106377r rVar = m0Var2.f317396a;
                        v2protocal v2protocal2 = rVar.f317500x;
                        if (v2protocal2.f317656n == 0) {
                            rVar.f317450A.mo152863j();
                            m0Var2.mo152669n();
                        } else {
                            C106401z zVar4 = v2protocal2.f317568G1;
                            zVar4.f317772a = 109;
                            zVar4.f317790s = 4;
                            m0Var2.mo152662g(5);
                        }
                        VoipIncomingCallManager voipIncomingCallManager = xx03.f317357z;
                        voipIncomingCallManager.getClass();
                        Log.m105928w("MicroMsg.VoipIncomingCallManager", "hangUpByPhoneOrAppInter, interType:4");
                        C110140b.m149726c(voipIncomingCallManager.f317142d, true, false, false, 2, (Object) null);
                        voipIncomingCallManager.mo152529z();
                        NewVoipMgr.this.mo149992d1(4107);
                        NewVoipMgr.this.mo149986L0();
                        NewVoipMgr.this.f317068R = true;
                        C109247e.xx0().mo152625x(2, 1);
                        NewVoipMgr.this.f317067Q0 = false;
                    } else if (i2 == 0) {
                        if (i3 == 1 || i3 == 2) {
                            newVoipMgr.f317064N = System.currentTimeMillis();
                        }
                        NewVoipMgr.this.f317070S = 0;
                        C109247e.xx0().mo152625x(2, 1);
                        NewVoipMgr newVoipMgr5 = NewVoipMgr.this;
                        if (newVoipMgr5.f317051A != null && C112604l.m153984g(newVoipMgr5.f317090e.f337213a)) {
                            NewVoipMgr newVoipMgr6 = NewVoipMgr.this;
                            if (newVoipMgr6.f317060J) {
                                newVoipMgr6.f317089d.mo164357z4(newVoipMgr6.f317051A);
                                NewVoipMgr newVoipMgr7 = NewVoipMgr.this;
                                newVoipMgr7.f317060J = false;
                                newVoipMgr7.f317067Q0 = false;
                            }
                        }
                        if (((C107054l) C86312j.m106911c(cls)).mo157460Dx()) {
                            NewVoipMgr.this.f317089d.mo164357z4(new C107054l.C107055a(4, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc), 3));
                        } else if (((C107054l) C86312j.m106911c(cls)).mo157474qG()) {
                            NewVoipMgr.this.f317089d.mo164357z4(new C107054l.C107055a(3, MMApplicationContext.getContext().getResources().getString(C0966R.string.nce), 3));
                        }
                        NewVoipMgr newVoipMgr72 = NewVoipMgr.this;
                        newVoipMgr72.f317060J = false;
                        newVoipMgr72.f317067Q0 = false;
                    }
                    NewVoipMgr newVoipMgr8 = NewVoipMgr.this;
                    newVoipMgr8.f317089d.mo164336a(newVoipMgr8.f317067Q0);
                }
            }
        };
        this.f317088c1 = new IListener<WearVoipControllerEvent>(fVar) {
            {
                this.__eventId = -1744162705;
            }

            public boolean callback(IEvent iEvent) {
                final WearVoipControllerEvent wearVoipControllerEvent = (WearVoipControllerEvent) iEvent;
                if (!(wearVoipControllerEvent instanceof WearVoipControllerEvent)) {
                    return false;
                }
                MMHandlerThread.postToMainThread(new Runnable() {
                    public void run() {
                        int i = wearVoipControllerEvent.f107832d.f107833a;
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    NewVoipMgr.this.mo152484p();
                                }
                            } else if (C112604l.m153983f(NewVoipMgr.this.f317090e.f337213a)) {
                                NewVoipMgr.this.mo152432K();
                            } else {
                                NewVoipMgr.this.mo152486q();
                            }
                        } else if (C112604l.m153983f(NewVoipMgr.this.f317090e.f337213a)) {
                            NewVoipMgr.this.mo152421C();
                        } else {
                            NewVoipMgr.this.mo152425F();
                        }
                    }
                });
                return false;
            }
        };
        Util.nowSecond();
        C112592e eVar = C109247e.xx0().f317330E;
        this.f317089d = eVar;
        if (eVar == null) {
            if (C112595h.m153918b()) {
                this.f317089d = new C112598k();
            } else {
                this.f317089d = new C112586d();
            }
            C109247e.xx0().f317330E = this.f317089d;
        }
        this.f317103t = C109247e.xx0().mo152615n();
        this.f317104u = C109247e.xx0().mo152616o();
        this.f317105v = C109247e.xx0().mo152617p();
        C111730z.f334576a.mo163444a(Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), this.f317098p, Boolean.valueOf(this.f317101r));
        this.f317089d.mo164345l(Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()));
        C108077f0 f0Var = C109247e.xx0().f317331F;
        this.f317092g = f0Var;
        if (f0Var != null) {
            f0Var.f323662v = this;
        }
    }

    /* renamed from: A */
    public void mo152417A(VoIPRenderTextureView voIPRenderTextureView, int i) {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.getClass();
            C87412m.m108594g(voIPRenderTextureView, "view");
            voIPRenderTextureView.setSurfaceTextureListener(new C108086g0(new C8479f0(), new C8479f0(), f0Var, i));
        }
    }

    /* renamed from: A0 */
    public void mo152418A0(int i) {
        C108117v vVar;
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "setSharpenFilter, isON: " + i + "，mVoipUI: " + this.f317093h);
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.getClass();
            Log.m105925i("MicroMsg.VoIPRenderMgr", "setSharpenFilter, mIsStarted:%b, isON:%d", Boolean.TRUE, Integer.valueOf(i));
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null && (vVar = x0Var.f323776c) != null) {
                vVar.mo158464d(new C108133z(vVar, i));
            }
        }
    }

    /* renamed from: B */
    public void mo152419B() {
        if (this.f317093h != null) {
            this.f317093h.mo152906B();
        }
    }

    /* renamed from: B0 */
    public void mo152420B0(int i) {
        Log.m105925i("MicroMsg.Voip.NewVoipMgr", "remote voip mode changed, cmd:%d", Integer.valueOf(i));
        if (i == 1 || i == 3 || i == 5 || i == 6 || i == 7) {
            if (this.f317102s) {
                mo149992d1(4101);
                C109247e.xx0().f317332a.f317396a.mo152717t();
                C109247e.xx0().f317332a.f317396a.mo152716s();
            }
        } else if (i == 101) {
            mo149992d1(4113);
        } else if (i == 102) {
            mo149992d1(4112);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r4.f322807f != 1) goto L_0x0053;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo152421C() {
        /*
            r6 = this;
            z33.m r0 = r6.f317090e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 4100(0x1004, float:5.745E-42)
            boolean r0 = r0.mo164380b(r2)
            if (r0 != 0) goto L_0x000f
            return r1
        L_0x000f:
            h43.f0 r0 = r6.f317092g
            r3 = 1
            if (r0 == 0) goto L_0x0053
            boolean r4 = r0.f323645e
            if (r4 == 0) goto L_0x0022
            gj.d r4 = p156gj.C107835h0.f322845b
            int r5 = r4.f322806e
            if (r5 == r3) goto L_0x0022
            int r4 = r4.f322807f
            if (r4 != r3) goto L_0x0053
        L_0x0022:
            b43.a r4 = r0.f323642b
            if (r4 == 0) goto L_0x002f
            d43.a r4 = (d43.C106987a) r4
            boolean r4 = r4.f320245j
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x0039
            goto L_0x0053
        L_0x0039:
            b43.a r4 = r0.f323642b
            if (r4 == 0) goto L_0x0046
            d43.a r4 = (d43.C106987a) r4
            boolean r4 = r4.f320236a
            if (r4 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r4 = 0
            goto L_0x0047
        L_0x0046:
            r4 = 1
        L_0x0047:
            h43.x0 r5 = r0.f323646f
            if (r5 == 0) goto L_0x0053
            h43.u r5 = r5.f323774a
            if (r5 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r0.mo158489d(r5, r4)
        L_0x0053:
            java.lang.String r0 = "MicroMsg.Voip.NewVoipMgr"
            java.lang.String r4 = "onAcceptVideoInvite"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            r6.mo152463c1()
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()
            boolean r4 = r6.f317102s
            r0.mo152602a(r1, r4)
            r6.mo149992d1(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.NewVoipMgr.mo152421C():boolean");
    }

    /* renamed from: C0 */
    public void mo152422C0() {
        if (!this.f317054D && this.f317093h != null && this.f317093h.mo152927i3() != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new NewVoipMgr$$a(this));
        }
    }

    /* renamed from: D0 */
    public void mo152423D0() {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "on accept");
        mo152463c1();
        mo149992d1(4100);
    }

    /* renamed from: E */
    public boolean mo152424E(C32226l<Boolean, C13598b0> lVar) {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onSwitchCamera");
        if (this.f317092g != null) {
            C109247e.vx0().getClass();
            mo152437N0(9);
            C108077f0 f0Var = this.f317092g;
            f0Var.getClass();
            Log.m105924i("MicroMsg.VoIPRenderMgr", "onSwitchCamera");
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null) {
                C108099m0 m0Var = new C108099m0(f0Var, lVar);
                C108115u uVar = x0Var.f323774a;
                if (uVar != null) {
                    uVar.mo158524c(new C108113t(uVar, m0Var));
                }
            }
            C115669n.INSTANCE.mo160131h(11079, 1);
        }
        return true;
    }

    /* renamed from: E0 */
    public void mo149983E0() {
        String str;
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onReject");
        mo149992d1(4099);
        String username = this.f317100q.getUsername();
        if (this.f317102s) {
            int i = C72963f4.f212661I1;
            str = "voip_content_video";
        } else {
            int i2 = C72963f4.f212661I1;
            str = "voip_content_voice";
        }
        boolean z = this.f317101r;
        C106348g0.m143243d(username, str, z ? 1 : 0, 6, MMApplicationContext.getContext().getString(C0966R.string.kf_));
        mo149986L0();
    }

    /* renamed from: F */
    public boolean mo152425F() {
        if (!this.f317090e.mo164380b(4100)) {
            return false;
        }
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onAcceptVoiceInvite");
        mo152463c1();
        C109247e.xx0().mo152602a(true, this.f317102s);
        C112592e eVar = this.f317089d;
        if (eVar != null) {
            eVar.mo164329D(false);
        }
        mo149992d1(4111);
        mo149992d1(4100);
        return true;
    }

    /* renamed from: F0 */
    public void mo152426F0() {
        C115669n.INSTANCE.mo160140o(11522, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), Integer.valueOf(this.f317101r ^ true ? 1 : 0), 1);
        C112597j.m153945j(C109247e.xx0().mo152615n(), C109247e.xx0().mo152616o(), true ^ this.f317101r ? 1 : 0, 3);
        this.f317084Z.post(new Runnable() {
            public void run() {
                NewVoipMgr newVoipMgr = NewVoipMgr.this;
                newVoipMgr.mo152446S0(newVoipMgr.f317076V);
                NewVoipMgr.this.f317084Z.postDelayed(this, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        });
    }

    /* renamed from: G */
    public void mo149984G(int i) {
        if (this.f317093h != null) {
            this.f317093h.mo152908G(i);
        }
    }

    /* renamed from: G0 */
    public final boolean mo152427G0() {
        if (!C112604l.m153984g(this.f317090e.f337213a)) {
            return false;
        }
        SharedPreferences sharedPreferences = mo152444R0().getSharedPreferences("voip_plugin_prefs", 0);
        if (sharedPreferences.getBoolean("voip_shortcut_has_added", false)) {
            return false;
        }
        Class cls = C10485b.class;
        String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("VOIPShortcutAutoadd");
        Log.m105925i("MicroMsg.Voip.NewVoipMgr", "voip shortcut autoAdd is %s", c);
        if (c != null && c.equals("0") && Util.secondsToNow(this.f317052B) > 30) {
            int i = sharedPreferences.getInt("voip_shortcut_prompt_times", 0);
            boolean z = sharedPreferences.getBoolean("voip_shortcut_never_show_anymore", false);
            if (i >= 3 || z) {
                return false;
            }
            Context R0 = mo152444R0();
            View inflate = View.inflate(R0, C0966R.C0971layout.bbt, (ViewGroup) null);
            final CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.gul);
            checkBox.setChecked(false);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gun);
            if (1 == Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("VOIPCallType"), 0)) {
                textView.setText(C0966R.string.kei);
            } else {
                textView.setText(C0966R.string.kej);
            }
            C76879j.m92715I(R0, false, R0.getString(C0966R.string.a3h), inflate, R0.getString(C0966R.string.a4h), R0.getString(C0966R.string.f360090a14), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    NewVoipMgr.this.mo152435M0(NewVoipMgr.this.mo152444R0().getSharedPreferences("voip_plugin_prefs", 0));
                    NewVoipMgr newVoipMgr = NewVoipMgr.this;
                    int i2 = newVoipMgr.f317107x;
                    if (4096 != i2) {
                        newVoipMgr.mo149992d1(i2);
                        NewVoipMgr.this.f317107x = 4096;
                    }
                    ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
                        public void run() {
                            NewVoipMgr.this.mo149987O0();
                        }
                    });
                }
            }, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (checkBox != null) {
                        NewVoipMgr.this.mo152444R0().getSharedPreferences("voip_plugin_prefs", 0).edit().putBoolean("voip_shortcut_never_show_anymore", checkBox.isChecked()).commit();
                    }
                    NewVoipMgr newVoipMgr = NewVoipMgr.this;
                    int i2 = newVoipMgr.f317107x;
                    if (4096 != i2) {
                        newVoipMgr.mo149992d1(i2);
                        NewVoipMgr.this.f317107x = 4096;
                    }
                    ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
                        public void run() {
                            NewVoipMgr.this.mo149987O0();
                        }
                    });
                }
            });
            sharedPreferences.edit().putInt("voip_shortcut_prompt_times", i + 1).commit();
            return true;
        } else if (c == null || !c.equals("1") || Util.secondsToNow(this.f317052B) <= 15) {
            return false;
        } else {
            mo152435M0(sharedPreferences);
            return false;
        }
    }

    /* renamed from: H */
    public void mo150057H(boolean z) {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onBadNetStatus");
        if (this.f317093h != null) {
            this.f317093h.mo152920Z1(z);
        }
        if (!C112604l.m153983f(this.f317090e.f337213a) && !this.f317089d.mo164362s()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f317086a1 > 30000) {
                this.f317086a1 = currentTimeMillis;
                Bundle bundle = new Bundle();
                bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "bad_net");
                ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.VOIP, bundle);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("report the bad net toast room key is ");
        sb.append(C109247e.xx0().mo152616o());
        sb.append("and in the side");
        int i = 2;
        sb.append(z ? 1 : 2);
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", sb.toString());
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(C109247e.xx0().mo152616o());
        if (z) {
            i = 1;
        }
        objArr[1] = Integer.valueOf(i);
        nVar.mo160140o(17151, true, true, objArr);
    }

    /* renamed from: H0 */
    public void mo152428H0(int i) {
        boolean z = this.f317102s;
        boolean z2 = !C109247e.vx0().f333451k;
        boolean z3 = !this.f317089d.mo164337b();
        boolean s = this.f317089d.mo164362s();
        C107225c cVar = C107225c.f320827a;
        boolean z4 = C107225c.f320828b != null;
        boolean z5 = 1 != this.f317055E;
        C109247e.vx0().getClass();
        C38447a aVar = new C38447a(z, z3, s, z2, z4, false, z5);
        int i2 = this.f317103t;
        long j = this.f317104u;
        long j2 = this.f317105v;
        boolean z6 = this.f317101r;
        long j3 = (long) i;
        String a = this.f317089d.mo164346o().mo157500a();
        VoipButtonStatusStruct voipButtonStatusStruct = new VoipButtonStatusStruct();
        voipButtonStatusStruct.f310345d = (long) i2;
        voipButtonStatusStruct.f310346e = j;
        long j4 = 1;
        voipButtonStatusStruct.f310347f = j2 == 0 ? 1 : 2;
        if (!z6) {
            j4 = 2;
        }
        voipButtonStatusStruct.f310348g = j4;
        voipButtonStatusStruct.mo148156s(aVar.toString());
        voipButtonStatusStruct.f310351j = j3;
        voipButtonStatusStruct.f310350i = System.currentTimeMillis();
        voipButtonStatusStruct.mo148157t(a);
        voipButtonStatusStruct.mo86054n();
    }

    /* renamed from: I0 */
    public boolean mo152429I0(boolean z) {
        if (C109247e.xx0().f317346o) {
            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "current state is mini, cannot mini!");
            return false;
        } else if (!this.f317060J || z) {
            return true;
        } else {
            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "has phone call  cannot mini!");
            return false;
        }
    }

    /* renamed from: J */
    public boolean mo152430J() {
        if (!this.f317090e.mo164380b(4098)) {
            return false;
        }
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onCancelVideoInvite");
        mo152448T0(4098);
        C109247e.xx0().mo152614m();
        return true;
    }

    /* renamed from: J0 */
    public final void mo152431J0() {
        synchronized (this.f317097o) {
            C111730z zVar = C111730z.f334576a;
            long j = this.f317052B;
            long j2 = 0;
            long secondsToNow = j == -1 ? 0 : Util.secondsToNow(j);
            if (this.f317102s) {
                j2 = 1;
            }
            zVar.mo163445c(secondsToNow, j2);
            C111720c0.f334432a.mo163399a();
            C108077f0 f0Var = this.f317092g;
            if (f0Var != null) {
                f0Var.mo158495j();
            }
            C109247e.vx0().mo163051e();
            this.f317089d.mo164332G();
            this.f317089d.mo164327A();
        }
    }

    /* renamed from: K */
    public boolean mo152432K() {
        String str;
        if (!this.f317090e.mo164380b(4099)) {
            return false;
        }
        String username = this.f317100q.getUsername();
        if (this.f317102s) {
            int i = C72963f4.f212661I1;
            str = "voip_content_video";
        } else {
            int i2 = C72963f4.f212661I1;
            str = "voip_content_voice";
        }
        boolean z = this.f317101r;
        C106348g0.m143243d(username, str, z ? 1 : 0, 6, MMApplicationContext.getContext().getString(C0966R.string.kf6));
        mo152463c1();
        C109247e.xx0().mo152627z();
        mo149992d1(4099);
        mo149986L0();
        return true;
    }

    /* renamed from: K0 */
    public C108077f0 mo149985K0() {
        C108077f0 f0Var = new C108077f0(this.f317101r);
        this.f317092g = f0Var;
        f0Var.f323662v = this;
        return f0Var;
    }

    /* renamed from: L */
    public boolean mo152433L(boolean z) {
        if (!mo152429I0(z)) {
            return false;
        }
        Log.printDebugStack("MicroMsg.Voip.NewVoipMgr", "miniOnlyHidenVoip: %b", Boolean.valueOf(z));
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onMinimizeVoip, async to minimize");
        Util.currentTicks();
        C106510c cVar = this.f317059I;
        if (cVar != null) {
            cVar.mo152929k3(false);
            this.f317059I = null;
        }
        mo149988W0(z);
        return true;
    }

    /* renamed from: L0 */
    public void mo149986L0() {
        ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
            public void run() {
                Log.m105918d("MicroMsg.Voip.NewVoipMgr", "delayFinish");
                NewVoipMgr newVoipMgr = NewVoipMgr.this;
                newVoipMgr.f317062L = null;
                newVoipMgr.getClass();
                Log.m105924i("MicroMsg.Voip.NewVoipMgr", "it is uninit voip report");
                MMHandler mMHandler = newVoipMgr.f317084Z;
                if (mMHandler != null) {
                    mMHandler.removeCallbacksAndMessages((Object) null);
                    newVoipMgr.f317084Z.quit();
                }
                if (!newVoipMgr.f317078W) {
                    if (newVoipMgr.f317081X0 == 0) {
                        newVoipMgr.mo152446S0(newVoipMgr.f317076V);
                    }
                    if (newVoipMgr.f317081X0 != 0) {
                        newVoipMgr.f317078W = true;
                        boolean z = !newVoipMgr.f317101r;
                        long currentTimeMillis = System.currentTimeMillis();
                        int i = newVoipMgr.f317076V;
                        C112597j.m153946k(z ? 1 : 0, currentTimeMillis, i, i, 0, 0, NewVoipMgr.f317049d1 / newVoipMgr.f317081X0);
                    }
                }
                NewVoipMgr.f317049d1 = 0;
                int[] iArr = NewVoipMgr.f317050e1;
                iArr[0] = 0;
                iArr[1] = 0;
                newVoipMgr.f317081X0 = 0;
                TelephonyManager telephonyManager = newVoipMgr.f317099p0;
                if (telephonyManager != null) {
                    PhoneStateListener phoneStateListener = newVoipMgr.f317082Y;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(phoneStateListener);
                    TelephonyManager telephonyManager2 = telephonyManager;
                    C117292a.m165358d(telephonyManager2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/model/NewVoipMgr", "uninitVoipReport", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                    telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(telephonyManager2, "com/tencent/mm/plugin/voip/model/NewVoipMgr", "uninitVoipReport", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                }
                if (newVoipMgr.f317080X != null) {
                    MMApplicationContext.getContext().unregisterReceiver(newVoipMgr.f317080X);
                    newVoipMgr.f317080X = null;
                }
                NewVoipMgr.this.mo149987O0();
            }
        });
    }

    /* renamed from: M */
    public void mo152434M() {
        mo152437N0(13);
    }

    /* renamed from: M0 */
    public final void mo152435M0(SharedPreferences sharedPreferences) {
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("duplicate", false);
        Intent intent2 = new Intent("com.tencent.mm.action.BIZSHORTCUT");
        intent2.addFlags(67108864);
        if (1 == Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VOIPCallType"), 0)) {
            intent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
            intent.putExtra("android.intent.extra.shortcut.NAME", mo152444R0().getString(C0966R.string.f7998ys));
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(mo152444R0(), C0966R.C0969drawable.f357413bd3));
            intent.putExtra("shortcut_icon_resource_id", C0966R.C0969drawable.f357413bd3);
        } else {
            intent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
            intent.putExtra("android.intent.extra.shortcut.NAME", mo152444R0().getString(C0966R.string.f8000yu));
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(mo152444R0(), C0966R.C0969drawable.bd4));
            intent.putExtra("shortcut_icon_resource_id", C0966R.C0969drawable.bd4);
        }
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        ((C0235b) C86312j.m106911c(C0235b.class)).rb0(mo152444R0(), intent);
        sharedPreferences.edit().putBoolean("voip_shortcut_has_added", true).commit();
    }

    /* renamed from: N */
    public void mo152436N(int i) {
        C104031a aVar;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null && (aVar = f0Var.f323642b) != null && z != aVar.mo145631c()) {
            mo152437N0(z ? 10 : 9);
            mo152424E((C32226l<Boolean, C13598b0>) null);
        }
    }

    /* renamed from: N0 */
    public void mo152437N0(int i) {
        if (this.f317111z) {
            int i2 = C109247e.vx0().f333459s == 0 ? 2 : 4;
            long j = (long) this.f317103t;
            long j2 = this.f317104u;
            long j3 = this.f317105v;
            boolean z = this.f317101r;
            long j4 = (long) i2;
            VoipButtonStatusStruct voipButtonStatusStruct = new VoipButtonStatusStruct();
            voipButtonStatusStruct.f310345d = j;
            voipButtonStatusStruct.f310346e = j2;
            long j5 = 1;
            voipButtonStatusStruct.f310347f = j3 == 0 ? 1 : 2;
            voipButtonStatusStruct.mo148156s(String.valueOf(i));
            if (!z) {
                j5 = 2;
            }
            voipButtonStatusStruct.f310348g = j5;
            voipButtonStatusStruct.f310351j = j4;
            voipButtonStatusStruct.f310350i = System.currentTimeMillis();
            voipButtonStatusStruct.mo148157t("");
            voipButtonStatusStruct.mo86054n();
        }
    }

    /* renamed from: O */
    public void mo152438O() {
        int i = this.f317090e.f337213a;
        if (256 != i && 257 != i) {
            return;
        }
        if (C86709a0.m107535s().mo121142i().mo119688i(327945, 0) != 0 || this.f317093h.mo152927i3() == null) {
            Context context = MMApplicationContext.getContext();
            Uri uri = C91617n.f262467a;
            C76701a.makeText(context, (int) C0966R.string.kgy, 0).show();
            mo152450U0();
            return;
        }
        C86709a0.m107535s().mo121142i().mo119679M(327945, 1);
        C77398g o = C76879j.m92744o(this.f317093h.mo152927i3(), C0966R.string.kgy, C0966R.string.a3h, true, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                NewVoipMgr.this.mo152450U0();
            }
        });
        o.setCancelable(false);
        o.setCanceledOnTouchOutside(false);
        o.show();
    }

    /* renamed from: O0 */
    public void mo149987O0() {
        mo152440P0(false);
    }

    /* renamed from: P */
    public String mo152439P() {
        return this.f317062L;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.tencent.mm.plugin.voip.model.f0$d, android.telephony.TelephonyManager] */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0552  */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152440P0(boolean r39) {
        /*
            r38 = this;
            r1 = r38
            java.lang.Class<bd2.d> r0 = bd2.C79690d.class
            oe.m r2 = r1.f317075U0
            r3 = 0
            if (r2 == 0) goto L_0x000e
            r2.mo182518a()
            r1.f317075U0 = r3
        L_0x000e:
            java.lang.String r2 = "MicroMsg.Voip.NewVoipMgr"
            java.lang.String r4 = "finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r4 = 0
            r1.f317083Y0 = r4
            java.lang.String r2 = "MicroMsg.Voip.NewVoipMgr"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "finish: isStartVoip="
            r6.append(r7)
            boolean r7 = r1.f317058H
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            lu3.c r2 = r1.f317071S0
            r6 = 0
            if (r2 == 0) goto L_0x003b
            r2.cancel(r6)
            r1.f317071S0 = r3
        L_0x003b:
            r2 = 5
            r1.mo152428H0(r2)
            r1.f317111z = r6
            boolean r7 = r1.f317058H
            if (r7 != 0) goto L_0x004d
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()
            r0.mo152606e()
            return
        L_0x004d:
            z33.c r7 = r1.f317069R0
            if (r7 == 0) goto L_0x0066
            r7.f337121h = r6
            r7.mo164324a()
            z33.c r7 = r1.f317069R0
            com.tencent.mm.sdk.platformtools.MMHandler r8 = r7.f337120g
            if (r8 == 0) goto L_0x005f
            r8.removeCallbacksAndMessages(r3)
        L_0x005f:
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r7.f337120g
            if (r7 == 0) goto L_0x0066
            r7.quitSafely()
        L_0x0066:
            r1.f317058H = r6
            r1.f317060J = r6
            boolean r7 = w33.C111730z.f334596u
            int r8 = r1.f317056F
            r9 = -1
            r10 = 2
            r11 = 1
            if (r8 == r9) goto L_0x0090
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 11700(0x2db4, float:1.6395E-41)
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14[r6] = r8
            long r4 = r1.f317052B
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r14[r11] = r4
            r12.mo160131h(r13, r14)
            r1.f317056F = r9
        L_0x0090:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x009a }
            android.content.BroadcastReceiver r5 = r1.f317077V0     // Catch:{ Exception -> 0x009a }
            r4.unregisterReceiver(r5)     // Catch:{ Exception -> 0x009a }
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            z33.e r4 = r1.f317089d
            r4.mo164338e()
            com.tencent.mm.sdk.event.IListener r4 = r1.f317079W0
            r4.dead()
            com.tencent.mm.sdk.event.IListener r4 = r1.f317088c1
            r4.dead()
            h43.f0 r4 = r1.f317092g
            if (r4 == 0) goto L_0x00b3
            r4.mo158495j()
            r1.f317092g = r3
        L_0x00b3:
            com.tencent.mm.plugin.voip.ui.f r4 = r1.f317093h
            if (r4 == 0) goto L_0x00c5
            com.tencent.mm.plugin.voip.ui.f r4 = r1.f317093h
            r4.mo152929k3(r11)
            r1.f317093h = r3
            z33.e r4 = r1.f317089d
            com.tencent.mm.plugin.voip.ui.f r5 = r1.f317093h
            r4.mo164339f(r5)
        L_0x00c5:
            com.tencent.mm.plugin.voip.widget.c r4 = r1.f317059I
            if (r4 == 0) goto L_0x00ce
            r4.mo152929k3(r11)
            r1.f317059I = r3
        L_0x00ce:
            r38.mo152463c1()
            com.tencent.mm.plugin.voip.model.h0 r4 = l33.C109247e.xx0()
            r5 = 3
            if (r4 == 0) goto L_0x018f
            if (r39 == 0) goto L_0x0165
            com.tencent.mm.plugin.voip.model.h0 r4 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r4 = r4.f317332a
            r4.getClass()
            java.lang.String r8 = "MicroMsg.Voip.VoipServiceEx"
            java.lang.String r9 = "ignoreInvite"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            com.tencent.mm.plugin.voip.model.r r8 = r4.f317396a
            int r8 = r8.f317476a
            if (r8 != r5) goto L_0x00f2
            r8 = 1
            goto L_0x00f3
        L_0x00f2:
            r8 = 0
        L_0x00f3:
            if (r8 != 0) goto L_0x0110
            java.lang.String r8 = "MicroMsg.Voip.VoipServiceEx"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Failed to ignore with calling, status ="
            r9.append(r12)
            com.tencent.mm.plugin.voip.model.r r4 = r4.f317396a
            int r4 = r4.f317476a
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            z33.C112597j.m153937b(r8, r4)
            goto L_0x016c
        L_0x0110:
            java.lang.Object r8 = r4.f317397b
            monitor-enter(r8)
            com.tencent.mm.plugin.voip.model.r r9 = r4.f317396a     // Catch:{ all -> 0x0162 }
            com.tencent.mm.plugin.voip.model.v2protocal r9 = r9.f317500x     // Catch:{ all -> 0x0162 }
            int r12 = r9.f317656n     // Catch:{ all -> 0x0162 }
            if (r12 != 0) goto L_0x0124
            java.lang.String r4 = "MicroMsg.Voip.VoipServiceEx"
            java.lang.String r9 = "Failed to reject with roomid = 0. "
            z33.C112597j.m153937b(r4, r9)     // Catch:{ all -> 0x0162 }
            monitor-exit(r8)     // Catch:{ all -> 0x0162 }
            goto L_0x016c
        L_0x0124:
            s33.b r13 = new s33.b     // Catch:{ all -> 0x0162 }
            r18 = 3
            int r14 = r9.f317629e     // Catch:{ all -> 0x0162 }
            byte[] r15 = new byte[r6]     // Catch:{ all -> 0x0162 }
            byte[] r3 = new byte[r6]     // Catch:{ all -> 0x0162 }
            long r10 = r9.f317665q     // Catch:{ all -> 0x0162 }
            r25 = 0
            r26 = 0
            r27 = 0
            r17 = r13
            r19 = r14
            r20 = r12
            r21 = r15
            r22 = r3
            r23 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r26, r27)     // Catch:{ all -> 0x0162 }
            com.tencent.mm.plugin.voip.model.r r3 = r4.f317396a     // Catch:{ all -> 0x0162 }
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x     // Catch:{ all -> 0x0162 }
            com.tencent.mm.plugin.voip.model.z r3 = r3.f317568G1     // Catch:{ all -> 0x0162 }
            r3.getClass()     // Catch:{ all -> 0x0162 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0162 }
            r3.f317757L = r9     // Catch:{ all -> 0x0162 }
            r13.mo88544n1()     // Catch:{ all -> 0x0162 }
            r4.mo152669n()     // Catch:{ all -> 0x0162 }
            com.tencent.mm.plugin.voip.model.r r3 = r4.f317396a     // Catch:{ all -> 0x0162 }
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x     // Catch:{ all -> 0x0162 }
            r3.f317656n = r6     // Catch:{ all -> 0x0162 }
            monitor-exit(r8)     // Catch:{ all -> 0x0162 }
            goto L_0x016c
        L_0x0162:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0162 }
            throw r0
        L_0x0165:
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            r3.mo152620s()
        L_0x016c:
            boolean r3 = r1.f317102s
            if (r3 == 0) goto L_0x017b
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            java.lang.String r4 = r1.f317098p
            r8 = 1
            r3.mo152590D(r6, r8, r4)
            goto L_0x0184
        L_0x017b:
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            java.lang.String r4 = r1.f317098p
            r3.mo152590D(r6, r6, r4)
        L_0x0184:
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3.mo152607f(r4, r1)
        L_0x018f:
            z33.e r3 = r1.f317089d
            r3.mo164328B()
            long r3 = r1.f317052B
            r8 = -1
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x01a3
            boolean r3 = r1.f317101r
            if (r3 == 0) goto L_0x01a1
            goto L_0x01a3
        L_0x01a1:
            r3 = 0
            goto L_0x01a4
        L_0x01a3:
            r3 = 1
        L_0x01a4:
            com.tencent.mm.plugin.voip.model.h0 r4 = l33.C109247e.xx0()
            r4.mo152606e()
            com.tencent.mm.plugin.voip.model.h0 r4 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r10 = r4.f317332a
            com.tencent.mm.plugin.voip.model.r r10 = r10.f317396a
            com.tencent.mm.plugin.voip.model.v2protocal r10 = r10.f317500x
            java.lang.String r11 = "v2protocal"
            gy3.C87412m.m108594g(r10, r11)
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.os.Debug$MemoryInfo r11 = p723vf.C90773a.m113836b(r11)
            int r12 = r10.f317574I1
            if (r12 <= 0) goto L_0x01c8
            goto L_0x01d2
        L_0x01c8:
            int r12 = r10.field_videoDuration
            if (r12 != 0) goto L_0x01ce
            r12 = 0
            goto L_0x01d2
        L_0x01ce:
            int r10 = r10.f317679u1
            int r12 = r10 / r12
        L_0x01d2:
            long r12 = (long) r12
            int r10 = r11.nativePss
            long r14 = (long) r10
            int r10 = r11.dalvikPss
            long r10 = (long) r10
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "doPerfIdKeyStat, beautyCmd:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", captureFps:"
            r8.append(r9)
            r8.append(r12)
            java.lang.String r9 = ", nativePss:"
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = ", dalvikPss:"
            r8.append(r9)
            r8.append(r10)
            java.lang.String r9 = ", roomId:"
            r8.append(r9)
            int r9 = com.tencent.p014mm.plugin.voip.model.C106372o.f317443a
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.VoipBeautyPerfStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r8 = 4
            r16 = 0
            int r9 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0295
            int r9 = com.tencent.p014mm.plugin.voip.model.C106372o.f317443a
            if (r9 <= 0) goto L_0x0295
            int r9 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0295
            int r9 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            r26 = r14
            if (r9 <= 0) goto L_0x0295
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 1336(0x538, double:6.6E-321)
            r20 = 0
            r18 = 1336(0x538, double:6.6E-321)
            r17 = r9
            r22 = r12
            r17.mo175913w(r18, r20, r22)
            r30 = 1336(0x538, double:6.6E-321)
            r20 = 1
            r32 = 1
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            r20 = 5
            r22 = r10
            r17.mo175913w(r18, r20, r22)
            r20 = 6
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            r20 = 10
            r18 = r28
            r22 = r26
            r17.mo175913w(r18, r20, r22)
            r20 = 11
            r18 = r30
            r22 = r32
            r17.mo175913w(r18, r20, r22)
            r18 = 1336(0x538, double:6.6E-321)
            r20 = 30
            r22 = 1
            r17 = r9
            r17.mo175913w(r18, r20, r22)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r14 = com.tencent.p014mm.plugin.voip.model.C106372o.f317443a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r2[r6] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r17 = 1
            r2[r17] = r14
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 2
            r2[r13] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r26)
            r2[r5] = r12
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2[r8] = r10
            r10 = 19454(0x4bfe, float:2.7261E-41)
            r9.mo160131h(r10, r2)
        L_0x0295:
            com.tencent.p014mm.plugin.voip.model.C106372o.f317443a = r6
            com.tencent.mm.plugin.voip.model.m0 r2 = r4.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            r2.f317574I1 = r6
            java.lang.String r2 = "MicroMsg.Voip"
            java.lang.String r4 = "resetCaptureFps"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            boolean r2 = r1.f317095j
            if (r2 == 0) goto L_0x02b7
            com.tencent.mm.plugin.voip.model.NewVoipMgr$CleanRunnable r2 = new com.tencent.mm.plugin.voip.model.NewVoipMgr$CleanRunnable
            r2.<init>()
            zt3.t r4 = zt3.C119157j.f356862d
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183875f(r2)
            goto L_0x02ba
        L_0x02b7:
            r38.mo152431J0()
        L_0x02ba:
            android.telephony.TelephonyManager r2 = r1.f317091f
            if (r2 == 0) goto L_0x0311
            android.telephony.PhoneStateListener r4 = r1.f317087b1
            if (r4 == 0) goto L_0x0311
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r9.mo10233c(r10)
            r9.mo10233c(r4)
            java.lang.Object[] r31 = r9.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/voip/model/NewVoipMgr"
            java.lang.String r33 = "finish"
            java.lang.String r34 = "(Z)V"
            java.lang.String r35 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r36 = "listen"
            java.lang.String r37 = "(Landroid/telephony/PhoneStateListener;I)V"
            r30 = r2
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.Object r4 = r9.mo10231a(r6)
            android.telephony.PhoneStateListener r4 = (android.telephony.PhoneStateListener) r4
            r10 = 1
            java.lang.Object r9 = r9.mo10231a(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.listen(r4, r9)
            java.lang.String r18 = "com/tencent/mm/plugin/voip/model/NewVoipMgr"
            java.lang.String r19 = "finish"
            java.lang.String r20 = "(Z)V"
            java.lang.String r21 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r22 = "listen"
            java.lang.String r23 = "(Landroid/telephony/PhoneStateListener;I)V"
            r17 = r2
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            r1.f317087b1 = r2
            goto L_0x0312
        L_0x0311:
            r2 = 0
        L_0x0312:
            r1.f317091f = r2
            com.tencent.mm.booter.a r4 = com.tencent.p014mm.booter.C92614a.m116679d()
            r4.mo126635b()
            com.tencent.mm.plugin.voip.model.f0 r4 = com.tencent.p014mm.plugin.voip.model.C106343f0.m143231a()
            r4.mo152578e()
            com.tencent.mm.plugin.voip.model.f0 r4 = com.tencent.p014mm.plugin.voip.model.C106343f0.m143231a()
            r4.mo152575b(r2)
            di3.d r2 = di3.C86312j.m106911c(r0)
            bd2.d r2 = (bd2.C79690d) r2
            eb0.u2 r2 = r2.mo109806kA()
            com.tencent.mm.booter.notification.MMNotification r2 = (com.tencent.p014mm.booter.notification.MMNotification) r2
            r4 = 40
            r2.mo93207e(r4)
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()
            r2.mo152614m()
            java.lang.String r2 = "MicroMsg.Voip.NewVoipMgr"
            java.lang.String r9 = "finish, isFinishFromShutdown: %s"
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            boolean r10 = r1.f317096n
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11[r6] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r11)
            boolean r2 = r1.f317096n
            if (r2 == 0) goto L_0x0464
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r2 = r2.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.VoipScoreState r2 = r2.f317464O
            r2.getClass()
            f40.C86709a0.m107528h()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_VOIP_LAST_SCORE_TIME_LONG
            r11 = -1
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Object r9 = r9.mo119685f(r10, r11)
            java.lang.Long r9 = (java.lang.Long) r9
            long r11 = r9.longValue()
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0388
            r13 = r11
        L_0x0388:
            r2.f317168i = r13
            long r13 = eb0.C75604z3.m90844p()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r15 = java.lang.Long.valueOf(r13)
            r5[r6] = r15
            java.lang.Long r15 = java.lang.Long.valueOf(r11)
            r16 = 1
            r5[r16] = r15
            int r15 = r2.f317164e
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 2
            r5[r16] = r15
            java.lang.String r15 = "MicroMsg.VoipScoreState"
            java.lang.String r4 = "needShowScoreDialog, current:%s, lastShowScoreTime:%s, scoreIntervalDay:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r5)
            java.lang.String r4 = r2.f317163d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x03cf
            int r2 = r2.f317164e
            if (r2 <= 0) goto L_0x03cf
            if (r9 <= 0) goto L_0x03c8
            long r13 = r13 - r11
            long r4 = (long) r2
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 * r11
            int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x03cf
        L_0x03c8:
            java.lang.String r2 = "needShowScoreDialog, exceed limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            r2 = 1
            goto L_0x03d0
        L_0x03cf:
            r2 = 0
        L_0x03d0:
            if (r2 == 0) goto L_0x0464
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r2 = r2.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.VoipScoreState r2 = r2.f317464O
            r2.getClass()
            long r4 = eb0.C75604z3.m90844p()
            f40.C86709a0.m107528h()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r2.mo119677K(r10, r9)
            r2 = 1
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r9[r6] = r2
            java.lang.String r2 = "MicroMsg.VoipScoreState"
            java.lang.String r4 = "markShowScoreDialog %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r9)
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r4 = r38.mo152444R0()
            java.lang.Class<com.tencent.mm.plugin.voip.widget.VoipScoreDialog> r5 = com.tencent.p014mm.plugin.voip.widget.VoipScoreDialog.class
            r2.<init>(r4, r5)
            java.lang.String r4 = "key_score_state"
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r5 = r5.f317332a
            com.tencent.mm.plugin.voip.model.r r5 = r5.f317396a
            com.tencent.mm.plugin.voip.model.VoipScoreState r5 = r5.f317464O
            r2.putExtra(r4, r5)
            android.content.Context r4 = r38.mo152444R0()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 != 0) goto L_0x042c
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r4)
        L_0x042c:
            android.content.Context r4 = r38.mo152444R0()
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r2)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/voip/model/NewVoipMgr"
            java.lang.String r12 = "finish"
            java.lang.String r13 = "(Z)V"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r4
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r5.mo10231a(r6)
            android.content.Intent r2 = (android.content.Intent) r2
            r4.startActivity(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/voip/model/NewVoipMgr"
            java.lang.String r11 = "finish"
            java.lang.String r12 = "(Z)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r15 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0464:
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r2 = r2.f317332a
            com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
            com.tencent.mm.plugin.voip.model.VoipScoreState r4 = new com.tencent.mm.plugin.voip.model.VoipScoreState
            r4.<init>()
            r2.f317464O = r4
            com.tencent.mm.autogen.events.VoipEvent r2 = new com.tencent.mm.autogen.events.VoipEvent
            r2.<init>()
            com.tencent.mm.autogen.events.VoipEvent$a r4 = r2.f194019d
            r5 = 11
            r4.f194022b = r5
            r2.publish()
            boolean r2 = r1.f317066Q
            if (r2 != 0) goto L_0x049e
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()
            int r2 = r2.mo152615n()
            com.tencent.mm.plugin.voip.model.h0 r4 = l33.C109247e.xx0()
            long r4 = r4.mo152616o()
            boolean r9 = r1.f317101r
            r10 = 1
            r9 = r9 ^ r10
            z33.C112597j.m153945j(r2, r4, r9, r8)
            r1.f317066Q = r10
        L_0x049e:
            di3.d r0 = di3.C86312j.m106911c(r0)
            bd2.d r0 = (bd2.C79690d) r0
            eb0.u2 r0 = r0.mo109806kA()
            com.tencent.mm.booter.notification.MMNotification r0 = (com.tencent.p014mm.booter.notification.MMNotification) r0
            r2 = 40
            r0.mo93207e(r2)
            p80.b r0 = p80.C110193b.f329648a
            r0.mo161593c()
            if (r3 == 0) goto L_0x055e
            java.lang.String r0 = r1.f317098p
            if (r0 == 0) goto L_0x055e
            nj2.j r2 = nj2.C109750j.f328484a
            boolean r3 = r1.f317101r
            boolean r4 = r1.f317068R
            if (r3 == 0) goto L_0x055e
            java.util.HashMap<java.lang.String, java.lang.String> r3 = nj2.C109750j.f328490g
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x04cd
            goto L_0x04d3
        L_0x04cd:
            boolean r5 = z04.C112551y.m153811k(r3)
            if (r5 == 0) goto L_0x04d6
        L_0x04d3:
            r5 = 1
            goto L_0x0547
        L_0x04d6:
            r10 = 1
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r2
            r9 = r0
            java.util.Set r5 = nj2.C109750j.m149064b(r8, r9, r10, r11, r12, r13)
            java.lang.String r5 = r2.mo160989a(r5)
            if (r5 == 0) goto L_0x04f6
            nj2.j$a r5 = r2.mo160993f(r5)
            java.lang.String r5 = r5.f328491a
            boolean r5 = gy3.C87412m.m108589b(r5, r3)
            if (r5 != 0) goto L_0x04f3
            goto L_0x04f6
        L_0x04f3:
            r5 = 1
            r8 = 0
            goto L_0x04f8
        L_0x04f6:
            r5 = 1
            r8 = 1
        L_0x04f8:
            java.lang.String[] r9 = new java.lang.String[r5]
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            c30.g r5 = new c30.g
            r5.<init>()
            java.lang.String r12 = "ringtoneId"
            r5.put(r12, r3)
            java.lang.String r3 = "tick"
            r5.mo145954o(r3, r10)
            java.lang.String r3 = "linkToSetting"
            r5.mo145966q(r3, r6)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "JSONObject().apply {\n   …\n            }.toString()"
            gy3.C87412m.m108593f(r3, r5)
            r9[r6] = r3
            java.util.Set r3 = sx3.C110826x0.m151015c(r9)
            r5 = 1
            r2.mo160994g(r0, r5, r3)
            nj2.p r2 = nj2.C61768p.f175586a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = nj2.C61768p.f175591f
            r3 = 0
            java.lang.String r2 = r2.getString(r0, r3)
            if (r2 != 0) goto L_0x0537
            wj2.h$a r2 = wj2.C66135h.f190107E
            wj2.f r2 = r2.mo90187b()
            goto L_0x053d
        L_0x0537:
            wj2.h$a r3 = wj2.C66135h.f190107E
            wj2.f r2 = r3.mo90190f(r2)
        L_0x053d:
            if (r8 == 0) goto L_0x0547
            boolean r2 = r2.mo90179j()
            if (r2 == 0) goto L_0x0547
            r8 = 1
            goto L_0x0548
        L_0x0547:
            r8 = 0
        L_0x0548:
            if (r4 == 0) goto L_0x054b
            goto L_0x0550
        L_0x054b:
            if (r8 != 0) goto L_0x054f
            if (r7 == 0) goto L_0x0550
        L_0x054f:
            r6 = 1
        L_0x0550:
            if (r6 == 0) goto L_0x055e
            zt3.t r2 = zt3.C119157j.f356862d
            nj2.k r3 = new nj2.k
            r3.<init>(r0)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r3)
        L_0x055e:
            e43.c r0 = e43.C107225c.f320827a
            r0 = 0
            e43.C107225c.f320828b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.NewVoipMgr.mo152440P0(boolean):void");
    }

    /* renamed from: Q */
    public int mo152441Q() {
        C112605m mVar = this.f317090e;
        if (mVar == null) {
            return -1;
        }
        return mVar.f337213a;
    }

    /* renamed from: Q0 */
    public final String mo152442Q0(long j) {
        return String.format("%02d:%02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)});
    }

    /* renamed from: R */
    public void mo152443R(int i) {
        mo152461a1(i != 2 ? i != 3 ? i != 4 ? new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf), 3) : new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc), 3) : new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.nce), 3) : new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncd), 3));
    }

    /* renamed from: R0 */
    public Context mo152444R0() {
        Context i3 = this.f317093h != null ? this.f317093h.mo152927i3() : null;
        return i3 == null ? MMApplicationContext.getContext() : i3;
    }

    /* renamed from: S */
    public String mo152445S() {
        return this.f317098p;
    }

    /* renamed from: S0 */
    public final void mo152446S0(int i) {
        if (i == 5) {
            int i2 = f317049d1;
            int[] iArr = f317050e1;
            f317049d1 = i2 + iArr[0];
            this.f317081X0++;
            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "mSignalStrength 4G" + iArr[0] + " and index is " + this.f317081X0);
        } else if (i == 4 && NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            try {
                f317050e1[1] = ConnectivityCompat.Companion.getWiFiRssi();
            } catch (Exception unused) {
                f317050e1[1] = 0;
                Log.m105924i("MicroMsg.Voip.NewVoipMgr", "error happened in get wifi info");
            }
            int i3 = f317049d1;
            int[] iArr2 = f317050e1;
            f317049d1 = i3 + iArr2[1];
            this.f317081X0++;
            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "mSignalStrength WIFI " + iArr2[1] + " and index is " + this.f317081X0);
        }
    }

    /* renamed from: T */
    public C108077f0 mo152447T() {
        return this.f317092g;
    }

    /* renamed from: T0 */
    public final void mo152448T0(int i) {
        String str;
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "hangupTalkingOrCancelInvite");
        if (true == mo152427G0()) {
            this.f317107x = i;
        }
        Context context = MMApplicationContext.getContext();
        String string = C112604l.m153984g(this.f317090e.f337213a) ? context.getString(C0966R.string.f361513kf2, new Object[]{mo152442Q0(Util.secondsToNow(this.f317052B))}) : this.f317101r ? context.getString(C0966R.string.kex) : context.getString(C0966R.string.kew);
        String username = this.f317100q.getUsername();
        if (this.f317102s) {
            int i2 = C72963f4.f212661I1;
            str = "voip_content_video";
        } else {
            int i3 = C72963f4.f212661I1;
            str = "voip_content_voice";
        }
        C106348g0.m143243d(username, str, this.f317101r ? 1 : 0, 6, string);
        if (!this.f317101r || C112604l.m153984g(this.f317090e.f337213a)) {
            this.f317089d.mo164354w();
            this.f317095j = true;
            this.f317096n = true;
            C109247e.xx0().mo152620s();
            if (4096 == this.f317107x) {
                mo149992d1(i);
                mo149986L0();
                return;
            }
            return;
        }
        mo152463c1();
        if (this.f317101r && !C112604l.m153984g(this.f317090e.f337213a)) {
            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "hangupVoipButton OnClick call cancelCall");
            C106350h0 xx02 = C109247e.xx0();
            xx02.getClass();
            C111730z zVar = C111730z.f334576a;
            C111730z.f334579d = C111730z.C111731a.HANGUP;
            C106359m0 m0Var = xx02.f317332a;
            m0Var.getClass();
            Log.m105924i("MicroMsg.Voip.VoipServiceEx", "cancelCall, roomId:" + m0Var.f317396a.f317500x.f317656n);
            C106377r rVar = m0Var.f317396a;
            v2protocal v2protocal = rVar.f317500x;
            if (v2protocal.f317656n == 0 && v2protocal.f317668r == 0) {
                m0Var.mo152669n();
            } else {
                C106401z zVar2 = v2protocal.f317568G1;
                int i4 = rVar.f317476a;
                zVar2.f317772a = i4 == 1 ? 0 : (i4 == 2 || i4 == 3) ? 1 : i4 == 4 ? 2 : 3;
                zVar2.f317784m = 3;
                if (i4 < 6) {
                    zVar2.f317786o = 1;
                }
                C115669n.INSTANCE.mo160140o(11521, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 1, Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()));
                m0Var.mo152656b(1);
            }
        }
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "hangupVoipButton OnClick call hangUp");
        C109247e.xx0().mo152620s();
        if (4096 == this.f317107x) {
            mo149992d1(i);
            mo149986L0();
        }
    }

    /* renamed from: U */
    public int mo152449U() {
        return this.f317065P;
    }

    /* renamed from: U0 */
    public void mo152450U0() {
        String str;
        C109247e.xx0().f317341j = C109247e.xx0().f317332a.mo152659e();
        String username = this.f317100q.getUsername();
        if (this.f317102s) {
            int i = C72963f4.f212661I1;
            str = "voip_content_video";
        } else {
            int i2 = C72963f4.f212661I1;
            str = "voip_content_voice";
        }
        boolean z = this.f317101r;
        C106348g0.m143243d(username, str, z ? 1 : 0, 6, MMApplicationContext.getContext().getString(C0966R.string.kf5));
        mo152463c1();
        mo149992d1(4108);
        mo152440P0(true);
    }

    /* renamed from: V */
    public void mo152451V(int i) {
        if (this.f317093h != null) {
            this.f317093h.mo152918V(i);
        }
    }

    /* renamed from: V0 */
    public boolean mo152452V0() {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "isMinimized mUIType: " + this.f317055E);
        if (2 != this.f317055E) {
            return false;
        }
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "already is widget");
        return true;
    }

    /* renamed from: W */
    public long mo152453W() {
        return this.f317064N;
    }

    /* renamed from: W0 */
    public void mo149988W0(boolean z) {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "do minimizeVoip");
        if (2 != this.f317055E || Build.VERSION.SDK_INT >= 24) {
            int i = this.f317090e.f337213a;
            if (262 == i || 8 == i) {
                Log.m105921e("MicroMsg.Voip.NewVoipMgr", "voip call has finished!，state is %s", Integer.valueOf(i));
                return;
            }
            if (this.f317093h != null) {
                this.f317093h.setScreenEnable(true);
            }
            this.f317059I = new C106510c(this, this.f317090e.f337213a, this.f317100q, this.f317102s, this.f317101r, z);
            C109247e.xx0().mo152593G(true, z);
            return;
        }
        Log.m105920e("MicroMsg.Voip.NewVoipMgr", "already is widget");
    }

    /* renamed from: X */
    public long mo152454X() {
        return this.f317063M;
    }

    /* renamed from: X0 */
    public void mo149989X0(boolean z) {
    }

    /* renamed from: Y */
    public boolean mo152455Y() {
        C104031a aVar;
        C108077f0 f0Var = this.f317092g;
        if (f0Var == null || (aVar = f0Var.f323642b) == null) {
            return false;
        }
        return aVar.mo145631c();
    }

    /* renamed from: Y0 */
    public void mo152456Y0(int i) {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onShowRecallTip() called with: reason = [" + i + "]");
        if (C106357m.m143310c()) {
            this.f317068R = true;
            C106348g0.m143241b(this.f317100q.getUsername(), i != 1 ? i != 2 ? i != 3 ? "" : MMApplicationContext.getContext().getString(C0966R.string.n69) : MMApplicationContext.getContext().getString(C0966R.string.n68) : MMApplicationContext.getContext().getString(C0966R.string.f361511kf0), this.f317102s, 0, i);
        }
    }

    /* renamed from: Z */
    public boolean mo152457Z() {
        return this.f317101r;
    }

    /* renamed from: Z0 */
    public void mo152458Z0(String str, int i) {
        int i2 = C109247e.vx0().f333459s == 0 ? 2 : 4;
        long j = (long) this.f317103t;
        long j2 = this.f317104u;
        long j3 = this.f317105v;
        boolean z = this.f317101r;
        long j4 = (long) i2;
        String str2 = this.f317089d.mo164346o().mo157500a() + "#" + str;
        C87412m.m108594g(str2, "audioDeviceType");
        VoipButtonStatusStruct voipButtonStatusStruct = new VoipButtonStatusStruct();
        voipButtonStatusStruct.f310345d = j;
        voipButtonStatusStruct.f310346e = j2;
        long j5 = 1;
        voipButtonStatusStruct.f310347f = j3 == 0 ? 1 : 2;
        voipButtonStatusStruct.mo148156s(String.valueOf(i));
        if (!z) {
            j5 = 2;
        }
        voipButtonStatusStruct.f310348g = j5;
        voipButtonStatusStruct.f310351j = j4;
        voipButtonStatusStruct.f310350i = System.currentTimeMillis();
        voipButtonStatusStruct.mo148157t(str2);
        voipButtonStatusStruct.mo86054n();
    }

    /* renamed from: a */
    public void mo152459a(C106447f fVar) {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onVoipUIDestroy");
        if (this.f317093h == fVar) {
            Log.m105918d("MicroMsg.Voip.NewVoipMgr", "same VoipUI, clear it");
            this.f317093h = null;
            this.f317089d.mo164339f((C106447f) null);
        }
    }

    /* renamed from: a0 */
    public boolean mo152460a0() {
        return this.f317102s;
    }

    /* renamed from: a1 */
    public void mo152461a1(C107054l.C107055a aVar) {
        int i = aVar.f320468a;
        if (i != 2) {
            this.f317089d.mo164338e();
        } else {
            C107054l.C107055a aVar2 = this.f317051A;
            if (aVar2 == null) {
                if (!C112604l.m153983f(this.f317090e.f337213a)) {
                    mo152444R0();
                    this.f317089d.mo164333I(new NewVoipMgr$$d(this));
                }
            } else if (aVar2.f320468a != 2 && i == 2) {
                mo152444R0();
                this.f317089d.mo164333I(new NewVoipMgr$$d(this));
            }
        }
        ConcurrentLinkedQueue<C13604l<Integer, Long>> concurrentLinkedQueue = C111730z.f334582g;
        Integer valueOf = Integer.valueOf(aVar.f320468a);
        long j = 0;
        if (C109247e.xx0().f317353v != 0) {
            j = Util.secondsToNow(C109247e.xx0().f317353v);
        }
        concurrentLinkedQueue.add(new C13604l(valueOf, Long.valueOf(j)));
        this.f317051A = aVar;
    }

    /* renamed from: b */
    public void mo150059b() {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onResumeGoodNetStatus");
        if (this.f317093h != null) {
            this.f317093h.mo152922c2();
        }
    }

    /* renamed from: b1 */
    public final boolean mo152462b1() {
        if (!this.f317090e.mo164380b(4101)) {
            return false;
        }
        this.f317102s = false;
        C106510c cVar = this.f317059I;
        if (cVar != null) {
            cVar.f318216n = false;
        }
        mo149992d1(4101);
        int i = this.f317090e.f337213a;
        if (261 == i || 7 == i) {
            C109247e.xx0().mo152597K(1);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(11046, 2, Long.valueOf(C109247e.xx0().mo152616o()), Integer.valueOf(C109247e.xx0().mo152615n()), 0, Integer.valueOf(this.f317101r ? 1 : 0));
            nVar.mo160131h(11080, 2, 0, 0);
        } else if (1 == i || 3 == i) {
            C109247e.xx0().mo152597K(1);
            C115669n.INSTANCE.mo160131h(11046, 1, Long.valueOf(C109247e.xx0().mo152616o()), Integer.valueOf(C109247e.xx0().mo152615n()), 0, Integer.valueOf(this.f317101r ? 1 : 0));
        }
        C109247e.xx0().f317332a.f317396a.mo152717t();
        C109247e.xx0().f317332a.f317396a.mo152716s();
        return true;
    }

    /* renamed from: c */
    public void mo145647c(int i) {
    }

    /* renamed from: c1 */
    public void mo152463c1() {
        if (this.f317093h != null) {
            this.f317093h.mo152919V0();
        }
        C112592e eVar = this.f317089d;
        if (eVar != null) {
            eVar.mo164355x(false);
        }
        Bundle bundle = new Bundle();
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
        bundle.putLong("roomKey", C109247e.xx0().f317332a.mo152660f());
        bundle.putBoolean("isVideoCall", this.f317102s);
        bundle.putBoolean("isOutCall", this.f317101r);
        bundle.putString("username", this.f317098p);
        ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.VOIP, bundle);
        C112592e eVar2 = this.f317089d;
        if (eVar2 != null) {
            eVar2.mo164355x(false);
        }
    }

    /* renamed from: d */
    public void mo152464d(C106447f fVar) {
        this.f317056F++;
        if (this.f317093h != null) {
            this.f317093h.mo152925f0(false, true);
            this.f317093h = null;
            this.f317089d.mo164339f(this.f317093h);
        }
        mo152494v(fVar, 2);
        if (261 != this.f317090e.f337213a) {
        }
        C107054l.C107055a aVar = this.f317051A;
        if (aVar != null) {
            int i = aVar.f320468a;
        }
        mo152463c1();
    }

    /* renamed from: d0 */
    public void mo152465d0(boolean z, boolean z2) {
        int c = C112604l.m153980c(z, z2);
        if (this.f317106w) {
            if (c == 0) {
                c = 1;
            } else if (256 == c) {
                c = 257;
            }
        }
        if (z) {
            this.f317090e = C112604l.m153979b(c);
        } else {
            this.f317090e = C112604l.m153978a(c);
        }
        Log.m105925i("MicroMsg.Voip.NewVoipMgr", "steve:[simucall] resetStateMachine, initState:%d,isOutCall:%s,isVideoCall:%s", Integer.valueOf(c), Boolean.valueOf(z), Boolean.valueOf(z2));
        this.f317101r = z;
    }

    /* renamed from: d1 */
    public void mo149992d1(int i) {
        Log.printDebugStack("MicroMsg.Voip.NewVoipMgr", "swtchState, action: %s, currentState: %s", C112604l.m153981d(i), C112604l.m153981d(this.f317090e.f337213a));
        if (!C112604l.m153983f(this.f317090e.f337213a)) {
            if (4111 == i || (4101 == i && (C112604l.m153984g(this.f317090e.f337213a) || this.f317101r))) {
                this.f317089d.mo164351r();
                C107054l.C107055a aVar = this.f317051A;
                if (aVar != null && 1 == this.f317055E && 1 == aVar.f320468a) {
                    this.f317089d.mo164329D(false);
                    this.f317061K = true;
                    C107054l.C107055a aVar2 = this.f317051A;
                    if (aVar2 != null && aVar2.f320468a == 2) {
                        mo152444R0();
                        this.f317089d.mo164333I(new NewVoipMgr$$d(this));
                    }
                    if (!C109247e.xx0().mo152623v()) {
                        this.f317089d.mo164353v();
                        this.f317089d.mo164334J(this.f317098p, false, this.f317101r);
                    }
                }
            }
        } else if (i != 4100) {
            if (i == 4101) {
                C108077f0 f0Var = this.f317092g;
                if (f0Var != null) {
                    f0Var.mo158495j();
                }
                this.f317102s = false;
                C106510c cVar = this.f317059I;
                if (cVar != null) {
                    cVar.f318216n = false;
                }
                C110152e eVar = C109247e.xx0().f317355x;
                if (eVar != null) {
                    eVar.f329556y = false;
                    VoIPRenderTextureView voIPRenderTextureView = eVar.f329553v;
                    if (voIPRenderTextureView != null) {
                        voIPRenderTextureView.setVisibility(8);
                    }
                    View view = eVar.f329509e;
                    if (view != null) {
                        TextView textView = (TextView) view.findViewById(C0966R.C0970id.hjz);
                        int f = eVar.mo150884f();
                        textView.setText(f);
                        if (eVar.f329513i == null) {
                            eVar.f329513i = new C110140b.C110141a();
                        }
                        C110140b.C110141a aVar3 = eVar.f329513i;
                        if (aVar3 != null) {
                            aVar3.mo161555b();
                        }
                        C110140b.C110141a aVar4 = eVar.f329513i;
                        if (aVar4 != null) {
                            String string = view.getResources().getString(f);
                            C87412m.m108593f(string, "resources.getString(text)");
                            aVar4.mo161554a(textView, string, 500);
                        }
                        View findViewById = view.findViewById(C0966R.C0970id.hjj);
                        findViewById.setBackground(findViewById.getResources().getDrawable(eVar.mo150883d()));
                    }
                }
            } else if (i == 4112) {
                mo149997h0(true);
                C109247e.xx0().f317332a.f317396a.f317473X = true;
            } else if (i == 4113) {
                mo149997h0(false);
                C109247e.xx0().f317332a.f317396a.f317473X = false;
            }
        } else if (!C109247e.xx0().mo152623v()) {
            this.f317089d.mo164353v();
        }
        C112605m mVar = this.f317090e;
        if (!mVar.mo164380b(i)) {
            Log.m105920e("MicroMsg.Voip.VoipStateMachine", "can't tranform due to no such rule");
        } else {
            int intValue = ((Integer) ((Map) ((HashMap) mVar.f337214b).get(Integer.valueOf(mVar.f337213a))).get(Integer.valueOf(i))).intValue();
            Log.m105919d("MicroMsg.Voip.VoipStateMachine", "from oldState: %s to newState: %s, action: %s", C112604l.m153981d(mVar.f337213a), C112604l.m153981d(intValue), C112604l.m153981d(i));
            mVar.f337213a = intValue;
        }
        if (this.f317093h != null) {
            this.f317093h.mo152924e5(i, this.f317090e.f337213a);
        }
        int i2 = this.f317090e.f337213a;
        if (i2 == 258 || i2 == 259) {
            WearVoipControllerEvent wearVoipControllerEvent = new WearVoipControllerEvent();
            wearVoipControllerEvent.f107832d.f107833a = 5;
            wearVoipControllerEvent.publish();
        } else if (i2 == 262) {
            WearVoipControllerEvent wearVoipControllerEvent2 = new WearVoipControllerEvent();
            wearVoipControllerEvent2.f107832d.f107833a = 6;
            wearVoipControllerEvent2.publish();
        }
    }

    /* renamed from: e */
    public boolean mo152466e() {
        if (C109247e.xx0().mo152615n() != 0) {
            return mo152462b1();
        }
        this.f317109y = true;
        return true;
    }

    /* renamed from: e0 */
    public void mo149993e0() {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.mo158491f();
        }
    }

    /* renamed from: f */
    public void mo152467f(VoIPRenderTextureView voIPRenderTextureView) {
    }

    /* renamed from: f0 */
    public void mo152468f0(String str) {
        if (this.f317093h != null) {
            this.f317062L = str;
            this.f317093h.mo152915Q2(str);
        }
    }

    /* renamed from: g */
    public void mo152469g(boolean z) {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.mo158498m(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152470g0(android.content.Context r21, java.lang.String r22, boolean r23, boolean r24, long r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r7 = r22
            r2 = r23
            r3 = r24
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r8 = 0
            r4[r8] = r7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r23)
            r9 = 1
            r4[r9] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r24)
            r6 = 2
            r4[r6] = r5
            java.lang.String r10 = "MicroMsg.Voip.NewVoipMgr"
            java.lang.String r5 = "start VoIP, userName: %s, isOutCall: %b, isVideoCall: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r4)
            z33.e r4 = r0.f317089d
            r4.mo164330E(r3, r2)
            if (r2 == 0) goto L_0x0031
            z33.e r4 = r0.f317089d
            r4.mo164344j()
        L_0x0031:
            r0.f317058H = r9
            r0.f317098p = r7
            r0.f317101r = r2
            r0.f317102s = r3
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r5 = r0.f317098p
            com.tencent.mm.storage.z1 r4 = r4.get(r5)
            r0.f317100q = r4
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r5 = "VOIPCameraSwitch"
            java.lang.String r4 = r4.mo107405c(r5)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r9)
            if (r4 != 0) goto L_0x0067
            r4 = 1
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            r0.f317106w = r4
            boolean r4 = r0.f317102s
            if (r4 != 0) goto L_0x0070
            r0.f317106w = r8
        L_0x0070:
            int r3 = z33.C112604l.m153980c(r23, r24)
            boolean r4 = r0.f317106w
            if (r4 == 0) goto L_0x0089
            if (r3 != 0) goto L_0x007c
            r3 = 1
            goto L_0x0082
        L_0x007c:
            r4 = 256(0x100, float:3.59E-43)
            if (r4 != r3) goto L_0x0082
            r3 = 257(0x101, float:3.6E-43)
        L_0x0082:
            com.tencent.mm.plugin.voip.model.h0 r4 = l33.C109247e.xx0()
            r4.mo152597K(r9)
        L_0x0089:
            if (r2 == 0) goto L_0x0092
            z33.m r2 = z33.C112604l.m153979b(r3)
            r0.f317090e = r2
            goto L_0x0098
        L_0x0092:
            z33.m r2 = z33.C112604l.m153978a(r3)
            r0.f317090e = r2
        L_0x0098:
            z33.e r2 = r0.f317089d
            z33.m r3 = r0.f317090e
            r2.mo164331F(r3)
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "meizu"
            boolean r4 = r2.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x00ab
            r4 = 1
            goto L_0x00b1
        L_0x00ab:
            r4 = 27
            boolean r4 = p903ij.C76359b.m91784a(r4)
        L_0x00b1:
            boolean r5 = p903ij.C76359b.m91785b()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x00ed
            r2 = 11306(0x2c2a, float:1.5843E-41)
            if (r4 != 0) goto L_0x00d5
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r11 = new java.lang.Object[r6]
            boolean r12 = r0.f317102s
            r12 = r12 ^ r9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r8] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11[r9] = r12
            r3.mo160131h(r2, r11)
        L_0x00d5:
            if (r5 != 0) goto L_0x00ed
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            boolean r11 = r0.f317102s
            r11 = r11 ^ r9
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6[r8] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r6[r9] = r11
            r3.mo160131h(r2, r6)
        L_0x00ed:
            r11 = 0
            if (r5 == 0) goto L_0x00f2
            if (r4 != 0) goto L_0x013b
        L_0x00f2:
            if (r4 != 0) goto L_0x0105
            if (r5 != 0) goto L_0x0105
            r2 = 2131838710(0x7f1146f6, float:1.931065E38)
            java.lang.String r2 = r1.getString(r2)
            r3 = 2131838657(0x7f1146c1, float:1.9310543E38)
            java.lang.String r3 = r1.getString(r3)
            goto L_0x0129
        L_0x0105:
            if (r4 != 0) goto L_0x0116
            r2 = 2131838712(0x7f1146f8, float:1.9310655E38)
            java.lang.String r2 = r1.getString(r2)
            r3 = 2131838658(0x7f1146c2, float:1.9310545E38)
            java.lang.String r3 = r1.getString(r3)
            goto L_0x0129
        L_0x0116:
            if (r5 != 0) goto L_0x0127
            r2 = 2131838711(0x7f1146f7, float:1.9310653E38)
            java.lang.String r2 = r1.getString(r2)
            r3 = 2131838659(0x7f1146c3, float:1.9310548E38)
            java.lang.String r3 = r1.getString(r3)
            goto L_0x0129
        L_0x0127:
            r2 = r11
            r3 = r2
        L_0x0129:
            r4 = 2131838660(0x7f1146c4, float:1.931055E38)
            java.lang.String r4 = r1.getString(r4)
            r5 = 1
            com.tencent.mm.plugin.voip.model.NewVoipMgr$3 r6 = new com.tencent.mm.plugin.voip.model.NewVoipMgr$3
            r6.<init>(r1)
            r1 = r21
            nj3.C76879j.m92711E(r1, r2, r3, r4, r5, r6)
        L_0x013b:
            java.lang.String r1 = "initMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            java.lang.String r1 = "kerrizhang VoipModelResMgr init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            com.tencent.mm.plugin.voip.model.VoipModelResMgr r1 = com.tencent.p014mm.plugin.voip.model.VoipModelResMgr.f207454a
            r1.mo98752d()
            com.tencent.mm.booter.a r1 = com.tencent.p014mm.booter.C92614a.m116679d()
            r1.mo126634a()
            v33.b r1 = l33.C109247e.vx0()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f333458r = r2
            boolean r1 = r0.f317073T0
            if (r1 == 0) goto L_0x0166
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            r1.mo152587A()
        L_0x0166:
            boolean r1 = r0.f317102s
            if (r1 == 0) goto L_0x0174
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            java.lang.String r2 = r0.f317098p
            r1.mo152590D(r9, r9, r2)
            goto L_0x017d
        L_0x0174:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            java.lang.String r2 = r0.f317098p
            r1.mo152590D(r9, r8, r2)
        L_0x017d:
            boolean r1 = r0.f317101r
            if (r1 == 0) goto L_0x01c5
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
            r1.mo152657c()
            boolean r1 = r0.f317102s
            if (r1 == 0) goto L_0x01a6
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.storage.z1 r2 = r0.f317100q
            java.lang.String r2 = r2.getUsername()
            boolean r3 = r1.mo152604c(r2, r8)
            if (r3 == 0) goto L_0x019f
            goto L_0x01b6
        L_0x019f:
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
            int r1 = r1.mo152655a(r2, r8, r8)
            goto L_0x01be
        L_0x01a6:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.storage.z1 r2 = r0.f317100q
            java.lang.String r2 = r2.getUsername()
            boolean r3 = r1.mo152604c(r2, r9)
            if (r3 == 0) goto L_0x01b8
        L_0x01b6:
            r1 = 0
            goto L_0x01be
        L_0x01b8:
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
            int r1 = r1.mo152655a(r2, r8, r9)
        L_0x01be:
            if (r1 >= 0) goto L_0x01c5
            r20.mo149987O0()
            goto L_0x0312
        L_0x01c5:
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.n r1 = r1.mo152624w()
            com.tencent.p014mm.plugin.voip.model.C106357m.m143315m(r1)
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r1 = r1.f317396a
            r1.f317501y = r2
            r1.f317502z = r0
            java.lang.String r1 = "MicroMsg.Voip.VoipServiceEx"
            java.lang.String r2 = "attach ui........"
            z33.C112597j.m153936a(r1, r2)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            r0.f317091f = r1
            android.telephony.PhoneStateListener r2 = r0.f317087b1
            r3 = 32
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r3)
            r4.mo10233c(r2)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/voip/model/NewVoipMgr"
            java.lang.String r15 = "initMgr"
            java.lang.String r16 = "()Z"
            java.lang.String r17 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r18 = "listen"
            java.lang.String r19 = "(Landroid/telephony/PhoneStateListener;I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r4.mo10231a(r8)
            android.telephony.PhoneStateListener r2 = (android.telephony.PhoneStateListener) r2
            java.lang.Object r3 = r4.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.listen(r2, r3)
            java.lang.String r13 = "com/tencent/mm/plugin/voip/model/NewVoipMgr"
            java.lang.String r14 = "initMgr"
            java.lang.String r15 = "()Z"
            java.lang.String r16 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r17 = "listen"
            java.lang.String r18 = "(Landroid/telephony/PhoneStateListener;I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "voip_recent_contact"
            r1.append(r2)
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "voip_plugin_prefs"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r8)
            java.lang.String r3 = r2.getString(r1, r11)
            java.lang.String r4 = ";"
            if (r3 == 0) goto L_0x02ae
            java.lang.String[] r3 = r3.split(r4)
            java.util.ArrayList r3 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r3)
            if (r3 == 0) goto L_0x02ae
            int r5 = r3.size()
            java.lang.String r6 = r0.f317098p
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x028c
            if (r5 <= r9) goto L_0x029e
            java.lang.String r5 = r0.f317098p
            r3.remove(r5)
            java.lang.String r5 = r0.f317098p
            r3.add(r8, r5)
            goto L_0x029e
        L_0x028c:
            r6 = 4
            if (r6 != r5) goto L_0x0299
            int r5 = r5 - r9
            r3.remove(r5)
            java.lang.String r5 = r0.f317098p
            r3.add(r8, r5)
            goto L_0x029e
        L_0x0299:
            java.lang.String r5 = r0.f317098p
            r3.add(r8, r5)
        L_0x029e:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r3, r4)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)
            r1.commit()
            goto L_0x02c7
        L_0x02ae:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r5 = r0.f317098p
            r3.add(r8, r5)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r3, r4)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)
            r1.commit()
        L_0x02c7:
            com.tencent.mm.sdk.event.IListener r1 = r0.f317088c1
            r1.alive()
            com.tencent.mm.sdk.event.IListener r1 = r0.f317079W0
            r1.alive()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "android.intent.action.SCREEN_ON"
            r1.addAction(r2)
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            r1.addAction(r2)
            java.lang.String r2 = "android.intent.action.USER_PRESENT"
            r1.addAction(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.BroadcastReceiver r3 = r0.f317077V0
            r2.registerReceiver(r3, r1)
            boolean r1 = z33.C112595h.f337171f
            if (r1 != 0) goto L_0x02f9
            boolean r1 = r0.f317102s
            if (r1 == 0) goto L_0x02f9
            r20.mo149985K0()
        L_0x02f9:
            z33.c r1 = r0.f317069R0
            r1.f337121h = r8
            r1.mo164324a()
            z33.c r1 = r0.f317069R0
            r1.mo164325b()
            oe.m r1 = new oe.m
            java.lang.String r2 = "VoIp"
            r1.<init>(r2)
            r0.f317075U0 = r1
            r1.mo182519b()
            r8 = 1
        L_0x0312:
            if (r8 == 0) goto L_0x0322
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            boolean r3 = r0.f317102s
            r4 = 0
            r2 = r22
            r5 = r25
            r1.mo152603b(r2, r3, r4, r5)
        L_0x0322:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.NewVoipMgr.mo152470g0(android.content.Context, java.lang.String, boolean, boolean, long):void");
    }

    /* renamed from: h */
    public void mo152471h() {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "it is init voip report");
        this.f317080X = new NetChangedBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        MMApplicationContext.getContext().registerReceiver(this.f317080X, intentFilter);
        this.f317099p0 = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        this.f317076V = C112597j.m153940e(mo152444R0());
        C1063164 r1 = new PhoneStateListener() {
            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                super.onSignalStrengthsChanged(signalStrength);
                super.onSignalStrengthsChanged(signalStrength);
                String[] split = signalStrength.toString().split(" ");
                try {
                    if (NewVoipMgr.this.f317099p0.getNetworkType() == 13 && split.length > 9) {
                        NewVoipMgr.f317050e1[0] = Util.safeParseInt(split[9]);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Voip.NewVoipMgr", e, "", new Object[0]);
                }
            }
        };
        this.f317082Y = r1;
        try {
            TelephonyManager telephonyManager = this.f317099p0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(256);
            aVar.mo10233c(r1);
            C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/voip/model/NewVoipMgr", "initVoipReport", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/voip/model/NewVoipMgr", "initVoipReport", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Voip.NewVoipMgr", "listen telephony failed cause %s", e.getCause());
        }
    }

    /* renamed from: h0 */
    public void mo149997h0(boolean z) {
        if (this.f317093h != null) {
            this.f317093h.mo152926h0(z);
        }
    }

    /* renamed from: i */
    public void mo152472i(boolean z, boolean z2) {
        if (z2) {
            mo152437N0(z ? 3 : 4);
            mo152458Z0(z ? "Speaker" : "Receiver", 20);
        }
        Log.m105925i("MicroMsg.Voip.NewVoipMgr", "onSpeakerStateChanged, isSpeakerOn: %b", Boolean.valueOf(z));
        this.f317089d.mo164329D(z);
        this.f317089d.mo164348p(true);
    }

    /* renamed from: i0 */
    public void mo149999i0() {
        mo149992d1(4102);
        this.f317052B = Util.nowSecond();
        this.f317057G = Util.nowMilliSecond();
        if (this.f317092g != null) {
            if (C109247e.vx0().f333451k) {
                C109247e.xx0().f317332a.mo152670o(true);
            } else {
                C109247e.xx0().f317332a.mo152670o(false);
            }
        }
        C109247e.vx0().f333459s = Util.nowMilliSecond();
        mo152428H0(3);
        this.f317111z = true;
        C106350h0 xx02 = C109247e.xx0();
        long j = this.f317052B;
        xx02.f317353v = j;
        boolean z = this.f317102s;
        boolean z2 = this.f317101r;
        String str = this.f317098p;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, Boolean.FALSE);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_STATUS_VIDEO_MODE_BOOLEAN, Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_STATUS_OUT_CALL_BOOLEAN, Boolean.valueOf(z2));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_STATUS_BEFORE_TIME_LONG, Long.valueOf(j));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_STATUS_TO_USER_STRING, str);
        C86709a0.m107535s().mo121142i().mo119681a(true);
        if (this.f317093h != null) {
            this.f317093h.mo152917T6(this.f317052B);
        }
        boolean q = C109247e.xx0().f317332a.f317396a.mo152714q();
        boolean r = C109247e.xx0().f317332a.f317396a.mo152715r();
        if (this.f317102s && this.f317101r && !r && !q) {
            C109247e.xx0().mo152597K(1);
        }
        if (!C112604l.m153983f(this.f317090e.f337213a)) {
            C115669n.INSTANCE.mo160131h(11080, 1, 0, 0);
        }
        Util.shake(MMApplicationContext.getContext(), true);
        C106350h0 xx03 = C109247e.xx0();
        int i = C109247e.xx0().f317332a.f317396a.f317500x.f317566G;
        C106359m0 m0Var = xx03.f317332a;
        m0Var.getClass();
        if (i > 0) {
            C106359m0.f317391B = i;
        }
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        if (telephonyManager != null) {
            C106370n0 n0Var = new C106370n0(m0Var, telephonyManager);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(256);
            aVar.mo10233c(n0Var);
            C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/voip/model/VoipServiceEx", "VOIPmoileSignalStrength", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/voip/model/VoipServiceEx", "VOIPmoileSignalStrength", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        }
        m0Var.f317407l = new C106359m0.C106367h();
        MMApplicationContext.getContext().registerReceiver(m0Var.f317407l, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        C112581a.m153848a();
        C34379c<?> cVar = m0Var.f317399d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C34379c<?> cVar2 = m0Var.f317400e;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        C106359m0.C106365f fVar = new C106359m0.C106365f();
        m0Var.f317406k = new C106359m0.C106364e();
        C119179t tVar = C119157j.f356862d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m0Var.f317399d = ((C119157j) tVar).mo183873d(fVar, 0, timeUnit.toMillis((long) C106359m0.f317391B));
        m0Var.f317400e = ((C119157j) C119157j.f356862d).mo183873d(m0Var.f317406k, 0, timeUnit.toMillis((long) 3));
        C106343f0.m143231a().mo152577d();
        C106343f0.m143231a().mo152575b(this);
        int n = C109247e.xx0().mo152615n();
        Log.m105924i("MicroMsg.VoipBeautyPerfStat", "setRoomId:" + n);
        C106372o.f317443a = n;
        C111720c0 c0Var = C111720c0.f334432a;
        C111720c0.f334438g = System.currentTimeMillis();
        C34379c cVar3 = this.f317071S0;
        if (cVar3 != null) {
            cVar3.cancel(false);
        }
        this.f317071S0 = ((C119157j) C119157j.f356862d).mo183872c(new NewVoipMgr$$c(), 0, 10000);
    }

    /* renamed from: j */
    public void mo152473j(boolean z, boolean z2) {
    }

    /* renamed from: j0 */
    public void mo152474j0(boolean z) {
        C108126x0 x0Var;
        C108117v vVar;
        C110901b bVar;
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null && (x0Var = f0Var.f323646f) != null && (vVar = x0Var.f323776c) != null && (bVar = vVar.f323759t) != null) {
            C111725u uVar = C111384c.f333465d;
            if (uVar != null) {
                if (uVar.f334488G == 0) {
                    uVar.f334488G = Util.nowMilliSecond();
                }
                long milliSecondsToNow = Util.milliSecondsToNow(uVar.f334488G);
                if (201 <= milliSecondsToNow && milliSecondsToNow < 500) {
                    uVar.f334483B++;
                    uVar.f334486E += milliSecondsToNow;
                } else if (milliSecondsToNow > 500) {
                    uVar.f334484C++;
                    uVar.f334487F += milliSecondsToNow;
                }
                uVar.f334485D++;
                uVar.f334488G = Util.nowMilliSecond();
            }
            long currentTimeMillis = System.currentTimeMillis();
            bVar.f331707a = currentTimeMillis;
            if (bVar.f331708b) {
                bVar.f331708b = false;
                C111725u uVar2 = C111384c.f333465d;
                if (uVar2 != null) {
                    uVar2.mo163434p(false, Util.milliSecondsToNow(currentTimeMillis));
                }
            }
        }
    }

    /* renamed from: k0 */
    public void mo152475k0(int i) {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.mo158498m(i);
            if (this.f317093h != null) {
                this.f317093h.mo152923e3(i);
            }
        }
    }

    /* renamed from: l */
    public void mo152476l(boolean z) {
        mo152437N0(z ? 2 : 1);
        this.f317089d.mo164352u(z);
    }

    /* renamed from: l0 */
    public void mo152477l0(int i) {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "steve:[simucall]onNewSimulCallAutoAccept, callType: " + i);
        if (this.f317090e.mo164380b(4100)) {
            C106350h0 xx02 = C109247e.xx0();
            boolean z = false;
            boolean z2 = i == 1;
            if (i == 1) {
                z = true;
            }
            xx02.mo152602a(z2, z);
            mo152463c1();
            if (i == 1 && C112604l.m153983f(this.f317090e.f337213a)) {
                mo149992d1(4101);
            }
            mo149992d1(4100);
        }
    }

    /* renamed from: m */
    public boolean mo152478m() {
        if (!this.f317090e.mo164380b(4101)) {
            return false;
        }
        mo152463c1();
        C109247e.xx0().mo152597K(1);
        C109247e.xx0().mo152602a(true, this.f317102s);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11046, 1, Long.valueOf(C109247e.xx0().mo152616o()), Integer.valueOf(C109247e.xx0().mo152615n()), 0, Integer.valueOf(this.f317101r ? 1 : 0));
        nVar.mo160131h(11080, 2, 0, 0);
        mo149992d1(4111);
        mo149992d1(4101);
        mo149992d1(4100);
        return true;
    }

    /* renamed from: m0 */
    public void mo152479m0(int i) {
        C108117v vVar;
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "setSharpenFilter1080p, isON: " + i + "，mVoipUI: " + this.f317093h);
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.getClass();
            Log.m105925i("MicroMsg.VoIPRenderMgr", "setSharpenFilter1080p, mIsStarted:%b, isON:%d", Boolean.TRUE, Integer.valueOf(i));
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null && (vVar = x0Var.f323776c) != null) {
                vVar.mo158464d(new C108060a0(vVar, i));
            }
        }
    }

    /* renamed from: n */
    public void mo152480n() {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            Log.printInfoStack("MicroMsg.VoIPRenderMgr", "onRender Mode changed", new Object[0]);
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null) {
                Log.printInfoStack("MicroMsg.VoipWindowsSurfaceRenderer", "switchRenderSurface", new Object[0]);
                C108128y0 y0Var = x0Var.f323775b;
                if (y0Var != null) {
                    Log.printInfoStack(y0Var.f323609b, "switchRenderSurface", new Object[0]);
                    y0Var.mo158464d(new C108089i(y0Var));
                }
                C108117v vVar = x0Var.f323776c;
                if (vVar != null) {
                    Log.printInfoStack(vVar.f323609b, "switchRenderSurface", new Object[0]);
                    vVar.mo158464d(new C108089i(vVar));
                }
            }
            C108126x0 x0Var2 = f0Var.f323646f;
            if (x0Var2 != null) {
                x0Var2.mo158531d();
            }
        }
    }

    /* renamed from: n0 */
    public void mo152481n0(int i) {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onSessionBeingCalled, callType: " + i);
        if (this.f317090e.mo164380b(4110)) {
            C106350h0 xx02 = C109247e.xx0();
            boolean z = false;
            boolean z2 = i == 1;
            if (i == 1) {
                z = true;
            }
            xx02.mo152602a(z2, z);
            mo152463c1();
            if (i == 1 && C112604l.m153983f(this.f317090e.f337213a)) {
                mo149992d1(4101);
            }
            mo149992d1(4110);
        }
    }

    /* renamed from: o */
    public boolean mo152482o() {
        if (!this.f317090e.mo164380b(4098)) {
            return false;
        }
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onCancelVoiceInvite");
        mo152448T0(4098);
        C109247e.xx0().mo152614m();
        return true;
    }

    /* renamed from: o0 */
    public long mo152483o0() {
        long z = this.f317089d.mo164356z();
        Log.printInfoStack("MicroMsg.Voip.NewVoipMgr", "totalDeviceNearTime: %s", Long.valueOf(z));
        return z / 1000;
    }

    /* renamed from: p */
    public boolean mo152484p() {
        if (!this.f317090e.mo164380b(4103)) {
            return false;
        }
        mo152448T0(4103);
        C109247e.xx0().mo152614m();
        return true;
    }

    /* renamed from: p0 */
    public void mo152485p0(C107054l.C107055a aVar) {
        C107054l.C107055a aVar2 = this.f317051A;
        if (!(aVar2 == null || aVar.f320468a == aVar2.f320468a)) {
            mo152458Z0(aVar.mo157500a(), 20);
        }
        mo152461a1(aVar);
    }

    /* renamed from: q */
    public boolean mo152486q() {
        String str;
        C112605m mVar = this.f317090e;
        if (mVar == null || !mVar.mo164380b(4099)) {
            return false;
        }
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onRejectVoiceInvite");
        String username = this.f317100q.getUsername();
        if (this.f317102s) {
            int i = C72963f4.f212661I1;
            str = "voip_content_video";
        } else {
            int i2 = C72963f4.f212661I1;
            str = "voip_content_voice";
        }
        boolean z = this.f317101r;
        C106348g0.m143243d(username, str, z ? 1 : 0, 6, MMApplicationContext.getContext().getString(C0966R.string.kf6));
        mo152463c1();
        C109247e.xx0().mo152627z();
        mo149992d1(4099);
        mo149986L0();
        return true;
    }

    /* renamed from: q0 */
    public void mo152487q0() {
        String str;
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onNoResp");
        mo149992d1(4105);
        String username = this.f317100q.getUsername();
        if (this.f317102s) {
            int i = C72963f4.f212661I1;
            str = "voip_content_video";
        } else {
            int i2 = C72963f4.f212661I1;
            str = "voip_content_voice";
        }
        C106348g0.m143243d(username, str, this.f317101r ? 1 : 0, 4, MMApplicationContext.getContext().getString(this.f317101r ? C0966R.string.kf9 : C0966R.string.mze));
        C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 6, Integer.valueOf(NetStatusUtil.getNetWorkType(mo152444R0())));
        mo149986L0();
    }

    /* renamed from: r */
    public void mo150072r() {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onNetWorkCostMax");
        if (this.f317093h != null) {
            this.f317093h.mo152935r();
        }
    }

    /* renamed from: r0 */
    public void mo152488r0() {
        C108126x0 x0Var;
        C108115u uVar;
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null && (x0Var = f0Var.f323646f) != null && (uVar = x0Var.f323774a) != null) {
            uVar.mo158524c(new C108121v0(x0Var));
        }
    }

    /* renamed from: s */
    public void mo152489s(boolean z, boolean z2, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f317058H) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || AppForegroundDelegate.INSTANCE.f343454n) {
            long j = this.f317083Y0;
            long j2 = j > 0 ? currentTimeMillis - j : 0;
            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "startVoipRing, isVideoCall:" + z + " isOutCall:" + z2 + " toUser:" + str + " seekStartMs:" + j2);
            Bundle bundle = new Bundle();
            bundle.putInt("isVideoCall", z ^ true ? 1 : 0);
            bundle.putString("username", str);
            bundle.putBoolean("isOutCall", z2);
            bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, IXWebBroadcastListener.STAGE_START);
            bundle.putLong("seekStartMs", j2);
            boolean vo = ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.VOIP, bundle);
            C112592e eVar = this.f317089d;
            if (eVar != null) {
                eVar.mo164355x(vo);
            }
            this.f317083Y0 = 0;
            return;
        }
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "start channel ring, now:" + currentTimeMillis);
        this.f317083Y0 = currentTimeMillis;
    }

    /* renamed from: s0 */
    public void mo152490s0(int i, int i2) {
        Log.m105925i("MicroMsg.Voip.NewVoipMgr", "adjustHWViewAspectRatio, HWDecsize:%dx%d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f317072T = i;
        this.f317074U = i2;
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.mo158487b(i, i2);
        }
    }

    /* renamed from: t0 */
    public void mo152491t0() {
        Log.m105918d("MicroMsg.Voip.NewVoipMgr", "onPretreatmentForStartDev");
        this.f317089d.mo164349q(this.f317061K, this.f317102s);
    }

    /* renamed from: u */
    public void mo152492u() {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.mo158487b(this.f317072T, this.f317074U);
        }
    }

    /* renamed from: u0 */
    public void mo152493u0(int i, int i2, int i3, ByteBuffer byteBuffer) {
        C108126x0 x0Var;
        C108117v vVar;
        if (this.f317092g != null) {
            if (this.f317093h != null && !C109247e.xx0().mo152622u()) {
                this.f317093h.mo152926h0(false);
            }
            C108077f0 f0Var = this.f317092g;
            if (f0Var != null && (x0Var = f0Var.f323646f) != null && byteBuffer != null && (vVar = x0Var.f323776c) != null) {
                vVar.mo158464d(new C108127y(vVar, i, i2, byteBuffer));
            }
        }
    }

    /* renamed from: v */
    public void mo152494v(C106447f fVar, int i) {
        SurfaceTexture surfaceTexture;
        C108091j jVar;
        int i2 = 0;
        Log.m105925i("MicroMsg.Voip.NewVoipMgr", "onVoipUICreated, uiType: %s,  mVoicePlayDevice: %s", Integer.valueOf(i), this.f317051A);
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(40);
        if (1 == i) {
            if (this.f317093h != null) {
                this.f317093h.mo152929k3(false);
            }
            mo152437N0(13);
            C106350h0 xx02 = C109247e.xx0();
            long currentTimeMillis = xx02.f317332a.f317396a.f317500x.f317647k > 0 ? System.currentTimeMillis() - xx02.f317332a.f317396a.f317500x.f317647k : 0;
            v2protocal v2protocal = xx02.f317332a.f317396a.f317500x;
            v2protocal.f317650l += currentTimeMillis;
            v2protocal.f317647k = 0;
        } else if (2 == i) {
            C109247e.xx0().f317332a.f317396a.f317500x.f317647k = System.currentTimeMillis();
        }
        if (C109247e.xx0().f317332a.mo152663h()) {
            this.f317111z = true;
        }
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            boolean z = 1 == i;
            if (f0Var.f323638I == null) {
                MTimerHandler mTimerHandler = new MTimerHandler("CameraPreviewInvalidChecker", (MTimerHandler.CallBack) new C108088h0(f0Var), true);
                f0Var.f323638I = mTimerHandler;
                mTimerHandler.startTimer(0, 1000);
            }
            C109247e.vx0().f333452l = z;
            if (C112595h.f337167b && z) {
                for (int i3 = 0; i3 < 2; i3++) {
                    if (i3 == 0) {
                        C108065b0.C108066a aVar = f0Var.f323663w.f323592a;
                        surfaceTexture = aVar.f323594a;
                        jVar = aVar.f323595b;
                    } else {
                        C108065b0.C108066a aVar2 = f0Var.f323663w.f323593b;
                        surfaceTexture = aVar2.f323594a;
                        jVar = aVar2.f323595b;
                    }
                    if (jVar == null) {
                        break;
                    }
                    C108126x0 x0Var = f0Var.f323646f;
                    if (x0Var != null) {
                        x0Var.mo158528a(jVar, i3);
                    }
                    f0Var.mo158493h(jVar, i3);
                    if (i3 == 0) {
                        C108065b0.C108066a aVar3 = f0Var.f323663w.f323592a;
                        aVar3.f323594a = surfaceTexture;
                        aVar3.f323595b = jVar;
                    } else {
                        C108065b0.C108066a aVar4 = f0Var.f323663w.f323593b;
                        aVar4.f323594a = surfaceTexture;
                        aVar4.f323595b = jVar;
                    }
                    C108126x0 x0Var2 = f0Var.f323646f;
                    if (x0Var2 != null) {
                        C108128y0 y0Var = x0Var2.f323775b;
                        if (y0Var != null) {
                            if (i3 == 0) {
                                y0Var.f323612e = jVar;
                            } else {
                                y0Var.f323613f = jVar;
                            }
                        }
                        C108117v vVar = x0Var2.f323776c;
                        if (vVar != null) {
                            if (i3 == 0) {
                                vVar.f323612e = jVar;
                            } else {
                                vVar.f323613f = jVar;
                            }
                        }
                    }
                    if (x0Var2 != null) {
                        x0Var2.mo158531d();
                    }
                }
            }
            f0Var.f323658r.f334526a.mo162594a(z ? 23 : 24);
        }
        this.f317093h = fVar;
        this.f317055E = i;
        this.f317089d.mo164339f(this.f317093h);
        this.f317093h.mo152924e5(-1, this.f317090e.f337213a);
        this.f317093h.mo152917T6(this.f317052B);
        this.f317093h.mo152909G0(0);
        this.f317093h.mo152909G0(0);
        if (this.f317093h instanceof Activity) {
            int rotation = ((WindowManager) ((Activity) this.f317093h).getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    i2 = 90;
                } else if (rotation == 2) {
                    i2 = 180;
                } else if (rotation == 3) {
                    i2 = 270;
                }
            }
            C108077f0 f0Var2 = this.f317092g;
            if (f0Var2 != null) {
                f0Var2.f323653m = i2;
            }
        }
    }

    /* renamed from: v0 */
    public void mo152495v0() {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.f323658r.getClass();
            C111717b bVar = C111384c.f333466e;
            boolean z = false;
            if (bVar != null) {
                int i = C109247e.vx0().f333460t;
                if (i > C110823p.m150975A(bVar.f334417g)) {
                    bVar.f334417g[0] = i;
                }
                int N = C110823p.m150988N(bVar.f334417g);
                if (i != 0 && (i < N || N == 0)) {
                    bVar.f334417g[1] = i;
                }
                int i2 = bVar.f334415e + i;
                bVar.f334415e = i2;
                bVar.f334415e = i2 / 2;
                if (Math.abs(bVar.f334416f - i) > 50) {
                    if (bVar.f334416f > i) {
                        Log.m105920e("MicroMsg.VoIPEncoderReport", "encode bitrate down ");
                    } else {
                        Log.m105920e("MicroMsg.VoIPEncoderReport", "encode bitrate up ");
                    }
                }
                bVar.f334416f = i;
                Log.m105924i("MicroMsg.VoIPEncoderReport", "encode bitrate refresh ,current is " + bVar.f334416f + ' ');
            }
            C111717b bVar2 = C111384c.f333466e;
            if (bVar2 != null) {
                long j = C109247e.vx0().f333461u;
                long[] jArr = bVar2.f334418h;
                C87412m.m108594g(jArr, "<this>");
                if (!(jArr.length == 0)) {
                    if (j > jArr[0]) {
                        bVar2.f334418h[0] = j;
                    }
                    long[] jArr2 = bVar2.f334418h;
                    C87412m.m108594g(jArr2, "<this>");
                    if (jArr2.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        long j2 = jArr2[jArr2.length - 1];
                        if (j != 0 && (j < j2 || j2 == 0)) {
                            bVar2.f334418h[1] = j;
                        }
                        long j3 = bVar2.f334420j + j;
                        bVar2.f334420j = j3;
                        bVar2.f334420j = j3 / ((long) 2);
                        if (Math.abs(bVar2.f334419i - j) > 50) {
                            if (bVar2.f334419i > j) {
                                Log.m105920e("MicroMsg.VoIPEncoderReport", "encode frameRate down ");
                            } else {
                                Log.m105920e("MicroMsg.VoIPEncoderReport", "encode frameRate up ");
                            }
                        }
                        bVar2.f334419i = j;
                        Log.m105924i("MicroMsg.VoIPEncoderReport", "encode frameRate refresh ,current is " + bVar2.f334419i + ' ');
                        return;
                    }
                    throw new NoSuchElementException("Array is empty.");
                }
                throw new NoSuchElementException("Array is empty.");
            }
        }
    }

    /* renamed from: w */
    public void mo150073w() {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onNetWorkChangeMobileNet");
        if (this.f317093h != null) {
            this.f317093h.mo152921a5();
        }
        C111730z zVar = C111730z.f334576a;
        long j = 0;
        if (C109247e.xx0().f317353v != 0) {
            j = Util.secondsToNow(C109247e.xx0().f317353v);
        }
        C111730z.f334578c = Long.valueOf(j);
    }

    /* renamed from: w0 */
    public void mo150000w0(boolean z) {
        Log.printInfoStack("MicroMsg.Voip.NewVoipMgr", "onShutDown", new Object[0]);
        C112605m mVar = this.f317090e;
        if (mVar == null) {
            Log.m105928w("MicroMsg.Voip.NewVoipMgr", "shutdown when startVoIP() didn't get called");
            return;
        }
        String string = C112604l.m153984g(mVar.f337213a) ? MMApplicationContext.getContext().getString(C0966R.string.f361513kf2, new Object[]{mo152442Q0(Util.secondsToNow(this.f317052B))}) : this.f317101r ? MMApplicationContext.getContext().getString(C0966R.string.key) : MMApplicationContext.getContext().getString(C0966R.string.kew);
        String str = "voip_content_video";
        if (this.f317101r || C112604l.m153984g(this.f317090e.f337213a)) {
            String username = this.f317100q.getUsername();
            if (this.f317102s) {
                int i = C72963f4.f212661I1;
            } else {
                int i2 = C72963f4.f212661I1;
                str = "voip_content_voice";
            }
            C106348g0.m143243d(username, str, this.f317101r ? 1 : 0, 6, string);
        } else if (!this.f317101r && z) {
            String username2 = this.f317100q.getUsername();
            if (this.f317102s) {
                int i3 = C72963f4.f212661I1;
            } else {
                int i4 = C72963f4.f212661I1;
                str = "voip_content_voice";
            }
            C106348g0.m143243d(username2, str, this.f317101r ? 1 : 0, 6, string);
        }
        this.f317089d.mo164354w();
        this.f317096n = C112604l.m153984g(this.f317090e.f337213a);
        if (mo152427G0()) {
            this.f317107x = 4106;
        } else {
            mo149992d1(4106);
            mo149986L0();
        }
        C109247e.xx0().mo152614m();
        if (!this.f317066Q) {
            C112597j.m153945j(C109247e.xx0().mo152615n(), C109247e.xx0().mo152616o(), this.f317101r ^ true ? 1 : 0, 4);
            this.f317066Q = true;
        }
    }

    /* renamed from: x */
    public void mo152496x() {
        if (!this.f317101r || !C112604l.m153982e(mo152441Q()) || !C109247e.xx0().mo152623v()) {
            int Q = mo152441Q();
            Map<Integer, String> map = C112604l.f337212a;
            if ((257 == Q || 256 == Q) && C109247e.xx0().mo152623v()) {
                this.f317089d.mo164334J(this.f317098p, this.f317102s, this.f317101r);
                return;
            }
            return;
        }
        this.f317089d.mo164334J(this.f317098p, this.f317102s, this.f317101r);
        if (this.f317101r) {
            this.f317089d.mo164344j();
        }
    }

    /* renamed from: x0 */
    public void mo150001x0() {
        Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onRoomReady");
        if (this.f317109y && C109247e.xx0().mo152615n() != 0) {
            this.f317109y = false;
            mo152462b1();
        }
        if (this.f317101r) {
            mo149992d1(4097);
        }
        C111730z.f334576a.mo163444a(Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), this.f317098p, Boolean.valueOf(this.f317101r));
        C111720c0 c0Var = C111720c0.f334432a;
        long o = C109247e.xx0().mo152616o();
        C111720c0.f334433b = (long) C109247e.xx0().mo152615n();
        C111720c0.f334434c = o;
        this.f317089d.mo164345l(Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()));
        this.f317111z = true;
        this.f317103t = C109247e.xx0().mo152615n();
        this.f317104u = C109247e.xx0().mo152616o();
        this.f317105v = C109247e.xx0().mo152617p();
        mo152428H0(1);
        C106357m.m143315m(C109247e.xx0().mo152624w());
    }

    /* renamed from: y */
    public void mo152497y() {
        C106510c cVar = this.f317059I;
        if (cVar != null) {
            cVar.mo152929k3(false);
            this.f317059I = null;
        }
        C109247e.xx0().mo152593G(false, false);
    }

    /* renamed from: y0 */
    public void mo150002y0(int i, String str, final int i2) {
        String str2;
        String str3;
        String str4;
        C112592e eVar = this.f317089d;
        if (eVar != null) {
            eVar.mo164354w();
        }
        if (i == 241 && Util.isNullOrNil(str)) {
            str = mo152444R0().getString(C0966R.string.ki5);
        }
        if (this.f317093h != null) {
            this.f317093h.mo152907F3(i, str);
        }
        C111730z zVar = C111730z.f334576a;
        C111730z.f334579d = C111730z.C111731a.ERROR;
        Log.m105925i("MicroMsg.Voip.NewVoipMgr", "onError, errCode: %s, roomId: %s", Integer.valueOf(i), Integer.valueOf(C109247e.xx0().mo152615n()));
        if (C112604l.m153984g(mo152441Q())) {
            str2 = MMApplicationContext.getContext().getString(C0966R.string.f361523ki1, new Object[]{mo152442Q0(Util.secondsToNow(this.f317052B))});
        } else {
            Context context = MMApplicationContext.getContext();
            Log.m105918d("MicroMsg.Voip.NewVoipMgr", "getErrorMsgContent, errorCode" + i);
            str2 = i == 235 ? context.getString(C0966R.string.kf8) : i == 233 ? context.getString(C0966R.string.kez) : i == 237 ? context.getString(C0966R.string.kf8) : i == 236 ? context.getString(C0966R.string.kez) : i == 211 ? context.getString(C0966R.string.kf7) : (i == 1200 || i == 1201) ? context.getString(C0966R.string.f361512kf1) : context.getString(C0966R.string.f361524ki2);
        }
        mo149992d1(4109);
        if (C109247e.xx0().mo152615n() != 0) {
            if (((HashMap) C109247e.xx0().f317340i).get(Integer.valueOf(C109247e.xx0().mo152615n())) == null) {
                String username = this.f317100q.getUsername();
                if (this.f317102s) {
                    int i3 = C72963f4.f212661I1;
                    str4 = "voip_content_video";
                } else {
                    int i4 = C72963f4.f212661I1;
                    str4 = "voip_content_voice";
                }
                boolean z = this.f317101r;
                if (C112604l.m153984g(this.f317090e.f337213a)) {
                    str2 = MMApplicationContext.getContext().getString(C0966R.string.f361514kf3, new Object[]{mo152442Q0(Util.secondsToNow(this.f317052B))});
                }
                C106348g0.m143244e(username, str4, z ? 1 : 0, 6, str2, true, new C32226l<Long, Void>() {
                    public Object invoke(Object obj) {
                        Map<Integer, Long> map = C109247e.xx0().f317340i;
                        HashMap hashMap = (HashMap) map;
                        hashMap.put(Integer.valueOf(C109247e.xx0().mo152615n()), (Long) obj);
                        int i = i2;
                        if (i == -1) {
                            return null;
                        }
                        NewVoipMgr.this.mo152456Y0(i);
                        return null;
                    }
                });
                C109247e.xx0().mo152614m();
                mo149986L0();
            }
        }
        if (C109247e.xx0().mo152615n() == 0) {
            String username2 = this.f317100q.getUsername();
            if (this.f317102s) {
                int i5 = C72963f4.f212661I1;
                str3 = "voip_content_video";
            } else {
                int i6 = C72963f4.f212661I1;
                str3 = "voip_content_voice";
            }
            boolean z2 = this.f317101r;
            if (C112604l.m153984g(this.f317090e.f337213a)) {
                str2 = MMApplicationContext.getContext().getString(C0966R.string.f361514kf3, new Object[]{mo152442Q0(Util.secondsToNow(this.f317052B))});
            }
            C106348g0.m143244e(username2, str3, z2 ? 1 : 0, 6, str2, true, (C32226l<Long, Void>) null);
        }
        C109247e.xx0().mo152614m();
        mo149986L0();
    }

    /* renamed from: z */
    public void mo150003z(Size size, int i) {
    }

    /* renamed from: z0 */
    public void mo152498z0(int i, int i2, int i3, byte[] bArr) {
        C108126x0 x0Var;
        C108117v vVar;
        if (this.f317092g != null) {
            if (this.f317093h != null && this.f317085Z0 && !C109247e.xx0().mo152622u()) {
                this.f317093h.mo152926h0(false);
                this.f317092g.getClass();
            }
            this.f317085Z0 = C109247e.xx0().mo152622u();
            if (this.f317093h != null) {
                this.f317093h.mo152928i5();
            }
            C108077f0 f0Var = this.f317092g;
            if (f0Var != null && (x0Var = f0Var.f323646f) != null && bArr != null && (vVar = x0Var.f323776c) != null) {
                vVar.mo158464d(new C108125x(vVar, i, i2, bArr));
            }
        }
    }
}
