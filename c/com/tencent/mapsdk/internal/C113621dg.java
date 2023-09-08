package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;
import com.tencent.mapsdk.internal.C113598cj.C113599a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.dg */
public abstract class C113621dg<R extends C113598cj.C113599a> implements C113598cj<R> {

    /* renamed from: a */
    public boolean f340002a = false;

    /* renamed from: b */
    public boolean f340003b = true;

    /* renamed from: c */
    public boolean f340004c = true;

    /* renamed from: d */
    private volatile R f340005d;

    /* renamed from: e */
    private Map<String, String> f340006e;

    /* renamed from: com.tencent.mapsdk.internal.dg$1 */
    public static /* synthetic */ class C1136221 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f340007a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.map.tools.net.NetMethod[] r0 = com.tencent.map.tools.net.NetMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f340007a = r0
                com.tencent.map.tools.net.NetMethod r1 = com.tencent.map.tools.net.NetMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f340007a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.map.tools.net.NetMethod r1 = com.tencent.map.tools.net.NetMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113621dg.C1136221.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.dg$a */
    public static class C113623a {

        /* renamed from: a */
        public String f340008a;

        /* renamed from: b */
        public String f340009b;

        /* renamed from: c */
        public String f340010c;

        /* renamed from: d */
        public String f340011d;

        /* renamed from: e */
        public String[] f340012e;

        /* renamed from: f */
        public HashMap<String, String> f340013f;

        /* renamed from: g */
        public String f340014g;

        /* renamed from: h */
        public String f340015h;

        /* renamed from: i */
        public int f340016i;

        /* renamed from: j */
        public boolean f340017j;

        /* renamed from: k */
        public NetMethod f340018k;

        /* renamed from: l */
        public C113644dx f340019l;

        /* renamed from: m */
        public int[] f340020m;

        private C113623a() {
        }

        public /* synthetic */ C113623a(byte b) {
            this();
        }

        public final String toString() {
            return "RequestEntity{service='" + this.f340008a + '\'' + ", request='" + this.f340009b + '\'' + ", method=" + this.f340018k + ", heads=" + this.f340013f + ", authority=" + this.f340011d + ", queryKeys=" + Arrays.toString(this.f340012e) + ", constQuery='" + this.f340014g + '\'' + ", useAgent='" + this.f340015h + '\'' + ", resolver='" + this.f340019l + '\'' + ", retry=" + this.f340016i + ", useExtraQuery=" + this.f340017j + "\nurl='" + this.f340010c + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.dg$b */
    public class C113624b implements InvocationHandler {

        /* renamed from: b */
        private Class<? extends C113621dg> f340022b;

        public C113624b(Class<? extends C113621dg> cls) {
            this.f340022b = cls;
        }

        /* renamed from: a */
        private C113623a m156570a(Method method) {
            String str;
            C113623a aVar = new C113623a((byte) 0);
            NetJceResolver netJceResolver = (NetJceResolver) method.getAnnotation(NetJceResolver.class);
            NetFileResolver netFileResolver = (NetFileResolver) method.getAnnotation(NetFileResolver.class);
            NetJsonResolver netJsonResolver = (NetJsonResolver) method.getAnnotation(NetJsonResolver.class);
            NetRequest netRequest = (NetRequest) method.getAnnotation(NetRequest.class);
            if (netJceResolver != null) {
                aVar.f340019l = new C113640dv(netJceResolver.inJce(), netJceResolver.outJce());
                aVar.f340020m = netJceResolver.queryRange();
            } else if (netFileResolver != null) {
                aVar.f340019l = new C113638du(netFileResolver.outFile());
                aVar.f340020m = netFileResolver.queryRange();
            } else if (netJsonResolver != null) {
                aVar.f340019l = new C113642dw(netJsonResolver.outModel());
                aVar.f340020m = netJsonResolver.queryRange();
            }
            if (netRequest != null) {
                aVar.f340008a = this.f340022b.getSimpleName();
                aVar.f340018k = netRequest.method();
                aVar.f340009b = method.getName();
                aVar.f340011d = netRequest.authority();
                aVar.f340015h = netRequest.userAgent();
                aVar.f340012e = netRequest.queryKeys();
                aVar.f340016i = netRequest.retry();
                aVar.f340017j = netRequest.useExtraQuery();
                NetHead head = netRequest.head();
                String[] keys = head.keys();
                String[] values = head.values();
                if (keys.length > 0 && keys.length == values.length) {
                    aVar.f340013f = new HashMap<>();
                    for (int i = 0; i < keys.length; i++) {
                        aVar.f340013f.put(keys[i], values[i]);
                    }
                }
                StringBuilder sb = new StringBuilder();
                C113621dg dgVar = C113621dg.this;
                String str2 = aVar.f340011d;
                StringBuilder sb4 = new StringBuilder();
                if (C40002he.m42805a(str2)) {
                    str2 = dgVar.mo171959i();
                }
                if (!TextUtils.isEmpty(str2)) {
                    String j = dgVar.mo171960j();
                    if (!TextUtils.isEmpty(j)) {
                        sb4.append(j);
                        sb4.append("://");
                    }
                    sb4.append(str2);
                    str = sb4.toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                String path = netRequest.path();
                if (path.length() != 0) {
                    sb.append("/");
                    sb.append(path);
                }
                aVar.f340014g = netRequest.constQuery();
                aVar.f340010c = sb.toString();
            }
            return aVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            C113623a aVar = new C113623a((byte) 0);
            NetJceResolver netJceResolver = (NetJceResolver) method.getAnnotation(NetJceResolver.class);
            NetFileResolver netFileResolver = (NetFileResolver) method.getAnnotation(NetFileResolver.class);
            NetJsonResolver netJsonResolver = (NetJsonResolver) method.getAnnotation(NetJsonResolver.class);
            NetRequest netRequest = (NetRequest) method.getAnnotation(NetRequest.class);
            if (netJceResolver != null) {
                aVar.f340019l = new C113640dv(netJceResolver.inJce(), netJceResolver.outJce());
                aVar.f340020m = netJceResolver.queryRange();
            } else if (netFileResolver != null) {
                aVar.f340019l = new C113638du(netFileResolver.outFile());
                aVar.f340020m = netFileResolver.queryRange();
            } else if (netJsonResolver != null) {
                aVar.f340019l = new C113642dw(netJsonResolver.outModel());
                aVar.f340020m = netJsonResolver.queryRange();
            }
            if (netRequest != null) {
                aVar.f340008a = this.f340022b.getSimpleName();
                aVar.f340018k = netRequest.method();
                aVar.f340009b = method.getName();
                aVar.f340011d = netRequest.authority();
                aVar.f340015h = netRequest.userAgent();
                aVar.f340012e = netRequest.queryKeys();
                aVar.f340016i = netRequest.retry();
                aVar.f340017j = netRequest.useExtraQuery();
                NetHead head = netRequest.head();
                String[] keys = head.keys();
                String[] values = head.values();
                if (keys.length > 0 && keys.length == values.length) {
                    aVar.f340013f = new HashMap<>();
                    for (int i = 0; i < keys.length; i++) {
                        aVar.f340013f.put(keys[i], values[i]);
                    }
                }
                StringBuilder sb = new StringBuilder();
                C113621dg dgVar = C113621dg.this;
                String str2 = aVar.f340011d;
                StringBuilder sb4 = new StringBuilder();
                if (C40002he.m42805a(str2)) {
                    str2 = dgVar.mo171959i();
                }
                if (!TextUtils.isEmpty(str2)) {
                    String j = dgVar.mo171960j();
                    if (!TextUtils.isEmpty(j)) {
                        sb4.append(j);
                        sb4.append("://");
                    }
                    sb4.append(str2);
                    str = sb4.toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                String path = netRequest.path();
                if (path.length() != 0) {
                    sb.append("/");
                    sb.append(path);
                }
                aVar.f340014g = netRequest.constQuery();
                aVar.f340010c = sb.toString();
            }
            C113621dg dgVar2 = C113621dg.this;
            if (!dgVar2.f340004c) {
                C113889km.m157553d(C0949kl.f2237g, "The Service[" + this.f340022b.getSimpleName() + "] is block!!  Please check the ServiceProtocol for corrected, or contact the Tencent MapSdk Office to enable it. ");
                if (aVar.f340018k == NetMethod.URL) {
                    return "";
                }
                return null;
            } else if (aVar.f340018k == NetMethod.URL) {
                String str3 = aVar.f340010c;
                String a = dgVar2.m156554b(aVar, objArr);
                if (a.length() != 0) {
                    str3 = str3 + "?" + a;
                }
                aVar.f340010c = str3;
                C113889km.m157550c(C0949kl.f2237g, aVar.toString());
                return str3;
            } else {
                C113644dx dxVar = aVar.f340019l;
                if (dxVar == null) {
                    return dgVar2.mo171958a(aVar, objArr);
                }
                return aVar.f340019l.mo171963a(C113621dg.this.mo171958a(aVar, dxVar.mo171964a(aVar.f340020m, objArr)));
            }
        }
    }

    /* renamed from: k */
    private String m156555k() {
        StringBuilder sb = new StringBuilder();
        String i = mo171959i();
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        String j = mo171960j();
        if (!TextUtils.isEmpty(j)) {
            sb.append(j);
            sb.append("://");
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: l */
    private R m156556l() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            if (actualTypeArguments.length > 0) {
                Type type = actualTypeArguments[0];
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    ClassLoader classLoader = cls.getClassLoader();
                    Class[] clsArr = new Class[1];
                    if (cls.isInterface()) {
                        clsArr[0] = cls;
                    } else {
                        clsArr = cls.getInterfaces();
                    }
                    return (C113598cj.C113599a) Proxy.newProxyInstance(classLoader, clsArr, new C113624b(getClass()));
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo171927c() {
        return this.f340002a;
    }

    /* renamed from: d */
    public final boolean mo171928d() {
        return this.f340004c;
    }

    /* renamed from: f */
    public String mo171930f() {
        return null;
    }

    /* renamed from: g */
    public final String mo171931g() {
        return null;
    }

    /* renamed from: h */
    public final R mo171932h() {
        if (this.f340005d != null) {
            return this.f340005d;
        }
        this.f340005d = m156556l();
        return this.f340005d;
    }

    /* renamed from: i */
    public final String mo171959i() {
        return this.f340002a ? mo171930f() : mo171929e();
    }

    /* renamed from: j */
    public final String mo171960j() {
        return this.f340003b ? C113600ck.f339986i : "http";
    }

    /* renamed from: a */
    public final void mo171925a(Map<String, String> map) {
        Map<String, String> map2 = this.f340006e;
        if (map2 != null) {
            map2.putAll(map);
        } else {
            this.f340006e = map;
        }
    }

    /* renamed from: b */
    public final boolean mo171926b() {
        return this.f340003b;
    }

    /* renamed from: c */
    public final void mo171923c(boolean z) {
        this.f340003b = z;
    }

    /* renamed from: b */
    public final void mo171922b(boolean z) {
        this.f340002a = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m156554b(C113623a aVar, Object... objArr) {
        Map<String, String> map;
        String[] strArr = aVar.f340012e;
        StringBuilder sb = new StringBuilder();
        if (!(strArr == null || objArr == null || strArr.length > objArr.length)) {
            for (String append : strArr) {
                sb.append(append);
                sb.append("=%s&");
            }
        }
        String str = aVar.f340014g;
        if (!TextUtils.isEmpty(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                if (split2.length == 2) {
                    sb.append(split2[0]);
                    sb.append("=");
                    sb.append(split2[1]);
                    sb.append("&");
                }
            }
        }
        if (aVar.f340017j && (map = this.f340006e) != null && !map.isEmpty()) {
            for (Map.Entry next : this.f340006e.entrySet()) {
                sb.append((String) next.getKey());
                sb.append("=");
                sb.append((String) next.getValue());
                sb.append("&");
            }
        }
        int lastIndexOf = sb.lastIndexOf("&");
        if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(lastIndexOf);
        }
        return String.format(sb.toString(), objArr);
    }

    /* renamed from: a */
    public final void mo171921a(boolean z) {
        this.f340004c = z;
    }

    /* renamed from: a */
    private String m156552a(String str) {
        StringBuilder sb = new StringBuilder();
        if (C40002he.m42805a(str)) {
            str = mo171959i();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String j = mo171960j();
        if (!TextUtils.isEmpty(j)) {
            sb.append(j);
            sb.append("://");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final NetResponse mo171958a(C113623a aVar, Object... objArr) {
        if (aVar == null) {
            return null;
        }
        String str = aVar.f340010c;
        try {
            String b = m156554b(aVar, objArr);
            if (!TextUtils.isEmpty(b)) {
                str = str + "?" + b;
            }
            aVar.f340010c = str;
            C113889km.m157550c(C0949kl.f2237g, aVar.toString());
            int i = C1136221.f340007a[aVar.f340018k.ordinal()];
            if (i == 1) {
                return NetManager.getInstance().builder().forceHttps(false).userAgent(aVar.f340015h).url(str).retryNum(aVar.f340016i).header(aVar.f340013f).doGet();
            }
            if (i != 2) {
                return null;
            }
            byte[] bArr = new byte[0];
            if (objArr.length > 0) {
                int length = objArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    byte[] bArr2 = objArr[i2];
                    if (bArr2 instanceof byte[]) {
                        bArr = bArr2;
                        break;
                    }
                    i2++;
                }
            }
            return NetManager.getInstance().builder().userAgent(aVar.f340015h).forceHttps(false).url(str).retryNum(aVar.f340016i).header(aVar.f340013f).postData(bArr).doPost();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ String m156551a(C113621dg dgVar, String str) {
        StringBuilder sb = new StringBuilder();
        if (C40002he.m42805a(str)) {
            str = dgVar.mo171959i();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String j = dgVar.mo171960j();
        if (!TextUtils.isEmpty(j)) {
            sb.append(j);
            sb.append("://");
        }
        sb.append(str);
        return sb.toString();
    }
}
