package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import hy1.C46135a;
import hy1.C46137b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kj2.C117407d;
import kotlin.Metadata;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.y1 */
public final class C41923y1 extends C43620m2<C53095a> {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/jsapi/y1$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.y1$a */
    public static final class C41924a implements C80916r<IPCInteger, IPCBoolean> {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                com.tencent.mm.ipcinvoker.type.IPCInteger r7 = (com.tencent.p014mm.ipcinvoker.type.IPCInteger) r7
                java.lang.String r0 = "data"
                gy3.C87412m.m108594g(r7, r0)
                int r7 = r7.f10313d
                com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
                r1 = 0
                if (r0 == 0) goto L_0x0015
                py1.o1 r0 = r0.GameReport
                if (r0 == 0) goto L_0x0018
                java.util.LinkedList<py1.n0> r0 = r0.f127901e
                goto L_0x0019
            L_0x0015:
                com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()
            L_0x0018:
                r0 = r1
            L_0x0019:
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x0026
                boolean r4 = r0.isEmpty()
                if (r4 == 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r4 = 0
                goto L_0x0027
            L_0x0026:
                r4 = 1
            L_0x0027:
                if (r4 != 0) goto L_0x0059
                java.lang.String r4 = "feReportList"
                gy3.C87412m.m108593f(r0, r4)
                java.util.Iterator r0 = r0.iterator()
            L_0x0032:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0049
                java.lang.Object r4 = r0.next()
                r5 = r4
                py1.n0 r5 = (py1.C47632n0) r5
                int r5 = r5.f127885d
                if (r5 != r7) goto L_0x0045
                r5 = 1
                goto L_0x0046
            L_0x0045:
                r5 = 0
            L_0x0046:
                if (r5 == 0) goto L_0x0032
                r1 = r4
            L_0x0049:
                py1.n0 r1 = (py1.C47632n0) r1
                if (r1 == 0) goto L_0x0053
                com.tencent.mm.ipcinvoker.type.IPCBoolean r7 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
                r7.<init>(r2)
                goto L_0x005e
            L_0x0053:
                com.tencent.mm.ipcinvoker.type.IPCBoolean r7 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
                r7.<init>(r3)
                goto L_0x005e
            L_0x0059:
                com.tencent.mm.ipcinvoker.type.IPCBoolean r7 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
                r7.<init>(r2)
            L_0x005e:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C41923y1.C41924a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "updateClientReport";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
        C53096b<C53095a>.a aVar2 = aVar;
        if (aVar2 != null) {
            JSONObject jSONObject = aVar2.f148190b.f129368c;
            if (jSONObject == null) {
                Log.m105920e("updateClientReport", "data is null");
                aVar2.mo73778c("null_data", (JSONObject) null);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("clientReportDict");
            if (optJSONObject == null) {
                Log.m105920e("updateClientReport", "clientReportDict is null");
                aVar2.mo73778c("clientReportDict is null", (JSONObject) null);
                return;
            }
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("logId", 27792);
                    IPCBoolean iPCBoolean = (IPCBoolean) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCInteger(optInt), C41924a.class);
                    boolean z = true;
                    if (!(iPCBoolean == null ? true : iPCBoolean.f10312d)) {
                        Log.m105920e("updateClientReport", "gamelog.jsapi, " + "updateClientReport" + " , logId = " + optInt + "  not exist in globalConfig FrontEndReport");
                    } else {
                        boolean optBoolean = optJSONObject2.optBoolean("reportOnExit", false);
                        String optString = optJSONObject2.optString("reportStr", "");
                        String optString2 = optJSONObject2.optString("timePlaceHolderKey", "");
                        long optLong = optJSONObject2.optLong("reportDuration", 0);
                        boolean optBoolean2 = optJSONObject2.optBoolean("isTimeMillSecond", false);
                        boolean optBoolean3 = optJSONObject2.optBoolean("markTimeStart", false);
                        boolean optBoolean4 = optJSONObject2.optBoolean("isReportNow", false);
                        boolean optBoolean5 = optJSONObject2.optBoolean("recordOpenOtherPage", false);
                        if (optString == null || optString.length() == 0) {
                            Log.m105920e("updateClientReport", "gamelog.jsapi, updateClientReport , reportStr is null");
                        } else {
                            C87412m.m108593f(next, "key");
                            C87412m.m108593f(optString, "reportStr");
                            JSONObject jSONObject2 = optJSONObject;
                            C46137b bVar = r5;
                            C46137b bVar2 = new C46137b(next, optInt, optBoolean, optString, optString2, optBoolean3, optBoolean4, optLong, optBoolean2, optBoolean3 ? Util.currentTicks() : 0, optBoolean5);
                            if (optBoolean4) {
                                C46135a aVar3 = C46135a.f124316a;
                                int hashCode = aVar2.f148189a.hashCode();
                                ArrayList arrayList = C46135a.f124317b.get(Integer.valueOf(hashCode));
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                if (!arrayList.isEmpty()) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object next2 : arrayList) {
                                        if (C87412m.m108589b(((C46137b) next2).f124319a, next)) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    C46135a.f124317b.put(Integer.valueOf(hashCode), new ArrayList(arrayList2));
                                }
                                String str = bVar.f124323e;
                                if (!(str == null || str.length() == 0)) {
                                    z = false;
                                }
                                String p = z ? bVar.f124322d : C112551y.m153816p(bVar.f124322d, bVar.f124323e, String.valueOf(bVar.f124326h), false, 4, (Object) null);
                                Log.m105924i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + bVar.f124320b + ", reportContent = " + p);
                                C117407d.INSTANCE.kvStat(bVar.f124320b, p);
                            }
                            if (optBoolean || optBoolean5) {
                                C46135a aVar4 = C46135a.f124316a;
                                int hashCode2 = aVar2.f148189a.hashCode();
                                HashMap<Integer, ArrayList<C46137b>> hashMap = C46135a.f124317b;
                                ArrayList arrayList3 = hashMap.get(Integer.valueOf(hashCode2));
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(bVar);
                                hashMap.put(Integer.valueOf(hashCode2), arrayList3);
                                C46135a.f124318c.alive();
                            }
                            optJSONObject = jSONObject2;
                        }
                    }
                }
            }
            aVar.mo73776a();
        }
    }
}
