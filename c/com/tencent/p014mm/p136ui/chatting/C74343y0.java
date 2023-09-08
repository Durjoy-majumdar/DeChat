package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bp3.C104160f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.autogen.events.WxFileIndexDirtyEvent;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75604z3;
import eb0.C86493v0;
import eb0.C97625j3;
import f40.C86709a0;
import gw0.C76073b;
import h81.C32735h;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import hd0.C98429r0;
import hd0.C98442x0;
import ht1.C60186m4;
import i61.C98602h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jr2.C76442r;
import junit.framework.Assert;
import kb0.C9576e;
import ob0.C117747y;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C76051j;
import p158gt.C76053l;
import p158gt.C98201k;
import p196ln.C76706g;
import p227rn.C48053v;
import p663qo.C101213l;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p763ym.C79138l;
import p823sg.C101611g;
import p823sg.C101614i;
import pc0.C100765f;
import rb0.C47976j;
import rb0.C47984k;
import rb0.C48009v0;
import s90.C63724h;
import s90.C77627f;
import s90.C77629i;
import s90.C77630j;
import sb0.C48340e;
import sf0.C77702q0;
import sj3.C63941p;
import te3.C101834rc0;
import te3.C77915dp3;
import te3.tc4;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.chatting.y0 */
public class C74343y0 {

    /* renamed from: com.tencent.mm.ui.chatting.y0$a */
    public class C74344a implements C76051j.C76052a {

        /* renamed from: d */
        public final /* synthetic */ Context f218375d;

        /* renamed from: e */
        public final /* synthetic */ String f218376e;

        /* renamed from: f */
        public final /* synthetic */ C92836k f218377f;

        /* renamed from: g */
        public final /* synthetic */ String f218378g;

        public C74344a(Context context, String str, C92836k kVar, String str2) {
            this.f218375d = context;
            this.f218376e = str;
            this.f218377f = kVar;
            this.f218378g = str2;
        }

        /* renamed from: T2 */
        public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
            HashMap hashMap;
            Object obj2 = obj;
            boolean z = i3 == 0 && i4 == 0;
            if ((obj2 instanceof HashMap) && (hashMap = (HashMap) obj2) != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    Long l = (Long) entry.getKey();
                    String TY = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(C76053l.class)).mo106262y8((C92836k) entry.getValue()), "", "", true);
                    if (z) {
                        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101125kD(l.longValue());
                        C97425j a = C7250m.m7431a();
                        Context context = this.f218375d;
                        String str2 = this.f218376e;
                        String str3 = this.f218377f.f267393t;
                        String str4 = this.f218378g;
                        C100765f fVar = new C100765f();
                        fVar.f295214b = j2;
                        a.mo136256TG(context, str2, TY, i, str3, str4, fVar);
                    } else {
                        long j3 = j2;
                    }
                }
            }
        }

        /* renamed from: f0 */
        public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
        }

        /* renamed from: x4 */
        public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.y0$b */
    public static class C74345b implements C101489t.C77595a {

        /* renamed from: d */
        public final String f218379d;

        /* renamed from: e */
        public final C72963f4 f218380e;

        public C74345b(String str, C72963f4 f4Var) {
            this.f218379d = str;
            this.f218380e = f4Var;
        }

        /* renamed from: d5 */
        public void mo102579d5(C101489t.C77595a.C77596a aVar) {
            C72963f4 f4Var;
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a);
            if (Zd != null && Zd.f288562i == 199 && (f4Var = this.f218380e) != null) {
                C74343y0.m88758b(Zd, f4Var.mo108765s2(), this.f218379d, Zd.f288572s, Zd.f288566m, Zd.mo137705i(), this.f218380e.getType(), this.f218380e.getMsgId());
            }
        }
    }

    /* renamed from: A */
    public static boolean m88742A(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "check is game msg error, msg is null");
            return true;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.mo108769t2() == 0 ? C75604z3.m90849u(f4Var.getContent()) : f4Var.getContent(), (String) null);
        if (u == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "parse app message content fail");
            return false;
        }
        C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(u.f195562d, false);
        return GW != null && GW.mo69359k();
    }

    /* renamed from: B */
    public static boolean m88743B(C72963f4 f4Var, String str) {
        String str2 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent()).f212675a;
        if (str2 == null || str2.length() <= 0) {
            Log.m105920e("MicroMsg.ChattingEditModeLogic", "getView : parse possible friend msg failed");
            return false;
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_forward_card, 0) == 1) {
            return C72996z1.m85843n5(str) || C72996z1.m85844o5(str) || f4Var.getType() == 66;
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m88744C(C72963f4 f4Var) {
        return (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_forward_card, 0) == 1) && f4Var.getType() == 67;
    }

    /* renamed from: D */
    public static boolean m88745D(C72963f4 f4Var) {
        C68070l.C68072b u;
        if (f4Var == null || (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) == null || u.f195582i != 19) {
            return false;
        }
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 0;
        aVar.f265030b = u.f195571f0;
        recordOperationEvent.publish();
        C77915dp3 dp32 = recordOperationEvent.f265028e.f265048a;
        if (dp32 != null) {
            Iterator<C101834rc0> it = dp32.f227155f.iterator();
            while (it.hasNext()) {
                C101834rc0 next = it.next();
                if (!Util.isNullOrNil(next.f299342z1)) {
                    Log.m105921e("MicroMsg.ChattingEditModeLogic", "record type subDataItem contain tpurl, type:%d", Integer.valueOf(next.f299258I));
                    return true;
                }
            }
        }
        String str = u.f195571f0;
        return str != null && str.contains("<recordxml>");
    }

    /* renamed from: E */
    public static boolean m88746E(C72963f4 f4Var) {
        return f4Var.getType() == 419430449;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (((i61.C98602h) ((z51.C39315g) di3.C86312j.m106911c(r0)).mo58035cm()).mo138006M(r5.field_groupId) != false) goto L_0x0081;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88747F(com.tencent.p014mm.storage.C72963f4 r5) {
        /*
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            r1 = 1
            if (r5 != 0) goto L_0x000d
            java.lang.String r5 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r0 = "check is store emoji error, msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            return r1
        L_0x000d:
            boolean r2 = r5.mo101022y3()
            if (r2 == 0) goto L_0x0046
            com.tencent.mm.storage.o2 r2 = new com.tencent.mm.storage.o2
            java.lang.String r3 = r5.getContent()
            r2.<init>(r3)
            java.lang.String r3 = r5.getContent()
            java.lang.String r5 = r5.mo108775z2()
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r5)
            if (r5 != 0) goto L_0x0033
            com.tencent.mm.message.l$b r5 = new com.tencent.mm.message.l$b
            r5.<init>()
            java.lang.String r2 = r2.f212821d
            r5.f195610p = r2
        L_0x0033:
            di3.d r2 = di3.C86312j.m106911c(r0)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            java.lang.String r5 = r5.f195610p
            i61.h r2 = (i61.C98602h) r2
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r2.mo137999G(r5)
            goto L_0x005a
        L_0x0046:
            di3.d r2 = di3.C86312j.m106911c(r0)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            java.lang.String r5 = r5.mo108765s2()
            i61.h r2 = (i61.C98602h) r2
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r2.mo137999G(r5)
        L_0x005a:
            r2 = 0
            if (r5 == 0) goto L_0x0082
            int r3 = r5.field_catalog
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r4 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1
            r4 = 81
            if (r3 == r4) goto L_0x0081
            java.lang.String r3 = r5.field_groupId
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0082
            di3.d r0 = di3.C86312j.m106911c(r0)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            java.lang.String r3 = r5.field_groupId
            i61.h r0 = (i61.C98602h) r0
            boolean r0 = r0.mo138006M(r3)
            if (r0 == 0) goto L_0x0082
        L_0x0081:
            return r2
        L_0x0082:
            if (r5 == 0) goto L_0x008b
            boolean r5 = r5.mo135619q2()
            if (r5 == 0) goto L_0x008b
            return r1
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88747F(com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: G */
    public static boolean m88748G(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "isTeenModeAuthForbidForwardMsg, check msg error, msg is null");
            return true;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.mo108769t2() == 0 ? C75604z3.m90849u(f4Var.getContent()) : f4Var.getContent(), (String) null);
        if (u == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "isTeenModeAuthForbidForwardMsg, parse app message content fail");
            return false;
        }
        int i = u.f195582i;
        return i == 83 || i == 84;
    }

    /* renamed from: H */
    public static void m88749H(Context context, String str, C72963f4 f4Var, boolean z) {
        String str2;
        C68097n Lo;
        Context context2 = context;
        String str3 = str;
        C72963f4 f4Var2 = f4Var;
        boolean z2 = z;
        if (m88756O(context2, str3, f4Var2, "appmsg")) {
            if (context2 == null) {
                Log.m105928w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: context is null");
            } else if (f4Var2 == null) {
                Log.m105928w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: msg is null");
            } else if (C97625j3.m125812b().mo105883I()) {
                String c402 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).c40(f4Var.mo108765s2(), false, false);
                if (!C77702q0.m93719b(c402) && !c402.endsWith("hd")) {
                    if (C86013q1.m106450k(c402 + "hd")) {
                        c402 = c402 + "hd";
                    }
                }
                try {
                    C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent());
                    LinkedList<C77630j> linkedList = JZ.f226295i;
                    if (linkedList != null) {
                        if (linkedList.size() > 0) {
                            for (int i = 0; i < linkedList.size(); i++) {
                                C77630j jVar = linkedList.get(i);
                                C68070l.C68072b bVar = new C68070l.C68072b();
                                String str4 = jVar.f226336r;
                                C101611g<Long, C77629i> gVar = C92721n.f266840a;
                                if (C9576e.m9260a(str4)) {
                                    C73687g1.m87265c(str3, z2, C73687g1.m87263a(str3, jVar), jVar.f226341w);
                                } else {
                                    bVar.f195570f = jVar.f226325d;
                                    bVar.f195574g = jVar.f226332n;
                                    bVar.f195578h = "view";
                                    bVar.f195582i = 5;
                                    bVar.f195586j = jVar.f226326e;
                                    bVar.f195634v = JZ.f226292f;
                                    bVar.f195638w = JZ.f226293g;
                                    bVar.f195642x = JZ.f226294h;
                                    bVar.f195646y = C92721n.m116882j(jVar);
                                    C68065f fVar = new C68065f();
                                    int i2 = jVar.f226333o;
                                    fVar.f195417b = i2;
                                    fVar.f195423h = jVar.f226317I;
                                    if (i2 == 5) {
                                        fVar.f195425j = jVar.f226315G;
                                        fVar.f195418c = (int) jVar.f226329h;
                                        fVar.f195419d = jVar.f226335q;
                                        fVar.f195420e = jVar.f226313E;
                                        fVar.f195421f = jVar.f226314F;
                                    }
                                    bVar.mo93545f(fVar);
                                    if (Util.isNullOrNil(bVar.f195646y) && !Util.isNullOrNil(bVar.f195634v) && (Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(bVar.f195634v)) != null) {
                                        bVar.f195646y = Lo.mo93594c();
                                    }
                                    String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
                                    if (jVar.f226333o == 19) {
                                        C63941p pVar = C63941p.f181254a;
                                        C63724h d = pVar.mo88706d(f4Var.getContent(), i);
                                        FinderObject c = pVar.mo88705c(d.f180629g, d.f180628f);
                                        if (c != null) {
                                            s = C68070l.C68072b.m80420s(((C60186m4) C86312j.m106911c(C60186m4.class)).mo85186PP(c), (String) null, (C98121d) null);
                                        }
                                    }
                                    C7250m.m7431a().pd0(str3, Util.readFromFile(c402), Util.processXml(s), (String) null);
                                }
                            }
                            return;
                        }
                    }
                    if (!f4Var.mo101020w3()) {
                        if (!f4Var.mo100967F3()) {
                            str2 = null;
                            C7250m.m7431a().mo136265uM(str, Util.readFromFile(c402), Util.processXml(f4Var.getContent()), str2, C75569c4.m90685r(f4Var2.f230724G), f4Var.getMsgId());
                        }
                    }
                    str2 = C86493v0.m107223a("" + f4Var.mo108774y2());
                    C86493v0.C86495c c2 = C86493v0.m107224d().mo120947c(str2, true);
                    c2.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
                    c2.mo120962i("preUsername", C74023i.m87890t(f4Var2, z2, false));
                    c2.mo120962i("preChatName", f4Var.mo108768t());
                    c2.mo120962i("preMsgIndex", 0);
                    c2.mo120962i("sendAppMsgScene", 1);
                    ((C76442r) C86312j.m106911c(C76442r.class)).mo106656pL("adExtStr", c2, f4Var2);
                    C7250m.m7431a().mo136265uM(str, Util.readFromFile(c402), Util.processXml(f4Var.getContent()), str2, C75569c4.m90685r(f4Var2.f230724G), f4Var.getMsgId());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ChattingEditModeLogic", e, "", new Object[0]);
                    Log.m105921e("MicroMsg.ChattingEditModeLogic", "send app msg error : %s", e.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: I */
    public static void m88750I(Context context, String str, String str2, int i, boolean z) {
        try {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108732L2(str2);
            f4Var.mo108740T2(i);
            int indexOf = str2.indexOf("<msg>");
            if (indexOf > 0 && indexOf < str2.length()) {
                str2 = str2.substring(indexOf).trim();
            }
            Map<String, String> parseXml = XmlParser.parseXml(str2, "msg", (String) null);
            if (parseXml != null && parseXml.size() > 0) {
                f4Var.mo108746Z2(SemiXml.encode(parseXml));
            }
            m88749H(context, str, f4Var, z);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingEditModeLogic", e, "", new Object[0]);
            Log.m105921e("MicroMsg.ChattingEditModeLogic", "retransmit sigle app msg error : %s", e.getLocalizedMessage());
        }
    }

    /* renamed from: J */
    public static void m88751J(Context context, String str, C72963f4 f4Var) {
        if (m88756O(context, str, f4Var, "emoji")) {
            String str2 = new C72989o2(f4Var.getContent()).f212821d;
            if (str2 == null || str2.endsWith("-1")) {
                str2 = f4Var.mo108765s2();
            }
            if (str2 == null) {
                Log.m105928w("MicroMsg.ChattingEditModeLogic", "showAcceptEmojiConnector: filePath is null");
            } else {
                ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138010Q(context, str, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88752K(android.content.Context r27, java.lang.String r28, com.tencent.p014mm.storage.C72963f4 r29) {
        /*
            r11 = r28
            java.lang.Class<gt.l> r0 = p158gt.C76053l.class
            java.lang.Class<gt.k> r1 = p158gt.C98201k.class
            java.lang.String r2 = "image"
            r12 = r27
            r13 = r29
            boolean r2 = m88756O(r12, r11, r13, r2)
            if (r2 != 0) goto L_0x0013
            return
        L_0x0013:
            long r2 = r29.getMsgId()
            r4 = 0
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0037
            di3.d r2 = di3.C86312j.m106911c(r1)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r3 = r29.mo108768t()
            long r7 = r29.getMsgId()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r2 = r2.mo127200vP(r3, r7)
            goto L_0x0038
        L_0x0037:
            r2 = r4
        L_0x0038:
            if (r2 == 0) goto L_0x0040
            long r7 = r2.f267374a
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0060
        L_0x0040:
            long r7 = r29.mo108774y2()
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
            di3.d r2 = di3.C86312j.m106911c(r1)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r3 = r29.mo108768t()
            long r5 = r29.mo108774y2()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r2 = r2.mo127168NQ(r3, r5)
        L_0x0060:
            r14 = r2
            if (r14 != 0) goto L_0x0064
            return
        L_0x0064:
            boolean r2 = r14.mo127145p()
            r15 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0082
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.l r2 = (p158gt.C76053l) r2
            com.tencent.mm.modelimage.k r2 = r2.mo106261jD(r14)
            java.lang.String r2 = r2.f267378e
            java.lang.String r3 = "SERVERID://"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L_0x0082
            r5 = 1
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            di3.d r2 = di3.C86312j.m106911c(r1)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.l r0 = (p158gt.C76053l) r0
            java.lang.String r0 = r0.mo106262y8(r14)
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r9 = ""
            java.lang.String r3 = r2.mo127174TY(r0, r9, r9, r10)
            di3.d r0 = di3.C86312j.m106911c(r1)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r1 = r14.f267380g
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r2 = "th_"
            java.lang.String r16 = r0.mo127174TY(r1, r2, r9, r10)
            int r0 = r14.f267376c
            int r1 = r14.f267377d
            if (r0 < r1) goto L_0x00e1
            if (r1 != 0) goto L_0x00bd
            goto L_0x00e1
        L_0x00bd:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 != 0) goto L_0x022d
            d62.j r0 = d62.C7250m.m7431a()
            java.lang.String r6 = r14.f267393t
            pc0.f r7 = new pc0.f
            r7.<init>()
            long r1 = r29.getMsgId()
            r7.f295214b = r1
            r1 = r27
            r2 = r28
            r4 = r5
            r5 = r6
            r6 = r16
            r0.mo136256TG(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x022d
        L_0x00e1:
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r17 = 4
            java.lang.String r6 = r14.f267393t
            java.lang.String r0 = "msg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r0, r4)
            java.lang.String r8 = "MicroMsg.ChattingEditModeLogic"
            if (r0 != 0) goto L_0x0101
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = r14.f267393t
            r0[r15] = r1
            java.lang.String r1 = "parse cdnInfo failed. [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r0)
        L_0x00fe:
            r6 = r11
            goto L_0x021d
        L_0x0101:
            int r7 = r14.f267381h
            r4 = 2
            if (r7 == r10) goto L_0x0111
            java.lang.String r1 = ".msg.img.$cdnmidimgurl"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r3 = r1
            r2 = 2
            goto L_0x011b
        L_0x0111:
            java.lang.String r1 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r3 = r1
            r2 = 1
        L_0x011b:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            r1[r15] = r18
            r1[r10] = r3
            java.lang.String r4 = "cdntra read xml  comptype:%d url:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r4, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x0136
            java.lang.String r0 = "cdntra get cdnUrlfailed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x00fe
        L_0x0136:
            java.lang.String r1 = ".msg.img.$aeskey"
            java.lang.Object r1 = r0.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r1 == 0) goto L_0x014b
            java.lang.String r0 = "cdntra get aes key failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x00fe
        L_0x014b:
            int r1 = r14.f267386m
            long r10 = (long) r1
            java.lang.String r1 = r29.mo108768t()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r21 = r2
            r20 = r3
            long r2 = r29.getMsgId()
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            java.lang.String r3 = "downimg"
            java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r3, r10, r1, r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x018c
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            long r1 = r29.mo108774y2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r11 = 0
            r0[r11] = r1
            java.lang.String r1 = "cdntra genClientId failed not use cdn imgLocalId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r1, r0)
            r6 = r28
            goto L_0x021a
        L_0x018c:
            r10 = 1
            r11 = 0
            java.lang.String r1 = ".msg.img.$md5"
            java.lang.Object r0 = r0.get(r1)
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            gi.g r3 = new gi.g
            r3.<init>()
            java.lang.String r0 = "task_ChattingEditModeLogic_1"
            r3.f287660d = r0
            com.tencent.mm.ui.chatting.w0 r2 = new com.tencent.mm.ui.chatting.w0
            r19 = 4
            r0 = r2
            r1 = r29
            r11 = r2
            r2 = r19
            r23 = r3
            r22 = r20
            r3 = r21
            r24 = r4
            r4 = r28
            r18 = r7
            r7 = r15
            r25 = r8
            r8 = r18
            r26 = r9
            r9 = r14
            r12 = 1
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r23
            r0.f287662f = r11
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r26
            r3.append(r4)
            long r5 = r29.getMsgId()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "checkExist"
            r6 = r28
            java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r5, r1, r6, r3)
            r0.field_mediaId = r1
            r1 = r22
            r0.field_fileId = r1
            r1 = r24
            r0.field_aesKey = r1
            r0.field_filemd5 = r15
            r10 = r21
            r0.field_fileType = r10
            r0.field_talker = r6
            r1 = 2
            r0.field_priority = r1
            r0.field_svr_signature = r4
            r0.field_onlycheckexist = r12
            r0.field_trysafecdn = r12
            java.lang.Class<qo.l> r1 = p663qo.C101213l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qo.l r1 = (p663qo.C101213l) r1
            boolean r0 = r1.if0(r0)
            if (r0 != 0) goto L_0x021c
            java.lang.String r0 = "check exist fail! download img before retransmit"
            r1 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x021a:
            r15 = 0
            goto L_0x021d
        L_0x021c:
            r15 = 1
        L_0x021d:
            if (r15 != 0) goto L_0x022d
            r0 = r27
            r1 = r14
            r2 = r29
            r3 = r17
            r4 = r28
            r5 = r16
            m88759c(r0, r1, r2, r3, r4, r5)
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88752K(android.content.Context, java.lang.String, com.tencent.mm.storage.f4):void");
    }

    /* renamed from: L */
    public static void m88753L(Context context, String str, C72963f4 f4Var, boolean z) {
        if (m88756O(context, str, f4Var, FirebaseAnalytics.C113379b.LOCATION)) {
            C7250m.m7431a().mo136257Tm(str, m88760d(f4Var.getContent(), f4Var.mo108769t2(), z), 48, 0);
        }
    }

    /* renamed from: M */
    public static void m88754M(Context context, String str, C72963f4 f4Var, boolean z) {
        if (m88756O(context, str, f4Var, MimeTypes.BASE_TYPE_TEXT)) {
            String d = m88760d(f4Var.getContent(), f4Var.mo108769t2(), z);
            if (d == null || d.equals("")) {
                Log.m105920e("MicroMsg.ChattingEditModeLogic", "Transfer text erro: content null");
                return;
            }
            C7250m.m7431a().mo136255QA(str, d, C45628s0.m50810y(str), 0, f4Var.getMsgId());
        }
    }

    /* renamed from: N */
    public static void m88755N(Context context, String str, C72963f4 f4Var) {
        String str2 = str;
        C72963f4 f4Var2 = f4Var;
        if (m88756O(context, str2, f4Var2, "video") && f4Var2 != null) {
            if (!f4Var.mo100989b4() || !C98429r0.m127812c(f4Var.mo108765s2())) {
                C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
                if (Zd == null || Zd.f288562i != 199) {
                    Map<String, String> parseXml = XmlParser.parseXml(Zd.mo137705i(), "msg", (String) null);
                    boolean z = false;
                    if (parseXml == null) {
                        Log.m105928w("MicroMsg.ChattingEditModeLogic", "%s cdntra parse video recv xml failed");
                    } else {
                        String str3 = parseXml.get(".msg.videomsg.$cdnvideourl");
                        if (!Util.isNullOrNil(str3)) {
                            String str4 = parseXml.get(".msg.videomsg.$aeskey");
                            String str5 = parseXml.get(".msg.videomsg.$md5");
                            String str6 = parseXml.get(".msg.videomsg.$newmd5");
                            int i = Util.getInt(parseXml.get(".msg.videomsg.$length"), 0);
                            int i2 = Util.getInt(parseXml.get(".msg.videomsg.$playlength"), 0);
                            int i3 = Util.getInt(parseXml.get(".msg.videomsg.$cdnthumblength"), 0);
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.idkeyStat(1328, 12, 1, true);
                            if (Util.isNullOrNil(str5)) {
                                if (!C86013q1.m106450k(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(Zd.mo137700d()))) {
                                    Log.m105925i("MicroMsg.ChattingEditModeLogic", "checkVideoCdnInfo md5 %s", str5);
                                    nVar.idkeyStat(1328, 2, 1, true);
                                }
                            }
                            C98124g gVar = new C98124g();
                            gVar.f287660d = "task_ChattingEditModeLogic_2";
                            C97186z0 z0Var = r0;
                            C98124g gVar2 = gVar;
                            String str7 = "MicroMsg.ChattingEditModeLogic";
                            C97186z0 z0Var2 = new C97186z0(str3, str4, i3, i, str, str5, str6, f4Var, i2);
                            gVar2.f287662f = z0Var;
                            long nowMilliSecond = Util.nowMilliSecond();
                            gVar2.field_mediaId = C1297x.m1387b("checkExist", nowMilliSecond, str2, "" + f4Var.getMsgId());
                            gVar2.field_fileId = str3;
                            gVar2.field_aesKey = str4;
                            gVar2.field_filemd5 = str5;
                            gVar2.field_fileType = 4;
                            gVar2.field_talker = str2;
                            gVar2.field_priority = 2;
                            gVar2.field_svr_signature = "";
                            gVar2.field_onlycheckexist = true;
                            gVar2.field_trysafecdn = true;
                            if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar2)) {
                                Log.m105920e(str7, "check exist fail! download video before retransmit");
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        C86709a0.m107525e().postToWorker(new C73308a1(f4Var, str2));
                        return;
                    }
                    return;
                }
                m88758b(Zd, f4Var.mo108765s2(), str, Zd.f288572s, Zd.f288566m, Zd.mo137705i(), f4Var.getType(), f4Var.getMsgId());
            }
        }
    }

    /* renamed from: O */
    public static boolean m88756O(Context context, String str, C72963f4 f4Var, String str2) {
        if (context == null) {
            Log.m105929w("MicroMsg.ChattingEditModeLogic", "send %s fail, context is null", str2);
            return false;
        } else if (Util.isNullOrNil(str)) {
            Log.m105929w("MicroMsg.ChattingEditModeLogic", "send %s fail, username is null", str2);
            return false;
        } else if (f4Var != null) {
            return true;
        } else {
            Log.m105929w("MicroMsg.ChattingEditModeLogic", "send %s fail, msg is null", str2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88757a(p1081gi.C98121d r29, com.tencent.p014mm.storage.C72963f4 r30, int r31, int r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, int r37) {
        /*
            r0 = r29
            r12 = r33
            r13 = r35
            r14 = r37
            java.lang.Class<f62.k0> r15 = f62.C75700k0.class
            java.lang.Class<gt.k> r16 = p158gt.C98201k.class
            di3.d r1 = di3.C86312j.m106911c(r16)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.String r2 = r30.mo108765s2()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            java.lang.String r11 = r1.b00(r2)
            com.tencent.mm.pointers.PString r10 = new com.tencent.mm.pointers.PString
            r10.<init>()
            com.tencent.mm.pointers.PInt r17 = new com.tencent.mm.pointers.PInt
            r17.<init>()
            com.tencent.mm.pointers.PInt r18 = new com.tencent.mm.pointers.PInt
            r18.<init>()
            java.lang.String r9 = ""
            r10.value = r9
            com.tencent.mm.storage.f4 r8 = new com.tencent.mm.storage.f4
            r8.<init>()
            int r1 = eb0.C45628s0.m50808x(r33)
            r8.setType(r1)
            r8.mo108749c3(r12)
            r7 = 1
            r8.mo108740T2(r7)
            r8.mo100991d(r7)
            java.lang.String r1 = r8.mo108768t()
            long r1 = eb0.C75604z3.m90843o(r1)
            r8.mo108733M2(r1)
            r8.mo108732L2(r13)
            cj.a r1 = p876cj.C67380a.C67381a.m79751a()
            fw0.w$c r1 = (fw0.C87107w.C75813c) r1
            r1.mo106108c(r8)
            k40.a r1 = f40.C86709a0.m107533q(r15)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            long r5 = r1.my0(r8)
            r19 = 0
            r4 = 0
            int r1 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r1 < 0) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            junit.framework.Assert.assertTrue(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NetSceneUploadMsgImg: local msgId = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.ChattingEditModeLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r14 != r7) goto L_0x00cb
            di3.d r1 = di3.C86312j.m106911c(r16)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            r21 = 0
            r22 = 0
            r23 = 1
            java.lang.String r24 = r8.getContent()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            r2 = r33
            r25 = r3
            r3 = r21
            r4 = r22
            r21 = r5
            r7 = r23
            r32 = r8
            r8 = r24
            r26 = r9
            r9 = r10
            r23 = r10
            r10 = r17
            r12 = r11
            r11 = r18
            long r1 = r1.yu0(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r10 = r1
            goto L_0x00d8
        L_0x00cb:
            r25 = r3
            r21 = r5
            r32 = r8
            r26 = r9
            r23 = r10
            r12 = r11
            r10 = r19
        L_0x00d8:
            di3.d r1 = di3.C86312j.m106911c(r16)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            r3 = 0
            r4 = 0
            r7 = 0
            java.lang.String r8 = r32.getContent()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            r2 = r33
            r5 = r21
            r9 = r23
            r27 = r10
            r10 = r17
            r11 = r18
            long r10 = r1.yu0(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r1 = 0
            java.lang.String r2 = "msg"
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r2, r1)
            java.lang.String r2 = ".msg.img.$length"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r0.field_thumbimgLength
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            di3.d r3 = di3.C86312j.m106911c(r16)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            com.tencent.mm.modelimage.k r3 = r3.mo127194nP(r4)
            r4 = r21
            int r6 = (int) r4
            long r6 = (long) r6
            r3.mo127124A(r6)
            int r6 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r6 <= 0) goto L_0x018c
            di3.d r6 = di3.C86312j.m106911c(r16)
            gt.k r6 = (p158gt.C98201k) r6
            gt.m r6 = r6.mo137277xi()
            r7 = r23
            java.lang.String r8 = r7.value
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            java.lang.String r9 = "th_"
            r35 = r2
            r13 = r26
            r2 = 0
            java.lang.String r6 = r6.mo127174TY(r8, r9, r13, r2)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r2] = r6
            java.lang.String r2 = "deal send img for cdn [%s]"
            r8 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r9)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r12, r6)
            java.lang.String r2 = r7.value
            r6 = r32
            r6.mo108739S2(r2)
            int r2 = r30.mo108725D2()
            r6.mo108752f3(r2)
            int r2 = r30.mo108724C2()
            r6.mo108751e3(r2)
            r7 = r27
            int r2 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r2 <= 0) goto L_0x0194
            r2 = 1
            r3.mo127149t(r2)
            int r2 = (int) r7
            r3.mo127151v(r2)
            java.lang.String r2 = ".msg.img.$hdlength"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.field_thumbimgLength
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            goto L_0x0196
        L_0x018c:
            r6 = r32
            r35 = r2
            r13 = r26
            r7 = r27
        L_0x0194:
            r2 = r35
        L_0x0196:
            di3.d r1 = di3.C86312j.m106911c(r16)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            r1.Dx0(r9, r3)
            r1 = 1
            if (r14 != r1) goto L_0x01c1
            di3.d r1 = di3.C86312j.m106911c(r16)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            com.tencent.mm.modelimage.k r3 = r1.mo127194nP(r3)
            goto L_0x01c2
        L_0x01c1:
            r7 = r10
        L_0x01c2:
            k40.a r1 = f40.C86709a0.m107533q(r15)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.xy0(r4, r6)
            di3.d r1 = di3.C86312j.m106911c(r16)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            r1.Dx0(r9, r3)
            r21 = r4
            long r4 = r6.getCreateTime()
            java.lang.String r1 = r6.mo108768t()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            r15 = r12
            long r12 = r6.getMsgId()
            r9.append(r12)
            java.lang.String r12 = "_"
            r9.append(r12)
            r9.append(r7)
            r9.append(r12)
            r9.append(r14)
            java.lang.String r7 = r9.toString()
            java.lang.String r8 = "upimg"
            java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r8, r4, r1, r7)
            te3.on4 r4 = new te3.on4
            r4.<init>()
            te3.rv3 r5 = new te3.rv3
            r5.<init>()
            r7 = r34
            r5.mo73357f(r7)
            r4.f299056e = r5
            te3.rv3 r5 = new te3.rv3
            r5.<init>()
            r7 = r33
            r8 = r15
            r5.mo73357f(r7)
            r4.f299057f = r5
            int r5 = r6.getType()
            r4.f299062n = r5
            java.lang.String r5 = r6.mo108773x2()
            r4.f299063o = r5
            int r5 = r3.mo127137h()
            r4.f299042H = r5
            te3.rv3 r5 = new te3.rv3
            r5.<init>()
            r5.mo73357f(r1)
            r4.f299055d = r5
            r4.f299064p = r14
            r1 = r36
            r0.field_filemd5 = r1
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            int r1 = (int) r7
            r0.field_thumbimgLength = r1
            long r1 = (long) r2
            r0.field_fileLength = r1
            com.tencent.mm.modelimage.c r1 = com.tencent.p014mm.modelimage.C92808c.m116996f()
            r2 = r31
            r1.mo127071k(r2)
            r1.mo127068h(r4)
            r1.mo127067g(r3)
            r1.mo127069i(r0)
            com.tencent.mm.ui.chatting.x0 r0 = new com.tencent.mm.ui.chatting.x0
            r2 = r21
            r0.<init>(r10, r2)
            r1.mo127070j(r0)
            java.lang.String r0 = r6.mo108768t()
            r1.mo140198e(r0)
            pc0.a0$b r0 = r1.mo140195a()
            r0.mo123694a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88757a(gi.d, com.tencent.mm.storage.f4, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: b */
    public static void m88758b(C98408n0 n0Var, String str, String str2, int i, int i2, String str3, int i3, long j) {
        String str4;
        C98408n0 Zd;
        C98408n0 n0Var2 = n0Var;
        String str5 = str;
        long j2 = j;
        Class cls = C101491u.class;
        Log.m105919d("MicroMsg.ChattingEditModeLogic", "copy video fileName %s userName %s export %d videoLength %d", str5, str2, Integer.valueOf(i), Integer.valueOf(i2));
        C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
        String a = C98426q0.m127793a(str2);
        C98410o0 o0Var = (C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0();
        String q = o0Var.mo137728q(str5);
        String q2 = o0Var.mo137728q(a);
        String r = o0Var.mo137729r(str5);
        String r2 = o0Var.mo137729r(a);
        Log.m105919d("MicroMsg.ChattingEditModeLogic", "copy video: srcFullPath[%s] destFullPath[%s] srcThumbPath[%s] destThumbPath[%s]", q, q2, r, r2);
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1;
        Log.m105924i("MicroMsg.ChattingEditModeLogic", "copy video, use link:" + z);
        C86013q1.m106443d(q, q2, z);
        C86013q1.m106443d(r, r2, z);
        if (!C98429r0.m127830u() || n0Var2 == null || (Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(n0Var2.f288546N)) == null || Zd.f288562i != 199) {
            str4 = null;
        } else {
            String str6 = a + FirebaseAnalytics.C113379b.ORIGIN;
            String q3 = o0Var.mo137728q(n0Var2.f288546N);
            String q4 = o0Var.mo137728q(str6);
            Log.m105919d("MicroMsg.ChattingEditModeLogic", "copy origin video: src path[%s] dst path[%s]", q3, q4);
            C86013q1.m106443d(q3, q4, z);
            C98429r0.m127827r(str6, (String) null, i2, str2, (String) null, i, str3, i3, (tc4) null, "", (long) ((int) j2), (String) null, "", true);
            str4 = str6;
        }
        if (n0Var2 != null && z) {
            WxFileIndexDirtyEvent wxFileIndexDirtyEvent = new WxFileIndexDirtyEvent();
            wxFileIndexDirtyEvent.f79070d.f79071a = n0Var2.f288567n;
            wxFileIndexDirtyEvent.publish();
        }
        String f = n0Var2 != null ? n0Var.mo137702f() : null;
        if (Util.isNullOrNil(str4)) {
            C98429r0.m127826q(a, (String) null, i2, str2, f, i, str3, i3, (tc4) null, "", (long) ((int) j2), (String) null, "");
        } else {
            C98429r0.m127826q(a, str4, i2, str2, f, i, str3, i3, (tc4) null, "", (long) ((int) j2), (String) null, "");
        }
        ((C101491u) C86312j.m106911c(cls)).mo140800Ic(a);
    }

    /* renamed from: c */
    public static void m88759c(Context context, C92836k kVar, C72963f4 f4Var, int i, String str, String str2) {
        C92836k kVar2 = kVar;
        String str3 = str;
        Class cls = C98201k.class;
        String gY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127186gY(((C76053l) C86312j.m106911c(C76053l.class)).mo106262y8(kVar2), "", "");
        PString pString = new PString();
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        pString.value = gY;
        int f = kVar.mo127135f();
        long xs02 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).xs0(f4Var.mo108768t(), gY, f, i, 0, pString, pInt, pInt2);
        C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(xs02));
        boolean z = true;
        nP.mo127153x(1);
        C72963f4 f4Var2 = new C72963f4();
        f4Var2.setType(C45628s0.m50808x(str));
        f4Var2.mo108749c3(str3);
        f4Var2.mo108740T2(1);
        f4Var2.mo100991d(1);
        f4Var2.mo108739S2(pString.value);
        f4Var2.mo108752f3(pInt.value);
        f4Var2.mo108751e3(pInt2.value);
        f4Var2.mo108733M2(C75604z3.m90843o(f4Var2.mo108768t()));
        if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var2.mo108768t())) {
            f4Var.mo101012p4(C48340e.m53669j());
        } else {
            C72963f4 f4Var3 = f4Var;
        }
        long my02 = ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var2);
        if (my02 < 0) {
            z = false;
        }
        Assert.assertTrue(z);
        Log.m105924i("MicroMsg.ChattingEditModeLogic", "NetSceneUploadMsgImg: local msgId = " + my02);
        nP.mo127124A((long) ((int) my02));
        ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(xs02), nP);
        HashMap hashMap = new HashMap();
        hashMap.put(Long.valueOf(my02), kVar2);
        ((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127101c(kVar.mo127140k(), f4Var.getMsgId(), f, hashMap, C0966R.C0969drawable.by8, new C74344a(context, str3, kVar2, str2));
    }

    /* renamed from: d */
    public static String m88760d(String str, int i, boolean z) {
        return (!z || str == null || i != 0) ? str : C75604z3.m90849u(str);
    }

    /* renamed from: e */
    public static int m88761e(List<C72963f4> list) {
        int i = 0;
        if (list == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "get invalid send to friend msg num error, select item empty");
            return 0;
        }
        for (C72963f4 next : list) {
            if (next.mo100995g4() || m88747F(next) || next.mo100982U3() || m88742A(next) || m88746E(next) || m88771o(next)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static List<String> m88762f() {
        List<String> bO = C48009v0.Fx0().mo72763bO(25);
        C47976j Fx0 = C48009v0.Fx0();
        Fx0.getClass();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        Fx0.mo72752CP(sb);
        Fx0.mo72766kD(sb);
        Fx0.mo72770qq(sb);
        Fx0.mo72755Lo(sb, true);
        sb.append(" order by ");
        sb.append("rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatLst sql %s", sb4);
        Cursor rawQuery = Fx0.rawQuery(sb4, new String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(rawQuery.getString(0));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String p2 = C47984k.m53328b(str).mo73498p2();
            if (!Util.isNullOrNil(p2)) {
                hashMap.put(p2, str);
            }
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (String next : bO) {
            if (!C47984k.m53338l(next)) {
                linkedList.add(next);
            } else if (C47984k.m53336j(next)) {
                String str2 = C47984k.m53328b(next).field_enterpriseFather;
                if (!linkedList2.contains(str2) && ((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(str2)) {
                    linkedList2.add(str2);
                    String str3 = (String) hashMap.get(str2);
                    if (!Util.isNullOrNil(str3)) {
                        linkedList2.add(str3);
                    }
                }
            }
        }
        for (String str4 : hashMap.values()) {
            if (!Util.isNullOrNil(str4) && !linkedList2.contains(str4)) {
                linkedList2.add(str4);
            }
        }
        linkedList.addAll(linkedList2);
        Log.m105919d("MicroMsg.ChattingEditModeLogic", "get selected accept list, size %d", Integer.valueOf(linkedList.size()));
        return linkedList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x016e, code lost:
        if (r21.mo22503s0() == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0194, code lost:
        if (m88744C(r14) != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01df, code lost:
        if (r14.getType() == 536936497) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01fa, code lost:
        r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r14.getContent(), (java.lang.String) null);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88763g(boolean r18, java.util.List<com.tencent.p014mm.storage.C72963f4> r19, java.lang.String r20, s90.C77632o r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_forward_card
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            r5 = 0
            if (r1 == 0) goto L_0x0250
            boolean r6 = r19.isEmpty()
            if (r6 == 0) goto L_0x0015
            goto L_0x0250
        L_0x0015:
            int r6 = r19.size()
            r7 = 977272881(0x3a400031, float:7.324247E-4)
            r8 = 486539313(0x1d000031, float:1.6940758E-21)
            r9 = 318767153(0x13000031, float:1.6155966E-27)
            r10 = -1879048186(0xffffffff90000006, float:-2.5243567E-29)
            r11 = 1076887601(0x40300031, float:2.7500117)
            r12 = 788529201(0x2f000031, float:1.16416E-10)
            r13 = 889192497(0x35000031, float:4.7683994E-7)
            r14 = 922746929(0x37000031, float:7.629439E-6)
            r15 = 1
            if (r6 != r15) goto L_0x00e4
            if (r21 == 0) goto L_0x003c
            boolean r6 = r21.mo22503s0()
            if (r6 != 0) goto L_0x003e
        L_0x003c:
            if (r0 == 0) goto L_0x00e4
        L_0x003e:
            java.lang.Object r1 = r1.get(r5)
            com.tencent.mm.storage.f4 r1 = (com.tencent.p014mm.storage.C72963f4) r1
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            int r3 = r4.mo58779Qe(r3, r5)
            if (r3 != r15) goto L_0x0052
            r3 = 1
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            boolean r4 = m88773q(r1)
            if (r4 == 0) goto L_0x006d
            if (r3 == 0) goto L_0x00e3
            boolean r3 = m88774r(r1)
            if (r3 != 0) goto L_0x00e3
            boolean r2 = m88743B(r1, r2)
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88744C(r1)
            if (r2 != 0) goto L_0x00e3
        L_0x006d:
            boolean r2 = r1.mo100995g4()
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88747F(r1)
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88742A(r1)
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88746E(r1)
            if (r2 != 0) goto L_0x00e3
            int r2 = r1.getType()
            if (r2 == r10) goto L_0x00e3
            int r2 = r1.getType()
            if (r2 == r9) goto L_0x00e3
            int r2 = r1.getType()
            if (r2 == r7) goto L_0x00e3
            int r2 = r1.getType()
            if (r2 != r8) goto L_0x009f
            if (r0 != 0) goto L_0x00e3
        L_0x009f:
            boolean r2 = m88776t(r1)
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88771o(r1)
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88772p(r1)
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88770n(r1)
            if (r2 != 0) goto L_0x00e3
            boolean r2 = m88768l(r1)
            if (r2 != 0) goto L_0x00e3
            boolean r0 = m88765i(r1, r0)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = m88767k(r1)
            if (r0 != 0) goto L_0x00e3
            int r0 = r1.getType()
            if (r0 == r12) goto L_0x00e3
            int r0 = r1.getType()
            if (r0 == r11) goto L_0x00e3
            int r0 = r1.getType()
            if (r0 == r13) goto L_0x00e3
            int r0 = r1.getType()
            if (r0 != r14) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            return r15
        L_0x00e3:
            return r5
        L_0x00e4:
            java.util.Iterator r1 = r19.iterator()
            r6 = 1
        L_0x00e9:
            boolean r16 = r1.hasNext()
            if (r16 == 0) goto L_0x024f
            java.lang.Object r16 = r1.next()
            r14 = r16
            com.tencent.mm.storage.f4 r14 = (com.tencent.p014mm.storage.C72963f4) r14
            r13 = 24
            r11 = 0
            if (r21 == 0) goto L_0x0102
            boolean r17 = r21.mo22503s0()
            if (r17 != 0) goto L_0x0104
        L_0x0102:
            if (r0 == 0) goto L_0x01f2
        L_0x0104:
            di3.d r17 = di3.C86312j.m106911c(r4)
            r12 = r17
            h81.h r12 = (h81.C32735h) r12
            int r12 = r12.mo58779Qe(r3, r5)
            if (r12 != r15) goto L_0x0114
            r12 = 1
            goto L_0x0115
        L_0x0114:
            r12 = 0
        L_0x0115:
            boolean r17 = r14.mo100995g4()
            if (r17 != 0) goto L_0x01e1
            boolean r17 = m88747F(r14)
            if (r17 != 0) goto L_0x01e1
            boolean r17 = m88742A(r14)
            if (r17 != 0) goto L_0x01e1
            boolean r17 = m88746E(r14)
            if (r17 != 0) goto L_0x01e1
            int r15 = r14.getType()
            if (r15 == r10) goto L_0x01e1
            int r15 = r14.getType()
            if (r15 != r8) goto L_0x013b
            if (r0 != 0) goto L_0x01e1
        L_0x013b:
            boolean r15 = m88776t(r14)
            if (r15 != 0) goto L_0x01e1
            boolean r15 = m88771o(r14)
            if (r15 != 0) goto L_0x01e1
            boolean r15 = m88745D(r14)
            if (r15 == 0) goto L_0x0155
            if (r21 == 0) goto L_0x01e1
            boolean r15 = r21.mo22503s0()
            if (r15 == 0) goto L_0x01e1
        L_0x0155:
            java.lang.String r15 = r14.getContent()
            com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15, r11)
            if (r11 == 0) goto L_0x0165
            int r11 = r11.f195582i
            if (r11 != r13) goto L_0x0165
            r11 = 1
            goto L_0x0166
        L_0x0165:
            r11 = 0
        L_0x0166:
            if (r11 == 0) goto L_0x0170
            if (r21 == 0) goto L_0x01e1
            boolean r11 = r21.mo22503s0()
            if (r11 == 0) goto L_0x01e1
        L_0x0170:
            int r11 = r14.getType()
            if (r11 == r9) goto L_0x01e1
            int r11 = r14.getType()
            if (r11 == r7) goto L_0x01e1
            boolean r11 = m88773q(r14)
            if (r11 == 0) goto L_0x0196
            if (r12 == 0) goto L_0x01e1
            boolean r11 = m88774r(r14)
            if (r11 != 0) goto L_0x01e1
            boolean r11 = m88743B(r14, r2)
            if (r11 != 0) goto L_0x01e1
            boolean r11 = m88744C(r14)
            if (r11 != 0) goto L_0x01e1
        L_0x0196:
            boolean r11 = m88772p(r14)
            if (r11 != 0) goto L_0x01e1
            boolean r11 = m88770n(r14)
            if (r11 != 0) goto L_0x01e1
            boolean r11 = m88768l(r14)
            if (r11 != 0) goto L_0x01e1
            boolean r11 = m88765i(r14, r0)
            if (r11 != 0) goto L_0x01e1
            boolean r11 = m88767k(r14)
            if (r11 != 0) goto L_0x01e1
            int r11 = r14.getType()
            r12 = 788529201(0x2f000031, float:1.16416E-10)
            if (r11 == r12) goto L_0x01e1
            int r11 = r14.getType()
            r12 = 1076887601(0x40300031, float:2.7500117)
            if (r11 == r12) goto L_0x01e1
            int r11 = r14.getType()
            r12 = 889192497(0x35000031, float:4.7683994E-7)
            if (r11 == r12) goto L_0x01e1
            int r11 = r14.getType()
            r12 = 922746929(0x37000031, float:7.629439E-6)
            if (r11 == r12) goto L_0x01e1
            int r11 = r14.getType()
            r12 = 536936497(0x20010031, float:1.0926788E-19)
            if (r11 != r12) goto L_0x01e5
        L_0x01e1:
            r1.remove()
            r6 = 0
        L_0x01e5:
            r12 = 788529201(0x2f000031, float:1.16416E-10)
            r13 = 1076887601(0x40300031, float:2.7500117)
            r14 = 922746929(0x37000031, float:7.629439E-6)
            r15 = 889192497(0x35000031, float:4.7683994E-7)
            goto L_0x0246
        L_0x01f2:
            boolean r12 = m88745D(r14)
            if (r12 != 0) goto L_0x0236
            if (r14 == 0) goto L_0x020a
            java.lang.String r12 = r14.getContent()
            com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r11)
            if (r11 == 0) goto L_0x020a
            int r11 = r11.f195582i
            if (r11 != r13) goto L_0x020a
            r11 = 1
            goto L_0x020b
        L_0x020a:
            r11 = 0
        L_0x020b:
            if (r11 != 0) goto L_0x0236
            int r11 = r14.getType()
            r12 = 788529201(0x2f000031, float:1.16416E-10)
            if (r11 == r12) goto L_0x0239
            int r11 = r14.getType()
            r13 = 1076887601(0x40300031, float:2.7500117)
            if (r11 == r13) goto L_0x023c
            int r11 = r14.getType()
            r15 = 889192497(0x35000031, float:4.7683994E-7)
            if (r11 == r15) goto L_0x0232
            int r11 = r14.getType()
            r14 = 922746929(0x37000031, float:7.629439E-6)
            if (r11 != r14) goto L_0x0246
            goto L_0x0242
        L_0x0232:
            r14 = 922746929(0x37000031, float:7.629439E-6)
            goto L_0x0242
        L_0x0236:
            r12 = 788529201(0x2f000031, float:1.16416E-10)
        L_0x0239:
            r13 = 1076887601(0x40300031, float:2.7500117)
        L_0x023c:
            r14 = 922746929(0x37000031, float:7.629439E-6)
            r15 = 889192497(0x35000031, float:4.7683994E-7)
        L_0x0242:
            r1.remove()
            r6 = 0
        L_0x0246:
            r11 = 1076887601(0x40300031, float:2.7500117)
            r13 = 889192497(0x35000031, float:4.7683994E-7)
            r15 = 1
            goto L_0x00e9
        L_0x024f:
            return r6
        L_0x0250:
            java.lang.String r0 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r1 = "check contain invalid send to friend msg error, select item empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88763g(boolean, java.util.List, java.lang.String, s90.o):boolean");
    }

    /* renamed from: h */
    public static void m88764h(EmojiInfo emojiInfo, String str) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        String K1 = emojiInfo.mo62640K1();
        if (C86013q1.m106451l(K1 + "_thumb") > 0) {
            int l = (int) C86013q1.m106451l(K1 + "_thumb");
            wXMediaMessage.thumbData = C86013q1.m106433O(K1 + "_thumb", 0, l);
        } else {
            try {
                InputStream E = C86013q1.m106423E(K1);
                wXMediaMessage.setThumbImage(BackwardSupportUtil.BitmapFactory.decodeStream(E, 1.0f));
                E.close();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ChattingEditModeLogic", e, "", new Object[0]);
                Log.m105920e("MicroMsg.ChattingEditModeLogic", "sendAppMsgEmoji Fail cause there is no thumb");
            }
        }
        wXMediaMessage.mediaObject = new WXEmojiObject(K1);
        C72695v.m85049B(wXMediaMessage, emojiInfo.field_app_id, (String) null, str, 1, emojiInfo.getMd5());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2.getContent(), (java.lang.String) null);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88765i(com.tencent.p014mm.storage.C72963f4 r2, boolean r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.getContent()
            r3 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            if (r2 == 0) goto L_0x001d
            int r3 = r2.f195582i
            r1 = 33
            if (r3 != r1) goto L_0x001d
            int r2 = r2.f195581h2
            r3 = 1
            if (r2 != r3) goto L_0x001d
            return r3
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88765i(com.tencent.mm.storage.f4, boolean):boolean");
    }

    /* renamed from: j */
    public static boolean m88766j(C72963f4 f4Var) {
        if (!f4Var.mo101022y3()) {
            return true;
        }
        C72989o2 o2Var = new C72989o2(f4Var.getContent());
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
        if (u == null) {
            u = new C68070l.C68072b();
            u.f195610p = o2Var.f212821d;
        }
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(u.f195610p) != null;
    }

    /* renamed from: k */
    public static boolean m88767k(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.mo108769t2() == 0 ? C75604z3.m90849u(f4Var.getContent()) : f4Var.getContent(), (String) null);
        if (u != null) {
            return u.f195483E2 == 1;
        }
        Log.m105928w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, parse app message content fail");
        return false;
    }

    /* renamed from: l */
    public static boolean m88768l(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, check msg error, msg is null");
            return true;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.mo108769t2() == 0 ? C75604z3.m90849u(f4Var.getContent()) : f4Var.getContent(), (String) null);
        if (u == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, parse app message content fail");
            return false;
        } else if (u.f195605n2 != 0) {
            return true;
        } else {
            int i = u.f195582i;
            if (i == 33 && u.f195581h2 == 3) {
                return true;
            }
            if (i == 36 && u.f195581h2 == 3) {
                return true;
            }
            if (i == 46 && u.f195581h2 == 3) {
                return true;
            }
            if (i != 44 || (u.f195581h2 != 3 && u.mo93554q(false))) {
                return u.f195582i == 48 && u.f195581h2 == 3;
            }
            return true;
        }
    }

    /* renamed from: m */
    public static boolean m88769m(C72963f4 f4Var) {
        C68070l.C68072b u;
        if (f4Var == null || (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) == null) {
            return false;
        }
        int i = u.f195582i;
        return i == 6 || i == 5 || i == 19;
    }

    /* renamed from: n */
    public static boolean m88770n(C72963f4 f4Var) {
        if (f4Var == null || !f4Var.mo100967F3()) {
            return false;
        }
        long msgId = f4Var.getMsgId();
        String content = f4Var.getContent();
        C101611g<Long, C77629i> gVar = C92721n.f266840a;
        if (content == null) {
            return false;
        }
        C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(msgId, content);
        if (JZ != null) {
            return JZ.f226296j == 1;
        }
        Log.m105928w("MicroMsg.AppMsgBizHelper", "isBizMsgForbidForward reader is null");
        return false;
    }

    /* renamed from: o */
    public static boolean m88771o(C72963f4 f4Var) {
        return f4Var.getType() == 436207665 || f4Var.getType() == 469762097;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2.getContent(), (java.lang.String) null);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88772p(com.tencent.p014mm.storage.C72963f4 r2) {
        /*
            if (r2 == 0) goto L_0x0020
            boolean r0 = r2.mo101020w3()
            if (r0 == 0) goto L_0x0020
            java.lang.String r2 = r2.getContent()
            r0 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r0)
            if (r2 == 0) goto L_0x0020
            int r0 = r2.f195582i
            r1 = 6
            if (r0 != r1) goto L_0x0020
            int r2 = r2.f195594l
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 < r0) goto L_0x0020
            r2 = 1
            return r2
        L_0x0020:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88772p(com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: q */
    public static boolean m88773q(C72963f4 f4Var) {
        if (f4Var.mo100981T3() || !f4Var.mo100975N3()) {
            return false;
        }
        C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
        return Util.isNullOrNil(Rv0.f212675a) || !C45628s0.m50738C(Rv0.f212675a);
    }

    /* renamed from: r */
    public static boolean m88774r(C72963f4 f4Var) {
        if (f4Var.mo100981T3()) {
            return false;
        }
        C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
        String str = Rv0.f212675a;
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ChattingEditModeLogic", "getView : parse possible friend msg failed");
        }
        int i = Rv0.f212691q;
        Set<String> set = C45628s0.f123410p;
        return !C72996z1.m85810M4(i) && f4Var.getType() == 42 && (f4Var.f230723F & 512) > 0;
    }

    /* renamed from: s */
    public static boolean m88775s(C72963f4 f4Var) {
        C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
        String str = Rv0.f212675a;
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ChattingEditModeLogic", "getView : parse possible friend msg failed");
        }
        int i = Rv0.f212691q;
        Set<String> set = C45628s0.f123410p;
        return !C72996z1.m85810M4(i) && f4Var.getType() == 42 && (f4Var.f230723F & 2048) > 0;
    }

    /* renamed from: t */
    public static boolean m88776t(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        if (u == null || u.f195582i != 16) {
            return u != null && u.f195582i == 34;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88777u(java.util.List<com.tencent.p014mm.storage.C72963f4> r4) {
        /*
            r0 = 1
            if (r4 == 0) goto L_0x0068
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x000a
            goto L_0x0068
        L_0x000a:
            java.util.Iterator r4 = r4.iterator()
        L_0x000e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r4.next()
            com.tencent.mm.storage.f4 r1 = (com.tencent.p014mm.storage.C72963f4) r1
            boolean r2 = r1.mo100995g4()
            if (r2 != 0) goto L_0x0065
            boolean r2 = m88747F(r1)
            if (r2 != 0) goto L_0x0065
            boolean r2 = r1.mo100975N3()
            if (r2 != 0) goto L_0x0065
            boolean r2 = m88742A(r1)
            if (r2 != 0) goto L_0x0065
            boolean r2 = m88746E(r1)
            if (r2 != 0) goto L_0x0065
            int r2 = r1.getType()
            r3 = -1879048186(0xffffffff90000006, float:-2.5243567E-29)
            if (r2 == r3) goto L_0x0065
            boolean r2 = m88776t(r1)
            if (r2 != 0) goto L_0x0065
            boolean r2 = m88771o(r1)
            if (r2 != 0) goto L_0x0065
            boolean r2 = m88770n(r1)
            if (r2 != 0) goto L_0x0065
            boolean r2 = m88768l(r1)
            if (r2 != 0) goto L_0x0065
            boolean r2 = m88782z(r1)
            if (r2 != 0) goto L_0x0065
            boolean r1 = m88767k(r1)
            if (r1 == 0) goto L_0x000e
        L_0x0065:
            return r0
        L_0x0066:
            r4 = 0
            return r4
        L_0x0068:
            java.lang.String r4 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r1 = "check contain invalid send to brand msg error, selected item empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88777u(java.util.List):boolean");
    }

    /* renamed from: v */
    public static boolean m88778v(List<C72963f4> list) {
        C98442x0 b;
        if (list != null && !list.isEmpty()) {
            for (C72963f4 next : list) {
                if (next.mo100994f4() && (b = C98442x0.f288734i.mo137781b(next.mo108775z2())) != null && b.f288738b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m88779w(List<C72963f4> list) {
        if (list != null && !list.isEmpty()) {
            for (C72963f4 next : list) {
                if (next.mo100994f4() && C96790t0.m124282c(next.mo108765s2())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m88780x(List<C72963f4> list) {
        if (list != null && !list.isEmpty()) {
            for (C72963f4 b4 : list) {
                if (b4.mo100989b4()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m88781y(List<C72963f4> list) {
        int i;
        C98408n0 Zd;
        int i2;
        int i3;
        Class cls = C98201k.class;
        if (list == null) {
            Log.m105928w("MicroMsg.ChattingEditModeLogic", "check contain undownload file, select item empty");
            return false;
        }
        for (C72963f4 next : list) {
            C92836k kVar = null;
            if (next.mo100979R3() || next.mo100961A3()) {
                if (next.getMsgId() > 0) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(next.mo108768t(), next.getMsgId());
                }
                if ((kVar == null || kVar.f267374a <= 0) && next.mo108774y2() > 0) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(next.mo108768t(), next.mo108774y2());
                }
                if (kVar != null && (kVar.f267376c < (i = kVar.f267377d) || i == 0)) {
                    return true;
                }
            } else if (next.mo100994f4()) {
                C98408n0 f = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137720f(next.mo108765s2());
                if (!(f == null || (i3 = f.f288562i) == 199 || i3 == 199)) {
                    return true;
                }
            } else if (next.mo101022y3()) {
                if (!m88766j(next)) {
                    return true;
                }
            } else if (next.mo101020w3()) {
                C68070l.C68072b u = C68070l.C68072b.m80422u(next.getContent(), next.getContent());
                if (u == null) {
                    return true;
                }
                int i4 = u.f195582i;
                if (i4 == 6) {
                    C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
                    if (qq == null) {
                        return true;
                    }
                    Uri n = C116299g2.m163858n(qq.field_fileFullPath);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        return true;
                    }
                } else if (i4 == 74) {
                    return true;
                }
            } else if (!(!next.mo100989b4() || (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(next.mo108765s2())) == null || (i2 = Zd.f288562i) == 199 || i2 == 199)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1.getContent(), (java.lang.String) null);
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88782z(com.tencent.p014mm.storage.C72963f4 r1) {
        /*
            if (r1 == 0) goto L_0x001a
            boolean r0 = r1.mo101020w3()
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r1.getContent()
            r0 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r0)
            if (r1 == 0) goto L_0x001a
            int r1 = r1.f195582i
            r0 = 6
            if (r1 != r0) goto L_0x001a
            r1 = 1
            return r1
        L_0x001a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74343y0.m88782z(com.tencent.mm.storage.f4):boolean");
    }
}
