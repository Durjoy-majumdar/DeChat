package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tencent.mapsdk.internal.ge */
public final class C113749ge {

    /* renamed from: h */
    private static final String f340328h = "stData";

    /* renamed from: a */
    public int f340329a;

    /* renamed from: b */
    public List<C113792gv> f340330b;

    /* renamed from: c */
    public String f340331c;

    /* renamed from: d */
    public String f340332d;

    /* renamed from: e */
    public String f340333e;

    /* renamed from: f */
    public File f340334f;

    /* renamed from: g */
    public volatile boolean f340335g;

    /* renamed from: i */
    private String f340336i;

    /* renamed from: j */
    private File f340337j;

    /* renamed from: k */
    private boolean f340338k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C113758d f340339l;

    /* renamed from: com.tencent.mapsdk.internal.ge$a */
    public interface C113755a<T> {
        /* renamed from: a */
        void mo172128a(T t);
    }

    /* renamed from: com.tencent.mapsdk.internal.ge$b */
    public enum C113756b {
        START,
        PROCESSING,
        END,
        CANCEL
    }

    /* renamed from: com.tencent.mapsdk.internal.ge$c */
    public enum C113757c {
        CREATE,
        READ,
        UPLOAD,
        UPLOAD_END,
        WRITE,
        TRANSLATE_BYTE
    }

    /* renamed from: com.tencent.mapsdk.internal.ge$d */
    public interface C113758d {
        /* renamed from: a */
        void mo172130a();
    }

    /* renamed from: com.tencent.mapsdk.internal.ge$e */
    public static class C113759e {

        /* renamed from: a */
        public C113756b f340360a;

        /* renamed from: b */
        public C113759e f340361b;

        /* renamed from: c */
        public boolean f340362c;

        /* renamed from: d */
        public byte[] f340363d;

        /* renamed from: e */
        public Object f340364e;

        /* renamed from: f */
        private C113757c f340365f;

        /* renamed from: a */
        private C113759e m156955a() {
            return this;
        }

        /* renamed from: a */
        public static C113759e m156957a(C113757c cVar) {
            C113759e eVar = new C113759e();
            eVar.f340365f = cVar;
            return eVar;
        }

        /* renamed from: b */
        private C113757c m156963b() {
            return this.f340365f;
        }

        /* renamed from: c */
        private byte[] m156967c() {
            return this.f340363d;
        }

        /* renamed from: d */
        private boolean m156968d() {
            return this.f340362c;
        }

        /* renamed from: e */
        private Object m156969e() {
            return this.f340364e;
        }

        /* renamed from: f */
        private C113756b m156970f() {
            return this.f340360a;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("StatisticState{");
            stringBuffer.append("mState=");
            stringBuffer.append(this.f340365f);
            stringBuffer.append(", mStage=");
            stringBuffer.append(this.f340360a);
            stringBuffer.append(", mParentState=");
            stringBuffer.append(this.f340361b);
            stringBuffer.append(", mResult=");
            stringBuffer.append(this.f340362c);
            stringBuffer.append(", mData=");
            if (this.f340363d == null) {
                stringBuffer.append("null");
            } else {
                stringBuffer.append('[');
                int i = 0;
                while (i < this.f340363d.length) {
                    stringBuffer.append(i == 0 ? "" : ", ");
                    stringBuffer.append(this.f340363d[i]);
                    i++;
                }
                stringBuffer.append(']');
            }
            stringBuffer.append(", mTag=");
            stringBuffer.append(this.f340364e);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        /* renamed from: b */
        private boolean m156964b(C113757c cVar) {
            return cVar == this.f340365f;
        }

        /* renamed from: c */
        private boolean m156966c(C113757c cVar) {
            C113759e eVar = this.f340361b;
            if (eVar == null || cVar != eVar.f340365f) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private C113759e m156958a(C113759e eVar) {
            this.f340361b = eVar;
            return this;
        }

        /* renamed from: b */
        private boolean m156965b(C113757c cVar, C113756b bVar) {
            C113759e eVar = this.f340361b;
            if (eVar != null && bVar == eVar.f340360a && cVar == eVar.f340365f) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private C113759e m156956a(C113756b bVar) {
            this.f340360a = bVar;
            return this;
        }

        /* renamed from: a */
        private C113759e m156961a(byte[] bArr) {
            this.f340363d = bArr;
            return this;
        }

        /* renamed from: a */
        private C113759e m156960a(boolean z) {
            this.f340362c = z;
            return this;
        }

        /* renamed from: a */
        private C113759e m156959a(Object obj) {
            this.f340364e = obj;
            return this;
        }

        /* renamed from: a */
        private boolean m156962a(C113757c cVar, C113756b bVar) {
            return bVar == this.f340360a && cVar == this.f340365f;
        }
    }

    public C113749ge(C113565bo boVar) {
        this(boVar, (byte) 0);
    }

    private C113749ge(C113565bo boVar, byte b) {
        this.f340338k = true;
        this.f340330b = new ArrayList();
        this.f340331c = boVar.mo171810w().f339868a;
        this.f340332d = "";
        this.f340333e = "";
        TencentMapOptions tencentMapOptions = boVar.f339858a;
        if (tencentMapOptions != null) {
            this.f340332d = tencentMapOptions.getSubKey();
            this.f340333e = boVar.f339858a.getSubId();
        }
        String str = boVar.getContext().getFilesDir().getAbsolutePath() + File.separator + "stData_" + Util.getMD5String(this.f340331c);
        this.f340336i = str;
        C113884kf.m157492a(str);
        this.f340334f = new File(this.f340336i);
        this.f340337j = new File(this.f340336i + ".temp");
    }

    /* renamed from: c */
    private void m156940c() {
        if (this.f340329a == 0) {
            final C1137512 r0 = new C113755a<byte[]>() {
                /* renamed from: a */
                public final /* synthetic */ void mo172128a(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null && bArr.length > 0) {
                        C113749ge.this.mo172126a(bArr, (C113755a<Boolean>) new C113755a<Boolean>() {
                            /* renamed from: a */
                            public final /* synthetic */ void mo172128a(Object obj) {
                                C113749ge.m156931a(C113749ge.this, ((Boolean) obj).booleanValue());
                            }

                            /* renamed from: a */
                            private void m156949a(Boolean bool) {
                                C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                            }
                        });
                    }
                }

                /* renamed from: a */
                private void m156947a(byte[] bArr) {
                    if (bArr != null && bArr.length > 0) {
                        C113749ge.this.mo172126a(bArr, (C113755a<Boolean>) new C113755a<Boolean>() {
                            /* renamed from: a */
                            public final /* synthetic */ void mo172128a(Object obj) {
                                C113749ge.m156931a(C113749ge.this, ((Boolean) obj).booleanValue());
                            }

                            /* renamed from: a */
                            private void m156949a(Boolean bool) {
                                C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                            }
                        });
                    }
                }
            };
            mo172125a((Runnable) new Runnable() {
                public final void run() {
                    C113757c cVar = C113757c.READ;
                    C113759e a = C113759e.m156957a(cVar);
                    a.f340360a = C113756b.START;
                    File file = C113749ge.this.f340334f;
                    a.f340364e = file;
                    boolean exists = file.exists();
                    boolean z = false;
                    if (!exists) {
                        C113759e a2 = C113759e.m156957a(cVar);
                        a2.f340360a = C113756b.END;
                        a2.f340364e = C113749ge.this.f340334f;
                        a2.f340362c = false;
                        C113755a aVar = r0;
                        if (aVar != null) {
                            aVar.mo172128a(null);
                            return;
                        }
                        return;
                    }
                    C113759e a3 = C113759e.m156957a(cVar);
                    a3.f340360a = C113756b.PROCESSING;
                    File file2 = C113749ge.this.f340334f;
                    a3.f340364e = file2;
                    byte[] c = C113884kf.m157503c(file2);
                    C113759e a4 = C113759e.m156957a(cVar);
                    a4.f340360a = C113756b.END;
                    a4.f340364e = C113749ge.this.f340334f;
                    if (c != null) {
                        z = true;
                    }
                    a4.f340362c = z;
                    C113755a aVar2 = r0;
                    if (aVar2 != null) {
                        aVar2.mo172128a(c);
                    }
                }
            });
        }
        this.f340329a++;
    }

    /* renamed from: d */
    private static C113792gv m156941d() {
        return m156926a(System.currentTimeMillis());
    }

    /* renamed from: a */
    private String m156927a() {
        return this.f340336i;
    }

    /* renamed from: b */
    private void m156937b() {
        final C1137512 r0 = new C113755a<byte[]>() {
            /* renamed from: a */
            public final /* synthetic */ void mo172128a(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr != null && bArr.length > 0) {
                    C113749ge.this.mo172126a(bArr, (C113755a<Boolean>) new C113755a<Boolean>() {
                        /* renamed from: a */
                        public final /* synthetic */ void mo172128a(Object obj) {
                            C113749ge.m156931a(C113749ge.this, ((Boolean) obj).booleanValue());
                        }

                        /* renamed from: a */
                        private void m156949a(Boolean bool) {
                            C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                        }
                    });
                }
            }

            /* renamed from: a */
            private void m156947a(byte[] bArr) {
                if (bArr != null && bArr.length > 0) {
                    C113749ge.this.mo172126a(bArr, (C113755a<Boolean>) new C113755a<Boolean>() {
                        /* renamed from: a */
                        public final /* synthetic */ void mo172128a(Object obj) {
                            C113749ge.m156931a(C113749ge.this, ((Boolean) obj).booleanValue());
                        }

                        /* renamed from: a */
                        private void m156949a(Boolean bool) {
                            C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                        }
                    });
                }
            }
        };
        mo172125a((Runnable) new Runnable() {
            public final void run() {
                C113757c cVar = C113757c.READ;
                C113759e a = C113759e.m156957a(cVar);
                a.f340360a = C113756b.START;
                File file = C113749ge.this.f340334f;
                a.f340364e = file;
                boolean exists = file.exists();
                boolean z = false;
                if (!exists) {
                    C113759e a2 = C113759e.m156957a(cVar);
                    a2.f340360a = C113756b.END;
                    a2.f340364e = C113749ge.this.f340334f;
                    a2.f340362c = false;
                    C113755a aVar = r0;
                    if (aVar != null) {
                        aVar.mo172128a(null);
                        return;
                    }
                    return;
                }
                C113759e a3 = C113759e.m156957a(cVar);
                a3.f340360a = C113756b.PROCESSING;
                File file2 = C113749ge.this.f340334f;
                a3.f340364e = file2;
                byte[] c = C113884kf.m157503c(file2);
                C113759e a4 = C113759e.m156957a(cVar);
                a4.f340360a = C113756b.END;
                a4.f340364e = C113749ge.this.f340334f;
                if (c != null) {
                    z = true;
                }
                a4.f340362c = z;
                C113755a aVar2 = r0;
                if (aVar2 != null) {
                    aVar2.mo172128a(c);
                }
            }
        });
    }

    /* renamed from: a */
    private void m156930a(C113758d dVar) {
        this.f340339l = dVar;
    }

    /* renamed from: a */
    public final void mo172125a(Runnable runnable) {
        if (!this.f340335g) {
            if (this.f340338k) {
                new Thread(runnable).start();
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    private void m156929a(final C113755a<byte[]> aVar) {
        mo172125a((Runnable) new Runnable() {
            public final void run() {
                C113757c cVar = C113757c.READ;
                C113759e a = C113759e.m156957a(cVar);
                a.f340360a = C113756b.START;
                File file = C113749ge.this.f340334f;
                a.f340364e = file;
                boolean exists = file.exists();
                boolean z = false;
                if (!exists) {
                    C113759e a2 = C113759e.m156957a(cVar);
                    a2.f340360a = C113756b.END;
                    a2.f340364e = C113749ge.this.f340334f;
                    a2.f340362c = false;
                    C113755a aVar = r0;
                    if (aVar != null) {
                        aVar.mo172128a(null);
                        return;
                    }
                    return;
                }
                C113759e a3 = C113759e.m156957a(cVar);
                a3.f340360a = C113756b.PROCESSING;
                File file2 = C113749ge.this.f340334f;
                a3.f340364e = file2;
                byte[] c = C113884kf.m157503c(file2);
                C113759e a4 = C113759e.m156957a(cVar);
                a4.f340360a = C113756b.END;
                a4.f340364e = C113749ge.this.f340334f;
                if (c != null) {
                    z = true;
                }
                a4.f340362c = z;
                C113755a aVar2 = r0;
                if (aVar2 != null) {
                    aVar2.mo172128a(c);
                }
            }
        });
    }

    /* renamed from: a */
    private static List<C113792gv> m156928a(File file) {
        ArrayList arrayList = new ArrayList();
        List<String> d = C113884kf.m157505d(file);
        if (d != null && !d.isEmpty()) {
            for (String jSONArray : d) {
                List<C113792gv> list = null;
                try {
                    list = JsonUtils.parseToList(new JSONArray(jSONArray), C113792gv.class, new Object[0]);
                } catch (JSONException unused) {
                }
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static byte[] m156935a(List<C113792gv> list, C113759e eVar) {
        C113757c cVar = C113757c.TRANSLATE_BYTE;
        C113759e a = C113759e.m156957a(cVar);
        a.f340360a = C113756b.START;
        a.f340361b = eVar;
        byte[] bArr = null;
        boolean z = false;
        if (list == null || list.isEmpty()) {
            C113759e a2 = C113759e.m156957a(cVar);
            a2.f340360a = C113756b.END;
            a2.f340361b = eVar;
            a2.f340362c = false;
            return null;
        }
        C113759e a3 = C113759e.m156957a(cVar);
        a3.f340360a = C113756b.PROCESSING;
        a3.f340364e = list;
        a3.f340361b = eVar;
        String collectionToJson = JsonUtils.collectionToJson(new ArrayList(list));
        if (!TextUtils.isEmpty(collectionToJson)) {
            try {
                bArr = collectionToJson.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bArr = collectionToJson.getBytes();
            }
        }
        C113759e a4 = C113759e.m156957a(C113757c.TRANSLATE_BYTE);
        a4.f340360a = C113756b.END;
        a4.f340363d = bArr;
        a4.f340364e = collectionToJson;
        a4.f340361b = eVar;
        if (bArr != null) {
            z = true;
        }
        a4.f340362c = z;
        return bArr;
    }

    /* renamed from: a */
    public final void mo172126a(final byte[] bArr, final C113755a<Boolean> aVar) {
        mo172125a((Runnable) new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x00ae  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r18 = this;
                    r1 = r18
                    com.tencent.mapsdk.internal.ge$c r0 = com.tencent.mapsdk.internal.C113749ge.C113757c.UPLOAD
                    com.tencent.mapsdk.internal.ge$e r2 = com.tencent.mapsdk.internal.C113749ge.C113759e.m156957a((com.tencent.mapsdk.internal.C113749ge.C113757c) r0)
                    byte[] r3 = r2
                    r2.f340363d = r3
                    com.tencent.mapsdk.internal.ge$b r4 = com.tencent.mapsdk.internal.C113749ge.C113756b.START
                    r2.f340360a = r4
                    r2 = 0
                    if (r3 == 0) goto L_0x00ba
                    int r3 = r3.length
                    if (r3 != 0) goto L_0x0018
                    goto L_0x00ba
                L_0x0018:
                    com.tencent.mapsdk.internal.ge r3 = com.tencent.mapsdk.internal.C113749ge.this
                    r4 = 1
                    r3.f340335g = r4
                    com.tencent.mapsdk.internal.ge$e r0 = com.tencent.mapsdk.internal.C113749ge.C113759e.m156957a((com.tencent.mapsdk.internal.C113749ge.C113757c) r0)     // Catch:{ Exception -> 0x0083 }
                    com.tencent.mapsdk.internal.ge$b r3 = com.tencent.mapsdk.internal.C113749ge.C113756b.PROCESSING     // Catch:{ Exception -> 0x0083 }
                    r0.f340360a = r3     // Catch:{ Exception -> 0x0083 }
                    java.lang.Class<com.tencent.mapsdk.internal.dr> r0 = com.tencent.mapsdk.internal.C113635dr.class
                    com.tencent.mapsdk.internal.cj r0 = com.tencent.mapsdk.internal.C113601cl.m156511a(r0)     // Catch:{ Exception -> 0x0083 }
                    com.tencent.mapsdk.internal.dr r0 = (com.tencent.mapsdk.internal.C113635dr) r0     // Catch:{ Exception -> 0x0083 }
                    com.tencent.mapsdk.internal.cj$a r0 = r0.mo171932h()     // Catch:{ Exception -> 0x0083 }
                    r5 = r0
                    com.tencent.mapsdk.internal.dd r5 = (com.tencent.mapsdk.internal.C113618dd) r5     // Catch:{ Exception -> 0x0083 }
                    com.tencent.mapsdk.internal.ge r0 = com.tencent.mapsdk.internal.C113749ge.this     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r6 = r0.f340331c     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r7 = r0.f340332d     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r8 = com.tencent.mapsdk.internal.C113798hb.m157095l()     // Catch:{ Exception -> 0x0083 }
                    com.tencent.mapsdk.internal.ge r0 = com.tencent.mapsdk.internal.C113749ge.this     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r9 = r0.f340333e     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r10 = com.tencent.mapsdk.internal.C113798hb.m157091h()     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r11 = com.tencent.mapsdk.internal.C113798hb.m157085d()     // Catch:{ Exception -> 0x0083 }
                    int r12 = com.tencent.mapsdk.internal.C113798hb.m157093j()     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r13 = com.tencent.mapsdk.internal.C113798hb.m157094k()     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r14 = com.tencent.mapsdk.internal.C113798hb.m157096m()     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r15 = com.tencent.mapsdk.internal.C113798hb.m157083c()     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r16 = com.tencent.mapsdk.internal.C113798hb.m157090g()     // Catch:{ Exception -> 0x0083 }
                    byte[] r0 = r2     // Catch:{ Exception -> 0x0083 }
                    r17 = r0
                    com.tencent.map.tools.net.NetResponse r0 = r5.report(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0083 }
                    if (r0 == 0) goto L_0x0099
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r5 = "Post statistic data with response:"
                    r3.<init>(r5)     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0083 }
                    byte[] r6 = r0.data     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r0 = r0.charset     // Catch:{ Exception -> 0x0083 }
                    r5.<init>(r6, r0)     // Catch:{ Exception -> 0x0083 }
                    r3.append(r5)     // Catch:{ Exception -> 0x0083 }
                    java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0083 }
                    com.tencent.mapsdk.internal.C113889km.m157537a((java.lang.String) r0)     // Catch:{ Exception -> 0x0083 }
                    goto L_0x009a
                L_0x0083:
                    r0 = move-exception
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "err:"
                    r3.<init>(r4)
                    java.lang.String r0 = r0.getMessage()
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    com.tencent.mapsdk.internal.C113889km.m157549c(r0)
                L_0x0099:
                    r4 = 0
                L_0x009a:
                    com.tencent.mapsdk.internal.ge$c r0 = com.tencent.mapsdk.internal.C113749ge.C113757c.UPLOAD
                    com.tencent.mapsdk.internal.ge$e r0 = com.tencent.mapsdk.internal.C113749ge.C113759e.m156957a((com.tencent.mapsdk.internal.C113749ge.C113757c) r0)
                    byte[] r3 = r2
                    r0.f340363d = r3
                    com.tencent.mapsdk.internal.ge$b r3 = com.tencent.mapsdk.internal.C113749ge.C113756b.END
                    r0.f340360a = r3
                    r0.f340362c = r4
                    com.tencent.mapsdk.internal.ge$a r0 = r3
                    if (r0 == 0) goto L_0x00b5
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
                    r0.mo172128a(r3)
                L_0x00b5:
                    com.tencent.mapsdk.internal.ge r0 = com.tencent.mapsdk.internal.C113749ge.this
                    r0.f340335g = r2
                    return
                L_0x00ba:
                    com.tencent.mapsdk.internal.ge$a r3 = r3
                    if (r3 == 0) goto L_0x00c3
                    java.lang.Boolean r4 = java.lang.Boolean.FALSE
                    r3.mo172128a(r4)
                L_0x00c3:
                    com.tencent.mapsdk.internal.ge$e r0 = com.tencent.mapsdk.internal.C113749ge.C113759e.m156957a((com.tencent.mapsdk.internal.C113749ge.C113757c) r0)
                    r3 = 0
                    r0.f340363d = r3
                    r0.f340362c = r2
                    com.tencent.mapsdk.internal.ge$b r2 = com.tencent.mapsdk.internal.C113749ge.C113756b.END
                    r0.f340360a = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113749ge.C1137533.run():void");
            }
        });
    }

    /* renamed from: a */
    private void m156934a(boolean z) {
        C113757c cVar = C113757c.UPLOAD_END;
        C113759e a = C113759e.m156957a(cVar);
        C113756b bVar = C113756b.START;
        a.f340360a = bVar;
        byte[] c = C113884kf.m157503c(this.f340337j);
        C113759e a2 = C113759e.m156957a(cVar);
        a2.f340360a = C113756b.PROCESSING;
        a2.f340362c = z;
        a2.f340363d = c;
        a2.f340364e = this.f340337j;
        if (z) {
            C113884kf.m157500b(this.f340334f);
            if (c != null && c.length > 0) {
                C113884kf.m157490a(this.f340337j, this.f340334f);
            }
        } else if (c != null && c.length > 0) {
            ArrayList arrayList = new ArrayList();
            List<C113792gv> a3 = m156928a(this.f340334f);
            List<C113792gv> a4 = m156928a(this.f340337j);
            arrayList.addAll(a3);
            arrayList.addAll(a4);
            C113884kf.m157500b(this.f340334f);
            C113884kf.m157500b(this.f340337j);
            byte[] a5 = m156935a((List<C113792gv>) arrayList, a2);
            C113757c cVar2 = C113757c.WRITE;
            C113759e a6 = C113759e.m156957a(cVar2);
            a6.f340360a = bVar;
            a6.f340361b = a2;
            a6.f340363d = a5;
            File file = this.f340334f;
            a6.f340364e = file;
            boolean a7 = C113884kf.m157491a(file, a5);
            C113759e a8 = C113759e.m156957a(cVar2);
            a8.f340360a = C113756b.END;
            a8.f340361b = a2;
            a8.f340362c = a7;
        }
        C113759e.m156957a(cVar).f340360a = C113756b.END;
    }

    /* renamed from: a */
    private void m156933a(C113792gv gvVar) {
        this.f340329a--;
        if (gvVar != null) {
            synchronized (this) {
                this.f340330b.add(gvVar);
            }
        }
        if (this.f340329a == 0 && !this.f340330b.isEmpty()) {
            mo172126a(m156935a(this.f340330b, (C113759e) null), (C113755a<Boolean>) new C113755a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo172128a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                    if (bool.booleanValue()) {
                        C113749ge.this.f340330b.clear();
                    }
                }

                /* renamed from: a */
                private void m156951a(Boolean bool) {
                    C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                    if (bool.booleanValue()) {
                        C113749ge.this.f340330b.clear();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static C113792gv m156926a(long j) {
        C113759e.m156957a(C113757c.CREATE).f340364e = Long.valueOf(j);
        return new C113792gv(j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m156931a(C113749ge geVar, boolean z) {
        C113757c cVar = C113757c.UPLOAD_END;
        C113759e a = C113759e.m156957a(cVar);
        C113756b bVar = C113756b.START;
        a.f340360a = bVar;
        byte[] c = C113884kf.m157503c(geVar.f340337j);
        C113759e a2 = C113759e.m156957a(cVar);
        a2.f340360a = C113756b.PROCESSING;
        a2.f340362c = z;
        a2.f340363d = c;
        a2.f340364e = geVar.f340337j;
        if (z) {
            C113884kf.m157500b(geVar.f340334f);
            if (c != null && c.length > 0) {
                C113884kf.m157490a(geVar.f340337j, geVar.f340334f);
            }
        } else if (c != null && c.length > 0) {
            ArrayList arrayList = new ArrayList();
            List<C113792gv> a3 = m156928a(geVar.f340334f);
            List<C113792gv> a4 = m156928a(geVar.f340337j);
            arrayList.addAll(a3);
            arrayList.addAll(a4);
            C113884kf.m157500b(geVar.f340334f);
            C113884kf.m157500b(geVar.f340337j);
            byte[] a5 = m156935a((List<C113792gv>) arrayList, a2);
            C113757c cVar2 = C113757c.WRITE;
            C113759e a6 = C113759e.m156957a(cVar2);
            a6.f340360a = bVar;
            a6.f340361b = a2;
            a6.f340363d = a5;
            File file = geVar.f340334f;
            a6.f340364e = file;
            boolean a7 = C113884kf.m157491a(file, a5);
            C113759e a8 = C113759e.m156957a(cVar2);
            a8.f340360a = C113756b.END;
            a8.f340361b = a2;
            a8.f340362c = a7;
        }
        C113759e.m156957a(cVar).f340360a = C113756b.END;
    }
}
