package nm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;
import hr0.C87584b;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13603j;
import u24.C90599h;
import z04.C112551y;

/* renamed from: nm0.e */
public final class C89025e extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 652;
    @Deprecated
    public static final String NAME = "operateRealtimeData";

    /* renamed from: nm0.e$a */
    public static final class C89026a extends C82926s {
        @Deprecated
        public static final int CTRL_INDEX = 653;
        @Deprecated
        public static final String NAME = "onRealtimeDataResponse";
    }

    /* renamed from: nm0.e$b */
    public enum C89027b {
        HIGH,
        LOW,
        IMMEDIATE
    }

    /* renamed from: nm0.e$c */
    public static final class C89028c {

        /* renamed from: a */
        public String f256638a;

        /* renamed from: b */
        public String f256639b;

        /* renamed from: c */
        public int f256640c;

        /* renamed from: d */
        public int f256641d;

        /* renamed from: e */
        public int f256642e;

        /* renamed from: f */
        public int f256643f;

        /* renamed from: g */
        public int f256644g;

        /* renamed from: h */
        public C89027b f256645h;

        /* renamed from: i */
        public long f256646i;

        /* renamed from: j */
        public int f256647j;

        /* renamed from: k */
        public C89029a f256648k;

        /* renamed from: nm0.e$c$a */
        public enum C89029a {
            Enqueued(1),
            Succeed(2),
            Failed(3);
            

            /* renamed from: d */
            public final int f256653d;

            /* access modifiers changed from: public */
            C89029a(int i) {
                this.f256653d = i;
            }
        }

        /* renamed from: a */
        public final void mo123391a() {
            String str;
            LinkedList linkedList = new LinkedList();
            String str2 = this.f256638a;
            if (str2 != null) {
                linkedList.add(str2);
                String str3 = this.f256639b;
                if (str3 != null) {
                    linkedList.add(str3);
                    linkedList.add(String.valueOf(this.f256640c));
                    linkedList.add(String.valueOf(this.f256641d));
                    linkedList.add(String.valueOf(this.f256642e));
                    linkedList.add(String.valueOf(this.f256643f));
                    linkedList.add(String.valueOf(this.f256644g));
                    C89027b bVar = this.f256645h;
                    if (bVar != null) {
                        int ordinal = bVar.ordinal();
                        if (ordinal == 0) {
                            str = "2";
                        } else if (ordinal == 1) {
                            str = "3";
                        } else if (ordinal == 2) {
                            str = "1";
                        } else {
                            throw new C13603j();
                        }
                        linkedList.add(str);
                        linkedList.add(String.valueOf(this.f256646i));
                        linkedList.add(String.valueOf(this.f256647j));
                        C89029a aVar = this.f256648k;
                        if (aVar != null) {
                            linkedList.add(String.valueOf(aVar.f256653d));
                            String e = C90599h.m113512e(linkedList, ",");
                            Log.m105918d("Luggage.JsApiOperateRealtimeReport.ReportKVItem", "report 26761, " + e);
                            C87584b bVar2 = (C87584b) C89909e.m112439d(C87584b.class, true);
                            if (bVar2 != null) {
                                bVar2.kvStat(26761, e);
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("action");
                        throw null;
                    }
                    C87412m.m108603p(DownloadInfo.PRIORITY);
                    throw null;
                }
                C87412m.m108603p("appId");
                throw null;
            }
            C87412m.m108603p("instanceId");
            throw null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r5.getRuntime();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo123392b(com.tencent.p014mm.plugin.appbrand.C81879g r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L_0x000e
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r5.getRuntime()
                if (r1 == 0) goto L_0x000e
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r1.mo113036W()
                goto L_0x000f
            L_0x000e:
                r1 = r0
            L_0x000f:
                boolean r2 = r1 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU
                if (r2 == 0) goto L_0x0016
                com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r1
                goto L_0x0017
            L_0x0016:
                r1 = r0
            L_0x0017:
                if (r1 == 0) goto L_0x001c
                java.lang.String r2 = r1.f234838r
                goto L_0x001d
            L_0x001c:
                r2 = r0
            L_0x001d:
                java.lang.String r3 = ""
                if (r2 != 0) goto L_0x0022
                r2 = r3
            L_0x0022:
                r4.f256638a = r2
                if (r5 == 0) goto L_0x002a
                java.lang.String r0 = r5.getAppId()
            L_0x002a:
                if (r0 != 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r3 = r0
            L_0x002e:
                r4.f256639b = r3
                if (r1 == 0) goto L_0x0035
                int r5 = r1.f234802F
                goto L_0x0036
            L_0x0035:
                r5 = 0
            L_0x0036:
                r4.f256640c = r5
                if (r1 == 0) goto L_0x003d
                int r5 = r1.f239365g
                goto L_0x003e
            L_0x003d:
                r5 = -1
            L_0x003e:
                int r5 = r5 + 1
                r4.f256641d = r5
                if (r1 == 0) goto L_0x0047
                int r5 = r1.f234841u
                goto L_0x0049
            L_0x0047:
                r5 = -1000(0xfffffffffffffc18, float:NaN)
            L_0x0049:
                int r5 = r5 + 1000
                r4.f256642e = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nm0.C89025e.C89028c.mo123392b(com.tencent.mm.plugin.appbrand.g):void");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C89027b bVar;
        C81879g gVar = (C81879g) fVar;
        if (gVar != null && jSONObject != null) {
            try {
                String string = jSONObject.getString("content");
                if (((long) string.length()) >= 65536) {
                    gVar.mo109647a(i, mo115109j("fail too large data"));
                    return;
                }
                try {
                    int i2 = jSONObject.getInt("type");
                    try {
                        String string2 = jSONObject.getString(DownloadInfo.PRIORITY);
                        C87412m.m108593f(string2, "data.getString(\"priority\")");
                        C89027b[] values = C89027b.values();
                        int length = values.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                bVar = C89027b.LOW;
                                break;
                            }
                            C89027b bVar2 = values[i3];
                            if (C112551y.m153809i(bVar2.name(), string2, true)) {
                                bVar = bVar2;
                                break;
                            }
                            i3++;
                        }
                        try {
                            try {
                                C89033k.f256655a.mo123395b(gVar, jSONObject.getInt("id"), i2, string, bVar);
                                gVar.mo109647a(i, mo115109j("ok"));
                            } catch (Exception e) {
                                gVar.mo109647a(i, mo115109j("fail:internal error " + e.getMessage()));
                            }
                        } catch (JSONException unused) {
                            gVar.mo109647a(i, mo115109j("fail:invalid data id"));
                        }
                    } catch (JSONException unused2) {
                        gVar.mo109647a(i, mo115109j("fail:invalid data priority"));
                    }
                } catch (JSONException unused3) {
                    gVar.mo109647a(i, mo115109j("fail:invalid data type"));
                }
            } catch (JSONException unused4) {
                gVar.mo109647a(i, mo115109j("fail:invalid data content"));
            }
        }
    }
}
