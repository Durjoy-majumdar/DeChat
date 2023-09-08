package p953d8;

import android.util.SparseArray;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p333e8.C20528a;
import p333e8.C20551y;
import p333e8.C86461b;
import p333e8.C86465q;
import p953d8.C86199a;

/* renamed from: d8.j */
public class C86213j {

    /* renamed from: a */
    public final HashMap<String, C86212i> f250764a;

    /* renamed from: b */
    public final SparseArray<String> f250765b;

    /* renamed from: c */
    public final C86461b f250766c;

    /* renamed from: d */
    public final Cipher f250767d;

    /* renamed from: e */
    public final SecretKeySpec f250768e;

    /* renamed from: f */
    public final boolean f250769f;

    /* renamed from: g */
    public boolean f250770g;

    /* renamed from: h */
    public C86465q f250771h;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:2|(1:4)(1:5)|6|7|8|9|(4:11|12|13|16)|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C86213j(java.io.File r3, byte[] r4, boolean r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.f250769f = r5
            if (r4 == 0) goto L_0x003a
            int r5 = r4.length
            r0 = 16
            if (r5 != r0) goto L_0x000e
            r5 = 1
            goto L_0x000f
        L_0x000e:
            r5 = 0
        L_0x000f:
            p333e8.C20528a.m22237a(r5)
            int r5 = p333e8.C20551y.f57835a     // Catch:{ NoSuchAlgorithmException -> 0x0033, NoSuchPaddingException -> 0x0031 }
            java.lang.String r0 = "AES/CBC/PKCS5PADDING"
            r1 = 18
            if (r5 != r1) goto L_0x0021
            java.lang.String r5 = "BC"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0, r5)     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0033, NoSuchPaddingException -> 0x0031 }
        L_0x0025:
            r2.f250767d = r5     // Catch:{ NoSuchAlgorithmException -> 0x0033, NoSuchPaddingException -> 0x0031 }
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec     // Catch:{ NoSuchAlgorithmException -> 0x0033, NoSuchPaddingException -> 0x0031 }
            java.lang.String r0 = "AES"
            r5.<init>(r4, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0033, NoSuchPaddingException -> 0x0031 }
            r2.f250768e = r5     // Catch:{ NoSuchAlgorithmException -> 0x0033, NoSuchPaddingException -> 0x0031 }
            goto L_0x003f
        L_0x0031:
            r3 = move-exception
            goto L_0x0034
        L_0x0033:
            r3 = move-exception
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L_0x003a:
            r4 = 0
            r2.f250767d = r4
            r2.f250768e = r4
        L_0x003f:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.f250764a = r4
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r2.f250765b = r4
            e8.b r4 = new e8.b
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "cached_content_index.exi"
            r5.<init>(r3, r0)
            r4.<init>(r5)
            r2.f250766c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p953d8.C86213j.<init>(java.io.File, byte[], boolean):void");
    }

    /* renamed from: a */
    public final C86212i mo120638a(String str, long j) {
        SparseArray<String> sparseArray = this.f250765b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        C86212i iVar = new C86212i(keyAt, str, j);
        this.f250764a.put(str, iVar);
        this.f250765b.put(keyAt, str);
        this.f250770g = true;
        return iVar;
    }

    /* renamed from: b */
    public C86212i mo120639b(String str) {
        return this.f250764a.get(str);
    }

    /* renamed from: c */
    public void mo120640c() {
        LinkedList linkedList = new LinkedList();
        for (C86212i next : this.f250764a.values()) {
            if (next.f250762c.isEmpty()) {
                linkedList.add(next.f250761b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C86212i remove = this.f250764a.remove((String) it.next());
            if (remove != null) {
                C20528a.m22240d(remove.f250762c.isEmpty());
                this.f250765b.remove(remove.f250760a);
                this.f250770g = true;
            }
        }
    }

    /* renamed from: d */
    public void mo120641d() {
        DataOutputStream dataOutputStream;
        IOException e;
        if (this.f250770g) {
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream b = this.f250766c.mo120881b();
                C86465q qVar = this.f250771h;
                if (qVar == null) {
                    this.f250771h = new C86465q(b);
                } else {
                    qVar.mo120888a(b);
                }
                dataOutputStream = new DataOutputStream(this.f250771h);
                try {
                    dataOutputStream.writeInt(1);
                    boolean z = this.f250769f && this.f250767d != null;
                    dataOutputStream.writeInt(z ? 1 : 0);
                    if (z) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.f250767d.init(1, this.f250768e, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f250771h, this.f250767d));
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidAlgorithmParameterException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(this.f250764a.size());
                    int i = 0;
                    for (C86212i next : this.f250764a.values()) {
                        dataOutputStream2.writeInt(next.f250760a);
                        dataOutputStream2.writeUTF(next.f250761b);
                        dataOutputStream2.writeLong(next.f250763d);
                        long j = next.f250763d;
                        i += (((next.f250760a * 31) + next.f250761b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
                    }
                    dataOutputStream2.writeInt(i);
                    C86461b bVar = this.f250766c;
                    bVar.getClass();
                    dataOutputStream2.close();
                    bVar.f251255b.delete();
                    int i2 = C20551y.f57835a;
                    this.f250770g = false;
                } catch (IOException e4) {
                    e = e4;
                    try {
                        throw new C86199a.C86200a(e);
                    } catch (Throwable th) {
                        th = th;
                        C20551y.m22315e(dataOutputStream);
                        throw th;
                    }
                }
            } catch (IOException e5) {
                IOException iOException = e5;
                dataOutputStream = dataOutputStream2;
                e = iOException;
                throw new C86199a.C86200a(e);
            } catch (Throwable th4) {
                Throwable th5 = th4;
                dataOutputStream = dataOutputStream2;
                th = th5;
                C20551y.m22315e(dataOutputStream);
                throw th;
            }
        }
    }
}
