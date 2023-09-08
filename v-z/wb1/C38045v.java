package wb1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import pb1.C100759z0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import su0.C13781a;
import te3.C48744ao3;
import te3.C48887bo3;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: wb1.v */
public final class C38045v extends C86301e implements C100759z0 {

    /* renamed from: d */
    public final String f100576d = "MicroMsg.Fav.FavRecentlyUsedService";

    /* renamed from: e */
    public final int f100577e = 20;

    /* renamed from: f */
    public final C13601g f100578f = C36568h.m40985a(new C38046a(this));

    /* renamed from: g */
    public final String f100579g = "recentIds";

    /* renamed from: h */
    public C48887bo3 f100580h;

    /* renamed from: wb1.v$a */
    public static final class C38046a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public final /* synthetic */ C38045v f100581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38046a(C38045v vVar) {
            super(0);
            this.f100581d = vVar;
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV(this.f100581d.f100576d, 2);
        }
    }

    /* renamed from: Sj */
    public void mo61498Sj(Long l) {
        C48887bo3 vx02 = vx0();
        LinkedList<C48744ao3> linkedList = vx02.f131239d;
        C87412m.m108593f(linkedList, "list.list");
        for (C48744ao3 ao32 : linkedList) {
            long j = ao32.f130699d;
            if (l != null && j == l.longValue()) {
                vx02.f131239d.remove(ao32);
                C48887bo3 bo32 = this.f100580h;
                if (bo32 != null) {
                    Object value = ((C36570n) this.f100578f).getValue();
                    C87412m.m108593f(value, "<get-storage>(...)");
                    ((MultiProcessMMKV) value).encode(this.f100579g + C13781a.m13082a(), bo32.toByteArray());
                }
                String str = this.f100576d;
                Log.m105918d(str, "delete() called id:" + l);
                return;
            }
        }
    }

    /* renamed from: ni */
    public void mo61499ni(Long l) {
        long longValue = l.longValue();
        String str = this.f100576d;
        Log.m105918d(str, "record() called with: id = " + longValue);
        mo61498Sj(Long.valueOf(longValue));
        C48887bo3 vx02 = vx0();
        LinkedList<C48744ao3> linkedList = vx02.f131239d;
        C48744ao3 ao32 = new C48744ao3();
        ao32.f130699d = longValue;
        linkedList.offer(ao32);
        if (vx02.f131239d.size() > this.f100577e) {
            vx02.f131239d.poll();
        }
        C48887bo3 bo32 = this.f100580h;
        if (bo32 != null) {
            Object value = ((C36570n) this.f100578f).getValue();
            C87412m.m108593f(value, "<get-storage>(...)");
            ((MultiProcessMMKV) value).encode(this.f100579g + C13781a.m13082a(), bo32.toByteArray());
        }
    }

    public final C48887bo3 vx0() {
        C48887bo3 bo32 = this.f100580h;
        if (bo32 != null) {
            return bo32;
        }
        C48887bo3 bo33 = new C48887bo3();
        Object value = ((C36570n) this.f100578f).getValue();
        C87412m.m108593f(value, "<get-storage>(...)");
        byte[] decodeBytes = ((MultiProcessMMKV) value).decodeBytes(this.f100579g + C13781a.m13082a());
        if (decodeBytes != null) {
            bo33.parseFrom(decodeBytes);
        }
        this.f100580h = bo33;
        return bo33;
    }

    public ArrayList<Long> yq0() {
        C48887bo3 vx02 = vx0();
        ArrayList<Long> arrayList = new ArrayList<>();
        LinkedList<C48744ao3> linkedList = vx02.f131239d;
        C87412m.m108593f(linkedList, "list.list");
        for (C48744ao3 ao32 : linkedList) {
            arrayList.add(0, Long.valueOf(ao32.f130699d));
        }
        String str = this.f100576d;
        Log.m105918d(str, "getIds() called " + arrayList);
        return arrayList;
    }
}
