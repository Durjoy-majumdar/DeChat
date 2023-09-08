package p492dn;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p329d3.C86165a;
import rx3.C13598b0;

/* renamed from: dn.l */
public interface C107054l extends C7335d {

    /* renamed from: dn.l$a */
    public static final class C107055a {

        /* renamed from: a */
        public final int f320468a;

        /* renamed from: b */
        public final String f320469b;

        /* renamed from: c */
        public final int f320470c;

        public C107055a(int i, String str, int i2) {
            this.f320468a = i;
            this.f320469b = str;
            this.f320470c = i2;
        }

        /* renamed from: a */
        public final String mo157500a() {
            int i = this.f320468a;
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "BluetoothAndroid" : "Headphones" : "Receiver" : "Speaker";
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C107055a)) {
                return false;
            }
            C107055a aVar = (C107055a) obj;
            return this.f320468a == aVar.f320468a && C87412m.m108589b(this.f320469b, aVar.f320469b);
        }

        public int hashCode() {
            return (int) (((long) this.f320468a) + Util.currentTicks());
        }

        public String toString() {
            return "AudioRouteInfo(deviceType=" + this.f320468a + ", deviceName=" + this.f320469b + ", state=" + this.f320470c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C107055a(int i, String str, int i2, int i3, C8480h hVar) {
            this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 3 : i2);
        }
    }

    /* renamed from: dn.l$b */
    public static final class C107056b {
        /* renamed from: a */
        public static /* synthetic */ void m144939a(C107054l lVar, int i, C32224a aVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    aVar = null;
                }
                lVar.Qs0(i, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAudioMode");
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m144940b(C107054l lVar, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                return lVar.Jv0(i, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeToDevice");
        }
    }

    /* renamed from: Dx */
    boolean mo157460Dx();

    boolean Jv0(int i, boolean z);

    /* renamed from: Kq */
    void mo157462Kq(C86165a<C107055a> aVar);

    boolean Nc0();

    void Qs0(int i, C32224a<C13598b0> aVar);

    /* renamed from: YW */
    boolean mo157465YW(C107055a aVar, boolean z);

    /* renamed from: Yj */
    void mo157466Yj(Intent intent);

    /* renamed from: bJ */
    List<C107055a> mo157467bJ();

    /* renamed from: gQ */
    void mo157468gQ(C86165a<C107055a> aVar);

    /* renamed from: jQ */
    C107055a mo157469jQ();

    /* renamed from: ju */
    void mo157470ju();

    /* renamed from: n */
    boolean mo157471n();

    void nt0();

    /* renamed from: oz */
    boolean mo157473oz(int i);

    /* renamed from: qG */
    boolean mo157474qG();

    void release();

    /* renamed from: z4 */
    void mo157478z4(C107055a aVar);
}
