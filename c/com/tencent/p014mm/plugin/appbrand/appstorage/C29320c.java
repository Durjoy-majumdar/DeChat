package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.appstorage.C1520d;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import hr0.C87583a;
import hr0.C87584b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13604l;
import z04.C112550d0;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.c */
public final class C29320c implements C81414g0 {

    /* renamed from: i */
    public static final C29322b f80053i = new C29322b((C8480h) null);

    /* renamed from: j */
    public static final Map<String, C29320c> f80054j = new LinkedHashMap();

    /* renamed from: n */
    public static final Map<String, C29320c> f80055n = new LinkedHashMap();

    /* renamed from: d */
    public final long f80056d;

    /* renamed from: e */
    public final String f80057e;

    /* renamed from: f */
    public final C29339n f80058f;

    /* renamed from: g */
    public final C29339n f80059g;

    /* renamed from: h */
    public final byte[] f80060h;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.c$a */
    public static final class C29321a implements C29335j0 {

        /* renamed from: a */
        public final /* synthetic */ String f80061a;

        /* renamed from: b */
        public final /* synthetic */ C29320c f80062b;

        public C29321a(String str, C29320c cVar) {
            this.f80061a = str;
            this.f80062b = cVar;
        }

        /* renamed from: a */
        public C13604l<Boolean, String> mo56597a(String str, String str2, String str3) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "data");
            C87412m.m108594g(str3, "dataType");
            if (str2.length() > 0) {
                if (this.f80061a.length() > 0) {
                    try {
                        C29320c cVar = this.f80062b;
                        byte[] bArr = cVar.f80060h;
                        C87412m.m108593f(bArr, "encryptMMKVStorageSecretKeyByteArray");
                        byte[] decode = Base64.decode(str2, 0);
                        C87412m.m108593f(decode, "decode(data, Base64.DEFAULT)");
                        cVar.getClass();
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                        Cipher instance = Cipher.getInstance("AES");
                        instance.init(2, secretKeySpec);
                        byte[] doFinal = instance.doFinal(decode);
                        return doFinal == null ? new C13604l<>(Boolean.FALSE, "") : new C13604l<>(Boolean.TRUE, new String(doFinal, C119027c.f356488a));
                    } catch (Exception e) {
                        Log.m105924i("MicroMsg.AppBrandEncryptMMKVStorage", "[get] decrypt fail: " + e.getMessage());
                        ((C87583a) C89909e.m112439d(C87583a.class, true)).mo121689f(1817, 12, 1);
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        ((C87584b) C89909e.m112439d(C87584b.class, true)).mo121691h(24463, this.f80061a, 2, stringWriter.toString(), this.f80062b.f80057e, str, str2);
                        C1520d dVar = C1520d.f10881a;
                        long j = this.f80062b.f80056d;
                        String str4 = this.f80061a;
                        C87412m.m108594g(str4, "appId");
                        C1520d.f10884d.putBoolean((String) ((C1520d.C1522b) C1520d.f10882b).invoke(Long.valueOf(j), str4), true);
                        Log.m105924i("MicroMsg.AppBrandEncryptMMKVStorageDirtyDataFixer", "[markDirty] uin[" + j + "] appId[" + str4 + ']');
                        return new C13604l<>(Boolean.FALSE, "");
                    }
                }
            }
            return new C13604l<>(Boolean.TRUE, str2);
        }

        /* renamed from: b */
        public C13604l<Boolean, String> mo56598b(String str, String str2, String str3) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "data");
            C87412m.m108594g(str3, "dataType");
            String str4 = this.f80061a;
            if (!(str4 == null || str4.length() == 0)) {
                if (!(str2.length() == 0)) {
                    try {
                        Boolean bool = Boolean.TRUE;
                        C29320c cVar = this.f80062b;
                        byte[] bArr = cVar.f80060h;
                        C87412m.m108593f(bArr, "encryptMMKVStorageSecretKeyByteArray");
                        byte[] bytes = str2.getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        cVar.getClass();
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                        Cipher instance = Cipher.getInstance("AES");
                        instance.init(1, secretKeySpec);
                        String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 0);
                        C87412m.m108593f(encodeToString, "encodeToString(encrypt(e…Array()), Base64.DEFAULT)");
                        return new C13604l<>(bool, encodeToString);
                    } catch (Exception e) {
                        Log.m105924i("MicroMsg.AppBrandEncryptMMKVStorage", "[set] encrypt fail: " + e.getMessage());
                        ((C87583a) C89909e.m112439d(C87583a.class, true)).mo121689f(1817, 11, 1);
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        ((C87584b) C89909e.m112439d(C87584b.class, true)).mo121691h(24463, this.f80061a, 1, stringWriter.toString(), this.f80062b.f80057e, str, str2);
                        return new C13604l<>(Boolean.FALSE, "");
                    }
                }
            }
            return new C13604l<>(Boolean.TRUE, str2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.c$b */
    public static final class C29322b {
        public C29322b(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo56599a(long j, String str) {
            C87412m.m108594g(str, "appId");
            Map<String, C29320c> map = C29320c.f80054j;
            synchronized (map) {
                Iterator it = ((LinkedHashMap) map).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (C112550d0.m153803w((CharSequence) entry.getKey(), String.valueOf(j), false, 2, (Object) null) && C112550d0.m153803w((CharSequence) entry.getKey(), str, false, 2, (Object) null)) {
                        it.remove();
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            Map<String, C29320c> map2 = C29320c.f80055n;
            synchronized (map2) {
                Iterator it4 = ((LinkedHashMap) map2).entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    if (C112550d0.m153803w((CharSequence) entry2.getKey(), String.valueOf(j), false, 2, (Object) null) && C112550d0.m153803w((CharSequence) entry2.getKey(), str, false, 2, (Object) null)) {
                        it4.remove();
                    }
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }

        /* renamed from: b */
        public final C29320c mo56600b(long j, String str, String str2, C29339n nVar) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "encryptMMKVStorageSecretKey");
            String str3 = j + '-' + str;
            if (nVar != null) {
                Map<String, C29320c> map = C29320c.f80055n;
                synchronized (map) {
                    if (!((LinkedHashMap) map).keySet().contains(str3)) {
                        map.put(str3, new C29320c(j, str, str2, nVar));
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                Object obj = ((LinkedHashMap) map).get(str3);
                C87412m.m108591d(obj);
                return (C29320c) obj;
            }
            Map<String, C29320c> map2 = C29320c.f80054j;
            synchronized (map2) {
                if (!((LinkedHashMap) map2).keySet().contains(str3)) {
                    map2.put(str3, new C29320c(j, str, str2, (C29339n) null));
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
            Object obj2 = ((LinkedHashMap) map2).get(str3);
            C87412m.m108591d(obj2);
            return (C29320c) obj2;
        }
    }

    public C29320c(long j, String str, String str2, C29339n nVar) {
        this.f80056d = j;
        this.f80057e = str2;
        this.f80058f = nVar;
        C29339n nVar2 = new C29339n(j, "AppBrandEncryptMMKVStorage#" + str + '#');
        this.f80059g = nVar2;
        this.f80060h = Base64.decode(str2, 0);
        nVar2.f80097d = new C29321a(str, this);
    }

    /* renamed from: Bh */
    public Object[] mo56588Bh(int i, String str) {
        return this.f80059g.mo56588Bh(i, str);
    }

    /* renamed from: Bk */
    public int mo56589Bk(String str) {
        C87412m.m108594g(str, "appId");
        return this.f80059g.mo56589Bk(str);
    }

    /* renamed from: S */
    public void mo56590S(int i, String str) {
        C29339n nVar = this.f80058f;
        if (nVar != null) {
            nVar.mo56590S(i, str);
        }
        this.f80059g.mo56590S(i, str);
    }

    /* renamed from: T0 */
    public C81414g0.C29326a mo56591T0(int i, String str, List<C81414g0.C29327b> list) {
        C87412m.m108594g(list, "kvInfo");
        return this.f80059g.mo56591T0(i, str, list);
    }

    /* renamed from: a */
    public void mo56592a(String str) {
        this.f80059g.f80098e.count();
        this.f80059g.f80098e.clearAll();
        String[] allKeys = this.f80059g.f80098e.allKeys();
        int length = allKeys != null ? allKeys.length : 0;
        Log.m105924i("MicroMsg.AppBrandEncryptMMKVStorage", "storage after clearAll keySize = [" + length + ']');
        if (length > 0) {
            ((C87583a) C89909e.m112439d(C87583a.class, true)).mo121689f(1817, 13, 1);
        }
    }

    /* renamed from: cg */
    public C81414g0.C29326a mo56593cg(int i, String str, String str2) {
        C29339n nVar = this.f80058f;
        if (nVar != null) {
            nVar.mo56593cg(i, str, str2);
        }
        return this.f80059g.mo56593cg(i, str, str2);
    }

    /* renamed from: g5 */
    public List<Object[]> mo56594g5(int i, String str, List<String> list) {
        C87412m.m108594g(list, "keys");
        ArrayList arrayList = new ArrayList();
        for (String xf : list) {
            arrayList.add(mo56596xf(i, str, xf));
        }
        return arrayList;
    }

    /* renamed from: j0 */
    public C81414g0.C29326a mo56595j0(int i, String str, String str2, String str3, String str4) {
        C87412m.m108594g(str4, "dataType");
        int b = C81420m0.m99896b(str2, str3);
        C29339n nVar = this.f80058f;
        if (nVar != null) {
            nVar.mo56622f(i, str, str2, str3, str4, b);
        }
        return this.f80059g.mo56622f(i, str, str2, str3, str4, b);
    }

    /* renamed from: xf */
    public Object[] mo56596xf(int i, String str, String str2) {
        return this.f80059g.mo56596xf(i, str, str2);
    }
}
