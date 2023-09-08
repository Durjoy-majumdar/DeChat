package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Pair;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ForwardUpdateMsgIdEvent;
import com.tencent.p014mm.autogen.events.ProductOperationEvent;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.autogen.events.TVOperationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FavForwardQualityStruct;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C86493v0;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60166f;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kr0.C76629w0;
import kr0.C88274h0;
import p1081gi.C98121d;
import p548hg.C98450d;
import p763ym.C79138l;
import p823sg.C90193h;
import pb1.C100702d1;
import pb1.C100734q;
import pb1.C100753y;
import pb1.C100755z;
import pc0.C100765f;
import s90.C48300n;
import sx3.C36907w;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101849uc0;
import te3.C101850ud0;
import te3.C101871zc0;
import te3.C64628pk1;
import te3.C64682rk1;
import te3.C64719t23;
import te3.C90431pc0;
import te3.tc4;
import u73.C90621r0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.fav.ui.f1 */
public class C93594f1 {

    /* renamed from: com.tencent.mm.plugin.fav.ui.f1$a */
    public class C93595a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f270267d;

        /* renamed from: e */
        public final /* synthetic */ List f270268e;

        /* renamed from: f */
        public final /* synthetic */ Context f270269f;

        /* renamed from: g */
        public final /* synthetic */ String f270270g;

        /* renamed from: h */
        public final /* synthetic */ Runnable f270271h;

        public C93595a(String str, List list, Context context, String str2, Runnable runnable) {
            this.f270267d = str;
            this.f270268e = list;
            this.f270269f = context;
            this.f270270g = str2;
            this.f270271h = runnable;
        }

        public void run() {
            Class cls;
            Class cls2;
            C68070l.C68072b bVar;
            byte[] bArr;
            C64682rk1 rk12;
            C64719t23 t232;
            int i;
            C98450d.C59881a aVar;
            Class cls3 = C100702d1.class;
            Class cls4 = C79138l.class;
            for (String next : Util.stringsToList(this.f270267d.split(","))) {
                for (C100755z zVar : this.f270268e) {
                    if (zVar == null) {
                        Log.m105921e("MicroMsg.FavSendLogic", "in run workerThread,want to send fav msg, but info is null,infos.size = %d", Integer.valueOf(this.f270268e.size()));
                    } else {
                        C115669n.INSTANCE.mo160131h(10925, Integer.valueOf(zVar.field_type), Integer.valueOf(zVar.field_id));
                        int i2 = zVar.field_type;
                        String str = "";
                        switch (i2) {
                            case 1:
                                cls = cls3;
                                cls2 = cls4;
                                C101835rd0 rd02 = zVar.field_favProto.f298616d;
                                if (rd02 != null) {
                                    str = rd02.f299358s;
                                }
                                long j = 0;
                                try {
                                    j = Long.parseLong(str);
                                } catch (Throwable unused) {
                                }
                                C7250m.m7431a().mo136255QA(next, zVar.field_favProto.f298628s, C45628s0.m50810y(next), 0, j);
                                break;
                            case 2:
                                cls = cls3;
                                cls2 = cls4;
                                Iterator<C101834rc0> it = zVar.field_favProto.f298618f.iterator();
                                while (it.hasNext()) {
                                    C101834rc0 next2 = it.next();
                                    C97425j a = C7250m.m7431a();
                                    Context context = this.f270269f;
                                    String w = C100734q.m131880w(next2);
                                    C100765f fVar = new C100765f();
                                    fVar.f295214b = next2.f299317o1;
                                    fVar.f295216d = next2.f299259I1;
                                    a.mo136256TG(context, next, w, 0, "", "", fVar);
                                }
                                break;
                            case 4:
                                Class cls5 = cls4;
                                C93594f1.m118174b(this.f270269f, next, C100734q.m131813D(zVar));
                                cls3 = cls3;
                                break;
                            case 5:
                                C101834rc0 D = C100734q.m131813D(zVar);
                                C101801kd0 kd02 = zVar.field_favProto;
                                C101756ae0 ae02 = kd02.f298622j;
                                C101835rd0 rd03 = kd02.f298616d;
                                C68070l.C68072b bVar2 = new C68070l.C68072b();
                                if (ae02 != null) {
                                    bVar2.f195570f = ae02.f297863d;
                                    String str2 = ae02.f297869j;
                                    if (Util.isNullOrNil(str2)) {
                                        str2 = Util.nullAs(D.f299254G, str);
                                    }
                                    bVar2.f195646y = str2;
                                }
                                if (Util.isNullOrNil(bVar2.f195570f)) {
                                    bVar2.f195570f = D.f299297d;
                                }
                                if (ae02 != null) {
                                    bVar2.f195574g = ae02.f297865f;
                                }
                                if (Util.isNullOrNil(bVar2.f195574g)) {
                                    bVar2.f195574g = D.f299301f;
                                }
                                C101756ae0 ae03 = zVar.field_favProto.f298622j;
                                if (ae03 != null) {
                                    bVar2.f195586j = ae03.f297867h;
                                }
                                if (rd03 != null && Util.isNullOrNil(bVar2.f195586j)) {
                                    bVar2.f195586j = rd03.f299364y;
                                }
                                if (zVar.f295172Q0 && Util.isNullOrNil(bVar2.f195586j)) {
                                    bVar2.f195586j = D.f299242A;
                                }
                                if (!Util.isNullOrNil(D.f299313m1)) {
                                    bVar2.f195475C2 = D.f299313m1;
                                }
                                bVar2.f195578h = "view";
                                bVar2.f195582i = 5;
                                bVar2.f195634v = rd03.f299344B;
                                C101755ad0 ad02 = zVar.field_favProto.f298612K;
                                if (ad02 != null) {
                                    C68065f fVar2 = new C68065f();
                                    fVar2.f195417b = ad02.f297848d;
                                    fVar2.f195423h = ad02.f297862u;
                                    if (Util.isNullOrNil(bVar2.f195634v)) {
                                        bVar2.f195634v = ad02.f297855n;
                                    }
                                    if (ad02.f297848d == 5) {
                                        fVar2.f195425j = ad02.f297854j;
                                        fVar2.f195418c = ad02.f297852h;
                                        fVar2.f195419d = ad02.f297853i;
                                        fVar2.f195420e = ad02.f297850f;
                                        fVar2.f195421f = ad02.f297851g;
                                    }
                                    bVar2.mo93545f(fVar2);
                                }
                                if (ae02 == null || Util.isNullOrNil(ae02.f297877u)) {
                                    cls = cls3;
                                    cls2 = cls4;
                                    bVar = bVar2;
                                } else {
                                    Map<String, String> parseXml = XmlParser.parseXml(ae02.f297877u, "websearch", (String) null);
                                    C90621r0 r0Var = new C90621r0();
                                    r0Var.f260345b = parseXml.get(".websearch.relevant_vid");
                                    r0Var.f260346c = parseXml.get(".websearch.relevant_expand");
                                    r0Var.f260347d = parseXml.get(".websearch.relevant_pre_searchid");
                                    r0Var.f260348e = parseXml.get(".websearch.relevant_shared_openid");
                                    r0Var.f260349f = (long) Util.getInt(parseXml.get(".websearch.rec_category"), -1);
                                    r0Var.f260350g = parseXml.get(".websearch.shareUrl");
                                    r0Var.f260351h = parseXml.get(".websearch.shareTitle");
                                    r0Var.f260352i = parseXml.get(".websearch.shareDesc");
                                    r0Var.f260353j = parseXml.get(".websearch.shareImgUrl");
                                    r0Var.f260354k = parseXml.get(".websearch.shareString");
                                    r0Var.f260355l = parseXml.get(".websearch.shareStringUrl");
                                    r0Var.f260356m = parseXml.get(".websearch.source");
                                    r0Var.f260357n = parseXml.get(".websearch.sourceUrl");
                                    r0Var.f260358o = parseXml.get(".websearch.strPlayCount");
                                    r0Var.f260359p = parseXml.get(".websearch.titleUrl");
                                    r0Var.f260360q = parseXml.get(".websearch.extReqParams");
                                    r0Var.f260361r = parseXml.get(".websearch.tagList");
                                    cls = cls3;
                                    cls2 = cls4;
                                    r0Var.f260362s = Util.getLong(parseXml.get(".websearch.channelId"), -1);
                                    r0Var.f260363t = parseXml.get(".websearch.thumbUrl");
                                    r0Var.f260364u = parseXml.get(".websearch.shareTag");
                                    bVar = bVar2;
                                    bVar.mo93545f(r0Var);
                                }
                                bVar.f195535U1 = D.f299311k1;
                                byte[] readFromFile = Util.readFromFile(C100734q.m131826Q(D));
                                if (readFromFile == null) {
                                    String str3 = ae02 == null ? null : ae02.f297869j;
                                    if (Util.isNullOrNil(str3)) {
                                        str3 = Util.nullAs(D.f299254G, str);
                                    }
                                    readFromFile = Util.readFromFile(C100734q.m131812C() + C90193h.m112878f(str3.getBytes()));
                                }
                                byte[] bArr2 = readFromFile;
                                String str4 = "fav_" + C75592q0.m90789s() + "_" + zVar.field_id;
                                String a2 = C86493v0.m107223a(str4);
                                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a2, true);
                                c.mo120962i("prePublishId", str4);
                                c.mo120962i("preUsername", zVar.field_fromUser);
                                c.mo120962i("sendAppMsgScene", 1);
                                c.mo120962i("adExtStr", D.f299311k1);
                                C7250m.m7431a().mo136265uM(next, bArr2, C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null), a2, "", zVar.field_localId);
                                break;
                            case 6:
                                C101871zc0 zc02 = zVar.field_favProto.f298620h;
                                C7250m.m7431a().mo136257Tm(next, "<msg>" + "<location " + "x=" + FastJsonResponse.QUOTE + zc02.f299952f + "\" " + "y=" + FastJsonResponse.QUOTE + zc02.f299950d + "\" " + "scale=" + FastJsonResponse.QUOTE + zc02.f299954h + "\" " + "label=" + FastJsonResponse.QUOTE + Util.nullAs(zc02.f299956j, str) + "\" " + "maptype=\"0\" " + "poiname=" + FastJsonResponse.QUOTE + Util.nullAs(zc02.f299958o, str) + "\" " + "/>" + "</msg>", 48, 0);
                                break;
                            case 7:
                                Context context2 = this.f270269f;
                                C101834rc0 D2 = C100734q.m131813D(zVar);
                                WXMusicObject wXMusicObject = new WXMusicObject();
                                wXMusicObject.musicUrl = D2.f299242A;
                                wXMusicObject.musicDataUrl = D2.f299246C;
                                String str5 = D2.f299250E;
                                wXMusicObject.musicLowBandUrl = str5;
                                wXMusicObject.musicLowBandDataUrl = str5;
                                wXMusicObject.songAlbumUrl = D2.f299251E1;
                                wXMusicObject.songLyric = D2.f299255G1;
                                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                                wXMediaMessage.mediaObject = wXMusicObject;
                                wXMediaMessage.title = D2.f299297d;
                                wXMediaMessage.description = D2.f299301f;
                                byte[] readFromFile2 = Util.readFromFile(C100734q.m131826Q(D2));
                                if (readFromFile2 == null) {
                                    String nullAs = Util.nullAs(D2.f299254G, str);
                                    readFromFile2 = Util.readFromFile(C100734q.m131812C() + C90193h.m112878f(nullAs.getBytes()));
                                }
                                wXMediaMessage.thumbData = readFromFile2;
                                String str6 = zVar.field_favProto.f298616d.f299362w;
                                ((C100702d1) C86312j.m106911c(cls3)).mo123896Bb(wXMediaMessage, str6, ((C79138l) C86312j.m106911c(cls4)).mo74012l5(context2, str6), next, 3, (String) null);
                                break;
                            case 8:
                                C93594f1.m118175c(next, zVar, C100734q.m131813D(zVar));
                                break;
                            case 10:
                                Context context3 = this.f270269f;
                                C101793jd0 jd02 = zVar.field_favProto.f298634y;
                                ProductOperationEvent productOperationEvent = new ProductOperationEvent();
                                ProductOperationEvent.C67755a aVar2 = productOperationEvent.f193823d;
                                aVar2.f193825a = 0;
                                aVar2.f193827c = jd02.f298517j;
                                aVar2.f193826b = context3;
                                productOperationEvent.publish();
                                if (!productOperationEvent.f193824e.f193828a) {
                                    break;
                                } else {
                                    byte[] readFromFile3 = Util.readFromFile(C100734q.m131812C() + C90193h.m112878f(Util.nullAs(jd02.f298515h, str).getBytes()));
                                    if (readFromFile3 == null) {
                                        readFromFile3 = Util.readFromFile(productOperationEvent.f193824e.f193830c);
                                    }
                                    C7250m.m7431a().pd0(next, readFromFile3, productOperationEvent.f193824e.f193829b, (String) null);
                                    break;
                                }
                            case 11:
                                Context context4 = this.f270269f;
                                C101793jd0 jd03 = zVar.field_favProto.f298634y;
                                ProductOperationEvent productOperationEvent2 = new ProductOperationEvent();
                                ProductOperationEvent.C67755a aVar3 = productOperationEvent2.f193823d;
                                aVar3.f193825a = 1;
                                aVar3.f193827c = jd03.f298517j;
                                aVar3.f193826b = context4;
                                productOperationEvent2.publish();
                                if (!productOperationEvent2.f193824e.f193828a) {
                                    break;
                                } else {
                                    byte[] readFromFile4 = Util.readFromFile(C100734q.m131812C() + C90193h.m112878f(Util.nullAs(jd03.f298515h, str).getBytes()));
                                    if (readFromFile4 == null) {
                                        readFromFile4 = Util.readFromFile(productOperationEvent2.f193824e.f193830c);
                                    }
                                    C7250m.m7431a().pd0(next, readFromFile4, productOperationEvent2.f193824e.f193829b, (String) null);
                                    break;
                                }
                            case 14:
                            case 18:
                                Log.m105925i("MicroMsg.FavSendLogic", "want send record, fav id %d", Integer.valueOf(zVar.field_id));
                                C93599e a3 = C93599e.m118184a(this.f270269f, zVar);
                                C101801kd0 kd03 = new C101801kd0();
                                try {
                                    Log.m105918d("MicroMsg.FavSendLogic", "do clone fav proto item");
                                    kd03.parseFrom(zVar.field_favProto.toByteArray());
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.FavSendLogic", e, str, new Object[0]);
                                    Log.m105921e("MicroMsg.FavSendLogic", "clone fav proto item error: %s", e.getMessage());
                                }
                                LinkedList<C101834rc0> linkedList = kd03.f298618f;
                                Iterator<C101834rc0> it4 = linkedList.iterator();
                                int i3 = 0;
                                while (it4.hasNext()) {
                                    C101834rc0 next3 = it4.next();
                                    C101841sc0 sc02 = next3.f299296c1;
                                    if (sc02 != null) {
                                        C90431pc0 pc02 = sc02.f299420v;
                                        if (pc02 != null && C93663j.m118352a(pc02)) {
                                            next3.mo141260p(1);
                                            next3.mo141265u(this.f270269f.getString(C0966R.string.a16));
                                            linkedList.set(i3, next3);
                                            kd03.mo141211f(linkedList);
                                        }
                                        C101756ae0 ae04 = next3.f299296c1.f299407f;
                                        if (ae04 != null) {
                                            if (ae04.f297879w == 1) {
                                                next3.mo141260p(1);
                                                next3.mo141265u(this.f270269f.getString(C0966R.string.a16));
                                                linkedList.set(i3, next3);
                                                kd03.mo141211f(linkedList);
                                            }
                                        }
                                    }
                                    i3++;
                                }
                                C100753y yVar = C100753y.f295167a;
                                int i4 = zVar.field_type;
                                FavForwardQualityStruct favForwardQualityStruct = C100753y.f295168b;
                                favForwardQualityStruct.f265523d = i4;
                                favForwardQualityStruct.f265524e = 1;
                                favForwardQualityStruct.f265534o = (long) zVar.field_id;
                                RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
                                RecordOperationEvent.C92551a aVar4 = recordOperationEvent.f265027d;
                                aVar4.f265029a = 2;
                                aVar4.f265033e = next;
                                aVar4.f265035g = kd03;
                                aVar4.f265036h = a3.f270288a;
                                aVar4.f265037i = a3.f270289b;
                                aVar4.f265038j = a3.f270290c;
                                aVar4.f265043o = a3.f270291d;
                                recordOperationEvent.publish();
                                break;
                            case 15:
                                Context context5 = this.f270269f;
                                C101850ud0 ud02 = zVar.field_favProto.f298604C;
                                TVOperationEvent tVOperationEvent = new TVOperationEvent();
                                TVOperationEvent.C92604a aVar5 = tVOperationEvent.f265232d;
                                aVar5.getClass();
                                aVar5.f265235b = ud02.f299624j;
                                aVar5.f265234a = context5;
                                tVOperationEvent.publish();
                                Log.m105919d("MicroMsg.FavSendLogic", "sendFavTV ret = [%s], thumbUrl = [%s]", Boolean.valueOf(tVOperationEvent.f265233e.f265236a), ud02.f299622h);
                                if (!tVOperationEvent.f265233e.f265236a) {
                                    break;
                                } else {
                                    byte[] readFromFile5 = Util.readFromFile(C100734q.m131812C() + C90193h.m112878f(Util.nullAs(ud02.f299622h, str).getBytes()));
                                    if (readFromFile5 == null) {
                                        readFromFile5 = Util.readFromFile(tVOperationEvent.f265233e.f265238c);
                                    }
                                    C7250m.m7431a().pd0(next, readFromFile5, tVOperationEvent.f265233e.f265237b, (String) null);
                                    break;
                                }
                            case 16:
                                C93594f1.m118173a(this.f270269f, next, C100734q.m131813D(zVar));
                                break;
                            case 17:
                                String str7 = C100734q.m131813D(zVar).f299301f;
                                C7250m.m7431a().mo136257Tm(next, str7, C72996z1.m85843n5(C72963f4.C72964b.m85654f(str7).f212675a) ? 66 : 42, 0);
                                break;
                            case 19:
                                if (i2 == 19) {
                                    if (!C93663j.m118352a(zVar.field_favProto.f298610I)) {
                                        C90431pc0 pc03 = zVar.field_favProto.f298610I;
                                        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(pc03.f259741d);
                                        String string = N2 != null ? N2.field_nickname : MMApplicationContext.getContext().getString(C0966R.string.a4n);
                                        C68070l.C68072b bVar3 = new C68070l.C68072b();
                                        String str8 = zVar.field_favProto.f298626q;
                                        bVar3.f195570f = str8;
                                        bVar3.f195574g = str8;
                                        bVar3.f195573f2 = pc03.f259741d;
                                        bVar3.f195569e2 = pc03.f259746i;
                                        bVar3.f195577g2 = pc03.f259742e;
                                        bVar3.f195653z2 = pc03.f259743f;
                                        bVar3.f195467A2 = pc03.f259748n;
                                        bVar3.f195581h2 = 2;
                                        bVar3.f195605n2 = pc03.f259749o;
                                        bVar3.f195586j = ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113311k8(pc03.f259742e);
                                        bVar3.f195471B2 = pc03.f259744g;
                                        bVar3.f195494H1 = "wxapp_" + pc03.f259742e + pc03.f259746i;
                                        bVar3.f195634v = pc03.f259741d;
                                        bVar3.f195638w = string;
                                        C80995a aVar6 = new C80995a();
                                        aVar6.f237905n = pc03.f259750p;
                                        aVar6.f237910s = pc03.f259751q;
                                        aVar6.f237911t = pc03.f259752r;
                                        bVar3.mo93545f(aVar6);
                                        bVar3.f195582i = 33;
                                        byte[] bArr3 = new byte[0];
                                        Bitmap i5 = FavoriteImageServer.m118080i(C100734q.m131813D(zVar), zVar);
                                        if (i5 == null || i5.isRecycled()) {
                                            Log.m105920e("MicroMsg.FavAppBrandLogic", "thumb image is null");
                                            bArr = bArr3;
                                        } else {
                                            Log.m105924i("MicroMsg.FavAppBrandLogic", "thumb image is not null ");
                                            Bitmap createBitmap = Bitmap.createBitmap(i5.getWidth(), i5.getHeight(), Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(createBitmap);
                                            canvas.drawColor(-1);
                                            canvas.drawBitmap(i5, 0.0f, 0.0f, (Paint) null);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            Log.m105925i("MicroMsg.FavAppBrandLogic", "bitmap recycle %s", createBitmap);
                                            createBitmap.recycle();
                                            bArr = byteArray;
                                        }
                                        C80996q.C1279a.m1369a().mo112827qE(bVar3, pc03.f259742e, "", next, "", bArr);
                                        break;
                                    } else {
                                        Log.m105920e("MicroMsg.FavAppBrandLogic", "not expect branch for ban forward");
                                        break;
                                    }
                                } else {
                                    Log.m105921e("MicroMsg.FavAppBrandLogic", "not expect type:%d", Integer.valueOf(i2));
                                    break;
                                }
                                break;
                            case 20:
                                C87412m.m108594g(next, "toUser");
                                C101801kd0 kd04 = zVar.field_favProto;
                                if (!(kd04 == null || (rk12 = kd04.f298614M) == null)) {
                                    C68070l.C68072b bVar4 = new C68070l.C68072b();
                                    C60166f fVar3 = new C60166f();
                                    C64682rk1 rk13 = fVar3.f171710b;
                                    rk13.f185183d = rk12.f185183d;
                                    rk13.f185191o = rk12.f185191o;
                                    rk13.f185188i = rk12.f185188i;
                                    String str9 = rk12.f185186g;
                                    if (str9 != null) {
                                        str = str9;
                                    }
                                    rk13.f185186g = str;
                                    rk13.f185185f = rk12.f185185f;
                                    rk13.f185187h = rk12.f185187h;
                                    rk13.f185189j = rk12.f185189j;
                                    LinkedList<C64628pk1> linkedList2 = rk13.f185190n;
                                    LinkedList<C64628pk1> linkedList3 = rk12.f185190n;
                                    C87412m.m108593f(linkedList3, "favFeedItem.mediaList");
                                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList3, 10));
                                    for (C64628pk1 pk12 : linkedList3) {
                                        C64628pk1 pk13 = new C64628pk1();
                                        pk13.f184826d = pk12.f184826d;
                                        pk13.f184827e = pk12.f184827e;
                                        pk13.f184828f = pk12.f184828f;
                                        pk13.f184829g = pk12.f184829g;
                                        pk13.f184830h = pk12.f184830h;
                                        arrayList.add(pk13);
                                    }
                                    linkedList2.addAll(arrayList);
                                    C64682rk1 rk14 = fVar3.f171710b;
                                    rk14.f185198v = rk12.f185198v;
                                    rk14.f185199w = rk12.f185199w;
                                    rk14.f185195s = rk12.f185195s;
                                    rk14.f185200x = rk12.f185200x;
                                    rk14.f185181D = rk12.f185181D;
                                    bVar4.mo93545f(fVar3);
                                    bVar4.f195582i = 51;
                                    bVar4.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                                    bVar4.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                                    Log.m105925i("MicroMsg.Fav.FavFinderLogic", "share finderObject %s to %s", rk12.f185183d, next);
                                    Pair<Integer, Long> qE = C80996q.C1279a.m1369a().mo112827qE(bVar4, "", "", next, "", (byte[]) null);
                                    if (qE == null) {
                                        break;
                                    } else {
                                        Long l = (Long) qE.second;
                                        Long l2 = -1L;
                                        ForwardUpdateMsgIdEvent forwardUpdateMsgIdEvent = new ForwardUpdateMsgIdEvent();
                                        ForwardUpdateMsgIdEvent.C92520a aVar7 = forwardUpdateMsgIdEvent.f264876d;
                                        C87412m.m108591d(l2);
                                        aVar7.f264877a = l2.longValue();
                                        ForwardUpdateMsgIdEvent.C92520a aVar8 = forwardUpdateMsgIdEvent.f264876d;
                                        C87412m.m108591d(l);
                                        aVar8.f264878b = l.longValue();
                                        forwardUpdateMsgIdEvent.f264876d.f264879c = next;
                                        forwardUpdateMsgIdEvent.publish();
                                        break;
                                    }
                                }
                            case 21:
                                Context context6 = this.f270269f;
                                C101834rc0 D3 = C100734q.m131813D(zVar);
                                WXMusicObject wXMusicObject2 = new WXMusicObject();
                                wXMusicObject2.musicUrl = D3.f299242A;
                                wXMusicObject2.musicDataUrl = D3.f299246C;
                                String str10 = D3.f299250E;
                                wXMusicObject2.musicLowBandUrl = str10;
                                wXMusicObject2.musicLowBandDataUrl = str10;
                                wXMusicObject2.songAlbumUrl = D3.f299251E1;
                                wXMusicObject2.songLyric = D3.f299255G1;
                                WXMediaMessage wXMediaMessage2 = new WXMediaMessage();
                                wXMediaMessage2.mediaObject = wXMusicObject2;
                                wXMediaMessage2.title = D3.f299297d;
                                wXMediaMessage2.description = D3.f299301f;
                                byte[] readFromFile6 = Util.readFromFile(C100734q.m131826Q(D3));
                                if (readFromFile6 == null) {
                                    String nullAs2 = Util.nullAs(D3.f299254G, str);
                                    readFromFile6 = Util.readFromFile(C100734q.m131812C() + C90193h.m112878f(nullAs2.getBytes()));
                                }
                                wXMediaMessage2.thumbData = readFromFile6;
                                String str11 = zVar.field_favProto.f298616d.f299362w;
                                String l5 = ((C79138l) C86312j.m106911c(cls4)).mo74012l5(context6, str11);
                                C68070l.C68072b bVar5 = new C68070l.C68072b();
                                bVar5.f195570f = D3.f299297d;
                                bVar5.f195574g = D3.f299301f;
                                bVar5.f195586j = D3.f299242A;
                                String str12 = D3.f299250E;
                                bVar5.f195590k = str12;
                                bVar5.f195530T = D3.f299246C;
                                bVar5.f195533U = str12;
                                bVar5.f195562d = str11;
                                bVar5.f195582i = 76;
                                bVar5.f195484F = l5;
                                bVar5.f195618r = 3;
                                C101841sc0 sc03 = D3.f299296c1;
                                if (!(sc03 == null || (t232 = sc03.f299401C) == null)) {
                                    C72916m mVar = new C72916m();
                                    mVar.f212519b = D3.f299251E1;
                                    mVar.f212520c = D3.f299255G1;
                                    mVar.f212521d = t232.f185459d;
                                    mVar.f212522e = t232.f185460e;
                                    mVar.f212523f = t232.f185461f;
                                    mVar.f212524g = t232.f185462g;
                                    mVar.f212525h = t232.f185463h;
                                    mVar.f212526i = t232.f185464i;
                                    mVar.f212527j = t232.f185466n;
                                    mVar.f212528k = String.valueOf(t232.f185467o);
                                    mVar.f212529l = t232.f185468p;
                                    mVar.f212531n = t232.f185469q;
                                    mVar.f212530m = t232.f185465j;
                                    mVar.f212532o = t232.f185471s;
                                    mVar.f212533p = t232.f185470r;
                                    bVar5.mo93545f(mVar);
                                }
                                ((C100702d1) C86312j.m106911c(cls3)).mo123899jh(bVar5, wXMediaMessage2, next, (String) null);
                                break;
                            case 23:
                                C98450d dVar = (C98450d) C86312j.m106911c(C98450d.class);
                                ArrayList arrayList2 = new ArrayList();
                                LinkedList<C101834rc0> linkedList4 = zVar.field_favProto.f298618f;
                                C87412m.m108593f(linkedList4, "favItemInfo.favProto.dataList");
                                for (C101834rc0 rc02 : linkedList4) {
                                    int i6 = rc02.f299258I;
                                    if (i6 == 2) {
                                        aVar = C98450d.C59881a.TYPE_IMG;
                                        i = 0;
                                    } else if (i6 == 4) {
                                        aVar = C98450d.C59881a.TYPE_VIDEO;
                                        i = rc02.f299338y;
                                    }
                                    String w2 = C100734q.m131880w(rc02);
                                    C87412m.m108593f(w2, "getDataPath(it)");
                                    arrayList2.add(new C98450d.C59882b(w2, false, i, aVar));
                                }
                                dVar.mo137791DG(5, next, arrayList2);
                                break;
                        }
                        cls3 = cls;
                        cls4 = cls2;
                    }
                }
                Class cls6 = cls3;
                Class cls7 = cls4;
                if (!Util.isNullOrNil(this.f270270g)) {
                    C7250m.m7431a().mo136257Tm(next, this.f270270g, C45628s0.m50810y(next), 0);
                }
                cls3 = cls6;
                cls4 = cls7;
            }
            MMHandlerThread.postToMainThread(this.f270271h);
        }

        public String toString() {
            return super.toString() + "|sendFavMsg";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.f1$b */
    public class C93596b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101834rc0 f270272d;

        /* renamed from: e */
        public final /* synthetic */ Context f270273e;

        /* renamed from: f */
        public final /* synthetic */ String f270274f;

        /* renamed from: g */
        public final /* synthetic */ Runnable f270275g;

        public C93596b(C101834rc0 rc02, Context context, String str, Runnable runnable) {
            this.f270272d = rc02;
            this.f270273e = context;
            this.f270274f = str;
            this.f270275g = runnable;
        }

        public void run() {
            C101834rc0 rc02 = this.f270272d;
            if (rc02.f299258I == 15) {
                C93594f1.m118173a(this.f270273e, this.f270274f, rc02);
            } else {
                C93594f1.m118174b(this.f270273e, this.f270274f, rc02);
            }
            MMHandlerThread.postToMainThread(this.f270275g);
        }

        public String toString() {
            return super.toString() + "|sendFavVideo";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.f1$c */
    public class C93597c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f270276d;

        /* renamed from: e */
        public final /* synthetic */ C100755z f270277e;

        /* renamed from: f */
        public final /* synthetic */ C101834rc0 f270278f;

        /* renamed from: g */
        public final /* synthetic */ Runnable f270279g;

        public C93597c(String str, C100755z zVar, C101834rc0 rc02, Runnable runnable) {
            this.f270276d = str;
            this.f270277e = zVar;
            this.f270278f = rc02;
            this.f270279g = runnable;
        }

        public void run() {
            C93594f1.m118175c(this.f270276d, this.f270277e, this.f270278f);
            MMHandlerThread.postToMainThread(this.f270279g);
        }

        public String toString() {
            return super.toString() + "|sendFavFile";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.f1$d */
    public class C93598d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f270280d;

        /* renamed from: e */
        public final /* synthetic */ String f270281e;

        /* renamed from: f */
        public final /* synthetic */ String f270282f;

        /* renamed from: g */
        public final /* synthetic */ String f270283g;

        /* renamed from: h */
        public final /* synthetic */ int f270284h;

        /* renamed from: i */
        public final /* synthetic */ String f270285i;

        /* renamed from: j */
        public final /* synthetic */ String f270286j;

        /* renamed from: n */
        public final /* synthetic */ Runnable f270287n;

        public C93598d(Context context, String str, String str2, String str3, int i, String str4, String str5, Runnable runnable) {
            this.f270280d = context;
            this.f270281e = str;
            this.f270282f = str2;
            this.f270283g = str3;
            this.f270284h = i;
            this.f270285i = str4;
            this.f270286j = str5;
            this.f270287n = runnable;
        }

        public void run() {
            Context context = this.f270280d;
            String str = this.f270281e;
            String str2 = this.f270282f;
            String str3 = this.f270283g;
            int i = this.f270284h;
            String str4 = this.f270285i;
            String str5 = this.f270286j;
            C86009m1 m1Var = new C86009m1(str2);
            if (m1Var.mo119967g()) {
                Log.m105925i("MicroMsg.FavSendLogic", "sendVideo::data path[%s] thumb path[%s]", m1Var.mo119971i(), new C86009m1(str3).mo119971i());
                C7250m.m7431a().Ml0(context, str, m1Var.mo119971i(), str3, 1, i, false, false, str4, str5);
            }
            MMHandlerThread.postToMainThread(this.f270287n);
        }

        public String toString() {
            return super.toString() + "|sendFavVideo";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.f1$e */
    public static class C93599e {

        /* renamed from: a */
        public String f270288a;

        /* renamed from: b */
        public String f270289b;

        /* renamed from: c */
        public String f270290c;

        /* renamed from: d */
        public String f270291d;

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x047f, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x052c, code lost:
            if (r8 == false) goto L_0x0567;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x05cc, code lost:
            if (r8 == false) goto L_0x047f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0740, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
            if (r21 == false) goto L_0x0141;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
            if (r21 == false) goto L_0x0141;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.tencent.p014mm.plugin.fav.p047ui.C93594f1.C93599e m118184a(android.content.Context r23, pb1.C100755z r24) {
            /*
                r0 = r23
                r1 = r24
                int r2 = r1.field_type
                java.lang.String r3 = "getLabel but locItem is null"
                java.lang.String r4 = "MicroMsg.FavSendLogic"
                r11 = 3
                r13 = 18
                java.lang.String r14 = ""
                r15 = 1
                java.lang.String r10 = "..."
                java.lang.String r5 = "\n"
                if (r2 != r13) goto L_0x0235
                com.tencent.mm.plugin.fav.ui.f1$e r2 = new com.tencent.mm.plugin.fav.ui.f1$e
                r2.<init>()
                android.util.SparseIntArray r8 = new android.util.SparseIntArray
                r8.<init>()
                int r7 = r1.field_type
                if (r7 != r13) goto L_0x002a
                te3.kd0 r7 = r1.field_favProto
                java.lang.String r7 = r7.f298626q
                r2.f270288a = r7
            L_0x002a:
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
                te3.kd0 r6 = r1.field_favProto
                java.util.LinkedList<te3.rc0> r6 = r6.f298618f
                java.util.Iterator r6 = r6.iterator()
                r16 = 0
                r21 = 0
            L_0x003b:
                boolean r22 = r6.hasNext()
                if (r22 == 0) goto L_0x01ef
                java.lang.Object r22 = r6.next()
                r12 = r22
                te3.rc0 r12 = (te3.C101834rc0) r12
                int r9 = r1.field_type
                if (r9 != r13) goto L_0x0055
                boolean r9 = com.tencent.p014mm.plugin.fav.p047ui.C93594f1.m118177e(r12)
                if (r9 == 0) goto L_0x0055
                goto L_0x01e9
            L_0x0055:
                int r9 = r12.f299258I
                int r9 = r8.get(r9)
                int r13 = r12.f299258I
                int r9 = r9 + r15
                r8.put(r13, r9)
                int r9 = r12.f299258I
                if (r9 == r15) goto L_0x01b8
                r13 = 2
                if (r9 == r13) goto L_0x019b
                if (r9 == r11) goto L_0x016b
                r13 = 4
                if (r9 == r13) goto L_0x0149
                r11 = 6
                if (r9 == r11) goto L_0x00ee
                r11 = 8
                if (r9 == r11) goto L_0x00c6
                r11 = 17
                if (r9 == r11) goto L_0x00a4
                r11 = 19
                if (r9 == r11) goto L_0x007e
                goto L_0x01e9
            L_0x007e:
                int r9 = r7.size()
                if (r9 >= r13) goto L_0x01e9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r11 = 2131820946(0x7f110192, float:1.9274621E38)
                java.lang.String r13 = r0.getString(r11)
                r9.append(r13)
                java.lang.String r11 = r12.f299297d
                r9.append(r11)
                r9.append(r5)
                java.lang.String r9 = r9.toString()
                r7.add(r9)
                goto L_0x01e9
            L_0x00a4:
                int r9 = r7.size()
                r11 = 4
                if (r9 >= r11) goto L_0x01e9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r12 = 2131821659(0x7f11045b, float:1.9276067E38)
                java.lang.String r13 = r0.getString(r12)
                r9.append(r13)
                r9.append(r5)
                java.lang.String r9 = r9.toString()
                r7.add(r9)
                goto L_0x01e9
            L_0x00c6:
                r11 = 4
                int r9 = r7.size()
                if (r9 >= r11) goto L_0x00eb
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r11 = 2131821530(0x7f1103da, float:1.9275806E38)
                java.lang.String r13 = r0.getString(r11)
                r9.append(r13)
                java.lang.String r11 = r12.f299297d
                r9.append(r11)
                r9.append(r5)
                java.lang.String r9 = r9.toString()
                r7.add(r9)
            L_0x00eb:
                if (r21 != 0) goto L_0x01e9
                goto L_0x0141
            L_0x00ee:
                int r9 = r7.size()
                r11 = 4
                if (r9 >= r11) goto L_0x013f
                te3.sc0 r9 = r12.f299296c1
                te3.zc0 r9 = r9.f299406e
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r12 = 2131821573(0x7f110405, float:1.9275893E38)
                java.lang.String r13 = r0.getString(r12)
                r11.append(r13)
                java.lang.String r12 = m118185b(r9)
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 != 0) goto L_0x0129
                java.lang.String r12 = m118185b(r9)
                r13 = 2131832232(0x7f112da8, float:1.9297512E38)
                java.lang.String r15 = r0.getString(r13)
                boolean r12 = r12.equals(r15)
                if (r12 == 0) goto L_0x0124
                goto L_0x0129
            L_0x0124:
                java.lang.String r9 = m118185b(r9)
                goto L_0x0132
            L_0x0129:
                if (r9 != 0) goto L_0x0130
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                r9 = r14
                goto L_0x0132
            L_0x0130:
                java.lang.String r9 = r9.f299956j
            L_0x0132:
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
            L_0x013f:
                if (r21 != 0) goto L_0x01e9
            L_0x0141:
                r11 = 3
                r13 = 18
                r15 = 1
                r21 = 1
                goto L_0x003b
            L_0x0149:
                int r9 = r7.size()
                r11 = 4
                if (r9 >= r11) goto L_0x01e9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r12 = 2131821728(0x7f1104a0, float:1.9276207E38)
                java.lang.String r13 = r0.getString(r12)
                r9.append(r13)
                r9.append(r5)
                java.lang.String r9 = r9.toString()
                r7.add(r9)
                goto L_0x01e9
            L_0x016b:
                r11 = 4
                int r9 = r7.size()
                if (r9 >= r11) goto L_0x01e9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r11 = 2131821732(0x7f1104a4, float:1.9276215E38)
                java.lang.String r13 = r0.getString(r11)
                r9.append(r13)
                int r11 = r12.f299338y
                long r11 = (long) r11
                float r11 = pb1.C100734q.m131827R(r11)
                int r11 = (int) r11
                java.lang.CharSequence r11 = com.tencent.p014mm.plugin.fav.p047ui.C68924p1.m81172a(r0, r11)
                r9.append(r11)
                r9.append(r5)
                java.lang.String r9 = r9.toString()
                r7.add(r9)
                goto L_0x01e9
            L_0x019b:
                if (r16 != 0) goto L_0x01e9
                java.lang.String r9 = pb1.C100734q.m131826Q(r12)
                boolean r11 = m118186c(r9)
                if (r11 == 0) goto L_0x01aa
                r2.f270290c = r9
                goto L_0x01b0
            L_0x01aa:
                java.lang.String r9 = pb1.C100734q.m131880w(r12)
                r2.f270290c = r9
            L_0x01b0:
                r11 = 3
                r13 = 18
                r15 = 1
                r16 = 1
                goto L_0x003b
            L_0x01b8:
                int r9 = r7.size()
                r11 = 4
                if (r9 >= r11) goto L_0x01e9
                java.lang.String r9 = r12.f299301f
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r11 != 0) goto L_0x01e9
                java.lang.String r11 = "&lt;"
                java.lang.String r12 = "<"
                java.lang.String r9 = r9.replaceAll(r11, r12)
                java.lang.String r11 = "&gt;"
                java.lang.String r12 = ">"
                java.lang.String r9 = r9.replaceAll(r11, r12)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
            L_0x01e9:
                r11 = 3
                r13 = 18
                r15 = 1
                goto L_0x003b
            L_0x01ef:
                r2.f270289b = r14
                java.util.Iterator r0 = r7.iterator()
                r1 = r14
            L_0x01f6:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0212
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                goto L_0x01f6
            L_0x0212:
                java.lang.String r0 = r1.trim()
                int r1 = r7.size()
                r3 = 4
                if (r1 < r3) goto L_0x022c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r10)
                java.lang.String r0 = r1.toString()
            L_0x022c:
                r2.f270289b = r0
                java.lang.String r0 = r2.f270288a
                if (r0 != 0) goto L_0x0234
                r2.f270288a = r14
            L_0x0234:
                return r2
            L_0x0235:
                com.tencent.mm.plugin.fav.ui.f1$e r2 = new com.tencent.mm.plugin.fav.ui.f1$e
                r2.<init>()
                android.util.SparseIntArray r6 = new android.util.SparseIntArray
                r6.<init>()
                int r7 = r1.field_type
                r8 = 14
                if (r7 != r8) goto L_0x024b
                te3.kd0 r7 = r1.field_favProto
                java.lang.String r7 = r7.f298626q
                r2.f270288a = r7
            L_0x024b:
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
                te3.kd0 r1 = r1.field_favProto
                java.util.LinkedList<te3.rc0> r1 = r1.f298618f
                java.util.Iterator r1 = r1.iterator()
                r8 = 0
            L_0x0259:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0776
                java.lang.Object r9 = r1.next()
                te3.rc0 r9 = (te3.C101834rc0) r9
                int r11 = r9.f299258I
                int r11 = r6.get(r11)
                int r12 = r9.f299258I
                r13 = 1
                int r11 = r11 + r13
                r6.put(r12, r11)
                int r11 = r9.f299258I
                r12 = 2131821615(0x7f11042f, float:1.9275978E38)
                r13 = 2131821721(0x7f110499, float:1.9276193E38)
                java.lang.String r15 = ":"
                switch(r11) {
                    case 1: goto L_0x0743;
                    case 2: goto L_0x06fc;
                    case 3: goto L_0x06b2;
                    case 4: goto L_0x0668;
                    case 5: goto L_0x05d0;
                    case 6: goto L_0x056b;
                    case 7: goto L_0x052f;
                    case 8: goto L_0x04fa;
                    case 9: goto L_0x027f;
                    case 10: goto L_0x04ba;
                    case 11: goto L_0x04ba;
                    case 12: goto L_0x027f;
                    case 13: goto L_0x027f;
                    case 14: goto L_0x0482;
                    case 15: goto L_0x0448;
                    case 16: goto L_0x0400;
                    case 17: goto L_0x03d2;
                    case 18: goto L_0x027f;
                    case 19: goto L_0x0377;
                    case 20: goto L_0x027f;
                    case 21: goto L_0x027f;
                    case 22: goto L_0x0343;
                    case 23: goto L_0x027f;
                    case 24: goto L_0x027f;
                    case 25: goto L_0x027f;
                    case 26: goto L_0x0343;
                    case 27: goto L_0x0343;
                    case 28: goto L_0x0343;
                    case 29: goto L_0x052f;
                    case 30: goto L_0x0343;
                    case 31: goto L_0x0319;
                    case 32: goto L_0x027f;
                    case 33: goto L_0x027f;
                    case 34: goto L_0x02ed;
                    case 35: goto L_0x028e;
                    default: goto L_0x027f;
                }
            L_0x027f:
                r17 = 2131821659(0x7f11045b, float:1.9276067E38)
                r18 = 2131821530(0x7f1103da, float:1.9275806E38)
                r19 = 2131821573(0x7f110405, float:1.9275893E38)
                r20 = 3
                r21 = 2131820946(0x7f110192, float:1.9274621E38)
                goto L_0x0259
            L_0x028e:
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x027f
                java.lang.String r11 = r9.f299301f
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                if (r11 != 0) goto L_0x02ba
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                java.lang.String r9 = r9.f299301f
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x027f
            L_0x02ba:
                ig.m r11 = new ig.m     // Catch:{ Exception -> 0x02eb }
                r11.<init>()     // Catch:{ Exception -> 0x02eb }
                java.lang.String r12 = r9.f299326s1     // Catch:{ Exception -> 0x02eb }
                r11.mo141099d(r12)     // Catch:{ Exception -> 0x02eb }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02eb }
                r12.<init>()     // Catch:{ Exception -> 0x02eb }
                java.lang.String r9 = r9.f299298d1     // Catch:{ Exception -> 0x02eb }
                r12.append(r9)     // Catch:{ Exception -> 0x02eb }
                r12.append(r15)     // Catch:{ Exception -> 0x02eb }
                java.lang.Class<hg.d> r9 = p548hg.C98450d.class
                di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ Exception -> 0x02eb }
                hg.d r9 = (p548hg.C98450d) r9     // Catch:{ Exception -> 0x02eb }
                java.lang.String r9 = r9.m30(r11)     // Catch:{ Exception -> 0x02eb }
                r12.append(r9)     // Catch:{ Exception -> 0x02eb }
                r12.append(r5)     // Catch:{ Exception -> 0x02eb }
                java.lang.String r9 = r12.toString()     // Catch:{ Exception -> 0x02eb }
                r7.add(r9)     // Catch:{ Exception -> 0x02eb }
                goto L_0x027f
            L_0x02eb:
                goto L_0x027f
            L_0x02ed:
                boolean r11 = pb1.C100734q.m131837a0()
                if (r11 == 0) goto L_0x02f4
                goto L_0x027f
            L_0x02f4:
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x027f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                java.lang.String r9 = r9.f299297d
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x027f
            L_0x0319:
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x027f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r9 = r9.f299298d1
                r11.append(r9)
                r11.append(r15)
                r9 = 2131821546(0x7f1103ea, float:1.9275838E38)
                java.lang.String r9 = r0.getString(r9)
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x027f
            L_0x0343:
                boolean r11 = pb1.C100734q.m131837a0()
                if (r11 == 0) goto L_0x034b
                goto L_0x027f
            L_0x034b:
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x027f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                java.lang.String r12 = r0.getString(r13)
                r11.append(r12)
                java.lang.String r9 = r9.f299297d
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x027f
            L_0x0377:
                int r11 = r7.size()
                r13 = 4
                if (r11 >= r13) goto L_0x027f
                te3.sc0 r11 = r9.f299296c1
                te3.pc0 r11 = r11.f299420v
                if (r11 == 0) goto L_0x03a9
                int r11 = r11.f259745h
                r13 = 3
                if (r11 != r13) goto L_0x03aa
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r9 = r9.f299298d1
                r11.append(r9)
                r11.append(r15)
                java.lang.String r9 = r0.getString(r12)
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x027f
            L_0x03a9:
                r13 = 3
            L_0x03aa:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131820946(0x7f110192, float:1.9274621E38)
                java.lang.String r15 = r0.getString(r12)
                r11.append(r15)
                java.lang.String r9 = r9.f299297d
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x027f
            L_0x03d2:
                r12 = 2131820946(0x7f110192, float:1.9274621E38)
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x027f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r9 = r9.f299298d1
                r11.append(r9)
                r11.append(r15)
                r12 = 2131821659(0x7f11045b, float:1.9276067E38)
                java.lang.String r9 = r0.getString(r12)
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x027f
            L_0x0400:
                r12 = 2131821659(0x7f11045b, float:1.9276067E38)
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x042c
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821544(0x7f1103e8, float:1.9275834E38)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
            L_0x042c:
                if (r8 != 0) goto L_0x027f
                java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                k40.a r8 = f40.C86709a0.m107533q(r8)
                f62.k0 r8 = (f62.C75700k0) r8
                g62.l r8 = r8.mo96095LE()
                java.lang.String r9 = r9.f299301f
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                com.tencent.mm.storage.f4$b r8 = r8.Rv0(r9)
                java.lang.String r8 = r8.f212675a
                r2.f270291d = r8
                goto L_0x0567
            L_0x0448:
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x0471
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821692(0x7f11047c, float:1.9276134E38)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
            L_0x0471:
                if (r8 != 0) goto L_0x027f
                java.lang.String r9 = pb1.C100734q.m131826Q(r9)
                boolean r11 = m118186c(r9)
                if (r11 == 0) goto L_0x027f
                r2.f270290c = r9
            L_0x047f:
                r8 = 1
                goto L_0x027f
            L_0x0482:
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x04ab
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131820945(0x7f110191, float:1.927462E38)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
            L_0x04ab:
                if (r8 != 0) goto L_0x027f
                te3.sc0 r8 = r9.f299296c1
                te3.ud0 r8 = r8.f299409h
                if (r8 == 0) goto L_0x0567
                java.lang.String r8 = r8.f299622h
                m118187d(r2, r8)
                goto L_0x0567
            L_0x04ba:
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x04ec
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821644(0x7f11044c, float:1.9276037E38)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                te3.sc0 r12 = r9.f299296c1
                te3.jd0 r12 = r12.f299408g
                java.lang.String r12 = r12.f298511d
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
            L_0x04ec:
                if (r8 != 0) goto L_0x027f
                te3.sc0 r8 = r9.f299296c1
                te3.jd0 r8 = r8.f299408g
                if (r8 == 0) goto L_0x0567
                java.lang.String r8 = r8.f298515h
                m118187d(r2, r8)
                goto L_0x0567
            L_0x04fa:
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x0529
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821530(0x7f1103da, float:1.9275806E38)
                java.lang.String r15 = r0.getString(r12)
                r11.append(r15)
                java.lang.String r9 = r9.f299297d
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x052c
            L_0x0529:
                r12 = 2131821530(0x7f1103da, float:1.9275806E38)
            L_0x052c:
                if (r8 != 0) goto L_0x027f
                goto L_0x0567
            L_0x052f:
                r12 = 2131821530(0x7f1103da, float:1.9275806E38)
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x0560
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821602(0x7f110422, float:1.9275952E38)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                java.lang.String r12 = r9.f299297d
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
            L_0x0560:
                if (r8 != 0) goto L_0x027f
                java.lang.String r8 = r9.f299254G
                m118187d(r2, r8)
            L_0x0567:
                r13 = 2131832232(0x7f112da8, float:1.9297512E38)
                goto L_0x05ce
            L_0x056b:
                r13 = 3
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x05c9
                te3.sc0 r11 = r9.f299296c1
                te3.zc0 r11 = r11.f299406e
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r9 = r9.f299298d1
                r12.append(r9)
                r12.append(r15)
                r9 = 2131821573(0x7f110405, float:1.9275893E38)
                java.lang.String r15 = r0.getString(r9)
                r12.append(r15)
                java.lang.String r15 = m118185b(r11)
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r15 != 0) goto L_0x05af
                java.lang.String r15 = m118185b(r11)
                r13 = 2131832232(0x7f112da8, float:1.9297512E38)
                java.lang.String r9 = r0.getString(r13)
                boolean r9 = r15.equals(r9)
                if (r9 == 0) goto L_0x05aa
                goto L_0x05b2
            L_0x05aa:
                java.lang.String r9 = m118185b(r11)
                goto L_0x05bb
            L_0x05af:
                r13 = 2131832232(0x7f112da8, float:1.9297512E38)
            L_0x05b2:
                if (r11 != 0) goto L_0x05b9
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                r9 = r14
                goto L_0x05bb
            L_0x05b9:
                java.lang.String r9 = r11.f299956j
            L_0x05bb:
                r12.append(r9)
                r12.append(r5)
                java.lang.String r9 = r12.toString()
                r7.add(r9)
                goto L_0x05cc
            L_0x05c9:
                r13 = 2131832232(0x7f112da8, float:1.9297512E38)
            L_0x05cc:
                if (r8 != 0) goto L_0x027f
            L_0x05ce:
                goto L_0x047f
            L_0x05d0:
                r11 = 2131821721(0x7f110499, float:1.9276193E38)
                r17 = 2131821659(0x7f11045b, float:1.9276067E38)
                r18 = 2131821530(0x7f1103da, float:1.9275806E38)
                r19 = 2131821573(0x7f110405, float:1.9275893E38)
                r20 = 3
                r21 = 2131820946(0x7f110192, float:1.9274621E38)
                int r13 = r7.size()
                r11 = 4
                if (r13 >= r11) goto L_0x063d
                te3.sc0 r11 = r9.f299296c1
                te3.ae0 r11 = r11.f299407f
                if (r11 == 0) goto L_0x0617
                int r11 = r11.f297879w
                r13 = 1
                if (r11 != r13) goto L_0x05f5
                r11 = 1
                goto L_0x05f6
            L_0x05f5:
                r11 = 0
            L_0x05f6:
                if (r11 == 0) goto L_0x0617
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = r9.f299298d1
                r11.append(r13)
                r11.append(r15)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
                goto L_0x063d
            L_0x0617:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821721(0x7f110499, float:1.9276193E38)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                java.lang.String r12 = r9.f299297d
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
            L_0x063d:
                if (r8 != 0) goto L_0x0259
                java.lang.String r8 = pb1.C100734q.m131826Q(r9)
                boolean r11 = m118186c(r8)
                if (r11 == 0) goto L_0x064d
                r2.f270290c = r8
                goto L_0x0740
            L_0x064d:
                te3.sc0 r8 = r9.f299296c1
                te3.ae0 r8 = r8.f299407f
                if (r8 != 0) goto L_0x0655
                r8 = r14
                goto L_0x0657
            L_0x0655:
                java.lang.String r8 = r8.f297869j
            L_0x0657:
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r11 == 0) goto L_0x0663
                java.lang.String r8 = r9.f299254G
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r14)
            L_0x0663:
                m118187d(r2, r8)
                goto L_0x0740
            L_0x0668:
                r17 = 2131821659(0x7f11045b, float:1.9276067E38)
                r18 = 2131821530(0x7f1103da, float:1.9275806E38)
                r19 = 2131821573(0x7f110405, float:1.9275893E38)
                r20 = 3
                r21 = 2131820946(0x7f110192, float:1.9274621E38)
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x069f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821728(0x7f1104a0, float:1.9276207E38)
                java.lang.String r13 = r0.getString(r12)
                r11.append(r13)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
                goto L_0x06a2
            L_0x069f:
                r12 = 2131821728(0x7f1104a0, float:1.9276207E38)
            L_0x06a2:
                if (r8 != 0) goto L_0x0259
                java.lang.String r9 = pb1.C100734q.m131826Q(r9)
                boolean r11 = m118186c(r9)
                if (r11 == 0) goto L_0x0259
                r2.f270290c = r9
                goto L_0x0740
            L_0x06b2:
                r12 = 2131821728(0x7f1104a0, float:1.9276207E38)
                r17 = 2131821659(0x7f11045b, float:1.9276067E38)
                r18 = 2131821530(0x7f1103da, float:1.9275806E38)
                r19 = 2131821573(0x7f110405, float:1.9275893E38)
                r20 = 3
                r21 = 2131820946(0x7f110192, float:1.9274621E38)
                int r11 = r7.size()
                r13 = 4
                if (r11 >= r13) goto L_0x0259
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = r9.f299298d1
                r11.append(r13)
                r11.append(r15)
                r13 = 2131821732(0x7f1104a4, float:1.9276215E38)
                java.lang.String r15 = r0.getString(r13)
                r11.append(r15)
                int r9 = r9.f299338y
                long r12 = (long) r9
                float r9 = pb1.C100734q.m131827R(r12)
                int r9 = (int) r9
                java.lang.CharSequence r9 = com.tencent.p014mm.plugin.fav.p047ui.C68924p1.m81172a(r0, r9)
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x0259
            L_0x06fc:
                r17 = 2131821659(0x7f11045b, float:1.9276067E38)
                r18 = 2131821530(0x7f1103da, float:1.9275806E38)
                r19 = 2131821573(0x7f110405, float:1.9275893E38)
                r20 = 3
                r21 = 2131820946(0x7f110192, float:1.9274621E38)
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x0732
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                r12 = 2131821636(0x7f110444, float:1.927602E38)
                java.lang.String r12 = r0.getString(r12)
                r11.append(r12)
                r11.append(r5)
                java.lang.String r11 = r11.toString()
                r7.add(r11)
            L_0x0732:
                if (r8 != 0) goto L_0x0259
                java.lang.String r9 = pb1.C100734q.m131826Q(r9)
                boolean r11 = m118186c(r9)
                if (r11 == 0) goto L_0x0259
                r2.f270290c = r9
            L_0x0740:
                r8 = 1
                goto L_0x0259
            L_0x0743:
                r17 = 2131821659(0x7f11045b, float:1.9276067E38)
                r18 = 2131821530(0x7f1103da, float:1.9275806E38)
                r19 = 2131821573(0x7f110405, float:1.9275893E38)
                r20 = 3
                r21 = 2131820946(0x7f110192, float:1.9274621E38)
                int r11 = r7.size()
                r12 = 4
                if (r11 >= r12) goto L_0x0259
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = r9.f299298d1
                r11.append(r12)
                r11.append(r15)
                java.lang.String r9 = r9.f299301f
                r11.append(r9)
                r11.append(r5)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x0259
            L_0x0776:
                r2.f270289b = r14
                java.util.Iterator r0 = r7.iterator()
            L_0x077c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0798
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r14)
                r3.append(r1)
                java.lang.String r14 = r3.toString()
                goto L_0x077c
            L_0x0798:
                java.lang.String r0 = r14.trim()
                int r1 = r7.size()
                r3 = 4
                if (r1 < r3) goto L_0x07b2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r10)
                java.lang.String r0 = r1.toString()
            L_0x07b2:
                r2.f270289b = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.C93594f1.C93599e.m118184a(android.content.Context, pb1.z):com.tencent.mm.plugin.fav.ui.f1$e");
        }

        /* renamed from: b */
        public static String m118185b(C101871zc0 zc02) {
            if (zc02 != null) {
                return zc02.f299958o;
            }
            Log.m105924i("MicroMsg.FavSendLogic", "getPoiname but locItem is null");
            return "";
        }

        /* renamed from: c */
        public static boolean m118186c(String str) {
            return new C86009m1(str).mo119967g();
        }

        /* renamed from: d */
        public static void m118187d(C93599e eVar, String str) {
            String str2 = C100734q.m131812C() + C90193h.m112878f(Util.nullAs(str, "").getBytes());
            if (m118186c(str2)) {
                eVar.f270290c = str2;
            }
        }
    }

    /* renamed from: a */
    public static void m118173a(Context context, String str, C101834rc0 rc02) {
        C101834rc0 rc03 = rc02;
        C86009m1 m1Var = new C86009m1(C100734q.m131880w(rc02));
        if (m1Var.mo119967g()) {
            String d = m118176d(rc02);
            Log.m105919d("MicroMsg.FavSendLogic", "send fav short Video::data path[%s] thumb path[%s]", m1Var.mo119971i(), d);
            tc4 tc4 = null;
            C101849uc0 uc02 = rc03.f299306h1;
            if (uc02 != null) {
                tc4 = new tc4();
                tc4.f299542i = uc02.f299615i;
                tc4.f299541h = uc02.f299614h;
                tc4.f299538e = uc02.f299611e;
                tc4.f299537d = uc02.f299610d;
                tc4.f299539f = uc02.f299612f;
                tc4.f299543j = uc02.f299616j;
                tc4.f299544n = uc02.f299617n;
                tc4.f299540g = uc02.f299613g;
            }
            tc4 tc42 = tc4;
            if (tc42 != null) {
                C7250m.m7431a().mo136262bz(context, str, m1Var.mo119971i(), d, 62, rc03.f299338y, tc42, false, false, rc03.f299311k1, rc03.f299259I1, rc03.f299263K1);
                return;
            }
            C7250m.m7431a().Zv0(context, str, m1Var.mo119971i(), d, 62, rc03.f299338y, false, false, rc03.f299311k1, rc03.f299259I1, rc03.f299263K1);
            return;
        }
        Log.m105928w("MicroMsg.FavSendLogic", "sendShortVideo, error! data not existed");
    }

    /* renamed from: b */
    public static void m118174b(Context context, String str, C101834rc0 rc02) {
        C48300n nVar;
        C101755ad0 ad02;
        String str2;
        String str3 = str;
        C101834rc0 rc03 = rc02;
        C86009m1 m1Var = new C86009m1(C100734q.m131880w(rc02));
        tc4 tc4 = null;
        if (m1Var.mo119967g()) {
            C86009m1 m1Var2 = new C86009m1(C100734q.m131826Q(rc02));
            if (m1Var2.mo119967g()) {
                str2 = m1Var2.mo119971i();
            } else {
                str2 = C100734q.m131812C() + C90193h.m112878f(Util.nullAs(rc03.f299254G, "").getBytes());
            }
            String str4 = str2;
            Log.m105919d("MicroMsg.FavSendLogic", "sendVideo::data path[%s] thumb path[%s]", m1Var.mo119971i(), str4);
            C101849uc0 uc02 = rc03.f299306h1;
            if (uc02 != null) {
                tc4 = new tc4();
                tc4.f299542i = uc02.f299615i;
                tc4.f299541h = uc02.f299614h;
                tc4.f299538e = uc02.f299611e;
                tc4.f299537d = uc02.f299610d;
                tc4.f299539f = uc02.f299612f;
                tc4.f299543j = uc02.f299616j;
                tc4.f299544n = uc02.f299617n;
            }
            tc4 tc42 = tc4;
            if (tc42 != null) {
                C7250m.m7431a().mo136262bz(context, str, m1Var.mo119971i(), str4, 1, rc03.f299338y, tc42, false, false, rc03.f299311k1, rc03.f299259I1, rc03.f299263K1);
                return;
            }
            C7250m.m7431a().Zv0(context, str, m1Var.mo119971i(), str4, 1, rc03.f299338y, false, false, rc03.f299311k1, rc03.f299259I1, rc03.f299263K1);
            return;
        }
        C101841sc0 sc02 = rc03.f299296c1;
        if (sc02 == null || (ad02 = sc02.f299422x) == null) {
            nVar = null;
        } else {
            nVar = new C48300n();
            nVar.f133366d = ad02.f297860s;
            nVar.f133367e = ad02.f297861t;
            nVar.f133368f = ad02.f297854j;
            nVar.f133369g = rc03.f299297d;
            nVar.f133370h = ad02.f297859r;
            nVar.f133371i = ad02.f297853i;
            nVar.f133372j = ad02.f297850f;
            nVar.f133373n = ad02.f297851g;
            nVar.f133374o = rc03.f299242A;
            nVar.f133375p = ad02.f297855n;
            nVar.f133376q = ad02.f297856o;
        }
        if (nVar != null) {
            ((C45696d) C86709a0.m107533q(C45696d.class)).hi0(str3, nVar, "", new C29934h1());
            return;
        }
        String str5 = rc03.f299242A;
        if (!Util.isNullOrNil(str5)) {
            WXVideoObject wXVideoObject = new WXVideoObject();
            wXVideoObject.videoUrl = str5;
            WXMediaMessage wXMediaMessage = new WXMediaMessage(wXVideoObject);
            String nullAs = Util.nullAs(rc03.f299297d, context.getResources().getString(C0966R.string.cs8));
            wXMediaMessage.mediaObject = wXVideoObject;
            wXMediaMessage.title = nullAs;
            wXMediaMessage.description = rc03.f299301f;
            byte[] readFromFile = Util.readFromFile(C100734q.m131826Q(rc02));
            wXMediaMessage.thumbData = readFromFile;
            if (readFromFile == null) {
                wXMediaMessage.thumbData = Util.readFromFile(C100734q.m131812C() + C90193h.m112878f(Util.nullAs(rc03.f299254G, "").getBytes()));
            }
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195618r = 3;
            C101849uc0 uc03 = rc03.f299306h1;
            if (uc03 != null) {
                bVar.f195557b2 = uc03.f299615i;
                bVar.f195547Y1 = uc03.f299614h;
                bVar.f195544X1 = uc03.f299611e;
                bVar.f195541W1 = uc03.f299610d;
                bVar.f195550Z1 = uc03.f299612f;
                bVar.f195561c2 = uc03.f299616j;
                bVar.f195565d2 = uc03.f299617n;
            }
            ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123899jh(bVar, wXMediaMessage, str3, (String) null);
        }
    }

    /* renamed from: c */
    public static void m118175c(String str, C100755z zVar, C101834rc0 rc02) {
        String w = C100734q.m131880w(rc02);
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.setFilePath(w);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        String str2 = rc02.f299297d;
        wXMediaMessage.title = str2;
        if (Util.isNullOrNil(str2)) {
            wXMediaMessage.title = zVar.field_favProto.f298626q;
        }
        wXMediaMessage.description = rc02.f299301f;
        wXMediaMessage.thumbData = Util.readFromFile(C100734q.m131826Q(rc02));
        ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123896Bb(wXMediaMessage, "", "", str, 3, (String) null);
    }

    /* renamed from: d */
    public static String m118176d(C101834rc0 rc02) {
        C86009m1 m1Var = new C86009m1(C100734q.m131826Q(rc02));
        if (m1Var.mo119967g()) {
            return m1Var.mo119971i();
        }
        return C100734q.m131812C() + C90193h.m112878f(Util.nullAs(rc02.f299254G, "").getBytes());
    }

    /* renamed from: e */
    public static boolean m118177e(C101834rc0 rc02) {
        if (rc02 == null || Util.isNullOrNil(rc02.f299262K)) {
            return false;
        }
        return Util.isEqual(rc02.f299262K, ".htm") || Util.isEqual(rc02.f299262K, "htm");
    }

    /* renamed from: f */
    public static void m118178f(Context context, String str, C100755z zVar, C101834rc0 rc02, Runnable runnable) {
        if (context == null) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav file, but context is null");
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav file, but to user is null");
        } else {
            if (zVar == null) {
                Log.m105928w("MicroMsg.FavSendLogic", "want to send fav file, but info is null");
            }
            if (rc02 == null) {
                Log.m105928w("MicroMsg.FavSendLogic", "want to send fav file, but dataItem is null");
            } else {
                C86709a0.m107525e().postToWorker(new C93597c(str, zVar, rc02, runnable));
            }
        }
    }

    /* renamed from: g */
    public static void m118179g(String str, String str2, String str3, String str4, String str5) {
        String str6;
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.setFilePath(str2);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.title = str3;
        wXMediaMessage.description = str4;
        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
        if (Util.isNullOrNil(str5)) {
            str6 = "";
        } else {
            String P = C100734q.m131825P(str5);
            str6 = new C86009m1(C100734q.m131870r(P), P).mo119971i();
        }
        wXMediaMessage.thumbData = Util.readFromFile(str6);
        ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123896Bb(wXMediaMessage, "", "", str, 3, (String) null);
    }

    /* renamed from: h */
    public static void m118180h(Context context, String str, String str2, List<C100755z> list, Runnable runnable) {
        if (context == null) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav msg, but context is null");
            MMHandlerThread.postToMainThread(runnable);
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav msg, but to user is null");
            MMHandlerThread.postToMainThread(runnable);
        } else if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav msg, but info is null");
            MMHandlerThread.postToMainThread(runnable);
        } else {
            ((C119157j) C119157j.f356862d).mo183875f(new C93595a(str, list, context, str2, runnable));
        }
    }

    /* renamed from: i */
    public static void m118181i(Context context, String str, String str2, C100755z zVar, Runnable runnable) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(zVar);
        m118180h(context, str, str2, linkedList, runnable);
    }

    /* renamed from: j */
    public static void m118182j(Context context, String str, String str2, String str3, int i, String str4, Runnable runnable, String str5) {
        if (context == null) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
        } else {
            String str6 = str2;
            C86009m1 m1Var = new C86009m1(str2);
            if (!Util.isNullOrNil(str2) || m1Var.mo119967g()) {
                C86709a0.m107525e().postToWorker(new C93598d(context, str, str2, str3, i, str4, str5, runnable));
            } else {
                Log.m105928w("MicroMsg.FavSendLogic", "want to send fav video, but datapath is null or is not exist ");
            }
        }
    }

    /* renamed from: k */
    public static void m118183k(Context context, String str, C101834rc0 rc02, Runnable runnable) {
        if (context == null) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
        } else if (rc02 == null) {
            Log.m105928w("MicroMsg.FavSendLogic", "want to send fav video, but dataItem is null");
        } else {
            C86709a0.m107525e().postToWorker(new C93596b(rc02, context, str, runnable));
        }
    }
}
