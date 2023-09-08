package u72;

import android.util.Pair;
import bp3.C67301m;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6691p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75710x0;
import java.util.HashMap;
import java.util.Map;
import w72.C78521a;
import x72.C38459a;
import x72.C38460b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: u72.d */
public class C78136d extends C86301e implements C78135c {

    /* renamed from: d */
    public C38459a f228978d = null;

    public void Ea0(C72963f4 f4Var, int i, String str, CharSequence charSequence, String str2, int i2, HashMap<String, String> hashMap) {
        C72963f4 f4Var2 = f4Var;
        HashMap<String, String> hashMap2 = hashMap;
        if (f4Var2 != null) {
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195570f = str2;
            bVar.f195582i = 57;
            int i3 = C78521a.f230007a;
            MsgQuoteItem msgQuoteItem = new MsgQuoteItem();
            msgQuoteItem.f201543d = i;
            msgQuoteItem.f201544e = f4Var.mo108774y2();
            msgQuoteItem.f201545f = Util.nullAs(f4Var.mo108768t(), "");
            msgQuoteItem.f201546g = Util.nullAs(C67301m.m79637b(f4Var), "");
            msgQuoteItem.f201547h = Util.nullAs(Util.isNullOrNil(charSequence) ? "" : charSequence.toString(), "");
            msgQuoteItem.f201548i = Util.nullAs(f4Var2.f230724G, "");
            msgQuoteItem.f201551o = f4Var2.f212669H1;
            if (f4Var.mo100987Z3()) {
                String nullAs = Util.nullAs(C67301m.m79636a(f4Var), "");
                try {
                    int indexOf = nullAs.indexOf("<refermsg>", 0);
                    int lastIndexOf = nullAs.lastIndexOf("</refermsg>");
                    msgQuoteItem.f201549j = nullAs.substring(0, indexOf) + "<refermsg>" + nullAs.substring(lastIndexOf);
                } catch (Exception e) {
                    msgQuoteItem.f201549j = nullAs;
                    Log.m105921e("MicroMsg.msgquote.MsgQuoteHelp", "getMsgQuoteItem Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                }
            } else {
                String nullAs2 = Util.nullAs(C67301m.m79636a(f4Var), "");
                try {
                    StringBuilder sb = new StringBuilder();
                    int indexOf2 = nullAs2.indexOf("<recorditem>", 0);
                    int lastIndexOf2 = nullAs2.lastIndexOf("</recorditem>");
                    sb.append(nullAs2.substring(0, Math.max(indexOf2, 0)));
                    if (indexOf2 > 0) {
                        sb.append("<recorditem>");
                    }
                    sb.append(nullAs2.substring(Math.max(lastIndexOf2, 0)));
                    msgQuoteItem.f201549j = sb.toString();
                } catch (Exception e2) {
                    msgQuoteItem.f201549j = nullAs2;
                    Log.m105921e("MicroMsg.msgquote.MsgQuoteHelp", "getMsgQuoteItem Exception:%s %s", e2.getClass().getSimpleName(), e2.getMessage());
                }
            }
            String B00 = ((C75710x0) C86312j.m106911c(C75710x0.class)).B00(f4Var2);
            Object[] objArr = new Object[3];
            objArr[0] = B00;
            objArr[1] = Boolean.valueOf(hashMap2 == null);
            objArr[2] = Integer.valueOf(i2);
            Log.m105925i("MicroMsg.MsgUtil", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", objArr);
            if (!Util.isNullOrNil(B00) && !B00.startsWith("<msgsource>")) {
                Log.m105929w("MicroMsg.MsgUtil", "[mergeMsgSource] WTF the msgsource is right? %s", B00);
            } else if ((i2 & 1) != 0 && (hashMap2 instanceof HashMap)) {
                StringBuffer stringBuffer = new StringBuffer();
                if (Util.isNullOrNil(B00)) {
                    stringBuffer.append("<msgsource>");
                }
                for (Map.Entry next : hashMap.entrySet()) {
                    String str3 = (String) next.getValue();
                    String str4 = (String) next.getKey();
                    if (Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
                        Log.m105929w("MicroMsg.MsgUtil", "%s %s", str4, str3);
                    } else {
                        stringBuffer.append("<");
                        stringBuffer.append(str4);
                        stringBuffer.append(">");
                        stringBuffer.append(str3);
                        stringBuffer.append("</");
                        stringBuffer.append(str4);
                        stringBuffer.append(">");
                    }
                }
                if (Util.isNullOrNil(B00)) {
                    stringBuffer.append("</msgsource>");
                    B00 = stringBuffer.toString();
                } else {
                    B00 = B00.replace("<msgsource>", "<msgsource>" + stringBuffer.toString());
                }
            }
            if (!Util.isNullOrNil(B00)) {
                Log.m105919d("MicroMsg.msgquote.MsgQuoteHelp", "MsgSource:%s", B00);
            }
            msgQuoteItem.f201550n = Util.nullAs(B00, "");
            bVar.f195641w2 = msgQuoteItem;
            if (f4Var2.f212669H1 == 1) {
                C6691p pVar = new C6691p();
                pVar.f24055b = 1;
                bVar.mo93545f(pVar);
            }
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                Log.m105919d("MicroMsg.msgquote.PluginMsgQuote", "content:%s MsgQuoteItem:%s", Util.secPrint(str2), bVar.f195641w2);
            }
            Pair<Integer, Long> qE = C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", str, "", (byte[]) null);
            if (qE != null) {
                C38460b bVar2 = new C38460b();
                bVar2.field_msgId = ((Long) qE.second).longValue();
                bVar2.field_quotedMsgId = f4Var.getMsgId();
                bVar2.field_quotedMsgSvrId = f4Var.mo108774y2();
                Log.m105925i("MicroMsg.msgquote.PluginMsgQuote", "sendQuoteMsg result:%s msgId:%s result:%s", qE.first, qE.second, Boolean.valueOf(((C78135c) C86312j.m106911c(C78135c.class)).vs0().insert(bVar2)));
                return;
            }
            Log.m105920e("MicroMsg.msgquote.PluginMsgQuote", "pair is null??");
        }
    }

    /* renamed from: Hb */
    public void mo108113Hb(long j, long j2) {
        Class cls = C78135c.class;
        C38460b jo = ((C78135c) C86312j.m106911c(cls)).vs0().mo61672jo(j);
        if (jo == null) {
            Log.m105921e("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf msgId:%s, msgSvrId:%s, msgQuote is null", Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        jo.field_status = 1;
        C38459a vs02 = ((C78135c) C86312j.m106911c(cls)).vs0();
        vs02.getClass();
        Log.m105925i("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf() msgId:%s msgSvrId:%s result:%s", Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(vs02.update(jo.systemRowid, jo)));
    }

    /* renamed from: S6 */
    public void mo108114S6(long j, long j2, String str, long j3) {
        C38460b bVar = new C38460b();
        bVar.field_msgId = j;
        bVar.field_msgSvrId = j2;
        bVar.field_quotedMsgSvrId = j3;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(str, j3);
        bVar.field_quotedMsgId = h302.getMsgId();
        if ((h302.f230723F & 4) == 4) {
            bVar.field_status = 1;
            Log.m105924i("MicroMsg.msgquote.PluginMsgQuote", "handleReceivedQuoteMsg(), fix revoke status");
        } else {
            bVar.field_status = 0;
        }
        Log.m105925i("MicroMsg.msgquote.PluginMsgQuote", "handleReceivedQuoteMsg() msgId:%s msgSvrid:%s talker:%s quotedMsgSvrid:%s result:%s", Long.valueOf(j), Long.valueOf(j2), str, Long.valueOf(j3), Boolean.valueOf(((C78135c) C86312j.m106911c(C78135c.class)).vs0().mo61671Yt(bVar)));
    }

    public void fv0(long j) {
        Class cls = C78135c.class;
        C38460b Lo = ((C78135c) C86312j.m106911c(cls)).vs0().mo61670Lo(j);
        if (Lo == null) {
            Log.m105921e("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySvrId msgSvrId:%s, msgQuote is null", Long.valueOf(j));
        } else if (Lo.field_status == 1) {
            Log.m105925i("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySvrId msgSvrId:%s revoked!!", Long.valueOf(j));
        } else {
            Lo.field_status = 1;
            C38459a vs02 = ((C78135c) C86312j.m106911c(cls)).vs0();
            vs02.getClass();
            Log.m105925i("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf() msgSvrId:%s result:%s", Long.valueOf(j), Boolean.valueOf(vs02.update(Lo.systemRowid, Lo)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fb  */
    /* renamed from: kv */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo108116kv(long r20, long r22) {
        /*
            r19 = this;
            r0 = r20
            java.lang.Class<u72.c> r2 = u72.C78135c.class
            di3.d r3 = di3.C86312j.m106911c(r2)
            u72.c r3 = (u72.C78135c) r3
            x72.a r3 = r3.vs0()
            r4 = 1
            r5 = 0
            r7 = 0
            r8 = 0
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x002a
            r3.getClass()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r20)
            r3[r8] = r5
            java.lang.String r5 = "MicroMsg.msgquote.MsgQuoteStorage"
            java.lang.String r6 = "getMsgQuteByMsgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r3)
            goto L_0x0071
        L_0x002a:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r3.f101444d
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r3 = x72.C38460b.f101445v
            java.lang.String[] r11 = r3.columns
            java.lang.String[] r13 = new java.lang.String[r4]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r5 = ""
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13[r8] = r3
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r10 = "MsgQuote"
            java.lang.String r12 = "msgId=?"
            android.database.Cursor r3 = r9.query(r10, r11, r12, r13, r14, r15, r16)
            if (r3 != 0) goto L_0x0054
            goto L_0x0071
        L_0x0054:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0059:
            boolean r6 = r3.moveToNext()
            if (r6 == 0) goto L_0x006b
            x72.b r6 = new x72.b
            r6.<init>()
            r6.convertFrom(r3)
            r5.add(r6)
            goto L_0x0059
        L_0x006b:
            int r3 = r5.size()
            if (r3 != 0) goto L_0x0073
        L_0x0071:
            r3 = r7
            goto L_0x0079
        L_0x0073:
            java.lang.Object r3 = r5.get(r8)
            x72.b r3 = (x72.C38460b) r3
        L_0x0079:
            java.lang.String r6 = "MicroMsg.msgquote.PluginMsgQuote"
            if (r3 == 0) goto L_0x00fb
            r9 = r22
            r3.field_msgSvrId = r9
            di3.d r2 = di3.C86312j.m106911c(r2)
            u72.c r2 = (u72.C78135c) r2
            x72.a r2 = r2.vs0()
            r2.getClass()
            long r11 = r3.systemRowid
            boolean r2 = r2.update((long) r11, r3)
            java.lang.Class<f62.k0> r11 = f62.C75700k0.class
            k40.a r11 = f40.C86709a0.m107533q(r11)
            f62.k0 r11 = (f62.C75700k0) r11
            g62.l r11 = r11.mo96095LE()
            long r12 = r3.field_quotedMsgId
            com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11
            com.tencent.mm.storage.f4 r11 = r11.b00(r12)
            int r12 = r11.getType()
            switch(r12) {
                case 49: goto L_0x00c0;
                case 1048625: goto L_0x00c0;
                case 419430449: goto L_0x00c0;
                case 436207665: goto L_0x00c0;
                case 754974769: goto L_0x00c0;
                case 771751985: goto L_0x00c0;
                case 805306417: goto L_0x00c0;
                case 822083633: goto L_0x00c0;
                case 855638065: goto L_0x00c0;
                case 939524145: goto L_0x00c0;
                case 973078577: goto L_0x00c0;
                case 975175729: goto L_0x00c0;
                case 1040187441: goto L_0x00c0;
                case 1090519089: goto L_0x00c0;
                default: goto L_0x00af;
            }
        L_0x00af:
            r4 = 2
            long r13 = r3.field_quotedMsgSvrId
            int r3 = r11.getType()
            long r11 = (long) r3
            r17 = 0
            r15 = r11
            r11 = r4
            w72.C22877b.m26854a(r11, r13, r15, r17)
            goto L_0x00de
        L_0x00c0:
            java.lang.String r11 = r11.getContent()
            com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r11, r7)
            if (r7 == 0) goto L_0x00d9
            r11 = 2
            long r13 = r3.field_quotedMsgSvrId
            r15 = 49
            int r3 = r7.f195582i
            long r4 = (long) r3
            r17 = r4
            w72.C22877b.m26854a(r11, r13, r15, r17)
            goto L_0x00de
        L_0x00d9:
            java.lang.String r3 = "appMsgContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r3)
        L_0x00de:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            r3[r8] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r22)
            r4 = 1
            r3[r4] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r2 = 2
            r3[r2] = r0
            java.lang.String r0 = "handleQuoteMsgSendResuld() msgId:%s msgSvrId:%s result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r3)
            goto L_0x0111
        L_0x00fb:
            r9 = r22
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            r2[r8] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r22)
            r2[r4] = r0
            java.lang.String r0 = "handleQuoteMsgSendResuld() msgId:%s msgSvrId:%s, msgQuote is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u72.C78136d.mo108116kv(long, long):void");
    }

    public C38459a vs0() {
        C86709a0.m107523b().mo121108c();
        if (this.f228978d == null) {
            C86709a0.m107528h();
            this.f228978d = new C38459a(C86709a0.m107535s().f251811i);
        }
        return this.f228978d;
    }
}
