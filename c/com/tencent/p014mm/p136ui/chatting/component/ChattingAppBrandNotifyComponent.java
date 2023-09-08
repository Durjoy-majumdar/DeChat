package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashSet;
import java.util.Set;
import kr0.C76626j0;
import p270xi.C91212b;
import zj3.C79360h;
import zj3.C79368l;

@C91212b(exportInterface = C79360h.class)
/* renamed from: com.tencent.mm.ui.chatting.component.ChattingAppBrandNotifyComponent */
public class ChattingAppBrandNotifyComponent extends C73412a implements C79360h {

    /* renamed from: e */
    public long f215496e;

    /* renamed from: f */
    public long f215497f;

    /* renamed from: g */
    public long f215498g;

    /* renamed from: h */
    public int f215499h;

    /* renamed from: i */
    public int f215500i;

    /* renamed from: j */
    public String f215501j;

    /* renamed from: n */
    public Set<Integer> f215502n = new HashSet();

    /* renamed from: o */
    public IListener<AppBrandNotifyMessageStatusChangedEvent> f215503o = new IListener<AppBrandNotifyMessageStatusChangedEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1390647424;
        }

        public boolean callback(IEvent iEvent) {
            AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent = (AppBrandNotifyMessageStatusChangedEvent) iEvent;
            C67391b bVar = ChattingAppBrandNotifyComponent.this.f215752d;
            if (bVar == null) {
                return true;
            }
            bVar.mo91565f().runOnUiThread(new C73654y(this));
            return true;
        }
    };

    /* renamed from: A0 */
    public void mo102169A0() {
        if (mo102171Z5()) {
            mo102170Y5(10, 0, 0, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null);
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        if (mo102171Z5()) {
            this.f215497f = Util.currentTicks();
            this.f215503o.alive();
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (mo102171Z5()) {
            this.f215498g += Util.ticksToNow(this.f215497f) / 1000;
            this.f215503o.dead();
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        int i;
        int i2;
        C72963f4 item;
        if (mo102171Z5()) {
            Class cls = C79368l.class;
            if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Vx0("appbrand_notify_message") >= 2 && (item = ((C79368l) this.f215752d.f193278b.mo102812a(cls)).getItem(0)) != null && item.mo108769t2() == 2) {
                ((C79368l) this.f215752d.f193278b.mo102812a(cls)).mo108201i0(1);
            }
            C76626j0 j0Var = (C76626j0) C86312j.m106911c(C76626j0.class);
            if (j0Var != null) {
                this.f215501j = j0Var.hk0();
                C76626j0.C76627a bv = j0Var.mo56477bv();
                int i3 = bv.f224254b;
                i = bv.f224253a;
                i2 = i3;
            } else {
                i2 = 0;
                i = 0;
            }
            mo102170Y5(1, 0, 0, (String) null, 0, i2, Util.currentTicks(), i, (String) null, (String) null, (String) null);
        }
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        if (mo102171Z5()) {
            this.f215499h = Math.max(this.f215499h, i3 - i);
        }
    }

    /* renamed from: Y5 */
    public final void mo102170Y5(int i, long j, int i2, String str, int i3, int i4, long j2, int i5, String str2, String str3, String str4) {
        Log.m105919d("MicroMsg.ChattingAppBrandNotifyReportComponent", "report notify operate, eventId:%d, stayDuration:%d, opCount:%d, LastMsgContent:%s, readCount:%d, unreadCount:%d, timeStamp:%d, indexInSessionList:%d, appId:%s, pagePath:%s, label:%s", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j2), Integer.valueOf(i5), str2, str3, str4);
        C115669n.INSTANCE.mo160131h(19724, 1, Integer.valueOf(i), Long.valueOf(j), 0, Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2, str3, str4, null, 0, null, null, 0, null, null, this.f215501j);
    }

    /* renamed from: Z5 */
    public final boolean mo102171Z5() {
        if (Util.isNullOrNil(this.f215752d.mo91577r())) {
            return false;
        }
        return C72996z1.m85806K4(this.f215752d.mo91577r());
    }

    /* renamed from: a6 */
    public final void mo102172a6(String str, String str2) {
        C115669n.INSTANCE.mo160131h(19724, 2, 0, 0, 0, 0, null, 0, 0, 0, null, null, null, null, 0, null, null, 0, str2, str, this.f215501j);
    }

    /* renamed from: e */
    public void mo70065e() {
        if (mo102171Z5()) {
            this.f215500i = C86709a0.m107523b().mo121110g();
            this.f215497f = Util.currentTicks();
            this.f215496e = System.currentTimeMillis();
            this.f215498g = 0;
            this.f215499h = 0;
            ((HashSet) this.f215502n).clear();
        }
    }

    /* renamed from: k5 */
    public void mo102173k5(int i) {
        if (mo102171Z5()) {
            ((HashSet) this.f215502n).add(Integer.valueOf(Math.max(0, i)));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d3 A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0152 A[SYNTHETIC] */
    /* renamed from: n2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26199n2() {
        /*
            r20 = this;
            r15 = r20
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            boolean r1 = r20.mo102171Z5()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            long r1 = r15.f215498g
            long r3 = r15.f215497f
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            long r3 = r3 + r1
            r15.f215498g = r3
            r2 = 8
            java.util.Set<java.lang.Integer> r1 = r15.f215502n
            java.util.HashSet r1 = (java.util.HashSet) r1
            int r5 = r1.size()
            k40.a r1 = f40.C86709a0.m107533q(r0)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            java.lang.String r14 = "appbrand_notify_message"
            com.tencent.mm.storage.f4 r1 = r1.Ex0(r14)
            java.lang.String r1 = r1.getContent()
            v90.a r1 = v90.C78373a.m94636a(r1)
            java.lang.String r1 = r1.f229651a
            java.lang.String r6 = v90.C78373a.m94637b(r1)
            int r7 = r15.f215499h
            r8 = 0
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r1 = r20
            r15 = r14
            r14 = r16
            r1.mo102170Y5(r2, r3, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            k40.a r1 = f40.C86709a0.m107533q(r0)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = -1
            android.database.Cursor r1 = r1.mo101073LL(r15, r2, r4)
            r5 = 2
            java.lang.String r6 = "[buildShowReportParams] cursor is null!"
            java.lang.String r7 = "MicroMsg.ChattingAppBrandNotifyReportComponent"
            r8 = 0
            r9 = 1
            if (r1 != 0) goto L_0x007d
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)
            r13 = r20
            goto L_0x015f
        L_0x007d:
            r10 = 1
        L_0x007e:
            boolean r11 = r1.moveToNext()     // Catch:{ all -> 0x024c }
            if (r11 == 0) goto L_0x015a
            com.tencent.mm.storage.f4 r11 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x024c }
            r11.<init>()     // Catch:{ all -> 0x024c }
            r11.convertFrom(r1)     // Catch:{ all -> 0x024c }
            java.lang.String r12 = r11.getContent()     // Catch:{ all -> 0x024c }
            v90.a r12 = v90.C78373a.m94636a(r12)     // Catch:{ all -> 0x024c }
            int r13 = r11.mo108769t2()     // Catch:{ all -> 0x024c }
            if (r13 == r5) goto L_0x014e
            r13 = r20
            long r4 = r13.f215496e     // Catch:{ all -> 0x014b }
            java.lang.String r14 = r11.f230735S     // Catch:{ all -> 0x014b }
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r14)     // Catch:{ all -> 0x014b }
            int r14 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x00bd
            long r4 = r13.f215496e     // Catch:{ all -> 0x014b }
            java.lang.String r14 = r11.f230735S     // Catch:{ all -> 0x014b }
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r14)     // Catch:{ all -> 0x014b }
            long r4 = r4 - r18
            r18 = 60000(0xea60, double:2.9644E-319)
            int r14 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            r18 = r3
            goto L_0x00cb
        L_0x00bd:
            java.lang.String r4 = r11.f230735S     // Catch:{ all -> 0x014b }
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r4)     // Catch:{ all -> 0x014b }
            r18 = r3
            long r2 = r13.f215496e     // Catch:{ all -> 0x014b }
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x0152
        L_0x00cb:
            long r2 = r13.f215498g     // Catch:{ all -> 0x014b }
            r4 = 3
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 < 0) goto L_0x0152
            java.lang.String r2 = "report in time event, msgId:%s"
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x014b }
            java.lang.String r4 = r12.f229653c     // Catch:{ all -> 0x014b }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x014b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r3)     // Catch:{ all -> 0x014b }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x014b }
            r3 = 19724(0x4d0c, float:2.7639E-41)
            r4 = 20
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x014b }
            r5 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x014b }
            r11 = 0
            r4[r11] = r14     // Catch:{ all -> 0x014b }
            r4[r9] = r18     // Catch:{ all -> 0x014b }
            r14 = 2
            r4[r14] = r18     // Catch:{ all -> 0x014b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x014b }
            r17 = 3
            r4[r17] = r14     // Catch:{ all -> 0x014b }
            r4[r5] = r18     // Catch:{ all -> 0x014b }
            r5 = 5
            r4[r5] = r8     // Catch:{ all -> 0x014b }
            r5 = 6
            r4[r5] = r18     // Catch:{ all -> 0x014b }
            r5 = 7
            r4[r5] = r18     // Catch:{ all -> 0x014b }
            r5 = 8
            r4[r5] = r18     // Catch:{ all -> 0x014b }
            r5 = 9
            java.lang.String r11 = r12.f229655e     // Catch:{ all -> 0x014b }
            r4[r5] = r11     // Catch:{ all -> 0x014b }
            r5 = 10
            r4[r5] = r8     // Catch:{ all -> 0x014b }
            r5 = 11
            r4[r5] = r8     // Catch:{ all -> 0x014b }
            r5 = 12
            java.lang.String r11 = r12.f229653c     // Catch:{ all -> 0x014b }
            r4[r5] = r11     // Catch:{ all -> 0x014b }
            r5 = 13
            r4[r5] = r18     // Catch:{ all -> 0x014b }
            r5 = 14
            r4[r5] = r8     // Catch:{ all -> 0x014b }
            r5 = 15
            java.lang.String r11 = r12.f229651a     // Catch:{ all -> 0x014b }
            java.lang.String r11 = v90.C78373a.m94637b(r11)     // Catch:{ all -> 0x014b }
            r4[r5] = r11     // Catch:{ all -> 0x014b }
            r5 = 16
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x014b }
            r4[r5] = r11     // Catch:{ all -> 0x014b }
            r5 = 17
            r4[r5] = r8     // Catch:{ all -> 0x014b }
            r5 = 18
            r4[r5] = r8     // Catch:{ all -> 0x014b }
            r5 = 19
            java.lang.String r11 = r13.f215501j     // Catch:{ all -> 0x014b }
            r4[r5] = r11     // Catch:{ all -> 0x014b }
            r2.mo160131h(r3, r4)     // Catch:{ all -> 0x014b }
            goto L_0x0152
        L_0x014b:
            r0 = move-exception
            goto L_0x024f
        L_0x014e:
            r13 = r20
            r18 = r3
        L_0x0152:
            int r10 = r10 + 1
            r3 = r18
            r2 = 0
            r5 = 2
            goto L_0x007e
        L_0x015a:
            r13 = r20
            r1.close()
        L_0x015f:
            int r1 = r13.f215500i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            int r2 = r13.f215499h
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r3 = 0
            android.database.Cursor r2 = r0.mo101073LL(r15, r3, r2)
            if (r2 != 0) goto L_0x0196
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)
            goto L_0x0230
        L_0x0196:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 0
            r5 = 0
        L_0x019d:
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x0247 }
            if (r4 == 0) goto L_0x0200
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x0247 }
            r4.<init>()     // Catch:{ all -> 0x0247 }
            r4.convertFrom(r2)     // Catch:{ all -> 0x0247 }
            java.lang.String r6 = r4.getContent()     // Catch:{ all -> 0x0247 }
            v90.a r6 = v90.C78373a.m94636a(r6)     // Catch:{ all -> 0x0247 }
            int r4 = r4.mo108769t2()     // Catch:{ all -> 0x0247 }
            r10 = 2
            if (r4 == r10) goto L_0x019d
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x0247 }
            java.lang.String r10 = "[%s:%s:%d];"
            r12 = 3
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x0247 }
            java.lang.String r15 = r6.f229655e     // Catch:{ all -> 0x0247 }
            r11 = 0
            r14[r11] = r15     // Catch:{ all -> 0x0247 }
            java.lang.String r6 = r6.f229653c     // Catch:{ all -> 0x0247 }
            r14[r9] = r6     // Catch:{ all -> 0x0247 }
            int r3 = r3 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0247 }
            r15 = 2
            r14[r15] = r6     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = java.lang.String.format(r4, r10, r14)     // Catch:{ all -> 0x0247 }
            r0.append(r4)     // Catch:{ all -> 0x0247 }
            int r4 = r0.length()     // Catch:{ all -> 0x0247 }
            r6 = 5000(0x1388, float:7.006E-42)
            if (r4 <= r6) goto L_0x019d
            java.lang.String r4 = "cut off exposed message"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)     // Catch:{ all -> 0x0247 }
            int r4 = r0.length()     // Catch:{ all -> 0x0247 }
            int r4 = r4 - r9
            r0.setLength(r4)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0247 }
            r13.mo102172a6(r1, r4)     // Catch:{ all -> 0x0247 }
            int r4 = r0.length()     // Catch:{ all -> 0x0247 }
            r6 = 0
            r0.delete(r6, r4)     // Catch:{ all -> 0x0247 }
            r5 = 1
            goto L_0x019d
        L_0x0200:
            r2.close()
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0211
            int r2 = r0.length()
            int r2 = r2 - r9
            r0.setLength(r2)
        L_0x0211:
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0225
            java.lang.String r0 = "empty msg show report content, skip report"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0230
        L_0x0225:
            if (r5 == 0) goto L_0x0228
            goto L_0x0229
        L_0x0228:
            r1 = r8
        L_0x0229:
            java.lang.String r0 = r0.toString()
            r13.mo102172a6(r1, r0)
        L_0x0230:
            java.util.Set<java.lang.Integer> r0 = r13.f215502n
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r13.f215501j = r8
            java.lang.Class<kr0.j0> r0 = kr0.C76626j0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.j0 r0 = (kr0.C76626j0) r0
            if (r0 == 0) goto L_0x0246
            r0.clear()
        L_0x0246:
            return
        L_0x0247:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x024c:
            r0 = move-exception
            r13 = r20
        L_0x024f:
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.ChattingAppBrandNotifyComponent.mo26199n2():void");
    }
}
