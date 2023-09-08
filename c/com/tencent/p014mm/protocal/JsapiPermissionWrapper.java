package com.tencent.p014mm.protocal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.tencent.mm.protocal.JsapiPermissionWrapper */
public class JsapiPermissionWrapper implements Parcelable {
    public static final Parcelable.Creator<JsapiPermissionWrapper> CREATOR = new C44641a();

    /* renamed from: h */
    public static final JsapiPermissionWrapper f121047h = new JsapiPermissionWrapper(1);

    /* renamed from: d */
    public byte[] f121048d;

    /* renamed from: e */
    public int f121049e;

    /* renamed from: f */
    public Set<Integer> f121050f;

    /* renamed from: g */
    public Set<Integer> f121051g;

    /* renamed from: com.tencent.mm.protocal.JsapiPermissionWrapper$a */
    public class C44641a implements Parcelable.Creator<JsapiPermissionWrapper> {
        public Object createFromParcel(Parcel parcel) {
            return new JsapiPermissionWrapper(parcel, (C44641a) null);
        }

        public Object[] newArray(int i) {
            return new JsapiPermissionWrapper[i];
        }
    }

    public JsapiPermissionWrapper() {
        this.f121049e = 0;
        this.f121048d = null;
    }

    /* renamed from: a */
    public JsapiPermissionWrapper clone() {
        Parcel parcel;
        try {
            parcel = Parcel.obtain();
            try {
                parcel.writeParcelable(this, 0);
                parcel.setDataPosition(0);
                JsapiPermissionWrapper jsapiPermissionWrapper = (JsapiPermissionWrapper) parcel.readParcelable(JsapiPermissionWrapper.class.getClassLoader());
                parcel.recycle();
                return jsapiPermissionWrapper;
            } catch (Throwable th) {
                th = th;
                parcel.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            parcel = null;
            parcel.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo69440b(Bundle bundle) {
        this.f121048d = bundle.getByteArray("jsapi_perm_wrapper_bytes");
        this.f121049e = bundle.getInt("jsapi_perm_wrapper_hardcodePermission");
        mo69448g(bundle.getIntArray("jsapi_perm_wrapper_blacklist"));
        mo69450i(bundle.getIntArray("jsapi_perm_wrapper_whitelist"));
    }

    /* renamed from: c */
    public int[] mo69441c() {
        Set<Integer> set = this.f121050f;
        if (set == null) {
            return new int[0];
        }
        int[] iArr = new int[((HashSet) set).size()];
        Iterator it = ((HashSet) this.f121050f).iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int i2 = i + 1;
            iArr[i] = num == null ? 0 : num.intValue();
            i = i2;
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo69443d(int r10) {
        /*
            r9 = this;
            java.util.Set<java.lang.Integer> r0 = r9.f121051g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return r2
        L_0x0018:
            java.util.Set<java.lang.Integer> r0 = r9.f121050f
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x002e
            return r1
        L_0x002e:
            int r0 = r9.f121049e
            java.lang.String r3 = "on reserved bytes control : %d"
            r4 = 75
            java.lang.String r5 = "MicroMsg.JsapiPermissionWrapper"
            r6 = 34
            if (r0 != r2) goto L_0x004c
            if (r10 == r6) goto L_0x0040
            if (r10 != r4) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            return r2
        L_0x0040:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0[r1] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r0)
            return r1
        L_0x004c:
            r7 = 2
            r8 = -3
            if (r0 != r7) goto L_0x0054
            if (r10 != r8) goto L_0x0053
            return r2
        L_0x0053:
            return r1
        L_0x0054:
            r7 = 3
            if (r0 != r7) goto L_0x006d
            if (r10 == r6) goto L_0x0061
            if (r10 == r4) goto L_0x0061
            r0 = 23
            if (r10 != r0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            return r2
        L_0x0061:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0[r1] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r0)
            return r1
        L_0x006d:
            r3 = 4
            if (r0 != r3) goto L_0x0084
            if (r10 == r6) goto L_0x0076
            if (r10 != r4) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            return r2
        L_0x0076:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0[r1] = r10
            java.lang.String r10 = "hy: on reserved bytes control : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r0)
            return r1
        L_0x0084:
            r0 = -2
            if (r10 == r0) goto L_0x0098
            if (r10 != r8) goto L_0x008a
            goto L_0x0098
        L_0x008a:
            byte[] r0 = r9.f121048d
            if (r0 == 0) goto L_0x0097
            if (r10 < 0) goto L_0x0097
            int r2 = r0.length
            if (r10 < r2) goto L_0x0094
            goto L_0x0097
        L_0x0094:
            byte r10 = r0[r10]
            return r10
        L_0x0097:
            return r1
        L_0x0098:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.protocal.JsapiPermissionWrapper.mo69443d(int):int");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int[] mo69445e() {
        Set<Integer> set = this.f121051g;
        if (set == null) {
            return new int[0];
        }
        int[] iArr = new int[((HashSet) set).size()];
        Iterator it = ((HashSet) this.f121051g).iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int i2 = i + 1;
            iArr[i] = num == null ? 0 : num.intValue();
            i = i2;
        }
        return iArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JsapiPermissionWrapper)) {
            return false;
        }
        JsapiPermissionWrapper jsapiPermissionWrapper = (JsapiPermissionWrapper) obj;
        byte[] bArr = this.f121048d;
        byte[] bArr2 = jsapiPermissionWrapper.f121048d;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.f121048d;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr3[i] != jsapiPermissionWrapper.f121048d[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: f */
    public boolean mo69447f(int i) {
        return mo69443d(i) == 1;
    }

    /* renamed from: g */
    public void mo69448g(int[] iArr) {
        Set<Integer> set = this.f121050f;
        if (set == null) {
            this.f121050f = new HashSet();
        } else {
            set.clear();
        }
        if (iArr != null && iArr.length > 0) {
            for (int valueOf : iArr) {
                this.f121050f.add(Integer.valueOf(valueOf));
            }
        }
    }

    /* renamed from: h */
    public synchronized void mo69449h(int i, byte b) {
        byte[] bArr = this.f121048d;
        if (bArr != null) {
            if (i >= 0) {
                if (i >= bArr.length) {
                    Log.m105929w("MicroMsg.JsapiPermissionWrapper", "setPermission append pos out of range, %s, %s", Integer.valueOf(i), Integer.valueOf(this.f121048d.length));
                    byte[] bArr2 = new byte[(i + 1)];
                    Arrays.fill(bArr2, (byte) 2);
                    byte[] bArr3 = this.f121048d;
                    System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                    this.f121048d = bArr2;
                }
                this.f121048d[i] = b;
                return;
            }
        }
        Log.m105921e("MicroMsg.JsapiPermissionWrapper", "setPermission pos out of range, %s", Integer.valueOf(i));
    }

    /* renamed from: i */
    public void mo69450i(int[] iArr) {
        Set<Integer> set = this.f121051g;
        if (set == null) {
            this.f121051g = new HashSet();
        } else {
            set.clear();
        }
        if (iArr != null && iArr.length > 0) {
            for (int valueOf : iArr) {
                this.f121051g.add(Integer.valueOf(valueOf));
            }
        }
    }

    public String toString() {
        if (this.f121048d == null) {
            return "null";
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(180);
        for (byte append : this.f121048d) {
            sb.append(append);
        }
        String sb4 = sb.toString();
        Log.m105919d("MicroMsg.JsapiPermissionWrapper", "toString cost %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return sb4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f121048d);
        parcel.writeInt(this.f121049e);
        parcel.writeIntArray(mo69441c());
        parcel.writeIntArray(mo69445e());
    }

    public JsapiPermissionWrapper(byte[] bArr) {
        this.f121048d = null;
        this.f121049e = 0;
        if (bArr == null) {
            this.f121048d = null;
        } else {
            this.f121048d = bArr;
        }
    }

    public JsapiPermissionWrapper(int i) {
        this.f121049e = i;
        this.f121048d = new byte[0];
    }

    public JsapiPermissionWrapper(Parcel parcel, C44641a aVar) {
        this.f121048d = null;
        this.f121049e = 0;
        this.f121048d = parcel.createByteArray();
        this.f121049e = parcel.readInt();
        mo69448g(parcel.createIntArray());
        mo69450i(parcel.createIntArray());
    }
}
