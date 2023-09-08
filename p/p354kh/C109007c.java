package p354kh;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p213oh.C11412b;
import p335eh.C107275e;
import p335eh.C20599b;
import p346hh.C20941j;

/* renamed from: kh.c */
public class C109007c {

    /* renamed from: j */
    public static int f326498j = 18432;

    /* renamed from: a */
    public int f326499a;

    /* renamed from: b */
    public int f326500b;

    /* renamed from: c */
    public int f326501c;

    /* renamed from: d */
    public int f326502d = 0;

    /* renamed from: e */
    public ArrayList<String> f326503e = new ArrayList<>();

    /* renamed from: f */
    public HashMap<String, C20941j> f326504f = new HashMap<>();

    /* renamed from: g */
    public HashMap<String, byte[]> f326505g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, Integer> f326506h = new HashMap<>();

    /* renamed from: i */
    public C109008f f326507i;

    public C109007c() {
        C21335b bVar = new C21335b();
        this.f326507i = bVar;
        if (bVar.f60319a == null) {
            bVar.f60319a = new C21338g();
        }
    }

    /* JADX WARNING: type inference failed for: r5v29, types: [hh.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo160122a(java.util.List<p335eh.C107275e> r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x000b
            return r0
        L_0x000b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r15.size()
            r3 = 1
            r4 = 0
            if (r2 <= r3) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            java.util.Iterator r15 = r15.iterator()
        L_0x001e:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x017f
            java.lang.Object r2 = r15.next()
            eh.e r2 = (p335eh.C107275e) r2
            if (r2 == 0) goto L_0x0171
            byte[] r5 = r2.f320943f
            if (r5 == 0) goto L_0x0171
            java.lang.String r5 = r2.f320938a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x003a
            goto L_0x0171
        L_0x003a:
            java.util.HashMap<java.lang.String, hh.j> r5 = r14.f326504f
            java.lang.String r6 = r2.f320938a
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x004f
            java.util.HashMap<java.lang.String, hh.j> r5 = r14.f326504f
            java.lang.String r6 = r2.f320938a
            java.lang.Object r5 = r5.get(r6)
            hh.j r5 = (p346hh.C20941j) r5
            goto L_0x006a
        L_0x004f:
            hh.h r5 = new hh.h
            java.lang.String r7 = r2.f320938a
            int r8 = r2.f320939b
            int r9 = r2.f320940c
            int r10 = r2.f320941d
            int r11 = r14.f326499a
            int r12 = r14.f326500b
            int r13 = r14.f326501c
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.util.HashMap<java.lang.String, hh.j> r6 = r14.f326504f
            java.lang.String r7 = r2.f320938a
            r6.put(r7, r5)
        L_0x006a:
            eh.e r6 = new eh.e
            r6.<init>()
            byte[] r7 = r2.f320943f
            byte[] r5 = r5.mo32679a(r7)
            r6.f320943f = r5
            java.lang.String r7 = r2.f320938a
            r6.f320938a = r7
            long r8 = r2.f320942e
            r6.f320942e = r8
            int r8 = r2.f320940c
            r6.f320940c = r8
            int r8 = r2.f320939b
            r6.f320939b = r8
            int r8 = r2.f320941d
            r6.f320941d = r8
            if (r3 == 0) goto L_0x015a
            if (r5 != 0) goto L_0x0091
            goto L_0x015a
        L_0x0091:
            int r8 = r5.length
            if (r8 != 0) goto L_0x0096
            goto L_0x015a
        L_0x0096:
            java.util.HashMap<java.lang.String, byte[]> r8 = r14.f326505g
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x00b7
            java.util.HashMap<java.lang.String, byte[]> r7 = r14.f326505g
            java.lang.String r8 = r6.f320938a
            java.lang.Object r7 = r7.get(r8)
            byte[] r7 = (byte[]) r7
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r14.f326506h
            java.lang.String r9 = r6.f320938a
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x00b9
        L_0x00b7:
            r7 = r0
            r8 = 0
        L_0x00b9:
            if (r8 <= 0) goto L_0x010c
            if (r7 == 0) goto L_0x010c
            int r9 = r5.length
            int r10 = f326498j
            int r10 = r10 - r8
            if (r9 > r10) goto L_0x00c9
            int r9 = r5.length
            java.lang.System.arraycopy(r5, r4, r7, r8, r9)
            int r5 = r5.length
            goto L_0x00cf
        L_0x00c9:
            java.lang.System.arraycopy(r5, r4, r7, r8, r10)
            int r5 = f326498j
            int r5 = r5 - r8
        L_0x00cf:
            int r8 = r8 + r5
            int r5 = r14.f326502d
            if (r8 <= r5) goto L_0x00ec
            int r8 = r8 - r5
            byte[] r9 = new byte[r5]
            java.lang.System.arraycopy(r7, r4, r9, r4, r5)
            r6.f320943f = r9
            byte[] r5 = new byte[r8]
            int r9 = r14.f326502d
            java.lang.System.arraycopy(r7, r9, r5, r4, r8)
            int r9 = f326498j
            java.util.Arrays.fill(r7, r4, r9, r4)
            java.lang.System.arraycopy(r5, r4, r7, r4, r8)
            goto L_0x00f9
        L_0x00ec:
            byte[] r5 = new byte[r5]
            java.lang.System.arraycopy(r7, r4, r5, r4, r8)
            r6.f320943f = r5
            int r5 = f326498j
            java.util.Arrays.fill(r7, r4, r5, r4)
            r8 = 0
        L_0x00f9:
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r14.f326506h
            java.lang.String r9 = r6.f320938a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.put(r9, r8)
            java.util.HashMap<java.lang.String, byte[]> r5 = r14.f326505g
            java.lang.String r8 = r6.f320938a
            r5.put(r8, r7)
            goto L_0x015a
        L_0x010c:
            int r8 = r5.length
            int r9 = r14.f326502d
            if (r8 >= r9) goto L_0x011d
            byte[] r7 = new byte[r9]
            java.util.Arrays.fill(r7, r4, r9, r4)
            int r8 = r5.length
            java.lang.System.arraycopy(r5, r4, r7, r4, r8)
            r6.f320943f = r7
            goto L_0x015a
        L_0x011d:
            int r8 = r5.length
            if (r8 <= r9) goto L_0x015a
            byte[] r8 = new byte[r9]
            java.util.Arrays.fill(r8, r4, r9, r4)
            int r9 = r14.f326502d
            java.lang.System.arraycopy(r5, r4, r8, r4, r9)
            r6.f320943f = r8
            if (r7 != 0) goto L_0x0138
            int r7 = r5.length
            int r8 = f326498j
            if (r7 <= r8) goto L_0x0134
            int r8 = r5.length
        L_0x0134:
            f326498j = r8
            byte[] r7 = new byte[r8]
        L_0x0138:
            int r8 = f326498j
            java.util.Arrays.fill(r7, r4, r8, r4)
            int r8 = r14.f326502d
            int r9 = r5.length
            int r9 = r9 - r8
            java.lang.System.arraycopy(r5, r8, r7, r4, r9)
            int r5 = r5.length
            int r8 = r14.f326502d
            int r5 = r5 - r8
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r14.f326506h
            java.lang.String r9 = r6.f320938a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.put(r9, r5)
            java.util.HashMap<java.lang.String, byte[]> r5 = r14.f326505g
            java.lang.String r8 = r6.f320938a
            r5.put(r8, r7)
        L_0x015a:
            byte[] r5 = r6.f320943f
            byte[] r2 = r2.f320943f
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x016f
            byte[] r2 = r6.f320943f
            int r5 = r2.length
            byte[] r5 = new byte[r5]
            int r7 = r2.length
            java.lang.System.arraycopy(r2, r4, r5, r4, r7)
            r6.f320943f = r5
        L_0x016f:
            r2 = r6
            goto L_0x017a
        L_0x0171:
            int r5 = p213oh.C11412b.f33577a
            java.lang.String r5 = "MicroMsg.Mix.AudioSyncMixController"
            java.lang.String r6 = "track or pcmData is null, or audioId is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r0)
        L_0x017a:
            r1.add(r2)
            goto L_0x001e
        L_0x017f:
            byte[] r15 = r14.mo160123b(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p354kh.C109007c.mo160122a(java.util.List):byte[]");
    }

    /* renamed from: b */
    public final byte[] mo160123b(List<C107275e> list) {
        if (list == null || list.isEmpty()) {
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioSyncMixController", "list is invalid", (Object[]) null);
            return null;
        } else if (list.size() == 1) {
            return list.get(0).f320943f;
        } else {
            C109008f fVar = this.f326507i;
            if (fVar == null) {
                int i2 = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioSyncMixController", "mixer is null", (Object[]) null);
                return null;
            }
            C20599b a = ((C21335b) fVar).mo33378a(list);
            if (a != null) {
                return a.f57998c;
            }
            return null;
        }
    }
}
