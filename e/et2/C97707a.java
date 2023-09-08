package et2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75592q0;
import java.util.LinkedList;
import java.util.Map;
import os2.C100416r;
import os2.C100417r0;
import p1081gi.C98121d;
import p749xh.C102646h;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101804kv2;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101842st2;
import te3.w25;
import u73.C90621r0;
import vr2.C102236a0;

/* renamed from: et2.a */
public final class C97707a {
    /* renamed from: a */
    public static boolean m126003a(DoFavoriteEvent doFavoriteEvent, SnsInfo snsInfo, String str) {
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        SnsInfo snsInfo2 = snsInfo;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent2 == null || Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or media id is null");
            if (doFavoriteEvent2 != null) {
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360421co1;
            }
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else if (snsInfo2 == null) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360422co2;
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else {
            C101804kv2 d = C94897n1.m120366d(snsInfo, str);
            if (d == null) {
                Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360422co2;
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return false;
            }
            String format = String.format("%s#%s", new Object[]{C102236a0.m134765q0(snsInfo2.field_snsId), str2});
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            C101834rc0 rc02 = new C101834rc0();
            Log.m105925i("MicroMsg.Sns.GetFavDataSource", "fav sns image, from %s", snsInfo.getUserName());
            rd02.mo141275k(snsInfo.getUserName());
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(2);
            rd02.mo141273f(((long) snsInfo.getCreateTime()) * 1000);
            rd02.mo141274j(snsInfo.getSnsId() + "");
            rd02.mo141278n(format);
            rc02.mo141259o(format);
            rc02.f299284V = C94938q1.m120518e(C94866e1.m120262YO(), str2) + C102236a0.m134717L(d);
            if (snsInfo.getTimeLine() != null) {
                rc02.mo141252d(snsInfo.getTimeLine().canvasInfo);
                if (!Util.isNullOrNil(snsInfo.getTimeLine().canvasInfo)) {
                    Map<String, String> parseXml = XmlParser.parseXml(snsInfo.getTimeLine().canvasInfo, C102646h.COL_ADXML, (String) null);
                    if (parseXml.size() > 0) {
                        rc02.mo141246U(Util.nullAs(parseXml.get(".adxml.adCanvasInfo.shareTitle"), ""));
                        rc02.mo141265u(Util.nullAs(parseXml.get(".adxml.adCanvasInfo.shareDesc"), ""));
                    }
                }
            }
            m126009g(rc02, snsInfo2);
            String str3 = C94938q1.m120518e(C94866e1.m120262YO(), d.f298689d) + C102236a0.m134729X(d);
            if (C86013q1.m106450k(rc02.f299284V) || !snsInfo.getUserName().endsWith(C94866e1.Mx0())) {
                if (C86013q1.m106450k(str3)) {
                    rc02.f299286W = str3;
                } else {
                    rc02.mo141232F(true);
                    rc02.mo141267w(d.f298694i);
                    C101756ae0 ae02 = new C101756ae0();
                    ae02.mo141197q(d.f298694i);
                    kd02.mo141221s(ae02);
                }
                rc02.mo141260p(2);
                kd02.f298618f.add(rc02);
                kd02.mo141219q(rd02);
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
                aVar.f264676a = kd02;
                aVar.f264678c = 2;
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return true;
            }
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360422co2;
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m126004b(DoFavoriteEvent doFavoriteEvent, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || C100417r0.m131417f(str) || i < 0) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            }
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else if (C94866e1.qy0()) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.coi;
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
            if (DN == null) {
                Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360422co2;
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return false;
            }
            C101804kv2 c = C94897n1.m120365c(DN, i);
            if (c == null) {
                Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, media obj is null");
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360422co2;
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return false;
            }
            boolean a = m126003a(doFavoriteEvent, DN, c.f298689d);
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return a;
        }
    }

    /* renamed from: c */
    public static boolean m126005c(DoFavoriteEvent doFavoriteEvent, String str, String str2) {
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        String str3 = str;
        SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        boolean z = true;
        if (doFavoriteEvent2 == null || !C100417r0.m131419h(str2) || str3 == null) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
            if (doFavoriteEvent2 != null) {
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360421co1;
            }
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else if (C94866e1.qy0()) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.coi;
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            SnsInfo b = C100416r.m131409b(str2);
            if (b == null) {
                Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360422co2;
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            } else if (b.getTimeLine().ContentObj == null || b.getTimeLine().ContentObj.f298424e != 26) {
                C101804kv2 c = C94897n1.m120365c(b, 0);
                String format = String.format("%s#%s", new Object[]{C102236a0.m134765q0(b.field_snsId), c != null ? c.f298689d : "0"});
                C101801kd0 kd02 = new C101801kd0();
                C101835rd0 rd02 = new C101835rd0();
                Log.m105925i("MicroMsg.Sns.GetFavDataSource", "fav sns url, from %s", b.getUserName());
                rd02.mo141275k(b.getUserName());
                rd02.mo141279o(C75592q0.m90789s());
                rd02.mo141277m(2);
                rd02.mo141273f(((long) b.getCreateTime()) * 1000);
                rd02.mo141274j(b.getSnsId() + "");
                rd02.mo141278n(format);
                rd02.mo141276l(str3);
                C101834rc0 rc02 = new C101834rc0();
                rc02.mo141259o(format);
                if (c != null) {
                    String str4 = C94938q1.m120518e(C94866e1.m120262YO(), c.f298689d) + C102236a0.m134729X(c);
                    if (C86013q1.m106450k(str4)) {
                        rc02.f299286W = str4;
                    } else {
                        rc02.mo141232F(true);
                        rc02.mo141267w(c.f298694i);
                        C101756ae0 ae02 = new C101756ae0();
                        ae02.mo141197q(c.f298694i);
                        kd02.mo141221s(ae02);
                    }
                } else {
                    rc02.mo141232F(true);
                }
                rc02.mo141260p(5);
                TimeLineObject timeLine = b.getTimeLine();
                rc02.mo141246U(timeLine.ContentObj.f298425f);
                rc02.mo141265u(timeLine.ContentObj.f298423d);
                rc02.mo141252d(timeLine.canvasInfo);
                if (!Util.isNullOrNil(timeLine.canvasInfo)) {
                    Map<String, String> parseXml = XmlParser.parseXml(timeLine.canvasInfo, C102646h.COL_ADXML, (String) null);
                    if (parseXml.size() > 0) {
                        rc02.mo141246U(Util.nullAs(parseXml.get(".adxml.adCanvasInfo.shareTitle"), ""));
                        rc02.mo141265u(Util.nullAs(parseXml.get(".adxml.adCanvasInfo.shareDesc"), ""));
                    }
                }
                m126010h(rc02, timeLine);
                rc02.mo141231E(true);
                kd02.f298618f.add(rc02);
                C101756ae0 ae03 = new C101756ae0();
                ae03.f297873q = timeLine.contentattr;
                ae03.f297874r = true;
                ae03.mo141198r(rc02.f299297d);
                w25 w25 = timeLine.webSearchInfo;
                if (w25 != null && !Util.isNullOrNil(w25.f259899d)) {
                    C90621r0 r0Var = new C90621r0();
                    w25 w252 = timeLine.webSearchInfo;
                    r0Var.f260345b = w252.f259899d;
                    r0Var.f260346c = w252.f259900e;
                    r0Var.f260347d = w252.f259901f;
                    r0Var.f260348e = w252.f259902g;
                    r0Var.f260349f = w252.f259903h;
                    r0Var.f260350g = w252.f259905j;
                    r0Var.f260351h = w252.f259906n;
                    r0Var.f260352i = w252.f259907o;
                    r0Var.f260353j = w252.f259908p;
                    r0Var.f260354k = w252.f259909q;
                    r0Var.f260355l = w252.f259910r;
                    r0Var.f260356m = w252.f259911s;
                    r0Var.f260357n = w252.f259912t;
                    r0Var.f260358o = w252.f259904i;
                    r0Var.f260359p = w252.f259913u;
                    r0Var.f260360q = w252.f259914v;
                    r0Var.f260361r = w252.f259915w;
                    r0Var.f260362s = w252.f259916x;
                    r0Var.f260363t = w252.f259917y;
                    r0Var.f260364u = w252.f259918z;
                    StringBuilder sb = new StringBuilder();
                    r0Var.mo7616c(sb, (C68070l.C68072b) null, (String) null, (C98121d) null, 0, 0);
                    ae03.f297877u = sb.toString();
                    ae03.f297878v = true;
                }
                kd02.mo141221s(ae03);
                SnsMethodCalculate.markStartTimeMs("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                C101842st2 st22 = timeLine.ContentObj.f298430n;
                if (st22 == null || st22.f299443d == -1) {
                    SnsMethodCalculate.markEndTimeMs("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                } else {
                    C101755ad0 ad02 = new C101755ad0();
                    kd02.mo141216n(ad02);
                    ad02.f297849e = timeLine.ContentObj.f298430n.f299444e;
                    ad02.f297848d = st22.f299443d;
                    ad02.f297862u = st22.f299453q;
                    ad02.f297852h = st22.f299448i;
                    ad02.f297853i = st22.f299449j;
                    ad02.f297857p = st22.f299451o;
                    ad02.f297854j = st22.f299450n;
                    ad02.f297850f = st22.f299446g;
                    ad02.f297851g = st22.f299447h;
                    ad02.f297855n = timeLine.publicUserName;
                    ad02.f297856o = timeLine.sourceNickName;
                    ad02.f297859r = st22.f299452p;
                    ae03.mo141194n(st22.f299445f);
                    SnsMethodCalculate.markEndTimeMs("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                }
                kd02.mo141219q(rd02);
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
                aVar.f264676a = kd02;
                aVar.f264680e = timeLine.ContentObj.f298425f;
                aVar.f264678c = 5;
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return z;
            } else {
                z = m126008f(doFavoriteEvent2, str2);
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return z;
            }
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m126006d(com.tencent.p014mm.autogen.events.DoFavoriteEvent r20, com.tencent.p014mm.plugin.sns.storage.SnsInfo r21) {
        /*
            r1 = r20
            r0 = r21
            java.lang.String r2 = "fillEventInfoSight"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.transmit.GetFavDataSource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "MicroMsg.Sns.GetFavDataSource"
            r5 = 0
            if (r1 == 0) goto L_0x02d2
            if (r0 == 0) goto L_0x02d2
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r21.getTimeLine()
            te3.j00 r6 = r6.ContentObj
            java.util.LinkedList<te3.kv2> r6 = r6.f298427h
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0022
            goto L_0x02d2
        L_0x0022:
            te3.kd0 r6 = new te3.kd0
            r6.<init>()
            te3.rd0 r7 = new te3.rd0
            r7.<init>()
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r21.getTimeLine()
            te3.j00 r9 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r9 = r9.f298427h
            java.lang.Object r9 = r9.get(r5)
            te3.kv2 r9 = (te3.C101804kv2) r9
            boolean r10 = r21.isAd()
            r11 = 15
            if (r10 == 0) goto L_0x0058
            te3.j00 r10 = r8.ContentObj
            int r10 = r10.f298424e
            if (r10 != r11) goto L_0x0058
            te3.sc4 r10 = r8.streamvideo
            com.tencent.mm.plugin.sns.storage.ADInfo r12 = r21.getAdInfo()
            java.lang.String r12 = r12.uxInfo
            r10.f299431j = r12
            te3.sc4 r10 = r8.streamvideo
            java.lang.String r12 = r8.f283893Id
            r10.f299432n = r12
        L_0x0058:
            long r12 = r0.field_snsId
            java.lang.String r10 = vr2.C102236a0.m134765q0(r12)
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r5] = r10
            java.lang.String r10 = r9.f298689d
            r14 = 1
            r13[r14] = r10
            java.lang.String r10 = "%s#%s"
            java.lang.String r10 = java.lang.String.format(r10, r13)
            java.lang.String r13 = r0.field_userName
            r7.mo141275k(r13)
            java.lang.String r13 = eb0.C75592q0.m90789s()
            r7.mo141279o(r13)
            r7.mo141277m(r12)
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.mo141273f(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r21.getSnsId()
            r11.append(r12)
            java.lang.String r12 = ""
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r7.mo141274j(r11)
            r7.mo141278n(r10)
            r6.mo141219q(r7)
            te3.rc0 r7 = new te3.rc0
            r7.<init>()
            r7.mo141259o(r10)
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r11 = r9.f298689d
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r10, r11)
            vr2.C102236a0.m134725T(r9)
            java.lang.String r11 = vr2.C102236a0.m134729X(r9)
            java.lang.String r13 = r21.getLocalid()
            java.lang.String r13 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120301t(r13, r9)
            hd0.n0 r15 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120298q(r9)
            if (r15 == 0) goto L_0x00cb
            java.lang.String r13 = r15.f288534B
        L_0x00cb:
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r14 = 2131825674(0x7f11140a, float:1.928421E38)
            if (r15 == 0) goto L_0x00e4
            java.lang.String r0 = "this sight had no download finish, can not favorite."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            if (r1 == 0) goto L_0x00e0
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r14
        L_0x00e0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x00e4:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r10)
            r15.append(r11)
            java.lang.String r15 = r15.toString()
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            if (r15 != 0) goto L_0x01ca
            r16 = 240(0xf0, float:3.36E-43)
            te3.mv2 r15 = r9.f298698p
            if (r15 == 0) goto L_0x0110
            float r14 = r15.f298876e
            r18 = 0
            int r19 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r19 <= 0) goto L_0x0110
            float r15 = r15.f298875d
            int r18 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r18 <= 0) goto L_0x0110
            int r15 = (int) r15
            int r14 = (int) r14
            goto L_0x0114
        L_0x0110:
            r14 = 240(0xf0, float:3.36E-43)
            r15 = 320(0x140, float:4.48E-43)
        L_0x0114:
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r16 == 0) goto L_0x011c
            r0 = 0
            goto L_0x0134
        L_0x011c:
            r5 = 1
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createVideoThumbnail(r13, r5)
            if (r0 != 0) goto L_0x0130
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r15 = 0
            r14[r15] = r13
            java.lang.String r15 = "MicroMsg.SightUtil"
            java.lang.String r5 = "create remux thumb bmp error, target path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r5, r14)
            goto L_0x0134
        L_0x0130:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r0, r14, r15, r5, r5)
        L_0x0134:
            if (r0 != 0) goto L_0x016b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "fav error on get thumb:"
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            if (r1 == 0) goto L_0x0166
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r1 = 2131825674(0x7f11140a, float:1.928421E38)
            r0.f264687l = r1
        L_0x0166:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x0169:
            r1 = 0
            return r1
        L_0x016b:
            r5 = 60
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0185 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0185 }
            r15.<init>()     // Catch:{ Exception -> 0x0185 }
            r15.append(r10)     // Catch:{ Exception -> 0x0185 }
            r15.append(r11)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x0185 }
            r17 = r6
            r6 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r5, r14, r15, r6)     // Catch:{ Exception -> 0x0185 }
            goto L_0x01cc
        L_0x0185:
            r0 = move-exception
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r0.getMessage()
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "save bmp error %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "fav error on save thumb:"
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            if (r1 == 0) goto L_0x01c6
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r1 = 2131825674(0x7f11140a, float:1.928421E38)
            r0.f264687l = r1
        L_0x01c6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0169
        L_0x01ca:
            r17 = r6
        L_0x01cc:
            r7.f299284V = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            r7.f299286W = r0
            java.lang.String r0 = r9.f298670C
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = r8.ContentDesc
            goto L_0x01ec
        L_0x01ea:
            java.lang.String r0 = r9.f298670C
        L_0x01ec:
            r7.mo141246U(r0)
            java.lang.String r0 = r8.canvasInfo
            r7.mo141252d(r0)
            java.lang.String r0 = r8.canvasInfo
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0229
            java.lang.String r0 = r8.canvasInfo
            java.lang.String r5 = "adxml"
            r6 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r5, r6)
            int r5 = r0.size()
            if (r5 <= 0) goto L_0x0229
            java.lang.String r5 = ".adxml.adCanvasInfo.shareTitle"
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r12)
            r7.mo141246U(r5)
            java.lang.String r5 = ".adxml.adCanvasInfo.shareDesc"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r12)
            r7.mo141265u(r0)
        L_0x0229:
            boolean r0 = r21.isAd()
            r5 = 4
            if (r0 == 0) goto L_0x0288
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r21.getAdXml()
            te3.uc0 r5 = new te3.uc0
            r5.<init>()
            java.lang.String r6 = r9.f298670C
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0244
            java.lang.String r6 = r8.ContentDesc
            goto L_0x0246
        L_0x0244:
            java.lang.String r6 = r9.f298670C
        L_0x0246:
            r5.f299614h = r6
            int r6 = r9.f298668A
            r5.f299611e = r6
            java.lang.String r6 = r9.f298706x
            r5.f299610d = r6
            te3.sc4 r6 = r8.streamvideo
            java.lang.String r10 = r6.f299431j
            r5.f299616j = r10
            java.lang.String r6 = r6.f299432n
            r5.f299617n = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0264
            java.lang.String r6 = r8.f283893Id
            r5.f299617n = r6
        L_0x0264:
            java.lang.String r6 = r9.f298669B
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x026f
            java.lang.String r6 = r9.f298694i
            goto L_0x0271
        L_0x026f:
            java.lang.String r6 = r9.f298669B
        L_0x0271:
            r5.f299615i = r6
            if (r0 == 0) goto L_0x0281
            int r6 = r0.attachShareLinkIsHidden
            if (r6 != 0) goto L_0x0281
            java.lang.String r6 = r0.attachShareLinkUrl
            r5.f299613g = r6
            java.lang.String r0 = r0.attachShareLinkWording
            r5.f299612f = r0
        L_0x0281:
            r7.f299306h1 = r5
            r5 = 16
            r11 = 15
            goto L_0x0289
        L_0x0288:
            r11 = 4
        L_0x0289:
            r7.mo141260p(r11)
            java.lang.String r0 = r7.f299284V
            r6 = 1
            com.tencent.mm.plugin.sight.base.a r0 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r0, r6)
            if (r0 == 0) goto L_0x029d
            int r0 = r0.mo130041a()
            r7.mo141266v(r0)
            goto L_0x02a0
        L_0x029d:
            r7.mo141266v(r6)
        L_0x02a0:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r7)
            r6 = r17
            r6.mo141211f(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264676a = r6
            r0.f264678c = r5
            r0 = r21
            m126009g(r7, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r6 = 0
            r0[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r0[r5] = r1
            java.lang.String r1 = "fill event Info sight dataType %d eventType %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x02d2:
            java.lang.String r0 = "fill sight favorite event fail, event is null or tlObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            if (r1 == 0) goto L_0x02e0
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r1 = 2131825657(0x7f1113f9, float:1.9284176E38)
            r0.f264687l = r1
        L_0x02e0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0169
        */
        throw new UnsupportedOperationException("Method not decompiled: et2.C97707a.m126006d(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    /* renamed from: e */
    public static boolean m126007e(DoFavoriteEvent doFavoriteEvent, String str, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || C100417r0.m131417f(str) || charSequence == null) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or text is null");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            }
            SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else if (C94866e1.qy0()) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.coi;
            SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
            if (DN == null) {
                Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360422co2;
                SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return false;
            }
            long j = DN.field_snsId;
            if (0 == j) {
                Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo.field_snsId is 0");
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360420co0;
                SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return false;
            }
            String format = String.format("%s#0", new Object[]{C102236a0.m134765q0(j)});
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            Log.m105925i("MicroMsg.Sns.GetFavDataSource", "fav sns text, from %s", DN.getUserName());
            rd02.mo141275k(DN.getUserName());
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(2);
            rd02.mo141273f(((long) DN.getCreateTime()) * 1000);
            rd02.mo141274j(DN.getSnsId() + "");
            rd02.mo141278n(format);
            kd02.mo141219q(rd02);
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264676a = kd02;
            aVar.f264680e = charSequence.toString();
            doFavoriteEvent.f264674d.f264678c = 1;
            SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return true;
        }
    }

    /* renamed from: f */
    public static boolean m126008f(DoFavoriteEvent doFavoriteEvent, String str) {
        LinkedList<C101834rc0> linkedList;
        SnsMethodCalculate.markStartTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (doFavoriteEvent == null || !C100417r0.m131419h(str)) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            }
            SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else if (C94866e1.qy0()) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.coi;
            SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        } else {
            SnsInfo b = C100416r.m131409b(str);
            if (b == null) {
                Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360422co2;
                SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return false;
            }
            C101804kv2 c = C94897n1.m120365c(b, 0);
            String format = String.format("%s#%s", new Object[]{C102236a0.m134765q0(b.field_snsId), c != null ? c.f298689d : "0"});
            C101835rd0 rd02 = new C101835rd0();
            TimeLineObject timeLine = b.getTimeLine();
            if (timeLine == null) {
                Log.m105924i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, tlObj is null , return");
                SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                return false;
            }
            Log.m105925i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, from %s", b.getUserName());
            rd02.mo141275k(b.getUserName());
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(2);
            rd02.mo141273f(((long) b.getCreateTime()) * 1000);
            rd02.mo141274j(b.getSnsId() + "");
            rd02.mo141278n(format);
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 30;
            aVar.f264847m = 4;
            aVar.f264837c = timeLine.ContentObj.f298429j;
            favoriteOperationEvent.publish();
            favoriteOperationEvent.f264833d.f264838d.mo141219q(rd02);
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            C101801kd0 kd02 = favoriteOperationEvent.f264833d.f264838d;
            aVar2.f264676a = kd02;
            if (!(kd02 == null || (linkedList = kd02.f298618f) == null)) {
                for (int i = 0; i < linkedList.size(); i++) {
                    C101834rc0 rc02 = linkedList.get(i);
                    if (rc02 != null) {
                        rc02.mo141231E(true);
                        rc02.mo141232F(true);
                    }
                }
            }
            DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
            aVar3.f264680e = timeLine.ContentObj.f298425f;
            aVar3.f264678c = 18;
            SnsMethodCalculate.markEndTimeMs("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return true;
        }
    }

    /* renamed from: g */
    public static void m126009g(C101834rc0 rc02, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (!(rc02 == null || snsInfo == null)) {
            m126010h(rc02, snsInfo.getTimeLine());
        }
        SnsMethodCalculate.markEndTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
    }

    /* renamed from: h */
    public static void m126010h(C101834rc0 rc02, TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (!(rc02 == null || timeLineObject == null || Util.isNullOrNil(timeLineObject.statExtStr))) {
            rc02.mo141239N(timeLineObject.statExtStr);
        }
        SnsMethodCalculate.markEndTimeMs("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
    }
}
