package com.tencent.p014mm.model.newabtest;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30728d;
import com.tencent.p014mm.storage.C96980c;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p823sg.C77710q;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.model.newabtest.e */
public final class C28984e extends C86301e {

    /* renamed from: e */
    public static final MStorage.IOnStorageChange f79481e = new C28987b();

    /* renamed from: d */
    public final C13601g f79482d = C36568h.m40985a(C28989d.f79485d);

    /* renamed from: com.tencent.mm.model.newabtest.e$a */
    public static final class C28985a implements C28990e {

        /* renamed from: a */
        public final C13601g f79483a = C36568h.m40985a(C28986a.f79484d);

        /* renamed from: com.tencent.mm.model.newabtest.e$a$a */
        public static final class C28986a extends C87413o implements C32224a<Integer> {

            /* renamed from: d */
            public static final C28986a f79484d = new C28986a();

            public C28986a() {
                super(0);
            }

            public Object invoke() {
                return Integer.valueOf(C86718e.m107549h());
            }
        }

        /* renamed from: a */
        public int mo56383a() {
            return ((Number) ((C36570n) this.f79483a).getValue()).intValue();
        }
    }

    /* renamed from: com.tencent.mm.model.newabtest.e$b */
    public static final class C28987b implements MStorage.IOnStorageChange {
        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (C87412m.m108589b("event_updated", str)) {
                C30728d wx02 = SubCoreNewABTest.wx0();
                C87412m.m108593f(wx02, "getABTestStorage()");
                ((C28984e) C86312j.m106911c(C28984e.class)).wx0(wx02);
            }
        }
    }

    /* renamed from: com.tencent.mm.model.newabtest.e$c */
    public static final class C28988c implements C28990e {
        /* renamed from: a */
        public int mo56383a() {
            return C86709a0.m107523b().mo121110g();
        }
    }

    /* renamed from: com.tencent.mm.model.newabtest.e$d */
    public static final class C28989d extends C87413o implements C32224a<C28990e> {

        /* renamed from: d */
        public static final C28989d f79485d = new C28989d();

        public C28989d() {
            super(0);
        }

        public Object invoke() {
            return C86709a0.m107531m().mo58407a().mo71804b() ? new C28988c() : new C28985a();
        }
    }

    /* renamed from: com.tencent.mm.model.newabtest.e$e */
    public interface C28990e {
        /* renamed from: a */
        int mo56383a();
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("onAccountInitialized uin[");
        String qVar = new C77710q(C86709a0.m107523b().mo121110g()).toString();
        C87412m.m108593f(qVar, "UIN(this).toString()");
        sb.append(qVar);
        sb.append(']');
        Log.m105924i("MicroMsg.PluginABTest.NewABTestMMKV", sb.toString());
        C30728d wx02 = SubCoreNewABTest.wx0();
        C87412m.m108593f(wx02, "getABTestStorage()");
        wx0(wx02);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
    }

    public final MultiProcessMMKV vx0() {
        StringBuilder sb = new StringBuilder();
        String qVar = new C77710q(((C28990e) ((C36570n) this.f79482d).getValue()).mo56383a()).toString();
        C87412m.m108593f(qVar, "UIN(this).toString()");
        sb.append(qVar);
        sb.append("_PluginABTest_NewABTestMMKV");
        return MultiProcessMMKV.getMMKV(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        cy3.C58003b.m67160a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[Catch:{ SQLiteException -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[Catch:{ SQLiteException -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void wx0(com.tencent.p014mm.storage.C30728d r8) {
        /*
            r7 = this;
            java.lang.String r0 = "storage"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r7.vx0()
            r0.clear()
            android.database.Cursor r8 = r8.getAll()
            if (r8 == 0) goto L_0x0065
            r1 = 0
            boolean r2 = r8.moveToFirst()     // Catch:{ all -> 0x005e }
            if (r2 != 0) goto L_0x001e
            cy3.C58003b.m67160a(r8, r1)
            return
        L_0x001e:
            com.tencent.mm.storage.c r2 = new com.tencent.mm.storage.c     // Catch:{ all -> 0x005e }
            r2.<init>()     // Catch:{ all -> 0x005e }
        L_0x0023:
            r2.convertFrom(r8)     // Catch:{ SQLiteException -> 0x003b }
            java.lang.String r3 = r2.field_layerId     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x0033
            int r3 = r3.length()     // Catch:{ all -> 0x005e }
            if (r3 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            if (r3 == 0) goto L_0x0037
            goto L_0x0052
        L_0x0037:
            r7.xx0(r2, r0)     // Catch:{ all -> 0x005e }
            goto L_0x0052
        L_0x003b:
            r3 = move-exception
            java.lang.String r4 = "MicroMsg.PluginABTest.NewABTestMMKV"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r5.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r6 = "resetAllExp, convertFrom cursor get exception:"
            r5.append(r6)     // Catch:{ all -> 0x005e }
            r5.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x005e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)     // Catch:{ all -> 0x005e }
        L_0x0052:
            boolean r3 = r8.moveToNext()     // Catch:{ all -> 0x005e }
            if (r3 != 0) goto L_0x0023
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005e }
            cy3.C58003b.m67160a(r8, r1)
            goto L_0x0065
        L_0x005e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            cy3.C58003b.m67160a(r8, r0)
            throw r1
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.model.newabtest.C28984e.wx0(com.tencent.mm.storage.d):void");
    }

    public final void xx0(C96980c cVar, MultiProcessMMKV multiProcessMMKV) {
        String str = "layer_" + cVar.field_layerId;
        multiProcessMMKV.putString(str + "_rawXML", cVar.field_rawXML);
        multiProcessMMKV.putLong(str + "_startTime", cVar.field_startTime);
        multiProcessMMKV.putLong(str + "_endTime", cVar.field_endTime);
    }
}
