package com.tencent.p014mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import android.os.SystemClock;
import com.tencent.p014mm.ipcinvoker.extension.C80891a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import pe3.C47465a;
import u24.C90599h;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.n */
public final class C80933n implements C80891a {

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.n$a */
    public static final class C1263a {

        /* renamed from: a */
        public static final MultiProcessMMKV f10317a = MultiProcessMMKV.getMMKV("MicroMsg_XIPC_MMProtoBufTransfer");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0074 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56342a(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.readString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000c
            return r2
        L_0x000c:
            java.lang.String r1 = r9.readString()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            r5 = 0
            java.lang.String r6 = "MicroMsg.XIPC.MMProtoBufTransfer"
            if (r3 != 0) goto L_0x006b
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.ipcinvoker.wx_extension.C80933n.C1263a.f10317a
            r3 = 1048576(0x100000, float:1.469368E-39)
            byte[] r7 = r9.decodeBytes(r1)     // Catch:{ all -> 0x0048 }
            if (r7 != 0) goto L_0x003c
            java.lang.String r0 = "readFromParcel, NULL bytes, gProtoBufXProcessStore[%s]"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x003a }
            r4[r5] = r9     // Catch:{ all -> 0x003a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r4)     // Catch:{ all -> 0x003a }
            r9.removeValueForKey(r1)     // Catch:{ all -> 0x0039 }
            if (r7 == 0) goto L_0x0039
            int r0 = r7.length     // Catch:{ all -> 0x0039 }
            if (r0 < r3) goto L_0x0039
            r9.trim()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            return r2
        L_0x003a:
            r0 = move-exception
            goto L_0x004a
        L_0x003c:
            r9.removeValueForKey(r1)     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0074
            int r1 = r7.length     // Catch:{ all -> 0x0074 }
            if (r1 < r3) goto L_0x0074
            r9.trim()     // Catch:{ all -> 0x0074 }
            goto L_0x0074
        L_0x0048:
            r0 = move-exception
            r7 = r2
        L_0x004a:
            java.lang.String r4 = "readFromParcel"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x005e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r5)     // Catch:{ all -> 0x005e }
            r9.removeValueForKey(r1)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x005d
            int r0 = r7.length     // Catch:{ all -> 0x005d }
            if (r0 < r3) goto L_0x005d
            r9.trim()     // Catch:{ all -> 0x005d }
        L_0x005d:
            return r2
        L_0x005e:
            r0 = move-exception
            r9.removeValueForKey(r1)     // Catch:{ all -> 0x006a }
            if (r7 == 0) goto L_0x006a
            int r1 = r7.length     // Catch:{ all -> 0x006a }
            if (r1 < r3) goto L_0x006a
            r9.trim()     // Catch:{ all -> 0x006a }
        L_0x006a:
            throw r0
        L_0x006b:
            int r1 = r9.readInt()
            byte[] r7 = new byte[r1]
            r9.readByteArray(r7)
        L_0x0074:
            b34.a r9 = b34.C79664a.m96762j(r0)     // Catch:{ all -> 0x0085 }
            b34.a r9 = r9.mo109790c()     // Catch:{ all -> 0x0085 }
            java.lang.Object r9 = r9.f233575b     // Catch:{ all -> 0x0085 }
            pe3.a r9 = (pe3.C47465a) r9     // Catch:{ all -> 0x0085 }
            r9.parseFrom(r7)     // Catch:{ all -> 0x0085 }
            r2 = r9
            goto L_0x0090
        L_0x0085:
            r9 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r9
            java.lang.String r9 = "readFromParcel, e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r9, r0)
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ipcinvoker.wx_extension.C80933n.mo56342a(android.os.Parcel):java.lang.Object");
    }

    /* renamed from: b */
    public boolean mo56343b(Object obj) {
        return obj instanceof C47465a;
    }

    /* renamed from: c */
    public void mo56344c(Object obj, Parcel parcel) {
        byte[] bArr;
        if (obj == null) {
            parcel.writeString((String) null);
            return;
        }
        C47465a aVar = (C47465a) obj;
        parcel.writeString(aVar.getClass().getName());
        boolean z = true;
        boolean z2 = false;
        try {
            bArr = aVar.toByteArray();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.XIPC.MMProtoBufTransfer", "writeToParcel, e = %s", e);
            bArr = new byte[0];
        }
        MultiProcessMMKV multiProcessMMKV = C1263a.f10317a;
        if (bArr.length > 102400 && multiProcessMMKV != null) {
            try {
                long j = multiProcessMMKV.totalSize();
                if (j >= 20971520) {
                    Log.m105921e("MicroMsg.XIPC.MMProtoBufTransfer", "mmkv totalSize[%d] too large, skip use mmkv", Long.valueOf(j));
                } else {
                    String h = C90599h.m113515h(new String[]{MMApplicationContext.getProcessName(), obj.getClass().getName(), obj.hashCode() + "", SystemClock.elapsedRealtimeNanos() + ""}, "$");
                    multiProcessMMKV.encode(h, bArr);
                    if (multiProcessMMKV.containsKey(h)) {
                        parcel.writeString(h);
                        z2 = z;
                    }
                }
                z = false;
                z2 = z;
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.XIPC.MMProtoBufTransfer", th, "encode bytes to mmkv", new Object[0]);
            }
        }
        if (!z2) {
            parcel.writeString((String) null);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    public String getName() {
        return "com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer";
    }
}
