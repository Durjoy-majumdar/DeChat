package fh3;

import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import dh3.C116617e;
import dh3.C7330f;
import eh3.C116770b;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import sx3.C26236u;

/* renamed from: fh3.g */
public final class C116878g extends C116770b {

    /* renamed from: c */
    public final List<C116617e> f350302c = C26236u.m33719b(new C7330f(new C116879a(this), C116880b.f350304d));

    /* renamed from: fh3.g$a */
    public static final class C116879a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C116878g f350303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116879a(C116878g gVar) {
            super(0);
            this.f350303d = gVar;
        }

        public Object invoke() {
            return Long.valueOf(this.f350303d.f350089b);
        }
    }

    /* renamed from: fh3.g$b */
    public static final class C116880b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C116880b f350304d = new C116880b();

        public C116880b() {
            super(0);
        }

        public Object invoke() {
            return Long.valueOf(MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getLong(ConnectivityCompat.MMKV_KEY_SCAN_RESULT_UPDATE_TIME_STAMP, 0));
        }
    }

    /* renamed from: b */
    public List<C116617e> mo180749b() {
        return this.f350302c;
    }

    /* renamed from: c */
    public String mo180751c() {
        return "getScanResults";
    }
}
