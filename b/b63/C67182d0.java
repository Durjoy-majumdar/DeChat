package b63;

import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p281yz.C79173v;
import v53.C78342e0;
import x53.C78770a;

@Deprecated
/* renamed from: b63.d0 */
public class C67182d0 extends IStaticListener<WalletGetUserInfoEvent> implements C11385n {

    /* renamed from: d */
    public WalletGetUserInfoEvent f192870d;

    /* renamed from: e */
    public boolean f192871e = false;

    /* renamed from: f */
    public boolean f192872f = false;

    /* renamed from: g */
    public boolean f192873g = false;

    /* renamed from: h */
    public C117747y f192874h;

    /* renamed from: B */
    public final void mo91285B(int i, String str, C117747y yVar, boolean z) {
        C86709a0.m107524d().mo123470p(385, this);
        C86709a0.m107524d().mo123470p(1518, this);
        if (this.f192873g || !this.f192872f || !this.f192871e) {
            this.f192871e = true;
            mo91287q(i, str, yVar, true);
            return;
        }
        Log.m105924i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, useCache and event end");
    }

    public boolean callback(IEvent iEvent) {
        WalletGetUserInfoEvent walletGetUserInfoEvent = (WalletGetUserInfoEvent) iEvent;
        Class cls = C79173v.class;
        if (!(walletGetUserInfoEvent instanceof WalletGetUserInfoEvent)) {
            Log.m105922f("MicroMsg.WalletGetUserInfoEventListener", "mismatched event");
            return false;
        }
        this.f192871e = false;
        this.f192870d = walletGetUserInfoEvent;
        WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent.f194038d;
        this.f192872f = aVar.f194041b;
        boolean z = aVar.f194042c;
        this.f192873g = z;
        Log.m105925i("MicroMsg.WalletGetUserInfoEventListener", "mustNotifyAfterNetEnd: %s", Boolean.valueOf(z));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1518, this);
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91337s()) {
            Log.m105924i("MicroMsg.WalletGetUserInfoEventListener", "data is invalid. doScene");
            mo91286d(walletGetUserInfoEvent);
            return true;
        } else if (walletGetUserInfoEvent.f194038d.f194041b) {
            Log.m105924i("MicroMsg.WalletGetUserInfoEventListener", "use cache");
            C67205s0 Ex0 = ((C79173v) C86312j.m106911c(cls)).Ex0();
            Ex0.getClass();
            long nowSecond = Util.nowSecond();
            String str = "";
            Log.m105925i("MicroMsg.WalletUserInfoManger", "checkCacheTimeout, nowSecs: %s, cacheDeadTime: %s", Long.valueOf(nowSecond), Long.valueOf(Ex0.f192963p));
            long j = Ex0.f192963p;
            if (!(j <= 0 || nowSecond > j)) {
                if (!this.f192873g) {
                    this.f192871e = true;
                }
                Log.m105924i("MicroMsg.WalletGetUserInfoEventListener", "cache data is ok. doCallback");
                mo91287q(0, str, (C117747y) null, false);
                mo91286d(walletGetUserInfoEvent);
                return true;
            }
            Log.m105924i("MicroMsg.WalletGetUserInfoEventListener", "cache timeout, do NetSceneTenpayQueryBoundBankcard");
            mo91286d(walletGetUserInfoEvent);
            return true;
        } else {
            String str2 = "";
            C67205s0 Ex02 = ((C79173v) C86312j.m106911c(cls)).Ex0();
            long secondsToNow = Util.secondsToNow(Ex02.f192962o);
            Log.m105925i("MicroMsg.WalletUserInfoManger", "dead time : %d, nowSec: %d, pass time " + secondsToNow, Long.valueOf(Ex02.f192962o), Long.valueOf(System.currentTimeMillis() / 1000));
            if (secondsToNow > 0) {
                Log.m105924i("MicroMsg.WalletGetUserInfoEventListener", "data is checkTimeOut, do NetSceneTenpayQueryBoundBankcard");
                mo91286d(walletGetUserInfoEvent);
                return true;
            }
            this.f192871e = true;
            Log.m105924i("MicroMsg.WalletGetUserInfoEventListener", "data is ok. doCallback");
            mo91287q(0, str2, (C117747y) null, false);
            return true;
        }
    }

    /* renamed from: d */
    public final void mo91286d(WalletGetUserInfoEvent walletGetUserInfoEvent) {
        if (C75592q0.m90763K()) {
            this.f192874h = new C78770a();
            C86709a0.m107524d().mo123460f(this.f192874h);
            return;
        }
        int i = walletGetUserInfoEvent.f194038d.f194040a;
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21 || i == 22 || i == 23)) {
            z = false;
        }
        if (!z) {
            i = 0;
        }
        this.f192874h = new C78342e0((String) null, i);
        C86709a0.m107524d().mo123460f(this.f192874h);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        WalletGetUserInfoEvent walletGetUserInfoEvent = this.f192870d;
        if (walletGetUserInfoEvent != null && walletGetUserInfoEvent.f194038d != null) {
            Log.m105925i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, errType: %s, errCode: %s, scene: %s, retry: %s", Integer.valueOf(i), Integer.valueOf(i2), yVar, Integer.valueOf(this.f192870d.f194038d.f194043d));
            if (yVar == this.f192874h) {
                if (!(yVar instanceof C78342e0) && !(yVar instanceof C78770a)) {
                    return;
                }
                if (i == 0 && i2 == 0) {
                    mo91285B(i2, str, yVar, true);
                    return;
                }
                WalletGetUserInfoEvent walletGetUserInfoEvent2 = this.f192870d;
                WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent2.f194038d;
                int i3 = aVar.f194043d;
                if (i3 == 0) {
                    mo91285B(i2, str, yVar, true);
                    return;
                }
                aVar.f194043d = i3 - 1;
                mo91286d(walletGetUserInfoEvent2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        if (r6 < r5.size()) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        r1 = r12.f192952e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0272  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91287q(int r11, java.lang.String r12, ob0.C117747y r13, boolean r14) {
        /*
            r10 = this;
            java.lang.Class<yz.v> r0 = p281yz.C79173v.class
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r1 = r10.f192870d
            r2 = 0
            if (r1 == 0) goto L_0x0275
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r1 = r1.f194039e
            r1.f194062h = r11
            r1.f194063i = r12
            r1.f194052I = r13
            di3.d r11 = di3.C86312j.m106911c(r0)
            yz.v r11 = (p281yz.C79173v) r11
            b63.s0 r11 = r11.Ex0()
            boolean r11 = r11.mo91341w()
            r1.f194056b = r11
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.q0 r1 = r12.f192956i
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0039
            boolean r1 = r1.mo91302b()
            if (r1 != 0) goto L_0x0043
        L_0x0039:
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r1 = r12.f192952e
            if (r1 == 0) goto L_0x0045
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0045
        L_0x0043:
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            goto L_0x0053
        L_0x0049:
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r12 = r12.f192951d
            if (r12 == 0) goto L_0x0055
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0055
        L_0x0053:
            r12 = 0
            goto L_0x0056
        L_0x0055:
            r12 = 1
        L_0x0056:
            r11.f194057c = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            r12.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12.mo91327i(r1, r5)
            int r12 = r5.size()
            if (r12 != 0) goto L_0x007d
            goto L_0x00d9
        L_0x007d:
            f40.C86709a0.m107528h()
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            r1 = 196659(0x30033, float:2.75578E-40)
            java.lang.Object r12 = r12.mo119684e(r1, r2)
            java.lang.String r12 = (java.lang.String) r12
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L_0x0098
            goto L_0x00db
        L_0x0098:
            java.lang.String r1 = "&"
            java.lang.String[] r12 = r12.split(r1)
            if (r12 == 0) goto L_0x00db
            int r1 = r12.length
            if (r1 != 0) goto L_0x00a4
            goto L_0x00db
        L_0x00a4:
            r1 = 0
            r6 = 0
        L_0x00a6:
            int r7 = r12.length
            if (r1 >= r7) goto L_0x00d2
            r7 = r12[r1]
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x00b2
            goto L_0x00cf
        L_0x00b2:
            r8 = 0
        L_0x00b3:
            int r9 = r5.size()
            if (r8 >= r9) goto L_0x00cf
            java.lang.Object r9 = r5.get(r8)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r9 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r9
            if (r9 == 0) goto L_0x00cc
            java.lang.String r9 = r9.field_bankcardType
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x00cc
            int r6 = r6 + 1
            goto L_0x00cf
        L_0x00cc:
            int r8 = r8 + 1
            goto L_0x00b3
        L_0x00cf:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00d2:
            int r12 = r5.size()
            if (r6 >= r12) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r12 = 0
            goto L_0x00dc
        L_0x00db:
            r12 = 1
        L_0x00dc:
            r11.f194058d = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.q0 r12 = r12.mo91334p()
            boolean r12 = r12.mo91302b()
            r11.f194059e = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.r0 r12 = r12.f192953f
            if (r12 == 0) goto L_0x010b
            java.lang.String r12 = r12.field_ftf_pay_url
            goto L_0x010c
        L_0x010b:
            r12 = r2
        L_0x010c:
            r11.f194060f = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            java.lang.String r12 = r12.mo91335q()
            r11.f194061g = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            boolean r12 = r12.mo91342x()
            r11.f194064j = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.q0 r12 = r12.mo91334p()
            boolean r12 = r12.mo91305e()
            r11.f194065k = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            java.lang.String r12 = ""
            r11.f194066l = r12
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.r0 r12 = r12.f192953f
            if (r12 == 0) goto L_0x016a
            int r12 = r12.field_paymenu_use_new
            if (r12 != r3) goto L_0x016a
            r12 = 1
            goto L_0x016b
        L_0x016a:
            r12 = 0
        L_0x016b:
            r11.f194045B = r12
            if (r13 == 0) goto L_0x01c5
            boolean r11 = r13 instanceof v53.C78342e0
            if (r11 == 0) goto L_0x01c5
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            v53.e0 r13 = (v53.C78342e0) r13
            java.lang.String r12 = r13.f229557d
            r11.f194066l = r12
            java.lang.String r12 = r13.f229558e
            r11.f194067m = r12
            java.lang.String r12 = r13.f229559f
            r11.f194068n = r12
            java.lang.String r12 = r13.f229560g
            r11.f194069o = r12
            java.lang.String r12 = r13.f229561h
            r11.f194070p = r12
            int r12 = r13.f229572v
            r11.f194071q = r12
            java.lang.String r12 = r13.f229562i
            r11.f194072r = r12
            int r12 = r13.f229563j
            r11.f194073s = r12
            java.lang.String r12 = r13.f229564n
            r11.f194074t = r12
            java.lang.String r12 = r13.f229565o
            r11.f194075u = r12
            java.lang.String r12 = r13.f229566p
            r11.f194076v = r12
            java.lang.String r12 = r13.f229567q
            r11.f194077w = r12
            java.lang.String r12 = r13.f229568r
            r11.f194078x = r12
            java.lang.String r12 = r13.f229569s
            r11.f194079y = r12
            java.util.LinkedList<java.lang.String> r12 = r13.f229570t
            r11.f194080z = r12
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r12 = r13.f229571u
            r11.f194044A = r12
            b63.h r12 = r13.f229575y
            r11.f194050G = r12
            java.util.ArrayList<b63.u> r12 = r13.f229554B
            r11.f194053J = r12
            java.lang.String r12 = r13.f229555C
            r11.f194054K = r12
        L_0x01c5:
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            boolean r12 = r12.mo91339u()
            r11.f194046C = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.r0 r12 = r12.f192953f
            if (r12 == 0) goto L_0x01ee
            int r12 = r12.field_is_show_lqb
            goto L_0x01ef
        L_0x01ee:
            r12 = 0
        L_0x01ef:
            r11.f194047D = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.r0 r12 = r12.f192953f
            if (r12 == 0) goto L_0x0208
            int r12 = r12.field_is_open_lqb
            if (r12 != r3) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r3 = 0
        L_0x0209:
            r11.f194048E = r3
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            di3.d r12 = di3.C86312j.m106911c(r0)
            yz.v r12 = (p281yz.C79173v) r12
            b63.s0 r12 = r12.Ex0()
            b63.r0 r12 = r12.f192953f
            if (r12 == 0) goto L_0x0220
            java.lang.String r12 = r12.field_lqb_open_url
            goto L_0x0221
        L_0x0220:
            r12 = r2
        L_0x0221:
            r11.f194049F = r12
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            r11.f194051H = r14
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "mUserInfo needBind : "
            r11.append(r12)
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r12 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r12 = r12.f194039e
            boolean r12 = r12.f194057c
            r11.append(r12)
            java.lang.String r12 = " hasNewTips : "
            r11.append(r12)
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r12 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r12 = r12.f194039e
            boolean r12 = r12.f194058d
            r11.append(r12)
            java.lang.String r12 = " swipeOn : "
            r11.append(r12)
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r12 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r12 = r12.f194039e
            boolean r12 = r12.f194059e
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.WalletGetUserInfoEventListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r11)
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            java.lang.Runnable r11 = r11.callback
            if (r11 == 0) goto L_0x026a
            r11.run()
        L_0x026a:
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent r11 = r10.f192870d
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent$b r11 = r11.f194039e
            java.lang.Runnable r11 = r11.f194055a
            if (r11 == 0) goto L_0x0275
            r11.run()
        L_0x0275:
            boolean r11 = r10.f192871e
            if (r11 == 0) goto L_0x027b
            r10.f192870d = r2
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b63.C67182d0.mo91287q(int, java.lang.String, ob0.y, boolean):void");
    }
}
