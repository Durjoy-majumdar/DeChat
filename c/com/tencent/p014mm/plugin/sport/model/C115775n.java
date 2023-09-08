package com.tencent.p014mm.plugin.sport.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C66723k;

/* renamed from: com.tencent.mm.plugin.sport.model.n */
public final class C115775n {

    /* renamed from: a */
    public static final C115775n f347342a = new C115775n();

    /* renamed from: b */
    public static final C13601g f347343b = C36568h.m40985a(C85481b.f249113d);

    /* renamed from: com.tencent.mm.plugin.sport.model.n$b */
    public static final class C85481b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C85481b f249113d = new C85481b();

        public C85481b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("SportKv", 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.model.n$a */
    public static final class C115776a {

        /* renamed from: a */
        public long f347344a;

        /* renamed from: b */
        public long f347345b;

        /* renamed from: c */
        public long f347346c;

        /* renamed from: d */
        public long f347347d;

        /* renamed from: e */
        public long f347348e;

        /* renamed from: f */
        public long f347349f;

        /* renamed from: g */
        public long f347350g;

        /* renamed from: a */
        public final void mo176133a(String str) {
            C87412m.m108594g(str, "detailInfoStr");
            Object[] array = new C66723k(",").mo90760e(str, 0).toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            try {
                if (!(!(strArr.length == 0)) || strArr.length < 7) {
                    Log.m105925i("MicroMsg.Sport.SportKvStorage", "invalid sport detail str %s", str);
                    return;
                }
                this.f347344a = Util.getLong(strArr[0], 0);
                this.f347345b = Util.getLong(strArr[1], 0);
                this.f347346c = Util.getLong(strArr[2], 0);
                this.f347347d = Util.getLong(strArr[3], 0);
                this.f347348e = Util.getLong(strArr[4], 0);
                this.f347349f = Util.getLong(strArr[5], 0);
                this.f347350g = Util.getLong(strArr[6], 0);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Sport.SportKvStorage", e, "fromStr:" + str + ' ', new Object[0]);
            }
        }

        public String toString() {
            String format = String.format("%d,%d,%d,%d,%d,%d,%d", Arrays.copyOf(new Object[]{Long.valueOf(this.f347344a), Long.valueOf(this.f347345b), Long.valueOf(this.f347346c), Long.valueOf(this.f347347d), Long.valueOf(this.f347348e), Long.valueOf(this.f347349f), Long.valueOf(this.f347350g)}, 7));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: a */
    public final long mo176128a(String str, long j) {
        C87412m.m108594g(str, "key");
        return mo176130c().decodeLong(str, j);
    }

    /* renamed from: b */
    public final C115776a mo176129b() {
        String decodeString = mo176130c().decodeString("KEY_STEP_DETAIL_INFO", "");
        C115776a aVar = new C115776a();
        C87412m.m108593f(decodeString, "infoStr");
        aVar.mo176133a(decodeString);
        Log.m105924i("MicroMsg.Sport.SportKvStorage", "getSportDetailInfo detailInfo:" + decodeString);
        return aVar;
    }

    /* renamed from: c */
    public final MultiProcessMMKV mo176130c() {
        return (MultiProcessMMKV) ((C36570n) f347343b).getValue();
    }

    /* renamed from: d */
    public final void mo176131d(String str, long j) {
        C87412m.m108594g(str, "key");
        mo176130c().encode(str, j);
    }

    /* renamed from: e */
    public final void mo176132e(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        mo176130c().encode(str, str2);
    }
}
