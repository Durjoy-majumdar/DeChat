package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81437t;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.plugin.appbrand.utils.C84744h2;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import op3.C117882j;
import p225rc.C89912a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.o0 */
public final class C81423o0 {

    /* renamed from: a */
    public final String f238956a;

    /* renamed from: b */
    public final String f238957b;

    /* renamed from: c */
    public final String f238958c;

    /* renamed from: d */
    public C82381f f238959d;

    /* renamed from: e */
    public C83170k f238960e;

    /* renamed from: f */
    public C81437t.C81438a f238961f;

    /* renamed from: g */
    public final Collection<C81425b> f238962g;

    /* renamed from: h */
    public final Map<String, C86009m1> f238963h = new ConcurrentHashMap();

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.o0$a */
    public class C81424a extends C81433r0 {
        public String toString() {
            return "AppBrandLocalMediaObject::Nil";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.o0$b */
    public interface C81425b {
        /* renamed from: a */
        C117882j mo113742a(String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.o0$c */
    public final class C81426c implements C81425b {
        public C81426c(C81421n0 n0Var) {
        }

        /* renamed from: a */
        public C117882j mo113742a(String str, String str2) {
            long j;
            String str3;
            String str4;
            if (Util.isNullOrNil(str2)) {
                C81423o0.this.getClass();
                str2 = "unknown";
            }
            try {
                ByteBuffer a = C81423o0.this.mo113740a(str);
                if (a == null) {
                    j = -1;
                } else {
                    CheckedInputStream checkedInputStream = new CheckedInputStream(new C89912a(a), new Adler32());
                    while (checkedInputStream.read(new byte[2048]) >= 0) {
                    }
                    long value = checkedInputStream.getChecksum().getValue();
                    Util.qualityClose(checkedInputStream);
                    j = value;
                }
                String format = String.format(Locale.US, "%d|%s", new Object[]{Long.valueOf(j), str2});
                try {
                    Log.m105919d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "hy: attach media obj: %s", format);
                    C81423o0 o0Var = C81423o0.this;
                    String str5 = o0Var.f238957b;
                    o0Var.getClass();
                    str3 = Util.encodeHexString(new C84744h2().mo117466d(format.getBytes(), str5.getBytes()));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e, "attachMediaObject, enc exp = ", new Object[0]);
                    str3 = null;
                }
                if (Util.isNullOrNil(str3)) {
                    return null;
                }
                String str6 = "blob_" + str3;
                StringBuilder sb = new StringBuilder();
                C81423o0 o0Var2 = C81423o0.this;
                FilePathGenerator.checkMkdir(o0Var2.f238956a);
                try {
                    new C86009m1(o0Var2.f238956a, FilePathGenerator.NO_MEDIA_FILENAME).mo119964e();
                } catch (Exception unused) {
                }
                sb.append(o0Var2.f238956a);
                sb.append(str6);
                String sb4 = sb.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(C81423o0.this.f238958c);
                sb5.append(str6);
                if (Util.isNullOrNil(str2)) {
                    str4 = "";
                } else {
                    str4 = '.' + str2;
                }
                sb5.append(str4);
                String sb6 = sb5.toString();
                Log.m105919d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, return localId = %s, filePath = %s", sb6, sb4);
                return C117882j.m166285d(sb6, sb4, str2);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, get crc exp = %s", Util.stackTraceToString(e2));
                return null;
            }
        }

        public String toString() {
            return "V2MediaObjectInfoHandler";
        }
    }

    static {
        new C81424a();
    }

    public C81423o0(String str, String str2, String str3, C81437t.C81438a aVar) {
        this.f238956a = new C86009m1(str).mo119971i() + "/";
        this.f238957b = str2;
        this.f238958c = str3;
        this.f238961f = aVar;
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C81426c((C81421n0) null));
        this.f238962g = Collections.unmodifiableCollection(linkedList);
    }

    /* renamed from: a */
    public ByteBuffer mo113740a(String str) {
        if (this.f238960e == null) {
            if (this.f238959d == null) {
                C81437t.C81438a aVar = this.f238961f;
                if (aVar != null) {
                    this.f238959d = ((C82419d1.C82420a) aVar).f241504a.mo113047b0();
                }
                if (this.f238959d == null) {
                    Log.m105920e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "service is null");
                    return null;
                }
            }
            this.f238960e = (C83170k) this.f238959d.getJsRuntime().mo63321n0(C83170k.class);
        }
        C83170k kVar = this.f238960e;
        if (kVar != null && kVar.mo115394K0() != null) {
            return this.f238960e.mo115394K0().mo115387a(str);
        }
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f238960e != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105921e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "getBuffer failed, mBufferAddon == null?: [%b]", objArr);
        return null;
    }
}
