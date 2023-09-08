package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.Condition;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.ro */
public class C114157ro extends C113564bn implements C113645dy {

    /* renamed from: a */
    private Map<String, C114145rj> f341709a;

    /* renamed from: b */
    private Map<String, AtomicInteger> f341710b;

    /* renamed from: c */
    private File f341711c;

    /* renamed from: d */
    private File f341712d;

    /* renamed from: e */
    private String f341713e;

    /* renamed from: f */
    private boolean f341714f;

    /* renamed from: g */
    private List<C113665ed> f341715g;

    /* renamed from: h */
    private C113666ee f341716h;

    /* renamed from: i */
    private C114164b f341717i;

    /* renamed from: j */
    private Set<String> f341718j;

    /* renamed from: k */
    private boolean f341719k;

    /* renamed from: com.tencent.mapsdk.internal.ro$5 */
    public static /* synthetic */ class C1141625 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f341728a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.mapsdk.internal.dz[] r0 = com.tencent.mapsdk.internal.C113646dz.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f341728a = r0
                com.tencent.mapsdk.internal.dz r1 = com.tencent.mapsdk.internal.C113646dz.Gradient     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f341728a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mapsdk.internal.dz r1 = com.tencent.mapsdk.internal.C113646dz.Aggregation     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f341728a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mapsdk.internal.dz r1 = com.tencent.mapsdk.internal.C113646dz.ArcLine     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f341728a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mapsdk.internal.dz r1 = com.tencent.mapsdk.internal.C113646dz.GLModel     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114157ro.C1141625.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ro$b */
    public static class C114164b extends Handler {

        /* renamed from: a */
        public WeakReference<C114157ro> f341736a;

        public C114164b(C114157ro roVar) {
            super(Looper.myLooper());
            this.f341736a = new WeakReference<>(roVar);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C114157ro roVar = this.f341736a.get();
            if (roVar != null && message.what != 0) {
                String str = (String) message.obj;
                int i = message.arg2;
                if (message.arg1 > 0) {
                    if (i > 0) {
                        C113889km.m157545b(C0949kl.f2254x, "循环刷新[" + str + "]次数[" + i + "]");
                        C114157ro.m159363a(roVar, str);
                    }
                    message.arg2 = i + 1;
                    Message obtain = Message.obtain(message);
                    sendMessageDelayed(obtain, (long) obtain.arg1);
                }
            }
        }
    }

    /* renamed from: d */
    private void m159367d() {
        C113889km.m157545b(C0949kl.f2254x, "#loadLayerJsonFromLocal");
        byte[] c = C113884kf.m157503c(this.f341712d);
        if (c != null && c.length > 0) {
            try {
                m159365b(new JSONObject(new String(c)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: h */
    private void m159369h(String str) {
        if (!TextUtils.isEmpty(str)) {
            C113884kf.m157500b(this.f341712d);
            C113884kf.m157491a(this.f341712d, str.getBytes());
        }
    }

    /* renamed from: i */
    private void m159370i(String str) {
        C113889km.m157545b(C0949kl.f2254x, "#refreshLayerData[" + str + "]");
        C114145rj rjVar = this.f341709a.get(str);
        if (rjVar != null) {
            rjVar.mo172785b((C113645dy) this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public File m159371j(String str) {
        return new File(new File(this.f341711c, Util.getMD5String(m159375n(str))), "cache.dat");
    }

    /* renamed from: k */
    private File m159372k(String str) {
        return new File(this.f341711c, Util.getMD5String(m159375n(str)));
    }

    /* renamed from: l */
    private C113665ed m159373l(String str) {
        final String n = m159375n(str);
        return (C113665ed) Util.singleWhere(new ArrayList(this.f341715g), new Condition<C113665ed>() {
            /* renamed from: a */
            private boolean m159394a(C113665ed edVar) {
                return edVar != null && edVar.f340082a.equals(n);
            }

            public final /* synthetic */ boolean condition(Object obj) {
                C113665ed edVar = (C113665ed) obj;
                return edVar != null && edVar.f340082a.equals(n);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public C114145rj m159374m(final String str) {
        return (C114145rj) Util.singleWhere(this.f341709a.values(), new Condition<C114145rj>() {
            /* renamed from: a */
            private boolean m159395a(C114145rj rjVar) {
                return rjVar != null && rjVar.getId().equals(str);
            }

            public final /* synthetic */ boolean condition(Object obj) {
                C114145rj rjVar = (C114145rj) obj;
                return rjVar != null && rjVar.getId().equals(str);
            }
        });
    }

    /* renamed from: n */
    private static String m159375n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.substring(0, str.lastIndexOf("_") == -1 ? str.length() : str.lastIndexOf("_"));
    }

    /* renamed from: a */
    public final void mo171780a(C113565bo boVar) {
        super.mo171780a(boVar);
        this.f341719k = false;
        this.f341717i = new C114164b(this);
        this.f341709a = new ConcurrentHashMap();
        this.f341710b = new ConcurrentHashMap();
        this.f341715g = new CopyOnWriteArrayList();
        this.f341718j = new HashSet();
        this.f341713e = boVar.mo171810w().f339868a;
        if (!TextUtils.isEmpty(boVar.mo171810w().f339870c)) {
            this.f341713e = boVar.mo171810w().f339870c;
        }
        this.f341711c = new File(boVar.mo171809v().mo172403b(), "visual/".concat(String.valueOf(boVar.mo171810w().mo171818c())));
        this.f341712d = new File(this.f341711c, "layerInfo.json");
        C113889km.m157545b(C0949kl.f2254x, "#datalayer config file [" + this.f341712d + "]");
        C113889km.m157545b(C0949kl.f2254x, "#loadLayerJsonFromLocal");
        byte[] c = C113884kf.m157503c(this.f341712d);
        if (c != null && c.length > 0) {
            try {
                m159365b(new JSONObject(new String(c)));
            } catch (JSONException unused) {
            }
        }
        C114156rn.m159359a();
    }

    /* renamed from: e */
    public final boolean mo171979e(String str) {
        C114145rj m;
        C113889km.m157545b(C0949kl.f2254x, "#checkLayerStatusById[" + str + "]");
        if (this.f341714f) {
            C113665ed l = m159373l(str);
            if (!(l == null || (m = m159374m(str)) == null)) {
                int i = C1141625.f341728a[C113646dz.m156618a(l.f340083b).ordinal()];
                if (i == 1) {
                    m.f341679b = new C114155rm();
                } else if (i == 2) {
                    m.f341679b = new C114143rh();
                } else if (i == 3) {
                    m.f341679b = new C114144ri();
                } else if (i == 4) {
                    m.f341679b = new C114154rl();
                }
            }
            if (l != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo171980f(String str) {
        C113889km.m157553d(C0949kl.f2254x, "添加到等待队列[" + str + "]");
        this.f341718j.add(str);
    }

    /* renamed from: g */
    public final void mo171981g(String str) {
        String n = m159375n(str);
        C113889km.m157545b(C0949kl.f2254x, "#stopTimeInterval[" + str + "]");
        if (!TextUtils.isEmpty(n)) {
            this.f341717i.removeMessages(n.hashCode());
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ro$a */
    public class C114163a extends C113943lp implements C113933li {

        /* renamed from: a */
        public final String f341729a;

        /* renamed from: b */
        public Callback<byte[]> f341730b;

        /* renamed from: c */
        public C113934lj f341731c = new C113934lj();

        /* renamed from: e */
        private final String f341733e;

        /* renamed from: f */
        private ByteArrayOutputStream f341734f;

        /* renamed from: g */
        private String f341735g;

        public C114163a(String str, String str2) {
            this.f341733e = str;
            this.f341729a = str2;
        }

        /* renamed from: a */
        public final void mo171883a(C113939lk lkVar) {
        }

        /* renamed from: a */
        public final void mo171884a(String str) {
            C113889km.m157545b(C0949kl.f2254x, "#start download {" + this.f341733e + "} [" + str + "]");
            this.f341734f = new ByteArrayOutputStream();
        }

        /* renamed from: b */
        public final void mo171886b(String str) {
            C113889km.m157545b(C0949kl.f2254x, "#cancel download {" + this.f341733e + "} [" + str + "]");
            C113886kg.m157515a((Closeable) this.f341734f);
            C114145rj c = C114157ro.this.m159374m(this.f341733e);
            if (c != null) {
                c.mo172780a(1);
            }
        }

        /* renamed from: c */
        public final void mo171887c(String str) {
            C113889km.m157545b(C0949kl.f2254x, "#completed download {" + this.f341733e + "} [" + str + "]");
            this.f341731c.mo172362b((C113933li) this);
            if (this.f341730b != null) {
                byte[] byteArray = this.f341734f.toByteArray();
                byte[] a = "gzip".equals(this.f341735g) ? C80344ki.m97845a((InputStream) new ByteArrayInputStream(byteArray)) : byteArray;
                StringBuilder sb = new StringBuilder("数据量大小 {");
                sb.append(this.f341733e);
                sb.append("} [");
                int i = 0;
                sb.append(byteArray != null ? byteArray.length : 0);
                sb.append(" : ");
                if (a != null) {
                    i = a.length;
                }
                sb.append(i);
                sb.append("]result:");
                sb.append(new String(a));
                C113889km.m157545b(C0949kl.f2254x, sb.toString());
                this.f341730b.callback(a);
            }
            C113886kg.m157515a((Closeable) this.f341734f);
        }

        /* renamed from: d */
        public final void mo171888d(String str) {
            C113889km.m157545b(C0949kl.f2254x, "#fail download {" + this.f341733e + "} [" + str + "]");
            C113886kg.m157515a((Closeable) this.f341734f);
            C114145rj c = C114157ro.this.m159374m(this.f341733e);
            if (c != null) {
                c.mo172780a(1);
            }
        }

        /* renamed from: a */
        public final void mo171885a(String str, byte[] bArr) {
            if (bArr != null) {
                try {
                    this.f341734f.write(bArr);
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo172374a(NetRequest.NetRequestBuilder netRequestBuilder) {
            super.mo172374a(netRequestBuilder);
            C113889km.m157545b(C0949kl.f2254x, "#onPreConnect gzip {" + this.f341733e + "}");
            netRequestBuilder.gzip();
        }

        /* renamed from: a */
        public final void mo172375a(NetResponse netResponse) {
            super.mo172375a(netResponse);
            this.f341735g = netResponse.contentEncoding;
        }

        /* renamed from: a */
        private void m159396a(Callback<byte[]> callback) {
            this.f341731c.mo172357a((C113933li) this);
            this.f341731c.mo172359a(this.f341729a, this);
            this.f341730b = callback;
        }
    }

    /* renamed from: b */
    public final void mo171974b(String str) {
        C113889km.m157545b(C0949kl.f2254x, "#removeLayer[" + str + "]");
        Map<String, C114145rj> map = this.f341709a;
        if (map != null) {
            map.remove(str);
        }
        mo171981g(str);
    }

    /* renamed from: c */
    public final void mo171976c(String str) {
        C113889km.m157545b(C0949kl.f2254x, "#clearCache[" + str + "]");
        if (str != null && !TextUtils.isEmpty(str)) {
            File k = m159372k(str);
            C113889km.m157545b(C0949kl.f2254x, "执行删除文件[" + k + "]");
            C113884kf.m157508f(k);
            mo171969a(str, 0, 0);
        }
    }

    /* renamed from: b */
    private boolean m159365b(JSONObject jSONObject) {
        C113889km.m157545b(C0949kl.f2254x, "#parseLayerInfoJson:".concat(String.valueOf(jSONObject)));
        C113666ee eeVar = (C113666ee) JsonUtils.parseToModel(jSONObject, C113666ee.class, new Object[0]);
        if (eeVar != null) {
            this.f341714f = eeVar.mo171994a();
            this.f341715g.clear();
            List<C113665ed> list = eeVar.f340091a;
            if (list != null && !list.isEmpty()) {
                this.f341715g.addAll(list);
            }
            C113889km.m157545b(C0949kl.f2254x, "解析LayerInfo数据成功");
            this.f341716h = eeVar;
            return true;
        }
        C113889km.m157553d(C0949kl.f2254x, "解析LayerInfo数据失败");
        return false;
    }

    /* renamed from: d */
    public final String mo171978d(String str) {
        return m159372k(m159375n(str)).getAbsolutePath();
    }

    /* renamed from: e */
    private void m159368e() {
        JSONObject json;
        C113889km.m157545b(C0949kl.f2254x, "#restoreLayerJsonToLocal");
        C113666ee eeVar = this.f341716h;
        if (eeVar != null && this.f341714f && (json = eeVar.toJson()) != null) {
            m159369h(json.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo171975b(java.lang.String r10, com.tencent.map.tools.Callback<byte[]> r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#requestNew["
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TDL"
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r2, (java.lang.String) r0)
            com.tencent.mapsdk.internal.ed r0 = r9.m159373l(r10)
            java.lang.String r3 = m159375n(r10)
            r4 = 1
            if (r0 == 0) goto L_0x0100
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rj> r5 = r9.f341709a
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r5.get(r3)
            if (r5 == 0) goto L_0x003b
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rj> r5 = r9.f341709a
            java.lang.Object r5 = r5.get(r3)
            com.tencent.mapsdk.internal.rj r5 = (com.tencent.mapsdk.internal.C114145rj) r5
            int r5 = r5.f341678a
            if (r5 <= 0) goto L_0x003b
            r7 = r3
            goto L_0x0079
        L_0x003b:
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicInteger> r5 = r9.f341710b
            java.lang.Object r5 = r5.get(r3)
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.get()
            r6 = 1
        L_0x0048:
            if (r6 >= r5) goto L_0x0078
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = "_"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rj> r8 = r9.f341709a
            if (r8 == 0) goto L_0x0075
            java.lang.Object r8 = r8.get(r7)
            if (r8 == 0) goto L_0x0075
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rj> r8 = r9.f341709a
            java.lang.Object r8 = r8.get(r7)
            com.tencent.mapsdk.internal.rj r8 = (com.tencent.mapsdk.internal.C114145rj) r8
            int r8 = r8.f341678a
            if (r8 <= 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            int r6 = r6 + 1
            goto L_0x0048
        L_0x0078:
            r7 = r10
        L_0x0079:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "图层id["
            r5.<init>(r6)
            r5.append(r10)
            java.lang.String r8 = "] 选举作为刷新数据的图层id["
            r5.append(r8)
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r2, (java.lang.String) r5)
            boolean r5 = r10.equals(r7)
            if (r5 != 0) goto L_0x00b4
            r9.mo171970a((java.lang.String) r10, (com.tencent.map.tools.Callback<byte[]>) r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r10)
            java.lang.String r10 = "] 读取本地图层缓存数据, 无需重复发送请求"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r2, (java.lang.String) r10)
            goto L_0x0101
        L_0x00b4:
            java.lang.String r0 = r0.mo171992a()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0100
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "&key="
            r5.<init>(r7)
            java.lang.String r7 = r9.f341713e
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = r0.concat(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r10)
            java.lang.String r10 = "] 请求数据的URL["
            r5.append(r10)
            r5.append(r0)
            r5.append(r1)
            java.lang.String r10 = r5.toString()
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r2, (java.lang.String) r10)
            com.tencent.mapsdk.internal.ro$a r10 = new com.tencent.mapsdk.internal.ro$a
            r10.<init>(r3, r0)
            com.tencent.mapsdk.internal.lj r0 = r10.f341731c
            r0.mo172357a((com.tencent.mapsdk.internal.C113933li) r10)
            com.tencent.mapsdk.internal.lj r0 = r10.f341731c
            java.lang.String r1 = r10.f341729a
            r0.mo172359a(r1, r10)
            r10.f341730b = r11
            goto L_0x0101
        L_0x0100:
            r4 = 0
        L_0x0101:
            if (r4 != 0) goto L_0x0107
            r10 = 0
            r11.callback(r10)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114157ro.mo171975b(java.lang.String, com.tencent.map.tools.Callback):void");
    }

    /* renamed from: a */
    public final VisualLayer mo171967a(VisualLayerOptions visualLayerOptions) {
        if (visualLayerOptions == null) {
            return null;
        }
        String layerId = visualLayerOptions.getLayerId();
        C113889km.m157545b(C0949kl.f2254x, "#createLayer layerId [" + layerId + "]");
        String n = m159375n(layerId);
        C113889km.m157545b(C0949kl.f2254x, "#createLayer baseLayerId [" + n + "]");
        C114145rj rjVar = this.f341709a.get(layerId);
        if (rjVar != null) {
            C113889km.m157545b(C0949kl.f2254x, "#createLayer layerId [" + layerId + "] already exists");
            rjVar.mo172781a(visualLayerOptions);
            return rjVar;
        }
        C114145rj rjVar2 = new C114145rj(visualLayerOptions);
        this.f341709a.put(visualLayerOptions.getLayerId(), rjVar2);
        if (this.f341710b.get(n) != null) {
            this.f341710b.get(n).incrementAndGet();
        } else {
            this.f341710b.put(n, new AtomicInteger(1));
        }
        rjVar2.mo172782a((C113645dy) this);
        return rjVar2;
    }

    /* renamed from: b */
    public final void mo171783b(C113565bo boVar) {
        JSONObject json;
        super.mo171783b(boVar);
        Map<String, C114145rj> map = this.f341709a;
        if (map != null) {
            for (VisualLayer next : map.values()) {
                if (!next.isRemoved()) {
                    next.remove();
                }
            }
            this.f341709a.clear();
        }
        C113889km.m157545b(C0949kl.f2254x, "#restoreLayerJsonToLocal");
        C113666ee eeVar = this.f341716h;
        if (!(eeVar == null || !this.f341714f || (json = eeVar.toJson()) == null)) {
            m159369h(json.toString());
        }
        C114156rn.m159360b();
        C113889km.m157545b(C0949kl.f2254x, "退出数据图层成功");
    }

    /* renamed from: a */
    public final int mo171966a(String str) {
        if (this.f341710b.get(str) != null) {
            C113889km.m157545b(C0949kl.f2254x, "#getRefCount [" + str + "], refCnt=[" + this.f341710b.get(str).get() + "]");
            return this.f341710b.get(str).get();
        }
        this.f341710b.put(str, new AtomicInteger(1));
        C113889km.m157545b(C0949kl.f2254x, "#getRefCount [" + str + "], refCnt=[" + this.f341710b.get(str).get() + "]");
        return this.f341710b.get(str).get();
    }

    /* renamed from: a */
    public final void mo171969a(String str, int i, int i2) {
        C113889km.m157545b(C0949kl.f2254x, "#updateLayerVersionInfo[" + str + "], dv=" + i + " sv=" + i2);
        C113665ed l = m159373l(str);
        if (l != null) {
            if (i2 != l.f340085d) {
                l.f340086e = null;
            }
            l.f340085d = i2;
            if (i != l.f340084c) {
                l.f340086e = null;
            }
            l.f340084c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo171973a() {
        return this.f341719k;
    }

    /* renamed from: a */
    public final void mo171972a(JSONObject jSONObject) {
        C113889km.m157545b(C0949kl.f2254x, "#saveLayerInfosToLocal[" + jSONObject + "]");
        this.f341719k = true;
        boolean z = false;
        if (jSONObject != null) {
            z = m159365b(jSONObject);
            if (z) {
                m159369h(jSONObject.toString());
                if (!this.f341718j.isEmpty()) {
                    C113889km.m157545b(C0949kl.f2254x, "初始化等待队列图层[" + this.f341718j.size() + "]");
                    for (String str : this.f341718j) {
                        C114145rj rjVar = this.f341709a.get(str);
                        if (rjVar != null) {
                            rjVar.mo172782a((C113645dy) this);
                        }
                    }
                    this.f341718j.clear();
                }
            }
        } else {
            this.f341714f = false;
            this.f341715g.clear();
            this.f341716h = null;
        }
        if (!z || !this.f341714f) {
            Util.foreach(this.f341709a.values(), new Callback<C114145rj>() {
                /* renamed from: a */
                private static void m159393a(C114145rj rjVar) {
                    if (rjVar != null) {
                        rjVar.mo172780a(2);
                        rjVar.mo172779a();
                    }
                }

                public final /* synthetic */ void callback(Object obj) {
                    C114145rj rjVar = (C114145rj) obj;
                    if (rjVar != null) {
                        rjVar.mo172780a(2);
                        rjVar.mo172779a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo171970a(final String str, final Callback<byte[]> callback) {
        C113889km.m157545b(C0949kl.f2254x, "#readLayerDataFromCache[" + str + "]");
        if (callback != null) {
            C113865kb.m157402b(new Runnable() {
                public final void run() {
                    callback.callback(C113884kf.m157503c(C114157ro.this.m159371j(str)));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo171971a(String str, byte[] bArr) {
        C113889km.m157545b(C0949kl.f2254x, "#saveLayerData[" + str + "]");
        File j = m159371j(str);
        File e = C113884kf.m157506e(j);
        C113884kf.m157491a(e, bArr);
        C113884kf.m157490a(e, j);
    }

    /* renamed from: a */
    public final void mo171968a(String str, int i) {
        C113889km.m157545b(C0949kl.f2254x, "#startTimeInterval[" + str + "], hash = " + str.hashCode() + " timeInterval = " + i);
        if (i > 0 && !TextUtils.isEmpty(str)) {
            this.f341717i.removeMessages(str.hashCode());
            Message.obtain(this.f341717i, str.hashCode(), i * 1000, 0, str).sendToTarget();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m159363a(C114157ro roVar, String str) {
        C113889km.m157545b(C0949kl.f2254x, "#refreshLayerData[" + str + "]");
        C114145rj rjVar = roVar.f341709a.get(str);
        if (rjVar != null) {
            rjVar.mo172785b((C113645dy) roVar);
        }
    }
}
