package zl0;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.p946rw.logic.AbsNFCDiscoverable;
import com.tencent.p014mm.plugin.appbrand.utils.C84799z0;
import gy3.C87412m;

/* renamed from: zl0.d */
public final class C91772d extends AbsNFCDiscoverable {

    /* renamed from: g */
    public final NfcAdapter.ReaderCallback f262829g = new C91773a(this);

    /* renamed from: h */
    public volatile Tag f262830h;

    /* renamed from: zl0.d$a */
    public static final class C91773a implements NfcAdapter.ReaderCallback {

        /* renamed from: a */
        public final /* synthetic */ C91772d f262831a;

        public C91773a(C91772d dVar) {
            this.f262831a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
            r12 = (r12 = android.nfc.tech.Ndef.get(r12)).getCachedNdefMessage();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTagDiscovered(android.nfc.Tag r12) {
            /*
                r11 = this;
                zl0.d r0 = r11.f262831a
                java.util.Set<am0.b> r0 = r0.f242304c
                r0.clear()
                zl0.d r0 = r11.f262831a
                r0.f262830h = r12
                java.lang.String r0 = "MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl"
                if (r12 != 0) goto L_0x0016
                java.lang.String r12 = "onTagDiscovered, discoveredTag is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
                return
            L_0x0016:
                zl0.d r1 = r11.f262831a
                fy3.q<? super byte[], ? super java.util.List<java.lang.String>, ? super java.util.List<android.nfc.NdefMessage>, rx3.b0> r1 = r1.f242303b
                if (r1 != 0) goto L_0x0023
                java.lang.String r12 = "onTagDiscovered, onDiscoveryListener is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
                return
            L_0x0023:
                byte[] r2 = r12.getId()
                java.lang.String[] r3 = r12.getTechList()
                r4 = 0
                r5 = 0
                if (r3 == 0) goto L_0x004f
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r7 = r3.length
                r8 = 0
            L_0x0036:
                if (r8 >= r7) goto L_0x0050
                r9 = r3[r8]
                am0.b$a r10 = am0.C79589b.f233384h
                r10.getClass()
                java.util.Map<java.lang.String, java.lang.String> r10 = am0.C79589b.f233386j
                java.lang.Object r9 = r10.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x004c
                r6.add(r9)
            L_0x004c:
                int r8 = r8 + 1
                goto L_0x0036
            L_0x004f:
                r6 = r5
            L_0x0050:
                if (r6 == 0) goto L_0x0058
                boolean r3 = r6.isEmpty()
                if (r3 == 0) goto L_0x0059
            L_0x0058:
                r4 = 1
            L_0x0059:
                if (r4 == 0) goto L_0x0062
                java.lang.String r12 = "onTagDiscovered, techs is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
                return
            L_0x0062:
                am0.b r3 = am0.C79589b.NDEF
                java.lang.String r3 = r3.f233391d
                boolean r3 = r6.contains(r3)
                if (r3 == 0) goto L_0x007d
                android.nfc.tech.Ndef r12 = android.nfc.tech.Ndef.get(r12)
                if (r12 == 0) goto L_0x007d
                android.nfc.NdefMessage r12 = r12.getCachedNdefMessage()
                if (r12 == 0) goto L_0x007d
                java.util.List r12 = sx3.C26236u.m33719b(r12)
                goto L_0x007e
            L_0x007d:
                r12 = r5
            L_0x007e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onTagDiscovered, id: "
                r3.append(r4)
                if (r2 == 0) goto L_0x0095
                java.lang.String r5 = java.util.Arrays.toString(r2)
                java.lang.String r4 = "toString(this)"
                gy3.C87412m.m108593f(r5, r4)
            L_0x0095:
                r3.append(r5)
                java.lang.String r4 = ", techs: "
                r3.append(r4)
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                r1.invoke(r2, r6, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zl0.C91772d.C91773a.onTagDiscovered(android.nfc.Tag):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91772d(String str, C84799z0 z0Var) {
        super(str, z0Var);
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(z0Var, "activityProvider");
    }

    public Tag getTag() {
        return this.f262830h;
    }
}
