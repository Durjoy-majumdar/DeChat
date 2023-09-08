package com.tencent.p014mm.plugin.emoji.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2RewardUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C96984r2;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import j20.C117292a;
import j61.C46445t;
import j61.C98905c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C9556a;
import ke3.C88144b;
import ky2.C10432i;
import nj3.C76879j;
import rx3.C13598b0;
import te3.C101824o80;
import u61.C101963g;
import u61.C101966i;
import u61.C14123e;
import w51.C102330b;
import x51.C102554b;
import x51.C102556d;
import x51.C102561f;
import x51.C102562g;

/* renamed from: com.tencent.mm.plugin.emoji.model.e0 */
public class C93108e0 {

    /* renamed from: a */
    public C102554b f268235a;

    /* renamed from: b */
    public boolean f268236b = false;

    /* renamed from: c */
    public Context f268237c = MMApplicationContext.getContext();

    /* renamed from: d */
    public Context f268238d;

    /* renamed from: e */
    public Fragment f268239e;

    /* renamed from: f */
    public int f268240f;

    /* renamed from: g */
    public C93111c f268241g;

    /* renamed from: h */
    public String f268242h;

    /* renamed from: i */
    public C101824o80 f268243i;

    /* renamed from: j */
    public C101966i f268244j = new C101966i(2003);

    /* renamed from: k */
    public EmoticonStoreActionStruct f268245k;

    /* renamed from: l */
    public boolean f268246l = false;

    /* renamed from: com.tencent.mm.plugin.emoji.model.e0$a */
    public class C93109a implements DialogInterface.OnClickListener {
        public C93109a(C93108e0 e0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.model.e0$b */
    public interface C93110b {
        /* renamed from: k5 */
        void mo127623k5(C102330b bVar);
    }

    /* renamed from: com.tencent.mm.plugin.emoji.model.e0$c */
    public interface C93111c {
        /* renamed from: c0 */
        void mo127624c0(String str, String str2, String str3, String str4, String str5);

        /* renamed from: z4 */
        void mo127625z4(boolean z);
    }

    /* renamed from: a */
    public final String mo127618a(int i) {
        return this.f268237c.getString(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: w51.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: w51.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: w51.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: w51.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: w51.b} */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo127619b(int r25, int r26, android.content.Intent r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onActivityResult . requestCode:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "  resultCode:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.emoji.PayOrDownloadComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
            r4 = 0
            if (r3 == 0) goto L_0x0061
            java.lang.String r6 = "key_err_code"
            int r6 = r3.getIntExtra(r6, r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "errCode:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
            java.lang.String r7 = "key_err_msg"
            java.lang.String r7 = r3.getStringExtra(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "errMsg:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r8)
            goto L_0x0064
        L_0x0061:
            java.lang.String r7 = ""
            r6 = 0
        L_0x0064:
            r0.f268236b = r4
            r8 = 2001(0x7d1, float:2.804E-42)
            r9 = -1
            if (r2 == r9) goto L_0x008e
            if (r1 != r8) goto L_0x008d
            boolean r1 = eb0.C75592q0.m90796z()
            if (r1 == 0) goto L_0x0080
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 166(0xa6, double:8.2E-322)
            r5 = 6
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            goto L_0x008d
        L_0x0080:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 166(0xa6, double:8.2E-322)
            r13 = 2
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
        L_0x008d:
            return
        L_0x008e:
            r2 = 1
            if (r1 == r8) goto L_0x0108
            r6 = 2003(0x7d3, float:2.807E-42)
            if (r1 == r6) goto L_0x009d
            java.lang.String r1 = "onActivityResult unknow request"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x02a8
        L_0x009d:
            u61.i r1 = r0.f268244j
            java.lang.String r1 = r1.f300172a
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r5 == 0) goto L_0x00a8
            return
        L_0x00a8:
            u61.i r5 = r0.f268244j
            android.content.Context r6 = r0.f268238d
            android.app.Activity r6 = (android.app.Activity) r6
            r5.getClass()
            if (r3 != 0) goto L_0x00b4
            goto L_0x00f3
        L_0x00b4:
            java.lang.String r7 = "Select_Conv_User"
            java.lang.String r3 = r3.getStringExtra(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r7 == 0) goto L_0x00c9
            java.lang.String r3 = "MicroMsg.emoji.UseSmileyTool"
            java.lang.String r5 = "talker name is invalid so can't go to chat room use."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r5)
            goto L_0x00f3
        L_0x00c9:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "Chat_User"
            r7.putExtra(r8, r3)
            java.lang.String r3 = "smiley_product_id"
            r7.putExtra(r3, r1)
            boolean r3 = r5.f300173b
            if (r3 == 0) goto L_0x00e2
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r3)
        L_0x00e2:
            java.lang.Class<om.f> r3 = p214om.C11502f.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            om.f r3 = (p214om.C11502f) r3
            wc3.z r3 = r3.mo11462yM()
            com.tencent.mm.app.r1 r3 = (com.tencent.p014mm.app.C67654r1) r3
            r3.mo93173f(r7, r6)
        L_0x00f3:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 12069(0x2f25, float:1.6912E-41)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            r6[r2] = r1
            r3.mo160131h(r5, r6)
            goto L_0x02a8
        L_0x0108:
            x51.b r1 = r0.f268235a
            if (r1 == 0) goto L_0x02a8
            x51.d r1 = r1.f301966e
            if (r1 != 0) goto L_0x0112
            goto L_0x02a8
        L_0x0112:
            r8 = 0
            if (r3 == 0) goto L_0x01be
            if (r6 != 0) goto L_0x01be
            java.lang.String r1 = "key_response_product_ids"
            java.util.ArrayList r1 = r3.getStringArrayListExtra(r1)
            java.lang.String r6 = "key_response_series_ids"
            java.util.ArrayList r3 = r3.getStringArrayListExtra(r6)
            int r6 = r1.size()
            r9 = 0
            r10 = 0
        L_0x012b:
            if (r9 >= r6) goto L_0x0196
            java.lang.Object r11 = r1.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r3.get(r9)
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            x51.b r12 = r0.f268235a
            x51.d r12 = r12.f301966e
            com.tencent.mm.storage.r2 r12 = r12.mo142183k(r11)
            java.lang.String r13 = r0.f268242h
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L_0x018b
            te3.o80 r10 = r0.f268243i
            if (r10 == 0) goto L_0x0153
            java.lang.String r10 = r10.f299006s
            r17 = r10
            goto L_0x0155
        L_0x0153:
            r17 = r8
        L_0x0155:
            java.lang.String r15 = r12.f284146a
            r16 = 0
            com.tencent.mm.plugin.emoji.model.e0$c r12 = r0.f268241g
            if (r12 == 0) goto L_0x0161
            r13 = r11
            r12.mo127624c0(r13, r14, r15, r16, r17)
        L_0x0161:
            x51.b r10 = r0.f268235a
            java.lang.String r12 = r0.f268242h
            r10.mo142178q(r12, r4)
            android.content.Context r10 = r0.f268238d
            nj3.C76879j.m92726T(r10, r7)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r4] = r11
            java.lang.String r11 = "doScene ExchangeEmotionPackNetScene productId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r10)
            int r10 = r1.size()
            if (r10 <= r2) goto L_0x0189
            java.lang.String r10 = "some other product verify."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            com.tencent.mm.plugin.emoji.model.e0$c r10 = r0.f268241g
            if (r10 == 0) goto L_0x0189
            r10.mo127625z4(r4)
        L_0x0189:
            r10 = 1
            goto L_0x0193
        L_0x018b:
            x51.b r11 = r0.f268235a
            java.lang.String r12 = r0.f268242h
            r13 = 5
            r11.mo141911r(r12, r13)
        L_0x0193:
            int r9 = r9 + 1
            goto L_0x012b
        L_0x0196:
            if (r10 != 0) goto L_0x019b
            r0.mo127621d(r7)
        L_0x019b:
            boolean r1 = eb0.C75592q0.m90796z()
            if (r1 == 0) goto L_0x01af
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 166(0xa6, double:8.2E-322)
            r5 = 4
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            goto L_0x02a8
        L_0x01af:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 166(0xa6, double:8.2E-322)
            r13 = 0
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            goto L_0x02a8
        L_0x01be:
            if (r3 == 0) goto L_0x0217
            r10 = 100000002(0x5f5e102, float:2.3122344E-35)
            if (r6 != r10) goto L_0x0217
            java.lang.String r3 = r0.f268242h
            com.tencent.mm.storage.r2 r1 = r1.mo142183k(r3)
            te3.o80 r3 = r0.f268243i
            if (r3 == 0) goto L_0x01d1
            java.lang.String r8 = r3.f299006s
        L_0x01d1:
            r14 = r8
            java.lang.String r10 = r0.f268242h
            r11 = 0
            java.lang.String r12 = r1.f284146a
            r13 = 0
            com.tencent.mm.plugin.emoji.model.e0$c r9 = r0.f268241g
            if (r9 == 0) goto L_0x01df
            r9.mo127624c0(r10, r11, r12, r13, r14)
        L_0x01df:
            x51.b r1 = r0.f268235a
            java.lang.String r3 = r0.f268242h
            r1.mo142178q(r3, r4)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = r0.f268242h
            r1[r4] = r2
            java.lang.String r2 = "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            r0.mo127621d(r7)
            boolean r1 = eb0.C75592q0.m90796z()
            if (r1 == 0) goto L_0x0208
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 166(0xa6, double:8.2E-322)
            r5 = 7
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            goto L_0x02a8
        L_0x0208:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 166(0xa6, double:8.2E-322)
            r13 = 3
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            goto L_0x02a8
        L_0x0217:
            if (r3 == 0) goto L_0x0242
            if (r6 != r2) goto L_0x0242
            boolean r1 = eb0.C75592q0.m90796z()
            if (r1 == 0) goto L_0x022e
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 166(0xa6, double:8.2E-322)
            r9 = 6
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
            goto L_0x023b
        L_0x022e:
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 166(0xa6, double:8.2E-322)
            r17 = 2
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
        L_0x023b:
            java.lang.String r1 = "user cancel pay emoji."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x02a8
        L_0x0242:
            java.lang.String r3 = r0.f268242h
            if (r3 == 0) goto L_0x027c
            x51.g r6 = r1.mo142184l(r3)
            if (r6 != 0) goto L_0x024d
            goto L_0x0267
        L_0x024d:
            r6.mo142189b(r9)
            boolean r9 = r1.f301975g
            java.util.HashMap<java.lang.String, com.tencent.mm.storage.r2> r10 = r1.f301973e
            java.lang.Object r10 = r10.get(r3)
            com.tencent.mm.storage.r2 r10 = (com.tencent.p014mm.storage.C96984r2) r10
            java.util.HashMap<java.lang.String, com.tencent.mm.storage.r2> r1 = r1.f301974f
            if (r1 != 0) goto L_0x0260
            r1 = 0
            goto L_0x0264
        L_0x0260:
            boolean r1 = r1.containsKey(r3)
        L_0x0264:
            r6.mo142188a(r9, r10, r1)
        L_0x0267:
            x51.b r1 = r0.f268235a
            java.lang.String r3 = r0.f268242h
            java.util.HashMap<java.lang.String, w51.b> r1 = r1.f301971j
            if (r1 != 0) goto L_0x0270
            goto L_0x0277
        L_0x0270:
            java.lang.Object r1 = r1.get(r3)
            r8 = r1
            w51.b r8 = (w51.C102330b) r8
        L_0x0277:
            if (r8 == 0) goto L_0x027c
            r8.mo141890i()
        L_0x027c:
            r0.mo127621d(r7)
            boolean r1 = eb0.C75592q0.m90796z()
            if (r1 == 0) goto L_0x0292
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 166(0xa6, double:8.2E-322)
            r11 = 5
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            goto L_0x029f
        L_0x0292:
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 166(0xa6, double:8.2E-322)
            r19 = 1
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x029f:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            java.lang.String r2 = "failed pay emoji. errormsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.model.C93108e0.mo127619b(int, int, android.content.Intent):void");
    }

    /* renamed from: c */
    public void mo127620c(C102330b bVar) {
        C102562g gVar;
        C102554b bVar2;
        int i;
        String str;
        C102330b bVar3 = bVar;
        if (bVar3 != null && (gVar = bVar3.f301384d) != null && (bVar2 = this.f268235a) != null && bVar2.f301966e != null) {
            C101824o80 o802 = gVar.f301983b;
            this.f268243i = o802;
            if (o802 != null) {
                String str2 = o802.f298994d;
                String str3 = o802.f298996f;
                String str4 = o802.f299007t;
                String str5 = o802.f299008u;
                int i2 = o802.f299001n;
                int i3 = o802.f298991B;
                int g = bVar.mo141888g();
                C102562g gVar2 = bVar3.f301384d;
                (gVar2 == null ? null : Integer.valueOf(gVar2.f301988g)).intValue();
                C102556d dVar = this.f268235a.f301966e;
                boolean z = dVar.f301975g;
                boolean z2 = bVar3.f301384d.f301989h;
                Object[] objArr = new Object[3];
                objArr[0] = str2;
                objArr[1] = TextUtils.isEmpty(str4) ? "" : str4;
                objArr[2] = Integer.valueOf(g);
                Log.m105925i("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
                this.f268242h = str2;
                if (g == -1) {
                    if (!C102561f.m135422b(o802) && !C102561f.m135425e(o802) && (z || !TextUtils.isEmpty(o802.f298999i))) {
                        if (z) {
                            C96984r2 k = dVar.mo142183k(str2);
                            if (TextUtils.isEmpty(k.f284152g)) {
                                i = k.f284148c;
                            }
                        }
                        i = 4;
                    } else {
                        i = 3;
                    }
                    this.f268235a.mo141911r(str2, i);
                } else if (g != 0) {
                    if (g != 3) {
                        if (g != 4) {
                            if (g != 5) {
                                if (g != 7) {
                                    switch (g) {
                                        case 9:
                                            C86709a0.m107529k().f251779b.mo123460f(new C46445t(str2, 2));
                                            return;
                                        case 10:
                                            switch (dVar.mo142183k(str2).f284149d) {
                                                case 10233:
                                                    str = mo127618a(C0966R.string.c6n);
                                                    break;
                                                case 10234:
                                                    str = mo127618a(C0966R.string.c6b);
                                                    break;
                                                case 10235:
                                                    str = mo127618a(C0966R.string.c_u);
                                                    break;
                                                default:
                                                    str = mo127618a(C0966R.string.c_z);
                                                    break;
                                            }
                                            C76879j.m92748s(this.f268238d, str, (String) null);
                                            return;
                                        case 11:
                                            Log.m105928w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
                                            return;
                                        case 12:
                                            break;
                                        default:
                                            Log.m105928w("MicroMsg.emoji.PayOrDownloadComponent", "[onProductClick] unkonw product status");
                                            return;
                                    }
                                } else if (z2) {
                                    Fragment fragment = this.f268239e;
                                    if (fragment != null) {
                                        this.f268244j.getClass();
                                        Log.m105918d("MicroMsg.emoji.UseSmileyTool", "jacks sendToFriend emoji");
                                        Intent intent = new Intent();
                                        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
                                        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
                                        List<C88144b.C9613e> list = C88144b.f254911a;
                                        String str6 = MMApplicationContext.getSourcePackageName() + ".ui.transmit.SelectConversationUI";
                                        intent.setClassName(MMApplicationContext.getPackageName(), str6);
                                        Iterator it = ((CopyOnWriteArrayList) C88144b.f254911a).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((C88144b.C9613e) it.next()).mo2009d(fragment.getContext(), str6, intent)) {
                                                    break;
                                                }
                                            } else if (fragment instanceof Fragment) {
                                                fragment.startActivityForResult(intent, 2003);
                                                C88144b.m109782a(fragment.getActivity(), ".ui.transmit.SelectConversationUI", intent);
                                            } else {
                                                Log.m105922f("MicroMsg.PluginHelper", "fragment not Fragment, skipped");
                                            }
                                        }
                                        fragment.getActivity().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
                                    } else {
                                        this.f268244j.mo141488a((Activity) this.f268238d);
                                    }
                                    this.f268244j.f300172a = str2;
                                    C115669n.INSTANCE.mo160131h(12069, 1, str2);
                                    return;
                                } else {
                                    C102562g gVar3 = bVar3.f301384d;
                                    if (gVar3.f301991j) {
                                        C101824o80 o803 = gVar3.f301983b;
                                        String str7 = o803.f298994d;
                                        String str8 = o803.f298996f;
                                        if (this.f268238d != null) {
                                            int i4 = this.f268240f == 9 ? 3 : 4;
                                            Intent intent2 = new Intent();
                                            intent2.setClass(this.f268238d, EmojiStoreV2RewardUI.class);
                                            intent2.putExtra("extra_id", str7);
                                            intent2.putExtra("extra_name", str8);
                                            intent2.putExtra("name", (String) null);
                                            intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f268240f);
                                            intent2.putExtra("pageType", i4);
                                            intent2.putExtra("searchID", 0);
                                            Context context = this.f268238d;
                                            C9556a aVar = new C9556a();
                                            aVar.mo10233c(intent2);
                                            Context context2 = context;
                                            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/model/PayOrDownloadComponent", "startRewardUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                            context.startActivity((Intent) aVar.mo10231a(0));
                                            C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/model/PayOrDownloadComponent", "startRewardUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                            C115669n.INSTANCE.mo160131h(12738, str7, Integer.valueOf(i4), Integer.valueOf(this.f268240f), 0);
                                            return;
                                        }
                                        Log.m105924i("MicroMsg.emoji.PayOrDownloadComponent", "start reward ui faild. context is null");
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (this.f268236b) {
                            return;
                        }
                        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
                            C14123e.m13457b(this.f268238d, mo127618a(C0966R.string.ca4), (C32224a<C13598b0>) null);
                            Log.m105925i("MicroMsg.emoji.PayOrDownloadComponent", "Pay Intercept, TeenModeEnable, ProductId:%s, WeCoinNum:%s", str2, Integer.valueOf(i3));
                            return;
                        }
                        if ((i2 & 512) == 512) {
                            if (C14123e.f39524b == -1) {
                                C14123e.f39524b = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EMOJI_STORE_FIRST_CLICK_WECOIN_PAY_BUTTON_INT, 0);
                            }
                            if (C14123e.f39524b == 0) {
                                C14123e.m13458c(true);
                                C14123e.f39523a.mo13541a(this.f268238d).mo140655A();
                                return;
                            }
                            Log.m105925i("MicroMsg.emoji.PayOrDownloadComponent", "onProductClick:productId %s, wecoinNum %s, currency %s", str2, Integer.valueOf(i3), str5);
                            C14123e.m13456a(this.f268238d, str2, str5, i3, str4, str3);
                            C14123e.m13458c(true);
                            this.f268236b = true;
                            C115669n.INSTANCE.mo160131h(12066, 2, Integer.valueOf(this.f268240f), "", str2, 0L, "", Integer.valueOf(EmojiLogic.m117482m(o802.f298993D)), Integer.valueOf(EmojiLogic.m117484o(o802.f298993D)), EmojiLogic.m117483n(o802.f298993D));
                            return;
                        }
                        Intent intent3 = new Intent();
                        intent3.putExtra("key_product_id", str2);
                        Log.m105925i("MicroMsg.emoji.PayOrDownloadComponent", "onProductClick: price %s, currency %s", str4, str5);
                        if (z) {
                            intent3.putExtra("key_currency_type", str5);
                            intent3.putExtra("key_price", str5 + str4);
                        } else {
                            intent3.putExtra("key_currency_type", str5);
                            intent3.putExtra("key_price", str4);
                        }
                        C88144b.m109795m(this.f268238d, "wallet_index", ".ui.WalletIapUI", intent3, 2001);
                        this.f268236b = true;
                        C115669n.INSTANCE.mo160131h(12066, 2, Integer.valueOf(this.f268240f), "", str2, 0L, "", Integer.valueOf(EmojiLogic.m117482m(o802.f298993D)), Integer.valueOf(EmojiLogic.m117484o(o802.f298993D)), EmojiLogic.m117483n(o802.f298993D));
                        return;
                    }
                    if (C101963g.m134218c(o802)) {
                        C98905c.m128727a().mo138241c();
                        return;
                    }
                    String str9 = o802.f298995e;
                    String str10 = o802.f299006s;
                    C93111c cVar = this.f268241g;
                    if (cVar != null) {
                        cVar.mo127624c0(str2, (String) null, str3, str9, str10);
                    }
                    C102554b bVar4 = this.f268235a;
                    if (bVar4 != null) {
                        bVar4.mo142178q(str2, 0);
                    }
                    Log.m105925i("MicroMsg.emoji.PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str2);
                    C115669n.INSTANCE.mo160131h(12066, 0, Integer.valueOf(this.f268240f), "", str2, 0L, "", Integer.valueOf(EmojiLogic.m117482m(o802.f298993D)), Integer.valueOf(EmojiLogic.m117484o(o802.f298993D)), EmojiLogic.m117483n(o802.f298993D));
                    EmoticonStoreActionStruct emoticonStoreActionStruct = this.f268245k;
                    if (emoticonStoreActionStruct != null) {
                        emoticonStoreActionStruct.f265470f = 2;
                        emoticonStoreActionStruct.mo126618x(o802.f298994d);
                        this.f268245k.mo126614t(this.f268246l ? o802.f299013z : o802.f299011x);
                        this.f268245k.mo126613s(String.valueOf(bVar3.f301385e + 1));
                        this.f268245k.mo126615u(String.valueOf(EmojiLogic.m117482m(o802.f298993D)));
                        this.f268245k.mo126617w(String.valueOf(EmojiLogic.m117484o(o802.f298993D)));
                        this.f268245k.mo126616v(EmojiLogic.m117483n(o802.f298993D));
                        this.f268245k.mo86054n();
                    }
                } else {
                    C102554b bVar5 = this.f268235a;
                    if (bVar5 != null) {
                        bVar5.mo141911r(str2, 3);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo127621d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = mo127618a(C0966R.string.c77);
        }
        C76879j.m92749t(this.f268238d, str, "", new C93109a(this));
    }
}
