package p676rl;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C30774r3;
import cw1.C30927a;
import dw1.C31315a;
import dw1.C31318e;
import dw1.C31320g;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C117747y;
import oe3.C35158b;
import p248ug.C37453h0;
import p248ug.C37467u;
import sf0.C48374j0;
import te3.C48649a12;
import te3.C50207l3;
import te3.C77949j3;
import u24.C90598g;

/* renamed from: rl.b */
public class C36333b implements C31320g {

    /* renamed from: a */
    public List<C37467u> f96705a;

    /* renamed from: b */
    public C36334a f96706b;

    /* renamed from: c */
    public C37453h0 f96707c;

    /* renamed from: rl.b$a */
    public interface C36334a {
        /* renamed from: a */
        void mo60626a(C37467u uVar);

        /* renamed from: b */
        void mo60627b(C37467u uVar);
    }

    public C36333b(List<C37467u> list, C37453h0 h0Var, C36334a aVar) {
        this.f96707c = h0Var;
        this.f96706b = aVar;
        this.f96705a = list;
    }

    /* renamed from: a */
    public void mo58072a(int i, int i2, String str, C117747y yVar) {
        C31315a aVar;
        int i3;
        int i4 = i2;
        if (yVar.getType() == 825) {
            List<C37467u> list = this.f96705a;
            if (list == null) {
                Log.m105920e("FunctionMsg.FunctionMsgFetcher", "[onSceneEnd] mFetchItemList is null.");
                return;
            }
            C30927a aVar2 = (C30927a) yVar;
            C48649a12 a122 = aVar2.f83013f;
            C37467u uVar = (C37467u) aVar2.f83016i;
            Log.m105925i("FunctionMsg.FunctionMsgFetcher", "[onSceneEnd] size:%s errCode:%s errMsg:%s functionMsgId:%s", Integer.valueOf(list.size()), Integer.valueOf(i2), str, uVar.field_functionmsgid);
            HashMap<Integer, C31318e> hashMap = C35158b.f94288a;
            String str2 = uVar.field_cgi;
            C87412m.m108594g(str2, "cgiKey");
            HashMap<String, C31315a> hashMap2 = C35158b.f94290c;
            synchronized (hashMap2) {
                aVar = hashMap2.get(str2);
                if (aVar == null) {
                    aVar = C35158b.f94289b;
                }
            }
            aVar.mo58071a(i4);
            if (this.f96705a.contains(uVar)) {
                if (i4 != 0 || ((i4 == 0 && a122 == null) || ((a122 != null && a122.f130209d == 2) || (a122 != null && a122.f130209d == 1)))) {
                    Object[] objArr = new Object[4];
                    objArr[0] = uVar.field_functionmsgid;
                    objArr[1] = Long.valueOf(uVar.field_preVersion);
                    objArr[2] = Long.valueOf(uVar.field_version);
                    objArr[3] = Integer.valueOf(a122 == null ? -1 : a122.f130209d);
                    Log.m105925i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s, fetch failed, mark as fetch failed, preVersion: %s, version: %s op:%s", objArr);
                    int i5 = uVar.field_retryCount;
                    if (i5 < uVar.field_retryCountLimit) {
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = Integer.valueOf(i5);
                        objArr2[1] = uVar.field_functionmsgid;
                        objArr2[2] = Integer.valueOf(uVar.field_retryinterval);
                        objArr2[3] = Boolean.valueOf(a122 == null);
                        Log.m105925i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] has retryCount:%s id:%s retryInterval:%s response is null?%s", objArr2);
                        if (a122 != null) {
                            Log.m105925i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] opCode:%s actionTime:%s", Integer.valueOf(a122.f130209d), Integer.valueOf(a122.f130213h));
                            int i6 = a122.f130209d;
                            if (i6 == 2) {
                                uVar.field_actionTime = (long) a122.f130213h;
                                uVar.field_retryCount++;
                                uVar.field_status = -1;
                            } else if (i6 == 1) {
                                uVar.field_status = 3;
                                uVar.field_retryCount = uVar.field_retryCountLimit;
                            } else {
                                uVar.field_status = 3;
                            }
                            String str3 = a122.f130212g;
                            if (!Util.isNullOrNil(str3)) {
                                uVar.field_custombuff = str3;
                            }
                        } else {
                            uVar.field_status = -1;
                            uVar.field_actionTime = (C31543z5.m39451a() / 1000) + ((long) uVar.field_retryinterval);
                            uVar.field_retryCount++;
                        }
                    } else {
                        uVar.field_status = 3;
                    }
                    C30774r3 r3Var = C30774r3.f82750d;
                    r3Var.mo57696Lo(uVar.field_functionmsgid, uVar);
                    if (uVar.field_status != 3) {
                        C115669n.INSTANCE.idkeyStat((long) uVar.field_reportid, (long) uVar.field_failkey, 1, false);
                        Log.m105925i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] maybe has to retry fetch! delay:%sms retryCount:%s", Long.valueOf((uVar.field_actionTime - (C31543z5.m39451a() / 1000)) * 1000), Integer.valueOf(uVar.field_retryCount));
                    } else {
                        C77949j3 d = mo60625d(uVar.field_addMsg, uVar.field_defaultContent);
                        Log.m105925i("FunctionMsg.FunctionMsgFetcher", "[handleFailFetch] addMsgDefault is null? %s", d);
                        if (d != null) {
                            uVar.field_addMsg = d;
                        }
                        int i7 = d == null ? 3 : 2;
                        uVar.field_status = i7;
                        if (3 == i7) {
                            uVar.field_version = uVar.field_preVersion;
                            C115669n.INSTANCE.idkeyStat((long) uVar.field_reportid, (long) uVar.field_finalfailkey, 1, false);
                        }
                        r3Var.mo57696Lo(uVar.field_functionmsgid, uVar);
                    }
                } else if (a122 != null && i4 == 0 && ((i3 = a122.f130209d) == 3 || i3 == 0)) {
                    Log.m105925i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s fetch success, response.version: %s, fetchItem.version: %s ActionTime:%s OpCode:%s", uVar.field_functionmsgid, Long.valueOf(a122.f130210e), Long.valueOf(uVar.field_version), Integer.valueOf(a122.f130213h), Integer.valueOf(a122.f130209d));
                    uVar.field_status = a122.f130209d == 3 ? -2 : 2;
                    uVar.field_businessInfo = a122.f130214i;
                    uVar.field_actionTime = (long) a122.f130213h;
                    C77949j3 j3Var = a122.f130211f;
                    if (j3Var != null) {
                        uVar.field_addMsg = j3Var;
                    }
                    if (!a122.f130215j.isEmpty()) {
                        LinkedList<C77949j3> linkedList = a122.f130215j;
                        C50207l3 l3Var = new C50207l3();
                        l3Var.f137141d.addAll(linkedList);
                        uVar.field_addMsgs = l3Var;
                    }
                    C30774r3.f82750d.mo57696Lo(uVar.field_functionmsgid, uVar);
                }
                int i8 = uVar.field_status;
                if ((i8 == 2 || i8 == -2) && this.f96705a.remove(uVar)) {
                    this.f96706b.mo60626a(uVar);
                    C115669n.INSTANCE.idkeyStat((long) uVar.field_reportid, (long) uVar.field_successkey, 1, false);
                } else if (this.f96705a.remove(uVar)) {
                    this.f96706b.mo60627b(uVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo60623b(String str) {
        return ".addmsg" + str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: dw1.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60624c() {
        /*
            r9 = this;
            java.util.List<ug.u> r0 = r9.f96705a
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ec
            java.lang.Object r1 = r0.next()
            ug.u r1 = (p248ug.C37467u) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x009a
            java.lang.String r4 = r1.field_cgi
            if (r4 == 0) goto L_0x009a
            int r4 = r1.field_cmdid
            if (r4 <= 0) goto L_0x009a
            java.lang.String r4 = "FunctionMsg.FunctionMsgFetcher"
            java.lang.String r5 = "[fetchInternal], functionMsgId: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = r1.field_functionmsgid
            r2[r3] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
            r1.field_status = r3
            ug.h0 r2 = r9.f96707c
            int r3 = r1.field_cmdid
            java.lang.String r4 = r1.field_functionmsgid
            te3.ok r5 = r1.field_businessInfo
            r2.mo59547c(r3, r4, r5)
            java.util.HashMap<java.lang.Integer, dw1.e> r2 = oe3.C35158b.f94288a
            int r2 = r1.field_cmdid
            java.util.HashMap<java.lang.Integer, dw1.e> r3 = oe3.C35158b.f94288a
            monitor-enter(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0097 }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x0097 }
            dw1.e r4 = (dw1.C31318e) r4     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            if (r4 != 0) goto L_0x008b
            java.lang.Class<dw1.f> r4 = dw1.C31319f.class
            wl.d r4 = p261wl.C38166b.m41759f(r4)     // Catch:{ all -> 0x0097 }
            wl.b$a r4 = (p261wl.C38166b.C38167a) r4     // Catch:{ all -> 0x0097 }
            wl.b$a$b r5 = new wl.b$a$b     // Catch:{ all -> 0x0097 }
            wl.d<T> r6 = r4.f100837d     // Catch:{ all -> 0x0097 }
            java.lang.Iterable r6 = r6.all()     // Catch:{ all -> 0x0097 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0097 }
            r5.<init>(r4, r6)     // Catch:{ all -> 0x0097 }
        L_0x0066:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0097 }
            wl.i r4 = (p261wl.C38174i) r4     // Catch:{ all -> 0x0097 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0097 }
            boolean r6 = r4.hasKey(r6)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0066
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x0097 }
            gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x0097 }
            r4 = r2
            dw1.f r4 = (dw1.C31319f) r4     // Catch:{ all -> 0x0097 }
            goto L_0x008b
        L_0x0087:
            dw1.a r2 = oe3.C35158b.f94289b     // Catch:{ all -> 0x0097 }
            monitor-exit(r3)
            goto L_0x008d
        L_0x008b:
            monitor-exit(r3)
            r2 = r4
        L_0x008d:
            rx3.l r3 = new rx3.l
            r3.<init>(r1, r9)
            r2.mo8643d(r3)
            goto L_0x0006
        L_0x0097:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x009a:
            if (r1 == 0) goto L_0x0006
            te3.j3 r4 = r1.field_addMsg
            java.lang.String r5 = r1.field_defaultContent
            te3.j3 r4 = r9.mo60625d(r4, r5)
            java.lang.String r5 = "FunctionMsg.FunctionMsgFetcher"
            java.lang.String r6 = "[fetchInternal] addMsgDefault is null? %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r2)
            if (r4 == 0) goto L_0x00b3
            r1.field_addMsg = r4
        L_0x00b3:
            long r2 = r1.field_actionTime
            long r5 = eb0.C31543z5.m39451a()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c2
            r2 = -2
            goto L_0x00c3
        L_0x00c2:
            r2 = 2
        L_0x00c3:
            r1.field_status = r2
            com.tencent.mm.storage.r3 r2 = com.tencent.p014mm.storage.C30774r3.f82750d
            java.lang.String r3 = r1.field_functionmsgid
            r2.mo57696Lo(r3, r1)
            if (r4 == 0) goto L_0x00dd
            java.util.List<ug.u> r2 = r9.f96705a
            boolean r2 = r2.remove(r1)
            if (r2 == 0) goto L_0x00dd
            rl.b$a r2 = r9.f96706b
            r2.mo60626a(r1)
            goto L_0x0006
        L_0x00dd:
            java.util.List<ug.u> r2 = r9.f96705a
            boolean r2 = r2.remove(r1)
            if (r2 == 0) goto L_0x0006
            rl.b$a r2 = r9.f96706b
            r2.mo60627b(r1)
            goto L_0x0006
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p676rl.C36333b.mo60624c():void");
    }

    /* renamed from: d */
    public final C77949j3 mo60625d(C77949j3 j3Var, String str) {
        if (j3Var == null) {
            Log.m105928w("FunctionMsg.FunctionMsgFetcher", "null == raw");
            return null;
        }
        int indexOf = str.indexOf("<addmsg");
        if (indexOf == -1) {
            Log.m105921e("FunctionMsg.FunctionMsgFetcher", "msgContent not start with <addmsg! content is null?%s", Boolean.valueOf(Util.isNullOrNil(str)));
            return null;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str.substring(indexOf), "addmsg", (String) null);
        StringBuilder sb = new StringBuilder();
        if (parseXml.containsKey(mo60623b(".msgid"))) {
            int i = Util.getInt(parseXml.get(mo60623b(".msgid")), 0);
            j3Var.f227627d = i;
            sb.append("msgid:" + i);
        }
        if (parseXml.containsKey(mo60623b(".newmsgid"))) {
            long j = Util.getLong(parseXml.get(mo60623b(".newmsgid")), 0);
            j3Var.f227638r = j;
            sb.append(" newMsgId:" + j);
        }
        if (parseXml.containsKey(mo60623b(".msgseq"))) {
            int i2 = Util.getInt(parseXml.get(mo60623b(".msgseq")), 0);
            j3Var.f227639s = i2;
            sb.append(" msgSeq:" + i2);
        }
        if (parseXml.containsKey(mo60623b(".fromusername"))) {
            String str2 = parseXml.get(mo60623b(".fromusername"));
            j3Var.f227628e = C48374j0.m53720i(str2);
            sb.append(" fromUsername:" + str2);
        }
        if (parseXml.containsKey(mo60623b(".tousername"))) {
            String str3 = parseXml.get(mo60623b(".tousername"));
            j3Var.f227629f = C48374j0.m53720i(str3);
            sb.append(" toUsername:" + str3);
        }
        if (parseXml.containsKey(mo60623b(".msgtype"))) {
            int i3 = Util.getInt(parseXml.get(mo60623b(".msgtype")), 0);
            j3Var.f227630g = i3;
            sb.append(" msgType:" + i3);
        }
        if (parseXml.containsKey(mo60623b(".status"))) {
            int i4 = Util.getInt(parseXml.get(mo60623b(".status")), 0);
            j3Var.f227632i = i4;
            sb.append(" status:" + i4);
        }
        if (parseXml.containsKey(mo60623b(".content"))) {
            j3Var.f227631h = C48374j0.m53720i(C90598g.m113507f(str.substring(str.indexOf("<content>") + 9, str.indexOf("</content>"))));
            sb.append(" msgContent:*");
        } else {
            sb.append(" msgContent:null");
            j3Var.f227631h = null;
        }
        if (parseXml.containsKey(mo60623b(".msgsource"))) {
            j3Var.f227636p = C90598g.m113507f(str.substring(str.indexOf("<msgsource>") + 11, str.indexOf("</msgsource>")));
            sb.append(" msgSource:*");
        }
        if (parseXml.containsKey(mo60623b(".pushcontent"))) {
            j3Var.f227637q = C90598g.m113507f(str.substring(str.indexOf("<pushcontent>") + 13, str.indexOf("</pushcontent>")));
            sb.append(" pushContent:*");
        }
        if (parseXml.containsKey(mo60623b(".imgstatus"))) {
            int i5 = Util.getInt(parseXml.get(mo60623b(".imgstatus")), 0);
            j3Var.f227633j = i5;
            sb.append(" ImgStatus:" + i5);
        }
        if (parseXml.containsKey(mo60623b(".imgbuf"))) {
            j3Var.f227634n = C48374j0.m53719h(parseXml.get(mo60623b(".imgbuf")), true);
            sb.append(" imgBuf:*");
        }
        if (parseXml.containsKey(mo60623b(".createtime"))) {
            int i6 = Util.getInt(parseXml.get(mo60623b(".createtime")), 0);
            j3Var.f227635o = i6;
            sb.append(" createTime:" + i6);
        }
        Log.m105925i("FunctionMsg.FunctionMsgFetcher", "[mergeAddMsg] result:%s", sb.toString());
        return j3Var;
    }
}
