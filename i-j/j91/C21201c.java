package j91;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ba1.C16777c;
import ca1.C113264b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20453e;
import da1.C116606c;
import da1.C20455a;
import e91.C116711b;
import e91.C20552a;
import f91.C116850b;
import fa1.C20696a;
import g91.C20813c;
import g91.C20815e;
import ga1.C20823c;
import h81.C20928j;
import i20.C21043a;
import i91.C21060a;
import i91.C21061b;
import i91.C21062c;
import i91.C21065f;
import i91.C21066g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k91.C117393b;
import k91.C117394e;
import k91.C21316c;
import k91.C21317d;
import l91.C117467h;
import m91.C21487b;
import op3.C117877b;
import op3.C117878c;
import op3.C117882j;
import t91.C22466j;
import t91.C64208c;
import te3.C118419a63;
import te3.C118467t1;
import te3.C118471u1;
import te3.C118482z53;
import te3.C22505ka3;
import te3.C22524q1;
import te3.fh4;
import te3.mf4;
import te3.ta4;
import w91.C22880b;
import x91.C118865a;
import x91.C23072e;
import z91.C23462b;

/* renamed from: j91.c */
public final class C21201c {

    /* renamed from: a */
    public C20928j.C20929a f59973a;

    /* renamed from: j91.c$a */
    public class C21202a implements C20815e {
        public C21202a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:126:0x03bd  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x03f1  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x03ff  */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x07ee  */
        /* JADX WARNING: Removed duplicated region for block: B:281:0x083f  */
        /* JADX WARNING: Removed duplicated region for block: B:347:0x0a1a  */
        /* JADX WARNING: Removed duplicated region for block: B:512:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33181a(g91.C20811a r28) {
            /*
                r27 = this;
                r1 = r27
                r0 = r28
                if (r0 != 0) goto L_0x0007
                return
            L_0x0007:
                int r2 = r0.f58811a
                r3 = 301(0x12d, float:4.22E-43)
                r4 = 300(0x12c, float:4.2E-43)
                java.lang.String r5 = "HABBYGE-MALI.AsyncActivityMonitor"
                r7 = 1
                r8 = 0
                if (r2 == r4) goto L_0x0bc2
                if (r2 == r3) goto L_0x0bc2
                r3 = 600(0x258, float:8.41E-43)
                r4 = 3
                r10 = 4
                r11 = 8
                r13 = 2
                if (r2 == r3) goto L_0x095e
                r3 = 800(0x320, float:1.121E-42)
                if (r2 == r3) goto L_0x0955
                r3 = 801(0x321, float:1.122E-42)
                if (r2 == r3) goto L_0x079f
                switch(r2) {
                    case 1: goto L_0x006a;
                    case 2: goto L_0x006a;
                    case 3: goto L_0x006a;
                    case 4: goto L_0x006a;
                    case 5: goto L_0x0056;
                    case 6: goto L_0x0047;
                    default: goto L_0x0029;
                }
            L_0x0029:
                switch(r2) {
                    case 100: goto L_0x00cc;
                    case 101: goto L_0x00b4;
                    case 102: goto L_0x0096;
                    default: goto L_0x002c;
                }
            L_0x002c:
                r3 = 6
                java.lang.String r14 = ""
                java.lang.String r15 = "_beignFloatSession, 不是合法session ~~~"
                java.lang.String r12 = "_beignFloatSession, isNewSession: %s, %b"
                java.lang.String r4 = "_beignFloatSession, curSession: %s"
                java.lang.String r9 = "HABBYGE-MALI.VoipFloatSession"
                java.lang.String r6 = "HABBYGE-MALI.FloatBallSessionHandler"
                switch(r2) {
                    case 200: goto L_0x0549;
                    case 201: goto L_0x052b;
                    case 202: goto L_0x0513;
                    case 203: goto L_0x04e4;
                    case 204: goto L_0x04cc;
                    case 205: goto L_0x049d;
                    case 206: goto L_0x0485;
                    case 207: goto L_0x046d;
                    case 208: goto L_0x0348;
                    case 209: goto L_0x033a;
                    case 210: goto L_0x0329;
                    case 211: goto L_0x02b7;
                    case 212: goto L_0x027f;
                    case 213: goto L_0x026c;
                    case 214: goto L_0x0259;
                    case 215: goto L_0x0243;
                    case 216: goto L_0x0230;
                    case 217: goto L_0x0215;
                    case 218: goto L_0x01fa;
                    case 219: goto L_0x015c;
                    case 220: goto L_0x0129;
                    case 221: goto L_0x0104;
                    case 222: goto L_0x00f0;
                    default: goto L_0x003c;
                }
            L_0x003c:
                switch(r2) {
                    case 400: goto L_0x0567;
                    case 401: goto L_0x0567;
                    case 402: goto L_0x0567;
                    case 403: goto L_0x0567;
                    default: goto L_0x003f;
                }
            L_0x003f:
                switch(r2) {
                    case 500: goto L_0x05f9;
                    case 501: goto L_0x05ee;
                    case 502: goto L_0x05dd;
                    case 503: goto L_0x05af;
                    case 504: goto L_0x05a4;
                    default: goto L_0x0042;
                }
            L_0x0042:
                switch(r2) {
                    case 700: goto L_0x0754;
                    case 701: goto L_0x066f;
                    case 702: goto L_0x064a;
                    case 703: goto L_0x063d;
                    case 704: goto L_0x0630;
                    case 705: goto L_0x0623;
                    case 706: goto L_0x0616;
                    case 707: goto L_0x0608;
                    case 708: goto L_0x0630;
                    case 709: goto L_0x0623;
                    case 710: goto L_0x0616;
                    case 711: goto L_0x0608;
                    case 712: goto L_0x0630;
                    case 713: goto L_0x0623;
                    case 714: goto L_0x0616;
                    case 715: goto L_0x0608;
                    case 716: goto L_0x0630;
                    case 717: goto L_0x0623;
                    case 718: goto L_0x0616;
                    case 719: goto L_0x0608;
                    case 720: goto L_0x0630;
                    case 721: goto L_0x0623;
                    case 722: goto L_0x0616;
                    case 723: goto L_0x0608;
                    case 724: goto L_0x0630;
                    case 725: goto L_0x0623;
                    case 726: goto L_0x0616;
                    case 727: goto L_0x0608;
                    case 728: goto L_0x0630;
                    case 729: goto L_0x0623;
                    case 730: goto L_0x0616;
                    case 731: goto L_0x0608;
                    case 732: goto L_0x0630;
                    case 733: goto L_0x0623;
                    case 734: goto L_0x0616;
                    case 735: goto L_0x0608;
                    case 736: goto L_0x0630;
                    case 737: goto L_0x0623;
                    case 738: goto L_0x0616;
                    case 739: goto L_0x0608;
                    case 740: goto L_0x0630;
                    case 741: goto L_0x0623;
                    case 742: goto L_0x0616;
                    case 743: goto L_0x0608;
                    case 744: goto L_0x0630;
                    case 745: goto L_0x0623;
                    case 746: goto L_0x0616;
                    case 747: goto L_0x0608;
                    default: goto L_0x0045;
                }
            L_0x0045:
                goto L_0x0bec
            L_0x0047:
                java.lang.Object r0 = r0.f58812b
                te3.oq1 r0 = (te3.C118454oq1) r0
                if (r0 == 0) goto L_0x0bec
                e91.a r2 = e91.C20552a.m22323a()
                r2.mo32133b(r0)
                goto L_0x0bec
            L_0x0056:
                java.lang.String r2 = "HellMsgType.MSGQ_TYPE_FRAGMENT_RESUME recv !!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                java.lang.Object r0 = r0.f58812b
                te3.pq1 r0 = (te3.C118457pq1) r0
                if (r0 == 0) goto L_0x0bec
                e91.a r2 = e91.C20552a.m22323a()
                r2.mo32134c(r0)
                goto L_0x0bec
            L_0x006a:
                java.lang.Object[] r3 = new java.lang.Object[r7]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r8] = r2
                java.lang.String r2 = "MSGQ_TYPE_FRAGMENT_%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r3)
                e91.a r2 = e91.C20552a.m22323a()
                int r3 = r0.f58811a
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r4 = r0.longValue()
                e91.e r0 = r2.f57844b
                l91.g r0 = (l91.C21406g) r0
                l91.f r0 = r0.f60560a
                l91.e r0 = r0.f60559a
                l91.b r0 = r0.f60552c
                if (r0 == 0) goto L_0x0bec
                r0.mo33526c(r3, r4)
                goto L_0x0bec
            L_0x0096:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.n03 r0 = (te3.C118445n03) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                te3.fh4 r3 = r0.f354143d
                java.lang.String r3 = r3.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_moveTaskToBack: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                te3.fh4 r3 = r0.f354143d
                boolean r0 = r0.f354144e
                j91.C21201c.m23668f(r2, r3, r0)
                goto L_0x0bec
            L_0x00b4:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.fh4 r0 = (te3.fh4) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r3 = r0.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_finish: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                j91.C21201c.m23667e(r2, r0)
                goto L_0x0bec
            L_0x00cc:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.ta4 r0 = (te3.ta4) r0
                java.lang.Object[] r2 = new java.lang.Object[r4]
                te3.fh4 r3 = r0.f64613d
                java.lang.String r3 = r3.f354001d
                r2[r8] = r3
                te3.fh4 r3 = r0.f64614e
                java.lang.String r3 = r3.f354001d
                r2[r7] = r3
                java.lang.String r3 = r0.f64616g
                r2[r13] = r3
                java.lang.String r3 = "MSGQ_TYPE_startActivity: %s, %s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                j91.C21201c.m23666d(r2, r0)
                goto L_0x0bec
            L_0x00f0:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r8] = r0
                java.lang.String r3 = "MSGQ_TYPE_UPDATE_SID: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C18746c.m19503a(r0)
                goto L_0x0bec
            L_0x0104:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.String r2 = "goBack"
                java.lang.String r3 = "()V"
                android.util.Pair r2 = android.util.Pair.create(r2, r3)
                r0.add(r2)
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.lang.String r3 = "com/tencent/mm/plugin/scanner/ui/BaseScanUI"
                r2.put(r3, r0)
                i20.a r0 = i20.C21043a.m23197h()
                j20.d r3 = fa1.C20696a.f58510a
                r0.mo32762p(r2, r3)
                goto L_0x0bec
            L_0x0129:
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r2 = r0.longValue()
                te3.ka3 r0 = ba1.C16777c.m16413e()
                java.lang.String r4 = "HABBYGE-MALI.ScanSessionHandler"
                if (r0 != 0) goto L_0x0140
                java.lang.String r0 = "baseScanUIGoBack, session End !!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x0bec
            L_0x0140:
                java.lang.Object[] r5 = new java.lang.Object[r7]
                java.lang.String r6 = r0.f64087d
                r5[r8] = r6
                java.lang.String r6 = "ScanSessionHandler, baseScanUIGoBack: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
                java.lang.String r4 = r0.f64087d
                boolean r4 = fa1.C20696a.m22649a(r4)
                if (r4 == 0) goto L_0x0bec
                z91.b r4 = z91.C23462b.m28021f()
                r4.mo36930q(r0, r2)
                goto L_0x0bec
            L_0x015c:
                z91.b r2 = z91.C23462b.m28021f()
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r5 = r0.longValue()
                ga1.c r0 = r2.f67290b
                r0.getClass()
                java.lang.String r2 = "VoipMonitorCallback: _voipFloat2VideoActivity"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                te3.ka3 r2 = ba1.C16777c.m16413e()
                if (r2 == 0) goto L_0x0187
                java.lang.String r3 = r2.f64087d
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x0187
                z91.b r3 = z91.C23462b.m28021f()
                r3.mo36930q(r2, r5)
            L_0x0187:
                java.lang.String r2 = "_beignVoipSession"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                te3.ka3 r2 = ba1.C16777c.m16413e()
                if (r2 != 0) goto L_0x01ad
                z91.b r16 = z91.C23462b.m28021f()
                r17 = 0
                r20 = 0
                java.lang.String r18 = "LauncherUI"
                java.lang.String r19 = "VideoActivity"
                r21 = r5
                te3.ka3 r2 = r16.mo36927l(r17, r18, r19, r20, r21)
                if (r2 != 0) goto L_0x01ab
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r15)
                goto L_0x0bec
            L_0x01ab:
                r3 = 1
                goto L_0x01b7
            L_0x01ad:
                java.lang.Object[] r3 = new java.lang.Object[r7]
                java.lang.String r10 = r2.f64087d
                r3[r8] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r3)
                r3 = 0
            L_0x01b7:
                java.lang.Object[] r4 = new java.lang.Object[r13]
                java.lang.String r10 = r2.f64087d
                r4[r8] = r10
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
                r4[r7] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r4)
                java.lang.String r4 = r0.f58829d
                if (r4 == 0) goto L_0x01d5
                java.lang.String r7 = "com.tencent.mm.plugin.voip.ui.VideoActivity"
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L_0x01d5
                int r0 = r0.f58830e
                goto L_0x01d6
            L_0x01d5:
                r0 = 0
            L_0x01d6:
                java.lang.String r4 = "VideoActivity"
                ca1.C113264b.m155056b(r2, r4, r0, r5)
                if (r3 == 0) goto L_0x01f5
                r2.f64099s = r8
                java.lang.String r0 = ba1.C16780k.m16423b()
                if (r0 != 0) goto L_0x01e6
                goto L_0x01e7
            L_0x01e6:
                r14 = r0
            L_0x01e7:
                r2.f64102v = r14
                ba1.C16777c.m16409a(r2)
                z91.b r0 = z91.C23462b.m28021f()
                r0.mo36932s(r2)
                goto L_0x0bec
            L_0x01f5:
                ba1.C16777c.m16418j(r2)
                goto L_0x0bec
            L_0x01fa:
                z91.b r2 = z91.C23462b.m28021f()
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r3 = r0.longValue()
                ga1.c r0 = r2.f67290b
                r0.getClass()
                java.lang.String r2 = "VoipMonitorCallback: _closeVideoActivity"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                r0.mo32511a(r3)
                goto L_0x0bec
            L_0x0215:
                z91.b r2 = z91.C23462b.m28021f()
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r3 = r0.longValue()
                ga1.c r0 = r2.f67290b
                r0.getClass()
                java.lang.String r2 = "VoipMonitorCallback: _videoActivity2VoipFloat"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                r0.mo32511a(r3)
                goto L_0x0bec
            L_0x0230:
                z91.b r0 = z91.C23462b.m28021f()
                ga1.a r0 = r0.f67289a
                r0.getClass()
                java.lang.String r0 = "FloatBall: onFloatMenuItemRemoved"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                ga1.C20822b.m22821e(r3, r3)
                goto L_0x0bec
            L_0x0243:
                z91.b r0 = z91.C23462b.m28021f()
                ga1.a r0 = r0.f67289a
                r0.getClass()
                java.lang.String r0 = "FloatBall: onFloatMenuItemClicked"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                ga1.C20822b.m22821e(r13, r13)
                ga1.C20822b.m22820d(r7)
                goto L_0x0bec
            L_0x0259:
                z91.b r0 = z91.C23462b.m28021f()
                ga1.a r0 = r0.f67289a
                r0.getClass()
                java.lang.String r0 = "FloatBall: onFloatMenuBackPressed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                ga1.C20822b.m22821e(r8, r8)
                goto L_0x0bec
            L_0x026c:
                z91.b r0 = z91.C23462b.m28021f()
                ga1.a r0 = r0.f67289a
                r0.getClass()
                java.lang.String r0 = "FloatBall: onFloatMenuBackgroundClicked"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                ga1.C20822b.m22821e(r7, r7)
                goto L_0x0bec
            L_0x027f:
                z91.b r2 = z91.C23462b.m28021f()
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r8 = r0.longValue()
                ga1.a r0 = r2.f67289a
                r0.getClass()
                android.util.Pair r0 = ga1.C20822b.m22819c()
                if (r0 != 0) goto L_0x0298
                goto L_0x0bec
            L_0x0298:
                java.lang.Object r0 = r0.second
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 != r3) goto L_0x02ae
                z91.b r4 = z91.C23462b.m28021f()
                r5 = 0
                r6 = 0
                r7 = 0
                r4.mo36929p(r5, r6, r7, r8)
                goto L_0x0bec
            L_0x02ae:
                z91.b r0 = z91.C23462b.m28021f()
                r0.mo36928o(r10)
                goto L_0x0bec
            L_0x02b7:
                z91.b r2 = z91.C23462b.m28021f()
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r18 = r0.longValue()
                ga1.a r0 = r2.f67289a
                r0.getClass()
                android.util.Pair r0 = ga1.C20822b.m22819c()
                if (r0 != 0) goto L_0x02d0
                goto L_0x0bec
            L_0x02d0:
                java.lang.Object r0 = r0.second
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 == r7) goto L_0x02df
                if (r0 != 0) goto L_0x02dd
                goto L_0x02df
            L_0x02dd:
                r2 = 0
                goto L_0x02e0
            L_0x02df:
                r2 = 1
            L_0x02e0:
                java.lang.Object[] r3 = new java.lang.Object[r13]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r8] = r0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                r3[r7] = r0
                java.lang.String r0 = "onFloatMenuHide, FloatSession, End: %d, %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r3)
                if (r2 == 0) goto L_0x0301
                z91.b r14 = z91.C23462b.m28021f()
                r15 = 0
                r16 = 0
                r17 = 0
                r14.mo36929p(r15, r16, r17, r18)
            L_0x0301:
                te3.qp1 r0 = ga1.C20822b.m22817a()
                if (r0 != 0) goto L_0x030c
                te3.qp1 r0 = new te3.qp1
                r0.<init>()
            L_0x030c:
                r0.f64514i = r11
                ga1.C20822b.m22818b(r0)
                java.lang.Object[] r0 = new java.lang.Object[r7]
                te3.qp1 r2 = ga1.C20822b.m22817a()
                if (r2 != 0) goto L_0x031a
                goto L_0x031c
            L_0x031a:
                int r11 = r2.f64514i
            L_0x031c:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r0[r8] = r2
                java.lang.String r2 = "FloatBall, stat, hide: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                goto L_0x0bec
            L_0x0329:
                java.lang.Object r0 = r0.f58812b
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                z91.b r2 = z91.C23462b.m28021f()
                r2.mo36928o(r0)
                goto L_0x0bec
            L_0x033a:
                z91.b r3 = z91.C23462b.m28021f()
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r3.mo36929p(r4, r5, r6, r7)
                goto L_0x0bec
            L_0x0348:
                z91.b r2 = z91.C23462b.m28021f()
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r9 = r0.longValue()
                ga1.a r0 = r2.f67289a
                r0.getClass()
                te3.qp1 r0 = ga1.C20822b.m22817a()
                if (r0 == 0) goto L_0x036a
                r2 = -1
                r0.f64511f = r2
                r0.f64512g = r2
                r2 = 7
                r0.f64514i = r2
                ga1.C20822b.m22818b(r0)
            L_0x036a:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                te3.qp1 r2 = ga1.C20822b.m22817a()
                if (r2 != 0) goto L_0x0373
                goto L_0x0375
            L_0x0373:
                int r11 = r2.f64514i
            L_0x0375:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r0[r8] = r2
                java.lang.String r2 = "FloatBall, stat, show: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                te3.ka3 r0 = ba1.C16777c.m16413e()
                if (r0 == 0) goto L_0x0398
                java.lang.String r2 = r0.f64087d
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L_0x038f
                goto L_0x0398
            L_0x038f:
                z91.b r2 = z91.C23462b.m28021f()
                r2.mo36930q(r0, r9)
                goto L_0x040a
            L_0x0398:
                te3.gg2 r0 = ba1.C16777c.m16416h()
                if (r0 != 0) goto L_0x03a0
            L_0x039e:
                r0 = 0
                goto L_0x03bb
            L_0x03a0:
                int r2 = r0.f354031i
                if (r2 < 0) goto L_0x03ae
                java.util.LinkedList<te3.fa3> r3 = r0.f354030h
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x03ae
                r2 = 1
                goto L_0x03af
            L_0x03ae:
                r2 = 0
            L_0x03af:
                if (r2 == 0) goto L_0x039e
                java.util.LinkedList<te3.fa3> r2 = r0.f354030h
                int r0 = r0.f354031i
                java.lang.Object r0 = r2.get(r0)
                te3.fa3 r0 = (te3.C118430fa3) r0
            L_0x03bb:
                if (r0 != 0) goto L_0x03f1
                r0 = 105(0x69, float:1.47E-43)
                op3.c r0 = k91.C117394e.m165537c(r0)
                if (r0 != 0) goto L_0x03c7
                r0 = 0
                goto L_0x03fd
            L_0x03c7:
                java.lang.Object r2 = r0.mo182596a(r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x03e2
                java.lang.Object r0 = r0.mo182596a(r13)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
                android.util.Pair r0 = android.util.Pair.create(r0, r2)
                goto L_0x03fd
            L_0x03e2:
                java.lang.Object r0 = r0.mo182596a(r8)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
                android.util.Pair r0 = android.util.Pair.create(r0, r2)
                goto L_0x03fd
            L_0x03f1:
                java.lang.String r2 = r0.f353996j
                int r0 = r0.f353997n
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                android.util.Pair r0 = android.util.Pair.create(r2, r0)
            L_0x03fd:
                if (r0 == 0) goto L_0x040a
                z91.b r2 = z91.C23462b.m28021f()
                java.lang.Object r0 = r0.first
                java.lang.String r0 = (java.lang.String) r0
                r2.mo36933t(r0, r9)
            L_0x040a:
                java.lang.String r0 = "_beignFloatSession"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
                te3.ka3 r0 = ba1.C16777c.m16413e()
                if (r0 != 0) goto L_0x0430
                z91.b r20 = z91.C23462b.m28021f()
                r21 = 0
                r24 = 0
                java.lang.String r22 = "LauncherUI"
                java.lang.String r23 = "FloatingBall"
                r25 = r9
                te3.ka3 r0 = r20.mo36927l(r21, r22, r23, r24, r25)
                if (r0 != 0) goto L_0x042e
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r15)
                goto L_0x0bec
            L_0x042e:
                r2 = 1
                goto L_0x043a
            L_0x0430:
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r3 = r0.f64087d
                r2[r8] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r4, r2)
                r2 = 0
            L_0x043a:
                java.lang.Object[] r3 = new java.lang.Object[r13]
                java.lang.String r4 = r0.f64087d
                r3[r8] = r4
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                r3[r7] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r12, r3)
                java.lang.String r3 = "FloatBall"
                ca1.C113264b.m155056b(r0, r3, r8, r9)
                if (r2 == 0) goto L_0x0468
                r0.f64099s = r8
                java.lang.String r2 = ba1.C16780k.m16423b()
                if (r2 != 0) goto L_0x0459
                goto L_0x045a
            L_0x0459:
                r14 = r2
            L_0x045a:
                r0.f64102v = r14
                ba1.C16777c.m16409a(r0)
                z91.b r2 = z91.C23462b.m28021f()
                r2.mo36932s(r0)
                goto L_0x0bec
            L_0x0468:
                ba1.C16777c.m16418j(r0)
                goto L_0x0bec
            L_0x046d:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.fh4 r0 = (te3.fh4) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r3 = r0.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onDestroy: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                j91.C21201c.m23674l(r2, r0)
                goto L_0x0bec
            L_0x0485:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.fh4 r0 = (te3.fh4) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r3 = r0.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onStop: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                j91.C21201c.m23673k(r2, r0)
                goto L_0x0bec
            L_0x049d:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.a63 r0 = (te3.C118419a63) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                te3.fh4 r3 = r0.f353901d
                java.lang.String r3 = r3.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onPaused: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                h81.j$a r2 = r2.f59973a
                if (r2 == 0) goto L_0x0bec
                te3.fh4 r3 = r0.f353901d
                java.lang.String r5 = r3.f354001d
                int r6 = r3.f354002e
                long r7 = r3.f354003f
                boolean r9 = r0.f353902e
                boolean r10 = r0.f353903f
                java.lang.String r11 = r0.f353904g
                r4 = r2
                d91.e$a r4 = (d91.C20453e.C20454a) r4
                r4.mo32004a(r5, r6, r7, r9, r10, r11)
                goto L_0x0bec
            L_0x04cc:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.fh4 r0 = (te3.fh4) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r3 = r0.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onPause: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                j91.C21201c.m23672j(r2, r0)
                goto L_0x0bec
            L_0x04e4:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.a63 r0 = (te3.C118419a63) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                te3.fh4 r3 = r0.f353901d
                java.lang.String r3 = r3.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onPostResume: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                h81.j$a r2 = r2.f59973a
                if (r2 == 0) goto L_0x0bec
                te3.fh4 r3 = r0.f353901d
                java.lang.String r5 = r3.f354001d
                int r6 = r3.f354002e
                long r7 = r3.f354003f
                boolean r9 = r0.f353902e
                boolean r10 = r0.f353903f
                java.lang.String r11 = r0.f353904g
                r4 = r2
                d91.e$a r4 = (d91.C20453e.C20454a) r4
                r4.mo32005b(r5, r6, r7, r9, r10, r11)
                goto L_0x0bec
            L_0x0513:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.fh4 r0 = (te3.fh4) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r3 = r0.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onResume: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                j91.C21201c.m23671i(r2, r0)
                goto L_0x0bec
            L_0x052b:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.z53 r0 = (te3.C118482z53) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                te3.fh4 r3 = r0.f354614d
                java.lang.String r3 = r3.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onNewIntent: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                int r3 = r0.f354615e
                te3.fh4 r0 = r0.f354614d
                j91.C21201c.m23670h(r2, r3, r0)
                goto L_0x0bec
            L_0x0549:
                java.lang.Object r0 = r0.f58812b
                if (r0 == 0) goto L_0x0bec
                te3.z53 r0 = (te3.C118482z53) r0
                java.lang.Object[] r2 = new java.lang.Object[r7]
                te3.fh4 r3 = r0.f354614d
                java.lang.String r3 = r3.f354001d
                r2[r8] = r3
                java.lang.String r3 = "MSGQ_TYPE_ACTIVITY_onCreate: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                j91.c r2 = j91.C21201c.this
                te3.fh4 r3 = r0.f354614d
                int r0 = r0.f354615e
                j91.C21201c.m23669g(r2, r3, r0)
                goto L_0x0bec
            L_0x0567:
                java.lang.Object r2 = r0.f58812b     // Catch:{ Exception -> 0x0595 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0595 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0595 }
                int r0 = r0.f58811a
                r3 = 401(0x191, float:5.62E-43)
                if (r0 != r3) goto L_0x057a
                da1.C20455a.m22074f(r2)
                goto L_0x0bec
            L_0x057a:
                r3 = 400(0x190, float:5.6E-43)
                if (r0 != r3) goto L_0x0583
                da1.C20455a.m22075g(r2)
                goto L_0x0bec
            L_0x0583:
                r3 = 402(0x192, float:5.63E-43)
                if (r0 != r3) goto L_0x058c
                da1.C116606c.m164452c(r2)
                goto L_0x0bec
            L_0x058c:
                r3 = 403(0x193, float:5.65E-43)
                if (r0 != r3) goto L_0x0bec
                da1.C116606c.m164451b(r2)
                goto L_0x0bec
            L_0x0595:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r3 = r0.getMessage()
                r2[r8] = r3
                java.lang.String r3 = "CATCH_ACTIVITY_ONRESUME: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
                return
            L_0x05a4:
                java.lang.Object r0 = r0.f58812b
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0bec
                aa1.C112764f.m154259b(r0)
                goto L_0x0bec
            L_0x05af:
                java.lang.Object r0 = r0.f58812b
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0bec
                java.lang.String r2 = aa1.C112764f.m154260c()
                aa1.d r3 = aa1.C91980d.vx0()
                r3.getClass()
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r8] = r0
                r3[r7] = r2
                java.lang.String r4 = "MicroMsg.HellBizService"
                java.lang.String r5 = "HABBYGE-MALI, notifyGetSessionId: requestId:%s, sessionPageId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                com.tencent.mm.autogen.events.HellSessionPageIdEvent r3 = new com.tencent.mm.autogen.events.HellSessionPageIdEvent
                r3.<init>()
                com.tencent.mm.autogen.events.HellSessionPageIdEvent$a r4 = r3.f48102d
                r4.f48103a = r0
                r4.f48104b = r2
                r3.publish()
                goto L_0x0bec
            L_0x05dd:
                java.lang.Object r0 = r0.f58812b
                te3.fg2 r0 = (te3.C101777fg2) r0
                if (r0 == 0) goto L_0x0bec
                java.lang.String r2 = r0.f298258e
                java.lang.String r3 = r0.f298257d
                java.lang.String r0 = r0.f298259f
                aa1.C112763a.m154256a(r2, r3, r0)
                goto L_0x0bec
            L_0x05ee:
                java.lang.Object r0 = r0.f58812b
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0bec
                aa1.C112763a.m154257b(r0)
                goto L_0x0bec
            L_0x05f9:
                java.lang.Object r0 = r0.f58812b
                te3.fg2 r0 = (te3.C101777fg2) r0
                if (r0 == 0) goto L_0x0bec
                java.lang.String r2 = r0.f298259f
                java.lang.String r0 = r0.f298257d
                aa1.C16454g.m15288a(r2, r0)
                goto L_0x0bec
            L_0x0608:
                java.lang.Object r0 = r0.f58812b
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0bec
                s91.b r2 = s91.C22316b.f63277a
                r3 = 3
                r2.mo35468a(r3, r0)
                goto L_0x0bec
            L_0x0616:
                java.lang.Object r0 = r0.f58812b
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0bec
                s91.b r2 = s91.C22316b.f63277a
                r2.mo35468a(r13, r0)
                goto L_0x0bec
            L_0x0623:
                java.lang.Object r0 = r0.f58812b
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0bec
                s91.b r2 = s91.C22316b.f63277a
                r2.mo35468a(r7, r0)
                goto L_0x0bec
            L_0x0630:
                java.lang.Object r0 = r0.f58812b
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0bec
                s91.b r2 = s91.C22316b.f63277a
                r2.mo35468a(r8, r0)
                goto L_0x0bec
            L_0x063d:
                ia1.h r0 = ia1.C98625h.m128225a()
                o91.d r0 = r0.f289181e
                r2 = 3
                r3 = 0
                r0.mo139591m(r2, r3)
                goto L_0x0bec
            L_0x064a:
                ia1.h r0 = ia1.C98625h.m128225a()
                r0.getClass()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
                if (r2 == 0) goto L_0x0665
                f40.C86709a0.m107528h()
                f40.g r2 = f40.C86709a0.m107529k()
                ob0.b0 r2 = r2.f251779b
                r3 = 211(0xd3, float:2.96E-43)
                r2.mo123469o(r3, r0)
            L_0x0665:
                o91.d r0 = r0.f289181e
                r2 = 0
                r0.mo139591m(r13, r2)
                ia1.C98625h.f289179p = r2
                goto L_0x0bec
            L_0x066f:
                r2 = 0
                ia1.h r0 = ia1.C98625h.m128225a()
                o91.d r3 = r0.f289181e
                r3.mo139591m(r7, r2)
                ia1.f r0 = r0.f289182f
                r0.getClass()
                i20.a r3 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>> r4 = r0.f289149b
                j20.d r5 = r0.f289154g
                r3.mo32764r(r4, r5)
                r0.f289148a = r2
                i20.a r2 = i20.C21043a.m23197h()
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r3 = r0.f289151d
                j20.b r4 = r0.f289155h
                r2.mo32761o(r3, r4)
                i20.a r2 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>> r3 = r0.f289152e
                j20.b r4 = r0.f289155h
                r2.getClass()
                java.util.Map<java.lang.String, j20.e> r2 = j20.C117292a.f351156a
                if (r3 == 0) goto L_0x0744
                if (r4 != 0) goto L_0x06a9
                goto L_0x0744
            L_0x06a9:
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.util.Set r2 = r3.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x06b3:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0744
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r5 = r3.getKey()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r3 = r3.getValue()
                java.util.List r3 = (java.util.List) r3
                if (r3 == 0) goto L_0x06b3
                java.util.Iterator r3 = r3.iterator()
            L_0x06d1:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x06b3
                java.lang.Object r6 = r3.next()
                android.util.Pair r6 = (android.util.Pair) r6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r8 = "_EXEC_|"
                r7.append(r8)
                java.lang.Object r8 = r6.first
                java.lang.String r8 = (java.lang.String) r8
                r7.append(r8)
                java.lang.String r8 = "|"
                r7.append(r8)
                java.lang.Object r6 = r6.second
                java.lang.String r6 = (java.lang.String) r6
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                java.util.Map<java.lang.String, j20.e> r7 = j20.C117292a.f351156a
                java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
                java.lang.Object r8 = r7.get(r6)
                j20.e r8 = (j20.C21154e) r8
                if (r8 == 0) goto L_0x06d1
                java.util.List<j20.b> r9 = r8.f59800b
                if (r9 == 0) goto L_0x06d1
                java.util.concurrent.CopyOnWriteArrayList r9 = (java.util.concurrent.CopyOnWriteArrayList) r9
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x06d1
                java.util.List<j20.b> r9 = r8.f59800b
                java.util.concurrent.CopyOnWriteArrayList r9 = (java.util.concurrent.CopyOnWriteArrayList) r9
                boolean r9 = r9.contains(r4)
                if (r9 != 0) goto L_0x0725
                goto L_0x06d1
            L_0x0725:
                java.util.List<j20.b> r9 = r8.f59800b
                java.util.concurrent.CopyOnWriteArrayList r9 = (java.util.concurrent.CopyOnWriteArrayList) r9
                r9.remove(r4)
                java.util.List<j20.b> r9 = r8.f59800b
                java.util.concurrent.CopyOnWriteArrayList r9 = (java.util.concurrent.CopyOnWriteArrayList) r9
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto L_0x06d1
                java.util.List<j20.d> r8 = r8.f59799a
                java.util.concurrent.CopyOnWriteArrayList r8 = (java.util.concurrent.CopyOnWriteArrayList) r8
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x06d1
                r7.remove(r6)
                goto L_0x06d1
            L_0x0744:
                r2 = 0
                r0.f289150c = r2
                i20.a r2 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>> r3 = r0.f289153f
                j20.d r0 = r0.f289154g
                r2.mo32762p(r3, r0)
                goto L_0x0bec
            L_0x0754:
                ia1.h r0 = ia1.C98625h.m128225a()
                ia1.f r2 = r0.f289182f
                o91.i r3 = r0.f289184h
                ia1.c r4 = r0.f289185i
                r2.f289148a = r3
                i20.a r3 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>> r5 = r2.f289149b
                j20.d r6 = r2.f289154g
                r3.mo32760n(r5, r6)
                r2.f289150c = r4
                i20.a r3 = i20.C21043a.m23197h()
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r4 = r2.f289151d
                j20.b r5 = r2.f289155h
                r3.mo32755i(r4, r5)
                i20.a r3 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>> r4 = r2.f289152e
                j20.b r5 = r2.f289155h
                r3.mo32756j(r4, r5)
                i20.a r3 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>> r4 = r2.f289153f
                j20.d r2 = r2.f289154g
                r3.mo32758l(r4, r2)
                java.lang.ref.WeakReference<android.app.Activity> r2 = r0.f289180d
                if (r2 == 0) goto L_0x0bec
                o91.d r0 = r0.f289181e
                java.lang.Object r2 = r2.get()
                android.app.Activity r2 = (android.app.Activity) r2
                r0.mo139591m(r8, r2)
                goto L_0x0bec
            L_0x079f:
                java.lang.Object r0 = r0.f58812b
                r2 = r0
                te3.s12 r2 = (te3.C51189s12) r2
                java.lang.String r0 = "resp"
                gy3.C87412m.m108594g(r2, r0)
                ka1.b$a r3 = ka1.C117401b.f351443a
                java.lang.String r4 = "HABBYGE-MALI.HellResponseDao"
                java.lang.String r0 = "setResp..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                java.lang.String r5 = "hell_resp_mkv_key"
                byte[] r0 = f91.C116850b.m164831a(r5)
                if (r0 == 0) goto L_0x07eb
                int r6 = r0.length
                if (r6 != 0) goto L_0x07c1
                r6 = 1
                goto L_0x07c2
            L_0x07c1:
                r6 = 0
            L_0x07c2:
                if (r6 == 0) goto L_0x07c5
                goto L_0x07eb
            L_0x07c5:
                te3.s12 r6 = new te3.s12
                r6.<init>()
                r6.parseFrom(r0)     // Catch:{ Exception -> 0x07cf }
                r12 = r6
                goto L_0x07ec
            L_0x07cf:
                r0 = move-exception
                r6 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r9 = "HellResponseDao, read: "
                r0.append(r9)
                java.lang.String r9 = r6.getMessage()
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r9 = new java.lang.Object[r8]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r6, r0, r9)
            L_0x07eb:
                r12 = 0
            L_0x07ec:
                if (r12 != 0) goto L_0x083f
                te3.s12 r0 = new te3.s12
                r0.<init>()
                int r4 = r2.f141267d
                r0.f141267d = r4
                int r4 = r2.f141268e
                r0.f141268e = r4
                java.util.LinkedList<te3.cl2> r2 = r2.f141269f
                java.util.Iterator r2 = r2.iterator()
            L_0x0801:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x082b
                java.lang.Object r4 = r2.next()
                te3.cl2 r4 = (te3.C49019cl2) r4
                if (r4 != 0) goto L_0x0810
                goto L_0x0801
            L_0x0810:
                int r5 = r4.f131813e
                if (r5 == r7) goto L_0x0801
                java.util.LinkedList<te3.cl2> r5 = r0.f141269f
                r5.add(r4)
                ka1.a$a r8 = ka1.C117399a.f351442a
                te3.tz r5 = r4.f131812d
                java.lang.String r9 = r5.f142477d
                int r10 = r5.f142479f
                boolean r11 = r5.f142480g
                java.lang.String r12 = r4.f131814f
                java.util.LinkedList<te3.nl2> r13 = r4.f131815g
                r8.mo182083c(r9, r10, r11, r12, r13)
                goto L_0x0801
            L_0x082b:
                java.util.LinkedList<te3.cl2> r2 = r0.f141269f
                java.lang.String r4 = "respOld.jsonPackages"
                gy3.C87412m.m108593f(r2, r4)
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ r7
                if (r2 == 0) goto L_0x0bec
                r3.mo182085a(r0)
                goto L_0x0bec
            L_0x083f:
                int r0 = r2.f141267d
                r12.f141267d = r0
                int r0 = r2.f141268e
                r12.f141268e = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedList<te3.cl2> r2 = r2.f141269f
                java.util.Iterator r2 = r2.iterator()
            L_0x0852:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0922
                java.lang.Object r4 = r2.next()
                te3.cl2 r4 = (te3.C49019cl2) r4
                if (r4 != 0) goto L_0x0861
                goto L_0x0852
            L_0x0861:
                java.util.LinkedList<te3.cl2> r6 = r12.f141269f
                int r6 = r6.size()
                int r6 = r6 - r7
            L_0x0868:
                r9 = -1
                if (r9 >= r6) goto L_0x08ff
                java.util.LinkedList<te3.cl2> r9 = r12.f141269f
                java.lang.Object r9 = r9.get(r6)
                java.lang.String r10 = "respOld.jsonPackages[index]"
                gy3.C87412m.m108593f(r9, r10)
                te3.cl2 r9 = (te3.C49019cl2) r9
                te3.tz r10 = r4.f131812d
                java.lang.String r10 = r10.f142477d
                te3.tz r11 = r9.f131812d
                java.lang.String r11 = r11.f142477d
                boolean r10 = gy3.C87412m.m108589b(r10, r11)
                if (r10 == 0) goto L_0x08fb
                int r10 = r4.f131813e
                if (r10 != r7) goto L_0x08d9
                java.util.LinkedList<te3.cl2> r10 = r12.f141269f
                r10.remove(r6)
                ka1.a$a r6 = ka1.C117399a.f351442a
                te3.tz r9 = r9.f131812d
                java.lang.String r10 = r9.f142477d
                int r9 = r9.f142479f
                if (r10 != 0) goto L_0x089b
                goto L_0x08f9
            L_0x089b:
                te3.cp r11 = r6.mo182081a()
                if (r11 != 0) goto L_0x08a3
            L_0x08a1:
                r11 = 3
                goto L_0x08c6
            L_0x08a3:
                java.util.LinkedList<te3.gi3> r13 = r11.f131884d
                java.util.Iterator r13 = r13.iterator()
            L_0x08a9:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x08a1
                java.lang.Object r14 = r13.next()
                te3.gi3 r14 = (te3.C49565gi3) r14
                java.lang.String r15 = r14.f134060d
                boolean r15 = gy3.C87412m.m108589b(r10, r15)
                if (r15 == 0) goto L_0x08a9
                java.util.LinkedList<te3.gi3> r13 = r11.f131884d
                r13.remove(r14)
                r6.mo182082b(r11)
                goto L_0x08a1
            L_0x08c6:
                if (r9 == r11) goto L_0x08c9
                goto L_0x08f9
            L_0x08c9:
                r23 = 0
                r24 = 1
                r25 = 0
                java.lang.String r22 = ""
                r20 = r6
                r21 = r10
                r20.mo182084d(r21, r22, r23, r24, r25)
                goto L_0x08f9
            L_0x08d9:
                java.util.LinkedList<te3.cl2> r9 = r12.f141269f
                r9.set(r6, r4)
                ka1.a$a r20 = ka1.C117399a.f351442a
                te3.tz r6 = r4.f131812d
                java.lang.String r9 = r6.f142477d
                int r10 = r6.f142479f
                boolean r6 = r6.f142480g
                java.lang.String r11 = r4.f131814f
                java.util.LinkedList<te3.nl2> r13 = r4.f131815g
                r21 = r9
                r22 = r10
                r23 = r6
                r24 = r11
                r25 = r13
                r20.mo182083c(r21, r22, r23, r24, r25)
            L_0x08f9:
                r6 = 0
                goto L_0x0900
            L_0x08fb:
                int r6 = r6 + -1
                goto L_0x0868
            L_0x08ff:
                r6 = 1
            L_0x0900:
                if (r6 == 0) goto L_0x0852
                r0.add(r4)
                ka1.a$a r20 = ka1.C117399a.f351442a
                te3.tz r6 = r4.f131812d
                java.lang.String r9 = r6.f142477d
                int r10 = r6.f142479f
                boolean r6 = r6.f142480g
                java.lang.String r11 = r4.f131814f
                java.util.LinkedList<te3.nl2> r4 = r4.f131815g
                r21 = r9
                r22 = r10
                r23 = r6
                r24 = r11
                r25 = r4
                r20.mo182083c(r21, r22, r23, r24, r25)
                goto L_0x0852
            L_0x0922:
                boolean r2 = r0.isEmpty()
                r2 = r2 ^ r7
                if (r2 == 0) goto L_0x092e
                java.util.LinkedList<te3.cl2> r2 = r12.f141269f
                r2.addAll(r0)
            L_0x092e:
                java.util.LinkedList<te3.cl2> r0 = r12.f141269f
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0950
                byte[] r0 = new byte[r8]
                f91.C116850b.m164834d(r5, r0)
                ka1.a$a r9 = ka1.C117399a.f351442a
                byte[] r0 = new byte[r8]
                java.lang.String r2 = "hell_cgi_cc_dat"
                f91.C116850b.m164834d(r2, r0)
                r12 = 0
                r13 = 1
                r14 = 0
                java.lang.String r10 = "-100"
                java.lang.String r11 = ""
                r9.mo182084d(r10, r11, r12, r13, r14)
                goto L_0x0bec
            L_0x0950:
                r3.mo182085a(r12)
                goto L_0x0bec
            L_0x0955:
                java.lang.Object r0 = r0.f58812b
                te3.xr4 r0 = (te3.xr4) r0
                n91.C117614e.m165883a(r0)
                goto L_0x0bec
            L_0x095e:
                w91.b r0 = w91.C22880b.m26857d()
                r0.getClass()
                java.lang.String r2 = "HABBYGE-MALI.HellFrontBackMonitor"
                java.lang.String r3 = "add8EventMMProcessEndIfNeed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                w91.a r3 = r0.f65771a
                r3.getClass()
                boolean r4 = e91.C116711b.m164589n()
                if (r4 != 0) goto L_0x0979
                goto L_0x0a15
            L_0x0979:
                int r4 = android.os.Process.myPid()
                te3.uq1 r3 = r3.mo36049a()
                if (r3 != 0) goto L_0x0988
                te3.uq1 r3 = new te3.uq1
                r3.<init>()
            L_0x0988:
                int r5 = r3.f64659f
                java.lang.String r6 = "HABBYGE-MALI.FrontBackDao"
                if (r5 > 0) goto L_0x0995
                java.lang.String r3 = "handleLastProcessParams lastMMProcessId <= 0"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                goto L_0x0a15
            L_0x0995:
                if (r5 == r4) goto L_0x0a02
                java.lang.Object[] r9 = new java.lang.Object[r13]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r9[r8] = r5
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9[r7] = r4
                java.lang.String r4 = "handleLastProcessParams last != curr ---1: %d, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r9)
                int r4 = r3.f64657d
                r5 = 7
                if (r4 != r5) goto L_0x0a15
                w91.b r4 = w91.C22880b.m26857d()
                w91.a r5 = r4.f65771a
                te3.uq1 r5 = r5.mo36049a()
                if (r5 == 0) goto L_0x09c1
                boolean r5 = r5.f64663j
                if (r5 == 0) goto L_0x09c1
                r5 = 1
                goto L_0x09c2
            L_0x09c1:
                r5 = 0
            L_0x09c2:
                if (r5 == 0) goto L_0x09cd
                java.lang.String r3 = "getIsLogoutFromMMPageFlowService true"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                r4.mo36056h(r8)
                goto L_0x0a15
            L_0x09cd:
                java.lang.String r4 = "page_hell_seq_mmkv_key"
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 == 0) goto L_0x09d8
                r6 = -1
                goto L_0x09e1
            L_0x09d8:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = f91.C116850b.m164832b()
                r6 = -1
                int r6 = r5.getInt(r4, r6)
            L_0x09e1:
                r3.f64662i = r6
                java.lang.String r4 = r3.f64660g
                int r5 = r3.f64661h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                int r6 = r3.f64659f
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                long r14 = r3.f64658e
                java.lang.Long r9 = java.lang.Long.valueOf(r14)
                int r3 = r3.f64662i
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                op3.e r3 = op3.C117882j.m166287f(r4, r5, r6, r9, r3)
                goto L_0x0a16
            L_0x0a02:
                java.lang.Object[] r3 = new java.lang.Object[r13]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r8] = r5
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r7] = r4
                java.lang.String r4 = "handleLastProcessParams last == curr: %d, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
            L_0x0a15:
                r3 = 0
            L_0x0a16:
                if (r3 != 0) goto L_0x0a1a
                goto L_0x0bec
            L_0x0a1a:
                r0.mo36055g(r11)
                j91.C21199a.m23657b(r11)
                java.lang.Object r4 = r3.mo182596a(r8)
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r5 = r3.mo182596a(r7)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                java.lang.Object r6 = r3.mo182596a(r13)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r9 = 3
                java.lang.Object r12 = r3.mo182596a(r9)
                java.lang.Long r12 = (java.lang.Long) r12
                long r14 = r12.longValue()
                java.lang.Object r3 = r3.mo182596a(r10)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                java.lang.Object[] r9 = new java.lang.Object[r10]
                r9[r8] = r4
                java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
                r9[r7] = r10
                java.lang.Long r10 = java.lang.Long.valueOf(r14)
                r9[r13] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
                r12 = 3
                r9[r12] = r10
                java.lang.String r10 = "add8EventMMProcessEndIfNeed need 补充8事件: %s, %d, %s, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r9)
                h81.j$c r0 = r0.f65772b
                if (r0 == 0) goto L_0x0bec
                java.lang.Object[] r0 = new java.lang.Object[r13]
                r0[r8] = r4
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r0[r7] = r2
                java.lang.String r2 = "HABBYGE-MALI.HellhoundService"
                java.lang.String r9 = "frontToBackMMProcessEnd: %s, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r0)
                java.lang.String r0 = java.lang.String.valueOf(r5)
                int r0 = p1054vg.C102190i.m134653a(r0, r8)
                com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct
                r2.<init>()
                r2.f343799d = r6
                f40.j r5 = f40.C86709a0.m107531m()
                j40.a r5 = r5.mo58407a()
                j40.b r5 = (j40.C87829b) r5
                java.lang.String r5 = r5.f124988a
                java.lang.String r6 = "PName"
                java.lang.String r5 = r2.mo86045b(r6, r5, r7)
                r2.f343800e = r5
                java.lang.String r5 = "Name"
                java.lang.String r5 = r2.mo86045b(r5, r4, r7)
                r2.f343802g = r5
                long r5 = (long) r3
                r2.f343801f = r5
                long r5 = (long) r11
                r2.f343803h = r5
                r2.f343804i = r14
                java.lang.String r3 = "TimeStampMs"
                r2.mo86048e(r3, r14)
                long r5 = (long) r0
                r2.f343807l = r5
                com.tencent.mm.plugin.expt.pageflow.i r0 = com.tencent.p014mm.plugin.expt.pageflow.C29897i.f80988a
                if (r0 != 0) goto L_0x0ac6
                com.tencent.mm.plugin.expt.pageflow.i r0 = new com.tencent.mm.plugin.expt.pageflow.i
                r0.<init>()
                com.tencent.p014mm.plugin.expt.pageflow.C29897i.f80988a = r0
            L_0x0ac6:
                com.tencent.mm.plugin.expt.pageflow.i r0 = com.tencent.p014mm.plugin.expt.pageflow.C29897i.f80988a
                r0.mo56975b(r2)
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.String r2 = r2.mo1006q()
                r0[r8] = r2
                java.lang.String r2 = "HABBYGE-MALI.HellFrontBackReport"
                java.lang.String r3 = "[进程尾部补偿8] frontback-pure-report [%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
                x91.a r0 = x91.C118865a.f355584a
                x91.e r2 = x91.C23072e.MATCH_PAGE_8_EVENT
                r0.mo183575c(r4, r14, r2)
                x91.e r2 = x91.C23072e.MATCH_PAGE_MM_PROCESS_RESTEART
                java.lang.String r3 = "UNDEFINED"
                r0.mo183575c(r3, r14, r2)
                z91.b r0 = z91.C23462b.m28021f()
                r0.getClass()
                boolean r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162220c()
                java.lang.String r2 = "HABBYGE-MALI.HellSessionMonitor"
                if (r0 == 0) goto L_0x0b01
                java.lang.String r0 = "HellSessionMonitor, handleMMProcessRestart: FALSE"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
                ca1.C113264b.m155061g()
                goto L_0x0bb3
            L_0x0b01:
                java.lang.String r0 = "handleMMProcessRestart"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                te3.gg2 r0 = ba1.C16777c.m16416h()
                if (r0 != 0) goto L_0x0b0e
                goto L_0x0bb3
            L_0x0b0e:
                java.util.LinkedList<te3.fa3> r2 = r0.f354030h
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0b20
                java.util.LinkedList<te3.ka3> r2 = r0.f354028f
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0b20
                goto L_0x0bb3
            L_0x0b20:
                java.lang.String r2 = "HABBYGE-MALI.HellSessionDao"
                java.lang.String r3 = "HellSessionDao, reset"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                byte[] r2 = new byte[r8]
                java.lang.String r3 = "mmkv_key_hell_sessions"
                f91.C116850b.m164834d(r3, r2)
                te3.dg2 r2 = ca1.C113263a.m155052a()
                java.util.LinkedList<te3.eg2> r3 = r2.f353948d
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0b3c
                goto L_0x0bb3
            L_0x0b3c:
                ca1.C113264b.m155061g()
                java.lang.String r3 = "HABBYGE-MALI.HellSessionReport"
                java.lang.String r4 = "reportWhenMMProcessRestart BEGIN !!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                java.lang.String r3 = "HABBYGE-MALI.HellSessionReportProcessRestart"
                java.lang.String r4 = "HellSessionReportProcessRestart.report()"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                ea1.C116718g.m164622i(r2, r0, r7)
                java.util.LinkedList<te3.eg2> r3 = r2.f353948d
                java.lang.Object r3 = r3.getLast()
                te3.eg2 r3 = (te3.C118427eg2) r3
                long r4 = r0.f354027e
                r6 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 > 0) goto L_0x0b65
                long r4 = r3.f353970e
                r0.f354027e = r4
            L_0x0b65:
                java.util.LinkedList<te3.ka3> r4 = r0.f354028f
                java.util.Iterator r4 = r4.iterator()
            L_0x0b6b:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0b82
                java.lang.Object r5 = r4.next()
                te3.ka3 r5 = (te3.C22505ka3) r5
                long r9 = r5.f64093j
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 > 0) goto L_0x0b6b
                long r9 = r3.f353970e
                r5.f64093j = r9
                goto L_0x0b6b
            L_0x0b82:
                java.util.LinkedList<te3.fa3> r4 = r0.f354030h
                java.util.Iterator r4 = r4.iterator()
            L_0x0b88:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0b9f
                java.lang.Object r5 = r4.next()
                te3.fa3 r5 = (te3.C118430fa3) r5
                long r9 = r5.f353994h
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 > 0) goto L_0x0b88
                long r9 = r3.f353970e
                r5.f353994h = r9
                goto L_0x0b88
            L_0x0b9f:
                java.util.LinkedList<te3.eg2> r3 = r2.f353948d
                java.lang.Object r3 = r3.getFirst()
                te3.eg2 r3 = (te3.C118427eg2) r3
                ea1.C116718g.m164614a(r0, r3)
                java.util.LinkedList<te3.eg2> r3 = r2.f353948d
                r3.removeLast()
                r3 = 0
                ea1.C116718g.m164617d(r0, r2, r3)
            L_0x0bb3:
                byte[] r0 = new byte[r8]
                java.lang.String r2 = "mmkv_sionId_table_hell"
                f91.C116850b.m164834d(r2, r0)
                byte[] r0 = new byte[r8]
                java.lang.String r2 = "mmkv_sionpairD_table_hell"
                f91.C116850b.m164834d(r2, r0)
                goto L_0x0bec
            L_0x0bc2:
                r6 = -1
                java.lang.Object[] r9 = new java.lang.Object[r7]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r9[r8] = r2
                java.lang.String r2 = "MSGQ_TYPE_STORY_%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r9)
                e91.a r2 = e91.C20552a.m22323a()
                int r5 = r0.f58811a
                java.lang.Object r0 = r0.f58812b
                java.lang.Long r0 = (java.lang.Long) r0
                long r9 = r0.longValue()
                e91.e r0 = r2.f57844b
                l91.g r0 = (l91.C21406g) r0
                if (r5 != r4) goto L_0x0be6
                r6 = 0
                goto L_0x0be9
            L_0x0be6:
                if (r5 != r3) goto L_0x0be9
                r6 = 1
            L_0x0be9:
                r0.mo33532b(r6, r9)
            L_0x0bec:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j91.C21201c.C21202a.mo33181a(g91.a):void");
        }
    }

    public C21201c() {
        C20813c.m22810a().f58817a.f58819b = new C21202a();
    }

    /* renamed from: d */
    public static void m23666d(C21201c cVar, ta4 ta4) {
        String str;
        cVar.getClass();
        fh4 fh4 = ta4.f64613d;
        if (fh4 == null || TextUtils.isEmpty(fh4.f354001d)) {
            C118467t1 g = C21062c.m23249d().mo32776g();
            if (g != null) {
                str = g.f354392d.f354001d;
                C21317d dVar = (C21317d) C21316c.m23893a().f60219a;
                C22524q1 a = dVar.mo33321a();
                if (a == null) {
                    a = new C22524q1();
                }
                a.f64472p = str;
                dVar.mo33322b(a);
            } else {
                str = null;
            }
        } else {
            str = ta4.f64613d.f354001d;
            C21316c a2 = C21316c.m23893a();
            boolean z = ta4.f64615f;
            String str2 = ta4.f64616g;
            C21317d dVar2 = (C21317d) a2.f60219a;
            C22524q1 a3 = dVar2.mo33321a();
            if (a3 == null) {
                a3 = new C22524q1();
            }
            if (!z) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = str.getClass().getCanonicalName();
            }
            a3.f64472p = str2;
            dVar2.mo33322b(a3);
        }
        C117394e.m165538d(str, ta4.f64616g, 100);
        String str3 = ta4.f64614e.f354001d;
        Log.m105925i("HABBYGE-MALI.AsyncActivityMonitor", "_startActivity, toActivity: %s, %s", str, str3);
        C117394e.m165538d(str3, (String) null, 101);
        String str4 = ta4.f64618i;
        String str5 = ta4.f64620n;
        String str6 = ta4.f64619j;
        if (!TextUtils.isEmpty(str4)) {
            C117393b.m165533b("Chat_User", str4);
        }
        if (!String.valueOf(1).equals(str6) || !"jd_store".equals(str5)) {
            C117393b.m165533b("minimize_secene", "");
            C117393b.m165533b("KPublisherId", "");
        } else {
            C117393b.m165533b("minimize_secene", str6);
            C117393b.m165533b("KPublisherId", str5);
        }
        m23677o(ta4.f64617h, str, ta4.f64616g, str3, 0, ta4.f64621o);
        C21199a.m23661f(str3);
        C21199a.m23660e(str);
        C21199a.m23657b(0);
        if (str3 != null && cVar.f59973a != null) {
            C116850b.m164834d("hell_mmkv_fbm__", new byte[0]);
            C23462b f = C23462b.m28021f();
            f.getClass();
            if ("VideoActivity".equals(C116711b.m164583h(str3))) {
                C20823c cVar2 = f.f67290b;
                cVar2.getClass();
                Log.m105924i("HABBYGE-MALI.VoipFloatSession", "VoipFloatSession, startMonitor");
                C21043a.m23197h().mo32758l(cVar2.f58826a, cVar2.f58827b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23667e(j91.C21201c r16, te3.fh4 r17) {
        /*
            r0 = r16
            r16.getClass()
            te3.fh4 r1 = m23675m(r17)
            if (r1 != 0) goto L_0x000d
            goto L_0x015d
        L_0x000d:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r1.f354001d
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "HABBYGE-MALI.AsyncActivityMonitor"
            java.lang.String r6 = "_finish: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            java.lang.String r3 = r1.f354001d
            r6 = 102(0x66, float:1.43E-43)
            r7 = 0
            k91.C117394e.m165538d(r3, r7, r6)
            java.lang.String r3 = r1.f354001d
            long r8 = r1.f354003f
            i91.c r6 = i91.C21062c.m23249d()
            i91.d r6 = r6.f59586a
            i91.f r6 = r6.f59587a
            r6.getClass()
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 == 0) goto L_0x003a
            goto L_0x008b
        L_0x003a:
            te3.u1 r10 = i91.C21061b.m23247a()
            java.util.LinkedList<te3.mf4> r12 = r10.f354473d
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0047
            goto L_0x008b
        L_0x0047:
            java.util.LinkedList<te3.mf4> r12 = r10.f354473d
            int r12 = r12.size()
        L_0x004d:
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x0088
            java.util.LinkedList<te3.mf4> r13 = r10.f354473d
            java.lang.Object r13 = r13.get(r12)
            te3.mf4 r13 = (te3.mf4) r13
            java.util.LinkedList<te3.t1> r14 = r13.f354135e
            int r14 = r14.size()
        L_0x005f:
            int r14 = r14 + -1
            if (r14 < 0) goto L_0x004d
            java.util.LinkedList<te3.t1> r15 = r13.f354135e
            java.lang.Object r15 = r15.get(r14)
            te3.t1 r15 = (te3.C118467t1) r15
            te3.fh4 r11 = r15.f354392d
            java.lang.String r11 = r11.f354001d
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x005f
            java.util.LinkedList<te3.t1> r3 = r13.f354135e
            r3.remove(r14)
            java.util.LinkedList<te3.t1> r3 = r13.f354135e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0089
            java.util.LinkedList<te3.mf4> r3 = r10.f354473d
            r3.remove(r12)
            goto L_0x0089
        L_0x0088:
            r15 = r7
        L_0x0089:
            if (r15 != 0) goto L_0x008d
        L_0x008b:
            r3 = 0
            goto L_0x00da
        L_0x008d:
            i91.C21061b.m23248b(r10)
            i91.e r3 = r6.f59588a
            if (r3 == 0) goto L_0x00d9
            te3.fh4 r3 = r15.f354392d
            r3.f354003f = r8
            op3.b r3 = r6.mo32780b()
            java.lang.Object r3 = r3.mo182596a(r2)
            te3.t1 r3 = (te3.C118467t1) r3
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            te3.fh4 r8 = r15.f354392d
            java.lang.String r8 = r8.f354001d
            r6[r5] = r8
            if (r3 != 0) goto L_0x00b0
            java.lang.String r8 = "NULL"
            goto L_0x00b4
        L_0x00b0:
            te3.fh4 r8 = r3.f354392d
            java.lang.String r8 = r8.f354001d
        L_0x00b4:
            r6[r2] = r8
            java.lang.String r8 = "HABBYGE-MALI.HellhoundService"
            java.lang.String r9 = "Stack, onPop: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r6)
            z91.b r6 = z91.C23462b.m28021f()
            r6.mo36923h(r7, r15, r2, r3)
            ia1.h r3 = ia1.C98625h.m128225a()
            te3.fh4 r6 = r15.f354392d
            java.lang.String r6 = r6.f354001d
            r8 = 3
            r3.mo138056b(r8, r6, r7)
            s91.b r3 = s91.C22316b.f63277a
            te3.fh4 r6 = r15.f354392d
            java.lang.String r6 = r6.f354001d
            r3.mo35470c(r6, r7)
        L_0x00d9:
            r3 = 1
        L_0x00da:
            if (r3 != 0) goto L_0x0111
            java.lang.String r3 = "_finish, popSuccess FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r3)
            te3.t1 r3 = new te3.t1
            r3.<init>()
            te3.fh4 r4 = new te3.fh4
            r4.<init>()
            r3.f354392d = r4
            java.lang.String r6 = r1.f354001d
            r4.f354001d = r6
            int r6 = r1.f354002e
            r4.f354002e = r6
            long r8 = r1.f354003f
            r4.f354003f = r8
            z91.b r4 = z91.C23462b.m28021f()
            r4.mo36923h(r7, r3, r2, r7)
            s91.b r3 = s91.C22316b.f63277a
            java.lang.String r4 = r1.f354001d
            r3.mo35470c(r4, r7)
            ia1.h r3 = ia1.C98625h.m128225a()
            java.lang.String r4 = r1.f354001d
            r6 = 3
            r3.mo138056b(r6, r4, r7)
        L_0x0111:
            java.lang.String r3 = r1.f354001d
            r0.mo33180p(r3, r2)
            h81.j$a r0 = r0.f59973a
            if (r0 == 0) goto L_0x015d
            java.lang.String r0 = r1.f354001d
            int r3 = r1.f354002e
            long r12 = r1.f354003f
            x91.a r1 = x91.C118865a.f355584a
            x91.e r4 = x91.C23072e.MATCH_PAGE_FINISH
            r1.mo183575c(r0, r12, r4)
            m91.b r1 = m91.C21487b.m24299c()
            r1.getClass()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r5] = r0
            java.lang.String r5 = "HABBYGE-MALI.StoryGalleryMonitor"
            java.lang.String r6 = "_finishMMFecordUI: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            java.lang.String r4 = "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0144
            r1.mo33652d(r2, r12)
        L_0x0144:
            z91.b r6 = z91.C23462b.m28021f()
            r7 = 1
            r8 = r0
            r9 = r3
            r10 = r12
            r6.mo36929p(r7, r8, r9, r10)
            r1 = 103(0x67, float:1.44E-43)
            w91.C22880b.m26858f(r1, r0, r3, r12)
            t91.C22466j.m26189j(r0)
            t91.C22466j.m26188i(r0)
            t91.C22466j.m26190k(r0)
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j91.C21201c.m23667e(j91.c, te3.fh4):void");
    }

    /* renamed from: f */
    public static void m23668f(C21201c cVar, fh4 fh4, boolean z) {
        fh4 fh42;
        cVar.getClass();
        fh4 m = m23675m(fh4);
        if (m != null) {
            Log.m105919d("HABBYGE-MALI.AsyncActivityMonitor", "_moveTaskToBack: %s", m.f354001d);
            if (!TextUtils.isEmpty(m.f354001d)) {
                C117394e.m165538d(m.f354001d, (String) null, 103);
                C21065f fVar = C21062c.m23249d().f59586a.f59587a;
                fVar.getClass();
                C118471u1 a = C21061b.m23247a();
                C118467t1 t1Var = new C118467t1();
                fh4 fh43 = new fh4();
                t1Var.f354392d = fh43;
                fh43.f354001d = m.f354001d;
                fh43.f354002e = m.f354002e;
                fh43.f354003f = m.f354003f;
                C117877b<mf4, Integer> d = C21065f.m23260d(a, t1Var);
                if (d != null) {
                    mf4 mf4 = (mf4) d.mo182596a(0);
                    int intValue = ((Integer) d.mo182596a(1)).intValue();
                    if ((z || C21066g.m23269a(mf4.f354135e.getFirst().f354392d, t1Var.f354392d)) && intValue == a.f354473d.size() - 1) {
                        a.f354473d.remove(intValue);
                        a.f354473d.addFirst(mf4);
                        C21061b.m23248b(a);
                        if (fVar.f59588a != null) {
                            C23462b.m28021f().mo36923h((Activity) null, t1Var, 3, fVar.mo32781c(a));
                            C20928j.C20932d dVar = C20453e.f57483d;
                            if (!(dVar == null || (fh42 = t1Var.f354392d) == null)) {
                                dVar.mo32661w(fh42.f354002e);
                            }
                        }
                    }
                }
                cVar.mo33180p(m.f354001d, false);
                if (cVar.f59973a != null) {
                    String str = m.f354001d;
                    int i = m.f354002e;
                    long j = m.f354003f;
                    C118865a.f355584a.mo183575c(str, j, C23072e.MATCH_PAGE_FINISH);
                    C21487b c = C21487b.m24299c();
                    c.getClass();
                    Log.m105925i("HABBYGE-MALI.StoryGalleryMonitor", "_finishMMFecordUI: %s", str);
                    if ("com.tencent.mm.plugin.recordvideo.activity.MMRecordUI".equals(str)) {
                        c.mo33652d(1, j);
                    }
                    C23462b.m28021f().mo36929p(true, str, i, j);
                    C22880b.m26858f(103, str, i, j);
                    C22466j.m26189j(str);
                    C22466j.m26188i(str);
                    C22466j.m26190k(str);
                }
            }
        }
    }

    /* renamed from: g */
    public static void m23669g(C21201c cVar, fh4 fh4, int i) {
        cVar.mo33179c(i, fh4);
        if (cVar.f59973a != null) {
            C20696a.m22650b(fh4.f354001d);
        }
    }

    /* renamed from: h */
    public static void m23670h(C21201c cVar, int i, fh4 fh4) {
        cVar.mo33179c(i, fh4);
        if (cVar.f59973a != null) {
            C20696a.m22650b(fh4.f354001d);
        }
    }

    /* renamed from: i */
    public static void m23671i(C21201c cVar, fh4 fh4) {
        Fragment e;
        cVar.getClass();
        WeakReference<Object> weakReference = C20552a.m22323a().f57845c;
        Object obj = weakReference == null ? null : weakReference.get();
        Map<Integer, WeakReference<Activity>> map = C20455a.f57485a;
        if (obj != null) {
            C20455a.f57486b = new WeakReference<>(obj);
        }
        C117394e.m165538d(fh4.f354001d, (String) null, 105);
        C21062c.m23249d().mo32771a(fh4.f354001d, fh4.f354002e);
        C21062c.m23249d().mo32777h(fh4.f354001d, fh4.f354002e, C21060a.RESUME);
        if (cVar.f59973a != null) {
            String str = fh4.f354001d;
            int i = fh4.f354002e;
            long j = fh4.f354003f;
            C22880b.m26858f(100, str, i, j);
            C23462b.m28021f().getClass();
            if (C115411b.m162220c()) {
                Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, monitorScanSession: FALSE");
            } else {
                C22505ka3 e2 = C16777c.m16413e();
                if (e2 != null) {
                    Log.m105925i("HABBYGE-MALI.ScanSessionHandler", "ScanSessionHandler, curSession: %s, %s", e2.f64087d, str);
                    if (C20696a.m22649a(e2.f64087d)) {
                        String h = C116711b.m164583h(str);
                        if (C116711b.m164587l(str)) {
                            if (!C20696a.f58511b) {
                                C20696a.f58511b = true;
                                if (!TextUtils.isEmpty(h) && C20696a.m22649a(e2.f64087d)) {
                                    C113264b.m155057c(e2, h, i, j);
                                }
                            } else {
                                C20696a.f58511b = false;
                                C23462b.m28021f().mo36930q(e2, j);
                            }
                        } else if (!TextUtils.isEmpty(h) && C20696a.m22649a(e2.f64087d)) {
                            C113264b.m155057c(e2, h, i, j);
                        }
                    }
                }
            }
            C113264b.m155056b(C16777c.m16413e(), str, i, j);
            C118865a.f355584a.mo183575c(str, j, C23072e.MATCH_PAGE_RESUME);
            if (C116711b.m164587l(str) && (e = C117467h.m165690e(str)) != null) {
                String simpleName = e.getClass().getSimpleName();
                if (!"ChattingUIFragment".equals(simpleName)) {
                    C64208c.m75547a(simpleName);
                }
            }
        }
    }

    /* renamed from: j */
    public static void m23672j(C21201c cVar, fh4 fh4) {
        cVar.getClass();
        C117394e.m165538d(fh4.f354001d, (String) null, 106);
        C21062c.m23249d().mo32777h(fh4.f354001d, fh4.f354002e, C21060a.PAUSE);
        if (cVar.f59973a != null) {
            C22880b.m26858f(101, fh4.f354001d, fh4.f354002e, fh4.f354003f);
        }
    }

    /* renamed from: k */
    public static void m23673k(C21201c cVar, fh4 fh4) {
        cVar.getClass();
        if (!"com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI".equals(fh4.f354001d)) {
            C117394e.m165538d(fh4.f354001d, (String) null, 107);
            C21062c.m23249d().mo32777h(fh4.f354001d, fh4.f354002e, C21060a.STOP);
            if (cVar.f59973a != null) {
                C22880b.m26858f(102, fh4.f354001d, fh4.f354002e, fh4.f354003f);
            }
        }
    }

    /* renamed from: l */
    public static void m23674l(C21201c cVar, fh4 fh4) {
        cVar.getClass();
        C117394e.m165538d(fh4.f354001d, (String) null, 108);
        C21062c.m23249d().mo32777h(fh4.f354001d, fh4.f354002e, C21060a.DESTROY);
        if (cVar.f59973a != null) {
            String str = fh4.f354001d;
            int i = fh4.f354002e;
            Map<Integer, WeakReference<Activity>> map = C20455a.f57485a;
            HashMap hashMap = (HashMap) map;
            if (!hashMap.isEmpty()) {
                if (i > 0) {
                    try {
                        ((HashMap) map).remove(Integer.valueOf(i));
                    } catch (NumberFormatException e) {
                        Log.printErrStackTrace("HABBYGE-MALI.HellPageParamsCatcher", e, "HellPageParamsCatcher, onDestroy: %s", e.getMessage());
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            Activity activity = (Activity) ((WeakReference) entry.getValue()).get();
                            if (activity != null) {
                                String canonicalName = activity.getClass().getCanonicalName();
                                if (canonicalName != null && canonicalName.equals(str)) {
                                    arrayList.add((Integer) entry.getKey());
                                    break;
                                }
                            } else {
                                arrayList.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            int intValue = ((Integer) it4.next()).intValue();
                            ((HashMap) C20455a.f57485a).remove(Integer.valueOf(intValue));
                        }
                    }
                }
            }
            Map<Integer, WeakReference<Activity>> map2 = C116606c.f349667a;
            synchronized (C116606c.class) {
                Map<Integer, WeakReference<Activity>> map3 = C116606c.f349667a;
                if (!((HashMap) map3).isEmpty()) {
                    if (i > 0) {
                        try {
                            ((HashMap) map3).remove(Integer.valueOf(i));
                        } catch (NumberFormatException e2) {
                            Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBAParamsCatcher", e2, "HellSessionUBAParamsCatcher, onDestroy: %s", e2.getMessage());
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it5 = ((HashMap) map3).entrySet().iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it5.next();
                                if (entry2 != null) {
                                    Activity activity2 = (Activity) ((WeakReference) entry2.getValue()).get();
                                    if (activity2 != null) {
                                        String canonicalName2 = activity2.getClass().getCanonicalName();
                                        if (canonicalName2 != null && canonicalName2.equals(str)) {
                                            arrayList2.add((Integer) entry2.getKey());
                                            break;
                                        }
                                    } else {
                                        arrayList2.add((Integer) entry2.getKey());
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            Iterator it6 = arrayList2.iterator();
                            while (it6.hasNext()) {
                                int intValue2 = ((Integer) it6.next()).intValue();
                                ((HashMap) C116606c.f349667a).remove(Integer.valueOf(intValue2));
                            }
                        }
                    }
                }
            }
            C23462b f = C23462b.m28021f();
            f.getClass();
            if ("VideoActivity".equals(C116711b.m164583h(str))) {
                C20823c cVar2 = f.f67290b;
                cVar2.getClass();
                Log.m105924i("HABBYGE-MALI.VoipFloatSession", "VoipFloatSession, stopMonitor");
                C21043a.m23197h().mo32762p(cVar2.f58826a, cVar2.f58827b);
            }
            if ("com.tencent.mm.plugin.scanner.ui.BaseScanUI".equals(str)) {
                C20813c.m22810a().mo32507b(221);
            }
        }
    }

    /* renamed from: m */
    public static fh4 m23675m(fh4 fh4) {
        if (fh4 == null || TextUtils.isEmpty(fh4.f354001d)) {
            try {
                C117877b<String, Integer> c = C21062c.m23249d().mo32773c();
                if (fh4 == null) {
                    fh4 = new fh4();
                    fh4.f354003f = System.currentTimeMillis();
                }
                fh4.f354001d = (String) c.mo182596a(0);
                fh4.f354002e = ((Integer) c.mo182596a(1)).intValue();
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.AsyncActivityMonitor", e, "getActivityOnFinish", new Object[0]);
                return null;
            }
        }
        return fh4;
    }

    /* renamed from: n */
    public static C117877b<String, Boolean> m23676n(Activity activity) {
        Fragment d = C117467h.m165689d(activity);
        String canonicalName = d != null ? d.getClass().getCanonicalName() : null;
        boolean z = true;
        if (canonicalName == null) {
            canonicalName = activity.getClass().getCanonicalName();
            z = false;
        }
        return C117882j.m166284c(canonicalName, Boolean.valueOf(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0165, code lost:
        if (r8 != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0209, code lost:
        if ((r8 & 524288) == 524288) goto L_0x020b;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23677o(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, long r13) {
        /*
            i91.c r0 = i91.C21062c.m23249d()
            i91.d r0 = r0.f59586a
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L_0x0019
            java.lang.String r8 = "HABBYGE-MALI.ActivityStackWrapper"
            java.lang.String r9 = "push: toActivity is NULL"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
            goto L_0x0380
        L_0x0019:
            r1 = 0
            r2 = 1
            if (r12 > 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 != 0) goto L_0x0056
            i91.f r3 = r0.f59587a
            op3.b r3 = r3.mo32780b()
            java.lang.Object r4 = r3.mo182596a(r1)
            te3.u1 r4 = (te3.C118471u1) r4
            java.lang.Object r3 = r3.mo182596a(r2)
            te3.t1 r3 = (te3.C118467t1) r3
            if (r3 == 0) goto L_0x004a
            te3.fh4 r5 = r3.f354392d
            if (r5 == 0) goto L_0x004a
            java.lang.String r5 = r5.f354001d
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x004a
            te3.fh4 r5 = r3.f354392d
            int r5 = r5.f354002e
            if (r5 > 0) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x0056
            te3.fh4 r8 = r3.f354392d
            r8.f354002e = r12
            i91.C21061b.m23248b(r4)
            goto L_0x0380
        L_0x0056:
            te3.t1 r3 = new te3.t1
            r3.<init>()
            te3.fh4 r4 = new te3.fh4
            r4.<init>()
            r3.f354392d = r4
            r4.f354001d = r11
            r4.f354003f = r13
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto L_0x006e
            r3.f354397i = r9
        L_0x006e:
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L_0x0076
            r3.f354396h = r10
        L_0x0076:
            te3.fh4 r9 = r3.f354392d
            r9.f354002e = r12
            r3.f354393e = r8
            r3.f354394f = r1
            r9 = 100
            r10 = 3
            r11 = 101(0x65, float:1.42E-43)
            r12 = 2
            if (r8 != 0) goto L_0x0089
            r9 = 0
            goto L_0x020c
        L_0x0089:
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = r8 & r13
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            if (r14 != r13) goto L_0x016b
            r13 = r8 & r4
            if (r13 != r4) goto L_0x0099
            goto L_0x020b
        L_0x0099:
            r13 = 32768(0x8000, float:4.5918E-41)
            r14 = r8 & r13
            if (r14 != r13) goto L_0x00e1
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.fh4 r13 = r3.f354392d
            java.lang.String r13 = r13.f354001d
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x00b1
            goto L_0x020c
        L_0x00b1:
            te3.u1 r13 = i91.C21061b.m23247a()
            te3.t1 r14 = r8.mo32781c(r13)
            op3.b r4 = i91.C21065f.m23260d(r13, r3)
            if (r4 != 0) goto L_0x00c1
            goto L_0x0167
        L_0x00c1:
            java.lang.Object r4 = r4.mo182596a(r1)
            te3.mf4 r4 = (te3.mf4) r4
            java.util.LinkedList<te3.t1> r5 = r4.f354135e
            r5.clear()
            r4.f354134d = r1
            java.util.LinkedList<te3.t1> r4 = r4.f354135e
            r4.addLast(r3)
            i91.C21061b.m23248b(r13)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x020c
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r14)
            goto L_0x020c
        L_0x00e1:
            r8 = r8 & r5
            if (r8 != r5) goto L_0x00e6
            goto L_0x0181
        L_0x00e6:
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.fh4 r13 = r3.f354392d
            java.lang.String r13 = r13.f354001d
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x00f6
            goto L_0x0104
        L_0x00f6:
            te3.u1 r13 = i91.C21061b.m23247a()
            te3.t1 r14 = r8.mo32781c(r13)
            op3.b r4 = i91.C21065f.m23260d(r13, r3)
            if (r4 != 0) goto L_0x0106
        L_0x0104:
            r8 = 0
            goto L_0x0165
        L_0x0106:
            java.lang.Object r5 = r4.mo182596a(r1)
            te3.mf4 r5 = (te3.mf4) r5
            java.lang.Object r4 = r4.mo182596a(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.LinkedList<te3.mf4> r6 = r13.f354473d
            r6.remove(r4)
            java.util.LinkedList<te3.mf4> r4 = r13.f354473d
            r4.addLast(r5)
            java.util.LinkedList<te3.t1> r4 = r5.f354135e
            java.lang.Object r4 = r4.getLast()
            te3.t1 r4 = (te3.C118467t1) r4
            if (r4 == 0) goto L_0x0158
            te3.fh4 r4 = r4.f354392d
            te3.fh4 r6 = r3.f354392d
            boolean r4 = i91.C21066g.m23269a(r4, r6)
            if (r4 != 0) goto L_0x0158
            java.util.LinkedList<te3.t1> r4 = r5.f354135e
            int r4 = r4.size()
            int r4 = r4 - r2
        L_0x013b:
            if (r4 < 0) goto L_0x0158
            java.util.LinkedList<te3.t1> r6 = r5.f354135e
            java.lang.Object r6 = r6.get(r4)
            te3.t1 r6 = (te3.C118467t1) r6
            te3.fh4 r6 = r6.f354392d
            te3.fh4 r7 = r3.f354392d
            boolean r6 = i91.C21066g.m23269a(r6, r7)
            if (r6 == 0) goto L_0x0150
            goto L_0x0158
        L_0x0150:
            java.util.LinkedList<te3.t1> r6 = r5.f354135e
            r6.remove(r4)
            int r4 = r4 + -1
            goto L_0x013b
        L_0x0158:
            i91.C21061b.m23248b(r13)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x0164
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r14)
        L_0x0164:
            r8 = 1
        L_0x0165:
            if (r8 != 0) goto L_0x020c
        L_0x0167:
            r9 = 101(0x65, float:1.42E-43)
            goto L_0x020c
        L_0x016b:
            r13 = r8 & r5
            if (r13 != r5) goto L_0x0170
            goto L_0x0181
        L_0x0170:
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = r8 & r14
            if (r6 != r14) goto L_0x0179
            r9 = 1
            goto L_0x020c
        L_0x0179:
            r14 = 131072(0x20000, float:1.83671E-40)
            r6 = r8 & r14
            if (r6 != r14) goto L_0x0202
            if (r13 != r5) goto L_0x0184
        L_0x0181:
            r9 = 2
            goto L_0x020c
        L_0x0184:
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.u1 r13 = i91.C21061b.m23247a()
            te3.t1 r14 = r8.mo32781c(r13)
            te3.fh4 r4 = r3.f354392d
            java.lang.String r5 = r4.f354001d
            int r4 = r4.f354002e
            op3.b r4 = i91.C21065f.m23263j(r13, r5, r4)
            java.lang.Object r5 = r4.mo182596a(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r4.mo182596a(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 >= 0) goto L_0x01b5
            i91.C21065f.m23262i(r13, r3)
            goto L_0x01f5
        L_0x01b5:
            java.util.LinkedList<te3.mf4> r6 = r13.f354473d
            int r6 = r6.size()
            int r6 = r6 - r2
            if (r5 != r6) goto L_0x01c0
            r6 = 1
            goto L_0x01c1
        L_0x01c0:
            r6 = 0
        L_0x01c1:
            if (r6 == 0) goto L_0x01dd
            java.util.LinkedList<te3.mf4> r5 = r13.f354473d
            java.lang.Object r5 = r5.getLast()
            te3.mf4 r5 = (te3.mf4) r5
            if (r5 != 0) goto L_0x01d1
            i91.C21065f.m23262i(r13, r3)
            goto L_0x01f5
        L_0x01d1:
            java.util.LinkedList<te3.t1> r5 = r5.f354135e
            java.lang.Object r4 = r5.remove(r4)
            te3.t1 r4 = (te3.C118467t1) r4
            i91.C21065f.m23262i(r13, r4)
            goto L_0x01f5
        L_0x01dd:
            java.util.LinkedList<te3.mf4> r6 = r13.f354473d
            java.lang.Object r5 = r6.remove(r5)
            te3.mf4 r5 = (te3.mf4) r5
            java.util.LinkedList<te3.mf4> r6 = r13.f354473d
            r6.addLast(r5)
            java.util.LinkedList<te3.t1> r5 = r5.f354135e
            java.lang.Object r4 = r5.remove(r4)
            te3.t1 r4 = (te3.C118467t1) r4
            i91.C21065f.m23262i(r13, r4)
        L_0x01f5:
            i91.C21061b.m23248b(r13)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x020c
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r14)
            goto L_0x020c
        L_0x0202:
            r13 = r8 & r4
            if (r13 != r4) goto L_0x020c
            r13 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 & r13
            if (r8 != r13) goto L_0x020c
        L_0x020b:
            r9 = 3
        L_0x020c:
            if (r9 == 0) goto L_0x035a
            if (r9 == r2) goto L_0x031e
            if (r9 == r12) goto L_0x02a1
            if (r9 == r10) goto L_0x0236
            if (r9 == r11) goto L_0x0218
            goto L_0x0380
        L_0x0218:
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.u1 r9 = i91.C21061b.m23247a()
            te3.t1 r10 = r8.mo32781c(r9)
            i91.C21065f.m23259a(r9, r3, r1)
            i91.C21061b.m23248b(r9)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x0380
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r10)
            goto L_0x0380
        L_0x0236:
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.u1 r9 = i91.C21061b.m23247a()
            te3.t1 r10 = r8.mo32781c(r9)
            java.util.LinkedList<te3.mf4> r11 = r9.f354473d
            if (r11 != 0) goto L_0x024b
            i91.C21065f.m23259a(r9, r3, r2)
            goto L_0x0293
        L_0x024b:
            int r12 = r11.size()
            int r12 = r12 - r2
        L_0x0250:
            if (r12 < 0) goto L_0x028e
            java.lang.Object r13 = r11.get(r12)
            te3.mf4 r13 = (te3.mf4) r13
            if (r13 == 0) goto L_0x028b
            boolean r14 = r13.f354134d
            if (r14 != 0) goto L_0x025f
            goto L_0x028b
        L_0x025f:
            java.util.LinkedList<te3.t1> r14 = r13.f354135e
            int r14 = r14.size()
            int r14 = r14 - r2
        L_0x0266:
            if (r14 < 0) goto L_0x028b
            java.util.LinkedList<te3.t1> r0 = r13.f354135e
            java.lang.Object r0 = r0.get(r14)
            te3.t1 r0 = (te3.C118467t1) r0
            if (r0 != 0) goto L_0x0273
            goto L_0x0288
        L_0x0273:
            te3.fh4 r4 = r3.f354392d
            te3.fh4 r0 = r0.f354392d
            boolean r0 = i91.C21066g.m23269a(r4, r0)
            if (r0 == 0) goto L_0x0288
            java.lang.Object r13 = r11.remove(r12)
            te3.mf4 r13 = (te3.mf4) r13
            r11.addLast(r13)
            r1 = 1
            goto L_0x028b
        L_0x0288:
            int r14 = r14 + -1
            goto L_0x0266
        L_0x028b:
            int r12 = r12 + -1
            goto L_0x0250
        L_0x028e:
            if (r1 != 0) goto L_0x0293
            i91.C21065f.m23259a(r9, r3, r2)
        L_0x0293:
            i91.C21061b.m23248b(r9)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x0380
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r10)
            goto L_0x0380
        L_0x02a1:
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.u1 r9 = i91.C21061b.m23247a()
            te3.t1 r10 = r8.mo32781c(r9)
            boolean r11 = r8.mo32782e(r9)
            if (r11 == 0) goto L_0x02b8
            i91.C21065f.m23259a(r9, r3, r1)
            goto L_0x0311
        L_0x02b8:
            te3.fh4 r11 = r3.f354392d
            java.lang.String r13 = r11.f354001d
            int r11 = r11.f354002e
            op3.b r11 = i91.C21065f.m23263j(r9, r13, r11)
            java.lang.Object r13 = r11.mo182596a(r1)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Object r11 = r11.mo182596a(r2)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 >= 0) goto L_0x02dc
            i91.C21065f.m23262i(r9, r3)
            goto L_0x0311
        L_0x02dc:
            java.util.LinkedList<te3.mf4> r14 = r9.f354473d
            int r14 = r14.size()
            int r14 = r14 - r2
            if (r13 != r14) goto L_0x02e7
            r14 = 1
            goto L_0x02e8
        L_0x02e7:
            r14 = 0
        L_0x02e8:
            if (r14 == 0) goto L_0x02ff
            java.util.LinkedList<te3.mf4> r14 = r9.f354473d
            java.lang.Object r14 = r14.getLast()
            te3.mf4 r14 = (te3.mf4) r14
            java.util.LinkedList<te3.t1> r14 = r14.f354135e
            int r14 = r14.size()
            int r14 = r14 - r2
            if (r11 != r14) goto L_0x02fc
            r1 = 1
        L_0x02fc:
            r14 = r1 ^ 1
            goto L_0x0300
        L_0x02ff:
            r14 = 2
        L_0x0300:
            if (r14 != r2) goto L_0x0307
            int r0 = r11 + 1
            r8.mo32783g(r9, r0, r3)
        L_0x0307:
            if (r14 != r12) goto L_0x0311
            int r13 = r13 + r2
            r8.mo32784h(r9, r13, r3)
            int r11 = r11 + r2
            r8.mo32783g(r9, r11, r3)
        L_0x0311:
            i91.C21061b.m23248b(r9)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x0380
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r10)
            goto L_0x0380
        L_0x031e:
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.u1 r9 = i91.C21061b.m23247a()
            te3.t1 r10 = r8.mo32781c(r9)
            boolean r11 = r8.mo32782e(r9)
            if (r11 == 0) goto L_0x0335
            i91.C21065f.m23259a(r9, r3, r1)
            goto L_0x034d
        L_0x0335:
            te3.t1 r11 = i91.C21065f.m23261f(r9)
            if (r11 != 0) goto L_0x033f
            i91.C21065f.m23262i(r9, r3)
            goto L_0x034d
        L_0x033f:
            te3.fh4 r12 = r3.f354392d
            te3.fh4 r11 = r11.f354392d
            boolean r11 = i91.C21066g.m23269a(r12, r11)
            if (r11 == 0) goto L_0x034a
            goto L_0x034d
        L_0x034a:
            i91.C21065f.m23262i(r9, r3)
        L_0x034d:
            i91.C21061b.m23248b(r9)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x0380
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r10)
            goto L_0x0380
        L_0x035a:
            i91.f r8 = r0.f59587a
            r8.getClass()
            te3.u1 r9 = i91.C21061b.m23247a()
            te3.t1 r10 = r8.mo32781c(r9)
            boolean r11 = r8.mo32782e(r9)
            if (r11 == 0) goto L_0x0371
            i91.C21065f.m23259a(r9, r3, r1)
            goto L_0x0374
        L_0x0371:
            i91.C21065f.m23262i(r9, r3)
        L_0x0374:
            i91.C21061b.m23248b(r9)
            i91.e r8 = r8.f59588a
            if (r8 == 0) goto L_0x0380
            d91.c r8 = (d91.C20451c) r8
            r8.mo31994c(r3, r10)
        L_0x0380:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j91.C21201c.m23677o(int, java.lang.String, java.lang.String, java.lang.String, int, long):void");
    }

    /* renamed from: a */
    public final C118482z53 mo33177a(Intent intent, Activity activity) {
        C118482z53 z532 = new C118482z53();
        if (intent != null) {
            z532.f354615e = intent.getFlags();
        }
        fh4 fh4 = new fh4();
        z532.f354614d = fh4;
        if (activity == null) {
            return z532;
        }
        fh4.f354001d = activity.getClass().getCanonicalName();
        z532.f354614d.f354002e = activity.hashCode();
        z532.f354614d.f354003f = System.currentTimeMillis();
        return z532;
    }

    /* renamed from: b */
    public final C118419a63 mo33178b(Activity activity, long j) {
        C117878c cVar;
        C118419a63 a632 = new C118419a63();
        fh4 fh4 = new fh4();
        a632.f353901d = fh4;
        fh4.f354001d = activity.getClass().getCanonicalName();
        a632.f353901d.f354002e = activity.hashCode();
        a632.f353901d.f354003f = j;
        C117877b<String, Boolean> n = m23676n(activity);
        if (!((Boolean) n.mo182596a(1)).booleanValue()) {
            cVar = C117882j.m166285d((String) n.mo182596a(0), (Boolean) n.mo182596a(1), Boolean.FALSE);
        } else {
            cVar = C117882j.m166285d((String) n.mo182596a(0), (Boolean) n.mo182596a(1), Boolean.valueOf(C116711b.m164587l(activity.getClass().getCanonicalName())));
        }
        a632.f353904g = (String) cVar.mo182596a(0);
        a632.f353902e = ((Boolean) cVar.mo182596a(1)).booleanValue();
        a632.f353903f = ((Boolean) cVar.mo182596a(2)).booleanValue();
        return a632;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33179c(int r11, te3.fh4 r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.f354001d
            r1 = 0
            r2 = 104(0x68, float:1.46E-43)
            k91.C117394e.m165538d(r0, r1, r2)
            r0 = 101(0x65, float:1.42E-43)
            op3.c r0 = k91.C117394e.m165537c(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.mo182596a(r2)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x0018:
            java.lang.String r0 = r12.f354001d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003d
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            r1 = 1
            java.lang.String r2 = r12.f354001d
            r0[r1] = r2
            java.lang.String r1 = "HABBYGE-MALI.AsyncActivityMonitor"
            java.lang.String r2 = "_onCreateEvent: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r2, r0)
            r4 = 0
            r5 = 0
            java.lang.String r6 = r12.f354001d
            int r7 = r12.f354002e
            long r8 = r12.f354003f
            r3 = r11
            m23677o(r3, r4, r5, r6, r7, r8)
        L_0x003d:
            java.lang.String r11 = r12.f354001d
            int r12 = r12.f354002e
            i91.a r0 = i91.C21060a.CREATE
            i91.c r1 = i91.C21062c.m23249d()
            r1.mo32777h(r11, r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j91.C21201c.mo33179c(int, te3.fh4):void");
    }

    /* renamed from: p */
    public final void mo33180p(String str, boolean z) {
        C21199a.m23657b(1);
        if (z || !C116711b.m164587l(str)) {
            C118467t1 g = C21062c.m23249d().mo32776g();
            String str2 = null;
            if (g != null) {
                str2 = g.f354392d.f354001d;
            }
            C21199a.m23658c(str);
            C21199a.m23659d(str2);
            Log.m105925i("HABBYGE-MALI.AsyncActivityMonitor", "setActivityActionOnFinish: from: %s, to: %s", str, str2);
            return;
        }
        Log.m105924i("HABBYGE-MALI.AsyncActivityMonitor", "_quiteActivity come frome: moveActivityTaskToBack");
    }
}
