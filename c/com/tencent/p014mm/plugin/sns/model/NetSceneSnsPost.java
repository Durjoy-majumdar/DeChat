package com.tencent.p014mm.plugin.sns.model;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.events.WebviewReportPublisherIdEvent;
import com.tencent.p014mm.autogen.events.WebviewReportTmplTransferEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.plugin.sns.statistics.C95003w;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C86493v0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import k21.C60960c;
import ns2.C100157a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C100406i0;
import p680ru.C101464l;
import p782zu.C39454b;
import pe3.C89349b;
import sf0.C90188n0;
import tc2.C118418g;
import te3.C101779g1;
import te3.C101789j00;
import te3.C101799k1;
import te3.C101804kv2;
import te3.C101808lv2;
import te3.C101821nv2;
import te3.C101833r5;
import te3.C49025cn;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C64241ar2;
import te3.C64455iv2;
import te3.C64486k83;
import te3.bb4;
import te3.c84;
import te3.d84;
import te3.e84;
import te3.ek4;
import te3.h84;
import te3.i74;
import te3.i84;
import te3.lx4;
import te3.q64;
import te3.za4;
import vr2.C102236a0;
import z72.C102978c;

/* renamed from: com.tencent.mm.plugin.sns.model.NetSceneSnsPost */
public class NetSceneSnsPost extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f274718d;

    /* renamed from: e */
    public TimeLineObject f274719e;

    /* renamed from: f */
    public TimeLineObject f274720f;

    /* renamed from: g */
    public int f274721g;

    /* renamed from: h */
    public long f274722h = 0;

    /* renamed from: i */
    public C11385n f274723i;

    /* renamed from: j */
    public boolean f274724j = false;

    /* renamed from: n */
    public int f274725n = 0;

    /* renamed from: o */
    public WebviewReportPublisherIdEvent f274726o;

    /* renamed from: p */
    public WebviewReportTmplTransferEvent f274727p;

    /* renamed from: q */
    public int f274728q;

    /* renamed from: r */
    public HashMap<Integer, Integer> f274729r = new HashMap<>();

    /* renamed from: s */
    public int f274730s = 0;

    /* renamed from: t */
    public String f274731t = "";

    /* renamed from: u */
    public HashMap<String, C101804kv2> f274732u = new HashMap<>();

    /* renamed from: v */
    public HashMap<String, Integer> f274733v = new HashMap<>();

    /* renamed from: w */
    public HashMap<Integer, Integer> f274734w = new HashMap<>();

    /* renamed from: x */
    public String f274735x = "";

    /* renamed from: y */
    public IListener f274736y;

    /* renamed from: z */
    public IListener f274737z;

    public NetSceneSnsPost(String str, int i, int i2, List<String> list, TimeLineObject timeLineObject, int i3, String str2, int i4, LinkedList<Long> linkedList, int i5, C101808lv2 lv22, boolean z, LinkedList<C51163rv3> linkedList2, c84 c84, C89349b bVar, String str3, int i6, String str4) {
        String str5;
        int i7;
        int i8;
        char c;
        int i9;
        int i15;
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList3;
        LinkedList<C64241ar2> linkedList4;
        String str6;
        C101799k1 k1Var;
        C101779g1 g1Var;
        C101833r5 r5Var;
        C101779g1 g1Var2;
        int i16 = i;
        TimeLineObject timeLineObject2 = timeLineObject;
        String str7 = str2;
        int i17 = i5;
        C101808lv2 lv23 = lv22;
        LinkedList<C51163rv3> linkedList5 = linkedList2;
        c84 c842 = c84;
        C89349b bVar2 = bVar;
        String str8 = str4;
        C40008f fVar = C40008f.f107254d;
        this.f274736y = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
            {
                this.__eventId = 812146647;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x00d8  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x00eb  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x014f  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x015d  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0167  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0169  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r20) {
                /*
                    r19 = this;
                    r1 = r19
                    java.lang.String r2 = "callback"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                    r4 = r20
                    com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent r4 = (com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent) r4
                    java.lang.String r5 = "UTF-8"
                    java.lang.String r6 = ""
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r0 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    java.util.HashMap r0 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.m120143j1(r0)
                    com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r7 = r4.f265015d
                    java.lang.String r7 = r7.f265016a
                    boolean r0 = r0.containsKey(r7)
                    r7 = 1
                    r8 = 0
                    java.lang.String r9 = "MicroMsg.NetSceneSnsPost"
                    if (r0 != 0) goto L_0x003c
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r4 = r4.f265015d
                    java.lang.String r4 = r4.f265016a
                    r0[r8] = r4
                    java.lang.String r4 = "recog succ, but not found %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r4, r0)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    r5 = 0
                    goto L_0x0170
                L_0x003c:
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r0 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    java.util.HashMap r0 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.m120143j1(r0)
                    com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r10 = r4.f265015d
                    java.lang.String r10 = r10.f265016a
                    java.lang.Object r0 = r0.remove(r10)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r10 = r0.intValue()
                    com.tencent.mm.pluginsdk.ui.tools.n1 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1.f283849a     // Catch:{ UnsupportedEncodingException -> 0x005d }
                    java.lang.String r11 = r0.mo135195d(r4)     // Catch:{ UnsupportedEncodingException -> 0x005d }
                    java.lang.String r0 = java.net.URLEncoder.encode(r11, r5)     // Catch:{ UnsupportedEncodingException -> 0x005b }
                    goto L_0x0065
                L_0x005b:
                    r0 = move-exception
                    goto L_0x005f
                L_0x005d:
                    r0 = move-exception
                    r11 = r6
                L_0x005f:
                    java.lang.Object[] r12 = new java.lang.Object[r8]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r6, r12)
                    r0 = r6
                L_0x0065:
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r13 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    java.lang.String r14 = "access$100"
                    java.lang.String r15 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
                    int r13 = r13.f274730s
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
                    if (r13 == 0) goto L_0x00d8
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r13 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    java.lang.String r14 = "access$200"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
                    java.util.HashMap<java.lang.String, te3.kv2> r13 = r13.f274732u
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
                    com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r14 = r4.f265015d
                    java.lang.String r14 = r14.f265016a
                    java.lang.Object r13 = r13.get(r14)
                    te3.kv2 r13 = (te3.C101804kv2) r13
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r14 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    r12 = 5
                    java.lang.Object[] r12 = new java.lang.Object[r12]
                    java.lang.Integer r18 = java.lang.Integer.valueOf(r10)
                    r12[r8] = r18
                    r12[r7] = r0
                    java.lang.String r8 = r13.f298673F
                    r17 = 2
                    r12[r17] = r8
                    java.lang.String r8 = r13.f298692g
                    r16 = 3
                    r12[r16] = r8
                    r8 = 4
                    com.tencent.mm.pluginsdk.ui.tools.n1 r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1.f283849a
                    int r7 = r7.mo135193b(r4)
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    r12[r8] = r7
                    java.lang.String r7 = "position=%d&qrUrl=%s&md5=%s&imgUrl=%s&codeType=%d|"
                    java.lang.String r7 = java.lang.String.format(r7, r12)
                    java.lang.String r8 = "access$384"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r15)
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    r20 = r13
                    java.lang.String r13 = r14.f274731t
                    r12.append(r13)
                    r12.append(r7)
                    java.lang.String r7 = r12.toString()
                    r14.f274731t = r7
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r15)
                    r12 = r20
                    goto L_0x00db
                L_0x00d8:
                    r16 = 3
                    r12 = 0
                L_0x00db:
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r7 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    java.lang.String r8 = "access$400"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r15)
                    int r7 = r7.f274728q
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r15)
                    r8 = 12
                    if (r7 != r8) goto L_0x014f
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "2,3,,"
                    r7.append(r8)
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    if (r10 != 0) goto L_0x0135
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    r0.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    java.lang.String r8 = ","
                    r0.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r8 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    java.lang.String r13 = "access$500"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    java.lang.String r8 = r8.f274735x     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    java.lang.String r5 = java.net.URLEncoder.encode(r8, r5)     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    r0.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    java.lang.String r7 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0126 }
                    r5 = 1
                    r8 = 2
                    r13 = 0
                    goto L_0x0138
                L_0x0126:
                    r0 = move-exception
                    r5 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r5]
                    java.lang.String r0 = r0.getMessage()
                    r13 = 0
                    r8[r13] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r6, r8)
                    goto L_0x0137
                L_0x0135:
                    r5 = 1
                    r13 = 0
                L_0x0137:
                    r8 = 2
                L_0x0138:
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
                    r0[r13] = r14
                    r0[r5] = r7
                    java.lang.String r5 = "androidSystemShareFixed(13717) fileToIndex:%d,  %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r0)
                    com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r5 = 13717(0x3595, float:1.9222E-41)
                    r0.kvStat(r5, r7)
                    goto L_0x0150
                L_0x014f:
                    r8 = 2
                L_0x0150:
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r0 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.m120144k1(r0)
                    com.tencent.mm.plugin.sns.model.NetSceneSnsPost r0 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.this
                    com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r4 = r4.f265015d
                    java.lang.String r4 = r4.f265016a
                    if (r12 == 0) goto L_0x015f
                    java.lang.String r6 = r12.f298707y
                L_0x015f:
                    r5 = 0
                    int r7 = com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.m120145l1(r0, r10, r5)
                    r9 = 1
                    if (r7 != r9) goto L_0x0169
                    r14 = 3
                    goto L_0x016a
                L_0x0169:
                    r14 = 2
                L_0x016a:
                    com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.m120146m1(r0, r4, r11, r6, r14)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                L_0x0170:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.C948312.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f274737z = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
            {
                this.__eventId = 1700407223;
            }

            public boolean callback(IEvent iEvent) {
                C101804kv2 kv22;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$3");
                RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$3");
                if (!NetSceneSnsPost.m120143j1(NetSceneSnsPost.this).containsKey(recogQBarOfImageFileFailedEvent.f107738d.f107739a)) {
                    Log.m105921e("MicroMsg.NetSceneSnsPost", "recog succ, but not found %s", recogQBarOfImageFileFailedEvent.f107738d.f107739a);
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$3");
                } else {
                    Integer num = (Integer) NetSceneSnsPost.m120143j1(NetSceneSnsPost.this).remove(recogQBarOfImageFileFailedEvent.f107738d.f107739a);
                    if (num == null) {
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$3");
                    } else {
                        int intValue = num.intValue();
                        NetSceneSnsPost netSceneSnsPost = NetSceneSnsPost.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                        int i = netSceneSnsPost.f274728q;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                        String str = "";
                        int i2 = 2;
                        if (i == 12) {
                            String str2 = "2,3,,";
                            if (intValue == 0) {
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append(",");
                                    NetSceneSnsPost netSceneSnsPost2 = NetSceneSnsPost.this;
                                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                                    String str3 = netSceneSnsPost2.f274735x;
                                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                                    sb.append(URLEncoder.encode(str3, "UTF-8"));
                                    str2 = sb.toString();
                                } catch (UnsupportedEncodingException e) {
                                    Log.m105921e("MicroMsg.NetSceneSnsPost", str, e.getMessage());
                                }
                            }
                            Log.m105925i("MicroMsg.NetSceneSnsPost", "androidSystemShareFixed(13717) fileToIndex:%d,  %s", Integer.valueOf(intValue), str2);
                            C115669n.INSTANCE.kvStat(13717, str2);
                        }
                        NetSceneSnsPost.m120144k1(NetSceneSnsPost.this);
                        NetSceneSnsPost netSceneSnsPost3 = NetSceneSnsPost.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                        int i3 = netSceneSnsPost3.f274730s;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                        if (i3 != 0) {
                            NetSceneSnsPost netSceneSnsPost4 = NetSceneSnsPost.this;
                            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                            HashMap<String, C101804kv2> hashMap = netSceneSnsPost4.f274732u;
                            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                            kv22 = hashMap.get(recogQBarOfImageFileFailedEvent.f107738d.f107739a);
                        } else {
                            kv22 = null;
                        }
                        NetSceneSnsPost netSceneSnsPost5 = NetSceneSnsPost.this;
                        String str4 = recogQBarOfImageFileFailedEvent.f107738d.f107739a;
                        if (kv22 != null) {
                            str = kv22.f298707y;
                        }
                        if (NetSceneSnsPost.m120145l1(netSceneSnsPost5, intValue, 0) == 1) {
                            i2 = 3;
                        }
                        NetSceneSnsPost.m120146m1(netSceneSnsPost5, str4, (String) null, str, i2);
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$3");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$3");
                return false;
            }
        };
        this.f274719e = timeLineObject2;
        this.f274721g = i3;
        this.f274728q = i17;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = new d84();
        bVar3.f127067b = new e84();
        bVar3.f127068c = "/cgi-bin/micromsg-bin/mmsnspost";
        bVar3.f127069d = 209;
        bVar3.f127070e = 97;
        bVar3.f127071f = 1000000097;
        C47350c a = bVar3.mo72403a();
        this.f274718d = a;
        d84 d84 = (d84) a.f127055a.f127080a;
        C57354l.f164333a.mo80971h(String.valueOf(i3), new NetSceneSnsPost$$a());
        C101799k1 k1Var2 = timeLineObject2.actionInfo;
        if (!(k1Var2 == null || (g1Var2 = k1Var2.f298580j) == null || TextUtils.isEmpty(g1Var2.f298273f))) {
            C49025cn cnVar = new C49025cn();
            cnVar.f131833d = timeLineObject2.actionInfo.f298580j.f298273f;
            d84.f298087B = cnVar;
        }
        C86493v0.C86495c e = C86493v0.m107224d().mo120948e(lv23.f298727A);
        if (e != null) {
            WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = new WebviewReportPublisherIdEvent();
            this.f274726o = webviewReportPublisherIdEvent;
            webviewReportPublisherIdEvent.f265259d.f265260a = e.mo120959f("prePublishId", "");
            this.f274726o.f265259d.f265264e = e.mo120959f("url", "");
            this.f274726o.f265259d.f265262c = e.mo120959f("preUsername", "");
            this.f274726o.f265259d.f265263d = e.mo120959f("preChatName", "");
            this.f274726o.f265259d.f265265f = e.mo120958e("preMsgIndex", 0);
            this.f274726o.f265259d.f265269j = e.mo120958e("sendAppMsgScene", 0);
            this.f274726o.f265259d.f265270k = e.mo120958e("getA8KeyScene", 0);
            this.f274726o.f265259d.f265271l = e.mo120959f("referUrl", (String) null);
            this.f274726o.f265259d.f265272m = e.mo120959f("adExtStr", (String) null);
            this.f274726o.f265259d.f265273n = str3;
            if (e.mo120954a("_tmpl_webview_transfer_scene")) {
                WebviewReportTmplTransferEvent webviewReportTmplTransferEvent = new WebviewReportTmplTransferEvent();
                this.f274727p = webviewReportTmplTransferEvent;
                webviewReportTmplTransferEvent.f79068d.f79069a = e.mo120958e("_tmpl_webview_transfer_scene", -1);
            }
            if (timeLineObject2.statExtStr != null) {
                bb4 bb4 = new bb4();
                try {
                    bb4.parseFrom(Base64.decode(timeLineObject2.statExtStr, 0));
                    za4 za4 = bb4.f226994f;
                    if (za4 != null) {
                        str6 = za4.f186651d;
                        if (Util.isNullOrNil(str6) && (r5Var = timeLineObject2.AppInfo) != null) {
                            str6 = r5Var.f299236d;
                        }
                        if (!(!Util.isNullOrNil(str6) || (k1Var = timeLineObject2.actionInfo) == null || (g1Var = k1Var.f298580j) == null)) {
                            str6 = g1Var.f298271d;
                        }
                        Locale locale = Locale.US;
                        WebviewReportPublisherIdEvent.C92611a aVar = this.f274726o.f265259d;
                        str5 = "";
                        String str9 = aVar.f265262c;
                        String str10 = aVar.f265263d;
                        d84.f298086A = String.format(locale, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[]{aVar.f265260a, str9, str10, Integer.valueOf(C45629t0.m50815b(str9, str10)), Integer.valueOf(this.f274726o.f265259d.f265270k), str6});
                    }
                } catch (Exception unused) {
                }
            }
            str6 = "";
            str6 = r5Var.f299236d;
            str6 = g1Var.f298271d;
            Locale locale2 = Locale.US;
            WebviewReportPublisherIdEvent.C92611a aVar2 = this.f274726o.f265259d;
            str5 = "";
            String str92 = aVar2.f265262c;
            String str102 = aVar2.f265263d;
            d84.f298086A = String.format(locale2, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[]{aVar2.f265260a, str92, str102, Integer.valueOf(C45629t0.m50815b(str92, str102)), Integer.valueOf(this.f274726o.f265259d.f265270k), str6});
        } else {
            str5 = "";
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(str.getBytes());
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(str.length());
        objArr[1] = Integer.valueOf(qv32.f140572d);
        objArr[2] = Integer.valueOf(bVar2 == null ? 0 : bVar2.f257327a.length);
        Log.m105925i("MicroMsg.NetSceneSnsPost", "NetSceneSnsPost, contentLength:%s, skbLength:%s, ctx.len:%s", objArr);
        d84.f298102d = qv32;
        d84.f298105g = i16;
        d84.f298106h = i2;
        d84.f298107i = str7;
        this.f274725n = i16;
        if (C90188n0.f258935c) {
            d84.f298102d = new C51018qv3();
            Log.m105920e("MicroMsg.NetSceneSnsPost", "post error setObjectDesc is null!");
        }
        LinkedList<C51163rv3> linkedList6 = new LinkedList<>();
        if (list != null && list.size() > 0) {
            String str11 = str5;
            for (String next : list) {
                C51163rv3 rv32 = new C51163rv3();
                rv32.mo73357f(next);
                linkedList6.add(rv32);
                str11 = str11 + "; + " + next;
                int i18 = i;
            }
            Log.m105924i("MicroMsg.NetSceneSnsPost", "post with list : " + str11);
        }
        d84.f298104f = linkedList6;
        d84.f298103e = linkedList6.size();
        if (C94847c1.m120213a()) {
            d84.f298095J = linkedList6;
            d84.f298094I = linkedList6.size();
        }
        d84.f298108j = i4;
        LinkedList<Integer> linkedList7 = lv23.f298740N;
        if (linkedList7 == null || linkedList7.size() <= 0) {
            LinkedList<Integer> linkedList8 = lv23.f298742Q;
            if (linkedList8 != null && linkedList8.size() > 0) {
                d84.f298100P = lv23.f298742Q.size();
                d84.f298101Q.addAll(lv23.f298742Q);
            }
        } else {
            d84.f298098M = lv23.f298740N.size();
            d84.f298099N.addAll(lv23.f298740N);
        }
        Object[] objArr2 = new Object[6];
        objArr2[0] = Integer.valueOf(i5);
        objArr2[1] = str7;
        objArr2[2] = d84.f298086A;
        q64 q64 = lv23.f298734H;
        objArr2[3] = Integer.valueOf(q64 != null ? q64.f184979i : 0);
        objArr2[4] = Integer.valueOf(i6);
        objArr2[5] = str8;
        Log.m105925i("MicroMsg.NetSceneSnsPost", "setObjectSource: %d, clientid:%s fromScene:%s, score:%d, sdkTokenValid:%s, sdkPkgName:%s", objArr2);
        if (linkedList5 != null && linkedList2.size() > 0) {
            if (z) {
                d84.f298114s = linkedList5;
                d84.f298113r = linkedList2.size();
            } else {
                d84.f298117v = linkedList5;
                d84.f298116u = linkedList2.size();
            }
        }
        Log.m105918d("MicroMsg.NetSceneSnsPost", "setObjectSource " + i17);
        d84.f298111p = i17;
        ek4 ek4 = new ek4();
        if (!Util.isNullOrNil(lv23.f298756t)) {
            ek4.f182993d = lv23.f298756t;
            ek4.f182994e = lv23.f298757u;
            d84.f298115t = ek4;
        }
        if (linkedList != null && !linkedList.isEmpty()) {
            d84.f298109n = linkedList.size();
            Iterator<Long> it = linkedList.iterator();
            while (it.hasNext()) {
                i74 i74 = new i74();
                i74.f135157d = it.next().longValue();
                d84.f298110o.add(i74);
            }
            Log.m105918d("MicroMsg.NetSceneSnsPost", "tagid " + linkedList.size() + " " + d84.f298110o.toString());
        }
        d84.f298119x = c842;
        if (!Util.isNullOrNil(lv23.f298728B)) {
            d84.f298120y = new h84();
        }
        if (c842 != null) {
            Log.m105919d("MicroMsg.NetSceneSnsPost", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", c842.f298001d, c842.f298002e, c842.f298003f);
        }
        if (bVar2 != null) {
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73349j(bVar2);
            d84.f298121z = qv33;
        }
        d84.f298090E = lv23.f298734H;
        SnsInfo LL = C94866e1.Yx0().mo139800LL(mo130938n1());
        if (LL != null && ((LL.getTypeFlag() == 1 || LL.getTypeFlag() == 15) && (j002 = timeLineObject2.ContentObj) != null && (linkedList3 = j002.f298427h) != null && linkedList3.size() > 0 && (linkedList4 = lv23.f298747h) != null && linkedList4.size() == timeLineObject2.ContentObj.f298427h.size())) {
            String YO = C94866e1.m120262YO();
            Iterator<C101804kv2> it4 = timeLineObject2.ContentObj.f298427h.iterator();
            int i19 = 0;
            while (it4.hasNext()) {
                C101804kv2 next2 = it4.next();
                int i25 = next2.f298690e;
                if (i25 == 2 || i25 == 6) {
                    C64455iv2 iv22 = new C64455iv2();
                    int i26 = next2.f298690e;
                    iv22.f183741e = i26 == 2 ? 2 : 1;
                    if (i26 == 6) {
                        C94554a c2 = C94555d.m119567c(C94938q1.m120518e(YO, next2.f298689d) + C102236a0.m134735b0(next2), true);
                        if (c2 != null) {
                            iv22.f183742f = (int) Math.round(((double) c2.f273443a) / 1000.0d);
                        }
                    }
                    C100406i0 LL2 = C94866e1.ay0().mo139867LL((long) lv23.f298747h.get(i19).f182140d);
                    try {
                        C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(LL2.mo139854h());
                        iv22.f183740d = nv22.f298912C;
                        this.f274729r.put(Integer.valueOf(LL2.mo139849c()), Integer.valueOf(nv22.f298912C));
                    } catch (Exception unused2) {
                    }
                    iv22.f183743g = lv23.f298727A;
                    Log.m105925i("MicroMsg.NetSceneSnsPost", "post add mediaInfo, Source: %s, videoPlayLength: %s, MediaType: %s, SessionId: %s", Integer.valueOf(iv22.f183740d), Integer.valueOf(iv22.f183742f), Integer.valueOf(iv22.f183741e), iv22.f183743g);
                    d84.f298089D.add(iv22);
                }
                i19++;
            }
            int size = d84.f298089D.size();
            d84.f298088C = size;
            Log.m105925i("MicroMsg.NetSceneSnsPost", "post mediaCount: %s", Integer.valueOf(size));
        }
        C118418g gVar = C118418g.INSTANCE;
        if (gVar.An0("ie_sns_upload")) {
            gVar.mo175826kl("ie_sns_upload");
        }
        try {
            lx4 lx4 = new lx4();
            C51018qv3 qv34 = new C51018qv3();
            qv34.mo73350k(gVar.vu0("ie_sns_upload"));
            lx4.f354115d = qv34;
            Log.m105919d("MicroMsg.NetSceneSnsPost", "[debug] wcstf set on snspost, len: %s", Integer.valueOf(qv34.f140572d));
            C51018qv3 qv35 = new C51018qv3();
            qv35.mo73350k(gVar.bw0("ce_sns_upload"));
            lx4.f354116e = qv35;
            Log.m105919d("MicroMsg.NetSceneSnsPost", "[debug] wcste set on snspost, len: %s", Integer.valueOf(qv35.f140572d));
            C51018qv3 qv36 = new C51018qv3();
            qv36.mo73350k(gVar.mo175821hd());
            lx4.f354117f = qv36;
            Log.m105919d("MicroMsg.NetSceneSnsPost", "[debug] ccData set on snspost, len: %s", Integer.valueOf(qv36.f140572d));
            C51018qv3 qv37 = new C51018qv3();
            qv37.mo73350k(lx4.toByteArray());
            d84.f298092G = qv37;
        } catch (Throwable unused3) {
        }
        LinkedList<i84> linkedList9 = lv23.f298762z;
        if (linkedList9 != null) {
            Iterator<i84> it5 = linkedList9.iterator();
            int i27 = 0;
            while (it5.hasNext()) {
                this.f274734w.put(Integer.valueOf(i27), Integer.valueOf(it5.next().f298390h));
                i27++;
            }
        }
        C64486k83 k832 = new C64486k83();
        k832.f183896d = i6;
        k832.f183897e = str8;
        d84.f298093H = k832;
        C60960c.f173618a.mo85926j("SnsPublishProcess", "upload_time", Long.valueOf(System.currentTimeMillis()));
        C95003w.C95004a aVar3 = C95003w.f275626a;
        SnsMethodCalculate.markStartTimeMs("startPost", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = System.currentTimeMillis();
        C95003w.C95004a aVar4 = C95003w.f275626a;
        aVar4.f275631e = currentTimeMillis;
        aVar4.f275627a.f266194i = 5;
        C95003w.m120754b(aVar4);
        SnsMethodCalculate.markEndTimeMs("startPost", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        HashMap<Integer, C100157a.C100158a> hashMap = C100157a.f293382a;
        SnsMethodCalculate.markStartTimeMs("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        C100157a.C100158a aVar5 = C100157a.f293382a.get(1);
        SnsMethodCalculate.markEndTimeMs("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        if (aVar5 != null) {
            int i28 = aVar5.f293383a;
            if ((i28 & 4) != 0) {
                i15 = 1;
                c = 0;
                i9 = 4;
            } else if ((i28 & 8) != 0) {
                i15 = 1;
                i9 = 4;
                c = 0;
            } else {
                int i29 = i28 & 16;
                if (i29 == 0 && (i28 & 32) == 0) {
                    i8 = 0;
                    d84.f298096K = C102236a0.m134746h(i8, aVar5.f293384b);
                    SnsMethodCalculate.markStartTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
                    i7 = 1;
                    C100157a.f293382a.remove(1);
                    SnsMethodCalculate.markEndTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
                } else {
                    i8 = i29 != 0 ? 4 : 5;
                    Log.m105925i("MicroMsg.NetSceneSnsPost", "has paste similar change flag, %d", Integer.valueOf(i8));
                    d84.f298096K = C102236a0.m134746h(i8, aVar5.f293384b);
                    SnsMethodCalculate.markStartTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
                    i7 = 1;
                    C100157a.f293382a.remove(1);
                    SnsMethodCalculate.markEndTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
                }
            }
            i8 = (i28 & i9) != 0 ? 2 : 3;
            Object[] objArr3 = new Object[i15];
            objArr3[c] = Integer.valueOf(i8);
            Log.m105925i("MicroMsg.NetSceneSnsPost", "has paste fully flag, %d", objArr3);
            d84.f298096K = C102236a0.m134746h(i8, aVar5.f293384b);
            SnsMethodCalculate.markStartTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
            i7 = 1;
            C100157a.f293382a.remove(1);
            SnsMethodCalculate.markEndTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        } else {
            i7 = 1;
        }
        Object[] objArr4 = new Object[i7];
        String str12 = d84.f298096K;
        objArr4[0] = str12 == null ? str5 : str12;
        Log.m105919d("MicroMsg.NetSceneSnsPost", "snsPost req.ReportData：%s", objArr4);
        Log.m105919d("MicroMsg.NetSceneSnsPost", "doScene request GroupContactTagIdList:[%s], GroupContactTagIdListCount:%d GroupUserCount:%d, privated:%d", Util.intListToString(d84.f298101Q), Integer.valueOf(d84.f298100P), Integer.valueOf(d84.f298116u), Integer.valueOf(i));
    }

    /* renamed from: j1 */
    public static /* synthetic */ HashMap m120143j1(NetSceneSnsPost netSceneSnsPost) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        HashMap<String, Integer> hashMap = netSceneSnsPost.f274733v;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return hashMap;
    }

    /* renamed from: k1 */
    public static void m120144k1(NetSceneSnsPost netSceneSnsPost) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        netSceneSnsPost.getClass();
        SnsMethodCalculate.markStartTimeMs("checkRemoveQRListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        if (netSceneSnsPost.f274733v.isEmpty()) {
            netSceneSnsPost.f274736y.dead();
            netSceneSnsPost.f274737z.dead();
            if (netSceneSnsPost.f274730s != 0 && !Util.isNullOrNil(netSceneSnsPost.f274731t)) {
                TimeLineObject timeLineObject = netSceneSnsPost.f274720f;
                C101833r5 r5Var = timeLineObject.AppInfo;
                String str = r5Var == null ? "" : r5Var.f299236d;
                int size = timeLineObject.ContentObj.f298427h.size();
                Log.m105925i("MicroMsg.NetSceneSnsPost", "report qrCodeImgSns(13627), snsId:%s, size:%d, info:%s, appId:%s", netSceneSnsPost.f274720f.f283893Id, Integer.valueOf(size), netSceneSnsPost.f274731t, str);
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140962S8(13627, String.format(Locale.US, "%s,%d,%s,%s", new Object[]{netSceneSnsPost.f274720f.f283893Id, Integer.valueOf(size), netSceneSnsPost.f274731t, str}));
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkRemoveQRListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
    }

    /* renamed from: l1 */
    public static int m120145l1(NetSceneSnsPost netSceneSnsPost, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        netSceneSnsPost.getClass();
        SnsMethodCalculate.markStartTimeMs("getSourceMap", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        Integer num = netSceneSnsPost.f274734w.get(Integer.valueOf(i));
        if (num == null) {
            SnsMethodCalculate.markEndTimeMs("getSourceMap", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        } else {
            i2 = num.intValue();
            SnsMethodCalculate.markEndTimeMs("getSourceMap", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        }
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return i2;
    }

    /* renamed from: m1 */
    public static void m120146m1(NetSceneSnsPost netSceneSnsPost, String str, String str2, String str3, int i) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        netSceneSnsPost.getClass();
        SnsMethodCalculate.markStartTimeMs("reportMultiMediaInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        C102978c cVar = new C102978c();
        SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        long j = netSceneSnsPost.f274722h;
        SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        cVar.f303882d = j;
        cVar.f303883e = 1;
        cVar.f303884f = i;
        cVar.f303887i = netSceneSnsPost.f274732u.get(str).f298692g;
        cVar.f303890o = str3;
        SnsObject snsObject = ((e84) netSceneSnsPost.f274718d.f127056b.f127083a).f132789d;
        if (snsObject != null) {
            cVar.f303891p = (long) snsObject.CreateTime;
        }
        cVar.f303892q = 0;
        cVar.f303893r = 0;
        cVar.f303900y = str2;
        SnsInfo LL = C94866e1.Yx0().mo139800LL(netSceneSnsPost.mo130938n1());
        if (LL != null) {
            ((C39454b) C86312j.m106911c(C39454b.class)).mo61972Vk(cVar, 3, (long) LL.getCreateTime(), str);
        } else {
            Log.m105920e("MicroMsg.NetSceneSnsPost", "report error");
        }
        SnsMethodCalculate.markEndTimeMs("reportMultiMediaInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        this.f274723i = nVar;
        int dispatch = dispatch(gVar, this.f274718d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return 209;
    }

    /* renamed from: n1 */
    public int mo130938n1() {
        SnsMethodCalculate.markStartTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        int i = this.f274721g;
        SnsMethodCalculate.markEndTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return i;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x09ba  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0a06  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0a28  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0a54  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0a7c  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0a86  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0ab3  */
    public void onGYNetEnd(int r34, int r35, int r36, java.lang.String r37, com.tencent.p014mm.network.C114799u r38, byte[] r39) {
        /*
            r33 = this;
            r1 = r33
            r2 = r35
            r3 = r36
            r4 = r37
            java.lang.Class<iu2.d> r5 = iu2.C98802d.class
            java.lang.Class<i40.c> r6 = i40.C60247c.class
            java.lang.Class<iu2.e> r7 = iu2.C60631e.class
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            java.lang.String r0 = "MicroMsg.NetSceneSnsPost"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "post netId : "
            r8.append(r9)
            r9 = r34
            r8.append(r9)
            java.lang.String r9 = " errType :"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = " errCode: "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " errMsg :"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            r0 = r38
            ob0.c r0 = (ob0.C47350c) r0
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            r8 = r0
            te3.e84 r8 = (te3.e84) r8
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            if (r0 != 0) goto L_0x0059
            r9 = 0
            goto L_0x005b
        L_0x0059:
            long r9 = r0.f283891Id
        L_0x005b:
            java.lang.String r0 = vr2.C102236a0.m134765q0(r9)
            com.tencent.mm.plugin.sns.statistics.w$a r11 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            java.lang.String r11 = "postCallback"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            long r13 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.sns.statistics.w$a r15 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r4 = r15.f275627a
            r39 = r5
            r16 = r6
            long r5 = r15.f275631e
            long r13 = r13 - r5
            r4.f266204s = r13
            java.lang.String r5 = "PostCostTimeMs"
            r4.mo86046c(r5, r13)
            com.tencent.mm.plugin.sns.statistics.w$a r4 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r4 = r4.f275627a
            r4.f266190e = r9
            java.lang.String r5 = "SnsSeverId"
            r6 = 1
            java.lang.String r0 = r4.mo86045b(r5, r0, r6)
            r4.f266191f = r0
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r4 = r0.f275627a
            r9 = 6
            r4.f266194i = r9
            long r9 = (long) r2
            r4.f266198m = r9
            r4.f266199n = r9
            com.tencent.p014mm.plugin.sns.statistics.C95003w.m120754b(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            r0 = 8
            r9 = 4
            r10 = 7
            r11 = 2
            r14 = 0
            if (r2 != r9) goto L_0x0268
            yn2.s0 r9 = yn2.C102882s0.f303681a
            int r9 = r33.mo130938n1()
            java.lang.String r15 = "clearSelectCacheData"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.SnsFinderPostManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "clearSelectCacheData localSnsId:"
            r13.append(r4)
            r13.append(r9)
            java.lang.String r4 = r13.toString()
            java.lang.String r13 = "MicroMsg.SnsFinderPostManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            java.util.HashMap<java.lang.String, yn2.u0> r4 = yn2.C102882s0.f303682b
            long r5 = (long) r9
            java.lang.String r9 = "sns_table_"
            java.lang.String r5 = os2.C100417r0.m131421j(r9, r5)
            r4.remove(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
            java.lang.String r4 = "onErrorServer"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r5 = r1.f274721g
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139800LL(r5)
            te3.lv2 r5 = new te3.lv2     // Catch:{ Exception -> 0x0135 }
            r5.<init>()     // Catch:{ Exception -> 0x0135 }
            byte[] r6 = r4.field_postBuf     // Catch:{ Exception -> 0x0135 }
            pe3.a r5 = r5.parseFrom(r6)     // Catch:{ Exception -> 0x0135 }
            te3.lv2 r5 = (te3.C101808lv2) r5     // Catch:{ Exception -> 0x0135 }
            r5.f298755s = r3     // Catch:{ Exception -> 0x0135 }
            r6 = 2006(0x7d6, float:2.811E-42)
            if (r3 != r6) goto L_0x010c
            te3.w84 r6 = r8.f132791f     // Catch:{ Exception -> 0x0135 }
            java.lang.String r6 = r6.f143924e     // Catch:{ Exception -> 0x0135 }
            r5.f298732F = r6     // Catch:{ Exception -> 0x0135 }
            java.util.LinkedList<te3.rv3> r6 = r8.f132793h     // Catch:{ Exception -> 0x0135 }
            r5.f298736J = r6     // Catch:{ Exception -> 0x0135 }
            goto L_0x0121
        L_0x010c:
            te3.w84 r6 = r8.f132791f     // Catch:{ Exception -> 0x0135 }
            java.lang.String r6 = r6.f143924e     // Catch:{ Exception -> 0x0135 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0135 }
            if (r6 != 0) goto L_0x011d
            te3.w84 r6 = r8.f132791f     // Catch:{ Exception -> 0x0135 }
            java.lang.String r6 = r6.f143924e     // Catch:{ Exception -> 0x0135 }
            r5.f298732F = r6     // Catch:{ Exception -> 0x0135 }
            goto L_0x0121
        L_0x011d:
            java.lang.String r6 = r8.f132790e     // Catch:{ Exception -> 0x0135 }
            r5.f298732F = r6     // Catch:{ Exception -> 0x0135 }
        L_0x0121:
            te3.w84 r6 = r8.f132791f     // Catch:{ Exception -> 0x0135 }
            java.lang.String r8 = r6.f143925f     // Catch:{ Exception -> 0x0135 }
            r5.f298737K = r8     // Catch:{ Exception -> 0x0135 }
            java.lang.String r6 = r6.f143926g     // Catch:{ Exception -> 0x0135 }
            r5.f298738L = r6     // Catch:{ Exception -> 0x0135 }
            r5.f298733G = r14     // Catch:{ Exception -> 0x0135 }
            byte[] r5 = r5.toByteArray()     // Catch:{ Exception -> 0x0135 }
            r4.setPostBuf(r5)     // Catch:{ Exception -> 0x0135 }
            goto L_0x0136
        L_0x0135:
        L_0x0136:
            if (r4 != 0) goto L_0x0142
            java.lang.String r4 = "onErrorServer"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L_0x01cd
        L_0x0142:
            r4.setItemDie()
            int r5 = r4.getTypeFlag()
            if (r5 != r10) goto L_0x014e
            r4.setCoverPostFailed()
        L_0x014e:
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r6 = r1.f274721g
            r5.Rv0(r6, r4)
            com.tencent.mm.plugin.sns.model.b1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r6 = r1.f274721g
            r5.mo130964w(r6)
            java.lang.String r5 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r6 = "onErrorServer, publish SnsPostFailEvent, snsInfo LocalId=%s, type=%d"
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r9 = r4.getLocalid()
            r8[r14] = r9
            int r4 = r4.getTypeFlag()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 1
            r8[r9] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
            com.tencent.mm.autogen.events.SnsPostFailEvent r4 = new com.tencent.mm.autogen.events.SnsPostFailEvent
            r4.<init>()
            com.tencent.mm.autogen.events.SnsPostFailEvent$a r5 = r4.f78997d
            int r6 = r1.f274721g
            long r8 = (long) r6
            r5.f78998a = r8
            r4.publish()
            byte[] r4 = i40.C60247c.f171776h
            monitor-enter(r4)
            f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0265 }
            r5.mo121108c()     // Catch:{ all -> 0x0265 }
            r5 = r16
            boolean r5 = r5.isAssignableFrom(r7)     // Catch:{ all -> 0x0265 }
            if (r5 == 0) goto L_0x025d
            androidx.lifecycle.k0 r5 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0265 }
            f40.e r6 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0265 }
            f40.a r6 = r6.f251755f     // Catch:{ all -> 0x0265 }
            i40.c$a$a r8 = new i40.c$a$a     // Catch:{ all -> 0x0265 }
            r8.<init>()     // Catch:{ all -> 0x0265 }
            r5.<init>((androidx.lifecycle.C0123n0) r6, (androidx.lifecycle.C54209k0.C54210b) r8)     // Catch:{ all -> 0x0265 }
            androidx.lifecycle.i0 r5 = r5.mo75002a(r7)     // Catch:{ all -> 0x0265 }
            monitor-exit(r4)
            iu2.e r5 = (iu2.C60631e) r5
            r4 = r39
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r4 = r5.mo85233d3(r4)
            iu2.d r4 = (iu2.C98802d) r4
            int r5 = r1.f274721g
            long r5 = (long) r5
            com.tencent.mm.sdk.storage.observer.StorageEventId r7 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.getUPDATE()
            r4.mo138177g3(r5, r7)
            java.lang.String r4 = "onErrorServer"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x01cd:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r1.f274719e
            if (r4 == 0) goto L_0x0200
            te3.j00 r4 = r4.ContentObj
            if (r4 == 0) goto L_0x0200
            int r4 = r4.f298424e
            r5 = 21
            if (r4 != r5) goto L_0x0200
            as2.C28125b.m38099a(r0)
            r0 = -1
            if (r3 == r0) goto L_0x01fb
            r0 = 201(0xc9, float:2.82E-43)
            if (r3 == r0) goto L_0x01f5
            r0 = 211(0xd3, float:2.96E-43)
            if (r3 == r0) goto L_0x01ef
            r0 = 20
            as2.C28125b.m38099a(r0)
            goto L_0x0200
        L_0x01ef:
            r0 = 18
            as2.C28125b.m38099a(r0)
            goto L_0x0200
        L_0x01f5:
            r0 = 17
            as2.C28125b.m38099a(r0)
            goto L_0x0200
        L_0x01fb:
            r0 = 19
            as2.C28125b.m38099a(r0)
        L_0x0200:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r4 = r0.f275526T
            int r5 = r1.f274721g
            if (r4 != r5) goto L_0x0219
            com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct r0 = r0.mo131391x()
            r4 = 1
            r0.f265598g = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131372e()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.f275526T = r14
        L_0x0219:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r4 = r0.f275528V
            int r5 = r1.f274721g
            if (r4 != r5) goto L_0x0232
            com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct r0 = r0.mo131340A()
            r4 = 1
            r0.f265825f = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131374g()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.f275528V = r14
        L_0x0232:
            ob0.n r0 = r1.f274723i
            r6 = r37
            r0.onSceneEnd(r2, r3, r6, r1)
            com.tencent.mm.plugin.sns.statistics.l$a r0 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            int r3 = r1.f274721g
            java.lang.String r4 = "reportNetPost"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.String r6 = java.lang.String.valueOf(r3)
            com.tencent.mm.plugin.sns.statistics.m r7 = new com.tencent.mm.plugin.sns.statistics.m
            r7.<init>(r2, r3)
            r0.mo80971h(r6, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x025d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0265 }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x0265 }
            throw r0     // Catch:{ all -> 0x0265 }
        L_0x0265:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0268:
            r6 = r37
            r4 = r39
            r5 = r16
            r12 = 16
            if (r3 == 0) goto L_0x02f5
            java.lang.String r4 = "onError"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.model.b1 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r8 = r1.f274721g
            r7.mo130964w(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r1.f274719e
            if (r4 == 0) goto L_0x029a
            te3.j00 r4 = r4.ContentObj
            if (r4 == 0) goto L_0x029a
            int r4 = r4.f298424e
            r5 = 21
            if (r4 != r5) goto L_0x029a
            as2.C28125b.m38099a(r0)
            as2.C28125b.m38099a(r12)
        L_0x029a:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r4 = r0.f275526T
            int r5 = r1.f274721g
            if (r4 != r5) goto L_0x02b3
            com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct r0 = r0.mo131391x()
            r4 = 1
            r0.f265598g = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131372e()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.f275526T = r14
        L_0x02b3:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r4 = r0.f275528V
            int r5 = r1.f274721g
            if (r4 != r5) goto L_0x02cc
            com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct r0 = r0.mo131340A()
            r4 = 1
            r0.f265825f = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131374g()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.f275528V = r14
        L_0x02cc:
            ob0.n r0 = r1.f274723i
            r0.onSceneEnd(r2, r3, r6, r1)
            com.tencent.mm.plugin.sns.statistics.l$a r0 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            int r2 = r1.f274721g
            java.lang.String r4 = "reportNetPost"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.String r6 = java.lang.String.valueOf(r2)
            com.tencent.mm.plugin.sns.statistics.m r7 = new com.tencent.mm.plugin.sns.statistics.m
            r7.<init>(r3, r2)
            r0.mo80971h(r6, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x02f5:
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            if (r0 == 0) goto L_0x0b77
            te3.qv3 r0 = r0.ObjectDesc
            if (r0 == 0) goto L_0x0b77
            pe3.b r0 = r0.f140574f
            if (r0 != 0) goto L_0x0303
            goto L_0x0b77
        L_0x0303:
            java.lang.String r15 = new java.lang.String
            byte[] r0 = r0.mo123703f()
            r15.<init>(r0)
            int r0 = r1.f274725n
            if (r0 != 0) goto L_0x032c
            java.lang.String r0 = "MicroMsg.NetSceneSnsPost"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r12 = "resp "
            r13.append(r12)
            r13.append(r15)
            java.lang.String r12 = "  "
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r12)
        L_0x032c:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = ad0.C91999u.m115571q(r15)
            r1.f274720f = r0
            te3.sc4 r12 = r0.streamvideo
            if (r12 == 0) goto L_0x03b2
            java.lang.String r0 = r0.f283893Id
            java.lang.String r13 = r12.f299432n
            java.lang.String r12 = r12.f299431j
            java.lang.String r10 = "shareReport"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r9)
            ad0.t r11 = new ad0.t
            r11.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            java.lang.String r0 = ","
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r2 = "20CurrPublishId"
            r11.mo32a(r2, r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r13 = "20SourcePublishId"
            r11.mo32a(r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "20SourceAdUxInfo"
            r11.mo32a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "report snsad_shareReport: "
            r0.append(r2)
            java.lang.String r2 = r11.mo34c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.SnsVideoStatistic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r2 = 0
            r12[r2] = r11
            r2 = 13004(0x32cc, float:1.8222E-41)
            r0.mo160131h(r2, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
        L_0x03b2:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r2 = r33.mo130938n1()
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139800LL(r2)
            if (r0 != 0) goto L_0x03cd
            java.lang.String r0 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r2 = "the item has delete"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r0.<init>()
        L_0x03cd:
            r2 = r0
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            int r0 = r0.CreateTime
            r2.setCreateTime(r0)
            r2.setContent(r15)
            r2.setPostFinish()
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            long r9 = r0.f283891Id
            r2.setSnsId(r9)
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            long r9 = r0.f283891Id
            r2.setStringSeq((long) r9)
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            int r0 = r0.ExtFlag
            r9 = 1
            r0 = r0 & r9
            if (r0 <= 0) goto L_0x03f4
            r2.setExtFlag()
        L_0x03f4:
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            long r9 = r0.f283891Id
            r1.f274722h = r9
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r0 = r1.f274726o
            if (r0 == 0) goto L_0x041f
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r0 = r0.f265259d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "sns_"
            r9.append(r10)
            long r10 = r1.f274722h
            java.lang.String r10 = vr2.C102236a0.m134765q0(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r0.f265261b = r9
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r0 = r1.f274726o
            r0.publish()
        L_0x041f:
            com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent r0 = r1.f274727p
            if (r0 == 0) goto L_0x042d
            com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent$a r9 = r0.f79068d
            int r9 = r9.f79069a
            r10 = -1
            if (r9 == r10) goto L_0x042d
            r0.publish()
        L_0x042d:
            com.tencent.mm.protocal.protobuf.SnsObject r9 = r8.f132789d
            te3.qv3 r0 = r9.ObjectDesc
            r10 = 0
            byte[] r11 = new byte[r10]
            r0.mo73350k(r11)
            java.lang.String r0 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r11 = "onGYNetEnd snsObj Id=%s, ExtFlag=%d, GroupContactTagIdListCount:[%s], GroupContactTagIdListCount=%d, GroupUserCount=%d"
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]
            long r13 = r9.f283891Id
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12[r10] = r13
            int r10 = r9.ExtFlag
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13 = 1
            r12[r13] = r10
            java.util.LinkedList<java.lang.Integer> r10 = r9.GroupContactTagIdList
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.intListToString(r10)
            r13 = 2
            r12[r13] = r10
            r10 = 3
            int r13 = r9.GroupContactTagIdListCount
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            int r10 = r9.GroupUserCount
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13 = 4
            r12[r13] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r11, r12)
            int r0 = r9.CommentUserListCount     // Catch:{ IOException -> 0x048f }
            if (r0 != 0) goto L_0x0487
            int r0 = r9.LikeUserListCount     // Catch:{ IOException -> 0x048f }
            if (r0 != 0) goto L_0x0487
            int r0 = r9.WithUserListCount     // Catch:{ IOException -> 0x048f }
            if (r0 != 0) goto L_0x0487
            int r0 = r9.GroupCount     // Catch:{ IOException -> 0x048f }
            if (r0 != 0) goto L_0x0487
            java.lang.String r0 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r10 = "no use! this buf"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r10)     // Catch:{ IOException -> 0x048f }
            goto L_0x049a
        L_0x0487:
            byte[] r0 = r9.toByteArray()     // Catch:{ IOException -> 0x048f }
            r2.setAttrBuf(r0)     // Catch:{ IOException -> 0x048f }
            goto L_0x049a
        L_0x048f:
            r0 = move-exception
            java.lang.String r10 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r11 = ""
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r11, r13)
        L_0x049a:
            r2.clearItemDie()
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r10 = r1.f274722h
            r0.delete(r10)
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r10 = r33.mo130938n1()
            r0.Rv0(r10, r2)
            java.lang.String r0 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r10 = "onGYNEnd, update local snsInfo localId:%s, snsInfo.snsId:%s"
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            int r11 = r1.f274721g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 0
            r12[r13] = r11
            long r13 = r1.f274722h
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r13 = 1
            r12[r13] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r12)
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r10 = r1.f274721g
            r0.mo130964w(r10)
            java.lang.String r0 = r2.getLocalid()
            hd0.n0 r0 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120288g(r0)
            if (r0 == 0) goto L_0x0562
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r2.getTimeLine()
            if (r10 == 0) goto L_0x0562
            te3.j00 r10 = r10.ContentObj
            if (r10 == 0) goto L_0x0562
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            if (r10 == 0) goto L_0x0562
            int r11 = r10.size()
            if (r11 <= 0) goto L_0x0562
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            te3.kv2 r10 = (te3.C101804kv2) r10
            if (r10 == 0) goto L_0x0562
            int r11 = r0.f288537E
            java.lang.String r12 = "updateSnsPostSuccess"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsVideoLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r14 = 199(0xc7, float:2.79E-43)
            r0.f288562i = r14
            r0.f288537E = r11
            r11 = 268435712(0x10000100, float:2.524432E-29)
            r0.f288548P = r11
            java.lang.String r11 = r10.f298689d
            r0.f288544L = r11
            r11 = 1
            r0.f288545M = r11
            java.lang.String r11 = "xV0"
            r0.f288533A = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r15 = r10.f298689d
            java.lang.String r14 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r14, r15)
            r11.append(r14)
            java.lang.String r10 = vr2.C102236a0.m134725T(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r0.f288534B = r10
            hd0.o0 r10 = hd0.C98398h0.Bx0()
            boolean r10 = r10.mo137733w(r0)
            r11 = 2
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.String r0 = r0.mo137700d()
            r11 = 0
            r14[r11] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r10 = 1
            r14[r10] = r0
            java.lang.String r0 = "MicroMsg.SnsVideoLogic"
            java.lang.String r10 = "update sns Record filename %s, update %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
        L_0x0562:
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120213a()
            if (r0 == 0) goto L_0x059a
            com.tencent.mm.protocal.protobuf.SnsObject r0 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r2)
            int r0 = r0.NewWithTaListCount
            if (r0 <= 0) goto L_0x059a
            java.lang.String r0 = "isTogetherRedDotDefault"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.SnsConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r10)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r12 = "sns_with_together_red"
            r13 = 0
            int r11 = r11.getInt(r12, r13)
            if (r11 != 0) goto L_0x0588
            r11 = 1
            goto L_0x0589
        L_0x0588:
            r11 = 0
        L_0x0589:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r10)
            if (r11 == 0) goto L_0x059a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r10 = "sns_with_together_red"
            r11 = 1
            r0.encode((java.lang.String) r10, (int) r11)
            goto L_0x059b
        L_0x059a:
            r11 = 1
        L_0x059b:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274719e
            te3.j00 r10 = r0.ContentObj
            int r10 = r10.f298424e
            r12 = 15
            if (r10 != r11) goto L_0x05af
            int r13 = r0.showFlag
            if (r13 != 0) goto L_0x05af
            com.tencent.mm.protocal.protobuf.TimeLineObject r13 = r1.f274720f
            int r13 = r13.showFlag
            if (r13 == r11) goto L_0x05bb
        L_0x05af:
            if (r10 != r12) goto L_0x05da
            int r0 = r0.sightFolded
            if (r0 != 0) goto L_0x05da
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f
            int r0 = r0.sightFolded
            if (r0 != r11) goto L_0x05da
        L_0x05bb:
            java.lang.String r0 = r2.getSnsId()
            long r10 = os2.C100417r0.m131425n(r0)
            boolean r0 = os2.C35299v.m40634b(r10)
            if (r0 == 0) goto L_0x05da
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r10)
            com.tencent.mm.plugin.sns.model.NetSceneSnsPost$$b r10 = new com.tencent.mm.plugin.sns.model.NetSceneSnsPost$$b
            r10.<init>(r1)
            r0.post(r10)
        L_0x05da:
            com.tencent.mm.plugin.sns.statistics.a0 r0 = com.tencent.p014mm.plugin.sns.statistics.C95006y.f275639b
            int r10 = r33.mo130938n1()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            ad0.s r0 = r0.mo131397b(r10)
            if (r0 == 0) goto L_0x0604
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r1.f274720f
            if (r10 == 0) goto L_0x0604
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            r0.f263367i = r10
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            r0.f263366h = r10
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f
            java.lang.String r10 = r0.f283893Id
            te3.j00 r0 = r0.ContentObj
            int r0 = r0.f298424e
        L_0x0604:
            com.tencent.mm.plugin.sns.statistics.a0 r0 = com.tencent.p014mm.plugin.sns.statistics.C95007z.f275640b
            int r10 = r33.mo130938n1()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            ad0.s r0 = r0.mo131397b(r10)
            if (r0 == 0) goto L_0x062e
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r1.f274720f
            if (r10 == 0) goto L_0x062e
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            r0.f263367i = r10
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            r0.f263366h = r10
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f
            java.lang.String r10 = r0.f283893Id
            te3.j00 r0 = r0.ContentObj
            int r0 = r0.f298424e
        L_0x062e:
            byte[] r10 = i40.C60247c.f171776h
            monitor-enter(r10)
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0b74 }
            r0.mo121108c()     // Catch:{ all -> 0x0b74 }
            boolean r0 = r5.isAssignableFrom(r7)     // Catch:{ all -> 0x0b74 }
            if (r0 == 0) goto L_0x0b6c
            androidx.lifecycle.k0 r0 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0b74 }
            f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0b74 }
            f40.a r5 = r5.f251755f     // Catch:{ all -> 0x0b74 }
            i40.c$a$a r11 = new i40.c$a$a     // Catch:{ all -> 0x0b74 }
            r11.<init>()     // Catch:{ all -> 0x0b74 }
            r0.<init>((androidx.lifecycle.C0123n0) r5, (androidx.lifecycle.C54209k0.C54210b) r11)     // Catch:{ all -> 0x0b74 }
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)     // Catch:{ all -> 0x0b74 }
            monitor-exit(r10)
            iu2.e r0 = (iu2.C60631e) r0
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r4)
            iu2.d r0 = (iu2.C98802d) r0
            int r4 = r1.f274721g
            long r4 = (long) r4
            com.tencent.mm.sdk.storage.observer.StorageEventId r7 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.getUPDATE()
            r0.mo138177g3(r4, r7)
            com.tencent.mm.autogen.events.SnsPostSuccessEvent r0 = new com.tencent.mm.autogen.events.SnsPostSuccessEvent
            r0.<init>()
            com.tencent.mm.autogen.events.SnsPostSuccessEvent$a r4 = r0.f78999d
            int r5 = r33.mo130938n1()
            long r10 = (long) r5
            r4.f79000a = r10
            r0.publish()
            int r0 = r2.getTypeFlag()
            r4 = 21
            if (r0 != r4) goto L_0x06a0
            int r0 = r2.getPravited()
            r4 = 1
            if (r0 != r4) goto L_0x0686
            goto L_0x068a
        L_0x0686:
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r8.f132789d
            int r0 = r0.ExtFlag
        L_0x068a:
            r4 = 7
            as2.C28125b.m38099a(r4)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f
            java.lang.String r0 = r0.f283893Id
            java.lang.String r0 = "report"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.lucky.report.ReportHbPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            java.lang.System.currentTimeMillis()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
        L_0x06a0:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274719e
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r1.f274720f
            java.lang.String r5 = "updateMediaFileName"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            if (r0 == 0) goto L_0x0855
            if (r4 == 0) goto L_0x0855
            te3.j00 r10 = r0.ContentObj
            if (r10 == 0) goto L_0x0855
            te3.j00 r10 = r4.ContentObj
            if (r10 != 0) goto L_0x06ba
            goto L_0x0855
        L_0x06ba:
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            r11 = 0
        L_0x06bf:
            te3.j00 r13 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r13 = r13.f298427h
            int r13 = r13.size()
            if (r11 >= r13) goto L_0x084b
            te3.j00 r13 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r13 = r13.f298427h
            int r13 = r13.size()
            if (r11 >= r13) goto L_0x084b
            te3.j00 r13 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r13 = r13.f298427h
            java.lang.Object r13 = r13.get(r11)
            te3.kv2 r13 = (te3.C101804kv2) r13
            te3.j00 r14 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r14 = r14.f298427h
            java.lang.Object r14 = r14.get(r11)
            te3.kv2 r14 = (te3.C101804kv2) r14
            java.lang.String r15 = vr2.C102236a0.m134731Z(r13)
            java.lang.String r12 = vr2.C102236a0.m134739d0(r13)
            r17 = r0
            java.lang.String r0 = "getSnsTmpUser"
            r18 = r4
            java.lang.String r4 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "sns_tmpu_"
            r3.append(r6)
            java.lang.String r6 = r13.f298689d
            java.lang.String r6 = vr2.C102236a0.m134768s(r6)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            int r6 = r13.f298671D
            r39 = r8
            r8 = 1
            if (r6 != r8) goto L_0x0737
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = vr2.C102236a0.m134747h0(r13)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r6 = r9
            long r8 = r13.f298672E
            java.lang.String r3 = zc0.C39339c.m42094a(r3, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            goto L_0x073b
        L_0x0737:
            r6 = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
        L_0x073b:
            java.lang.String r0 = vr2.C102236a0.m134735b0(r13)
            java.lang.String r4 = vr2.C102236a0.m134717L(r14)
            java.lang.String r8 = vr2.C102236a0.m134729X(r14)
            java.lang.String r9 = vr2.C102236a0.m134745g0(r14)
            r19 = r6
            java.lang.String r6 = vr2.C102236a0.m134725T(r14)
            r20 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "updateMediaFileName "
            r2.append(r1)
            r2.append(r15)
            java.lang.String r1 = "  - "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.NetSceneSnsPost"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            java.lang.String r1 = r13.f298689d
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r10, r1)
            java.lang.String r13 = r14.f298689d
            java.lang.String r13 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r10, r13)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r14, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r4, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r13)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 == 0) goto L_0x0835
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r8 = 0
            r4[r8] = r3
            java.lang.String r3 = "post done copy file %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r1)
        L_0x0835:
            int r11 = r11 + 1
            r1 = r33
            r3 = r36
            r6 = r37
            r8 = r39
            r0 = r17
            r4 = r18
            r9 = r19
            r2 = r20
            r12 = 15
            goto L_0x06bf
        L_0x084b:
            r20 = r2
            r39 = r8
            r19 = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            goto L_0x085e
        L_0x0855:
            r20 = r2
            r39 = r8
            r19 = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
        L_0x085e:
            r1 = r33
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f
            if (r0 != 0) goto L_0x0867
            java.lang.String r0 = ""
            goto L_0x0869
        L_0x0867:
            java.lang.String r0 = r0.ContentDesc
        L_0x0869:
            java.lang.String r2 = "reprotCheckQRCode"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r1.f274735x = r0
            r4 = 1
            r1.f274730s = r4
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r4 = 0
            r0[r4] = r5
            java.lang.String r4 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r5 = "needUploadData:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
            int r0 = r1.f274728q
            r4 = 12
            if (r0 == r4) goto L_0x0895
            int r0 = r1.f274730s
            if (r0 != 0) goto L_0x0895
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0901
        L_0x0895:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f
            if (r0 == 0) goto L_0x08fe
            te3.j00 r0 = r0.ContentObj
            if (r0 == 0) goto L_0x08fe
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            if (r0 == 0) goto L_0x08fe
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x08fe
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f
            te3.j00 r0 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            com.tencent.mm.sdk.event.IListener r4 = r1.f274736y
            r4.alive()
            com.tencent.mm.sdk.event.IListener r4 = r1.f274737z
            r4.alive()
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x08bc:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x08fe
            java.lang.Object r5 = r0.next()
            te3.kv2 r5 = (te3.C101804kv2) r5
            int r6 = r5.f298690e
            r7 = 2
            if (r6 == r7) goto L_0x08ce
            goto L_0x08bc
        L_0x08ce:
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r5)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 == 0) goto L_0x08d9
            goto L_0x08bc
        L_0x08d9:
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r1.f274733v
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r8.put(r6, r9)
            java.util.HashMap<java.lang.String, te3.kv2> r8 = r1.f274732u
            r8.put(r6, r5)
            int r4 = r4 + 1
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent r5 = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent
            r5.<init>()
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent$a r8 = r5.f107731d
            long r9 = java.lang.System.nanoTime()
            r8.f107732a = r9
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent$a r8 = r5.f107731d
            r8.f107733b = r6
            r5.publish()
            goto L_0x08bc
        L_0x08fe:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x0901:
            com.tencent.mm.plugin.sns.model.p2 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            if (r0 == 0) goto L_0x090e
            com.tencent.mm.plugin.sns.model.p2 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            r0.mo131192c()
        L_0x090e:
            int r0 = r20.getTypeFlag()     // Catch:{ Exception -> 0x0970 }
            r2 = 15
            if (r0 != r2) goto L_0x096d
            te3.lv2 r0 = new te3.lv2     // Catch:{ Exception -> 0x0970 }
            r0.<init>()     // Catch:{ Exception -> 0x0970 }
            byte[] r2 = r20.getPostBuf()     // Catch:{ Exception -> 0x0970 }
            pe3.a r0 = r0.parseFrom(r2)     // Catch:{ Exception -> 0x0970 }
            te3.lv2 r0 = (te3.C101808lv2) r0     // Catch:{ Exception -> 0x0970 }
            java.util.LinkedList<te3.ar2> r0 = r0.f298747h     // Catch:{ Exception -> 0x0970 }
            java.lang.Object r0 = r0.getFirst()     // Catch:{ Exception -> 0x0970 }
            te3.ar2 r0 = (te3.C64241ar2) r0     // Catch:{ Exception -> 0x0970 }
            int r3 = r0.f182140d     // Catch:{ Exception -> 0x0970 }
            if (r3 <= 0) goto L_0x096d
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f274720f     // Catch:{ Exception -> 0x0970 }
            te3.j00 r0 = r0.ContentObj     // Catch:{ Exception -> 0x0970 }
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h     // Catch:{ Exception -> 0x0970 }
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0970 }
            te3.kv2 r0 = (te3.C101804kv2) r0     // Catch:{ Exception -> 0x0970 }
            if (r0 == 0) goto L_0x096d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0970 }
            r2.<init>()     // Catch:{ Exception -> 0x0970 }
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()     // Catch:{ Exception -> 0x0970 }
            java.lang.String r5 = r0.f298689d     // Catch:{ Exception -> 0x0970 }
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r4, r5)     // Catch:{ Exception -> 0x0970 }
            r2.append(r4)     // Catch:{ Exception -> 0x0970 }
            java.lang.String r4 = vr2.C102236a0.m134725T(r0)     // Catch:{ Exception -> 0x0970 }
            r2.append(r4)     // Catch:{ Exception -> 0x0970 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0970 }
            hd0.e0 r2 = hd0.C98394e0.vx0()     // Catch:{ Exception -> 0x0970 }
            java.lang.String r4 = r0.f298692g     // Catch:{ Exception -> 0x0970 }
            r8 = r19
            long r6 = r8.f283891Id     // Catch:{ Exception -> 0x096b }
            r2.xx0(r3, r4, r5, r6)     // Catch:{ Exception -> 0x096b }
            goto L_0x0973
        L_0x096b:
            goto L_0x0973
        L_0x096d:
            r8 = r19
            goto L_0x0973
        L_0x0970:
            r8 = r19
            goto L_0x096b
        L_0x0973:
            long r2 = r8.f283891Id
            java.lang.String r0 = "postSnsInfo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            com.tencent.mm.autogen.events.SnsPostInfoEvent r5 = new com.tencent.mm.autogen.events.SnsPostInfoEvent
            r5.<init>()
            com.tencent.mm.autogen.events.SnsPostInfoEvent$a r6 = r5.f154876d
            r6.f154877a = r2
            int r2 = r33.mo130938n1()
            r6.f154878b = r2
            com.tencent.mm.autogen.events.SnsPostInfoEvent$a r2 = r5.f154876d
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = r1.f274729r
            r2.f154879c = r3
            r5.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            long r2 = r8.f283891Id
            java.lang.String r0 = "reportSnsPostInfo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_POST_BIZ_ID_STRING
            java.lang.String r7 = ""
            java.lang.Object r5 = r5.mo119685f(r6, r7)
            java.lang.String r5 = (java.lang.String) r5
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 != 0) goto L_0x09d7
            java.lang.Class<h81.i> r9 = h81.C59774i.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            h81.i r9 = (h81.C59774i) r9
            java.lang.String r2 = vr2.C102236a0.m134765q0(r2)
            java.lang.String r3 = "snspublicid"
            r9.sx0(r3, r2, r5)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r2.mo119677K(r6, r7)
        L_0x09d7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r0 = r0.mo131344E()
            r2 = r39
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r2.f132789d
            long r2 = r2.f283891Id
            java.lang.String r2 = vr2.C102236a0.m134765q0(r2)
            java.lang.String r3 = "Published"
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f266396y = r2
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131356Q()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131390w()
            long r2 = r0.f266438j
            r4 = 1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0a20
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131390w()
            long r2 = r8.f283891Id
            java.lang.String r2 = vr2.C102236a0.m134763p0(r2)
            java.lang.String r3 = "NextPublishId"
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f266440l = r2
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131352M()
        L_0x0a20:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r2 = r0.f275524R
            int r3 = r1.f274721g
            if (r2 != r3) goto L_0x0a4a
            r22 = 9
            java.lang.String r23 = ""
            r24 = 0
            r25 = 0
            long r26 = eb0.C31543z5.m39453c()
            long r2 = r8.f283891Id
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            long r4 = r4.f275525S
            r32 = 0
            r21 = r0
            r28 = r2
            r30 = r4
            r21.mo131355P(r22, r23, r24, r25, r26, r28, r30, r32)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r2 = 0
            r0.f275524R = r2
        L_0x0a4a:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r2 = r0.f275526T
            int r3 = r1.f274721g
            r4 = 2
            if (r2 != r3) goto L_0x0a7c
            com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct r0 = r0.mo131391x()
            r0.f265598g = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct r0 = r0.mo131391x()
            r2 = r20
            long r6 = r2.field_snsId
            java.lang.String r3 = vr2.C102236a0.m134763p0(r6)
            java.lang.String r6 = "Publishid"
            r7 = 1
            java.lang.String r3 = r0.mo86045b(r6, r3, r7)
            r0.f265597f = r3
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131372e()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r3 = 0
            r0.f275526T = r3
            goto L_0x0a7e
        L_0x0a7c:
            r2 = r20
        L_0x0a7e:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r3 = r0.f275528V
            int r6 = r1.f274721g
            if (r3 != r6) goto L_0x0aab
            com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct r0 = r0.mo131340A()
            r0.f265825f = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct r0 = r0.mo131340A()
            long r3 = r2.field_snsId
            java.lang.String r3 = vr2.C102236a0.m134763p0(r3)
            java.lang.String r4 = "Publishid"
            r5 = 1
            java.lang.String r3 = r0.mo86045b(r4, r3, r5)
            r0.f265824e = r3
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131374g()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r3 = 0
            r0.f275528V = r3
        L_0x0aab:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r3 = r0.f275531Y
            int r4 = r1.f274721g
            if (r3 != r4) goto L_0x0aed
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct r0 = r0.mo131343D()
            long r3 = r2.field_snsId
            java.lang.String r3 = vr2.C102236a0.m134763p0(r3)
            java.lang.String r4 = "PublishID"
            r5 = 1
            java.lang.String r3 = r0.mo86045b(r4, r3, r5)
            r0.f265985f = r3
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.getClass()
            java.lang.String r3 = "doReportSnsCoverPostStruct"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            qr2.a r5 = qr2.C36069a.f96150a
            boolean r5 = r5.mo60517b()
            if (r5 != 0) goto L_0x0ade
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x0aed
        L_0x0ade:
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct r5 = r0.f275530X
            r5.mo86054n()
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct
            r5.<init>()
            r0.f275530X = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0aed:
            k21.c$a r0 = k21.C60960c.f173618a
            java.lang.String r3 = "SnsPublishProcess"
            java.lang.String r4 = "send_type"
            int r5 = r2.getTypeFlag()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.mo85926j(r3, r4, r5)
            java.lang.String r3 = "SnsPublishProcess"
            java.lang.String r4 = "publishid_"
            long r5 = r2.field_snsId
            java.lang.String r5 = vr2.C102236a0.m134765q0(r5)
            r0.mo85926j(r3, r4, r5)
            java.lang.String r3 = "SnsPublishProcess"
            java.lang.String r4 = "upload_time"
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            i21.i r6 = i21.C60242i.ELAPSE
            r0.mo85927k(r3, r4, r5, r6)
            com.tencent.mm.plugin.sns.statistics.l$a r0 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r1.f274721g
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo80966c(r3)
            java.lang.Class<mm.h> r0 = p606mm.C99933h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            mm.h r0 = (p606mm.C99933h) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r2 = r2.localid
            r3.append(r2)
            java.lang.String r2 = ""
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r4 = 16
            r0.D80(r4, r2, r3)
            ob0.n r0 = r1.f274723i
            r2 = r35
            r3 = r36
            r4 = r37
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0b6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0b74 }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x0b74 }
            throw r0     // Catch:{ all -> 0x0b74 }
        L_0x0b74:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0b77:
            r4 = r6
            java.lang.String r0 = "MicroMsg.NetSceneSnsPost"
            java.lang.String r5 = "err respone buffer is null ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r5 = r1.f274721g
            r0.mo130964w(r5)
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r5 = r33.mo130938n1()
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139800LL(r5)
            if (r0 == 0) goto L_0x0bb5
            r0.clearItemDie()
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r6 = r33.mo130938n1()
            r5.Rv0(r6, r0)
            com.tencent.mm.autogen.events.SnsPostSuccessEvent r0 = new com.tencent.mm.autogen.events.SnsPostSuccessEvent
            r0.<init>()
            com.tencent.mm.autogen.events.SnsPostSuccessEvent$a r5 = r0.f78999d
            int r6 = r33.mo130938n1()
            long r6 = (long) r6
            r5.f79000a = r6
            r0.publish()
        L_0x0bb5:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r5 = r0.f275526T
            int r6 = r1.f274721g
            if (r5 != r6) goto L_0x0bcf
            com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct r0 = r0.mo131391x()
            r5 = 1
            r0.f265598g = r5
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131372e()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r5 = 0
            r0.f275526T = r5
        L_0x0bcf:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r5 = r0.f275528V
            int r6 = r1.f274721g
            if (r5 != r6) goto L_0x0be9
            com.tencent.mm.autogen.mmdata.rpt.SecondCutShareSnsStruct r0 = r0.mo131340A()
            r5 = 1
            r0.f265825f = r5
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131374g()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r5 = 0
            r0.f275528V = r5
        L_0x0be9:
            ob0.n r0 = r1.f274723i
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "onGYNetEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
