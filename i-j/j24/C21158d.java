package j24;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import e24.C20509c;
import gy3.C87412m;
import j24.C21189s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o24.C21760d0;
import o24.C21766h;
import o24.C21768j;
import o24.C21769k;
import o24.C21777r;
import o24.C21783x;

/* renamed from: j24.d */
public final class C21158d {

    /* renamed from: a */
    public static final C21157c[] f59819a;

    /* renamed from: b */
    public static final Map<C21769k, Integer> f59820b;

    /* renamed from: j24.d$a */
    public static final class C21159a {

        /* renamed from: a */
        public final List<C21157c> f59821a = new ArrayList();

        /* renamed from: b */
        public final C21768j f59822b;

        /* renamed from: c */
        public final int f59823c;

        /* renamed from: d */
        public int f59824d;

        /* renamed from: e */
        public C21157c[] f59825e = new C21157c[8];

        /* renamed from: f */
        public int f59826f = 7;

        /* renamed from: g */
        public int f59827g = 0;

        /* renamed from: h */
        public int f59828h = 0;

        public C21159a(int i, C21760d0 d0Var) {
            this.f59823c = i;
            this.f59824d = i;
            this.f59822b = C21777r.m24935b(d0Var);
        }

        /* renamed from: a */
        public final int mo33113a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f59825e.length;
                while (true) {
                    length--;
                    i2 = this.f59826f;
                    if (length < i2 || i <= 0) {
                        C21157c[] cVarArr = this.f59825e;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f59827g);
                        this.f59826f += i3;
                    } else {
                        int i4 = this.f59825e[length].f59818c;
                        i -= i4;
                        this.f59828h -= i4;
                        this.f59827g--;
                        i3++;
                    }
                }
                C21157c[] cVarArr2 = this.f59825e;
                System.arraycopy(cVarArr2, i2 + 1, cVarArr2, i2 + 1 + i3, this.f59827g);
                this.f59826f += i3;
            }
            return i3;
        }

        /* renamed from: b */
        public final C21769k mo33114b(int i) {
            if (i >= 0 && i <= C21158d.f59819a.length - 1) {
                return C21158d.f59819a[i].f59816a;
            }
            int length = this.f59826f + 1 + (i - C21158d.f59819a.length);
            if (length >= 0) {
                C21157c[] cVarArr = this.f59825e;
                if (length < cVarArr.length) {
                    return cVarArr[length].f59816a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: c */
        public final void mo33115c(int i, C21157c cVar) {
            ((ArrayList) this.f59821a).add(cVar);
            int i2 = cVar.f59818c;
            if (i != -1) {
                i2 -= this.f59825e[(this.f59826f + 1) + i].f59818c;
            }
            int i3 = this.f59824d;
            if (i2 > i3) {
                Arrays.fill(this.f59825e, (Object) null);
                this.f59826f = this.f59825e.length - 1;
                this.f59827g = 0;
                this.f59828h = 0;
                return;
            }
            int a = mo33113a((this.f59828h + i2) - i3);
            if (i == -1) {
                int i4 = this.f59827g + 1;
                C21157c[] cVarArr = this.f59825e;
                if (i4 > cVarArr.length) {
                    C21157c[] cVarArr2 = new C21157c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f59826f = this.f59825e.length - 1;
                    this.f59825e = cVarArr2;
                }
                int i5 = this.f59826f;
                this.f59826f = i5 - 1;
                this.f59825e[i5] = cVar;
                this.f59827g++;
            } else {
                this.f59825e[i + this.f59826f + 1 + i + a] = cVar;
            }
            this.f59828h += i2;
        }

        /* renamed from: d */
        public C21769k mo33116d() {
            byte readByte = ((C21783x) this.f59822b).readByte() & ExifInterface.MARKER;
            boolean z = (readByte & 128) == 128;
            int e = mo33117e(readByte, 127);
            if (z) {
                C21189s sVar = C21189s.f59956d;
                long j = (long) e;
                C21783x xVar = (C21783x) this.f59822b;
                xVar.mo34121G0(j);
                byte[] g = xVar.f61728d.mo34136g(j);
                sVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C21189s.C21190a aVar = sVar.f59957a;
                byte b = 0;
                int i = 0;
                for (byte b2 : g) {
                    b = (b << 8) | (b2 & ExifInterface.MARKER);
                    i += 8;
                    while (i >= 8) {
                        int i2 = i - 8;
                        aVar = aVar.f59958a[(b >>> i2) & 255];
                        if (aVar.f59958a == null) {
                            byteArrayOutputStream.write(aVar.f59959b);
                            i -= aVar.f59960c;
                            aVar = sVar.f59957a;
                        } else {
                            i = i2;
                        }
                    }
                }
                while (i > 0) {
                    C21189s.C21190a aVar2 = aVar.f59958a[(b << (8 - i)) & 255];
                    if (aVar2.f59958a != null || aVar2.f59960c > i) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.f59959b);
                    i -= aVar2.f59960c;
                    aVar = sVar.f59957a;
                }
                return C21769k.m24902j(byteArrayOutputStream.toByteArray());
            }
            return ((C21783x) this.f59822b).mo34120G((long) e);
        }

        /* renamed from: e */
        public int mo33117e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = ((C21783x) this.f59822b).readByte() & ExifInterface.MARKER;
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: j24.d$b */
    public static final class C21160b {

        /* renamed from: a */
        public final C21766h f59829a;

        /* renamed from: b */
        public int f59830b = Integer.MAX_VALUE;

        /* renamed from: c */
        public boolean f59831c;

        /* renamed from: d */
        public int f59832d = 4096;

        /* renamed from: e */
        public C21157c[] f59833e = new C21157c[8];

        /* renamed from: f */
        public int f59834f = 7;

        /* renamed from: g */
        public int f59835g = 0;

        /* renamed from: h */
        public int f59836h = 0;

        public C21160b(C21766h hVar) {
            this.f59829a = hVar;
        }

        /* renamed from: a */
        public final int mo33118a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f59833e.length;
                while (true) {
                    length--;
                    i2 = this.f59834f;
                    if (length < i2 || i <= 0) {
                        C21157c[] cVarArr = this.f59833e;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f59835g);
                        C21157c[] cVarArr2 = this.f59833e;
                        int i4 = this.f59834f;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f59834f += i3;
                    } else {
                        int i5 = this.f59833e[length].f59818c;
                        i -= i5;
                        this.f59836h -= i5;
                        this.f59835g--;
                        i3++;
                    }
                }
                C21157c[] cVarArr3 = this.f59833e;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + i3, this.f59835g);
                C21157c[] cVarArr22 = this.f59833e;
                int i44 = this.f59834f;
                Arrays.fill(cVarArr22, i44 + 1, i44 + 1 + i3, (Object) null);
                this.f59834f += i3;
            }
            return i3;
        }

        /* renamed from: b */
        public final void mo33119b(C21157c cVar) {
            int i = cVar.f59818c;
            int i2 = this.f59832d;
            if (i > i2) {
                Arrays.fill(this.f59833e, (Object) null);
                this.f59834f = this.f59833e.length - 1;
                this.f59835g = 0;
                this.f59836h = 0;
                return;
            }
            mo33118a((this.f59836h + i) - i2);
            int i3 = this.f59835g + 1;
            C21157c[] cVarArr = this.f59833e;
            if (i3 > cVarArr.length) {
                C21157c[] cVarArr2 = new C21157c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f59834f = this.f59833e.length - 1;
                this.f59833e = cVarArr2;
            }
            int i4 = this.f59834f;
            this.f59834f = i4 - 1;
            this.f59833e[i4] = cVar;
            this.f59835g++;
            this.f59836h += i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33120c(o24.C21769k r12) {
            /*
                r11 = this;
                j24.s r0 = j24.C21189s.f59956d
                r0.getClass()
                r0 = 0
                r1 = 0
                r4 = r1
                r3 = 0
            L_0x000a:
                int r6 = r12.mo34085f()
                r7 = 255(0xff, float:3.57E-43)
                if (r3 >= r6) goto L_0x0020
                byte r6 = r12.mo34089i(r3)
                r6 = r6 & r7
                byte[] r7 = j24.C21189s.f59955c
                byte r6 = r7[r6]
                long r6 = (long) r6
                long r4 = r4 + r6
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r8 = 7
                long r4 = r4 + r8
                r3 = 3
                long r3 = r4 >> r3
                int r4 = (int) r3
                int r3 = r12.mo34085f()
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r3) goto L_0x008b
                o24.h r3 = new o24.h
                r3.<init>()
                j24.s r4 = j24.C21189s.f59956d
                r4.getClass()
                r4 = 0
                r6 = 0
            L_0x003b:
                int r8 = r12.mo34085f()
                if (r4 >= r8) goto L_0x0062
                byte r8 = r12.mo34089i(r4)
                r8 = r8 & r7
                int[] r9 = j24.C21189s.f59954b
                r9 = r9[r8]
                byte[] r10 = j24.C21189s.f59955c
                byte r8 = r10[r8]
                long r1 = r1 << r8
                long r9 = (long) r9
                long r1 = r1 | r9
                int r6 = r6 + r8
            L_0x0052:
                r8 = 8
                if (r6 < r8) goto L_0x005f
                int r6 = r6 + -8
                long r8 = r1 >> r6
                int r9 = (int) r8
                r3.mo34148q(r9)
                goto L_0x0052
            L_0x005f:
                int r4 = r4 + 1
                goto L_0x003b
            L_0x0062:
                if (r6 <= 0) goto L_0x006f
                int r12 = 8 - r6
                long r1 = r1 << r12
                int r12 = r7 >>> r6
                long r6 = (long) r12
                long r1 = r1 | r6
                int r12 = (int) r1
                r3.mo34148q(r12)
            L_0x006f:
                long r1 = r3.f61695e
                o24.k r12 = r3.mo34120G(r1)
                int r1 = r12.mo34085f()
                r2 = 128(0x80, float:1.794E-43)
                r11.mo33122e(r1, r5, r2)
                o24.h r1 = r11.f59829a
                r1.getClass()
                int r2 = r12.mo34085f()
                r12.mo34093o(r1, r0, r2)
                goto L_0x009e
            L_0x008b:
                int r1 = r12.mo34085f()
                r11.mo33122e(r1, r5, r0)
                o24.h r1 = r11.f59829a
                r1.getClass()
                int r2 = r12.mo34085f()
                r12.mo34093o(r1, r0, r2)
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j24.C21158d.C21160b.mo33120c(o24.k):void");
        }

        /* renamed from: d */
        public void mo33121d(List<C21157c> list) {
            int i;
            int i2;
            if (this.f59831c) {
                int i3 = this.f59830b;
                if (i3 < this.f59832d) {
                    mo33122e(i3, 31, 32);
                }
                this.f59831c = false;
                this.f59830b = Integer.MAX_VALUE;
                mo33122e(this.f59832d, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C21157c cVar = list.get(i4);
                C21769k m = cVar.f59816a.mo34092m();
                C21769k kVar = cVar.f59817b;
                Integer num = C21158d.f59820b.get(m);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        C21157c[] cVarArr = C21158d.f59819a;
                        if (C20509c.m22203i(cVarArr[i2 - 1].f59817b, kVar)) {
                            i = i2;
                        } else if (C20509c.m22203i(cVarArr[i2].f59817b, kVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f59834f + 1;
                    int length = this.f59833e.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C20509c.m22203i(this.f59833e[i5].f59816a, m)) {
                            if (C20509c.m22203i(this.f59833e[i5].f59817b, kVar)) {
                                i2 = C21158d.f59819a.length + (i5 - this.f59834f);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f59834f) + C21158d.f59819a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo33122e(i2, 127, 128);
                } else if (i == -1) {
                    this.f59829a.mo34148q(64);
                    mo33120c(m);
                    mo33120c(kVar);
                    mo33119b(cVar);
                } else {
                    C21769k kVar2 = C21157c.f59810d;
                    m.getClass();
                    C87412m.m108594g(kVar2, "prefix");
                    if (!m.mo34090k(0, kVar2, 0, kVar2.mo34085f()) || C21157c.f59815i.equals(m)) {
                        mo33122e(i, 63, 64);
                        mo33120c(kVar);
                        mo33119b(cVar);
                    } else {
                        mo33122e(i, 15, 0);
                        mo33120c(kVar);
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo33122e(int i, int i2, int i3) {
            if (i < i2) {
                this.f59829a.mo34148q(i | i3);
                return;
            }
            this.f59829a.mo34148q(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f59829a.mo34148q(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f59829a.mo34148q(i4);
        }
    }

    static {
        C21157c cVar = new C21157c(C21157c.f59815i, "");
        int i = 0;
        C21769k kVar = C21157c.f59812f;
        C21769k kVar2 = C21157c.f59813g;
        C21769k kVar3 = C21157c.f59814h;
        C21769k kVar4 = C21157c.f59811e;
        C21157c[] cVarArr = {cVar, new C21157c(kVar, "GET"), new C21157c(kVar, "POST"), new C21157c(kVar2, "/"), new C21157c(kVar2, "/index.html"), new C21157c(kVar3, "http"), new C21157c(kVar3, (String) C113600ck.f339986i), new C21157c(kVar4, "200"), new C21157c(kVar4, "204"), new C21157c(kVar4, "206"), new C21157c(kVar4, "304"), new C21157c(kVar4, "400"), new C21157c(kVar4, "404"), new C21157c(kVar4, "500"), new C21157c("accept-charset", ""), new C21157c("accept-encoding", "gzip, deflate"), new C21157c("accept-language", ""), new C21157c("accept-ranges", ""), new C21157c("accept", ""), new C21157c("access-control-allow-origin", ""), new C21157c("age", ""), new C21157c("allow", ""), new C21157c((String) TencentMapServiceProtocol.SERVICE_NAME_AUTHORIZATION, ""), new C21157c("cache-control", ""), new C21157c("content-disposition", ""), new C21157c("content-encoding", ""), new C21157c("content-language", ""), new C21157c("content-length", ""), new C21157c("content-location", ""), new C21157c("content-range", ""), new C21157c("content-type", ""), new C21157c("cookie", ""), new C21157c((String) FFmpegMetadataRetriever.METADATA_KEY_DATE, ""), new C21157c("etag", ""), new C21157c("expect", ""), new C21157c("expires", ""), new C21157c("from", ""), new C21157c("host", ""), new C21157c("if-match", ""), new C21157c("if-modified-since", ""), new C21157c("if-none-match", ""), new C21157c("if-range", ""), new C21157c("if-unmodified-since", ""), new C21157c("last-modified", ""), new C21157c("link", ""), new C21157c((String) FirebaseAnalytics.C113379b.LOCATION, ""), new C21157c("max-forwards", ""), new C21157c("proxy-authenticate", ""), new C21157c("proxy-authorization", ""), new C21157c("range", ""), new C21157c("referer", ""), new C21157c("refresh", ""), new C21157c("retry-after", ""), new C21157c("server", ""), new C21157c("set-cookie", ""), new C21157c("strict-transport-security", ""), new C21157c("transfer-encoding", ""), new C21157c("user-agent", ""), new C21157c("vary", ""), new C21157c((String) OpenSDKTool4Assistant.EXTRA_VIA, ""), new C21157c("www-authenticate", "")};
        f59819a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        while (true) {
            C21157c[] cVarArr2 = f59819a;
            if (i < cVarArr2.length) {
                if (!linkedHashMap.containsKey(cVarArr2[i].f59816a)) {
                    linkedHashMap.put(cVarArr2[i].f59816a, Integer.valueOf(i));
                }
                i++;
            } else {
                f59820b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: a */
    public static C21769k m23574a(C21769k kVar) {
        int f = kVar.mo34085f();
        int i = 0;
        while (i < f) {
            byte i2 = kVar.mo34089i(i);
            if (i2 < 65 || i2 > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + kVar.mo34163n());
            }
        }
        return kVar;
    }
}
