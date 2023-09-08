package hn2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gy3.C87412m;
import java.io.File;
import java.util.List;
import sx3.C64197v;

/* renamed from: hn2.i */
public final class C8619i {

    /* renamed from: a */
    public static final C8619i f27728a = new C8619i();

    /* renamed from: b */
    public static final C86009m1 f27729b;

    /* renamed from: c */
    public static final List<Integer> f27730c = C64197v.m75537f(995, 996, 997);

    static {
        C86009m1 m1Var = new C86009m1(VFSStrategy.m163776d("qrcode"));
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        C86009m1 m1Var2 = new C86009m1(m1Var.mo119971i() + XVFSFile.SEPARATOR_CHAR + C86709a0.m107523b().mo121110g());
        if (!m1Var2.mo119967g()) {
            m1Var2.mo119987x();
        }
        f27729b = m1Var2;
    }

    /* renamed from: a */
    public final void mo9489a(int i) {
        Log.m105924i("MicroMsg.QRCodeCacheManager", "clearCache() called with: style = " + i);
        mo9490b(i);
        C86009m1[] u = f27729b.mo119984u();
        if (u != null) {
            for (C86009m1 m1Var : u) {
                if (m1Var.getName().equals(String.valueOf(i))) {
                    m1Var.mo119966f();
                    Log.m105924i("MicroMsg.QRCodeCacheManager", "clearCache success: style = " + i);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo9490b(int i) {
        MultiProcessMMKV.getMMKV("qrcode_url").remove(String.valueOf(i));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:26|27|(2:29|30)|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        f27728a.mo9490b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r0 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a A[SYNTHETIC, Splitter:B:34:0x005a] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo9491c(int r11) {
        /*
            r10 = this;
            java.util.List<java.lang.Integer> r0 = f27730c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            com.tencent.mm.vfs.m1 r0 = f27729b
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()
            if (r0 == 0) goto L_0x0061
            r2 = 0
            int r3 = r0.length
        L_0x0018:
            if (r2 >= r3) goto L_0x0061
            r4 = r0[r2]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = java.lang.String.valueOf(r11)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x005e
            boolean r5 = r4.mo119961a()
            if (r5 == 0) goto L_0x005e
            long r5 = r4.mo119980r()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x005e
            com.tencent.mm.vfs.p1 r0 = new com.tencent.mm.vfs.p1     // Catch:{ IOException -> 0x004c, all -> 0x004a }
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r4)     // Catch:{ IOException -> 0x004c, all -> 0x004a }
            byte[] r11 = cy3.C86147a.m106661c(r0)     // Catch:{ IOException -> 0x004d }
            r0.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r11
        L_0x0047:
            r11 = move-exception
            r1 = r0
            goto L_0x0058
        L_0x004a:
            r11 = move-exception
            goto L_0x0058
        L_0x004c:
            r0 = r1
        L_0x004d:
            hn2.i r2 = f27728a     // Catch:{ all -> 0x0047 }
            r2.mo9490b(r11)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0057
            r0.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            return r1
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            throw r11
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0061:
            r10.mo9490b(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hn2.C8619i.mo9491c(int):byte[]");
    }

    /* renamed from: d */
    public final String mo9492d(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107523b().mo121110g());
        sb.append('_');
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo9493e(int i) {
        C86009m1[] u;
        List<Integer> list = f27730c;
        String str = "";
        if (list.contains(Integer.valueOf(i))) {
            boolean z = false;
            if (list.contains(Integer.valueOf(i)) && (u = f27729b.mo119984u()) != null) {
                int length = u.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    C86009m1 m1Var = u[i2];
                    if (m1Var.getName().equals(String.valueOf(i)) && m1Var.mo119980r() > 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                String string = MultiProcessMMKV.getMMKV("qrcode_url").getString(mo9492d(i), str);
                if (string != null) {
                    str = string;
                }
                Log.m105924i("MicroMsg.QRCodeCacheManager", "getUrl() called return : " + str);
                return str;
            }
        }
        mo9489a(i);
        return str;
    }

    /* renamed from: f */
    public final void mo9494f(int i, String str, byte[] bArr) {
        C87412m.m108594g(str, "url");
        StringBuilder sb = new StringBuilder();
        sb.append("saveCache() called with: style = ");
        sb.append(i);
        sb.append(", url = ");
        sb.append(str);
        sb.append(", qrData = ");
        sb.append(bArr != null ? Integer.valueOf(bArr.length) : null);
        Log.m105924i("MicroMsg.QRCodeCacheManager", sb.toString());
        if (bArr != null) {
            if (!(bArr.length == 0) && f27730c.contains(Integer.valueOf(i))) {
                mo9489a(i);
                String valueOf = String.valueOf(i);
                MultiProcessMMKV.getMMKV("qrcode_url").putString(mo9492d(i), str);
                if (C86013q1.m106438T(f27729b.mo119971i() + File.separator + valueOf, bArr, 0, bArr.length) != 0) {
                    mo9490b(i);
                }
            }
        }
    }
}
